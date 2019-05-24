package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyEntity;

public class Policy_IssueRenewedPolicyPage extends WebPage {
	
	private PageElement reasonForInitiatingThisActionTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;
	public Policy_IssueRenewedPolicyPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		reasonForInitiatingThisActionTextField= new PageElement(By.name("pNewRemark"), "Quote Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton= new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillIssueRenewReasonDetails(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyEntity.getAction().equalsIgnoreCase("add")){
			if (policyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextField, policyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}

	public void backFromIssueReasonDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;	
		}
	}

	public void submitIssueRenewReasonDetails(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	public void fillandSubmitIssueReasonDetail(PolicyEntity policyEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillIssueRenewReasonDetails(policyEntity,assertReference);
		submitIssueRenewReasonDetails(policyEntity);

	}

}
