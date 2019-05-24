package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;


public class ClaimPaymentDetails extends BasePage {

	private PageElement claimPaymentDetailsPageTitle;
	private PageElement claimNoLabel;
	private PageElement policyNoLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement partyFunctionDropDown;
	private PageElement partyCodeTextField;
	private PageElement claimAmountTextField;
	private PageElement currencyTextField;
	private PageElement currencyRateTextField;
	private PageElement claimAmountINRTextField;
	private PageElement purposeDropDown;
	private PageElement referenceTypeDropDown;
	private PageElement referenceNumberTextField;
	private PageElement inOutIndicatorDropDown;
	private PageElement interestRateTextField;
	private PageElement interestAmountTextField;
	private PageElement serviceTaxApplicableDropDown;
	private PageElement serviceTaxAmountTextField;
	private PageElement totalAmountTextField;
	private PageElement remarksTextField;
	private PageElement paymentOptionDropDown;
	private PageElement noOfInstallmentsTextField;
	private PageElement paymentFrequencyDropDown;
	private PageElement recoveredFromTextField;
	private PageElement approvedByTextField;
	private PageElement approvedTimestampTextField;
	private PageElement isClaimSettlementOfficeANonCWISSOfficeDropDown;
	private PageElement officeCodeTextField;
	private PageElement paymentCycleButton;
	private PageElement approvalButton;
	private PageElement rejectButton;
	private PageElement rejectApprovalButton;
	private PageElement saveButton;
	private PageElement backButton;

	//Page Titles
	private PageElement claimPaymentCycleTitle;
	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement claimPaymentsPageTitle;

	//navigate tab pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;

	//private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;

	private PageElement partyCodeFindButton;
	private PageElement partySearchButton;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveWindowButton;

	private PageElement sbcTaxAmountTextField;


	public ClaimPaymentDetails(WebDriver driver, String pageName){
		super(driver,pageName);

		claimPaymentDetailsPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment Details')]"), "Claim Payment Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Claim")), "Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Policy")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Date")), "Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0540","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		partyFunctionDropDown= new PageElement(By.name("pPartyFunction"), "Party Function Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField = new PageElement(By.name("pPaymentAmountTransc"), "Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyTextField = new PageElement(By.name("pCurrency"), "Currency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyRateTextField = new PageElement(By.name("pCurrencyRate"), "Currency Rate Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountINRTextField= new PageElement(By.name("pPaymentAmount"), "Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		purposeDropDown= new PageElement(By.name("pPaymentPurpose"), "Purpose Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		referenceTypeDropDown= new PageElement(By.name("pReferenceType"), "Reference Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		referenceNumberTextField = new PageElement(By.name("pRefNo"), "reference Number Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inOutIndicatorDropDown = new PageElement(By.name("pInOutIndicator"), "In Out Indicator", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		interestRateTextField = new PageElement(By.name("pInterestRate"), "Interest Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		interestAmountTextField = new PageElement(By.name("pInterestAmount"), "Interest Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serviceTaxApplicableDropDown = new PageElement(By.name("pServiceTaxApplicable"), "Service Tax Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		serviceTaxAmountTextField = new PageElement(By.name("pServiceTaxAmount"), "Service Tax Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAmountTextField = new PageElement(By.name("pTotalAmount"), "Total Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextField = new PageElement(By.name("pRejectionReason"), "Remarks TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentOptionDropDown = new PageElement(By.name("pPaymentOption"), "Payment Option Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfInstallmentsTextField = new PageElement(By.name("pNoOfInstmmt"), "Number of Installment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentFrequencyDropDown = new PageElement(By.name("pPaymentFrequency"), "Payment Frequency Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		recoveredFromTextField = new PageElement(By.name("pPaymentMode"), "Recovered From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimPaymentCycleTitle =new PageElement(By.xpath("//div//b[contains(text(),'Claim')]"), "Claim Paymeny Cycle Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//approvedByTextField = new PageElement(By.name("pPaymentMode"), "Recovered From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//approvedTimestampTextField = new PageElement(By.name("pPaymentMode"), "Recovered From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		approvalButton= new PageElement(By.name("Approve"), "Approve Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectButton= new PageElement(By.name("Reject"), "Reject Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isClaimSettlementOfficeANonCWISSOfficeDropDown= new PageElement(By.name("pCwissOffice"), " Is Claim settlement office a non-CWISS office ? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeCodeTextField = new PageElement(By.name("pOfficeCode"), "Office Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton= new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"), "Back Button TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentCycleButton= new PageElement(By.name("Payment Cycle"), "Payment Cycle Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectApprovalButton= new PageElement(By.name("btnRejectApproval"), "Reject Approval Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	

		// Claim Home page Links 	
		claimTab = new PageElement(By.xpath("//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		memberTab = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPaymentsPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		partyCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Party')]/following::input/following::a[@name='firstFocus']"), "Party code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partySearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"), "Reason For Initiating This Action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		saveWindowButton = new PageElement(By.name("Save"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sbcTaxAmountTextField=new PageElement(By.name("pSBCTaxAmount"), "sbc Tax Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillClaimPaymentDetails(ClaimPaymentEntity claimPaymentEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimPaymentEntity.getAction().equalsIgnoreCase("add") || claimPaymentEntity.getAction().equalsIgnoreCase("edit")){


			if (claimPaymentEntity.getBooleanValueForField("ConfigPartyFunction")) {
				selectValueFromList(partyFunctionDropDown, claimPaymentEntity.getStringValueForField("PartyFunction"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPartyCode")) {
				fillPartyCodeSearch(claimPaymentEntity);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimPaymentEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigCurrency")) {
				clearAndSendKeys(claimAmountINRTextField, claimPaymentEntity.getStringValueForField("Currency"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				clearAndSendKeys(currencyRateTextField, claimPaymentEntity.getStringValueForField("CurrencyRate"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimPaymentEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPurpose")) {
				selectValueFromList(purposeDropDown, claimPaymentEntity.getStringValueForField("Purpose"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigReferenceType")) {
				selectValueFromList(referenceTypeDropDown, claimPaymentEntity.getStringValueForField("ReferenceType"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigReferenceNumber")) {
				clearAndSendKeys(referenceNumberTextField, claimPaymentEntity.getStringValueForField("ReferenceNumber"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInOutIndicator")) {
				selectValueFromList(inOutIndicatorDropDown, claimPaymentEntity.getStringValueForField("InOutIndicator"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInterestRate")) {
				clearAndSendKeys(interestRateTextField, claimPaymentEntity.getStringValueForField("InterestRate"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInterestAmount")) {
				clearAndSendKeys(interestAmountTextField, claimPaymentEntity.getStringValueForField("InterestAmount"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigServiceTaxApplicable")) {
				selectValueFromList(serviceTaxApplicableDropDown, claimPaymentEntity.getStringValueForField("ServiceTaxApplicable"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigServiceTaxAmount")) {
				clearAndSendKeys(serviceTaxAmountTextField, claimPaymentEntity.getStringValueForField("ServiceTaxAmount"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigTotalAmount")) {
				clearAndSendKeys(totalAmountTextField, claimPaymentEntity.getStringValueForField("TotalAmount"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextField, claimPaymentEntity.getStringValueForField("Remarks"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentOption")) {
				selectValueFromList(paymentOptionDropDown, claimPaymentEntity.getStringValueForField("PaymentOption"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigNoOfInstallments")) {
				clearAndSendKeys(noOfInstallmentsTextField, claimPaymentEntity.getStringValueForField("NoOfInstallments"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentsFrequency")) {
				selectValueFromList(paymentFrequencyDropDown, claimPaymentEntity.getStringValueForField("PaymentsFrequency"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigRecoveredFrom")) {
				clearAndSendKeys(recoveredFromTextField, claimPaymentEntity.getStringValueForField("RecoveredFrom"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigIsClaimSettlementOfficeANonCWISSOffice")) {
				selectValueFromList(isClaimSettlementOfficeANonCWISSOfficeDropDown, claimPaymentEntity.getStringValueForField("IsClaimSettlementOfficeANonCWISSOffice"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigOfficeCode")) {
				clearAndSendKeys(officeCodeTextField, claimPaymentEntity.getStringValueForField("OfficeCode"));
			}
		}

		else if(claimPaymentEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNoLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPaymentEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPartyFunction")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PartyFunction"),fetchValueFromList(partyFunctionDropDown).trim(), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PartyCode"),fetchValueFromTextFields(partyCodeTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimAmount")) {
				String claimAmountText[] = fetchValueFromTextFields(claimAmountTextField).toString().split("\\.");
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimAmount"),claimAmountText[0], AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigCurrency")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("Currency"),fetchValueFromTextFields(currencyTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("CurrencyRate"), fetchValueFromTextFields(currencyRateTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimAmountINR")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimAmountINR"),fetchValueFromTextFields(claimAmountINRTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPurpose")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("Purpose"),fetchValueFromList(purposeDropDown).trim(), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigReferenceType")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ReferenceType"),fetchValueFromTextFields(referenceTypeDropDown), AssertionType.WARNING);
			}
			/*
			if (claimPaymentEntity.getBooleanValueForField("Config")) {
				actualClaimPaymentEntity.setStringValueForField("", fetchValueFromTextFields());
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField(""),actualClaimPaymentEntity.getStringValueForField(""), AssertionType.WARNING);
			}
			 */
			if (claimPaymentEntity.getBooleanValueForField("ConfigReferenceNumber")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ReferenceNumber"),fetchValueFromTextFields(referenceNumberTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInOutIndicator")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("InOutIndicator"),fetchValueFromList(inOutIndicatorDropDown), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInterestRate")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("InterestRate"),fetchValueFromTextFields(interestRateTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigInterestAmount")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("InterestAmount"),fetchValueFromTextFields(interestAmountTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigServiceTaxApplicable")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ServiceTaxApplicable"),fetchValueFromTextFields(serviceTaxApplicableDropDown), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigServiceTaxAmount")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ServiceTaxAmount"),fetchValueFromTextFields(serviceTaxAmountTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigTotalAmount")) {
				String totalAmountText[] = fetchValueFromTextFields(totalAmountTextField).toString().split("\\.");
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("TotalAmount"),totalAmountText[0], AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("Remarks"),fetchValueFromTextFields(remarksTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentOption")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PaymentOption"),fetchValueFromTextFields(paymentOptionDropDown), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigNoOfInstallments")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("NoOfInstallments"),fetchValueFromTextFields(noOfInstallmentsTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentFrequency")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PaymentFrequency"),fetchValueFromTextFields(paymentFrequencyDropDown), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigRecoveredFrom")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("RecoveredFrom"),fetchValueFromTextFields(recoveredFromTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigApprovedBy")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ApprovedBy"), fetchValueFromTextFields(approvedByTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigApprovedTimestamp")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ApprovedTimestamp"),fetchValueFromTextFields(approvedTimestampTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigIsClaimSettlementOfficeANonCWISSOffice")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("IsClaimSettlementOfficeANonCWISSOffice"),fetchValueFromTextFields(isClaimSettlementOfficeANonCWISSOfficeDropDown), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigOfficeCode")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("OfficeCode"), fetchValueFromTextFields(officeCodeTextField), AssertionType.WARNING);
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigSBCTaxAmount")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("SBCTaxAmount"), fetchValueFromTextFields(sbcTaxAmountTextField), AssertionType.WARNING);
			}
		}
	}


	public void submitClaimPaymentDetails(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException {
		if (claimPaymentEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			acceptAlertAndReturnConfirmationMessages();
			switchToFrame("display");
			isElementDisplayed(claimPaymentDetailsPageTitle);
		}
	}
	public void approveClaimPaymentDetails(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException {
		if (claimPaymentEntity.getBooleanValueForField("ConfigApproveButton")) {
			click(approvalButton);
			acceptAlertAndReturnConfirmationMessages();
			if(claimPaymentEntity.getStringValueForField("Browser").equalsIgnoreCase("IE") && (!claimPaymentEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineCargo")) && (!claimPaymentEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")) && (!claimPaymentEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural"))) {
				try{
					handleAlert();
				}catch (Exception e) {
					handleAlert();
				}
			}
			Thread.sleep(3000);
			switchToFrame("display");
			//isElementDisplayed(claimPaymentDetailsPageTitle);
		}
	}

	public void rejectClaimPaymentDetails(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException {
		if (claimPaymentEntity.getBooleanValueForField("ConfigRejectButton")) {
			click(rejectButton);
			switchToJSPPage();
			if (claimPaymentEntity.getBooleanValueForField("ConfigReason")){
				clearAndSendKeys(reasonForInitiatingThisActionTextArea,claimPaymentEntity.getStringValueForField("Reason"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigSaveWindow")) {
				click(saveWindowButton);
			}
			switchToWindow();
			switchToFrame("display");
			isElementDisplayed(claimPaymentDetailsPageTitle);
		}
	}

	public void rejectApprovalPayment(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException{
		if (claimPaymentEntity.getBooleanValueForField("ConfigRejectApprovalButton")) {
			click(rejectApprovalButton);
			switchToJSPPage();
			if (claimPaymentEntity.getBooleanValueForField("ConfigReason")){
				clearAndSendKeys(reasonForInitiatingThisActionTextArea,claimPaymentEntity.getStringValueForField("Reason"));
			}
			if (claimPaymentEntity.getBooleanValueForField("ConfigSaveWindow")) {
				click(saveWindowButton);
			}
			switchToWindow();
			switchToFrame("display");
			isElementDisplayed(claimPaymentDetailsPageTitle);
		}	
	}
	public void navigateToPaymentCycle(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentCycleButton")) {
			click(paymentCycleButton);
			switchToFrame("display");
			isElementDisplayed(claimPaymentCycleTitle );
		}
	}
	// Claim Home Links
	public void navigateToClaimTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToMemberTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsPageTitle);
		}
	}
	public void navigateToAttributesTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}

	//TODO Party Search for Payment //
	public void clickOnPartyCodeFindButton(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException{
		if (claimPaymentEntity.getBooleanValueForField("ConfigPartyCodeFindButton")){
			click(partyCodeFindButton);
			switchToWindow("Event List");
		}
	}
	public void fillPartyCodeSearch(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException{
		clickOnPartyCodeFindButton(claimPaymentEntity);

		if(claimPaymentEntity.getBooleanValueForField("ConfigPartyCode")){
			clearAndSendKeys(partyCodeTextField, claimPaymentEntity.getStringValueForField("PartyCode"));
		}

		selectSearchPartyCode(claimPaymentEntity);
	}
	public void selectSearchPartyCode(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException{
		String	partyCode=claimPaymentEntity.getStringValueForField("PartyCode").trim();
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");	
	}

	public void fillandSubmitClaimPaymentDetail(ClaimPaymentEntity claimPaymentEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimPaymentEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimPaymentDetails(claimPaymentEntity,assertReference);
			submitClaimPaymentDetails(claimPaymentEntity);
			approveClaimPaymentDetails(claimPaymentEntity);
			rejectClaimPaymentDetails(claimPaymentEntity);
			rejectApprovalPayment(claimPaymentEntity);
			navigateToPaymentCycle(claimPaymentEntity);
			navigateToClaimTab(claimPaymentEntity);
			navigateToMemberTab(claimPaymentEntity);
			navigateToDocumentTab(claimPaymentEntity);
			navigateToPartiesTab(claimPaymentEntity);
			navigateToReserveTab(claimPaymentEntity);
			navigateToPaymentTab(claimPaymentEntity);
			navigateToAttributesTab(claimPaymentEntity);
		}
	}
}
