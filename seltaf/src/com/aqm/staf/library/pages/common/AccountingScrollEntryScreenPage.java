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
import com.aqm.staf.library.databin.AccoScrollEntryEntity;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovAtrEntity;

public class AccountingScrollEntryScreenPage extends BasePage {
	private PageElement scrollEntryScreenPageTitle;
	private PageElement scrollNumberTextField;
	private PageElement bankAccCodeTextField; 
	private PageElement bankAccCodeFindButton;
	private PageElement bankAccCodeToBeSelectedLink;
	private PageElement scrollDateTextField;
	private PageElement narrationTextField;
	private PageElement receivedFromTextField;
	private PageElement businessSourceCodeTextField;
	private PageElement businessSourceCodeFindButton;
	private PageElement businessSourceCodeToBeSelectedLink;
	private PageElement agentCodeTextField;
	private PageElement agentCodeFindButton;
	private PageElement agentCodeToBeSelectedLink;
	private PageElement paymentModeDropdown;
	private PageElement instrumentAmountTextField;
	private PageElement instrumentNumberTextField;
	private PageElement chequeDateTextField;
	private PageElement chequeTypeDropdown;
	private PageElement draweeBankNameTextField;
	private PageElement draweeBankNameFindButton;
	private PageElement draweeBankNameToBeSelectedLink;
	private PageElement micrCodeTextField;
	private PageElement ifscCodeTextField;
	private PageElement branchNameTextField;
	private PageElement balanceAmountTextField;
	private PageElement proceedButton;
	private PageElement backButton;
	private PageElement printButton;
	private PageElement searchButton;
	//navigations
	private PageElement deapartmentForScrollPageTitle;
	private PageElement scrollPageTitle;


	public AccountingScrollEntryScreenPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		scrollEntryScreenPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Entry Screen')]"), "Scroll Entry Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scrollNumberTextField=new PageElement(By.name("pScrollNumber"), "Scroll Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankAccCodeTextField=new PageElement(By.name("pGLCode"), "Bank AccCode TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bankAccCodeFindButton= new PageElement(By.xpath("//td//b[contains(text(),'Bank')]/following::input/following::a[@name='firstFocus']"), "Bank Acc Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		scrollDateTextField=new PageElement(By.name("pScrollDate"), "Scroll DateTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		narrationTextField=new PageElement(By.name("pNarration"), "NarrationTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		receivedFromTextField=new PageElement(By.name("pPartyId"), "Received From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessSourceCodeTextField=new PageElement(By.name("pPartyCode"), "Business Source Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessSourceCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Business')]/following::input/following::a[@name='firstFocus']"), "Business Source Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		agentCodeTextField=new PageElement(By.xpath("//td//b[contains(text(),'Party Code')]/following::input[2]"), "Agent Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agentCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Agent')]/following::input/following::a[@name='firstFocus']"), "Agent Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentModeDropdown=new PageElement(By.name("pPaymentMode"), "Payment Mode Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		instrumentAmountTextField=new PageElement(By.name("pInstAmount"), "Instrument Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		instrumentNumberTextField=new PageElement(By.name("pChequeNumber"), "Instrument Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeDateTextField=new PageElement(By.name("pChequeDate"), "Cheque Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeTypeDropdown=new PageElement(By.name("pChequeType"), "Cheque Type Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draweeBankNameTextField=new PageElement(By.name("pPartyCode"), "Drawee Bank Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draweeBankNameFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Drawee')]/following::input/following::a[@name='firstFocus']"), "Drawee Bank Name Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		micrCodeTextField=new PageElement(By.xpath("//td//b[contains(text(),'MICR Code')]/following::input[1]"), "MICR Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ifscCodeTextField=new PageElement(By.xpath("//td//b[contains(text(),'IFSC Code')]/following::input[1]"), "IFSC CodeTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		branchNameTextField=new PageElement(By.xpath("//td//b[contains(text(),'Branch Name')]/following::input[1]"), "Branch Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceAmountTextField=new PageElement(By.name("pBalanceAmount"), "Balance Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Save"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		printButton=new PageElement(By.name("Print"), "Print Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//navigation
		deapartmentForScrollPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Department for Scroll')]"), "Deapartment For Scroll Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scrollPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Search')]"), "Scroll Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillAccountingScrollEntryScreenPage(AccoScrollEntryEntity accoScrollEntryEntity, CustomAssert assertReference)throws InterruptedException{
		if(accoScrollEntryEntity.getAction().equalsIgnoreCase("add") || accoScrollEntryEntity.getAction().equalsIgnoreCase("edit")){
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigScrollNumber")) {
				clearAndSendKeys(scrollNumberTextField, accoScrollEntryEntity.getStringValueForField("ScrollNumber"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBankAccCode")) {
				fillBankAccCodeSearch(accoScrollEntryEntity);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigScrollDate")) {
				String scrollDate=RandomCodeGenerator.dateGenerator(accoScrollEntryEntity.getStringValueForField("ScrollDate"));
				clearAndEnterDate(scrollDateTextField, scrollDate);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNarration")) {
				clearAndSendKeys(narrationTextField, accoScrollEntryEntity.getStringValueForField("Narration"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigReceivedFrom")) {
				clearAndSendKeys(receivedFromTextField, accoScrollEntryEntity.getStringValueForField("ReceivedFrom"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
				fillBusinessSourceCodeSearch(accoScrollEntryEntity);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCode")) {
				fillagentCodeSearch(accoScrollEntryEntity);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigPaymentMode")) {
				selectValueFromList(paymentModeDropdown, accoScrollEntryEntity.getStringValueForField("PaymentMode"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigInstrumentAmount")) {
				clearAndSendKeys(instrumentAmountTextField, accoScrollEntryEntity.getStringValueForField("InstrumentAmount"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigInstrumentNumber")) {
				clearAndSendKeys(instrumentNumberTextField, accoScrollEntryEntity.getStringValueForField("InstrumentNumber"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChequeDate")) {
				String chequeDate=RandomCodeGenerator.dateGenerator(accoScrollEntryEntity.getStringValueForField("ChequeDate"));
				clearAndEnterDate(chequeDateTextField, chequeDate);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChequeType")) {
				selectValueFromList(chequeTypeDropdown, accoScrollEntryEntity.getStringValueForField("ChequeType"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				filldraweeBankNameSearch(accoScrollEntryEntity);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigMICRCode")) {
				clearAndSendKeys(micrCodeTextField, accoScrollEntryEntity.getStringValueForField("MICRCode"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigIFSCCode")) {
				clearAndSendKeys(ifscCodeTextField, accoScrollEntryEntity.getStringValueForField("IFSCCode"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBranchName")) {
				clearAndSendKeys(branchNameTextField, accoScrollEntryEntity.getStringValueForField("BranchName"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBalanceAmount")) {
				clearAndSendKeys(balanceAmountTextField, accoScrollEntryEntity.getStringValueForField("BalanceAmount"));
			}
		}
		else if(accoScrollEntryEntity.getAction().equalsIgnoreCase("verify")){
			AccoScrollEntryEntity actualAccoScrollEntryEntity=new AccoScrollEntryEntity();
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigScrollNumber")) {
				actualAccoScrollEntryEntity.setStringValueForField("ScrollNumber", fetchValueFromTextFields(scrollNumberTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ScrollNumber"), actualAccoScrollEntryEntity.getStringValueForField("ScrollNumber"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBankAccCode")) {
				actualAccoScrollEntryEntity.setStringValueForField("BankAccCode", fetchValueFromTextFields(bankAccCodeTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("BankAccCode"), actualAccoScrollEntryEntity.getStringValueForField("BankAccCode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigScrollDate")) {
				actualAccoScrollEntryEntity.setStringValueForField("ScrollDate", fetchValueFromTextFields(scrollDateTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ScrollDate"), actualAccoScrollEntryEntity.getStringValueForField("ScrollDate"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNarration")) {
				actualAccoScrollEntryEntity.setStringValueForField("Narration", fetchValueFromTextFields(narrationTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("Narration"), actualAccoScrollEntryEntity.getStringValueForField("Narration"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigReceivedFrom")) {
				actualAccoScrollEntryEntity.setStringValueForField("ReceivedFrom", fetchValueFromTextFields(receivedFromTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ReceivedFrom"), actualAccoScrollEntryEntity.getStringValueForField("ReceivedFrom"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
				actualAccoScrollEntryEntity.setStringValueForField("BusinessSourceCode", fetchValueFromTextFields(businessSourceCodeTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("BusinessSourceCode"), actualAccoScrollEntryEntity.getStringValueForField("BusinessSourceCode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCode")) {
				actualAccoScrollEntryEntity.setStringValueForField("AgentCode", fetchValueFromTextFields(agentCodeTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("AgentCode"), actualAccoScrollEntryEntity.getStringValueForField("AgentCode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigPaymentMode")) {
				actualAccoScrollEntryEntity.setStringValueForField("PaymentMode", fetchValueFromTextFields(paymentModeDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("PaymentMode"), actualAccoScrollEntryEntity.getStringValueForField("PaymentMode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigInstrumentAmount")) {
				actualAccoScrollEntryEntity.setStringValueForField("InstrumentAmount", fetchValueFromTextFields(instrumentAmountTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("InstrumentAmount"), actualAccoScrollEntryEntity.getStringValueForField("InstrumentAmount"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigInstrumentNumber")) {
				actualAccoScrollEntryEntity.setStringValueForField("InstrumentNumber", fetchValueFromTextFields(instrumentNumberTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("InstrumentNumber"), actualAccoScrollEntryEntity.getStringValueForField("InstrumentNumber"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChequeDate")) {
				actualAccoScrollEntryEntity.setStringValueForField("ChequeDate", fetchValueFromTextFields(chequeDateTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ChequeDate"), actualAccoScrollEntryEntity.getStringValueForField("ChequeDate"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChequeType")) {
				actualAccoScrollEntryEntity.setStringValueForField("ChequeType", fetchValueFromTextFields(chequeTypeDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ChequeType"), actualAccoScrollEntryEntity.getStringValueForField("ChequeType"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				actualAccoScrollEntryEntity.setStringValueForField("DraweeBankName", fetchValueFromTextFields(draweeBankNameTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("DraweeBankName"), actualAccoScrollEntryEntity.getStringValueForField("DraweeBankName"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigMICRCode")) {
				actualAccoScrollEntryEntity.setStringValueForField("MICRCode", fetchValueFromTextFields(micrCodeTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("MICRCode"), actualAccoScrollEntryEntity.getStringValueForField("MICRCode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigIFSCCode")) {
				actualAccoScrollEntryEntity.setStringValueForField("IFSCCode", fetchValueFromTextFields(ifscCodeTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("IFSCCode"), actualAccoScrollEntryEntity.getStringValueForField("IFSCCode"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBranchName")) {
				actualAccoScrollEntryEntity.setStringValueForField("BranchName", fetchValueFromTextFields(branchNameTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("BranchName"), actualAccoScrollEntryEntity.getStringValueForField("BranchName"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigBalanceAmount")) {
				actualAccoScrollEntryEntity.setStringValueForField("BalanceAmount", fetchValueFromTextFields(balanceAmountTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("BalanceAmount"), actualAccoScrollEntryEntity.getStringValueForField("BalanceAmount"), AssertionType.WARNING);
			}
		}
	}
	public void fillBankAccCodeSearch(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		clickOnbankAccCodeFindButton(accoScrollEntryEntity);

		if (accoScrollEntryEntity.getBooleanValueForField("ConfigBankAccCode")) {
			clearAndSendKeys(bankAccCodeTextField, accoScrollEntryEntity.getStringValueForField("BankAccCode"));
		}
		click(searchButton);
		Thread.sleep(3000);
		selectbankAccCode(accoScrollEntryEntity);
	}

	public void clickOnbankAccCodeFindButton(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		click(bankAccCodeFindButton);
		switchToWindow("Account Search");
	}
	public void selectbankAccCode(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		String bankAccCodeToBeSelected=accoScrollEntryEntity.getStringValueForField("BankAccCode");
		//bankAccCodeToBeSelectedLink=new PageElement(By.xpath("//a//font[contains(text(),'"+accoScrollEntryEntity.getStringValueForField("BankAccCode")+"')]"),"Bank Acc Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bankAccCodeToBeSelectedLink=new PageElement(By.linkText(bankAccCodeToBeSelected),"Bank Acc Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Thread.sleep(3000);
		click(bankAccCodeToBeSelectedLink);
		
		switchToWindow();
		switchToFrame("display");
	}
	public void fillBusinessSourceCodeSearch(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		clickOnbusinessSourceCodeFindButton(accoScrollEntryEntity);

		if (accoScrollEntryEntity.getBooleanValueForField("ConfigBusinessSourceCode")) {
			clearAndSendKeys(businessSourceCodeTextField, accoScrollEntryEntity.getStringValueForField("BusinessSourceCode"));
		}
		click(searchButton);
		selectbusinessSourceCode(accoScrollEntryEntity);
	}

	public void clickOnbusinessSourceCodeFindButton(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		click(businessSourceCodeFindButton);
		switchToWindow("Party Maintenance");	
	}
	public void selectbusinessSourceCode(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		String businessSourceCodeToBeSelected=accoScrollEntryEntity.getStringValueForField("BusinessSourceCode");
		//businessSourceCodeToBeSelectedLink=new PageElement(By.xpath("//a//font[contains(text(),'"+accoScrollEntryEntity.getStringValueForField("BusinessSourceCode")+"')]"),"Business Source Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessSourceCodeToBeSelectedLink=new PageElement(By.linkText(businessSourceCodeToBeSelected),"Business Source Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Thread.sleep(3000);
		click(businessSourceCodeToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}
	public void fillagentCodeSearch(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		clickOnagentCodeFindButton(accoScrollEntryEntity);

		if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCode")) {
			clearAndSendKeys(agentCodeTextField, accoScrollEntryEntity.getStringValueForField("AgentCode"));
		}
		click(agentCodeFindButton);
		selectagentCode(accoScrollEntryEntity);
	}

	public void clickOnagentCodeFindButton(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCodeFindButton")){
			click(agentCodeFindButton);
			switchToWindow("Party Search");
		}
	}
	public void selectagentCode(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		agentCodeToBeSelectedLink=new PageElement(By.xpath("//font[contains(text(),'"+accoScrollEntryEntity.getStringValueForField("agentCode")+"')]"),"Agent Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(agentCodeToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}
	
	//Motor
	public void fillagentCodeSearchMotor(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		clickOnagentCodeFindButton(accoScrollEntryEntity);

		/*if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCode")) {
			clearAndSendKeys(agentCodeTextField, accoScrollEntryEntity.getStringValueForField("AgentCode"));
		}
		click(agentCodeFindButton);*/
		selectagentCodeMotor(accoScrollEntryEntity);
	}

	public void clickOnagentCodeFindButtonMotor(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigAgentCodeFindButtonMotor")){
			click(agentCodeFindButton);
			switchToWindow("Party Search");
		}
	}
	public void selectagentCodeMotor(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		agentCodeToBeSelectedLink=new PageElement(By.xpath("//font[contains(text(),'AG00005646')]"),"Agent Code To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(agentCodeToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}
	public void filldraweeBankNameSearch(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		clickOndraweeBankNameFindButton(accoScrollEntryEntity);

		if (accoScrollEntryEntity.getBooleanValueForField("ConfigDraweeBankName")) {
			clearAndSendKeys(draweeBankNameTextField, accoScrollEntryEntity.getStringValueForField("DraweeBankName"));
		}
		click(searchButton);
		selectclickOndraweeBankName(accoScrollEntryEntity);
	}

	public void clickOndraweeBankNameFindButton(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		click(draweeBankNameFindButton);
		switchToWindow("Party Maintenance");
	}
	public void selectclickOndraweeBankName(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		String draweeBankNameToBeSelected=accoScrollEntryEntity.getStringValueForField("DraweeBankName");
		//draweeBankNameToBeSelectedLink=new PageElement(By.xpath("//a//font[contains(text(),'"+accoScrollEntryEntity.getStringValueForField("DraweeBankName")+"')]"),"Drawee Bank Name To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		draweeBankNameToBeSelectedLink=new PageElement(By.linkText(draweeBankNameToBeSelected),"Drawee Bank Name To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Thread.sleep(3000);
		click(draweeBankNameToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}





	public void navigateToDeapartmentForScrollPageTitle(AccoScrollEntryEntity accoScrollEntryEntity) throws InterruptedException{
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(proceedButton	);
			acceptAlertAndReturnConfirmationMessage();
			switchToFrame("display");
			Thread.sleep(2000);
			isElementDisplayed(deapartmentForScrollPageTitle);
		}
	}
	public void navigateToScrollPageTitle(AccoScrollEntryEntity accoScrollEntryEntity){
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(scrollPageTitle);
		}
	}
	public void clickOnSearchButton(AccoScrollEntryEntity accoScrollEntryEntity){
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
			switchToFrame("display");
			isElementDisplayed(scrollPageTitle);

		}
	}

	public void fetchScrollNumber(AccoScrollEntryEntity accoScrollEntryEntity) {

		accoScrollEntryEntity.setStringValueForField("ScrollNumber", fetchValueFromTextFields(scrollNumberTextField));
	}
	public void fillAndSubmitAccountingScrollEntryScreenDetails(AccoScrollEntryEntity accoScrollEntryEntity, CustomAssert assertReference)throws InterruptedException{
		fillAccountingScrollEntryScreenPage(accoScrollEntryEntity, assertReference);
		navigateToDeapartmentForScrollPageTitle(accoScrollEntryEntity);
		
		//navigateToScrollPageTitle(accoScrollEntryEntity);
	}

}
