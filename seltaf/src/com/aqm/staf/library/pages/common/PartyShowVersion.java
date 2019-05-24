package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.PartyShowVersionListEntity;

public class PartyShowVersion extends BasePage {
	
	private PageElement partyVersionListTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;	
	private PageElement backButton;

	public PartyShowVersion(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		partyVersionListTitle = new PageElement(By.xpath("//b[contains(text(),'Version List')]"), "Party Version List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyVersionList", "Code")), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("PartyVersionList", "Name")), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//table
		
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPartyShowVersionDetails(PartyShowVersionListEntity partyShowVersionListEntity, CustomAssert assertReference){
		if(partyShowVersionListEntity.getAction().equalsIgnoreCase("verify")){
			PartyShowVersionListEntity actualVersionListEntity = new PartyShowVersionListEntity();
			
			if (partyShowVersionListEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualVersionListEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(partyShowVersionListEntity.getStringValueForField("PartyCode"), actualVersionListEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}
			
			if (partyShowVersionListEntity.getBooleanValueForField("ConfigPartyName")) {
				actualVersionListEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(partyShowVersionListEntity.getStringValueForField("PartyName"), actualVersionListEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}
			
		}
						
	}
	
	public void backFromPartyVersionWindow(PartyShowVersionListEntity partyShowVersionListEntity) {
		if (partyShowVersionListEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void fillAndSubmitPartyShowVersionDetails(PartyShowVersionListEntity partyShowVersionListEntity, CustomAssert assertReference){
		
		fillPartyShowVersionDetails(partyShowVersionListEntity, assertReference);
	//	backFromPartyVersionWindow(partyShowVersionListEntity);
	}
}
