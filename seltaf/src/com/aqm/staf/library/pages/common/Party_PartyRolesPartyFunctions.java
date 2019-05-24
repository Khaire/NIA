package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEditReasonEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctionsEntity;

public class Party_PartyRolesPartyFunctions extends BasePage {
	private PageElement partyFunctionsTitlePage;
	private PageElement partyFunctionDetailsTitle;
	private PageElement partyTitle;
	private PageElement partyDetailsTitlePage;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement partyContactTitlePage;
	private PageElement relatedPartiesTitle;
	private PageElement partyRelationsTitlePage;
	private PageElement followupTitle;
	private PageElement partyFollowupListTitlePage;
	private PageElement hierarchyTitle;
	private PageElement partyTreeTitlePage;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement newButton;
	private PageElement deleteButton;
	private PageElement backButton;

	public Party_PartyRolesPartyFunctions(WebDriver driver, String pageName) {
		super(driver, pageName);
		partyFunctionsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"),"Party Functions Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Function Details')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRolesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyContactTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related Parties')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRelationsTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyFollowupListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'PartyFollowup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyTreeTitlePage = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyFunctionList", "Code")),"Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyFunctionList", "Name")),"Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//TABLE//
		newButton = new PageElement(By.name("New"),"New Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("Delete"),"Delete Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void partyRolesfunctions(PartyRolesFunctionsEntity partyRolesFunctionsEntity, CustomAssert assertReference){
		if(partyRolesFunctionsEntity.getAction().equalsIgnoreCase("verify")){
			PartyRolesFunctionsEntity actualPartyRolesFunctionsEntity=new PartyRolesFunctionsEntity();
			if (partyRolesFunctionsEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualPartyRolesFunctionsEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(partyRolesFunctionsEntity.getStringValueForField("PartyCode"), actualPartyRolesFunctionsEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}
			if (partyRolesFunctionsEntity.getBooleanValueForField("ConfigPartyName")) {
				actualPartyRolesFunctionsEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(partyRolesFunctionsEntity.getStringValueForField("PartyName"), actualPartyRolesFunctionsEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}
		}
	}

	public void navigateToParty(){
		click(partyTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyDetailsTitlePage));
		return;
	}
	public void navigateToPartyRoles(){
		click(partyRolesTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyFunctionsTitlePage));
		return;
	}
	public void navigateToContacts(){
		click(contactsTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyContactTitlePage));
		return;
	}
	public void navigateToRelatedParties(){
		click(relatedPartiesTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyRelationsTitlePage));
		return;
	}
	public void navigateToFollowup(){
		click(followupTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyFollowupListTitlePage));
		return;
	}
	public void navigateToHierarchy(){
		click(hierarchyTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyTreeTitlePage));
		return;
	}
	public void createNewPartyRoles(PartyRolesFunctionsEntity partyRolesFunctionsEntity){
		if(partyRolesFunctionsEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(partyFunctionDetailsTitle));
			return;
		}
	}
	public void deleteFromEditWindowDetails(PartyRolesFunctionsEntity partyRolesFunctionsEntity) {
		if (partyRolesFunctionsEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	public void backFrompartyRolesfunctions(PartyRolesFunctionsEntity partyRolesFunctionsEntity) {
		if (partyRolesFunctionsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void viewAndBackFromPartyRolesFunctionDetails(PartyRolesFunctionsEntity partyRolesFunctionsEntity, CustomAssert assertReference) {
		partyRolesfunctions(partyRolesFunctionsEntity, assertReference);
		createNewPartyRoles(partyRolesFunctionsEntity);
		deleteFromEditWindowDetails(partyRolesFunctionsEntity);
		backFrompartyRolesfunctions(partyRolesFunctionsEntity);
	}
}

