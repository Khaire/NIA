package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimMemberT1T2CLRAttEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.TransferToApEntity;

public class PolicyCancellationWindowPage extends WebPage {

	private PageElement cancellationBasisDropDown;	
	private PageElement cancellationReasonDropDown;	
	private PageElement pEventEffectiveDateTextField;
	private PageElement reasonForInitiatingThisActionTextField;
	private PageElement policyTabTitle;
	
	private PageElement saveButton;
	private PageElement backButton;
	public PolicyCancellationWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		cancellationBasisDropDown=new PageElement(By.name("pPartyCode"), "Select cancellation Basis DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cancellationReasonDropDown=new PageElement(By.name("pEndorsementType"), "Select Cancellation Basis DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pEventEffectiveDateTextField= new PageElement(By.name("pEventEffectiveDate"),"Event Effective Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForInitiatingThisActionTextField= new PageElement(By.name("pNewRemark"),"Reason for initiating this action Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("Save"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}
	public void fillCancellationDetails(PolicyEntity policyEntity, CustomAssert assertReference){
		if(policyEntity.getAction().equalsIgnoreCase("add")){

			if (policyEntity.getBooleanValueForField("ConfigCancellationBasis")) {
				selectValueFromList(cancellationBasisDropDown, policyEntity.getStringValueForField("CancellationBasis"));
				try {
					acceptAlertAndReturnConfirmationMessage();
					
				} catch (Exception e) {
				}
			}
			if (policyEntity.getBooleanValueForField("ConfigCancellationReason")) {
				selectValueFromList(cancellationReasonDropDown, policyEntity.getStringValueForField("CancellationReason"));
			}
			if (policyEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
				String eventeffectiveDate=RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("EventEffectiveDate"));
				clearAndEnterDate(pEventEffectiveDateTextField, eventeffectiveDate);			}
			
			if (policyEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextField, policyEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
		
	}
	public void saveCancellationDetails(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigSaveCancelButton")) {
			click(saveButton);
			if(isElementDisplayed(policyTabTitle));
			return;
		}
		
	}
	public void backToPolicyPage(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigBackCancelButton")) {
			click(backButton);
			if(isElementDisplayed(policyTabTitle));
			return;
		}
		
	}
	public void fillSubmitCancellationDetails(PolicyEntity policyEntity,CustomAssert assertReference){
	
			fillCancellationDetails(policyEntity, assertReference);
			saveCancellationDetails(policyEntity);
			backToPolicyPage(policyEntity);
		
	}
	
}
