package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsAttPHT1PLRMembPAEntity;
import com.aqm.staf.library.databin.PolInsureAttRiskDetailEntity;

public class PolicyInsuredIntrestAttrPHT1PLRMemberPersonalAccident extends BasePage {
	private PageElement pHT1PLRMemberTitle;
	private PageElement pHT2PLRMemberTitle;
	
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

	private PageElement insuredInterestDetailsTab;	
	private PageElement insuredInterestAttributesTab;	
	private PageElement insuredInterestAttachCoveragesTab;	
	private PageElement insuredInterestRelationsTab;	
	private PageElement insuredInterestPaymentsTab;	
	private PageElement insuredInterestScheduleTab;	
	
	private PageElement insuredInterestDetailsTabTitle;	
	private PageElement insuredInterestAttributesTabTitle;	
	private PageElement insuredInterestAttachCoveragesTabTitle;	
	private PageElement insuredInterestRelationsTabTitle;	
	private PageElement insuredInterestPaymentsTabTitle;	
	private PageElement insuredInterestScheduleTabTitle;
	
	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement insuredInterestSerialNoLable;
	
	private PageElement	orderNumberTextField;
	private PageElement	cardNumberTextField;
	private PageElement	cardMemberNameTextField;
	private PageElement	dOBofMemberTextField;
	private PageElement	ageYearTextField;
	private PageElement	applicantNameTextField;
	private PageElement	relationTextField;
	private PageElement	pA_PlanTypeDropDown;
	private PageElement	address1TextField;
	private PageElement	address2TextField;
	private PageElement	address3TextField;
	private PageElement	aDDRESS4TextField;
	private PageElement	cityTextField;
	private PageElement	pinCodeTextField;
	private PageElement	resTelTextField;
	private PageElement	offTelTextField;
	private PageElement	certificateNoTextField;
	private PageElement	accountNoTextField;
	private PageElement	customerCodeTextField;
	private PageElement	preExistingDiseaseDropDown;
	private PageElement	taxdeductionTextField;
	private PageElement	sexDropDown;
	private PageElement	pAPREMIUMTextField;
	private PageElement	dateofBirthofNomineeTextField;
	private PageElement	ageofNomineeTextField;
	private PageElement	dateofEntryofNominationTextField;
	private PageElement	mCPolicyNumberTextField;
	private PageElement	certificateMobileNoTextField;
	private PageElement	certificateEmailIdTextField;

	private PageElement nextButton;
	private PageElement backButton;
	
	public PolicyInsuredIntrestAttrPHT1PLRMemberPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		pHT1PLRMemberTitle	= new PageElement(By.xpath("//div//b//font[contains(text(),'PH T1-PLR Member')]"), "PH T1-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pHT2PLRMemberTitle	= new PageElement(By.xpath("//div//b//font[contains(text(),'PH T2-PLR Member')]"), "pH T2-PLR MemberTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
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

		insuredInterestDetailsTab			= new PageElement(By.xpath("//table[2]//tbody//td//div//b[contains(text(),'Detail')]"), "Insured Interest Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab		= new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab Button ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab	= new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab			= new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab			= new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab			= new PageElement(By.xpath("//div[@title='Schedule']"), "Insured Interest Schedule Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		insuredInterestDetailsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy/Quote Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Schedule Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLable  	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLable	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLable	 		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLable		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		orderNumberTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Order Number')]/following::input"), "Order Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cardNumberTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Card Number')]/following::input"), "Card Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cardMemberNameTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Card Member Name')]/following::input"), "Card Member Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dOBofMemberTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'DOB of Member')]/following::input"), "DOB of Member Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageYearTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Age (Year)')]/following::input"), "Age (Year) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicantNameTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Applicant Name')]/following::input"), "Applicant Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Relation')]/following::input"), "Relation Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pA_PlanTypeDropDown		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'PA_Plan Type')]/following::select"), "PA_Plan Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		address1TextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Address 1')]/following::input"), "Address 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address2TextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Address 2')]/following::input"), "Address 2 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address3TextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Address 3')]/following::input"), "Address 3 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aDDRESS4TextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'ADDRESS 4')]/following::input"), "ADDRESS 4 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityTextField			= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'City')]/following::input"), "City Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Pin code')]/following::input"), "Pin code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		resTelTextField			= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Res_Tel')]/following::input"), "Res_Tel Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		offTelTextField			= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Off_Tel')]/following::input"), "Off_Tel Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateNoTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Certificate No')]/following::input"), "Certificate No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountNoTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Account No')]/following::input"), "Account No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		customerCodeTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Customer Code')]/following::input"), "Customer Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preExistingDiseaseDropDown	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Pre-Existing Disease')]/following::select"), "Pre-Existing Disease DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		taxdeductionTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Tax_deduction')]/following::input"), "Tax_deduction Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown				= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Sex')]/following::select"), "Sex DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pAPREMIUMTextField		= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'PA_PREMIUM')]/following::input"), "PA_PREMIUM Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofBirthofNomineeTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Date of Birth of Nominee')]/following::td"), "Date of Birth of Nominee Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageofNomineeTextField			= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Age of Nominee')]/following::input"), "Age of Nominee Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofEntryofNominationTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Date of Entry of Nomination')]/following::td"), "'Date of Entry of Nomination Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mCPolicyNumberTextField			= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'MC Policy Number')]/following::input"), "MC Policy Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateMobileNoTextField	= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Certificate Mobile No')]/following::input"), "Certificate Mobile No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateEmailIdTextField	    = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Certificate Email Id')]/following::input"), "Certificate Email Id Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		nextButton	= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton	= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
	}
	public void fillPHT1PLRMemberDetails(PolInsAttPHT1PLRMembPAEntity polInsAttPHT1PLRMembPAEntity, CustomAssert assertReference){
		if((polInsAttPHT1PLRMembPAEntity.getAction().equalsIgnoreCase("add") || polInsAttPHT1PLRMembPAEntity.getAction().equalsIgnoreCase("edit"))){
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigOrderNumber")) {
				clearAndSendKeys(orderNumberTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("OrderNumber"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCardNumber")) {
				clearAndSendKeys(cardNumberTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CardNumber"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCardMemberName")) {
				clearAndSendKeys(cardMemberNameTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CardMemberName"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDOBofMember")) {
				clearAndEnterDate(dOBofMemberTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("DOBofMember"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAge")) {
				clearAndSendKeys(ageYearTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Age"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigApplicantName")) {
				clearAndSendKeys(applicantNameTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("ApplicantName"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigRelation")) {
				clearAndSendKeys(relationTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Relation"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPAPlanType")) {
				selectValueFromList(pA_PlanTypeDropDown, polInsAttPHT1PLRMembPAEntity.getStringValueForField("PAPlanType"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress1")) {
				clearAndSendKeys(address1TextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address1"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress2")) {
				clearAndSendKeys(address2TextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address2"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress3")) {
				clearAndSendKeys(address3TextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address3"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigADDRESS4")) {
				clearAndSendKeys(aDDRESS4TextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("ADDRESS4"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCity")) {
				clearAndSendKeys(cityTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("City"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPincode")) {
				clearAndSendKeys(pinCodeTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Pincode"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigResTel")) {
				clearAndSendKeys(resTelTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("ResTel"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigOffTel")) {
				clearAndSendKeys(offTelTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("OffTel"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateNo")) {
				clearAndSendKeys(certificateNoTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateNo"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAccountNo")) {
				clearAndSendKeys(accountNoTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("AccountNo"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCustomerCode")) {
				clearAndSendKeys(customerCodeTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CustomerCode"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPreExistingDisease")) {
				selectValueFromList(preExistingDiseaseDropDown, polInsAttPHT1PLRMembPAEntity.getStringValueForField("PreExistingDisease"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigTaxdeduction")) {
				clearAndSendKeys(taxdeductionTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Taxdeduction"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, polInsAttPHT1PLRMembPAEntity.getStringValueForField("Sex"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPAPREMIUM")) {
				clearAndSendKeys(pAPREMIUMTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("PAPREMIUM"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDateofBirthofNominee")) {
				clearAndEnterDate(dateofBirthofNomineeTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("DateofBirthofNominee"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAgeofNominee")) {
				clearAndSendKeys(ageofNomineeTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("AgeofNominee"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDateofEntryofNomination")) {
				clearAndEnterDate(dateofEntryofNominationTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("DateofEntryofNomination"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigMCPolicyNumber")) {
				clearAndSendKeys(mCPolicyNumberTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("MCPolicyNumber"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
				clearAndSendKeys(certificateMobileNoTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateMobileNo"));
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
				clearAndSendKeys(certificateEmailIdTextField, polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateEmailId"));
			}
		}
		else if(polInsAttPHT1PLRMembPAEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigQuoteNo")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLable), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPolicyholder")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLable), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLable), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigStatus")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLable), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigProductName")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLable), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLable), AssertionType.WARNING);
			}
			
			
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigOrderNumber")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("OrderNumber"), fetchValueFromTextFields(orderNumberTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCardNumber")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CardNumber"), fetchValueFromTextFields(cardNumberTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCardMemberName")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CardMemberName"), fetchValueFromTextFields(cardMemberNameTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDOBofMember")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("DOBofMember"), fetchValueFromTextFields(dOBofMemberTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAge(Year)")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Age(Year)"), fetchValueFromTextFields(ageYearTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigApplicantName")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("ApplicantName"), fetchValueFromTextFields(applicantNameTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigRelation")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Relation"), fetchValueFromTextFields(relationTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPAPlanType")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("PAPlanType"), fetchValueFromTextFields(pA_PlanTypeDropDown), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress1")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address1"), fetchValueFromTextFields(address1TextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress2")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address2"), fetchValueFromTextFields(address2TextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAddress3")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Address3"), fetchValueFromTextFields(address3TextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigADDRESS4")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("ADDRESS4"), fetchValueFromTextFields(aDDRESS4TextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCity")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("City"), fetchValueFromTextFields(cityTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPincode")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Pincode"), fetchValueFromTextFields(pinCodeTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigResTel")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("ResTel"), fetchValueFromTextFields(resTelTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigOffTel")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("OffTel"), fetchValueFromTextFields(offTelTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateNo")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateNo"), fetchValueFromTextFields(certificateNoTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAccountNo")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("AccountNo"), fetchValueFromTextFields(accountNoTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCustomerCode")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CustomerCode"), fetchValueFromTextFields(customerCodeTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPre-ExistingDisease")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Pre-ExistingDisease"), fetchValueFromTextFields(preExistingDiseaseDropDown), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigTaxdeduction")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Taxdeduction"), fetchValueFromTextFields(taxdeductionTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigSex")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("Sex"), fetchValueFromTextFields(sexDropDown), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigPAPREMIUM")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("PAPREMIUM"), fetchValueFromTextFields(pAPREMIUMTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDateofBirthofNominee")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("DateofBirthofNominee"), fetchValueFromTextFields(dateofBirthofNomineeTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigAgeofNominee")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("AgeofNominee"), fetchValueFromTextFields(ageofNomineeTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigDateofEntryofNomination")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("DateofEntryofNomination"), fetchValueFromTextFields(dateofEntryofNominationTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigMCPolicyNumber")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("MCPolicyNumber"), fetchValueFromTextFields(mCPolicyNumberTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateMobileNo"), fetchValueFromTextFields(certificateMobileNoTextField), AssertionType.WARNING);
			}
			if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
			    assertReference.assertEquals(polInsAttPHT1PLRMembPAEntity.getStringValueForField("CertificateEmailId"), fetchValueFromTextFields(certificateEmailIdTextField), AssertionType.WARNING);
			}
		}
	}
	public void clickNextPHT1PLRMember(PolInsAttPHT1PLRMembPAEntity polInsAttPHT1PLRMembPAEntity) {
		if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			isElementDisplayed(pHT2PLRMemberTitle);
		}
	}
		
	public void clickBackToAttributeTab(PolInsAttPHT1PLRMembPAEntity polInsAttPHT1PLRMembPAEntity) {
		if (polInsAttPHT1PLRMembPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
		
	public void navigateToInsuredInterestDetailsTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
		
	public void navigateToInsuredInterestAttributesTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
	
	public void navigateToInsuredInterestAttachCoveragesTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragesTabTitle);
		}
	}
	
	public void navigateToInsuredInterestRelationsTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTabTitle);
		}
	}
	
	public void navigateToInsuredInterestPaymentsTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentsTabTitle);
		}
	}
	
	public void navigateToInsuredInterestScheduleTab(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTabTitle);
		}
	}
	////////
	public void navigateToPolicy(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	
	public void fillandSubmitPHT1PLRMember(PolInsAttPHT1PLRMembPAEntity polInsureAttRiskDetailEntity, CustomAssert assertReference) {
		if(isConfigTrue(polInsureAttRiskDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillPHT1PLRMemberDetails(polInsureAttRiskDetailEntity, assertReference);
			clickNextPHT1PLRMember(polInsureAttRiskDetailEntity);
			clickBackToAttributeTab(polInsureAttRiskDetailEntity);
			
			navigateToInsuredInterestDetailsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestAttributesTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestAttachCoveragesTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestRelationsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestPaymentsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestScheduleTab(polInsureAttRiskDetailEntity);
						
			navigateToPolicy(polInsureAttRiskDetailEntity);
			navigateToAttribute(polInsureAttRiskDetailEntity);
			navigateToInsuredInterest(polInsureAttRiskDetailEntity);
			navigateToCoverage(polInsureAttRiskDetailEntity);
			navigateToClientDetails(polInsureAttRiskDetailEntity);
			navigateToRelation(polInsureAttRiskDetailEntity);
			navigateToPayment(polInsureAttRiskDetailEntity);
			navigateToFollowup(polInsureAttRiskDetailEntity);
			navigateToDocument(polInsureAttRiskDetailEntity);
		}
	}	

	
}
