package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrPolDeatilsMHEntity;
import com.aqm.staf.library.databin.PolAttrPolDeatilsMHEntity;

public class PolicyAttributePolicyDeatilsMarineHull extends BasePage{

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement forwardButton;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;		
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement policyNoLabel;

	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement insuredInterestTab;	
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement insuredInterestTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement insuredInterestTabTitle;	
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement	specialConditionsTextArea;
	private PageElement	pOLICYTYPEFORCPDropDownList;
	private PageElement	specialExclusionsTextArea;
	private PageElement	warrantiesTextArea;
	private PageElement	previousPolicyNumberTextFeild;
	private PageElement additionalDetailsTextArea;
	private PageElement policyTypeforOffshoreEnergyDropDownList;
	
	public PolicyAttributePolicyDeatilsMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
		//*************AB(CHINTAN)*********************
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTitle = new PageElement(By.linkText("Detail"), " InsuredInterestTitle ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		policyTypeforOffshoreEnergyDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Policy Type for Offshore Energy Policy')]/following::select"), "POLICY TYPE FOR CP", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Condition')]/following::textarea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pOLICYTYPEFORCPDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'POLICY TYPE FOR CP')]/following::select"), "POLICY TYPE FOR CP", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialExclusionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Exclusions')]/following::textarea"), "Special Exclusions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		warrantiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Warranties')]/following::textarea"), "Warranties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDetailsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Additional Details')]/following::textarea"), "Additional Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyAttributeEngineeringDetails(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity, CustomAssert assertReference) throws InterruptedException{

		if(polAttrPolDeatilsMHEntity.getAction().equalsIgnoreCase("add") || polAttrPolDeatilsMHEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPOLICYTYPEFORCP")) {
				selectValueFromList(pOLICYTYPEFORCPDropDownList, polAttrPolDeatilsMHEntity.getStringValueForField("POLICYTYPEFORCP"));
			}		
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polAttrPolDeatilsMHEntity.getStringValueForField("SpecialConditions"));
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				clearAndSendKeys(specialExclusionsTextArea, polAttrPolDeatilsMHEntity.getStringValueForField("SpecialExclusions"));
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigWarranties")) {
				clearAndSendKeys(warrantiesTextArea, polAttrPolDeatilsMHEntity.getStringValueForField("Warranties"));
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextFeild, polAttrPolDeatilsMHEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigAdditionalDetails")) {
				clearAndSendKeys(additionalDetailsTextArea, polAttrPolDeatilsMHEntity.getStringValueForField("AdditionalDetails"));
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPolicyTypeforOffshoreEnergyPolicy")) {
				selectValueFromList(policyTypeforOffshoreEnergyDropDownList, polAttrPolDeatilsMHEntity.getStringValueForField("PolicyTypeforOffshoreEnergyPolicy"));
			}	
		}

		else if(polAttrPolDeatilsMHEntity.getAction().equalsIgnoreCase("verify")){	     
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}

			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPOLICYTYPEFORCP")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("POLICYTYPEFORCP"), fetchValueFromList(pOLICYTYPEFORCPDropDownList), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigWarranties")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("Warranties"), fetchValueFromTextFields(warrantiesTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("SpecialExclusions"), fetchValueFromTextFields(specialExclusionsTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberTextFeild), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigAdditionalDetails")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("AdditionalDetails"), fetchValueFromTextFields(additionalDetailsTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPolicyTypeforOffshoreEnergyPolicy")) {
				assertReference.assertEquals(polAttrPolDeatilsMHEntity.getStringValueForField("PolicyTypeforOffshoreEnergyPolicy"), fetchValueFromList(policyTypeforOffshoreEnergyDropDownList), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity){
		if (polAttrPolDeatilsMHEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitPolicyAttributeEngineeringDetails(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrPolDeatilsMHEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeEngineeringDetails(polAttrPolDeatilsMHEntity, assertReference);
			clickNextButtonPolicyAttribute(polAttrPolDeatilsMHEntity);
			navigateToPolicy(polAttrPolDeatilsMHEntity);
			navigateToAttribute(polAttrPolDeatilsMHEntity);
			navigateToInsuredInterest(polAttrPolDeatilsMHEntity);
			navigateToCoverage(polAttrPolDeatilsMHEntity);
			navigateToLoan(polAttrPolDeatilsMHEntity);
			navigateToClientDetails(polAttrPolDeatilsMHEntity);
			navigateToRelation(polAttrPolDeatilsMHEntity);
			navigateToPayment(polAttrPolDeatilsMHEntity);
			navigateToFollowup(polAttrPolDeatilsMHEntity);
			navigateToDocument(polAttrPolDeatilsMHEntity);

		}

	}
}


