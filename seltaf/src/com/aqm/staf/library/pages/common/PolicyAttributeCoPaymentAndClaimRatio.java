package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyBreakInInsuranceEntity;
import com.aqm.staf.library.databin.PolicyCoPayClaimRatioEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;

public class PolicyAttributeCoPaymentAndClaimRatio extends BasePage {

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

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	


	private PageElement policyAttributesPageCoPaymentAndClaimRatioTitle;
	private PageElement policyAttrBreakInInsuranceTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement claimRatioTextField;
	private PageElement coPaymentTextField;
	private PageElement cumulativeBonusTextField;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;


	public PolicyAttributeCoPaymentAndClaimRatio(WebDriver driver,String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Member Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		policyAttributesPageCoPaymentAndClaimRatioTitle = new PageElement(By.xpath("//div/b[contains(text(),'Co-Payment & Claim Ratio')]"), "Policy Attributes Page CoPayment And ClaimRatio Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttrBreakInInsuranceTitle=new PageElement(By.xpath("//div/b[contains(text(),'Break-in-Insurance')]"), "Policy Attributes Break in Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Question Answers
		claimRatioTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Ratio(%)", "input")), "Enter Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coPaymentTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Payment(Excess)", "input")), "Enter Co-Payment(Excess) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cumulativeBonusTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus", "input")), "Cumulative Bonus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillPolicyAttributeCoPaymentAndClaimRatio(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity, CustomAssert assertReference){
		if(policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(policyCoPayClaimRatioEntity.getAction().equalsIgnoreCase("verify")){
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigSchemeNo")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigClaimRatio")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("ClaimRatio"),fetchValueFromTextFields(claimRatioTextField),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigCoPayment")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("CoPayment"),fetchValueFromTextFields(coPaymentTextField),AssertionType.WARNING);
				}
				if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
					assertReference.assertEquals(policyCoPayClaimRatioEntity.getStringValueForField("CumulativeBonus"),fetchValueFromTextFields(cumulativeBonusTextField),AssertionType.WARNING);
				}
				
			}
		}
	}



	public void nextButtonPolicyAttributeCoPaymentAndClaimRatio(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwordButton);
			if(policyCoPayClaimRatioEntity.getStringValueForField("Product").equalsIgnoreCase("IC") && policyCoPayClaimRatioEntity.getStepGroup().equalsIgnoreCase("Group2")) {
				driver.switchTo().alert().accept();
			}
			switchToFrame("display");
			policyAttrBreakInInsuranceTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyCoPayClaimRatioEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttrBreakInInsuranceTitle);
		}
	}

	public void navigateToPolicy(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity){
		if (policyCoPayClaimRatioEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyAttributeCoPaymentAndClaimRatio(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntity, CustomAssert assertReference){
		if(isConfigTrue(policyCoPayClaimRatioEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeCoPaymentAndClaimRatio(policyCoPayClaimRatioEntity, assertReference);
			nextButtonPolicyAttributeCoPaymentAndClaimRatio(policyCoPayClaimRatioEntity);
			navigateToPolicy(policyCoPayClaimRatioEntity);
			navigateToAttribute(policyCoPayClaimRatioEntity);
			navigateToMember(policyCoPayClaimRatioEntity);
			navigateToCoverage(policyCoPayClaimRatioEntity);
			navigateToLoan(policyCoPayClaimRatioEntity);
			navigateToClientDetails(policyCoPayClaimRatioEntity);
			navigateToRelation(policyCoPayClaimRatioEntity);
			navigateToPayment(policyCoPayClaimRatioEntity);
			navigateToFollowup(policyCoPayClaimRatioEntity);
			navigateToDocument(policyCoPayClaimRatioEntity);
		}

	}

}
