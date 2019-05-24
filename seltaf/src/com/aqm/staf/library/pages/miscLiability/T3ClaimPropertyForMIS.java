package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.T3ClaimPropForMISEntity;

public class T3ClaimPropertyForMIS extends BasePage {

	private PageElement t3ClaimPropertyForCOTitle;
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
	private PageElement insuredItemTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement backArrowButton;
	private PageElement nextPageTitle;
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------

	private PageElement	underClaimsAttachHiredVehicleCoverDropDown;
	private PageElement	subLimitOfAttachHiredVehicleCoverTextBox;
	private PageElement	extensionClaimAmountOfHiredVehicleCoverTextBox;
	private PageElement	underClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrierDropDown;
	private PageElement subLimitOfAttachRSMDTextBox;
	private PageElement extensionClaimAmountOfRSMDAtWarehouseTextBox;
	private PageElement	underClaimsAttachShortageDueCarrierDropDown;
	private PageElement subLimitOfAttachShortageDueToTheftTextBox;
	private PageElement extensionClaimAmountOfShortageDueToTheftTextBox;
	private PageElement underClaimsAttachFloodOrWaterDamageDropDown;
	private PageElement subLimitOfAttachFloodOrWaterDamageTextBox;
	private PageElement	extensionClaimAmountOfFloodTextBox;
	private PageElement	underClaimsAttachBreakageLeakageAndDamageHandlingDropDown;
	private PageElement	subLimitOfAttachBreakageLeakageAndDamageTextBox;
	private PageElement extensionClaimAmountOfBreakageLeakageAndDamageTextBox; 

	//wc
	private PageElement sumInsuredTextField;
	private PageElement funeralExpensesTextField;
	private PageElement doYouWantMedicalExtensionDropdown;

	//DO
	private PageElement underClaimsAttachOutsideDirectorshipDropDown; 
	private PageElement subLimitOfOutsideDirectorshipTextField;
	private PageElement extensionClaimAmountOfOutsideDirectorshipTextField;
	private PageElement claimUnderSpousalExtensionDropDown;
	private PageElement subLimitOfSpousalExtensionTextField;
	private PageElement extensionClaimAmountOfSpousalExtensionTextField;
	private PageElement underClaimsAttachLegalHeirsAndRepresentativesDropDown;
	private PageElement subLimitOfLegalHeirsAndRepresentativesTextField;
	private PageElement extensionClaimAmountOfLegalHeirsAndRepresentativesTextfield;
	private PageElement underClaimsAttachEntityCoverageForSecuritiesOnlyDropDown;
	private PageElement subLimitOfEntityCoverageForSecuritiesTextField;
	private PageElement extensionClaimAmountOfEntityCoverageForSecuritiesOnlyTextField;
	private PageElement underClaimsAttachInitialPublicOfferingDropDown;
	private PageElement subLimitOfInitialPublicOfferingTextField;
	private PageElement extensionClaimAmountOfInitialPublicOfferingTextField;
	private PageElement underClaimsAttachOtherAdditionalExtensionsDropDown;
	private PageElement subLimitOfOtherAdditionalExtensionsTextField;
	private PageElement extensionClaimAmountOfOtherAdditionalExtensionsTextField;
	private PageElement crisisCommunicationCoverShouldBeAlsoprovidedAdditionalCoverDropDown;
	private PageElement subLimitOfCrisisCommunicationCoverTextField;
	private PageElement extensionClaimAmountOfCrisisCommunicationCoverTextField;
	private PageElement courtAttendanceCostExtensionDropDown;
	private PageElement subLimitOfCourtAttendanceCostExtensionTextField;
	private PageElement extensionClaimAmountofCourtAttendanceCostExtensionTextfield;
	private PageElement riskManagementExtensionDropDown;
	private PageElement subLimitOfRiskManagementExtensionTextField;
	private PageElement extensionClaimAmountOfRiskManagementExtensionTextField;
	private PageElement pollutionDefenseCostExtensionDropDown;
	private PageElement subLimitOfPollutionDefenseCostExtensionTextField;
	private PageElement extensionClaimAmountOfPollutionDefenseCostExtensionTextField;
	private PageElement employmentPracticeLiabilityEPLIDropDown;
	private PageElement subLimitOfEmploymentPracticeLiabilityEPLITextField;
	private PageElement deductibleForEPLIExtensionTextField;
	private PageElement extensionClaimAmountOfEmploymentPracticeLiabilityEPLITextfield;
	private PageElement directorVersusDirectorExtensionsDropDown;
	private PageElement SubLimitOfDirectorVersusDirectorExtensionsTextField;
	private PageElement extensionClaimAmountOfDirectorVersusDirectorExtensionsTextField;
	private PageElement shadowDirectorshipExtensionsDropDown;
	private PageElement subLimitOfShadowDirectorshipExtensionsTextField;
	private PageElement extensionClaimAmountOfShadowDirectorshipExtensionsTextField;
	private PageElement autoAcquisitionEmploymentPracticeLiabilityDropDown;
	private PageElement subLimitOfAutoAcquisitionEmploymentPracticeLiabilityrTextField;
	private PageElement extensionClaimAmountOfAutoAcquisitionSubsidiariesTextField;
	private PageElement autoAcquisitionComputerCrimeInsuranceDropDown;
	private PageElement subLimitOfAutoAcquisitionComputerCrimeInsuranceTextField;
	private PageElement extensionClaimAmountOfComputerCrimeInsuranceTextField;
	private PageElement autoAcquisitionInfidelityInsuranceCoverDropDown;
	private PageElement subLimitOfAutoAcquisitionInfidelityInsuranceCoverTextField;
	private PageElement extensionClaimAmountOfInfidelityInsuranceCoverTextField;
	private PageElement discoveryPeriodExtensionDropDown;
	private PageElement subLimitOfDiscoveryPeriodExtensionTextField;
	private PageElement extensionClaimAmountOfDiscoveryPeriodExtensionTextfield;
	private PageElement underClaimsAttachEntityCoverageForEPLIDropDown;
	private PageElement subLimitOfEntityCoverageForEPLITextField;
	private PageElement extensionClaimAmountOfEntityCoverageForEPLITextfield;
	//IN
	private PageElement underClaimsAttachAccidentalPollutionLiability1Dropdown;
	private PageElement extensionClaimAmountOfAccidentalPollutionLiability1Textfield;
	private PageElement underClaimsAttachCarriageOfEffluentsOutsideThePremises1Dropdown;
	private PageElement extensionClaimAmountOfCarriageOfEffluentsOutsideThePremisesTextfield;
	private PageElement underClaimsAttachGodownCover1Dropdown;
	private PageElement extensionClaimAmountOfGodownCoverTextfield;
	private PageElement underClaimsAttachActOfGODCoverDropdown;
	private PageElement extensionClaimAmountOfActOfGODTextfield;
	private PageElement underClaimsAttachTechnicalCollaboratorsLiabilityDropdown;
	private PageElement subLimitOfAttachTechnicalCollaboratorsLiabilityTextfield;
	private PageElement extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextfield;
	private PageElement underClaimsAttachRunOffExtentionDropdown;
	private PageElement subLimitOfAttachRunOffExtensionTextfield;
	private PageElement extensionClaimAmountOfRunOffExtentionTextfield;
	//IT
	private PageElement doesTheJVHaveItsOwnEOCoverDropdown;
	private PageElement indemnityLimitForJointVenturePolicyTextfield;
	private PageElement extensionClaimAmountOfJointVentureEOCoverTextfield;
	private PageElement doesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCoverDropdown;
	private PageElement indemnityLimitForSubContractorsAndIndependentContractorsTextfield;
	private PageElement extensionClaimAmountOfSubContractorsAndIndependentContractorsEOCoverTextfield;
	private PageElement doesThePolicyCoverInternetServiceECommerceDropdown;
	private PageElement anyOneAccidentForInternetServiceECommerceTextfield;
	private PageElement deductibleForInternetServiceECommerceTextfield;
	private PageElement extensionClaimAmountOfInternetServiceOrECommerceTextfield;

	//LN
	private PageElement typeOfConstructionDropDown;

	//PP
	private PageElement underClaimsAttachEstatesList;
	private PageElement extensionClaimAmountOfEstatesText;
	private PageElement underClaimsAttachProductionList;
	private PageElement extensionClaimAmountOfProductionText;		
	private PageElement underClaimsAttachAccessToLimitedList;
	private PageElement extensionClaimAmountOfAccessToLimitedText;		
	private PageElement underClaimsAttachCivilList;
	private PageElement extensionClaimAmountOfCivilText;
	private PageElement underClaimsAttachAdditionalInsuredList;
	private PageElement extensionClaimAmountOfAdditionalInsuredText;
	private PageElement underClaimsAttachJointPropertyList;
	private PageElement extensionClaimAmountOfJointPropertyText;
	private PageElement underClaimsAttachCrisisManagementList;
	private PageElement extensionClaimAmountOfCrisisManagementText;
	//PR
	private PageElement underClaimsAttachProductList;
	private PageElement subLimitOfAttachProductLabel;
	private PageElement extensionClaimAmountOfProductText;	
	private PageElement underClaimsAttachRestorationList;
	private PageElement subLimitOfAttachRestorationLabel;
	private PageElement extensionClaimAmountOfRestorationText;	
	private PageElement underClaimsAttachThirdPartyList;
	private PageElement subLimitOfAttachThirdPartyLabel;
	private PageElement extensionClaimAmountOfThirdPartyText;	
	private PageElement underClaimsAttachProductGuaranteeList;
	private PageElement subLimitOfAttachProductGuaranteeLabel;
	private PageElement extensionClaimAmountOfProductGuaranteeText;	

	private PageElement underClaimsAttachFinancialLossList;
	private PageElement subLimitOfAttachFinancialLossLabel;
	private PageElement extensionClaimAmountOfFinancialLossText;
	//ST
	private PageElement underClaimsAttachAOC1AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC1AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC1AddonCoverTextField;
	private PageElement underClaimsattachAOC2AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC2AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC2AddonCoverTextField;
	private PageElement underClaimsattachAOC3AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC3AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC3AddonCoverTextField;
	private PageElement underClaimsattachAOC4AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC4AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC4AddonCoverTextField;
	private PageElement underClaimsattachAOC5AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC5AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC5AddonCoverTextField;
	private PageElement underClaimsattachAOC6AddonCoverDropDown;
	private PageElement subLimitAmountOfAOC6AddonCoverTextField;
	private PageElement extensionClaimAmountOfAOC6AddonCoverTextField;

	//PD
	private PageElement underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown;
	private PageElement underClaimsAttachIntellectualPropertyRightsDropdown;
	private PageElement subLimitOfAttachTechnicalCollaboratorsliabilityTextField;
	private PageElement extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField;
	private PageElement subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField;
	private PageElement extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField;
	private PageElement subLimitOfAttachIntellectualPropertyRightsTextField;
	private PageElement extensionClaimAmountOfIntellectualPropertyRightsTextField;


	public T3ClaimPropertyForMIS(WebDriver driver, String pageName) {
		super(driver, pageName);

		t3ClaimPropertyForCOTitle = new PageElement(By.xpath("//div//b[contains(text(),'T3-Claim Property for CO')]"), " T3-Claim Property for CO Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured Item Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")), "Insured Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")), "Insured Item Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backArrowButton = new PageElement(By.name("Previous"), "Back Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//-------------------------------------------------------------------------------------------------------------------------------------------------------------
		underClaimsAttachHiredVehicleCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Hired Vehicle Cover?')]/following::select"), "Under Claims attach Hired Vehicle Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachHiredVehicleCoverTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Hired Vehicle Cover')]/following::input"), "Sub Limit of attach Hired Vehicle Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfHiredVehicleCoverTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Hired Vehicle Cover')]/following::input"), "Extension Claim Amount of Hired Vehicle Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrierDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach RSMD at warehouse or at transshipment yard while in custody of carrier?')]/following::select"), "Under Claims attach RSMD at warehouse or at transshipment yard while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachRSMDTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach RSMD')]/following::input"), "Sub Limit of attach RSMD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfRSMDAtWarehouseTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of RSMD at warehouse or yard while in custody of carrier')]/following::input"), "Extension Claim Amount of RSMD at warehouse or yard while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachShortageDueCarrierDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Shortage due to theft or pilferage of cargo while in custody of carrier?')]/following::select"), "Under Claims attach Shortage due to theft or pilferage of cargo while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachShortageDueToTheftTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier')]/following::input"), "Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfShortageDueToTheftTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Shortage due to theft etc.,while in custody of carrier')]/following::input"), "Extension Claim Amount of Shortage due to theft etc.,while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachFloodOrWaterDamageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Flood or Water damage or damage by any other cargo?')]/following::select"), "Under Claims attach Flood or Water damage or damage by any other cargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachFloodOrWaterDamageTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier')]/following::input"), "Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfFloodTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Flood or Water damage or damage by any other cargo')]/following::input"), "Extension Claim Amount of Flood or Water damage or damage by any other cargo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachBreakageLeakageAndDamageHandlingDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Breakage, leakage and damage due to improper handling?')]/following::select"), "Under Claims attach Breakage, leakage and damage due to improper handling", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachBreakageLeakageAndDamageTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Breakage, leakage and damage due to improper handling')]/following::input"), "Sub Limit of attach Breakage, leakage and damage due to improper handling", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfBreakageLeakageAndDamageTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Breakage, leakage and damage due to improper handling')]/following::input"), "Extension Claim Amount of Breakage, leakage and damage due to improper handling", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//WC
		//sumInsuredTextField = new PageElement(By.xpath("//div[contains(text(),'Sum Insured')]"), "Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		funeralExpensesTextField = new PageElement(By.xpath("//div[contains(text(),'Funeral Expenses')]"), "Funeral Expenses Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//doYouWantMedicalExtensionDropdown = new PageElement(By.xpath("//div[contains(text(),'Do you want Medical Extension?')]"), "Do you want Medical Extension?", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//DO
		underClaimsAttachOutsideDirectorshipDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Outside directorship?')]/following::select"), "Under Claims attach Outside directorship?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfOutsideDirectorshipTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Outside directorship')]/following::input"), "Sub Limit of Outside directorship", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfOutsideDirectorshipTextField= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Outside directorship')]/following::input"), "Extension Claim Amount of Outside directorship", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimUnderSpousalExtensionDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Claim Under Spousal extension?')]/following::select"), "Claim Under Spousal extension?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfSpousalExtensionTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Spousal extension')]/following::input"), "Sub Limit of Spousal extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfSpousalExtensionTextField= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Spousal extension')]/following::input"), "Extension Claim Amount of Spousal extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachLegalHeirsAndRepresentativesDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Legal heirs and representatives?')]/following::select"), "Under Claims attach Legal heirs and representatives?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfLegalHeirsAndRepresentativesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Legal heirs and representatives')]/following::input"), "Sub Limit of Legal heirs and representatives", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfLegalHeirsAndRepresentativesTextfield= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Legal heirs and representatives')]/following::input"), "Extension Claim Amount of Legal heirs and representatives", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachEntityCoverageForSecuritiesOnlyDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Entity coverage for securities only?')]/following::select"), "Under Claims attach Legal heirs and representatives?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfEntityCoverageForSecuritiesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Entity coverage for securities')]/following::input"), "Sub Limit of Legal heirs and representatives", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfEntityCoverageForSecuritiesOnlyTextField= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Entity coverage for securities only')]/following::input"), "Extension Claim Amount of Legal heirs and representatives", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachInitialPublicOfferingDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Initial public offering?')]/following::select"), "Under Claims attach Initial public offering?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfInitialPublicOfferingTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Initial public offering')]/following::input"), "Sub Limit of Initial public offering", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfInitialPublicOfferingTextField= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Initial public offering')]/following::input"), "Extension Claim Amount of Initial public offering", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		underClaimsAttachOtherAdditionalExtensionsDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Other additional extensions?')]/following::select"), "Under Claims attach Other additional extensions?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfOtherAdditionalExtensionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Other additional extensions')]/following::input"), "Sub Limit of Other additional extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfOtherAdditionalExtensionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Other additional extensions')]/following::input"), "Extension Claim Amount of Other additional extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		crisisCommunicationCoverShouldBeAlsoprovidedAdditionalCoverDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Crisis Communication cover should be also provided as an additional cover')]/following::select"), "Crisis Communication cover should be also provided as an additional cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfCrisisCommunicationCoverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Crisis Communication cover')]/following::input"), "Sub Limit of Crisis Communication cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfCrisisCommunicationCoverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Crisis Communication cover')]/following::input"), "Extension Claim Amount of Crisis Communication cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		courtAttendanceCostExtensionDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Court Attendance Cost Extension')]/following::select"), "Court Attendance Cost Extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfCourtAttendanceCostExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Court Attendance Cost Extension')]/following::input"), "Sub Limit of Court Attendance Cost Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountofCourtAttendanceCostExtensionTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Court Attendance Cost Extension')]/following::input"), "Extension Claim Amount of Court Attendance Cost Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskManagementExtensionDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Risk Management Extension')]/following::select"), "Risk Management Extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfRiskManagementExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Risk Management Extension')]/following::input"), "Sub Limit of Risk Management Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfRiskManagementExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Risk Management Extension')]/following::input"), "Extension Claim Amount of Risk Management Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pollutionDefenseCostExtensionDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Pollution defense Cost Extension')]/following::select"), "Pollution defense Cost Extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfPollutionDefenseCostExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Pollution defense Cost Extension')]/following::input"), "Sub Limit of Pollution defense Cost Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfPollutionDefenseCostExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Pollution defense Cost Extension')]/following::input"), "Extension Claim Amount of Pollution defense Cost Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		employmentPracticeLiabilityEPLIDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Employment Practice Liability(EPLI)')]/following::select"), "Employment Practice Liability(EPLI)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfEmploymentPracticeLiabilityEPLITextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Employment Practice Liability(EPLI)')]/following::input"), "Sub Limit of Employment Practice Liability(EPLI)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForEPLIExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for EPLI Extension ')]/following::input"), "Deductible for EPLI Extension ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfEmploymentPracticeLiabilityEPLITextfield= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Employment Practice Liability(EPLI)')]/following::input"), "Extension Claim Amount of Employment Practice Liability(EPLI)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		directorVersusDirectorExtensionsDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Director versus Director Extensions')]/following::select"), "Director versus Director Extensions", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SubLimitOfDirectorVersusDirectorExtensionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Director versus Director Extensions')]/following::input"), "Sub Limit of Director versus Director Extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfDirectorVersusDirectorExtensionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Director versus Director Extensions')]/following::input"), "Extension Claim Amount of Director versus Director Extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		shadowDirectorshipExtensionsDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Shadow Directorship extensions')]/following::select"), "Shadow Directorship extensions", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfShadowDirectorshipExtensionsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Shadow Directorship extensions')]/following::input"), "Sub Limit of Shadow Directorship extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfShadowDirectorshipExtensionsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Shadow Directorship extensions')]/following::input"), "Extension Claim Amount of Shadow Directorship extensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		autoAcquisitionEmploymentPracticeLiabilityDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Auto-acquisition Employment practice Liability')]/following::select"), "Auto-acquisition Employment practice Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAutoAcquisitionEmploymentPracticeLiabilityrTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Auto-acquisition Employment practice Liability')]/following::input"), "Sub Limit of Auto-acquisition Employment practice Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAutoAcquisitionSubsidiariesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Auto acquisition Subsidiaries')]/following::input"), "Extension Claim Amount of Auto acquisition Subsidiaries", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		autoAcquisitionComputerCrimeInsuranceDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Auto-acquisition Computer Crime Insurance')]/following::select"), "Auto-acquisition Computer Crime Insurance", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAutoAcquisitionComputerCrimeInsuranceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Auto-acquisition Computer Crime Insurance')]/following::input"), "Sub Limit of Auto-acquisition Computer Crime Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfComputerCrimeInsuranceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Computer Crime Insurance')]/following::input"), "Extension Claim Amount of Computer Crime Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		autoAcquisitionInfidelityInsuranceCoverDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Auto-acquisition Infidelity Insurance Cover')]/following::select"), "Auto-acquisition Infidelity Insurance Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAutoAcquisitionInfidelityInsuranceCoverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Auto-acquisition Infidelity Insurance Cover')]/following::input"), "Sub Limit of Auto-acquisition Infidelity Insurance Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfInfidelityInsuranceCoverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Infidelity Insurance Cover')]/following::input"), "Extension Claim Amount of Infidelity Insurance Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discoveryPeriodExtensionDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Discovery Period Extension')]/following::select"), "Discovery Period Extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfDiscoveryPeriodExtensionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Discovery Period Extension')]/following::input"), "Sub Limit of Discovery Period Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfDiscoveryPeriodExtensionTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Discovery Period Extension')]/following::input"), "Extension Claim Amount of Discovery Period Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachEntityCoverageForEPLIDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Entity coverage for EPLI?')]/following::select"), "Under Claims attach Entity coverage for EPLI?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfEntityCoverageForEPLITextField=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Entity coverage for EPLI')]/following::input"), "Sub Limit of Entity coverage for EPLI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfEntityCoverageForEPLITextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Entity coverage for EPLI')]/following::input"), "Extension Claim Amount of Entity coverage for EPLI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//IN
		underClaimsAttachAccidentalPollutionLiability1Dropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Accidental pollution liability? -1')]/following::select"),"Under Claims Attach Accidental Pollution Liability 1 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfAccidentalPollutionLiability1Textfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Accidental Pollution Liability - 1')]/following::input"),"Extension Claim Amount Of Accidental Pollution Liability 1 Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachCarriageOfEffluentsOutsideThePremises1Dropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Carriage of effluents (Outside) the premises? -1')]/following::select"),"Under Claims Attach Carriage Of Effluents Outside The Premises 1 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfCarriageOfEffluentsOutsideThePremisesTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Carriage of effluents (Outside) the premises')]/following::input"),"Extension Claim Amount Of Carriage Of Effluents Outside The Premises Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachGodownCover1Dropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Godown cover? -1')]/following::select"),"Under Claims Attach Godown Cover 1 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfGodownCoverTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Godown Cover')]/following::input"),"Extension Claim Amount Of Godown Cover Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachActOfGODCoverDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Act of GOD cover?')]/following::select"),"Under Claims Attach Act Of GOD Cover Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfActOfGODTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Act of GOD')]/following::input"),"Extension Claim Amount Of Act Of GOD Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachTechnicalCollaboratorsLiabilityDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Technical collaborators liability')]/following::select"),"Under Claims Attach Technical Collaborators Liability Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachTechnicalCollaboratorsLiabilityTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Technical collaborators liability')]/following::input"),"Sub Limit Of Attach Technical Collaborators Liability Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Technical Collaborators Liability')]/following::input"),"Extension Claim Amount Of Technical Collaborators Liability Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachRunOffExtentionDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Run off extention?')]/following::select"),"Under Claims Attach Run Off Extention Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachRunOffExtensionTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Run off extension')]/following::input"),"Sub Limit Of Attach Run Off Extension Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfRunOffExtentionTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Run off Extention')]/following::input"),"Extension Claim Amount Of Run Off Extention Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//IT
		doesTheJVHaveItsOwnEOCoverDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Does the JV have its own EO cover')]/following::select"),"Does The JV Have Its Own EO Cover Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		indemnityLimitForJointVenturePolicyTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Indemnity limit for Joint Venture Policy')]/following::input"),"Indemnity Limit For Joint Venture Policy Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfJointVentureEOCoverTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Joint Venture EO Cover')]/following::input"),"Extension Claim Amount of Joint Venture EO Cover Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCoverDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Does the Sub-contractors and Independent contractors have their own EO cover')]/following::select"),"Does the Sub-contractors and Independent contractors have their own EO cover Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		indemnityLimitForSubContractorsAndIndependentContractorsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Indemnity limit for Sub-contractors and Independent contractors')]/following::input"),"Indemnity Limit For Sub Contractors And Independent Contractors Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfSubContractorsAndIndependentContractorsEOCoverTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Sub-Contractors and Independent Contractors EO Cover')]/following::input"),"Extension Claim Amount Of Sub Contractors And Independent Contractors EO Cover Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doesThePolicyCoverInternetServiceECommerceDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Does the policy cover Internet service/E-commerce')]/following::select"),"Does The Policy Cover Internet Service E Commerce Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentForInternetServiceECommerceTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Any One Accident for Internet service/E-commerce')]/following::input"),"Any One Accident For Internet Service E Commerce Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForInternetServiceECommerceTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Internet service/E-commerce')]/following::input"),"Deductible For Internet Service E Commerce Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfInternetServiceOrECommerceTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Internet Service or E-Commerce')]/following::input"),"Extension Claim Amount Of Internet Service Or E Commerce Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//LN
		typeOfConstructionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Construction - LN')]/following::select"), "Type of Construction - LN", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//
		underClaimsAttachEstatesList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Estates, Heirs and Legal representatives?')]/following::select"), "Under Claims Attach Estates List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfEstatesText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Estates, Heirs and Legal representatives')]/following::input"), "Extension Claim Amount Of Estates Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//2
		underClaimsAttachProductionList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Production for spousal property?')]/following::select"), "Under Claims Attach Production List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfProductionText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Production for spousal property')]/following::input"), "Extension Claim Amount Of Production Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//3
		underClaimsAttachAccessToLimitedList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Access to limited free legal advice?')]/following::select"), "Under Claims Attach Production List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfAccessToLimitedText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Access to limited free legal advice')]/following::input"), "Extension Claim Amount Of Access To Limited Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//4				
		underClaimsAttachCivilList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Civil penalties?')]/following::select"), "Under Claims Attach Civil List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfCivilText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Civil penalties')]/following::input"), "Extension Claim Amount Of Civil Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//5
		underClaimsAttachAdditionalInsuredList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Additional Insured?')]/following::select"), "Under Claims Attach Additional Insured List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfAdditionalInsuredText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Additional Insured')]/following::input"), "Extension Claim Amount Of Civil Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//6
		underClaimsAttachJointPropertyList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Joint Property?')]/following::select"), "Under Claims Attach Joint Property List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfJointPropertyText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Joint Property')]/following::input"), "Extension Claim Amount Of JointProperty Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//7
		underClaimsAttachCrisisManagementList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Crisis management expenses?')]/following::select"), "Under Claims Attach Joint Property List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfCrisisManagementText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Crisis management expenses')]/following::input"), "Extension Claim Amount Of Crisis Management Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//PR
		underClaimsAttachProductList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Product extortion expenses?')]/following::select"), "Under Claims Attach Product List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachProductLabel=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Product extortion expenses')]/following::input"), "Sub Limit Of Attach Product Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfProductText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Product Extortion Expenses')]/following::input"), "Extension Claim Amount Of Product Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		////2
		underClaimsAttachRestorationList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Restoration,replacement and refund expenses?')]/following::select"), "Under Claims Attach Restoration List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachRestorationLabel=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Restoration,replacement and refund expenses')]/following::input"), "Sub Limit Of Attach Restoration Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfRestorationText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Restoration,Replacement and Refund expenses')]/following::input"), "Extension Claim Amount Of Restoration Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		///3
		underClaimsAttachThirdPartyList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Third party recall expenses?')]/following::select"), "Under Claims Attach Third Party List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachThirdPartyLabel=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Third party recall expenses')]/following::input"), "Sub Limit Of Attach Third Party Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfThirdPartyText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Third Party Recall Expenses')]/following::input"), "Extension Claim Amount Of Third Party Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		////4
		underClaimsAttachProductGuaranteeList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Product guarantee?')]/following::select"), "Under Claims Attach Product Guarantee List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachProductGuaranteeLabel=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Product guarantee')]/following::input"), "Under Claims Attach Product Guarantee List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfProductGuaranteeText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Product Guarantee')]/following::input"), "Extension Claim Amount Of Product Guarantee Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		////5	
		underClaimsAttachFinancialLossList=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Financial loss?')]/following::select"), "Under Claims Attach Financial Loss List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachFinancialLossLabel=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Financial loss')]/following::input"), "Sub Limit Of Attach Financial Loss Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfFinancialLossText=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Financial Loss')]/following::input"), "Extension Claim Amount Of Financial Loss Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//ST
		underClaimsAttachAOC1AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC1 Addon Cover?')]/following::select"), "Under Claims attach AOC1 Addon", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC1AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC1 Addon Cover')]/following::input"), "Sub Limit Amount of AOC1 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC1AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC1 Addon Cover')]/following::input"), "Extension Claim Amount of AOC1 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsattachAOC2AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC2 Addon Cover?')]/following::select"), "Under Claims attach AOC2 Addon Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC2AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC2 Addon Cover')]/following::input"), "Sub Limit Amount of AOC2 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC2AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC2 Addon Cover')]/following::input"), "Extension Claim Amount of AOC2 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsattachAOC3AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC3 Addon Cover?')]/following::select"), "Under Claims attach AOC3 Addon Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC3AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC3 Addon Cover')]/following::input"), "Sub Limit Amount of AOC3 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC3AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC3 Addon Cover')]/following::input"), "Extension Claim Amount of AOC3 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsattachAOC4AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC4 Addon Cover?')]/following::select"), "Under Claims attach AOC4 Addon Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC4AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC4 Addon Cover')]/following::input"), "Sub Limit Amount of AOC4 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC4AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC4 Addon Cover')]/following::input"), "Extension Claim Amount of AOC4 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsattachAOC5AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC5 Addon Cover?')]/following::select"), "under Claims attach AOC5 Addon Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC5AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC5 Addon Cover')]/following::input"), "Sub Limit Amount of AOC5 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC5AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC5 Addon Cover')]/following::input"), "Extension Claim Amount of AOC5 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsattachAOC6AddonCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach AOC6 Addon Cover?')]/following::select"), "Under Claims attach AOC6 Addon Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountOfAOC6AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of AOC6 Addon Cover')]/following::input"), "Sub Limit Amount of AOC6 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAOC6AddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of AOC6 Addon Cover')]/following::input"), "Extension Claim Amount of AOC6 Addon Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PD
		underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Contractors/Sub-Contractors/Loan and License Manufacturer')]/following::select"), "Under Claims attach Contractors/Sub-Contractors/Loan and License Manufacturer Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		underClaimsAttachIntellectualPropertyRightsDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Intellectual property rights')]/following::select"), "Under Claims attach Intellectual property rights Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachTechnicalCollaboratorsliabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Technical collaborators liability')]/following::input"), "Sub Limit of attach Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Technical Collaborators Liability')]/following::input"), "Extension Claim Amount of Technical Collaborators Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Contractor/Sub-Contractor/Loan and License Manufacturer')]/following::input"), "Sub Limit of attach Contractor/Sub-Contractor/Loan and License Manufacturer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Contractors or Sub-Contrs or Loan,License Manufacturer')]/following::input"), "Extension Claim Amount of Contractors or Sub-Contrs or Loan,License Manufacturer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitOfAttachIntellectualPropertyRightsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Intellectual property rights')]/following::input"), "Sub Limit of attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfIntellectualPropertyRightsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Intellectual Property Rights')]/following::input"), "Extension Claim Amount of Intellectual Property Rights", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//WC
		doYouWantMedicalExtensionDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Do you want Medical Extension?')]/following::select"),"Do you want Medical Extension?",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"),"Sum Insured",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillT3ClaimPropertyForCOMIS(T3ClaimPropForMISEntity t3ClaimPropForMISEntity, CustomAssert assertReference){
		if(t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("add") || t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("edit")){
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachHiredVehicleCover")) {
				selectValueFromList(underClaimsAttachHiredVehicleCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachHiredVehicleCover"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigextensionClaimAmountOfHiredVehicleCover")) {
				clearAndSendKeys(extensionClaimAmountOfHiredVehicleCoverTextBox, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfHiredVehicleCover"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrier")) {
				selectValueFromList(underClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrierDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrier"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRSMDAtWarehouse")) {
				clearAndSendKeys(extensionClaimAmountOfRSMDAtWarehouseTextBox, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRSMDAtWarehouse"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachShortageDueCarrier")) {
				selectValueFromList(underClaimsAttachShortageDueCarrierDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachShortageDueCarrier"));
			}		
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfShortageDueToTheft")) {
				clearAndSendKeys(extensionClaimAmountOfShortageDueToTheftTextBox, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfShortageDueToTheft"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachFloodOrWaterDamage")) {
				selectValueFromList(underClaimsAttachFloodOrWaterDamageDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachFloodOrWaterDamage"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfFlood")) {
				clearAndSendKeys(extensionClaimAmountOfFloodTextBox, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfFlood"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigunderClaimsAttachBreakageLeakageAndDamageHandling")) {
				selectValueFromList(underClaimsAttachBreakageLeakageAndDamageHandlingDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachBreakageLeakageAndDamageHandling"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigextensionClaimAmountOfBreakageLeakageAndDamage")) {
				clearAndSendKeys(extensionClaimAmountOfBreakageLeakageAndDamageTextBox, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfBreakageLeakageAndDamage"));
			}	

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigfuneralExpenses")) {
				clearAndSendKeys(funeralExpensesTextField, t3ClaimPropForMISEntity.getStringValueForField("FuneralExpenses"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigdoYouWantMedicalExtension")) {
				selectValueFromList(doYouWantMedicalExtensionDropdown, t3ClaimPropForMISEntity.getStringValueForField("DoYouWantMedicalExtension"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, t3ClaimPropForMISEntity.getStringValueForField("SumInsured"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOutsideDirectorship")) {
				selectValueFromList(underClaimsAttachOutsideDirectorshipDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachOutsideDirectorshipDropDown"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOutsideDirectorshipTextField")) {
				clearAndSendKeys(extensionClaimAmountOfOutsideDirectorshipTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfOutsideDirectorshipTextField"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimUnderSpousalExtension")) {
				selectValueFromList(claimUnderSpousalExtensionDropDown, t3ClaimPropForMISEntity.getStringValueForField("ClaimUnderSpousalExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfSpousalExtension")) {
				clearAndSendKeys(extensionClaimAmountOfSpousalExtensionTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfSpousalExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachLegalHeirsAndRepresentatives")) {
				selectValueFromList(underClaimsAttachLegalHeirsAndRepresentativesDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachLegalHeirsAndRepresentatives"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfLegalHeirsAndRepresentatives")) {
				clearAndSendKeys(extensionClaimAmountOfLegalHeirsAndRepresentativesTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfLegalHeirsAndRepresentatives"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEntityCoverageForSecuritiesOnly")) {
				selectValueFromList(underClaimsAttachEntityCoverageForSecuritiesOnlyDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEntityCoverageForSecuritiesOnly"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEntityCoverageForSecuritiesOnly")) {
				clearAndSendKeys(extensionClaimAmountOfEntityCoverageForSecuritiesOnlyTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEntityCoverageForSecuritiesOnly"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachInitialPublicOffering")) {
				selectValueFromList(underClaimsAttachInitialPublicOfferingDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachInitialPublicOffering"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInitialPublicOffering")) {
				clearAndSendKeys(extensionClaimAmountOfInitialPublicOfferingTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInitialPublicOffering"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOtherAdditionalExtensions")) {
				selectValueFromList(underClaimsAttachOtherAdditionalExtensionsDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachOtherAdditionalExtensions"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInitialPublicOffering")) {
				clearAndSendKeys(extensionClaimAmountOfOtherAdditionalExtensionsTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfOtherAdditionalExtensions"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigCrisisCommunicationCoverShouldBeAlsoprovidedAdditionalCover")) {
				selectValueFromList(crisisCommunicationCoverShouldBeAlsoprovidedAdditionalCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("CrisisCommunicationCoverShouldBeAlsoprovidedAdditionalCover"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCrisisCommunicationCover")) {
				clearAndSendKeys(extensionClaimAmountOfCrisisCommunicationCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCrisisCommunicationCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigCourtAttendanceCostExtension")) {
				selectValueFromList(courtAttendanceCostExtensionDropDown, t3ClaimPropForMISEntity.getStringValueForField("CourtAttendanceCostExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountofCourtAttendanceCostExtension")) {
				clearAndSendKeys(extensionClaimAmountofCourtAttendanceCostExtensionTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountofCourtAttendanceCostExtension"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigRiskManagementExtension")) {
				selectValueFromList(riskManagementExtensionDropDown, t3ClaimPropForMISEntity.getStringValueForField("RiskManagementExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRiskManagementExtension")) {
				clearAndSendKeys(extensionClaimAmountOfRiskManagementExtensionTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRiskManagementExtension"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigPollutionDefenseCostExtension")) {
				selectValueFromList(pollutionDefenseCostExtensionDropDown, t3ClaimPropForMISEntity.getStringValueForField("PollutionDefenseCostExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfPollutionDefenseCostExtension")) {
				clearAndSendKeys(extensionClaimAmountOfPollutionDefenseCostExtensionTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfPollutionDefenseCostExtension"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigEmploymentPracticeLiabilityEPLI")) {
				selectValueFromList(employmentPracticeLiabilityEPLIDropDown, t3ClaimPropForMISEntity.getStringValueForField("EmploymentPracticeLiabilityEPLI"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEmploymentPracticeLiabilityEPLI")) {
				clearAndSendKeys(extensionClaimAmountOfEmploymentPracticeLiabilityEPLITextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEmploymentPracticeLiabilityEPLI"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDirectorVersusDirectorExtensions")) {
				selectValueFromList(directorVersusDirectorExtensionsDropDown, t3ClaimPropForMISEntity.getStringValueForField("DirectorVersusDirectorExtensions"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDirectorVersusDirectorExtensions")) {
				clearAndSendKeys(extensionClaimAmountOfDirectorVersusDirectorExtensionsTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfDirectorVersusDirectorExtensions"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigShadowDirectorshipExtensions")) {
				selectValueFromList(shadowDirectorshipExtensionsDropDown, t3ClaimPropForMISEntity.getStringValueForField("ShadowDirectorshipExtensions"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfShadowDirectorshipExtensions")) {
				clearAndSendKeys(extensionClaimAmountOfShadowDirectorshipExtensionsTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfShadowDirectorshipExtensions"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionEmploymentPracticeLiability")) {
				selectValueFromList(autoAcquisitionEmploymentPracticeLiabilityDropDown, t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionEmploymentPracticeLiability"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAutoAcquisitionSubsidiaries")) {
				clearAndSendKeys(extensionClaimAmountOfAutoAcquisitionSubsidiariesTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfShadowDirectorshipExtensions"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionInfidelityInsuranceCover")) {
				selectValueFromList(autoAcquisitionInfidelityInsuranceCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionInfidelityInsuranceCover"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInfidelityInsuranceCover")) {
				clearAndSendKeys(extensionClaimAmountOfInfidelityInsuranceCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInfidelityInsuranceCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionComputerCrimeInsurance")) {
				selectValueFromList(autoAcquisitionComputerCrimeInsuranceDropDown, t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionComputerCrimeInsurance"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfComputerCrimeInsurance")) {
				clearAndSendKeys(extensionClaimAmountOfComputerCrimeInsuranceTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfComputerCrimeInsurance"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDiscoveryPeriodExtension")) {
				selectValueFromList(discoveryPeriodExtensionDropDown, t3ClaimPropForMISEntity.getStringValueForField("DiscoveryPeriodExtension"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDiscoveryPeriodExtension")) {
				clearAndSendKeys(extensionClaimAmountOfDiscoveryPeriodExtensionTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfDiscoveryPeriodExtension"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEntityCoverageForEPLI")) {
				selectValueFromList(underClaimsAttachEntityCoverageForEPLIDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEntityCoverageForEPLI"));
			}	
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEntityCoverageForEPLI")) {
				clearAndSendKeys(extensionClaimAmountOfEntityCoverageForEPLITextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEntityCoverageForEPLI"));
			}


			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability1")) {
				selectValueFromList(underClaimsAttachAccidentalPollutionLiability1Dropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability1"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability1")) {
				clearAndSendKeys(extensionClaimAmountOfAccidentalPollutionLiability1Textfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability1"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCarriageOfEffluentsOutsideThePremises1")) {
				selectValueFromList(underClaimsAttachCarriageOfEffluentsOutsideThePremises1Dropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCarriageOfEffluentsOutsideThePremises1"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCarriageOfEffluentsOutsideThePremises")) {
				clearAndSendKeys(extensionClaimAmountOfCarriageOfEffluentsOutsideThePremisesTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCarriageOfEffluentsOutsideThePremises"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachGodownCover1")) {
				selectValueFromList(underClaimsAttachGodownCover1Dropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachGodownCover1"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfGodownCover")) {
				clearAndSendKeys(extensionClaimAmountOfGodownCoverTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfGodownCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGODCover")) {
				selectValueFromList(underClaimsAttachActOfGODCoverDropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachActOfGODCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActOfGOD")) {
				clearAndSendKeys(extensionClaimAmountOfActOfGODTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfActOfGOD"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTechnicalCollaboratorsLiability")) {
				selectValueFromList(underClaimsAttachTechnicalCollaboratorsLiabilityDropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachTechnicalCollaboratorsLiability"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfTechnicalCollaboratorsLiability"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRunOffExtention")) {
				selectValueFromList(underClaimsAttachRunOffExtentionDropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRunOffExtention"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRunOffExtention")) {
				clearAndSendKeys(extensionClaimAmountOfRunOffExtentionTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRunOffExtention"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesTheJVHaveItsOwnEOCover")) {
				selectValueFromList(doesTheJVHaveItsOwnEOCoverDropdown, t3ClaimPropForMISEntity.getStringValueForField("DoesTheJVHaveItsOwnEOCover"));
			}
			//Sachin
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigIndemnityLimitForJointVenturePolicy")) {
				clearAndSendKeys(indemnityLimitForJointVenturePolicyTextfield, t3ClaimPropForMISEntity.getStringValueForField("IndemnityLimitForJointVenturePolicy"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointVentureEOCover")) {
				clearAndSendKeys(extensionClaimAmountOfJointVentureEOCoverTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfJointVentureEOCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCover")) {
				selectValueFromList(doesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCoverDropdown, t3ClaimPropForMISEntity.getStringValueForField("DoesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfSubContractorsAndIndependentContractorsEOCover")) {
				clearAndSendKeys(extensionClaimAmountOfSubContractorsAndIndependentContractorsEOCoverTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfSubContractorsAndIndependentContractorsEOCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesThePolicyCoverInternetServiceECommerce")) {
				selectValueFromList(doesThePolicyCoverInternetServiceECommerceDropdown, t3ClaimPropForMISEntity.getStringValueForField("DoesThePolicyCoverInternetServiceECommerce"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInternetServiceOrECommerce")) {
				clearAndSendKeys(extensionClaimAmountOfInternetServiceOrECommerceTextfield, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInternetServiceOrECommerce"));
			}
			//LN
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
				selectValueFromList(typeOfConstructionDropDown, t3ClaimPropForMISEntity.getStringValueForField("TypeOfConstruction"));
			}
			//PP
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEstates")) {
				selectValueFromList(underClaimsAttachEstatesList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEstates"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEstates")) {
				clearAndSendKeys(extensionClaimAmountOfEstatesText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEstates"));
			}
			//2
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProduction")) {
				selectValueFromList(underClaimsAttachProductionList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProduction"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProduction")) {
				clearAndSendKeys(extensionClaimAmountOfProductionText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProduction"));
			}				
			//3
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccessToLimited")) {
				selectValueFromList(underClaimsAttachAccessToLimitedList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAccessToLimited"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccessToLimited")) {
				clearAndSendKeys(extensionClaimAmountOfAccessToLimitedText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAccessToLimited"));
			}
			//4
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCivil")) {
				selectValueFromList(underClaimsAttachCivilList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCivil"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCivil")) {
				clearAndSendKeys(extensionClaimAmountOfCivilText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCivil"));
			}
			//5
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAdditionalInsured")) {
				selectValueFromList(underClaimsAttachAdditionalInsuredList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAdditionalInsured"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAdditionalInsured")) {
				clearAndSendKeys(extensionClaimAmountOfAdditionalInsuredText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAdditionalInsured"));
			}	
			//6
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachJointProperty")) {
				selectValueFromList(underClaimsAttachJointPropertyList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachJointProperty"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointProperty")) {
				clearAndSendKeys(extensionClaimAmountOfJointPropertyText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfJointProperty"));
			}	
			//7			
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCrisisManagement")) {
				selectValueFromList(underClaimsAttachCrisisManagementList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCrisisManagement"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCrisisManagement")) {
				clearAndSendKeys(extensionClaimAmountOfCrisisManagementText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCrisisManagement"));
			}
			//PR
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProduct")) {
				selectValueFromList(underClaimsAttachProductList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProduct"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProduct")) {
				clearAndSendKeys(extensionClaimAmountOfProductText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProduct"));
			}
			////2
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRestoration")) {
				selectValueFromList(underClaimsAttachRestorationList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRestoration"));
			}		
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRestoration")) {
				clearAndSendKeys(extensionClaimAmountOfRestorationText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRestoration"));
			}
			/////3

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachThirdParty")) {
				selectValueFromList(underClaimsAttachThirdPartyList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachThirdParty"));
			}		
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfThirdParty")) {
				clearAndSendKeys(extensionClaimAmountOfThirdPartyText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfThirdParty"));
			}
			////4
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProductGuarantee")) {
				selectValueFromList(underClaimsAttachProductGuaranteeList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProductGuarantee"));
			}		
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProductGuarantee")) {
				clearAndSendKeys(extensionClaimAmountOfProductGuaranteeText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProductGuarantee"));
			}
			////5
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachFinancialLoss")) {
				selectValueFromList(underClaimsAttachFinancialLossList, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachFinancialLoss"));
			}		
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfFinancialLoss")) {
				clearAndSendKeys(extensionClaimAmountOfFinancialLossText, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfFinancialLoss"));
			}
			//ST

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC1AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC1AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC1AddonCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC2AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC2AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC2AddonCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC3AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC3AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC3AddonCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC4AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC4AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC4AddonCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC5AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC5AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC5AddonCover"));
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC6AddonCover")) {
				clearAndSendKeys(extensionClaimAmountOfAOC6AddonCoverTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC6AddonCover"));
			}

			//PD
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsliability")) {
				clearAndSendKeys(subLimitOfAttachTechnicalCollaboratorsliabilityTextField, t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsliability"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfTechnicalCollaboratorsLiability"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturer")) {
				clearAndSendKeys(subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField, t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturer"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturer")) {
				clearAndSendKeys(extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturer"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachIntellectualPropertyRights")) {
				clearAndSendKeys(subLimitOfAttachIntellectualPropertyRightsTextField, t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachIntellectualPropertyRights"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfIntellectualPropertyRights")) {
				clearAndSendKeys(extensionClaimAmountOfIntellectualPropertyRightsTextField, t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfIntellectualPropertyRights"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturer")) {
				selectValueFromList(underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown, t3ClaimPropForMISEntity.getStringValueForField("underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturer"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachIntellectualPropertyRights")) {
				selectValueFromList(underClaimsAttachIntellectualPropertyRightsDropdown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachIntellectualPropertyRights"));
			}
			if(!(t3ClaimPropForMISEntity.getStringValueForField("Product").equalsIgnoreCase("PP"))){
				fillClaimAttachAddonDeatailsCover(t3ClaimPropForMISEntity, assertReference);
			}

		}
		else if(t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("verify")){
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigPolicyNumberLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("PolicyNumberLabel"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimDateLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ClaimDateLabel"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimStatusLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ClaimStatusLabel"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigProductCodeLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ProductCodeLabel"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigCauseOfLossLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("CauseOfLossLabel"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigInsuredSerialNoLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("InsuredSerialNoLabel"), fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigInsuredItemCodeLabel")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("InsuredItemCodeLabel"), fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//-------------------------------------------------------------------------------------------------------------------------------------------------------------
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachHiredVehicleCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachHiredVehicleCover"), fetchValueFromList(underClaimsAttachHiredVehicleCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachHiredVehicleCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachHiredVehicleCover"), fetchValueFromFields(subLimitOfAttachHiredVehicleCoverTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfHiredVehicleCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfHiredVehicleCover"), fetchValueFromFields(extensionClaimAmountOfHiredVehicleCoverTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrier"), fetchValueFromList(underClaimsAttachRSMDAtWarehouseOrAtTransshipmentyardWhileInCustodyOfCarrierDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachRSMD")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachRSMD"), fetchValueFromTextFields(subLimitOfAttachRSMDTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRSMDAtWarehouse")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRSMDAtWarehouse"), fetchValueFromTextFields(extensionClaimAmountOfRSMDAtWarehouseTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachShortageDueCarrier")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachShortageDueCarrier"), fetchValueFromList(underClaimsAttachShortageDueCarrierDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachShortageDueToTheft")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachShortageDueToTheft"), fetchValueFromTextFields(subLimitOfAttachShortageDueToTheftTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfShortageDueToTheft")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfShortageDueToTheft"), fetchValueFromTextFields(extensionClaimAmountOfShortageDueToTheftTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachFloodOrWaterDamage")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachFloodOrWaterDamage"), fetchValueFromList(underClaimsAttachFloodOrWaterDamageDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachFloodOrWaterDamage")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachFloodOrWaterDamage"), fetchValueFromTextFields(subLimitOfAttachFloodOrWaterDamageTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfFlood")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfFlood"), fetchValueFromTextFields(extensionClaimAmountOfFloodTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachBreakageLeakageAndDamageHandling")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachBreakageLeakageAndDamageHandling"), fetchValueFromList(underClaimsAttachBreakageLeakageAndDamageHandlingDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachBreakageLeakageAndDamage")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachBreakageLeakageAndDamage"), fetchValueFromTextFields(subLimitOfAttachBreakageLeakageAndDamageTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfBreakageLeakageAndDamage")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfBreakageLeakageAndDamage"), fetchValueFromTextFields(extensionClaimAmountOfBreakageLeakageAndDamageTextBox), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigdoYouWantMedicalExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DoYouWantMedicalExtension"), fetchValueFromList(doYouWantMedicalExtensionDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigfuneralExpenses")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("FuneralExpenses"), fetchValueFromList(funeralExpensesTextField), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOutsideDirectorship")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachOutsideDirectorship"), fetchValueFromList(underClaimsAttachOutsideDirectorshipDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfOutsideDirectorship")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfOutsideDirectorship"), fetchValueFromFields(subLimitOfOutsideDirectorshipTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOutsideDirectorship")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfOutsideDirectorship"), fetchValueFromFields(extensionClaimAmountOfOutsideDirectorshipTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimUnderSpousalExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ClaimUnderSpousalExtension"), fetchValueFromList(claimUnderSpousalExtensionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfSpousalExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfSpousalExtension"), fetchValueFromFields(subLimitOfSpousalExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfSpousalExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfSpousalExtension"), fetchValueFromFields(extensionClaimAmountOfSpousalExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachLegalHeirsAndRepresentatives"), fetchValueFromList(underClaimsAttachLegalHeirsAndRepresentativesDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfLegalHeirsAndRepresentatives"), fetchValueFromFields(subLimitOfLegalHeirsAndRepresentativesTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfLegalHeirsAndRepresentatives"), fetchValueFromFields(extensionClaimAmountOfLegalHeirsAndRepresentativesTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEntityCoverageForSecuritiesOnly")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEntityCoverageForSecuritiesOnly"), fetchValueFromList(underClaimsAttachEntityCoverageForSecuritiesOnlyDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfEntityCoverageForSecurities")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfEntityCoverageForSecurities"), fetchValueFromFields(subLimitOfEntityCoverageForSecuritiesTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEntityCoverageForSecuritiesOnly")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEntityCoverageForSecuritiesOnly"), fetchValueFromFields(extensionClaimAmountOfEntityCoverageForSecuritiesOnlyTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachInitialPublicOffering")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachInitialPublicOffering"), fetchValueFromList(underClaimsAttachInitialPublicOfferingDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfInitialPublicOffering")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfInitialPublicOffering"), fetchValueFromFields(subLimitOfInitialPublicOfferingTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInitialPublicOffering")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInitialPublicOffering"), fetchValueFromFields(extensionClaimAmountOfInitialPublicOfferingTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOtherAdditionalExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachOtherAdditionalExtensions"), fetchValueFromList(underClaimsAttachOtherAdditionalExtensionsDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfOtherAdditionalExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfOtherAdditionalExtensions"), fetchValueFromFields(subLimitOfOtherAdditionalExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOtherAdditionalExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfOtherAdditionalExtensions"), fetchValueFromFields(extensionClaimAmountOfOtherAdditionalExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigCrisisCommunicationCoverShouldBeAlsoprovidedAdditionalCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("CrisisCommunicationCoverShouldBeAlsoprovidedAdditionalCover"), fetchValueFromList(crisisCommunicationCoverShouldBeAlsoprovidedAdditionalCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfCrisisCommunicationCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfCrisisCommunicationCover"), fetchValueFromFields(subLimitOfCrisisCommunicationCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCrisisCommunicationCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCrisisCommunicationCover"), fetchValueFromFields(extensionClaimAmountOfCrisisCommunicationCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigCourtAttendanceCostExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("CourtAttendanceCostExtension"), fetchValueFromList(courtAttendanceCostExtensionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfCourtAttendanceCostExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfCourtAttendanceCostExtension"), fetchValueFromFields(subLimitOfCourtAttendanceCostExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountofCourtAttendanceCostExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountofCourtAttendanceCostExtension"), fetchValueFromFields(extensionClaimAmountofCourtAttendanceCostExtensionTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigRiskManagementExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("RiskManagementExtension"), fetchValueFromList(riskManagementExtensionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfRiskManagementExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfRiskManagementExtension"), fetchValueFromFields(subLimitOfRiskManagementExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRiskManagementExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRiskManagementExtension"), fetchValueFromFields(extensionClaimAmountOfRiskManagementExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigPollutionDefenseCostExtensionDropDown")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("PollutionDefenseCostExtension"), fetchValueFromList(pollutionDefenseCostExtensionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfPollutionDefenseCostExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfPollutionDefenseCostExtension"), fetchValueFromFields(subLimitOfPollutionDefenseCostExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfPollutionDefenseCostExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfPollutionDefenseCostExtension"), fetchValueFromFields(extensionClaimAmountOfPollutionDefenseCostExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("EmploymentPracticeLiabilityEPLI"), fetchValueFromList(employmentPracticeLiabilityEPLIDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfEmploymentPracticeLiabilityEPLI"), fetchValueFromFields(subLimitOfEmploymentPracticeLiabilityEPLITextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDeductibleForEPLIExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DeductibleForEPLIExtension"), fetchValueFromFields(deductibleForEPLIExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEmploymentPracticeLiabilityEPLI"), fetchValueFromFields(extensionClaimAmountOfEmploymentPracticeLiabilityEPLITextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DirectorVersusDirectorExtensions"), fetchValueFromList(directorVersusDirectorExtensionsDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfDirectorVersusDirectorExtensions"), fetchValueFromFields(SubLimitOfDirectorVersusDirectorExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfDirectorVersusDirectorExtensions"), fetchValueFromFields(extensionClaimAmountOfDirectorVersusDirectorExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigShadowDirectorshipExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ShadowDirectorshipExtensions"), fetchValueFromList(shadowDirectorshipExtensionsDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfShadowDirectorshipExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfShadowDirectorshipExtensions"), fetchValueFromFields(subLimitOfShadowDirectorshipExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfShadowDirectorshipExtensions")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfShadowDirectorshipExtensions"), fetchValueFromFields(extensionClaimAmountOfShadowDirectorshipExtensionsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionEmploymentPracticeLiability")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionEmploymentPracticeLiability"), fetchValueFromList(autoAcquisitionEmploymentPracticeLiabilityDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAutoAcquisitionEmploymentPracticeLiabilityr")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAutoAcquisitionEmploymentPracticeLiabilityr"), fetchValueFromFields(subLimitOfAutoAcquisitionEmploymentPracticeLiabilityrTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAutoAcquisitionSubsidiaries")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAutoAcquisitionSubsidiaries"), fetchValueFromFields(extensionClaimAmountOfAutoAcquisitionSubsidiariesTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionInfidelityInsuranceCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionInfidelityInsuranceCover"), fetchValueFromList(autoAcquisitionInfidelityInsuranceCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAutoAcquisitionInfidelityInsuranceCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAutoAcquisitionInfidelityInsuranceCover"), fetchValueFromFields(subLimitOfAutoAcquisitionInfidelityInsuranceCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInfidelityInsuranceCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInfidelityInsuranceCover"), fetchValueFromFields(extensionClaimAmountOfInfidelityInsuranceCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAutoAcquisitionComputerCrimeInsurance")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("AutoAcquisitionComputerCrimeInsurance"), fetchValueFromList(autoAcquisitionComputerCrimeInsuranceDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAutoAcquisitionComputerCrimeInsurance")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAutoAcquisitionComputerCrimeInsurance"), fetchValueFromFields(subLimitOfAutoAcquisitionComputerCrimeInsuranceTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfComputerCrimeInsurance")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfComputerCrimeInsurance"), fetchValueFromFields(extensionClaimAmountOfComputerCrimeInsuranceTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDiscoveryPeriodExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("discoveryPeriodExtension"), fetchValueFromList(discoveryPeriodExtensionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfDiscoveryPeriodExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfDiscoveryPeriodExtension"), fetchValueFromFields(subLimitOfDiscoveryPeriodExtensionTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDiscoveryPeriodExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfDiscoveryPeriodExtension"), fetchValueFromFields(extensionClaimAmountOfDiscoveryPeriodExtensionTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEntityCoverageForEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEntityCoverageForEPLI"), fetchValueFromList(underClaimsAttachEntityCoverageForEPLIDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfEntityCoverageForEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfEntityCoverageForEPLI"), fetchValueFromFields(subLimitOfEntityCoverageForEPLITextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEntityCoverageForEPLI")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEntityCoverageForEPLI"), fetchValueFromFields(extensionClaimAmountOfEntityCoverageForEPLITextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability1")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability1"),fetchValueFromList(underClaimsAttachAccidentalPollutionLiability1Dropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability1")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability1"),fetchValueFromTextFields(extensionClaimAmountOfAccidentalPollutionLiability1Textfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCarriageOfEffluentsOutsideThePremises1")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCarriageOfEffluentsOutsideThePremises1"),fetchValueFromList(underClaimsAttachCarriageOfEffluentsOutsideThePremises1Dropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCarriageOfEffluentsOutsideThePremises")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCarriageOfEffluentsOutsideThePremises"),fetchValueFromTextFields(extensionClaimAmountOfCarriageOfEffluentsOutsideThePremisesTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachGodownCover1")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachGodownCover1"),fetchValueFromList(underClaimsAttachGodownCover1Dropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfGodownCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfGodownCover"),fetchValueFromTextFields(extensionClaimAmountOfGodownCoverTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGODCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachActOfGODCover"),fetchValueFromList(underClaimsAttachActOfGODCoverDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActOfGOD")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfActOfGOD"),fetchValueFromTextFields(extensionClaimAmountOfActOfGODTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachTechnicalCollaboratorsLiability"),fetchValueFromList(underClaimsAttachTechnicalCollaboratorsLiabilityDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsLiability"),fetchValueFromTextFields(subLimitOfAttachTechnicalCollaboratorsLiabilityTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfTechnicalCollaboratorsLiability"),fetchValueFromTextFields(extensionClaimAmountOfTechnicalCollaboratorsLiabilityTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRunOffExtention")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRunOffExtention"),fetchValueFromList(underClaimsAttachRunOffExtentionDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachRunOffExtension")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachRunOffExtension"),fetchValueFromTextFields(subLimitOfAttachRunOffExtensionTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRunOffExtention")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRunOffExtention"),fetchValueFromTextFields(extensionClaimAmountOfRunOffExtentionTextfield), AssertionType.WARNING);
			}
			//Sachin
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesTheJVHaveItsOwnEOCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DoesTheJVHaveItsOwnEOCover"),fetchValueFromList(doesTheJVHaveItsOwnEOCoverDropdown), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigIndemnityLimitForJointVenturePolicy")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("IndemnityLimitForJointVenturePolicy"),fetchValueFromTextFields(indemnityLimitForJointVenturePolicyTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointVentureEOCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfJointVentureEOCover"),fetchValueFromTextFields(extensionClaimAmountOfJointVentureEOCoverTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DoesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCover"),fetchValueFromList(doesTheSubContractorsAndIndependentContractorsHaveTheirOwnEOCoverDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigIndemnityLimitForSubContractorsAndIndependentContractors")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("IndemnityLimitForSubContractorsAndIndependentContractors"),fetchValueFromTextFields(indemnityLimitForSubContractorsAndIndependentContractorsTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfSubContractorsAndIndependentContractorsEOCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfSubContractorsAndIndependentContractorsEOCover"),fetchValueFromTextFields(extensionClaimAmountOfSubContractorsAndIndependentContractorsEOCoverTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDoesThePolicyCoverInternetServiceECommerce")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DoesThePolicyCoverInternetServiceECommerce"),fetchValueFromList(doesThePolicyCoverInternetServiceECommerceDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAnyOneAccidentForInternetServiceECommerce")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("AnyOneAccidentForInternetServiceECommerce"),fetchValueFromTextFields(anyOneAccidentForInternetServiceECommerceTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDeductibleForInternetServiceECommerce")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("DeductibleForInternetServiceECommerce"),fetchValueFromTextFields(deductibleForInternetServiceECommerceTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInternetServiceOrECommerce")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfInternetServiceOrECommerce"),fetchValueFromTextFields(extensionClaimAmountOfInternetServiceOrECommerceTextfield), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("TypeOfConstruction"), fetchValueFromList(typeOfConstructionDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachEstates")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachEstates"), fetchValueFromList(underClaimsAttachEstatesList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfEstates")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfEstates"), fetchValueFromTextFields(extensionClaimAmountOfEstatesText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProduction")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProduction"), fetchValueFromList(underClaimsAttachProductionList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProduction")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProduction"), fetchValueFromTextFields(extensionClaimAmountOfProductionText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccessToLimited")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAccessToLimited"), fetchValueFromList(underClaimsAttachAccessToLimitedList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccessToLimited")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAccessToLimited"), fetchValueFromTextFields(extensionClaimAmountOfAccessToLimitedText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCivil")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCivil"), fetchValueFromList(underClaimsAttachCivilList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCivil")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCivil"), fetchValueFromTextFields(extensionClaimAmountOfCivilText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAdditionalInsured")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAdditionalInsured"), fetchValueFromList(underClaimsAttachAdditionalInsuredList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAdditionalInsured")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAdditionalInsured"), fetchValueFromTextFields(extensionClaimAmountOfAdditionalInsuredText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachJointProperty")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachJointProperty"), fetchValueFromList(underClaimsAttachJointPropertyList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointProperty")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfJointProperty"), fetchValueFromTextFields(extensionClaimAmountOfJointPropertyText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachCrisisManagement")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachCrisisManagement"), fetchValueFromList(underClaimsAttachCrisisManagementList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfCrisisManagement")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfCrisisManagement"), fetchValueFromTextFields(extensionClaimAmountOfCrisisManagementText), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProduct")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProduct"), fetchValueFromList(underClaimsAttachProductList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachProduct")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachProduct"), fetchValueFromFields(subLimitOfAttachProductLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProduct")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProduct"), fetchValueFromTextFields(extensionClaimAmountOfProductText), AssertionType.WARNING);
			}
			////2
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachRestoration")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachRestoration"), fetchValueFromList(underClaimsAttachRestorationList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachRestoration")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachRestoration"), fetchValueFromFields(subLimitOfAttachRestorationLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfRestoration")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfRestoration"), fetchValueFromTextFields(extensionClaimAmountOfRestorationText), AssertionType.WARNING);
			}
			////3
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachThirdParty")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachThirdParty"), fetchValueFromList(underClaimsAttachThirdPartyList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachThirdParty")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachThirdParty"), fetchValueFromFields(subLimitOfAttachThirdPartyLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfThirdParty")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfThirdParty"), fetchValueFromTextFields(extensionClaimAmountOfThirdPartyText), AssertionType.WARNING);
			}
			////4
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachProductGuarantee")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachProductGuarantee"), fetchValueFromList(underClaimsAttachProductGuaranteeList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachProductGuarantee")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachProductGuarantee"), fetchValueFromFields(subLimitOfAttachProductGuaranteeLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfProductGuarantee")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfProductGuarantee"), fetchValueFromTextFields(extensionClaimAmountOfProductGuaranteeText), AssertionType.WARNING);
			}	
			////5
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachFinancialLoss")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachFinancialLoss"), fetchValueFromList(underClaimsAttachFinancialLossList), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachFinancialLoss")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachFinancialLoss"), fetchValueFromFields(subLimitOfAttachFinancialLossLabel), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfFinancialLoss")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfFinancialLoss"), fetchValueFromTextFields(extensionClaimAmountOfFinancialLossText), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC1AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC1AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC1AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC1AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC1AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC1AddonCoverTextField), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC2AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC2AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC2AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC2AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC2AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC2AddonCoverTextField), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC3AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC3AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC3AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC3AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC3AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC3AddonCoverTextField), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC4AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC4AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC4AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC4AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC4AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC4AddonCoverTextField), AssertionType.WARNING);
			}

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC5AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC5AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC5AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC5AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC5AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC5AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC6AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC6AddonCover"), fetchValueFromList(underClaimsattachAOC6AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitAmountOfAOC6AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitAmountOfAOC6AddonCover"), fetchValueFromTextFields(subLimitAmountOfAOC6AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAOC6AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfAOC6AddonCover"), fetchValueFromTextFields(extensionClaimAmountOfAOC6AddonCoverTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturer")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachContractorSubContractorLoanAndLicenseManufacturer"), fetchValueFromTextFields(subLimitOfAttachContractorSubContractorLoanAndLicenseManufacturerTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturer")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturer"), fetchValueFromTextFields(extensionClaimAmountOfContractorsOrSubContrsOrLoanLicenseManufacturerTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachIntellectualPropertyRights")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("SubLimitOfAttachIntellectualPropertyRights"), fetchValueFromTextFields(subLimitOfAttachIntellectualPropertyRightsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfIntellectualPropertyRights")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("ExtensionClaimAmountOfIntellectualPropertyRights"), fetchValueFromTextFields(extensionClaimAmountOfIntellectualPropertyRightsTextField), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturer")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturer"), fetchValueFromList(underClaimsAttachContractorsSubContractorsLoanAndLicenseManufacturerDropdown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachIntellectualPropertyRights")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachIntellectualPropertyRights"), fetchValueFromList(underClaimsAttachIntellectualPropertyRightsDropdown), AssertionType.WARNING);
			}
			if(!(t3ClaimPropForMISEntity.getStringValueForField("Product").equalsIgnoreCase("PP"))){
				fillClaimAttachAddonDeatailsCover(t3ClaimPropForMISEntity, assertReference);
			}
		}
	}


	public void proceedButtonT4ClaimProperty(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigNextArrowButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+t3ClaimPropForMISEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}

	public void navigateToMainAttributePage(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTitle);
		}
	}
	public void navigateToDocument(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}

	public void navigateToInsuredItemDetail(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}

	public void navigateToInsuredItemAttribute(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}

	public void fillClaimAttachAddonDeatailsCover(T3ClaimPropForMISEntity t3ClaimPropForMISEntity, CustomAssert assertReference){
		if(t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("add") || t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("edit")){

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAOC1AddonCover")) {
				selectValueFromList(underClaimsAttachAOC1AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAOC1AddonCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC2AddonCover")) {
				selectValueFromList(underClaimsattachAOC2AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC2AddonCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC3AddonCover")) {
				selectValueFromList(underClaimsattachAOC3AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC3AddonCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC4AddonCover")) {
				selectValueFromList(underClaimsattachAOC4AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC4AddonCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC5AddonCover")) {
				selectValueFromList(underClaimsattachAOC5AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC5AddonCover"));
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC6AddonCover")) {
				selectValueFromList(underClaimsattachAOC6AddonCoverDropDown, t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC6AddonCover"));
			}
		}
		else if(t3ClaimPropForMISEntity.getAction().equalsIgnoreCase("verify")){

			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAOC1AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsAttachAOC1AddonCover"), fetchValueFromList(underClaimsAttachAOC1AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC2AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC2AddonCover"), fetchValueFromList(underClaimsattachAOC2AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC3AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC3AddonCover"), fetchValueFromList(underClaimsattachAOC3AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC4AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC4AddonCover"), fetchValueFromList(underClaimsattachAOC4AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC5AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC5AddonCover"), fetchValueFromList(underClaimsattachAOC5AddonCoverDropDown), AssertionType.WARNING);
			}
			if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigUnderClaimsattachAOC6AddonCover")) {
				assertReference.assertEquals(t3ClaimPropForMISEntity.getStringValueForField("UnderClaimsattachAOC6AddonCover"), fetchValueFromList(underClaimsattachAOC6AddonCoverDropDown), AssertionType.WARNING);
			}

		}
	}

	public void proceedNextPage(T3ClaimPropForMISEntity t3ClaimPropForMISEntity){
		if (t3ClaimPropForMISEntity.getBooleanValueForField("ConfigNextArrowButton")){		
			click(nextArrowButton);
			switchToFrame("display");
		}
	}


	public void fillandSubmitT3ClaimPropertyForCOMIS(T3ClaimPropForMISEntity t3ClaimPropForMISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(t3ClaimPropForMISEntity.getConfigExecute())){
			switchToFrame("display");
			fillT3ClaimPropertyForCOMIS(t3ClaimPropForMISEntity, assertReference);
			proceedButtonT4ClaimProperty(t3ClaimPropForMISEntity);
			if(t3ClaimPropForMISEntity.getStringValueForField("Product").equalsIgnoreCase("PP")){
				fillClaimAttachAddonDeatailsCover(t3ClaimPropForMISEntity, assertReference);
				proceedNextPage(t3ClaimPropForMISEntity);
			}
			navigateToclaimHomePage(t3ClaimPropForMISEntity);
			navigateToInsuredItem(t3ClaimPropForMISEntity);
			navigateToDocument(t3ClaimPropForMISEntity);
			navigateToParties(t3ClaimPropForMISEntity);
			navigateToReserve(t3ClaimPropForMISEntity);
			navigateToPayment(t3ClaimPropForMISEntity);
			navigateToAttribute(t3ClaimPropForMISEntity);
			navigateToInsuredItemDetail(t3ClaimPropForMISEntity);
			navigateToInsuredItemAttribute(t3ClaimPropForMISEntity);
		}
	}
}
