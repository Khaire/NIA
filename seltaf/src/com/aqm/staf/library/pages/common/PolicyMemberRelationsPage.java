package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberRelationsEntity;

public class PolicyMemberRelationsPage extends BasePage{

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
	private PageElement policyOrQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quoteOrpolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement detailTitle;
	private PageElement attributesTitle;
	private PageElement attachCoveragesTitle;
	private PageElement memRelationsTitle;
	private PageElement memPaymentsTitle;
	private PageElement fundTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentListTitle;
	private PageElement schemeInsuredInterestRelationsTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyholderLabel;
	private PageElement statusLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement newButton;
	private PageElement deleteButton;
	private PageElement backButton;

	//This Page Consists a Table too.

	public PolicyMemberRelationsPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTitle = new PageElement(By.xpath("//div/b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyOrQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		policyInsuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle = new PageElement(By.xpath("//div//b[contains(text(),'')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteOrpolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailTitle = new PageElement(By.xpath("//div/b[contains(text(),'Detail')]"), "Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div/b[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesTitle = new PageElement(By.xpath("//div/b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memRelationsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memPaymentsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Payments')]"), "Paymements Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fundTitle = new PageElement(By.xpath("//div/b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Policy Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeInsuredInterestRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Insured Interest Relations')]"), "Scheme Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Quote No.")), "Quote No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationList", "Member Serial No.")), "Member Serial No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton = new PageElement(By.name("Delete"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void navigateToPolicy(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;
		}
	}

	public void navigateToAttribute(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}

	public void navigateToMember(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverage(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}

	public void navigateToClientDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelations(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPayments(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowup(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;
		}
	}
	public void navigateToDocument(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}
	public void navigateToDetail(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigDetailTab")) {
			click(detailTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyMemberDetailsTitle));
			return;
		}
	}
	public void navigateToAttributes(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberAttributesTitle));
			return;
		}
	}
	public void navigateToAttachCoverages(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
			click(attachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemberRelations(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
			click(memRelationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitle));
			return;
		}
	}
	public void navigateToMemberPayments(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
			click(memPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	public void fillPolicyMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity, CustomAssert assertReference){
		if(policyMemberRelationsEntity.getAction().equalsIgnoreCase("verify")){
			PolicyMemberRelationsEntity actualPolicyMemberRelationsEntity=new PolicyMemberRelationsEntity();
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("QuoteNo"), actualPolicyMemberRelationsEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigProductName")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("ProductName", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("ProductName"), actualPolicyMemberRelationsEntity.getStringValueForField("ProductName"), AssertionType.WARNING);
			}
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("Policyholder"), actualPolicyMemberRelationsEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("Status"), actualPolicyMemberRelationsEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberCode")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("MemberCode", fetchValueFromFields(memberCodeLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("MemberCode"), actualPolicyMemberRelationsEntity.getStringValueForField("MemberCode"), AssertionType.WARNING);
			}
			if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				actualPolicyMemberRelationsEntity.setStringValueForField("MemberSerialNo", fetchValueFromFields(memberSerialNoLabel));
				assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("MemberSerialNo"), actualPolicyMemberRelationsEntity.getStringValueForField("MemberSerialNo"), AssertionType.WARNING);
			}
		}
	}

	public void navigateToMemberRelationsCreatePage() {
		click(newButton);
		switchToFrame("display");
		if(isElementDisplayed(schemeInsuredInterestRelationsTitle));
		return;
	}

	public void deleteMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity) {
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
	}

	public void backFromMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity) {
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void fillAndSubmitMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyMemberRelationsDetails(policyMemberRelationsEntity, assertReference);
		navigateToPolicy(policyMemberRelationsEntity);
		navigateToAttribute(policyMemberRelationsEntity);
		navigateToMember(policyMemberRelationsEntity);
		navigateToCoverage(policyMemberRelationsEntity);
		navigateToClientDetails(policyMemberRelationsEntity);
		navigateToRelations(policyMemberRelationsEntity);
		navigateToPayments(policyMemberRelationsEntity);
		navigateToFollowup(policyMemberRelationsEntity);
		navigateToDocument(policyMemberRelationsEntity);
		navigateToDetail(policyMemberRelationsEntity);
		navigateToAttributes(policyMemberRelationsEntity);
		navigateToAttachCoverages(policyMemberRelationsEntity);
		navigateToMemberRelations(policyMemberRelationsEntity);
		navigateToMemberPayments(policyMemberRelationsEntity);
		navigateToMemberRelationsCreatePage();
		deleteMemberRelationsDetails(policyMemberRelationsEntity);
	}
}

















