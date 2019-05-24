package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AcctCoinsuranceVoucherEntity;

public class AccountingCoinsuranceVoucherConsolidationSummaryPage extends BasePage{

	private PageElement coinsuranceVoucherConsolidationSummaryTitle;
	private PageElement requestIdTextField;
	private PageElement coinsurancePartyCodeTextField;
	private PageElement coinsuranceSiteCodeTextField;
	private PageElement invoiceNumberTextfield;
	private PageElement backButton;


	public AccountingCoinsuranceVoucherConsolidationSummaryPage(WebDriver driver, String pageName) {

		super(driver, pageName);

		coinsuranceVoucherConsolidationSummaryTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coinsurance Voucher Consolidation Summary')]"), "Coinsurance Voucher Consolidation Summary Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		requestIdTextField = new PageElement(By.name("pRequestId"), "Request Id  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsurancePartyCodeTextField = new PageElement(By.name("pPartyCode1"), "Coinsurance Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsuranceSiteCodeTextField = new PageElement(By.name("pPartyCode2"), "Coinsurance Site Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//table

		invoiceNumberTextfield = new PageElement(By.xpath("//td//b[contains(text(),'Invoice Number')]/following::input"), "Invoice Number  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillCoinsuranceSummaryDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity, CustomAssert assertReference) {
		if(acctCoinsuranceVoucherEntity.getAction().equalsIgnoreCase("verify")){
			AcctCoinsuranceVoucherEntity actualAcctCoinsuranceVoucherEntity=new AcctCoinsuranceVoucherEntity();

			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigRequestId")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("RequestId", fetchValueFromTextFields(requestIdTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("RequestId"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("RequestId"), AssertionType.WARNING);
			}

			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsurancePartyCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("CoinsurancePartyCode", fetchValueFromTextFields(coinsurancePartyCodeTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"), AssertionType.WARNING);
			}

			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsuranceSiteCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("SelectEventCode", fetchValueFromTextFields(coinsuranceSiteCodeTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceSiteCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceSiteCode"), AssertionType.WARNING);
			}

			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("InvoiceNumber", fetchValueFromTextFields(invoiceNumberTextfield));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("InvoiceNumber"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("InvoiceNumber"), AssertionType.WARNING);
			}
		}
	}

	public void backFromSummaryPage(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity){
		if(acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigbackButton")){
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(coinsuranceVoucherConsolidationSummaryTitle));
			return;
		}
	}

	public void fillAndSubmitDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity,CustomAssert assertReference ){
		switchToFrame("display");
		fillCoinsuranceSummaryDetails(acctCoinsuranceVoucherEntity, assertReference);
		backFromSummaryPage(acctCoinsuranceVoucherEntity);
	}
}
