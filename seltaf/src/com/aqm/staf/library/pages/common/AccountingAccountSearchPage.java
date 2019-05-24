package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccountingAccSearchEntity;
import com.aqm.staf.library.databin.AccountingAccSearchEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;

public class AccountingAccountSearchPage extends BasePage {
	private PageElement accountSearchTitle;
	private PageElement accountTypeTextField; 
	private PageElement branchCodeTextField;
	private PageElement glSlCodeTextField;
	private PageElement partyCodeTextField;
	private PageElement policyProposalNoTextField;
	private PageElement companyDropdown;
	private PageElement depratmentDropdown;
	private PageElement controlAccountCodeTextField;
	private PageElement productCodeTextField;
	private PageElement searchButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement accountDetailsTitle;
	private PageElement maintainTrasactionLink;
	private PageElement maintainTrasactionTypeLink;
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
	private PageElement accountingFrontPageTitle;


	public AccountingAccountSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		accountSearchTitle=new PageElement(By.xpath("//div//b[contains(text(),'Account Search')]"),"AccountSearchTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountTypeTextField=new PageElement(By.name("pAccountType"),"AccountTypeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		branchCodeTextField=new PageElement(By.name("pBranchCode"),"BranchCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		glSlCodeTextField=new PageElement(By.name("pGLCode"),"GlSlCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeTextField=new PageElement(By.name("pPartyCode"),"PartyCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyProposalNoTextField=new PageElement(By.name("pPolPropNo"),"PolicyProposalNoTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		companyDropdown=new PageElement(By.name("pCompanyCode"),"CompanyDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		depratmentDropdown=new PageElement(By.name("pDepartment"),"DepratmentDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		controlAccountCodeTextField=new PageElement(By.name("pControlAccCode"),"ControlAccountCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeTextField=new PageElement(By.name("pProductCode"),"ProductCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchButton=new PageElement(By.name("Search"),"SearchButton",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		clearButton=new PageElement(By.name("Clear"),"ClearButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"BackButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		accountDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Account DetailsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		accountingFrontPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Company Selection')]"), "Company Selection Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maintainTrasactionTypeLink=new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Account Type')]"), "Maintain Account Type Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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

	}

	//SERVICES
	public void fillAccountSearchDeatail(AccountingAccSearchEntity accountingAccSeach){
		if(accountingAccSeach.getAction().equalsIgnoreCase("verify") || accountingAccSeach.getAction().equalsIgnoreCase("edit")){

			if (accountingAccSeach.getBooleanValueForField("ConfigAccountType")) {
				clearAndSendKeys(accountTypeTextField, accountingAccSeach.getStringValueForField("AccountType"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigCompany")) {
				clearAndSendKeys(companyDropdown, accountingAccSeach.getStringValueForField("Company"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigBranchCode")) {
				clearAndSendKeys(branchCodeTextField, accountingAccSeach.getStringValueForField("BranchCode"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigDepartment")) {
				clearAndSendKeys(depratmentDropdown, accountingAccSeach.getStringValueForField("Department"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigGlSlCode")) {
				clearAndSendKeys(glSlCodeTextField, accountingAccSeach.getStringValueForField("GlSlCode"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigControlAccountCode")) {
				clearAndSendKeys(controlAccountCodeTextField, accountingAccSeach.getStringValueForField("ControlAccountCode"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigPartyCode")) {
				clearAndSendKeys(partyCodeTextField, accountingAccSeach.getStringValueForField("PartyCode"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigProductCode")) {
				clearAndSendKeys(productCodeTextField, accountingAccSeach.getStringValueForField("ProductCode"));
			}
			if (accountingAccSeach.getBooleanValueForField("ConfigPolicyProposalNo")) {
				clearAndSendKeys(policyProposalNoTextField, accountingAccSeach.getStringValueForField("PolicyProposalNo"));
			}

		}
	}

	public void searchAccountDetails(AccountingAccSearchEntity accountingAccSeach) {
		if (accountingAccSeach.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
			switchToFrame("display");
			if(isElementDisplayed(accountSearchTitle));
			return;

		}
	}
	public void clearAccountDetails(AccountingAccSearchEntity accountingAccSeach) {
		if (accountingAccSeach.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			switchToFrame("display");
			if(isElementDisplayed(accountSearchTitle));
			return;
		}
	}
	public void backAccountDetails(AccountingAccSearchEntity accountingAccSeach) {
		if (accountingAccSeach.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(accountSearchTitle));
			return;
		}
	}

	public void navigateToAccountingFrontPage(){
		navigateToAccountingPage();
		switchToFrame("display");
		if(isElementDisplayed(accountingFrontPageTitle));
		return;
	}
	public void navigateToMaintainTrasactionType(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigMaintainTrasactionType")){		
			click(maintainTrasactionTypeLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToMaintainGLSLAccountLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigMaintainGLSLAccount")){		
			click(maintainGLSLAccountLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateTomaintainTxnRuleLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigMaintainTxnRule")){		
			click(maintainTxnRuleLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToExchangeRateLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigExchangeRate")){		
			click(exchangeRateLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToDebitCreditNotesLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigDebitCreditNotes")){		
			click(debitCreditNotesLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToCollectionLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigCollection")){		
			click(collectionLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToMaintainBGCDLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigMaintainBGCD")){		
			click(maintainBGCDLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToMaintainScrollLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigMaintainScroll")){		
			click(maintainScrollLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToChequeDishonourLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigChequeDishonour")){		
			click(chequeDishonourLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateToCoinsuranceVoucherConsolidationLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigCoinsuranceVoucherConsolidation")){		
			click(coinsuranceVoucherConsolidationLink);
			switchToFrame("display");
			return;
		}
	}
	public void navigateTohelpLink(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigHelp")){		
			click(helpLink);
			switchToFrame("display");
		}
	}
	public void clickSearch() {
		click(searchButton);
	}
	
	public void selectSearchGLCodeNo(AccountingAccSearchEntity accountingAccSearchEntity){
		if (accountingAccSearchEntity.getBooleanValueForField("ConfigSearchGLCodeNo")){
			String gLCodeNo = accountingAccSearchEntity.getStringValueForField("GLCodeNo").trim();
			PageElement gLCodeNoLink = new PageElement(By.xpath("//a//font[contains(text(),'"+gLCodeNo+"')]"), "GL Code No Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(gLCodeNoLink);
			switchToFrame("display");
		}
	}

	public void fillandSearchAccountDetails(AccountingAccSearchEntity accountingAccSeach){
		fillAccountSearchDeatail(accountingAccSeach);
		clickSearch();
	}
	
}




