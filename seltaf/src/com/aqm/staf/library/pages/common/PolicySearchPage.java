package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyContactsDetailsEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyEntity;

public class PolicySearchPage extends BasePage {

	private PageElement policySearchPageTitle;
	private PageElement policyDetailPageTitle;
	private PageElement productCodeTextFeild;
	private PageElement productNameTextFeild;
	private PageElement quoteNumberTextFeild;
	private PageElement policyNumberTextFeild;
	private PageElement dateFromTextFeild;
	private PageElement dateToTextFeild;
	private PageElement statusDropDownList;
	private PageElement partyStakeCodeTextFeild;
	private PageElement partyCodeTextFeild;
	private PageElement parameterDropDownList;
	private PageElement branchCodeDropDownList;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement wizardButton;
	private PageElement policyQuoteLink;
	private PageElement policyNoLink;
	private String quoteNo;	
	private String policyNo;

	public PolicySearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policySearchPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Quote/Policy Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetailPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy/Quate Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeTextFeild = new PageElement(By.name("pProductCode"),"Product code TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productNameTextFeild =new PageElement(By.name("pProductName"),"Product Name TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberTextFeild= new PageElement(By.xpath("//td//b[contains(text(),'Policy No.')]//following::input"), "Policy Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateFromTextFeild=new PageElement(By.name("pEffectiveStartDate"), "Date From TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateToTextFeild= new PageElement(By.name("pEffectiveEndDate"), "Date To TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusDropDownList= new PageElement(By.name("pStatus"), "Status DropDown List",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyStakeCodeTextFeild= new PageElement(By.name("pStakeCode"), "Party Stake Code Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeTextFeild = new PageElement(By.name("pPolicyHolderCode"), "Party code Text Feild", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		parameterDropDownList= new PageElement(By.name("pParameterName"), "Paramreter DropDown List",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		branchCodeDropDownList= new PageElement(By.name("pBranchCode"), "Branch Code DropDown List	",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		searchButton= new PageElement(By.name("Search5465"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		newButton= new PageElement(By.name("New"), "New Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		clearButton= new PageElement(By.name("Clear"), "Clear Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton= new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		wizardButton= new PageElement(By.name("Wizard"), "Wizard Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	
	public void fillPolicySearch(PolicyEntity policyEntity) throws InterruptedException{
		if(policyEntity.getAction().equalsIgnoreCase("verify") || policyEntity.getAction().equalsIgnoreCase("edit")){
			switchToFrame("display");
			if (policyEntity.getBooleanValueForField("ConfigSearchProductCode")) {
				clearAndSendKeys(productCodeTextFeild, policyEntity.getStringValueForField("ProductCode"));
			}
			if (policyEntity.getBooleanValueForField("ConfigSearchProductName")) {
				clearAndSendKeys(productNameTextFeild, policyEntity.getStringValueForField("ProductName"));
			}
			if (policyEntity.getBooleanValueForField("ConfigSearchQuoteNo")) {
				Thread.sleep(2000);
				clearAndSendKeys(quoteNumberTextFeild,policyEntity.getStringValueForField("QuoteNo"));
			}
			if (policyEntity.getBooleanValueForField("ConfigSearchPolicyNo")) {
				clearAndSendKeys(policyNumberTextFeild,policyEntity.getStringValueForField("PolicyNo"));
			}
			if (policyEntity.getBooleanValueForField("ConfigDateFrom")) {
				String DateFrom=RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("DateFrom"));
				clearAndEnterDate(dateFromTextFeild, DateFrom);
			}
			if (policyEntity.getBooleanValueForField("ConfigDateTo")) {
				String DateTo=RandomCodeGenerator.dateGenerator(policyEntity.getStringValueForField("DateTo"));
				clearAndEnterDate(dateToTextFeild, DateTo);
			}
			if (policyEntity.getBooleanValueForField("ConfigStatus")) {
				selectValueFromList(statusDropDownList, policyEntity.getStringValueForField("Status"));
			}
			if (policyEntity.getBooleanValueForField("ConfigPartyStakeCode")) {
				clearAndSendKeys(partyStakeCodeTextFeild, policyEntity.getStringValueForField("PartyStakeCode"));
			}
			if (policyEntity.getBooleanValueForField("ConfigPartyCode")) {
				clearAndSendKeys(partyCodeTextFeild, policyEntity.getStringValueForField("PartyCode"));
			}
			if (policyEntity.getBooleanValueForField("ConfigParameter")) {
				selectValueFromList(parameterDropDownList, policyEntity.getStringValueForField("Parameter"));
			}
			if (policyEntity.getBooleanValueForField("ConfigBranchCode")) {
				clearAndSendKeys(branchCodeDropDownList, policyEntity.getStringValueForField("BranchCode"));
			}
		}
	}

	public void navigateToPolicySearchPage() {
		navigateToPolicyPage();
		switchToFrame("display");
		isElementDisplayed(policySearchPageTitle);
	}

	public void navigateToPolicyCreatePage() {
		switchToFrame("display");
		click(newButton);
		switchToFrame("display");
		isElementDisplayed(policyDetailPageTitle);
	}
	
	public void clearFromPolicySearch(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			isElementDisplayed(policySearchPageTitle);
		}
	}
	public void backFromPolicySearch(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			isElementDisplayed(policySearchPageTitle);
		}
	}
	public void clickSearch() {
		click(searchButton);
		try{
			acceptAlertAndReturnConfirmationMessage();
		}catch(Exception e){}
	}

	public void wizardButton(PolicyEntity policyEntity) {
		if (policyEntity.getBooleanValueForField("Confi gWizardButton")) {
			click(wizardButton);
		}
	}
	public void fillAndSearchPolicyDetails(PolicyEntity policyEntity) throws InterruptedException{
		fillPolicySearch(policyEntity);
		Thread.sleep(2000);
		clickSearch();
		try{
			acceptAlertAndReturnConfirmationMessage();
		}catch(Exception e){}
		//navigateToPolicyCreatePage();

	}
	public void selectSearchQuote(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigSearchQuoteNo")){
			quoteNo=policyEntity.getStringValueForField("QuoteNo").trim();
			policyQuoteLink = new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			for (int i =1;i<=3;i++){
				click(policyQuoteLink);
				
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
				if (isElementDisplayed(policyDetailPageTitle)){
					break;
				}
			}
 			switchToFrame("display");
		}
	}
	public void selectSearchPolicy(PolicyEntity policyEntity){
		if (policyEntity.getBooleanValueForField("ConfigSearchPolicyNo")){
			policyNo=policyEntity.getStringValueForField("PolicyNo").trim();
			policyNoLink=new PageElement(By.xpath("//a//font[contains(text(),'"+policyNo+"')]"), "Policy No Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyNoLink);
			
			try{
				acceptAlertAndReturnConfirmationMessage();
			}catch(Exception e){}
			switchToFrame("display");
		}
	}
	public void navigateToPolicyDetailsPage(){
		switchToFrame("display");
		isElementDisplayed(policyDetailPageTitle);
	}
	public void fetchQuoteNumber(PolicyEntity policyEntity) {
		String policyquote=new String();
		policyquote=fetchValueFromTextFields(quoteNumberTextFeild);
		policyEntity.setStringValueForField("QuoteNo", policyquote);
	}
	
}


