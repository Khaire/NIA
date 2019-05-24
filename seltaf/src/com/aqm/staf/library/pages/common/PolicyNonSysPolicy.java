package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyCompleteEditEntity;
import com.aqm.staf.library.databin.PolicyNonSysPolicyEntity;

public class PolicyNonSysPolicy extends BasePage {
	
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;

	public PolicyNonSysPolicy(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForInitiatingThisActionTextArea = new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")),"Reason for initiating this action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillReasonWindow(PolicyNonSysPolicyEntity policyNonSysPolicyEntity, CustomAssert assertReference){
		if(policyNonSysPolicyEntity.getAction().equalsIgnoreCase("add")){
			if (policyNonSysPolicyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, policyNonSysPolicyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	
	public void saveWindow(PolicyNonSysPolicyEntity policyNonSysPolicyEntity) {
		if (policyNonSysPolicyEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}
	
	public void backCompleteEditWindow(PolicyNonSysPolicyEntity policyNonSysPolicyEntity) {
		if (policyNonSysPolicyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}
	
	public void fillAndSubmitDetails(PolicyNonSysPolicyEntity policyNonSysPolicyEntity, CustomAssert assertReference) {
		fillReasonWindow(policyNonSysPolicyEntity, assertReference);
		saveWindow(policyNonSysPolicyEntity);
		backCompleteEditWindow(policyNonSysPolicyEntity);
	}
	
	
}
