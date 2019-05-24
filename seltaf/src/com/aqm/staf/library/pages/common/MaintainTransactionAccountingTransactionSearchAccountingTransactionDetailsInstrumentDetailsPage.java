package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstrumentDetailsEntity;

public class MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage extends BasePage {

	private PageElement accountingTransactionDetailsTitle;
	private PageElement instrumentListTitle;
	private PageElement instrumentDetailsTitle;
	private PageElement accountTransactionTitle;
	private PageElement instrumentDetailTitle;
	private PageElement companyLabel;
	private PageElement voucherTypeLabel;
	private PageElement voucherNumberLabel;
	private PageElement voucherAmountLabel;
	private PageElement voucherCurrencyLabel;
	private PageElement currenyRateLabel;
	private PageElement instrumentNoTextField;
	private PageElement instrumentDateTextField;
	private PageElement amountTextField;
	private PageElement expiryDateTextField;
	private PageElement inFavourOfTextField;
	private PageElement draweeBankNameTextField;
	private PageElement mICRCodeTextField;
	private PageElement iFSCCodeTextField;
	private PageElement branchNameTextField;
	private PageElement preparedByTextField;
	private PageElement checkedByTextField;
	private PageElement clearChequeButton;
	private PageElement dishonourChequeButton;
	private PageElement backButton;

	private PageElement clearanceDateFindButton;

	public MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage(
			WebDriver driver, String pageName) {
		super(driver, pageName);


		accountingTransactionDetailsTitle = new PageElement(By.xpath("//b//font[contains(text(),'Transaction Details')]"), "Accounting Transaction Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		instrumentListTitle = new PageElement(By.xpath("//b[contains(text(),'Instrument List')]"), "Instrument List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		instrumentDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Instrument Details')]"), "Instrument Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accountTransactionTitle = new PageElement(By.xpath("//td//font//a//b[contains(text(),'Transaction')]')]"), "A/c Transaction Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		instrumentDetailTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Instrument Detail')]"), "Instrument Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		companyLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Company")), "Company Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherTypeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Voucher Type")), "Voucher Type Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Voucher Number")), "Voucher Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherAmountLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Voucher Amount")), "Voucher Amount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voucherCurrencyLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Voucher Currency")), "Voucher Currency Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currenyRateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Curreny Rate")), "curreny Rate Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		instrumentNoTextField = new PageElement(By.name("pChequeNumber"), "Instrument No. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		instrumentDateTextField = new PageElement(By.name("pChequeDate"), "Instrument Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		amountTextField = new PageElement(By.name("pChequeAmount"), "Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expiryDateTextField = new PageElement(By.name("pPayInSlipNo"), "Expiry Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inFavourOfTextField = new PageElement(By.name("pInFavourOf"), "In Favour Of TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draweeBankNameTextField = new PageElement(By.name("pBankName"), "Drawee Bank Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mICRCodeTextField = new PageElement(By.name("pDrweeBnkMicrCode"), "MICR Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iFSCCodeTextField = new PageElement(By.name("pDrweeBnkIfscCode"), "IFSC Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		branchNameTextField = new PageElement(By.xpath("//td//div//font//b[contains(text(),'Branch Name')]/following::input"), "Branch Name  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preparedByTextField = new PageElement(By.name("pSignatory1"), "Prepared By  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		checkedByTextField = new PageElement(By.name("pSignatory2"), "Checked By TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clearChequeButton = new PageElement(By.name("ClearStatus"), "Clear Cheque Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dishonourChequeButton = new PageElement(By.name("DishonourStatus"), "Dishonour Cheque Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clearanceDateFindButton=new PageElement(By.xpath("//div//font//b[contains(text(),'Clearance Date')]/following::input/following::a[@name='firstFocus']"), "Clearance Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void navigateToAccountTransaction(InstrumentDetailsEntity instrumentDetailsEntity){
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigAcTransaction")){
			click(accountTransactionTitle);
			switchToFrame("display");
			if(isElementDisplayed(accountingTransactionDetailsTitle));
			return;
		}
	}

	public void navigateToInstrumentDetail(InstrumentDetailsEntity instrumentDetailsEntity){
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigInstrumentDetail")){
			click(instrumentDetailTitle);
			switchToFrame("display");
			if(isElementDisplayed(instrumentListTitle));
			return;
		}
	}

	public void fillInstrumentDetails(InstrumentDetailsEntity instrumentDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(instrumentDetailsEntity.getAction().equalsIgnoreCase("add")|| instrumentDetailsEntity.getAction().equalsIgnoreCase("edit")){
			if (instrumentDetailsEntity.getBooleanValueForField("ConfigClearanceDate")) {
				selectDateFromCalender(clearanceDateFindButton, instrumentDetailsEntity.getStringValueForField("ClearanceDate"));
				switchToFrame("display");
			}

		}
		else if(instrumentDetailsEntity.getAction().equalsIgnoreCase("verify")){
			InstrumentDetailsEntity actualInstrumentDetailsEntity=new InstrumentDetailsEntity();
			if (instrumentDetailsEntity.getBooleanValueForField("ConfigCompany")) {
				actualInstrumentDetailsEntity.setStringValueForField("Company", fetchValueFromFields(companyLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("Company"), actualInstrumentDetailsEntity.getStringValueForField("Company"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherType")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherType", fetchValueFromFields(voucherTypeLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherType"), actualInstrumentDetailsEntity.getStringValueForField("VoucherType"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherNumber", fetchValueFromFields(voucherNumberLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherNumber"), actualInstrumentDetailsEntity.getStringValueForField("VoucherNumber"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherAmount")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherAmount", fetchValueFromFields(voucherAmountLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherAmount"), actualInstrumentDetailsEntity.getStringValueForField("VoucherAmount"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigVoucherCurrency")) {
				actualInstrumentDetailsEntity.setStringValueForField("VoucherCurrency", fetchValueFromFields(voucherCurrencyLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("VoucherCurrency"), actualInstrumentDetailsEntity.getStringValueForField("VoucherCurrency"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigCurrencyRate")) {
				actualInstrumentDetailsEntity.setStringValueForField("CurrencyRate", fetchValueFromFields(currenyRateLabel));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("CurrencyRate"), actualInstrumentDetailsEntity.getStringValueForField("CurrencyRate"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigInstrumentNo")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(instrumentNoTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigInstrumentDate")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentDate", fetchValueFromTextFields(instrumentDateTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentDate"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentDate"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigAmount")) {
				actualInstrumentDetailsEntity.setStringValueForField("Amount", fetchValueFromTextFields(amountTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("Amount"), actualInstrumentDetailsEntity.getStringValueForField("Amount"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigExpiryDate")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(expiryDateTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigInFavourOf")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(inFavourOfTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(draweeBankNameTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigMICRCode")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(mICRCodeTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigIFSCCode")) {
				actualInstrumentDetailsEntity.setStringValueForField("InstrumentNo", fetchValueFromTextFields(iFSCCodeTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("InstrumentNo"), actualInstrumentDetailsEntity.getStringValueForField("InstrumentNo"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigBranchName")) {
				actualInstrumentDetailsEntity.setStringValueForField("BranchName", fetchValueFromTextFields(branchNameTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("BranchName"), actualInstrumentDetailsEntity.getStringValueForField("BranchName"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigPreparedBy")) {
				actualInstrumentDetailsEntity.setStringValueForField("PreparedBy", fetchValueFromTextFields(preparedByTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("PreparedBy"), actualInstrumentDetailsEntity.getStringValueForField("PreparedBy"), AssertionType.WARNING);
			}

			if (instrumentDetailsEntity.getBooleanValueForField("ConfigCheckedBy")) {
				actualInstrumentDetailsEntity.setStringValueForField("CheckedBy", fetchValueFromTextFields(checkedByTextField));
				assertReference.assertEquals(instrumentDetailsEntity.getStringValueForField("CheckedBy"), actualInstrumentDetailsEntity.getStringValueForField("CheckedBy"), AssertionType.WARNING);
			}
		}
	}
	public void clearChequeDetails(InstrumentDetailsEntity instrumentDetailsEntity) {
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigClearChequeButton")) {
			click(clearChequeButton);
			switchToFrame("display");
		}
	}

	public void dishonourChequeDetails(InstrumentDetailsEntity instrumentDetailsEntity) {
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigDishonourChequeButton")) {
			click(dishonourChequeButton);
			switchToFrame("display");
		}
	}

	public void backFromInstrumentDetails(InstrumentDetailsEntity instrumentDetailsEntity) {
		if (instrumentDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void fillAndSubmitInstrumentDetails(InstrumentDetailsEntity instrumentDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillInstrumentDetails(instrumentDetailsEntity, assertReference);
		clearChequeDetails(instrumentDetailsEntity);
		dishonourChequeDetails(instrumentDetailsEntity);
		navigateToAccountTransaction(instrumentDetailsEntity);
		navigateToInstrumentDetail(instrumentDetailsEntity);



	}

}



