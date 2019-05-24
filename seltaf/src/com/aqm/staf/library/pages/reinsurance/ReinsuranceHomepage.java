package com.aqm.staf.library.pages.reinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ReinsuranceHomeEntity;

public class ReinsuranceHomepage extends BasePage {

	private PageElement systemAdministrationTab;
	private PageElement underwritingTab;
	private PageElement accountingTab;
	private PageElement batchTab;
	private PageElement reportTab;
	private PageElement planingTab;
	private PageElement securityTab;
	//systemAdministrationTab;
	private PageElement minorTab;
	private PageElement productTab;
	private PageElement riskCategoryTab;
	private PageElement riskTypeTab;
	private PageElement parameterTypeTab;
	private PageElement geiographicalAreaTab;
	private PageElement currancyXchnageTab;
	private PageElement shipimgIndexTab;
	private PageElement accumalationRuleTab;
	private PageElement reserveRuleTab;
	private PageElement partyTab;
	private PageElement prtyFnctnAttrbtsTab;
	private PageElement prtyMinorClassMapTab;
	private PageElement perilTab;
	private PageElement catEventTab;
	private PageElement gSTSACCodeMasterTab;
	private PageElement gSTRateMasterTab;
	//underwritingTab;
	private PageElement retentionLimitTab;
	private PageElement RIContractTab;
	private PageElement treatyTab;
	private PageElement programeTab;
	private PageElement cessionTab;
	private PageElement appointmentTab;
	private PageElement megaRiskCessionTab;
	private PageElement megaRiskClaimTab;
	private PageElement retroCessionTab;
	private PageElement accumalationTab;
	private PageElement faculativeContractTab;
	private PageElement XlRecoveryTab;
	private PageElement catYearlyAggregateTab;
	private PageElement pubProdLiabRateTab;
	private PageElement policyTab;
	private PageElement claimTab;
	private PageElement ForeignXLTab;
	private PageElement flowChartProgrameTab;
	private PageElement flowChartTab;
	//accountingTab;
	private PageElement journalVoucherTab;
	private PageElement inwardBookingTab;
	private PageElement outwordBookingTab;
	private PageElement postAcStatementTab;
	private PageElement bankStatementTab;
	private PageElement bankReconsilationTab;
	private PageElement profitCommisionTab;
	private PageElement debitCreditTab;
	private PageElement settlementTab;
	private PageElement letterOfCreadtTab;
	private PageElement yrlyXlPremAdjstTab;
	private PageElement yrEndGainLossTab;
	private PageElement transferFundTab;
	private PageElement chartOfAccountsTab;
	private PageElement transactionRuleTab;
	private PageElement acctngSchedulesTab;
	private PageElement accountTypeTab;
	private PageElement gstRITaxInvoiceProgrameTab;
	private PageElement sdtIsdInvoiceTab;
	//batchTab;
	private PageElement underwritingBatchesTab;
	private PageElement interfacesBatchesTab;
	private PageElement accountingBatchesTab;
	//reportTab;
	private PageElement statisticTab;
	private PageElement letterTab;
	private PageElement gICTab;
	private PageElement iRdaTab;
	private PageElement aCReportsStatusTab;
	private PageElement checkListMenuTab;
	private PageElement searchRepFileTab;
	private PageElement advanceSearchrepTab;
	//planingTab;
	private PageElement asIfStatisticTab;
	private PageElement prospectStatisticsTab;
	private PageElement newLapesedBusiTab;
	private PageElement libilityRatioTab;
	private PageElement claimRatioTab;
	private PageElement catExposureTab;
	private PageElement ePiActualTab;
	private PageElement claimTringulationTab;
	private PageElement bilateralStatisticTab;
	//securityTab;
	private PageElement aCQuarterClosingFlagTab;
	private PageElement curreancyUploadClosingFlagTab;
	private PageElement uWQuarterClosingFlagTab;
	private PageElement gstMonthlyClosingTab;
	private PageElement changePasswordTab;
	private PageElement maintainRoleTab;
	private PageElement rollTreeTab;
	private PageElement SystemParameterTab;
	private PageElement lovMaintanaceTab;
	private PageElement otherPandActionTab;
	private PageElement searchToolTab;

	public ReinsuranceHomepage(WebDriver driver, String pageName) {
		super(driver, pageName);

		systemAdministrationTab=new PageElement(By.xpath("//b[contains(text(),'System Administration')]"), " Complete Edit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		underwritingTab=new PageElement(By.xpath("//b[contains(text(),'Underwriting')]"), " Underwriting", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accountingTab=new PageElement(By.xpath("//b[contains(text(),'Accounting')]"), " Accounting", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		batchTab=new PageElement(By.xpath("//b[contains(text(),'Batch')]"), " Batch", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reportTab=new PageElement(By.xpath("//b[contains(text(),'Report')]"), " Report", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		planingTab=new PageElement(By.xpath("//b[contains(text(),'Planning')]"), "Planning", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		securityTab=new PageElement(By.xpath("//b[contains(text(),'Security')]"), " Security", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//systemAdministrationTab;
		minorTab=new PageElement(By.id("pMinorClass"), "Minor Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		productTab=new PageElement(By.id("pPolicyType"), "Policy type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		riskCategoryTab=new PageElement(By.id("pRiskCategory"), " Risk Category", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		riskTypeTab=new PageElement(By.id("pRiskType"), "Risk Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		parameterTypeTab=new PageElement(By.id("pParameter"), "Parameter", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		geiographicalAreaTab=new PageElement(By.id("pGeoArea"), "Geo Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		currancyXchnageTab=new PageElement(By.id("pCurrExcgRate"), " Currancy Xchange rate", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shipimgIndexTab=new PageElement(By.xpath("//font[contains(text(),'Shipping Index')]"), "Shipping Index", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accumalationRuleTab=new PageElement(By.xpath("//font[contains(text(),'Accumulation Rule')]"), " Accumulation Rule", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reserveRuleTab=new PageElement(By.xpath("//font[contains(text(),'Reserve Rule')]"), " Reserve Rule", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyTab=new PageElement(By.id("pParty"), " Party", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		prtyFnctnAttrbtsTab=new PageElement(By.id("pPartyFuncAttributes"), " Party Func Attributes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		prtyMinorClassMapTab=new PageElement(By.id("pPartyMinClassMap"), " Party Min Class Map", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		perilTab=new PageElement(By.id("pPerilGenericSearch"), " Peril Generic Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		catEventTab=new PageElement(By.id("pCatastrophicEvent"), " Catastrophi Event", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		gSTSACCodeMasterTab=new PageElement(By.id("pSACCodeMaster"), " SAC Code Master", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		gSTRateMasterTab=new PageElement(By.id("pGSTRateMaster"), " GST Rate Master", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//underwritingTab;
		retentionLimitTab=new PageElement(By.xpath("//font[contains(text(),'Retention Limit')]"), " Retention Limit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RIContractTab=new PageElement(By.xpath("//font[contains(text(),'RI Contract')]"), " RI Contract", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		treatyTab=new PageElement(By.xpath("//font[contains(text(),'Treaty')]"), " Treaty", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		programeTab=new PageElement(By.xpath("//font[contains(text(),'Program')]"), " Program", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cessionTab=new PageElement(By.xpath("//font[contains(text(),'Cession')]"), "Cession", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		appointmentTab=new PageElement(By.xpath("//font[contains(text(),'Apportionment')]"), " Apportionment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		megaRiskCessionTab=new PageElement(By.xpath("//font[contains(text(),'Mega Risk Cession')]"), " Mega Risk Cession", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		megaRiskClaimTab=new PageElement(By.xpath("//font[contains(text(),'Mega Risk Claim')]"), " Mega Risk Claim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroCessionTab=new PageElement(By.xpath("//font[contains(text(),'Retro Cession')]"), " Retro Cession", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accumalationTab=new PageElement(By.xpath("//font[contains(text(),'Accumulation')]"), " Accumulation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		faculativeContractTab=new PageElement(By.xpath("//font[contains(text(),'Facultative Contract')]"), "Facultative Contract", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		XlRecoveryTab=new PageElement(By.xpath("//font[contains(text(),'XL Recovery')]"), " XL Recovery", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		catYearlyAggregateTab=new PageElement(By.xpath("//font[contains(text(),'Cat Yrly Aggregate')]"), " Cat Yrly Aggregate", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pubProdLiabRateTab=new PageElement(By.xpath("//font[contains(text(),'Pub & Prod Liab Rate')]"), " Pub & Prod Liab Rate", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTab=new PageElement(By.xpath("//font[contains(text(),'Policy')]"), " Policy", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimTab=new PageElement(By.xpath("//font[contains(text(),'Claim')]"), " Claim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ForeignXLTab=new PageElement(By.xpath("//font[contains(text(),'Foreign XL')]"), " Foreign XL", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		flowChartProgrameTab=new PageElement(By.xpath("//font[contains(text(),'FlowChart Program')]"), " FlowChart Program", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		flowChartTab=new PageElement(By.xpath("//font[contains(text(),'FlowChart')]"), " FlowChart", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//accountingTab;
		journalVoucherTab=new PageElement(By.xpath("//font[contains(text(),'Journal Voucher')]"), "Journal Voucher", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		inwardBookingTab=new PageElement(By.xpath("//font[contains(text(),'Inward Booking')]"), " Inward Booking", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		outwordBookingTab=new PageElement(By.xpath("//font[contains(text(),'Outward Booking')]"), " Outward Booking", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		postAcStatementTab=new PageElement(By.xpath("//font[contains(text(),'Post A/C Statement')]"), " Post A/C Statement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bankStatementTab=new PageElement(By.xpath("//font[contains(text(),'Bank Statement')]"), "  Bank Statement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bankReconsilationTab=new PageElement(By.xpath("//font[contains(text(),'Bank Reconciliation')]"), " Bank Reconciliation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		profitCommisionTab=new PageElement(By.xpath("//font[contains(text(),'Profit Commission')]"), " Profit Commission", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		debitCreditTab=new PageElement(By.xpath("//font[contains(text(),'Debit/Credit Note')]"), " Debit/Credit Note", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		settlementTab=new PageElement(By.xpath("//font[contains(text(),'Settlement')]"), " Settlement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		letterOfCreadtTab=new PageElement(By.xpath("//font[contains(text(),'Letter of Credit')]"), " Letter of Credit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yrlyXlPremAdjstTab=new PageElement(By.xpath("//font[contains(text(),'Yrly XL Prem Adjust')]"), " Yrly XL Prem Adjust", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yrEndGainLossTab=new PageElement(By.xpath("//font[contains(text(),'Year End Gain')]"), " Year End Gain", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transferFundTab=new PageElement(By.xpath("//font[contains(text(),'Transfer Funds')]"), "Transfer Funds", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		chartOfAccountsTab=new PageElement(By.id("pChartOfAccounts"), " Chart Of Accounts", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transactionRuleTab=new PageElement(By.xpath("//font[contains(text(),'Transaction Rule')]"), " Transaction Rule", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		acctngSchedulesTab=new PageElement(By.id("pAccountingSchedules"), " Accounting Schedules", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accountTypeTab=new PageElement(By.xpath("//font[contains(text(),'Account Type')]"), " Account Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		gstRITaxInvoiceProgrameTab=new PageElement(By.xpath("//font[contains(text(),'GST RI Tax Invoice')]"), "GST RI Tax Invoice", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sdtIsdInvoiceTab=new PageElement(By.xpath("//font[contains(text(),'GST ISD Invoice')]"), " GST ISD Invoice", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//batchTab
		underwritingBatchesTab=new PageElement(By.xpath("//font[contains(text(),'Underwriting Batches')]"), " Underwriting Batches", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		interfacesBatchesTab=new PageElement(By.xpath("//font[contains(text(),'Interface Batches')]"), "Interface Batches", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accountingBatchesTab=new PageElement(By.xpath("//font[contains(text(),'Accounting Batches')]"), " Accounting Batches", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//reportTab;		
		statisticTab=new PageElement(By.xpath("//font[contains(text(),'Statistics')]"), " Statistics", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		letterTab=new PageElement(By.xpath("//font[contains(text(),'Letter')]"), " Letter", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		gICTab=new PageElement(By.xpath("//font[contains(text(),'GIC')]"), " GIC", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		iRdaTab=new PageElement(By.xpath("//font[contains(text(),'IRDA')]"), "IRDA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		aCReportsStatusTab=new PageElement(By.xpath("//font[contains(text(),'A/c Reports Stats')]"), " A/c Reports Stats", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		checkListMenuTab=new PageElement(By.xpath("//font[contains(text(),'CheckList Menu')]"), " CheckList Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchRepFileTab=new PageElement(By.id("pSearchReportFile"), " Search Report File", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		advanceSearchrepTab=new PageElement(By.id("pSearchReportFile"), "  Search Report File", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//planingTab;		
		asIfStatisticTab=new PageElement(By.xpath("//font[contains(text(),'As If Statistics ')]"), " As If Statistics ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		prospectStatisticsTab=new PageElement(By.xpath("//font[contains(text(),'Prospect Statistics')]"), "Prospect Statistics", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		newLapesedBusiTab=new PageElement(By.xpath("//font[contains(text(),'New / Lapsed Busi')]"), "New / Lapsed Busi", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		libilityRatioTab=new PageElement(By.xpath("//font[contains(text(),'Liability Ratio')]"), " Liability Ratio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimRatioTab=new PageElement(By.xpath("//font[contains(text(),'Claim Ratio')]"), " Claim Ratio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		catExposureTab=new PageElement(By.xpath("//font[contains(text(),'Cat Exposure')]"), " Cat Exposure", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ePiActualTab=new PageElement(By.xpath("//font[contains(text(),'EPI / Actual Prem')]"), " EPI / Actual Prem", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimTringulationTab=new PageElement(By.xpath("//font[contains(text(),'Claim Triangulation')]"), " Claim Triangulation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bilateralStatisticTab=new PageElement(By.xpath("//font[contains(text(),'Bilateral Statistics')]"), " Bilateral Statistics", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//accountingTab;
		aCQuarterClosingFlagTab=new PageElement(By.xpath("//font[contains(text(),'A/C Quarter Closing Flag')]"), " A/C Quarter Closing Flag", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		curreancyUploadClosingFlagTab=new PageElement(By.xpath("//font[contains(text(),'Currency Upload Closing Flag')]"), " Currency Upload Closing Flag", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		uWQuarterClosingFlagTab=new PageElement(By.xpath("//font[contains(text(),'U/W Quarter Closing Flag')]"), " U/W Quarter Closing Flag", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		gstMonthlyClosingTab=new PageElement(By.xpath("//font[contains(text(),'GST Monthly Closing Flag')]"), "GST Monthly Closing Flag", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		changePasswordTab=new PageElement(By.xpath("//font[contains(text(),'Change Password')]"), " Change Password", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maintainRoleTab=new PageElement(By.xpath("//font[contains(text(),'Maintain Role')]"), " Role Treee", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rollTreeTab=new PageElement(By.xpath("//font[contains(text(),'Role Tree')]"), " Complete Edit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SystemParameterTab=new PageElement(By.xpath("//font[contains(text(),'System Parameters')]"), " System Parameters", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lovMaintanaceTab=new PageElement(By.id("pLovMaintenance"), " Lov Maintenance", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		otherPandActionTab=new PageElement(By.xpath("//font[contains(text(),'Others Pend Action')]"), "Others Pend Action", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchToolTab=new PageElement(By.xpath("//font[contains(text(),'Search Tool')]"), " Search Tool", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	
	public void fillReinsuranceHomeDetails(ReinsuranceHomeEntity reinsuranceHomeEntity,CustomAssert customAssert) {
		if(reinsuranceHomeEntity.getAction().equalsIgnoreCase("add") || reinsuranceHomeEntity.getAction().equalsIgnoreCase("edit")){
		
		}
		else if (reinsuranceHomeEntity.getAction().equalsIgnoreCase("verify")){
			
		}
	}
	//systemAdministrationTabs
	public void clickOnSystemAdmnistationTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSystemAdministration")){
			click(systemAdministrationTab);
			switchToFrame("display");
		}
	}
	public void clickOnMinorTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigMinor")){
			click(minorTab);
			switchToFrame("display");
		}
	}
	public void clickOnRiskCategoryTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRiskCategory")){
			click(riskCategoryTab);
			switchToFrame("display");
		}
	}
	public void clickOnRiskTypeTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRiskType")){
			click(riskTypeTab);
			switchToFrame("display");
		}
	}
	public void clickOnParameterTypeTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigParameterType")){
			click(parameterTypeTab);
			switchToFrame("display");
		}
	}
	public void clickOnGeographicalAreaTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGeographicalArea")){
			click(geiographicalAreaTab);
			switchToFrame("display");
		}
	}
	public void clickOnCurrancyXchnageTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCurrancyXchnage")){
			click(currancyXchnageTab);
			switchToFrame("display");
		}
	}
	public void clickOnshipimgIndexTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigShipimgIndex")){
			click(shipimgIndexTab);
			switchToFrame("display");
		}
	}
	public void clickOnAccumalationRuleTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccumalationRule")){
			click(accumalationRuleTab);
			switchToFrame("display");
		}
	}
	public void clickOnReserveRuleTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigReserveRule")){
			click(reserveRuleTab);
			switchToFrame("display");
		}
	}
	public void clickOnPartyTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigParty")){
			click(partyTab);
			switchToFrame("display");
		}
	}
	public void clickOnPrtyFnctnAttrbtsTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPrtyFnctnAttrbts")){
			click(prtyFnctnAttrbtsTab);
			switchToFrame("display");
		}
	}
	public void clickOnPrtyMinorClassMapTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPrtyMinorClassMap")){
			click(prtyMinorClassMapTab);
			switchToFrame("display");
		}
	}
	public void clickOnPerilTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPeril")){
			click(perilTab);
			switchToFrame("display");
		}
	}
	public void clickOnCatEventTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCatEvent")){
			click(catEventTab);
			switchToFrame("display");
		}
	}
	public void clickOnGSTSACCodeMasterTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGSTSACCodeMaster")){
			click(gSTSACCodeMasterTab);
			switchToFrame("display");
		}
	}
	public void clickOnGSTRateMasterTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGSTRateMaster")){
			click(gSTRateMasterTab);
			switchToFrame("display");
		}
	}

	//underwritingTabs
	
	public void clickOnUnderwritingTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigUnderwriting")){
			switchToFrame("head");
			click(underwritingTab);
			switchToFrame("display");
		}
	}
	public void clickOnRetentionLimitTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRetentionLimit")){
			click(retentionLimitTab);
			switchToFrame("display");
		}
	}
	public void clickOnRIContractTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRIContract")){
			switchToFrame("mainFrame");
			click(RIContractTab);
			switchToFrame("display");
		}
	}
	public void clickOnTreatyTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigTreaty")){
			switchToFrame("mainFrame");
			click(treatyTab);
			switchToFrame("display");
		}
	}
	public void clickOnProgrameTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPrograme")){
			click(programeTab);
			switchToFrame("display");
		}
	}
	public void clickOnCessionTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCession")){
			click(cessionTab);
			switchToFrame("display");
		}
	}
	public void clickOnAppointmentTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAppointment")){
			click(appointmentTab);
			switchToFrame("display");
		}
	}
	public void clickOnMegaRiskCessionTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigMegaRiskCession")){
			click(megaRiskCessionTab);
			switchToFrame("display");
		}
	}
	public void clickOnMegaRiskClaimTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigMegaRiskClaim")){
			click(megaRiskClaimTab);
			switchToFrame("display");
		}
	}
	public void clickOnRetroCessionTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRetroCession")){
			click(retroCessionTab);
			switchToFrame("display");
		}
	}
	public void clickOnaccumalationTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccumalation")){
			click(accumalationTab);
			switchToFrame("display");
		}
	}
	public void clickOnFaculativeContractTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigfaculativeContract")){
			click(faculativeContractTab);
			switchToFrame("display");
		}
	}
	public void clickOnXlRecoveryTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigXlRecoveryTab")){
			click(XlRecoveryTab);
			switchToFrame("display");
		}
	}
	public void clickOnCatYearlyAggregateTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigcatYearlyAggregate")){
			click(catYearlyAggregateTab);
			switchToFrame("display");
		}
	}
	public void clickOnPubProdLiabRateTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfiPubProdLiabRateTab")){
			click(pubProdLiabRateTab);
			switchToFrame("display");
		}
	}
	public void clickOnPolicyTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPolicyTab")){
			switchToFrame("mainFrame");
			click(policyTab);
			switchToFrame("display");
		}
	}
	public void clickOnClaimTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigclaimTab")){
			click(claimTab);
			switchToFrame("display");
		}
	}
	public void clickOnForeignXLTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigForeignXLTab")){
			click(ForeignXLTab);
			switchToFrame("display");
		}
	}
	public void clickOnflowChartProgrameTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigFlowChartPrograme")){
			click(flowChartProgrameTab);
			switchToFrame("display");
		}
	}
	public void clickOnflowChartTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigFlowChart")){
			click(flowChartTab);
			switchToFrame("display");
		}
	}


	//accountingTab;
	public void clickOnAccountingTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccountingTab")){
			click(accountingTab);
			switchToFrame("display");
		}
	}
	public void clickOnJournalVoucherTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigJournalVoucherTab")){
			click(journalVoucherTab);
			switchToFrame("display");
		}
	}
	public void clickOnInwardBookingTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigInwardBookingTab")){
			click(inwardBookingTab);
			switchToFrame("display");
		}
	}
	public void clickOnOutwordBookingTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigOutwordBookingTab")){
			click(outwordBookingTab);
			switchToFrame("display");
		}
	}
	public void clickOnPostAcStatementTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPostAcStatementTab")){
			click(postAcStatementTab);
			switchToFrame("display");
		}
	}
	public void clickOnBankStatementTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBankStatementTab")){
			click(bankStatementTab);
			switchToFrame("display");
		}
	}
	public void clickOnBankReconsilationTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBankReconsilationTab")){
			click(bankReconsilationTab);
			switchToFrame("display");
		}
	}
	public void clickOnProfitCommisionTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigProfitCommisionTab")){
			click(profitCommisionTab);
			switchToFrame("display");
		}
	}
	public void clickOnDebitCreditTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigDebitCreditTab")){
			click(debitCreditTab);
			switchToFrame("display");
		}
	}
	public void clickOnsettlementTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSettlementTab")){
			click(settlementTab);
			switchToFrame("display");
		}
	}
	public void clickOnLetterOfCreadtTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigLetterOfCreadtTab")){
			click(letterOfCreadtTab);
			switchToFrame("display");
		}
	}
	public void clickOnYrlyXlPremAdjstTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigYrlyXlPremAdjstTab")){
			click(yrlyXlPremAdjstTab);
			switchToFrame("display");
		}
	}
	public void clickOnYrEndGainLossTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigYrEndGainLossTab")){
			click(yrEndGainLossTab);
			switchToFrame("display");
		}
	}
	public void clickOnTransferFundTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigTransferFundTab")){
			click(transferFundTab);
			switchToFrame("display");
		}
	}
	public void clickChartOfAccountsTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigChartOfAccountsTab")){
			click(chartOfAccountsTab);
			switchToFrame("display");
		}
	}
	public void clickOnTransactionRuleTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigTransactionRuleTab")){
			click(transactionRuleTab);
			switchToFrame("display");
		}
	}
	public void clickOnAcctngSchedulesTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAcctngSchedulesTab")){
			click(acctngSchedulesTab);
			switchToFrame("display");
		}
	}
	public void clickOnAccountTypeTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccountTypeTab")){
			click(accountTypeTab);
			switchToFrame("display");
		}
	}
	public void clickOnGstRITaxInvoiceProgrameTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGstRITaxInvoiceProgrameTab")){
			click(gstRITaxInvoiceProgrameTab);
			switchToFrame("display");
		}
	}
	public void clickOnSdtIsdInvoiceTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigsdtIsdInvoiceTab")){
			click(sdtIsdInvoiceTab);
			switchToFrame("display");
		}
	}
	//batchTab;
	public void clickOnBatchTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBatchTab")){
			click(batchTab);
			switchToFrame("display");
		}
	}
	public void clickOnUnderwritingBatchesTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigUnderwritingBatchesTab")){
			click(underwritingBatchesTab);
			switchToFrame("display");
		}
	}
	public void clickOnInterfacesBatchesTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigInterfacesBatchesTab")){
			click(interfacesBatchesTab);
			switchToFrame("display");
		}
	}
	public void clickAccountingBatchesTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccountingBatchesTab")){
			click(accountingBatchesTab);
			switchToFrame("display");
		}
	}
	//reportTab
	public void clickOnReportTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigReportTab")){
			click(reportTab);
			switchToFrame("display");
		}
	}
	public void clickStatisticTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigStatisticTab")){
			click(statisticTab);
			switchToFrame("display");
		}
	}
	public void clickOnLetterTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigLetterTab")){
			click(letterTab);
			switchToFrame("display");
		}
	}
	public void clickGICTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGICTab")){
			click(gICTab);
			switchToFrame("display");
		}
	}
	public void clickOnACReportsStatusTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigACReportsStatusTab")){
			click(aCReportsStatusTab);
			switchToFrame("display");
		}
	}
	public void clickOnIRdaTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigIRdaTab")){
			click(iRdaTab);
			switchToFrame("display");
		}
	}
	public void clickOnSearchRepFileTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSearchRepFileTab")){
			click(searchRepFileTab);
			switchToFrame("display");
		}
	}
	public void clickOnAdvanceSearchrepTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAdvanceSearchrepTab")){
			click(advanceSearchrepTab);
			switchToFrame("display");
		}
	}
	public void clickOnCheckListMenuTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCheckListMenuTab")){
			click(checkListMenuTab);
			switchToFrame("display");
		}
	}
	////planingTab;
	public void clickOnPlaningTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPlaningTab")){
			click(planingTab);
			switchToFrame("display");
		}
	}
	public void clickOnAsIfStatisticTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAsIfStatisticTab")){
			click(asIfStatisticTab);
			switchToFrame("display");
		}
	}
	public void clickOnProspectStatisticsTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigProspectStatisticsTab")){
			click(prospectStatisticsTab);
			switchToFrame("display");
		}
	}
	public void clickOnNewLapesedBusiTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigNewLapesedBusiTab")){
			click(newLapesedBusiTab);
			switchToFrame("display");
		}
	}
	public void clickOnLibilityRatioTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigLibilityRatioTab;")){
			click(libilityRatioTab);
			switchToFrame("display");
		}
	}
	public void clickOnClaimRatioTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigClaimRatioTab")){
			click(claimRatioTab);
			switchToFrame("display");
		}
	}
	public void clickOnCatExposureTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCatExposureTab")){
			click(catExposureTab);
			switchToFrame("display");
		}
	}
	public void clickOnEPiActualTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigEPiActualTab")){
			click(ePiActualTab);
			switchToFrame("display");
		}
	}
	public void clickOnClaimTringulationTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigClaimTringulationTab")){
			click(claimTringulationTab);
			switchToFrame("display");
		}
	}
	public void clickOnBilateralStatisticTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBilateralStatisticTab")){
			click(bilateralStatisticTab);
			switchToFrame("display");
		}
	}
	//securityTab;
	public void clickOnSecurityTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSecurityTab")){
			click(securityTab);
			switchToFrame("display");
		}
	}
	public void clickOnACQuarterClosingFlagTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigACQuarterClosingFlagTab")){
			click(aCQuarterClosingFlagTab);
			switchToFrame("display");
		}
	}
	public void clickOnCurreancyUploadClosingFlagTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigCurreancyUploadClosingFlagTab")){
			click(curreancyUploadClosingFlagTab);
			switchToFrame("display");
		}
	}
	public void clickOnUWQuarterClosingFlagTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigUWQuarterClosingFlagTab")){
			click(uWQuarterClosingFlagTab);
			switchToFrame("display");
		}
	}
	public void clickOnGstMonthlyClosingTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigGstMonthlyClosingTab")){
			click(gstMonthlyClosingTab);
			switchToFrame("display");
		}
	}
	public void clickOnChangePasswordTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigChangePasswordTab")){
			click(changePasswordTab);
			switchToFrame("display");
		}
	}
	public void clickOnMaintainRoleTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigMaintainRoleTab")){
			click(maintainRoleTab);
			switchToFrame("display");
		}
	}
	public void clickOnRollTreeTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigRollTreeTab")){
			click(rollTreeTab);
			switchToFrame("display");
		}
	}
	public void clickOnSystemParameterTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSystemParameterTab")){
			click(SystemParameterTab);
			switchToFrame("display");
		}
	}
	public void clickOnLovMaintanaceTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigLovMaintanaceTab")){
			click(lovMaintanaceTab);
			switchToFrame("display");
		}
	}
	public void clickOnOtherPandActionTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigOtherPandActionTab")){
			click(otherPandActionTab);
			switchToFrame("display");
		}
	}
	public void clickOnSearchToolTab(ReinsuranceHomeEntity reinsuranceHomeEntity) {
		if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSearchToolTab")){
			click(searchToolTab);
			switchToFrame("display");
		}
	}

	public void fillandSubmiReinsuranceHomeDetails(ReinsuranceHomeEntity reinsuranceHomeEntity ) throws InterruptedException {
		if(isConfigTrue(reinsuranceHomeEntity.getConfigExecute())){
			//SystemAddministration
			clickOnSystemAdmnistationTab(reinsuranceHomeEntity);
			clickOnPrtyMinorClassMapTab(reinsuranceHomeEntity);
			clickOnRiskCategoryTab(reinsuranceHomeEntity);
			clickOnRiskTypeTab(reinsuranceHomeEntity);
			clickOnParameterTypeTab(reinsuranceHomeEntity);
			clickOnGeographicalAreaTab(reinsuranceHomeEntity);
			clickOnCurrancyXchnageTab(reinsuranceHomeEntity);
			clickOnshipimgIndexTab(reinsuranceHomeEntity);
			clickOnAccumalationRuleTab(reinsuranceHomeEntity);
			clickOnReserveRuleTab(reinsuranceHomeEntity);
			clickOnPartyTab(reinsuranceHomeEntity);
			clickOnPrtyFnctnAttrbtsTab(reinsuranceHomeEntity);
			clickOnMinorTab(reinsuranceHomeEntity);
			clickOnPerilTab(reinsuranceHomeEntity);
			clickOnCatEventTab(reinsuranceHomeEntity);
			clickOnGSTSACCodeMasterTab(reinsuranceHomeEntity);
			clickOnGSTRateMasterTab(reinsuranceHomeEntity);
			//underwritingTab
			clickOnUnderwritingTab(reinsuranceHomeEntity);
			clickOnRetentionLimitTab(reinsuranceHomeEntity);
			clickOnRIContractTab(reinsuranceHomeEntity);
			clickOnTreatyTab(reinsuranceHomeEntity);
			clickOnProgrameTab(reinsuranceHomeEntity);
			clickOnCessionTab(reinsuranceHomeEntity);
			clickOnAppointmentTab(reinsuranceHomeEntity);
			clickOnMegaRiskCessionTab(reinsuranceHomeEntity);
			clickOnMegaRiskClaimTab(reinsuranceHomeEntity);
			clickOnRetroCessionTab(reinsuranceHomeEntity);
			clickOnaccumalationTab(reinsuranceHomeEntity);
			clickOnFaculativeContractTab(reinsuranceHomeEntity);
			clickOnXlRecoveryTab(reinsuranceHomeEntity);
			clickOnCatYearlyAggregateTab(reinsuranceHomeEntity);
			clickOnPubProdLiabRateTab(reinsuranceHomeEntity);
			clickOnPolicyTab(reinsuranceHomeEntity);
 			clickOnClaimTab(reinsuranceHomeEntity);
			clickOnForeignXLTab(reinsuranceHomeEntity);
			clickOnflowChartProgrameTab(reinsuranceHomeEntity);
			clickOnflowChartTab(reinsuranceHomeEntity);
			//AccountingTab
			clickOnAccountingTab(reinsuranceHomeEntity);
			clickOnJournalVoucherTab(reinsuranceHomeEntity);
			clickOnInwardBookingTab(reinsuranceHomeEntity);
			clickOnOutwordBookingTab(reinsuranceHomeEntity);
			clickOnPostAcStatementTab(reinsuranceHomeEntity);
			clickOnBankStatementTab(reinsuranceHomeEntity);
			clickOnBankReconsilationTab(reinsuranceHomeEntity);
			clickOnProfitCommisionTab(reinsuranceHomeEntity);
			clickOnDebitCreditTab(reinsuranceHomeEntity);
			clickOnsettlementTab(reinsuranceHomeEntity);
			clickOnLetterOfCreadtTab(reinsuranceHomeEntity);
			clickOnYrlyXlPremAdjstTab(reinsuranceHomeEntity);
			clickOnYrEndGainLossTab(reinsuranceHomeEntity);
			clickOnTransferFundTab(reinsuranceHomeEntity);
			clickChartOfAccountsTab(reinsuranceHomeEntity);
			clickOnTransactionRuleTab(reinsuranceHomeEntity);
			clickOnAccumalationRuleTab(reinsuranceHomeEntity);
			clickOnAccountTypeTab(reinsuranceHomeEntity);
			clickOnGstRITaxInvoiceProgrameTab(reinsuranceHomeEntity);
			clickOnSdtIsdInvoiceTab(reinsuranceHomeEntity);
			//BatchTab
			clickOnBatchTab(reinsuranceHomeEntity);
			clickOnUnderwritingBatchesTab(reinsuranceHomeEntity);
			clickOnInterfacesBatchesTab(reinsuranceHomeEntity);
			clickAccountingBatchesTab(reinsuranceHomeEntity);
			//reportstab
			clickOnReportTab(reinsuranceHomeEntity);
			clickStatisticTab(reinsuranceHomeEntity);
			clickOnLetterTab(reinsuranceHomeEntity);
			clickGICTab(reinsuranceHomeEntity);
			clickOnIRdaTab(reinsuranceHomeEntity);
			clickOnACReportsStatusTab(reinsuranceHomeEntity);
			clickOnCheckListMenuTab(reinsuranceHomeEntity);
			clickOnSearchRepFileTab(reinsuranceHomeEntity);
			clickOnAdvanceSearchrepTab(reinsuranceHomeEntity);
			//planningTab
			clickOnPlaningTab(reinsuranceHomeEntity);
			clickOnAsIfStatisticTab(reinsuranceHomeEntity);
			clickOnProspectStatisticsTab(reinsuranceHomeEntity);
			clickOnNewLapesedBusiTab(reinsuranceHomeEntity);
			clickOnLibilityRatioTab(reinsuranceHomeEntity);
			clickOnClaimRatioTab(reinsuranceHomeEntity);
			clickOnCatExposureTab(reinsuranceHomeEntity);
			clickOnEPiActualTab(reinsuranceHomeEntity);
			clickOnClaimTringulationTab(reinsuranceHomeEntity);
			clickOnBilateralStatisticTab(reinsuranceHomeEntity);
			//securityTab
			clickOnSecurityTab(reinsuranceHomeEntity);
			clickOnACQuarterClosingFlagTab(reinsuranceHomeEntity);
			clickOnCurreancyUploadClosingFlagTab(reinsuranceHomeEntity);
			clickOnUWQuarterClosingFlagTab(reinsuranceHomeEntity);
			clickOnGstMonthlyClosingTab(reinsuranceHomeEntity);
			clickOnChangePasswordTab(reinsuranceHomeEntity);
			clickOnMaintainRoleTab(reinsuranceHomeEntity);
			clickOnRollTreeTab(reinsuranceHomeEntity);
			clickOnSystemParameterTab(reinsuranceHomeEntity);
			clickOnLovMaintanaceTab(reinsuranceHomeEntity);
			clickOnOtherPandActionTab(reinsuranceHomeEntity);
			clickOnSearchToolTab(reinsuranceHomeEntity);
		}
	}
}
