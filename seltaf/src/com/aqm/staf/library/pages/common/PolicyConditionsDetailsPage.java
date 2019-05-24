package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyConditionsEntity;

public class PolicyConditionsDetailsPage extends BasePage{

	private PageElement conditionsOrWarrantiesOrExclusionsOrTradesInPolicyTitle;
	private PageElement policyOrQuoteDetailsTitle;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement backButton;

	//This page consists a Table too.

	public PolicyConditionsDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		conditionsOrWarrantiesOrExclusionsOrTradesInPolicyTitle = new PageElement (By.xpath("//div//b[contains(text(),'Conditions/Warranties/Exclusions/Trades in Policy')]"), "Conditions/Warranties/Exclusions/Trades in Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyOrQuoteDetailsTitle = new PageElement (By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Policy No.")), "Quote No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyExclnList", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10); 

	}

	public void fillPolicyConditionsDetails(PolicyConditionsEntity policyConditionsEntity, CustomAssert assertReference){
		if(policyConditionsEntity.getAction().equalsIgnoreCase("verify")){
			PolicyConditionsEntity actualPolicyConditionsEntity=new PolicyConditionsEntity();
			if (policyConditionsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyConditionsEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyConditionsEntity.getStringValueForField("policyNo"), actualPolicyConditionsEntity.getStringValueForField("policyNo"), AssertionType.WARNING);
			}


			if (policyConditionsEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyConditionsEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyConditionsEntity.getStringValueForField("Status"), actualPolicyConditionsEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}


			if (policyConditionsEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyConditionsEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyConditionsEntity.getStringValueForField("Policyholder"), actualPolicyConditionsEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}


			if (policyConditionsEntity.getBooleanValueForField("ConfigProduct")) {
				actualPolicyConditionsEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyConditionsEntity.getStringValueForField("Product"), actualPolicyConditionsEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
		}
	}

	public void backFromPolicyConditionsDetails(PolicyConditionsEntity policyConditionsEntity) {
		if (policyConditionsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;

		}

	}

	public void fillAndSubmitPolicyConditionsDetails(PolicyConditionsEntity policyConditionsEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyConditionsDetails(policyConditionsEntity, assertReference);
		
	}

}


















