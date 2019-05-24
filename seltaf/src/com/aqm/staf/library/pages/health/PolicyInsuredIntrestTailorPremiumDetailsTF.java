package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolInsuredLodngDisOptEntity;
import com.aqm.staf.library.databin.PolicyInsrdTailorPremEntity;



public class PolicyInsuredIntrestTailorPremiumDetailsTF extends BasePage {
	private PageElement tailorPremiumDetailsTitle;
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
	//sub tabs
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

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredIntrestCodeLabel;
	private PageElement insuredIntrestSerialNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement installementPercentageList;
	private PageElement openButton;
	private PageElement saveButton;

	private PageElement installmentFacilityTitlePage;
	private PageElement serialNoParameterTextField;
	private PageElement installmentPercentageWindowTextField;
	private PageElement policyInsuredInterestDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;
	
	//TG Sachin
	private PageElement categoryWindowAddButton;
	private PageElement serialNoTextField;
	private PageElement categoryTypeforTailorMadePoliciesTextField;
	private PageElement numberOfPersonsPerCategoryTextField;
	private PageElement categoryTotalPremiumTextField;
	private PageElement categoryDescriptionTextArea;
	private PageElement categoryWindowDeleteButton;
	private PageElement specialConditionsTGTFTitle;
	
	

	public PolicyInsuredIntrestTailorPremiumDetailsTF(WebDriver driver,String pageName,int rowcount) {
		super(driver, pageName);
		//TITLE
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
		//Title
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//sub tabs
		detailTitle=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		scheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Schedule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
		policyInsuredInterestDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestAttributesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Tailor Premium Details')]"), "Tailor Premium Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//button
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		openButton = new PageElement(By.name("propValues1"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_"+rowcount+""), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//TG Sachin
		categoryWindowAddButton=new PageElement(By.name("btnAdd"), "Category Window Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextField=new PageElement(By.name("slNo0"),"Serial No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		categoryTypeforTailorMadePoliciesTextField=new PageElement(By.name("Data_267845326082011_0"), "Category type for Tailor Made policies Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfPersonsPerCategoryTextField=new PageElement(By.name("Data_267845426082011_0"), "Number of Persons per category Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		categoryTotalPremiumTextField=new PageElement(By.name("Data_267845626082011_0"), "Category Total Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		categoryDescriptionTextArea=new PageElement(By.name("Data_267845726082011_0"), "Category Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		categoryWindowDeleteButton=new PageElement(By.name("btnDel"), "Category Window Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
		specialConditionsTGTFTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Special Conditions TG TF')]"), "Special Conditions TG TF Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	}

	public void fillPolicyInsuredIntrestTailorPremiumDetailsTF(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyInsrdTailorPremEntity.getAction().equalsIgnoreCase("add") || policyInsrdTailorPremEntity.getAction().equalsIgnoreCase("edit")){

			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryofMembersOpenButton")) {
				fillCategoryOfMembers(policyInsrdTailorPremEntity);
			}
		}
		else if(policyInsrdTailorPremEntity.getAction().equalsIgnoreCase("verify")){
			
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
			}
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("InsuredInterestSerialNo"),  fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
			}
			
			if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryofMembersOpenButton")) {
				clickOnOpenButton(policyInsrdTailorPremEntity);
				
				if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigSerialNo")){
					assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("SerialNo"),fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING );
				}
				if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryTypeforTailorMadePolicies")){
					assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("CategoryTypeforTailorMadePolicies"),fetchValueFromTextFields(categoryTypeforTailorMadePoliciesTextField),AssertionType.WARNING );
				}
				if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigNumberOfPersonsPerCategory")){
					assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("NumberOfPersonsPerCategory"),fetchValueFromTextFields(numberOfPersonsPerCategoryTextField),AssertionType.WARNING );
				}
				if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryTotalPremium")){
					assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("CategoryTotalPremium"),fetchValueFromTextFields(categoryTotalPremiumTextField),AssertionType.WARNING);
				}
				if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryDescription")) {
					assertReference.assertEquals(policyInsrdTailorPremEntity.getStringValueForField("CategoryDescription"),fetchValueFromTextFields(categoryDescriptionTextArea),AssertionType.WARNING);
				}
				if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
					click(saveWindowButton);
				}
				if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCloseWindowButton")){
					click(closeWindowButton);
					switchToWindow();
					switchToFrame("display");
					isElementDisplayed(tailorPremiumDetailsTitle);

				}
				
			}
			
		}
	}

	public void clickOnOpenButton(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity) throws InterruptedException{
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			switchToWindow("Category of Members' Details");
		}
	}

	private void fillCategoryOfMembers(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity) throws InterruptedException {
		clickOnOpenButton(policyInsrdTailorPremEntity);
		Thread.sleep(4000);
		//TG Sachin
		//Table - Parameter List for Installment Percentage List
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryWindowAddButton")){
			click(categoryWindowAddButton);
		}
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,policyInsrdTailorPremEntity.getStringValueForField("SerialNo") );
		}
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryTypeforTailorMadePolicies")){
			clearAndSendKeys(categoryTypeforTailorMadePoliciesTextField,policyInsrdTailorPremEntity.getStringValueForField("CategoryTypeforTailorMadePolicies") );
		}
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigNumberOfPersonsPerCategory")){
			clearAndSendKeys(numberOfPersonsPerCategoryTextField,policyInsrdTailorPremEntity.getStringValueForField("NumberOfPersonsPerCategory") );
		}
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryTotalPremium")){
			clearAndSendKeys(categoryTotalPremiumTextField,policyInsrdTailorPremEntity.getStringValueForField("CategoryTotalPremium") );
		}
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryDescription")) {
			clearAndSendKeys(categoryDescriptionTextArea, policyInsrdTailorPremEntity.getStringValueForField("CategoryDescription"));
		}

		//if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigCategoryofMembers"))
		if(policyInsrdTailorPremEntity.getBooleanValueForField("ConfigDeleteCategory")){
			click(categoryWindowDeleteButton);
		}	
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow();
			switchToFrame("display");
			isElementDisplayed(tailorPremiumDetailsTitle);

		}
	}
	private void clickOnSaveButton(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity) {
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(tailorPremiumDetailsTitle);
		}
	}
	
	//TG Sachin
	private void clickOnForwardButton(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity) {
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwordButton);
			switchToFrame("display");
			isElementDisplayed(specialConditionsTGTFTitle);
		}
	}

	public void navigateToPolicy(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttribute(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);

		}
	}
	public void navigateToMember(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverage(PolicyInsrdTailorPremEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}	
	}

	public void navigateToLoan(PolicyInsrdTailorPremEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTitle);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(PolicyInsrdTailorPremEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);

		}
	}
	public void navigateToRelation(PolicyInsrdTailorPremEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPayment(PolicyInsrdTailorPremEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowup(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocument(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestDetailsTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelations1Tab(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigRelationsButton")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity){
		if (policyInsrdTailorPremEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentListTitle);
		}
	}


	public void fillandsubmitPolicyInsuredIntrestTailorPremiumDetailsTF(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyInsrdTailorPremEntity.getConfigExecute())){
			switchToFrame("display");

			fillPolicyInsuredIntrestTailorPremiumDetailsTF(policyInsrdTailorPremEntity,assertReference);
			clickOnSaveButton(policyInsrdTailorPremEntity);
			clickOnForwardButton(policyInsrdTailorPremEntity);
			navigateToPolicy(policyInsrdTailorPremEntity);
			navigateToAttribute(policyInsrdTailorPremEntity);
			navigateToMember(policyInsrdTailorPremEntity);
			navigateToCoverage(policyInsrdTailorPremEntity);
			navigateToLoan(policyInsrdTailorPremEntity);
			navigateToClientDetails(policyInsrdTailorPremEntity);
			navigateToRelation(policyInsrdTailorPremEntity);
			navigateToPayment(policyInsrdTailorPremEntity);
			navigateToFollowup(policyInsrdTailorPremEntity);
			navigateToDocument(policyInsrdTailorPremEntity);
			navigateToDetailTab(policyInsrdTailorPremEntity);
			navigateToMemberAttributesTab(policyInsrdTailorPremEntity);
			navigateToAttachCoverageTab(policyInsrdTailorPremEntity);
			navigateToRelations1Tab(policyInsrdTailorPremEntity);
			navigateToPayments1Tab(policyInsrdTailorPremEntity);

		}
	}	
}