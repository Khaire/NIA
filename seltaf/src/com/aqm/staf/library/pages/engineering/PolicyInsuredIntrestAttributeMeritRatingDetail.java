package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimDetailsEngEntity;
import com.aqm.staf.library.databin.PolAttSpeCondFireEntity;
import com.aqm.staf.library.databin.PolInsIntAttMeritRatDEntity;
import com.aqm.staf.library.databin.PolInsIntAttMeritRatDEntity;
import com.aqm.staf.library.databin.PolInsIntAttrSTFIEngEntity;

public class PolicyInsuredIntrestAttributeMeritRatingDetail extends BasePage {


	private PageElement locationOfTheRiskCRDropDown;
	private PageElement mANAGEMENTCRDropDown;
	private PageElement technicalDiscountTextField;
	private PageElement earthquakeZoneEngDropDown;

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
	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement forwardButton;
	//ER-Shruti
	private PageElement discretionaryDiscountPercentTextField;
	private PageElement controlNumberTextField;
	private PageElement discountInLieuOfAgentCommissionPercentTextField;
	private PageElement additionalDiscretionaryDiscountPercentGMTextField;
	private PageElement hoControlNumberTextField;
	//EC-Yogesh
	private PageElement discountInLieuOfAgentCommissionTextField;
	private PageElement technicalDiscountAdjustmentFactorTextField;
	private PageElement controlNumberForDiscretionaryDiscountTextField;
	private PageElement additionalDiscretionaryDiscountPercentTextField;
	private PageElement additionaldiscretionaryDiscountControlNumberTextField;
	private PageElement saveButton;
	//ALOP
	private PageElement standardTimeExcessInDaysTextfFeld;
	private PageElement factorReflectingTheMaximumIndemnityPeriodAndTheMaximumProbableDelayFPITextField;
	private PageElement factorReflectingTheAgreedTimeExcessComparedToStandardTimeExcessFTETextField;
	private PageElement additionalDiscretionaryDiscountPercentAFTextField;
	private PageElement additionalDiscretionaryControlNumberTextField;
	//ME
	private PageElement totalSITextField;
	private PageElement invoiceNumberTextField;
	private PageElement invoiceDateTextField;
	private PageElement storageApplicableDropDown;
	private PageElement durationOfStorageTextField;
	private PageElement placeOfStorageTextArea;
	private PageElement storageRateTextField;
	private PageElement shutoutCargoApplicableDropDown;
	private PageElement numberOfDaysTextField;
	private PageElement transitExtensionApplicableDropDown;
	private PageElement transitDurationTextField;
	private PageElement sellersContingencyApplicableDropDown;
	private PageElement ExcessAmountTextField;
	private PageElement dateOfSailingTextField;
	private PageElement limitPerBottomRailRoadRsTextField;
	private PageElement limitPerBottomAirSeaRsTextField;
	private PageElement limitPerLocationRailRoadRsTextField;
	private PageElement limitPerLocationAirSeaRsTextField;
	private PageElement specialConditionsTextArea;
	private PageElement specialConditionsWarantiesTextArea;
	public PolicyInsuredIntrestAttributeMeritRatingDetail(WebDriver driver, String pageName) {
		super(driver, pageName);

		locationOfTheRiskCRDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Location Of The Risk(CR)')]/following::select"), "Location Of The Risk(CR)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		mANAGEMENTCRDropDown=new PageElement(By.xpath("//td//div[contains(text(),'MANAGEMENT(CR)')]/following::select"), "MANAGEMENT(CR)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		technicalDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount')]/following::input"), "Technical Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeZoneEngDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake Zone(Eng)')]/following::select"), "Earthquake Zone(Eng)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//ER-Shruti
		discretionaryDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount (%)')]/following::input"), "Discretionary Discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		controlNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Control Number')]/following::input"), "Discretionary Discount Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountInLieuOfAgentCommissionPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discount in lieu of Agent Commission(%)')]/following::input"), "Discount in lieu of Agent Commission(%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryDiscountPercentGMTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional Discretionary discount allowed by GM (%)')]/following::input"), "Additional discretionary Discount allowed by GM (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hoControlNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'HO Control Number')]/following::input"), "HO Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EC
		discountInLieuOfAgentCommissionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discount in lieu of Agent Commission')]/following::input"), "Discount in lieu of Agent Commission Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalDiscountAdjustmentFactorTextField= new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount Adjustment Factor')]/following::input"), "Technical Discount Adjustment Factor Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		controlNumberForDiscretionaryDiscountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Control Number for Discretionary Discount')]/following::input"), "Control Number for Discretionary Discount Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional discretionary Discount (%)')]/following::input"), "Additional discretionary Discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionaldiscretionaryDiscountControlNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional discretionary Discount Control Number')]/following::input"), "Additional discretionary Discount Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//ALOP
		standardTimeExcessInDaysTextfFeld= new PageElement(By.xpath("//td//div[contains(text(),'Standard Time Excess(in days)')]/following::input"), "Standard Time Excess(in days) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingTheMaximumIndemnityPeriodAndTheMaximumProbableDelayFPITextField= new PageElement(By.xpath("//td//div[contains(text(),'Factor Reflecting the maximum indemnity period and the maximum probable delay(FPI)')]/following::input"), "Factor Reflecting the maximum indemnity period and the maximum probable delay(FPI) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingTheAgreedTimeExcessComparedToStandardTimeExcessFTETextField= new PageElement(By.xpath("//td//div[contains(text(),'Discount in lieu of Agent Commission')]/following::input"), "Discount in lieu of Agent Commission Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryControlNumberTextField= new PageElement(By.xpath("//td/div[contains(text(),'Additional discretionary Discount (%)')]/following::input"), "Additional discretionary Discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryDiscountPercentAFTextField= new PageElement(By.xpath("//td/div[contains(text(),'Additional Discretionary Control Number')]/following::input"), "Additional Discretionary Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//ME
		totalSITextField= new PageElement(By.xpath("//td//div[contains(text(),'Total SI')]/following::input"), "Total SI Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 invoiceNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Invoice Number')]/following::input"), "Invoice Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 invoiceDateTextField= new PageElement(By.xpath("//td//div[contains(text(),'Invoice Date')]/following::input"), "Invoice Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 durationOfStorageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Duration of Storage')]/following::input"), "Duration of Storage Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 placeOfStorageTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Place of Storage')]/following::textarea"), "Place of Storage Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 storageRateTextField= new PageElement(By.xpath("//td//div[contains(text(),'Storage Rate')]/following::input"), "Storage Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 shutoutCargoApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Shutout cargo Applicable')]/following::select"), "Shutout cargo Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 numberOfDaysTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Days')]/following::input"), "Number of Days Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 transitExtensionApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Extension Applicable')]/following::select"), "Transit Extension Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 transitDurationTextField= new PageElement(By.xpath("//td//div[contains(text(),'Transit Duration')]/following::input"), "Transit Duration Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 sellersContingencyApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sellers Contingency Applicable')]/following::select"), "Sellers Contingency Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 ExcessAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess Amount')]/following::input"), "Excess Amount Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 dateOfSailingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Sailing')]/following::input"), "Date of Sailing Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 limitPerBottomRailRoadRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limit per bottom Rail/Road Rs')]/following::input"), "Limit per bottom Rail/Road Rs Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerBottomAirSeaRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limit per bottom Air/Sea Rs')]/following::input"), "Limit per bottom Air/Sea Rs Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationRailRoadRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limit per location Rail/Road Rs')]/following::input"), "Limit per location Rail/Road Rs Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationAirSeaRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limit per location Air/Sea Rs')]/following::input"), "Limit per location Air/Sea Rs Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsWarantiesTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Special conditions/warranties')]/following::textarea"), "Special Conditions/Warranties Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyInsuredIntrestAttributeMeritRatingDetail(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("add") || polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigLocationOfTheRiskCR")) {
				selectValueFromList(locationOfTheRiskCRDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("LocationOfTheRiskCR"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMANAGEMENTCR")) {
				selectValueFromList(mANAGEMENTCRDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("MANAGEMENTCR"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				clearAndSendKeys(technicalDiscountTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("TechnicalDiscount"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigEarthquakeZoneEng")) {
				selectValueFromList(earthquakeZoneEngDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("EarthquakeZoneEng"));
			}
			//EC
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercentForEC")) {
				clearAndSendKeys(discretionaryDiscountPercentTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("DiscretionaryDiscountPercentForEC"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercentForEC")) {
				clearAndSendKeys(discountInLieuOfAgentCommissionTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercentForEC"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				clearAndSendKeys(technicalDiscountAdjustmentFactorTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigControlNumberForDiscretionaryDiscount")) {
				clearAndSendKeys(controlNumberForDiscretionaryDiscountTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("ControlNumberForDiscretionaryDiscount"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercent")) {
				clearAndSendKeys(additionalDiscretionaryDiscountPercentTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercent"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionaldiscretionaryDiscountControlNumber")) {
				clearAndSendKeys(additionaldiscretionaryDiscountControlNumberTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionaldiscretionaryDiscountControlNumber"));
			}
			//ME
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtotalSI")) {
				clearAndSendKeys(totalSITextField, polInsIntAttMeritRatingDEntity.getStringValueForField("totalSI"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiginvoiceNumber")) {
				clearAndSendKeys(invoiceNumberTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("invoiceNumber"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiginvoiceDate")) {
				clearAndSendKeys(invoiceDateTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("invoiceDate"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigdurationOfStorage")) {
				clearAndSendKeys(durationOfStorageTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("durationOfStorage"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigplaceOfStorage")) {
				clearAndSendKeys(placeOfStorageTextArea, polInsIntAttMeritRatingDEntity.getStringValueForField("placeOfStorage"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigstorageRate")) {
				clearAndSendKeys(storageRateTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("storageRate"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfignumberOfDays")) {
				clearAndSendKeys(numberOfDaysTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("numberOfDays"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtransitDuration")) {
				clearAndSendKeys(transitDurationTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("transitDuration"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigExcessAmount")) {
				clearAndSendKeys(ExcessAmountTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("ExcessAmount"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigdateOfSailing")) {
				clearAndSendKeys(dateOfSailingTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("dateOfSailing"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerBottomRailRoadRs")) {
				clearAndSendKeys(limitPerBottomRailRoadRsTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerBottomRailRoadRs"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerBottomAirSeaRs")) {
				clearAndSendKeys(limitPerBottomAirSeaRsTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerBottomAirSeaRs"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerLocationRailRoadRs")) {
				clearAndSendKeys(limitPerLocationRailRoadRsTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerLocationRailRoadRs"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerLocationAirSeaRs")) {
				clearAndSendKeys(limitPerLocationAirSeaRsTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerLocationAirSeaRs"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigspecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntAttMeritRatingDEntity.getStringValueForField("specialConditions"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigstorageApplicable")) {
				selectValueFromList(storageApplicableDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("storageApplicable"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigshutoutCargoApplicable")) {
				selectValueFromList(shutoutCargoApplicableDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("shutoutCargoApplicable"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtransitExtensionApplicable")) {
				selectValueFromList(transitExtensionApplicableDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("transitExtensionApplicable"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigsellersContingencyApplicable")) {
				selectValueFromList(sellersContingencyApplicableDropDown, polInsIntAttMeritRatingDEntity.getStringValueForField("sellersContingencyApplicable"));
			}	
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigspecialConditionsWaranties")) {
				clearAndSendKeys(specialConditionsWarantiesTextArea, polInsIntAttMeritRatingDEntity.getStringValueForField("specialConditionsWaranties"));
			}

		}
		else if(polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigLocationOfTheRiskCR")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("LocationOfTheRiskCR"), fetchValueFromList(locationOfTheRiskCRDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMANAGEMENTCR")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("MANAGEMENTCR"), fetchValueFromList(mANAGEMENTCRDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("TechnicalDiscount"), fetchValueFromTextFields(technicalDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigEarthquakeZoneEng")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("EarthquakeZoneEng"), fetchValueFromList(earthquakeZoneEngDropDown), AssertionType.WARNING);
			}
			//EC
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercentForEC")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("DiscretionaryDiscountPercentForEC"), fetchValueFromTextFields(discretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercentForEC")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercentForEC"), fetchValueFromTextFields(discountInLieuOfAgentCommissionTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"), fetchValueFromTextFields(technicalDiscountAdjustmentFactorTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigControlNumberForDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("ControlNumberForDiscretionaryDiscount"), fetchValueFromTextFields(controlNumberForDiscretionaryDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercent")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercent"), fetchValueFromTextFields(additionalDiscretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionaldiscretionaryDiscountControlNumber")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionaldiscretionaryDiscountControlNumber"), fetchValueFromTextFields(additionaldiscretionaryDiscountControlNumberTextField), AssertionType.WARNING);
			}
			//ALOP
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigStandardTimeExcessInDays")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("StandardTimeExcessInDays"), fetchValueFromTextFields(standardTimeExcessInDaysTextfFeld), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigFactorRefTheMaxIndemnityPeriod")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("FactorRefTheMaxIndemnityPeriod"), fetchValueFromTextFields(factorReflectingTheMaximumIndemnityPeriodAndTheMaximumProbableDelayFPITextField), AssertionType.WARNING);
			}
			//ME
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigstorageApplicable")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("storageApplicable"), fetchValueFromList(storageApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigshutoutCargoApplicable")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("shutoutCargoApplicable"), fetchValueFromList(shutoutCargoApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtransitExtensionApplicable")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("transitExtensionApplicable"), fetchValueFromList(transitExtensionApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigsellersContingencyApplicable")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("sellersContingencyApplicable"), fetchValueFromList(sellersContingencyApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtotalSI")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("totalSI"), fetchValueFromTextFields(totalSITextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiginvoiceNumber")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("invoiceNumber"), fetchValueFromTextFields(invoiceNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiginvoiceDate")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("invoiceDate"), fetchValueFromTextFields(invoiceDateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigdurationOfStorage")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("durationOfStorage"), fetchValueFromTextFields(durationOfStorageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigplaceOfStorage")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("placeOfStorage"), fetchValueFromTextFields(placeOfStorageTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigstorageRate")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("storageRate"), fetchValueFromTextFields(storageRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfignumberOfDays")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("numberOfDays"), fetchValueFromTextFields(numberOfDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigtransitDuration")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("transitDuration"), fetchValueFromTextFields(transitDurationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigExcessAmount")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("ExcessAmount"), fetchValueFromTextFields(ExcessAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigdateOfSailing")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("dateOfSailing"), fetchValueFromTextFields(dateOfSailingTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerBottomRailRoadRs")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerBottomRailRoadRs"), fetchValueFromTextFields(limitPerBottomRailRoadRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerBottomAirSeaRs")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerBottomAirSeaRs"), fetchValueFromTextFields(limitPerBottomAirSeaRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerLocationRailRoadRs")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerLocationRailRoadRs"), fetchValueFromTextFields(limitPerLocationRailRoadRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfiglimitPerLocationAirSeaRs")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("limitPerLocationAirSeaRs"), fetchValueFromTextFields(limitPerLocationAirSeaRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigspecialConditions")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("specialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigspecialConditionsWaranties")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("specialConditionsWaranties"), fetchValueFromTextFields(specialConditionsWarantiesTextArea), AssertionType.WARNING);
			}	
			
		}
	}

	public void navigateToPolicy(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			if(polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("EC")){
				click(forwardButton);
				switchToFrame("display");
			}
		}
	}
	public void fillRateAndDiscountDetails(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity,CustomAssert assertReference) {
		if(polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("add") || polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigControlNumber")) {
				clearAndSendKeys(controlNumberTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("ControlNumber"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercent")) {
				clearAndSendKeys(discretionaryDiscountPercentTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("DiscretionaryDiscountPercent"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercent")) {
				clearAndSendKeys(discountInLieuOfAgentCommissionPercentTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercent"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercentGM")) {
				clearAndSendKeys(additionalDiscretionaryDiscountPercentGMTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercentGM"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigHOControlNumber")) {
				clearAndSendKeys(hoControlNumberTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("HOControlNumber"));
			}
			//ALOP
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigFactorRefeAgrTimeExcess")) {
				clearAndSendKeys(factorReflectingTheAgreedTimeExcessComparedToStandardTimeExcessFTETextField, polInsIntAttMeritRatingDEntity.getStringValueForField("FactorRefeAgrTimeExcess"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAddDiscretionaryDiscControlNo")) {
				clearAndSendKeys(additionalDiscretionaryControlNumberTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("AddDiscretionaryDiscControlNo"));
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAddDiscretionaryDiscPercentAF")) {
				clearAndSendKeys(additionalDiscretionaryDiscountPercentAFTextField, polInsIntAttMeritRatingDEntity.getStringValueForField("AddDiscretionaryDiscPercentAF"));
			}
			click(forwardButton);
			if(polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ALOP")||polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ME")){
				click(forwardButton);
			}
			/*if((polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ME"))&&(polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigEndorse"))){
				click(forwardButton);
			}*/
			if(polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ALOP")&&polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ConfigForwordALOP")){
				click(forwardButton);
			}
		}
		else if(polInsIntAttMeritRatingDEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercent")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("DiscretionaryDiscountPercent"), fetchValueFromTextFields(discretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigControlNumber")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("ControlNumber"), fetchValueFromTextFields(controlNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercent")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercent"), fetchValueFromTextFields(discountInLieuOfAgentCommissionPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercentGM")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercentGM"), fetchValueFromTextFields(additionalDiscretionaryDiscountPercentGMTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigHOControlNumber")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("HOControlNumber"), fetchValueFromTextFields(hoControlNumberTextField), AssertionType.WARNING);
			}
			//ALOP
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigFactorRefeAgrTimeExcess")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("FactorRefeAgrTimeExcess"), fetchValueFromTextFields(factorReflectingTheAgreedTimeExcessComparedToStandardTimeExcessFTETextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAddDiscretionaryDiscPercentAF")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("AddDiscretionaryDiscPercentAF"), fetchValueFromTextFields(additionalDiscretionaryDiscountPercentAFTextField), AssertionType.WARNING);
			}
			if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigAddDiscretionaryDiscControlNo")) {
				assertReference.assertEquals(polInsIntAttMeritRatingDEntity.getStringValueForField("AddDiscretionaryDiscControlNo"), fetchValueFromTextFields(additionalDiscretionaryControlNumberTextField), AssertionType.WARNING);
			}

			click(forwardButton);
			if((polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("ME"))&&(polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigEndorse"))){
				click(forwardButton);
			}
		}
	}

	public void clickOnSaveButton(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity){
		if (polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
		}
	}	
	public void fillAndSubmitPolicyInsuredIntrestAttributeMeritRatingDetail(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttMeritRatingDEntity.getConfigExecute())){
			switchToFrame("display");
			if(!(polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("CF") || polInsIntAttMeritRatingDEntity.getStringValueForField("Product").equalsIgnoreCase("CM"))){
				fillPolicyInsuredIntrestAttributeMeritRatingDetail(polInsIntAttMeritRatingDEntity,assertReference);	
				clickOnForwardButton(polInsIntAttMeritRatingDEntity);
			}
			if(polInsIntAttMeritRatingDEntity.getBooleanValueForField("ConfigRateAndDiscount")){
				fillRateAndDiscountDetails(polInsIntAttMeritRatingDEntity,assertReference);
			}
			clickOnSaveButton(polInsIntAttMeritRatingDEntity);
			navigateToPolicy(polInsIntAttMeritRatingDEntity);
			navigateToAttribute(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterest(polInsIntAttMeritRatingDEntity);
			navigateToCoverage(polInsIntAttMeritRatingDEntity);
			navigateToLoan(polInsIntAttMeritRatingDEntity);
			navigateToClientDetails(polInsIntAttMeritRatingDEntity);
			navigateToRelation(polInsIntAttMeritRatingDEntity);
			navigateToPayment(polInsIntAttMeritRatingDEntity);
			navigateToFollowup(polInsIntAttMeritRatingDEntity);
			navigateToDocument(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterestDetails(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterestAttributes(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterestRelations(polInsIntAttMeritRatingDEntity);
			navigateToInsuredInterestPayments(polInsIntAttMeritRatingDEntity);
		}
	}
}
