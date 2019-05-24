package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetailsSecndMiscEntity;
import com.aqm.staf.library.databin.RiskDetailsThirdMiscEntity;

public class RiskDetailsThirdPageMiscInsured extends BasePage{
	
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

	private PageElement doYouWantToAttachOutsideDirectorshipDropDown;	
	private PageElement subLimitOfOutsideDirectorshipTextField;
	private PageElement optionsForOutsideDirectorshipDropDown;
	private PageElement loadingAmountForOutsideDirectorshipTextField;
	private PageElement loadingPercentForOutsideDirectorshipTextField;
	private PageElement doYouWantToAttachSpousalExtensionDropDown;
	private PageElement subLimitOfSpousalExtensionTextField;
	private PageElement optionsForSpousalExtensionDropDown;
	private PageElement loadingAmountForSpousalExtensionTextField;
	private PageElement loadingPercentForSpousalExtensionTextField;
	private PageElement doYouWantToAttachLegalHeirsAndRepresentativesDropDown;
	private PageElement subLimitOfLegalHeirsAndRepresentativesTextField;
	private PageElement optionsForLegalHeirsAndRepresentativesDropDown;
	private PageElement loadingAmountForLegalHeirsAndRepresentativesTextField;
	private PageElement loadingPercentForLegalHeirsAndRepresentativesTextField;
	private PageElement doYouWantToAttachEntityCoverageForSecuritiesOnlyDropDown;
	private PageElement subLimitOfEntityCoverageForSecuritiesTextField;

	private PageElement optionsForEntityCoverageForSecuritiesDropDown;	
	private PageElement loadingAmountForEntityCoverageForSecuritiesTextField;
	private PageElement loadingPercentForEntityCoverageForSecuritiesTextField;
	private PageElement doYouWantToAttachInitialPublicOfferingDropDown;
	private PageElement subLimitOfInitialPublicOfferingTextField;
	private PageElement optionsForInitialPublicOfferingDropDown;
	private PageElement loadingAmountForInitialPublicOfferingTextField;
	private PageElement loadingPercentForInitialPublicOfferingTextField;
	private PageElement doYouWantToAttachOtherAdditionalExtensionsDropDown;
	private PageElement listOfExtensionsDropDown;
	private PageElement subLimitOfOtherAdditionalExtensionsTextField;
	private PageElement optionsForOtherAdditionalExtensionsDropDown;
	private PageElement loadingPercentForOtherAdditionalExtensionsTextField;
	private PageElement loadingAmountForOtherAdditionalExtensionsTextField;
	private PageElement premiumRatePercentTextField;
	private PageElement excessTextField;
	private PageElement specialConditionsWarrantiesTextArea;
	private PageElement doYouWantToAttachEntityCoverageForEPLIDropDown;
	private PageElement subLimitOfEntityCoverageForEPLITextField;
	private PageElement optionsForEntityCoverageForEPLIDropDown;
	private PageElement loadingAmountForEntityCoverageForEPLITextField;
	private PageElement loadingPercentForEntityCoverageForEPLITextField;
	private PageElement forwordButton;
	//CT
	private PageElement areAllRightsOfReportsRetainedAgainstProductManufacturersDropDown;
	private PageElement areAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudyDropDown;
	private PageElement protocolFormDropDown;
	private PageElement volunteerConsentFormDropDown;
	private PageElement detailsOfAnyAgreementAndContractWithOtherPartiesTextArea;
	private PageElement anyAgreementAndContractWithOtherPartiesDropDown;
	private PageElement noOfAddlSubjectsTextField;
	private PageElement addlPremiumPerSubjectTextField;
	private PageElement loadingPercentForAdverseFeatureTextField;
	private PageElement descriptionOfTrialTextArea;
	private PageElement phaseOfTrialDropDown;
	private PageElement specialConditionsOneTextArea;
	private PageElement specialConditionsTwoTextArea;
	//PL
	private PageElement optionForVoluntaryExcessDropDown;
	private PageElement voluntaryExcessTextField;
	private PageElement discountForVoluntaryExcessTextField;

	private PageElement doYouWantToAttchProductnForSpousalPropertyDropDown;
	private PageElement doYouWantToAttachAccessToLimitedFreeLegalAdviceDropDown;
	private PageElement doYouWantToAttachCivilPenaltiesDropDown;
	private PageElement doYouWantToAttachAdditionalInsuredDropDown;
	private PageElement doYouWantToAttachJointPropertyDropDown;
	private PageElement doYouWantToAttachCrisisManagementExpenseDropDown;

	private PageElement riskDetailsThreeDetailsPageTitle;

	//IN

	private PageElement doYouWantToAttachTechnicalCollaboratorsLiabilityDropDown;
	private PageElement subLimitOfAttachTechnicalCollaboratorsLiabilityTextField;
	private PageElement optionsForTechnicalCollaboratorsLiabilityDropDown;
	private PageElement doYouWantToAttachRunOffExtentionDropDown;
	private PageElement subLimitOfAttachRunoffExtensionTextField;
	private PageElement optionsForRunOffExtensionDropDown;
	private PageElement loadingAmountForTechnicalCollaboratorsLiabilityTextField;

	// IT

	private PageElement doesThePolicyCoverInternetServiceEcommerceDropDown;
	private PageElement anyOneAccidentForInternetServiceEcommerceTextField;
	private PageElement anyOneAccidentAnyOneYearInternetServiceEcommerceDropDown;
	private PageElement anyOneYearInternetServiceEcommerceAndInTheAggregateLabel;
	private PageElement deductibleForInternetServiceEcommerceTextField;
	private PageElement premiumRateEcommerceTextField; 
	private PageElement doYouWantToAttachInfringementOfCopyRightTrademarksDropDown;
	private PageElement subLimitOfAttachInfringementOfCopyRightTrademarksTextField;
	private PageElement optionsForInfringementOfCopyrightTrademarksDropDown;
	private PageElement doYouWanttoAttachConsultantsSubcontractorsAgentsDropDown;
	private PageElement subLimitOfAttachConsultantsSubcontractorsAgentsTextField;
	private PageElement optionsForConsultantsSubcontractorsAgentsDropDown;
	private PageElement doYouWantToAttachJointVentureDropDown;
	private PageElement subLimitOfAttachJointVentureTextField;
	private PageElement optionsForJointVentureDropDown;
	private PageElement doYouWantToAttachOutgoingPrincipalsDropDown;
	private PageElement subLimitOfAttachOutgoingPrincipalsTextField;
	private PageElement optionsForOutgoingPrincipalsDropDown; 
	private PageElement doYouWantToAttachUnauthorizedAccessDropDown;
	private PageElement subLimitofAttachUnauthorizedAccessTextField;
	private PageElement optionsForUnauthorizedAccessDropDown;
	private PageElement doYouWantToAttachExtendedClaimsReportingDropDown;
	private PageElement subLimitOfAttachExtendedClaimsReportingTextField;
	private PageElement optionsForExtendedClaimsReportingDropDown;
	private PageElement doYouWantToAttachDishonestyOfEmployeesDropDown;
	private PageElement subLimitOfAttachDishonestyOfEmployeesTextField;
	private PageElement optionsforDishonestyOfEmployeesDropDown;
	private PageElement doYouWantToAttachLossofDocumentsDropDown;
	private PageElement subLimitOfAttachLossofDocumentsTextField;
	private PageElement optionsForLossofDocumentsDropDown;

	// LN

	private PageElement doYouWantToAttachAccidentalPollutionLiabilityTwoDropDown;
	private PageElement doYouWantToAttachTransportationLiabilityDropDown;
	private PageElement whetherBuildingIsMoreThanTwentyTwometresDropDown;
	private PageElement doesTheBuildingHasLiftElevatorDropDown;


	public RiskDetailsThirdPageMiscInsured(WebDriver driver, String pageName) {
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
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		doYouWantToAttachOutsideDirectorshipDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Outside directorship?","select")), "Do you want to attach Outside directorship? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfOutsideDirectorshipTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Outside directorship","input")), "Sub Limit of Outside directorship TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForOutsideDirectorshipDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Outside directorship","select")), "Options for Outside directorship DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForOutsideDirectorshipTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Outside directorship","input")), "Loading Amount for Outside directorship TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForOutsideDirectorshipTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for outside directorship","input")), "Loading (%) for outside directorship TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachSpousalExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Spousal extension?","select")), "Do you want to attach Spousal extension? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfSpousalExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Spousal extension","input")), "Sub Limit of Spousal extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForSpousalExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Spousal extension","select")), "Options for Spousal extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForSpousalExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Spousal extension","input")), "Loading Amount for Spousal extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForSpousalExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Spousal extension","input")), "Loading Amount for Spousal extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachLegalHeirsAndRepresentativesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Legal heirs and representatives?","select")), "Do you want to attach Legal heirs and representatives? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfLegalHeirsAndRepresentativesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Legal heirs and representatives","input")), "Sub Limit of Legal heirs and representatives TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForLegalHeirsAndRepresentativesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Legal heirs and representatives","select")), "Options for Legal heirs and representatives DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForLegalHeirsAndRepresentativesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Legal heirs and representatives","input")), "Loading Amount for Legal heirs and representatives TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForLegalHeirsAndRepresentativesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Legal heirs and representatives","input")), "Loading (%) for Legal heirs and representatives TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		doYouWantToAttachEntityCoverageForSecuritiesOnlyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Entity coverage for securities only?","select")), "Do you want to attach Entity coverage for securities only? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfEntityCoverageForSecuritiesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Entity coverage for securities","input")), "Sub Limit of Entity coverage for securities TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);


		optionsForEntityCoverageForSecuritiesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Entity coverage for securities","select")), "Options for Entity coverage for securities DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForEntityCoverageForSecuritiesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Entity coverage for securities","input")), "Loading Amount for Entity coverage for securities TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForEntityCoverageForSecuritiesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Entity coverage for securities","input")), "Loading (%) for Entity coverage for securities TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		doYouWantToAttachInitialPublicOfferingDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Initial public offering?","select")), "Do you want to attach Initial public offering? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfInitialPublicOfferingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Initial public offering","input")), "Sub Limit of Initial public offering TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForInitialPublicOfferingDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Initial public offering","select")), "Options for Initial public offering DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForInitialPublicOfferingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Initial public offering","input")), "Loading Amount for Initial public offering TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForInitialPublicOfferingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Initial public offering","input")), "Loading (%) for Initial public offering TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachOtherAdditionalExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Other additional extensions?","select")), "Do you want to attach Other additional extensions? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		listOfExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("List of Extensions","select")), "List of Extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfOtherAdditionalExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Other additional extensions","input")), "Sub Limit of Other additional extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForOtherAdditionalExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Other additional extensions","select")), "Options for Other additional extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForOtherAdditionalExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Other additional extensions","input")), "Loading Amount for Other additional extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForOtherAdditionalExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Other additional extensions","input")), "Loading Amount for Other additional extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumRatePercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium rate (%)","input")), "Premium rate (%) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess","input")), "Excess TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsWarrantiesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special conditions/warranties","textarea")), "Special conditions/warranties TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachEntityCoverageForEPLIDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to attach Entity coverage for EPLI?","select")), "Do you want to attach Entity coverage for EPLI? DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfEntityCoverageForEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Entity coverage for EPLI","input")), "Sub Limit of Entity coverage for EPLI TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForEntityCoverageForEPLIDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Entity coverage for EPLI","select")), "Options for Entity coverage for EPLI DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForEntityCoverageForEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Entity coverage for EPLI","input")), "Loading Amount for Entity coverage for EPLI TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForEntityCoverageForEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Entity coverage for EPLI","input")), "Loading (%) for Entity coverage for EPLI TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//CT
		areAllRightsOfReportsRetainedAgainstProductManufacturersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are all rights of reports retained against product manufacturers","select")), "Are all rights of reports retained against product manufacturers DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are all volunteers tested for HIV and Hepatitis prior to entering the trial study","select")), "Are all volunteers tested for HIV and Hepatitis prior to entering the trial study DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		protocolFormDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Protocol Form","select")), "Protocol Form DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		volunteerConsentFormDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Volunteer consent form","select")), "Volunteer consent form DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		detailsOfAnyAgreementAndContractWithOtherPartiesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Any agreement and contract with other parties","textarea")), "Details of Any agreement and contract with other parties TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyAgreementAndContractWithOtherPartiesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any agreement and contract with other parties","select")), "Any agreement and contract with other parties DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfAddlSubjectsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Addl. Subjects","input")), "No of Addl. Subjects TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		addlPremiumPerSubjectTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Addl. Premium per subject","input")), "Addl. Premium per subject TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForAdverseFeatureTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Adverse feature","input")), "Loading (%) for Adverse feature TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionOfTrialTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of Trial","textarea")), "Description of Trial TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		phaseOfTrialDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Phase of Trial","select")), "Phase of Trial DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsOneTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1","textarea")), "Special Conditions1 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsTwoTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2","textarea")), "Special Conditions2 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//PL
		optionForVoluntaryExcessDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Option for Voluntary Excess')]/following::select"), "Option for Voluntary Excess Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		voluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary Excess')]/following::input"), "Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountForVoluntaryExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount (%) for Voluntary Excess')]/following::input"), "Discount (%) for Voluntary Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttchProductnForSpousalPropertyDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Production for spousal property?')]/following::select"), "Do you want to attach Production for spousal property? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachAccessToLimitedFreeLegalAdviceDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Access to limited free legal advice?')]/following::select"), "Do you want to attach Access to limited free legal advice?Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachCivilPenaltiesDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Civil penalties?')]/following::select"), "Do you want to attach Civil penalties? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachAdditionalInsuredDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Additional Insured?')]/following::select"), "Do you want to attach Additional Insured? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachJointPropertyDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Joint Property?')]/following::select"), "Do you want to attach Joint Property? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachCrisisManagementExpenseDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Crisis management expenses?')]/following::select"), "Do you want to attach Crisis management expenses? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//IN

		doYouWantToAttachTechnicalCollaboratorsLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Technical collaborators liability?')]/following::select"), "Do you want to attach Technical collaborators liability Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachTechnicalCollaboratorsLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'//td//div[contains(text(),'Sub Limit of attach Technical collaborators liability')]/following::input"), "Sub Limit of attach Technical collaborators liability Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForTechnicalCollaboratorsLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Technical collaborators liability')]/following::select')]/following::select"), "Options for Technical collaborators liability Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachRunOffExtentionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Run off extention?')]/following::select"), "Do you want to attach Run off extention? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachRunoffExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Run off extension')]/following::input"), "Sub Limit of attach Technical collaborators liability Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForRunOffExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Run off extension')]/following::select"), "Options for Run off extension Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForTechnicalCollaboratorsLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Technical collaborators liability')]/following::input"), "Loading Amount for Technical collaborators liability Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		// IT

		doesThePolicyCoverInternetServiceEcommerceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Does the policy cover Internet service/E-commerce')]/following::select"), "Does the policy cover Internet service/E-commerce Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneAccidentForInternetServiceEcommerceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident for Internet service/E-commerce')]/following::input"), "Any One Accident for Internet service/E-commerce Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneAccidentAnyOneYearInternetServiceEcommerceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'//td//div[contains(text(),'Any One Accident: Any One Year Internet service/E-commerce')]/following::select"), "Any One Accident: Any One Year Internet service/E-commerce Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneYearInternetServiceEcommerceAndInTheAggregateLabel=new PageElement(By.xpath("//td//div[contains(text(),'Any One Year Internet service/E-commerce and in the Aggregate')]/following::input"), "Any One Year Internet service/E-commerce and in the Aggregate Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleForInternetServiceEcommerceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible for Internet service/E-commerce')]/following::input"), "Deductible for Internet service/E-commerce Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumRateEcommerceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate (%) - E commerce')]/following::input"), "Premium Rate (%) - E commerce Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachInfringementOfCopyRightTrademarksDropDown=new PageElement(By.xpath("//td//div[contains(text(),'//td//div[contains(text(),'Do you want to attach Infringement of copyright, trademarks?')]/following::select"), "Do you want to attach Infringement of copyright, trademarks? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachInfringementOfCopyRightTrademarksTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Infringement of copyright, trademarks')]/following::input"), "Sub Limit of attach Infringement of copyright, trademarks Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForInfringementOfCopyrightTrademarksDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for infringement of copyright,trademarks')]/following::select"), "Options for infringement of copyright,trademarks Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWanttoAttachConsultantsSubcontractorsAgentsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Consultants, Sub-contractors, Agents?')]/following::select"), "Do you want to attach Consultants, Sub-contractors, Agents? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachConsultantsSubcontractorsAgentsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Consultants,Sub-contractors,Agents')]/following::input"), "Sub Limit of attach Consultants,Sub-contractors,Agents Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForConsultantsSubcontractorsAgentsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Consultants,Sub-contractors,Agents')]/following::select"), "Options for Consultants,Sub-contractors,Agents Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachJointVentureDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Joint-Venture?')]/following::select"), "Do you want to attach Joint-Venture? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachJointVentureTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach joint-Venture')]/following::input"), "Sub Limit of attach joint-Venture Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForJointVentureDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for joint-Venture')]/following::select"), "Options for joint-Venture Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachOutgoingPrincipalsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Outgoing Principals?')]/following::select"), "Do you want to attach Outgoing Principals? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachOutgoingPrincipalsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Outgoing Principals')]/following::input"), "Sub Limit of attach Outgoing Principals Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForOutgoingPrincipalsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Outgoing Principals')]/following::select"), "Options for Outgoing Principals Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachUnauthorizedAccessDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Unauthorized Access?')]/following::select"), "Do you want to attach Unauthorized Access? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitofAttachUnauthorizedAccessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Unauthorized Access')]/following::input"), "Sub Limit of attach Unauthorized Access Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		optionsForUnauthorizedAccessDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Unauthorized Access')]/following::select"), "Options for Unauthorized Access Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachExtendedClaimsReportingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extended claims reporting?')]/following::select"), "Do you want to attach Extended claims reporting? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachExtendedClaimsReportingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Extended claims reporting')]/following::input"), "Sub Limit of attach Extended claims reporting Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForExtendedClaimsReportingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extended claims reporting')]/following::select"), "Options for Extended claims reporting Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachDishonestyOfEmployeesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Dishonesty of Employees?')]/following::select"), "Do you want to attach Dishonesty of Employees? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachDishonestyOfEmployeesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Dishonesty of Employees')]/following::input"), "Sub Limit of attach Dishonesty of Employees Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsforDishonestyOfEmployeesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Dishonesty of Employees')]/following::select"), "Options for Dishonesty of Employees Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachLossofDocumentsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Loss of documents?')]/following::select"), "Do you want to attach Loss of documents? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAttachLossofDocumentsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Loss of documents')]/following::input"), "Sub Limit of attach Loss of documents Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForLossofDocumentsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Loss of documents')]/following::select"), "Options for Loss of documents Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		// LN

		doYouWantToAttachAccidentalPollutionLiabilityTwoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Accidental pollution liability? -2')]/following::select"), "Do you want to attach Accidental pollution liability? -2 Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouWantToAttachTransportationLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Transportation liability?')]/following::select"), "Do you want to attach Transportation liability? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherBuildingIsMoreThanTwentyTwometresDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Building is more than 22 metres')]/following::select"), "Whether Building is more than 22 metres Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doesTheBuildingHasLiftElevatorDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Does the building has lift/elevator')]/following::select"), "Does the building has lift/elevator Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

	}


	//Services
	public void fillRiskDetailsThirdPage(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsThirdPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsThirdPageEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOutsideDirectorship")) {
				selectValueFromList(doYouWantToAttachOutsideDirectorshipDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOutsideDirectorship"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfOutsideDirectorship")) {
				clearAndSendKeys(subLimitOfOutsideDirectorshipTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfOutsideDirectorship"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOutsideDirectorship")) {
				selectValueFromList(optionsForOutsideDirectorshipDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForOutsideDirectorship"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForOutsideDirectorship")) {
				clearAndSendKeys(loadingAmountForOutsideDirectorshipTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForOutsideDirectorship"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForOutsideDirectorship")) {
				clearAndSendKeys(loadingPercentForOutsideDirectorshipTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForOutsideDirectorship"));
			}

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachSpousalExtension")) {
				selectValueFromList(doYouWantToAttachSpousalExtensionDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachSpousalExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfSpousalExtension")) {
				clearAndSendKeys(subLimitOfSpousalExtensionTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfSpousalExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForSpousalExtension")) {
				selectValueFromList(optionsForSpousalExtensionDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForSpousalExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForSpousalExtension")) {
				clearAndSendKeys(loadingAmountForSpousalExtensionTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForSpousalExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForSpousalExtension")) {
				clearAndSendKeys(loadingPercentForSpousalExtensionTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForSpousalExtension"));
			}			

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachLegalHeirsAndRepresentatives")) {
				selectValueFromList(doYouWantToAttachLegalHeirsAndRepresentativesDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachLegalHeirsAndRepresentatives"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfLegalHeirsAndRepresentatives")) {
				clearAndSendKeys(subLimitOfLegalHeirsAndRepresentativesTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfLegalHeirsAndRepresentatives"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForLegalHeirsAndRepresentatives")) {
				selectValueFromList(optionsForLegalHeirsAndRepresentativesDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForLegalHeirsAndRepresentatives"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForLegalHeirsAndRepresentatives")) {
				clearAndSendKeys(loadingAmountForLegalHeirsAndRepresentativesTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForLegalHeirsAndRepresentatives"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForLegalHeirsAndRepresentatives")) {
				clearAndSendKeys(loadingPercentForLegalHeirsAndRepresentativesTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForLegalHeirsAndRepresentatives"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachEntityCoverageForSecuritiesOnly")) {
				selectValueFromList(doYouWantToAttachEntityCoverageForSecuritiesOnlyDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachEntityCoverageForSecuritiesOnly"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfEntityCoverageForSecurities")) {
				clearAndSendKeys(subLimitOfEntityCoverageForSecuritiesTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfEntityCoverageForSecurities"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForEntityCoverageForSecurities")) {
				selectValueFromList(optionsForEntityCoverageForSecuritiesDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForEntityCoverageForSecurities"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForEntityCoverageForSecurities")) {
				clearAndSendKeys(loadingAmountForEntityCoverageForSecuritiesTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForEntityCoverageForSecurities"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForEntityCoverageForSecurities")) {
				clearAndSendKeys(loadingPercentForEntityCoverageForSecuritiesTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForEntityCoverageForSecurities"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachInitialPublicOffering")) {
				selectValueFromList(doYouWantToAttachInitialPublicOfferingDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachInitialPublicOffering"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfInitialPublicOffering")) {
				clearAndSendKeys(subLimitOfInitialPublicOfferingTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfInitialPublicOffering"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForInitialPublicOffering")) {
				selectValueFromList(optionsForInitialPublicOfferingDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForInitialPublicOffering"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForInitialPublicOffering")) {
				clearAndSendKeys(loadingAmountForInitialPublicOfferingTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForInitialPublicOffering"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForInitialPublicOffering")) {
				clearAndSendKeys(loadingPercentForInitialPublicOfferingTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForInitialPublicOffering"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOtherAdditionalExtension")) {
				selectValueFromList(doYouWantToAttachOtherAdditionalExtensionsDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOtherAdditionalExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigListOfExtensions")) {
				selectValueFromList(listOfExtensionsDropDown, riskDetailsThirdPageEntity.getStringValueForField("ListOfExtensions"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfOtherAdditionalExtensions")) {
				clearAndSendKeys(subLimitOfOtherAdditionalExtensionsTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfOtherAdditionalExtensions"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOtherAdditionalExtensions")) {
				selectValueFromList(optionsForOtherAdditionalExtensionsDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForOtherAdditionalExtensions"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForOtherAdditionalExtensions")) {
				clearAndSendKeys(loadingAmountForOtherAdditionalExtensionsTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForOtherAdditionalExtensions"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForOtherAdditionalExtensions")) {
				clearAndSendKeys(loadingPercentForOtherAdditionalExtensionsTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForOtherAdditionalExtensions"));
			}

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPremiumRatePercent")) {
				clearAndSendKeys(premiumRatePercentTextField, riskDetailsThirdPageEntity.getStringValueForField("PremiumRatePercent"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, riskDetailsThirdPageEntity.getStringValueForField("Excess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				clearAndSendKeys(specialConditionsWarrantiesTextArea, riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsWarranties"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachEntityCoverageForEPLI")) {
				selectValueFromList(doYouWantToAttachEntityCoverageForEPLIDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachEntityCoverageForEPLI"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfEntityCoverageForEPLI")) {
				clearAndSendKeys(subLimitOfEntityCoverageForEPLITextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfEntityCoverageForEPLI"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForEntityCoverageForEPLI")) {
				clearAndSendKeys(optionsForEntityCoverageForEPLIDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForEntityCoverageForEPLI"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForEntityCoverageForEPLI")) {
				clearAndSendKeys(loadingAmountForEntityCoverageForEPLITextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForEntityCoverageForEPLI"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForEntityCoverageForEPLI")) {
				clearAndSendKeys(loadingPercentForEntityCoverageForEPLITextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForEntityCoverageForEPLI"));
			}
			//CT

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAreAllRightsOfReportsRetainedAgainstProductManufacturers")) {
				selectValueFromList(areAllRightsOfReportsRetainedAgainstProductManufacturersDropDown, riskDetailsThirdPageEntity.getStringValueForField("AreAllRightsOfReportsRetainedAgainstProductManufacturers"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAreAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudy")) {
				selectValueFromList(areAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudyDropDown, riskDetailsThirdPageEntity.getStringValueForField("AreAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudy"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigProtocolForm")) {
				selectValueFromList(protocolFormDropDown, riskDetailsThirdPageEntity.getStringValueForField("ProtocolForm"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigVolunteerConsentForm")) {
				selectValueFromList(volunteerConsentFormDropDown, riskDetailsThirdPageEntity.getStringValueForField("VolunteerConsentForm"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDetailsOfAnyAgreementAndContractWithOtherParties")) {
				clearAndSendKeys(detailsOfAnyAgreementAndContractWithOtherPartiesTextArea, riskDetailsThirdPageEntity.getStringValueForField("DetailsOfAnyAgreementAndContractWithOtherParties"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyAgreementAndContractWithOtherParties")) {
				selectValueFromList(anyAgreementAndContractWithOtherPartiesDropDown, riskDetailsThirdPageEntity.getStringValueForField("AnyAgreementAndContractWithOtherParties"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigNoOfAddlSubjects")) {
				clearAndSendKeys(noOfAddlSubjectsTextField, riskDetailsThirdPageEntity.getStringValueForField("NoOfAddlSubjects"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAddlPremiumPerSubject")) {
				clearAndSendKeys(addlPremiumPerSubjectTextField, riskDetailsThirdPageEntity.getStringValueForField("AddlPremiumPerSubject"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForAdverseFeature")) {
				clearAndSendKeys(loadingPercentForAdverseFeatureTextField, riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForAdverseFeature"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDescriptionOfTrial")) {
				clearAndSendKeys(descriptionOfTrialTextArea, riskDetailsThirdPageEntity.getStringValueForField("DescriptionOfTrial"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPhaseOfTrial")) {
				selectValueFromList(phaseOfTrialDropDown, riskDetailsThirdPageEntity.getStringValueForField("PhaseOfTrial"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				clearAndSendKeys(specialConditionsOneTextArea, riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsOne"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				clearAndSendKeys(specialConditionsTwoTextArea, riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsTwo"));
			}
			//PL
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				selectValueFromList(optionForVoluntaryExcessDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionForVoluntaryExcess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextField, riskDetailsThirdPageEntity.getStringValueForField("VoluntaryExcess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				clearAndSendKeys(discountForVoluntaryExcessTextField, riskDetailsThirdPageEntity.getStringValueForField("DiscountForVoluntaryExcess"));
			}

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttchProductnForSpousalProperty")) {
				selectValueFromList(doYouWantToAttchProductnForSpousalPropertyDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttchProductnForSpousalProperty"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccessToLimitedFreeLegalAdvice")) {
				selectValueFromList(doYouWantToAttachAccessToLimitedFreeLegalAdviceDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAccessToLimitedFreeLegalAdvice"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCivilPenaltie")) {
				selectValueFromList(doYouWantToAttachCivilPenaltiesDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachCivilPenaltie"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAdditionalInsured")) {
				selectValueFromList(doYouWantToAttachAdditionalInsuredDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAdditionalInsured"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachJointProperty")) {
				selectValueFromList(doYouWantToAttachJointPropertyDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachJointProperty"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCrisisManagementExpense")) {
				selectValueFromList(doYouWantToAttachCrisisManagementExpenseDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachCrisisManagementExpense"));
			}
			// IN
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachTechnicalCollaboratorsLiability")) {
				selectValueFromList(doYouWantToAttachTechnicalCollaboratorsLiabilityDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachTechnicalCollaboratorsLiability"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(subLimitOfAttachTechnicalCollaboratorsLiabilityTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsLiability"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(optionsForTechnicalCollaboratorsLiabilityDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForTechnicalCollaboratorsLiability"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachRunOffExtention")) {
				selectValueFromList(doYouWantToAttachRunOffExtentionDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachRunOffExtention"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachRunOffExtension")) {
				clearAndSendKeys(subLimitOfAttachRunoffExtensionTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachRunoffExtension"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForRunOffExtension")) {
				clearAndSendKeys(optionsForRunOffExtensionDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForRunOffExtension"));
			}

			// IT
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoesThePolicyCoverInternetServiceEcommerce")) {
				selectValueFromList(doesThePolicyCoverInternetServiceEcommerceDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoesThePolicyCoverInternetServiceEcommerce"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAnyOneYearInternetServiceEcommerce")) {
				selectValueFromList(anyOneAccidentAnyOneYearInternetServiceEcommerceDropDown, riskDetailsThirdPageEntity.getStringValueForField("AnyOneAccidentAnyOneYearInternetServiceEcommerce"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachInfringementOfCopyRightTrademarks")) {
				selectValueFromList(doYouWantToAttachInfringementOfCopyRightTrademarksDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachInfringementOfCopyRightTrademarks"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForInfringementOfCopyRightTrademarks")) {
				selectValueFromList(optionsForInfringementOfCopyrightTrademarksDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForInfringementOfCopyRightTrademarks"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachConsultantsSubcontractorsAgents")) {
				selectValueFromList(doYouWanttoAttachConsultantsSubcontractorsAgentsDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachConsultantsSubcontractorsAgents"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForConsultantsSubcontractorsAgents")) {
				selectValueFromList(optionsForConsultantsSubcontractorsAgentsDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForConsultantsSubcontractorsAgents"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachJointVenture")) {
				selectValueFromList(doYouWantToAttachJointVentureDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachJointVenture"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForJointVenture")) {
				selectValueFromList(optionsForJointVentureDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForJointVenture"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOutgoingPrincipals")) {
				selectValueFromList(doYouWantToAttachOutgoingPrincipalsDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOutgoingPrincipals"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOutgoingPrincipals")) {
				selectValueFromList(optionsForOutgoingPrincipalsDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForOutgoingPrincipals"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachUnauthorizedAccess")) {
				selectValueFromList(doYouWantToAttachUnauthorizedAccessDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachUnauthorizedAccess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForUnauthorizedAccess")) {
				selectValueFromList(optionsForUnauthorizedAccessDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForUnauthorizedAccess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtendedClaimsReporting")) {
				selectValueFromList(doYouWantToAttachExtendedClaimsReportingDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachExtendedClaimsReporting"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForExtendedClaimsReporting")) {
				selectValueFromList(optionsForExtendedClaimsReportingDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForExtendedClaimsReporting"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachDishonestyOfEmployees")) {
				selectValueFromList(doYouWantToAttachDishonestyOfEmployeesDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachDishonestyOfEmployees"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForDishonestyOfEmployees")) {
				selectValueFromList(optionsforDishonestyOfEmployeesDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForDishonestyOfEmployees"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachLossOfDocuments")) {
				selectValueFromList(doYouWantToAttachLossofDocumentsDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachLossOfDocuments"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForLossOfDocuments")) {
				selectValueFromList(optionsForLossofDocumentsDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForLossOfDocuments"));
			}

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneAccidentForInternetServiceEcommerce")) {
				clearAndSendKeys(anyOneAccidentForInternetServiceEcommerceTextField, riskDetailsThirdPageEntity.getStringValueForField("AnyOneAccidentForInternetServiceEcommerce"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneYearInternetServiceEcommerceandInTheAggregate")) {
				clearAndSendKeys(anyOneYearInternetServiceEcommerceAndInTheAggregateLabel, riskDetailsThirdPageEntity.getStringValueForField("AnyOneYearInternetServiceEcommerceandInTheAggregate"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDeductibleForInternetServiceEcommerce")) {
				clearAndSendKeys(deductibleForInternetServiceEcommerceTextField, riskDetailsThirdPageEntity.getStringValueForField("DeductibleForInternetServiceEcommerce"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPremiumRateEcommerce")) {
				clearAndSendKeys(premiumRateEcommerceTextField, riskDetailsThirdPageEntity.getStringValueForField("PremiumRateEcommerce"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachConsultantsSubcontractorsAgents")) {
				clearAndSendKeys(subLimitOfAttachConsultantsSubcontractorsAgentsTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachConsultantsSubcontractorsAgents"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachJointVenture")) {
				clearAndSendKeys(subLimitOfAttachJointVentureTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachJointVenture"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachOutgoingPrincipals")) {
				clearAndSendKeys(subLimitOfAttachOutgoingPrincipalsTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachOutgoingPrincipals"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitofAttachUnauthorizedAccess")) {
				clearAndSendKeys(subLimitofAttachUnauthorizedAccessTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitofAttachUnauthorizedAccess"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachExtendedClaimsReporting")) {
				clearAndSendKeys(subLimitOfAttachExtendedClaimsReportingTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachExtendedClaimsReporting"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitofAttachDishonestyOfEmployees")) {
				clearAndSendKeys(subLimitOfAttachDishonestyOfEmployeesTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitofAttachDishonestyOfEmployees"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForDishonestyOfEmployees")) {
				clearAndSendKeys(optionsforDishonestyOfEmployeesDropDown, riskDetailsThirdPageEntity.getStringValueForField("OptionsForDishonestyOfEmployees"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachLossofDocuments")) {
				clearAndSendKeys(subLimitOfAttachLossofDocumentsTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachLossofDocuments"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachInfringementOfCopyRightTrademarks")) {
				clearAndSendKeys(subLimitOfAttachInfringementOfCopyRightTrademarksTextField, riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachInfringementOfCopyRightTrademarks"));
			}
			

			// LN
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccidentalPollutionLiabilityTwo")) {
				selectValueFromList(doYouWantToAttachAccidentalPollutionLiabilityTwoDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAccidentalPollutionLiabilityTwo"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachTransportationLiability")) {
				selectValueFromList(doYouWantToAttachTransportationLiabilityDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachTransportationLiability"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigWhetherBuildingIsMorethanTwentyTwoMetres")) {
				selectValueFromList(whetherBuildingIsMoreThanTwentyTwometresDropDown, riskDetailsThirdPageEntity.getStringValueForField("WhetherBuildingIsMorethanTwentyTwoMetres"));
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoesTheBuildingHasLiftElevator")) {
				selectValueFromList(doesTheBuildingHasLiftElevatorDropDown, riskDetailsThirdPageEntity.getStringValueForField("DoesTheBuildingHasLiftElevator"));
			}

		}

		else if(riskDetailsThirdPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOutsideDirectorship")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOutsideDirectorship"), fetchValueFromTextFields(doYouWantToAttachOutsideDirectorshipDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfOutsideDirectorship")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfOutsideDirectorship"), fetchValueFromTextFields(subLimitOfOutsideDirectorshipTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOutsideDirectorship")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForOutsideDirectorship"), fetchValueFromTextFields(optionsForOutsideDirectorshipDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForOutsideDirectorship")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForOutsideDirectorship"), fetchValueFromTextFields(loadingAmountForOutsideDirectorshipTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForOutsideDirectorship")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForOutsideDirectorship"), fetchValueFromTextFields(loadingPercentForOutsideDirectorshipTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachSpousalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachSpousalExtension"), fetchValueFromTextFields(doYouWantToAttachSpousalExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfSpousalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfSpousalExtension"), fetchValueFromTextFields(subLimitOfSpousalExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForSpousalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForSpousalExtension"), fetchValueFromTextFields(optionsForSpousalExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForSpousalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForSpousalExtension"), fetchValueFromTextFields(loadingAmountForSpousalExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForSpousalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForSpousalExtension"), fetchValueFromTextFields(loadingPercentForSpousalExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachLegalHeirsAndRepresentatives"), fetchValueFromTextFields(doYouWantToAttachLegalHeirsAndRepresentativesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfLegalHeirsAndRepresentatives"), fetchValueFromTextFields(subLimitOfLegalHeirsAndRepresentativesTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForLegalHeirsAndRepresentatives"), fetchValueFromTextFields(optionsForLegalHeirsAndRepresentativesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForLegalHeirsAndRepresentatives"), fetchValueFromTextFields(loadingAmountForLegalHeirsAndRepresentativesTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForLegalHeirsAndRepresentatives")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForLegalHeirsAndRepresentatives"), fetchValueFromTextFields(loadingPercentForLegalHeirsAndRepresentativesTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachEntityCoverageForSecuritiesOnly")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachEntityCoverageForSecuritiesOnly"), fetchValueFromTextFields(doYouWantToAttachEntityCoverageForSecuritiesOnlyDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForEntityCoverageForSecurities")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForEntityCoverageForSecurities"), fetchValueFromTextFields(optionsForEntityCoverageForSecuritiesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForEntityCoverageForSecurities")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForEntityCoverageForSecurities"), fetchValueFromTextFields(loadingAmountForEntityCoverageForSecuritiesTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForEntityCoverageForSecurities")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForEntityCoverageForSecurities"), fetchValueFromTextFields(loadingPercentForEntityCoverageForSecuritiesTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachInitialPublicOffering")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachInitialPublicOffering"), fetchValueFromTextFields(doYouWantToAttachInitialPublicOfferingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfInitialPublicOffering")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfInitialPublicOffering"), fetchValueFromTextFields(subLimitOfInitialPublicOfferingTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForInitialPublicOffering")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForInitialPublicOffering"), fetchValueFromTextFields(optionsForInitialPublicOfferingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForInitialPublicOffering")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForInitialPublicOffering"), fetchValueFromTextFields(loadingAmountForInitialPublicOfferingTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForInitialPublicOffering")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"), fetchValueFromTextFields(loadingPercentForInitialPublicOfferingTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOtherAdditionalExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOtherAdditionalExtension"), fetchValueFromTextFields(doYouWantToAttachOtherAdditionalExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigListOfExtensions")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("ListOfExtensions"), fetchValueFromTextFields(listOfExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfOtherAdditionalExtensions")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfOtherAdditionalExtensions"), fetchValueFromTextFields(subLimitOfOtherAdditionalExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOtherAdditionalExtensions")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubsidiaryOutsideEntityInformation"), fetchValueFromTextFields(optionsForOtherAdditionalExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForOtherAdditionalExtensions")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForOtherAdditionalExtensions"), fetchValueFromTextFields(loadingAmountForOtherAdditionalExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForOtherAdditionalExtensions")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForOtherAdditionalExtensions"), fetchValueFromTextFields(loadingPercentForOtherAdditionalExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPremiumRatePercent")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("PremiumRatePercent"), fetchValueFromTextFields(premiumRatePercentTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsWarranties"), fetchValueFromTextFields(specialConditionsWarrantiesTextArea),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachEntityCoverageForEPLI")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachEntityCoverageForEPLI"), fetchValueFromTextFields(doYouWantToAttachEntityCoverageForEPLIDropDown),AssertionType.WARNING);
			}			
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfEntityCoverageForEPLI")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfEntityCoverageForEPLI"), fetchValueFromTextFields(subLimitOfEntityCoverageForEPLITextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForEntityCoverageForEPLI")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForEntityCoverageForEPLI"), fetchValueFromTextFields(optionsForEntityCoverageForEPLIDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingAmountForEntityCoverageForEPLI")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingAmountForEntityCoverageForEPLI"), fetchValueFromTextFields(loadingAmountForEntityCoverageForEPLITextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForEntityCoverageForEPLI")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForEntityCoverageForEPLI"), fetchValueFromTextFields(loadingPercentForEntityCoverageForEPLITextField),AssertionType.WARNING);
			}
			//CT

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAreAllRightsOfReportsRetainedAgainstProductManufacturers")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AreAllRightsOfReportsRetainedAgainstProductManufacturers"), fetchValueFromTextFields(areAllRightsOfReportsRetainedAgainstProductManufacturersDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAreAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudy")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AreAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudy"), fetchValueFromTextFields(areAllVolunteerstestedForHIVAndHepatitisPriortoEnteringTheTrialStudyDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigProtocolForm")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("ProtocolForm"), fetchValueFromTextFields(protocolFormDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigVolunteerConsentForm")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("VolunteerConsentForm"), fetchValueFromTextFields(volunteerConsentFormDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDetailsOfAnyAgreementAndContractWithOtherParties")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DetailsOfAnyAgreementAndContractWithOtherParties"), fetchValueFromTextFields(detailsOfAnyAgreementAndContractWithOtherPartiesTextArea),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyAgreementAndContractWithOtherParties")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AnyAgreementAndContractWithOtherParties"), fetchValueFromTextFields(anyAgreementAndContractWithOtherPartiesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigNoOfAddlSubjects")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("NoOfAddlSubjects"), fetchValueFromTextFields(noOfAddlSubjectsTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAddlPremiumPerSubject")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AddlPremiumPerSubject"), fetchValueFromTextFields(addlPremiumPerSubjectTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoadingPercentForAdverseFeature")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("LoadingPercentForAdverseFeature"), fetchValueFromTextFields(loadingPercentForAdverseFeatureTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDescriptionOfTrial")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DescriptionOfTrial"), fetchValueFromTextFields(descriptionOfTrialTextArea),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPhaseOfTrial")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("PhaseOfTrial"), fetchValueFromTextFields(phaseOfTrialDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsOne"), fetchValueFromTextFields(specialConditionsOneTextArea),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SpecialConditionsTwo"), fetchValueFromTextFields(specialConditionsTwoTextArea),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AreAllTrialsorStudiesConductedInIndia"), fetchValueFromTextFields(optionForVoluntaryExcessDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DiscountForVoluntaryExcess"), fetchValueFromTextFields(discountForVoluntaryExcessTextField),AssertionType.WARNING);
			}
			//PL
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttchProductnForSpousalProperty")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttchProductnForSpousalProperty"), fetchValueFromTextFields(doYouWantToAttchProductnForSpousalPropertyDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccessToLimitedFreeLegalAdvice")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAccessToLimitedFreeLegalAdvice"), fetchValueFromTextFields(doYouWantToAttachAccessToLimitedFreeLegalAdviceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCivilPenaltie")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachCivilPenaltie"), fetchValueFromTextFields(doYouWantToAttachCivilPenaltiesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAdditionalInsured")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAdditionalInsured"), fetchValueFromTextFields(doYouWantToAttachAdditionalInsuredDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachJointProperty")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachJointProperty"), fetchValueFromTextFields(doYouWantToAttachJointPropertyDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachCrisisManagementExpense")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachCrisisManagementExpense"), fetchValueFromTextFields(doYouWantToAttachCrisisManagementExpenseDropDown),AssertionType.WARNING);
			}

			//IN
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachTechnicalCollaboratorsLiability"), fetchValueFromTextFields(doYouWantToAttachTechnicalCollaboratorsLiabilityDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachTechnicalCollaboratorsLiability"), fetchValueFromTextFields(subLimitOfAttachTechnicalCollaboratorsLiabilityTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForTechnicalCollaboratorsLiability"), fetchValueFromTextFields(optionsForTechnicalCollaboratorsLiabilityDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachRunOffExtention")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachRunOffExtention"), fetchValueFromTextFields(doYouWantToAttachRunOffExtentionDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachRunOffExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachRunoffExtension"), fetchValueFromTextFields(subLimitOfAttachRunoffExtensionTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForRunOffExtension")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForRunOffExtension"), fetchValueFromTextFields(optionsForRunOffExtensionDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AreAllTrialsorStudiesConductedInIndia"), fetchValueFromTextFields(optionForVoluntaryExcessDropDown),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextField),AssertionType.WARNING);
			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DiscountForVoluntaryExcess"), fetchValueFromTextFields(discountForVoluntaryExcessTextField),AssertionType.WARNING);
			}

			// IT

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoesThePolicyCoverInternetServiceEcommerce")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoesThePolicyCoverInternetServiceEcommerce"), fetchValueFromTextFields(doesThePolicyCoverInternetServiceEcommerceDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAnyOneYearInternetServiceEcommerce")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AnyOneAccidentAnyOneYearInternetServiceEcommerce"), fetchValueFromTextFields(anyOneAccidentAnyOneYearInternetServiceEcommerceDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachInfringementOfCopyRightTrademarks")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachInfringementOfCopyRightTrademarks"), fetchValueFromTextFields(doYouWantToAttachInfringementOfCopyRightTrademarksDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForInfringementOfCopyRightTrademarks")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForInfringementOfCopyRightTrademarks"), fetchValueFromTextFields(optionsForInfringementOfCopyrightTrademarksDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachConsultantsSubcontractorsAgents")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachConsultantsSubcontractorsAgents"), fetchValueFromTextFields(doYouWanttoAttachConsultantsSubcontractorsAgentsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForConsultantsSubcontractorsAgents")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForConsultantsSubcontractorsAgents"), fetchValueFromTextFields(optionsForConsultantsSubcontractorsAgentsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachJointVenture")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachJointVenture"), fetchValueFromTextFields(doYouWantToAttachJointVentureDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForJointVenture")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForJointVenture"), fetchValueFromTextFields(optionsForJointVentureDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOutgoingPrincipals")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachOutgoingPrincipals"), fetchValueFromTextFields(doYouWantToAttachOutgoingPrincipalsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForOutgoingPrincipals")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForOutgoingPrincipals"), fetchValueFromTextFields(optionsForOutgoingPrincipalsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachUnauthorizedAccess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachUnauthorizedAccess"), fetchValueFromTextFields(doYouWantToAttachUnauthorizedAccessDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForUnauthorizedAccess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForUnauthorizedAccess"), fetchValueFromTextFields(optionsForUnauthorizedAccessDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtendedClaimsReporting")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachExtendedClaimsReporting"), fetchValueFromTextFields(doYouWantToAttachExtendedClaimsReportingDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForExtendedClaimsReporting")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForExtendedClaimsReporting"), fetchValueFromTextFields(optionsForExtendedClaimsReportingDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachDishonestyOfEmployees")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachDishonestyOfEmployees"), fetchValueFromTextFields(doYouWantToAttachDishonestyOfEmployeesDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForDishonestyOfEmployees")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForDishonestyOfEmployees"), fetchValueFromTextFields(optionsforDishonestyOfEmployeesDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachLossOfDocuments")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachLossOfDocuments"), fetchValueFromTextFields(doYouWantToAttachLossofDocumentsDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForLossOfDocuments")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForLossOfDocuments"), fetchValueFromTextFields(optionsForLossofDocumentsDropDown),AssertionType.WARNING);

			}

			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneAccidentForInternetServiceEcommerce")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AnyOneAccidentForInternetServiceEcommerce"), fetchValueFromTextFields(anyOneAccidentForInternetServiceEcommerceTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAnyOneYearInternetServiceEcommerceandInTheAggregate")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("AnyOneYearInternetServiceEcommerceandInTheAggregate"), fetchValueFromTextFields(optionsForRunOffExtensionDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDeductibleForInternetServiceEcommerce")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DeductibleForInternetServiceEcommerce"), fetchValueFromTextFields(deductibleForInternetServiceEcommerceTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPremiumRateEcommerce")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("PremiumRateEcommerce"), fetchValueFromTextFields(premiumRateEcommerceTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachConsultantsSubcontractorsAgents")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachConsultantsSubcontractorsAgents"), fetchValueFromTextFields(subLimitOfAttachConsultantsSubcontractorsAgentsTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachJointVenture")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachJointVenture"), fetchValueFromTextFields(subLimitOfAttachJointVentureTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachOutgoingPrincipals")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachOutgoingPrincipals"), fetchValueFromTextFields(subLimitOfAttachOutgoingPrincipalsTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitofAttachUnauthorizedAccess")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitofAttachUnauthorizedAccess"), fetchValueFromTextFields(subLimitofAttachUnauthorizedAccessTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachExtendedClaimsReporting")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachExtendedClaimsReporting"), fetchValueFromTextFields(subLimitOfAttachExtendedClaimsReportingTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitofAttachDishonestyOfEmployees")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitofAttachDishonestyOfEmployees"), fetchValueFromTextFields(subLimitOfAttachDishonestyOfEmployeesTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigOptionsForDishonestyOfEmployees")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("OptionsForDishonestyOfEmployees"), fetchValueFromTextFields(optionsforDishonestyOfEmployeesDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachLossofDocuments")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachLossofDocuments"), fetchValueFromTextFields(subLimitOfAttachLossofDocumentsTextField),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigSubLimitOfAttachInfringementOfCopyRightTrademarks")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("SubLimitOfAttachInfringementOfCopyRightTrademarks"), fetchValueFromTextFields(subLimitOfAttachInfringementOfCopyRightTrademarksTextField),AssertionType.WARNING);
				
			}

			// LN
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachAccidentalPollutionLiabilityTwo")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachAccidentalPollutionLiabilityTwo"), fetchValueFromTextFields(doYouWantToAttachAccidentalPollutionLiabilityTwoDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachTransportationLiability")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoYouWantToAttachTransportationLiability"), fetchValueFromTextFields(doYouWantToAttachTransportationLiabilityDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigWhetherBuildingIsMorethanTwentyTwoMetres")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("WhetherBuildingIsMorethanTwentyTwoMetres"), fetchValueFromTextFields(whetherBuildingIsMoreThanTwentyTwometresDropDown),AssertionType.WARNING);

			}
			if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDoesTheBuildingHasLiftElevator")) {
				assertReference.assertEquals(riskDetailsThirdPageEntity.getStringValueForField("DoesTheBuildingHasLiftElevator"), fetchValueFromTextFields(doesTheBuildingHasLiftElevatorDropDown),AssertionType.WARNING);

			}
			

		}
	}


	public void navigateToPolicy(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToInsuredInterest(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity){
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void clickOnNextButton(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity) {
		if (riskDetailsThirdPageEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitRiskDetailsThirdPage(RiskDetailsThirdMiscEntity riskDetailsThirdPageEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskDetailsThirdPageEntity.getConfigExecute())){
			switchToFrame("display");
			fillRiskDetailsThirdPage(riskDetailsThirdPageEntity, assertReference);
			clickOnNextButton(riskDetailsThirdPageEntity);
			navigateToPolicy(riskDetailsThirdPageEntity);
			navigateToAttribute(riskDetailsThirdPageEntity);
			navigateToInsuredInterest(riskDetailsThirdPageEntity);
			navigateToCoverage(riskDetailsThirdPageEntity);
			navigateToLoan(riskDetailsThirdPageEntity);
			navigateToClientDetails(riskDetailsThirdPageEntity);
			navigateToRelation(riskDetailsThirdPageEntity);
			navigateToPayment(riskDetailsThirdPageEntity);
			navigateToFollowup(riskDetailsThirdPageEntity);
			navigateToDocument(riskDetailsThirdPageEntity);

		}
	}
}




