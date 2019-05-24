package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyLocationEntity;


public class PartyLocationSearch extends BasePage{
	private PageElement locationSearchTitle;
	private PageElement locationDeatailTitle;
	private PageElement locationCodeTextFeild;
	private PageElement locationNameTextFeild;
	private PageElement typeOFLocationDropDownList;
	private PageElement parentLocationCodeTextFeild;
	private PageElement parentLocationNameTextFeild;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement clearButton;
	private PageElement backButton;

	private PageElement partySearchPageTitle;
	private PageElement maitainPartyLink;
	private PageElement locationLink;
	private PageElement maintainStakeholdersLink;
	private PageElement stakeHolderFunctionTitle;
	private PageElement partyProductMappingLink;

	private PageElement updateSurveyorContactLink;
	private PageElement surveyorContactUpdateRequeststitle;
	private PageElement helpLink;
	private PageElement locationCodeLinkTextField;
	private String locationCode;	

	public PartyLocationSearch(WebDriver driver, String pageName) {
		super(driver, pageName);
		locationSearchTitle=new PageElement(By.xpath("//div//b[contains(text(),'Search')]"),"Location Search Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partySearchPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Search')]"),"Party Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maitainPartyLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Party')]"),"Maintain Party Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationLink = new PageElement(By.xpath("//a//b[contains(text(),'Location')]"),"Location Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationDeatailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Location Search Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationCodeTextFeild=new PageElement(By.name("pAreaCode"),"Location Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationNameTextFeild=new PageElement(By.name("pAreaName"),"Location Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOFLocationDropDownList= new PageElement(By.name("pTypeOfArea"), "Type OF Location Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		parentLocationCodeTextFeild=new PageElement(By.name("pParentAreaCode"),"Parent Location CodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		parentLocationNameTextFeild=new PageElement(By.name("pParentAreaName"),"Parent Location Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchButton=new PageElement(By.name("Search"),"Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		newButton=new PageElement(By.name("New"),"New Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		clearButton=new PageElement(By.name("Clear"),"Clear Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		maintainStakeholdersLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Stakeholders')]"), "Maintain Stakeholders Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stakeHolderFunctionTitle=new PageElement(By.xpath("//form//b[contains(text(),'Function')]"),"Stake Holder Function Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyProductMappingLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Product Mapping')]"), "Party Product Mapping Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		updateSurveyorContactLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Update Surveyor Contact')]"), "Update Surveyor Contact Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		surveyorContactUpdateRequeststitle=new PageElement(By.xpath("//form//b[contains(text(),'Surveyor Contact Update Requests')]"),"Stake Holder Function Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		helpLink = new PageElement(By.xpath("//td//a//b[contains(text(),'//td//a//b[contains(text(),'Help')]')]"), "Help Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	//Services

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

	public void navigateToLocationDetailsPage(){
		switchToFrame("display");
		if(isElementDisplayed(locationDeatailTitle));
		return;
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
	public void selectSearchLocationCode(PartyLocationEntity partyLocationEntity){
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchLocationCode")){
			locationCode=partyLocationEntity.getStringValueForField("LocationCode");
			locationCodeLinkTextField=new PageElement(By.linkText(locationCode), "Location Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(locationCodeLinkTextField);
			switchToFrame("display");
		}
	}

	public void fillLocationSerachDetails(PartyLocationEntity partyLocationEntity, CustomAssert assertReference){
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchLocationCode")) {
			clearAndSendKeys(locationCodeTextFeild, partyLocationEntity.getStringValueForField("LocationCode"));
		}
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchLocationName")) {
			clearAndSendKeys(locationNameTextFeild, partyLocationEntity.getStringValueForField("LocationName"));
		}
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchTypeofLocation")) {
			clearAndSendKeys(typeOFLocationDropDownList, partyLocationEntity.getStringValueForField("TypeofLocation"));
		}
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchParentLocationCode")) {
			clearAndSendKeys(parentLocationCodeTextFeild, partyLocationEntity.getStringValueForField("ParentLocationCode"));
		}
		if (partyLocationEntity.getBooleanValueForField("ConfigSearchParentLocationName")) {
			clearAndSendKeys(parentLocationNameTextFeild, partyLocationEntity.getStringValueForField("ParentLocationName"));
		}
	}

	public void fetchPartyLocationCode(PartyLocationEntity partyLocationEntity) {
		String partyLocationcode=new String();
		partyLocationcode=fetchValueFromTextFields(locationCodeTextFeild);
		partyLocationEntity.setStringValueForField("LocationCode", partyLocationcode);
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

	public void createNewLocationDeatils(PartyLocationEntity partyLocationEntity) {
		switchToFrame("display");
		click(newButton);
		if(isElementDisplayed(locationDeatailTitle));
		return;
	}

	public void clickSearch() {
		click(searchButton);
	}

	public void fillAndSearchLocationDetails(PartyLocationEntity partyLocationEntity, CustomAssert assertReference)  {
		fillLocationSerachDetails(partyLocationEntity, assertReference);
		clickSearch();
	}

}