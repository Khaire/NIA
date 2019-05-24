
package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;

public class PartyPartyRolesPartyFunstionDetails extends BasePage {

	private PageElement partyFunctionDetailsTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement functionTextField;
	private PageElement saveButton;
	private PageElement nextButton;
	private PageElement backButton;
	private PageElement proceedButton;
	private PageElement nIAIndvPolicyHolderDetailsTitle;
	private PageElement partyDetailsTitle;
	private PageElement partyTreeTitle;
	private PageElement partyContactTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partyFunctionsTitle;

	public PartyPartyRolesPartyFunstionDetails(WebDriver driver, String pageName) {
		super(driver, pageName);

		partyFunctionDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Function Details')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle =new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel = new PageElement(By.xpath((genericLocatorforLabel("FunctionsDtl", "Code"))), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel = new PageElement(By.xpath((genericLocatorforLabel("FunctionsDtl", "Name"))), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		functionTextField = new PageElement(By.name("pFunctionCode"),"Function Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		nextButton = new PageElement(By.name("Next"),"Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		proceedButton = new PageElement(By.name("Proceed"),"Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		nIAIndvPolicyHolderDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Indv')]"),"NIA Indv Policy Holder Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}

	public void fillPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity, CustomAssert assertReference){
		if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("add") || partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("CofigFunction")) {
				clearAndSendKeys(functionTextField, partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField"));
			}
		}


		else if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
			PartyRolesFunctDetailsEntity actualFunctionDetailEntity = new PartyRolesFunctDetailsEntity();

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualFunctionDetailEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyCode"), actualFunctionDetailEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				actualFunctionDetailEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyName"), actualFunctionDetailEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("CofigFunction")) {
				actualFunctionDetailEntity.setStringValueForField("FunctionTextField", fetchValueFromTextFields(functionTextField));
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField"), actualFunctionDetailEntity.getStringValueForField("FunctionTextField"), AssertionType.WARNING);
			}

		}

	}

	public void submitPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}

	/*public void nextPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
		}
	}*/	
	public void backFromPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}


	public void navigateToNextPage(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			if(isElementDisplayed(nIAIndvPolicyHolderDetailsTitle));
			return;
		}
	}
	public void navigateToProceedPage(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			if(isElementDisplayed(partyFunctionDetailsTitle));
			return;
		}
	}

	public void navigateToPartyTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyTab")) {
			click(partyTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyDetailsTitle));
			return;
		}
	}
	public void navigateToPartyRolesTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){		
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyRolesTab")) {
			click(partyRolesTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyFunctionsTitle));
			return;
		}
	}
	public void navigateToContactsTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigContactTab")){
			click(contactsTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyContactTitle));
			return;
		}
	}
	public void navigateToRelatedPartiesTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyRelationsTitle));
			return;
		}
	}
	public void navigateToFollowupTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyFollowupListTitle));
			return;
		}
	}

	public void navigateToHierarchyTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			if(isElementDisplayed(partyTreeTitle));
			return;
		}
	}
	public void fillAndSubmitPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity,CustomAssert assertReference) {
		switchToFrame("display");
		fillPartyFunctionDetails(partyRolesFunctDetailsEntity, assertReference);
		navigateToPartyTab(partyRolesFunctDetailsEntity);
		navigateToPartyRolesTab(partyRolesFunctDetailsEntity);
		navigateToContactsTab(partyRolesFunctDetailsEntity);
		navigateToRelatedPartiesTab(partyRolesFunctDetailsEntity);
		navigateToFollowupTab(partyRolesFunctDetailsEntity);
		navigateToHierarchyTab(partyRolesFunctDetailsEntity);
		submitPartyFunctionDetails(partyRolesFunctDetailsEntity);
		navigateToNextPage(partyRolesFunctDetailsEntity);
		navigateToProceedPage(partyRolesFunctDetailsEntity);
		//backFromPartyFunctionDetails(partyRolesFunctDetailsEntity);

	}


}
