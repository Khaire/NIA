package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyEndAlterationEntity;

public class PolicyEndAlterationPage extends BasePage{

	//private PageElement policyQuoteDetailsTitle;
	//private PageElement endAlterationButton;
	private PageElement doYouWantToRefundOtherThanPolicyHolderDropDown;
	private PageElement primaryEndorsmentDropDown;
	private PageElement memorandumTextArea;
	private PageElement policyTypeDropDown;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;
	
	public PolicyEndAlterationPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		//switch to window pass title as string//
		//policyQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'PolicyQuoteDetails')]"), "policyQuoteDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//endAlterationButton = new PageElement(By.name("End Alteration"), " End Alteration Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		doYouWantToRefundOtherThanPolicyHolderDropDown = new PageElement(By.name("pMemPayFlag"), "Do You Want To Refund Other Than Policy Holder DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		primaryEndorsmentDropDown = new PageElement(By.name("pEndorsementOption"), "Primary Endorsment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		memorandumTextArea = new PageElement(By.name("pNewRemark"), "  Memorandum TextArea ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeDropDown = new PageElement(By.name("pPolicyTypeOption"), "Policy Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyEndAlterationDetails(PolicyEndAlterationEntity policyEndAlterationEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyEndAlterationEntity.getAction().equalsIgnoreCase("add")){

			if (policyEndAlterationEntity.getBooleanValueForField("ConfigDoYouWantToRefundOtherThanPolicyHolder")) {
				selectValueFromList(doYouWantToRefundOtherThanPolicyHolderDropDown, policyEndAlterationEntity.getStringValueForField("DoYouWantToRefundOtherThanPolicyHolder"));
			}
			if (policyEndAlterationEntity.getBooleanValueForField("ConfigPrimaryEndorsment")) {
				selectValueFromList(primaryEndorsmentDropDown, policyEndAlterationEntity.getStringValueForField("PrimaryEndorsment"));
			}
			if (policyEndAlterationEntity.getBooleanValueForField("ConfigMemorandum")) {
				String Memorandum=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(memorandumTextArea,Memorandum);
				policyEndAlterationEntity.setStringValueForField("Memorandum",Memorandum );
			}

			if (policyEndAlterationEntity.getBooleanValueForField("ConfigPolicyType")) {
				selectValueFromList(policyTypeDropDown, policyEndAlterationEntity.getStringValueForField("PolicyType"));
			}
		}
	}

	public void submitPolicyEndAlterationDetails(PolicyEndAlterationEntity policyEndAlterationEntity) {
		if (policyEndAlterationEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	public void backFromPolicyEndAlterationDetails(PolicyEndAlterationEntity policyEndAlterationEntity) {
		if (policyEndAlterationEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	public void fillAndSubmitPolicyEndAlterationDetails(PolicyEndAlterationEntity policyEndAlterationEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillPolicyEndAlterationDetails(policyEndAlterationEntity, assertReference);
		submitPolicyEndAlterationDetails(policyEndAlterationEntity);
	}
}
















