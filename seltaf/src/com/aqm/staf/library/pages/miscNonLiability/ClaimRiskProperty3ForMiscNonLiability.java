package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ByIdOrName;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProp3MNLEntity;

public class ClaimRiskProperty3ForMiscNonLiability extends BasePage{

	private PageElement claimRiskProperty2Title;
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	//FS
	private PageElement isTerrorismCoverRequiredDropDown;
	private PageElement sumInsuredForTerrorismTextField;
	private PageElement assessedLossAmountOfTerrorismCoverTextField;
	private PageElement claimAmountOfTerrorismCoverTextField;
	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement previousButton;
	private PageElement backButton;
	//OS
	private PageElement isSection8BIncreasedCostOfWorkingRequiredDropDown;
	private PageElement sumInsuredForSection8BTextField;
	private PageElement assessedLossAmountOfSection8BTextField;
	private PageElement claimAmountOfSection8BTextField;
	private PageElement isSection9PortableEquipmentRequiredDropDown;
	private PageElement totalSumInsuredTextField;
	private PageElement assessedLossAmountOfSection9TextField;
	private PageElement claimAmountOfSection9TextField;
	private PageElement isSection10AdditionalExpensesOfRentRequiredDropDown;
	private PageElement sumInsuredForSection10TextField;
	private PageElement assessedLossAmountOfSection10TextField;
	private PageElement claimAmountOfSection10TextField;
	private PageElement isSection11PersonalAccidentRequiredDropDown;
	private PageElement capitalSumInsuredTextField;
	private PageElement assessedLossAmountOfSection11TextField;
	private PageElement claimAmountOfSection11TextField;
	private PageElement isSection12BreakDownOfOfficeApplianceRequiredDropDown;
	private PageElement sumInsuredForSection12TextField;
	private PageElement assessedLossAmountOfSection12TextField;
	private PageElement claimAmountOfSection12TextField;
	private PageElement isSection13BaggageRequiredDropDown;
	private PageElement totalBaggageSumInsuredTextField;
	private PageElement assessedLossAmountOfSection13TextField;
	private PageElement claimAmountOfSection13TextField;
	private PageElement isSection14APublicLiabilityInsuranceRequiredDropDown;
	private PageElement limitOfLiabilityTextField;
	private PageElement assessedLossAmountOfSection14ATextField;
	private PageElement claimAmountOfSection14ATextField;
	private PageElement isSection14BWorkmensCompensationRequiredDropDown;
	private PageElement sumInsuredTextField;
	private PageElement assessedLossAmountOfSection14BTextField;
	private PageElement claimAmountOfSection14BTextField;
	private PageElement isSection15ProfessionalIndemnityAvailableRequiredDropDown;
	private PageElement sumInsuredForSection15TextField;
	private PageElement assessedLossAmountOfSection15TextField;
	private PageElement claimAmountOfSection15TextField;
	//Mayur_Product name= SE
	private PageElement nameOfTheStudentTextField;
	private PageElement ageYrTextField;
	private PageElement classOfTheStudentTextField;
	private PageElement divisionTextField;
	private PageElement rollNumberOfTheStudentTextField;
	private PageElement outstandingTuitionAndHostelFeeForRemainingSemestersInTheStudentsAccountAsPerTheInstitutionsRecordsTextField;
	//Mayur_Product name= SH
	private PageElement section7RequiredDropDown;
	private PageElement totalSumInsuredForBaggageInsuranceTextField;
	private PageElement assessedLossAmountOfSection7TextField;
	private PageElement claimAmountOfSection7TextField;
	private PageElement section8RequiredDropDown;
	private PageElement sumInsuredForPersonalAccidentTextField;
	private PageElement assessedLossAmountOfSection8TextField;
	private PageElement claimAmountOfSection8TextField;
	private PageElement section9RequiredDropDown;
	private PageElement guaranteeAmountTextField;
	private PageElement section10ARequiredDropDown;
	private PageElement sumInsuredForSection10ATextField;
	private PageElement assessedLossAmountOfSection10ATextField;
	private PageElement claimAmountOfSection10ATextField;
	private PageElement section10BRequiredDropDown;
	private PageElement sumInsuredForSection10BTextField;
	private PageElement assessedLossAmountOfSection10BTextField;
	private PageElement claimAmountOfSection10BTextField;
	private PageElement nameOfTheEmployeeTextField;
	private PageElement ageOfEmployeeTextField;
	private PageElement categoryNameTextArea; 
	private PageElement section11RequiredDropDown;
	private PageElement sumInsuredForSection11TextField;
	private PageElement section12RequiredDropDown;
	//Mayur_Product name= SY
	private PageElement natureOfTreatmentDropDown;
	private PageElement dateOfAdmissionInHospitalTextField;
	private PageElement dateOfDischargeFromTheHospitalTextField;
	private PageElement nameAndPlaceOfTheHospitalTextField;
	private PageElement dateOfCompletionOfTreatmentHospitalizationTextField;
	private PageElement totalMedicalExpensesHospitalizationTextField;
	private PageElement dateOfCommencementOfTreatmentTextField;
	private PageElement dateOfCompletionOfTreatmentOPDTextField;
	private PageElement totalMedicalExpensesOPDTextField;
	private PageElement percentageOfDisabilityTextField;
	private PageElement descriptionOfDisabilityTextArea;
	private PageElement medicalExpensesPaidTextField;
	private PageElement dateOfAdmissionInHospitaltFindButton;
	private PageElement dateOfDischargeFromTheHospitalFindButton;
	private PageElement dateOfCompletionOfTreatmentHospitalizationFindButton;
	private PageElement dateOfCommencementOfTreatmentFindButton;
	private PageElement dateOfCompletionOfTreatmentOPDFindButton;

	//Mayur_Product name= BB
	private PageElement isAddOnCover1RequiredDropDown;
	private PageElement sumInsuredOfAddonCover1TextField;
	private PageElement assessedLossAmountOfAddOnCover1TextField;
	private PageElement claimAmountOfAddOnCover1TextField;
	private PageElement isAddOnCover2RequiredDropDown;
	private PageElement sumInsuredOfAddonCover2TextField;
	private PageElement assessedLossAmountOfAddOnCover2TextField;
	private PageElement claimAmountOfAddOnCover2TextField;
	private PageElement isAddOnCover3RequiredDropDown;
	private PageElement sumInsuredOfAddonCover3TextField;
	private PageElement assessedLossAmountOfAddOnCover3TextField;
	private PageElement claimAmountOfAddOnCover3TextField;
	private PageElement isAddOnCover4RequiredDropDown;
	private PageElement sumInsuredOfAddonCover4TextField;
	private PageElement assessedLossAmountOfAddOnCover4TextField;
	private PageElement claimAmountOfAddOnCover4TextField;
	private PageElement isAddOnCover5RequiredDropDown;
	private PageElement sumInsuredOfAddonCover5TextField;
	private PageElement assessedLossAmountOfAddOnCover5TextField;
	private PageElement claimAmountOfAddOnCover5TextField;
	//Mayur_Product name= BD
	private PageElement isOtherAddOnCoverRequiredDropDown;
	private PageElement sumInsuredForOtherExtensionTextField;
	private PageElement assessedLossAmountOfOtherAddOnCoverTextField;
	private PageElement claimAmountOfOtherAddOnCoverTextField;
	//Mayur_Product name= PT
	private PageElement reasonForReopenDropDown;
	private PageElement districtORStateORNationalDropDown;

	//JI-Yogesh
	private PageElement isSECIICoverRequiredDropdown;
	private PageElement sumInsuredForSectionIITextfield;
	private PageElement assessedLossAmountOfSECIICoverTextfield;
	private PageElement claimAmountOfSECIICoverTextfield;
	private PageElement isSECIIICoverRequiredDropdown;
	private PageElement sumInsuredForSectionIIITextfield;
	private PageElement assessedLossAmountOfSECIIICoverTextfield;
	private PageElement claimAmountOfSECIIICoverTextfield;
	private PageElement isSECIVCoverRequiredDropdown;
	private PageElement sumInsuredForSectionIVTextfield;
	private PageElement assessedLossAmountOfSECIVCoverTextfield;
	private PageElement claimAmountOfSECIVCoverTextfield;
	private PageElement isCoverEXTNSALORequiredDropdown;
	private PageElement totalSumInsuredForEXTNSALOCoverTextfield;
	private PageElement assessedLossAmountOfEXTNSALOCoverTextfield;
	private PageElement claimAmountOfEXTNSALOCoverTextfield;
	//PQ-Yogesh
	private PageElement claimDropDown;
	private PageElement totalAssessedLossAmountTextField;
	private PageElement isUnderlnsuranceApplicableDropDown;
	private PageElement underInsuranceTypeDropdown;
	private PageElement underInsurancePercentTextfield;
	private PageElement excessTextField;
	private PageElement netClaimAmountTextField;
	//PY-Yogesh
	private PageElement claimLossAfterUnderInsuranceTextfield;
	//BI-Yogesh
	private PageElement isTheftExtensionRequiredDropdown;
	private PageElement sumInsuredForTheftExtensionTextfield;
	private PageElement assessedLossAmountOfTheftExtensionTextfield;
	private PageElement claimAmountOfTheftExtensionTextfield;
	private PageElement isOtherExtensionRequiredDropdown;
	private PageElement sumInsuredForOtherExtensionTextfield;
	private PageElement assessedLossAmountOfOtherExtensionTextfield;
	private PageElement claimAmountOfOtherExtensionTextfield;
	//HH
	private PageElement suminsuredForSection8TextField;		
	private PageElement excessForSEC8TextField;		
	private PageElement excessForSEC10ATextField;	
	private PageElement excessForSEC10BTextField;		
	private PageElement excessForSEC11TextField;
	//PB
	private PageElement dateOfAdmissionTextField;
	private PageElement dateOfAdmissionFindButton;
	private PageElement dateOfDeathTextField;
	private PageElement dateOfDeathFindButton;
	private PageElement policeStationTextField;
	private PageElement nameOfHospitalWherePostMortemReportIsDoneTextArea;
	//HH
	private PageElement claimDropdown;
	private PageElement reasonForReopenDropdown;
	private PageElement excessForSEC09TextField;
	private PageElement claimAmountTextField;
	private PageElement surveyFeesTextField;
	private PageElement translatorFeesTextField;
	private PageElement legalOpinionFeesTextField;
	private PageElement other1FeesTextField;
	private PageElement other2FeesTextField;
	private PageElement districtStateNationalDropDown;
	private PageElement districtCourtSupremeCourtHighCourtSLPDropDown;
	//MI
	private PageElement saveButton;

	private PageElement nextButton;
	private PageElement DateofAdmissionTextFieldForPB;
	private PageElement	natureOfTreatmentDropDownForRK;

	public ClaimRiskProperty3ForMiscNonLiability(WebDriver driver, String pageName) {
		super(driver, pageName);

		claimRiskProperty2Title = new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Property')]"), " Claim Risk Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isTerrorismCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTerrorismTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Terrorism", "input")), "Sum Insured for Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Terrorism Cover", "input")), "Assessed Loss Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Terrorism Cover", "input")), "Claim Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("Previous"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Mayur_Product name= SE
		nameOfTheStudentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of the Student')]/following::input"), "Name of the Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		ageYrTextField= new PageElement(By.xpath("//td//div[contains(text(),'Age (yr)')]/following::input"), "Age (yr) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		classOfTheStudentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Class of the Student')]/following::input"), "Class of the Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		divisionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Division')]/following::input"), "Division TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		rollNumberOfTheStudentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Roll Number of the Student')]/following::input"), "Roll Number of the Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		outstandingTuitionAndHostelFeeForRemainingSemestersInTheStudentsAccountAsPerTheInstitutionsRecordsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Outstanding Tuition and Hostel Fee for remaining semesters in the students account as per the institutions records')]/following::input"), "Outstanding Tuition and Hostel Fee for remaining semesters in the students account as per the institutions records TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		//Mayur_Product name= SH
		section7RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 7 Required')]/following::select"), "Section 7 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		totalSumInsuredForBaggageInsuranceTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured for Baggage Insurance')]/following::input"), "Total Sum Insured for Baggage Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfSection7TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section7')]/following::input"), "Assessed Loss Amount of Section7 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfSection7TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section7')]/following::input"), "Claim Amount of Section7 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section8RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 8 Required')]/following::select"), "Section 8 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredForPersonalAccidentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Personal Accident')]/following::input"), "Sum Insured for Personal Accident TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfSection8TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section8')]/following::input"), "Assessed Loss Amount of Section8 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfSection8TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section8')]/following::input"), "Claim Amount of Section8 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section9RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 9 Required')]/following::select"), "Section 9 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		guaranteeAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Guarantee amount')]/following::input"), "Guarantee amount textField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section10ARequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 10A Required')]/following::select"), "Section 10A Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredForSection10ATextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for section10A')]/following::input"), "Sum insured for section10A textField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfSection10ATextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section10A')]/following::input"), "Assessed Loss Amount of Section10A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfSection10ATextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section10A')]/following::input"), "Claim Amount of Section10A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section10BRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 10B Required')]/following::select"), "Section 10B Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredForSection10BTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for section10B')]/following::input"), "Sum insured for section10B textField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfSection10BTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section10B')]/following::input"), "Assessed Loss Amount of Section10B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		nameOfTheEmployeeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of the employee ')]/following::input"), "Name of the employee  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		ageOfEmployeeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Age of Employee ')]/following::input"), "Age of Employee  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		categoryNameTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Category Name ')]/following::textarea"), "Category Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfSection10BTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section10B')]/following::input"), "Claim Amount of Section10B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section11RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 11 Required')]/following::select"), "Section 11 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredForSection11TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for section11')]/following::input"), "Sum insured for section11 input", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		section12RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 12 Required')]/following::select"), "Section 12 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		//Mayur_Product name= SY

		natureOfTreatmentDropDown= new PageElement(By.name("propValues1"), "Nature of Treatment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		dateOfAdmissionInHospitalTextField= new PageElement(By.xpath("//td/div[contains(text(),'Date of Admission in hospital')]/following::input"), "Date of Admission in hospitalTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfDischargeFromTheHospitalTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Discharge from the Hospital')]/following::input"), "Date of Discharge from the Hospital TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		nameAndPlaceOfTheHospitalTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name and Place of the Hospital')]/following::input"), "Name and Place of the Hospital TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfCompletionOfTreatmentHospitalizationTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of completion of treatment (Hospitalization)')]/following::input"), "Date of completion of treatment (Hospitalization) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		totalMedicalExpensesHospitalizationTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Medical expenses (Hospitalization)')]/following::input"), "Total Medical expenses (Hospitalization)TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfCommencementOfTreatmentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of commencement of treatment')]/following::input"), "Date of commencement of treatment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfCompletionOfTreatmentOPDTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of completion of treatment (OPD)')]/following::input"), "Date of completion of treatment (OPD) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		totalMedicalExpensesOPDTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Medical expenses (OPD)')]/following::input"), "Total Medical expenses (OPD) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		percentageOfDisabilityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Percentage of disability')]/following::input"), "Percentage of disabilityTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		descriptionOfDisabilityTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of disability')]/following::textarea"), "Description of disability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		medicalExpensesPaidTextField= new PageElement(By.xpath("//td//div[contains(text(),'Medical Expenses paid')]/following::input"), "Medical Expenses paid TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);

		dateOfAdmissionInHospitaltFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of Admission in hospital')]/following::input/following::a[@name='firstFocus']"), "Date Of Admission In Hospital Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfDischargeFromTheHospitalFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of Discharge from the Hospital')]/following::input/following::a[@name='firstFocus']"), "Date of Discharge from the Hospital Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfCompletionOfTreatmentHospitalizationFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of completion of treatment (Hospitalization)')]/following::input/following::a[@name='firstFocus']"), "Date of completion of treatment (Hospitalization)Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfCommencementOfTreatmentFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of commencement of treatment')]/following::input/following::a[@name='firstFocus']"), "Date of commencement of treatment Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfCompletionOfTreatmentOPDFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of completion of treatment (OPD)')]/following::input/following::a[@name='firstFocus']"), "Date of completion of treatment (OPD) Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//Mayur_Product name= BB/BN
		isAddOnCover1RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is AddOn Cover 1 required')]/following::select"), "Is AddOn Cover 1 required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredOfAddonCover1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Addon Cover 1')]/following::input"), "Sum Insured of Addon Cover 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfAddOnCover1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of AddOn Cover 1')]/following::input"), "Assessed Loss Amount of AddOn Cover 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfAddOnCover1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of AddOn Cover 1')]/following::input"), "Claim Amount of AddOn Cover 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		isAddOnCover2RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is AddOn Cover 2 required')]/following::select"), "Is AddOn Cover 2 required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredOfAddonCover2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Addon Cover 2')]/following::input"), "Sum Insured of Addon Cover 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfAddOnCover2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of AddOn Cover 2')]/following::input"), "Assessed Loss Amount of AddOn Cover 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfAddOnCover2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of AddOn Cover 2')]/following::input"), "Claim Amount of AddOn Cover 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		isAddOnCover3RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is AddOn Cover 3 required')]/following::select"), "Is AddOn Cover 3 required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredOfAddonCover3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Addon Cover 3')]/following::input"), "Sum Insured of Addon Cover 3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfAddOnCover3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of AddOn Cover 3')]/following::input"), "Assessed Loss Amount of AddOn Cover 3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfAddOnCover3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of AddOn Cover 3')]/following::input"), "Claim Amount of AddOn Cover 3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		isAddOnCover4RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is AddOn Cover 4 required')]/following::select"), "Is AddOn Cover 4 required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredOfAddonCover4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Addon Cover 4')]/following::input"), "Sum Insured of Addon Cover 4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfAddOnCover4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of AddOn Cover 4')]/following::input"), "Assessed Loss Amount of AddOn Cover 4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfAddOnCover4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of AddOn Cover 4')]/following::input"), "Claim Amount of AddOn Cover 4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		isAddOnCover5RequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is AddOn Cover 5 required')]/following::select"), "Is AddOn Cover 5 required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredOfAddonCover5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Addon Cover 5')]/following::input"), "Sum Insured of Addon Cover 5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfAddOnCover5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of AddOn Cover 5')]/following::input"), "Assessed Loss Amount of AddOn Cover 5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfAddOnCover5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of AddOn Cover 5')]/following::input"), "Claim Amount of AddOn Cover 5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		//Mayur_Product name= BD
		isOtherAddOnCoverRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is other AddOn Cover required')]/following::select"), "Is other AddOn Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		sumInsuredForOtherExtensionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Other Extension')]/following::input"), "Sum Insured for Other Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		assessedLossAmountOfOtherAddOnCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of other AddOn Cover')]/following::input"), "Assessed Loss Amount of other AddOn Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		claimAmountOfOtherAddOnCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of other AddOn Cover')]/following::input"), "Claim Amount of other AddOn Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		//Mayur_Product name= PT
		reasonForReopenDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Reason For Reopen')]/following::select"), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		districtORStateORNationalDropDown= new PageElement(By.xpath("//td//div[contains(text(),'District/State/National')]/following::select"), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
		//JI-Yogesh
		isSECIICoverRequiredDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is SECII Cover required')]/following::select"), "Is SECII Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIITextfield=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Section II')]/following::input"), "Sum Insured for Section II TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIICoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of SECII Cover')]/following::input"), "Assessed Loss Amount of SECII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIICoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of SECII Cover')]/following::input"), "Claim Amount of SECII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSECIIICoverRequiredDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is SECIII Cover required')]/following::select"), "Is SECIII Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIIITextfield=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Section III')]/following::input"), "Sum Insured for Section III TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIIICoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of SECIII Cover')]/following::input"), "Assessed Loss Amount of SECIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIIICoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of SECIII Cover')]/following::input"), "Claim Amount of SECIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSECIVCoverRequiredDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is SECIV Cover required')]/following::select"), "Is SECIV Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIVTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Section IV')]/following::input"), "Sum Insured for Section IV TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIVCoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of SECIV Cover')]/following::input"), "Assessed Loss Amount of SECIV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIVCoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of SECIV Cover')]/following::input"), "Claim Amount of SECIV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverEXTNSALORequiredDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover EXTN-SALO required')]/following::select"), "Is Cover EXTN-SALO required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForEXTNSALOCoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Total sum insured for EXTN-SALO Cover')]/following::input"), "Total sum insured for EXTN-SALO Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfEXTNSALOCoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of EXTN-SALO Cover')]/following::input"), "Assessed Loss Amount of EXTN-SALO Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfEXTNSALOCoverTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of EXTN-SALO Cover')]/following::input"), "Claim Amount of EXTN-SALO Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PQ-Yogesh
		claimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalAssessedLossAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Assessed Loss Amount", "input")), "Total Assessed Loss Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isUnderlnsuranceApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ls Under lnsurance Applicable", "select")), "ls Under lnsurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceTypeDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Insurance Type", "select")), "Under Insurance Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsurancePercentTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "Under insurance percent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Net Claim Amount", "input")), "Net Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PY-Yogesh
		claimLossAfterUnderInsuranceTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Loss After Under Insurance", "input")), "Claim Loss After Under Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BI-Yogesh
		isTheftExtensionRequiredDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Is Theft Extension required')]/following::select"), "Is Theft Extension required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTheftExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Theft Extension')]/following::input"), "Sum Insured for Theft Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTheftExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Theft Extension')]/following::input"), "Assessed Loss Amount of Theft Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTheftExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Theft Extension')]/following::input"), "Claim Amount of Theft Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isOtherExtensionRequiredDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Is Other Extension required')]/following::select"), "Is Other Extension required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForOtherExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Other Extension')]/following::input"), "Sum Insured for Other Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfOtherExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Other Extension')]/following::input"), "Assessed Loss Amount of Other Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfOtherExtensionTextfield=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Other Extension')]/following::input"), "Claim Amount of Other Extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH
		suminsuredForSection8TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section8", "input")), "Sum insured for section8 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		excessForSEC8TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-8", "input")), "Excess for SEC-8 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC10ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-10A", "input")), "Excess for SEC-10A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		excessForSEC10BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-10B", "input")), "Excess for SEC-10B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		excessForSEC11TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-11", "input")), "Excess for SEC-11 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//OS
		isSection8BIncreasedCostOfWorkingRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 8B(Increased cost of Working) required", "select")), "Is section 8B(Increased cost of Working) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection8BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section8B", "input")), "Sum insured for section8B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection8BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section8B", "input")), "Assessed Loss Amount of Section8B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection8BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section8B", "input")), "Claim Amount of Section8B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection9PortableEquipmentRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 9(Portable Equipment) required", "select")), "Is section 9(Portable Equipment) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured.", "input")), "Total Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection9TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section9", "input")), "Assessed Loss Amount of Section9 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection9TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section9", "input")), "Claim Amount of Section9 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection10AdditionalExpensesOfRentRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 10(Additional expenses of Rent) required", "select")), "Is section 10(Additional expenses of Rent) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection10TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section10", "input")), "Sum insured for section10 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection10TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section10", "input")), "Assessed Loss Amount of Section10 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection10TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section10", "input")), "Claim Amount of Section10 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection11PersonalAccidentRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 11(Personal accident) required", "select")), "Is section 11(Personal accident) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		capitalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Capital Sum Insured", "input")), "Capital Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection11TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section11", "input")), "Assessed Loss Amount of Section11 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection11TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section11", "input")), "Claim Amount of Section11 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection12BreakDownOfOfficeApplianceRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 12(Break down of office appliance) required", "select")), "Is section 12(Break down of office appliance) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection12TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section12", "input")), "Sum insured for section12 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection12TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section12", "input")), "Assessed Loss Amount of Section12 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection12TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section12", "input")), "Claim Amount of Section12 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection13BaggageRequiredDropDown  = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 13(Baggage) required", "select")), "Is section 13(Baggage) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalBaggageSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Baggage Sum Insured", "input")), "Total Baggage Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection13TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section13", "input")), "Assessed Loss Amount of Section13 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection13TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section13", "input")), "Claim Amount of Section13 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection14APublicLiabilityInsuranceRequiredDropDown  = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 14A(Public liability insurance) required", "select")), "Is section 14A(Public liability insurance) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitOfLiabilityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit of Liability", "input")), "Limit of Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection14ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section14A", "input")), "Assessed Loss Amount of Section14A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection14ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section14A", "input")), "Claim Amount of Section14A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection14BWorkmensCompensationRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 14B(Workmens Compensation) required", "select")), "Is section 14B(Workmens Compensation) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection14BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section14B", "input")), "Assessed Loss Amount of Section14B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection14BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section14B", "input")), "Claim Amount of Section14B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection15ProfessionalIndemnityAvailableRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 15(Professional indemnity available) required", "select")), "Is section 15(Professional indemnity available) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection15TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section15", "input")), "Sum insured for section15 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection15TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section15", "input")), "Assessed Loss Amount of Section15 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection15TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section15", "input")), "Claim Amount of Section15 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PB
		dateOfAdmissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel(" Date of Admission", "input")), "Date of Admission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAdmissionFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of Admission')]/following::input/following::a[@name='firstFocus']"), "Date of Admission Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfDeathTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of death", "input")), "Date of death TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDeathFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of death')]/following::input/following::a[@name='firstFocus']"), "Date of death Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policeStationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Police Station", "input")), "Police Station TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfHospitalWherePostMortemReportIsDoneTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Hospital where Post-mortem report is done", "textarea")), "Name of Hospital where Post-mortem report is done TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH
		claimDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonForReopenDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason For Reopen", "select")), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessForSEC09TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-09", "input")), "Excess for SEC-09 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim amount", "input")), "Claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Fees", "input")), "Survey Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		translatorFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Translator Fees", "input")), "Translator Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalOpinionFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Legal Opinion Fees", "input")), "Legal Opinion Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other1FeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other1 Fees", "input")), "Other1 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other2FeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other2 Fees", "input")), "Other2 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtStateNationalDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National", "select")), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtCourtSupremeCourtHighCourtSLPDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP", "select")), "District Court/Supreme Court/High Court/SLP DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//MI
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextButton=new PageElement(By.name("Next1"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//
		DateofAdmissionTextFieldForPB=new PageElement(By.id("propValues2"), "Date of Admission Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentDropDownForRK= new PageElement(By.xpath("//td/div[contains(text(),'Nature of treatment')]/following::select"), "Nature of Treatment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);



	}

	public void fillClaimRiskProperty3ForMiscNonLiabilityDetails(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPrimaryInformation")){

			if(claimRiskProp3MNLEntity.getAction().equalsIgnoreCase("add") || claimRiskProp3MNLEntity.getAction().equalsIgnoreCase("edit")){
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequiredMI")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequiredMI"));
					click(nextButton);
				}

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					clearAndSendKeys(sumInsuredForTerrorismTextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForTerrorism"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfTerrorismCoverTextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					clearAndSendKeys(claimAmountOfTerrorismCoverTextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"));
				}
				//Mayur_Product name= SE
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfTheStudent")) {
					clearAndSendKeys(nameOfTheStudentTextField, claimRiskProp3MNLEntity.getStringValueForField("NameOfTheStudent"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAgeYr")) {
					clearAndSendKeys(ageYrTextField, claimRiskProp3MNLEntity.getStringValueForField("AgeYr"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClassOfTheStudent")) {
					clearAndSendKeys(classOfTheStudentTextField, claimRiskProp3MNLEntity.getStringValueForField("ClassOfTheStudent"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDivision")) {
					clearAndSendKeys(divisionTextField, claimRiskProp3MNLEntity.getStringValueForField("Division"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigRollNumberOfTheStudent")) {
					clearAndSendKeys(rollNumberOfTheStudentTextField, claimRiskProp3MNLEntity.getStringValueForField("RollNumberOfTheStudent"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOutstandTuitHostFee")) {
					clearAndSendKeys(outstandingTuitionAndHostelFeeForRemainingSemestersInTheStudentsAccountAsPerTheInstitutionsRecordsTextField, claimRiskProp3MNLEntity.getStringValueForField("OutstandingTuitionAndHostelFeeForRemainingSemestersInTheStudentsAccountAsPerTheInstitutionsRecords"));
				}
				//Mayur_Product name= SH
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection7Required")) {
					selectValueFromList(section7RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section7Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection7")) {
					clearAndSendKeys(assessedLossAmountOfSection7TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection7"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection7")) {
					clearAndSendKeys(claimAmountOfSection7TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection7"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection8Required")) {
					selectValueFromList(section8RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section8Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8")) {
					clearAndSendKeys(assessedLossAmountOfSection8TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection8"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8")) {
					clearAndSendKeys(claimAmountOfSection8TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection8"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection9Required")) {
					selectValueFromList(section9RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section9Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection10ARequired")) {
					selectValueFromList(section10ARequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section10ARequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection10A")) {
					clearAndSendKeys(assessedLossAmountOfSection10ATextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection10A"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10A")) {
					clearAndSendKeys(claimAmountOfSection10ATextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10A"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection10BRequired")) {
					selectValueFromList(section10BRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section10BRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection10B")) {
					clearAndSendKeys(assessedLossAmountOfSection10BTextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection10B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10B")) {
					clearAndSendKeys(claimAmountOfSection10BTextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfTheEmployee")) {
					clearAndSendKeys(nameOfTheEmployeeTextField, claimRiskProp3MNLEntity.getStringValueForField("NameOfTheEmployee"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAgeOfEmployee")) {
					clearAndSendKeys(ageOfEmployeeTextField, claimRiskProp3MNLEntity.getStringValueForField("AgeOfEmployee"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigCategoryName")) {
					clearAndSendKeys(categoryNameTextArea, claimRiskProp3MNLEntity.getStringValueForField("CategoryName"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection11Required")) {
					selectValueFromList(section11RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section11Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection12Required")) {
					selectValueFromList(section12RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("Section12Required"));
				}
				//Mayur_Product name= SY

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
					if(!claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("RK")) {
						selectValueFromList(natureOfTreatmentDropDown, claimRiskProp3MNLEntity.getStringValueForField("NatureOfTreatment"));
					}
					else {
						selectValueFromList(natureOfTreatmentDropDownForRK, claimRiskProp3MNLEntity.getStringValueForField("NatureOfTreatment"));
					}
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfAdmissionInHospital")) {
					click(dateOfAdmissionInHospitaltFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfAdmissionInHospitalTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfAdmissionInHospital"));
					switchToFrame("display");	
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfDischargeFromTheHospital")) {
					click(dateOfDischargeFromTheHospitalFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfDischargeFromTheHospitalTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfDischargeFromTheHospital"));
					switchToFrame("display");		
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameAndPlaceOfTheHospital")) {
					clearAndSendKeys(nameAndPlaceOfTheHospitalTextField, claimRiskProp3MNLEntity.getStringValueForField("NameAndPlaceOfTheHospital"));
				}

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentHospitalization")) {
					click(dateOfCompletionOfTreatmentHospitalizationFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfCompletionOfTreatmentHospitalizationTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfCompletOfTreatHospitalization"));
					switchToFrame("display");
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesHospitalization")) {
					clearAndSendKeys(totalMedicalExpensesHospitalizationTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalMedicalExpensesHospitalization"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCommencementOfTreatment")) {

					click(dateOfCommencementOfTreatmentFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfCommencementOfTreatmentTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfCommencementOfTreatment"));
					switchToFrame("display");
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentOPD")) {

					click(dateOfCompletionOfTreatmentOPDFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfCompletionOfTreatmentOPDTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentOPD"));
					switchToFrame("display");
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesOPD")) {
					clearAndSendKeys(totalMedicalExpensesOPDTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalMedicalExpensesOPD"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPercentageOfDisability")) {
					clearAndSendKeys(percentageOfDisabilityTextField, claimRiskProp3MNLEntity.getStringValueForField("PercentageOfDisability"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDescriptionOfDisability")) {

					clearAndSendKeys(descriptionOfDisabilityTextArea, claimRiskProp3MNLEntity.getStringValueForField("DescriptionOfDisability"));
					if (claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("SY")) {
						click(forwardButton);
					}
				}		

				//Mayur_Product name= BB
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover1Required")) {
					selectValueFromList(isAddOnCover1RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover1Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover1")) {
					clearAndSendKeys(assessedLossAmountOfAddOnCover1TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover1"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover2Required")) {
					selectValueFromList(isAddOnCover2RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover2Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover2")) {
					clearAndSendKeys(assessedLossAmountOfAddOnCover2TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover2"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover3Required")) {
					selectValueFromList(isAddOnCover3RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover3Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover3")) {
					clearAndSendKeys(assessedLossAmountOfAddOnCover3TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover3"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover4Required")) {
					selectValueFromList(isAddOnCover4RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover4Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover4")) {
					clearAndSendKeys(assessedLossAmountOfAddOnCover4TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover4"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover5Required")) {
					selectValueFromList(isAddOnCover5RequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover5Required"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover5")) {
					clearAndSendKeys(assessedLossAmountOfAddOnCover5TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover5"));
				}
				//Mayur_Product name= BD
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsOtherAddOnCoverRequired")) {
					selectValueFromList(isOtherAddOnCoverRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsOtherAddOnCoverRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOtherAddOnCover")) {
					clearAndSendKeys(assessedLossAmountOfOtherAddOnCoverTextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfOtherAddOnCover"));
				}
				//Mayur_Product name= PT
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropDown, claimRiskProp3MNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictORStateORNational")) {
					selectValueFromList(districtORStateORNationalDropDown, claimRiskProp3MNLEntity.getStringValueForField("DistrictORStateORNational"));
				}
				//JI-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIICoverRequired")) {
					selectValueFromList(isSECIICoverRequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsSECIICoverRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECIICoverTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIICover"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIIICoverRequired")) {
					selectValueFromList(isSECIIICoverRequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsSECIIICoverRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECIIICoverTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIIICover"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIVCoverRequired")) {
					selectValueFromList(isSECIVCoverRequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsSECIVCoverRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIVCover")) {
					clearAndSendKeys(assessedLossAmountOfSECIVCoverTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIVCover"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsCoverEXTNSALORequired")) {
					selectValueFromList(isCoverEXTNSALORequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsCoverEXTNSALORequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfEXTNSALOCover")) {
					clearAndSendKeys(assessedLossAmountOfEXTNSALOCoverTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfEXTNSALOCover"));
				}
				//PQ-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropDown, claimRiskProp3MNLEntity.getStringValueForField("Claim"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					clearAndSendKeys(totalAssessedLossAmountTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalAssessedLossAmount"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					selectValueFromList(isUnderlnsuranceApplicableDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					selectValueFromList(underInsuranceTypeDropdown, claimRiskProp3MNLEntity.getStringValueForField("UnderInsuranceType"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
					clearAndSendKeys(underInsurancePercentTextfield, claimRiskProp3MNLEntity.getStringValueForField("UnderInsurancePercent"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcess")) {
					clearAndSendKeys(excessTextField, claimRiskProp3MNLEntity.getStringValueForField("Excess"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					clearAndSendKeys(netClaimAmountTextField, claimRiskProp3MNLEntity.getStringValueForField("NetClaimAmount"));
				}
				//PY-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					clearAndSendKeys(claimLossAfterUnderInsuranceTextfield, claimRiskProp3MNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"));
				}
				//BI-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTheftExtensionRequired")) {
					selectValueFromList(isTheftExtensionRequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsTheftExtensionRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForTheftExtension")) {
					clearAndSendKeys(sumInsuredForTheftExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForTheftExtension"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTheftExtension")) {
					clearAndSendKeys(assessedLossAmountOfTheftExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfTheftExtension"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTheftExtension")) {
					clearAndSendKeys(claimAmountOfTheftExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfTheftExtension"));
				}

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsOtherExtensionRequired")) {
					selectValueFromList(isOtherExtensionRequiredDropdown, claimRiskProp3MNLEntity.getStringValueForField("IsOtherExtensionRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForOtherExtension")) {
					clearAndSendKeys(sumInsuredForOtherExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForOtherExtension"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOtherExtension")) {
					clearAndSendKeys(assessedLossAmountOfOtherExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfOtherExtension"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOtherExtension")) {
					clearAndSendKeys(claimAmountOfOtherExtensionTextfield, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfOtherExtension"));
				}
				//HH
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSuminsuredForSection8")) {
					clearAndSendKeys(suminsuredForSection8TextField, claimRiskProp3MNLEntity.getStringValueForField("SuminsuredForSection8"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC8")) {
					clearAndSendKeys(excessForSEC8TextField, claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC8"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC10A")) {
					clearAndSendKeys(excessForSEC10ATextField, claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC10A"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC10B")) {
					clearAndSendKeys(excessForSEC10BTextField, claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC10B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC11")) {
					clearAndSendKeys(excessForSEC11TextField, claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC11"));
				}
				//OS
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection8BIncreasedCostOfWorkingRequired")) {
					selectValueFromList(isSection8BIncreasedCostOfWorkingRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection8BIncreasedCostOfWorkingRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection8B")) {
					clearAndSendKeys(sumInsuredForSection8BTextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection8B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8B")) {
					clearAndSendKeys(assessedLossAmountOfSection8BTextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection8B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8B")) {
					clearAndSendKeys(claimAmountOfSection8BTextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection8B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection9PortableEquipmentRequired")) {
					selectValueFromList(isSection9PortableEquipmentRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection9PortableEquipmentRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					clearAndSendKeys(totalSumInsuredTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalSumInsured"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection9")) {
					clearAndSendKeys(assessedLossAmountOfSection9TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection9"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection9")) {
					clearAndSendKeys(claimAmountOfSection9TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection9"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection10AdditionalExpensesOfRentRequired")) {
					selectValueFromList(isSection10AdditionalExpensesOfRentRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection10AdditionalExpensesOfRentRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection10")) {
					clearAndSendKeys(sumInsuredForSection10TextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection10"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection10")) {
					clearAndSendKeys(assessedLossAmountOfSection10TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection10"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10")) {
					clearAndSendKeys(claimAmountOfSection10TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection11PersonalAccidentRequired")) {
					selectValueFromList(isSection11PersonalAccidentRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection11PersonalAccidentRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
					clearAndSendKeys(capitalSumInsuredTextField, claimRiskProp3MNLEntity.getStringValueForField("CapitalSumInsured"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection11")) {
					clearAndSendKeys(assessedLossAmountOfSection11TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection11"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection11")) {
					clearAndSendKeys(claimAmountOfSection11TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection11"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection12BreakDownOfOffAppReq")) {
					selectValueFromList(isSection12BreakDownOfOfficeApplianceRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection12BreakDownOfOffAppReq"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection12")) {
					clearAndSendKeys(sumInsuredForSection12TextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection12"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection12")) {
					clearAndSendKeys(assessedLossAmountOfSection12TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection12"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection12")) {
					clearAndSendKeys(claimAmountOfSection12TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection12"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection13BaggageRequired")) {
					selectValueFromList(isSection13BaggageRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection13BaggageRequired"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalBaggageSumInsured")) {
					clearAndSendKeys(totalBaggageSumInsuredTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalBaggageSumInsured"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection13")) {
					clearAndSendKeys(assessedLossAmountOfSection13TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection13"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection13")) {
					clearAndSendKeys(claimAmountOfSection13TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection13"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSect14PubLiabilityInsreq")) {
					selectValueFromList(isSection14APublicLiabilityInsuranceRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSect14PubLiabilityInsreq"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigLimitOfLiability")) {
					clearAndSendKeys(limitOfLiabilityTextField, claimRiskProp3MNLEntity.getStringValueForField("LimitOfLiability"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection14A")) {
					clearAndSendKeys(assessedLossAmountOfSection14ATextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection14A"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection14A")) {
					clearAndSendKeys(claimAmountOfSection14ATextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection14A"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection14BWorkmens")) {
					selectValueFromList(isSection14BWorkmensCompensationRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection14BWorkmens"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsured")) {
					clearAndSendKeys(sumInsuredTextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsured"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection14B")) {
					clearAndSendKeys(assessedLossAmountOfSection14BTextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection14B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection14B")) {
					clearAndSendKeys(claimAmountOfSection14BTextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection14B"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection15Professional")) {
					selectValueFromList(isSection15ProfessionalIndemnityAvailableRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsSection15Professional"));
					if(claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("OS")) {
						click(nextButton);
					}
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection15")) {
					clearAndSendKeys(sumInsuredForSection15TextField, claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection15"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection15")) {
					clearAndSendKeys(assessedLossAmountOfSection15TextField, claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection15"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection15")) {
					clearAndSendKeys(claimAmountOfSection15TextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection15"));
				}
				//PB
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfAdmission")) {		
					click(dateOfAdmissionFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfAdmissionTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfAdmission"));
					switchToFrame("display");	
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfDeath")) {

					click(dateOfDeathFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfDeathTextField, claimRiskProp3MNLEntity.getStringValueForField("DateOfDeath"));
					switchToFrame("display");	
				}		
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPoliceStation")) {
					clearAndSendKeys(policeStationTextField, claimRiskProp3MNLEntity.getStringValueForField("PoliceStation"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfHospitalWherePostMortemReportIsDone")) {
					clearAndSendKeys(nameOfHospitalWherePostMortemReportIsDoneTextArea, claimRiskProp3MNLEntity.getStringValueForField("NameOfHospitalWherePostMortemReportIsDone"));
				}
				//HH
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropdown, claimRiskProp3MNLEntity.getStringValueForField("Claim"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropdown, claimRiskProp3MNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC09")) {
					clearAndSendKeys(excessForSEC09TextField, claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC09"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmount")) {
					clearAndSendKeys(claimAmountTextField, claimRiskProp3MNLEntity.getStringValueForField("ClaimAmount"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSurveyFees")) {
					clearAndSendKeys(surveyFeesTextField, claimRiskProp3MNLEntity.getStringValueForField("SurveyFees"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					clearAndSendKeys(translatorFeesTextField, claimRiskProp3MNLEntity.getStringValueForField("TranslatorFees"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					clearAndSendKeys(legalOpinionFeesTextField, claimRiskProp3MNLEntity.getStringValueForField("LegalOpinionFees"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOther1Fees")) {
					clearAndSendKeys(other1FeesTextField, claimRiskProp3MNLEntity.getStringValueForField("Other1Fees"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOther2Fees")) {
					clearAndSendKeys(other2FeesTextField, claimRiskProp3MNLEntity.getStringValueForField("Other2Fees"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					selectValueFromList(districtStateNationalDropDown, claimRiskProp3MNLEntity.getStringValueForField("DistrictStateNational"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupreme")) {
					selectValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown, claimRiskProp3MNLEntity.getStringValueForField("DistrictCourtSupreme"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequiredOS")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequiredOS"));
					click(nextButton);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimOS")) {
					selectValueFromList(claimDropDown, claimRiskProp3MNLEntity.getStringValueForField("ClaimOS"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmountOS")) {
					clearAndSendKeys(totalAssessedLossAmountTextField, claimRiskProp3MNLEntity.getStringValueForField("TotalAssessedLossAmountOS"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicableOs")) {
					selectValueFromList(isUnderlnsuranceApplicableDropDown, claimRiskProp3MNLEntity.getStringValueForField("IsUnderlnsuranceApplicableOs"));
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsuranceTypeOS")) {
					selectValueFromList(underInsuranceTypeDropdown, claimRiskProp3MNLEntity.getStringValueForField("UnderInsuranceType"));
				}


			}
			else if(claimRiskProp3MNLEntity.getAction().equalsIgnoreCase("verify")){

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequired"),fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequiredMI")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequiredMI"),fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
					click(nextButton);
				}

				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForTerrorism"),fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmtOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmtOfTerrorismCover"),fetchValueFromTextFields(assessedLossAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"),fetchValueFromTextFields(claimAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				//Mayur_Product name= SE
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NameOfTheStudent"),fetchValueFromTextFields(nameOfTheStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAgeYr")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AgeYr"),fetchValueFromTextFields(ageYrTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClassOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClassOfTheStudent"),fetchValueFromTextFields(classOfTheStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDivision")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Division"),fetchValueFromTextFields(divisionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigRollNumberOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("RollNumberOfTheStudent"),fetchValueFromTextFields(rollNumberOfTheStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOutstandTuitHostFee")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("OutstandTuitHostFee"),fetchValueFromTextFields(outstandingTuitionAndHostelFeeForRemainingSemestersInTheStudentsAccountAsPerTheInstitutionsRecordsTextField), AssertionType.WARNING);
				}
				//Mayur_Product name= SH
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection7Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section7Required"), fetchValueFromList(section7RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForBaggageInsurance")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalSumInsuredForBaggageInsurance"),fetchValueFromTextFields(totalSumInsuredForBaggageInsuranceTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection7")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection7"),fetchValueFromTextFields(assessedLossAmountOfSection7TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection7")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection7"),fetchValueFromTextFields(claimAmountOfSection7TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection8Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section8Required"), fetchValueFromList(section8RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForPersonalAccident")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForPersonalAccident"),fetchValueFromTextFields(sumInsuredForPersonalAccidentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection8"),fetchValueFromTextFields(assessedLossAmountOfSection8TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection8"),fetchValueFromTextFields(claimAmountOfSection8TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection9Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section9Required"), fetchValueFromList(section9RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigGuaranteeAmount")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("GuaranteeAmount"),fetchValueFromTextFields(guaranteeAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection10ARequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section10ARequired"), fetchValueFromList(section10ARequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection10A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection10A"),fetchValueFromTextFields(sumInsuredForSection10ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection10A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection10A"),fetchValueFromTextFields(assessedLossAmountOfSection10ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10A"),fetchValueFromTextFields(claimAmountOfSection10ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection10BRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section10BRequired"), fetchValueFromList(section10BRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection10B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection10B"),fetchValueFromTextFields(sumInsuredForSection10BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssLossAmtOfSection10B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssLossAmtOfSection10B"),fetchValueFromTextFields(assessedLossAmountOfSection10BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10B"),fetchValueFromTextFields(claimAmountOfSection10BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfTheEmployee")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NameOfTheEmployee"),fetchValueFromTextFields(nameOfTheEmployeeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAgeOfEmployee")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AgeOfEmployee"),fetchValueFromTextFields(ageOfEmployeeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigCategoryName")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("CategoryName"),fetchValueFromTextFields(categoryNameTextArea), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection11Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section11Required"), fetchValueFromList(section11RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection11")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection11"),fetchValueFromTextFields(sumInsuredForSection11TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSection12Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Section12Required"), fetchValueFromList(section12RequiredDropDown), AssertionType.WARNING);
				}
				//Mayur_Product name= SY
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
					if(!claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("RK")) {
						assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NatureOfTreatment"),fetchValueFromTextFields(natureOfTreatmentDropDown), AssertionType.WARNING);
					}
					else {
						assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NatureOfTreatment"),fetchValueFromTextFields(natureOfTreatmentDropDownForRK), AssertionType.WARNING);

					}
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfAdmissionInHospital")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp3MNLEntity.getStringValueForField("DateOfAdmissionInHospital")),fetchValueFromTextFields(dateOfAdmissionInHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfDischargeFromTheHospital")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp3MNLEntity.getStringValueForField("DateOfDischargeFromTheHospital")),fetchValueFromTextFields(dateOfDischargeFromTheHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameAndPlaceOfTheHospital")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NameAndPlaceOfTheHospital"),fetchValueFromTextFields(nameAndPlaceOfTheHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentHospitalization")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp3MNLEntity.getStringValueForField("DateOfCompletOfTreatHospitalization")),fetchValueFromTextFields(dateOfCompletionOfTreatmentHospitalizationTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesHospitalization")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalMedicalExpensesHospitalization"),fetchValueFromTextFields(totalMedicalExpensesHospitalizationTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCommencementOfTreatment")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp3MNLEntity.getStringValueForField("DateOfCommencementOfTreatment")),fetchValueFromTextFields(dateOfCommencementOfTreatmentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentOPD")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp3MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentOPD")),fetchValueFromTextFields(dateOfCompletionOfTreatmentOPDTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesOPD")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalMedicalExpensesOPD"),fetchValueFromTextFields(totalMedicalExpensesOPDTextField), AssertionType.WARNING);

				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPercentageOfDisability")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("PercentageOfDisability"),fetchValueFromTextFields(percentageOfDisabilityTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigMedicalExpensesPaid")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("MedicalExpensesPaid"),fetchValueFromTextFields(medicalExpensesPaidTextField), AssertionType.WARNING);
					if (claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("SY")) {
						click(forwardButton);
					}
				}
				//Mayur_Product name= BB
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover1Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover1Required"), fetchValueFromList(isAddOnCover1RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredOfAddonCover1")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredOfAddonCover1"),fetchValueFromTextFields(sumInsuredOfAddonCover1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssLossAmtOfAddOnCover1")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssLossAmtOfAddOnCover1"),fetchValueFromTextFields(assessedLossAmountOfAddOnCover1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAddOnCover1")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfAddOnCover1"),fetchValueFromTextFields(claimAmountOfAddOnCover1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover2Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover2Required"), fetchValueFromList(isAddOnCover2RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredOfAddonCover2")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredOfAddonCover2"),fetchValueFromTextFields(sumInsuredOfAddonCover2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover2")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover2"),fetchValueFromTextFields(assessedLossAmountOfAddOnCover2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAddOnCover2")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfAddOnCover2"),fetchValueFromTextFields(claimAmountOfAddOnCover2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover3Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover3Required"), fetchValueFromList(isAddOnCover3RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredOfAddonCover3")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredOfAddonCover3"),fetchValueFromTextFields(sumInsuredOfAddonCover3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover3")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover3"),fetchValueFromTextFields(assessedLossAmountOfAddOnCover3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAddOnCover3")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfAddOnCover3"),fetchValueFromTextFields(claimAmountOfAddOnCover3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover4Required")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover4Required"), fetchValueFromList(isAddOnCover4RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredOfAddonCover4")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredOfAddonCover4"),fetchValueFromTextFields(sumInsuredOfAddonCover4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover4")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover4"),fetchValueFromTextFields(assessedLossAmountOfAddOnCover4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAddOnCover4")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfAddOnCover4"),fetchValueFromTextFields(claimAmountOfAddOnCover4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsAddOnCover5")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsAddOnCover5"), fetchValueFromList(isAddOnCover5RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredOfAddonCover5")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredOfAddonCover5"),fetchValueFromTextFields(sumInsuredOfAddonCover5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAddOnCover5")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfAddOnCover5"),fetchValueFromTextFields(assessedLossAmountOfAddOnCover5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAddOnCover5")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfAddOnCover5"),fetchValueFromTextFields(claimAmountOfAddOnCover5TextField), AssertionType.WARNING);
				}
				//Mayur_Product name= BD
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsOtherAddOnCoverRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsOtherAddOnCoverRequired"), fetchValueFromList(isOtherAddOnCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForOtherExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForOtherExtension"),fetchValueFromTextFields(sumInsuredForOtherExtensionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOtherAddOnCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfOtherAddOnCover"),fetchValueFromTextFields(assessedLossAmountOfOtherAddOnCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOtherAddOnCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfOtherAddOnCover"),fetchValueFromTextFields(claimAmountOfOtherAddOnCoverTextField), AssertionType.WARNING);
				}
				//Mayur_Product name= PT
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ReasonForReopen"), fetchValueFromList(reasonForReopenDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictORStateORNational")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("DistrictORStateORNational"), fetchValueFromList(districtORStateORNationalDropDown), AssertionType.WARNING);
				}
				//JI-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSECIICoverRequired"),fetchValueFromList(isSECIICoverRequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionII")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSectionII"),fetchValueFromTextFields(sumInsuredForSectionIITextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIICover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIICover"),fetchValueFromTextFields(assessedLossAmountOfSECIICoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIICover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSECIICover"),fetchValueFromTextFields(claimAmountOfSECIICoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSECIIICoverRequired"),fetchValueFromList(isSECIIICoverRequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIII")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSectionIII"),fetchValueFromTextFields(sumInsuredForSectionIIITextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIIICover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIIICover"),fetchValueFromTextFields(assessedLossAmountOfSECIIICoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIIICover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSECIIICover"),fetchValueFromTextFields(claimAmountOfSECIIICoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSECIVCoverRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSECIVCoverRequired"),fetchValueFromList(isSECIVCoverRequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIV")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSectionIV"),fetchValueFromTextFields(sumInsuredForSectionIVTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIVCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSECIVCover"),fetchValueFromTextFields(assessedLossAmountOfSECIVCoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIVCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSECIVCover"),fetchValueFromTextFields(claimAmountOfSECIVCoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsCoverEXTNSALORequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsCoverEXTNSALORequired"),fetchValueFromList(isCoverEXTNSALORequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForEXTNSALOCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalSumInsuredForEXTNSALOCover"),fetchValueFromTextFields(totalSumInsuredForEXTNSALOCoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfEXTNSALOCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfEXTNSALOCover"),fetchValueFromTextFields(assessedLossAmountOfEXTNSALOCoverTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfEXTNSALOCover")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfEXTNSALOCover"),fetchValueFromTextFields(claimAmountOfEXTNSALOCoverTextfield), AssertionType.WARNING);
				}
				//PQ-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalAssessedLossAmount"),fetchValueFromTextFields(totalAssessedLossAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"),fetchValueFromList(isUnderlnsuranceApplicableDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("UnderInsuranceType"),fetchValueFromList(underInsuranceTypeDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("UnderInsurancePercent"),fetchValueFromTextFields(underInsurancePercentTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NetClaimAmount"),fetchValueFromTextFields(netClaimAmountTextField), AssertionType.WARNING);
				}
				//PY-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"),fetchValueFromTextFields(claimLossAfterUnderInsuranceTextfield), AssertionType.WARNING);
				}
				//BI-Yogesh
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTheftExtensionRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsTheftExtensionRequired"),fetchValueFromList(isTheftExtensionRequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForTheftExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForTheftExtension"),fetchValueFromTextFields(sumInsuredForTheftExtensionTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTheftExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfTheftExtension"),fetchValueFromTextFields(assessedLossAmountOfTheftExtensionTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTheftExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfTheftExtension"),fetchValueFromTextFields(claimAmountOfTheftExtensionTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsOtherExtensionRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsOtherExtensionRequired"),fetchValueFromList(isOtherExtensionRequiredDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForOtherExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForOtherExtension"),fetchValueFromTextFields(sumInsuredForOtherExtensionTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOtherExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfOtherExtension"),fetchValueFromTextFields(assessedLossAmountOfOtherExtensionTextfield), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOtherExtension")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfOtherExtension"),fetchValueFromTextFields(claimAmountOfOtherExtensionTextfield), AssertionType.WARNING);
				}
				//HH-Priyanka
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSuminsuredForSection8")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SuminsuredForSection8"),fetchValueFromTextFields(suminsuredForSection8TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC8")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC8"),fetchValueFromTextFields(excessForSEC8TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC10A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC10A"),fetchValueFromTextFields(excessForSEC10ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC10B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC10B"),fetchValueFromTextFields(excessForSEC10BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC11")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC11"),fetchValueFromTextFields(excessForSEC11TextField), AssertionType.WARNING);
				}
				//PB
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("DateOfAdmission"),fetchValueFromTextFields(dateOfAdmissionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDateOfDeath")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("DateOfDeath"),fetchValueFromTextFields(dateOfDeathTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPoliceStation")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("PoliceStation"),fetchValueFromTextFields(policeStationTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigNameOfHospitalWherePostMortemReportIsDone")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("NameOfHospitalWherePostMortemReportIsDone"),fetchValueFromTextFields(nameOfHospitalWherePostMortemReportIsDoneTextArea), AssertionType.WARNING);
				}
				//HH
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ReasonForReopen"),fetchValueFromList(reasonForReopenDropdown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigExcessForSEC09")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ExcessForSEC09"),fetchValueFromTextFields(excessForSEC09TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmount")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSurveyFees")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SurveyFees"),fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TranslatorFees"),fetchValueFromTextFields(translatorFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("LegalOpinionFees"),fetchValueFromTextFields(legalOpinionFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOther1Fees")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Other1Fees"),fetchValueFromTextFields(other1FeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigOther2Fees")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("Other2Fees"),fetchValueFromTextFields(other2FeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("DistrictStateNational"),fetchValueFromList(districtStateNationalDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupreme")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("DistrictCourtSupreme"),fetchValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown), AssertionType.WARNING);
				}
				//OS Priyanka
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection8BIncreasedCostOfWorkingRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection8BIncreasedCostOfWorkingRequired"),fetchValueFromList(isSection8BIncreasedCostOfWorkingRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection8B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection8B"),fetchValueFromTextFields(sumInsuredForSection8BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection8B"),fetchValueFromTextFields(assessedLossAmountOfSection8BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection8B"),fetchValueFromTextFields(claimAmountOfSection8BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection9PortableEquipmentRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection9PortableEquipmentRequired"),fetchValueFromList(isSection9PortableEquipmentRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection9")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection9"),fetchValueFromTextFields(assessedLossAmountOfSection9TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection9")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection9"),fetchValueFromTextFields(claimAmountOfSection9TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection10AdditionalExpensesOfRentRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection10AdditionalExpensesOfRentRequired"),fetchValueFromList(isSection10AdditionalExpensesOfRentRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection10")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection10"),fetchValueFromTextFields(sumInsuredForSection10TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection10")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection10"),fetchValueFromTextFields(assessedLossAmountOfSection10TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection10")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection10"),fetchValueFromTextFields(claimAmountOfSection10TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection11PersonalAccidentRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection11PersonalAccidentRequired"),fetchValueFromList(isSection11PersonalAccidentRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("CapitalSumInsured"),fetchValueFromTextFields(capitalSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection11")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection11"),fetchValueFromTextFields(assessedLossAmountOfSection11TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection11")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection11"),fetchValueFromTextFields(claimAmountOfSection11TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection12BreakDownOfOffAppReq")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection12BreakDownOfOffAppReq"),fetchValueFromList(isSection12BreakDownOfOfficeApplianceRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection12")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection12"),fetchValueFromTextFields(sumInsuredForSection12TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection12")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection12"),fetchValueFromTextFields(assessedLossAmountOfSection12TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection12")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection12"),fetchValueFromTextFields(claimAmountOfSection12TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection13BaggageRequired")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection13BaggageRequired"),fetchValueFromList(isSection13BaggageRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalBaggageSumInsured")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalBaggageSumInsured"),fetchValueFromTextFields(totalBaggageSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection13")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection13"),fetchValueFromTextFields(assessedLossAmountOfSection13TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection13")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection13"),fetchValueFromTextFields(claimAmountOfSection13TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSect14PubLiabilityInsreq")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSect14PubLiabilityInsreq"),fetchValueFromList(isSection14APublicLiabilityInsuranceRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigLimitOfLiability")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("LimitOfLiability"),fetchValueFromTextFields(limitOfLiabilityTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection14A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection14A"),fetchValueFromTextFields(assessedLossAmountOfSection14ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection14A")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection14A"),fetchValueFromTextFields(claimAmountOfSection14ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection14BWorkmens")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection14BWorkmens"),fetchValueFromList(isSection14BWorkmensCompensationRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsured")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection14B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection14B"),fetchValueFromTextFields(assessedLossAmountOfSection14BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection14B")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection14B"),fetchValueFromTextFields(claimAmountOfSection14BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsSection15Professional")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsSection15Professional"),fetchValueFromList(isSection15ProfessionalIndemnityAvailableRequiredDropDown), AssertionType.WARNING);
					if(claimRiskProp3MNLEntity.getStringValueForField("Product").equalsIgnoreCase("OS")) {
						click(nextButton);
					}
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection15")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("SumInsuredForSection15"),fetchValueFromTextFields(sumInsuredForSection15TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection15")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("AssessedLossAmountOfSection15"),fetchValueFromTextFields(assessedLossAmountOfSection15TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection15")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimAmountOfSection15"),fetchValueFromTextFields(claimAmountOfSection15TextField), AssertionType.WARNING);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequiredOS")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsTerrorismCoverRequiredOS"),fetchValueFromTextFields(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
					click(nextButton);
				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimOS")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("ClaimOS"),fetchValueFromTextFields(claimDropDown), AssertionType.WARNING);

				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmountOS")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("TotalAssessedLossAmountOS"),fetchValueFromTextFields(totalAssessedLossAmountTextField), AssertionType.WARNING);

				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicableOs")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("IsUnderlnsuranceApplicableOs"),fetchValueFromTextFields(isUnderlnsuranceApplicableDropDown), AssertionType.WARNING);

				}
				if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigUnderInsuranceTypeOS")) {
					assertReference.assertEquals(claimRiskProp3MNLEntity.getStringValueForField("UnderInsuranceType"),fetchValueFromTextFields(underInsuranceTypeDropdown), AssertionType.WARNING);

				}
			}
		}
	}

	public void navigateNextToCommonClaimRiskProperty(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			/*nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskProp3MNLEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);*/
		}
	}	
	public void navigatePreviousToClaimRiskProperty(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(claimRiskProperty2Title);			
		}
	}	
	public void navigateToMainAttributePage(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void navigateToSaveButton(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity){
		if (claimRiskProp3MNLEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProp3MNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskProperty3ForMiscNonLiabilityDetails(claimRiskProp3MNLEntity, assertReference);
			navigateNextToCommonClaimRiskProperty(claimRiskProp3MNLEntity);
			navigateToSaveButton(claimRiskProp3MNLEntity);
			navigateToMainAttributePage(claimRiskProp3MNLEntity);
			navigateToclaimHomePage(claimRiskProp3MNLEntity);
			navigateToInsuredItem(claimRiskProp3MNLEntity);
			navigateToDocument(claimRiskProp3MNLEntity);
			navigateToParties(claimRiskProp3MNLEntity);
			navigateToReserve(claimRiskProp3MNLEntity);
			navigateToPayment(claimRiskProp3MNLEntity);
			navigateToAttribute(claimRiskProp3MNLEntity);
			navigateToInsuredItemDetails(claimRiskProp3MNLEntity);
			navigateTInsuredItemAttribute(claimRiskProp3MNLEntity);
		}
	}
}
