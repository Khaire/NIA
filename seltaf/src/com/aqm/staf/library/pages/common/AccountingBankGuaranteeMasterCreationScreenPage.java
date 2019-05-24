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
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.AccountngCollectnSearcEntity;
import com.aqm.staf.library.databin.ClaimAttriCourtMasterEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class AccountingBankGuaranteeMasterCreationScreenPage extends BasePage {
	private PageElement bankGuaranteeMasterCreationScreenTitle;
	private PageElement closeBGAccountScreenTitle;
	private PageElement officeCodeTextField;
	private PageElement bankGuaranteeAcTextField;
	private PageElement partyCodeTextField;
	private PageElement partyCodeFindButton;
	private PageElement partyCodeToBeSelectedLink;
	private PageElement clientNameTextField;
	private PageElement addressOfThePartyTextArea;
	private PageElement businessSourceCodeTextField;
	private PageElement businessSourceCodeFindButton;
	private PageElement businessSourceCodeToBeSelectedLink;
	private PageElement issuingBankTextField;
	private PageElement issuingBankFindButton;
	private PageElement issuingBankToBeSelectedLink;
	private PageElement dateOfIssueTextField;
	private PageElement dateOfExpiryTextField;
	private PageElement guaranteeAmountRsTextField;
	private PageElement balanceAmountRsTextField;
	private PageElement openingDateTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement closeBgAccountButton;
	private PageElement partySearchButton;
	private PageElement stakeholderFunctionCodeTextField;
	private PageElement stakeholderFunctionCodeFindButton;
	private PageElement stakeHolderFunctionListFindButton;
	private PageElement stakecodeToBeSelectedLink;
	private PageElement organizationRadioButton;
	
	
	//BG
	private PageElement issuingBankBGTextField;
	private PageElement issuingBankBGSearchButton;
	// After saving details in new page, Close BG Account Button appears.

	public AccountingBankGuaranteeMasterCreationScreenPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organization Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bankGuaranteeMasterCreationScreenTitle = new PageElement(By.xpath("//div//b[contains(text(),'Bank Guarantee Master Creation Screen')]"), "Bank Guarantee Master Creation Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		closeBGAccountScreenTitle = new PageElement(By.xpath("//div//b[contains(text(),'Close BG Account Screen')]"), "Close BG Account Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeCodeTextField = new PageElement(By.name("pBranchCode"), "Office Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankGuaranteeAcTextField = new PageElement(By.name("pAccCode"), "Bank Guarantee A/C Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Party Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientNameTextField = new PageElement(By.name("pPartyName"), "Client Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfThePartyTextArea = new PageElement(By.name("pDescription"), "Address of the Party TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessSourceCodeTextField = new PageElement(By.name("pDevelopmentOfficerCode"), "Business Source Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessSourceCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Business')]/following::input/following::a[@name='firstFocus']"), "Business Source Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		issuingBankTextField = new PageElement(By.name("pPartyCode2"), "Issuing Bank TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		issuingBankFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Issuing')]/following::input/following::a[@name='firstFocus']"), "Issuing Bank Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfIssueTextField = new PageElement(By.name("pEffectiveStartDate"), "Date of Issue TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfExpiryTextField = new PageElement(By.name("pEffectiveEndDate"), "Date of Expiry  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		guaranteeAmountRsTextField = new PageElement(By.name("pGuaranteeAmnt"), "Guarantee Amount (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceAmountRsTextField = new PageElement(By.name("pBalAmnt"), "Balance Amount (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openingDateTextField = new PageElement(By.name("pOpeningDate"), "Opening Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeBgAccountButton = new PageElement(By.xpath("//td//input[@name='Close BG Account']"), "Close BG Account Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partySearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeholderFunctionCodeTextField=new PageElement(By.name("pFunctionCode"), "Stakeholder Function Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeholderFunctionCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Stakeholder Function Code')]/following::input/following::a[@name='firstFocus']"), "Stakeholder Function Code Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeHolderFunctionListFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "StakeHolder Function List FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//BG
		issuingBankBGTextField = new PageElement(By.name("pPartyCode"), "Issuing Bank TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		issuingBankBGSearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillAccountingBGOrCdDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity, CustomAssert assertReference) throws InterruptedException{
		if(accountingBGOrCDSearchEntity.getAction().equalsIgnoreCase("add") || accountingBGOrCDSearchEntity.getAction().equalsIgnoreCase("edit")){
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigPartyCode")) {
				fillPartyCodeSearch(accountingBGOrCDSearchEntity);
			}
			/*if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigClientName")) {
				clearAndSendKeys(clientNameTextField, accountingBGOrCDSearchEntity.getStringValueForField("ClientName"));
			}*/
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigAddressOfTheParty")) {
				clearAndSendKeys(addressOfThePartyTextArea, accountingBGOrCDSearchEntity.getStringValueForField("AddressOfTheParty"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
				fillBusinessSourceCodeSearch(accountingBGOrCDSearchEntity);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBank")) {
				fillIssuingBankSearch(accountingBGOrCDSearchEntity);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBankBG")) {
				fillIssuingBankBGSearch(accountingBGOrCDSearchEntity);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigDateOfIssue")) {
				String dateOfIssue=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("DateOfIssue"));
				clearAndEnterDate(dateOfIssueTextField, dateOfIssue);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigDateOfExpiry")) {
				String dateOfExpiry=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("DateOfExpiry"));
				clearAndEnterDate(dateOfExpiryTextField, dateOfExpiry);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigGuaranteeAmountRs")) {
				clearAndSendKeys(guaranteeAmountRsTextField, accountingBGOrCDSearchEntity.getStringValueForField("GuaranteeAmountRs"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBalanceAmountRs")) {
				clearAndSendKeys(balanceAmountRsTextField, accountingBGOrCDSearchEntity.getStringValueForField("BalanceAmountRs"));
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigOpeningDate")) {
				String openingDate=RandomCodeGenerator.dateGenerator(accountingBGOrCDSearchEntity.getStringValueForField("OpeningDate"));
				clearAndEnterDate(openingDateTextField, openingDate);
			}
			
		}
		else if(accountingBGOrCDSearchEntity.getAction().equalsIgnoreCase("verify")){
			AccountingBGOrCDSearchEntity actualAccountingBGOrCDSearchEntity=new AccountingBGOrCDSearchEntity();

			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigCreateOfficeCode")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("CreateOfficeCode", fetchValueFromTextFields(officeCodeTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("CreateOfficeCode"), actualAccountingBGOrCDSearchEntity.getStringValueForField("CreateOfficeCode"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBankGuaranteeACCode")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("BankGuaranteeACCode", fetchValueFromTextFields(bankGuaranteeAcTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"), actualAccountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("PartyCode", fetchValueFromTextFields(partyCodeTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("PartyCode"), actualAccountingBGOrCDSearchEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigClientName")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("ClientName", fetchValueFromTextFields(clientNameTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("ClientName"), actualAccountingBGOrCDSearchEntity.getStringValueForField("ClientName"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigAddressOfTheParty")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("AddressOfTheParty", fetchValueFromTextFields(addressOfThePartyTextArea));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("AddressOfTheParty"), actualAccountingBGOrCDSearchEntity.getStringValueForField("AddressOfTheParty"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("BusinessSourceCode", fetchValueFromTextFields(businessSourceCodeTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("BusinessSourceCode"), actualAccountingBGOrCDSearchEntity.getStringValueForField("BusinessSourceCode"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBank")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("IssuingBank", fetchValueFromTextFields(issuingBankTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("IssuingBank"), actualAccountingBGOrCDSearchEntity.getStringValueForField("IssuingBank"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigCreateDateOfIssue")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("CreateDateOfIssue", fetchValueFromTextFields(dateOfIssueTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("CreateDateOfIssue"), actualAccountingBGOrCDSearchEntity.getStringValueForField("CreateDateOfIssue"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigCreateDateOfExpiry")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("CreateDateOfExpiry", fetchValueFromTextFields(dateOfExpiryTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("CreateDateOfExpiry"), actualAccountingBGOrCDSearchEntity.getStringValueForField("CreateDateOfExpiry"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigGuaranteeAmountRs")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("GuaranteeAmountRs", fetchValueFromTextFields(guaranteeAmountRsTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("GuaranteeAmountRs"), actualAccountingBGOrCDSearchEntity.getStringValueForField("GuaranteeAmountRs"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBalanceAmountRs")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("BalanceAmountRs", fetchValueFromTextFields(balanceAmountRsTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("BalanceAmountRs"), actualAccountingBGOrCDSearchEntity.getStringValueForField("BalanceAmountRs"), AssertionType.WARNING);
			}
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigOpeningDate")) {
				actualAccountingBGOrCDSearchEntity.setStringValueForField("OpeningDate", fetchValueFromTextFields(openingDateTextField));
				assertReference.assertEquals(accountingBGOrCDSearchEntity.getStringValueForField("OpeningDate"), actualAccountingBGOrCDSearchEntity.getStringValueForField("OpeningDate"), AssertionType.WARNING);
			}
		}
	}
	////@Rasika
	public void fillPartyCodeSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		clickOnpartyCodeFindButton(accountingBGOrCDSearchEntity);
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigOrganization")) {
			check(organizationRadioButton);
		}
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigPartyCode")) {	
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("PartyCode"));
		}
		
		click(partySearchButton);
		selectpartyCode(accountingBGOrCDSearchEntity);
	}

	public void clickOnpartyCodeFindButton(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigPartyCodeFindButton")){
			click(partyCodeFindButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Party Maintenance");
			}catch(Exception e){
				switchToWindow("Party Maintenance");
			}
		
		}
	}
	public void selectpartyCode(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		String	partyCode=accountingBGOrCDSearchEntity.getStringValueForField("PartyCode");
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}
	public void fillBusinessSourceCodeSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		clickOnbusinessSourceCodeFindButton(accountingBGOrCDSearchEntity);

		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("BusinessSourceCode"));
		}
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigStakeholderFunctionCode")) {
			fillStakeholderFunctionCode(accountingBGOrCDSearchEntity);
			click(partySearchButton);
		}
		click(partySearchButton);
		selectbusinessSourceCode(accountingBGOrCDSearchEntity);
	}

	public void clickOnbusinessSourceCodeFindButton(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBusinessSourceCodeFindButton")){
			click(businessSourceCodeFindButton);
			switchToWindow("Party Maintenance");
		}
	}
	public void selectbusinessSourceCode(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		String	partyCode=accountingBGOrCDSearchEntity.getStringValueForField("BusinessSourceCode");
		PageElement businessSourceCodeToBeSelectedLink=new PageElement(By.linkText(partyCode), "Business Source Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(businessSourceCodeToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}
	
	public void fillIssuingBankSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		clickOnissuingBankSearchFindButton(accountingBGOrCDSearchEntity);

		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBank")) {
			Thread.sleep(3000);
			clearAndSendKeys(issuingBankTextField, accountingBGOrCDSearchEntity.getStringValueForField("IssuingBank"));
		}
		click(issuingBankFindButton);
		selectissuingBank(accountingBGOrCDSearchEntity);
	}
		
	public void selectissuingBank(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		issuingBankToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+accountingBGOrCDSearchEntity.getStringValueForField("issuingBank")+"')]"),"Issuing Bank To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(issuingBankToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}



	public void submitAccountingBGOrCdDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			fetchCDAccountNumber(accountingBGOrCDSearchEntity);
			switchToFrame("display");
		}
	}
	
	/*************CD A/C Code**************/
	public void fetchCDAccountNumber(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {

		accountingBGOrCDSearchEntity.setStringValueForField("BankGuaranteeACCode", fetchValueFromTextFields(bankGuaranteeAcTextField));
	}
	////@Rasika
	public void backFromAccountingBGOrCdDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	public void closeBGAccountDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) {
		if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigCloseBGAccountButton")) {
			click(closeBgAccountButton);
			switchToFrame("display");
		}
	}
	
	public void fillStakeholderFunctionCode(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
	  click(stakeholderFunctionCodeFindButton);
	  switchToWindow("StakeHolder Function");
	  clearAndSendKeys(stakeholderFunctionCodeTextField, accountingBGOrCDSearchEntity.getStringValueForField("StakeholderFunctionCode"));
	  click(stakeHolderFunctionListFindButton);
	  selectstakeCode(accountingBGOrCDSearchEntity);
	}
	public void selectstakeCode(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
		stakecodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+accountingBGOrCDSearchEntity.getStringValueForField("StakeholderFunctionCode")+"')]"),"Stakeholder FunctionCode to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(stakecodeToBeSelectedLink);
		switchToWindow("Party Maintenance");
	}
	
	//Ganesh
		public void fillIssuingBankBGSearch(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
			clickOnissuingBankSearchFindButton(accountingBGOrCDSearchEntity);

			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBankBG")) {
				Thread.sleep(3000);
				clearAndSendKeys(issuingBankBGTextField, accountingBGOrCDSearchEntity.getStringValueForField("IssuingBankBG"));
			}
			
			click(issuingBankBGSearchButton);
			selectissuingBankBG(accountingBGOrCDSearchEntity);
		}
		//Ganesh
		public void selectissuingBankBG(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
			issuingBankToBeSelectedLink=new PageElement(By.xpath("//a//font[contains(text(),'"+accountingBGOrCDSearchEntity.getStringValueForField("IssuingBankBG")+"')]"),"Issuing Bank To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(issuingBankToBeSelectedLink);
			switchToWindow();
			switchToFrame("display");
		}
		public void clickOnissuingBankSearchFindButton(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity) throws InterruptedException{
			if (accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBankFindButton")){
				click(issuingBankFindButton);
				switchToWindow("Party Search");
				return;
			}
			else if(accountingBGOrCDSearchEntity.getBooleanValueForField("ConfigIssuingBankFindButtonBG")){
				click(issuingBankFindButton);
				switchToWindow("Party Maintenance");
			}

		}


	public void fillAndSubmitCourtMasterForAllProductDetails(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity, CustomAssert assertReference) throws InterruptedException{
		switchToFrame("display");
		fillAccountingBGOrCdDetails(accountingBGOrCDSearchEntity, assertReference);
		submitAccountingBGOrCdDetails(accountingBGOrCDSearchEntity);
		closeBGAccountDetails(accountingBGOrCDSearchEntity);
	}
}
