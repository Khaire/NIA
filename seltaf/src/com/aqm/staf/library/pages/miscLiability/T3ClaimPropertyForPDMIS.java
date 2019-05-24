package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.T2ClaimPropWCMISEntity;
import com.aqm.staf.library.databin.T3ClaimPropPDMISEntity;

public class T3ClaimPropertyForPDMIS extends BasePage{
	
	
	
	
	//Title
	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimDetailsPageTitle;
	private PageElement claimAttributesPageTitle;
	private PageElement claimNumberLabel;
	private PageElement claimDateLabel;
	private PageElement productCodeLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement policyNumberLabel;
	private PageElement claimStatusLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	//Tab Navigation
		private PageElement claimDetailsTitle;
		private PageElement claimInsuredInterestDamageTitle;
		private PageElement claimDocumentsTitle;
		private PageElement claimAssociatedPartiesTitle;
		private PageElement claimReserveTitle;
		private PageElement claimPaymentsTitle;
		private PageElement claimPropertyTitle;
		private PageElement backButton;
		private PageElement forwardButton;
		private PageElement previousButton;
		private PageElement claimInsuredPropertyTitle;
		private PageElement claimInsuredInterestDamageDetailTitle ;

		private PageElement t4ClaimPropertyfoTitle;
		private PageElement claimRiskPropertiesTitle;
		//PD
		private PageElement underClaimsAttachTechnicalCollaboratorsLiabilityDropdown;
		private PageElement underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown;
		private PageElement underClaimsAttachIntellectualPropertyRightsDropdown;
		private PageElement subLimitOfAttachTechnicalCollaboratorsliabilityTextField;
		private PageElement extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField;
		private PageElement subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField;
		private PageElement extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField;
		private PageElement subLimitOfAttachIntellectualPropertyRightsTextField;
		private PageElement extensionClaimAmountOfIntellectualPropertyRightsTextField;

		public T3ClaimPropertyForPDMIS(WebDriver driver, String pageName) {
			super(driver, pageName);
			//Tab
			claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"), "Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			insuredItemTitle = new PageElement(By.xpath("//b//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			documentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			partiesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			reserveTitle = new PageElement(By.xpath("//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			paymentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			attributesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			claimAttributesPageTitle = new PageElement(By.xpath("//div//a//b//font[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			claimDetailsPageTitle = new PageElement(By.xpath("//div//a//b//font[contains(text(),'Details')]"), "Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//Lable
			claimNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),'number')]/following::td"),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
			claimDateLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),' Date')]/following::td"), "Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			productCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),' Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			insuredSerialNoLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),'Serial No')]/following::td"), "Insured Serial No Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			policyNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),'Policy')]/following::td"), "Policy Number Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimStatusLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),' Status')]/following::td"), "Claim Status Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			causeOfLossLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),' Loss')]/following::td"), "Cause Of Loss Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			insuredItemCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),' Item Code')]/following::td"), "Insured Item Code Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			applicableEventCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//b[contains(text(),'Event Code')]/following::td"), "Applicable Event Code Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			//QA
			underClaimsAttachTechnicalCollaboratorsLiabilityDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Technical collaborators liability')]/following::select"), "Under Claims attach Technical collaborators liability Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
			underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown=new PageElement(By.xpath("//td//div[contains(text(),'//td//div[contains(text(),'Under Claims attach Contractors/Sub-Contractors/Loan and License Manufacturer')]/following::select"), "Under Claims attach Contractors/Sub-Contractors/Loan and License Manufacturer Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
			underClaimsAttachIntellectualPropertyRightsDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Intellectual property rights')]/following::select"), "Under Claims attach Intellectual property rights Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
			subLimitOfAttachTechnicalCollaboratorsliabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Technical collaborators liability')]/following::input"), "Sub Limit of attach Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Technical Collaborators Liability')]/following::input"), "Extension Claim Amount of Technical Collaborators Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Contractor/Sub-Contractor/Loan and License Manufacturer')]/following::input"), "Sub Limit of attach Contractor/Sub-Contractor/Loan and License Manufacturer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Contractors or Sub-Contrs or Loan,License Manufacturer')]/following::input"), "Extension Claim Amount of Contractors or Sub-Contrs or Loan,License Manufacturer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			subLimitOfAttachIntellectualPropertyRightsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Intellectual property rights')]/following::input"), "Sub Limit of attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfIntellectualPropertyRightsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Intellectual Property Rights')]/following::input"), "Extension Claim Amount of Intellectual Property Rights", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


			//PageTitles
			claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimInsuredInterestDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Property", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimInsuredPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Insured InterestDamage Detail ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimInsuredInterestDamageDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			//Buttons
			backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			forwardButton=new PageElement(By.name("Next1"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			previousButton=new PageElement(By.name("Previous"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

			t4ClaimPropertyfoTitle = new PageElement(By.xpath("//div//b[contains(text(),'T4-Claim Property fo')]"), "T4-Claim Property fo ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimRiskPropertiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'claim risk properties')]"), "claim risk properties ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		}
		public void FillT3ClaimPropertyForPDMIS(T3ClaimPropPDMISEntity t3ClaimPropPDMISEntity, CustomAssert assertReference){
			if(t3ClaimPropPDMISEntity.getAction().equalsIgnoreCase("add") || t3ClaimPropPDMISEntity.getAction().equalsIgnoreCase("edit")){
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsliabilityTextField")) {
					clearAndSendKeys(subLimitOfAttachTechnicalCollaboratorsliabilityTextField, t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsliabilityTextField"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField")) {
					clearAndSendKeys(extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField, t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField")) {
					clearAndSendKeys(subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField, t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField")) {
					clearAndSendKeys(extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField, t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachIntellectualPropertyRightsTextField")) {
					clearAndSendKeys(subLimitOfAttachIntellectualPropertyRightsTextField, t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachIntellectualPropertyRightsTextField"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfIntellectualPropertyRightsTextField")) {
					clearAndSendKeys(extensionClaimAmountOfIntellectualPropertyRightsTextField, t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfIntellectualPropertyRightsTextField"));
				}
				
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTechnicalCollaboratorsLiabilityDropdown")) {
					selectValueFromList(underClaimsAttachTechnicalCollaboratorsLiabilityDropdown, t3ClaimPropPDMISEntity.getStringValueForField("UnderClaimsAttachTechnicalCollaboratorsLiabilityDropdown"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown")) {
					selectValueFromList(underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown, t3ClaimPropPDMISEntity.getStringValueForField("UnderClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown"));
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachIntellectualPropertyRightsDropdown")) {
					selectValueFromList(underClaimsAttachIntellectualPropertyRightsDropdown, t3ClaimPropPDMISEntity.getStringValueForField("UnderClaimsAttachIntellectualPropertyRightsDropdown"));
				}
			}
			else if(t3ClaimPropPDMISEntity.getAction().equalsIgnoreCase("verify")){
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigClaimNumberLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ClaimNumberLabel"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigClaimDateLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("claimDateLabel"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigProductCodeLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ProductCodeLabel"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigInsuredSerialNoLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("InsuredSerialNoLabel"), fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigPolicyNumberLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("PolicyNumberLabel"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigClaimStatusLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ClaimStatusLabel"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigCauseOfLossLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("CauseOfLossLabel"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigInsuredItemCodeLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("InsuredSerialNoLabel"), fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigInsuredSerialNoLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("InsuredItemCodeLabel"), fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigApplicableEventCodeLabel")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ApplicableEventCodeLabel"), fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
				}

				//
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField"), fetchValueFromTextFields(extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsliabilityTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsliabilityTextField"), fetchValueFromTextFields(subLimitOfAttachTechnicalCollaboratorsliabilityTextField), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField"), fetchValueFromTextFields(subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField"), fetchValueFromTextFields(extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachIntellectualPropertyRightsTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("SubLimitOfAttachIntellectualPropertyRightsTextField"), fetchValueFromTextFields(subLimitOfAttachIntellectualPropertyRightsTextField), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfIntellectualPropertyRightsTextField")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("ExtensionClaimAmountOfIntellectualPropertyRightsTextField"), fetchValueFromTextFields(extensionClaimAmountOfIntellectualPropertyRightsTextField), AssertionType.WARNING);
				}
				//
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTechnicalCollaboratorsLiabilityDropdown")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("UnderClaimsAttachTechnicalCollaboratorsLiabilityDropdown"), fetchValueFromList(underClaimsAttachTechnicalCollaboratorsLiabilityDropdown), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown"), fetchValueFromList(underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown), AssertionType.WARNING);
				}
				if (t3ClaimPropPDMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachIntellectualPropertyRightsDropdown")) {
					assertReference.assertEquals(t3ClaimPropPDMISEntity.getStringValueForField("UnderClaimsAttachIntellectualPropertyRightsDropdown"), fetchValueFromList(underClaimsAttachIntellectualPropertyRightsDropdown), AssertionType.WARNING);
				}
				
			}
			}
		public void navigateToclaimTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigClaim")){
				click(claimTitle);
				switchToFrame("display");
				isElementDisplayed(claimDetailsTitle);
			}
		}
		public void navigateToclaimInsuredInterestDamageTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigInsuredItem")){
				click(insuredItemTitle);
				switchToFrame("display");
				isElementDisplayed(claimInsuredInterestDamageTitle);
			}
		}
		public void navigateToDocumentTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigDocument")){
				click(documentTitle);
				switchToFrame("display");
				isElementDisplayed(claimDocumentsTitle);
			}
		}
		public void navigateToAssociatedPartiesTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigParties")){
				click(partiesTitle);
				switchToFrame("display");
				isElementDisplayed(claimAssociatedPartiesTitle);
			}
		}
		public void navigateToReserveTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigReserve")){
				click(reserveTitle);
				switchToFrame("display");
				isElementDisplayed(claimReserveTitle);
			}
		}
		public void navigateToPaymentTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigPayment")){
				click(paymentTitle);
				switchToFrame("display");
				isElementDisplayed(claimPaymentsTitle);
			}
		}
		public void navigateToAttributeTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigAttribute")){
				click(attributesTitle);
				switchToFrame("display");
				isElementDisplayed(claimPropertyTitle);
			}
		}
		public void navigateToDetailTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigDetails")){
				click(claimDetailsPageTitle);
				switchToFrame("display");
				isElementDisplayed(claimInsuredInterestDamageDetailTitle);
			}
		}
		public void navigateToSubAttributeTab(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity){
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigInsuredItemAttributes")){
				click(claimAttributesPageTitle);
				switchToFrame("display");
				isElementDisplayed(claimInsuredPropertyTitle);
			}
		}
		public void backFromT2ClaimPropertyForWCMIS(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity) {
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigBackButton")) {
				click(backButton);
				switchToFrame("display");
				isElementDisplayed(claimInsuredPropertyTitle);
			}
		}
		public void forwordFromT2ClaimPropertyForWCMIS(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity) {
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigForwardButton")) {
				click(forwardButton);
				switchToFrame("display");
				isElementDisplayed(t4ClaimPropertyfoTitle);
			}
		}
		public void backwordFromT2ClaimPropertyForWCMIS(T2ClaimPropWCMISEntity t2ClaimPropWCMISEntity) {
			if (t2ClaimPropWCMISEntity.getBooleanValueForField("ConfigPreviousButton")) {
				click(previousButton);
				switchToFrame("display");
				isElementDisplayed(claimRiskPropertiesTitle);
			}
		}
		


}
