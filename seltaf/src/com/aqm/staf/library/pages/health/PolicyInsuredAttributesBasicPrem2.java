package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolicyInsrAttrBasPrem2Entity;

public class PolicyInsuredAttributesBasicPrem2 extends BasePage {

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
	// TG Base premium 2 page 
	private PageElement anyOtherAdditionalCoverageRecommendedDropDown;
	private PageElement additionalCoverageDetailsOpenButton;
	private PageElement totalAdditionalCoveragePremiumTextField;
	private PageElement	additionalAmbulanceChargesTextField;
	private PageElement limitPerPatientTextField;
	private PageElement	loadingPerForAmbulanceChargesTextField;

	//Additional coverage Details Page Elements
	private PageElement	serialNo;
	private PageElement	additionalcoverageDropDown;
	private PageElement limitPerFamilyPerMemberForCoverageTextField;
	private PageElement	overallPolicyLimitForCoverageTextField;
	private PageElement	additionalCoveragePremiumDropDown;
	private PageElement	rateForPremiumTextField;
	private PageElement	amountOfPremiumForAdditionalCoverageTextField;
	private PageElement	ifCoveredWithWaitingPeriodDropDown;
	private PageElement	noOfWaitingMonthsIfNotWaivedTextField;
	private PageElement otherDetailsTextField;
	private PageElement addButton;
	private PageElement saveButton;
	private PageElement closeButton;
	private PageElement deleteButton;
	//----
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
	private PageElement basicPremPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	private PageElement btnPreviousButton;

	public PolicyInsuredAttributesBasicPrem2 (WebDriver driver, String pageName) {
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
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		basicPremPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Basic Prem')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// TG Base premium 2 page Elements
		anyOtherAdditionalCoverageRecommendedDropDown=new PageElement(By.name("propValues1"), "Any other additional coverage recommended DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalCoverageDetailsOpenButton=new PageElement(By.name("propValues2"), "Additional coverage Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAdditionalCoveragePremiumTextField=new PageElement(By.name("propValues3"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalAmbulanceChargesTextField=new PageElement(By.name("propValues4"), "Additional Ambulance Charges Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerPatientTextField =new PageElement(By.name("propValues5"), "Limit per patient Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingPerForAmbulanceChargesTextField=new PageElement(By.name("propValues6"), "Loading % for Ambulance Charges Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Additional coverage Details Window
		additionalcoverageDropDown=new PageElement(By.name("propValues1"), "Any other additional coverage recommended DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		limitPerFamilyPerMemberForCoverageTextField =new PageElement(By.name("Data_232358527082010_0"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		overallPolicyLimitForCoverageTextField =new PageElement(By.name("Data_232358627082010_0"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalCoveragePremiumDropDown =new PageElement(By.name("propValues1"), "Any other additional coverage recommended DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateForPremiumTextField =new PageElement(By.name("Data_232359027082010_0"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfPremiumForAdditionalCoverageTextField=new PageElement(By.name("Data_232359127082010_0"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ifCoveredWithWaitingPeriodDropDown =new PageElement(By.name("propValues1"), "Any other additional coverage recommended DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfWaitingMonthsIfNotWaivedTextField =new PageElement(By.name("propValues3"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsTextField =new PageElement(By.name("propValues3"), "Total additional coverage premiumText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addButton=new PageElement(By.name("btnAdd"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		btnPreviousButton = new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
	public void fillPolicyInsuredAttributesBasicPrem2Page (PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity, CustomAssert assertReference)throws InterruptedException{
		if(policyInsrAttrBasPrem2Entity.getAction().equalsIgnoreCase("add") || policyInsrAttrBasPrem2Entity.getAction().equalsIgnoreCase("edit")){

			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAnyOtherAdditionalCoverageRecommended")) {
				selectValueFromList(anyOtherAdditionalCoverageRecommendedDropDown, policyInsrAttrBasPrem2Entity.getStringValueForField("AnyOtherAdditionalCoverageRecommended"));
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAdditionalCoverageDetails")) {
				fillAdditionalCoverageDetails(policyInsrAttrBasPrem2Entity);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigTotalAdditionalCoveragePremium")) {
				clearAndSendKeys(totalAdditionalCoveragePremiumTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("TotalAdditionalCoveragePremium"));
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAdditionalAmbulanceCharges")) {
				clearAndSendKeys(additionalAmbulanceChargesTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("AdditionalAmbulanceCharges"));
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigLimitPerPatient")) {
				selectValueFromList(limitPerPatientTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("LimitPerPatient"));
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigLoadingPerForAmbulanceCharges")) {
				clearAndSendKeys(loadingPerForAmbulanceChargesTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("LoadingPerForAmbulanceCharges"));
			}			
		}
		else if(policyInsrAttrBasPrem2Entity.getAction().equalsIgnoreCase("verify")){

			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			// TG
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}																			
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAnyOtherAdditionalCoverageRecommended")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("AnyOtherAdditionalCoverageRecommended"), fetchValueFromTextFields(anyOtherAdditionalCoverageRecommendedDropDown), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigTotalAdditionalCoveragePremium")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("TotalAdditionalCoveragePremium"), fetchValueFromTextFields(totalAdditionalCoveragePremiumTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAdditionalAmbulanceCharges")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("AdditionalAmbulanceCharges"), fetchValueFromTextFields(additionalAmbulanceChargesTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigLimitPerPatient")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("LimitPerPatient"), fetchValueFromTextFields(limitPerPatientTextField), AssertionType.WARNING);
			}
			if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigLoadingPerForAmbulanceCharges")) {
				assertReference.assertEquals(policyInsrAttrBasPrem2Entity.getStringValueForField("LoadingPerForAmbulanceCharges"), fetchValueFromTextFields(loadingPerForAmbulanceChargesTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicyTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void clickOnOpenButton(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity) throws InterruptedException{
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigOpenButton")){
			click(additionalCoverageDetailsOpenButton);
			switchToWindow("'Additional coverage Details' Details");
		}
	}
	public void clickOnAddButton(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity) throws InterruptedException{
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAddButton")){
			click(addButton);
			switchToFrame("display");
		}
	}
	public void clickOnCloseButton(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity) throws InterruptedException{
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigCloseButton")){
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void fillAdditionalCoverageDetails(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity) throws InterruptedException{
		clickOnOpenButton(policyInsrAttrBasPrem2Entity);
		clickOnAddButton(policyInsrAttrBasPrem2Entity);
		
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAdditionalcoverage")) {
			selectValueFromList(additionalcoverageDropDown, policyInsrAttrBasPrem2Entity.getStringValueForField("Additionalcoverage"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigLimitPerFamilyPerMemberForCoverage")) {
			clearAndSendKeys(limitPerFamilyPerMemberForCoverageTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("LimitPerFamilyPerMemberForCoverage"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigOverallPolicyLimitForCoverage")) {
			clearAndSendKeys(overallPolicyLimitForCoverageTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("OverallPolicyLimitForCoverage"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAdditionalCoveragePremium")) {
			selectValueFromList(additionalCoveragePremiumDropDown, policyInsrAttrBasPrem2Entity.getStringValueForField("AdditionalCoveragePremium"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigRateForPremium")) {
			clearAndSendKeys(rateForPremiumTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("RateForPremium"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigAmountOfPremiumForAdditionalCoverage")) {
			clearAndSendKeys(amountOfPremiumForAdditionalCoverageTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("AmountOfPremiumForAdditionalCoverage"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigIfCoveredWithWaitingPeriod")) {
			selectValueFromList(ifCoveredWithWaitingPeriodDropDown, policyInsrAttrBasPrem2Entity.getStringValueForField("IfCoveredWithWaitingPeriod"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigNoOfWaitingMonthsIfNotWaived")) {
			clearAndSendKeys(noOfWaitingMonthsIfNotWaivedTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("NoOfWaitingMonthsIfNotWaived"));
		}
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigOtherDetails")) {
			clearAndSendKeys(otherDetailsTextField, policyInsrAttrBasPrem2Entity.getStringValueForField("OtherDetails"));
		}
		clickOnCloseButton(policyInsrAttrBasPrem2Entity);
	}
	public void proceedButtonPolicyInsuredAttributesBasicPrem2Page(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			isElementDisplayed(basicPremPageTitle);
		}
	}
	public void backButtonPolicyInsuredAttributesBasicPrem2Page(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity){
		if (policyInsrAttrBasPrem2Entity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolicyInsuredAttributesBasicPrem2Page(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyInsrAttrBasPrem2Entity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredAttributesBasicPrem2Page(policyInsrAttrBasPrem2Entity, assertReference);
			proceedButtonPolicyInsuredAttributesBasicPrem2Page(policyInsrAttrBasPrem2Entity);
			navigateToPolicyTab(policyInsrAttrBasPrem2Entity);
			navigateToAttributeTab(policyInsrAttrBasPrem2Entity);
			navigateToMemberTab(policyInsrAttrBasPrem2Entity);
			navigateToCoverageTab(policyInsrAttrBasPrem2Entity);
			navigateToClientDetailTab(policyInsrAttrBasPrem2Entity);
			navigateToRelationsTab(policyInsrAttrBasPrem2Entity);
			navigateToPaymentsTab(policyInsrAttrBasPrem2Entity);
			navigateToFollowupTab(policyInsrAttrBasPrem2Entity);
			navigateToDocumentTab(policyInsrAttrBasPrem2Entity);
			navigateToPolicyMemberDetails(policyInsrAttrBasPrem2Entity);
			navigateToPolicyMemberAttributes(policyInsrAttrBasPrem2Entity);
			navigateToPolicyMemberAttachCoverages(policyInsrAttrBasPrem2Entity);
			navigateToPolicyMemberRelations(policyInsrAttrBasPrem2Entity);
			navigateToPolicyMemberPayments(policyInsrAttrBasPrem2Entity);
		}
	}
}
