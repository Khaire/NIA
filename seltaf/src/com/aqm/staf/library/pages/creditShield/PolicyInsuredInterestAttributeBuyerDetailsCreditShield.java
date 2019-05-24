package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsureAttBuyrDetailEntity;
import com.aqm.staf.library.databin.PolicyAttrQuotDetailEntity;

public class PolicyInsuredInterestAttributeBuyerDetailsCreditShield extends BasePage {

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

	private PageElement buyerDetailsTitle;
	private PageElement policyInsuredInterestDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;
	private PageElement policyInsuredInterestScheduleDetailsTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement buyerCodeTextField;
	private PageElement buyerNameTextField;
	private PageElement typeOfBusinessDropDown;
	private PageElement locationAddressTextField;
	private PageElement statusOfTheCreditLimitDropDown;
	private PageElement creditLimitRequestedTextField;
	private PageElement creditLimitApprovedTextField;
	private PageElement validityLimitFromDateTextField;
	private PageElement validityLimitToDateTextField;
	private PageElement conditionsForPermanentLimitTextField;
	private PageElement temporaryCreditLimitApprovedOneTextField;
	private PageElement temporaryValidityLimitFromDateOneTextField;
	private PageElement temporaryValidityLimitToDateOneTextField;
	private PageElement temporaryCreditLimitApprovedTwoTextField;
	private PageElement temporaryValidityLimitFromDateTwoTextField;
	private PageElement temporaryValidityLimitToDateTwoTextField;
	private PageElement temporaryCreditLimitApprovedThreeTextField;
	private PageElement temporaryValidityLimitFromDateThreeTextField;
	private PageElement temporaryValidityLimitToDateThreeTextField;
	private PageElement temporaryCreditLimitApprovedFourTextField;
	private PageElement temporaryValidityLimitFromDateFourTextField;
	private PageElement temporaryValidityLimitToDateFourTextField;
	private PageElement temporaryCreditLimitApprovedFiveTextField;
	private PageElement temporaryValidityLimitFromDateFiveTextField;
	private PageElement temporaryValidityLimitToDateFiveTextField;
	private PageElement conditionsForTemporaryLimitTextField;
	private PageElement  backButton;
	private PageElement  saveButton;
	private PageElement  forwordButton;
	
	public PolicyInsuredInterestAttributeBuyerDetailsCreditShield(WebDriver driver, String pageName) {
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

		//buyerDetailsTitle					= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Buyer Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestDetailsTitle	= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Details')]"), "Policy Insured Interest Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle		= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle		= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestScheduleDetailsTitle= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Schedule Details')]"), "Policy Insured Interest Schedule Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		buyerCodeTextField = new PageElement(By.xpath("//td//div[@id='Buyer code']/following::input"), "Buyer Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		buyerNameTextField = new PageElement(By.xpath("//td//div[@id='Buyer Name']/following::input"), "Buyer Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfBusinessDropDown = new PageElement(By.xpath("//td//div[@id='Type of Business']/following::select "), "Type Of Business Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationAddressTextField = new PageElement(By.xpath("//td//div[@id='Location Address']/following::input"), "Location Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusOfTheCreditLimitDropDown = new PageElement(By.xpath("//td//div[@id='Status of the Credit Limit']/following::select"), "Status Of The Credit Limit Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		creditLimitRequestedTextField = new PageElement(By.xpath("//td//div[@id='Credit limit requested']/following::input"), "Credit Limit Requested Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		creditLimitApprovedTextField = new PageElement(By.xpath("//td//div[@id='Credit limit Approved']/following::input"), "Credit Limit Approved Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		validityLimitFromDateTextField = new PageElement(By.xpath("//td//div[@id='Validity limit FROM date']/following::input"), "Validity Limit From Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		validityLimitToDateTextField = new PageElement(By.xpath("//td//div[@id='Validity limit TO date']/following::input"), "Validity Limit To Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		conditionsForPermanentLimitTextField = new PageElement(By.xpath("//td//div[@id='Conditions for Permanent Limit']/following::textarea"), "Conditions For Permanent Limit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryCreditLimitApprovedOneTextField = new PageElement(By.xpath("//td//div[@id='Temporary Credit limit approved1']/following::input"), "Temporary Credit Limit Approved One Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitFromDateOneTextField  =new PageElement(By.xpath("//td//div[@id='Temporary validity limit FROM date1']/following::input"), "Temporary Validity Limit From Date One Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitToDateOneTextField =new PageElement(By.xpath("//td//div[@id='Temporary validity limit TO date1']/following::input"), "Temporary Validity Limit To Date One Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryCreditLimitApprovedTwoTextField =new PageElement(By.xpath("//td//div[@id='Temporary Credit limit approved2']/following::input"), "Temporary Credit Limit Approved Two Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitFromDateTwoTextField =new PageElement(By.xpath("//td//div[@id='Temporary validity limit FROM date2']/following::input"), "Temporary Validity Limit From Date Two Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitToDateTwoTextField =new PageElement(By.xpath("//td//div[@id='Temporary validity limit TO date2']/following::input"), "Temporary Validity Limit To Date Two Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryCreditLimitApprovedThreeTextField =new PageElement(By.xpath("//td//div[@id='Temporary Credit limit approved3']/following::input"), "Temporary Credit Limit Approved Three Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitFromDateThreeTextField =new PageElement(By.xpath("//td//div[@id='Temporary validity limit FROM date3']/following::input"), "Temporary Validity Limit From Date Three Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitToDateThreeTextField = new PageElement(By.xpath("//td//div[@id='Temporary validity limit TO date3']/following::input"), "Temporary Validity Limit To Date Three Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryCreditLimitApprovedFourTextField=new PageElement(By.xpath("//td//div[@id='Temporary Credit limit approved4']/following::input"), "Temporary Credit Limit Approved Four Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitFromDateFourTextField=new PageElement(By.xpath("//td//div[@id='Temporary validity limit FROM date4']/following::input"), "Temporary Validity Limit From Date Four Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitToDateFourTextField=new PageElement(By.xpath("//td//div[@id='Temporary validity limit TO date4']/following::input"), "Temporary Validity Limit To Date Four Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryCreditLimitApprovedFiveTextField=new PageElement(By.xpath("//td//div[@id='Temporary Credit limit approved5']/following::input"), "Temporary Credit Limit Approved Five Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitFromDateFiveTextField=new PageElement(By.xpath("//td//div[@id='Temporary validity limit FROM date5']/following::input"), "Temporary Validity Limit From Date Five Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		temporaryValidityLimitToDateFiveTextField=new PageElement(By.xpath("//td//div[@id='Temporary validity limit TO date5']/following::input"), "Temporary Validity Limit To Date Five Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		conditionsForTemporaryLimitTextField=new PageElement(By.xpath("//td//div[@id='Conditions for Temporary Limit']/following::textarea"), "Conditions For Temporary Limit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton		=new PageElement(By.name("btnSave"), " Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton	=new PageElement(By.name("Next"), " Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}	
	public void fillBuyerDetails(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity, CustomAssert assertReference){
		if(polInsureAttBuyrDetailEntity.getAction().equalsIgnoreCase("add") || polInsureAttBuyrDetailEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigBuyerCode")) {
				clearAndSendKeys(buyerCodeTextField, polInsureAttBuyrDetailEntity.getStringValueForField("BuyerCode"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigBuyerName")) {
				clearAndSendKeys(buyerNameTextField, polInsureAttBuyrDetailEntity.getStringValueForField("BuyerName"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTypeOfBusiness")) {
				clearAndSendKeys(typeOfBusinessDropDown, polInsureAttBuyrDetailEntity.getStringValueForField("TypeOfBusiness"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigLocationAddress")) {
				clearAndSendKeys(locationAddressTextField, polInsureAttBuyrDetailEntity.getStringValueForField("LocationAddress"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigStatusOfTheCreditLimit")) {
				clearAndSendKeys(statusOfTheCreditLimitDropDown, polInsureAttBuyrDetailEntity.getStringValueForField("StatusOfTheCreditLimit"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigCreditLimitRequested")) {
				clearAndSendKeys(creditLimitRequestedTextField, polInsureAttBuyrDetailEntity.getStringValueForField("CreditLimitRequested"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigCreditLimitApproved")) {
				clearAndSendKeys(creditLimitApprovedTextField, polInsureAttBuyrDetailEntity.getStringValueForField("CreditLimitApproved"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigValidityLimitFromDate")) {
				String ValidityLimitFromDate=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("ValidityLimitFromDate"));
				clearAndEnterDate(validityLimitFromDateTextField, ValidityLimitFromDate);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigValidityLimitToDate")) {
				String ValidityLimitToDate=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("ValidityLimitToDate"));
				clearAndEnterDate(validityLimitToDateTextField, ValidityLimitToDate);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigConditionsForPermanentLimit")) {
				clearAndSendKeys(conditionsForPermanentLimitTextField, polInsureAttBuyrDetailEntity.getStringValueForField("ConditionsForPermanentLimit"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedOne")) {
				clearAndSendKeys(temporaryCreditLimitApprovedOneTextField, polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedOne"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateOne")) {
				String TemporaryValidityLimitFromDateOne=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateOne"));
				clearAndEnterDate(temporaryValidityLimitFromDateOneTextField, TemporaryValidityLimitFromDateOne);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateOne")) {
				String TemporaryValidityLimitToDateOne=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateOne"));
				clearAndEnterDate(temporaryValidityLimitToDateOneTextField, TemporaryValidityLimitToDateOne);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedTwo")) {
				clearAndSendKeys(temporaryCreditLimitApprovedTwoTextField, polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedTwo"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateTwo")) {
				String TemporaryValidityLimitFromDateTwo=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateTwo"));
				clearAndEnterDate(temporaryValidityLimitFromDateTwoTextField, TemporaryValidityLimitFromDateTwo);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateTwo")) {
				String TemporaryValidityLimitToDateTwo=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateTwo"));
				clearAndEnterDate(temporaryValidityLimitToDateTwoTextField, TemporaryValidityLimitToDateTwo);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedThree")) {
				clearAndSendKeys(temporaryCreditLimitApprovedThreeTextField, polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedThree"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateThree")) {
				
				String TemporaryValidityLimitFromDateThree=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateThree"));
				clearAndEnterDate(temporaryValidityLimitFromDateThreeTextField, TemporaryValidityLimitFromDateThree);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateThree")) {
				
				String TemporaryValidityLimitToDateThree=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateThree"));
				clearAndEnterDate(temporaryValidityLimitToDateThreeTextField, TemporaryValidityLimitToDateThree);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedFour")) {
				clearAndSendKeys(temporaryCreditLimitApprovedFourTextField, polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedFour"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateFour")) {
				
				String TemporaryValidityLimitFromDateFour=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateFour"));
				clearAndEnterDate(temporaryValidityLimitFromDateFourTextField, TemporaryValidityLimitFromDateFour);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateFour")) {
				String TemporaryValidityLimitToDateFour=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateFour"));
				clearAndEnterDate(temporaryValidityLimitToDateFourTextField, TemporaryValidityLimitToDateFour);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedFive")) {
				clearAndSendKeys(temporaryCreditLimitApprovedFiveTextField, polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedFive"));
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateFive")) {
				String TemporaryValidityLimitFromDateFive=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateFive"));
				clearAndEnterDate(temporaryValidityLimitFromDateFiveTextField, TemporaryValidityLimitFromDateFive);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateFive")) {
				String TemporaryValidityLimitToDateFive=RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateFive"));
				clearAndEnterDate(temporaryValidityLimitToDateFiveTextField, TemporaryValidityLimitToDateFive);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigConditionsForTemporaryLimit")) {
				clearAndSendKeys(conditionsForTemporaryLimitTextField, polInsureAttBuyrDetailEntity.getStringValueForField("ConditionsForTemporaryLimit"));
			}

		}
		else if(polInsureAttBuyrDetailEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigBuyerCode")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("BuyerCode"), fetchValueFromTextFields(buyerCodeTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigBuyerName")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("BuyerName"), fetchValueFromTextFields(buyerNameTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTypeOfBusiness")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TypeOfBusiness"), fetchValueFromTextFields(typeOfBusinessDropDown), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigLocationAddress")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("LocationAddress"), fetchValueFromTextFields(locationAddressTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigStatusOfTheCreditLimit")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("StatusOfTheCreditLimit"), fetchValueFromTextFields(statusOfTheCreditLimitDropDown), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigCreditLimitRequested")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("CreditLimitRequested"), fetchValueFromTextFields(creditLimitRequestedTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigCreditLimitApproved")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("CreditLimitApproved"), fetchValueFromTextFields(creditLimitApprovedTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigValidityLimitFromDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("ValidityLimitFromDate")), fetchValueFromTextFields(validityLimitFromDateTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigValidityLimitToDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("ValidityLimitToDate")), fetchValueFromTextFields(validityLimitToDateTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigConditionsForPermanentLimit")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("ConditionsForPermanentLimit"), fetchValueFromTextFields(conditionsForPermanentLimitTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedOne")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedOne"), fetchValueFromTextFields(temporaryCreditLimitApprovedOneTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateOne")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateOne")), fetchValueFromTextFields(temporaryValidityLimitFromDateOneTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateOne")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateOne")), fetchValueFromTextFields(temporaryValidityLimitToDateOneTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedTwo")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedTwo"), fetchValueFromTextFields(temporaryCreditLimitApprovedTwoTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateTwo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateTwo")), fetchValueFromTextFields(temporaryValidityLimitFromDateTwoTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateTwo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateTwo")), fetchValueFromTextFields(temporaryValidityLimitToDateTwoTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedThree")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedThree"), fetchValueFromTextFields(temporaryCreditLimitApprovedThreeTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateThree")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateThree")), fetchValueFromTextFields(temporaryValidityLimitFromDateThreeTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateThree")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateThree")), fetchValueFromTextFields(temporaryValidityLimitToDateThreeTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedFour")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedFour"), fetchValueFromTextFields(temporaryCreditLimitApprovedFourTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateFour")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateFour")), fetchValueFromTextFields(temporaryValidityLimitFromDateFourTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateFour")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateFour")), fetchValueFromTextFields(temporaryValidityLimitToDateFourTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryCreditLimitApprovedFive")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryCreditLimitApprovedFive"), fetchValueFromTextFields(temporaryCreditLimitApprovedFiveTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDateFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitFromDateFive")), fetchValueFromTextFields(temporaryValidityLimitFromDateFiveTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDateFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsureAttBuyrDetailEntity.getStringValueForField("TemporaryValidityLimitToDateFive")), fetchValueFromTextFields(temporaryValidityLimitToDateFiveTextField), AssertionType.WARNING);
			}
			if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigConditionsForTemporaryLimit")) {
				assertReference.assertEquals(polInsureAttBuyrDetailEntity.getStringValueForField("ConditionsForTemporaryLimit"), fetchValueFromTextFields(conditionsForTemporaryLimitTextField), AssertionType.WARNING);
			}

		}
	}

	public void backToInsuredInterestAttributes(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity) {
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestAttributesTitle));
			return;
		}
	}
	public void saveBuyerDetails(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity) {
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToNextPage(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity) {
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigForwordButton")) {
			click(forwordButton);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToPolicy(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestDetailsTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentListTitle);
		}
	}
	public void navigateToInsuredInterestScheduleTab(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity){
		if (polInsureAttBuyrDetailEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestScheduleDetailsTitle);
		}
	}


	public void fillandSubmitPolicyAttrQuotDetail(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntity, CustomAssert assertReference) {
		if(isConfigTrue(polInsureAttBuyrDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillBuyerDetails(polInsureAttBuyrDetailEntity,assertReference);
			navigateToNextPage(polInsureAttBuyrDetailEntity);
			saveBuyerDetails(polInsureAttBuyrDetailEntity);
			navigateToPolicy(polInsureAttBuyrDetailEntity);
			navigateToAttribute(polInsureAttBuyrDetailEntity);
			navigateToInsuredInterest(polInsureAttBuyrDetailEntity);
			navigateToCoverage(polInsureAttBuyrDetailEntity);	
			navigateToLoan(polInsureAttBuyrDetailEntity);
			navigateToClientDetails(polInsureAttBuyrDetailEntity);	
			navigateToRelation(polInsureAttBuyrDetailEntity);	
			navigateToPayment(polInsureAttBuyrDetailEntity);	
			navigateToFollowup(polInsureAttBuyrDetailEntity);
			navigateToDocument(polInsureAttBuyrDetailEntity);	
			navigateToInsuredInterestDetails(polInsureAttBuyrDetailEntity);	
			navigateToInsuredInterestAttributes(polInsureAttBuyrDetailEntity);
			navigateToInsuredInterestAttachCoverages(polInsureAttBuyrDetailEntity);	
			navigateToInsuredInterestRelations(polInsureAttBuyrDetailEntity);	
			navigateToInsuredInterestPayments(polInsureAttBuyrDetailEntity);
			navigateToInsuredInterestScheduleTab(polInsureAttBuyrDetailEntity);

		}

	}
}