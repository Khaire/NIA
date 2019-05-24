package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.LoadDiscntDetRuralEntity;
import com.aqm.staf.library.databin.PolInsrIntCovrDetlPUPAEntity;

public class PolicyAttachCoverageLoadingAndDiscountDetailRural extends WebPage {

	private PageElement loadingAndDiscountForDogPageTitle;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel; 
	private PageElement serialNoLabel;
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
	private PageElement currentPageLabel; 
	private PageElement isLoadingApplicableDropdown;
	private PageElement loadingTextField;
	private PageElement reasonsOfLoadingTextField;
	private PageElement specialDiscountInLieuOfAgencyIsApplicableDropdown;
	private PageElement discountTextField;
	private PageElement reasonsForDiscountTextField;
	private PageElement specialDiscountTextField;
	private PageElement specialDiscountApplicableDropDown;
	private PageElement premiumRateTextField;
	private PageElement adjustmentFactorTextField;

	private PageElement saveButton;
	private PageElement backButton;
	private PageElement nextButton;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

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

	private PageElement insuredInterestDetailsTab;	
	private PageElement insuredInterestAttributesTab;	
	private PageElement insuredInterestAttachCoveragesTab;	
	private PageElement insuredInterestRelationsTab;	
	private PageElement insuredInterestPaymentsTab;	
	private PageElement insuredInterestScheduleTab;	

	private PageElement policyInsuredInterestDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;
	private PageElement policyInsuredInterestScheduleDetailsTitle;

	private PageElement attachCoveragesDetailTab;
	private PageElement attachCoveragesAttributesTab;
	private PageElement attachCoveragesPremiumTab;

	private PageElement attachCoveragesDetailTabTitle;
	//private PageElement attachCoveragesAttributesTabTitle;
	private PageElement attachCoveragesPremiumTabTitle;

	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement coverageCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement serialNoLable;
	private PageElement coverageNameLable;
	private PageElement rateTextField;
	//IF
	private PageElement specialdiscountinlieuofagencyisapplicableDropDown;
	//HD
	private PageElement specialDiscountapplicableDropDown;
	//private PageElement specialDiscountPercentageTextField;

	// GP
	private PageElement noClaimDiscountIsApplicableDropDown;
	private PageElement longTermDiscountIsApplicable;

	//PO-Yogesh
	private PageElement noClaimDiscountPercentTextField; 
	private PageElement isFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtcDropDown;	
	private PageElement isFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterersDropDown;	
	private PageElement isFarmsMortalityLessThan5PercentDropDown;
	private PageElement whetherThermoRegulatorToControlTemperatureAndHumidityPresentDropDown;	
	private PageElement areTheFarmsManagedByVeterinaryDoctorsDropDown;	
	private PageElement isTheFarmWithIncineratorDropDown;	
	private PageElement isLayerFlockSizeOf10000BatchOrBroiler5000BatchDropDown;	
	private PageElement goodFeatureDiscountPercentTextField;
	//YJ
	private PageElement discountPercentLabel;
	private PageElement loadingPercentLabel;

	//DG
	private PageElement deathByWhelpingDropdown;
	private PageElement lossofLitterLabelDropdown;
	
	//FE
	private PageElement identificationNumberDwellingUnitHouseTextField;
	private PageElement locationDwellingUnithouseTextArea;
	private PageElement descriptionDwellingUnithouseTextArea;
	private PageElement isKatchaConstructionDropdown;
	private PageElement descriptionContentsDwellingTextArea;
	private PageElement sumInsuredDwellingUnitRsTextField;
	private PageElement sumInsuredContentsRsTextField;
	private PageElement totalSumInsuredRsTextField;
	
	//CH
	private PageElement distanceTransitKMTextField;
	private PageElement modeTransitDropdown;
		
	//FE
	private PageElement reasonsforLoadingTextArea;



	public PolicyAttachCoverageLoadingAndDiscountDetailRural(WebDriver driver,String pageName) {
		super(driver, pageName);
		loadingAndDiscountForDogPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loading and Discount for Dog')]"),"Loading And Discount For Dog", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Code")), "Insured Interest Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Serial No.")), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverage Code")), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverage Name")), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"),"Current Page Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		isLoadingApplicableDropdown =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Loading Applicable", "select")),"Is Loading Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%)", "input")),"Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonsOfLoadingTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reasons of  Loading", "textarea")),"Reasons Of Loading Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountInLieuOfAgencyIsApplicableDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special discount in lieu of agency is applicable", "select")),"Special Discount In Lieu Of Agency is Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount (%)", "input")),"Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,30);
		reasonsForDiscountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reasons For Discount", "textarea")),"Reasons For Discount Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountTextField = new PageElement(By.xpath("//td//div[@id='Special Discount (%)']/following::input"),"Special Discount (%) Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountApplicableDropDown = new PageElement(By.xpath("//td//div[@id='Special Discount applicable']/following::select"),"Special Discount applicable Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//CA
		premiumRateTextField = new PageElement(By.xpath("//td//div[@id='Premium Rate']/following::input"),"Premium Rate Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adjustmentFactorTextField = new PageElement(By.xpath("//td//div[@id='Adjustment Factor']/following::input"),"Adjustment Factor Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle	 	= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle 	= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "Client Details Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle 		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Relations Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle 		= new PageElement(By.xpath("//div//b//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		policyTab             =new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab          =new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab    =new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab           =new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab               =new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab	  =new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab		  =new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		insuredInterestDetailsTab			=new PageElement(By.xpath("//table[2]//tbody//td//div//b[contains(text(),'Detail')]"), "Insured Interest Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab		=new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab	=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab			=new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab			=new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab			=new PageElement(By.xpath("//div[@title='Schedule']"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyInsuredInterestDetailsTitle	= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Details')]"), "Policy Insured Interest Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle		= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle		= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestScheduleDetailsTitle= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Schedule Details')]"), "Policy Insured Interest Schedule Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		attachCoveragesDetailTab		= new PageElement(By.xpath("//b//div[contains(text(),'Details')]"), "Attach Coverage Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTab	= new PageElement(By.xpath("//table[3]//tbody//td//div//b[contains(text(),'Attributes')]"), "Attach Coverage Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTab		= new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), "Attach Coverage Premium Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		attachCoveragesDetailTabTitle	  = new PageElement(By.xpath("//div//b//b[contains(text(),'Policy Insured Interest Coverage')]"), "Attach Coverages Detail Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//attachCoveragesAttributesTabTitle = new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Details')]"), "Policy Insured Interest Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumTabTitle	  = new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLable = new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest Code')]/following::td"), "Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageCodeLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage Code')]/following::td"), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLable			= new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::input"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Serial No.')]/following::td"), "Serial Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage Name')]/following::td"), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateTextField=new PageElement(By.xpath("//td//div[@id='Rate(%)']/following::input"),"Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//IF
		specialdiscountinlieuofagencyisapplicableDropDown = new PageElement(By.xpath("//td//div[@id='Special discount in lieu of agency is applicable']/following::select"),"Special discount in lieu of agency is applicable Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		saveButton = new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		// GP
		noClaimDiscountIsApplicableDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("No claim discount is applicable", "select")),"No claim discount is applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		longTermDiscountIsApplicable = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Long term discount is applicable", "select")),"Long term discount is applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//HD
		//
		specialDiscountapplicableDropDown = new PageElement(By.xpath("//td//div[@id='Special Discount applicable']/following::select"),"Special discount applicable Dropdown",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//specialDiscountPercentageTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Special Discount (%)')]/following::input"),"Special Discount (%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//PO-Yogesh
		noClaimDiscountPercentTextField	= new PageElement(By.xpath("//td//div[contains(text(),'No claim Discount (%)')]/following::input"),"No claim Discount (%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtcDropDown = new PageElement(By.xpath("//td//div[@id='Is farm with standard layout such as Good distance between sheds, fencing, wind breaker trees, etc.']/following::select"),"Is farm with standard layout such as Good distance between sheds, fencing, wind breaker trees, etc. DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterersDropDown = new PageElement(By.xpath("//td//div[@id='Is farm with sophisticated equipment i.e. automatic feeders, waterers']/following::select"),"Is farm with sophisticated equipment i.e. automatic feeders, waterers DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isFarmsMortalityLessThan5PercentDropDown = new PageElement(By.xpath("//td//div[@id='Is Farms mortality less than 5%']/following::select"),"Is Farms mortality less than 5% Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherThermoRegulatorToControlTemperatureAndHumidityPresentDropDown = new PageElement(By.xpath("//td//div[@id='Whether thermo regulator to control temperature and humidity present']/following::select"),"Whether thermo regulator to control temperature and humidity present Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areTheFarmsManagedByVeterinaryDoctorsDropDown = new PageElement(By.xpath("//td//div[@id='Are the farms managed by Veterinary Doctors']/following::select"),"Are the farms managed by Veterinary Doctors Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isTheFarmWithIncineratorDropDown = new PageElement(By.xpath("//td//div[@id='Is the farm with Incinerator']/following::select"),"Is the farm with Incinerator Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isLayerFlockSizeOf10000BatchOrBroiler5000BatchDropDown = new PageElement(By.xpath("//td//div[@id='Is Layer Flock Size of 10,000/batch or Broiler 5000/batch']/following::select"),"Is Layer Flock Size of 10,000/batch or Broiler 5000/batch Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		goodFeatureDiscountPercentTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Good Feature Discount(%)')]/following::input"),"Good Feature Discount(%) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//YJ
		discountPercentLabel=new PageElement(By.id("Discount (%)"),  "Discount (%)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loadingPercentLabel=new PageElement(By.id("Loading (%)"),  "Loading (%)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//DG
		deathByWhelpingDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Death by Whelping", "select")),"death By Whelping Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		lossofLitterLabelDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loss of litter incase whole litter is stillborn or dies within 14 days of birth", "select")),"loss of Litter Label Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		//FE
		identificationNumberDwellingUnitHouseTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification number of the dwelling unit / house", "input")),"Identification number of the dwelling unit / house", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		locationDwellingUnithouseTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of the dwelling unit / house", "textarea")),"Location of the dwelling unit / house", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionDwellingUnithouseTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description about the dwelling unit / house", "textarea")),"Description about the dwelling unit / house", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isKatchaConstructionDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is it a Katcha construction", "select")),"Is it a Katcha construction", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionContentsDwellingTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description about the contents in the dwelling", "textarea")),"Description about the contents in the dwelling", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredDwellingUnitRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured on the dwelling unit (Rs)", "input")),"Sum insured on the dwelling unit (Rs)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredContentsRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured on the contents (Rs)", "input")),"Sum insured on the contents (Rs)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalSumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured(Rs)", "input")),"Total Sum Insured(Rs)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		//CH
		distanceTransitKMTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Distance of transit(KM)", "input")),"Distance of transit(KM)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		modeTransitDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Mode of transit", "select")),"Mode of transit", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
				
		//FE
		reasonsforLoadingTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reasons for Loading", "textarea")),"Reasons for Loading Text Area",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}

	public void fillLoadDiscntDetRuralEntity(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity, CustomAssert assertReference) throws InterruptedException{
		if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("add") || loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("edit")){

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsLoadingApplicable")) {
				selectValueFromList(isLoadingApplicableDropdown,loadDiscntDetRuralEntity.getStringValueForField("IsLoadingApplicable"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLoading")) {
				clearAndSendKeys(loadingTextField, loadDiscntDetRuralEntity.getStringValueForField("Loading"));
				String loading=fetchValueFromTextFields(loadingTextField);
				if(!(loading.equalsIgnoreCase("0.00")||loading.equalsIgnoreCase("0"))){
					if(loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("CA") || loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("BW")|| loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("FW")|| loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("GG")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("HD")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("HI")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("IF")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("EP")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("FC")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("CI")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YG")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YK")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YH")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YB")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YC")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YS")|| loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YC")|| loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("ZP")||loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLoadingCheck")){
						if(!(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigEndorse"))){
							click(nextButton);
						}
						try{
							acceptAlertAndReturnConfirmationMessage();
						}catch(Exception e){}
					}
				}
			}

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigReasonsOfLoading")){
				doubleClick(discountPercentLabel);
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
				switchToFrame("display");
				Thread.sleep(5000);
				clearAndSendKeys(reasonsOfLoadingTextField, loadDiscntDetRuralEntity.getStringValueForField("ReasonsOfLoading"));
			}
			
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigReasonsforLoadingFE")){
				doubleClick(discountPercentLabel);
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
				switchToFrame("display");
				Thread.sleep(5000);
				clearAndSendKeys(reasonsforLoadingTextArea, loadDiscntDetRuralEntity.getStringValueForField("ReasonsforLoadingFE"));
			}

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscountInLieuOfAgencyIsApplicable")) {
				selectValueFromList(specialDiscountInLieuOfAgencyIsApplicableDropdown, loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscountInLieuOfAgencyIsApplicable"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDiscount")) {

				SelectValueAndTypeForTextField(discountTextField, loadDiscntDetRuralEntity.getStringValueForField("Discount"));
				Thread.sleep(1000);
				if(loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("CA") || loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("BW") || loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("FW")|| loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("GG")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("EP")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("IF")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("HB")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("FC")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YG")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("ZP")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YH")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YT")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YS")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YB")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YC")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YK")||loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("ZP")||loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDiscountCheck"))
				{
					String discount=fetchValueFromTextFields(discountTextField);
					if(!(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigEndorse"))){
						if(!(discount.equalsIgnoreCase("0.00")||discount.equalsIgnoreCase("0"))){
							click(nextButton);
						}
					}
					try{
						acceptAlertAndReturnConfirmationMessage();
					}catch(Exception e){}
				}
			}

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigReasonsOfDiscount")) {
				doubleClick(discountPercentLabel);
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
				switchToFrame("display");
				Thread.sleep(5000);
				clearAndSendKeys(reasonsForDiscountTextField, loadDiscntDetRuralEntity.getStringValueForField("ReasonsOfDiscount"));
			}

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscountApplicable")) {
				selectValueFromList(specialDiscountApplicableDropDown, loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscountApplicable"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				clearAndSendKeys(specialDiscountTextField, loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscount"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, loadDiscntDetRuralEntity.getStringValueForField("PremiumRate"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAdjustmentFactor")) {
				clearAndSendKeys(adjustmentFactorTextField, loadDiscntDetRuralEntity.getStringValueForField("AdjustmentFactor"));
			}
			//GP
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigNoClaimDiscountIsApplicable")) {
				selectValueFromList(noClaimDiscountIsApplicableDropDown, loadDiscntDetRuralEntity.getStringValueForField("NoClaimDiscountIsApplicable"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLongTermDiscountIsApplicable")) {
				selectValueFromList(longTermDiscountIsApplicable, loadDiscntDetRuralEntity.getStringValueForField("LongTermDiscountIsApplicable"));
			}
			//PO-Yogesh
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigNoClaimDiscountPercent")) {
				clearAndSendKeys(noClaimDiscountPercentTextField, loadDiscntDetRuralEntity.getStringValueForField("NoClaimDiscountPercent"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtc")) {
				selectValueFromList(isFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtcDropDown, loadDiscntDetRuralEntity.getStringValueForField("IsFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtc"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterers")) {
				selectValueFromList(isFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterersDropDown, loadDiscntDetRuralEntity.getStringValueForField("IsFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterers"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmsMortalityLessThan5Percent")) {
				selectValueFromList(isFarmsMortalityLessThan5PercentDropDown, loadDiscntDetRuralEntity.getStringValueForField("IsFarmsMortalityLessThan5Percent"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigWhetherThermoRegulatorToControlTemperatureAndHumidityPresent")) {
				selectValueFromList(whetherThermoRegulatorToControlTemperatureAndHumidityPresentDropDown, loadDiscntDetRuralEntity.getStringValueForField("WhetherThermoRegulatorToControlTemperatureAndHumidityPresent"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAreTheFarmsManagedByVeterinaryDoctors")) {
				selectValueFromList(areTheFarmsManagedByVeterinaryDoctorsDropDown, loadDiscntDetRuralEntity.getStringValueForField("AreTheFarmsManagedByVeterinaryDoctors"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsTheFarmWithIncinerator")) {
				selectValueFromList(isTheFarmWithIncineratorDropDown, loadDiscntDetRuralEntity.getStringValueForField("IsTheFarmWithIncinerator"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsLayerFlockSizeOf10000BatchOrBroiler5000Batch")) {
				selectValueFromList(isLayerFlockSizeOf10000BatchOrBroiler5000BatchDropDown, loadDiscntDetRuralEntity.getStringValueForField("IsLayerFlockSizeOf10000BatchOrBroiler5000Batch"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigGoodFeatureDiscountPercent")) {
				clearAndSendKeys(goodFeatureDiscountPercentTextField, loadDiscntDetRuralEntity.getStringValueForField("GoodFeatureDiscountPercent"));
			}
			//CH
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDistanceTransitKM")) {
				clearAndSendKeys(distanceTransitKMTextField, loadDiscntDetRuralEntity.getStringValueForField("DistanceTransitKM"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigModeTransit")) {
				selectValueFromList(modeTransitDropdown, loadDiscntDetRuralEntity.getStringValueForField("ModeTransit"));
			}
		}

		else if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("verify")){
			//Lables
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigCoverageCode")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("CoverageCode"), fetchValueFromTextFields(coverageCodeLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigCoverageName")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("CoverageName"), fetchValueFromTextFields(coverageNameLable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsLoadingApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsLoadingApplicable"), fetchValueFromList(isLoadingApplicableDropdown	), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLoading")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Loading"), fetchValueFromTextFields(loadingTextField), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigReasonsOfLoading")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("ReasonsOfLoading"), fetchValueFromTextFields(reasonsOfLoadingTextField), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscountInLieuOfAgencyIsApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscountInLieuOfAgencyIsApplicable"), fetchValueFromList(specialDiscountInLieuOfAgencyIsApplicableDropdown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDiscount")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Discount"), fetchValueFromTextFields(discountTextField), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigReasonsOfDiscount")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("ReasonsOfDiscount"), fetchValueFromTextFields(reasonsForDiscountTextField), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAdjustmentFactor")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("AdjustmentFactor"), fetchValueFromTextFields(adjustmentFactorTextField), AssertionType.WARNING);
			}
			//GP
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigNoClaimDiscountIsApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("NoClaimDiscountIsApplicable"), fetchValueFromList(noClaimDiscountIsApplicableDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLongTermDiscountIsApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("LongTermDiscountIsApplicable"), fetchValueFromList(longTermDiscountIsApplicable), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscountInLieuOfAgencyIsApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscountInLieuOfAgencyIsApplicable"), fetchValueFromList(specialdiscountinlieuofagencyisapplicableDropDown	), AssertionType.WARNING);
			}
			//HD
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscountApplicable")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscountApplicable"), fetchValueFromList(specialDiscountapplicableDropDown	), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
			}	
			//PO-Yogesh
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigNoClaimDiscountPercent")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("NoClaimDiscountPercent"), fetchValueFromTextFields(noClaimDiscountPercentTextField), AssertionType.WARNING);
			}	
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtc")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtc"), fetchValueFromList(isFarmWithStandardLayoutSuchAsGoodDistanceBetweenShedsFencingWindBreakerTreesEtcDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterers")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterers"), fetchValueFromList(isFarmWithSophisticatedEquipmentIEAutomaticFeedersWaterersDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsFarmsMortalityLessThan5Percent")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsFarmsMortalityLessThan5Percent"), fetchValueFromList(isFarmsMortalityLessThan5PercentDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigWhetherThermoRegulatorToControlTemperatureAndHumidityPresent")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("WhetherThermoRegulatorToControlTemperatureAndHumidityPresent"), fetchValueFromList(whetherThermoRegulatorToControlTemperatureAndHumidityPresentDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAreTheFarmsManagedByVeterinaryDoctors")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("AreTheFarmsManagedByVeterinaryDoctors"), fetchValueFromList(areTheFarmsManagedByVeterinaryDoctorsDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsTheFarmWithIncinerator")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsTheFarmWithIncinerator"), fetchValueFromList(isTheFarmWithIncineratorDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsLayerFlockSizeOf10000BatchOrBroiler5000Batch")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsLayerFlockSizeOf10000BatchOrBroiler5000Batch"), fetchValueFromList(isLayerFlockSizeOf10000BatchOrBroiler5000BatchDropDown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigGoodFeatureDiscountPercent")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("GoodFeatureDiscountPercent"), fetchValueFromTextFields(goodFeatureDiscountPercentTextField), AssertionType.WARNING);
			}	
			//CH
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDistanceTransitKM")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("DistanceTransitKM"), fetchValueFromTextFields(distanceTransitKMTextField), AssertionType.WARNING);
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigModeTransit")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("ModeTransit"), fetchValueFromList(modeTransitDropdown), AssertionType.WARNING);
			}
		}
	}

	public void clickSaveButton(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity) {
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void clickBackButton(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity) {
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickNextButton(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity) {
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
		}
	}

	public void navigateToPolicy(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);		
			switchToFrame("display");		
			isElementDisplayed(policyTabTitle);		
		}			
	}				
	public void navigateToAttribute(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}				
	public void navigateToInsuredInterest(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestTabTitle);		
		}			
	}				
	public void navigateToCoverage(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);		
			switchToFrame("display");		
			isElementDisplayed(coverageTabTitle);		
		}			
	}				

	public void navigateToLoan(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);		
			//		switchToFrame("display");
		}			
	}				

	public void navigateToClientDetails(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(clientDetailsTabTitle);		
		}			
	}	

	public void navigateToRelation(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);		
			switchToFrame("display");		
			isElementDisplayed(relationsTabTitle);		
		}			
	}

	public void navigateToPayment(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(paymentsTabTitle);		
		}			
	}

	public void navigateToFollowup(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);		
			switchToFrame("display");		
			isElementDisplayed(followupTabTitle);		
		}			
	}				
	public void navigateToDocument(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);		
			switchToFrame("display");		
			isElementDisplayed(documentTabTitle);		
		}			
	}
	//Insured Interest SubTab
	public void navigateToInsuredInterestDetailsTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestDetailsTitle);		
		}			
	}	

	public void navigateToInsuredInterestAttributesTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestAttributesTitle);		
		}			
	}

	public void navigateToInsuredInterestAttachCoveragesTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestCoverageTitle);		
		}			
	}

	public void navigateToInsuredInterestRelationsTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestRelationsTitle);		
		}			
	}

	public void navigateToInsuredInterestPaymentsTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestPaymentListTitle);		
		}			
	}

	//Attach Coverage sub Tab
	public void navigateToAttachCoverageDetailsTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAttachCoverageDetailsTab")){			
			click(attachCoveragesDetailTab);		
			switchToFrame("display");		
			isElementDisplayed(attachCoveragesDetailTabTitle);		
		}			
	}

	public void navigateToAttachCoverageAttributesTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAttachCoverageAttributesTab")){			
			click(attachCoveragesAttributesTab);		
			switchToFrame("display");

		}			
	}

	public void navigateToAttachCoveragePremiumTab(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity){				
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigAttachCoveragePremiumTab")){			
			click(attachCoveragesPremiumTab);		
			switchToFrame("display");		
			isElementDisplayed(attachCoveragesPremiumTabTitle);		
		}			
	}	

	private void fillFinalRateforCamel(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity,CustomAssert assertReference) {
		if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("add") || loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("edit")){
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigRate")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Rate"), fetchValueFromTextFields(rateTextField), AssertionType.WARNING);
			}
			//click(nextButton);
		}
		else if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("verify")){

			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigRate")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("Rate"), fetchValueFromTextFields(rateTextField), AssertionType.WARNING);
			}
		}
	}

	//Abhijit
	public void fillSectionBreedingRiskforDog (LoadDiscntDetRuralEntity loadDiscntDetRuralEntity, CustomAssert assertReference) throws InterruptedException{
		if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("add") || loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("edit")){

			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDeathByWhelping")) {
				selectValueFromList(deathByWhelpingDropdown,loadDiscntDetRuralEntity.getStringValueForField("DeathByWhelping"));
			}
			if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLossOfLitter")) {
				selectValueFromList(lossofLitterLabelDropdown,loadDiscntDetRuralEntity.getStringValueForField("LossOfLitter"));
			}

		}
		else if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("verify")){

			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDeathByWhelping")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("DeathByWhelping"), fetchValueFromList(deathByWhelpingDropdown), AssertionType.WARNING);
			}
			if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigLossOfLitter")) {
				assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("LossOfLitter"), fetchValueFromList(lossofLitterLabelDropdown), AssertionType.WARNING);
			}

		}
	}

	public void clickNextSectionBreedingRiskforDogButton(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity) {
		if (loadDiscntDetRuralEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(nextButton);
		}
	}

	//Sachin FE
		public void fillCoverDetailsforFE1(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity, CustomAssert assertReference) throws InterruptedException{
			if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("add") || loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("edit")){

				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIdentificationNumberDwellingUnitHouse")) {
					clearAndSendKeys(identificationNumberDwellingUnitHouseTextField, loadDiscntDetRuralEntity.getStringValueForField("IdentificationNumberDwellingUnitHouse"));
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfiglocationDwellingUnithouse")) {
					clearAndSendKeys(locationDwellingUnithouseTextArea, loadDiscntDetRuralEntity.getStringValueForField("locationDwellingUnithouse"));
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDescriptionDwellingUnithouse")) {
					clearAndSendKeys(descriptionDwellingUnithouseTextArea, loadDiscntDetRuralEntity.getStringValueForField("DescriptionDwellingUnithouse"));
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsKatchaConstruction")) {
					selectValueFromList(isKatchaConstructionDropdown,loadDiscntDetRuralEntity.getStringValueForField("IsKatchaConstruction"));
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDescriptionContentsDwelling")) {
					clearAndSendKeys(descriptionContentsDwellingTextArea, loadDiscntDetRuralEntity.getStringValueForField("DescriptionContentsDwelling"));
				}
			}
			else if(loadDiscntDetRuralEntity.getAction().equalsIgnoreCase("verify")){

				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIdentificationNumberDwellingUnitHouse")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IdentificationNumberDwellingUnitHouse"), fetchValueFromTextFields(identificationNumberDwellingUnitHouseTextField), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfiglocationDwellingUnithouse")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("locationDwellingUnithouse"), fetchValueFromFields(locationDwellingUnithouseTextArea), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDescriptionDwellingUnithouse")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("DescriptionDwellingUnithouse"), fetchValueFromFields(descriptionDwellingUnithouseTextArea), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigIsKatchaConstruction")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("IsKatchaConstruction"), fetchValueFromList(isKatchaConstructionDropdown), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigDescriptionContentsDwelling")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("DescriptionContentsDwelling"), fetchValueFromFields(descriptionContentsDwellingTextArea), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSumInsuredDwellingUnitRs")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SumInsuredDwellingUnitRs"), fetchValueFromTextFields(sumInsuredDwellingUnitRsTextField), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigSumInsuredContentsRs")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("SumInsuredContentsRs"), fetchValueFromTextFields(sumInsuredContentsRsTextField), AssertionType.WARNING);
				}
				if(loadDiscntDetRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRs")) {
					assertReference.assertEquals(loadDiscntDetRuralEntity.getStringValueForField("TotalSumInsuredRs"), fetchValueFromTextFields(totalSumInsuredRsTextField), AssertionType.WARNING);
				}
				
			}
		}

		
	public void fillandSubmitLoadDiscntDetRuralEntity(LoadDiscntDetRuralEntity loadDiscntDetRuralEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(loadDiscntDetRuralEntity.getConfigExecute())){
			switchToFrame("display");
			if(loadDiscntDetRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural") && loadDiscntDetRuralEntity.getBooleanValueForField("ConfigForSection") ){
				fillSectionBreedingRiskforDog(loadDiscntDetRuralEntity, assertReference);
				clickNextSectionBreedingRiskforDogButton(loadDiscntDetRuralEntity);
			}
			if(loadDiscntDetRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural") && loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("FE") ){
				fillCoverDetailsforFE1(loadDiscntDetRuralEntity, assertReference);
				clickNextSectionBreedingRiskforDogButton(loadDiscntDetRuralEntity);
			}
			fillLoadDiscntDetRuralEntity(loadDiscntDetRuralEntity,assertReference);
			clickNextButton(loadDiscntDetRuralEntity);
			if(loadDiscntDetRuralEntity.getStringValueForField("Product").equalsIgnoreCase("CA"))
			{
				fillFinalRateforCamel(loadDiscntDetRuralEntity, assertReference);
			}
			clickSaveButton(loadDiscntDetRuralEntity);
			clickBackButton(loadDiscntDetRuralEntity);
			navigateToPolicy(loadDiscntDetRuralEntity);
			navigateToAttribute(loadDiscntDetRuralEntity);
			navigateToInsuredInterest(loadDiscntDetRuralEntity);
			navigateToCoverage(loadDiscntDetRuralEntity);
			navigateToLoan(loadDiscntDetRuralEntity);
			navigateToClientDetails(loadDiscntDetRuralEntity);
			navigateToRelation(loadDiscntDetRuralEntity);
			navigateToPayment(loadDiscntDetRuralEntity);
			navigateToFollowup(loadDiscntDetRuralEntity);
			navigateToDocument(loadDiscntDetRuralEntity);
			navigateToInsuredInterestDetailsTab(loadDiscntDetRuralEntity);
			navigateToInsuredInterestAttributesTab(loadDiscntDetRuralEntity);
			navigateToInsuredInterestAttachCoveragesTab(loadDiscntDetRuralEntity);
			navigateToInsuredInterestRelationsTab(loadDiscntDetRuralEntity);
			navigateToInsuredInterestPaymentsTab(loadDiscntDetRuralEntity);
			navigateToAttachCoverageDetailsTab(loadDiscntDetRuralEntity);
			navigateToAttachCoverageAttributesTab(loadDiscntDetRuralEntity);
			navigateToAttachCoveragePremiumTab(loadDiscntDetRuralEntity);

		}
	}
}
