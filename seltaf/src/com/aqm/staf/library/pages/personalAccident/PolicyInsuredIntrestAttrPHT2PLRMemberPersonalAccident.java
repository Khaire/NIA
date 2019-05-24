package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsAttPHT1PLRMembPAEntity;
import com.aqm.staf.library.databin.PolInsAttPHT2PLRMembPAEntity;

public class PolicyInsuredIntrestAttrPHT2PLRMemberPersonalAccident extends BasePage {
	private PageElement pHT1PLRMemberTitle;
	private PageElement pHT2PLRMemberTitle;
	private PageElement breakInInsuranceTitle;
	
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

	private PageElement insuredInterestDetailsTab;	
	private PageElement insuredInterestAttributesTab;	
	private PageElement insuredInterestAttachCoveragesTab;	
	private PageElement insuredInterestRelationsTab;	
	private PageElement insuredInterestPaymentsTab;	
	private PageElement insuredInterestScheduleTab;	
	
	private PageElement insuredInterestDetailsTabTitle;	
	private PageElement insuredInterestAttributesTabTitle;	
	private PageElement insuredInterestAttachCoveragesTabTitle;	
	private PageElement insuredInterestRelationsTabTitle;	
	private PageElement insuredInterestPaymentsTabTitle;	
	private PageElement insuredInterestScheduleTabTitle;
	
	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement insuredInterestSerialNoLable;

	private PageElement pA_SumInsuredTextField;
	
	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;

	
	public PolicyInsuredIntrestAttrPHT2PLRMemberPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		pHT1PLRMemberTitle	= new PageElement(By.xpath("//div//b//font[contains(text(),'PH T1-PLR Member')]"), "PH T1-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pHT2PLRMemberTitle	= new PageElement(By.xpath("//div//b//font[contains(text(),'PH T2-PLR Member')]"), "pH T2-PLR MemberTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakInInsuranceTitle =  new PageElement(By.xpath("//div//b//font[contains(text(),'Break-in-Insurance')]"), "Break In Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		policyTab			= new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab		= new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab  = new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab				= new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab	= new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab        = new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab			= new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Quote Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestDetailsTab			= new PageElement(By.xpath("//table[2]//tbody//td//div//b[contains(text(),'Detail')]"), "Insured Interest Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab		= new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab Button ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab	= new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab			= new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab			= new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab			= new PageElement(By.xpath("//div[@title='Schedule']"), "Insured Interest Schedule Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		insuredInterestDetailsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy/Quote Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentsTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Schedule Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLable  	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLable	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLable	 		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLable		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		pA_SumInsuredTextField  = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'PA_Sum Insured')]/following::input"), "Order Number Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		
		nextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	= new PageElement(By.name("Back"),  "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
	public void fillPHT2PLRMemberDetails(PolInsAttPHT2PLRMembPAEntity polInsAttPHT2PLRMembPAEntity, CustomAssert assertReference){
		if((polInsAttPHT2PLRMembPAEntity.getAction().equalsIgnoreCase("add") || polInsAttPHT2PLRMembPAEntity.getAction().equalsIgnoreCase("edit"))){
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
				clearAndSendKeys(pA_SumInsuredTextField, polInsAttPHT2PLRMembPAEntity.getStringValueForField("PA_SumInsured"));
			}
		}
		else if(polInsAttPHT2PLRMembPAEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigQuoteNo")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLable), AssertionType.WARNING);
			}
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigPolicyholder")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLable), AssertionType.WARNING);
			}
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLable), AssertionType.WARNING);
			}
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigStatus")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLable), AssertionType.WARNING);
			}
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigProductName")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLable), AssertionType.WARNING);
			}
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLable), AssertionType.WARNING);
			}
			
			if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
			    assertReference.assertEquals(polInsAttPHT2PLRMembPAEntity.getStringValueForField("PA_SumInsured"), fetchValueFromTextFields(pA_SumInsuredTextField), AssertionType.WARNING);
			}
		}
	}
	public void clickNextPHT2PLRMember(PolInsAttPHT2PLRMembPAEntity polInsAttPHT2PLRMembPAEntity) {
		if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			isElementDisplayed(breakInInsuranceTitle);
		}
	}
	
	public void clickPreviousPHT2PLRMember(PolInsAttPHT2PLRMembPAEntity polInsAttPHT2PLRMembPAEntity) {
		if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(pHT1PLRMemberTitle);
		}
	}
	
	public void clickBackToAttributeTab(PolInsAttPHT2PLRMembPAEntity polInsAttPHT2PLRMembPAEntity) {
		if (polInsAttPHT2PLRMembPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
	
	
	public void navigateToInsuredInterestDetailsTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
		
	public void navigateToInsuredInterestAttributesTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
	
	public void navigateToInsuredInterestAttachCoveragesTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragesTabTitle);
		}
	}
	
	public void navigateToInsuredInterestRelationsTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTabTitle);
		}
	}
	
	public void navigateToInsuredInterestPaymentsTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentsTabTitle);
		}
	}
	
	public void navigateToInsuredInterestScheduleTab(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTabTitle);
		}
	}
	////////
	public void navigateToPolicy(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity){
		if (polInsureAttRiskDetailEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	
	public void fillandSubmitPHT1PLRMember(PolInsAttPHT2PLRMembPAEntity polInsureAttRiskDetailEntity, CustomAssert assertReference) {
		if(isConfigTrue(polInsureAttRiskDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillPHT2PLRMemberDetails(polInsureAttRiskDetailEntity, assertReference);
			clickNextPHT2PLRMember(polInsureAttRiskDetailEntity);
			clickPreviousPHT2PLRMember(polInsureAttRiskDetailEntity);
			clickBackToAttributeTab(polInsureAttRiskDetailEntity);
			
			navigateToInsuredInterestDetailsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestAttributesTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestAttachCoveragesTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestRelationsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestPaymentsTab(polInsureAttRiskDetailEntity);
			navigateToInsuredInterestScheduleTab(polInsureAttRiskDetailEntity);
						
			navigateToPolicy(polInsureAttRiskDetailEntity);
			navigateToAttribute(polInsureAttRiskDetailEntity);
			navigateToInsuredInterest(polInsureAttRiskDetailEntity);
			navigateToCoverage(polInsureAttRiskDetailEntity);
			navigateToClientDetails(polInsureAttRiskDetailEntity);
			navigateToRelation(polInsureAttRiskDetailEntity);
			navigateToPayment(polInsureAttRiskDetailEntity);
			navigateToFollowup(polInsureAttRiskDetailEntity);
			navigateToDocument(polInsureAttRiskDetailEntity);
		}
	}	
	
	
	
}
