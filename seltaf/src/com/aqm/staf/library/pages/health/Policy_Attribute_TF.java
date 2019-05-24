package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_Attribute_TF extends WebPage {
	private PageElement previousPolicyDetailsTitle;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement zoneForHealthDropdown;
	private PageElement totalNumberOfPersonsCoveredTextField;
	private PageElement coInsuranceApplicableDropdown;
	private PageElement isTPARequiredDropdown;
	private PageElement opportunityIdTextField;
	private PageElement isHOApprovalObtainedDropdown;
	private PageElement HOApprovalDetailsTextField;
	private PageElement isServiceTaxExemptedDropdown;
	private PageElement proceedButton;
	private PageElement backButton;


	public Policy_Attribute_TF(WebDriver driver, String pageName) {
		super(driver, pageName);
		previousPolicyDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'PreviousPolicyDetails')]"),"previousPolicyDetailsTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote No")),"Quote No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")),"StatusLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")),"PolicyholderLabel", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")),"ProductLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		zoneForHealthDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ZoneForHealth","select")),"ZoneForHealthDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalNumberOfPersonsCoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("TotalNumberOfPersonsCovered", "input")),"TotalNumberOfPersonsCovered",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coInsuranceApplicableDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("CoInsuranceApplicable","select")),"CoInsuranceApplicableDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isTPARequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IsTPARequired","select")),"IsTPARequiredDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		opportunityIdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("OpportunityId","input")),"OpportunityIdTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isHOApprovalObtainedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IsHOApprovalObtained","select")),"IsHOApprovalObtainedDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		HOApprovalDetailsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HOApprovalDetails","input")),"HOApprovalDetailsTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isServiceTaxExemptedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IsServiceTaxExempted","select")),"IsServiceTaxExemptedDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		proceedButton=new PageElement(By.name("Proceed"),"Proceed Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

}
