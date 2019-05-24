package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.PolicyEntity;

public class AccountingFrontPage extends BasePage{
	private PageElement maintainTrasactionLink;
	private PageElement maintainAccountTypeLink;
	private PageElement maintainGLSLAccountLink;
	private PageElement maintainTxnRuleLink;
	private PageElement exchangeRateLink;
	private PageElement debitCreditNotesLink;
	private PageElement collectionLink;
	private PageElement maintainBGCDLink;
	private PageElement maintainScrollLink;
	private PageElement chequeDishonourLink;
	private PageElement coinsuranceVoucherConsolidationLink;
	private PageElement helpLink;
	private PageElement proceedButton;
	private PageElement accountingPage;
	private PageElement accountingFrontPageTitle;
	private PageElement voucherNumberTextField;
	private PageElement bGCdSearchPageTitle;
	private PageElement accountingTransactionSearchPagetitle;

	public AccountingFrontPage(WebDriver driver, String pageName){	
		super(driver, pageName);
		accountingFrontPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Company Selection')]"), "Company Selection Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maintainAccountTypeLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Account Type')]"), "Maintain Account Type Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainTrasactionLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Transaction')]"), "Maintain Transaction Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainGLSLAccountLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain GL/SL Account')]"), "Maintain GL/SL Account Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainTxnRuleLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Txn Rule')]"), "Maintain Txn Rule Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exchangeRateLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Exchange Rate')]"), "Exchange Rate Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		debitCreditNotesLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Debit/Credit Notes')]"), "Debit/Credit Notes Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Collection')]"), "Collection Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainBGCDLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain BG/CD')]"), "MaintainBGCD Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainScrollLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Scroll')]"), "MaintainScroll Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		chequeDishonourLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Cheque Dishonour')]"), "ChequeDishonour Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coinsuranceVoucherConsolidationLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Coinsurance Voucher Consolidation')]"), "CoinsuranceVoucherConsolidation Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		helpLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Help')]"), "Help Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton=new PageElement(By.name("Proceed"),"ProceedButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		accountingPage=new PageElement(By.linkText("Accounting"), "Account Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		voucherNumberTextField= new PageElement(By.name("pVoucherNo"), "Voucher Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountingFrontPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Company Selection')]"), "Company Selection Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bGCdSearchPageTitle =  new PageElement(By.xpath("//div//b[contains(text(),'Bank Gurantee')]"), "Bank Gurantee/Cash Deposit Search", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountingTransactionSearchPagetitle =  new PageElement(By.xpath("//div//b[contains(text(),'Accounting')]"), "Accounting Transaction Search", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}

	public void navigateToAccountingFrontPage(){
		navigateToAccountingPage();
		switchToFrame("display");
		isElementDisplayed(accountingFrontPageTitle);
	}
	public void navigateToMaintainTrasactionType(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainTrasactionType")){		
			click(maintainAccountTypeLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToMaintainGLSLAccountLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainGLSLAccount")){
			switchToFrame("Control");
			click(maintainGLSLAccountLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateTomaintainTxnRuleLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainTxnRule")){
			switchToFrame("Control");
			click(maintainTxnRuleLink);
			switchToFrame("display");
			return;
		}
	}

	public void navigateTomaintainTrasactionLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainTrasaction")){
			switchToFrame("Control");
			click(maintainTrasactionLink);
			switchToFrame("display");
			isElementDisplayed(accountingTransactionSearchPagetitle);
		}
	}
	public void navigateToExchangeRateLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigExchangeRate")){
			switchToFrame("Control");
			click(exchangeRateLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToDebitCreditNotesLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigDebitCreditNotes")){		
			switchToFrame("Control");
			click(debitCreditNotesLink);
			switchToFrame("display");
			return;
		}
	}
	//@ akshata
	public void navigateToCollectionLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigCollection")){	
			switchToFrame("Control");
			click(collectionLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToMaintainBGCDLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainBGCD")){	
			switchToFrame("Control");
			click(maintainBGCDLink);
			switchToFrame("display");
		}
	}
	public void navigateToMaintainScrollLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigMaintainScroll")){
			switchToFrame("Control");
			click(maintainScrollLink);
			switchToFrame("display");
		}
	}
	public void navigateToChequeDishonourLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigChequeDishonour")){		
			switchToFrame("Control");
			click(chequeDishonourLink);
			switchToFrame("display");
		}
	}
	public void navigateToCoinsuranceVoucherConsolidationLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigCoinsuranceVoucherConsolidation")){
			switchToFrame("Control");
			click(coinsuranceVoucherConsolidationLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateTohelpLink(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigHelp")){
			switchToFrame("Control");
			click(helpLink);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnProceedButton(AccountingEntity accountingEntity){
		if (accountingEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(proceedButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitAccountingFrontPage(AccountingEntity accountingEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(accountingEntity.getConfigExecute())){
			clickOnProceedButton(accountingEntity);
			/*navigateToMaintainTrasactionType(accountingEntity);*/
			navigateToMaintainGLSLAccountLink(accountingEntity);
			navigateTomaintainTxnRuleLink(accountingEntity);
			navigateToExchangeRateLink(accountingEntity);
			navigateToDebitCreditNotesLink(accountingEntity);
			navigateToCollectionLink(accountingEntity);
			navigateToMaintainBGCDLink(accountingEntity);
			navigateToChequeDishonourLink(accountingEntity);
			navigateToCoinsuranceVoucherConsolidationLink(accountingEntity);
			navigateTohelpLink(accountingEntity);
			navigateToMaintainScrollLink(accountingEntity);
			navigateTomaintainTrasactionLink(accountingEntity);
		}
	}

}
