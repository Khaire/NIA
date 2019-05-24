package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class PolicyRelationSchemePartyAttribute extends WebPage{
	
	private PageElement policyPartyAttributesTitle ;
	private PageElement quoteNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyholderLabel;
	private PageElement productNameLabel;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement stakeCodeLabel;
	private PageElement stakeNameLabel;
	private PageElement houseNumberLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement roadNumberAndNameLabel;
	
	private PageElement saveButton;
	private PageElement backButton;
	
	public PolicyRelationSchemePartyAttribute(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyPartyAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Party Attributes')]"), "Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
        quoteNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Quote Number")), "Quote Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Policy Status")), "Policy Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        productNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " Product name")), "Product name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " Party Code")), "Party Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " Party name")), " Party name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        stakeCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " Stake Code")), "Stake Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        stakeNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " Stake name")), " Stake name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        houseNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " House Number :")), " House Number : Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        
        // Policy Holder
        
        
        
        applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Applicable Event Code")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
        backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 

		
		
		
		
		
		
		
		
		
	}
	
	
 
  

}
