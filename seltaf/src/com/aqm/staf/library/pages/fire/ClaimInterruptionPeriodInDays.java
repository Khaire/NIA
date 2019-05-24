package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InterPeriodInDaysEntity;


public class ClaimInterruptionPeriodInDays  extends BasePage{


	private PageElement interruptionPeriodindaysTextField;
	private PageElement	lossContributionAmountUtilitiesPowerTextField;
	private PageElement	lossContributionAmountUtilitiesWaterTextField;
	private PageElement	lossContributionAmountUtilitiesGasTextField;
	private PageElement	lossContributionAmountUtilitiesAirTextField;
	private PageElement	lossContributionAmountUtilitiesSteamTextField;
	private PageElement	lossContributionAmountUtilitiesSuPPlierExtensionTextField;
	private PageElement	lossContributionAmountUtilitiesCustomersExtensionTextField;
	private PageElement	lossContributionAmountUtilitiesEarthquakeTextField;
	private PageElement	lossContributionAmountUtilitiessPoilageofClcoverTextField;
	private PageElement	lossContributionAmountUtilitiesStoragelocationoutsidemanufacturingPremisesTextField;
	private PageElement	lossContributionAmountUtilitiesanyotherTextField;
	private PageElement	lossContributionPercentageUtilitiesPowerTextField;
	private PageElement	lossContributionPercentageUtilitiesWaterTextField;
	private PageElement	lossContributionPercentageUtilitiesGasTextField;
	private PageElement	lossContributionPercentageUtilitiesAirTextField;
	private PageElement	lossContributionPercentageUtilitiesSteamTextField;
	private PageElement	lossContributionPercentageUtilitiesSuPPlierExtensionTextField;
	private PageElement	lossContributionPercentageUtilitiesCustomerExtensionTextField;
	private PageElement	lossContributionPercentageUtilitiesEarthquakeTextField;
	private PageElement	lossContributionPercentageUtilitiesForClCoverTextField;
	private PageElement	lossContributionPercentageUtilitiesStorageLocationTextField;
	private PageElement	lossContributionPercentageUtilitiesAnyotherTextField;
	private PageElement	timeExcessInDaysTextField;

	//old
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
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement miscNonT1CLRTitle;
	private PageElement nextPageTitle;
	private PageElement commonClaimRiskPropertyTitle;


	public ClaimInterruptionPeriodInDays(WebDriver driver, String pageName){
		super(driver, pageName);


		interruptionPeriodindaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Interruption period in days')]/following::input"),"Interruption period in days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesPowerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Power')]/following::input"),"Power", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesWaterTextField=new PageElement(By.xpath("//td//div[contains(text(),'Water')]/following::input"),"Water", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesGasTextField=new PageElement(By.xpath("//td//div[contains(text(),'Gas')]/following::input"),"Gas", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesAirTextField=new PageElement(By.xpath("//td//div[contains(text(),'Air')]/following::input"),"Air", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesSteamTextField=new PageElement(By.xpath("//td//div[contains(text(),'Steam')]/following::input"),"Steam", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesSuPPlierExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Supplier Extension')]/following::input"),"Supplier Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesCustomersExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Customers Extension')]/following::input"),"Customers Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesEarthquakeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake')]/following::input"),"Earthquake", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiessPoilageofClcoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'spoilage of CL cover')]/following::input"), "spoilage of CL cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesStoragelocationoutsidemanufacturingPremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage location outside manufacturing premises')]/following::input"),"Storage location outside manufacturing premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionAmountUtilitiesanyotherTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution Amount Utilities any other')]/following::input"),"Loss Contribution Amount Utilities any other", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesPowerTextField=new PageElement(By.xpath("//td//div[@id='Loss Contribution percentage Utilities  Power']/following::input"),"Loss Contribution percentage Utilities  Power", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesWaterTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Water')]/following::input"),"Loss Contribution percentage Utilities Water", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesGasTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Gas')]/following::input"),"Loss Contribution percentage Utilities Gas", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesAirTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Air')]/following::input"),"Loss Contribution percentage Utilities Air", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesSteamTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Steam')]/following::input"),"Loss Contribution percentage Utilities Steam", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesSuPPlierExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Supplier Extension')]/following::input"),"Loss Contribution percentage Utilities Supplier Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesCustomerExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Customer Extension')]/following::input"),"Loss Contribution percentage Utilities Customer Extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesEarthquakeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Earthquake')]/following::input"),"Loss Contribution percentage Utilities Earthquake", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesForClCoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities for CL Cover')]/following::input"),"Loss Contribution percentage Utilities for CL Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesStorageLocationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities Storage location outside manufacturing premises')]/following::input"),"Loss Contribution percentage Utilities Storage location outside manufacturing premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossContributionPercentageUtilitiesAnyotherTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Contribution percentage Utilities any other')]/following::input"),"Loss Contribution percentage Utilities any other", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeExcessInDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time Excess in days')]/following::input"),"Time Excess in days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//old
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		commonClaimRiskPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), " Common Claim Risk Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next1"), "forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillClaimInterruptionPeriodInDaysDetails(InterPeriodInDaysEntity  interPeriodInDaysEntity, CustomAssert assertReference) throws InterruptedException{
		if(interPeriodInDaysEntity.getAction().equalsIgnoreCase("add") || interPeriodInDaysEntity.getAction().equalsIgnoreCase("edit")){
			//**********4th PAGE AR(CHINTAN)********** 

			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInterruptionPeriodindays")) {
				clearAndSendKeys(interruptionPeriodindaysTextField, interPeriodInDaysEntity.getStringValueForField("InterruptionPeriodindays"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesPower")) {
				clearAndSendKeys(lossContributionAmountUtilitiesPowerTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesPower"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesWater")) {
				clearAndSendKeys(lossContributionAmountUtilitiesWaterTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesWater"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesGas")) {
				clearAndSendKeys(lossContributionAmountUtilitiesGasTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesGas"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesAir")) {
				clearAndSendKeys(lossContributionAmountUtilitiesAirTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesAir"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesSteam")) {
				clearAndSendKeys(lossContributionAmountUtilitiesSteamTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesSteam"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesSuPPlierExtension")) {
				clearAndSendKeys(lossContributionAmountUtilitiesSuPPlierExtensionTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesSuPPlierExtension"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesCustomersExtension")) {
				clearAndSendKeys(lossContributionAmountUtilitiesCustomersExtensionTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesCustomersExtension"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesEarthquake")) {
				clearAndSendKeys(lossContributionAmountUtilitiesEarthquakeTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesEarthquake"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiessPoilageofClcover")) {
				clearAndSendKeys(lossContributionAmountUtilitiessPoilageofClcoverTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiessPoilageofClcover"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtiLitiesStorageLocationoutsidemanufacturingPremises")) {
				clearAndSendKeys(lossContributionAmountUtilitiesStoragelocationoutsidemanufacturingPremisesTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtiLitiesStorageLocationoutsidemanufacturingPremises"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtiLitiesanyother")) {
				clearAndSendKeys(lossContributionAmountUtilitiesanyotherTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtiLitiesanyother"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesPower")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesPowerTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesPower"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesWater")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesWaterTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesWater"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesGas")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesGasTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesGas"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesAir")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesAirTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesAir"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesSteam")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesSteamTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesSteam"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesSuPPLierExtension")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesSuPPlierExtensionTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesSuPPLierExtension"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesCustomerExtension")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesCustomerExtensionTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesCustomerExtension"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesEarthquake")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesEarthquakeTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesEarthquake"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesForCLCover")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesForClCoverTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesForCLCover"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesStorageLocation")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesStorageLocationTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesStorageLocation"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesAnyother")) {
				clearAndSendKeys(lossContributionPercentageUtilitiesAnyotherTextField, interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesAnyother"));
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigTimeExcessInDays")) {
				clearAndSendKeys(timeExcessInDaysTextField, interPeriodInDaysEntity.getStringValueForField("TimeExcessInDays"));
			}
		}
		else if(interPeriodInDaysEntity.getAction().equalsIgnoreCase("verify")){
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//**********4th PAGE AR(CHINTAN)********** 
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInterruptionPeriodindays")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("InterruptionPeriodindays"),fetchValueFromTextFields(interruptionPeriodindaysTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesPower")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesPower"),fetchValueFromTextFields(lossContributionAmountUtilitiesPowerTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesWater")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesWater"),fetchValueFromTextFields(lossContributionAmountUtilitiesWaterTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesGas")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesGas"),fetchValueFromTextFields(lossContributionAmountUtilitiesGasTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesAir")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesAir"),fetchValueFromTextFields(lossContributionAmountUtilitiesAirTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesSteam")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesSteam"),fetchValueFromTextFields(lossContributionAmountUtilitiesSteamTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesSuPPlierExtension")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesSuPPlierExtension"),fetchValueFromTextFields(lossContributionAmountUtilitiesSuPPlierExtensionTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesCustomersExtension")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesCustomersExtension"),fetchValueFromTextFields(lossContributionAmountUtilitiesCustomersExtensionTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiesEarthquake")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiesEarthquake"),fetchValueFromTextFields(lossContributionAmountUtilitiesEarthquakeTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtilitiessPoilageofClcover")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtilitiessPoilageofClcover"),fetchValueFromTextFields(lossContributionAmountUtilitiessPoilageofClcoverTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtiLitiesStorageLocationoutsidemanufacturingPremises")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtiLitiesStorageLocationoutsidemanufacturingPremises"),fetchValueFromTextFields(lossContributionAmountUtilitiesStoragelocationoutsidemanufacturingPremisesTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionAmountUtiLitiesanyother")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionAmountUtiLitiesanyother"),fetchValueFromTextFields(lossContributionAmountUtilitiesanyotherTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesPower")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesPower"),fetchValueFromTextFields(lossContributionPercentageUtilitiesPowerTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesWater")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesWater"),fetchValueFromTextFields(lossContributionPercentageUtilitiesWaterTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesGas")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesGas"),fetchValueFromTextFields(lossContributionPercentageUtilitiesGasTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesAir")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesAir"),fetchValueFromTextFields(lossContributionPercentageUtilitiesAirTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesSteam")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesSteam"),fetchValueFromTextFields(lossContributionPercentageUtilitiesSteamTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesSuPPLierExtension")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesSuPPLierExtension"),fetchValueFromTextFields(lossContributionPercentageUtilitiesSuPPlierExtensionTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesCustomerExtension")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesCustomerExtension"),fetchValueFromTextFields(lossContributionPercentageUtilitiesCustomerExtensionTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesEarthquake")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesEarthquake"),fetchValueFromTextFields(lossContributionPercentageUtilitiesEarthquakeTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesForCLCover")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesForCLCover"),fetchValueFromTextFields(lossContributionPercentageUtilitiesForClCoverTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesStorageLocation")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesStorageLocation"),fetchValueFromTextFields(lossContributionPercentageUtilitiesStorageLocationTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigLossContributionPercentageUtiLitiesAnyother")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("LossContributionPercentageUtiLitiesAnyother"),fetchValueFromTextFields(lossContributionPercentageUtilitiesAnyotherTextField), AssertionType.WARNING);
			}
			if (interPeriodInDaysEntity.getBooleanValueForField("ConfigTimeExcessInDays")) {
				assertReference.assertEquals(interPeriodInDaysEntity.getStringValueForField("TimeExcessInDays"),fetchValueFromTextFields(timeExcessInDaysTextField), AssertionType.WARNING);
			}
		}

	}
	//old
	public void navigateNextToCommonClaimRiskProperty(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+interPeriodInDaysEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigatePreviousToCommonClaimRiskProperty(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(miscNonT1CLRTitle);			}
	}	
	public void navigateToMainAttributePage(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void SubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(InterPeriodInDaysEntity  interPeriodInDaysEntity){
		if (interPeriodInDaysEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(commonClaimRiskPropertyTitle);
		}
	}
	public void fillandSubmitClaimInterruptionPeriodInDaysDetails(InterPeriodInDaysEntity  interPeriodInDaysEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(interPeriodInDaysEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimInterruptionPeriodInDaysDetails(interPeriodInDaysEntity, assertReference);
			navigateNextToCommonClaimRiskProperty(interPeriodInDaysEntity);
			navigateToMainAttributePage(interPeriodInDaysEntity);
			navigateToclaimHomePage(interPeriodInDaysEntity);
			navigateToInsuredItem(interPeriodInDaysEntity);
			navigateToDocument(interPeriodInDaysEntity);
			navigateToParties(interPeriodInDaysEntity);
			navigateToReserve(interPeriodInDaysEntity);
			navigateToPayment(interPeriodInDaysEntity);
			navigateToAttribute(interPeriodInDaysEntity);
			navigateToInsuredItemDetails(interPeriodInDaysEntity);
			navigateTInsuredItemAttribute(interPeriodInDaysEntity);


		}
	}

}