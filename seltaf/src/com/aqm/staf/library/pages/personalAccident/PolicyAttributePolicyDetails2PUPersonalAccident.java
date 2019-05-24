package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrPolDetails2PUEntity;
import com.aqm.staf.library.databin.PolicyAttrQuotDetailEntity;

public class PolicyAttributePolicyDetails2PUPersonalAccident extends BasePage {
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

	private PageElement policyDetailsTitle;
	private PageElement policyHistoryforPUTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;

	private PageElement specialEconomicZoneLabel; 
	private PageElement coInsuranceApplicableLabel;
	private PageElement installmentPercentageListLabel;
	private PageElement typeOfCoverRequiredForPUDropDown;
	private PageElement familyPackageRequiredDropDown;
	private PageElement staffDiscountDropDown;
	
	private PageElement EmployeeTypeDropDown;
	private PageElement SerialNoTextField;
	private PageElement CompanyNameOfStaffMemberDropDown;
	

	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;



	public PolicyAttributePolicyDetails2PUPersonalAccident(WebDriver driver, String pageName) {
		super (driver, pageName);

		policyDetailsTitle	  	=new PageElement(By.xpath("//div/b[contains(text(),'Policy Details')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHistoryforPUTitle =new PageElement(By.xpath("//div/b[contains(text(),'Policy History for PU')]"), "Policy History For PU Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab               =new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab          	=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab    	=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab           	=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab              	=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab	  	=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab		  	=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab			 	=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab			 	=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab			  	=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle	 	= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle 	= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "Client Details Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle 		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Relations Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle 		= new PageElement(By.xpath("//div//b//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		specialEconomicZoneLabel   	 	= new PageElement(By.xpath("//tr//td[contains(text(),'Special Economic Zone')]/following::td"), "Special Economic Zone", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicableLabel 		= new PageElement(By.xpath("//tr//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Co-Insurance Applicable Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Installment Percentage List')]/following::td"), "Installment Percentage List Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCoverRequiredForPUDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of cover required for PU')]/following::select[1]"), "Type of cover required for PU Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		familyPackageRequiredDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Family Package Required')]/following::select"), "Family Package Required Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		staffDiscountDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Staff Discount')]/following::select"), "Staff Discount Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		EmployeeTypeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Employee type')]/following::select"), "Employee type drop down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SerialNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'SR No.')]/following::input"), "SR No.Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		CompanyNameOfStaffMemberDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Company Name of Staff Member')]/following::select"), "Company Name of Staff Member Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		nextButton		=new PageElement(By.name("Next"), " Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	=new PageElement(By.name("btnPrevious"), " previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	public void fillPolicyDetailsForPersonalAccident(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity, CustomAssert assertReference){
		if(polAttrPolDetails2PUEntity.getAction().equalsIgnoreCase("add") || polAttrPolDetails2PUEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigTypeOfCoverRequiredForPU")) {
				selectValueFromList(typeOfCoverRequiredForPUDropDown, polAttrPolDetails2PUEntity.getStringValueForField("TypeOfCoverRequiredForPU"));
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigFamilyPackageRequired")) {
				selectValueFromList(familyPackageRequiredDropDown, polAttrPolDetails2PUEntity.getStringValueForField("FamilyPackageRequired"));
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigStaffDiscount")) {
				selectValueFromList(staffDiscountDropDown, polAttrPolDetails2PUEntity.getStringValueForField("StaffDiscount"));
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigEmployeeType")) {
				selectValueFromList(EmployeeTypeDropDown, polAttrPolDetails2PUEntity.getStringValueForField("EmployeeType"));
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigSerialNo")) {
				clearAndSendKeys(SerialNoTextField, polAttrPolDetails2PUEntity.getStringValueForField("SerialNo"));
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigCompanyNameOfStaffMember")) {
				selectValueFromList(CompanyNameOfStaffMemberDropDown, polAttrPolDetails2PUEntity.getStringValueForField("CompanyNameOfStaffMember"));
			}

		}
		else if(polAttrPolDetails2PUEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromTextFields(specialEconomicZoneLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromTextFields(coInsuranceApplicableLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromTextFields(installmentPercentageListLabel), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigTypeOfCoverRequiredForPU")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("TypeOfCoverRequiredForPU"), fetchValueFromList(typeOfCoverRequiredForPUDropDown), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigFamilyPackageRequired")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("FamilyPackageRequired"), fetchValueFromList(familyPackageRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigStaffDiscount")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("StaffDiscount"), fetchValueFromList(staffDiscountDropDown), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigEmployeeType")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("EmployeeType"), fetchValueFromList(EmployeeTypeDropDown), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(SerialNoTextField), AssertionType.WARNING);
			}
			if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigCompanyNameOfStaffMember")) {
				assertReference.assertEquals(polAttrPolDetails2PUEntity.getStringValueForField("CompanyNameOfStaffMember"), fetchValueFromList(CompanyNameOfStaffMemberDropDown), AssertionType.WARNING);
			}

		}
	}
	public void nextToPolicyHistoryforPU(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity) {
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			//policyHistoryforPUTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrPolDetails2PUEntity.getStringValueForField("PolAttrPolDetails2PUTitle")+"')]"), "Policy History for PU Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//if(isElementDisplayed(policyHistoryforPUTitle));
			return;
		}
	}
	public void backToPolicyDetails(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity) {
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			if(isElementDisplayed(policyDetailsTitle));
			return;

		}
	}
	public void navigateTobackAttributePage(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity) {
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			return;

		}
	}
	public void navigateToPolicy(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity){
		if (polAttrPolDetails2PUEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyAttrQuotDetail(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntity, CustomAssert assertReference) {
		if(isConfigTrue(polAttrPolDetails2PUEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyDetailsForPersonalAccident(polAttrPolDetails2PUEntity,assertReference);
			nextToPolicyHistoryforPU(polAttrPolDetails2PUEntity);
			backToPolicyDetails(polAttrPolDetails2PUEntity);
			navigateTobackAttributePage(polAttrPolDetails2PUEntity);
			navigateToPolicy(polAttrPolDetails2PUEntity);
			//navigateToAttribute(polAttrPolDetails2PUEntity);
			navigateToInsuredInterest(polAttrPolDetails2PUEntity);
			navigateToCoverage(polAttrPolDetails2PUEntity);
			navigateToLoan(polAttrPolDetails2PUEntity);
			navigateToClientDetails(polAttrPolDetails2PUEntity);
			navigateToRelation(polAttrPolDetails2PUEntity);
			navigateToPayment(polAttrPolDetails2PUEntity);
			navigateToFollowup(polAttrPolDetails2PUEntity);
			navigateToDocument(polAttrPolDetails2PUEntity);

		}
	}
}