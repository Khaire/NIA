package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrInsHisT5POLEntity;

public class PolicyAttributeInsuranceHistoryT5POLAviation extends BasePage{

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
	private PageElement  attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement nextAttributePageTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;

	private PageElement statusOfRiskTextFeild;
	private PageElement typeOfPolicyTextFeild;
	private PageElement previousPolicyNumberTextFeild;
	private PageElement previousPolicyPeriodTextFeild;
	private PageElement premiumPaidTextFeild;
	private PageElement totalNumberofClaimsRegisteredTextFeild;
	private PageElement claimsIncurredTextFeild;
	private PageElement remarksTextFeild;
	private PageElement claimsPaidTextFeild;
	private PageElement incurredClaimRatiopercentageTextFeild;
	private PageElement forwardButton;

	public PolicyAttributeInsuranceHistoryT5POLAviation(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","No")), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		statusOfRiskTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Status of Risk')]/following::input"), "Status of Risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPolicyTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Type of Policy')]/following::input"), " Type of Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Period')]/following::textarea"), "Previous Policy Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPaidTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Premium Paid')]/following::input"), "Premium Paid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberofClaimsRegisteredTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Total Number of Claims Registered')]/following::input"), "Total Number of Claims Registered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Claims Incurred')]/following::input"), "Claims Paid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Remarks')]/following::textarea"), "Remarks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Claims Paid')]/following::input"), " Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatiopercentageTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim Ratio (%)')]/following::input"), "Claims Paid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	public void fillPolicyAttributeInsuranceHistoryT5POLAviation(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttrInsHisT5POLEntity.getAction().equalsIgnoreCase("add") || polAttrInsHisT5POLEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigStatusOfRisk")) {
				clearAndSendKeys(statusOfRiskTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("StatusOfRisk"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				clearAndSendKeys(typeOfPolicyTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("TypeOfPolicy"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				clearAndSendKeys(previousPolicyPeriodTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("PreviousPolicyPeriod"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPremiumPaid")) {
				clearAndSendKeys(premiumPaidTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("PremiumPaid"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")) {
				clearAndSendKeys(totalNumberofClaimsRegisteredTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("TotalNumberofClaimsRegistered"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				clearAndSendKeys(claimsIncurredTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("ClaimsIncurred"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("Remarks"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				clearAndSendKeys(claimsPaidTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("ClaimsPaid"));
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigIncurredClaimRatioPercentage")) {
				clearAndSendKeys(incurredClaimRatiopercentageTextFeild, polAttrInsHisT5POLEntity.getStringValueForField("IncurredClaimRatioPercentage"));
			}
		}

		else if(polAttrInsHisT5POLEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigStatusOfRisk")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("StatusOfRisk"), fetchValueFromTextFields(statusOfRiskTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("TypeOfPolicy"), fetchValueFromTextFields(typeOfPolicyTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("PreviousPolicyPeriod"), fetchValueFromTextFields(previousPolicyPeriodTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPremiumPaid")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("PremiumPaid"), fetchValueFromTextFields(premiumPaidTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("TotalNumberofClaimsRegistered"), fetchValueFromTextFields(totalNumberofClaimsRegisteredTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimsPaidTextFeild), AssertionType.WARNING);
			}

			if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigIncurredClaimRatioPercentage")) {
				assertReference.assertEquals(polAttrInsHisT5POLEntity.getStringValueForField("IncurredClaimRatioPercentage"), fetchValueFromTextFields(incurredClaimRatiopercentageTextFeild), AssertionType.WARNING);
			}
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}
	public void navigateToPolicy(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity){
		if (polAttrInsHisT5POLEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void fillAndSubmitPolicyAttributeInsuranceHistoryT5POLAviation(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrInsHisT5POLEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeInsuranceHistoryT5POLAviation(polAttrInsHisT5POLEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polAttrInsHisT5POLEntity);
			navigateToPolicy(polAttrInsHisT5POLEntity);
			navigateToAttribute(polAttrInsHisT5POLEntity);
			navigateToInsuredInterest(polAttrInsHisT5POLEntity);
			navigateToCoverage(polAttrInsHisT5POLEntity);
			navigateToLoan(polAttrInsHisT5POLEntity);
			navigateToClientDetails(polAttrInsHisT5POLEntity);
			navigateToRelation(polAttrInsHisT5POLEntity);
			navigateToPayment(polAttrInsHisT5POLEntity);
			navigateToFollowup(polAttrInsHisT5POLEntity);
			navigateToDocument(polAttrInsHisT5POLEntity);
		}
	}
}