package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class PolicyAttachCoverageLoadingAndDiscountDetailRuralForCA extends BasePage {

	private PageElement loadingAndDiscountForDogPageTitle;
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoveragesTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement scheduleTitle;
	private PageElement detailsTitle;
	private PageElement attributes2Title;
	private PageElement premiumTitle;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel; 
	private PageElement serialNoLabel;
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
	private PageElement currentPageLabel; 
	private PageElement isLoadingApplicableDropdown;
	private PageElement loadingTextField;
	private PageElement reasonsOfLoadingTextField;
	private PageElement specialDiscountInLieuOfAgencyIsApplicableDropdown;
	private PageElement discountTextField;
	private PageElement reasonsForDiscountTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public PolicyAttachCoverageLoadingAndDiscountDetailRuralForCA(WebDriver driver,String pageName) {
		super(driver, pageName);
		loadingAndDiscountForDogPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loading and Discount for Dog')]"),"Loading And Discount For Dog", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.linkText("Insured Interest"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailTitle = new PageElement(By.linkText("Detail"), "Insured Interest Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributes1Title = new PageElement(By.linkText("Attributes"), "Insured Interest Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relations1Title = new PageElement(By.xpath("//div[@title='Relation']"), "Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		payments1Title = new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Insured Interest Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		scheduleTitle = new PageElement(By.linkText("Schedule"), "Insured Interest Schedule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailsTitle = new PageElement(By.xpath("//div[contains(text(),'Details')]"), "Attach Coverages Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributes2Title = new PageElement(By.xpath("//div[contains(text(),'Details')]/following::td"), "Attach Coverages Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumTitle = new PageElement(By.xpath("//div[contains(text(),'Premium')]"), "Attach Coverages Premium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Code")), "Insured Interest Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Serial No.")), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverage Code")), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverage Name")), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"),"Current Page Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isLoadingApplicableDropdown =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Loading Applicable", "select")),"Is Loading Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%)", "input")),"Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonsOfLoadingTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reasons of  Loading", "textarea")),"Reasons Of Loading Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountInLieuOfAgencyIsApplicableDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special discount in lieu of agency is applicable", "select")),"Special Discount In Lieu Of Agency is Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount (%)", "text")),"Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonsForDiscountTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reasons For Discount", "textarea")),"Reasons For Discount Text Area",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
}
