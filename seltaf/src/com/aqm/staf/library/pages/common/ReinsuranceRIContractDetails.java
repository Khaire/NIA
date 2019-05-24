package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PreviousPolicyHistoryEntity;
import com.aqm.staf.library.databin.RIContractEntity;

public class ReinsuranceRIContractDetails extends BasePage{
	
	private PageElement RIContractTab;
	private PageElement RIContractPage;
	private PageElement ContractReferenceNo;
	private PageElement ContractName;
	private PageElement ContractType;
	private PageElement Reinsurer;
	private PageElement TreatyType;
	private PageElement ReinsuranceType;
	private PageElement EndDate;
	private PageElement StartDate;
	private PageElement RestrictedSearch;
	private PageElement UnrestrictedSearch;
	private PageElement ViewMode;
	private PageElement CreateRIContract;
	private PageElement SearchRIContract;
	private PageElement ResetRIContract;
	private PageElement ProvisionalNoticeOfCancellation;
	private PageElement RenewalAlertDays;
	private PageElement ReinsurerCedant;
	private PageElement NilExemptedGST;
	private PageElement FCMRCMApplicability;
	private PageElement PartysACStartMonth;
	private PageElement WrittenLine;
	private PageElement ManagementExpense;
	private PageElement PortfolioPremium;
	private PageElement PremiumReserve;
	private PageElement PartysACEndMonth;
	private PageElement SignedLine;
	private PageElement NoClaimBonus;
	private PageElement NoClaimBonusyearPremium ;
	private PageElement PortfolioLoss;
	private PageElement LossReserve;
	private PageElement MinorClass;
	private PageElement Product;
	private PageElement ProfitCommission;
	private PageElement Commission;
	private PageElement AddSection;
	private PageElement DeleteSection;
	private PageElement Save;
	private PageElement Cancel;
	
	public ReinsuranceRIContractDetails(WebDriver driver, String pageName) {
		super(driver, pageName);

		RIContractTab=new PageElement(By.xpath("//td[@id='pRIContract']"), "RI Contract Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RIContractPage=new PageElement(By.xpath("//th[text()='RI Contract Details']]"), "RI Contract Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ContractReferenceNo=new PageElement(By.xpath("//input[@name='txtContractReferenceNo']"), "Contract Reference Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ContractName=new PageElement(By.xpath("//input[@name='txtContractName']"), "Contract Reference Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ContractType=new PageElement(By.xpath("//input[@name='subStatus']"), "Contract Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Reinsurer=new PageElement(By.xpath("//input[@name='pField']"), "Reinsurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TreatyType=new PageElement(By.xpath("//input[@name='LOV']"), "TreatyType", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ReinsuranceType=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		/*EndDate=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		StartDate=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RestrictedSearch=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		UnrestrictedSearch=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ViewMode=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		CreateRIContract=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SearchRIContract=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ResetRIContract=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ProvisionalNoticeOfCancellation=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RenewalAlertDays=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ReinsurerCedant=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		NilExemptedGST=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		FCMRCMApplicability=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartysACStartMonth=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		WrittenLine=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ManagementExpense=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PortfolioPremium=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PremiumReserve=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PartysACEndMonth=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SignedLine=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		NoClaimBonus=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		NoClaimBonusyearPremium =new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PortfolioLoss=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		LossReserve=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		MinorClass=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Product=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ProfitCommission=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Commission=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		AddSection=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		DeleteSection=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Save=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Cancel=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);*/
	}
	
	private void selectRIContractTab(RIContractEntity RIContractEntity) {
		if (RIContractEntity.getBooleanValueForField("ConfigBackButton")){		
			click(RIContractTab);
			isElementDisplayed(RIContractPage);
		}
	}
	
	
}
