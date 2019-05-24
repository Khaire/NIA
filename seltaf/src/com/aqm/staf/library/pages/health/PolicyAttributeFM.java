package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class PolicyAttributeFM  extends BasePage{
	
	//private PageElement policyAttributesPageProductTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement newPremiumRateApplicableDropdown;
	private PageElement zoneForNewFamilyFloaterDropdown;
	private PageElement assigneeNameTextField;
	private PageElement physicianNameTextField;
	private PageElement physicianAddressTextField;
	private PageElement foreignEmbassyDropdown;
	private PageElement premiumInForexDropdown;
	private PageElement staffDiscountDropdown;
    private PageElement employeeTypeDropdown;
	private PageElement srNoTextField;
	private PageElement companyNameOfStaffMemberDropdown;
	private PageElement whetherYouHadAHealthPolicyInThePastDropdown;
	private PageElement opportunityIdTextField;
	private PageElement relationshipWithTheAssigneeDropdown;
	private PageElement IsServiceTaxExemptedDropdown;
    private PageElement forwordButton;
	private PageElement backButton;
	
	public PolicyAttributeFM(WebDriver driver, String pageName) {
		super(driver, pageName);
		//policyAttributesPageProductTitle = new PageElement(By.xpath("//div/b[contains(text(),'Policy Attributes FM')]"), "Policy Attributes Page Product Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels 
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    //Question and Answers
		newPremiumRateApplicableDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("New Premium Rate Applicable","select")), "Select New Premium Rate Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		zoneForNewFamilyFloaterDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Zone for New Family Floater", "select")), "Select Zone for New Family Floater Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		assigneeNameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assignee name", "textarea")), "Enter Asignee Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianNameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Name", "input")), "Enter Physician Name TextField ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianAddressTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Physician Address", "textarea")), "Enter Physician Address TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		foreignEmbassyDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Foreign Embassy", "select")), "Select Foreign Embassy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumInForexDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium in Forex", "select")), "Select Premium in Forex Dropdown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		staffDiscountDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Staff Discount", "select")), "Select Staff Discount Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		employeeTypeDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employee type", "select")), "Select Employee Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		srNoTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SR No.", "input")), "Enter Sr No TextField ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyNameOfStaffMemberDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company Name of Staff Member", "select")), "Select Company Name of Staff Member Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherYouHadAHealthPolicyInThePastDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A Health Policy in the Past", "select")), "Select Whether You Had A Health Policy in the Past Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Opportunity Id", "input")), "Enter Opportunity Id TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithTheAssigneeDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Assignee", "select")), "Select Relationship with the Assignee Dropdown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IsServiceTaxExemptedDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Service Tax Exempted", "select")), "Select Is Service Tax Exempted Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
    }
}
