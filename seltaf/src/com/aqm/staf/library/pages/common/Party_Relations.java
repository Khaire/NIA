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
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;

public class Party_Relations extends BasePage {
	private PageElement partyRelationsTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	// Table pFunctionCode pPptPartyCode
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelations1Title;
	private PageElement partyFollowupListTitle;
	private PageElement partytreeTitle;
	private PageElement newButton;
	private PageElement relationOnSearchPage;
	private PageElement relationsBranchTextField;
	private PageElement partyCodeBranchTextField;


	public Party_Relations(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle=new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("RelatedPartyListNew","Code")),"CodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel=new PageElement(By.xpath(genericLocatorforLabel("RelatedPartyListNew","Name")),"NameLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table pFunctionCode pPptPartyCode
		saveButton=new PageElement(By.name("Save"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelations1Title=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partytreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton=new PageElement(By.xpath("//input[@name='New']"), "New Button", true, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		relationsBranchTextField = new PageElement(By.name("pFunctionCode"), "Relations Branch Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeBranchTextField  = new PageElement(By.name("pPptPartyCode"), "Party Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	//services

	public void navigateToPartyTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}
	
	public void navigateToPartyRolesTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}
	
	public void navigateToContactTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}
	
	public void navigateToRelatedPratiesTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}
	
	public void navigateToFollowupTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void navigateToHierarchyTab(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partytreeTitle);
		}
	}

	public void fillPartyRelations(RelatedPartyRelationsEntity relatedPartyRelationsEntity, CustomAssert assertReference){
		if (isConfigTrue(relatedPartyRelationsEntity.getConfigExecute())){
			if(relatedPartyRelationsEntity.getAction().equalsIgnoreCase("verify")||relatedPartyRelationsEntity.getAction().equalsIgnoreCase("edit")){
				if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(relatedPartyRelationsEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
				}
				if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigPartyName")) {
					assertReference.assertEquals(relatedPartyRelationsEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
				}
			}
		}
	}
	
	
	public void fillPartyRelationsDetails(RelatedPartyRelationsEntity relatedPartyRelationsEntity, CustomAssert assertReference){
		if (isConfigTrue(relatedPartyRelationsEntity.getConfigExecute())){
			if(relatedPartyRelationsEntity.getAction().equalsIgnoreCase("add")){
				if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigRelationsBranch")) {
					clearAndSendKeys(relationsBranchTextField, relatedPartyRelationsEntity.getStringValueForField("RelationsBranch"));
				}
				if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigPartyCodeBranch")) {
					clearAndSendKeys(partyCodeBranchTextField, relatedPartyRelationsEntity.getStringValueForField("PartyCodeBranch"));
				}
			}
		}
	}
	
	// SAVE ND BACK BUTTON
	public void saveClaimDetails(RelatedPartyRelationsEntity RelatedPartyRelationsEntity) {
		if (RelatedPartyRelationsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void showClaimListDetails(RelatedPartyRelationsEntity RelatedPartyRelationsEntity) {
		if (RelatedPartyRelationsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");

		}
	}
	
	public void fillandSearchPartyDetails(RelatedPartyRelationsEntity RelatedPartyRelationsEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillPartyRelations(RelatedPartyRelationsEntity, assertReference);
		fillPartyRelationsDetails(RelatedPartyRelationsEntity, assertReference);
		saveClaimDetails(RelatedPartyRelationsEntity);
		showClaimListDetails(RelatedPartyRelationsEntity);
		navigateToPartyTab(RelatedPartyRelationsEntity);
		navigateToPartyRolesTab(RelatedPartyRelationsEntity);
		navigateToContactTab(RelatedPartyRelationsEntity);
		navigateToRelatedPratiesTab(RelatedPartyRelationsEntity);
		navigateToFollowupTab(RelatedPartyRelationsEntity);
		navigateToHierarchyTab(RelatedPartyRelationsEntity);
	}
	
	public void createNewPartyRelation(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		//if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigNewButton")||relatedPartyRelationsEntity.getAction().equalsIgnoreCase("add")) {
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}

	public void selectRealtionFromSearchPage(RelatedPartyRelationsEntity relatedPartyRelationsEntity){
		if (relatedPartyRelationsEntity.getBooleanValueForField("ConfigSearchRelation")||! relatedPartyRelationsEntity.getAction().equalsIgnoreCase("add")){
			String relation=relatedPartyRelationsEntity.getStringValueForField("Relation");
			relationOnSearchPage=new PageElement(By.linkText(relation), "Relation Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(relationOnSearchPage);
			switchToFrame("display");
			isElementDisplayed(relatedPartiesTitle);
		}
	}
}



