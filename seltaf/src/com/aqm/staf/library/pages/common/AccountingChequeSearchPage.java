package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccChequeDishonourEntity;
import com.aqm.staf.library.databin.ChequeSearchEntity;


public class AccountingChequeSearchPage extends BasePage {

	private PageElement chequeSearchTitle;
	private PageElement chequeNoTextField;
	private PageElement collectionVoucherTypeDropDown;
	private PageElement collectionNoTextField;
	private PageElement collectionFromDateTextfield;
	private PageElement collectionToDateTextField;
	private PageElement policyNoTextField;
	private PageElement searchButton;
	private PageElement backButton;

	//This page consists a table too.

	public AccountingChequeSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		chequeSearchTitle = new PageElement (By.xpath("//div//b[contains(text(),'Cheque Search')]"), "Cheque Search Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		chequeNoTextField = new PageElement(By.name("pChequeNo"), "Cheque No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionVoucherTypeDropDown = new PageElement(By.name("pCollectNoType"), "Collection Voucher Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		collectionNoTextField = new PageElement(By.name("pCollectNo"), "Collection No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionFromDateTextfield = new PageElement(By.name("pFromDate"), "Collection From Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionToDateTextField = new PageElement(By.name("pToDate"), "Collection To Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoTextField = new PageElement(By.name("pPolicyNo"), "Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton = new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


	}

	public void fillChequeSearchDetails(ChequeSearchEntity chequeSearchEntity){
		if(chequeSearchEntity.getAction().equalsIgnoreCase("Verify") || chequeSearchEntity.getAction().equalsIgnoreCase("edit")){
			if (chequeSearchEntity.getBooleanValueForField("ConfigChequeNo")) {
				clearAndSendKeys(chequeNoTextField,chequeSearchEntity.getStringValueForField("SearchChequeNo"));
			}
			if (chequeSearchEntity.getBooleanValueForField("ConfigCollectionVoucherType")) {
				selectValueFromList(collectionVoucherTypeDropDown, chequeSearchEntity.getStringValueForField("SearchCollectionVoucherType"));
			}
			if (chequeSearchEntity.getBooleanValueForField("ConfigCollectionNo")) {
				clearAndSendKeys(collectionNoTextField,chequeSearchEntity.getStringValueForField("SearchCollectionNo"));
			}

			if (chequeSearchEntity.getBooleanValueForField("ConfigCollectionFromDate")) {
				clearAndSendKeys(collectionFromDateTextfield,chequeSearchEntity.getStringValueForField("SearchCollectionFromDate"));
			}

			if (chequeSearchEntity.getBooleanValueForField("ConfigCollectionToDate")) {
				clearAndSendKeys(collectionToDateTextField,chequeSearchEntity.getStringValueForField("SearchCollectionToDate"));
			}

			if (chequeSearchEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNoTextField,chequeSearchEntity.getStringValueForField("SearchPolicyNumber"));
			}
		}
	}

	public void clickSearch() {
		click(searchButton);
		switchToFrame("display");
	}

	
	
	public void backFromChequeSearch(ChequeSearchEntity chequeSearchEntity) {
		if (chequeSearchEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void fillAndSearchChequeSearchDetails(ChequeSearchEntity chequeSearchEntity){
		switchToFrame("display");
		fillChequeSearchDetails(chequeSearchEntity);
		clickSearch();
	}






}
