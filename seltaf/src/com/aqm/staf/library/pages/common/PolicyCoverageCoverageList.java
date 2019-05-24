package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyCoverageListEntity;


public class PolicyCoverageCoverageList extends BasePage {

	private PageElement policyCoverageListPageTitle;
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
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
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
	private PageElement coverageCode;
	private PageElement policyCoverageListTitle;
	private PageElement policyCoverageDetailsTitle;

	public PolicyCoverageCoverageList(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyCoverageListPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverList", "No.")), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverList", "Quote")), "Policy Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverList", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverList", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverList", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//navigations
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//div//b[contains(text(),'Coverage Details')]"), "Policy Coverage List title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Policy Coverage Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	}

	public void fillPolicyCoverageList(PolicyCoverageListEntity policyCoverageListEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyCoverageListEntity.getAction().equalsIgnoreCase("add") || policyCoverageListEntity.getAction().equalsIgnoreCase("edit")){

		}
		else if(policyCoverageListEntity.getAction().equalsIgnoreCase("verify")){
			if (policyCoverageListEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyCoverageListEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyCoverageListEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyCoverageListEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyCoverageListEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyCoverageListEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyCoverageListEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyCoverageListEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyCoverageListEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(policyCoverageListEntity.getStringValueForField("Product"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToPolicy(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToPolicyAttribute(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToPolicyMember(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToPolicyCoverage(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToPolicyClientDetils(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToPolicyRelations(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPolicyPayments(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToPolicyFollowup(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToPolicyDocuments(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void backButtonPolicyCoverageList(PolicyCoverageListEntity policyCoverageListEntity){
		if (policyCoverageListEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void fillAndSubmitPolicyCoverageListDetails(PolicyCoverageListEntity policyCoverageListEntity, CustomAssert assertReference) throws InterruptedException{
		fillPolicyCoverageList(policyCoverageListEntity, assertReference);
		navigateToPolicyCoverage(policyCoverageListEntity);
		navigateToPolicy(policyCoverageListEntity);
		navigateToPolicyAttribute(policyCoverageListEntity);
		navigateToPolicyMember(policyCoverageListEntity);
		navigateToPolicyClientDetils(policyCoverageListEntity);
		navigateToPolicyRelations(policyCoverageListEntity);
		navigateToPolicyPayments(policyCoverageListEntity);
		navigateToPolicyFollowup(policyCoverageListEntity);
		navigateToPolicyDocuments(policyCoverageListEntity);
		//backButtonPolicyCoverageList(policyCoverageListEntity);
	}
	public void selectCoverageCode(PolicyCoverageListEntity policyCoverageListEntity){
		if(policyCoverageListEntity.getAction().equalsIgnoreCase("edit")){
			if(policyCoverageListEntity.getBooleanValueForField("ConfigCoverageCode")){
				coverageCode=new PageElement(By.linkText(policyCoverageListEntity.getStringValueForField("CoverageCode")), "coverage Code Link", true, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(coverageCode);
				switchToFrame("display");
				isElementDisplayed(policyCoverageDetailsTitle);
			}
		}
	}
}
