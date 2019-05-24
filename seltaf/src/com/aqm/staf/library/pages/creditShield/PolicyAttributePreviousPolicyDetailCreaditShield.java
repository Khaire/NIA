package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PrePolDetailCreditShldEntity;


public class PolicyAttributePreviousPolicyDetailCreaditShield extends BasePage {

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

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;

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
	private PageElement typeOfDevelopmentOfficerTitle;
	private PageElement policyDetailsTitle;

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
	private PageElement discountManualLabel;
	private PageElement dummy2Label;
	private PageElement serialNumberLabel;
	private PageElement bankNameLabel;
	private PageElement bankCodeLabel;
	private PageElement addressOfBankLabel;
	private PageElement pinCodeLabel;

	private PageElement previousPolicyNumberTextBox;
	private PageElement previousPolicyPeriodTextArea;
	private PageElement previousPremiumPaidTextBox;
	private PageElement totalNumberOfClaimsRegisteredTextBox;
	private PageElement claimsPaidTextBox;
	private PageElement claimsIncurredTextBox;
	private PageElement incurredClaimRatioTextBox;
	private PageElement remarksTextArea;

	private PageElement forwordButton;
	private PageElement backwordButton;
	private PageElement backButton;




	public PolicyAttributePreviousPolicyDetailCreaditShield(WebDriver driver, String pageName) {
		super(driver, pageName);
		//PolicyAttributePreviousPolicyDetailCreaditShield =new PageElement(By.xpath("")]"), "Policy Attribute Previous Policy Detail CreaditShield Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		quoteNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		discountManualLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Discount manual')]/following::td"), "Discount manual Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dummy2Label=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'dummy2')]/following::td"), "dummy2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNumberLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Serial Number')]/following::td"), "Serial Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankNameLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Bank Name')]/following::td"), "Bank Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankCodeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Bank Code')]/following::td"), "Bank Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfBankLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Address of Bank')]/following::td"), "Address of Bank Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeLabel=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Pin Code')]/following::td"), "Pin Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		previousPolicyNumberTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Period')]/following::textarea"), "Previous Policy Period Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPremiumPaidTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Previous Premium Paid')]/following::input"), "Previous Premium Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberOfClaimsRegisteredTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Total Number of Claims Registered')]/following::input"), "Total Number of Claims Registered Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Claims Paid')]/following::input"), "Claims Paid Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Claims Incurred')]/following::input"), "Claims Incurred Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioTextBox=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim Ratio (%)')]/following::input"), "Incurred Claim Ratio (%) Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Remarks')]/following::textarea"), "Remarks Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwordButton=new PageElement(By.name("btnPrevious"), "go to backword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle=  new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfDevelopmentOfficerTitle=new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]"), "Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Details')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);



	}
	public void fillPolicyAttributePreviousPolicyDetailCreaditShield(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity, CustomAssert assertReference){
		if(prePolDetailCreditShldEntity.getAction().equalsIgnoreCase("add") || prePolDetailCreditShldEntity.getAction().equalsIgnoreCase("edit")){

			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextBox, prePolDetailCreditShldEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				clearAndSendKeys(previousPolicyPeriodTextArea, prePolDetailCreditShldEntity.getStringValueForField("PreviousPolicyPeriod"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPremiumPaid")) {
				clearAndSendKeys(previousPremiumPaidTextBox, prePolDetailCreditShldEntity.getStringValueForField("PreviousPremiumPaid"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigTotalNumberOfClaimsRegistered")) {
				clearAndSendKeys(totalNumberOfClaimsRegisteredTextBox, prePolDetailCreditShldEntity.getStringValueForField("TotalNumberOfClaimsRegistered"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				clearAndSendKeys(claimsPaidTextBox, prePolDetailCreditShldEntity.getStringValueForField("ClaimsPaid"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				clearAndSendKeys(claimsIncurredTextBox, prePolDetailCreditShldEntity.getStringValueForField("ClaimsIncurred"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				clearAndSendKeys(incurredClaimRatioTextBox, prePolDetailCreditShldEntity.getStringValueForField("IncurredClaimRatio"));
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextArea, prePolDetailCreditShldEntity.getStringValueForField("Remarks"));
			}

		}
		else if(prePolDetailCreditShldEntity.getAction().equalsIgnoreCase("verify")){
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}			
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigCountryDetails")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("CountryDetails"), fetchValueFromTextFields(countryDetailsLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromTextFields(isServiceTaxExemptedLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromTextFields(coInsuranceApplicableLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigNameOfInsurer")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("NameOfInsurer"), fetchValueFromTextFields(nameOfInsurerLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromTextFields(installmentPercentageListLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPolicyType")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PolicyType"), fetchValueFromTextFields(policyTypeLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigNatureOfBusinessForCredit")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("NatureOfBusinessForCredit"), fetchValueFromTextFields(natureOfBusinessForCreditLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigTotalInsurableTurnover")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("TotalInsurableTurnover"), fetchValueFromTextFields(totalInsurableTurnoverLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigAmountOfPremium")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("AmountOfPremium"), fetchValueFromTextFields(amountOfPremiumLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDoYouWantPreCreditFacility")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DoYouWantPreCreditFacility"), fetchValueFromTextFields(doYouWantPreCreditFacilityLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreCreditInsurableTurnoverLabel")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PreCreditInsurableTurnoverLabel"), fetchValueFromTextFields(preCreditInsurableTurnoverLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreCreditPremiumRateLabel")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PreCreditPremiumRateLabel"), fetchValueFromTextFields(preCreditPremiumRateLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigAmountOfPremiumForPreCredit")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("AmountOfPremiumForPreCredit"), fetchValueFromTextFields(amountOfPremiumForPreCreditLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigTotalPremiumLabel")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("TotalPremiumLabel"), fetchValueFromTextFields(totalPremiumLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigOptionsForMinimumRetentionPremium")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("OptionsForMinimumRetentionPremiumLabel"), fetchValueFromTextFields(optionsForMinimumRetentionPremiumLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumAmount")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("MinimumRetentionPremiumAmount"), fetchValueFromTextFields(minimumRetentionPremiumAmountLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMinimumRetentionPremium")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("MinimumRetentionPremium"), fetchValueFromTextFields(minimumRetentionPremiumLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DiscretionaryCreditLimit"), fetchValueFromTextFields(discretionaryCreditLimitLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigInsuredForDCLBuyer")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("InsuredForDCLBuyer"), fetchValueFromTextFields(insuredForDCLBuyerLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigInsuredForCLBuyer")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("InsuredForCLBuyer"), fetchValueFromTextFields(insuredForCLBuyerLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigProcessingFee")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("ProcessingFee"), fetchValueFromTextFields(processingFeeLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDeductibleType")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DeductibleType"), fetchValueFromTextFields(deductibleTypeLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DeductibleAmount"), fetchValueFromTextFields(deductibleAmountLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("AnnualAggregateDeductible"), fetchValueFromTextFields(annualAggregateDeductibleLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMaximumTermsOfPayment")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("MaximumTermsOfPayment"), fetchValueFromTextFields(maximumTermsOfPaymentLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigExtensionPeriod")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("ExtensionPeriod"), fetchValueFromTextFields(extensionPeriodLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigWaitingPeriod")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("WaitingPeriod"), fetchValueFromTextFields(waitingPeriodLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigBonus")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("Bonus"), fetchValueFromTextFields(bonusLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMalus")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("Malus"), fetchValueFromTextFields(malusLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMaximumLiabilityOption")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("MaximumLiabilityOption"), fetchValueFromTextFields(maximumLiabilityOptionLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigNumberOfTimes")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("NumberOfTimes"), fetchValueFromTextFields(numberOfTimesLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("MaximumLiability"), fetchValueFromTextFields(maximumLiabilityLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDeclarationFrequencyForTurnover")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DeclarationFrequencyForTurnover"), fetchValueFromTextFields(declarationFrequencyForTurnoverLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDeclarationFrequencyForOverdues")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DeclarationFrequencyForOverdues"), fetchValueFromTextFields(declarationFrequencyForOverduesLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigLoadingManual")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("LoadingManual"), fetchValueFromTextFields(loadingManualLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDiscountManual")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("DiscountManual"), fetchValueFromTextFields(discountManualLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDummy2")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("Dummy2"), fetchValueFromTextFields(dummy2Label), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigSerialNumber")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("SerialNumber"), fetchValueFromTextFields(serialNumberLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigBankName")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("BankName"), fetchValueFromTextFields(bankNameLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigBankCode")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("BankCode"), fetchValueFromTextFields(bankCodeLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigAddressOfBank")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("AddressOfBank"), fetchValueFromTextFields(addressOfBankLabel), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeLabel), AssertionType.WARNING);
			}
			//
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PreviousPolicyPeriod"), fetchValueFromTextFields(previousPolicyPeriodTextArea), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPreviousPremiumPaid")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("PreviousPremiumPaid"), fetchValueFromTextFields(previousPremiumPaidTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigTotalNumberOfClaimsRegistered")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("TotalNumberOfClaimsRegistered"), fetchValueFromTextFields(totalNumberOfClaimsRegisteredTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimsPaidTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioTextBox), AssertionType.WARNING);
			}
			if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(prePolDetailCreditShldEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextArea), AssertionType.WARNING);
			}
		
			
			
			
		
		}
	}

	public void navigateToPolicy(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}

	public void navigateToClientDetails(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void navigateToBackAttribute(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToForwordPolicyAttribute(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch (Exception e){

			}
			switchToFrame("display");
			isElementDisplayed(typeOfDevelopmentOfficerTitle);
		}
	}

	public void navigateToBackwordPolicyAttribute(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity){
		if (prePolDetailCreditShldEntity.getBooleanValueForField("ConfigBackwordButton")){		
			click(backwordButton);
			switchToFrame("display");
			isElementDisplayed(policyDetailsTitle);
		}
	}
	public void fillandSubmitPolicyAttributePreviousPolicyDetailCreaditShield(PrePolDetailCreditShldEntity prePolDetailCreditShldEntity, CustomAssert assertReference) {
		if(isConfigTrue(prePolDetailCreditShldEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePreviousPolicyDetailCreaditShield(prePolDetailCreditShldEntity, assertReference);
			navigateToForwordPolicyAttribute(prePolDetailCreditShldEntity);
			navigateToBackwordPolicyAttribute(prePolDetailCreditShldEntity);
			navigateToBackAttribute(prePolDetailCreditShldEntity);
			navigateToPolicy(prePolDetailCreditShldEntity);
			navigateToAttribute(prePolDetailCreditShldEntity);
			navigateToInsuredInterest(prePolDetailCreditShldEntity);
			navigateToCoverage(prePolDetailCreditShldEntity);
			navigateToLoan(prePolDetailCreditShldEntity);
			navigateToClientDetails(prePolDetailCreditShldEntity);
			navigateToRelation(prePolDetailCreditShldEntity);
			navigateToPayment(prePolDetailCreditShldEntity);
			navigateToFollowup(prePolDetailCreditShldEntity);
			navigateToDocument(prePolDetailCreditShldEntity);
		}
	}
}

