package com.aqm.staf.library.pages.miscNonLiability;

import java.sql.Savepoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LoadDiscntDetRuralEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;
import com.aqm.staf.library.databin.PolInsIntOthrRiskDMNLEntity;
import com.aqm.staf.library.databin.PolicyMemberCoverageDEntity;
import com.aqm.staf.library.databin.SpeCondForMiscNLEntity;
import com.aqm.staf.library.databin.StandCovDetForMiscNLEntity;


public class StandardCoverDetailsForMiscNL extends BasePage {

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement insuredInterestTab;

	private PageElement isTerrorismCoverRequiredDropDown;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement forwardButton;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;

	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement insuredInterestTabTitle;
	//akshata fs
	private PageElement isSectionIcoverRequiredDropDown;
	private PageElement descriptionforSectionITextArea;
	private PageElement sumInsuredforSectionITextField;
	private PageElement premiumforSectionITextField;
	//se
	private PageElement isLossofSchoolbagbooksCoverrequiredDropDown;
	private PageElement paymentoftuitionandhostelfeeTextField;
	private PageElement numberofParentsTextField;
	//BN
	private PageElement areAddonCoverRequired;
	private PageElement isEarthquakeCoverRequired;
	private PageElement isSTFICoverRequired;
	//JI
	private PageElement goodFeatureDiscountTextField;

	//PB
	private PageElement sumInsuredofPravasiBharatiyaBimaYojanaDropDown;
	private PageElement premiumTab;
	//GS Paresh
	private PageElement selectTheOptionRequiredDropDown;
	private PageElement jwellaryAndValuablesOpenButton;
	private PageElement broadDeskTextArea;
	private PageElement weightTextField;
	private PageElement valueTextField;
	private PageElement addJwellaryButton;
	private PageElement saveJwellaryButton;
	private PageElement closeJwellaryButton;
	
	private PageElement applincesOpenButton;
	private PageElement makeTextField;
	private PageElement modelTextField;
	private PageElement yearTextField;
	private PageElement addAppliancesButton;
	private PageElement saveAppliancesButton;
	private PageElement closeAppliancesButton;
	
	private PageElement televisionOpenButton;
	private PageElement makeTelevisionTextField;
	private PageElement modelTelevisionTextField;
	private PageElement yearTelevisionTextField;
	private PageElement addTelevisionButton;
	private PageElement saveTelevisionButton;
	private PageElement closeTelevisionButton;


	//MI

	private PageElement moneyTransitSection1ADropDown;
	private PageElement moneyTransitSection1BDropDown;
	private PageElement moneyTransitSection1CDropDown;
	private PageElement estimatedAnnualTurnoverTextField;
	private PageElement rateinPercentTextField;

	//SK
	private PageElement whetherAddonCovForIPOBookBuildingReqDropDown;
	private PageElement whetherAddonCovForIntermediaryIsReqDropDown;
	private PageElement whetherCurrencyDerivativesAreReqDropDown;
	private PageElement whetherOmissionToInsureAddorAlterationIsReqDropDown;
	private PageElement additionalPremiumSKForNoOfBranchesTextField;


	private PageElement attchCoveragePremiumlinkTitle;
	private PageElement attchCoveragePremiumlink;
	private PageElement attchCoveragePremiumlinkBN;

	//BB

	private PageElement isAddOnCover1RequiredDropdown;
	private PageElement isAddOnCover2RequiredDropdown;
	private PageElement isAddOnCover3RequiredDropdown;
	private PageElement isAddOnCover4RequiredDropdown;
	private PageElement isAddOnCover5RequiredDropdown;
	
	
	//BD
	private PageElement isTheftExtensionRequiredDropdown;
	private PageElement isOtherAddOnCoverRequiredDropdown;
	
	//HH
	private PageElement isTableACoverrequiredDropDown;
	private PageElement sumInsuredforTableATextField;


	public StandardCoverDetailsForMiscNL(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isTerrorismCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Terrorism Cover Required')]/following::select"),"Is Terrorism Cover Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel=new PageElement(By.xpath("//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//div//b[contains(text(),'Policyholder')]/following::td"), " Policyholder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//div//b[contains(text(),'Product')]/following::td"), " Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//akshata
		isSectionIcoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Section I cover required?')]/following::select"),"Is Section I cover required",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionforSectionITextArea=new PageElement(By.xpath("//td//div[contains(text(),'Description for Section I')]/following::textarea"),"Description for Section I",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforSectionITextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Section I')]/following::input"),"Sum Insured for Section I",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumforSectionITextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium for Section I')]/following::input"),"Premium for Section I",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//se
		isLossofSchoolbagbooksCoverrequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Loss of School bag containing books Cover required?')]/following::select"),"Is Loss of School bag containing books Cover required",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		paymentoftuitionandhostelfeeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Payment of tuition')]/following::input"),"Payment of tuition",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberofParentsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Parents')]/following::input"),"Number of Parents",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//BN
		areAddonCoverRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are Addon cover required", "select")), "Are Addon cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isEarthquakeCoverRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Earthquake Cover required?", "select")), "Is Earthquake Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSTFICoverRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is STFI Cover required?", "select")), "Is STFI Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//PB
		sumInsuredofPravasiBharatiyaBimaYojanaDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Pravasi Bharatiya Bima Yojana')]/following::select"),"Sum Insured of Pravasi Bharatiya Bima Yojana",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumTab=new PageElement(By.xpath("//td//b//div[contains(text(),'Premium')]"), "Premium Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		//JI
		goodFeatureDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Good Feature Discount", "input")),"Good Feature Discount",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//MI
		moneyTransitSection1ADropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Money in Transit Section 1A", "select")),"Money in Transit Section 1A",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		moneyTransitSection1BDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Money in Transit Section 1B", "select")),"Money in Transit Section 1B",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		moneyTransitSection1CDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Money in Transit Section 1C", "select")),"Money in Transit Section 1C",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		estimatedAnnualTurnoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Annual Turnover", "input")),"Estimated Annual Turnover",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		rateinPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o)", "input")),"Rate (%o)",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//SK
		whetherAddonCovForIPOBookBuildingReqDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Addon Cover for IPO book building required", "select")),"Whether Addon Cover for IPO book building required DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherAddonCovForIntermediaryIsReqDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Addon Cover for Intermediary is required", "select")),"Whether Addon Cover for Intermediary is required DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherCurrencyDerivativesAreReqDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Currency derivatives are required", "select")),"Whether Currency derivatives are required DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherOmissionToInsureAddorAlterationIsReqDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether omission to insure addition or alteration is required", "select")),"Whether omission to insure addition or alteration is required DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		additionalPremiumSKForNoOfBranchesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Premium(SK) For No. of Branches", "input")),"Additional Premium(SK) For No. of Branches DropDown",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		attchCoveragePremiumlink = new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), "member Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlinkBN= new PageElement(By.xpath("//td//a//b//div[contains(text(),'Premium')]"), "member Premium link BN", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//BB
		isAddOnCover1RequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is AddOn Cover 1 required']/following::select[1]"), "Is Add On Cover 1 Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAddOnCover2RequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is AddOn Cover 2 required']/following::select[1]"), "Is Add On Cover 2 Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAddOnCover3RequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is AddOn Cover 3 required']/following::select[1]"), "Is Add On Cover 3 Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAddOnCover4RequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is AddOn Cover 4 required']/following::select[1]"), "Is Add On Cover 4 Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAddOnCover5RequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is AddOn Cover 5 required']/following::select[1]"), "Is Add On Cover 5 Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//BD
		isTheftExtensionRequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is Theft Extension required']/following::select[1]"), "is Theft Extension Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isOtherAddOnCoverRequiredDropdown=new PageElement(By.xpath("//td//div[@id='Is other AddOn Cover required']/following::select[1]"), "Is other AddOn Cover required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
	//HH
		isTableACoverrequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Table A Cover required?')]/following::select"),"Is Table A Cover required?",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforTableATextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table A')]/following::input"),"Sum Insured for Table A",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	
	//GS
		selectTheOptionRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Select the option required", "select")),"Select the option required",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		jwellaryAndValuablesOpenButton=new PageElement(By.name("propValues5"),"Select the option required",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		broadDeskTextArea=new PageElement(By.name("Data_64603010062015_0"),"Broad Desc",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		weightTextField=new PageElement(By.name("Data_64603110062015_0"),"Weight",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		valueTextField=new PageElement(By.name("Data_3186103072001_0"),"Value",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addJwellaryButton=new PageElement(By.name("btnAdd"),"ADD",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveJwellaryButton=new PageElement(By.name("btnSave"),"Save",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeJwellaryButton=new PageElement(By.name("btnClose"),"Close",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		applincesOpenButton=new PageElement(By.name("propValues7"),"Description of the appliances",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		makeTextField=new PageElement(By.name("Data_63513713032015_0"),"MAKE",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		modelTextField=new PageElement(By.name("Data_890110042001_0"),"Model",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		yearTextField=new PageElement(By.name("Data_52305618072005_0"),"Year",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addAppliancesButton=new PageElement(By.name("btnAdd"),"ADD",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveAppliancesButton=new PageElement(By.name("btnSave"),"Save",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeAppliancesButton=new PageElement(By.name("btnClose"),"Close",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		televisionOpenButton=new PageElement(By.name("propValues9"),"Description of television/Desktop",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		makeTelevisionTextField=new PageElement(By.name("Data_63513713032015_0"),"MAKE",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		modelTelevisionTextField=new PageElement(By.name("Data_890110042001_0"),"Model",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		yearTelevisionTextField=new PageElement(By.name("Data_52305618072005_0"),"Year",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addTelevisionButton=new PageElement(By.name("btnAdd"),"ADD",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveTelevisionButton=new PageElement(By.name("btnSave"),"Model",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeTelevisionButton=new PageElement(By.name("btnClose"),"Close",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillStandardCoverDetailsForMiscNL(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("add") || standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("edit")){

			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
				selectValueFromList(isTerrorismCoverRequiredDropDown, standCovDetForMiscNLEntity.getStringValueForField("IsTerrorismCoverRequired"));

			}
			//akshata fs
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsSectionIcoverRequired")) {
				selectValueFromList(isSectionIcoverRequiredDropDown, standCovDetForMiscNLEntity.getStringValueForField("IsSectionIcoverRequired"));

			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigDescriptionforSectionI")) {
				clearAndSendKeys(descriptionforSectionITextArea, standCovDetForMiscNLEntity.getStringValueForField("DescriptionforSectionI"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSumInsuredforSectionI")) {
				clearAndSendKeys(sumInsuredforSectionITextField, standCovDetForMiscNLEntity.getStringValueForField("SumInsuredforSectionI"));
			}

			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPremiumforSectionI")) {
				clearAndSendKeys(premiumforSectionITextField, standCovDetForMiscNLEntity.getStringValueForField("PremiumforSectionI"));

			}
			//akshata se

			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsLossofSchoolbooksCoverrequired")) {
				selectValueFromList(isLossofSchoolbagbooksCoverrequiredDropDown, standCovDetForMiscNLEntity.getStringValueForField("IsLossofSchoolbooksCoverrequired"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPaymentoftuitionandhostelfee")) {
				clearAndSendKeys(paymentoftuitionandhostelfeeTextField, standCovDetForMiscNLEntity.getStringValueForField("Paymentoftuitionandhostelfee"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigNumberofParents")) {
				clearAndSendKeys(numberofParentsTextField, standCovDetForMiscNLEntity.getStringValueForField("NumberofParents"));
			}
			// BN
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAreAddonCoverRequired")) {
				selectValueFromList(areAddonCoverRequired, standCovDetForMiscNLEntity.getStringValueForField("AreAddonCoverRequired"));
			}
			//PB Mangesh
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSumInsuredofPravasiBharatiyaBimaYojana")) {
				selectValueFromList(sumInsuredofPravasiBharatiyaBimaYojanaDropDown, standCovDetForMiscNLEntity.getStringValueForField("SumInsuredofPravasiBharatiyaBimaYojana"));
			}
			//JI
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigGoodFeatureDiscount")) {
				clearAndSendKeys(goodFeatureDiscountTextField, standCovDetForMiscNLEntity.getStringValueForField("GoodFeatureDiscount"));
			}
			//MI
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1A")) {
				selectValueFromList(moneyTransitSection1ADropDown, standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1A"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1B")) {
				selectValueFromList(moneyTransitSection1BDropDown, standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1B"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1C")) {
				selectValueFromList(moneyTransitSection1CDropDown, standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1C"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
				clearAndSendKeys(estimatedAnnualTurnoverTextField, standCovDetForMiscNLEntity.getStringValueForField("EstimatedAnnualTurnover"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigRateinPercent")) {
				clearAndSendKeys(rateinPercentTextField, standCovDetForMiscNLEntity.getStringValueForField("RateinPercent"));
			}
			//SK
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherAddonCovForIPOBookBuildingReq")) {
				selectValueFromList(whetherAddonCovForIPOBookBuildingReqDropDown, standCovDetForMiscNLEntity.getStringValueForField("WhetherAddonCovForIPOBookBuildingReq"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherAddonCovForIntermediaryIsReq")) {
				selectValueFromList(whetherAddonCovForIntermediaryIsReqDropDown, standCovDetForMiscNLEntity.getStringValueForField("WhetherAddonCovForIntermediaryIsReq"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherCurrencyDerivativesAreReq")) {
				selectValueFromList(whetherCurrencyDerivativesAreReqDropDown, standCovDetForMiscNLEntity.getStringValueForField("WhetherCurrencyDerivativesAreReq"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherOmissionToInsureAddorAlterationIsReq")) {
				selectValueFromList(whetherOmissionToInsureAddorAlterationIsReqDropDown, standCovDetForMiscNLEntity.getStringValueForField("WhetherOmissionToInsureAddorAlterationIsReq"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAdditionalPremiumSKForNoOfBranches")) {
				clearAndSendKeys(additionalPremiumSKForNoOfBranchesTextField, standCovDetForMiscNLEntity.getStringValueForField("AdditionalPremiumSKForNoOfBranches"));
			}
			//BB

			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsAddOnCover1Required")) {
				selectValueFromList(isAddOnCover1RequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsAddOnCover1Required"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsAddOnCover2Required")) {
				selectValueFromList(isAddOnCover2RequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsAddOnCover2Required"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsAddOnCover3Required")) {
				selectValueFromList(isAddOnCover3RequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsAddOnCover3Required"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsAddOnCover4Required")) {
				selectValueFromList(isAddOnCover4RequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsAddOnCover4Required"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsAddOnCover5Required")) {
				selectValueFromList(isAddOnCover5RequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsAddOnCover5Required"));
			}
			//BD
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsTheftExtensionRequired")) {
				selectValueFromList(isTheftExtensionRequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsTheftExtensionRequired"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsOtherAddOnCoverRequired")) {
				selectValueFromList(isOtherAddOnCoverRequiredDropdown, standCovDetForMiscNLEntity.getStringValueForField("IsOtherAddOnCoverRequired"));
			}
			//HH
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsTableACoverrequired")) {
				selectValueFromList(isTableACoverrequiredDropDown,standCovDetForMiscNLEntity.getStringValueForField("IsTableACoverrequired"));
			}

            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSumInsuredforTableA")) {
				clearAndSendKey(sumInsuredforTableATextField,standCovDetForMiscNLEntity.getStringValueForField("SumInsuredforTableA"));
			}
            //GS
       
          

		}

		else if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("IsTerrorismCoverRequired"), fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsSectionIcoverRequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("IsSectionIcoverRequired"), fetchValueFromList(isSectionIcoverRequiredDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigDescriptionforSectionI")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("DescriptionforSectionI"), fetchValueFromTextFields(descriptionforSectionITextArea), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSumInsuredforSectionI")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("SumInsuredforSectionI"), fetchValueFromTextFields(sumInsuredforSectionITextField), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPremiumforSectionI")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("PremiumforSectionI"), fetchValueFromTextFields(premiumforSectionITextField), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsLossofSchoolbagbooksCoverrequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("IsLossofSchoolbagbooksCoverrequired"), fetchValueFromList(isLossofSchoolbagbooksCoverrequiredDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPaymentoftuitionandhostelfee")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Paymentoftuitionandhostelfee"), fetchValueFromTextFields(paymentoftuitionandhostelfeeTextField), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigNumberofParents")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("NumberofParents"), fetchValueFromTextFields(numberofParentsTextField), AssertionType.WARNING);
			}
			//JI
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigGoodFeatureDiscount")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("GoodFeatureDiscount"), fetchValueFromTextFields(goodFeatureDiscountTextField), AssertionType.WARNING);
			}

			//MI
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1A")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1A"), fetchValueFromList(moneyTransitSection1ADropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1B")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1B"), fetchValueFromList(moneyTransitSection1BDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMoneyTransitSection1C")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("MoneyTransitSection1C"), fetchValueFromList(moneyTransitSection1CDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("EstimatedAnnualTurnover"), fetchValueFromTextFields(estimatedAnnualTurnoverTextField), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigRateinPercent")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("RateinPercent"), fetchValueFromTextFields(rateinPercentTextField), AssertionType.WARNING);
			}
			// BN
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAreAddonCoverRequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("AreAddonCoverRequired"), fetchValueFromList(areAddonCoverRequired), AssertionType.WARNING);
			}
			//SK
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherAddonCovForIPOBookBuildingReq")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("WhetherAddonCovForIPOBookBuildingReq"), fetchValueFromList(whetherAddonCovForIPOBookBuildingReqDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherAddonCovForIntermediaryIsReq")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("WhetherAddonCovForIntermediaryIsReq"), fetchValueFromList(whetherAddonCovForIntermediaryIsReqDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherCurrencyDerivativesAreReq")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("WhetherCurrencyDerivativesAreReq"), fetchValueFromList(whetherCurrencyDerivativesAreReqDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWhetherOmissionToInsureAddorAlterationIsReq")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("WhetherOmissionToInsureAddorAlterationIsReq"), fetchValueFromList(whetherOmissionToInsureAddorAlterationIsReqDropDown), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAdditionalPremiumSKForNoOfBranches")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("AdditionalPremiumSKForNoOfBranches"), fetchValueFromTextFields(additionalPremiumSKForNoOfBranchesTextField), AssertionType.WARNING);
			}
			//GS
			
			
		
		}
	}		




	public void clickNextButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) {
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigNextButton")) {
			click(forwardButton);
		}
		else if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigDoubleForwordButton")){			
			click(forwardButton);
			click(forwardButton);
			switchToFrame("display");
		}
	}

	public void clickSaveButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) {
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void clickBackButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) {
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}


	public void navigateToPolicy(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);		
			switchToFrame("display");		
			isElementDisplayed(policyTabTitle);		
		}			
	}				
	public void navigateToAttribute(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}	
	public void navigateToPremium(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPremiumTab")){			
			click(premiumTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}	
	public void navigateToInsuredInterest(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestTabTitle);		
		}			
	}				
	public void navigateToCoverage(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);		
			switchToFrame("display");		
			isElementDisplayed(coverageTabTitle);		
		}			
	}				

	public void navigateToLoan(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);		
			//		switchToFrame("display");
		}			
	}				

	public void navigateToClientDetails(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(clientDetailsTabTitle);		
		}			
	}	

	public void navigateToRelation(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);		
			switchToFrame("display");		
			isElementDisplayed(relationsTabTitle);		
		}			
	}

	public void navigateToPayment(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(paymentsTabTitle);		
		}			
	}

	public void navigateToFollowup(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);		
			switchToFrame("display");		
			isElementDisplayed(followupTabTitle);		
		}			
	}				
	public void navigateToDocument(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity){				
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);		
			switchToFrame("display");		
			isElementDisplayed(documentTabTitle);		
		}			
	}
	
	//GS
	public void clickOnJwellaryAndValuablesOpenButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigJwellaryAndValuablesOpen")){
			click(jwellaryAndValuablesOpenButton);
			Thread.sleep(5000);
			switchToWindow("Details of jewellery and valuables' Details");
		}
	}
	
	public void clickOnApplincesOpenButtonFI(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigApplincesOpen")){
			click(applincesOpenButton);
			Thread.sleep(5000);
			switchToWindow("Description of the appliances' Details");
		}
	}
	
	public void clickOntelevisionOpen(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigTelevisionOpen")){
			click(televisionOpenButton);
			Thread.sleep(5000);
			switchToWindow("Description of television/Desktop' Details");
		}
	}
	public void clickOnAddJwellaryButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAddJwellary")){
			click(addJwellaryButton);
		}
	}
	public void clickOnSaveJwellaryButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSaveJwellary")){
			click(saveJwellaryButton);
		}
	}
	public void clickOnCloseJwellaryButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigCloseJwellary")){
			click(closeJwellaryButton);
			Thread.sleep(5000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void clickOnAddAppliancesButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAddAppliances")){
			click(addAppliancesButton);
		}
	}
	public void clickOnSaveAppliancesButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSaveAppliances")){
			click(saveAppliancesButton);
		}
	}
	public void clickOnCloseAppliancesButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigCloseAppliances")){
			click(closeAppliancesButton);
			Thread.sleep(5000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void clickOnAddTelevisionButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAddTelevision")){
			click(addTelevisionButton);
		}
	}
	public void clickOnSaveTelevisionButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSaveTelevision")){
			click(saveTelevisionButton);
		}
	}
	public void clickOnCloseTelevisionButton(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getBooleanValueForField("ConfigCloseTelevision")){
			click(closeTelevisionButton);
			Thread.sleep(5000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	
	public void fillStandardCoverandAdonsTwoBBBN(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("add") || standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("edit")){
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsEarthquakeCoverRequired")) {
				selectValueFromList(isEarthquakeCoverRequired, standCovDetForMiscNLEntity.getStringValueForField("IsEarthquakeCoverRequired"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
				selectValueFromList(isSTFICoverRequired, standCovDetForMiscNLEntity.getStringValueForField("IsSTFICoverRequired"));
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigEndorse"))
		{
				click(saveButton);
		 }
			else
			{
				click(forwardButton);	
			}
		}
		else if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsEarthquakeCoverRequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("IsEarthquakeCoverRequired"), fetchValueFromList(isEarthquakeCoverRequired), AssertionType.WARNING);
			}
			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("IsSTFICoverRequired"), fetchValueFromList(isSTFICoverRequired), AssertionType.WARNING);
			}
		}
	}
	public void navigateToAttachCoveragePremiumLink(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity) throws InterruptedException{
		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){		
			if(!(standCovDetForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("BN")|| standCovDetForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("BB") )){
				click(attchCoveragePremiumlink);
			}
			else{
				click(attchCoveragePremiumlinkBN);
				switchToFrame("display");
				attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+standCovDetForMiscNLEntity.getStringValueForField("NextPagePremiumlinkTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(attchCoveragePremiumlinkTitle);
			}
		}
	}
	public void fillJwellaryCoverDetailsForMiscNL(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("add") || standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("edit")){
			 if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSelectTheOptionRequired")) {
					selectValueFromList(selectTheOptionRequiredDropDown,standCovDetForMiscNLEntity.getStringValueForField("SelectTheOptionRequired"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigBroadDesk")) {
					clearAndSendKey(broadDeskTextArea,standCovDetForMiscNLEntity.getStringValueForField("BroadDesk"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWeight")) {
					clearAndSendKey(weightTextField,standCovDetForMiscNLEntity.getStringValueForField("Weight"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigJwellaryValue")) {
					clearAndSendKey(valueTextField,standCovDetForMiscNLEntity.getStringValueForField("JwellaryValue"));
				}
		}
	        	else if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
	        		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigSelectTheOptionRequired")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("SelectTheOptionRequired"), fetchValueFromList(selectTheOptionRequiredDropDown), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigBroadDesk")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("BroadDesk"), fetchValueFromTextFields(broadDeskTextArea), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigWeight")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Weight"), fetchValueFromTextFields(weightTextField), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigJwellaryValue")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("JwellaryValue"), fetchValueFromTextFields(valueTextField), AssertionType.WARNING);
	    			}
	        	}
		}
	public void fillAppliancesCoverDetailsForMiscNL(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("add") || standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("edit")){
			 if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMake")) {
					clearAndSendKey(makeTextField,standCovDetForMiscNLEntity.getStringValueForField("Make"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigModel")) {
					clearAndSendKey(modelTextField,standCovDetForMiscNLEntity.getStringValueForField("Model"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigYear")) {
					clearAndSendKey(yearTextField,standCovDetForMiscNLEntity.getStringValueForField("Year"));
				}
		}
	        	else if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
	        		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMake")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Make"), fetchValueFromTextFields(makeTextField), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigModel")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Model"), fetchValueFromTextFields(modelTextField), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigYear")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("Year"), fetchValueFromTextFields(yearTextField), AssertionType.WARNING);
	    			}
		}
	}
	public void fillTelevisionCoverDetailsForMiscNL(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("add") || standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("edit")){
			  if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMakeTelevision")) {
					clearAndSendKey(makeTelevisionTextField,standCovDetForMiscNLEntity.getStringValueForField("MakeTelevision"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigModelTelevision")) {
					clearAndSendKey(modelTelevisionTextField,standCovDetForMiscNLEntity.getStringValueForField("ModelTelevision"));
				}
	            if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigYearTelevision")) {
					clearAndSendKey(yearTelevisionTextField,standCovDetForMiscNLEntity.getStringValueForField("YearTelevision"));
				}
		}
	        	else if(standCovDetForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
	        		if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigMakeTelevision")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("MakeTelevision"), fetchValueFromTextFields(makeTelevisionTextField), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigModelTelevision")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("ModelTelevision"), fetchValueFromTextFields(modelTelevisionTextField), AssertionType.WARNING);
	    			}
	    			if (standCovDetForMiscNLEntity.getBooleanValueForField("ConfigYearTelevision")) {
	    				assertReference.assertEquals(standCovDetForMiscNLEntity.getStringValueForField("YearTelevision"), fetchValueFromTextFields(yearTelevisionTextField), AssertionType.WARNING);
	    			}
		}
	}
	public void fillandSubmitStandardCoverDetailsForMiscNL(StandCovDetForMiscNLEntity standCovDetForMiscNLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(standCovDetForMiscNLEntity.getConfigExecute())){
			
			switchToFrame("display");
			//GS Paresh
			clickOnJwellaryAndValuablesOpenButton(standCovDetForMiscNLEntity);
			clickOnAddJwellaryButton(standCovDetForMiscNLEntity);
			fillJwellaryCoverDetailsForMiscNL(standCovDetForMiscNLEntity, assertReference);
			clickOnSaveJwellaryButton(standCovDetForMiscNLEntity);
			clickOnCloseJwellaryButton(standCovDetForMiscNLEntity);
			clickOnApplincesOpenButtonFI(standCovDetForMiscNLEntity);
			clickOnAddAppliancesButton(standCovDetForMiscNLEntity);
			fillAppliancesCoverDetailsForMiscNL(standCovDetForMiscNLEntity, assertReference);
			clickOnSaveAppliancesButton(standCovDetForMiscNLEntity);
			clickOnCloseAppliancesButton(standCovDetForMiscNLEntity);
			clickOntelevisionOpen(standCovDetForMiscNLEntity);
			clickOnAddTelevisionButton(standCovDetForMiscNLEntity);
			fillTelevisionCoverDetailsForMiscNL(standCovDetForMiscNLEntity, assertReference);
			clickOnSaveTelevisionButton(standCovDetForMiscNLEntity);
			clickOnCloseTelevisionButton(standCovDetForMiscNLEntity);
			fillStandardCoverDetailsForMiscNL(standCovDetForMiscNLEntity, assertReference);
			clickNextButton(standCovDetForMiscNLEntity);
			if(standCovDetForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("BN")|| standCovDetForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("BB")){
				fillStandardCoverandAdonsTwoBBBN(standCovDetForMiscNLEntity,assertReference);
			}
			clickSaveButton(standCovDetForMiscNLEntity);
			navigateToPolicy(standCovDetForMiscNLEntity);
			navigateToAttribute(standCovDetForMiscNLEntity);
			navigateToInsuredInterest(standCovDetForMiscNLEntity);
			navigateToCoverage(standCovDetForMiscNLEntity);
			navigateToLoan(standCovDetForMiscNLEntity);
			navigateToClientDetails(standCovDetForMiscNLEntity);
			navigateToRelation(standCovDetForMiscNLEntity);
			navigateToPayment(standCovDetForMiscNLEntity);
			navigateToFollowup(standCovDetForMiscNLEntity);
			navigateToDocument(standCovDetForMiscNLEntity);
			navigateToPremium(standCovDetForMiscNLEntity);
			navigateToAttachCoveragePremiumLink(standCovDetForMiscNLEntity);

		}
	}
}
