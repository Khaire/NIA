package com.aqm.staf.library.pages.common;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.PolicyEntity;

public class Policy_RenewReasonPage extends BasePage {


	private PageElement effectiveDateTextField;
	//private PageElement migrationTypeDropdown;
	//private PageElement changeProposerDropdown;
	private PageElement reasonForInitiatingThisActionTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;

	public Policy_RenewReasonPage(WebDriver driver, String pageName) {
		super(driver, pageName);


		effectiveDateTextField= new PageElement(By.name("pEventEffectiveDate"), "Effective date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//migrationTypeDropdown= new PageElement(By.name("pMigrationProduct"), "Migration Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		//changeProposerDropdown= new PageElement(By.name("pProposerFlag"), "Proposer Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		reasonForInitiatingThisActionTextField= new PageElement(By.name("pNewRemark"), "Quote Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton= new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillRenewReasonDetails(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyEntity.getAction().equalsIgnoreCase("add")){

			if (policyEntity.getBooleanValueForField("ConfigEffectiveDate")) {
				clearAndSendKeys(effectiveDateTextField, policyEntity.getStringValueForField("EffectiveDate"));
			}
			if (policyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextField, policyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}

	public void submitRenewReasonDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;	
		}
	}

	public void backFromRenewReasonDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	
	public void fillandSubmitRenewReasonDetails(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillRenewReasonDetails(policyEntity,assertReference);
		submitRenewReasonDetails(policyEntity);
		backFromRenewReasonDetails(policyEntity);
		}
	

}
