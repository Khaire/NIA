package com.aqm.staf.library.pages.reinsurance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntityReinsurance;
import com.aqm.staf.library.databin.RiContractEntityReinsurance;

public class RIcontractDetailsCreatePageReinsurance extends WebPage{

	private PageElement riContractDetailsTitle;
	private PageElement riContractReferenceNoTextField;
	private PageElement riContractNameTextField;
	private PageElement contractStartDateTextField;
	private PageElement contractEndDateTextField;
	private PageElement provisionalNoticeOfCancellationTextField;
	private PageElement renewalAlertDaysTextField;
	private PageElement reinsurerCedantFindButton;
	private PageElement FCMRedioButton;
	private PageElement RCMRedioButton;
	private PageElement nilGSTRedioButton;
	private PageElement normalRedioButton;
	private PageElement exemptedRedioButton;
	private PageElement writtenLinePercentageTextField;	;
	private PageElement signedLineTextField;
	private PageElement noClaimBonusTextField;
	private PageElement managementExpensePercentageTextField;
	private PageElement portfolioPremiumTextField;
	private PageElement portfolioLossTextField;
	private PageElement premiumReserveTextField; 
	private PageElement lossReserveTextField;
	private PageElement contractSectionTitle;
	private PageElement minorClassFindButton;
	private PageElement ProductFindButton;
	private PageElement profitComissionTextField;
	private PageElement commissionTextField;
	private PageElement addSectionButton;
	private PageElement deletSectionButton;
	private PageElement saveButton;
	private PageElement cancelButton;
	private PageElement brokerFindButton;
	private PageElement PartyACStartMonthFindButton;
	private PageElement PartyACEndMonthFindButton;
	private PageElement reinsurerCedantLink;
	private PageElement PartyACStartMonthLink;
	private PageElement PartyACSEndMonthLink;
	private PageElement BrokerLink;
	private PageElement minorClassLink;
	private PageElement ProductLink;
	public RIcontractDetailsCreatePageReinsurance() {
		super();
	}
	public RIcontractDetailsCreatePageReinsurance(WebDriver driver, String pageName) {
		super(driver, pageName);

		riContractDetailsTitle = new PageElement(By.xpath("//tr//th[contains(text(),'RI Contract Details')]"), "RI Contract Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riContractReferenceNoTextField = new PageElement(By.xpath("//input[@name='txtContractReferenceNo']"), "RI Contract Reference No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riContractNameTextField = new PageElement(By.xpath("//input[@name='txtContractName']"), "RI Contract Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contractStartDateTextField = new PageElement(By.xpath("//input[@name='txtEffectiveDate']"), "Contract Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contractEndDateTextField = new PageElement(By.xpath("//input[@name='txtEndDate']"), "Contract End Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		provisionalNoticeOfCancellationTextField= new PageElement(By.xpath("//input[@name='txtCancellationNotice']"), "Provisional Notice Of Cancellation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		renewalAlertDaysTextField= new PageElement(By.xpath("//input[@name='txtRenewalAlert']"), "Renewal Alert Days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinsurerCedantFindButton= new PageElement(By.xpath("//input[@name='subReins']"), "ReinsurerCedant", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		brokerFindButton = new PageElement(By.xpath("//input[@name='subReins']"), "ReinsurerCedant", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyACStartMonthFindButton = new PageElement(By.xpath("//input[@name='subMonth1']"), "Party AC StartMonth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartyACEndMonthFindButton = new PageElement(By.xpath("//input[@name='subMonth2']"), "Party AC EndMonth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		writtenLinePercentageTextField = new PageElement(By.xpath("//input[@name='txtWrittenLine']"), "Written Line", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		signedLineTextField = new PageElement(By.xpath("//input[@name='txtSignedLine']"), "Written Line", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noClaimBonusTextField = new PageElement(By.xpath("//input[@name='txtNoClaimBonusPct']"), "No Claim Bonus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		managementExpensePercentageTextField = new PageElement(By.xpath("//input[@name='txtManagement']"), "Management Expense", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portfolioPremiumTextField = new PageElement(By.xpath("//input[@name='txtPortfolioPremium']"), "Portfolio Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portfolioLossTextField = new PageElement(By.xpath("//input[@name='txtPortfolioLoss']"), "Portfolio Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumReserveTextField = new PageElement(By.xpath("//input[@name='txtPremiumReserve']"), "Premium Reserve", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossReserveTextField = new PageElement(By.xpath("//input[@name='txtLossReserve']"), "Loss Reserve", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//lossReserveTextField = new PageElement(By.xpath("//input[@name='txtLossReserve']"), "Loss Reserve", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minorClassFindButton = new PageElement(By.xpath("//input[@name='subLOB']"), "Minor Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ProductFindButton = new PageElement(By.xpath("//input[@name='subPolicyType']"), "Product", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		profitComissionTextField = new PageElement(By.xpath("//input[@name='txtProfitCommission']"), "Profit Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commissionTextField = new PageElement(By.xpath("//input[@name='txtCommission']"), "Profit Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addSectionButton = new PageElement(By.xpath("//input[@name='addSection']"), "Add Section", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton = new PageElement(By.xpath("//input[@name='submit1']"), "SaveButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cancelButton = new PageElement(By.xpath("//input[@name='submit2']"), "CancelButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillRIContractDetails(RiContractEntityReinsurance riContractEntityReinsurance, CustomAssert assertReference) throws InterruptedException{
		WebDriverWait wait	=new WebDriverWait(driver, 30);;
		if(riContractEntityReinsurance.getAction().equalsIgnoreCase("add") || riContractEntityReinsurance.getAction().equalsIgnoreCase("edit")){
			
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRiContractReferance")) {
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				clearAndSendKeys(riContractReferenceNoTextField,riContractEntityReinsurance.getStringValueForField("RiContractReferance"));
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRiContractName")) {
				clearAndSendKeys(riContractNameTextField, riContractEntityReinsurance.getStringValueForField("RiContractName"));
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigContractStartDate")) {

				String contractStartDate=RandomCodeGenerator.dateGenerator(riContractEntityReinsurance.getStringValueForField("contractStartDate"));
				clearAndSendKeys(contractStartDateTextField,contractStartDate );
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigContractEndDate")) {

				String contractEndDate=RandomCodeGenerator.dateGenerator(riContractEntityReinsurance.getStringValueForField("ContractEndDate"));
				clearAndSendKeys(contractEndDateTextField, contractEndDate);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigProvisionalNoticeCancellation")) {
				clearAndSendKeys(provisionalNoticeOfCancellationTextField, riContractEntityReinsurance.getStringValueForField("ProvisionalNoticeCancellation"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRenewalAlertDays")) {
				clearAndSendKeys(renewalAlertDaysTextField, riContractEntityReinsurance.getStringValueForField("RenewalAlertDays"));
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigwrittenLinePercentage")) {
				clearAndSendKeys(writtenLinePercentageTextField, riContractEntityReinsurance.getStringValueForField("writtenLinePercentage"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigSignedLine")) {
				clearAndSendKeys(signedLineTextField, riContractEntityReinsurance.getStringValueForField("SignedLine"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigNoClaimBonus")) {
				clearAndSendKeys(noClaimBonusTextField, riContractEntityReinsurance.getStringValueForField("NoClaimBonus"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigManagementExpensePer")) {
				clearAndSendKeys(managementExpensePercentageTextField, riContractEntityReinsurance.getStringValueForField("ManagementExpensePer"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPortfolioPremium")) {
				clearAndSendKeys(portfolioPremiumTextField, riContractEntityReinsurance.getStringValueForField("PortfolioPremium"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPortfolioLoss")) {
				clearAndSendKeys(portfolioLossTextField, riContractEntityReinsurance.getStringValueForField("PortfolioLoss"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPremiumReserve")) {
				clearAndSendKeys(premiumReserveTextField, riContractEntityReinsurance.getStringValueForField("PremiumReserve"));
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfiglossReserve")) {
				clearAndSendKeys(lossReserveTextField, riContractEntityReinsurance.getStringValueForField("lossReserve"));
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigReinsurerCedant")) {
				switchToFrame("display");
				click(reinsurerCedantFindButton);
				switchToWindow("Generic Search");
				reinsurerCedantLink =new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("ReinsurerCedant")+"')]"), "Reinsurer Cedant", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(reinsurerCedantLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigBroker")) {
				switchToFrame("display");
				click(brokerFindButton);
				switchToWindow("Generic Search");
				BrokerLink =new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("Broker")+"')]"), "Broker", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(BrokerLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPartyACStartMonth")) {
				switchToFrame("display");
				click(PartyACStartMonthFindButton);
				switchToWindow("Generic Search");
				PartyACStartMonthLink =new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("PartyACStartMonth")+"')]"), "PartyACStartMonth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(PartyACStartMonthLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPartyACSEndMonth")) {
				switchToFrame("display");
				click(PartyACStartMonthFindButton);
				switchToWindow("Generic Search");
				PartyACSEndMonthLink=new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("PartyACSEndMonth")+"')]"), "PartyACSEndMonth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(PartyACSEndMonthLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}


			if (riContractEntityReinsurance.getBooleanValueForField("ConfigMinorClass")) {
				switchToFrame("display");
				click(minorClassFindButton);
				switchToWindow("Generic Search");
				minorClassLink=new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("MinorClass")+"')]"), "MinorClass", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(minorClassLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}


			if (riContractEntityReinsurance.getBooleanValueForField("ConfigProduct")) {
				switchToFrame("display");
				click(ProductFindButton);
				switchToWindow("Generic Search");
				ProductLink=new PageElement (By.xpath("//a[contains(text(),'"+riContractEntityReinsurance.getStringValueForField("ProductLOB")+"')]"), "Product", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(ProductLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
		}
		else if(riContractEntityReinsurance.getAction().equalsIgnoreCase("verify")){

			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRiContractReferance")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("RiContractReferance"), fetchValueFromTextFields(riContractReferenceNoTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRiContractName")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("RiContractName"), fetchValueFromTextFields(riContractNameTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigContractStartDate")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("contractStartDate"), fetchValueFromTextFields(contractStartDateTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigContractEndDate")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("ContractEndDate"), fetchValueFromTextFields(contractEndDateTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigProvisionalNoticeCancellation")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("ProvisionalNoticeCancellation"), fetchValueFromTextFields(provisionalNoticeOfCancellationTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigRenewalAlertDays")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("RenewalAlertDays"), fetchValueFromTextFields(renewalAlertDaysTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigwrittenLinePercentage")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("writtenLinePercentage"), fetchValueFromTextFields(writtenLinePercentageTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigSignedLine")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("SignedLine"), fetchValueFromTextFields(signedLineTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigNoClaimBonus")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("NoClaimBonus"), fetchValueFromTextFields(noClaimBonusTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigManagementExpensePer")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("ManagementExpensePer"), fetchValueFromTextFields(managementExpensePercentageTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPortfolioPremium")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("PortfolioPremium"), fetchValueFromTextFields(portfolioPremiumTextField), AssertionType.WARNING);
			}
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPortfolioLoss")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("PortfolioLoss"), fetchValueFromTextFields(portfolioLossTextField), AssertionType.WARNING);
			}
			
			if (riContractEntityReinsurance.getBooleanValueForField("ConfigPremiumReserve")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("PremiumReserve"), fetchValueFromTextFields(premiumReserveTextField), AssertionType.WARNING);
			}	
			if (riContractEntityReinsurance.getBooleanValueForField("ConfiglossReserve")) {
				assertReference.assertEquals(riContractEntityReinsurance.getStringValueForField("lossReserve"), fetchValueFromTextFields(lossReserveTextField), AssertionType.WARNING);
			}	
		}
	}
	public void saveRIContractDetails(RiContractEntityReinsurance riContractEntityReinsurance) throws InterruptedException {
		if (riContractEntityReinsurance.getBooleanValueForField("ConfigSaveRiContractBtn")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click(saveButton);
			if(isAlertPresent()) {
				acceptAlertAndReturnConfirmationMessage();
			}
			switchToFrame("display");
		}
	}

	public void fillandSubmitRIContractDetails(RiContractEntityReinsurance riContractEntityReinsurance, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(riContractEntityReinsurance.getConfigExecute())){
			switchToFrame("display");
			fillRIContractDetails(riContractEntityReinsurance, assertReference);
			saveRIContractDetails(riContractEntityReinsurance);

		}
	}	

}
