package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimAttrOtherDetailsEntity;

public class ClaimAttributeOtherDetailsOfClaimEngineering extends BasePage {

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
	private PageElement surveyorsRecommendationsObservationsAsToLiabilityTextarea;
	private PageElement departmentOfficeObservationsRecommendationsTextarea;
	private PageElement assessmentOfDamageIndigenousAmountRecommendedByOfficeDeptTextfield;
	private PageElement assessmentOfDamageImportAmountRecommendedByOfficeDeptTextfield;
	private PageElement assessmentOfDamageCivilAmountRecommendedByOfficeDeptTextfield;
	private PageElement assessmentOfDamageAddOnAmountRecommendedByOfficeDeptTextfield;
	private PageElement salvageAmountTextfield;
	private PageElement underinsuranceEngIfAnyTextfield;
	private PageElement excessDurationPolicyTextfield;
	private PageElement specificExcessIfAnyTextfield;
	private PageElement totalAssessmentAmountRecommendedByOfficeDeptTextfield;
	private PageElement onAccountPaidIfAnyTextfield;
	private PageElement paymentNowRecommendedTextfield;
	private PageElement amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredSurveyorsTextfield;
	private PageElement reasonForRetentionOfClaimAmountTextarea;
	private PageElement outstandingClaimsProvisionsAsOn31StMarchTextfield;
	private PageElement occurrenceDescriptionTextarea;
	private PageElement modeOfRepairsReplacementsTextarea;
	private PageElement departmentsObservationsAndRecommendationsTextarea;
	private PageElement t1CLMBPTextField;

	private PageElement nextButton;
	private PageElement saveButton;

	private PageElement isReinstatementRequiredDropdown;
	private PageElement reinstatementPremiumTextField;

	private PageElement claimOtherDetailsTitle;
	private PageElement claimOtherPropertyTwoTitle;
	private PageElement totalSITextField;


	public ClaimAttributeOtherDetailsOfClaimEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);

		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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

		surveyorsRecommendationsObservationsAsToLiabilityTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Surveyors recommendations / observations as to liability')]/following::textarea"),"Surveyors recommendations / observations as to liability Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		departmentOfficeObservationsRecommendationsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Department / office observations / recommendations')]/following::textarea"),"Department / office observations / recommendations Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessmentOfDamageIndigenousAmountRecommendedByOfficeDeptTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Assessment of Damage (Indigenous) Amount recommended by Office/Dept')]/following::input"),"Assessment of Damage (Indigenous) Amount recommended by Office/Dept TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessmentOfDamageImportAmountRecommendedByOfficeDeptTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Assessment of Damage (Import) Amount recommended by Office/Dept')]/following::input"),"Assessment of Damage (Import) Amount recommended by Office/Dept TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessmentOfDamageCivilAmountRecommendedByOfficeDeptTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Assessment of Damage (Civil) Amount recommended by Office/Dept')]/following::input"),"Assessment of Damage (Civil) Amount recommended by Office/Dept TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessmentOfDamageAddOnAmountRecommendedByOfficeDeptTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Assessment of Damage (Add - on) Amount recommended by Office/Dept')]/following::input"),"Assessment of Damage (Add - on) Amount recommended by Office/Dept TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		salvageAmountTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Salvage Amount')]/following::input"),"Salvage Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underinsuranceEngIfAnyTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Underinsurance (Eng) , if any')]/following::input"),"Underinsurance (Eng) , if any TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessDurationPolicyTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Excess Duration (Policy)')]/following::input"),"Excess Duration (Policy) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specificExcessIfAnyTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Specific Excess (if any)')]/following::input"),"Specific Excess (if any) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAssessmentAmountRecommendedByOfficeDeptTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Total Assessment Amount recommended by Office/Dept')]/following::input"),"Total Assessment Amount recommended by Office/Dept TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		onAccountPaidIfAnyTextfield=new PageElement(By.xpath("//td/div[contains(text(),'On Account paid if any')]/following::input"),"On Account paid if any TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentNowRecommendedTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Payment now recommended')]/following::input"),"Payment now recommended TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredSurveyorsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Amount if any to be retained pending clarifications from the insured / surveyors')]/following::input"),"Amount if any to be retained pending clarifications from the insured / surveyors TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForRetentionOfClaimAmountTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Reason for retention of claim amount')]/following::textarea"),"Reason for retention of claim amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		outstandingClaimsProvisionsAsOn31StMarchTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Outstanding claims provisions as on 31 st march----')]/following::input"),"Outstanding claims provisions as on 31 st march---- TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occurrenceDescriptionTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Occurrence description')]/following::textarea"),"Occurrence description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfRepairsReplacementsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Mode of repairs/ replacements')]/following::textarea"),"Mode of repairs/ replacements TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		departmentsObservationsAndRecommendationsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Departments observations and recommendations')]/following::textarea"),"Departments observations and recommendations TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		t1CLMBPTextField=new PageElement(By.xpath("//td/div[contains(text(),'T1_CLM_BP')]/following::input"),"T1_CLM_BP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		nextButton= new PageElement(By.name("Next1"),"Proceed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		isReinstatementRequiredDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Is Reinstatement Required?')]/following::select"),"Is Reinstatement Required? Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinstatementPremiumTextField=new PageElement(By.xpath("//td/div[contains(text(),'Reinstatement premium')]/following::input"),"Reinstatement premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSITextField=new PageElement(By.xpath("//td/div[contains(text(),'Total SI')]/following::input"),"Total SI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillClaimAttributeOtherDetailsOfClaim(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity, CustomAssert assertReference){
		if(claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("add") || claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSurveyorsRecommsObserAsToLiability")) {
				clearAndSendKeys(surveyorsRecommendationsObservationsAsToLiabilityTextarea, claimAttrOtherDetailsEntity.getStringValueForField("SurveyorsRecommsObserAsToLiability"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigDepartmentOfficeObserRecomme")) {
				clearAndSendKeys(departmentOfficeObservationsRecommendationsTextarea, claimAttrOtherDetailsEntity.getStringValueForField("DepartmentOfficeObserRecomme"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageIndigenousAmtRecomByOfficeDept")) {
				clearAndSendKeys(assessmentOfDamageIndigenousAmountRecommendedByOfficeDeptTextfield, claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageIndigenousAmtRecomByOfficeDept"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageImportAmtRecommByOfficeDept")) {
				clearAndSendKeys(assessmentOfDamageImportAmountRecommendedByOfficeDeptTextfield, claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageImportAmtRecommByOfficeDept"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageCivilAmtRecomByOfficeDept")) {
				clearAndSendKeys(assessmentOfDamageCivilAmountRecommendedByOfficeDeptTextfield, claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageCivilAmtRecomByOfficeDept"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAsseOfDamageAddOnAmtRecomByOfficeDept")) {
				clearAndSendKeys(assessmentOfDamageAddOnAmountRecommendedByOfficeDeptTextfield, claimAttrOtherDetailsEntity.getStringValueForField("AsseOfDamageAddOnAmtRecomByOfficeDept"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				clearAndSendKeys(salvageAmountTextfield, claimAttrOtherDetailsEntity.getStringValueForField("SalvageAmount"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigUnderinsuranceEngIfAny")) {
				clearAndSendKeys(underinsuranceEngIfAnyTextfield, claimAttrOtherDetailsEntity.getStringValueForField("UnderinsuranceEngIfAny"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigExcessDurationPolicy")) {
				clearAndSendKeys(excessDurationPolicyTextfield, claimAttrOtherDetailsEntity.getStringValueForField("ExcessDurationPolicy"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSpecificExcessIfAny")) {
				clearAndSendKeys(specificExcessIfAnyTextfield, claimAttrOtherDetailsEntity.getStringValueForField("SpecificExcessIfAny"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigOnAccountPaidIfAny")) {
				clearAndSendKeys(onAccountPaidIfAnyTextfield, claimAttrOtherDetailsEntity.getStringValueForField("OnAccountPaidIfAny"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigPaymentNowRecommended")) {
				clearAndSendKeys(paymentNowRecommendedTextfield, claimAttrOtherDetailsEntity.getStringValueForField("PaymentNowRecommended"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAmtIfAnyToBeRetaiPendClarifTheInsSurveyors")) {
				clearAndSendKeys(amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredSurveyorsTextfield, claimAttrOtherDetailsEntity.getStringValueForField("AmtIfAnyToBeRetaiPendClarifTheInsSurveyors"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigReasonForRetentionOfClaimAmount")) {
				clearAndSendKeys(reasonForRetentionOfClaimAmountTextarea, claimAttrOtherDetailsEntity.getStringValueForField("ReasonForRetentionOfClaimAmount"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigOccurrenceDescription")) {
				clearAndSendKeys(occurrenceDescriptionTextarea, claimAttrOtherDetailsEntity.getStringValueForField("OccurrenceDescription"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigModeOfRepairsReplacements")) {
				clearAndSendKeys(modeOfRepairsReplacementsTextarea, claimAttrOtherDetailsEntity.getStringValueForField("ModeOfRepairsReplacements"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigDepartmentsObserAndRecommen")) {
				clearAndSendKeys(departmentsObservationsAndRecommendationsTextarea, claimAttrOtherDetailsEntity.getStringValueForField("DepartmentsObserAndRecommen"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigTotalSI")) {
				clearAndSendKeys(totalSITextField, claimAttrOtherDetailsEntity.getStringValueForField("TotalSI"));
			}
		}
		else if(claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ClaimNumber"), fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ClaimDate"), fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ClaimStatus"), fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ProductCode"), fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("CauseOfLoss"), fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSurveyorsRecommsObserAsToLiability")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("SurveyorsRecommsObserAsToLiability"), fetchValueFromTextFields(surveyorsRecommendationsObservationsAsToLiabilityTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigDepartmentOfficeObserRecomme")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("DepartmentOfficeObserRecomme"), fetchValueFromTextFields(departmentOfficeObservationsRecommendationsTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageIndigenousAmtRecomByOfficeDept")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageIndigenousAmtRecomByOfficeDept"), fetchValueFromTextFields(assessmentOfDamageIndigenousAmountRecommendedByOfficeDeptTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageImportAmtRecommByOfficeDept")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageImportAmtRecommByOfficeDept"), fetchValueFromTextFields(assessmentOfDamageImportAmountRecommendedByOfficeDeptTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAssesOfDamageCivilAmtRecomByOfficeDept")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("AssesOfDamageCivilAmtRecomByOfficeDept"), fetchValueFromTextFields(assessmentOfDamageCivilAmountRecommendedByOfficeDeptTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAsseOfDamageAddOnAmtRecomByOfficeDept")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("AsseOfDamageAddOnAmtRecomByOfficeDept"), fetchValueFromTextFields(assessmentOfDamageAddOnAmountRecommendedByOfficeDeptTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("SalvageAmount"), fetchValueFromTextFields(salvageAmountTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigUnderinsuranceEngIfAny")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("UnderinsuranceEngIfAny"), fetchValueFromTextFields(underinsuranceEngIfAnyTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigExcessDurationPolicy")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ExcessDurationPolicy"), fetchValueFromTextFields(excessDurationPolicyTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSpecificExcessIfAny")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("SpecificExcessIfAny"), fetchValueFromTextFields(specificExcessIfAnyTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigTotalAssementAmtRecomByOfficeDept")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("TotalAssementAmtRecomByOfficeDept"), fetchValueFromTextFields(totalAssessmentAmountRecommendedByOfficeDeptTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigOnAccountPaidIfAny")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("OnAccountPaidIfAny"), fetchValueFromTextFields(onAccountPaidIfAnyTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigPaymentNowRecommended")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("PaymentNowRecommended"), fetchValueFromTextFields(paymentNowRecommendedTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAmtIfAnyToBeRetaiPendClarifTheInsSurveyors")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("AmtIfAnyToBeRetaiPendClarifTheInsSurveyors"), fetchValueFromTextFields(amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredSurveyorsTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigReasonForRetentionOfClaimAmount")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ReasonForRetentionOfClaimAmount"), fetchValueFromTextFields(reasonForRetentionOfClaimAmountTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigOutstandingClaimsProvisionsAsOn31StMarch")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("OutstandingClaimsProvisionsAsOn31StMarch"), fetchValueFromTextFields(outstandingClaimsProvisionsAsOn31StMarchTextfield), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigOccurrenceDescription")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("OccurrenceDescription"), fetchValueFromTextFields(occurrenceDescriptionTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigModeOfRepairsReplacements")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ModeOfRepairsReplacements"), fetchValueFromTextFields(modeOfRepairsReplacementsTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigDepartmentsObserAndRecommen")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("DepartmentsObserAndRecommen"), fetchValueFromTextFields(departmentsObservationsAndRecommendationsTextarea), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigTOneCLMBP")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("TOneCLMBP"), fetchValueFromTextFields(t1CLMBPTextField), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigTotalSI")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("TotalSI"), fetchValueFromTextFields(totalSITextField), AssertionType.WARNING);
			}
		}
	}

	//Claim Property Two Page
	public void fillClaimAttributeClaimPropertyTwoPageDetails(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity, CustomAssert assertReference){
		if(claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("add") || claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
				selectValueFromList(isReinstatementRequiredDropdown, claimAttrOtherDetailsEntity.getStringValueForField("IsReinstatementRequired"));
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
				clearAndSendKeys(reinstatementPremiumTextField, claimAttrOtherDetailsEntity.getStringValueForField("ReinstatementPremium"));
			}
			click(nextButton);
			switchToFrame("display");
			claimOtherPropertyTwoTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimAttrOtherDetailsEntity.getStringValueForField("ClaimOtherPropertyTwoTitle")+"')]"), "Claim Other Property Two Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimOtherPropertyTwoTitle);
		}
		else if(claimAttrOtherDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("IsReinstatementRequired"), fetchValueFromList(isReinstatementRequiredDropdown), AssertionType.WARNING);
			}
			if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
				assertReference.assertEquals(claimAttrOtherDetailsEntity.getStringValueForField("ReinstatementPremium"), fetchValueFromTextFields(reinstatementPremiumTextField), AssertionType.WARNING);
			}
		  /*	if(claimAttrOtherDetailsEntity.getStringValueForField("Product").equalsIgnoreCase("EF")){
				click(nextButton);
				switchToFrame("display");
				claimOtherPropertyTwoTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimAttrOtherDetailsEntity.getStringValueForField("ClaimOtherPropertyTwoTitle")+"')]"), "Claim Other Property Two Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(claimOtherPropertyTwoTitle);
			}*/
		}
	}


	public void navigateToClaim(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}	
	}
	public void proceedToNextPage(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigProceedButton")){
			click(nextButton);
			switchToFrame("display");
			claimOtherDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimAttrOtherDetailsEntity.getStringValueForField("ClaimOtherDetailsTitle")+"')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimOtherDetailsTitle);
		}
	}
	
	public void clickOnSaveButton(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity){
		if (claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
		}
	}

	public void fillAndSubmitClaimAttributeOtherDetails(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimAttributeOtherDetailsOfClaim(claimAttrOtherDetailsEntity, assertReference);
		proceedToNextPage(claimAttrOtherDetailsEntity);
		if(claimAttrOtherDetailsEntity.getBooleanValueForField("ConfigClaimPropertyTwo")){
			fillClaimAttributeClaimPropertyTwoPageDetails(claimAttrOtherDetailsEntity, assertReference);
		}
		clickOnSaveButton(claimAttrOtherDetailsEntity);
		navigateToClaim(claimAttrOtherDetailsEntity);
		navigateToMember(claimAttrOtherDetailsEntity);
		navigateToDocument(claimAttrOtherDetailsEntity);
		navigateToParties(claimAttrOtherDetailsEntity);
		navigateToReserve(claimAttrOtherDetailsEntity);
		navigateToPayment(claimAttrOtherDetailsEntity);
		navigateToAttributes(claimAttrOtherDetailsEntity);
	}
}
