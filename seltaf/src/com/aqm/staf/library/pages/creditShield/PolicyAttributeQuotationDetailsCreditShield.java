package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountingAccSearchEntity;
import com.aqm.staf.library.databin.PolicyAttrQuotDetailEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;



public class PolicyAttributeQuotationDetailsCreditShield extends BasePage  {
	private PageElement quotationDetailsTitle;
	private PageElement policyDetailsTitle;
	private PageElement CDPolicyDetailsTitle;
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
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;

	private PageElement  countryDetailsLabel;
	private PageElement  isServiceTaxExemptedLabel;
	private PageElement  coInsuranceApplicableLabel;
	private PageElement  nameofInsurerLabel;
	private PageElement  installmentPercentageListLabel;
	private PageElement  opportunityIdLabel;

	private PageElement policyNoLabel;
	private PageElement  policyTypeTextField;
	private PageElement  natureOfBusinessForCreditTextField;    
	private PageElement  totalInsurableTurnoverTextField;    
	private PageElement  premiumRateTextField;    
	private PageElement  amountOfPremiumTextField;    
	private PageElement  doYouWantPreCreditFacilityDropDown;    
	private PageElement  preCreditInsurableTurnoverTextField;
	private PageElement  preCreditPremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForPreCreditTextField;
	private PageElement  totalPremiumTextField;    
	private PageElement  optionsForMinimumRetentionPremiumDropDown;    
	private PageElement  minimumRetentionPremiumAmountTextField;
	private PageElement  minimumRetentionPremiumPercentageTextField;
	private PageElement  discretionaryCreditLimitTextField;  
	private PageElement  insuredForDCLBuyerTextField;
	private PageElement  insuredForCLBuyerTextField;
	private PageElement  processingFeeTextField;
	private PageElement  deductibleTypeDropDown;
	private PageElement  deductibleAmountTextField;
	private PageElement  annualAggregateDeductibleTextField;
	private PageElement  maximumTermsOfPaymentDaysTextField;
	private PageElement  extensionPeriodDaysTextField;
	private PageElement  waitingPeriodMonthsTextField;
	private PageElement  bonusInPercentageTextField;
	private PageElement  malusInPercentageTextField;
	private PageElement  maximumLiabilityOptionDropDown;
	private PageElement  numberOfTimesTextField;
	private PageElement  maximumLiabilityTextField;
	private PageElement  declarationFrequencyForTurnoverDropDown;
	private PageElement  declarationFrequencyForOverduesDropDown;
	private PageElement  loadingManualTextField;
	private PageElement  discountManualTextField;
	
	//CE 
	private PageElement  termsOfPaymentDaysTextField;
	private PageElement  doYouWantPoliticalRiskDropDown;
	
	private PageElement  group0InsurableTurnoverTextField;
	private PageElement  group0PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup0TextField;
	private PageElement  group1InsurableTurnoverTextField;
	private PageElement  group1PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup1TextField;
	private PageElement  group2InsurableTurnoverTextField;
	private PageElement  group2PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup2TextField;
	private PageElement  group3InsurableTurnoverTextField;
	private PageElement  group3PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup3TextField;
	private PageElement  group4InsurableTurnoverField;
	private PageElement  group4PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup4TextField;
	private PageElement  group5InsurableTurnoverTextField;
	private PageElement  group5PremiumRateInPercentageTextField;
	private PageElement  amountOfPremiumForGroup5TextField;
	

	private PageElement  nextButton;
	private PageElement  previousButton;
	private PageElement  backButton;

	public PolicyAttributeQuotationDetailsCreditShield(WebDriver driver, String pageName) {
		super (driver, pageName);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "Quote Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotationDetailsTitle =new PageElement(By.xpath("//div/b[contains(text(),'Quotation Details')]"), "Quotation Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);			CDPolicyDetailsTitle  =new PageElement(By.xpath("//div/b[contains(text(),'CD Policy Details')]"), "CD Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		countryDetailsLabel=new PageElement(By.xpath("//td[contains(text(),'Country Details')]/following::td"), "Country Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		isServiceTaxExemptedLabel=new PageElement(By.xpath("//td[contains(text(),'Is Service Tax Exempted')]/following::td"), "Is Service Tax Exempted Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		coInsuranceApplicableLabel 		= new PageElement(By.xpath("//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Co-Insurance Applicable Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofInsurerLabel 				= new PageElement(By.xpath("//td[contains(text(),'Name of Insurer')]/following::td"), "Name of Insurer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLabel 	= new PageElement(By.xpath("//td[contains(text(),'Installment Percentage List')]/following::td"), "Installment Percentage List Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		opportunityIdLabel 				= new PageElement(By.xpath("//td[contains(text(),'Opportunity Id')]/following::td"), "opportunity Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 

		policyTypeTextField 						= new PageElement(By.xpath("//td//div[contains(text(),'Policy  type')]/following::textarea"), "Policy Type Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfBusinessForCreditTextField 			= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Business for Credit')]/following::textarea"), "nature Of Business For Credit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalInsurableTurnoverTextField 			= new PageElement(By.xpath("//td//div[contains(text(),'Total Insurable Turnover')]/following::input"), "total Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateTextField 						= new PageElement(By.xpath("//td//div[contains(text(),'Premium rate (%)')]/following::input"), "Premium rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumTextField 					= new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium')]/following::input"), "Amount of premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouWantPreCreditFacilityDropDown 			= new PageElement(By.xpath("//td//div[contains(text(),'Do you want Pre Credit facility?')]/following::select"), "Do You Want Pre Credit Facility Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		preCreditInsurableTurnoverTextField 		= new PageElement(By.xpath("//td//div[contains(text(),'Pre Credit Insurable Turnover')]/following::input"), "Pre Credit Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		preCreditPremiumRateInPercentageTextField 	= new PageElement(By.xpath("//td//div[contains(text(),'Pre Credit Premium rate (%)')]/following::input"), "Pre Credit Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForPreCreditTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Pre Credit')]/following::input"), "Amount of premium for Pre Credit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumTextField 						= new PageElement(By.xpath("//td//div[contains(text(),'Total Premium')]/following::input"), "Total Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		optionsForMinimumRetentionPremiumDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Options for Minimum Retention Premium')]/following::select"), "Options for Minimum Retention Premium Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minimumRetentionPremiumAmountTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Retention Premium Amount')]/following::input"), "Minimum Retention Premium Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		minimumRetentionPremiumPercentageTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Retention Premium (%)')]/following::input"), "Minimum Retention Premium (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryCreditLimitTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Credit Limit (DCL)')]/following::input"), "Discretionary Credit Limit (DCL) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredForDCLBuyerTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Insured (%) for DCL Buyer')]/following::input"), "Insured (%) for DCL Buyer Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredForCLBuyerTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Insured (%) for CL Buyer')]/following::input"), "Insured (%) for CL Buyer Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		processingFeeTextField						= new PageElement(By.xpath("//td//div[contains(text(),'Processing Fee')]/following::input"), "Processing Fee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deductibleTypeDropDown						= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Type')]/following::select"), "Deductible Type Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleAmountTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Deductible  Amount')]/following::input"), "Deductible AmountText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		annualAggregateDeductibleTextField		    = new PageElement(By.xpath("//td//div[contains(text(),'Annual Aggregate Deductible')]/following::input"), "Annual Aggregate Deductible Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maximumTermsOfPaymentDaysTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Maximum Terms of payment (Days)')]/following::input"), "Maximum Terms of payment (Days) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		extensionPeriodDaysTextField				= new PageElement(By.xpath("//td//div[contains(text(),'Extension period (Days)')]/following::input"), "Extension period (Days) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		waitingPeriodMonthsTextField				= new PageElement(By.xpath("//td//div[contains(text(),'Waiting period (Months)')]/following::input"), "Waiting period (Months) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bonusInPercentageTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Bonus(%)')]/following::input"), "Bonus(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		malusInPercentageTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Malus(%)')]/following::input"), "Malus(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maximumLiabilityOptionDropDown				= new PageElement(By.xpath("//td//div[contains(text(),'Maximum liability option')]/following::select"), "Maximum liability option Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfTimesTextField						= new PageElement(By.xpath("//td//div[contains(text(),'Number of Times')]/following::input"), "Number of Times Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maximumLiabilityTextField					= new PageElement(By.xpath("//td//div[contains(text(),'Maximum Liability')]/following::input"), "Maximum Liability Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		declarationFrequencyForTurnoverDropDown		= new PageElement(By.xpath("//td//div[contains(text(),'Declaration Frequency for Turnover')]/following::select"), "Declaration Frequency for Turnover Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		declarationFrequencyForOverduesDropDown		= new PageElement(By.xpath("//td//div[contains(text(),'Declaration Frequency for Overdues')]/following::select"), "Declaration Frequency for Overdues Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingManualTextField						= new PageElement(By.xpath("//td//div[contains(text(),'Loading manual')]/following::input"), "Loading manual Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountManualTextField						= new PageElement(By.xpath("//td//div[contains(text(),'Discount manual')]/following::input"), "Discount manual Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//CE
		termsOfPaymentDaysTextField =new PageElement(By.xpath("//td//div[contains(text(),'Terms of payment (Days)')]/following::input"), "Terms of payment (Days) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouWantPoliticalRiskDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Do you want Political Risk')]/following::select"), "Do you want Political Risk Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
		group0InsurableTurnoverTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group0 Insurable Turnover')]/following::input"), "Group0 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group0PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group0 Premium rate (%)')]/following::input"), "Group0 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup0TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group0')]/following::input"), "Amount of premium for Group0 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group1InsurableTurnoverTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group1 Insurable Turnover')]/following::input"), "Group1 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group1PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group1 Premium rate (%)')]/following::input"), "Group1 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup1TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group1')]/following::input"), "Amount of premium for Group1 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group2InsurableTurnoverTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group2 Insurable Turnover')]/following::input"), "Group2 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group2PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group2 Premium rate (%)')]/following::input"), "Group2 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup2TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group2')]/following::input"), "Amount of premium for Group2 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group3InsurableTurnoverTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group3 Insurable Turnover')]/following::input"), "Group3 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group3PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group3 Premium rate (%)')]/following::input"), "Group3 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup3TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group3')]/following::input"), "Amount of premium for Group3 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group4InsurableTurnoverField =new PageElement(By.xpath("//td//div[contains(text(),'Group4 Insurable Turnover')]/following::input"), "Group4 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group4PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group4 Premium rate (%)')]/following::input"), "Group4 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup4TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group4')]/following::input"), "Amount of premium for Group4 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group5InsurableTurnoverTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group5 Insurable Turnover')]/following::input"), "Group5 Insurable Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		group5PremiumRateInPercentageTextField =new PageElement(By.xpath("//td//div[contains(text(),'Group5 Premium rate (%)')]/following::input"), "Group5 Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForGroup5TextField =new PageElement(By.xpath("//td//div[contains(text(),'Amount of premium for Group5')]/following::input"), "Amount of premium for Group5 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
		nextButton		=new PageElement(By.name("Next"), " Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	=new PageElement(By.name("btnPrevious"), " previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillQuotationDetails(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity, CustomAssert assertReference){
		if(policyAttrQuotDetailEntity.getAction().equalsIgnoreCase("add") || policyAttrQuotDetailEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPolicyType")) {
				clearAndSendKeys(policyTypeTextField, policyAttrQuotDetailEntity.getStringValueForField("PolicyType"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNatureOfBusinessForCredit")) {
				clearAndSendKeys(natureOfBusinessForCreditTextField, policyAttrQuotDetailEntity.getStringValueForField("NatureOfBusinessForCredit"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTotalInsurableTurnover")) {
				clearAndSendKeys(totalInsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("TotalInsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, policyAttrQuotDetailEntity.getStringValueForField("PremiumRate"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremium")) {
				clearAndSendKeys(amountOfPremiumTextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremium"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDoYouWantPreCreditFacility")) {
				selectValueFromList(doYouWantPreCreditFacilityDropDown, policyAttrQuotDetailEntity.getStringValueForField("DoYouWantPreCreditFacility"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPreCreditInsurableTurnover")) {
				clearAndSendKeys(preCreditInsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("PreCreditInsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPreCreditPremiumRateInPercentage")) {
				clearAndSendKeys(preCreditPremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("PreCreditPremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForPreCredit")) {
				clearAndSendKeys(amountOfPremiumForPreCreditTextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForPreCredit"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTotalPremium")) {
				clearAndSendKeys(totalPremiumTextField, policyAttrQuotDetailEntity.getStringValueForField("TotalPremium"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigOptionsForMinimumRetentionPremium")) {
				selectValueFromList(optionsForMinimumRetentionPremiumDropDown, policyAttrQuotDetailEntity.getStringValueForField("OptionsForMinimumRetentionPremium"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumAmount")) {
				clearAndSendKeys(minimumRetentionPremiumAmountTextField, policyAttrQuotDetailEntity.getStringValueForField("MinimumRetentionPremiumAmount"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumPercentage")) {
				clearAndSendKeys(minimumRetentionPremiumPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("MinimumRetentionPremiumPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				clearAndSendKeys(discretionaryCreditLimitTextField, policyAttrQuotDetailEntity.getStringValueForField("DiscretionaryCreditLimit"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInsuredForDCLBuyer")) {
				clearAndSendKeys(insuredForDCLBuyerTextField, policyAttrQuotDetailEntity.getStringValueForField("InsuredForDCLBuyer"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInsuredForCLBuyer")) {
				clearAndSendKeys(insuredForCLBuyerTextField, policyAttrQuotDetailEntity.getStringValueForField("InsuredForCLBuyer"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigProcessingFee")) {
				clearAndSendKeys(processingFeeTextField, policyAttrQuotDetailEntity.getStringValueForField("ProcessingFee"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeductibleType")) {
				selectValueFromList(deductibleTypeDropDown, policyAttrQuotDetailEntity.getStringValueForField("DeductibleType"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				clearAndSendKeys(deductibleAmountTextField, policyAttrQuotDetailEntity.getStringValueForField("DeductibleAmount"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				clearAndSendKeys(annualAggregateDeductibleTextField, policyAttrQuotDetailEntity.getStringValueForField("AnnualAggregateDeductible"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumTermsOfPaymentDays")) {
				clearAndSendKeys(maximumTermsOfPaymentDaysTextField, policyAttrQuotDetailEntity.getStringValueForField("MaximumTermsOfPaymentDays"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigExtensionPeriodDays")) {
				clearAndSendKeys(extensionPeriodDaysTextField, policyAttrQuotDetailEntity.getStringValueForField("ExtensionPeriodDays"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigWaitingPeriodMonths")) {
				clearAndSendKeys(waitingPeriodMonthsTextField, policyAttrQuotDetailEntity.getStringValueForField("WaitingPeriodMonths"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigBonusInPercentage")) {
				clearAndSendKeys(bonusInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("BonusInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMalusInPercentage")) {
				clearAndSendKeys(malusInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("MalusInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumLiabilityOption")) {
				selectValueFromList(maximumLiabilityOptionDropDown, policyAttrQuotDetailEntity.getStringValueForField("MaximumLiabilityOption"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNumberOfTimes")) {
				clearAndSendKeys(numberOfTimesTextField, policyAttrQuotDetailEntity.getStringValueForField("NumberOfTimes"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				clearAndSendKeys(maximumLiabilityTextField, policyAttrQuotDetailEntity.getStringValueForField("MaximumLiability"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeclarationFrequencyForTurnover")) {
				selectValueFromList(declarationFrequencyForTurnoverDropDown, policyAttrQuotDetailEntity.getStringValueForField("DeclarationFrequencyForTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeclarationFrequencyForOverdues")) {
				selectValueFromList(declarationFrequencyForOverduesDropDown, policyAttrQuotDetailEntity.getStringValueForField("DeclarationFrequencyForOverdues"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigLoadingManual")) {
				clearAndSendKeys(loadingManualTextField, policyAttrQuotDetailEntity.getStringValueForField("LoadingManual"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDiscountManual")) {
				clearAndSendKeys(discountManualTextField, policyAttrQuotDetailEntity.getStringValueForField("DiscountManual"));
			}
			//CE
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTermsOfPaymentDays")) {
				clearAndSendKeys(termsOfPaymentDaysTextField, policyAttrQuotDetailEntity.getStringValueForField("TermsOfPaymentDays"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDoYouWantPoliticalRisk")) {
				selectValueFromList(doYouWantPoliticalRiskDropDown, policyAttrQuotDetailEntity.getStringValueForField("DoYouWantPoliticalRisk"));
			}
			
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup0InsurableTurnover")) {
				clearAndSendKeys(group0InsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("Group0InsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup0PremiumRateInPercentage")) {
				clearAndSendKeys(group0PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group0PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup0")) {
				clearAndSendKeys(amountOfPremiumForGroup0TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup0"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup1InsurableTurnover")) {
				clearAndSendKeys(group1InsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("Group1InsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup1PremiumRateInPercentage")) {
				clearAndSendKeys(group1PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group1PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup1")) {
				clearAndSendKeys(amountOfPremiumForGroup1TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup1"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup2InsurableTurnover")) {
				clearAndSendKeys(group2InsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("Group2InsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup2PremiumRateInPercentage")) {
				clearAndSendKeys(group2PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group2PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup2")) {
				clearAndSendKeys(amountOfPremiumForGroup2TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup2"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup3InsurableTurnover")) {
				clearAndSendKeys(group3InsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("Group3InsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup3PremiumRateInPercentage")) {
				clearAndSendKeys(group3PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group3PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup3")) {
				clearAndSendKeys(amountOfPremiumForGroup3TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup3"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup4InsurableTurnoverField")) {
				clearAndSendKeys(group4InsurableTurnoverField, policyAttrQuotDetailEntity.getStringValueForField("Group4InsurableTurnoverField"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup4PremiumRateInPercentage")) {
				clearAndSendKeys(group4PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group4PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup4")) {
				clearAndSendKeys(amountOfPremiumForGroup4TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup4"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup5InsurableTurnover")) {
				clearAndSendKeys(group5InsurableTurnoverTextField, policyAttrQuotDetailEntity.getStringValueForField("Group5InsurableTurnover"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup5PremiumRateInPercentage")) {
				clearAndSendKeys(group5PremiumRateInPercentageTextField, policyAttrQuotDetailEntity.getStringValueForField("Group5PremiumRateInPercentage"));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup5")) {
				clearAndSendKeys(amountOfPremiumForGroup5TextField, policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup5"));
			}

		}
		else if(policyAttrQuotDetailEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigCountryDetails")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("CountryDetails"), fetchValueFromTextFields(countryDetailsLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromTextFields(isServiceTaxExemptedLabel), AssertionType.WARNING);
			}			
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromTextFields(coInsuranceApplicableLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNameOfInsurer")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("NameOfInsurer"), fetchValueFromTextFields(nameofInsurerLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromTextFields(installmentPercentageListLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdLabel), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPolicyType")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PolicyType"), fetchValueFromTextFields(policyTypeTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNatureOfBusinessForCredit")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("NatureOfBusinessForCredit"), fetchValueFromTextFields(natureOfBusinessForCreditTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTotalInsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("TotalInsurableTurnover"), fetchValueFromTextFields(totalInsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremium")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremium"), fetchValueFromTextFields(amountOfPremiumTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDoYouWantPreCreditFacility")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DoYouWantPreCreditFacility"), fetchValueFromTextFields(doYouWantPreCreditFacilityDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPreCreditInsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PreCreditInsurableTurnover"), fetchValueFromTextFields(preCreditInsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPreCreditPremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("PreCreditPremiumRateInPercentage"), fetchValueFromTextFields(preCreditPremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForPreCredit")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForPreCredit"), fetchValueFromTextFields(amountOfPremiumForPreCreditTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigOptionsForMinimumRetentionPremium")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("OptionsForMinimumRetentionPremium"), fetchValueFromTextFields(optionsForMinimumRetentionPremiumDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumAmount")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MinimumRetentionPremiumAmount"), fetchValueFromTextFields(minimumRetentionPremiumAmountTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MinimumRetentionPremiumPercentage"), fetchValueFromTextFields(minimumRetentionPremiumPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DiscretionaryCreditLimit"), fetchValueFromTextFields(discretionaryCreditLimitTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInsuredForDCLBuyer")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("InsuredForDCLBuyer"), fetchValueFromTextFields(insuredForDCLBuyerTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInsuredForCLBuyer")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("InsuredForCLBuyer"), fetchValueFromTextFields(insuredForCLBuyerTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigProcessingFee")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("ProcessingFee"), fetchValueFromTextFields(processingFeeTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeductibleType")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DeductibleType"), fetchValueFromList(deductibleTypeDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DeductibleAmount"),fetchValueFromTextFields(deductibleAmountTextField));
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AnnualAggregateDeductible"), fetchValueFromTextFields(annualAggregateDeductibleTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumTermsOfPaymentDays")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MaximumTermsOfPaymentDays"), fetchValueFromTextFields(maximumTermsOfPaymentDaysTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigExtensionPeriodDays")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("ExtensionPeriodDays"), fetchValueFromTextFields(extensionPeriodDaysTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigWaitingPeriodMonths")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("WaitingPeriodMonths"), fetchValueFromTextFields(waitingPeriodMonthsTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigBonusInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("BonusInPercentage"), fetchValueFromTextFields(bonusInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMalusInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MalusInPercentage"), fetchValueFromTextFields(malusInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumLiabilityOption")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MaximumLiabilityOption"), fetchValueFromTextFields(maximumLiabilityOptionDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNumberOfTimes")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("NumberOfTimes"), fetchValueFromTextFields(numberOfTimesTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("MaximumLiability"), fetchValueFromTextFields(maximumLiabilityTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeclarationFrequencyForTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DeclarationFrequencyForTurnover"), fetchValueFromTextFields(declarationFrequencyForTurnoverDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDeclarationFrequencyForOverdues")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DeclarationFrequencyForOverdues"), fetchValueFromTextFields(declarationFrequencyForOverduesDropDown), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigLoadingManual")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("LoadingManual"), fetchValueFromTextFields(loadingManualTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDiscountManual")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DiscountManual"), fetchValueFromTextFields(discountManualTextField), AssertionType.WARNING);
			}
			//CE
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigTermsOfPaymentDays")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("TermsOfPaymentDays"), fetchValueFromTextFields(termsOfPaymentDaysTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDoYouWantPoliticalRisk")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("DoYouWantPoliticalRisk"), fetchValueFromTextFields(doYouWantPoliticalRiskDropDown), AssertionType.WARNING);
			}
			//
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup0InsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group0InsurableTurnover"), fetchValueFromTextFields(group0InsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup0PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group0PremiumRateInPercentage"), fetchValueFromTextFields(group0PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup0")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup0"), fetchValueFromTextFields(amountOfPremiumForGroup0TextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup1InsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group1InsurableTurnover"), fetchValueFromTextFields(group1InsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup1PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group1PremiumRateInPercentage"), fetchValueFromTextFields(group1PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup1")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup1"), fetchValueFromTextFields(amountOfPremiumForGroup1TextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup2InsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group2InsurableTurnover"), fetchValueFromTextFields(group2InsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup2PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group2PremiumRateInPercentage"), fetchValueFromTextFields(group2PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup2")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup2"), fetchValueFromTextFields(amountOfPremiumForGroup2TextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup3InsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group3InsurableTurnover"), fetchValueFromTextFields(group3InsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup3PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group3PremiumRateInPercentage"), fetchValueFromTextFields(group3PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup3")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup3"), fetchValueFromTextFields(amountOfPremiumForGroup3TextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup4InsurableTurnoverField")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group4InsurableTurnoverField"), fetchValueFromTextFields(group4InsurableTurnoverField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup4PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group4PremiumRateInPercentage"), fetchValueFromTextFields(group4PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup4")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup4"), fetchValueFromTextFields(amountOfPremiumForGroup4TextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup5InsurableTurnover")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group5InsurableTurnover"), fetchValueFromTextFields(group5InsurableTurnoverTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigGroup5PremiumRateInPercentage")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("Group5PremiumRateInPercentage"), fetchValueFromTextFields(group5PremiumRateInPercentageTextField), AssertionType.WARNING);
			}
			if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAmountOfPremiumForGroup5")) {
				assertReference.assertEquals(policyAttrQuotDetailEntity.getStringValueForField("AmountOfPremiumForGroup5"), fetchValueFromTextFields(amountOfPremiumForGroup5TextField), AssertionType.WARNING);
				
			} 

		}

	}


	public void nextToPolicyDetails(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity) {
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			policyDetailsTitle  =new PageElement(By.xpath("//div/b[contains(text(),'"+policyAttrQuotDetailEntity.getStringValueForField("PolicyAttrQuotDetailTitle")+"')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			if(isElementDisplayed(policyDetailsTitle));
		}
	}
	public void backToPolicyDetails(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity) {
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			if(isElementDisplayed( CDPolicyDetailsTitle));
			return;

		}
	}
	public void navigateTobackAttributePage(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity) {
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			return;

		}
	}
	public void navigateToPolicy(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity){
		if (policyAttrQuotDetailEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyAttrQuotDetail(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyAttrQuotDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillQuotationDetails(policyAttrQuotDetailEntity,assertReference);
			nextToPolicyDetails(policyAttrQuotDetailEntity);
			backToPolicyDetails(policyAttrQuotDetailEntity);
			navigateTobackAttributePage(policyAttrQuotDetailEntity);
			navigateToPolicy(policyAttrQuotDetailEntity);
			//navigateToAttribute(policyAttrQuotDetailEntity);
			navigateToInsuredInterest(policyAttrQuotDetailEntity);
			navigateToCoverage(policyAttrQuotDetailEntity);
			navigateToLoan(policyAttrQuotDetailEntity);
			navigateToClientDetails(policyAttrQuotDetailEntity);
			navigateToRelation(policyAttrQuotDetailEntity);
			navigateToPayment(policyAttrQuotDetailEntity);
			navigateToFollowup(policyAttrQuotDetailEntity);
			navigateToDocument(policyAttrQuotDetailEntity);
			
		}
	}

}

