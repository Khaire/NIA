package com.aqm.staf.library.pages.common;

//import org.apache.bcel.generic.SWITCH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.pages.health.PolicyAttributeHealth;

public class PolicyAttribute extends BasePage {
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement schemeNumberLabel;	
	private PageElement quoteNumberLabel;	
	private PageElement policyStatusLabel;	
	private PageElement policyholderNameLabel;	
	private PageElement productNameLabel;	
	private PageElement policyEventCodeDropDown;
	private PageElement proceedButton;	
	private PageElement viewButton;
	private PageElement viewPageTitle;
	private PageElement backButton;

	private PageElement policyAttributeTitle;
	private PageElement specialEconomicZoneDropdown;
	private PageElement coInsuranceApplicableDropdown;
	private PageElement forwordButton;
	private PageElement isThePolicySubjectToAnAgreedBankClauseDropDown;

	public PolicyAttribute(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//	viewPageTitle= new PageElement(By.xpath(""), "Policy View Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		schemeNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040", "Scheme No.")), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040", "Quote")), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040", "Status")), "Policy Current Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040", "Policyholder")), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyEventCodeDropDown=new PageElement(By.name("pEventCode"), "Select Application Event Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		viewButton=new PageElement(By.name("View"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		specialEconomicZoneDropdown= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Special Economic Zone')]/following::select"), "Special Economic Zone Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropdown= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwordButton=new PageElement(By.name ("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isThePolicySubjectToAnAgreedBankClauseDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is the policy subject to an agreed bank clause?')]/following::select")," Is the policy subject to an agreed bank clause? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	} 
	public void fillPolicyAttribute(PolicyAttributeEntity policyAttributeEntity, CustomAssert assertReference){
		if(policyAttributeEntity.getAction().equalsIgnoreCase("add") || policyAttributeEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttributeEntity.getBooleanValueForField("ConfigPolicyEventCode")) {
				selectValueFromList(policyEventCodeDropDown, policyAttributeEntity.getStringValueForField("PolicyEventCode"));
			}

		}
		else if(policyAttributeEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("SchemeNo"), fetchValueFromTextFields(schemeNumberLabel), AssertionType.WARNING);
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("Status"), fetchValueFromTextFields(policyStatusLabel), AssertionType.WARNING);
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderNameLabel), AssertionType.WARNING);
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productNameLabel), AssertionType.WARNING);
			}
			/*	if (policyAttributeEntity.getBooleanValueForField("ConfigPolicyEventCode")) {
				selectValueFromList(policyEventCodeDropDown, policyAttributeEntity.getStringValueForField("PolicyEventCode"));
			}*/
		}
	}
	public void submitToProceedPolicyAttribute(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(proceedButton);
			switchToFrame("display");
			
		}
	}
	public void clickToViewPolicyAttribute(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigViewButton")){		
			click(viewButton);
			isElementDisplayed(viewPageTitle);
		}

	}
	public void clickTobackAttribute(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToPolicy(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			//isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttributeEntity policyAttributeEntity){
		if (policyAttributeEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	private void fillPolicyProperties(PolicyAttributeEntity policyAttributeEntity,CustomAssert assertReference) {

		if(policyAttributeEntity.getAction().equalsIgnoreCase("add") || policyAttributeEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttributeEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				selectValueFromList(specialEconomicZoneDropdown, policyAttributeEntity.getStringValueForField("SpecialEconomicZone"));
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropdown, policyAttributeEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			click(forwordButton);
		}
		else if(policyAttributeEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromList(specialEconomicZoneDropdown), AssertionType.WARNING);
			}
			if (policyAttributeEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropdown), AssertionType.WARNING);
			}
			click(forwordButton);
		}
	}
	private void fillBankOrFinancierDetails(PolicyAttributeEntity policyAttributeEntity,CustomAssert assertReference) {

		if(policyAttributeEntity.getAction().equalsIgnoreCase("add") || policyAttributeEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttributeEntity.getBooleanValueForField("ConfigIsThePolicySubjectToAnAgreedBankClause")) {
				selectValueFromList(isThePolicySubjectToAnAgreedBankClauseDropDown, policyAttributeEntity.getStringValueForField("IsThePolicySubjectToAnAgreedBankClause"));
			}
			click(forwordButton);
		}
		else if(policyAttributeEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeEntity.getBooleanValueForField("ConfigIsThePolicySubjectToAnAgreedBankClause")) {
				assertReference.assertEquals(policyAttributeEntity.getStringValueForField("IsThePolicySubjectToAnAgreedBankClause"), fetchValueFromList(isThePolicySubjectToAnAgreedBankClauseDropDown), AssertionType.WARNING);
			}
			click(forwordButton);
		}
	}
	public void fillandSubmitPolicyAttributeProccedDetails(PolicyAttributeEntity policyAttributeEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyAttributeEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttribute(policyAttributeEntity, assertReference);
			submitToProceedPolicyAttribute(policyAttributeEntity);

 			if(policyAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("PY")||policyAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("JI"))
			{
				fillPolicyProperties(policyAttributeEntity, assertReference);
				if(!(policyAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("MI")||policyAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("JI")||policyAttributeEntity.getStringValueForField("Product").equalsIgnoreCase("RM"))){
					fillBankOrFinancierDetails(policyAttributeEntity, assertReference);
				}
			}
			navigateToPolicy(policyAttributeEntity);
			navigateToAttribute(policyAttributeEntity);
			navigateToMember(policyAttributeEntity);
			navigateToCoverage(policyAttributeEntity);
			navigateToLoan(policyAttributeEntity);
			navigateToClientDetails(policyAttributeEntity);
			navigateToRelation(policyAttributeEntity);
			navigateToPayment(policyAttributeEntity);
			navigateToFollowup(policyAttributeEntity);
			navigateToDocument(policyAttributeEntity);
		}
	}
}
