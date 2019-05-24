package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPropertyMotorEntity;

public class ClaimPropertyMotor extends BasePage {
	private PageElement claimPropertyTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement claimTitle;
	private PageElement claimDetailsTitlePage;
	//private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement claimMemberDamageTitlePage;
	private PageElement documentTitle;
	private PageElement claimDocumentsTitlePage;
	private PageElement partiesTitle;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement reserveTitle;
	private PageElement claimReserveTitlePage;
	private PageElement paymentTitle;
	private PageElement claimPaymentsTitlePage;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement totalFeesForSpotSurveyTextField;
	private PageElement totalFeesForFinalSurveyTextField;
	private PageElement totalFeesForReInspectionSurveyTextField;
	private PageElement totalFeesForInvestigationTextField;
	private PageElement totalEstimatedAmountTextField;
	private PageElement assessedAmountTextField;
	private PageElement policyExcessRsTextField;
	private PageElement totalSITextField;
	private PageElement proceedButton;
	private PageElement courtMasterForAllProductTitlePage;
	private PageElement backButton;
	private PageElement claimPropertyTitle;


	//MiscNon
	private PageElement dateofaccidentTextField;
	private PageElement dateOfAccidentFindButton;	
	private PageElement saveButton;

	private PageElement serialNumberOfTheEquipmentTextField;
	private PageElement equipmentSerialProvidedDuringClaimTextField;
	private PageElement amountClaimedTextField;
	private PageElement amountPaidTextField;
	private PageElement balanceSumInsuredBeforeTheCurrentClaimTextField;
	//Motor
	private PageElement claimApprovalDropdownList;
	private PageElement labourChargeAmountTextarea;
	private PageElement sparePartsAmountTextarea;
	private PageElement paintingAmountTextarea;
	private PageElement plasticRubberAmountTextarea;
	private PageElement metalElecAmountTextarea;
	private PageElement totalGlassAmountTextarea;
	private PageElement totalOtherAmountTextarea;
	private PageElement miscAmountTextarea;
	private PageElement totalSurveyorAmountTextarea;
	private PageElement metalSparePartsTextField;
	private PageElement metalSparePartsDepriciationTextField;
	private PageElement nonMetalSparePartsTextField;
	private PageElement nonMetalSparePartsDepriciationTextField;
	private PageElement fiberSparePartsTextField;
	private PageElement fiberSparePartsDepriciationTextField;
	private PageElement glassSparePartsTextField;
	private PageElement surveyFeesTextField;
	private PageElement labourChargesTextField;
	private PageElement advocateChargesTextField;
	private PageElement otherMiscExpensesTextField;
	private PageElement paintingChargesToBePayableDropDown;
	private PageElement additionalDetailsForTheftLossTextarea;
	private PageElement additionalDetailsForRepairAndTheftLossTextarea;
	private PageElement additionalDetailsForNoClaimTextarea;
	private PageElement insuredLiabilityAmountTextField;
	private PageElement claimAttributeTitlePage;
	private PageElement claimAttributeTWTitlePage;

	public ClaimPropertyMotor(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimAttributeTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'Claim_Property_Only_CV')]"), "Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//insuredItemTitle = new PageElement(By.xpath("//b//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.xpath("//b//div[contains(text(),'Member')]"),"Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimMemberDamageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTitle = new PageElement(By.xpath("//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalFeesForSpotSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Spot Survey')]/following::input"), "Total Fees for Spot Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForFinalSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Final Survey')]/following::input"), "Total Fees for Final Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForReInspectionSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Re-inspection Survey')]/following::input"), "Total Fees for Re-inspection Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForInvestigationTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Investigation')]/following::input"), "Total Fees for Investigation Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalEstimatedAmountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Estimated Amount')]/following::input"), "Total Estimated Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		assessedAmountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Amount')]/following::input"), "Assessed Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		policyExcessRsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Policy Excess (Rs)')]/following::input"), "Policy Excess (Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalSITextField = new PageElement(By.xpath("//td//div[contains(text(),'Total SI')]/following::input"), "Total SI Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		proceedButton = new PageElement(By.name("Next1"),"Proceed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		courtMasterForAllProductTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Court Master For All Product')]"), " Court Master For All Product Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//MiscNon
		dateofaccidentTextField=  new PageElement(By.xpath("//td//div[contains(text(),'Date of accident')]/following::input"), "Date of accident", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfAccidentFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of accident')]/following::input/following::a[@name='firstFocus']"), "Date of accident Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton = new PageElement(By.name("btnSave"),"Save Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		serialNumberOfTheEquipmentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Serial number of the Equipment')]/following::input"), "Serial number of the Equipment", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		equipmentSerialProvidedDuringClaimTextField=new PageElement(By.xpath("//td//div[contains(text(),'Equipment Serial provided during claim')]/following::input"), "Equipment Serial provided during claim", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountClaimedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount Claimed')]/following::input"), "Amount Claimed", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountPaidTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount Paid')]/following::input"), "Amount Paid", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		balanceSumInsuredBeforeTheCurrentClaimTextField=new PageElement(By.xpath("//td//div[contains(text(),'Balance Sum Insured before the Current Claim')]/following::input"), "Balance Sum Insured before the Current Claim", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Motor
		claimApprovalDropdownList=new PageElement(By.xpath("//div[contains(text(),'Claim Approval Type')]//following::select[1]"), "Claim Approval Type", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		labourChargeAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Labour Charge Surveyor Assessed Amount')]//following::textarea[1]"), "Labour Charge", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparePartsAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Spare Parts Surveyor Assessed Amount')]//following::textarea[1]"), "Spare Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paintingAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Painting Surveyor Assessed Amount')]//following::textarea[1]"), "Painting Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		plasticRubberAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Plastic Rubber Surveyor Assessed Amount')]//following::textarea[1]"), "Plastic Rubber", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		metalElecAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Metal Elec Surveyor Assessed Amount')]//following::textarea[1]"), "Metal Elec Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalGlassAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Total Glass Surveyor Assessed Amount')]//following::textarea[1]"), "Total Glass Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalOtherAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Total Other Surveyor Assessed Amount')]//following::textarea[1]"), "Total Other Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		miscAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Misc Surveyor Assessed Amount')]//following::textarea[1]"), "Misc Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSurveyorAmountTextarea=new PageElement(By.xpath("//div[contains(text(),'Total Surveyor Assessed Amount')]//following::textarea[1]"), "Total Surveyor Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		metalSparePartsTextField= new PageElement(By.xpath("//input[@name=('propValues2')]"), "Metal Spare Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		metalSparePartsDepriciationTextField= new PageElement(By.xpath("//div[starts-with(text(),'Metal Spare Parts Depreciation')]//following::input[1]"), "Metal Spare Depriciation Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nonMetalSparePartsTextField= new PageElement(By.xpath("//input[@name='propValues4']"), "Non Metal Spare Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nonMetalSparePartsDepriciationTextField= new PageElement(By.xpath("//input[@name='propValues5']"), "Non Metal Spare Depriciation Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fiberSparePartsTextField= new PageElement(By.xpath("//input[@name='propValues6']"), "Fiber Spare Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fiberSparePartsDepriciationTextField= new PageElement(By.xpath("//input[@name='propValues7']"), "Fiber Spare Parts Depriciation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		glassSparePartsTextField= new PageElement(By.xpath("//input[@name='propValues8']"), "Glass Spare Parts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField= new PageElement(By.xpath("//input[@name='propValues9']"), "Survey Fees", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		labourChargesTextField= new PageElement(By.xpath("//input[@name='propValues10']"), "Labour Charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		advocateChargesTextField= new PageElement(By.xpath("//input[@name='propValues11']"), "Advocate Charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherMiscExpensesTextField= new PageElement(By.xpath("//input[@name='propValues12']"), "Other Misc Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paintingChargesToBePayableDropDown= new PageElement(By.xpath("//select[@name='propValues1']"), "Painting Charges to be payable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalDetailsForTheftLossTextarea= new PageElement(By.xpath("//textarea[@name='propValues20']"), "Additional Details For Theft Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDetailsForRepairAndTheftLossTextarea= new PageElement(By.xpath("//textarea[@name='propValues21']"), "Additional Details For Repair And Theft Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDetailsForNoClaimTextarea= new PageElement(By.xpath("//textarea[@name='propValues22']"), "Additional Details For No Claim", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredLiabilityAmountTextField= new PageElement(By.xpath("//input[@name='propValues1']"), "Insured Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAttributeTWTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'ClaimPropertyMotor')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}


	public void fillClaimPropertyDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForSpotSurvey")) {
				clearAndSendKeys(totalFeesForSpotSurveyTextField, claimPropertyMotorEntity.getStringValueForField("TotalFeesForSpotSurvey"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForFinalSurvey")) {
				clearAndSendKeys(totalFeesForFinalSurveyTextField, claimPropertyMotorEntity.getStringValueForField("TotalFeesForFinalSurvey"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForReInspectionSurvey")) {
				clearAndSendKeys(totalFeesForReInspectionSurveyTextField, claimPropertyMotorEntity.getStringValueForField("TotalFeesForReInspectionSurvey"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForInvestigation")) {
				clearAndSendKeys(totalFeesForInvestigationTextField, claimPropertyMotorEntity.getStringValueForField("TotalFeesForInvestigation"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalEstimatedAmount")) {
				clearAndSendKeys(totalEstimatedAmountTextField, claimPropertyMotorEntity.getStringValueForField("TotalEstimatedAmount"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				clearAndSendKeys(assessedAmountTextField, claimPropertyMotorEntity.getStringValueForField("AssessedAmount"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				clearAndSendKeys(policyExcessRsTextField, claimPropertyMotorEntity.getStringValueForField("PolicyExcessRs"));
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalSI")) {
				clearAndSendKeys(totalSITextField, claimPropertyMotorEntity.getStringValueForField("TotalSI"));
			}
			//MiscNon			
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigDateOfAccident")) {
				click(dateOfAccidentFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateofaccidentTextField, claimPropertyMotorEntity.getStringValueForField("DateOfAccident"));
				switchToFrame("display");		
			}

			//MiscNonLiability-Extra fields

			if(claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiabilitys")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAmountClaimed")) {
					clearAndSendKeys(amountClaimedTextField, claimPropertyMotorEntity.getStringValueForField("AmountClaimed"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAmountPaid")) {
					clearAndSendKeys(amountPaidTextField, claimPropertyMotorEntity.getStringValueForField("AmountPaid"));
				}
			}

			if(claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimApprovalType")) {
					selectValueFromList(claimApprovalDropdownList, claimPropertyMotorEntity.getStringValueForField("ClaimApprovalType"));
				}
			}

		}



		else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("ClaimDate"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForSpotSurvey")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalFeesForSpotSurvey"), fetchValueFromTextFields(totalFeesForSpotSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForFinalSurvey")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalFeesForFinalSurvey"), fetchValueFromTextFields(totalFeesForFinalSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForReInspectionSurvey")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalFeesForReInspectionSurvey"), fetchValueFromTextFields(totalFeesForReInspectionSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalFeesForInvestigation")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalFeesForInvestigation"), fetchValueFromTextFields(totalFeesForInvestigationTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalEstimatedAmount")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalEstimatedAmount"), fetchValueFromTextFields(totalEstimatedAmountTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AssessedAmount"), fetchValueFromTextFields(assessedAmountTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("PolicyExcessRs"), fetchValueFromTextFields(policyExcessRsTextField), AssertionType.WARNING);
			}
			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalSI")) {
				assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalSI"), fetchValueFromTextFields(totalSITextField), AssertionType.WARNING);
			}	

			if (claimPropertyMotorEntity.getBooleanValueForField("ConfigDateOfAccident")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPropertyMotorEntity.getStringValueForField("DateOfAccident")) ,fetchValueFromTextFields(dateofaccidentTextField), AssertionType.WARNING);
			}

			if(claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiabilitys")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSerialNoOfTheEquipment")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("SerialNoOfTheEquipment"), fetchValueFromTextFields(serialNumberOfTheEquipmentTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigEquipmentSerialProvidedDuringClaim")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("EquipmentSerialProvidedDuringClaim"), fetchValueFromTextFields(equipmentSerialProvidedDuringClaimTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAmountClaimed")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AmountClaimed"), fetchValueFromTextFields(amountClaimedTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAmountPaid")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AmountPaid"), fetchValueFromTextFields(amountPaidTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigBalanceSumInsuredBeforeTheCurrentClaim")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("BalanceSumInsuredBeforeTheCurrentClaim"), fetchValueFromTextFields(balanceSumInsuredBeforeTheCurrentClaimTextField), AssertionType.WARNING);
				}
			}
			if(claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimApprovalType")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("ClaimApprovalType"), fetchValueFromList(claimApprovalDropdownList), AssertionType.WARNING);
				}
			}

		}
	}	

public void fillClaimPropertyMotorCVDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))) {
			if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigLabourCharge")) {
					clearAndSendKeys(labourChargeAmountTextarea, claimPropertyMotorEntity.getStringValueForField("LabourCharge"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSparePartsAmounts")) {
					clearAndSendKeys(sparePartsAmountTextarea, claimPropertyMotorEntity.getStringValueForField("SparePartsAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPaintingAmounts")) {
					clearAndSendKeys(paintingAmountTextarea, claimPropertyMotorEntity.getStringValueForField("PaintingAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPlasticRubberAmounts")) {
					clearAndSendKeys(plasticRubberAmountTextarea, claimPropertyMotorEntity.getStringValueForField("PlasticRubberAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalElecAmounts")) {
					clearAndSendKeys(metalElecAmountTextarea, claimPropertyMotorEntity.getStringValueForField("MetalElecAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalGlassAmounts")) {
					clearAndSendKeys(totalGlassAmountTextarea, claimPropertyMotorEntity.getStringValueForField("TotalGlassAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalOtherAmounts")) {
					clearAndSendKeys(totalOtherAmountTextarea, claimPropertyMotorEntity.getStringValueForField("TotalOtherAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMiscAmounts")) {
					clearAndSendKeys(miscAmountTextarea, claimPropertyMotorEntity.getStringValueForField("MiscAmounts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalSurveyor")) {
					clearAndSendKeys(totalSurveyorAmountTextarea, claimPropertyMotorEntity.getStringValueForField("TotalSurveyor"));
				}
			}
			else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigLabourCharge")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("LabourCharge"), fetchValueFromTextFields(labourChargeAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSparePartsAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("SparePartsAmounts"), fetchValueFromTextFields(sparePartsAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPaintingAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("PaintingAmounts"), fetchValueFromTextFields(paintingAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPlasticRubberAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("PlasticRubberAmounts"), fetchValueFromTextFields(plasticRubberAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalElecAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("MetalElecAmounts"), fetchValueFromTextFields(metalElecAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalGlassAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalGlassAmounts"), fetchValueFromTextFields(totalGlassAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalOtherAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalOtherAmounts"), fetchValueFromTextFields(totalOtherAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMiscAmounts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("MiscAmounts"), fetchValueFromTextFields(miscAmountTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigTotalSurveyor")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("TotalSurveyor"), fetchValueFromTextFields(totalSurveyorAmountTextarea), AssertionType.WARNING);
				}
			}

		}
	}
	public void proceedClaimAttMotorDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity) {
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigNextButton")) {
			click(proceedButton);
		}
	}

	public void fillClaimPropertyMotorDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")) && ((claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))||(claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("TW")))) {
			if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){

				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalSpareParts")) {
					clearAndSendKeys(metalSparePartsTextField, claimPropertyMotorEntity.getStringValueForField("MetalSpareParts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalSparePartsDepreciation")) {
					clearAndSendKeys(metalSparePartsDepriciationTextField, claimPropertyMotorEntity.getStringValueForField("MetalSparePartsDepreciation"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigNonMetalSpareParts")) {
					clearAndSendKeys(nonMetalSparePartsTextField, claimPropertyMotorEntity.getStringValueForField("NonMetalSpareParts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigNonMetalSparePartsDepreciation")) {
					clearAndSendKeys(nonMetalSparePartsDepriciationTextField, claimPropertyMotorEntity.getStringValueForField("NonMetalSparePartsDepreciation"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigFiberSpareParts")) {
					clearAndSendKeys(fiberSparePartsTextField, claimPropertyMotorEntity.getStringValueForField("FiberSpareParts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigFiberSparePartsdepriciation")) {
					clearAndSendKeys(fiberSparePartsDepriciationTextField, claimPropertyMotorEntity.getStringValueForField("FiberSparePartsdepriciation"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigGlassSpareParts")) {
					clearAndSendKeys(glassSparePartsTextField, claimPropertyMotorEntity.getStringValueForField("GlassSpareParts"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSurveyFees")) {
					clearAndSendKeys(surveyFeesTextField, claimPropertyMotorEntity.getStringValueForField("SurveyFees"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigLabourCharges")) {
					clearAndSendKeys(labourChargesTextField, claimPropertyMotorEntity.getStringValueForField("LabourCharges"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdvocateCharges")) {
					clearAndSendKeys(advocateChargesTextField, claimPropertyMotorEntity.getStringValueForField("AdvocateCharges"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigOtherMiscExpenses")) {
					clearAndSendKeys(otherMiscExpensesTextField, claimPropertyMotorEntity.getStringValueForField("OtherMiscExpenses"));
				}
			}
			else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalSpareParts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("MetalSpareParts"), fetchValueFromTextFields(metalSparePartsTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMetalSparePartsDepreciation")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("MetalSparePartsDepreciation"), fetchValueFromTextFields(metalSparePartsDepriciationTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigNonMetalSpareParts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("NonMetalSpareParts"), fetchValueFromTextFields(nonMetalSparePartsTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigNonMetalSparePartsDepreciation")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("NonMetalSparePartsDepreciation"), fetchValueFromTextFields(nonMetalSparePartsDepriciationTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigFiberSpareParts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("FiberSpareParts"), fetchValueFromTextFields(fiberSparePartsTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigFiberSparePartsdepriciation")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("FiberSparePartsdepriciation"), fetchValueFromTextFields(fiberSparePartsDepriciationTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigGlassSpareParts")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("GlassSpareParts"), fetchValueFromTextFields(glassSparePartsTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSurveyFees")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("SurveyFees"), fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigLabourCharges")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("LabourCharges"), fetchValueFromTextFields(labourChargesTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdvocateCharges")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AdvocateCharges"), fetchValueFromTextFields(advocateChargesTextField), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigOtherMiscExpenses")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("OtherMiscExpenses"), fetchValueFromTextFields(otherMiscExpensesTextField), AssertionType.WARNING);
				}
			}
		}
	}
	public void proceedClaimAttributeMotorDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity) {
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigCVNextButton")) {
			click(proceedButton);
		}
	}
	public void fillClaimPropertyMotorNewDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
				&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))) {
			if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){

				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPaintingCharges")) {
					selectValueFromList(paintingChargesToBePayableDropDown, claimPropertyMotorEntity.getStringValueForField("PaintingCharges"));
					click(proceedButton);
				}
			}
			else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPaintingCharges")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("PaintingCharges"), fetchValueFromList(paintingChargesToBePayableDropDown), AssertionType.WARNING);
					click(proceedButton);
				}
			}
		}
	}
	public void fillClaimLettersMotorDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
				&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))) {
			if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForTheftLoss")) {
					clearAndSendKeys(additionalDetailsForTheftLossTextarea, claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForTheftLoss"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForRepairAndTheftLoss")) {
					clearAndSendKeys(additionalDetailsForRepairAndTheftLossTextarea, claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForRepairAndTheftLoss"));
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForNoClaim")) {
					clearAndSendKeys(additionalDetailsForNoClaimTextarea, claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForNoClaim"));
					click(proceedButton);
				}
			}
			else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForTheftLoss")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForTheftLoss"), fetchValueFromTextFields(additionalDetailsForTheftLossTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForRepairAndTheftLoss")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForRepairAndTheftLoss"), fetchValueFromTextFields(additionalDetailsForRepairAndTheftLossTextarea), AssertionType.WARNING);
				}
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAdditionalDetailsForNoClaim")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("AdditionalDetailsForNoClaim"), fetchValueFromTextFields(additionalDetailsForNoClaimTextarea), AssertionType.WARNING);
					click(proceedButton);
				}
			}
		}
	}
	public void fillClaimInsuredLiabilityMotorDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
				&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))) {
			if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("add") || claimPropertyMotorEntity.getAction().equalsIgnoreCase("edit")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigInsuredLiabilityAmount")) {
					clearAndSendKeys(insuredLiabilityAmountTextField, claimPropertyMotorEntity.getStringValueForField("InsuredLiabilityAmount"));
				}
			}
			else if(claimPropertyMotorEntity.getAction().equalsIgnoreCase("verify")){
				if (claimPropertyMotorEntity.getBooleanValueForField("ConfigInsuredLiabilityAmount")) {
					assertReference.assertEquals(claimPropertyMotorEntity.getStringValueForField("InsuredLiabilityAmount"), fetchValueFromTextFields(insuredLiabilityAmountTextField), AssertionType.WARNING);	
				}
			}
		}
	}
	public void navigateToClaim(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}	
	}
	public void proceedToNextPage(ClaimPropertyMotorEntity claimPropertyMotorEntity){
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigProceedButton")){
			click(proceedButton);
			switchToFrame("display");
			if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
					&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV"))) {
			claimPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimPropertyMotorEntity.getStringValueForField("ClaimPropertyTitle")+"')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimAttributeTitlePage);
		}
			else if((claimPropertyMotorEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
					&& (claimPropertyMotorEntity.getStringValueForField("Product").equalsIgnoreCase("TW"))) {
				claimPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimPropertyMotorEntity.getStringValueForField("ClaimPropertyTitle")+"')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(claimAttributeTWTitlePage);
			}
	}
	}

	public void backFromClaimAttributesDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity) {
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void saveClaimAttributesDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity) {
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(proceedButton);
			click(saveButton);
		}
	}
	public void verifySaveClaimAttributesDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity) {
		if (claimPropertyMotorEntity.getBooleanValueForField("ConfigVerifySaveButton")) {
			click(saveButton);
		}
	}
	public void fillAndSubmitClaimPropertyDetails(ClaimPropertyMotorEntity claimPropertyMotorEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillClaimPropertyDetails(claimPropertyMotorEntity, assertReference);
		proceedToNextPage(claimPropertyMotorEntity);
		fillClaimPropertyMotorCVDetails(claimPropertyMotorEntity, assertReference);
		proceedClaimAttMotorDetails(claimPropertyMotorEntity);
		fillClaimPropertyMotorDetails(claimPropertyMotorEntity, assertReference);
		proceedClaimAttributeMotorDetails(claimPropertyMotorEntity);
		fillClaimPropertyMotorNewDetails(claimPropertyMotorEntity, assertReference);
		fillClaimLettersMotorDetails(claimPropertyMotorEntity, assertReference);
		fillClaimInsuredLiabilityMotorDetails(claimPropertyMotorEntity, assertReference);
		saveClaimAttributesDetails( claimPropertyMotorEntity);
		verifySaveClaimAttributesDetails(claimPropertyMotorEntity);
		navigateToClaim(claimPropertyMotorEntity);
		navigateToMember(claimPropertyMotorEntity);
		navigateToDocument(claimPropertyMotorEntity);
		navigateToParties(claimPropertyMotorEntity);
		navigateToReserve(claimPropertyMotorEntity);
		navigateToPayment(claimPropertyMotorEntity);
		navigateToAttributes(claimPropertyMotorEntity);
	}
}	