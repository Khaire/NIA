package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimTransferToAPEntity;
import com.aqm.staf.library.databin.PolTransferToAPEntity;

public class PolicyTransferToAP extends BasePage {

	private PageElement VoucherCheckBox;
	private PageElement productLabel; 
	private PageElement policyNumberLabel;
	private PageElement statusLabel; 
	private PageElement policyHolderLabel;
	private PageElement transferButton; 
	private PageElement backButton;
	private PageElement checkBox;
	private PageElement voucherNoLabel;

	public PolicyTransferToAP(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyNumberLabel=new PageElement(By.xpath("//td//b[contains(text(),'No')]/following::td"), "policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transferButton=	new PageElement(By.name("Transfer"),  "Transfer TO AP Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=	new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		checkBox=new PageElement(By.name("pCheckBox"), "Voucher Row Selection Checkbox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		voucherNoLabel=new PageElement(By.xpath("//td[contains(text(),'REFUND')]/following::td"), "voucher No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}




	public void fillPolicyTransferToAP(PolTransferToAPEntity polTransferToAPEntityListdata, CustomAssert assertReference) throws InterruptedException {

		if(polTransferToAPEntityListdata.getAction().equalsIgnoreCase("edit")){
			if (polTransferToAPEntityListdata.getBooleanValueForField("ConfigVoucherCheckBox")) {
				Thread.sleep(2000);
				check(checkBox);
			}
		}

		else if(polTransferToAPEntityListdata.getAction().equalsIgnoreCase("verify")){
			
			if (polTransferToAPEntityListdata.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(polTransferToAPEntityListdata.getStringValueForField("ProductCode"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polTransferToAPEntityListdata.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(polTransferToAPEntityListdata.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (polTransferToAPEntityListdata.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polTransferToAPEntityListdata.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polTransferToAPEntityListdata.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polTransferToAPEntityListdata.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}

		}
	}

	public void clickOnTransferButton(PolTransferToAPEntity polTransferToAPEntity) throws InterruptedException{
		if (polTransferToAPEntity.getBooleanValueForField("ConfigTransferButton")){
			click(transferButton);
		}
	}

	public void clickOnBackButton(PolTransferToAPEntity polTransferToAPEntity) throws InterruptedException{
		if (polTransferToAPEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			Thread.sleep(2000);
			switchToWindow();
			switchToFrame("display");
		}
	}
	
	public void fetchVoucherNo(PolTransferToAPEntity polTransferToAPEntity) throws InterruptedException{
		if (polTransferToAPEntity.getBooleanValueForField("ConfigFetchVoucherNo")){
			polTransferToAPEntity.setStringValueForField("VoucherNo", fetchValueFromFields(voucherNoLabel));
		}
	}

	public void fillAndSubmitClaimTransferToAP(PolTransferToAPEntity polTransferToAPEntityListdata,CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(polTransferToAPEntityListdata.getConfigExecute())){
			fillPolicyTransferToAP(polTransferToAPEntityListdata, assertReference);
			fetchVoucherNo(polTransferToAPEntityListdata);
			clickOnTransferButton(polTransferToAPEntityListdata);
			clickOnBackButton(polTransferToAPEntityListdata);
		}
	}


}



