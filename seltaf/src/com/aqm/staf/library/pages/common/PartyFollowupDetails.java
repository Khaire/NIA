package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
//import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.library.databin.PartyFollowupDetailsEntity;


public class PartyFollowupDetails extends BasePage {
	private PageElement followupDetailsPageTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement followupDateTextField;
	private PageElement followupTimeTextField;
	private PageElement assignedToTextField;
	private PageElement assignedByLabel;
	private PageElement eventCodeTextField;
	private PageElement jobStatusLabel; 
	private PageElement keywordTextField;
	private PageElement priorityDropDown;
	private PageElement eventEffectiveDateLabel; 
	private PageElement followupDescriptionTextArea;
	private PageElement saveButton;
	private PageElement cancelButton;
	private PageElement backButton;

	// party home links
	private PageElement partyTab;
	private PageElement partyRolesTab;
	private PageElement contactsTab;
	private PageElement relatedPartiesTab;
	private PageElement followupTab;
	private PageElement hierarchyTab;

	// for Tab Links 
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partyTreeTitle;
	
	private PageElement newButton;

	public PartyFollowupDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		followupDetailsPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Followup Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FollowupDetail", "Code")),"Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("FollowupDetail", "Name")),"Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupDateTextField = new PageElement(By.name("PFOLLOWUPDATE"),"Followup Date Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupTimeTextField = new PageElement(By.name("pFollowupTime"),"Followup Time Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assignedToTextField = new PageElement(By.name("pAssignedPersonal"),"Assigned To Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assignedByLabel = new PageElement(By.xpath(genericLocatorforLabel("FollowupDetail", "By")),"Assigned By Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		eventCodeTextField = new PageElement(By.xpath("//td//b[contains(text(),'EventCode')]/following::input"),"EventCode Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		jobStatusLabel = new PageElement(By.xpath("//td//b[contains(text(),'Job Status')]/following::td/b"),"Job Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		keywordTextField = new PageElement(By.name("pKeyword"),"Keyword Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		priorityDropDown = new PageElement(By.name("pPriority"),"Priority Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		eventEffectiveDateLabel = new PageElement(By.xpath(genericLocatorforLabel("FollowupDetail", "EventEffective Date")),"Event Effective Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupDescriptionTextArea = new PageElement(By.name("pFollowupDescr"),"Followup Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cancelButton = new PageElement(By.name("Cancel"),"Cancel Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		// party home links
		partyTab = new PageElement(By.xpath("//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTab = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTab = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTab = new PageElement(By.xpath("//div//b[contains(text(),'Related Parties')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTab =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		// links and title pending to add  in party Followup.
		partyDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'Party')]"),"Party Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionsTitle= new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"),"Party Functions Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyContactsTitle= new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]")," Contacts Title Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyRelationsTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"),"Relations Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle= new PageElement(By.xpath("//div//b[contains(text(),'List')]"),"Followup List Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTreeTitle= new PageElement(By.xpath("//div//b[contains(text(),'PartyTree')]"),"PartyTree Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		newButton= new PageElement(By.name("New"),"New Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}

	public void fillPartyFollowupDetails(PartyFollowupDetailsEntity partyFollowupDetailsEntity, CustomAssert assertReference){
		if(partyFollowupDetailsEntity.getAction().equalsIgnoreCase("add") || partyFollowupDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupDate")) {
				String followupDate=RandomCodeGenerator.dateGenerator(partyFollowupDetailsEntity.getStringValueForField("FollowupDate"));
				clearAndEnterDate(followupDateTextField, followupDate);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigAssignedTo")) {
				String assignedTo=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(assignedToTextField, assignedTo);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigKeyword")) {
				String keyword=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(keywordTextField, keyword);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPriority")) {
				selectValueFromList(priorityDropDown, partyFollowupDetailsEntity.getStringValueForField("Priority"));
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupDescription")) {
				String followupDescription=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(followupDescriptionTextArea, followupDescription);
			}
		}
		else if(partyFollowupDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("PartyCode"), fetchValueFromTextFields(partyCodeLabel), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("PartyName"), fetchValueFromTextFields(partyNameLabel), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(partyFollowupDetailsEntity.getStringValueForField("FollowupDate")), fetchValueFromTextFields(followupDateTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupTime")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("FollowupTime"), fetchValueFromTextFields(followupDateTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigAssignedTo")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("AssignedTo"), fetchValueFromTextFields(assignedToTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigAssignedBy")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("AssignedBy"), fetchValueFromTextFields(followupDateTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigEventCode")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("EventCode"), fetchValueFromTextFields(eventCodeTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigJobStatus")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("JobStatus"), fetchValueFromFields(jobStatusLabel), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigKeyword")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("Keyword"), fetchValueFromTextFields(keywordTextField), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPriority")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("Priority"), fetchValueFromTextFields(priorityDropDown), AssertionType.WARNING);
			}		
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("EffectiveDate"), fetchValueFromTextFields(eventEffectiveDateLabel), AssertionType.WARNING);
			}
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupDescription")) {
				assertReference.assertEquals(partyFollowupDetailsEntity.getStringValueForField("FollowupDescription"), fetchValueFromTextFields(followupDescriptionTextArea), AssertionType.WARNING);
			}	
		}
	}

	public void submitPartyFollowpDetails(PartyFollowupDetailsEntity partyFollowupDetailsEntity) {
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void cancelPartyFollowpDetails(PartyFollowupDetailsEntity partyFollowupDetailsEntity) {
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigCancelButton")) {
			click(cancelButton);
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void backFromPartyFollowpDetails(PartyFollowupDetailsEntity partyFollowupDetailsEntity) {
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	// Navigate To
	public void navigateToParty(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTab);
			isElementDisplayed(partyDetailsTitle);
		}
	}
	
	public void navigateToPartyRoles(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTab);
			isElementDisplayed(partyFunctionsTitle);
		}
	}
	
	public void navigateToContacts(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTab);
			isElementDisplayed(partyContactsTitle);
		}
	}

	public void navigateToRelatedParties(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTab);
			isElementDisplayed(partyRelationsTitle);
		}
	}
	
	public void navigateToFollowup(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void navigateToHierarchy(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTab);
			isElementDisplayed(partyTreeTitle);
		}
	}
	
	//Abhijit
	private void selectFollowUpFromSearchPage(PartyFollowupDetailsEntity partyFollowupDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(partyFollowupDetailsEntity.getAction().equalsIgnoreCase("verify")){
			int tableRowNumber = partyFollowupDetailsEntity.getIntegerValueForField("TableRowNumber");
			String date =RandomCodeGenerator.dateGenerator(partyFollowupDetailsEntity.getStringValueForField("SearchDate"));
			if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigSearchDate")) {
				PageElement	searchDate = new PageElement(By.xpath("//tr["+tableRowNumber+"]//td//a//div[contains(text(),'"+date+"')]"), "Search Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				click(searchDate);
			}
		}
	}
	
	
	public void newPartyFollowpDetails(PartyFollowupDetailsEntity partyFollowupDetailsEntity) {
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
		}
	}

	public void fillandSubmitFollowupDetails (PartyFollowupDetailsEntity partyFollowupDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(partyFollowupDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			newPartyFollowpDetails(partyFollowupDetailsEntity);
			selectFollowUpFromSearchPage(partyFollowupDetailsEntity,assertReference);
			fillPartyFollowupDetails(partyFollowupDetailsEntity, assertReference);
			submitPartyFollowpDetails(partyFollowupDetailsEntity);
			cancelPartyFollowpDetails(partyFollowupDetailsEntity);
			backFromPartyFollowpDetails(partyFollowupDetailsEntity);
			navigateToParty(partyFollowupDetailsEntity);
			navigateToPartyRoles(partyFollowupDetailsEntity);
			navigateToContacts(partyFollowupDetailsEntity);
			navigateToRelatedParties(partyFollowupDetailsEntity);
			navigateToFollowup(partyFollowupDetailsEntity);
			navigateToHierarchy(partyFollowupDetailsEntity);
		}
	}
}
