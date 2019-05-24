package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyInsrAttrBasPrem1Entity;

public class PolicyInsuredAttributesBasicPrem1 extends BasePage{
	
	private PageElement basicPrem1PageTitle;
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
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	// TG
	private PageElement isMaternityExtensionBenefitIsRequiredDropDown;
	private PageElement percentageOfLoadingForMaternityExtensionbenefitTextField;
	private PageElement sumInsuredOptedForNormalDeliveryTextField;
	private PageElement	sumInsuredOptedForCaesareanTextField;
	private PageElement is9MonthsWaitingPeriodRequiredToBeDeletedDropDown;
	private PageElement	percentageOfLoadingForDeleting9MonthsWaitingPeriodTextField;
	
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
	private PageElement basicPremPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;

	private PageElement btnPreviousButton;
		
	public PolicyInsuredAttributesBasicPrem1 (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		basicPrem1PageTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Basic Prem')]"), "Basic Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				
		basicPremPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Basic Prem')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//TG Base premium 1 page
		isMaternityExtensionBenefitIsRequiredDropDown=new PageElement(By.name("propValues1"), "Next Group DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		percentageOfLoadingForMaternityExtensionbenefitTextField=new PageElement(By.name("propValues2"), "To Which Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOptedForNormalDeliveryTextField=new PageElement(By.name("propValues3"), "To Which Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOptedForCaesareanTextField=new PageElement(By.name("propValues4"), "To Which Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		is9MonthsWaitingPeriodRequiredToBeDeletedDropDown =new PageElement(By.name("propValues5"), "Next Group DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		percentageOfLoadingForDeleting9MonthsWaitingPeriodTextField=new PageElement(By.name("propValues6"), "To Which Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		btnPreviousButton = new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	
	public void fillPolicyInsuredAttributesBasicPrem1Page (PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity, CustomAssert assertReference)throws InterruptedException{
		if(policyInsrAttrBasPrem1Entity.getAction().equalsIgnoreCase("add") || policyInsrAttrBasPrem1Entity.getAction().equalsIgnoreCase("edit")){

			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigIsMaternityExtensionBenefitIsRequired")) {
				selectValueFromList(isMaternityExtensionBenefitIsRequiredDropDown, policyInsrAttrBasPrem1Entity.getStringValueForField("IsMaternityExtensionBenefitIsRequired"));
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPercentageOfLoadingForMaternityExtensionbenefit")) {
				clearAndSendKeys(percentageOfLoadingForMaternityExtensionbenefitTextField, policyInsrAttrBasPrem1Entity.getStringValueForField("PercentageOfLoadingForMaternityExtensionbenefit"));
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigSumInsuredOptedForNormalDelivery")) {
				clearAndSendKeys(sumInsuredOptedForNormalDeliveryTextField, policyInsrAttrBasPrem1Entity.getStringValueForField("SumInsuredOptedForNormalDelivery"));
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigSumInsuredOptedForCaesarean")) {
				clearAndSendKeys(sumInsuredOptedForCaesareanTextField, policyInsrAttrBasPrem1Entity.getStringValueForField("SumInsuredOptedForCaesarean"));
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigIs9MonthsWaitingPeriodRequiredToBeDeleted")) {
				selectValueFromList(is9MonthsWaitingPeriodRequiredToBeDeletedDropDown, policyInsrAttrBasPrem1Entity.getStringValueForField("Is9MonthsWaitingPeriodRequiredToBeDeleted"));
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting9MonthsWaitingPeriod")) {
				clearAndSendKeys(percentageOfLoadingForDeleting9MonthsWaitingPeriodTextField, policyInsrAttrBasPrem1Entity.getStringValueForField("PercentageOfLoadingForDeleting9MonthsWaitingPeriod"));
			}			
		}
		else if(policyInsrAttrBasPrem1Entity.getAction().equalsIgnoreCase("verify")){

			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			// TG
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigIsMaternityExtensionBenefitIsRequired")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("IsMaternityExtensionBenefitIsRequired"), fetchValueFromTextFields(isMaternityExtensionBenefitIsRequiredDropDown), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPercentageOfLoadingForMaternityExtensionbenefit")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("PercentageOfLoadingForMaternityExtensionbenefit"), fetchValueFromTextFields(percentageOfLoadingForMaternityExtensionbenefitTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigSumInsuredOptedForNormalDelivery")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("SumInsuredOptedForNormalDelivery"), fetchValueFromTextFields(sumInsuredOptedForNormalDeliveryTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigSumInsuredOptedForCaesarean")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("SumInsuredOptedForCaesarean"), fetchValueFromTextFields(sumInsuredOptedForCaesareanTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigIs9MonthsWaitingPeriodRequiredToBeDeleted")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("Is9MonthsWaitingPeriodRequiredToBeDeleted"), fetchValueFromTextFields(is9MonthsWaitingPeriodRequiredToBeDeletedDropDown), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPercentageOfLoadingForDeleting9MonthsWaitingPeriod")) {
				assertReference.assertEquals(policyInsrAttrBasPrem1Entity.getStringValueForField("PercentageOfLoadingForDeleting9MonthsWaitingPeriod"), fetchValueFromTextFields(percentageOfLoadingForDeleting9MonthsWaitingPeriodTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicyTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyInsuredAttributesBasicPrem1Page(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(basicPremPageTitle);
		}
	}
	public void backButtonPolicyInsuredAttributesBasicPrem1Page(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity){
		if (policyInsrAttrBasPrem1Entity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolicyInsuredAttributesBasicPrem1Page(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyInsrAttrBasPrem1Entity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredAttributesBasicPrem1Page(policyInsrAttrBasPrem1Entity, assertReference);
			proceedButtonPolicyInsuredAttributesBasicPrem1Page(policyInsrAttrBasPrem1Entity);
			navigateToPolicyTab(policyInsrAttrBasPrem1Entity);
			navigateToAttributeTab(policyInsrAttrBasPrem1Entity);
			navigateToMemberTab(policyInsrAttrBasPrem1Entity);
			navigateToCoverageTab(policyInsrAttrBasPrem1Entity);
			navigateToClientDetailTab(policyInsrAttrBasPrem1Entity);
			navigateToRelationsTab(policyInsrAttrBasPrem1Entity);
			navigateToPaymentsTab(policyInsrAttrBasPrem1Entity);
			navigateToFollowupTab(policyInsrAttrBasPrem1Entity);
			navigateToDocumentTab(policyInsrAttrBasPrem1Entity);
			navigateToPolicyMemberDetails(policyInsrAttrBasPrem1Entity);
			navigateToPolicyMemberAttributes(policyInsrAttrBasPrem1Entity);
			navigateToPolicyMemberAttachCoverages(policyInsrAttrBasPrem1Entity);
			navigateToPolicyMemberRelations(policyInsrAttrBasPrem1Entity);
			navigateToPolicyMemberPayments(policyInsrAttrBasPrem1Entity);
		}

	}


}
