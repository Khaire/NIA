package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.T4ClaimPropMISEntity;

public class T4ClaimPropertyForMIS extends BasePage {

	private PageElement t4ClaimPropertyForITTitle;
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;


	private PageElement claimTabTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;

	private PageElement  claimNumberLabel;
	private PageElement  policyNumberLabel;
	private PageElement  claimDateLabel;
	private PageElement  claimStatusLabel;
	private PageElement  productCodeLabel;
	private PageElement  causeOfLossLabel;
	private PageElement  insuredSerialNoLabel;
	private PageElement  insuredItemCodeLabel;

	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement  backArrowButton;
	private PageElement nextPageTitle;

	//LN
	private PageElement underClaimsAttachAccidentalPollutionLiability2DropDown;
	private PageElement subLimitOfAttachAccidentalPollutionLiabilityTextField;
	private PageElement extensionClaimAmountOfAccidentalPollutionLiability2TextField;
	private PageElement underClaimsAttachTransportationLiabilityDropDown;
	private PageElement subLimitOfAttachTransportationLiabilityTextField;
	private PageElement extensionClaimAmountOfTransportationLiabilityTextField;
	private PageElement underClaimsAttachActOfGODDropDown;
	private PageElement subLimitOfAttachActOfGODTextField;
	private PageElement extensionClaimAmountOfActofGODTextField;

	//IT
	private PageElement underClaimsAttachInfringementOfCopyrightTrademarksDropdown;
	private PageElement subLimitOfAttachInfringementOfCopyrightTrademarksTextfield;
	private PageElement extensionClaimAmountOfInfringementOfCopyrightTrademarksTextfield;
	private PageElement underClaimsAttachConsultantsSubContractorsAgentsDropdown;
	private PageElement subLimitOfAttachConsultantsSubContractorsAgentsTextfield;
	private PageElement extensionClaimAmountOfConsultantsSubContractorsAgentsTextfield;
	private PageElement underClaimsAttachJointVentureDropdown;
	private PageElement subLimitOfAttachJointVentureTextfield;
	private PageElement extensionClaimAmountOfJointVentureTextfield;
	private PageElement underClaimsAttachOutgoingPrincipalsDropdown;
	private PageElement subLimitOfAttachOutgoingPrincipalsTextfield;
	private PageElement extensionClaimAmountOfOutgoingPrincipalsTextfield;
	private PageElement underClaimsAttachUnauthorizedAccessDropdown;
	private PageElement subLimitOfAttachUnauthorizedAccessTextfield;
	private PageElement extensionClaimAmountOfUnauthorizedAccessTextfield;
	private PageElement underClaimsAttachExtendedClaimsReportingDropdown;
	private PageElement subLimitOfAttachExtendedClaimsReportingTextfield;
	private PageElement extensionClaimAmountOfExtendedClaimsReportingTextfield;
	private PageElement underClaimsAttachDishonestyOfEmployeesDropdown;
	private PageElement subLimitOfAttachDishonestyOfEmployeesTextfield;
	private PageElement extensionClaimAmountOfDishonestyOfEmployeesTextfield;
	private PageElement underClaimsAttachLossOfDocumentsDropdown;
	private PageElement subLimitOfAttachLossOfDocumentsTextfield;
	private PageElement extensionClaimAmountOfLossOfDocumentsTextfield;
	private PageElement underClaimsAttachOtherExtensionsDropdown;
	private PageElement subLimitOfOtherExtensionsTextfield;
	private PageElement extensionClaimAmountOfOtherExtensionsTextfield;

	public T4ClaimPropertyForMIS(WebDriver driver, String pageName) {
		super(driver, pageName);
		t4ClaimPropertyForITTitle = new PageElement(By.xpath("//div//b[contains(text(),'T4-Claim Property for IT')]"), "T4 Claim Property For IT Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured Item Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")), "Insured Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")), "Insured Item Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backArrowButton = new PageElement(By.name("Previous"), "Back Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//nextPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'T4-Claim Property for Liab 1')]"), "T4-Claim Property for Liab 1", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//LN
		underClaimsAttachAccidentalPollutionLiability2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Accidental pollution liability? -2')]/following::select"), "Under Claims attach Accidental pollution liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachAccidentalPollutionLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Accidental pollution liability')]/following::input"), "Sub Limit of attach Accidental pollution liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfAccidentalPollutionLiability2TextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Accidental Pollution Liability - 2')]/following::input"), "Extension Claim Amount of Accidental Pollution Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachTransportationLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Transportation liability?')]/following::select"), "Under Claims attach Transportation liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachTransportationLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Transportation liability')]/following::input"), "Sub Limit of attach Transportation liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfTransportationLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Transportation Liability')]/following::input"), "Extension Claim Amount of Transportation Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underClaimsAttachActOfGODDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Act of GOD?')]/following::select"), "Under Claims attach Act of GOD", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachActOfGODTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Act of GOD')]/following::input"), "Sub Limit of attach Act of GOD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionClaimAmountOfActofGODTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Act of GOD')]/following::input"), "Extension Claim Amount of Act of GOD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//IT
		underClaimsAttachInfringementOfCopyrightTrademarksDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Infringement of copyright, trademarks?')]/following::select"),"Under Claims Attach Infringement Of Copyright Trademarks Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachInfringementOfCopyrightTrademarksTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Infringement of copyright, trademarks')]/following::input"),"Sub Limit Of Attach Infringement Of Copyright Trademarks Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfInfringementOfCopyrightTrademarksTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Infringement of copyright, trademarks')]/following::input"),"Extension Claim Amount Of Infringement Of Copyright Trademarks Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachConsultantsSubContractorsAgentsDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Consultants, Sub-contractors, Agents?')]/following::select"),"Under Claims Attach Consultants Sub Contractors Agents Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachConsultantsSubContractorsAgentsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Consultants,Sub-contractors,Agents')]/following::input"),"Sub Limit Of Attach Consultants Sub Contractors Agents Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfConsultantsSubContractorsAgentsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Consultants, Sub-contractors, Agents')]/following::input"),"Extension Claim Amount Of Consultants Sub Contractors Agents Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachJointVentureDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Joint-Venture?')]/following::select"),"Under Claims Attach Joint Venture Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachJointVentureTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach joint-Venture')]/following::input"),"Sub Limit Of Attach Joint Venture Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfJointVentureTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Joint-Venture')]/following::input"),"Extension Claim Amount Of Joint Venture Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachOutgoingPrincipalsDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Outgoing Principals?')]/following::select"),"Under Claims attach Outgoing Principals?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachOutgoingPrincipalsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Outgoing Principals')]/following::input"),"Sub Limit of attach Outgoing Principals", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfOutgoingPrincipalsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Outgoing Principals')]/following::input"),"Extension Claim Amount of Outgoing Principals Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachUnauthorizedAccessDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Unauthorized Access?')]/following::select"),"Under Claims attach Unauthorized Access? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachUnauthorizedAccessTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Unauthorized Access')]/following::input"),"Sub Limit of attach Unauthorized Access Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfUnauthorizedAccessTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Unauthorized Access')]/following::input"),"Extension Claim Amount of Unauthorized Access Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachExtendedClaimsReportingDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Extended claims reporting?')]/following::select"),"Under Claims attach Extended claims reporting? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachExtendedClaimsReportingTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Extended claims reporting')]/following::input"),"Sub Limit of attach Extended claims reporting Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfExtendedClaimsReportingTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Extended claims reporting')]/following::input"),"Extension Claim Amount of Extended claims reporting Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachDishonestyOfEmployeesDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Dishonesty of Employees?')]/following::select"),"Under Claims attach Dishonesty of Employees? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachDishonestyOfEmployeesTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Dishonesty of Employees')]/following::input"),"Sub Limit of attach Dishonesty of Employees Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfDishonestyOfEmployeesTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Dishonesty of Employees')]/following::input"),"Extension Claim Amount of Dishonesty of Employees Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachLossOfDocumentsDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Loss of documents?')]/following::select"),"Under Claims attach Loss of documents? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfAttachLossOfDocumentsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of attach Loss of documents')]/following::input"),"Sub Limit of attach Loss of documents Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfLossOfDocumentsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Loss of documents')]/following::input"),"Extension Claim Amount of Loss of documents Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underClaimsAttachOtherExtensionsDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Under Claims attach Other extensions?')]/following::select"),"Under Claims attach Other extensions? Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subLimitOfOtherExtensionsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sub Limit of Other extensions')]/following::input"),"Sub Limit of Other extensions Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionClaimAmountOfOtherExtensionsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Extension Claim Amount of Other Extensions')]/following::input"),"Extension Claim Amount of Other Extensions Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillT4ClaimPropertyForITDetails(T4ClaimPropMISEntity t4ClaimPropMISEntity, CustomAssert assertReference) throws InterruptedException{

		if(t4ClaimPropMISEntity.getAction().equalsIgnoreCase("add") || t4ClaimPropMISEntity.getAction().equalsIgnoreCase("edit")){
			//LN
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability2")) {
				selectValueFromList(underClaimsAttachAccidentalPollutionLiability2DropDown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability2"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachAccidentalPollutionLiability")) {
				clearAndSendKeys(subLimitOfAttachAccidentalPollutionLiabilityTextField, t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachAccidentalPollutionLiability"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability2")) {
				clearAndSendKeys(extensionClaimAmountOfAccidentalPollutionLiability2TextField, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability2"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationLiability")) {
				selectValueFromList(underClaimsAttachTransportationLiabilityDropDown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachTransportationLiability"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTransportationLiability")) {
				clearAndSendKeys(subLimitOfAttachTransportationLiabilityTextField, t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachTransportationLiability"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTransportationLiability")) {
				clearAndSendKeys(extensionClaimAmountOfTransportationLiabilityTextField, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfTransportationLiability"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
				selectValueFromList(underClaimsAttachActOfGODDropDown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachActOfGOD")) {
				clearAndSendKeys(subLimitOfAttachActOfGODTextField, t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachActOfGOD"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActofGOD")) {
				clearAndSendKeys(extensionClaimAmountOfActofGODTextField, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfActofGOD"));
			}
			//IT
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachInfringementOfCopyrightTrademarks")) {
				selectValueFromList(underClaimsAttachInfringementOfCopyrightTrademarksDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachInfringementOfCopyrightTrademarks"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInfringementOfCopyrightTrademarks")) {
				clearAndSendKeys(extensionClaimAmountOfInfringementOfCopyrightTrademarksTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfInfringementOfCopyrightTrademarks"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachConsultantsSubContractorsAgents")) {
				selectValueFromList(underClaimsAttachConsultantsSubContractorsAgentsDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachConsultantsSubContractorsAgents"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfConsultantsSubContractorsAgents")) {
				clearAndSendKeys(extensionClaimAmountOfConsultantsSubContractorsAgentsTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfConsultantsSubContractorsAgents"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachJointVenture")) {
				selectValueFromList(underClaimsAttachJointVentureDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachJointVenture"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointVenture")) {
				clearAndSendKeys(extensionClaimAmountOfJointVentureTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfJointVenture"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOutgoingPrincipals")) {
				selectValueFromList(underClaimsAttachOutgoingPrincipalsDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachOutgoingPrincipals"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOutgoingPrincipals")) {
				clearAndSendKeys(extensionClaimAmountOfOutgoingPrincipalsTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfOutgoingPrincipals"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachUnauthorizedAccess")) {
				selectValueFromList(underClaimsAttachUnauthorizedAccessDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachUnauthorizedAccess"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfUnauthorizedAccess")) {
				clearAndSendKeys(extensionClaimAmountOfUnauthorizedAccessTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfUnauthorizedAccess"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtendedClaimsReporting")) {
				selectValueFromList(underClaimsAttachExtendedClaimsReportingDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachExtendedClaimsReporting"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtendedClaimsReporting")) {
				clearAndSendKeys(extensionClaimAmountOfExtendedClaimsReportingTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfExtendedClaimsReporting"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachDishonestyOfEmployees")) {
				selectValueFromList(underClaimsAttachDishonestyOfEmployeesDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachDishonestyOfEmployees"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDishonestyOfEmployees")) {
				clearAndSendKeys(extensionClaimAmountOfDishonestyOfEmployeesTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfDishonestyOfEmployees"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachLossOfDocuments")) {
				selectValueFromList(underClaimsAttachLossOfDocumentsDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachLossOfDocuments"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfLossOfDocuments")) {
				clearAndSendKeys(extensionClaimAmountOfLossOfDocumentsTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfLossOfDocuments"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOtherExtensions")) {
				selectValueFromList(underClaimsAttachOtherExtensionsDropdown, t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachOtherExtensions"));
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOtherExtensions")) {
				clearAndSendKeys(extensionClaimAmountOfOtherExtensionsTextfield, t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfOtherExtensions"));
			}

		}
		else if(t4ClaimPropMISEntity.getAction().equalsIgnoreCase("verify")){
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigInsuredSerialNoLabel")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("InsuredSerialNoLabel"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigInsuredItemCodeLabel")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("InsuredItemCodeLabel"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability2")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability2"), fetchValueFromList(underClaimsAttachAccidentalPollutionLiability2DropDown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachAccidentalPollutionLiability")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachAccidentalPollutionLiability"), fetchValueFromTextFields(subLimitOfAttachAccidentalPollutionLiabilityTextField), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability2")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability2"), fetchValueFromTextFields(extensionClaimAmountOfAccidentalPollutionLiability2TextField), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationLiability")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachTransportationLiability"), fetchValueFromList(underClaimsAttachTransportationLiabilityDropDown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTransportationLiability")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachTransportationLiability"), fetchValueFromTextFields(subLimitOfAttachTransportationLiabilityTextField), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTransportationLiability")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfTransportationLiability"), fetchValueFromTextFields(extensionClaimAmountOfTransportationLiabilityTextField), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"), fetchValueFromList(underClaimsAttachActOfGODDropDown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachActOfGOD")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachActOfGOD"), fetchValueFromTextFields(subLimitOfAttachActOfGODTextField), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActofGOD")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfActofGOD"), fetchValueFromTextFields(extensionClaimAmountOfActofGODTextField), AssertionType.WARNING);
			}
			if(t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachInfringementOfCopyrightTrademarks")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachInfringementOfCopyrightTrademarks"),fetchValueFromList(underClaimsAttachInfringementOfCopyrightTrademarksDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachInfringementOfCopyrightTrademarks")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachInfringementOfCopyrightTrademarks"),fetchValueFromTextFields(subLimitOfAttachInfringementOfCopyrightTrademarksTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfInfringementOfCopyrightTrademarks")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfInfringementOfCopyrightTrademarks"),fetchValueFromTextFields(extensionClaimAmountOfInfringementOfCopyrightTrademarksTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachConsultantsSubContractorsAgents")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachConsultantsSubContractorsAgents"),fetchValueFromList(underClaimsAttachConsultantsSubContractorsAgentsDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachConsultantsSubContractorsAgents")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachConsultantsSubContractorsAgents"),fetchValueFromTextFields(subLimitOfAttachConsultantsSubContractorsAgentsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfConsultantsSubContractorsAgents")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfConsultantsSubContractorsAgents"),fetchValueFromTextFields(extensionClaimAmountOfConsultantsSubContractorsAgentsTextfield), AssertionType.WARNING);
			}	
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachJointVenture")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachJointVenture"),fetchValueFromList(underClaimsAttachJointVentureDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachJointVenture")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachJointVenture"),fetchValueFromTextFields(subLimitOfAttachJointVentureTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfJointVenture")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfJointVenture"),fetchValueFromTextFields(extensionClaimAmountOfJointVentureTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOutgoingPrincipals")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachOutgoingPrincipals"),fetchValueFromList(underClaimsAttachOutgoingPrincipalsDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachOutgoingPrincipals")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachOutgoingPrincipals"),fetchValueFromTextFields(subLimitOfAttachOutgoingPrincipalsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOutgoingPrincipals")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfOutgoingPrincipals"),fetchValueFromTextFields(extensionClaimAmountOfOutgoingPrincipalsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachUnauthorizedAccess")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachUnauthorizedAccess"),fetchValueFromList(underClaimsAttachUnauthorizedAccessDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachUnauthorizedAccess")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachUnauthorizedAccess"),fetchValueFromTextFields(subLimitOfAttachUnauthorizedAccessTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfUnauthorizedAccess")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfUnauthorizedAccess"),fetchValueFromTextFields(extensionClaimAmountOfUnauthorizedAccessTextfield), AssertionType.WARNING);
			}			
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachExtendedClaimsReporting")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachExtendedClaimsReporting"),fetchValueFromList(underClaimsAttachExtendedClaimsReportingDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachExtendedClaimsReporting")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachExtendedClaimsReporting"),fetchValueFromTextFields(subLimitOfAttachExtendedClaimsReportingTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfExtendedClaimsReporting")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfExtendedClaimsReporting"),fetchValueFromTextFields(extensionClaimAmountOfExtendedClaimsReportingTextfield), AssertionType.WARNING);
			}			
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachDishonestyOfEmployees")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachDishonestyOfEmployees"),fetchValueFromList(underClaimsAttachDishonestyOfEmployeesDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachDishonestyOfEmployees")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachDishonestyOfEmployees"),fetchValueFromTextFields(subLimitOfAttachDishonestyOfEmployeesTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfDishonestyOfEmployees")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfDishonestyOfEmployees"),fetchValueFromTextFields(extensionClaimAmountOfDishonestyOfEmployeesTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachLossOfDocuments")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachLossOfDocuments"),fetchValueFromList(underClaimsAttachLossOfDocumentsDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachLossOfDocuments")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfAttachLossOfDocuments"),fetchValueFromTextFields(subLimitOfAttachLossOfDocumentsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfLossOfDocuments")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfLossOfDocuments"),fetchValueFromTextFields(extensionClaimAmountOfLossOfDocumentsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachOtherExtensions")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("UnderClaimsAttachOtherExtensions"),fetchValueFromList(underClaimsAttachOtherExtensionsDropdown), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigSubLimitOfOtherExtensions")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("SubLimitOfOtherExtensions"),fetchValueFromTextFields(subLimitOfOtherExtensionsTextfield), AssertionType.WARNING);
			}
			if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfOtherExtensions")) {
				assertReference.assertEquals(t4ClaimPropMISEntity.getStringValueForField("ExtensionClaimAmountOfOtherExtensions"),fetchValueFromTextFields(extensionClaimAmountOfOtherExtensionsTextfield), AssertionType.WARNING);
			}
		}
	}
	public void proceedToT5ClaimPropertyForLiab2(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+t4ClaimPropMISEntity.getStringValueForField("ClaimInsurT4ClaimPropForITAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTitle);
		}
	}
	public void navigateToDocument(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetail(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}

	public void navigateToInsuredItemAttribute(T4ClaimPropMISEntity t4ClaimPropMISEntity){
		if (t4ClaimPropMISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimMemberT1CLRAttibutesHealth(T4ClaimPropMISEntity t4ClaimPropMISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(t4ClaimPropMISEntity.getConfigExecute())){
			switchToFrame("display");
			fillT4ClaimPropertyForITDetails(t4ClaimPropMISEntity, assertReference);
			proceedToT5ClaimPropertyForLiab2(t4ClaimPropMISEntity);
			navigateToclaimHomePage(t4ClaimPropMISEntity);
			navigateToInsuredItem(t4ClaimPropMISEntity);
			navigateToDocument(t4ClaimPropMISEntity);
			navigateToParties(t4ClaimPropMISEntity);
			navigateToReserve(t4ClaimPropMISEntity);
			navigateToPayment(t4ClaimPropMISEntity);
			navigateToAttribute(t4ClaimPropMISEntity);
			navigateToInsuredItemDetail(t4ClaimPropMISEntity);
			navigateToInsuredItemAttribute(t4ClaimPropMISEntity);
		}
	}
}
