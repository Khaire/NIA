package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberAttribViewEntity;
import com.aqm.staf.library.databin.PolicyPremiumScheduleEntity;

public class PolicyMemberPolicyInsuredInterestAttributeEditViewPage extends	BasePage {
	private PageElement memberAttributesTitlePage; 
	private PageElement policyTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement attributesTitle;
	private PageElement policyAttributesTitlePage;
	private PageElement memberTitle;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement coverageTitle;
	private PageElement policyCoverageListTitlePage; 
	private PageElement loanTitle;
	//private PageElement loanTitlePage;
	private PageElement clientDetailsTitle;
	private PageElement schemeDetailTitlePage;
	private PageElement relationsTitle;
	private PageElement policyRelationsTitlePage;
	private PageElement paymentsTitle;
	private PageElement policyPaymentListTitlePage;
	private PageElement followupTitle;
	private PageElement quotePolicyTitlePage;
	private PageElement documentTitle;
	private PageElement policyDocumentTitlePage;
	private PageElement memberDetailTitle;
	private PageElement policyMemberDetailTitlePage;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement insuredInterestCoverageTitlePage;
	private PageElement memberRelationsTitle;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentsTitle;
	private PageElement memberPaymentListTitlePage;
	private PageElement memberFundTitle;
	//private PageElement memberFundTitlePage;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;//For_Endorsement
	private PageElement policyNoLabel;//For_ActivePolicy
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement serialNoLabel;
	private PageElement reins_Pending_IndicatorLabel;
	private PageElement nameOfMemberLabel;
	private PageElement sexOfMemberLabel;
	private PageElement relationForCancerMediclaimLabel;
	private PageElement dobOfMemberLabel;
	private PageElement ageYearLabel;
	private PageElement occupationForCancerMediclaimLabel;
	private PageElement otherOccupationDetailLabel;
	private PageElement heightOfMemberLabel;
	private PageElement weightOfMemberLabel;
	private PageElement waistLineInInchesLabel;
	private PageElement doyouSmokeLabel;
	private PageElement doyouConsumeTobaccoLabel;
	private PageElement doYouDrinkAlcoholLabel;
	private PageElement sumInsuredForCancerExpensesLabel;
	private PageElement assigneeNameLabel;
	private PageElement physicianNameLabel;
	private PageElement cumulativeBonusLabel;
	private PageElement backButton;

	//For Family Floater Mediclaim Product Extra Fields

	/*private PageElement zoneForMemberLabel;
	private PageElement relationForFMMemberLabel;
	private PageElement occupationForMediclaimMemberLabel;
	private PageElement hypertensionLabel;
	private PageElement diabetesLabel;
	private PageElement preExistingDiseaseForMediclaimMemberLabel;
	private PageElement natureOfDiseaseLabel;
	private PageElement nameAndAddressOfMedicalAttendantSurgeonLabel;
	private PageElement dateFirstTreatedLabel;
	private PageElement firstTreatmentCompletedLabel;
	private PageElement whetherFullyCuredLabel;
	private PageElement doyouSmokeCigarettesCigarOrPipeLabel;
	private PageElement doYouChewTobaccoLabel;
	private PageElement sumInsuredForFamilyFloaterLabel;
	private PageElement dummyT1PLRLabel;
	private PageElement medicalReportLabel;
	private PageElement policyStatusLabel;
	private PageElement previousPolicyDetailsWithNIALabel;
	private PageElement dummy11Label;
	private PageElement startDateForMemberInPolicyLabel;*/


	public PolicyMemberPolicyInsuredInterestAttributeEditViewPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"Member Attributes Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Loan title page
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		schemeDetailTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPaymentListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title PAge", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyDocumentTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyMemberDetailTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Member Detail Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestCoverageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Member Relations Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Member Payment List Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Fund Title Page

		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")),"Quote No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Scheme")),"Scheme No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policy")),"Policy No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status"))," Status Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")),"Policy Holder Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")),"Product Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Code")),"Member Code Holder Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Serial")),"Serial No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reins_Pending_IndicatorLabel = new PageElement(By.xpath("//td[contains(text(),'Reins_Pending_Indicator')]/following::td"), "Reins_Pending_Indicator Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameOfMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Name of Member')]/following::td"), "Name of Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sexOfMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Sex of Member')]/following::td"), "Sex of Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationForCancerMediclaimLabel = new PageElement(By.xpath("//td[contains(text(),'Relation (Cancer Mediclaim)')]/following::td"), "Relation For Cancer Mediclaim Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dobOfMemberLabel = new PageElement(By.xpath("//td[contains(text(),'DOB of Member')]/following::td"), " DOB of Member  Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageYearLabel = new PageElement(By.xpath("//td[contains(text(),'Age (Year)')]/following::td"), "Age (Year) Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		occupationForCancerMediclaimLabel = new PageElement(By.xpath("//td[contains(text(),'Occupation(Cancer Mediclaim)')]/following::td"), " Occupation For Cancer Mediclaim Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherOccupationDetailLabel = new PageElement(By.xpath("//td[contains(text(),'Other Occupation Detail')]/following::td"), " Other Occupation Detail Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		heightOfMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Height of Member')]/following::td"), "Height of Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		weightOfMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Weight of Member')]/following::td"), "Weight of Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		waistLineInInchesLabel = new PageElement(By.xpath("//td[contains(text(),'Waist Line (in Inches)')]/following::td"), "Waist Line (in Inches) Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doyouSmokeLabel = new PageElement(By.xpath("//td[contains(text(),'Do you Smoke?')]/following::td"), "Do you smoke Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doyouConsumeTobaccoLabel = new PageElement(By.xpath("//td[contains(text(),'Do you Consume Tobacco')]/following::td"), "Do you Consume Tobacco Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouDrinkAlcoholLabel = new PageElement(By.xpath("//td[contains(text(),'Do you Drink Alcohol')]/following::td"), "Do you Drink Alcohol? Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForCancerExpensesLabel = new PageElement(By.xpath("//td[contains(text(),'Sum Insured(Cancer Expenses)')]/following::td"), "Sum Insured For Cancer Expenses Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assigneeNameLabel = new PageElement(By.xpath("//td[contains(text(),'Assignee name')]/following::td"), "Assignee Name Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		physicianNameLabel = new PageElement(By.xpath("//td[contains(text(),'Physician Name')]/following::td"), "Physician Name Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cumulativeBonusLabel = new PageElement(By.xpath("//td[contains(text(),'Cumulative Bonus')]/following::td"), "Cumulative Bonus Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//For Family Floater Mediclaim Product Extra Fields
		/*zoneForMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Zone For Member')]/following::td"), "Zone For Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				relationForFMMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Relation for FM Member')]/following::td"), "Relation for FM Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				occupationForMediclaimMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Occupation for Mediclaim Member')]/following::td"), " Occupation for Mediclaim Member  Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				hypertensionLabel = new PageElement(By.xpath("//td[contains(text(),'Hypertension')]/following::td"), "Hypertension Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				diabetesLabel = new PageElement(By.xpath("//td[contains(text(),'Diabetes')]/following::td"), "Diabetes Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				preExistingDiseaseForMediclaimMemberLabel = new PageElement(By.xpath("//td[contains(text(),'Pre-existing Disease for Mediclaim Member')]/following::td"), "Pre-existing Disease for Mediclaim Member Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				natureOfDiseaseLabel = new PageElement(By.xpath("//td[contains(text(),'Nature of disease')]/following::td"), "Nature of disease Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				nameAndAddressOfMedicalAttendantSurgeonLabel = new PageElement(By.xpath("//td[contains(text(),'Name and address of medical attendant/surgeon')]/following::td"), "Name and address of medical attendant/surgeon Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				dateFirstTreatedLabel = new PageElement(By.xpath("//td[contains(text(),'Date first treated')]/following::td"), "Date first treated Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				firstTreatmentCompletedLabel = new PageElement(By.xpath("//td[contains(text(),'First treatment completed')]/following::td"), "First treatment completed Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				whetherFullyCuredLabel = new PageElement(By.xpath("//td[contains(text(),'Whether Fully cured')]/following::td"), "Whether Fully cured Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				doyouSmokeCigarettesCigarOrPipeLabel = new PageElement(By.xpath("//td[contains(text(),'Do you smoke cigarettes, cigar or pipe?')]/following::td"), "Do you smoke cigarettes, cigar or pipe? Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				doYouChewTobaccoLabel = new PageElement(By.xpath("//td[contains(text(),'Do you chew tobacco?')]/following::td"), "Do you chew tobacco? Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				sumInsuredForFamilyFloaterLabel = new PageElement(By.xpath("//td[contains(text(),'Sum Insured For Family Floater')]/following::td"), "Sum Insured For Family Floater",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				dummyT1PLRLabel = new PageElement(By.xpath("//td[contains(text(),'dummy T1-PLR')]/following::td"), "dummy T1-PLR Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				medicalReportLabel = new PageElement(By.xpath("//td[contains(text(),'Medical Report')]/following::td"), "Medical Report Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				policyStatusLabel = new PageElement(By.xpath("//td[contains(text(),'Policy Status')]/following::td"), "Policy Status Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				previousPolicyDetailsWithNIALabel = new PageElement(By.xpath("//td[contains(text(),'Previous Policy Details with NIA')]/following::td"), "Previous Policy Details with NIA Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				dummy11Label = new PageElement(By.xpath("//td[contains(text(),'dummy11')]/following::td"), "dummy11 Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				startDateForMemberInPolicyLabel = new PageElement(By.xpath("//td[contains(text(),'Start date for member in policy')]/following::td"), "Start date for member in policy Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);*/
	}


	//Services
	public void fillPolicyMemberAttributeViewDetails(PolicyMemberAttribViewEntity policyMemberAttribViewEntity, CustomAssert assertReference){
		if(policyMemberAttribViewEntity.getAction().equalsIgnoreCase("verify")){
			PolicyMemberAttribViewEntity actualPolicyMemberAttribViewEntity=new PolicyMemberAttribViewEntity();

			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("PolicyNo"), actualPolicyMemberAttribViewEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("QuoteNo"), actualPolicyMemberAttribViewEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigSchemeNo")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("SchemeNo", fetchValueFromFields(schemeNoLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("SchemeNo"), actualPolicyMemberAttribViewEntity.getStringValueForField("SchemeNo"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("Status"), actualPolicyMemberAttribViewEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("Policyholder"), actualPolicyMemberAttribViewEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigProduct")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("Product"), actualPolicyMemberAttribViewEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberCode")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("MemberCode", fetchValueFromFields(memberCodeLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("MemberCode"), actualPolicyMemberAttribViewEntity.getStringValueForField("MemberCode"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigSerialNo")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("SerialNo", fetchValueFromFields(serialNoLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("SerialNo"), actualPolicyMemberAttribViewEntity.getStringValueForField("SerialNo"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigReinsPendingIndicator")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("ReinsPendingIndicator", fetchValueFromFields(reins_Pending_IndicatorLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("ReinsPendingIndicator"), actualPolicyMemberAttribViewEntity.getStringValueForField("ReinsPendingIndicator"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigNameOfMember")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("NameOfMember", fetchValueFromFields(nameOfMemberLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("NameOfMember"), actualPolicyMemberAttribViewEntity.getStringValueForField("NameOfMember"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigSexOfMember")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("SexOfMember", fetchValueFromFields(sexOfMemberLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("SexOfMember"), actualPolicyMemberAttribViewEntity.getStringValueForField("SexOfMember"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigRelationCancerMediclaim")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("RelationCancerMediclaim", fetchValueFromFields(relationForCancerMediclaimLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("RelationCancerMediclaim"), actualPolicyMemberAttribViewEntity.getStringValueForField("RelationCancerMediclaim"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigDOBOfMember")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("DOBOfMember", fetchValueFromFields(dobOfMemberLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("DOBOfMember"), actualPolicyMemberAttribViewEntity.getStringValueForField("DOBOfMember"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigAgeInYear")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("AgeInYear", fetchValueFromFields(ageYearLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("AgeInYear"), actualPolicyMemberAttribViewEntity.getStringValueForField("AgeInYear"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigOccupationForCancerMediclaim")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("OccupationForCancerMediclaim", fetchValueFromFields(occupationForCancerMediclaimLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("OccupationForCancerMediclaim"), actualPolicyMemberAttribViewEntity.getStringValueForField("OccupationForCancerMediclaim"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigOtherOccupationDetail")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("OtherOccupationDetail", fetchValueFromFields(otherOccupationDetailLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("OtherOccupationDetail"), actualPolicyMemberAttribViewEntity.getStringValueForField("OtherOccupationDetail"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigHeightOfMember")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("HeightOfMember", fetchValueFromFields(heightOfMemberLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("HeightOfMember"), actualPolicyMemberAttribViewEntity.getStringValueForField("HeightOfMember"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigWeightOfMember")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("WeightOfMember", fetchValueFromFields(weightOfMemberLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("WeightOfMember"), actualPolicyMemberAttribViewEntity.getStringValueForField("WeightOfMember"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigWaistLineInInches")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("WaistLineInInches", fetchValueFromFields(waistLineInInchesLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("WaistLineInInches"), actualPolicyMemberAttribViewEntity.getStringValueForField("WaistLineInInches"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigDoYouSmoke")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("DoYouSmoke", fetchValueFromFields(doyouSmokeLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("DoYouSmoke"), actualPolicyMemberAttribViewEntity.getStringValueForField("DoYouSmoke"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigDoYouConsumeTobacco")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("DoYouConsumeTobacco", fetchValueFromFields(doyouConsumeTobaccoLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("DoYouConsumeTobacco"), actualPolicyMemberAttribViewEntity.getStringValueForField("DoYouConsumeTobacco"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigDoYouDrinkAlcohol")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("DoYouDrinkAlcohol", fetchValueFromFields(doYouDrinkAlcoholLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("DoYouDrinkAlcohol"), actualPolicyMemberAttribViewEntity.getStringValueForField("DoYouDrinkAlcohol"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigSumInsuredCancerExpenses")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("SumInsuredCancerExpenses", fetchValueFromFields(sumInsuredForCancerExpensesLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("SumInsuredCancerExpenses"), actualPolicyMemberAttribViewEntity.getStringValueForField("SumInsuredCancerExpenses"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigAssigneeName")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("AssigneeName", fetchValueFromFields(assigneeNameLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("AssigneeName"), actualPolicyMemberAttribViewEntity.getStringValueForField("AssigneeName"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigPhysicianName")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("PhysicianName", fetchValueFromFields(physicianNameLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("PhysicianName"), actualPolicyMemberAttribViewEntity.getStringValueForField("PhysicianName"), AssertionType.WARNING);
			}
			if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				actualPolicyMemberAttribViewEntity.setStringValueForField("CumulativeBonus", fetchValueFromFields(cumulativeBonusLabel));
				assertReference.assertEquals(policyMemberAttribViewEntity.getStringValueForField("CumulativeBonus"), actualPolicyMemberAttribViewEntity.getStringValueForField("CumulativeBonus"), AssertionType.WARNING);
			}
		}
	}
	public void backFromPolicyMemberAttributeViewDetails(PolicyMemberAttribViewEntity policyMemberAttribViewEntity) {
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	//tabs//	
	public void navigateToPolicy(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigPolicyTab"))
			click(policyTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyQuoteDetailsTitlePage));
		return;
	}
	public void navigateToAttribute(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigAttributeTab"))
			click(attributesTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyAttributesTitlePage));
		return;
	}
	public void navigateToMember(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberTab"))
			click(memberTitle);
		switchToFrame("display");
		if(isElementDisplayed(memberAttributesTitlePage ));
		return;
	}
	public void navigateToCoverage(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigCoverageTab"))
			click(coverageTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyCoverageListTitlePage));
		return;
	}
	/*public void navigateToLoan(){
		click(loanTitle);
		switchToFrame("display");
		if(isElementDisplayed());
		return;
	}*/
	public void navigateToClientDetails(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigClientDetailsTab"))
			click(clientDetailsTitle);
		switchToFrame("display");
		if(isElementDisplayed(schemeDetailTitlePage));
		return;
	}
	public void navigateToRelations(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigRelationsTab"))
			click(relationsTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyRelationsTitlePage));
		return;
	}
	public void navigateToPayments(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigPaymentsTab"))
			click(paymentsTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyPaymentListTitlePage));
		return;
	}
	public void navigateToFollowup(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigFollowupTab"))
			click(followupTitle);
		switchToFrame("display");
		if(isElementDisplayed(quotePolicyTitlePage));
		return;
	}
	public void navigateToDocument(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigDocumentTab"))
			click(documentTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyDocumentTitlePage));
		return;
	}
	public void navigateToMemberDetail(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberDetailTab"))
			click(memberDetailTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyMemberDetailTitlePage));
		return;
	}
	public void navigateToMemberAttributes(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberAttributesTab"))
			click(memberAttributesTitle);
		switchToFrame("display");
		if(isElementDisplayed(memberAttributesTitlePage));
		return;
	}
	public void navigateToMemberAttachCoverages(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberAttachCoveragesTab"))
			click(memberAttachCoveragesTitle);
		switchToFrame("display");
		if(isElementDisplayed(insuredInterestCoverageTitlePage));
		return;
	}
	public void navigateToMemberRelations(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberRelationsTab"))
			click(memberRelationsTitle);
		switchToFrame("display");
		if(isElementDisplayed(memberRelationsTitlePage));
		return;
	}
	public void navigateToMemberPayments(PolicyMemberAttribViewEntity policyMemberAttribViewEntity){
		if (policyMemberAttribViewEntity.getBooleanValueForField("ConfigMemberPaymentsTab"))
			click(memberPaymentsTitle);
		switchToFrame("display");
		if(isElementDisplayed(memberPaymentListTitlePage));
		return;
	}
	/*public void navigateToFund(){
		click(memberFundTitle);
		switchToFrame("display");
		if(isElementDisplayed());
		return;
	}*/
	//tabs//	
	public void fillAndSubmitFromPolicyMemberAttributeEditViewDetails(PolicyMemberAttribViewEntity policyMemberAttribViewEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyMemberAttributeViewDetails(policyMemberAttribViewEntity,assertReference);
		//backFromPolicyMemberAttributeViewDetails(policyMemberAttribViewEntity);
		navigateToPolicy(policyMemberAttribViewEntity);
		navigateToAttribute(policyMemberAttribViewEntity);
		navigateToMember(policyMemberAttribViewEntity);
		navigateToCoverage(policyMemberAttribViewEntity);
		navigateToClientDetails(policyMemberAttribViewEntity);
		navigateToRelations(policyMemberAttribViewEntity);
		navigateToPayments(policyMemberAttribViewEntity);
		navigateToFollowup(policyMemberAttribViewEntity);
		navigateToDocument(policyMemberAttribViewEntity);
		navigateToMemberDetail(policyMemberAttribViewEntity);
		navigateToMemberAttributes(policyMemberAttribViewEntity);
		navigateToMemberAttachCoverages(policyMemberAttribViewEntity);
		navigateToMemberRelations(policyMemberAttribViewEntity);
		navigateToMemberPayments(policyMemberAttribViewEntity);
	}
}




