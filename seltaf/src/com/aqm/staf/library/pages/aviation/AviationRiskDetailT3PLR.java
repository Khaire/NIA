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
import com.aqm.staf.library.databin.AviationRiskDT3Entity;

public class AviationRiskDetailT3PLR extends BasePage {

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

	private PageElement forwordButton;
	private PageElement backButton;
	private PageElement saveButton;

	//********************************************************************************************************************************************************************************************

	//AH-Mayur
	private PageElement anyExtensionRequiredDropDown;
	private PageElement deductibleTextField;
	private PageElement natureOfExtensionTextArea;
	private PageElement aircraftDetailsTextArea;
	private PageElement agreedValueSIForTheAircraftTextField;
	private PageElement basisOfCalculationDropDown;
	private PageElement premiumForExtensionTextField;
	private PageElement rateForTheFlyingRriskPercentTextField;
	private PageElement rateForTheTestFlightPercentTextField;
	private PageElement rateForTheGroundRiskPercentTextField;
	
	private PageElement basisOfPremiumComputation;
	private PageElement premium;
	


	public AviationRiskDetailT3PLR(WebDriver driver, String pageName) {
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

		forwordButton=new PageElement(By.name("Next"),"Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//********************************************************************************************************************************************************************************************
		//AH-Mayur
		anyExtensionRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Any Extension Required')]/following::select"), "Any Extension Required Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleTextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible')]/following::textarea[1]"), "Nature of Extension Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfExtensionTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Extension')]/following::textarea"), "Nature of Extension Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aircraftDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Aircraft Details')]/following::textarea"), "Aircraft Details Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedValueSIForTheAircraftTextField= new PageElement(By.xpath("//td//div[contains(text(),'Agreed value SI for the aircraft')]/following::input"), "Agreed value SI for the aircraft Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basisOfCalculationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Basis of calculation')]/following::select"), "Basis of calculation Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForExtensionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Premium for Extension')]/following::input"), "Premium for Extension Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForTheFlyingRriskPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for the Flying risk(%)')]/following::input"), "Rate for the Flying risk(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForTheTestFlightPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for the Test Flight(%)')]/following::input"), "Rate for the Test Flight(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForTheGroundRiskPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for the Ground risk(%)')]/following::input"), "Rate for the Ground risk(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		basisOfPremiumComputation= new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation')]/following::select"), "Basis of Premium Computation Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//premium= new PageElement(By.xpath("//td//div[contains(text(),'Premium')]/following::input"), "Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premium= new PageElement(By.name("propValues3"), "Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	}

	public void fillAviationRiskDetailT3(AviationRiskDT3Entity aviationRiskDT3Entity, CustomAssert assertReference) {
		if(aviationRiskDT3Entity.getBooleanValueForField("ConfigPrimaryInformation")) {
			if(aviationRiskDT3Entity.getAction().equalsIgnoreCase("add") || aviationRiskDT3Entity.getAction().equalsIgnoreCase("edit")){
				//AH-Mayur
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAnyExtensionRequired")) {
					selectValueFromList(anyExtensionRequiredDropDown, aviationRiskDT3Entity.getStringValueForField("AnyExtensionRequired"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigDeductible")) {
					clearAndSendKeys(deductibleTextField, aviationRiskDT3Entity.getStringValueForField("Deductible"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigNatureOfExtension")) {
					clearAndSendKeys(natureOfExtensionTextArea, aviationRiskDT3Entity.getStringValueForField("NatureOfExtension"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAircraftDetails")) {
					clearAndSendKeys(aircraftDetailsTextArea, aviationRiskDT3Entity.getStringValueForField("AircraftDetails"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAgreedValueSIForTheAircraft")) {
					clearAndSendKeys(agreedValueSIForTheAircraftTextField, aviationRiskDT3Entity.getStringValueForField("AgreedValueSIForTheAircraft"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigBasisOfCalculation")) {
					selectValueFromList(basisOfCalculationDropDown, aviationRiskDT3Entity.getStringValueForField("BasisOfCalculation"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPremiumForExtension")) {
					clearAndSendKeys(premiumForExtensionTextField, aviationRiskDT3Entity.getStringValueForField("PremiumForExtension"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheFlyingRriskPercent")) {
					clearAndSendKeys(rateForTheFlyingRriskPercentTextField, aviationRiskDT3Entity.getStringValueForField("RateForTheFlyingRriskPercent"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheTestFlightPercent")) {
					clearAndSendKeys(rateForTheTestFlightPercentTextField, aviationRiskDT3Entity.getStringValueForField("RateForTheTestFlightPercent"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheGroundRiskPercent")) {
					clearAndSendKeys(rateForTheGroundRiskPercentTextField, aviationRiskDT3Entity.getStringValueForField("RateForTheGroundRiskPercent"));
				}
				//dhk
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					selectValueFromList(basisOfPremiumComputation, aviationRiskDT3Entity.getStringValueForField("BasisOfPremiumComputation"));
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPremium")) {
					clearAndSendKeys(premium, aviationRiskDT3Entity.getStringValueForField("Premium"));
				}
				
			}
			else if(aviationRiskDT3Entity.getAction().equalsIgnoreCase("verify")){
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigProduct")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}
				//AH-Mayur
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAnyExtensionRequired")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("AnyExtensionRequired"), fetchValueFromList(anyExtensionRequiredDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigDeductible")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigNatureOfExtension")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("NatureOfExtension"), fetchValueFromTextFields(natureOfExtensionTextArea), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAircraftDetails")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("AircraftDetails"), fetchValueFromTextFields(aircraftDetailsTextArea), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAgreedValueSIForTheAircraft")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("AgreedValueSIForTheAircraft"), fetchValueFromTextFields(agreedValueSIForTheAircraftTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigBasisOfCalculation")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("BasisOfCalculation"), fetchValueFromList(basisOfCalculationDropDown), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPremiumForExtension")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("PremiumForExtension"), fetchValueFromTextFields(premiumForExtensionTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheFlyingRriskPercent")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("RateForTheFlyingRriskPercent"), fetchValueFromTextFields(rateForTheFlyingRriskPercentTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheTestFlightPercent")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("RateForTheTestFlightPercent"), fetchValueFromTextFields(rateForTheTestFlightPercentTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRateForTheGroundRiskPercent")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("RateForTheGroundRiskPercent"), fetchValueFromTextFields(rateForTheGroundRiskPercentTextField), AssertionType.WARNING);
				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("BasisOfPremiumComputation"), fetchValueFromList(basisOfPremiumComputation), AssertionType.WARNING);

				}
				if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPremium")) {
					assertReference.assertEquals(aviationRiskDT3Entity.getStringValueForField("Premium"), fetchValueFromTextFields(premium), AssertionType.WARNING);

				}
			}
		}		
	}

	public void navigateTobackAttributePage(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickSubmitButtonPolicyAttributeCDPolicyDetails(AviationRiskDT3Entity aviationRiskDT3Entity){
		if (aviationRiskDT3Entity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitAviationRiskDetailT3(AviationRiskDT3Entity aviationRiskDT3Entity, CustomAssert assertReference){
		if(isConfigTrue(aviationRiskDT3Entity.getConfigExecute())){
			switchToFrame("display");
			fillAviationRiskDetailT3(aviationRiskDT3Entity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(aviationRiskDT3Entity);
			clickSubmitButtonPolicyAttributeCDPolicyDetails(aviationRiskDT3Entity);
			navigateTobackAttributePage(aviationRiskDT3Entity);
			navigateToPolicy(aviationRiskDT3Entity);
			navigateToAttribute(aviationRiskDT3Entity);
			navigateToCoverage(aviationRiskDT3Entity);
			navigateToClientDetails(aviationRiskDT3Entity);
			navigateToRelation(aviationRiskDT3Entity);
			navigateToPayment(aviationRiskDT3Entity);
			navigateToFollowup(aviationRiskDT3Entity);
			navigateToDocument(aviationRiskDT3Entity);
		}
	}
}
