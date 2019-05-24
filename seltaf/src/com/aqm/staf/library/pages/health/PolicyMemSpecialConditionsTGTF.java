package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsLoadAmbulanceEntity;
import com.aqm.staf.library.databin.PolInsurSplConditnTFTGEntity;
import com.aqm.staf.library.databin.PolicyInsrdTailorPremEntity;


public class PolicyMemSpecialConditionsTGTF extends BasePage {
	//TITLE
	private PageElement specialConditionsTGTFTitle;
	private PageElement tailorPremiumDetailsTitle;
	//tabs
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
	//SUB TABS
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement	scheduleTitle;
	//title
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;


	private PageElement policyInsuredInterestDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;

	
	//LABEL	
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredIntrestCodeLabel;
	private PageElement insuredIntrestSerialNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;


	private PageElement specialCondition1TextField;
	private PageElement specialCondition2TextField;

	private PageElement proceedButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;

	public PolicyMemSpecialConditionsTGTF(WebDriver driver,String pageName,int rowcount) {
		super(driver, pageName);
		//TITLE
		specialConditionsTGTFTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Special Conditions TG TF')]"), "Special Conditions TG TF Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tailorPremiumDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Tailor Premium Details')]"), "Installement Facility Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredIntrestCodeLabel= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured InterestCode')]/following::td"), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredIntrestSerialNoLabel= new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//SUBTABS
		detailTitle=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		scheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Schedule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//TITLE
		policyInsuredInterestDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestAttributesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Tailor Premium Details')]"), "Tailor Premium Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);



		specialCondition1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Condition 1","textarea")),"Special Condition1 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialCondition2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Condition 2","textarea")),"Special Condition2 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	//polInsurSplConditnTFTGEntity

	public void fillPolicyMemSpecialConditionsTGTF(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity, CustomAssert assertReference){
		if(polInsurSplConditnTFTGEntity.getAction().equalsIgnoreCase("add") || polInsurSplConditnTFTGEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigSpecialCondition1")) {
				clearAndSendKeys(specialCondition1TextField, polInsurSplConditnTFTGEntity.getStringValueForField("SpecialCondition1"));
			}

			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigSpecialCondition2")) {
				clearAndSendKeys(specialCondition2TextField, polInsurSplConditnTFTGEntity.getStringValueForField("SpecialCondition2"));
			}
}

		else if(polInsurSplConditnTFTGEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
			}
			if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsurSplConditnTFTGEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicyTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoan(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	
	public void navigateToClientDetailsTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToPreviousInsuredPage(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigPreviousButton")){			
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(tailorPremiumDetailsTitle);
		}
	}
	public void navigateToBackInsuredPage(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(specialConditionsTGTFTitle);
		}
	}
	public void navigateToSaveInsuredPage(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigSaveButton")){
			//click(proceedButton);
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(specialConditionsTGTFTitle);
		}
	}

	public void navigateToDetailTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestDetailsTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelations1Tab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigRelationsButton")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentListTitle);
		}
	}
	public void proceedButtonPolInsurSplConditnTFTG(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(specialConditionsTGTFTitle);
		}
	}
	/*public void navigateToScheduleTab(polInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity){
		if (polInsurSplConditnTFTGEntity.getBooleanValueForField("ConfigMemberScheduleButton")){	
			click(scheduleTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}*/

	public void fillandsubmitPolicyMemSpecialConditionsTGTF (PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntity, CustomAssert assertReference){
		if(isConfigTrue(polInsurSplConditnTFTGEntity.getConfigExecute())){
			switchToFrame("display");

			fillPolicyMemSpecialConditionsTGTF(polInsurSplConditnTFTGEntity,assertReference);
			proceedButtonPolInsurSplConditnTFTG(polInsurSplConditnTFTGEntity);
			navigateToPreviousInsuredPage(polInsurSplConditnTFTGEntity);
			navigateToBackInsuredPage(polInsurSplConditnTFTGEntity);
			navigateToSaveInsuredPage(polInsurSplConditnTFTGEntity);
			navigateToPolicyTab(polInsurSplConditnTFTGEntity);
			navigateToAttributeTab(polInsurSplConditnTFTGEntity);
			navigateToInsuredInterestTab(polInsurSplConditnTFTGEntity);
			navigateToCoverageTab(polInsurSplConditnTFTGEntity);
			navigateToLoan(polInsurSplConditnTFTGEntity);
			navigateToClientDetailsTab(polInsurSplConditnTFTGEntity);
			navigateToRelationsTab(polInsurSplConditnTFTGEntity);
			navigateToPaymentsTab(polInsurSplConditnTFTGEntity);
			navigateToFollowupTab(polInsurSplConditnTFTGEntity);
			navigateToPaymentsTab(polInsurSplConditnTFTGEntity);
			navigateToFollowupTab(polInsurSplConditnTFTGEntity);
			navigateToDocumentTab(polInsurSplConditnTFTGEntity);
			navigateToDetailTab(polInsurSplConditnTFTGEntity);
			navigateToMemberAttributesTab(polInsurSplConditnTFTGEntity);
			navigateToAttachCoverageTab(polInsurSplConditnTFTGEntity);
			navigateToRelations1Tab(polInsurSplConditnTFTGEntity);
			navigateToPayments1Tab(polInsurSplConditnTFTGEntity);
			/*navigateToScheduleTab(polInsurSplConditnTFTGEntity);*/
		}
	}
}







