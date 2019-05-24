package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AviationRiskDT2Entity;


public class AviationRiskDetailIIT2PLR extends BasePage {

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

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement previousPolicyHistoryT3POLTitle;	
	private PageElement schemeNoLable;
	private PageElement nextAttributePageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;

	private PageElement insuredInterestTab;
	private PageElement policyDataPZT1POLTitle ;
	private PageElement insuredInterestTabTitle;
	//********************************************************************************************************************************************************************************************
	//AG-Mayur
	private PageElement basisOfPremiumComputationDropDown;
	private PageElement premiumTextField;
	private PageElement basicRateForPremiumCalculationPercentTextField;
	private PageElement premiumTextFieldForSR;
	//AH- Mayur
	private PageElement noOfPilotsTextField;
	private PageElement pilotDetailsTextArea;
	private PageElement pilotDetails2TextArea;
	private PageElement purposeOfUseBusinessDropDown;
	private PageElement purposeOfUsePrivatePleasureDropDown;
	private PageElement purposeOfUseCommercialDropDown;
	private PageElement purposeOfUseRentalDropDown;
	private PageElement purposeOfUseFamiliarizationDropDown;
	private PageElement purposeOfUseTrainingDropDown;
	private PageElement purposeOfUseTypeCertificationFlightsDropDown;
	private PageElement geographicalLimitWithinWhichTheAircraftWillBeflownDropDown;
	private PageElement detailsOfAllTheAccidentsORlossesDuringLastFiveYearsTextArea;
	private PageElement saveButton;
	
	

	//AL product is Same as AG

	//AI- Mayur
	private PageElement sumInsuredTextField;
	private PageElement maximumSparesValueTextField;
	//AU product is Same as AG
	//PA product is Same as AG
	//PN product is Same as AG
	
	private PageElement forwardButton;
	private PageElement backButton;
	// DHK
	private PageElement hullSumInsuredTextField;
	private PageElement hullPremiumTextField;
	private PageElement sparesWarSumInsuredTextField;
	private PageElement sparesWarPremiumTextField;
	private PageElement excessLiabilitySumInsuredTextField;
	private PageElement excessLiabilityPremiumTextField;
	
	private PageElement sumInsuredForHullDeductiblePolicy;
	private PageElement deductibleForThisPolicy;
	private PageElement hARDeductible;
	
	public AviationRiskDetailIIT2PLR(WebDriver driver, String pageName) {
		super(driver,pageName);
		previousPolicyHistoryT3POLTitle =new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy History T3-POL')]"), "Previous Policy History T3-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Break')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		schemeNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme No.")),"Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),"Insured Interest Tab",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//********************************************************************************************************************************************************************************************

		forwardButton=new PageElement(By.name("Next"),"Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//AG-Mayur
		basisOfPremiumComputationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation')]/following::select"), "Basis of Premium Computation Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium", "input")), "Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicRateForPremiumCalculationPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Basic rate for premium calculation (%)')]/following::input"), "Premium DropDown Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//AH- Mayur
		noOfPilotsTextField= new PageElement(By.xpath("//td//div[contains(text(),'No. of pilots')]/following::input"), "No. of pilots Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pilotDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Pilot details')]/following::textarea"), "Pilot details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pilotDetails2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Pilot details2')]/following::textarea"), "Pilot details2 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		purposeOfUseBusinessDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Business')]/following::select"), "Purpose of use Business Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUsePrivatePleasureDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Private pleasure')]/following::select"), "Purpose of use Private pleasure Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUseCommercialDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Commercial')]/following::select"), "Purpose of use Commercial Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUseRentalDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Rental')]/following::select"), "Purpose of use Rental Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUseFamiliarizationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Familiarization')]/following::select"), "Purpose of use Familiarization Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUseTrainingDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Training')]/following::select"), "Purpose of use Training Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUseTypeCertificationFlightsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Purpose of use Type certification flights')]/following::select"), "Purpose of use Type certification flights Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		geographicalLimitWithinWhichTheAircraftWillBeflownDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Geographical limit within which the aircraft will be flown')]/following::select"), "Geographical limit within which the aircraft will be flown Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfAllTheAccidentsORlossesDuringLastFiveYearsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of all the accidents/losses during last five years')]/following::textarea"), "Details of all the accidents/losses during last five years text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//AI- Mayur
		sumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumTextFieldForSR= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium", "input")), "Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumSparesValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Maximum Spares Value')]/following::input[1]"), "Maximum Spares Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//dhk
		hullSumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Hull Sum Insured')]/following::input"), "Hull Sum Insured Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hullPremiumTextField= new PageElement(By.xpath("//td//div[contains(text(),'Hull Premium')]/following::input"), "Hull Premium Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesWarSumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Spares War Sum Insured')]/following::input"), "Spares War Sum Insured Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesWarPremiumTextField= new PageElement(By.xpath("//td//div[contains(text(),'Spares War Premium')]/following::input"), "Spares War Premium Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessLiabilitySumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess Liability Sum Insured')]/following::input"), "Excess Liability Sum Insured Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessLiabilityPremiumTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess Liability Premium')]/following::input"), "Excess Liability Premium Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//dhk AD 
		
		sumInsuredForHullDeductiblePolicy = new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for Hull Deductible policy')]/following::input"), "Sum insured for Hull Deductible policy Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForThisPolicy = new PageElement(By.xpath("//td//div[contains(text(),'Deductible for this policy')]/following::input"), "Deductible for this policy Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hARDeductible =new PageElement(By.xpath("//td//div[contains(text(),'HAR Deductible')]/following::input"), "HAR Deductible Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillAviationRiskDetailIIT2(AviationRiskDT2Entity aviationRiskDT2Entity, CustomAssert assertReference) {
			if(aviationRiskDT2Entity.getAction().equalsIgnoreCase("add") || aviationRiskDT2Entity.getAction().equalsIgnoreCase("edit")){
				//AG-Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					selectValueFromList(basisOfPremiumComputationDropDown, aviationRiskDT2Entity.getStringValueForField("BasisOfPremiumComputation"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPremium")) {
					clearAndSendKeys(premiumTextField, aviationRiskDT2Entity.getStringValueForField("Premium"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigBasicRateForPremiumCalculationPercent")) {
					clearAndSendKeys(basicRateForPremiumCalculationPercentTextField, aviationRiskDT2Entity.getStringValueForField("BasicRateForPremiumCalculationPercent"));
				}
				//AH- Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigNoOfPilots")) {
					clearAndSendKeys(noOfPilotsTextField, aviationRiskDT2Entity.getStringValueForField("NoOfPilots"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPilotDetails")) {
					clearAndSendKeys(pilotDetailsTextArea, aviationRiskDT2Entity.getStringValueForField("PilotDetails"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPilotDetails2")) {
					clearAndSendKeys(pilotDetails2TextArea, aviationRiskDT2Entity.getStringValueForField("PilotDetails2"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseBusiness")) {
					selectValueFromList(purposeOfUseBusinessDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseBusiness"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUsePrivatePleasure")) {
					selectValueFromList(purposeOfUsePrivatePleasureDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUsePrivatePleasure"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseCommercial")) {
					selectValueFromList(purposeOfUseCommercialDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseCommercial"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseRental")) {
					selectValueFromList(purposeOfUseRentalDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseRental"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseFamiliarization")) {
					selectValueFromList(purposeOfUseFamiliarizationDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseFamiliarization"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseTraining")) {
					selectValueFromList(purposeOfUseTrainingDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseTraining"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseTypeCertificationFlights")) {
					selectValueFromList(purposeOfUseTypeCertificationFlightsDropDown, aviationRiskDT2Entity.getStringValueForField("PurposeOfUseTypeCertificationFlights"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigGeographicalLimitWithinWhichTheAircraftWillBeflown")) {
					selectValueFromList(geographicalLimitWithinWhichTheAircraftWillBeflownDropDown, aviationRiskDT2Entity.getStringValueForField("GeographicalLimitWithinWhichTheAircraftWillBeflown"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigDetailsOfAllTheAccidentsORlossesDuringLastFiveYears")) {
					clearAndSendKeys(detailsOfAllTheAccidentsORlossesDuringLastFiveYearsTextArea, aviationRiskDT2Entity.getStringValueForField("DetailsOfAllTheAccidentsORlossesDuringLastFiveYears"));
				}
				//AI- Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSumInsured")) {
					clearAndSendKeys(sumInsuredTextField, aviationRiskDT2Entity.getStringValueForField("SumInsured"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigMaximumSparesValue")) {
					clearAndSendKeys(maximumSparesValueTextField, aviationRiskDT2Entity.getStringValueForField("MaximumSparesValue"));
				}

				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPremiumSR")) {
					clearAndSendKeys(premiumTextFieldForSR, aviationRiskDT2Entity.getStringValueForField("PremiumSR"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigHullSumInsured")) {
					clearAndSendKeys(hullSumInsuredTextField, aviationRiskDT2Entity.getStringValueForField("HullSumInsured"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigHullPremium")) {
					clearAndSendKeys(hullPremiumTextField, aviationRiskDT2Entity.getStringValueForField("HullPremium"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSparesWarSumInsured")) {
					clearAndSendKeys(sparesWarSumInsuredTextField, aviationRiskDT2Entity.getStringValueForField("SparesWarSumInsured"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSparesWarPremium")) {
					clearAndSendKeys(sparesWarPremiumTextField, aviationRiskDT2Entity.getStringValueForField("SparesWarPremium"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigExcessLiabilitySumInsured")) {
					clearAndSendKeys(excessLiabilitySumInsuredTextField, aviationRiskDT2Entity.getStringValueForField("ExcessLiabilitySumInsured"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigExcessLiabilityPremium")) {
					clearAndSendKeys(excessLiabilityPremiumTextField, aviationRiskDT2Entity.getStringValueForField("ExcessLiabilityPremium"));
				}
				//DHK
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSumInsuredForHullDeductiblePolicy")) {
					clearAndSendKeys(sumInsuredForHullDeductiblePolicy, aviationRiskDT2Entity.getStringValueForField("SumInsuredForHullDeductiblePolicy"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigDeductibleForThisPolicy")) {
					clearAndSendKeys(deductibleForThisPolicy, aviationRiskDT2Entity.getStringValueForField("DeductibleForThisPolicy"));
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigHARDeductible")) {
					clearAndSendKeys(hARDeductible, aviationRiskDT2Entity.getStringValueForField("HARDeductible"));
				}
				
			}

			else if(aviationRiskDT2Entity.getAction().equalsIgnoreCase("verify")){
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigProduct")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}
				//AG-Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("BasisOfPremiumComputation"), fetchValueFromList(basisOfPremiumComputationDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPremium")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigBasicRateForPremiumCalculationPercent")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("BasicRateForPremiumCalculationPercent"), fetchValueFromTextFields(basicRateForPremiumCalculationPercentTextField), AssertionType.WARNING);
				}
				//AH- Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigNoOfPilots")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("NoOfPilots"), fetchValueFromTextFields(noOfPilotsTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPilotDetails")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PilotDetails"), fetchValueFromTextFields(pilotDetailsTextArea), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPilotDetails2")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PilotDetails2"), fetchValueFromTextFields(pilotDetails2TextArea), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseBusiness")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUseBusiness"), fetchValueFromList(purposeOfUseBusinessDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUsePrivatePleasure")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUsePrivatePleasure"), fetchValueFromList(purposeOfUsePrivatePleasureDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseRental")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUseRental"), fetchValueFromList(purposeOfUseRentalDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseFamiliarization")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUseFamiliarization"), fetchValueFromList(purposeOfUseFamiliarizationDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseTraining")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUseTraining"), fetchValueFromList(purposeOfUseTrainingDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPurposeOfUseTypeCertificationFlights")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PurposeOfUseTypeCertificationFlights"), fetchValueFromList(purposeOfUseTypeCertificationFlightsDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigGeographicalLimitWithinWhichTheAircraftWillBeflown")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("GeographicalLimitWithinWhichTheAircraftWillBeflown"), fetchValueFromList(geographicalLimitWithinWhichTheAircraftWillBeflownDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigDetailsOfAllTheAccidentsORlossesDuringLastFiveYears")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("DetailsOfAllTheAccidentsORlossesDuringLastFiveYears"), fetchValueFromTextFields(detailsOfAllTheAccidentsORlossesDuringLastFiveYearsTextArea), AssertionType.WARNING);
				}
				//AI- Mayur
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSumInsured")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigMaximumSparesValue")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("MaximumSparesValue"), fetchValueFromTextFields(maximumSparesValueTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPremiumSR")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("PremiumSR"), fetchValueFromTextFields(premiumTextFieldForSR), AssertionType.WARNING);
				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSumInsuredForHullDeductiblePolicy")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("SumInsuredForHullDeductiblePolicy"), fetchValueFromTextFields(sumInsuredForHullDeductiblePolicy), AssertionType.WARNING);

				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigDeductibleForThisPolicy")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("DeductibleForThisPolicy"), fetchValueFromTextFields(deductibleForThisPolicy), AssertionType.WARNING);

				}
				if (aviationRiskDT2Entity.getBooleanValueForField("ConfigHARDeductible")) {
					assertReference.assertEquals(aviationRiskDT2Entity.getStringValueForField("HARDeductible"), fetchValueFromTextFields(hARDeductible), AssertionType.WARNING);

				}
			}
		}

	public void navigateTobackAttributePage(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AviationRiskDT2Entity AviationRiskDT2Entity){
		if (AviationRiskDT2Entity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickSubmitButtonPolicyAttributeCDPolicyDetails(AviationRiskDT2Entity aviationRiskDT2Entity){
		if (aviationRiskDT2Entity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitAviationRiskDetailIIT2(AviationRiskDT2Entity aviationRiskDT2Entity, CustomAssert assertReference){
		if(isConfigTrue(aviationRiskDT2Entity.getConfigExecute())){
			switchToFrame("display");
			fillAviationRiskDetailIIT2(aviationRiskDT2Entity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(aviationRiskDT2Entity);
			clickSubmitButtonPolicyAttributeCDPolicyDetails(aviationRiskDT2Entity);
			navigateTobackAttributePage(aviationRiskDT2Entity);
			navigateToPolicy(aviationRiskDT2Entity);
			navigateToAttribute(aviationRiskDT2Entity);
			navigateToCoverage(aviationRiskDT2Entity);
			navigateToClientDetails(aviationRiskDT2Entity);
			navigateToRelation(aviationRiskDT2Entity);
			navigateToPayment(aviationRiskDT2Entity);
			navigateToFollowup(aviationRiskDT2Entity);
			navigateToDocument(aviationRiskDT2Entity);
		}
	}
}
