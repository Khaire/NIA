package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.Exten2DetailsMiscEntity;
import com.aqm.staf.library.databin.Exten3DetailsMiscEntity;

public class Exten3DetailsMiscInsurePage extends BasePage{
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

	private PageElement extenThreeDetailsPageTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	
	private PageElement doYouWantToAttachExtensionEightDropDown;
	private PageElement nameOfTheExtensionEightTextField;
	private PageElement subLimitOfExtensionEightDropDown;
	private PageElement subLimitAmountForExtensionEightTextField;
	private PageElement subLimitPercentForExtensionEightTextField;
	private PageElement optionsForExtensionEightDropDown;
	private PageElement loadingAmountForExtensionEightTextField;
	private PageElement loadingPercentForExtensionEightTextField;
	private PageElement deductibleOptionForExtensionEightDropDown;
	private PageElement deductibleAmountForExtensionEightTextField;
	private PageElement deductiblePercentForExtensionEightTextField;
	private PageElement doYouWantToAttachExtensionNineDropDown;
	private PageElement nameOfTheExtensionNineTextField;
	private PageElement subLimitOfExtensionNineDropDown;
	private PageElement subLimitAmountForExtensionNineTextField;
	private PageElement subLimitPercentForExtensionNineTextField;
	private PageElement optionsForExtensionNineDropDown;
	private PageElement loadingAmountForExtensionNineTextField;
	private PageElement loadingPercentForExtensionNineTextField;
	private PageElement deductibleOptionForExtensionNineDropDown;
	private PageElement deductibleAmountForExtensionNineTextField;
	private PageElement deductiblePercentForExtensionNineTextField;
	private PageElement doYouWantToAttachExtensionTenDropDown;
	private PageElement nameOfTheExtensionTenTextField;
	private PageElement subLimitOfExtensionTenDropDown;
	private PageElement subLimitAmountForExtensionTenTextField;
	private PageElement subLimitPercentForExtensionTenTextField;
	private PageElement optionsForExtensionTenDropDown;
	private PageElement loadingAmountForExtensionTenTextField;
	private PageElement loadingPercentForExtensionTenTextField;
	private PageElement deductibleOptionForExtensionTenDropDown;
	private PageElement deductibleAmountForExtensionTenTextField;
	private PageElement deductiblePercentForExtensionTenTextField;
	
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;

	private PageElement categoryOfIndustry;
	private PageElement industrySector;
	private PageElement categoryToWhichThePLIPolicyPurchaserBelongs;
	private PageElement nameQuantitiesOfHazardousSubsHandByOwner;
	private PageElement addrOfColleUnderWhichTerriliIsTheUnitHanHazarSubFalls;

public Exten3DetailsMiscInsurePage(WebDriver driver, String pageName) {
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
	insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	doYouWantToAttachExtensionEightDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 8')]/following::select"), "Do you want to attach Extension 8 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,80);
	nameOfTheExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 8')]/following::textarea"), "Name of the Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	subLimitOfExtensionEightDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 8')]/following::select"), "Sub Limit of Extension 8 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,80);
	subLimitAmountForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 8')]/following::input"), "Sub Limit Amount for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	subLimitPercentForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 8')]/following::input"), "Deductible (%) for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	optionsForExtensionEightDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 8')]/following::select"), "Options for Extension 8 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,80);
	loadingAmountForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 8')]/following::input"), "Loading Amount for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	loadingPercentForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 8')]/following::input"), "Loading (%) for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	deductibleOptionForExtensionEightDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 8')]/following::select"), "Deductible Option for Extension 8 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,80);
	deductibleAmountForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 8')]/following::input"), "Deductible Amount for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	deductiblePercentForExtensionEightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 8')]/following::input"), "Deductible (%) for Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 80);
	
	doYouWantToAttachExtensionNineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 9')]/following::select"), "Do you want to attach Extension 9 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,90);
	nameOfTheExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 9')]/following::textarea"), "Name of the Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	subLimitOfExtensionNineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 9')]/following::select"), "Sub Limit of Extension 9 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,90);
	subLimitAmountForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 9')]/following::input"), "Sub Limit Amount for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	subLimitPercentForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 9')]/following::input"), "Deductible (%) for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	optionsForExtensionNineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 9')]/following::select"), "Options for Extension 9 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,90);
	loadingAmountForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 9')]/following::input"), "Loading Amount for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	loadingPercentForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 9')]/following::input"), "Loading (%) for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	deductibleOptionForExtensionNineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 9')]/following::select"), "Deductible Option for Extension 9 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,90);
	deductibleAmountForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 9')]/following::input"), "Deductible Amount for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	deductiblePercentForExtensionNineTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 9')]/following::input"), "Deductible (%) for Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 90);
	
	doYouWantToAttachExtensionTenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 10')]/following::select"), "Do you want to attach Extension 10 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,100);
	nameOfTheExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 10')]/following::textarea"), "Name of the Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	subLimitOfExtensionTenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 10')]/following::select"), "Sub Limit of Extension 10 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,100);
	subLimitAmountForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 10')]/following::input"), "Sub Limit Amount for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	subLimitPercentForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 10')]/following::input"), "Deductible (%) for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	optionsForExtensionTenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 10')]/following::select"), "Options for Extension 10 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,100);
	loadingAmountForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 10')]/following::input"), "Loading Amount for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	loadingPercentForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 10')]/following::input"), "Loading (%) for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	deductibleOptionForExtensionTenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 10')]/following::select"), "Deductible Option for Extension 10 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,100);
	deductibleAmountForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 10')]/following::input"), "Deductible Amount for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	deductiblePercentForExtensionTenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 10')]/following::input"), "Deductible (%) for Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);

	forwardButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	categoryOfIndustry=	new PageElement(By.xpath("//td//div[contains(text(),'Category of industry')]/following::select"), "Category Of Industry", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	industrySector=new PageElement(By.xpath("//td//div[contains(text(),'Industry Sector')]/following::select"), "Industry Sector", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	categoryToWhichThePLIPolicyPurchaserBelongs=new PageElement(By.xpath("//td//div[contains(text(),'Category to which the PLI policy purchaser belongs')]/following::select"), "Category To Which The PLI Policy Purchaser Belongs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	nameQuantitiesOfHazardousSubsHandByOwner=new PageElement(By.xpath("//td//div[contains(text(),'Name & Quantities of hazardous substances handled by owner')]/following::textarea"), "Name Quantities Of Hazardous Subs Hand By Owner", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);
	addrOfColleUnderWhichTerriliIsTheUnitHanHazarSubFalls=new PageElement(By.xpath("//td//div[contains(text(),'Address of Collector under which Territorial limit is the unit handling hazardous substance Falls')]/following::textarea"), "Addr Of Colle Under Which Terrili Is The Unit Han Hazar Sub Falls", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 100);



}
public void fillExten3DetailsMiscInsurePage(Exten3DetailsMiscEntity exten3DetailsMiscEntity, CustomAssert assertReference){
	if(exten3DetailsMiscEntity.getAction().equalsIgnoreCase("add") || exten3DetailsMiscEntity.getAction().equalsIgnoreCase("edit")){

		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionEight")) {
			selectValueFromList(doYouWantToAttachExtensionEightDropDown, exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionEight")) {
			clearAndSendKeys(nameOfTheExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionEight")) {
			selectValueFromList(subLimitOfExtensionEightDropDown, exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionEight")) {
			clearAndSendKeys(subLimitAmountForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionEight")) {
			clearAndSendKeys(subLimitPercentForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionEight")) {
			selectValueFromList(optionsForExtensionEightDropDown, exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionEight")) {
			clearAndSendKeys(loadingAmountForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionEight")) {
			clearAndSendKeys(loadingPercentForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionEight")) {
			selectValueFromList(deductibleOptionForExtensionEightDropDown, exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionEight")) {
			clearAndSendKeys(deductibleAmountForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionEight"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionEight")) {
			clearAndSendKeys(deductiblePercentForExtensionEightTextField, exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionEight"));
		}
		
		
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionNine")) {
			selectValueFromList(doYouWantToAttachExtensionNineDropDown, exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionNine")) {
			clearAndSendKeys(nameOfTheExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionNine")) {
			selectValueFromList(subLimitOfExtensionNineDropDown, exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionNine")) {
			clearAndSendKeys(subLimitAmountForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionNine")) {
			clearAndSendKeys(subLimitPercentForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionNine")) {
			selectValueFromList(optionsForExtensionNineDropDown, exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionNine")) {
			clearAndSendKeys(loadingAmountForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionNine")) {
			clearAndSendKeys(loadingPercentForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionNine")) {
			selectValueFromList(deductibleOptionForExtensionNineDropDown, exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionNine")) {
			clearAndSendKeys(deductibleAmountForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionNine"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionNine")) {
			clearAndSendKeys(deductiblePercentForExtensionNineTextField, exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionNine"));
		}
		
	
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionTen")) {
			selectValueFromList(doYouWantToAttachExtensionTenDropDown, exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionTen")) {
			clearAndSendKeys(nameOfTheExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionTen")) {
			selectValueFromList(subLimitOfExtensionTenDropDown, exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionTen")) {
			clearAndSendKeys(subLimitAmountForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionTen")) {
			clearAndSendKeys(subLimitPercentForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionTen")) {
			selectValueFromList(optionsForExtensionTenDropDown, exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionTen")) {
			clearAndSendKeys(loadingAmountForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionTen")) {
			clearAndSendKeys(loadingPercentForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionTen")) {
			selectValueFromList(deductibleOptionForExtensionTenDropDown, exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionTen")) {
			clearAndSendKeys(deductibleAmountForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionTen"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionTen")) {
			clearAndSendKeys(deductiblePercentForExtensionTenTextField, exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionTen"));
		}
	
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigCategoryOfIndustry")) {
			selectValueFromList(categoryOfIndustry, exten3DetailsMiscEntity.getStringValueForField("CategoryOfIndustry"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigIndustrySector")) {
			selectValueFromList(industrySector, exten3DetailsMiscEntity.getStringValueForField("IndustrySector"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigCategoryToWhichThePLIPolicyPurchaserBelongs")) {
			selectValueFromList(categoryToWhichThePLIPolicyPurchaserBelongs, exten3DetailsMiscEntity.getStringValueForField("CategoryToWhichThePLIPolicyPurchaserBelongs"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameQuantitiesOfHazardousSubsHandByOwner")) {
			clearAndSendKeys(nameQuantitiesOfHazardousSubsHandByOwner, exten3DetailsMiscEntity.getStringValueForField("NameQuantitiesOfHazardousSubsHandByOwner"));
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigAddrOfColleUnderWhichTerriliIsTheUnitHanHazarSubFalls")) {
			clearAndSendKeys(addrOfColleUnderWhichTerriliIsTheUnitHanHazarSubFalls, exten3DetailsMiscEntity.getStringValueForField("AddrOfColleUnderWhichTerriliIsTheUnitHanHazarSubFalls"));
		}
	/*	if(exten3DetailsMiscEntity.getStringValueForField("Product").equalsIgnoreCase("PL")){
			click(forwardButton);
			if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigIndustrySector")) {
				selectValueFromList(industrySector, exten3DetailsMiscEntity.getStringValueForField("IndustrySector"));
			}
		}
		*/
		//Ajit
		
	}
	else if(exten3DetailsMiscEntity.getAction().equalsIgnoreCase("verify")){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSchemeNo")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigStatus")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigProductName")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
		}
	
		
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionEight"), fetchValueFromList(doYouWantToAttachExtensionEightDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionEight"), fetchValueFromTextFields(nameOfTheExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionEight"), fetchValueFromList(subLimitOfExtensionEightDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionEight"), fetchValueFromTextFields(subLimitAmountForExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionEight"), fetchValueFromTextFields(subLimitPercentForExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionEight"), fetchValueFromList(optionsForExtensionEightDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionEight"), fetchValueFromTextFields(loadingAmountForExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionEight"), fetchValueFromFields(loadingPercentForExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionEight"), fetchValueFromList(deductibleOptionForExtensionEightDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionEight"), fetchValueFromTextFields(deductibleAmountForExtensionEightTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionEight")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionEight"), fetchValueFromFields(deductiblePercentForExtensionEightTextField), AssertionType.WARNING);
		}
		
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionNine"), fetchValueFromList(doYouWantToAttachExtensionNineDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionNine"), fetchValueFromTextFields(nameOfTheExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionNine"), fetchValueFromList(subLimitOfExtensionNineDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionNine"), fetchValueFromTextFields(subLimitAmountForExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionNine"), fetchValueFromTextFields(subLimitPercentForExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionNine"), fetchValueFromList(optionsForExtensionNineDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionNine"), fetchValueFromTextFields(loadingAmountForExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionNine"), fetchValueFromFields(loadingPercentForExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionNine"), fetchValueFromList(deductibleOptionForExtensionNineDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionNine"), fetchValueFromTextFields(deductibleAmountForExtensionNineTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionNine")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionNine"), fetchValueFromFields(deductiblePercentForExtensionNineTextField), AssertionType.WARNING);
		}

		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionTen"), fetchValueFromList(doYouWantToAttachExtensionTenDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("NameOfTheExtensionTen"), fetchValueFromTextFields(nameOfTheExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionTen"), fetchValueFromList(subLimitOfExtensionTenDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionTen"), fetchValueFromTextFields(subLimitAmountForExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionTen"), fetchValueFromTextFields(subLimitPercentForExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("OptionsForExtensionTen"), fetchValueFromList(optionsForExtensionTenDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTen"), fetchValueFromTextFields(loadingAmountForExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTen"), fetchValueFromFields(loadingPercentForExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionTen"), fetchValueFromList(deductibleOptionForExtensionTenDropDown), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionTen"), fetchValueFromTextFields(deductibleAmountForExtensionTenTextField), AssertionType.WARNING);
		}
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionTen")) {
			assertReference.assertEquals(exten3DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionTen"), fetchValueFromFields(deductiblePercentForExtensionTenTextField), AssertionType.WARNING);
		}

	}
}
private void forwordExten3Details(Exten3DetailsMiscEntity exten3DetailsMiscEntity) throws InterruptedException {
	if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwardButton);
			Thread.sleep(3000);
			switchToFrame("display");
			if(! exten3DetailsMiscEntity.getStringValueForField("Product").equalsIgnoreCase("PK")){
				extenThreeDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+exten3DetailsMiscEntity.getStringValueForField("ExtenThreeDetailsPageTitle")+"')]"), "Next Page Title After Exten Three Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(extenThreeDetailsPageTitle);
			}
		}
	}
private void SaveExten3Details(Exten3DetailsMiscEntity exten3DetailsMiscEntity) {
	if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigSaveButton")){		
		click(saveButton);
		switchToFrame("display");
		
	}
}

	private void navigateToAttributePage(Exten3DetailsMiscEntity exten3DetailsMiscEntity) {
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			
		}
	}

	public void navigateToPolicy(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			
		}
	}
	public void navigateToCoverage(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(Exten3DetailsMiscEntity exten3DetailsMiscEntity){
		if (exten3DetailsMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitExten3DetailsMiscInsurePage(Exten3DetailsMiscEntity exten3DetailsMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(exten3DetailsMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillExten3DetailsMiscInsurePage(exten3DetailsMiscEntity, assertReference);
			forwordExten3Details(exten3DetailsMiscEntity);
			SaveExten3Details(exten3DetailsMiscEntity);
			navigateToAttributePage(exten3DetailsMiscEntity);
			navigateToPolicy(exten3DetailsMiscEntity);
			navigateToAttribute(exten3DetailsMiscEntity);
			navigateToMember(exten3DetailsMiscEntity);
			navigateToCoverage(exten3DetailsMiscEntity);
			navigateToLoan(exten3DetailsMiscEntity);
			navigateToClientDetails(exten3DetailsMiscEntity);
			navigateToRelation(exten3DetailsMiscEntity);
			navigateToPayment(exten3DetailsMiscEntity);
			navigateToFollowup(exten3DetailsMiscEntity);
			navigateToDocument(exten3DetailsMiscEntity);
		}

	}
	}







