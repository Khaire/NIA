package com.aqm.staf.library.pages.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
//import com.aqm.staf.library.databin.AccountingAccSeachEntity;
//import com.aqm.staf.library.databin.AccountingAccSeachEntity;
import com.aqm.staf.library.databin.AccountDistributionEntity;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.AccountingDistributionTable;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;


public class AccountingAccountingDistributionPage extends WebPage {

	private PageElement accountingDistributionTitle;
	private PageElement companyLabel;
	private PageElement voucherTypeLabel;
	private PageElement voucherNumberLabel;
	private PageElement transactionDateLabel;
	private PageElement voucherAmountLabel;
	private PageElement CurrencyIndicatorLabel;
	private PageElement currencyRateLabel;
	private PageElement receivingPartyTextField;
	private PageElement saveButton;
	private PageElement reverseButton;
	private PageElement sendSMSButton;
	private PageElement printChequeButton;
	private PageElement backButton;
	private PageElement accountingTransactionDetailsPageTitle;
	private PageElement accountingSMSTitle;

	private PageElement accountingTransactionTab;
	private PageElement instrumentDetailTab;
	private PageElement instrumentListTitle;
	private PageElement voucherAmountTransactionCurrencyLabel;

	//Table
	private PageElement glCodeTextField;
	//private PageElement glCode1TextField;
	//private PageElement glCode2TextField;
	private PageElement glDescription;
	private PageElement debitCredit;
	private PageElement amount;
	private PageElement glDescription1;
	private PageElement glDescription2;
	private PageElement searchGLCodeButton;
	private PageElement glDescription1FindButton;
	private PageElement glDescription2FindButton;
	private PageElement gLCodeNoLink;
	private PageElement postButton;
	private PageElement closeWindowButton;
	private PageElement transactionCurrencyNIALabel;
	private PageElement reversalMsgField;
	private PageElement confirmBtn;
	private PageElement reasonForInitiatingThisActionTextField;
	private PageElement userIdLabel;
	private PageElement roleLabel;
	public AccountingAccountingDistributionPage(WebDriver driver,String pageName,int rowcount) {
		super(driver, pageName);

		accountingDistributionTitle = new PageElement(By.xpath("//div//b[contains(text(),'Accounting Distribution')]"), "Accounting Distribution Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//accountTransactionTitle = new PageElement(By.xpath("//div//b[contains(text(),'A/c Transaction')]"), "A/c Transaction Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//instrumentDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Instrument Detail')]"), "Instrument Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		companyLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Company")), "Company Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherTypeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Voucher Type")), "Voucher Type Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherNumberLabel = new PageElement(By.xpath("//table[3]//tbody/tr[2]/td[2]"), "Voucher Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//voucherNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Voucher Number")), "Voucher Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		transactionDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Transaction Date")), "Transaction Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherAmountLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Voucher Amount")), "Voucher Amount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		CurrencyIndicatorLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Transaction Currency")), "Transaction Currency Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currencyRateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0160", "Currency Rate")), "Currency Rate Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		receivingPartyTextField = new PageElement(By.name("pInvlovedParty"), "Receiving Party TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reverseButton = new PageElement(By.name("Reverse"), "Reverse Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sendSMSButton = new PageElement(By.name("Send SMS"), "Send SMS Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		printChequeButton = new PageElement(By.name("Print"), "Print Cheque Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		accountingTransactionDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Transaction')]"), "Accounting Transaction Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingSMSTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Accounting SMS')]"), "Accounting SMS Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingTransactionTab=new PageElement(By.xpath("//div//b[contains(text(),'Transaction')]"), "Accounting Transaction Tab ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		instrumentDetailTab=new PageElement(By.xpath("//div//b[contains(text(),'Instrument Detail')]"), " Instrument Detail Tab ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		instrumentListTitle= new PageElement(By.xpath("//div//b[contains(text(),'Instrument List')]"), "Instrument List Detail Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voucherAmountTransactionCurrencyLabel=new PageElement(By.xpath(genericLocatorforLabel("S0160", "Voucher Amount(Transaction Currency)")), "Voucher Amount(Transaction Currency) Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table -//@Rasika

		glCodeTextField= new PageElement(By.name("pGLCode"), "GL Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*glCode1TextField= new PageElement(By.name("pGLCode1"), "GL Code 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		glCode2TextField= new PageElement(By.name("pGLCode2"), "GL Code 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 */glDescription1 = new PageElement(By.name("pDescription1"), "GL Description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 glDescription2 = new PageElement(By.name("pDescription2"), "GL Description 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 glDescription1FindButton=new PageElement(By.xpath("//input[@name='pDescription1']/following::a[@name='firstFocus']"), "GL Description1 Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 glDescription2FindButton=new PageElement(By.xpath("//input[@name='pDescription2']/following::a[@name='firstFocus']"), "GL Description2 Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 searchGLCodeButton = new PageElement(By.name("Search"),"Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 postButton = new PageElement(By.name("Post"),"Post Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 closeWindowButton = new PageElement(By.name("CloseWin"),"Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 transactionCurrencyNIALabel=new PageElement(By.xpath("//form[@name='S0160']//td//b[contains(text(),'Transaction Currency')]/following::td[3]"), "Transaction Currency NIA Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 reversalMsgField=new PageElement(By.xpath("//td//font//b[contains(text(),'Error Message:')]/following::td"), "reversal Msg Field Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 confirmBtn =new PageElement(By.name("btnSendSMS"),"Confirm Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 reasonForInitiatingThisActionTextField =new PageElement(By.name("pSMSText"), "Reason For Initiating This Action on collection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 userIdLabel=new PageElement(By.xpath("//font/b[contains(text(),'User Id')]"), "user Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 roleLabel=new PageElement(By.xpath("//font/b[contains(text(),'Role')]"), "role Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillAccountingDistributionDetails(AccountDistributionEntity accountDistributionEntity, CustomAssert assertReference) throws InterruptedException{
		if(accountDistributionEntity.getAction().equalsIgnoreCase("add") || accountDistributionEntity.getAction().equalsIgnoreCase("edit")){

			// table - @Rasika
			if (accountDistributionEntity.getBooleanValueForField("ConfigGLDescription1")) {
				selectGlCode1(accountDistributionEntity);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigGLDescription2")) {
				selectGlCode2(accountDistributionEntity);
			}
		}

		else if(accountDistributionEntity.getAction().equalsIgnoreCase("verify")){
			AccountDistributionEntity actualAccountDistributionEntity=new AccountDistributionEntity();

			if (accountDistributionEntity.getBooleanValueForField("ConfigCompany")) {
				//actualAccountDistributionEntity.setStringValueForField("Company", fetchValueFromFields(companyLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("Company"),fetchValueFromFields(companyLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigVoucherType")) {
				//actualAccountDistributionEntity.setStringValueForField("VoucherType", fetchValueFromFields(voucherTypeLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("VoucherType"),fetchValueFromFields(voucherTypeLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				//actualAccountDistributionEntity.setStringValueForField("VoucherNumber", fetchValueFromFields(voucherNumberLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("VoucherNumber"),fetchValueFromFields(voucherNumberLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigTransactionDate")) {
				//actualAccountDistributionEntity.setStringValueForField("TransactionDate", fetchValueFromFields(transactionDateLabel));
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(accountDistributionEntity.getStringValueForField("TransactionDate")),fetchValueFromFields(transactionDateLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigVoucherAmount")) {
				//actualAccountDistributionEntity.setStringValueForField("VoucherAmount", fetchValueFromFields(voucherAmountLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("VoucherAmount"),fetchValueFromFields(voucherAmountLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigCurrencyIndicator")) {
				//actualAccountDistributionEntity.setStringValueForField("CurrencyIndicator", fetchValueFromFields(CurrencyIndicatorLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("CurrencyIndicator"),fetchValueFromFields(CurrencyIndicatorLabel), AssertionType.WARNING);
			} 
			if (accountDistributionEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				//actualAccountDistributionEntity.setStringValueForField("CurrencyRate", fetchValueFromFields(currencyRateLabel));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("CurrencyRate"),fetchValueFromFields(currencyRateLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigReceivingParty")) {
				//actualAccountDistributionEntity.setStringValueForField("ReceivingParty", fetchValueFromFields(receivingPartyTextField));
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("ReceivingParty"),fetchValueFromFields(receivingPartyTextField), AssertionType.WARNING);
			}
			//Abhijit
			if (accountDistributionEntity.getBooleanValueForField("ConfigVoucherAmountTransCurrency")) {
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("VoucherAmountTransCurrency"),fetchValueFromFields(voucherAmountTransactionCurrencyLabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigTransactionCurrencyNIA")) {
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("TransactionCurrencyNIA"),fetchValueFromFields(transactionCurrencyNIALabel), AssertionType.WARNING);
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigUserId")) {
				switchToFrame("head");
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("UserId"),fetchValueFromFields(userIdLabel), AssertionType.WARNING);
				switchToFrame("display");
			}
			if (accountDistributionEntity.getBooleanValueForField("ConfigRole")) {
				switchToFrame("head");
				assertReference.assertEquals(accountDistributionEntity.getStringValueForField("Role"),fetchValueFromFields(roleLabel), AssertionType.WARNING);
				switchToFrame("display");
			}

		}
	}


	public void fillAccountingDistributionTable(AccountDistributionEntity accountDistributionEntity, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		List<AccountingDistributionTable> accountingDistributionTableList = testData.getAccountingDistributionTablesRecords();
		//table 
		for(AccountingDistributionTable accountingDistributionTableData : accountingDistributionTableList){
			if (accountDistributionEntity.getParentKey().equalsIgnoreCase(accountingDistributionTableData.getChildKey())){
				int TableRowNumber = accountingDistributionTableData.getIntegerValueForField("TableRowNumber");
				int datarow =TableRowNumber+1; 
				if (accountingDistributionTableData.getBooleanValueForField("ConfigGLCode")) {
					glCodeTextField= new PageElement(By.name("pGLCode"+TableRowNumber), "GL Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(accountingDistributionTableData.getStringValueForField("GLCode"),
							fetchValueFromTextFields(glCodeTextField),AssertionType.WARNING);
				}
				if (accountingDistributionTableData.getBooleanValueForField("ConfigGLDescription")) {
					glDescription = new PageElement(By.name("pDescription"+TableRowNumber), "GL Description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(true, fetchValueFromTextFields(glDescription).contains(accountingDistributionTableData.getStringValueForField("GLDescription")), AssertionType.WARNING);
					//Ashutosh 20-06-2018 Purpose(To fetch expected and actual values in log)
					//assertReference.assertEquals(accountingDistributionTableData.getStringValueForField("GLDescription").trim(), fetchValueFromTextFields(glDescription).trim(), AssertionType.WARNING);
				}
				if (accountingDistributionTableData.getBooleanValueForField("ConfigDebitCredit")) {

					debitCredit = new PageElement(By.xpath("//table//tr["+datarow+"]/td[4]//select"), "Debit credit dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(accountingDistributionTableData.getStringValueForField("DebitCredit"),
							fetchValueFromList(debitCredit),AssertionType.WARNING);
				}
				if (accountingDistributionTableData.getBooleanValueForField("ConfigAmount")) {
					amount = new PageElement(By.xpath("//table/tbody/tr["+datarow+"]/td[5]/input"), "Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(accountingDistributionTableData.getStringValueForField("Amount"),
							fetchValueFromTextFields(amount),AssertionType.WARNING);
				}
			}
		}
	} 






	public void submitAccountingDistributionDetails (AccountDistributionEntity accountDistributionEntity) throws InterruptedException {
		if (accountDistributionEntity.getBooleanValueForField("ConfigSaveButton")) {
			switchToWindow();
			switchToFrame("display");
			click(saveButton);
			switchToWindow();
			fetchVoucherNumber(accountDistributionEntity);
			switchToFrame("display");
		}
	}
	//@Rasika
	public void clickOnPostButton(AccountDistributionEntity accountDistributionEntity) throws InterruptedException {
		if (accountDistributionEntity.getBooleanValueForField("ConfigPostButton")) {
			click(postButton);
			Thread.sleep(3000);
			switchToWindow("Error Window");
			if (accountDistributionEntity.getBooleanValueForField("ConfigCloseButton")) {
				click(closeWindowButton);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}

	/*************Voucher No**************/
	//@Rasika
	public void fetchVoucherNumber(AccountDistributionEntity accountDistributionEntity) {
		switchToFrame("display");
		String text = fetchValueFromFields(voucherNumberLabel);
		//String text = voucherNumberLabel.getWebElement().getText();
		accountDistributionEntity.setStringValueForField("VoucherNumber", fetchValueFromFields(voucherNumberLabel));
	} 

	public void clickReverse (AccountDistributionEntity accountDistributionEntity,CustomAssert assertReference) throws InterruptedException {
		if (accountDistributionEntity.getBooleanValueForField("ConfigReverseButton")) {
			click(reverseButton);
			//if(isElementDisplayed());    yes No Pop up is opened
			Thread.sleep(100);
			try{
				fillReason(accountDistributionEntity) ;
				switchToWindow("Error Window");
				fetchReversalmsg(accountDistributionEntity,assertReference);
				click(closeWindowButton);
				switchToWindow();
				switchToFrame("display");
			}
			catch(Exception e){
				click(closeWindowButton);
				switchToWindow();
				switchToFrame("display");
			}
			return;

		}
	}

	public void fetchReversalmsg(AccountDistributionEntity accountDistributionEntity,CustomAssert assertReference){
		String ErrorMessageTxt;
		ErrorMessageTxt=fetchValueFromFields(reversalMsgField);
		assertReference.assertEquals(accountDistributionEntity.getStringValueForField("ReversalMessage"),ErrorMessageTxt,AssertionType.WARNING);
	}

	public void fillReason(AccountDistributionEntity accountDistributionEntity) throws InterruptedException{
		switchToWindow("Accounts Reverse");
		if(accountDistributionEntity.getBooleanValueForField("ConfigReasonForInitiate")){
			clearAndSendKeys(reasonForInitiatingThisActionTextField,accountDistributionEntity.getStringValueForField("ReasonForInitiate") );
		}
		click(confirmBtn);
		//switchToWindow();
	}

	public void clickSendSMS (AccountDistributionEntity accountDistributionEntity) {
		if (accountDistributionEntity.getBooleanValueForField("ConfigSendSMSButton")) {
			click(sendSMSButton);
			switchToFrame("display");
			isElementDisplayed(accountingSMSTitle);
		}
	}
	public void clickPrintCheque (AccountDistributionEntity accountDistributionEntity) {
		if (accountDistributionEntity.getBooleanValueForField("ConfigPrintChequeButton")) {
			click(printChequeButton);
			switchToFrame("display");
		}
	}
	public void backFromAccountingDistributionDetails (AccountDistributionEntity accountDistributionEntity) {
		if (accountDistributionEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(accountingTransactionDetailsPageTitle));
			click(backButton);
		}
	}

	public void navigateToAccountingTransactionTab(AccountDistributionEntity accountDistributionEntity){
		if (accountDistributionEntity.getBooleanValueForField("ConfigAccountingTransactionTab")){		
			click(accountingTransactionTab);
			switchToFrame("display");
			if(isElementDisplayed(accountingTransactionDetailsPageTitle));
			return;
		}
	}
	public void navigateToInstrumentDetailTab(AccountDistributionEntity accountDistributionEntity){
		if (accountDistributionEntity.getBooleanValueForField("ConfigInstrumentDetailTab")){		
			click(instrumentDetailTab);
			switchToFrame("display");
			if(isElementDisplayed(instrumentListTitle));
			return;
		}
	}

	//TABLE - GL Code Search //
	//@Rasika
	public void selectGlCode1(AccountDistributionEntity accountDistributionEntity) throws InterruptedException{
		click(glDescription1FindButton);
		switchToWindow("Account Search");
		clearAndSendKeys(glCodeTextField, accountDistributionEntity.getStringValueForField("GLCode1"));
		click(searchGLCodeButton);
		gLCodeNoLink=new PageElement(By.linkText(accountDistributionEntity.getStringValueForField("GLCode1")), "GL Code Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(gLCodeNoLink);
		Thread.sleep(1000);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}

	public void selectGlCode2(AccountDistributionEntity accountDistributionEntity) throws InterruptedException{
		click(glDescription2FindButton);
		switchToWindow("Account Search");
		clearAndSendKeys(glCodeTextField, accountDistributionEntity.getStringValueForField("GLCode2"));
		click(searchGLCodeButton);
		gLCodeNoLink=new PageElement(By.linkText(accountDistributionEntity.getStringValueForField("GLCode2")), "GL Code Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(gLCodeNoLink);
		Thread.sleep(1000);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}

	public void fetchGLDescriptionCode(AccountDistributionEntity accountDistributionEntity){
		if(accountDistributionEntity.getBooleanValueForField("ConfigFetchGLDescriptionCode")){
			int TableRowNumber = accountDistributionEntity.getIntegerValueForField("TableRowNumber");
			glDescription = new PageElement(By.name("pDescription"+TableRowNumber), "GL Description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			accountDistributionEntity.setStringValueForField("GLDescriptionCode", fetchValueFromTextFields(glDescription));
		}
	}


	public void fillandSubmitAccountingDistributionDetails(AccountDistributionEntity accountDistributionEntity,CustomAssert assertReference,ScenarioTestData testData ) throws InterruptedException {

		switchToFrame("display");
		fillAccountingDistributionDetails(accountDistributionEntity, assertReference);
		// Verify Table Data
		fillAccountingDistributionTable(accountDistributionEntity, assertReference,testData);
		submitAccountingDistributionDetails(accountDistributionEntity);
		clickOnPostButton(accountDistributionEntity);
		navigateToAccountingTransactionTab(accountDistributionEntity);
		navigateToInstrumentDetailTab(accountDistributionEntity);
		clickReverse(accountDistributionEntity,assertReference);
		clickSendSMS(accountDistributionEntity);
		clickPrintCheque(accountDistributionEntity);	
		fetchGLDescriptionCode(accountDistributionEntity);
		backFromAccountingDistributionDetails(accountDistributionEntity);
	}
}



