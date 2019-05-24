package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class ClaimPartiesAddVeterinaryDoctor extends BasePage {
	
	private PageElement claimPartyFinancialSummaryTitle;
	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement dateOfAppointmentTextField;
	private PageElement dateOfVisitTextField;
	private PageElement technicalExpertReportNoTextArea;
	private PageElement technicalExpertReportDateTextField;
	private PageElement technicalExpertReportSubmissionDateTextField;
	private PageElement technicalExpertCommentsTextArea;
	private PageElement technicalExpertFeesTextField;
	private PageElement otherExpensesTextField;
	private PageElement totalFeesTextField;
	private PageElement qualityOfAssessmentDropdown;
	private PageElement technicalCompetencyDropdown;
	private PageElement saveButton;
	private PageElement backButton;
	
	
	
	public ClaimPartiesAddVeterinaryDoctor(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPartyFinancialSummaryTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Party Financial Summary')]"), "Claim Party Financial Summary Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.xpath("//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.xpath("//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.xpath("//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.xpath("//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Party Code")), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Party Name")), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Applicable Event Code")), "Applicable Event Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAppointmentTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Appointment", "input")),"Date of Appointment Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfVisitTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Visit", "input")),"Date of Visit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertReportNoTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue3", "textarea")),"Technical Expert Report No Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertReportDateTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Technical Expert Report Date", "textarea")),"Technical Expert Report Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertReportSubmissionDateTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Technical Expert Report Submission Date", "input")),"Technical Expert Report Submission Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertCommentsTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue6", "textarea")),"Technical Expert Comments Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		technicalExpertFeesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue7", "input")),"Technical Expert Fees Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherExpensesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue8", "input")),"Other Expenses Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalFeesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue9", "input")),"Total Fees Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		qualityOfAssessmentDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue10", "select")),"Quality Of Assessment Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		technicalCompetencyDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("pParametervalue11", "select")),"Technical Competency Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		saveButton = new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
	}

}
