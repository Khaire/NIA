package com.aqm.staf.library.pages.health;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemAttrSTDRiskEntity;


public class PolicyMemAttrRiskDetailsForSTDRiskPage extends BasePage {

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
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement riskDetailsForSTDRiskPageTitle;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement isPreExistingDiseasesCoverRequiredDropDown;
	private PageElement percentageOfLoadingForPreExistingDiseasesTextField;
	private PageElement is30DaysWaitingPeriodRequiredTToBeDeletedDropDown;
	private PageElement	percentageOfLoadingForDeleting30DaysWaitingPeriodTextField;
	private PageElement isYrClaimExclusionRequiredToBeDeletedDropDown;
	private PageElement	percentageOfLoadingForDeleting24YrClaimExclusionTextField;
	private PageElement detailsOfPreExistingDiseasesTextField;
	
	private PageElement proceedButton;
	private PageElement backButton;
	private PageElement saveButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement basicPremPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	
	//MU-@Priyanka
	private PageElement orderNumberTextField;
	private PageElement cardNumberTextField;
	private PageElement cardMemberNameTextField;
	private PageElement dOBofMemberTextField;
	private PageElement applicantNameTextField;
	private PageElement relationTextField;
	private PageElement mC_PLANofMUDropDown;
	private PageElement address1TextField;
	private PageElement address2TextField;
	private PageElement address3TextField;
	private PageElement aDDRESS4TextField;
	private PageElement cityTextField;
	private PageElement pincodeTextField;
	private PageElement res_TelTextField;
	private PageElement off_TelTextField;
	private PageElement certificateNoTextField;
	private PageElement accountNoTextField;
	private PageElement customerCodeTextField;
	private PageElement preExistingDiseaseDropDown;
	private PageElement tax_deductionTextField;
	private PageElement sexDropDown;
	private PageElement pA_PREMIUMTextField;
	private PageElement mC_PREMIUMTextField;
	private PageElement nomineeNameTextField;
	private PageElement relationshipOfTheNomineeWithTheInsuredDropDown;
	private PageElement dateOfBirthOfNomineeTextField;
	private PageElement ageOfNomineeTextField;
	private PageElement dateOfEntryOfNominationTextField;
	private PageElement certificateMobileNoTextField;
	private PageElement certificateEmailIdTextField;
	//TF
	private PageElement typeofFloaterRequiredDropDown;
	private PageElement FloaterPercentagTextField;
	//RS-Amit
	private PageElement govermentSubsidiesDropdown;

	public PolicyMemAttrRiskDetailsForSTDRiskPage (WebDriver driver, String pageName) {

		super(driver, pageName);
		riskDetailsForSTDRiskPageTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Risk Details')]"), "Risk Details for STD Risk Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicPremPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Basic Prem')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				
		//MU-@Priyanka
		
		orderNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Order Number", "input")), "Order Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cardNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Card Number", "input")), "Card Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cardMemberNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Card Member Name", "input")), "Card Member Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dOBofMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("DOB of Member", "input")), "DOB of Member Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicantNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Applicant Name", "input")), "Applicant Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation", "input")), "Relation Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mC_PLANofMUDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_PLAN of MU", "select")), "MC_PLAN of MU Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		address1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 1", "input")), "Address 1 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 2", "input")), "Address 2 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 3", "input")), "Address 3 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aDDRESS4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ADDRESS 4", "input")), "ADDRESS 4 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("City", "input")), "City Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pincodeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pin code", "input")), "Pin code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		res_TelTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Res_Tel", "input")), "Res_Tel Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		off_TelTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Off_Tel", "input")), "Off_Tel Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate No", "input")), "Certificate No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Account No", "input")), "Account No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		customerCodeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Customer Code", "input")), "Customer Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preExistingDiseaseDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-Existing Disease", "select")), "Pre-Existing Disease Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tax_deductionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tax_deduction", "input")), "Tax_deduction Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex", "select")), "Sex Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pA_PREMIUMTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA_PREMIUM", "input")), "PA_PREMIUM Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mC_PREMIUMTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_PREMIUM", "input")), "MC_PREMIUM Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineeNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominee Name", "input")), "Nominee Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipOfTheNomineeWithTheInsuredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of the nominee with the insured", "select")), "Relationship of the nominee with the insured Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfBirthOfNomineeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Nominee", "input")), "Date of Birth of Nominee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfNomineeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of Nominee", "input")), "Age of Nominee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfEntryOfNominationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Entry of Nomination", "input")), "Date of Entry of Nomination Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateMobileNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate Mobile No", "input")), "Certificate Mobile No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		certificateEmailIdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate Email Id", "input")), "Certificate Email Id Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		//TG Sachin
		isPreExistingDiseasesCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is pre existing diseases cover required?", "select")), "Is pre existing diseases cover required Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		is30DaysWaitingPeriodRequiredTToBeDeletedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is 30 days waiting period required to be deleted?", "select")), "Is 30 days waiting period required to be deleted Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isYrClaimExclusionRequiredToBeDeletedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is 2/4 yr claim exclusion required to be deleted?", "select")), "Is 2n4 yr claim exclusion required to be deleted Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
		//TF-@sonali
		typeofFloaterRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Floater Required", "select")), "Type of Floater Required Disease Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		FloaterPercentagTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Floater Percentage", "input")), "Floater Percentage Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//RS-Amit
		govermentSubsidiesDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Goverment Subsidies","select")),"Goverment Subsidies DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	
	}
	public void fillPolicyMemAttrRiskDetailsForSTDRiskPage(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity, CustomAssert assertReference)throws InterruptedException{
		if(policyMemAttrSTDRiskEntity.getAction().equalsIgnoreCase("add") || policyMemAttrSTDRiskEntity.getAction().equalsIgnoreCase("edit")){

			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIsPreExistingDiseasesCoverRequired")) {
				selectValueFromList(isPreExistingDiseasesCoverRequiredDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("IsPreExistingDiseasesCoverRequired"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForPreExistingDiseases")) {
				clearAndSendKeys(percentageOfLoadingForPreExistingDiseasesTextField, policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForPreExistingDiseases"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIs30DaysWaitingPeriodRequiredTToBeDeleted")) {
				selectValueFromList(is30DaysWaitingPeriodRequiredTToBeDeletedDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("Is30DaysWaitingPeriodRequiredTToBeDeleted"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting30DaysWaitingPeriod")) {
				clearAndSendKeys(percentageOfLoadingForDeleting30DaysWaitingPeriodTextField, policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForDeleting30DaysWaitingPeriod"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIsYrClaimExclusionRequiredToBeDeleted")) {
				selectValueFromList(isYrClaimExclusionRequiredToBeDeletedDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("IsYrClaimExclusionRequiredToBeDeleted"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting24YrClaimExclusion")) {
				clearAndSendKeys(percentageOfLoadingForDeleting24YrClaimExclusionTextField, policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForDeleting24YrClaimExclusion"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseases")) {
				clearAndSendKeys(detailsOfPreExistingDiseasesTextField, policyMemAttrSTDRiskEntity.getStringValueForField("DetailsOfPreExistingDiseases"));
			}
			
			//TF sonali
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigTypeofFloaterRequired")) {
				selectValueFromList(typeofFloaterRequiredDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("TypeofFloaterRequired"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigFloaterPercentage")) {
				clearAndSendKeys(FloaterPercentagTextField, policyMemAttrSTDRiskEntity.getStringValueForField("FloaterPercentage"));
			}
			
			//MU-@Priyanka
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigOrderNumber")) {
				clearAndSendKeys(orderNumberTextField, policyMemAttrSTDRiskEntity.getStringValueForField("OrderNumber"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCardNumber")) {
				clearAndSendKeys(cardNumberTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CardNumber"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCardMemberName")) {
				clearAndSendKeys(cardMemberNameTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CardMemberName"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDOBofMember")) {
				clearAndSendKeys(dOBofMemberTextField, policyMemAttrSTDRiskEntity.getStringValueForField("DOBofMember"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigApplicantName")) {
				clearAndSendKeys(applicantNameTextField, policyMemAttrSTDRiskEntity.getStringValueForField("ApplicantName"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRelation")) {
				clearAndSendKeys(relationTextField, policyMemAttrSTDRiskEntity.getStringValueForField("Relation"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMC_PLANofMU")) {
				selectValueFromList(mC_PLANofMUDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("MC_PLANofMU"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress1")) {
				clearAndSendKeys(address1TextField, policyMemAttrSTDRiskEntity.getStringValueForField("Address1"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress2")) {
				clearAndSendKeys(address2TextField, policyMemAttrSTDRiskEntity.getStringValueForField("Address2"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress3")) {
				clearAndSendKeys(address3TextField, policyMemAttrSTDRiskEntity.getStringValueForField("Address3"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigADDRESS4")) {
				clearAndSendKeys(aDDRESS4TextField, policyMemAttrSTDRiskEntity.getStringValueForField("ADDRESS4"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCity")) {
				clearAndSendKeys(cityTextField, policyMemAttrSTDRiskEntity.getStringValueForField("City"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPincode")) {
				clearAndSendKeys(pincodeTextField, policyMemAttrSTDRiskEntity.getStringValueForField("Pincode"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRes_Tel")) {
				clearAndSendKeys(res_TelTextField, policyMemAttrSTDRiskEntity.getStringValueForField("Res_Tel"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigOff_Tel")) {
				clearAndSendKeys(off_TelTextField, policyMemAttrSTDRiskEntity.getStringValueForField("Off_Tel"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateNo")) {
				clearAndSendKeys(certificateNoTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CertificateNo"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAccountNo")) {
				clearAndSendKeys(accountNoTextField, policyMemAttrSTDRiskEntity.getStringValueForField("AccountNo"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCustomerCode")) {
				clearAndSendKeys(customerCodeTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CustomerCode"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPreExistingDisease")) {
				selectValueFromList(preExistingDiseaseDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("PreExistingDisease"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigTax_deduction")) {
				clearAndSendKeys(tax_deductionTextField, policyMemAttrSTDRiskEntity.getStringValueForField("Tax_deduction"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("Sex"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPA_PREMIUM")) {
				clearAndSendKeys(pA_PREMIUMTextField, policyMemAttrSTDRiskEntity.getStringValueForField("PA_PREMIUM"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMC_PREMIUM")) {
				clearAndSendKeys(mC_PREMIUMTextField, policyMemAttrSTDRiskEntity.getStringValueForField("MC_PREMIUM"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigNomineeName")) {
				clearAndSendKeys(nomineeNameTextField, policyMemAttrSTDRiskEntity.getStringValueForField("NomineeName"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRelationshipOfTheNomineeWithTheInsured")) {
				selectValueFromList(relationshipOfTheNomineeWithTheInsuredDropDown, policyMemAttrSTDRiskEntity.getStringValueForField("RelationshipOfTheNomineeWithTheInsured"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDateOfBirthOfNominee")) {
				clearAndSendKeys(dateOfBirthOfNomineeTextField, policyMemAttrSTDRiskEntity.getStringValueForField("DateOfBirthOfNominee"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
				clearAndSendKeys(ageOfNomineeTextField, policyMemAttrSTDRiskEntity.getStringValueForField("AgeOfNominee"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDateOfEntryOfNomination")) {
				clearAndSendKeys(dateOfEntryOfNominationTextField, policyMemAttrSTDRiskEntity.getStringValueForField("DateOfEntryOfNomination"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
				clearAndSendKeys(certificateMobileNoTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CertificateMobileNo"));
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
				clearAndSendKeys(certificateEmailIdTextField, policyMemAttrSTDRiskEntity.getStringValueForField("CertificateEmailId"));
			}
			//RS-Amit
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigGovermentSubsidies")) {
				selectValueFromList(govermentSubsidiesDropdown, policyMemAttrSTDRiskEntity.getStringValueForField("GovermentSubsidies"));
			}
		}
		else if(policyMemAttrSTDRiskEntity.getAction().equalsIgnoreCase("verify")){

			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			// new
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIsPreExistingDiseasesCoverRequired")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("IsPreExistingDiseasesCoverRequired"), fetchValueFromList(isPreExistingDiseasesCoverRequiredDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForPreExistingDiseases")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForDeleting30DaysWaitingPeriod"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIs30DaysWaitingPeriodRequiredTToBeDeleted")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Is30DaysWaitingPeriodRequiredTToBeDeleted"), fetchValueFromList(is30DaysWaitingPeriodRequiredTToBeDeletedDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting30DaysWaitingPeriod")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForDeleting30DaysWaitingPeriod"), fetchValueFromTextFields(percentageOfLoadingForDeleting30DaysWaitingPeriodTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigIsYrClaimExclusionRequiredToBeDeleted")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("IsYrClaimExclusionRequiredToBeDeleted"), fetchValueFromList(isYrClaimExclusionRequiredToBeDeletedDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting24YrClaimExclusion")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PercentageOfLoadingForDeleting24YrClaimExclusion"), fetchValueFromTextFields(percentageOfLoadingForDeleting24YrClaimExclusionTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseases")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("DetailsOfPreExistingDiseases"), fetchValueFromTextFields(detailsOfPreExistingDiseasesTextField), AssertionType.WARNING);
			}
			
			//MU-@Priyanka
			
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigOrderNumber")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("OrderNumber"), fetchValueFromTextFields(orderNumberTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCardNumber")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CardNumber"), fetchValueFromTextFields(cardNumberTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCardMemberName")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CardMemberName"), fetchValueFromTextFields(cardMemberNameTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDOBofMember")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("DOBofMember"), fetchValueFromTextFields(dOBofMemberTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigApplicantName")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("ApplicantName"), fetchValueFromTextFields(applicantNameTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRelation")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Relation"), fetchValueFromTextFields(relationTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMC_PLANofMU")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("MC_PLANofMU"), fetchValueFromList(mC_PLANofMUDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress1")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Address1"), fetchValueFromTextFields(address1TextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress2")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Address2"), fetchValueFromTextFields(address2TextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAddress3")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Address3"), fetchValueFromTextFields(address3TextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigADDRESS4")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("ADDRESS4"), fetchValueFromTextFields(aDDRESS4TextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCity")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("City"), fetchValueFromTextFields(cityTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPincode")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Pincode"), fetchValueFromTextFields(pincodeTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRes_Tel")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Res_Tel"), fetchValueFromTextFields(res_TelTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigOff_Tel")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Off_Tel"), fetchValueFromTextFields(off_TelTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CertificateNo"), fetchValueFromTextFields(certificateNoTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAccountNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("AccountNo"), fetchValueFromTextFields(accountNoTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCustomerCode")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CustomerCode"), fetchValueFromTextFields(customerCodeTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPreExistingDisease")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PreExistingDisease"), fetchValueFromList(preExistingDiseaseDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigTax_deduction")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Tax_deduction"), fetchValueFromTextFields(tax_deductionTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPA_PREMIUM")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("PA_PREMIUM"), fetchValueFromTextFields(pA_PREMIUMTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMC_PREMIUM")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("MC_PREMIUM"), fetchValueFromTextFields(mC_PREMIUMTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigNomineeName")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("NomineeName"), fetchValueFromTextFields(nomineeNameTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRelationshipOfTheNomineeWithTheInsured")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("RelationshipOfTheNomineeWithTheInsured"), fetchValueFromList(relationshipOfTheNomineeWithTheInsuredDropDown), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDateOfBirthOfNominee")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("DateOfBirthOfNominee"), fetchValueFromTextFields(dateOfBirthOfNomineeTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("AgeOfNominee"), fetchValueFromTextFields(ageOfNomineeTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDateOfEntryOfNomination")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("DateOfEntryOfNomination"), fetchValueFromTextFields(dateOfEntryOfNominationTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CertificateMobileNo"), fetchValueFromTextFields(certificateMobileNoTextField), AssertionType.WARNING);
			}
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("CertificateEmailId"), fetchValueFromTextFields(certificateEmailIdTextField), AssertionType.WARNING);
			}
			//RS-Amit
			if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigGovermentSubsidies")) {
				assertReference.assertEquals(policyMemAttrSTDRiskEntity.getStringValueForField("GovermentSubsidies"), fetchValueFromList(govermentSubsidiesDropdown),AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToPolicyTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyMemAttrRiskDetailsForSTDRiskPage(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(basicPremPageTitle);
		}
	}
	public void submitPolicyMemAttrRiskDetailsForSTDRiskPage(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity) {
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void backButtonPolicyMemAttrRiskDetailsForSTDRiskPage(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity){
		if (policyMemAttrSTDRiskEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolicyMemberAttributesGroupNumber(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyMemAttrSTDRiskEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemAttrRiskDetailsForSTDRiskPage(policyMemAttrSTDRiskEntity, assertReference);
			proceedButtonPolicyMemAttrRiskDetailsForSTDRiskPage(policyMemAttrSTDRiskEntity);
			submitPolicyMemAttrRiskDetailsForSTDRiskPage(policyMemAttrSTDRiskEntity);
			navigateToPolicyTab(policyMemAttrSTDRiskEntity);
			navigateToAttributeTab(policyMemAttrSTDRiskEntity);
			navigateToMemberTab(policyMemAttrSTDRiskEntity);
			navigateToCoverageTab(policyMemAttrSTDRiskEntity);
			navigateToClientDetailTab(policyMemAttrSTDRiskEntity);
			navigateToRelationsTab(policyMemAttrSTDRiskEntity);
			navigateToPaymentsTab(policyMemAttrSTDRiskEntity);
			navigateToFollowupTab(policyMemAttrSTDRiskEntity);
			navigateToDocumentTab(policyMemAttrSTDRiskEntity);
			navigateToPolicyMemberDetails(policyMemAttrSTDRiskEntity);
			navigateToPolicyMemberAttributes(policyMemAttrSTDRiskEntity);
			navigateToPolicyMemberAttachCoverages(policyMemAttrSTDRiskEntity);
			navigateToPolicyMemberRelations(policyMemAttrSTDRiskEntity);
			navigateToPolicyMemberPayments(policyMemAttrSTDRiskEntity);
		}

	}
}

