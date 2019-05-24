package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PmlDetailsEntity;
import com.aqm.staf.library.databin.PolicyBreakInInsuranceEntity;
import com.aqm.staf.library.databin.RiskFinanceDFireEntity;

public class PmlDetails extends BasePage {
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement newLimitOfLiabilityAggregateTextField;
	private PageElement	newLimitOfLiabilityPerEventTextField;
	private PageElement forwardButton;
	private PageElement backButton;
	private	PageElement nextPageTitle;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement insureAttachCoverageTab;

	
	public PmlDetails(WebDriver driver, String pageName){
		super(driver, pageName);

		indemnityPeriodInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period (in Months)')]/following::input"), "Indemnity Period In Months", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newLimitOfLiabilityAggregateTextField=new PageElement(By.xpath("//td//div[contains(text(),'New Limit of Liability (aggregate)')]/following::input"), "New Limit Of Liability Aggregate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newLimitOfLiabilityPerEventTextField=new PageElement(By.xpath("//td//div[contains(text(),'New Limit of Liability (per event)')]/following::input"), "New Limit Of Liability Per Event", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	}
	public void fillPolicyAttributePmlDetails(PmlDetailsEntity pmlDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(pmlDetailsEntity.getAction().equalsIgnoreCase("add") || pmlDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (pmlDetailsEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, pmlDetailsEntity.getStringValueForField("IndemnityPeriodInMonths"));

			}
			if (pmlDetailsEntity.getBooleanValueForField("ConfigNewLimitOfLiabilityAggregate")) {
				clearAndSendKeys(newLimitOfLiabilityAggregateTextField, pmlDetailsEntity.getStringValueForField("NewLimitOfLiabilityAggregate"));

			}
			if (pmlDetailsEntity.getBooleanValueForField("ConfigNewLimitOfLiabilityPerEvent")) {
				clearAndSendKeys(newLimitOfLiabilityPerEventTextField, pmlDetailsEntity.getStringValueForField("NewLimitOfLiabilityPerEvent"));

			}
		}
		else if(pmlDetailsEntity.getAction().equalsIgnoreCase("verify")){
			
			if (pmlDetailsEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(pmlDetailsEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (pmlDetailsEntity.getBooleanValueForField("ConfigNewLimitOfLiabilityAggregate")) {
				assertReference.assertEquals(pmlDetailsEntity.getStringValueForField("NewLimitOfLiabilityAggregate"), fetchValueFromTextFields(newLimitOfLiabilityAggregateTextField), AssertionType.WARNING);
			}
			if (pmlDetailsEntity.getBooleanValueForField("ConfigNewLimitOfLiabilityPerEvent")) {
				assertReference.assertEquals(pmlDetailsEntity.getStringValueForField("NewLimitOfLiabilityPerEvent"), fetchValueFromTextFields(newLimitOfLiabilityPerEventTextField), AssertionType.WARNING);
			}
	}
		
		
	}
	public void clickNextButtonPolicyAttribute(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+pmlDetailsEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	
	public void navigateTobackAttributePage(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			
		}
	}
	public void navigateToPolicy(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
			
		}
	}
	public void navigateToInsureAttachCoverageTab(PmlDetailsEntity pmlDetailsEntity){
		if (pmlDetailsEntity.getBooleanValueForField("ConfigAttachCoverageTab")){		
			click(insureAttachCoverageTab);
			switchToFrame("display");
			
		}
	}

	public void fillandSubmitPolicyAttributePmlDetails(PmlDetailsEntity pmlDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(pmlDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePmlDetails(pmlDetailsEntity, assertReference);
			clickNextButtonPolicyAttribute(pmlDetailsEntity);
			navigateTobackAttributePage(pmlDetailsEntity);
			navigateToPolicy(pmlDetailsEntity);
			navigateToAttribute(pmlDetailsEntity);
			navigateToMember(pmlDetailsEntity);
			navigateToCoverage(pmlDetailsEntity);
			navigateToLoan(pmlDetailsEntity);
			navigateToClientDetails(pmlDetailsEntity);
			navigateToRelation(pmlDetailsEntity);
			navigateToPayment(pmlDetailsEntity);
			navigateToFollowup(pmlDetailsEntity);
			navigateToDocument(pmlDetailsEntity);
			navigateToInsureAttachCoverageTab(pmlDetailsEntity);
 }
 }
 }