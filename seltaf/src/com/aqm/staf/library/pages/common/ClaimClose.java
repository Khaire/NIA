package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimCloseEntity;
import com.aqm.staf.library.databin.PartyCompleteEditEntity;

public class ClaimClose extends BasePage {
	
	private PageElement claimApprovalTypeDropdown;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimClose(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		claimApprovalTypeDropdown = new PageElement(By.xpath(locatorforPanel("Claim Approval Type", "select")),"Claim Approval Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		reasonForInitiatingThisActionTextArea = new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")),"Reason for initiating this action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}
	
	public void fillCloseClaimReasonWindow(ClaimCloseEntity claimCloseEntity, CustomAssert assertReference){
		if(claimCloseEntity.getAction().equalsIgnoreCase("add")){
			if (claimCloseEntity.getBooleanValueForField("ConfigClaimApprovalType")) {
				clearAndSendKeys(claimApprovalTypeDropdown, claimCloseEntity.getStringValueForField("ClaimApprovalType"));
			}
			
			if (claimCloseEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimCloseEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	
	public void saveCloseClaimWindow(ClaimCloseEntity claimCloseEntity) {
		if (claimCloseEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	
	public void backToMainPage(ClaimCloseEntity claimCloseEntity) {
		if (claimCloseEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	
	public void fillSaveAndBackDetails(ClaimCloseEntity claimCloseEntity, CustomAssert assertReference) {
		fillCloseClaimReasonWindow(claimCloseEntity, assertReference);
		saveCloseClaimWindow(claimCloseEntity);
		backToMainPage(claimCloseEntity);
	}

}
