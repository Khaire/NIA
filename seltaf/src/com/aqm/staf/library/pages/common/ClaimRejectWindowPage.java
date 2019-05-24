package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDisputedWindowEntity;
import com.aqm.staf.library.databin.ClaimRejectWindowEntity;

public class ClaimRejectWindowPage extends BasePage {
	private PageElement rejectionReasonDropdown;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;
	
	public ClaimRejectWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		rejectionReasonDropdown = new PageElement(By.name("pClmRejReason"),"Rejection Reason Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"), "Reason For Initiating This Action Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}
	public void fillClaimRejectWindowDetails(ClaimRejectWindowEntity claimRejectWindowEntity, CustomAssert assertReference){
		if(claimRejectWindowEntity.getAction().equalsIgnoreCase("add")){
			if (claimRejectWindowEntity.getBooleanValueForField("ConfigRejectionReasonDropDown")) {
				selectValueFromList(rejectionReasonDropdown, claimRejectWindowEntity.getStringValueForField("RejectionReasonDropDown"));
			}
			if (claimRejectWindowEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimRejectWindowEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void saveClaimRejectWindowDetails(ClaimRejectWindowEntity claimRejectWindowEntity) {
		if (claimRejectWindowEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromClaimRejectWindowDetails(ClaimRejectWindowEntity claimRejectWindowEntity) {
		if (claimRejectWindowEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitPolicyRejectAlterationDetails(ClaimRejectWindowEntity claimRejectWindowEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimRejectWindowDetails(claimRejectWindowEntity, assertReference);
		saveClaimRejectWindowDetails(claimRejectWindowEntity);
		//backFromClaimRejectWindowDetails(claimRejectWindowEntity);
	}
}

