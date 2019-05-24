package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAtrPersnalAcidentEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PrePolDetailCreditShldEntity;
import com.aqm.staf.library.pages.common.PolicySearchPage;

public class PolicyAttributePersonalAccident extends BasePage {

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

	private PageElement policyDetails2Title;

	private PageElement specialEconomicZoneDropdown;
	private PageElement coInsuranceApplicableDropdown;
	private PageElement installmentPercentageListOpenButton;
	private PageElement proceedButton;
	private PageElement forwordButton;
	private PageElement backButton;

	//Product PH Good Health Personal Accident
	private PageElement goodHealthMonthDropdown;
	private PageElement schemeYearTextField;
	private PageElement chequeAmountTextField;
	private PageElement opportunityIdTextField;
	
	//PU private Type of PersonalAccident Policy
	private PageElement typeofPersonalAccidentPolicy;
	
	public PolicyAttributePersonalAccident(WebDriver driver, String pageName ){
		super(driver,pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetails2Title= new PageElement(By.xpath("//div//b[contains(text(),'Policy Details 2')]"), "Policy Details 2 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		specialEconomicZoneDropdown= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Special Economic Zone')]/following::select"), "Special Economic Zone Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropdown= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		installmentPercentageListOpenButton= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Installment Percentage List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		forwordButton=new PageElement(By.name ("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Product PH Good Health Personal Accident
		goodHealthMonthDropdown= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Good Health Month')]/following::select"), "Good Health Month Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		schemeYearTextField= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Scheme Year')]/following::input[1]"), "Scheme Year Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		chequeAmountTextField= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Cheque Amount')]/following::input[1]"), "chequeAmountTextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Opportunity Id')]/following::input"), "Opportunity Id Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//PU private Type of PersonalAccident Policy
		typeofPersonalAccidentPolicy = new PageElement(By.xpath("//select[@name='propValues2']"), "Type of PersonalAccident Policy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillPolicyAttributePersonalAccident(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity, CustomAssert assertReference){
		if((polAtrPersnalAcidentEntity.getAction().equalsIgnoreCase("add") || polAtrPersnalAcidentEntity.getAction().equalsIgnoreCase("edit"))){
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigTypeofPersonalAccidentPolicy")) {
				selectValueFromList(typeofPersonalAccidentPolicy, polAtrPersnalAcidentEntity.getStringValueForField("TypeofPersonalAccidentPolicy"));
				click(forwordButton);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				selectValueFromList(specialEconomicZoneDropdown, polAtrPersnalAcidentEntity.getStringValueForField("SpecialEconomicZone"));
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropdown, polAtrPersnalAcidentEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				//click(installmentPercentageListOpenButton, polAtrPersnalAcidentEntity.getStringValueForField("InstallmentPercentageList"));
			} 
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigGoodHealthMonth")) {
				selectValueFromList(goodHealthMonthDropdown, polAtrPersnalAcidentEntity.getStringValueForField("GoodHealthMonth"));
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigSchemeYear")) {
				clearAndSendKeys(schemeYearTextField, polAtrPersnalAcidentEntity.getStringValueForField("SchemeYear"));
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigChequeAmount")) {
				clearAndSendKeys(chequeAmountTextField, polAtrPersnalAcidentEntity.getStringValueForField("ChequeAmount"));
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, polAtrPersnalAcidentEntity.getStringValueForField("OpportunityId"));
			}

		}

		else if(polAtrPersnalAcidentEntity.getAction().equalsIgnoreCase("verify")){
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigTypeofPersonalAccidentPolicy")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("TypeofPersonalAccidentPolicy"), fetchValueFromTextFields(typeofPersonalAccidentPolicy), AssertionType.WARNING);
				click(forwordButton);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			//
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromList(specialEconomicZoneDropdown), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropdown), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigInstallmentPercentageList")) {
				//assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("InstallmentPercentageList"), fetchValueFromTextFields(installmentPercentageListOpenButton), AssertionType.WARNING);
			} 
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigGoodHealthMonth")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("GoodHealthMonth"), fetchValueFromTextFields(goodHealthMonthDropdown), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigSchemeYear")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("SchemeYear"), fetchValueFromTextFields(schemeYearTextField), AssertionType.WARNING);
			}
			if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(polAtrPersnalAcidentEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}
		}

	}

	public void navigateToPolicy(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void navigateToForwordPolicyAttribute(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			switchToFrame("display");
			policyDetails2Title = new PageElement(By.xpath("//div//b[contains(text(),'"+polAtrPersnalAcidentEntity.getStringValueForField("PolAtrPersnalAcidentTitle")+"')]"), "Policy History for PA title page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyDetails2Title);
			switchToFrame("display");
			//TODO WorkAround
			if(!polAtrPersnalAcidentEntity.getAction().equalsIgnoreCase("verify") && (polAtrPersnalAcidentEntity.getStringValueForField("Product").equalsIgnoreCase("PH"))){
				workAround(polAtrPersnalAcidentEntity);
			}
			switchToFrame("display");
		}
	}


	public void navigateToBackAttribute(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		if (polAtrPersnalAcidentEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	//TODO WORKAROUND
	public void workAround(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		//if(!isElementDisplayed(nextAttributePageTitle)){
		workAroundForPolicySearch(polAtrPersnalAcidentEntity);
		click(proceedButton);
		switchToFrame("display");
		click(forwordButton);
		switchToFrame("display");
		click(forwordButton);
	}


	public void workAroundForPolicySearch(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity){
		PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
		policySearchPage.navigateToPolicySearchPage();
		PageElement quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		clearAndSendKeys(quoteNumberTextFeild,polAtrPersnalAcidentEntity.getStringValueForField("QuoteNo") );
		PageElement searchButton= new PageElement(By.name("Search5465"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		click(searchButton);

		String quoteNo=polAtrPersnalAcidentEntity.getStringValueForField("QuoteNo").trim();
		PageElement	policyQuoteLink=new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(policyQuoteLink);
		switchToFrame("display");
		click(attributeTab);
		switchToFrame("display");
		isElementDisplayed(attributeTabTitle);
	}

	public void fillandSubmitPolicyAttributePersonalAccident(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntity, CustomAssert assertReference) {
		if(isConfigTrue(polAtrPersnalAcidentEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePersonalAccident(polAtrPersnalAcidentEntity, assertReference);
			navigateToForwordPolicyAttribute(polAtrPersnalAcidentEntity);
			navigateToBackAttribute(polAtrPersnalAcidentEntity);
			navigateToPolicy(polAtrPersnalAcidentEntity);
			navigateToAttribute(polAtrPersnalAcidentEntity);
			navigateToInsuredInterest(polAtrPersnalAcidentEntity);
			navigateToCoverage(polAtrPersnalAcidentEntity);
			navigateToLoan(polAtrPersnalAcidentEntity);
			navigateToClientDetails(polAtrPersnalAcidentEntity);
			navigateToRelation(polAtrPersnalAcidentEntity);
			navigateToPayment(polAtrPersnalAcidentEntity);
			navigateToFollowup(polAtrPersnalAcidentEntity);
			navigateToDocument(polAtrPersnalAcidentEntity);

		}
	}
}
