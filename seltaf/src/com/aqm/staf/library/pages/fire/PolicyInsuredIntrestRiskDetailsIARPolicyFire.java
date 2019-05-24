package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetIARPolFireEntity;

public class PolicyInsuredIntrestRiskDetailsIARPolicyFire extends BasePage{

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
	private PageElement yearOfConstructionDropDown;
	private PageElement yearOfOccupationDropDown;
	private PageElement isTheEntireRiskLocatedInTheBasementDropDown;
	private PageElement ifThereIsPartialBasementHowTheSameIsOccupiedDropDown;
	private PageElement detailsOfFireFightingArrangementsForTheRiskTextArea;
	private PageElement distanceFromTheNearestPublicFireBrigadeTextField;
	private PageElement approximateResponseTimeForTheFireBrigadeInMinutesTextField;
	private PageElement whetherTheRiskIsSituatedInSEZDropDown;
	private PageElement whetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecordsDropDown;
	private PageElement dateOfInspectionTextField;
	private PageElement specifyNeighboringRiskOccupancyDropDown;
	private PageElement isTheNeighboringRiskClearlySeparatedByRoadORVacantLandDropDown;
	private PageElement probableMaximumLossPMLTextField;
	//Mayur_Product name=FD/DF/FF/FP
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
	private PageElement proceedButton;
	
//PE Dharmendra
	private PageElement hazardousGoodsForShopsDropDown;

	public PolicyInsuredIntrestRiskDetailsIARPolicyFire(WebDriver driver, String pageName) {
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
		yearOfConstructionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Year Of Construction')]/following::select"), "Year Of Construction DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfOccupationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Year of occupation')]/following::select"), "Year of occupation DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isTheEntireRiskLocatedInTheBasementDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is the entire risk located in the basement')]/following::select"), "Is the entire risk located in the basement DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ifThereIsPartialBasementHowTheSameIsOccupiedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'If there is partial basement, how the same is occupied')]/following::select"), "If there is partial basement, how the same is occupied DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfFireFightingArrangementsForTheRiskTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of Fire fighting arrangements for the Risk')]/following::textarea"), "Details of Fire fighting arrangements for the Risk Testarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceFromTheNearestPublicFireBrigadeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Distance from the nearest public Fire Brigade')]/following::input"), "Distance from the nearest public Fire Brigade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		approximateResponseTimeForTheFireBrigadeInMinutesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Approximate Response Time for the fire brigade(in minutes)')]/following::input"), "Approximate Response Time for the fire brigade(in minutes) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheRiskIsSituatedInSEZDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the risk is situated in SEZ')]/following::select"), "Whether the risk is situated in SEZ DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecordsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether Risk is inspected by Risk Engineer / outsourced agency and detailed report is on records')]/following::select"), "Whether Risk is inspected by Risk Engineer / outsourced agency and detailed report is on records DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfInspectionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Inspection')]/following::input"), "Date of Inspection TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specifyNeighboringRiskOccupancyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Specify neighboring risk / occupancy')]/following::select"), "Specify neighboring risk / occupancy DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isTheNeighboringRiskClearlySeparatedByRoadORVacantLandDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is the neighboring risk clearly separated by a road or vacant land')]/following::select"), "Is the neighboring risk clearly separated by a road or vacant land DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		probableMaximumLossPMLTextField= new PageElement(By.xpath("//td//div[contains(text(),'Probable Maximum Loss (PML)')]/following::input"), "Probable Maximum Loss (PML) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_Product name=FD/DF/FF/FP
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
		//PE Dharmendra
		hazardousGoodsForShopsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Hazardous Goods for Shops')]/following::select"), "Hazardous Goods for Shops", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
 
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
	
	
	}

	public void fillPolicyInsuredIntrestRiskDetailsIARPolicyFire(RiskDetIARPolFireEntity riskDetIARPolFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(riskDetIARPolFireEntity.getAction().equalsIgnoreCase("add") || riskDetIARPolFireEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=AR
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigYearOfOccupation")) {
				selectValueFromList(yearOfOccupationDropDown, riskDetIARPolFireEntity.getStringValueForField("YearOfOccupation"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigYearOfConstruction")) {
				selectValueFromList(yearOfConstructionDropDown, riskDetIARPolFireEntity.getStringValueForField("YearOfConstruction"));
			}
			
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIsTheEntireRiskLocatedInTheBasement")) {
				selectValueFromList(isTheEntireRiskLocatedInTheBasementDropDown, riskDetIARPolFireEntity.getStringValueForField("IsTheEntireRiskLocatedInTheBasement"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIfThereIsPartialBasementHowTheSameIsOccupied")) {
				selectValueFromList(ifThereIsPartialBasementHowTheSameIsOccupiedDropDown, riskDetIARPolFireEntity.getStringValueForField("IfThereIsPartialBasementHowTheSameIsOccupied"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDetailsOfFireFightingArrangementsForTheRisk")) {
				clearAndSendKeys(detailsOfFireFightingArrangementsForTheRiskTextArea, riskDetIARPolFireEntity.getStringValueForField("DetailsOfFireFightingArrangementsForTheRisk"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDistanceFromTheNearestPublicFireBrigade")) {
				clearAndSendKeys(distanceFromTheNearestPublicFireBrigadeTextField, riskDetIARPolFireEntity.getStringValueForField("DistanceFromTheNearestPublicFireBrigade"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigApproximateResponseTimeForTheFireBrigadeInMinutes")) {
				clearAndSendKeys(approximateResponseTimeForTheFireBrigadeInMinutesTextField, riskDetIARPolFireEntity.getStringValueForField("ApproximateResponseTimeForTheFireBrigadeInMinutes"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSEZ")) {
				selectValueFromList(whetherTheRiskIsSituatedInSEZDropDown, riskDetIARPolFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSEZ"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigWhetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecords")) {
				selectValueFromList(whetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecordsDropDown, riskDetIARPolFireEntity.getStringValueForField("WhetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecords"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPolicyPeriodTo")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(riskDetIARPolFireEntity.getStringValueForField("PolicyPeriodTo"));
				clearAndEnterDate(dateOfInspectionTextField, dateofIntimation);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSpecifyNeighboringRiskOccupancy")) {
				selectValueFromList(specifyNeighboringRiskOccupancyDropDown, riskDetIARPolFireEntity.getStringValueForField("SpecifyNeighboringRiskOccupancy"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIsTheNeighboringRiskClearlySeparatedByRoadORVacantLand")) {
				selectValueFromList(isTheNeighboringRiskClearlySeparatedByRoadORVacantLandDropDown, riskDetIARPolFireEntity.getStringValueForField("IsTheNeighboringRiskClearlySeparatedByRoadORVacantLand"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				clearAndSendKeys(probableMaximumLossPMLTextField, riskDetIARPolFireEntity.getStringValueForField("ProbableMaximumLossPML"));
			}
			//Mayur_Product name=FD/DF/FF/FP
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
				selectValueFromList(typeOfConstructionDropDown, riskDetIARPolFireEntity.getStringValueForField("TypeOfConstruction"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHeightOfTheBuildingMeters")) {
				clearAndSendKeys(heightOfTheBuildingMetersTextField, riskDetIARPolFireEntity.getStringValueForField("HeightOfTheBuildingMeters"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigAgeOfTheBuildingYears")) {
				clearAndSendKeys(ageOfTheBuildingYearsTextField, riskDetIARPolFireEntity.getStringValueForField("AgeOfTheBuildingYears"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPortableExtinguishers")) {
				selectValueFromList(portableExtinguishersDropDown, riskDetIARPolFireEntity.getStringValueForField("PortableExtinguishers"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSmallBoreHoseReels")) {
				selectValueFromList(smallBoreHoseReelsDropDown, riskDetIARPolFireEntity.getStringValueForField("SmallBoreHoseReels"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigTrailerPumpsFireEngines")) {
				selectValueFromList(trailerPumpsFireEnginesDropDown, riskDetIARPolFireEntity.getStringValueForField("TrailerPumpsFireEngines"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHydrantSystem")) {
				selectValueFromList(hydrantSystemDropDown, riskDetIARPolFireEntity.getStringValueForField("HydrantSystem"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSprinklerSystemFire")) {
				selectValueFromList(sprinklerSystemFireDropDown, riskDetIARPolFireEntity.getStringValueForField("SprinklerSystemFire"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFixedWaterSpraySystem")) {
				selectValueFromList(fixedWaterSpraySystemDropDown, riskDetIARPolFireEntity.getStringValueForField("FixedWaterSpraySystem"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFoamSystems")) {
				selectValueFromList(foamSystemsDropDown, riskDetIARPolFireEntity.getStringValueForField("FoamSystems"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFireAlarmSystems")) {
				selectValueFromList(fireAlarmSystemsDropDown, riskDetIARPolFireEntity.getStringValueForField("FireAlarmSystems"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigGasFloodingSystems")) {
				selectValueFromList(gasFloodingSystemsDropDown, riskDetIARPolFireEntity.getStringValueForField("GasFloodingSystems"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSpotProtection")) {
				selectValueFromList(spotProtectionDropDown, riskDetIARPolFireEntity.getStringValueForField("SpotProtection"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigOtherProtectionNotSpecifiedAbove")) {
				selectValueFromList(otherProtectionNotSpecifiedAboveDropDown, riskDetIARPolFireEntity.getStringValueForField("OtherProtectionNotSpecifiedAbove"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPleaseProvideTheFireProtectionDetailsT")) {
				clearAndSendKeys(pleaseProvideTheFireProtectionDetailsTextArea, riskDetIARPolFireEntity.getStringValueForField("PleaseProvideTheFireProtectionDetailsT"));
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigElectricalRegulation")) {
				selectValueFromList(electricalRegulationDropDown, riskDetIARPolFireEntity.getStringValueForField("ElectricalRegulation"));
			}
			//PE Dharmendra
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHazardousGoodsForShops")) {
				selectValueFromList(hazardousGoodsForShopsDropDown, riskDetIARPolFireEntity.getStringValueForField("HazardousGoodsForShops"));
			}
		}
		else if(riskDetIARPolFireEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(riskDetIARPolFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Mayur_Product name=AR
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigYearOfConstruction")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("YearOfConstruction"), fetchValueFromList(yearOfConstructionDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigYearOfOccupation")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("YearOfOccupation"), fetchValueFromList(yearOfOccupationDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIsTheEntireRiskLocatedInTheBasement")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("IsTheEntireRiskLocatedInTheBasement"), fetchValueFromList(isTheEntireRiskLocatedInTheBasementDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIfThereIsPartialBasementHowTheSameIsOccupied")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("IfThereIsPartialBasementHowTheSameIsOccupied"), fetchValueFromList(ifThereIsPartialBasementHowTheSameIsOccupiedDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDetailsOfFireFightingArrangementsForTheRisk")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("DetailsOfFireFightingArrangementsForTheRisk"), fetchValueFromTextFields(detailsOfFireFightingArrangementsForTheRiskTextArea), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDistanceFromTheNearestPublicFireBrigade")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("DistanceFromTheNearestPublicFireBrigade"), fetchValueFromTextFields(distanceFromTheNearestPublicFireBrigadeTextField), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigApproximateResponseTimeForTheFireBrigadeInMinutes")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("ApproximateResponseTimeForTheFireBrigadeInMinutes"), fetchValueFromTextFields(approximateResponseTimeForTheFireBrigadeInMinutesTextField), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSEZ")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSEZ"), fetchValueFromList(whetherTheRiskIsSituatedInSEZDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigWhetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecords")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("WhetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecords"), fetchValueFromList(whetherRiskIsInspectedByRiskEngineerOutsourcedAgencyAndDetailedReportIsOnRecordsDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDateOfInspection")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("DateOfInspection"), fetchValueFromTextFields(dateOfInspectionTextField), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSpecifyNeighboringRiskOccupancy")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("SpecifyNeighboringRiskOccupancy"), fetchValueFromList(specifyNeighboringRiskOccupancyDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigIsTheNeighboringRiskClearlySeparatedByRoadORVacantLand")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("IsTheNeighboringRiskClearlySeparatedByRoadORVacantLand"), fetchValueFromList(isTheNeighboringRiskClearlySeparatedByRoadORVacantLandDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("ProbableMaximumLossPML"), fetchValueFromTextFields(probableMaximumLossPMLTextField), AssertionType.WARNING);
			}
			//Mayur_Product name=FD/DF/FF/FP
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigTypeOfConstruction")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("TypeOfConstruction"), fetchValueFromList(typeOfConstructionDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHeightOfTheBuildingMeters")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("HeightOfTheBuildingMeters"), fetchValueFromTextFields(heightOfTheBuildingMetersTextField), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigAgeOfTheBuildingYears")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("AgeOfTheBuildingYears"), fetchValueFromTextFields(ageOfTheBuildingYearsTextField), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPortableExtinguishers")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("PortableExtinguishers"), fetchValueFromList(portableExtinguishersDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSmallBoreHoseReels")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("SmallBoreHoseReels"), fetchValueFromList(smallBoreHoseReelsDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigTrailerPumpsFireEngines")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("TrailerPumpsFireEngines"), fetchValueFromList(trailerPumpsFireEnginesDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHydrantSystem")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("HydrantSystem"), fetchValueFromList(hydrantSystemDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSprinklerSystemFire")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("SprinklerSystemFire"), fetchValueFromList(sprinklerSystemFireDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFixedWaterSpraySystem")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("FixedWaterSpraySystem"), fetchValueFromList(fixedWaterSpraySystemDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFoamSystems")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("FoamSystems"), fetchValueFromList(foamSystemsDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFireAlarmSystems")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("FireAlarmSystems"), fetchValueFromList(fireAlarmSystemsDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigGasFloodingSystems")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("GasFloodingSystems"), fetchValueFromList(gasFloodingSystemsDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSpotProtection")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("SpotProtection"), fetchValueFromList(spotProtectionDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigOtherProtectionNotSpecifiedAbove")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("OtherProtectionNotSpecifiedAbove"), fetchValueFromList(otherProtectionNotSpecifiedAboveDropDown), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPleaseProvideTheFireProtectionDetails")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("PleaseProvideTheFireProtectionDetails"), fetchValueFromTextFields(pleaseProvideTheFireProtectionDetailsTextArea), AssertionType.WARNING);
			}
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigElectricalRegulation")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("ElectricalRegulation"), fetchValueFromList(electricalRegulationDropDown), AssertionType.WARNING);
			}
			//PE Dharmendra
			if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigHazardousGoodsForShops")) {
				assertReference.assertEquals(riskDetIARPolFireEntity.getStringValueForField("HazardousGoodsForShops"), fetchValueFromList(hazardousGoodsForShopsDropDown), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicy(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			PageElement riskDetIARPolFireTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+riskDetIARPolFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Insured Intrest Risk Details IAR Polic yFire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskDetIARPolFireTitle);
		}
	}
	public void clickOnBackButton(RiskDetIARPolFireEntity riskDetIARPolFireEntity) throws InterruptedException{
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigBackButton")){
			
			click(backButton);
			if(riskDetIARPolFireEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire") && riskDetIARPolFireEntity.getStringValueForField("Product").equalsIgnoreCase("FD")) {
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
			switchToFrame("display");
			click(forwardButton);
				if(riskDetIARPolFireEntity.getStringValueForField("Product").equalsIgnoreCase("FD")) {
					/*switchToWindow();
					driver.close();
					switchToWindow();*/
				}
			switchToFrame("display");
			click(saveButton);
			switchToFrame("display");
			
			
			}
		}
	}
	
	public void clickOnBackwardButton(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnSaveButton(RiskDetIARPolFireEntity riskDetIARPolFireEntity){
		if (riskDetIARPolFireEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			PageElement riskDetIARPolFireTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+riskDetIARPolFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Insured Intrest Risk Details IAR Polic yFire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskDetIARPolFireTitle);
		}
	}

	public void fillandSubmitPolicyInsuredIntrestRiskDetailsIARPolicyFire(RiskDetIARPolFireEntity riskDetIARPolFireEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskDetIARPolFireEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestRiskDetailsIARPolicyFire(riskDetIARPolFireEntity ,assertReference);	
			clickOnForwardButton(riskDetIARPolFireEntity );
			clickOnBackButton(riskDetIARPolFireEntity);
			clickOnSaveButton(riskDetIARPolFireEntity);
			navigateToPolicy(riskDetIARPolFireEntity );
			navigateToAttribute(riskDetIARPolFireEntity );
			navigateToInsuredInterest(riskDetIARPolFireEntity );
			navigateToCoverage(riskDetIARPolFireEntity );
			navigateToLoan(riskDetIARPolFireEntity );
			navigateToClientDetails(riskDetIARPolFireEntity );
			navigateToRelation(riskDetIARPolFireEntity );
			navigateToPayment(riskDetIARPolFireEntity );
			navigateToFollowup(riskDetIARPolFireEntity );
			navigateToDocument(riskDetIARPolFireEntity );
			navigateToInsuredInterestDetails(riskDetIARPolFireEntity );
			navigateToInsuredInterestAttributes(riskDetIARPolFireEntity );
			navigateToInsuredInterestAttachCoverages(riskDetIARPolFireEntity );
			navigateToInsuredInterestRelations(riskDetIARPolFireEntity );
			navigateToInsuredInterestPayments(riskDetIARPolFireEntity );
		}
	}
}
