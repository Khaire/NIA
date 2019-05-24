package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetailsFourthMiscEntity;
import com.aqm.staf.library.databin.RiskDetailsThirdMiscEntity;

public class RiskDetailsFourthPageMiscInsured  extends BasePage{

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

	private PageElement crisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCoverDropDown;	
	private PageElement subLimitOfCrisisCommunicationCoverTextField;
	private PageElement optionsForCrisisCommunicationCoverDropDown;
	private PageElement loadingAmountForCrisisCommunicationCoverTextField;
	private PageElement loadingPercentForCrisisCommunicationCoverTextField;
	private PageElement courtAttendanceCostExtensionDropDown;
	private PageElement subLimitOfCourtAttendanceCostExtensionTextField;
	private PageElement optionsForCourtAttendanceCostExtensionDropDown;
	private PageElement loadingAmountForCourtAttendanceCostExtensionTextField;
	private PageElement loadingPercentForCourtAttendanceCostExtensionTextField;
	private PageElement riskManagementExtensionDropDown;
	private PageElement subLimitOfRiskManagementExtensionTextField;
	private PageElement optionsForRiskManagementExtensionDropDown;
	private PageElement loadingAmountForRiskManagementExtensionTextField;
	private PageElement loadingPercentForRiskManagementExtensionTextField;
	private PageElement pollutionDefenseCostExtensionDropDown;
	private PageElement subLimitOfPollutionDefenseCostExtensionTextField;
	private PageElement optionsForPollutionDefenseCostExtensionDropDown;
	private PageElement loadingAmountForPollutionDefenseCostExtensionTextField;
	private PageElement loadingPercentForPollutionDefenseCostExtensionTextField;
	private PageElement employmentPracticeLiabilityEPLIDropDown;
	private PageElement subLimitOfEmploymentPracticeLiabilityEPLITextField;
	private PageElement optionsForEmploymentPracticeLiabilityEPLIDropDown;
	private PageElement loadingAmountForEmploymentPracticeLiabilityEPLITextField;
	private PageElement loadingPercentForEmploymentPracticeLiabilityEPLITextField;
	private PageElement deductibleForEPLIExtensionTextField;
	private PageElement directorVersusDirectorExtensionsDropDown;
	private PageElement subLimitOfDirectorVersusDirectorExtensionsTextField;
	private PageElement optionsForDirectorVersusDirectorExtensionsDropDown;
	private PageElement loadingAmountForDirectorVersusDirectorExtensionsTextField;
	private PageElement loadingPercentForDirectorVersusDirectorExtensionsTextField;
	private PageElement shadowDirectorshipExtensionsDropDown;
	private PageElement subLimitOfShadowDirectorshipExtensionsTextField;
	private PageElement optionsForShadowDirectorshipExtensionsDropDown;
	private PageElement loadingAmountForShadowDirectorshipExtensionsTextField;
	private PageElement loadingPercentForShadowDirectorshipExtensionsTextField;
	private PageElement autoAcquisitionOfSubsidiariesDropDown;
	private PageElement subLimitOfAutoAcquisitionSubsidiariesTextField;
	private PageElement optionsForAutoAcquisitionSubsidiariesDropDown;
	private PageElement loadingAmountForAutoAcquisitionSubsidiariesTextField;
	private PageElement loadingPercentForAutoAcquisitionSubsidiariesTextField;
	private PageElement computerCrimeInsuranceDropDown;
	private PageElement subLimitOfComputerCrimeInsuranceTextField;
	private PageElement optionsForComputerCrimeInsuranceDropDown;
	private PageElement loadingAmountForComputerCrimeInsuranceTextField;
	private PageElement loadingPercentForComputerCrimeInsuranceTextField;
	private PageElement discoveryPeriodExtensionDropDown;
	private PageElement subLimitOfDiscoveryPeriodExtensionTextField;
	private PageElement optionsForDiscoveryPeriodExtensionDropDown;
	private PageElement loadingAmountForDiscoveryPeriodExtensionTextField;
	private PageElement loadingPercentForDiscoveryPeriodExtensionTextField;
	private PageElement specialConditions1TextArea;
	private PageElement specialConditions2TextArea;
	private PageElement forwordButton;

	// IN

	private PageElement goodFeatureDiscountTextField;
	private PageElement deductibleTextField;
	private PageElement pliActDiscountApplicableDropDown;
	private PageElement pliPolicyNumberTextField;
	private PageElement pliNameOfCompanyTextArea;
	private PageElement pliActOnlyPremiumTextField;
	private PageElement pliActDiscountTextField;
	
	



	public RiskDetailsFourthPageMiscInsured(WebDriver driver, String pageName) {
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


		crisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCoverDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Crisis Communication cover should be also provided as an additional cover","select")), "Crisis Communication cover should be also provided as an additional cover DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfCrisisCommunicationCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Crisis Communication cover","input")), "Sub Limit of Crisis Communication cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForCrisisCommunicationCoverDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Crisis Communication cover","select")), "Options for Crisis Communication cover DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForCrisisCommunicationCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Crisis Communication cover","input")), "Loading Amount for Crisis Communication cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForCrisisCommunicationCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Crisis Communication cover","input")), "Loading(%) for Crisis Communication cover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		courtAttendanceCostExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Court Attendance Cost Extension","select")), "Court Attendance Cost Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfCourtAttendanceCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Court Attendance Cost Extension","input")), "Sub Limit of Court Attendance Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForCourtAttendanceCostExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Court Attendance Cost Extension","select")), "Options for Court Attendance Cost Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForCourtAttendanceCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Court Attendance Cost Extension","input")), "Loading Amount for Court Attendance Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForCourtAttendanceCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Court Attendance Cost Extension","input")), "Loading(%) for Court Attendance Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		riskManagementExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Risk Management Extension","select")), "Risk Management Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfRiskManagementExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Risk Management Extension","input")), "Sub Limit of Risk Management Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForRiskManagementExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Risk Management Extension","select")), "Options for Risk Management Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForRiskManagementExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Risk Management Extension","input")), "Loading Amount for Risk Management Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForRiskManagementExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Risk Management Extension","input")), "Loading(%) for Risk Management Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pollutionDefenseCostExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pollution defense Cost Extension","select")), "Pollution defense Cost Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfPollutionDefenseCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Pollution defense Cost Extension","input")), "Sub Limit of Pollution defense Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForPollutionDefenseCostExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Pollution defense Cost Extension","select")), "Options for Pollution defense Cost Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForPollutionDefenseCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Pollution defense Cost Extension","input")), "Loading Amount for Pollution defense Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForPollutionDefenseCostExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Pollution defense Cost Extension","input")), "Loading(%) for Pollution defense Cost Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		employmentPracticeLiabilityEPLIDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employment Practice Liability(EPLI)","select")), "Employment Practice Liability(EPLI) DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfEmploymentPracticeLiabilityEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Employment Practice Liability(EPLI)","input")), "Sub Limit of Employment Practice Liability(EPLI) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForEmploymentPracticeLiabilityEPLIDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Employment Practice Liability(EPLI)","select")), "Options for Employment Practice Liability(EPLI) DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForEmploymentPracticeLiabilityEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Employment Practice Liability(EPLI)","input")), "Loading Amount for Employment Practice Liability(EPLI) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForEmploymentPracticeLiabilityEPLITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Employment Practice Liability(EPLI)","input")), "Loading(%) for Employment Practice Liability(EPLI) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleForEPLIExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deductible for EPLI Extension","input")), "Deductible for EPLI Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		directorVersusDirectorExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Director versus Director Extensions","select")), "Director versus Director Extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfDirectorVersusDirectorExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Director versus Director Extensions","input")), "Sub Limit of Director versus Director Extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForDirectorVersusDirectorExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Director versus Director Extensions","select")), "Options for Director versus Director Extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForDirectorVersusDirectorExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Director versus Director Extensions","input")), "Loading Amount for Director versus Director Extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForDirectorVersusDirectorExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Director versus Director Extensions","input")), "Loading(%) for Director versus Director Extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		shadowDirectorshipExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shadow Directorship extensions","select")), "Shadow Directorship extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfShadowDirectorshipExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Shadow Directorship extensions","input")), "Sub Limit of Shadow Directorship extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForShadowDirectorshipExtensionsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Shadow Directorship extensions","select")), "Options for Shadow Directorship extensions DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForShadowDirectorshipExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Shadow Directorship extensions","input")), "Loading Amount for Shadow Directorship extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForShadowDirectorshipExtensionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Shadow Directorship extensions","input")), "Loading(%) for Shadow Directorship extensions TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		autoAcquisitionOfSubsidiariesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Auto acquisition of subsidiaries","select")), "Auto acquisition of subsidiaries DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfAutoAcquisitionSubsidiariesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Auto-acquisition subsidiaries","input")), "Sub Limit of Auto-acquisition subsidiaries TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForAutoAcquisitionSubsidiariesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Auto-acquisition subsidiaries","select")), "Options for Auto-acquisition subsidiaries DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForAutoAcquisitionSubsidiariesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Auto-acquisition subsidiaries","input")), "Loading Amount for Auto-acquisition subsidiaries TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForAutoAcquisitionSubsidiariesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Auto-acquisition subsidiaries","input")), "Loading(%) for Auto-acquisition subsidiaries TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		computerCrimeInsuranceDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Computer Crime Insurance","select")), "Computer Crime Insurance DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfComputerCrimeInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub limit of Computer Crime Insurance","input")), "Sub limit of Computer Crime Insurance TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForComputerCrimeInsuranceDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Computer Crime Insurance","select")), "Options for Computer Crime Insurance DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForComputerCrimeInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Computer Crime Insurance","input")), "Loading Amount for Computer Crime Insurance TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForComputerCrimeInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Computer Crime Insurance","input")), "Loading(%) for Computer Crime Insurance TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discoveryPeriodExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discovery Period Extension","select")), "Discovery Period Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfDiscoveryPeriodExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Limit of Discovery Period Extension","input")), "Sub Limit of Discovery Period Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForDiscoveryPeriodExtensionDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options for Discovery Period Extension","select")), "Options for Discovery Period Extension DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForDiscoveryPeriodExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Amount for Discovery Period Extension","input")), "Loading Amount for Discovery Period Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentForDiscoveryPeriodExtensionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading(%) for Discovery Period Extension","input")), "Loading(%) for Discovery Period Extension TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditions1TextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1","textarea")), "Special Conditions1 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		specialConditions2TextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2","textarea")), "Special Conditions2 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	

		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// IN

		goodFeatureDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Good Feature Discount (%)')]/following::input"), "Good Feature Discount Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible')]/following::textarea[1]"), "Deductible Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pliActDiscountApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'PLI Act Discount Applicable')]/following::select"), "PLI Act DiscountApplicable Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pliPolicyNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'PLI Policy Number')]/following::input"), "PLI Policy Number Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pliNameOfCompanyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'PLI Name of Company')]/following::textarea"), "PLI Name of Company Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pliActOnlyPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'PLI act only premium')]/following::input"), "PLI act only premium Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		pliActDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'PLI Act Discount (%)')]/following::input"), "PLI Act Discount (%) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		
	
	
	
	
	
	
	}


	//Services
	public void fillRiskDetailsFourthPage(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFourthMiscEntity.getAction().equalsIgnoreCase("add") || riskDetailsFourthMiscEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigCrisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCover")) {
				selectValueFromList(crisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCoverDropDown, riskDetailsFourthMiscEntity.getStringValueForField("CrisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCover"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfCrisisCommunicationCover")) {
				clearAndSendKeys(subLimitOfCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfCrisisCommunicationCover"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForCrisisCommunicationCover")) {
				selectValueFromList(optionsForCrisisCommunicationCoverDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForCrisisCommunicationCover"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForCrisisCommunicationCover")) {
				clearAndSendKeys(loadingAmountForCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForCrisisCommunicationCover"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForCrisisCommunicationCover")) {
				clearAndSendKeys(loadingPercentForCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForCrisisCommunicationCover"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigCourtAttendanceCostExtension")) {
				selectValueFromList(crisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCoverDropDown, riskDetailsFourthMiscEntity.getStringValueForField("CourtAttendanceCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfCourtAttendanceCostExtension")) {
				clearAndSendKeys(subLimitOfCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfCourtAttendanceCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForCourtAttendanceCostExtension")) {
				selectValueFromList(optionsForCrisisCommunicationCoverDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForCourtAttendanceCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForCourtAttendanceCostExtension")) {
				clearAndSendKeys(loadingAmountForCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForCourtAttendanceCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForCourtAttendanceCostExtension")) {
				clearAndSendKeys(loadingPercentForCrisisCommunicationCoverTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForCourtAttendanceCostExtension"));
			}

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigRiskManagementExtension")) {
				selectValueFromList(riskManagementExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("RiskManagementExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfRiskManagementExtension")) {
				clearAndSendKeys(subLimitOfRiskManagementExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfRiskManagementExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForRiskManagementExtension")) {
				selectValueFromList(optionsForRiskManagementExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForRiskManagementExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForRiskManagementExtension")) {
				clearAndSendKeys(loadingAmountForRiskManagementExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForRiskManagementExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForRiskManagementExtension")) {
				clearAndSendKeys(loadingPercentForRiskManagementExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForRiskManagementExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPollutionDefenseCostExtension")) {
				selectValueFromList(pollutionDefenseCostExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("PollutionDefenseCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfPollutionDefenseCostExtension")) {
				clearAndSendKeys(subLimitOfPollutionDefenseCostExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfPollutionDefenseCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForPollutionDefenseCostExtension")) {
				selectValueFromList(optionsForPollutionDefenseCostExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForPollutionDefenseCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForPollutionDefenseCostExtension")) {
				clearAndSendKeys(loadingAmountForPollutionDefenseCostExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForPollutionDefenseCostExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForPollutionDefenseCostExtension")) {
				clearAndSendKeys(loadingPercentForPollutionDefenseCostExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForPollutionDefenseCostExtension"));
			}

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigEmploymentPracticeLiabilityEPLI")) {
				selectValueFromList(employmentPracticeLiabilityEPLIDropDown, riskDetailsFourthMiscEntity.getStringValueForField("EmploymentPracticeLiabilityEPLI"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfEmploymentPracticeLiabilityEPLI")) {
				clearAndSendKeys(subLimitOfEmploymentPracticeLiabilityEPLITextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfEmploymentPracticeLiabilityEPLI"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForEmploymentPracticeLiabilityEPLI")) {
				selectValueFromList(optionsForEmploymentPracticeLiabilityEPLIDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForEmploymentPracticeLiabilityEPLI"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForEmploymentPracticeLiabilityEPLI")) {
				clearAndSendKeys(loadingAmountForEmploymentPracticeLiabilityEPLITextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForEmploymentPracticeLiabilityEPLI"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentAmountForEmploymentPracticeLiabilityEPLI")) {
				clearAndSendKeys(loadingPercentForEmploymentPracticeLiabilityEPLITextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentAmountForEmploymentPracticeLiabilityEPLI"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDeductibleForEPLIExtension")) {
				clearAndSendKeys(deductibleForEPLIExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("DeductibleForEPLIExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDirectorVersusDirectorExtensions")) {
				selectValueFromList(directorVersusDirectorExtensionsDropDown, riskDetailsFourthMiscEntity.getStringValueForField("DirectorVersusDirectorExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfDirectorVersusDirectorExtensions")) {
				clearAndSendKeys(subLimitOfDirectorVersusDirectorExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfDirectorVersusDirectorExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForDirectorVersusDirectorExtensions")) {
				selectValueFromList(optionsForDirectorVersusDirectorExtensionsDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForDirectorVersusDirectorExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForDirectorVersusDirectorExtensions")) {
				clearAndSendKeys(loadingAmountForDirectorVersusDirectorExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForDirectorVersusDirectorExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForDirectorVersusDirectorExtensions")) {
				clearAndSendKeys(loadingPercentForDirectorVersusDirectorExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForDirectorVersusDirectorExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigShadowDirectorshipExtensions")) {
				selectValueFromList(shadowDirectorshipExtensionsDropDown, riskDetailsFourthMiscEntity.getStringValueForField("ShadowDirectorshipExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfShadowDirectorshipExtensions")) {
				clearAndSendKeys(subLimitOfShadowDirectorshipExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfShadowDirectorshipExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForShadowDirectorshipExtensions")) {
				selectValueFromList(optionsForShadowDirectorshipExtensionsDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForShadowDirectorshipExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForShadowDirectorshipExtensions")) {
				clearAndSendKeys(loadingAmountForShadowDirectorshipExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForShadowDirectorshipExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForShadowDirectorshipExtensions")) {
				clearAndSendKeys(loadingPercentForShadowDirectorshipExtensionsTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForShadowDirectorshipExtensions"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigAutoAcquisitionOfSubsidiaries")) {
				selectValueFromList(autoAcquisitionOfSubsidiariesDropDown, riskDetailsFourthMiscEntity.getStringValueForField("AutoAcquisitionOfSubsidiaries"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfAutoAcquisitionOfSubsidiaries")) {
				clearAndSendKeys(subLimitOfAutoAcquisitionSubsidiariesTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfAutoAcquisitionOfSubsidiaries"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForAutoAcquisitionOfSubsidiaries")) {
				selectValueFromList(optionsForAutoAcquisitionSubsidiariesDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForAutoAcquisitionOfSubsidiaries"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountAutoAcquisitionOfSubsidiaries")) {
				clearAndSendKeys(loadingAmountForAutoAcquisitionSubsidiariesTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountAutoAcquisitionOfSubsidiaries"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentAutoAcquisitionOfSubsidiaries")) {
				clearAndSendKeys(loadingPercentForAutoAcquisitionSubsidiariesTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentAutoAcquisitionOfSubsidiaries"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigComputerCrimeInsurance")) {
				selectValueFromList(computerCrimeInsuranceDropDown, riskDetailsFourthMiscEntity.getStringValueForField("ComputerCrimeInsurance"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfComputerCrimeInsurance")) {
				clearAndSendKeys(subLimitOfComputerCrimeInsuranceTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfComputerCrimeInsurance"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForComputerCrimeInsurance")) {
				selectValueFromList(optionsForComputerCrimeInsuranceDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForComputerCrimeInsurance"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountComputerCrimeInsurance")) {
				clearAndSendKeys(loadingAmountForComputerCrimeInsuranceTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountComputerCrimeInsurance"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentComputerCrimeInsurance")) {
				clearAndSendKeys(loadingPercentForComputerCrimeInsuranceTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentComputerCrimeInsurance"));
			}

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDiscoveryPeriodExtension")) {
				selectValueFromList(discoveryPeriodExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("DiscoveryPeriodExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfDiscoveryPeriodExtension")) {
				clearAndSendKeys(subLimitOfDiscoveryPeriodExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfDiscoveryPeriodExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForDiscoveryPeriodExtension")) {
				selectValueFromList(optionsForDiscoveryPeriodExtensionDropDown, riskDetailsFourthMiscEntity.getStringValueForField("OptionsForDiscoveryPeriodExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountDiscoveryPeriodExtension")) {
				clearAndSendKeys(loadingAmountForDiscoveryPeriodExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountDiscoveryPeriodExtension"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentDiscoveryPeriodExtension")) {
				clearAndSendKeys(loadingPercentForDiscoveryPeriodExtensionTextField, riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentDiscoveryPeriodExtension"));
			}

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				clearAndSendKeys(specialConditions1TextArea, riskDetailsFourthMiscEntity.getStringValueForField("SpecialConditionsOne"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				clearAndSendKeys(specialConditions2TextArea, riskDetailsFourthMiscEntity.getStringValueForField("SpecialConditionsTwo"));
			}
			// IN

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigGoodFeatureDiscount")) {
				clearAndSendKeys(goodFeatureDiscountTextField, riskDetailsFourthMiscEntity.getStringValueForField("GoodFeatureDiscount"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, riskDetailsFourthMiscEntity.getStringValueForField("Deductible"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActDiscountApplicable")) {
				selectValueFromList(pliActDiscountApplicableDropDown, riskDetailsFourthMiscEntity.getStringValueForField("PliActDiscountApplicable"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliPolicyNumber")) {
				clearAndSendKeys(pliPolicyNumberTextField, riskDetailsFourthMiscEntity.getStringValueForField("PliPolicyNumber"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliNameOfCompany")) {
				clearAndSendKeys(pliNameOfCompanyTextArea, riskDetailsFourthMiscEntity.getStringValueForField("PliNameOfCompany"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActOnlyPremium")) {
				clearAndSendKeys(pliActOnlyPremiumTextField, riskDetailsFourthMiscEntity.getStringValueForField("PliActOnlyPremium"));
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActDiscount")) {
				clearAndSendKeys(pliActDiscountTextField, riskDetailsFourthMiscEntity.getStringValueForField("PliActDiscount"));
			}

		}

		else if(riskDetailsFourthMiscEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigCrisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCover")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("CrisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCover"), fetchValueFromTextFields(crisisCommunicationCoverShouldBeAlsoProvidedAsAnAdditionalCoverDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfCrisisCommunicationCover")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfCrisisCommunicationCover"), fetchValueFromTextFields(subLimitOfCrisisCommunicationCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForCrisisCommunicationCover")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForCrisisCommunicationCover"), fetchValueFromTextFields(optionsForCrisisCommunicationCoverDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForCrisisCommunicationCover")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForCrisisCommunicationCover"), fetchValueFromTextFields(loadingAmountForCrisisCommunicationCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForCrisisCommunicationCover")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForCrisisCommunicationCover"), fetchValueFromTextFields(loadingPercentForCrisisCommunicationCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigCourtAttendanceCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("CourtAttendanceCostExtension"), fetchValueFromTextFields(courtAttendanceCostExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfCourtAttendanceCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfCourtAttendanceCostExtension"), fetchValueFromTextFields(subLimitOfCourtAttendanceCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForCourtAttendanceCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForCourtAttendanceCostExtension"), fetchValueFromTextFields(optionsForCourtAttendanceCostExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForCourtAttendanceCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForCourtAttendanceCostExtension"), fetchValueFromTextFields(loadingAmountForCourtAttendanceCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForCourtAttendanceCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForCourtAttendanceCostExtension"), fetchValueFromTextFields(loadingPercentForCourtAttendanceCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigRiskManagementExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("RiskManagementExtension"), fetchValueFromTextFields(riskManagementExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfRiskManagementExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfRiskManagementExtension"), fetchValueFromTextFields(subLimitOfRiskManagementExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForRiskManagementExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForRiskManagementExtension"), fetchValueFromTextFields(optionsForRiskManagementExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForRiskManagementExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForRiskManagementExtension"), fetchValueFromTextFields(loadingAmountForRiskManagementExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForRiskManagementExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForRiskManagementExtension"), fetchValueFromTextFields(loadingPercentForRiskManagementExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPollutionDefenseCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PollutionDefenseCostExtension"), fetchValueFromTextFields(pollutionDefenseCostExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfPollutionDefenseCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfPollutionDefenseCostExtension"), fetchValueFromTextFields(subLimitOfPollutionDefenseCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForPollutionDefenseCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForPollutionDefenseCostExtension"), fetchValueFromTextFields(optionsForPollutionDefenseCostExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForPollutionDefenseCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForPollutionDefenseCostExtension"), fetchValueFromTextFields(loadingAmountForPollutionDefenseCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForPollutionDefenseCostExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForPollutionDefenseCostExtension"), fetchValueFromTextFields(loadingPercentForPollutionDefenseCostExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("EmploymentPracticeLiabilityEPLI"), fetchValueFromTextFields(employmentPracticeLiabilityEPLIDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfEmploymentPracticeLiabilityEPLI"), fetchValueFromTextFields(subLimitOfEmploymentPracticeLiabilityEPLITextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForEmploymentPracticeLiabilityEPLI"), fetchValueFromTextFields(optionsForEmploymentPracticeLiabilityEPLIDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForEmploymentPracticeLiabilityEPLI"), fetchValueFromTextFields(loadingAmountForEmploymentPracticeLiabilityEPLITextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentAmountForEmploymentPracticeLiabilityEPLI")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentAmountForEmploymentPracticeLiabilityEPLI"), fetchValueFromTextFields(loadingPercentForEmploymentPracticeLiabilityEPLITextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDeductibleForEPLIExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("DeductibleForEPLIExtension"), fetchValueFromTextFields(deductibleForEPLIExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("DirectorVersusDirectorExtensions"), fetchValueFromTextFields(directorVersusDirectorExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfDirectorVersusDirectorExtensions"), fetchValueFromTextFields(subLimitOfDirectorVersusDirectorExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForDirectorVersusDirectorExtensions"), fetchValueFromTextFields(optionsForDirectorVersusDirectorExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForDirectorVersusDirectorExtensions"), fetchValueFromTextFields(loadingAmountForDirectorVersusDirectorExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForDirectorVersusDirectorExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForDirectorVersusDirectorExtensions"), fetchValueFromTextFields(loadingPercentForDirectorVersusDirectorExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigShadowDirectorshipExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("ShadowDirectorshipExtensions"), fetchValueFromTextFields(shadowDirectorshipExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfShadowDirectorshipExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfShadowDirectorshipExtensions"), fetchValueFromTextFields(subLimitOfShadowDirectorshipExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForShadowDirectorshipExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForShadowDirectorshipExtensions"), fetchValueFromTextFields(optionsForShadowDirectorshipExtensionsDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountForShadowDirectorshipExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountForShadowDirectorshipExtensions"), fetchValueFromTextFields(loadingAmountForShadowDirectorshipExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentForShadowDirectorshipExtensions")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentForShadowDirectorshipExtensions"), fetchValueFromTextFields(loadingPercentForShadowDirectorshipExtensionsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigAutoAcquisitionOfSubsidiaries")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("AutoAcquisitionOfSubsidiaries"), fetchValueFromTextFields(autoAcquisitionOfSubsidiariesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfAutoAcquisitionOfSubsidiaries")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfAutoAcquisitionOfSubsidiaries"), fetchValueFromTextFields(subLimitOfAutoAcquisitionSubsidiariesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForAutoAcquisitionOfSubsidiaries")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForAutoAcquisitionOfSubsidiaries"), fetchValueFromTextFields(optionsForAutoAcquisitionSubsidiariesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountAutoAcquisitionOfSubsidiaries")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountAutoAcquisitionOfSubsidiaries"), fetchValueFromTextFields(loadingAmountForAutoAcquisitionSubsidiariesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentAutoAcquisitionOfSubsidiaries")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentAutoAcquisitionOfSubsidiaries"), fetchValueFromTextFields(loadingPercentForAutoAcquisitionSubsidiariesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigComputerCrimeInsurance")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("ComputerCrimeInsurance"), fetchValueFromTextFields(computerCrimeInsuranceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfComputerCrimeInsurance")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfComputerCrimeInsurance"), fetchValueFromTextFields(subLimitOfComputerCrimeInsuranceTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForComputerCrimeInsurance")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForComputerCrimeInsurance"), fetchValueFromTextFields(optionsForComputerCrimeInsuranceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountComputerCrimeInsurance")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountComputerCrimeInsurance"), fetchValueFromTextFields(loadingAmountForComputerCrimeInsuranceTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentComputerCrimeInsurance")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentComputerCrimeInsurance"), fetchValueFromTextFields(loadingPercentForComputerCrimeInsuranceTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDiscoveryPeriodExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("DiscoveryPeriodExtension"), fetchValueFromTextFields(discoveryPeriodExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSubLimitOfDiscoveryPeriodExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SubLimitOfDiscoveryPeriodExtension"), fetchValueFromTextFields(subLimitOfDiscoveryPeriodExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigOptionsForDiscoveryPeriodExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("OptionsForDiscoveryPeriodExtension"), fetchValueFromTextFields(optionsForDiscoveryPeriodExtensionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingAmountDiscoveryPeriodExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingAmountDiscoveryPeriodExtension"), fetchValueFromTextFields(loadingAmountForDiscoveryPeriodExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoadingPercentDiscoveryPeriodExtension")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("LoadingPercentDiscoveryPeriodExtension"), fetchValueFromTextFields(loadingPercentForDiscoveryPeriodExtensionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SpecialConditionsOne"), fetchValueFromTextFields(specialConditions1TextArea),AssertionType.WARNING);
			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("SpecialConditionsTwo"), fetchValueFromTextFields(specialConditions2TextArea),AssertionType.WARNING);
			}
			// IN

			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigGoodFeatureDiscount")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("GoodFeatureDiscount"), fetchValueFromTextFields(goodFeatureDiscountTextField),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActDiscountApplicable")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PliActDiscountApplicable"), fetchValueFromTextFields(pliActDiscountApplicableDropDown),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliPolicyNumber")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PliPolicyNumber"), fetchValueFromTextFields(pliPolicyNumberTextField),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliNameOfCompany")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PliNameOfCompany"), fetchValueFromTextFields(pliNameOfCompanyTextArea),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActOnlyPremium")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PliActOnlyPremium"), fetchValueFromTextFields(pliActOnlyPremiumTextField),AssertionType.WARNING);

			}
			if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPliActDiscount")) {
				assertReference.assertEquals(riskDetailsFourthMiscEntity.getStringValueForField("PliActDiscount"), fetchValueFromTextFields(pliActDiscountTextField),AssertionType.WARNING);

			}

		}
	}


	public void navigateToPolicy(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToInsuredInterest(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity){
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void clickOnNextButton(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity) {
		if (riskDetailsFourthMiscEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitRiskDetailsFourthPage(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskDetailsFourthMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillRiskDetailsFourthPage(riskDetailsFourthMiscEntity, assertReference);
			clickOnNextButton(riskDetailsFourthMiscEntity);
			navigateToPolicy(riskDetailsFourthMiscEntity);
			navigateToAttribute(riskDetailsFourthMiscEntity);
			navigateToInsuredInterest(riskDetailsFourthMiscEntity);
			navigateToCoverage(riskDetailsFourthMiscEntity);
			navigateToLoan(riskDetailsFourthMiscEntity);
			navigateToClientDetails(riskDetailsFourthMiscEntity);
			navigateToRelation(riskDetailsFourthMiscEntity);
			navigateToPayment(riskDetailsFourthMiscEntity);
			navigateToFollowup(riskDetailsFourthMiscEntity);
			navigateToDocument(riskDetailsFourthMiscEntity);

		}
	}
}



