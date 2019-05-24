package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyContactFrontPage;
import com.aqm.staf.library.databin.PartyContactsDetailsEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.PartyShowVersionListEntity;
import com.aqm.staf.library.databin.RelatedPartyDetailsEntity;

public class PartyContactsPage extends WebPage {
	private PageElement contactsDeatilTitle;
	private PageElement partyContactsTitle;
	private PageElement partyLink;
	private PageElement PartyFunctionsTitle;
	private PageElement PartyDetailsTitle;
	private PageElement partyRolesLink;
	private PageElement contactsLink;
	private PageElement PartyContactsTitle;
	private PageElement relatedPartiesLink;
	private PageElement PartyRelationsTitle;
	private PageElement followupLink;
	private PageElement partyFollowupListTitle;
	private PageElement hierarchylink;
	private PageElement PartyTreeTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement postallink;
	private PageElement permanentllink;
	private PageElement contactTypeLink;
	private PageElement backButton;
	private String contactType;

	public PartyContactsPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		partyContactsTitle =new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyLink=new PageElement(By.linkText("Party"), "Party Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRolesLink=new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"), "Party Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactsLink=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"), "Contact Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relatedPartiesLink=new PageElement(By.xpath("//div//b[contains(text(),'Related')]"), "Related Party Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"Party Relations Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupLink=new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "FollowUp Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hierarchylink=new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"), "Hierarchy Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("Contacthetail", "Code")), "Party Code  Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel= new PageElement(By.xpath(genericLocatorforLabel("Contacthetail", "Code")), "Party Code  Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactsDeatilTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Contacts')]"), "Party Contact DetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//  Table
		//contactTypeLink = new PageElement(By.name("pContactType"), "Contact Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		postallink=new PageElement(By.linkText("Postal"), "Postal Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		permanentllink=new PageElement(By.linkText("Parmanent"), "Parmanent Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	
	public void navigateToParty(){
		click(partyContactsTitle);
		isElementDisplayed(PartyDetailsTitle);
	}
	
	public void navigateToPartyRoles(){
		click(partyRolesLink);
		isElementDisplayed(PartyFunctionsTitle);
	}
	
	public void navigateToContacts(PartyContactsDetailsEntity partyContactsDetailsEntity)throws InterruptedException {
		if(partyContactsDetailsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsLink);
			switchToFrame("display");
			isElementDisplayed(PartyContactsTitle);
			Thread.sleep(1000);
		}
	}
	
	public void navigateToRelatedParties(){
		click(relatedPartiesLink);
		isElementDisplayed(PartyRelationsTitle);
	}
	
	public void navigateToFollowup(){
		click(followupLink);
		isElementDisplayed(partyFollowupListTitle);
	}
	
	public void navigateToHierarchy(){
		click(hierarchylink);
		isElementDisplayed(PartyTreeTitle);
	}

	public void fillPartyContactDetail(PartyContactsDetailsEntity partyContactsDetailsEntity, CustomAssert assertReference){
		if(partyContactsDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}

			if (partyContactsDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyContactsDetailsEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}
		}
	}
	
	public void selectConatctTypeAndnavigatePartyContactDeatail(PartyContactsDetailsEntity partyContactsDetailsEntity){
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigSearchContactType")){
			contactType=partyContactsDetailsEntity.getStringValueForField("ContactType");
			contactTypeLink=new PageElement(By.linkText(contactType), "Contact Type in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(contactTypeLink);
			switchToFrame("display");
		}
	}
	
	public void navigateToBackPageParty(PartyContactsDetailsEntity partyContactsDetailsEntity) {
		if (partyContactsDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void fillAndSubmitContactDetails(PartyContactsDetailsEntity partyContactsDetailsEntity, CustomAssert assertReference){
		switchToFrame("display");
		fillPartyContactDetail(partyContactsDetailsEntity, assertReference);
		navigateToBackPageParty(partyContactsDetailsEntity);
		//navigateToContacts(partyContactsDetailsEntity);
	}
}
