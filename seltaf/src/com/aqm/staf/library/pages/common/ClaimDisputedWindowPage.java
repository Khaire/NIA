package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDisputedWindowEntity;
import com.aqm.staf.library.databin.PolicyRejectAlterationEntity;

public class ClaimDisputedWindowPage extends BasePage {
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimDisputedWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	//SERVICES//
	public void fillClaimDisputedWindowDetails(ClaimDisputedWindowEntity claimDisputedWindowEntity, CustomAssert assertReference){
		if(claimDisputedWindowEntity.getAction().equalsIgnoreCase("add")){
			if (claimDisputedWindowEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimDisputedWindowEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void saveClaimDisputedWindowDetails(ClaimDisputedWindowEntity claimDisputedWindowEntity) {
		if (claimDisputedWindowEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromClaimDisputedWindowDetails(ClaimDisputedWindowEntity claimDisputedWindowEntity) {
		if (claimDisputedWindowEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitPolicyRejectAlterationDetails(ClaimDisputedWindowEntity claimDisputedWindowEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimDisputedWindowDetails(claimDisputedWindowEntity, assertReference);
		saveClaimDisputedWindowDetails(claimDisputedWindowEntity);
		//backFromClaimDisputedWindowDetails(claimDisputedWindowEntity);
	}
}
