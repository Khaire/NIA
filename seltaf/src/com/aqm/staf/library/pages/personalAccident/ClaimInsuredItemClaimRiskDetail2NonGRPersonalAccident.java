package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClamIsurRskdet2NonGrPAEntity;
import com.aqm.staf.library.databin.ClamIsurRskdet2NonGrPAEntity;

public class ClaimInsuredItemClaimRiskDetail2NonGRPersonalAccident extends BasePage {

	private PageElement claimRiskDetail2NonGRTitle;

	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributesTab;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel; 
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributesTabTitle;

	private PageElement applicableEventCodeLabel;

	private PageElement previousPolicyNumberTextField;
	private PageElement natureOfTreatmentDropDown;
	private PageElement medicalExtensionRequiredTextField;
	private PageElement isCompensationForEducationFundRequiredDropDown;
	private PageElement dateOfDeathTextField;
	private PageElement expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField;

	private PageElement commonClaimRiskPropertyTitle;
	private PageElement claimDetailsForIndividualTitle;
	private PageElement claimInsuredPropertyTitle;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;



	public ClaimInsuredItemClaimRiskDetail2NonGRPersonalAccident(WebDriver driver, String pageName)
	{
		
		claimRiskDetail2NonGRTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Detail2 (Non GR)')]"), "Claim Risk Detail2 (Non GR) Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		claimTab = new PageElement(By.xpath("//a[@title='Claim']"),"Claim Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTab = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a[@title='Document']"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a[@title='Parties']"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a[@title='Reserve']"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a[@title='Payment']"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a[@title='Payment']/following::td"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//div//a//b/font[contains(text(),'Details')]"), "Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredItemAttributesTab = new PageElement(By.xpath("//div//a//b/font[contains(text(),'Attributes')]"), "Attributes Tab", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'number')]/following::td"), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Policy')]/following::td"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Date')]/following::td"), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Status')]/following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Item Code')]/following::td"), "Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Claim Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"),"Claim Insured Item Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"),"Claim Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"),"Claim Parties Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"),"Claim Reserve Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		paymentTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"),"Claim Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		attributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured InterestDamage Detail')]"),"Claim Insured Item Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemAttributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"),"Claim Insured Item Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		previousPolicyNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentDropDown=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Nature of Treatment')]/following::select"), "Nature of Treatment DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE , 10);
		medicalExtensionRequiredTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Medical Extension  Required')]/following::input"), "Medical Extension  Required TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCompensationForEducationFundRequiredDropDown=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Is compensation for education fund required?')]/following::select"), "Is compensation for education fund required? DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfDeathTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Date of death')]/following::input"), "Date of death TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Expenses incurred for carriage of dead body to the place of residence')]/following::input"), "Expenses incurred for carriage of dead body to the place of residence TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Previous"), "Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		commonClaimRiskPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), "Common Claim Risk Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDetailsForIndividualTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Details for INDIVIDUAL')]"), "Claim Details for INDIVIDUAL Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void fillClaimInsuredItemClaimRiskDetail2NonGRPersonalAccident(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity, CustomAssert assertReference)throws InterruptedException{
		if(clamIsurRskdet2NonGrPAEntity.getAction().equalsIgnoreCase("add") || clamIsurRskdet2NonGrPAEntity.getAction().equalsIgnoreCase("edit")){
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, clamIsurRskdet2NonGrPAEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
				selectValueFromList(natureOfTreatmentDropDown, clamIsurRskdet2NonGrPAEntity.getStringValueForField("NatureOfTreatment"));
			}
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
				clearAndSendKeys(medicalExtensionRequiredTextField, clamIsurRskdet2NonGrPAEntity.getStringValueForField("MedicalExtensionRequired"));
			}
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigIsCompensationForEducationFundRequired")) {
				selectValueFromList(isCompensationForEducationFundRequiredDropDown, clamIsurRskdet2NonGrPAEntity.getStringValueForField("IsCompensationForEducationFundRequired?"));
			}
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigDateOfDeath")) {
				clearAndSendKeys(dateOfDeathTextField, clamIsurRskdet2NonGrPAEntity.getStringValueForField("DateOfDeath"));
			}
			if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence")) {
				clearAndSendKeys(expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField, clamIsurRskdet2NonGrPAEntity.getStringValueForField("ExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence"));
			}

			else if(clamIsurRskdet2NonGrPAEntity.getAction().equalsIgnoreCase("verify")){

				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("Status"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				//
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("NatureOfTreatment"),fetchValueFromTextFields(natureOfTreatmentDropDown), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("MedicalExtensionRequired"),fetchValueFromTextFields(medicalExtensionRequiredTextField), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigIsCompensationForEducationFundRequired")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("IsCompensationForEducationFundRequired"),fetchValueFromTextFields(isCompensationForEducationFundRequiredDropDown), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigDateOfDeath")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("DateOfDeath"),fetchValueFromTextFields(dateOfDeathTextField), AssertionType.WARNING);
				}
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence")) {
					assertReference.assertEquals(clamIsurRskdet2NonGrPAEntity.getStringValueForField("ExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence"),fetchValueFromTextFields(expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField), AssertionType.WARNING);
				}

			}
		}
	}


	public void navigateToClaimHomePage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);

		}
	}
	public void navigateToInsuredItemPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigInsuredItemTab")) {
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);

		}
	}
	public void navigateToDocumentPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToPartiesPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReservePage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPaymentPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttributesPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetailsPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")) {
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttributesPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigInsuredItemAttributesTab")) {
			click(insuredItemAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributesTabTitle);
		}
	}
	public void navigateToForwardClaimInsuredItemPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	}
	/*public void navigateToSaveClaimInsuredItemPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
				if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigSaveButton")) {
					click(saveButton);
					switchToFrame("display");
					isElementDisplayed(cdClaimRiskDetails2Title);
				}
			}*/ 
	public void navigateToBackwardClaimInsuredItemPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigBackwardButton")) {
			click(backwardButton);
			//claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'"+clamIsurRskdet2NonGrPAEntity.getStringValueForField("InsuredItemAttributesPageTitle")+"')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			switchToFrame("display");
			isElementDisplayed(claimDetailsForIndividualTitle);

		}
	}
	public void navigateToBackClaimInsuredItemPage(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity){
		if (clamIsurRskdet2NonGrPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}

	public void fillAndSubmitClaimInsuredItemClaimRiskDetail2NonGRPersonalAccident(ClamIsurRskdet2NonGrPAEntity clamIsurRskdet2NonGrPAEntity, CustomAssert assertReference)throws InterruptedException{
		if (isConfigTrue(clamIsurRskdet2NonGrPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimInsuredItemClaimRiskDetail2NonGRPersonalAccident(clamIsurRskdet2NonGrPAEntity, assertReference);
			navigateToClaimHomePage(clamIsurRskdet2NonGrPAEntity);
			navigateToInsuredItemPage(clamIsurRskdet2NonGrPAEntity);
			navigateToDocumentPage(clamIsurRskdet2NonGrPAEntity);
			navigateToPartiesPage(clamIsurRskdet2NonGrPAEntity);
			navigateToReservePage(clamIsurRskdet2NonGrPAEntity);
			navigateToPaymentPage(clamIsurRskdet2NonGrPAEntity);
			navigateToAttributesPage(clamIsurRskdet2NonGrPAEntity);
			navigateToInsuredItemDetailsPage(clamIsurRskdet2NonGrPAEntity);
			navigateToInsuredItemAttributesPage(clamIsurRskdet2NonGrPAEntity);
			navigateToForwardClaimInsuredItemPage(clamIsurRskdet2NonGrPAEntity);
			//navigateToSaveClaimInsuredItemPage(clamIsurRskdet2NonGrPAEntity);
			navigateToBackwardClaimInsuredItemPage(clamIsurRskdet2NonGrPAEntity);
			navigateToBackClaimInsuredItemPage(clamIsurRskdet2NonGrPAEntity);
		}
	}



}

