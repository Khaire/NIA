package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrPolicyHistoryPAEntity;
import com.aqm.staf.library.databin.PolAttrPolicyHistoryPAEntity;

public class PolicyAttributePolicyHistoryforPAPersonalAccident extends BasePage{

	private PageElement policyHistoryforPATitle;

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

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;

	private PageElement typeOfPolicyDropdown;

	private PageElement typeOfDevelopmentOfficerTitle;
	private PageElement policyDetailsPXTitle;
	private PageElement policyAttributesTitle;

	public PolicyAttributePolicyHistoryforPAPersonalAccident(WebDriver driver, String pageName ){
		super(driver,pageName);

		policyHistoryforPATitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy History for PA')]"), "Policy History for PA Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Titile", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfPolicyDropdown= new PageElement(By.xpath("//tr//td//div[@id='Type of policy']/following::select[1]"), "Type of policy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		typeOfDevelopmentOfficerTitle= new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]"), "Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDetailsPXTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy DetailsPX')]"), "Policy DetailsPX Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);




	}

	public void fillPolicyAttributePolicyHistoryforPAPersonalAccident(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity, CustomAssert assertReference){
		if((polAttrPolicyHistoryPAEntity.getAction().equalsIgnoreCase("add") || polAttrPolicyHistoryPAEntity.getAction().equalsIgnoreCase("edit"))){

			if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigtypeOfPolicyDropdown")) {
				selectValueFromList(typeOfPolicyDropdown, polAttrPolicyHistoryPAEntity.getStringValueForField("TypeOfPolicyDropdown"));
			}
			else if(polAttrPolicyHistoryPAEntity.getAction().equalsIgnoreCase("verify")){

				if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polAttrPolicyHistoryPAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polAttrPolicyHistoryPAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
				}
				if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigPolicyHolder")) {
					assertReference.assertEquals(polAttrPolicyHistoryPAEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(polAttrPolicyHistoryPAEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
				}
				//
				if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigtypeOfPolicyDropdown")) {
					assertReference.assertEquals(polAttrPolicyHistoryPAEntity.getStringValueForField("TypeOfPolicyDropdown"), fetchValueFromTextFields(typeOfPolicyDropdown), AssertionType.WARNING);
				}
			}
		}

	}

	public void navigateToPolicy(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void navigateToForwardPolicyInsuredInterestAttribute(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(typeOfDevelopmentOfficerTitle);
		}
	}

	public void navigateToBackwardPolicyInsuredInterestAttribute(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigBackwardButton")){		
			click(backwardButton);
			switchToFrame("display");
			isElementDisplayed(policyDetailsPXTitle);
		}
	}


	public void navigateToBackPolicyInsuredInterestAttribute(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity){
		if (polAttrPolicyHistoryPAEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void fillandSubmitPolicyAttributePersonalAccident(PolAttrPolicyHistoryPAEntity polAttrPolicyHistoryPAEntity, CustomAssert assertReference) {
		if(isConfigTrue(polAttrPolicyHistoryPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePolicyHistoryforPAPersonalAccident(polAttrPolicyHistoryPAEntity, assertReference);
			navigateToForwardPolicyInsuredInterestAttribute(polAttrPolicyHistoryPAEntity);
			navigateToBackwardPolicyInsuredInterestAttribute(polAttrPolicyHistoryPAEntity);
			navigateToBackPolicyInsuredInterestAttribute(polAttrPolicyHistoryPAEntity);
			navigateToPolicy(polAttrPolicyHistoryPAEntity);
			navigateToAttribute(polAttrPolicyHistoryPAEntity);
			navigateToInsuredInterest(polAttrPolicyHistoryPAEntity);
			navigateToCoverage(polAttrPolicyHistoryPAEntity);
			navigateToLoan(polAttrPolicyHistoryPAEntity);
			navigateToClientDetails(polAttrPolicyHistoryPAEntity);
			navigateToRelation(polAttrPolicyHistoryPAEntity);
			navigateToPayment(polAttrPolicyHistoryPAEntity);
			navigateToFollowup(polAttrPolicyHistoryPAEntity);
			navigateToDocument(polAttrPolicyHistoryPAEntity);

		}
	}
}
