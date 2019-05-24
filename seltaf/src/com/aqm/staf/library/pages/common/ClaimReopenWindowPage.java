package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDisputedWindowEntity;
import com.aqm.staf.library.databin.ClaimReopenWindowEntity;

public class ClaimReopenWindowPage extends BasePage {
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimReopenWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}
	
	public void fillClaimReopenWindowDetails(ClaimReopenWindowEntity claimReopenWindowEntity, CustomAssert assertReference){
		if(claimReopenWindowEntity.getAction().equalsIgnoreCase("add")){
			if (claimReopenWindowEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimReopenWindowEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void saveClaimReopenWindowDetails(ClaimReopenWindowEntity claimReopenWindowEntity) {
		if (claimReopenWindowEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromClaimReopenWindowDetails(ClaimReopenWindowEntity claimReopenWindowEntity) {
		if (claimReopenWindowEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitClaimReopenWindowDetails(ClaimReopenWindowEntity claimReopenWindowEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimReopenWindowDetails(claimReopenWindowEntity, assertReference);
		saveClaimReopenWindowDetails(claimReopenWindowEntity);
		//backFromClaimReopenWindowDetails(claimReopenWindowEntity);
	}
}

