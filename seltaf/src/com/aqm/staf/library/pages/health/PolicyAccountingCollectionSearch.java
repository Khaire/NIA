package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAccoColleSearchEntity;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyAccountingCollectionSearch extends BasePage  {

	private PageElement policyCollectionSearchPageTitle;
	private PageElement collectionNoTextfield;
	private PageElement collectionFromDateTextfield;
	private PageElement collectionToDateTextfield;
	private PageElement policyNoTextfield;
	private PageElement newButton;
	private PageElement searchButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement policyNoFindButton;
	private PageElement policySearchButton;
	private PageElement accountingTab;
	private PageElement collectionTab;
	String policyNo;
	private PageElement policyNoLink;
	String collectionNo;
	private PageElement collectionNoLink;




	public PolicyAccountingCollectionSearch(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyCollectionSearchPageTitle=new PageElement(By.xpath("//form[@name='frmollectionSearch']//div//b[contains(text(),'Search Collection')]"), "Policy Search Collection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionNoTextfield=new PageElement(By.name("pCollectNo"), "Collection No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionFromDateTextfield=new PageElement(By.name("pFromDate"), "Collection From Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionToDateTextfield=new PageElement(By.name("pToDate"), "Collection To Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoTextfield=new PageElement(By.xpath("//form[@name='FormProposalPolicySearchList']//td//b[contains(text(),'Policy No')]/following::td/input"), "Policy No Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingTab=new PageElement(By.linkText("Accounting"), "Account Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionTab=new PageElement(By.xpath("//a//b[contains(text(),'Collection')]"), "Collection Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		newButton= new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton= new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clearButton= new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Proposal/Policy No')]/following::input/following::a[@name='firstFocus']"), "PolicyNo Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policySearchButton=new PageElement(By.name("Search5465"), "Policy Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillPolicyAccountingCollectionSearch(PolicyAccoColleSearchEntity policyAccoColleSearchEntity, CustomAssert assertReference) throws InterruptedException {
		if(policyAccoColleSearchEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(policyAccoColleSearchEntity.getAction().equalsIgnoreCase("edit") || policyAccoColleSearchEntity.getAction().equalsIgnoreCase("verify")){

				if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigCollectionNo")) {
					clearAndSendKeys(collectionNoTextfield, policyAccoColleSearchEntity.getStringValueForField("CollectionNo"));
				}

				if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigCollectionFromDate")) {
					clearAndSendKeys(collectionFromDateTextfield, policyAccoColleSearchEntity.getStringValueForField("CollectionFromDate"));
				}
				if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigCollectionToDate")) {
					clearAndSendKeys(collectionToDateTextfield, policyAccoColleSearchEntity.getStringValueForField("CollectionToDate"));
				}
				if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigPolicyNo")) {
					fillPolicyNumberSearch(policyAccoColleSearchEntity);
					//clearAndSendKeys(policyNoTextfield, policyAccoColleSearchEntity.getStringValueForField("PolicyNo"));
				}
			}
		}
	}

	public void fillPolicyNumberSearch(PolicyAccoColleSearchEntity policyAccoColleSearchEntity) throws InterruptedException{
		clickOnPolicyNumberFindButton(policyAccoColleSearchEntity);

		if(policyAccoColleSearchEntity.getBooleanValueForField("ConfigSearchPolicyNo")){
			clearAndSendKeys(policyNoTextfield, policyAccoColleSearchEntity.getStringValueForField("PolicyNo"));
		}
		click(policySearchButton);	
		selectSearchPolicyCode(policyAccoColleSearchEntity);
	}

	public void clickOnPolicyNumberFindButton(PolicyAccoColleSearchEntity policyAccoColleSearchEntity) throws InterruptedException{
		click(policyNoFindButton);
		switchToWindow("Policy Search List");
	}

	public void selectSearchPolicyCode(PolicyAccoColleSearchEntity policyAccoColleSearchEntity) throws InterruptedException{
		policyNo=policyAccoColleSearchEntity.getStringValueForField("PolicyNo").trim();
		policyNoLink=new PageElement(By.xpath("//a//font[contains(text(),'"+policyNo+"')]"), "Policy Number in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(policyNoLink);
		switchToWindow();
		switchToFrame("display");
	}

	public void newButtonPolicyAccountingCollectionSearch (PolicyAccoColleSearchEntity policyAccoColleSearchEntity) {
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			//isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void searchButtonPolicyAccountingCollectionSearch (PolicyAccoColleSearchEntity policyAccoColleSearchEntity) {
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
			//isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void clearButtonPolicyAccountingCollectionSearch (PolicyAccoColleSearchEntity policyAccoColleSearchEntity) {
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			//isElementDisplayed(policyMemberDetailsTitle);
		}
	}

	public void navigateTonAccountingTab (PolicyAccoColleSearchEntity policyAccoColleSearchEntity) {
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigAccountingTab")) {
			switchToFrame("head");
			click(accountingTab);
			switchToFrame("display");
		}
	}

	public void navigateTonCollectionTab (PolicyAccoColleSearchEntity policyAccoColleSearchEntity) {
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigCollectionTab")) {

			switchToFrame("Control");
			click(collectionTab);
			switchToFrame("display");
		}
	}
	//Abhijit
	public void selectSearchCollectionCode(PolicyAccoColleSearchEntity policyAccoColleSearchEntity) throws InterruptedException{
		// If you are doing scenario for collection details button set ConfigSearchCollectionNo to 0.
		if (policyAccoColleSearchEntity.getBooleanValueForField("ConfigSearchCollectionNo")) {
			collectionNo=policyAccoColleSearchEntity.getStringValueForField("CollectionNo");
			collectionNoLink=new PageElement(By.xpath("//a[contains(text(),'"+collectionNo+"')]"), "Collection Number in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(collectionNoLink);  
			driver.switchTo().defaultContent();
			/*try{
					switchToFrame("display");
				}catch(Exception e){}*/
			
		}
		else if(!policyAccoColleSearchEntity.getBooleanValueForField("ConfigAccountingTab"))
		{
			collectionNo=policyAccoColleSearchEntity.getStringValueForField("CollectionNo");
			collectionNoLink=new PageElement(By.xpath("//a[contains(text(),'"+collectionNo+"')]"), "Collection Number in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(collectionNoLink); 
			switchToWindow("Collection Screen");
		}
	}

	public void fillAndSearchePolicyAccountingCollectionSearch(PolicyAccoColleSearchEntity policyAccoColleSearchEntity,CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillPolicyAccountingCollectionSearch(policyAccoColleSearchEntity, assertReference);
		newButtonPolicyAccountingCollectionSearch(policyAccoColleSearchEntity);
		searchButtonPolicyAccountingCollectionSearch(policyAccoColleSearchEntity);
		selectSearchCollectionCode(policyAccoColleSearchEntity);
		clearButtonPolicyAccountingCollectionSearch(policyAccoColleSearchEntity);
	}
}
