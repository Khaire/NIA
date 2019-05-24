package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.OptionalTPARuleEntity;
import com.aqm.staf.library.databin.PolInsuredLodngDisOptEntity;
import com.aqm.staf.library.databin.PolMemPreExstngDisesEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;

public class PolicyInsuredLoadingDiscountOptionPage extends BasePage {
	//title
	private PageElement loadingDiscountOptionTitle;
	private PageElement basicPremTitle;
	private PageElement	tailorPremiumDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement loadingAmbulanceTitle;
	
	private PageElement policyTitle;
	private PageElement attributesTitle;
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
	private PageElement	scheduleTitle;
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

	private PageElement memberDetailTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;
	private PageElement policyInsuredInterestDetailsTitle;



	//label
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement loadingDiscountOptionDropdown;
	private PageElement discountOptionDropdown;
	private PageElement discountAmountTextField;
	private PageElement discountPercentageTextField;

	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;

	public PolicyInsuredLoadingDiscountOptionPage(WebDriver driver,String pageName) {
		super(driver, pageName);
		//title
		loadingDiscountOptionTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Loading Discount Option')]"), "Loading Discount Option Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicPremTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Basic Prem')]"), "Basic Prem Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tailorPremiumDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Tailor Premium Details')]"), "Tailor Premium Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Tailor Premium Details')]"), "Tailor Premium Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingAmbulanceTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Loading Ambulance')]"), "Loading Ambulance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		insuredInterestTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		detailTitle=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		scheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Schedule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured InterestCode')]/following::td"), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		loadingDiscountOptionDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading Discount Option","select")),"Loading Discount Option Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountOptionDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount Option","select")),"Discount Option Title",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount Amount", "input")), "Discount Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountPercentageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount Percentage", "input")), "Discount Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


	}
	public void fillPolicyLoadingDiscountOption(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity, CustomAssert assertReference){
		if(polInsuredLodngDisOptEntity.getAction().equalsIgnoreCase("add") || polInsuredLodngDisOptEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigLoadingDiscountOption")) {
				selectValueFromList(loadingDiscountOptionDropdown, polInsuredLodngDisOptEntity.getStringValueForField("LoadingDiscountOption"));
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigDiscountOption")) {
				selectValueFromList(discountOptionDropdown, polInsuredLodngDisOptEntity.getStringValueForField("DiscountOption"));
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigDiscountAmount")) {
				clearAndSendKeys(discountAmountTextField, polInsuredLodngDisOptEntity.getStringValueForField("DiscountAmount"));
			}
			//if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigDiscountPercentage")) {
				//clearAndSendKeys(discountPercentageTextField, polInsuredLodngDisOptEntity.getStringValueForField("DiscountPercentage"));
			//}
		}

		else if(polInsuredLodngDisOptEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
			}
			if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsuredLodngDisOptEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicyTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToforwardMemberPage(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");		}
	}
	public void navigateToPreviousMemberePage(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigPreviousButton")){			
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(basicPremTitle);
		}
	}
	public void navigateToBackMemberPage(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTitle);
		}
	}
	public void navigateToDetailTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestDetailsTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelations1Tab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigRelationsButton")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentListTitle);
		}
	}
	/*public void navigateToScheduleTab(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity){
		if (polInsuredLodngDisOptEntity.getBooleanValueForField("ConfigMemberScheduleButton")){	
			click(scheduleTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}*/

	public void fillandsubmitPolicyLoadingDiscountOption(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntity, CustomAssert assertReference){
		if(isConfigTrue(polInsuredLodngDisOptEntity.getConfigExecute())){
			switchToFrame("display");

			fillPolicyLoadingDiscountOption(polInsuredLodngDisOptEntity,assertReference);
			navigateToforwardMemberPage(polInsuredLodngDisOptEntity);
			navigateToPreviousMemberePage(polInsuredLodngDisOptEntity);
			navigateToBackMemberPage(polInsuredLodngDisOptEntity);
			navigateToPolicyTab(polInsuredLodngDisOptEntity);
			navigateToAttributeTab(polInsuredLodngDisOptEntity);
			navigateToInsuredInterestTab(polInsuredLodngDisOptEntity);
			navigateToCoverageTab(polInsuredLodngDisOptEntity);
			navigateToClientDetailsTab(polInsuredLodngDisOptEntity);
			navigateToRelationsTab(polInsuredLodngDisOptEntity);
			navigateToPaymentsTab(polInsuredLodngDisOptEntity);
			navigateToFollowupTab(polInsuredLodngDisOptEntity);
			navigateToPaymentsTab(polInsuredLodngDisOptEntity);
			navigateToFollowupTab(polInsuredLodngDisOptEntity);
			navigateToDocumentTab(polInsuredLodngDisOptEntity);
			navigateToDetailTab(polInsuredLodngDisOptEntity);
			navigateToMemberAttributesTab(polInsuredLodngDisOptEntity);
			navigateToAttachCoverageTab(polInsuredLodngDisOptEntity);
			navigateToRelations1Tab(polInsuredLodngDisOptEntity);
			navigateToPayments1Tab(polInsuredLodngDisOptEntity);
			/*navigateToScheduleTab(polInsuredLodngDisOptEntity);*/
		}
	}
}
