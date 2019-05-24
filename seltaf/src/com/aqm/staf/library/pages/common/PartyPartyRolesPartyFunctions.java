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
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;

public class PartyPartyRolesPartyFunctions extends BasePage {
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
	private PageElement functionCodeOnSearchPage;
	private String functionCode;

	public PartyPartyRolesPartyFunctions(WebDriver driver, String pageName) {
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

	public void fillPartyRolesfunctions(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity, CustomAssert assertReference){
		if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
			PartyRolesFunctDetailsEntity actualPartyRolesFunctDetailsEntity=new PartyRolesFunctDetailsEntity();
			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualPartyRolesFunctDetailsEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyCode"), actualPartyRolesFunctDetailsEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}
			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				actualPartyRolesFunctDetailsEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyName"), actualPartyRolesFunctDetailsEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}
		}
	}

	public void navigateToParty(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitlePage);
		}
	}
	
	public void navigateToPartyRoles(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitlePage);
		}
	}
	
	public void navigateToContacts(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactTitlePage);
		}
	}
	
	public void navigateToRelatedParties(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitlePage);
		}
	}
	
	public void navigateToFollowup(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitlePage);
		}
	}
	
	public void navigateToHierarchy(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partyTreeTitlePage);
		}
	}
	
	public void createNewPartyRole (PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity ) throws InterruptedException{
		//if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigNewButton") || partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("add")){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			//Thread.sleep(2000);
			//isElementDisplayed(partyFunctionDetailsTitle);
		}
	}
	
	public void deleteFromPartyRolesFunction(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	
	public void backFromPartyRolesFunction(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void fillAndSubmitFromPartyRolesFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity, CustomAssert assertReference) {
		fillPartyRolesfunctions(partyRolesFunctDetailsEntity, assertReference);
		navigateToParty(partyRolesFunctDetailsEntity);
		navigateToPartyRoles(partyRolesFunctDetailsEntity);
		navigateToContacts(partyRolesFunctDetailsEntity);
		navigateToRelatedParties(partyRolesFunctDetailsEntity);
		navigateToFollowup(partyRolesFunctDetailsEntity);
		navigateToHierarchy(partyRolesFunctDetailsEntity);
		//	createNewPartyRole(PartyRolesFunctDetailsEntity);
		deleteFromPartyRolesFunction(partyRolesFunctDetailsEntity);
		backFromPartyRolesFunction(partyRolesFunctDetailsEntity);
	}
	
	public void selectFunctionCodeFromSearchPage(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigSearchFunctionCode") && ! partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("add")){
			functionCode=partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField");
			functionCodeOnSearchPage=new PageElement(By.linkText(functionCode), "Function Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(functionCodeOnSearchPage);
			switchToFrame("display");
		}
	}
}

