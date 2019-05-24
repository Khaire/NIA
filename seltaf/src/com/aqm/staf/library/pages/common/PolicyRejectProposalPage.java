package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyRejectProposalEntity;

public class PolicyRejectProposalPage extends BasePage {

	//private PageElement policyQuoteDetailsTitle;
	//private PageElement rejectProposalButton;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;

	public PolicyRejectProposalPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		//policyQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'PolicyQuoteDetails')]"), "policyQuoteDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//rejectProposalButton = new PageElement(By.name("Reject Proposal"), "Reject Proposal Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"), "Reason For Initiating This Action TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyRejectProposalDetails(PolicyRejectProposalEntity policyRejectProposalEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyRejectProposalEntity.getAction().equalsIgnoreCase("add")){

			if (policyRejectProposalEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				String ReasonForInitiatingThisAction=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(reasonForInitiatingThisActionTextArea,ReasonForInitiatingThisAction);
				policyRejectProposalEntity.setStringValueForField("ReasonForInitiatingThisAction",ReasonForInitiatingThisAction );
			}
		}
	}

	public void submitPolicyRejectProposalDetails(PolicyRejectProposalEntity policyRejectProposalEntity) {
		if (policyRejectProposalEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	public void backFromPolicyEndAlterationDetails(PolicyRejectProposalEntity policyRejectProposalEntity) {
		if (policyRejectProposalEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}


	public void fillAndSubmitPolicyRejectProposalDetails(PolicyRejectProposalEntity policyRejectProposalEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillPolicyRejectProposalDetails(policyRejectProposalEntity, assertReference);
		submitPolicyRejectProposalDetails(policyRejectProposalEntity);
	}
}











