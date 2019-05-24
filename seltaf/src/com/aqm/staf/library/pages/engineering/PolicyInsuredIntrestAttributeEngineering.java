package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrAMT2POLEngEntity;
import com.aqm.staf.library.databin.PolAttributeEngEntity;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PolInsIntAttrFireEntity;
import com.aqm.staf.library.databin.PolInsIntEngEntity;
public class PolicyInsuredIntrestAttributeEngineering extends BasePage {
	//******************CM(INSURED INTREST) CHINTAN*****************
	private PageElement nameOfTheManufacturerTextBox;
	private PageElement yearOfMakeDropdown;
	private PageElement nameOfThemachineForCPMDropdown;
	private PageElement cPMGroupnameTextBox;
	private PageElement sumInsuredOfTheMachineTextBox;
	//private PageElement machineryWorkingUndergroundTunnelsDropdown;
	private PageElement whetherTheMachineIsUsedInRailwayTrackDropdown;
	private PageElement machineSerialNumberTextBox;
	private PageElement machineDescriptionTextBox;
	private PageElement quantityTextBox;
	private PageElement whetherTheEarthquakeCoverIsRequiredDropdown;
	private PageElement earthquakeZoneDropdown;
	private PageElement cPMGroupLevelOfExcessDropdown;
	private PageElement typeOfUsageAreaDropdown;
	private PageElement whetherMachineEquipmentMountedOnFloatingVesselCraftDropdown;

	//******************ER(INSURED INTREST) CHINTAN*****************
	private PageElement typeOfProjectRiskDropDown;
	private PageElement natureOfProjectDropDown;
	private PageElement descriptionOfProjectDescription1TextBox;
	private PageElement descriptionOfProjectDescription2TextBox;
	private PageElement descriptionOfProjectDescription3TextBox;
	private PageElement dateOfArrivalOfProjectMaterialFirstConsignmentTextBox;
	private PageElement expectedDateOfCommencementOfErectionTextBox;
	private PageElement expectedDateOfCommencementOfCivilworkTextBox;
	private PageElement expectedDateOfCompletionOfErectionTextBox;	
	private PageElement durationOfTestingPeriodInMonthsTextBox;
	private PageElement earthQuakeCoverDropDown;	
	private PageElement earthquakeStateDropDown;	
	private PageElement earthquakeDistrictZoneTextBox;	
	private PageElement originalProjectEndDateTextBox;

	//******************ER AND ME SAME (INSURED INTREST) CHINTAN*****************

	//******************AM(INSURED INTREST) CHINTAN*****************
	private PageElement	policyNumberOfheMarineCargoPolicyTextBox;
	private PageElement	netRateOfTheMarineCargoPolicyTextBox;
	private PageElement	componentReflectingTheDependencyOnTheTypeOfRiskCTRDropDown;
	private PageElement	componentsReflectingTheDependencyOnAnAboveAverageDropDown;
	private PageElement	componentConcerningTheDependencyOnTheComplexityOfTheProjectDropDown;
	private PageElement	componentConcerningThePossibilityOfAdaptingTheWorksDropDown;
	private PageElement	componentConcerningTheImpactOnRepairTimeAsAFunctionDropDown;
	private PageElement	factorReflectingTheIndemnityFormFIFDropDown;
	private PageElement factorReflectingRedundanciesAvailableFREDropDown;
	private PageElement factorReflectingTheSeasonalFluctuationDropDown;
	private PageElement	underInsurancePercentTextBox;
	private PageElement	openInsuredButton;
	private PageElement closeWindowButton;
	private PageElement	saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement shipmentsInExcessOfUSD5000000DropDown;
	private PageElement transformerShipmentDropDown;
	private PageElement	overDimensionalCargoDropDown; 	
	private PageElement itemIncludingPackingWeighingInExcessOf50MTPrivateDropDown;
	private PageElement itemsRequiringSpecialHandlingDropDown;
	private PageElement	itemsHavingSpecialRequirementForLoadingLashingAndSecuringDropDown;
	private PageElement	bargeShipmentReplacementTimeInExcessDropDown;
	private PageElement replacementTimeInExcessOf6MonthsDropDown; 	
	private PageElement	shipmentsWithin3MonthsOfScheduledCommencementDropDown;
	private PageElement othersDropDown;

	//************************CR(INSURED INTREST) CHINTAN******************************
	private PageElement subClassOfRiskDropDown;
	private PageElement estimatedConstructionPeriodFromTextBox;
	private PageElement	estimatedConstructionPeriodToTextBox;
	private PageElement probableDateOfCompletionofconstructionTextBox;
	private PageElement description1ForContractWorksTextBox;
	private PageElement description2ForContractWorksTextBox;
	private PageElement description3ForContractWorksTextBox;
	private PageElement optionForFirstLossBasisDropDown;

	//Mayur_Product name=DS
	private PageElement machineryInsurancePolicyNumberTextField;
	private PageElement addressOfColdStorageTextArea;
	//Mayur_Product name=EC
	private PageElement nameOfTheRiskDropDown;
	private PageElement riskDetailsTextArea;
	private PageElement specialConditionsTextArea;
	private PageElement earthquakeZoneDropDown;
	private PageElement yearOfBuiltDropDown;
	private PageElement whetherFireAndLighteningCoverToBeDeletedDropDown;
	//Mayur_Product name=ET
	private PageElement locationNameTextfield;
	private PageElement locationDetailsTextArea;
	private PageElement sumInsuredForPropertyDamageTotalContractValueTextfield;
	private PageElement detailsOfAnnualBuildUpOfValueTextfield;
	private PageElement sumInsuredForBusinessInterruptionALOPTextfield;
	private PageElement indemnityPeriodMonthsDropDown;
	private PageElement optionForLimitOfIndemnityEventDropDown;
	private PageElement limitOfIndemnityCombinedPDAndBIEventTextfield;
	private PageElement optionForLimitOfIndemnityAggregateDropDown;
	private PageElement limitOfIndemnityCombinedPDAndBIAggregateTextfield;
	private PageElement policyPeriodExtensionDropDown;
	private PageElement serialnoTextfield;
	private PageElement  locationNameForNewWindowTextfield;
	private PageElement  workAddress1Textarea;
	private PageElement  workAddress2Textarea ;
	private PageElement  locationPinCodeTextfield;
	private PageElement  locationStateTextfield;
	private PageElement  locationDistrictTextfield;

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

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;

	// EI-Yogesh
	private PageElement nameOfTheEquipmentIeRiskTypeDropdown;	
	private PageElement equipmentDetailsTextarea;	
	private PageElement equipmentSerialNumberTextfield;	
	private PageElement sumInsuredTextfield;	
	private PageElement increaseExcessAmountToDropdown;	
	private PageElement whetherItIsBioMedicalEquipmentDropdown;	
	private PageElement isAMCInForceDropdown;	
	private PageElement usageAreaTypeDropdown;
	//CF- Yogesh
	private PageElement whetherDeletionOfExceptionKIsRequiredDropdown;

	private PageElement openButton;
	private PageElement deletebutton;
	private PageElement addbutton;
	private PageElement savebutton;
	private PageElement closebutton;
	//BP-Yogesh
	private PageElement typeOfBoilerBPPDropdown;
	private PageElement ageOfBoilerYearsTextfield;
	private PageElement boilerSerialNumberTextfield;
	private PageElement boilerDescriptionTextarea;
	private PageElement whetherBoilerIsRequiredToBeCertifiedByBoilerInspectorateDropdown;
	private PageElement sumInsuredOfheBoilerTextfield;
	//MB-Yogesh
	private PageElement nameOfTheMachineDropdown;
	private PageElement machineDetailsTextarea;
	private PageElement serialNoOfMachineTextfield;
	private PageElement whetherItIsStandByDropdown;
	private PageElement whetherInsuranceForTheSparePartsRequiredDropdown;
	private PageElement valueOfTheSparesOfTheMachineTextfield;
	private PageElement sumInsuredRsForIndividualMachineTextfield;
	private PageElement excessAmountIncreasedToDropdown;



	//Mayur_Product name=LE
	private PageElement preferredTypeAndDurationOfMaintenancePeriodCoverTextArea; 
	private PageElement insuredInterestWordingForSectionITexArea;
	private PageElement insuredInterestWordingForSectionIITexArea;
	private PageElement insuredInterestWordingForSectionIIIALOPTexArea;
	private PageElement limitOfIndemnityForEarthquakeVolcanismTsunamiTextField;
	private PageElement limitOfIndemnityForStormCycloneFloodInundationLandslideTextField;
	//Mayur_Product name=LW
	private PageElement nameOfTheMachineLWTextField;
	private PageElement machineDetailsTextArea;
	private PageElement serialNoOfMachineTextField;
	private PageElement quantityTextField;
	private PageElement machineCapacityTextField;
	private PageElement unitOfCapacityDropDown;
	private PageElement speedOfMachineInRPMTextField;
	private PageElement yearOfMakeDropDown;
	private PageElement whetherImportedOrIndigenousMachineDropDown;
	private PageElement riskLocationNameTextField;
	private PageElement relativeImportancePercentTextField;
	private PageElement whetherCriticalSparePartsAvailableDropDown;
	private PageElement turboGeneratorDetailsTextArea;
	private PageElement whetherTheInsuranceSpareOnlyAvailableDropDown;
	private PageElement whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown;
	private PageElement whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown;
	private PageElement reserveCapacityIsAvailableDropDown;
	private PageElement whatIsTheRateApplicableAccordingToTheReserveCapacityTextField;
	private PageElement numberOfShiftsDropDown;
	private PageElement whatIsTheRateApplicableAccordingToTheIndustryTextField;
	private PageElement ageOfTheMachineTextField;
	//Mayur_Product name=WP
	private PageElement nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox;
	private PageElement whetherTransmissionLineIsRequiredDropDown;
	private PageElement transmissionLineDetailsTextArea;
	private PageElement transmissionLineSumInsuredRsTextField;
	private PageElement whetherAnyOtherItemNotListedAboveIsRequiredDropDown;
	private PageElement anyOtherItemNotListedAboveDetailsTextArea;
	private PageElement serialNoOfAnyOtherItemNotListedAboveTextField;
	private PageElement anyOtherItemNotListedAboveSumInsuredRsTextField;
	private PageElement quantityAnyOtherItemNotlistedAboveTextField;
	//private PageElement sumInsuredTextField;
	private PageElement sumInsuredWindMillTextField;
	private PageElement totalSumInsuredRsForIndividualWindMillTextField;
	//le
	private PageElement subjectivitiesTextArea;
	private PageElement exclusionsTextArea;
	private PageElement dateOfArrivalFindButton;
	private PageElement dateOfCommencementOfErectionFindButton;
	private PageElement dateOfCommencementOfCivilWorkFindButton;
	private PageElement earthquakeDistrictZonefindButton;
	//ALOP
	private PageElement policyNumberOfTheERCRMETextField;
	private PageElement componentReflectingTheDependencyOnTheTypeOfRiskDropdown;
	private PageElement componentsReflectingTheDependencyOnAnAboveAverageExposureToPerilsOfNatureDropdown;
	private PageElement componentConcerningTheDependencyOnTheRiskAggravatingTECHNICALCHARACTERISTICSDropdown;
	private PageElement componentConcerningTheDependencyOnTheComplexityOfTheProjectDropdown;
	private PageElement componentConcerningThePossibilityOfAdaptingTheWorksProgramAfterLossDropdown;
	private PageElement componentConcerningTheImpactOnRepairTimeAsFunctionOfTheLocationDropdwon;
	private PageElement factorReflectingTheIndemnityFormDropdown;
	private PageElement factorReflectingRedundanciesAvailableDropdown;
	private PageElement factorReflectingTheSeasonalFluctuationDropdown;
	private PageElement netProfitTextField;
	private PageElement standingChargesTextField;
	private PageElement riskDetailTitle;
	private PageElement typeOfRiskCRDropDown;
	//ME-Nilesh
	private PageElement transitTypeOfMarineErectionDropDown;
	private PageElement totalLossOnlyDropDown;
	
	//ER
	private PageElement coverValidFromTextField;
	private PageElement totalSumInsuredEngTextField;
	private PageElement applicableSumInsuredDuringExtensionPeriodTextField;
	private PageElement extensionPeriodInMonthsTextField;
	private PageElement applicableAddOnSumInsuredDuringExtensionPeriodTextField;
	


	public PolicyInsuredIntrestAttributeEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
		//******************CM(INSURED INTREST) CHINTAN*****************
		nameOfTheManufacturerTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Name of the manufacturer')]/following::input"),"Name of the manufacturer'", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		yearOfMakeDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Year of Make')]/following::select"),"Year of Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		nameOfThemachineForCPMDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Name of the machine for CPM')]/following::select"),"Name of the machine for CPM", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		cPMGroupnameTextBox=new PageElement(By.xpath("//td/div[contains(text(),'CPM Group name')]/following::input"),"CPM Group name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		sumInsuredOfTheMachineTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured of the machine')]/following::input"),"Sum Insured of the machine", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//machineryWorkingUndergroundTunnelsDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Machinery working underground/tunnels')]/following::select"),"Machinery working underground/tunnels", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherTheMachineIsUsedInRailwayTrackDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether the machine is used in railway track testing coach or merry go round system(Including locomotives and wagons)')]/following::select"),"Whether the machine is used in railway track testing coach ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		machineSerialNumberTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Machine Serial Number')]/following::input"),"Machine Serial Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		machineDescriptionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Machine description')]/following::textarea"),"Machine description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		quantityTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Quantity')]/following::input"),"Quantity'", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		whetherTheEarthquakeCoverIsRequiredDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether the earthquake cover is required')]/following::select"),"Whether the earthquake cover is required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		earthquakeZoneDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake Zone')]/following::select"),"Earthquake Zone", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		cPMGroupLevelOfExcessDropdown=new PageElement(By.xpath("//td/div[contains(text(),'CPM Group Level of excess')]/following::select"),"CPM Group Level of excess", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		typeOfUsageAreaDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Type of usage area')]/following::select"),"Type of usage area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherMachineEquipmentMountedOnFloatingVesselCraftDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether machine/equipment mounted on floating vessel/ craft')]/following::select"),"Whether machine/equipment mounted on floating vessel/ craft", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	

		//******************ER(INSURED INTREST) CHINTAN*****************
		typeOfProjectRiskDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Project(Risk)')]/following::select"),"Type of Project(Risk)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		natureOfProjectDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Nature of Project')]/following::select"),"Nature of Project", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfProjectDescription1TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description of Project - Description1')]/following::textarea"),"Description1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		descriptionOfProjectDescription2TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description of Project - Description2')]/following::textarea"),"Description2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription3TextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description of Project - Description3')]/following::textarea"),"Description3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfArrivalOfProjectMaterialFirstConsignmentTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Date of Arrival of Project Material')]/following::input"),"Date of Arrival of Project Material (First Consignment)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		expectedDateOfCommencementOfErectionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Expected Date of Commencement of Erection')]/following::input"),"Expected Date of Commencement of Erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expectedDateOfCommencementOfCivilworkTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Expected Date of Commencement of Civil work')]/following::input"),"Expected Date of Commencement of Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		expectedDateOfCompletionOfErectionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Expected Date of Completion of Erection')]/following::input"),"Expected Date of Completion of Erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		durationOfTestingPeriodInMonthsTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Duration of Testing Period (in Months)')]/following::input"),"Duration of Testing Period (in Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		earthQuakeCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Earth Quake Cover')]/following::select"),"Earth Quake Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeStateDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake State')]/following::select"),"Earthquake State", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		earthquakeDistrictZoneTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake District (Zone)')]/following::input"),"Earthquake District (Zone)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		originalProjectEndDateTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Original Project End Date')]/following::input"),"Original Project End Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

		//******************AM(INSURED INTREST) CHINTAN*****************

		policyNumberOfheMarineCargoPolicyTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Policy number of the Marine Cargo policy')]/following::input"),"Policy number of the Marine Cargo policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		netRateOfTheMarineCargoPolicyTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Net rate of the Marine Cargo policy')]/following::input"),"Net rate of the Marine Cargo policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentReflectingTheDependencyOnTheTypeOfRiskCTRDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Component Reflecting the Dependency on the Type of Risk.(CTR)')]/following::select"),"Component Reflecting the Dependency on the Type ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		componentsReflectingTheDependencyOnAnAboveAverageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Components reflecting the dependency on an above average exposure to voyage like Distance,Transhipment, Storage, likely natural perils during voyages')]/following::select"),"Components Reflecting The Dependency On An Above Average", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		componentConcerningTheDependencyOnTheComplexityOfTheProjectDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the Dependency on the Complexity of the Project')]/following::select"),"Component Concerning the Dependency on the Complexity of the Project", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		componentConcerningThePossibilityOfAdaptingTheWorksDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the Possibility of Adapting the works Program after a loss in order to meet the Planned completion Date')]/following::select"),"Component Concerning The Possibility Of Adapting The Works", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		componentConcerningTheImpactOnRepairTimeAsAFunctionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the impact on Repair time as a function of the location and infrastructure facilities in or around the site.CLO')]/following::select"),"componentConcerningTheImpactOnRepairTimeAsAFunction", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		factorReflectingTheIndemnityFormFIFDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting the Indemnity form(FIF)')]/following::select"),"Factor Reflecting the Indemnity form(FIF)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		factorReflectingRedundanciesAvailableFREDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting Redundancies Available (FRE)')]/following::select"),"Factor Reflecting Redundancies Available (FRE)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		factorReflectingTheSeasonalFluctuationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting the Seasonal Fluctuation of the production figures over the year')]/following::select"),"Factor Reflecting the Seasonal Fluctuation of the production figures over the year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		othersDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Others')]/following::select"),"Others", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsurancePercentTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Under insurance percent')]/following::input"),"Under insurance percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openInsuredButton=new PageElement(By.name("propValues11"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//********************CR(INSURED INTREST)CHINTAN*****************
		subClassOfRiskDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Sub-Class of Risk')]/following::select"),"Sub-Class of Risk", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedConstructionPeriodFromTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Estimated Construction Period From')]/following::input"),"Estimated Construction Period From", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedConstructionPeriodToTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Estimated Construction Period To')]/following::input"),"Estimated Construction Period To", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		probableDateOfCompletionofconstructionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Probable date of completion of construction')]/following::input"),"Sub-Class of Risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		description1ForContractWorksTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description 1 For Contract Works')]/following::textarea"),"description1ForContractWorks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		description2ForContractWorksTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description 2 For Contract Works')]/following::textarea"),"description2ForContractWorks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		description3ForContractWorksTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description 3 For Contract Works')]/following::textarea"),"description3ForContractWorks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionForFirstLossBasisDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Option for First Loss Basis')]/following::input"),"Option for First Loss Basis", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfRiskCRDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Risk(CR)')]/following::select"),"Type of Risk(CR)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//Mayur_Product name=DS
		machineryInsurancePolicyNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Machinery Insurance Policy Number')]/following::input"), "Machinery Insurance Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfColdStorageTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Address of Cold Storage')]/following::textarea"), "Address of Cold Storage TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product name=EC
		nameOfTheRiskDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Name of the Risk')]/following::select"), "Name of the Risk DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Risk Details')]/following::textarea"), "Risk Details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeZoneDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Earthquake Zone')]/following::select"), "Earthquake Zone DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfBuiltDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Year of Built')]/following::select"), "Year of Built DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherFireAndLighteningCoverToBeDeletedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether Fire and Lightening Cover to be Deleted')]/following::select"), "Whether Fire and Lightening Cover to be Deleted DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Mayur_Product name=ET
		locationNameTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Location Name')]/following::input"), "Location Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Location details')]/following::textarea"), "Location details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForPropertyDamageTotalContractValueTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Property Damage(Total Contract Value)')]/following::input"), "Sum Insured for Property Damage(Total Contract Value) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfAnnualBuildUpOfValueTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Details of Annual Build up of value')]/following::input"), "Details of Annual Build up of value TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForBusinessInterruptionALOPTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Business Interruption(ALOP)')]/following::input"), "Sum Insured for Business Interruption(ALOP) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodMonthsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Indemnity period(Months)')]/following::select"), "Indemnity period(Months) DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		optionForLimitOfIndemnityEventDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Option for Limit of Indemnity(event)')]/following::select"), "Option for Limit of Indemnity(event) DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitOfIndemnityCombinedPDAndBIEventTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Limit of Indemnity - Combined PD and BI (event)')]/following::input"), "Limit of Indemnity - Combined PD and BI (event) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optionForLimitOfIndemnityAggregateDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Option for Limit of Indemnity (aggregate)')]/following::select"), "Option for Limit of Indemnity (aggregate) DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitOfIndemnityCombinedPDAndBIAggregateTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Limit of Indemnity - Combined PD and BI (aggregate)')]/following::input"), "Limit of Indemnity - Combined PD and BI (aggregate) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Policy period Extension')]/following::select"), "Policy period Extension DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//EI
		openButton= new PageElement(By.xpath("//td//div[contains(text(),'Location Details')]/following::input"), "Open Button for New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOfTheEquipmentIeRiskTypeDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Name of the Equipment (i.e. Risk Type)')]/following::select"),"Name of the Equipment (i.e. Risk Type) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		equipmentDetailsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Equipment details')]/following::textarea"),"Equipment details Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		equipmentSerialNumberTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Equipment Serial Number')]/following::input"),"Equipment Serial Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured')]/following::input"),"Sum Insured Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increaseExcessAmountToDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Increase Excess Amount to')]/following::select"),"Increase Excess Amount to Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherItIsBioMedicalEquipmentDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether it is Bio-Medical equipment')]/following::select"),"Whether it is Bio-Medical equipment Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAMCInForceDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Is AMC in Force')]/following::select"),"Is AMC in Force Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		usageAreaTypeDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Usage Area Type')]/following::select"),"Usage Area Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//CF
		whetherDeletionOfExceptionKIsRequiredDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether deletion of exception K is required')]/following::select"),"Whether Deletion Of Exception K Is Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		deletebutton=new PageElement(By.name("btnDel"),"Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addbutton=new PageElement(By.name("btnAdd"),"Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		savebutton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closebutton=new PageElement(By.name("btnClose"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		serialnoTextfield=new PageElement(By.name("slNo0"),"Serial no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationNameForNewWindowTextfield=new PageElement(By.name("Data_13867814092004_0"),"Location Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		workAddress1Textarea=new PageElement(By.name("Data_213843605022010_0"),"Work address 1 Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		workAddress2Textarea=new PageElement(By.name("Data_213843705022010_0"),"Work address 2 Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationPinCodeTextfield=new PageElement(By.name("Data_213843805022010_0"),"Location Pin Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationStateTextfield=new PageElement(By.name("Data_213843905022010_0"),"Location State Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDistrictTextfield=new PageElement(By.name("Data_213844005022010_0"),"Location District Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfBoilerBPPDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Boiler(BPP)')]/following::select"),"Type of Boiler(BPP) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageOfBoilerYearsTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Age of Boiler (Years )')]/following::input"),"Age of Boiler (Years ) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		boilerSerialNumberTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Boiler Serial Number')]/following::input"),"Boiler Serial Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		boilerDescriptionTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Boiler Description')]/following::textarea"),"Boiler Description Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherBoilerIsRequiredToBeCertifiedByBoilerInspectorateDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether boiler is required to be certified by boiler inspectorate')]/following::select"),"Whether boiler is required to be certified by boiler inspectorate Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredOfheBoilerTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured of the Boiler')]/following::input"),"Sum Insured of the Boiler Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nameOfTheMachineDropdown=new PageElement(By.xpath("//td//div[@id='Name of the Machine']/following::select[1]"),"Name of the Machine Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineDetailsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Machine Details')]/following::textarea"),"Machine Details Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoOfMachineTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Serial No of Machine')]/following::input"),"Serial No of Machine Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherItIsStandByDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether it is Stand By')]/following::select"),"Whether it is Stand By Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherInsuranceForTheSparePartsRequiredDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Whether insurance for the spare parts required')]/following::select"),"Whether insurance for the spare parts required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valueOfTheSparesOfTheMachineTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Value of the spares of the Machine')]/following::input"),"Value of the spares of the Machine Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsForIndividualMachineTextfield=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured(Rs) for Individual Machine')]/following::input"),"Sum Insured(Rs) for Individual Machine Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessAmountIncreasedToDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Excess Amount increased to')]/following::select"),"Excess Amount increased to Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		nameOfTheMachineLWTextField= new PageElement(By.xpath("//td/div[contains(text(),'Name of the Machine(LW)')]/following::input"),"Name of the Machine(LW) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		machineDetailsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Machine Details')]/following::textarea"),"Machine Details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoOfMachineTextField= new PageElement(By.xpath("//td/div[contains(text(),'Serial No of Machine')]/following::input"),"Serial No of Machine Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quantityTextField= new PageElement(By.xpath("//td/div[contains(text(),'Quantity')]/following::input"),"Quantity Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		machineCapacityTextField= new PageElement(By.xpath("//td/div[contains(text(),'Machine Capacity')]/following::input"),"Machine Capacity Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unitOfCapacityDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Unit of Capacity')]/following::select"),"Unit of Capacity Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		speedOfMachineInRPMTextField= new PageElement(By.xpath("//td/div[contains(text(),'Speed of Machine ( In RPM )')]/following::input"),"Speed of Machine ( In RPM ) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfMakeDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Year of Make')]/following::select"),"Year of Make Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherImportedOrIndigenousMachineDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether Imported or Indigenous Machine')]/following::select"),"Whether Imported or Indigenous Machine Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskLocationNameTextField= new PageElement(By.xpath("//td/div[contains(text(),'Risk Location Name')]/following::input"),"Risk Location Name Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relativeImportancePercentTextField= new PageElement(By.xpath("//td/div[contains(text(),'Relative Importance (%)')]/following::input"),"Relative Importance (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherCriticalSparePartsAvailableDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether Critical Spare Parts available')]/following::select"),"Whether Critical Spare Parts available Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		turboGeneratorDetailsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Turbo Generator Details')]/following::textarea"),"Turbo Generator Details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsuranceSpareOnlyAvailableDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether the Insurance Spare only available')]/following::select"),"Whether the Insurance Spare only available Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether the Spare parts which can reduce the liability upto 2 weeks only available')]/following::select"),"Whether the Spare parts which can reduce the liability upto 2 weeks only available Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether the Spare parts which can reduce the liability more than 2 weeks available')]/following::select"),"Whether the Spare parts which can reduce the liability more than 2 weeks available Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reserveCapacityIsAvailableDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Reserve capacity is available')]/following::select"),"Reserve capacity is available Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whatIsTheRateApplicableAccordingToTheReserveCapacityTextField= new PageElement(By.xpath("//td/div[contains(text(),'What is the Rate applicable according to the Reserve Capacity')]/following::input"),"What is the Rate applicable according to the Reserve Capacity Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfShiftsDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Number of Shifts')]/following::select"),"Number of Shifts Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whatIsTheRateApplicableAccordingToTheIndustryTextField= new PageElement(By.xpath("//td/div[contains(text(),'What is the Rate applicable according to the Industry')]/following::input"),"What is the Rate applicable according to the Industry Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfTheMachineTextField= new PageElement(By.xpath("//td/div[contains(text(),'Age of the Machine')]/following::input"),"Age of the Machine Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product name=WP
		nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox= new PageElement(By.xpath("//td/div[contains(text(),'Name of the machine with capacity details (i.e. risk type)')]/following::input"),"Name of the machine with capacity details (i.e. risk type) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTransmissionLineIsRequiredDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether Transmission Line is required')]/following::select"),"Whether Transmission Line is required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transmissionLineDetailsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Transmission Line details')]/following::select"),"Transmission Line details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transmissionLineSumInsuredRsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Transmission Line Sum insured (Rs)')]/following::input"),"Transmission Line Sum insured (Rs) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherAnyOtherItemNotListedAboveIsRequiredDropDown= new PageElement(By.xpath("//td/div[contains(text(),'Whether Any other item (Not listed above) is required')]/following::select"),"Whether Any other item (Not listed above) is required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOtherItemNotListedAboveDetailsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Any other item (Not listed above) details')]/following::textarea"),"Any other item (Not listed above) details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoOfAnyOtherItemNotListedAboveTextField= new PageElement(By.xpath("//td/div[contains(text(),'Serial no of Any other item (Not listed above)')]/following::input"),"Serial no of Any other item (Not listed above) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOtherItemNotListedAboveSumInsuredRsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Any other item (Not listed above) Sum insured (Rs)')]/following::input"),"Any other item (Not listed above) Sum insured (Rs) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quantityAnyOtherItemNotlistedAboveTextField= new PageElement(By.xpath("//td/div[contains(text(),'Quantity Any other item (Not listed above)')]/following::input"),"Quantity Any other item (Not listed above) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	sumInsuredTextField= new PageElement(By.xpath("//td/div[contains(text(),'Quantity Any other item (Not listed above)')]/following::input"),"Quantity Any other item (Not listed above) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredWindMillTextField= new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured(WindMill)')]/following::input"),"Sum Insured(WindMill) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredRsForIndividualWindMillTextField= new PageElement(By.xpath("//td/div[contains(text(),'Total sum insured (Rs) for Individual Wind mill')]/following::input"),"Total sum insured (Rs) for Individual Wind mill Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_Product name=LE
		preferredTypeAndDurationOfMaintenancePeriodCoverTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Preferred Type and duration of Maintenance period Cover')]/following::textarea"),"Preferred Type and duration of Maintenance period Cover textArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestWordingForSectionITexArea= new PageElement(By.xpath("//td/div[contains(text(),'Insured Interest Wording for Section I')]/following::textarea"),"Insured Interest Wording for Section I textArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestWordingForSectionIITexArea= new PageElement(By.xpath("//td/div[contains(text(),'Insured Interest Wording for SECTION II')]/following::textarea"),"Insured Interest Wording for Section II textArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestWordingForSectionIIIALOPTexArea= new PageElement(By.xpath("//td/div[contains(text(),'Insured Interest Wording for SECTION III (ALOP)')]/following::textarea"),"Insured Interest Wording for SECTION III (ALOP) textArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitOfIndemnityForEarthquakeVolcanismTsunamiTextField= new PageElement(By.xpath("//td/div[contains(text(),'Limit of Indemnity for Earthquake, Volcanism, Tsunami')]/following::input"),"Limit of Indemnity for Earthquake, Volcanism, Tsunami Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitOfIndemnityForStormCycloneFloodInundationLandslideTextField= new PageElement(By.xpath("//td/div[contains(text(),'Limit of Indemnity for Storm, Cyclone, flood, Inundation, Landslide')]/following::input"),"Limit of Indemnity for Storm, Cyclone, flood, Inundation, Landslide Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//le
		subjectivitiesTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Subjectivities')]/following::textarea"),"Subjectivities", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exclusionsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Exclusions')]/following::textarea"),"Exclusions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfArrivalFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of Arrival of Project Material')]/following::input/following::a[@name='firstFocus']"), "Date of Arrival of Project Material", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfCommencementOfErectionFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of Commencement of Erection')]/following::input/following::a[@name='firstFocus']"), "Date of Commencement of Erection", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfCommencementOfCivilWorkFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of Commencement of Civil work')]/following::input/following::a[@name='firstFocus']"), "Date of Commencement of Civil work", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//ER shruti
		earthquakeDistrictZonefindButton= new PageElement(By.xpath("//td//div[contains(text(),'Earthquake District (Zone)')]/following::input/following::a[@name='firstFocus']"), "Earthquake District (Zone) Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//ALOP
		policyNumberOfTheERCRMETextField = new PageElement(By.xpath("//td/div[contains(text(),'Policy Number of the ER/CR/ME')]/following::input"),"Policy Number of the ER/CR/ME TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentReflectingTheDependencyOnTheTypeOfRiskDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Component Reflecting the Dependency on the Type of Risk.(CTR)')]/following::select"),"Component Reflecting the Dependency on the Type of Risk.(CTR) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentsReflectingTheDependencyOnAnAboveAverageExposureToPerilsOfNatureDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Components Reflecting the Dependency on an above average exposure to Perils of nature (Earthquake, Storm, Flood)CPN')]/following::select"),"Components Reflecting the Dependency on an above average exposure to Perils of nature (Earthquake, Storm, Flood)CPN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentConcerningTheDependencyOnTheRiskAggravatingTECHNICALCHARACTERISTICSDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the Dependency on the Risk-Aggravating TECHNICAL CHARACTERISTICS of the immediate Environment, the Construction, the Plant or part thereof.CTC')]/following::select"),"Component Concerning the Dependency on the Risk-Aggravating TECHNICAL CHARACTERISTICS of the immediate Environment, the Construction, the Plant or part thereof.CTC Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentConcerningTheDependencyOnTheComplexityOfTheProjectDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the Dependency on the Complexity of the Project. CCO')]/following::select"),"Component Concerning the Dependency on the Complexity of the Project. CCO Dropdwon", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentConcerningThePossibilityOfAdaptingTheWorksProgramAfterLossDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the Possibility of Adapting the works Program after a loss in order to meet the Planned completion Date. CPR')]/following::select"),"Component Concerning the Possibility of Adapting the works Program after a loss in order to meet the Planned completion Date. CPR Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		componentConcerningTheImpactOnRepairTimeAsFunctionOfTheLocationDropdwon= new PageElement(By.xpath("//td/div[contains(text(),'Component Concerning the impact on Repair time as a function of the location and infrastructure facilities in or around the site.CLO')]/following::select"),"Component Concerning the impact on Repair time as a function of the location and infrastructure facilities in or around the site.CLO Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingTheIndemnityFormDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting the Indemnity form(FIF)')]/following::select"),"Factor Reflecting the Indemnity form(FIF) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingRedundanciesAvailableDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting Redundancies Available (FRE)')]/following::select"),"Factor Reflecting Redundancies Available (FRE) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingTheSeasonalFluctuationDropdown= new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting the Seasonal Fluctuation of the production figures over the year (FSF)')]/following::select"),"Factor Reflecting the Seasonal Fluctuation of the production figures over the year (FSF) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netProfitTextField= new PageElement(By.xpath("//td/div[contains(text(),'Net Profit')]/following::input"),"Net Profit Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standingChargesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Standing charges')]/following::input"),"Standing charges Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeOfMarineErectionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Transit Type of Marine cum Erection')]/following::select"),"Transit Type of Marine cum Erection Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalLossOnlyDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Total Loss Only')]/following::select"),"Total Loss Only Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverValidFromTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cover Valid From')]/following::input"),"Cover Valid From", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredEngTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Sum Insured(Eng)')]/following::input"),"Total Sum Insured(Eng)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableSumInsuredDuringExtensionPeriodTextField=new PageElement(By.xpath("//td/div[contains(text(),'Applicable Sum Insured during Extension Period')]/following::input"),"Applicable Sum Insured during Extension Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionPeriodInMonthsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension Period (In Months)')]/following::input"),"Extension Period (In Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableAddOnSumInsuredDuringExtensionPeriodTextField=new PageElement(By.xpath("//td/div[contains(text(),'Applicable Add on Sum Insured during Extension Period')]/following::input"),"Applicable Add on Sum Insured during Extension Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillPolicyInsuredIntrestEngineeringDetails(PolInsIntEngEntity polInsIntEngEntity, CustomAssert assertReference) throws InterruptedException{

		//******************CM(INSURED INTREST) CHINTAN*****************
		if(polInsIntEngEntity.getAction().equalsIgnoreCase("add") || polInsIntEngEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheManufacturer")) {
				clearAndSendKeys(nameOfTheManufacturerTextBox, polInsIntEngEntity.getStringValueForField("NameOfTheManufacturer"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigYearOfMake")) {
				selectValueFromList(yearOfMakeDropdown, polInsIntEngEntity.getStringValueForField("YearOfMake"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfThemachineForCPM")) {
				selectValueFromList(nameOfThemachineForCPMDropdown, polInsIntEngEntity.getStringValueForField("NameOfThemachineForCPM"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigCPMGroupname")) {
				clearAndSendKeys(cPMGroupnameTextBox, polInsIntEngEntity.getStringValueForField("CPMGroupname"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredOfTheMachine")) {
				clearAndSendKeys(sumInsuredOfTheMachineTextBox, polInsIntEngEntity.getStringValueForField("SumInsuredOfTheMachine"));
			}
		/*	if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineryWorkingUndergroundTunnels")) {
				selectValueFromList(machineryWorkingUndergroundTunnelsDropdown, polInsIntEngEntity.getStringValueForField("MachineryWorkingUndergroundTunnels"));
			}*/
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheMachineIsUsedInRailwayTrack")) {
				selectValueFromList(whetherTheMachineIsUsedInRailwayTrackDropdown, polInsIntEngEntity.getStringValueForField("WhetherTheMachineIsUsedInRailwayTrack"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineSerialNumber")) {
				clearAndSendKeys(machineSerialNumberTextBox, polInsIntEngEntity.getStringValueForField("MachineSerialNumber"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDescription")) {
				clearAndSendKeys(machineDescriptionTextBox, polInsIntEngEntity.getStringValueForField("MachineDescription"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigQuantity")) {
				clearAndSendKeys(quantityTextBox, polInsIntEngEntity.getStringValueForField("Quantity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheEarthquakeCoverIsRequired")) {
				selectValueFromList(whetherTheEarthquakeCoverIsRequiredDropdown, polInsIntEngEntity.getStringValueForField("WhetherTheEarthquakeCoverIsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				selectValueFromList(earthquakeZoneDropdown, polInsIntEngEntity.getStringValueForField("EarthquakeZone"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigCPMGroupLevelOfExcess")) {
				selectValueFromList(cPMGroupLevelOfExcessDropdown, polInsIntEngEntity.getStringValueForField("CPMGroupLevelOfExcess"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfUsageArea")) {
				selectValueFromList(typeOfUsageAreaDropdown, polInsIntEngEntity.getStringValueForField("TypeOfUsageArea"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigwhetherMachineEquipmentMountedOnFloatingVesselCraft")) {
				selectValueFromList(whetherMachineEquipmentMountedOnFloatingVesselCraftDropdown,polInsIntEngEntity.getStringValueForField("whetherMachineEquipmentMountedOnFloatingVesselCraft"));
			}

			//******************ER(INSURED INTREST) CHINTAN*****************
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfProjectRisk")) {
				selectValueFromList(typeOfProjectRiskDropDown,polInsIntEngEntity.getStringValueForField("TypeOfProjectRisk"));
			}
			//sonali-CR
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfRiskCR")) {
				selectValueFromList(typeOfRiskCRDropDown,polInsIntEngEntity.getStringValueForField("TypeOfRiskCR"));
			}
			//
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNatureOfProject")) {
				selectValueFromList(natureOfProjectDropDown,polInsIntEngEntity.getStringValueForField("NatureOfProject"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				clearAndSendKeys(descriptionOfProjectDescription1TextBox,polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription1"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				clearAndSendKeys(descriptionOfProjectDescription2TextBox,polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription2"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				clearAndSendKeys(descriptionOfProjectDescription3TextBox,polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription3"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDateOfArrivalOfProjectMaterialFirstConsignment")) {
				//String dateofArrival=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("DateOfArrivalOfProjectMaterialFirstConsignment"));
				//clearAndEnterDate(dateOfArrivalOfProjectMaterialFirstConsignmentTextBox, dateofArrival);	
				click(dateOfArrivalFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfArrivalFindButton, polInsIntEngEntity.getStringValueForField("DateOfArrivalOfProjectMaterialFirstConsignment"));
				switchToFrame("display");
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCommencementOfErection")) {
				/*String expectedDateOfCommencement=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfErection"));
				clearAndEnterDate(expectedDateOfCommencementOfErectionTextBox, expectedDateOfCommencement);		*/		
				click(dateOfCommencementOfErectionFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfCommencementOfErectionFindButton, polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfErection"));
				switchToFrame("display");
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCommencementOfCivilwork")) {
				/*String expectedDateOfCommencementOfCivilwork=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfCivilwork"));
				clearAndEnterDate(expectedDateOfCommencementOfCivilworkTextBox, expectedDateOfCommencementOfCivilwork);		*/
				click(dateOfCommencementOfCivilWorkFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfCommencementOfCivilWorkFindButton, polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfCivilwork"));
				switchToFrame("display");
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCompletionOfErection")) {
				String expectedDateOfCompletionOfErection=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCompletionOfErection"));
				clearAndEnterDate(expectedDateOfCompletionOfErectionTextBox, expectedDateOfCompletionOfErection);	
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDurationOfTestingPeriodInMonths")) {
				clearAndSendKeys(durationOfTestingPeriodInMonthsTextBox,polInsIntEngEntity.getStringValueForField("DurationOfTestingPeriodInMonths"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthQuakeCover")) {
				selectValueFromList(earthQuakeCoverDropDown,polInsIntEngEntity.getStringValueForField("EarthQuakeCover"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeState")) {
				selectValueFromList(earthquakeStateDropDown,polInsIntEngEntity.getStringValueForField("EarthquakeState"));
			}
				//String eartquakedistrict=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("EarthquakeDistrictZone"));
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")) {
				//clearAndEnterDate(earthquakeDistrictZoneTextBox, eartquakedistrict);
				fillearthquakeDistrictZone(polInsIntEngEntity);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOriginalProjectEndDate")) {
				String orignalprojEnddate=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("OriginalProjectEndDate"));
				clearAndEnterDate(originalProjectEndDateTextBox, orignalprojEnddate);
			}
			//******************AM(INSURED INTREST) CHINTAN*****************
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyNumberOfheMarineCargoPolicy")) {
				clearAndSendKeys(policyNumberOfheMarineCargoPolicyTextBox,polInsIntEngEntity.getStringValueForField("PolicyNumberOfheMarineCargoPolicy"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNetRateOfTheMarineCargoPolicy")) {
				clearAndSendKeys(netRateOfTheMarineCargoPolicyTextBox,polInsIntEngEntity.getStringValueForField("NetRateOfTheMarineCargoPolicy"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentReflectingTheDependencyOnTheTypeOfRiskCTR")) {
				selectValueFromList(componentReflectingTheDependencyOnTheTypeOfRiskCTRDropDown,polInsIntEngEntity.getStringValueForField("ComponentReflectingTheDependencyOnTheTypeOfRiskCTR"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentsReflectingTheDependencyOnAnAboveAverage")) {
				selectValueFromList(componentsReflectingTheDependencyOnAnAboveAverageDropDown,polInsIntEngEntity.getStringValueForField("ComponentsReflectingTheDependencyOnAnAboveAverage"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningTheDependencyOnTheComplexityOfTheProject")) {
				selectValueFromList(componentConcerningTheDependencyOnTheComplexityOfTheProjectDropDown,polInsIntEngEntity.getStringValueForField("ComponentConcerningTheDependencyOnTheComplexityOfTheProject"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningThePossibilityOfAdaptingTheWorks")) {
				selectValueFromList(componentConcerningThePossibilityOfAdaptingTheWorksDropDown,polInsIntEngEntity.getStringValueForField("ComponentConcerningThePossibilityOfAdaptingTheWorks"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningTheImpactOnRepairTimeAsAFunction")) {
				selectValueFromList(componentConcerningTheImpactOnRepairTimeAsAFunctionDropDown,polInsIntEngEntity.getStringValueForField("ComponentConcerningTheImpactOnRepairTimeAsAFunction"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingTheIndemnityFormFIF")) {
				selectValueFromList(factorReflectingTheIndemnityFormFIFDropDown,polInsIntEngEntity.getStringValueForField("FactorReflectingTheIndemnityFormFIF"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingRedundanciesAvailableFRED")) {
				selectValueFromList(factorReflectingRedundanciesAvailableFREDropDown,polInsIntEngEntity.getStringValueForField("FactorReflectingRedundanciesAvailableFRED"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingTheSeasonalFluctuation")) {
				selectValueFromList(factorReflectingTheSeasonalFluctuationDropDown,polInsIntEngEntity.getStringValueForField("FactorReflectingTheSeasonalFluctuation"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOthers")) {
				selectValueFromList(othersDropDown,polInsIntEngEntity.getStringValueForField("Others"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
				clearAndSendKeys(underInsurancePercentTextBox,polInsIntEngEntity.getStringValueForField("UnderInsurancePercent"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
				fillPolicyAttributeAMT2PolEngineering(polInsIntEngEntity,assertReference );
			}
			//********************CR(INSURED INTREST)CHINTAN*****************

			if (polInsIntEngEntity.getBooleanValueForField("ConfigSubClassOfRisk")) {
				selectValueFromList(subClassOfRiskDropDown,polInsIntEngEntity.getStringValueForField("SubClassOfRisk"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEstimatedConstructionPeriodFrom")) {
				String estimatedconstructionfrom=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("EstimatedConstructionPeriodFrom"));
				clearAndEnterDate(estimatedConstructionPeriodFromTextBox, estimatedconstructionfrom);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEstimatedConstructionPeriodTo")) {
				String estimatedconstructionto=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("EstimatedConstructionPeriodTo"));
				clearAndEnterDate(estimatedConstructionPeriodToTextBox, estimatedconstructionto);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigProbableDateOfCompletionofconstruction")) {
				String dateofcompilation=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ProbableDateOfCompletionofconstruction"));
				clearAndEnterDate(probableDateOfCompletionofconstructionTextBox, dateofcompilation);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription1ForContractWorks")) {
				clearAndSendKeys(description1ForContractWorksTextBox,polInsIntEngEntity.getStringValueForField("Description1ForContractWorks"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription2ForContractWork")) {
				clearAndSendKeys(description2ForContractWorksTextBox,polInsIntEngEntity.getStringValueForField("Description2ForContractWork"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription3ForContractWorks")) {
				clearAndSendKeys(description3ForContractWorksTextBox,polInsIntEngEntity.getStringValueForField("Description3ForContractWorks"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForFirstLossBasis")) {
				clearAndSendKeys(optionForFirstLossBasisDropDown,polInsIntEngEntity.getStringValueForField("ForFirstLossBasis"));
			}

			//Mayur_Product name=DS
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineryInsurancePolicyNumber")) {
				clearAndSendKeys(machineryInsurancePolicyNumberTextField, polInsIntEngEntity.getStringValueForField("PolicyNumberOfTheERCRME"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAddressOfColdStorage")) {
				clearAndSendKeys(addressOfColdStorageTextArea, polInsIntEngEntity.getStringValueForField("AddressOfColdStorage"));
			}
			//Mayur_Product name=EC
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheRisk")) {
				selectValueFromList(nameOfTheRiskDropDown, polInsIntEngEntity.getStringValueForField("NameOfTheRisk"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskDetails")) {
				clearAndSendKeys(riskDetailsTextArea, polInsIntEngEntity.getStringValueForField("RiskDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntEngEntity.getStringValueForField("SpecialConditions"));
			}
			/*	if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				selectValueFromList(earthquakeZoneDropDown, polInsIntEngEntity.getStringValueForField("EarthquakeZone"));
			} */
			if (polInsIntEngEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				selectValueFromList(yearOfBuiltDropDown, polInsIntEngEntity.getStringValueForField("YearOfBuilt"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherFireAndLighteningCoverToBeDeleted")) {
				selectValueFromList(whetherFireAndLighteningCoverToBeDeletedDropDown, polInsIntEngEntity.getStringValueForField("WhetherFireAndLighteningCoverToBeDeleted"));
			}
			//Mayur_Product name=ET
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLocationName")) {
				clearAndSendKeys(locationNameTextfield, polInsIntEngEntity.getStringValueForField("LocationName"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLocationDetails")) {
				clearAndSendKeys(locationDetailsTextArea, polInsIntEngEntity.getStringValueForField("LocationDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredForPropertyDamageTotalContractValue")) {
				clearAndSendKeys(sumInsuredForPropertyDamageTotalContractValueTextfield, polInsIntEngEntity.getStringValueForField("SumInsuredForPropertyDamageTotalContractValue"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDetailsOfAnnualBuildUpOfValue")) {
				clearAndSendKeys(detailsOfAnnualBuildUpOfValueTextfield, polInsIntEngEntity.getStringValueForField("DetailsOfAnnualBuildUpOfValue"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredForBusinessInterruptionALOP")) {
				clearAndSendKeys(sumInsuredForBusinessInterruptionALOPTextfield, polInsIntEngEntity.getStringValueForField("SumInsuredForBusinessInterruptionALOP"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigIndemnityPeriodMonths")) {
				selectValueFromList(indemnityPeriodMonthsDropDown, polInsIntEngEntity.getStringValueForField("IndemnityPeriodMonths"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForLimitOfIndemnityEvent")) {
				selectValueFromList(optionForLimitOfIndemnityEventDropDown, polInsIntEngEntity.getStringValueForField("OptionForLimitOfIndemnityEvent"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityCombinedPDAndBIEvent")) {
				clearAndSendKeys(limitOfIndemnityCombinedPDAndBIEventTextfield, polInsIntEngEntity.getStringValueForField("LimitOfIndemnityCombinedPDAndBIEvent"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForLimitOfIndemnityAggregate")) {
				selectValueFromList(optionForLimitOfIndemnityAggregateDropDown, polInsIntEngEntity.getStringValueForField("OptionForLimitOfIndemnityAggregate"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityCombinedPDAndBIAggregate")) {
				clearAndSendKeys(limitOfIndemnityCombinedPDAndBIAggregateTextfield, polInsIntEngEntity.getStringValueForField("LimitOfIndemnityCombinedPDAndBIAggregate"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyPeriodExtension")) {
				selectValueFromList(policyPeriodExtensionDropDown, polInsIntEngEntity.getStringValueForField("PolicyPeriodExtension"));
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheEquipmentIeRiskType")){
				selectValueFromList(nameOfTheEquipmentIeRiskTypeDropdown,polInsIntEngEntity.getStringValueForField("NameOfTheEquipmentIeRiskType"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEquipmentDetails")) {
				clearAndSendKeys(equipmentDetailsTextarea, polInsIntEngEntity.getStringValueForField("EquipmentDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEquipmentSerialNumber")) {
				clearAndSendKeys(equipmentSerialNumberTextfield, polInsIntEngEntity.getStringValueForField("EquipmentSerialNumber"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextfield, polInsIntEngEntity.getStringValueForField("SumInsured"));
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigIncreaseExcessAmountTo")){
				selectValueFromList(increaseExcessAmountToDropdown,polInsIntEngEntity.getStringValueForField("IncreaseExcessAmountTo"));
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigWhetherItIsBioMedicalEquipment")){
				selectValueFromList(whetherItIsBioMedicalEquipmentDropdown,polInsIntEngEntity.getStringValueForField("WhetherItIsBioMedicalEquipment"));
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigIsAMCInForce")){
				selectValueFromList(isAMCInForceDropdown,polInsIntEngEntity.getStringValueForField("IsAMCInForce"));
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigUsageAreaType")){
				selectValueFromList(usageAreaTypeDropdown,polInsIntEngEntity.getStringValueForField("UsageAreaType"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigParameterListForLocationDetails")) {
				fillParameterListForLocationDetails(polInsIntEngEntity);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigWhetherDeletionOfExceptionKIsRequired")){
				selectValueFromList(whetherDeletionOfExceptionKIsRequiredDropdown,polInsIntEngEntity.getStringValueForField("WhetherDeletionOfExceptionKIsRequired"));
			}
			//BP-Yogesh
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfBoilerBPP")) {
				selectValueFromList(typeOfBoilerBPPDropdown,polInsIntEngEntity.getStringValueForField("TypeOfBoilerBPP"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfBoilerYears")) {
				clearAndSendKeys(ageOfBoilerYearsTextfield, polInsIntEngEntity.getStringValueForField("AgeOfBoilerYears"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigBoilerSerialNumber")) {
				clearAndSendKeys(boilerSerialNumberTextfield, polInsIntEngEntity.getStringValueForField("BoilerSerialNumber"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigBoilerDescription")) {
				clearAndSendKeys(boilerDescriptionTextarea, polInsIntEngEntity.getStringValueForField("BoilerDescription"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherBoilerIsRequiredToBeCertifiedByBoilerInspectorate")) {
				selectValueFromList(whetherBoilerIsRequiredToBeCertifiedByBoilerInspectorateDropdown,polInsIntEngEntity.getStringValueForField("WhetherBoilerIsRequiredToBeCertifiedByBoilerInspectorate"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredOfheBoiler")) {
				clearAndSendKeys(sumInsuredOfheBoilerTextfield, polInsIntEngEntity.getStringValueForField("SumInsuredOfheBoiler"));
			}
			//MB-Yogesh
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachine")) {
				selectValueFromList(nameOfTheMachineDropdown,polInsIntEngEntity.getStringValueForField("NameOfTheMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDetails")) {
				clearAndSendKeys(machineDetailsTextarea, polInsIntEngEntity.getStringValueForField("MachineDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfMachine")) {
				clearAndSendKeys(serialNoOfMachineTextfield, polInsIntEngEntity.getStringValueForField("SerialNoOfMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherItIsStandBy")) {
				selectValueFromList(whetherItIsStandByDropdown,polInsIntEngEntity.getStringValueForField("WhetherItIsStandBy"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherInsuranceForTheSparePartsRequired")) {
				selectValueFromList(whetherInsuranceForTheSparePartsRequiredDropdown,polInsIntEngEntity.getStringValueForField("WhetherInsuranceForTheSparePartsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigValueOfTheSparesOfTheMachine")) {
				clearAndSendKeys(valueOfTheSparesOfTheMachineTextfield, polInsIntEngEntity.getStringValueForField("ValueOfTheSparesOfTheMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredRsForIndividualMachine")) {
				clearAndSendKeys(sumInsuredRsForIndividualMachineTextfield, polInsIntEngEntity.getStringValueForField("SumInsuredRsForIndividualMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExcessAmountIncreasedTo")) {
				selectValueFromList(excessAmountIncreasedToDropdown,polInsIntEngEntity.getStringValueForField("ExcessAmountIncreasedTo"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfMachine")) {
				clearAndSendKeys(serialNoOfMachineTextField, polInsIntEngEntity.getStringValueForField("SerialNoOfMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineCapacity")) {
				clearAndSendKeys(machineCapacityTextField, polInsIntEngEntity.getStringValueForField("MachineCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnitOfCapacity")) {
				selectValueFromList(unitOfCapacityDropDown,polInsIntEngEntity.getStringValueForField("UnitOfCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpeedOfMachineInRPM")) {
				clearAndSendKeys(speedOfMachineInRPMTextField, polInsIntEngEntity.getStringValueForField("SpeedOfMachineInRPM"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherImportedOrIndigenousMachine")) {
				selectValueFromList(whetherImportedOrIndigenousMachineDropDown,polInsIntEngEntity.getStringValueForField("WhetherImportedOrIndigenousMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskLocationName")) {
				clearAndSendKeys(riskLocationNameTextField, polInsIntEngEntity.getStringValueForField("RiskLocationName"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherCriticalSparePartsAvailable")) {
				selectValueFromList(whetherCriticalSparePartsAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherCriticalSparePartsAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTurboGeneratorDetails")) {
				clearAndSendKeys(turboGeneratorDetailsTextArea, polInsIntEngEntity.getStringValueForField("TurboGeneratorDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheInsuranceSpareOnlyAvailable")) {
				selectValueFromList(whetherTheInsuranceSpareOnlyAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheInsuranceSpareOnlyAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable")) {
				selectValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable")) {
				selectValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigReserveCapacityIsAvailable")) {
				selectValueFromList(reserveCapacityIsAvailableDropDown,polInsIntEngEntity.getStringValueForField("ReserveCapacityIsAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheReserveCapacity")) {
				clearAndSendKeys(whatIsTheRateApplicableAccordingToTheReserveCapacityTextField, polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheReserveCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNumberOfShifts")) {
				selectValueFromList(numberOfShiftsDropDown,polInsIntEngEntity.getStringValueForField("NumberOfShifts"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfTheMachine")) {
				clearAndSendKeys(ageOfTheMachineTextField, polInsIntEngEntity.getStringValueForField("AgeOfTheMachine"));
			}
			//Mayur_Product name=WP
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineWithCapacityDetailsieRiskType")) {
				clearAndSendKeys(nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox, polInsIntEngEntity.getStringValueForField("NameOfTheMachineWithCapacityDetailsieRiskType"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTransmissionLineIsRequired")) {
				selectValueFromList(whetherTransmissionLineIsRequiredDropDown, polInsIntEngEntity.getStringValueForField("WhetherTransmissionLineIsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineDetails")) {
				clearAndSendKeys(transmissionLineDetailsTextArea, polInsIntEngEntity.getStringValueForField("TransmissionLineDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineSumInsuredRs")) {
				clearAndSendKeys(transmissionLineSumInsuredRsTextField, polInsIntEngEntity.getStringValueForField("TransmissionLineSumInsuredRs"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherAnyOtherItemNotListedAboveIsRequired")) {
				selectValueFromList(whetherAnyOtherItemNotListedAboveIsRequiredDropDown, polInsIntEngEntity.getStringValueForField("WhetherAnyOtherItemNotListedAboveIsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveDetails")) {
				clearAndSendKeys(anyOtherItemNotListedAboveDetailsTextArea, polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfAnyOtherItemNotListedAbove")) {
				clearAndSendKeys(serialNoOfAnyOtherItemNotListedAboveTextField, polInsIntEngEntity.getStringValueForField("SerialNoOfAnyOtherItemNotListedAbove"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveSumInsuredRs")) {
				clearAndSendKeys(anyOtherItemNotListedAboveSumInsuredRsTextField, polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveSumInsuredRs"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredWindMill")) {
				clearAndSendKeys(sumInsuredWindMillTextField, polInsIntEngEntity.getStringValueForField("SumInsuredWindMill"));
			}
			//Mayur_Product name=LE
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPreferredTypeAndDurationOfMaintenancePeriodCover")) {
				clearAndSendKeys(preferredTypeAndDurationOfMaintenancePeriodCoverTextArea, polInsIntEngEntity.getStringValueForField("PreferredTypeAndDurationOfMaintenancePeriodCover"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSubjectivities")) {
				clearAndSendKeys(subjectivitiesTextArea, polInsIntEngEntity.getStringValueForField("Subjectivities"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExclusions")) {
				clearAndSendKeys(exclusionsTextArea, polInsIntEngEntity.getStringValueForField("Exclusions"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionI")) {
				clearAndSendKeys(insuredInterestWordingForSectionITexArea, polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionI"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionII")) {
				clearAndSendKeys(insuredInterestWordingForSectionIITexArea, polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionII"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionIIIALOP")) {
				clearAndSendKeys(insuredInterestWordingForSectionIIIALOPTexArea, polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionIIIALOP"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityForStormCycloneFloodInundationLandslide")) {
				clearAndSendKeys(limitOfIndemnityForStormCycloneFloodInundationLandslideTextField, polInsIntEngEntity.getStringValueForField("LimitOfIndemnityForStormCycloneFloodInundationLandslide"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityForEarthquakeVolcanismTsunami")) {
				clearAndSendKeys(limitOfIndemnityForEarthquakeVolcanismTsunamiTextField, polInsIntEngEntity.getStringValueForField("LimitOfIndemnityForEarthquakeVolcanismTsunami"));
			}
			//Mayur_Product name=LW
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineLW")) {
				clearAndSendKeys(nameOfTheMachineLWTextField, polInsIntEngEntity.getStringValueForField("NameOfTheMachineLW"));
			}
			//if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDetails")) {
			//	clearAndSendKeys(machineDetailsTextArea, polInsIntEngEntity.getStringValueForField("MachineDetails"));
			//}
			//if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfMachine")) {
			//	clearAndSendKeys(serialNoOfMachineTextField, polInsIntEngEntity.getStringValueForField("SerialNoOfMachine"));
			//}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineCapacity")) {
				clearAndSendKeys(machineCapacityTextField, polInsIntEngEntity.getStringValueForField("MachineCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnitOfCapacity")) {
				selectValueFromList(unitOfCapacityDropDown,polInsIntEngEntity.getStringValueForField("UnitOfCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpeedOfMachineInRPM")) {
				clearAndSendKeys(speedOfMachineInRPMTextField, polInsIntEngEntity.getStringValueForField("SpeedOfMachineInRPM"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherImportedOrIndigenousMachine")) {
				selectValueFromList(whetherImportedOrIndigenousMachineDropDown,polInsIntEngEntity.getStringValueForField("WhetherImportedOrIndigenousMachine"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskLocationName")) {
				clearAndSendKeys(riskLocationNameTextField, polInsIntEngEntity.getStringValueForField("RiskLocationName"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherCriticalSparePartsAvailable")) {
				selectValueFromList(whetherCriticalSparePartsAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherCriticalSparePartsAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTurboGeneratorDetails")) {
				clearAndSendKeys(turboGeneratorDetailsTextArea, polInsIntEngEntity.getStringValueForField("TurboGeneratorDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheInsuranceSpareOnlyAvailable")) {
				selectValueFromList(whetherTheInsuranceSpareOnlyAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheInsuranceSpareOnlyAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable")) {
				selectValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable")) {
				selectValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown,polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigReserveCapacityIsAvailable")) {
				selectValueFromList(reserveCapacityIsAvailableDropDown,polInsIntEngEntity.getStringValueForField("ReserveCapacityIsAvailable"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheReserveCapacity")) {
				clearAndSendKeys(whatIsTheRateApplicableAccordingToTheReserveCapacityTextField, polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheReserveCapacity"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNumberOfShifts")) {
				selectValueFromList(numberOfShiftsDropDown,polInsIntEngEntity.getStringValueForField("NumberOfShifts"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfTheMachine")) {
				clearAndSendKeys(ageOfTheMachineTextField, polInsIntEngEntity.getStringValueForField("AgeOfTheMachine"));
			}
			//Mayur_Product name=WP
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineWithCapacityDetailsieRiskType")) {
				clearAndSendKeys(nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox, polInsIntEngEntity.getStringValueForField("NameOfTheMachineWithCapacityDetailsieRiskType"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTransmissionLineIsRequired")) {
				selectValueFromList(whetherTransmissionLineIsRequiredDropDown, polInsIntEngEntity.getStringValueForField("WhetherTransmissionLineIsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineDetails")) {
				clearAndSendKeys(transmissionLineDetailsTextArea, polInsIntEngEntity.getStringValueForField("TransmissionLineDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineSumInsuredRs")) {
				clearAndSendKeys(transmissionLineSumInsuredRsTextField, polInsIntEngEntity.getStringValueForField("TransmissionLineSumInsuredRs"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherAnyOtherItemNotListedAboveIsRequired")) {
				selectValueFromList(whetherAnyOtherItemNotListedAboveIsRequiredDropDown, polInsIntEngEntity.getStringValueForField("WhetherAnyOtherItemNotListedAboveIsRequired"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveDetails")) {
				clearAndSendKeys(anyOtherItemNotListedAboveDetailsTextArea, polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveDetails"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfAnyOtherItemNotListedAbove")) {
				clearAndSendKeys(serialNoOfAnyOtherItemNotListedAboveTextField, polInsIntEngEntity.getStringValueForField("SerialNoOfAnyOtherItemNotListedAbove"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveSumInsuredRs")) {
				clearAndSendKeys(anyOtherItemNotListedAboveSumInsuredRsTextField, polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveSumInsuredRs"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredWindMill")) {
				clearAndSendKeys(sumInsuredWindMillTextField, polInsIntEngEntity.getStringValueForField("SumInsuredWindMill"));
			}
			//ALOP

			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyNumberOfTheERCRME")) {
				clearAndSendKeys(policyNumberOfTheERCRMETextField, polInsIntEngEntity.getStringValueForField("PolicyNumberOfTheERCRME"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepTypeOfRisk")) {
				selectValueFromList(componentReflectingTheDependencyOnTheTypeOfRiskDropdown, polInsIntEngEntity.getStringValueForField("ComponentRefDepTypeOfRisk"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepAboveAvgExposure")) {
				selectValueFromList(componentsReflectingTheDependencyOnAnAboveAverageExposureToPerilsOfNatureDropdown, polInsIntEngEntity.getStringValueForField("ComponentRefDepAboveAvgExposure"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepRiskAggTECH")) {
				selectValueFromList(componentConcerningTheDependencyOnTheRiskAggravatingTECHNICALCHARACTERISTICSDropdown, polInsIntEngEntity.getStringValueForField("ComponentRefDepRiskAggTECH"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepCompProject")) {
				selectValueFromList(componentConcerningTheDependencyOnTheComplexityOfTheProjectDropdown, polInsIntEngEntity.getStringValueForField("ComponentRefDepCompProject"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepAdapWorks")) {
				selectValueFromList(componentConcerningThePossibilityOfAdaptingTheWorksProgramAfterLossDropdown, polInsIntEngEntity.getStringValueForField("ComponentRefDepAdapWorks"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepFunLocation")) {
				selectValueFromList(componentConcerningTheImpactOnRepairTimeAsFunctionOfTheLocationDropdwon, polInsIntEngEntity.getStringValueForField("ComponentRefDepFunLocation"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefIndemnityForm")) {
				selectValueFromList(factorReflectingTheIndemnityFormDropdown, polInsIntEngEntity.getStringValueForField("FactorRefIndemnityForm"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefReduAvail")) {
				selectValueFromList(factorReflectingRedundanciesAvailableDropdown, polInsIntEngEntity.getStringValueForField("FactorRefReduAvail"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefSeasonalFluc")) {
				selectValueFromList(factorReflectingTheSeasonalFluctuationDropdown, polInsIntEngEntity.getStringValueForField("FactorRefSeasonalFluc"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNetProfit")) {
				clearAndSendKeys(netProfitTextField, polInsIntEngEntity.getStringValueForField("NetProfit"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigStandingCharges")) {
				clearAndSendKeys(standingChargesTextField, polInsIntEngEntity.getStringValueForField("StandingCharges"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransitTypeMarineErection")) {
				selectValueFromList(transitTypeOfMarineErectionDropDown, polInsIntEngEntity.getStringValueForField("TransitTypeMarineErection"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				selectValueFromList(totalLossOnlyDropDown, polInsIntEngEntity.getStringValueForField("TotalLossOnly"));
			}
			
			//ER
			if (polInsIntEngEntity.getBooleanValueForField("ConfigCoverValidFrom")) {
				String coverValidFrom=RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("CoverValidFrom"));
				clearAndEnterDate(coverValidFromTextField, coverValidFrom);	
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigApplicableSumInsuredDuringExtensionPeriod")) {
				clearAndSendKeys(applicableSumInsuredDuringExtensionPeriodTextField, polInsIntEngEntity.getStringValueForField("ApplicableSumInsuredDuringExtensionPeriod"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExtensionPeriodInMonths")) {
				clearAndSendKeys(extensionPeriodInMonthsTextField, polInsIntEngEntity.getStringValueForField("ExtensionPeriodInMonths"));
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigApplicableAddOnSumInsuredDuringExtensionPeriod")) {
				clearAndSendKeys(applicableAddOnSumInsuredDuringExtensionPeriodTextField, polInsIntEngEntity.getStringValueForField("ApplicableAddOnSumInsuredDuringExtensionPeriod"));
			}
			
			
		}

		else if(polInsIntEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheManufacturer")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheManufacturer"), fetchValueFromTextFields(nameOfTheManufacturerTextBox), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigYearOfMake")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("YearOfMake"), fetchValueFromList(yearOfMakeDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfThemachineFor")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfThemachineFor"), fetchValueFromList(nameOfThemachineForCPMDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigCPMGroupname")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("CPMGroupname"), fetchValueFromTextFields(cPMGroupnameTextBox), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredOfTheMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredOfTheMachine"), fetchValueFromTextFields(sumInsuredOfTheMachineTextBox), AssertionType.WARNING);
			}

			/*if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineryWorkingUndergroundTunnels")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineryWorkingUndergroundTunnels"), fetchValueFromList(machineryWorkingUndergroundTunnelsDropdown), AssertionType.WARNING);
			}
*/
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheMachineIsUsedInRailwayTrack")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheMachineIsUsedInRailwayTrack"), fetchValueFromList(whetherTheMachineIsUsedInRailwayTrackDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineSerialNumber")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineSerialNumber"), fetchValueFromTextFields(machineSerialNumberTextBox), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDescription")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineDescription"), fetchValueFromTextFields(machineDescriptionTextBox), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigQuantity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Quantity"), fetchValueFromTextFields(quantityTextBox), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheEarthquakeCoverIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheEarthquakeCoverIsRequired"), fetchValueFromList(whetherTheEarthquakeCoverIsRequiredDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EarthquakeZone"), fetchValueFromList(earthquakeZoneDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigCPMGroupLevelOfExcess")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("CPMGroupLevelOfExcess"), fetchValueFromList(cPMGroupLevelOfExcessDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfUsageArea")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TypeOfUsageArea"), fetchValueFromList(typeOfUsageAreaDropdown), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherMachineEquipmentMountedOnFloatingVesselCraft")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherMachineEquipmentMountedOnFloatingVesselCraft"), fetchValueFromList(whetherMachineEquipmentMountedOnFloatingVesselCraftDropdown), AssertionType.WARNING);
			}
			//******************ER(INSURED INTREST) CHINTAN*****************
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfProjectRisk")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TypeOfProjectRisk"),fetchValueFromList(typeOfProjectRiskDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfRiskCR")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TypeOfProjectRisk"),fetchValueFromList(typeOfRiskCRDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNatureOfProject")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NatureOfProject"),fetchValueFromList(natureOfProjectDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription1"),fetchValueFromTextFields(descriptionOfProjectDescription1TextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription2"),fetchValueFromTextFields(descriptionOfProjectDescription2TextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription3"),fetchValueFromTextFields(descriptionOfProjectDescription3TextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDateOfArrivalOfProjectMaterialFirstConsignment")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("DateOfArrivalOfProjectMaterialFirstConsignment")), fetchValueFromTextFields(dateOfArrivalOfProjectMaterialFirstConsignmentTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCommencementOfErection")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfErection")), fetchValueFromTextFields(expectedDateOfCommencementOfErectionTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCommencementOfCivilwork")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCommencementOfCivilwork")), fetchValueFromTextFields(expectedDateOfCommencementOfCivilworkTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExpectedDateOfCompletionOfErection")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ExpectedDateOfCompletionOfErection"),fetchValueFromTextFields(expectedDateOfCompletionOfErectionTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDurationOfTestingPeriodInMonths")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DurationOfTestingPeriodInMonths"),fetchValueFromTextFields(durationOfTestingPeriodInMonthsTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthQuakeCover")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EarthQuakeCover"),fetchValueFromList(earthQuakeCoverDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeState")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EarthquakeState"),fetchValueFromList(earthquakeStateDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EarthquakeDistrictZone"),fetchValueFromTextFields(earthquakeDistrictZoneTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOriginalProjectEndDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("OriginalProjectEndDate")) ,fetchValueFromTextFields(originalProjectEndDateTextBox), AssertionType.WARNING);
			}
			//******************AM(INSURED INTREST) CHINTAN*****************

			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyNumberOfheMarineCargoPolicy")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PolicyNumberOfheMarineCargoPolicy"),fetchValueFromTextFields(policyNumberOfheMarineCargoPolicyTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNetRateOfTheMarineCargoPolicy")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NetRateOfTheMarineCargoPolicy"),fetchValueFromTextFields(netRateOfTheMarineCargoPolicyTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentReflectingTheDependencyOnTheTypeOfRiskCTR")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentReflectingTheDependencyOnTheTypeOfRiskCTR"),fetchValueFromList(componentReflectingTheDependencyOnTheTypeOfRiskCTRDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentsReflectingTheDependencyOnAnAboveAverage")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentsReflectingTheDependencyOnAnAboveAverage"),fetchValueFromList(componentsReflectingTheDependencyOnAnAboveAverageDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningTheDependencyOnTheComplexityOfTheProject")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentConcerningTheDependencyOnTheComplexityOfTheProject"),fetchValueFromList(componentConcerningTheDependencyOnTheComplexityOfTheProjectDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningThePossibilityOfAdaptingTheWorks")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentConcerningThePossibilityOfAdaptingTheWorks"),fetchValueFromList(componentConcerningThePossibilityOfAdaptingTheWorksDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentConcerningTheImpactOnRepairTimeAsAFunction")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentConcerningTheImpactOnRepairTimeAsAFunction"),fetchValueFromList(componentConcerningTheImpactOnRepairTimeAsAFunctionDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingTheIndemnityFormFIF")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorReflectingTheIndemnityFormFIF"),fetchValueFromList(factorReflectingTheIndemnityFormFIFDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingRedundanciesAvailableFRED")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorReflectingRedundanciesAvailableFRED"),fetchValueFromList(factorReflectingRedundanciesAvailableFREDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorReflectingTheSeasonalFluctuation")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorReflectingTheSeasonalFluctuation"),fetchValueFromList(factorReflectingTheSeasonalFluctuationDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOthers")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Others"),fetchValueFromList(othersDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("UnderInsurancePercent"),fetchValueFromTextFields(underInsurancePercentTextBox), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfiglPolicyAttributeAMT2PolEngineering")){
				//verifyfillPolicyAttributeAMT2PolEngineering(polInsIntEngEntity,assertReference);			
			}
			//********************CR(INSURED INTREST)CHINTAN*****************
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSubClassOfRisk")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SubClassOfRisk"), fetchValueFromList(subClassOfRiskDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEstimatedConstructionPeriodFrom")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("EstimatedConstructionPeriodFrom")) ,fetchValueFromTextFields(estimatedConstructionPeriodFromTextBox), AssertionType.WARNING);

			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEstimatedConstructionPeriodTo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("EstimatedConstructionPeriodTo")) ,fetchValueFromTextFields(estimatedConstructionPeriodToTextBox), AssertionType.WARNING);

			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigProbableDateOfCompletionofconstruction")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntEngEntity.getStringValueForField("ProbableDateOfCompletionofconstructio")) ,fetchValueFromTextFields(probableDateOfCompletionofconstructionTextBox), AssertionType.WARNING);

			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription1ForContractWorks")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Description1ForContractWorks"), fetchValueFromTextFields(description1ForContractWorksTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription2ForContractWork")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Description2ForContractWor"), fetchValueFromTextFields(description2ForContractWorksTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescription3ForContractWorks")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Description3ForContractWorks"), fetchValueFromTextFields(description3ForContractWorksTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForFirstLossBasis")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("OptionForFirstLossBasis"), fetchValueFromList(optionForFirstLossBasisDropDown), AssertionType.WARNING);
			}
			//Mayur_Product name=DS
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DescriptionOfProjectDescription1"), fetchValueFromFields(descriptionOfProjectDescription1TextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAddressOfColdStorage")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AddressOfColdStorage"), fetchValueFromFields(addressOfColdStorageTextArea), AssertionType.WARNING);
			}
			//Mayur_Product name=EC
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheRisk")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheRisk"), fetchValueFromList(nameOfTheRiskDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("RiskDetails"), fetchValueFromFields(riskDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SpecialConditions"), fetchValueFromFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EarthquakeZone"), fetchValueFromList(earthquakeZoneDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("YearOfBuilt"), fetchValueFromList(yearOfBuiltDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherFireAndLighteningCoverToBeDeleted")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherFireAndLighteningCoverToBeDeleted"), fetchValueFromList(whetherFireAndLighteningCoverToBeDeletedDropDown), AssertionType.WARNING);
			}
			//Mayur_Product name=ET
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLocationName")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationName"), fetchValueFromTextFields(locationNameTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLocationDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationDetails"), fetchValueFromTextFields(locationDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredForPropertyDamageTotalContractValue")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredForPropertyDamageTotalContractValue"), fetchValueFromTextFields(sumInsuredForPropertyDamageTotalContractValueTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigDetailsOfAnnualBuildUpOfValue")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("DetailsOfAnnualBuildUpOfValue"), fetchValueFromTextFields(detailsOfAnnualBuildUpOfValueTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredForBusinessInterruptionALOP")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredForBusinessInterruptionALOP"), fetchValueFromTextFields(sumInsuredForBusinessInterruptionALOPTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigIndemnityPeriodMonths")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("IndemnityPeriodMonths"), fetchValueFromList(indemnityPeriodMonthsDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForLimitOfIndemnityEvent")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("OptionForLimitOfIndemnityEvent"), fetchValueFromList(optionForLimitOfIndemnityEventDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityCombinedPDAndBIEvent")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LimitOfIndemnityCombinedPDAndBIEvent"), fetchValueFromTextFields(limitOfIndemnityCombinedPDAndBIEventTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigOptionForLimitOfIndemnityAggregate")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("OptionForLimitOfIndemnityAggregate"), fetchValueFromList(optionForLimitOfIndemnityAggregateDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityCombinedPDAndBIAggregate")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LimitOfIndemnityCombinedPDAndBIAggregate"), fetchValueFromTextFields(limitOfIndemnityCombinedPDAndBIAggregateTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyPeriodExtension")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PolicyPeriodExtension"), fetchValueFromList(policyPeriodExtensionDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheEquipmentIeRiskType")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheEquipmentIeRiskType"), fetchValueFromList(nameOfTheEquipmentIeRiskTypeDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEquipmentDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EquipmentDetails"), fetchValueFromTextFields(equipmentDetailsTextarea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigEquipmentSerialNumber")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("EquipmentSerialNumber"), fetchValueFromTextFields(equipmentSerialNumberTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigIncreaseExcessAmountTo")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("IncreaseExcessAmountTo"), fetchValueFromList(increaseExcessAmountToDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherItIsBioMedicalEquipment")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherItIsBioMedicalEquipment"), fetchValueFromList(whetherItIsBioMedicalEquipmentDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigIsAMCInForce")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("IsAMCInForce"), fetchValueFromList(isAMCInForceDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUsageAreaType")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("UsageAreaType"), fetchValueFromList(usageAreaTypeDropdown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigParameterListForLocationDetails")){
				verifyParameterListForLocationDetails(polInsIntEngEntity,assertReference);			
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherDeletionOfExceptionKIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherDeletionOfExceptionKIsRequired"), fetchValueFromList(whetherDeletionOfExceptionKIsRequiredDropdown), AssertionType.WARNING);
			}
			//BP-yogesh
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTypeOfBoilerBPP")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TypeOfBoilerBPP"), fetchValueFromList(typeOfBoilerBPPDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfBoilerYears")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AgeOfBoilerYears"), fetchValueFromTextFields(ageOfBoilerYearsTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigBoilerSerialNumber")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("BoilerSerialNumber"), fetchValueFromTextFields(boilerSerialNumberTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigBoilerDescription")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("BoilerDescription"), fetchValueFromTextFields(boilerDescriptionTextarea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherBoilerIsRequiredToBeCertifiedByBoilerInspectorate")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherBoilerIsRequiredToBeCertifiedByBoilerInspectorate"), fetchValueFromList(whetherBoilerIsRequiredToBeCertifiedByBoilerInspectorateDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredOfheBoiler")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredOfheBoiler"), fetchValueFromTextFields(sumInsuredOfheBoilerTextfield), AssertionType.WARNING);
			}
			//MB-Yogesh
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheMachine"), fetchValueFromList(nameOfTheMachineDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineDetails"), fetchValueFromTextFields(machineDetailsTextarea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SerialNoOfMachine"), fetchValueFromTextFields(serialNoOfMachineTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherItIsStandBy")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherItIsStandBy"), fetchValueFromList(whetherItIsStandByDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherInsuranceForTheSparePartsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherInsuranceForTheSparePartsRequired"), fetchValueFromList(whetherInsuranceForTheSparePartsRequiredDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigValueOfTheSparesOfTheMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ValueOfTheSparesOfTheMachine"), fetchValueFromTextFields(valueOfTheSparesOfTheMachineTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredRsForIndividualMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredRsForIndividualMachine"), fetchValueFromTextFields(sumInsuredRsForIndividualMachineTextfield), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExcessAmountIncreasedTo")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ExcessAmountIncreasedTo"), fetchValueFromList(excessAmountIncreasedToDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineCapacity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineCapacity"), fetchValueFromTextFields(machineCapacityTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnitOfCapacity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("UnitOfCapacity"), fetchValueFromList(unitOfCapacityDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpeedOfMachineInRPM")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SpeedOfMachineInRPM"), fetchValueFromTextFields(speedOfMachineInRPMTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherImportedOrIndigenousMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherImportedOrIndigenousMachine"), fetchValueFromList(whetherImportedOrIndigenousMachineDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskLocationName")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("RiskLocationName"), fetchValueFromTextFields(riskLocationNameTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRelativeImportancePercent")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("RelativeImportancePercent"), fetchValueFromTextFields(relativeImportancePercentTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherCriticalSparePartsAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherCriticalSparePartsAvailable"), fetchValueFromList(whetherCriticalSparePartsAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTurboGeneratorDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TurboGeneratorDetails"), fetchValueFromTextFields(turboGeneratorDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheInsuranceSpareOnlyAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheInsuranceSpareOnlyAvailable"), fetchValueFromList(whetherTheInsuranceSpareOnlyAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable"), fetchValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable"), fetchValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigReserveCapacityIsAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ReserveCapacityIsAvailable"), fetchValueFromList(reserveCapacityIsAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheReserveCapacity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheReserveCapacity"), fetchValueFromTextFields(whatIsTheRateApplicableAccordingToTheReserveCapacityTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNumberOfShifts")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NumberOfShifts"), fetchValueFromList(numberOfShiftsDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheIndustry")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheIndustry"), fetchValueFromTextFields(whatIsTheRateApplicableAccordingToTheIndustryTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfTheMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AgeOfTheMachine"), fetchValueFromTextFields(ageOfTheMachineTextField), AssertionType.WARNING);
			}
			//Mayur_Product name=WP
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineWithCapacityDetailsieRiskType")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheMachineWithCapacityDetailsieRiskType"), fetchValueFromTextFields(nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTransmissionLineIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTransmissionLineIsRequired"), fetchValueFromList(whetherTransmissionLineIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransmissionLineDetails"), fetchValueFromTextFields(transmissionLineDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineSumInsuredRs")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransmissionLineSumInsuredRs"), fetchValueFromTextFields(transmissionLineSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherAnyOtherItemNotListedAboveIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherAnyOtherItemNotListedAboveIsRequired"), fetchValueFromList(whetherAnyOtherItemNotListedAboveIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveDetails"), fetchValueFromTextFields(anyOtherItemNotListedAboveDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfAnyOtherItemNotListedAbove")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SerialNoOfAnyOtherItemNotListedAbove"), fetchValueFromTextFields(serialNoOfAnyOtherItemNotListedAboveTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveSumInsuredRs")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveSumInsuredRs"), fetchValueFromTextFields(anyOtherItemNotListedAboveSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigQuantityAnyOtherItemNotlistedAbove")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("QuantityAnyOtherItemNotlistedAbove"), fetchValueFromTextFields(quantityAnyOtherItemNotlistedAboveTextField), AssertionType.WARNING);
			}

			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredWindMill")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredWindMill"), fetchValueFromTextFields(sumInsuredWindMillTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTotalSumInsuredRsForIndividualWindMill")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TotalSumInsuredRsForIndividualWindMill"), fetchValueFromTextFields(totalSumInsuredRsForIndividualWindMillTextField), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigShipmentsInExcessOfUSD5000000")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ShipmentsInExcessOfUSD5000000"), fetchValueFromList(shipmentsInExcessOfUSD5000000DropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigTransformerShipment")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransformerShipment"), fetchValueFromList(transformerShipmentDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigOverDimensionalCargo")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("OverDimensionalCargo"), fetchValueFromList(overDimensionalCargoDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigItemIncludingPackingWeighingInExcessOf50MTPrivate")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ItemIncludingPackingWeighingInExcessOf50MTPrivate"), fetchValueFromList(itemIncludingPackingWeighingInExcessOf50MTPrivateDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigItemsRequiringSpecialHandling")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ItemsRequiringSpecialHandling"), fetchValueFromList(itemsRequiringSpecialHandlingDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigItemsHavingSpecialRequirementForLoadingLashingAndSecuring")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ItemsHavingSpecialRequirementForLoadingLashingAndSecuring"), fetchValueFromList(itemsHavingSpecialRequirementForLoadingLashingAndSecuringDropDown), AssertionType.WARNING);
			}

			if(polInsIntEngEntity.getBooleanValueForField("ConfigBargeShipmentReplacementTimeInExcess")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("BargeShipmentReplacementTimeInExcess"), fetchValueFromList(bargeShipmentReplacementTimeInExcessDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigReplacementTimeInExcessOf6Months")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ReplacementTimeInExcessOf6Months"), fetchValueFromList(replacementTimeInExcessOf6MonthsDropDown), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigShipmentsWithin3MonthsOfScheduledCommencement")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ShipmentsWithin3MonthsOfScheduledCommencement"), fetchValueFromList(shipmentsWithin3MonthsOfScheduledCommencementDropDown), AssertionType.WARNING);
			}
			//Mayur_Product name=LE
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPreferredTypeAndDurationOfMaintenancePeriodCover")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PreferredTypeAndDurationOfMaintenancePeriodCover"), fetchValueFromTextFields(preferredTypeAndDurationOfMaintenancePeriodCoverTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSubjectivities")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Subjectivities"), fetchValueFromTextFields(subjectivitiesTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExclusions")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("Exclusions"), fetchValueFromTextFields(exclusionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionI")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionI"), fetchValueFromTextFields(insuredInterestWordingForSectionITexArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionII")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionII"), fetchValueFromTextFields(insuredInterestWordingForSectionIITexArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForSectionIIIALOP")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("InsuredInterestWordingForSectionIIIALOP"), fetchValueFromTextFields(insuredInterestWordingForSectionIIIALOPTexArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityForStormCycloneFloodInundationLandslide")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LimitOfIndemnityForStormCycloneFloodInundationLandslide"), fetchValueFromTextFields(limitOfIndemnityForStormCycloneFloodInundationLandslideTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigLimitOfIndemnityForEarthquakeVolcanismTsunami")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LimitOfIndemnityForEarthquakeVolcanismTsunami"), fetchValueFromTextFields(limitOfIndemnityForEarthquakeVolcanismTsunamiTextField), AssertionType.WARNING);
			}
			//Mayur_Product name=LW
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineLW")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheMachineLW"), fetchValueFromTextFields(nameOfTheMachineLWTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineDetails"), fetchValueFromTextFields(machineDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineCapacity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("MachineCapacity"), fetchValueFromTextFields(machineCapacityTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigUnitOfCapacity")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("UnitOfCapacity"), fetchValueFromList(unitOfCapacityDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSpeedOfMachineInRPM")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SpeedOfMachineInRPM"), fetchValueFromTextFields(speedOfMachineInRPMTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherImportedOrIndigenousMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherImportedOrIndigenousMachine"), fetchValueFromList(whetherImportedOrIndigenousMachineDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRiskLocationName")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("RiskLocationName"), fetchValueFromTextFields(riskLocationNameTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigRelativeImportancePercent")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("RelativeImportancePercent"), fetchValueFromTextFields(relativeImportancePercentTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherCriticalSparePartsAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherCriticalSparePartsAvailable"), fetchValueFromList(whetherCriticalSparePartsAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTurboGeneratorDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TurboGeneratorDetails"), fetchValueFromTextFields(turboGeneratorDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheInsuranceSpareOnlyAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheInsuranceSpareOnlyAvailable"), fetchValueFromList(whetherTheInsuranceSpareOnlyAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailable"), fetchValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityUpto2WeeksOnlyAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailable"), fetchValueFromList(whetherTheSparePartsWhichCanReduceTheLiabilityMoreThan2WeeksAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigReserveCapacityIsAvailable")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ReserveCapacityIsAvailable"), fetchValueFromList(reserveCapacityIsAvailableDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheReserveCapacityTextField")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheReserveCapacityTextField"), fetchValueFromTextFields(whatIsTheRateApplicableAccordingToTheReserveCapacityTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNumberOfShifts")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NumberOfShifts"), fetchValueFromList(numberOfShiftsDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhatIsTheRateApplicableAccordingToTheIndustry")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhatIsTheRateApplicableAccordingToTheIndustry"), fetchValueFromTextFields(whatIsTheRateApplicableAccordingToTheIndustryTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAgeOfTheMachine")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AgeOfTheMachine"), fetchValueFromTextFields(ageOfTheMachineTextField), AssertionType.WARNING);
			}
			//Mayur_Product name=WP
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNameOfTheMachineWithCapacityDetailsieRiskType")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NameOfTheMachineWithCapacityDetailsieRiskType"), fetchValueFromTextFields(nameOfTheMachineWithCapacityDetailsieRiskTypeTextBox), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherTransmissionLineIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherTransmissionLineIsRequired"), fetchValueFromList(whetherTransmissionLineIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransmissionLineDetails"), fetchValueFromTextFields(transmissionLineDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransmissionLineSumInsuredRs")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransmissionLineSumInsuredRs"), fetchValueFromTextFields(transmissionLineSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigWhetherAnyOtherItemNotListedAboveIsRequired")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WhetherAnyOtherItemNotListedAboveIsRequired"), fetchValueFromList(whetherAnyOtherItemNotListedAboveIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveDetails")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveDetails"), fetchValueFromTextFields(anyOtherItemNotListedAboveDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoOfAnyOtherItemNotListedAbove")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SerialNoOfAnyOtherItemNotListedAbove"), fetchValueFromTextFields(serialNoOfAnyOtherItemNotListedAboveTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigAnyOtherItemNotListedAboveSumInsuredRs")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("AnyOtherItemNotListedAboveSumInsuredRs"), fetchValueFromTextFields(anyOtherItemNotListedAboveSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigQuantityAnyOtherItemNotlistedAbove")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("QuantityAnyOtherItemNotlistedAbove"), fetchValueFromTextFields(quantityAnyOtherItemNotlistedAboveTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigSumInsuredWindMill")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SumInsuredWindMill"), fetchValueFromTextFields(sumInsuredWindMillTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTotalSumInsuredRsForIndividualWindMill")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TotalSumInsuredRsForIndividualWindMill"), fetchValueFromTextFields(totalSumInsuredRsForIndividualWindMillTextField), AssertionType.WARNING);
			}

			//ALOP
			if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyNumberOfTheERCRME")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PolicyNumberOfTheERCRME"), fetchValueFromTextFields(policyNumberOfTheERCRMETextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepTypeOfRisk")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepTypeOfRisk"), fetchValueFromList(componentReflectingTheDependencyOnTheTypeOfRiskDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepAboveAvgExposure")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepAboveAvgExposure"), fetchValueFromList(componentsReflectingTheDependencyOnAnAboveAverageExposureToPerilsOfNatureDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepRiskAggTECH")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepRiskAggTECH"), fetchValueFromList(componentConcerningTheDependencyOnTheRiskAggravatingTECHNICALCHARACTERISTICSDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepCompProject")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepCompProject"), fetchValueFromList(componentConcerningTheDependencyOnTheComplexityOfTheProjectDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepAdapWorks")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepAdapWorks"), fetchValueFromList(componentConcerningThePossibilityOfAdaptingTheWorksProgramAfterLossDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigComponentRefDepFunLocation")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ComponentRefDepFunLocation"), fetchValueFromList(componentConcerningTheImpactOnRepairTimeAsFunctionOfTheLocationDropdwon), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefIndemnityForm")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorRefIndemnityForm"), fetchValueFromList(factorReflectingTheIndemnityFormDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefReduAvail")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorRefReduAvail"), fetchValueFromList(factorReflectingRedundanciesAvailableDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigFactorRefSeasonalFluc")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("FactorRefSeasonalFluc"), fetchValueFromList(factorReflectingTheSeasonalFluctuationDropdown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigNetProfit")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("NetProfit"), fetchValueFromTextFields(netProfitTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigStandingCharges")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("StandingCharges"), fetchValueFromTextFields(standingChargesTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTransitTypeMarineErection")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TransitTypeMarineErection"), fetchValueFromList(transitTypeOfMarineErectionDropDown), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			//ER
			if (polInsIntEngEntity.getBooleanValueForField("ConfigCoverValidFrom")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("CoverValidFrom"), fetchValueFromTextFields(coverValidFromTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigTotalSumInsuredEng")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("TotalSumInsuredEng"), fetchValueFromTextFields(totalSumInsuredEngTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigApplicableSumInsuredDuringExtensionPeriod")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ApplicableSumInsuredDuringExtensionPeriod"), fetchValueFromTextFields(applicableSumInsuredDuringExtensionPeriodTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigExtensionPeriodInMonths")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ExtensionPeriodInMonths"), fetchValueFromTextFields(extensionPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigApplicableAddOnSumInsuredDuringExtensionPeriod")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("ApplicableAddOnSumInsuredDuringExtensionPeriod"), fetchValueFromTextFields(applicableAddOnSumInsuredDuringExtensionPeriodTextField), AssertionType.WARNING);
			}
			if (polInsIntEngEntity.getBooleanValueForField("ConfigMachineryInsurancePolicyNumber")) {
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("PolicyNumberOfTheERCRME"), fetchValueFromTextFields(machineryInsurancePolicyNumberTextField), AssertionType.WARNING);
			}
		}
	}

	/*================================================================================================*/	

	public void clickOnOpenButton(PolInsIntEngEntity polInsIntEngEntity) throws InterruptedException{
		if (polInsIntEngEntity.getBooleanValueForField("ConfigOpenInsuredButton")){
			click(openInsuredButton);
			Thread.sleep(5000);
			switchToWindow("Factor Reflecting Critical Items Details");
		}
	}
	public void fillPolicyAttributeAMT2PolEngineering(PolInsIntEngEntity polInsIntEngEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(polInsIntEngEntity);

		shipmentsInExcessOfUSD5000000DropDown=new PageElement(By.name("Data_232272127082010_0"), "shipmentsInExcessOfUSD5000000", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transformerShipmentDropDown=new PageElement(By.name("Data_232272427082010_0"), "transformerShipment", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		overDimensionalCargoDropDown=new PageElement(By.name("Data_232272727082010_0"), "overDimensionalCargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		itemIncludingPackingWeighingInExcessOf50MTPrivateDropDown=new PageElement(By.name("Data_232273027082010_0"), "itemIncludingPackingWeighingInExcessOf50MTPrivate", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		itemsRequiringSpecialHandlingDropDown=new PageElement(By.name("Data_232273327082010_0"), "itemsRequiringSpecialHandlingDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		itemsHavingSpecialRequirementForLoadingLashingAndSecuringDropDown=new PageElement(By.name("Data_232273627082010_0"), "itemsHavingSpecialRequirementForLoadingLashingAndSecuring", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		bargeShipmentReplacementTimeInExcessDropDown=new PageElement(By.name("Data_232273927082010_0"), "bargeShipmentReplacementTimeInExcess", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		replacementTimeInExcessOf6MonthsDropDown=new PageElement(By.name("Data_232274227082010_0"), "replacementTimeInExcessOf6MonthsDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 	
		shipmentsWithin3MonthsOfScheduledCommencementDropDown=new PageElement(By.name("Data_232274527082010_0"), "shipmentsWithin3MonthsOfScheduledCommencement", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		if(polInsIntEngEntity.getBooleanValueForField("ConfigShipmentsInExcessOfUSD5000000")) {
			selectValueFromList(shipmentsInExcessOfUSD5000000DropDown, polInsIntEngEntity.getStringValueForField("ShipmentsInExcessOfUSD5000000"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigTransformerShipment")) {
			selectValueFromList(transformerShipmentDropDown, polInsIntEngEntity.getStringValueForField("TransformerShipment"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigOverDimensionalCargo")) {
			selectValueFromList(overDimensionalCargoDropDown, polInsIntEngEntity.getStringValueForField("OverDimensionalCargo"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigItemIncludingPackingWeighingInExcessOf50MTPrivate")) {
			selectValueFromList(itemIncludingPackingWeighingInExcessOf50MTPrivateDropDown, polInsIntEngEntity.getStringValueForField("ItemIncludingPackingWeighingInExcessOf50MTPrivate"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigItemsRequiringSpecialHandling")) {
			selectValueFromList(itemsRequiringSpecialHandlingDropDown, polInsIntEngEntity.getStringValueForField("ConfigItemsRequiringSpecialHandling"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigItemsHavingSpecialReqForLoadLashAndSecuring")) {
			selectValueFromList(itemsHavingSpecialRequirementForLoadingLashingAndSecuringDropDown, polInsIntEngEntity.getStringValueForField("ItemsHavingSpecialReqForLoadLashAndSecuring"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigBargeShipmentReplacementTimeInExcess")) {
			selectValueFromList(bargeShipmentReplacementTimeInExcessDropDown, polInsIntEngEntity.getStringValueForField("BargeShipmentReplacementTimeInExcess"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigReplacementTimeInExcessOf6Months")) {
			selectValueFromList(replacementTimeInExcessOf6MonthsDropDown, polInsIntEngEntity.getStringValueForField("ReplacementTimeInExcessOf6Months"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigShipmentsWithin3MonthsOfScheduledCommencement")) {
			selectValueFromList(shipmentsWithin3MonthsOfScheduledCommencementDropDown, polInsIntEngEntity.getStringValueForField("ShipmentsWithin3MonthsOfScheduledCommencement"));
		}

		if(polInsIntEngEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteWindowButton);
			switchToFrame("display");
		}

		if(polInsIntEngEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			click(closeWindowButton);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	} 


	public void navigateToPolicy(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void clickOnBackButton(PolInsIntEngEntity polInsIntEngEntity){
		if (polInsIntEngEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickToOpenButton(PolInsIntEngEntity polInsIntEngEntity) throws InterruptedException{
		if(polInsIntEngEntity.getBooleanValueForField("ConfigOpenButtonForLocationDetails")){
			click(openButton);
			switchToWindow("Parameter List for Location Details");
		}
	}

	public void fillParameterListForLocationDetails(PolInsIntEngEntity polInsIntEngEntity) throws InterruptedException{
		clickToOpenButton(polInsIntEngEntity);
		Thread.sleep(3000);
		if (polInsIntEngEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
			//	switchToFrame("display");
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationNameCFCM")){
			clearAndSendKeys(locationNameForNewWindowTextfield,polInsIntEngEntity.getStringValueForField("LocationNameCFCM"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigWorkAddress1")){
			clearAndSendKeys(workAddress1Textarea,polInsIntEngEntity.getStringValueForField("WorkAddress1"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigWorkAddress2")){
			clearAndSendKeys(workAddress2Textarea,polInsIntEngEntity.getStringValueForField("WorkAddress2"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationPinCode")){
			clearAndSendKeys(locationPinCodeTextfield,polInsIntEngEntity.getStringValueForField("LocationPinCode"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationState")){
			clearAndSendKeys(locationStateTextfield,polInsIntEngEntity.getStringValueForField("LocationState"));
		}
		if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationDistrict")){
			clearAndSendKeys(locationDistrictTextfield,polInsIntEngEntity.getStringValueForField("LocationDistrict"));
		}
		if (polInsIntEngEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deletebutton);
			switchToFrame("display");
		}
		if (polInsIntEngEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(savebutton);
			//switchToFrame("display");
		}
		if (polInsIntEngEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");

		}
	}
	public void verifyParameterListForLocationDetails(PolInsIntEngEntity polInsIntEngEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntEngEntity);

		if(polInsIntEngEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntEngEntity.getBooleanValueForField("ConfigSerialNoTextField")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("SerialNo"), fetchValueFromFields(serialnoTextfield), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationNameTextfield")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationName"), fetchValueFromTextFields(locationNameForNewWindowTextfield), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigWorkAddress1Textarea")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WorkAddress1"), fetchValueFromTextFields(workAddress1Textarea), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigworkAddress2Textarea")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("WorkAddress2"), fetchValueFromTextFields(workAddress2Textarea), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationPinCodeTextfield")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationPinCode"), fetchValueFromTextFields(locationPinCodeTextfield), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationStateTextfield")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationState"), fetchValueFromTextFields(locationStateTextfield), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigLocationDistrictTextfield")){
				assertReference.assertEquals(polInsIntEngEntity.getStringValueForField("LocationDistrict"), fetchValueFromTextFields(locationDistrictTextfield), AssertionType.WARNING);
			}
			if(polInsIntEngEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closebutton);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}
	public void fillearthquakeDistrictZone(PolInsIntEngEntity polInsIntEngEntity) throws InterruptedException{
		if(polInsIntEngEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")){
			//click(earthquakeDistrictZoneTextField);
			click(earthquakeDistrictZonefindButton);
			Thread.sleep(3000);
			switchToWindow("Eartquake zone List");
			selectstakeCode(polInsIntEngEntity);
		}
	}
	//**************DF(CHINTAN)1ST PAGE*****************
	public void selectstakeCode(PolInsIntEngEntity polInsIntEngEntity) throws InterruptedException{
		PageElement stakecodeToBeSelectedLink = new PageElement(By.xpath("//a[contains(text(),'"+polInsIntEngEntity.getStringValueForField("SRNo")+"')]"),"Stake Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(stakecodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	public void clickOnSaveButton(PolInsIntEngEntity polInsIntEngEntity)throws InterruptedException{
		if (polInsIntEngEntity.getBooleanValueForField("ConfigSaveButtonWP")) {
			click(forwardButton);
			switchToFrame("display");
			click(savebutton);
			Thread.sleep(3000);
			switchToFrame("display");
			riskDetailTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polInsIntEngEntity.getStringValueForField("RiskDetailTitle")+"')]"), "Risk Detail Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskDetailTitle);

		}
	}


	public void fillandSubmitPolicyInsuredIntrestEngineering(PolInsIntEngEntity polInsIntEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestEngineeringDetails(polInsIntEngEntity,assertReference);
			clickOnForwardButton(polInsIntEngEntity);
			clickOnSaveButton(polInsIntEngEntity);
			navigateToPolicy(polInsIntEngEntity);
			navigateToAttribute(polInsIntEngEntity);
			navigateToInsuredInterest(polInsIntEngEntity);
			navigateToCoverage(polInsIntEngEntity);
			navigateToLoan(polInsIntEngEntity);
			navigateToClientDetails(polInsIntEngEntity);
			navigateToRelation(polInsIntEngEntity);
			navigateToPayment(polInsIntEngEntity);
			navigateToFollowup(polInsIntEngEntity);
			navigateToDocument(polInsIntEngEntity);
			navigateToInsuredInterestDetails(polInsIntEngEntity);
			navigateToInsuredInterestAttributes(polInsIntEngEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntEngEntity);
			navigateToInsuredInterestRelations(polInsIntEngEntity);
			navigateToInsuredInterestPayments(polInsIntEngEntity);
		}
	}
}


