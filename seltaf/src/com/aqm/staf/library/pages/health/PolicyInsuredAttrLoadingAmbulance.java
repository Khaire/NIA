package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsLoadAmbulanceEntity;

public class PolicyInsuredAttrLoadingAmbulance extends BasePage {

	private PageElement loadingAmbulancePageTitle;
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

	// TG PolicyInsured Attribute Loading Ambulance Elements

	private PageElement ambulanceChargeDropDown;
	private PageElement rateForAmbulanceChargeTextField;
	private PageElement sIForAmbulanceChargeTextField;
	private PageElement	loadingForAmbulanceChargeTextField;
	private PageElement loadingDiscountOptionDetailPageTitle;
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
	private PageElement tailorPremiumDetailsPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;


	public PolicyInsuredAttrLoadingAmbulance (WebDriver driver, String pageName) {
		super(driver, pageName);

		loadingAmbulancePageTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Loading Ambulance')]"), "Basic Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		tailorPremiumDetailsPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Tailor Premium Details')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// TG Base premium 3 page Elements
		ambulanceChargeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Ambulance Charge","select")), "Ambulance Charge DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		rateForAmbulanceChargeTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Ambulance Charge","input")), "Rate for Ambulance Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sIForAmbulanceChargeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Ambulance Charge","input")), "SI for Ambulance Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		loadingForAmbulanceChargeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading for Ambulance Charge","input")), "Loading for Ambulance Charge TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		loadingDiscountOptionDetailPageTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Loading Discount Option')]"), "Loading Discount Option Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyInsuredAttrLoadingAmbulance (PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity, CustomAssert assertReference)throws InterruptedException{
		if(polInsAttrLoadAmbulanceEntity.getAction().equalsIgnoreCase("add") || polInsAttrLoadAmbulanceEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigAmbulanceCharge")) {
				selectValueFromList(ambulanceChargeDropDown, polInsAttrLoadAmbulanceEntity.getStringValueForField("AmbulanceCharge"));
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigRateForAmbulanceCharge")) {
				clearAndSendKeys(rateForAmbulanceChargeTextField, polInsAttrLoadAmbulanceEntity.getStringValueForField("RateForAmbulanceCharge"));
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigSIforAmbulanceCharge")) {
				clearAndSendKeys(sIForAmbulanceChargeTextField, polInsAttrLoadAmbulanceEntity.getStringValueForField("SIforAmbulanceCharge"));
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigLoadingForAmbulanceCharge")) {
				clearAndSendKeys(loadingForAmbulanceChargeTextField, polInsAttrLoadAmbulanceEntity.getStringValueForField("LoadingForAmbulanceCharge"));
			}
		}
		else if(polInsAttrLoadAmbulanceEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			//
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigAmbulanceCharge")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("AmbulanceCharge"), fetchValueFromTextFields(ambulanceChargeDropDown), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigRateForAmbulanceCharge")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("RateForAmbulanceCharge"), fetchValueFromTextFields(rateForAmbulanceChargeTextField), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigSIforAmbulanceCharge")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("SIforAmbulanceCharge"), fetchValueFromTextFields(sIForAmbulanceChargeTextField), AssertionType.WARNING);
			}
			if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigLoadingForAmbulanceCharge")) {
				assertReference.assertEquals(polInsAttrLoadAmbulanceEntity.getStringValueForField("LoadingForAmbulanceCharge"), fetchValueFromTextFields(loadingForAmbulanceChargeTextField), AssertionType.WARNING);
			}	
		}
	}
	public void navigateToPolicyTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyInsuredAttrLoadingAmbulance(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(tailorPremiumDetailsPageTitle);
		}
	}
	public void backButtonPolicyInsuredAttrLoadingAmbulance(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(loadingDiscountOptionDetailPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity){
		if (polInsAttrLoadAmbulanceEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolicyInsuredAttrLoadingAmbulance(PolInsLoadAmbulanceEntity polInsAttrLoadAmbulanceEntity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(polInsAttrLoadAmbulanceEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredAttrLoadingAmbulance(polInsAttrLoadAmbulanceEntity, assertReference);
			proceedButtonPolicyInsuredAttrLoadingAmbulance(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyTab(polInsAttrLoadAmbulanceEntity);
			navigateToAttributeTab(polInsAttrLoadAmbulanceEntity);
			navigateToMemberTab(polInsAttrLoadAmbulanceEntity);
			navigateToCoverageTab(polInsAttrLoadAmbulanceEntity);
			navigateToClientDetailTab(polInsAttrLoadAmbulanceEntity);
			navigateToRelationsTab(polInsAttrLoadAmbulanceEntity);
			navigateToPaymentsTab(polInsAttrLoadAmbulanceEntity);
			navigateToFollowupTab(polInsAttrLoadAmbulanceEntity);
			navigateToDocumentTab(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyMemberDetails(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyMemberAttributes(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyMemberAttachCoverages(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyMemberRelations(polInsAttrLoadAmbulanceEntity);
			navigateToPolicyMemberPayments(polInsAttrLoadAmbulanceEntity);
		}
	}
}
