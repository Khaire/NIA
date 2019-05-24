package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyCommiRecovEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;
import com.aqm.staf.library.databin.PolicyNonSysPolicyEntity;

public class PolicyCommissionRecovery extends BasePage {
	
	private PageElement	commissionRecoveryDetailsTitle ;
	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement commissionPaymentCycleDetailsTitle;
	private PageElement partyRecoveryDetailsTitle;
	private PageElement recoveryAmtTextField;
	private PageElement reasonForRecoveryTextArea;
	private PageElement saveButton;
	private PageElement backButton;
	


	public PolicyCommissionRecovery(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		commissionRecoveryDetailsTitle = new PageElement(By.xpath("//b//font[contains(text(),'Commission Recovery Details')]"), " Commission Recovery Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Quote")), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commissionPaymentCycleDetailsTitle = new PageElement(By.xpath("//b//font[contains(text(),'Payment Cycle Details')]"), "Payment Cycle Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//table
		
		partyRecoveryDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Past Recovery Details')]"), "Past Recovery Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//table
			
		recoveryAmtTextField = new PageElement(By.name("pRecoveryAmount"), " Recovery Amount Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonForRecoveryTextArea = new PageElement(By.name("pReasonofRecovery"), " Reason for Recovery Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	
	public void fillRecoveryDetails(PolicyCommiRecovEntity policyCommiRecovEntity, CustomAssert assertReference){
		if(policyCommiRecovEntity.getAction().equalsIgnoreCase("add")|| policyCommiRecovEntity.getAction().equalsIgnoreCase("edit")){
			
			if (policyCommiRecovEntity.getBooleanValueForField("ConfigRecoveryAmount")) {
				clearAndSendKeys(recoveryAmtTextField, policyCommiRecovEntity.getStringValueForField("RecoveryAmount"));
			}
			
			if (policyCommiRecovEntity.getBooleanValueForField("ConfigReasonForRecovery")) {
				clearAndSendKeys(reasonForRecoveryTextArea, policyCommiRecovEntity.getStringValueForField("ReasonForRecovery"));
			}
		}

		else if(policyCommiRecovEntity.getAction().equalsIgnoreCase("verify")){
			PolicyCommiRecovEntity actualpolicyCommiRecovEntity = new PolicyCommiRecovEntity();
			
			if (policyCommiRecovEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualpolicyCommiRecovEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyCommiRecovEntity.getStringValueForField("QuoteNo"), actualpolicyCommiRecovEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
							
			if (policyCommiRecovEntity.getBooleanValueForField("configStatus")) {
				actualpolicyCommiRecovEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyCommiRecovEntity.getStringValueForField("Status"), actualpolicyCommiRecovEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			
			if (policyCommiRecovEntity.getBooleanValueForField("configPolicyholder")) {
				actualpolicyCommiRecovEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyCommiRecovEntity.getStringValueForField("Policyholder"), actualpolicyCommiRecovEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			
			if (policyCommiRecovEntity.getBooleanValueForField("configProduct")) {
				actualpolicyCommiRecovEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyCommiRecovEntity.getStringValueForField("Product"), actualpolicyCommiRecovEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
		}
	}

	
	public void submitDetails(PolicyCommiRecovEntity policyCommiRecovEntity) {
		if (policyCommiRecovEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			
		}
	}
	
	public void backRecoveryWindow(PolicyCommiRecovEntity policyCommiRecovEntity) {
		if (policyCommiRecovEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	
	public void fillAndSaveRecoveryDetails(PolicyCommiRecovEntity policyCommiRecovEntity, CustomAssert assertReference) {
		fillRecoveryDetails(policyCommiRecovEntity, assertReference);
		submitDetails(policyCommiRecovEntity);
		backRecoveryWindow(policyCommiRecovEntity);
	}
}
