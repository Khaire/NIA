package com.aqm.staf.library.pages.common;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimLitigationEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClaimAddClaimLitigationDetailsPage extends BasePage {

	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;

	private PageElement claimTabTitle;
	private PageElement memberTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;	

	private PageElement serialNOAutoTextField;
	private PageElement caseTitleTextField;
	private PageElement titleOfTheCourtTextField;
	private PageElement locationOfTheCourtTextField;
	private PageElement petitionNumberTextField;
	private PageElement dateOfPetitionTextField;
	private PageElement petitionerNameTextField;
	private PageElement petitionerAddressTextField;
	private PageElement typeOfLossDropDown;
	private PageElement natureOfInjuryDropDown;
	private PageElement amountClaimedTextField;
	private PageElement typeofCourtDropDown ;
	private PageElement advocateForInsuranceCoTextField;
	private PageElement dateOfAppointmentTextField;
	private PageElement TypeofAwardDropDown; //By Harshit for Type of award dropdown (YC)
	private PageElement advocateForPetitionerTextField;
	private PageElement wSFiledDropDown;
	private PageElement applicationUS170filedDropDown;
	private PageElement modeOfSettlementDropDown;
	private PageElement dateOfAwardOrSettlemenTextField;
	private PageElement dateOfReceiptOfAwardTextField;
	private PageElement amountAwardedOrSettledTextField;
	private PageElement rateOfInterestTextField;
	private PageElement noOfDaysTextField;
	private PageElement penaltyAmountTextField;
	private PageElement totalAmountTextField;
	private PageElement dateOfAppealTextField;
	private PageElement RemarksTextField;
	private PageElement fileNumberTextField;
	private PageElement noFaultLiabilitydepositamountTextField;
	private PageElement amountdepositedinAppealTextField;
	private PageElement locationOfTheCourtVerifyTextField;
	private PageElement advocateForPetitionerVerifyTextField;
	private PageElement advocateForInsuranceCoVerifyTextField;
	private PageElement saveButton;
	private PageElement backButton;

	private PageElement advocateCodeFindButton;
	private PageElement advocateCodeSearchButton;

	private PageElement locationOfCourtFindButton;
	private PageElement locationOfCourtFindButtonGt;
	private PageElement locationOfCourtSearchButton;
	private PageElement addButton;
	private PageElement litigationDetailsTitle;
	private PageElement advocatePetitionerCodeFindButton;

	private PageElement	serialnolabel;
	private String serialNo;
	private PageElement serialNoLink;
	private PageElement PetitionNumberTextField;
	private PageElement petionNumberlabel;
	private PageElement courtCodeFindButton;
	private PageElement claimCourtCodeFindButton;  
	private PageElement claimCourtCodeTextField;
	private PageElement claimCourtSearchButton;  
	private PageElement courtCodeTextField;
	private PageElement dateOfWsFieldTextField;
	private PageElement dateOfApplicationUSTextField;
	private PageElement caseNumberTextField;
	
	public ClaimAddClaimLitigationDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "MemberDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		claimNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Claim"))," Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Number"))," policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Date")),"claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Status")),"claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Code"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNOAutoTextField= new PageElement(By.xpath("//td//b[contains(text(),'Serial No')]/following::td/font"), " Serial No AutoText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		caseTitleTextField= new PageElement(By.xpath(locatorforPanel("Case title", "input")), " Case title AutoText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		titleOfTheCourtTextField= new PageElement(By.name("pCourtTitle"), "Title of the Court Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationOfTheCourtTextField= new PageElement(By.name("pPartyCode"), "Location of the Court Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationOfTheCourtVerifyTextField=new PageElement(By.name("pCourtLocation"), "Location of the Court Verify Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		petitionNumberTextField= new PageElement(By.name("pPetitionNo"), "Petition Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfPetitionTextField= new PageElement(By.name("pPetitionDate"), "Date of Petition Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		petitionerNameTextField= new PageElement(By.name("pPetitionerNameAdd"), "Petitioner Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		petitionerAddressTextField= new PageElement(By.name("pPetitionerAdd"), "Petitioner Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfLossDropDown=new PageElement(By.name("pTypeOfLoss"), "Select Type of Loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfInjuryDropDown=new PageElement(By.name("pNatureOfInjury"), "Select Nature of Injury", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		amountClaimedTextField= new PageElement(By.name("pAmount"), "Amount Claimed Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofCourtDropDown	=new PageElement(By.name("pTypeOfCourt"), "Select Type of Court", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		advocateForInsuranceCoTextField= new PageElement(By.name("pPartyCode"), "Advocate for Insurance Co Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		advocateForInsuranceCoVerifyTextField= new PageElement(By.name("pAdvocateIns"), "Advocate for Insurance Co Verify Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		dateOfAppointmentTextField= new PageElement(By.name("pAppointmentDate"), "Date of Appointment Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TypeofAwardDropDown = new PageElement(By.name("pTypeOfAward"), "Type of Award DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		advocateForPetitionerTextField= new PageElement(By.name("pPartyCode"), "Advocate for Petitioner Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		advocateForPetitionerVerifyTextField= new PageElement(By.name("pAdvocatePet"), "Advocate for Petitioner Verify Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		wSFiledDropDown=new PageElement(By.name("pWSFiled"), "Select WS Filed?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		applicationUS170filedDropDown=new PageElement(By.name("pUSFiled"), "Select Application U/S 170 filed?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modeOfSettlementDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Mode of Settlement","select")), "Select Special Economic Zone", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfAwardOrSettlemenTextField= new PageElement(By.xpath(locatorforPanel("Date of Award/Settlement", "input")), "Date of Award/Settlement Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfReceiptOfAwardTextField= new PageElement(By.xpath(locatorforPanel("Date of Receipt of Award", "input")), "Date of Receipt of Award Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountAwardedOrSettledTextField= new PageElement(By.name("pAwardedAmt"), "Amount AwardedOr Settled Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateOfInterestTextField= new PageElement(By.xpath(locatorforPanel("Rate of Interest", "input")), " Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfDaysTextField= new PageElement(By.xpath(locatorforPanel("No of days", "input")), "No of days Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		penaltyAmountTextField= new PageElement(By.name("pPenaltyAmt"), "Penalty Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAmountTextField= new PageElement(By.xpath(locatorforPanel("Total Amount", "input")), "Total Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAppealTextField= new PageElement(By.xpath(locatorforPanel("Date of Appeal", "input")), "Date of Appeal Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RemarksTextField= new PageElement(By.name("pRemarks"), "Remarks Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fileNumberTextField= new PageElement(By.name("pFileNumber"), "File Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noFaultLiabilitydepositamountTextField= new PageElement(By.xpath(locatorforPanel("No Fault Liability deposit amount", "input")), "No Fault Liability deposit amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountdepositedinAppealTextField= new PageElement(By.xpath(locatorforPanel("Amount deposited in Appeal", "input")), "Amount deposited in Appeal Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		advocateCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Advocate for Insurance Co')]/following::input/following::a[@name='firstFocus']"), "Advocate Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		advocateCodeSearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		locationOfCourtFindButtonGt=new PageElement(By.xpath("//td//input[@name='pCourtLocation']"), "Location For Court Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationOfCourtSearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addButton=new PageElement(By.name("Add"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		litigationDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Litigation')]"), "litigation Details Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		advocatePetitionerCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Advocate for Petitioner')]/following::input/following::a[@name='firstFocus']"), "advocate PetitionerCode FindButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialnolabel=new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails","Serial No.")),"Serial No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);;
		petionNumberlabel=new PageElement(By.xpath(genericLocatorforLabel("clmCourtCaseDetails","Serial No.")),"Petition Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);;
		courtCodeFindButton=new PageElement(By.xpath("//td//input[@name='pCourtLocation']//following::a[1]"), "Location For Court Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//courtCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Court Code')]/following::input/following::a[@name='firstFocus']"), "Location For Court Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimCourtCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Court Code')]/following::input/following::a[@name='firstFocus']"), "Court Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimCourtCodeTextField=new PageElement(By.name("pPartyCode"),"Claim Court Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimCourtSearchButton=new PageElement(By.name("Search"), "Claim Court Code Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		courtCodeTextField=new PageElement(By.xpath("//td//b[contains(text(),'Court Code')]/following::input"), "Court Code TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationOfCourtFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Location of the Court')]/following::input/following::a[@name='firstFocus']"), "Location For Court Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfWsFieldTextField=new PageElement(By.xpath(locatorforPanel("Date of WS Filed", "input")), "Date of WS Filed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfApplicationUSTextField=new PageElement(By.xpath(locatorforPanel("Date of Application U/S 170 filed", "input")), "Date of Application U/S 170 filed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		caseNumberTextField=new PageElement(By.name("pPetitionNo"),"Case NumberText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}


	public void fillClaimLitigationDetails(ClaimLitigationEntity claimLitigationEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimLitigationEntity.getAction().equalsIgnoreCase("add") || claimLitigationEntity.getAction().equalsIgnoreCase("edit")){
			if (claimLitigationEntity.getBooleanValueForField("ConfigCaseTitle")) {
				String CaseTitle=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(caseTitleTextField,CaseTitle);
				claimLitigationEntity.setStringValueForField("CaseTitle",CaseTitle );
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTitleOfTheCourt")) {
				String TitleOfTheCourt=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(titleOfTheCourtTextField,TitleOfTheCourt);
				claimLitigationEntity.setStringValueForField("TitleOfTheCourt",TitleOfTheCourt );
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigLocationOfTheCourt")) {
				fillLocationOfTheCourtSearch(claimLitigationEntity);

			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionNumber")) {
				String PetitionNumber=RandomCodeGenerator.petitionNoGenerator();
				clearAndSendKeys(petitionNumberTextField,PetitionNumber);
				claimLitigationEntity.setStringValueForField("PetitionNumber",PetitionNumber );
			}


			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfPetition")) {
				String dateOfPetition=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfPetition"));
				clearAndEnterDate(dateOfPetitionTextField, dateOfPetition);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionerName")) {
				String PetitionerName=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(petitionerNameTextField,PetitionerName);
				claimLitigationEntity.setStringValueForField("PetitionerName",PetitionerName );
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionerAddress")) {
				clearAndSendKeys(petitionerAddressTextField, claimLitigationEntity.getStringValueForField("PetitionerAddress"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTypeOfLoss")) {
				selectValueFromList(typeOfLossDropDown, claimLitigationEntity.getStringValueForField("TypeOfLoss"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNatureOfInjury")) {
				selectValueFromList(natureOfInjuryDropDown, claimLitigationEntity.getStringValueForField("NatureOfInjury"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				clearAndSendKeys(amountClaimedTextField, claimLitigationEntity.getStringValueForField("AmountClaimed"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTypeOfCourt")) {
				selectValueFromList(typeofCourtDropDown, claimLitigationEntity.getStringValueForField("TypeOfCourt"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForInsuranceCo")) {
				fillAdvocateCodeSearch(claimLitigationEntity);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAppointment")) {
				String dateOfAppointment=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfAppointment"));
				clearAndEnterDate(dateOfAppointmentTextField, dateOfAppointment);
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigTypeofAward")) {
				selectValueFromList(TypeofAwardDropDown, claimLitigationEntity.getStringValueForField("TypeofAward"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForPetitioner")) {
				fillAdvocatePetitionerCodeSearch(claimLitigationEntity);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigWSFiled")) {
				selectValueFromList(wSFiledDropDown, claimLitigationEntity.getStringValueForField("WSFiled"));
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfWsField")) {
				String dateOfWsField=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfWsField"));
				clearAndEnterDate(dateOfWsFieldTextField, dateOfWsField);
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigApplicationUS170Filed")) {
				selectValueFromList(applicationUS170filedDropDown, claimLitigationEntity.getStringValueForField("ApplicationUS170Filed"));
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfApplicationUS")) {
				String dateOfApplicationUS=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfApplicationUS"));
				clearAndEnterDate(dateOfApplicationUSTextField, dateOfApplicationUS);
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigModeOfSettlement")) {
				selectValueFromList(modeOfSettlementDropDown, claimLitigationEntity.getStringValueForField("ModeOfSettlement"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAwardOrSettlement")) {
				String dateOfAwardOrSettlement=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfAwardOrSettlement"));
				clearAndEnterDate(dateOfAwardOrSettlemenTextField, dateOfAwardOrSettlement);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfReceiptOfAward")) {
				String dateOfReceiptOfAward=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfReceiptOfAward"));
				clearAndEnterDate(dateOfReceiptOfAwardTextField, dateOfReceiptOfAward);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountAwardedOrSettled")) {
				clearAndSendKeys(amountAwardedOrSettledTextField, claimLitigationEntity.getStringValueForField("AmountAwardedOrSettled"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigRateOfInterest")) {
				clearAndSendKeys(rateOfInterestTextField, claimLitigationEntity.getStringValueForField("RateOfInterest"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNoOfDays")) {
				clearAndSendKeys(noOfDaysTextField, claimLitigationEntity.getStringValueForField("NoOfDays"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPenaltyAmount")) {
				clearAndSendKeys(penaltyAmountTextField,claimLitigationEntity.getStringValueForField("PenaltyAmount"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTotalAmount")) {
				clearAndSendKeys(totalAmountTextField,claimLitigationEntity.getStringValueForField("TotalAmount"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAppeal")) {
				String dateOfAppeal=RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfAppeal"));
				clearAndEnterDate(dateOfAppealTextField, dateOfAppeal);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(RemarksTextField, claimLitigationEntity.getStringValueForField("Remarks"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigFileNumber")) {
				clearAndSendKeys(fileNumberTextField, claimLitigationEntity.getStringValueForField("FileNumber"));	
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNoFaultLiabilityDepositAmount")) {
				clearAndSendKeys(noFaultLiabilitydepositamountTextField,claimLitigationEntity.getStringValueForField("NoFaultLiabilityDepositAmount"));
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountDepositedInAppeal")) {
				clearAndSendKeys(amountdepositedinAppealTextField,claimLitigationEntity.getStringValueForField("AmountDepositedInAppeal"));
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimCourtCode")) {
				fillClaimCourtCodeSearch(claimLitigationEntity);
			}
			
			if (claimLitigationEntity.getBooleanValueForField("ConfigCaseNumber")) {
				clearAndSendKeys(caseNumberTextField,claimLitigationEntity.getStringValueForField("CaseNumber"));
			}
		}

		else if(claimLitigationEntity.getAction().equalsIgnoreCase("verify")){
			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("SerialNo"),fetchValueFromFields(serialNOAutoTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigCaseTitle")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("CaseTitle"),fetchValueFromTextFields(caseTitleTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTitleOfTheCourt")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("TitleOfTheCourt"), fetchValueFromTextFields(titleOfTheCourtTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigLocationOfTheCourt")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("LocationOfTheCourt"),fetchValueFromTextFields(locationOfTheCourtVerifyTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionNumber")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("PetitionNumber"),fetchValueFromTextFields(petitionNumberTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfPetition")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfPetition")),fetchValueFromTextFields(dateOfPetitionTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionerName")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("PetitionerName"), fetchValueFromTextFields(petitionerNameTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPetitionerAddress")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("PetitionerAddress"),fetchValueFromTextFields(petitionerAddressTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTypeOfLoss")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("TypeOfLoss"),fetchValueFromTextFields(typeOfLossDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNatureOfInjury")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("NatureOfInjury"),fetchValueFromTextFields(natureOfInjuryDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("AmountClaimed"),fetchValueFromTextFields(amountClaimedTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTypeOfCourt")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("TypeOfCourt"),fetchValueFromTextFields(typeofCourtDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForInsuranceCo")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("AdvocateForInsuranceCo"),fetchValueFromTextFields(advocateForInsuranceCoVerifyTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAppointment")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimLitigationEntity.getStringValueForField("DateOfAppointment")).trim(),fetchValueFromTextFields(dateOfAppointmentTextField), AssertionType.WARNING);
			}
			

			if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForPetitioner")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("AdvocateForPetitioner"),fetchValueFromTextFields(advocateForPetitionerVerifyTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigWSFiled")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("WSFiled"),fetchValueFromTextFields(wSFiledDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigApplicationUS170Filed")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ApplicationUS170Filed"),fetchValueFromTextFields(applicationUS170filedDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigModeOfSettlement")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ModeOfSettlement"), fetchValueFromTextFields(modeOfSettlementDropDown), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAwardOrSettlement")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("DateOfAwardOrSettlement"),fetchValueFromTextFields(dateOfAwardOrSettlemenTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfReceiptOfAward")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("DateOfReceiptOfAward"),fetchValueFromTextFields(dateOfReceiptOfAwardTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountAwardedOrSettled")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("AmountAwardedOrSettled"),fetchValueFromTextFields(amountAwardedOrSettledTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigRateOfInterest")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("RateOfInterest"),fetchValueFromTextFields(rateOfInterestTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNoOfDays")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("NoOfDays"),fetchValueFromTextFields(noOfDaysTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigPenaltyAmount")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("PenaltyAmount"),fetchValueFromTextFields(penaltyAmountTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigTotalAmount")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("TotalAmount"),fetchValueFromTextFields(totalAmountTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigDateOfAppeal")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("DateOfAppeal"), fetchValueFromTextFields(dateOfAppealTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(RemarksTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigFileNumber")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("FileNumber"), fetchValueFromTextFields(fileNumberTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigNoFaultLiabilityDepositAmount")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("NoFaultLiabilityDepositAmount"),fetchValueFromTextFields(noFaultLiabilitydepositamountTextField), AssertionType.WARNING);
			}

			if (claimLitigationEntity.getBooleanValueForField("ConfigAmountDepositedInAppeal")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("AmountDepositedInAppeal"),fetchValueFromTextFields(amountdepositedinAppealTextField), AssertionType.WARNING);
			}
			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimCourtCode")) {
				assertReference.assertEquals(claimLitigationEntity.getStringValueForField("ClaimCourtCode"),fetchValueFromTextFields(courtCodeTextField), AssertionType.WARNING);
			}
		}
	}

	public void navigateToClaim(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigClaim")){
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigMember")){
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}

	public void navigateToDocument(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigDocument")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigParties")){
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}

	public void navigateToReserve(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigReserve")){
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigPayment")){
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttributes(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigAttributes")){
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}


	public void fetchSerialNoandPetitionNumber(ClaimLitigationEntity claimLitigationEntity){
		claimLitigationEntity.setStringValueForField("SerialNo", fetchValueFromFields(serialnolabel));
		claimLitigationEntity.setStringValueForField("PetitionNumber", fetchValueFromTextFields(petitionNumberTextField));
	}

	public void submitClaimLitigationDetails(ClaimLitigationEntity claimLitigationEntity,ScenarioTestData testData) {
		if (claimLitigationEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			fetchSerialNoandPetitionNumber(claimLitigationEntity);
			switchToFrame("display");
		}
	}
	
	
	
	public void backFromClaimLitigationDetails(ClaimLitigationEntity claimLitigationEntity) {
		if (claimLitigationEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	////TODO Location Of The Court in Claim Litigation

	public void clickOnLocationOfTheCourtFindButton(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		if (claimLitigationEntity.getBooleanValueForField("ConfigLocationOfCourtFindButton")){
		if(claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation") ||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor") ||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("CV")|| claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("MP")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("FM")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("MC")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("FF")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("AR")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("ES")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("SP")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("YT")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("YS")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("YR")||claimLitigationEntity.getStringValueForField("Product").equalsIgnoreCase("TF")||claimLitigationEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull"))
 			
		{
				click(courtCodeFindButton);
			}
			else
			{
			click(locationOfCourtFindButtonGt);
			}
			/*else
			{
				click(locationOfCourtFindButton);
			}*/
			switchToWindow("Party Maintenance");
		}
	}
	public void fillLocationOfTheCourtSearch(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		clickOnLocationOfTheCourtFindButton(claimLitigationEntity);

		if(claimLitigationEntity.getBooleanValueForField("ConfigLocationOfTheCourt")){
			clearAndSendKeys(locationOfTheCourtTextField, claimLitigationEntity.getStringValueForField("LocationOfTheCourt"));
		}
		click(locationOfCourtSearchButton);	
		selectSearchLocationOfTheCourt(claimLitigationEntity);
	}
	public void selectSearchLocationOfTheCourt(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		String	locationOfTheCourt=claimLitigationEntity.getStringValueForField("LocationOfTheCourt");
		PageElement locationOfTheCourtLinkTextField=new PageElement(By.linkText(locationOfTheCourt), "Location Of The Court in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(locationOfTheCourtLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}

	//TODO Advocate Insurance Co for Claim Litigation
	public void clickOnAdvocateCodeFindButton(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocateCodeFindButton")){
			click(advocateCodeFindButton);
			switchToWindow("Event List");
		}
	}
	public void fillAdvocateCodeSearch(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		clickOnAdvocateCodeFindButton(claimLitigationEntity);

		if(claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForInsuranceCo")){
			clearAndSendKeys(advocateForInsuranceCoTextField, claimLitigationEntity.getStringValueForField("AdvocateForInsuranceCo"));
		}
		selectSearchAdvocateCode(claimLitigationEntity);
	}
	public void selectSearchAdvocateCode(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		String	advocateCode=claimLitigationEntity.getStringValueForField("AdvocateForInsuranceCo");
		PageElement advocateCodeLinkTextField=new PageElement(By.linkText(advocateCode), "Advocate For Insurance in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(advocateCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}

	////TODO Advocate For Petitioner Search for Claim Litigation

	public void clickOnAdvocatePetitionerFindButton(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		if (claimLitigationEntity.getBooleanValueForField("ConfigAdvocatePetitionerCodeFindButton")){
			click(advocatePetitionerCodeFindButton);
			switchToWindow("Event List");
		}
	}
	public void fillAdvocatePetitionerCodeSearch(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		clickOnAdvocatePetitionerFindButton(claimLitigationEntity);

		if(claimLitigationEntity.getBooleanValueForField("ConfigAdvocateForPetitioner")){
			clearAndSendKeys(advocateForPetitionerTextField, claimLitigationEntity.getStringValueForField("AdvocateForPetitioner"));
		}
		selectSearchAdvocatePetitionerCode(claimLitigationEntity);
	}
	public void selectSearchAdvocatePetitionerCode(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
		String	advocatePetitinerCode=claimLitigationEntity.getStringValueForField("AdvocateForPetitioner");
		PageElement advocateCodeLinkTextField=new PageElement(By.linkText(advocatePetitinerCode), "Advocate For Petitioner in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(advocateCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}

	public void addButton(ClaimLitigationEntity claimLitigationEntity){
		if(claimLitigationEntity.getBooleanValueForField("ConfigAddButton")){
			click(addButton);
			switchToFrame("display");
			isElementDisplayed(litigationDetailsTitle);
		}

	}
	public void selectSerialNo(ClaimLitigationEntity claimLitigationEntity){
		if (claimLitigationEntity.getBooleanValueForField("ConfigSelectSerialNo")){
			serialNo=claimLitigationEntity.getStringValueForField("SerialNo");
			serialNo = serialNo.trim();
			serialNoLink=new PageElement(By.linkText(serialNo), " Litigation Details Page", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(serialNoLink);
			switchToFrame("display");
		}
	}
   //miscNL Court Code in Claim Litigation
	public void fillClaimCourtCodeSearch(ClaimLitigationEntity claimLitigationEntity)throws InterruptedException{
		clickOnClaimCourtCodeFindButton(claimLitigationEntity);

		if(claimLitigationEntity.getBooleanValueForField("ConfigClaimCourtCode")){
			clearAndSendKeys(claimCourtCodeTextField, claimLitigationEntity.getStringValueForField("ClaimCourtCode"));
		}
		click(claimCourtSearchButton);	
		selectSearchClaimCourtCode(claimLitigationEntity);
	}
    
	//TODO Claim Party Code Search For Parties//
		public void clickOnClaimCourtCodeFindButton(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException {
			if (claimLitigationEntity.getBooleanValueForField("ConfigClaimPartyCodeFindButton")){
				click(claimCourtCodeFindButton);
				switchToWindow("Party Maintenance");

			}
		}
		
		public void selectSearchClaimCourtCode(ClaimLitigationEntity claimLitigationEntity) throws InterruptedException{
			String	claimCourtCode=claimLitigationEntity.getStringValueForField("ClaimCourtCode");
			PageElement claimCourtCodeLinkTextField=new PageElement(By.linkText(claimCourtCode), "Claim Court Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(claimCourtCodeLinkTextField);
			switchToWindow();
			switchToFrame("display");
		}
	public void fillAndSubmitClaimLitigationDetails(ClaimLitigationEntity claimLitigationEntity, CustomAssert assertReference,ScenarioTestData testData) throws InterruptedException {
		if (isConfigTrue(claimLitigationEntity.getConfigExecute())){
			switchToFrame("display");

			addButton(claimLitigationEntity);
			fillClaimLitigationDetails(claimLitigationEntity, assertReference);
			submitClaimLitigationDetails(claimLitigationEntity,testData);
			navigateToClaim(claimLitigationEntity);
			navigateToMember(claimLitigationEntity);
			navigateToDocument(claimLitigationEntity);
			navigateToParties(claimLitigationEntity);
			navigateToReserve(claimLitigationEntity);
			navigateToPayment(claimLitigationEntity);
			navigateToAttributes(claimLitigationEntity);
		}
	}
}























































