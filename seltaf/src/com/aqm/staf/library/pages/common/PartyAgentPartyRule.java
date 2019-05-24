package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyAgentPartyRuleEntity;
import com.aqm.staf.library.databin.PartyRolBrokerCommiEntity;

public class PartyAgentPartyRule extends BasePage{
	
	
	private PageElement	passportSizePhotographSubmittedDropDown;	
	private PageElement	ageProofSubmittedDropDown;	
	private PageElement	pANCardcopySubmittedDropDown;	
	private PageElement	rersidentialAddressProofSubmittedDropDown;	
	private PageElement	qualificationProofBasicSubmittedDropDown;	
	private PageElement	professionalQualificationProofSubmittedDropDown;	
	private PageElement examinationPassCertificateAgentExamSubmittedDropDown;	
	private PageElement cessationCertificateFromOtherCompanySubmittedDropDown;	
	private PageElement undertakingDocumentSubmittedDropDown;	
	private PageElement	trainingExperienceCertificateSubmittedDropDown;	
	private PageElement	originalIRDAILicenseIDCardSubmittedDropDown;
	private PageElement sexDropDown;
	private PageElement panNoTextField;
	private PageElement brnachNameTextField;
	private PageElement brnachTypeDropDown;
	private PageElement muffosilAgentDropDown;
	private PageElement examinationBodyNameDropDown;
	private PageElement agentPartyRuleTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partytreeTitle;
	private PageElement fatherHusbandNameTextField;
	private PageElement nextButton;
	private PageElement saveButton;
	
	public PartyAgentPartyRule(WebDriver driver, String pageName) {
		super(driver, pageName);
		fatherHusbandNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Father / Husband Name')]/following::input"),"Father / Husband Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//agentPartyRuleTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Agent Party Rule ')]"),"Agent Party Rule ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		agentPartyRuleTitle= new PageElement(By.xpath("//b[contains(text(),'Prospective')]"),"Agent Party Rule ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		passportSizePhotographSubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Passport size photograph Submitted')]/following::select"),"Passport Size Photograph Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		ageProofSubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Age  proof Submitted')]/following::select"),"Age Proof Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		pANCardcopySubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'PAN Card copy Submitted')]/following::select"),"PAN Card copy Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rersidentialAddressProofSubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Residential Address proof Submitted')]/following::select"),"Residential Address proof Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		qualificationProofBasicSubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Qualification proof(Basic) Submitted')]/following::select"),"Qualification proof(Basic) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		professionalQualificationProofSubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Professional Qualification Proof Submitted')]/following::select"),"Professional Qualification Proof Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		examinationPassCertificateAgentExamSubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Examination pass certificate(Agent Exam) Submitted')]/following::select"),"Examination pass certificate(Agent Exam) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cessationCertificateFromOtherCompanySubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Cessation certificate (From other Company) Submitted')]/following::select"),"Cessation certificate (From other Company) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		undertakingDocumentSubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Undertaking document Submitted')]/following::select"),"Undertaking document Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		trainingExperienceCertificateSubmittedDropDown =new PageElement(By.xpath("//td//div[contains(text(),'Training/Experience Certificate Submitted')]/following::select"),"Training/Experience Certificate Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		originalIRDAILicenseIDCardSubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Original IRDAI License  &  ID Card Submitted')]/following::select"),"Original IRDAI License & ID Card Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		 sexDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Sex')]/following::select"),"Sex", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 panNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pan Number')]/following::input"),"Pan Number", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 brnachNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Branch Name')]/following::input"),"Branch Name", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	     brnachTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Branch Type')]/following::select"),"Branch Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 muffosilAgentDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Muffosil Agent')]/following::select"),"Muffosil Agent", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 examinationBodyNameDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Examination body Name')]/following::select"),"Examination body Name", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		

		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partytreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				
		nextButton=new PageElement(By.name("Next"),"NextArrowButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("save"),"SaveButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		
	}
	
	
	public void fillPartyAgentPartyRule(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity, CustomAssert assertReference)throws InterruptedException{
		if(partyAgentPartyRuleEntity.getAction().equalsIgnoreCase("add") || partyAgentPartyRuleEntity.getAction().equalsIgnoreCase("edit")){
			//------------------------
		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPassportSizePhotographSubmitted")) {
				selectValueFromList(passportSizePhotographSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("PassportSizePhotographSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigAgeProofSubmitted")) {
				selectValueFromList(ageProofSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("AgeProofSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPANCardcopySubmitted")) {
				selectValueFromList(pANCardcopySubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("PANCardcopySubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigRersidentialAddressProofSubmitted")) {
				selectValueFromList(rersidentialAddressProofSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("RersidentialAddressProofSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigQualificationProofBasicSubmitted")) {
				selectValueFromList(qualificationProofBasicSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("QualificationProofBasicSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigProfessionalQualificationProofSubmitted")) {
				selectValueFromList(professionalQualificationProofSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("ProfessionalQualificationProofSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigExaminationPassCertificateAgentExamSubmitted")) {
				selectValueFromList(examinationPassCertificateAgentExamSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("ExaminationPassCertificateAgentExamSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigCessationCertificateFromOtherCompanySubmitted")) {
				selectValueFromList(cessationCertificateFromOtherCompanySubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("CessationCertificateFromOtherCompanySubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigUndertakingDocumentSubmitted")) {
				selectValueFromList(undertakingDocumentSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("UndertakingDocumentSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigTrainingExperienceCertificateSubmitted")) {
				selectValueFromList(trainingExperienceCertificateSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("TrainingExperienceCertificateSubmitted"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigOriginalIRDAILicenseIDCardSubmitted")) {
				selectValueFromList(originalIRDAILicenseIDCardSubmittedDropDown, partyAgentPartyRuleEntity.getStringValueForField("OriginalIRDAILicenseIDCardSubmitted"));
			}

			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, partyAgentPartyRuleEntity.getStringValueForField("Sex"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPanNo")) {
				selectValueFromList(panNoTextField, partyAgentPartyRuleEntity.getStringValueForField("PanNo"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigBrnachName")) {
				selectValueFromList(brnachNameTextField, partyAgentPartyRuleEntity.getStringValueForField("BrnachName"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigBrnachType")) {
				selectValueFromList(brnachTypeDropDown, partyAgentPartyRuleEntity.getStringValueForField("BrnachType"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigMuffosilAgent")) {
				selectValueFromList(muffosilAgentDropDown, partyAgentPartyRuleEntity.getStringValueForField("MuffosilAgent"));
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigExaminationBodyName")) {
				selectValueFromList(examinationBodyNameDropDown, partyAgentPartyRuleEntity.getStringValueForField("ExaminationBodyName"));
			}
			
		}
		
		else if(partyAgentPartyRuleEntity.getAction().equalsIgnoreCase("verify")){

				
				
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPassportSizePhotographSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("PassportSizePhotographSubmitted"), fetchValueFromTextFields(passportSizePhotographSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigAgeProofSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("AgeProofSubmitted"), fetchValueFromList(ageProofSubmittedDropDown), AssertionType.WARNING);
			}		
				
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPANCardcopySubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("PANCardcopySubmitted"), fetchValueFromList(pANCardcopySubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigRersidentialAddressProofSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("RersidentialAddressProofSubmitted"), fetchValueFromList(rersidentialAddressProofSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigQualificationProofBasicSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("QualificationProofBasicSubmitted"), fetchValueFromList(qualificationProofBasicSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigProfessionalQualificationProofSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("ProfessionalQualificationProofSubmitted"), fetchValueFromList(professionalQualificationProofSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigExaminationPassCertificateAgentExamSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("ExaminationPassCertificateAgentExamSubmitted"), fetchValueFromList(examinationPassCertificateAgentExamSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigCessationCertificateFromOtherCompanySubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("CessationCertificateFromOtherCompanySubmitted"), fetchValueFromList(examinationPassCertificateAgentExamSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigUndertakingDocumentSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("UndertakingDocumentSubmitted"), fetchValueFromList(undertakingDocumentSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigTrainingExperienceCertificateSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("TrainingExperienceCertificateSubmitted"), fetchValueFromList(trainingExperienceCertificateSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigOriginalIRDAILicenseIDCardSubmitted")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("OriginalIRDAILicenseIDCardSubmitted"), fetchValueFromList(originalIRDAILicenseIDCardSubmittedDropDown), AssertionType.WARNING);
			}		
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}	
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPanNo")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("PanNo"), fetchValueFromTextFields(panNoTextField), AssertionType.WARNING);
			}	
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigBrnachName")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("BrnachName"), fetchValueFromTextFields(brnachNameTextField), AssertionType.WARNING);
			}	
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigBrnachType")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("BrnachType"), fetchValueFromList(brnachTypeDropDown), AssertionType.WARNING);
			}	
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigMuffosilAgent")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("MuffosilAgent"), fetchValueFromList(muffosilAgentDropDown), AssertionType.WARNING);
			}	
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigExaminationBodyName")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("ExaminationBodyName"), fetchValueFromList(examinationBodyNameDropDown), AssertionType.WARNING);
			}
			if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigFatherHusbandName")) {
				assertReference.assertEquals(partyAgentPartyRuleEntity.getStringValueForField("FatherHusbandName"), fetchValueFromList(fatherHusbandNameTextField), AssertionType.WARNING);
			}
			
			
			
	
}
	}
	public void navigateToPartyTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}

	public void navigateToPartyRolesTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}

	public void navigateToContactTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}

	public void navigateToRelatedPratiesTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}

	public void navigateToFollowupTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	public void navigateToHierarchyTab(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity){
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partytreeTitle);
		}
	}
	public void clickToProceedButton(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity) {
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");

		}
	}
	public void saveBrokerCommiDetails(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity) {
		if (partyAgentPartyRuleEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void navigateToAgentPartyRule (){
		switchToFrame("display");
		isElementDisplayed(agentPartyRuleTitle);
	}


public void fillandSubmitPartyAgentPartyRuleEntity(PartyAgentPartyRuleEntity partyAgentPartyRuleEntity, CustomAssert assertReference) throws InterruptedException {
	if(isConfigTrue(partyAgentPartyRuleEntity.getConfigExecute())){
		switchToFrame("display");
		fillPartyAgentPartyRule(partyAgentPartyRuleEntity, assertReference);
		clickToProceedButton(partyAgentPartyRuleEntity);
		saveBrokerCommiDetails(partyAgentPartyRuleEntity);
		navigateToPartyTab(partyAgentPartyRuleEntity);
		navigateToPartyRolesTab(partyAgentPartyRuleEntity);
		navigateToContactTab(partyAgentPartyRuleEntity);
		navigateToRelatedPratiesTab(partyAgentPartyRuleEntity);
		navigateToFollowupTab(partyAgentPartyRuleEntity);
	}
	}
}
