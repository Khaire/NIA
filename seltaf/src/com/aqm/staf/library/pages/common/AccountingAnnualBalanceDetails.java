package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccountingAnnualBalEntity;
import com.aqm.staf.library.databin.ClientDetailsEntity;

public class AccountingAnnualBalanceDetails extends BasePage {
	private PageElement annualBalanceDetailsTitle;
	private PageElement accountDetailsTitle;
	private PageElement annualBalanceDetailsTitle1;
	private PageElement glCodeLabel;
	private PageElement departmentLabel;
	private PageElement companyLabel;
	private PageElement accountTypeLabbel;
	private PageElement levelIndicatorLabel;
	private PageElement branchLabel;
	//Table pending;
	private PageElement backButton;




	public AccountingAnnualBalanceDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		annualBalanceDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'AnnualBalanceDetails')]"),"AnnualBalanceDetailsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountDetailsTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'AccountDetails')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		annualBalanceDetailsTitle1=new PageElement(By.xpath("//td//div//b[contains(text(),'AnnualBalanceDetails')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		glCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0060","GlCode")),"GlCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		departmentLabel=new PageElement(By.xpath(genericLocatorforLabel("S0060","Department")),"DepartmentLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		companyLabel=new PageElement(By.xpath(genericLocatorforLabel("S0060","Company")),"CompanyLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountTypeLabbel=new PageElement(By.xpath(genericLocatorforLabel("S0060","AccountType")),"AccountTypeLabbel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		levelIndicatorLabel=new PageElement(By.xpath(genericLocatorforLabel("S0060","LevelIndicator")),"LevelIndicatorLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		branchLabel=new PageElement(By.xpath(genericLocatorforLabel("S0060","Branch")),"BranchLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table pending;
		backButton=new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}
	//services
	public void navigateToAccountDetailsTab(AccountingAnnualBalEntity accountingAnnualBalEntity){
		if (accountingAnnualBalEntity.getBooleanValueForField("ConfigAccountDetailsTab")){
			click(accountDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(accountDetailsTitle));
			return;
		}
	}
	public void  navigateToAnnualBalanceDetailsTab(AccountingAnnualBalEntity accountingAnnualBalEntity){
		if (accountingAnnualBalEntity.getBooleanValueForField("ConfigAnnualBalanceDetailsTab")){
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(accountDetailsTitle));
			return;
		}
	}

	public void  navigateToBackButton(AccountingAnnualBalEntity accountingAnnualBalEntity){
		if (accountingAnnualBalEntity.getBooleanValueForField("ConfigBackButton")){
			click(annualBalanceDetailsTitle1);
			switchToFrame("display");
			if(isElementDisplayed(annualBalanceDetailsTitle));
			return;
		}
	}
	public void fillaccountingAnnualBal(AccountingAnnualBalEntity accountingAnnualBalEntity, CustomAssert assertReference){
		if(accountingAnnualBalEntity.getAction().equalsIgnoreCase("verify")){
			AccountingAnnualBalEntity actualaccountingAnnualBalEntity=new AccountingAnnualBalEntity();

			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigGlCode")) {
				actualaccountingAnnualBalEntity.setStringValueForField("GlCode",fetchValueFromFields(glCodeLabel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("GlCode"), actualaccountingAnnualBalEntity.getStringValueForField("GlCode"),AssertionType.WARNING);
			}
			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigAccountType")) {
				actualaccountingAnnualBalEntity.setStringValueForField("AccountType",fetchValueFromFields(accountTypeLabbel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("AccountType"), actualaccountingAnnualBalEntity.getStringValueForField("AccountType"),AssertionType.WARNING);
			}
			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigDepartment")) {
				actualaccountingAnnualBalEntity.setStringValueForField("Department",fetchValueFromFields(departmentLabel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("Department"), actualaccountingAnnualBalEntity.getStringValueForField("Department"),AssertionType.WARNING);
			}
			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigLevelIndicator")) {
				actualaccountingAnnualBalEntity.setStringValueForField("LevelIndicator",fetchValueFromFields(levelIndicatorLabel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("LevelIndicator"), actualaccountingAnnualBalEntity.getStringValueForField("LevelIndicator"),AssertionType.WARNING);
			}
			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigCompany")) {
				actualaccountingAnnualBalEntity.setStringValueForField("Company",fetchValueFromFields(companyLabel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("Company"), actualaccountingAnnualBalEntity.getStringValueForField("Company"),AssertionType.WARNING);
			}
			if (accountingAnnualBalEntity.getBooleanValueForField("ConfigBranch")) {
				actualaccountingAnnualBalEntity.setStringValueForField("Branch",fetchValueFromFields(branchLabel));
				assertReference.assertEquals(accountingAnnualBalEntity.getStringValueForField("Branch"), actualaccountingAnnualBalEntity.getStringValueForField("Branch"),AssertionType.WARNING);
			}
		}
	}

	public void fillandsearchaccountingAnnualBalEntity(AccountingAnnualBalEntity accountingAnnualBalEntity, CustomAssert assertReference)throws InterruptedException {
		switchToFrame("display");
		fillaccountingAnnualBal(accountingAnnualBalEntity,  assertReference);

		navigateToAccountDetailsTab(accountingAnnualBalEntity);
		navigateToAnnualBalanceDetailsTab(accountingAnnualBalEntity);



	}
}