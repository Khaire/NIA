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
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesMemberDetailEntity;

public class PartyPartyRolesMemberDOB extends BasePage {

	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement memberDOBTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement functionTextField;
	private PageElement applicableEventCodeLabel;
	private PageElement currentPageLabel;
	private PageElement memberDOBTextField;
	private PageElement nameOfTheCountryTextField;
	private PageElement zipCodeTextField;
	private PageElement aadharNoTextField;
	private PageElement bmbAccountNumberTextField;
	private PageElement partyPaymentMethodDropdown;
	private PageElement partyBankCodeTextField;
	private PageElement partyBankAccountNoTextField;
	private PageElement reTypePartyBankAccountNoTextField;
	private PageElement partyAccountTypeDropdown;
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partyTreeHierarchyTitle;
	private PageElement proceedButton;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement dOBFindButton;
	private PageElement paidUpCapitalDropdown;
	
	

	public PartyPartyRolesMemberDOB(WebDriver driver, String pageName) {
		super(driver, pageName);
		memberDOBTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"),"Member DOB Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Code")), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Name")), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		functionTextField = new PageElement(By.name("pStakeHolderCode"),"Function Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Applicable Event")), "Applicable Event Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"),"   Current Page Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberDOBTextField = new PageElement(By.xpath("//td//div[contains(text(),'DOB of Member')]/following::input"),"DOB of Member Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameOfTheCountryTextField = new PageElement(By.xpath("//td//div[contains(text(),'NAME OF THE COUNTRY')]/following::input"),"NAME OF THE COUNTRY Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		zipCodeTextField = new PageElement(By.xpath("//td//div[contains(text(),'Zip Code')]/following::input"),"Zip Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		aadharNoTextField = new PageElement(By.xpath("//td//div[contains(text(),'AADHAR No.')]/following::input"),"AADHAR No. Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bmbAccountNumberTextField = new PageElement(By.xpath("//td//div[contains(text(),'BMB Account Number')]/following::input"),"BMB Account Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyPaymentMethodDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Party Payment Method')]/following::select"),"Party Payment Method Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyBankCodeTextField = new PageElement(By.xpath("//td//div[contains(text(),'Party Bank Code')]/following::input"),"Party Bank Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyBankAccountNoTextField = new PageElement(By.xpath("//td//div[contains(text(),'Party Bank Account Number')]/following::input"),"Party Bank Account Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reTypePartyBankAccountNoTextField = new PageElement(By.xpath("//td//div[contains(text(),'Re-Type Party Bank Account Number')]/following::input"),"Re-Type Party Bank Account Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyAccountTypeDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Party Account Type')]/following::select"),"Party Account Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		proceedButton = new PageElement(By.name("Next"),"Next Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton =new PageElement(By.name("save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"),"Party Functions Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Party Contacts Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"Party Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle=new PageElement(By.xpath("//div//b[contains(text(),'List')]"),"Party Followup Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTreeHierarchyTitle=new PageElement(By.xpath("//div//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dOBFindButton=new PageElement(By.xpath("//div[contains(text(),'DOB of Member')]/following::input/following::a[@name='firstFocus']"), "DOB FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paidUpCapitalDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Paid up Capital')]/following::select"),"Paid Up Capital Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
	}

	public void fillPartyRolesMemberDetail(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity, CustomAssert assertReference)throws InterruptedException{
		if(partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("add") || partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("edit")){
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigDobOfMem")) {
				selectDateFromCalender(dOBFindButton, partyRolesMemberDetailEntity.getStringValueForField("DobOfMem"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigNameOfTheCountry")) {
				clearAndSendKeys(nameOfTheCountryTextField, partyRolesMemberDetailEntity.getStringValueForField("NameOfTheCountry"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigZipCode")) {
				clearAndSendKeys(zipCodeTextField, partyRolesMemberDetailEntity.getStringValueForField("ZipCode"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigAadharNo")) {
				clearAndSendKeys(aadharNoTextField, partyRolesMemberDetailEntity.getStringValueForField("AadharNo"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigBMBAccountNo")) {
				clearAndSendKeys(bmbAccountNumberTextField, partyRolesMemberDetailEntity.getStringValueForField("BMBAccountNo"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyPaymentMethod")) {
				selectValueFromList(partyPaymentMethodDropdown, partyRolesMemberDetailEntity.getStringValueForField("PartyPaymentMethod"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyBankCode")) {
				clearAndSendKeys(partyBankCodeTextField, partyRolesMemberDetailEntity.getStringValueForField("PartyBankCode"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyBankAcctNo")) {
				clearAndSendKeys(partyBankAccountNoTextField, partyRolesMemberDetailEntity.getStringValueForField("PartyBankAcctNo"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigReTypePartyBankAccntNo")) {
				clearAndSendKeys(reTypePartyBankAccountNoTextField, partyRolesMemberDetailEntity.getStringValueForField("ReTypePartyBankAccntNo"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyAccountType")) {
				selectValueFromList(partyAccountTypeDropdown, partyRolesMemberDetailEntity.getStringValueForField("PartyAccountType"));
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPaidUpCapital")) {
				selectValueFromList(paidUpCapitalDropdown, partyRolesMemberDetailEntity.getStringValueForField("PaidUpCapital"));
			}
			
		}
		else if(partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("verify")){
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigFunction")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("FunctionTextField"), fetchValueFromTextFields(functionTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigAppEventCode")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("AppEventCode"), fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigDobOfMem")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyRolesMemberDetailEntity.getStringValueForField("DobOfMem")),fetchValueFromTextFields(memberDOBTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigNameOfTheCountry")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("NameOfTheCountry"), fetchValueFromTextFields(nameOfTheCountryTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigZipCode")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("ZipCode"),fetchValueFromTextFields(zipCodeTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigAadharNo")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("AadharNo"),fetchValueFromTextFields(aadharNoTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigBMBAccountNo")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("BMBAccountNo"), fetchValueFromTextFields(bmbAccountNumberTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyPaymentMethod")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyPaymentMethod"), fetchValueFromTextFields(partyPaymentMethodDropdown), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyBankCode")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyBankCode"), fetchValueFromTextFields(partyBankCodeTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyBankAcctNo")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyBankAcctNo"), fetchValueFromTextFields(partyBankAccountNoTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigReTypePartyBankAccntNo")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("ReTypePartyBankAccntNo"), fetchValueFromTextFields(reTypePartyBankAccountNoTextField), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyAccountType")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PartyAccountType"), fetchValueFromTextFields(partyAccountTypeDropdown), AssertionType.WARNING);
			}
			if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPaidUpCapital")) {
				assertReference.assertEquals(partyRolesMemberDetailEntity.getStringValueForField("PaidUpCapital"), fetchValueFromTextFields(paidUpCapitalDropdown), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToParty(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyTab")) {
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}
	
	public void navigateToPartyRoles(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigPartyRolesTab")) {
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}
	
	public void navigateToContacts(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigContactsTab")) {
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}
	
	public void navigateToRelatedParties(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigRelatedPartiesTab")) {
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}
	
	public void navigateToFollowup(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void navigateToHierarchy(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigHierarchyTab")) {
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partyTreeHierarchyTitle);
		}
	}
	
	public void proceedToMemberDOB(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigNextButton")) {
			switchToFrame("display");
			click(proceedButton);
			switchToFrame("display");
			//isElementDisplayed(memberDOBTitle);
		}
	}
	
	public void submitPartyRolesMemberDetail(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity) {
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			//isElementDisplayed(memberDOBTitle);
		}
	}
	
	public void backButtonPartyRolesMemberDetail(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity){
		if (partyRolesMemberDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}
	
	public void navigateToMemberDOBPage() {
		switchToFrame("display");
		isElementDisplayed(memberDOBTitle);
	}

	public void fillAndSubmitPartyRolesMemberDetails(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(partyRolesMemberDetailEntity.getConfigExecute())) {
			switchToFrame("display");
			fillPartyRolesMemberDetail(partyRolesMemberDetailEntity, assertReference);
			proceedToMemberDOB(partyRolesMemberDetailEntity);
			submitPartyRolesMemberDetail(partyRolesMemberDetailEntity);
			navigateToParty(partyRolesMemberDetailEntity);
			navigateToPartyRoles(partyRolesMemberDetailEntity);
			navigateToContacts(partyRolesMemberDetailEntity);
			navigateToRelatedParties(partyRolesMemberDetailEntity);
			navigateToFollowup(partyRolesMemberDetailEntity);
			//navigateToHierarchy(partyRolesMemberDetailEntity);
			backButtonPartyRolesMemberDetail(partyRolesMemberDetailEntity);
		}
	}
}
