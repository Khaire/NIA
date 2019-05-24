package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.BasePage;
//import com.aqm.staf.library.databin.AccountingAccSeachEntity;
import com.aqm.staf.library.databin.AccMaintainTransactionEntity;


public class AccountingAccountingTransactionDetailsPage extends BasePage {

	private PageElement accountingTransactionDetailsPageTitle;
	private PageElement companyDropdown;
	private PageElement branchTextField;
	private PageElement voucherNumberLabel;
	private PageElement voucherDateTextField;
	private PageElement voucherTypeDropdown;	
	private PageElement transactionModeDropdown;
	private PageElement transactionRuleCodeTextField;
	private PageElement transactionRuleDescTextField;
	private PageElement currencyIndicatorTextField;
	private PageElement currencyRateTextField;
	private PageElement voucherAmountTextField;
	private PageElement referenceTypeDropdown;	
	private PageElement referenceNoTextField;	
	private PageElement narrationTextField;
	private PageElement Bank_Cash_GL_CodeTextField;
	private PageElement Bank_Cash_GL_NameTextField;
	private PageElement accountDistributionButton;
	private PageElement backButton;
	private PageElement accountingDistributionTitle;
	private PageElement accountingTransactionSearchPageTitle;
	//private PageElement voucherNumberTextField;

	public AccountingAccountingTransactionDetailsPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		accountingTransactionDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Transaction')]"), "Accounting Transaction Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyDropdown = new PageElement(By.name("pCompanyCode"), "Company Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		branchTextField = new PageElement(By.name("pBranchCode"), "Branch TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0150", "Voucher Number")), "Voucher Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		voucherDateTextField = new PageElement(By.name("pVoucherDate"), "Voucher Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherTypeDropdown = new PageElement(By.name("pVoucherType"), "Voucher Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transactionModeDropdown = new PageElement(By.name("pPaymentMode"), "Transaction Mode Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transactionRuleCodeTextField= new PageElement(By.name("pTrnasactionRuleCode"), "Transaction Rule TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionRuleDescTextField = new PageElement(By.name("pTrnasactionDesc"), "Transaction TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyIndicatorTextField = new PageElement(By.name("pDollarCurrencyIndicator"), "Currency Indicator TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyRateTextField = new PageElement(By.name("pForexRate"), "Currency rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherAmountTextField = new PageElement(By.name("pVoucherAmount"), "Voucher Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		referenceTypeDropdown = new PageElement(By.name("pReferenceType"), "Reference Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		referenceNoTextField = new PageElement(By.name("pReferenceNumber"), "Reference Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		narrationTextField = new PageElement(By.name("pNarration"), "Narration TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Bank_Cash_GL_CodeTextField = new PageElement(By.name("pBankGLCode"), "Bank/Cash GL Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Bank_Cash_GL_NameTextField= new PageElement(By.name("pBankGLName"), "Bank/Cash GL Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountDistributionButton = new PageElement(By.name("A/C Distribution"), "Account Distribution Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//voucherNumberTextField =  new PageElement(By.name(""), "Voucher Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingDistributionTitle = new PageElement(By.xpath("//div//b[contains(text(),'Accounting Distribution')]"), "Accounting Distribution Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		accountingTransactionSearchPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Accounting')]"), "Accounting Transaction Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillAccountingTransactionDetails(AccMaintainTransactionEntity accMaintainTransactionEntity, CustomAssert assertReference) throws InterruptedException{
		if(accMaintainTransactionEntity.getAction().equalsIgnoreCase("add") || accMaintainTransactionEntity.getAction().equalsIgnoreCase("edit")){

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCompany")) {
				selectValueFromList(companyDropdown, accMaintainTransactionEntity.getStringValueForField("Company"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBranch")) {
				clearAndSendKeys(branchTextField, accMaintainTransactionEntity.getStringValueForField("Branch"));
			}
			
			/*if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				clearAndSendKeys(voucherNumberTextField, accMaintainTransactionEntity.getStringValueForField("VoucherNumber"));
			}*/

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherDate")) {
				clearAndSendKeys(voucherDateTextField, accMaintainTransactionEntity.getStringValueForField("VoucherDate"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherType")) {
				selectValueFromList(voucherTypeDropdown, accMaintainTransactionEntity.getStringValueForField("VoucherType"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionMode")) {
				selectValueFromList(transactionModeDropdown, accMaintainTransactionEntity.getStringValueForField("TransactionMode"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionRuleCode")) {
				clearAndSendKeys(transactionRuleCodeTextField, accMaintainTransactionEntity.getStringValueForField("TransactionRuleCode"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionRuleDesc")) {
				clearAndSendKeys(transactionRuleDescTextField, accMaintainTransactionEntity.getStringValueForField("TransactionRuleDesc"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCurrencyIndicator")) {
				clearAndSendKeys(currencyIndicatorTextField, accMaintainTransactionEntity.getStringValueForField("CurrencyIndicator"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				clearAndSendKeys(currencyRateTextField, accMaintainTransactionEntity.getStringValueForField("CurrencyRate"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherAmount")) {
				clearAndSendKeys(voucherAmountTextField, accMaintainTransactionEntity.getStringValueForField("VoucherAmount"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigReferenceType")) {
				selectValueFromList(referenceTypeDropdown, accMaintainTransactionEntity.getStringValueForField("ReferenceType"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigReferenceNo")) {
				clearAndSendKeys(referenceNoTextField, accMaintainTransactionEntity.getStringValueForField("ReferenceNo"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigNarration")) {
				clearAndSendKeys(narrationTextField, accMaintainTransactionEntity.getStringValueForField("Narration"));
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBankCashGLCode")) {
				clearAndSendKeys(Bank_Cash_GL_CodeTextField, accMaintainTransactionEntity.getStringValueForField("BankCashGLCode"));
			}

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBankCashGLName")) {
				clearAndSendKeys(Bank_Cash_GL_NameTextField, accMaintainTransactionEntity.getStringValueForField("BankCashGLName"));
			}
		}

		else if(accMaintainTransactionEntity.getAction().equalsIgnoreCase("verify")){
			AccMaintainTransactionEntity actualAccMaintainTransactionEntity=new AccMaintainTransactionEntity();

			/*if (accountDistributionEntity.getBooleanValueForField("ConfigTransactionCurrencyNIA")) {
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("TransactionCurrencyNIA"),fetchValueFromFields(transactionCurrencyNIALabel), AssertionType.WARNING);
			}
			*/
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCompany")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("Company").trim(),fetchValueFromFields(companyDropdown).trim(), AssertionType.WARNING);
			}

			/*
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBranch")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("Branch"),fetchValueFromTextFields(branchTextField), AssertionType.WARNING);
			}
			
			*/

			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("VoucherNumber"),fetchValueFromFields(voucherNumberLabel), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(accMaintainTransactionEntity.getStringValueForField("VoucherDate")),fetchValueFromTextFields(voucherDateTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherType")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("VoucherType"),fetchValueFromList(voucherTypeDropdown), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionMode")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("TransactionMode"),fetchValueFromList(transactionModeDropdown), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionRuleCode")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("TransactionRuleCode"),fetchValueFromTextFields(transactionRuleCodeTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigTransactionRuleDesc")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("TransactionRuleDesc"),fetchValueFromTextFields(transactionRuleDescTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCurrencyIndicator")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("CurrencyIndicator"),fetchValueFromTextFields(currencyIndicatorTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("CurrencyRate"),fetchValueFromTextFields(currencyRateTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigVoucherAmount")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("VoucherAmount"),fetchValueFromTextFields(voucherAmountTextField), AssertionType.WARNING);
			}
			/*if (accMaintainTransactionEntity.getBooleanValueForField("ConfigReferenceType")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("ReferenceType"),fetchValueFromTextFields(referenceTypeDropdown), AssertionType.WARNING);
			}*/
			/*if (accMaintainTransactionEntity.getBooleanValueForField("ConfigReferenceNo")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("ReferenceNo"),fetchValueFromTextFields(referenceNoTextField), AssertionType.WARNING);
			}*/
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigNarration")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("Narration"),fetchValueFromTextFields(narrationTextField), AssertionType.WARNING);
			}
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigNarrationDescription")) {
			assertReference.assertEquals(true,fetchValueFromFields(narrationTextField).contains(accMaintainTransactionEntity.getStringValueForField("NarrationDescription")),AssertionType.WARNING);
		}
			
			/*
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBankCashGLCode")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("BankCashGLCode"),fetchValueFromTextFields(Bank_Cash_GL_CodeTextField), AssertionType.WARNING);
			}
			if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBankCashGLName")) {
				assertReference.assertEquals(accMaintainTransactionEntity.getStringValueForField("BankCashGLName"),fetchValueFromTextFields(Bank_Cash_GL_NameTextField), AssertionType.WARNING);
			}
			*/	
		}
	}

	public void submitAccountingTransactionDetails(AccMaintainTransactionEntity accMaintainTransactionEntity ) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigAccDistributionButton")) {
			click(accountDistributionButton);
			switchToFrame("display");
			isElementDisplayed(accountingDistributionTitle);
		}
	}
	public void backFromAccountingTransactionDetails (AccMaintainTransactionEntity accMaintainTransactionEntity ) {
		if (accMaintainTransactionEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(accountingTransactionSearchPageTitle));
		}
	}
	
	// // for AccountingTransactionDetailsPage and AccountingAccountingDistributionPage
	
	//AccountingAccountingDistributionPage accountingAccountingDistributionPage=new AccountingAccountingDistributionPage(driver, "Account Distribution");
	public void fillandSubmitAccountingTransactionDetails (AccMaintainTransactionEntity accMaintainTransactionEntity,CustomAssert assertReference ) throws InterruptedException {

		switchToFrame("display");
		fillAccountingTransactionDetails(accMaintainTransactionEntity, assertReference);
		submitAccountingTransactionDetails(accMaintainTransactionEntity);
		//backFromAccountingTransactionDetails(accountingEntity);
		
		//accountingAccountingDistributionPage.FillandSubmitAccountingDistributionDetails(accountingAccSeachEntity, assertReference);
		}
	}

