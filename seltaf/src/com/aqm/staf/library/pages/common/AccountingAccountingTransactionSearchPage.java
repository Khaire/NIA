package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.AccMaintainTransactionEntity;
//import com.aqm.staf.library.databin.AccountingAccSeachEntity;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.PolicyEntity;


public class AccountingAccountingTransactionSearchPage extends BasePage {

	private PageElement accountingTransactionSearchPageTitle;
	private PageElement companyDropdown;
	private PageElement gLCodeTextField;
	private PageElement voucherTypeDropdown;
	private PageElement voucherNumberTextField;
	private PageElement referenceTypeDropdown;
	private PageElement referenceNoTextField;
	private PageElement fromDateTextField;
	private PageElement toDateTextField;
	private PageElement postingStatusDropdown;
	private PageElement instrumentNumberTextField;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement accountingTransactionDetailsPageTitle;
	private PageElement voucherNumberLinkTextField;


	public AccountingAccountingTransactionSearchPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		accountingTransactionSearchPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Accounting')]"), "Accounting Transaction Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyDropdown= new PageElement(By.name("pCompanyCode"), "Company Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		gLCodeTextField= new PageElement(By.name("pGLCode"), "GL Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherTypeDropdown= new PageElement(By.name("pVoucherType"), "Voucher Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		voucherNumberTextField= new PageElement(By.name("pVoucherNo"), "Voucher Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		referenceTypeDropdown= new PageElement(By.name("pReferenceType"), "Reference Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		referenceNoTextField = new PageElement(By.name("pReferenceNumber"), " Reference No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromDateTextField= new PageElement(By.name("pEffectiveStartDate"), "From Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toDateTextField= new PageElement(By.name("pEffectiveEndDate"), "To Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		postingStatusDropdown = new PageElement(By.name("pPostingStatus"), "Posting Status Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		instrumentNumberTextField = new PageElement(By.name("pInstrumentNumber"), "Instrument Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton= new PageElement(By.name("Search"), "search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clearButton= new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingTransactionDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Transaction')]"), "Accounting Transaction Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	voucherNumberLinkTextField=new PageElement(By.linkText(voucherNumber), "voucherNumber in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void navigateToAccountingTransactionSearchPage() {
		switchToFrame("display");
		if(isElementDisplayed(accountingTransactionSearchPageTitle));
		return;

	}

	//@Rasika
	public void navigateToAccountingTransactionDetailsPage(AccMaintainTransactionEntity accMaintainTransactionEntity) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
			isElementDisplayed(accountingTransactionDetailsPageTitle);
		}
	}


	public void fetchVoucherNumber(AccMaintainTransactionEntity accMaintainTransactionEntity) {
		String voucherNumber=new String();
		voucherNumber=fetchValueFromTextFields(voucherNumberTextField);
		accMaintainTransactionEntity.setStringValueForField("VoucherNumber",voucherNumber);
	}


	public void fillAccountingTransactionSearchDetail(AccMaintainTransactionEntity accMaintainTransactionEntity){
		if(accMaintainTransactionEntity.getAction().equalsIgnoreCase("add") || accMaintainTransactionEntity.getAction().equalsIgnoreCase("verify")){//

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchCompany")) {
				selectValueFromList(companyDropdown, accMaintainTransactionEntity.getStringValueForField("Company"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchBankCashGLCode")) {
				clearAndSendKeys(gLCodeTextField, accMaintainTransactionEntity.getStringValueForField("BankCashGLCode"));
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchVoucherType")) {
				selectValueFromList(voucherTypeDropdown, accMaintainTransactionEntity.getStringValueForField("VoucherType"));
			}


			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchVoucherNumber")) {
				clearAndSendKeys(voucherNumberTextField, accMaintainTransactionEntity.getStringValueForField("VoucherNumber"));
			}	
			else
			{	
				clearTextField(voucherNumberTextField);
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchReferenceType")) {
				selectValueFromList(referenceTypeDropdown, accMaintainTransactionEntity.getStringValueForField("ReferenceType"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchReferenceNo")) {
				clearAndSendKeys(referenceNoTextField, accMaintainTransactionEntity.getStringValueForField("ReferenceNo"));
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchFromDate")) {
				clearAndSendKeys(fromDateTextField, accMaintainTransactionEntity.getStringValueForField("FromDate"));
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchToDate")) {
				clearAndSendKeys(toDateTextField, accMaintainTransactionEntity.getStringValueForField("ToDate"));
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchPostingStatus")) {
				selectValueFromList(postingStatusDropdown, accMaintainTransactionEntity.getStringValueForField("PostingStatus"));
			}
		}
	}

	public void clearFromAccountingTransactionSearch(AccMaintainTransactionEntity accMaintainTransactionEntity) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
		}
	}
	public void backFromAccountingTransactionSearch(AccMaintainTransactionEntity accMaintainTransactionEntity) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void selectSearchVoucherNumber(AccMaintainTransactionEntity accMaintainTransactionEntity) throws Exception{
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchVoucherNumber")){
			String voucherNumber = accMaintainTransactionEntity.getStringValueForField("VoucherNumber").trim();
			voucherNumberLinkTextField=new PageElement(By.xpath("//a//div[contains(text(),'"+voucherNumber+"')]"), "voucher Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(voucherNumberLinkTextField);
		}
		
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchDynamicVoucherNumber")){
			int TableRowNumber = accMaintainTransactionEntity.getIntegerValueForField("TableRowNumber");
			int dataRow = TableRowNumber + 1; 
			voucherNumberLinkTextField=new PageElement(By.xpath("//tr["+dataRow+"]/td/a[contains(@name, 'firstFocus')]/div"), "voucher Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(voucherNumberLinkTextField);
		}	
			Thread.sleep(2000);
			switchToFrame("display");
	}
	
	public void clickSearch(AccMaintainTransactionEntity accMaintainTransactionEntity) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
		}
	}

	public void fillAndSearchAccountingTransactionDetails(AccMaintainTransactionEntity accMaintainTransactionEntity) throws Exception{
		fillAccountingTransactionSearchDetail(accMaintainTransactionEntity);
		navigateToAccountingTransactionDetailsPage(accMaintainTransactionEntity);
		clickSearch(accMaintainTransactionEntity);
		clearFromAccountingTransactionSearch(accMaintainTransactionEntity);
		selectSearchVoucherNumber(accMaintainTransactionEntity);
	}
	public void navigateTo(){
		switchToFrame("display");
		if(isElementDisplayed(accountingTransactionDetailsPageTitle));
		return;
	}

}
