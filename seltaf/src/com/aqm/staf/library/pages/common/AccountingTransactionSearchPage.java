package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.AccountingEntity;


public class AccountingTransactionSearchPage extends BasePage {

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

	public AccountingTransactionSearchPage(WebDriver driver,String pageName) {
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
		navigateToAccountingPage();
		switchToFrame("display");
		if(isElementDisplayed(accountingTransactionSearchPageTitle));
		return;
	
	}
	public void navigateToAccountingTransactionDetailsPage() {
		switchToFrame("display");
		click(newButton);
		switchToFrame("display");
		if(isElementDisplayed(accountingTransactionDetailsPageTitle));
		return;
	}


	public void fetchVoucherNumber(AccountingEntity accountingEntity) {
		String voucherNumber=new String();
		voucherNumber=fetchValueFromTextFields(voucherNumberTextField);
		accountingEntity.setStringValueForField("VoucherNumber",voucherNumber);
	}


	public void fillAccountingTransactionSearchDetail(AccountingEntity accountingEntity){
		if(accountingEntity.getAction().equalsIgnoreCase("verify") || accountingEntity.getAction().equalsIgnoreCase("edit")){

			if (accountingEntity.getBooleanValueForField("ConfigCompany")) {
				selectValueFromList(companyDropdown, accountingEntity.getStringValueForField("Company"));
			}

			if (accountingEntity.getBooleanValueForField("ConfigBankCashGLCode")) {
				clearAndSendKeys(gLCodeTextField, accountingEntity.getStringValueForField("BankCashGLCode"));
			}
			if (accountingEntity.getBooleanValueForField("ConfigVoucherType")) {
				selectValueFromList(voucherTypeDropdown, accountingEntity.getStringValueForField("VoucherType"));
			}

			//  sheet update
			if (accountingEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				clearAndSendKeys(voucherNumberTextField, accountingEntity.getStringValueForField("VoucherAmount"));
			}
			if (accountingEntity.getBooleanValueForField("ConfigReferenceType")) {
				selectValueFromList(referenceTypeDropdown, accountingEntity.getStringValueForField("ReferenceType"));
			}

			if (accountingEntity.getBooleanValueForField("ConfigReferenceNo")) {
				clearAndSendKeys(referenceNoTextField, accountingEntity.getStringValueForField("ReferenceNo"));
			}
			if (accountingEntity.getBooleanValueForField("ConfigFromDate")) {
				clearAndSendKeys(fromDateTextField, accountingEntity.getStringValueForField("FromDate"));
			}
			if (accountingEntity.getBooleanValueForField("ConfigToDate")) {
				clearAndSendKeys(toDateTextField, accountingEntity.getStringValueForField("ToDate"));
			}
			if (accountingEntity.getBooleanValueForField("ConfigPostingStatus")) {
				selectValueFromList(postingStatusDropdown, accountingEntity.getStringValueForField("PostingStatus"));
			}
		}
	}

	public void clearFromAccountingTransactionSearch(AccountingEntity accountingEntity) {
		if (accountingEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
		}
	}
	public void backFromAccountingTransactionSearch(AccountingEntity accountingEntity) {
		if (accountingEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void selectSearchVoucherNumber(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigSearchVoucherNumber")){
			String voucherNumber = accountingEntity.getStringValueForField("VoucherNumber");
			voucherNumberLinkTextField=new PageElement(By.linkText(voucherNumber), "voucher Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(voucherNumberLinkTextField);
		}
	}

	public void clickSearch() {
		click(searchButton);
	}

	public void fillAndSearchAccountingTransactionDetails(AccountingEntity accountingEntity){
		fillAccountingTransactionSearchDetail(accountingEntity);
		clickSearch();
		selectSearchVoucherNumber(accountingEntity);
	}

}
