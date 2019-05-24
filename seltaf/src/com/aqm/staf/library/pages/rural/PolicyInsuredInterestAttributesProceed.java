package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

public class PolicyInsuredInterestAttributesProceed extends BasePage{
	private PageElement riskDetailsForDogTitle;
	
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement insuredInterestDetailTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestrAttachCoveragesTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentsTitle;
	private PageElement insuredInterestScheduleTitle;
	
	
	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;	
	private PageElement currentPageLabel;
	private PageElement tagNumberTextField;
	private PageElement nameTextArea;
	private PageElement identificationTypeDropdown;
	private PageElement originOfRiskDropdown;
	private PageElement sexDropdown;
	private PageElement otherMarksTextArea;
	private PageElement ageYearTextField;
	private PageElement ageMonthTextField;
	private PageElement purposeOfUseNewTextArea;
	private PageElement locationTextArea;
	private PageElement marketValueTextField;
	private PageElement sumInsuredTextField;
	private PageElement exceesInDropdown;
	private PageElement saveButton;
	private PageElement backButton;
	
	public PolicyInsuredInterestAttributesProceed(WebDriver driver, String pageName){
		super(driver, pageName);
		riskDetailsForDogTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details For Dog')]"), "Risk Details For Dog Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.linkText("Insured Interest"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTitle = new PageElement(By.linkText("Schedule"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number", "input")), "Tag NumberText Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name", "textarea")), "Name Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		identificationTypeDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Type", "select")), "Identification Type Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		originOfRiskDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Origin of risk", "select")), "Origin Of Risk Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sexDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex", "select")), "Sex Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		otherMarksTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breed/Color/Other Marks", "textarea")), "Other Marks Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED ,10);
		ageYearTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year )", "input")), "Age Year Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageMonthTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Months)", "input")), "Age Month Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purposeOfUseNewTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Purpose of Use(New)", "textarea")), "Purpose Of Use New Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location where the animals are housed", "textarea")), "Location Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value(Rs)", "input")), "Market Value Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		exceesInDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)", "select")), "Excees In Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
	}
}
