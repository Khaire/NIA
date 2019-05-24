package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AttachCovAttribtCovDetEntity;
import com.aqm.staf.library.databin.PDRskDetailSecndPageMLEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovAtrEntity;

public class AttachCoverageAttributesCoverageDetailsPage extends BasePage{
		
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
	
	private PageElement insuredAttachCovDetailTab;
	private PageElement insuredAttachCovAttributesTab;
	private PageElement insuredAttachCovPremiumTab;
	
	private PageElement insuredAttachCovDetailTabTitle;
	private PageElement insuredAttachCovAttributesTabTitle;
	private PageElement insuredAttachCovPremiumTabTitle;
		
	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement covergeCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement insuredInterestSerialNoLable;
	private PageElement coverageNameLable;
	
	private PageElement nameOfCoverTextArea;
	private PageElement anyOneAccidentAOATextField;
	private PageElement aOAAOYDropDown;
	private PageElement anyOneYearAndIntheAggregateAOYTextField;
	private PageElement premiumRateTextField;
	
	private PageElement forwardBtn;
	private PageElement backBtn;
	private PageElement saveBtn;
	private PageElement nameOfAddOnCoverTextArea;
	private PageElement optionForSubLimitOfAddOnCoverDropDown;
	private PageElement subLimitAmountofAddonCoverTextField;
	private PageElement subLimitPercentageofAddonCoverTextField;
	private PageElement optionsForAddonCoverDropDown;
	private PageElement loadingAmountforAddonCoverTextField;
	private PageElement loadingpercentageforAddonCoverTextField;
	private PageElement subLimitofAddonCoverTextField;
	
	public AttachCoverageAttributesCoverageDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		//nextPageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details T1-PK')]"), "Risk Detail T1-PK Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLable  	 	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No.")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLable	= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		covergeCodeLable			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverge Code")), "Coverge Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLable	 		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLable		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageNameLable		= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Coverage Name")), "coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		nameOfCoverTextArea		= new PageElement(By.xpath("//td//div[contains(text(),'Name of Cover')]/following::textarea"), "Name Of Cover Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentAOATextField	= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)')]/following::input"), "any One Accident AOA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		aOAAOYDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY')]/following::select"), "AOA : AOY DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneYearAndIntheAggregateAOYTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)')]/following::input"), "AnyOneYearand(AOY)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumRateTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Premium rate (%)')]/following::input"), "Premium rate (%) TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//ST
		nameOfAddOnCoverTextArea = new PageElement(By.xpath("//td//div[contains(text(),'Name of Add on Cover')]/following::textarea"), "Name Of Add On Cover Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardBtn=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backBtn =new PageElement(By.name("Back"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveBtn =new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		optionForSubLimitOfAddOnCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Options for Sub Limit of Add on Cover')]/following::select"), "Options for Sub Limit of Add on Cover DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountofAddonCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount of Add on Cover')]/following::input"), "Sub Limit Amount of Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitPercentageofAddonCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Percentage of Add on Cover')]/following::input"), "Sub Limit Percentage of Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionsForAddonCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Options for Add on Cover')]/following::Select"), "Options for Add on Cover DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountforAddonCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount  for Add on Cover')]/following::input"), "Loading Amount  for Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingpercentageforAddonCoverTextField = new PageElement(By.xpath("//td//div[contains(text(),'Loading(%) for Add on Cover')]/following::input"), "Loading Percentage  for Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitofAddonCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Add on Cover')]/following::input"), "Sub Limit of Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	
	public void fillAttachCovAttributesCoverageDetailsPage(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity, CustomAssert assertReference) throws InterruptedException{
		if(attachCovAttribtCovDetEntity.getAction().equalsIgnoreCase("add") || attachCovAttribtCovDetEntity.getAction().equalsIgnoreCase("edit")){
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigNameOfCover")) {
				clearAndSendKeys(nameOfCoverTextArea, attachCovAttribtCovDetEntity.getStringValueForField("NameOfCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				clearAndSendKeys(anyOneAccidentAOATextField, attachCovAttribtCovDetEntity.getStringValueForField("AnyOneAccidentAOA"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAOAAOY")) {
				selectValueFromList(aOAAOYDropDown, attachCovAttribtCovDetEntity.getStringValueForField("AOAAOY"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAnyOneYearandintheAggregateAOY")) {
				clearAndSendKeys(anyOneYearAndIntheAggregateAOYTextField, attachCovAttribtCovDetEntity.getStringValueForField("AnyOneYearandintheAggregateAOY"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, attachCovAttribtCovDetEntity.getStringValueForField("PremiumRate"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigNameOfAddOnCover")) {
				clearAndSendKeys(nameOfAddOnCoverTextArea, attachCovAttribtCovDetEntity.getStringValueForField("NameOfAddOnCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigOptionsforSubLimitofAddonCover")) {
				selectValueFromList(optionForSubLimitOfAddOnCoverDropDown, attachCovAttribtCovDetEntity.getStringValueForField("OptionsforSubLimitofAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitAmountofAddonCover")) {
				clearAndSendKeys(subLimitAmountofAddonCoverTextField, attachCovAttribtCovDetEntity.getStringValueForField("SubLimitAmountofAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitPercentageofAddonCover")) {
				clearAndSendKeys(subLimitPercentageofAddonCoverTextField, attachCovAttribtCovDetEntity.getStringValueForField("SubLimitPercentageofAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigOptionsForAddonCover")) {
				selectValueFromList(optionsForAddonCoverDropDown, attachCovAttribtCovDetEntity.getStringValueForField("OptionsForAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigLoadingAmountforAddonCover")) {
				clearAndSendKeys(loadingAmountforAddonCoverTextField, attachCovAttribtCovDetEntity.getStringValueForField("LoadingAmountforAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigLoadingPercentageforAddonCover")) {
				clearAndSendKeys(loadingpercentageforAddonCoverTextField, attachCovAttribtCovDetEntity.getStringValueForField("LoadingPercentageforAddonCover"));
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitofAddonCover")) {
				clearAndSendKeys(subLimitofAddonCoverTextField, attachCovAttribtCovDetEntity.getStringValueForField("SubLimitofAddonCover"));
			}
		}
		else if(attachCovAttribtCovDetEntity.getAction().equalsIgnoreCase("verify")){
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigCovergeCode")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("CovergeCode"), fetchValueFromTextFields(covergeCodeLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLable), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigCoverageName")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("CoverageName"), fetchValueFromTextFields(coverageNameLable), AssertionType.WARNING);
			}
			
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAnyOneYearandintheAggregateAOY")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("AnyOneYearandintheAggregateAOY"), fetchValueFromTextFields(nameOfCoverTextArea), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("AnyOneAccidentAOA"), fetchValueFromTextFields(anyOneAccidentAOATextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAOAAOY")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("AOAAOY"), fetchValueFromList(aOAAOYDropDown), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAnyOneYearandIntheAggregateAOY")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("AnyOneYearandIntheAggregateAOY"), fetchValueFromTextFields(anyOneYearAndIntheAggregateAOYTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigNameOfAddOnCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("NameOfAddOnCover"), fetchValueFromTextFields(nameOfAddOnCoverTextArea), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigOptionsforSubLimitofAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("OptionsforSubLimitofAddonCover"), fetchValueFromTextFields(optionForSubLimitOfAddOnCoverDropDown), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitAmountofAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("SubLimitAmountofAddonCover"), fetchValueFromTextFields(subLimitAmountofAddonCoverTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitPercentageofAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("SubLimitPercentageofAddonCover"), fetchValueFromTextFields(subLimitPercentageofAddonCoverTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigOptionsForAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("OptionsforAddonCover"), fetchValueFromTextFields(optionsForAddonCoverDropDown), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigLoadingAmountforAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("LoadingAmountforAddonCover"), fetchValueFromTextFields(loadingAmountforAddonCoverTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigLoadingPercentageforAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("LoadingPercentageforAddonCover"), fetchValueFromTextFields(loadingpercentageforAddonCoverTextField), AssertionType.WARNING);
			}
			if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSubLimitofAddonCover")) {
				assertReference.assertEquals(attachCovAttribtCovDetEntity.getStringValueForField("SubLimitofAddonCover"), fetchValueFromTextFields(subLimitofAddonCoverTextField), AssertionType.WARNING);
			}
		}
		
	}
	public void navigateToPolicy(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToInsuredInterest(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAttachCovDetailsTab")) {
		click(insuredAttachCovDetailTab);
		switchToFrame("display");
		isElementDisplayed(insuredAttachCovDetailTabTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAttachCovAttributesTab")) {
		click(insuredAttachCovAttributesTab);
		switchToFrame("display");
		isElementDisplayed(insuredAttachCovAttributesTabTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigAttachCovPremiumTab")) {
		click(insuredAttachCovPremiumTab);
		switchToFrame("display");
		isElementDisplayed(insuredAttachCovPremiumTabTitle);
		}
	}
	
	public void clickOnNextButton(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigNextButton")) {
		click(forwardBtn);
		switchToFrame("display");
		
		}
	}
	public void clickOnBackButton(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigBackButton")) {
		click(backBtn);
		switchToFrame("display");
		
		}
	}
	public void clickOnSaveButton(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity){
		if (attachCovAttribtCovDetEntity.getBooleanValueForField("ConfigSaveButton")) {
		click(saveBtn);
		switchToFrame("display");
		
		}
	}
	public void fillandSubmitAttachCovAttributesCoverageDetailsPage(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(attachCovAttribtCovDetEntity.getConfigExecute())){
			switchToFrame("display");
			fillAttachCovAttributesCoverageDetailsPage(attachCovAttribtCovDetEntity, assertReference);
			clickOnBackButton(attachCovAttribtCovDetEntity);
			clickOnNextButton(attachCovAttribtCovDetEntity);
			clickOnSaveButton(attachCovAttribtCovDetEntity);
			navigateToPolicy(attachCovAttribtCovDetEntity);
			navigateToAttribute(attachCovAttribtCovDetEntity);
			navigateToInsuredInterest(attachCovAttribtCovDetEntity);
			navigateToCoverage(attachCovAttribtCovDetEntity);
			navigateToLoan(attachCovAttribtCovDetEntity);
			navigateToClientDetails(attachCovAttribtCovDetEntity);
			navigateToRelation(attachCovAttribtCovDetEntity);
			navigateToPayment(attachCovAttribtCovDetEntity);
			navigateToFollowup(attachCovAttribtCovDetEntity);
			navigateToDocument(attachCovAttribtCovDetEntity);
			navigateToPolicyAttachCoveragesDetails(attachCovAttribtCovDetEntity);
			navigateToPolicyAttachCoveragesAttributes(attachCovAttribtCovDetEntity);
			navigateToPolicyAttachCoveragesPremium(attachCovAttribtCovDetEntity);
		}
	}
}
