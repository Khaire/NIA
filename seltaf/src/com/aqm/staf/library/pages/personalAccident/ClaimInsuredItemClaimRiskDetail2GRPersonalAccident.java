package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimInsrRiskDetl2GrPAEntity;

public class ClaimInsuredItemClaimRiskDetail2GRPersonalAccident extends BasePage {

	private PageElement claimRiskDetail2GRTitle;

	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributesTab;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel; 
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributesTabTitle;

	private PageElement applicableEventCodeLabel;

	private PageElement previousPolicyNumberTextField;
	private PageElement natureOfTreatmentDropDown;
	private PageElement policeStationTextField;
	private PageElement nameOfHospitalWherePostMortemReportIsDoneTextArea;

	private PageElement commonClaimRiskPropertyTitle;
	private PageElement claimDetailsForMemberTitle;
	private PageElement claimInsuredPropertyTitle;

	private PageElement dateOfAdmissionInHospitalTextField;
	private PageElement nameAndPlaceoftheHospitalTextField;
	private PageElement dateofDischargefromtheHospitalTextField;
	private PageElement dateofCompletionofTreatmentTextField;
	private PageElement totalMedicalExpensesTextField;
	private PageElement dateofCommencementofTreatmentTextField;
	private PageElement totalDateofCompletionofTreatmentTextField;
	private PageElement totalMedicalExpensesOPDTextField;
	private PageElement periodOfLeaveAsPerleaveCertificateFromTheEmployerFromTextField;
	private PageElement periodOfLeaveAsPerleaveCertificateFromTheEmployerToTextField;
	private PageElement fitnessCertificatefromDoctorFromTextField;
	private PageElement fitnessCertificatefromDoctorToTextField;
	private PageElement dateofdeathTextField;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;

	public ClaimInsuredItemClaimRiskDetail2GRPersonalAccident(WebDriver driver, String pageName)
	{
		super(driver, pageName);
		claimRiskDetail2GRTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Detail2 (GR)')]"), "Claim Risk Detail2 (Non GR) Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTab = new PageElement(By.xpath("//a[@title='Claim']"),"Claim Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTab = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a[@title='Document']"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a[@title='Parties']"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a[@title='Reserve']"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a[@title='Payment']"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a[@title='Payment']/following::td"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//div//a//b/font[contains(text(),'Details')]"), "Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredItemAttributesTab = new PageElement(By.xpath("//div//a//b/font[contains(text(),'Attributes')]"), "Attributes Tab", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'number')]/following::td"), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Policy')]/following::td"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Date')]/following::td"), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Status')]/following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Item Code')]/following::td"), "Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Claim Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"),"Claim Insured Item Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"),"Claim Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"),"Claim Parties Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"),"Claim Reserve Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		paymentTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"),"Claim Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		attributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured InterestDamage Detail')]"),"Claim Insured Item Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemAttributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"),"Claim Insured Item Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		previousPolicyNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentDropDown=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Nature of Treatment')]/following::select"), "Nature of Treatment DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE , 10);
		policeStationTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Police Station')]/following::input"), "Police Station Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED , 10);
		nameOfHospitalWherePostMortemReportIsDoneTextArea=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Name of Hospital where Post-mortem report is done')]/following::textarea"), "Expenses incurred for carriage of dead body to the place of residence TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Previous"), "Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		commonClaimRiskPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), "Common Claim Risk Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDetailsForMemberTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Details for MEMBER')]"), "Claim Details for MEMBER Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		dateOfAdmissionInHospitalTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of Admission in hospital')]/following::input"), "Date of Admission in hospital ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofDischargefromtheHospitalTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of Discharge from the Hospital')]/following::input"), "Date of Discharge from the Hospital", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameAndPlaceoftheHospitalTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Name and Place of the Hospital')]/following::input"), "Name and Place of the Hospital", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofCompletionofTreatmentTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of completion of treatment')]/following::input"), "Date of completion of treatment", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalMedicalExpensesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Total Medical expenses')]/following::input"), "Total Medical expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofCommencementofTreatmentTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of commencement of treatment')]/following::input"), "Date of commencement of treatment", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalDateofCompletionofTreatmentTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of completion of treatment')]/following::input"), "Date of completion of treatment", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalMedicalExpensesOPDTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Total Medical expenses (OPD)')]/following::input"), "Total Medical expenses (OPD)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodOfLeaveAsPerleaveCertificateFromTheEmployerFromTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Period of leave as per leave certificate from the employer (From)')]/following::input"), "Period of leave as per leave certificate from the employer (From)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodOfLeaveAsPerleaveCertificateFromTheEmployerToTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Period of leave as per leave certificate from the employer (To)')]/following::input"), "Period of leave as per leave certificate from the employer (To)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fitnessCertificatefromDoctorFromTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Fitness certificate from Doctor (To Date)')]/following::input"), "Period of leave as per leave certificate from the employer (To)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fitnessCertificatefromDoctorToTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Fitness certificate from Doctor (From Date)')]/following::input"), "Period of leave as per leave certificate from the employer (From)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		dateofdeathTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of death')]/following::input"), "Period of leave as per leave certificate from the employer (From)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void fillClaimInsuredItemClaimRiskDetail2GRPersonalAccident(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity, CustomAssert assertReference)throws InterruptedException{
		if(claimInsrRiskDetl2GrPAEntity.getAction().equalsIgnoreCase("add") || claimInsrRiskDetl2GrPAEntity.getAction().equalsIgnoreCase("edit")){
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
				selectValueFromList(natureOfTreatmentDropDown, claimInsrRiskDetl2GrPAEntity.getStringValueForField("NatureOfTreatment"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPoliceStation")) {
				clearAndSendKeys(policeStationTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("PoliceStation"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigNameOfHospitalWherePostMortemReportIsDone")) {
				clearAndSendKeys(nameOfHospitalWherePostMortemReportIsDoneTextArea, claimInsrRiskDetl2GrPAEntity.getStringValueForField("NameOfHospitalWherePostMortemReportIsDone"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigDateOfAdmissionInHospital")) {
				clearAndSendKeys(dateOfAdmissionInHospitalTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("DateOfAdmissionInHospital"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigDateofDischargefromtheHospital")) {
				clearAndSendKeys(dateofDischargefromtheHospitalTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("DateofDischargefromtheHospital"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigNameAndPlaceoftheHospital")) {
				clearAndSendKeys(nameAndPlaceoftheHospitalTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("NameAndPlaceoftheHospital"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigDateofCompletionofTreatment")) {
				clearAndSendKeys(dateofCompletionofTreatmentTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("DateofCompletionofTreatment"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigTotalMedicalExpenses")) {
				clearAndSendKeys(totalMedicalExpensesTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("TotalMedicalExpenses"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigTotalDateofCommencementofTreatment")) {
				clearAndSendKeys(dateofCommencementofTreatmentTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("DateofCommencementofTreatment"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigTotalDateofCompletionofTreatment")) {
				clearAndSendKeys(totalDateofCompletionofTreatmentTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("TotalDateofCompletionofTreatment"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigTotalMedicalExpensesOPD")) {
				clearAndSendKeys(totalMedicalExpensesOPDTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("TotalMedicalExpensesOPD"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerleaveCertificateFromTheEmployerFrom")) {
				clearAndSendKeys(periodOfLeaveAsPerleaveCertificateFromTheEmployerFromTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("PeriodOfLeaveAsPerleaveCertificateFromTheEmployerFrom"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerleaveCertificateFromTheEmployerTo")) {
				clearAndSendKeys(periodOfLeaveAsPerleaveCertificateFromTheEmployerToTextField, claimInsrRiskDetl2GrPAEntity.getStringValueForField("PeriodOfLeaveAsPerleaveCertificateFromTheEmployerTo"));
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigFitnessCertificatefromDoctorFrom")) {
				String dateOfApplication=RandomCodeGenerator.dateGenerator(claimInsrRiskDetl2GrPAEntity.getStringValueForField("FitnessCertificatefromDoctorFrom"));
				clearAndEnterDate(fitnessCertificatefromDoctorFromTextField, dateOfApplication);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigFitnessCertificatefromDoctorTo")) {
				String dateOfApplication=RandomCodeGenerator.dateGenerator(claimInsrRiskDetl2GrPAEntity.getStringValueForField("FitnessCertificatefromDoctorTo"));
				clearAndEnterDate(fitnessCertificatefromDoctorToTextField, dateOfApplication);
			}
		}
		else if(claimInsrRiskDetl2GrPAEntity.getAction().equalsIgnoreCase("verify")){

			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("Status"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("NatureOfTreatment"),fetchValueFromTextFields(natureOfTreatmentDropDown), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPoliceStation")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("PoliceStation"),fetchValueFromTextFields(policeStationTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigNameOfHospitalWherePostMortemReportIsDone")) {
				assertReference.assertEquals(claimInsrRiskDetl2GrPAEntity.getStringValueForField("NameOfHospitalWherePostMortemReportIsDone"),fetchValueFromTextFields(nameOfHospitalWherePostMortemReportIsDoneTextArea), AssertionType.WARNING);
			}
		}
	}


	public void navigateToClaimHomePage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);

		}
	}
	public void navigateToInsuredItemPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigInsuredItemTab")) {
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);

		}
	}
	public void navigateToDocumentPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToPartiesPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReservePage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPaymentPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttributesPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetailsPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")) {
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttributesPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigInsuredItemAttributesTab")) {
			click(insuredItemAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributesTabTitle);
		}
	}
	public void navigateToForwardClaimInsuredItemPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	}
	public void navigateToSaveClaimInsuredItemPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	} 
	public void navigateToBackwardClaimInsuredItemPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigBackwardButton")) {
			click(backwardButton);
			//claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'"+claimInsrRiskDetl2GrPAEntity.getStringValueForField("InsuredItemAttributesPageTitle")+"')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			switchToFrame("display");
			isElementDisplayed(claimDetailsForMemberTitle);

		}
	}
	public void navigateToBackClaimInsuredItemPage(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity){
		if (claimInsrRiskDetl2GrPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}

	public void fillAndSubmitClaimInsuredItemClaimRiskDetail2GRPersonalAccident(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntity, CustomAssert assertReference)throws InterruptedException{
		if (isConfigTrue(claimInsrRiskDetl2GrPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimInsuredItemClaimRiskDetail2GRPersonalAccident(claimInsrRiskDetl2GrPAEntity, assertReference);
			navigateToClaimHomePage(claimInsrRiskDetl2GrPAEntity);
			navigateToInsuredItemPage(claimInsrRiskDetl2GrPAEntity);
			navigateToDocumentPage(claimInsrRiskDetl2GrPAEntity);
			navigateToPartiesPage(claimInsrRiskDetl2GrPAEntity);
			navigateToReservePage(claimInsrRiskDetl2GrPAEntity);
			navigateToPaymentPage(claimInsrRiskDetl2GrPAEntity);
			navigateToAttributesPage(claimInsrRiskDetl2GrPAEntity);
			navigateToInsuredItemDetailsPage(claimInsrRiskDetl2GrPAEntity);
			navigateToInsuredItemAttributesPage(claimInsrRiskDetl2GrPAEntity);
			navigateToForwardClaimInsuredItemPage(claimInsrRiskDetl2GrPAEntity);
			navigateToSaveClaimInsuredItemPage(claimInsrRiskDetl2GrPAEntity);
			navigateToBackwardClaimInsuredItemPage(claimInsrRiskDetl2GrPAEntity);
			navigateToBackClaimInsuredItemPage(claimInsrRiskDetl2GrPAEntity);
		}

	}

}
