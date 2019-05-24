package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.OptionalTPARuleEntity;
import com.aqm.staf.library.databin.PortabilityEntity;

public class Portability extends BasePage {

	private PageElement portabilityTitle; 
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	//tabs
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;

	private PageElement policyAttributesPageTypeOfDevelopmentOfficerTitle;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement portabilityApprovedByTextField;
	private PageElement backButton;
	private PageElement previousButton;
	private PageElement	saveButton;
	private PageElement forwordButton;
	private PageElement policyAttributeTitle;



	public Portability(WebDriver driver,String pageName) {
		super(driver, pageName);
		//TITLE
		portabilityTitle= new PageElement(By.xpath("//div//b[contains(text(),'portability')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyAttributeTitle=new PageElement(By.xpath("//div/b[contains(text(),' Policy Attributes')]"), "Optional TPA Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//tabs
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BUTTON
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwordButton=new PageElement(By.name("Next"), " Forward Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		portabilityApprovedByTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Portability Approved By", "textarea")), "Portability Approved By", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPortabilityAttribute(PortabilityEntity portabilityEntity, CustomAssert assertReference){
		if(portabilityEntity.getAction().equalsIgnoreCase("add") || portabilityEntity.getAction().equalsIgnoreCase("edit")){

			if (portabilityEntity.getBooleanValueForField("ConfigPortabilityApprovedBy")) {
				clearAndSendKeys(portabilityApprovedByTextField, portabilityEntity.getStringValueForField("PortabilityApprovedBy"));
			}
		}

		else if(portabilityEntity.getAction().equalsIgnoreCase("verify")){
			if (portabilityEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(portabilityEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (portabilityEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(portabilityEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (portabilityEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(portabilityEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (portabilityEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(portabilityEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (portabilityEntity.getBooleanValueForField("ConfigPortabilityApprovedBy")) {
				assertReference.assertEquals(portabilityEntity.getStringValueForField("PortabilityApprovedBy"),fetchValueFromTextFields(portabilityApprovedByTextField), AssertionType.WARNING);
			}
		}
	}
	// services
	public void navigateToPolicyTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToforwardAttributePage(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			portabilityTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+portabilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(portabilityTitle);
		}
	}
	public void navigateTosaveAttributePage(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
			portabilityTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+portabilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(portabilityTitle);
		}
	}
	public void navigateTobackAttributePage(PortabilityEntity portabilityEntity){
		if (portabilityEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyAttributeTitle);
		}
	}
	private void navigateToPreviousAttributePage(PortabilityEntity portabilityEntity) {
		if (portabilityEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(policyAttributesPageTypeOfDevelopmentOfficerTitle);
		}
	}

	public void fillPortabilityAttributeDetails (PortabilityEntity portabilityEntity, CustomAssert assertReference){
		if(isConfigTrue(portabilityEntity.getConfigExecute())){
			switchToFrame("display");

			fillPortabilityAttribute(portabilityEntity,assertReference);
			navigateToforwardAttributePage(portabilityEntity);
			navigateTosaveAttributePage(portabilityEntity);
			navigateTobackAttributePage(portabilityEntity);
			navigateToPreviousAttributePage(portabilityEntity);
			navigateToPolicyTab(portabilityEntity);
			navigateToAttributeTab(portabilityEntity);
			navigateToInsuredInterestTab(portabilityEntity);
			navigateToCoverageTab(portabilityEntity);
			navigateToClientDetailsTab(portabilityEntity);
			navigateToRelationsTab(portabilityEntity);
			navigateToPaymentsTab(portabilityEntity);
			navigateToFollowupTab(portabilityEntity);
			navigateToPaymentsTab(portabilityEntity);
			navigateToFollowupTab(portabilityEntity);
			navigateToDocumentTab(portabilityEntity);

		}

	}
}
