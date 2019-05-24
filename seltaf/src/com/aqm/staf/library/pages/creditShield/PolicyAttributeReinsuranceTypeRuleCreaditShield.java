package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrReinTypeRuleCSEntity;

public class PolicyAttributeReinsuranceTypeRuleCreaditShield extends BasePage{
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

	private PageElement reinsuranceTypeRuleTitle;	
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement typeOfDevelopmentOfficerTitle; 

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	
	private PageElement countryDetailsLabel;
	private PageElement isServiceTaxExemptedLabel;
	private PageElement coInsuranceApplicableLabel;
	private PageElement nameOfInsurerLabel;
	private PageElement installmentPercentageListLabel;
	private PageElement opportunityIdLabel;
	private PageElement policyTypeLabel;
	private PageElement natureOfBusinessForCreditLabel;
	private PageElement totalInsurableTurnoverLabel;
	private PageElement premiumRateLabel;
	private PageElement amountOfPremiumLabel;
	private PageElement doYouWantPreCreditFacilityLabel;
	private PageElement preCreditInsurableTurnoverLabel;
	private PageElement preCreditPremiumRateLabel;
	private PageElement amountOfPremiumForPreCreditLabel;
	private PageElement totalPremiumLabel;
	private PageElement optionsForMinimumRetentionPremiumLabel;
	private PageElement minimumRetentionPremiumAmountLabel;
	private PageElement minimumRetentionPremiumLabel;
	private PageElement discretionaryCreditLimitLabel;
	private PageElement insuredForDCLBuyerLabel;
	private PageElement insuredForCLBuyerLabel;
	private PageElement processingFeeLabel;
	private PageElement deductibleTypeLabel;
	private PageElement deductibleAmountLabel;
	private PageElement annualAggregateDeductibleLabel;
	private PageElement maximumTermsOfPaymentLabel;
	private PageElement extensionPeriodLabel;
	private PageElement waitingPeriodLabel;
	private PageElement bonusLabel;
	private PageElement malusLabel;
	private PageElement maximumLiabilityOptionLabel;
	private PageElement numberOfTimesLabel;
	private PageElement maximumLiabilityLabel;
	private PageElement declarationFrequencyForTurnoverLabel;
	private PageElement declarationFrequencyForOverduesLabel;
	private PageElement loadingManualLabel;
	private PageElement DiscountManualLabel;
	private PageElement dummy2Label;
	private PageElement serialNumberLabel;
	private PageElement bankNameLabel;
	private PageElement bankCodeLabel;
	private PageElement addressofBankLabel;
	private PageElement pinCodeLabel;
	private PageElement previousPolicyNumberLabel;
	private PageElement previousPolicyPeriodLabel;
	private PageElement previousPremiumPaidLabel;
	private PageElement totalNumberofClaimsRegisteredLabel;
	private PageElement claimPaidLabel;
	private PageElement claimsIncurredLabel;
	private PageElement incurredClaimRatioPercentageLabel;
	private PageElement remarksLabel;
	private PageElement typeofDevelopmentOfficerLabel;
	private PageElement uniqueIdentificationcodeforpolicyLabel;
	private PageElement uniqueIdentificationcodeforendtLabel;
	private PageElement dummyT3CLRLabel;
	private PageElement dummyT3PLRLabel;
	private PageElement dummycoinLabel;
	private PageElement dummy11Label;
	private PageElement reinsuranceTypeDropDownList;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;

	public PolicyAttributeReinsuranceTypeRuleCreaditShield(WebDriver driver, String pageName) {
		super(driver, pageName);
		reinsuranceTypeRuleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Reinsurance Type Rule')]"), "Reinsurance Type Rule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest')]"), "Insured Intrest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		countryDetailsLabel=new PageElement(By.xpath("///form[@name='S0042']//tr//td[contains(text(),'Country Details')]/following::td"), "Country Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		isServiceTaxExemptedLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Is Service Tax Exempted')]/following::td"), "Is Service Tax Exempted Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		coInsuranceApplicableLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Co-Insurance Applicable Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfInsurerLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Name of Insurer')]/following::td"), "Name of Insurer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Installment Percentage List')]/following::td"), "Installment Percentage List Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		opportunityIdLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Opportunity Id')]/following::td"), "Opportunity Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Policy type')]/following::td"), "Policy type Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfBusinessForCreditLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Nature of Business for Credit')]/following::td"), "Nature of Business for Credit Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalInsurableTurnoverLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Total Insurable Turnover')]/following::td"), "Total Insurable Turnover Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRateLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Premium rate (%)')]/following::td"), "Premium rate (%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfPremiumLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Amount of premium')]/following::td"), "Amount of premium Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouWantPreCreditFacilityLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Do you want Pre Credit facility?')]/following::td"), "Do you want Pre Credit facility? Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preCreditInsurableTurnoverLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Pre Credit Insurable Turnover')]/following::td"), "Pre Credit Insurable Turnover Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preCreditPremiumRateLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Pre Credit Premium rate (%)')]/following::td"), "Pre Credit Premium rate (%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfPremiumForPreCreditLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Amount of premium for Pre Credit')]/following::td"), "Amount of premium for Pre Credit Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Total Premium')]/following::td"), "Total Premium Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionsForMinimumRetentionPremiumLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Options for Minimum Retention Premium')]/following::td"), "Options for Minimum Retention Premium Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minimumRetentionPremiumAmountLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Minimum Retention Premium Amount')]/following::td"), "Minimum Retention Premium Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minimumRetentionPremiumLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Minimum Retention Premium (%)')]/following::td"), "Minimum Retention Premium (%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryCreditLimitLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Discretionary Credit Limit (DCL)')]/following::td"), "Discretionary Credit Limit (DCL) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredForDCLBuyerLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Insured (%) for DCL Buyer')]/following::td"), "Insured (%) for DCL Buyer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredForCLBuyerLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Insured (%) for CL Buyer')]/following::td"), "Insured (%) for CL Buyer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		processingFeeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Processing Fee')]/following::td"), "Processing Fee Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleTypeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Deductible Type')]/following::td"), "Deductible Type Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Deductible  Amount')]/following::td"), "Deductible Amount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		annualAggregateDeductibleLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Annual Aggregate Deductible')]/following::td"), "Annual Aggregate Deductible Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumTermsOfPaymentLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Maximum Terms of payment (Days)')]/following::td"), "Maximum Terms of payment (Days) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionPeriodLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Extension period (Days)')]/following::td"), "Extension period (Days) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		waitingPeriodLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Waiting period (Months)')]/following::td"), "Waiting period (Months) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bonusLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Bonus(%)')]/following::td"), "Bonus(%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		malusLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Malus(%)')]/following::td"), "Malus(%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumLiabilityOptionLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Maximum liability option')]/following::td"), "Maximum liability option Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfTimesLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Number of Times')]/following::td"), "Number of Times Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumLiabilityLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Maximum Liability')]/following::td"), "Maximum Liability Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationFrequencyForTurnoverLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Declaration Frequency for Turnover')]/following::td"), "Declaration Frequency for Turnover Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationFrequencyForOverduesLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Declaration Frequency for Overdues')]/following::td"), "Declaration Frequency for Overdues Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingManualLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Loading manual')]/following::td"), "Loading manual Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DiscountManualLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Discount manual')]/following::td"), "Discount manual Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummy2Label=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummy2')]/following::td"), "dummy2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNumberLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Serial Number')]/following::td"), "Serial Number  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankNameLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Bank Name')]/following::td"), "Bank Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankCodeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Bank Code')]/following::td"), "Bank Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressofBankLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Address of Bank')]/following::td"), "Address of Bank  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Pin Code')]/following::td"), "Pin Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Previous Policy Number')]/following::td"), "Previous Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Previous Policy Period')]/following::td"), "Previous Policy Period Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPremiumPaidLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Previous Premium Paid')]/following::td"), "Previous Premium Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberofClaimsRegisteredLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Total Number of Claims Registered')]/following::td"), "Total Number of Claims Registered Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaidLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Claims Paid')]/following::td"), "Claims Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Claims Incurred')]/following::td"), "Claims Incurred Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioPercentageLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Incurred Claim Ratio')]/following::td"), "Incurred Claim Ratio Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Remarks')]/following::td"), "Remarks Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofDevelopmentOfficerLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Type of Development Officer')]/following::td"), "Type of Development Officer Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationcodeforpolicyLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Unique Identification code for policy')]/following::td"), "Unique Identification code for policy Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationcodeforendtLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Unique Identification code for endt')]/following::td"), "Unique Identification code for endt Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyT3CLRLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummyT3-CLR')]/following::td"), "dummyT3-CLR Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummyT3PLRLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummyT3-PLR')]/following::td"), "dummyT3-PLR  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummycoinLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummycoin')]/following::td"), "dummycoin Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummy11Label=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummy11')]/following::td"), "dummy11 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinsuranceTypeDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Reinsurance Type')]/following::select"), "Reinsurance Type Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfDevelopmentOfficerTitle=new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]"), "Type Of Development Officer Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillpolicyAttributeHealthDetails(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS, CustomAssert assertReference){
		if(polAttrReinsuranceTypeRuleCS.getAction().equalsIgnoreCase("add") || polAttrReinsuranceTypeRuleCS.getAction().equalsIgnoreCase("edit")){
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigReinsuranceType")) {
				selectValueFromList(reinsuranceTypeDropDownList, polAttrReinsuranceTypeRuleCS.getStringValueForField("ReinsuranceType"));
			}
		}
		else if(polAttrReinsuranceTypeRuleCS.getAction().equalsIgnoreCase("verify")){

			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("CoInsuranceApplicable"), fetchValueFromTextFields(coInsuranceApplicableLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigNameofInsurer")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("NameofInsurer"), fetchValueFromTextFields(nameOfInsurerLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("InstallmentPercentageList"), fetchValueFromTextFields(installmentPercentageListLabel), AssertionType.WARNING);
			}	
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPolicyType")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Policytype"), fetchValueFromTextFields(policyTypeLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigNatureofBusinessforCredit")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("NatureofBusinessforCredit"), fetchValueFromTextFields(natureOfBusinessForCreditLabel), AssertionType.WARNING);
			}	
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigTotalInsurableTurnover")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("TotalInsurableTurnover"), fetchValueFromTextFields(totalInsurableTurnoverLabel), AssertionType.WARNING);
			}	
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigAmountofPremium")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("AmountofPremium"), fetchValueFromTextFields(amountOfPremiumLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDoYouWantPreCreditfacility")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DoYouWantPreCreditfacility"), fetchValueFromTextFields(doYouWantPreCreditFacilityLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreCreditInsurableTurnover")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PreCreditInsurableTurnover"), fetchValueFromTextFields(preCreditInsurableTurnoverLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreCreditPremiumRate")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PreCreditPremiumRate"), fetchValueFromTextFields(preCreditPremiumRateLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigAmountofpremiumforPreCredit")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("AmountofpremiumforPreCredit"), fetchValueFromTextFields(amountOfPremiumForPreCreditLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigOptionsforMinimumRetentionPremium")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("OptionsforMinimumRetentionPremium"), fetchValueFromTextFields(optionsForMinimumRetentionPremiumLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMinimumRetentionPremiumAmount")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("MinimumRetentionPremiumAmount"), fetchValueFromTextFields(minimumRetentionPremiumAmountLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMinimumRetentionPremium")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("MinimumRetentionPremium"), fetchValueFromTextFields(minimumRetentionPremiumLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DiscretionaryCreditLimit"), fetchValueFromTextFields(discretionaryCreditLimitLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigInsuredPercentageForDCLBuyer")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("InsuredPercentageForDCLBuyer"), fetchValueFromTextFields(insuredForDCLBuyerLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigInsuredPercentageforCLBuyer")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("InsuredPercentageforCLBuyer"), fetchValueFromTextFields(insuredForCLBuyerLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigProcessingFee")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ProcessingFee"), fetchValueFromTextFields(processingFeeLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDeductibleType")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DeductibleType"), fetchValueFromTextFields(deductibleTypeLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDeductibleAmount")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DeductibleAmount"), fetchValueFromTextFields(deductibleAmountLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("AnnualAggregateDeductible"), fetchValueFromTextFields(annualAggregateDeductibleLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMaximumTermsofPayment")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("MaximumTermsofPayment"), fetchValueFromTextFields(maximumTermsOfPaymentLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigExtensionPeriod")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ExtensionPeriod"), fetchValueFromTextFields(extensionPeriodLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigWaitingperiodMonth")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("WaitingperiodMonth"), fetchValueFromTextFields(waitingPeriodLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigBonusPercentage")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("BonusPercentage"), fetchValueFromTextFields(bonusLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMalusPercentage")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("MalusPercentage"), fetchValueFromTextFields(malusLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMaximumliabilityoption")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Maximumliabilityoption"), fetchValueFromTextFields(maximumLiabilityOptionLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigNumberofTimes")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("NumberofTimes"), fetchValueFromTextFields(numberOfTimesLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigMaximumLiability")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("MaximumLiability"), fetchValueFromTextFields(maximumLiabilityLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDeclarationFrequencyforTurnover")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DeclarationFrequencyforTurnover"), fetchValueFromTextFields(declarationFrequencyForTurnoverLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDeclarationFrequencyforOverdues")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DeclarationFrequencyforOverdues"), fetchValueFromTextFields(declarationFrequencyForOverduesLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigLoadingManual")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("LoadingManual"), fetchValueFromTextFields(loadingManualLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDiscountManual")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DiscountManual"), fetchValueFromTextFields(DiscountManualLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDummy2")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Dummy2"), fetchValueFromTextFields(dummy2Label), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigSerialNumber")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("SerialNumber"), fetchValueFromTextFields(serialNumberLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigBankName")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("BankName"), fetchValueFromTextFields(bankNameLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigBankCode")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("BankCode"), fetchValueFromTextFields(bankCodeLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigAddressofBank")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("AddressofBank"), fetchValueFromTextFields(addressofBankLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PreviousPolicyPeriod"), fetchValueFromTextFields(previousPolicyPeriodLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreviousPremiumPaid")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("PreviousPremiumPaid"), fetchValueFromTextFields(previousPremiumPaidLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("NumberofClaimsRegistered"), fetchValueFromTextFields(totalNumberofClaimsRegisteredLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigClaimsPaid")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimPaidLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigClaimsIncurred")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioPercentageLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigTypeofDevelopmentOfficer")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("TypeofDevelopmentOfficer"), fetchValueFromTextFields(typeofDevelopmentOfficerLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigUniqueIdentificationCodeforPolicy")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("UniqueIdentificationCodeforPolicy"), fetchValueFromTextFields(uniqueIdentificationcodeforpolicyLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigUniqueIdentificationCodeforEndt")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("UniqueIdentificationCodeforEndt"), fetchValueFromTextFields(uniqueIdentificationcodeforendtLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDummyT3CLR")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DummyT3CLR"), fetchValueFromTextFields(dummyT3CLRLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDummyT3PLR")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("DummyT3PLR"), fetchValueFromTextFields(dummyT3PLRLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDummycoin")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Dummycoin"), fetchValueFromTextFields(dummycoinLabel), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDummy11")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("Dummy11"), fetchValueFromTextFields(dummy11Label), AssertionType.WARNING);
			}
			if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigReinsuranceType")) {
				assertReference.assertEquals(polAttrReinsuranceTypeRuleCS.getStringValueForField("ReinsuranceType"), fetchValueFromList(reinsuranceTypeDropDownList), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}


	}
	public void navigateToPayment(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateTobackTypeOfDevelopmentOfficerPage(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(typeOfDevelopmentOfficerTitle);
		}
	}
	public void submitTReinsuranceTypeRuleDetails(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(reinsuranceTypeRuleTitle);
		}
	}
	public void navigateToPrevoiusTypeOfDevelopmentOfficerPage(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(typeOfDevelopmentOfficerTitle);
		}
	}
	public void clickOnForwordButton(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS){
		if (polAttrReinsuranceTypeRuleCS.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			//isElementDisplayed(reinsuranceTypeRuleTitle);
		}
	}
	public void fillandSubmitPolicyAttributeReinsuranceTypeRuleCreaditShield(PolAttrReinTypeRuleCSEntity polAttrReinsuranceTypeRuleCS, CustomAssert assertReference) {
		if(isConfigTrue(polAttrReinsuranceTypeRuleCS.getConfigExecute())){
			switchToFrame("display");
			fillpolicyAttributeHealthDetails(polAttrReinsuranceTypeRuleCS,assertReference);
			clickOnForwordButton(polAttrReinsuranceTypeRuleCS);
			submitTReinsuranceTypeRuleDetails(polAttrReinsuranceTypeRuleCS);
			navigateToPolicy(polAttrReinsuranceTypeRuleCS);
			navigateToAttribute(polAttrReinsuranceTypeRuleCS);
			navigateToInsuredInterest(polAttrReinsuranceTypeRuleCS);
			navigateToCoverage(polAttrReinsuranceTypeRuleCS);
			navigateToLoan(polAttrReinsuranceTypeRuleCS);
			navigateToClientDetails(polAttrReinsuranceTypeRuleCS);
			navigateToRelation(polAttrReinsuranceTypeRuleCS);
			navigateToPayment(polAttrReinsuranceTypeRuleCS);
			navigateToFollowup(polAttrReinsuranceTypeRuleCS);
			navigateToDocument(polAttrReinsuranceTypeRuleCS);
		}
	}
}
