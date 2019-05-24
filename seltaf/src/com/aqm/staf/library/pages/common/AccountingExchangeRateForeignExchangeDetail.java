package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ForeignExchangeDetailEntity;

public class AccountingExchangeRateForeignExchangeDetail extends BasePage{

	private PageElement foreignExchangeDetailTitle;
	private PageElement transactionDateTextField;
	private PageElement currencyTextField;
	private PageElement exchangeRateTextField;
	private PageElement backButton;
	private PageElement saveButton;

	public AccountingExchangeRateForeignExchangeDetail(WebDriver driver,
			String pageName) {
		super(driver, pageName);

		foreignExchangeDetailTitle = new PageElement (By.xpath("//div//b[contains(text(),'Foreign Exchange Detail')]"), "Foreign Exchange Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionDateTextField = new PageElement(By.name("pExchangeDate"), "Transaction Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyTextField = new PageElement(By.name("pCurrency"), "Currency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exchangeRateTextField = new PageElement(By.name("pExchangeRate"), "Exchange Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity, CustomAssert assertReference) throws InterruptedException{
		if(foreignExchangeDetailEntity.getAction().equalsIgnoreCase("add") || foreignExchangeDetailEntity.getAction().equalsIgnoreCase("edit")){
			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigTransactionDate")) {
				String TransactionDate=RandomCodeGenerator.dateGenerator(foreignExchangeDetailEntity.getStringValueForField("TransactionDate"));
				clearAndEnterDate(transactionDateTextField, TransactionDate);
			}

			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigCurrency")) {
				String Currency=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(currencyTextField,Currency);
				foreignExchangeDetailEntity.setStringValueForField("Currency",Currency );
			}
			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigExchangeRate")) {
				String ExchangeRate=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(exchangeRateTextField,ExchangeRate);
				foreignExchangeDetailEntity.setStringValueForField("ExchangeRate",ExchangeRate );
			}
		}

		else if(foreignExchangeDetailEntity.getAction().equalsIgnoreCase("verify")){
			ForeignExchangeDetailEntity actualForeignExchangeDetailEntity=new ForeignExchangeDetailEntity();

			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigTransactionDate")) {
				actualForeignExchangeDetailEntity.setStringValueForField("TransactionDate", fetchValueFromTextFields(transactionDateTextField));
				assertReference.assertEquals(foreignExchangeDetailEntity.getStringValueForField("TransactionDate"), actualForeignExchangeDetailEntity.getStringValueForField("TransactionDate"), AssertionType.WARNING);
			}

			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigCurrency")) {
				actualForeignExchangeDetailEntity.setStringValueForField("Currency", fetchValueFromTextFields(currencyTextField));
				assertReference.assertEquals(foreignExchangeDetailEntity.getStringValueForField("Currency"), actualForeignExchangeDetailEntity.getStringValueForField("Currency"), AssertionType.WARNING);
			}

			if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigExchangeRate")) {
				actualForeignExchangeDetailEntity.setStringValueForField("ExchangeRate", fetchValueFromTextFields(exchangeRateTextField));
				assertReference.assertEquals(foreignExchangeDetailEntity.getStringValueForField("ExchangeRate"), actualForeignExchangeDetailEntity.getStringValueForField("ExchangeRate"), AssertionType.WARNING);
			}
		}
	}


	public void backFromForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity) {
		if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(foreignExchangeDetailTitle));
			return;
		}
	}
	
	public void saveDetailForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity) {
		if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			return;
		}
	}


	public void fillAndSubmitForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillForeignExchangeDetail(foreignExchangeDetailEntity, assertReference);
		saveDetailForeignExchangeDetail(foreignExchangeDetailEntity);
	}
}
























