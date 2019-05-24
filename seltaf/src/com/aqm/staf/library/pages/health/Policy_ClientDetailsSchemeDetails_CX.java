package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_ClientDetailsSchemeDetails_CX extends WebPage {

	private PageElement ClientDetailsSchemeDetailPageTitle;
	private PageElement schemeNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyHolderLabel;
	private PageElement productNameLabel;
	private PageElement houseNumberLabel;
	private PageElement roadNumberAndNameLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement backButton;
	
	
	public Policy_ClientDetailsSchemeDetails_CX(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		ClientDetailsSchemeDetailPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//productLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Product")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		schemeNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0230","Scheme Number")), "Scheme Number ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		policyStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0230","Policy Status")), "Policy Status ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		policyHolderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230","Policyholder")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230","Product name")), "Product Name ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		houseNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230","House Number :")), "House Number : ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roadNumberAndNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230","Road")), "Road (Number & Name) ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230","Applicable Event Code")), "Applicable Event Code ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
		
		
	}
	
	
	

}
