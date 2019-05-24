package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrPUAddOnCoverageEntity;
import com.aqm.staf.library.databin.PolAttrPolDetails2PUEntity;
import com.aqm.staf.library.databin.PolInsureAttBuyrDetailEntity;

public class PolicyAttributePUAddoncoveragePersonalAccident extends BasePage{
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
	private PageElement typeOfDevelopmentHiddenTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	
	private PageElement specialEconomicZoneLabel;
	private PageElement installmentPercentageListLabel;
	private PageElement familyPackageRequiredLabel;
	private PageElement employeeTypeLabel;
	private PageElement companyNameOfStaffMemberLabel;
	private PageElement typeOfPolicyLabel;
	private PageElement previousPolicyNumberLabel;
	private PageElement previousPolicyPeriodToLabel;
	private PageElement totalNumberOfClaimsRegisteredLabel;
	private PageElement claimsIncurredLabel;
	private PageElement remarksLabel;
	private PageElement breakinInsuranceLabel;
	private PageElement dummyTOneTwoCLRLabel;
	private PageElement policySumInsuredLabel;
	private PageElement terrorismPremiumIfApplicableLabel;
	private PageElement anyPolicyNumberReferenceLabel;
	private PageElement locationDetailsTwoLabel;
	private PageElement locationDetailsFourLabel;
	private PageElement addonCoverDetailsTwoLabel;
	private PageElement addonCoverDetailsFourLabel;
	private PageElement specialConditionsOneLabel;
	private PageElement specialConditionsThreeLabel;
	private PageElement dummyTFivePLRLabel;
	private PageElement tagNumberLabel;
	private PageElement uniqueIdentificationCodeForEndtLabel;
	private PageElement dummyTThreePLRLabel;
	private PageElement dummyOneOneLabel;
	private PageElement coInsuranceApplicableLabel;
	private PageElement typeofcoverrequiredforPULabel;
	private PageElement staffDiscountLabel;
	private PageElement serialNoLabel;
	private PageElement dummyTOneCLRLabel;
	private PageElement nameOfInsurerLabel;
	private PageElement previousPolicyPeriodFromLabel;
	private PageElement premiumPaidLabel;
	private PageElement claimsPaidLabel;
	private PageElement incurredClaimRatioLabel;
	private PageElement dummyLabel;
	private PageElement breakinInsuranceStatusLabel;
	private PageElement detailUnderwritingRequiredLabel;
	private PageElement totalPremiumExcludingTerrorismLabel;
	private PageElement otherPolicyDetailsLabel;
	private PageElement locationDetailsOneLabel;
	private PageElement locationDetailsThreeLabel;
	private PageElement addonCoverDetailsOneLabel;
	private PageElement addonCoverDetailsThreeLabel;
	private PageElement excessForProvisionalPolicyLabel;
	private PageElement specialConditionsTwoLabel;
	private PageElement specialConditionsFourLabel;
	private PageElement getSecondOptionLabel;
	private PageElement uniqueIdentificationCodeForPolicyLabel;
	private PageElement dummyTThreeCLRLabel;
	private PageElement dummyTFourPLRLabel;
	private PageElement isPUAddOnCoveragePresentDropDown;

	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;

	public PolicyAttributePUAddoncoveragePersonalAccident(WebDriver driver, String pageName) {
		super (driver, pageName);

		
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
		typeOfDevelopmentHiddenTitle = new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development hidden')]"), "Type Of Development hidden Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		specialEconomicZoneLabel   	 	= new PageElement(By.xpath("//tr//td[contains(text(),'Special Economic Zone')]/following::td"), "Special Economic Zone Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Installment Percentage List')]/following::td"), "Installment Percentage List Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		familyPackageRequiredLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Family Package Required')]/following::td"), "Family Package Required Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		employeeTypeLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Employee type')]/following::td"), "Employee type Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyNameOfStaffMemberLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Company Name of Staff Member')]/following::td"), "Company Name of Staff Member Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPolicyLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Type of policy')]/following::td"), "Type of policy Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Previous Policy Number')]/following::td"), "Previous Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodToLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Previous Policy Period To')]/following::td"), "Previous Policy Period To Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberOfClaimsRegisteredLabel= new PageElement(By.xpath("//tr//td[contains(text(),'Total Number of Claims Registered')]/following::td"), "Total Number of Claims Registered Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Claims Incurred')]/following::td"), "Claims Incurred Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksLabel					= new PageElement(By.xpath("//tr//td[contains(text(),'Remarks')]/following::td"), "Remarks Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakinInsuranceLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Break-in-Insurance')]/following::td"), "Break-in-Insurance Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTOneTwoCLRLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT12-CLR')]/following::td"), "dummyT12-CLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policySumInsuredLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Policy Sum Insured')]/following::td"), "Policy Sum Insured Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		terrorismPremiumIfApplicableLabel= new PageElement(By.xpath("//tr//td[contains(text(),'Terrorism Premium(if applicable)')]/following::td"), "Terrorism Premium(if applicable) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyPolicyNumberReferenceLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Any Policy Number Reference')]/following::td"), "Any Policy Number Reference Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetailsTwoLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Location Details2')]/following::td"), "Location Details2  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetailsFourLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Location Details4')]/following::td"), "Location Details4 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetailsTwoLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Add on Cover Details2')]/following::td"), "Add on Cover Details2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetailsFourLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Add on Cover Details4')]/following::td"), "Add on Cover Details4Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsOneLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Special Conditions1')]/following::td"), "Special Conditions1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsThreeLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Special Conditions3')]/following::td"), "Special Conditions3 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTFivePLRLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT5-PLR')]/following::td"), "dummyT5-PLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNumberLabel					= new PageElement(By.xpath("//tr//td[contains(text(),'Tag Number')]/following::td"), "Tag Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationCodeForEndtLabel= new PageElement(By.xpath("//tr//td[contains(text(),'Unique Identification code for endt')]/following::td"), "Unique Identification code for endt Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTThreePLRLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT3-PLR')]/following::td"), "dummyT3-PLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyOneOneLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummy11')]/following::td"), "dummy11 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicableLabel 		= new PageElement(By.xpath("//tr//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofcoverrequiredforPULabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Type of cover required for PU')]/following::td"), "Type of cover required for PU Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		staffDiscountLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Staff Discount')]/following::td"), "Staff Discount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoLabel					= new PageElement(By.xpath("//tr//td[contains(text(),'SR No.')]/following::td"), "SR No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTOneCLRLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT1-CLR')]/following::td"), "dummyT1-CLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfInsurerLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Name of Insurer')]/following::td"), "Name of Insurer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodFromLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Previous Policy Period From')]/following::td"), "Previous Policy Period From Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPaidLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'Premium Paid')]/following::td"), "Premium Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidLabel					= new PageElement(By.xpath("//tr//td[contains(text(),'Claims Paid')]/following::td"), "Claims Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Incurred Claim Ratio (%)')]/following::td"), "Incurred Claim Ratio (%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyLabel						= new PageElement(By.xpath("//tr//td[contains(text(),'dummy')]/following::td"), "dummy Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakinInsuranceStatusLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Break-in-Insurance Status')]/following::td"), "Break-in-Insurance Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailUnderwritingRequiredLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Detail Underwriting Required')]/following::td"), "Detail Underwriting Required Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumExcludingTerrorismLabel= new PageElement(By.xpath("//tr//td[contains(text(),'Total Premium(excluding Terrorism)')]/following::td"), "Total Premium(excluding Terrorism) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherPolicyDetailsLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Other Policy Details')]/following::td"), "Other Policy Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetailsOneLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'Location Details1')]/following::td"), "Location Details1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetailsThreeLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Location Details3')]/following::td"), "Location Details3Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetailsOneLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Add on Cover Details1')]/following::td"), "Add on Cover Details1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetailsThreeLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Add on Cover Details3')]/following::td"), "Add on Cover Details3 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForProvisionalPolicyLabel	= new PageElement(By.xpath("//tr//td[contains(text(),'Excess for Provisional Policy')]/following::td"), "Excess for Provisional Policy  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTwoLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Special Conditions2')]/following::td"), "Special Conditions2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsFourLabel		= new PageElement(By.xpath("//tr//td[contains(text(),'Special Conditions4')]/following::td"), "Special Conditions4Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		getSecondOptionLabel			= new PageElement(By.xpath("//tr//td[contains(text(),'getSecndOption')]/following::td"), "getSecndOption Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationCodeForPolicyLabel= new PageElement(By.xpath("//tr//td[contains(text(),'Unique Identification code for policy')]/following::td"), "Unique Identification code for policyLabel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTThreeCLRLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT3-CLR')]/following::td"), "dummyT3-CLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyTFourPLRLabel				= new PageElement(By.xpath("//tr//td[contains(text(),'dummyT4-PLR')]/following::td"), "dummyT4-PLRLabel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isPUAddOnCoveragePresentDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is PU Add on coverage present')]/following::select"), "Is PU Add on coverage present DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextButton		=new PageElement(By.name("Next"), " Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	=new PageElement(By.name("btnPrevious"), " previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton      =new PageElement(By.name("btnSave"), " Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
}
	public void fillPolicyAttributePUAddOnCoverage(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity, CustomAssert assertReference){
		if(polAttrPUAddOnCoverageEntity.getAction().equalsIgnoreCase("add") || polAttrPUAddOnCoverageEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigIsPUAddOnCoveragePresent")) {
				selectValueFromList(isPUAddOnCoveragePresentDropDown, polAttrPUAddOnCoverageEntity.getStringValueForField("IsPUAddOnCoveragePresent"));
			}
		
		}
		
		else if(polAttrPUAddOnCoverageEntity.getAction().equalsIgnoreCase("verify")){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigQuoteNo")) {
			assertReference.assertEquals(polAttrPUAddOnCoverageEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
		}
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigProductName")) {
			assertReference.assertEquals(polAttrPUAddOnCoverageEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
		}
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigStatus")) {
			assertReference.assertEquals(polAttrPUAddOnCoverageEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
		}
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigPolicyHolder")) {
			assertReference.assertEquals(polAttrPUAddOnCoverageEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
		}
		
}
}
	
	public void nextToPolicyHistoryforPU(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity) {
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			return;

		}
	}
	public void backToTypeOfDevelopmentHidden(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity) {
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			if(isElementDisplayed(typeOfDevelopmentHiddenTitle));
			return;

		}
	}
	public void navigateBackToAttributePage(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity) {
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			return;

		}
	}
	public void savePUAddOnCoverage(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity) {
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToPolicy(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity){
		if (polAttrPUAddOnCoverageEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolAttrPUAddOnCoverage(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntity, CustomAssert assertReference) {
		if(isConfigTrue(polAttrPUAddOnCoverageEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePUAddOnCoverage(polAttrPUAddOnCoverageEntity,assertReference);
			nextToPolicyHistoryforPU(polAttrPUAddOnCoverageEntity);
			backToTypeOfDevelopmentHidden(polAttrPUAddOnCoverageEntity);
			savePUAddOnCoverage(polAttrPUAddOnCoverageEntity);
			navigateToPolicy(polAttrPUAddOnCoverageEntity);
			navigateBackToAttributePage(polAttrPUAddOnCoverageEntity);
			//navigateToAttribute(polAttrPUAddOnCoverageEntity);
			navigateToInsuredInterest(polAttrPUAddOnCoverageEntity);
			navigateToCoverage(polAttrPUAddOnCoverageEntity);
			navigateToLoan(polAttrPUAddOnCoverageEntity);
			navigateToClientDetails(polAttrPUAddOnCoverageEntity);
			navigateToRelation(polAttrPUAddOnCoverageEntity);
			navigateToPayment(polAttrPUAddOnCoverageEntity);
			navigateToFollowup(polAttrPUAddOnCoverageEntity);
			navigateToDocument(polAttrPUAddOnCoverageEntity);
	
		}
}
}
