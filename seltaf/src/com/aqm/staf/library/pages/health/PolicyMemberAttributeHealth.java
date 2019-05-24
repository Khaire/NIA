package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;

public class PolicyMemberAttributeHealth extends BasePage {
	private PageElement nextGroupdetailsTitle;  
	private PageElement groupNumberTitle;

	private PageElement policyMemberAttributeHealthDetailsTitle;
	//	private PageElement policycoPaymentCumulativeBonusTitle;

	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	//Label
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	//Feilds
	private PageElement nameOfMemberTextFeild;
	private PageElement sexOfMemberTextFeild;
	private PageElement realtionForMediclaimMemberDropDownList;
	private PageElement ageTextFeild;
	private PageElement dOBOfMemberTextFeild;
	private PageElement occupationForMediclaimMemberDropDownList;
	private PageElement detailsforOtherOccupationTextFeild;
	private PageElement loyaltyDiscountDropDownList;
	private PageElement hypertensionDropDownList;
	private PageElement diabetesDropDownList;
	private PageElement preExistingDiseaseForMediclaimMemberDropDownList;
	private PageElement natureOfDiseaseDropDownList;
	private PageElement nameAndAddressOfMedicalAttendantSurgeonTextFeild;
	private PageElement dateFirstTreatedCompletedDropDownList;
	private PageElement firstTreatmentCompletedDropDownList;
	private PageElement whetherFullyCuredDropDownList;
	private PageElement heightOfMemberTextFeild;
	private PageElement weightOfMemberTextFeild;
	private PageElement waistLineTextFeild;
	private PageElement doYouSmokeCigarettesCigarOrpipeDropDownList;
	private PageElement doYouChewTobaccoDropDownList;
	private PageElement doYouDrinkAlcoholDropDownList;
	private PageElement healthClubMembershipDropDownList;
	private PageElement sumInsuredForJMDropDownList;
	private PageElement isFamilyDiscountApplicableDropDownList;
	private PageElement claimRatioTextFeild;
	private PageElement nextButton;
	private PageElement backButton;
	private PageElement saveButton;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;

	//***************************************** CX ************************************************************
	private PageElement assigneeNameTextFeild;
	private PageElement physicianNameTextFeild;
	private PageElement cumulativeBonusTextFeild;
	private PageElement realtionForMediclaimMemberCXDropDownList;
	private PageElement occupationForMediclaimMemberCXDropDownList;
	private PageElement doYouSmokeCXDropDownList; 
	private PageElement doYouConsumeTobaccoCXDropDownList;
	private PageElement doYouDrinkAlcoholCXDropDownList;
	private PageElement	sumInsuredForCXDropDownList;

	//JA
	private PageElement relationForJAMemberDropDown;
	private PageElement occupationForJABimaMemberDropDown;
	private PageElement sumInsuredRsDropDown;


	//****************************************** SC******************************************************//
	private PageElement zoneForMemberTextField;
	private PageElement nameOfMemberTextField;
	private PageElement openButton;
	private PageElement memberDetailsSCT1PLRTitle;
	private PageElement medicalCheckUpDetailTitle;
	private PageElement	relationforSeniorCitizenMemberDropDownList;
	private PageElement	umInsuredforSeniorCitizenMemberDropDownList;


	//CG-@Rasika
	private PageElement policyMemberAttributeHealthCGDetailsTitle;
	private PageElement familyNoTextField;
	private PageElement serialNoTextField;
	private PageElement cadreTextArea;
	private PageElement membershipNo;
	private PageElement membershipDateTextFeild;
	private PageElement categoryTypeDropDown;

	//BH-@Rasika
	private PageElement memberDetailsBHT1PLRTitlePage;
	private PageElement passportNumberTextField;
	private PageElement dateOfIssueTextField;
	private PageElement expiryDateOfPassportTextField;
	private PageElement nationalityForBHDropDown;
	private PageElement visaIncomeTaxReturnWorkPermitTextArea;
	private PageElement proposedDateOfDeparture;
	private PageElement occupationForMediclaimMemberDropDown;
	private PageElement otherOccupationDetailTextfield;
	private PageElement noOfDaysStayOutsideIndiaTextField;
	private PageElement physicianAddressTextArea;
	private PageElement nameOfAssigneeTextArea;
	private PageElement relationOfAssigneeTextField;
	private PageElement medicalHistoryReportAttachedDropDown;
	private PageElement medicalReportDateTextField;

	private PageElement heightOfMemberTextField;
	private PageElement weightOfMemberTextfield;
	private PageElement waistLineInInchesTextField;
	private PageElement doYouChewTobaccoDropDown;
	private PageElement doYouDrinkAlcoholDropDown;
	private PageElement doYouSmokeCigarettesCigarOrPipeDropDown;
	private PageElement preExistingDiseaseForMediclaimMemberDropDown;
	private PageElement detailsOfPreExistingDiseasesButton;
	private PageElement goodHealthDeclarationDropDown;
	private PageElement listOfDiseasesDropDown;
	private PageElement detailsOfOtherDiseasesTextArea;
	private PageElement passportDeatilsVerifiedDropDown;
	private PageElement insuredMemberDetailBHTitlePage;

	private PageElement medicalReportBHTextArea;

	private PageElement expiryDateFindButton;
	private PageElement proposedDateFindButton;

	private PageElement forwordWindowButton;
	private PageElement saveButtonWindow;
	private PageElement openWindowButton;

	//Window Fields
	private PageElement serialNo;
	private PageElement diseaseSufferedOrSufferingTextArea;
	private PageElement medicalReportWindowTextArea;
	private PageElement deleteWindowButton;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;

	//GT-@Rasika
	private PageElement memberDetailsGTT1PLRTitlePage;
	private PageElement relationForSGMCMemberDropDown;
	private PageElement occupationForSGMCMemberDropDown;
	private PageElement sumInsuredTertiaryDropDown;

	//PZ
	private PageElement memberDetailsPZT1PLRTitlePage;
	private PageElement designationOfPZMembersTextField;
	private PageElement	employeeIdTextField;
	private PageElement	relationshipWithTheAssigneeDropDown;
	private PageElement	preExistingDiseaseDropDown;
	private PageElement	planTypeForPZDropDown;
	private PageElement	doYouHaveMediclaim2007PolicyWithNewIndiaDropDown;
	private PageElement	policyNumberTextField;
	private PageElement	policPeriodTextField;
	private PageElement nameTextField;
	//FM Abhijit

	private PageElement previousPolicyDetailsOpenButton;
	private PageElement serialNoParameterTextField;
	private PageElement previousPolicyNoWithNIATextField; 
	private PageElement sumInsuredPreviousPolicyTextField;
	private PageElement fromDateTextField;
	private PageElement ToDateTextField;
	private PageElement preexistingDiseasesInPreviousPolicyTextField ;
	private PageElement addButton;
	private PageElement closeButton;
	private PageElement deleteButton;
	private PageElement relationforFMMemberDropDown;
	// sp @akshata
	private PageElement nextGroupDropsown;
	private PageElement groupNumberTextField;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement relationSwasthyaBimaDropDown;
	private PageElement	sumInsuredForMemberDropDown;
	//private PageElement	detailsOfPreExistingDiseasesButton;
	private PageElement claimReceivedAndReportedAmountTextField;

	//ES Abhijit
	private PageElement dateOfIssueFindButton;
	private PageElement visaTypeTextField;
	private PageElement correspondingAddressIndiaTextArea;
	private PageElement nameofNextKinTextArea;
	private PageElement relationshipofNextKinTextField;
	private PageElement addressofNextKinTextArea;
	private PageElement telephoneNoofNextKinTextField;
	private PageElement nameofSponsorTextArea;
	private PageElement relationshipofSponsorTextField;
	private PageElement addressofSponsorTextArea;
	private PageElement telephoneNoofSponsorTextField;
	private PageElement countryofVisitTextArea;
	private PageElement addressInCountryOfVisitTextArea;
	private PageElement nameofSchoolWorkplaceTextArea;
	private PageElement addressofSchoolWorkplaceTextArea;
	private PageElement telephoneNoOfSchoolWorkplaceTextField;
	private PageElement detailsofNatureOfStudyTextArea;
	private PageElement areYouFreeFromPhysicalDefectDropdown;
	private PageElement physicianRegistrationNoTextField;
	private PageElement physicianTelephoneNoTextField;
	private PageElement otherInformationTextArea;
	private PageElement medicalReportAttachedDropdown;
	private PageElement sumInsuredInUSDTextField;
	private PageElement assigneeAddressTextArea;
	private PageElement assigneeContactNumberTextField;
	private PageElement addressOfCountryInVisitTextArea;
	//sc @ akshata
	private PageElement relationForSeniorCitizenMemberDropdownList;
	private PageElement sumInsuredForSeniorCitizenMemberDropdownList;
	//UH
	private PageElement relationForUniversalHealthMemberDropDownList;
	private PageElement areYouEarningHeadOfTheFamilyDropDownList;
	private PageElement sumInsuredforUniversalHealthTextField;

	//MC Priyanka
	private PageElement WhetherInsuredIsAdmittedForThePreExistingDiseaseDropDown;

	private PageElement sumInsuredForFamilyFloaterDropdown;
	private PageElement medicalReportTextArea;

	private PageElement insuredInterestTab;
	private PageElement insuredInterestTitle;
	private PageElement policyInsuredInterestTitlePage;

	//PZ-Priyanka
	private PageElement iMJourneyDetailsPZTitlePage;

	private PageElement placeOfVisitDropDown;
	private PageElement dateOfCommencementOfJourneyTextfield;
	private PageElement expectedDateOfReturnTextField;
	private PageElement actualDateOfReturnTextField;
	private PageElement sumInsuredInUSDPZTextField;
	private PageElement certificateNoTextField;
	private PageElement documentNumberTextField;
	private PageElement declarationNumberTextField;

	//TG Sachin
	private PageElement nameTextArea;
	private PageElement sexDropdown;
	private PageElement employeeNumberTextField;
	private PageElement relationforTailorMadeGroupMediclaimDropdown;
	private PageElement ambulanceChargeperFamilyTextField;
	private PageElement sumInsuredforTailorMadePoliciesTextField;
	private PageElement topUpSumInsuredTextField;
	private PageElement serialNumberTextField;
	private PageElement groupNoTextField;
	private PageElement hOApprovalNoTextBox;
	private PageElement closeWinodwButton;
	//RS-Amit
	private PageElement uploadIDTextField;
	private PageElement rSBYURNTextField;
	private PageElement rSBYChipNoTextField;
	private PageElement enrollmentFeesTextField;
	private PageElement rSBYIssueDateFindButton;
	private PageElement familyNoForRSTextField;
	private PageElement sumInsuredforRSBYTextField;
	private PageElement rSBYIssueDateTextField;
	private PageElement blockTextFeild;
	private PageElement pinCodeTextFeild;
	private PageElement BirthDateFindButton;
	private PageElement sNoTextField;
	private PageElement genderDropDownList;
	private PageElement nameMember;
	private PageElement serialUHTextField;
	private PageElement familyUHTextField;

	private PageElement sexForSUDropDown;
	private PageElement relationOfParivarSurakshaForSUDropDown;
	private PageElement occupationForMediclaimMemberForSUDropDown;
	private PageElement sumInsuredParivarSurakshaForSUDropDown;
	private PageElement branchMasterForSUDropDown;
	private PageElement policyReferenceNumberOfMasterPolicyTextFeild;
	private PageElement relationOfNomineeTextFieldBH;
	
	//IC Ajit 
	private PageElement ZoneForICAIMemberTextAreaForIC;
	private PageElement	NameofMemberTextAreaForIC;
	private PageElement SexofMemberTextFieldForIC;
	private PageElement	RelationforICAIMemberDropDownForIC;
	private PageElement	DOBofMemberTextFieldForIC;
	private PageElement AgeYearTextFieldForIC;
	private PageElement OccupationforICAIMemberDropDownForIC;
	private PageElement SumInsuredForICAIFamilyFloaterFieldForIC;
	private PageElement PremiumTextAreaForIC;
	private PageElement PolicyNumberofpreviousinsurer1FieldForIC;
	private PageElement	Nameofthepreviousinsurancecompany1TextAreaForIC;
		//UK
	
	private PageElement natureOfIdUk;
	private PageElement relationOfTheMemberUk;
	private PageElement thresholdLimitDropDownList;
	private PageElement topupSumInsuredDropDownList;
	private PageElement relationforTUDropDownList;
	private PageElement occupationforMediclaimMemberDropDownList;
	private PageElement sumInsuredDropDownUk;
	private PageElement ageInYearsUk;
	private PageElement optionalCoverIIMaternityExpBenefitUk;
	private PageElement dateofinceptionofOptionalCoverIIUk;
	private PageElement whetherYouHadAHealthPolicyinthePastUk;
	private PageElement dateofinceptionofFirstPolicyUk;
	private PageElement anyCriticalIllnessDropDownList;
	private PageElement anyRecurringIllnessDropDownList;
	private PageElement areYouSufferingFromChronicIllnessDropDownList;
	private PageElement anyPsychiatricandPsychosomaticDisorderDropDownList;
	private PageElement adverseMedicalHistoryDropDownList;
	private PageElement isMedicalExaminationDoneDropDownList;
	private PageElement detailsofMedicalExaminationTextFeild;
	private PageElement costofPremedicalCheckupTextFeild;

	//HN
	private PageElement heightInMetersTextField;
	private PageElement weightINKgTextfield;
	private PageElement relationforPremierMediclaimDropDownList;
	private PageElement natureOfIDforPremierMediclaimDropDownList;
	private PageElement iDDocNoTextFeild;

	private PageElement	PreviousPolicyStartDate1ForIC;
	private PageElement	PreviousPolicyExpiryDate1ForIC;
	private PageElement	SumInsuredunderexpiringPolicy1FieldForIC;
	private PageElement	PolicyNumberofpreviousinsurer2FieldForIC;
	private PageElement	Nameofthepreviousinsurancecompany2TextAreaForIC;
	private PageElement	PreviousPolicyStartDate2ForIC;
	private PageElement	PreviousPolicyExpiryDate2ForIC;
	private PageElement	SumInsuredunderexpiringPolicy2FieldForIC;
	private PageElement	PolicyNumberofpreviousinsurer3FieldForIC;
	private PageElement	Nameofthepreviousinsurancecompany3TextAreaForIC;
	private PageElement	PreviousPolicyStartDate3ForIC;
	private PageElement	PreviousPolicyExpiryDate3ForIC;
	private PageElement	SumInsuredunderexpiringPolicy3FieldForIC;
	private PageElement	CumulativebonusunderexpiringpolicyFieldForIC;
	private PageElement	DetailsofthePreexistingdiseasesTextAreaForIC;
	private PageElement	HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC;
	private PageElement	DoyouhaveanyotherpolicyinforceDropDownForIC;
	private PageElement	PolicyNumberoftheOtherPolicyFieldForIC;
	private PageElement	InsurerNameoftheOtherpolicyTextAreaForIC;
	private PageElement	PolicyStartDateoftheOtherPolicyFieldForIC;
	private PageElement	PolicyExpiryDateoftheOtherPolicyFieldForIC;
	private PageElement	SuminsuredoftheotherpolicyFieldForIC;

	
	
	public PolicyMemberAttributeHealth(WebDriver driver,String pageName,int rowcount) {

		super(driver, pageName);

		//***************************************** JM************************************************************
		//Title
		nextGroupdetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Next Group details')]"), "Next Group details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		groupNumberTitle=new PageElement(By.xpath("div//b//font[contains(text(),'Group Number')]"), "Group Number Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyMemberAttributeHealthDetailsTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details CX T1-PLR')]"), "Policy Member Details CX Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//policycoPaymentCumulativeBonusTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Co-Payment Cumulative Bonus')]"), "Co-Payment Cumulative Bonus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameMember= new PageElement(By.xpath("//*[@id=\"10\"]/td[2]/div/textarea"), "Name Of Memb", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		genderDropDownList = new PageElement(By.xpath("//*[@id=\"12\"]/td[2]/div/select"), "Gender", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		BirthDateFindButton = new PageElement(By.xpath("//*[@id=\"13\"]/td[2]/div/a/img"), "DobFind", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		blockTextFeild = new PageElement(By.xpath("//*[@id=\"15\"]/td[2]/div/textarea"), "Block Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pinCodeTextFeild = new PageElement(By.xpath("//*[@id=\"16\"]/td[2]/div/input"), "PinCode Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " Member Fund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "policy number"))," Policy Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "InterestCode")), "Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Question Answer

		nameOfMemberTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Member", "textarea")), "Name Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sexOfMemberTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex of Member","input")), "Sex Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		realtionForMediclaimMemberDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Mediclaim Member","select")), "Realtion For Mediclaim Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationForSeniorCitizenMemberDropdownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Senior Citizen Member","select")), "Relation for Senior Citizen Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredForSeniorCitizenMemberDropdownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Senior Citizen Member","select")), "Sum Insured for Senior Citizen Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);


		groupNoTextField = new PageElement(By.xpath("//td//div[@id='Group No']/following::input"), "Group No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//
		dOBOfMemberTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("DOB of Member","input")), "DOB Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel( "Age (Year)","input")), "Age TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		occupationForMediclaimMemberDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim Member","select")), "Occupation For Mediclaim Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		detailsforOtherOccupationTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details for Other Occupation","input")), "Details for Other Occupation Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loyaltyDiscountDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loyalty Discount","select")), "Loyalty Discount DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hypertensionDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hypertension","select")), "Hypertension DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		diabetesDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diabetes","select")), "Diabetes DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		preExistingDiseaseForMediclaimMemberDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-existing Disease for Mediclaim Member","select")), "Pre Existing Disease For Mediclaim Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		natureOfDiseaseDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of disease","select")), "Nature Of Disease DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameAndAddressOfMedicalAttendantSurgeonTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name and address of medical attendant/surgeon","textarea")), "Name And Address Of Medical Attendant Surgeon TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateFirstTreatedCompletedDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date first treated","input")), "Date First Treated Completed DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		firstTreatmentCompletedDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("First treatment completed","select")), "First Treatment Completed DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherFullyCuredDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Fully cured","select")), "Whether Fully Cured DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		heightOfMemberTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Height of Member","input")), "Height Of Member TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		weightOfMemberTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Weight of Member","input")), "Weight Of Member TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		waistLineTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Waist Line (in Inches)","input")), "Waist Line TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		doYouSmokeCigarettesCigarOrpipeDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you smoke cigarettes, cigar or pipe?","select")), "Do You Smoke Cigarettes Cigar Or pipe DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouChewTobaccoDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you chew tobacco?","select")), "Do You Chew Tobacco DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouDrinkAlcoholDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Drink Alcohol?","select")), "Do You Drink Alcohol DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		healthClubMembershipDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Health Club Membership","select")), "Health Club Membership DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredForJMDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured For JM","select")), "Sum Insured For JM DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		isFamilyDiscountApplicableDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Family Discount Applicable","select")), "Is Family Discount Applicable DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		claimRatioTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Ratio(%)","input")), "Claim Ratio TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//********************************************** CX *******************************************************
		assigneeNameTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominee name","textarea")),"Assignee name Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		physicianNameTextFeild=	new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Name","input")),"Physician Name Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cumulativeBonusTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus","input")),"Cumulative Bonus Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		realtionForMediclaimMemberCXDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation (Cancer Mediclaim)","select")), "Realtion For Mediclaim Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationForMediclaimMemberCXDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation(Cancer Mediclaim)","select")), "Occupation For Mediclaim Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouSmokeCXDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Smoke?","select")), "Do You Smoke Cigarettes Cigar Or pipe DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouConsumeTobaccoCXDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Consume Tobacco","select")), "Do You Chew Tobacco DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doYouDrinkAlcoholCXDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Drink Alcohol","select")), "Do You Drink Alcohol DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredForCXDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Cancer Expenses)","select")), "Sum Insured For Cx DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		saveButton = new PageElement(By.name("btnSave"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//nextButton= new PageElement(By.name("Next"), "Next Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//nextButton= new PageElement(By.xpath("//input[@name='Next']"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextButton= new PageElement(By.name("Next"), "Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton= new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		openButton= new PageElement(By.name("Open"), "Open Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		detailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		fundTitle=new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//cx product
		/******************************************* SC ***************************************/
		memberDetailsSCT1PLRTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details SC T1-PLR')]"), "MemberDetailsSCT1-PLRTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		zoneForMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone For Member", "textarea")), "Zone For Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameOfMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Member", "textarea")), "Name Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		medicalCheckUpDetailTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Medical Check Up Detail')]"), "Medical Check Up Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationforSeniorCitizenMemberDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Senior Citizen Memberl","select")), "Relation for Senior Citizen Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredForSeniorCitizenMemberDropdownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Senior Citizen Member","select")), "Sum Insured for Senior Citizen Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		// TI-kamlesh
		sumInsuredTertiaryDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Tertiary)","select")), "Sum Insured For Cx DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		//JA
		relationForJAMemberDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for JA Member","select")), "Relation for JA Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationForJABimaMemberDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for JA Bima Member","select")), "Occupation for JA Bima Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredRsDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Tertiary)","select")), "Sum Insured For Cx DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//CG-@Rasika
		policyMemberAttributeHealthCGDetailsTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details CG T1-PLR')]"), "Policy Member Details CG Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		familyNoTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Family No","input")),"Family No Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		serialNoTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Serial No.","input")),"Serial No Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cadreTextArea =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cadre","textarea")),"Cadre Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		membershipNo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership No.","input")),"Membership No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		membershipDateTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Membership Date","input")),"Membership Date Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		categoryTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Category Type","select")), "Category Type DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//BH-@Rasika
		memberDetailsBHT1PLRTitlePage=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details BH T2-PLR')]"), "Member Details BH T2-PLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passportNumberTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Passport Number","input")),"Passport Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfIssueTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Issue","input")),"Date of Issue Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expiryDateOfPassportTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiry Date of Passport","input")),"Expiry Date of Passport Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nationalityForBHDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nationality For BH","select")),"Nationality For BH Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		visaIncomeTaxReturnWorkPermitTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Visa / Income Tax Return / Work Permit","textarea")),"Visa / Income Tax Return / Work Permit Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		proposedDateOfDeparture=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Proposed date of departure","input")),"Proposed date of departure Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		occupationForMediclaimMemberDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim Member","select")),"Occupation for Mediclaim Member Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		otherOccupationDetailTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Occupation Detail","input")),"Other Occupation Detail Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfDaysStayOutsideIndiaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. of days Stay outside India","input")),"No. of days Stay outside India Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		physicianAddressTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Address","textarea")),"Physician Address Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameOfAssigneeTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Nominee","textarea")),"Name of Nominee Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationOfAssigneeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation of Assignee","input")),"Relation of Assignee Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationOfNomineeTextFieldBH=new PageElement(By.xpath(("//td//div//input[@name='propValues16']")),"Relation of Nominee Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		medicalHistoryReportAttachedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical History report attached","select")),"Medical History report attached DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		medicalReportDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Report Date","input")),"Medical Report Date Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		insuredMemberDetailBHTitlePage=new PageElement(By.xpath("//div//b//font[contains(text(),'Insured Member Detail BH')]"), "Insured Member Detail BH Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		heightOfMemberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Height of Member","input")),"Height of Member Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		weightOfMemberTextfield  = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Weight of Member","input")),"Weight of Member Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		waistLineInInchesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Waist Line (in Inches)","input")),"Waist Line (in Inches) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		doYouChewTobaccoDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you chew tobacco?","select")),"Do you chew tobacco DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		doYouDrinkAlcoholDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Drink Alcohol?","select")),"Do you Drink Alcohol DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		doYouSmokeCigarettesCigarOrPipeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you smoke cigarettes, cigar or pipe?","select")),"Do you smoke cigarettes, cigar or pipe DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		preExistingDiseaseForMediclaimMemberDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-existing Disease for Mediclaim Member","select")),"Pre-existing Disease for Mediclaim Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		//detailsOfPreExistingDiseasesButton
		openButton=new PageElement(By.name("propValues8"),"Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sumInsuredInUSDTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD","input")),"Sum Insured in USD Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 

		//Window Fields
		serialNo = new PageElement(By.name("slNo"+rowcount+""),"Serial No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		diseaseSufferedOrSufferingTextArea=new PageElement(By.name("Data_232566427082010_"+rowcount+""),"Disease Suffered Or Sufferinf Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		medicalReportTextArea=new PageElement(By.name("Data_232566527082010_"+rowcount+""),"Medical Report Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		addWindowButton=new PageElement(By.name("btnAdd"), "Add Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//After Endorse Alteration  
		goodHealthDeclarationDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Good Health Declaration","select")),"Good Health Declaration DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		listOfDiseasesDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("List Of Diseases","select")),"List Of Diseases DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		detailsOfOtherDiseasesTextArea= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Other Diseases","textarea")),"Details of Other Diseases Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		passportDeatilsVerifiedDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Passport Deatils Verified","select")),"Passport Deatils Verified DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 

		//GT-@Rasika
		memberDetailsGTT1PLRTitlePage=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details GT T1-PLR')]"), "Member Details GT T1-PLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationForSGMCMemberDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for SGMC Member","select")),"Relation for SGMC Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationForSGMCMemberDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for SGMC Member","select")),"Occupation for SGMC Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredTertiaryDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Tertiary)","select")),"Sum Insured (Tertiary) DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//PZ-@Rasika
		memberDetailsPZT1PLRTitlePage=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details PZ T1-PLR')]"), "Member Details PZ T1-PLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationOfPZMembersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Designation of PZ Members","input")),"Designation of PZ Members Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		employeeIdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employee Id","input")),"Employee Id Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationshipWithTheAssigneeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Nominee","select")),"Relationship with the Assignee DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		preExistingDiseaseDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-existing Disease","select")),"Pre-Existing Disease DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		planTypeForPZDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Plan Type for PZ","select")),"Plan Type for PZ DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//FM Abhijit

		previousPolicyDetailsOpenButton=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Status","input")),"Previous Policy Details Open Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		serialNoParameterTextField=new PageElement(By.name("slNo1"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		previousPolicyNoWithNIATextField=new PageElement(By.name("Data_19626971930032032_"+rowcount+""),"Previous Policy No With NIA TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredPreviousPolicyTextField=new PageElement(By.name("Data_213364705022010_"+rowcount+""),"Sum Insured Previous Policy TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		fromDateTextField=new PageElement(By.name("Data_253302219012011_"+rowcount+""),"From Date TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ToDateTextField=new PageElement(By.name("Data_253302319012011_1"+rowcount+""),"To Date TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		preexistingDiseasesInPreviousPolicyTextField=new PageElement(By.name("Data_19626971930032033_"+rowcount+""),"Preexisting Diseases In Previous Policy TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addButton=new PageElement(By.name("btnAdd"), "Add Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeButton=new PageElement(By.name("btnClose"), "Close Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton=new PageElement(By.name("btnDel"), "Delete Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relationforFMMemberDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for FM Member","select")),"Relationfor FM Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);


		doYouHaveMediclaim2007PolicyWithNewIndiaDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you have Mediclaim 2007 Policy with New India","select")),"Do you have Mediclaim 2007 Policy with New India DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		policyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number","input")),"Policy Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policPeriodTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy period","input")),"Policy period Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForMemberDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured For Member","select")),"Sum Insured For Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationSwasthyaBimaDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation (Swasthya Bima)","select")),"Relation (Swasthya Bima) DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//detailsOfPreExistingDiseasesButton=
		claimReceivedAndReportedAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Received and Reported Amount","input")),"Claim Received and Reported Amount Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		// sp @akshata 
		nextGroupDropsown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Next Group","select")),"Next Group Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		groupNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Group Number", "input")), "Group Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//ES Abhijit 

		dateOfIssueFindButton=new PageElement(By.xpath("//div[contains(text(),'Date of Issue')]/following::input/following::a[@name='firstFocus']"), "DOB FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		visaTypeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Visa Type","input")),"Visa Type TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		correspondingAddressIndiaTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Corresponding Address (India)","textarea")),"corresponding Address India TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameofNextKinTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Next Kin","textarea")),"Name of Next Kin TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationshipofNextKinTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of Next Kin","input")),"Relationship of Next Kin TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressofNextKinTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of Next Kin","textarea")),"Address of Next Kin TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		telephoneNoofNextKinTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Telephone No. of Next Kin","input")),"Telephone No. of Next Kin TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameofSponsorTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Sponsor","textarea")),"Name of Sponsor TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationshipofSponsorTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of Sponsor","input")),"Relationship of Sponsor TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressofSponsorTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of Sponsor","textarea")),"Address of Sponsor TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		telephoneNoofSponsorTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Telephone No. of Sponsor","input")),"Telephone No. of Sponsor TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		countryofVisitTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Country of Visit","textarea")),"Country of Visit TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressInCountryOfVisitTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address in country of visit","textarea")),"Address in country of visit TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameofSchoolWorkplaceTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of School/workplace","textarea")),"Name of School/workplace TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressofSchoolWorkplaceTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of School/workplace","textarea")),"Address of School/workplace TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		telephoneNoOfSchoolWorkplaceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Telephone No of School/workplace","input")),"Telephone No of School/workplace TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsofNatureOfStudyTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Nature of Study/Research/Activities/Employment (Including period From and To)","textarea")),"Details of Nature of Study/Research/Activities/Employment (Including period From and To) TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		areYouFreeFromPhysicalDefectDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are you free from physical defect or infirmity?","select")),"Are you free from physical defect or infirmity? Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		physicianRegistrationNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Registration No","input")),"Physician Registration No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		physicianTelephoneNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Telephone No","input")),"Physician Telephone No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherInformationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other information (if any)","textarea")),"Other information (if any) TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		medicalReportAttachedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical report attached","select")),"Medical report attached Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredInUSDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD","input")),"Sum Insured in USD TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assigneeAddressTextArea=new PageElement(By.xpath("//textarea[@name='propValues34']"),"Assignee Address TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assigneeContactNumberTextField=new PageElement(By.xpath("//input[@name='propValues35']"),"Assignee Contact Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressOfCountryInVisitTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of country in visit","textarea")),"Address of country in visit TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//BH-Rasika

		expiryDateFindButton=new PageElement(By.xpath("//div[contains(text(),'Expiry Date of Passport')]/following::input/following::a[@name='firstFocus']"), "Expiry Date FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proposedDateFindButton=new PageElement(By.xpath("//div[contains(text(),'Proposed date of departure')]/following::input/following::a[@name='firstFocus']"), "Proposed Date FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalReportBHTextArea=new PageElement(By.name("Data_232566527082010_0"),"Medical Report Text Area BH Window Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//MC-@Priyanka_ On Hold

		WhetherInsuredIsAdmittedForThePreExistingDiseaseDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Insured is admitted for the pre existing disease","select")),"Whether Insured is admitted for the pre existing disease DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//FM Abhijit

		sumInsuredForFamilyFloaterDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured For Family Floater","select")),"Sum Insured For Family Floater Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		medicalReportTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Report","textarea")),"Medical Report TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//UH
		relationForUniversalHealthMemberDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Universal Health Member","select")), "Relation for Universal Health Member DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areYouEarningHeadOfTheFamilyDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are you Earning head of the Family?","select")), "Are you Earning head of the Family? DropDownList",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforUniversalHealthTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Universal Health","input")),"Sum Insured for Universal Health TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestTitle = new PageElement(By.linkText("Insured Interest"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.linkText("Insured Interest"), "Insured Interest Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//PZ-Priyanka

		iMJourneyDetailsPZTitlePage=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "IM Journey Details PZ Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfVisitDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of Visit","select")),"Place of Visit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		dateOfCommencementOfJourneyTextfield= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of commencement of Journey","input")),"Date of commencement of Journey Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		expectedDateOfReturnTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expected date of return","input")),"Expected date of return Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		actualDateOfReturnTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Actual date of Return","input")),"Actual date of Return Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		sumInsuredInUSDPZTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD","input")),"Sum Insured in USD Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		certificateNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Certificate No","input")),"Certificate No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		documentNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Document Number","input")),"Document Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		declarationNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Declaration Number","input")),"Declaration Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		nameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name","input")),"Name Textarea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//TG Sachin
		nameTextArea= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name","textarea")),"Name Textarea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sexDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex","select")),"Sex DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		employeeNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employee Number","input")),"Employee Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationforTailorMadeGroupMediclaimDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Tailor Made Group Mediclaim","select")),"Relation for Tailor Made Group Mediclaim DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ambulanceChargeperFamilyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Ambulance Charge per Family","input")),"Ambulance Charge per Family TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredforTailorMadePoliciesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Tailor Made Policies","input")),"Sum Insured for Tailor Made Policies TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		topUpSumInsuredTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Top Up Sum Insured","input")),"Top Up Sum Insured TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Serial Number","input")),"Serial Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hOApprovalNoTextBox= new PageElement(By.xpath(locatorforQuestionAnswerPanel("HO Approval No.","textarea")),"HO Approval No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		closeWinodwButton=new PageElement(By.name("CloseWin"), "Close Button On Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sNoTextField=new PageElement(By.xpath("//*[@id=\"9\"]/td[2]/div/input "),"SNo Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialUHTextField=new PageElement(By.xpath("//*[@id=\"2\"]/td[2]/div/input"),"SerialNo Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		familyUHTextField=new PageElement(By.xpath("//*[@id=\"1\"]/td[2]/div/input"),"famlyNo Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//RS-Amit

		uploadIDTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Upload ID","input")),"Upload ID TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rSBYURNTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("RSBY URN","input")),"RSBY URN TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rSBYChipNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("RSBY Chip No","input")),"RSBY Chip No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		enrollmentFeesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Enrollment Fees","input")),"Enrollment Fees TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rSBYIssueDateFindButton=new PageElement(By.xpath("//div[contains(text(),'RSBY Issue Date')]/following::input/following::a[@name='firstFocus']"), "RSBY Issue Date FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		familyNoForRSTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Family No.","input")),"Family No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredforRSBYTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for RSBY","input")),"Sum Insured for RSBY TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rSBYIssueDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("RSBY Issue Date","input")),"Upload ID TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		sexForSUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex","select")),"Sex DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationOfParivarSurakshaForSUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation of Parivar Suraksha","select")),"Relation of Parivar Suraksha DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationForMediclaimMemberForSUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim member","select")),"Occupation for Mediclaim member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredParivarSurakshaForSUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured Parivar Suraksha","select")),"Sum Insured Parivar Suraksha DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		branchMasterForSUDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Branch Master","select")),"Branch Master DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		policyReferenceNumberOfMasterPolicyTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy reference number of Master Policy","input")),"Policy reference number of Master Policy TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//UK
		natureOfIdUk= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of ID", "select")),"Nature of ID DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationOfTheMemberUk= new PageElement(By.xpath("//td//div[contains(text(),'Relation of the Member')]/following::select[1]"),"Relation of The Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredDropDownUk= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::select[1]"),"Sum Insured",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		thresholdLimitDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Threshold Limit","select")),"Threshold Limit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		topupSumInsuredDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Topup Sum Insured","select")),"Threshold Limit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		relationforTUDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for TU","select")),"Relation for TU DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationforMediclaimMemberDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim Member","select")),"Occupation for Mediclaim Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ageInYearsUk= new PageElement(By.xpath("//td//div[contains(text(),'Age (in years)')]/following::input[1]"),"Age (in years)",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionalCoverIIMaternityExpBenefitUk= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Optional Cover II- Maternity Expenses Benefit", "select")),"Optional Cover II- Maternity Expenses Benefit",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		topupSumInsuredDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Topup Sum Insured","select")),"Threshold Limit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		relationforTUDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for TU","select")),"Relation for TU DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationforMediclaimMemberDropDownList=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim Member","select")),"Occupation for Mediclaim Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		dateofinceptionofOptionalCoverIIUk= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of inception of Optional Cover II", "input")),"Date of inception of Optional Cover II",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherYouHadAHealthPolicyinthePastUk= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A Health Policy in the Past", "select")),"Whether You Had A Health Policy in the Past",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateofinceptionofFirstPolicyUk= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of inception of first policy", "input")),"Date of inception of first policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		anyCriticalIllnessDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any critical illness?", "select")),"Any critical illness?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyRecurringIllnessDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any recurring illness?", "select")),"Any recurring illness?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		areYouSufferingFromChronicIllnessDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Are you suffering from chronic illness?", "select")),"Are you suffering from chronic illness?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyPsychiatricandPsychosomaticDisorderDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any Psychiatric and Psychosomatic Disorder?", "select")),"Any Psychiatric and Psychosomatic Disorder?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		adverseMedicalHistoryDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Adverse Medical History?", "select")),"Adverse Medical History?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isMedicalExaminationDoneDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Medical Examination done?", "select")),"Is Medical Examination done?",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		detailsofMedicalExaminationTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Medical examination", "textarea")),"Details of Medical examination",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		costofPremedicalCheckupTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost of Pre-medical Check-up", "input")),"Cost of Pre-medical Check-up",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//HN
		heightInMetersTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Height (in meters)","input")),"Height Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		weightINKgTextfield  = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Weight (in Kg)","input")),"Weight Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		relationforPremierMediclaimDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for Premier Mediclaim","select")),"Relation for Premier Mediclaim DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		natureOfIDforPremierMediclaimDropDownList= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of ID for Premier Mediclaim","select")),"Nature of ID for Premier Mediclaim DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		iDDocNoTextFeild= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ID Doc No","input")),"ID Doc No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 

		
		//IC Ajit
		ZoneForICAIMemberTextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone For ICAI Member","textarea")),"Zone For ICAI Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		NameofMemberTextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Member","textarea")),"Name of Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SexofMemberTextFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex of Member","input")),"Sex of Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		RelationforICAIMemberDropDownForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relation for ICAI Member","select")),"Relation for ICAI Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		DOBofMemberTextFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("DOB of Member","input")),"DOB of Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		AgeYearTextFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year)","input")),"Age (Year)",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		OccupationforICAIMemberDropDownForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for ICAI Member","select")),"Occupation for ICAI Member",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SumInsuredForICAIFamilyFloaterFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured For ICAI Family Floater","input")),"Sum Insured For ICAI Family Floater",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PremiumTextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium","input")),"Premium",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyNumberofpreviousinsurer1FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number of previous insurer 1","input")),"Policy Number of previous insurer 1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		Nameofthepreviousinsurancecompany1TextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the previous insurance company1","textarea")),"Name of the previous insurance company1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyStartDate1ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Start Date 1","input")),"Previous Policy Start Date 1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyExpiryDate1ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Expiry Date 1","input")),"Previous Policy Expiry Date 1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SumInsuredunderexpiringPolicy1FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured under expiring Policy 1","input")),"Sum Insured under expiring Policy 1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyNumberofpreviousinsurer2FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number of previous insurer 2","input")),"Policy Number of previous insurer 2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		Nameofthepreviousinsurancecompany2TextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the previous insurance company2","textarea")),"Name of the previous insurance company2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyStartDate2ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Start Date 2","input")),"Previous Policy Start Date 2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyExpiryDate2ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Expiry Date 2","input")),"Previous Policy Expiry Date 2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SumInsuredunderexpiringPolicy2FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured under expiring Policy 2","input")),"Sum Insured under expiring Policy 2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyNumberofpreviousinsurer3FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number of previous insurer 3","input")),"Policy Number of previous insurer 3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		Nameofthepreviousinsurancecompany3TextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the previous insurance company3","textarea")),"Name of the previous insurance company3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyStartDate3ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Start Date 3","input")),"Previous Policy Start Date 3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PreviousPolicyExpiryDate3ForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Expiry Date 3","input")),"Previous Policy Expiry Date 3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SumInsuredunderexpiringPolicy3FieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured under expiring Policy 3","input")),"Sum Insured under expiring Policy 3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		CumulativebonusunderexpiringpolicyFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative bonus under expiring policy","input")),"Cumulative bonus under expiring policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		DetailsofthePreexistingdiseasesTextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of the Preexisting diseases","textarea")),"Details of the Preexisting diseases",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("How many years you are covered under the Health policy in the Past","input")),"How many years you are covered under the Health policy in the Past",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		DoyouhaveanyotherpolicyinforceDropDownForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you have any other policy in force","select")),"Do you have any other policy in force",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyNumberoftheOtherPolicyFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number of the Other Policy","input")),"Policy Number of the Other Policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		InsurerNameoftheOtherpolicyTextAreaForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Insurer Name of the Other policy","textarea")),"Insurer Name of the Other policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyStartDateoftheOtherPolicyFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Start Date of the Other Policy","input")),"Policy Start Date of the Other Policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		PolicyExpiryDateoftheOtherPolicyFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Expiry Date of the Other Policy","input")),"Policy Expiry Date of the Other Policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SuminsuredoftheotherpolicyFieldForIC= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured of the other policy","input")),"Sum insured of the other policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		
	}


	//Services
	public void navigateToPolicyTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyButton")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigAttributeButton")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigMemberButton")){		
			click(memberTitle);
			switchToFrame("display");
			//isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToInsuredIntersetTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitlePage);
		}
	}

	public void navigateToCoverageTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigCoverageButton")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigLoan")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigClientDetailsButton")){		

			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigRelationsButton")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigPaymentsButton")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigFollowupButton")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigDocumentButton")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigDetailButton")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigRelationsButton")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PolicyMemberAttributeEntity policyMemberAttribute){
		if (policyMemberAttribute.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}
	//sp @akshata
	public void fillpolicyMemberAttributeNextGroupDetails(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigNextGroup")) {
				selectValueFromList(nextGroupDropsown, policyMemberAttribute.getStringValueForField("NextGroup"));
				click(forwordButton);
				switchToFrame("display");
			}
		}
	}
	//@ akshata
	public void fillpolicyMemberAttributeGroupNumberDetails(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){

			if (policyMemberAttribute.getBooleanValueForField("ConfigGroupNumber")) {
				clearAndSendKeys(groupNumberTextField, policyMemberAttribute.getStringValueForField("GroupNumber"));

			}

			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("SP")){
				click(forwordButton);
				switchToFrame("display");
			}
		}
	}


	public void fillpolicyMemberAttributeDetails(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){

			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofMember")) {
				clearAndSendKeys(nameOfMemberTextFeild, policyMemberAttribute.getStringValueForField("NameofMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSexofMember")) {
				clearAndSendKeys(sexOfMemberTextFeild, policyMemberAttribute.getStringValueForField("SexofMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforMediclaimMember")) {
				selectValueFromList(realtionForMediclaimMemberDropDownList, policyMemberAttribute.getStringValueForField("RelationforMediclaimMember"));
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigGroupNo")) {
				clearAndSendKeys(groupNoTextField, policyMemberAttribute.getStringValueForField("GroupNo"));
			}
			//sc

			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForSeniorCitizenMember")) {
				selectValueFromList(sumInsuredForSeniorCitizenMemberDropdownList, policyMemberAttribute.getStringValueForField("SumInsuredForSeniorCitizenMember"));
			}

			// JA
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationForJAMember")) {
				selectValueFromList(relationForJAMemberDropDown, policyMemberAttribute.getStringValueForField("RelationForJAMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForJABimaMember")) {
				selectValueFromList(occupationForJABimaMemberDropDown, policyMemberAttribute.getStringValueForField("OccupationForJABimaMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDOBofMember")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DOBofMember"));
				clearAndEnterDate(dOBOfMemberTextFeild, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAgeYear")) {
				clearAndSendKeys(ageTextFeild, policyMemberAttribute.getStringValueForField("AgeYear"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigBirthDate")) {
				Thread.sleep(3000);
				selectDateFromCalender(BirthDateFindButton, policyMemberAttribute.getStringValueForField("BirthDate"));
				switchToFrame("display");
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameMember")) {
				clearAndSendKeys(nameMember, policyMemberAttribute.getStringValueForField("NameMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigBlock")) {
				clearAndSendKeys(blockTextFeild, policyMemberAttribute.getStringValueForField("Block"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPinCode")) {
				clearAndSendKeys(pinCodeTextFeild, policyMemberAttribute.getStringValueForField("PinCode"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationforMediclaimMember")) {
				selectValueFromList(occupationForMediclaimMemberDropDownList, policyMemberAttribute.getStringValueForField("OccupationforMediclaimMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsforOtherOccupation")) {
				clearAndSendKeys(detailsforOtherOccupationTextFeild, policyMemberAttribute.getStringValueForField("DetailsforOtherOccupation"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigLoyaltyDiscount")) {
				selectValueFromList(loyaltyDiscountDropDownList, policyMemberAttribute.getStringValueForField("LoyaltyDiscount"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHypertension")) {
				selectValueFromList(hypertensionDropDownList, policyMemberAttribute.getStringValueForField("Hypertension"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDiabetes")) {
				selectValueFromList(diabetesDropDownList, policyMemberAttribute.getStringValueForField("Diabetes"));
			}
			//ES Abhijit
			if(!policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("ES") || policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("HN")){
				fillMemberAttributes(policyMemberAttribute);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfignatureOfDisease")) {
				selectValueFromList(natureOfDiseaseDropDownList, policyMemberAttribute.getStringValueForField("NatureOfDisease"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameAndAddressOfMedicalAttendantSurgeon")) {
				clearAndSendKeys(nameAndAddressOfMedicalAttendantSurgeonTextFeild, policyMemberAttribute.getStringValueForField("NameAndAddressOfMedicalAttendantSurgeon"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateFirstTreatedCompleted")) {
				String DateFirstTreatedCompleted=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateFirstTreatedCompleted"));
				clearAndEnterDate(dateFirstTreatedCompletedDropDownList, DateFirstTreatedCompleted);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigFirstTreatmentCompleted")) {
				selectValueFromList(firstTreatmentCompletedDropDownList, policyMemberAttribute.getStringValueForField("FirstTreatmentCompleted"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigwhetherFullyCured")) {
				selectValueFromList(whetherFullyCuredDropDownList, policyMemberAttribute.getStringValueForField("WhetherFullyCured"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWaistLine")) {
				clearAndSendKeys(waistLineTextFeild, policyMemberAttribute.getStringValueForField("WaistLine"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHealthClubMembership")) {
				selectValueFromList(healthClubMembershipDropDownList, policyMemberAttribute.getStringValueForField("HealthClubMembership"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForJM")) {
				selectValueFromList(sumInsuredForJMDropDownList, policyMemberAttribute.getStringValueForField("SumInsuredForJM"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigIsFamilyDiscountApplicable")) {
				selectValueFromList(isFamilyDiscountApplicableDropDownList, policyMemberAttribute.getStringValueForField("IsFamilyDiscountApplicable"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigClaimRatio")) {
				selectValueFromList(claimRatioTextFeild, policyMemberAttribute.getStringValueForField("ClaimRatio"));
			}
			//CG-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigFamilyNo")) {
				clearAndSendKeys(familyNoTextField, policyMemberAttribute.getStringValueForField("FamilyNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSerialNo")) {
				clearAndSendKeys(serialNoTextField, policyMemberAttribute.getStringValueForField("SerialNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSrNo")) {
				clearAndSendKeys(sNoTextField, policyMemberAttribute.getStringValueForField("SrNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSerialUH")) {
				clearAndSendKeys(serialUHTextField, policyMemberAttribute.getStringValueForField("SerialUH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigFamilyUH")) {
				clearAndSendKeys(familyUHTextField, policyMemberAttribute.getStringValueForField("FamilyUH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCadreTextArea")) {
				clearAndSendKeys(cadreTextArea, policyMemberAttribute.getStringValueForField("CadreTextArea"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationCancerMediclaim")) {
				selectValueFromList(realtionForMediclaimMemberCXDropDownList, policyMemberAttribute.getStringValueForField("RelationCancerMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMembershipNo")) {
				clearAndSendKeys(membershipNo, policyMemberAttribute.getStringValueForField("MembershipNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCategoryType")) {
				selectValueFromList(categoryTypeDropDown, policyMemberAttribute.getStringValueForField("CategoryType"));
			}

			//***************UH***************************************************************//
			//relationForUniversalHealthMemberDropDownList
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationForUniversalHealthMember")) {
				selectValueFromList(relationForUniversalHealthMemberDropDownList, policyMemberAttribute.getStringValueForField("RelationForUniversalHealthMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAreYouEarningHeadOfTheFamily")) {
				selectValueFromList(areYouEarningHeadOfTheFamilyDropDownList, policyMemberAttribute.getStringValueForField("AreYouEarningHeadOfTheFamily"));
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredforUniversalHealth")) {
				clearAndSendKeys(sumInsuredforUniversalHealthTextField, policyMemberAttribute.getStringValueForField("SumInsuredforUniversalHealth"));
			}


			//********************************************** CX *******************************************************
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeName")) {
				clearAndSendKeys(assigneeNameTextFeild, policyMemberAttribute.getStringValueForField("AssigneeName"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianName")) {
				clearAndSendKeys(physicianNameTextFeild, policyMemberAttribute.getStringValueForField("PhysicianName"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCumulativeBonus")) {
				clearAndSendKeys(cumulativeBonusTextFeild, policyMemberAttribute.getStringValueForField("CumulativeBonus"));
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationCX")) {
				selectValueFromList(occupationForMediclaimMemberCXDropDownList, policyMemberAttribute.getStringValueForField("OccupationCX"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigGender")) {
				selectValueFromList(genderDropDownList, policyMemberAttribute.getStringValueForField("Gender"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouSmokeCX")) {
				selectValueFromList(doYouSmokeCXDropDownList, policyMemberAttribute.getStringValueForField("DoYouSmokeCX"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouConsumeTobaccoCX")) {
				selectValueFromList(doYouConsumeTobaccoCXDropDownList, policyMemberAttribute.getStringValueForField("DoYouConsumeTobaccoCX"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouDrinkAlcoholCX")) {
				selectValueFromList(doYouDrinkAlcoholCXDropDownList, policyMemberAttribute.getStringValueForField("DoyouDrinkAlcoholCX"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForCX")) {
				selectValueFromList(sumInsuredForCXDropDownList, policyMemberAttribute.getStringValueForField("SumInsuredForCX"));
			}

			//********************************************** SC *******************************************/
			if (policyMemberAttribute.getBooleanValueForField("ConfigZoneForMember")) {
				selectValueFromList(zoneForMemberTextField, policyMemberAttribute.getStringValueForField("ZoneForMember"));
			}


			if (policyMemberAttribute.getBooleanValueForField("ConfigMembershipDate")) {
				String MembershipDate=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("MembershipDate"));
				clearAndEnterDate(membershipDateTextFeild, MembershipDate);
			}

			//BH-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigPassportNo")) {
				clearAndSendKeys(passportNumberTextField, policyMemberAttribute.getStringValueForField("PassportNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateOfIssue")) {
				Thread.sleep(3000);
				selectDateFromCalender(dateOfIssueFindButton, policyMemberAttribute.getStringValueForField("DateOfIssue"));
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigExpiryDateOfPassport")) {
				Thread.sleep(3000);
				selectDateFromCalender(expiryDateFindButton, policyMemberAttribute.getStringValueForField("ExpiryDateOfPassport"));
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigNationalityForBH")) {
				selectValueFromList(nationalityForBHDropDown, policyMemberAttribute.getStringValueForField("NationalityForBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigVisaIncomeTaxReturnWorkPermit")) {
				clearAndSendKeys(visaIncomeTaxReturnWorkPermitTextArea, policyMemberAttribute.getStringValueForField("VisaIncomeTaxReturnWorkPermit"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigProposalDateOfDepature")) {
				Thread.sleep(3000);
				selectDateFromCalender(proposedDateFindButton, policyMemberAttribute.getStringValueForField("ProposalDateOfDepature"));
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForMediclaim")) {
				selectValueFromList(occupationForMediclaimMemberDropDown, policyMemberAttribute.getStringValueForField("OccupationForMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOtherOccupationDetail")) {
				clearAndSendKeys(otherOccupationDetailTextfield, policyMemberAttribute.getStringValueForField("OtherOccupationDetail"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNoOfDaysStayOutsideIndia")) {
				clearAndSendKeys(noOfDaysStayOutsideIndiaTextField, policyMemberAttribute.getStringValueForField("NoOfDaysStayOutsideIndia"));
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianAddress")) {
				clearAndSendKeys(physicianAddressTextArea, policyMemberAttribute.getStringValueForField("PhysicianAddress"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameOfAssignee")) {
				clearAndSendKeys(nameOfAssigneeTextArea, policyMemberAttribute.getStringValueForField("NameOfAssignee"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationOfAssignee")) {
				clearAndSendKeys(relationOfAssigneeTextField, policyMemberAttribute.getStringValueForField("RelationOfAssignee"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationOfNomineeBH")) {
				clearAndSendKeys(relationOfNomineeTextFieldBH, policyMemberAttribute.getStringValueForField("RelationOfNomineeBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalHistoryReportAttached")) {
				selectValueFromList(medicalHistoryReportAttachedDropDown, policyMemberAttribute.getStringValueForField("MedicalHistoryReportAttached"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportDate")) {
				String MedicalReportDate=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("MedicalReportDate"));
				clearAndEnterDate(medicalReportDateTextField, MedicalReportDate);
			}

			// FM Abhijit
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyDetailswithNIA")) {
				fillPreviousPolicyDetails(policyMemberAttribute);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforFMMember")){
				selectValueFromList(relationforFMMemberDropDown, policyMemberAttribute.getStringValueForField("RelationforFMMember"));
			}
			//GT-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationForSGMCMember")) {
				selectValueFromList(relationForSGMCMemberDropDown, policyMemberAttribute.getStringValueForField("RelationForSGMCMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForSGMCMember")) {
				selectValueFromList(occupationForSGMCMemberDropDown, policyMemberAttribute.getStringValueForField("OccupationForSGMCMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredTertiary")) {
				selectValueFromList(sumInsuredTertiaryDropDown, policyMemberAttribute.getStringValueForField("SumInsuredTertiary"));
			}

			//PZ-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigDesignationOfPZMembers")) {
				clearAndSendKeys(designationOfPZMembersTextField, policyMemberAttribute.getStringValueForField("DesignationOfPZMembers"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEmployeeID")) {
				clearAndSendKeys(employeeIdTextField, policyMemberAttribute.getStringValueForField("EmployeeID"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipWithTheAssignee")) {
				selectValueFromList(relationshipWithTheAssigneeDropDown, policyMemberAttribute.getStringValueForField("RelationshipWithTheAssignee"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreExistingDisease")) {
				selectValueFromList(preExistingDiseaseDropDown, policyMemberAttribute.getStringValueForField("PreExistingDisease"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPlanTypeForPZ")) {
				selectValueFromList(planTypeForPZDropDown, policyMemberAttribute.getStringValueForField("PlanTypeForPZ"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				selectValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown, policyMemberAttribute.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNumberTextField, policyMemberAttribute.getStringValueForField("PolicyNumber"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyPeriod")) {
				clearAndSendKeys(policPeriodTextField, policyMemberAttribute.getStringValueForField("PolicyPeriod"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForMember")) {
				selectValueFromList(sumInsuredForMemberDropDown, policyMemberAttribute.getStringValueForField("SumInsuredForMember"));
			}
			//sp
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationSwasthyaBima")) {
				selectValueFromList(relationSwasthyaBimaDropDown, policyMemberAttribute.getStringValueForField("RelationSwasthyaBima"));
			}

			//After Click On Button New Window Open
			if (policyMemberAttribute.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				clearAndSendKeys(claimReceivedAndReportedAmountTextField, policyMemberAttribute.getStringValueForField("ClaimReceivedAndReportedAmount"));
			}

			//ES Abhijit

			if (policyMemberAttribute.getBooleanValueForField("ConfigVisaType")) {
				clearAndSendKeys(visaTypeTextField, policyMemberAttribute.getStringValueForField("VisaType"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCorrespondingAddressIndia")) {
				clearAndSendKeys(correspondingAddressIndiaTextArea, policyMemberAttribute.getStringValueForField("CorrespondingAddressIndia"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofNextKin")) {
				clearAndSendKeys(nameofNextKinTextArea, policyMemberAttribute.getStringValueForField("NameofNextKin"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipofNextKin")) {
				clearAndSendKeys(relationshipofNextKinTextField, policyMemberAttribute.getStringValueForField("RelationshipofNextKin"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofNextKin")) {
				clearAndSendKeys(addressofNextKinTextArea, policyMemberAttribute.getStringValueForField("AddressofNextKin"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofNextKin")) {
				clearAndSendKeys(telephoneNoofNextKinTextField, policyMemberAttribute.getStringValueForField("TelephoneNoofNextKin"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofSponsor")) {
				clearAndSendKeys(nameofSponsorTextArea, policyMemberAttribute.getStringValueForField("NameofSponsor"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipofSponsor")) {
				clearAndSendKeys(relationshipofSponsorTextField, policyMemberAttribute.getStringValueForField("RelationshipofSponsor"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofSponsor")) {
				clearAndSendKeys(addressofSponsorTextArea, policyMemberAttribute.getStringValueForField("AddressofSponsor"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofSponsor")) {
				clearAndSendKeys(telephoneNoofSponsorTextField, policyMemberAttribute.getStringValueForField("TelephoneNoofSponsor"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCountryofVisit")) {
				clearAndSendKeys(countryofVisitTextArea, policyMemberAttribute.getStringValueForField("CountryofVisit"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressInCountryofVisit")) {
				clearAndSendKeys(addressInCountryOfVisitTextArea, policyMemberAttribute.getStringValueForField("AddressInCountryofVisit"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofSchoolWorkplace")) {
				clearAndSendKeys(nameofSchoolWorkplaceTextArea, policyMemberAttribute.getStringValueForField("NameofSchoolWorkplace"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofSchoolWorkplace")) {
				clearAndSendKeys(addressofSchoolWorkplaceTextArea, policyMemberAttribute.getStringValueForField("AddressofSchoolWorkplace"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofSchoolWorkplace")) {
				clearAndSendKeys(telephoneNoOfSchoolWorkplaceTextField, policyMemberAttribute.getStringValueForField("TelephoneNoofSchoolWorkplace"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofNature")) {
				clearAndSendKeys(detailsofNatureOfStudyTextArea, policyMemberAttribute.getStringValueForField("DetailsofNature"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAreYouFreeFromPhysicalDefect")) {
				selectValueFromList(areYouFreeFromPhysicalDefectDropdown, policyMemberAttribute.getStringValueForField("AreYouFreeFromPhysicalDefect"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianRegistrationNo")) {
				clearAndSendKeys(physicianRegistrationNoTextField, policyMemberAttribute.getStringValueForField("PhysicianRegistrationNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianTelephoneNo")) {
				clearAndSendKeys(physicianTelephoneNoTextField, policyMemberAttribute.getStringValueForField("PhysicianTelephoneNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOtherInformation")) {
				clearAndSendKeys(otherInformationTextArea, policyMemberAttribute.getStringValueForField("OtherInformation"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportAttached")) {
				selectValueFromList(medicalReportAttachedDropdown, policyMemberAttribute.getStringValueForField("MedicalReportAttached"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeAddress")) {
				clearAndSendKeys(assigneeAddressTextArea, policyMemberAttribute.getStringValueForField("AssigneeAddress"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeContactNumber")) {
				clearAndSendKeys(assigneeContactNumberTextField, policyMemberAttribute.getStringValueForField("AssigneeContactNumber"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofCountryInVisit")) {
				clearAndSendKeys(addressOfCountryInVisitTextArea, policyMemberAttribute.getStringValueForField("AddressofCountryInVisit"));
			}

			//MC-@Priyanka

			if (policyMemberAttribute.getBooleanValueForField("ConfigWhetherInsuredIsAdmittedForThePreExistingDisease")) {
				selectValueFromList(WhetherInsuredIsAdmittedForThePreExistingDiseaseDropDown, policyMemberAttribute.getStringValueForField("WhetherInsuredIsAdmittedForThePreExistingDisease"));
			}
			//FM Abhijit 
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForFamilyFloater")) {
				selectValueFromList(sumInsuredForFamilyFloaterDropdown, policyMemberAttribute.getStringValueForField("SumInsuredForFamilyFloater"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReport")) {
				clearAndSendKeys(medicalReportTextArea, policyMemberAttribute.getStringValueForField("MedicalReport"));
			}

			//TG Sachin
			if (policyMemberAttribute.getBooleanValueForField("ConfigName")) {
				if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("PZ")){
					clearAndSendKeys(nameTextField, policyMemberAttribute.getStringValueForField("Name"));
				}
				else {
					clearAndSendKeys(nameTextArea, policyMemberAttribute.getStringValueForField("Name"));
				}

			}


			if (policyMemberAttribute.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropdown, policyMemberAttribute.getStringValueForField("Sex"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEmployeeNumber")) {
				clearAndSendKeys(employeeNumberTextField, policyMemberAttribute.getStringValueForField("EmployeeNumber"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforTailorMadeGroupMediclaim")) {
				selectValueFromList(relationforTailorMadeGroupMediclaimDropdown, policyMemberAttribute.getStringValueForField("RelationforTailorMadeGroupMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAmbulanceChargeperFamily")) {
				clearAndSendKeys(ambulanceChargeperFamilyTextField, policyMemberAttribute.getStringValueForField("AmbulanceChargeperFamily"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredforTailorMadePolicies")) {
				clearAndSendKeys(sumInsuredforTailorMadePoliciesTextField, policyMemberAttribute.getStringValueForField("SumInsuredforTailorMadePolicies"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTopUpSumInsured")) {
				clearAndSendKeys(topUpSumInsuredTextField, policyMemberAttribute.getStringValueForField("TopUpSumInsured"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSerialNumber")) {
				clearAndSendKeys(serialNumberTextField, policyMemberAttribute.getStringValueForField("SerialNumber"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHOApprovalNo")) {
				clearAndSendKeys(hOApprovalNoTextBox, policyMemberAttribute.getStringValueForField("HOApprovalNo"));
			}
			//RS-Amit
			if (policyMemberAttribute.getBooleanValueForField("ConfigUploadID")) {
				clearAndSendKeys(uploadIDTextField, policyMemberAttribute.getStringValueForField("UploadID"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYURN")) {
				clearAndSendKeys(rSBYURNTextField, policyMemberAttribute.getStringValueForField("RSBYURN"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYChipNo")) {
				clearAndSendKeys(rSBYChipNoTextField, policyMemberAttribute.getStringValueForField("RSBYChipNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEnrollmentFees")) {
				clearAndSendKeys(enrollmentFeesTextField, policyMemberAttribute.getStringValueForField("EnrollmentFees"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYIssueDate")) {
				Thread.sleep(3000);
				selectDateFromCalender(rSBYIssueDateFindButton, policyMemberAttribute.getStringValueForField("RSBYIssueDate"));
				switchToFrame("display");
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredforRSBY")) {
				clearAndSendKeys(sumInsuredforRSBYTextField, policyMemberAttribute.getStringValueForField("SumInsuredforRSBY"));
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigPreexistingDiseaseforMediclaimMember")) {
				selectValueFromList(preExistingDiseaseForMediclaimMemberDropDownList, policyMemberAttribute.getStringValueForField("PreexistingDiseaseforMediclaimMember"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfignatureOfDisease")) {
				selectValueFromList(natureOfDiseaseDropDownList, policyMemberAttribute.getStringValueForField("NatureOfDisease"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameAndAddressOfMedicalAttendantSurgeon")) {
				clearAndSendKeys(nameAndAddressOfMedicalAttendantSurgeonTextFeild, policyMemberAttribute.getStringValueForField("NameAndAddressOfMedicalAttendantSurgeon"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateFirstTreatedCompleted")) {
				String dateFirstTreatedCompleted=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateFirstTreatedCompleted"));
				clearAndEnterDate(dateFirstTreatedCompletedDropDownList, dateFirstTreatedCompleted);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigFirstTreatmentCompleted")) {
				selectValueFromList(firstTreatmentCompletedDropDownList, policyMemberAttribute.getStringValueForField("FirstTreatmentCompleted"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigwhetherFullyCured")) {
				selectValueFromList(whetherFullyCuredDropDownList, policyMemberAttribute.getStringValueForField("WhetherFullyCured"));
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("UK")) {
				if (policyMemberAttribute.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyinthePastUk")) {
					selectValueFromList(whetherYouHadAHealthPolicyinthePastUk, policyMemberAttribute.getStringValueForField("WhetherYouHadAHealthPolicyinthePastUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDateofinceptionofFirstPolicyUk")) {
					String dateofinceptionofFirstPolicy=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateofinceptionofFirstPolicyUk"));
					clearAndEnterDate(dateofinceptionofFirstPolicyUk, dateofinceptionofFirstPolicy);
				}
				click(nextButton);
				if (policyMemberAttribute.getBooleanValueForField("ConfigSexUk")) {
					selectValueFromList(sexDropdown, policyMemberAttribute.getStringValueForField("SexUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigRelationofTheMember")) {
					selectValueFromList(relationOfTheMemberUk, policyMemberAttribute.getStringValueForField("RelationofTheMember"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigOptionalCoverIIMaternityExpBenefitUk")) {
					selectValueFromList(optionalCoverIIMaternityExpBenefitUk, policyMemberAttribute.getStringValueForField("OptionalCoverIIMaternityExpBenefitUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDateofinceptionofOptionalCoverIIUk")) {
					String dateofinceptionofOptionalCoverII=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateofinceptionofOptionalCoverIIUk"));
					clearAndEnterDate(dateofinceptionofOptionalCoverIIUk, dateofinceptionofOptionalCoverII);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigNatureofID")) {
					selectValueFromList(natureOfIdUk, policyMemberAttribute.getStringValueForField("NatureofID"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNo")) {
					clearAndSendKeys(iDDocNoTextFeild, policyMemberAttribute.getStringValueForField("IDDocNo"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredUk")) {
					selectValueFromList(sumInsuredDropDownUk, policyMemberAttribute.getStringValueForField("SumInsuredUk"));
				}
				click(nextButton);
				if (policyMemberAttribute.getBooleanValueForField("ConfigHypertensionUk")) {
					selectValueFromList(hypertensionDropDownList, policyMemberAttribute.getStringValueForField("HypertensionUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDiabetesUk")) {
					selectValueFromList(diabetesDropDownList, policyMemberAttribute.getStringValueForField("DiabetesUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnycriticalillnessUk")) {
					selectValueFromList(anyCriticalIllnessDropDownList, policyMemberAttribute.getStringValueForField("AnycriticalillnessUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnyrecurringillnessUk")) {
					selectValueFromList(anyRecurringIllnessDropDownList, policyMemberAttribute.getStringValueForField("AnyrecurringillnessUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAreyousufferingfromchronicillnessUk")) {
					selectValueFromList(areYouSufferingFromChronicIllnessDropDownList, policyMemberAttribute.getStringValueForField("AreyousufferingfromchronicillnessUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnyPsychiatricandPsychosomaticDisorderUk")) {
					selectValueFromList(anyPsychiatricandPsychosomaticDisorderDropDownList, policyMemberAttribute.getStringValueForField("AnyPsychiatricandPsychosomaticDisorderUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAdverseMedicalHistoryUk")) {
					selectValueFromList(adverseMedicalHistoryDropDownList, policyMemberAttribute.getStringValueForField("AdverseMedicalHistoryUk"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigIsMedicalExaminationdoneUk")) {
					selectValueFromList(isMedicalExaminationDoneDropDownList, policyMemberAttribute.getStringValueForField("IsMedicalExaminationdoneUk"));
				}
			if (policyMemberAttribute.getBooleanValueForField("ConfigrelationforTU")) {
				selectValueFromList(relationforTUDropDownList, policyMemberAttribute.getStringValueForField("RelationforTU"));
			}


			if (policyMemberAttribute.getBooleanValueForField("ConfigthresholdLimit")) {
				selectValueFromList(thresholdLimitDropDownList, policyMemberAttribute.getStringValueForField("ThresholdLimit"));
				//acceptAlertAndReturnConfirmationMessage();

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigtopupSumInsuredTU")) {
				selectValueFromList(topupSumInsuredDropDownList, policyMemberAttribute.getStringValueForField("TopupSumInsuredTU"));
			}
			//HN

			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforPremierMediclaim")) {
				selectValueFromList(relationforPremierMediclaimDropDownList, policyMemberAttribute.getStringValueForField("RelationforPremierMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNatureOfIDforPremierMediclaim")) {
				selectValueFromList(natureOfIDforPremierMediclaimDropDownList, policyMemberAttribute.getStringValueForField("NatureOfIDforPremierMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNoForHN")) {
				clearAndSendKeys(iDDocNoTextFeild, policyMemberAttribute.getStringValueForField("IDDocNoForHN"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightINMeters")) {
				clearAndSendKeys(heightInMetersTextField, policyMemberAttribute.getStringValueForField("HeightINMeters"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightInKg")) {
				clearAndSendKeys(weightINKgTextfield, policyMemberAttribute.getStringValueForField("WeightInKg"));
			}
				
				if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofMedicalexamination")) {
					clearAndSendKeys(detailsofMedicalExaminationTextFeild, policyMemberAttribute.getStringValueForField("DetailsofMedicalexamination"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigCostofPremedicalCheckup")) {
					clearAndSendKeys(costofPremedicalCheckupTextFeild, policyMemberAttribute.getStringValueForField("CostofPremedicalCheckup"));
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigPreexistingDiseaseUk")) {
					selectValueFromList(preExistingDiseaseDropDown, policyMemberAttribute.getStringValueForField("PreexistingDiseaseUk"));
				}
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigrelationforTU")) {
				selectValueFromList(relationforTUDropDownList, policyMemberAttribute.getStringValueForField("RelationforTU"));
			}
			
			
			if (policyMemberAttribute.getBooleanValueForField("ConfigthresholdLimit")) {
				selectValueFromList(thresholdLimitDropDownList, policyMemberAttribute.getStringValueForField("ThresholdLimit"));
				//acceptAlertAndReturnConfirmationMessage();
				
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigtopupSumInsuredTU")) {
				selectValueFromList(topupSumInsuredDropDownList, policyMemberAttribute.getStringValueForField("TopupSumInsuredTU"));
			}
			

			//HN

			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforPremierMediclaim")) {
				selectValueFromList(relationforPremierMediclaimDropDownList, policyMemberAttribute.getStringValueForField("RelationforPremierMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNatureOfIDforPremierMediclaim")) {
				selectValueFromList(natureOfIDforPremierMediclaimDropDownList, policyMemberAttribute.getStringValueForField("NatureOfIDforPremierMediclaim"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNoForHN")) {
				clearAndSendKeys(iDDocNoTextFeild, policyMemberAttribute.getStringValueForField("IDDocNoForHN"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightINMeters")) {
				clearAndSendKeys(heightInMetersTextField, policyMemberAttribute.getStringValueForField("HeightINMeters"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightInKg")) {
				clearAndSendKeys(weightINKgTextfield, policyMemberAttribute.getStringValueForField("WeightInKg"));
			}
		}
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){

			if (policyMemberAttribute.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofMember"), fetchValueFromTextFields(nameOfMemberTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSexofMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SexofMember"), fetchValueFromTextFields(sexOfMemberTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforMediclaimMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationforMediclaimMember"), fetchValueFromList(realtionForMediclaimMemberDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDOBofMember")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DOBofMember")) ,fetchValueFromTextFields(dOBOfMemberTextFeild), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAgeYear")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AgeYear"), fetchValueFromTextFields(ageTextFeild), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationforMediclaimMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OccupationforMediclaimMember"), fetchValueFromList(occupationForMediclaimMemberDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsforOtherOccupation")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsforOtherOccupation"), fetchValueFromFields(detailsforOtherOccupationTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigLoyaltyDiscount")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("LoyaltyDiscount"), fetchValueFromFields(loyaltyDiscountDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHypertension")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Hypertension"), fetchValueFromTextFields(hypertensionDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDiabetes")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Diabetes"), fetchValueFromTextFields(diabetesDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreexistingDiseaseforMediclaimMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PreexistingDiseaseforMediclaimMember"), fetchValueFromList(preExistingDiseaseForMediclaimMemberDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfignatureOfDisease")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NatureOfDisease"), fetchValueFromList(natureOfDiseaseDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameAndAddressOfMedicalAttendantSurgeon")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameAndAddressOfMedicalAttendantSurgeon"), fetchValueFromTextFields(nameAndAddressOfMedicalAttendantSurgeonTextFeild), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateFirstTreatedCompleted")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateFirstTreatedCompleted")), fetchValueFromTextFields(dateFirstTreatedCompletedDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigFirstTreatmentCompleted")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("FirstTreatmentCompleted"), fetchValueFromList(firstTreatmentCompletedDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigwhetherFullyCured")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WhetherFullyCured"), fetchValueFromList(whetherFullyCuredDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightofMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HeightofMember"), fetchValueFromTextFields(heightOfMemberTextFeild), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightofMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WeightofMember"), fetchValueFromTextFields(weightOfMemberTextFeild), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWaistLine")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WaistLine"), fetchValueFromTextFields(waistLineTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyousmokecigarettescigarorpipe")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Doyousmokecigarettescigarorpipe"), fetchValueFromTextFields(doYouSmokeCigarettesCigarOrpipeDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouchewtobacco")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Doyouchewtobacco"), fetchValueFromTextFields(doYouChewTobaccoDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouDrinkAlcohol")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoyouDrinkAlcohol"), fetchValueFromFields(doYouDrinkAlcoholDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHealthClubMembership")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HealthClubMembership"), fetchValueFromFields(healthClubMembershipDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForCX")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredForCX"), fetchValueFromTextFields(sumInsuredForCXDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigIsFamilyDiscountApplicable")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("IsFamilyDiscountApplicable"), fetchValueFromTextFields(isFamilyDiscountApplicableDropDownList), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigClaimRatio")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ClaimRatio"), fetchValueFromFields(claimRatioTextFeild),AssertionType.WARNING);
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigGroupNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("GroupNo"), fetchValueFromTextFields(groupNoTextField),AssertionType.WARNING);
			}
			//JA
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationForJAMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationForJAMember"), fetchValueFromFields(relationForJAMemberDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForJABimaMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OccupationForJABimaMember"), fetchValueFromFields(occupationForJABimaMemberDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsDropDown), AssertionType.WARNING);
			}

			//********************************************** CX *******************************************************
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeName")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AssigneeName"), fetchValueFromTextFields(assigneeNameTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianName")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PhysicianName"), fetchValueFromFields(physicianNameTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCumulativeBonus")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CumulativeBonus"), fetchValueFromFields(cumulativeBonusTextFeild),AssertionType.WARNING);
			}

			//CG-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigFamilyNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("FamilyNo"), fetchValueFromTextFields(familyNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCadreTextArea")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CadreTextArea"), fetchValueFromTextFields(cadreTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMembershipNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MembershipNo"), fetchValueFromTextFields(membershipNo),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCategoryType")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CategoryType"), fetchValueFromList(categoryTypeDropDown),AssertionType.WARNING);
			}

			//BH-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigPassportNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PassportNo"), fetchValueFromTextFields(passportNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateOfIssue")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateOfIssue")), fetchValueFromTextFields(dateOfIssueTextField), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigExpiryDateOfPassport")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ExpiryDateOfPassport")), fetchValueFromTextFields(expiryDateOfPassportTextField), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNationalityForBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NationalityForBH"), fetchValueFromList(nationalityForBHDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigVisaIncomeTaxReturnWorkPermit")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("VisaIncomeTaxReturnWorkPermit"), fetchValueFromTextFields(visaIncomeTaxReturnWorkPermitTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigProposalDateOfDepature")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ProposalDateOfDepature")), fetchValueFromTextFields(proposedDateOfDeparture), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OccupationForMediclaim"), fetchValueFromList(occupationForMediclaimMemberDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOtherOccupationDetail")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OtherOccupationDetail"), fetchValueFromTextFields(otherOccupationDetailTextfield),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNoOfDaysStayOutsideIndia")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NoOfDaysStayOutsideIndia"), fetchValueFromTextFields(noOfDaysStayOutsideIndiaTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianAddress")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PhysicianAddress"), fetchValueFromTextFields(physicianAddressTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameOfAssignee")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameOfAssignee"), fetchValueFromTextFields(nameOfAssigneeTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationOfAssignee")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationOfAssignee"), fetchValueFromTextFields(relationOfAssigneeTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalHistoryReportAttached")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MedicalHistoryReportAttached"), fetchValueFromList(medicalHistoryReportAttachedDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportDate")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MedicalReportDate"), fetchValueFromTextFields(medicalReportDateTextField),AssertionType.WARNING);
			}


			//GT-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationForSGMCMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationForSGMCMember"), fetchValueFromList(relationForSGMCMemberDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForSGMCMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OccupationForSGMCMember"), fetchValueFromList(occupationForSGMCMemberDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredTertiary")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredTertiary"), fetchValueFromList(sumInsuredTertiaryDropDown),AssertionType.WARNING);
			}

			//PZ-@Rasika
			if (policyMemberAttribute.getBooleanValueForField("ConfigDesignationOfPZMembers")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DesignationOfPZMembers"), fetchValueFromTextFields(designationOfPZMembersTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEmployeeID")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("EmployeeID"), fetchValueFromTextFields(employeeIdTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipWithTheAssignee")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationshipWithTheAssignee"), fetchValueFromList(relationshipWithTheAssigneeDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreExistingDisease")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PreExistingDisease"), fetchValueFromList(preExistingDiseaseDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPlanTypeForPZ")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PlanTypeForPZ"), fetchValueFromList(planTypeForPZDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"), fetchValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyPeriod")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyPeriod"), fetchValueFromTextFields(policPeriodTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredForMember"), fetchValueFromList(sumInsuredForMemberDropDown),AssertionType.WARNING);
			}
			//After Click On Button New Window Open
			if (policyMemberAttribute.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ClaimReceivedAndReportedAmount"), fetchValueFromTextFields(claimReceivedAndReportedAmountTextField),AssertionType.WARNING);
			}

			// ES Abhijit

			if (policyMemberAttribute.getBooleanValueForField("ConfigVisaType")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("VisaType"), fetchValueFromTextFields(visaTypeTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCorrespondingAddressIndia")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CorrespondingAddressIndia"), fetchValueFromTextFields(correspondingAddressIndiaTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofNextKin")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofNextKin"), fetchValueFromTextFields(nameofNextKinTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipofNextKin")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationshipofNextKin"), fetchValueFromTextFields(relationshipofNextKinTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofNextKin")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AddressofNextKin"), fetchValueFromTextFields(addressofNextKinTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofNextKin")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("TelephoneNoofNextKin"), fetchValueFromTextFields(telephoneNoofNextKinTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofSponsor")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofSponsor"), fetchValueFromTextFields(nameofSponsorTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationshipofSponsor")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationshipofSponsor"), fetchValueFromTextFields(relationshipofSponsorTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofSponsor")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AddressofSponsor"), fetchValueFromTextFields(addressofSponsorTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofSponsor")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("TelephoneNoofSponsor"), fetchValueFromTextFields(telephoneNoofSponsorTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCountryofVisit")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CountryofVisit"), fetchValueFromTextFields(countryofVisitTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressInCountryofVisit")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("VisaType"), fetchValueFromTextFields(visaTypeTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCorrespondingAddressIndia")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AddressInCountryofVisit"), fetchValueFromTextFields(addressInCountryOfVisitTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofSchoolWorkplace")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofSchoolWorkplace"), fetchValueFromTextFields(nameofSchoolWorkplaceTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofSchoolWorkplace")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AddressofSchoolWorkplace"), fetchValueFromTextFields(addressofSchoolWorkplaceTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTelephoneNoofSchoolWorkplace")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("TelephoneNoofSchoolWorkplace"), fetchValueFromTextFields(telephoneNoOfSchoolWorkplaceTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofNature")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CorrespondingAddressIndia"), fetchValueFromTextFields(correspondingAddressIndiaTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofNextKin")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsofNature"), fetchValueFromTextFields(detailsofNatureOfStudyTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAreYouFreeFromPhysicalDefect")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AreYouFreeFromPhysicalDefect"), fetchValueFromList(areYouFreeFromPhysicalDefectDropdown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianRegistrationNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PhysicianRegistrationNo"), fetchValueFromTextFields(physicianRegistrationNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPhysicianTelephoneNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PhysicianTelephoneNo"), fetchValueFromTextFields(physicianTelephoneNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOtherInformation")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OtherInformation"), fetchValueFromTextFields(otherInformationTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportAttached")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MedicalReportAttached"), fetchValueFromList(medicalReportAttachedDropdown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredinUSD")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredinUSD"), fetchValueFromTextFields(sumInsuredInUSDTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeAddress")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AssigneeAddress"), fetchValueFromTextFields(assigneeAddressTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAssigneeContactNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AssigneeContactNumber"), fetchValueFromTextFields(assigneeContactNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAddressofCountryInVisit")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AddressofCountryInVisit"), fetchValueFromTextFields(addressOfCountryInVisitTextArea),AssertionType.WARNING);
			}
			//FM Abhijit 
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforFMMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationforFMMember"), fetchValueFromList(relationforFMMemberDropDown),AssertionType.WARNING);
			}
			//MC Priyanka
			if (policyMemberAttribute.getBooleanValueForField("ConfigWhetherInsuredIsAdmittedForThePreExistingDisease")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WhetherInsuredIsAdmittedForThePreExistingDisease"), fetchValueFromList(WhetherInsuredIsAdmittedForThePreExistingDiseaseDropDown),AssertionType.WARNING);
			}
			//FM Abhijit 
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForFamilyFloater")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredForFamilyFloater"), fetchValueFromList(sumInsuredForFamilyFloaterDropdown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReport")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MedicalReport"), fetchValueFromList(medicalReportTextArea),AssertionType.WARNING);
			}


			//TG Sachin
			if (policyMemberAttribute.getBooleanValueForField("ConfigName")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Name"), fetchValueFromTextFields(nameTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Sex"), fetchValueFromList(sexDropdown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEmployeeNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("EmployeeNumber"), fetchValueFromTextFields(employeeNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforTailorMadeGroupMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationforTailorMadeGroupMediclaim"), fetchValueFromList(relationforTailorMadeGroupMediclaimDropdown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAmbulanceChargeperFamily")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AmbulanceChargeperFamily"), fetchValueFromTextFields(ambulanceChargeperFamilyTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredforTailorMadePolicies")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredforTailorMadePolicies"), fetchValueFromTextFields(sumInsuredforTailorMadePoliciesTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigTopUpSumInsured")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("TopUpSumInsured"), fetchValueFromTextFields(topUpSumInsuredTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSerialNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SerialNumber"), fetchValueFromTextFields(serialNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHOApprovalNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HOApprovalNo"), fetchValueFromList(hOApprovalNoTextBox),AssertionType.WARNING);
			}

			//RS-Amit
			if (policyMemberAttribute.getBooleanValueForField("ConfigFamilyNoForRS")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("FamilyNoForRS"), fetchValueFromTextFields(familyNoForRSTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigUploadID")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("UploadID"), fetchValueFromTextFields(uploadIDTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYURN")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RSBYURN"), fetchValueFromTextFields(rSBYURNTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYChipNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RSBYChipNo"), fetchValueFromTextFields(rSBYChipNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigEnrollmentFees")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("EnrollmentFees"), fetchValueFromTextFields(enrollmentFeesTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredforRSBY")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredforRSBY"), fetchValueFromTextFields(sumInsuredforRSBYTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRSBYIssueDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("RSBYIssueDate")) ,fetchValueFromTextFields(rSBYIssueDateTextField), AssertionType.WARNING);
			}
			//RS
			if (policyMemberAttribute.getBooleanValueForField("ConfigZoneForMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ZoneForMember"), fetchValueFromTextFields(zoneForMemberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForSeniorCitizenMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredForSeniorCitizenMember"), fetchValueFromList(sumInsuredForSeniorCitizenMemberDropdownList),AssertionType.WARNING);
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforPremierMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationforPremierMediclaim"), fetchValueFromList(relationforPremierMediclaimDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNatureOfIDforPremierMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NatureOfIDforPremierMediclaim"), fetchValueFromList(natureOfIDforPremierMediclaimDropDownList),AssertionType.WARNING);
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNoForHN")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("IDDocNoForHN"), fetchValueFromTextFields(iDDocNoTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightINMeters")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HeightINMeters"), fetchValueFromTextFields(heightInMetersTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightInKg")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WeightInKg"), fetchValueFromTextFields(weightINKgTextfield),AssertionType.WARNING);
			}
			
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforPremierMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationforPremierMediclaim"), fetchValueFromList(relationforPremierMediclaimDropDownList),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNatureOfIDforPremierMediclaim")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NatureOfIDforPremierMediclaim"), fetchValueFromList(natureOfIDforPremierMediclaimDropDownList),AssertionType.WARNING);
			}
			
			if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNoForHN")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("IDDocNoForHN"), fetchValueFromTextFields(iDDocNoTextFeild),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightINMeters")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HeightINMeters"), fetchValueFromTextFields(heightInMetersTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightInKg")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WeightInKg"), fetchValueFromTextFields(weightINKgTextfield),AssertionType.WARNING);
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("UK")) {
				if (policyMemberAttribute.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyinthePastUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WhetherYouHadAHealthPolicyinthePastUk"), fetchValueFromTextFields(whetherYouHadAHealthPolicyinthePastUk),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDateofinceptionofFirstPolicyUk")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateofinceptionofFirstPolicyUk")),
							fetchValueFromTextFields(dateofinceptionofFirstPolicyUk), AssertionType.WARNING);
				}
				click(nextButton);
				if (policyMemberAttribute.getBooleanValueForField("ConfigSex")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Sex"), fetchValueFromTextFields(sexDropdown),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigRelationofTheMember")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationofTheMember"), fetchValueFromTextFields(relationOfTheMemberUk),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigOptionalCoverIIMaternityExpBenefitUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OptionalCoverIIMaternityExpBenefitUk"), fetchValueFromTextFields(optionalCoverIIMaternityExpBenefitUk),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDateofinceptionofOptionalCoverIIUk")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateofinceptionofOptionalCoverIIUk")),
							fetchValueFromTextFields(dateofinceptionofOptionalCoverIIUk), AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigNatureofID")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NatureofID"), fetchValueFromTextFields(natureOfIdUk),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigIDDocNo")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("IDDocNo"), fetchValueFromTextFields(iDDocNoTextFeild),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredUk"), fetchValueFromTextFields(sumInsuredDropDownUk),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAgeInYearsUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AgeInYearsUk"), fetchValueFromTextFields(ageInYearsUk),AssertionType.WARNING);
				}
				click(nextButton);
				if (policyMemberAttribute.getBooleanValueForField("ConfigHypertensionUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HypertensionUk"), fetchValueFromTextFields(hypertensionDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigDiabetesUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DiabetesUk"), fetchValueFromTextFields(diabetesDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnycriticalillnessUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AnycriticalillnessUk"), fetchValueFromTextFields(anyCriticalIllnessDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnyrecurringillnessUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AnyrecurringillnessUk"), fetchValueFromTextFields(anyRecurringIllnessDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAreyousufferingfromchronicillnessUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AreyousufferingfromchronicillnessUk"), fetchValueFromTextFields(areYouSufferingFromChronicIllnessDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAnyPsychiatricandPsychosomaticDisorderUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AnyPsychiatricandPsychosomaticDisorderUk"), fetchValueFromTextFields(anyPsychiatricandPsychosomaticDisorderDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigAdverseMedicalHistoryUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AdverseMedicalHistoryUk"), fetchValueFromTextFields(adverseMedicalHistoryDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigIsMedicalExaminationdoneUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("IsMedicalExaminationdoneUk"), fetchValueFromTextFields(isMedicalExaminationDoneDropDownList),AssertionType.WARNING);
				}
				
				if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofMedicalexamination")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsofMedicalexamination"), fetchValueFromTextFields(detailsofMedicalExaminationTextFeild),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigCostofPremedicalCheckup")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CostofPremedicalCheckup"), fetchValueFromTextFields(costofPremedicalCheckupTextFeild),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigPreexistingDiseaseUk")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PreexistingDiseaseUk"), fetchValueFromTextFields(preExistingDiseaseDropDown),AssertionType.WARNING);
				}
			}
				if (policyMemberAttribute.getBooleanValueForField("ConfigthresholdLimit")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ThresholdLimit"), fetchValueFromList(thresholdLimitDropDownList),AssertionType.WARNING);
				}
				if (policyMemberAttribute.getBooleanValueForField("ConfigtopupSumInsuredTU")) {
					assertReference.assertEquals(policyMemberAttribute.getStringValueForField("TopupSumInsuredTU"), fetchValueFromList(topupSumInsuredDropDownList),AssertionType.WARNING);
				}
				
			
		}
	}

	public void fillPolicyMemberInsuredMemberDetailBH(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightOfMemberBH")) {
				clearAndSendKeys(heightOfMemberTextField, policyMemberAttribute.getStringValueForField("HeightOfMemberBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightOfMemberBH")) {
				clearAndSendKeys(weightOfMemberTextfield, policyMemberAttribute.getStringValueForField("WeightOfMemberBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWaistLineInInches")) {
				clearAndSendKeys(waistLineInInchesTextField, policyMemberAttribute.getStringValueForField("WaistLineInInches"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouChewTobaccoBH")) {
				selectValueFromList(doYouChewTobaccoDropDown, policyMemberAttribute.getStringValueForField("DoYouChewTobaccoBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouDrinkAlcoholBH")) {
				selectValueFromList(doYouDrinkAlcoholDropDown, policyMemberAttribute.getStringValueForField("DoYouDrinkAlcoholBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarOrPipeBH")) {
				selectValueFromList(doYouSmokeCigarettesCigarOrPipeDropDown, policyMemberAttribute.getStringValueForField("DoYouSmokeCigarettesCigarOrPipeBH"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreExistingDieseaseForMediclaimMember")) {
				selectValueFromList(preExistingDiseaseForMediclaimMemberDropDown, policyMemberAttribute.getStringValueForField("PreExistingDieseaseForMediclaimMember"));
			}
			//After click On Button New Window Open

			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsOfPreExistingDieseasesButton")) {
				fillDetailsOfPreExistingDiseases(policyMemberAttribute,assertReference);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredInUSDBH")) {
				clearAndSendKeys(sumInsuredInUSDTextField, policyMemberAttribute.getStringValueForField("SumInsuredInUSDBH"));
			}

			//After Endorse Alteration  
			if (policyMemberAttribute.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				selectValueFromList(goodHealthDeclarationDropDown, policyMemberAttribute.getStringValueForField("GoodHealthDeclaration"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigListOfDiseases")) {
				selectValueFromList(listOfDiseasesDropDown, policyMemberAttribute.getStringValueForField("ListOfDiseases"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsOfOtherDiseases")) {
				clearAndSendKeys(detailsOfOtherDiseasesTextArea, policyMemberAttribute.getStringValueForField("DetailsOfOtherDiseases"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPassportDetailsVerified")) {
				selectValueFromList(passportDeatilsVerifiedDropDown, policyMemberAttribute.getStringValueForField("PassportDetailsVerified"));
			}
			click(nextButton);
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(insuredMemberDetailBHTitlePage);
		}
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){

			if (policyMemberAttribute.getBooleanValueForField("ConfigHeightOfMemberBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HeightOfMemberBH"), fetchValueFromTextFields(heightOfMemberTextField), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWeightOfMemberBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WeightOfMemberBH"), fetchValueFromTextFields(weightOfMemberTextfield), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigWaistLineInInches")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("WaistLineInInches"), fetchValueFromTextFields(waistLineInInchesTextField), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouChewTobaccoBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoYouChewTobaccoBH"), fetchValueFromList(doYouChewTobaccoDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouDrinkAlcoholBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoYouDrinkAlcoholBH"), fetchValueFromList(doYouDrinkAlcoholDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarOrPipeBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoYouSmokeCigarettesCigarOrPipeBH"), fetchValueFromList(doYouSmokeCigarettesCigarOrPipeDropDown), AssertionType.WARNING);
			}

			if (policyMemberAttribute.getBooleanValueForField("ConfigPreExistingDieseaseForMediclaimMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PreExistingDieseaseForMediclaimMember"), fetchValueFromList(preExistingDiseaseForMediclaimMemberDropDown), AssertionType.WARNING);
			}

			//After click On Button New Window Open

			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsOfPreExistingDieseasesButton")) {
				fillDetailsOfPreExistingDiseases(policyMemberAttribute,assertReference);
			}

			/*if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsOfPreExistingDieseasesButton")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsOfPreExistingDieseasesButton"), fetchValueFromTextFields(detailsOfPreExistingDiseasesButton), AssertionType.WARNING);
			}*/
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredInUSDBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredInUSDBH"), fetchValueFromTextFields(sumInsuredInUSDTextField), AssertionType.WARNING);
			}
			//After Endorse Alteration  
			if (policyMemberAttribute.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("GoodHealthDeclaration"), fetchValueFromList(goodHealthDeclarationDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigListOfDiseases")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ListOfDiseases"), fetchValueFromList(listOfDiseasesDropDown), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsOfOtherDiseases")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsOfOtherDiseases"), fetchValueFromTextFields(detailsOfOtherDiseasesTextArea), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPassportDetailsVerified")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PassportDetailsVerified"), fetchValueFromList(passportDeatilsVerifiedDropDown), AssertionType.WARNING);
			}

			if(policyMemberAttribute.getBooleanValueForField("ConfigSaveBH")){
				click(saveButton);
				switchToFrame("display");
				isElementDisplayed(insuredMemberDetailBHTitlePage);
			}
			else
				switchToFrame("display");
		}

	}	

	//Priyanka
	public void fillPolicyInsuredInterestIMJourneyDetailsPZ(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigPlaceOfVisit")) {
				selectValueFromList(placeOfVisitDropDown, policyMemberAttribute.getStringValueForField("PlaceOfVisit"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateOfCommencementOfJourney")) {
				String DateOfCommencement=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateOfCommencementOfJourney"));
				clearAndEnterDate(dateOfCommencementOfJourneyTextfield, DateOfCommencement);
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigExpectedDateOfReturn")) {
				String ExpectedDate=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ExpectedDateOfReturn"));
				clearAndEnterDate(expectedDateOfReturnTextField, ExpectedDate);
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigActualDateOfReturn")) {
				String ActualDate=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ActualDateOfReturn"));
				clearAndEnterDate(actualDateOfReturnTextField, ActualDate);
			}
			switchToFrame("display");
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredInUSDPZ")) {
				//clearAndSendKeys(sumInsuredInUSDPZTextField, policyMemberAttribute.getStringValueForField("SumInsuredInUSDPZ"));
			}
			click(nextButton);
			if(policyMemberAttribute.getBooleanValueForField("ConfigEndorsePZ")){
				fillPolicyInsuredInterestCertificateDocumentPZ(policyMemberAttribute, assertReference);
			}
			if(!(policyMemberAttribute.getBooleanValueForField("ConfigSkipNext"))){
				click(nextButton);
				/*if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("PZ"))
				{
					click(nextButton);
				}*/
			}
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(iMJourneyDetailsPZTitlePage);
		}
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPlaceOfVisit")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PlaceOfVisit"), fetchValueFromList(placeOfVisitDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDateOfCommencementOfJourney")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("DateOfCommencementOfJourney")), fetchValueFromTextFields(dateOfCommencementOfJourneyTextfield),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigExpectedDateOfReturn")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ExpectedDateOfReturn")), fetchValueFromTextFields(expectedDateOfReturnTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigActualDateOfReturn")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("ActualDateOfReturn")), fetchValueFromTextFields(actualDateOfReturnTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredInUSD")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredInUSD"), fetchValueFromFields(sumInsuredInUSDPZTextField),AssertionType.WARNING);
			}
			if(!(policyMemberAttribute.getBooleanValueForField("ConfigSkipNext")||(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("PZ")))){
				click(saveButton);
			}
			switchToFrame("display");
		}
	}

	public void fillPolicyInsuredInterestCertificateDocumentPZ(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigCertificateNo")) {
				clearAndSendKeys(certificateNoTextField, policyMemberAttribute.getStringValueForField("CertificateNo"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDocumentNumber")) {
				clearAndSendKeys(documentNumberTextField, policyMemberAttribute.getStringValueForField("DocumentNumber"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDeclarationNumber")) {
				clearAndSendKeys(declarationNumberTextField, policyMemberAttribute.getStringValueForField("DeclarationNumber"));
			}
			click(saveButton);
			switchToFrame("display");
		}

		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCertificateNo")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CertificateNo"), fetchValueFromTextFields(certificateNoTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDocumentNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DocumentNumber"), fetchValueFromTextFields(documentNumberTextField),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDeclarationNumber")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DeclarationNumber"), fetchValueFromTextFields(declarationNumberTextField),AssertionType.WARNING);
			}
			click(saveButton);
			switchToFrame("display");
		}
	}

	//Parameter List for Details of Pre Existing Diseases
	public void clickOnOpenButton(PolicyMemberAttributeEntity policyMemberAttributeEntity) throws InterruptedException{
		if (policyMemberAttributeEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			switchToWindow("'Details of Pre Existing Diseases' Details");
		}
	}

	public void fillDetailsOfPreExistingDiseases(PolicyMemberAttributeEntity policyMemberAttribute,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(policyMemberAttribute);
		if(!policyMemberAttribute.getAction().equalsIgnoreCase("verify")){
			click(addWindowButton);
		}
		fillDiseasesSufferedOrSufferingDetailsBH(policyMemberAttribute, assertReference);
	}
	//Table - Parameter List for Installment Percentage List
	public void fillDiseasesSufferedOrSufferingDetailsBH(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){

			if(policyMemberAttribute.getBooleanValueForField("ConfigDiseaseSufferedOrSuffering")){
				clearAndSendKeys(diseaseSufferedOrSufferingTextArea,policyMemberAttribute.getStringValueForField("DiseaseSufferedOrSuffering") );	
			}
			if(policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportBH")){
				clearAndSendKeys(medicalReportBHTextArea,policyMemberAttribute.getStringValueForField("MedicalReportBH") );	
			}
		}	
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){	

			if (policyMemberAttribute.getBooleanValueForField("ConfigDiseaseSufferedOrSuffering")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DiseaseSufferedOrSuffering"), fetchValueFromTextFields(diseaseSufferedOrSufferingTextArea),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigMedicalReportBH")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MedicalReportBH"), fetchValueFromTextFields(medicalReportBHTextArea),AssertionType.WARNING);
			}
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigSaveWindowButton")){	
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			isElementDisplayed(insuredMemberDetailBHTitlePage);
		}
	}


	// Pending To check In policy Member Attribute page PolicycoPaymentCumulativeBonus

	public void nextButtonPolicyMemberAttributehealth(PolicyMemberAttributeEntity policyMemberAttributeEntity) throws InterruptedException{
		if(policyMemberAttributeEntity.getAction().equalsIgnoreCase("add") || policyMemberAttributeEntity.getAction().equalsIgnoreCase("edit")||policyMemberAttributeEntity.getAction().equalsIgnoreCase("verify")){
          if (policyMemberAttributeEntity.getBooleanValueForField("ConfigNextButton")){		
			if(!(policyMemberAttributeEntity.getRowNumber()==2)) {
				click(nextButton);
			}
			switchToFrame("display");
		}
	}
		//policyMemberAttributeHealthDetailsTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+policyMemberAttributeEntity.getStringValueForField("PolicyMemberAttributeTitle")+"')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*isElementDisplayed(policyMemberAttributeHealthDetailsTitle);*/

		//For BH Product---> To handle medical history report window
		if(policyMemberAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("BH")){ 
			if(policyMemberAttributeEntity.getBooleanValueForField("ConfigMedicalHistoryWindow")){
				switchToWindow("Message Window");
				click(closeWinodwButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
		if(policyMemberAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("SC")){ 
			if(policyMemberAttributeEntity.getBooleanValueForField("ConfigMedicalHistoryWindow")){
				switchAndCloseWindow();
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}



	}
	public void submitPolicyMemberAttribute(PolicyMemberAttributeEntity policyMemberAttributeEntity) throws InterruptedException {
		if (policyMemberAttributeEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
		//ES Abhijit
		else if (policyMemberAttributeEntity.getBooleanValueForField("ConfigForwardAndSave")) {
			if(policyMemberAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("JA")||(policyMemberAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("GJ"))|| policyMemberAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("SU")){
				click(nextButton);
			}
			click(nextButton);
			Thread.sleep(2000);
			click(saveButton);
			switchToFrame("display");
		}		
	}

	public void backFrompolicyMemberAttribute(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) {
		if (policyMemberAttribute.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	// FM Abhijit
	public void fillPreviousPolicyDetails(PolicyMemberAttributeEntity policyMemberAttributeEntity) throws InterruptedException{	
		click(previousPolicyDetailsOpenButton);
		switchToWindow("'Previous Policy Details with NIA' Details");
		click(addButton);

		if(policyMemberAttributeEntity.getBooleanValueForField("ConfigPreviousPolicyNoWithNIA")){
			clearAndSendKeys(previousPolicyNoWithNIATextField, policyMemberAttributeEntity.getStringValueForField("PreviousPolicyNoWithNIA"));
		}
		if(policyMemberAttributeEntity.getBooleanValueForField("ConfigSumInsuredPreviousPolicy")){
			clearAndSendKeys(sumInsuredPreviousPolicyTextField, policyMemberAttributeEntity.getStringValueForField("SumInsuredPreviousPolicy"));
		}
		if(policyMemberAttributeEntity.getBooleanValueForField("ConfigFromDate")){
			clearAndSendKeys(fromDateTextField, policyMemberAttributeEntity.getStringValueForField("FromDate"));
		}
		if(policyMemberAttributeEntity.getBooleanValueForField("ConfigToDate")){
			clearAndSendKeys(ToDateTextField, policyMemberAttributeEntity.getStringValueForField("ToDate"));
		}
		if(policyMemberAttributeEntity.getBooleanValueForField("ConfigPreExistingDiseasesInPreviousPolicy")){
			clearAndSendKeys(preexistingDiseasesInPreviousPolicyTextField, policyMemberAttributeEntity.getStringValueForField("PreExistingDiseasesInPreviousPolicy"));
		}
		click(saveButton);
		click(closeButton);
		switchToWindow();
		switchToFrame("display");
	}

	public void fillMemberAttributes(PolicyMemberAttributeEntity policyMemberAttribute) throws InterruptedException{

		if (policyMemberAttribute.getBooleanValueForField("ConfigHeightofMember")) {
			clearAndSendKeys(heightOfMemberTextFeild, policyMemberAttribute.getStringValueForField("HeightofMember"));
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigWeightofMember")) {
			clearAndSendKeys(weightOfMemberTextFeild, policyMemberAttribute.getStringValueForField("WeightofMember"));
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigDoyousmokecigarettescigarorpipe")) {
			selectValueFromList(doYouSmokeCigarettesCigarOrpipeDropDownList, policyMemberAttribute.getStringValueForField("Doyousmokecigarettescigarorpipe"));
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouchewtobacco")) {
			selectValueFromList(doYouChewTobaccoDropDownList, policyMemberAttribute.getStringValueForField("Doyouchewtobacco"));
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouDrinkAlcohol")) {
			selectValueFromList(doYouDrinkAlcoholDropDownList, policyMemberAttribute.getStringValueForField("DoyouDrinkAlcohol"));
		}
		if (policyMemberAttribute.getBooleanValueForField("ConfigPreexistingDiseaseforMediclaimMember")) {
			selectValueFromList(preExistingDiseaseForMediclaimMemberDropDownList, policyMemberAttribute.getStringValueForField("PreexistingDiseaseforMediclaimMember"));
		}

	}

	public void fillPolicyInsuredInterestIMJourneyDetailsSU(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigSexForSU")) {
				selectValueFromList(sexForSUDropDown, policyMemberAttribute.getStringValueForField("SexForSU"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationOfParivarSuraksha")) {
				selectValueFromList(relationOfParivarSurakshaForSUDropDown, policyMemberAttribute.getStringValueForField("RelationOfParivarSuraksha"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForMediclaimMemberForSU")) {
				selectValueFromList(occupationForMediclaimMemberForSUDropDown, policyMemberAttribute.getStringValueForField("OccupationForMediclaimMemberForSU"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredParivarSurakshaForSU")) {
				selectValueFromList(sumInsuredParivarSurakshaForSUDropDown, policyMemberAttribute.getStringValueForField("SumInsuredParivarSurakshaForSU"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigBranchMasterForSU")) {
				selectValueFromList(branchMasterForSUDropDown, policyMemberAttribute.getStringValueForField("BranchMasterForSU"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyReferenceNumberOfMasterPolicy")) {
				clearAndSendKeys(policyReferenceNumberOfMasterPolicyTextFeild, policyMemberAttribute.getStringValueForField("PolicyReferenceNumberOfMasterPolicy"));
			}
		}
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){	
			if (policyMemberAttribute.getBooleanValueForField("ConfigSexForSU")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SexForSU"), fetchValueFromList(sexForSUDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationOfParivarSuraksha")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("RelationOfParivarSuraksha"), fetchValueFromList(relationOfParivarSurakshaForSUDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationForMediclaimMember")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("OccupationForMediclaimMember"), fetchValueFromList(occupationForMediclaimMemberForSUDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredParivarSurakshaForSU")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredParivarSurakshaForSU"), fetchValueFromList(sumInsuredParivarSurakshaForSUDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigBranchMasterForSU")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("BranchMasterForSU"), fetchValueFromList(branchMasterForSUDropDown),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyReferenceNumberOfMasterPolicy")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyReferenceNumberOfMasterPolicy"), fetchValueFromTextFields(policyReferenceNumberOfMasterPolicyTextFeild),AssertionType.WARNING);
			}
		}
	}
	
	public void fillPolicyInsuredInterestforIC(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberAttribute.getAction().equalsIgnoreCase("add") || policyMemberAttribute.getAction().equalsIgnoreCase("edit")){
			if (policyMemberAttribute.getBooleanValueForField("ConfigZoneForICAIMemberTextAreaForIC")) {
				clearAndSendKeys(ZoneForICAIMemberTextAreaForIC, policyMemberAttribute.getStringValueForField("ZoneForICAIMemberTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforICAIMemberDropDownForIC")) {
				selectValueFromList(RelationforICAIMemberDropDownForIC, policyMemberAttribute.getStringValueForField("RelationforICAIMemberDropDownForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationforICAIMemberDropDownForIC")) {
				selectValueFromList(OccupationforICAIMemberDropDownForIC, policyMemberAttribute.getStringValueForField("OccupationforICAIMemberDropDownForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForICAIFamilyFloaterFieldForIC")) {
				clearAndSendKeys(SumInsuredForICAIFamilyFloaterFieldForIC, policyMemberAttribute.getStringValueForField("SumInsuredForICAIFamilyFloaterFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPremiumTextAreaForIC")) {
				clearAndSendKeys(PremiumTextAreaForIC, policyMemberAttribute.getStringValueForField("PremiumTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerOneFieldForIC")) {
				clearAndSendKeys(PolicyNumberofpreviousinsurer1FieldForIC, policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerOneFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyOneTextAreaForIC")) {
				clearAndSendKeys(Nameofthepreviousinsurancecompany1TextAreaForIC, policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyOneTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateOneForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateOneForIC"));
				clearAndEnterDate(PreviousPolicyStartDate1ForIC, DOBofMember);
				
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDateOneForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateOneForIC"));
				clearAndEnterDate(PreviousPolicyExpiryDate1ForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyOneFieldForIC")) {
				clearAndSendKeys(SumInsuredunderexpiringPolicy1FieldForIC, policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyOneFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerTwoFieldForIC")) {
				clearAndSendKeys(PolicyNumberofpreviousinsurer2FieldForIC, policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerTwoFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyTwoTextAreaForIC")) {
				clearAndSendKeys(Nameofthepreviousinsurancecompany2TextAreaForIC, policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyTwoTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateTwoForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateTwoForIC"));
				clearAndEnterDate(PreviousPolicyStartDate2ForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDateTwoForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateTwoForIC"));
				clearAndEnterDate(PreviousPolicyExpiryDate2ForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyTwoFieldForIC")) {
				clearAndSendKeys(SumInsuredunderexpiringPolicy2FieldForIC, policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyTwoFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerThreeFieldForIC")) {
				clearAndSendKeys(PolicyNumberofpreviousinsurer3FieldForIC, policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerThreeFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyThreeTextAreaForIC")) {
				clearAndSendKeys(Nameofthepreviousinsurancecompany3TextAreaForIC, policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyThreeTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateThreeForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateThreeForIC"));
				clearAndEnterDate(PreviousPolicyStartDate3ForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDateThreeForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateThreeForIC"));
				clearAndEnterDate(PreviousPolicyExpiryDate3ForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyThreeFieldForIC")) {
				clearAndSendKeys(SumInsuredunderexpiringPolicy3FieldForIC, policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyThreeFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCumulativebonusunderexpiringpolicyFieldForIC")) {
				clearAndSendKeys(CumulativebonusunderexpiringpolicyFieldForIC, policyMemberAttribute.getStringValueForField("CumulativebonusunderexpiringpolicyFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofthePreexistingdiseasesTextAreaForIC")) {
				clearAndSendKeys(DetailsofthePreexistingdiseasesTextAreaForIC, policyMemberAttribute.getStringValueForField("DetailsofthePreexistingdiseasesTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC")) {
				clearAndSendKeys(HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC, policyMemberAttribute.getStringValueForField("HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouhaveanyotherpolicyinforceDropDownForIC")) {
				selectValueFromList(DoyouhaveanyotherpolicyinforceDropDownForIC, policyMemberAttribute.getStringValueForField("DoyouhaveanyotherpolicyinforceDropDownForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberoftheOtherPolicyFieldForIC")) {
				clearAndSendKeys(PolicyNumberoftheOtherPolicyFieldForIC, policyMemberAttribute.getStringValueForField("PolicyNumberoftheOtherPolicyFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsurerNameoftheOtherpolicyTextAreaForIC")) {
				clearAndSendKeys(InsurerNameoftheOtherpolicyTextAreaForIC, policyMemberAttribute.getStringValueForField("InsurerNameoftheOtherpolicyTextAreaForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyStartDateoftheOtherPolicyFieldForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PolicyStartDateoftheOtherPolicyFieldForIC"));
				clearAndEnterDate(PolicyStartDateoftheOtherPolicyFieldForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyExpiryDateoftheOtherPolicyFieldForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PolicyExpiryDateoftheOtherPolicyFieldForIC"));
				clearAndEnterDate(PolicyExpiryDateoftheOtherPolicyFieldForIC, DOBofMember);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSuminsuredoftheotherpolicyFieldForIC")) {
				clearAndSendKeys(SuminsuredoftheotherpolicyFieldForIC, policyMemberAttribute.getStringValueForField("SuminsuredoftheotherpolicyFieldForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNextButtonForIC")) {
				click(forwordButton);
				switchToFrame("display");
			}
		
			
		}
		else if(policyMemberAttribute.getAction().equalsIgnoreCase("verify")){	
			if (policyMemberAttribute.getBooleanValueForField("ConfigZoneForICAIMemberTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("ZoneForICAIMemberTextAreaForIC"), fetchValueFromTextFields(ZoneForICAIMemberTextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigRelationforICAIMemberDropDownForIC")) {
				selectValueFromList(RelationforICAIMemberDropDownForIC, policyMemberAttribute.getStringValueForField("RelationforICAIMemberDropDownForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigOccupationforICAIMemberDropDownForIC")) {
				selectValueFromList(OccupationforICAIMemberDropDownForIC, policyMemberAttribute.getStringValueForField("OccupationforICAIMemberDropDownForIC"));
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredForICAIFamilyFloaterFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredForICAIFamilyFloaterFieldForIC"), fetchValueFromTextFields(SumInsuredForICAIFamilyFloaterFieldForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPremiumTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PremiumTextAreaForIC"), fetchValueFromTextFields(PremiumTextAreaForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerOneFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerOneFieldForIC"), fetchValueFromTextFields(PolicyNumberofpreviousinsurer1FieldForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyOneTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyOneTextAreaForIC"), fetchValueFromTextFields(Nameofthepreviousinsurancecompany1TextAreaForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateOneForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateOneForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyStartDate1ForIC),AssertionType.WARNING);				
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDate1ForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateOneForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyExpiryDate1ForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyOneFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyOneFieldForIC"), fetchValueFromTextFields(SumInsuredunderexpiringPolicy1FieldForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerTwoFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerTwoFieldForIC"), fetchValueFromTextFields(PolicyNumberofpreviousinsurer2FieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyTwoTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyTwoTextAreaForIC"), fetchValueFromTextFields(Nameofthepreviousinsurancecompany2TextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateTwoForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateTwoForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyStartDate2ForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDateTwoForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateTwoForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyExpiryDate2ForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyTwoFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyTwoFieldForIC"), fetchValueFromTextFields(SumInsuredunderexpiringPolicy2FieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberofpreviousinsurerThreeFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNumberofpreviousinsurerThreeFieldForIC"), fetchValueFromTextFields(PolicyNumberofpreviousinsurer3FieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofthepreviousinsurancecompanyThreeTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofthepreviousinsurancecompanyThreeTextAreaForIC"), fetchValueFromTextFields(Nameofthepreviousinsurancecompany3TextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyStartDateThreeForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyStartDateThreeForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyStartDate3ForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPreviousPolicyExpiryDateThreeForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PreviousPolicyExpiryDateThreeForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PreviousPolicyExpiryDate3ForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSumInsuredunderexpiringPolicyThreeFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SumInsuredunderexpiringPolicyThreeFieldForIC"), fetchValueFromTextFields(SumInsuredunderexpiringPolicy3FieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigCumulativebonusunderexpiringpolicyFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("CumulativebonusunderexpiringpolicyFieldForIC"), fetchValueFromTextFields(CumulativebonusunderexpiringpolicyFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDetailsofthePreexistingdiseasesTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DetailsofthePreexistingdiseasesTextAreaForIC"), fetchValueFromTextFields(DetailsofthePreexistingdiseasesTextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigHowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC"), fetchValueFromTextFields(HowmanyyearsyouarecoveredundertheHealthpolicyinthePastFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDoyouhaveanyotherpolicyinforceDropDownForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DoyouhaveanyotherpolicyinforceDropDownForIC"), fetchValueFromList(DoyouhaveanyotherpolicyinforceDropDownForIC),AssertionType.WARNING);

			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyNumberoftheOtherPolicyFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("PolicyNumberoftheOtherPolicyFieldForIC"), fetchValueFromTextFields(PolicyNumberoftheOtherPolicyFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigInsurerNameoftheOtherpolicyTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("InsurerNameoftheOtherpolicyTextAreaForIC"), fetchValueFromTextFields(InsurerNameoftheOtherpolicyTextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyStartDateoftheOtherPolicyFieldForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PolicyStartDateoftheOtherPolicyFieldForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PolicyStartDateoftheOtherPolicyFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigPolicyExpiryDateoftheOtherPolicyFieldForIC")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(policyMemberAttribute.getStringValueForField("PolicyExpiryDateoftheOtherPolicyFieldForIC"));
				assertReference.assertEquals(DOBofMember, fetchValueFromTextFields(PolicyExpiryDateoftheOtherPolicyFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSuminsuredoftheotherpolicyFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SuminsuredoftheotherpolicyFieldForIC"), fetchValueFromTextFields(SuminsuredoftheotherpolicyFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigNameofMemberTextAreaForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("NameofMemberTextAreaForIC"), fetchValueFromTextFields(NameofMemberTextAreaForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigSexofMemberTextFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("SexofMemberTextFieldForIC"), fetchValueFromTextFields(SexofMemberTextFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigDOBofMemberTextFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("DOBofMemberTextFieldForIC"), fetchValueFromTextFields(DOBofMemberTextFieldForIC),AssertionType.WARNING);
			}
			if (policyMemberAttribute.getBooleanValueForField("ConfigAgeYearTextFieldForIC")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("AgeYearTextFieldForIC"), fetchValueFromTextFields(AgeYearTextFieldForIC),AssertionType.WARNING);
			}
		}
		
	}

	
	public void fillandSubmitPolicyMemberAttribute(PolicyMemberAttributeEntity policyMemberAttribute, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyMemberAttribute.getConfigExecute())){
			switchToFrame("display");
			fillpolicyMemberAttributeDetails(policyMemberAttribute, assertReference);
			nextButtonPolicyMemberAttributehealth(policyMemberAttribute);
			fillpolicyMemberAttributeNextGroupDetails(policyMemberAttribute,assertReference);
			fillpolicyMemberAttributeGroupNumberDetails(policyMemberAttribute,assertReference);
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("BH"))
			{
				fillPolicyMemberInsuredMemberDetailBH(policyMemberAttribute, assertReference);
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("ES"))
			{
				fillMemberAttributes(policyMemberAttribute);
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("PZ"))
			{
				fillPolicyInsuredInterestIMJourneyDetailsPZ(policyMemberAttribute, assertReference);
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("SU"))
			{
				fillPolicyInsuredInterestIMJourneyDetailsSU(policyMemberAttribute, assertReference);
			}
			if(policyMemberAttribute.getStringValueForField("Product").equalsIgnoreCase("IC"))
			{
				fillPolicyInsuredInterestforIC(policyMemberAttribute, assertReference);
			}
			submitPolicyMemberAttribute(policyMemberAttribute);
			navigateToPolicyTab(policyMemberAttribute);
			navigateToAttributeTab(policyMemberAttribute);
			navigateToMemberTab(policyMemberAttribute);
			navigateToInsuredIntersetTab(policyMemberAttribute);
			navigateToCoverageTab(policyMemberAttribute);
			navigateToLoanTab(policyMemberAttribute);
			navigateToClientDetailsTab(policyMemberAttribute);
			navigateToRelationsTab(policyMemberAttribute);
			navigateToPaymentsTab(policyMemberAttribute);
			navigateToFollowupTab(policyMemberAttribute);
			navigateToDocumentTab(policyMemberAttribute);
			navigateToDetailTab(policyMemberAttribute);
			navigateToMemberAttributesTab(policyMemberAttribute);
			navigateToAttachCoverageTab(policyMemberAttribute);
			navigateToRelations1Tab(policyMemberAttribute);
			navigateToPayments1Tab(policyMemberAttribute);
		}
	}	
}


