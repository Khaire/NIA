package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyPartyRoleClaimantEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;

public class Party_PartyRole_Claimant extends BasePage {
	private PageElement claimantPartyRuleTitle; 
	private PageElement surveyorOrganizationdetailsTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement functionTextField;
	private PageElement applicableEventCodeLabel;
	private PageElement thirdPartyRegistrationNumberTextField;
	private PageElement tdsVendorDropdown;
	private PageElement panNumberTextField;
	private PageElement tanNumberTextField;
	private PageElement sectionCodeDropdown;
	private PageElement wardNoTextField;
	private PageElement partyBankCodeTextField;
	private PageElement partyBankAcoountNumberTextField;
	private PageElement reTypePartyBankAccountNumberTextField;
	private PageElement partyPaymentMethodDropdown;
	private PageElement partyAccountTypeDropdown;
	private PageElement nameOfTheCountryTextField;
	private PageElement zipCodeTextField;
	private PageElement aadharNoTextField;
	private PageElement proceedButton;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partytreeTitle;
    
	private PageElement deptOfSurveyorDropdown;
	private PageElement iIISLAMembershipNumberTextField;
	
	public Party_PartyRole_Claimant(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub

		//functionTextField by locatorforpanelMethod
		surveyorOrganizationdetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Surveyor Organization')]"),"Surveyor Organization Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimantPartyRuleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claimant Party Rule')]"),"Claimant Party Rule Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle=new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Code")),"PartyCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Name")),"NameLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		functionTextField=new PageElement(By.xpath(locatorforPanel("Function", "input")),"Function",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","ApplicableEventCode")),"ApplicableEventCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		thirdPartyRegistrationNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Third Party Registration Number')]/following::input"),"ThirdPartyRegistrationNumberTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		tdsVendorDropdown=new PageElement(By.xpath("//td//div[contains(text(),'TDS Vendor')]/following::select"),"TdsVendorDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		panNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pan Number')]/following::input"),"PanNumberTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		tanNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Tan Number')]/following::input"),"TanNumberTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sectionCodeDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Section Code')]/following::select"),"SectionCodeDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		wardNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Ward No')]/following::input"),"WardNoTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyBankCodeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Party Bank Code')]/following::input"),"PartyBankCodeTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyBankAcoountNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Party Bank Account Number')]/following::input"),"PartyBankAcoountNumberTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		reTypePartyBankAccountNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type Party Bank Account Number')]/following::input"),"ReTypePartyBankAccountNumberTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyPaymentMethodDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Party Payment Method')]/following::select"),"PartyPaymentMethodDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyAccountTypeDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Party Account Type')]/following::select"),"PartyAccountTypeDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameOfTheCountryTextField=new PageElement(By.xpath("//td//div[contains(text(),'NAME OF THE COUNTRY')]/following::input"),"NameOfTheCountryTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		zipCodeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Zip Code')]/following::input"),"ZipCodeTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aadharNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'AADHAR No')]/following::input"),"AadharNoTextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		proceedButton=new PageElement(By.name("Next"),"NextArrowButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("save"),"SaveButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partytreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deptOfSurveyorDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Dept. of Surveyor')]/following::select"),"dept Of Surveyor Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	    iIISLAMembershipNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'IIISLA Membership Number')]/following::input"),"iIISLA Membership Number TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);		
	}

	//Services
	public void navigateToPartyTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}

	public void navigateToPartyRolesTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}

	public void navigateToContactTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}

	public void navigateToRelatedPratiesTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}

	public void navigateToFollowupTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	public void navigateToHierarchyTab(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity){
		if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partytreeTitle);
		}
	}

	public void fillPartyDetails(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntity, CustomAssert assertReference){
		if (isConfigTrue(partyPartyRoleClaimantEntity.getConfigExecute())){
			if(partyPartyRoleClaimantEntity.getAction().equalsIgnoreCase("add") || partyPartyRoleClaimantEntity.getAction().equalsIgnoreCase("edit")){
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigFunction")) {
					clearAndSendKeys(functionTextField, partyPartyRoleClaimantEntity.getStringValueForField("FunctionTextField"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigThirdPartyRegistrationNumber")) {
					clearAndSendKeys(thirdPartyRegistrationNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("ThirdPartyRegistrationNumber"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigTDSVendor")) {
					selectValueFromList(tdsVendorDropdown, partyPartyRoleClaimantEntity.getStringValueForField("TDSVendor"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPanNumber")) {
					clearAndSendKeys(panNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("PanNumber"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigTanNumber")) {
					clearAndSendKeys(tanNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("TanNumber"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigSectionCode")) {
					selectValueFromList(sectionCodeDropdown, partyPartyRoleClaimantEntity.getStringValueForField("SectionCode"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigWardNo")) {
					clearAndSendKeys(wardNoTextField, partyPartyRoleClaimantEntity.getStringValueForField("WardNo"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyBankCode")) {
					clearAndSendKeys(partyBankCodeTextField, partyPartyRoleClaimantEntity.getStringValueForField("PartyBankCode"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyBankAccountNumber")) {
					clearAndSendKeys(partyBankAcoountNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("PartyBankAccountNumber"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigReTypePartyBankAccountNumber")) {
					clearAndSendKeys(reTypePartyBankAccountNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("ReTypePartyBankAccountNumber"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyPaymentMethod")) {
					selectValueFromList(partyPaymentMethodDropdown, partyPartyRoleClaimantEntity.getStringValueForField("PartyPaymentMethod"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyAccountType")) {
					selectValueFromList(partyAccountTypeDropdown, partyPartyRoleClaimantEntity.getStringValueForField("PartyAccountType"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigNameOfTheCountry")) {
					clearAndSendKeys(nameOfTheCountryTextField, partyPartyRoleClaimantEntity.getStringValueForField("NameOfTheCountry"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigZipCode")) {
					clearAndSendKeys(zipCodeTextField, partyPartyRoleClaimantEntity.getStringValueForField("ZipCode"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigAadharNo")) {
					clearAndSendKeys(aadharNoTextField, partyPartyRoleClaimantEntity.getStringValueForField("AadharNo"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigDeptOfSurveyor")) {
					selectValueFromList(deptOfSurveyorDropdown, partyPartyRoleClaimantEntity.getStringValueForField("DeptOfSurveyor"));
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigIIISLAMembershipNumber")) {
					clearAndSendKeys(iIISLAMembershipNumberTextField, partyPartyRoleClaimantEntity.getStringValueForField("IIISLAMembershipNumber"));
				}
			}
			else if(partyPartyRoleClaimantEntity.getAction().equalsIgnoreCase("verify")){
				PartyPartyRoleClaimantEntity actualpartyPartyRoleClaimantEntity=new PartyPartyRoleClaimantEntity();

				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel),AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyName")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel),AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigApplicationEventCode")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("ApplicationEventCode"),  fetchValueFromFields(applicableEventCodeLabel),AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigFunction")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("FunctionTextField"), fetchValueFromTextFields(functionTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigThirdPartyRegistrationNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("ThirdPartyRegistrationNumber"), fetchValueFromTextFields(thirdPartyRegistrationNumberTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigTDSVendor")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("TDSVendor"), fetchValueFromTextFields(tdsVendorDropdown), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPanNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PanNumber"), fetchValueFromTextFields(panNumberTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigTanNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("TanNumber"), fetchValueFromTextFields(tanNumberTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigSectionCode")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("SectionCode"), fetchValueFromTextFields(sectionCodeDropdown), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigWardNo")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("WardNo"), fetchValueFromTextFields(wardNoTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyBankCode")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyBankCode"), fetchValueFromTextFields(partyBankCodeTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyBankAccountNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyBankAccountNumber"), fetchValueFromTextFields(partyBankAcoountNumberTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigReTypePartyBankAccountNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("ReTypePartyBankAccountNumber"), fetchValueFromTextFields(reTypePartyBankAccountNumberTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyPaymentMethod")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyPaymentMethod"), fetchValueFromTextFields(partyPaymentMethodDropdown), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigPartyAccountType")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("PartyAccountType"), fetchValueFromTextFields(partyAccountTypeDropdown), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigNameOfTheCountry")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("NameOfTheCountry"), fetchValueFromTextFields(nameOfTheCountryTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigZipCode")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("ZipCode"), fetchValueFromTextFields(zipCodeTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigAadharNo")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("AadharNo"), fetchValueFromTextFields(aadharNoTextField), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigDeptOfSurveyor")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("DeptOfSurveyor"), fetchValueFromList(deptOfSurveyorDropdown), AssertionType.WARNING);
				}
				if (partyPartyRoleClaimantEntity.getBooleanValueForField("ConfigIIISLAMembershipNumber")) {
					assertReference.assertEquals(partyPartyRoleClaimantEntity.getStringValueForField("IIISLAMembershipNumber"), fetchValueFromTextFields(iIISLAMembershipNumberTextField), AssertionType.WARNING);
				}
			}
		}
	}

	// SAVE ND BACK
	public void clickToProceedButton(PartyPartyRoleClaimantEntity PartyPartyRoleClaimantEntity) {
		if (PartyPartyRoleClaimantEntity.getBooleanValueForField("ConfigNextArrowButton")) {
			click(proceedButton);
			switchToFrame("display");

		}
	}
	public void savePartyDetails(PartyPartyRoleClaimantEntity PartyPartyRoleClaimantEntity) {
		if (PartyPartyRoleClaimantEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void showPolicyListPartyDetails(PartyPartyRoleClaimantEntity PartyPartyRoleClaimantEntity) {
		if (PartyPartyRoleClaimantEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}

	}
	public void navigateToClaimantRulePage(){
		switchToFrame("display");
		isElementDisplayed(claimantPartyRuleTitle);
	}

	public void navigateTosurveyorOrganizationdetailsPage(){
		switchToFrame("display");
		isElementDisplayed(surveyorOrganizationdetailsTitle);
	}

	public void fillandSearchPartyDetails(PartyPartyRoleClaimantEntity PartyPartyRoleClaimantEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(PartyPartyRoleClaimantEntity.getConfigExecute())){
			switchToFrame("display");		
			fillPartyDetails(PartyPartyRoleClaimantEntity, assertReference);
			clickToProceedButton(PartyPartyRoleClaimantEntity);
			savePartyDetails(PartyPartyRoleClaimantEntity);
			navigateToPartyTab(PartyPartyRoleClaimantEntity);
			navigateToPartyRolesTab(PartyPartyRoleClaimantEntity);
			navigateToContactTab(PartyPartyRoleClaimantEntity);
			navigateToRelatedPratiesTab(PartyPartyRoleClaimantEntity);
			navigateToFollowupTab(PartyPartyRoleClaimantEntity);
			navigateToHierarchyTab(PartyPartyRoleClaimantEntity);
		}
	}
}










