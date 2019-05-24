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
import com.aqm.staf.library.databin.AccountingAccSearchEntity;
import com.aqm.staf.library.databin.ClaimEntity;

public class AccountingAccountDetails extends BasePage {
	private PageElement accountDetailsTitle;
	private PageElement accountDetailsTitle1;
	private PageElement annualBalanceDetailsTitle;
	private PageElement accountTypeTextField; 
	private PageElement branchCodeTextField;
	private PageElement productCodeTextField;
	private PageElement companyDropdown;
	private PageElement departmentDropdown;
	private PageElement glSlCodeTextField;
	private PageElement glDescriptionTextArea;
	private PageElement currencyDropdown;
	private PageElement opDbBalanceTextField;			
	private PageElement curDbBalanceTextField;
	private PageElement opDbBalanceOrgCurTextField;
	private PageElement curDbBalanceOrgCurTextField;
	private PageElement yearlyBudgetTextField;
	private PageElement opCrBalanceTextField;
	private PageElement curCrBalanceTextField;
	private PageElement opCrBalanceOrgCurTextField;
	private PageElement curCrBalanceOrgCurTextField;
	private PageElement monthlyBudgetTextField;
	private PageElement saveButton;
	private PageElement updateGlButton;
	private PageElement backButton;
	private PageElement accountSearchTitle;

	public AccountingAccountDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		accountDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"AccountDetailsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		accountDetailsTitle1=new PageElement(By.xpath("//td//div//b[contains(text(),'Account Details')]"),"Account Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		annualBalanceDetailsTitle=new PageElement(By.xpath("//td//b[contains(text(),'Annual Balance Details')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		accountTypeTextField=new PageElement(By.name("pAccountType"),"AccountTypeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		branchCodeTextField=new PageElement(By.name("pBranchCode"),"BranchCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeTextField=new PageElement(By.name("pProductCode"),"ProductCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		companyDropdown=new PageElement(By.name("pCompanyCode"),"CompanyDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		departmentDropdown=new PageElement(By.name("pDepartment"),"DepratmentDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		glSlCodeTextField=new PageElement(By.name("pGLCode"),"GlSlCodeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		glDescriptionTextArea=new PageElement(By.name("pDescription"),"GlDescriptionTextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currencyDropdown=new PageElement(By.name("pCurrencyCode"),"CurrencyDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		opDbBalanceTextField=new PageElement(By.name("pOpeningDebitBalance"),"OpDbBalanceTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		curDbBalanceTextField=new PageElement(By.name("pCurrentDebitBalance"),"CurDbBalanceTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		opDbBalanceOrgCurTextField=new PageElement(By.name("pOpeningDebitBalanceORG"),"OpDbBalanceOrgCurTextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		curDbBalanceOrgCurTextField=new PageElement(By.name("pCurrentDebitBalanceORG"),"CurDbBalanceOrgCurTextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		yearlyBudgetTextField=new PageElement(By.name("pYearlyBudgetedAmount"),"YearlyBudgetTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		opCrBalanceTextField=new PageElement(By.name("pOpeningCreditBalance"),"OpCrBalanceTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		curCrBalanceTextField=new PageElement(By.name("pCurrentCreditBalance"),"CurCrBalanceTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		opCrBalanceOrgCurTextField=new PageElement(By.name("pOpeningCreditBalanceORG"),"OpCrBalanceOrgCurTextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		curCrBalanceOrgCurTextField=new PageElement(By.name("pCurrentCreditBalanceORG"),"CurCrBalanceOrgCurTextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		monthlyBudgetTextField=new PageElement(By.name("pMonthlyBudgetedAmount"),"MonthlyBudgetTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"),"saveButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		updateGlButton=new PageElement(By.name("Update"),"updateGlButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"backButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//
		accountSearchTitle=new PageElement(By.xpath("//div//b[contains(text(),'Account Search')]"), "Account Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void navigateToAccountDetailsTab(AccountingAccSearchEntity accountingAccSeachEntity){
		if (accountingAccSeachEntity.getBooleanValueForField("ConfigAccountDetailsTab")){
			click(accountDetailsTitle1);
			switchToFrame("display");
			if(isElementDisplayed( accountDetailsTitle1));
			return;
		}
	}
	public void navigateToAnnualBalanceDetailsTab(AccountingAccSearchEntity accountingAccSeachEntity){
		if (accountingAccSeachEntity.getBooleanValueForField("ConfigAnnualBalanceDetailsTab")){
			click(annualBalanceDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed( annualBalanceDetailsTitle));
			return;
		}
	}
	public void navigateToBackButton(AccountingAccSearchEntity accountingAccSeachEntity){
		if (accountingAccSeachEntity.getBooleanValueForField("ConfigBackFromDetailButton")){
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(accountSearchTitle));
			return;
		}
	}


	public void fillAccountDetails(AccountingAccSearchEntity accountingAccSeachEntity, CustomAssert assertReference){
		if(accountingAccSeachEntity.getAction().equalsIgnoreCase("add") || accountingAccSeachEntity.getAction().equalsIgnoreCase("edit")){
			AccountingAccSearchEntity actualAccountingAccDetailsEntity=new AccountingAccSearchEntity();

			if (accountingAccSeachEntity.getBooleanValueForField("ConfigAccountType")) {
				clearAndSendKeys(accountTypeTextField, accountingAccSeachEntity.getStringValueForField("AccountType"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCompany")) {
				clearAndSendKeys(companyDropdown, accountingAccSeachEntity.getStringValueForField("Company"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigBranchCode")) {
				clearAndSendKeys(branchCodeTextField, accountingAccSeachEntity.getStringValueForField("BranchCode"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigDepartment")) {
				clearAndSendKeys(departmentDropdown, accountingAccSeachEntity.getStringValueForField("Department"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigProductCode")) {
				clearAndSendKeys(productCodeTextField, accountingAccSeachEntity.getStringValueForField("ProductCode"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigGlSlCode")) {
				clearAndSendKeys(glSlCodeTextField, accountingAccSeachEntity.getStringValueForField("GlSlCode"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigGlDescription")) {
				clearAndSendKeys(glDescriptionTextArea, accountingAccSeachEntity.getStringValueForField("GlDescription"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurrency")) {
				clearAndSendKeys(currencyDropdown, accountingAccSeachEntity.getStringValueForField("Currency"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpDbBalance")) {
				clearAndSendKeys(opDbBalanceTextField, accountingAccSeachEntity.getStringValueForField("OpDbBalance"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpCrBalance")) {
				clearAndSendKeys(opCrBalanceTextField, accountingAccSeachEntity.getStringValueForField("OpCrBalance"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurDbBalance")) {
				clearAndSendKeys(curDbBalanceTextField, accountingAccSeachEntity.getStringValueForField("CurDbBalance"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurCrBalance")) {
				clearAndSendKeys(curCrBalanceTextField, accountingAccSeachEntity.getStringValueForField("CurCrBalance"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpDbBalanceOrgCur")) {
				clearAndSendKeys(opDbBalanceOrgCurTextField, accountingAccSeachEntity.getStringValueForField("OpDbBalanceOrgCur"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpCrBalanceOrgCur")) {
				clearAndSendKeys(opCrBalanceOrgCurTextField, accountingAccSeachEntity.getStringValueForField("OpCrBalanceOrgCur"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurDbBalanceOrgCur")) {
				clearAndSendKeys(curDbBalanceOrgCurTextField, accountingAccSeachEntity.getStringValueForField("CurDbBalanceOrgCur"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurCrBalanceOrgCur")) {
				clearAndSendKeys(curCrBalanceOrgCurTextField, accountingAccSeachEntity.getStringValueForField("CurCrBalanceOrgCur"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigYearlyBudget")) {
				clearAndSendKeys(yearlyBudgetTextField, accountingAccSeachEntity.getStringValueForField("YearlyBudget"));
			}
			if (accountingAccSeachEntity.getBooleanValueForField("ConfigMonthlyBudget")) {
				clearAndSendKeys(monthlyBudgetTextField, accountingAccSeachEntity.getStringValueForField("MonthlyBudget"));
			}

			else if(accountingAccSeachEntity.getAction().equalsIgnoreCase("verify")){
				AccountingAccSearchEntity actualaccountingAccDetailsEntity=new AccountingAccSearchEntity();

				if (accountingAccSeachEntity.getBooleanValueForField("ConfigAccountDetailsTab")) {
					actualAccountingAccDetailsEntity.setStringValueForField("AccountDetailsTab", fetchValueFromFields(accountDetailsTitle1));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("AccountDetailsTab"), actualAccountingAccDetailsEntity.getStringValueForField("AccountDetailsTab"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigAnnualBalanceDetailsTab")) {
					actualAccountingAccDetailsEntity.setStringValueForField("AnnualBalanceDetailsTab", fetchValueFromFields(annualBalanceDetailsTitle));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("AnnualBalanceDetailsTab"), actualAccountingAccDetailsEntity.getStringValueForField("AnnualBalanceDetailsTab"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigAccountType")) {
					actualAccountingAccDetailsEntity.setStringValueForField("AccountType", fetchValueFromFields(accountTypeTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("AccountType"), actualAccountingAccDetailsEntity.getStringValueForField("AccountType"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCompany")) {
					actualAccountingAccDetailsEntity.setStringValueForField("Company", fetchValueFromFields(companyDropdown));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("Company"), actualAccountingAccDetailsEntity.getStringValueForField("Company"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigBranchCode")) {
					actualAccountingAccDetailsEntity.setStringValueForField("BranchCode", fetchValueFromFields(branchCodeTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("BranchCode"), actualAccountingAccDetailsEntity.getStringValueForField("BranchCode"),AssertionType.WARNING);
				}

				if (accountingAccSeachEntity.getBooleanValueForField("ConfigDepartment")) {
					actualAccountingAccDetailsEntity.setStringValueForField("Department", fetchValueFromFields(departmentDropdown));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("Department"), actualAccountingAccDetailsEntity.getStringValueForField("Department"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigProductCode")) {
					actualAccountingAccDetailsEntity.setStringValueForField("ProductCode", fetchValueFromFields(productCodeTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("ProductCode"), actualAccountingAccDetailsEntity.getStringValueForField("ProductCode"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigGlSlCode")) {
					actualAccountingAccDetailsEntity.setStringValueForField("GlSlCode", fetchValueFromFields(glSlCodeTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("GlSlCode"), actualAccountingAccDetailsEntity.getStringValueForField("GlSlCode"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigGlDescription")) {
					actualAccountingAccDetailsEntity.setStringValueForField("GlDescription", fetchValueFromFields(glDescriptionTextArea));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("GlDescription"), actualAccountingAccDetailsEntity.getStringValueForField("GlDescription"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurrency")) {
					actualAccountingAccDetailsEntity.setStringValueForField("Currency", fetchValueFromFields(currencyDropdown));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("Currency"), actualAccountingAccDetailsEntity.getStringValueForField("Currency"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpDbBalance")) {
					actualAccountingAccDetailsEntity.setStringValueForField("OpDbBalance", fetchValueFromFields(opDbBalanceTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("OpDbBalance"), actualAccountingAccDetailsEntity.getStringValueForField("OpDbBalance"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpCrBalance")) {
					actualAccountingAccDetailsEntity.setStringValueForField("OpCrBalance", fetchValueFromFields(opCrBalanceTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("OpCrBalance"), actualAccountingAccDetailsEntity.getStringValueForField("OpCrBalance"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurDbBalance")) {
					actualAccountingAccDetailsEntity.setStringValueForField("CurDbBalance", fetchValueFromFields(curDbBalanceTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("CurDbBalance"), actualAccountingAccDetailsEntity.getStringValueForField("CurDbBalance"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurCrBalance")) {
					actualAccountingAccDetailsEntity.setStringValueForField("CurCrBalance", fetchValueFromFields(curCrBalanceTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("CurCrBalance"), actualAccountingAccDetailsEntity.getStringValueForField("CurCrBalance"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpDbBalanceOrgCur")) {
					actualAccountingAccDetailsEntity.setStringValueForField("OpDbBalanceOrgCur", fetchValueFromFields(opDbBalanceOrgCurTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("OpDbBalanceOrgCur"), actualAccountingAccDetailsEntity.getStringValueForField("OpDbBalanceOrgCur"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigOpCrBalanceOrgCur")) {
					actualAccountingAccDetailsEntity.setStringValueForField("OpCrBalanceOrgCur", fetchValueFromFields(opCrBalanceOrgCurTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("OpCrBalanceOrgCur"), actualAccountingAccDetailsEntity.getStringValueForField("OpCrBalanceOrgCur"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurDbBalanceOrgCur")) {
					actualAccountingAccDetailsEntity.setStringValueForField("CurDbBalanceOrgCur", fetchValueFromFields(curDbBalanceOrgCurTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("CurDbBalanceOrgCur"), actualAccountingAccDetailsEntity.getStringValueForField("CurDbBalanceOrgCur"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigCurCrBalanceOrgCur")) {
					actualAccountingAccDetailsEntity.setStringValueForField("CurCrBalanceOrgCur", fetchValueFromFields(curCrBalanceOrgCurTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("CurCrBalanceOrgCur"), actualAccountingAccDetailsEntity.getStringValueForField("CurCrBalanceOrgCur"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigYearlyBudget")) {
					actualAccountingAccDetailsEntity.setStringValueForField("YearlyBudget", fetchValueFromFields(yearlyBudgetTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("YearlyBudget"), actualAccountingAccDetailsEntity.getStringValueForField("YearlyBudget"),AssertionType.WARNING);
				}
				if (accountingAccSeachEntity.getBooleanValueForField("ConfigMonthlyBudget")) {
					actualAccountingAccDetailsEntity.setStringValueForField("MonthlyBudget", fetchValueFromFields(monthlyBudgetTextField));
					assertReference.assertEquals(accountingAccSeachEntity.getStringValueForField("MonthlyBudget"), actualAccountingAccDetailsEntity.getStringValueForField("MonthlyBudget"),AssertionType.WARNING);
				}
			}
		}
	}

	public void saveAccountDetails(AccountingAccSearchEntity accountingAccSeachEntity) {
		if (accountingAccSeachEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed( accountDetailsTitle));
			return;

		}
	}
	public void updateGIAccountDetails(AccountingAccSearchEntity accountingAccSeachEntity) {
		if (accountingAccSeachEntity.getBooleanValueForField("ConfigUpdateGlButton")) {
			click(updateGlButton);
			switchToFrame("display");
			if(isElementDisplayed( accountSearchTitle));
			return;

		}
	}
	public void fillandsubmitAccountDetails(AccountingAccSearchEntity accountingAccSearchEntity, CustomAssert assertReference)throws InterruptedException{
		switchToFrame("display");
		fillAccountDetails(accountingAccSearchEntity, assertReference);
		saveAccountDetails(accountingAccSearchEntity);
		navigateToAccountDetailsTab(accountingAccSearchEntity);
		navigateToAnnualBalanceDetailsTab(accountingAccSearchEntity);
	}
}