package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.Exten1DetailsMiscEntity;
import com.aqm.staf.library.databin.Exten2DetailsMiscEntity;

public class Exten2DetailsMiscInsurePage extends BasePage {
	
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

	private PageElement extenTwoDetailsPageTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	
	private PageElement doYouWantToAttachExtensionFiveDropDown;
	private PageElement nameOfTheExtensionFiveTextField;
	private PageElement subLimitOfExtensionFiveDropDown;
	private PageElement subLimitAmountForExtensionFiveTextField;
	private PageElement subLimitPercentForExtensionFiveTextField;
	private PageElement optionsForExtensionFiveDropDown;
	private PageElement loadingAmountForExtensionFiveTextField;
	private PageElement loadingPercentForExtensionFiveTextField;
	private PageElement deductibleOptionForExtensionFiveDropDown;
	private PageElement deductibleAmountForExtensionFiveTextField;
	private PageElement deductiblePercentForExtensionFiveTextField;
	private PageElement doYouWantToAttachExtensionSixDropDown;
	private PageElement nameOfTheExtensionSixTextField;
	private PageElement subLimitOfExtensionSixDropDown;
	private PageElement subLimitAmountForExtensionSixTextField;
	private PageElement subLimitPercentForExtensionSixTextField;
	private PageElement optionsForExtensionSixDropDown;
	private PageElement loadingAmountForExtensionSixTextField;
	private PageElement loadingPercentForExtensionSixTextField;
	private PageElement deductibleOptionForExtensionSixDropDown;
	private PageElement deductibleAmountForExtensionSixTextField;
	private PageElement deductiblePercentForExtensionSixTextField;
	private PageElement doYouWantToAttachExtensionSevenDropDown;
	private PageElement nameOfTheExtensionSevenTextField;
	private PageElement subLimitOfExtensionSevenDropDown;
	private PageElement subLimitAmountForExtensionSevenTextField;
	private PageElement subLimitPercentForExtensionSevenTextField;
	private PageElement optionsForExtensionSevenDropDown;
	private PageElement loadingAmountForExtensionSevenTextField;
	private PageElement loadingPercentForExtensionSevenTextField;
	private PageElement deductibleOptionForExtensionSevenDropDown;
	private PageElement deductibleAmountForExtensionSevenTextField;
	private PageElement deductiblePercentForExtensionSevenTextField;
	
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;


public Exten2DetailsMiscInsurePage(WebDriver driver, String pageName) {
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

	doYouWantToAttachExtensionFiveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 5')]/following::select"), "Do you want to attach Extension 5 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,50);
	nameOfTheExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 5')]/following::textarea"), "Name of the Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	subLimitOfExtensionFiveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 5')]/following::select"), "Sub Limit of Extension 5 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,50);
	subLimitAmountForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 5')]/following::input"), "Sub Limit Amount for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	subLimitPercentForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 5')]/following::input"), "Deductible (%) for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	optionsForExtensionFiveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 5')]/following::select"), "Options for Extension 5 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,50);
	loadingAmountForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 5')]/following::input"), "Loading Amount for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	loadingPercentForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 5')]/following::input"), "Loading (%) for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	deductibleOptionForExtensionFiveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 5')]/following::select"), "Deductible Option for Extension 5 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,50);
	deductibleAmountForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 5')]/following::input"), "Deductible Amount for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	deductiblePercentForExtensionFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 5')]/following::input"), "Deductible (%) for Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
	
	doYouWantToAttachExtensionSixDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 6')]/following::select"), "Do you want to attach Extension 6 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,60);
	nameOfTheExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 6')]/following::textarea"), "Name of the Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	subLimitOfExtensionSixDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 6')]/following::select"), "Sub Limit of Extension 6 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,60);
	subLimitAmountForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 6')]/following::input"), "Sub Limit Amount for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	subLimitPercentForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 6')]/following::input"), "Deductible (%) for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	optionsForExtensionSixDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 6')]/following::select"), "Options for Extension 6 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,60);
	loadingAmountForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 6')]/following::input"), "Loading Amount for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	loadingPercentForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 6')]/following::input"), "Loading (%) for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	deductibleOptionForExtensionSixDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 6')]/following::select"), "Deductible Option for Extension 6 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,60);
	deductibleAmountForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 6')]/following::input"), "Deductible Amount for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	deductiblePercentForExtensionSixTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 6')]/following::input"), "Deductible (%) for Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 60);
	
	doYouWantToAttachExtensionSevenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 7')]/following::select"), "Do you want to attach Extension 7 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,70);
	nameOfTheExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 7')]/following::textarea"), "Name of the Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	subLimitOfExtensionSevenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 7')]/following::select"), "Sub Limit of Extension 7 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,70);
	subLimitAmountForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 7')]/following::input"), "Sub Limit Amount for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	subLimitPercentForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 7')]/following::input"), "Deductible (%) for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	optionsForExtensionSevenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 7')]/following::select"), "Options for Extension 7 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,70);
	loadingAmountForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 7')]/following::input"), "Loading Amount for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	loadingPercentForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 7')]/following::input"), "Loading (%) for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	deductibleOptionForExtensionSevenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 7')]/following::select"), "Deductible Option for Extension 7 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,70);
	deductibleAmountForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 7')]/following::input"), "Deductible Amount for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);
	deductiblePercentForExtensionSevenTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 7')]/following::input"), "Deductible (%) for Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 70);

	forwardButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	//saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

}
public void fillExten2DetailsMiscInsurePage(Exten2DetailsMiscEntity exten2DetailsMiscEntity, CustomAssert assertReference){
	if(exten2DetailsMiscEntity.getAction().equalsIgnoreCase("add") || exten2DetailsMiscEntity.getAction().equalsIgnoreCase("edit")){

		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionFive")) {
			selectValueFromList(doYouWantToAttachExtensionFiveDropDown, exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionFive")) {
			clearAndSendKeys(nameOfTheExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionFive")) {
			selectValueFromList(subLimitOfExtensionFiveDropDown, exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionFive")) {
			clearAndSendKeys(subLimitAmountForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionFive")) {
			clearAndSendKeys(subLimitPercentForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionFive")) {
			selectValueFromList(optionsForExtensionFiveDropDown, exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionFive")) {
			clearAndSendKeys(loadingAmountForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionFive")) {
			clearAndSendKeys(loadingPercentForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionFive")) {
			selectValueFromList(deductibleOptionForExtensionFiveDropDown, exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionFive")) {
			clearAndSendKeys(deductibleAmountForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionFive"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionFive")) {
			clearAndSendKeys(deductiblePercentForExtensionFiveTextField, exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionFive"));
		}
		
		
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionSix")) {
			selectValueFromList(doYouWantToAttachExtensionSixDropDown, exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionSix")) {
			clearAndSendKeys(nameOfTheExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionSix")) {
			selectValueFromList(subLimitOfExtensionSixDropDown, exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionSix")) {
			clearAndSendKeys(subLimitAmountForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionSix")) {
			clearAndSendKeys(subLimitPercentForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionSix")) {
			selectValueFromList(optionsForExtensionSixDropDown, exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionSix")) {
			clearAndSendKeys(loadingAmountForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionSix")) {
			clearAndSendKeys(loadingPercentForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionSix")) {
			selectValueFromList(deductibleOptionForExtensionSixDropDown, exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionSix")) {
			clearAndSendKeys(deductibleAmountForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionSix"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionSix")) {
			clearAndSendKeys(deductiblePercentForExtensionSixTextField, exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionSix"));
		}
		
	
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionSeven")) {
			selectValueFromList(doYouWantToAttachExtensionSevenDropDown, exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionSeven")) {
			clearAndSendKeys(nameOfTheExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionSeven")) {
			selectValueFromList(subLimitOfExtensionSevenDropDown, exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionSeven")) {
			clearAndSendKeys(subLimitAmountForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionSeven")) {
			clearAndSendKeys(subLimitPercentForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionSeven")) {
			selectValueFromList(optionsForExtensionSevenDropDown, exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionSeven")) {
			clearAndSendKeys(loadingAmountForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionSeven")) {
			clearAndSendKeys(loadingPercentForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionSeven")) {
			selectValueFromList(deductibleOptionForExtensionSevenDropDown, exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionSeven")) {
			clearAndSendKeys(deductibleAmountForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionSeven"));
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionSeven")) {
			clearAndSendKeys(deductiblePercentForExtensionSevenTextField, exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionSeven"));
		}
	
	}
	else if(exten2DetailsMiscEntity.getAction().equalsIgnoreCase("verify")){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSchemeNo")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigStatus")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigProductName")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
		}
	
		
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionFive"), fetchValueFromList(doYouWantToAttachExtensionFiveDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionFive"), fetchValueFromTextFields(nameOfTheExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionFive"), fetchValueFromList(subLimitOfExtensionFiveDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionFive"), fetchValueFromTextFields(subLimitAmountForExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionFive"), fetchValueFromTextFields(subLimitPercentForExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionFive"), fetchValueFromList(optionsForExtensionFiveDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFive"), fetchValueFromTextFields(loadingAmountForExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFive"), fetchValueFromFields(loadingPercentForExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionFive"), fetchValueFromList(deductibleOptionForExtensionFiveDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionFive"), fetchValueFromTextFields(deductibleAmountForExtensionFiveTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionFive")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionFive"), fetchValueFromFields(deductiblePercentForExtensionFiveTextField), AssertionType.WARNING);
		}
		
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionSix"), fetchValueFromList(doYouWantToAttachExtensionSixDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionSix"), fetchValueFromTextFields(nameOfTheExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionSix"), fetchValueFromList(subLimitOfExtensionSixDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionSix"), fetchValueFromTextFields(subLimitAmountForExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionSix"), fetchValueFromTextFields(subLimitPercentForExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionSix"), fetchValueFromList(optionsForExtensionSixDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSix"), fetchValueFromTextFields(loadingAmountForExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSix"), fetchValueFromFields(loadingPercentForExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionSix"), fetchValueFromList(deductibleOptionForExtensionSixDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionSix"), fetchValueFromTextFields(deductibleAmountForExtensionSixTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionSix")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionSix"), fetchValueFromFields(deductiblePercentForExtensionSixTextField), AssertionType.WARNING);
		}

		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionSeven"), fetchValueFromList(doYouWantToAttachExtensionSevenDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("NameOfTheExtensionSeven"), fetchValueFromTextFields(nameOfTheExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionSeven"), fetchValueFromList(subLimitOfExtensionSevenDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionSeven"), fetchValueFromTextFields(subLimitAmountForExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionSeven"), fetchValueFromTextFields(subLimitPercentForExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("OptionsForExtensionSeven"), fetchValueFromList(optionsForExtensionSevenDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSeven"), fetchValueFromTextFields(loadingAmountForExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionSeven"), fetchValueFromFields(loadingPercentForExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionSeven"), fetchValueFromList(deductibleOptionForExtensionSevenDropDown), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionSeven"), fetchValueFromTextFields(deductibleAmountForExtensionSevenTextField), AssertionType.WARNING);
		}
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionSeven")) {
			assertReference.assertEquals(exten2DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionSeven"), fetchValueFromFields(deductiblePercentForExtensionSevenTextField), AssertionType.WARNING);
		}

	}
}
private void forwordExten2Details(Exten2DetailsMiscEntity exten2DetailsMiscEntity) throws InterruptedException {
	if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwardButton);
			Thread.sleep(3000);
			switchToFrame("display");
			if(!exten2DetailsMiscEntity.getStringValueForField("Product").equalsIgnoreCase("PK")){
				extenTwoDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+exten2DetailsMiscEntity.getStringValueForField("ExtenTwoDetailsPageTitle")+"')]"), "Next Page Title After Exten Two Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(extenTwoDetailsPageTitle);
			}	
		}


	}
	private void navigateToAttributePage(Exten2DetailsMiscEntity exten2DetailsMiscEntity) {
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			
		}
	}

	public void navigateToPolicy(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			
		}
	}
	public void navigateToCoverage(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(Exten2DetailsMiscEntity exten2DetailsMiscEntity){
		if (exten2DetailsMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitExten2DetailsMiscInsurePage(Exten2DetailsMiscEntity exten2DetailsMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(exten2DetailsMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillExten2DetailsMiscInsurePage(exten2DetailsMiscEntity, assertReference);
			forwordExten2Details(exten2DetailsMiscEntity);
			navigateToAttributePage(exten2DetailsMiscEntity);
			navigateToPolicy(exten2DetailsMiscEntity);
			navigateToAttribute(exten2DetailsMiscEntity);
			navigateToMember(exten2DetailsMiscEntity);
			navigateToCoverage(exten2DetailsMiscEntity);
			navigateToLoan(exten2DetailsMiscEntity);
			navigateToClientDetails(exten2DetailsMiscEntity);
			navigateToRelation(exten2DetailsMiscEntity);
			navigateToPayment(exten2DetailsMiscEntity);
			navigateToFollowup(exten2DetailsMiscEntity);
			navigateToDocument(exten2DetailsMiscEntity);
		}

	}
	}




