package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEditReasonEntity;
import com.aqm.staf.library.databin.PolicyRejectAlterationEntity;

public class Policy_RejectAlteration extends BasePage {
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public Policy_RejectAlteration(WebDriver driver, String pageName) {
		super(driver, pageName);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
	//SERVICES//
	public void fillPolicyRejectAlterationDetails(PolicyRejectAlterationEntity policyRejectAlterationEntity, CustomAssert assertReference){
		if(policyRejectAlterationEntity.getAction().equalsIgnoreCase("add")){
			if (policyRejectAlterationEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, policyRejectAlterationEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void savePolicyRejectAlterationDetails(PolicyRejectAlterationEntity policyRejectAlterationEntity) {
		if (policyRejectAlterationEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromPolicyRejectAlterationDetails(PolicyRejectAlterationEntity policyRejectAlterationEntity) {
		if (policyRejectAlterationEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndsubmitPolicyRejectAlterationDetails(PolicyRejectAlterationEntity policyRejectAlterationEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyRejectAlterationDetails(policyRejectAlterationEntity, assertReference);
		savePolicyRejectAlterationDetails(policyRejectAlterationEntity);
		//backFromPolicyRejectAlterationDetails(policyRejectAlterationEntity);
	}
}
