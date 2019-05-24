package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccChequeDishonourEntity;







public class AccountingChequeDishonour extends BasePage {
	private PageElement chequeDishonourTitle;
	private PageElement chequeNumberTextField;
	private PageElement chequeNumberFindButton;
	private PageElement chequeDateTextField;
	private PageElement bankNameTextField;
	private PageElement branchNameTextField;
	private PageElement chequeDishonourSearchButton;
	private PageElement searchButton;
	private PageElement backButton;
	//After search result
	//Table
	private PageElement reasonTextArea;
	private PageElement dishonourButton;
	private PageElement exitButton;

	private PageElement chequeSearchTitle;
	private PageElement chequeNoTextField;
	private PageElement collectionVoucherTypeDropDown;
	private PageElement collectionNoTextField;
	private PageElement collectionFromDateTextfield;
	private PageElement collectionToDateTextField;
	private PageElement policyNoTextField;
	private PageElement selectcheckbox;
	private PageElement closeButton;

	public AccountingChequeDishonour(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		chequeDishonourTitle=new PageElement(By.xpath("//div//b[contains(text(),'Cheque Dishonour')]"),"ChequeDishonourTitle",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		chequeNumberTextField=new PageElement(By.name("pChequeNo"),"ChequeNumberTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		chequeNumberFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Number')]/following::input/following::a[@name='firstFocus']"), "Cheque Number Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		chequeDateTextField=new PageElement(By.name("pChequeDate"),"ChequeDateTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bankNameTextField=new PageElement(By.name("pBankName"),"BankNameTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		branchNameTextField=new PageElement(By.name("pBranchName1"),"BranchNameTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		chequeDishonourSearchButton =new PageElement(By.name("Search"),"Cheque Dishonour SearchButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"BackButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//After search result
		//Table
		reasonTextArea=new PageElement(By.name("pBankName"),"BankNameTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dishonourButton=new PageElement(By.name("Dishonour"),"DishonourButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		exitButton=new PageElement(By.name("Exit"),"ExitButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		selectcheckbox = new PageElement (By.name("pCheckBox"), "Select CheckBox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		chequeSearchTitle = new PageElement (By.xpath("//div//b[contains(text(),'Cheque Search')]"), "Cheque Search Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		chequeNoTextField = new PageElement(By.name("pChequeNo"), "Cheque No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionVoucherTypeDropDown = new PageElement(By.name("pCollectNoType"), "Collection Voucher Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		collectionNoTextField = new PageElement(By.name("pCollectNo"), "Collection No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionFromDateTextfield = new PageElement(By.name("pFromDate"), "Collection From Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionToDateTextField = new PageElement(By.name("pToDate"), "Collection To Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoTextField = new PageElement(By.name("pPolicyNo"), "Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("Search"),"Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeButton =new PageElement(By.name("CloseWin"),"Close Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillAccountDetails(AccChequeDishonourEntity accChequeDishonourEntity, CustomAssert assertReference) throws InterruptedException{
		if(accChequeDishonourEntity.getAction().equalsIgnoreCase("add") || accChequeDishonourEntity.getAction().equalsIgnoreCase("edit")){
			AccChequeDishonourEntity actualAccChequeDishonourEntity=new AccChequeDishonourEntity();

			if (accChequeDishonourEntity.getBooleanValueForField("ConfigChequeNumber")) {
				fillandSubmitChequeSearchDetails(accChequeDishonourEntity, assertReference);
			}
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigChequeDate")) {
				clearAndSendKeys(chequeDateTextField, accChequeDishonourEntity.getStringValueForField("ChequeDate"));
			}
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigBankName")) {
				clearAndSendKeys(bankNameTextField, accChequeDishonourEntity.getStringValueForField("BankName"));
			}
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigBranchName")) {
				clearAndSendKeys(branchNameTextField, accChequeDishonourEntity.getStringValueForField("BranchName"));
			}

			else if(accChequeDishonourEntity.getAction().equalsIgnoreCase("verify")){
				AccChequeDishonourEntity actualaccChequeDishonourEntity=new AccChequeDishonourEntity();

				if (accChequeDishonourEntity.getBooleanValueForField("ConfigChequeNumber")) {
					actualaccChequeDishonourEntity.setStringValueForField("ChequeNumber", fetchValueFromFields(chequeNumberTextField));
					assertReference.assertEquals(accChequeDishonourEntity.getStringValueForField("ChequeNumber"), actualaccChequeDishonourEntity.getStringValueForField("ChequeNumber"),AssertionType.WARNING);
				}
				if (accChequeDishonourEntity.getBooleanValueForField("ConfigChequeDate")) {
					actualaccChequeDishonourEntity.setStringValueForField("ChequeDate", fetchValueFromFields(chequeDateTextField));
					assertReference.assertEquals(accChequeDishonourEntity.getStringValueForField("ChequeDate"), actualaccChequeDishonourEntity.getStringValueForField("ChequeDate"),AssertionType.WARNING);
				}
				if (accChequeDishonourEntity.getBooleanValueForField("ConfigBankName")) {
					actualaccChequeDishonourEntity.setStringValueForField("BankName", fetchValueFromFields(bankNameTextField));
					assertReference.assertEquals(accChequeDishonourEntity.getStringValueForField("BankName"), actualaccChequeDishonourEntity.getStringValueForField("BankName"),AssertionType.WARNING);
				}
				if (accChequeDishonourEntity.getBooleanValueForField("ConfigBranchName")) {
					actualaccChequeDishonourEntity.setStringValueForField("BranchName", fetchValueFromFields(branchNameTextField));
					assertReference.assertEquals(accChequeDishonourEntity.getStringValueForField("BranchName"), actualaccChequeDishonourEntity.getStringValueForField("BranchName"),AssertionType.WARNING);
				}
			}				
		}
	}
	//@Priyanka
	public void clickOnChequeNumberFindButton(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException{
		if(accChequeDishonourEntity.getBooleanValueForField("ConfigChequeNumberFindButton")){
			click(chequeNumberFindButton);
			switchToWindow("Cheque Search");
		}
	}
	public void fillChequeSearchDetails(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException{
		clickOnChequeNumberFindButton(accChequeDishonourEntity);
		if(accChequeDishonourEntity.getAction().equalsIgnoreCase("Verify") || accChequeDishonourEntity.getAction().equalsIgnoreCase("edit")){
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigChequeNo")) {
				clearAndSendKeys(chequeNoTextField,accChequeDishonourEntity.getStringValueForField("ChequeNo"));
			}
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigCollectionVoucherType")) {
				selectValueFromList(collectionVoucherTypeDropDown, accChequeDishonourEntity.getStringValueForField("CollectionVoucherType"));
			}
			if (accChequeDishonourEntity.getBooleanValueForField("ConfigCollectionNo")) {
				clearAndSendKeys(collectionNoTextField,accChequeDishonourEntity.getStringValueForField("CollectionNo"));
			}

			if (accChequeDishonourEntity.getBooleanValueForField("ConfigCollectionFromDate")) {
				clearAndSendKeys(collectionFromDateTextfield,accChequeDishonourEntity.getStringValueForField("CollectionFromDate"));
			}

			if (accChequeDishonourEntity.getBooleanValueForField("ConfigCollectionToDate")) {
				clearAndSendKeys(collectionToDateTextField,accChequeDishonourEntity.getStringValueForField("CollectionToDate"));
			}

			if (accChequeDishonourEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNoTextField,accChequeDishonourEntity.getStringValueForField("PolicyNumber"));
			}
		}
	}

	public void searchAccountChequeDishonour(AccChequeDishonourEntity accChequeDishonourEntity) {
		if (accChequeDishonourEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(chequeDishonourSearchButton);
			switchToFrame("display");
			if(isElementDisplayed(chequeDishonourTitle));
			return;
		}
	}
	public void backAccountChequeDishonour(AccChequeDishonourEntity accChequeDishonourEntity) {
		if (accChequeDishonourEntity.getBooleanValueForField("ConfigBackFromSearchButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(chequeDishonourTitle));
			return;
		}
	}
	public void selectSearchChequeNo(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException{
		if (accChequeDishonourEntity.getBooleanValueForField("ConfigSearchChequeNo")){
			String chequeNo = accChequeDishonourEntity.getStringValueForField("ChequeNo").trim();
			PageElement chequeNoLink = new PageElement(By.xpath("//td//a[contains(text(),'"+chequeNo+"')]"), "GL Code No Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(chequeNoLink);
			switchToWindow();
			switchToFrame("display");
		}
	}
	public void clickOnSearchONSearchChequePage(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException {
		if (accChequeDishonourEntity.getBooleanValueForField("ConfigSearchOnChequeSearchPageButton")) {
			click(searchButton);
			//switchToWindow("Cheque Search");
			//switchToFrame("display");
		}
	}

	public void clickOnDishonourButton(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException {
		if (accChequeDishonourEntity.getBooleanValueForField("ConfigDishonourButton")) {
			click(dishonourButton);
			//@priyanka
			try{
			acceptAlertAndReturnConfirmationMessage();
			}
			catch(Exception e){}
			Thread.sleep(4000);
			afterClickOnSaveButtonHandlePopup(accChequeDishonourEntity);
			switchToFrame("display");
		}
	}
	public void selectCheckBox(AccChequeDishonourEntity accChequeDishonourEntity) {
		click(selectcheckbox);
		switchToFrame("display");
	}
	//@priyanka
	public void afterClickOnSaveButtonHandlePopup(AccChequeDishonourEntity accChequeDishonourEntity) throws InterruptedException {
		try{
			Thread.sleep(4000);
			switchToWindow("Error Window");
		}
		catch(Exception e){
			switchToWindow("Error Window");
		}
		//switchToFrame("display");

		if (accChequeDishonourEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);			
			switchToWindow();
			switchToFrame("display");
			isElementDisplayed(chequeDishonourTitle);
		}
	}

	public void fillandSubmitChequeSearchDetails(AccChequeDishonourEntity accChequeDishonourEntity, CustomAssert assertReference) throws InterruptedException {
		fillChequeSearchDetails(accChequeDishonourEntity);
		clickOnSearchONSearchChequePage(accChequeDishonourEntity);
		selectSearchChequeNo(accChequeDishonourEntity);
	}

	public void fillandSubmitAccountDetails(AccChequeDishonourEntity accChequeDishonourEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");		
		fillAccountDetails(accChequeDishonourEntity, assertReference);
		searchAccountChequeDishonour(accChequeDishonourEntity);
		selectCheckBox(accChequeDishonourEntity);
		clickOnDishonourButton(accChequeDishonourEntity);
		//backAccountChequeDishonour(accChequeDishonourEntity);

	}
}

