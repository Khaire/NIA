package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimIsurComRiskPropPAEntity;

public class ClaimInsuredItemCommonClaimRiskPropertyPersonalAccident  extends BasePage {

	private PageElement commonClaimRiskPropertyTitle;

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

	private PageElement claimDropDown;
	private PageElement excessTextField;
	private PageElement claimAmountTextField;
	private PageElement surveyFeesTextField;
	private PageElement translatorFeesTextField;
	private PageElement legalOpinionFeesTextField;
	private PageElement other1FeesTextField;
	private PageElement other2FeesTextField;

	private PageElement claimRiskDetail2NonGRTitle;
	private PageElement claimDetailsForIndividualTitle;
	private PageElement claimInsuredPropertyTitle;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;


	public ClaimInsuredItemCommonClaimRiskPropertyPersonalAccident(WebDriver driver, String pageName)
	{
		commonClaimRiskPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), "Common Claim Risk Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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

		claimDropDown=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Claim')]/following::select"), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		excessTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Excess ')]/following::input"), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Claim amount')]/following::input"), "Claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Survey Fees')]/following::input"), "Survey Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		translatorFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Translator Fees')]/following::input"), "Translator Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalOpinionFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Legal Opinion Fees')]/following::input"), "Legal Opinion Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other1FeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Other1 Fees')]/following::input"), "Other1 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other2FeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Other2 Fees')]/following::input"), "Other2 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Previous"), "Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimRiskDetail2NonGRTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Detail2 (Non GR)')]"), "Claim Risk Detail2 (Non GR) Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillClaimInsuredItemCommonClaimRiskPropertyPersonalAccident(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity, CustomAssert assertReference)throws InterruptedException{
		if(claimIsurComRiskPropPAEntity.getAction().equalsIgnoreCase("add") || claimIsurComRiskPropPAEntity.getAction().equalsIgnoreCase("edit")){
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaim")) {
				clearAndSendKeys(claimDropDown, claimIsurComRiskPropPAEntity.getStringValueForField("Claim"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, claimIsurComRiskPropPAEntity.getStringValueForField("Excess"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimIsurComRiskPropPAEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigSurveyFees")) {
				clearAndSendKeys(surveyFeesTextField, claimIsurComRiskPropPAEntity.getStringValueForField("SurveyFees"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigTranslatorFees")) {
				clearAndSendKeys(translatorFeesTextField, claimIsurComRiskPropPAEntity.getStringValueForField("TranslatorFees"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
				clearAndSendKeys(legalOpinionFeesTextField, claimIsurComRiskPropPAEntity.getStringValueForField("LegalOpinionFees"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigOther1Fees")) {
				clearAndSendKeys(other1FeesTextField, claimIsurComRiskPropPAEntity.getStringValueForField("Other1Fees"));
			}
			if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigOther2Fees")) {
				clearAndSendKeys(other2FeesTextField, claimIsurComRiskPropPAEntity.getStringValueForField("Other2Fees"));
			}

			else if(claimIsurComRiskPropPAEntity.getAction().equalsIgnoreCase("verify")){

				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("Status"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				//
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("Claim"),fetchValueFromTextFields(claimDropDown), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimAmount")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigSurveyFees")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("SurveyFees"),fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("TranslatorFees"),fetchValueFromTextFields(translatorFeesTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("LegalOpinionFees"),fetchValueFromTextFields(legalOpinionFeesTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigOther1Fees")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("Other1Fees"),fetchValueFromTextFields(other1FeesTextField), AssertionType.WARNING);
				}
				if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigOther2Fees")) {
					assertReference.assertEquals(claimIsurComRiskPropPAEntity.getStringValueForField("Other2Fees"),fetchValueFromTextFields(other2FeesTextField), AssertionType.WARNING);

				}

			}
		}
	}


	public void navigateToClaimHomePage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);

		}
	}
	public void navigateToInsuredItemPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigInsuredItemTab")) {
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);

		}
	}
	public void navigateToDocumentPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToPartiesPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReservePage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPaymentPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttributesPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetailsPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")) {
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttributesPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigInsuredItemAttributesTab")) {
			click(insuredItemAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributesTabTitle);
		}
	}
	public void navigateToForwardClaimInsuredItemPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	}
	public void navigateToSaveClaimInsuredItemPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	}
	public void navigateToBackwardClaimInsuredItemPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigBackwardButton")) {
			click(backwardButton);
			//claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'"+claimIsurComRiskPropPAEntity.getStringValueForField("InsuredItemAttributesPageTitle")+"')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			switchToFrame("display");
			isElementDisplayed(claimRiskDetail2NonGRTitle);

		}
	}
	public void navigateToBackClaimInsuredItemPage(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}

	public void fillAndSubmitClaimInsuredItemCommonClaimRiskPropertyPersonalAccident(ClaimIsurComRiskPropPAEntity claimIsurComRiskPropPAEntity, CustomAssert assertReference)throws InterruptedException{
		if (isConfigTrue(claimIsurComRiskPropPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimInsuredItemCommonClaimRiskPropertyPersonalAccident(claimIsurComRiskPropPAEntity, assertReference);
			navigateToClaimHomePage(claimIsurComRiskPropPAEntity);
			navigateToInsuredItemPage(claimIsurComRiskPropPAEntity);
			navigateToDocumentPage(claimIsurComRiskPropPAEntity);
			navigateToPartiesPage(claimIsurComRiskPropPAEntity);
			navigateToReservePage(claimIsurComRiskPropPAEntity);
			navigateToPaymentPage(claimIsurComRiskPropPAEntity);
			navigateToAttributesPage(claimIsurComRiskPropPAEntity);
			navigateToInsuredItemDetailsPage(claimIsurComRiskPropPAEntity);
			navigateToInsuredItemAttributesPage(claimIsurComRiskPropPAEntity);
			navigateToForwardClaimInsuredItemPage(claimIsurComRiskPropPAEntity);
			navigateToSaveClaimInsuredItemPage(claimIsurComRiskPropPAEntity);
			navigateToBackwardClaimInsuredItemPage(claimIsurComRiskPropPAEntity);
			navigateToBackClaimInsuredItemPage(claimIsurComRiskPropPAEntity);


		}

	}
}
