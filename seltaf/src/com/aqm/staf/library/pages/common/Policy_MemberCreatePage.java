package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_MemberCreatePage  extends WebPage {
	
	private PageElement policyQuoteDetailsTitle;
	private PageElement quoteNoTextField;
	private PageElement policyNoTextField;
	private PageElement additionalReferenceNoTextField;
	private PageElement policyBranchTextField;
	private PageElement dateOfApplicationTextField;
	private PageElement productTextField;
	private PageElement productNameTextField;
	private PageElement policyHolderTextField;
	private PageElement policyHolderNameTextField;
	private PageElement policyDurationTextField;
	private PageElement policyDurationUnitDropdown;
	private PageElement policyStartDateTextField;
	private PageElement expirationEndDateTextField;
	private PageElement policyStartTimeTextField;
	private PageElement paymentFrequencyDropdown;
	private PageElement businessTypeDropdown;
	private PageElement currencyTextField;
	private PageElement currencyRateTextField;
	private PageElement sumInsuredLimitsOfLiabilityTextField;
	private PageElement insuranceLimitsTextField;
	private PageElement grossPremiumTextField;
	private PageElement adjustmentsTextField;
	private PageElement deductionTextField;
	private PageElement unadjustedDepositTextField;
	private PageElement stampDutyTextField;
	private PageElement netPremiumAmtTextField;
	private PageElement premiumCurrencyTextField;
	private PageElement premiumCurrencyRateTextField;
	private PageElement netPremiumTextField;
	private PageElement eventEffectiveDateTextField;
	private PageElement latestEventNameTextField;
	private PageElement currentStatusTextField;
	private PageElement reinsStatusTextField;
	private PageElement saveButton;
	private PageElement backButton;
	
	public Policy_MemberCreatePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		policyQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Member Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoTextField = new PageElement(By.name("pProposalNo"), "Quote No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoTextField = new PageElement(By.name("pPolicyNo"), "Policy No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalReferenceNoTextField = new PageElement(By.name("pCoverNoteNo"), "Additional Reference No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyBranchTextField = new PageElement(By.name("pPolicyBranchName"), "Policy Branch TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfApplicationTextField = new PageElement(By.name("pProposalDate"), "Date of Application TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productTextField=new PageElement(By.name("pProductCode"), "Product TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameTextField=new PageElement(By.name("pProductName"), "Product Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderTextField=new PageElement(By.name("pPolicyHolderCode"), "Policy Holder TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderNameTextField=new PageElement(By.name("pPolicyHolderName"), "Policy Holder Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDurationTextField=new PageElement(By.name("pTerm"), "Policy Duration TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDurationUnitDropdown=new PageElement(By.name("pPolicyTermUnit"), "Policy Duration Unit Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyStartDateTextField=new PageElement(By.name("pInceptionDate"), "Policy Start Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		expirationEndDateTextField=new PageElement(By.name("pExpiryDate"), "Expiration End Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStartTimeTextField=new PageElement(By.name("pInceptionTime"), "Policy Start Time TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentFrequencyDropdown = new PageElement(By.name("pPremFreq"), "Payment Frequancy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		businessTypeDropdown = new PageElement(By.name("pPremDepMode"), "Business Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		currencyTextField = new PageElement(By.name("pCurrency"), "Currency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyRateTextField = new PageElement(By.name("pCurrencyRate"), "Currency Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredLimitsOfLiabilityTextField = new PageElement(By.name("pLimLiabTc1"), "Sum Insured Limits TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuranceLimitsTextField=new PageElement(By.name("pSumInsuredAssured"), "Insurance Limits TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossPremiumTextField=new PageElement(By.name("pGrossPremAmt"), "Gross Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adjustmentsTextField = new PageElement(By.name("pTotalDiscountAmt"), "Adjustments TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductionTextField = new PageElement(By.name("pTotalLoadingAmt"), "Deduction TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unadjustedDepositTextField = new PageElement(By.name("pPremDepositAmt"), "Un Adjusted Deposit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stampDutyTextField = new PageElement(By.name("pTaxAmt"), "Stamp Duty TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netPremiumAmtTextField = new PageElement(By.name("pNetPrmTc"), "Net Premium Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumCurrencyTextField=new PageElement(By.name("pNetPremCurrency"), "Premium Currency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumCurrencyRateTextField = new PageElement(By.name("pNetPremCurrencyRate"), "Premium Currency Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netPremiumTextField = new PageElement(By.name("pNetPremAmtDisplay"), "Net Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEffectiveDateTextField = new PageElement(By.name("pLatestEventDate"), "Event Effective Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		latestEventNameTextField = new PageElement(By.name("pLatestEventName"), "Latest Event Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currentStatusTextField = new PageElement(By.name("pCurrentStatusName"), "Currency Status TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinsStatusTextField=new PageElement(By.name("pReinsuranceDoneYN"), "Reins. Status TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}

}
