package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimHistoryEntity;


public class ClaimHistoryPage extends WebPage{
    private PageElement claimHistoryTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement claimCauseCodeLabel;
	private PageElement backButton;
	//navigation
	private PageElement claimHomePageTitle;
    // This page consists a Table too.
    public ClaimHistoryPage(WebDriver driver, String pageName) {
		super(driver, pageName);
        claimHistoryTitle = new PageElement (By.xpath("//b//font[contains(text(),'Claim History')]"), "Claim History Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Claim Number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Policy Number")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Claim Date")), "Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Claim Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimCauseCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Claim Cause Code")), "Claim Cause Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//navigation
		claimHomePageTitle=new PageElement (By.xpath("//div//b[contains(text(),'Details')]"), "Claim Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
    //showClaimHistory Method
	public void fillClaimHistory(ClaimHistoryEntity claimHistoryEntity, CustomAssert assertReference)throws InterruptedException{
		if(claimHistoryEntity.getAction().equalsIgnoreCase("add") || claimHistoryEntity.getAction().equalsIgnoreCase("edit")){

		}
		else if(claimHistoryEntity.getAction().equalsIgnoreCase("verify")){
			ClaimHistoryEntity actualClaimHistoryEntity=new ClaimHistoryEntity();
			if (claimHistoryEntity.getBooleanValueForField("ConfigClaimNumber")) {
				actualClaimHistoryEntity.setStringValueForField("ClaimNumber", fetchValueFromTextFields(claimNumberLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("ClaimNumber"), actualClaimHistoryEntity.getStringValueForField("ClaimNumber"), AssertionType.WARNING);
			}
			if (claimHistoryEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				actualClaimHistoryEntity.setStringValueForField("PolicyNumber", fetchValueFromTextFields(policyNumberLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("PolicyNumber"), actualClaimHistoryEntity.getStringValueForField("PolicyNumber"), AssertionType.WARNING);
			}
			if (claimHistoryEntity.getBooleanValueForField("ConfigClaimDate")) {
				actualClaimHistoryEntity.setStringValueForField("ClaimDate", fetchValueFromTextFields(claimDateLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("ClaimDate"), actualClaimHistoryEntity.getStringValueForField("ClaimDate"), AssertionType.WARNING);
			}
			if (claimHistoryEntity.getBooleanValueForField("ConfigClaimStatus")) {
				actualClaimHistoryEntity.setStringValueForField("ClaimStatus", fetchValueFromTextFields(claimStatusLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("ClaimStatus"), actualClaimHistoryEntity.getStringValueForField("ClaimStatus"), AssertionType.WARNING);
			}
			if (claimHistoryEntity.getBooleanValueForField("ConfigProductCode")) {
				actualClaimHistoryEntity.setStringValueForField("ProductCode", fetchValueFromTextFields(productCodeLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("ProductCode"), actualClaimHistoryEntity.getStringValueForField("ProductCode"), AssertionType.WARNING);
			}
			if (claimHistoryEntity.getBooleanValueForField("ConfigClaimCauseCode")) {
				actualClaimHistoryEntity.setStringValueForField("ClaimCauseCode", fetchValueFromTextFields(claimCauseCodeLabel));
				assertReference.assertEquals(claimHistoryEntity.getStringValueForField("ClaimCauseCode"), actualClaimHistoryEntity.getStringValueForField("ClaimCauseCode"), AssertionType.WARNING);
			}
		}
	}
	public void backButtonClaimHistory(ClaimHistoryEntity claimHistoryEntity){
		if (claimHistoryEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(claimHomePageTitle));
			return;
		}
	}
	public void fillAndSubmitClaimHistoryDetails(ClaimHistoryEntity claimHistoryEntity, CustomAssert assertReference)throws InterruptedException{
		fillClaimHistory(claimHistoryEntity, assertReference);
		//backButtonClaimHistory(claimHistoryEntity);
	}
}