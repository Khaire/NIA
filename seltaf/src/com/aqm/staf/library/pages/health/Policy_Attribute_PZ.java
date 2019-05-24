package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeEntity;

public class Policy_Attribute_PZ extends WebPage {
	private PageElement policyDataPZT1POLTitle ;
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
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement undertakingFromTheEmployerReceivedDropdown;
	private PageElement	policyTypeForPZDropdown;
	private PageElement premiumToBeChargedOnPerDayBasisOrBandWiseDropdown;
	private PageElement totalNoOfEmployeesTextField;
	private PageElement expectedNumberOfTripsDuringThePolicyPeriodTextField;
	private PageElement averageDurationOfTripsInDaysTextField;
	private PageElement maximumAgeOfTheEmployeeTravellingTextField;
	private PageElement whetherYouHadACFTPolicyInThePastDropdown;
	private PageElement isServiceTaxExemptedDropdown;
	private PageElement companyNameOfThePreviousInsuranceCompanyTextField;
	private PageElement currentPolicyNumberTextField;
	private PageElement expiryDateOfTheLastPolicyTextField;
	private PageElement sumInsuredTextField;
	private PageElement dateOfFirstPolicyTextField;
	private PageElement howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField;
	private PageElement claimReceivedAndReportedAmountTextField;
	private PageElement proceedButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetai1lTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;

	public Policy_Attribute_PZ(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyDataPZT1POLTitle=new PageElement(By.xpath("//div//b[contains(text(),'PolicyDataPZT1POL')]"),"PolicyDataPZT1POLTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTitle=new PageElement(By.linkText("Insured Interest"),"Insured Interest Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "ClientDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote No")),"Quote No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")),"StatusLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")),"PolicyholderLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")),"ProductLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		undertakingFromTheEmployerReceivedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("UndertakingFromTheEmployerReceived","select")),"UndertakingFromTheEmployerReceivedDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		policyTypeForPZDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PolicyTypeForPZ","select")),"PolicyTypeForPZDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumToBeChargedOnPerDayBasisOrBandWiseDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PremiumToBeChargedOnPerDayBasisOrBandWise","select")),"PremiumToBeChargedOnPerDayBasisOrBandWiseDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalNoOfEmployeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("TotalNoOfEmployees","input")),"TotalNoOfEmployeeS",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expectedNumberOfTripsDuringThePolicyPeriodTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ExpectedNumberOfTripsDuringThePolicyPeriod","input")),"ExpectedNumberOfTripsDuringThePolicyPeriod",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		averageDurationOfTripsInDaysTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("AverageDurationOfTripsInDays","input")),"AverageDurationOfTripsInDays",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maximumAgeOfTheEmployeeTravellingTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MaximumAgeOfTheEmployeeTravelling","input")),"MaximumAgeOfTheEmployeeTravelling",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		whetherYouHadACFTPolicyInThePastDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("WhetherYouHadACFTPolicyInThePast","select")),"WhetherYouHadACFTPolicyInThePastDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isServiceTaxExemptedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IsServiceTaxExempted","select")),"IsServiceTaxExemptedDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		companyNameOfThePreviousInsuranceCompanyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("CompanyNameOfThePreviousInsuranceCompany","input")),"CompanyNameOfThePreviousInsuranceCompany",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expiryDateOfTheLastPolicyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ExpiryDateOfTheLastPolicy", "input")),"ExpiryDateOfTheLastPolicy",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SumInsured", "input")),"SumInsured",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfFirstPolicyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("TotalNumberOfPersonsCovered","input")),"TotalNumberOfPersonsCovered",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast", "input")),"HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimReceivedAndReportedAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ClaimReceivedAndReportedAmount","input")),"ClaimReceivedAndReportedAmount",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Proceed"),"Proceed Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);


		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetai1lTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void submitToProceedPolicyAttribute(PolicyAttributeEntity policyAttributeEntity){
		 if (policyAttributeEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(proceedButton);
			switchToFrame("display");
			if(isElementDisplayed(attributeTitle));
			return;
		 }
		
	}

}
