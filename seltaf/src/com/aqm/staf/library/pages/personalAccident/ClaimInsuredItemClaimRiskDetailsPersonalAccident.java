package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CLInsIntClaimDetIndivdEntity;
import com.aqm.staf.library.databin.ClaimInsItAttRiskDetPAEntity;

public class ClaimInsuredItemClaimRiskDetailsPersonalAccident extends BasePage{
	private PageElement ClaimRiskdetailsTitle;
	
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
	
	private PageElement nameofMemberTextField;
	private PageElement employeeIdTextField;
	private PageElement cadreTextField;
	private PageElement ageTextField;
	private PageElement sumInsuredTextField;
	private PageElement typeOfCauseDropDown;

	private PageElement capitalSumInsuredTextBox;
	private PageElement sumInsuredforTableATextBox;
	private PageElement sumInsuredforTableBTextBox;
	private PageElement sumInsuredforTableCTextBox;
	private PageElement sumInsuredforTableDTextBox;
	
	private PageElement nextButton;
	private PageElement backButton;
	
	private PageElement nextButtonTitle;
	private PageElement backButtonTitle;
	
	
	public ClaimInsuredItemClaimRiskDetailsPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		ClaimRiskdetailsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Claim Risk details')]"), "Claim Risk details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButtonTitle		= new PageElement(By.xpath("//div/b[contains(text(),'Claim Risk Details2')]"), "Claim Risk Detail2 (Non GR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		
		nameofMemberTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Name of Member')]/following::textarea"), "Name of Member TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		employeeIdTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Employee Id')]/following::input"), "Employee Id TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Cadre')]/following::textarea"), "Cadre TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Age (Yrs)')]/following::input"), "Age (Yrs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCauseDropDown		= new PageElement(By.xpath("//td//div[contains(text(),'Type of Cause')]/following::select"), "Type of Cause DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		nextButton		= new PageElement(By.name("Next1"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
		capitalSumInsuredTextBox= new PageElement(By.xpath("//td//div[contains(text(),'Capital Sum Insured')]/following::input"), "Type of Cause DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforTableATextBox= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table A')]/following::input"), "Sum Insured for Table A", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforTableBTextBox= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table B')]/following::input"), "Sum Insured for Table B", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforTableCTextBox= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table C')]/following::input"), "Sum Insured for Table C", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforTableDTextBox= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table D')]/following::input"), "Sum Insured for Table D", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
	}

	public void fillInsuredIntClaimRiskDetailsPA(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity, CustomAssert assertReference){
		if(claimInsItAttRiskDetPAEntity.getAction().equalsIgnoreCase("add") || claimInsItAttRiskDetPAEntity.getAction().equalsIgnoreCase("edit")){
			
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigNameofMember")) {
				clearAndSendKeys(nameofMemberTextField, claimInsItAttRiskDetPAEntity.getStringValueForField("NameofMember"));
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigEmployeeId")) {
				clearAndSendKeys(employeeIdTextField, claimInsItAttRiskDetPAEntity.getStringValueForField("EmployeeId"));
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigCadre")) {
			    clearAndSendKeys(cadreTextField, claimInsItAttRiskDetPAEntity.getStringValueForField("Cadre"));
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigAge")) {
			    clearAndSendKeys(ageTextField, claimInsItAttRiskDetPAEntity.getStringValueForField("Age"));
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsured")) {
			    clearAndSendKeys(sumInsuredTextField, claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsured"));
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigTypeOfCause")) {
			    selectValueFromList(typeOfCauseDropDown, claimInsItAttRiskDetPAEntity.getStringValueForField("TypeOfCause"));
			}
		}
		else if(claimInsItAttRiskDetPAEntity.getAction().equalsIgnoreCase("verify")){
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimNumber")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("ClaimNumber"), fetchValueFromTextFields(claimNumberLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimDate")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("ClaimDate"), fetchValueFromTextFields(claimDateLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigProductCode")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("ProductCode"), fetchValueFromTextFields(productCodeLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("InsuredSerialNo"), fetchValueFromTextFields(insuredSerialNoLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigPolicyNumber")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimStatus")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("ClaimStatus"), fetchValueFromTextFields(claimStatusLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("CauseOfLoss"), fetchValueFromTextFields(causeOfLossLable), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("InsuredItemCode"), fetchValueFromTextFields(insuredItemCodeLable), AssertionType.WARNING);
			}
		
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigNameofMember")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("NameofMember"), fetchValueFromTextFields(nameofMemberTextField), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigEmployeeId")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("EmployeeId"), fetchValueFromTextFields(employeeIdTextField), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigCadre")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("Cadre"), fetchValueFromTextFields(cadreTextField), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigAge")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("Age"), fetchValueFromTextFields(ageTextField), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsured")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigTypeOfCause")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("TypeOfCause"), fetchValueFromTextFields(typeOfCauseDropDown), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("CapitalSumInsured"), fetchValueFromTextFields(capitalSumInsuredTextBox), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsuredforTableA")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsuredforTableA"), fetchValueFromTextFields(sumInsuredforTableATextBox), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsuredforTableB")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsuredforTableB"), fetchValueFromTextFields(sumInsuredforTableBTextBox), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsuredforTableC")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsuredforTableC"), fetchValueFromTextFields(sumInsuredforTableCTextBox), AssertionType.WARNING);
			}
			if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigSumInsuredforTableD")) {
			    assertReference.assertEquals(claimInsItAttRiskDetPAEntity.getStringValueForField("SumInsuredforTableD"), fetchValueFromTextFields(sumInsuredforTableDTextBox), AssertionType.WARNING);
			}
		}
	
	}
	
	public void clickNextButton(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity) {
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			
		}
	}

	public void clickBackButton(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity) {
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(backButtonTitle);
		}
	}
	
	public void navigateToClaimSubTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimSubTab")){
			click(claimSubTab);
			switchToFrame("display");
		}
	}
	public void navigateToInsuredIntrestTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimInsuredItemTab")){
			click(claimInsuredItemTab);
			switchToFrame("display");
			isElementDisplayed(claimInsuredItemTabTitle);
		}
	}
	public void navigateToDocumentTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimDocumentTab")){
			click(claimDocumentTab);
			switchToFrame("display");
			isElementDisplayed(claimDocumentTabTitle);
		}
	}
	public void navigateToPartiesTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimPartiesTab")){
			click(claimPartiesTab);
			switchToFrame("display");
			isElementDisplayed(claimPartiesTabTitle);
		}
	}
	public void navigateToReserveTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimReserveTab")){
			click(claimReserveTab);
			switchToFrame("display");
			isElementDisplayed(claimReserveTabTitle);
		}
	}
	public void navigateToPaymentTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimPaymentTab")){
			click(claimPaymentTab);
			switchToFrame("display");
			isElementDisplayed(claimPaymentTabTitle);
		}
	}
	public void navigateToAttributesTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigClaimAttributesTab")){
			click(claimAttributesTab);
			switchToFrame("display");
			isElementDisplayed(claimAttributesTabTitle);
		}
	}
	public void navigateToInsureIntDetailSubTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsureIntAttributeSubTab(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity){
		if (claimInsItAttRiskDetPAEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(backButtonTitle);
		}
	}			
	
	public void fillandSubmitInsuredIntClaimRiskDetails1PA(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimInsItAttRiskDetPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillInsuredIntClaimRiskDetailsPA(claimInsItAttRiskDetPAEntity,assertReference);
			clickNextButton(claimInsItAttRiskDetPAEntity);
			clickBackButton(claimInsItAttRiskDetPAEntity);
			
			navigateToClaimSubTab(claimInsItAttRiskDetPAEntity);
			navigateToInsuredIntrestTab(claimInsItAttRiskDetPAEntity);
			navigateToDocumentTab(claimInsItAttRiskDetPAEntity);
			navigateToPartiesTab(claimInsItAttRiskDetPAEntity);
			navigateToReserveTab(claimInsItAttRiskDetPAEntity);
			navigateToPaymentTab(claimInsItAttRiskDetPAEntity);
			navigateToAttributesTab(claimInsItAttRiskDetPAEntity);
			navigateToInsureIntDetailSubTab(claimInsItAttRiskDetPAEntity);
			navigateToInsureIntAttributeSubTab(claimInsItAttRiskDetPAEntity);
		}
	}	
			

	
	

}
