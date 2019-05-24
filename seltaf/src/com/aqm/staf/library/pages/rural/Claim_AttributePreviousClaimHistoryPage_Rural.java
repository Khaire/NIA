package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Claim_AttributePreviousClaimHistoryPage_Rural extends WebPage {

	private PageElement claimNoLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDatederLabel;
	private PageElement claimStatusLabel;

	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement tagNumberTextField;	
	private PageElement NameTextField;	
	private PageElement identificationTypeDogTextField;
	private PageElement Age_YearTextField;	
	private PageElement Age_MonthIdTextField;	
	private PageElement MarketValueTextField;	
	private PageElement sumInsuredRsTextField;

	private PageElement lossTypeDropDown;	
	private PageElement sectionsForDogInsuranceDropDown;	
	private PageElement estimatedClaimAmountTextField;

	private PageElement Excessin_PercentageDropDown;	
	private PageElement claimPayableAmountTextField; 
	private PageElement nameOfWitnessTextField;	 
	private PageElement addressOfWitnessTextField;	

	private PageElement forwordButton;
	private PageElement backButton;


	public Claim_AttributePreviousClaimHistoryPage_Rural(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		claimNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy"))," Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDatederLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date"))," Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product ")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")),"Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")),"Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		tagNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number", "input")), "Tag Number  Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NameTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name", "textarea")), "Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		identificationTypeDogTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Type(Dog)", "input")), "Identification Type(Dog) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Age_YearTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year )", "input")), " Age (Year ) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Age_MonthIdTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Months)", "input")), "Age (Months) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MarketValueTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value(Rs)", "input")), " Market Value(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), " Sum Insured(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		lossTypeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loss Type","select")), "Select Loss Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionsForDogInsuranceDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sections for Dog Insurance","select")), "Select Sections for Dog Insurance", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		estimatedClaimAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Claim Amount", "input")), "Estimated Claim Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		Excessin_PercentageDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)","select")), "Select 'Excess in (%)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		claimPayableAmountTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Payable Amount", "input")), " Claim Payable Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfWitnessTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of witness", "input")), "Name of witness Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfWitnessTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of witness", "input")), "Address of witness Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

}
