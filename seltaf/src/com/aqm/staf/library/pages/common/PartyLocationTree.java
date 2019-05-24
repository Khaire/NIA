package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyLocationEntity;

public class PartyLocationTree extends BasePage {
	private PageElement locationCodeTextFeild;
	private PageElement locationNameTextFeild;
	private PageElement typeOFLocationDropDownList;
	private PageElement backButton;
	private PageElement partySearchPageTitle;
	private PageElement maitainPartyLink;
	private PageElement locationLink;
	private PageElement maintainStakeholdersLink;
	private PageElement stakeHolderFunctionTitle;
	private PageElement partyProductMappingLink;
	private PageElement locationSearchTitle;
	private PageElement updateSurveyorContactLink;
	private PageElement surveyorContactUpdateRequeststitle;
	private PageElement helpLink;

	public PartyLocationTree(WebDriver driver, String pageName) {
		super(driver, pageName);
		locationCodeTextFeild=new PageElement(By.name("pAreaCode"),"Location Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationNameTextFeild=new PageElement(By.name("pAreaName"),"Location Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOFLocationDropDownList= new PageElement(By.name("pTypeOfArea"), "Type OF Location Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		locationSearchTitle=new PageElement(By.xpath("//div//b[contains(text(),'Search')]"),"Location Search Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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
		if(partyLocationEntity.getAction().equalsIgnoreCase("verify")){
			PartyLocationEntity actualPartyLocationEntity = new PartyLocationEntity();
			if (partyLocationEntity.getBooleanValueForField("ConfigLocationCode")) {
				actualPartyLocationEntity.setStringValueForField("LocationCode", fetchValueFromFields(locationCodeTextFeild));
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("LocationCode"), actualPartyLocationEntity.getStringValueForField("LocationCode"), AssertionType.WARNING);
			}

			if (partyLocationEntity.getBooleanValueForField("ConfigLocationName")) {
				actualPartyLocationEntity.setStringValueForField("LocationName", fetchValueFromFields(locationNameTextFeild));
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("LocationName"), actualPartyLocationEntity.getStringValueForField("LocationName"), AssertionType.WARNING);
			}

			if (partyLocationEntity.getBooleanValueForField("ConfigTypeofLocation")) {
				actualPartyLocationEntity.setStringValueForField("TypeofLocation", fetchValueFromFields(typeOFLocationDropDownList));
				assertReference.assertEquals(partyLocationEntity.getStringValueForField("TypeofLocation"), actualPartyLocationEntity.getStringValueForField("TypeofLocation"), AssertionType.WARNING);
			}
		}
	}
	public void fillAndSearchLocationTreeDetails(PartyLocationEntity partyLocationEntity, CustomAssert assertReference)  {
		fillLocationDetails(partyLocationEntity, assertReference);
		
		
	}
}
