package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskCoverPropertyFireEntity;

public class PolInsIntAttachCovAttrRiskCoverPropertyFire extends BasePage{
	//Shruti
	private PageElement removalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002DropDown;
	private PageElement sumInsuredForAddOn1002TextField;
	private PageElement forestFireAddOn1005DropDown;
	private PageElement sumInsuredForAddOn1005TextField;
	private PageElement impactDamageDueToInsuredsOwnRailRoadVehiclesForkliftsCranesStackersAndTheLikeAndArticlesDroppedThereFromAddOn1006DropDown;
	private PageElement spontaneousCombustionAddOn1007DropDown;
	private PageElement materialClassificationForSpontaneousCombustionDropDown;
	private PageElement sumInsuredOfRelativeCommodityForAddOn1007TextField;
	private PageElement earthquakeFireAndShockAddOn1009DropDown;
	private PageElement terrorismAddOn1017DropDown;
	private PageElement typeofRiskforTerrorismCoverDropDown;
	private PageElement whetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasisDropDown;
	private PageElement damageDueToSpillageOfMoltenmetalAddOn1018DropDown;	
	private PageElement sumInsuredForAddOn1018TextField;
	private PageElement houseBreakingClauseAddOn1019DropDown;	
	private PageElement spontaneousCombustionExtensionClauseAddOn1021DropDown;	
	private PageElement startupExpensesUnderTerrorismExtensionDropDown;
	private PageElement siforStartupExpensesUnderTerrorismExtensionTextField;
	private PageElement alternateAccommodationUnderTerrorismExtensionDropDown;	
	private PageElement siForAlternateAccommodationUnderTerrorismExtensionTextField;
	//chintan
	private PageElement sumInsuredForAddOn1019TextField;
	private PageElement sumInsuredForAddOn1020TextField;
	private PageElement boilerExplosionDamageClauseAddOn1023DropDown;
	private PageElement sumInsuredforAddOn1023TextField;
	private PageElement boilerRateTextField;
	private PageElement iscoverRequiredForWagesDropDown;
	private PageElement sumInsuredForWagesTextField;
	private PageElement premiumForWagesTextField;
	private PageElement insuranceOfSpecifiedPropertyiesAgainstLossOrDamagedDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown;
	private PageElement omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008TextField;
	private PageElement temporaryRemovalOfStocksClauseAddOn1013DropDown;
	private PageElement electricalApparatusClauseAddOn1020DropDown;
	//Yogesh
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
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
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
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;
	//FD-Yogesh
	private PageElement deteriorationOfStocksInColdStoragePremisesDueToAccidentalPowerFailureConsequentToDamageAtThePremisesOfPowerStationDueToAnInsuredPerilAddOn1003DropDown;	
	private PageElement deteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutOfLossOrDamageToTheColdStorageMachineriesInTheInsuredsPremisesDueToOperationAddOn1004DropDown;		
	private PageElement leakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011DropDown;		
	private PageElement leakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012DropDown;		
	private PageElement typeOfRiskForTerrorismCoverDropDown;	
	private PageElement leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown;		
	private PageElement leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown;		
	private PageElement housebreakingClauseAddOn1019DropDown;		
	private PageElement insuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown;		
	private PageElement shutdownOrStartUpExpensesClauseAddOn1024DropDown;	
	private PageElement startUpExpensesUnderTerrorismExtensionDropDown;	
	private PageElement sIForStartUpExpensesUnderTerrorismExtensionTextField;	 
	private PageElement sIForAlternateAccommodationUnderTerrorismExtensionTextField;
	private PageElement removalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002DropDown;
	//private PageElement damageDueToSpillageOfMoltenMetalAddOn1018DropDown;
	private PageElement riskCoverPropertyFireTitle;
	//SF
	private PageElement spoilageMaterialDamageCoverForStocksInSpecifiedBlocksAddOn1010DropDown;	
	private PageElement lossOfRentAddOn1014DropDown;	
	private PageElement insuranceOfAdditionalExpensesOfRentForAnAlternativeAccommodationAddOn1015DropDown;	
	private PageElement startUpExpensesAddOn1016DropDown;	
	private PageElement spoilageMaterialDamageCoverForMachineryContainersAndEquipmentsInSpecifiedBlocksAddOn1110DropDown;	
	private PageElement whetherAnyExpressConditionIsImposedAppliedForThePolicyDropDown;	
	private PageElement details1OfExpressConditionTestArea;	
	private PageElement details2OfExpressConditionTextArea;
	//LP
	private PageElement wagesDualBasisDropDown;
	private PageElement wagesProRataDropDown;
	private PageElement layOffRetrenchmentCompensationDropDown;
	private PageElement auditorFeeDropDown;
	private PageElement extensionToCoverInsuredPerilDropDown;
	private PageElement extensionToCoverInsuredPropertyAtOtherSituationsDropDown;
	private PageElement extensionToCoverSuppliersPremisesDropDown;
	private PageElement extensionToCoverElectGasWaterWorksDropDown;
	private PageElement extensionToCoverSpoilageConseqLossDropDown;
	private PageElement terrorismAddonDropDown;

	//Chinatn
	private PageElement totalSIForPropertyDamageTextField;
	private PageElement totalSIForMachineryBreakdownTextField;	
	private PageElement totalSIForBusinessInterruptionFLOPTextField;	
	private PageElement totalSIForBusinessInterruptionMLOPTextField;	
	private PageElement premiumIsGoingToBeCalculatedDropDown;	
	private PageElement propertyDamageTextField;	
	private PageElement machineryBreakdownTextField;	
	private PageElement businessInterruptionFLOPTextField;	
	private PageElement businessInterruptionMLOPTextField;
	private PageElement indemnityPeriodForFLOPTextField;
	private PageElement indemnityPeriodForMLOPTextField;
	private PageElement whetherStockInsuredOnDeclarationBasisDropDown;


	//PE Sonali
	private PageElement publicAuthorityDropdown;
	private PageElement leakageAndOverflowingDropdown;
	private PageElement fireFightingExpensesDropdown;
	private PageElement contaminationAndCoMinglingofstockDropdown;
	private PageElement catalystsAndConsumablesInterestInProcessDropdown;
	private PageElement inlandTransitDropdown;
	private PageElement expeditingLossDropdown;
	private PageElement reinstatementOfSIFollowingLossDropdown;
	private PageElement immediateRepairsDropdown;
	private PageElement sIForImmediateRepairsTextField;
	private PageElement premiumForImmediateRepairsTextField;
	private PageElement propertyInCourseOfConstructionDropdown;
	private PageElement hirePurchaseAndLeaseAgreementDropdown;
	private PageElement capitalAdditionDropdown;
	private PageElement propertyOutsideAwayFromPremisesDropdown;
	private PageElement temporaryRemovalIndiaDropdown;
	private PageElement expensesToMinimizeLossDropdown;
	private PageElement deliberateDamageDropdown;
	private PageElement computerSystemRecordsDropdown;
	private PageElement vesselImpactToJettyDropdown;
	private PageElement customerSuppliersAndUtilitiesDropdown;
	private PageElement denialOfAccessandPortBlockageDropdown;
	
	private PageElement sIforLeakageandoverflowingTextField;
	private PageElement premiumForLeakageAndOverflowingTextField;
	private PageElement sIForFireFightingExpensesTextField;
	private PageElement premiumForFireFightingExpensesTextField;
	private PageElement sIForContaminationAndCoMinglingOfStockTextField;
	private PageElement premiumforContaminationAndCoMinglingOfStockTextField;
	private PageElement sIforCatalystsandconsumablesinterestinprocessTextField;
	private PageElement premiumforCatalystsandconsumablesTestField;
	private PageElement sIforInlandTransitTextField;
	private PageElement premiumforInlandTransitTextField;
	private PageElement sIforExpeditinglossTextField;
	private PageElement premiumforExpeditinglossTextField;
		
	//Chintan
	private PageElement SumInsuredAddOn1011TextField; 
	private PageElement SumInsuredAddOn1012TextField;
	private PageElement	SumInsuredAddOn1112TextField;
	//nilesh
	private PageElement sumInsuredDualBasisTextField;
	private PageElement premiumDualBasisTextField;
	private PageElement sumInsuredProrata;
	private PageElement premiumProrataTextField;
	private PageElement sumInsuredLayOffTextField;
	private PageElement premiumLayOffTextField;
	private PageElement sumInsuredAuditorsTextField;
	private PageElement premiumAuditorsTextField;
	private PageElement premiumExtCustPremisesTextField;;
	private PageElement premiumExtCustProprtyOtherSitTextField;
	private PageElement premiumExtCoverSupplierPremisesTextField;
	private PageElement premiumExtelectGasWaterTextField;
	private PageElement premiumExtSpoilageConseqLossTextField;
	
	
	private PageElement sumInsuredAddOn1111TextField;
	//SF
	private PageElement SumInsuredAddOn1010TextField;
	private PageElement SumInsuredAddOn1013TextField;
	private PageElement SumInsuredAddOn1014TextField;
	private PageElement SumInsuredAddOn1015TextField;
	private PageElement SumInsuredAddOn1016TextField;
	private PageElement SumInsuredAddOn1110TextField;
	
	public PolInsIntAttachCovAttrRiskCoverPropertyFire(WebDriver driver, String pageName) {
		super(driver,pageName);

		//shruti
		removalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Removal of Debris (In excess of 1% of claim amount)( Add On 1002)')]/following::select"), "Removal of Debris (In excess of 1% of claim amount)( Add On 1002)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAddOn1002TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1002')]/following::input"), "Sum insured for add on 1002", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forestFireAddOn1005DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Forest Fire (Add On 1005)')]/following::select"),"Forest Fire (Add On 1005)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAddOn1005TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1005')]/following::input"),"Sum insured for add on 1005" ,false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		impactDamageDueToInsuredsOwnRailRoadVehiclesForkliftsCranesStackersAndTheLikeAndArticlesDroppedThereFromAddOn1006DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006)')]/following::select"),"Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006)",false ,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spontaneousCombustionAddOn1007DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Spontaneous Combustion (Add On 1007)')]/following::select"),"Spontaneous Combustion (Add On 1007)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		materialClassificationForSpontaneousCombustionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Material Classification for Spontaneous Combustion')]/following::select"),"Material Classification for Spontaneous Combustion", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredOfRelativeCommodityForAddOn1007TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured of relative commodity for add on 1007')]/following::input"),"Sum insured of relative commodity for add on 1007", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeFireAndShockAddOn1009DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake (Fire and Shock) (Add On 1009)')]/following::select"),"Earthquake (Fire and Shock) (Add On 1009)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		terrorismAddOn1017DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Terrorism (Add On 1017)')]/following::select"),"Terrorism (Add On 1017)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofRiskforTerrorismCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Risk for Terrorism Cover')]/following::select"),"Type of Risk for Terrorism Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasisDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether terrorism cover is opted under Terrorism Pool or on Stand Alone basis')]/following::select"),"Whether terrorism cover is opted under Terrorism Pool or on Stand Alone basis" ,false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		damageDueToSpillageOfMoltenmetalAddOn1018DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Damage due to Spillage of molten metal(Add On 1018)')]/following::select"), "Damage due to Spillage of molten metal(Add On 1018)",false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAddOn1018TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1018')]/following::input"), "Sum insured for add on 1018",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		houseBreakingClauseAddOn1019DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Housebreaking Clause(Add On 1019)')]/following::select"),"Housebreaking Clause(Add On 1019)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spontaneousCombustionExtensionClauseAddOn1021DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Spontaneous Combustion Extension Clause(Add On 1021)')]/following::select"),"Spontaneous Combustion Extension Clause(Add On 1021)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		startupExpensesUnderTerrorismExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Start up expenses under Terrorism extension')]/following::select"),"Start up expenses under Terrorism extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		siforStartupExpensesUnderTerrorismExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Start up expenses under Terrorism extension')]/following::input"),"SI for Start up expenses under Terrorism extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		alternateAccommodationUnderTerrorismExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Alternate accommodation under Terrorism extension')]/following::select"),"Alternate accommodation under Terrorism extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		siForAlternateAccommodationUnderTerrorismExtensionTextField=new PageElement(By.xpath("/td//div[contains(text(),'SI for Alternate accommodation under Terrorism extension')]/following::input"),"SI for Alternate accommodation under Terrorism extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008TextField=new PageElement(By.xpath("//td//div[contains(text(),'Omission to insure additions, alterations or extensions(Add On 1008)')]/following::input"),"Omission to insure additions, alterations or extensions(Add On 1008)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//chintan
		sumInsuredForAddOn1019TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Add On 1019')]/following::input"),"Sum Insured for Add On 1019", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForAddOn1020TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Add On 1020')]/following::input"),"Sum Insured for Add On 1020", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		boilerExplosionDamageClauseAddOn1023DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Boiler explosion Damage Clause(Add On 1023)')]/following::select"),"Boiler explosion Damage Clause(Add On 1023)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforAddOn1023TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Add On 1023')]/following::input"),"Sum Insured for Add On 1023", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		boilerRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Boiler Rate')]/following::input"),"Boiler Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iscoverRequiredForWagesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for wages?')]/following::select"),"Is cover required for wages?", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForWagesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for wages')]/following::input"),"Sum Insured for wages", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForWagesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium for wages')]/following::input"),"Premium for wages", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuranceOfSpecifiedPropertyiesAgainstLossOrDamagedDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022)')]/following::select"),"Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		temporaryRemovalOfStocksClauseAddOn1013DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Temporary removal of stocks clause(Add On 1013)')]/following::select"),"Temporary removal of stocks clause(Add On 1013)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		electricalApparatusClauseAddOn1020DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Electrical Apparatus Clause(Add On 1020)')]/following::select"),"Electrical Apparatus Clause(Add On 1020)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//Yogesh
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
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Code")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Code")), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Name")), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FD-Yogesh
		deteriorationOfStocksInColdStoragePremisesDueToAccidentalPowerFailureConsequentToDamageAtThePremisesOfPowerStationDueToAnInsuredPerilAddOn1003DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Deterioration of stocks in cold storage premises due to accidental power failure consequent to damage at the premises of power station due to an insured peril(Add On 1003)')]/following::select"), "Deterioration of stocks in cold storage premises due to accidental power failure consequent to damage at the premises of power station due to an insured peril(Add On 1003) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutOfLossOrDamageToTheColdStorageMachineriesInTheInsuredsPremisesDueToOperationAddOn1004DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Deterioration of stocks in cold storage premises due to change of temperature arising out of loss or damage to the cold storage machineries in the insureds premises due to operation.. (Add On 1004)')]/following::select"), "Deterioration of stocks in cold storage premises due to change of temperature arising out of loss or damage to the cold storage machineries in the insureds premises due to operation.. (Add On 1004) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//impactDamageDueToInsuredsOwnRailRoadVehiclesForkLiftsCranesStackersAndTheLikeAndArticlesDroppedThereFromAddOn1006DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006)')]/following::select"), "Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage and contamination cover Where the tanks are within the insureds own premises(Add On 1011)')]/following::select"), "Leakage and contamination cover Where the tanks are within the insureds own premises(Add On 1011) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage cover Where the tanks are within the insureds own premises(Add On1012)')]/following::select"), "Leakage cover Where the tanks are within the insureds own premises(Add On1012) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfRiskForTerrorismCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Risk for Terrorism Cover')]/following::select"), "Type of Risk for Terrorism Cover DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage and contamination cover Where tanks are located elsewhere(Add On 1111)')]/following::select"), "Leakage and contamination cover Where tanks are located elsewhere(Add On 1111) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage cover where tanks are located elsewhere(Add On 1112)')]/following::select"), "Leakage cover where tanks are located elsewhere(Add On 1112) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		housebreakingClauseAddOn1019DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Housebreaking Clause(Add On 1019)')]/following::select"), "Housebreaking Clause(Add On 1019) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spontaneousCombustionExtensionClauseAddOn1021DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Spontaneous Combustion Extension Clause(Add On 1021)')]/following::select"), "Spontaneous Combustion Extension Clause(Add On 1021) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		insuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022)')]/following::select"), "Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		shutdownOrStartUpExpensesClauseAddOn1024DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Shutdown or Start up Expenses Clause(Add On 1024)')]/following::select"), "Shutdown or Start up Expenses Clause(Add On 1024) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		startUpExpensesUnderTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Start up expenses under Terrorism extension')]/following::select"), "Start up expenses under Terrorism extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForStartUpExpensesUnderTerrorismExtensionTextField= new PageElement(By.xpath("//td//div[contains(text(),'SI for Start up expenses under Terrorism extension')]/following::input"), "SI for Start up expenses under Terrorism extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sIForAlternateAccommodationUnderTerrorismExtensionTextField= new PageElement(By.xpath("//td//div[contains(text(),'SI for Alternate accommodation under Terrorism extension')]/following::input"), "SI for Alternate accommodation under Terrorism extension TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		removalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Removal of Debris (In excess of 1% of claim amount)( Add On 1002)')]/following::select"), "Type of construction DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//damageDueToSpillageOfMoltenMetalAddOn1018DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Damage due to Spillage of molten metal(Add On 1018)')]/following::select"), "Type of construction DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//SF
		spoilageMaterialDamageCoverForStocksInSpecifiedBlocksAddOn1010DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Spoilage Material damage cover for Stocks in specified blocks(Add On 1010)')]/following::select"), "Spoilage Material damage cover for Stocks in specified blocks(Add On 1010) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lossOfRentAddOn1014DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Loss of Rent(Add On 1014)')]/following::select"), "Loss of Rent(Add On 1014) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		insuranceOfAdditionalExpensesOfRentForAnAlternativeAccommodationAddOn1015DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Insurance of Additional Expenses of Rent for an Alternative Accommodation(Add On 1015)')]/following::select"), "Insurance of Additional Expenses of Rent for an Alternative Accommodation(Add On 1015) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		startUpExpensesAddOn1016DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Start up expenses(Add On 1016)')]/following::select"), "Start up expenses(Add On 1016) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spoilageMaterialDamageCoverForMachineryContainersAndEquipmentsInSpecifiedBlocksAddOn1110DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Spoilage Material damage cover for Machinery, Containers and Equipments in specified blocks(Add On 1110)')]/following::select"), "Spoilage Material damage cover for Machinery, Containers and Equipments in specified blocks(Add On 1110) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherAnyExpressConditionIsImposedAppliedForThePolicyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether any express Condition is imposed / applied for the policy')]/following::select"), "Whether any express Condition is imposed / applied for the policy DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		details1OfExpressConditionTestArea= new PageElement(By.xpath("//td//div[contains(text(),'Details1 of express Condition')]/following::textarea"), "Details1 of express Condition", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		details2OfExpressConditionTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details2 of express Condition')]/following::textarea"), "Details2 of express Condition", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LP
		wagesDualBasisDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Wages - Dual Basis')]/following::select"), "Wages - Dual Basis DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wagesProRataDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Wages - Pro rata Basis')]/following::select"), "Wages - Pro rata Basis", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		layOffRetrenchmentCompensationDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Lay off and/or Retrenchment Compensation')]/following::select"), "Lay off and/or Retrenchment Compensation DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		auditorFeeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Auditors Fee')]/following::select"), "Auditors Fee DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionToCoverInsuredPerilDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Extension to Cover Customers Premises premises of power station due to an insured peril')]/following::select"), "Extension to Cover Customers Premises premises of power station due to an insured peril DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionToCoverInsuredPropertyAtOtherSituationsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Extension to cover Insured Property stored at other situations')]/following::select"), "Extension to cover Insured Property stored at other situations DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionToCoverSuppliersPremisesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Extension to cover Suppliers Premises')]/following::select"), "Extension to cover Suppliers Premises DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionToCoverElectGasWaterWorksDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Extension to cover electricity Stations, Gas Works and water works')]/following::select"), "Extension to cover electricity Stations, Gas Works and water works DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionToCoverSpoilageConseqLossDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Extension to cover Spoilage Consequential Loss')]/following::select"), "Extension to cover Spoilage Consequential Loss DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		terrorismAddonDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Terrorism (Add On 1017)')]/following::select"), "Terrorism (Add On 1017) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Chintan
		totalSIForPropertyDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI for Property Damage')]/following::input"), "Total SI for Property Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSIForMachineryBreakdownTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI for Machinery Breakdown')]/following::input"), "Total SI for Machinery Breakdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSIForBusinessInterruptionFLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI for Business Interruption(FLOP)')]/following::input"), "Total SI for Business Interruption(FLOP)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSIForBusinessInterruptionMLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total SI for Business Interruption(MLOP)')]/following::input"), "Total SI for Business Interruption(MLOP)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumIsGoingToBeCalculatedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Premium is going to be calculated on which basis')]/following::select"), "Premium is going to be calculated on which basis')]/following::select", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		propertyDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Property Damage Rate')]/following::input"), "Property Damage Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		machineryBreakdownTextField=new PageElement(By.xpath("//td//div[contains(text(),'Machinery Breakdown Rate')]/following::input"), "Machinery Breakdown Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessInterruptionFLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Business Interruption(FLOP) Rate')]/following::input"), "Business Interruption(FLOP) Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessInterruptionMLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Business Interruption(MLOP) Rate')]/following::input"), "Business Interruption(MLOP) Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodForFLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period for FLOP (in months)')]/following::input"), "Indemnity Period for FLOP (in months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodForMLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period for MLOP (in months)')]/following::input"), "Indemnity Period for MLOP (in months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherStockInsuredOnDeclarationBasisDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Stock insured on Declaration Basis')]/following::select"), "Whether Stock insured on Declaration Basis", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		//PE -sonali
		publicAuthorityDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Public authority","select")), "Public authority", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageAndOverflowingDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Leakage and overflowing","select")), "Leakage and overflowing", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fireFightingExpensesDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Fire fighting expenses","select")), "Fire fighting expenses", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		contaminationAndCoMinglingofstockDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Contamination and co-mingling of stock","select")), "Contamination and co-mingling of stock", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		catalystsAndConsumablesInterestInProcessDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Catalysts and consumables interest in process","select")), "Catalysts and consumables interest in process", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inlandTransitDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Inland Transit","select")), "Inland Transit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		expeditingLossDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expediting loss","select")), "Expediting loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reinstatementOfSIFollowingLossDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reinstatement  of SI following loss","select")), "Reinstatement of SI following loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		immediateRepairsDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Immediate repairs","select")), "Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForImmediateRepairsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Immediate repairs","input")), "SI for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForImmediateRepairsTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Immediate repairs","input")), "Premium for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		propertyInCourseOfConstructionDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Property in course of construction","select")), "Property in course of construction", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hirePurchaseAndLeaseAgreementDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hire purchase and lease agreement","select")), "Hire purchase and lease agreement", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		capitalAdditionDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Capital addition","select")), "Capital addition", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		propertyOutsideAwayFromPremisesDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Property outside /away from premises","select")), "Property outside /away from premises", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		temporaryRemovalIndiaDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Temporary removal (India)","select")), "Temporary removal (India)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		expensesToMinimizeLossDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expenses to minimize loss","select")), "Expenses to minimize loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deliberateDamageDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deliberate damage","select")), "Deliberate damage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		computerSystemRecordsDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Computer system records","select")), "Computer system records", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselImpactToJettyDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Vessel Impact to Jetty","select")), "Vessel Impact to Jetty", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		customerSuppliersAndUtilitiesDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Customer Suppliers and utilities","select")), "Customer Suppliers and utilities", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		denialOfAccessandPortBlockageDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Denial of access and port blockage","select")), "Denial of access and port blockage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		sIforLeakageandoverflowingTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Leakage and overflowing","input")), "SI for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForLeakageAndOverflowingTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Leakage and overflowing","input")), "SI for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForFireFightingExpensesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Fire fighting expenses","input")), "SI for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForFireFightingExpensesTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Fire fighting expenses","input")), "Premium for Fire fighting expenses", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForContaminationAndCoMinglingOfStockTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Contamination and co-mingling of stock","input")), "SI for Contamination and co-mingling of stock", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumforContaminationAndCoMinglingOfStockTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Contamination and co-mingling of stock","input")), "Premium for Contamination and co-mingling of stock", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIforCatalystsandconsumablesinterestinprocessTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Catalysts and consumables interest in process","input")), "SI for Catalysts and consumables interest in process", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumforCatalystsandconsumablesTestField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Catalysts and consumables","input")), "Premium for Catalysts and consumables", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIforInlandTransitTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Inland Transit","input")), "SI for Inland Transit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumforInlandTransitTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Inland Transit","input")), "Premium for Inland Transit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIforExpeditinglossTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Expediting loss","input")), "SI for Expediting loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumforExpeditinglossTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Expediting loss","input")), "Premium for Expediting loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//Chintan= new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Immediate repairs","input")), "SI for Immediate repairs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	  SumInsuredAddOn1011TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1011')]/following::input"), "Sum Insured Add On 1011", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1012TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1012')]/following::input"), "Sum Insured Add On 1012", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1112TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1112')]/following::input"), "Sum Insured Add On 1112", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  //nilesh
	  sumInsuredDualBasisTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for Wages - Dual Basis')]/following::input"), "Sum insured for Wages - Dual Basis", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumDualBasisTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Wages - Dual Basis')]/following::input"), "Premium Wages - Dual Basis", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  sumInsuredProrata=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for Wages - Pro rata Basis')]/following::input"), "Sum insured for Wages - Pro rata Basis", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumProrataTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Wages - Pro rata Basis')]/following::input"), "Premium Wages - Pro rata Basis", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  sumInsuredLayOffTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for Lay off and/or Retrenchment Compensation')]/following::input"), "Sum insured for Lay off and/or Retrenchment Compensation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumLayOffTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Lay off and/or Retrenchment Compensation')]/following::input"), "Premium Lay off and/or Retrenchment Compensation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  sumInsuredAuditorsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for Auditors Fee')]/following::input"), "Sum insured for Auditors Fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumAuditorsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Auditors Fee')]/following::input"), "Premium Auditors Fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumExtCustPremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Extension to Cover Customers Premises')]/following::input"), "Premium Extension to Cover Customers Premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumExtCustProprtyOtherSitTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Extension to cover Insured Property stored at other situations')]/following::input"), "Premium Extension to cover Insured Property stored at other situations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumExtCoverSupplierPremisesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Extension to Cover Suppliers Premises')]/following::input"), "Premium Extension to Cover Suppliers Premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumExtelectGasWaterTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Extension to cover electricity Stations, Gas Works and water works')]/following::input"), "Premium Extension to cover electricity Stations, Gas Works and water works", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  premiumExtSpoilageConseqLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Extension to cover Spoilage Consequential Loss')]/following::input"), "Premium Extension to cover Spoilage Consequential Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		
	
	  sumInsuredAddOn1111TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1111')]/following::input"), "Sum insured for add on 1111", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	//SF
	  SumInsuredAddOn1010TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1010')]/following::input"), "Sum insured for add on 1010", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1013TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1013')]/following::input"), "Sum insured for add on 1013", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1014TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1014')]/following::input"), "Sum insured for add on 1014", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1015TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1015')]/following::input"), "Sum insured for add on 1015", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1016TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1016')]/following::input"), "Sum insured for add on 1016", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  SumInsuredAddOn1110TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1110')]/following::input"), "Sum insured for add on 1110", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	  
	}


	public void fillPolInsIntAttachCovAttrRiskCoverPropertyFire(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(riskCoverPropertyFireEntity.getAction().equalsIgnoreCase("add") || riskCoverPropertyFireEntity.getAction().equalsIgnoreCase("edit")){
			//shruti
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigRemovalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002")) {
				selectValueFromList(removalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002DropDown, riskCoverPropertyFireEntity.getStringValueForField("RemovalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1002")) {
				clearAndSendKeys(sumInsuredForAddOn1002TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1002"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigForestFireAddOn1005")) {
				selectValueFromList(forestFireAddOn1005DropDown, riskCoverPropertyFireEntity.getStringValueForField("ForestFireAddOn1005"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1005")) {
				clearAndSendKeys(sumInsuredForAddOn1005TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1005"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigImpactDamageDueToInsuredsOwnRailRoadAddOn1006")) {
				selectValueFromList(impactDamageDueToInsuredsOwnRailRoadVehiclesForkliftsCranesStackersAndTheLikeAndArticlesDroppedThereFromAddOn1006DropDown, riskCoverPropertyFireEntity.getStringValueForField("ImpactDamageDueToInsuredsOwnRailRoadAddOn1006"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpontaneousCombustionAddOn1007")) {
				selectValueFromList(spontaneousCombustionAddOn1007DropDown, riskCoverPropertyFireEntity.getStringValueForField("SpontaneousCombustionAddOn1007"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMaterialClassificationForSpontaneousCombustion")) {
				selectValueFromList(materialClassificationForSpontaneousCombustionDropDown, riskCoverPropertyFireEntity.getStringValueForField("MaterialClassificationForSpontaneousCombustion"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredOfRelativeCommodityForAddOn1007")) {
				clearAndSendKeys(sumInsuredOfRelativeCommodityForAddOn1007TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredOfRelativeCommodityForAddOn1007"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigEarthquakeFireAndShockAddOn1009")) {
				selectValueFromList(earthquakeFireAndShockAddOn1009DropDown, riskCoverPropertyFireEntity.getStringValueForField("EarthquakeFireAndShockAddOn1009"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")) {
				selectValueFromList(terrorismAddOn1017DropDown, riskCoverPropertyFireEntity.getStringValueForField("TerrorismAddOn1017"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTypeofRiskforTerrorismCover")) {
				selectValueFromList(typeofRiskforTerrorismCoverDropDown, riskCoverPropertyFireEntity.getStringValueForField("TypeofRiskforTerrorismCover"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWhetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasis")) {
				selectValueFromList(whetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasisDropDown, riskCoverPropertyFireEntity.getStringValueForField("WhetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasis"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDamageDueToSpillageOfMoltenMetalAddOn1018")) {
				selectValueFromList(damageDueToSpillageOfMoltenmetalAddOn1018DropDown, riskCoverPropertyFireEntity.getStringValueForField("DamageDueToSpillageOfMoltenMetalAddOn1018"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1018")) {
				clearAndSendKeys(sumInsuredForAddOn1018TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1018"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHouseBreakingClauseAddOn1019")) {
				selectValueFromList(houseBreakingClauseAddOn1019DropDown, riskCoverPropertyFireEntity.getStringValueForField("HouseBreakingClauseAddOn1019"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpontaneousCombustionExtensionClauseAddOn1021")) {
				selectValueFromList(spontaneousCombustionExtensionClauseAddOn1021DropDown, riskCoverPropertyFireEntity.getStringValueForField("SpontaneousCombustionExtensionClauseAddOn1021"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartupExpensesUnderTerrorismExtension")) {
				selectValueFromList(startupExpensesUnderTerrorismExtensionDropDown, riskCoverPropertyFireEntity.getStringValueForField("StartupExpensesUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforStartupExpensesUnderTerrorismExtension")) {
				clearAndSendKeys(siforStartupExpensesUnderTerrorismExtensionTextField, riskCoverPropertyFireEntity.getStringValueForField("SIforStartupExpensesUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAlternateAccommodationUnderTerrorismExtension")) {
				selectValueFromList(alternateAccommodationUnderTerrorismExtensionDropDown, riskCoverPropertyFireEntity.getStringValueForField("AlternateAccommodationUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForAlternateAccommodationUnderTerrorismExtension")) {
				clearAndSendKeys(siForAlternateAccommodationUnderTerrorismExtensionTextField, riskCoverPropertyFireEntity.getStringValueForField("SIForAlternateAccommodationUnderTerrorismExtension"));
			}
			//chintan
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1019")) {
				clearAndSendKeys(sumInsuredForAddOn1019TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1019"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1020")) {
				clearAndSendKeys(sumInsuredForAddOn1020TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1020"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBoilerExplosionDamageClauseAddOn1023")) {
				selectValueFromList(boilerExplosionDamageClauseAddOn1023DropDown, riskCoverPropertyFireEntity.getStringValueForField("BoilerExplosionDamageClauseAddOn1023"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredforAddOn1023")) {
				clearAndSendKeys(sumInsuredforAddOn1023TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredforAddOn1023"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBoilerRate")) {
				clearAndSendKeys(boilerRateTextField, riskCoverPropertyFireEntity.getStringValueForField("BoilerRate"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIscoverRequiredForWages")) {
				selectValueFromList(iscoverRequiredForWagesDropDown, riskCoverPropertyFireEntity.getStringValueForField("IscoverRequiredForWages"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForWages")) {
				clearAndSendKeys(sumInsuredForWagesTextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForWages"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForWages")) {
				clearAndSendKeys(premiumForWagesTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumForWages"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedPropertyiesAgainstLossAddOn1022")) {
				selectValueFromList(insuranceOfSpecifiedPropertyiesAgainstLossOrDamagedDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown, riskCoverPropertyFireEntity.getStringValueForField("InsuranceOfSpecifiedPropertyiesAgainstLossAddOn1022"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigOmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008")) {
				clearAndSendKeys(omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008TextField, riskCoverPropertyFireEntity.getStringValueForField("OmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTemporaryRemovalOfStocksClauseAddOn1013")) {
				selectValueFromList(temporaryRemovalOfStocksClauseAddOn1013DropDown, riskCoverPropertyFireEntity.getStringValueForField("TemporaryRemovalOfStocksClauseAddOn1013"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigElectricalApparatusClauseAddOn1020")) {
				selectValueFromList(electricalApparatusClauseAddOn1020DropDown, riskCoverPropertyFireEntity.getStringValueForField("ElectricalApparatusClauseAddOn1020"));
			}
			//Yogesh
			//FD-Yogesh
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToAccidAddOn1003")) {
				selectValueFromList(deteriorationOfStocksInColdStoragePremisesDueToAccidentalPowerFailureConsequentToDamageAtThePremisesOfPowerStationDueToAnInsuredPerilAddOn1003DropDown, riskCoverPropertyFireEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToAccidAddOn1003"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutAddOn1004")) {
				selectValueFromList(deteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutOfLossOrDamageToTheColdStorageMachineriesInTheInsuredsPremisesDueToOperationAddOn1004DropDown, riskCoverPropertyFireEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutAddOn1004"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011")) {
				selectValueFromList(leakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011DropDown, riskCoverPropertyFireEntity.getStringValueForField("LeakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012")) {
				selectValueFromList(leakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012DropDown, riskCoverPropertyFireEntity.getStringValueForField("LeakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTypeOfRiskForTerrorismCover")) {
				selectValueFromList(typeOfRiskForTerrorismCoverDropDown, riskCoverPropertyFireEntity.getStringValueForField("TypeOfRiskForTerrorismCover"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111")) {
				selectValueFromList(leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown, riskCoverPropertyFireEntity.getStringValueForField("LeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageCoverWhereTanksAreLocatedElsewhereAddOn1112")) {
				selectValueFromList(leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown, riskCoverPropertyFireEntity.getStringValueForField("LeakageCoverWhereTanksAreLocatedElsewhereAddOn1112"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHousebreakingClauseAddOn1019")) {
				selectValueFromList(housebreakingClauseAddOn1019DropDown, riskCoverPropertyFireEntity.getStringValueForField("HousebreakingClauseAddOn1019"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactAddOn1022")) {
				selectValueFromList(insuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown, riskCoverPropertyFireEntity.getStringValueForField("InsuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactAddOn1022"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigShutdownOrStartUpExpensesClauseAddOn1024")) {
				selectValueFromList(shutdownOrStartUpExpensesClauseAddOn1024DropDown, riskCoverPropertyFireEntity.getStringValueForField("ShutdownOrStartUpExpensesClauseAddOn1024"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartUpExpensesUnderTerrorismExtension")) {
				selectValueFromList(startUpExpensesUnderTerrorismExtensionDropDown, riskCoverPropertyFireEntity.getStringValueForField("StartUpExpensesUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForStartUpExpensesUnderTerrorismExtension")) {
				clearAndSendKeys(sIForStartUpExpensesUnderTerrorismExtensionTextField, riskCoverPropertyFireEntity.getStringValueForField("SIForStartUpExpensesUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsIForAlternateAccommodationUnderTerrorismExtension")) {
				clearAndSendKeys(sIForAlternateAccommodationUnderTerrorismExtensionTextField, riskCoverPropertyFireEntity.getStringValueForField("sIForAlternateAccommodationUnderTerrorismExtension"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigRemovalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002")) {
				selectValueFromList(removalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002DropDown, riskCoverPropertyFireEntity.getStringValueForField("RemovalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002"));
			}
			//SF
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpoilMatDamCovStocksInSpecBlocksAddOn1010")) {
				selectValueFromList(spoilageMaterialDamageCoverForStocksInSpecifiedBlocksAddOn1010DropDown, riskCoverPropertyFireEntity.getStringValueForField("SpoilMatDamCovStocksInSpecBlocksAddOn1010"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLossOfRentAddOn1014")) {
				selectValueFromList(lossOfRentAddOn1014DropDown, riskCoverPropertyFireEntity.getStringValueForField("LossOfRentAddOn1014"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsOfAddExpenOfRentForAnAlterAccomAddOn1015")) {
				selectValueFromList(insuranceOfAdditionalExpensesOfRentForAnAlternativeAccommodationAddOn1015DropDown, riskCoverPropertyFireEntity.getStringValueForField("InsOfAddExpenOfRentForAnAlterAccomAddOn1015"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartUpExpensesAddOn1016")) {
				selectValueFromList(startUpExpensesAddOn1016DropDown, riskCoverPropertyFireEntity.getStringValueForField("StartUpExpensesAddOn1016"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpoilMatDamCovMachContEquipInSpecBlocksAddOn1110")) {
				selectValueFromList(spoilageMaterialDamageCoverForMachineryContainersAndEquipmentsInSpecifiedBlocksAddOn1110DropDown, riskCoverPropertyFireEntity.getStringValueForField("SpoilMatDamCovMachContEquipInSpecBlocksAddOn1110"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWheAnyExpressCondIsImpAppForThePolicy")) {
				selectValueFromList(whetherAnyExpressConditionIsImposedAppliedForThePolicyDropDown, riskCoverPropertyFireEntity.getStringValueForField("WheAnyExpressCondIsImpAppForThePolicy"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDetails1OfExpressCondition")) {
				clearAndSendKeys(details1OfExpressConditionTestArea, riskCoverPropertyFireEntity.getStringValueForField("Details1OfExpressCondition"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDetails2OfExpressCondition")) {
				clearAndSendKeys(details2OfExpressConditionTextArea, riskCoverPropertyFireEntity.getStringValueForField("Details2OfExpressCondition"));
			}
			//nilesh
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWagesDualBasis")) {
				selectValueFromList(wagesDualBasisDropDown, riskCoverPropertyFireEntity.getStringValueForField("WagesDualBasis"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWagesProRata")) {
				selectValueFromList(wagesProRataDropDown, riskCoverPropertyFireEntity.getStringValueForField("WagesProRata"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLayOffRetrenchmentCompensation")) {
				selectValueFromList(layOffRetrenchmentCompensationDropDown, riskCoverPropertyFireEntity.getStringValueForField("LayOffRetrenchmentCompensation"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAuditorFee")) {
				selectValueFromList(auditorFeeDropDown, riskCoverPropertyFireEntity.getStringValueForField("AuditorFee"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverInsuredPeril")) {
				selectValueFromList(extensionToCoverInsuredPerilDropDown, riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverInsuredPeril"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverInsuredPropertyAtOtherSituations")) {
				selectValueFromList(extensionToCoverInsuredPropertyAtOtherSituationsDropDown, riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverInsuredPropertyAtOtherSituations"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverSuppliersPremises")) {
				selectValueFromList(extensionToCoverSuppliersPremisesDropDown, riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverSuppliersPremises"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverElectGasWaterWorks")) {
				selectValueFromList(extensionToCoverElectGasWaterWorksDropDown, riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverElectGasWaterWorks"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverSpoilageConseqLoss")) {
				selectValueFromList(extensionToCoverSpoilageConseqLossDropDown, riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverSpoilageConseqLoss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTerrorismAddon")) {
				selectValueFromList(terrorismAddonDropDown, riskCoverPropertyFireEntity.getStringValueForField("TerrorismAddon"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumIsGoingToBeCalculated")) {
				selectValueFromList(premiumIsGoingToBeCalculatedDropDown, riskCoverPropertyFireEntity.getStringValueForField("PremiumIsGoingToBeCalculated"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPropertyDamage")) {
				clearAndSendKeys(propertyDamageTextField, riskCoverPropertyFireEntity.getStringValueForField("PropertyDamage"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMachineryBreakdown")) {
				clearAndSendKeys(machineryBreakdownTextField, riskCoverPropertyFireEntity.getStringValueForField("MachineryBreakdown"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBusinessInterruptionFLOP")) {
				clearAndSendKeys(businessInterruptionFLOPTextField, riskCoverPropertyFireEntity.getStringValueForField("BusinessInterruptionFLOP"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBusinessInterruptionMLOP")) {
				clearAndSendKeys(businessInterruptionMLOPTextField, riskCoverPropertyFireEntity.getStringValueForField("BusinessInterruptionMLOP"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForFLOP")) {
				clearAndSendKeys(indemnityPeriodForFLOPTextField, riskCoverPropertyFireEntity.getStringValueForField("IndemnityPeriodForFLOP"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForMLOP")) {
				clearAndSendKeys(indemnityPeriodForMLOPTextField, riskCoverPropertyFireEntity.getStringValueForField("IndemnityPeriodForMLOP"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWhetherStockInsuredOnDeclarationBasis")) {
				selectValueFromList(whetherStockInsuredOnDeclarationBasisDropDown, riskCoverPropertyFireEntity.getStringValueForField("WhetherStockInsuredOnDeclarationBasis"));
			}

			//PE

			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPublicAuthority")) {
				selectValueFromList(publicAuthorityDropdown, riskCoverPropertyFireEntity.getStringValueForField("PublicAuthority"));
			}
			//
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndOverflowing")) {
				selectValueFromList(leakageAndOverflowingDropdown, riskCoverPropertyFireEntity.getStringValueForField("LeakageAndOverflowing"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforLeakageandoverflowing")) {
				clearAndSendKeys(sIforLeakageandoverflowingTextField, riskCoverPropertyFireEntity.getStringValueForField("SIforLeakageandoverflowing"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForLeakageAndOverflowing")) {
				clearAndSendKeys(premiumForLeakageAndOverflowingTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumForLeakageAndOverflowing"));
			}
						
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigFireFightingExpenses")) {
				selectValueFromList(fireFightingExpensesDropdown, riskCoverPropertyFireEntity.getStringValueForField("FireFightingExpenses"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForFireFightingExpenses")) {
				clearAndSendKeys(sIForFireFightingExpensesTextField, riskCoverPropertyFireEntity.getStringValueForField("SIForFireFightingExpenses"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForFireFightingExpenses")) {
				clearAndSendKeys(premiumForFireFightingExpensesTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumForFireFightingExpenses"));
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigContaminationAndCoMinglingofstock")) {
				selectValueFromList(contaminationAndCoMinglingofstockDropdown, riskCoverPropertyFireEntity.getStringValueForField("ContaminationAndCoMinglingofstock"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForContaminationAndCoMinglingOfStock")) {
				clearAndSendKeys(sIForContaminationAndCoMinglingOfStockTextField, riskCoverPropertyFireEntity.getStringValueForField("SIForContaminationAndCoMinglingOfStock"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforContaminationAndCoMinglingOfStock")) {
				clearAndSendKeys(premiumforContaminationAndCoMinglingOfStockTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumforContaminationAndCoMinglingOfStock"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCatalystsAndConsumablesInterestInProcess")) {
				selectValueFromList(catalystsAndConsumablesInterestInProcessDropdown, riskCoverPropertyFireEntity.getStringValueForField("CatalystsAndConsumablesInterestInProcess"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforCatalystsandconsumablesinterestinprocess")) {
				clearAndSendKeys(sIforCatalystsandconsumablesinterestinprocessTextField, riskCoverPropertyFireEntity.getStringValueForField("SIforCatalystsandconsumablesinterestinprocess"));
			}
		
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforCatalystsandconsumables")) {
				clearAndSendKeys(premiumforCatalystsandconsumablesTestField, riskCoverPropertyFireEntity.getStringValueForField("PremiumforCatalystsandconsumables"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInlandTransit")) {
				selectValueFromList(inlandTransitDropdown, riskCoverPropertyFireEntity.getStringValueForField("InlandTransit"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforInlandTransit")) {
				clearAndSendKeys(sIforInlandTransitTextField, riskCoverPropertyFireEntity.getStringValueForField("SIforInlandTransit"));
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforInlandTransit")) {
				clearAndSendKeys(premiumforInlandTransitTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumforInlandTransit"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExpeditingLoss")) {
				selectValueFromList(expeditingLossDropdown, riskCoverPropertyFireEntity.getStringValueForField("ExpeditingLoss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforExpeditingloss")) {
				clearAndSendKeys(sIforExpeditinglossTextField, riskCoverPropertyFireEntity.getStringValueForField("SIforExpeditingloss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforExpeditingloss")) {
				clearAndSendKeys(premiumforExpeditinglossTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumforExpeditingloss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigReinstatementOfSIFollowingLoss")) {
				selectValueFromList(reinstatementOfSIFollowingLossDropdown, riskCoverPropertyFireEntity.getStringValueForField("ReinstatementOfSIFollowingLoss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigImmediateRepairs")) {
				selectValueFromList(immediateRepairsDropdown, riskCoverPropertyFireEntity.getStringValueForField("ImmediateRepairs"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForImmediateRepairs")) {
				clearAndSendKeys(sIForImmediateRepairsTextField, riskCoverPropertyFireEntity.getStringValueForField("SIForImmediateRepairs"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForImmediateRepairs")) {
				clearAndSendKeys(premiumForImmediateRepairsTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumForImmediateRepairs"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPropertyInCourseOfConstruction")) {
				selectValueFromList(propertyInCourseOfConstructionDropdown, riskCoverPropertyFireEntity.getStringValueForField("PropertyInCourseOfConstruction"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHirePurchaseAndLeaseAgreement")) {
				selectValueFromList(hirePurchaseAndLeaseAgreementDropdown, riskCoverPropertyFireEntity.getStringValueForField("HirePurchaseAndLeaseAgreement"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCapitalAddition")) {
				selectValueFromList(capitalAdditionDropdown, riskCoverPropertyFireEntity.getStringValueForField("CapitalAddition"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPropertyOutsideAwayFromPremises")) {
				selectValueFromList(propertyOutsideAwayFromPremisesDropdown, riskCoverPropertyFireEntity.getStringValueForField("PropertyOutsideAwayFromPremises"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTemporaryRemovalIndia")) {
				selectValueFromList(temporaryRemovalIndiaDropdown, riskCoverPropertyFireEntity.getStringValueForField("TemporaryRemovalIndia"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExpensesToMinimizeLoss")) {
				selectValueFromList(expensesToMinimizeLossDropdown, riskCoverPropertyFireEntity.getStringValueForField("ExpensesToMinimizeLoss"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeliberateDamage")) {
				selectValueFromList(deliberateDamageDropdown, riskCoverPropertyFireEntity.getStringValueForField("DeliberateDamage"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigComputerSystemRecords")) {
				selectValueFromList(computerSystemRecordsDropdown, riskCoverPropertyFireEntity.getStringValueForField("ComputerSystemRecords"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigVesselImpactToJetty")) {
				selectValueFromList(vesselImpactToJettyDropdown, riskCoverPropertyFireEntity.getStringValueForField("VesselImpactToJetty"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCustomerSuppliersAndUtilities")) {
				selectValueFromList(customerSuppliersAndUtilitiesDropdown, riskCoverPropertyFireEntity.getStringValueForField("CustomerSuppliersAndUtilities"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDenialOfAccessandPortBlockage")) {
				selectValueFromList(denialOfAccessandPortBlockageDropdown, riskCoverPropertyFireEntity.getStringValueForField("DenialOfAccessandPortBlockage"));
			}
         //Chintan
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1011")) {
				clearAndSendKeys(SumInsuredAddOn1011TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1011"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1012")) {
				clearAndSendKeys(SumInsuredAddOn1012TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1012"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1112")) {
				clearAndSendKeys(SumInsuredAddOn1112TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1112"));
			}
		    //nilesh	
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredDualBas")) {
				clearAndSendKeys(sumInsuredDualBasisTextField, riskCoverPropertyFireEntity.getStringValueForField("sumInsuredDualBas"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumDualBasis")) {
				clearAndSendKeys(premiumDualBasisTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumDualBasis"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredProrata")) {
				clearAndSendKeys(sumInsuredProrata, riskCoverPropertyFireEntity.getStringValueForField("sumInsuredProrata"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumProrata")) {
				clearAndSendKeys(premiumProrataTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumProrata"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredLayOff")) {
				clearAndSendKeys(sumInsuredLayOffTextField, riskCoverPropertyFireEntity.getStringValueForField("sumInsuredLayOff"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumLayOff")) {
				clearAndSendKeys(premiumLayOffTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumLayOff"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredAuditors")) {
				clearAndSendKeys(sumInsuredAuditorsTextField, riskCoverPropertyFireEntity.getStringValueForField("sumInsuredAuditors"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumAuditors")) {
				clearAndSendKeys(premiumAuditorsTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumAuditors"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCustPremises")) {
				clearAndSendKeys(premiumExtCustPremisesTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumExtCustPremises"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCustProprtyOtherSit")) {
				clearAndSendKeys(premiumExtCustProprtyOtherSitTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumExtCustProprtyOtherSit"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCoverSupplierPremises")) {
				clearAndSendKeys(premiumExtCoverSupplierPremisesTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumExtCoverSupplierPremises"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtelectGasWater")) {
				clearAndSendKeys(premiumExtelectGasWaterTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumExtelectGasWater"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtSpoilageConseqLoss")) {
				clearAndSendKeys(premiumExtSpoilageConseqLossTextField, riskCoverPropertyFireEntity.getStringValueForField("premiumExtSpoilageConseqLoss"));
			}
		    
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1111")) {
				clearAndSendKeys(sumInsuredAddOn1111TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1111"));
			}
		    //SF
		  
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1010")) {
				clearAndSendKeys(SumInsuredAddOn1010TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1010"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1013")) {
				clearAndSendKeys(SumInsuredAddOn1013TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1013"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1014")) {
				clearAndSendKeys(SumInsuredAddOn1014TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1014"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1015")) {
				clearAndSendKeys(SumInsuredAddOn1015TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1015"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1016")) {
				clearAndSendKeys(SumInsuredAddOn1016TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1016"));
			}
		    if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1110")) {
				clearAndSendKeys(SumInsuredAddOn1110TextField, riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1110"));
			}
		    
		    
		    
}
		else if(riskCoverPropertyFireEntity.getAction().equalsIgnoreCase("verify")){
			//shruti
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Yogesh
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCoverageCode")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("CoverageCode"), fetchValueFromFields(coverageCodeLabel), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCoverageName")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("CoverageName"), fetchValueFromFields(coverageNameLabel), AssertionType.WARNING);
			}
			//SHRUTI
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigRemovalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("RemovalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002"), fetchValueFromList(removalOfDebrisInexcessOf1PercentOfclaimAmountAddOn1002DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1002")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1002"), fetchValueFromTextFields(sumInsuredForAddOn1002TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigForestFireAddOn1005")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ForestFireAddOn1005"), fetchValueFromList(forestFireAddOn1005DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1005")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1005"), fetchValueFromTextFields(sumInsuredForAddOn1005TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigImpactDamageDueToInsuredsOwnRailRoadAddOn1006")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ImpactDamageDueToInsuredsOwnRailRoadAddOn1006"), fetchValueFromList(impactDamageDueToInsuredsOwnRailRoadVehiclesForkliftsCranesStackersAndTheLikeAndArticlesDroppedThereFromAddOn1006DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpontaneousCombustionAddOn1007")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SpontaneousCombustionAddOn1007"), fetchValueFromList(spontaneousCombustionAddOn1007DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMaterialClassificationForSpontaneousCombustion")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("MaterialClassificationForSpontaneousCombustion"), fetchValueFromList(materialClassificationForSpontaneousCombustionDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredOfRelativeCommodityForAddOn1007")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredOfRelativeCommodityForAddOn1007"), fetchValueFromTextFields(sumInsuredOfRelativeCommodityForAddOn1007TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigEarthquakeFireAndShockAddOn1009")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("EarthquakeFireAndShockAddOn1009"), fetchValueFromList(earthquakeFireAndShockAddOn1009DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTypeofRiskforTerrorismCover")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TypeofRiskforTerrorismCover"), fetchValueFromList(typeofRiskforTerrorismCoverDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWhetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasis")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("WhetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasis"), fetchValueFromList(whetherTerrorismCoverIsOptedUnderTerrorismPooloronStandAlonebasisDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDamageDueToSpillageOfMoltenmetalAddOn1018")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("DamageDueToSpillageOfMoltenmetalAddOn1018"), fetchValueFromList(damageDueToSpillageOfMoltenmetalAddOn1018DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1018")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1018"), fetchValueFromTextFields(sumInsuredForAddOn1018TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHouseBreakingClauseAddOn1019")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("HouseBreakingClauseAddOn1019"), fetchValueFromList(houseBreakingClauseAddOn1019DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpontaneousCombustionExtensionClauseAddOn1021")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SpontaneousCombustionExtensionClauseAddOn1021"), fetchValueFromList(spontaneousCombustionExtensionClauseAddOn1021DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartupExpensesUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("StartupExpensesUnderTerrorismExtension"), fetchValueFromList(startupExpensesUnderTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforStartupExpensesUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIforStartupExpensesUnderTerrorismExtension"), fetchValueFromTextFields(siforStartupExpensesUnderTerrorismExtensionTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAlternateAccommodationUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("AlternateAccommodationUnderTerrorismExtension"), fetchValueFromList(alternateAccommodationUnderTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForAlternateAccommodationUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForAlternateAccommodationUnderTerrorismExtension"), fetchValueFromTextFields(siForAlternateAccommodationUnderTerrorismExtensionTextField), AssertionType.WARNING);
			}
			//chintan
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1019")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1019"), fetchValueFromTextFields(sumInsuredForAddOn1019TextField), AssertionType.WARNING);
				}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1020")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForAddOn1020"), fetchValueFromTextFields(sumInsuredForAddOn1020TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBoilerExplosionDamageClauseAddOn1023")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("BoilerExplosionDamageClauseAddOn1023"), fetchValueFromList(boilerExplosionDamageClauseAddOn1023DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredforAddOn1023")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredforAddOn1023"), fetchValueFromTextFields(sumInsuredforAddOn1023TextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBoilerRate")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("BoilerRate"), fetchValueFromTextFields(boilerRateTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIscoverRequiredForWages")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("IscoverRequiredForWages"), fetchValueFromList(iscoverRequiredForWagesDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredForWages")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredForWages"), fetchValueFromTextFields(sumInsuredForWagesTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForWages")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumForWages"), fetchValueFromTextFields(premiumForWagesTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedPropertyiesAgainstLossAddOn1022")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InsuranceOfSpecifiedPropertyiesAgainstLossAddOn1022"), fetchValueFromList(insuranceOfSpecifiedPropertyiesAgainstLossOrDamagedDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigOmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("OmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008"), fetchValueFromTextFields(omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008TextField), AssertionType.WARNING);
			}

			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTemporaryRemovalOfStocksClauseAddOn1013")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TemporaryRemovalOfStocksClauseAddOn1013"), fetchValueFromTextFields(temporaryRemovalOfStocksClauseAddOn1013DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigElectricalApparatusClauseAddOn1020")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ElectricalApparatusClauseAddOn1020"), fetchValueFromTextFields(electricalApparatusClauseAddOn1020DropDown), AssertionType.WARNING);
			}
			//FD-Yogesh
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToAccidAddOn1003")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToAccidAddOn1003"), fetchValueFromList(deteriorationOfStocksInColdStoragePremisesDueToAccidentalPowerFailureConsequentToDamageAtThePremisesOfPowerStationDueToAnInsuredPerilAddOn1003DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutAddOn1004")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutAddOn1004"), fetchValueFromList(deteriorationOfStocksInColdStoragePremisesDueToChangeOfTemperatureArisingOutOfLossOrDamageToTheColdStorageMachineriesInTheInsuredsPremisesDueToOperationAddOn1004DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LeakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011"), fetchValueFromList(leakageAndContaminationCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1011DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LeakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012"), fetchValueFromList(leakageCoverWhereTheTanksAreWithinTheInsuredsOwnPremisesAddOn1012DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TerrorismAddOn1017"), fetchValueFromList(terrorismAddOn1017DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTypeOfRiskForTerrorismCover")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TypeOfRiskForTerrorismCover"), fetchValueFromList(typeOfRiskForTerrorismCoverDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111"), fetchValueFromList(leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageCoverWhereTanksAreLocatedElsewhereAddOn1112")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LeakageCoverWhereTanksAreLocatedElsewhereAddOn1112"), fetchValueFromList(leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHousebreakingClauseAddOn1019")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("HousebreakingClauseAddOn1019"), fetchValueFromList(housebreakingClauseAddOn1019DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactAddOn1022")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InsuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactAddOn1022"), fetchValueFromList(insuranceOfSpecifiedPropertyIesAgainstLossOrDamageDueToImpactByWaterBorneVesselsOrBodiesOrObjectsAddOn1022DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigShutdownOrStartUpExpensesClauseAddOn1024")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ShutdownOrStartUpExpensesClauseAddOn1024"), fetchValueFromList(shutdownOrStartUpExpensesClauseAddOn1024DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartUpExpensesUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("StartUpExpensesUnderTerrorismExtension"), fetchValueFromList(startUpExpensesUnderTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForStartUpExpensesUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForStartUpExpensesUnderTerrorismExtension"), fetchValueFromTextFields(sIForStartUpExpensesUnderTerrorismExtensionTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForAlternateAccommodationUnderTerrorismExtension")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForAlternateAccommodationUnderTerrorismExtension"), fetchValueFromTextFields(sIForAlternateAccommodationUnderTerrorismExtensionTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigRemovalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("RemovalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002"), fetchValueFromList(removalOfDebrisInExcessOfPercentOfClaimAmountAddOn1002DropDown), AssertionType.WARNING);
			}
			//SF
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpoilMatDamCovStocksInSpecBlocksAddOn1010")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SpoilMatDamCovStocksInSpecBlocksAddOn1010"), fetchValueFromList(spoilageMaterialDamageCoverForStocksInSpecifiedBlocksAddOn1010DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLossOfRentAddOn1014")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LossOfRentAddOn1014"), fetchValueFromList(lossOfRentAddOn1014DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsOfAddExpenOfRentForAnAlterAccomAddOn1015")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InsOfAddExpenOfRentForAnAlterAccomAddOn1015"), fetchValueFromList(insuranceOfAdditionalExpensesOfRentForAnAlternativeAccommodationAddOn1015DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigStartUpExpensesAddOn1016")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("StartUpExpensesAddOn1016"), fetchValueFromList(startUpExpensesAddOn1016DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSpoilMatDamCovMachContEquipInSpecBlocksAddOn1110")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SpoilMatDamCovMachContEquipInSpecBlocksAddOn1110"), fetchValueFromList(spoilageMaterialDamageCoverForMachineryContainersAndEquipmentsInSpecifiedBlocksAddOn1110DropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWheAnyExpressCondIsImpAppForThePolicy")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("WheAnyExpressCondIsImpAppForThePolicy"), fetchValueFromList(whetherAnyExpressConditionIsImposedAppliedForThePolicyDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDetails1OfExpressCondition")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("Details1OfExpressCondition"), fetchValueFromTextFields(details1OfExpressConditionTestArea), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDetails2OfExpressCondition")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("Details2OfExpressCondition"), fetchValueFromTextFields(details2OfExpressConditionTextArea), AssertionType.WARNING);
			}
			//LP
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWagesDualBasis")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("WagesDualBasis"), fetchValueFromList(wagesDualBasisDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWagesProRata")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("WagesProRata"), fetchValueFromList(wagesProRataDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLayOffRetrenchmentCompensation")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LayOffRetrenchmentCompensation"), fetchValueFromList(layOffRetrenchmentCompensationDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAuditorFee")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("AuditorFee"), fetchValueFromList(auditorFeeDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverInsuredPeril")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverInsuredPeril"), fetchValueFromList(extensionToCoverInsuredPerilDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverInsuredPropertyAtOtherSituations")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverInsuredPropertyAtOtherSituations"), fetchValueFromList(extensionToCoverInsuredPropertyAtOtherSituationsDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverSuppliersPremises")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverSuppliersPremises"), fetchValueFromList(extensionToCoverSuppliersPremisesDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverElectGasWaterWorks")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExtensionToCoverElectGasWaterWorks"), fetchValueFromList(extensionToCoverElectGasWaterWorksDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExtensionToCoverSpoilageConseqLoss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("extensionToCoverSpoilageConseqLoss"), fetchValueFromList(extensionToCoverSpoilageConseqLossDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTerrorismAddon")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("terrorismAddon"), fetchValueFromList(terrorismAddonDropDown), AssertionType.WARNING);
			}
			// Chintan SA

			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTotalSIForPropertyDamage")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TotalSIForPropertyDamage"), fetchValueFromTextFields(totalSIForPropertyDamageTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTotalSIForMachineryBreakdown")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TotalSIForMachineryBreakdown"), fetchValueFromTextFields(totalSIForMachineryBreakdownTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTotalSIForBusinessInterruptionFLOP")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TotalSIForBusinessInterruptionFLOP"), fetchValueFromTextFields(totalSIForBusinessInterruptionFLOPTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTotalSIForBusinessInterruptionMLOP")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TotalSIForBusinessInterruptionMLOP"), fetchValueFromTextFields(totalSIForBusinessInterruptionMLOPTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumIsGoingToBeCalculated")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumIsGoingToBeCalculated"), fetchValueFromList(premiumIsGoingToBeCalculatedDropDown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfiPropertyDamage")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PropertyDamage"), fetchValueFromTextFields(propertyDamageTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMachineryBreakdown")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("MachineryBreakdown"), fetchValueFromTextFields(machineryBreakdownTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBusinessInterruptionFLOP")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("BusinessInterruptionFLOP"), fetchValueFromTextFields(businessInterruptionFLOPTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForFLOP")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("IndemnityPeriodForFLOP"), fetchValueFromTextFields(indemnityPeriodForFLOPTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigIndemnityPeriodForMLOP")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("IndemnityPeriodForMLOP"), fetchValueFromTextFields(indemnityPeriodForMLOPTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigWhetherStockInsuredOnDeclarationBasis")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("WhetherStockInsuredOnDeclarationBasis"), fetchValueFromList(whetherStockInsuredOnDeclarationBasisDropDown), AssertionType.WARNING);
			}

			//PA

			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPublicAuthority")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PublicAuthority"), fetchValueFromList(publicAuthorityDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLeakageAndOverflowing")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("LeakageAndOverflowing"), fetchValueFromList(leakageAndOverflowingDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforLeakageandoverflowing")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIforLeakageandoverflowing"), fetchValueFromTextFields(sIforLeakageandoverflowingTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForLeakageAndOverflowing")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumForLeakageAndOverflowing"), fetchValueFromTextFields(premiumForLeakageAndOverflowingTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigFireFightingExpenses")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("FireFightingExpenses"), fetchValueFromList(fireFightingExpensesDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForFireFightingExpenses")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForFireFightingExpenses"), fetchValueFromTextFields(sIForFireFightingExpensesTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForFireFightingExpenses")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForFireFightingExpenses"), fetchValueFromTextFields(sIForFireFightingExpensesTextField), AssertionType.WARNING);
				clearAndSendKeys(premiumForFireFightingExpensesTextField, riskCoverPropertyFireEntity.getStringValueForField("PremiumForFireFightingExpenses"));
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigContaminationAndCoMinglingofstock")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ContaminationAndCoMinglingofstock"), fetchValueFromList(contaminationAndCoMinglingofstockDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForContaminationAndCoMinglingOfStock")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForContaminationAndCoMinglingOfStock"), fetchValueFromTextFields(sIForContaminationAndCoMinglingOfStockTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforContaminationAndCoMinglingOfStock")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumforContaminationAndCoMinglingOfStock"), fetchValueFromTextFields(premiumforContaminationAndCoMinglingOfStockTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCatalystsAndConsumablesInterestInProcess")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("CatalystsAndConsumablesInterestInProcess"), fetchValueFromList(catalystsAndConsumablesInterestInProcessDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforCatalystsandconsumablesinterestinprocess")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIforCatalystsandconsumablesinterestinprocess"), fetchValueFromTextFields(sIforCatalystsandconsumablesinterestinprocessTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforCatalystsandconsumables")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumforCatalystsandconsumables"), fetchValueFromTextFields(premiumforCatalystsandconsumablesTestField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInlandTransit")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("InlandTransit"), fetchValueFromList(inlandTransitDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforInlandTransit")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIforInlandTransit"), fetchValueFromTextFields(sIforInlandTransitTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforInlandTransit")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumforInlandTransit"), fetchValueFromTextFields(premiumforInlandTransitTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExpeditingLoss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExpeditingLoss"), fetchValueFromList(expeditingLossDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIforExpeditingloss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIforExpeditingloss"), fetchValueFromTextFields(sIforExpeditinglossTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumforExpeditingloss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumforExpeditingloss"), fetchValueFromTextFields(premiumforExpeditinglossTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigReinstatementOfSIFollowingLoss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ReinstatementOfSIFollowingLoss"), fetchValueFromList(reinstatementOfSIFollowingLossDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigImmediateRepairs")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ImmediateRepairs"), fetchValueFromList(immediateRepairsDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSIForImmediateRepairs")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SIForImmediateRepairs"), fetchValueFromTextFields(sIForImmediateRepairsTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumForImmediateRepairs")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PremiumForImmediateRepairs"), fetchValueFromTextFields(premiumForImmediateRepairsTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPropertyInCourseOfConstruction")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PropertyInCourseOfConstruction"), fetchValueFromList(propertyInCourseOfConstructionDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigHirePurchaseAndLeaseAgreement")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("HirePurchaseAndLeaseAgreement"), fetchValueFromList(hirePurchaseAndLeaseAgreementDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCapitalAddition")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("CapitalAddition"), fetchValueFromList(capitalAdditionDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPropertyOutsideAwayFromPremises")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("PropertyOutsideAwayFromPremises"), fetchValueFromList(propertyOutsideAwayFromPremisesDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigTemporaryRemovalIndia")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("TemporaryRemovalIndia"), fetchValueFromList(temporaryRemovalIndiaDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigExpensesToMinimizeLoss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ExpensesToMinimizeLoss"), fetchValueFromList(expensesToMinimizeLossDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDeliberateDamage")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("DeliberateDamage"), fetchValueFromList(deliberateDamageDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigComputerSystemRecords")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("ComputerSystemRecords"), fetchValueFromList(computerSystemRecordsDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigVesselImpactToJetty")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("VesselImpactToJetty"), fetchValueFromList(vesselImpactToJettyDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCustomerSuppliersAndUtilities")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("CustomerSuppliersAndUtilities"), fetchValueFromList(customerSuppliersAndUtilitiesDropdown), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDenialOfAccessandPortBlockage")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("DenialOfAccessandPortBlockage"), fetchValueFromList(denialOfAccessandPortBlockageDropdown), AssertionType.WARNING);
			}
			//nilesh
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredDualBas")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("sumInsuredDualBas"), fetchValueFromTextFields(sumInsuredDualBasisTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumDualBasis")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumDualBasis"), fetchValueFromTextFields(premiumDualBasisTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredProrata")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("sumInsuredProrata"), fetchValueFromTextFields(sumInsuredProrata), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumProrata")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumProrata"), fetchValueFromTextFields(premiumProrataTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredLayOff")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("sumInsuredLayOff"), fetchValueFromTextFields(sumInsuredLayOffTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumLayOff")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumLayOff"), fetchValueFromTextFields(premiumLayOffTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigsumInsuredAuditors")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("sumInsuredAuditors"), fetchValueFromTextFields(sumInsuredAuditorsTextField), AssertionType.WARNING);
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumAuditors")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumAuditors"), fetchValueFromTextFields(premiumAuditorsTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCustPremises")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumExtCustPremises"), fetchValueFromTextFields(premiumExtCustPremisesTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCustProprtyOtherSit")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumExtCustProprtyOtherSit"), fetchValueFromTextFields(premiumExtCustProprtyOtherSitTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtCoverSupplierPremises")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumExtCoverSupplierPremises"), fetchValueFromTextFields(premiumExtCoverSupplierPremisesTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtelectGasWater")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumExtelectGasWater"), fetchValueFromTextFields(premiumExtelectGasWaterTextField), AssertionType.WARNING);
			}
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigpremiumExtSpoilageConseqLoss")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("premiumExtSpoilageConseqLoss"), fetchValueFromTextFields(premiumExtSpoilageConseqLossTextField), AssertionType.WARNING);
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1011")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1011"), fetchValueFromTextFields(SumInsuredAddOn1011TextField), AssertionType.WARNING);
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1111")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1111"), fetchValueFromTextFields(sumInsuredAddOn1111TextField), AssertionType.WARNING);
				
			}
			
			if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1112")) {
				assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1112"), fetchValueFromTextFields(SumInsuredAddOn1112TextField), AssertionType.WARNING);
				
			}
			//SF
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1010")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1010"), fetchValueFromTextFields(SumInsuredAddOn1010TextField), AssertionType.WARNING);
				}
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1013")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1013"), fetchValueFromTextFields(SumInsuredAddOn1013TextField), AssertionType.WARNING);
				}
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1014")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1014"), fetchValueFromTextFields(SumInsuredAddOn1014TextField), AssertionType.WARNING);
				}
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1015")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1015"), fetchValueFromTextFields(SumInsuredAddOn1015TextField), AssertionType.WARNING);
				}
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1016")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1016"), fetchValueFromTextFields(SumInsuredAddOn1016TextField), AssertionType.WARNING);
				}
				if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSumInsuredAddOn1110")) {
					assertReference.assertEquals(riskCoverPropertyFireEntity.getStringValueForField("SumInsuredAddOn1110"), fetchValueFromTextFields(SumInsuredAddOn1110TextField), AssertionType.WARNING);
				}
		}
	}
	public void navigateToPolicy(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			
				riskCoverPropertyFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+riskCoverPropertyFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Risk Cover Property Fire Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(riskCoverPropertyFireTitle);	
			
		}
	}

	public void clickOnSaveButton(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			riskCoverPropertyFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+riskCoverPropertyFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Risk Cover Property Fire Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
	}
	public void clickOnBackButton(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigDetailsTab")) {
			click(attachCoveragesDetailTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
			click(attachCoveragesAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity){
		if (riskCoverPropertyFireEntity.getBooleanValueForField("ConfigPremiumTab")) {
			click(attachCoveragesPremiumTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}


	public void fillandSubmitPolicyInsuredIntrestRiskCoverPropertyFire(RiskCoverPropertyFireEntity riskCoverPropertyFireEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskCoverPropertyFireEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolInsIntAttachCovAttrRiskCoverPropertyFire(riskCoverPropertyFireEntity ,assertReference);	
			clickOnForwardButton(riskCoverPropertyFireEntity );
			clickOnSaveButton(riskCoverPropertyFireEntity);
			navigateToPolicy(riskCoverPropertyFireEntity );
			navigateToAttribute(riskCoverPropertyFireEntity );
			navigateToInsuredInterest(riskCoverPropertyFireEntity );
			navigateToCoverage(riskCoverPropertyFireEntity );
			navigateToLoan(riskCoverPropertyFireEntity );
			navigateToClientDetails(riskCoverPropertyFireEntity );
			navigateToRelation(riskCoverPropertyFireEntity );
			navigateToPayment(riskCoverPropertyFireEntity );
			navigateToFollowup(riskCoverPropertyFireEntity );
			navigateToDocument(riskCoverPropertyFireEntity );
			navigateToInsuredInterestDetails(riskCoverPropertyFireEntity );
			navigateToInsuredInterestAttributes(riskCoverPropertyFireEntity );
			navigateToInsuredInterestAttachCoverages(riskCoverPropertyFireEntity );
			navigateToInsuredInterestRelations(riskCoverPropertyFireEntity );
			navigateToInsuredInterestPayments(riskCoverPropertyFireEntity );
			navigateToPolicyAttachCoveragesDetails(riskCoverPropertyFireEntity);
			navigateToPolicyAttachCoveragesAttributes(riskCoverPropertyFireEntity);
			navigateToPolicyAttachCoveragesPremium(riskCoverPropertyFireEntity);
		}
	}	
}		



