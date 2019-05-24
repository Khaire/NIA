package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_PaymentProjection extends WebPage {
	private PageElement paymentProjectionTitle;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement changeInGrossPremiumINRLabel;
	//Table1Pending
	//Table2Pending
	private PageElement backButton;


	public Policy_PaymentProjection(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		paymentProjectionTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment Projection')]"),"PaymentProjectionTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel=new PageElement(By.xpath(genericLocatorforLabel("PaymentProjection","Policy")),"PolicyNoLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("PaymentProjection","Status")),"StatusLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("PaymentProjection","Policyholder")),"PolicyholderLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("PaymentProjection","Product")),"ProductLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		changeInGrossPremiumINRLabel=new PageElement(By.xpath(locatorforPanel("PaymentProjection", "input")),"PaymentProjection",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table1Pending
		//Table2Pending
		backButton=new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}

}
