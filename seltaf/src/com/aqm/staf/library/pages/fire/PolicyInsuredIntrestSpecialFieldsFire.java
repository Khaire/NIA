package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntSpeFieldsFireEntity;

public class PolicyInsuredIntrestSpecialFieldsFire extends BasePage {

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
	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement insuredInterestDocumentsTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	//Mayur_Product name=AR
	private PageElement typeOfConstructionDropDown;
	private PageElement heightOfTheBuildingMetersTextField;
	private PageElement ageOfTheBuildingYearsTextField;
	private PageElement portableExtinguishersDropDown;
	private PageElement smallBoreHoseReelsDropDown;
	private PageElement trailerPumpsFireEnginesDropDown;
	private PageElement hydrantSystemDropDown;
	private PageElement sprinklerSystemFireDropDown;
	private PageElement fixedWaterSpraySystemDropDown;
	private PageElement foamSystemsDropDown;
	private PageElement fireAlarmSystemsDropDown;
	private PageElement gasFloodingSystemsDropDown;
	private PageElement spotProtectionDropDown;
	private PageElement otherProtectionNotSpecifiedAboveDropDown;
	private PageElement pleaseProvideTheFireProtectionDetailsTextArea;
	private PageElement electricalRegulationDropDown;

	public PolicyInsuredIntrestSpecialFieldsFire(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Documents Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_Product name=AR
		typeOfConstructionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of construction')]/following::select"), "Type of construction DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		heightOfTheBuildingMetersTextField= new PageElement(By.xpath("//td//div[contains(text(),'Height of the Building (Meters)')]/following::input"), "Height of the Building (Meters) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfTheBuildingYearsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Age of the Building (Years)')]/following::input"), "Age of the Building (Years) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portableExtinguishersDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Portable Extinguishers')]/following::select"), "Portable Extinguishers DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		smallBoreHoseReelsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Small bore hose reels')]/following::select"), "Small bore hose reels DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		trailerPumpsFireEnginesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Trailer Pumps,Fire Engines')]/following::select"), "Trailer Pumps,Fire Engines DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hydrantSystemDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Hydrant System')]/following::select"), "Hydrant System DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sprinklerSystemFireDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Sprinkler System(Fire)')]/following::select"), "Sprinkler System(Fire) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fixedWaterSpraySystemDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Fixed Water Spray System')]/following::select"), "Fixed Water Spray System DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		foamSystemsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Foam systems')]/following::select"), "Foam systems DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fireAlarmSystemsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Fire alarm systems')]/following::select"), "Fire alarm systems DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		gasFloodingSystemsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Gas flooding systems')]/following::select"), "Gas flooding systems DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spotProtectionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Spot Protection')]/following::select"), "Spot Protection DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherProtectionNotSpecifiedAboveDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Other protection not specified above')]/following::select"), "Other protection not specified above DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pleaseProvideTheFireProtectionDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'please provide the Fire protection details')]/following::textarea"), "please provide the Fire protection details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		electricalRegulationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Electrical Regulation')]/following::select"), "Electrical Regulation DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillPolicyInsuredIntrestSpecialFieldsFire(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(polInsIntSpeFieldsFireEntity.getAction().equalsIgnoreCase("add") || polInsIntSpeFieldsFireEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=AR
			if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
				selectValueFromList(typeOfConstructionDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("TypeOfConstruction"));
			}
			if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigHeightOfTheBuildingMeters")) {
				clearAndSendKeys(heightOfTheBuildingMetersTextField, polInsIntSpeFieldsFireEntity.getStringValueForField("HeightOfTheBuildingMeters"));

				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigAgeOfTheBuildingYears")) {
					clearAndSendKeys(ageOfTheBuildingYearsTextField, polInsIntSpeFieldsFireEntity.getStringValueForField("AgeOfTheBuildingYears"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPortableExtinguishers")) {
					selectValueFromList(portableExtinguishersDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("PortableExtinguishers"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSmallBoreHoseReels")) {
					selectValueFromList(smallBoreHoseReelsDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("SmallBoreHoseReels"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigTrailerPumpsFireEngines")) {
					selectValueFromList(trailerPumpsFireEnginesDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("TrailerPumpsFireEngines"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigHydrantSystem")) {
					selectValueFromList(hydrantSystemDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("HydrantSystem"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSprinklerSystemFire")) {
					selectValueFromList(sprinklerSystemFireDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("SprinklerSystemFire"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFixedWaterSpraySystem")) {
					selectValueFromList(fixedWaterSpraySystemDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("FixedWaterSpraySystem"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFoamSystems")) {
					selectValueFromList(foamSystemsDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("FoamSystems"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFireAlarmSystems")) {
					selectValueFromList(fireAlarmSystemsDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("FireAlarmSystems"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigGasFloodingSystems")) {
					selectValueFromList(gasFloodingSystemsDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("GasFloodingSystems"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSpotProtection")) {
					selectValueFromList(spotProtectionDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("SpotProtection"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigOtherProtectionNotSpecifiedAbove")) {
					selectValueFromList(otherProtectionNotSpecifiedAboveDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("OtherProtectionNotSpecifiedAbove"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPleaseProvideTheFireProtectionDetails")) {
					clearAndSendKeys(pleaseProvideTheFireProtectionDetailsTextArea, polInsIntSpeFieldsFireEntity.getStringValueForField("PleaseProvideTheFireProtectionDetails"));
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigElectricalRegulation")) {
					selectValueFromList(electricalRegulationDropDown, polInsIntSpeFieldsFireEntity.getStringValueForField("ElectricalRegulation"));
				}
			}
			else if(polInsIntSpeFieldsFireEntity.getAction().equalsIgnoreCase("verify")){

				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
				}
				if(polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
				}
				//Mayur_Product name=AR
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("TypeOfConstruction"), fetchValueFromList(typeOfConstructionDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigHeightOfTheBuildingMeters")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("HeightOfTheBuildingMeters"), fetchValueFromTextFields(heightOfTheBuildingMetersTextField), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigAgeOfTheBuildingYears")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("AgeOfTheBuildingYears"), fetchValueFromTextFields(ageOfTheBuildingYearsTextField), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPortableExtinguishers")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("PortableExtinguishers"), fetchValueFromList(portableExtinguishersDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSmallBoreHoseReels")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("SmallBoreHoseReels"), fetchValueFromList(smallBoreHoseReelsDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigTrailerPumpsFireEngines")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("TrailerPumpsFireEngines"), fetchValueFromList(trailerPumpsFireEnginesDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigHydrantSystem")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("HydrantSystem"), fetchValueFromList(hydrantSystemDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSprinklerSystemFire")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("SprinklerSystemFire"), fetchValueFromList(sprinklerSystemFireDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFixedWaterSpraySystem")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("FixedWaterSpraySystem"), fetchValueFromList(fixedWaterSpraySystemDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFoamSystems")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("FoamSystems"), fetchValueFromList(foamSystemsDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFireAlarmSystems")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("FireAlarmSystems"), fetchValueFromList(fireAlarmSystemsDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigGasFloodingSystems")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("GasFloodingSystems"), fetchValueFromList(gasFloodingSystemsDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSpotProtection")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("SpotProtection"), fetchValueFromList(spotProtectionDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigOtherProtectionNotSpecifiedAbove")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("OtherProtectionNotSpecifiedAbove"), fetchValueFromList(otherProtectionNotSpecifiedAboveDropDown), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPleaseProvideTheFireProtectionDetails")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("PleaseProvideTheFireProtectionDetails"), fetchValueFromFields(pleaseProvideTheFireProtectionDetailsTextArea), AssertionType.WARNING);
				}
				if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigElectricalRegulation")) {
					assertReference.assertEquals(polInsIntSpeFieldsFireEntity.getStringValueForField("ElectricalRegulation"), fetchValueFromList(electricalRegulationDropDown), AssertionType.WARNING);
				}

			}
		}
	}

	public void navigateToPolicy(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			if(polInsIntSpeFieldsFireEntity.getStringValueForField("Product").equalsIgnoreCase("SF")) {
				click(forwardButton);
			}	
			switchToFrame("display");
			//PageElement polInsIntSpeFieldsFireTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polInsIntSpeFieldsFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Insured Intrest Special Fields Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(polInsIntSpeFieldsFireTitle);
		}
	}
	public void clickOnSaveButton(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			//PageElement polInsIntSpeFieldsFireTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polInsIntSpeFieldsFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Insured Intrest Special Fields Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(polInsIntSpeFieldsFireTitle);
		}
	}
	public void clickOnBackButton(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	
	public void clickOnBackwardButton(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity){
		if (polInsIntSpeFieldsFireEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}

	public void fillandSubmitPolicyInsuredIntrestSpecialFieldsFire(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntSpeFieldsFireEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestSpecialFieldsFire(polInsIntSpeFieldsFireEntity ,assertReference);	
			clickOnForwardButton(polInsIntSpeFieldsFireEntity);
			clickOnSaveButton(polInsIntSpeFieldsFireEntity);
			navigateToPolicy(polInsIntSpeFieldsFireEntity);
			navigateToAttribute(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterest(polInsIntSpeFieldsFireEntity);
			navigateToCoverage(polInsIntSpeFieldsFireEntity);
			navigateToLoan(polInsIntSpeFieldsFireEntity);
			navigateToClientDetails(polInsIntSpeFieldsFireEntity);
			navigateToRelation(polInsIntSpeFieldsFireEntity);
			navigateToPayment(polInsIntSpeFieldsFireEntity);
			navigateToFollowup(polInsIntSpeFieldsFireEntity);
			navigateToDocument(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterestDetails(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterestAttributes(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterestRelations(polInsIntSpeFieldsFireEntity);
			navigateToInsuredInterestPayments(polInsIntSpeFieldsFireEntity);
		}
	}
}
