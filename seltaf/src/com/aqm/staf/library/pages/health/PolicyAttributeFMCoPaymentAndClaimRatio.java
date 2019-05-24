package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class PolicyAttributeFMCoPaymentAndClaimRatio extends BasePage {
	
	private PageElement policyAttributesPageCoPaymentAndClaimRatioTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement claimRatioTextField;
	private PageElement coPaymentTextField;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;


	public PolicyAttributeFMCoPaymentAndClaimRatio(WebDriver driver,
			String pageName) {
		super(driver, pageName);
	    policyAttributesPageCoPaymentAndClaimRatioTitle = new PageElement(By.xpath("//div/b[contains(text(),'Co-Payment & Claim Ratio')]"), "Policy Attributes Page CoPayment And ClaimRatio Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    //Question Answers
		claimRatioTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Ratio(%)", "input")), "Enter Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coPaymentTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Payment(Excess)", "input")), "Enter Co-Payment(Excess) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}

}
