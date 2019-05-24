package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyShowVersionListEntity;
import com.aqm.staf.library.databin.PolicyVersionSearchEntity;

public class PolicyVersionSearch extends BasePage {
	
	private PageElement policyVersionSearchTitlel;
	private PageElement policyQuoteDetailsPageTitle;
	private PageElement	policyNoLabel;
	private PageElement	quoteNolabel;
	private PageElement productLabel;
	private PageElement policyholderLabel;
	private PageElement statusLabel;
	private PageElement backButton;

	public PolicyVersionSearch(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		policyVersionSearchTitlel =new PageElement(By.xpath("//b[contains(text(),'Version Search')]"), "Policy Version Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNolabel = new PageElement(By.xpath(genericLocatorforLabel("S000", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S000", "Policy")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S000","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S000","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S000", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//table
		
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
	
	 public void fillPolicyVersionDetails(PolicyVersionSearchEntity policyVersionSearchEntity, CustomAssert assertReference){
		if(policyVersionSearchEntity.getAction().equalsIgnoreCase("verify")){
			PolicyVersionSearchEntity actualPolicyVersionSearchEntity = new PolicyVersionSearchEntity();
			
			if (policyVersionSearchEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyVersionSearchEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNolabel));
				assertReference.assertEquals(policyVersionSearchEntity.getStringValueForField("QuoteNo"), actualPolicyVersionSearchEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			
			if (policyVersionSearchEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyVersionSearchEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyVersionSearchEntity.getStringValueForField("PolicyNo"), actualPolicyVersionSearchEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}
			
			if (policyVersionSearchEntity.getBooleanValueForField("configStatus")) {
				actualPolicyVersionSearchEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyVersionSearchEntity.getStringValueForField("Status"), actualPolicyVersionSearchEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			
			if (policyVersionSearchEntity.getBooleanValueForField("CofigPolicyholder")) {
				actualPolicyVersionSearchEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyVersionSearchEntity.getStringValueForField("Policyholder"), actualPolicyVersionSearchEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			
			if (policyVersionSearchEntity.getBooleanValueForField("CofigProduct")) {
				actualPolicyVersionSearchEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyVersionSearchEntity.getStringValueForField("Product"), actualPolicyVersionSearchEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
			
		}
						
	}
	
	public void backFromPage(PolicyVersionSearchEntity policyVersionSearchEntity) {
		if (policyVersionSearchEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}
	
	public void fillAndSubmitShowPolicyVersionDetails(PolicyVersionSearchEntity policyVersionSearchEntity, CustomAssert assertReference){
		fillPolicyVersionDetails(policyVersionSearchEntity, assertReference);
		backFromPage(policyVersionSearchEntity);
		
	}
	
}
