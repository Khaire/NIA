package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CapitalAdditionDetailsEntity;


public class CapitalAdditionDetails extends BasePage {
	
	private PageElement limitOfCapitalAdditionDropDown;
	private PageElement limitOfCapitalAdditionPercentageTextField;
	private PageElement isMBCoverRequiredDropDowm;
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
	
	public CapitalAdditionDetails (WebDriver driver, String pageName){
		super(driver, pageName);
		

		limitOfCapitalAdditionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit of Capital Addition is based on')]/following::select"), "Limit of Capital Addition is based on", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitOfCapitalAdditionPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit of Capital Addition  Percentage Based')]/following::input"), "Limit of Capital Addition Percentage Based", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isMBCoverRequiredDropDowm=new PageElement(By.xpath("//td//div[contains(text(),'Is MB cover required')]/following::select"), "Is MB cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
	
	
	public void fillPolicyAttributeCapitalAdditionDetails(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(capitalAdditionDetailsEntity.getAction().equalsIgnoreCase("add") || capitalAdditionDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigLimitOfCapitalAddition")) {
				selectValueFromList(limitOfCapitalAdditionDropDown, capitalAdditionDetailsEntity.getStringValueForField("LimitOfCapitalAddition"));

			}
			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigLimitOfCapitalAdditionPercentage")) {
				clearAndSendKeys(limitOfCapitalAdditionPercentageTextField, capitalAdditionDetailsEntity.getStringValueForField("LimitOfCapitalAdditionPercentage"));

			}
			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigisMBCoverRequired")) {
				selectValueFromList(isMBCoverRequiredDropDowm, capitalAdditionDetailsEntity.getStringValueForField("isMBCoverRequired"));

			}

		}
		else if(capitalAdditionDetailsEntity.getAction().equalsIgnoreCase("verify")){

			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigLimitOfCapitalAddition")) {
				assertReference.assertEquals(capitalAdditionDetailsEntity.getStringValueForField("LimitOfCapitalAddition"), fetchValueFromList(limitOfCapitalAdditionDropDown), AssertionType.WARNING);
			}
			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigLimitOfCapitalAdditionPercentage")) {
				assertReference.assertEquals(capitalAdditionDetailsEntity.getStringValueForField("LimitOfCapitalAdditionPercentage"), fetchValueFromTextFields(limitOfCapitalAdditionPercentageTextField), AssertionType.WARNING);
			}
			if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigisMBCoverRequired")) {
				assertReference.assertEquals(capitalAdditionDetailsEntity.getStringValueForField("IsMBCoverRequired"), fetchValueFromList(isMBCoverRequiredDropDowm), AssertionType.WARNING);
			}
		}
	}
	public void clickNextButtonPolicyAttribute(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+capitalAdditionDetailsEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}

	public void navigateTobackAttributePage(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");

		}
	}
	public void navigateToPolicy(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToInsureAttachCoverageTab(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity){
		if (capitalAdditionDetailsEntity.getBooleanValueForField("ConfigAttachCoverageTab")){		
			click(insureAttachCoverageTab);
			switchToFrame("display");

		}
	}
	public void fillandSubmitfillPolicyAttributeCapitalAdditionDetails(CapitalAdditionDetailsEntity capitalAdditionDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(capitalAdditionDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeCapitalAdditionDetails(capitalAdditionDetailsEntity, assertReference);
			clickNextButtonPolicyAttribute(capitalAdditionDetailsEntity);
			navigateTobackAttributePage(capitalAdditionDetailsEntity);
			navigateTobackAttributePage(capitalAdditionDetailsEntity);
			navigateToPolicy(capitalAdditionDetailsEntity);
			navigateToAttribute(capitalAdditionDetailsEntity);
			navigateToMember(capitalAdditionDetailsEntity);
			navigateToCoverage(capitalAdditionDetailsEntity);
			navigateToLoan(capitalAdditionDetailsEntity);
			navigateToClientDetails(capitalAdditionDetailsEntity);
			navigateToRelation(capitalAdditionDetailsEntity);
			navigateToPayment(capitalAdditionDetailsEntity);
			navigateToFollowup(capitalAdditionDetailsEntity);
			navigateToDocument(capitalAdditionDetailsEntity);
			navigateToInsureAttachCoverageTab(capitalAdditionDetailsEntity);

		}
	}


}
