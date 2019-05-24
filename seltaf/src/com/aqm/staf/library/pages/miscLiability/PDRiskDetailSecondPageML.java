package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PDRskDetailSecndPageMLEntity;
import com.aqm.staf.library.databin.RiskDetailsFirstMiscEntity;
import com.aqm.staf.library.databin.RiskDetailsThirdMiscEntity;

public class PDRiskDetailSecondPageML extends BasePage {
	
	private PageElement ThisPageTitle;
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
	
	private PageElement riskDetailsNextPageTitle;
	
	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement insuredInterestSerialNoLable;
	
	private PageElement anyOneAccidentAOATextField;
	private PageElement aOAAOYDropDown;
	private PageElement anyOneYearandintheAggregateAOYTextField;
	private PageElement retroactiveDateOneTextField;
	private PageElement retroactiveDateOneFindButton;
	private PageElement deductibleTypeOneDropDown;
	private PageElement geographicalJurisdictionOneDropDown;
	private PageElement deductibleforIndiaOneTextField;
	private PageElement deductibleforWorldwideExcludingUSAandCanadaOneTextField;
	private PageElement deductibleforWorldwideIncludingUSAandCanadaOneTextField;
	private PageElement retroactiveDateTwoTextField;
	private PageElement retroactiveDateThreeTextField;
	private PageElement retroactiveDateFourTextField;
	private PageElement retroactiveDateFiveTextField;
	
	private PageElement retroactiveDateTwoFindButton;
	private PageElement retroactiveDateThreeFindButton;
	private PageElement retroactiveDateFourFindButton;
	private PageElement retroactiveDateFiveFindButton;
	
	private PageElement doyouwanttoattachTechnicalCollaboratorsLiabilityDropDown;
	private PageElement subLimitofattachTechnicalCollaboratorsLiabilityTextField;
	private PageElement optionsforTechnicalCollaboratorsLiabilityDropDown;
	private PageElement loadingPercntforTechnicalCollaboratorsLiabilityTextField;
	private PageElement loadingAmountforTechnicalCollaboratorsLiabilityTextField;
	private PageElement doYouWantToAttachContractorsDropDown;
	private PageElement subLimitofAttachContractorTextField;
	private PageElement optionsforAttachContractorDropDown;
	private PageElement loadingPercntforAttachContractorTextField;
	private PageElement loadingAmountforAttachContractorTextField;
	private PageElement doyouwanttoattachIntellectualPropertyRightsDropDown;
	private PageElement subLimitofattachIntellectualPropertyRightsTextField;
	private PageElement optionsforattachIntellectualPropertyRightsDropDown;
	private PageElement loadingPercentforattachIntellectualPropertyRightsTextField;
	private PageElement loadingAmountforattachIntellectualPropertyRightsTextField;
	private PageElement PreviousButton;
	private PageElement forwordButton;
	private PageElement saveButton;
	private PageElement percentageOnOneDropDown;
	
	//PK
	private PageElement estimatedTurnoverAnnualfeesTextField;
	private PageElement specialTermsandConditionsTextarea;
	private PageElement specialcoversIfanyTextarea;
	private PageElement loadingPercentforTurnoverTextField;
	private PageElement loadingTextField;
	private PageElement deductibleTextField;
	private PageElement specialConditionsOneTextarea;
	private PageElement specialConditionsTwoTextarea;



	public PDRiskDetailSecondPageML(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		ThisPageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details T1-PK')]"), "Risk Detail T1-PK Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		quoteNoLable  	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLable	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLable	 		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLable		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		anyOneAccidentAOATextField	= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)')]/following::input"), "any One Accident AOA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		aOAAOYDropDown				= new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY')]/following::select"), "AOA : AOY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneYearandintheAggregateAOYTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)')]/following::input"), "AnyOneYearand(AOY)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateOneTextField	=  new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date1')]/following::input"), "retroactive Date One", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateOneFindButton=  new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date1')]/following::img"), "Number of Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleTypeOneDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Deductible   Type1')]/following::select"), "deductible Type One", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		geographicalJurisdictionOneDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Geographical Jurisdiction1')]/following::select"), "Number of Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleforIndiaOneTextField				= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India1')]/following::input"), "Number of Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleforWorldwideExcludingUSAandCanadaOneTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for Worldwide (Excluding USA and Canada)1')]/following::input"), "Deductible for Worldwide (Excluding USA and Canada)1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleforWorldwideIncludingUSAandCanadaOneTextField	= new PageElement(By.xpath("Deductible for Worldwide (Including USA and Canada)1"), "Deductible for Worldwide (Including USA and Canada)1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateTwoTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 2')]/following::input"), "Retroactive Date 2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateThreeTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 3')]/following::input"), "Retroactive Date 3", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateFourTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 4')]/following::input"), "Retroactive Date 4", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateFiveTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 5')]/following::input"), "Retroactive Date 5", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		retroactiveDateTwoFindButton	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 2')]/following::img"), "Retroactive Date 2 FindButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateThreeFindButton	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 3')]/following::img"), "Retroactive Date 3 FindButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateFourFindButton	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 4')]/following::img"), "Retroactive Date 4 FindButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		retroactiveDateFiveFindButton	= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 5')]/following::img"), "Retroactive Date 5 FindButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			
		doyouwanttoattachTechnicalCollaboratorsLiabilityDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Technical collaborators liability')]/following::select"), "Do you want to attach Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitofattachTechnicalCollaboratorsLiabilityTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Technical collaborators liability')]/following::input"), "Sub Limit of attach Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionsforTechnicalCollaboratorsLiabilityDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Options for Technical collaborators liability')]/following::select"), "Options for Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingPercntforTechnicalCollaboratorsLiabilityTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Technical collaborators liability')]/following::input"), "Loading (%) for Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountforTechnicalCollaboratorsLiabilityTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Technical collaborators liability')]/following::input"), "Loading Amount for Technical collaborators liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doYouWantToAttachContractorsDropDown		= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Contractors/Sub-Contractors/Loan and License Manufacturer')]/following::select"), "Do you want to attach Contractors", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitofAttachContractorTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Contractor/Sub-Contractor/Loan and License Manufacturer')]/following::input"), "Sub Limit of attach Contractor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionsforAttachContractorDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Options for attach Contractor/SubContractor/Loan and License Manufacturer')]/following::select"), "Options for attach Contractor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingPercntforAttachContractorTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for attach Contractor/SubContractor/Loan and License Manufacturer')]/following::input"), "Loading (%) for attach Contractor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountforAttachContractorTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for attach Contractor/SubContractor/Loan and License Manufacturer')]/following::input"), "Loading Amount for attach Contractor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doyouwanttoattachIntellectualPropertyRightsDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Intellectual property rights')]/following::select"), "Do you want to attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitofattachIntellectualPropertyRightsTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Intellectual property rights')]/following::input"), "Sub Limit of attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionsforattachIntellectualPropertyRightsDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Options for attach Intellectual property rights')]/following::select"), "Options for attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingPercentforattachIntellectualPropertyRightsTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for attach Intellectual property rights')]/following::input"), "Loading Amount for attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountforattachIntellectualPropertyRightsTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading(%) for attach Intellectual property rights')]/following::input"), "Loading(%) for attach Intellectual property rights", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		PreviousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton =new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		percentageOnOneDropDown 	= new PageElement(By.xpath("//td//div[contains(text(),'Percentage On1')]/following::select"), "Percentage On 1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		estimatedTurnoverAnnualfeesTextField	=  new PageElement(By.xpath("//td//div[contains(text(),'Estimated Turnover/Annual fees')]/following::input"), "Estimated Turnover/Annual fees", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialTermsandConditionsTextarea	= new PageElement(By.xpath("//td//div[contains(text(),'Special Terms and Conditions')]/following::textarea"), "Special Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialcoversIfanyTextarea			= new PageElement(By.xpath("//td//div[contains(text(),'Special covers (If any)')]/following::textarea"), "Special covers (If any)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingPercentforTurnoverTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Turnover')]/following::input"), "Loading (%) for Turnover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Loading')]/following::input"), "Loading", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Deductible')]/following::input"), "Deductible", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionsOneTextarea		= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions1')]/following::textarea"), "Special Conditions1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionsTwoTextarea		= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions2')]/following::textarea"), "Special Conditions2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	
	public void fillPDRiskDetailSecondPageML(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity, CustomAssert assertReference) throws InterruptedException{
		if(pDRskDetailSecndPageMLEntity.getAction().equalsIgnoreCase("add") || pDRskDetailSecndPageMLEntity.getAction().equalsIgnoreCase("edit")){
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				clearAndSendKeys(anyOneAccidentAOATextField, pDRskDetailSecndPageMLEntity.getStringValueForField("AnyOneAccidentAOA"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAOAAOY")) {
				selectValueFromList(aOAAOYDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("AOAAOY"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAnyOneYearandintheAggregateAOY")) {
				clearAndSendKeys(anyOneYearandintheAggregateAOYTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("AnyOneYearandintheAggregateAOY"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateOne")) {
				click(retroactiveDateOneFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateOneTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateOne"));
				switchToFrame("display");
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleTypeOne")) {
				selectValueFromList(deductibleTypeOneDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleTypeOne"));
			}
						
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionOne")) {
				selectValueFromList(geographicalJurisdictionOneDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("GeographicalJurisdictionOne"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforIndiaOne")) {
				clearAndSendKeys(deductibleforIndiaOneTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforIndiaOne"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforWorldwideExcludingUSAandCanadaOne")) {
				clearAndSendKeys(deductibleforWorldwideExcludingUSAandCanadaOneTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforWorldwideExcludingUSAandCanadaOne"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforWorldwideIncludingUSAandCanadaOne")) {
				clearAndSendKeys(deductibleforWorldwideIncludingUSAandCanadaOneTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforWorldwideIncludingUSAandCanadaOne"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateTwo")) {
				click(retroactiveDateTwoFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateTwoTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateTwo"));
				switchToFrame("display");
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateThree")) {
				click(retroactiveDateThreeFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateThreeTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateThree"));
				switchToFrame("display");
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				click(retroactiveDateFourFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateFourTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateFour"));
				switchToFrame("display");
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				click(retroactiveDateFiveFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDateFiveTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateFive"));
				switchToFrame("display");
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoyouwanttoattachTechnicalCollaboratorsLiability")) {
				selectValueFromList(doyouwanttoattachTechnicalCollaboratorsLiabilityDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("DoyouwanttoattachTechnicalCollaboratorsLiability"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofattachTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(subLimitofattachTechnicalCollaboratorsLiabilityTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofattachTechnicalCollaboratorsLiability"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforTechnicalCollaboratorsLiability")) {
				selectValueFromList(optionsforTechnicalCollaboratorsLiabilityDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforTechnicalCollaboratorsLiability"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercntforTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(loadingPercntforTechnicalCollaboratorsLiabilityTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercntforTechnicalCollaboratorsLiability"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforTechnicalCollaboratorsLiability")) {
				clearAndSendKeys(loadingAmountforTechnicalCollaboratorsLiabilityTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforTechnicalCollaboratorsLiability"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoYouWantToAttachContractors")) {
				selectValueFromList(doYouWantToAttachContractorsDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("DoYouWantToAttachContractors"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofAttachContractor")) {
				clearAndSendKeys(subLimitofAttachContractorTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofAttachContractor"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforAttachContractor")) {
				selectValueFromList(optionsforAttachContractorDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforAttachContractor"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercntforAttachContractor")) {
				clearAndSendKeys(loadingPercntforAttachContractorTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercntforAttachContractor"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforAttachContractor")) {
				clearAndSendKeys(loadingAmountforAttachContractorTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforAttachContractor"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoyouwanttoattachIntellectualPropertyRights")) {
				selectValueFromList(doyouwanttoattachIntellectualPropertyRightsDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("DoyouwanttoattachIntellectualPropertyRights"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofattachIntellectualPropertyRights")) {
				clearAndSendKeys(subLimitofattachIntellectualPropertyRightsTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofattachIntellectualPropertyRights"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforattachIntellectualPropertyRights")) {
				selectValueFromList(optionsforattachIntellectualPropertyRightsDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforattachIntellectualPropertyRights"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercentforattachIntellectualPropertyRights")) {
				clearAndSendKeys(loadingPercentforattachIntellectualPropertyRightsTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercentforattachIntellectualPropertyRights"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforattachIntellectualPropertyRights")) {
				clearAndSendKeys(loadingAmountforattachIntellectualPropertyRightsTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforattachIntellectualPropertyRights"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigPercentageOnOne")) {
				selectValueFromList(percentageOnOneDropDown, pDRskDetailSecndPageMLEntity.getStringValueForField("PercentageOnOne"));
			}
			//PK
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigEstimatedTurnoverAnnualfees")) {
				clearAndSendKeys(estimatedTurnoverAnnualfeesTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("EstimatedTurnoverAnnualfees"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialTermsandConditions")) {
				clearAndSendKeys(specialTermsandConditionsTextarea, pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialTermsandConditions"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialcoversIfany")) {
				clearAndSendKeys(specialcoversIfanyTextarea, pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialcoversIfany"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercentforTurnover")) {
				clearAndSendKeys(loadingPercentforTurnoverTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercentforTurnover"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoading")) {
				clearAndSendKeys(loadingTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("Loading"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, pDRskDetailSecndPageMLEntity.getStringValueForField("Deductible"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				clearAndSendKeys(specialConditionsOneTextarea, pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialConditionsOne"));
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				clearAndSendKeys(specialConditionsTwoTextarea, pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialConditionsTwo"));
			}
		}
		else if(pDRskDetailSecndPageMLEntity.getAction().equalsIgnoreCase("verify")){
			
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("AnyOneAccidentAOA"), fetchValueFromTextFields(anyOneAccidentAOATextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAOAAOY")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("AOAAOY"), fetchValueFromList(aOAAOYDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAnyOneYearandintheAggregateAOY")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("AnyOneYearandintheAggregateAOY"), fetchValueFromTextFields(anyOneYearandintheAggregateAOYTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateOne")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateOne")) , fetchValueFromTextFields(retroactiveDateOneTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleTypeOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleTypeOne"), fetchValueFromList(deductibleTypeOneDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("GeographicalJurisdictionOne"), fetchValueFromList(geographicalJurisdictionOneDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforIndiaOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforIndiaOne"), fetchValueFromTextFields(deductibleforIndiaOneTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforWorldwideExcludingUSAandCanadaOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforWorldwideExcludingUSAandCanadaOne"), fetchValueFromTextFields(deductibleforWorldwideExcludingUSAandCanadaOneTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductibleforWorldwideIncludingUSAandCanadaOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DeductibleforWorldwideIncludingUSAandCanadaOne"), fetchValueFromTextFields(deductibleforWorldwideIncludingUSAandCanadaOneTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateTwo")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateTwo"), fetchValueFromTextFields(retroactiveDateTwoTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateThree")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateThree"), fetchValueFromTextFields(retroactiveDateThreeTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateFour"), fetchValueFromTextFields(retroactiveDateFourTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("RetroactiveDateFive"), fetchValueFromTextFields(retroactiveDateFiveTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoyouwanttoattachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DoyouwanttoattachTechnicalCollaboratorsLiability"), fetchValueFromList(doyouwanttoattachTechnicalCollaboratorsLiabilityDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofattachTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofattachTechnicalCollaboratorsLiability"), fetchValueFromTextFields(subLimitofattachTechnicalCollaboratorsLiabilityTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforTechnicalCollaboratorsLiability"), fetchValueFromList(optionsforTechnicalCollaboratorsLiabilityDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercntforTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercntforTechnicalCollaboratorsLiability"), fetchValueFromTextFields(loadingPercntforTechnicalCollaboratorsLiabilityTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforTechnicalCollaboratorsLiability")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforTechnicalCollaboratorsLiability"), fetchValueFromTextFields(loadingAmountforTechnicalCollaboratorsLiabilityTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoYouWantToAttachContractors")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DoYouWantToAttachContractors"), fetchValueFromList(doYouWantToAttachContractorsDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofAttachContractor")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofAttachContractor"), fetchValueFromTextFields(subLimitofAttachContractorTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforAttachContractor")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforAttachContractor"), fetchValueFromList(optionsforAttachContractorDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercntforAttachContractor")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercntforAttachContractor"), fetchValueFromTextFields(loadingPercntforAttachContractorTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforAttachContractor")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforAttachContractor"), fetchValueFromTextFields(loadingAmountforAttachContractorTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDoyouwanttoattachIntellectualPropertyRights")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("DoyouwanttoattachIntellectualPropertyRights"), fetchValueFromList(doyouwanttoattachIntellectualPropertyRightsDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSubLimitofattachIntellectualPropertyRights")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SubLimitofattachIntellectualPropertyRights"), fetchValueFromTextFields(subLimitofattachIntellectualPropertyRightsTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigOptionsforattachIntellectualPropertyRights")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("OptionsforattachIntellectualPropertyRights"), fetchValueFromList(optionsforattachIntellectualPropertyRightsDropDown), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercentforattachIntellectualPropertyRights")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercentforattachIntellectualPropertyRights"), fetchValueFromTextFields(loadingPercentforattachIntellectualPropertyRightsTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingAmountforattachIntellectualPropertyRights")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingAmountforattachIntellectualPropertyRights"), fetchValueFromTextFields(loadingAmountforattachIntellectualPropertyRightsTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigPercentageOnOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("PercentageOnOne"), fetchValueFromList(percentageOnOneDropDown), AssertionType.WARNING);
			}
			
			//PK
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigEstimatedTurnoverAnnualfees")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("EstimatedTurnoverAnnualfees"), fetchValueFromTextFields(estimatedTurnoverAnnualfeesTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialTermsandConditions")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialTermsandConditions"), fetchValueFromTextFields(specialTermsandConditionsTextarea), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialcoversIfany")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialcoversIfany"), fetchValueFromTextFields(specialcoversIfanyTextarea), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoadingPercentforTurnover")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("LoadingPercentforTurnover"), fetchValueFromTextFields(loadingPercentforTurnoverTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoading")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("Loading"), fetchValueFromTextFields(loadingTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialConditionsOne"), fetchValueFromTextFields(specialConditionsOneTextarea), AssertionType.WARNING);
			}
			if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				assertReference.assertEquals(pDRskDetailSecndPageMLEntity.getStringValueForField("SpecialConditionsTwo"), fetchValueFromTextFields(specialConditionsTwoTextarea), AssertionType.WARNING);
			}

		}
	}
	
	public void navigateToPolicy(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToInsuredInterest(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity){
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	
	private void clickOnNextButton(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity) {
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwordButton);
			switchToFrame("display");
			//isElementDisplayed(ThisPageTitle);
		}
	}
	
	private void clickOnSaveButton(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity) {
		if (pDRskDetailSecndPageMLEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			riskDetailsNextPageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'"+pDRskDetailSecndPageMLEntity.getStringValueForField("RiskDetailsPDNextPageTitle")+"')]"), "Next Page Title After Risk Details One Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskDetailsNextPageTitle);
		}
	}
	
	public void fillandSubmitPDRiskDetailSecondPageML(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(pDRskDetailSecndPageMLEntity.getConfigExecute())){
			switchToFrame("display");
			fillPDRiskDetailSecondPageML(pDRskDetailSecndPageMLEntity, assertReference);
			clickOnNextButton(pDRskDetailSecndPageMLEntity);
			clickOnSaveButton(pDRskDetailSecndPageMLEntity);
			navigateToPolicy(pDRskDetailSecndPageMLEntity);
			navigateToAttribute(pDRskDetailSecndPageMLEntity);
			navigateToInsuredInterest(pDRskDetailSecndPageMLEntity);
			navigateToCoverage(pDRskDetailSecndPageMLEntity);
			navigateToLoan(pDRskDetailSecndPageMLEntity);
			navigateToClientDetails(pDRskDetailSecndPageMLEntity);
			navigateToRelation(pDRskDetailSecndPageMLEntity);
			navigateToPayment(pDRskDetailSecndPageMLEntity);
			navigateToFollowup(pDRskDetailSecndPageMLEntity);
			navigateToDocument(pDRskDetailSecndPageMLEntity);
		}
	}
	
}
