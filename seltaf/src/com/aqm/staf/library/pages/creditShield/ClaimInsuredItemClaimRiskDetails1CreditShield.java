package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CLInsItClaimRiskDet1CSEntity;
import com.aqm.staf.library.databin.ClaimDamageDetailsEntity;
import com.aqm.staf.library.databin.PolicyAttPolDetailsCSEntity;

public class ClaimInsuredItemClaimRiskDetails1CreditShield extends BasePage{
	
	private PageElement claimRiskDetails1Title;
	private PageElement cDcEClaimRiskDetails2Title;
	
	private PageElement claimSubTab;
	private PageElement claimInsuredItemTab;
	private PageElement claimDocumentTab;
	private PageElement claimPartiesTab;
	private PageElement claimReserveTab;
	private PageElement claimPaymentTab;
	private PageElement claimAttributesTab;

	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	
	private PageElement claimInsuredItemTabTitle;
	private PageElement claimDocumentTabTitle;
	private PageElement claimPartiesTabTitle;
	private PageElement claimReserveTabTitle;
	private PageElement claimPaymentTabTitle;
	private PageElement claimAttributesTabTitle;

	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	
	private PageElement claimNumberLable;
	private PageElement claimDateLable;
	private PageElement productCodeLable;
	private PageElement insuredSerialNoLable;
	private PageElement policyNumberLable;
	private PageElement claimStatusLable;
	private PageElement causeOfLossLable;
	private PageElement insuredItemCodeLable;

	private PageElement insuredNameTextField;
	private PageElement typeOfBuyerDropDown;
	private PageElement noofDaysOverdueTextField;
	private PageElement totalAmountOwedBytheApprovedBuyerTextField;
	private PageElement amountReceivedTextField;
	private PageElement netAmountOwingTextField;
	private PageElement claimedAmountTextField;
	private PageElement wasAnyBillorChequeDishonouredDuringTheAbovePeriodDropDown;
	private PageElement detailsofBillChequeDishonouredTextField;
	private PageElement riskCodeDropDown;
	private PageElement buyerCodeTextField;
	private PageElement buyerNameTextField;
	private PageElement locationAddressTextField;
	private PageElement tradingStartDateTextField;
	private PageElement whetherInvoicesSubmittedAreDulyAcknowledgedTextField;
	private PageElement whetherThebuyerIsCLorDCLDropDown;
	private PageElement dateofExpiryOfWaitingPeriodFindButton;
	private PageElement whetherInvoicesWereDeclaredInTheMonthlyTextField;
	private PageElement whetherAccountStatementProvidedDulyCertifiedTextField;
	private PageElement whetherDebtIsAcknowledgedByTheBuyerTextField;
	private PageElement legalActionInitiatedByInsuredTextField;
	//CE 
	private PageElement typeofInsolvencyTextField;
	private PageElement nameAndAddOfInsolvencyPractitionerRecTextField;
	private PageElement amountOfDebtConfirmedbyInsolvencypractitionerTextField;
	private PageElement dateOfRegistrationOfDebtFindButton;
	private PageElement tradingStartDateFindButton;
	private PageElement dateOfRegistrationOfDebtTextField;
	private PageElement nextButton;
	private PageElement backButton;
	private PageElement dateofRegistrationofDebtFindButton;
	private PageElement dateofExpiryOfWaitingPeriodTextField;
	
	public ClaimInsuredItemClaimRiskDetails1CreditShield (WebDriver driver, String pageName) {
		super(driver, pageName);
 			
 	 	//claimRiskDetails1Title	    = new PageElement(By.xpath("//div/b[contains(text(),'Claim Risk Details 1')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	//cDcEClaimRiskDetails2Title	= new PageElement(By.xpath("//form[@name='S0201']//div/b"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	
 	 	claimSubTab			= new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
 	 	claimInsuredItemTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimDocumentTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimPartiesTab  	= new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimReserveTab		= new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimPaymentTab		= new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	claimAttributesTab	= new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
 	 	insuredItemDetailsTab	= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	insuredItemAttributeTab	= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
 	 	
 	 	claimInsuredItemTabTitle = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "claim Insured Item Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimDocumentTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Document Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimPartiesTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim Associated Parties')]"), "Claim Parties Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimReserveTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Reserve Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimPaymentTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim')]"), "Claim Payment Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimAttributesTabTitle	 = new PageElement(By.xpath("//div/b[contains(text(),'Claim Property')]"), "Claim Attributes Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 		
 	 	insuredItemDetailsTabTitle   = new PageElement(By.xpath("//div/b[contains(text(),'Claim Insured InterestDamage Detail')]"), "Insured Item Details Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	insuredItemAttributeTabTitle = new PageElement(By.xpath("//div/b[contains(text(),'Claim Insured Property')]"), "Insured Item Attribute Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	
 	 	claimNumberLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Claim')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	claimDateLable			= new PageElement(By.xpath("///td//div//b[contains(text(),'Date')]/following::td"), "Claim Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	productCodeLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Seria lNo Lable ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLable		= new PageElement(By.xpath("//td//b[contains(text(),'Number')]/following::td"), "policy Number Lable ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLable		= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Claim Status Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLable		= new PageElement(By.xpath("//td//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLable	= new PageElement(By.xpath("//td//b[contains(text(),'Insured Item Code')]/following::td"), "insured Item Code Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 	 	
		insuredNameTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Insured Name')]/following::input"), "Serial Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfBuyerDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Type of Buyer')]/following::select"), "Type of Buyer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noofDaysOverdueTextField	= new PageElement(By.xpath("//td//div[contains(text(),'No of days Overdue')]/following::input"), "No of days Overdue TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAmountOwedBytheApprovedBuyerTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Total amount owed by the Approved Buyer')]/following::input"), "Total amount owed by the Approved Buyer TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountReceivedTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Amount received (Rs)')]/following::input"), "Amount received (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netAmountOwingTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Net amount owing (Rs)')]/following::input"), "Net amount owing (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimedAmountTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Claimed Amount')]/following::input"), "Claimed Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		wasAnyBillorChequeDishonouredDuringTheAbovePeriodDropDown	=new PageElement(By.xpath("//td//div[contains(text(),'Was any bill or cheque dishonoured during the above period ?')]/following::select"), "Was any bill or cheque dishonoured during the above period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsofBillChequeDishonouredTextField	=new PageElement(By.xpath("//td//div[@id='Details of Bill/Cheque Dishonoured']/following::textarea"), "Details of Bill/Cheque Dishonoured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCodeDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Risk-Code')]/following::select"), "Risk-Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buyerCodeTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Buyer code')]/following::input"), "Buyer code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		buyerNameTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Buyer Name')]/following::input"), "Buyer Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationAddressTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Location Address')]/following::input"), "Location Address TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tradingStartDateTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Trading Start Date')]/following::input"), "Trading Start Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherInvoicesSubmittedAreDulyAcknowledgedTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Whether Invoices submitted are duly acknowledged')]/following::input"), "Whether Invoices submitted are duly acknowledged TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherThebuyerIsCLorDCLDropDown						=new PageElement(By.xpath("//td//div[contains(text(),'Whether the buyer is CL or DCL')]/following::select"), "Whether the buyer is CL or DCL TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateofExpiryOfWaitingPeriodTextField					=new PageElement(By.xpath("//td//div[contains(text(),'Date of Expiry of Waiting Period')]/following::input"), "Date of Expiry of Waiting Period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherInvoicesWereDeclaredInTheMonthlyTextField		=new PageElement(By.xpath("//td//div[contains(text(),'Whether Invoices were declared in the monthly Turnover declarations and overdue statements')]/following::input"), "Whether Invoices were declared in the monthly Turnover.. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherAccountStatementProvidedDulyCertifiedTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Whether Account Statement provided duly certified')]/following::input"), "Whether Account Statement provided duly certified TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherDebtIsAcknowledgedByTheBuyerTextField			=new PageElement(By.xpath("//td//div[contains(text(),'Whether Debt is acknowledged by the buyer')]/following::input"), "Whether Debt is acknowledged by the buyer TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalActionInitiatedByInsuredTextField					=new PageElement(By.xpath("//td//div[contains(text(),'Legal Action initiated by Insured')]/following::input"), "Legal Action initiated by Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalActionInitiatedByInsuredTextField					=new PageElement(By.xpath("//td//div[contains(text(),'Legal Action initiated by Insured')]/following::input"), "Legal Action initiated by Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	
		//CE
		typeofInsolvencyTextField =new PageElement(By.xpath("//td//div[contains(text(),'Type of Insolvency')]/following::input"), "Type of Insolvency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameAndAddOfInsolvencyPractitionerRecTextField			=new PageElement(By.xpath("//td//div[contains(text(),'Name & address of Insolvency Practitioner/ Receiver')]/following::textarea"), "Name & address of Insolvency Practitioner Receiver TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfDebtConfirmedbyInsolvencypractitionerTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Amount of debt confirmed by insolvency practitioner')]/following::input"), "Amount of debt confirmed by insolvency practitioner TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofExpiryOfWaitingPeriodTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Expiry of Waiting Period')]/following::input"), "TDate of Expiry of Waiting Period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cDcEClaimRiskDetails2Title=	new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Details 2')]"), "Claim Risk Details 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		dateofRegistrationofDebtFindButton = new PageElement(By.xpath("//td//div[contains(text(),'Date of Registration of Debt')]/following::img"),  "Date of Registration of Debt Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateofExpiryOfWaitingPeriodFindButton	= new PageElement(By.xpath("//td//div[contains(text(),'Date of Expiry of Waiting Period')]/following::img"), "Date of Expiry of Waiting Period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tradingStartDateFindButton		  = new PageElement(By.xpath("//td//div[contains(text(),'Trading Start Date')]/following::img"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfRegistrationOfDebtTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Registration of Debt')]/following::input"), "Date of Registration of Debt TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButton		= new PageElement(By.name("Next1"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
		public void fillInsuredIntClaimRiskDetails(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity, CustomAssert assertReference) throws InterruptedException{
			if(cLInsItClaimRiskDet1CSEntity.getAction().equalsIgnoreCase("add") || cLInsItClaimRiskDet1CSEntity.getAction().equalsIgnoreCase("edit")){
				
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredName")) {
				    clearAndSendKeys(insuredNameTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("InsuredName"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTypeOfBuyer")) {
					selectValueFromList(typeOfBuyerDropDown, cLInsItClaimRiskDet1CSEntity.getStringValueForField("TypeOfBuyer"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNoofDaysOverdue")) {
				    clearAndSendKeys(noofDaysOverdueTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("NoofDaysOverdue"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTotalAmountOwedBytheApprovedBuyer")) {
				    clearAndSendKeys(totalAmountOwedBytheApprovedBuyerTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("TotalAmountOwedBytheApprovedBuyer"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigAmountReceived")) {
				    clearAndSendKeys(amountReceivedTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("AmountReceived"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNetAmountOwing")) {
				    clearAndSendKeys(netAmountOwingTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("NetAmountOwing"));
				 }
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimedAmount")) {
				    clearAndSendKeys(claimedAmountTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("ClaimedAmount"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWasAnyBillorChequeDishonouredDuringTheAbovePeriod")) {
				    selectValueFromList(wasAnyBillorChequeDishonouredDuringTheAbovePeriodDropDown, cLInsItClaimRiskDet1CSEntity.getStringValueForField("WasAnyBillorChequeDishonouredDuringTheAbovePeriod"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDetailsofBillChequeDishonoured")) {
				    clearAndSendKeys(detailsofBillChequeDishonouredTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("DetailsofBillChequeDishonoured"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigRiskCode")) {
					selectValueFromList(riskCodeDropDown, cLInsItClaimRiskDet1CSEntity.getStringValueForField("RiskCode"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigBuyerCode")) {
				    clearAndSendKeys(buyerCodeTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("BuyerCode"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigBuyerName")) {
				    clearAndSendKeys(buyerNameTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("BuyerName"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigLocationAddress")) {
				    clearAndSendKeys(locationAddressTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("LocationAddress"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTradingStartDate")) {
					selectDateFromCalender(tradingStartDateFindButton, cLInsItClaimRiskDet1CSEntity.getStringValueForField("TradingStartDate"));
					switchToFrame("display");
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigwhetherInvoicesSubmittedAreDulyAcknowledged")) {
				    clearAndSendKeys(whetherInvoicesSubmittedAreDulyAcknowledgedTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("whetherInvoicesSubmittedAreDulyAcknowledged"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherThebuyerIsCLorDCL")) {
				    selectValueFromList(whetherThebuyerIsCLorDCLDropDown, cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherThebuyerIsCLorDCL"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDateofExpiryOfWaitingPeriod")) {
			         selectDateFromCalender(dateofExpiryOfWaitingPeriodFindButton, cLInsItClaimRiskDet1CSEntity.getStringValueForField("DateofExpiryOfWaitingPeriod"));
                     switchToFrame("display");
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherInvoicesWereDeclaredInTheMonthly")) {
					Thread.sleep(1000);
				    clearAndSendKeys(whetherInvoicesWereDeclaredInTheMonthlyTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherInvoicesWereDeclaredInTheMonthly"));
				}
				
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherAccountStatementProvidedDulyCertified")) {
				    clearAndSendKeys(whetherAccountStatementProvidedDulyCertifiedTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherAccountStatementProvidedDulyCertified"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherDebtIsAcknowledgedByTheBuyer")) {
				    clearAndSendKeys(whetherDebtIsAcknowledgedByTheBuyerTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherDebtIsAcknowledgedByTheBuyer"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigLegalActionInitiatedByInsured")) {
				    clearAndSendKeys(legalActionInitiatedByInsuredTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("LegalActionInitiatedByInsured"));
				}
				//CE
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTypeofInsolvency")) {
				    clearAndSendKeys(typeofInsolvencyTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("TypeofInsolvency"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNameAndAddOfInsolvencyPractitionerRec")) {
					clearAndSendKeys(nameAndAddOfInsolvencyPractitionerRecTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("NameAndAddOfInsolvencyPractitionerRec"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigAmountOfDebtConfirmedbyInsolvencypractitioner")) {
					clearAndSendKeys(amountOfDebtConfirmedbyInsolvencypractitionerTextField, cLInsItClaimRiskDet1CSEntity.getStringValueForField("AmountOfDebtConfirmedbyInsolvencypractitioner"));
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDateOfRegistrationOfDebt")) {
					selectDateFromCalender(dateofRegistrationofDebtFindButton, cLInsItClaimRiskDet1CSEntity.getStringValueForField("DateOfRegistrationOfDebt"));
					switchToFrame("display");
				
				}
				
			}
			else if(cLInsItClaimRiskDet1CSEntity.getAction().equalsIgnoreCase("verify")){
								
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimNumber")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("ClaimNumber"), fetchValueFromTextFields(claimNumberLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimDate")) {
				    assertReference.assertEquals(RandomCodeGenerator.dateGenerator(cLInsItClaimRiskDet1CSEntity.getStringValueForField("ClaimDate")), fetchValueFromTextFields(claimDateLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigProductCode")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("ProductCode"), fetchValueFromTextFields(productCodeLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("InsuredSerialNo"), fetchValueFromTextFields(insuredSerialNoLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimStatus")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("ClaimStatus"), fetchValueFromTextFields(claimStatusLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("CauseOfLoss"), fetchValueFromTextFields(causeOfLossLable), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("InsuredItemCode"), fetchValueFromTextFields(insuredItemCodeLable), AssertionType.WARNING);
				}
				
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredName")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTypeOfBuyer")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("TypeOfBuyer"), fetchValueFromTextFields(typeOfBuyerDropDown), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNoofDaysOverdue")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("NoofDaysOverdue"), fetchValueFromTextFields(noofDaysOverdueTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTotalAmountOwedBytheApprovedBuyer")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("TotalAmountOwedBytheApprovedBuyer"), fetchValueFromTextFields(totalAmountOwedBytheApprovedBuyerTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigAmountReceived")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("AmountReceived"), fetchValueFromTextFields(amountReceivedTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNetAmountOwing")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("NetAmountOwing"), fetchValueFromTextFields(netAmountOwingTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimedAmount")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("ClaimedAmount"), fetchValueFromTextFields(claimedAmountTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWasAnyBillorChequeDishonouredDuringTheAbovePeriod")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("WasAnyBillorChequeDishonouredDuringTheAbovePeriod"), fetchValueFromTextFields(wasAnyBillorChequeDishonouredDuringTheAbovePeriodDropDown), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDetailsofBillChequeDishonoured")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("DetailsofBillChequeDishonoured"), fetchValueFromTextFields(detailsofBillChequeDishonouredTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigRiskCode")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("RiskCode"), fetchValueFromTextFields(riskCodeDropDown), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigBuyerCode")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("BuyerCode"), fetchValueFromTextFields(buyerCodeTextField), AssertionType.WARNING);
				 }
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigBuyerName")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("BuyerName"), fetchValueFromTextFields(buyerNameTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigLocationAddress")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("LocationAddress"), fetchValueFromTextFields(locationAddressTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTradingStartDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(cLInsItClaimRiskDet1CSEntity.getStringValueForField("TradingStartDate")) ,fetchValueFromTextFields(tradingStartDateTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigwhetherInvoicesSubmittedAreDulyAcknowledged")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("whetherInvoicesSubmittedAreDulyAcknowledged"), fetchValueFromTextFields(whetherInvoicesSubmittedAreDulyAcknowledgedTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherThebuyerIsCLorDCL")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherThebuyerIsCLorDCL"), fetchValueFromTextFields(whetherThebuyerIsCLorDCLDropDown), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDateofExpiryOfWaitingPeriod")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(cLInsItClaimRiskDet1CSEntity.getStringValueForField("DateofExpiryOfWaitingPeriod")) ,fetchValueFromTextFields(dateofExpiryOfWaitingPeriodTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherInvoicesWereDeclaredInTheMonthly")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherInvoicesWereDeclaredInTheMonthly"), fetchValueFromTextFields(whetherInvoicesWereDeclaredInTheMonthlyTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherAccountStatementProvidedDulyCertified")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherAccountStatementProvidedDulyCertified"), fetchValueFromTextFields(whetherAccountStatementProvidedDulyCertifiedTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigWhetherDebtIsAcknowledgedByTheBuyer")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("WhetherDebtIsAcknowledgedByTheBuyer"), fetchValueFromTextFields(whetherDebtIsAcknowledgedByTheBuyerTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigLegalActionInitiatedByInsured")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("LegalActionInitiatedByInsured"), fetchValueFromTextFields(legalActionInitiatedByInsuredTextField), AssertionType.WARNING);
				}
				
				//CE 
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigTypeofInsolvency")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("TypeofInsolvency"), fetchValueFromTextFields(typeofInsolvencyTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNameAndAddOfInsolvencyPractitionerRec")) {
				    assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("NameAndAddOfInsolvencyPractitionerRec"), fetchValueFromTextFields(nameAndAddOfInsolvencyPractitionerRecTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigAmountOfDebtConfirmedbyInsolvencypractitioner")) {
				   assertReference.assertEquals(cLInsItClaimRiskDet1CSEntity.getStringValueForField("AmountOfDebtConfirmedbyInsolvencypractitioner"), fetchValueFromTextFields(amountOfDebtConfirmedbyInsolvencypractitionerTextField), AssertionType.WARNING);
				}
				if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigDateOfRegistrationOfDebt")) {
				    assertReference.assertEquals(RandomCodeGenerator.dateGenerator(cLInsItClaimRiskDet1CSEntity.getStringValueForField("DateOfRegistrationOfDebt")) ,fetchValueFromTextFields(dateOfRegistrationOfDebtTextField), AssertionType.WARNING);
				}
			}
		}
		
		public void clickNextButton(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity) {
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigNextButton")) {
				click(nextButton);
				switchToFrame("display");
				isElementDisplayed(cDcEClaimRiskDetails2Title);
			}
		}

		public void clickBackButton(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity) {
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigBackButton")) {
				click(backButton);
				switchToFrame("display");
				isElementDisplayed(insuredItemAttributeTabTitle);
			}
		}
		
		public void navigateToClaimSubTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimSubTab")){
				click(claimSubTab);
				switchToFrame("display");
			}
		}
		public void navigateToInsuredIntrestTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimInsuredItemTab")){
				click(claimInsuredItemTab);
				switchToFrame("display");
				isElementDisplayed(claimInsuredItemTabTitle);
			}
		}
		public void navigateToDocumentTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimDocumentTab")){
				click(claimDocumentTab);
				switchToFrame("display");
				isElementDisplayed(claimDocumentTabTitle);
			}
		}
		public void navigateToPartiesTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimPartiesTab")){
				click(claimPartiesTab);
				switchToFrame("display");
				isElementDisplayed(claimPartiesTabTitle);
			}
		}
		public void navigateToReserveTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimReserveTab")){
				click(claimReserveTab);
				switchToFrame("display");
				isElementDisplayed(claimReserveTabTitle);
			}
		}
		public void navigateToPaymentTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimPaymentTab")){
				click(claimPaymentTab);
				switchToFrame("display");
				isElementDisplayed(claimPaymentTabTitle);
			}
		}
		public void navigateToAttributesTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigClaimAttributesTab")){
				click(claimAttributesTab);
				switchToFrame("display");
				isElementDisplayed(claimAttributesTabTitle);
			}
		}
		//Insured Interest Sub Tab
		public void navigateToInsureIntDetailSubTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){
				click(insuredItemDetailsTab);
				switchToFrame("display");
				isElementDisplayed(insuredItemDetailsTabTitle);
			}
		}
		
		public void navigateToInsureIntAttributeSubTab(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity){
			if (cLInsItClaimRiskDet1CSEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){
				click(insuredItemAttributeTab);
				switchToFrame("display");
				isElementDisplayed(cDcEClaimRiskDetails2Title);
			}
		}
		
		public void fillandSubmitInsuredIntClaimRiskDetails1(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntity, CustomAssert assertReference) throws InterruptedException {
			if (isConfigTrue(cLInsItClaimRiskDet1CSEntity.getConfigExecute())){
				switchToFrame("display");
				fillInsuredIntClaimRiskDetails(cLInsItClaimRiskDet1CSEntity,assertReference);
				clickNextButton(cLInsItClaimRiskDet1CSEntity);
				clickBackButton(cLInsItClaimRiskDet1CSEntity);
				navigateToClaimSubTab(cLInsItClaimRiskDet1CSEntity);
				navigateToInsuredIntrestTab(cLInsItClaimRiskDet1CSEntity);
				navigateToDocumentTab(cLInsItClaimRiskDet1CSEntity);
				navigateToPartiesTab(cLInsItClaimRiskDet1CSEntity);
				navigateToReserveTab(cLInsItClaimRiskDet1CSEntity);
				navigateToPaymentTab(cLInsItClaimRiskDet1CSEntity);
				navigateToAttributesTab(cLInsItClaimRiskDet1CSEntity);
				navigateToInsureIntDetailSubTab(cLInsItClaimRiskDet1CSEntity);
				navigateToInsureIntAttributeSubTab(cLInsItClaimRiskDet1CSEntity);
			}
		}	
	
}
