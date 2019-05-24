package com.aqm.staf.library.pages.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountDistributionEntity;
import com.aqm.staf.library.databin.AccountingDistributionTable;
import com.aqm.staf.library.databin.CreditingDebitingAccTable;
import com.aqm.staf.library.databin.DebitCreditNoteEntity;
import com.aqm.staf.library.databin.GenericEntity;

public class AccountingDebitCreditNoteDetailsPage extends BasePage {

	private PageElement debitCreaditNotePageTitle;
	private PageElement companyLabel;
	private PageElement debitCreditNoteLabel;
	private PageElement debitCreditNoteNoLabel;
	private PageElement matchOrUnmatchLabel;
	private PageElement slAccountCodeTextField;
	private PageElement currencyCodeINRTextField;
	private PageElement currencyCodeTextField;
	private PageElement transactionAmountTextField;
	private PageElement amountINRTextField;
	private PageElement unadjustedAmountTextField;
	private PageElement debitCreditNoteDateTextField;
	private PageElement narrationTextArea;

	private PageElement printNotesButton;
	private PageElement backButton;
	//Table Fields
	private PageElement accountCodeTextField ; 
	private PageElement accountDescTextField ; 
	private PageElement accountTxnCurrTextField ; 
	private PageElement amountTableTextField ; 
	private PageElement debitCreditTableTextField ; 




	//table-Crediting/Debiting Accounts 


	public AccountingDebitCreditNoteDetailsPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		debitCreaditNotePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Debit/Credit Note')]"), "Debit/Credit Note Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyLabel = new PageElement(By.xpath(genericLocatorforLabel("frmDrCrSearch", "Company")), "Company Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debitCreditNoteLabel=new PageElement(By.xpath(genericLocatorforLabel("frmDrCrSearch", "Debit/Credit Note")), "Debit/Credit Note Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debitCreditNoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("frmDrCrSearch", "Debit/Credit Note No.")), "Debit/Credit Note No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		matchOrUnmatchLabel=new PageElement(By.xpath(genericLocatorforLabel("frmDrCrSearch", "Match/UnMatch")), "Match/UnMatch Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		slAccountCodeTextField = new PageElement(By.name("pGLCode"), "SL Account Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyCodeINRTextField = new PageElement(By.name("pCurrencyRate"), "Currency Code INR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyCodeTextField = new PageElement(By.name("pCurrency"), "Currency Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionAmountTextField = new PageElement(By.name("pTxnCurrAmount"), "Transaction Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountINRTextField = new PageElement(By.name("pLocalCurrAmount"), "Amount (INR) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unadjustedAmountTextField = new PageElement(By.name("pUnadjustedAmount"), "Unadjusted Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		debitCreditNoteDateTextField = new PageElement(By.name("pDrCrDate"), "Debit/Credit Note Date  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		narrationTextArea = new PageElement(By.name("pNarration"), "Narraxtion Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		printNotesButton= new PageElement(By.name("btnPrint"), "Print Notes Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton= new PageElement(By.name("back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void fillAccountingDebitCreditNoteDetailsPage(DebitCreditNoteEntity debitCreditNoteEntity, CustomAssert assertReference) throws InterruptedException{
		if(debitCreditNoteEntity.getAction().equalsIgnoreCase("verify")) {
			DebitCreditNoteEntity actualDebitCreditNoteEntity=new DebitCreditNoteEntity();

			/*if (policyMemberAttribute.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemberAttribute.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}*/
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigCompanyLabel")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("CompanyLabel"), fetchValueFromFields(companyLabel), AssertionType.WARNING);
			}	
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDebitCreditNoteLabel")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("DebitCreditNoteLabel"), fetchValueFromFields(debitCreditNoteLabel), AssertionType.WARNING);
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDebitCreditNoteNoLabel")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("DebitCreditNoteNoLabel"), fetchValueFromFields(debitCreditNoteNoLabel), AssertionType.WARNING);
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigMatchUnmatchLabel")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("MatchUnmatchLabel"), fetchValueFromFields(matchOrUnmatchLabel), AssertionType.WARNING);
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigCurrencyCode")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("CurrencyCode"), fetchValueFromTextFields(currencyCodeTextField), AssertionType.WARNING);
			}
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigCurrencyCodeINR")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("CurrencyCodeINR"), fetchValueFromTextFields(currencyCodeINRTextField), AssertionType.WARNING);
			}
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigTransactionAmount")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("TransactionAmount"), fetchValueFromTextFields(transactionAmountTextField), AssertionType.WARNING);
			}	
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigAmountINR")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("AmountINR"), fetchValueFromTextFields(amountINRTextField), AssertionType.WARNING);
			}	
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigUnadjustedAmount")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("UnadjustedAmount"), fetchValueFromTextFields(unadjustedAmountTextField), AssertionType.WARNING);
			}	
			
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDebitCreditNoteDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(debitCreditNoteEntity.getStringValueForField("DebitCreditNoteDate")), fetchValueFromTextFields(debitCreditNoteDateTextField), AssertionType.WARNING);
			}	
				
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigNarraction")) {
				assertReference.assertEquals(debitCreditNoteEntity.getStringValueForField("Narraction"), fetchValueFromTextFields(narrationTextArea), AssertionType.WARNING);
			}	
				
		}
	}

	public void clickOnPrintNotesButton(DebitCreditNoteEntity debitCreditNoteEntity) {
		if (debitCreditNoteEntity.getBooleanValueForField("ConfigPrintNotesButton")) {
			click(printNotesButton);
			//isElementDisplayed(debitCreaditNotePageTitle);
		}
	}
	public void backFromPolicySearch(DebitCreditNoteEntity debitCreditNoteEntity) {
		if (debitCreditNoteEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			isElementDisplayed(debitCreaditNotePageTitle);
		}
	}


	public void fillAndVerifyCreditDebitAccountingTable(CustomAssert assertReference, ScenarioTestData testData,DebitCreditNoteEntity debitCreditNoteEntity) throws InterruptedException{
		List<CreditingDebitingAccTable> creditingDebitingAccTableList = testData.getCreditingDebitingAccTableRecords();
		if(debitCreditNoteEntity.getParentKey().equalsIgnoreCase((debitCreditNoteEntity).getParentKey())){
			//table 
			for(CreditingDebitingAccTable creditingDebitingAccTableData : creditingDebitingAccTableList){
			if (debitCreditNoteEntity.getParentKey().equalsIgnoreCase(creditingDebitingAccTableData.getParentKey())){
				int TableRowNumber = creditingDebitingAccTableData.getIntegerValueForField("TableRowNumber");
				int datarow =TableRowNumber+2; //2 because data starts from 3rd row 
				if (creditingDebitingAccTableData.getBooleanValueForField("ConfigAccountCode")) {
					accountCodeTextField= new PageElement(By.id("Acc"+ (TableRowNumber-1)), "Account Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(creditingDebitingAccTableData.getStringValueForField("AccountCode"),
							fetchValueFromTextFields(accountCodeTextField),AssertionType.WARNING);
				}
				if (creditingDebitingAccTableData.getBooleanValueForField("ConfigAccountDesc")) {
					accountDescTextField= new PageElement(By.xpath("//tr["+datarow+"]/td[3]/input[contains(@name,'pDescAcc')]"), "Account Desc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(creditingDebitingAccTableData.getStringValueForField("AccountDesc"),
							fetchValueFromTextFields(accountDescTextField).trim(),AssertionType.WARNING);
				}
				if (creditingDebitingAccTableData.getBooleanValueForField("ConfigAccountTxnCur")) {
					accountTxnCurrTextField = new PageElement(By.id("TrnAmt"+ (TableRowNumber-1)), "Account Txn Cur TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(creditingDebitingAccTableData.getStringValueForField("AccountTxnCur"),
							fetchValueFromTextFields(accountTxnCurrTextField),AssertionType.WARNING);
				}
				if (creditingDebitingAccTableData.getBooleanValueForField("ConfigAmount")) {
					amountTableTextField= new PageElement(By.id("Amt"+(TableRowNumber-1)), "Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(creditingDebitingAccTableData.getStringValueForField("Amount"),
							fetchValueFromTextFields(amountTableTextField),AssertionType.WARNING);
				}
				if (creditingDebitingAccTableData.getBooleanValueForField("ConfigDebitCredit")) {
					debitCreditTableTextField= new PageElement(By.xpath("//tr["+datarow+"]/td[6]/input[contains(@name,'pDrCrInd')]"), "Debit Credit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					assertReference.assertEquals(creditingDebitingAccTableData.getStringValueForField("DebitCredit"),
							fetchValueFromTextFields(debitCreditTableTextField),AssertionType.WARNING);
				}

			}
		}
		click(backButton);
		} 
	}

	public void fillAndVerifyDebitCreditNoteDetails(DebitCreditNoteEntity debitCreditNoteEntity,CustomAssert assertReference ) throws InterruptedException {
		fillAccountingDebitCreditNoteDetailsPage(debitCreditNoteEntity, assertReference);
		clickOnPrintNotesButton(debitCreditNoteEntity);
	}
}
