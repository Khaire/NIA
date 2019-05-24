package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetailsFirstMiscEntity;
import com.aqm.staf.library.databin.RiskDetailsSecndMiscEntity;

public class RiskDetailsSecondPageMiscInsured extends BasePage{

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement stockExchangesWhereListedTextArea;	
	private PageElement subsidiaryOutsideEntityInformationTextArea;
	private PageElement whetherDirectorsOfficersHoldOutsideBoardPositionDropDown;
	private PageElement loadingPercentForOutsideBoardPositionTextField;
	private PageElement duringLastFiveYearsTheNameOfTheCompanyChangedDropDown;
	private PageElement duringLastFiveYearsAnyAcquisitionOrMergerTakenPlaceDropDown;
	private PageElement yearOfMergerOrAcquisitionTextField;
	private PageElement namesOfCompanyTextArea;
	private PageElement optionsForAnyAcquisitionOrMergerTakenPlaceDropDown;
	private PageElement loadingAmountForAnyAcquisitionOrMergerTakenPlaceTextField;
	private PageElement loadingPercentForAnyAcquisitionOrMergerTakenPlaceTextField;
	private PageElement duringLastFiveYearsAnySubsidiaryBeenSoldOrAcquiredDropDown;
	private PageElement duringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisersDropDown;
	private PageElement duringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebtsDropDown;
	private PageElement forwordButton;
	//CO
	private PageElement doYouWantToAttachHiredVehicleCoverDropDown;
	private PageElement subLimitOfAttachHiredVehicleCoverTextField;
	private PageElement optionsForHiredVehicleCoverDropDown;
	private PageElement loadingAmountforHiredVehicleCoverTextField;
	private PageElement loadingPercentForHiredVehicleCoverTextField;
	private PageElement doYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrierDropDown;
	private PageElement subLimitOfAttachRSMDTextField;
	private PageElement optionsForRSMDDropDown;
	private PageElement loadingAmountforRSMDTextField;
	private PageElement loadingPercentForRSMDTextField;
	private PageElement doyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown;
	private PageElement subLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField;
	private PageElement optionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown;
	private PageElement loadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField;
	private PageElement loadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField;
	private PageElement doyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargoDropDown;
	private PageElement subLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargoTextField;
	private PageElement optionsforFloodorWaterDamageOrDamageByAnyOtherCargoDropDown;
	private PageElement loadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargoTextField;
	private PageElement loadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargoTextField;
	private PageElement doyouwanttoattachBreakageLeakageAndDamageDueToImproperHandlingDropDown;
	private PageElement subLimitofattachBreakageLeakageAndDamageDueToImproperHandlingTextField;
	private PageElement optionsforBreakageLeakageAndDamageDueToImproperHandlingDropDown;
	private PageElement loadingAmountforBreakageLeakageAndDamageDueToImproperHandlingTextField;
	private PageElement loadingPercentForBreakageLeakageAndDamageDueToImproperHandlingTextField;
	private PageElement excessTextField;
	private PageElement loadingPercentForAdversefeatureTextField;
	private PageElement premiumratePercentTextField;
	private PageElement annualTurnoverTextField;
	private PageElement loadingPercentForTurnoverTextField;
	private PageElement specialConditionsOneTextArea;
	private PageElement specialConditionsTwoTextArea;
	private PageElement typeOfPolicyInCODropDown;

	//CT
	private PageElement retroactiveDateFourTextField;
	private PageElement retroactiveDateFiveTextField;
	private PageElement dateOfEstablishmentTextField;
	private PageElement dateOfCommencementOfTrialTextField;
	private PageElement dateOfCompletionOfTrialTextField;
	private PageElement departmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommitteeDropDown;
	private PageElement royalCollegeOfPhysiciansRecommendationsDropDown;
	private PageElement applicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelinesDropDown;
	private PageElement eCdirectiveonGoodClinicalPracticeDropDown;
	private PageElement areAllTrialsorStudiesConductedInIndiaDropDown;

	private PageElement retroactiveDateFourFindButton;
	private PageElement retroactiveDateFiveFindButton;
	private PageElement dateOfEstablishmentFindButton;
	private PageElement dateOfCommencementOfTrialFindButton;
	private PageElement dateOfCompletionOfTrialFindButton;
	private PageElement riskDetailsTwoDetailsPageTitle;

	private PageElement doYouWantToAttachAccidentalPollutionLiabilityDropDown;
	private PageElement loadingOnAccidentalPollutionLiabilityTextField;
	private PageElement doYouWantToAttachCarriageOfEffluentsOutsideThePremisesDropDown;
	private PageElement distanceOfDischargePointFromThePremisesTextField;
	private PageElement loadingOnCarriageOfEffluentsOutsideThePremisesTextField;
	private PageElement doYouWantToAttachGodownCoverDropDown;
	private PageElement noOfBusinessPremisesTextField;
	private PageElement loadingOnGodownTextField;
	private PageElement doYouWantToAttachActOfGodCoverDropDown;
	private PageElement earthquakeZoneDropDown;
	private PageElement loadingOnAOGTextField;
	private PageElement optionForVoluntaryExcessDropDown;
	private PageElement voluntaryExcessTextField;
	private PageElement discountForVoluntaryExcessTextField;
	private PageElement stockExchangesWhereListedTextField;
	private PageElement directorOfficerShareholderPossessMoreSharesDropDown;
	private PageElement subsidiaryOutsideEntityInformationTextField;
	private PageElement whetherDirectorOfficerHoldOutsideBoardPositionDropDown;
	private PageElement isProposerRequestCoverForAnyOfFollowingForSecuritieClaimInConnectionWithPublicOfferDropDown;
	// IN
	private PageElement totalAnnualTurnoverProposedYearTextField;
	private PageElement premiumRatePerMiliTextField;
	private PageElement loadingOnTurnOverProposedYearTextField;

	// IT

	private PageElement isThereaJointVentureWithOtherFirmsDropDown;
	private PageElement areThereSubContractorsAndIndependentContractorsDropdown;

	// LN

	private PageElement classOfConstructionDropDown;
	private PageElement seatingCapacityTextField;
	private PageElement typeOfUnitBelongsToWhichRiskGroupDropDown;
	private PageElement annualTurnoverPreviousYearTextField;
	private PageElement annualTurnoverProposedYearTextField;
	private PageElement multiplierForAOALabel;
	private PageElement loadingOnTurnoverProposedYearLabel;
	private PageElement compulsoryExcessLabel;
	private PageElement anyOneAccidentAOANextLabel;
	private PageElement multiplierForAOANextLabel;    
	private PageElement multiplierForUnitsLabel;
	private PageElement minimumPremForLNTextfield;

	//WC
	private PageElement doYouWantMedicalExtensionDropDown;
	private PageElement optionsforMedicalExtensionDropDown;
	private PageElement loadingAmountforMedicalExtensionTextField;
	private PageElement loadingpercentforMedicalExtensionTextField;
	private PageElement limitpercaseDropDown;
	private PageElement limitperAddlPremiumLoadingTextField;
	private PageElement minimumPremDropDown;
	private PageElement sumInsuredTextField;

	private PageElement discountpercentTextField;
	

	public RiskDetailsSecondPageMiscInsured(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		stockExchangesWhereListedTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock Exchanges where listed","textarea")), "Stock Exchanges where listed TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subsidiaryOutsideEntityInformationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subsidiary/Outside entity information","textarea")), "Subsidiary/Outside entity information TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherDirectorsOfficersHoldOutsideBoardPositionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Directors/Officers hold outside board position","select")), "Whether Directors/Officers hold outside board position DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForOutsideBoardPositionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for outside board position","input")), "Loading (%) for outside board position TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		duringLastFiveYearsTheNameOfTheCompanyChangedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("During last five years, the name of the company changed","select")), "During last five years, the name of the company changed DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		duringLastFiveYearsAnyAcquisitionOrMergerTakenPlaceDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("During last five years, any acquisition or merger taken place","select")), "During last five years, any acquisition or merger taken place DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		yearOfMergerOrAcquisitionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Merger or Acquisition","input")), "Year of Merger or Acquisition TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		namesOfCompanyTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Names of Company","textarea")), "Names of Company TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForAnyAcquisitionOrMergerTakenPlaceDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for any acquisition or merger taken place","select")), "Options for any acquisition or merger taken place DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForAnyAcquisitionOrMergerTakenPlaceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for any acquisition or merger taken place","input")), "Loading Amount for any acquisition or merger taken place TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForAnyAcquisitionOrMergerTakenPlaceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for any acquisition or merger taken place","input")), "Loading (%) for any acquisition or merger taken place TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		duringLastFiveYearsAnySubsidiaryBeenSoldOrAcquiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("During last five years, any subsidiary been sold or acquired","select")), "During last five years, any subsidiary been sold or acquired DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		duringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("During last five years, the company changed its external auditors or external legal advisers","select")), "During last five years, the company changed its external auditors or external legal advisers DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		duringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebtsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("During last five years, the company been in breach of any of its debts","select")), "During last five years, the company been in breach of any of its debts DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//CO
		doYouWantToAttachHiredVehicleCoverDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Hired Vehicle Cover?","select")), "Do you want to attach Hired Vehicle Cover? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachHiredVehicleCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of attach Hired Vehicle Cover","input")), "Sub Limit of attach Hired Vehicle Cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForHiredVehicleCoverDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Hired Vehicle Cover","select")), "Options for Hired Vehicle Cover DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountforHiredVehicleCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Hired Vehicle Cover","input")), "Loading Amount for Hired Vehicle Cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForHiredVehicleCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Hired Vehicle Cover","input")), "Loading (%) for Hired Vehicle Cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrierDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach RSMD at warehouse or at transshipment yard while in custody of carrier?","select")), "Do you want to attach RSMD at warehouse or at transshipment yard while in custody of carrier? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachRSMDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of attach RSMD","input")), "Sub Limit of attach RSMD TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForRSMDDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for RSMD","select")), "Options for RSMD DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountforRSMDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for RSMD","input")), "Loading Amount for RSMD TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForRSMDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for RSMD","input")), "Loading (%) for RSMD TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Shortage due to theft or pilferage of cargo while in custody of carrier?","select")), "Do you want to attach Shortage due to theft or pilferage of cargo while in custody of carrier? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier","input")), "Sub Limit of attach Shortage due to theft or pilferage of cargo while in custody of carrier TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Shortage due to theft or pilferage of cargo while in custody of carrier","select")), "Options for Shortage due to theft or pilferage of cargo while in custody of carrier DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Shortage due to theft or pilferage of cargo while in custody of carrier","input")), "Loading Amount for Shortage due to theft or pilferage of cargo while in custody of carrier TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Shortage due to theft or pilferage of cargo while in custody of carrier","input")), "Loading (%) for Shortage due to theft or pilferage of cargo while in custody of carrier TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargoDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Flood or Water damage or damage by any other cargo?","select")), "Do you want to attach Flood or Water damage or damage by any other cargo? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of attach Flood or Water damage or damage by any other cargo","input")), "Sub Limit of attach Flood or Water damage or damage by any other cargo TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsforFloodorWaterDamageOrDamageByAnyOtherCargoDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Flood or Water damage or damage by any other cargo","select")), "Options for Flood or Water damage or damage by any other cargo DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Flood or Water damage or damage by any other cargo","input")), "Loading Amount for Flood or Water damage or damage by any other cargo TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Flood or Water damage or damage by any other cargo","input")), "Loading (%) for Flood or Water damage or damage by any other cargo TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwanttoattachBreakageLeakageAndDamageDueToImproperHandlingDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Breakage, leakage and damage due to improper handling?","select")), "Do you want to attach Breakage, leakage and damage due to improper handling? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitofattachBreakageLeakageAndDamageDueToImproperHandlingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of attach Breakage, leakage and damage due to improper handling","input")), "Sub Limit of attach Breakage, leakage and damage due to improper handling TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsforBreakageLeakageAndDamageDueToImproperHandlingDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Breakage, leakage and damage due to improper handling","select")), "Options for Breakage, leakage and damage due to improper handling DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountforBreakageLeakageAndDamageDueToImproperHandlingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Breakage, leakage and damage due to improper handling","input")), "Loading Amount for Breakage, leakage and damage due to improper handling TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForBreakageLeakageAndDamageDueToImproperHandlingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Breakage, leakage and damage due to improper handling","input")), "Loading (%) for Breakage, leakage and damage due to improper handling TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess","input")), "Excess TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForAdversefeatureTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Adverse feature","input")), "Loading (%) for Adverse feature TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumratePercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium rate (%)","input")), "Premium rate (%) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		annualTurnoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Annual Turnover","input")), "Annual Turnover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForTurnoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Turnover","input")), "Loading (%) for Turnover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsOneTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1","textarea")), "Special Conditions1 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsTwoTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2","textarea")), "Special Conditions2 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfPolicyInCODropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Policy in CO","select")), "Type of Policy in CO DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//CT
		retroactiveDateFourTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 4","input")), "Retroactive Date 4 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDateFiveTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 5","input")), "Retroactive Date 5 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateOfEstablishmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Establishment","input")), "Date of Establishment TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateOfCommencementOfTrialTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of commencement of trial","input")), "Date of commencement of trial TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateOfCompletionOfTrialTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of completion of trial","input")), "Date of completion of trial TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		departmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommitteeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Department of health requirements with protocols approved by an independent ethics committee","select")), "Department of health requirements with protocols approved by an independent ethics committee DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		royalCollegeOfPhysiciansRecommendationsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Royal college of Physicians recommendations","select")), "Royal college of Physicians recommendations DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		applicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelinesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Applicable government department or medical body or pharmaceutical industry body guidelines","select")), "Applicable government department or medical body or pharmaceutical industry body guidelines DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		eCdirectiveonGoodClinicalPracticeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("E.C directive on good clinical practice","select")), "E.C directive on good clinical practice DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areAllTrialsorStudiesConductedInIndiaDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are all trials or studies conducted in India","select")), "Are all trials or studies conducted in India DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDateFourFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 4')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date 4 Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateFiveFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 5')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date 5 Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfEstablishmentFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of Establishment')]/following::input/following::a[@name='firstFocus']"), "Date of Establishment Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfCommencementOfTrialFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of commencement of trial')]/following::input/following::a[@name='firstFocus']"), "Date of commencement of trial Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfCompletionOfTrialFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of completion of trial')]/following::input/following::a[@name='firstFocus']"), "Date of completion of trial Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//PL
		optionForVoluntaryExcessDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Option for Voluntary Excess')]/following::select"), "Option for Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		voluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary Excess')]/following::input"), "Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountForVoluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount (%) for Voluntary Excess')]/following::input"), "Discount (%) for Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//IN

		totalAnnualTurnoverProposedYearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Annual Turnover (Proposed year)')]/following::input"), "Total Annual Turnover (Proposed year) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		premiumRatePerMiliTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate (per mili)')]/following::input"), "Premium Rate (per mili) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnTurnOverProposedYearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading on Turnover - Proposed Year')]/following::input"), "Loading on Turnover - Proposed Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachAccidentalPollutionLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Accidental pollution liability? -1')]/following::select"), "Do you want to attach Accidental pollution liability? -1 Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnAccidentalPollutionLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) on Accidental pollution liability')]/following::input"), "Loading (%) on Accidental pollution liability Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		doYouWantToAttachCarriageOfEffluentsOutsideThePremisesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Carriage of effluents (Outside) the premises? -1')]/following::select"), "Do you want to attach Carriage of effluents (Outside) the premises? -1 Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		distanceOfDischargePointFromThePremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Distance of discharge point from the premises')]/following::input"), "Distance of discharge point from the premises Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnCarriageOfEffluentsOutsideThePremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) on Carriage of effluents (Outside) the premises')]/following::input"), "Loading (%) on Carriage of effluents (Outside) the premises Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachGodownCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Godown cover? -1')]/following::select"), "Do you want to attach Godown cover? -1 Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfBusinessPremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of business premises')]/following::input"), "No of business premises Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnGodownTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) on Godown')]/following::input"), "Loading (%) on Godown Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachActOfGodCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Act of GOD cover?')]/following::select"), "Do you want to attach Act of GOD cover? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		earthquakeZoneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake Zone')]/following::select"), "Earthquake Zone Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnAOGTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) on AOG')]/following::input"), "Loading (%) on AOG Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionForVoluntaryExcessDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Option for Voluntary Excess')]/following::select"), "Option for Voluntary Excess Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		voluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary Excess')]/following::div/following::td/following::input"), "Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountForVoluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount (%) for Voluntary Excess')]/following::input"), "Discount (%) for Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		// IT
		isThereaJointVentureWithOtherFirmsDropDown=new PageElement(By.xpath("Is there a Joint Venture with other firms')]/following::select"), "Is there a Joint Venture with other firms Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areThereSubContractorsAndIndependentContractorsDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Are there Sub-contractors and Independent contractors')]/following::select"), "Are there Sub-contractors and Independent contractors Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		stockExchangesWhereListedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Stock Exchanges where listed')]/following::input"), "Stock Exchanges where listed Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		directorOfficerShareholderPossessMoreSharesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Directors/Officers/Shareholders possess 15% or more shares","select")), "Do you want to attach Hired Vehicle Cover? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subsidiaryOutsideEntityInformationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Subsidiary/Outside entity information')]/following::input"), "Subsidiary/Outside entity information Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherDirectorOfficerHoldOutsideBoardPositionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Directors/Officers hold outside board position","select")), "Whether Directors/Officers hold outside board position DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isProposerRequestCoverForAnyOfFollowingForSecuritieClaimInConnectionWithPublicOfferDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is the proposer requesting cover for any of the following for securities claims in connection with the public offering","select")), "Is the proposer requesting cover for any of the following for securities claims in connection with the public offering DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//WC
		//doYouWantMedicalExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want Medical Extension?","select")), "Do you want Medical Extension? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//optionsforMedicalExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Medical Extension","select")), "Options for Medical Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountforMedicalExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Medical Extension","input")), "Loading Amount for Medical Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingpercentforMedicalExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Medical Extension","input")), "Loading (%) for Medical Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		limitpercaseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit per case')]/following::select"), "Limit per case Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		limitperAddlPremiumLoadingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit per Addl.Premium(Loading)","input")), "Limit per Addl.Premium(Loading) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured","input")), "Sum Insured TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		minimumPremDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Minimum  Prem.","select")), "Minimum  Prem. DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		// LN
		classOfConstructionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class of Construction","select")), "Class of Construction DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		seatingCapacityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Seating Capacity')]/following::input"), "Seating Capacity Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfUnitBelongsToWhichRiskGroupDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of unit belongs to which Risk Group ?')]/following::select"), "Type of unit belongs to which Risk Group ? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		annualTurnoverPreviousYearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Annual Turnover - Previous Year')]/following::input"), "Annual Turnover - Previous Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		annualTurnoverProposedYearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Annual Turnover - Proposed Year')]/following::input"), "Annual Turnover - Proposed Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		multiplierForAOALabel=new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for AOA')]/following::input"), "Multiplier for AOA Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		compulsoryExcessLabel=new PageElement(By.xpath("//td//div[contains(text(),'Compulsory Excess')]/following::input"), "Compulsory Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneAccidentAOANextLabel=new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA) Next')]/following::input"), "Any One Accident (AOA) Next Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		multiplierForAOANextLabel=new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for AOA Next')]/following::input"), "Multiplier for AOA Next Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		multiplierForUnitsLabel=new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for Units')]/following::input"), "Multiplier for Units Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnTurnoverProposedYearLabel=new PageElement(By.xpath("//td//div[contains(text(),'Loading on Turnover - Proposed Year')]/following::input"), "Loading on Turnover - Proposed Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		minimumPremForLNTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Minimum Premium","input")), "Minimum Premium TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		//WCF		
		minimumPremDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Minimum  Prem.')]/following::select"), "Minimum  Prem. Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantMedicalExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want Medical Extension?')]/following::select"), "Do you want Medical Extension? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsforMedicalExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Medical Extension')]/following::select"), "Options for Medical Extension Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		discountpercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount (%)","input")), "Discount (%) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		
	}

	//Services
	public void fillRiskDetailsSecondPage(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsSecondPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsSecondPageEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigStockExchangesWhereListed")) {
				clearAndSendKeys(stockExchangesWhereListedTextArea, riskDetailsSecondPageEntity.getStringValueForField("StockExchangesWhereListed"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubsidiaryOutsideEntityInformation")) {
				clearAndSendKeys(subsidiaryOutsideEntityInformationTextArea, riskDetailsSecondPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"));
			}

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigWhetherDirectorsOfficersHoldOutsideBoardPosition")) {
				selectValueFromList(whetherDirectorsOfficersHoldOutsideBoardPositionDropDown, riskDetailsSecondPageEntity.getStringValueForField("WhetherDirectorsOfficersHoldOutsideBoardPosition"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForOutsideBoardPosition")) {
				clearAndSendKeys(loadingPercentForOutsideBoardPositionTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForOutsideBoardPosition"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheNameOfTheCompanyChanged")) {
				selectValueFromList(duringLastFiveYearsTheNameOfTheCompanyChangedDropDown, riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheNameOfTheCompanyChanged"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsAnyAcquisitionOrMergerTakenPlace")) {
				selectValueFromList(duringLastFiveYearsAnyAcquisitionOrMergerTakenPlaceDropDown, riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsAnyAcquisitionOrMergerTakenPlace"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigYearOfMergerOrAcquisition")) {
				clearAndSendKeys(yearOfMergerOrAcquisitionTextField, riskDetailsSecondPageEntity.getStringValueForField("YearOfMergerOrAcquisition"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigNamesOfCompany")) {
				clearAndSendKeys(namesOfCompanyTextArea, riskDetailsSecondPageEntity.getStringValueForField("NamesOfCompany"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForAnyAcquisitionOrMergerTakenPlace")) {
				selectValueFromList(optionsForAnyAcquisitionOrMergerTakenPlaceDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsForAnyAcquisitionOrMergerTakenPlace"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountForAnyAcquisitionOrMergerTakenPlace")) {
				clearAndSendKeys(loadingAmountForAnyAcquisitionOrMergerTakenPlaceTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountForAnyAcquisitionOrMergerTakenPlace"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForAnyAcquisitionOrMergerTakenPlace")) {
				clearAndSendKeys(loadingPercentForAnyAcquisitionOrMergerTakenPlaceTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForAnyAcquisitionOrMergerTakenPlace"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsAnySubsidiaryBeenSoldOrAcquired")) {
				selectValueFromList(duringLastFiveYearsAnySubsidiaryBeenSoldOrAcquiredDropDown, riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsAnySubsidiaryBeenSoldOrAcquired"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisers")) {
				selectValueFromList(duringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisersDropDown, riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisers"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebts")) {
				selectValueFromList(duringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebtsDropDown, riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebts"));
			}

			//CO
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachHiredVehicleCover")) {
				selectValueFromList(doYouWantToAttachHiredVehicleCoverDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachHiredVehicleCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachHiredVehicleCover")) {
				clearAndSendKeys(subLimitOfAttachHiredVehicleCoverTextField, riskDetailsSecondPageEntity.getStringValueForField("SubLimitOfAttachHiredVehicleCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForHiredVehicleCover")) {
				selectValueFromList(optionsForHiredVehicleCoverDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsForHiredVehicleCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforHiredVehicleCover")) {
				clearAndSendKeys(loadingAmountforHiredVehicleCoverTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforHiredVehicleCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForHiredVehicleCover")) {
				clearAndSendKeys(loadingPercentForHiredVehicleCoverTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForHiredVehicleCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrier")) {
				selectValueFromList(doYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrierDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrier"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachRSMD")) {
				clearAndSendKeys(subLimitOfAttachRSMDTextField, riskDetailsSecondPageEntity.getStringValueForField("SubLimitOfAttachRSMD"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForRSMD")) {
				selectValueFromList(optionsForRSMDDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsForRSMD"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforRSMD")) {
				clearAndSendKeys(loadingAmountforRSMDTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforRSMD"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForRSMD")) {
				clearAndSendKeys(loadingPercentForRSMDTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForRSMD"));
			}

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				selectValueFromList(doyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				clearAndSendKeys(subLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField, riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				selectValueFromList(optionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				clearAndSendKeys(loadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				clearAndSendKeys(loadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"));
			}

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				selectValueFromList(doyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargoDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargo"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				clearAndSendKeys(subLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargoTextField, riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargo"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				selectValueFromList(optionsforFloodorWaterDamageOrDamageByAnyOtherCargoDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsforFloodorWaterDamageOrDamageByAnyOtherCargo"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				clearAndSendKeys(loadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargoTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargo"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				clearAndSendKeys(loadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargoTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargo"));
			}


			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachBreakageLeakageAndDamageDueToImproperHandling")) {
				selectValueFromList(doyouwanttoattachBreakageLeakageAndDamageDueToImproperHandlingDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachBreakageLeakageAndDamageDueToImproperHandling"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachBreakageLeakageAndDamageDueToImproperHandling")) {
				clearAndSendKeys(subLimitofattachBreakageLeakageAndDamageDueToImproperHandlingTextField, riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachBreakageLeakageAndDamageDueToImproperHandling"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforBreakageLeakageAndDamageDueToImproperHandling")) {
				selectValueFromList(optionsforBreakageLeakageAndDamageDueToImproperHandlingDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsforBreakageLeakageAndDamageDueToImproperHandling"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforBreakageLeakageAndDamageDueToImproperHandling")) {
				clearAndSendKeys(loadingAmountforBreakageLeakageAndDamageDueToImproperHandlingTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforBreakageLeakageAndDamageDueToImproperHandling"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForBreakageLeakageAndDamageDueToImproperHandling")) {
				clearAndSendKeys(loadingPercentForBreakageLeakageAndDamageDueToImproperHandlingTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForBreakageLeakageAndDamageDueToImproperHandling"));
			}

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, riskDetailsSecondPageEntity.getStringValueForField("Excess"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForAdversefeature")) {
				clearAndSendKeys(loadingPercentForAdversefeatureTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForAdversefeature"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPremiumratePercent")) {
				clearAndSendKeys(premiumratePercentTextField, riskDetailsSecondPageEntity.getStringValueForField("PremiumratePercent"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnover")) {
				clearAndSendKeys(annualTurnoverTextField, riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForTurnover")) {
				clearAndSendKeys(loadingPercentForTurnoverTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForTurnover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				clearAndSendKeys(specialConditionsOneTextArea, riskDetailsSecondPageEntity.getStringValueForField("SpecialConditionsOne"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				clearAndSendKeys(specialConditionsTwoTextArea, riskDetailsSecondPageEntity.getStringValueForField("SpecialConditionsTwo"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTypeOfPolicyInCO")) {
				selectValueFromList(typeOfPolicyInCODropDown, riskDetailsSecondPageEntity.getStringValueForField("TypeOfPolicyInCO"));
			}

			//CT
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				click(retroactiveDateFourFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateFourTextField, riskDetailsSecondPageEntity.getStringValueForField("RetroactiveDateFour"));
				switchToFrame("display");

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				click(retroactiveDateFiveFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateFiveTextField, riskDetailsSecondPageEntity.getStringValueForField("RetroactiveDateFive"));
				switchToFrame("display");
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfEstablishment")) {
				click(dateOfEstablishmentFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfEstablishmentTextField, riskDetailsSecondPageEntity.getStringValueForField("DateOfEstablishment"));
				switchToFrame("display");
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfCommencementOfTrial")) {
				click(dateOfCommencementOfTrialFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfCommencementOfTrialTextField, riskDetailsSecondPageEntity.getStringValueForField("DateOfCommencementOfTrial"));
				switchToFrame("display");
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfCompletionOfTrial")) {
				click(dateOfCompletionOfTrialFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfCompletionOfTrialTextField, riskDetailsSecondPageEntity.getStringValueForField("DateOfCompletionOfTrial"));
				switchToFrame("display");
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDepartmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommittee")) {
				selectValueFromList(departmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommitteeDropDown, riskDetailsSecondPageEntity.getStringValueForField("DepartmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommittee"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRoyalCollegeOfPhysiciansRecommendations")) {
				selectValueFromList(royalCollegeOfPhysiciansRecommendationsDropDown, riskDetailsSecondPageEntity.getStringValueForField("RoyalCollegeOfPhysiciansRecommendations"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigApplicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelines")) {
				selectValueFromList(applicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelinesDropDown, riskDetailsSecondPageEntity.getStringValueForField("ApplicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelines"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigeCdirectiveonGoodClinicalPractice")) {
				selectValueFromList(eCdirectiveonGoodClinicalPracticeDropDown, riskDetailsSecondPageEntity.getStringValueForField("eCdirectiveonGoodClinicalPractice"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAreAllTrialsorStudiesConductedInIndia")) {
				selectValueFromList(areAllTrialsorStudiesConductedInIndiaDropDown, riskDetailsSecondPageEntity.getStringValueForField("AreAllTrialsorStudiesConductedInIndia"));
			}
			/*if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				selectValueFromList(optionForVoluntaryExcessDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionForVoluntaryExcess"));
			}*/
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextField, riskDetailsSecondPageEntity.getStringValueForField("VoluntaryExcess"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				clearAndSendKeys(discountForVoluntaryExcessTextField, riskDetailsSecondPageEntity.getStringValueForField("DiscountForVoluntaryExcess"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTotalAnnualTurnoverProposedYear")) {
				clearAndSendKeys(totalAnnualTurnoverProposedYearTextField, riskDetailsSecondPageEntity.getStringValueForField("TotalAnnualTurnoverProposedYear"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				clearAndSendKeys(premiumRatePerMiliTextField, riskDetailsSecondPageEntity.getStringValueForField("PremiumRatePerMili"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnTurnOverProposedYear")) {
				clearAndSendKeys(loadingOnTurnOverProposedYearTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnTurnOverProposedYear"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccidentalPollutionLiability")) {
				selectValueFromList(doYouWantToAttachAccidentalPollutionLiabilityDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachAccidentalPollutionLiability"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnAccidentalPollutionLiability")) {
				clearAndSendKeys(loadingOnAccidentalPollutionLiabilityTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnAccidentalPollutionLiability"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCarriageOfEffluentsOutsideThePremises")) {
				selectValueFromList(doYouWantToAttachCarriageOfEffluentsOutsideThePremisesDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachCarriageOfEffluentsOutsideThePremises"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDistanceOfDischargePointFromThePremises")) {
				clearAndSendKeys(distanceOfDischargePointFromThePremisesTextField, riskDetailsSecondPageEntity.getStringValueForField("DistanceOfDischargePointFromThePremises"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnCarriageOfEffluentsOutsideThePremises")) {
				clearAndSendKeys(loadingOnCarriageOfEffluentsOutsideThePremisesTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnCarriageOfEffluentsOutsideThePremises"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachGodownCover")) {
				selectValueFromList(doYouWantToAttachGodownCoverDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachGodownCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigNoOfBusinessPremises")) {
				clearAndSendKeys(noOfBusinessPremisesTextField, riskDetailsSecondPageEntity.getStringValueForField("NoOfBusinessPremises"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnGodown")) {
				clearAndSendKeys(loadingOnGodownTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnGodown"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachActOfGodCover")) {
				selectValueFromList(doYouWantToAttachActOfGodCoverDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachActOfGodCover"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				selectValueFromList(earthquakeZoneDropDown, riskDetailsSecondPageEntity.getStringValueForField("EarthquakeZone"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnAOG")) {
				clearAndSendKeys(loadingOnAOGTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnAOG"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				selectValueFromList(optionForVoluntaryExcessDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionForVoluntaryExcess"));
			}
			/*	if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextField, riskDetailsSecondPageEntity.getStringValueForField("VoluntaryExcess"));
			}*/
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				clearAndSendKeys(discountForVoluntaryExcessTextField, riskDetailsSecondPageEntity.getStringValueForField("DiscountForVoluntaryExcess"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDirectorOfficerShareholderPossessMoreShare")) {
				selectValueFromList(directorOfficerShareholderPossessMoreSharesDropDown, riskDetailsSecondPageEntity.getStringValueForField("DirectorOfficerShareholderPossessMoreShare"));
			}
			/*	if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubsidiaryOutsideEntityInformation")) {
				clearAndSendKeys(subsidiaryOutsideEntityInformationTextField, riskDetailsSecondPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"));
			} */
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigWhetherDirectrHoldOutsideBoardPositn")) {
				selectValueFromList(whetherDirectorOfficerHoldOutsideBoardPositionDropDown, riskDetailsSecondPageEntity.getStringValueForField("WhetherDirectrHoldOutsideBoardPositn"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigIsProposerRequestingCover")) {
				selectValueFromList(isProposerRequestCoverForAnyOfFollowingForSecuritieClaimInConnectionWithPublicOfferDropDown, riskDetailsSecondPageEntity.getStringValueForField("IsProposerRequestingCover"));
			}
			//WC
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwantMedicalExtension")) {
				selectValueFromList(doYouWantMedicalExtensionDropDown, riskDetailsSecondPageEntity.getStringValueForField("DoyouwantMedicalExtension"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforMedicalExtension")) {
				selectValueFromList(optionsforMedicalExtensionDropDown, riskDetailsSecondPageEntity.getStringValueForField("OptionsforMedicalExtension"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforMedicalExtension")) {
				clearAndSendKeys(loadingAmountforMedicalExtensionTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforMedicalExtension"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingpercentforMedicalExtension")) {
				clearAndSendKeys(loadingpercentforMedicalExtensionTextField, riskDetailsSecondPageEntity.getStringValueForField("LoadingpercentforMedicalExtension"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLimitpercase")) {
				selectValueFromList(limitpercaseDropDown, riskDetailsSecondPageEntity.getStringValueForField("Limitpercase"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLimitperAddlPremiumLoading")) {
				clearAndSendKeys(limitperAddlPremiumLoadingTextField, riskDetailsSecondPageEntity.getStringValueForField("LimitperAddlPremiumLoading"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMinimumPrem")) {
				selectValueFromList(minimumPremDropDown, riskDetailsSecondPageEntity.getStringValueForField("MinimumPrem"));
			}

			// IT
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigIsThereAJointVentureWithOtherFirms")) {
				selectValueFromList(isThereaJointVentureWithOtherFirmsDropDown, riskDetailsSecondPageEntity.getStringValueForField("IsThereAJointVentureWithOtherFirms"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAreThereSubContractorsAndIndependentContractors")) {
				selectValueFromList(areThereSubContractorsAndIndependentContractorsDropdown, riskDetailsSecondPageEntity.getStringValueForField("AreThereSubContractorsAndIndependentContractors"));
			}

			// LN
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigClassOfConstruction")) {
				selectValueFromList(classOfConstructionDropDown, riskDetailsSecondPageEntity.getStringValueForField("ClassOfConstruction"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSeatingCapacity")) {
				clearAndSendKeys(seatingCapacityTextField, riskDetailsSecondPageEntity.getStringValueForField("SeatingCapacity"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTypeOfUnitBelongsToWhichRiskGroup")) {
				selectValueFromList(typeOfUnitBelongsToWhichRiskGroupDropDown, riskDetailsSecondPageEntity.getStringValueForField("TypeOfUnitBelongsToWhichRiskGroup"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnoverPreviousYear")) {
				clearAndSendKeys(annualTurnoverPreviousYearTextField, riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnoverPreviousYear"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnoverProposedYear")) {
				clearAndSendKeys(annualTurnoverProposedYearTextField, riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnoverProposedYear"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForAOA")) {
				clearAndSendKeys(multiplierForAOALabel, riskDetailsSecondPageEntity.getStringValueForField("MultiplierForAOA"));
			}
			/*	if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnTurnoverProposedYear")) {
				clearAndSendKeys(loadingOnTurnoverProposedYearLabel, riskDetailsSecondPageEntity.getStringValueForField("LoadingOnTurnoverProposedYear"));
			} */
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				clearAndSendKeys(compulsoryExcessLabel, riskDetailsSecondPageEntity.getStringValueForField("CompulsoryExcess"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOANext")) {
				clearAndSendKeys(anyOneAccidentAOANextLabel, riskDetailsSecondPageEntity.getStringValueForField("AnyOneAccidentAOANext"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForAOANext")) {
				clearAndSendKeys(multiplierForAOANextLabel, riskDetailsSecondPageEntity.getStringValueForField("MultiplierForAOANext"));
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForUnits")) {
				clearAndSendKeys(multiplierForUnitsLabel, riskDetailsSecondPageEntity.getStringValueForField("MultiplierForUnits"));
			}
			
			// IN
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountPercent")) {
				clearAndSendKeys(discountpercentTextField, riskDetailsSecondPageEntity.getStringValueForField("DiscountPercent"));
			}
			



		}
		else if(riskDetailsSecondPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigStockExchangesWhereListed")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("StockExchangesWhereListed"), fetchValueFromTextFields(stockExchangesWhereListedTextArea),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubsidiaryOutsideEntityInformation")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"), fetchValueFromTextFields(subsidiaryOutsideEntityInformationTextArea),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigWhetherDirectorsOfficersHoldOutsideBoardPosition")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("WhetherDirectorsOfficersHoldOutsideBoardPosition"), fetchValueFromTextFields(whetherDirectorsOfficersHoldOutsideBoardPositionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForOutsideBoardPosition")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForOutsideBoardPosition"), fetchValueFromTextFields(loadingPercentForOutsideBoardPositionTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheNameOfTheCompanyChanged")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheNameOfTheCompanyChanged"), fetchValueFromTextFields(duringLastFiveYearsTheNameOfTheCompanyChangedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsAnyAcquisitionOrMergerTakenPlace")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsAnyAcquisitionOrMergerTakenPlace"), fetchValueFromTextFields(duringLastFiveYearsAnyAcquisitionOrMergerTakenPlaceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigYearOfMergerOrAcquisition")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("YearOfMergerOrAcquisition"), fetchValueFromTextFields(yearOfMergerOrAcquisitionTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigNamesOfCompany")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("NamesOfCompany"), fetchValueFromTextFields(namesOfCompanyTextArea),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForAnyAcquisitionOrMergerTakenPlace")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsForAnyAcquisitionOrMergerTakenPlace"), fetchValueFromTextFields(optionsForAnyAcquisitionOrMergerTakenPlaceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountForAnyAcquisitionOrMergerTakenPlace")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountForAnyAcquisitionOrMergerTakenPlace"), fetchValueFromTextFields(loadingAmountForAnyAcquisitionOrMergerTakenPlaceTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForAnyAcquisitionOrMergerTakenPlace")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForAnyAcquisitionOrMergerTakenPlace"), fetchValueFromTextFields(loadingPercentForAnyAcquisitionOrMergerTakenPlaceTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsAnySubsidiaryBeenSoldOrAcquired")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsAnySubsidiaryBeenSoldOrAcquired"), fetchValueFromTextFields(duringLastFiveYearsAnySubsidiaryBeenSoldOrAcquiredDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisers")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisers"), fetchValueFromTextFields(duringLastFiveYearsTheCompanyChangedItsExternalAuditorsOrExternalLegalAdvisersDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDuringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebts")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DuringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebts"), fetchValueFromTextFields(duringLastFiveYearsTheCompanyBeenInBreachOfAnyOfItsDebtsDropDown),AssertionType.WARNING);
			}

			//CO

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachHiredVehicleCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachHiredVehicleCover"), fetchValueFromTextFields(doYouWantToAttachHiredVehicleCoverDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachHiredVehicleCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubLimitOfAttachHiredVehicleCover"), fetchValueFromTextFields(subLimitOfAttachHiredVehicleCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForHiredVehicleCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsForHiredVehicleCover"), fetchValueFromTextFields(optionsForHiredVehicleCoverDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforHiredVehicleCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforHiredVehicleCover"), fetchValueFromTextFields(loadingAmountforHiredVehicleCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForHiredVehicleCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForHiredVehicleCover"), fetchValueFromTextFields(loadingPercentForHiredVehicleCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrier"), fetchValueFromTextFields(doYouWantToAttachRSMDatwarehouseOrAttransshipmentYardWhileIncustodyOfCarrierDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachRSMD")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubLimitOfAttachRSMD"), fetchValueFromTextFields(subLimitOfAttachRSMDTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsForRSMD")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsForRSMD"), fetchValueFromTextFields(optionsForRSMDDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforRSMD")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforRSMD"), fetchValueFromTextFields(loadingAmountforRSMDTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForRSMD")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForRSMD"), fetchValueFromTextFields(loadingPercentForRSMDTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"), fetchValueFromTextFields(doyouwanttoattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"), fetchValueFromTextFields(subLimitofattachShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"), fetchValueFromTextFields(optionsforShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"), fetchValueFromTextFields(loadingAmountForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrier"), fetchValueFromTextFields(loadingPercentForShortageDueToTheftOrPilferageOfCargoWhileInCustodyOfCarrierTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargo"), fetchValueFromTextFields(doyouwanttoattachFloodorWaterDamageOrDamageByAnyOtherCargoDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargo"), fetchValueFromTextFields(subLimitofattachFloodorWaterDamageOrDamageByAnyOtherCargoTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsforFloodorWaterDamageOrDamageByAnyOtherCargo"), fetchValueFromTextFields(optionsforFloodorWaterDamageOrDamageByAnyOtherCargoDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargo"), fetchValueFromTextFields(loadingAmountforFloodorWaterDamageOrDamageByAnyOtherCargoTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargo"), fetchValueFromTextFields(loadingPercentForFloodorWaterDamageOrDamageByAnyOtherCargoTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwanttoattachBreakageLeakageAndDamageDueToImproperHandling")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoyouwanttoattachBreakageLeakageAndDamageDueToImproperHandling"), fetchValueFromTextFields(doyouwanttoattachBreakageLeakageAndDamageDueToImproperHandlingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubLimitofattachBreakageLeakageAndDamageDueToImproperHandling")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubLimitofattachBreakageLeakageAndDamageDueToImproperHandling"), fetchValueFromTextFields(subLimitofattachBreakageLeakageAndDamageDueToImproperHandlingTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforBreakageLeakageAndDamageDueToImproperHandling")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsforBreakageLeakageAndDamageDueToImproperHandling"), fetchValueFromTextFields(optionsforBreakageLeakageAndDamageDueToImproperHandlingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforBreakageLeakageAndDamageDueToImproperHandling")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforBreakageLeakageAndDamageDueToImproperHandling"), fetchValueFromTextFields(loadingAmountforBreakageLeakageAndDamageDueToImproperHandlingTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForBreakageLeakageAndDamageDueToImproperHandling")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForBreakageLeakageAndDamageDueToImproperHandling"), fetchValueFromTextFields(loadingPercentForBreakageLeakageAndDamageDueToImproperHandlingTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForAdversefeature")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForAdversefeature"), fetchValueFromTextFields(loadingPercentForAdversefeatureTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPremiumratePercent")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("PremiumratePercent"), fetchValueFromTextFields(premiumratePercentTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnover"), fetchValueFromTextFields(annualTurnoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingPercentForTurnover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingPercentForTurnover"), fetchValueFromTextFields(loadingPercentForTurnoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SpecialConditionsOne"), fetchValueFromTextFields(specialConditionsOneTextArea),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SpecialConditionsTwo"), fetchValueFromTextFields(specialConditionsTwoTextArea),AssertionType.WARNING);
			} 
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTypeOfPolicyInCO")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("TypeOfPolicyInCO"), fetchValueFromTextFields(typeOfPolicyInCODropDown),AssertionType.WARNING);
			}

			//CT
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsSecondPageEntity.getStringValueForField("RetroactiveDateFour")), fetchValueFromTextFields(retroactiveDateFourTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsSecondPageEntity.getStringValueForField("RetroactiveDateFive")), fetchValueFromTextFields(retroactiveDateFiveTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfEstablishment")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsSecondPageEntity.getStringValueForField("DateOfEstablishment")), fetchValueFromTextFields(dateOfEstablishmentTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfCommencementOfTrial")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsSecondPageEntity.getStringValueForField("DateOfCommencementOfTrial")), fetchValueFromTextFields(dateOfCommencementOfTrialTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDateOfCompletionOfTrial")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsSecondPageEntity.getStringValueForField("DateOfCompletionOfTrial")), fetchValueFromTextFields(dateOfCompletionOfTrialTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDepartmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommittee")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DepartmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommittee"), fetchValueFromTextFields(departmentOfHealthRequirementsWithProtocolsApprovedByAnIndependentEthicsCommitteeDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRoyalCollegeOfPhysiciansRecommendations")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("RoyalCollegeOfPhysiciansRecommendations"), fetchValueFromTextFields(royalCollegeOfPhysiciansRecommendationsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigApplicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelines")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("ApplicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelines"), fetchValueFromTextFields(applicableGovernmentDepartmentOrMedicalBodyOrPharmaceuticalIndustryBodyGuidelinesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigeCdirectiveonGoodClinicalPractice")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("ECdirectiveonGoodClinicalPractice"), fetchValueFromTextFields(eCdirectiveonGoodClinicalPracticeDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAreAllTrialsorStudiesConductedInIndia")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AreAllTrialsorStudiesConductedInIndia"), fetchValueFromTextFields(areAllTrialsorStudiesConductedInIndiaDropDown),AssertionType.WARNING);
			}
			//PL
			/*	if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AreAllTrialsorStudiesConductedInIndia"), fetchValueFromList(optionForVoluntaryExcessDropDown),AssertionType.WARNING);
			}
		    if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextField),AssertionType.WARNING);
			}*/
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DiscountForVoluntaryExcess"), fetchValueFromTextFields(discountForVoluntaryExcessTextField),AssertionType.WARNING);
			}

			// IN
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTotalAnnualTurnoverProposedYear")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("TotalAnnualTurnoverProposedYear"), fetchValueFromTextFields(totalAnnualTurnoverProposedYearTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("PremiumRatePerMili"), fetchValueFromTextFields(premiumRatePerMiliTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnTurnOverProposedYear")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnTurnOverProposedYear"), fetchValueFromTextFields(loadingOnTurnOverProposedYearTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccidentalPollutionLiability")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachAccidentalPollutionLiability"), fetchValueFromTextFields(doYouWantToAttachAccidentalPollutionLiabilityDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnAccidentalPollutionLiability")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnAccidentalPollutionLiability"), fetchValueFromTextFields(loadingOnAccidentalPollutionLiabilityTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCarriageOfEffluentsOutsideThePremises")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachCarriageOfEffluentsOutsideThePremises"), fetchValueFromTextFields(doYouWantToAttachCarriageOfEffluentsOutsideThePremisesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDistanceOfDischargePointFromThePremises")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DistanceOfDischargePointFromThePremises"), fetchValueFromTextFields(distanceOfDischargePointFromThePremisesTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnCarriageOfEffluentsOutsideThePremises")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnCarriageOfEffluentsOutsideThePremises"), fetchValueFromTextFields(loadingOnCarriageOfEffluentsOutsideThePremisesTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachGodownCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachGodownCover"), fetchValueFromTextFields(doYouWantToAttachGodownCoverDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigNoOfBusinessPremises")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("NoOfBusinessPremises"), fetchValueFromTextFields(noOfBusinessPremisesTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnGodown")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnGodown"), fetchValueFromTextFields(loadingOnGodownTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachActOfGodCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoYouWantToAttachActOfGodCover"), fetchValueFromTextFields(doYouWantToAttachActOfGodCoverDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("EarthquakeZone"), fetchValueFromTextFields(earthquakeZoneDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnAOG")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnAOG"), fetchValueFromTextFields(loadingOnAOGTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionForVoluntaryExcess"), fetchValueFromList(optionForVoluntaryExcessDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextField),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DiscountForVoluntaryExcess"), fetchValueFromTextFields(doYouWantToAttachCarriageOfEffluentsOutsideThePremisesDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDirectorOfficerShareholderPossessMoreShare")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DirectorOfficerShareholderPossessMoreShare"), fetchValueFromTextFields(directorOfficerShareholderPossessMoreSharesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSubsidiaryOutsideEntityInformation")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"), fetchValueFromTextFields(subsidiaryOutsideEntityInformationTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigWhetherDirectrHoldOutsideBoardPositn")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("WhetherDirectrHoldOutsideBoardPositn"), fetchValueFromTextFields(whetherDirectorOfficerHoldOutsideBoardPositionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigIsProposerRequestingCover")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("IsProposerRequestingCover"), fetchValueFromTextFields(isProposerRequestCoverForAnyOfFollowingForSecuritieClaimInConnectionWithPublicOfferDropDown),AssertionType.WARNING);
			}
			//WC
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMinimumPrem")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("MinimumPrem"), fetchValueFromList(minimumPremDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDoyouwantMedicalExtension")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DoyouwantMedicalExtension"), fetchValueFromList(doYouWantMedicalExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigOptionsforMedicalExtension")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("OptionsforMedicalExtension"), fetchValueFromList(optionsforMedicalExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingAmountforMedicalExtension")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingAmountforMedicalExtension"), fetchValueFromTextFields(loadingAmountforMedicalExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingpercentforMedicalExtension")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingpercentforMedicalExtension"), fetchValueFromTextFields(loadingpercentforMedicalExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLimitpercase")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("Limitpercase"), fetchValueFromList(limitpercaseDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLimitperAddlPremiumLoading")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LimitperAddlPremiumLoading"), fetchValueFromTextFields(limitperAddlPremiumLoadingTextField),AssertionType.WARNING);
			}

			// IT

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigIsThereAJointVentureWithOtherFirms")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("IsThereAJointVentureWithOtherFirms"), fetchValueFromTextFields(isThereaJointVentureWithOtherFirmsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAreThereSubContractorsAndIndependentContractors")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AreThereSubContractorsAndIndependentContractors"), fetchValueFromTextFields(areThereSubContractorsAndIndependentContractorsDropdown),AssertionType.WARNING);

			}

			// LN

			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigClassOfConstruction")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("ClassOfConstruction"), fetchValueFromTextFields(classOfConstructionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigSeatingCapacity")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("SeatingCapacity"), fetchValueFromTextFields(seatingCapacityTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigTypeOfUnitBelongsToWhichRiskGroup")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("TypeOfUnitBelongsToWhichRiskGroup"), fetchValueFromTextFields(typeOfUnitBelongsToWhichRiskGroupDropDown),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnoverPreviousYear")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnoverPreviousYear"), fetchValueFromTextFields(annualTurnoverPreviousYearTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnnualTurnoverProposedYear")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AnnualTurnoverProposedYear"), fetchValueFromTextFields(annualTurnoverProposedYearTextField),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForAOA")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("MultiplierForAOA"), fetchValueFromTextFields(multiplierForAOALabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoadingOnTurnoverProposedYear")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("LoadingOnTurnoverProposedYear"), fetchValueFromTextFields(loadingOnTurnoverProposedYearLabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("CompulsoryExcess"), fetchValueFromTextFields(compulsoryExcessLabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOANext")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("AnyOneAccidentAOANext"), fetchValueFromTextFields(anyOneAccidentAOANextLabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForAOANext")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("MultiplierForAOANext"), fetchValueFromTextFields(multiplierForAOANextLabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMultiplierForUnits")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("MultiplierForUnits"), fetchValueFromTextFields(multiplierForUnitsLabel),AssertionType.WARNING);
			}
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigMinimumPremForLN")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("MinimumPremForLN"), fetchValueFromTextFields(minimumPremForLNTextfield),AssertionType.WARNING);
			}
			
			// IN
			
			if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDiscountPercent")) {
				assertReference.assertEquals(riskDetailsSecondPageEntity.getStringValueForField("DiscountPercent"), fetchValueFromTextFields(discountpercentTextField),AssertionType.WARNING);
				
			}
		}
	}




	public void navigateToPolicy(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToInsuredInterest(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity){
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void clickOnNextButton(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity) {
		if (riskDetailsSecondPageEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitRiskDetailsSecondPage(RiskDetailsSecndMiscEntity riskDetailsSecondPageEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskDetailsSecondPageEntity.getConfigExecute())){
			switchToFrame("display");
			fillRiskDetailsSecondPage(riskDetailsSecondPageEntity, assertReference);
			clickOnNextButton(riskDetailsSecondPageEntity);
			navigateToPolicy(riskDetailsSecondPageEntity);
			navigateToAttribute(riskDetailsSecondPageEntity);
			navigateToInsuredInterest(riskDetailsSecondPageEntity);
			navigateToCoverage(riskDetailsSecondPageEntity);
			navigateToLoan(riskDetailsSecondPageEntity);
			navigateToClientDetails(riskDetailsSecondPageEntity);
			navigateToRelation(riskDetailsSecondPageEntity);
			navigateToPayment(riskDetailsSecondPageEntity);
			navigateToFollowup(riskDetailsSecondPageEntity);
			navigateToDocument(riskDetailsSecondPageEntity);

		}
	}
}



