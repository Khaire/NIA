package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimLitigationEntity;
import com.aqm.staf.library.databin.ClaimTransferToAPEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;

public class ClaimTransferToAPPage  extends BasePage{
	private PageElement transferToAPPageTitle;	
	
	private PageElement claimVoucherCheckBox;
	private PageElement claimNumberLabel; 
	private PageElement claimLossDateLabel; 
	private PageElement productcodeLabel; 
	private PageElement policyNumberLabel; 
	private PageElement claimStatusLabel; 
	private PageElement claimcausecodeLabel; 
	private PageElement iNOUTLabel; 
	private PageElement stakecodeLabel; 
	private PageElement partycodeLabel; 
	private PageElement partyNameLabel; 
	private PageElement voucherNumberLabel; 
	private PageElement invoiceAmountLabel; 
	private PageElement approvalDateLabel; 
	private PageElement tDSAmountLabel; 
	private PageElement paidAmountLabel; 
	private PageElement pendingAmountLabel; 
	private PageElement transferStatusLabel; 
	private PageElement transferButton; 
	private PageElement backButton; 

	public ClaimTransferToAPPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		transferToAPPageTitle =new PageElement(By.xpath("//td//b[contains(text(),'ClaimPayableVoucherList')]"), "Claim Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		claimVoucherCheckBox = new PageElement(By.name("pCheckBox"), "Voucher Row Selection Checkbox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimNumberLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Claim Number')]/following::td"), "Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimLossDateLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Claim Loss Date')]/following::td"), "Claim Loss Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productcodeLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Product Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Policy Number')]/following::td"), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Claim Status')]/following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimcausecodeLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Claim Cause Code')]/following::td"), "Claim Cause Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iNOUTLabel			= new PageElement(By.xpath("//td//b[contains(text(),'IN/OUT')]/following::font"), "IN/OUT Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakecodeLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Stake Code')]/following::font[2]"), "Stake Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partycodeLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Party Code')]/following::font[3]"), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Party Name')]/following::font[4]"), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherNumberLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Voucher Number')]/following::font[5]"), "Voucher Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceAmountLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Invoice Amount')]/following::font[6]"), "Invoice Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		approvalDateLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Approval Date')]/following::font[7]"), "Approval Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tDSAmountLabel		= new PageElement(By.xpath("//td//b[contains(text(),'TDS Amount')]/following::font[8]"), "TDS Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paidAmountLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Paid Amount')]/following::font[9]"), "Paid Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pendingAmountLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Pending Amount')]/following::font[10]"), "Pending Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transferStatusLabel	= new PageElement(By.xpath("//td//b[contains(text(),'Transfer Status')]/following::font[11]"), "Transfer Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
		transferButton		=	new PageElement(By.name("Transfer"),  "Transfer TO AP Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton			=	new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				
	}
	
	public void fillClaimTransferToAP(ClaimTransferToAPEntity claimTransferToAPEntityListdata, CustomAssert assertReference) throws InterruptedException {
		
		if(claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("edit")){
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigVoucherCheckBox")) {
				Thread.sleep(2000);
				check(claimVoucherCheckBox);
			}
		}
		
		else if(claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("verify")){
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigClaimNumber")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigClaimLossDate")) {
			    assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimTransferToAPEntityListdata.getStringValueForField("ClaimLossDate")), fetchValueFromFields(claimLossDateLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigProductCode")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("ProductCode"), fetchValueFromFields(productcodeLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigPolicyNumber")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigClaimStatus")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigClaimCauseCode")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("ClaimCauseCode"), fetchValueFromFields(claimcausecodeLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigINOUT")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("INOUT"), fetchValueFromFields(iNOUTLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigStakeCode")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("StakeCode"), fetchValueFromFields(stakecodeLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigPartyCode")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("PartyCode"), fetchValueFromFields(partycodeLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigPartyName")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigVoucherNumber")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("VoucherNumber"), fetchValueFromFields(voucherNumberLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigInvoiceAmount")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("InvoiceAmount"), fetchValueFromFields(invoiceAmountLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigApprovalDate")) {
			    assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimTransferToAPEntityListdata.getStringValueForField("ApprovalDate")), fetchValueFromFields(approvalDateLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigTDSAmount")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("TDSAmount"), fetchValueFromFields(tDSAmountLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigPaidAmount")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("PaidAmount"), fetchValueFromFields(paidAmountLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigPendingAmount")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("PendingAmount"), fetchValueFromFields(pendingAmountLabel), AssertionType.WARNING);
			}
			if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigTransferStatus")) {
			    assertReference.assertEquals(claimTransferToAPEntityListdata.getStringValueForField("TransferStatus"), fetchValueFromFields(transferStatusLabel), AssertionType.WARNING);
			}
		
		}
	}
	
	public void clickOnTransferButton(ClaimTransferToAPEntity claimTransferToAPEntityListdata) throws InterruptedException{
		if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigTransferButton")){
			click(transferButton);
			//switchToFrame("display");
		}
	}
	
	public void clickOnBackButton(ClaimTransferToAPEntity claimTransferToAPEntityListdata) throws InterruptedException{
		if (claimTransferToAPEntityListdata.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			Thread.sleep(2000);
			switchToWindow();
			switchToFrame("display");
		}
	}

	public void fillAndSubmitClaimTransferToAP(ClaimTransferToAPEntity claimTransferToAPEntityListdata,CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimTransferToAPEntityListdata.getConfigExecute())){
			//switchToFrame("display");
			fillClaimTransferToAP(claimTransferToAPEntityListdata, assertReference);
			clickOnTransferButton(claimTransferToAPEntityListdata);
			clickOnBackButton(claimTransferToAPEntityListdata);
		}
	}
	
	
}

