package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimMemberT1T2CLRAttEntity;
import com.aqm.staf.library.databin.ClaimT2CLRForHealthProEntity;

public class ClaimMemberPropertyProceedT2CLRHealth extends BasePage {
	private PageElement prevPageTitle;

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

	private PageElement pageTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement memberSerialNoLabel;
	private PageElement memberCodeLabel;
	private PageElement applicationEventCodeLabel;

	private PageElement claimTypePreviousPageLabel;
	private PageElement reasonForReopenPreviousPageLabel;
	private PageElement tPAClaimNumberPreviousPageLabel;
	private PageElement tPARemarksPreviousPageLabel;
	private PageElement previousPolicyNumberPreviousPageLabel;
	private PageElement fileNo_PatientNoPreviousPageLabel;
	private PageElement districtStateNationalPreviousPageLabel;
	private PageElement districtCourt_SupremeCourtHighCourtSLPPreviousPageLabel;
	private PageElement nameofIllnessOperationPreviousPageLabel;
	private PageElement dateOfSymptomsFirstAppearedPreviousPageLabel;
	private PageElement procedureCodesLevel1PreviousPageLabel;
	private PageElement procedureCodesLevel2PreviousPageLabel;
	private PageElement procedureCodesLevel3PreviousPageLabel;
	private PageElement procedureDescriptionLevel1PreviousPageLabel;
	private PageElement procedureDescriptionLevel2PreviousPageLabel;
	private PageElement procedureDescriptionLevel3PreviousPageLabel;
	private PageElement detailsOfPreExistingDiseaseDeclaredLevel1PreviousPageLabel;
	private PageElement detailsOfPreExistingDiseaseDeclaredLevel2PreviousPageLabel;
	private PageElement detailsofPreExistingDiseaseDeclaredLevel3PreviousPageLabel;
	private PageElement medicalHistoryLevel1PreviousPageLabel;
	private PageElement medicalHistoryLevel2PreviousPageLabel;
	private PageElement MedicalHistoryLevel3PreviousPageLabel;
	private PageElement dateOfAdmissionPreviousPageLabel;
	private PageElement dateofdischargePreviousPageLabel;
	private PageElement diagnosisPreviousPageLabel;
	private PageElement diagnosisCodeLevel2PreviousPageLabel;
	private PageElement diagnosisCodeLevel3PreviousPageLabel;
	private PageElement natureOfTreatmentForMediclaimPreviousPageLabel;
	private PageElement AmountClaimedPreviousPageLabel;
	private PageElement whetherHospitalisnetworkedPreviousPageLabel;
	private PageElement whetherTheClaimFallsUnderTheExclusion4_1PreviousPageLabel;
	private PageElement whetherTheClaimFallsUnderTheExclusion4_2PreviousPageLabel;
	private PageElement	whetherTheClaimFallsUnderTheExclusion4_3PreviousPageLabel;
	private PageElement nameofTheDiseasePreviousPageLabel;
	private PageElement OtherDetails_IF_any_NatureOfLossPreviousPageLabel;
	private PageElement claimTypeforMediclaimPreviousPageLabel;
	private PageElement ageAsPerDischargeCardPreviousPageLabel;
	private PageElement sumInsuredPreviousPageLabel;
	private PageElement cumulativeBonusPreviousPageLabel;
	private PageElement previousClaimAmountPreviousPageLabel;
	private PageElement balanceSumInsuredPreviousPageLabel;
	private PageElement zoneHealthPreviousPageLabel;
	private PageElement nameofBodyPartsforProcedureCodesLevel1PreviousPageLabel;

	private PageElement otherNonHospitalExpensesTextField;
	private PageElement surgeryChargeTextField;
	private PageElement investigationOrDiagnosticTextField;
	private PageElement MedicineChargeTextField;
	private PageElement consultationChargesTextField;
	private PageElement miscellaneousExpensesTextField;
	private PageElement ambulanceChargesTextField;
	private PageElement preHospitalizationChargesTextField;
	private PageElement postHospitalizationChargesTextField;
	private PageElement numberOfDaysAdmittedInHospitalTextField;
	private PageElement roomTariffPerDayTextField;
	private PageElement numberOfDaysStayedInRoomTextField;
	private PageElement totalRoomTariffTextField;
	private PageElement iCURoomTariffperDayTextField;
	private PageElement numberOfDaysStayedInICUTextField;
	private PageElement iCUTotalRoomTariffTextField;
	private PageElement iCCURoomTariffperDayTextField;
	private PageElement numberOfDaysStayedInICCUTextField;
	private PageElement iCCUTotalRoomTariffTextField;
	private PageElement totalChargesTextField;
	private PageElement deductionIfanyChangeInZoneTextField;
	private PageElement amountAfterDeductionOfZoneTextField;
	private PageElement amountAdmissibleTextField;
	private PageElement co_PaymentExcessTextField;
	private PageElement co_PaymentTextField;
	private PageElement hospitalDiscountTextField;
	private PageElement packageDiscountTextField;
	private PageElement volumeDiscountTextField;
	private PageElement totalPayableAmountTextField;
	private PageElement reductionAmountTextField;
	private PageElement reasonForReductionDropDown;
	private PageElement serviceTaxForCashlessClaimTextField;
	private PageElement tDSForCashlessClaimTextField;
	private PageElement netClaimAmountPayableTextField;
	private PageElement forwordButton;
	private PageElement backwordButton;
	private PageElement backButton;
	private PageElement saveButton;

	//ES
	private PageElement claimCauseCodeforMediclaimTextField;
	private PageElement medicalExpensesChargesTextField;
	private PageElement repatriationofRemainsChargesTextField;
	private PageElement reUnionExpensesChargesTextField;
	private PageElement icuTotalRoomTariffTextField;
	private PageElement doctororProfessionalChargeTextField;
	private PageElement consumablesTextField;
	private PageElement otherChargesTextField;
	private PageElement excessTextField;

	//BH
	private PageElement pAChargesTextField;
	private PageElement medicinesTextField;
	private PageElement claimAmountTextField;
	private PageElement additionalDeductionForAgeAbove70TextField;

	//GH
	private PageElement surgonFeesTextField;
	private PageElement anaesthetistSurgeonFeesTextField;
	private PageElement medicalPractitionerFeesTextField;
	private PageElement consultantsFeesTextField;
	private PageElement specialistsFeesTextField;
	private PageElement nursingExpensesFeesTextField;
	private PageElement totaofSurgeTextField;
	private PageElement anesthesiaTextField;
	private PageElement bloodTextField;
	private PageElement oxygenTextField;
	private PageElement otChargesTextField;
	private PageElement surgicalAppliancesTextField;
	private PageElement drugsTextField;
	private PageElement diagnosticMaterialTextField;
	private PageElement dialysisTextField;
	private PageElement chemotherapyTextField;
	private PageElement radiotherapyTextField;
	private PageElement costofPacemakerTextField ; 
	private PageElement artificialLimbsTextField ; 
	private PageElement emergencyAmbulanceChargesTextField ; 
	private PageElement totalofAneTextField ; 
	private PageElement hospitalizationPayableAmountTextField ; 
	private PageElement maxNoofDaysforHospitalizationTextField ; 
	private PageElement prevNoofDaysinHospitalizationTextField ; 
	private PageElement totalNoofDaysofHospitalizationTextField ; 
	private PageElement balNoofDaysforHospitalizationTextField ; 
	private PageElement hospitalCashTextField ;
	private PageElement insuredSerialNoLabel ;
	private PageElement insuredItemCodeLabel ;
	private PageElement transportationExpensesTextField;
	private PageElement mealsTextField;


	//JM
	private PageElement surgeryTypeDropDown;
	private PageElement totalRoomTariffforintermediarysurgeryTextField;
	private PageElement operationTheatreChargesforintermediarysurgeryTextField;
	private PageElement anesthetistFeesforintermediarysurgeryTextField;
	private PageElement surgeonfeesforintermediarysurgeryTextField;
	private PageElement totalRoomTariffforMajorsurgeryTextField;
	private PageElement operationTheatreChargesforMajorSurgeryTextField;
	private PageElement anesthetistFeesforMajorSurgeryTextField;
	private PageElement surgeonfeesforMajorsurgeryTextField;
	private PageElement totalRoomTariffinclusiveOfNursingTreatmentchargesforMinorSurgeryTextField;
	private PageElement minorSurgeryDayCareRoomrentPerDayForMinorSurgeryTextField;
	private PageElement operationTheatreChargesforMinorSurgeryTextField;
	private PageElement anesthesiaforMinorSurgeryTextField;
	private PageElement anesthetistFeesforMinorSurgeryTextField;
	private PageElement surgeonfeesforMinorSurgeryTextField;
	private PageElement descriptionofNonSurgicalTypeTextField;
	private PageElement totalRoomTariffforSupraMajorsurgeryTextField ; 
	private PageElement operationTheatreChargesforSupraMajorsurgeryTextField ; 
	private PageElement anesthetistFeesforSupraMajorsurgeryTextField ; 
	private PageElement surgeonfeesforSupraMajorsurgeryTextField ; 
	private PageElement iCUTotalRoomTariffforSupraMajorsurgeryTextField ; 
	private PageElement batchNumberTextField;
	//TU
	private PageElement roomorBoardingChargesTextField;
	private PageElement nursingExpensesTextField;
	private PageElement iCUorICCURoomTariffperDayTextField;
	private PageElement numberofdaysStayedinORICCUTextField;
	
	//uk
	private PageElement Copaymentpercent;
	
	
	public ClaimMemberPropertyProceedT2CLRHealth(WebDriver driver,String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		pageTitle=new PageElement(By.xpath("//div//b[contains(text(),'T2-CLR')]"), "Current Page Title Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		prevPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'T1-CLR ')]"), " T1-CLR for Health MCFM Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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

		claimNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim"))," Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Number"))," Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date"))," Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Code"))," Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")),"Cause Of Loss  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")),"Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code"))," Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicationEventCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")),"Applicable Event Code  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTypePreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("")),"Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForReopenPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Reason for Reopen")),"Details Reason for Reopen Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tPAClaimNumberPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("TPA Claim Number")),"Details TPA Claim Number Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tPARemarksPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("TPA Remarks")),"Details TPA Remarks Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Previous Policy Number")),"Details Previous Policy Number Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fileNo_PatientNoPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("File No/Patient No")),"Details File No/Patient No Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtStateNationalPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("District/State/National")),"Details District/State/National Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtCourt_SupremeCourtHighCourtSLPPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("District Court/Supreme Court/High Court/SLP")),"Details District Court/Supreme Court/High Court/SLPPrevious Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofIllnessOperationPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Name of Illness/Operation")),"Details Name of Illness/Operation Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfSymptomsFirstAppearedPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Date of Symptoms first appeared")),"Details Date of Symptoms first appeared Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureCodesLevel1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Codes Level 1")),"Details Procedure Codes Level 1 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureCodesLevel2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Codes Level 2")),"Details Procedure Codes Level 2 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureCodesLevel3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Codes Level 3")),"Details Procedure Codes Level 3 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureDescriptionLevel1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Description Level 1")),"Details Procedure Description Level 1Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureDescriptionLevel2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Description Level 2")),"Details Procedure Description Level 2Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		procedureDescriptionLevel3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Procedure Description Level 3")),"Details Procedure Description Level 3Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfPreExistingDiseaseDeclaredLevel1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Details of Pre Existing Disease Declared Level 1")),"Details Details of Pre Existing Disease Declared Level 1 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfPreExistingDiseaseDeclaredLevel2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Details of Pre Existing Disease Declared Level 2")),"Details Details of Pre Existing Disease Declared Level 2 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsofPreExistingDiseaseDeclaredLevel3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Details of Pre Existing Disease Declared Level 3")),"Details Details of Pre Existing Disease Declared Level 3 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalHistoryLevel1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Medical History Level 1")),"Details Medical History Level 1 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalHistoryLevel2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Medical History Level 2")),"Details Medical History Level 2 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MedicalHistoryLevel3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Medical History Level 3")),"Details Medical History Level 3 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAdmissionPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Date of Admission")),"Details Date of Admission Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofdischargePreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Date of discharge")),"Details Date of discharge Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		diagnosisPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Diagnosis")),"Details Diagnosis Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		diagnosisCodeLevel2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Diagnosis Code Level 2")),"Details Diagnosis Code Level 2Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		diagnosisCodeLevel3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Diagnosis Code Level 3")),"Details Diagnosis Code Level 3Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentForMediclaimPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Nature of Treatment For Mediclaim")),"Details Nature of Treatment For Mediclaim Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AmountClaimedPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Amount Claimed")),"Details Amount Claimed Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherHospitalisnetworkedPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Whether Hospital is networked")),"Details Whether Hospital is networked Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheClaimFallsUnderTheExclusion4_1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Whether the claim falls under the exclusion 4.1")),"Details Whether the claim falls under the exclusion 4.1Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheClaimFallsUnderTheExclusion4_2PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Whether the claim falls under the exclusion 4.2")),"Details Whether the claim falls under the exclusion 4.2Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheClaimFallsUnderTheExclusion4_3PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Whether the claim falls under the exclusion 4.3")),"Details Whether the claim falls under the exclusion 4.3Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofTheDiseasePreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Name of the disease")),"Details Name of the disease Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		OtherDetails_IF_any_NatureOfLossPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Other Details(if any)-Nature of Loss")),"Details Other Details(if any)-Nature of Loss Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTypeforMediclaimPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Claim Type for Mediclaim")),"Details Claim Type for Mediclaim Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageAsPerDischargeCardPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Age as per Discharge card")),"Details Age as per Discharge card Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Sum Insured")),"Details Sum Insured Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cumulativeBonusPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Cumulative Bonus")),"Details Cumulative Bonus Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousClaimAmountPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Previous Claim Amount")),"Details Previous Claim Amount Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Balance Sum Insured")),"Details Balance Sum Insured Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		zoneHealthPreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Zone Health")),"Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofBodyPartsforProcedureCodesLevel1PreviousPageLabel= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Name of Body Parts for Procedure Codes Level 1")),"Details Name of Body Parts for Procedure Codes Level 1 Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FM
		otherNonHospitalExpensesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Non Hospital Expenses", "input")), " TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surgeryChargeTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgery Charge", "input")), "Surgery Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		investigationOrDiagnosticTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Investigation or Diagnostic", "input")), "Investigation or Diagnostic TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		MedicineChargeTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medicine Charge", "input")), "Medicine Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		consultationChargesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Consultation Charges", "input")), "Consultation Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		miscellaneousExpensesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Miscellaneous Expenses", "input")), "Miscellaneous Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ambulanceChargesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Ambulance charges", "input")), "Ambulance charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preHospitalizationChargesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre Hospitalization Charges", "input")), "Pre Hospitalization Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		postHospitalizationChargesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Post Hospitalization Charges", "input")), "Post Hospitalization Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysAdmittedInHospitalTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of days admitted in hospital", "input")), " TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roomTariffPerDayTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Room Tariff per Day", "input")), "Room Tariff per Day TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysStayedInRoomTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of days Stayed in Room", "input")), "Number of days Stayed in Room TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalRoomTariffTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Room Tariff", "input")), "Total Room Tariff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCURoomTariffperDayTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICU Room Tariff per Day", "input")), "ICU Room Tariff per Day TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysStayedInICUTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of days Stayed in ICU", "input")), "Number of days Stayed in ICU TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCUTotalRoomTariffTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICU Total Room Tariff", "input")), "ICU Total Room Tariff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCCURoomTariffperDayTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICCU Room Tariff per Day", "input")), "ICCU Room Tariff per Day TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysStayedInICCUTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of days Stayed in ICCU", "input")), "Number of days Stayed in ICCU TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCCUTotalRoomTariffTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICCU Total Room Tariff", "input")), "ICCU Total Room Tariff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalChargesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Charges", "input")), "Total Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductionIfanyChangeInZoneTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deduction if any (change in zone)", "input")), "Deduction if any (change in zone) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountAfterDeductionOfZoneTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Amount After Deduction of Zone", "input")), "Amount After Deduction of Zone Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountAdmissibleTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Amount Admissible", "input")), "Amount Admissible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		co_PaymentExcessTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Payment(Excess)", "input")), "Co-Payment(Excess) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		co_PaymentTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-payment", "input")), "", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hospitalDiscountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hospital Discount", "input")), " TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packageDiscountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Package Discount", "input")), "Package Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		volumeDiscountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Volume Discount", "input")), "Volume Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPayableAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Payable Amount", "input")), "Total Payable Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reductionAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reduction Amount", "input")), "Reduction Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForReductionDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason for Reduction", "select")), "Reason for ReductionSelect Is Service Tax Exempted Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		serviceTaxForCashlessClaimTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Service tax for Cashless Claim", "input")), "Service tax for Cashless Claim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tDSForCashlessClaimTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("TDS for Cashless Claim", "input")), "TDS for Cashless Claim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountPayableTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Net Claim Amount Payable", "input")), "Net Claim Amount PayableTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next1"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//ES

		claimCauseCodeforMediclaimTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Cause Code for Mediclaim", "input")), " Claim Cause Code for Mediclaim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalExpensesChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Expenses Charges", "input")), " Claim Cause Code for Mediclaim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		repatriationofRemainsChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Repatriation of Remains Charges", "input")), " Repatriation of Remains Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reUnionExpensesChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Re union Expenses charges", "input")), " Re union Expenses charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		icuTotalRoomTariffTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICU Total Room Tariff", "input")), "ICU Total Room Tariff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doctororProfessionalChargeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Doctor or Professional Charge", "input")), "Doctor or Professional Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consumablesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Consumables", "input")), "Doctor or Professional Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Charges", "input")), "Other Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//BH
		pAChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA Charges", "input")), "PA Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicinesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medicines", "input")), "Medicines TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim amount", "input")), "Claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDeductionForAgeAbove70TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional deduction for age above 70", "input")), "Additional deduction for age above 70 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//GH
		surgonFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgeon Fees", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anaesthetistSurgeonFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anaesthetist Surgeon Fees", "input")), "Anaesthetist Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalPractitionerFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Practitioner Fees", "input")), "Medical Practitioner Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consultantsFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Consultants Fees", "input")), "Consultants Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialistsFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Specialists Fees", "input")), "Specialists Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nursingExpensesFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nursing Expenses Fees", "input")), "Nursing Expenses Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totaofSurgeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total of Surge,Anaesthe,Medical Practit,Consult,Speciali Fees,Nursing Expens", "input")), "Total of Surge,Anaesthe,Medical Practit,Consult,Speciali Fees,Nursing Expens TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anesthesiaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthesia", "input")), "Anesthesia TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bloodTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Blood", "input")), "Blood TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		oxygenTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Oxygen", "input")), "Oxygen TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("OT Charges", "input")), "OT Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surgicalAppliancesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgical appliances", "input")), "Specialists Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		drugsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Drugs", "input")), "Drugs TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		diagnosticMaterialTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diagnostic Material and X-Ray", "input")), "Diagnostic Material and X-Ray TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dialysisTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Dialysis", "input")), "DialysisTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chemotherapyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Chemotherapy", "input")), "Chemotherapy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		radiotherapyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Radiotherapy", "input")), "Radiotherapy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costofPacemakerTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost of Pacemaker", "input")), "Cost of Pacemaker TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		artificialLimbsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Artificial Limbs", "input")), "Artificial Limbs TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		emergencyAmbulanceChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Emergency Ambulance charges", "input")), "Emergency Ambulance charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalofAneTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total of Ane,Blo,Oxy,OT,Sur app,Medi,dru,Dia X-Ray,Dia,Chem,Rad,pace,arti", "input")), "Total of Ane,Blo,Oxy,OT,Sur app,Medi,dru,Dia X-Ray,Dia,Chem,Rad,pace,arti TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		hospitalizationPayableAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hospitalization Payable Amount", "input")), "Hospitalization Payable Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maxNoofDaysforHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Maximum Number of Days for Hospitalization", "input")), "Maximum Number of Days for Hospitalization TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		prevNoofDaysinHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Number of Days in Hospitalization", "input")), "Previous Number of Days in Hospitalization TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoofDaysofHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Number of Days of Hospitalization", "input")), "Total Number of Days of Hospitalization TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balNoofDaysforHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Number of Days for Hospitalization", "input")), "Balance Number of Days for Hospitalization TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hospitalCashTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hospital Cash", "input")), "Hospital Cash TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transportationExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Transportation Expenses", "input")), "Transportation Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mealsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Meals", "input")), "Meals TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")),"Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")),"Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//JM

		surgeryTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgery Type", "select")), "Reason for ReductionSelect Is Service Tax Exempted Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalRoomTariffforintermediarysurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Room Tariff for intermediary surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		operationTheatreChargesforintermediarysurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Operation Theatre Charges for intermediary surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		anesthetistFeesforintermediarysurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthetist Fees for intermediary surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		surgeonfeesforintermediarysurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgeon fees for intermediary surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalRoomTariffforMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Room Tariff for Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		operationTheatreChargesforMajorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Operation Theatre Charges for Major Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		anesthetistFeesforMajorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthetist Fees for Major Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		surgeonfeesforMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgeon fees for Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		totalRoomTariffinclusiveOfNursingTreatmentchargesforMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Room Tariff (inclusive of nursing/treatment charges) for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minorSurgeryDayCareRoomrentPerDayForMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Minor surgery/Day care room rent per day for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		operationTheatreChargesforMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Operation Theatre Charges for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		anesthesiaforMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthesia for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anesthetistFeesforMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthetist Fees for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		surgeonfeesforMinorSurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgeon fees for Minor Surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		descriptionofNonSurgicalTypeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of Non-Surgical Type", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		totalRoomTariffforSupraMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Room Tariff for Supra Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		operationTheatreChargesforSupraMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Operation Theatre Charges for Supra Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		anesthetistFeesforSupraMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Anesthetist Fees for Supra Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		surgeonfeesforSupraMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surgeon fees for Supra Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCUTotalRoomTariffforSupraMajorsurgeryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICU Total Room Tariff for Supra Major surgery", "input")), "Surgeon Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		//TF
		batchNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Batch  Number", "textarea")), "Batch Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Tu
		roomorBoardingChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Room / Boarding Charges", "input")), "Room / Boarding Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nursingExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nursing Expenses", "input")), "Nursing Expenses TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iCUorICCURoomTariffperDayTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICU OR ICCU Room Tariff per Day", "input")), "ICU OR ICCU Room Tariff per Day TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofdaysStayedinORICCUTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of days Stayed in ICU OR ICCU", "input")), "Number of days Stayed in ICU OR ICCU TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//UK
		
		Copaymentpercent = new PageElement(By.xpath("//div[contains(text(),'Co-payment%')]/following::input[1]"), "Co-payment%",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
	}
	public void fillClaimMemberT1CLRDetails(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData, CustomAssert assertReference){
		//if(claimMemberT1_T2CLREnityHealthEntity.getBooleanValueForField("ConfigClaimMemberT1CLRDetails")){

		if(claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("add") || claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("edit")){
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOtherNonHospitalExpenses")) {
				clearAndSendKeys(otherNonHospitalExpensesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OtherNonHospitalExpenses"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeryCharge")) {
				clearAndSendKeys(surgeryChargeTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeryCharge"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigInvestigationOrDiagnostic")) {
				clearAndSendKeys(investigationOrDiagnosticTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("InvestigationOrDiagnostic"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicineCharge")) {
				clearAndSendKeys(MedicineChargeTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MedicineCharge"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsultationCharges")) {
				clearAndSendKeys(consultationChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ConsultationCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMiscellaneousExpenses")) {
				clearAndSendKeys(miscellaneousExpensesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MiscellaneousExpenses"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAmbulanceCharges")) {
				clearAndSendKeys(ambulanceChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AmbulanceCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreHospitalizationCharges")) {
				clearAndSendKeys(preHospitalizationChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("PreHospitalizationCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPostHospitalizationCharges")) {
				clearAndSendKeys(postHospitalizationChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("PostHospitalizationCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysAdmittedInHospital")) {
				clearAndSendKeys(numberOfDaysAdmittedInHospitalTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysAdmittedInHospital"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRoomTariffPerDay")) {
				clearAndSendKeys(roomTariffPerDayTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("RoomTariffPerDay"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInRoom")) {
				clearAndSendKeys(numberOfDaysStayedInRoomTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInRoom"));
			}

			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariff")) {
				clearAndSendKeys(totalRoomTariffTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariff"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICURoomTariffPerDay")) {
				clearAndSendKeys(iCURoomTariffperDayTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICURoomTariffPerDay"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInICU")) {
				clearAndSendKeys(numberOfDaysStayedInICUTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInICU"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICUTotalRoomTariff")) {
				clearAndSendKeys(iCUTotalRoomTariffTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICUTotalRoomTariff"));
			}

			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICCURoomTariffPerDay")) {
				clearAndSendKeys(iCCURoomTariffperDayTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICCURoomTariffPerDay"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInICCU")) {
				clearAndSendKeys(numberOfDaysStayedInICCUTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInICCU"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICCUTotalRoomTariff")) {
				clearAndSendKeys(iCCUTotalRoomTariffTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICCUTotalRoomTariff"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalCharges")) {
				clearAndSendKeys(totalChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAmountAdmissible")) {
				clearAndSendKeys(amountAdmissibleTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AmountAdmissible"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalDiscount")) {
				clearAndSendKeys(hospitalDiscountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalDiscount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPackageDiscount")) {
				clearAndSendKeys(packageDiscountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("PackageDiscount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigVolumeDiscount")) {
				clearAndSendKeys(volumeDiscountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("VolumeDiscount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalPayableAmount")) {
				clearAndSendKeys(totalPayableAmountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalPayableAmount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReductionAmount")) {
				clearAndSendKeys(reductionAmountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ReductionAmount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReasonForReduction")) {
				selectValueFromList(reasonForReductionDropDown, claimT2CLRForHealthProEntityListData.getStringValueForField("ReasonForReduction"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNetClaimAmountPayable")) {
				clearAndSendKeys(netClaimAmountPayableTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NetClaimAmountPayable"));
			}
			//ES
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimCauseCodeforMediclaim")) {
				clearAndSendKeys(claimCauseCodeforMediclaimTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimCauseCodeforMediclaim"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalExpensesCharges")) {
				clearAndSendKeys(medicalExpensesChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalExpensesCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRepatriationofRemainsCharges")) {
				clearAndSendKeys(repatriationofRemainsChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("RepatriationofRemainsCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReUnionExpensesCharges")) {
				clearAndSendKeys(reUnionExpensesChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ReUnionExpensesCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDoctororProfessionalCharge")) {
				clearAndSendKeys(doctororProfessionalChargeTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("DoctororProfessionalCharge"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsumables")) {
				clearAndSendKeys(consumablesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Consumables"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOtherCharges")) {
				clearAndSendKeys(otherChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OtherCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigServiceTaxforCashlessClaim")) {
				clearAndSendKeys(serviceTaxForCashlessClaimTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ServiceTaxforCashlessClaim"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTDSForCashlessClaim")) {
				clearAndSendKeys(tDSForCashlessClaimTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TDSForCashlessClaim"));
			}
			//BH
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPACharges")) {
				clearAndSendKeys(pAChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("PACharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicines")) {
				clearAndSendKeys(medicinesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Medicines"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimAmount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAdditionalDeductionForAgeAbove70")) {
				clearAndSendKeys(additionalDeductionForAgeAbove70TextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AdditionalDeductionForAgeAbove70"));
			}
			//GH
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonFees")) {
				clearAndSendKeys(surgonFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnaesthetistSurgeonFees")) {
				clearAndSendKeys(anaesthetistSurgeonFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnaesthetistSurgeonFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalPractitionerFees")) {
				clearAndSendKeys(medicalPractitionerFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalPractitionerFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsultantsFees")) {
				clearAndSendKeys(consultantsFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ConsultantsFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSpecialistsFees")) {
				clearAndSendKeys(specialistsFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SpecialistsFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNursingExpensesFees")) {
				clearAndSendKeys(nursingExpensesFeesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NursingExpensesFees"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalofSurge")) {
				clearAndSendKeys(totaofSurgeTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalofSurge"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthesia")) {
				clearAndSendKeys(anesthesiaTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Anesthesia"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBlood")) {
				clearAndSendKeys(bloodTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Blood"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOxygen")) {
				clearAndSendKeys(oxygenTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Oxygen"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOTCharges")) {
				clearAndSendKeys(otChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OTCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgicalAppliances")) {
				clearAndSendKeys(surgicalAppliancesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgicalAppliances"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDrugs")) {
				clearAndSendKeys(drugsTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Drugs"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDiagnosticMaterialXRay")) {
				clearAndSendKeys(diagnosticMaterialTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("DiagnosticMaterialXRay"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDialysis")) {
				clearAndSendKeys(dialysisTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Dialysis"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigChemotherapy")) {
				clearAndSendKeys(chemotherapyTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Chemotherapy"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRadiotherapy")) {
				clearAndSendKeys(radiotherapyTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Radiotherapy"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigCostofPacemaker")) {
				clearAndSendKeys(costofPacemakerTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("CostofPacemaker"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigArtificialLimbs")) {
				clearAndSendKeys(artificialLimbsTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ArtificialLimbs"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigEmergAmbulanceCharges")) {
				clearAndSendKeys(emergencyAmbulanceChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("EmergAmbulanceCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalofAne")) {
				clearAndSendKeys(totalofAneTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalofAne"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalizationPayableAmount")) {
				clearAndSendKeys(hospitalizationPayableAmountTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalizationPayableAmount"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMaxNoofDaysforHospitalization")) {
				clearAndSendKeys(maxNoofDaysforHospitalizationTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MaxNoofDaysforHospitalization"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreviousNoofDaysinHospitalization")) {
				clearAndSendKeys(prevNoofDaysinHospitalizationTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("PreviousNoofDaysinHospitalization"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalNoofDaysofHospitalization")) {
				clearAndSendKeys(totalNoofDaysofHospitalizationTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalNoofDaysofHospitalization"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBalanceNoofDaysforHospitalization")) {
				clearAndSendKeys(balNoofDaysforHospitalizationTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("BalanceNoofDaysforHospitalization"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalCash")) {
				clearAndSendKeys(hospitalCashTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalCash"));
			}
			//SP
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTransportationExpenses")) {
				clearAndSendKeys(transportationExpensesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TransportationExpenses"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMeals")) {
				clearAndSendKeys(mealsTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Meals"));
			}
			/*if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigServicetaxforCashlessClaim")) {
				clearAndSendKeys(servicetaxforCashlessClaimTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ServicetaxforCashlessClaim"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTDSforCashlessClaim")) {
				clearAndSendKeys(tDSforCashlessClaimTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TDSforCashlessClaim"));
			}*/

			//JM
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeryType")) {
				selectValueFromList(surgeryTypeDropDown, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeryType"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforintermediarysurgery")) {
				clearAndSendKeys(totalRoomTariffforintermediarysurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforintermediarysurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforintermediarysurgery")) {
				clearAndSendKeys(operationTheatreChargesforintermediarysurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforintermediarysurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforintermediarysurgery")) {
				clearAndSendKeys(anesthetistFeesforintermediarysurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforintermediarysurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforintermediarysurgery")) {
				clearAndSendKeys(surgeonfeesforintermediarysurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("Surgeonfeesforintermediarysurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforMajorsurgery")) {
				clearAndSendKeys(totalRoomTariffforMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforMajorSurgery")) {
				clearAndSendKeys(operationTheatreChargesforMajorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforMajorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforMajorSurgery")) {
				clearAndSendKeys(anesthetistFeesforMajorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforMajorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforMajorsurgery")) {
				clearAndSendKeys(surgeonfeesforMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffInclusiveofNursingTreatmentchargesforMinorSurgery")) {
				clearAndSendKeys(totalRoomTariffinclusiveOfNursingTreatmentchargesforMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffInclusiveofNursingTreatmentchargesforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMinorsurgeryDaycareroomrentperdayforMinorSurgery")) {
				clearAndSendKeys(minorSurgeryDayCareRoomrentPerDayForMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("MinorsurgeryDaycareroomrentperdayforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforMinorSurgery")) {
				clearAndSendKeys(operationTheatreChargesforMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthesiaforMinorSurgery")) {
				clearAndSendKeys(anesthesiaforMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthesiaforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforMinorSurgery")) {
				clearAndSendKeys(anesthetistFeesforMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforMinorSurgery")) {
				clearAndSendKeys(surgeonfeesforMinorSurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforMinorSurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDescriptionofNonSurgicalType")) {
				clearAndSendKeys(descriptionofNonSurgicalTypeTextField ,claimT2CLRForHealthProEntityListData.getStringValueForField("DescriptionofNonSurgicalType"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforSupraMajorsurgery")) {
				clearAndSendKeys(totalRoomTariffforSupraMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforSupraMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforSupraMajorsurgery")) {
				clearAndSendKeys(operationTheatreChargesforSupraMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforSupraMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforSupraMajorsurgery")) {
				clearAndSendKeys(anesthetistFeesforSupraMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforSupraMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforSupraMajorsurgery")) {
				clearAndSendKeys(surgeonfeesforSupraMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforSupraMajorsurgery"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICUTotalRoomTariffforSupraMajorsurgery")) {
				clearAndSendKeys(iCUTotalRoomTariffforSupraMajorsurgeryTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICUTotalRoomTariffforSupraMajorsurgery"));
			}
			//TF
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBatchNumber")) {
				clearAndSendKeys(batchNumberTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("BatchNumber"));
			}
			//TU
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRoomorBoardingCharges")) {
				clearAndSendKeys(roomorBoardingChargesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("RoomorBoardingCharges"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNursingExpenses")) {
				clearAndSendKeys(nursingExpensesTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NursingExpenses"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICUorICCURoomTariffperDay")) {
				clearAndSendKeys(iCUorICCURoomTariffperDayTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("ICUorICCURoomTariffperDay"));
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberofdaysStayedinORICCU")) {
				clearAndSendKeys(numberofdaysStayedinORICCUTextField, claimT2CLRForHealthProEntityListData.getStringValueForField("NumberofdaysStayedinORICCU"));
			}
			
			//UK
			
		 	if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigCopaymentpercent")) {
				clearAndSendKeys(Copaymentpercent, claimT2CLRForHealthProEntityListData.getStringValueForField("Copaymentpercent"));
			}
			
			
			
			
		}
		else if(claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("verify")){
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MemberSerialNo"),fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MemberCode"),fetchValueFromFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicationEventCodeLabel), AssertionType.WARNING);
			}

			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaim")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Claim"),fetchValueFromTextFields(claimTypePreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReasonForReopen")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ReasonForReopen"), fetchValueFromTextFields(reasonForReopenPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTPAClaimNumber")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TPAClaimNumber"),fetchValueFromTextFields(tPAClaimNumberPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTPARemarks")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TPARemarks"),fetchValueFromTextFields(tPARemarksPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigFileNoPatientNo")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("FileNoPatientNo"),fetchValueFromTextFields(fileNo_PatientNoPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDistrictStateNational")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DistrictStateNational"),fetchValueFromTextFields(districtStateNationalPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSL")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DistrictCourtSupremeCourtHighCourtSL"),fetchValueFromTextFields(districtCourt_SupremeCourtHighCourtSLPPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNameOfIllnessOperation")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NameOfIllnessOperation"),fetchValueFromTextFields(nameofIllnessOperationPreviousPageLabel), AssertionType.WARNING);
			}

			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDateOfSymptomsFirstAppeared")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DateOfSymptomsFirstAppeared"),fetchValueFromTextFields(dateOfSymptomsFirstAppearedPreviousPageLabel), AssertionType.WARNING);
			}
			//name fo illeness option is not available in previous page
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureCodesLevel1")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureCodesLevel1"),fetchValueFromTextFields(procedureCodesLevel1PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureCodesLevel2")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureCodesLevel2"),fetchValueFromTextFields(procedureCodesLevel2PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureCodesLevel3")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureCodesLevel3"),fetchValueFromTextFields(procedureCodesLevel3PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureDescriptionLevel1")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureDescriptionLevel1"),fetchValueFromTextFields(procedureDescriptionLevel1PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureDescriptionLevel2")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureDescriptionLevel2"),fetchValueFromTextFields(procedureDescriptionLevel2PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigProcedureDescriptionLevel3")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ProcedureDescriptionLevel3"), fetchValueFromTextFields(procedureDescriptionLevel3PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel1")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel1"),fetchValueFromTextFields(detailsOfPreExistingDiseaseDeclaredLevel1PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel2")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel2"),fetchValueFromTextFields(detailsOfPreExistingDiseaseDeclaredLevel2PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDetailsOfPreExistingDiseaseDeclaredLevel3")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DetailsOfPreExistingDiseaseDeclaredLevel3"),fetchValueFromTextFields(detailsofPreExistingDiseaseDeclaredLevel3PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalHistoryLevel1")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalHistoryLevel1"),fetchValueFromTextFields(medicalHistoryLevel1PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalHistoryLevel2")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalHistoryLevel2"),fetchValueFromTextFields(medicalHistoryLevel2PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalHistoryLevel3")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalHistoryLevel3"),fetchValueFromTextFields(MedicalHistoryLevel3PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDateOfAdmission")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DateOfAdmission"),fetchValueFromTextFields(dateOfAdmissionPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDateOfDischarge")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DateOfDischarge"), fetchValueFromTextFields(dateofdischargePreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDiagnosis")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Diagnosis"),fetchValueFromTextFields(diagnosisPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDiagnosisCodeLevel2")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DiagnosisCodeLevel2"),fetchValueFromTextFields(diagnosisCodeLevel2PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDiagnosisCodeLevel3")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DiagnosisCodeLevel3"),fetchValueFromTextFields(diagnosisCodeLevel3PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNatureOfTreatmentForMediclaim")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NatureOfTreatmentForMediclaim"), fetchValueFromTextFields(natureOfTreatmentForMediclaimPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAmountClaimed")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AmountClaimed"),fetchValueFromTextFields(AmountClaimedPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigWhetherHospitalIsNetworked")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("WhetherHospitalIsNetworked"),fetchValueFromTextFields(whetherHospitalisnetworkedPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigCumulativeBonus")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("CumulativeBonus"), fetchValueFromTextFields(cumulativeBonusPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreviousClaimAmount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PreviousClaimAmount"),fetchValueFromTextFields(previousClaimAmountPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBalanceSumInsured")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("BalanceSumInsured"),fetchValueFromTextFields(balanceSumInsuredPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNameOfBodyPartsForProcedureCodesLevel1")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NameOfBodyPartsForProcedureCodesLevel1"),fetchValueFromTextFields(nameofBodyPartsforProcedureCodesLevel1PreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigZoneHealth")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ZoneHealth"),fetchValueFromTextFields(zoneHealthPreviousPageLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOtherNonHospitalExpenses")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OtherNonHospitalExpenses"),fetchValueFromTextFields(otherNonHospitalExpensesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeryCharge")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeryCharge"),fetchValueFromTextFields(surgeryChargeTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigInvestigationOrDiagnostic")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("InvestigationOrDiagnostic"),fetchValueFromTextFields(investigationOrDiagnosticTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicineCharge")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicineCharge"),fetchValueFromTextFields(MedicineChargeTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsultationCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ConsultationCharges"),fetchValueFromTextFields(consultationChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMiscellaneousExpenses")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MiscellaneousExpenses"),fetchValueFromTextFields(miscellaneousExpensesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAmbulanceCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AmbulanceCharges"),fetchValueFromTextFields(ambulanceChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreHospitalizationCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PreHospitalizationCharges"),fetchValueFromTextFields(preHospitalizationChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPostHospitalizationCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PostHospitalizationCharges"),fetchValueFromTextFields(postHospitalizationChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysAdmittedInHospital")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysAdmittedInHospital"),fetchValueFromTextFields(numberOfDaysAdmittedInHospitalTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRoomTariffPerDay")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("RoomTariffPerDay"),fetchValueFromTextFields(roomTariffPerDayTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInRoom")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInRoom"),fetchValueFromTextFields(numberOfDaysStayedInRoomTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariff")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariff"),fetchValueFromTextFields(totalRoomTariffTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICURoomTariffPerDay")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ICURoomTariffPerDay"),fetchValueFromTextFields(iCURoomTariffperDayTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInICU")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInICU"),fetchValueFromTextFields(numberOfDaysStayedInICUTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICUTotalRoomTariff")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ICUTotalRoomTariff"),fetchValueFromTextFields(iCUTotalRoomTariffTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICCURoomTariffPerDay")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ICCURoomTariffPerDay"),fetchValueFromTextFields(iCCURoomTariffperDayTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNumberOfDaysStayedInICCU")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NumberOfDaysStayedInICCU"),fetchValueFromTextFields(numberOfDaysStayedInICCUTextField), AssertionType.WARNING);
			}

			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICCUTotalRoomTariff")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ICCUTotalRoomTariff"),fetchValueFromTextFields(iCCUTotalRoomTariffTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalCharges"),fetchValueFromTextFields(totalChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAmountAdmissible")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AmountAdmissible"), fetchValueFromTextFields(amountAdmissibleTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalDiscount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalDiscount"),fetchValueFromTextFields(hospitalDiscountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPackageDiscount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PackageDiscount"),fetchValueFromTextFields(packageDiscountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigVolumeDiscount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("VolumeDiscount"),fetchValueFromTextFields(volumeDiscountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalPayableAmount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalPayableAmount"),fetchValueFromTextFields(totalPayableAmountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReductionAmount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ReductionAmount"),fetchValueFromTextFields(reductionAmountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReasonForReduction")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ReasonForReduction"),fetchValueFromList(reasonForReductionDropDown), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNetClaimAmountPayable")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NetClaimAmountPayable"),fetchValueFromTextFields(netClaimAmountPayableTextField), AssertionType.WARNING);
			}
			//ES
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimCauseCodeforMediclaim")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimCauseCodeforMediclaim"),fetchValueFromTextFields(claimCauseCodeforMediclaimTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalExpensesCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalExpensesCharges"),fetchValueFromTextFields(medicalExpensesChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRepatriationofRemainsCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("RepatriationofRemainsCharges"),fetchValueFromTextFields(repatriationofRemainsChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReUnionExpensesCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ReUnionExpensesCharges"),fetchValueFromTextFields(reUnionExpensesChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDoctororProfessionalCharge")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DoctororProfessionalCharge"),fetchValueFromTextFields(doctororProfessionalChargeTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsumables")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Consumables"),fetchValueFromTextFields(consumablesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOtherCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OtherCharges"),fetchValueFromTextFields(otherChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigServiceTaxforCashlessClaim")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ServiceTaxforCashlessClaim"),fetchValueFromTextFields(serviceTaxForCashlessClaimTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTDSForCashlessClaim")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TDSForCashlessClaim"),fetchValueFromTextFields(tDSForCashlessClaimTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNetClaimAmountPayable")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NetClaimAmountPayable"),fetchValueFromTextFields(netClaimAmountPayableTextField), AssertionType.WARNING);
			}
			//BH
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPACharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PACharges"),fetchValueFromTextFields(pAChargesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicines")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Medicines"),fetchValueFromTextFields(medicinesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimAmount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAdditionalDeductionForAgeAbove70")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AdditionalDeductionForAgeAbove70"),fetchValueFromTextFields(additionalDeductionForAgeAbove70TextField), AssertionType.WARNING);
			}
			// GH
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonFees"),fetchValueFromTextFields(surgonFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnaesthetistSurgeonFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnaesthetistSurgeonFees"),fetchValueFromTextFields(anaesthetistSurgeonFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMedicalPractitionerFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MedicalPractitionerFees"),fetchValueFromTextFields(medicalPractitionerFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigConsultantsFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ConsultantsFees"),fetchValueFromTextFields(consultantsFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSpecialistsFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SpecialistsFees"),fetchValueFromTextFields(specialistsFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNursingExpensesFees")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("NursingExpensesFees"),fetchValueFromTextFields(nursingExpensesFeesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalofSurge")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalofSurge"),fetchValueFromTextFields(totaofSurgeTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthesia")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Anesthesia"),fetchValueFromTextFields(anesthesiaTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBlood")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Blood"),fetchValueFromTextFields(bloodTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOxygen")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Oxygen"),fetchValueFromTextFields(oxygenTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOTCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OTCharges"),fetchValueFromTextFields(otChargesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgicalAppliances")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgicalAppliances"),fetchValueFromTextFields(surgicalAppliancesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDrugs")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Drugs"),fetchValueFromTextFields(drugsTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDiagnosticMaterialXRay")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DiagnosticMaterialXRay"),fetchValueFromTextFields(diagnosticMaterialTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDialysis")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Dialysis"),fetchValueFromTextFields(dialysisTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigChemotherapy")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Chemotherapy"),fetchValueFromTextFields(chemotherapyTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigRadiotherapy")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Radiotherapy"),fetchValueFromTextFields(radiotherapyTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigCostofPacemaker")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("CostofPacemaker"),fetchValueFromTextFields(costofPacemakerTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigArtificialLimbs")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ArtificialLimbs"),fetchValueFromTextFields(artificialLimbsTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigEmergAmbulanceCharges")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("EmergAmbulanceCharges"),fetchValueFromTextFields(emergencyAmbulanceChargesTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalofAne")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalofAne"),fetchValueFromTextFields(totalofAneTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalizationPayableAmount")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalizationPayableAmount"),fetchValueFromTextFields(hospitalizationPayableAmountTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMaxNoofDaysforHospitalization")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MaxNoofDaysforHospitalization"),fetchValueFromTextFields(maxNoofDaysforHospitalizationTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreviousNoofDaysinHospitalization")) {

				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("PreviousNoofDaysinHospitalization"),fetchValueFromTextFields(prevNoofDaysinHospitalizationTextField), AssertionType.WARNING);				
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalNoofDaysofHospitalization")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalNoofDaysofHospitalization"),fetchValueFromTextFields(totalNoofDaysofHospitalizationTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBalanceNoofDaysforHospitalization")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("BalanceNoofDaysforHospitalization"),fetchValueFromTextFields(balNoofDaysforHospitalizationTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigHospitalCash")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalCash"),fetchValueFromTextFields(hospitalCashTextField), AssertionType.WARNING);

			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//SP
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTransportationExpenses")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TransportationExpenses"),fetchValueFromTextFields(transportationExpensesTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMeals")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("HospitalCash"),fetchValueFromTextFields(mealsTextField), AssertionType.WARNING);
			}
			//JM
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeryType")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeryType"), fetchValueFromList(surgeryTypeDropDown), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforintermediarysurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforintermediarysurgery"), fetchValueFromTextFields(totalRoomTariffforintermediarysurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforintermediarysurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforintermediarysurgery"), fetchValueFromTextFields(operationTheatreChargesforintermediarysurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforintermediarysurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforintermediarysurgery"), fetchValueFromTextFields(anesthetistFeesforintermediarysurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforintermediarysurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("Surgeonfeesforintermediarysurgery"), fetchValueFromTextFields(surgeonfeesforintermediarysurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforMajorsurgery"), fetchValueFromTextFields(totalRoomTariffforMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforMajorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforMajorSurgery"), fetchValueFromTextFields(operationTheatreChargesforMajorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforMajorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforMajorSurgery"), fetchValueFromTextFields(anesthetistFeesforMajorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforMajorsurgery"), fetchValueFromTextFields(surgeonfeesforMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffInclusiveofNursingTreatmentchargesforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffInclusiveofNursingTreatmentchargesforMinorSurgery"), fetchValueFromTextFields(totalRoomTariffinclusiveOfNursingTreatmentchargesforMinorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMinorsurgeryDaycareroomrentperdayforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("MinorsurgeryDaycareroomrentperdayforMinorSurgery"), fetchValueFromTextFields(minorSurgeryDayCareRoomrentPerDayForMinorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforMinorSurgery"), fetchValueFromTextFields(operationTheatreChargesforMinorSurgeryTextField),AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthesiaforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthesiaforMinorSurgery"), fetchValueFromTextFields(anesthesiaforMinorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforMinorSurgery"), fetchValueFromTextFields(anesthesiaforMinorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforMinorSurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforMinorSurgery"), fetchValueFromTextFields(surgeonfeesforMinorSurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDescriptionofNonSurgicalType")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("DescriptionofNonSurgicalType"), fetchValueFromTextFields(descriptionofNonSurgicalTypeTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigTotalRoomTariffforSupraMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("TotalRoomTariffforSupraMajorsurgery"), fetchValueFromTextFields(totalRoomTariffforSupraMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigOperationTheatreChargesforSupraMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("OperationTheatreChargesforSupraMajorsurgery"), fetchValueFromTextFields(operationTheatreChargesforSupraMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAnesthetistFeesforSupraMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("AnesthetistFeesforSupraMajorsurgery"), fetchValueFromTextFields(anesthetistFeesforSupraMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSurgeonfeesforSupraMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("SurgeonfeesforSupraMajorsurgery"), fetchValueFromTextFields(surgeonfeesforSupraMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigICUTotalRoomTariffforSupraMajorsurgery")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("ICUTotalRoomTariffforSupraMajorsurgery"), fetchValueFromTextFields(iCUTotalRoomTariffforSupraMajorsurgeryTextField), AssertionType.WARNING);
			}
			if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBatchNumber")) {
				assertReference.assertEquals(claimT2CLRForHealthProEntityListData.getStringValueForField("BatchNumber"), fetchValueFromTextFields(batchNumberTextField), AssertionType.WARNING);
			}
			
		}	
	}

	public void proceedButtonT2CLRForHealthProducts(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigNextProceedButton")){		
			click(forwordButton);
			try{
				switchToFrame("display");	
			}
			catch(Exception e){
			}
			pageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimT2CLRForHealthProTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(pageTitle);
		}
	}
	public void saveButtonT2CLRForHealthProducts(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			pageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimT2CLRForHealthProEntityListData.getStringValueForField("ClaimT2CLRForHealthProTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(pageTitle);
		}
	}
	public void navigateToPreviousAttributePage(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPreviousButton")){		
			click(backwordButton);
			switchToFrame("display");
			isElementDisplayed(prevPageTitle);
		}
	}	
	public void navigateToMainAttributePage(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToDocument(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToMemberDetails(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMemberDetailsTab")){		
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailsTabTitle);
		}
	}
	public void navigateToMemberAttribute(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData){
		if (claimT2CLRForHealthProEntityListData.getBooleanValueForField("ConfigMemberAttributeTab")){		
			click(memberAttributeTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimMemberT2CLRAttibutesHealth(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData, CustomAssert assertReference) {
		if (isConfigTrue(claimT2CLRForHealthProEntityListData.getConfigExecute())){
			switchToFrame("display");
			fillClaimMemberT1CLRDetails(claimT2CLRForHealthProEntityListData, assertReference);
			proceedButtonT2CLRForHealthProducts(claimT2CLRForHealthProEntityListData);
			saveButtonT2CLRForHealthProducts(claimT2CLRForHealthProEntityListData);
			navigateToPreviousAttributePage(claimT2CLRForHealthProEntityListData);
			navigateToMainAttributePage(claimT2CLRForHealthProEntityListData);
			navigateToclaimHomePage(claimT2CLRForHealthProEntityListData);
			navigateToMember(claimT2CLRForHealthProEntityListData);
			navigateToDocument(claimT2CLRForHealthProEntityListData);
			navigateToParties(claimT2CLRForHealthProEntityListData);
			navigateToReserve(claimT2CLRForHealthProEntityListData);
			navigateToPayment(claimT2CLRForHealthProEntityListData);
			navigateToAttribute(claimT2CLRForHealthProEntityListData);
			navigateToMemberDetails(claimT2CLRForHealthProEntityListData);
			navigateToMemberAttribute(claimT2CLRForHealthProEntityListData);
		}
	}
}
