package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class InsuredInterestCoverage extends WebPage {

	private PageElement InsuredInterestCoverageDetailsPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	//private PageElement coveregeRowSelectionCheckBox;
	private PageElement coveregeCodeLabel;
	private PageElement coverageNameLabel;
	private PageElement newButton;
	private PageElement prorataDeleteButton;
	private PageElement shortTermDeleteButton;
	private PageElement backButton;
	
	
	public InsuredInterestCoverage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		InsuredInterestCoverageDetailsPageTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Quote")), "Quote Number ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Product")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Policyholder")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Status")), "Status ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Insured Interest Code")), "Insured Interest Code ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Insured Interest Serial No.")), "Insured Interest Serial No. ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//Check box heading is not given. 
		//coveregeRowSelectionCheckBox= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		coveregeCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Coverage Code")),"Coverage Code ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList","Coverage Name")), "Coverage Name ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton= new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		prorataDeleteButton = new PageElement(By.name("proRataDelete"), "Prorata Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shortTermDeleteButton = new PageElement(By.name("shortTermDelete"), "ShortTerm Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
	}

}
