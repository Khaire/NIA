package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyAttrPOSMotorEntity;
import com.aqm.staf.library.databin.PolicyAttrPOSMotorEntity;

public class PolicyAttributeMotorPOS extends BasePage{
	
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
	//title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	
	private PageElement isBusinessSourcedFromTieUpDropDown;
	private PageElement pOsApplicableDropDown;
	private PageElement posTitle;
	
	public PolicyAttributeMotorPOS(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		isBusinessSourcedFromTieUpDropDown= new PageElement(By.name("propValues1"),"Is Business Sourced from Tie Up", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pOsApplicableDropDown=new PageElement(By.name("propValues3"),"POS Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillPolicyAttributrMotorPOS(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyAttributeMotorPOSEntity.getAction().equalsIgnoreCase("add") || policyAttributeMotorPOSEntity.getAction().equalsIgnoreCase("edit")){
			if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigIsBusinessSourcedFromTieUp")) {
				selectValueFromList(isBusinessSourcedFromTieUpDropDown, policyAttributeMotorPOSEntity.getStringValueForField("IsBusinessSourcedFromTieUp"));
			}
			if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigPOSApplicable")) {
				selectValueFromList(pOsApplicableDropDown, policyAttributeMotorPOSEntity.getStringValueForField("POSApplicable"));
			}
		}
		else if(policyAttributeMotorPOSEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigIsBusinessSourcedFromTieUp")) {
				assertReference.assertEquals(policyAttributeMotorPOSEntity.getStringValueForField("IsBusinessSourcedFromTieUp"), fetchValueFromList(isBusinessSourcedFromTieUpDropDown), AssertionType.WARNING);
			}
			if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigPOSApplicable")) {
				assertReference.assertEquals(policyAttributeMotorPOSEntity.getStringValueForField("POSApplicable"), fetchValueFromList(pOsApplicableDropDown), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity ){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			posTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyAttributeMotorPOSEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(posTitle);
		}
	}
	public void clickOnBackButton(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity){
		if (policyAttributeMotorPOSEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void fillandSubmitPolicyAttributeMotorPOS(PolicyAttrPOSMotorEntity policyAttributeMotorPOSEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyAttributeMotorPOSEntity.getConfigExecute())){
			fillPolicyAttributrMotorPOS(policyAttributeMotorPOSEntity, assertReference);
			clickOnForwardButton(policyAttributeMotorPOSEntity);
			navigateToPolicy(policyAttributeMotorPOSEntity);
			navigateToAttribute(policyAttributeMotorPOSEntity);
			navigateToInsuredInterest(policyAttributeMotorPOSEntity);
			navigateToCoverage(policyAttributeMotorPOSEntity);
			navigateToLoan(policyAttributeMotorPOSEntity);
			navigateToClientDetails(policyAttributeMotorPOSEntity);	
			navigateToRelation(policyAttributeMotorPOSEntity);
			navigateToPayment(policyAttributeMotorPOSEntity);
			navigateToFollowup(policyAttributeMotorPOSEntity);
			navigateToDocument(policyAttributeMotorPOSEntity);	
			clickOnBackButton(policyAttributeMotorPOSEntity);
			clickOnBackwardButton(policyAttributeMotorPOSEntity);
			
		}
	}
}