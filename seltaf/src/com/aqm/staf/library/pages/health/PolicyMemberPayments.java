package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;
import com.aqm.staf.library.databin.PolicyMemberPaymentsEntity;

public class PolicyMemberPayments extends BasePage {

	private PageElement memberPaymentListTitle;
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
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement backButton;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement memberRelationsTitlePage;
	private PageElement insuredInterestCoverageTitle;


	public PolicyMemberPayments(WebDriver driver, String pageName) {
		super(driver, pageName);

		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "No.")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList","Code")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList","Serial No")), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//table

		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillMemberPaymentList(PolicyMemberPaymentsEntity policyMemberPaymentsEntity, CustomAssert assertReference){
		if(policyMemberPaymentsEntity.getAction().equalsIgnoreCase("verify")){
			PolicyMemberPaymentsEntity actualPolicyMemberPaymentsEntity = new PolicyMemberPaymentsEntity();

			if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("QuoteNo"), actualPolicyMemberPaymentsEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("PolicyNo"), actualPolicyMemberPaymentsEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("CofigStatus")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("Status", fetchValueFromTextFields(statusLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("Status"), actualPolicyMemberPaymentsEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("CofigPolicyholder")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("Policyholder", fetchValueFromTextFields(policyholderLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("Policyholder"), actualPolicyMemberPaymentsEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigProduct")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("Product"), actualPolicyMemberPaymentsEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigMemberCode")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("MemberCode", fetchValueFromTextFields(memberCodeLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("MemberCode"), actualPolicyMemberPaymentsEntity.getStringValueForField("MemberCode"), AssertionType.WARNING);
			}

			if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigMemberSerialNo.")) {
				actualPolicyMemberPaymentsEntity.setStringValueForField("MemberCode", fetchValueFromTextFields(memberSerialNoLabel));
				assertReference.assertEquals(policyMemberPaymentsEntity.getStringValueForField("MemberSerialNo."), actualPolicyMemberPaymentsEntity.getStringValueForField("MemberSerialNo."), AssertionType.WARNING);
			}
		}
	}

	public void backFromMemberPayment(PolicyMemberPaymentsEntity policyMemberPaymentsEntity) {
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void navigateToPolicyTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}

	public void navigateToAttributeTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitlePage));
			return;
		}
	}

	public void navigateToMemberTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitlePage));
			return;
		}
	}
	public void navigateToCoverageTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitlePage));
			return;
		}
	}

	public void navigateToClientDetailTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}

	public void navigateToRelationsTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPaymentsTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowupTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quotePolicyTitle));
			return;
		}
	}

	public void navigateToDocumentTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}

	public void navigateToDetailTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigDetailTab")){
			click(memberDetailTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyMemberDetailsTitle));
			return;
		}
	}

	public void navigateToAttributesTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberAttributesTitlePage));
			return;
		}
	}

	public void navigateToAttachCoveragesTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigAttachCovergesTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemRelationsTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberRelationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitlePage));
			return;
		}
	}

	public void navigateToMemPaymentsTab(PolicyMemberPaymentsEntity policyMemberPaymentsEntity){
		if (policyMemberPaymentsEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	public void fillAndSubmitMemberPaymentList(PolicyMemberPaymentsEntity policyMemberPaymentsEntity,CustomAssert assertReference) {
		fillMemberPaymentList(policyMemberPaymentsEntity, assertReference);
		navigateToPolicyTab(policyMemberPaymentsEntity);
		navigateToAttributeTab(policyMemberPaymentsEntity);
		navigateToMemberTab(policyMemberPaymentsEntity);
		navigateToCoverageTab(policyMemberPaymentsEntity);
		navigateToClientDetailTab(policyMemberPaymentsEntity);
		navigateToRelationsTab(policyMemberPaymentsEntity);
		navigateToPaymentsTab(policyMemberPaymentsEntity);
		navigateToFollowupTab(policyMemberPaymentsEntity);
		navigateToDocumentTab(policyMemberPaymentsEntity);
		navigateToDetailTab(policyMemberPaymentsEntity);
		navigateToAttributesTab(policyMemberPaymentsEntity);
		navigateToAttachCoveragesTab(policyMemberPaymentsEntity);
		navigateToRelationsTab(policyMemberPaymentsEntity);
		navigateToPaymentsTab(policyMemberPaymentsEntity);
		//backFromMemberPayment(policyMemberPaymentsEntity);

	}
}
