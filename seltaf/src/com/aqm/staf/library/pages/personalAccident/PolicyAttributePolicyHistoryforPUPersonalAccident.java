package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttPolHistoryforPUEntity;
import com.aqm.staf.library.databin.PolicyAttPolDetailsCSEntity;

public class PolicyAttributePolicyHistoryforPUPersonalAccident extends BasePage {

	private PageElement policyHistoryForPUTitle;

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

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;

	private PageElement	specialEconomicZoneLable;
	private PageElement	installmentPercentageListLable;
	private PageElement	familyPackageRequiredLable;
	private PageElement	employeetypeLable;
	private PageElement	companyNameofStaffMemberLable;
	private PageElement	coInsuranceApplicableLable;
	private PageElement	typeOfCoverrequiredforPULable;
	private PageElement	staffDiscountLable;
	private PageElement	sRNoLable;
	private PageElement	dummyT1CLRLable;

	private PageElement	typeOfPolicyDropDown;

	private PageElement	nextButton;
	private PageElement previousButton;
	private PageElement	backButton;


	public PolicyAttributePolicyHistoryforPUPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);

		policyHistoryForPUTitle	= new PageElement(By.xpath("//div/b[contains(text(),'Policy Details')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTab			= new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab		= new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab  = new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab				= new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab	= new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab        = new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Quote Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel  	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel		 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		specialEconomicZoneLable		=	new PageElement(By.xpath("//td[contains(text(),'Special Economic Zone')]/following::td"), "Minimum Retention Premium Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLable	=	new PageElement(By.xpath("//td[contains(text(),'Installment Percentage List')]/following::td"), "Minimum Retention Premium Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		familyPackageRequiredLable		=	new PageElement(By.xpath("//td[contains(text(),'Family Package Required')]/following::td"), "Minimum Retention Premium Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		employeetypeLable				=	new PageElement(By.xpath("//td[@id='Employee type']/following::td"), "Employee type Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyNameofStaffMemberLable	=	new PageElement(By.xpath("//td[contains(text(),'Company Name of Staff Member')]/following::td"), "Company Name of Staff Member Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicableLable		=	new PageElement(By.xpath("//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Minimum Retention Premium Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCoverrequiredforPULable	=	new PageElement(By.xpath("//td[contains(text(),'Type of cover required for PU')]/following::td"), "Type Of Cover required for PU Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		staffDiscountLable				=	new PageElement(By.xpath("//td[contains(text(),'Staff Discount')]/following::td"), "Staff Discount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sRNoLable						=	new PageElement(By.xpath("//td[contains(text(),'SR No.')]/following::td"), "SR No Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyT1CLRLable					=	new PageElement(By.xpath("//td[contains(text(),'dummyT1-CLR')]/following::td"), "Dummy T1CLR Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfPolicyDropDown			=	new PageElement(By.xpath("//td//div[contains(text(),'Type of policy')]/following::select"), "Type Of Policy DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		nextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	= new PageElement(By.name("btnPrevious"),  "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillpolicyHistoryForPU(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity, CustomAssert assertReference){
		if(polAttPolHistoryforPUEntity.getAction().equalsIgnoreCase("add") || polAttPolHistoryforPUEntity.getAction().equalsIgnoreCase("edit")){
			if(polAttPolHistoryforPUEntity.getStringValueForField("Product").equalsIgnoreCase("PU")){
				click(nextButton);
				switchToFrame("display");
				click(nextButton);
				switchToFrame("display");
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigTypeOfPolicyDropDown")) {
				selectValueFromList(typeOfPolicyDropDown, polAttPolHistoryforPUEntity.getStringValueForField("TypeOfPolicyDropDown"));
			}

		}
		else if(polAttPolHistoryforPUEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("productName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromFields(specialEconomicZoneLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromFields(installmentPercentageListLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigFamilyPackageRequired")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("FamilyPackageRequired"), fetchValueFromFields(familyPackageRequiredLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigEmployeetype")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("Employeetype"), fetchValueFromFields(employeetypeLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigCompanyNameofStaffMember")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("CompanyNameofStaffMember"), fetchValueFromFields(companyNameofStaffMemberLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromFields(coInsuranceApplicableLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigTypeofCoverrequiredforPU")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("TypeofCoverrequiredforPU"), fetchValueFromFields(typeOfCoverrequiredforPULable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigStaffDiscount")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("StaffDiscount"), fetchValueFromFields(staffDiscountLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigSRNo")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("SRNo"), fetchValueFromFields(sRNoLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigDummyTOneCLR")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("DummyTOneCLR"), fetchValueFromFields(dummyT1CLRLable), AssertionType.WARNING);
			}
			if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigTypeOfPolicyDropDown")) {
				assertReference.assertEquals(polAttPolHistoryforPUEntity.getStringValueForField("TypeOfPolicyDropDown"), fetchValueFromFields(typeOfPolicyDropDown), AssertionType.WARNING);
			}
		}
	}
	public void clickNextToPolicyHistoryForPU(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity) {
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
		}
	}

	public void clickbackToPreviousPage(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity) {
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void clickBackToAttributeTab(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity) {
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity){
		if (polAttPolHistoryforPUEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyHistoryForPU(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntity, CustomAssert assertReference) {
		if(isConfigTrue(polAttPolHistoryforPUEntity.getConfigExecute())){
			switchToFrame("display");
			fillpolicyHistoryForPU(polAttPolHistoryforPUEntity, assertReference);
			if(!polAttPolHistoryforPUEntity.getStringValueForField("Product").equalsIgnoreCase("PH")){
				clickNextToPolicyHistoryForPU(polAttPolHistoryforPUEntity);
			}
			if(polAttPolHistoryforPUEntity.getStringValueForField("Product").equalsIgnoreCase("PU")){
				clickNextToPolicyHistoryForPU(polAttPolHistoryforPUEntity);
			}
			clickbackToPreviousPage(polAttPolHistoryforPUEntity);
			clickBackToAttributeTab(polAttPolHistoryforPUEntity);
			navigateToPolicy(polAttPolHistoryforPUEntity);
			navigateToAttribute(polAttPolHistoryforPUEntity);
			navigateToInsuredInterest(polAttPolHistoryforPUEntity);
			navigateToCoverage(polAttPolHistoryforPUEntity);
			navigateToClientDetails(polAttPolHistoryforPUEntity);
			navigateToRelation(polAttPolHistoryforPUEntity);
			navigateToPayment(polAttPolHistoryforPUEntity);
			navigateToFollowup(polAttPolHistoryforPUEntity);
			navigateToDocument(polAttPolHistoryforPUEntity);
		}
	}



}
