package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberCoverageDEntity;

public class PolicyPolicyMemberAttachCoverageDeatils extends BasePage {

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	//	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement memberDetailSubLink;
	private PageElement memberAttributesSubLink;
	private PageElement memberAttachCoveragesSubLink;
	private PageElement memberRelationsSubLink;
	private PageElement memberPaymentsSubLink;
	private PageElement memberFundSubLink;

	private PageElement attchCoverageDetailsLink;
	private PageElement attchCoverageAttributeLink;
	private PageElement attchCoveragePremiumlink;
	private PageElement memberCoverCodeTextField;
	private PageElement memberCoverNameTextField;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement memberDetailSubLinkTitle;
	private PageElement memberAttributesSubLinkTitle;
	private PageElement memberAttachCoveragesSubLinkTitle;
	private PageElement memberRelationsSubLinkTitle;
	private PageElement memberPaymentsSubLinkTitle;
	//private PageElement memberFundSubLinkTitle;

	private PageElement attchCoverageDetailsLinkTitle;
	private PageElement attchCoverageAttributeLinkTitle;
	private PageElement attchCoveragePremiumlinkTitle;

	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement memberLimitsOfLiablityLabel;
	private PageElement calculatedPremiumRateTextField;	
	private PageElement manualPremiumRateTextField;	
	private PageElement calculatedGrossPremiumTextField;	
	private PageElement manualGrossPremiumTextField;	
	private PageElement calculatedLoadingTextField;	
	private PageElement manualLoadingTextField;	
	private PageElement calculatedDiscountTextField;	
	private PageElement manualDiscountTextField;	
	private PageElement calculatedNetGrossPremiumTextField;	
	private PageElement manualNetGrossPremiumTextField;	
	private PageElement memberCoverageInceptionDateTextField;
	private PageElement memberCoverageExpirationDateTextField;
	private PageElement attchCoveragePremiumlinkforPU;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement attchCoverageAttributeLinkforCP;
	private PageElement attachCoveragesPremiumForAH;
	private PageElement attachCoveragesPremiumPageTitle;
	private PageElement attchCoverageMotorPremiumlink;
	//ADD BY ANZAF FOR MARINE HULL VI
	private PageElement  attchCoveragePremiumlinkforVI;
	private PageElement  attchCoveragePremiumlinkForAHVerify;
	private PageElement  attachCoveragesPremiumForMiscNonLiability;


	public PolicyPolicyMemberAttachCoverageDeatils(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailSubLink = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesSubLink = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesSubLink = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsSubLink = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsSubLink = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundSubLink = new PageElement(By.linkText("Fund"), " Member Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
//mohammad
		attchCoverageDetailsLink = new PageElement(By.xpath("//tr[1]//td//div//b[contains(text(),'Details')]"), "member Details Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoverageAttributeLink= new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "member Attribute Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlink = new PageElement(By.xpath("//div//b[contains(text(),'Premium')]"), "member Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlinkforPU = new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), "member Premium link for PU", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoverageAttributeLinkforCP= new PageElement(By.xpath("//table[3]//tbody//tr//td[2]//div//b[contains(text(),'Attributes')]"), "member Attribute Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlinkforVI=new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), "member Attribute Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		memberDetailSubLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesSubLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Member Attribute')]"), "Member Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesSubLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), " Insured Interest Coverage Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsSubLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Member Relations Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsSubLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	memberFundSubLinkTitle= new PageElement(By.xpath(""), " Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//if 	Risk Schedule not applicable for this product then fund link is open
		attchCoverageDetailsLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attchCoverageAttributeLinkTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), " Member AttributesTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'Premium')]"), "Premium Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "No."))," Policy  Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Code"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Serial")),"Member Serial Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberLimitsOfLiablityLabel= new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Member Limits of Liablity"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCoverCodeTextField= new PageElement(By.name("pCoverCode"),"member CoverCode TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCoverNameTextField= new PageElement(By.name("pCoverName"),"member CoverName TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedPremiumRateTextField= new PageElement(By.name("pPremiumRateCalculated"),"Calculated Premium Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualPremiumRateTextField= new PageElement(By.name("pPremiumRateManual"),"Manual Premium Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedGrossPremiumTextField= new PageElement(By.name("pGrossPremiumCalculated"),"Gross Premium Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualGrossPremiumTextField= new PageElement(By.name("pGrossPremiumManual"),"Manual Gross Premium Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		calculatedLoadingTextField= new PageElement(By.name("pLoadingCalculated"),"Calculated Loading Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualLoadingTextField= new PageElement(By.name("pLoadingManual"),"Manual Loading Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedDiscountTextField= new PageElement(By.name("pDiscountCalculated")," Premium Discount Calculation Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualDiscountTextField= new PageElement(By.name("pDiscountManual"),"Manual Discount Calculation Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		calculatedNetGrossPremiumTextField= new PageElement(By.name("pNetPremiumCalculated"),"Calculated Net Gross Premium Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manualNetGrossPremiumTextField= new PageElement(By.name("pNetPremiumManual"),"Calculated Net Gross Premium Manual Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCoverageInceptionDateTextField= new PageElement(By.name("pRiskCoverInceptionDate"),"Member Coverage Inception Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCoverageExpirationDateTextField= new PageElement(By.name("pRiskCoverExpiryDate"),"Member Coverage Expiry Date Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		backButton	= new PageElement(By.name("Back"),"Go To Previous Page (Back Button) Textfield", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumForAH=new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoverageMotorPremiumlink=new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//attchCoveragePremiumlink = new PageElement(By.xpath("//div[contains(text(),'Premium')]"), "member Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attchCoveragePremiumlinkForAHVerify=new PageElement(By.xpath("//div/a[@title='Premium']"), " Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumForMiscNonLiability= new PageElement(By.xpath("//b[contains(text(),'Premium')]"), "member Premium link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillEventAttribute(PolicyMemberCoverageDEntity policyMemberCoverageDEntity, CustomAssert assertReference){

		if(policyMemberCoverageDEntity.getAction().equalsIgnoreCase("verify")){
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("MemberSerialNo"), fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberLimitsofLiablity")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("MemberLimitsofLiablity"), fetchValueFromTextFields(memberLimitsOfLiablityLabel), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCoverCode")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CoverCode"), fetchValueFromTextFields(memberCoverCodeTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCoverName")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CoverName"), fetchValueFromTextFields(memberCoverNameTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCalculatedPremiumRate")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CalculatedPremiumRate"), fetchValueFromTextFields(calculatedPremiumRateTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigManualPremiumRate")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ManualPremiumRate"), fetchValueFromTextFields(manualPremiumRateTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCalculatedGrossPremium")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CalculatedGrossPremium"), fetchValueFromTextFields(calculatedGrossPremiumTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigManualGrossPremium")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ManualGrossPremium"), fetchValueFromTextFields(manualGrossPremiumTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCalculatedLoading")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CalculatedLoading"), fetchValueFromTextFields(calculatedLoadingTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigManualLoading")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ManualLoading"), fetchValueFromTextFields(manualLoadingTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCalculatedDiscount")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CalculatedDiscount"), fetchValueFromTextFields(calculatedDiscountTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigManualDiscount")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ManualDiscount"), fetchValueFromTextFields(manualDiscountTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCalculatedNetGrossPremium")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("CalculatedNetGrossPremium"), fetchValueFromTextFields(calculatedNetGrossPremiumTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigManualNetGrossPremium")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("ManualNetGrossPremium"), fetchValueFromTextFields(manualNetGrossPremiumTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberCoverageInceptionDate")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("MemberCoverageInceptionDate"), fetchValueFromTextFields(memberCoverageInceptionDateTextField), AssertionType.WARNING);
			}
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberCoverageExpirationDate")) {
				assertReference.assertEquals(policyMemberCoverageDEntity.getStringValueForField("MemberCoverageExpirationDate"), fetchValueFromTextFields(memberCoverageExpirationDateTextField), AssertionType.WARNING);
			}
		}
		else if(policyMemberCoverageDEntity.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntity.getAction().equalsIgnoreCase("edit")){
			if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCoverCode")) {
				clearAndSendKeys(memberCoverCodeTextField,policyMemberCoverageDEntity.getStringValueForField("CoverCode") );
			}
		}
	}
	public void clickToback(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesSubLinkTitle);
		}
	}

	public void submitPolicyMemberCoverageDetails(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			attchCoverageDetailsLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("PolicyMemberCoverageDTitle")+"')]"), "Policy Member Coverage Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoverageDetailsLinkTitle);
		}
	}
	public void navigateToPolicy(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPolicyTab")){		

			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttributeTab")){		

			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToMemberDetailsSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberDetailSubLink")){		
			click(memberDetailSubLink);
			switchToFrame("display");
			isElementDisplayed(memberDetailSubLinkTitle);
		}
	}
	public void navigateToMemberAttributesSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberAttributesSubLink")){		
			click(memberAttributesSubLink);
			switchToFrame("display");
			isElementDisplayed(memberAttributesSubLinkTitle);
		}
	}
	public void navigateToMemberAttachCoveragesSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberAttachCoveragesSubLink")){		

			click(memberAttachCoveragesSubLink);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesSubLinkTitle);
		}
	}
	public void navigateToMemberRelationsSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberRelationsSubLink")){		
			click(memberRelationsSubLink);
			switchToFrame("display");
			isElementDisplayed(memberRelationsSubLinkTitle);
		}
	}
	public void navigateToMemberPaymentsSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberPaymentsSubLink")){		
			click(memberPaymentsSubLink);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsSubLinkTitle);
		}
	}
	public void navigateToMemberFundSubLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigMemberFundSubLink")){		
			click(memberFundSubLink);
			//	if(isElementDisplayed(memberFundSubLinkTitle));
		}
	}
	public void navigateToAttachCoverageDetailsLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoverageDetailsLink")){		
			click(attchCoverageDetailsLink);
			switchToFrame("display");
			isElementDisplayed(attchCoverageDetailsLinkTitle);
		}
	}
	public void navigateToAttachCoverageAttributeLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
			click(attchCoverageAttributeLink);
			switchToFrame("display");
			attchCoverageAttributeLinkTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoverageAttributeLinkTitle);
		}
	}
	
	public void navigateToAttachCoveragePremiumLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity) throws InterruptedException{
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){	
			if(!(policyMemberCoverageDEntity.getStringValueForField("Product").equalsIgnoreCase("AH"))) {
		    click(attchCoveragePremiumlink);
			}else {
				click(attchCoverageMotorPremiumlink);
			}
			switchToFrame("display");
			attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoveragePremiumlinkTitle);
		}
	
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForAHVerify")){	
			if(policyMemberCoverageDEntity.getAction().equalsIgnoreCase("Edit") && policyMemberCoverageDEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")) {
			click(attchCoveragePremiumlinkForAHVerify);
			}
		}
	}
	public void navigateToAttachCoverageMotorPremiumLink(PolicyMemberCoverageDEntity policyMemberCoverageDEntity) throws InterruptedException{
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){		
		    click(attchCoverageMotorPremiumlink);
			switchToFrame("display");
			attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoveragePremiumlinkTitle);
		}
	}
	public void navigateToAttachCoveragePremiumLinkForPU(PolicyMemberCoverageDEntity policyMemberCoverageDEntity) throws InterruptedException{
		if(!((policyMemberCoverageDEntity.getStringValueForField("Product").equalsIgnoreCase("VI")))) {
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){		
			click(attchCoveragePremiumlinkforPU);
			switchToFrame("display");
			attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoveragePremiumlinkTitle);
		}
	}
	}
	
	public void navigateToAttachCoveragePremiumLinkForVI(PolicyMemberCoverageDEntity policyMemberCoverageDEntity) throws InterruptedException{
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForVI")){		
			click(attchCoveragePremiumlinkforVI);
			switchToFrame("display");
			attchCoveragePremiumlinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoveragePremiumlinkTitle);
		}
	}
	
	
	
	
	
	
	
		
	public void navigateToAttachCoverageAttributeLinkForCP(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigAttchCoverageAttributeLinkForCP")){		
			click(attchCoverageAttributeLinkforCP);
			switchToFrame("display");
			attchCoverageAttributeLinkTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+policyMemberCoverageDEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoverageAttributeLinkTitle);
		}
	}
	
	public void navigateToPolicyAttachCoveragesPremiumForAH(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
				if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPremiumTabForAH")) {
				click(attachCoveragesPremiumForAH);
				switchToFrame("display");
				isElementDisplayed(attachCoveragesPremiumPageTitle);
				}
			}
	
	public void clickToClientDeatilTab(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigClientDetailTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
		}
	}
	public void navigateToPolicyAttachCoveragesPremiumForMiscNonLiability(PolicyMemberCoverageDEntity policyMemberCoverageDEntity){
		if (policyMemberCoverageDEntity.getBooleanValueForField("ConfigPremiumTabForMiscNonLiability")) {
		click(attachCoveragesPremiumForMiscNonLiability);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}

	public void fillandSubmitPolicyMemberAttachCovDetails(PolicyMemberCoverageDEntity policyMemberCoverageDEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyMemberCoverageDEntity.getConfigExecute())){
			fillEventAttribute(policyMemberCoverageDEntity, assertReference);
			submitPolicyMemberCoverageDetails(policyMemberCoverageDEntity);
			navigateToPolicy(policyMemberCoverageDEntity);
			navigateToAttribute(policyMemberCoverageDEntity);
			navigateToMember(policyMemberCoverageDEntity);
			navigateToCoverage(policyMemberCoverageDEntity);
			navigateToLoan(policyMemberCoverageDEntity);
			if(!((policyMemberCoverageDEntity.getStringValueForField("Product").equalsIgnoreCase("RS")))){
			navigateToClientDetails(policyMemberCoverageDEntity);
			}
			navigateToRelation(policyMemberCoverageDEntity);
			navigateToPayment(policyMemberCoverageDEntity);
			navigateToFollowup(policyMemberCoverageDEntity);
			navigateToDocument(policyMemberCoverageDEntity);
			navigateToMemberDetailsSubLink(policyMemberCoverageDEntity);
			navigateToMemberAttributesSubLink(policyMemberCoverageDEntity);
			navigateToMemberAttachCoveragesSubLink(policyMemberCoverageDEntity);
			navigateToMemberRelationsSubLink(policyMemberCoverageDEntity);
			navigateToMemberPaymentsSubLink(policyMemberCoverageDEntity);
			navigateToMemberFundSubLink(policyMemberCoverageDEntity);
			navigateToAttachCoverageDetailsLink(policyMemberCoverageDEntity);
			navigateToAttachCoverageAttributeLink(policyMemberCoverageDEntity);
			navigateToAttachCoverageMotorPremiumLink(policyMemberCoverageDEntity);
			navigateToAttachCoveragePremiumLink(policyMemberCoverageDEntity);
			navigateToAttachCoveragePremiumLinkForVI(policyMemberCoverageDEntity);
			navigateToAttachCoveragePremiumLinkForPU(policyMemberCoverageDEntity);
			navigateToAttachCoverageAttributeLinkForCP(policyMemberCoverageDEntity);
			navigateToPolicyAttachCoveragesPremiumForAH(policyMemberCoverageDEntity);
			navigateToPolicyAttachCoveragesPremiumForMiscNonLiability(policyMemberCoverageDEntity);
		}
	}
}

