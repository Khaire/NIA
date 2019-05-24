package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstrumentDetailsEntity;

public class MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage extends BasePage{

	private PageElement instrumentListTitle;
	private PageElement accountingTransactionDetailsTitle;
	private PageElement accountTransactionTitle;
	private PageElement instrumentDetailTitle;
	private PageElement companyLabel;
	private PageElement voucherTypeLabel;
	private PageElement voucherNumberLabel;
	private PageElement voucherAmountLabel;
	private PageElement voucherCurrencyLabel;
	private PageElement currenyRateLabel;
	private PageElement backButton;
	private PageElement instrumentNoLink;

	//This Page Consists a Table too.

	public MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage(
			WebDriver driver, String pageName) {
		super(driver, pageName);

		instrumentListTitle = new PageElement(By.xpath("//b[contains(text(),'Instrument List')]"), "Instrument List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountingTransactionDetailsTitle = new PageElement(By.xpath("//b//font[contains(text(),'Transaction Details')]')]"), "Accounting Transaction Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountTransactionTitle = new PageElement(By.xpath("//td//font//a//b[contains(text(),'Transaction')]')]"), "A/c Transaction Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		instrumentDetailTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Instrument Detail')]"), "Instrument Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		companyLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Company")), "Company Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherTypeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Voucher Type")), "Voucher Type Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Voucher Number")), "Voucher Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherAmountLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Voucher Amount")), "Voucher Amount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherCurrencyLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Voucher Currency")), "Voucher Currency Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currenyRateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0250", "Curreny Rate")), "Curreny Rate Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 


	}

	public void navigateToAccountTransaction(InstrumentDetailsEntity instrumentDetailsEntity){
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigAcTransaction")){
			click(accountTransactionTitle);
			switchToFrame("display");
			if(isElementDisplayed(accountingTransactionDetailsTitle));
			return;
		}
	}

	public void navigateToInstrumentDetail(InstrumentDetailsEntity instrumentDetailsEntity){
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigInstrumentDetail")){
			click(instrumentDetailTitle);
			switchToFrame("display");
			if(isElementDisplayed(instrumentListTitle));
			return;
		}
	}


	public void fillInstrumentListDetails(InstrumentDetailsEntity instrumentDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(instrumentDetailsEntity.getAction().equalsIgnoreCase("verify")){
			InstrumentDetailsEntity actualInstrumentDetailsEntity=new InstrumentDetailsEntity();
			if (instrumentDetailsEntity.getBooleanValueForField("ConfigCompany")) {
				actualInstrumentDetailsEntity.setStringValueForField("Company", fetchValueFromFields(companyLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("Company"), actualInstrumentDetailsEntity.getStringValueForField("Company"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherType")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherType", fetchValueFromFields(voucherTypeLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherType"), actualInstrumentDetailsEntity.getStringValueForField("VoucherType"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherNumber", fetchValueFromFields(voucherNumberLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherNumber"), actualInstrumentDetailsEntity.getStringValueForField("VoucherNumber"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherAmount")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherAmount", fetchValueFromFields(voucherAmountLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherAmount"), actualInstrumentDetailsEntity.getStringValueForField("VoucherAmount"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherCurrency")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherCurrency", fetchValueFromFields(voucherCurrencyLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherCurrency"), actualInstrumentDetailsEntity.getStringValueForField("VoucherCurrency"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				actualInstrumentDetailsEntity.setStringValueForField("CurrencyRate", fetchValueFromFields(currenyRateLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("CurrencyRate"), actualInstrumentDetailsEntity.getStringValueForField("CurrencyRate"), AssertionType.WARNING);
			}

		}
	}
	public void backFromInstrumentDetails(InstrumentDetailsEntity instrumentDetailsEntity) {
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	
	public void selectInstrumentNo(InstrumentDetailsEntity instrumentDetailsEntity)
	{
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigSearchInstrumentNo")){
			instrumentNoLink=new PageElement(By.xpath("//a[contains(text(),'"+instrumentDetailsEntity.getStringValueForField("InstrumentNo")+"')]"), "instrument Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(instrumentNoLink);
		}
		
		
	}
	
	

	public void fillAndSubmitInstrumentListDetails(InstrumentDetailsEntity instrumentDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillInstrumentListDetails(instrumentDetailsEntity, assertReference);
		navigateToAccountTransaction(instrumentDetailsEntity);
		navigateToInstrumentDetail(instrumentDetailsEntity);
		selectInstrumentNo(instrumentDetailsEntity);
	}
}









