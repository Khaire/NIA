package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AcctCoinsuranceVoucherEntity;

public class AccountingCoinsuranceVoucherConsolidationPage extends BasePage{

	private PageElement coinsuranceVoucherConsolidationTitle;
	private PageElement selectEventCodeDropDown;
	private PageElement requestIdTextField;
	private PageElement coinsurancePartyCodeTextField;
	private PageElement coinsuranceSiteCodeTextField;
	private PageElement dateFromTextField;
	private PageElement datetoTextField;
	private PageElement coinsuranceTypeDropDown;
	private PageElement departmentDropDown;
	private PageElement proposalOrPolicyNoTextField;
	private PageElement officeCodeTextField;
	private PageElement searchButton;
	private PageElement saveButton;
	private PageElement clearButton;

	public AccountingCoinsuranceVoucherConsolidationPage(WebDriver driver, 	String pageName) {
		super(driver, pageName);

		coinsuranceVoucherConsolidationTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coinsurance Voucher Consolidation')]"), "Coinsurance Voucher Consolidation Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectEventCodeDropDown = new PageElement(By.name("selectCoinsEvent"), "Select Event Code  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		requestIdTextField = new PageElement(By.name("pRequestId"), "Request Id  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsurancePartyCodeTextField = new PageElement(By.name("pPartyCode1"), "Coinsurance Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsuranceSiteCodeTextField = new PageElement(By.name("pPartyCode2"), "Coinsurance Site Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateFromTextField = new PageElement(By.name("pScrollDate"), "Date From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		datetoTextField = new PageElement(By.name("pScrollDate2"), "Date To TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsuranceTypeDropDown = new PageElement(By.name("coInsType"), "Coinsurance Type  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		departmentDropDown = new PageElement(By.name("department"), "Department DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proposalOrPolicyNoTextField = new PageElement(By.name("pPolicyNo"), "Proposal/Policy No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeCodeTextField = new PageElement(By.name("pPartyCode3"), "Office Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton =  new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		clearButton = new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	
	public void fillCoinsuranceVoucherConsoDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity, CustomAssert assertReference) {
		if(acctCoinsuranceVoucherEntity.getAction().equalsIgnoreCase("add") || acctCoinsuranceVoucherEntity.getAction().equalsIgnoreCase("edit")){
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigSelectEventCode")) {
				selectValueFromList(selectEventCodeDropDown, acctCoinsuranceVoucherEntity.getStringValueForField("SelectEventCode"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsurancePartyCode")) {
				clearAndSendKeys(coinsurancePartyCodeTextField, acctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsuranceSiteCode")) {
				clearAndSendKeys(coinsuranceSiteCodeTextField, acctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceSiteCode"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsurancePartyCode")) {
				clearAndSendKeys(coinsurancePartyCodeTextField, acctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"));
			}
		
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigDateFrom")) {
				String startDate=RandomCodeGenerator.dateGenerator(acctCoinsuranceVoucherEntity.getStringValueForField("DateFrom"));
				clearAndEnterDate(dateFromTextField, startDate);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigDateTo")) {
				String endDate=RandomCodeGenerator.dateGenerator(acctCoinsuranceVoucherEntity.getStringValueForField("DateTo"));
				clearAndEnterDate(datetoTextField, endDate);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsuranceType")) {
				selectValueFromList(coinsuranceTypeDropDown, acctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceType"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigDepartment")) {
				selectValueFromList(departmentDropDown, acctCoinsuranceVoucherEntity.getStringValueForField("Department"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigProposalPolicyNo")) {
				clearAndSendKeys(proposalOrPolicyNoTextField, acctCoinsuranceVoucherEntity.getStringValueForField("ProposalPolicyNo"));
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigOfficeCode")) {
				clearAndSendKeys(officeCodeTextField, acctCoinsuranceVoucherEntity.getStringValueForField("OfficeCode"));
			}
		}
		
		else if(acctCoinsuranceVoucherEntity.getAction().equalsIgnoreCase("verify")){
			AcctCoinsuranceVoucherEntity actualAcctCoinsuranceVoucherEntity=new AcctCoinsuranceVoucherEntity();
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigSelectEventCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("SelectEventCode", fetchValueFromTextFields(selectEventCodeDropDown));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("SelectEventCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("SelectEventCode"), AssertionType.WARNING);
			}
		
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigRequestId")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("RequestId", fetchValueFromTextFields(requestIdTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("RequestId"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("RequestId"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsurancePartyCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("CoinsurancePartyCode", fetchValueFromTextFields(coinsurancePartyCodeTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("CoinsurancePartyCode"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsuranceSiteCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("SelectEventCode", fetchValueFromTextFields(coinsuranceSiteCodeTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceSiteCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceSiteCode"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigStartDate")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("StartDate", fetchValueFromTextFields(dateFromTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("StartDate"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("StartDate"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigEndDate")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("EndDate", fetchValueFromTextFields(datetoTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("EndDate"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("EndDate"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigCoinsuranceType")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("CoinsuranceType", fetchValueFromTextFields(coinsuranceTypeDropDown));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceType"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("CoinsuranceType"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigDepartment")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("Department", fetchValueFromTextFields(departmentDropDown));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("Department"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("Department"), AssertionType.WARNING);
			}
			
			if (acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigOfficeCode")) {
				actualAcctCoinsuranceVoucherEntity.setStringValueForField("ProposalPolicyNo", fetchValueFromTextFields(officeCodeTextField));
				assertReference.assertEquals(acctCoinsuranceVoucherEntity.getStringValueForField("OfficeCode"), actualAcctCoinsuranceVoucherEntity.getStringValueForField("OfficeCode"), AssertionType.WARNING);
			}
		
		}
	}

	public void submitCoinduranceDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity){
		if(acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigSaveButton"))
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(coinsuranceVoucherConsolidationTitle));
			return;
	}
	
	public void clearfillDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity){
		if(acctCoinsuranceVoucherEntity.getBooleanValueForField("ConfigClearButton"))
			click(clearButton);
			switchToFrame("display");	
			if(isElementDisplayed(coinsuranceVoucherConsolidationTitle));
			return;
	}
	
	public void clickSearch() {
			click(searchButton);
			switchToFrame("display");	
		}

	public void fillAndSubmitDetails(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntity,CustomAssert assertReference ){
		switchToFrame("display");
		fillCoinsuranceVoucherConsoDetails(acctCoinsuranceVoucherEntity, assertReference);
		submitCoinduranceDetails(acctCoinsuranceVoucherEntity);
		clearfillDetails(acctCoinsuranceVoucherEntity);
		clickSearch();
		
	}
	
}
