package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyInsrAttrBasPrem3Entity;

public class PolicyInsuredAttributesBasicPrem3 extends BasePage {

	private PageElement basicPrem2PageTitle;
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
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	// TG Base premium 3 page 
	private PageElement previousClaimExperienceTextField;
	private PageElement specialDiscountPerTextField;
	private PageElement claimExperienceUnderMaternityBenefitsForTheLastThreeYearsTextField;
	private PageElement	claimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYearTextField;
	private PageElement currentYearClaimExperienceTextField;
	private PageElement	premiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField;
	private PageElement claimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYearTextField;
	private PageElement premiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField;
	private PageElement claimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYrTextField;
	private PageElement premiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYrTextField;
	private PageElement claimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYrTextField;
	private PageElement totalPremiumTextField;
	private PageElement totalClaimRatioTextField;
	private PageElement underwritingOfficeRecommendationsTextField;
	private PageElement claimRatioPerTextField;

	private PageElement proceedButton;
	private PageElement backButton;

	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement loadingDiscountOptionPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	private PageElement btnPreviousButton;

	public PolicyInsuredAttributesBasicPrem3 (WebDriver driver, String pageName) {
		super(driver, pageName);

		basicPrem2PageTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Basic Prem')]"), "Basic Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		loadingDiscountOptionPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Loading Discount Option')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// TG Base premium 3 page Elements
		previousClaimExperienceTextField=new PageElement(By.name("propValues1"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		specialDiscountPerTextField =new PageElement(By.name("propValues2"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimExperienceUnderMaternityBenefitsForTheLastThreeYearsTextField=new PageElement(By.name("propValues3"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		claimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYearTextField=new PageElement(By.name("propValues4"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		currentYearClaimExperienceTextField=new PageElement(By.name("propValues5"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		premiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField =new PageElement(By.name("propValues6"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYearTextField =new PageElement(By.name("propValues7"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField =new PageElement(By.name("propValues8"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYrTextField =new PageElement(By.name("propValues9"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYrTextField =new PageElement(By.name("propValues10"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYrTextField =new PageElement(By.name("propValues11"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumTextField=new PageElement(By.name("propValues12"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalClaimRatioTextField =new PageElement(By.name("propValues13"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underwritingOfficeRecommendationsTextField=new PageElement(By.name("propValues14"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioPerTextField =new PageElement(By.name("propValues15"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		btnPreviousButton = new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
	public void fillPolicyInsuredAttributesBasicPrem3Page (PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem3Entity, CustomAssert assertReference)throws InterruptedException{
		if(policyInsrAttrBasPrem3Entity.getAction().equalsIgnoreCase("add") || policyInsrAttrBasPrem3Entity.getAction().equalsIgnoreCase("edit")){

			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPreviousClaimExperience")) {
				clearAndSendKeys(previousClaimExperienceTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("PreviousClaimExperience"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigSpecialDiscountPer")) {
				clearAndSendKeys(specialDiscountPerTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("SpecialDiscountPer"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimExperienceUnderMaternityBenefitsForTheLastThreeYears")) {
				clearAndSendKeys(claimExperienceUnderMaternityBenefitsForTheLastThreeYearsTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimExperienceUnderMaternityBenefitsForTheLastThreeYears"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYear")) {
				clearAndSendKeys(claimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYearTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYear"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigCurrentYearClaimExperience")) {
				clearAndSendKeys(currentYearClaimExperienceTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("CurrentYearClaimExperience"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear")) {
				clearAndSendKeys(premiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYear")) {
				clearAndSendKeys(claimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYearTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYear"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYear")) {
				clearAndSendKeys(premiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYear"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYr")) {
				clearAndSendKeys(claimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYrTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYr"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYr")) {
				clearAndSendKeys(premiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYrTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYr"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYr")) {
				clearAndSendKeys(claimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYrTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYr"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigTotalPremium")) {
				clearAndSendKeys(totalPremiumTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("TotalPremium"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigTotalClaimRatio")) {
				clearAndSendKeys(totalClaimRatioTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("TotalClaimRatio"));
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigUnderwritingOfficeRecommendations")) {
				clearAndSendKeys(underwritingOfficeRecommendationsTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("UnderwritingOfficeRecommendations"));
			}			
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioPer")) {
				clearAndSendKeys(claimRatioPerTextField, policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioPer"));
			}
		}
		else if(policyInsrAttrBasPrem3Entity.getAction().equalsIgnoreCase("verify")){

			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			// TG
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			// TG 																				
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPreviousClaimExperience")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PreviousClaimExperience"), fetchValueFromTextFields(previousClaimExperienceTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigSpecialDiscountPer")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("SpecialDiscountPer"), fetchValueFromTextFields(specialDiscountPerTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimExperienceUnderMaternityBenefitsForTheLastThreeYears")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimExperienceUnderMaternityBenefitsForTheLastThreeYears"), fetchValueFromTextFields(claimExperienceUnderMaternityBenefitsForTheLastThreeYearsTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYear")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYear"), fetchValueFromTextFields(claimExpunderHealthInsuranceforTheLast3YrsExcludingTheCurrentYearTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigCurrentYearClaimExperience")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("CurrentYearClaimExperience"), fetchValueFromTextFields(currentYearClaimExperienceTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear"), fetchValueFromTextFields(premiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYear")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYear"), fetchValueFromTextFields(claimRatioForFireBusinessForTheLast3YearsExcludingTheCurrentYearTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYear")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYear"), fetchValueFromTextFields(premiumForMarineBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYr")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYr"), fetchValueFromTextFields(claimRatioForMarineBusinessForTheLast3YearsExcludingTheCurrentYrTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYr")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYr"), fetchValueFromTextFields(premiumForMiscOtherThanHealthBusinessForLastYrsExcludingCurrentYrTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigClaimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYr")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("ClaimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYr"), fetchValueFromTextFields(claimRatioForMiscOtherThanHealthBusinessForLastYrsExcludingCurrYrTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigPremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("PremiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYear"), fetchValueFromTextFields(premiumForFireBusinessForTheLastThreeYearsExcludingTheCurrentYearTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigTotalClaimRatio")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("TotalClaimRatio"), fetchValueFromTextFields(totalClaimRatioTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem3Entity.getBooleanValueForField("ConfigUnderwritingOfficeRecommendations")) {
				assertReference.assertEquals(policyInsrAttrBasPrem3Entity.getStringValueForField("UnderwritingOfficeRecommendations"), fetchValueFromTextFields(underwritingOfficeRecommendationsTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicyTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyInsuredAttributesBasicPrem3Page(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(loadingDiscountOptionPageTitle);
		}
	}
	public void backButtonPolicyInsuredAttributesBasicPrem3Page(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolicyInsuredAttributesBasicPrem3Page(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem3Entity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyInsrAttrBasPrem3Entity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredAttributesBasicPrem3Page(policyInsrAttrBasPrem3Entity, assertReference);
			proceedButtonPolicyInsuredAttributesBasicPrem3Page(policyInsrAttrBasPrem3Entity);
			navigateToPolicyTab(policyInsrAttrBasPrem3Entity);
			navigateToAttributeTab(policyInsrAttrBasPrem3Entity);
			navigateToMemberTab(policyInsrAttrBasPrem3Entity);
			navigateToCoverageTab(policyInsrAttrBasPrem3Entity);
			navigateToClientDetailTab(policyInsrAttrBasPrem3Entity);
			navigateToRelationsTab(policyInsrAttrBasPrem3Entity);
			navigateToPaymentsTab(policyInsrAttrBasPrem3Entity);
			navigateToFollowupTab(policyInsrAttrBasPrem3Entity);
			navigateToDocumentTab(policyInsrAttrBasPrem3Entity);
			navigateToPolicyMemberDetails(policyInsrAttrBasPrem3Entity);
			navigateToPolicyMemberAttributes(policyInsrAttrBasPrem3Entity);
			navigateToPolicyMemberAttachCoverages(policyInsrAttrBasPrem3Entity);
			navigateToPolicyMemberRelations(policyInsrAttrBasPrem3Entity);
			navigateToPolicyMemberPayments(policyInsrAttrBasPrem3Entity);
		}
	}

}
