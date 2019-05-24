package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_AttributeTypeOfDevelopmentOfficer_Rural extends WebPage {
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement pageTitle;
	private PageElement typeOfPolicy_EPPrevPageDetails;
	private PageElement schemeType_NSPrevPageDetails;
	private PageElement specialConditionPrevPageDetails;
	private PageElement specialEconomicZonePrevPageDetails;
	private PageElement isServiceTaxExemptedPrevPageDetails;
	private PageElement coInsuranceApplicablePrevPageDetails;
	private PageElement claimRatioPrevPageDetails;
	private PageElement opportunityIdPrevPageDetails;
	private PageElement typeOfDevelopmentOfficerDropDown;
	private PageElement uniqueIdentificationCodeForPolicyTextField;
	private PageElement uniqueIdentificationCodeForEndtTextField;
	private PageElement saveButton;
	private PageElement backPrevButton;
	private PageElement backAttributepageButton;
	
	public Policy_AttributeTypeOfDevelopmentOfficer_Rural(WebDriver driver,
			String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		pageTitle= new PageElement(By.xpath("//form[@name='S0042']//div//b[contains(text(),'Type Of Development Officer')]")," Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		typeOfPolicy_EPPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Type of Policy(EP)")),"Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeType_NSPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Scheme Type(NS)")),"Scheme Type(NS) Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Special Condition")),"Special Condition Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialEconomicZonePrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Special Economic Zone")),"Special Economic Zone Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isServiceTaxExemptedPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Is Service Tax Exempted")),"Is Service Tax Exempted Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicablePrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Co-Insurance Applicable")),"Co-Insurance Applicable Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Claim Ratio")),"Claim Ratio Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		opportunityIdPrevPageDetails= new PageElement(By.xpath(genericLocatorforPrevPageDetails("Opportunity Id")),"Opportunity Id Details Previous Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfDevelopmentOfficerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Development Officer","select")), "Select Type of Development Officer", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		uniqueIdentificationCodeForPolicyTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Unique Identification code for policy", "input")), "Unique Identification code for policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationCodeForEndtTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Unique Identification code for endt", "input")), "Unique Identification code for endt Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backPrevButton=new PageElement(By.name("btnPrevious"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backAttributepageButton=new PageElement(By.name("Back"), "Go to Attribute Page Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

			
		
	}

}
