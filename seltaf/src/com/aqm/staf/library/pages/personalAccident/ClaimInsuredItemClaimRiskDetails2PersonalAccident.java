package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimInsrRskDetails2PAEntity;
import com.aqm.staf.library.databin.ClaimIsurComRiskPropPAEntity;

public class ClaimInsuredItemClaimRiskDetails2PersonalAccident extends BasePage {

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

	private PageElement applicableEventCodeLabel;

	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributesTabTitle;

	private PageElement previousPolicyNumberTextField;
	private PageElement claimDropDown;
	private PageElement detailsOfTravelDropDown;
	private PageElement flightNumberTextField;
	private PageElement ticketNumberTextField;
	private PageElement placeOfTravelFromTextField;
	private PageElement placeOfTravelToTextField;
	private PageElement dateOfJourneyTextField;
	private PageElement dateOfJourneyFindButton;
	private PageElement natureOfTreatmentForPersonalAccidentDropDpwn;
	private PageElement policeStationTextField;
	private PageElement nameOfHospitalPostmortemReportDoneTextField;
	
	private PageElement dateOfAdmissionTextField;
	private PageElement dateOfAdmissionFindButton;
	private PageElement dateOfDeathTextField;
	private PageElement dateOfDeathFindButton;
	private PageElement excessTextField;
	private PageElement claimAmountTextField;
	private PageElement surveyFeesTextField;
	private PageElement translatorFeesTextField;
	private PageElement legalOpinionFeesTextField;
	private PageElement other1FeesTextField;
	private PageElement other2FeesTextField;

	//private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;
	private PageElement nextButton;

	private PageElement claimRiskDetails2Title;
	private PageElement claimRiskdetailsTitle;
	private PageElement claimInsuredPropertyTitle;
	private PageElement claimAmountPUTextField;

	public ClaimInsuredItemClaimRiskDetails2PersonalAccident(WebDriver driver, String pageName)
	{
		super(driver, pageName);

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

		previousPolicyNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDropDown=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Claim')]/following::select"), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailsOfTravelDropDown=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Details of Travel')]/following::select"), "Details of Travel DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		flightNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Flight Number')]/following::input"), "Flight Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ticketNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Ticket Number')]/following::input"), "Ticket TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfTravelFromTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Place of travel (From)')]/following::input"), "Place of travel (From) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfTravelToTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Place of travel (To)')]/following::input"), "Place of travel (To) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfJourneyTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of Journey')]/following::input"), "Date of Journey TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfJourneyFindButton=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of Journey')]/following::img"), "Date of Journey Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentForPersonalAccidentDropDpwn=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Nature of Treatment for Personal Accident')]/following::select"), "Nature of Treatment for Personal Accident DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//policeStationTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Police Station ')]/following::input"), "Police Station TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policeStationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Police Station')]/following::input"),"Police Station TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    nameOfHospitalPostmortemReportDoneTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Name of Hospital where Post-mortem report is done')]/following::textarea"), "Name of Hospital where Post-mortem report is done TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				
		dateOfAdmissionTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),' Date of Admission ')]/following::input"), "Date of Admission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAdmissionFindButton=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),' Date of Admission ')]/following::img"), "Date of Admission Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDeathTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of death ')]/following::input"), "Date of death TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDeathFindButton=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Date of death ')]/following::img"), "Date of death Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Excess ')]/following::input"), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Claim Amount')]/following::input[1]"), "Claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Survey Fees')]/following::input[1]"), "Survey Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		translatorFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Translator Fees')]/following::input[1]"), "Translator Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalOpinionFeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Legal Opinion Fees')]/following::input[1]"), "Legal Opinion Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other1FeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Other1 Fees')]/following::input[1]"), "Other1 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other2FeesTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Other2 Fees')]/following::input[1]"), "Other2 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Previous"), "Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextButton=new PageElement(By.name("Next1"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimRiskdetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk details')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredPropertyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRiskDetails2Title=new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Details2')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountPUTextField=new PageElement(By.xpath("//form[@name='S0201']//td//div[contains(text(),'Claim amount')]/following::input"), "Claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillClaimInsuredItemClaimRiskDetails2PersonalAccident(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity, CustomAssert assertReference)throws InterruptedException{
		if(claimInsrRskDetails2PAEntity.getAction().equalsIgnoreCase("add") || claimInsrRskDetails2PAEntity.getAction().equalsIgnoreCase("edit")){
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, claimInsrRskDetails2PAEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaim")) {
				selectValueFromList(claimDropDown, claimInsrRskDetails2PAEntity.getStringValueForField("Claim"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDetailsOfTravel")) {
				selectValueFromList(detailsOfTravelDropDown, claimInsrRskDetails2PAEntity.getStringValueForField("DetailsOfTravel"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigFlightNumber")) {
				clearAndSendKeys(flightNumberTextField, claimInsrRskDetails2PAEntity.getStringValueForField("FlightNumber"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigTicketNumber")) {
				clearAndSendKeys(ticketNumberTextField, claimInsrRskDetails2PAEntity.getStringValueForField("TicketNumber"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPlaceOfTravelFrom")) {
				clearAndSendKeys(placeOfTravelFromTextField, claimInsrRskDetails2PAEntity.getStringValueForField("PlaceOfTravelFrom"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPlaceOfTravelTo")) {
				clearAndSendKeys(placeOfTravelToTextField, claimInsrRskDetails2PAEntity.getStringValueForField("PlaceOfTravelTo"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfJourney")) {
				//String dateOfJourney=RandomCodeGenerator.dateGenerator(claimInsrRskDetails2PAEntity.getStringValueForField("DateOfJourney"));
				//clearAndEnterDate(dateOfJourneyTextField, dateOfJourney);
				selectDateFromCalender(dateOfJourneyFindButton, claimInsrRskDetails2PAEntity.getStringValueForField("DateOfJourney"));
				switchToFrame("display");
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigNatureOfTreatmentForPersonalAccident")) {
				selectValueFromList(natureOfTreatmentForPersonalAccidentDropDpwn, claimInsrRskDetails2PAEntity.getStringValueForField("NatureOfTreatmentForPersonalAccident"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPoliceStation")) {
				clearAndSendKeys(policeStationTextField, claimInsrRskDetails2PAEntity.getStringValueForField("PoliceStation"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigNameOfHospitalPostmortemReportDone")) {
				clearAndSendKeys(nameOfHospitalPostmortemReportDoneTextField, claimInsrRskDetails2PAEntity.getStringValueForField("NameOfHospitalPostmortemReportDone"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
				selectDateFromCalender(dateOfAdmissionFindButton, claimInsrRskDetails2PAEntity.getStringValueForField("DateOfAdmission"));
				switchToFrame("display");
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfDeath")) {
				selectDateFromCalender(dateOfDeathFindButton, claimInsrRskDetails2PAEntity.getStringValueForField("DateOfDeath"));
				switchToFrame("display");
				
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, claimInsrRskDetails2PAEntity.getStringValueForField("Excess"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimInsrRskDetails2PAEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigSurveyFees")) {
				clearAndSendKeys(surveyFeesTextField, claimInsrRskDetails2PAEntity.getStringValueForField("SurveyFees"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigTranslatorFees")) {
				clearAndSendKeys(translatorFeesTextField, claimInsrRskDetails2PAEntity.getStringValueForField("TranslatorFees"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
				clearAndSendKeys(legalOpinionFeesTextField, claimInsrRskDetails2PAEntity.getStringValueForField("LegalOpinionFees"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigOther1Fees")) {
				clearAndSendKeys(other1FeesTextField, claimInsrRskDetails2PAEntity.getStringValueForField("Other1Fees"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigOther2Fees")) {
				clearAndSendKeys(other2FeesTextField, claimInsrRskDetails2PAEntity.getStringValueForField("Other2Fees"));
			}
			if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimAmountPU")) {
				clearAndSendKeys(claimAmountPUTextField, claimInsrRskDetails2PAEntity.getStringValueForField("ClaimAmount"));
			}
		}
			else if(claimInsrRskDetails2PAEntity.getAction().equalsIgnoreCase("verify")){

				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ClaimStatus"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				//
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("Claim"),fetchValueFromTextFields(claimDropDown), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDetailsOfTravel")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("DetailsOfTravel"),fetchValueFromTextFields(detailsOfTravelDropDown), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigFlightNumber")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("FlightNumber"),fetchValueFromTextFields(flightNumberTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigTicketNumber")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("TicketNumber"),fetchValueFromTextFields(ticketNumberTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPlaceOfTravelFrom")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("PlaceOfTravelFrom"),fetchValueFromTextFields(placeOfTravelFromTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPlaceOfTravelTo")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("PlaceOfTravelTo"),fetchValueFromTextFields(placeOfTravelToTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfJourney")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("DateOfJourney"),fetchValueFromTextFields(dateOfJourneyTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigNatureOfTreatmentForPersonalAccident")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("NatureOfTreatmentForPersonalAccident"),fetchValueFromTextFields(natureOfTreatmentForPersonalAccidentDropDpwn), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPoliceStation")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("PoliceStation"),fetchValueFromTextFields(policeStationTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigNameOfHospitalPostmortemReportDone")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("NameOfHospitalPostmortemReportDone"),fetchValueFromTextFields(nameOfHospitalPostmortemReportDoneTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfAdmission")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("DateOfAdmission"),fetchValueFromTextFields(dateOfAdmissionTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDateOfDeath")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("DateOfDeath"),fetchValueFromTextFields(dateOfDeathTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimAmount")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigSurveyFees")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("SurveyFees"),fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("TranslatorFees"),fetchValueFromTextFields(translatorFeesTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("LegalOpinionFees"),fetchValueFromTextFields(legalOpinionFeesTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigOther1Fees")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("Other1Fees"),fetchValueFromTextFields(other1FeesTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigOther2Fees")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("Other2Fees"),fetchValueFromTextFields(other2FeesTextField), AssertionType.WARNING);
				}
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimAmountPU")) {
					assertReference.assertEquals(claimInsrRskDetails2PAEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountPUTextField), AssertionType.WARNING);
				}
			}
	}  

	public void navigateToClaimHomePage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);

		}
	}
	public void navigateToInsuredItemPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigInsuredItemTab")) {
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);

		}
	}
	public void navigateToDocumentPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToPartiesPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReservePage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPaymentPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttributesPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetailsPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")) {
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttributesPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigInsuredItemAttributesTab")) {
			click(insuredItemAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributesTabTitle);
		}
	}
	/*	public void navigateToForwardClaimInsuredItemPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
				if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigForwardButton")) {
					click(forwardButton);
					switchToFrame("display");
					isElementDisplayed(commonClaimRiskPropertyTitle);
				}
			} */
	public void navigateToSaveClaimInsuredItemPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void navigateToBackwardClaimInsuredItemPage(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity){
		if (claimInsrRskDetails2PAEntity.getBooleanValueForField("ConfigBackwardButton")) {
			click(backwardButton);
			//claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'"+claimIsurComRiskPropPAEntity.getStringValueForField("InsuredItemAttributesPageTitle")+"')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			switchToFrame("display");
			isElementDisplayed(claimRiskdetailsTitle);

		}
	}
	public void navigateToBackClaimInsuredItemPage(ClaimInsrRskDetails2PAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}
	public void clickOnNextButton(ClaimInsrRskDetails2PAEntity claimIsurComRiskPropPAEntity){
		if (claimIsurComRiskPropPAEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			
		}
	}

	public void fillAndSubmitClaimInsuredItemClaimRiskDetails2PersonalAccident(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntity, CustomAssert assertReference)throws InterruptedException{
		if (isConfigTrue(claimInsrRskDetails2PAEntity.getConfigExecute())){
		switchToFrame("display");
			fillClaimInsuredItemClaimRiskDetails2PersonalAccident(claimInsrRskDetails2PAEntity, assertReference);
			clickOnNextButton(claimInsrRskDetails2PAEntity);
			navigateToSaveClaimInsuredItemPage(claimInsrRskDetails2PAEntity);
			navigateToClaimHomePage(claimInsrRskDetails2PAEntity);
			navigateToInsuredItemPage(claimInsrRskDetails2PAEntity);
			navigateToDocumentPage(claimInsrRskDetails2PAEntity);
			navigateToPartiesPage(claimInsrRskDetails2PAEntity);
			navigateToReservePage(claimInsrRskDetails2PAEntity);
			navigateToPaymentPage(claimInsrRskDetails2PAEntity);
			navigateToAttributesPage(claimInsrRskDetails2PAEntity);
			navigateToInsuredItemDetailsPage(claimInsrRskDetails2PAEntity);
			navigateToInsuredItemAttributesPage(claimInsrRskDetails2PAEntity);
			//navigateToForwardClaimInsuredItemPage(claimInsrRskDetails2PAEntity);
			navigateToSaveClaimInsuredItemPage(claimInsrRskDetails2PAEntity);
			navigateToBackwardClaimInsuredItemPage(claimInsrRskDetails2PAEntity);
			navigateToBackClaimInsuredItemPage(claimInsrRskDetails2PAEntity);
		}

	}
}


