package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.hibernate.CustomizableEntity;
import com.aqm.staf.library.databin.PolicyAttPolDetailsCSEntity;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;

public class PolicyAttributePolicyDetailsCreaditShield extends BasePage{
	private PageElement policyDetailsTitle;

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

	private PageElement countryDetailsLabel;
	private PageElement isServiceTaxExemptedLabel;
	private PageElement coInsuranceApplicableLable;
	private PageElement installmentPercentageListLable;
	private PageElement policyTypeLable;
	private PageElement totalInsurableTurnoverLable;
	private PageElement amountOfPremiumLable;
	private PageElement preCreditInsurableTurnoverLable;
	private PageElement amountOfPremiumForPreCreditLable;
	private PageElement optionsForMinimumRetentionPremiumLable;
	private PageElement minimumRetentionPremiumPercentageLable;
	private PageElement insuredPercentforDCLBuyerLable;
	private PageElement processingFeeLable;
	private PageElement deductibleAmountLable;
	private PageElement maximumTermsOfPaymentDaysLable;
	private PageElement waitingPeriodInMonthsLable;
	private PageElement malusPercentLable;
	private PageElement numberOfTimesLable;
	private PageElement declarationFrequencyForTurnoverLable;
	private PageElement loadingManualLable;
	private PageElement nameOfInsurerLable;
	private PageElement opportunityIdLable;
	private PageElement natureOfBusinessForCreditLable;
	private PageElement premiumRatePercentLable;
	private PageElement doYouWantPreCreditfacilityLable;
	private PageElement preCreditPremiumRatePercentageLable;
	private PageElement totalPremiumLable;
	private PageElement minimumRetentionPremiumAmountLable;
	private PageElement discretionaryCreditLimitDCLLable;
	private PageElement insuredPercentForCLBuyerLable;
	private PageElement deductibleTypeLable;
	private PageElement annualAggregateDeductibleLable;
	private PageElement extensionPeriodDaysLable;
	private PageElement bonusPercentLable;
	private PageElement maximumLiabilityOptionLable;
	private PageElement maximumLiabilityLable;
	private PageElement declarationFrequencyForOverduesLable;
	private PageElement discountManualLable;

	private PageElement serialNumberTextField;
	private PageElement bankNameDropDown;
	private PageElement bankCodeTextField;
	private PageElement addressOfBankTextArea;
	private PageElement pinCodeDropDown;

	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;


	public PolicyAttributePolicyDetailsCreaditShield (WebDriver driver, String pageName) {
		super(driver, pageName);

		policyDetailsTitle	= new PageElement(By.xpath("//div/b[contains(text(),'Policy Details')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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

		countryDetailsLabel						=new PageElement(By.xpath("///form[@name='S0042']//tr//td[contains(text(),'Country Details')]/following::td"), "Country Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		isServiceTaxExemptedLabel				=new PageElement(By.xpath("//form[@name='S0042']//tr//td[contains(text(),'Is Service Tax Exempted')]/following::td"), "Is Service Tax Exempted Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);;
		coInsuranceApplicableLable				= new PageElement(By.xpath("//td[contains(text(),'Co-Insurance Applicable')]/following::td"), "Co-Insurance Applicable Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListLable  		= new PageElement(By.xpath("//td[contains(text(),'Installment Percentage List')]/following::td"), "Installment Percentage List Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeLable							= new PageElement(By.xpath("//td[contains(text(),'Policy  type')]/following::td"), "Policy  type Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalInsurableTurnoverLable				= new PageElement(By.xpath("//td[contains(text(),'Total Insurable Turnover')]/following::td"), "Total Insurable Turnover Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfPremiumLable					= new PageElement(By.xpath("//td[contains(text(),'Amount of premium')]/following::td"), "Amount of premium Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preCreditInsurableTurnoverLable			= new PageElement(By.xpath("//td[contains(text(),'Pre Credit Insurable Turnover')]/following::td"), "Pre Credit Insurable Turnover Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfPremiumForPreCreditLable		= new PageElement(By.xpath("//td[contains(text(),'Amount of premium for Pre Credit')]/following::td"), "Amount of premium for Pre Credit Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionsForMinimumRetentionPremiumLable	= new PageElement(By.xpath("//td[contains(text(),'Options for Minimum Retention Premium')]/following::td"), "Options for Minimum Retention Premium Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minimumRetentionPremiumPercentageLable	= new PageElement(By.xpath("//td[contains(text(),'Minimum Retention Premium (%)')]/following::td"), "Minimum Retention Premium (%) Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredPercentforDCLBuyerLable			= new PageElement(By.xpath("//td[contains(text(),'Insured (%) for DCL Buyer')]/following::td"), "Insured in Percent for DCL Buyer Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		processingFeeLable						= new PageElement(By.xpath("//td[contains(text(),'Processing Fee')]/following::td"), "Processing Fee Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountLable					= new PageElement(By.xpath("//td[contains(text(),'Deductible  Amount')]/following::td"), "Deductible Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumTermsOfPaymentDaysLable			= new PageElement(By.xpath("//td[contains(text(),'Maximum Terms of payment (Days)')]/following::td"), "Maximum Terms of payment (Days) Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		waitingPeriodInMonthsLable				= new PageElement(By.xpath("//td[contains(text(),'Waiting period (Months)')]/following::td"), "Waiting period Months Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		malusPercentLable						= new PageElement(By.xpath("//td[contains(text(),'Malus(%)')]/following::td"), "Malus Percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfTimesLable						= new PageElement(By.xpath("//td[contains(text(),'Number of Times')]/following::td"), "Number of Times Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationFrequencyForTurnoverLable	= new PageElement(By.xpath("//td[contains(text(),'Declaration Frequency for Turnover')]/following::td"), "Declaration Frequency for Turnover Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingManualLable						= new PageElement(By.xpath("//td[contains(text(),'Loading manual')]/following::td"), "Loading manual Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfInsurerLable						= new PageElement(By.xpath("//td[contains(text(),'Name of Insurer')]/following::td"), "Name of Insurer Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		opportunityIdLable						= new PageElement(By.xpath("//td[contains(text(),'Opportunity Id')]/following::td"), "Opportunity Id Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfBusinessForCreditLable			= new PageElement(By.xpath("//td[contains(text(),'Nature of Business for Credit')]/following::td"), "Nature of Business for Credit Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRatePercentLable					= new PageElement(By.xpath("//td[contains(text(),'Premium rate (%)')]/following::td"), "Premium rate Percent Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouWantPreCreditfacilityLable			= new PageElement(By.xpath("//td[contains(text(),'Do you want Pre Credit facility?')]/following::td"), "Do you want Pre Credit facility Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preCreditPremiumRatePercentageLable		= new PageElement(By.xpath("//td[contains(text(),'Pre Credit Premium rate (%)')]/following::td"), "Pre Credit Premium rate Percent Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumLable						= new PageElement(By.xpath("//td[contains(text(),'Total Premium')]/following::td"), "Total Premium Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minimumRetentionPremiumAmountLable		= new PageElement(By.xpath("//td[contains(text(),'Minimum Retention Premium Amount')]/following::td"), "Minimum Retention Premium Amount Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryCreditLimitDCLLable		= new PageElement(By.xpath("//td[contains(text(),'Discretionary Credit Limit (DCL)')]/following::td"), "Discretionary Credit Limit DCL Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredPercentForCLBuyerLable			= new PageElement(By.xpath("//td[contains(text(),'Insured (%) for CL Buyer')]/following::td"), "Insured Percent for CL Buyer Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleTypeLable						= new PageElement(By.xpath("//td[contains(text(),'Deductible Type')]/following::td"), "Deductible Type Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		annualAggregateDeductibleLable			= new PageElement(By.xpath("//td[contains(text(),'Annual Aggregate Deductible')]/following::td"), "Annual Aggregate Deductible Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionPeriodDaysLable				= new PageElement(By.xpath("//td[contains(text(),'Extension period (Days)')]/following::td"), "Extension period Days Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bonusPercentLable						= new PageElement(By.xpath("//td[contains(text(),'Bonus(%)')]/following::td"), "Bonus Percentage Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumLiabilityOptionLable				= new PageElement(By.xpath("//td[contains(text(),'Maximum liability option')]/following::td"), "Maximum liability option Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumLiabilityLable					= new PageElement(By.xpath("//td[contains(text(),'Maximum Liability')]/following::td"), "Maximum Liability Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationFrequencyForOverduesLable	= new PageElement(By.xpath("//td[contains(text(),'Declaration Frequency for Overdues')]/following::td"), "Declaration Frequency for Overdues Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountManualLable						= new PageElement(By.xpath("//td[contains(text(),'Discount manual')]/following::td"),"Discount manual Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		serialNumberTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Serial Number')]/following::input"), "Serial Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankNameDropDown		= new PageElement(By.xpath("//td//div[contains(text(),'Serial Number')]/following::select"), "Bank Name DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		bankCodeTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Bank Code')]/following::input"), "BankCode TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfBankTextArea	= new PageElement(By.xpath("//td//div[contains(text(),'Address of Bank')]/following::textarea"), "Address Of Bank TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Pin Code')]/following::select"), "Pin Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		nextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	= new PageElement(By.name("btnPrevious"),  "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyDetailsCreaditShield(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity, CustomAssert assertReference){
		if(policyAttPolDetailsCSEntity.getAction().equalsIgnoreCase("add") || policyAttPolDetailsCSEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigSerialNumber")) {
				clearAndSendKeys(serialNumberTextField, policyAttPolDetailsCSEntity.getStringValueForField("SerialNumber"));
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBankName")) {
				selectValueFromList(bankNameDropDown, policyAttPolDetailsCSEntity.getStringValueForField("BankName"));
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBankCode")) {
				clearAndSendKeys(bankCodeTextField, policyAttPolDetailsCSEntity.getStringValueForField("BankCode"));
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAddressOfBank")) {
				clearAndSendKeys(addressOfBankTextArea, policyAttPolDetailsCSEntity.getStringValueForField("AddressOfBank"));
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPinCode")) {
				selectValueFromList(pinCodeDropDown, policyAttPolDetailsCSEntity.getStringValueForField("PinCode"));
			}

		}
		else if(policyAttPolDetailsCSEntity.getAction().equalsIgnoreCase("verify")){

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigCountryDetails")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("CountryDetails"), fetchValueFromTextFields(countryDetailsLabel), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromTextFields(isServiceTaxExemptedLabel), AssertionType.WARNING);

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromFields(coInsuranceApplicableLable), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromFields(installmentPercentageListLable ), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPolicyType")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PolicyType"), fetchValueFromFields(policyTypeLable ), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigTotalInsurableTurnover")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("TotalInsurableTurnover"), fetchValueFromFields(totalInsurableTurnoverLable ), AssertionType.WARNING);
			}

			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAmountOfPremium")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("AmountOfPremium"), fetchValueFromFields(amountOfPremiumLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPreCreditInsurableTurnover")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PreCreditInsurableTurnover"), fetchValueFromFields(preCreditInsurableTurnoverLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAmountOfPremiumForPreCredit")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("AmountOfPremiumForPreCredit"), fetchValueFromFields(amountOfPremiumForPreCreditLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigOptionsForMinimumRetentionPremium")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("OptionsForMinimumRetentionPremium"), fetchValueFromFields(optionsForMinimumRetentionPremiumLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumPercentage")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MinimumRetentionPremiumPercentage"), fetchValueFromFields(minimumRetentionPremiumPercentageLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigInsuredPercentforDCLBuyer")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("InsuredPercentforDCLBuyer"), fetchValueFromFields(insuredPercentforDCLBuyerLable ), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigProcessingFee")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("ProcessingFee"), fetchValueFromFields(processingFeeLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DeductibleAmount"), fetchValueFromFields(deductibleAmountLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMaximumTermsOfPaymentDays")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MaximumTermsOfPaymentDays"), fetchValueFromFields(maximumTermsOfPaymentDaysLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigWaitingPeriodInMonths")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("WaitingPeriodInMonths"), fetchValueFromFields(waitingPeriodInMonthsLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMalusPercent")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MalusPercent"), fetchValueFromFields(malusPercentLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigNumberOfTimes")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("NumberOfTimes"), fetchValueFromFields(numberOfTimesLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDeclarationFrequencyForTurnover")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DeclarationFrequencyForTurnover"), fetchValueFromFields(declarationFrequencyForTurnoverLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigLoadingManual")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("LoadingManual"), fetchValueFromFields(loadingManualLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigNameOfInsurer")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("NameOfInsurer"), fetchValueFromFields(nameOfInsurerLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("OpportunityId"), fetchValueFromFields(opportunityIdLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigNatureOfBusinessForCredit")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("NatureOfBusinessForCredit"), fetchValueFromFields(natureOfBusinessForCreditLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPremiumRatePercent")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PremiumRatePercent"), fetchValueFromFields(premiumRatePercentLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDoYouWantPreCreditfacility")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DoYouWantPreCreditfacility"), fetchValueFromFields(doYouWantPreCreditfacilityLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPreCreditPremiumRatePercentage")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PreCreditPremiumRatePercentage"), fetchValueFromFields(preCreditPremiumRatePercentageLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("TotalPremium"), fetchValueFromFields(totalPremiumLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMinimumRetentionPremiumAmount")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MinimumRetentionPremiumAmount"), fetchValueFromFields(minimumRetentionPremiumAmountLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimitDCL")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DiscretionaryCreditLimitDCL"), fetchValueFromFields(discretionaryCreditLimitDCLLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigInsuredPercentForCLBuyer")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("InsuredPercentForCLBuyer"), fetchValueFromFields(insuredPercentForCLBuyerLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDeductibleType")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DeductibleType"), fetchValueFromList(deductibleTypeLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
					assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("AnnualAggregateDeductible"), fetchValueFromFields(annualAggregateDeductibleLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigExtensionPeriodDays")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("ExtensionPeriodDays"), fetchValueFromFields(extensionPeriodDaysLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBonusPercent")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("BonusPercent"), fetchValueFromFields(bonusPercentLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMaximumLiabilityOption")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MaximumLiabilityOption"), fetchValueFromFields(maximumLiabilityOptionLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("MaximumLiability"), fetchValueFromFields(maximumLiabilityLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDeclarationFrequencyForOverdues")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DeclarationFrequencyForOverdues"), fetchValueFromFields(declarationFrequencyForOverduesLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDiscountManual")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("DiscountManual"), fetchValueFromFields(discountManualLable), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigSerialNumber")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("SerialNumber"), fetchValueFromFields(serialNumberTextField), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBankName")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("BankName"), fetchValueFromFields(bankNameDropDown), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBankCode")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("BankCode"), fetchValueFromFields(bankCodeTextField), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAddressOfBank")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("AddressOfBank"), fetchValueFromFields(addressOfBankTextArea), AssertionType.WARNING);
			}
			if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(policyAttPolDetailsCSEntity.getStringValueForField("PinCode"), fetchValueFromFields(pinCodeDropDown), AssertionType.WARNING);
			}
		}
	}
	}

	public void clickNextToPolicyDetailsCS(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity) {
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
		}
	}

	public void clickbackToQuotationDetails(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity) {
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void clickBackToAttributeTab(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity) {
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity){
		if (policyAttPolDetailsCSEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyAttPolicyDetailsCD(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyAttPolDetailsCSEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyDetailsCreaditShield(policyAttPolDetailsCSEntity, assertReference);
			clickNextToPolicyDetailsCS(policyAttPolDetailsCSEntity);
			clickbackToQuotationDetails(policyAttPolDetailsCSEntity);
			clickBackToAttributeTab(policyAttPolDetailsCSEntity);
			navigateToPolicy(policyAttPolDetailsCSEntity);
			navigateToAttribute(policyAttPolDetailsCSEntity);
			navigateToInsuredInterest(policyAttPolDetailsCSEntity);
			navigateToCoverage(policyAttPolDetailsCSEntity);
			navigateToClientDetails(policyAttPolDetailsCSEntity);
			navigateToRelation(policyAttPolDetailsCSEntity);
			navigateToPayment(policyAttPolDetailsCSEntity);
			navigateToFollowup(policyAttPolDetailsCSEntity);
			navigateToDocument(policyAttPolDetailsCSEntity);
		}
	}
}



