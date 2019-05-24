package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyContactsDetailsEntity;
import com.aqm.staf.library.databin.PolicyApprovalEntity;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyEntity;

public class PolicyApproveProposalPage extends WebPage {



	private PageElement reasonForInitiatingThisActionTextField;	
	
	private PageElement policyTypeDropDown;	
	
	private PageElement saveButton;
	private PageElement	pageTitleAfterSave;
	private PageElement backButton;
	private PageElement policyTabTitle;
	public PolicyApproveProposalPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForInitiatingThisActionTextField= new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeDropDown=new PageElement(By.name("pEndorsementOption"), "Select policy Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("Save"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pageTitleAfterSave= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Title AFter Approve Proposal Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	//Add Policy Create and Edit Page Entity
	public void fillApproveProposalDetails(PolicyEntity policyEntity, CustomAssert assertReference){
		if(policyEntity.getAction().equalsIgnoreCase("add")){

			if (policyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextField, policyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
			if (policyEntity.getBooleanValueForField("ConfigPolicyTypeForApproveProposal")) {
				selectValueFromList(policyTypeDropDown, policyEntity.getStringValueForField("PolicyTypeForApproveProposal"));
			}
			
		}
	
	}
	public void submitPolicyApproveProposal(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(pageTitleAfterSave));
			return;
		}
	}
	public void navigateTobackPolicyPage(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigBackButton")){		
		click(backButton);
		switchToFrame("display");
		if(isElementDisplayed(policyTabTitle));
		return;
		}
	}
	 public void fillandSubmitApprovePolicyDetails(PolicyEntity policyEntity, CustomAssert assertReference) {
		 fillApproveProposalDetails(policyEntity, assertReference);
		 submitPolicyApproveProposal(policyEntity);
		 navigateTobackPolicyPage(policyEntity);

	    }
}
