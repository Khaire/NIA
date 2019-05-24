package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CLInsIntClaimDetIndivdEntity;
import com.aqm.staf.library.databin.CLInsItClaimRiskDet1CSEntity;

public class ClaimInsuredItemClaimDetailsforINDIVIDUALPersonalAccident extends BasePage {
	private PageElement claimDetailsforINDIVIDUALTitle;
	
	private PageElement claimSubTab;
	private PageElement claimInsuredItemTab;
	private PageElement claimDocumentTab;
	private PageElement claimPartiesTab;
	private PageElement claimReserveTab;
	private PageElement claimPaymentTab;
	private PageElement claimAttributesTab;

	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	
	private PageElement claimInsuredItemTabTitle;
	private PageElement claimDocumentTabTitle;
	private PageElement claimPartiesTabTitle;
	private PageElement claimReserveTabTitle;
	private PageElement claimPaymentTabTitle;
	private PageElement claimAttributesTabTitle;

	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;

	private PageElement claimNumberLable;
	private PageElement claimDateLable;
	private PageElement productCodeLable;
	private PageElement insuredSerialNoLable;
	private PageElement policyNumberLable;
	private PageElement claimStatusLable;
	private PageElement causeOfLossLable;
	private PageElement insuredItemCodeLable;
	
	private PageElement capitalSumInsuredTextField;
	private PageElement sumInsuredfortableATextField;
	private PageElement sumInsuredfortableBTextField;
	private PageElement sumInsuredfortableCTextField;
	private PageElement sumInsuredfortableDTextField;
	private PageElement typeOfCauseDropDown;

	private PageElement nextButton;
	private PageElement backButton;
	
	private PageElement nextButtonTitle;
	private PageElement backButtonTitle;
	
	
	public ClaimInsuredItemClaimDetailsforINDIVIDUALPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		claimDetailsforINDIVIDUALTitle = new PageElement(By.xpath("//form[@name='S0201']//div/b"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButtonTitle		= new PageElement(By.xpath("//div/b[contains(text(),'Claim Risk Detail2 (Non GR)')]"), "Claim Risk Detail2 (Non GR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButtonTitle		= new PageElement(By.xpath("//div/b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		claimSubTab			= new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
 	 	claimInsuredItemTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimDocumentTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimPartiesTab  	= new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimReserveTab		= new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimPaymentTab		= new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimAttributesTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
 	 	insuredItemDetailsTab	= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	insuredItemAttributeTab	= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	
 	 	claimInsuredItemTabTitle = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "claim Insured Item Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimDocumentTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Document Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimPartiesTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim Associated Parties')]"), "Claim Parties Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimReserveTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Reserve Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimPaymentTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Payment Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimAttributesTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim Property')]"), "Claim Attributes Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 		
 	 	insuredItemDetailsTabTitle   = new PageElement(By.xpath("//div/b[contains(text(),'Claim Insured InterestDamage Detail')]"), "Insured Item Details Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	insuredItemAttributeTabTitle = new PageElement(By.xpath("//div/b[contains(text(),'Claim Insured Property')]"), "Insured Item Attribute Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

 	 	claimNumberLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Claim')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimDateLable			= new PageElement(By.xpath("///td//div//b[contains(text(),'Date')]/following::td"), "Claim Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	productCodeLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Seria lNo Lable ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLable		= new PageElement(By.xpath("//td//b[contains(text(),'Number')]/following::td"), "policy Number Lable ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLable		= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Claim Status Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLable		= new PageElement(By.xpath("//td//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLable	= new PageElement(By.xpath("//td//b[contains(text(),'Insured Item Code')]/following::td"), "insured Item Code Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		capitalSumInsuredTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Capital Sum Insured')]/following::input"), "Capital Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredfortableATextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table A')]/following::input"), "Sum Insured for Table A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredfortableBTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table B')]/following::input"), "Sum Insured for Table B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredfortableCTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table C')]/following::input"), "Sum Insured for Table C TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredfortableDTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table D')]/following::input"), "Sum Insured for Table D TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCauseDropDown				= new PageElement(By.xpath("//td//div[contains(text(),'Type of Cause')]/following::select"), "Type of Cause DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		nextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
	}
	
	public void fillInsuredIntClaimDetailsforINDIVIDUAL(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity, CustomAssert assertReference){
		if(cLInsIntClaimDetIndivdEntity.getAction().equalsIgnoreCase("add") || cLInsIntClaimDetIndivdEntity.getAction().equalsIgnoreCase("edit")){
			
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
			    clearAndSendKeys(capitalSumInsuredTextField, cLInsIntClaimDetIndivdEntity.getStringValueForField("CapitalSumInsured"));
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableA")) {
				selectValueFromList(sumInsuredfortableATextField, cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableA"));
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableB")) {
			    clearAndSendKeys(sumInsuredfortableBTextField, cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableB"));
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableC")) {
			    clearAndSendKeys(sumInsuredfortableCTextField, cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableC"));
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableD")) {
			    clearAndSendKeys(sumInsuredfortableDTextField, cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableD"));
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigTypeOfCause")) {
			    selectValueFromList(typeOfCauseDropDown, cLInsIntClaimDetIndivdEntity.getStringValueForField("TypeOfCause"));
			}
		}
		else if(cLInsIntClaimDetIndivdEntity.getAction().equalsIgnoreCase("verify")){
			//Lables
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimNumber")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("ClaimNumber"), fetchValueFromTextFields(claimNumberLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimDate")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("ClaimDate"), fetchValueFromTextFields(claimDateLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigProductCode")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("ProductCode"), fetchValueFromTextFields(productCodeLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("InsuredSerialNo"), fetchValueFromTextFields(insuredSerialNoLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigPolicyNumber")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimStatus")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("ClaimStatus"), fetchValueFromTextFields(claimStatusLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("CauseOfLoss"), fetchValueFromTextFields(causeOfLossLable), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("InsuredItemCode"), fetchValueFromTextFields(insuredItemCodeLable), AssertionType.WARNING);
			}
			//Fields
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("CapitalSumInsured"), fetchValueFromTextFields(capitalSumInsuredTextField), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableA")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableA"), fetchValueFromTextFields(sumInsuredfortableATextField), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableB")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableB"), fetchValueFromTextFields(sumInsuredfortableBTextField), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableC")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableC"), fetchValueFromTextFields(sumInsuredfortableCTextField), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigSumInsuredfortableD")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("SumInsuredfortableD"), fetchValueFromTextFields(sumInsuredfortableDTextField), AssertionType.WARNING);
			}
			if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigTypeOfCause")) {
			    assertReference.assertEquals(cLInsIntClaimDetIndivdEntity.getStringValueForField("TypeOfCause"), fetchValueFromTextFields(typeOfCauseDropDown), AssertionType.WARNING);
			}
		}
	
	}
	
	public void clickNextButton(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity) {
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			isElementDisplayed(nextButtonTitle);
		}
	}

	public void clickBackButton(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity) {
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(backButtonTitle);
		}
	}
	
	public void navigateToClaimSubTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimSubTab")){
			click(claimSubTab);
			switchToFrame("display");
		}
	}
	public void navigateToInsuredIntrestTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimInsuredItemTab")){
			click(claimInsuredItemTab);
			switchToFrame("display");
			isElementDisplayed(claimInsuredItemTabTitle);
		}
	}
	public void navigateToDocumentTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimDocumentTab")){
			click(claimDocumentTab);
			switchToFrame("display");
			isElementDisplayed(claimDocumentTabTitle);
		}
	}
	public void navigateToPartiesTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimPartiesTab")){
			click(claimPartiesTab);
			switchToFrame("display");
			isElementDisplayed(claimPartiesTabTitle);
		}
	}
	public void navigateToReserveTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimReserveTab")){
			click(claimReserveTab);
			switchToFrame("display");
			isElementDisplayed(claimReserveTabTitle);
		}
	}
	public void navigateToPaymentTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimPaymentTab")){
			click(claimPaymentTab);
			switchToFrame("display");
			isElementDisplayed(claimPaymentTabTitle);
		}
	}
	public void navigateToAttributesTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigClaimAttributesTab")){
			click(claimAttributesTab);
			switchToFrame("display");
			isElementDisplayed(claimAttributesTabTitle);
		}
	}
	public void navigateToInsureIntDetailSubTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsureIntAttributeSubTab(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity){
		if (cLInsIntClaimDetIndivdEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(backButtonTitle);
		}
	}			
	
	public void fillandSubmitInsuredIntClaimRiskDetails1(CLInsIntClaimDetIndivdEntity cLInsIntClaimDetIndivdEntity, CustomAssert assertReference) {
		if (isConfigTrue(cLInsIntClaimDetIndivdEntity.getConfigExecute())){
			switchToFrame("display");
			fillInsuredIntClaimDetailsforINDIVIDUAL(cLInsIntClaimDetIndivdEntity,assertReference);
			clickNextButton(cLInsIntClaimDetIndivdEntity);
			clickBackButton(cLInsIntClaimDetIndivdEntity);
			navigateToClaimSubTab(cLInsIntClaimDetIndivdEntity);
			navigateToInsuredIntrestTab(cLInsIntClaimDetIndivdEntity);
			navigateToDocumentTab(cLInsIntClaimDetIndivdEntity);
			navigateToPartiesTab(cLInsIntClaimDetIndivdEntity);
			navigateToReserveTab(cLInsIntClaimDetIndivdEntity);
			navigateToPaymentTab(cLInsIntClaimDetIndivdEntity);
			navigateToAttributesTab(cLInsIntClaimDetIndivdEntity);
			navigateToInsureIntDetailSubTab(cLInsIntClaimDetIndivdEntity);
			navigateToInsureIntAttributeSubTab(cLInsIntClaimDetIndivdEntity);
		}
	}	
			
}
