package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyFollowupDetailsEntity;
import com.aqm.staf.library.databin.PartyFollowupListEntity;
import com.aqm.staf.library.databin.PolicyFollowupEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;



public class PartyFollowupListPage extends BasePage{

	private PageElement partyFollowupListTitle;
	private PageElement PartyDetailsTitle;
	private PageElement PartyFunctionsTitle;
	private PageElement PartyContactsTitle;
	private PageElement PartyRelationsTitle;
	private PageElement PartyTreeTitle;
	private PageElement followupDetailsTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement newButton;
	private PageElement backButton;
	private PageElement followupOnSearchPage;

	//This page consists a Table too.

	public PartyFollowupListPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		PartyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"),"Party Relations Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'Tree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyFollowupList", "Party Code")), "Party Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyFollowupList", "Party Name")), "Party Name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton=new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 

	}

	public void navigateToParty(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigParty")) {
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(PartyDetailsTitle);
		}
	}

	public void navigateToPartyRoles(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigPartyRoles")) {
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(PartyFunctionsTitle);
		}
	}

	public void navigateToContacts(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigContacts")) {
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(PartyContactsTitle);
		}
	}

	public void navigateToRelatedParties(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigRelatedParties")) {
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(PartyRelationsTitle);
		}
	}

	public void navigateToFollowup(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigFollowup")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	public void navigateToHierarchy(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigHierarchy")) {
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(PartyTreeTitle);
		}
	}

	public void fillPartyFollowupListDetails(PartyFollowupListEntity partyFollowupListEntity, CustomAssert assertReference){
		if(partyFollowupListEntity.getAction().equalsIgnoreCase("verify")){
			if (partyFollowupListEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyFollowupListEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}
			if (partyFollowupListEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyFollowupListEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}
		}
	}

	public void createNewFollowupForParty(PartyFollowupDetailsEntity partyFollowupDetailsEntity){
		if (partyFollowupDetailsEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
			isElementDisplayed(followupDetailsTitle);
		}
	}

	public void backFromPartyFollowupList(PartyFollowupListEntity partyFollowupListEntity) {
		if (partyFollowupListEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(PartyDetailsTitle);
		}
	}

	public void fillPartyFollowupListDetailsAndBackFromPartyFollowupList(PartyFollowupListEntity partyFollowupListEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPartyFollowupListDetails(partyFollowupListEntity, assertReference);
		backFromPartyFollowupList(partyFollowupListEntity);
		navigateToParty(partyFollowupListEntity);
		navigateToPartyRoles(partyFollowupListEntity);
		navigateToContacts(partyFollowupListEntity);
		navigateToRelatedParties(partyFollowupListEntity);
		navigateToFollowup(partyFollowupListEntity);
		navigateToHierarchy(partyFollowupListEntity);
	}

}