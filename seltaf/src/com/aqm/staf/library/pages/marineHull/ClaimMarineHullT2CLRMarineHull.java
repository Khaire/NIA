package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MarineHullT2CLREntity;
import com.aqm.staf.library.databin.PolInsIntFleetDMHEntity;

public class ClaimMarineHullT2CLRMarineHull extends BasePage {
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement claimRiskDtls2Title;
	private PageElement backButton;
	private PageElement forwardButton;

	//CP-Yogesh
	private PageElement  totalSumInsuredTextField;	 
	private PageElement  sueAndLabourChargesTextField;	 
	private PageElement  totalDeductibleAmountTextField;	 
	//CL-Repeated

	public ClaimMarineHullT2CLRMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//CP-Yogesh
		totalSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured.')]/following::input"), "Total Sum Insured. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sueAndLabourChargesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sue and Labour Charges')]/following::input"), "Sue and Labour Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalDeductibleAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Deductible Amount')]/following::input"), "Total Deductible Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillClaimMarineHullT2CLRMarineHull(MarineHullT2CLREntity marineHullT2CLREntity, CustomAssert assertReference) throws InterruptedException{
		if(marineHullT2CLREntity.getAction().equalsIgnoreCase("add") || marineHullT2CLREntity.getAction().equalsIgnoreCase("edit")){

			//CP-Yogesh
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				clearAndSendKeys(totalSumInsuredTextField, marineHullT2CLREntity.getStringValueForField("TotalSumInsured"));
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigSueAndLabourCharges")) {
				clearAndSendKeys(sueAndLabourChargesTextField, marineHullT2CLREntity.getStringValueForField("SueAndLabourCharges"));
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				clearAndSendKeys(totalDeductibleAmountTextField, marineHullT2CLREntity.getStringValueForField("TotalDeductibleAmount"));
			}
		}
		else if(marineHullT2CLREntity.getAction().equalsIgnoreCase("verify")){
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//CP-Yogesh
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigSueAndLabourCharges")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("SueAndLabourCharges"), fetchValueFromTextFields(sueAndLabourChargesTextField), AssertionType.WARNING);
			}
			if (marineHullT2CLREntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				assertReference.assertEquals(marineHullT2CLREntity.getStringValueForField("TotalDeductibleAmount"), fetchValueFromTextFields(totalDeductibleAmountTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToMainAttributePage(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetails(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void navigateToclaimHomePage(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}
	public void navigateToInsuredItem(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPayment(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(MarineHullT2CLREntity marineHullT2CLREntity){
		if (marineHullT2CLREntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimRiskDetailsDeclNoMarineCargo(MarineHullT2CLREntity marineHullT2CLREntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(marineHullT2CLREntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimMarineHullT2CLRMarineHull(marineHullT2CLREntity, assertReference);
			navigateToMainAttributePage(marineHullT2CLREntity);
			navigateToclaimHomePage(marineHullT2CLREntity);
			navigateToInsuredItem(marineHullT2CLREntity);
			navigateToDocument(marineHullT2CLREntity);
			navigateToParties(marineHullT2CLREntity);
			navigateToReserve(marineHullT2CLREntity);
			navigateToPayment(marineHullT2CLREntity);
			navigateToAttribute(marineHullT2CLREntity);
			navigateToInsuredItemDetails(marineHullT2CLREntity);
			navigateTInsuredItemAttribute(marineHullT2CLREntity);
		}
	}
}
