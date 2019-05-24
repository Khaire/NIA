package com.aqm.staf.library.pages.health;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PreviousPolicyHistoryEntity;
import com.aqm.staf.library.pages.common.PolicySearchPage;


public class PolicyAttributeHealth extends BasePage {

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
	private PageElement whetherYouHadPrevPolicyDropDown;
	private PageElement companyNameOfThePreviousInsuranceCompanyTextField;
	private PageElement currentPolicyNumberTextField;
	private PageElement expiryDateOfLastPolicyTextField;	
	private PageElement sumInsuredTextField;	
	private PageElement dateOfFirstPolicyTextField;	
	private PageElement howManyYearUCoveredUnderPastHealthPolicyTextField;	
	private PageElement claimReceivedAndReportedAmountTextField;	
	private PageElement foreignEmbassyDropDown;	
	private PageElement foreignEmbassyCountryDetailsTextField;	
	private PageElement premiumInForexDropDown;	
	private PageElement premiumInForexEmbassyDetailsTextField;	
	private PageElement staffDiscountDropDown;	
	private PageElement employeeTypeDropDown;	
	private PageElement srNoTextField;	
	private PageElement companyNameOfStaffMemberDropDown;
	private PageElement physicianNameTextField;	
	private PageElement physicianAddressTextField;	
	private PageElement assigneenameTextField;	
	private PageElement relationshipWithAssigneeDropDown;	
	private PageElement opportunityIDTextField;	
	private PageElement isServiceTaxExemptedDropDown;
	private PageElement categoryTypeDropDown;
	//cx
	private PageElement memberShipTypeDropDown;	
	private PageElement memberShipNoTextField;
	private PageElement memberShipDateTextField;
	private PageElement memberShipDateFindButton;

	private PageElement previousPolicyNumberTextBox;
	private PageElement previousPolicyPeriodTextBox;
	private PageElement preMedicalCheckUpDetailsTextBox;

	//FM
	private PageElement policyAttributeFMTitle;	
	private PageElement newPremiumRateApplicableFMDropdown;
	private PageElement zoneForNewFamilyFloaterFMDropdown;
	private PageElement relationshipWithAsigneeFMDropdown;

	private PageElement forwordButton;
	private PageElement backButton;
	private PageElement proceedButton;

	private PageElement attributeHealthTabTitle;
	//CG-@Rasika
	private PageElement policyAttributesCGT1POLTitlePage;

	//GT-@Rasika
	private PageElement previousPolicyDetailsTitlePage;
	private PageElement totalNoOfPersonsCoveredTextField;
	private PageElement specialEconomyZoneForGMSCDropDown;
	private PageElement coInsuranceApplicableDropdownGT;

	//BH-@Rasika
	private PageElement policyDetails_BH_ESPageTitle;

	//PZ-@Rasika
	private PageElement insuredInterestTab;
	private PageElement policyDataPZT1POLTitle ;
	private PageElement undertakingFromTheEmployerReceivedDropdown;
	private PageElement	policyTypeForPZDropdown;
	private PageElement premiumToBeChargedOnPerDayBasisOrBandWiseDropdown;
	private PageElement totalNoOfEmployeesTextField;
	private PageElement estimatedTotalNoOfDaysOfForeignTripByAllEmployeesAtPolicyPeriodTextField;
	private PageElement expectedNumberOfTripsDuringThePolicyPeriodTextField;
	private PageElement averageDurationOfTripsInDaysTextField;
	private PageElement maximumAgeOfTheEmployeeTravellingTextField;
	private PageElement whetherYouHadACFTPolicyInThePastDropdown;


	//SC// @ akshata
	private PageElement policyAttributesSCTitle;
	private PageElement zoneForHealthTextField;
	private PageElement voluntaryExcessforSCDropDown;
	//TF 
	private PageElement previousPolicyDetailsTitle;
	private PageElement zoneForHealthDropdown;
	private PageElement coInsuranceApplicableDropdown;


	private PageElement isTPARequiredDropdown;
	private PageElement isHOApprovalObtainedDropdown;
	private PageElement hoApprovalDetailsTextField;
	//SP
	private PageElement previousPolicyDetailsSPTitle;
	//UH
	private PageElement policyDetailsUHTitle;

	//GH Abhijit
	private PageElement previousPolicyDataPageTitle;
	private PageElement goodHealthDropdown;
	private PageElement schemeYearTextField;

	//GM Abhijit
	private PageElement maternityExtensionRequiredDropdown;
	// TI kamlesh
	private PageElement whethertheAddonfortheCostofexpensestothefamilymembersrequiredDropDown;
	// JM kamlesh
	private PageElement policyAttributeClaimFreeYearsTitle;
	// MC Priyanka
	private PageElement newPremiumRateApplicableDropDown;
	private PageElement zoneForNewMediclaimDropDown;
	private PageElement loyaltyDiscountDropDown;

	//Misc Liability - Rasika

	private PageElement motorPolicyNumberTextField;
	private PageElement nameOfTheInsurerTextField;
	private PageElement motorPolicyFromDateTextField;
	private PageElement motorPolicyToDateTextField;
	private PageElement motorPolicyFromDateFindButton;
	private PageElement motorPolicyToDateFindButton;
	//Misc Liability - nilesh

	private PageElement miscellaneousProductTypeDropDown;

	//RS
	private PageElement specialSchemeTypeDropDown;	
	private PageElement coInsuranceApplicableDropDown;
	private PageElement numberofPersonsCoveredinRSTextField;
	private PageElement numberofFamilyCoveredTextField;

	private PageElement totalNumberOfPersonsCoveredTextField;
	private PageElement typeOfHealthPolicyDropDown;
	private PageElement masterPolicyNoTextField;
	private PageElement stateNameTextField;
	private PageElement districtNameTextField;

	private PageElement nomineeNameTextField;
	private PageElement relationShipWithTheNomineeTextArea;
	private PageElement SumInsuredforPremierMediclaimDropDown;
	private PageElement relationshipWithTheNomineeTextAreaForTU;
	private PageElement relationshipWithTheNomineeTextFeildForUK;
	private PageElement optionalCoverINoProportionateDeductionDropDown;
	private PageElement optionalCoverIIINoRevisionInCataractLimitDropDown;
	private PageElement optionalCoverIVVoluntaryCoPayDropDown;

	private PageElement RelationshipwiththeNomineeICDropDown;
	private PageElement MembershipIdICTextFeild;
	private PageElement MasterPolicyNumberICTextFeild;
	private PageElement certificateOwnerICDropDown;
	private PageElement OtherinformationifanyTextFeild;
	private PageElement ClaimReceivedandReportedAmountICTextFeild;
	private PageElement typeOfPolicyDropDown;
	private PageElement relationshipoftheNomineeInputHN;
	private PageElement dateofinceptionofOptionalCoverIIITextField;
	private PageElement premierMediclaimPlanTypeDropDown;
        private PageElement closeButton;
	
	public PolicyAttributeHealth(WebDriver driver, String pageName) {
		super(driver, pageName);
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
		stateNameTextField=new PageElement(By.xpath("//*[@id=\"2\"]/td[2]/div/input"), "State", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		districtNameTextField=new PageElement(By.xpath("//*[@id=\"3\"]/td[2]/div/input"), "District", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberShipDateFindButton = new PageElement(By.xpath("//td//div[contains(text(),'Membership Date')]/following::input/following::a[@name='firstFocus']"), "Membership Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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
		/***************************** JM Start**********************************************/		
		whetherYouHadPrevPolicyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A Health Policy in the Past","select")), "Select Whether You Had A Health Policy in the Past", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		companyNameOfThePreviousInsuranceCompanyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company name of the previous insurance company", "input")), "Company name of the previous insurance company", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currentPolicyNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Current Policy Number", "input")), "CurrentPolicyNumber", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expiryDateOfLastPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiry Date of the Last Policy", "input")), "Enter Company name of the previous insurance company", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Enter the Sum Insured Previous policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfFirstPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of First Policy", "input")), "How many years you are covered under the Health policy in the Past Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReceivedAndReportedAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Received and Reported Amount", "input")), "Date Of First policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		howManyYearUCoveredUnderPastHealthPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("How many years you are covered under the Health policy in the Past", "input")), "How many years you are covered under the Health policy in the Past Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReceivedAndReportedAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Received and Reported Amount", "input")), "Claim Received and Reported Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		foreignEmbassyDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Foreign Embassy", "select")), "Foreign Embassy Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		foreignEmbassyCountryDetailsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Foreign Embassy Detail (Country)", "textarea")), "Foreign Embassy Detail (Country) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumInForexDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium in Forex", "select")), "Premium in Forex Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumInForexEmbassyDetailsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium in Forex (Embassy details)", "textarea")), "Premium in Forex (Embassy details) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		staffDiscountDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Staff Discount", "select")), "Staff Discount Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		employeeTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employee type", "select")), "Employee Type Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		srNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SR No.", "input")), "Sr Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyNameOfStaffMemberDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company Name of Staff Member", "select")), "Company Name of Staff Member Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		physicianNameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Name", "input")), " Physician Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianAddressTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Address", "textarea")), "Physician Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assigneenameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominee name", "textarea")), "Nominee name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithAssigneeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Nominee", "select")), "Premium in Forex Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIDTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Opportunity Id", "input")), "Opportunity Id Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		categoryTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Category Type", "select")), "Category Type Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyAttributeClaimFreeYearsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Four Claim Free Years')]"), "Policy Attribute Four Claim Free Years Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/***************************** JM End**********************************************/

		/******************************CX *************************************************/
		memberShipTypeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership Type","select")), "select Membership Type ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		memberShipNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership No.", "input")), "Enter Membership No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberShipDateTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership Date", "input")), "Enter Membership Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*****************************CX END************************************************/
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		previousPolicyNumberTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Previous Policy Number')]/following::td"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Previous Policy Period')]/following::td"), "Previous Policy Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preMedicalCheckUpDetailsTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Pre Medical Check Up Details')]/following::textarea"), "Pre Medical Check Up Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*****************************FM Start Abhijit************************************************/

		policyAttributeFMTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes FM')]"), "Policy Attributes FM Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newPremiumRateApplicableFMDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("New Premium Rate Applicable","select")), "Select New Premium Rate Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		zoneForNewFamilyFloaterFMDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone for New Family Floater","select")), "Select Zone for New Family Floater", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationshipWithAsigneeFMDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Assignee","select")), "Select Relationship with the Assignee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		//CG-@Rasika
		policyAttributesCGT1POLTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes CG T1-POL')]"), "Policy Attributes CG T1-POL Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//GT-@Rasika
		previousPolicyDetailsTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Previous Policy Details')]"), "Previous Policy Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoOfPersonsCoveredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Number of persons covered","input")), "Total Number of persons covered Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialEconomyZoneForGMSCDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Economy Zone for SGMC","select")), "Special Economy Zone for SGMC Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropdownGT= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable","select")), "Co-Insurance Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BH-@Rasika
		policyDetails_BH_ESPageTitle = new PageElement(By.xpath("//div//b[contains(text(),' Policy Details_BH_ES')]"), "Policy Details_BH_ES Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PZ-@Rasika
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),"Insured Interest Tab",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyDataPZT1POLTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Data PZ T1-POL ')]"),"PolicyDataPZT1POLTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		undertakingFromTheEmployerReceivedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Undertaking from the employer received","select")),"Undertaking from the employer received Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		policyTypeForPZDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type for PZ","select")),"Policy Type for PZ Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumToBeChargedOnPerDayBasisOrBandWiseDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium to be charged on per day basis or band wise","select")),"Premium to be charged on per day basis or band wise Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalNoOfEmployeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total No. Of employees","input")),"Total No. Of employees TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		estimatedTotalNoOfDaysOfForeignTripByAllEmployeesAtPolicyPeriodTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Total no. of days of foreign trip by all employees at policy period","input")),"Estimated Total no. of days of foreign trip by all employees at policy period",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expectedNumberOfTripsDuringThePolicyPeriodTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expected number of Trips during the policy period","input")),"Expected number of Trips during the policy period TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		averageDurationOfTripsInDaysTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Average duration of trips in days","input")),"Average duration of trips in days TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maximumAgeOfTheEmployeeTravellingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Maximum Age of the Employee travelling","input")),"Maximum Age of the Employee travelling TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		whetherYouHadACFTPolicyInThePastDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A CFT Policy in the Past","select")),"Whether You Had A CFT Policy in the Past DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		/*********************************SC**********************************/
		policyAttributesSCTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes SC')]"), "Policy Attributes SC Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		voluntaryExcessforSCDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Voluntary Excess for SC","select")), "Select Voluntary Excess for SC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		/************************************** TF ***************************/
		previousPolicyDetailsTitle=new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy Details')]"),"Previous Policy Details Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		zoneForHealthDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone For Health","select")),"Zone For Health Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		coInsuranceApplicableDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable","select")),"Co-Insurance Applicable Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isTPARequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is TPA Required","select")),"IsTPARequiredDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isHOApprovalObtainedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is HO Approval Obtained","select")),"Is HO Approval Obtained Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hoApprovalDetailsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HO Approval Details","input")),"HO Approval Details Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isServiceTaxExemptedDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Service Tax Exempted", "select")), "Is Service Tax Exempted DropDown ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		/*********************************SP*************************************/
		previousPolicyDetailsSPTitle=new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy Details')]"),"previousPolicyDetailsTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		/******************************** UH ********************************/
		policyDetailsUHTitle=new PageElement(By.xpath("//div/b[contains(text(),'Policy DetailsUH')]"),"previousPolicyDetailsTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//GH Abhijit
		previousPolicyDataPageTitle=new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy Data')]"), "Previous Policy Data Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodHealthDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Good Health Month", "select")), "Select Good Health Month Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		schemeYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Scheme Year", "input")), "Scheme Year Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//GM Abhijit
		maternityExtensionRequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Maternity Extension required", "select")), "Select Maternity Extension Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TI-kamlesh
		whethertheAddonfortheCostofexpensestothefamilymembersrequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the Add-on for the Cost of expenses to the family members required?", "select")), "Premium in Forex Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// MC-priyanka
		newPremiumRateApplicableDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("New Premium Rate Applicable", "select")), "New Premium Rate Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		zoneForNewMediclaimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone for New Mediclaim", "select")), "Zone for New Mediclaim Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loyaltyDiscountDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loyalty Discount", "select")), "Loyalty Discount Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		//Misc Liability - Rasika

		motorPolicyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheInsurerTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the insurer", "input")), "Name of the insurer Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		motorPolicyFromDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy From Date", "input")), "Motor Policy From Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		motorPolicyToDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy To Date", "input")), "Motor Policy To Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		motorPolicyFromDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Motor Policy From Date')]/following::input/following::a[@name='firstFocus']"), "Motor Policy From Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		motorPolicyToDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Motor Policy To Date')]/following::input/following::a[@name='firstFocus']"), "Motor Policy To Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//miSC Liability - nilesh

		miscellaneousProductTypeDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Miscellaneous Product Type", "select")), "Miscellaneous Product Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//RS-Amit
		specialSchemeTypeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Scheme Type", "select")), "Special Scheme Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable", "select")), "Special Scheme Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberofPersonsCoveredinRSTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Persons Covered in RS", "input")), "Number of Persons Covered in RS Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofFamilyCoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Family covered", "input")), "Number of Family covered Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//GM
		totalNumberOfPersonsCoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Number of persons covered", "input")), "Total Number of persons covered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfHealthPolicyDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Health Policy","select")), "Type of Health Policy Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		masterPolicyNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Master Policy No.", "input")), "masterPolicyNoTextField", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		nomineeNameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominee Name", "input")), "Nominee name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationShipWithTheNomineeTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("RelationShip with the Nominee", "textarea")), "Relationship of the Nominee Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SumInsuredforPremierMediclaimDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Premier Mediclaim","select")), "Sum Insured for Premier Mediclaim Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationshipWithTheNomineeTextFeildForUK=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with Nominee", "input")), "RelationShip with the Nominee Text Feild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithTheNomineeTextAreaForTU=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Nominee", "textarea")), "RelationShip with the Nominee Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RelationshipwiththeNomineeICDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Nominee", "select")), "Relationship of the Nominee select", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MembershipIdICTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership Id", "input")), "Membership Id Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MasterPolicyNumberICTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Master Policy Number", "input")), "Master Policy Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateOwnerICDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate Owner", "select")), "Certificate Owner select", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		OtherinformationifanyTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other information (if any)", "textarea")), "Other information (if any) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClaimReceivedandReportedAmountICTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Received and Reported Amount", "input")), "Claim Received and Reported Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionalCoverINoProportionateDeductionDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Optional Cover I- No Proportionate Deduction","select")), "Optional Cover I- No Proportionate Deduction", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionalCoverIIINoRevisionInCataractLimitDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Optional Cover III- Revision in Cataract Limit","select")), "Optional Cover III- Revision in Cataract Limit", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionalCoverIVVoluntaryCoPayDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Optional Cover IV- Voluntary Co-pay","select")), "Optional Cover IV- Voluntary Co-pay", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfPolicyDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type Of Policy","select")), "Type Of Policy", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationshipoftheNomineeInputHN=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of the Nominee", "input")), "Relationship of the Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofinceptionofOptionalCoverIIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of inception of Optional Cover III", "input")), "Date of inception of Optional Cover III", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		closeButton=new PageElement(By.xpath("//td//input[(@name='CloseWin')]"), "Close", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premierMediclaimPlanTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premier Mediclaim Plan Type","select")), "Premier Mediclaim Plan Type", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillpolicyAttributeHealthDetails(PolicyAttributeHealthEntity policyAttributeHealthEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("add") || policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){

			if((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SP"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("PZ"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("RS"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("MU"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GJ"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SU"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("NB"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("IC"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GJ"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SU"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("NB"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GH"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GT"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TG")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GM"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CG")))){
				{
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTypeOfHealthPolicyFirstPage")) {
						selectValueFromList(typeOfHealthPolicyDropDown, policyAttributeHealthEntity.getStringValueForField("TypeOfHealthPolicyFirstPage"));
						click(forwordButton);
						try{
							acceptAlertAndReturnConfirmationMessage();
						}catch(Exception e) {

						}

					}
				}
			}
			//}
			else
			{
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTypeOfPolicyPage")) {
					selectValueFromList(typeOfPolicyDropDown, policyAttributeHealthEntity.getStringValueForField("TypeOfPolicyPage"));
				}
				click(forwordButton);
				Thread.sleep(500);
				if(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("JA")){
					click(forwordButton);
				}
			}


			//-----------------JM----------------------//
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPhysicianName")) {
				clearAndSendKeys(physicianNameTextField, policyAttributeHealthEntity.getStringValueForField("PhysicianName"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPhysicianAddress")) {
				clearAndSendKeys(physicianAddressTextField, policyAttributeHealthEntity.getStringValueForField("PhysicianAddress"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigAssigneeName")) {
				clearAndSendKeys(assigneenameTextField, policyAttributeHealthEntity.getStringValueForField("AssigneeName"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithAssignee")) {
				selectValueFromList(relationshipWithAssigneeDropDown, policyAttributeHealthEntity.getStringValueForField("RelationshipWithAssignee"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipType")) {
				selectValueFromList(memberShipTypeDropDown, policyAttributeHealthEntity.getStringValueForField("MembershipType"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipNo")) {
				String membershipNo=RandomCodeGenerator.getMembershipNo();
				clearAndSendKeys(memberShipNoTextField, membershipNo);
				policyAttributeHealthEntity.setStringValueForField("MembershipNo",membershipNo );
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipDate")) {
				//String memberShipDate=RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("MembershipDate"));
				//clearAndEnterDate(memberShipDateTextField, memberShipDate);
				click(memberShipDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(memberShipDateTextField, policyAttributeHealthEntity.getStringValueForField("MembershipDate"));
				switchToFrame("display");
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForeignEmbassy")) {
				selectValueFromList(foreignEmbassyDropDown, policyAttributeHealthEntity.getStringValueForField("ForeignEmbassy"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForeignEmbassyDetailCountry")) {
				clearAndSendKeys(foreignEmbassyCountryDetailsTextField, policyAttributeHealthEntity.getStringValueForField("ForeignEmbassyDetailCountry"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumInForex")) {
				selectValueFromList(premiumInForexDropDown, policyAttributeHealthEntity.getStringValueForField("PremiumInForex"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCategoryType")) {
				selectValueFromList(categoryTypeDropDown, policyAttributeHealthEntity.getStringValueForField("CategoryType"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumInForexEmbassyDetails")) {
				clearAndSendKeys(premiumInForexEmbassyDetailsTextField, policyAttributeHealthEntity.getStringValueForField("PremiumInForexEmbassyDetails"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigStaffDiscount")) {
				selectValueFromList(staffDiscountDropDown, policyAttributeHealthEntity.getStringValueForField("StaffDiscount"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigEmployeeType")) {
				selectValueFromList(employeeTypeDropDown, policyAttributeHealthEntity.getStringValueForField("EmployeeType"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSrNo")) {
				clearAndSendKeys(srNoTextField, policyAttributeHealthEntity.getStringValueForField("SrNo"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfStaffMember")) {
				selectValueFromList(companyNameOfStaffMemberDropDown, policyAttributeHealthEntity.getStringValueForField("CompanyNameOfStaffMember"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				selectValueFromList(whetherYouHadPrevPolicyDropDown, policyAttributeHealthEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"));
				fillpolicyAttributeHealthDetailsOnNextPage(policyAttributeHealthEntity, assertReference);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIDTextField, policyAttributeHealthEntity.getStringValueForField("OpportunityId"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, policyAttributeHealthEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			//sc
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigVoluntaryExcessforSC")) {
				selectValueFromList(voluntaryExcessforSCDropDown, policyAttributeHealthEntity.getStringValueForField("VoluntaryExcessforSC"));
			}
			//TF
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForHealth")) {
				selectValueFromList(zoneForHealthDropdown, policyAttributeHealthEntity.getStringValueForField("ZoneForHealth"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropdown, policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsTPARequired")) {
				selectValueFromList(isTPARequiredDropdown, policyAttributeHealthEntity.getStringValueForField("IsTPARequired"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsHOApprovalObtained")) {
				selectValueFromList(isHOApprovalObtainedDropdown, policyAttributeHealthEntity.getStringValueForField("IsHOApprovalObtained"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsHOApprovalDetails")) {
				clearAndSendKeys(hoApprovalDetailsTextField, policyAttributeHealthEntity.getStringValueForField("IsHOApprovalDetails"));
			}

			/*if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(voluntaryExcessforSCDropDown, policyAttributeHealthEntity.getStringValueForField("IsServiceTaxExempted"));
			}*/

			//GT-@Rasika
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTotalNumberOfPersonsCovered")) {
				clearAndSendKeys(totalNoOfPersonsCoveredTextField, policyAttributeHealthEntity.getStringValueForField("TotalNumberOfPersonsCovered"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSpecialEconomyZoneForSGMC")) {
				selectValueFromList(specialEconomyZoneForGMSCDropDown, policyAttributeHealthEntity.getStringValueForField("SpecialEconomyZoneForSGMC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicableGT")) {
				selectValueFromList(coInsuranceApplicableDropdownGT, policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicableGT"));
			}


			//TI kamlesh
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherTheAddOnForTheCostOfExpToTheFamilyMembersRequired")) {
				selectValueFromList(whethertheAddonfortheCostofexpensestothefamilymembersrequiredDropDown, policyAttributeHealthEntity.getStringValueForField("WhetherTheAddOnForTheCostOfExpToTheFamilyMembersRequired"));
			}
			//FM Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNewPremiumRateApplicable")) {
				selectValueFromList(newPremiumRateApplicableFMDropdown, policyAttributeHealthEntity.getStringValueForField("NewPremiumRateApplicable"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForNewFamilyFloater")) {
				selectValueFromList(zoneForNewFamilyFloaterFMDropdown, policyAttributeHealthEntity.getStringValueForField("ZoneForNewFamilyFloater"));
			}

			//GH Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigGoodHealthMonth")) {
				selectValueFromList(goodHealthDropdown, policyAttributeHealthEntity.getStringValueForField("GoodHealthMonth"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSchemeYear")) {
				clearAndSendKeys(schemeYearTextField, policyAttributeHealthEntity.getStringValueForField("SchemeYear"));
			}
			//GM Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMaternityExtensionRequired")) {
				selectValueFromList(maternityExtensionRequiredDropdown, policyAttributeHealthEntity.getStringValueForField("MaternityExtensionRequired"));
			}
			//PZ-@Rasika
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigUndertakingFromTheEmployerReceived")) {
				selectValueFromList(undertakingFromTheEmployerReceivedDropdown, policyAttributeHealthEntity.getStringValueForField("UndertakingFromTheEmployerReceived"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPolicyTypeForPZ")) {
				selectValueFromList(policyTypeForPZDropdown, policyAttributeHealthEntity.getStringValueForField("PolicyTypeForPZ"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumToBeChargedOnPerDayBasisOrBandWise")) {
				selectValueFromList(premiumToBeChargedOnPerDayBasisOrBandWiseDropdown, policyAttributeHealthEntity.getStringValueForField("PremiumToBeChargedOnPerDayBasisOrBandWise"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTotalNoOfEmployees")) {
				clearAndSendKeys(totalNoOfEmployeesTextField, policyAttributeHealthEntity.getStringValueForField("TotalNoOfEmployees"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigEstimatedTotalNoOfDaysOfForeignTrip")) {
				clearAndSendKeys(estimatedTotalNoOfDaysOfForeignTripByAllEmployeesAtPolicyPeriodTextField, policyAttributeHealthEntity.getStringValueForField("EstimatedTotalNoOfDaysOfForeignTrip"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigExpextedNoOfTripsDuringPolicyPeriod")) {
				clearAndSendKeys(expectedNumberOfTripsDuringThePolicyPeriodTextField, policyAttributeHealthEntity.getStringValueForField("ExpextedNoOfTripsDuringPolicyPeriod"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigAverageDurationOfTripsInDays")) {
				clearAndSendKeys(averageDurationOfTripsInDaysTextField, policyAttributeHealthEntity.getStringValueForField("AverageDurationOfTripsInDays"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMaximumAgeOfTheEmployeeTravelling")) {
				clearAndSendKeys(maximumAgeOfTheEmployeeTravellingTextField, policyAttributeHealthEntity.getStringValueForField("MaximumAgeOfTheEmployeeTravelling"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherYouHadACFTPolicyInThePast")) {
				selectValueFromList(whetherYouHadACFTPolicyInThePastDropdown, policyAttributeHealthEntity.getStringValueForField("WhetherYouHadACFTPolicyInThePast"));
				if(policyAttributeHealthEntity.getStringValueForField("WhetherYouHadACFTPolicyInThePast").equalsIgnoreCase("Yes")){
					click(forwordButton);
				}
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
				clearAndSendKeys(companyNameOfThePreviousInsuranceCompanyTextField, policyAttributeHealthEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				clearAndSendKeys(currentPolicyNumberTextField, policyAttributeHealthEntity.getStringValueForField("CurrentPolicyNumber"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
				Thread.sleep(10000);
				String dateOfApplication=RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("ExpiryDateOfTheLastPolicy"));
				clearAndEnterDate(expiryDateOfLastPolicyTextField, dateOfApplication);
			}
			if ((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SC"))){
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
					clearAndSendKeys(companyNameOfThePreviousInsuranceCompanyTextField, policyAttributeHealthEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"));
				}
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
					clearAndSendKeys(currentPolicyNumberTextField, policyAttributeHealthEntity.getStringValueForField("CurrentPolicyNumber"));
				}
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, policyAttributeHealthEntity.getStringValueForField("SumInsured"));
			}		
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				String dateOfApplication=RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("DateOfFirstPolicy"));
				clearAndEnterDate(dateOfFirstPolicyTextField, dateOfApplication);
			}	
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigHowManyYearUCoveredUnderPastHealthPolicy")) {
				clearAndSendKeys(howManyYearUCoveredUnderPastHealthPolicyTextField, policyAttributeHealthEntity.getStringValueForField("HowManyYearUCoveredUnderPastHealthPolicy"));
			}	
			//MC-@Priyanka
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNewPremiumRateApplicable")) {
				selectValueFromList(newPremiumRateApplicableDropDown, policyAttributeHealthEntity.getStringValueForField("NewPremiumRateApplicable"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForNewMediclaim")) {
				selectValueFromList(zoneForNewMediclaimDropDown, policyAttributeHealthEntity.getStringValueForField("ZoneForNewMediclaim"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigLoyaltyDiscount")) {
				selectValueFromList(loyaltyDiscountDropDown, policyAttributeHealthEntity.getStringValueForField("LoyaltyDiscount"));
			}
			//RS-Amit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSpecialSchemeType")) {
				selectValueFromList(specialSchemeTypeDropDown, policyAttributeHealthEntity.getStringValueForField("SpecialSchemeType"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicable"));
			}


			//Misc Liability

			if(policyAttributeHealthEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){


				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyNumber")) {
					clearAndSendKeys(motorPolicyNumberTextField, policyAttributeHealthEntity.getStringValueForField("MotorPolicyNumber"));
				}	
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNameOfTheInsurer")) {
					clearAndSendKeys(nameOfTheInsurerTextField, policyAttributeHealthEntity.getStringValueForField("NameOfTheInsurer"));
				}	
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyFromDate")) {
					click(motorPolicyFromDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(motorPolicyFromDateTextField, policyAttributeHealthEntity.getStringValueForField("MotorPolicyFromDate"));
					switchToFrame("display");
				}	
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyToDate")) {
					click(motorPolicyToDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(motorPolicyToDateTextField, policyAttributeHealthEntity.getStringValueForField("MotorPolicyToDate"));
					switchToFrame("display");

				}	
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMiscellaneousProductType")) {
					selectValueFromList(miscellaneousProductTypeDropDown, policyAttributeHealthEntity.getStringValueForField("MiscellaneousProductType"));
				}

			}
			//SU //HN
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremierMediclaimPlanType")) {
				acceptAlertAndReturnConfirmationMessage();
				selectValueFromList(premierMediclaimPlanTypeDropDown, policyAttributeHealthEntity.getStringValueForField("PremierMediclaimPlanType"));	
				Thread.sleep(500);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSumInsuredforPremierMediclaim")) {
				selectValueFromList(SumInsuredforPremierMediclaimDropDown, policyAttributeHealthEntity.getStringValueForField("SumInsuredforPremierMediclaim"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNomineeName")) {
				clearAndSendKeys(nomineeNameTextField, policyAttributeHealthEntity.getStringValueForField("NomineeName"));
			}	
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
				clearAndSendKeys(relationShipWithTheNomineeTextArea, policyAttributeHealthEntity.getStringValueForField("RelationshipWithNominee"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNomineeForTU")) {
				clearAndSendKeys(relationshipWithTheNomineeTextAreaForTU, policyAttributeHealthEntity.getStringValueForField("RelationshipWithNomineeForTU"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNomineeForUK")) {
				clearAndSendKeys(relationshipWithTheNomineeTextFeildForUK, policyAttributeHealthEntity.getStringValueForField("RelationshipWithNomineeForUK"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipwiththeNomineeIC")) {
				selectValueFromList(RelationshipwiththeNomineeICDropDown, policyAttributeHealthEntity.getStringValueForField("RelationshipwiththeNomineeIC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipIdIC")) {
				clearAndSendKeys(MembershipIdICTextFeild, policyAttributeHealthEntity.getStringValueForField("MembershipIdIC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMasterPolicyNumberIC")) {
				clearAndSendKeys(MasterPolicyNumberICTextFeild, policyAttributeHealthEntity.getStringValueForField("MasterPolicyNumberIC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCertificateOwnerIC")) {
				selectValueFromList(certificateOwnerICDropDown, policyAttributeHealthEntity.getStringValueForField("CertificateOwnerIC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOtherinformationifany")) {
				clearAndSendKeys(OtherinformationifanyTextFeild, policyAttributeHealthEntity.getStringValueForField("Otherinformationifany"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigClaimReceivedandReportedAmountIC")) {
				clearAndSendKeys(ClaimReceivedandReportedAmountICTextFeild, policyAttributeHealthEntity.getStringValueForField("ClaimReceivedandReportedAmountIC"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverINoProportionateDeduction")) {
				selectValueFromList(optionalCoverINoProportionateDeductionDropDown, policyAttributeHealthEntity.getStringValueForField("OptionalCoverINoProportionateDeduction"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverIIINoRevisionInCataractLimit")) {
				selectValueFromList(optionalCoverIIINoRevisionInCataractLimitDropDown, policyAttributeHealthEntity.getStringValueForField("OptionalCoverIIINoRevisionInCataractLimit"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDateofinceptionofOptionalCoverIII")) {
				String dateOfinceptionofOptionalCoverIII = RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("DateofinceptionofOptionalCoverIII"));
				clearAndEnterDate(dateofinceptionofOptionalCoverIIITextField, dateOfinceptionofOptionalCoverIII);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverIVVoluntaryCoPay")) {
				selectValueFromList(optionalCoverIVVoluntaryCoPayDropDown, policyAttributeHealthEntity.getStringValueForField("OptionalCoverIVVoluntaryCoPay"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNomineeHN")) {
				Thread.sleep(500);
				clearAndSendKeys(relationshipoftheNomineeInputHN, policyAttributeHealthEntity.getStringValueForField("RelationshipWithNomineeHN"));
			}

		}
		else if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("verify")){

			if((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SP"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("UK"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TU"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SU"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("NB"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("IC"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CG"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))){
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTypeOfHealthPolicyFirstPage")) {
					assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("TypeOfHealthPolicyFirstPage"), fetchValueFromList(typeOfHealthPolicyDropDown), AssertionType.WARNING);
					click(forwordButton);
				}
			}
			else if ((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("HN"))){
				click(forwordButton);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLable), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipType")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MembershipType"), fetchValueFromList(memberShipTypeDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipNo")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MembershipNo"), fetchValueFromTextFields(memberShipNoTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("MembershipDate")), fetchValueFromTextFields(memberShipDateTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForeignEmbassy")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ForeignEmbassy"), fetchValueFromList(foreignEmbassyDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForeignEmbassyDetailCountry")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ForeignEmbassyDetailCountry"), fetchValueFromTextFields(foreignEmbassyCountryDetailsTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumInForex")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PremiumInForex"), fetchValueFromList(premiumInForexDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumInForexEmbassyDetails")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PremiumInForexEmbassyDetails"), fetchValueFromTextFields(premiumInForexEmbassyDetailsTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigStaffDiscount")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("StaffDiscount"), fetchValueFromList(staffDiscountDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigEmployeeType")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("EmployeeType"), fetchValueFromList(employeeTypeDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSrNo")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SrNo"), fetchValueFromTextFields(srNoTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfStaffMember")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CompanyNameOfStaffMember"), fetchValueFromList(companyNameOfStaffMemberDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"), fetchValueFromList(whetherYouHadPrevPolicyDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIDTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"), fetchValueFromTextFields(companyNameOfThePreviousInsuranceCompanyTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CurrentPolicyNumber"), fetchValueFromTextFields(currentPolicyNumberTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("ExpiryDateOfTheLastPolicy")), fetchValueFromTextFields(expiryDateOfLastPolicyTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("DateOfFirstPolicy")), fetchValueFromTextFields(dateOfFirstPolicyTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigHowManyYearUCoveredUnderPastHealthPolicy")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("HowManyYearUCoveredUnderPastHealthPolicy"), fetchValueFromTextFields(howManyYearUCoveredUnderPastHealthPolicyTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ClaimReceivedAndReportedAmount"), fetchValueFromTextFields(claimReceivedAndReportedAmountTextField), AssertionType.WARNING);

			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCategoryType")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CategoryType"), fetchValueFromList(categoryTypeDropDown), AssertionType.WARNING);
			}

			//JM kamlesh
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPhysicianName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PhysicianName"), fetchValueFromTextFields(physicianNameTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPhysicianAddress")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PhysicianAddress"), fetchValueFromTextFields(physicianAddressTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigAssigneeName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("AssigneeName"), fetchValueFromTextFields(assigneenameTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithAssignee")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("RelationshipWithAssignee"), fetchValueFromList(relationshipWithAssigneeDropDown), AssertionType.WARNING);
			}
			//TI kamlesh
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherTheAddOnForTheCostOfExpToTheFamilyMembersRequired")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("WhetherTheAddOnForTheCostOfExpToTheFamilyMembersRequired"), fetchValueFromList(whethertheAddonfortheCostofexpensestothefamilymembersrequiredDropDown), AssertionType.WARNING);
			}

			//FM Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNewPremiumRateApplicable")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NewPremiumRateApplicable"), fetchValueFromList(newPremiumRateApplicableFMDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForNewFamilyFloater")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ZoneForNewFamilyFloater"), fetchValueFromList(zoneForNewFamilyFloaterFMDropdown), AssertionType.WARNING);
			}
			//GH Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigGoodHealthMonth")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("GoodHealthMonth"), fetchValueFromList(goodHealthDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSchemeYear")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SchemeYear"), fetchValueFromTextFields(schemeYearTextField), AssertionType.WARNING);

			}
			//GM Abhijit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMaternityExtensionRequired")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MaternityExtensionRequired"), fetchValueFromList(maternityExtensionRequiredDropdown), AssertionType.WARNING);
			}

			//PZ-@Rasika
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigUndertakingFromTheEmployerReceived")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("UndertakingFromTheEmployerReceived"), fetchValueFromList(undertakingFromTheEmployerReceivedDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPolicyTypeForPZ")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PolicyTypeForPZ"), fetchValueFromList(policyTypeForPZDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremiumToBeChargedOnPerDayBasisOrBandWise")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PremiumToBeChargedOnPerDayBasisOrBandWise"), fetchValueFromList(premiumToBeChargedOnPerDayBasisOrBandWiseDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTotalNoOfEmployees")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("TotalNoOfEmployees"), fetchValueFromTextFields(totalNoOfEmployeesTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigEstimatedTotalNoOfDaysOfForeignTrip")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("EstimatedTotalNoOfDaysOfForeignTrip"), fetchValueFromTextFields(estimatedTotalNoOfDaysOfForeignTripByAllEmployeesAtPolicyPeriodTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigExpextedNoOfTripsDuringPolicyPeriod")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ExpextedNoOfTripsDuringPolicyPeriod"), fetchValueFromTextFields(expectedNumberOfTripsDuringThePolicyPeriodTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigAverageDurationOfTripsInDays")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("AverageDurationOfTripsInDays"), fetchValueFromTextFields(averageDurationOfTripsInDaysTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMaximumAgeOfTheEmployeeTravelling")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MaximumAgeOfTheEmployeeTravelling"), fetchValueFromTextFields(maximumAgeOfTheEmployeeTravellingTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigWhetherYouHadACFTPolicyInThePast")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("WhetherYouHadACFTPolicyInThePast"), fetchValueFromList(whetherYouHadACFTPolicyInThePastDropdown), AssertionType.WARNING);
			}

			//GT-@Rasika
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTotalNumberOfPersonsCovered")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("TotalNumberOfPersonsCovered"), fetchValueFromTextFields(totalNoOfPersonsCoveredTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSpecialEconomyZoneForSGMC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SpecialEconomyZoneForSGMC"), fetchValueFromList(specialEconomyZoneForGMSCDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicableGT")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicableGT"), fetchValueFromList(coInsuranceApplicableDropdownGT), AssertionType.WARNING);
			}

			//MC-Priyanka 
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNewPremiumRateApplicable")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NewPremiumRateApplicable"), fetchValueFromList(newPremiumRateApplicableDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForNewMediclaim")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ZoneForNewMediclaim"), fetchValueFromList(zoneForNewMediclaimDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigLoyaltyDiscount")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("LoyaltyDiscount"), fetchValueFromList(loyaltyDiscountDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigZoneForHealth")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ZoneForHealth"), fetchValueFromList(zoneForHealthDropdown), AssertionType.WARNING);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsTPARequired")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("IsTPARequired"), fetchValueFromList(isTPARequiredDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsHOApprovalObtained")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("IsHOApprovalObtained"), fetchValueFromList(isHOApprovalObtainedDropdown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigIsHOApprovalDetails")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("IsHOApprovalDetails"), fetchValueFromTextFields(hoApprovalDetailsTextField), AssertionType.WARNING);
			}
			//RS-Amit
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSpecialSchemeType")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SpecialSchemeType"), fetchValueFromList(specialSchemeTypeDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}

			//Misc Liability
			if(policyAttributeHealthEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){

				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyNumber")) {
					assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MotorPolicyNumber"), fetchValueFromTextFields(motorPolicyNumberTextField), AssertionType.WARNING);
				}
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNameOfTheInsurer")) {
					assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NameOfTheInsurer"), fetchValueFromTextFields(nameOfTheInsurerTextField), AssertionType.WARNING);
				}
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyFromDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("MotorPolicyFromDate")), fetchValueFromTextFields(motorPolicyFromDateTextField), AssertionType.WARNING);
				}
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMotorPolicyToDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("MotorPolicyToDate")), fetchValueFromTextFields(motorPolicyToDateTextField), AssertionType.WARNING);
				}

				// nilesh
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMiscellaneousProductType")) {
					assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MiscellaneousProductType"), fetchValueFromList(miscellaneousProductTypeDropDown), AssertionType.WARNING);
				}
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigTotalNumberPersonsCovered")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("TotalNumberPersonsCovered"), fetchValueFromTextFields(totalNumberOfPersonsCoveredTextField), AssertionType.WARNING);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNomineeName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NomineeName"), fetchValueFromTextFields(nomineeNameTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("RelationshipWithNominee"), fetchValueFromTextFields(relationShipWithTheNomineeTextArea), AssertionType.WARNING);				
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNomineeForTU")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("RelationshipWithNomineeForTU"), fetchValueFromTextFields(relationshipWithTheNomineeTextAreaForTU), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipWithNomineeForUK")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("RelationshipWithNomineeForUK"), fetchValueFromTextFields(relationshipWithTheNomineeTextFeildForUK), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSumInsuredforPremierMediclaim")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("SumInsuredforPremierMediclaim"), fetchValueFromList(SumInsuredforPremierMediclaimDropDown), AssertionType.WARNING);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationshipwiththeNomineeIC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("RelationshipwiththeNomineeIC"), fetchValueFromList(RelationshipwiththeNomineeICDropDown), AssertionType.WARNING);
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMembershipIdIC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MembershipIdIC"), fetchValueFromTextFields(MembershipIdICTextFeild), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMasterPolicyNumberIC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MasterPolicyNumberIC"), fetchValueFromTextFields(MasterPolicyNumberICTextFeild), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCertificateOwnerIC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("CertificateOwnerIC"), fetchValueFromList(certificateOwnerICDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOtherinformationifany")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("Otherinformationifany"), fetchValueFromTextFields(OtherinformationifanyTextFeild), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigClaimReceivedandReportedAmountIC")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("ClaimReceivedandReportedAmountIC"), fetchValueFromTextFields(ClaimReceivedandReportedAmountICTextFeild), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverINoProportionateDeduction")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("OptionalCoverINoProportionateDeduction"), fetchValueFromList(optionalCoverINoProportionateDeductionDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverIIINoRevisionInCataractLimit")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("OptionalCoverIIINoRevisionInCataractLimit"), fetchValueFromList(optionalCoverIIINoRevisionInCataractLimitDropDown), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigOptionalCoverIVVoluntaryCoPay")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("OptionalCoverIVVoluntaryCoPay"), fetchValueFromList(optionalCoverIVVoluntaryCoPayDropDown), AssertionType.WARNING);
			}
		
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPremierMediclaimPlanType")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("PremierMediclaimPlanType"), fetchValueFromList(premierMediclaimPlanTypeDropDown), AssertionType.WARNING);
			}
		}
	}

	public void fillpolicyAttributeHealthDetailsOnNextPage(PolicyAttributeHealthEntity policyAttributeHealthEntity, CustomAssert assertReference){
		if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("add") || policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){

			if(policyAttributeHealthEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast").equalsIgnoreCase("yes")){
				if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForwordButton")){		
					if(( policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CG")|| policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CX")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SC"))){
						click(forwordButton);
						switchToFrame("display");
					}
				} 
				switchToFrame("display");
			}
			if ((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SP") || policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CG")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CX"))){
				{
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
						clearAndSendKeys(companyNameOfThePreviousInsuranceCompanyTextField, policyAttributeHealthEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"));
					}
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
						clearAndSendKeys(currentPolicyNumberTextField, policyAttributeHealthEntity.getStringValueForField("CurrentPolicyNumber"));
					}
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
						String expiryLastPolicyDate=RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("ExpiryDateOfTheLastPolicy"));
						clearAndEnterDate(expiryDateOfLastPolicyTextField, expiryLastPolicyDate);
					}
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
						String firstPolicyDate=RandomCodeGenerator.dateGenerator(policyAttributeHealthEntity.getStringValueForField("DateOfFirstPolicy"));
						clearAndEnterDate(dateOfFirstPolicyTextField, firstPolicyDate);
					}
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigSumInsured")) {
						clearAndSendKeys(sumInsuredTextField, policyAttributeHealthEntity.getStringValueForField("SumInsured"));
					}

					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigHowManyYearUCoveredUnderPastHealthPolicy")) {
						clearAndSendKeys(howManyYearUCoveredUnderPastHealthPolicyTextField, policyAttributeHealthEntity.getStringValueForField("HowManyYearUCoveredUnderPastHealthPolicy"));
					}
					if (policyAttributeHealthEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
						clearAndSendKeys(claimReceivedAndReportedAmountTextField, policyAttributeHealthEntity.getStringValueForField("ClaimReceivedAndReportedAmount"));
					}
				}
			}
		}
	}

	public void fillPreviousPolicyHistoryDetails(PolicyAttributeHealthEntity policyAttributeHealthEntity) throws InterruptedException{
		if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("add") || policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){
			click(forwordButton);
			Thread.sleep(1000);
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextBox, policyAttributeHealthEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				clearAndSendKeys(previousPolicyPeriodTextBox, policyAttributeHealthEntity.getStringValueForField("PreviousPolicyPeriod"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPreMedicalCheckUpDetails")) {
				clearAndSendKeys(preMedicalCheckUpDetailsTextBox, policyAttributeHealthEntity.getStringValueForField("PreMedicalCheckUpDetails"));
			}
			//click(forwordButton);
		}
	}

	public void clickNextButtonPolicyAttributeHealthDetails(PolicyAttributeHealthEntity policyAttributeHealthEntity) throws InterruptedException{
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForwordButton")){	
			click(forwordButton);
			Thread.sleep(5000);
			if(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("UK") && policyAttributeHealthEntity.getBooleanValueForField("ConfigCloseButton")) 
			{
			switchToWindow("Reason");
			click(closeButton);
			switchToWindow();
			switchToFrame("display");
			}
			if(policyAttributeHealthEntity.getBooleanValueForField("ConfigEndorse")){
				if(!policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("BH")){
					if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("verify")||policyAttributeHealthEntity.getAction().equalsIgnoreCase("add")|| policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){
						try{
							acceptAlertAndReturnConfirmationMessage();
							Thread.sleep(5000);
						}
						catch(Exception e){
						}
					}
				}
			}
			else if(policyAttributeHealthEntity.getBooleanValueForField("ConfigRenew")){
				fillPreviousPolicyHistoryDetails(policyAttributeHealthEntity);
			}
			/*else if(policyAttributeHealthEntity.getBooleanValueForField("ConfigClaimYears")){
				if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){	
				}
			}*/
			else if(!(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TG")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("HN")))){
				switchToFrame("display");
				//TODO WorkAround
				if(!policyAttributeHealthEntity.getAction().equalsIgnoreCase("verify")){
					if(!(policyAttributeHealthEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("HN"))|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("UK"))|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TU"))|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SU"))|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("NB"))|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("IC"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CG"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GH"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TG")))){


						if(((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("BH")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GT")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("ES"))))){
							workAround(policyAttributeHealthEntity);					

						}

						if(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("BH")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TI")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SC")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GH")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("UH")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("PZ")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GT")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CX")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("ES")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("MU")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("RS")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SP")||policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF")|| (policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))))) {//						workAround(policyAttributeHealthEntity);
							if(!policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CX")) {
								workAround(policyAttributeHealthEntity);
							}
							click(forwordButton);
						}




					}
				}
			}
		}
	}

	public void fillpolicyAttributeHealthDetailsOnNextPage1(PolicyAttributeHealthEntity policyAttributeHealthEntity, CustomAssert assertReference){{
		if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("add") || policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNumberofPersonsCoveredinRS")) {
				clearAndSendKeys(numberofPersonsCoveredinRSTextField, policyAttributeHealthEntity.getStringValueForField("NumberofPersonsCoveredinRS"));
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNumberofFamilycovered")) {
				clearAndSendKeys(numberofFamilyCoveredTextField, policyAttributeHealthEntity.getStringValueForField("NumberofFamilycovered"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMasterPolicyNo")) {
				clearAndSendKeys(masterPolicyNoTextField, policyAttributeHealthEntity.getStringValueForField("MasterPolicyNo"));

			}

		}
		else if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNumberofPersonsCoveredinRS")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NumberofPersonsCoveredinRS"), fetchValueFromTextFields(numberofPersonsCoveredinRSTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigNumberofFamilycovered")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("NumberofFamilycovered"), fetchValueFromTextFields(numberofFamilyCoveredTextField), AssertionType.WARNING);
			}
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMasterPolicyNo")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("MasterPolicyNo"), fetchValueFromTextFields(masterPolicyNoTextField), AssertionType.WARNING);

			}
		}
	}

	if (policyAttributeHealthEntity.getBooleanValueForField("ConfigForwordButton")){		
		click(forwordButton);
		if(policyAttributeHealthEntity.getBooleanValueForField("ConfigEndorseRS")){
			switchToFrameForRS("display");
		}
		else{
			try {
				switchToFrame("display");
			}
			catch(Exception e)
			{
				System.out.println("Frame not present");
			}
		}

	}
	} 
	public void fillpolicyAttributeHealthDetailsOnNextPage2(PolicyAttributeHealthEntity policyAttributeHealthEntity, CustomAssert assertReference) throws InterruptedException{

		if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("add") || policyAttributeHealthEntity.getAction().equalsIgnoreCase("edit")){//Currently Workaround not needed --Shreeya
			/*workAround(policyAttributeHealthEntity);
		click(forwordButton);
		//	Thread.sleep(3000);
		click(forwordButton);*/
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigStateName")) {
				clearAndSendKeys(stateNameTextField, policyAttributeHealthEntity.getStringValueForField("StateName"));
			}

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDistrictName")) {
				clearAndSendKeys(districtNameTextField, policyAttributeHealthEntity.getStringValueForField("DistrictName"));

			}
		}
		else if(policyAttributeHealthEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigStateName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("StateName"), fetchValueFromTextFields(stateNameTextField), AssertionType.WARNING);
			}
			Thread.sleep(5000);

			if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDistrictName")) {
				assertReference.assertEquals(policyAttributeHealthEntity.getStringValueForField("DistrictName"), fetchValueFromTextFields(districtNameTextField), AssertionType.WARNING);


			}
		}

	}
	//TODO WORKAROUND
	public void workAround(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		//if(!isElementDisplayed(nextAttributePageTitle)){
		workAroundForPolicySearchRS(policyAttributeHealthEntity);
		click(proceedButton);
		switchToFrame("display");
		click(forwordButton);


	}


	public void workAroundForPolicySearchRS(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if(!(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("UB"))){
			PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
			policySearchPage.navigateToPolicySearchPage();
			PageElement quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			clearAndSendKeys(quoteNumberTextFeild,policyAttributeHealthEntity.getStringValueForField("QuoteNo") );
			PageElement searchButton= new PageElement(By.name("Search5465"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			click(searchButton);
			String quoteNo=policyAttributeHealthEntity.getStringValueForField("QuoteNo").trim();
			PageElement	policyQuoteLink=new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyQuoteLink);
			switchToFrame("display");
			navigateToAttribute(policyAttributeHealthEntity);


		}
	}


	public void navigateTobackAttributePage(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToPolicy(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigMemberTab")){			
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttributeHealthEntity policyAttributeHealthEntity){
		if (policyAttributeHealthEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}



	public void fillandSubmitPolicyAttibutesHealth(PolicyAttributeHealthEntity policyAttributeHealthEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyAttributeHealthEntity.getConfigExecute())){
			switchToFrame("display");
			fillpolicyAttributeHealthDetails(policyAttributeHealthEntity, assertReference);
			/*if(!(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("SP") || policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("FM"))){
				fillpolicyAttributeHealthDetailsOnNextPage(policyAttributeHealthEntity, assertReference);
			}*/
			if(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("CX")&&(policyAttributeHealthEntity.getRowNumber()==2)) {
				fillPreviousPolicyHistoryDetails(policyAttributeHealthEntity);
			}
			clickNextButtonPolicyAttributeHealthDetails(policyAttributeHealthEntity);
			if((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("RS"))||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))){
				fillpolicyAttributeHealthDetailsOnNextPage1(policyAttributeHealthEntity, assertReference);


			}

			if((policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("RS")||(policyAttributeHealthEntity.getStringValueForField("Product").equalsIgnoreCase("JA")))){
				fillpolicyAttributeHealthDetailsOnNextPage2(policyAttributeHealthEntity, assertReference);
				click(forwordButton);

			}


			navigateTobackAttributePage(policyAttributeHealthEntity);
			navigateToPolicy(policyAttributeHealthEntity);
			navigateToMember(policyAttributeHealthEntity);
			navigateToCoverage(policyAttributeHealthEntity);
			navigateToLoan(policyAttributeHealthEntity);
			navigateToClientDetails(policyAttributeHealthEntity);
			navigateToRelation(policyAttributeHealthEntity);
			navigateToPayment(policyAttributeHealthEntity);
			navigateToFollowup(policyAttributeHealthEntity);
			navigateToDocument(policyAttributeHealthEntity);
		}
	}
}
