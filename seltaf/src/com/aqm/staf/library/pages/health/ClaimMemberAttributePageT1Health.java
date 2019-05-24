package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimMemberT1T2CLRAttEntity;



public class ClaimMemberAttributePageT1Health extends BasePage{

	private PageElement T1CLRForHealthTitle;
	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement memberDetailsTab;
	private PageElement memberAttributeTab;
	private PageElement claimTabTitle;
	private PageElement memberTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement memberDetailsTabTitle;
	private PageElement memberAttributeTabTitle;
	private PageElement  claimNumberLabel;
	private PageElement  policyNumberLabel;
	private PageElement  claimDateLabel;
	private PageElement  claimStatusLabel;
	private PageElement  productCodeLabel;
	private PageElement  causeOfLossLabel;
	private PageElement  memberSerialNoLabel;
	private PageElement  memberCodeLabel;
	private PageElement  applicableEventCodeLabel;

	private PageElement claimDropDown;

	private PageElement reasonForReopenDropDown;

	private PageElement tpaClaimNumberTextField;
	private PageElement tpaRemarksTextArea;

	private PageElement districtOrStateOrNationalDropDown;
	private PageElement districtCourtOrSupremeCourtHighCourtOrSLPDropDown;

	private PageElement previousPolicyNumberTextField;
	private PageElement fileNumberOrPatientNumberTextField;
	private PageElement dateOfSymptomsFirstAppearedTextField;
	private PageElement procedureCodesLevel1DropDown;
	private PageElement procedureCodesLevel2TextArea;
	private PageElement procedureCodesLevel3TextArea;
	private PageElement procedureDescriptionLevel1TextArea;
	private PageElement procedureDescriptionLevel2TextArea;
	private PageElement procedureDescriptionLevel3TextArea;
	private PageElement detailsOfPreExistingDiseaseDeclaredLevel1DropDown;
	private PageElement detailsOfPreExistingDiseaseDeclaredLevel2DropDown;
	private PageElement detailsOfPreExistingDiseaseDeclaredLevel3DropDown;
	private PageElement medicalHistoryLevel1TextArea;      
	private PageElement medicalHistoryLevel2TextArea;      
	private PageElement medicalHistoryLevel3TextArea; 
	private PageElement dateOfAdmissionTextField; 
	private PageElement dateOfDischargeTextField; 
	private PageElement diagnosisTextField;
	private PageElement diagnosisESTextField;

	private PageElement diagnosisCodeLevel2DropDown;
	private PageElement diagnosisCodeLevel3DropDown;
	private PageElement natureOfTreatmentForMediclaimDropDown;
	private PageElement amountClaimedTextField; 
	private PageElement whetherHospitalIsnetworkedDropDown;
	private PageElement whetherTheClaimFallsUnderTheExclusion4_1DropDown;
	private PageElement whetherTheClaimFallsUnderTheExclusion4_2DropDown;
	private PageElement whetherTheClaimFallsUnderTheExclusion4_3DropDown;
	private PageElement claimTypeForMediclaimDropDown;
	private PageElement sumInsuredTextField;
	private PageElement cumulativeBonusTextField;

	private PageElement previousClaimAmountTextField;
	private PageElement balanceSumInsuredTextField;

	private PageElement nameOfBodyPartsForProcedureCodesLevel1DropDown;
	private PageElement healthClaimZoneDropDown;
	private PageElement nextPageTitle;
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement dateOfSymptomsFirstAppearedFindButton;


	//ES
	private PageElement natureofTreatmentForESMediclaimTextArea;
	private PageElement claimCauseCodeforMediclaimTextField;
	private PageElement sumInsuredinUSDTextField;
	private PageElement originalSumInsuredforMedicalExpensesTextField;
	private PageElement previousMedicalExpensesChargesTextField;
	private PageElement balanceSumInsuredforMedicalExpensesTextField;
	private PageElement originalSumInsuredforRepatriationofRemainsTextField;
	private PageElement previousRepatriationofRemainsChargesTextField;
	private PageElement balanceSumInsuredforRepatriationofRemainsTextField;
	private PageElement originalSumInsuredforReunionExpenseschargesTextField;
	private PageElement previousReunionExpenseschargesTextField;
	private PageElement balanceSumInsuredforReunionExpenseschargesTextField;
	private PageElement estimatedExpensesforMedicalExpensesTextField;
	private PageElement estimatedExpensesforRepatriationofRemainsTextField;
	private PageElement estimatedExpensesforReunionExpenseschargesTextField;

	private PageElement dateOfDichargeFindButton;

	//BH
	private PageElement dateOfJourneyTextField;
	private PageElement totalPeriodOfTravelUnderThePolicyInDaysTextField;
	private PageElement additionalDeductibleTextField;
	private PageElement ageInYearTextField;
	private PageElement planTypeForBHTextField;
	private PageElement originalSumInsuredForPATextField;
	private PageElement previousPAChargesTextField;
	private PageElement balanceSumInsuredForPATextField;
	private PageElement estimatedExpensesForPATextField;
	private PageElement dateOfJourneyFindButton;

	//GH
	private PageElement certificateNoTextField;
	private PageElement claimPertainingToDropdown;
	private PageElement originalSumInsuredForHospitalCashTextField;
	private PageElement previousClaimforHospitalCashTextField;
	private PageElement balanceHospitalCashSumInsuredTextField;
	private PageElement estimatedExpensesTextField;
	private PageElement insuredSerialNoLabel ;
	private PageElement insuredItemCodeLabel ;
	//sc
	private PageElement zoneHealthTextField;
	//TF
	private PageElement AgeAsPerDischargeCardTextField;

	private PageElement otherDetailsIFAnyNatureOfLossTextArea;

	private PageElement dateOfAdmissionFindButton;

	//TU
	private PageElement nameoftheclaimant1TextField;
	private PageElement dateOfAdmission1FindButton;
	private PageElement dateOfDischarge1FindButton;
	private PageElement dateOfAdmission1TextField;
	private PageElement dateOfDischarge1TextField;
	
	private PageElement illness1TextField;
	private PageElement hospitalBillAmount1TextField;
	private PageElement totalprevioushospitalizationAmount1TextField;
	private PageElement natureOfTreatmentForTUDropDown;
	public ClaimMemberAttributePageT1Health(WebDriver driver, String pageName) {
		super(driver, pageName);

		T1CLRForHealthTitle = new PageElement(By.xpath("//div//b[contains(text(),'T1-CLR ')]"), " T1-CLR for Health MCFM Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'T2-CLR for Health Products')]"), " T2-CLR for Health Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberDetailsTab = new PageElement(By.xpath("//a//b[contains(text(),'Details')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Member Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "MemberDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonForReopenDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason for Reopen", "select")), "Reason for Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tpaClaimNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("TPA Claim Number", "input")), "TPA Claim Number TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tpaRemarksTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("TPA Remarks", "textarea")), "TPA Remarks TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Number", "input")), "Previous Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fileNumberOrPatientNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("File No/Patient No", "input")), "File No/Patient No  TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfSymptomsFirstAppearedTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Symptoms first appeared", "input")), "Date of Symptoms first appeared TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		procedureCodesLevel1DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Codes Level 1", "select")), "Procedure Codes Level 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//procedureCodesLevel2TextArea = new PageElement(By.name("propValues12"), "Procedure Codes Level 2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//procedureCodesLevel2TextArea = new PageElement(By.xpath(locatorforPanel("Procedure Codes Level 2", "textarea")), "Procedure Codes Level 2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureCodesLevel2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Codes Level 2", "textarea")), "Procedure Codes Level 2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureCodesLevel3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Codes Level 3", "textarea")), "Procedure Codes Level 3 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		procedureDescriptionLevel1TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Description Level 1", "textarea")), "Procedure Description Level 1 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		procedureDescriptionLevel2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Description Level 2", "textarea")), "Procedure Description Level 2 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		procedureDescriptionLevel3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Procedure Description Level 3", "textarea")), "Procedure Description Level 3 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPreExistingDiseaseDeclaredLevel1DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Pre Existing Disease Declared Level 1", "select")), "Details of Pre Existing Disease Declared Level 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPreExistingDiseaseDeclaredLevel2DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Pre Existing Disease Declared Level 2", "select")), "Details of Pre Existing Disease Declared Level 2 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPreExistingDiseaseDeclaredLevel3DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Pre Existing Disease Declared Level 3", "select")), "Details of Pre Existing Disease Declared Level 3 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		medicalHistoryLevel1TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical History Level 1", "textarea")), "Medical History Level 1 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		medicalHistoryLevel2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical History Level 2", "textarea")), "Medical History Level 2 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		medicalHistoryLevel3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical History Level 3", "textarea")), "Medical History Level 3 TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfAdmissionTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel(" Date of Admission", "input")), "Date of Admission TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfDischargeTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of discharge", "input")), "Date of discharge   TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		diagnosisTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diagnosis", "input")), "Diagnosis TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		diagnosisCodeLevel2DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diagnosis Code Level 2", "select")), "Diagnosis Code Level 2 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		diagnosisCodeLevel3DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diagnosis Code Level 3", "select")), "Diagnosis Code Level 3 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfTreatmentForMediclaimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of Treatment For Mediclaim", "select")), "Nature of Treatment For Mediclaim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		amountClaimedTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Amount Claimed", "input")), "Amount Claimed TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherHospitalIsnetworkedDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Hospital is networked", "select")), "Whether Hospital is networked DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheClaimFallsUnderTheExclusion4_1DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4_1", "select")), "Whether the claim falls under the exclusion 4_1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheClaimFallsUnderTheExclusion4_2DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4_2", "select")), "Whether the claim falls under the exclusion 4_2 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheClaimFallsUnderTheExclusion4_3DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4_3", "select")), "Whether the claim falls under the exclusion 4_3 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimTypeForMediclaimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Type for Mediclaim", "select")), "Claim Type for Mediclaim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cumulativeBonusTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus", "input")), "Cumulative Bonus TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		otherDetailsIFAnyNatureOfLossTextArea = new PageElement(By.xpath("//td//div[contains(text(),'Other Details')]/following::textarea"), " OtherDetails_IF_any_Nature Of Loss TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		previousClaimAmountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Claim Amount", "input")), "Previous Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		balanceSumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Sum Insured", "input")), "Balance Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfBodyPartsForProcedureCodesLevel1DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Body Parts for Procedure Codes Level 1", "select")), "Name of Body Parts for Procedure Codes Level 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		healthClaimZoneDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Health Claim Zone", "select")), "Health Claim Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		districtOrStateOrNationalDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National ", "select")), "District/State/National  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		/****************************** if we select Litigation as a reason to reopen ****************************************/
		districtCourtOrSupremeCourtHighCourtOrSLPDropDown =new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP ", "select")), "District Court/Supreme Court/High Court/SLP  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		dateOfSymptomsFirstAppearedFindButton=new PageElement(By.xpath("//div[contains(text(),'Date of Symptoms first appeared')]/following::input/following::a[@name='firstFocus']"), "DOB FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//ES

		natureofTreatmentForESMediclaimTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of Treatment For ES Mediclaim", "textarea")), "nature of Treatment For ES Mediclaim TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimCauseCodeforMediclaimTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Cause Code for Mediclaim", "input")), "Claim Cause Code for Mediclaim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredinUSDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD", "input")), "Sum Insured in USDTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originalSumInsuredforMedicalExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Original Sum Insured for Medical Expenses", "input")), " Original Sum Insured for Medical Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousMedicalExpensesChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Medical Expenses Charges", "input")), "Previous Medical Expenses Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredforMedicalExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Sum Insured for Medical Expenses", "input")), "Balance Sum Insured for Medical Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originalSumInsuredforRepatriationofRemainsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Original Sum Insured for Repatriation of Remains", "input")), "Original Sum Insured for Repatriation of Remains TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousRepatriationofRemainsChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Repatriation of Remains Charges", "input")), "Previous Repatriation of Remains Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredforRepatriationofRemainsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Sum Insured for Repatriation of Remains", "input")), "Balance Sum Insured for Repatriation of Remains TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originalSumInsuredforReunionExpenseschargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Original Sum Insured for Re union Expenses charges", "input")), "Original Sum Insured for Re union Expenses charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousReunionExpenseschargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Re union Expenses charges", "input")), "Previous Re union Expenses charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredforReunionExpenseschargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Sum Insured for Re union Expenses charges", "input")), "Balance Sum Insured for Re union Expenses charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedExpensesforMedicalExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Expenses for Medical Expenses", "input")), "Estimated Expenses for Medical Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedExpensesforRepatriationofRemainsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Expenses for Repatriation of Remains", "input")), "Estimated Expenses for Repatriation of Remains TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedExpensesforReunionExpenseschargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Expenses for Re union Expenses charges", "input")), "Estimated Expenses for Re union Expenses charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDichargeFindButton=new PageElement(By.xpath("//div[contains(text(),'Date of discharge')]/following::input/following::a[@name='firstFocus']"), "Date Of Dicharge Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//BH
		dateOfJourneyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Journey", "input")), "Date of Journey TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPeriodOfTravelUnderThePolicyInDaysTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total period of travel under the policy(in days)", "input")), "Total period of travel under the policy(in days) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDeductibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Deductible", "input")), "Additional Deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageInYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year)", "input")), "Age (Year) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		planTypeForBHTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Plan Type (BH)", "input")), "Plan Type (BH) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originalSumInsuredForPATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Original Sum Insured for PA", "input")), "Original Sum Insured for PA TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPAChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous PA Charges", "input")), "Previous PA Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredForPATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Sum Insured for PA", "input")), "Balance Sum Insured for PA TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedExpensesForPATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Expenses for PA", "input")), "Estimated Expenses for PA TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfJourneyFindButton=new PageElement(By.xpath("//div[contains(text(),'Date of Journey')]/following::input/following::a[@name='firstFocus']"), "Date Of Journey Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//GH
		certificateNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate No", "input")), "Certificate No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPertainingToDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("The Claim pertaining to", "select")), "The Claim pertaining to Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originalSumInsuredForHospitalCashTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Original Sum Insured for Hospital Cash", "input")), "Original Sum Insured for Hospital Cash TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousClaimforHospitalCashTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Claim for Hospital Cash", "input")), "Previous Claim for Hospital Cash TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceHospitalCashSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Hospital Cash Sum Insured", "input")), "Balance Hospital Cash Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Expenses", "input")), "Estimated Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")),"Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")),"Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
		dateOfAdmissionFindButton=new PageElement(By.xpath("//div[contains(text(),'Date of Admission')]/following::input/following::a[@name='firstFocus']"), "Date Of Dicharge Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		zoneHealthTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone Health", "input")), "Zone Health TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//TF
		AgeAsPerDischargeCardTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age as per Discharge card", "input")), "Age as per Discharge card TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		diagnosisESTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diagnosis", "textarea")), "Diagnosis TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//TU
		nameoftheclaimant1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the claimant 1", "input")), "Name of the claimant 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAdmission1FindButton= new PageElement(By.xpath("//div[contains(text(),'Date Of Admission 1')]/following::input/following::a[@name='firstFocus']"), "Date Of Admission 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDischarge1FindButton= new PageElement(By.xpath("//div[contains(text(),'Date Of Discharge 1')]/following::input/following::a[@name='firstFocus']"), "Date Of Discharge 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		illness1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Illness 1", "input")), "Illness 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hospitalBillAmount1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hospital Bill Amount 1", "input")), "Hospital Bill Amount 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalprevioushospitalizationAmount1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total previous hospitalization amount", "input")), "Total previous hospitalization amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAdmission1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date Of Admission 1", "input")), "Date Of Admission 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDischarge1TextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date Of Discharge 1", "input")), "Date Of Discharge 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentForTUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of Treatment for TU", "select")), "Nature of Treatment for TU DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
	}

	public void fillClaimMemberT1CLRDetails(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("add") || claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("edit")){

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaim")) {
				selectValueFromList(claimDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("Claim"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigReasonForReopen")) {
				selectValueFromList(reasonForReopenDropDown,claimMemberT1CLREnityHealthEntity.getStringValueForField("ReasonForReopen"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTPAClaimNumber")) {
				clearAndSendKeys(tpaClaimNumberTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("TPAClaimNumber"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTPARemarks")) {
				clearAndSendKeys(tpaRemarksTextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("TPARemarks"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigFileNoPatientNo")) {
				clearAndSendKeys(fileNumberOrPatientNumberTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("FileNoPatientNo"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
				selectValueFromList(districtOrStateOrNationalDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DistrictStateNational"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfSymptomsFirstAppeared")) {
				selectDateFromCalender(dateOfSymptomsFirstAppearedFindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfSymptomsFirstAppeared"));
				switchToFrame("display");
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel1")) {
				selectValueFromList(procedureCodesLevel1DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel2")) {
				clearAndSendKeys(procedureCodesLevel2TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel2"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel3")) {
				clearAndSendKeys(procedureCodesLevel3TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel3"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel1")) {
				clearAndSendKeys(procedureDescriptionLevel1TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel2")) {
				clearAndSendKeys(procedureDescriptionLevel2TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel2"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel3")) {
				clearAndSendKeys(procedureDescriptionLevel3TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel3"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel1")) {
				selectValueFromList(detailsOfPreExistingDiseaseDeclaredLevel1DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel2")) {
				selectValueFromList(detailsOfPreExistingDiseaseDeclaredLevel2DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel2"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel3")) {
				selectValueFromList(detailsOfPreExistingDiseaseDeclaredLevel3DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel3"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel1")) {
				clearAndSendKeys(medicalHistoryLevel1TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel2")) {
				clearAndSendKeys(medicalHistoryLevel2TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel2"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel3")) {
				clearAndSendKeys(medicalHistoryLevel3TextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel3"));
			}
			/*if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
				String admissionDate=RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission"));
				clearAndEnterDate(dateOfAdmissionTextField, admissionDate);
			}*/
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
				selectDateFromCalender(dateOfAdmissionFindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission"));
				switchToFrame("display");

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfDischarge")) {
				selectDateFromCalender(dateOfDichargeFindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge"));
				switchToFrame("display");
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosisCodeLevel2")) {
				clearAndSendKeys(diagnosisTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("DiagnosisCodeLevel2"));
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosis")) {

				if (claimMemberT1CLREnityHealthEntity.getStringValueForField("Product").equalsIgnoreCase("ES")) {
					clearAndSendKeys(diagnosisESTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("Diagnosis"));
				}

				else
					{clearAndSendKeys(diagnosisTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("Diagnosis"));

			}}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosisCodeLevel2")) {
				selectValueFromList(diagnosisCodeLevel2DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DiagnosisCodeLevel2"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosisCodeLevel3")) {
				selectValueFromList(diagnosisCodeLevel3DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("DiagnosisCodeLevel3"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNatureOfTreatmentForMediclaim")) {
				selectValueFromList(natureOfTreatmentForMediclaimDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("NatureOfTreatmentForMediclaim"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				clearAndSendKeys(amountClaimedTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("AmountClaimed"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherHospitalIsNetworked")) {
				selectValueFromList(whetherHospitalIsnetworkedDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherHospitalIsNetworked"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("SumInsured"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				clearAndSendKeys(cumulativeBonusTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("CumulativeBonus"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousClaimAmount")) {
				clearAndSendKeys(previousClaimAmountTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousClaimAmount"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsured")) {
				clearAndSendKeys(balanceSumInsuredTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsured"));
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNameOfBodyPartsForProcedureCodesLevel1")) {
				selectValueFromList(nameOfBodyPartsForProcedureCodesLevel1DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("NameOfBodyPartsForProcedureCodesLevel1"));
			}
			//ES
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNatureofTreatmentForESMediclaim")) {
				clearAndSendKeys(natureofTreatmentForESMediclaimTextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("NatureofTreatmentForESMediclaim"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimTypeforMediclaim")) {
				selectValueFromList(claimTypeForMediclaimDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimTypeforMediclaim"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimCauseCodeforMediclaim")) {
				clearAndSendKeys(claimCauseCodeforMediclaimTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimCauseCodeforMediclaim"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigSumInsuredinUSD")) {
				clearAndSendKeys(sumInsuredinUSDTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("SumInsuredinUSD"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforMedicalExpenses")) {
				clearAndSendKeys(originalSumInsuredforMedicalExpensesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforMedicalExpenses"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousMedicalExpensesCharges")) {
				clearAndSendKeys(previousMedicalExpensesChargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousMedicalExpensesCharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforMedicalExpenses")) {
				clearAndSendKeys(balanceSumInsuredforMedicalExpensesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforMedicalExpenses"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforRepatriationofRemains")) {
				clearAndSendKeys(originalSumInsuredforRepatriationofRemainsTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforRepatriationofRemains"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousRepatriationofRemainsCharges")) {
				clearAndSendKeys(previousRepatriationofRemainsChargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousRepatriationofRemainsCharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforRepatriationofRemains")) {
				clearAndSendKeys(balanceSumInsuredforRepatriationofRemainsTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforRepatriationofRemains"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforReunionExpensescharges")) {
				clearAndSendKeys(originalSumInsuredforReunionExpenseschargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforReunionExpensescharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousReunionExpensescharges")) {
				clearAndSendKeys(previousReunionExpenseschargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousReunionExpensescharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforReunionExpensescharges")) {
				clearAndSendKeys(balanceSumInsuredforReunionExpenseschargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforReunionExpensescharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforMedicalExpenses")) {
				clearAndSendKeys(estimatedExpensesforMedicalExpensesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforMedicalExpenses"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforRepatriationofRemains")) {
				clearAndSendKeys(estimatedExpensesforRepatriationofRemainsTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforRepatriationofRemains"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforReunionExpensescharges")) {
				clearAndSendKeys(estimatedExpensesforReunionExpenseschargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforReunionExpensescharges"));
			}
			//GJ
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOtherDetailsIfAny")) {
				clearAndSendKeys(otherDetailsIFAnyNatureOfLossTextArea, claimMemberT1CLREnityHealthEntity.getStringValueForField("OtherDetailsIfAny"));
			}

			//CG
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion41")) {
				selectValueFromList(whetherTheClaimFallsUnderTheExclusion4_1DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion41"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion42")) {
				selectValueFromList(whetherTheClaimFallsUnderTheExclusion4_2DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion42"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion43")) {
				selectValueFromList(whetherTheClaimFallsUnderTheExclusion4_3DropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion43"));
			}

			//BH

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfJourney")) {
				selectDateFromCalender(dateOfJourneyFindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfJourney"));
				switchToFrame("display");
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTotalPeriodOfTravelUnderThePolicyInDays")) {
				clearAndSendKeys(totalPeriodOfTravelUnderThePolicyInDaysTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("TotalPeriodOfTravelUnderThePolicyInDays"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAdditionalDeductible")) {
				clearAndSendKeys(additionalDeductibleTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("AdditionalDeductible"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAgeInYear")) {
				clearAndSendKeys(ageInYearTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("AgeInYear"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPlanTypeBH")) {
				clearAndSendKeys(planTypeForBHTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PlanTypeBH"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredForPA")) {
				clearAndSendKeys(originalSumInsuredForPATextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredForPA"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousPACharges")) {
				clearAndSendKeys(previousPAChargesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousPACharges"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredForPA")) {
				clearAndSendKeys(balanceSumInsuredForPATextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredForPA"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesForPA")) {
				clearAndSendKeys(estimatedExpensesForPATextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesForPA"));
			}
			//sc
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigZoneHealth")) {
				clearAndSendKeys(zoneHealthTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("ZoneHealth"));
			}

			//GH

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigCertificateNumber")) {
				clearAndSendKeys(certificateNoTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("CertificateNumber"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimPertainingTo")) {
				selectValueFromList(claimPertainingToDropdown, claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimPertainingTo"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredForHospitalCash")) {
				clearAndSendKeys(originalSumInsuredForHospitalCashTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredForHospitalCash"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousClaimforHospitalCash")) {
				clearAndSendKeys(previousClaimforHospitalCashTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousClaimforHospitalCash"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceHospitalCashSumInsured")) {
				clearAndSendKeys(balanceHospitalCashSumInsuredTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceHospitalCashSumInsured"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpenses")) {
				clearAndSendKeys(estimatedExpensesTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpenses"));
			}
			//TF 
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAgeAsPerDischargeCard")) {
				clearAndSendKeys(AgeAsPerDischargeCardTextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("AgeAsPerDischargeCard"));
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigHealthClaimZone")) {
				selectValueFromList(healthClaimZoneDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("HealthClaimZone"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNatureOfTreatmentForMediclaimTU")) {
				selectValueFromList(natureOfTreatmentForTUDropDown, claimMemberT1CLREnityHealthEntity.getStringValueForField("NatureOfTreatmentForMediclaimTU"));
			}
		}
		else if(claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("verify")){

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("MemberSerialNo"),fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("MemberCode"),fetchValueFromFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaim")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigReasonForReopen")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ReasonForReopen"),fetchValueFromTextFields(reasonForReopenDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTPAClaimNumber")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("TPAClaimNumber"),fetchValueFromTextFields(tpaClaimNumberTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTPARemarks")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("TPARemarks"), fetchValueFromTextFields(tpaRemarksTextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigFileNoPatientNo")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("FileNoPatientNo"),fetchValueFromTextFields(fileNumberOrPatientNumberTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DistrictStateNational"),fetchValueFromTextFields(districtOrStateOrNationalDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfSymptomsFirstAppeared")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfSymptomsFirstAppeared")),fetchValueFromTextFields(dateOfSymptomsFirstAppearedTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel1"),fetchValueFromList(procedureCodesLevel1DropDown), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel2")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel2"),fetchValueFromTextFields(procedureCodesLevel2TextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureCodesLevel3")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureCodesLevel3"), fetchValueFromTextFields(procedureCodesLevel3TextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel1"),fetchValueFromTextFields(procedureDescriptionLevel1TextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel2")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel2"), fetchValueFromTextFields(procedureDescriptionLevel2TextArea), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProcedureDescriptionLevel3")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ProcedureDescriptionLevel3"),fetchValueFromTextFields(procedureDescriptionLevel3TextArea), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel1"),fetchValueFromList(detailsOfPreExistingDiseaseDeclaredLevel1DropDown), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel2")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel2"), fetchValueFromList(detailsOfPreExistingDiseaseDeclaredLevel2DropDown), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel3")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel3"),fetchValueFromList(detailsOfPreExistingDiseaseDeclaredLevel3DropDown), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel1"), fetchValueFromTextFields(medicalHistoryLevel1TextArea), AssertionType.WARNING);
			}


			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel2")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel2"),fetchValueFromTextFields(medicalHistoryLevel2TextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMedicalHistoryLevel3")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("MedicalHistoryLevel3"),fetchValueFromTextFields(medicalHistoryLevel3TextArea), AssertionType.WARNING);
			}

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission")),fetchValueFromTextFields(dateOfAdmissionTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfDischarge")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge")),fetchValueFromTextFields(dateOfDischargeTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosis")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("Diagnosis"),fetchValueFromTextFields(diagnosisTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosisCodeLevel2")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DiagnosisCodeLevel2"), fetchValueFromTextFields(diagnosisCodeLevel2DropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDiagnosisCodeLevel3")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DiagnosisCodeLevel3"), fetchValueFromTextFields(diagnosisCodeLevel3DropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNatureOfTreatmentForMediclaim")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("NatureOfTreatmentForMediclaim"),fetchValueFromTextFields(natureOfTreatmentForMediclaimDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("AmountClaimed"),fetchValueFromTextFields(amountClaimedTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherHospitalIsNetworked")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherHospitalIsNetworked"),fetchValueFromList(whetherHospitalIsnetworkedDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("CumulativeBonus"),fetchValueFromTextFields(cumulativeBonusTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousClaimAmount")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousClaimAmount"),fetchValueFromTextFields(previousClaimAmountTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsured")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsured"), fetchValueFromTextFields(balanceSumInsuredTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNameOfBodyPartsForProcedureCodesLevel1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("NameOfBodyPartsForProcedureCodesLevel1"), fetchValueFromTextFields(nameOfBodyPartsForProcedureCodesLevel1DropDown), AssertionType.WARNING);
			}
			//ES
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNatureofTreatmentForESMediclaim")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("NatureofTreatmentForESMediclaim"), fetchValueFromTextFields(natureofTreatmentForESMediclaimTextArea), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimTypeforMediclaim")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimTypeforMediclaim"),fetchValueFromList(claimTypeForMediclaimDropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimCauseCodeforMediclaim")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimCauseCodeforMediclaim"), fetchValueFromTextFields(claimCauseCodeforMediclaimTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigSumInsuredinUSD")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("SumInsuredinUSD"), fetchValueFromTextFields(sumInsuredinUSDTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforMedicalExpenses")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforMedicalExpenses"), fetchValueFromTextFields(originalSumInsuredforMedicalExpensesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousMedicalExpensesCharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousMedicalExpensesCharges"), fetchValueFromTextFields(previousMedicalExpensesChargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforMedicalExpenses")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforMedicalExpenses"), fetchValueFromTextFields(balanceSumInsuredforMedicalExpensesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforRepatriationofRemains")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforRepatriationofRemains"), fetchValueFromTextFields(originalSumInsuredforRepatriationofRemainsTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousRepatriationofRemainsCharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousRepatriationofRemainsCharges"), fetchValueFromTextFields(previousRepatriationofRemainsChargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforRepatriationofRemains")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforRepatriationofRemains"), fetchValueFromTextFields(balanceSumInsuredforRepatriationofRemainsTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredforReunionExpensescharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredforReunionExpensescharges"), fetchValueFromTextFields(originalSumInsuredforReunionExpenseschargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousReunionExpensescharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousReunionExpensescharges"), fetchValueFromTextFields(previousReunionExpenseschargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredforReunionExpensescharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredforReunionExpensescharges"), fetchValueFromTextFields(balanceSumInsuredforReunionExpenseschargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforMedicalExpenses")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforMedicalExpenses"), fetchValueFromTextFields(estimatedExpensesforMedicalExpensesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforRepatriationofRemains")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforRepatriationofRemains"), fetchValueFromTextFields(estimatedExpensesforRepatriationofRemainsTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesforReunionExpensescharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesforReunionExpensescharges"), fetchValueFromTextFields(estimatedExpensesforReunionExpenseschargesTextField), AssertionType.WARNING);
			}

			//CG
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion41")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion41"), fetchValueFromList(whetherTheClaimFallsUnderTheExclusion4_1DropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion42")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion42"), fetchValueFromList(whetherTheClaimFallsUnderTheExclusion4_2DropDown), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigWhetherTheClaimFallsUnderTheExclusion43")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("WhetherTheClaimFallsUnderTheExclusion43"), fetchValueFromList(whetherTheClaimFallsUnderTheExclusion4_3DropDown), AssertionType.WARNING);
			}
			//GJ
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOtherDetailsIfAny")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OtherDetailsIfAny"), fetchValueFromTextFields(otherDetailsIFAnyNatureOfLossTextArea), AssertionType.WARNING);
			}

			//BH

			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfJourney")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfJourney")),fetchValueFromTextFields(dateOfJourneyTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTotalPeriodOfTravelUnderThePolicyInDays")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("TotalPeriodOfTravelUnderThePolicyInDays"), fetchValueFromTextFields(totalPeriodOfTravelUnderThePolicyInDaysTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAdditionalDeductible")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("AdditionalDeductible"), fetchValueFromTextFields(additionalDeductibleTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAgeInYear")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("AgeInYear"), fetchValueFromTextFields(ageInYearTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPlanTypeBH")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PlanTypeBH"), fetchValueFromTextFields(planTypeForBHTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredForPA")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredForPA"), fetchValueFromTextFields(originalSumInsuredForPATextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousPACharges")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousPACharges"), fetchValueFromTextFields(previousPAChargesTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceSumInsuredForPA")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceSumInsuredForPA"), fetchValueFromTextFields(balanceSumInsuredForPATextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpensesForPA")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpensesForPA"), fetchValueFromTextFields(estimatedExpensesForPATextField), AssertionType.WARNING);
			}

			//GH
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigCertificateNumber")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("CertificateNumber"), fetchValueFromTextFields(certificateNoTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimPertainingTo")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimPertainingTo"), fetchValueFromList(claimPertainingToDropdown), AssertionType.WARNING);

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigOriginalSumInsuredForHospitalCash")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("OriginalSumInsuredForHospitalCash"), fetchValueFromTextFields(originalSumInsuredForHospitalCashTextField), AssertionType.WARNING);

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPreviousClaimforHospitalCash")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("PreviousClaimforHospitalCash"), fetchValueFromTextFields(previousClaimforHospitalCashTextField), AssertionType.WARNING);

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBalanceHospitalCashSumInsured")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("BalanceHospitalCashSumInsured"), fetchValueFromTextFields(balanceHospitalCashSumInsuredTextField), AssertionType.WARNING);

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigEstimatedExpenses")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("EstimatedExpenses"), fetchValueFromTextFields(estimatedExpensesTextField), AssertionType.WARNING);

			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAgeAsPerDischargeCard")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("AgeAsPerDischargeCard"),fetchValueFromTextFields(AgeAsPerDischargeCardTextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigHealthClaimZone")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("HealthClaimZone"), fetchValueFromList(healthClaimZoneDropDown), AssertionType.WARNING);
			}
		}
	}


	public void proceedToT2CLRForHealthProducts(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberT1CLREnityHealthEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			try {
			isElementDisplayed(nextPageTitle);
			}
			catch(Exception e) {}
			}
		
	}	
	public void navigateToMainAttributePage(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToDocument(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToMemberDetails(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMemberDetailsTab")){		
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailsTabTitle);
		}
	}
	public void navigateToMemberAttribute(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigMemberAttributeTab")){		
			click(memberAttributeTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributeTabTitle);
		}
	}
	public void fillClaimMemberT1PageDetails(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("add") || claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("edit")){
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNameoftheclaimant1")) {
				clearAndSendKeys(nameoftheclaimant1TextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("Nameoftheclaimant1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfAdmission1")) {
				/*String dateOfApplication = RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission1"));
				clearAndEnterDate(dateOfAdmission1TextField, dateOfApplication);*/
				//clearAndSendKeys(dateOfAdmission1TextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission1"));
				selectDateFromCalender(dateOfAdmission1FindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission1"));
				switchToFrame("display");
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfDischarge1")) {
				/*String dateOfApplication = RandomCodeGenerator.dateGenerator(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge1"));
				clearAndEnterDate(dateOfDischarge1TextField, dateOfApplication);*/
				//clearAndSendKeys(dateOfDischarge1TextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge1"));
				selectDateFromCalender(dateOfDischarge1FindButton, claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge1"));
				switchToFrame("display");
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigIllness1")) {
				clearAndSendKeys(illness1TextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("Illness1"));
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigHospitalBillAmount1")) {
				clearAndSendKeys(hospitalBillAmount1TextField, claimMemberT1CLREnityHealthEntity.getStringValueForField("HospitalBillAmount1"));
			}
		}
		else if(claimMemberT1CLREnityHealthEntity.getAction().equalsIgnoreCase("verify")){
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNameoftheclaimant1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("Nameoftheclaimant1"), fetchValueFromFields(nameoftheclaimant1TextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfAdmission1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfAdmission1"), fetchValueFromFields(dateOfAdmission1TextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigDateOfDischarge1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("DateOfDischarge1"), fetchValueFromFields(dateOfDischarge1TextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigIllness1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("Illness1"), fetchValueFromFields(illness1TextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigHospitalBillAmount1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("HospitalBillAmount1"), fetchValueFromFields(hospitalBillAmount1TextField), AssertionType.WARNING);
			}
			if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigTotalprevioushospitalizationAmount1")) {
				assertReference.assertEquals(claimMemberT1CLREnityHealthEntity.getStringValueForField("TotalprevioushospitalizationAmount1"), fetchValueFromFields(totalprevioushospitalizationAmount1TextField), AssertionType.WARNING);
			}
		}
	}
	
	public void nextToClaimMemberT1PageDetails(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity){
		if (claimMemberT1CLREnityHealthEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextArrowButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitClaimMemberT1CLRAttibutesHealth(ClaimMemberT1T2CLRAttEntity claimMemberT1CLREnityHealthEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimMemberT1CLREnityHealthEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimMemberT1PageDetails(claimMemberT1CLREnityHealthEntity, assertReference);
			nextToClaimMemberT1PageDetails(claimMemberT1CLREnityHealthEntity);
			fillClaimMemberT1CLRDetails(claimMemberT1CLREnityHealthEntity, assertReference);
			proceedToT2CLRForHealthProducts(claimMemberT1CLREnityHealthEntity);
			navigateToMainAttributePage(claimMemberT1CLREnityHealthEntity);
			navigateToclaimHomePage(claimMemberT1CLREnityHealthEntity);
			navigateToMember(claimMemberT1CLREnityHealthEntity);
			navigateToDocument(claimMemberT1CLREnityHealthEntity);
			navigateToParties(claimMemberT1CLREnityHealthEntity);
			navigateToReserve(claimMemberT1CLREnityHealthEntity);
			navigateToPayment(claimMemberT1CLREnityHealthEntity);
			navigateToAttribute(claimMemberT1CLREnityHealthEntity);
			navigateToMemberDetails(claimMemberT1CLREnityHealthEntity);
			navigateToMemberAttribute(claimMemberT1CLREnityHealthEntity);
		}
	}
}