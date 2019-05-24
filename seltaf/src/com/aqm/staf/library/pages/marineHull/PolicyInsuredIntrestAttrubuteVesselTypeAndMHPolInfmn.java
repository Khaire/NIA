package com.aqm.staf.library.pages.marineHull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;

import com.aqm.staf.library.databin.PolVessTypeMHPolInfmnEntity;


public class PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn extends BasePage{
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
	private PageElement loanTabTitle;

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement nextAttributePageTitle;
	
	private PageElement nextAttributePageTitle2;
	private PageElement nextAttributePageTitle3;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	//WR
	private PageElement subTypeOfOceanGoingVesselDropdown;
	private PageElement nameOfInsuredInterestDropdown;
	private PageElement nameOfTheVesselTextfield;
	private PageElement yearOfBuiltDropdown;
	private PageElement yearOfRebuiltDropdown;
	private PageElement assigneeMortgageeTextarea;
	private PageElement portOfRegistrationAndAuthorityTextfield;

	private PageElement grtTextfield;
	private PageElement classForOceanGoingVesselDropdown;
	private PageElement flagForOceanGoingVesselDropdown;
	private PageElement valuationOfVesselDropdown;
	private PageElement sumInsuredTextfield;
	private PageElement nameOfTheCurrencyDropdown;
	private PageElement exchangeRateTextfield;
	private PageElement sumInsuredInInrTextfield;

	private PageElement qualificationOfMasterTextfield;
	private PageElement numberOfCrewTextfield;
	private PageElement presentInsurerIfAnyTextarea;
	private PageElement claimDetailopenbutton;
	private PageElement deductibleTextfield;
	private PageElement tradingRegionsTextarea;
	private PageElement saveButton;


	public PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(WebDriver driver, String pageName) {
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

		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Vessel Risk Details')]"),"Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle2= new PageElement(By.xpath("//div//b//font[contains(text(),'Vessel Information T2-PLR')]"),"Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle3= new PageElement(By.xpath("//div//b//font[contains(text(),'Vessel Information T3-PLR')]"),"Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
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
		//WR
		subTypeOfOceanGoingVesselDropdown=new PageElement(By.xpath("//td//div[@id='Sub Type of Ocean Going Vessel']/following::select"), "Sub Type of Ocean Going Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfInsuredInterestDropdown=new PageElement(By.xpath("//td//div[@id='Name of Insured Interest']/following::select"), "Name of Insured Interest", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheVesselTextfield=new PageElement(By.xpath("//td//div[@id='Name of the Vessel']/following::input"), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfBuiltDropdown=new PageElement(By.xpath("//td//div[@id='Year of Built']/following::select"), "Year of Built", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfRebuiltDropdown=new PageElement(By.xpath("//td//div[@id='Year of Rebuilt']/following::select"), "Year of Rebuilt", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		assigneeMortgageeTextarea=new PageElement(By.xpath("//td//div[@id='Assignee/Mortgagee']/following::textarea"), "Assignee/Mortgagee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfRegistrationAndAuthorityTextfield=new PageElement(By.xpath("//td//div[@id='Port of Registration and Authority']/following::input"), "Port of Registration and Authority", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		grtTextfield=new PageElement(By.xpath("//td//div[@id='GRT']/following::input"), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classForOceanGoingVesselDropdown=new PageElement(By.xpath("//td//div[@id='Class for Ocean going Vessel']/following::select"), "Class for Ocean going Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		flagForOceanGoingVesselDropdown=new PageElement(By.xpath("//td//div[@id='Flag for Ocean Going Vessel']/following::select"), "Flag for Ocean Going Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valuationOfVesselDropdown=new PageElement(By.xpath("//td//div[@id='Valuation of vessel']/following::select"), "Valuation of vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredTextfield=new PageElement(By.xpath("//td//div[@id='Sum Insured']/following::input"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheCurrencyDropdown=new PageElement(By.xpath("//td//div[@id='Name of the Currency']/following::select"), "Name of the Currency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		exchangeRateTextfield=new PageElement(By.xpath("//td//div[@id='Exchange rate']/following::input"), "Exchange rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredInInrTextfield=new PageElement(By.xpath("//td//div[@id='Sum Insured in INR']/following::input"), "Sum Insured in INR", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		qualificationOfMasterTextfield=new PageElement(By.xpath("//td//div[@id='Qualification of Master']/following::input"), "Qualification of Master", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfCrewTextfield=new PageElement(By.xpath("//td//div[@id='Number of Crew']/following::input"), "Number of Crew", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		presentInsurerIfAnyTextarea=new PageElement(By.xpath("//td//div[@id='Present Insurer(If any)']/following::textarea"), "Present Insurer(If any)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDetailopenbutton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		deductibleTextfield=new PageElement(By.xpath("//td//div[@id='deductible']/following::input"), "deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tradingRegionsTextarea=new PageElement(By.xpath("//td//div[@id='Trading Regions']/following::textarea"), "Trading Regions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	
	public void fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity, CustomAssert assertReference) throws InterruptedException{
		if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("add") || polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("edit")){
//wr
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVessel")) {
				selectValueFromList(subTypeOfOceanGoingVesselDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("SubTypeOfOceanGoingVessel"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfInsuredInterest")) {
				selectValueFromList(nameOfInsuredInterestDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfInsuredInterest"));
			}

			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				clearAndSendKeys(nameOfTheVesselTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfTheVessel"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				selectValueFromList(yearOfBuiltDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("YearOfBuilt"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigYearOfRebuilt")) {
				selectValueFromList(yearOfRebuiltDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("YearOfRebuilt"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				clearAndSendKeys(assigneeMortgageeTextarea, polVessTypeMHPolInfmnEntity.getStringValueForField("AssigneeMortgagee"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				clearAndSendKeys(portOfRegistrationAndAuthorityTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("PortOfRegistrationAndAuthority"));
			}
			

		}
		else if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("verify")){
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//WR
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVessel")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("SubTypeOfOceanGoingVessel"), fetchValueFromList(subTypeOfOceanGoingVesselDropdown), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfInsuredInterest")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfInsuredInterest"), fetchValueFromList(nameOfInsuredInterestDropdown), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfTheVessel"), fetchValueFromTextFields(nameOfTheVesselTextfield), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("YearOfBuilt"), fetchValueFromList(yearOfBuiltDropdown), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigYearOfRebuilt")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("YearOfRebuilt"), fetchValueFromList(yearOfRebuiltDropdown), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("AssigneeMortgagee"), fetchValueFromTextFields(assigneeMortgageeTextarea), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("PortOfRegistrationAndAuthority"), fetchValueFromTextFields(portOfRegistrationAndAuthorityTextfield), AssertionType.WARNING);
			}
		}
		
	}
	
	public void fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHP2(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity, CustomAssert assertReference) throws InterruptedException{
		//click(forwardButton);
		if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("add") || polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("edit")){
			//wr
			//P2
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigGrt")) {
				clearAndSendKeys(grtTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("Grt"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigClassForOceanGoingVessel")) {
				selectValueFromList(classForOceanGoingVesselDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("ClassForOceanGoingVessel"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigFlagForOceanGoingVessel")) {
				selectValueFromList(flagForOceanGoingVesselDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("FlagForOceanGoingVessel"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigValuationOfVessel")) {
				selectValueFromList(valuationOfVesselDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("ValuationOfVessel"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("SumInsured"));
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfTheCurrency")) {
				selectValueFromList(nameOfTheCurrencyDropdown, polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfTheCurrency"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigExchangeRate")) {
				clearAndSendKeys(exchangeRateTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("ExchangeRate"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSumInsuredInInr")) {
				clearAndSendKeys(sumInsuredInInrTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("SumInsuredInInr"));
			}
		}
		else if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("verify")){
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigGrt")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("Grt"), fetchValueFromTextFields(grtTextfield), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigClassForOceanGoingVessel")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("ClassForOceanGoingVessel"), fetchValueFromList(classForOceanGoingVesselDropdown), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigFlagForOceanGoingVessel")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("FlagForOceanGoingVessel"), fetchValueFromList(flagForOceanGoingVesselDropdown), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigValuationOfVessel")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("ValuationOfVessel"), fetchValueFromList(valuationOfVesselDropdown), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSumInsured")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextfield), AssertionType.WARNING);
			}
			if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNameOfTheCurrency")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("NameOfTheCurrency"), fetchValueFromList(nameOfTheCurrencyDropdown), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigExchangeRate")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("ExchangeRate"), fetchValueFromTextFields(exchangeRateTextfield), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSumInsuredInInr")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("SumInsuredInInr"), fetchValueFromTextFields(sumInsuredInInrTextfield), AssertionType.WARNING);
			}
		}
		
	}
	
	public void fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHP3(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity, CustomAssert assertReference) throws InterruptedException{
		//click(forwardButton);
		if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("add") || polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("edit")){
			//wr
			//P3
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				clearAndSendKeys(qualificationOfMasterTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("QualificationOfMaster"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				clearAndSendKeys(numberOfCrewTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("NumberOfCrew"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPresentInsurerIfAny")) {
				clearAndSendKeys(presentInsurerIfAnyTextarea, polVessTypeMHPolInfmnEntity.getStringValueForField("PresentInsurerIfAny"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextfield, polVessTypeMHPolInfmnEntity.getStringValueForField("Deductible"));
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigTradingRegions")) {
				clearAndSendKeys(tradingRegionsTextarea, polVessTypeMHPolInfmnEntity.getStringValueForField("TradingRegions"));
			}
		}
		else if(polVessTypeMHPolInfmnEntity.getAction().equalsIgnoreCase("verify")){
			//P3
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("QualificationOfMaster"), fetchValueFromTextFields(qualificationOfMasterTextfield), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("NumberOfCrew"), fetchValueFromTextFields(numberOfCrewTextfield), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPresentInsurerIfAny")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("PresentInsurerIfAny"), fetchValueFromTextFields(presentInsurerIfAnyTextarea), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigDeductible")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextfield), AssertionType.WARNING);
			}
			if(polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigTradingRegions")) {
				
				assertReference.assertEquals(polVessTypeMHPolInfmnEntity.getStringValueForField("TradingRegions"), fetchValueFromTextFields(tradingRegionsTextarea), AssertionType.WARNING);
			}
			
		}
	}

	public void navigateTobackAttributePage(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetailsP2(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigForwardButtonWRP2")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetailsP3(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigForwardButtonWRP3")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle3);
		}
	}
	public void navigateToPolicy(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnSaveButton(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity){
		if (polVessTypeMHPolInfmnEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polVessTypeMHPolInfmnEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(polVessTypeMHPolInfmnEntity, assertReference);
			clickNextButtonPolicyAttributeCSPolicyDetailsP2(polVessTypeMHPolInfmnEntity);
			fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHP2(polVessTypeMHPolInfmnEntity, assertReference);
			clickNextButtonPolicyAttributeCSPolicyDetailsP3(polVessTypeMHPolInfmnEntity);
			fillPolicyInsuredIntrestAttrubuteVesselTypeAndMHP3(polVessTypeMHPolInfmnEntity, assertReference);
			clickNextButtonPolicyAttributeCSPolicyDetailsP3(polVessTypeMHPolInfmnEntity);
			clickOnSaveButton(polVessTypeMHPolInfmnEntity);
			navigateTobackAttributePage(polVessTypeMHPolInfmnEntity);
			navigateToPolicy(polVessTypeMHPolInfmnEntity);
			navigateToAttribute(polVessTypeMHPolInfmnEntity);
			navigateToInsuredInterest(polVessTypeMHPolInfmnEntity);
			navigateToCoverage(polVessTypeMHPolInfmnEntity);
			navigateToLoan(polVessTypeMHPolInfmnEntity);
			navigateToClientDetails(polVessTypeMHPolInfmnEntity);
			navigateToRelation(polVessTypeMHPolInfmnEntity);
			navigateToPayment(polVessTypeMHPolInfmnEntity);
			navigateToFollowup(polVessTypeMHPolInfmnEntity);
			navigateToDocument(polVessTypeMHPolInfmnEntity);
			navigateTobackAttributePage(polVessTypeMHPolInfmnEntity);
			navigateToInsuredInterestAttributes(polVessTypeMHPolInfmnEntity);
			navigateToInsuredInterestAttachCoverages(polVessTypeMHPolInfmnEntity);
			navigateToInsuredInterestRelations(polVessTypeMHPolInfmnEntity);
			navigateToInsuredInterestPayments(polVessTypeMHPolInfmnEntity);
		}
	}
}
