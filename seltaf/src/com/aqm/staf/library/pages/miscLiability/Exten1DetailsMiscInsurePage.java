package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.Exten1DetailsMiscEntity;
import com.aqm.staf.library.databin.PolSpecialConditnMiscEntity;

public class Exten1DetailsMiscInsurePage extends BasePage {
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

	private PageElement extenOneDetailsPageTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	
	private PageElement doYouWantToAttachExtensionOneDropDown;
	private PageElement nameOfTheExtensionOneTextField;
	private PageElement subLimitOfExtensionOneDropDown;
	private PageElement subLimitAmountForExtensionOneTextField;
	private PageElement subLimitPercentForExtensionOneTextField;
	private PageElement optionsForExtensionOneDropDown;
	private PageElement loadingAmountForExtensionOneTextField;
	private PageElement loadingPercentForExtensionOneTextField;
	private PageElement deductibleOptionForExtensionOneDropDown;
	private PageElement deductibleAmountForExtensionOneTextField;
	private PageElement deductiblePercentForExtensionOneTextField;
	private PageElement doYouWantToAttachExtensionTwoDropDown;
	private PageElement nameOfTheExtensionTwoTextField;
	private PageElement subLimitOfExtensionTwoDropDown;
	private PageElement subLimitAmountForExtensionTwoTextField;
	private PageElement subLimitPercentForExtensionTwoTextField;
	private PageElement optionsForExtensionTwoDropDown;
	private PageElement loadingAmountForExtensionTwoTextField;
	private PageElement loadingPercentForExtensionTwoTextField;
	private PageElement deductibleOptionForExtensionTwoDropDown;
	private PageElement deductibleAmountForExtensionTwoTextField;
	private PageElement deductiblePercentForExtensionTwoTextField;
	private PageElement doYouWantToAttachExtensionThreeDropDown;
	private PageElement nameOfTheExtensionThreeTextField;
	private PageElement subLimitOfExtensionThreeDropDown;
	private PageElement subLimitAmountForExtensionThreeTextField;
	private PageElement subLimitPercentForExtensionThreeTextField;
	private PageElement optionsForExtensionThreeDropDown;
	private PageElement loadingAmountForExtensionThreeTextField;
	private PageElement loadingPercentForExtensionThreeTextField;
	private PageElement deductibleOptionForExtensionThreeDropDown;
	private PageElement deductibleAmountForExtensionThreeTextField;
	private PageElement deductiblePercentForExtensionThreeTextField;
	private PageElement doYouWantToAttachExtensionFourDropDown;
	private PageElement nameOfTheExtensionFourTextField;
	private PageElement subLimitOfExtensionFourDropDown;
	private PageElement subLimitAmountForExtensionFourTextField;
	private PageElement subLimitPercentForExtensionFourTextField;
	private PageElement optionsForExtensionFourDropDown;
	private PageElement loadingAmountForExtensionFourTextField;
	private PageElement loadingPercentForExtensionFourTextField;
	private PageElement deductibleOptionForExtensionFourDropDown;
	private PageElement deductibleAmountForExtensionFourTextField;
	private PageElement deductiblePercentForExtensionFourTextField;

	
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	
	public Exten1DetailsMiscInsurePage(WebDriver driver, String pageName) {
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
		
		doYouWantToAttachExtensionOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 1')]/following::select"), "Do you want to attach Extension 1 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameOfTheExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 1')]/following::textarea"), "Name of the Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitOfExtensionOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 1')]/following::select"), "Sub Limit of Extension 1 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitAmountForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 1')]/following::input"), "Sub Limit Amount for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitPercentForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 1')]/following::input"), "Deductible (%) for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionsForExtensionOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 1')]/following::select"), "Options for Extension 1 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingAmountForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 1')]/following::input"), "Loading Amount for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingPercentForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 1')]/following::input"), "Loading (%) for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleOptionForExtensionOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 1')]/following::select"), "Deductible Option for Extension 1 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleAmountForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 1')]/following::input"), "Deductible Amount for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductiblePercentForExtensionOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 1')]/following::input"), "Deductible (%) for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		doYouWantToAttachExtensionTwoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 2')]/following::select"), "Do you want to attach Extension 2 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,20);
		nameOfTheExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 2')]/following::textarea"), "Name of the Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		subLimitOfExtensionTwoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 2')]/following::select"), "Sub Limit of Extension 2 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,20);
		subLimitAmountForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 2')]/following::input"), "Sub Limit Amount for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		subLimitPercentForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 2')]/following::input"), "Deductible (%) for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		optionsForExtensionTwoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 2')]/following::select"), "Options for Extension 2 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,20);
		loadingAmountForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 2')]/following::input"), "Loading Amount for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		loadingPercentForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 2')]/following::input"), "Loading (%) for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		deductibleOptionForExtensionTwoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 2')]/following::select"), "Deductible Option for Extension 2 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,20);
		deductibleAmountForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 2')]/following::input"), "Deductible Amount for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		deductiblePercentForExtensionTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 2')]/following::input"), "Deductible (%) for Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		
		doYouWantToAttachExtensionThreeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 3')]/following::select"), "Do you want to attach Extension 3 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,30);
		nameOfTheExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 3')]/following::textarea"), "Name of the Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		subLimitOfExtensionThreeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 3')]/following::select"), "Sub Limit of Extension 3 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,30);
		subLimitAmountForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 3')]/following::input"), "Sub Limit Amount for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		subLimitPercentForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 3')]/following::input"), "Deductible (%) for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		optionsForExtensionThreeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 3')]/following::select"), "Options for Extension 3 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,30);
		loadingAmountForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 3')]/following::input"), "Loading Amount for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		loadingPercentForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 3')]/following::input"), "Loading (%) for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		deductibleOptionForExtensionThreeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 3')]/following::select"), "Deductible Option for Extension 3 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,30);
		deductibleAmountForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 3')]/following::input"), "Deductible Amount for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		deductiblePercentForExtensionThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 3')]/following::input"), "Deductible (%) for Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		
		doYouWantToAttachExtensionFourDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Extension 4')]/following::select"), "Do you want to attach Extension 4 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,40);
		nameOfTheExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Extension 4')]/following::textarea"), "Name of the Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		subLimitOfExtensionFourDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Extension 4')]/following::select"), "Sub Limit of Extension 4 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,40);
		subLimitAmountForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit Amount for Extension 4')]/following::input"), "Sub Limit Amount for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		subLimitPercentForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 4')]/following::input"), "Deductible (%) for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		optionsForExtensionFourDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Extension 4')]/following::select"), "Options for Extension 4 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,40);
		loadingAmountForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading Amount for Extension 4')]/following::input"), "Loading Amount for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		loadingPercentForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Extension 4')]/following::input"), "Loading (%) for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		deductibleOptionForExtensionFourDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Option for Extension 4')]/following::select"), "Deductible Option for Extension 4 Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,40);
		deductibleAmountForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Amount for Extension 4')]/following::input"), "Deductible Amount for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		deductiblePercentForExtensionFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible (%) for Extension 4')]/following::input"), "Deductible (%) for Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		
	
		forwardButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


}

	public void fillExten1DetailsMiscInsurePage(Exten1DetailsMiscEntity exten1DetailsMiscEntity, CustomAssert assertReference){
		if(exten1DetailsMiscEntity.getAction().equalsIgnoreCase("add") || exten1DetailsMiscEntity.getAction().equalsIgnoreCase("edit")){

			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionOne")) {
				selectValueFromList(doYouWantToAttachExtensionOneDropDown, exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionOne")) {
				clearAndSendKeys(nameOfTheExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionOne")) {
				selectValueFromList(subLimitOfExtensionOneDropDown, exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionOne")) {
				clearAndSendKeys(subLimitAmountForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionOne")) {
				clearAndSendKeys(subLimitPercentForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionOne")) {
				selectValueFromList(optionsForExtensionOneDropDown, exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionOne")) {
				clearAndSendKeys(loadingAmountForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionOne")) {
				clearAndSendKeys(loadingPercentForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionOne")) {
				selectValueFromList(deductibleOptionForExtensionOneDropDown, exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionOne")) {
				clearAndSendKeys(deductibleAmountForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionOne"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionOne")) {
				clearAndSendKeys(deductiblePercentForExtensionOneTextField, exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionOne"));
			}
			
			
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionTwo")) {
				selectValueFromList(doYouWantToAttachExtensionTwoDropDown, exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionTwo")) {
				clearAndSendKeys(nameOfTheExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionTwo")) {
				selectValueFromList(subLimitOfExtensionTwoDropDown, exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionTwo")) {
				clearAndSendKeys(subLimitAmountForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionTwo")) {
				clearAndSendKeys(subLimitPercentForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionTwo")) {
				selectValueFromList(optionsForExtensionTwoDropDown, exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionTwo")) {
				clearAndSendKeys(loadingAmountForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionTwo")) {
				clearAndSendKeys(loadingPercentForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionTwo")) {
				selectValueFromList(deductibleOptionForExtensionTwoDropDown, exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionTwo")) {
				clearAndSendKeys(deductibleAmountForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionTwo"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionTwo")) {
				clearAndSendKeys(deductiblePercentForExtensionTwoTextField, exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionTwo"));
			}
			
		
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionThree")) {
				selectValueFromList(doYouWantToAttachExtensionThreeDropDown, exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionThree")) {
				clearAndSendKeys(nameOfTheExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionThree")) {
				selectValueFromList(subLimitOfExtensionThreeDropDown, exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionThree")) {
				clearAndSendKeys(subLimitAmountForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionThree")) {
				clearAndSendKeys(subLimitPercentForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionThree")) {
				selectValueFromList(optionsForExtensionThreeDropDown, exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionThree")) {
				clearAndSendKeys(loadingAmountForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionThree")) {
				clearAndSendKeys(loadingPercentForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionThree")) {
				selectValueFromList(deductibleOptionForExtensionThreeDropDown, exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionThree")) {
				clearAndSendKeys(deductibleAmountForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionThree"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionThree")) {
				clearAndSendKeys(deductiblePercentForExtensionThreeTextField, exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionThree"));
			}
			
			
			
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionFour")) {
				selectValueFromList(doYouWantToAttachExtensionFourDropDown, exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionFour")) {
				clearAndSendKeys(nameOfTheExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionFour")) {
				selectValueFromList(subLimitOfExtensionFourDropDown, exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionFour")) {
				clearAndSendKeys(subLimitAmountForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionFour")) {
				clearAndSendKeys(subLimitPercentForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionFour")) {
				selectValueFromList(optionsForExtensionFourDropDown, exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionFour")) {
				clearAndSendKeys(loadingAmountForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionFour")) {
				clearAndSendKeys(loadingPercentForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("LoadingPercentForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionFour")) {
				selectValueFromList(deductibleOptionForExtensionFourDropDown, exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionFour")) {
				clearAndSendKeys(deductibleAmountForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionFour"));
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionFour")) {
				clearAndSendKeys(deductiblePercentForExtensionFourTextField, exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionFour"));
			}
		
		
		}
		else if(exten1DetailsMiscEntity.getAction().equalsIgnoreCase("verify")){
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
		
			
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionOne"), fetchValueFromList(doYouWantToAttachExtensionOneDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionOne"), fetchValueFromTextFields(nameOfTheExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionOne"), fetchValueFromList(subLimitOfExtensionOneDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionOne"), fetchValueFromTextFields(subLimitAmountForExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionOne"), fetchValueFromTextFields(subLimitPercentForExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionOne"), fetchValueFromList(optionsForExtensionOneDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionOne"), fetchValueFromTextFields(loadingAmountForExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionOne"), fetchValueFromFields(loadingPercentForExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionOne"), fetchValueFromList(deductibleOptionForExtensionOneDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionOne"), fetchValueFromTextFields(deductibleAmountForExtensionOneTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionOne")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionOne"), fetchValueFromFields(deductiblePercentForExtensionOneTextField), AssertionType.WARNING);
			}
			
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionTwo"), fetchValueFromList(doYouWantToAttachExtensionTwoDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionTwo"), fetchValueFromTextFields(nameOfTheExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionTwo"), fetchValueFromList(subLimitOfExtensionTwoDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionTwo"), fetchValueFromTextFields(subLimitAmountForExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionTwo"), fetchValueFromTextFields(subLimitPercentForExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionTwo"), fetchValueFromList(optionsForExtensionTwoDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTwo"), fetchValueFromTextFields(loadingAmountForExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionTwo"), fetchValueFromFields(loadingPercentForExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionTwo"), fetchValueFromList(deductibleOptionForExtensionTwoDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionTwo"), fetchValueFromTextFields(deductibleAmountForExtensionTwoTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionTwo")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionTwo"), fetchValueFromFields(deductiblePercentForExtensionTwoTextField), AssertionType.WARNING);
			}
	
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionThree"), fetchValueFromList(doYouWantToAttachExtensionThreeDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionThree"), fetchValueFromTextFields(nameOfTheExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionThree"), fetchValueFromList(subLimitOfExtensionThreeDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionThree"), fetchValueFromTextFields(subLimitAmountForExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionThree"), fetchValueFromTextFields(subLimitPercentForExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionThree"), fetchValueFromList(optionsForExtensionThreeDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionThree"), fetchValueFromTextFields(loadingAmountForExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionThree"), fetchValueFromFields(loadingPercentForExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionThree"), fetchValueFromList(deductibleOptionForExtensionThreeDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionThree"), fetchValueFromTextFields(deductibleAmountForExtensionThreeTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionThree")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionThree"), fetchValueFromFields(deductiblePercentForExtensionThreeTextField), AssertionType.WARNING);
			}
	
			
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDoYouWantToAttachExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DoYouWantToAttachExtensionFour"), fetchValueFromList(doYouWantToAttachExtensionFourDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigNameOfTheExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("NameOfTheExtensionFour"), fetchValueFromTextFields(nameOfTheExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitOfExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitOfExtensionFour"), fetchValueFromList(subLimitOfExtensionFourDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitAmountForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitAmountForExtensionFour"), fetchValueFromTextFields(subLimitAmountForExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigSubLimitPercentForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("SubLimitPercentForExtensionFour"), fetchValueFromTextFields(subLimitPercentForExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigOptionsForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("OptionsForExtensionFour"), fetchValueFromList(optionsForExtensionFourDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingAmountForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFour"), fetchValueFromTextFields(loadingAmountForExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoadingPercentForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("LoadingAmountForExtensionFour"), fetchValueFromFields(loadingPercentForExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleOptionForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleOptionForExtensionFour"), fetchValueFromList(deductibleOptionForExtensionFourDropDown), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductibleAmountForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductibleAmountForExtensionFour"), fetchValueFromTextFields(deductibleAmountForExtensionFourTextField), AssertionType.WARNING);
			}
			if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDeductiblePercentForExtensionFour")) {
				assertReference.assertEquals(exten1DetailsMiscEntity.getStringValueForField("DeductiblePercentForExtensionFour"), fetchValueFromFields(deductiblePercentForExtensionFourTextField), AssertionType.WARNING);
			}
			
			
		}
	}
	private void forwordExten1Details(Exten1DetailsMiscEntity exten1DetailsMiscEntity) throws InterruptedException {
	if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwardButton);
			Thread.sleep(3000);
			switchToFrame("display");
			if(! exten1DetailsMiscEntity.getStringValueForField("Product").equalsIgnoreCase("PK")){
				extenOneDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+exten1DetailsMiscEntity.getStringValueForField("ExtenOneDetailsPageTitle")+"')]"), "Next Page Title After Exten One Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(extenOneDetailsPageTitle);
			}
		}


	}
	private void navigateToAttributePage(Exten1DetailsMiscEntity exten1DetailsMiscEntity) {
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			
		}
	}

	public void navigateToPolicy(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			
		}
	}
	public void navigateToCoverage(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(Exten1DetailsMiscEntity exten1DetailsMiscEntity){
		if (exten1DetailsMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitExten1DetailsMiscInsurePage(Exten1DetailsMiscEntity exten1DetailsMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(exten1DetailsMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillExten1DetailsMiscInsurePage(exten1DetailsMiscEntity, assertReference);
			forwordExten1Details(exten1DetailsMiscEntity);
			navigateToAttributePage(exten1DetailsMiscEntity);
			navigateToPolicy(exten1DetailsMiscEntity);
			navigateToAttribute(exten1DetailsMiscEntity);
			navigateToMember(exten1DetailsMiscEntity);
			navigateToCoverage(exten1DetailsMiscEntity);
			navigateToLoan(exten1DetailsMiscEntity);
			navigateToClientDetails(exten1DetailsMiscEntity);
			navigateToRelation(exten1DetailsMiscEntity);
			navigateToPayment(exten1DetailsMiscEntity);
			navigateToFollowup(exten1DetailsMiscEntity);
			navigateToDocument(exten1DetailsMiscEntity);
		}

	}
	}



