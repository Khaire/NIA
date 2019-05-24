package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

import com.aqm.staf.library.databin.PartyContactsDetailsEntity;


public class PartyContactsPageDetailsPage extends BasePage {	

	private PageElement partyTab;
	private PageElement partyRolesTab;
	private PageElement relatedPartyTab;
	private PageElement contactsTab;
	private PageElement followupTab;
	private PageElement hierarchyTab;

	private PageElement contactDeatilsTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement relatedPartyTitle;
	private PageElement contactsTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;

	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement contactTypeDropDown;
	private PageElement address1Textfield;
	private PageElement address2TextField;
	private PageElement addressalongwithCityNameField;
	private PageElement cityCodeTextField;
	private PageElement cityNameTextField;
	private PageElement stateCodeTextField;
	private PageElement stateNameTextField;
	private PageElement countryCodeTextField;
	private PageElement countryNameTextField;
	private PageElement postalCodeTextField;
	private PageElement telephoneNumber1TextField1;
	private PageElement telephoneNumber2TextField2;
	private PageElement mobileNumberTextField;
	private PageElement faxNoTextField;
	private PageElement faxNo2TextField;
	private PageElement email2TextField;
	private PageElement email3TextField;

	private PageElement saveButton;
	private PageElement backButton;

	public PartyContactsPageDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		partyTab=new PageElement(By.linkText("Party"), "Party Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyRolesTab=new PageElement(By.linkText("Party Roles"), "Party Roles Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relatedPartyTab=new PageElement(By.linkText("Related Parties"), "Related Parties Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		contactsTab=new PageElement(By.linkText("Contacts"), "Contacts Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.linkText("Followup"), "Followup Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		hierarchyTab=new PageElement(By.linkText("Hierarchy"), "Hierarchy Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//div//b//b[contains(text(),'Functions')]
		contactDeatilsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "ContactDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "PartyTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRolesTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Functions')]"), "PartyRolesTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relatedPartyTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Relation')]"), "Party Related party Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactsTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Contacts')]"), "Party Contact DetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Followup')]"), "Party Follow up DetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hierarchyTab= new PageElement(By.xpath("//div//b//b[contains(text(),'Tree')]"), "Party Tree DetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		partyCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("Contacthetail", "Code")), "Party Code  Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel= new PageElement(By.xpath(genericLocatorforLabel("Contacthetail", "Name")), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactTypeDropDown=new PageElement(By.name("pContactType"), "Contact Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		address1Textfield= new PageElement(By.name("pAddress"), "Address  Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address2TextField= new PageElement(By.name("pAddress1"), "Address 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressalongwithCityNameField= new PageElement(By.name("pAddress2"), "Address 2 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityCodeTextField= new PageElement(By.name("pCityCode"), "City Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityNameTextField= new PageElement(By.name("pCityName"), "City Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateCodeTextField= new PageElement(By.name("pStateCode"), "State Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateNameTextField= new PageElement(By.name("pStateName"), "State Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryCodeTextField= new PageElement(By.name("pCountryCode"), "Country Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryNameTextField= new PageElement(By.name("pCountryName"), "Country Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		postalCodeTextField= new PageElement(By.name("pPostalCode"), "Postal Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNumber1TextField1= new PageElement(By.name("pTelephoneNo1"), "Telephone 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNumber2TextField2= new PageElement(By.name("pTelephoneNo2"), "Telephone 2 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mobileNumberTextField= new PageElement(By.name("pTelephoneNo3"), "Telephone 3 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNoTextField= new PageElement(By.name("pFaxNo"), "Fax No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		faxNo2TextField= new PageElement(By.name("pEmail1"), "Email 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		email2TextField= new PageElement(By.name("pEmail2"), "Email 2 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		email3TextField= new PageElement(By.name("pEmail3"), "Email 3 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillPartyContactDetails(PartyContactsDetailsEntity partyContactsDetailsEntity, CustomAssert assertReference){
		if(partyContactsDetailsEntity.getAction().equalsIgnoreCase("add") || partyContactsDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigContactType")) {
				selectValueFromList(contactTypeDropDown, partyContactsDetailsEntity.getStringValueForField("ContactType"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddress1")) {
				clearAndSendKeys(address1Textfield, partyContactsDetailsEntity.getStringValueForField("Address1"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddress2")) {
				clearAndSendKeys(address2TextField, partyContactsDetailsEntity.getStringValueForField("Address2"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddressAlongWithCityName")) {
				clearAndSendKeys(addressalongwithCityNameField, partyContactsDetailsEntity.getStringValueForField("AddressAlongWithCityName"));
			}

			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPinCode")) {
				clearAndSendKeys(postalCodeTextField, partyContactsDetailsEntity.getStringValueForField("PinCode"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigTelephoneNo1")) {
				clearAndSendKeys(telephoneNumber1TextField1, partyContactsDetailsEntity.getStringValueForField("TelephoneNo1"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigTelephoneNo2")) {
				clearAndSendKeys(telephoneNumber2TextField2, partyContactsDetailsEntity.getStringValueForField("TelephoneNo2"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigMobileNo")) {
				clearAndSendKeys(mobileNumberTextField, partyContactsDetailsEntity.getStringValueForField("MobileNo"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigFaxNo1")) {
				clearAndSendKeys(faxNoTextField, partyContactsDetailsEntity.getStringValueForField("FaxNo1"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigFaxNo2")) {
				clearAndSendKeys(faxNo2TextField, partyContactsDetailsEntity.getStringValueForField("FaxNo2"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigEmailid1")) {
				clearAndSendKeys(email2TextField, partyContactsDetailsEntity.getStringValueForField("Emailid1"));
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigEmailid2")) {
				clearAndSendKeys(email3TextField, partyContactsDetailsEntity.getStringValueForField("Emailid2"));
			}
		}
		else if(partyContactsDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigContactType")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("ContactType"), fetchValueFromTextFields(contactTypeDropDown), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddress1")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("Address1"),fetchValueFromTextFields(address1Textfield), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddress2")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("Address2"), fetchValueFromTextFields(address2TextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigAddressAlongWithCityName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("AddressAlongWithCityName"), fetchValueFromTextFields(addressalongwithCityNameField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigCityCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("CityCode"), fetchValueFromTextFields(cityCodeTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigCityName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("CityName"), fetchValueFromTextFields(cityNameTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigStateCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("StateCode"), fetchValueFromTextFields(stateCodeTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigStateName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("StateName"), fetchValueFromTextFields(stateNameTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigCountryCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("CountryCode"), fetchValueFromTextFields(countryCodeTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigCountryName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("CountryName"), fetchValueFromTextFields(countryNameTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(postalCodeTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigTelephoneNo1")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("TelephoneNo1"), fetchValueFromTextFields(telephoneNumber1TextField1), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigTelephoneNo2")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("TelephoneNo2"), fetchValueFromTextFields(telephoneNumber2TextField2), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigMobileNo")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("MobileNo"), fetchValueFromTextFields(mobileNumberTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigFaxNo1")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("FaxNo1"), fetchValueFromTextFields(faxNoTextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigFaxNo2")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("FaxNo2"),fetchValueFromTextFields(faxNo2TextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigEmailid1")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("Emailid1"), fetchValueFromTextFields(email2TextField), AssertionType.WARNING);
			}
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigEmailid2")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("Emailid2"), fetchValueFromTextFields(email3TextField), AssertionType.WARNING);
			}
		}
	}
	
	public void submitPartyContactDetails(PartyContactsDetailsEntity partyContactsDetailsEntity) {
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
		}
	}
	
	public void backFromPartyDetails(PartyContactsDetailsEntity partyContactsDetailsEntity) {
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(contactsTitle);
		}
	}
	
	public void navigateToParty(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTab);
			switchToFrame("display");
			isElementDisplayed(partyTitle);
		}

	}
	
	public void navigateToPartyRoles(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyRoleTab")){
			click(partyRolesTab);
			switchToFrame("display");
			isElementDisplayed(partyRolesTitle);
		}
	}
	
	public void navigateToContacts(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTab);
			switchToFrame("display");
			isElementDisplayed(contactsTitle);
		}
	}
	
	public void navigateToRelatedParty(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigRelatedPartyTab")){
			click(relatedPartyTab);
			switchToFrame("display");
			isElementDisplayed(relatedPartyTitle);
		}
	}
	
	public void navigateToFollowup(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTitle);
		}
	}
	
	public void navigateToHierarchy(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTab);
			switchToFrame("display");
			isElementDisplayed(hierarchyTitle);
		}
	}
	
	public void navigateContactDetails(){
		switchToFrame("display");
		isElementDisplayed(contactDeatilsTitle);
	}

	public void fillandSubmitPartyContactDetails(PartyContactsDetailsEntity partyContactsDetailsEntity, CustomAssert assertReference) {
		if (isConfigTrue(partyContactsDetailsEntity.getConfigExecute())){
			fillPartyContactDetails(partyContactsDetailsEntity, assertReference);
			submitPartyContactDetails(partyContactsDetailsEntity);
			backFromPartyDetails(partyContactsDetailsEntity);
			navigateToParty(partyContactsDetailsEntity);
			navigateToPartyRoles(partyContactsDetailsEntity);
			navigateToContacts(partyContactsDetailsEntity);
			navigateToRelatedParty(partyContactsDetailsEntity);
			navigateToFollowup(partyContactsDetailsEntity);
			//navigateToHierarchy(partyContactsDetailsEntity);

		}
	}
}


