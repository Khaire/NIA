package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RelatedPartyDetailsEntity;

public class PartyRelatedPartyDetailsPage extends BasePage{

	private PageElement relatedPartyDetailsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement PartyDetailsTitle;
	private PageElement PartyFunctionsTitle;
	private PageElement PartyContactsTitle;
	private PageElement PartyRelationsTitle;
	private PageElement PartyTreeTitle;

	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement functionTextField;
	private PageElement rltdPartyCodeTextField;
	private PageElement backButton;

	public PartyRelatedPartyDetailsPage(WebDriver driver,
			String pageName) {
		super(driver, pageName);
		relatedPartyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Related Party Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Party Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"Party Relations Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PartyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FunctionsDtl", "Party Code")), "Party Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("FunctionsDtl", "Party Name")), "Party Name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		functionTextField = new PageElement(By.name("pFunctionCode"), "Function TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rltdPartyCodeTextField = new PageElement(By.name("pRelatedPartyName"), "Rltd Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}



	public void navigateToParty(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigParty")) {
			click(partyTitle);
			switchToFrame("display");
			if(isElementDisplayed(PartyDetailsTitle));
			return;


		}
	}
	public void navigateToPartyRoles(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigPartyRoles")) {
			click(partyRolesTitle);
			switchToFrame("display");
			if(isElementDisplayed(PartyFunctionsTitle));
			return;
		}
	}
	public void navigateToContacts(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigContacts")) {
			click(contactsTitle);
			switchToFrame("display");
			if(isElementDisplayed(PartyContactsTitle));
			return;

		}
	}
	public void navigateToRelatedParties(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigRelatedParties")) {
			click(relatedPartiesTitle);
			switchToFrame("display");
			if(isElementDisplayed(PartyRelationsTitle));
			return;
		}
	}
	public void navigateToFollowup(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigFollowup")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyFollowupListTitle));
			return;
		}
	}
	public void navigateToHierarchy(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigHierarchy")) {
			click(hierarchyTitle);
			switchToFrame("display");
			if(isElementDisplayed(PartyTreeTitle));
			return;
		}
	}

	/*
	public void navigateToParty(){
		click(partyTitle);
		switchToFrame("display");
		if(isElementDisplayed(PartyDetailsTitle));
		return;
	}
	public void navigateToPartyRoles(){
		click(partyRolesTitle);
		switchToFrame("display");
		if(isElementDisplayed(PartyFunctionsTitle));
		return;
	}
	public void navigateToContacts(){
		click(contactsTitle);
		switchToFrame("display");
		if(isElementDisplayed(PartyContactsTitle));
		return;
	}
	public void navigateToRelatedParties(){
		click(relatedPartiesTitle);
		switchToFrame("display");
		if(isElementDisplayed(PartyRelationsTitle));
		return;
	}
	public void navigateToFollowup(){
		click(followupTitle);
		switchToFrame("display");
		if(isElementDisplayed(partyFollowupListTitle));
		return;
	}
	public void navigateToHierarchy(){
		click(hierarchyTitle);
		switchToFrame("display");
		if(isElementDisplayed(PartyTreeTitle));
		return;
	}

	 */

	public void fillRelatedPartyDetails(RelatedPartyDetailsEntity relatedPartyDetailsEntity, CustomAssert assertReference){
		/*if(relatedPartyDetailsEntity.getAction().equalsIgnoreCase("add") || relatedPartyDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigFunction")) {
				String function=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(functionTextField,function);
			}
			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigRltdPartyCode")) {
				String rltdPartyCode=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(rltdPartyCodeTextField,rltdPartyCode);
			}

		}
      else */
		if(relatedPartyDetailsEntity.getAction().equalsIgnoreCase("verify")){
			RelatedPartyDetailsEntity actualRelatedPartyDetailsEntity=new RelatedPartyDetailsEntity();
			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualRelatedPartyDetailsEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(relatedPartyDetailsEntity.getStringValueForField("PartyCode"), actualRelatedPartyDetailsEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}
			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				actualRelatedPartyDetailsEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(relatedPartyDetailsEntity.getStringValueForField("PartyName"), actualRelatedPartyDetailsEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}
			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigFunction")) {
				actualRelatedPartyDetailsEntity.setStringValueForField("FunctionTextField", fetchValueFromTextFields(functionTextField));
				assertReference.assertEquals(relatedPartyDetailsEntity.getStringValueForField("FunctionTextField"), actualRelatedPartyDetailsEntity.getStringValueForField("FunctionTextField"), AssertionType.WARNING);
			}
			if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigRltdPartyCode")) {
				actualRelatedPartyDetailsEntity.setStringValueForField("RltdPartyCode", fetchValueFromTextFields(rltdPartyCodeTextField));
				assertReference.assertEquals(relatedPartyDetailsEntity.getStringValueForField("RltdPartyCode"), actualRelatedPartyDetailsEntity.getStringValueForField("RltdPartyCode"), AssertionType.WARNING);
			}
		}
	}

	public void backFromRelatedPartyDetails(RelatedPartyDetailsEntity relatedPartyDetailsEntity) {
		if (relatedPartyDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(PartyRelationsTitle));
			return;
		}
	}

	public void fillAndSubmitRelatedPartyDetails(RelatedPartyDetailsEntity relatedPartyDetailsEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillRelatedPartyDetails(relatedPartyDetailsEntity, assertReference);
		navigateToParty(relatedPartyDetailsEntity);
		navigateToPartyRoles(relatedPartyDetailsEntity);
		navigateToContacts(relatedPartyDetailsEntity);
		navigateToRelatedParties(relatedPartyDetailsEntity);
		navigateToFollowup(relatedPartyDetailsEntity);
		navigateToHierarchy(relatedPartyDetailsEntity);

	}
}	
















