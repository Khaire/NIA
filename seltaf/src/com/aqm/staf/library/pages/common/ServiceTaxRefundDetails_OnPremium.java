package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class ServiceTaxRefundDetails_OnPremium extends WebPage {
	private PageElement serviceTaxOnPremiumTitle;
	private PageElement policyNoLabel;
	private PageElement policyholderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;
	//Table
	private PageElement refundAmuntTextField;
	private PageElement refundReasonTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public ServiceTaxRefundDetails_OnPremium(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		serviceTaxOnPremiumTitle=new PageElement(By.xpath("//div//b[contains(text(),'ServiceTaxOnPremium')]"),"ServiceTaxOnPremiumTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel=new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","PolicyNo")),"PolicyNoLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Policyholder")),"PolicyholderLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Status")),"StatusLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("processAuditRecovery","Product")),"ProductLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table
		refundAmuntTextField=new PageElement(By.name("pRefundAmount"),"RefundAmuntTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refundReasonTextArea=new PageElement(By.name("pReasonofRecovery"),"RefundReasonTextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"), "SaveButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

}
