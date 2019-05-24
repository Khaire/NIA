package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyRoleBuyerMastINDEntity;

public class PartyPartyRolesBuyerMasterIND extends BasePage{
	private PageElement buyerMasterINDTitle;
	private PageElement partyTitle;
	private PageElement partyRolesTitle;
	private PageElement contactsTitle;
	private PageElement relatedPartiesTitle;
	private PageElement followupTitle;
	private PageElement hierarchyTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement functionTextField;
	private PageElement applicableEventCodeLabel;
	private PageElement buyerCommentsTextFeild;
	private PageElement buyerCreditRatingTextFeild;
	private PageElement creditLimitRecommendedTextFeild;
	private PageElement legalFormStatusTextFeild;
	private PageElement authorisedCapitalTextFeild;
	private PageElement capitalEmployedTextFeild;
	private PageElement previousYearsShareCapitalTextFeild;
	private PageElement majorStakeholdershareHeldTextFeild;
	private PageElement commentsOnShareHoldingTextFeild;
	private PageElement boardOfDirectorsPrincipalsTextFeild;
	private PageElement keyExecutivesTextFeild;
	private PageElement lineofBusinessTextFeild;
	private PageElement noOfEmployeesTextFeild;
	private PageElement bankersTextFeild;
	private PageElement facilitiesEnjoyedTextFeild;
	private PageElement bankingRelationsTextFeild;
	private PageElement buyerAuditorsTextFeild;
	private PageElement businessActivityTextFeild;
	private PageElement importsPurchasesTextFeild;
	private PageElement importPurchaseTermsTextFeild;
	private PageElement exportSalesTextFeild;
	private PageElement exportSalesTermsTextFeild;
	private PageElement associateCompaniesTextFeild;
	private PageElement subsidiaryCompaniesTextFeild;
	private PageElement sourcesOfFundTextFeild;
	private PageElement paidupEquityCapitalTextFeild;
	private PageElement reserveSurplusTextFeild;
	private PageElement securedLoansTextFeild;
	private PageElement unsecuredLoansTextFeild;
	private PageElement deferredtaxliabilitiesTextFeild;
	private PageElement grossFixedAssetsTextFeild;
	private PageElement lessCumulativeDepTextFeild;
	private PageElement netFixedAssetsTextFeild;
	private PageElement deferredTaxAssetsTextFeild;
	private PageElement capitalWorkinProgressTextFeild;
	private PageElement inventoriesTextFeild;
	private PageElement sundryDebtorsTextFeild;
	private PageElement advLoanstoCorporateBodiesTextFeild;
	private PageElement cashBankBalanceTextFeild;
	private PageElement otherCurrentliabilitiesTextFeild;
	private PageElement provisionsTextFeild;
	private PageElement netCurrentAssetsTextFeild;
	private PageElement debtorsOthersTextFeild;
	private PageElement guranteesUndertakenTextFeild;
	private PageElement operatingIncomeTextFeild;
	private PageElement otherIncomeTextFeild;
	private PageElement changeInstocksTextFeild;
	private PageElement rawMaterialsTextFeild;
	private PageElement wagesSalariesTextFeild;
	private PageElement otherOperatingExpensesTextFeild;
	private PageElement distributionExpensesTextFeild;
	private PageElement miscOtherExpensesTextFeild;
	private PageElement financialChargesTextFeild;
	private PageElement buyerDepreciationTextFeild;
	private PageElement taxProvisionTextFeild;
	private PageElement appropriationsTextFeild;
	private PageElement ratioYear1Dropdown;
	private PageElement averageCollectionDays1TextFeild;
	private PageElement accountReceivablesTurnover1TextFeild;
	private PageElement inventoryTurnover1TextFeild;
	private PageElement assetTurnover1TextFeild;
	private PageElement ratioYear2Dropdown;
	private PageElement averageCollectionDays2TextFeild;
	private PageElement accountReceivablesTurnover2TextFeild;
	private PageElement inventoryTurnover2TextFeild;
	private PageElement assetTurnover2TextFeild;
	private PageElement ratioYear3Dropdown;
	private PageElement averageCollectionDays3TextFeild;
	private PageElement accountReceivablesTurnover3TextFeild;
	private PageElement inventoryTurnover3TextFeild;
	private PageElement assetTurnover3TextFeild;
	private PageElement debtRatioTextFeild;
	private PageElement currentLiabilitiesNetWorthTextFeild;
	private PageElement fixedAssetNetworthTextFeild;
	private PageElement debtEquityRatioTextFeild;
	private PageElement interestCoverageRatioTextFeild;
	private PageElement pATTotalIncomeTextFeild;
	private PageElement netProfitMarginTextFeild;
	private PageElement returnOnTotalAssetsTextFeild;
	private PageElement returnonInvestmentROITextFeild;
	private PageElement currentRatioTextFeild;
	private PageElement quickRatioTextFeild;
	private PageElement nAMEOFTHECOUNTRYTextFeild;
	private PageElement zipCodeTextFeild;
	private PageElement partyDetailsTitle;
	private PageElement partyFunctionsTitle;
	private PageElement partyContactsTitle;
	private PageElement partyRelationsTitle;
	private PageElement partyFollowupListTitle;
	private PageElement partytreeTitle;
	private PageElement nextButton;
	private PageElement saveButton;
	private PageElement backButton;

	public PartyPartyRolesBuyerMasterIND(WebDriver driver, String pageName) {
		super(driver, pageName);
		buyerMasterINDTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Buyer Master IND')]"),"Buyer Master IND Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Party')]"),"Party Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyRolesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Roles')]"),"Party Roles Title ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		contactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contacts')]"),"Contacts Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relatedPartiesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Related')]"),"Related Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		followupTitle=new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"),"Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		hierarchyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Hierarchy')]"),"Hierarchy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Code")),"PartyCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Name")),"NameLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		functionTextField=new PageElement(By.xpath(locatorforPanel("Function", "input")),"Function",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","ApplicableEventCode")),"ApplicableEventCodeLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		buyerCommentsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Buyer Comments')]/following::textarea"),"Buyer Comments Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		buyerCreditRatingTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Buyer Credit Rating')]/following::input"),"Buyer Credit Rating TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		creditLimitRecommendedTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Credit Limit Recommended')]/following::input"),"Credit Limit Recommended", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		legalFormStatusTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Legal Form/Status')]/following::textarea"),"Legal Form/Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		authorisedCapitalTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Authorised Capital')]/following::input"),"Authorised Capital", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		capitalEmployedTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Capital Employed')]/following::textarea"),"Capital Employed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		previousYearsShareCapitalTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Previous Years Share Capital')]/following::input"),"Previous Years Share Capital", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		majorStakeholdershareHeldTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Major Stakeholders/Share Held')]/following::textarea"),"Major Stakeholders/Share Held", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		commentsOnShareHoldingTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Comments on Share Holding')]/following::textarea"),"Comments on Share Holding", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		boardOfDirectorsPrincipalsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Board of Directors/Principals')]/following::textarea"),"Board of Directors/Principals", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		keyExecutivesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Key Executives')]/following::textarea"),"key Executives TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lineofBusinessTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Line of Business')]/following::textarea"),"Line of Business TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfEmployeesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'No of Employees')]/following::input"),"No of Employees TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bankersTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Bankers')]/following::textarea"),"Bankers TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		facilitiesEnjoyedTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Facilities Enjoyed')]/following::textarea"),"Facilities Enjoyed TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bankingRelationsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Banking Relations')]/following::textarea"),"banking Relations TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		buyerAuditorsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Buyer Auditors')]/following::textarea"),"Buyer Auditors TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		businessActivityTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Business Activity')]/following::textarea"),"Business Activity TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		importsPurchasesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Imports/Purchases')]/following::textarea"),"Imports/Purchases TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		importPurchaseTermsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Import/Purchase Terms')]/following::textarea"),"Import/Purchase Terms TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		exportSalesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Export/Sales')]/following::textarea"),"Export/Sales TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		exportSalesTermsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Export/Sales Terms')]/following::textarea"),"Export/Sales Terms	 TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		associateCompaniesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Associate Companies')]/following::textarea"),"Associate Companies TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		subsidiaryCompaniesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Subsidiary Companies')]/following::textarea"),"Subsidiary Companies TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sourcesOfFundTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Sources Of Fund')]/following::textarea"),"Sources Of Fund  TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paidupEquityCapitalTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Paid-up Equity Capital')]/following::input"),"paid up Equity Capital TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveSurplusTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Reserve & Surplus')]/following::input"),"Reserve & Surplus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		securedLoansTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Secured Loans')]/following::input"),"Secured Loans", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		unsecuredLoansTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Unsecured Loans')]/following::input"),"UnSecured Loans", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deferredtaxliabilitiesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Deferred tax liabilities')]/following::input"),"Deferred tax liabilities", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossFixedAssetsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Gross Fixed Assets')]/following::input"),"Gross Fixed Assets", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lessCumulativeDepTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Less Cumulative Dep')]/following::input"),"Less Cumulative Dep", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netFixedAssetsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Net Fixed Assets')]/following::input"),"Net Fixed Assets", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deferredTaxAssetsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Deferred Tax Assets')]/following::input"),"eferred Tax Assets", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		capitalWorkinProgressTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Capital Work in Progress')]/following::textarea"),"Capital Work in Progress", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		inventoriesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Inventories')]/following::input"),"Inventories", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sundryDebtorsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Sundry Debtors')]/following::input"),"Sundry Debtors", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		advLoanstoCorporateBodiesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Adv/Loans to Corporate Bodies')]/following::input"),"Adv/Loans to Corporate Bodies", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cashBankBalanceTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Cash & Bank Balance')]/following::input"),"Cash & Bank Balance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherCurrentliabilitiesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Other Current liabilities')]/following::input"),"Other Current liabilities", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		provisionsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Provisions')]/following::input"),"Provisions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netCurrentAssetsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Net Current Assets')]/following::input"),"Net Current Assets", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debtorsOthersTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Debtors Others')]/following::input"),"Debtors Others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		guranteesUndertakenTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Gurantees undertaken')]/following::textarea"),"gurantee sundertaken TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		operatingIncomeTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Operating Income')]/following::input"),"Operating Income", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherIncomeTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Other Income')]/following::input"),"Other Income", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		changeInstocksTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Change in stocks')]/following::textarea"),"Change in stocks TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rawMaterialsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Raw Materials')]/following::input"),"Raw Materials", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		wagesSalariesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Wages & Salaries')]/following::input"),"Wages & Salaries", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherOperatingExpensesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Other Operating Expenses')]/following::input"),"Other Operating Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		distributionExpensesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Distribution Expenses')]/following::input"),"Distribution Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		miscOtherExpensesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Misc/Other Expenses')]/following::input"),"Misc/Other Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		financialChargesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Financial charges')]/following::input"),"Financial charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		buyerDepreciationTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Buyer Depreciation')]/following::input"),"Buyer Depreciation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		taxProvisionTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Tax provision')]/following::input"),"Tax provision", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		appropriationsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Appropriations')]/following::input"),"Appropriations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ratioYear1Dropdown=new PageElement(By.xpath("//td//div[contains(text(),'Ratio Year1')]/following::select"),"Ratio Year1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		averageCollectionDays1TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Average Collection Days1')]/following::input"),"Average Collection Days1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		accountReceivablesTurnover1TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Account Receivables Turnover1')]/following::input"),"Account Receivables Turnover1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		inventoryTurnover1TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Inventory Turnover1')]/following::input"),"Inventory Turnover1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		assetTurnover1TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Asset Turnover1')]/following::input"),"Asset Turnover1",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ratioYear2Dropdown=new PageElement(By.xpath("//td//div[contains(text(),'Ratio Year2')]/following::select"),"Ratio Year2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		averageCollectionDays2TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Average Collection Days2')]/following::input"),"Average Collection Days2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		accountReceivablesTurnover2TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Account Receivables Turnover2')]/following::input"),"Account Receivables Turnover2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		inventoryTurnover2TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Inventory Turnover2')]/following::input"),"Inventory Turnover2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		assetTurnover2TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Asset Turnover2')]/following::input"),"Asset Turnover2",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ratioYear3Dropdown=new PageElement(By.xpath("//td//div[contains(text(),'Ratio Year3')]/following::select"),"Ratio Year3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		averageCollectionDays3TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Average Collection Days3')]/following::input"),"Average Collection Days3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		accountReceivablesTurnover3TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Account Receivables Turnover3')]/following::input"),"Account Receivables Turnover3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		inventoryTurnover3TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Inventory Turnover3')]/following::input"),"Inventory Turnover3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		assetTurnover3TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Asset Turnover3')]/following::input"),"Asset Turnover3",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		debtRatioTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Debt Ratio')]/following::input"),"Debt Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debtEquityRatioTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Debt Equity Ratio')]/following::input"),"Debt Equity Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currentLiabilitiesNetWorthTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Current Liabilities-NetWorth')]/following::input"),"Current Liabilities-NetWorth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		fixedAssetNetworthTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Fixed Asset-Networth')]/following::input"),"Fixed Asset-Networth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		interestCoverageRatioTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Interest Coverage Ratio')]/following::input"),"Interest Coverage Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pATTotalIncomeTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'PAT-Total Income')]/following::input"),"PAT-Total Income", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netProfitMarginTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Net Profit Margin')]/following::input"),"Net Profit Margin", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		returnOnTotalAssetsTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Return on Total Assets')]/following::input"),"Return on Total Assets", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		returnonInvestmentROITextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Return on Investment(ROI)')]/following::input"),"Return on Investment(ROI)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currentRatioTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Current Ratio')]/following::input"),"Current Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quickRatioTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Quick Ratio')]/following::input"),"Quick Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nAMEOFTHECOUNTRYTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'NAME OF THE COUNTRY')]/following::textarea"),"NAME OF THE COUNTRY", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		zipCodeTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Zip Code')]/following::input"),"Zip Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunctionsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Functions')]"), "Party Function Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyContactsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Contact')]"), "Contact Details ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Party Relations')]"),"PartyRelationsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFollowupListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "PartyFollowup List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partytreeTitle = new PageElement(By.xpath("//b[contains(text(),'PartyTree')]"),"Party Tree Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextButton=new PageElement(By.name("Next"),"NextArrowButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("save"),"SaveButton",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
	//Services
	public void fillPartyPartyRolesBuyerMasterIND(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity, CustomAssert assertReference){
		if(partyRoleBuyerMastINDEntity.getAction().equalsIgnoreCase("add") || partyRoleBuyerMastINDEntity.getAction().equalsIgnoreCase("edit")){
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerComments")) {
				clearAndSendKeys(buyerCommentsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BuyerComments"));
			}			
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerCreditRating")) {
				clearAndSendKeys(buyerCreditRatingTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BuyerCreditRating"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCreditLimitRecommended")) {
				clearAndSendKeys(creditLimitRecommendedTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CreditLimitRecommended"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLegalFormStatus")) {
				clearAndSendKeys(legalFormStatusTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("LegalFormStatus"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAuthorisedCapital")) {
				clearAndSendKeys(authorisedCapitalTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AuthorisedCapital"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCapitalEmployed")) {
				clearAndSendKeys(capitalEmployedTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CapitalEmployed"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPreviousYearsShareCapital")) {
				clearAndSendKeys(previousYearsShareCapitalTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("PreviousYearsShareCapital"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigMajorStakeholdersShareHeld")) {
				clearAndSendKeys(majorStakeholdershareHeldTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("MajorStakeholdersShareHeld"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCommentsonShareHolding")) {
				clearAndSendKeys(commentsOnShareHoldingTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CommentsonShareHolding"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBoardofDirectorsPrincipals")) {
				clearAndSendKeys(boardOfDirectorsPrincipalsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BoardofDirectorsPrincipals"));
			}		
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigKeyExecutives")) {
				clearAndSendKeys(keyExecutivesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("KeyExecutives"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLineofBusiness")) {
				clearAndSendKeys(lineofBusinessTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("LineofBusiness"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNoOfEmployees")) {
				clearAndSendKeys(noOfEmployeesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("NoOfEmployees"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBankers")) {
				clearAndSendKeys(bankersTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("Bankers"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFacilitiesEnjoyed")) {
				clearAndSendKeys(facilitiesEnjoyedTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("FacilitiesEnjoyed"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBankingRelations")) {
				clearAndSendKeys(bankingRelationsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BankingRelations"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerAuditors")) {
				clearAndSendKeys(buyerAuditorsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BuyerAuditors"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBusinessActivity")) {
				clearAndSendKeys(businessActivityTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BusinessActivity"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigImportsPurchases")) {
				clearAndSendKeys(importsPurchasesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ImportsPurchases"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigImportPurchaseTerms")) {
				clearAndSendKeys(importPurchaseTermsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ImportPurchaseTerms"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigExportSales")) {
				clearAndSendKeys(exportSalesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ExportSales"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigExportSalesTerms")) {
				clearAndSendKeys(exportSalesTermsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ExportSalesTerms"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssociateCompanies")) {
				clearAndSendKeys(associateCompaniesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AssociateCompanies"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSubsidiaryCompanies")) {
				clearAndSendKeys(subsidiaryCompaniesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("SubsidiaryCompanies"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSourcesOfFund")) {
				clearAndSendKeys(sourcesOfFundTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("SourcesOfFund"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPaidupEquityCapital")) {
				clearAndSendKeys(paidupEquityCapitalTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("PaidupEquityCapital"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReserveSurplus")) {
				clearAndSendKeys(reserveSurplusTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ReserveSurplus"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSecuredLoans")) {
				clearAndSendKeys(securedLoansTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("SecuredLoans"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigUnsecuredLoans")) {
				clearAndSendKeys(unsecuredLoansTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("UnsecuredLoans"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDeferredTaxliabilities")) {
				clearAndSendKeys(deferredtaxliabilitiesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DeferredTaxliabilities"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigGrossFixedAssets")) {
				clearAndSendKeys(grossFixedAssetsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("GrossFixedAssets"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLessCumulativeDep")) {
				clearAndSendKeys(lessCumulativeDepTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("LessCumulativeDep"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetFixedAssets")) {
				clearAndSendKeys(netFixedAssetsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("NetFixedAssets"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDeferredTaxAssets")) {
				clearAndSendKeys(deferredTaxAssetsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DeferredTaxAssets"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCapitalWorkinProgress")) {
				clearAndSendKeys(capitalWorkinProgressTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CapitalWorkinProgress"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventories")) {
				clearAndSendKeys(inventoriesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("Inventories"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSundryDebtors")) {
				clearAndSendKeys(sundryDebtorsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("SundryDebtors"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAdvLoanstoCorporateBodies")) {
				clearAndSendKeys(advLoanstoCorporateBodiesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AdvLoanstoCorporateBodies"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCashBankBalance")) {
				clearAndSendKeys(cashBankBalanceTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CashBankBalance"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherCurrentliabilities")) {
				clearAndSendKeys(otherCurrentliabilitiesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("OtherCurrentliabilities"));
			}			
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigProvisions")) {
				clearAndSendKeys(provisionsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("Provisions"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetCurrentAssets")) {
				clearAndSendKeys(netCurrentAssetsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("NetCurrentAssets"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtorsOthers")) {
				clearAndSendKeys(debtorsOthersTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DebtorsOthers"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigGuranteesUndertaken")) {
				clearAndSendKeys(guranteesUndertakenTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("GuranteesUndertaken"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOperatingIncome")) {
				clearAndSendKeys(operatingIncomeTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("OperatingIncome"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherIncome")) {
				clearAndSendKeys(otherIncomeTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("OtherIncome"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigChangeInstocks")) {
				clearAndSendKeys(changeInstocksTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ChangeInstocks"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRawMaterials")) {
				clearAndSendKeys(rawMaterialsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("RawMaterials"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigWagesSalaries")) {
				clearAndSendKeys(wagesSalariesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("WagesSalaries"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherOperatingExpenses")) {
				clearAndSendKeys(otherOperatingExpensesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("OtherOperatingExpenses"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDistributionExpenses")) {
				clearAndSendKeys(distributionExpensesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DistributionExpenses"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigMiscOtherExpenses")) {
				clearAndSendKeys(miscOtherExpensesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("MiscOtherExpenses"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFinancialcharges")) {
				clearAndSendKeys(financialChargesTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("Financialcharges"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerDepreciation")) {
				clearAndSendKeys(buyerDepreciationTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("BuyerDepreciation"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigTaxProvision")) {
				clearAndSendKeys(taxProvisionTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("TaxProvision"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAppropriations")) {
				clearAndSendKeys(appropriationsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("Appropriations"));
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear1")) {
				selectValueFromList(ratioYear1Dropdown, partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear1"));
			}	

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays1")) {
				clearAndSendKeys(averageCollectionDays1TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays1"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover1")) {
				clearAndSendKeys(accountReceivablesTurnover1TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover1"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover1")) {
				clearAndSendKeys(inventoryTurnover1TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover1"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover1")) {
				clearAndSendKeys(assetTurnover1TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover1"));
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear2")) {
				selectValueFromList(ratioYear2Dropdown, partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear2"));
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays2")) {
				clearAndSendKeys(averageCollectionDays2TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays2"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover2")) {
				clearAndSendKeys(accountReceivablesTurnover2TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover2"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover2")) {
				clearAndSendKeys(inventoryTurnover2TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover2"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover2")) {
				clearAndSendKeys(assetTurnover2TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover2"));
			}


			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear3")) {
				selectValueFromList(ratioYear3Dropdown, partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear3"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays3")) {
				clearAndSendKeys(averageCollectionDays3TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays3"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover3")) {
				clearAndSendKeys(accountReceivablesTurnover3TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover3"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover3")) {
				clearAndSendKeys(inventoryTurnover3TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover3"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover3")) {
				clearAndSendKeys(assetTurnover3TextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover3"));
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtRatio")) {
				clearAndSendKeys(debtRatioTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DebtRatio"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtEquityRatio")) {
				clearAndSendKeys(debtEquityRatioTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("DebtEquityRatio"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCurrentLiabilitiesNetWorth")) {
				clearAndSendKeys(currentLiabilitiesNetWorthTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CurrentLiabilitiesNetWorth"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFixedAssetNetworth")) {
				clearAndSendKeys(fixedAssetNetworthTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("FixedAssetNetworth"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInterestCoverageRatio")) {
				clearAndSendKeys(interestCoverageRatioTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("InterestCoverageRatio"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPATTotalIncome")) {
				clearAndSendKeys(pATTotalIncomeTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("PATTotalIncome"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetProfitMargin")) {
				clearAndSendKeys(netProfitMarginTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("NetProfitMargin"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReturnonTotalAssets")) {
				clearAndSendKeys(returnOnTotalAssetsTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ReturnonTotalAssets"));
			}			
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReturnonInvestmentROI")) {
				clearAndSendKeys(returnonInvestmentROITextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ReturnonInvestmentROI"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCurrentRatio")) {
				clearAndSendKeys(currentRatioTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("CurrentRatio"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigQuickRatio")) {
				clearAndSendKeys(quickRatioTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("QuickRatio"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNAMEOFTHECOUNTRY")) {
				clearAndSendKeys(nAMEOFTHECOUNTRYTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("NAMEOFTHECOUNTRY"));
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigZipCode")) {
				clearAndSendKeys(zipCodeTextFeild, partyRoleBuyerMastINDEntity.getStringValueForField("ZipCode"));
			}

		}
		else if(partyRoleBuyerMastINDEntity.getAction().equalsIgnoreCase("verify")){

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("PartyCode"), fetchValueFromTextFields(partyCodeLabel), AssertionType.WARNING);
			}			
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPartyName")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("PartyName"), fetchValueFromTextFields(partyNameLabel), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFunction")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Function"), fetchValueFromTextFields(functionTextField), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ApplicableEventCode"), fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerComments")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BuyerComments"), fetchValueFromTextFields(buyerCommentsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerCreditRating")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BuyerCreditRating"), fetchValueFromTextFields(buyerCreditRatingTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCreditLimitRecommended")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CreditLimitRecommended"), fetchValueFromTextFields(creditLimitRecommendedTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCreditLimitRecommended")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CreditLimitRecommended"), fetchValueFromTextFields(creditLimitRecommendedTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLegalFormStatus")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("LegalFormStatus"), fetchValueFromTextFields(legalFormStatusTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAuthorisedCapital")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AuthorisedCapital"), fetchValueFromTextFields(authorisedCapitalTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCapitalEmployed")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CapitalEmployed"), fetchValueFromTextFields(capitalEmployedTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPreviousYearsShareCapital")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("PreviousYearsShareCapital"), fetchValueFromTextFields(previousYearsShareCapitalTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigMajorStakeholdersShareHeld")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("MajorStakeholdersShareHeld"), fetchValueFromTextFields(majorStakeholdershareHeldTextFeild), AssertionType.WARNING);
			}			
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCommentsonShareHolding")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CommentsonShareHolding"), fetchValueFromTextFields(commentsOnShareHoldingTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBoardofDirectorsPrincipals")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BoardofDirectorsPrincipals"), fetchValueFromTextFields(boardOfDirectorsPrincipalsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigKeyExecutives")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("KeyExecutives"), fetchValueFromTextFields(keyExecutivesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLineofBusiness")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("LineofBusiness"), fetchValueFromTextFields(lineofBusinessTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNoOfEmployees")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("NoOfEmployees"), fetchValueFromTextFields(noOfEmployeesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBankers")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Bankers"), fetchValueFromTextFields(bankersTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFacilitiesEnjoyed")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("FacilitiesEnjoyed"), fetchValueFromTextFields(facilitiesEnjoyedTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBankingRelations")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BankingRelations"), fetchValueFromTextFields(bankingRelationsTextFeild), AssertionType.WARNING);
			}	
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerAuditors")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BuyerAuditors"), fetchValueFromTextFields(buyerAuditorsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBusinessActivity")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BusinessActivity"), fetchValueFromTextFields(businessActivityTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigImportsPurchases")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ImportsPurchases"), fetchValueFromTextFields(importsPurchasesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigImportPurchaseTerms")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ImportPurchaseTerms"), fetchValueFromTextFields(importPurchaseTermsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigExportSales")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ExportSales"), fetchValueFromTextFields(exportSalesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigExportSalesTerms")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ExportSalesTerms"), fetchValueFromTextFields(exportSalesTermsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssociateCompanies")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AssociateCompanies"), fetchValueFromTextFields(associateCompaniesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSubsidiaryCompanies")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("SubsidiaryCompanies"), fetchValueFromTextFields(subsidiaryCompaniesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSourcesOfFund")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("SourcesOfFund"), fetchValueFromTextFields(sourcesOfFundTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPaidupEquityCapital")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("PaidupEquityCapital"), fetchValueFromTextFields(paidupEquityCapitalTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReserveSurplus")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ReserveSurplus"), fetchValueFromTextFields(reserveSurplusTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSecuredLoans")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("SecuredLoans"), fetchValueFromTextFields(securedLoansTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigUnsecuredLoans")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("UnsecuredLoans"), fetchValueFromTextFields(unsecuredLoansTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDeferredtaxliabilities")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DeferredTaxliabilities"), fetchValueFromTextFields(deferredtaxliabilitiesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigGrossFixedAssets")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("GrossFixedAssets"), fetchValueFromTextFields(grossFixedAssetsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigLessCumulativeDep")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("LessCumulativeDep"), fetchValueFromTextFields(lessCumulativeDepTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetFixedAssets")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("NetFixedAssets"), fetchValueFromTextFields(netFixedAssetsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDeferredTaxAssets")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DeferredTaxAssets"), fetchValueFromTextFields(deferredTaxAssetsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCapitalWorkinProgress")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CapitalWorkinProgress"), fetchValueFromTextFields(capitalWorkinProgressTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventories")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Inventories"), fetchValueFromTextFields(inventoriesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSundryDebtors")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("SundryDebtors"), fetchValueFromTextFields(sundryDebtorsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAdvLoanstoCorporateBodies")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AdvLoanstoCorporateBodies"), fetchValueFromTextFields(advLoanstoCorporateBodiesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCashBankBalance")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CashBankBalance"), fetchValueFromTextFields(cashBankBalanceTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherCurrentliabilities")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("OtherCurrentliabilities"), fetchValueFromTextFields(otherCurrentliabilitiesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigProvisions")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Provisions"), fetchValueFromTextFields(provisionsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetCurrentAssets")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("NetCurrentAssets"), fetchValueFromTextFields(netCurrentAssetsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtorsOthers")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DebtorsOthers"), fetchValueFromTextFields(debtorsOthersTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigGuranteesUndertaken")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("GuranteesUndertaken"), fetchValueFromTextFields(guranteesUndertakenTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOperatingIncome")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("OperatingIncome"), fetchValueFromTextFields(operatingIncomeTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherIncome")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("OtherIncome"), fetchValueFromTextFields(otherIncomeTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigChangeInstocks")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ChangeInstocks"), fetchValueFromTextFields(changeInstocksTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRawMaterials")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("RawMaterials"), fetchValueFromTextFields(rawMaterialsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigWagesSalaries")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("WagesSalaries"), fetchValueFromTextFields(wagesSalariesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigOtherOperatingExpenses")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("OtherOperatingExpenses"), fetchValueFromTextFields(otherOperatingExpensesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDistributionExpenses")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DistributionExpenses"), fetchValueFromTextFields(distributionExpensesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigMiscOtherExpenses")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("MiscOtherExpenses"), fetchValueFromTextFields(miscOtherExpensesTextFeild), AssertionType.WARNING);
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFinancialcharges")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Financialcharges"), fetchValueFromTextFields(financialChargesTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBuyerDepreciation")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("BuyerDepreciation"), fetchValueFromTextFields(buyerDepreciationTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigTaxProvision")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("TaxProvision"), fetchValueFromTextFields(taxProvisionTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAppropriations")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("Appropriations"), fetchValueFromTextFields(appropriationsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear1")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear1"), fetchValueFromList(ratioYear1Dropdown), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays1")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays1"), fetchValueFromTextFields(averageCollectionDays1TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover1")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover1"), fetchValueFromTextFields(accountReceivablesTurnover1TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover1")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover1"), fetchValueFromTextFields(inventoryTurnover1TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover1")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover1"), fetchValueFromTextFields(assetTurnover1TextFeild), AssertionType.WARNING);
			}

			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear2")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear2"), fetchValueFromList(ratioYear2Dropdown), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays2")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays2"), fetchValueFromTextFields(averageCollectionDays2TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover2")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover2"), fetchValueFromTextFields(accountReceivablesTurnover2TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover2")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover2"), fetchValueFromTextFields(inventoryTurnover2TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover2")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover2"), fetchValueFromTextFields(assetTurnover2TextFeild), AssertionType.WARNING);
			}


			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRatioYear3")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("RatioYear3"), fetchValueFromList(ratioYear3Dropdown), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAverageCollectionDays3")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AverageCollectionDays3"), fetchValueFromTextFields(averageCollectionDays3TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAccountReceivablesTurnover3")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AccountReceivablesTurnover3"), fetchValueFromTextFields(accountReceivablesTurnover3TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInventoryTurnover3")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("InventoryTurnover3"), fetchValueFromTextFields(inventoryTurnover3TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigAssetTurnover3")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("AssetTurnover3"), fetchValueFromTextFields(assetTurnover3TextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtRatio")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DebtRatio"), fetchValueFromTextFields(debtRatioTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigDebtEquityRatio")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("DebtEquityRatio"), fetchValueFromTextFields(debtEquityRatioTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCurrentLiabilitiesNetWorth")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CurrentLiabilitiesNetWorth"), fetchValueFromTextFields(currentLiabilitiesNetWorthTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFixedAssetNetworth")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("FixedAssetNetworth"), fetchValueFromTextFields(fixedAssetNetworthTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigInterestCoverageRatio")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("InterestCoverageRatio"), fetchValueFromTextFields(interestCoverageRatioTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPATTotalIncome")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("PATTotalIncome"), fetchValueFromTextFields(pATTotalIncomeTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNetProfitMargin")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("NetProfitMargin"), fetchValueFromTextFields(netProfitMarginTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReturnonTotalAssets")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ReturnonTotalAssets"), fetchValueFromTextFields(returnOnTotalAssetsTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigReturnonInvestmentROI")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ReturnonInvestmentROI"), fetchValueFromTextFields(returnonInvestmentROITextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigCurrentRatio")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("CurrentRatio"), fetchValueFromTextFields(currentRatioTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigQuickRatio")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("QuickRatio"), fetchValueFromTextFields(quickRatioTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNAMEOFTHECOUNTRY")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("NAMEOFTHECOUNTRY"), fetchValueFromTextFields(nAMEOFTHECOUNTRYTextFeild), AssertionType.WARNING);
			}
			if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigZipCode")) {
				assertReference.assertEquals(partyRoleBuyerMastINDEntity.getStringValueForField("ZipCode"), fetchValueFromTextFields(zipCodeTextFeild), AssertionType.WARNING);
			}

		}
	}

	public void navigateToPartyTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPartyTab")){
			click(partyTitle);
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	}

	public void navigateToPartyRolesTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigPartyRolesTab")){
			click(partyRolesTitle);
			switchToFrame("display");
			isElementDisplayed(partyFunctionsTitle);
		}
	}

	public void navigateToContactTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigContactsTab")){
			click(contactsTitle);
			switchToFrame("display");
			isElementDisplayed(partyContactsTitle);
		}
	}

	public void navigateToRelatedPratiesTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigRelatedPartiesTab")){
			click(relatedPartiesTitle);
			switchToFrame("display");
			isElementDisplayed(partyRelationsTitle);
		}
	}

	public void navigateToFollowupTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(partyFollowupListTitle);
		}
	}

	public void navigateToHierarchyTab(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity){
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigHierarchyTab")){
			click(hierarchyTitle);
			switchToFrame("display");
			isElementDisplayed(partytreeTitle);
		}
	}
	public void clickToProceedButton(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity) {
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");

		}
	}
	public void saveBuyerPartyDetails(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity) {
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void showPolicyListPartyDetails(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity) {
		if (partyRoleBuyerMastINDEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	public void navigateToBuyerMasterIND(){
		switchToFrame("display");
		isElementDisplayed(buyerMasterINDTitle);
	}
	
	public void fillandSubmitPartyPartyRolesBuyerMasterIND(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntity, CustomAssert assertReference) {
		if(isConfigTrue(partyRoleBuyerMastINDEntity.getConfigExecute())){
			switchToFrame("display");
			fillPartyPartyRolesBuyerMasterIND(partyRoleBuyerMastINDEntity, assertReference);
			clickToProceedButton(partyRoleBuyerMastINDEntity);
			saveBuyerPartyDetails(partyRoleBuyerMastINDEntity);
			navigateToPartyTab(partyRoleBuyerMastINDEntity);
			navigateToPartyRolesTab(partyRoleBuyerMastINDEntity);
			navigateToContactTab(partyRoleBuyerMastINDEntity);
			navigateToRelatedPratiesTab(partyRoleBuyerMastINDEntity);
			navigateToFollowupTab(partyRoleBuyerMastINDEntity);
			
		}
	}

}
