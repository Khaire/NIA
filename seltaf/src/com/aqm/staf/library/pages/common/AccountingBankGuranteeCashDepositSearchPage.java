package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
//import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;


public class AccountingBankGuranteeCashDepositSearchPage extends BasePage {

	//private PageElement maintainBGOrGdTab;
	private PageElement bankGuranteeOrCashDepositSearchTitle;
	private PageElement bankGuaranteeMasterCreationScreenTitle;
	private PageElement bgOrCdDropDown;
	private PageElement officeCodeTextField;
	private PageElement partyCodeTextField;
	private PageElement businessSourceCodeTextField;
	private PageElement accountCodeTextField;
	private PageElement dateOfIssueTextField;
	private PageElement dateOfExpiryTextField;
	private PageElement guaranteeAmountTextField;
	private PageElement openingDateTextField;
	private PageElement newButton;
	private PageElement searchButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement accountCodeLinkTextField;
	private String accountCode;	
	private PageElement cashDepositMasterCreationScreenTitle;
	public AccountingBankGuranteeCashDepositSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		//maintainBGOrGdTab = new PageElement (By.xpath("//a//b[contains(text(),'Maintain BG/CD')]"), "Maintain BG/GD tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bankGuranteeOrCashDepositSearchTitle =new PageElement (By.xpath("//div//b[contains(text(),'Bank Gurantee/Cash Deposit Search')]"), "Bank Gurantee/Cash Deposit Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cashDepositMasterCreationScreenTitle =new PageElement (By.xpath("//div//b[contains(text(),'Cash Deposit Master Creation Screen')]"), "Cash Deposit Master Creation Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankGuaranteeMasterCreationScreenTitle =new PageElement (By.xpath("//div//b[contains(text(),'Bank Guarantee Master Creation Screen')]"), "Bank Guarantee Master Creation Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bgOrCdDropDown = new PageElement(By.name("pCDBG"), "BG/CD  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		officeCodeTextField = new PageElement(By.name("pOfficeCode"), "Office Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code   TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessSourceCodeTextField = new PageElement(By.name("pDevelopmentOfficerCode"), "Business Source Code   TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountCodeTextField = new PageElement(By.name("pAccountCode"), "Account Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIssueTextField = new PageElement(By.name("pDateOfIssue"), "Date Of Issue TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfExpiryTextField = new PageElement(By.name("pDateOfExpiry"), "Date Of Expiry  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		guaranteeAmountTextField = new PageElement(By.name("pGuaranteeAmount"), "Guarantee Amount  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openingDateTextField = new PageElement(By.name("pOpeningDate"), "Opening Date  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		searchButton = new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clearButton = new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//accountCodeLinkTextField=new PageElement(By.linkText(accountCode), "Account Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);//
	}


	/*public void navigateToBankGuranteeOrCashDepositSearchPage(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigContactsTab"))
			click(maintainBGOrGdTab);
		switchToFrame("display");
		if(isElementDisplayed(bankGuranteeOrCashDepositSearchTitle));
		return;
	}*/

	public void fillAccountingBGOrCdSearchDeatail(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		if(accountingBGOrCDSearchEntity.getAction().equalsIgnoreCase("add") || accountingBGOrCDSearchEntity.getAction().equalsIgnoreCase("edit")){
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBGOrCDDropdown")) {
				selectValueFromList(bgOrCdDropDown, accountingBGOrCDSearchEntity.getStringValueForField("BGOrCDDropdown"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchOfficeCode")) {
				clearAndSendKeys(officeCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("OfficeCode"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchPartyCode")) {
				clearAndSendKeys(partyCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("PartyCode"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchBusinessSourceCode")) {
				clearAndSendKeys(businessSourceCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("BusinessSourceCode"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchAccountCode")) {
				clearAndSendKeys(accountCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("AccountCode"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchDateOfIssue")) {
				String dateOfIssue=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("DateOfIssue"));
				clearAndEnterDate(dateOfIssueTextField, dateOfIssue);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchDateOfExpiry")) {
				String dateOfExpiry=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("DateOfExpiry"));
				clearAndEnterDate(dateOfExpiryTextField, dateOfExpiry);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchGuaranteeAmount")) {
				clearAndSendKeys(guaranteeAmountTextField, accountingBGOrCDSearchEntity.getStringValueForField("GuaranteeAmount"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchOpeningDate")) {
				String openingDate=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("OpeningDate"));
				clearAndEnterDate(openingDateTextField, openingDate);
			}
		}
	}
	public void clearFromAccountingBGOrCdSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
		}
	}
	public void backFromAccountingBGOrCdSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void selectSearchAccountCode(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchAccountCode")){
			accountCode=accountingBGOrCDSearchEntity.getStringValueForField("SearchAccountCode");
			accountCodeLinkTextField=new PageElement(By.linkText(accountCode), "Account Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(accountCodeLinkTextField);
		}
	}
	public void clickSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
		}
	}
	public void navigateToAccountingBGOrDgCreationPage(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(bankGuaranteeMasterCreationScreenTitle));
			return;
		}
	}

	public void navigateToAccountingCDMasterCreationPage(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");

		}
	}

	public void navigateToAccountingBGOrDgCreatePage(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigClearButton")) {
			switchToFrame("display");
			click(clearButton);
			switchToFrame("display");
			if(isElementDisplayed(bankGuaranteeMasterCreationScreenTitle));
			return;
		}
	}
	public void fillAndSearchAccountingBGOrCdDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity){
		switchToFrame("display");
		fillAccountingBGOrCdSearchDeatail(accountingBGOrCDSearchEntity);
		clickSearch(accountingBGOrCDSearchEntity);
		navigateToAccountingCDMasterCreationPage(accountingBGOrCDSearchEntity);

	}
}







