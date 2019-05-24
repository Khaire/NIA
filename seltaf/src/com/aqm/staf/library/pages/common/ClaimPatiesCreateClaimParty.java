package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

public class ClaimPatiesCreateClaimParty extends BasePage {
	private PageElement claimPartyDetailsTitle ;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement stakeDropdown;
	private PageElement claimPartyCodeTextField;
	private PageElement claimPartyNameTextField;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimPatiesCreateClaimParty(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPartyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'PartyDetails')]"), "Claim Party Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeDropdown = new PageElement(By.name("pClaimStake"),"Stake Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		claimPartyCodeTextField = new PageElement(By.name("pPartyCode"),"Claim Party Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPartyNameTextField = new PageElement(By.name("pPartyName"),"Claim Party Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		saveButton = new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}

}
