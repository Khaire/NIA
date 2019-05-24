package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntINDRiskDetPUEntity;
import com.aqm.staf.library.databin.PolInsureAttBuyrDetailEntity;
import com.aqm.staf.library.databin.PolInsureAttrGrpNamePAEntity;
import com.aqm.staf.library.databin.PolInsureSpeclCondtnPAEntity;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;

public class PolicyInsuredAttrGroupNamedDetailsPersonalAccident extends BasePage {

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
	private PageElement riskDetailsT1PLRTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (Named)
	private PageElement groupNamedDetails;
	private PageElement groupDetailsOpenButton;
	private PageElement groupDetailsAddButton;
	private PageElement groupDetailsSaveButton;
	private PageElement groupDetailsCloseButton;
	private PageElement groupDetailsDeleteButton;
	private PageElement groupNamedDetailsSerialNoTextField;
	private PageElement groupNamedDetailsNameOfMemberTextField;
	private PageElement groupNamedDetailsEmployeeIdTextField;
	private PageElement groupNamedDetailsAgeTextField;
	private PageElement groupNamedDetailsSexDropDown;
	private PageElement groupNamedDetailsCadreTextField;
	private PageElement groupNamedDetailsSumInsuredTextField;
	private PageElement groupNamedDetailsNumberOfFlightJourneyTextField;

	//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (UnNamed)
	private PageElement groupUnnamedDetails;
	private PageElement groupUnnamedDetailsSerialNoTextField;
	private PageElement groupUnnamedDetailsCadreTextField;
	private PageElement groupUnnamedDetailsNumberOfPersonsPerCadreTextField;
	private PageElement groupUnnamedDetailsSumInsuredPerPersonPerFlightTextField;
	private PageElement groupUnnamedDetailsSumInsuredForCadreTextField;
	
	//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (Individual)
	private PageElement ageofInsuredTextField;
	private PageElement nomineesNameTextField;
	private PageElement nomineesTextField;
	private PageElement nomineesRelationWithInsuredTextField;
	private PageElement detailsOfFlightTextField;
	private PageElement nameOfTheAirlinesTextField;
	private PageElement flightNoTextField;
	private PageElement sumInsuredPerFlightTextField;
	private PageElement totalSumInsuredTextField;
	private PageElement numberOfFlightsTextField;


	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;


	public PolicyInsuredAttrGroupNamedDetailsPersonalAccident(WebDriver driver, String pageName, int rowcount) {
		super (driver, pageName);
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

		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle	 	= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle 	= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "Client Details Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle 		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Relations Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle 		= new PageElement(By.xpath("//div//b//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		riskDetailsT1PLRTitle	= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk details T1-PLR')]"), "Risk details T1-PLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//group named
		groupNamedDetails =new PageElement(By.xpath("//td//div[contains(text(),'Group Named Details')]/following::input"), " Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupDetailsOpenButton =new PageElement(By.xpath("//div[@id='Policy Type for Personal Accident Insurance (Flight Coupon)']/following::input"), " Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupDetailsAddButton=new PageElement(By.name("btnAdd"), " Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupDetailsSaveButton=new PageElement(By.name("btnSave"), " Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupDetailsCloseButton=new PageElement(By.name("btnClose"), " Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupDetailsDeleteButton=new PageElement(By.name("btnDel"), " Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupNamedDetailsNameOfMemberTextField=new PageElement(By.name("Data_227127602072010_"+rowcount+""), "Group Named Details Name Of Member Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsEmployeeIdTextField=new PageElement(By.name("Data_226891402072010_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsAgeTextField=new PageElement(By.name("Data_226891602072010_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsSexDropDown=new PageElement(By.name("Data_738805042001_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsCadreTextField=new PageElement(By.name("Data_226891502072010_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsSumInsuredTextField=new PageElement(By.name("Data_37050905042005_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsNumberOfFlightJourneyTextField=new PageElement(By.name("Data_227128502072010_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//group unnamed
		groupUnnamedDetailsSerialNoTextField=new PageElement(By.name("slNo0"), "Serial No Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupUnnamedDetailsCadreTextField=new PageElement(By.name("Data_226891502072010_"+rowcount+""), "Cadre", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupUnnamedDetailsNumberOfPersonsPerCadreTextField=new PageElement(By.name("Data_227126902072010_"+rowcount+""), " Number Of Persons Per Cadre", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupUnnamedDetailsSumInsuredPerPersonPerFlightTextField=new PageElement(By.name("Data_227127002072010_"+rowcount+""), " Sum Insured Per Person Per Flight", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupUnnamedDetailsSumInsuredForCadreTextField=new PageElement(By.name("Data_227131602072010_0"), "Sum Insured For Cadre TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//numberOfFlightsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Number of Flights')]/following::input"), "Number Of Flights Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Group (Individual)
		ageofInsuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Age of Insured')]/following::input"), "Number Of Flights Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesNameTextField = new PageElement(By.xpath("//td//div[contains(text(),'Nominees Name')]/following::input"), "Nominees Name Text Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesTextField = new PageElement(By.xpath("//td//div[@id='Nominees']/following::input"), "Nominees Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesRelationWithInsuredTextField =new PageElement(By.xpath("//td//div[@id='Nominees Relation with Insured']/following::input"), "Nominees Relation With InsuredText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfFlightsTextField =new PageElement(By.xpath("//td//div[@id='Number of Flights']/following::input"), "Number of Flights Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		detailsOfFlightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Details of flight')]/following::textarea"), "details Of Flight Text Field Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheAirlinesTextField =new PageElement(By.xpath("//td//div[contains(text(),'Name of the airlines')]/following::input"), "Name Of The Airlines Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		flightNoTextField =new PageElement(By.xpath("//td//div[contains(text(),'Flight No')]/following::input"), "Flight No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerFlightTextField =new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured per flight')]/following::input"), "Sum Insured per flight Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField =new PageElement(By.xpath("//td//div[contains(text(),'Total sum insured')]/following::input"), "Total sum insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextButton		=new PageElement(By.name("Next"), " Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	=new PageElement(By.name("btnPrevious"), " previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


	}

	public void fillPolicyTypeForPA(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsureAttrGrpNamePAEntity.getAction().equalsIgnoreCase("add") || polInsureAttrGrpNamePAEntity.getAction().equalsIgnoreCase("edit")){
			//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (Named)
		
			if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetails")){
				fillGroupNamedDetails(polInsureAttrGrpNamePAEntity);
				
			}
			//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (UnNamed)
			if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupUnnamedDetails")){
				fillGroupUnnamedDetails(polInsureAttrGrpNamePAEntity);
				clickOnSaveButtonForUnnamed(polInsureAttrGrpNamePAEntity);
				clickOnCloseButtonForUnnamed(polInsureAttrGrpNamePAEntity);
				if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedNumberOfFlights")){
					clearAndSendKeys(numberOfFlightsTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedNumberOfFlights") );
				}
			}

			//Policy Type for Personal Accident Insurance (Flight Coupon)-Group (Individual)

			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigAgeofInsured")) {
				clearAndSendKeys(ageofInsuredTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("AgeofInsured"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNomineesName")) {
				clearAndSendKeys(nomineesNameTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("NomineesName"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNominees")) {
				clearAndSendKeys(nomineesTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("Nominees"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNomineesRelationWithInsured")) {
				clearAndSendKeys(nomineesRelationWithInsuredTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("NomineesRelationWithInsured"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNumberOfFlights")) {
				clearAndSendKeys(numberOfFlightsTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("NumberOfFlights"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigDetailsOfFlight")) {
				clearAndSendKeys(detailsOfFlightTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("DetailsOfFlight"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNameOfTheAirlines")) {
				clearAndSendKeys(nameOfTheAirlinesTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("NameOfTheAirlines"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigFlightNo")) {
				clearAndSendKeys(flightNoTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("FlightNo"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigSumInsuredPerFlight")) {
				clearAndSendKeys(sumInsuredPerFlightTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("SumInsuredPerFlight"));
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				clearAndSendKeys(totalSumInsuredTextField, polInsureAttrGrpNamePAEntity.getStringValueForField("TotalSumInsured"));
			}
		}
		else if(polInsureAttrGrpNamePAEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetails")){
				verifyGroupNamedDetails(polInsureAttrGrpNamePAEntity, assertReference);
			}
			if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupUnnamedDetails")){
				verifyGroupUnNamedDetails(polInsureAttrGrpNamePAEntity, assertReference);
				clickOnSaveButtonForUnnamed(polInsureAttrGrpNamePAEntity);
				clickOnCloseButtonForUnnamed(polInsureAttrGrpNamePAEntity);
				if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedNumberOfFlights")){
					assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedNumberOfFlights"), fetchValueFromTextFields(numberOfFlightsTextField), AssertionType.WARNING);
				}
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNumberOfFlights")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("NumberOfFlights"), fetchValueFromTextFields(numberOfFlightsTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigAgeofInsured")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("AgeofInsured"), fetchValueFromTextFields(ageofInsuredTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNomineesName")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("NomineesName"), fetchValueFromTextFields(nomineesNameTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNominees")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("Nominees"), fetchValueFromTextFields(nomineesTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNomineesRelationWithInsured")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("NomineesRelationWithInsured"), fetchValueFromTextFields(nomineesRelationWithInsuredTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigDetailsOfFlight")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("DetailsOfFlight"), fetchValueFromTextFields(detailsOfFlightTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigNameOfTheAirlines")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("NameOfTheAirlines"), fetchValueFromTextFields(nameOfTheAirlinesTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigFlightNo")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("FlightNo"), fetchValueFromTextFields(flightNoTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigSumInsuredPerFlight")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("SumInsuredPerFlight"), fetchValueFromTextFields(sumInsuredPerFlightTextField), AssertionType.WARNING);
			}
			if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
		}
	}
	public void verifyGroupNamedDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity, CustomAssert assertReference) {

		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsNameOfMember")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsNameOfMember"), fetchValueFromTextFields(groupNamedDetailsNameOfMemberTextField), AssertionType.WARNING);
		}
		
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsEmployeeId")){
			
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsEmployeeId"), fetchValueFromTextFields(groupNamedDetailsEmployeeIdTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsAge")){
			
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsAge"), fetchValueFromTextFields(groupNamedDetailsAgeTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsSex")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsSex"),fetchValueFromList(groupNamedDetailsSexDropDown), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsCadre")){
			
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsCadre"), fetchValueFromTextFields(groupNamedDetailsCadreTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsSumInsured")){
			
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsSumInsured"), fetchValueFromTextFields(groupNamedDetailsSumInsuredTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsNumberOfFlightJourney")){
			
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsNumberOfFlightJourney"), fetchValueFromTextFields(groupNamedDetailsNumberOfFlightJourneyTextField), AssertionType.WARNING);
		}
		
	}
	public void verifyGroupUnNamedDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity, CustomAssert assertReference) {
	
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSerialNo")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSerialNo"), fetchValueFromTextFields(groupUnnamedDetailsSerialNoTextField), AssertionType.WARNING);
		}

		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsCadre")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsCadre"), fetchValueFromTextFields(groupUnnamedDetailsCadreTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsNumberOfPersonsPerCadre")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsNumberOfPersonsPerCadre"), fetchValueFromTextFields(groupUnnamedDetailsNumberOfPersonsPerCadreTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSumInsuredPerPersonPerFlight")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSumInsuredPerPersonPerFlight"),fetchValueFromTextFields(groupUnnamedDetailsSumInsuredPerPersonPerFlightTextField), AssertionType.WARNING);
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSumInsuredForCadre")){
			assertReference.assertEquals(polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSumInsuredForCadre"), fetchValueFromTextFields(groupUnnamedDetailsSumInsuredForCadreTextField), AssertionType.WARNING);
		}

	}
	

	public void fillGroupNamedDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {
		
		
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsNameOfMember")){
			clearAndSendKeys(groupNamedDetailsNameOfMemberTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsNameOfMember") );
		}
		
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsEmployeeId")){
			clearAndSendKeys(groupNamedDetailsEmployeeIdTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsEmployeeId") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsAge")){
			clearAndSendKeys(groupNamedDetailsAgeTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsAge") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsSex")){
			selectValueFromList(groupNamedDetailsSexDropDown,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsSex") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsCadre")){
			clearAndSendKeys(groupNamedDetailsCadreTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsCadre") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsSumInsured")){
			clearAndSendKeys(groupNamedDetailsSumInsuredTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsSumInsured") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigGroupNamedDetailsNumberOfFlightJourney")){
			clearAndSendKeys(groupNamedDetailsNumberOfFlightJourneyTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("GroupNamedDetailsNumberOfFlightJourney") );
		}

		
	}
	public void fillGroupUnnamedDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) throws InterruptedException {
		
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSerialNo")){
			clearAndSendKeys(groupUnnamedDetailsSerialNoTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSerialNo") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsCadre")){
			clearAndSendKeys(groupUnnamedDetailsCadreTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsCadre") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsNumberOfPersonsPerCadre")){
			clearAndSendKeys(groupUnnamedDetailsNumberOfPersonsPerCadreTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsNumberOfPersonsPerCadre") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSumInsuredPerPersonPerFlight")){
			clearAndSendKeys(groupUnnamedDetailsSumInsuredPerPersonPerFlightTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSumInsuredPerPersonPerFlight") );
		}
		if(polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigUnnamedDetailsSumInsuredForCadre")){
			clearAndSendKeys(groupUnnamedDetailsSumInsuredForCadreTextField,polInsureAttrGrpNamePAEntity.getStringValueForField("UnnamedDetailsSumInsuredForCadre") );
		}
		click(groupUnnamedDetailsSumInsuredForCadreTextField);
		click(groupUnnamedDetailsSumInsuredForCadreTextField);
	}


	public void clickOnOpenButton(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) throws InterruptedException {
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigOpenButton")) {
			click(groupDetailsOpenButton);
			switchToWindow("Group Named Details' Details");
			clickOnAddButton(polInsureAttrGrpNamePAEntity);
		
			

		}
	}
	public void clickOnSaveButton(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigSaveButton")) {			
			click(groupDetailsSaveButton);		
			
			return;		
		}			
	}
	public void clickOnSaveButtonForUnnamed(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigSaveButtonUnnamed")) {			
			click(groupUnnamedDetailsSumInsuredForCadreTextField);
			click(groupDetailsSaveButton);		
			
			return;		
		}			
	}
	public void clickOnCloseButtonForUnnamed(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) throws InterruptedException {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigCloseButtonUnnamed")) {			
			click(groupDetailsCloseButton);			
		}	
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}
	public void clickOnAddButton(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigAddButton")) {			
			click(groupDetailsAddButton);		
			return;		
		}			
	}	
	public void clickOnDeleteButton(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigDeleteButton")) {			
			click(groupDetailsDeleteButton);		
			switchToFrame("display");	
			return;		
		}			
	}
	public void clickOnCloseButton(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) throws InterruptedException {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigCloseButton")) {			
			click(groupDetailsCloseButton);			
		}	
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}

	public void nextToInsuredAttribute(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigForwordButton")) {			
			click(nextButton);		
				
			return;		
		}			
	}	
	public void previousToRiskDetailsT1PLR(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigPreviousButton")) {			
			click(previousButton);		
				
		
			return;		
		}			
	}
	public void backToInsuredInterestAttributes(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity) {					
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigBackButton")) {			
			click(backButton);		
			switchToFrame("display");		
			if(isElementDisplayed(insuredInterestAttributesTitle));		
			return;		
		}			
	}		


	public void navigateToPolicy(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);		
			switchToFrame("display");		
			isElementDisplayed(policyTabTitle);		
		}			
	}				
	public void navigateToAttribute(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}				
	public void navigateToInsuredInterest(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestTabTitle);		
		}			
	}				
	public void navigateToCoverage(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);		
			switchToFrame("display");		
			isElementDisplayed(coverageTabTitle);		
		}			
	}				

	public void navigateToLoan(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);		
			//		switchToFrame("display");
		}			
	}				

	public void navigateToClientDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(clientDetailsTabTitle);		
		}			

	}				
	public void navigateToRelation(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);		
			switchToFrame("display");		
			isElementDisplayed(relationsTabTitle);		
		}											
	}				
	public void navigateToPayment(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(paymentsTabTitle);		
		}			
	}				
	public void navigateToFollowup(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);		
			switchToFrame("display");		
			isElementDisplayed(followupTabTitle);		
		}			
	}				
	public void navigateToDocument(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);		
			switchToFrame("display");		
			isElementDisplayed(documentTabTitle);		
		}			
	}				
	public void navigateToInsuredInterestDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestDetailsTitle);		
		}			
	}				
	public void navigateToInsuredInterestAttributes(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestAttributesTitle);		
		}			
	}				
	public void navigateToInsuredInterestAttachCoverages(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestCoverageTitle);		
		}			
	}				
	public void navigateToInsuredInterestRelations(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestRelationsTitle);		
		}			
	}				
	public void navigateToInsuredInterestPayments(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestPaymentListTitle);		
		}			
	}				
	public void navigateToInsuredInterestScheduleTab(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity){				
		if (polInsureAttrGrpNamePAEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestScheduleDetailsTitle);		
		}			
	}				


	public void fillandSubmitGroupNamedDetails(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntity, CustomAssert assertReference) throws InterruptedException {				
		if(isConfigTrue(polInsureAttrGrpNamePAEntity.getConfigExecute())){			
			switchToFrame("display");	
			clickOnOpenButton(polInsureAttrGrpNamePAEntity);	
			fillPolicyTypeForPA(polInsureAttrGrpNamePAEntity,assertReference);
			clickOnSaveButton(polInsureAttrGrpNamePAEntity);
			clickOnCloseButton(polInsureAttrGrpNamePAEntity);
			nextToInsuredAttribute(polInsureAttrGrpNamePAEntity);
			previousToRiskDetailsT1PLR(polInsureAttrGrpNamePAEntity);
			backToInsuredInterestAttributes(polInsureAttrGrpNamePAEntity);				
			navigateToPolicy(polInsureAttrGrpNamePAEntity);		
			navigateToAttribute(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterest(polInsureAttrGrpNamePAEntity);		
			navigateToCoverage(polInsureAttrGrpNamePAEntity);		
			navigateToLoan(polInsureAttrGrpNamePAEntity);		
			navigateToClientDetails(polInsureAttrGrpNamePAEntity);		
			navigateToRelation(polInsureAttrGrpNamePAEntity);		
			navigateToPayment(polInsureAttrGrpNamePAEntity);		
			navigateToFollowup(polInsureAttrGrpNamePAEntity);		
			navigateToDocument(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestDetails(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestAttributes(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestAttachCoverages(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestRelations(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestPayments(polInsureAttrGrpNamePAEntity);		
			navigateToInsuredInterestScheduleTab(polInsureAttrGrpNamePAEntity);		

		}
	}
}


