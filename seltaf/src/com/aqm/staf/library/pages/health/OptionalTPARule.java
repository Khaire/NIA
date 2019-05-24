package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.OptionalTPARuleEntity;
import com.aqm.staf.library.databin.PolicyMemCoPaymentSCEntity;
import com.aqm.staf.library.databin.PortabilityEntity;

public class OptionalTPARule extends BasePage {
	private PageElement optionalTPARuleTitle;
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
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement isTPARequiredDropdown;
	private PageElement backButton;
	private PageElement previousButton;
	private PageElement forwordButton;
	private PageElement breakInInsuranceTitle;
	private PageElement policyAttributeTitle;
	private PageElement policyDetailsUHTitle;
	private PageElement breakinInsuranceTitle;


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


	public OptionalTPARule(WebDriver driver, String pageName) {
		super(driver, pageName);
		//TITLE
		optionalTPARuleTitle =new PageElement(By.xpath("//div/b[contains(text(),' Optional TPA Rule')]"), "Optional TPA Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		breakInInsuranceTitle=new PageElement(By.xpath("//div/b[contains(text(),'Break-in-Insurance')]"), "Optional TPA Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributeTitle=new PageElement(By.xpath("//div/b[contains(text(),' Policy Attributes')]"), "Optional TPA Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetailsUHTitle=new PageElement(By.xpath("//div/b[contains(text(),'Policy DetailsUH')]"), "Optional TPA Rule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakinInsuranceTitle=new PageElement(By.xpath("//div/b[contains(text(),'Break in Insurance')]"), "Break in Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		isTPARequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is TPA Required","select")),"IsTPARequiredDropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//BUTTON
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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



	}
	public void fillOptionalTPARuleAttribute(OptionalTPARuleEntity optionalTPARule, CustomAssert assertReference){
		if(optionalTPARule.getAction().equalsIgnoreCase("add") || optionalTPARule.getAction().equalsIgnoreCase("edit")){

			if (optionalTPARule.getBooleanValueForField("ConfigIsTPARequired")) {
				selectValueFromList(isTPARequiredDropdown, optionalTPARule.getStringValueForField("IsTPARequired"));
			}
		}
		else if(optionalTPARule.getAction().equalsIgnoreCase("verify")){
			if (optionalTPARule.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(optionalTPARule.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (optionalTPARule.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(optionalTPARule.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (optionalTPARule.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(optionalTPARule.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (optionalTPARule.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(optionalTPARule.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (optionalTPARule.getBooleanValueForField("ConfigIsTPARequired")) {
				assertReference.assertEquals(optionalTPARule.getStringValueForField("IsTPARequired"),fetchValueFromList(isTPARequiredDropdown), AssertionType.WARNING);
			}
		}
	}
	//services
	/*	public void navigateToforwardMemberPage(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			isElementDisplayed(breakinInsuranceTitle);
		}
	}
	public void navigateTobackMemberPage(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyAttributeTitle);
		}
	}
	private void navigateToPreviousMemberPage(OptionalTPARuleEntity optionalTPARuleEntity) {
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(policyDetailsUHTitle);
		}
	}*/

	public void navigateToPolicyTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToforwardAttributePage(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			//isElementDisplayed(breakInInsuranceTitle);
		}
	}
	public void navigateTobackAttributePage(OptionalTPARuleEntity optionalTPARuleEntity){
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyAttributeTitle);
		}
	}
	private void navigateToPreviousAttributePage(OptionalTPARuleEntity optionalTPARuleEntity) {
		if (optionalTPARuleEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(policyDetailsUHTitle);
		}
	}
	public void fillAndSubmitOptionalTPAAttribute (OptionalTPARuleEntity optionalTPARuleEntity, CustomAssert assertReference){
		if(isConfigTrue(optionalTPARuleEntity.getConfigExecute())){
		switchToFrame("display");

		fillOptionalTPARuleAttribute(optionalTPARuleEntity,assertReference);
		navigateToforwardAttributePage(optionalTPARuleEntity);
		navigateTobackAttributePage(optionalTPARuleEntity);
		navigateToPreviousAttributePage(optionalTPARuleEntity);
		navigateToPolicyTab(optionalTPARuleEntity);
		navigateToAttributeTab(optionalTPARuleEntity);
		navigateToInsuredInterestTab(optionalTPARuleEntity);
		navigateToCoverageTab(optionalTPARuleEntity);
		navigateToClientDetailsTab(optionalTPARuleEntity);
		navigateToRelationsTab(optionalTPARuleEntity);
		navigateToPaymentsTab(optionalTPARuleEntity);
		navigateToFollowupTab(optionalTPARuleEntity);
		navigateToPaymentsTab(optionalTPARuleEntity);
		navigateToFollowupTab(optionalTPARuleEntity);
		navigateToDocumentTab(optionalTPARuleEntity);


	}
}

}

