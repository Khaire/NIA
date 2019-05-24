
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

public class PartyPartyRolesPartyFunctionDetails extends BasePage {

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
	private PageElement memberDOBTitle;
	private PageElement claimantPartyRuleTitle;
	private PageElement partyDetailsTitle;
	private PageElement partyTreeTitle;
	private PageElement partyContactTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partyFunctionsTitle;
	private PageElement surveyorOrganizationdetailsTitle;
	private PageElement nIAOrgPolicyHolderDetailsTitle;
	private PageElement brokerageCommissionTitle;
	private PageElement developmentOfficerPropnewTitle;
	private PageElement prospectiveAgentPartyRuleTitle;
	private PageElement surveyorTitle;

	 
	public PartyPartyRolesPartyFunctionDetails(WebDriver driver, String pageName) {
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
		surveyorOrganizationdetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Surveyor Organization')]"),"Surveyor Organization Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberDOBTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"),"Member DOB Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimantPartyRuleTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claimant')]"),"Claimant Party Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyTreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nIAOrgPolicyHolderDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Org')]"),"NIA Org Policy Holder Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		brokerageCommissionTitle= new PageElement(By.xpath("//b[contains(text(),'Bro')]"),"Brokerage Commission Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		developmentOfficerPropnewTitle=new PageElement(By.xpath("//b[contains(text(),'De')]"),"development officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		prospectiveAgentPartyRuleTitle=new PageElement(By.xpath("//b[contains(text(),'Prospective')]"),"Prospective Agent Party Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surveyorTitle=new PageElement(By.xpath("//b[contains(text(),'SURVEYOR')]"),"SURVEYOR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}

	public void fillPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity, CustomAssert assertReference){
		if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("add") || partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("edit")){
			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigFunction")) {
				clearAndSendKeys(functionTextField, partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField"));
			}
		}
		else if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
			}

			if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigFunction")) {
				assertReference.assertEquals(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField"), fetchValueFromTextFields(functionTextField), AssertionType.WARNING);
			}
		}
	}

	public void savePartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity) {
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
			if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("MEMBER") && partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equalsIgnoreCase("Individual")) {
				isElementDisplayed(memberDOBTitle);
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Individual")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("add")||partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("edit")){
					isElementDisplayed(claimantPartyRuleTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Organizational")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(surveyorOrganizationdetailsTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("POLICY-HOL")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Organizational")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(nIAOrgPolicyHolderDetailsTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("BROKER")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Individual")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(brokerageCommissionTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("DEVLP-OFF")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Individual")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(developmentOfficerPropnewTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("PAGENT")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Individual")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(prospectiveAgentPartyRuleTitle);
				}
			}
			else if(partyRolesFunctDetailsEntity.getStringValueForField("FunctionTextField").equalsIgnoreCase("SURVEYOR")&& partyRolesFunctDetailsEntity.getStringValueForField("PartyType").equals("Individual")){
				if(partyRolesFunctDetailsEntity.getAction().equalsIgnoreCase("verify")){
					isElementDisplayed(surveyorTitle);
				}
			}
		}
	}

	public void navigateToProceedPage(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(partyFunctionDetailsTitle);
		}
	}

	public void navigateToPartyTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyTab")){ 
			click(partyTitle);

			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}
	
	public void navigateToPartyRolesTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){		
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigPartyRolesTab")) {
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}
	
	public void navigateToContactsTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactTitle);
		}
	}
	
	public void navigateToRelatedPartiesTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){

		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}
	
	public void navigateToFollowupTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}
	
	public void navigateToHierarchyTab(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity){
		if (partyRolesFunctDetailsEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partyTreeTitle);
		}
	}

	public void fillAndSubmitPartyFunctionDetails(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntity,CustomAssert assertReference) {
		if (isConfigTrue (partyRolesFunctDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPartyFunctionDetails(partyRolesFunctDetailsEntity, assertReference);
			navigateToProceedPage(partyRolesFunctDetailsEntity);
			/*******Search Role Then Proceed**********/
			navigateToNextPage(partyRolesFunctDetailsEntity);
			/****************NaviGated to Next Page******************/
			navigateToPartyTab(partyRolesFunctDetailsEntity);
			navigateToPartyRolesTab(partyRolesFunctDetailsEntity);
			navigateToContactsTab(partyRolesFunctDetailsEntity);
			navigateToRelatedPartiesTab(partyRolesFunctDetailsEntity);
			navigateToFollowupTab(partyRolesFunctDetailsEntity);
			navigateToHierarchyTab(partyRolesFunctDetailsEntity);
			//navigateToNextPage(partyRolesFunctDetailsEntity);
			backFromPartyFunctionDetails(partyRolesFunctDetailsEntity);
		}
	}
}
