package com.aqm.staf.library.pages.creditShield;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPartiesFinanSumayEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;

public class ClaimPartiesClaimPartyFinancialSummary extends BasePage {

	private PageElement claimPartyFinancialSummaryTitle;

	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;

	private PageElement applicableEventCodeLabel;


	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;

	private PageElement typeOfSurveyDropdown;
	private PageElement dateOfAppointmentTextField;
	private PageElement dateOfSurveyTextField;
	private PageElement placeOfSurveyTextArea;
	private PageElement expectedSurveyReportSubmissionDateTextField;
	private PageElement surveyCommentsTextArea;
	private PageElement assessedAmountTextField;
	private PageElement otherExpensesTextField;
	private PageElement totalFeesTextField;
	private PageElement surveyFeesTextField;
	private PageElement serviceTaxTextField;
	private PageElement actualReportSubmissionDateTextField;
	private PageElement barCouncilEnrollmentNoTextField;

	private PageElement saveButton;
	private PageElement backButton;

	private PageElement backButtonTitle;
	//ST
	private PageElement surveyReportNumberTextField;
	private PageElement surveyReportDateTextField;
	private PageElement surveyReportDateFindButton;

	private PageElement qualityOfAssessmentSurveyorDropdown;
	private PageElement technicalCompetencyOftheSurveyorDropdown;
	private PageElement expectedDateOfReportTextField;
	private PageElement advocateSolicitorTypeDropdown;
	private PageElement estimatedSurveyAndLegalFeesTextField;

	private PageElement surveyCommentsMicroTextArea;
	//YI
	private PageElement surveyorCategoryDropdown;
	private PageElement surveyorLicenseNumberTextField;
	private PageElement surveyorLicenseStartDateTextField;
	private PageElement surveyorLicenseExpiryDateTextField;
	private PageElement serviceTaxForPreliminarySurveyTextField;
	private PageElement surveyCommentsYITextArea;
	private PageElement surveyorLicenseStartDateFindButton;
	private PageElement surveyorLicenseExpiryDateFindButton;
	private PageElement qualityOfAssessmentDropdown;
	private PageElement technicalCompetencyDropdown;

	//akshata

	private PageElement technicalExpertReportNoTextArea;
	private PageElement dateofVisitTextField;
	private PageElement dateofVisitFindButton;
	private PageElement technicalExpertReportDateFindButton;
	private PageElement technicalExpertReportDateTextField;
	private PageElement technicalExpertReportSubmissionDateFindButton;
	private PageElement technicalExpertReportSubmissionDateTextField;
	private PageElement technicalExpertCommentsTextArea;
	private PageElement technicalExpertFeesTextField;
	private PageElement surveyCommentFireTextArea;
	//Engineering
	private PageElement surveyCommentsEngineeringTextarea;

	private PageElement surveyCommentMisNonTextArea;

	//MiscNonLiability-BC
	private PageElement typeOfSurveyForSurveyorDropdown;
	private PageElement surveyCommentTextArea;
	private PageElement qualityOfAssessmentofSurveyorDropdown;
	private PageElement technicalCompetencyofTheSurveyorDropdown;

	//LN
	private PageElement surveyCommentLNTextArea;
	private PageElement surveyCommentsMotorTextarea;
	private PageElement partyCodeLabelForIC;
	private PageElement partyNameLabelForIC;

	public ClaimPartiesClaimPartyFinancialSummary(WebDriver driver, String pageName) {
		super(driver, pageName);

		claimPartyFinancialSummaryTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Party Financial Summary')]"), "Claim Party Financial Summary Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTab = new PageElement(By.xpath("//div[contains(text(),'Claim')]"),"Claim Page Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTab = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab= new PageElement(By.linkText("Parties"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.linkText("Reserve"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.linkText("Payment"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.linkText("Attributes"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimNumberLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'number')]/following::td"), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//div//b[contains(text(),'Number')]/following::td/a"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Date')]/following::td"), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Status')]/following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Party Code')]/following::td"), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Party Name')]/following::td"), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath("//tr//td//div//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		applicableEventCodeLabel = new PageElement(By.xpath("//td//b[contains(text(),'Applicable Event Code')]/following::td"), "Applicable Event Code Label", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);


		typeOfSurveyDropdown = new PageElement(By.xpath("//div//b[contains(text(),'Type of Survey')]/following::select"), "Type of Survey Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfAppointmentTextField = new PageElement(By.xpath("//div//b[contains(text(),'Date of Appointment')]/following::input[1]"), " Date of Appointment Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfSurveyTextField = new PageElement(By.xpath("//div//b[contains(text(),'Date of survey')]/following::input[1]"), "Date of survey Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfSurveyTextArea = new PageElement(By.xpath("//div//b[contains(text(),'Place of Survey')]/following::textarea"), "Place of Survey Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expectedSurveyReportSubmissionDateTextField = new PageElement(By.xpath("//div//b[contains(text(),'Expected Survey Report Submission Date')]/following::input[1]"), " Expected Survey Report Submission Date Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyCommentsTextArea = new PageElement(By.xpath("//div//b[contains(text(),'Survey comments')]/following::textarea"), "Survey comments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedAmountTextField = new PageElement(By.xpath("//div//b[contains(text(),'Assessed Amount')]/following::input[1]"), " Assessed Amount Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherExpensesTextField = new PageElement(By.xpath("//div//b[contains(text(),'Other Expenses')]/following::input[1]"), "Other Expenses Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalFeesTextField = new PageElement(By.xpath("//div//b[contains(text(),'Total Fees')]/following::input[1]"), "Total Fees Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField = new PageElement(By.xpath("//div//b[contains(text(),'Survey Fees')]/following::input[1]"), " Survey Fees Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serviceTaxTextField = new PageElement(By.xpath("//div//b[contains(text(),'Service Tax')]/following::input[1]"), " Service Tax Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		actualReportSubmissionDateTextField = new PageElement(By.xpath("//div//b[contains(text(),'Actual Report Submission Date')]/following::input[1]"), " Actual Report Submission Date Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured Interest Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),' Documents')]"), "Document Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payment Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		backButtonTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Back Button Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Abhijit
		barCouncilEnrollmentNoTextField=new PageElement(By.xpath(locatorforPanel("Bar council Enrollment No", "input")), "Bar Council Enrollment No TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//ST
		surveyReportNumberTextField=new PageElement(By.xpath(locatorforPanel("Survey Report No", "input")), "Survey Report No TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyReportDateTextField=new PageElement(By.xpath("//div//b[contains(text(),'Survey Report Date')]/following::input[1]"), "Survey Report Date Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyReportDateFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Survey Report Date')]/following::td/a/img"), "Survey Report Date'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		qualityOfAssessmentSurveyorDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Quality of Assessment of Surveyor')]/following::select"), "quality Of Assessment Surveyor Dropdown", false , WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		technicalCompetencyOftheSurveyorDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Technical Competency of the Surveyor')]/following::select"), "technical Competency Of the Surveyor Dropdown", false , WaitType.WAITFORELEMENTTOBEEENABLED,10);
		advocateSolicitorTypeDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Advocate_Solicitor Type')]/following::select"), "advocate Solicitor Type Dropdown", false , WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expectedDateOfReportTextField=new PageElement(By.xpath("//div//b[contains(text(),'Expected Date Of Report')]/following::input"), "expected Date Of Report TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		estimatedSurveyAndLegalFeesTextField=new PageElement(By.xpath("//div//b[contains(text(),'Estimated Survey')]/following::input"), "estimated Survey And Legal Fees TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		//YI
		surveyorCategoryDropdown=new PageElement(By.xpath(locatorforPanel("Surveyor Category", "select")), "Surveyor Category DropDown", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		surveyorLicenseNumberTextField=new PageElement(By.xpath(locatorforPanel("Surveyor License Number", "input")), "Surveyor License Number TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseStartDateTextField=new PageElement(By.xpath(locatorforPanel("Surveyor License Start Date", "input")), "Surveyor License Start Date TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseExpiryDateTextField=new PageElement(By.xpath(locatorforPanel("Surveyor License Expiry Date", "input")), "Surveyor License Expiry Date TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serviceTaxForPreliminarySurveyTextField=new PageElement(By.xpath(locatorforPanel("Service Tax for Preliminary Survey", "input")), "Bar Council Enrollment No TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyCommentsYITextArea=new PageElement(By.xpath(locatorforPanel("Survey comments", "textarea")), "Survey comments TextArea", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseStartDateFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Surveyor License Start Date')]/following::td/a/img"), "Surveyor License Start Date'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		surveyorLicenseExpiryDateFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Surveyor License Expiry Date')]/following::td/a/img"), "Surveyor License Expiry Date'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		surveyCommentsMicroTextArea = new PageElement(By.xpath("//div//b[contains(text(),'Survey comment')]/following::textarea"), "Survey comments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		qualityOfAssessmentDropdown=new PageElement(By.xpath(locatorforPanel("Quality Of Assessment", "select")), "Quality Of Assessment DropDown", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalCompetencyDropdown=new PageElement(By.xpath(locatorforPanel("Technical Competency", "select")), "Technical Competency DropDown", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//akshata
		technicalExpertReportNoTextArea=new PageElement(By.xpath(locatorforPanel("Technical Expert Report No", "textarea")), "Technical Expert Report No TextArea", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofVisitTextField=new PageElement(By.xpath(locatorforPanel("Date of Visit", "input")), "Date of Visit TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofVisitFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Date of Visit')]/following::td/a/img"), "Date of Visit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		technicalExpertReportDateFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Technical Expert Report Date')]/following::td/a/img"), "Technical Expert Report Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		technicalExpertReportDateTextField=new PageElement(By.xpath("//td//div[@id='Technical Expert Report Date']/following::input[1]"), "Technical Expert Report Date TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertReportSubmissionDateFindButton=new PageElement(By.xpath("//div//b[contains(text(),'Technical Expert Report Submission Date')]/following::td/a/img"), "Technical Expert Report Submission Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		technicalExpertReportSubmissionDateTextField=new PageElement(By.xpath("//td//div[@id='Technical Expert Report Submission Date']/following::input[1]"), "Technical Expert Report Submission Date TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertCommentsTextArea=new PageElement(By.xpath(locatorforPanel("Technical Expert Comments", "textarea")), "Technical Expert Comments TextArea", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalExpertFeesTextField=new PageElement(By.xpath("//div[@id='Technical Expert Fees']/input"), "Technical Expert Fees TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surveyCommentFireTextArea=new PageElement(By.xpath("//div//b[contains(text(),'Survey Comment')]/following::textarea"), "Survey comments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Engineering
		surveyCommentsEngineeringTextarea=new PageElement(By.xpath("//div//b[contains(text(),'Survey comments')]/following::textarea"), "Survey comments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyCommentsMotorTextarea= new PageElement(By.xpath("//div//b[contains(text(),'Survey comments')]//following::textarea[1]"), "Survey Comments", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyCommentMisNonTextArea=new PageElement(By.xpath("//div//b[contains(text(),'Survey Comment')]/following::textarea"), "Survey Comments TextArea", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//MiscNonLiability-BC
		typeOfSurveyForSurveyorDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Type of Survey For Surveyor')]/following::select"), "Type of Survey For Surveyor Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		surveyCommentTextArea=new PageElement(By.xpath("//div//b[contains(text(),'Survey Comment')]/following::textarea"), "Survey comment Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		qualityOfAssessmentofSurveyorDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Quality of Assessment of Surveyor')]/following::select"), "Quality of Assessment of Surveyor Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		technicalCompetencyofTheSurveyorDropdown=new PageElement(By.xpath("//div//b[contains(text(),'Technical Competency of the Surveyor')]/following::select"), "Technical Competency of the Surveyor Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//LN
		surveyCommentLNTextArea= new PageElement(By.xpath("//div//b[contains(text(),'Survey Comment')]/following::textarea"), "Survey comments LN TextArea ", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeLabelForIC = new PageElement(By.name("pPartyCode"), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabelForIC = new PageElement(By.name("pPartyName"), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillClaimPartiesClaimPartyFinancialSummary(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity, CustomAssert assertReference) throws InterruptedException, ParseException{

		if(claimPartiesFinanSumayEntity.getAction().equalsIgnoreCase("add") 
				|| claimPartiesFinanSumayEntity.getAction().equalsIgnoreCase("edit")){

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTypeOfSurvey")) {
				selectValueFromList(typeOfSurveyDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TypeOfSurvey"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateOfAppointment")) {
				String dateOfAppointment=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("DateOfAppointment"));
				clearAndEnterDate(dateOfAppointmentTextField, dateOfAppointment);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateOfSurvey")) {
				String dateOfSurvey=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("DateOfSurvey"));
				clearAndEnterDate(dateOfSurveyTextField, dateOfSurvey);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPlaceOfSurvey")) {
				clearAndSendKeys(placeOfSurveyTextArea, claimPartiesFinanSumayEntity.getStringValueForField("PlaceOfSurvey"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigMotorSurveyComments")) {
				clearAndSendKeys(surveyCommentsMotorTextarea, claimPartiesFinanSumayEntity.getStringValueForField("MotorSurveyComments"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigExpectedSurveyReportSubmissionDate")) {
				String expectedSurveyReportSubmissionDate=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ExpectedSurveyReportSubmissionDate"));
				clearAndEnterDate(expectedSurveyReportSubmissionDateTextField, expectedSurveyReportSubmissionDate);
			}

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyComments")) {
				if((claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("PP")|| claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("CT")||claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("DO")||claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("PK")) || claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")|| claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull")|| (claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")&& (!claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("RK")))){
					clearAndSendKeys(surveyCommentMisNonTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyComments"));
				}
				else{
					clearAndSendKeys(surveyCommentsTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyComments"));
				}
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				clearAndSendKeys(assessedAmountTextField, claimPartiesFinanSumayEntity.getStringValueForField("AssessedAmount"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigOtherExpenses")) {
				clearAndSendKeys(otherExpensesTextField, claimPartiesFinanSumayEntity.getStringValueForField("OtherExpenses"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTotalFees")) {
				clearAndSendKeys(totalFeesTextField, claimPartiesFinanSumayEntity.getStringValueForField("TotalFees"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyFees")) {
				clearAndSendKeys(surveyFeesTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyFees"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigServiceTax")) {
				clearAndSendKeys(serviceTaxTextField, claimPartiesFinanSumayEntity.getStringValueForField("ServiceTax"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigActualReportSubmissionDate")) {
				String actualReportSubmissionDate=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ActualReportSubmissionDate"));
				clearAndEnterDate(actualReportSubmissionDateTextField, actualReportSubmissionDate);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigBarCouncilEnrollmentNo")) {
				clearAndSendKeys(barCouncilEnrollmentNoTextField, claimPartiesFinanSumayEntity.getStringValueForField("BarCouncilEnrollmentNo"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyReportNo")) {
				clearAndSendKeys(surveyReportNumberTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyReportNo"));
			}
			/*if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyReportDate")) {
				String surveyReportDate=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("SurveyReportDate"));
				clearAndEnterDate(surveyReportDateTextField, surveyReportDate);
			}*/
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyReportDate")) {
				click(surveyReportDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(surveyReportDateTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyReportDate"));
				switchToFrame("display");
			}
			//Abhijit
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityAssessmentSurveyor")) {
				selectValueFromList(qualityOfAssessmentSurveyorDropdown, claimPartiesFinanSumayEntity.getStringValueForField("QualityAssessmentSurveyor"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetencySurveyor")) {
				selectValueFromList(technicalCompetencyOftheSurveyorDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetencySurveyor"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigExpectedDateOfReport")) {
				String expectedDateOfReport=RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ExpectedDateOfReport"));
				clearAndEnterDate(expectedDateOfReportTextField, expectedDateOfReport);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigAdvocateSolicitorType")) {
				selectValueFromList(advocateSolicitorTypeDropdown, claimPartiesFinanSumayEntity.getStringValueForField("AdvocateSolicitorType"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigEstimatedSurveyLegalFees")) {
				clearAndSendKeys(estimatedSurveyAndLegalFeesTextField, claimPartiesFinanSumayEntity.getStringValueForField("EstimatedSurveyLegalFees"));
			}
			//YI
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorCategory")) {
				selectValueFromList(surveyorCategoryDropdown, claimPartiesFinanSumayEntity.getStringValueForField("SurveyorCategory"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseNumber")) {
				clearAndSendKeys(surveyorLicenseNumberTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseNumber"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseStartDate")) {
				click(surveyorLicenseStartDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(surveyorLicenseStartDateTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseStartDate"));
				switchToFrame("display");
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseExpiryDate")) {
				click(surveyorLicenseExpiryDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(surveyorLicenseExpiryDateTextField, claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseExpiryDate"));
				switchToFrame("display");
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigServiceTaxForPreliminarySurvey")) {
				clearAndSendKeys(serviceTaxForPreliminarySurveyTextField, claimPartiesFinanSumayEntity.getStringValueForField("ServiceTaxForPreliminarySurvey"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsYI")) {
				clearAndSendKeys(surveyCommentsYITextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsYI"));
			}
			//@ rasika
			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsMicro")) {
					clearAndSendKeys(surveyCommentsMicroTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsMicro"));
				}
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityOfAssessment")) {
				selectValueFromList(qualityOfAssessmentDropdown, claimPartiesFinanSumayEntity.getStringValueForField("QualityOfAssessment"));
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetency")) {
				selectValueFromList(technicalCompetencyDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetency"));
			}

			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportNo")) {
					clearAndSendKeys(technicalExpertReportNoTextArea, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportNo"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateofVisit")) {
					click(dateofVisitFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateofVisitTextField, claimPartiesFinanSumayEntity.getStringValueForField("DateofVisit"));
					switchToFrame("display");
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportDate")) {
					click(technicalExpertReportDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(technicalExpertReportDateTextField, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportDate"));
					switchToFrame("display");
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportSubmissionDate")) {
					click(technicalExpertReportSubmissionDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(technicalExpertReportSubmissionDateTextField, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportSubmissionDate"));
					switchToFrame("display");
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertComments")) {
					clearAndSendKeys(technicalExpertCommentsTextArea, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertComments"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertFees")) {
					clearAndSendKeys(technicalExpertFeesTextField, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertFees"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetency")) {
					selectValueFromList(technicalCompetencyDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetency"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityOfAssessment")) {
					selectValueFromList(qualityOfAssessmentDropdown, claimPartiesFinanSumayEntity.getStringValueForField("QualityOfAssessment"));
				}
			}
			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsFire")) {
					clearAndSendKeys(surveyCommentFireTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsFire"));
				}
			}
			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsEngineering")) {
					clearAndSendKeys(surveyCommentsEngineeringTextarea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsEngineering"));
				}
			}

			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsMiscNon")) {
					clearAndSendKeys(surveyCommentMisNonTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsMiscNon"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTypeOfSurveyForSurveyor")) {
					selectValueFromList(typeOfSurveyForSurveyorDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TypeOfSurveyForSurveyor"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyComment")) {
					clearAndSendKeys(surveyCommentTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyComment"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityOfAssessmentofSurveyor")) {
					selectValueFromList(qualityOfAssessmentofSurveyorDropdown, claimPartiesFinanSumayEntity.getStringValueForField("QualityOfAssessmentofSurveyor"));
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetencyofTheSurveyor")) {
					selectValueFromList(technicalCompetencyofTheSurveyorDropdown, claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetencyofTheSurveyor"));
				}
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsLN")) {
				clearAndSendKeys(surveyCommentLNTextArea, claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsLN"));
			}
		}



		else if(claimPartiesFinanSumayEntity.getAction().equalsIgnoreCase("verify")){

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ClaimDate")) ,fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigMotorSurveyComments")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("MotorSurveyComments"),fetchValueFromTextFields(surveyCommentsMotorTextarea), AssertionType.WARNING);
			}

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPartyCode")) {
				if(!claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("IC")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PartyCode"),fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
				}
					else {
						assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PartyCode"),fetchValueFromTextFields(partyCodeLabelForIC), AssertionType.WARNING);

				}
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPartyName")) {
				if(!claimPartiesFinanSumayEntity.getStringValueForField("Product").equalsIgnoreCase("IC")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PartyName").trim(),fetchValueFromFields(partyNameLabel).trim(), AssertionType.WARNING);
				}
				else {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PartyName").trim(),fetchValueFromTextFields(partyNameLabelForIC).trim(), AssertionType.WARNING);

				}
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTypeOfSurvey")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TypeOfSurvey"),fetchValueFromList(typeOfSurveyDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateOfAppointment")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("DateOfAppointment")), fetchValueFromTextFields(dateOfAppointmentTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateOfSurvey")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("DateOfSurvey")) ,fetchValueFromTextFields(dateOfSurveyTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPlaceOfSurvey")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("PlaceOfSurvey"),fetchValueFromFields(placeOfSurveyTextArea), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigExpectedSurveyReportSubmissionDate")) {
				String date=convertDate(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ExpectedSurveyReportSubmissionDate")));
				assertReference.assertEquals(date.trim() ,fetchValueFromTextFields(expectedSurveyReportSubmissionDateTextField).trim(), AssertionType.WARNING);
			}
			/*if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyComments")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyComments"),fetchValueFromFields(surveyCommentsTextArea), AssertionType.WARNING);
			}*/
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("AssessedAmount"),fetchValueFromTextFields(assessedAmountTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigOtherExpenses")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("OtherExpenses"),fetchValueFromTextFields(otherExpensesTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTotalFees")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TotalFees"),fetchValueFromTextFields(totalFeesTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyFees")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyFees"),fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigServiceTax")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ServiceTax"),fetchValueFromTextFields(serviceTaxTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigActualReportSubmissionDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ActualReportSubmissionDate")) ,fetchValueFromTextFields(actualReportSubmissionDateTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigBarCouncilEnrollmentNo")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("BarCouncilEnrollmentNo"),fetchValueFromTextFields(barCouncilEnrollmentNoTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyReportNo")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyReportNo"),fetchValueFromTextFields(surveyReportNumberTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyReportDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("SurveyReportDate")) ,fetchValueFromTextFields(surveyReportDateTextField), AssertionType.WARNING);
			}

			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityAssessmentSurveyor")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("QualityAssessmentSurveyor"),fetchValueFromList(qualityOfAssessmentSurveyorDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetencySurveyor")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetencySurveyor"),fetchValueFromList(technicalCompetencyOftheSurveyorDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigExpectedDateOfReport")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("ExpectedDateOfReport")),fetchValueFromTextFields(expectedDateOfReportTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigAdvocateSolicitorType")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("AdvocateSolicitorType"),fetchValueFromList(advocateSolicitorTypeDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigEstimatedSurveyLegalFees")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("EstimatedSurveyLegalFees"),fetchValueFromTextFields(estimatedSurveyAndLegalFeesTextField), AssertionType.WARNING);
			}
			////YI
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorCategory")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyorCategory"),fetchValueFromList(surveyorCategoryDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseNumber")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseNumber"),fetchValueFromTextFields(surveyorLicenseNumberTextField), AssertionType.WARNING);		
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseStartDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseStartDate")),fetchValueFromTextFields(surveyorLicenseStartDateTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyorLicenseExpiryDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("SurveyorLicenseExpiryDate")),fetchValueFromTextFields(surveyorLicenseExpiryDateTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigServiceTaxForPreliminarySurvey")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("ServiceTaxForPreliminarySurvey"),fetchValueFromTextFields(serviceTaxForPreliminarySurveyTextField), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsYI")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsYI"),fetchValueFromTextFields(surveyCommentsYITextArea), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityOfAssessment")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("QualityOfAssessment"),fetchValueFromList(qualityOfAssessmentDropdown), AssertionType.WARNING);
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetency")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetency"),fetchValueFromList(technicalCompetencyDropdown), AssertionType.WARNING);
			}
			//@ rasika
			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsMicro")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsMicro"),fetchValueFromFields(surveyCommentsMicroTextArea), AssertionType.WARNING);
				}
			}

			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportNo")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportNo"),fetchValueFromTextFields(technicalExpertReportNoTextArea), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDateofVisit")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("DateofVisit")),fetchValueFromTextFields(dateofVisitTextField), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportDate")),fetchValueFromTextFields(technicalExpertReportDateTextField), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertReportSubmissionDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertReportSubmissionDate")),fetchValueFromTextFields(technicalExpertReportSubmissionDateTextField), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertComments")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertComments"),fetchValueFromTextFields(technicalExpertCommentsTextArea), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalExpertFees")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalExpertFees"),fetchValueFromTextFields(technicalExpertFeesTextField), AssertionType.WARNING);
				}

			}
			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsFire")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsFire"),fetchValueFromFields(surveyCommentFireTextArea), AssertionType.WARNING);
				}
			}

			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsEngineering")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsEngineering"),fetchValueFromFields(surveyCommentsEngineeringTextarea), AssertionType.WARNING);
				}
			}

			if(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsMiscNon")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsMiscNon"),fetchValueFromTextFields(surveyCommentMisNonTextArea), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTypeOfSurveyForSurveyor")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TypeOfSurveyForSurveyor"),fetchValueFromList(typeOfSurveyForSurveyorDropdown), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyComment")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyComment"),fetchValueFromTextFields(surveyCommentTextArea), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigQualityOfAssessmentofSurveyor")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("QualityOfAssessmentofSurveyor"),fetchValueFromList(qualityOfAssessmentofSurveyorDropdown), AssertionType.WARNING);
				}
				if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigTechnicalCompetencyofTheSurveyor")) {
					assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("TechnicalCompetencyofTheSurveyor"),fetchValueFromList(technicalCompetencyofTheSurveyorDropdown), AssertionType.WARNING);
				} 
			}
			if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSurveyCommentsLN")) {
				assertReference.assertEquals(claimPartiesFinanSumayEntity.getStringValueForField("SurveyCommentsLN"),fetchValueFromTextFields(surveyCommentLNTextArea), AssertionType.WARNING);
			}
		}
	}

	public void navigateToClaimTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTitle);
		}
	}
	public void navigateToInsuredItemTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigInsuredItemTab")){
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTitle);
		}
	}
	public void navigateToDocumentTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTitle);
		}
	}
	public void navigateToPartiesTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTitle);
		}
	}
	public void navigateToAttributeTab(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity){
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTitle);
		}
	}
	public void saveFromClaimPartyFinancialSummary(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity) throws InterruptedException {
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			driver.switchTo().alert().accept();
			driver.switchTo().alert().accept();
			if(((claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull"))))
			{
			if(claimPartiesFinanSumayEntity.getStringValueForField("Browser").equalsIgnoreCase("IE")) {
				try{
					handleAlert();
					handleAlert();
					handleAlert();
				}catch(Exception e) {
					handleAlert();
				}
			}else {
				driver.switchTo().alert().accept();
			}
			//switchToWindow();
			switchToFrame("display");


		}
		}
	}
	public void backFromClaimPartyFinancialSummary(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity) {
		if (claimPartiesFinanSumayEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(backButtonTitle);
		}
	}



	public void fillandSubmitClaimPartiesClaimPartyFinancialSummary(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntity, CustomAssert assertReference) throws InterruptedException, ParseException {
		/*if (isConfigTrue(claimPartiesFinanSumayEntity.getConfigExecute()))
		{*/

		if(claimPartiesFinanSumayEntity.getAction().equalsIgnoreCase("add") || claimPartiesFinanSumayEntity.getAction().equalsIgnoreCase("edit"))
		{
			if(!(((claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo"))
					||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")))))
			{

				driver.switchTo().alert().accept();
				try 
				{
					driver.switchTo().alert().accept();
				}
				catch (Exception e)
				{

				}
				switchToFrame("display");
			}
		}
			else 
			{
				if(!((claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull"))
						||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural"))
						||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance"))
						||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))
						||(claimPartiesFinanSumayEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire"))))
				{
					try
					{

						driver.switchTo().alert().accept();
					} catch (Exception e) {

					}
					
					switchToFrame("display");
				}
			
		}//switchToFrame("display");
		fillClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntity, assertReference);
		navigateToClaimTab(claimPartiesFinanSumayEntity);
		navigateToInsuredItemTab(claimPartiesFinanSumayEntity);
		navigateToDocumentTab(claimPartiesFinanSumayEntity);
		navigateToPartiesTab(claimPartiesFinanSumayEntity);
		navigateToReserveTab(claimPartiesFinanSumayEntity);
		navigateToPaymentTab(claimPartiesFinanSumayEntity);
		navigateToAttributeTab(claimPartiesFinanSumayEntity);
		saveFromClaimPartyFinancialSummary(claimPartiesFinanSumayEntity);
		backFromClaimPartyFinancialSummary(claimPartiesFinanSumayEntity);

	}
}

