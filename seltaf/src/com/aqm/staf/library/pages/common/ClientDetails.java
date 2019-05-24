package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClientDetailsEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PolicyMember_InsuredEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;

public class ClientDetails extends BasePage {
	private PageElement clientDetailTitle;
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
	private PageElement quoteNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyHolderLabel;
	private PageElement productNameLabel;
	private PageElement houseNumberLabel;
	private PageElement applicationEventCodeLabel;
	private PageElement saveButton;
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


	public ClientDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		clientDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"),"SchemeDetailTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		memberTitle=new PageElement(By.linkText("Member"),"Member Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "ClientDetailsTitle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","QuoteNumber")),"QuoteNumberLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","QuoteNumber")),"QuoteNumberLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","PolicyStatus")),"PolicyStatusLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","PolicyHolder")),"PolicyHolderLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","ProductName")),"ProductNameLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		houseNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","HouseNumber")),"HouseNumberLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicationEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0230","ApplicationEventCode")),"ApplicationEventCodeLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"), "Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyInsuredInterest')]"), "Policy Insured Interes Titlet", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetai1lTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


	}
	// Services
	public void navigateToPolicyTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsTitle));
			return;
		}
	}
	public void navigateToAttributeTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}
	public void navigateToMemberTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverageTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}
	public void navigateToClientDetailsTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(clientDetailTitle));
			return;
		}
	}
	public void navigateToRelationsTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPaymentsTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowupTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quotePolicyTitle));
			return;
		}
	}
	public void navigateToDocumentTab(ClientDetailsEntity clientDetailsEntity){
		if (clientDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}
	public void fillclientDetailsEntity(ClientDetailsEntity clientDetailsEntity, CustomAssert assertReference){
		if(clientDetailsEntity.getAction().equalsIgnoreCase("verify")){
			ClientDetailsEntity actualclientDetailsEntity=new ClientDetailsEntity();

			if (clientDetailsEntity.getBooleanValueForField("ConfigQuoteNumber")) {
				actualclientDetailsEntity.setStringValueForField("QuoteNumber",fetchValueFromFields(quoteNumberLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("QuoteNumber"), actualclientDetailsEntity.getStringValueForField("QuoteNumber"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				actualclientDetailsEntity.setStringValueForField("PolicyNumber",fetchValueFromFields(policyNumberLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyNumber"), actualclientDetailsEntity.getStringValueForField("PolicyNumber"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyStatus")) {
				actualclientDetailsEntity.setStringValueForField("PolicyStatus",fetchValueFromFields(policyStatusLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyStatus"), actualclientDetailsEntity.getStringValueForField("PolicyStatus"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolcyholder")) {
				actualclientDetailsEntity.setStringValueForField("Polcyholder",fetchValueFromFields(policyHolderLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("Polcyholder"), actualclientDetailsEntity.getStringValueForField("Polcyholder"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualclientDetailsEntity.setStringValueForField("Policyholder",fetchValueFromFields(policyHolderLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("Policyholder"), actualclientDetailsEntity.getStringValueForField("Policyholder"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigProductName")) {
				actualclientDetailsEntity.setStringValueForField("ProductName",fetchValueFromFields(productNameLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("ProductName"), actualclientDetailsEntity.getStringValueForField("ProductName"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigHouseNumber")) {
				actualclientDetailsEntity.setStringValueForField("HouseNumber",fetchValueFromFields(houseNumberLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("HouseNumber"), actualclientDetailsEntity.getStringValueForField("HouseNumber"),AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigApplictionEventCode")) {
				actualclientDetailsEntity.setStringValueForField("ApplictionEventCode",fetchValueFromFields(applicationEventCodeLabel));
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("ApplictionEventCode"), actualclientDetailsEntity.getStringValueForField("ApplictionEventCode"),AssertionType.WARNING);
			}

		}}
	public void fillandsearchClientListDetails(ClientDetailsEntity clientDetailsEntity, CustomAssert assertReference)throws InterruptedException {
		switchToFrame("display");
		fillclientDetailsEntity(clientDetailsEntity, assertReference);

		navigateToPolicyTab(clientDetailsEntity);
		navigateToAttributeTab(clientDetailsEntity);
		navigateToMemberTab(clientDetailsEntity);
		navigateToCoverageTab(clientDetailsEntity);
		navigateToClientDetailsTab(clientDetailsEntity);
		navigateToRelationsTab(clientDetailsEntity);
		navigateToPaymentsTab(clientDetailsEntity);
		navigateToFollowupTab(clientDetailsEntity);
		navigateToDocumentTab(clientDetailsEntity);

	}
}
