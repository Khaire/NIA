package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyRolBrokerCommiEntity;

public class PartyPartyRolesBrokerageCommission extends BasePage{
	private PageElement brokerCommissionTitle;
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

	private PageElement brokerLicenseNoTextField;
	private PageElement panNoTextField;
	private PageElement licenseIssueDateTextField;
	private PageElement licenseExpiryDateTextField;
	private PageElement branchNameTextField;
	private PageElement branchTypeDropDown;
	private PageElement manualPartyCodeTextField;
	private PageElement markedAsOldDropDown;
	private PageElement licenseIssueDateFindButton;
	private PageElement licenseExpiryDateFindButton;

	private PageElement nextButton;
	private PageElement saveButton;
	private PageElement developmentOfficerPropnewTitle;
	private PageElement typeOfOfficerDropDown;
	private PageElement dOLStartDateTextField;

	public PartyPartyRolesBrokerageCommission(WebDriver driver, String pageName) {
		super(driver, pageName);
		brokerCommissionTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Brokerage Commission')]"),"Brokerage Commission Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle=new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Code")),"PartyCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Name")),"NameLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//--------------------------
		brokerLicenseNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Broker License No.')]/following::input"),"Broker License No. Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		panNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Pan Number')]/following::input"),"Pan Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		licenseIssueDateTextField= new PageElement(By.xpath("//td//div[contains(text(),'License Issue Date')]/following::input"),"License Issue Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		licenseExpiryDateTextField= new PageElement(By.xpath("//td//div[contains(text(),'License Expiry Date')]/following::input"),"License Expiry Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		manualPartyCodeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Manual Party Code')]/following::input"),"Manual Party Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		markedAsOldDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Marked as Old')]/following::select"),"Marked as Old Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		branchNameTextField= new PageElement(By.xpath("//td//div[contains(text(),'Branch Name')]/following::input"),"Branch Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		branchTypeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Branch Type')]/following::select"),"Branch Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partytreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		nextButton=new PageElement(By.name("Next"),"NextArrowButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("save"),"SaveButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		licenseIssueDateFindButton=new PageElement(By.xpath("//div[contains(text(),'License Issue Date')]/following::input/following::a[@name='firstFocus']"),"License Issue Date Find Button",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		licenseExpiryDateFindButton=new PageElement(By.xpath("//div[contains(text(),'License Expiry Date')]/following::input/following::a[@name='firstFocus']"),"License Expiry Date Find Button",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		developmentOfficerPropnewTitle=new PageElement(By.xpath("//b[contains(text(),'De')]"),"development officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfOfficerDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Officer')]/following::select"),"type of officer Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dOLStartDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'DOL Start Date')]/following::input"),"DOL Start Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}
	public void fillPartyPartyRolesBrokerageCommission(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity, CustomAssert assertReference)throws InterruptedException{
		if(partyRolBrokerCommiEntity.getAction().equalsIgnoreCase("add") || partyRolBrokerCommiEntity.getAction().equalsIgnoreCase("edit")){
			//------------------------
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigBrokerLicenseNo")) {
				clearAndSendKeys(brokerLicenseNoTextField, partyRolBrokerCommiEntity.getStringValueForField("BrokerLicenseNo"));
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigPanNo")) {
				String panNumber=RandomCodeGenerator.panNoGenerator();
				clearAndSendKeys(panNoTextField, panNumber);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigLicenseIssueDate")) {
				selectDateFromCalender(licenseIssueDateFindButton, partyRolBrokerCommiEntity.getStringValueForField("LicenseIssueDate"));
				switchToFrame("display");
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigLicenseExpiryDate")) {
				selectDateFromCalender(licenseExpiryDateFindButton, partyRolBrokerCommiEntity.getStringValueForField("LicenseExpiryDate"));
				switchToFrame("display");
			}

			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigManualPartyCode")) {
				clearAndSendKeys(manualPartyCodeTextField, partyRolBrokerCommiEntity.getStringValueForField("ManualPartyCode"));
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigMarkedAsOld")) {
				selectValueFromList(markedAsOldDropDown, partyRolBrokerCommiEntity.getStringValueForField("MarkedAsOld"));
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigBranchName")) {
				clearAndSendKeys(branchNameTextField, partyRolBrokerCommiEntity.getStringValueForField("BranchName"));
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigBranchType")) {
				selectValueFromList(branchTypeDropDown, partyRolBrokerCommiEntity.getStringValueForField("BranchType"));
			}

		}
		else if(partyRolBrokerCommiEntity.getAction().equalsIgnoreCase("verify")){

			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyRolBrokerCommiEntity.getStringValueForField("PartyCode"), fetchValueFromTextFields(partyCodeLabel), AssertionType.WARNING);
			}			
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyRolBrokerCommiEntity.getStringValueForField("PartyName"), fetchValueFromTextFields(partyNameLabel), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigBrokerLicenseNo")) {
				assertReference.assertEquals(partyRolBrokerCommiEntity.getStringValueForField("BrokerLicenseNo"), fetchValueFromTextFields(brokerLicenseNoTextField), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigBranchName")) {
				assertReference.assertEquals(partyRolBrokerCommiEntity.getStringValueForField("BranchName"), fetchValueFromTextFields(branchNameTextField), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigLicenseIssueDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyRolBrokerCommiEntity.getStringValueForField("LicenseIssueDate")) ,fetchValueFromTextFields(licenseIssueDateTextField), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigLicenseExpiryDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyRolBrokerCommiEntity.getStringValueForField("LicenseExpiryDate")) ,fetchValueFromTextFields(licenseExpiryDateTextField), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigTypeOfOfficer")) {
				assertReference.assertEquals(partyRolBrokerCommiEntity.getStringValueForField("TypeOfOfficer"), fetchValueFromList(typeOfOfficerDropDown), AssertionType.WARNING);
			}
			if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigDOLStartDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyRolBrokerCommiEntity.getStringValueForField("DOLStartDate")) ,fetchValueFromTextFields(dOLStartDateTextField), AssertionType.WARNING);

			}
		}
	}
	public void navigateToPartyTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}

	public void navigateToPartyRolesTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}

	public void navigateToContactTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}

	public void navigateToRelatedPratiesTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}

	public void navigateToFollowupTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	public void navigateToHierarchyTab(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity){
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partytreeTitle);
		}
	}
	public void clickToProceedButton(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity) {
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");

		}
	}
	public void saveBrokerCommiDetails(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity) {
		if (partyRolBrokerCommiEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void navigateToBrokerCommission(){
		switchToFrame("display");
		isElementDisplayed(brokerCommissionTitle);
	}
		public void navigateToDevelopmentOfficer(){
			switchToFrame("display");
			isElementDisplayed(developmentOfficerPropnewTitle);
		}
	public void fillandSubmitPartyPartyRolesBrokerageCommission(PartyRolBrokerCommiEntity partyRolBrokerCommiEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(partyRolBrokerCommiEntity.getConfigExecute())){
			switchToFrame("display");
			fillPartyPartyRolesBrokerageCommission(partyRolBrokerCommiEntity, assertReference);
			clickToProceedButton(partyRolBrokerCommiEntity);
			saveBrokerCommiDetails(partyRolBrokerCommiEntity);
			navigateToPartyTab(partyRolBrokerCommiEntity);
			navigateToPartyRolesTab(partyRolBrokerCommiEntity);
			navigateToContactTab(partyRolBrokerCommiEntity);
			navigateToRelatedPratiesTab(partyRolBrokerCommiEntity);
			navigateToFollowupTab(partyRolBrokerCommiEntity);

		}
	}

}


