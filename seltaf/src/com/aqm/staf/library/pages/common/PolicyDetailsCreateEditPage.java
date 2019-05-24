package com.aqm.staf.library.pages.common;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Random;

//import org.apache.bcel.generic.GETSTATIC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyDetailsCreateEditPage extends BasePage {

	private PageElement policyQuoteDetailsPageTitle;
	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement additionalReferenceNoLabel;
	private PageElement policyBranchLabel;
	private PageElement dateOfApplicationTextField;
	private PageElement productCodeTextField;
	private PageElement productNameTextField;
	private PageElement policyHolderCodeTextField;
	private PageElement policyHolderNameTextField;
	private PageElement policyDurationTextField;
	private PageElement policyDurationUnitDropDown;
	private PageElement policyStartDateTextField;
	private PageElement expirationEndDateTextField;
	private PageElement policyStartTimeTextField;
	private PageElement paymentFrequencyDropDown;
	private PageElement businessTypeDropDown;
	private PageElement currencyTextField;
	private PageElement currencyRateTextField;
	private PageElement sumInsuredLimitsOfLiabilityTextField;
	private PageElement insuranceLimitsINRTextField;
	private PageElement grossPremiumTextField;
	private PageElement adjustmentsTextField;
	private PageElement deductionTextField;
	private PageElement serviceTaxTextField;
	private PageElement unadjustedDepositTextField;
	private PageElement stampDutyTextField;
	private PageElement adminFeesTextField;
	private PageElement netPremiumAmtTextField;
	private PageElement premiumCurrencyTextField;
	private PageElement premiumCurrencyRateTextField;
	private PageElement netPremiumINRTextField;
	private PageElement latestEventNameTextField;
	private PageElement currentStatusTextField;
	private PageElement reinsuranceStatusTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement claimSynopsisButton;

	private PageElement quotePolicySearchTitle;

	// Policy Page Links
	private PageElement policyTab;
	private PageElement attributeTab;
	private PageElement memberTab;
	private PageElement insuredInterestTab;
	private PageElement coverageTab;
	private PageElement loanTab;
	private PageElement clientDetailsTab;
	private PageElement relationsTab;
	private PageElement paymentsTab;
	private PageElement followupTab;
	private PageElement documentTab;

	// policy Home page Tab Titles
	private PageElement policyTabTitle;
	private PageElement attributeTabTitle;
	private PageElement memberTabTitle;
	private PageElement coverageTabTitle;
	private PageElement clientDetailsTabTitle;
	private PageElement relationsTabTitle;
	private PageElement paymentsTabTitle;
	private PageElement followupTabTitle;
	private PageElement documentTabTitle;
	private PageElement insuredInterestTabTitle;

	// Policy Sub Page Links
	private PageElement memberDetailSubLink;
	private PageElement memberAttributesSubLink;
	private PageElement memberAttachCoveragesSubLink;
	private PageElement memberRelationsSubLink;
	private PageElement memberPaymentsSubLink;
	private PageElement memberFundSubLink;
	private PageElement attchCoverageDetailsLink;
	private PageElement attchCoverageAttributeLink;
	private PageElement attchCoveragePremiumlink;

	/// when policy Status is "DRAFT" these buttons Displays
	private PageElement showVersionButton;
	private PageElement policyVersionSearchPageTitle;
	private PageElement premiumScheduleButton;
	private PageElement policyPremiumSchedulePageTitle;
	private PageElement addRiskButton;
	private PageElement riskListButton;
	private PageElement approveProposalButton;
	private PageElement rejectProposalButton;
	private PageElement nonSysPolicyButton;
	private PageElement calculatePremiumButton;
	private PageElement conditionsButton;
	private PageElement transferToAPButton;

	// when status is APPROVED APPLICATION
	private PageElement issuePolicyButton;
	private PageElement collectionButton;
	private PageElement collectionSearchPageIdentifier;
	private PageElement serachCollectionDetails;

	// When policy status is "ACTIVE"
	private PageElement endorseAlterButton;
	private PageElement suspendButton;
	private PageElement cancelPolicyButton;
	private PageElement renewButton;
	private PageElement commissionRecoveryButton;
	private PageElement serviceTaxCollectionButton;
	private PageElement serviceTaxRefundButton;
	private PageElement nottobeRenewedButton;

	// collection
	private PageElement collectionDetailsButton;
	private PageElement collectionNumberTextField;


	// when status is RENEWED POLICY
	private PageElement rejectRenewalButton;
	private PageElement issueRenewedPolicyButton;

	// When status is ENDORSEMENT/ALTERATION STARTED
	private PageElement endAlterationButton;
	private PageElement rejectAlterationButton;
	private PageElement projectionButton;
	private PageElement generateDuplicatePolicyButton;

	// When status is CANCELLATION IN PROGRESS

	private PageElement cancellationBasisDropDown;
	private PageElement cancellationReasonDropDown;
	private PageElement pEventEffectiveDateTextField;

	private PageElement rejectCancellationButton;
	private PageElement approveCancellationButton;
	private PageElement reasonForInitiating;
	private PageElement policytype;
	private PageElement policytypeForNonnilEndorsment;
	private PageElement reasonSaveButton;
	private PageElement nonSystemOldPolicyNumberTextField;
	private PageElement lastPaymentDueDateTextField;
	private PageElement reasonForInitiatingThisActionTextField;
	private PageElement saveCollectionButton;
	private PageElement closeRenewButton;
	private PageElement approveRenewalButton;
	private PageElement policyQuoteLink;
	private PageElement renewedQuoteNumberField;
	private PageElement searchButton;
	private String quoteNo;
	private PageElement collectionPageIdentifier;
	private PageElement endorseEffectiveDateTextField;
	private PageElement calculatedRefundPremiumTextField;
	private PageElement manualRefundPremiumTextField;

	private PageElement primaryEndorsementDropdown;
	private PageElement memorandumTextArea;

	private PageElement policyNoLink;
	private String policyNo;
	private PageElement proposalPolicyNoTextField;

	private String collectionNo;
	private PageElement collectionNoLink;
	private PageElement maximumBenefitAmountINRTextField;
	private PageElement passportDetailsVerifiedDropdown;
	private PageElement premiumCurrencyFindButton;
	private PageElement premiumCurrencyToBeSelectedLink;
	private PageElement policyStartDateFindButton;
	private PageElement ExpirationOrEndDateFindButton;
	// Co insurance Details
	private PageElement coInsuranceButton;
	private PageElement eventEffectiveDateTextField;

	private PageElement claimSynopsisDetailsPageTitle;
	//
	private PageElement eventEffectiveDateCancelTextField;
	private PageElement eventEffectiveDateFindButton;

	private PageElement tagNoChangeButton;
	private PageElement premiumCalculationBasisDropdown;

	String grossPremium;
	String serviceTax;
	String CGST;
	String SGST;
	String IGST;
	String UGST;
	String Cess;

	String policyStartDate;
	String expirationEndDate;
	private PageElement quoteNumberTextFeild;

	private PageElement migrationTypeDrpdown;
	private PageElement changeProposerDrpdown;

	private PageElement userIdLabel;
	private PageElement roleLabel;
	private PageElement brokerAgentTPAChangeDetLink;
	private PageElement retainTpPremiumDropDown;

	private PageElement contactdetailsbutton;

	private PageElement stateContactTextField;
	private PageElement cityContactTextField;
	private PageElement pinContactTextField;
	private PageElement backContactButton;
	private PageElement updateContactButton;
	private PageElement openCoverAggTextField;


	public PolicyDetailsCreateEditPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		// Policy Home Page
		policyTab = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), " Member Tab Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]")," Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// In some Products Shows as Member or insuredInterest
		// insuredInterestTab=new
		// PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),
		// "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openCoverAggTextField=new PageElement( By.xpath("//input[@name=('pPolicyNumber')]"), "Open Agreement Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"),"Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"),"Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"),"Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"),"client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"),"Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStartDateFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Policy Start Date')]/following::input/following::a[@name='firstFocus']"),"Policy Start Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ExpirationOrEndDateFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Expiration/End Date')]/following::input/following::a[@name='firstFocus']"),"Expiration/End Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicySearchTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"),"Policy Quote/Policy Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Policy Sub-links
		memberDetailSubLink = new PageElement(By.linkText("Detail"), " Member Detail Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesSubLink = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesSubLink = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"),"Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsSubLink = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsSubLink = new PageElement(By.xpath("//div[@title='Relation']/following::td")," MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundSubLink = new PageElement(By.linkText("Fund"), " MemberFund Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoverageDetailsLink = new PageElement(By.xpath("//tr[1]//td//div//b[contains(text(),'Details')]"),"member Details Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoverageAttributeLink = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"),"member Attribute Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlink = new PageElement(By.xpath("//tr//td//div/b[contains(text(),'Premium')]"),"member Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// Policy Creation
		policyQuoteDetailsPageTitle = new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"),"Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.name("pProposalNo"), "Quote Number TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.name("pPolicyNo"), "Policy Number TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalReferenceNoLabel = new PageElement(By.name("pCoverNoteNo"), "Additional reference Number TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyBranchLabel = new PageElement(By.name("pPolicyBranchName"), "policy Branch TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfApplicationTextField = new PageElement(By.name("pProposalDate"), "Date Of Application TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeTextField = new PageElement(By.name("pProductCode"), "Product Code TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameTextField = new PageElement(By.name("pProductName"), "Product Name TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderCodeTextField = new PageElement(By.name("pPolicyHolderCode"), "Policy Holder Code TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderNameTextField = new PageElement(By.name("pPolicyHolderName"), "Policy Holder Name TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDurationTextField = new PageElement(By.name("pTerm"), "Policy Duration TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDurationUnitDropDown = new PageElement(By.name("pPolicyTermUnit"), "Policy Holder Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyStartDateTextField = new PageElement(By.name("pInceptionDate"), "Policy Start Date TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expirationEndDateTextField = new PageElement(By.name("pExpiryDate"), "Policy End Date TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStartTimeTextField = new PageElement(By.name("pInceptionTime"), "Policy Start Time TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentFrequencyDropDown = new PageElement(By.name("pPremFreq"), "Paymeny Frequency Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		businessTypeDropDown = new PageElement(By.name("pPremDepMode"), "Business Type Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// Currency Field has Two fields Currency and Currency Rate
		currencyTextField = new PageElement(By.name("pCurrency"), "Currency TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyRateTextField = new PageElement(By.name("pCurrencyRate"), "Currency Rate TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		sumInsuredLimitsOfLiabilityTextField = new PageElement(By.name("pLimLiabTc1"),"Suminsured/ Limits of liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuranceLimitsINRTextField = new PageElement(By.name("pLimLiabTc1"), "Insurance Limits(INR) TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossPremiumTextField = new PageElement(By.name("pGrossPremAmt"), "Gross Premium TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adjustmentsTextField = new PageElement(By.name("pTotalDiscountAmt"), "Adjustments TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductionTextField = new PageElement(By.name("pTotalLoadingAmt"), "Deduction TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serviceTaxTextField = new PageElement(By.name("pTotalLoadingAmt"), "Service Tax Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unadjustedDepositTextField = new PageElement(By.name("pPremDepositAmt"), "Unadjusted Deposit TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stampDutyTextField = new PageElement(By.name("pTaxAmt"), "Stamp Duty TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adminFeesTextField = new PageElement(By.name("pTaxAmt"), "Admin Fees Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netPremiumAmtTextField = new PageElement(By.name("pNetPrmTc"), "Net Premium Amt. TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// Premium Currency Field has Two fields Premium Currency and Currency Rate
		premiumCurrencyTextField = new PageElement(By.name("pNetPremCurrency"), "Premium Currency TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumCurrencyRateTextField = new PageElement(By.name("pNetPremCurrencyRate"),"Premium Currency Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumCurrencyFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Premium Currency')]/following::input/following::a[@name='firstFocus']"),"Premium Currency Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		netPremiumINRTextField = new PageElement(By.name("pNetPremAmtDisplay"), "Net PremiumTextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEffectiveDateTextField = new PageElement(By.name("pLatestEventDate"), "Event Effective Date TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		latestEventNameTextField = new PageElement(By.name("pLatestEventName"), "Latest Event Name TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currentStatusTextField = new PageElement(By.name("pCurrentStatusName"), "Policy Current Status TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinsuranceStatusTextField = new PageElement(By.name("pReinsuranceDoneYN"), "Reinsurance Status TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimSynopsisButton = new PageElement(By.name("Claim Synopsis"), "Claim Synopsis Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// Draft Status
		showVersionButton = new PageElement(By.name("Show Version"), "Show Version Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyVersionSearchPageTitle = new PageElement(By.xpath("//div[1]//b[contains(text(),'Version')]"),"Policy Version Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumScheduleButton = new PageElement(By.xpath("//input[@name='Premium Schedule']"),"Premium Schedule Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPremiumSchedulePageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Policy Premium Schedule')]"),"Policy Premium Schedule Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addRiskButton = new PageElement(By.name("Save"), "Add Risk Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		riskListButton = new PageElement(By.name("Save"), "Risk List Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		approveProposalButton = new PageElement(By.name("Approve Proposal"), "Approve Proposal Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionButton = new PageElement(By.name("Collection"), "Collection Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectProposalButton = new PageElement(By.name("Reject Proposal"), "Reject Proposal Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nonSysPolicyButton = new PageElement(By.name("Non Sys Policy"), "Non Sys Policy Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		calculatePremiumButton = new PageElement(By.xpath("//input[@name='Calculate Premium']"),"Calculate Premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		conditionsButton = new PageElement(By.name("attachExclusions"), "Conditions Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transferToAPButton = new PageElement(By.name("Transfer"), "Transfer To AP Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		issuePolicyButton = new PageElement(By.xpath("//input[@name='Issue Policy']"), "Issue Policy Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// After Active Status
		collectionDetailsButton = new PageElement(By.xpath("//input[@name='Collection Details']"),"Collection Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		endorseAlterButton = new PageElement(By.xpath("//input[@name='Endorse Alter']"), "Endorse Alter Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		suspendButton = new PageElement(By.name("Suspend"), "Suspend Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cancelPolicyButton = new PageElement(By.name("Cancel Policy"), "Cancel Policy Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		renewButton = new PageElement(By.name("Renew"), "Renew Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		commissionRecoveryButton = new PageElement(By.name("Commission Recovery"), "Commission Recovery Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//rejectRenewalButton = new PageElement(By.xpath("//input[@name='Risk List']/following::td/input"), "Reject Renewal Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectRenewalButton = new PageElement(By.xpath("//input[@name='Reject Renewal']"), "Reject Renewal Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serviceTaxCollectionButton = new PageElement(By.name("Service Tax Collection"), "Service Tax Collection Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serviceTaxRefundButton = new PageElement(By.name("Service Tax Refund"), "Service Tax Refund Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nottobeRenewedButton = new PageElement(By.name("renewStatusButton"), "Not To Be Renewed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// rejectRenewalButton = new PageElement(By.xpath("//input[@name='Risk
		// List']/following::td/input"), "Reject Renewal Button", false,
		// WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//rejectRenewalButton = new PageElement(By.xpath("//input[@name='Risk List']/following::td/input"),"Reject Renewal Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		issueRenewedPolicyButton = new PageElement(By.name("Issue Renewed Policy"), "Issue Renew Policy Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// rejectRenewalButton = new PageElement(By.xpath("//input[@name='Reject
		// Renewal']"), "Reject Renewal Button", false,
		// WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// When status is ENDORSEMENT/ALTERATION STARTED
		endAlterationButton = new PageElement(By.name("End Alteration"), "End Alteration Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectAlterationButton = new PageElement(By.xpath("//input[@name='Reject Alteration']"),"Reject Alteration Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		projectionButton = new PageElement(By.name("Projection"), "Projection Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		generateDuplicatePolicyButton = new PageElement(By.xpath("//input[@name='Generate Duplicate Policy']"),"Generate Duplicate Policy Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		cancellationBasisDropDown = new PageElement(By.name("pPartyCode"), "Select cancellation Basis DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cancellationReasonDropDown = new PageElement(By.name("pEndorsementType"), "Select Cancellation Basis DropDown",false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pEventEffectiveDateTextField = new PageElement(By.name("pEventEffectiveDate"), "Event Effective Date Textfield",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		rejectCancellationButton = new PageElement(By.xpath("//input[@name='Reject Cancellaton']"),"Reject Cancellation Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		approveCancellationButton = new PageElement(By.name("Approve Cancellaton"), "Approve Cancellaton Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reasonForInitiating = new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")), "Reason for initiating",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policytype = new PageElement(By.name("pEndorsementOption"), "Policy Type Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policytypeForNonnilEndorsment = new PageElement(By.name("pPolicyTypeOption"),"Policy Type Non-NilDropdown Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonSaveButton = new PageElement(By.name("Save"), "Save Button on Reason Page", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nonSystemOldPolicyNumberTextField = new PageElement(By.name("pNonSysPolicyNumber"), "Non System old Policy",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lastPaymentDueDateTextField = new PageElement(By.name("pLastPaymentDueDate"), "Last Payment Due Date", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForInitiatingThisActionTextField = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action on collection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveCollectionButton = new PageElement(By.name("Save"), "Save button on Collection ", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeRenewButton = new PageElement(By.name("CloseWin"), "Save button on Collection ", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		approveRenewalButton = new PageElement(By.name("Approve Renewal"), "Approve Renewal Button ", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		renewedQuoteNumberField = new PageElement(By.xpath("//td//font[contains(text(),'Policy successfully renewed.Renewed Quote no: ')]//following::b[1]"),"Renewed Poilicy Number Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton = new PageElement(By.name("Search5465"), "Search button ", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionPageIdentifier = new PageElement(By.xpath("//div//b[contains(text(),'Collection/Collection Cum Adjustment')]"), "Collection Page", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionSearchPageIdentifier = new PageElement(By.xpath("//div//b[contains(text(),'Search Collection')]"),"Collection Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endorseEffectiveDateTextField = new PageElement(By.name("pEventEffectiveDate"),"Endorse Event Effective Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedRefundPremiumTextField = new PageElement(By.name("pCalculatedRefundPmm"),"Calculated Refund Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualRefundPremiumTextField = new PageElement(By.name("pManualRefundPmm"), "Manual Refund Premium TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proposalPolicyNoTextField = new PageElement(By.name("pPolPropNo"), "Proposal PolicyNo TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		primaryEndorsementDropdown = new PageElement(By.name("pEndorsementOption"), "Primary Endorsement Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		memorandumTextArea = new PageElement(By.name("pNewRemark"), "Memorandum Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serachCollectionDetails = new PageElement(By.name("Search"), "Search Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionNumberTextField = new PageElement(By.name("pCollectionNo"), "Collection Number TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumBenefitAmountINRTextField = new PageElement(By.name("pSumInsuredAssured"),"Maximum Benefit Amount INR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passportDetailsVerifiedDropdown = new PageElement(By.name("pPassportDetails"),"Passport Details Verified Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceButton = new PageElement(By.name("CoInsurance"), "CoInsurance Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimSynopsisDetailsPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Synopsis')]"),"Claim Synopsis Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEffectiveDateCancelTextField = new PageElement(By.name("pEventEffectiveDate"),"Event Effective Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEffectiveDateFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Effective date')]/following::input/following::a[@name='firstFocus']"),"Effective date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tagNoChangeButton = new PageElement(By.xpath("//table//input[@name='Tag No Change']"), "Tag No Change Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumCalculationBasisDropdown = new PageElement(By.name("pPartyCode"), "Premium Calculation Basis Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		migrationTypeDrpdown = new PageElement(By.name("pMigrationProduct"), "migrationType Drpdown", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		changeProposerDrpdown = new PageElement(By.name("pProposerFlag"), "change Proposer TextField", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		userIdLabel = new PageElement(By.xpath("//font/b[contains(text(),'User Id')]"), "user Id Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleLabel = new PageElement(By.xpath("//font/b[contains(text(),'Role')]"), "role Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		brokerAgentTPAChangeDetLink = new PageElement(By.xpath("//form[@name='FormUnderwritignControl']//td//b[contains(text(),'Broker/Agent/TPA Change')]"),"Broker/Agent/TPA Change Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retainTpPremiumDropDown = new PageElement(By.xpath("//b[contains(text(),'Do you want to retain the TP Premium?')]//following::select[1]"),"Do You Want To Retain TP Premium", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		updateContactButton=new PageElement(By.xpath("//input[@name='Update']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateContactTextField=new PageElement(By.xpath("//input[@name='pStateName']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityContactTextField=new PageElement(By.xpath("//input[@name='pCityName']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinContactTextField=new PageElement(By.xpath("//input[@name='pPostalCode']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backContactButton=new PageElement(By.xpath("//input[@name='Back']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactdetailsbutton= new PageElement(By.xpath("//input[@name='Contact Update']"), "Contact details button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "Collection")
	WebElement collectionButton1;

	// Services
	public void fillPolicyDetails(PolicyEntity policyEntity, CustomAssert assertReference)
			throws InterruptedException, ParseException {

		if (policyEntity.getBooleanValueForField("ConfigPrimaryInformation")) {
			if (policyEntity.getAction().equalsIgnoreCase("add") || policyEntity.getAction().equalsIgnoreCase("edit")) {

				if (policyEntity.getBooleanValueForField("ConfigDateOfApplication")) {
					String dateOfApplication = RandomCodeGenerator
							.dateGenerator(policyEntity.getStringValueForField("DateOfApplication"));
					clearAndEnterDate(dateOfApplicationTextField, dateOfApplication);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyStartDate")) {
					policyStartDate = RandomCodeGenerator
							.dateGenerator(policyEntity.getStringValueForField("PolicyStartDate"));
					clearAndEnterDate(policyStartDateTextField, policyStartDate);
				}
				if (policyEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlink")) {
					click(attchCoveragePremiumlink);
				}
				if (policyEntity.getBooleanValueForField("ConfigProductCode")) {
					clearAndSendKeys(productCodeTextField, policyEntity.getStringValueForField("ProductCode"));
				}
				if (policyEntity.getBooleanValueForField("ConfigProductName")) {
					clearAndSendKeys(productNameTextField, policyEntity.getStringValueForField("ProductName"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyHolderCode")) {
					clearAndSendKeys(policyHolderCodeTextField,
							policyEntity.getStringValueForField("PolicyHolderCode"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
					clearAndSendKeys(policyHolderNameTextField,
							policyEntity.getStringValueForField("PolicyHolderName"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyDuration")) {
					clearAndSendKeys(policyDurationTextField, policyEntity.getStringValueForField("PolicyDuration"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyDurationUnit")) {
					selectValueFromList(policyDurationUnitDropDown,
							policyEntity.getStringValueForField("PolicyDurationUnit"));
				}

				if (policyEntity.getBooleanValueForField("ConfigExpirationEndDate")) {
					/*
					 * String expirationEndDate=RandomCodeGenerator.dateGenerator(policyEntity.
					 * getStringValueForField("ExpirationEndDate"));
					 * clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
					 */
					// Abhijit
					int year = Calendar.getInstance().get(Calendar.YEAR);
					Boolean leapYear = RandomCodeGenerator.determineLeapYear(year);
					if (leapYear) {
						if (policyEntity.getStringValueForField("PolicyDuration").equalsIgnoreCase("1")) {
							if (policyEntity.getStringValueForField("ExpirationEndDate").contains("futureDate:365")|| policyEntity.getStringValueForField("ExpirationEndDate").contains("futureDate:364")) {
								expirationEndDate = RandomCodeGenerator.dateGenerator("futureDate:364");
								clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
							} else {
								expirationEndDate = RandomCodeGenerator
										.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate"));
								clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
							}
						} else {
							expirationEndDate = RandomCodeGenerator
									.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate"));
							clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
						}
					} else {
						if (policyEntity.getStringValueForField("PolicyDuration").equalsIgnoreCase("1")) {
							String expirationEndDate = RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate"));
							clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
						} else {
							String expirationEndDate = RandomCodeGenerator
									.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate"));
							clearAndEnterDate(expirationEndDateTextField, expirationEndDate);
						}

					}
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyStartTime")) {
					clearAndEnterTime(policyStartTimeTextField);
				}
				if (policyEntity.getBooleanValueForField("ConfigPaymentFrequency")) {
					selectValueFromList(paymentFrequencyDropDown,
							policyEntity.getStringValueForField("PaymentFrequency"));
				}
				if (policyEntity.getBooleanValueForField("ConfigBusinessType")) {
					selectValueFromList(businessTypeDropDown, policyEntity.getStringValueForField("BusinessType"));
				}
				if (policyEntity.getBooleanValueForField("ConfigCurrency")) {
					clearAndSendKeys(currencyTextField, policyEntity.getStringValueForField("Currency"));
				}
				if (policyEntity.getBooleanValueForField("ConfigCurrencyRate")) {
					clearAndSendKeys(currencyRateTextField, policyEntity.getStringValueForField("CurrencyRate"));
				}
				if (policyEntity.getBooleanValueForField("ConfigSumInsuredLimitsOfLiability")) {
					clearAndSendKeys(sumInsuredLimitsOfLiabilityTextField,
							policyEntity.getStringValueForField("SumInsuredLimitsOfLiability"));
				}
				if (policyEntity.getBooleanValueForField("ConfigInsuranceLimitsINR")) {
					clearAndSendKeys(insuranceLimitsINRTextField,
							policyEntity.getStringValueForField("InsuranceLimitsINR"));
				}
				if (policyEntity.getBooleanValueForField("ConfigGrossPremium")) {
					clearAndSendKeys(grossPremiumTextField, policyEntity.getStringValueForField("GrossPremium"));
				}
				if (policyEntity.getBooleanValueForField("ConfigAdjustments")) {
					clearAndSendKeys(adjustmentsTextField, policyEntity.getStringValueForField("Adjustments"));
				}
				if (policyEntity.getBooleanValueForField("ConfigDeduction")) {
					clearAndSendKeys(deductionTextField, policyEntity.getStringValueForField("Deduction"));
				}
				if (policyEntity.getBooleanValueForField("ConfigServiceTax")) {
					clearAndSendKeys(serviceTaxTextField, policyEntity.getStringValueForField("ServiceTax"));
				}
				if (policyEntity.getBooleanValueForField("ConfigUnadjustedDeposit")) {
					clearAndSendKeys(unadjustedDepositTextField,
							policyEntity.getStringValueForField("UnadjustedDeposit"));
				}
				if (policyEntity.getBooleanValueForField("ConfigStampDuty")) {
					clearAndSendKeys(stampDutyTextField, policyEntity.getStringValueForField("StampDuty"));
				}
				if (policyEntity.getBooleanValueForField("ConfigAdminFees")) {
					clearAndSendKeys(adminFeesTextField, policyEntity.getStringValueForField("AdminFees"));
				}
				if (policyEntity.getBooleanValueForField("ConfigNetPremiumAmt")) {
					clearAndSendKeys(netPremiumAmtTextField, policyEntity.getStringValueForField("NetPremiumAmt"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPremiumCurrency")) {
					clearAndSendKeys(premiumCurrencyTextField, policyEntity.getStringValueForField("PremiumCurrency"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPremiumCurrencyRate")) {
					selectPremiumCurrency(policyEntity);
					// clearAndSendKeys(premiumCurrencyRateTextField,
					// policyEntity.getStringValueForField("PremiumCurrencyRate"));
				}
				if (policyEntity.getBooleanValueForField("ConfigNetPremiumINR")) {
					clearAndSendKeys(netPremiumINRTextField, policyEntity.getStringValueForField("NetPremiumINR"));
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyEventEffectiveDate")) {
					clearAndSendKeys(eventEffectiveDateTextField,
							policyEntity.getStringValueForField("EventEffectiveDate"));
				}
				if (policyEntity.getBooleanValueForField("ConfigLatestEventName")) {
					clearAndSendKeys(latestEventNameTextField, policyEntity.getStringValueForField("LatestEventName"));
				}
				if (policyEntity.getBooleanValueForField("ConfigCurrentStatus")) {
					clearAndSendKeys(currentStatusTextField, policyEntity.getStringValueForField("CurrentStatus"));
				}
				if (policyEntity.getBooleanValueForField("ConfigReinsuranceStatus")) {
					clearAndSendKeys(reinsuranceStatusTextField,
							policyEntity.getStringValueForField("ReinsuranceStatus"));
				}
				if (policyEntity.getBooleanValueForField("ConfigReinsuranceStatus")) {
					clearAndSendKeys(reinsuranceStatusTextField,
							policyEntity.getStringValueForField("ReinsuranceStatus"));

				}
			} else if (policyEntity.getAction().equalsIgnoreCase("verify")) {
				if (policyEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlink")) {
					click(attchCoveragePremiumlink);
				}
				if (policyEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("QuoteNo"),
							fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyNo"),
							fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigAdditionalReferenceNo")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("AdditionalReferenceNo"),
							fetchValueFromTextFields(additionalReferenceNoLabel), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyBranch")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyBranch"),
							fetchValueFromTextFields(policyBranchLabel), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigDateOfApplication")) {
					assertReference.assertEquals(
							RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("DateOfApplication")),
							fetchValueFromTextFields(dateOfApplicationTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("ProductCode"),
							fetchValueFromTextFields(productCodeTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("ProductName"),
							fetchValueFromTextFields(productNameTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyHolderCode")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyHolderCode"),
							fetchValueFromTextFields(policyHolderCodeTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyHolderName"),
							fetchValueFromTextFields(policyHolderNameTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyDuration")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyDuration"),
							fetchValueFromTextFields(policyDurationTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyDurationUnit")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyDurationUnit"),
							fetchValueFromList(policyDurationUnitDropDown), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyStartDate")) {
					assertReference.assertEquals(
							RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("PolicyStartDate")),
							fetchValueFromTextFields(policyStartDateTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigExpirationEndDate")) {
					int year = Calendar.getInstance().get(Calendar.YEAR);
					Boolean leapYear = RandomCodeGenerator.determineLeapYear(year);
					if (leapYear) {
						if (policyEntity.getStringValueForField("PolicyDuration").equalsIgnoreCase("1")) {
							if (policyEntity.getStringValueForField("ExpirationEndDate").contains("futureDate:364")
									|| policyEntity.getStringValueForField("ExpirationEndDate")
									.contains("futureDate:365")) {
								assertReference.assertEquals(RandomCodeGenerator.dateGenerator("futureDate:364"),
										fetchValueFromTextFields(expirationEndDateTextField), AssertionType.WARNING);
							} else {
								assertReference.assertEquals(
										RandomCodeGenerator.dateGenerator(
												policyEntity.getStringValueForField("ExpirationEndDate")),
										fetchValueFromTextFields(expirationEndDateTextField), AssertionType.WARNING);
							}
						} else {
							assertReference.assertEquals(
									RandomCodeGenerator
									.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate")),
									fetchValueFromTextFields(expirationEndDateTextField), AssertionType.WARNING);
						}
					} else {
						if (policyEntity.getStringValueForField("PolicyDuration").equalsIgnoreCase("1")) {
							assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate")),
									fetchValueFromTextFields(expirationEndDateTextField), AssertionType.WARNING);
						} else {
							assertReference.assertEquals(
									RandomCodeGenerator
									.dateGenerator(policyEntity.getStringValueForField("ExpirationEndDate")),
									fetchValueFromTextFields(expirationEndDateTextField), AssertionType.WARNING);
						}
					}

				}
				if (policyEntity.getBooleanValueForField("ConfigPolicyStartTime")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PolicyStartTime"),
							fetchValueFromTextFields(policyStartTimeTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigPaymentFrequency")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PaymentFrequency"),
							fetchValueFromList(paymentFrequencyDropDown), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigBusinessType")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("BusinessType"),
							fetchValueFromList(businessTypeDropDown), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigCurrency")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("Currency"),
							fetchValueFromTextFields(currencyTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigCurrencyRate")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("CurrencyRate"),
							fetchValueFromTextFields(currencyRateTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigSumInsuredLimitsOfLiability")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("SumInsuredLimitsOfLiability"),
							fetchValueFromTextFields(sumInsuredLimitsOfLiabilityTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigInsuranceLimitsINR")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("InsuranceLimitsINR"),
							fetchValueFromTextFields(insuranceLimitsINRTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigGrossPremium")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("GrossPremium"),
							fetchValueFromTextFields(grossPremiumTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigAdjustments")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("Adjustments"),
							fetchValueFromTextFields(adjustmentsTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigDeduction")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("Deduction"),
							fetchValueFromTextFields(deductionTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigServiceTax")) {

					if (policyEntity.getStringValueForField("ServiceTax").equalsIgnoreCase("0.00")) {
						assertReference.assertEquals(policyEntity.getStringValueForField("ServiceTax"),
								fetchValueFromTextFields(serviceTaxTextField), AssertionType.WARNING);
					} else {
						//policyStartDate = fetchValueFromTextFields(policyStartDateTextField);
						grossPremium = policyEntity.getStringValueForField("GrossPremium");
						CGST= policyEntity.getStringValueForField("CGST");
						SGST= policyEntity.getStringValueForField("SGST");
						IGST= policyEntity.getStringValueForField("IGST");
						UGST= policyEntity.getStringValueForField("UGST");
						Cess= policyEntity.getStringValueForField("Cess");
						serviceTax = RandomCodeGenerator.serviceTaxCalculation(grossPremium,CGST,SGST,IGST,UGST,Cess);

						assertReference.assertEquals(serviceTax, fetchValueFromTextFields(serviceTaxTextField),
								AssertionType.WARNING);
					}

				}

				if (policyEntity.getBooleanValueForField("ConfigUnadjustedDeposit")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("UnadjustedDeposit"),
							fetchValueFromTextFields(unadjustedDepositTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigStampDuty")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("StampDuty"),
							fetchValueFromTextFields(stampDutyTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigAdminFees")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("AdminFees"),
							fetchValueFromTextFields(adminFeesTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigNetPremiumAmt")) {

					if (!(policyEntity.getStringValueForField("ServiceTax").isEmpty())) {
						if (policyEntity.getStringValueForField("ServiceTax").equalsIgnoreCase("0.00")) {
							assertReference.assertEquals(policyEntity.getStringValueForField("NetPremiumAmt"),
									fetchValueFromTextFields(netPremiumAmtTextField), AssertionType.WARNING);
						} else {
							String netPremiumAmount = RandomCodeGenerator.formatNumber(2,
									(Double.parseDouble(grossPremium) + Double.parseDouble(serviceTax) + Double.parseDouble(policyEntity.getStringValueForField("StampDuty"))));
							assertReference.assertEquals(netPremiumAmount,
									fetchValueFromTextFields(netPremiumAmtTextField), AssertionType.WARNING);
						}
					}
				}

				if (policyEntity.getBooleanValueForField("ConfigPremiumCurrency")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PremiumCurrency"),
							fetchValueFromTextFields(premiumCurrencyTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigPremiumCurrencyRate")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("PremiumCurrencyRate"),
							fetchValueFromTextFields(premiumCurrencyRateTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigNetPremiumINR")) {

					if (!(policyEntity.getStringValueForField("ServiceTax").isEmpty())) {
						if (policyEntity.getStringValueForField("ServiceTax").equalsIgnoreCase("0.00")) {
							assertReference.assertEquals(policyEntity.getStringValueForField("NetPremiumINR"),
									fetchValueFromTextFields(netPremiumINRTextField), AssertionType.WARNING);
						} else {
							String netPremiumAmountINR = RandomCodeGenerator.formatNumber(2,
									(Double.parseDouble(grossPremium) + Double.parseDouble(serviceTax) + Double.parseDouble(policyEntity.getStringValueForField("StampDuty"))));
							assertReference.assertEquals(netPremiumAmountINR,
									fetchValueFromTextFields(netPremiumAmtTextField), AssertionType.WARNING);
						}
					}
				}

				if (policyEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("EventEffectiveDate"),
							fetchValueFromTextFields(eventEffectiveDateTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigLatestEventName")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("LatestEventName"),
							fetchValueFromTextFields(latestEventNameTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigCurrentStatus")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("CurrentStatus"),
							fetchValueFromTextFields(currentStatusTextField), AssertionType.WARNING);
				}
				if (policyEntity.getBooleanValueForField("ConfigReinsuranceStatus")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("ReinsuranceStatus"),
							fetchValueFromTextFields(reinsuranceStatusTextField), AssertionType.WARNING);
				}
				/*
				 * if (policyEntity.getBooleanValueForField("ConfigProposalPolicyNo")) {
				 * actualPolicyEntity.setStringValueForField("ProposalPolicyNo",
				 * fetchValueFromTextFields(proposalPolicyNoTextField));
				 * assertReference.assertEquals(policyEntity.getStringValueForField(
				 * "ProposalPolicyNo"),actualPolicyEntity.getStringValueForField(
				 * "ProposalPolicyNo"), AssertionType.WARNING); }
				 */
				if (policyEntity.getBooleanValueForField("ConfigMaximumBenefitAmount")) {
					assertReference.assertEquals(policyEntity.getStringValueForField("MaximumBenefitAmount"),
							fetchValueFromTextFields(maximumBenefitAmountINRTextField), AssertionType.WARNING);
				}

				if (policyEntity.getBooleanValueForField("ConfigUserId")) {
					switchToFrame("head");
					assertReference.assertEquals(policyEntity.getStringValueForField("UserId"),
							fetchValueFromFields(userIdLabel), AssertionType.WARNING);
					switchToFrame("display");
				}
				if (policyEntity.getBooleanValueForField("ConfigRole")) {
					switchToFrame("head");
					assertReference.assertEquals(policyEntity.getStringValueForField("Role"),
							fetchValueFromFields(roleLabel), AssertionType.WARNING);
					switchToFrame("display");
				}

			}

		}
	}
	// -----------------POLICY HOME PAGE Buttons----------------------------

	public void backFromPolicyDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(quotePolicySearchTitle);
		}
	}

	public void backFromPolicyShowVersion(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigShowVersionBackButton")) {
			click(backButton);
			switchToWindow("Policy/Quote Details");
			switchToFrame("display");
			isElementDisplayed(quotePolicySearchTitle);
		}
	}

	public void clickClaimSynopsis(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")) {
			click(claimSynopsisButton);
			switchToWindow("Claim LPO Details");
			isElementDisplayed(claimSynopsisDetailsPageTitle);
		}
	}

	public void clickShowVersion(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigShowVersionButton")) {
			click(showVersionButton);
			Thread.sleep(3000);
			switchToWindow("Show Version");
			isElementDisplayed(policyVersionSearchPageTitle);

		}
	}

	public void clickPremiumSchedule(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")) {
			click(premiumScheduleButton);
			switchToWindow("Policy Premium Schedule");
			isElementDisplayed(policyPremiumSchedulePageTitle);
		}
	}

	public void clickAddRisk(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigAddRiskButton")) {
			click(addRiskButton);
			switchToFrame("display");
			// if(isElementDisplayed());
		}
	}

	public void clickRiskList(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigRiskListButton")) {
			click(riskListButton);
			switchToFrame("display");
		}
	}

	public void clickApproveProposal(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigApproveProposalButton")) {
			if (!policyEntity.getStringValueForField("Product").equalsIgnoreCase("SF")) {
			click(approveProposalButton);
			}
			//// Popup doesnt come in IE
			try {
				acceptAlertAndReturnConfirmationMessage();

				if (policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")) {
					acceptAlertAndReturnConfirmationMessage();
				}
			} catch (Exception e) {
			}
			Thread.sleep(6000);
			if (!policyEntity.getStringValueForField("Product").equalsIgnoreCase("SF")) {
			fillReason(policyEntity);
			switchToFrame("display");
			}
			if (policyEntity.getStringValueForField("Product").equalsIgnoreCase("SF")) {
				click(approveProposalButton);
				//// Popup doesnt come in IE
				try {
					acceptAlertAndReturnConfirmationMessage();
				} catch (Exception e) {
				}
				Thread.sleep(6000);
				fillReason(policyEntity);
				switchToFrame("display");
			}
		}

	}

	public void clickMarineCargoApproveProposal(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigMarineApproveProposalButton")) {
			if (policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) {
				click(approveProposalButton);
				//// Popup doesnt come in IE
				try {
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e) {
				}
				try {
					dismissAlertAndReturnConfirmationMessage();
				}
				catch (Exception e) {
				}
				Thread.sleep(6000);
				fillReason(policyEntity);
				switchToFrame("display");
			}
		}
	}



	public void clickRejectProposal(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigRejectProposalButton")) {
			click(rejectProposalButton);
			fillReason(policyEntity);
			switchToFrame("display");
			// if(isElementDisplayed());
		}
	}

	public void clickNonSysPolicy(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigNonSysPolicyButton")) {
			click(nonSysPolicyButton);
			switchToFrame("display");
		}
	}

	public void clickCalculatePremium(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigCalculatePremiumButton")) {
			click(calculatePremiumButton);
			switchToFrame("display");
		}
	}

	public void clickConditions(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigConditionsButton")) {
			click(conditionsButton);
			switchToFrame("display");
		}
	}

	public void clickTransferToAP(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigTransferToAPButton")) {
			click(transferToAPButton);
			switchToWindow("Refund/Excess Voucher List");
		}
	}

	public void clickIssuePolicy(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigIssuePolicyButton")) {
			click(issuePolicyButton);
			fillReason(policyEntity);
			if (policyEntity.getStringValueForField("Product").equalsIgnoreCase("OC")) {
			fillReasonPageOnCollectionPage(policyEntity);
			}
			switchToFrame("display");
			policyEntity.setStringValueForField("PolicyNo", fetchValueFromTextFields(policyNoLabel));
		}
	}

	public void clickEndorseAlter(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigEndorseAlterButton")) {
			click(endorseAlterButton);
			fillReason(policyEntity);
			switchToFrame("display");

		}
	}

	public void clickSuspend(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigSuspendButton")) {
			click(suspendButton);
			switchToFrame("display");
		}
	}

	public void clickCancelPolicy(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigCancelPolicyButton")) {
			click(cancelPolicyButton);
			fillReason(policyEntity);
			switchToFrame("display");
		}
	}

	public void clickRenew(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigRenewButton")) {
			click(renewButton);
			fillReason(policyEntity);
			closeRenewWindow(policyEntity);
		}
	}

	private void clickApproveRenewal(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigApproveRenewalButton")) {
			click(approveRenewalButton);
			try {
				acceptAlertAndReturnConfirmationMessage();
			} catch (Exception e) {

			}
			if((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
					&& ((policyEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("PC"))||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("TW")))) {
				try {
					acceptAlertAndReturnConfirmationMessage();
				} catch (Exception e) {

				}
			}
			else if((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo"))) {
				try {
					dismissAlertAndReturnConfirmationMessage();
				} catch (Exception e) {

				}
			}

			fillReason(policyEntity);
			switchToFrame("display");
		}
	}


	public void clickCommissionRecovery(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigCommissionRecoveryButton")) {
			click(commissionRecoveryButton);
			switchToFrame("display");

		}
	}

	public void submitPolicyDetails(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			Thread.sleep(3000);
			fetchQuoteNumber(policyEntity);
			switchToFrame("display");
			Thread.sleep(3000);
			isElementDisplayed(policyQuoteDetailsPageTitle);
		}
	}
	public void submitCCPolicyDetails(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigCCSaveButton")) {
			click(saveButton);
			switchToWindow("Reason");
			if (policyEntity.getBooleanValueForField("ConfigOpenCoverAgreementNumber")) {
				clearAndSendKeys(openCoverAggTextField, policyEntity.getStringValueForField("OpenCoverAgreementNumber"));
				if (policyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
					clearAndSendKeys(reasonForInitiating, policyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
					click(saveButton);
					switchToWindow("Integrated Insurance Management System");
					switchToFrame("display");
					Thread.sleep(3000);
					fetchQuoteNumber(policyEntity);
					switchToFrame("display");
					Thread.sleep(3000);
					isElementDisplayed(policyQuoteDetailsPageTitle);
				}
			}
		}
	}


	public void clickCollection(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException {
		if (policyEntity.getAction().equalsIgnoreCase("add") || policyEntity.getAction().equalsIgnoreCase("edit")) {
			if (policyEntity.getBooleanValueForField("ConfigCollectionButton")) {
				String currentStatus = fetchValueFromTextFields(currentStatusTextField);
				if (policyEntity.getAction().equalsIgnoreCase("edit")&& policyEntity.getStringValueForField("PolicyTypeForApproveProposal").equalsIgnoreCase("Non-System Old Policy")&& currentStatus.equalsIgnoreCase("APPROVED APPLICATION")) {
					click(collectionButton);
					Thread.sleep(5000);
					fillReasonPageOnCollectionPage(policyEntity);
					policyEntity.setStringValueForField("PolicyNo", fetchValueFromTextFields(policyNoLabel));
					// fetchValueFromTextFields(policyNoLabel));
				} else if (currentStatus.equalsIgnoreCase("ENDORSEMENT/ALTERATION STARTED")) {

					bringElementInView(collectionButton);
					click(calculatePremiumButton);
					click(calculatePremiumButton);
					doubleClick(collectionButton);
					//click(collectionButton);
					try {
						dismissAlertAndReturnConfirmationMessage();
						if((policyEntity.getStringValueForField("Product").equalsIgnoreCase("AN"))) {
							switchToWindow("Collection Screen");
						}
					} catch (Exception e) {
						frameworkServices.logMessage("No popup displayed at the time of collection");

					}
					if (policyEntity.getStringValueForField("PolicyType").equalsIgnoreCase("New Policy")) {
						// dismissAlertAndReturnConfirmationMessage();
						try {
							Thread.sleep(3000);
							switchToWindow("Collection Screen");
						} catch (Exception e) {
							switchToWindow("Collection Screen");
						}

						isElementDisplayed(collectionPageIdentifier);
					} else {
						if(!(policyEntity.getStringValueForField("Product").equalsIgnoreCase("AN"))) {
							try {
								acceptAlertAndReturnConfirmationMessage();
								fillReason(policyEntity);
								switchToFrame("display");
							}


							catch (Exception e) {
								switchToWindow("Collection Screen");

							} 


						}
					}
				} else {
					click(collectionButton);
					try {
						Thread.sleep(3000);
						switchToWindow("Collection Screen");
					} catch (Exception e) {
						switchToWindow("Collection Screen");
					}
					Thread.sleep(3000);
					isElementDisplayed(collectionPageIdentifier);
				}
			}
		}
	}

	public void clickServiceTaxCollection(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigServiceTaxCollectionButton")) {
			click(serviceTaxCollectionButton);
			switchToFrame("display");
		}
	}

	public void clickServiceTaxRefund(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigServiceTaxRefundButton")) {
			click(serviceTaxRefundButton);
			switchToFrame("display");
		}
	}

	public void clickNottobeRenewed(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigNotToBeRenewedButton")) {
			click(nottobeRenewedButton);
			switchToFrame("display");
		}
	}

	public void clickRejectRenewal(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigRejectRenewalButton")) {
			click(rejectRenewalButton);
			fillReason(policyEntity);
			switchToFrame("display");
		}
	}

	public void clickIssueRenewedPolicy(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigIssueRenewedPolicyButton")) {
			click(issueRenewedPolicyButton);
			fillReason(policyEntity);
			switchToFrame("display");
			policyEntity.setStringValueForField("PolicyNo", fetchValueFromTextFields(policyNoLabel));
			// if(isElementDisplayed());
		}
	}

	public void clickEndAlteration(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigEndAlterationButton")) {
			click(endAlterationButton);
			fillReason(policyEntity);
			switchToFrame("display");

		}
	}

	public void clickRejectAlteration(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigRejectAlterationButton")) {
			click(rejectAlterationButton);
			fillReason(policyEntity);
			switchToFrame("display");
		}
	}

	public void clickProjection(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigProjectionButton")) {
			click(projectionButton);
			switchToFrame("display");
		}
	}

	public void clickGenerateDuplicatePolicy(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")) {
			click(generateDuplicatePolicyButton);
			try {
				switchToFrame("display");
			}
			catch (Exception e) {

			}
			switchToWindow("Collection Screen");
		}
	}

	public void clickRejectCancellation(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigRejectCancellationButton")) {
			click(rejectCancellationButton);
			fillReason(policyEntity);
			switchToFrame("display");

		}
	}

	public void clickApproveCancellation(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigApproveCancellationButton")) {
			click(approveCancellationButton);
			fillReason(policyEntity);
			switchToFrame("display");
		}
	}

	public void clickCoInsuranceDetails(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")) {
			click(coInsuranceButton);
			switchToWindow("CoInsurance Details");
		}
	}

	// ---------------------------------Navigate To Tab-Links-----------------------

	public void navigateToPolicy(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToMember(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTab);
			switchToFrame("display");
		}
	}

	public void navigateToCoverage(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigLoanTab")) {
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTab);
			switchToFrame("display");
			//isElementDisplayed(clientDetailsTabTitle);
		}
	}

	public void navigateToRelation(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigRelationTab")) {
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}

	public void navigateToPayment(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}

	public void navigateToFollowup(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}

	public void navigateToDocument(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fetchQuoteNumber(PolicyEntity policyEntity) throws InterruptedException {
		Thread.sleep(2000);
		policyEntity.setStringValueForField("QuoteNo", fetchValueFromTextFields(quoteNoLabel));
	}

	public void fillReason(PolicyEntity policyEntity) throws InterruptedException {
		switchToWindow("Reason");
		if (policyEntity.getBooleanValueForField("ConfigCancellationBasis")) {
			selectValueFromList(cancellationBasisDropDown, policyEntity.getStringValueForField("CancellationBasis"));
		}

		if (policyEntity.getBooleanValueForField("ConfigManualRefundPremium")) {
			// SelectValueAndTypeForTextField(manualRefundPremiumTextField,
			// policyEntity.getStringValueForField("ManualRefundPremium"));
			if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("CT")|| policyEntity.getStringValueForField("Product").equalsIgnoreCase("DO")|| policyEntity.getStringValueForField("Product").equalsIgnoreCase("PL"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 150;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("PF")|| policyEntity.getStringValueForField("Product").equalsIgnoreCase("LN"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 1000;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if (policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")|| policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")) {
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("PX"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 150;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if (policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("IN"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 150;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				//SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
				SelectValueAndTypeForHomeTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
				//SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))&& (policyEntity.getBooleanValueForField("ConfigRetainedPremium"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 250;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("WR"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 50;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("OP"))||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("SI"))||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("AN")||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("SV")))){
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 1920;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("BC"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 200;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))
					&& ((policyEntity.getStringValueForField("Product").equalsIgnoreCase("BB"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("BD"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("BA"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("EV"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("EX"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("HH"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("SH"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("JI"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("SY"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("OS"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("FS"))
							|| (policyEntity.getStringValueForField("Product").equalsIgnoreCase("SE")))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 100;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))&& ((policyEntity.getStringValueForField("Product").equalsIgnoreCase("RM")))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 50;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))&& ((policyEntity.getStringValueForField("Product").equalsIgnoreCase("MI")))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 252;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			} else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation"))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 900;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			}
			else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))&&(!(policyEntity.getStringValueForField("Product").equalsIgnoreCase("BC")))) {
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 900;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			}
			else if ((policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo"))&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("TC"))){
				double manualRefundPremium;
				manualRefundPremium = Double.parseDouble(fetchValueFromTextFields(manualRefundPremiumTextField));
				double ManualRefundPremium = (manualRefundPremium) - 100;
				String ManualRefundPremiumCalculate = String.valueOf(Math.round(ManualRefundPremium));
				policyEntity.setStringValueForField("ManualRefundPremium", ManualRefundPremiumCalculate);
				SelectValueAndTypeForTextField(manualRefundPremiumTextField,policyEntity.getStringValueForField("ManualRefundPremium"));
			}
		}

		if (policyEntity.getBooleanValueForField("ConfigRetainTpPremium")) {
			selectValueFromList(retainTpPremiumDropDown, policyEntity.getStringValueForField("RetainTpPremium"));
		}
		if (policyEntity.getBooleanValueForField("ConfigCancellationReason")) {
			selectValueFromList(cancellationReasonDropDown, policyEntity.getStringValueForField("CancellationReason"));
		}
		if (policyEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
			String eventeffectiveDate = RandomCodeGenerator
					.dateGenerator(policyEntity.getStringValueForField("EventEffectiveDate"));
			clearAndEnterDate(pEventEffectiveDateTextField, eventeffectiveDate);
		}
		/*
		 * if (policyEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
		 * click(eventEffectiveDateFindButton); Thread.sleep(1000);
		 * selectDateFromCalender(eventEffectiveDateCancelTextField,
		 * policyEntity.getStringValueForField("EventEffectiveDate"));
		 * switchToFrame("display"); }
		 */

		if (policyEntity.getBooleanValueForField("ConfigEndorseEffectiveDate")) {
			String endorseeffectiveDate = RandomCodeGenerator
					.dateGenerator(policyEntity.getStringValueForField("EndorseEffectiveDate"));
			clearAndEnterDate(endorseEffectiveDateTextField, endorseeffectiveDate);
		}
		if (policyEntity.getBooleanValueForField("ConfigReason")) {
			Thread.sleep(3000);
			clearAndSendKeys(reasonForInitiating, policyEntity.getStringValueForField("Reason"));
		}
		if (policyEntity.getBooleanValueForField("ConfigPrimaryEndorsment")) {
			selectValueFromList(primaryEndorsementDropdown, policyEntity.getStringValueForField("PrimaryEndorsment"));
		}
		if (policyEntity.getBooleanValueForField("ConfigMemorandum")) {
			clearAndSendKeys(memorandumTextArea, policyEntity.getStringValueForField("Memorandum"));
		}
		if (policyEntity.getBooleanValueForField("ConfigPolicyType")) {
			selectValueFromList(policytype, policyEntity.getStringValueForField("PolicyType"));
		}
		if (policyEntity.getBooleanValueForField("ConfigNonNilPolicyType")) {
			selectValueFromList(policytypeForNonnilEndorsment, policyEntity.getStringValueForField("PolicyType"));
		}
		if (policyEntity.getBooleanValueForField("ConfigPassportDetailsVerified")) {
			selectValueFromList(passportDetailsVerifiedDropdown,
					policyEntity.getStringValueForField("PassportDetailsVerified"));
		}
		if (policyEntity.getBooleanValueForField("ConfigCalculatedRefundPremium")) {
			clearAndSendKeys(calculatedRefundPremiumTextField,
					policyEntity.getStringValueForField("CalculatedRefundPremium"));
		}
		if (policyEntity.getBooleanValueForField("ConfigPremiumCalculationBasis")) {
			selectValueFromList(premiumCalculationBasisDropdown,
					policyEntity.getStringValueForField("PremiumCalculationBasis"));
		}
		if (policyEntity.getBooleanValueForField("ConfigMigration")) {
			selectValueFromList(migrationTypeDrpdown, policyEntity.getStringValueForField("Migration"));
		}
		if (policyEntity.getBooleanValueForField("ConfigChangeProposer")) {
			selectValueFromList(changeProposerDrpdown, policyEntity.getStringValueForField("ChangeProposer"));
		}
		if (policyEntity.getBooleanValueForField("ConfigSave")) {
			Thread.sleep(3000);
			click(reasonSaveButton);
			switchToWindow();
		}
		if (policyEntity.getBooleanValueForField("ConfigErrorHandle")) {
			switchToWindow("Integrated Insurance Management System", "Error Window");
		} else {

			switchToWindow("Integrated Insurance Management System");
		}
		// switchToFrame("display");
	}

	public void closeRenewWindow(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigClose")) {
			switchToWindow("Error Window");
			if (!(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))
					&& (policyEntity.getStringValueForField("Product").equalsIgnoreCase("ME")||(policyEntity.getStringValueForField("Product").equalsIgnoreCase("CV")))) {
				fetchRenewedPolicyCode(policyEntity);
				click(closeRenewButton);
			} else {
				click(closeRenewButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				fetchRenewedPolicyCodeME(policyEntity);
			}
			switchToWindow();
			switchToFrame("display");

		}
	}

	public void fetchRenewedPolicyCode(PolicyEntity policyEntity) {
		policyEntity.setStringValueForField("QuoteNo", fetchValueFromFields(renewedQuoteNumberField));
	}

	public void selectSearchQuote(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigSearchQuoteNo")) {
			quoteNo = policyEntity.getStringValueForField("QuoteNo").trim();
			policyQuoteLink = new PageElement(By.xpath("//a//font[contains(text(),'" + quoteNo + "')]"),
					"Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyQuoteLink);
			switchToFrame("display");
		}
	}

	public void selectSearchPolicy(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigSearchPolicyNo")) {
			policyNo = policyEntity.getStringValueForField("PolicyNo").trim();
			policyNoLink = new PageElement(By.xpath("//a//font[contains(text(),'" + policyNo + "')]"),
					"Policy No Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyNoLink);
			switchToFrame("display");
		}
	}

	public void fillReasonPageOnCollectionPage(PolicyEntity policyEntity) throws InterruptedException {
		switchToWindow("Reason");
		
		if (policyEntity.getBooleanValueForField("ConfigNonSystemOldPolicyNumber")) {
			String nonSystemOldPolicyNumber = policyEntity.getStringValueForField("QuoteNo") + "0000";
			clearAndSendKeys(nonSystemOldPolicyNumberTextField, nonSystemOldPolicyNumber);
		}

		if (policyEntity.getBooleanValueForField("ConfigLastPaymentDueDate")) {
			String lastPaymentDueDate = RandomCodeGenerator
					.dateGenerator(policyEntity.getStringValueForField("LastPaymentDueDate"));
			clearAndEnterDate(lastPaymentDueDateTextField, lastPaymentDueDate);
		}
		if (policyEntity.getBooleanValueForField("ConfigReasonForInitiate")) {
			clearAndSendKeys(reasonForInitiatingThisActionTextField,
					policyEntity.getStringValueForField("ReasonForInitiate"));
		}
		if (policyEntity.getBooleanValueForField("ConfigSaveForCollection")) {
			click(saveCollectionButton);
			switchToWindow("Integrated Insurance Management System");
		}
		switchToWindow();
		switchToFrame("display");
	}

	public void navigateToInsuredInterest(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")) {
			click(insuredInterestTab);
			if (policyEntity.getStringValueForField("Product").equalsIgnoreCase("PL")) {
				try {
					acceptAlertAndReturnConfirmationMessage();
				} catch (Exception e) {
				}
			}
			switchToFrame("display");
			// isElementDisplayed(memberTabTitle);
		}
	}

	public void clickOnPremiumCurrencyFindButton(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigPremiumCurrencyFindButton")) {
			click(premiumCurrencyFindButton);
			switchToWindow("Foreign Exchange Rate");

		}
	}

	public void selectPremiumCurrency(PolicyEntity policyEntity) throws InterruptedException {
		clearAndSendKeys(premiumCurrencyRateTextField, policyEntity.getStringValueForField("PremiumCurrencyRate"));
		clickOnPremiumCurrencyFindButton(policyEntity);
		premiumCurrencyToBeSelectedLink = new PageElement(
				By.xpath("//a[contains(text(),'" + policyEntity.getStringValueForField("PremiumCurrency") + "')]"),
				"Premium Currency to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(premiumCurrencyToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}

	public void clickPolicyCollectionDetails(PolicyEntity policyEntity, CustomAssert assertReference)
			throws InterruptedException {
		if (policyEntity.getAction().equalsIgnoreCase("verify")) {
			if (policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")) {
				click(collectionDetailsButton);
				switchToWindow("Collection Search Type");
				isElementDisplayed(collectionSearchPageIdentifier);
			}
		}
	}

	public void clickTagNoChangeButton(PolicyEntity policyEntity, CustomAssert assertReference)
			throws InterruptedException {
		if (policyEntity.getAction().equalsIgnoreCase("add") || policyEntity.getAction().equalsIgnoreCase("edit")) {
			if (policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")) {
				click(tagNoChangeButton);
				try {
					Thread.sleep(3000);
					switchToWindow("Collection Screen");
				} catch (Exception e) {
					switchToWindow("Collection Screen");
				}
				Thread.sleep(3000);
				isElementDisplayed(collectionPageIdentifier);
			}
		}
	}

	// ME
	public void fetchRenewedPolicyCodeME(PolicyEntity policyEntity) {
		policyEntity.setStringValueForField("QuoteNo", fetchValueFromTextFields(quoteNumberTextFeild));
	}

	public void navigateBrokerAgentTPAChangeDetLink(PolicyEntity policyEntity, CustomAssert assertReference)
			throws InterruptedException {
		if (policyEntity.getAction().equalsIgnoreCase("verify")
				|| (policyEntity.getAction().equalsIgnoreCase("edit"))) {
			if (policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")) {
				switchToFrame("Control");
				click(brokerAgentTPAChangeDetLink);
			}
		}
	}

	public void clickContactDetailsEndorsement(PolicyEntity policyEntity) throws InterruptedException {
		if (policyEntity.getBooleanValueForField("ConfigContactDetailsEndButton")) {
			click(contactdetailsbutton);
			fillReasonContactDetails(policyEntity);
			switchToFrame("display");
		}
	}
	@Override
	protected void switchToWindow() throws InterruptedException {
		// TODO Auto-generated method stub
		super.switchToWindow();
	}

	public void fillReasonContactDetails(PolicyEntity policyEntity) throws InterruptedException{
		switchToWindow("Contact Details");
		if(policyEntity.getBooleanValueForField("ConfigStateContactDetails")){
			clearAndSendKeys(stateContactTextField, policyEntity.getStringValueForField("ContactDetailsStateName"));
		}

		if(policyEntity.getBooleanValueForField("ConfigCityContactDetails")){
			clearAndSendKeys(cityContactTextField, policyEntity.getStringValueForField("ContactDetailsCityName"));
		}
		if(policyEntity.getBooleanValueForField("ConfigPincodeContactDetails")){
			clearAndSendKeys(pinContactTextField, policyEntity.getStringValueForField("ContactDetailsPinCode"));
		}
		/*if(policyEntity.getBooleanValueForField("ConfigBackContactDetails")){
			click(backContactButton);
			}*/
		if(policyEntity.getBooleanValueForField("ConfigUpdateContactDetails")){
			click(updateContactButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
			}catch(Exception e){}
		}
		if(policyEntity.getBooleanValueForField("ConfigBackContactDetails")){
			click(backContactButton);
			switchToWindow("Integrated Insurance Management System");
		}
	}
	//	switchToWindow();
	//	switchToFrame("display");
	public void fillandSubmitPolicyDetails(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException, ParseException{
		if(isConfigTrue(policyEntity.getConfigExecute())){
			if (isConfigTrue(policyEntity.getConfigExecute())) {
				try {
					switchToFrame("display");
				} catch (Exception ex) {
				}
				fillPolicyDetails(policyEntity, assertReference);
				submitPolicyDetails(policyEntity);
				submitCCPolicyDetails(policyEntity);
				clickClaimSynopsis(policyEntity);
				navigateToPolicy(policyEntity);
				navigateToAttribute(policyEntity);
				navigateToMember(policyEntity);
				navigateToInsuredInterest(policyEntity);
				navigateToCoverage(policyEntity);
				navigateToLoan(policyEntity);
				navigateToClientDetails(policyEntity);
				navigateToRelation(policyEntity);
				navigateToPayment(policyEntity);
				navigateToFollowup(policyEntity);
				navigateToDocument(policyEntity);
				clickPremiumSchedule(policyEntity);
				clickAddRisk(policyEntity);
				clickRiskList(policyEntity);
				clickCalculatePremium(policyEntity);
				clickApproveProposal(policyEntity);
				clickMarineCargoApproveProposal(policyEntity);
				clickApproveRenewal(policyEntity);
				clickRejectProposal(policyEntity);
				clickNonSysPolicy(policyEntity);
				clickConditions(policyEntity);
				clickTransferToAP(policyEntity);
				clickIssuePolicy(policyEntity);
				clickCollection(policyEntity, assertReference);
				clickEndorseAlter(policyEntity);
				clickSuspend(policyEntity);
				clickCancelPolicy(policyEntity);
				clickRenew(policyEntity);
				clickCommissionRecovery(policyEntity);
				clickServiceTaxCollection(policyEntity);
				clickServiceTaxRefund(policyEntity);
				clickNottobeRenewed(policyEntity);
				clickRejectRenewal(policyEntity);
				clickIssueRenewedPolicy(policyEntity);
				clickEndAlteration(policyEntity);
				clickRejectAlteration(policyEntity);
				clickProjection(policyEntity);
				clickGenerateDuplicatePolicy(policyEntity);
				clickRejectCancellation(policyEntity);
				clickApproveCancellation(policyEntity);
				clickPolicyCollectionDetails(policyEntity, assertReference);
				clickCoInsuranceDetails(policyEntity);
				backFromPolicyDetails(policyEntity);
				clickTagNoChangeButton(policyEntity, assertReference);
				navigateBrokerAgentTPAChangeDetLink(policyEntity, assertReference);
				clickContactDetailsEndorsement(policyEntity);
				// backFromPolicyShowVersion(policyEntity);
			}
		}
	}
}
