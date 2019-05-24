package com.aqm.staf.library.pages.reinsurance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntityReinsurance;
import com.aqm.staf.library.databin.TreatyCreateEntity;

public class ReinsuranceCreateandeditTreaty extends WebPage {

	private PageElement Treaty;
	private PageElement TreatyField1;
	private PageElement TreatyField2;

	private PageElement treatyEffectiveFrom;
	private PageElement currency;
	private PageElement currencyType;

	private PageElement treatyType;
	private PageElement treatyStartDate;
	private PageElement treatyStartdateSelect;
	private PageElement treatyEndDate;
	private PageElement treatyEndDateSelect;
	private PageElement accountingFrequency;
	private PageElement accountingFrequencylink;
	private PageElement validityTextField;
	private PageElement typeOfCurrencyLink;
	private PageElement saveButton;

	public ReinsuranceCreateandeditTreaty(WebDriver driver, String pageName) {
		super(driver, pageName);

		Treaty = new PageElement(By.xpath("//th[contains(text(),'Create Treaty')]"), "Treaty Details", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TreatyField1 = new PageElement(By.id("text1"), "Create Treaty Field 1", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TreatyField2 = new PageElement(By.id("text4"), "Create Treaty Field 2", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		treatyEffectiveFrom = new PageElement(By.xpath("//input[@name='txtEffectiveDate']"), "TreatyEffectiveFrom",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		currency = new PageElement(By.xpath("//label[contains(text(),'Currency')]//following::input[5]"), "CurrencyFindButton", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		treatyStartDate = new PageElement(By.xpath("//input[@name='txtStartDate']"), "TreatyStartDate", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		treatyEndDate = new PageElement(By.xpath("//input[@name='txtEndDate']"), "TreatyEndDate", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		accountingFrequency = new PageElement(By.id("submitAF"), "Accounting Frequency", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		validityTextField = new PageElement(By.xpath("//input[@name='txtValidity']"), "ValidityTextField", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.xpath("//input[@value='Save']"), "saveButton", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void filltreaty(TreatyCreateEntity treatypartyEntityreinsurance, CustomAssert assertReference)
			throws InterruptedException {
		// WebDriverWait wait =new WebDriverWait(driver, 30);

		if (treatypartyEntityreinsurance.getAction().equalsIgnoreCase("add")|| treatypartyEntityreinsurance.getAction().equalsIgnoreCase("edit")) {
		//	switchToFrame("display");

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyFieldOne")) {
				clearAndSendKeys(TreatyField1, treatypartyEntityreinsurance.getStringValueForField("TreatyFieldOne"));
			}

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyFieldTwo")) {
				clearAndSendKeys(TreatyField2, treatypartyEntityreinsurance.getStringValueForField("TreatyFieldTwo"));
			}
			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigvalidityTextField")) {
				clearAndSendKeys(validityTextField,treatypartyEntityreinsurance.getStringValueForField("validityTextField"));
			}

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigCurrency")) {
				switchToFrame("display");
				click(currency);
				switchToWindow("Generic Search");
				typeOfCurrencyLink = new PageElement(By.xpath("//a[contains(text(),'" + treatypartyEntityreinsurance.getStringValueForField("Currency") + "')]"),"Type Of Currency", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(typeOfCurrencyLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigAccountingFrequency")) {
				switchToFrame("display");
				click(accountingFrequency);
				switchToWindow("Generic Search");
				accountingFrequencylink = new PageElement(By.xpath("//a[contains(text(),'"+ treatypartyEntityreinsurance.getStringValueForField("ListofAccountingFrequency") + "')]"),"Accounting Frequency", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(accountingFrequencylink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyEffectiveFrom")) {
				String treatyEffectiveDate = RandomCodeGenerator.dateGenerator(treatypartyEntityreinsurance.getStringValueForField("TreatyEffectiveFrom"));
				clearAndSendKeys(treatyEffectiveFrom, treatyEffectiveDate);
			}

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyStartDate")) {
				String contractStartDate = RandomCodeGenerator.dateGenerator(treatypartyEntityreinsurance.getStringValueForField("TreatyStartDate"));
				clearAndSendKeys(treatyStartDate, contractStartDate);
			}
			// Date Function can be used instead of this

			if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigtreatyEndDate")) {
				String contractEndDate = RandomCodeGenerator.dateGenerator(treatypartyEntityreinsurance.getStringValueForField("treatyEndDate"));
				clearAndSendKeys(treatyStartDate, contractEndDate);
			} 
			
			//VERIFY
			
			else if (treatypartyEntityreinsurance.getAction().equalsIgnoreCase("verify")) {
			

				if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyFieldOne")) {
					assertReference.assertEquals(treatypartyEntityreinsurance.getStringValueForField("TreatyFieldOne"), fetchValueFromTextFields(TreatyField1), AssertionType.WARNING);
				}

				if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigTreatyFieldTwo")) {
					assertReference.assertEquals(treatypartyEntityreinsurance.getStringValueForField("TreatyFieldTwo"), fetchValueFromTextFields(TreatyField2), AssertionType.WARNING);

				}
				if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigvalidityTextField")) {
					assertReference.assertEquals(treatypartyEntityreinsurance.getStringValueForField("validityTextField"), fetchValueFromTextFields(validityTextField), AssertionType.WARNING);
				}
			
			}
		

			}
		}
	

	public void saveTreatyDetails(TreatyCreateEntity treatypartyEntityreinsurance) throws InterruptedException {
		if (treatypartyEntityreinsurance.getBooleanValueForField("ConfigSaveBtn")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click(saveButton);
			if (isAlertPresent()) {
				acceptAlertAndReturnConfirmationMessage();
			}
			if (isAlertPresent()) {
				acceptAlertAndReturnConfirmationMessage();
			}

			switchToFrame("display");
		}
	}

	public void fillandSubmitTreatyDetails(TreatyCreateEntity treatypartyEntityreinsurance,
			CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(treatypartyEntityreinsurance.getConfigExecute())) {
			
			filltreaty(treatypartyEntityreinsurance, assertReference);
			saveTreatyDetails(treatypartyEntityreinsurance);

		}
	}
}