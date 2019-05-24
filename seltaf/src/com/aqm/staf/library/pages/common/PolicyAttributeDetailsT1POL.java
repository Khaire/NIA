package com.aqm.staf.library.pages.common;

//import org.apache.bcel.generic.SWITCH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyAttrDetailsT1POLEntity;

public class PolicyAttributeDetailsT1POL extends BasePage{


	private PageElement policyDetailsT1POLTitle;
	private PageElement policyDetailsT2POLTitle;
	private PageElement policyTypeforJanArogyaBimaPolicyDropDown;

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
	private PageElement NextButton;
	private PageElement backButton;

	public PolicyAttributeDetailsT1POL (WebDriver driver, String pageName) {
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
		schemeNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme No.")), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Policy Current Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// JM
		policyDetailsT1POLTitle= new PageElement(By.xpath("//div//b[contains(text(),' Policy Details T1-POL')]"), "PolicyDetailsT1-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetailsT2POLTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Details T2-POL')]"), "PolicyDetailsT2-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeforJanArogyaBimaPolicyDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type for Jan Arogya Bima Policy", "select")), "Premium in Forex Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NextButton=new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillpolicyAttributeDetailsT1POL (PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity, CustomAssert assertReference){
		if(policyAttrDetailsT1POLEntity.getAction().equalsIgnoreCase("add") || policyAttrDetailsT1POLEntity.getAction().equalsIgnoreCase("edit")){
			
			if((policyAttrDetailsT1POLEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))){
				click(NextButton);
			}

			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigPolicyTypeforJanArogyaBimaPolicy")) {
				selectValueFromList(policyTypeforJanArogyaBimaPolicyDropDown, policyAttrDetailsT1POLEntity.getStringValueForField("PolicyTypeforJanArogyaBimaPolicy"));
			}
		}
		else if(policyAttrDetailsT1POLEntity.getAction().equalsIgnoreCase("verify")){
			
			if((policyAttrDetailsT1POLEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))){
				click(NextButton);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNumberLabel), AssertionType.WARNING);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("Status"), fetchValueFromFields(policyStatusLabel), AssertionType.WARNING);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderNameLabel), AssertionType.WARNING);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productNameLabel), AssertionType.WARNING);
			}
			if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigPolicyTypeforJanArogyaBimaPolicy")) {
				assertReference.assertEquals(policyAttrDetailsT1POLEntity.getStringValueForField("PolicyTypeforJanArogyaBimaPolicy"), fetchValueFromList(policyTypeforJanArogyaBimaPolicyDropDown), AssertionType.WARNING);
			}		
		}
	}

	public void proceedPolicyAttribute(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(NextButton);
			switchToFrame("display");
			isElementDisplayed(policyDetailsT2POLTitle);
		}
	}
	public void clickTobackAttribute(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToPolicy(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void navigateToClientDetails(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity){
		if (policyAttrDetailsT1POLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitPolicyAttributeDetailsT1POLPage (PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyAttrDetailsT1POLEntity.getConfigExecute())){
			switchToFrame("display");
			fillpolicyAttributeDetailsT1POL(policyAttrDetailsT1POLEntity, assertReference);
			proceedPolicyAttribute(policyAttrDetailsT1POLEntity);
			navigateToPolicy(policyAttrDetailsT1POLEntity);
			navigateToAttribute(policyAttrDetailsT1POLEntity);
			navigateToMember(policyAttrDetailsT1POLEntity);
			navigateToCoverage(policyAttrDetailsT1POLEntity);
			navigateToLoan(policyAttrDetailsT1POLEntity);
			navigateToClientDetails(policyAttrDetailsT1POLEntity);
			navigateToRelation(policyAttrDetailsT1POLEntity);
			navigateToPayment(policyAttrDetailsT1POLEntity);
			navigateToFollowup(policyAttrDetailsT1POLEntity);
			navigateToDocument(policyAttrDetailsT1POLEntity);
		}
	}
}
