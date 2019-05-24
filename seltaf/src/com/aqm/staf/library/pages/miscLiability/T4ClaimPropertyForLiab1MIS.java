package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDetMISEntity;
import com.aqm.staf.library.databin.T4ClaimPropLiab1MISEntity;

public class T4ClaimPropertyForLiab1MIS extends BasePage{

	private PageElement underClaimsAttachExtension1DropDown;
	private PageElement	subLimitAmountForExtension1TextBox;
	private PageElement	deductibleAmountForExtension1TextBox;
	private PageElement	extensionClaimAmountOfExtension1TextBox;

	private PageElement	underClaimsAttachExtension2DropDown;
	private PageElement	subLimitAmountForExtension2TextBox;
	private PageElement deductibleAmountForExtension2TextBox;		
	private PageElement extensionClaimAmountofExtension2TextBox;

	private PageElement underClaimsAttachExtension3DropDown;
	private PageElement subLimitAmountForExtension3TextBox;
	private PageElement deductibleAmountForExtension3TextBox;
	private PageElement extensionClaimAmountofExtension3TextBox;

	private PageElement underClaimsattachExtension4DropDown;
	private PageElement subLimitAmountForExtension4TextBox;		
	private PageElement	deductibleAmountForExtension4TextBox;
	private PageElement	extensionClaimAmountOfExtension4TextBox;

	private PageElement	underClaimsAttachExtension5DropDown;
	private PageElement	subLimitAmountForExtension5TextBox;	
	private PageElement	deductibleAmountForExtension5TextBox;
	private PageElement extensionClaimAmountOfExtension5TextBox;

	private PageElement underClaimsattachExtension6DropDown;
	private PageElement subLimitAmountforExtension6TextBox;
	private PageElement deductibleAmountForExtension6TextBox;
	private PageElement	extensionClaimAmountOfExtension6TextBox;

	private PageElement underClaimsattachExtension7DropDown;
	private PageElement	subLimitAmountForExtension7TextBox;
	private PageElement deductibleAmountForExtension7TextBox;
	private PageElement	extensionClaimAmountOfExtension7TextBox;

	private PageElement	underClaimsAttachExtension8DropDown;
	private PageElement	subLimitAmountForExtension8TextBox;
	private PageElement deductibleAmountForExtension8TextBox;
	private PageElement extensionClaimAmountOfExtension8TextBox;

	private PageElement underClaimsAttachExtension9DropDown;
	private PageElement sublimitAmountForExtension9TextBox;
	private PageElement deductibleAmountForExtension9TextBox;
	private PageElement extensionClaimAmountOfExtension9TextBox;

	private PageElement underClaimsAttachExtension10DropDown;
	private PageElement subLimitAmountForExtension10TextBox;
	private PageElement deductibleAmountForExtension10TextBox;
	private PageElement extensionClaimAmountofExtension10TextBox;

	private PageElement claimAmountForPolicyTextBox;
	//old
	private PageElement claimTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemTab;
	private PageElement insuredAttributeTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement claimNumberLabel;		
	private PageElement policyNumberLabel;	
	private PageElement claimDateLabel;	
	private PageElement claimStatusLabel;	
	private PageElement productCodeLabel;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement nextPageTitle;
	private PageElement  insuredSerialNoLabel;
	private PageElement  insuredCodeLabel;
	private PageElement  applicableEventCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
    private PageElement causeOfLossLabel;
	//LN
	private PageElement underClaimsAttachAccidentalpollutionLiability2DropDown;
	private PageElement underClaimsAttachTransportationLiabilityDropDown;
	private PageElement underClaimsAttachActOfGODDropDown;

	public T4ClaimPropertyForLiab1MIS(WebDriver driver, String pageName) {
		super(driver, pageName);

		//slot 1
		underClaimsAttachExtension1DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 1')]/following::select"), "Under Claims attach Extension 1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension1TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 1')]/following::input"), "Sub Limit Amount for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension1TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 1')]/following::input"), "Deductible Amount for Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension1TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 1')]/following::input"), "Extension Claim Amount of Extension 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//slot2
		underClaimsAttachExtension2DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 2')]/following::select"), "Under Claims attach Extension 2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension2TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 2')]/following::input"), "Under Claims attach Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension2TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 2')]/following::input"), "Under Claims attach Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountofExtension2TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 2')]/following::input"), "Under Claims attach Extension 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//slot3
		underClaimsAttachExtension3DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 3')]/following::select"), "Under Claims attach Extension 3", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension3TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 3')]/following::input"), "Under Claims attach Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension3TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 3')]/following::input"), "Under Claims attach Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountofExtension3TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 3')]/following::input"), "Under Claims attach Extension 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//slot4
		underClaimsattachExtension4DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 4')]/following::select"), "Under Claims attach Extension 4", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension4TextBox	=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 4')]/following::input"), "Under Claims attach Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		deductibleAmountForExtension4TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 4')]/following::input"), "Under Claims attach Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension4TextBox =new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 3')]/following::input"), "Under Claims attach Extension 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//slot 5
		underClaimsAttachExtension5DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 5')]/following::select"), "Under Claims attach Extension 5", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension5TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 5')]/following::input"), "Under Claims attach Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension5TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 5')]/following::input"), "Under Claims attach Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension5TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 5')]/following::input"), "Under Claims attach Extension 5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//slot6
		underClaimsattachExtension6DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 6')]/following::select"), "Under Claims attach Extension 6", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountforExtension6TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 6')]/following::input"), "Under Claims attach Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension6TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 6')]/following::input"), "Under Claims attach Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension6TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 6')]/following::input"), "Under Claims attach Extension 6", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//slot7
		underClaimsattachExtension7DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 7')]/following::select"), "Under Claims attach Extension 7", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension7TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 7')]/following::input"), "Under Claims attach Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension7TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 7')]/following::input"), "Under Claims attach Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension7TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 7')]/following::input"), "Under Claims attach Extension 7", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//slot8
		underClaimsAttachExtension8DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 8')]/following::select"), "Under Claims attach Extension 8", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension8TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 8')]/following::input"), "Under Claims attach Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension8TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 8')]/following::input"), "Under Claims attach Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension8TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 8')]/following::input"), "Under Claims attach Extension 8", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//slot9
		underClaimsAttachExtension9DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 9')]/following::select"), "Under Claims attach Extension 9", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sublimitAmountForExtension9TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 9')]/following::input"), "Under Claims attach Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension9TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 9')]/following::input"), "Under Claims attach Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfExtension9TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 9')]/following::input"), "Under Claims attach Extension 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//slot10
		underClaimsAttachExtension10DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extension 10')]/following::select"), "Under Claims attach Extension 10", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitAmountForExtension10TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit Amount for Extension 10')]/following::input"), "Under Claims attach Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleAmountForExtension10TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible Amount for Extension 10')]/following::input"), "Under Claims attach Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountofExtension10TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extension 10')]/following::input"), "Under Claims attach Extension 10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimAmountForPolicyTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Claim Amount for Policy')]/following::input"), "Claim Amount for Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//old
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured InterestDamage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")), "insured Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")), "insured Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 

		//LN
		underClaimsAttachAccidentalpollutionLiability2DropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Claims attach Accidental pollution liability? -2", "select")), "Under Claims attach Accidental pollution liability? -2 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachTransportationLiabilityDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Claims attach Transportation liability?", "select")), "Under Claims attach Transportation liability? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachActOfGODDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Claims attach Act of GOD?", "select")), "Under Claims attach Act of GOD? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillT4ClaimPropertyForLiab1MISLDetails(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity, CustomAssert assertReference) throws InterruptedException{

		if(t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("add") || t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("edit")){
			//slot1
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension1")) {
				selectValueFromList(underClaimsAttachExtension1DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension1"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension1")) {
				clearAndSendKeys(subLimitAmountForExtension1TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension1"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension1")) {
				clearAndSendKeys(deductibleAmountForExtension1TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension1"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension1")) {
				clearAndSendKeys(extensionClaimAmountOfExtension1TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension1"));
			}
			//slot2
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension2")) {
				selectValueFromList(underClaimsAttachExtension2DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension2"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension2")) {
				clearAndSendKeys(subLimitAmountForExtension2TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension2"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension2")) {
				clearAndSendKeys(deductibleAmountForExtension2TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension2"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension2")) {
				clearAndSendKeys(extensionClaimAmountofExtension2TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension2"));
			}
			//slot3
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension3")) {
				selectValueFromList(underClaimsAttachExtension3DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension3"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension3")) {
				clearAndSendKeys(subLimitAmountForExtension3TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension3"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension3")) {
				clearAndSendKeys(deductibleAmountForExtension3TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension3"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension3")) {
				clearAndSendKeys(extensionClaimAmountofExtension3TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension3"));
			}
			//slot4
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension4")) {
				selectValueFromList(underClaimsattachExtension4DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension4"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension4")) {
				clearAndSendKeys(subLimitAmountForExtension4TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension4"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension4")) {
				clearAndSendKeys(deductibleAmountForExtension4TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension4"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension4")) {
				clearAndSendKeys(extensionClaimAmountOfExtension4TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension4"));
			}

			//slot5
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension5")) {
				selectValueFromList(underClaimsAttachExtension5DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension5"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension5")) {
				clearAndSendKeys(subLimitAmountForExtension5TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension5"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension5")) {
				clearAndSendKeys(deductibleAmountForExtension5TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension5"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension5")) {
				clearAndSendKeys(extensionClaimAmountOfExtension5TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension5"));
			}
			//slot6

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension6")) {
				selectValueFromList(underClaimsattachExtension6DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension6"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension6")) {
				clearAndSendKeys(subLimitAmountforExtension6TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension6"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension6")) {
				clearAndSendKeys(deductibleAmountForExtension6TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension6"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension6")) {
				clearAndSendKeys(extensionClaimAmountOfExtension6TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension6"));
			}
			//slot7
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension7")) {
				selectValueFromList(underClaimsattachExtension7DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension7"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension7")) {
				clearAndSendKeys(subLimitAmountForExtension7TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension7"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension7")) {
				clearAndSendKeys(deductibleAmountForExtension7TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension7"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension7")) {
				clearAndSendKeys(extensionClaimAmountOfExtension7TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension7"));
			}

			//slot8
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension8")) {
				selectValueFromList(underClaimsAttachExtension8DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension8"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension8")) {
				clearAndSendKeys(subLimitAmountForExtension8TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension8"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension8")) {
				clearAndSendKeys(deductibleAmountForExtension8TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension8"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension8")) {
				clearAndSendKeys(extensionClaimAmountOfExtension8TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension8"));
			}
			//slot9
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension9")) {
				selectValueFromList(underClaimsAttachExtension9DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension9"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension9")) {
				clearAndSendKeys(sublimitAmountForExtension9TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension9"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension9")) {
				clearAndSendKeys(deductibleAmountForExtension9TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension9"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension9")) {
				clearAndSendKeys(extensionClaimAmountOfExtension9TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension9"));
			}
			//slot10
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension10")) {
				selectValueFromList(underClaimsAttachExtension10DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension10"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension10")) {
				clearAndSendKeys(subLimitAmountForExtension10TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension10"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension10")) {
				clearAndSendKeys(deductibleAmountForExtension10TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension10"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension10")) {
				clearAndSendKeys(extensionClaimAmountofExtension10TextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension10"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimAmountForPolicy")) {
				clearAndSendKeys(claimAmountForPolicyTextBox, t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimAmountForPolicy"));
			}


		}
		else if(t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("verify")){
			//slot1

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension1")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension1"), fetchValueFromList(underClaimsAttachExtension1DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension1")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension1"), fetchValueFromTextFields(subLimitAmountForExtension1TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension1")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension1"), fetchValueFromTextFields(deductibleAmountForExtension1TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension1")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension1"), fetchValueFromTextFields(extensionClaimAmountOfExtension1TextBox), AssertionType.WARNING);
			}
			//slot2
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension2")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension2"), fetchValueFromList(underClaimsAttachExtension2DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension2")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension2"), fetchValueFromTextFields(subLimitAmountForExtension2TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension2")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension2"), fetchValueFromTextFields(deductibleAmountForExtension2TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension2")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension2"), fetchValueFromTextFields(extensionClaimAmountofExtension2TextBox), AssertionType.WARNING);
			}
			//slot3
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension3")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension3"), fetchValueFromList(underClaimsAttachExtension3DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension3")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension3"), fetchValueFromTextFields(subLimitAmountForExtension3TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension3")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension3"), fetchValueFromTextFields(deductibleAmountForExtension3TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension3")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension3"), fetchValueFromTextFields(extensionClaimAmountofExtension3TextBox), AssertionType.WARNING);
			}
			//slot4
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension4")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension4"), fetchValueFromList(underClaimsattachExtension4DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension4")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension4"), fetchValueFromTextFields(subLimitAmountForExtension4TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension4")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension4"), fetchValueFromTextFields(deductibleAmountForExtension4TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension4")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension4"), fetchValueFromTextFields(extensionClaimAmountOfExtension4TextBox), AssertionType.WARNING);
			}
			//slot5
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension5")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension5"), fetchValueFromList(underClaimsAttachExtension5DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension5")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension5"), fetchValueFromTextFields(subLimitAmountForExtension5TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension5")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension5"), fetchValueFromTextFields(deductibleAmountForExtension5TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension5")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension5"), fetchValueFromTextFields(extensionClaimAmountOfExtension5TextBox), AssertionType.WARNING);
			}
			//slot6
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension6")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension6"), fetchValueFromList(underClaimsattachExtension6DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension6")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension6"), fetchValueFromTextFields(subLimitAmountforExtension6TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension6")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension6"), fetchValueFromTextFields(deductibleAmountForExtension6TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension6")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension6"), fetchValueFromTextFields(extensionClaimAmountOfExtension6TextBox), AssertionType.WARNING);
			}

			//slot7
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension7")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension7"), fetchValueFromList(underClaimsattachExtension7DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension7")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension7"), fetchValueFromTextFields(subLimitAmountForExtension7TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension7")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension7"), fetchValueFromTextFields(deductibleAmountForExtension7TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension7")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension7"), fetchValueFromTextFields(extensionClaimAmountOfExtension7TextBox), AssertionType.WARNING);
			}

			//slot8
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension8")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension8"), fetchValueFromList(underClaimsAttachExtension8DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension8")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension8"), fetchValueFromTextFields(subLimitAmountForExtension8TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension8")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension8"), fetchValueFromTextFields(deductibleAmountForExtension8TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension8")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension8"), fetchValueFromTextFields(extensionClaimAmountOfExtension8TextBox), AssertionType.WARNING);
			}

			//slot9
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension9")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension9"), fetchValueFromList(underClaimsAttachExtension9DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension9")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension9"), fetchValueFromTextFields(sublimitAmountForExtension9TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension9")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension9"), fetchValueFromTextFields(deductibleAmountForExtension9TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension9")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension9"), fetchValueFromTextFields(extensionClaimAmountOfExtension9TextBox), AssertionType.WARNING);
			}
			//slot10
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtension10")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachExtension10"), fetchValueFromList(underClaimsAttachExtension10DropDown), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSubLimitAmountForExtension10")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("SubLimitAmountForExtension10"), fetchValueFromTextFields(subLimitAmountForExtension10TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDeductibleAmountForExtension10")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("DeductibleAmountForExtension10"), fetchValueFromTextFields(deductibleAmountForExtension10TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtension10")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ExtensionClaimAmountOfExtension10"), fetchValueFromTextFields(extensionClaimAmountofExtension10TextBox), AssertionType.WARNING);
			}

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimAmountForPolicy")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimAmountForPolicy"), fetchValueFromTextFields(claimAmountForPolicyTextBox), AssertionType.WARNING);
			}
			
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredCodeLabel), AssertionType.WARNING);
			}
		}
	}

	public void fillT4ClaimPropertyForLNDetails(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity, CustomAssert assertReference){
		if(t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("add") || t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("edit")){

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionliability2")) {
				selectValueFromList(underClaimsAttachAccidentalpollutionLiability2DropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionliability2"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationliability")) {
				selectValueFromList(underClaimsAttachTransportationLiabilityDropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachTransportationliability"));
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
				selectValueFromList(underClaimsAttachActOfGODDropDown, t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"));
			}
		}
		else if(t4ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("verify")){

			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionliability2")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionliability2"), fetchValueFromList(underClaimsAttachAccidentalpollutionLiability2DropDown), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationliability")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachTransportationliability"), fetchValueFromList(underClaimsAttachTransportationLiabilityDropDown), AssertionType.WARNING);
			}
			if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
				assertReference.assertEquals(t4ClaimPropLiab1MISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"), fetchValueFromList(underClaimsAttachActOfGODDropDown), AssertionType.WARNING);
			}
		}
		click(nextArrowButton);
		switchToFrame("display");
	}
	public void proceedToT2CLRForHealthProducts(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+t4ClaimPropLiab1MISEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItem")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttribute(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity){
		if (t4ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitT4ClaimPropertyForLiabMISLDetails(T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(t4ClaimPropLiab1MISEntity.getConfigExecute())){
			switchToFrame("display");
			if(t4ClaimPropLiab1MISEntity.getStringValueForField("Product").equalsIgnoreCase("LN")){
				fillT4ClaimPropertyForLNDetails(t4ClaimPropLiab1MISEntity, assertReference);
			}
			fillT4ClaimPropertyForLiab1MISLDetails(t4ClaimPropLiab1MISEntity, assertReference);
			proceedToT2CLRForHealthProducts(t4ClaimPropLiab1MISEntity);
			navigateToMainAttributePage(t4ClaimPropLiab1MISEntity);
			navigateToclaimHomePage(t4ClaimPropLiab1MISEntity);
			navigateToInsuredItem(t4ClaimPropLiab1MISEntity);
			navigateToDocument(t4ClaimPropLiab1MISEntity);
			navigateToParties(t4ClaimPropLiab1MISEntity);
			navigateToReserve(t4ClaimPropLiab1MISEntity);
			navigateToPayment(t4ClaimPropLiab1MISEntity);
			navigateToAttribute(t4ClaimPropLiab1MISEntity);
			navigateToInsuredItemDetails(t4ClaimPropLiab1MISEntity); // insureditem
			navigateToInsuredItemAttribute(t4ClaimPropLiab1MISEntity);
		}
	}
}

