package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyContactsDetailsEntity;
import com.aqm.staf.library.databin.PolicyApprovalEntity;
import com.aqm.staf.library.databin.TransferToApEntity;

public class PolicyTransferToAp extends BasePage {
	private PageElement titleTransfertoAp;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement transferToApCheckBox;
	private PageElement productLabel;
	private PageElement transferButton;
	private PageElement policyTabTitle;

	private PageElement backButton;

	public PolicyTransferToAp(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "No."))," Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Status")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Policyholder")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Product"))," Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transferToApCheckBox= new PageElement(By.id("Chk"),"Transfer Check Box", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transferButton=new PageElement(By.name("Transfer"), "Transfer Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//1 table Present
	}
	public void fillTransferedToApDetails(TransferToApEntity transferToApEntity, CustomAssert assertReference){
		if(transferToApEntity.getAction().equalsIgnoreCase("add")){

			if (transferToApEntity.getBooleanValueForField("ConfigTransferToApCheck")) {
				checkOrUncheck(transferToApCheckBox,transferToApEntity.getBooleanValueForField("TransferToApCheck"));
			}
			
		}
		else if(transferToApEntity.getAction().equalsIgnoreCase("verify")){
			TransferToApEntity actualtransferToApEntityEntity=new TransferToApEntity();
			if (transferToApEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualtransferToApEntityEntity.setStringValueForField("PolicyNo", fetchValueFromTextFields(policyNoLabel));
				assertReference.assertEquals(transferToApEntity.getStringValueForField("PolicyNo"), actualtransferToApEntityEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}
			if (transferToApEntity.getBooleanValueForField("ConfigStatus")) {
				actualtransferToApEntityEntity.setStringValueForField("Status", fetchValueFromTextFields(statusLabel));
				assertReference.assertEquals(transferToApEntity.getStringValueForField("Status"), actualtransferToApEntityEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (transferToApEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualtransferToApEntityEntity.setStringValueForField("Policyholder", fetchValueFromTextFields(policyholderLabel));
				assertReference.assertEquals(transferToApEntity.getStringValueForField("Policyholder"), actualtransferToApEntityEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (transferToApEntity.getBooleanValueForField("ConfigProduct")) {
				actualtransferToApEntityEntity.setStringValueForField("Product", fetchValueFromTextFields(productLabel));
				assertReference.assertEquals(transferToApEntity.getStringValueForField("Product"), actualtransferToApEntityEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
		}
	}
	public void saveTransferToAp(){
			
		click(transferButton);
			
			
	}
	public void navigateToback(){
		click(backButton);
		switchToFrame("display");
		if(isElementDisplayed(policyTabTitle));
		return;			
		
}
	 public void fillandSubmitTransferToTpDetails(TransferToApEntity transferToApEntity, CustomAssert assertReference) {
		 fillTransferedToApDetails(transferToApEntity, assertReference);
		 saveTransferToAp();
		 navigateToback();
	    }
}
