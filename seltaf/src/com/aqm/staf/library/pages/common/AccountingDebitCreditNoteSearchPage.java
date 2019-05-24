package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.DebitCreditNoteEntity;
import com.aqm.staf.library.databin.PolicyEntity;

public class AccountingDebitCreditNoteSearchPage extends BasePage {
	
	private PageElement debitCreaditNoteSearchPageTitle;
	private PageElement companyDropdown;
	private PageElement debitCreditNoteDropdown;
	private PageElement debitCreditNoteNoTextField;
	private PageElement dnCnTypeDropdown;
	private PageElement statusIndicatorDropdown;
	private PageElement currencyCodeDropdown;
	private PageElement policyNumberTextField;
	private PageElement claimNumberTextField;
	private PageElement slAccountCodeTextField;
	private PageElement searchButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement debitCreditNumberLink;
	
	
	public AccountingDebitCreditNoteSearchPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		debitCreaditNoteSearchPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Debit/Credit Note Search')]"), "Debit/Credit Note Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyDropdown= new PageElement(By.name("pCompanyCode"), "Company Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		debitCreditNoteDropdown= new PageElement(By.name("pDrCrIndicator"), "Debit/Credit Note Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		debitCreditNoteNoTextField= new PageElement(By.name("pDrCrNumber"), "Debit/Credit Note No. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dnCnTypeDropdown= new PageElement(By.name("pDrCrType"), "DN/CN Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		statusIndicatorDropdown = new PageElement(By.name("pMatchUnMatchInd"), "Status Indicator Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		currencyCodeDropdown = new PageElement(By.name("pCurrency"), "Currency Code Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyNumberTextField = new PageElement(By.name("pPolicyNumber"), "Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimNumberTextField = new PageElement(By.name("pReferenceNumber"), "Claim Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		slAccountCodeTextField = new PageElement(By.name("pGLCode"), "SL Account Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton= new PageElement(By.name("Search"), "search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clearButton= new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	}
	
	
	public void fillAccountingDebitCreditNoteSearchPageDetails(DebitCreditNoteEntity debitCreditNoteEntity){
		if(debitCreditNoteEntity.getAction().equalsIgnoreCase("verify") || debitCreditNoteEntity.getAction().equalsIgnoreCase("edit")){

			if (debitCreditNoteEntity.getBooleanValueForField("ConfigCompany")) {
				selectValueFromList(companyDropdown, debitCreditNoteEntity.getStringValueForField("Company"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDebitCreditNote")) {
				selectValueFromList(debitCreditNoteDropdown, debitCreditNoteEntity.getStringValueForField("DebitCreditNote"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDebitCreditNoteNo")) {
				clearAndSendKeys(debitCreditNoteNoTextField, debitCreditNoteEntity.getStringValueForField("DebitCreditNoteNo"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigDnCNType")) {
				selectValueFromList(dnCnTypeDropdown, debitCreditNoteEntity.getStringValueForField("DnCNType"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigStatusIndicator")) {
				selectValueFromList(statusIndicatorDropdown, debitCreditNoteEntity.getStringValueForField("StatusIndicator"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigCurrencyCodeTextField")) {
				selectValueFromList(currencyCodeDropdown, debitCreditNoteEntity.getStringValueForField("CurrencyCodeTextField"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNumberTextField, debitCreditNoteEntity.getStringValueForField("PolicyNumber"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigClaimNumber")) {
				clearAndSendKeys(claimNumberTextField, debitCreditNoteEntity.getStringValueForField("ClaimNumber"));
			}
			if (debitCreditNoteEntity.getBooleanValueForField("ConfigSlAccountCode")) {
				clearAndSendKeys(slAccountCodeTextField, debitCreditNoteEntity.getStringValueForField("SlAccountCode"));
			}
		}
	}

	
	public void clearFromPolicySearch(DebitCreditNoteEntity debitCreditNoteEntity) {
		if (debitCreditNoteEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			isElementDisplayed(debitCreaditNoteSearchPageTitle);
		}
	}
	public void backFromPolicySearch(DebitCreditNoteEntity debitCreditNoteEntity) {
		if (debitCreditNoteEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			isElementDisplayed(debitCreaditNoteSearchPageTitle);
		}
	}
	public void clickSearch() {
		click(searchButton);
	}
	
	public void selectDebitCreditNumber(DebitCreditNoteEntity debitCreditNoteEntity){
		int tableRowNumber = debitCreditNoteEntity.getIntegerValueForField("TableRowNumber");
		int rowNum = tableRowNumber + 1;
		debitCreditNumberLink = new PageElement(By.xpath("//tr["+rowNum +"]/td/div/a[contains(@name,'firstFocus')]"), "Debit Credit Number Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		click(debitCreditNumberLink);
	}
	
	public void fillAndSearchDebitCreditNoteDetails(DebitCreditNoteEntity debitCreditNoteEntity){
		fillAccountingDebitCreditNoteSearchPageDetails(debitCreditNoteEntity);
		clickSearch();
		
	}

}
