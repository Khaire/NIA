package com.aqm.staf.library.pages.health;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberAttrGroupEntity;

public class PolicyMemberAttributesGroupNumberPage extends BasePage {
	
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
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement groupNumberTextField;
	private PageElement proceedButton;
	private PageElement backButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement memberDetailsCXPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	
	
	public PolicyMemberAttributesGroupNumberPage (WebDriver driver, String pageName) {
		
		super(driver, pageName);
		
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0040", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Member Code")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Member Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNumberTextField=new PageElement(By.name("propValues2"), "To Which Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailsCXPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Member Details CX T1-PLR')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyMemberAttributesGroupNumberPage(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity, CustomAssert assertReference)throws InterruptedException{
		if(policyMemberAttrGroupEntity.getAction().equalsIgnoreCase("add") || policyMemberAttrGroupEntity.getAction().equalsIgnoreCase("edit")){
			
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigGroupNumber")) {
				clearAndSendKeys(groupNumberTextField, policyMemberAttrGroupEntity.getStringValueForField("GroupNumber"));
			}
		}
		else if(policyMemberAttrGroupEntity.getAction().equalsIgnoreCase("verify")){
		
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("MemberSerialNo"), fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigGroupNumber")) {
				assertReference.assertEquals(policyMemberAttrGroupEntity.getStringValueForField("GroupNumber"), fetchValueFromTextFields(groupNumberTextField), AssertionType.WARNING);
			}		
		}
	}
	public void navigateToPolicyTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyMemberAttributesGroupNumber(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(memberDetailsCXPageTitle);
		}
	}
	public void backButtonPolicyMemberAttributesGroupNumber(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity){
		if (policyMemberAttrGroupEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndProceedPolicyMemberAttributesGroupNumberPage(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyMemberAttrGroupEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemberAttributesGroupNumberPage(policyMemberAttrGroupEntity, assertReference);
			proceedButtonPolicyMemberAttributesGroupNumber(policyMemberAttrGroupEntity);
			navigateToPolicyTab(policyMemberAttrGroupEntity);
			navigateToAttributeTab(policyMemberAttrGroupEntity);
			navigateToMemberTab(policyMemberAttrGroupEntity);
			navigateToCoverageTab(policyMemberAttrGroupEntity);
			navigateToClientDetailTab(policyMemberAttrGroupEntity);
			navigateToRelationsTab(policyMemberAttrGroupEntity);
			navigateToPaymentsTab(policyMemberAttrGroupEntity);
			navigateToFollowupTab(policyMemberAttrGroupEntity);
			navigateToDocumentTab(policyMemberAttrGroupEntity);
			navigateToPolicyMemberDetails(policyMemberAttrGroupEntity);
			navigateToPolicyMemberAttributes(policyMemberAttrGroupEntity);
			navigateToPolicyMemberAttachCoverages(policyMemberAttrGroupEntity);
			navigateToPolicyMemberRelations(policyMemberAttrGroupEntity);
			navigateToPolicyMemberPayments(policyMemberAttrGroupEntity);
		}

	}
}
