package com.aqm.staf.library.pages.common;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.apache.log.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.library.databin.ClientDetailsEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyEntity;

public class PartyDetailsCreateEditPage extends BasePage{
	private PageElement search;
	private PageElement partyMade;
	private String partyCode;
	private PageElement partyDetailsTitle;
	private PageElement individualRadioButton;
	private PageElement organizationRadioButton;
	private PageElement stakeCodeDropDown;
	private PageElement companyDropDown;
	private PageElement firstNameTextField;
	private PageElement middleNameTextField;
	private PageElement lastNameTextField;
	private PageElement otherNameTextField;
	private PageElement titleDropDown;
	private PageElement titleEditTextField;
	private PageElement sexDropDown;
	private PageElement nationalityTextField;
	private PageElement parentPartyTextField;
	private PageElement parentPartyCodeIndividualEditTextField;
	private PageElement startDateTextField;
	private PageElement endDateTextField;
	private PageElement contactTypeDropDown;
	private PageElement address1TextField;
	private PageElement address2TextField;
	private PageElement addressAlongWithCityNameTextField;
	private PageElement cityCodeTextField;
	private PageElement cityNameTextField;
	private PageElement stateCodeTextField;
	private PageElement stateNameTextField;
	private PageElement countryCodeTextField;
	private PageElement countryNameTextField;
	private PageElement pinCodeTextField;
	private PageElement telephoneNumberHomeTextField;
	private PageElement telephoneNumberOfficeTextField;
	private PageElement mobileNoTextField;
	private PageElement faxNumberHomeTextField;
	private PageElement faxNumberOfficeTextField;
	private PageElement emailIdHomeTextField;
	private PageElement emailIdOfficeTextField;
	private PageElement blackListIndicatorDropDown;
	private PageElement partyOccupationDropDown;
	private PageElement panNumberTextField;
	private PageElement tanNumberTextField;
	private PageElement tdsVendorDropDown;
	private PageElement sectionCodeDropDown;
	private PageElement wardNoTextField;
	private PageElement contactPersonTextField;
	private PageElement sectorDropDown;
	private PageElement clientTypeDropDown;
	private PageElement prospectIdTextField;
	private PageElement dateOfBirthTextField;
	private PageElement businessTypeDropDown;
	private PageElement manualPartyCodeTextField;
	private PageElement coInsuranceApplicableDropDown;
	private PageElement partyBankCodeTextField;
	private PageElement partyBankAccountNumberTextField;
	private PageElement reTypePartyBankAccountNumberTextField;
	private PageElement partyPaymentMethodDropDown;
	private PageElement partyAccountTypeDropDown;
	private PageElement nameOfTheCountryTextArea;
	private PageElement zipCodeTextField;
	private PageElement aadharNoTextField;
	private PageElement relationshipWithRegisteredUserDropDown;
	private PageElement eInsuranceAccountNoTextField;
	private PageElement doYouWantToAddMemberStakeDropDown;
	private PageElement claimServicingOfficeCodeTextArea;
	private PageElement saveButton;
	private PageElement businessNameTextField;
	private PageElement proposerNameTextField;
	private PageElement registrationNoTextField;
	private PageElement registrationDateTextField;
	private PageElement typeOfOrganizationDropDown;
	private PageElement parentCodeTextField;
	private PageElement parentCodeOrganizationEditTextField;;
	private PageElement businessAddress1TextField;
	private PageElement businessAddress2TextField;
	private PageElement businessAddressAlongWithCityNameTextField;
	private PageElement businessTelNumOffTextField;
	private PageElement businessTelNumExtnTextField;
	private PageElement faxNo1TextField;
	private PageElement faxNo2TextField;
	private PageElement eMailId1TextField;
	private PageElement eMailId2TextField;
	private PageElement paidUpCapitalDropDown;
	private PageElement addressForCorrespondenceTextArea;
	private PageElement partyCodeTextField;
	private PageElement editButton;
	private PageElement deleteButton;
	private PageElement showVersionButton;
	private PageElement backButton;
	private PageElement policyListButton;
	private PageElement claimListButton;
	private PageElement completeEditButton;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButtonOnReasonPage;
	private PageElement dateOnReasonPage;
	private PageElement partyTitle;
	private PageElement partyFunctionsTitlePage;
	private PageElement partyDetailsTitlePage;
	private PageElement partyRolesTab;
	private PageElement contactsTitle;
	private PageElement partyContactTitlePage;
	private PageElement relatedPartiesTitle;
	private PageElement partyRelationsTitlePage;
	private PageElement followupTitle;
	private PageElement partyFollowupListTitlePage;
	private PageElement hierarchyTitle;
	private PageElement partyTreeTitlePage;
	//private PageElement saveEditButton;
	private PageElement surNameTextField;
	private PageElement bmbAccountNumberTextField;
	private PageElement startDateFindButton;
	private PageElement endDateFindButton;
	private PageElement typeOfOfficerDropDown;
	private PageElement userIdLabel;
	private PageElement roleLabel;

	private PageElement fatherHusbandNameTextField;

	private PageElement educationalQualificationDropDown;	
	private PageElement professionalQualificationDropDown;
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

	private PageElement nominatedForExamButton;
	private PageElement	qualifiedForExamButton;
	private PageElement	passedForExamButton;
	private PageElement approveOrActivateAgentButton;

	//
	private PageElement iMFLicenseNoTextField;
	private PageElement licenseIssueDateButton;
	private PageElement licenseExpiryDateButton;
	private PageElement branchNameTextField;
	private PageElement branchTypeDropdwon;
	private PageElement licenseIssueDateTextField;
	private PageElement licenseExpiryDateTextField;
	private PageElement manualPartyCodeIMFTextField;

	private PageElement agentLicenseNoTextField;
	private PageElement dateOfBirthForPerspectiveAgentTextField;



	private PageElement deptOfSurveyorDropdown;
	private PageElement iIISLAMembershipNoTextField;
	private PageElement surveyorLicenseNoTextField;
	private PageElement surveyorLicenseStartDateTextField;
	private PageElement surveyorLicenseExpiryDateTextField;

	private PageElement stateCodeFindButton;
	private PageElement stateCodeLink;
	private PageElement pinCodeFindButton;
	private PageElement pinCodeLink;
	private PageElement stateName;
	
	private PageElement KYCIdentificationNumber;
	private PageElement AADHARAuthenticationStatus;

	public PartyDetailsCreateEditPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		search = new PageElement(By.name("Search"), "Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		individualRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//preceding::input[@type='radio']"), "Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organization Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stakeCodeDropDown = new PageElement(By.name("pStakeCode"), "Stake Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		companyDropDown = new PageElement(By.name("pCompanyCode"), "Company DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		firstNameTextField = new PageElement(By.name("pFirstName"), "First Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		middleNameTextField = new PageElement(By.name("pMiddleName"), "Middle Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lastNameTextField = new PageElement(By.name("pLastName"), "Last Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherNameTextField = new PageElement(By.name("pOtherName"), "Other Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		titleDropDown = new PageElement(By.name("pTitle"), "Title DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		titleEditTextField=new PageElement(By.name("pInitial"), "Title Edit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown = new PageElement(By.name("pSex"), "Sex DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nationalityTextField = new PageElement(By.name("pNationality"), "Nationality TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		parentPartyTextField = new PageElement(By.name("pParentPtyCode"), "Parent Party TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		parentPartyCodeIndividualEditTextField=new PageElement(By.name("pParentPartyCode"), "Parent Party Code Individual Edit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		startDateTextField = new PageElement(By.name("pStartDate"), "Start Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endDateTextField = new PageElement(By.name("pEndDate"), "End Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactTypeDropDown = new PageElement(By.name("pContactType"), "Contact Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		address1TextField = new PageElement(By.name("pAddress"), " Address 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address2TextField = new PageElement(By.name("pAddress1"), " Address 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressAlongWithCityNameTextField = new PageElement(By.name("pAddress2"), " Address Along With City Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityCodeTextField = new PageElement(By.name("pCityCode"), " City Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityNameTextField = new PageElement(By.name("pCityName"), " City Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateCodeTextField = new PageElement(By.name("pStateCode"), " State Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateNameTextField = new PageElement(By.name("pStateName"), " State Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryCodeTextField = new PageElement(By.name("pCountryCode"), " Country Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryNameTextField =  new PageElement(By.name("pCountryName"), " Country Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextField = new PageElement(By.name("pPostalCode"), " Pin Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNumberHomeTextField = new PageElement(By.name("pTelephoneNo1"), " Telephone Number Home TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNumberOfficeTextField = new PageElement(By.name("pTelephoneNo2"), " Telephone Number Office TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mobileNoTextField = new PageElement(By.name("pTelephoneNo3"), " Mobile No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNumberHomeTextField = new PageElement(By.name("pFaxNo"), " Fax Number home TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNumberOfficeTextField = new PageElement(By.name("pEmail1"), " Fax Number Office TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		emailIdHomeTextField = new PageElement(By.name("pEmail2"), " Email Id Home TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		emailIdOfficeTextField = new PageElement(By.name("pEmail3"), " Email Id Office TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		partyFunctionsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"),"Party Functions Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRolesTab = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyContactTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related Parties')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRelationsTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyFollowupListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'PartyFollowup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyTreeTitlePage = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surNameTextField=new PageElement(By.name("pSurName"), "SurNameTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		/**************************Add Locator for xpath***********************/

		blackListIndicatorDropDown = new PageElement(By.xpath(locatorforPanel("Black List Indicator", "select")), "Black List Indicator DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partyOccupationDropDown =  new PageElement(By.xpath(locatorforPanel("Party Occupation", "select")), "Party Occupation DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		panNumberTextField = new PageElement(By.xpath(locatorforPanel("Pan Number", "input")), " Pan Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tanNumberTextField = new PageElement(By.xpath(locatorforPanel("Tan Number", "input")), " Tan Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tdsVendorDropDown = new PageElement(By.xpath(locatorforPanel("TDS Vendor", "select")), "TDS Vendor DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionCodeDropDown = new PageElement(By.xpath(locatorforPanel("Section Code", "select")), "Section Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wardNoTextField = new PageElement(By.xpath(locatorforPanel("Ward No.", "input")), "Ward No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactPersonTextField = new PageElement(By.xpath(locatorforPanel("Contact Person", "input")), "Contact Person TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sectorDropDown = new PageElement(By.xpath(locatorforPanel("Sector", "select")), "Sector DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		clientTypeDropDown = new PageElement(By.xpath(locatorforPanel("Client Type", "select")), "Client Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		prospectIdTextField = new PageElement(By.xpath(locatorforPanel("Prospect ID", "input")), " Prospect Id TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField = new PageElement(By.xpath(locatorforPanel("Date of birth", "input")), " Date Of Birth TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessTypeDropDown = new PageElement(By.xpath(locatorforPanel("Business Type", "select")), "Business Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		manualPartyCodeTextField = new PageElement(By.xpath(locatorforPanel("Manual Party Code", "input")), "Manual Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicableDropDown = new PageElement(By.xpath(locatorforPanel("Co-Insurance Applicable", "select")), "Co-Insurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partyBankCodeTextField = new PageElement(By.xpath(locatorforPanel("Party Bank Code", "input")), "Party Bank Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyBankAccountNumberTextField = new PageElement(By.xpath(locatorforPanel("Party Bank Account Number", "input")), "Party Bank Account Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reTypePartyBankAccountNumberTextField = new PageElement(By.xpath(locatorforPanel("Re-Type Party Bank Account Number", "input")), "Re-Party Bank Account Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyPaymentMethodDropDown = new PageElement(By.xpath(locatorforPanel("Party Payment Method", "select")), "Party Payment Method DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partyAccountTypeDropDown = new PageElement(By.xpath(locatorforPanel("Party Account Type", "select")), "Party Account Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheCountryTextArea = new PageElement(By.xpath(locatorforPanel("NAME OF THE COUNTRY", "textarea")), "Name Of The country TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		zipCodeTextField = new PageElement(By.xpath(locatorforPanel("Zip Code", "input")), "Zip Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aadharNoTextField = new PageElement(By.xpath(locatorforPanel("AADHAR No.", "input")), "Aadhar No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithRegisteredUserDropDown = new PageElement(By.xpath(locatorforPanel("Relationship with Registered user", "select")), "Relationship With Registered User DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		eInsuranceAccountNoTextField = new PageElement(By.xpath(locatorforPanel("E-Insurance Account No", "input")), "E-Insurance Account No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouWantToAddMemberStakeDropDown = new PageElement(By.xpath(locatorforPanel("Do you want to add Member Stake", "select")), "Do You Want To Add Member Stake DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimServicingOfficeCodeTextArea = new PageElement(By.xpath(locatorforPanel("Claim Servicing Office Code", "textarea")), "claim Servicing Office Code TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bmbAccountNumberTextField=new PageElement(By.xpath(locatorforPanel("BMB Account Number", "input")), "BMB Account Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		/*****************End**********************/

		/************************ For Organization ***************************/

		businessNameTextField = new PageElement(By.name("pBusinessName"), " Business Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proposerNameTextField= new PageElement(By.name("pBusinessName"), " Proposer Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNoTextField = new PageElement(By.name("pRegNo"), " Registration No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationDateTextField = new PageElement(By.name("pRegDate"), " Registration Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfOrganizationDropDown = new PageElement(By.name("pTypeOfOrg"), "Type Of Organization DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		parentCodeTextField = new PageElement(By.name("pParentPtyCode"), " Parent Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		parentCodeOrganizationEditTextField=new PageElement(By.name("pParentPartyCode"), "Parent Code Organization Edit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessAddress1TextField = new PageElement(By.name("pAddress"), " Business Address 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessAddress2TextField = new PageElement(By.name("pAddress1"), " Business Address 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessAddressAlongWithCityNameTextField = new PageElement(By.name("pAddress2"), " Business Address Along With City Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessTelNumOffTextField = new PageElement(By.name("pTelephoneNo1"), " Business Tel Num-Off TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessTelNumExtnTextField = new PageElement(By.name("pTelephoneNo2"), " Business Tel Num-Extn TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNo1TextField = new PageElement(By.name("pFaxNo"), " Fax No-1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNo2TextField = new PageElement(By.name("pEmail1"), " Fax No-2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eMailId1TextField = new PageElement(By.name("pEmail2"), " e-mail id-1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eMailId2TextField = new PageElement(By.name("pEmail3"), " e-mail id-2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paidUpCapitalDropDown = new PageElement(By.xpath(locatorforPanel("Paid up Capital", "select")), "Paid up Capital DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addressForCorrespondenceTextArea = new PageElement(By.xpath(locatorforPanel("Address for Correspondence", "textarea")), " Address for Correspondence TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/***********************************************************************/
		partyCodeTextField=new PageElement(By.name("pPartyCode"), " Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		editButton=new PageElement(By.name("Edit"), " Edit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton=new PageElement(By.name("Delete"), " Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		showVersionButton=new PageElement(By.name("Show Version"), " Show Version Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyListButton=new PageElement(By.name("Policy List"), " Policy List Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimListButton=new PageElement(By.name("Claim List"), " Claim List Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		completeEditButton=new PageElement(By.name("Complete Edit"), " Complete Edit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//saveEditButton=new PageElement(By.name("Save"), " Save Edit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reasonForInitiatingThisActionTextArea= new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")),"Reason for initiating this action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButtonOnReasonPage = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOnReasonPage=new PageElement(By.name("pEventEffectiveDate"), "Date on Reason TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		startDateFindButton=new PageElement(By.xpath("//div[contains(text(),'Start Date')]/following::input/following::a[@name='firstFocus']"), "Start Date Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endDateFindButton=new PageElement(By.xpath("//div[contains(text(),'End Date')]/following::input/following::a[@name='firstFocus']"), "End Date Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfOfficerDropDown=new PageElement(By.xpath(locatorforPanel("Type of Officer", "select")), "Type of Officer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		userIdLabel=new PageElement(By.xpath("//font/b[contains(text(),'User Id')]"), "user Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleLabel=new PageElement(By.xpath("//font/b[contains(text(),'Role')]"), "role Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nominatedForExamButton=new PageElement(By.name("NominatedForExam"), " NominatedForExam", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		qualifiedForExamButton=new PageElement(By.name("QualifiedForExam"), " QualifiedForExam", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		passedForExamButton=new PageElement(By.name("PassedExam"), "PassedExam", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		approveOrActivateAgentButton=new PageElement(By.name("ActivateAgent"), "Approve/activate Agent", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		//Chintan
		fatherHusbandNameTextField=new PageElement(By.xpath("//td//b[contains(text(),'Father / Husband Name')]/following::input"),"Father / Husband Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		educationalQualificationDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Educational Qualification')]/following::select"),"Educational Qualification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 	
		professionalQualificationDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Professional Qualification')]/following::select"),"Educational Qualification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		passportSizePhotographSubmittedDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Passport size photograph Submitted')]/following::select"),"Educational Qualification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		ageProofSubmittedDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Age  proof Submitted')]/following::select"),"Educational Qualification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		pANCardcopySubmittedDropDown=new PageElement(By.xpath("//td//b[contains(text(),'PAN Card copy Submitted')]/following::select"),"PAN Card copy Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rersidentialAddressProofSubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Residential Address proof Submitted')]/following::select"),"Residential Address proof Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		qualificationProofBasicSubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Qualification proof(Basic) Submitted')]/following::select"),"Qualification proof(Basic) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		professionalQualificationProofSubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Professional Qualification Proof Submitted')]/following::select"),"Professional Qualification Proof Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		examinationPassCertificateAgentExamSubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Examination pass certificate(Agent Exam) Submitted')]/following::select"),"Examination pass certificate(Agent Exam) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cessationCertificateFromOtherCompanySubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Cessation certificate (From other Company) Submitted')]/following::select"),"Cessation certificate (From other Company) Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		undertakingDocumentSubmittedDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Undertaking document Submitted')]/following::select"),"Undertaking document Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		trainingExperienceCertificateSubmittedDropDown =new PageElement(By.xpath("//td//b[contains(text(),'Training/Experience Certificate Submitted')]/following::select"),"Training/Experience Certificate Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		originalIRDAILicenseIDCardSubmittedDropDown=new PageElement(By.xpath("//td//b[contains(text(),'Original IRDAI License  &  ID Card Submitted')]/following::select"),"Original IRDAI License & ID Card Submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//
		iMFLicenseNoTextField = new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'IMF License No.')]/following::input"), "IMF License No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseIssueDateButton=new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'License Issue Date')]/following::input/following::a[@name='firstFocus']"), "License Issue Date Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseExpiryDateButton=new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'License Expiry Date')]/following::input/following::a[@name='firstFocus']"), "License Expiry Date Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		branchNameTextField = new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'Branch Name')]/following::input"), "Branch NameTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		branchTypeDropdwon=new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'Branch Type')]/following::select"),"Branch Type Dropdwon", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseIssueDateTextField= new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'License Issue Date')]/following::input"), "License Issue Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseExpiryDateTextField	= new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'License Expiry Date')]/following::input"), "License Expiry Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualPartyCodeIMFTextField= new PageElement(By.xpath("//form[@name='frmPartyWizard']//td//b[contains(text(),'Manual Party Code')]/following::input"), "Manual Party Code IMF TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		agentLicenseNoTextField=new PageElement(By.xpath("//td//b[contains(text(),'Agent License No.')]/following::input"),"Agent License No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		dateOfBirthForPerspectiveAgentTextField = new PageElement(By.xpath("//td//b[contains(text(),'Date of Birth')]/following::input"), " Date Of Birth For Perspective Agent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		deptOfSurveyorDropdown=new PageElement(By.xpath("//td//b[contains(text(),'Dept. of Surveyor')]/following::select"),"dept Of Surveyor Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iIISLAMembershipNoTextField=new PageElement(By.xpath("//td//b[contains(text(),'IIISLA Membership Number')]/following::input"),"iIISLA Membership No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseNoTextField=new PageElement(By.xpath("//td//b[contains(text(),'Surveyor License Number')]/following::input"),"surveyor License No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseStartDateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Surveyor License Start Date')]/following::input"),"surveyor License Start Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorLicenseExpiryDateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Surveyor License Expiry Date')]/following::input"),"surveyor License Expiry Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		stateCodeLink=new PageElement(By.xpath("//html//body//form[1]//table[2]//tbody//tr//td/table//tbody//tr[20]//td[1]//a"),"State Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stateCodeFindButton=new PageElement(By.id("stateFind"),"State Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//pinCodeLink=new PageElement(By.xpath("//html//body//form[1]//table[2]//tbody//tr//td//table//tbody//tr[12]//td[1]//div//a"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//	pinCodeFindButton=new PageElement(By.id("pinFind"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//	pinCodeFindButton=new PageElement(By.id("pinFind"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pinCodeFindButton=new PageElement(By.id("pinFind"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//pinCodeFindButton=new PageElement(By.xpath("//input[@name=('pPostalCode')]//following::img[1]"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stateName=new PageElement(By.xpath("//input[@name='pStateName']"), "user Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		KYCIdentificationNumber=new PageElement(By.xpath("//td//b[contains(text(),'KYC Identification Number(KIN)')]/following::input[1]"), "KYC Identification Number(KIN)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AADHARAuthenticationStatus=new PageElement(By.xpath("//td//b[contains(text(),'AADHAR Authentication Status')]/following::input[1]"), "AADHAR Authentication Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void LoginEditParty(PartyEntity partyEntity, CustomAssert assertReference) throws InterruptedException{
	if (partyEntity.getBooleanValueForField("Configlogin")) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navigateToPartyPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToFrame("display");
	}
	
	}
	public void fillPartyDetails(PartyEntity partyEntity, CustomAssert assertReference) throws InterruptedException{
		WebDriverWait wait	=new WebDriverWait(driver, 30);;
		if(partyEntity.getAction().equalsIgnoreCase("add") || partyEntity.getAction().equalsIgnoreCase("edit")){
			if(partyEntity.getBooleanValueForField("ConfigPrimaryInformation")){
				if (partyEntity.getBooleanValueForField("ConfigIndividual")) {
					//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					check(individualRadioButton);
					Thread.sleep(2000);
				}

				if (partyEntity.getBooleanValueForField("ConfigOrganization")) {
					check(organizationRadioButton);
					Thread.sleep(2000);
				}

				if (partyEntity.getBooleanValueForField("ConfigStakeCode")) {
					selectValueFromList(stakeCodeDropDown, partyEntity.getStringValueForField("StakeCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigCompany")) {
					selectValueFromList(companyDropDown, partyEntity.getStringValueForField("Company"));
				}

				if (partyEntity.getBooleanValueForField("ConfigFirstName")) {
					//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					String firstName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(firstNameTextField,firstName);
					partyEntity.setStringValueForField("FirstName",firstName );
				}

				if (partyEntity.getBooleanValueForField("ConfigMiddleName")) {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					String middleName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(middleNameTextField, middleName);
					partyEntity.setStringValueForField("MiddleName",middleName );
				}

				if (partyEntity.getBooleanValueForField("ConfigLastName")) {
					String lastName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(lastNameTextField, lastName);
					partyEntity.setStringValueForField("LastName",lastName );
				}

				if (partyEntity.getBooleanValueForField("ConfigOtherName")) {
					String otherName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(otherNameTextField, otherName);
					partyEntity.setStringValueForField("OtherName",otherName );
					Thread.sleep(1000);
				}

				if (partyEntity.getBooleanValueForField("ConfigBusinessName")) {
					Thread.sleep(3000);
					String businessName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(businessNameTextField,businessName);
					partyEntity.setStringValueForField("BusinessName",businessName );
				}
				if (partyEntity.getBooleanValueForField("ConfigRegistrationDate")) {
					String registrationDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("RegistrationDate"));
					clearAndEnterDate(registrationDateTextField, registrationDate);
				}	

				if (partyEntity.getBooleanValueForField("ConfigRegistrationNo")) {
					clearAndSendKeys(registrationNoTextField, partyEntity.getStringValueForField("RegistrationNo"));
				}

				/*if (partyEntity.getBooleanValueForField("ConfigRegistrationDate")) {
					String registrationDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("RegistrationDate"));
					clearAndEnterDate(registrationDateTextField, registrationDate);
				}*/

				if (partyEntity.getBooleanValueForField("ConfigTypeOfOrganization")) {
					selectValueFromList(typeOfOrganizationDropDown, partyEntity.getStringValueForField("TypeOfOrganization"));
				}

				if (partyEntity.getBooleanValueForField("ConfigParentCode")) {
					clearAndSendKeys(parentCodeTextField, partyEntity.getStringValueForField("ParentCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigTitle")) {
					selectValueFromList(titleDropDown, partyEntity.getStringValueForField("Title"));
				}

				if (partyEntity.getBooleanValueForField("ConfigSex")) {
					selectValueFromList(sexDropDown, partyEntity.getStringValueForField("Sex"));
				}

				if (partyEntity.getBooleanValueForField("ConfigNationality")) {
					clearAndSendKeys(nationalityTextField, partyEntity.getStringValueForField("Nationality"));
				}

				if (partyEntity.getBooleanValueForField("ConfigParentParty")) {
					clearAndSendKeys(parentPartyTextField, partyEntity.getStringValueForField("ParentParty"));
				}

				if (partyEntity.getBooleanValueForField("ConfigStartDate")) {
					String startDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("StartDate"));
					clearAndEnterDate(startDateTextField, startDate);
					//selectDateFromCalender(startDateFindButton, partyEntity.getStringValueForField("StartDate"));
					switchToFrame("display");
				}

				if (partyEntity.getBooleanValueForField("ConfigEndDate")) {
					String endDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("EndDate"));
					clearAndEnterDate(endDateTextField, endDate);
					//selectDateFromCalender(endDateFindButton, partyEntity.getStringValueForField("EndDate"));
				}

				if (partyEntity.getBooleanValueForField("ConfigContactType")) {
					selectValueFromList(contactTypeDropDown, partyEntity.getStringValueForField("ContactType"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAddress1")) {
					clearAndSendKeys(address1TextField, partyEntity.getStringValueForField("Address1"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAddress2")) {
					clearAndSendKeys(address2TextField, partyEntity.getStringValueForField("Address2"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAddressAlongWithCityName")) {
					clearAndSendKeys(addressAlongWithCityNameTextField, partyEntity.getStringValueForField("AddressAlongWithCityName"));
				}

				if (partyEntity.getBooleanValueForField("ConfigBusinessAddress1")) {
					clearAndSendKeys(businessAddress1TextField, partyEntity.getStringValueForField("BusinessAddress1"));
				}

				if (partyEntity.getBooleanValueForField("ConfigBusinessAddress2")) {
					clearAndSendKeys(businessAddress2TextField, partyEntity.getStringValueForField("BusinessAddress2"));
				}

				if (partyEntity.getBooleanValueForField("ConfigBusinessAddressAlongWithCityName")) {
					clearAndSendKeys(businessAddressAlongWithCityNameTextField, partyEntity.getStringValueForField("BusinessAddressAlongWithCityName"));
				}

				if (partyEntity.getBooleanValueForField("ConfigCityCode")) {
					clearAndSendKeys(cityCodeTextField, partyEntity.getStringValueForField("CityCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigCityName")) {
					clearAndSendKeys(cityNameTextField, partyEntity.getStringValueForField("CityName"));
				}
				if (partyEntity.getBooleanValueForField("ConfigStateCode")) {
					switchToFrame("display");
					click(stateCodeFindButton);
					switchToWindow("PinCode Details");
					Thread.sleep(1000);
					stateCodeLink=new PageElement (By.xpath("//td[contains(text(),'"+partyEntity.getStringValueForField("StateCode")+"')]/preceding-sibling::td[3]/div/a"), " State Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					wait.until(ExpectedConditions.elementToBeClickable(getWebElement(stateCodeLink)));
					click(stateCodeLink, driver);
					//click(stateCodeLink);
					Thread.sleep(5000);
					switchToWindow("Integrated Insurance Management System");
					switchToFrame("display");
					fetchStateName(partyEntity);
				}
				if (partyEntity.getBooleanValueForField("ConfigPinCode")) {
					switchToFrame("display");
					
					click(pinCodeTextField, driver);
					//click(pinCodeTextField);
					clearAndSendKeys(pinCodeTextField, partyEntity.getStringValueForField("PinCode"));
					click(pinCodeFindButton);
					Thread.sleep(5000);
					switchToWindow("PinCode Details");
					pinCodeLink=new PageElement (By.xpath("//a[contains(text(),'"+partyEntity.getStringValueForField("PinCode")+"')]"), " Pin Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					wait.until(ExpectedConditions.elementToBeClickable(getWebElement(pinCodeLink)));			
					//click(pinCodeLink, driver);
					doubleClick(pinCodeLink);
					//click(pinCodeLink);
					Thread.sleep(5000);
					switchToWindow("Integrated Insurance Management System");
					switchToFrame("display");
					fetchPinCode(partyEntity);
					fetchCityName(partyEntity);
				}

				if (partyEntity.getBooleanValueForField("ConfigStateName")) {
					clearAndSendKeys(stateNameTextField, partyEntity.getStringValueForField("StateName"));
				}
				if (partyEntity.getBooleanValueForField("ConfigCountryCode")) {
					clearAndSendKeys(countryCodeTextField, partyEntity.getStringValueForField("CountryCode"));
				}
				if (partyEntity.getBooleanValueForField("ConfigCountryName")) {
					clearAndSendKeys(countryNameTextField, partyEntity.getStringValueForField("CountryName"));
				}
				if (partyEntity.getBooleanValueForField("ConfigTelephoneNumberHome")) {
					switchToWindow();
					switchToFrame("display");
					clearAndSendKeys(telephoneNumberHomeTextField, partyEntity.getStringValueForField("TelephoneNumberHome"));
				}
				if (partyEntity.getBooleanValueForField("ConfigTelephoneNumberOffice")) {
					switchToWindow();
					switchToFrame("display");
					clearAndSendKeys(telephoneNumberOfficeTextField, partyEntity.getStringValueForField("TelephoneNumberOffice"));
				}
				if (partyEntity.getBooleanValueForField("ConfigFaxNumberHome")) {
					clearAndSendKeys(faxNumberHomeTextField, partyEntity.getStringValueForField("FaxNumberHome"));
				}
				if (partyEntity.getBooleanValueForField("ConfigFaxNumberOffice")) {
					clearAndSendKeys(faxNumberOfficeTextField, partyEntity.getStringValueForField("FaxNumberOffice"));
				}
				if (partyEntity.getBooleanValueForField("ConfigEmailIdHome")) {
					clearAndSendKeys(emailIdHomeTextField, partyEntity.getStringValueForField("EmailIdHome"));
				}
				if (partyEntity.getBooleanValueForField("ConfigEmailIdOffice")) {
					clearAndSendKeys(emailIdOfficeTextField, partyEntity.getStringValueForField("EmailIdOffice"));
				}
				if (partyEntity.getBooleanValueForField("ConfigBlackListIndicator")) {
					selectValueFromList(blackListIndicatorDropDown, partyEntity.getStringValueForField("BlackListIndicator"));
				}
				if (partyEntity.getBooleanValueForField("ConfigBusinessTelNumOff")) {
					//switchToWindow();
					//switchToFrame("display");
					clearAndSendKeys(businessTelNumOffTextField, partyEntity.getStringValueForField("BusinessTelNumOff"));
				}
				if (partyEntity.getBooleanValueForField("ConfigBusinessTelNumExtn")) {
					//switchToWindow();
					//switchToFrame("display");
					clearAndSendKeys(businessTelNumExtnTextField, partyEntity.getStringValueForField("BusinessTelNumExtn"));
				}
				if (partyEntity.getBooleanValueForField("ConfigMobileNo")) {
					//switchToWindow();
					//switchToFrame("display");
					clearAndSendKeys(mobileNoTextField, partyEntity.getStringValueForField("MobileNo"));
				}

				if (partyEntity.getBooleanValueForField("ConfigFaxNo1")) {
					clearAndSendKeys(faxNo1TextField, partyEntity.getStringValueForField("FaxNo1"));
				}

				if (partyEntity.getBooleanValueForField("ConfigFaxNo2")) {
					clearAndSendKeys(faxNo2TextField, partyEntity.getStringValueForField("FaxNo2"));
				}

				if (partyEntity.getBooleanValueForField("ConfigEmailId1")) {
					clearAndSendKeys(eMailId1TextField, partyEntity.getStringValueForField("EmailId1"));
				}

				if (partyEntity.getBooleanValueForField("ConfigEmailId2")) {
					clearAndSendKeys(eMailId2TextField, partyEntity.getStringValueForField("EmailId2"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyOccupation")) {
					selectValueFromList(partyOccupationDropDown, partyEntity.getStringValueForField("PartyOccupation"));
				}

				if (partyEntity.getBooleanValueForField("ConfigSector")) {
					selectValueFromList(sectorDropDown, partyEntity.getStringValueForField("Sector"));
				}

				if (partyEntity.getBooleanValueForField("ConfigClientType")) {
					selectValueFromList(clientTypeDropDown, partyEntity.getStringValueForField("ClientType"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPaidUpCapital")) {
					selectValueFromList(paidUpCapitalDropDown, partyEntity.getStringValueForField("PaidUpCapital"));
				}

				if (partyEntity.getBooleanValueForField("ConfigProspectId")) {
					clearAndSendKeys(prospectIdTextField, partyEntity.getStringValueForField("ProspectId"));
				}

				if (partyEntity.getBooleanValueForField("ConfigTDSVendor")) {
					selectValueFromList(tdsVendorDropDown, partyEntity.getStringValueForField("TDSVendor"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPanNumber")) {
					String panNumber=RandomCodeGenerator.panNoGenerator();
					clearAndSendKeys(panNumberTextField, panNumber);
				}

				if (partyEntity.getBooleanValueForField("ConfigTanNumber")) {
					String tanNumber=RandomCodeGenerator.tanNoGenerator();
					clearAndSendKeys(tanNumberTextField, tanNumber);
				}

				if (partyEntity.getBooleanValueForField("ConfigSectionCode")) {
					selectValueFromList(sectionCodeDropDown, partyEntity.getStringValueForField("SectionCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigWardNo")) {
					clearAndSendKeys(wardNoTextField, partyEntity.getStringValueForField("WardNo"));
				}

				if (partyEntity.getBooleanValueForField("ConfigBusinessType")) {
					selectValueFromList(businessTypeDropDown, partyEntity.getStringValueForField("BusinessType"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAddressForCorrespondence")) {
					clearAndSendKeys(addressForCorrespondenceTextArea, partyEntity.getStringValueForField("AddressForCorrespondence"));
				}

				if (partyEntity.getBooleanValueForField("ConfigManualPartyCode")) {
					clearAndSendKeys(manualPartyCodeTextField, partyEntity.getStringValueForField("ManualPartyCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
					selectValueFromList(coInsuranceApplicableDropDown, partyEntity.getStringValueForField("CoInsuranceApplicable"));
				}

				if (partyEntity.getBooleanValueForField("ConfigContactPerson")) {
					clearAndSendKeys(contactPersonTextField, partyEntity.getStringValueForField("ContactPerson"));
				}

				if (partyEntity.getBooleanValueForField("ConfigDateOfBirth")) {
					String dateOfBirth=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("DateOfBirth"));
					clearAndEnterDate(dateOfBirthTextField, dateOfBirth);
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyBankCode")) {
					clearAndSendKeys(partyBankCodeTextField, partyEntity.getStringValueForField("PartyBankCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyBankAccountNumber")) {
					clearAndSendKeys(partyBankAccountNumberTextField, partyEntity.getStringValueForField("PartyBankAccountNumber"));
				}

				if (partyEntity.getBooleanValueForField("ConfigReTypePartyBankAccountNumber")) {
					clearAndSendKeys(reTypePartyBankAccountNumberTextField, partyEntity.getStringValueForField("ReTypePartyBankAccountNumber"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyPaymentMethod")) {
					selectValueFromList(partyPaymentMethodDropDown, partyEntity.getStringValueForField("PartyPaymentMethod"));
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyAccountType")) {
					selectValueFromList(partyAccountTypeDropDown, partyEntity.getStringValueForField("PartyAccountType"));
				}

				if (partyEntity.getBooleanValueForField("ConfigNameOfTheCountry")) {
					clearAndSendKeys(nameOfTheCountryTextArea, partyEntity.getStringValueForField("NameOfTheCountry"));
				}

				if (partyEntity.getBooleanValueForField("ConfigZipCode")) {
					clearAndSendKeys(zipCodeTextField, partyEntity.getStringValueForField("ZipCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAADHARNo")) {
					clearAndSendKeys(aadharNoTextField, partyEntity.getStringValueForField("AADHARNo"));
				}

				if (partyEntity.getBooleanValueForField("ConfigRelationshipWithRegisteredUser")) {
					selectValueFromList(relationshipWithRegisteredUserDropDown, partyEntity.getStringValueForField("RelationshipWithRegisteredUser"));
				}

				if (partyEntity.getBooleanValueForField("ConfigEInsuranceAccountNo")) {
					clearAndSendKeys(eInsuranceAccountNoTextField, partyEntity.getStringValueForField("EInsuranceAccountNo"));
				}

				if (partyEntity.getBooleanValueForField("ConfigDoYouWantToAddMemberStake")) {
					selectValueFromList(doYouWantToAddMemberStakeDropDown, partyEntity.getStringValueForField("DoYouWantToAddMemberStake"));
				}

				if (partyEntity.getBooleanValueForField("ConfigClaimServicingOfficeCode")) {
					clearAndSendKeys(claimServicingOfficeCodeTextArea, partyEntity.getStringValueForField("ClaimServicingOfficeCode"));
				}

				if (partyEntity.getBooleanValueForField("ConfigBMBAccountNumber")) {
					clearAndSendKeys(bmbAccountNumberTextField, partyEntity.getStringValueForField("BMBAccountNumber"));
				}
				if (partyEntity.getBooleanValueForField("ConfigTypeOfOfficer")) {
					selectValueFromList(typeOfOfficerDropDown, partyEntity.getStringValueForField("TypeOfOfficer"));
				}

				//Chintan
				if (partyEntity.getBooleanValueForField("ConfigEducationalQualification")) {
					selectValueFromList(educationalQualificationDropDown, partyEntity.getStringValueForField("EducationalQualification"));
				}
				if (partyEntity.getBooleanValueForField("ConfigProfessionalQualification")) {
					selectValueFromList(professionalQualificationDropDown, partyEntity.getStringValueForField("ProfessionalQualification"));
				}
				if (partyEntity.getBooleanValueForField("ConfigPassportSizePhotographSubmitted")) {
					selectValueFromList(passportSizePhotographSubmittedDropDown, partyEntity.getStringValueForField("PassportSizePhotographSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigAgeProofSubmitted")) {
					selectValueFromList(ageProofSubmittedDropDown, partyEntity.getStringValueForField("AgeProofSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigPANCardcopySubmitted")) {
					selectValueFromList(pANCardcopySubmittedDropDown, partyEntity.getStringValueForField("PANCardcopySubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigRersidentialAddressProofSubmitted")) {
					selectValueFromList(rersidentialAddressProofSubmittedDropDown, partyEntity.getStringValueForField("RersidentialAddressProofSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigQualificationProofBasicSubmitted")) {
					selectValueFromList(qualificationProofBasicSubmittedDropDown, partyEntity.getStringValueForField("QualificationProofBasicSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigProfessionalQualificationProofSubmitted")) {
					selectValueFromList(professionalQualificationProofSubmittedDropDown, partyEntity.getStringValueForField("ProfessionalQualificationProofSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigExaminationPassCertificateAgentExamSubmitted")) {
					selectValueFromList(examinationPassCertificateAgentExamSubmittedDropDown, partyEntity.getStringValueForField("ExaminationPassCertificateAgentExamSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigCessationCertificateFromOtherCompanySubmitted")) {
					selectValueFromList(cessationCertificateFromOtherCompanySubmittedDropDown, partyEntity.getStringValueForField("CessationCertificateFromOtherCompanySubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigUndertakingDocumentSubmitted")) {
					selectValueFromList(undertakingDocumentSubmittedDropDown, partyEntity.getStringValueForField("UndertakingDocumentSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigTrainingExperienceCertificateSubmitted")) {
					selectValueFromList(trainingExperienceCertificateSubmittedDropDown, partyEntity.getStringValueForField("TrainingExperienceCertificateSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigOriginalIRDAILicenseIDCardSubmitted")) {
					selectValueFromList(originalIRDAILicenseIDCardSubmittedDropDown, partyEntity.getStringValueForField("OriginalIRDAILicenseIDCardSubmitted"));
				}
				if (partyEntity.getBooleanValueForField("ConfigFatherHusbandName")) {
					clearAndSendKeys(fatherHusbandNameTextField, partyEntity.getStringValueForField("FatherHusbandName"));
				}
				//For IMF 
				if (partyEntity.getBooleanValueForField("ConfigIMFLicenseNoIMF")) {
					String iMFLicenseNo=RandomCodeGenerator.panNoGenerator();
					clearAndSendKeys(iMFLicenseNoTextField, iMFLicenseNo);
				}
				if (partyEntity.getBooleanValueForField("ConfigLicenseIssueDateIMF")) {
					String licenseIssueDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("LicenseIssueDateIMF"));
					clearAndEnterDate(licenseIssueDateTextField, licenseIssueDate);
				}
				if (partyEntity.getBooleanValueForField("ConfigLicenseExpiryDateIMF")) {
					String licenseExpiryDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("LicenseExpiryDateIMF"));
					clearAndEnterDate(licenseExpiryDateTextField, licenseExpiryDate);
				}
				if (partyEntity.getBooleanValueForField("ConfigBranchNameIMF")) {
					clearAndSendKeys(branchNameTextField, partyEntity.getStringValueForField("BranchNameIMF"));
				}
				if (partyEntity.getBooleanValueForField("ConfigBranchTypeIMF")) {
					selectValueFromList(branchTypeDropdwon, partyEntity.getStringValueForField("BranchTypeIMF"));
				}
				if (partyEntity.getBooleanValueForField("ConfigManualPartyCodeIMF")) {
					clearAndSendKeys(manualPartyCodeIMFTextField, partyEntity.getStringValueForField("ManualPartyCodeIMF"));
				}

				if (partyEntity.getBooleanValueForField("ConfigAgentLicenseNo")) {
					String agentLicenseNo=RandomCodeGenerator.getMembershipNo();
					clearAndSendKeys(agentLicenseNoTextField, agentLicenseNo);
					partyEntity.setStringValueForField("AgentLicenseNo",agentLicenseNo);
				}
				if (partyEntity.getBooleanValueForField("ConfigDateOfBirthPerspectiveAgent")) {
					String dateOfBirth=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("DateOfBirthPerspectiveAgent"));
					clearAndEnterDate(dateOfBirthForPerspectiveAgentTextField, dateOfBirth);
				}
				//Abhijit
				if (partyEntity.getBooleanValueForField("ConfigDeptSurveyor")) {
					selectValueFromList(deptOfSurveyorDropdown, partyEntity.getStringValueForField("DeptSurveyor"));
				}
				if (partyEntity.getBooleanValueForField("ConfigIIISLAMembershipNumber")) {
					clearAndSendKeys(iIISLAMembershipNoTextField, partyEntity.getStringValueForField("IIISLAMembershipNumber"));
				}
				if (partyEntity.getBooleanValueForField("ConfigSurveyorLicenseNumber")) {
					String surveyorLicenseNo=RandomCodeGenerator.getMembershipNo();
					clearAndSendKeys(surveyorLicenseNoTextField, surveyorLicenseNo);
				}
				if (partyEntity.getBooleanValueForField("ConfigSurveyorLicenseStartDate")) {
					clearAndEnterDate(surveyorLicenseStartDateTextField, RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("SurveyorLicenseStartDate")));
				}
				if (partyEntity.getBooleanValueForField("ConfigSurveyorLicenseExpiryDate")) {
					clearAndEnterDate(surveyorLicenseExpiryDateTextField, RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("SurveyorLicenseExpiryDate")));
				}
				if (partyEntity.getBooleanValueForField("ConfigSurveyorName")) {
					clearAndSendKeys(firstNameTextField, partyEntity.getStringValueForField("SurveyorName"));
				}
				if(partyEntity.getBooleanValueForField("ConfigKYCIdentificationNumber")) {
					clearAndSendKeys(KYCIdentificationNumber, partyEntity.getStringValueForField("KYCIdentificationNumber"));
				}
				if(partyEntity.getBooleanValueForField("ConfigAADHARAuthenticationStatus")) {
					clearAndSendKeys(AADHARAuthenticationStatus, partyEntity.getStringValueForField("AADHARAuthenticationStatus"));
				}
				if(partyEntity.getBooleanValueForField("Configlogin")) {
					clearAndSendKeys(partyCodeTextField, partyEntity.getStringValueForField("PartyCode"));
					click(search);
					partyCode=partyEntity.getStringValueForField("PartyCode");
					partyMade=new PageElement(By.xpath("//form[@name='PartySearch']//td//div//a//font[contains(text(),'"+partyCode+"')]"), "Member Code checkbox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(partyMade);
				}
			}
		}
		else if(partyEntity.getAction().equalsIgnoreCase("verify")){
			if(partyEntity.getBooleanValueForField("ConfigPrimaryInformation")){
				if (partyEntity.getBooleanValueForField("ConfigIndividual")) {
					//TODO	
					//assertReference.assertEquals(PartyEntity.getb, actual, assertType);
				}

				if (partyEntity.getBooleanValueForField("ConfigOrganization")) {
					//TODO
				}

				if (partyEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("PartyCode"), fetchValueFromTextFields(partyCodeTextField), AssertionType.WARNING);
				}

				/*	if (partyEntity.getBooleanValueForField("ConfigStakeCode")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("StakeCode"), actualPartyEntity.getStringValueForField("StakeCode"), AssertionType.WARNING);
				}

				if (partyEntity.getBooleanValueForField("ConfigCompany")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("Company"), actualPartyEntity.getStringValueForField("Company"), AssertionType.WARNING);
				}*/

				if (partyEntity.getBooleanValueForField("ConfigFirstName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("FirstName"), fetchValueFromTextFields(firstNameTextField), AssertionType.WARNING);
				}

				if (partyEntity.getBooleanValueForField("ConfigMiddleName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("MiddleName").trim(), fetchValueFromTextFields(middleNameTextField).trim(), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigLastName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("LastName"), fetchValueFromTextFields(surNameTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigOtherName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("OtherName"), fetchValueFromTextFields(otherNameTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigTitleEdit")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("TitleEdit"), fetchValueFromTextFields(titleEditTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigSex")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigNationality")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("Nationality"), fetchValueFromTextFields(nationalityTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigParentPartyCodeIndividualEdit")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("ParentPartyCodeIndividualEdit"), fetchValueFromTextFields(parentPartyCodeIndividualEditTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigStartDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("StartDate")), fetchValueFromTextFields(startDateTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigEndDate")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("EndDate"), fetchValueFromTextFields(endDateTextField), AssertionType.WARNING);
				}
				/*if (partyEntity.getBooleanValueForField("ConfigProposerName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("ProposerName"), fetchValueFromTextFields(proposerNameTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigRegistrationNo")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("RegistrationNo"), fetchValueFromTextFields(registrationNoTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigRegistrationDate")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("RegistrationDate"), fetchValueFromTextFields(registrationDateTextField), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigTypeOfOrganization")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("TypeOfOrganization"), fetchValueFromTextFields(typeOfOrganizationDropDown), AssertionType.WARNING);
				}
				if (partyEntity.getBooleanValueForField("ConfigParentCodeOrganizationEdit")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("ParentCodeOrganizationEdit"), fetchValueFromTextFields(parentCodeOrganizationEditTextField), AssertionType.WARNING);
				}*/
				if (partyEntity.getBooleanValueForField("ConfigUserId")) {
					switchToFrame("head");
					assertReference.assertEquals(partyEntity.getStringValueForField("UserId"),fetchValueFromFields(userIdLabel), AssertionType.WARNING);
					switchToFrame("display");
				}
				if (partyEntity.getBooleanValueForField("ConfigRole")) {
					switchToFrame("head");
					assertReference.assertEquals(partyEntity.getStringValueForField("Role"),fetchValueFromFields(roleLabel), AssertionType.WARNING);
					switchToFrame("display");
				}
				if (partyEntity.getBooleanValueForField("ConfigSurveyorName")) {
					assertReference.assertEquals(partyEntity.getStringValueForField("SurveyorName"), fetchValueFromTextFields(firstNameTextField), AssertionType.WARNING);
				}
			}
		}
	}

	private void workaround(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigFirstName")) {
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			switchToWindow();
			switchToFrame("display");
			String firstName=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(firstNameTextField,firstName);
			partyEntity.setStringValueForField("FirstName",firstName );
		}

		if (partyEntity.getBooleanValueForField("ConfigMiddleName")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String middleName=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(middleNameTextField, middleName);
			partyEntity.setStringValueForField("MiddleName",middleName );
		}

		if (partyEntity.getBooleanValueForField("ConfigLastName")) {
			String lastName=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(lastNameTextField, lastName);
			partyEntity.setStringValueForField("LastName",lastName );
		}

		if (partyEntity.getBooleanValueForField("ConfigBusinessName")) {
			switchToWindow();
			switchToFrame("display");
			String businessName=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(businessNameTextField,businessName);
			partyEntity.setStringValueForField("BusinessName",businessName );
		}

		if (partyEntity.getBooleanValueForField("ConfigRegistrationNo")) {
			clearAndSendKeys(registrationNoTextField, partyEntity.getStringValueForField("RegistrationNo"));
		}

		if (partyEntity.getBooleanValueForField("ConfigRegistrationDate")) {
			String registrationDate=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("RegistrationDate"));
			clearAndEnterDate(registrationDateTextField, registrationDate);
		}		

		if (partyEntity.getBooleanValueForField("ConfigAddress1")) {
			clearAndSendKeys(address1TextField, partyEntity.getStringValueForField("Address1"));
		}
		if (partyEntity.getBooleanValueForField("ConfigBusinessAddress1")) {
			clearAndSendKeys(businessAddress1TextField, partyEntity.getStringValueForField("BusinessAddress1"));
		}
	}


	public void submitPartyDetails(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigSaveBtn")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click(saveButton);
			if(isAlertPresent()) {
				acceptAlertAndReturnConfirmationMessage();
			}
		/*	try{
				acceptAlertAndReturnConfirmationMessage();
				click(saveButton);
			}catch(Exception e ){}
			*/
			/*RandomCodeGenerator randomCodeGenerator=new RandomCodeGenerator();
			String currentTime=randomCodeGenerator.getCurrentTimeOfApplication();*/
			/*partyEntity.setStringValueForField("CurrentTime", fetchValueFromTextFields(startDateTextField));*/
			switchToFrame("display");
		}
	}

	public void editPartyDetails(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigEditButton")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click(editButton);
			/*	switchToFrame("display");*/
			fillReasonPage(partyEntity);
			/*RandomCodeGenerator randomCodeGenerator=new RandomCodeGenerator();
			String currentTime=randomCodeGenerator.getCurrentTimeOfApplication();*/
			//partyEntity.setStringValueForField("CurrentTime", fetchValueFromTextFields(startDateTextField));
			switchToFrame("display");
		} 
	}

	public void deletePartyDetails(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
	}

	public void showVersionPartyDetails(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigShowVersionButton")) {
			click(showVersionButton);
			switchToFrame("display");
		}
	}

	public void backFromPartyDetails(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void showPolicyListPartyDetails(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigPolicyListButton")) {
			click(policyListButton);
			switchToFrame("display");
		}
	}

	public void showClaimListPartyDetails(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigClaimListButton")) {
			click(claimListButton);
			switchToFrame("display");
		}
	}

	public void completeEditPartyDetails(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigCompleteEditButton")) {
			click(completeEditButton);
			switchToWindow("Reason");
			//switchToFrame("display");
			//fillReasonPage(partyEntity);
			if (partyEntity.getBooleanValueForField("ConfigForReason")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, partyEntity.getStringValueForField("ReasonTextField"));
			}

			if (partyEntity.getBooleanValueForField("ConfigSaveForReasonPage")){
				click(saveButtonOnReasonPage);
				switchToWindow();
				//switchToWindow();
				switchToFrame("display");
			}
		}
	}

	/*	public void saveEditPartyDetails(PartyEntity PartyEntity, CustomAssert assertReference) {
		if (PartyEntity.getBooleanValueForField("configSaveEditButton")) {
			click(saveEditButton);
		}
	}*/

	public void fillReasonPage(PartyEntity partyEntity) throws InterruptedException{
		switchToWindow("Reason");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (partyEntity.getBooleanValueForField("ConfigDateofReason")) {
			String dateofReason=RandomCodeGenerator.dateGenerator(partyEntity.getStringValueForField("DateofReason"));
			clearAndEnterDate(dateOnReasonPage, dateofReason);
		}

		if (partyEntity.getBooleanValueForField("ConfigForReason")) {
			clearAndSendKeys(reasonForInitiatingThisActionTextArea, partyEntity.getStringValueForField("ReasonTextField"));
		}

		if (partyEntity.getBooleanValueForField("ConfigSaveForReasonPage")){
			click(saveButtonOnReasonPage);
			switchToWindow();
			//switchToWindow();
			switchToFrame("display");
		}
	}

	public void navigateToParty(PartyEntity partyEntity){    
		if (partyEntity.getBooleanValueForField("ConfigParty")){
			click(partyTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyDetailsTitlePage));
			return;
		}
	}

	public void navigateToPartyRoles(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigPartyRoles")){
			click(partyRolesTab);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitlePage);
		}
	}

	public void navigateToContacts(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigContacts")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactTitlePage);
		}
	}

	public void navigateToRelatedParties(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigRelatedParties")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(relatedPartiesTitle);
		}
	}

	public void navigateToFollowup(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigFollowup")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitlePage);
		}
	}

	public void navigateToHierarchy(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigHierarchy")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partyTreeTitlePage);
		}
	}

	//chintan

	public void nominatedForExam(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigNominatedForExam")) {
			click(nominatedForExamButton);
			switchToFrame("display");
			fillReasonPage(partyEntity);
		}
	}
	public void qualifiedForExam(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigQualifiedForExam")) {
			click(qualifiedForExamButton);
			switchToFrame("display");
			fillReasonPage(partyEntity);
		}
	}
	public void passedForExam(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigPassedForExam")) {
			click(passedForExamButton);
			switchToFrame("display");
			fillReasonPage(partyEntity);
		}
	}
	public void approveOrActivateAgent(PartyEntity partyEntity) throws InterruptedException {
		if (partyEntity.getBooleanValueForField("ConfigApproveOrActivateAgent")) {
			click(approveOrActivateAgentButton);
			switchToFrame("display");
			fillReasonPage(partyEntity);
		}
	}
	public void fetchStateName(PartyEntity partyEntity) throws InterruptedException {
		Thread.sleep(2000);
		String stateName=new String();
		stateName=fetchValueFromTextFields(stateNameTextField);
		partyEntity.setStringValueForField("StateName", stateName);
	}
	public void fetchPinCode(PartyEntity partyEntity) throws InterruptedException {
		Thread.sleep(2000);
		String pinCode=new String();
		pinCode=fetchValueFromTextFields(pinCodeTextField);
		partyEntity.setStringValueForField("PinCode", pinCode);
	}
	public void fetchCityName(PartyEntity partyEntity) throws InterruptedException {
		Thread.sleep(2000);
		String cityName=new String();
		cityName=fetchValueFromTextFields(cityNameTextField);
		partyEntity.setStringValueForField("CityName", cityName);
		
	}


	public void fillandSubmitPartyDetails(PartyEntity partyEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(partyEntity.getConfigExecute())){
			switchToFrame("display");
			LoginEditParty(partyEntity, assertReference);
			fillPartyDetails(partyEntity, assertReference);
			submitPartyDetails(partyEntity);
			//LoginEditParty(partyEntity, assertReference);
			editPartyDetails(partyEntity);
			completeEditPartyDetails(partyEntity);
			navigateToPartyRoles(partyEntity);
			navigateToContacts(partyEntity);
			navigateToRelatedParties(partyEntity);
			navigateToFollowup(partyEntity); 
			navigateToHierarchy(partyEntity);
			deletePartyDetails(partyEntity);
			showVersionPartyDetails(partyEntity);
			backFromPartyDetails(partyEntity);
			showPolicyListPartyDetails(partyEntity);
			showClaimListPartyDetails(partyEntity);
			//submitPartyDetails(partyEntity);
			nominatedForExam(partyEntity);
			qualifiedForExam(partyEntity);
			passedForExam(partyEntity);
			approveOrActivateAgent(partyEntity);

		}
	}	
}	
