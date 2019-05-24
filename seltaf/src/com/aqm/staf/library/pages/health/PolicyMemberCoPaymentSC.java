package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MedicalCheckUpDetailsEntity;
import com.aqm.staf.library.databin.OptionalTPARuleEntity;
import com.aqm.staf.library.databin.PolicyMemCoPaymentSCEntity;
import com.aqm.staf.library.databin.PortabilityEntity;

public class PolicyMemberCoPaymentSC extends BasePage {

	private PageElement coPaymentSCTitle;
	private PageElement medicalCheckUpDetailsTitle;
	private PageElement	preExistingDiseaseatRenewTitle;
	private PageElement memberAttriubutesTitle;
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

	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberRelationTitle;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement coPaymentExcessTextField;
	private PageElement cumulativeBonusTextField;

	private PageElement doyouwanttoRefundonOMPPolicyDropdown;

	public PolicyMemberCoPaymentSC(WebDriver driver,String pageName) {
		super(driver, pageName);
		//TITLE
		coPaymentSCTitle= new PageElement(By.xpath("//div//b[contains(text(),'CoPayment SC')]"), "CoPayment SC Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		medicalCheckUpDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Medical Check Up Detail')]"), "Medical Check Up Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		preExistingDiseaseatRenewTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Pre Existing Disease at Renew')]"), "Pre Existing Disease at Renew Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Attriubutes')]"), "Member AttriubutesTitle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//TABS
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		policyMemberDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle=new PageElement(By.xpath("//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationTitle=new PageElement(By.xpath("//b[contains(text(),'Member Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		coPaymentExcessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Payment", "input")), "Co Payment Excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cumulativeBonusTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus", "input")), "Cumulative Bonus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BUTTON
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		doyouwanttoRefundonOMPPolicyDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you want to refund on OMP Policy", "select")), "do you want to Refund on OMP Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillMemberCoPaymentSC(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity, CustomAssert assertReference){
		if(policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("add") || policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("edit")){

			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigCoPaymentSC")) {
				clearAndSendKeys(coPaymentExcessTextField, policyMemCoPaymentSCEntity.getStringValueForField("CoPaymentSC"));
			}	
		}
		else if(policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("verify")){

			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberCoode")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("MemberCoode"), fetchValueFromFields(memberCodeLabel),AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("SerialNo"), fetchValueFromFields(memberSerialNoLabel),AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigCoPaymentSC")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("CoPaymentSC"),fetchValueFromList(coPaymentExcessTextField), AssertionType.WARNING);
			}
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("CumulativeBonus"),fetchValueFromList(cumulativeBonusTextField), AssertionType.WARNING);
			}
		}
	}
	// services
	public void navigateToforwardMemberPage(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			/*isElementDisplayed(preExistingDiseaseatRenewTitle);*/
		}
	}
	public void navigateTobackMemberPage(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttriubutesTitle);
		}
	}
	private void navigateToPreviousMemberPage(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity) {
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(medicalCheckUpDetailsTitle);
		}
	}

	public void navigateToPolicyTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetail1Tab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(detail1Title);
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void navigateToAttributes1Tab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberAttributesTab")){
			click(attributes1Title);
			isElementDisplayed(memberAttriubutesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(attachCoverageTitle);
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelationTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(relations1Title);
			isElementDisplayed(memberRelationTitle);
		}
	}
	public void navigateToPaymentTab(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(payments1Title);
			isElementDisplayed(memberPaymentListTitle);
		}
	}

	public void fillEndorsementRefundforOMP(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity, CustomAssert assertReference){
		if(policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("add") || policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("edit")){

			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigRefundonOMPEndorse")) {
				selectValueFromList(doyouwanttoRefundonOMPPolicyDropdown, policyMemCoPaymentSCEntity.getStringValueForField("RefundonOMPEndorse"));
			}	
		}
		else if(policyMemCoPaymentSCEntity.getAction().equalsIgnoreCase("verify")){
			if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigRefundonOMPEndorse")) {
				assertReference.assertEquals(policyMemCoPaymentSCEntity.getStringValueForField("CumulativeBonus"),fetchValueFromList(cumulativeBonusTextField), AssertionType.WARNING);
			}
		}
	}

	public void navigateToNextPage(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity){
		if (policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void fillandsubmitMemberCoPaymentSC (PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntity, CustomAssert assertReference){
		if(isConfigTrue(policyMemCoPaymentSCEntity.getConfigExecute())){
			switchToFrame("display");

			fillMemberCoPaymentSC(policyMemCoPaymentSCEntity,assertReference);
			navigateToforwardMemberPage(policyMemCoPaymentSCEntity);
			if(policyMemCoPaymentSCEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){

				if(policyMemCoPaymentSCEntity.getBooleanValueForField("ConfigEndorseJM")){
					fillEndorsementRefundforOMP(policyMemCoPaymentSCEntity, assertReference);
					navigateToNextPage(policyMemCoPaymentSCEntity);
				}
			}
			navigateTobackMemberPage(policyMemCoPaymentSCEntity);
			navigateToPreviousMemberPage(policyMemCoPaymentSCEntity);
			navigateToPolicyTab(policyMemCoPaymentSCEntity);
			navigateToAttributeTab(policyMemCoPaymentSCEntity);
			navigateToInsuredInterestTab(policyMemCoPaymentSCEntity);
			navigateToCoverageTab(policyMemCoPaymentSCEntity);
			navigateToClientDetailsTab(policyMemCoPaymentSCEntity);
			navigateToRelationsTab(policyMemCoPaymentSCEntity);
			navigateToPaymentsTab(policyMemCoPaymentSCEntity);
			navigateToFollowupTab(policyMemCoPaymentSCEntity);
			navigateToPaymentsTab(policyMemCoPaymentSCEntity);
			navigateToFollowupTab(policyMemCoPaymentSCEntity);
			navigateToDocumentTab(policyMemCoPaymentSCEntity);
			navigateToDetail1Tab(policyMemCoPaymentSCEntity);
			navigateToAttributes1Tab(policyMemCoPaymentSCEntity);
			navigateToAttachCoverageTab(policyMemCoPaymentSCEntity);
			navigateToRelationTab(policyMemCoPaymentSCEntity);
			navigateToPaymentTab(policyMemCoPaymentSCEntity);
		}
	}
}



