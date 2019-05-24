package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProT3CLRAviEntity;


public class ClaimRiskPropertyT3CLRAviation extends BasePage {
	//NAVIGATION
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
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement nextPageTitle;


	/* AW--3RD Page-Rajkumar8*/
	private PageElement surveyorsRecommendationsObservationsAsToLiabilityTextArea;
	private PageElement departmentOfficeObservationsTextArea;
	private PageElement incaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindingsTextArea;
	private PageElement totalAssessmentAmountRecommendedByOfficeDeptTextField;
	private PageElement paymentNowRecommendedTextField;
	private PageElement amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredTextField;
	private PageElement reasonForRetentionOfClaimAmountTextArea;
	private PageElement auditRecoveriesPendingIfAnyTextArea;
	private PageElement outstandingClaimsProvisionsAsOn31stMarchTextArea;
	private PageElement occurrenceDescriptionTextArea;
	private PageElement modeOfRepairsReplacementsTextArea;
	private PageElement departmentsObservationsAndRecommendationsTextArea; 
	private PageElement saveButton;

	public ClaimRiskPropertyT3CLRAviation(WebDriver driver, String pageName){
		super(driver, pageName);
		{
			//Navigation

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
			nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
			backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
           //nAVIAGTION
			surveyorsRecommendationsObservationsAsToLiabilityTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Surveyors recommendations / observations as to liability')]/following::textarea"), "Surveyors Recommendations Observations As To Liability TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			departmentOfficeObservationsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Department / office observations / recommendations')]/following::textarea"), "Department Off ice Observations TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			incaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindingsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'In case of investigator please state the reasons and the nature of findings as to liability/amount of loss')]/following::textarea"), "Incase Of Investigat or Please State The Reasons And The Nature Of Findings TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			totalAssessmentAmountRecommendedByOfficeDeptTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Assessment Amount recommended by Office/Dept')]/following::input"), "Total Assessment Amount Recommended By Office Dept Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			paymentNowRecommendedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Payment now recommended')]/following::input"), "Payment Now Recommended Text", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount if any to be retained pending clarifications from the insured / surveyors')]/following::input"), "Amount If Any To Be Retained Pending Clarifications From The Insured Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			reasonForRetentionOfClaimAmountTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Reason for retention of claim amount')]/following::textarea"), "Reason For Retention Of Claim Amount TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			auditRecoveriesPendingIfAnyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Audit recoveries pending if any, for the insured')]/following::input"), "Audit Recoveries Pending If Any TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			outstandingClaimsProvisionsAsOn31stMarchTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Outstanding claims provisions as on 31 st march----')]/following::input"), "Outstanding Claims Provisions As On 31st March Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			occurrenceDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Occurrence description ')]/following::textarea"), "Occurrence Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			modeOfRepairsReplacementsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mode of repairs/ replacements ')]/following::textarea"), "Mode Of Repairs Replacements Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			departmentsObservationsAndRecommendationsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Departments observations and recommendations')]/following::textarea"), "Departments Observations And Recommendations Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			saveButton=new PageElement(By.name("btnSave"), "Save", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
	}
	public void fillPolicyAttributeSFStatusOfIntermediariesFire(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskProT3CLRAviEntity.getAction().equalsIgnoreCase("add") || claimRiskProT3CLRAviEntity.getAction().equalsIgnoreCase("edit")){
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigSurveyorsRecommendationsObservationsAsToLiability")) {
				clearAndSendKeys(surveyorsRecommendationsObservationsAsToLiabilityTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("SurveyorsRecommendationsObservationsAsToLiability"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigDepartmentOfficeObservations")) {
				clearAndSendKeys(departmentOfficeObservationsTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("DepartmentOfficeObservations"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigIncaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindings")) {
				clearAndSendKeys(incaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindingsTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("IncaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindings"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigTotalAssessmentAmountRecommendedByOfficeDept")) {
				clearAndSendKeys(totalAssessmentAmountRecommendedByOfficeDeptTextField, claimRiskProT3CLRAviEntity.getStringValueForField("TotalAssessmentAmountRecommendedByOfficeDept"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigPaymentNowRecommended")) {
				clearAndSendKeys(paymentNowRecommendedTextField, claimRiskProT3CLRAviEntity.getStringValueForField("PaymentNowRecommended"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigAmountIfAnyToBeRetainedPendingClarificationsFromTheInsured")) {
				clearAndSendKeys(amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredTextField, claimRiskProT3CLRAviEntity.getStringValueForField("AmountIfAnyToBeRetainedPendingClarificationsFromTheInsured"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigReasonForRetentionOfClaimAmount")) {
				clearAndSendKeys(reasonForRetentionOfClaimAmountTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("ReasonForRetentionOfClaimAmount"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigAuditRecoveriesPendingIfAny")) {
				clearAndSendKeys(auditRecoveriesPendingIfAnyTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("AuditRecoveriesPendingIfAny"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigOutstandingClaimsProvisionsAsOn31stMarch")) {
				clearAndSendKeys(outstandingClaimsProvisionsAsOn31stMarchTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("OutstandingClaimsProvisionsAsOn31stMarch"));
			}			
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigOccurrenceDescription")) {
				clearAndSendKeys(occurrenceDescriptionTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("OccurrenceDescription"));
			}
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigModeOfRepairsReplacements")) {
				clearAndSendKeys(modeOfRepairsReplacementsTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("ModeOfRepairsReplacements"));
			}	
			if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigDepartmentsObservationsAndRecommendations")) {
				clearAndSendKeys(departmentsObservationsAndRecommendationsTextArea, claimRiskProT3CLRAviEntity.getStringValueForField("DepartmentsObservationsAndRecommendations"));
			}
		}
			else if(claimRiskProT3CLRAviEntity.getAction().equalsIgnoreCase("verify")){
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigSurveyorsRecommendationsObservationsAsToLiability")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("SurveyorsRecommendationsObservationsAsToLiability"), fetchValueFromTextFields(surveyorsRecommendationsObservationsAsToLiabilityTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigDepartmentOfficeObservations")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("DepartmentOfficeObservations"), fetchValueFromTextFields(departmentOfficeObservationsTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigIncaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindings")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("IncaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindings"), fetchValueFromTextFields(incaseOfInvestigatorPleaseStateTheReasonsAndTheNatureOfFindingsTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigTotalAssessmentAmountRecommendedByOfficeDept")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("TotalAssessmentAmountRecommendedByOfficeDept"), fetchValueFromTextFields(totalAssessmentAmountRecommendedByOfficeDeptTextField), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigPaymentNowRecommended")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("PaymentNowRecommended"), fetchValueFromTextFields(paymentNowRecommendedTextField), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigAmountIfAnyToBeRetainedPendingClarificationsFromTheInsured")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("AmountIfAnyToBeRetainedPendingClarificationsFromTheInsured"), fetchValueFromTextFields(amountIfAnyToBeRetainedPendingClarificationsFromTheInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigReasonForRetentionOfClaimAmount")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("ReasonForRetentionOfClaimAmount"), fetchValueFromTextFields(reasonForRetentionOfClaimAmountTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigAuditRecoveriesPendingIfAny")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("AuditRecoveriesPendingIfAny"), fetchValueFromTextFields(auditRecoveriesPendingIfAnyTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigOutstandingClaimsProvisionsAsOn31stMarch")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("OutstandingClaimsProvisionsAsOn31stMarch"), fetchValueFromTextFields(outstandingClaimsProvisionsAsOn31stMarchTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigOccurrenceDescription")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("OccurrenceDescription"), fetchValueFromTextFields(occurrenceDescriptionTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigModeOfRepairsReplacements")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("ModeOfRepairsReplacements"), fetchValueFromTextFields(modeOfRepairsReplacementsTextArea), AssertionType.WARNING);
				}
				if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigDepartmentsObservationsAndRecommendations")) {
					assertReference.assertEquals(claimRiskProT3CLRAviEntity.getStringValueForField("DepartmentsObservationsAndRecommendations"), fetchValueFromTextFields(departmentsObservationsAndRecommendationsTextArea), AssertionType.WARNING);
				}

			}

		
	}

	public void proceedToT2CLRForHealthProducts(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			
			
		}
	}
	public void saveButton(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			
			
			
		}
	}
	public void navigateToMainAttributePage(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToMemberDetails(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigMemberDetailsTab")){		
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailsTabTitle);
		}
	}
	public void navigateToMemberAttribute(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity){
		if (claimRiskProT3CLRAviEntity.getBooleanValueForField("ConfigMemberAttributeTab")){		
			click(memberAttributeTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimMemberT3CLRAttibutes(ClaimRiskProT3CLRAviEntity claimRiskProT3CLRAviEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProT3CLRAviEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeSFStatusOfIntermediariesFire(claimRiskProT3CLRAviEntity, assertReference);
			proceedToT2CLRForHealthProducts(claimRiskProT3CLRAviEntity);
			saveButton(claimRiskProT3CLRAviEntity);
			navigateToMainAttributePage(claimRiskProT3CLRAviEntity);
			navigateToclaimHomePage(claimRiskProT3CLRAviEntity);
			navigateToMember(claimRiskProT3CLRAviEntity);
			navigateToDocument(claimRiskProT3CLRAviEntity);
			navigateToParties(claimRiskProT3CLRAviEntity);
			navigateToReserve(claimRiskProT3CLRAviEntity);
			navigateToPayment(claimRiskProT3CLRAviEntity);
			navigateToAttribute(claimRiskProT3CLRAviEntity);
			navigateToMemberDetails(claimRiskProT3CLRAviEntity);
			navigateToMemberAttribute(claimRiskProT3CLRAviEntity);
		}
	
	}	

}
