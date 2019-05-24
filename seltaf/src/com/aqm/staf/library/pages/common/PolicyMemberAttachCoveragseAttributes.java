package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesMemberDetailEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovAtrEntity;

public class PolicyMemberAttachCoveragseAttributes  extends BasePage{
	private PageElement memberPageTitle;
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement serialNoLabel;
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
	private PageElement applicableEventCodeDropdown;
	private PageElement proceedButton;
	private PageElement viewButton;
	private PageElement backButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberHomePageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement memberDetailPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	//private PageElement memberFundPageTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;


	public PolicyMemberAttachCoveragseAttributes(WebDriver driver, String pageName){
		super(driver, pageName);
		memberPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attribute Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Member Code")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Serial No.")), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		coverageCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Code")), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Name")), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeDropdown=new PageElement(By.name("pEventCode"), "Select Application Event Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		viewButton=new PageElement(By.name("View"), "View Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//navigations
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberHomePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Policy Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

    public void fillPolicyMemberAttachCoveragseAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity, CustomAssert assertReference)throws InterruptedException{
		if(policyMemAttachCovAtrEntity.getAction().equalsIgnoreCase("add") || policyMemAttachCovAtrEntity.getAction().equalsIgnoreCase("edit")){

		}
		else if(policyMemAttachCovAtrEntity.getAction().equalsIgnoreCase("verify")){
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigCoverageCode")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("CoverageCode"), fetchValueFromTextFields(coverageCodeLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigCoverageName")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("CoverageName"), fetchValueFromTextFields(coverageNameLabel), AssertionType.WARNING);
			}
			if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(policyMemAttachCovAtrEntity.getStringValueForField("ApplicableEventCode"), fetchValueFromTextFields(applicableEventCodeDropdown), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToPolicyAttribute(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToPolicyMember(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberTab")) {
		click(memberTitle);
		switchToFrame("display");
		isElementDisplayed(memberHomePageTitle);
		}
	}
	public void navigateToPolicyCoverage(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigCoverageTab")) {
		click(coverageTitle);
		switchToFrame("display");
		isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToPolicyClientDetils(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
		click(clientDetailsTitle);
		switchToFrame("display");
		isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToPolicyRelations(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigRelationsTab")) {
		click(relationsTitle);
		switchToFrame("display");
		isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPolicyPayments(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigPaymentsTab")) {
		click(paymentsTitle);
		switchToFrame("display");
		isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToPolicyFollowup(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigFollowupTab")) {
		click(followupTitle);
		switchToFrame("display");
		isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToPolicyDocuments(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigDocumentTab")) {
		click(documentTitle);
		switchToFrame("display");
		isElementDisplayed(documentPageTitle);
		}
	}

	public void navigateToPolicyMemberDetails(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberDetailTab")) {
		click(memberDetailTitle);
		switchToFrame("display");
		isElementDisplayed(memberDetailPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberAttributesTab")) {
		click(memberAttributesTitle);
		switchToFrame("display");
		isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
		click(memberAttachCoveragesTitle);
		switchToFrame("display");
		isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
		click(memberRelationsTitle);
		switchToFrame("display");
		isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
		click(memberPaymentsTitle);
		switchToFrame("display");
		isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigDetailsTab")) {
		click(attachCoveragesDetailTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
		click(attachCoveragesAttributesTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigPremiumTab")) {
		click(attachCoveragesPremiumTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}
	public void viewButtonPolicyMemberAttachCoveragseAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigViewButton")) {
		click(viewButton);
		switchToFrame("display");
		isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void backButtonPolicyMemberAttachCoveragseAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigBackButton")) {
		click(backButton);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	
	public void proceedButtonPolicyMemberAttachCoveragseAttributes(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity){
		if (policyMemAttachCovAtrEntity.getBooleanValueForField("ConfigProceedButton")) {
		click(proceedButton);
		switchToFrame("display");
		}
	}
	
	
    public void fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntity, CustomAssert assertReference) throws InterruptedException {
    	if(isConfigTrue(policyMemAttachCovAtrEntity.getConfigExecute())){
	    	switchToFrame("display");
			fillPolicyMemberAttachCoveragseAttributes(policyMemAttachCovAtrEntity,assertReference);
			proceedButtonPolicyMemberAttachCoveragseAttributes(policyMemAttachCovAtrEntity);
			navigateToPolicyMemberAttachCoverages(policyMemAttachCovAtrEntity);
			navigateToPolicyAttachCoveragesAttributes(policyMemAttachCovAtrEntity);
			navigateToPolicyMember(policyMemAttachCovAtrEntity);
			navigateToPolicy(policyMemAttachCovAtrEntity);
			navigateToPolicyAttribute(policyMemAttachCovAtrEntity);
			navigateToPolicyCoverage(policyMemAttachCovAtrEntity);
			navigateToPolicyClientDetils(policyMemAttachCovAtrEntity);
			navigateToPolicyRelations(policyMemAttachCovAtrEntity);
			navigateToPolicyPayments(policyMemAttachCovAtrEntity);
			navigateToPolicyFollowup(policyMemAttachCovAtrEntity);
			navigateToPolicyDocuments(policyMemAttachCovAtrEntity);
			navigateToPolicyMemberDetails(policyMemAttachCovAtrEntity);
			navigateToPolicyMemberDetails(policyMemAttachCovAtrEntity);
			navigateToPolicyMemberRelations(policyMemAttachCovAtrEntity);
			navigateToPolicyMemberPayments(policyMemAttachCovAtrEntity);
			navigateToPolicyAttachCoveragesDetails(policyMemAttachCovAtrEntity);
			navigateToPolicyAttachCoveragesPremium(policyMemAttachCovAtrEntity);
			viewButtonPolicyMemberAttachCoveragseAttributes(policyMemAttachCovAtrEntity);
		    //backButtonPolicyMemberAttachCoveragseAttributes(policyMemAttachCovAtrEntity);
    }
    }
}


