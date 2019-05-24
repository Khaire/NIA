package com.aqm.staf.library.pages.miscLiability;

import com.aqm.staf.framework.core.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.T3ClaimPropLNMISEntity;
import com.aqm.staf.library.databin.T4ClaimPropLNMISEntity;
public class T4ClaimPropertyForLNMIS extends BasePage{
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
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement nextPageTitle;
	
	private PageElement  claimNumberLabel;
	private PageElement  policyNumberLabel;
	private PageElement  claimDateLabel;
	private PageElement  claimStatusLabel;
	private PageElement  productCodeLabel;
	private PageElement  causeOfLossLabel;
	private PageElement  memberSerialNoLabel;
	private PageElement  memberCodeLabel;
	private PageElement  applicableEventCodeLabel;
	
	private PageElement nextArrowButton;
	private PageElement backButton;
	//DIGVIJAY Prod -LN
		private PageElement insuredSerialNoLabel;
		private PageElement insuredItemCodeLabel;
		
		//DIGVIJAY Prod LN T4
		private PageElement underClaimsAttachAccidentalPollutionLiability2DropDown;
		private PageElement subLimitOfAttachAccidentalPollutionLiabilityTextField;
		private PageElement extensionClaimAmountOfAccidentalPollutionLiability2TextField;
		private PageElement underClaimsAttachTransportationLiabilityDropDown;
		private PageElement subLimitOfAttachTransportationLiabilityTextField;
		private PageElement extensionClaimAmountOfTransportationLiabilityTextField;
		private PageElement underClaimsAttachActOfGODDropDown;
		private PageElement subLimitOfAttachActOfGODTextField;
		private PageElement extensionClaimAmountOfActofGODTextField;
		public T4ClaimPropertyForLNMIS(WebDriver driver, String pageName) {
			super(driver, pageName);
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
			policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")), "Insured Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			insuredItemCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")), "Insured Item Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

			nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
			backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
			//digvijay LN T4
			underClaimsAttachAccidentalPollutionLiability2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Accidental pollution liability? -2')]/following::select"), "Under Claims attach Accidental pollution liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			subLimitOfAttachAccidentalPollutionLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Accidental pollution liability')]/following::input"), "Sub Limit of attach Accidental pollution liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfAccidentalPollutionLiability2TextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Accidental Pollution Liability - 2')]/following::input"), "Extension Claim Amount of Accidental Pollution Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			underClaimsAttachTransportationLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Transportation liability?')]/following::select"), "Under Claims attach Transportation liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			subLimitOfAttachTransportationLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Transportation liability')]/following::input"), "Sub Limit of attach Transportation liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfTransportationLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Transportation Liability')]/following::input"), "Extension Claim Amount of Transportation Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			underClaimsAttachActOfGODDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Under Claims attach Act of GOD?')]/following::select"), "Under Claims attach Act of GOD", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			subLimitOfAttachActOfGODTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of attach Act of GOD')]/following::input"), "Sub Limit of attach Act of GOD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			extensionClaimAmountOfActofGODTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Claim Amount of Act of GOD')]/following::input"), "Extension Claim Amount of Act of GOD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
		
		public void fillT3ClaimPropertyForLNMIS(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity, CustomAssert assertReference) throws InterruptedException{

			if(t4ClaimPropLNMISEntity.getAction().equalsIgnoreCase("add") || t4ClaimPropLNMISEntity.getAction().equalsIgnoreCase("edit")){
				
				//digvijay LN T4
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability2")) {
					selectValueFromList(underClaimsAttachAccidentalPollutionLiability2DropDown, t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability2"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachAccidentalPollutionLiability")) {
					clearAndSendKeys(subLimitOfAttachAccidentalPollutionLiabilityTextField, t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachAccidentalPollutionLiability"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability2")) {
					clearAndSendKeys(extensionClaimAmountOfAccidentalPollutionLiability2TextField, t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability2"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationLiability")) {
					selectValueFromList(underClaimsAttachTransportationLiabilityDropDown, t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachTransportationLiability"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTransportationLiability")) {
					clearAndSendKeys(subLimitOfAttachTransportationLiabilityTextField, t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachTransportationLiability"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTransportationLiability")) {
					clearAndSendKeys(extensionClaimAmountOfTransportationLiabilityTextField, t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfTransportationLiability"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
					selectValueFromList(underClaimsAttachActOfGODDropDown, t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachActOfGOD")) {
					clearAndSendKeys(subLimitOfAttachActOfGODTextField, t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachActOfGOD"));
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActofGOD")) {
					clearAndSendKeys(extensionClaimAmountOfActofGODTextField, t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfActofGOD"));
				}


			}
			else if(t4ClaimPropLNMISEntity.getAction().equalsIgnoreCase("verify")){
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigInsuredSerialNoLabel")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("InsuredSerialNoLabel"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
		
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigInsuredItemCodeLabel")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("InsuredItemCodeLabel"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				//Digvijay LN-  T4
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachAccidentalPollutionLiability2")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachAccidentalPollutionLiability2"), fetchValueFromList(underClaimsAttachAccidentalPollutionLiability2DropDown), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachAccidentalPollutionLiability")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachAccidentalPollutionLiability"), fetchValueFromTextFields(subLimitOfAttachAccidentalPollutionLiabilityTextField), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfAccidentalPollutionLiability2")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfAccidentalPollutionLiability2"), fetchValueFromTextFields(extensionClaimAmountOfAccidentalPollutionLiability2TextField), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachTransportationLiability")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachTransportationLiability"), fetchValueFromList(underClaimsAttachTransportationLiabilityDropDown), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachTransportationLiability")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachTransportationLiability"), fetchValueFromTextFields(subLimitOfAttachTransportationLiabilityTextField), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfTransportationLiability")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfTransportationLiability"), fetchValueFromTextFields(extensionClaimAmountOfTransportationLiabilityTextField), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigUnderClaimsAttachActOfGOD")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("UnderClaimsAttachActOfGOD"), fetchValueFromList(underClaimsAttachActOfGODDropDown), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigSubLimitOfAttachActOfGOD")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("SubLimitOfAttachActOfGOD"), fetchValueFromTextFields(subLimitOfAttachActOfGODTextField), AssertionType.WARNING);
				}
				if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigExtensionClaimAmountOfActofGOD")) {
					assertReference.assertEquals(t4ClaimPropLNMISEntity.getStringValueForField("ExtensionClaimAmountOfActofGOD"), fetchValueFromTextFields(extensionClaimAmountOfActofGODTextField), AssertionType.WARNING);
				}

			}
		}
		
		//*******
		public void proceedToT2CLRForHealthProducts(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigProceedButton")){		
				click(nextArrowButton);
				switchToFrame("display");
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+t4ClaimPropLNMISEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}	
		public void navigateToMainAttributePage(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigBackButton")){		
				click(backButton);
				switchToFrame("display");
			    isElementDisplayed(attributesTabTitle);
			}
		}	
		public void navigateToclaimHomePage(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigClaimTab")){		
				click(claimTab);
				switchToFrame("display");
				isElementDisplayed(claimTabTitle);
			}
		}

		public void navigateToInsuredItem(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigInsuredItem")){		
				click(insuredItemTab);
				switchToFrame("display");
				isElementDisplayed(insuredItemTabTitle);
			}
		}
		public void navigateToDocument(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigDocumentTab")){		
				click(documentTab);
				switchToFrame("display");
				isElementDisplayed(documentTabTitle);
			}
		}
		public void navigateToParties(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigPartiesTab")){		
				click(partiesTab);
				switchToFrame("display");
				isElementDisplayed(partiesTabTitle);
			}
		}
		public void navigateToReserve(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigReserveTab")){		
				click(reserveTab);
				switchToFrame("display");
				isElementDisplayed(reserveTabTitle);
			}
		}

		public void navigateToPayment(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigPaymentTab")){		
				click(paymentTab);
				switchToFrame("display");
				isElementDisplayed(paymentTabTitle);
			}
		}

		public void navigateToAttribute(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigAttributesTab")){		
				click(attributesTab);
				switchToFrame("display");
				isElementDisplayed(attributesTabTitle);
			}
		}
		public void navigateToInsuredItemDetails(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
				click(insuredItemDetailsTab);
				switchToFrame("display");
				isElementDisplayed(insuredItemrDetailsTabTitle);
			}
		}
		public void navigateToInsuredItemAttribute(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity){
			if (t4ClaimPropLNMISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
				click(insuredItemAttributeTab);
				switchToFrame("display");
				isElementDisplayed(insuredItemrAttributeTabTitle);
			}
		}
		
		public void fillandSubmitT3ClaimPropertyForSTMIS(T4ClaimPropLNMISEntity t4ClaimPropLNMISEntity, CustomAssert assertReference) throws InterruptedException {
			if (isConfigTrue(t4ClaimPropLNMISEntity.getConfigExecute())){
				switchToFrame("display");
				fillT3ClaimPropertyForLNMIS(t4ClaimPropLNMISEntity, assertReference);
				proceedToT2CLRForHealthProducts(t4ClaimPropLNMISEntity);
				navigateToMainAttributePage(t4ClaimPropLNMISEntity);
				navigateToclaimHomePage(t4ClaimPropLNMISEntity);
				navigateToInsuredItem(t4ClaimPropLNMISEntity);  // insureditem
				navigateToDocument(t4ClaimPropLNMISEntity);
				navigateToParties(t4ClaimPropLNMISEntity);
				navigateToReserve(t4ClaimPropLNMISEntity);
				navigateToPayment(t4ClaimPropLNMISEntity);
				navigateToAttribute(t4ClaimPropLNMISEntity);
				navigateToInsuredItemDetails(t4ClaimPropLNMISEntity); // insureditem
				navigateToInsuredItemAttribute(t4ClaimPropLNMISEntity);
			}
		}
}
