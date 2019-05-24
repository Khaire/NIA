package com.aqm.staf.library.pages.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyLocationEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;


public class PartyLocationDetails extends BasePage {
	private PageElement locationDeatailTitle;
	private PageElement locationSearchTitle;
	private PageElement locationCodeTextFeild;
	private PageElement locationNameTextFeild;
	private PageElement typeOFLocationDropDownList;
	private PageElement parentLocationCodeTextFeild;
	private PageElement descriptionTextFeild;
	private PageElement saveButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement treeButton;

	private PageElement partySearchPageTitle;
	private PageElement maitainPartyLink;
	private PageElement locationLink;
	private PageElement maintainStakeholdersLink;
	private PageElement stakeHolderFunctionTitle;
	private PageElement partyProductMappingLink;

	private PageElement updateSurveyorContactLink;
	private PageElement surveyorContactUpdateRequeststitle;
	private PageElement helpLink;
	private PageElement locationTreeTitle;

	public PartyLocationDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		locationSearchTitle=new PageElement(By.xpath("//div//b[contains(text(),'Search')]"),"Location Search Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationTreeTitle=new PageElement(By.xpath("//form//b[contains(text(),'Tree')]"),"Location Tree Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationDeatailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Location Search Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationCodeTextFeild=new PageElement(By.name("pAreaCode"),"Location Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationLink = new PageElement(By.xpath("//a//b[contains(text(),'Location')]"),"Location Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationNameTextFeild=new PageElement(By.name("pAreaName"),"Location Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOFLocationDropDownList= new PageElement(By.name("pTypeOfArea"), "Type OF Location Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		parentLocationCodeTextFeild=new PageElement(By.name("pParentAreaCode"),"Parent Location Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextFeild=new PageElement(By.name("pDescription"),"Description TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"),"Save Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		clearButton=new PageElement(By.name("Clear"),"Clear Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		treeButton=new PageElement(By.name("Tree"),"Tree Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		maintainStakeholdersLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Stakeholders')]"), "Maintain Stakeholders Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stakeHolderFunctionTitle=new PageElement(By.xpath("//form//b[contains(text(),'Function')]"),"Stake Holder Function Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyProductMappingLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Product Mapping')]"), "Party Product Mapping Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		updateSurveyorContactLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Update Surveyor Contact')]"), "Update Surveyor Contact Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		surveyorContactUpdateRequeststitle=new PageElement(By.xpath("//form//b[contains(text(),'Surveyor Contact Update Requests')]"),"Stake Holder Function Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		helpLink = new PageElement(By.xpath("//td//a//b[contains(text(),'//td//a//b[contains(text(),'Help')]')]"), "Help Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	//Service

	public void navigateToPartySearchPage(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigMaintainPartyTab")) {
			click(maitainPartyLink);
			switchToFrame("display");
			if(isElementDisplayed(partySearchPageTitle));
			return;
		}
	}

	public void navigateToLocationSearchPage(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigLocation")) {
			switchToFrame("Control");
			click(locationLink);
			switchToFrame("display");
			if(isElementDisplayed(locationSearchTitle));
			return;
		}
	}
	public void navigateToStakeHolderFunctionPage(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigMaintainStakeholders")) {
			click(maintainStakeholdersLink);
			switchToFrame("display");
			if(isElementDisplayed(stakeHolderFunctionTitle));
			return;
		}
	}
	public void navigateToPartyProductMappingPage(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigPartyProductMapping")) {
			click(partyProductMappingLink);
			switchToFrame("display");
		}
	}
	public void navigateToUpdateSurveyorContactPage(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigUpdateSurveyorContact")) {
			click(updateSurveyorContactLink);
			switchToFrame("display");
			if(isElementDisplayed(surveyorContactUpdateRequeststitle));
			return;
		}
	}

	public void fillLocationDetails(PartyLocationEntity partyLocationEntity, CustomAssert assertReference){
		if(partyLocationEntity.getAction().equalsIgnoreCase("add") || partyLocationEntity.getAction().equalsIgnoreCase("edit")){

			if (partyLocationEntity.getBooleanValueForField("ConfigLocationCode")) {
				String locationCode=RandomCodeGenerator.getPinCode();
				clearAndSendKeys(locationCodeTextFeild, locationCode);
				partyLocationEntity.setStringValueForField("LocationCode", locationCode);
			}

			if (partyLocationEntity.getBooleanValueForField("ConfigLocationName")) {
				clearAndSendKeys(locationNameTextFeild, partyLocationEntity.getStringValueForField("LocationName"));
			}

			if (partyLocationEntity.getBooleanValueForField("ConfigTypeofLocation")) {
				selectValueFromList(typeOFLocationDropDownList, partyLocationEntity.getStringValueForField("TypeofLocation"));
			}
			if (partyLocationEntity.getBooleanValueForField("ConfigParentLocationCode")) {
				clearAndSendKeys(parentLocationCodeTextFeild, partyLocationEntity.getStringValueForField("ParentLocationCode"));
			}

			if (partyLocationEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextFeild, partyLocationEntity.getStringValueForField("DescriptionText"));
			}

		}

		else if(partyLocationEntity.getAction().equalsIgnoreCase("verify")){
			PartyLocationEntity actualPartyLocationEntity = new PartyLocationEntity();

			if (partyLocationEntity.getBooleanValueForField("ConfigLocationCode")) {
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("LocationCode"), fetchValueFromTextFields(locationCodeTextFeild), AssertionType.WARNING);
			}
			if (partyLocationEntity.getBooleanValueForField("ConfigLocationName")) {
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("LocationName"), fetchValueFromTextFields(locationNameTextFeild), AssertionType.WARNING);
			}
			if (partyLocationEntity.getBooleanValueForField("ConfigTypeofLocation")) {
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("TypeofLocation"), fetchValueFromList(typeOFLocationDropDownList), AssertionType.WARNING);
			}
			if (partyLocationEntity.getBooleanValueForField("ConfigParentLocationCode")) {
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("ParentLocationCode"), fetchValueFromTextFields(parentLocationCodeTextFeild), AssertionType.WARNING);
			}
			if (partyLocationEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("DescriptionText"), fetchValueFromTextFields(descriptionTextFeild), AssertionType.WARNING);
			}
		}
	}
	public void clearFromLocationSearch(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigClear")) {
			click(clearButton);
			if(isElementDisplayed(locationSearchTitle));
			return;
		}
	}
	public void backFromLocationSearch(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigBack")) {
			click(backButton);
			if(isElementDisplayed(locationSearchTitle));
			return;
		}
	}

	public void saveLocationDeatils(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigSave")) {
			click(saveButton);
			if(isElementDisplayed(locationDeatailTitle));
			return;
		}
	}


	public void treeButtonOnLocationDeatils(PartyLocationEntity partyLocationEntity) {
		if (partyLocationEntity.getBooleanValueForField("ConfigTree")) {
			click(treeButton);
			if(isElementDisplayed(locationTreeTitle));
			return;
		}
	}
	public void fillAndSubmitLocationDetails(PartyLocationEntity partyLocationEntity, CustomAssert assertReference)  {
		fillLocationDetails(partyLocationEntity, assertReference);
		saveLocationDeatils(partyLocationEntity);
		treeButtonOnLocationDeatils(partyLocationEntity);
		navigateToPartySearchPage(partyLocationEntity);
		navigateToLocationSearchPage(partyLocationEntity);
	}
}

