package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolGHT1PLRMemberEntity;

public class PolGHT1PLRMemberPage extends BasePage{

	private PageElement policyGHT1PLRMemberPagesTitle; 
	private PageElement nextPageTitle;

	//PageTabs
	private PageElement policyTab;
	private PageElement attributesTab;
	private PageElement memberTab;
	private PageElement coverageTab;
	private PageElement loanTab;
	private PageElement clientDetailsTab;
	private PageElement relationsTab;
	private PageElement paymentsTab;
	private PageElement followupTab;
	private PageElement documentTab;
	private PageElement memberDetailsTab;
	private PageElement memberAttributesTab;
	private PageElement memberAttachCoveragesTab;
	private PageElement memberRelationsTab;
	private PageElement memberPaymentsTab;

	//Page Titles
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement followupPageTitle;
	private PageElement policyDocumentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;

	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	//Question Answers

	private PageElement orderNumberTextField;
	private PageElement cardNumberTextField;
	private PageElement cardMemberNameTextField;
	private PageElement dobOfMemberTextField;
	private PageElement ageTextField;
	private PageElement applicantNameTextField;
	private PageElement relationTextField;
	private PageElement mcPlanDropdown;
	private PageElement address1TextField;
	private PageElement address2TextField;
	private PageElement address3TextField;
	private PageElement address4TextField;
	private PageElement cityTextField;
	private PageElement pinCodeTextField;
	private PageElement resTelephoneTextField;
	private PageElement officeTelephoneTextField;
	private PageElement certificateNoTextField;
	private PageElement accountNoTextField;
	private PageElement customerCodeTextField;
	private PageElement preExistingDiseaseDropdown;
	private PageElement taxDeductionTextField;
	private PageElement sexDropdown;
	private PageElement mcPremiumTextField;
	private PageElement paPolicyNumberTextField;
	private PageElement certificateMobileNoTextField;
	private PageElement certificateEmailIdTextField;
	private PageElement nomineeNameTextField;
	private PageElement nomineesRelationWithInsuredTextField;
	private PageElement pAPlanTypeDropDown;
	//@MU-Priyanka
	private PageElement mC_PLANofMUDropDown;
	private PageElement pA_PREMIUMTextField;
	private PageElement relationshipOfTheNomineeWithTheInsuredDropDown;
	private PageElement dateOfBirthOfNomineeTextField;
	private PageElement ageOfNomineeTextField;
	private PageElement dateOfEntryOfNominationTextField;


	private PageElement forwardButton;
	private PageElement dOBFindButton;
	private PageElement saveButton;
	private PageElement WhetherYouHadATOPUPHealthPolicyinthePastDropDown;
	private PageElement companyNameTUDropDown;
	private PageElement expiringtopupHealthPolicyNumberTextField;
	private PageElement expiringSumInsuredTextField;
	private PageElement expiringThresholdTextField;
	private PageElement dateofFirstPolicyTextField;
	private PageElement expiryDateoflastPolicyTextField;

	public PolGHT1PLRMemberPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyGHT1PLRMemberPagesTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'GH T1-PLR Member')]"), "Policy GH T1-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextPageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'GH T2-PLR Member')]"), "Policy GH T2-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		//PageTabs
		policyTab = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTab = new PageElement(By.linkText("Insured Interest"), "Insured Interest Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab = new PageElement(By.linkText("Coverage"), "Coverage Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab = new PageElement(By.xpath("//div//b[contains(text(),'Client Tab')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailsTab = new PageElement(By.linkText("Detail"), "Member Details Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"),"Member Attributes Tab",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Member Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberRelationsTab= new PageElement(By.xpath("//div[@title='Relation']"), "Member Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		memberPaymentsTab=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Member Payments Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Page Titles
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), " Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Insured Interest Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//Question Answers

		orderNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Order Number","input")), "Order Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cardNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Card Number","input")), "Card Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cardMemberNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Card Member Name","input")), "Card Member Name TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dobOfMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("DOB of Member","input")), "DOB of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year)","input")), "Age (Year) TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicantNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Applicant Name","input")), "Applicant Name TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation","input")), "Relation TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		mcPlanDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_PLAN","select")), "MC_PLAN Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		address1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 1","input")), "Address 1 TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		address2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 2","input")), "Address 2 TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		address3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 3","input")), "Address 3 TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		address4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ADDRESS 4","input")), "ADDRESS 4 TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("City","input")), "City TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pinCodeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pin code","input")), "Pin code TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		resTelephoneTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Res_Tel","input")), "Res_Tel TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		officeTelephoneTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Off_Tel","input")), "Off_Tel TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		certificateNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate No","input")), "Certificate No TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Account No","input")), "Account No TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		customerCodeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Customer Code","input")), "Customer Code TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		preExistingDiseaseDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-Existing Disease","select")), "Pre-Existing Disease Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		taxDeductionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tax_deduction","input")), "Tax_deduction TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sexDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex","select")), "Sex Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		mcPremiumTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_PREMIUM","input")), "MC_PREMIUM TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paPolicyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA Policy Number","input")), "PA Policy Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		certificateMobileNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate Mobile No","input")), "Certificate Mobile No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		certificateEmailIdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate Email Id","input")), "Certificate Email Id TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nomineeNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominee Name","input")), "Nominee Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nomineesRelationWithInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Relation with Insured","input")), "Nominees Relation with Insured TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pAPlanTypeDropDown=new PageElement(By.xpath("//div[contains(text(),'PA_Plan Type')]/following::select"), "PA_Plan Type",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//@MU-Priyanka

		mC_PLANofMUDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_PLAN of MU", "select")), "MC_PLAN of MU Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pA_PREMIUMTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA_PREMIUM", "input")), "PA_PREMIUM Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipOfTheNomineeWithTheInsuredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of the nominee with the insured", "select")), "Relationship of the nominee with the insured Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfBirthOfNomineeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Nominee", "input")), "Date of Birth of Nominee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfNomineeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of Nominee", "input")), "Age of Nominee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfEntryOfNominationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Entry of Nomination", "input")), "Date of Entry of Nomination Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		saveButton=new PageElement(By.name("btnSave"), "save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("Next"), "forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dOBFindButton=new PageElement(By.xpath("//div[contains(text(),'DOB of Member')]/following::input/following::a[@name='firstFocus']"), "DOB FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WhetherYouHadATOPUPHealthPolicyinthePastDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A TOP UP Health Policy in the Past","select")),"Whether You Had A TOP UP Health Policy in the Past DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		companyNameTUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company name TU","select")),"Company name TU DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expiringtopupHealthPolicyNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiring topup Health Policy Number","input")),"Expiring topup Health Policy Number Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expiringSumInsuredTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiring Sum Insured","input")),"Expiring Sum Insured Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expiringThresholdTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiring Threshold","input")),"Expiring Threshold Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateofFirstPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of First Policy (without break-in insurance)","input")),"Date of First Policy (without break-in insurance) Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expiryDateoflastPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiry Date of  last Policy (without break-in insurance)","input")),"Expiry Date of  last Policy (without break-in insurance) Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}

	public void fillPolGHT1PLRMember(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity, CustomAssert assertReference) throws InterruptedException{
		if(polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(polGHT1PLRMemberEntity.getAction().equalsIgnoreCase("add") || polGHT1PLRMemberEntity.getAction().equalsIgnoreCase("edit")){

				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigOrderNumber")) {
					clearAndSendKeys(orderNumberTextField, polGHT1PLRMemberEntity.getStringValueForField("OrderNumber"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCardNumber")) {
					clearAndSendKeys(cardNumberTextField, polGHT1PLRMemberEntity.getStringValueForField("CardNumber"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCardMemberName")) {
					clearAndSendKeys(cardMemberNameTextField, polGHT1PLRMemberEntity.getStringValueForField("CardMemberName"));
				}
				/*if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDOBofMember")) {
					String dOBofMember=RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("DOBofMember"));
					clearAndSendKeys(dobOfMemberTextField, dOBofMember);
				}*/
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDOBofMember")) {
					selectDateFromCalender(dOBFindButton, polGHT1PLRMemberEntity.getStringValueForField("DOBofMember"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAgeYear")) {
					clearAndSendKeys(ageTextField, polGHT1PLRMemberEntity.getStringValueForField("AgeYear"));
				}
				switchToFrame("display");
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigApplicantName")) {
					clearAndSendKeys(applicantNameTextField, polGHT1PLRMemberEntity.getStringValueForField("ApplicantName"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigRelation")) {
					clearAndSendKeys(relationTextField, polGHT1PLRMemberEntity.getStringValueForField("Relation"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMCPLAN")) {
					selectValueFromList(mcPlanDropdown, polGHT1PLRMemberEntity.getStringValueForField("MCPLAN"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress1")) {
					clearAndSendKeys(address1TextField, polGHT1PLRMemberEntity.getStringValueForField("Address1"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress2")) {
					clearAndSendKeys(address2TextField, polGHT1PLRMemberEntity.getStringValueForField("Address2"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress3")) {
					clearAndSendKeys(address3TextField, polGHT1PLRMemberEntity.getStringValueForField("Address3"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress4")) {
					clearAndSendKeys(address4TextField, polGHT1PLRMemberEntity.getStringValueForField("Address4"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCity")) {
					clearAndSendKeys(cityTextField, polGHT1PLRMemberEntity.getStringValueForField("City"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPinCode")) {
					clearAndSendKeys(pinCodeTextField, polGHT1PLRMemberEntity.getStringValueForField("PinCode"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigResTel")) {
					clearAndSendKeys(resTelephoneTextField, polGHT1PLRMemberEntity.getStringValueForField("ResTel"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigOffTel")) {
					clearAndSendKeys(officeTelephoneTextField, polGHT1PLRMemberEntity.getStringValueForField("OffTel"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateNo")) {
					clearAndSendKeys(certificateNoTextField, polGHT1PLRMemberEntity.getStringValueForField("CertificateNo"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAccountNo")) {
					clearAndSendKeys(accountNoTextField, polGHT1PLRMemberEntity.getStringValueForField("AccountNo"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCustomerCode")) {
					clearAndSendKeys(customerCodeTextField, polGHT1PLRMemberEntity.getStringValueForField("CustomerCode"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPreExistingDisease")) {
					selectValueFromList(preExistingDiseaseDropdown, polGHT1PLRMemberEntity.getStringValueForField("PreExistingDisease"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigTaxdeduction")) {
					clearAndSendKeys(taxDeductionTextField, polGHT1PLRMemberEntity.getStringValueForField("Taxdeduction"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigSex")) {
					selectValueFromList(sexDropdown, polGHT1PLRMemberEntity.getStringValueForField("Sex"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMCPREMIUM")) {
					clearAndSendKeys(mcPremiumTextField, polGHT1PLRMemberEntity.getStringValueForField("MCPREMIUM"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPAPolicyNumber")) {
					clearAndSendKeys(paPolicyNumberTextField, polGHT1PLRMemberEntity.getStringValueForField("PAPolicyNumber"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
					clearAndSendKeys(certificateMobileNoTextField, polGHT1PLRMemberEntity.getStringValueForField("CertificateMobileNo"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
					clearAndSendKeys(certificateEmailIdTextField, polGHT1PLRMemberEntity.getStringValueForField("CertificateEmailId"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigNomineeName")) {
					clearAndSendKeys(nomineeNameTextField, polGHT1PLRMemberEntity.getStringValueForField("NomineeName"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigNomineesRelationwithInsured")) {
					clearAndSendKeys(nomineesRelationWithInsuredTextField, polGHT1PLRMemberEntity.getStringValueForField("NomineesRelationwithInsured"));
				}

				//MU-Priyanka

				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMC_PLANofMU")) {
					selectValueFromList(mC_PLANofMUDropDown, polGHT1PLRMemberEntity.getStringValueForField("MC_PLANofMU"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPAPREMIUM")) {
					clearAndSendKeys(pA_PREMIUMTextField, polGHT1PLRMemberEntity.getStringValueForField("PAPREMIUM"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigRelationshipOfTheNomineeWithTheInsured")) {
					selectValueFromList(relationshipOfTheNomineeWithTheInsuredDropDown, polGHT1PLRMemberEntity.getStringValueForField("RelationshipOfTheNomineeWithTheInsured"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateOfBirthOfNominee")) {
					clearAndSendKeys(dateOfBirthOfNomineeTextField, polGHT1PLRMemberEntity.getStringValueForField("DateOfBirthOfNominee"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
					clearAndSendKeys(ageOfNomineeTextField, polGHT1PLRMemberEntity.getStringValueForField("AgeOfNominee"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateOfEntryOfNomination")) {
					clearAndSendKeys(dateOfEntryOfNominationTextField, polGHT1PLRMemberEntity.getStringValueForField("DateOfEntryOfNomination"));
				}
               //Pradnya
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPAPlanType")) {
					selectValueFromList(pAPlanTypeDropDown, polGHT1PLRMemberEntity.getStringValueForField("PAPlanType"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigWhetherYouHadATOPUPHealthPolicyinthePast")) {
					selectValueFromList(WhetherYouHadATOPUPHealthPolicyinthePastDropDown, polGHT1PLRMemberEntity.getStringValueForField("WhetherYouHadATOPUPHealthPolicyinthePast"));
				}
				//TU
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCompanyNameTU")) {
					selectValueFromList(companyNameTUDropDown, polGHT1PLRMemberEntity.getStringValueForField("CompanyNameTU"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringtopupHealthPolicyNumber")) {
					clearAndSendKeys(expiringtopupHealthPolicyNumberTextField, polGHT1PLRMemberEntity.getStringValueForField("ExpiringtopupHealthPolicyNumber"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringSumInsured")) {
					clearAndSendKeys(expiringSumInsuredTextField, polGHT1PLRMemberEntity.getStringValueForField("ExpiringSumInsured"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringThreshold")) {
					clearAndSendKeys(expiringThresholdTextField, polGHT1PLRMemberEntity.getStringValueForField("ExpiringThreshold"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateofFirstPolicy")) {
					
					String dateOfApplication = RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("DateofFirstPolicy"));
					clearAndEnterDate(dateofFirstPolicyTextField, dateOfApplication);
					//clearAndSendKeys(dateofFirstPolicyTextField, polGHT1PLRMemberEntity.getStringValueForField("DateofFirstPolicy"));
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiryDateoflastPolicy")) {
					String dateOfApplication = RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("ExpiryDateoflastPolicy"));
					clearAndEnterDate(expiryDateoflastPolicyTextField, dateOfApplication);
					//clearAndSendKeys(expiryDateoflastPolicyTextField, polGHT1PLRMemberEntity.getStringValueForField("ExpiryDateoflastPolicy"));
				}
				
			}
			else if(polGHT1PLRMemberEntity.getAction().equalsIgnoreCase("verify")){
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
				}

				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigOrderNumber")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("OrderNumber"), fetchValueFromTextFields(orderNumberTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCardNumber")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CardNumber"), fetchValueFromTextFields(cardNumberTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCardMemberName")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CardMemberName"), fetchValueFromTextFields(cardMemberNameTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDOBofMember")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("DOBofMember")) ,fetchValueFromTextFields(dobOfMemberTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAgeYear")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("AgeYear"), fetchValueFromTextFields(ageTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigApplicantName")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ApplicantName"), fetchValueFromTextFields(applicantNameTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigRelation")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Relation"), fetchValueFromTextFields(relationTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMCPLAN")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("MCPLAN"), fetchValueFromList(mcPlanDropdown),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress1")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Address1"), fetchValueFromTextFields(address1TextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress2")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Address2"), fetchValueFromTextFields(address2TextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress3")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Address3"), fetchValueFromTextFields(address3TextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAddress4")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Address4"), fetchValueFromTextFields(address4TextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCity")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("City"), fetchValueFromTextFields(cityTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPinCode")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigResTel")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ResTel"), fetchValueFromTextFields(resTelephoneTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigOffTel")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("OffTel"), fetchValueFromTextFields(officeTelephoneTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateNo")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CertificateNo"), fetchValueFromTextFields(certificateNoTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAccountNo")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("AccountNo"), fetchValueFromTextFields(accountNoTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCustomerCode")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CustomerCode"), fetchValueFromTextFields(customerCodeTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPreExistingDisease")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("PreExistingDisease"), fetchValueFromList(preExistingDiseaseDropdown),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigTaxdeduction")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Taxdeduction"), fetchValueFromTextFields(taxDeductionTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigSex")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropdown),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMCPREMIUM")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("MCPREMIUM"), fetchValueFromTextFields(mcPremiumTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPAPolicyNumber")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("PAPolicyNumber"), fetchValueFromTextFields(paPolicyNumberTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateMobileNo")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CertificateMobileNo"), fetchValueFromTextFields(certificateMobileNoTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCertificateEmailId")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CertificateEmailId"), fetchValueFromTextFields(certificateEmailIdTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigNomineeName")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("NomineeName"), fetchValueFromTextFields(nomineeNameTextField),AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigNomineesRelationwithInsured")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("NomineesRelationwithInsured"), fetchValueFromTextFields(nomineesRelationWithInsuredTextField),AssertionType.WARNING);
				}

				//@MU-Priyanka

				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMC_PLANofMU")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("MC_PLANofMU"), fetchValueFromList(mC_PLANofMUDropDown), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPAPREMIUM")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("PAPREMIUM"), fetchValueFromTextFields(pA_PREMIUMTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigRelationshipOfTheNomineeWithTheInsured")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("RelationshipOfTheNomineeWithTheInsured"), fetchValueFromList(relationshipOfTheNomineeWithTheInsuredDropDown), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateOfBirthOfNominee")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("DateOfBirthOfNominee"), fetchValueFromTextFields(dateOfBirthOfNomineeTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("AgeOfNominee"), fetchValueFromTextFields(ageOfNomineeTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateOfEntryOfNomination")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("DateOfEntryOfNomination"), fetchValueFromTextFields(dateOfEntryOfNominationTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigWhetherYouHadATOPUPHealthPolicyinthePast")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("WhetherYouHadATOPUPHealthPolicyinthePast"), fetchValueFromList(WhetherYouHadATOPUPHealthPolicyinthePastDropDown), AssertionType.WARNING);
				}
				
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCompanyNameTU")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("CompanyNameTU"), fetchValueFromList(companyNameTUDropDown), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringtopupHealthPolicyNumber")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ExpiringtopupHealthPolicyNumber"), fetchValueFromTextFields(expiringtopupHealthPolicyNumberTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringSumInsured")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ExpiringSumInsured"), fetchValueFromTextFields(expiringSumInsuredTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiringThreshold")) {
					assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ExpiringThreshold"), fetchValueFromTextFields(expiringThresholdTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDateofFirstPolicy")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("DateofFirstPolicy")),
							fetchValueFromTextFields(dateofFirstPolicyTextField), AssertionType.WARNING);
					//assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("DateofFirstPolicy"), fetchValueFromTextFields(dateofFirstPolicyTextField), AssertionType.WARNING);
				}
				if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigExpiryDateoflastPolicy")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polGHT1PLRMemberEntity.getStringValueForField("ExpiryDateoflastPolicy")),
							fetchValueFromTextFields(expiryDateoflastPolicyTextField), AssertionType.WARNING);
				//	assertReference.assertEquals(polGHT1PLRMemberEntity.getStringValueForField("ExpiryDateoflastPolicy"), fetchValueFromTextFields(expiryDateoflastPolicyTextField), AssertionType.WARNING);
				}
				
			}
		}
	}

	public void navigateToPolicyTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPolicyButton")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAttributeButton")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMemberButton")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToCoverageTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigCoverageButton")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}

	public void navigateToClientDetailsTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigClientDetailsButton")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigRelationsButton")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigPaymentsButton")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigFollowupButton")){	
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDocumentButton")){	
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToMemberDetailTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(memberAttributesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToMemberAttachCoverageTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(memberAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToMemberRelationsTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMemberRelationsButton")){	
			click(memberRelationsTab);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToMemberPaymentsTab(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(memberPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonPolGHT1PLRMemberPage(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity){
		if (polGHT1PLRMemberEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polGHT1PLRMemberEntity.getStringValueForField("PolGHT1PLRMemberTitle")+"')]"), "GH T2-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
			/*if(polGHT1PLRMemberEntity.getStringValueForField("Product").equalsIgnoreCase("PH")) {
				click(saveButton);
			}
			*/
		}
	}


	public void fillandSubmitPolGHT1PLRMember(PolGHT1PLRMemberEntity polGHT1PLRMemberEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(polGHT1PLRMemberEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolGHT1PLRMember(polGHT1PLRMemberEntity, assertReference);
			nextButtonPolGHT1PLRMemberPage(polGHT1PLRMemberEntity);
			navigateToPolicyTab(polGHT1PLRMemberEntity);
			navigateToAttributeTab(polGHT1PLRMemberEntity);
			navigateToMemberTab(polGHT1PLRMemberEntity);
			navigateToCoverageTab(polGHT1PLRMemberEntity);
			navigateToClientDetailsTab(polGHT1PLRMemberEntity);
			navigateToRelationsTab(polGHT1PLRMemberEntity);
			navigateToPaymentsTab(polGHT1PLRMemberEntity);
			navigateToFollowupTab(polGHT1PLRMemberEntity);
			navigateToDocumentTab(polGHT1PLRMemberEntity);
			navigateToMemberDetailTab(polGHT1PLRMemberEntity);
			navigateToMemberAttributesTab(polGHT1PLRMemberEntity);
			navigateToMemberAttachCoverageTab(polGHT1PLRMemberEntity);
			navigateToMemberRelationsTab(polGHT1PLRMemberEntity);
			navigateToMemberPaymentsTab(polGHT1PLRMemberEntity);

		}
	}
}
