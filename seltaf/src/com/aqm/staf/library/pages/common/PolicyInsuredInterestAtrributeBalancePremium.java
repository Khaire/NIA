package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BalancePremiumEntity;
import com.aqm.staf.library.databin.IMJourneyDetailsPZEntity;
import com.aqm.staf.library.databin.InsuredMemberDetailEntity;

public class PolicyInsuredInterestAtrributeBalancePremium extends BasePage{

	private PageElement policyTitle;
	private PageElement attributesTitle;
	//private PageElement memberTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;

	//Label
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	//private PageElement policyMemberTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;
	private PageElement policyMemberRelationsTitle;

	private PageElement balancePremiumForPZTitlePage;
	private PageElement balancePremiumTextField;
	private PageElement basicPremiumRateTextField;
	private PageElement nextButton;
	private PageElement nextProceedButton;
	private PageElement saveButton;


	public PolicyInsuredInterestAtrributeBalancePremium(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " Member Fund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoverageTitle=new PageElement(By.linkText("Attach Coverages"), " Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "InterestCode")), "Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyMemberRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		balancePremiumForPZTitlePage=new PageElement(By.xpath("//div//b//font[contains(text(),'Balance Premium for PZ')]"), "Balance Premium for PZ Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balancePremiumTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Balance Premium","input")),"Balance Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		basicPremiumRateTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basic Premium Rate","input")),"Basic Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		nextButton=new PageElement(By.name("Next"),"Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		nextProceedButton=new PageElement(By.name("Next"),"Next Proceed Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPolicyAtrributeBalancePremiumDetails(BalancePremiumEntity balancePremiumEntity, CustomAssert assertReference){
		if(balancePremiumEntity.getAction().equalsIgnoreCase("add") || balancePremiumEntity.getAction().equalsIgnoreCase("edit")){

			if (balancePremiumEntity.getBooleanValueForField("ConfigBalancePremium")) {
				clearAndSendKeys(balancePremiumTextField, balancePremiumEntity.getStringValueForField("BalancePremium"));
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigBalancePremiumRate")) {
				clearAndSendKeys(basicPremiumRateTextField, balancePremiumEntity.getStringValueForField("BalancePremiumRate"));
			}
		}
		else if(balancePremiumEntity.getAction().equalsIgnoreCase("verify")){
			if (balancePremiumEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigBalancePremium")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("BalancePremium"), fetchValueFromList(balancePremiumTextField),AssertionType.WARNING);
			}
			if (balancePremiumEntity.getBooleanValueForField("ConfigBalancePremiumRate")) {
				assertReference.assertEquals(balancePremiumEntity.getStringValueForField("BalancePremiumRate"), fetchValueFromTextFields(basicPremiumRateTextField),AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicyTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigFollowupTab")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigDocumentTab")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigDetailTab")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigMemberAttributesTab")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigAttachCoveragesTab")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigRelationsTab")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonIMJourneyDetails(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextButton);
			switchToFrame("display");
			isElementDisplayed(balancePremiumForPZTitlePage);
		}
	}

	public void nextProceedIMJourneyDetails(BalancePremiumEntity balancePremiumEntity){
		if(balancePremiumEntity.getBooleanValueForField("ConfigNextProceedButton")){
			click(nextProceedButton);
			switchToFrame("display");
			isElementDisplayed(balancePremiumForPZTitlePage);
		}
	}

	public void clickOnSaveButton(BalancePremiumEntity balancePremiumEntity){
		if (balancePremiumEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(balancePremiumForPZTitlePage);

		}
	}

	public void fillandSubmitPolicyAtrributeBalancePremiumDetails(BalancePremiumEntity balancePremiumEntity, CustomAssert assertReference) {
		if(isConfigTrue(balancePremiumEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAtrributeBalancePremiumDetails(balancePremiumEntity, assertReference);
			nextButtonIMJourneyDetails(balancePremiumEntity);
			nextProceedIMJourneyDetails(balancePremiumEntity);
			clickOnSaveButton(balancePremiumEntity);
			navigateToPolicyTab(balancePremiumEntity);
			navigateToAttributeTab(balancePremiumEntity);
			navigateToInsuredInterestTab(balancePremiumEntity);
			navigateToCoverageTab(balancePremiumEntity);
			navigateToLoanTab(balancePremiumEntity);
			navigateToClientDetailsTab(balancePremiumEntity);
			navigateToRelationsTab(balancePremiumEntity);
			navigateToPaymentsTab(balancePremiumEntity);
			navigateToFollowupTab(balancePremiumEntity);
			navigateToDocumentTab(balancePremiumEntity);
			navigateToDetailTab(balancePremiumEntity);
			navigateToMemberAttributesTab(balancePremiumEntity);
			navigateToAttachCoverageTab(balancePremiumEntity);
			navigateToRelations1Tab(balancePremiumEntity);
			navigateToPayments1Tab(balancePremiumEntity);
		}
	}
}
