package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskPropFireEntity;
import com.aqm.staf.library.databin.PolInsIntAttrFireEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;
import com.aqm.staf.library.databin.ProjectDetailEngEntity;
import com.aqm.staf.library.databin.RiskFinanceDFireEntity;

public class PolicyInsuredIntrestAttributeFire extends BasePage{
	//******************AR(cHINTAN)1ST PAGE*******************************
	private PageElement locationDetailsOpenButton;
	private PageElement	underWritingClassificationDropDown;	
	//private PageElement	typeOfIndustryOccupationDropDown;	
	private PageElement	whetherEscalationClauseoptedDropDown;	
	private PageElement	escalationPercentageTextField;
	private PageElement	technicalDiscountPercentageTextField; 
	private PageElement	discretionaryDiscountPercentageTextField;	 
	private PageElement	excessoptedByTheInsuredForMaterialDamagesectionOfIARpolicyDropDown;	
	private PageElement	voluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicyDropDown;	
	private PageElement	applicableVoluntaryDeductibleDiscountForMaterialDamageTextField;
	private PageElement	applicableVoluntaryDeductibleDiscountTextField;
	private PageElement	howManyYearsTheProposedIARPolicyIncludingExpiringPolicyDropDown;	
	private PageElement	incurredClaimRatioDropDown;	
	private PageElement	applicableIARAsaWholeDiscountTextField; 
	private PageElement	whetherCompoundWallIsDesiredForInsurancecoverDropDown;	
	private PageElement	sumInsuredonCompoundWallTextField;	 
	private PageElement	netProfitTextField;	 
	private PageElement	standingChargesTextField;	 
	private PageElement grossProfittoBeInsuredTextField;	 
	private PageElement anyotherItemInsuredSeparatelyTextField;	 
	private PageElement indemnityPeriodInMonthsTextField;	 
	private PageElement sTFITextField;	
	//open button
	private PageElement	serialNoTextField;
	private PageElement	locationNameTextField;
	private PageElement	locationAddressTextField;
	private PageElement	sectionCodeDropDown; 	
	private PageElement	riskCodeDropDown;	
	private PageElement	rateCodeDropDown;	
	private PageElement	buildingPlinthAndFoundationsTextField;
	private PageElement	plantMachineryAndAccessoriesTextField; 	
	private PageElement	furnitureFittingsFixturesAndOtherContentsTextField; 	
	private PageElement	pipingTextField;
	private PageElement cablingTextField; 	
	private PageElement	stocksAndStocksInprocessTextField; 	
	private PageElement	stocksHeldInTrustTextField; 	
	private PageElement	materialStoredInTheOpenGasHoldersTankFarmsTextField; 	
	private PageElement	totalSumInsuredAtTheLocationTextField; 	
	private PageElement	sumInsuredOfTheContentsOfProcessBlockTextField;
	private PageElement	earthquakeZoneDropDown;
	private PageElement	pinCodeDropDown;
	private PageElement	natureOfOccupancyDropDown;
	private PageElement	hazardousGoodsForShops305DropDown; 	
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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	//**********************DF(CHINTAN)1ST PAGE *******************************
	private PageElement sectionCodeFloaterDropDown;
	private PageElement riskDescriptionSection4DropDown;
	private PageElement riskDescriptionGodownsandSilosDropDown;
	//private PageElement earthquakeStateDropDown;
	private PageElement earthquakeDistrictZoneTextField;
	private PageElement materialClassificationforSpontaneousCombustionDropDown;
	//**********************FD(CHINTAN)1ST PAGE *******************************
	private PageElement	sectionCodeFDDropDown;
	private PageElement	riskDescriptionSection7DropDown;
	private PageElement	materialStoredInDropDown;	
	private PageElement	whetherGodownIslocatedInBasementDropDown;	
	private PageElement	whetherGodownLocationCoveredUnderPolicyIssituatedInSEZDropDown;
	private PageElement	probableMaximumLossPMLTextField;
	private PageElement	MaximumPerLocationLimitSI;
	//**********************FD AND FF SAME(CHINTAN)1ST PAGE *******************************
	//**********************FP(CHINTAN) 1ST PAGE ********************
	private PageElement	riskCoveredTextArea;
	private PageElement	descriptionOfTheRiskTextArea;
	private PageElement optedCoverdetailsTextArea;
	private PageElement specialPerilsTextArea;
	private PageElement	specialExclusionsTextArea;
	private PageElement	subjectToClauseTextArea;
	private PageElement	excessInPercentageDropDown;
	private PageElement specialConditionsTextArea;
	private PageElement	sumInsuredRsTextField;
	private PageElement	otherDetailsTariffedPolicyTextArea;
	private PageElement	otherDetailsTextArea;
	private PageElement	specialDiscountAmountTextField;
	private PageElement	premiumRatePercentageTextField;
	//LR
	private PageElement serialNumberLrTextField;
	private PageElement addressOfTheLocationLrTextField;	
	private PageElement districtLrTextField;	
	private PageElement pincodeLrTextField;	
	private PageElement siForBuildingsLrTextField;	
	private PageElement siForPlantAndMachineryLrTextField;	
	private PageElement siForFurnitureFixturesFittingsAndOtherContentsLrTextField;	
	private PageElement siForStocksOtherThanDeclarationLrTextField;	
	private PageElement siForStocksOnDeclarationLrTextField;	
	private PageElement totalSiPdLrTextField;	
	private PageElement siDueToFlopLrTextField;	
	private PageElement indemnityPeriodForFlopLrTextField;	
	private PageElement siDueToMlopLrTextField;
	private PageElement indemnityPeriodForMlopLrTextField;
	private PageElement riskDescriptionTextArea;
	//PE
	private PageElement blockDetailsOpenButton;
	private PageElement typeOfIndustryOccupationPetrochemicalDropDown;	
	private PageElement whetherTheBlockIsPetrochemicalDropDown;	
	private PageElement baseRatePetrochemicalTextField;	
	private PageElement discretionaryDiscountTextField;	
	private PageElement excessOptedByTheInsuredDropDown;	
	private PageElement whetherTheRiskIsSituatedInSezDropDown;	
	private PageElement whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverDropDown;	
	private PageElement netLoadingTextField;	
	private PageElement netDiscountTextField;
	private PageElement typeOfNonPetrochemicalBlockDropDown;
	//PE Open Button
	//	private PageElement serialNoTextField;	
	private PageElement blockNumberAsPerTheInsuredsInstructionsTextField;	
	private PageElement nameOfTheBlockTextField;
	private PageElement buildingSuperStructureTextField;
	//	private PageElement buildingPlinthAndFoundationsTextField;	
	//	private PageElement plantMachineryAndAccessoriesTextField;
	//	private PageElement furnitureFittingsFixturesAndOtherContentsTextField;	
	private PageElement stocksAndStocksInProcessTextField;	
	//	private PageElement stocksHeldInTrustTextField;	
	private PageElement totalSumInsuredTextField;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	private PageElement AddButtonOfNextWindow;
	private PageElement totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField; 	 
	private PageElement totalSumInsuredExcludingBuildingPlinthAndFoundationTextField;
	//SA
	private PageElement serialNumberSaTextField;
	private PageElement addressOfTheLocationSaTextField;	
	private PageElement districtSaTextField;	
	private PageElement pincodeSaTextField;	
	private PageElement siForBuildingsSaTextField;	
	private PageElement siForPlantAndMachinerySaTextField;	
	private PageElement siForFurnitureFixturesFittingsAndOtherContentsSaTextField;	
	private PageElement siForStocksSaTextField;	
	private PageElement siForStocksInProcessSaTextField;	
	private PageElement totalSiPdSaTextField;	
	private PageElement siForBiSaTextField;
	//SF
	private PageElement productClassificationDropDown;	
	private PageElement typeOfIndustryOccupationDropDown;	
	private PageElement sectionCodeFireDropDown;	
	private PageElement riskOptedForDropDown;	
	private PageElement riskDescriptionSection3DropDown;	
	private PageElement whetherStfiPerilDeletedAtInceptionDropDown;	
	private PageElement whetherRsmdPerilDeletedAtInceptionDropDown;	
	private PageElement whetherEscalationClauseOptedDropDown;	
	private PageElement escalationTextField;	
	private PageElement technicalDiscountTextField;	
	private PageElement discretionaryDiscountSFTextField;	
	private PageElement excessOptedByTheInsuredSFDropDown;	
	private PageElement higherExcessForAogTextField;	
	private PageElement higherExcessForNonAogTextField;	
	private PageElement whetherBuildingIsSituatedInSezDropDown;	
	private PageElement whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSFDropDown;	
	private PageElement earthquakeStateDropDown;
	private PageElement earthquakeDistrictZoneDropDown;	
	private PageElement whetherCompoundWallIsDesiredForInsuranceCoverDropDown;	
	private PageElement sumInsuredOnCompoundWallTextField;	
	private PageElement whetherCngInstallationsInPetrolDiesalKisoksIsThereDropDown;	
	private PageElement stfiRevRateTextField;
	private PageElement addButton;

	private PageElement nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyTextArea;
	private PageElement nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShockTextArea;
	private PageElement nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustionTextArea;
	private PageElement sumInsuredTextField;
	private PageElement premiumTextField;
	private PageElement earthquakeDistrictZonefindButton;
	//AR-Rasika
	private PageElement netProfitARTextField;
	private PageElement standingChargesARTextField;
	private PageElement totalSumInsuredAtTheLocationMDAndBIARTextField;
	//LP
	private PageElement siAtThePremisesOnContentsOfProcessBlocksTextField;
	private PageElement isthePropertySurroundedbyOtherpropertyDropdown;
	private PageElement isthePropertyProtectedWithCompoundWallFenseDropDown;
	private PageElement isitmannedbyExclusiveSecurityPersonnelOftheInsuredoragencyDropDown;
	private PageElement ihetherSecurityGuardsAreArmedDropDown;
	private PageElement arethereGovernmentsecurityEstablishmentNearbyDropDown;
	//SA-sonali
	private PageElement saveButton;
	//Chintan
	private PageElement nCBDiscountPercentageTextField;
	private PageElement lCBDiscountPercentageTextField;
	private PageElement	subjectivitiesTextArea;
	private PageElement exclusionsTextArea;
	private PageElement deductibleWordingForPropertyDamageTextArea;
		
    private PageElement minimumDeductibleAmountPropertyDamageTextField;	
	private PageElement deductibleWordingForMachineryBreakdownTextArea;
	private PageElement minimumDeductibleAmountMachineryBreakdownTextField;	
	private PageElement	deductibleWordingForBusinessInterruptionTextArea;	
	private PageElement	minimumTimeDeductibleDaysForBusinessTextField;	
	private PageElement	deductibleWordingForBusinessTextArea;

	private PageElement	minimumTimeDeductibleDaysForBusinessInterruptionTextField;	
	private PageElement	insuredInterestWordingForPropertyDamageTextArea;
	private PageElement insuredInterestWordingForMachineryBreakdownTextArea;
	private PageElement	insuredInterestWordingForBusinessInterruptionTextArea;
	//private PageElement	isPropertySurroundedByOtherDropDown;
	private PageElement	voluntaryDeductiblesChosenDropDown;
	private PageElement	riskCodeDropDown1;

	

	public PolicyInsuredIntrestAttributeFire(WebDriver driver, String pageName) {
		super(driver,pageName);
		//******************AR(cHINTAN)1ST PAGE*******************************
		underWritingClassificationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Underwriting classification')]/following::select"),"Underwriting classification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfIndustryOccupationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Industry / occupation')]/following::select"),"Type of Industry / occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherEscalationClauseoptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Escalation Clause opted')]/following::select"),"Whether Escalation Clause opted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		escalationPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Escalation(%)')]/following::input"),"Escalation(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalDiscountPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount(%)')]/following::input"),"Technical Discount(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryDiscountPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount (%)')]/following::input"), "Discretionary Discount (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		excessoptedByTheInsuredForMaterialDamagesectionOfIARpolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess opted by the insured for Material Damage section of IAR policy')]/following::select"),"Excess opted by the insured for Material Damage section of IAR policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		voluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductibles chosen for Material Damage section of IAR policy')]/following::select"),"Voluntary deductibles chosen for Material Damage section of IAR policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		applicableVoluntaryDeductibleDiscountForMaterialDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable Voluntary Deductible Discount for Material Damage')]/following::input"),"Applicable Voluntary Deductible Discount for Material Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		applicableVoluntaryDeductibleDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable voluntary discount (%)')]/following::input"),"Applicable Voluntary Deductible Discount for Material Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		howManyYearsTheProposedIARPolicyIncludingExpiringPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'How many years the proposed IAR policy including expiring policy is in place')]/following::select"), "How many years the proposed IAR policy including expiring policy is in place", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		incurredClaimRatioDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim Ratio (Paid and O/s as against the net premium) for IAR policy (considering IAR as a whole) and including the expiring policy')]/following::select"), "Incurred Claim Ratio (Paid and O/s as against the net premium) for IAR policy (considering IAR as a whole) and including the expiring policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		applicableIARAsaWholeDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable IAR as a whole discount')]/following::input"), "Applicable IAR as a whole discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		whetherCompoundWallIsDesiredForInsurancecoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether compound wall is desired for insurance cover')]/following::select"), "Whether compound wall is desired for insurance cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		sumInsuredonCompoundWallTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured on Compound Wall')]/following::input"), "Sum Insured on Compound Wall", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		netProfitTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Profit')]/following::input"), "Net Profit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		standingChargesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Standing charges')]/following::input"), "Standing charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		grossProfittoBeInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Gross Profit to be insured')]/following::input"), "Gross Profit to be insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		anyotherItemInsuredSeparatelyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Any other item insured separately')]/following::input"), "Any other item insured separately", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		indemnityPeriodInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period in months')]/following::input"), "Indemnity Period in months", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		sTFITextField=new PageElement(By.xpath("//td//div[contains(text(),'STFI(Rev rate)')]/following::input"), "STFI(Rev rate)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//open button
		riskCodeDropDown=new PageElement(By.name("Data_228695623072010_0"),"Risk Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		serialNoTextField=new PageElement(By.name("slNo0"),"Serial no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		locationNameTextField=new PageElement(By.name("Data_13867814092004_0"),"Location Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationAddressTextField=new PageElement(By.name("Data_210702827092009_0"),"Location Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		sectionCodeDropDown=new PageElement(By.name("Data_228695223072010_0"),"Section Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 	
		riskCodeDropDown1=new PageElement(By.xpath("//td//div[contains(text(),'Risk Code (Section 3)')]/following::select"),"Risk Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		rateCodeDropDown=new PageElement(By.name("Data_228719823072010_0"),"Rate Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buildingPlinthAndFoundationsTextField=new PageElement(By.name("Data_228722423072010_0"),"BuildingPlinth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		plantMachineryAndAccessoriesTextField	=new PageElement(By.name("Data_228722523072010_0"),"PlantMachinary", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		furnitureFittingsFixturesAndOtherContentsTextField =new PageElement(By.name("Data_228722623072010_0"),"FurnitureFitting", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		pipingTextField=new PageElement(By.name("Data_228722723072010_0"),"Piping", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cablingTextField=new PageElement(By.name("Data_228722823072010_0"),"Cabling", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stocksAndStocksInprocessTextField	=new PageElement(By.name("Data_228722923072010_0"),"Stock And Stocks In Prrocess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stocksHeldInTrustTextField=new PageElement(By.name("Data_228723023072010_0"),"Stocks Held In Trust", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		materialStoredInTheOpenGasHoldersTankFarmsTextField=new PageElement(By.name("Data_228685823072010_0"),"Material Stored In the Open Holder tank Frams", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 	
		totalSumInsuredAtTheLocationTextField=new PageElement(By.name("Data_228685923072010_0"),"Total Sum Insured At Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOfTheContentsOfProcessBlockTextField=new PageElement(By.name("Data_228686023072010_0"),"Sum Insured Of The Contents Of Process Block", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeZoneDropDown=new PageElement(By.name("Data_7774429092001_0"),"Earthquake Zone", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pinCodeDropDown=new PageElement(By.name("Data_232317627082010_0"),"Pin Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfOccupancyDropDown=new PageElement(By.name("Data_228686523072010_0"),"Nature Of Occupacy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hazardousGoodsForShops305DropDown=new PageElement(By.name("Data_228686823072010_0"),"Hazardous Goods For Shops", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//**********************DF(CHINTAN)1ST PAGE *******************************
		sectionCodeFloaterDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Section Code (Floater)')]/following::select"),"Section Code (Floater)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskDescriptionSection4DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Risk Description (Section 4)')]/following::select"),"Risk Description (Section 4)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskDescriptionGodownsandSilosDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Risk Description(Godowns and Silos)')]/following::select"),"Risk Description(Godowns and Silos)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeStateDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake State')]/following::select"),"Earthquake State", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeDistrictZoneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake District (Zone)')]/following::input"),"Earthquake District (Zone)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		materialClassificationforSpontaneousCombustionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Material Classification for Spontaneous Combustion')]/following::select"),"Material Classification for Spontaneous Combustion", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//**********************FD(CHINTAN)1ST PAGE *******************************
		sectionCodeFDDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Section Code (FD)')]/following::select"),"Section Code (FD)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskDescriptionSection7DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Risk Description (Section 7)')]/following::select"),"Risk Description (Section 7)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		materialStoredInDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Material Stored In')]/following::select"),"Material Stored In", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherGodownIslocatedInBasementDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Godown is located in basement')]/following::select"),"Whether Godown is located in basement", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherGodownLocationCoveredUnderPolicyIssituatedInSEZDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Godown location covered under policy is situated in SEZ')]/following::select"),"Whether Godown location covered under policy is situated in SEZ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		probableMaximumLossPMLTextField=new PageElement(By.xpath("//td//div[contains(text(),'Probable Maximum Loss (PML)')]/following::input"),"Probable Maximum Loss (PML)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//**********************FP(CHINTAN)1ST PAGE *******************************
		riskCoveredTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Risk Covered')]/following::textarea"),"Risk Covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfTheRiskTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Description of the Risk')]/following::textarea"),"Description of the Risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optedCoverdetailsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Opted Cover details')]/following::textarea"),"Opted Cover details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialPerilsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Perils')]/following::textarea"),"Special Perils", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExclusionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Exclusions')]/following::textarea"),"Special Exclusions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subjectToClauseTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Subject to Clause')]/following::textarea"),"Subject to Clause", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessInPercentageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess in (%)')]/following::select"),"Excess in (%)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"),"Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured(Rs)')]/following::input"),"Sum Insured(Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsTariffedPolicyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Other Details-Tariffed Policy')]/following::textarea"),"Other Details-Tariffed Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'')]/following::textarea"),"", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Special Discount Amount')]/following::input"),"Special Discount Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate (%)')]/following::input"),"Premium Rate (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LR
		serialNumberLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Serial Number(LR)')]/following::input"), "Serial Number(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheLocationLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Address of the Location(LR)')]/following::input"), "Address of the Location(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'District(LR)')]/following::input"), "District(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pincodeLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pincode(LR)')]/following::input"), "Pincode(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForBuildingsLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Buildings(LR)')]/following::input"), "SI for Buildings(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForPlantAndMachineryLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Plant and Machinery(LR)')]/following::input"), "SI for Plant and Machinery(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForFurnitureFixturesFittingsAndOtherContentsLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Furniture,Fixtures,Fittings and other contents(LR)')]/following::input"), "SI for Furniture,Fixtures,Fittings and other contents(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForStocksOtherThanDeclarationLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Stocks other than declaration(LR)')]/following::input"), "SI for Stocks other than declaration(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForStocksOnDeclarationLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Stocks on Declaration(LR)')]/following::input"), "SI for Stocks on Declaration(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSiPdLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI PD(LR)')]/following::input"), "Total SI PD(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siDueToFlopLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI due to FLOP(LR)')]/following::input"), "SI due to FLOP(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodForFlopLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period for FLOP(LR)')]/following::input"), "Indemnity Period for FLOP(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siDueToMlopLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI due to MLOP(LR)')]/following::input"), "SI due to MLOP(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodForMlopLrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period for MLOP(LR)')]/following::input"), "Indemnity Period for MLOP(LR)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Risk Description')]/following::TextArea"), "Risk Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PE
		blockDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Block Details')]/following::input"), "Block Details OPen Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfIndustryOccupationPetrochemicalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Industry / occupation (Petrochemical)')]/following::select"), "Type of Industry / occupation (Petrochemical)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheBlockIsPetrochemicalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the block is petrochemical')]/following::select"), "Whether the block is petrochemical", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		baseRatePetrochemicalTextField=new PageElement(By.xpath("//td//div[contains(text(),'Base Rate (Petrochemical)')]/following::input"), "Base Rate (Petrochemical)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount (%)')]/following::input"), "Discretionary Discount (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessOptedByTheInsuredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess opted by the insured')]/following::select"), "Excess opted by the insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheRiskIsSituatedInSezDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the risk is situated in SEZ')]/following::select"), "Whether the risk is situated in SEZ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Plinth and Foundation of building are desired only for Earthquake cover')]/following::select"), "Whether Plinth and Foundation of building are desired only for Earthquake cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		netLoadingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Loading')]/following::input"), "Net Loading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Discount')]/following::input"), "Net Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfNonPetrochemicalBlockDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Non Petrochemical Block')]/following::select"), "Type of Non Petrochemical Block", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//PE Open Button
		//serialNoTextField=new PageElement(By.name("slNo0"), "serialNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		blockNumberAsPerTheInsuredsInstructionsTextField=new PageElement(By.name("Data_228730023072010_0"), "Block Number As Per The Insureds Instructions 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheBlockTextField=new PageElement(By.name("Data_228730123072010_0"), "Name Of The Block ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		buildingSuperStructureTextField=new PageElement(By.name("Data_228730223072010_0"), "Building Super Structure) 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//buildingPlinthAndFoundationsTextField=new PageElement(By.name("Data_228722423072010_0"), "Building Plinth And Foundations) 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	plantMachineryAndAccessoriesTextField=new PageElement(By.name("Data_228722523072010_0"), "Plant, Machinery And Accessories 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//furnitureFittingsFixturesAndOtherContentsTextField=new PageElement(By.name("Data_228722623072010_0"), "Furniture, Fittings, Fixtures And Other Contents 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stocksAndStocksInProcessTextField=new PageElement(By.name("Data_228722923072010_0"), "Stocks And Stocks In Process 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//stocksHeldInTrustTextField=new PageElement(By.name("Data_228722923072010_0"), "Stocks Held In Trust 	", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.name("Data_3456809072001_0"), "Total Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField=new PageElement(By.name("Data_227734723072010_0"), "Total Sum Insured including Building plinth and foundations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredExcludingBuildingPlinthAndFoundationTextField=new PageElement(By.name("Data_227734823072010_0"), "Total Sum Insured excluding Building Plinth and Foundation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		AddButtonOfNextWindow= new PageElement(By.name("btnAdd"), "Add Button New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//SA
		serialNumberSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'Serial Number(SA)')]/following::input"), "Serial Number(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheLocationSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'Address of the Location(SA)')]/following::input"), "Address of the Location(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'District(SA)')]/following::input"), "District(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pincodeSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pincode(SA)')]/following::input"), "Pincode(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForBuildingsSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Buildings(SA)')]/following::input"), "SI for Buildings(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForPlantAndMachinerySaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Plant and Machinery(SA)')]/following::input"), "SI for Plant and Machinery(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForFurnitureFixturesFittingsAndOtherContentsSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Furniture,Fixtures,Fittings and other contents(SA)')]/following::input"), "SI for Furniture,Fixtures,Fittings and other contents(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForStocksSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Stocks(SA)')]/following::input"), "SI for Stocks(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForStocksInProcessSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Stocks in Process(SA)')]/following::input"), "SI for Stocks in Process(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSiPdSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI PD(SA)')]/following::input"), "Total SI PD(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siForBiSaTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for BI(SA)')]/following::input"), "SI for BI(SA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SF
		productClassificationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Product Classification')]/following::input"), "Product Classification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfIndustryOccupationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Industry / occupation')]/following::select"), "Type of Industry / occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionCodeFireDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Section Code (Fire)')]/following::select"), "Section Code (Fire)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskOptedForDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Risk opted for')]/following::select"), "Risk opted for", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskDescriptionSection3DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Risk Description (Section 3)')]/following::select"), "Risk Description (Section 3)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherStfiPerilDeletedAtInceptionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether STFI peril deleted at inception')]/following::select"), "Whether STFI peril deleted at inception", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherRsmdPerilDeletedAtInceptionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether RSMD Peril deleted at inception')]/following::select"), "Whether RSMD Peril deleted at inception", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherEscalationClauseOptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Escalation Clause opted')]/following::select"), "Whether Escalation Clause opted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessOptedByTheInsuredSFDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess opted by the insured')]/following::select"), "Excess opted by the insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherBuildingIsSituatedInSezDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether building is situated in SEZ')]/following::select"), "Whether building is situated in SEZ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSFDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Plinth and Foundation of building are desired only for Earthquake cover')]/following::select"), "Whether Plinth and Foundation of building are desired only for Earthquake cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeStateDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake State')]/following::select"), "Earthquake State", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeDistrictZoneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake District (Zone)')/following::select"), "Earthquake District (Zone)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherCompoundWallIsDesiredForInsuranceCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether compound wall is desired for insurance cover')]/following::select"), "Whether compound wall is desired for insurance cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherCngInstallationsInPetrolDiesalKisoksIsThereDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether CNG installations in petrol diesal kisoks is there')]/following::select"), "Whether CNG installations in petrol diesal kisoks is there", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		escalationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Escalation(%)')]/following::input"), "Escalation(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount(%)')]/following::input"), "Technical Discount(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryDiscountSFTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount (%)')]/following::input"), "Discretionary Discount (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		higherExcessForAogTextField=new PageElement(By.xpath("//td//div[contains(text(),'Higher excess for AOG')]/following::input"), "Higher excess for AOG", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		higherExcessForNonAogTextField=new PageElement(By.xpath("//td//div[contains(text(),'Higher excess for Non AOG')]/following::input"), "Higher excess for Non AOG", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOnCompoundWallTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured on Compound Wall')]/following::input"), "Sum Insured on Compound Wall", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stfiRevRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'STFI(Rev rate)')]/following::input"), "STFI(Rev rate)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name the location attracting highest premium rate (out of various locations named under the policy)')]/following::textarea"), "Name the location attracting highest premium rate (out of various locations named under the policy)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShockTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name the location attracting highest premium rate (out of various locations named under the policy) for Earthquake Fire & shock')]/following::textarea"), "Name the location attracting highest premium rate (out of various locations named under the policy) for Earthquake Fire & shock", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name the location attracting highest premium rate (out of various locations named under the policy) for Spontaneous Combustion')]/following::textarea"), "Name the location attracting highest premium rate (out of various locations named under the policy) for Spontaneous Combustion", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium')]/following::input"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeDistrictZonefindButton= new PageElement(By.xpath("//td//div[contains(text(),'Earthquake District (Zone)')]/following::input/following::a[@name='firstFocus']"), "Earthquake District (Zone) Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//AR-Rasika
		locationDetailsOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Location Details')]/following::input"), "Location Details Open Button Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		netProfitARTextField=new PageElement(By.name("Data_49791506062005_0"), "Net Profit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standingChargesARTextField=new PageElement(By.name("Data_49791606062005_0"), "Standing charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredAtTheLocationMDAndBIARTextField=new PageElement(By.name("Data_381155907072015_0"), "Total Sum Insured at the Location MD and BI Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LP nilesh
		siAtThePremisesOnContentsOfProcessBlocksTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured at the premises on contents of process blocks')]/following::input"), "Sum Insured at the premises on contents of process blocks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SA-Sonali
		saveButton=new PageElement(By.name("btnSave"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		isthePropertySurroundedbyOtherpropertyDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Is the Property Surrounded by Other property')]/following::select"), "Is the Property Surrounded by Other property", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isthePropertyProtectedWithCompoundWallFenseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the property protected with compound wall / fences')]/following::select"), "Is the property protected with compound wall / fences", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isitmannedbyExclusiveSecurityPersonnelOftheInsuredoragencyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is it manned by exclusive security personnel of the insured or agency')]/following::select"), "Is it manned by exclusive security personnel of the insured or agency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ihetherSecurityGuardsAreArmedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether security guards are armed')]/following::select"), "Whether security guards are armed", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		arethereGovernmentsecurityEstablishmentNearbyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Are there Government security establishment nearby')]/following::select"), "Are there Government security establishment nearby", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
		//Chintan
	nCBDiscountPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'NCB Discount (%)')]/following::input"), "NCB Discount (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	lCBDiscountPercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'LCB Discount (%)')]/following::input"), "LCB Discount (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	subjectivitiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Subjectivities')]/following::textarea"), "Subjectivities", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	exclusionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Exclusions')]/following::textarea"),"Exclusions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	deductibleWordingForPropertyDamageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Property Damage')]/following::textarea"), "Deductible Wording for Property Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	minimumDeductibleAmountPropertyDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Property Damage')]/following::input"), "Minimum Deductible Amount Property Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	deductibleWordingForMachineryBreakdownTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Machinery Breakdown')]/following::textarea"), "Deductible Wording for Machinery Breakdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	minimumDeductibleAmountMachineryBreakdownTextField=new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Machinery Breakdown')]/following::input"), "Minimum Deductible Amount Machinery Breakdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	deductibleWordingForBusinessInterruptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Business Interruption MLOP')]/following::textarea"), "Deductible Wording for Business Interruption MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	minimumTimeDeductibleDaysForBusinessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Minimum Time  Deductible (Days) for Business Interruption MLOP')]/following::input"), "Minimum Time Deductible (Days) for Business Interruption FLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	deductibleWordingForBusinessTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Business Interruption FLOP')]/following::textarea"), "Deductible Wording for Business Interruption MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	minimumTimeDeductibleDaysForBusinessInterruptionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Minimum Time  Deductible (Days) for Business Interruption FLOP')]/following::input"), "Minimum Time Deductible (Days) for Business Interruption MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	insuredInterestWordingForPropertyDamageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Property Damage')]/following::textarea"), "", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	insuredInterestWordingForMachineryBreakdownTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Machinery Breakdown')]/following::textarea"), "", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	insuredInterestWordingForBusinessInterruptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Business Interruption')]/following::textarea"), "", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	voluntaryDeductiblesChosenDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductibles chosen')]/following::select"), "Voluntary deductibles chosen", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	MaximumPerLocationLimitSI  = new PageElement(By.xpath("//td//div[contains(text(),'Maximum Per Location Limit SI')]/following::input"), "Maximum Per Location Limit SI", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillPolicyInsuredIntrestAttributeFire(PolInsIntAttrFireEntity polInsIntAttrFireEntity, CustomAssert assertReference) throws InterruptedException {

		//******************AR(CHINTAN)1ST PAGE*******************************
		if(polInsIntAttrFireEntity.getAction().equalsIgnoreCase("add") || polInsIntAttrFireEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationDetails")) {
				fillPolicyInsuredIntrestAttributeLocationDetails(polInsIntAttrFireEntity);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfIndustryOccupation")) {
				selectValueFromList(typeOfIndustryOccupationDropDown, polInsIntAttrFireEntity.getStringValueForField("TypeOfIndustryOccupation"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherEscalationClauseopted")) {
				selectValueFromList(whetherEscalationClauseoptedDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherEscalationClauseopted"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEscalationPercentage")) {
				clearAndSendKeys(escalationPercentageTextField, polInsIntAttrFireEntity.getStringValueForField("EscalationPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTechnicalDiscountPercentage")) {
				clearAndSendKeys(technicalDiscountPercentageTextField, polInsIntAttrFireEntity.getStringValueForField("TechnicalDiscountPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercentage")) {
				clearAndSendKeys(discretionaryDiscountPercentageTextField, polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscountPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessoptedByTheInsuredForMaterialDamagesectionOfIARpolicy")) {
				selectValueFromList(excessoptedByTheInsuredForMaterialDamagesectionOfIARpolicyDropDown, polInsIntAttrFireEntity.getStringValueForField("ExcessoptedByTheInsuredForMaterialDamagesectionOfIARpolicy"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicy")) {
				selectValueFromList(voluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicyDropDown, polInsIntAttrFireEntity.getStringValueForField("VoluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicy"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscountForMaterialDamage")) {
				clearAndSendKeys(applicableVoluntaryDeductibleDiscountForMaterialDamageTextField, polInsIntAttrFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscountForMaterialDamage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHowManyYearsTheProposedIARPolicyIncludingExpiringPolicy")) {
				selectValueFromList(howManyYearsTheProposedIARPolicyIncludingExpiringPolicyDropDown, polInsIntAttrFireEntity.getStringValueForField("HowManyYearsTheProposedIARPolicyIncludingExpiringPolicy"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				selectValueFromList(incurredClaimRatioDropDown, polInsIntAttrFireEntity.getStringValueForField("IncurredClaimRatio"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableIARAsaWholeDiscount")) {
				clearAndSendKeys(applicableIARAsaWholeDiscountTextField, polInsIntAttrFireEntity.getStringValueForField("ApplicableIARAsaWholeDiscount"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherCompoundWallIsDesiredForInsurancecover")) {
				selectValueFromList(whetherCompoundWallIsDesiredForInsurancecoverDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherCompoundWallIsDesiredForInsurancecover"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredonCompoundWall")) {
				clearAndSendKeys(sumInsuredonCompoundWallTextField, polInsIntAttrFireEntity.getStringValueForField("SumInsuredonCompoundWall"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetProfit")) {
				clearAndSendKeys(netProfitTextField, polInsIntAttrFireEntity.getStringValueForField("NetProfit"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStandingCharges")) {
				clearAndSendKeys(standingChargesTextField, polInsIntAttrFireEntity.getStringValueForField("StandingCharges"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigGrossProfittoBeInsured")) {
				clearAndSendKeys(grossProfittoBeInsuredTextField, polInsIntAttrFireEntity.getStringValueForField("GrossProfittoBeInsured"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAnyotherItemInsuredSeparately")) {
				clearAndSendKeys(anyotherItemInsuredSeparatelyTextField, polInsIntAttrFireEntity.getStringValueForField("AnyotherItemInsuredSeparately"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodInMonths"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSTFI")) {
				clearAndSendKeys(sTFITextField, polInsIntAttrFireEntity.getStringValueForField("STFI"));
			}
			//**********************DF(CHINTAN)1ST PAGE *******************************
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFloater")) {
				selectValueFromList(sectionCodeFloaterDropDown, polInsIntAttrFireEntity.getStringValueForField("SectionCodeFloater"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection4")) {
				selectValueFromList(riskDescriptionSection4DropDown, polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection4"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionGodownsandSilos")) {
				selectValueFromList(riskDescriptionGodownsandSilosDropDown, polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionGodownsandSilos"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeState")) {
				selectValueFromList(earthquakeStateDropDown, polInsIntAttrFireEntity.getStringValueForField("EarthquakeState"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")) {
				fillearthquakeDistrictZone( polInsIntAttrFireEntity);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialClassificationforSpontaneousCombustion")) {
				selectValueFromList(materialClassificationforSpontaneousCombustionDropDown, polInsIntAttrFireEntity.getStringValueForField("MaterialClassificationforSpontaneousCombustion"));
			}	
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFD")) {
				selectValueFromList(sectionCodeFDDropDown, polInsIntAttrFireEntity.getStringValueForField("SectionCodeFD"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection7D")) {
				selectValueFromList(riskDescriptionSection7DropDown, polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection7D"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialStoredIn")) {
				selectValueFromList(materialStoredInDropDown, polInsIntAttrFireEntity.getStringValueForField("MaterialStoredIn"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherGodownIslocatedInBasement")) {
				selectValueFromList(whetherGodownIslocatedInBasementDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherGodownIslocatedInBasement"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherGodownLocationCoveredUnderPolicyIssituatedInSEZ")) {
				selectValueFromList(whetherGodownLocationCoveredUnderPolicyIssituatedInSEZDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherGodownLocationCoveredUnderPolicyIssituatedInSEZ"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				clearAndSendKeys(probableMaximumLossPMLTextField, polInsIntAttrFireEntity.getStringValueForField("ProbableMaximumLossPML"));
			}
			//***********************FP(CHINTAN) 1ST PAGE*********************
  			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCovered")) {
				clearAndSendKeys(riskCoveredTextArea, polInsIntAttrFireEntity.getStringValueForField("RiskCovered"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				selectValueFromList(descriptionOfTheRiskTextArea, polInsIntAttrFireEntity.getStringValueForField("DescriptionOfTheRisk"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOptedCoverdetails")) {
				clearAndSendKeys(optedCoverdetailsTextArea, polInsIntAttrFireEntity.getStringValueForField("OptedCoverdetails"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				clearAndSendKeys(specialPerilsTextArea, polInsIntAttrFireEntity.getStringValueForField("SpecialPerils"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				clearAndSendKeys(specialExclusionsTextArea, polInsIntAttrFireEntity.getStringValueForField("SpecialExclusions"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				clearAndSendKeys(subjectToClauseTextArea, polInsIntAttrFireEntity.getStringValueForField("SubjectToClause"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessInPercentage")) {
				selectValueFromList(excessInPercentageDropDown, polInsIntAttrFireEntity.getStringValueForField("ExcessInPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntAttrFireEntity.getStringValueForField("SpecialConditions"));
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredRsTextField")) {
				clearAndSendKeys(sumInsuredRsTextField, polInsIntAttrFireEntity.getStringValueForField("SumInsuredRsTextField"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOtherDetailsTariffedPolicy")) {
				clearAndSendKeys(otherDetailsTariffedPolicyTextArea, polInsIntAttrFireEntity.getStringValueForField("OtherDetailsTariffedPolicy"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOtherDetails")) {
				clearAndSendKeys(otherDetailsTextArea, polInsIntAttrFireEntity.getStringValueForField("OtherDetails"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialDiscountAmount")) {
				clearAndSendKeys(specialDiscountAmountTextField, polInsIntAttrFireEntity.getStringValueForField("SpecialDiscountAmount"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPremiumRatePercentage")) {
				clearAndSendKeys(premiumRatePercentageTextField, polInsIntAttrFireEntity.getStringValueForField("PremiumRatePercentage"));
			}
			//LR
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNumberLr")) {
				clearAndSendKeys(serialNumberLrTextField, polInsIntAttrFireEntity.getStringValueForField("SerialNumberLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddressOfTheLocationLr")) {
				clearAndSendKeys(addressOfTheLocationLrTextField, polInsIntAttrFireEntity.getStringValueForField("AddressOfTheLocationLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDistrictLr")) {
				clearAndSendKeys(districtLrTextField, polInsIntAttrFireEntity.getStringValueForField("DistrictLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPincodeLr")) {
				clearAndSendKeys(pincodeLrTextField, polInsIntAttrFireEntity.getStringValueForField("PincodeLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBuildingsLr")) {
				clearAndSendKeys(siForBuildingsLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiForBuildingsLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForPlantAndMachineryLr")) {
				clearAndSendKeys(siForPlantAndMachineryLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiForPlantAndMachineryLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForFurnitureFixturesFittingsAndOtherContentsLr")) {
				clearAndSendKeys(siForFurnitureFixturesFittingsAndOtherContentsLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiForFurnitureFixturesFittingsAndOtherContentsLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksOtherThanDeclarationLr")) {
				clearAndSendKeys(siForStocksOtherThanDeclarationLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiForStocksOtherThanDeclarationLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksOnDeclarationLr")) {
				clearAndSendKeys(siForStocksOnDeclarationLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiForStocksOnDeclarationLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSiPdLr")) {
				clearAndSendKeys(totalSiPdLrTextField, polInsIntAttrFireEntity.getStringValueForField("TotalSiPdLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiDueToFlopLr")) {
				clearAndSendKeys(siDueToFlopLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiDueToFlopLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForFlopLr")) {
				clearAndSendKeys(indemnityPeriodForFlopLrTextField, polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodForFlopLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiDueToMlopLr")) {
				clearAndSendKeys(siDueToMlopLrTextField, polInsIntAttrFireEntity.getStringValueForField("SiDueToMlopLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForMlopLr")) {
				clearAndSendKeys(indemnityPeriodForMlopLrTextField, polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodForMlopLr"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescription")) {
				clearAndSendKeys(riskDescriptionTextArea, polInsIntAttrFireEntity.getStringValueForField("RiskDescription"));
			}
		
			//PE OpenButton
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTransitTypedetailsForOP")) {
				fillBlockDetailsOpenButton(polInsIntAttrFireEntity);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfIndustryOccupationPetrochemical")) {
				selectValueFromList(typeOfIndustryOccupationPetrochemicalDropDown, polInsIntAttrFireEntity.getStringValueForField("TypeOfIndustryOccupationPetrochemical"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherTheBlockIsPetrochemical")) {
				selectValueFromList(whetherTheBlockIsPetrochemicalDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherTheBlockIsPetrochemical"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsured")) {
				selectValueFromList(excessOptedByTheInsuredDropDown, polInsIntAttrFireEntity.getStringValueForField("ExcessOptedByTheInsured"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSez")) {
				selectValueFromList(whetherTheRiskIsSituatedInSezDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSez"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfNonPetrochemicalBlock")) {
				selectValueFromList(typeOfNonPetrochemicalBlockDropDown, polInsIntAttrFireEntity.getStringValueForField("TypeOfNonPetrochemicalBlock"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCover")) {
				selectValueFromList(whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCover"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBaseRatePetrochemical")) {
				clearAndSendKeys(baseRatePetrochemicalTextField, polInsIntAttrFireEntity.getStringValueForField("BaseRatePetrochemical"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscount")) {
				clearAndSendKeys(discretionaryDiscountTextField, polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscount"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetLoading")) {
				clearAndSendKeys(netLoadingTextField, polInsIntAttrFireEntity.getStringValueForField("NetLoading"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetDiscount")) {
				clearAndSendKeys(netDiscountTextField, polInsIntAttrFireEntity.getStringValueForField("NetDiscount"));
			}
			
			//SA
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNumberSa")) {
				clearAndSendKeys(serialNumberSaTextField, polInsIntAttrFireEntity.getStringValueForField("SerialNumberSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddressOfTheLocationSa")) {
				clearAndSendKeys(addressOfTheLocationSaTextField, polInsIntAttrFireEntity.getStringValueForField("AddressOfTheLocationSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDistrictSa")) {
				clearAndSendKeys(districtSaTextField, polInsIntAttrFireEntity.getStringValueForField("DistrictSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPincodeSa")) {
				clearAndSendKeys(pincodeSaTextField, polInsIntAttrFireEntity.getStringValueForField("PincodeSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBuildingsSa")) {
				clearAndSendKeys(siForBuildingsSaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForBuildingsSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForPlantAndMachinerySa")) {
				clearAndSendKeys(siForPlantAndMachinerySaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForPlantAndMachinerySa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForFurnitureFixturesFittingsAndOtherContentsSa")) {
				clearAndSendKeys(siForFurnitureFixturesFittingsAndOtherContentsSaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForFurnitureFixturesFittingsAndOtherContentsSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksSa")) {
				clearAndSendKeys(siForStocksSaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForStocksSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksInProcessSa")) {
				clearAndSendKeys(siForStocksInProcessSaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForStocksInProcessSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSiPdSa")) {
				clearAndSendKeys(totalSiPdSaTextField, polInsIntAttrFireEntity.getStringValueForField("TotalSiPdSa"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBiSa")) {
				clearAndSendKeys(siForBiSaTextField, polInsIntAttrFireEntity.getStringValueForField("SiForBiSa"));
			}
			//SF
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigProductClassification")) {
				selectValueFromList(productClassificationDropDown, polInsIntAttrFireEntity.getStringValueForField("ProductClassification"));
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFire")) {
				selectValueFromList(sectionCodeFireDropDown, polInsIntAttrFireEntity.getStringValueForField("SectionCodeFire"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskOptedFor")) {
				selectValueFromList(riskOptedForDropDown, polInsIntAttrFireEntity.getStringValueForField("RiskOptedFor"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection3")) {
				selectValueFromList(riskDescriptionSection3DropDown, polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection3"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherStfiPerilDeletedAtInception")) {
				selectValueFromList(whetherStfiPerilDeletedAtInceptionDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherStfiPerilDeletedAtInception"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherRsmdPerilDeletedAtInception")) {
				selectValueFromList(whetherRsmdPerilDeletedAtInceptionDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherRsmdPerilDeletedAtInception"));
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsuredSFD")) {
				selectValueFromList(excessOptedByTheInsuredSFDropDown, polInsIntAttrFireEntity.getStringValueForField("ExcessOptedByTheInsuredSFD"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherBuildingIsSituatedInSez")) {
				selectValueFromList(whetherBuildingIsSituatedInSezDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherBuildingIsSituatedInSez"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSF")) {
				selectValueFromList(whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSFDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSF"));
			}
			/*if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZoneTwo")) {
				selectValueFromList(earthquakeDistrictZoneDropDown, polInsIntAttrFireEntity.getStringValueForField("EarthquakeDistrictZoneTwo"));
			}
			 */
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherCngInstallationsInPetrolDiesalKisoksIsThere")) {
				selectValueFromList(whetherCngInstallationsInPetrolDiesalKisoksIsThereDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherCngInstallationsInPetrolDiesalKisoksIsThere"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEscalation")) {
				clearAndSendKeys(escalationTextField, polInsIntAttrFireEntity.getStringValueForField("Escalation"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				clearAndSendKeys(technicalDiscountTextField, polInsIntAttrFireEntity.getStringValueForField("TechnicalDiscount"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStfiRevRate")) {
				clearAndSendKeys(stfiRevRateTextField, polInsIntAttrFireEntity.getStringValueForField("StfiRevRate"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscountSF")) {
				clearAndSendKeys(discretionaryDiscountSFTextField, polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscountSF"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHigherExcessForAog")) {
				clearAndSendKeys(higherExcessForAogTextField, polInsIntAttrFireEntity.getStringValueForField("HigherExcessForAog"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHigherExcessForNonAog")) {
				clearAndSendKeys(higherExcessForNonAogTextField, polInsIntAttrFireEntity.getStringValueForField("HigherExcessForNonAog"));
			}
			//SF Dharmendra
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZoneTwo")) {
				fillearthquakeZone( polInsIntAttrFireEntity);
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicy")) {
				clearAndSendKeys(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyTextArea, polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicy"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShock")) {
				clearAndSendKeys(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShockTextArea, polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShock"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustion")) {
				clearAndSendKeys(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustionTextArea, polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustion"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntAttrFireEntity.getStringValueForField("SumInsured"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("Configpremium")) {
				clearAndSendKeys(premiumTextField, polInsIntAttrFireEntity.getStringValueForField("premium"));
			}
			//LP nilesh
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiAtThePremisesOnContentsOfProcessBlocks")) {
				clearAndSendKeys(siAtThePremisesOnContentsOfProcessBlocksTextField, polInsIntAttrFireEntity.getStringValueForField("SiAtThePremisesOnContentsOfProcessBlocks"));
			}
			//SA-Sonali
			
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsthePropertySurroundedbyOtherproperty")) {
				selectValueFromList(isthePropertySurroundedbyOtherpropertyDropdown, polInsIntAttrFireEntity.getStringValueForField("IsthePropertySurroundedbyOtherproperty"));

			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsthePropertyProtectedWithCompoundWallFense")) {
				selectValueFromList(isthePropertyProtectedWithCompoundWallFenseDropDown, polInsIntAttrFireEntity.getStringValueForField("IsthePropertyProtectedWithCompoundWallFense"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsitmannedbyExclusiveSecurityPersonnelOftheInsuredoragency")) {
				selectValueFromList(isitmannedbyExclusiveSecurityPersonnelOftheInsuredoragencyDropDown, polInsIntAttrFireEntity.getStringValueForField("IsitmannedbyExclusiveSecurityPersonnelOftheInsuredoragency"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherSecurityGuardsAreArmed")) {
				selectValueFromList(ihetherSecurityGuardsAreArmedDropDown, polInsIntAttrFireEntity.getStringValueForField("WhetherSecurityGuardsAreArmed"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigArethereGovernmentsecurityEstablishmentNearby")) {
				selectValueFromList(arethereGovernmentsecurityEstablishmentNearbyDropDown, polInsIntAttrFireEntity.getStringValueForField("ArethereGovernmentsecurityEstablishmentNearby"));
			}
			//Chintan
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNCBDiscountPercentage")) {
				clearAndSendKeys(nCBDiscountPercentageTextField, polInsIntAttrFireEntity.getStringValueForField("NCBDiscountPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLCBDiscountPercentage")) {
				clearAndSendKeys(lCBDiscountPercentageTextField, polInsIntAttrFireEntity.getStringValueForField("LCBDiscountPercentage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSubjectivities")) {
				clearAndSendKeys(subjectivitiesTextArea, polInsIntAttrFireEntity.getStringValueForField("Subjectivities"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExclusions")) {
				clearAndSendKeys(exclusionsTextArea, polInsIntAttrFireEntity.getStringValueForField("Exclusions"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForPropertyDamage")) {
				clearAndSendKeys(deductibleWordingForPropertyDamageTextArea, polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForPropertyDamage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountPropertyDamage")) {
				clearAndSendKeys(minimumDeductibleAmountPropertyDamageTextField, polInsIntAttrFireEntity.getStringValueForField("MinimumDeductibleAmountPropertyDamage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForMachineryBreakdown")) {
				clearAndSendKeys(deductibleWordingForMachineryBreakdownTextArea, polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForMachineryBreakdown"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountMachineryBreakdown")) {
				clearAndSendKeys(minimumDeductibleAmountMachineryBreakdownTextField, polInsIntAttrFireEntity.getStringValueForField("MinimumDeductibleAmountMachineryBreakdown"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForBusinessInterruption")) {
				clearAndSendKeys(deductibleWordingForBusinessInterruptionTextArea, polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForBusinessInterruption"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumTimeDeductibleDaysForBusiness")) {
				clearAndSendKeys(minimumTimeDeductibleDaysForBusinessTextField, polInsIntAttrFireEntity.getStringValueForField("MinimumTimeDeductibleDaysForBusiness"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForBusiness")) {
				clearAndSendKeys(deductibleWordingForBusinessTextArea, polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForBusiness"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumTimeDeductibleDaysForBusinessInterruption")) {
				clearAndSendKeys(minimumTimeDeductibleDaysForBusinessInterruptionTextField, polInsIntAttrFireEntity.getStringValueForField("MinimumTimeDeductibleDaysForBusinessInterruption"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				clearAndSendKeys(insuredInterestWordingForPropertyDamageTextArea, polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForMachineryBreakdown")) {
				clearAndSendKeys(insuredInterestWordingForMachineryBreakdownTextArea, polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForMachineryBreakdown"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				clearAndSendKeys(insuredInterestWordingForBusinessInterruptionTextArea, polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"));
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosen")) {
			   selectValueFromList(voluntaryDeductiblesChosenDropDown, polInsIntAttrFireEntity.getStringValueForField("VoluntaryDeductiblesChosen"));
			}
			//for DF shruti
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscount")) {
				clearAndSendKeys(applicableVoluntaryDeductibleDiscountTextField, polInsIntAttrFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscount"));
			}
			if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCode")){
				selectValueFromList(riskCodeDropDown1,polInsIntAttrFireEntity.getStringValueForField("RiskCode"));
			}
						
		}
		else if(polInsIntAttrFireEntity.getAction().equalsIgnoreCase("verify")){
			//******************AR(cHINTAN)1ST PAGE*******************************
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationDetails")) {
				verifyPolicyInsuredIntrestAttributeLocationDetails(polInsIntAttrFireEntity,assertReference);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigUnderWritingClassification")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("UnderWritingClassification"), fetchValueFromList(underWritingClassificationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfIndustryOccupation")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TypeOfIndustryOccupation"), fetchValueFromList(typeOfIndustryOccupationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherEscalationClauseopted")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherEscalationClauseopted"), fetchValueFromList(whetherEscalationClauseoptedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEscalationPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("EscalationPercentage"), fetchValueFromTextFields(escalationPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTechnicalDiscountPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TechnicalDiscountPercentage"), fetchValueFromTextFields(technicalDiscountPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscountPercentage"), fetchValueFromTextFields(discretionaryDiscountPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessoptedByTheInsuredForMaterialDamagesectionOfIARpolicy")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ExcessoptedByTheInsuredForMaterialDamagesectionOfIARpolicy"), fetchValueFromList(excessoptedByTheInsuredForMaterialDamagesectionOfIARpolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicy")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("VoluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicy"), fetchValueFromList(voluntaryDeductiblesChosenForMaterialDamagesectionOfIARpolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscountForMaterialDamage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscountForMaterialDamage"), fetchValueFromTextFields(applicableVoluntaryDeductibleDiscountForMaterialDamageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHowManyYearsTheProposedIARPolicyIncludingExpiringPolicy")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("HowManyYearsTheProposedIARPolicyIncludingExpiringPolicy"), fetchValueFromList(howManyYearsTheProposedIARPolicyIncludingExpiringPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromList(incurredClaimRatioDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableIARAsaWholeDiscount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ApplicableIARAsaWholeDiscount"), fetchValueFromTextFields(applicableIARAsaWholeDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherCompoundWallIsDesiredForInsurancecover")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherCompoundWallIsDesiredForInsurancecover"), fetchValueFromList(whetherCompoundWallIsDesiredForInsurancecoverDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredonCompoundWall")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SumInsuredonCompoundWall"), fetchValueFromTextFields(sumInsuredonCompoundWallTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetProfit")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NetProfit"), fetchValueFromTextFields(netProfitTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStandingCharges")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StandingCharges"), fetchValueFromTextFields(standingChargesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigGrossProfittoBeInsured")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("GrossProfittoBeInsured"), fetchValueFromTextFields(grossProfittoBeInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAnyotherItemInsuredSeparately")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("AnyotherItemInsuredSeparately"), fetchValueFromTextFields(anyotherItemInsuredSeparatelyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSTFI")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("STFI"), fetchValueFromTextFields(sTFITextField), AssertionType.WARNING);
			}
			//**********************DF(CHINTAN)1ST PAGE *******************************
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFloater")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SectionCodeFloater"), fetchValueFromList(sectionCodeFloaterDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection4")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection4"), fetchValueFromList(riskDescriptionSection4DropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionGodownsandSilos")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionGodownsandSilos"), fetchValueFromList(riskDescriptionGodownsandSilosDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeState")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("EarthquakeState"), fetchValueFromList(earthquakeStateDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("EarthquakeDistrictZone"), fetchValueFromTextFields(earthquakeDistrictZoneTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialClassificationforSpontaneousCombustion")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MaterialClassificationforSpontaneousCombustion"), fetchValueFromList(materialClassificationforSpontaneousCombustionDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFD")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SectionCodeFD"), fetchValueFromList(sectionCodeFDDropDown), AssertionType.WARNING);
			}
			//**********************FD(CHINTAN)1ST PAGE *******************************
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection7D")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection7D"), fetchValueFromList(riskDescriptionSection7DropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialStoredIn")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MaterialStoredIn"), fetchValueFromList(materialStoredInDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherGodownIslocatedInBasement")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherGodownIslocatedInBasement"), fetchValueFromList(whetherGodownIslocatedInBasementDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherGodownLocationCoveredUnderPolicyIssituatedInSEZ")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherGodownLocationCoveredUnderPolicyIssituatedInSEZ"), fetchValueFromList(whetherGodownLocationCoveredUnderPolicyIssituatedInSEZDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ProbableMaximumLossPML"), fetchValueFromTextFields(probableMaximumLossPMLTextField), AssertionType.WARNING);
			}
			//***********************FP(CHINTAN) 1ST PAGE********************
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DescriptionOfTheRisk"), fetchValueFromTextFields(descriptionOfTheRiskTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOptedCoverdetails")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("OptedCoverdetails"), fetchValueFromTextFields(optedCoverdetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SpecialExclusions"), fetchValueFromTextFields(specialExclusionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SubjectToClause"), fetchValueFromTextFields(subjectToClauseTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessInPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ExcessInPercentage"), fetchValueFromList(excessInPercentageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredRsTextField")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SumInsuredRsTextField"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOtherDetailsTariffedPolicy")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("OtherDetailsTariffedPolicy"), fetchValueFromTextFields(otherDetailsTariffedPolicyTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigOtherDetails")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("OtherDetails"), fetchValueFromTextFields(otherDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSpecialDiscountAmount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SpecialDiscountAmount"), fetchValueFromTextFields(specialDiscountAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPremiumRatePercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PremiumRatePercentage"), fetchValueFromTextFields(premiumRatePercentageTextField), AssertionType.WARNING);
			}
			//LR
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNumberLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SerialNumberLr"), fetchValueFromTextFields(serialNumberLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddressOfTheLocationLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("AddressOfTheLocationLr"), fetchValueFromTextFields(addressOfTheLocationLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDistrictLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DistrictLr"), fetchValueFromTextFields(districtLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPincodeLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PincodeLr"), fetchValueFromTextFields(pincodeLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBuildingsLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForBuildingsLr"), fetchValueFromTextFields(siForBuildingsLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForPlantAndMachineryLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForPlantAndMachineryLr"), fetchValueFromTextFields(siForPlantAndMachineryLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForFurnitureFixturesFittingsAndOtherContentsLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForFurnitureFixturesFittingsAndOtherContentsLr"), fetchValueFromTextFields(siForFurnitureFixturesFittingsAndOtherContentsLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksOtherThanDeclarationLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForStocksOtherThanDeclarationLr"), fetchValueFromTextFields(siForStocksOtherThanDeclarationLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksOnDeclarationLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForStocksOnDeclarationLr"), fetchValueFromTextFields(siForStocksOnDeclarationLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSiPdLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSiPdLr"), fetchValueFromTextFields(totalSiPdLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiDueToFlopLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiDueToFlopLr"), fetchValueFromTextFields(siDueToFlopLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForFlopLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodForFlopLr"), fetchValueFromTextFields(indemnityPeriodForFlopLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiDueToMlopLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiDueToMlopLr"), fetchValueFromTextFields(siDueToMlopLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForMlopLr")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IndemnityPeriodForMlopLr"), fetchValueFromTextFields(indemnityPeriodForMlopLrTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescription")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskDescription"), fetchValueFromTextFields(riskDescriptionTextArea), AssertionType.WARNING);
			}
			//PE
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfIndustryOccupationPetrochemical")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TypeOfIndustryOccupationPetrochemical"), fetchValueFromList(typeOfIndustryOccupationPetrochemicalDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherTheBlockIsPetrochemical")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherTheBlockIsPetrochemical"), fetchValueFromList(whetherTheBlockIsPetrochemicalDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsured")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ExcessOptedByTheInsured"), fetchValueFromList(excessOptedByTheInsuredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSez")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSez"), fetchValueFromList(whetherTheRiskIsSituatedInSezDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTypeOfNonPetrochemicalBlock")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TypeOfNonPetrochemicalBlock"), fetchValueFromList(typeOfNonPetrochemicalBlockDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCover")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCover"), fetchValueFromList(whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBaseRatePetrochemical")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("BaseRatePetrochemical"), fetchValueFromTextFields(baseRatePetrochemicalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscount"), fetchValueFromTextFields(discretionaryDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetLoading")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NetLoading"), fetchValueFromTextFields(netLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetDiscount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NetDiscount"), fetchValueFromTextFields(netDiscountTextField), AssertionType.WARNING);
			}
			//PE OpenButton
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")) {
				verifyBlockDetailsOpenButton(polInsIntAttrFireEntity, assertReference);
			}
			//SA
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNumberSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SerialNumberSa"), fetchValueFromTextFields(serialNumberSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddressOfTheLocationSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("AddressOfTheLocationSa"), fetchValueFromTextFields(addressOfTheLocationSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDistrictSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DistrictSa"), fetchValueFromTextFields(districtSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPincodeSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PincodeSa"), fetchValueFromTextFields(pincodeSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBuildingsSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForBuildingsSa"), fetchValueFromTextFields(siForBuildingsSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForPlantAndMachinerySa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForPlantAndMachinerySa"), fetchValueFromTextFields(siForPlantAndMachinerySaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForFurnitureFixturesFittingsAndOtherContentsSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForFurnitureFixturesFittingsAndOtherContentsSa"), fetchValueFromTextFields(siForFurnitureFixturesFittingsAndOtherContentsSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForStocksSa"), fetchValueFromTextFields(siForStocksSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForStocksInProcessSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForStocksInProcessSa"), fetchValueFromTextFields(siForStocksInProcessSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSiPdSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSiPdSa"), fetchValueFromTextFields(totalSiPdSaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiForBiSa")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiForBiSa"), fetchValueFromTextFields(siForBiSaTextField), AssertionType.WARNING);
			}
			//SF
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigProductClassification")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ProductClassification"), fetchValueFromList(productClassificationDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCodeFire")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SectionCodeFire"), fetchValueFromList(sectionCodeFireDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskOptedFor")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskOptedFor"), fetchValueFromList(riskOptedForDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskDescriptionSection3")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskDescriptionSection3"), fetchValueFromList(riskDescriptionSection3DropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherStfiPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherStfiPerilDeletedAtInception"), fetchValueFromList(whetherStfiPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherRsmdPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherRsmdPerilDeletedAtInception"), fetchValueFromList(whetherRsmdPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsuredSFD")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ExcessOptedByTheInsuredSFD"), fetchValueFromList(excessOptedByTheInsuredSFDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherBuildingIsSituatedInSez")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherBuildingIsSituatedInSez"), fetchValueFromList(whetherBuildingIsSituatedInSezDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSF")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSF"), fetchValueFromList(whetherPlinthAndFoundationOfBuildingAreDesiredOnlyForEarthquakeCoverSFDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZoneTwo")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("EarthquakeDistrictZoneTwo"), fetchValueFromList(earthquakeDistrictZoneDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherCngInstallationsInPetrolDiesalKisoksIsThere")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherCngInstallationsInPetrolDiesalKisoksIsThere"), fetchValueFromList(whetherCngInstallationsInPetrolDiesalKisoksIsThereDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEscalation")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("Escalation"), fetchValueFromTextFields(escalationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TechnicalDiscount"), fetchValueFromTextFields(technicalDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDiscretionaryDiscountSF")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DiscretionaryDiscountSF"), fetchValueFromTextFields(discretionaryDiscountSFTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHigherExcessForAog")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("HigherExcessForAog"), fetchValueFromTextFields(higherExcessForAogTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHigherExcessForNonAog")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("HigherExcessForNonAog"), fetchValueFromTextFields(higherExcessForNonAogTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStfiRevRate")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StfiRevRate"), fetchValueFromTextFields(stfiRevRateTextField), AssertionType.WARNING);
			}

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicy")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicy"), fetchValueFromTextFields(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShock")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShock"), fetchValueFromTextFields(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForEarthquakeFireAndShockTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustion")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustion"), fetchValueFromTextFields(nameTheLocationAttractingHighestPremiumRateOutOfVariousLocationsNamedUnderThePolicyForSpontaneousCombustionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("Configpremium")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSiAtThePremisesOnContentsOfProcessBlocks")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SiAtThePremisesOnContentsOfProcessBlocks"), fetchValueFromTextFields(siAtThePremisesOnContentsOfProcessBlocksTextField), AssertionType.WARNING);
			}
			//SA-sonali
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsthePropertySurroundedbyOtherproperty")) {

				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("isthePropertySurroundedbyOtherpropertyDropdown"), fetchValueFromList(isthePropertySurroundedbyOtherpropertyDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsthePropertyProtectedWithCompoundWallFense")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IsthePropertyProtectedWithCompoundWallFense"), fetchValueFromList(isthePropertyProtectedWithCompoundWallFenseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigIsitmannedbyExclusiveSecurityPersonnelOftheInsuredoragency")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("IsitmannedbyExclusiveSecurityPersonnelOftheInsuredoragency"), fetchValueFromList(isitmannedbyExclusiveSecurityPersonnelOftheInsuredoragencyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigWhetherSecurityGuardsAreArmed")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("WhetherSecurityGuardsAreArmed"), fetchValueFromList(ihetherSecurityGuardsAreArmedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigArethereGovernmentsecurityEstablishmentNearby")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ArethereGovernmentsecurityEstablishmentNearby"), fetchValueFromList(arethereGovernmentsecurityEstablishmentNearbyDropDown), AssertionType.WARNING);
			}
			//Chintan
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNCBDiscountPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NCBDiscountPercentage"), fetchValueFromTextFields(nCBDiscountPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLCBDiscountPercentage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("LCBDiscountPercentage"), fetchValueFromTextFields(lCBDiscountPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSubjectivities")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("Subjectivities"), fetchValueFromTextFields(subjectivitiesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigExclusions")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("Exclusions"), fetchValueFromTextFields(exclusionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForPropertyDamage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForPropertyDamage"), fetchValueFromTextFields(deductibleWordingForPropertyDamageTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountPropertyDamage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MinimumDeductibleAmountPropertyDamage"), fetchValueFromTextFields(minimumDeductibleAmountPropertyDamageTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForMachineryBreakdown")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForMachineryBreakdown"), fetchValueFromTextFields(deductibleWordingForMachineryBreakdownTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountMachineryBreakdown")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MinimumDeductibleAmountMachineryBreakdown"), fetchValueFromTextFields(minimumDeductibleAmountMachineryBreakdownTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForBusinessInterruption")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForBusinessInterruption"), fetchValueFromTextFields(deductibleWordingForBusinessInterruptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumTimeDeductibleDaysForBusinessInterruption")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MinimumTimeDeductibleDaysForBusiness"), fetchValueFromTextFields(minimumTimeDeductibleDaysForBusinessTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeductibleWordingForBusiness")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("DeductibleWordingForBusiness"), fetchValueFromTextFields(deductibleWordingForBusinessTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMinimumTimeDeductibleDaysForBusinessInterruption")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MinimumTimeDeductibleDaysForBusinessInterruption"), fetchValueFromTextFields(minimumTimeDeductibleDaysForBusinessInterruptionTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"), fetchValueFromTextFields(insuredInterestWordingForPropertyDamageTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForMachineryBreakdown")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForMachineryBreakdown"), fetchValueFromTextFields(insuredInterestWordingForMachineryBreakdownTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"), fetchValueFromTextFields(insuredInterestWordingForBusinessInterruptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosen")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("VoluntaryDeductiblesChosen"), fetchValueFromList(voluntaryDeductiblesChosenDropDown), AssertionType.WARNING);
			}
			//for DF shruti
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscount")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscount"), fetchValueFromTextFields(applicableVoluntaryDeductibleDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCode")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskCode"), fetchValueFromList(riskCodeDropDown1), AssertionType.WARNING);
			}
		}
	}
	//******************AR(cHINTAN)1ST PAGE*******************************
	public void clickToOpenButtonForAR(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationDetailsOpenButton")){
			click(locationDetailsOpenButton);
			Thread.sleep(3000);
			switchToWindow("Location Details");
		}
	}
	public void fillPolicyInsuredIntrestAttributeLocationDetails(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		clickToOpenButtonForAR(polInsIntAttrFireEntity);
		Thread.sleep(3000);

		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddButton")){
			click(addButton);
			Thread.sleep(3000);
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,polInsIntAttrFireEntity.getStringValueForField("SerialNo"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationName")){
			clearAndSendKeys(locationNameTextField,polInsIntAttrFireEntity.getStringValueForField("LocationName"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationAddress")){
			clearAndSendKeys(locationAddressTextField,polInsIntAttrFireEntity.getStringValueForField("LocationAddress"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCode")){
			selectValueFromList(sectionCodeDropDown,polInsIntAttrFireEntity.getStringValueForField("SectionCode"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCode")){
			selectValueFromList(riskCodeDropDown,polInsIntAttrFireEntity.getStringValueForField("RiskCode"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigRateCode")){
			selectValueFromList(rateCodeDropDown,polInsIntAttrFireEntity.getStringValueForField("RateCode"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingPlinthAndFoundations")){
			clearAndSendKeys(buildingPlinthAndFoundationsTextField,polInsIntAttrFireEntity.getStringValueForField("BuildingPlinthAndFoundations"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigPlantMachineryAndAccessories")){
			clearAndSendKeys(plantMachineryAndAccessoriesTextField,polInsIntAttrFireEntity.getStringValueForField("PlantMachineryAndAccessories"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigFurnitureFittingsFixturesAndOtherContents")){
			clearAndSendKeys(furnitureFittingsFixturesAndOtherContentsTextField,polInsIntAttrFireEntity.getStringValueForField("FurnitureFittingsFixturesAndOtherContents"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigPiping")){
			clearAndSendKeys(pipingTextField,polInsIntAttrFireEntity.getStringValueForField("Piping"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigCabling")){
			clearAndSendKeys(cablingTextField,polInsIntAttrFireEntity.getStringValueForField("Cabling"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksAndStocksInProcess")){
			clearAndSendKeys(stocksAndStocksInprocessTextField,polInsIntAttrFireEntity.getStringValueForField("StocksAndStocksInProcess"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksHeldInTrust")){
			clearAndSendKeys(stocksHeldInTrustTextField,polInsIntAttrFireEntity.getStringValueForField("StocksHeldInTrust"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialStoredInTheOpenGasHoldersTankFarms")){
			clearAndSendKeys(materialStoredInTheOpenGasHoldersTankFarmsTextField,polInsIntAttrFireEntity.getStringValueForField("MaterialStoredInTheOpenGasHoldersTankFarms"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredAtTheLocation")){
			clearAndSendKeys(totalSumInsuredAtTheLocationTextField,polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredAtTheLocation"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredOfTheContentsOfProcessBlock")){
			clearAndSendKeys(sumInsuredOfTheContentsOfProcessBlockTextField,polInsIntAttrFireEntity.getStringValueForField("SumInsuredOfTheContentsOfProcessBlock"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeZone")){
			selectValueFromList(earthquakeZoneDropDown,polInsIntAttrFireEntity.getStringValueForField("EarthquakeZone"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigPinCode")){
			clearAndSendKeys(pinCodeDropDown,polInsIntAttrFireEntity.getStringValueForField("PinCode"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigNatureOfOccupancy")){
			selectValueFromList(natureOfOccupancyDropDown,polInsIntAttrFireEntity.getStringValueForField("NatureOfOccupancy"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigHazardousGoodsForShops305")){
			clearAndSendKeys(hazardousGoodsForShops305DropDown,polInsIntAttrFireEntity.getStringValueForField("HazardousGoodsForShops305"));
		}
		//Rasika-AR
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetProfitAR")) {
			clearAndSendKeys(netProfitARTextField, polInsIntAttrFireEntity.getStringValueForField("NetProfitAR"));
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStandingChargesAR")) {
			clearAndSendKeys(standingChargesARTextField, polInsIntAttrFireEntity.getStringValueForField("StandingChargesAR"));
		}

		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsAtTheLocMDAndBIARAR")) {
			clearAndSendKeys(totalSumInsuredAtTheLocationMDAndBIARTextField, polInsIntAttrFireEntity.getStringValueForField("TotalSumInsAtTheLocMDAndBIARAR"));
		}

		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	//******************AR(CHINTAN)1ST PAGE*******************************
	public void verifyPolicyInsuredIntrestAttributeLocationDetails(PolInsIntAttrFireEntity polInsIntAttrFireEntity,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButtonForAR(polInsIntAttrFireEntity);
		Thread.sleep(3000);
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNo")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationName")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("LocationName"), fetchValueFromTextFields(locationNameTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLocationAddress")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("LocationAddress"), fetchValueFromTextFields(locationAddressTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSectionCode")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SectionCode"), fetchValueFromList(sectionCodeDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRiskCode")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RiskCode"), fetchValueFromList(riskCodeDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRateCode")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("RateCode"), fetchValueFromList(rateCodeDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingPlinthAndFoundations")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("BuildingPlinthAndFoundations"), fetchValueFromTextFields(buildingPlinthAndFoundationsTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPlantMachineryAndAccessories")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PlantMachineryAndAccessories"), fetchValueFromTextFields(plantMachineryAndAccessoriesTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigFurnitureFittingsFixturesAndOtherContents")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("FurnitureFittingsFixturesAndOtherContents"), fetchValueFromTextFields(furnitureFittingsFixturesAndOtherContentsTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPiping")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("Piping"), fetchValueFromTextFields(pipingTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigCabling")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("Cabling"), fetchValueFromTextFields(cablingTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksAndStocksInprocess")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StocksAndStocksInprocess"), fetchValueFromTextFields(stocksAndStocksInprocessTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksHeldInTrust")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StocksHeldInTrust"), fetchValueFromTextFields(stocksHeldInTrustTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaterialStoredInTheOpenGasHoldersTankFarms")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("MaterialStoredInTheOpenGasHoldersTankFarms"), fetchValueFromTextFields(materialStoredInTheOpenGasHoldersTankFarmsTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredAtTheLocation")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredAtTheLocation"), fetchValueFromTextFields(totalSumInsuredAtTheLocationTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSumInsuredOfTheContentsOfProcessBlock")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SumInsuredOfTheContentsOfProcessBlock"), fetchValueFromTextFields(sumInsuredOfTheContentsOfProcessBlockTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("EarthquakeZone"), fetchValueFromList(earthquakeZoneDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPinCode")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNatureOfOccupancy")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NatureOfOccupancy"), fetchValueFromList(natureOfOccupancyDropDown), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigHazardousGoodsForShops305")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("HazardousGoodsForShops305"), fetchValueFromList(hazardousGoodsForShops305DropDown), AssertionType.WARNING);
		}
		//Rasika-AR
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNetProfitAR")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NetProfitAR"), fetchValueFromTextFields(netProfitARTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStandingChargesAR")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StandingChargesAR"), fetchValueFromTextFields(standingChargesARTextField), AssertionType.WARNING);
		}
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsAtTheLocMDAndBIARAR")) {
			assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSumInsAtTheLocMDAndBIARAR"), fetchValueFromTextFields(totalSumInsuredAtTheLocationMDAndBIARTextField), AssertionType.WARNING);
		}
		
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	} 




	//******************AR(cHINTAN)1ST PAGE*******************************
	public void navigateToPolicy(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			if(polInsIntAttrFireEntity.getStringValueForField("Product").equalsIgnoreCase("FD")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
			}
			if((polInsIntAttrFireEntity.getStringValueForField("Product").equalsIgnoreCase("FF")) || (polInsIntAttrFireEntity.getStringValueForField("Product").equalsIgnoreCase("DF"))){
				if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigMaximumLocationPerLimitSI")) {
					clearAndSendKeys(MaximumPerLocationLimitSI, polInsIntAttrFireEntity.getStringValueForField("MaximumPerLocationLimitSI"));
					click(forwardButton);
				}
			}
			switchToFrame("display");
		}
	}
	//SA-sonali
	public void clickSaveButtonPolicyAttribute(PolInsIntAttrFireEntity polInsIntAttrFireEntity){
		if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}
	//**************DF(CHINTAN)1ST PAGE*****************
	public void fillearthquakeDistrictZone(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZone")){
			//click(earthquakeDistrictZoneTextField);
			click(earthquakeDistrictZonefindButton);
			Thread.sleep(3000);
			switchToWindow("Eartquake zone List");
			selectstakeCode(polInsIntAttrFireEntity);
		}
	}
	//**************DF(CHINTAN)1ST PAGE*****************
	public void selectstakeCode(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		PageElement stakecodeToBeSelectedLink = new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrFireEntity.getStringValueForField("SRNo")+"')]"),"Stake Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(stakecodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickToOpenButton(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigBlockDetailsOpenButton")){
			click(blockDetailsOpenButton);
			//acceptAlertAndReturnConfirmationMessage();
			if(polInsIntAttrFireEntity.getStringValueForField("Product").equalsIgnoreCase("SF")){
				acceptAlertAndReturnConfirmationMessage();
			}
			try{
				switchToWindow("Parameter List for Block Details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Block Details");
			}
		}
	}
	//SF Dharmendra
	public void fillearthquakeZone(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigEarthquakeDistrictZoneTwo")){
			click(earthquakeDistrictZoneTextField);
			Thread.sleep(3000);
			switchToWindow("Eartquake zone List");
			selectEarthquakeZoneList(polInsIntAttrFireEntity);
		}
	}
	public void selectEarthquakeZoneList(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		PageElement EarthquakeZoneListToBeSelectedLink = new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrFireEntity.getStringValueForField("SRNo")+"')]"),"Earthquake Zone List  to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(EarthquakeZoneListToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void fillBlockDetailsOpenButton(PolInsIntAttrFireEntity polInsIntAttrFireEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrFireEntity);
		Thread.sleep(3000);
		
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigAddButton")){
			click(addButton);
			Thread.sleep(3000);
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,polInsIntAttrFireEntity.getStringValueForField("SerialNo"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigBlockNumberAsPerTheInsuredsInstructions")){
			clearAndSendKeys(blockNumberAsPerTheInsuredsInstructionsTextField,polInsIntAttrFireEntity.getStringValueForField("BlockNumberAsPerTheInsuredsInstructions"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameOfTheBlock")){
			clearAndSendKeys(nameOfTheBlockTextField,polInsIntAttrFireEntity.getStringValueForField("NameOfTheBlock"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingSuperStructure")){
			clearAndSendKeys(buildingSuperStructureTextField,polInsIntAttrFireEntity.getStringValueForField("BuildingSuperStructure"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingPlinthAndFoundations")){
			clearAndSendKeys(buildingPlinthAndFoundationsTextField,polInsIntAttrFireEntity.getStringValueForField("BuildingPlinthAndFoundations"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigPlantMachineryAndAccessories")){
			clearAndSendKeys(plantMachineryAndAccessoriesTextField,polInsIntAttrFireEntity.getStringValueForField("PlantMachineryAndAccessories"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigFurnitureFittingsFixturesAndOtherContents")){
			clearAndSendKeys(furnitureFittingsFixturesAndOtherContentsTextField,polInsIntAttrFireEntity.getStringValueForField("FurnitureFittingsFixturesAndOtherContents"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksAndStocksInProcess")){
			clearAndSendKeys(stocksAndStocksInProcessTextField,polInsIntAttrFireEntity.getStringValueForField("StocksAndStocksInProcess"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksHeldInTrust")){
			clearAndSendKeys(stocksHeldInTrustTextField,polInsIntAttrFireEntity.getStringValueForField("StocksHeldInTrust"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsured")){
			clearAndSendKeys(totalSumInsuredTextField,polInsIntAttrFireEntity.getStringValueForField("TotalSumInsured"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingBuildingPlinthAndFoundations")){
			clearAndSendKeys(totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField,polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredIncludingBuildingPlinthAndFoundations"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredExcludingBuildingPlinthAndFoundation")){
			clearAndSendKeys(totalSumInsuredExcludingBuildingPlinthAndFoundationTextField,polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredExcludingBuildingPlinthAndFoundation"));
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyBlockDetailsOpenButton(PolInsIntAttrFireEntity polInsIntAttrFireEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrFireEntity);
		if(polInsIntAttrFireEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBlockNumberAsPerTheInsuredsInstructions")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("BlockNumberAsPerTheInsuredsInstructions"), fetchValueFromTextFields(blockNumberAsPerTheInsuredsInstructionsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigNameOfTheBlock")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("NameOfTheBlock"), fetchValueFromTextFields(nameOfTheBlockTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingSuperStructure")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("BuildingSuperStructure"), fetchValueFromTextFields(buildingSuperStructureTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigBuildingPlinthAndFoundations")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("BuildingPlinthAndFoundations"), fetchValueFromTextFields(buildingPlinthAndFoundationsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigPlantMachineryAndAccessories")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("PlantMachineryAndAccessories"), fetchValueFromTextFields(plantMachineryAndAccessoriesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigFurnitureFittingsFixturesAndOtherContents")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("FurnitureFittingsFixturesAndOtherContents"), fetchValueFromTextFields(furnitureFittingsFixturesAndOtherContentsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksAndStocksInProcess")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StocksAndStocksInProcess"), fetchValueFromTextFields(stocksAndStocksInProcessTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigStocksHeldInTrust")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("StocksHeldInTrust"), fetchValueFromTextFields(stocksHeldInTrustTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingBuildingPlinthAndFoundations")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredIncludingBuildingPlinthAndFoundations"), fetchValueFromTextFields(totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrFireEntity.getBooleanValueForField("ConfigTotalSumInsuredExcludingBuildingPlinthAndFoundation")) {
				assertReference.assertEquals(polInsIntAttrFireEntity.getStringValueForField("TotalSumInsuredExcludingBuildingPlinthAndFoundation"), fetchValueFromTextFields(totalSumInsuredExcludingBuildingPlinthAndFoundationTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}

	public void fillandSubmitPolicyAttributeRiskFinanceDetailsFire(PolInsIntAttrFireEntity polInsIntAttrFireEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttrFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestAttributeFire(polInsIntAttrFireEntity, assertReference);
			clickNextButtonPolicyAttribute(polInsIntAttrFireEntity);
			clickSaveButtonPolicyAttribute(polInsIntAttrFireEntity);
			navigateToPolicy(polInsIntAttrFireEntity);
			navigateToAttribute(polInsIntAttrFireEntity);
			navigateToInsuredInterest(polInsIntAttrFireEntity);
			navigateToCoverage(polInsIntAttrFireEntity);
			navigateToLoan(polInsIntAttrFireEntity);
			navigateToClientDetails(polInsIntAttrFireEntity);
			navigateToRelation(polInsIntAttrFireEntity);
			navigateToPayment(polInsIntAttrFireEntity);
			navigateToFollowup(polInsIntAttrFireEntity);
			navigateToDocument(polInsIntAttrFireEntity);
		}
	}
}