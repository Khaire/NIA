package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

public class PolicyMemberPayments extends BasePage {
	
	private PageElement memberPaymentListTitle;
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

	public PolicyMemberPayments(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
	
	
	
	}

}
