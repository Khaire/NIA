package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsInttNetProFireEntity;

public class PolicyInsuredIntrestNetProfitFire extends BasePage {
	//Mayur_Product name=AR
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

	private PageElement	netProfitTextField;
	private PageElement	standingChargesTextField;
	private PageElement	grossrofitToBeInsuredTextField;
	private PageElement	anyOtherItemInsuredSeparatelyTextField;
	private PageElement	totalSumInsuredBITextField;
	private PageElement	excessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicyDropDown;
	private PageElement	voluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicyDropDown;
	private PageElement	applicableVoluntaryDeductibleDiscountForBusinessInterruptionTextField;
	//Mayur_Product name=DF
	private PageElement	riskCodeFireTextField;
	private PageElement	rateCodeFireTextField;
	private PageElement	probableMaximumLossPMLTextField;
	private PageElement	maximumPerLocationLimitSITextField;
	//Mayur_Product name=FD
	private PageElement	sumInsuredOfStocksTextField;
	private PageElement	sumInsuredOfStocksHeldInTrustTextField;
	private PageElement	totalSumInsuredAtTheLocationTextField;
	private PageElement	whetherSTFIPerilDeletedAtInceptionDropDown;
	private PageElement	whetherRSMDPerilDeletedAtInceptionDropDown;
	private PageElement	sTFIRevRateTextField;

	//PE-Yogesh
	private PageElement totalSumInsuredOfTheComplexExceedsRs50CroresDropDown;
	private PageElement sumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplexDropDown;
	private PageElement voluntaryDeductibleForRefineryAssetsRequiredDropDown;
	private PageElement refineryAssetsDeductibleLimitForEachAndEveryLossTextField;
	private PageElement voluntaryDeductibleForOtherThenRefineryAssetsRequiredDropDown;
	private PageElement otherThenRefineryAssetsDeductibleLimitForEachAndEveryLossTextField;
	private PageElement voluntaryDeductibleForAddOnCoversRequiredDropDown;
	private PageElement addOnCoversDeductibleLimitForEachAndEveryLossTextField;
	private PageElement voluntaryDeductibleForFidelityGuaranteeRequiredDropDown;
	private PageElement fidelityGuaranteeDeductibleLimitForEachAndEveryLossTextField;
	private PageElement voluntaryDeductibleForCashRequiredDropDown;
	private PageElement cashDeductibleLimitForEachAndEveryLossTextField;
	private PageElement totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField;
	private PageElement totalSumInsuredExcludingBuildingPlinthAndFoundationTextField;
	/*private PageElement whetherSTFIPerilDeletedAtInceptionDropDown;
	private PageElement whetherRSMDPerilDeletedAtInceptionDropDown;
	private PageElement sTFIRevRateTextField;*/

	//SF-Yogesh
	private PageElement yearOfConstructionDropDown;
	private PageElement yearOfOccupationDropDown;
	private PageElement typeOfConstructionFireDropDown;
	private PageElement sideWallsDropDown;
	private PageElement numberOfFloorsInTheOccupancyTextField;
	private PageElement insuredOccupancySituatedAtWhichFloorTextField;
	private PageElement isTheRiskLocatedInTheBasementDropDown;
	private PageElement detailsOfFireFightingArrangementsInTheBuildingTextField;
	private PageElement distanceFromTheNearestPublicFireBrigadeInKmsTextField;
	private PageElement approximateResponseTimeForArrivalOfPublicFireBrigadeInMinutesTextField;
	private PageElement ownedByTextField;
	private PageElement occupiedAsDropDown;
	private PageElement willThePremisesRemainUnoccupiedForMoreThan30DaysDropDown;
	private PageElement isTheBuildingCentrallyAirConditionedDropDown;
	private PageElement areTheDuctsCarryingCommonServicesMadeOfHazardousMaterialsDropDown;
	private PageElement doesTheBuildingHasLiftElevatorDropDown;
	private PageElement totalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundationsTextField;
	private PageElement totalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundationsTextField;
	private PageElement whetherContractPriceInsuranceClauseIsOptedDropDown;
	private PageElement typeOfInteriorDropDown;
	private PageElement falseCeilingMadeOfHazardousMaterialsDropDown;
	private PageElement partitionDecorationMadeOfHazardousMaterialDropDown;
	private PageElement falseCeilingMadeOfNonHazardousMaterialsDropDown;
	private PageElement partitionDecorationMadeOfNonHazardousMaterialDropDown;
	private PageElement electricalWiringsInConduitsCasingsDropDown;
	private PageElement concealedWiringDropDown;
	private PageElement looseWiringDropDown;
	private PageElement anyOtherPleaseGiveDetailsDropDown;
	private PageElement typeOfInteriorDetailsTextarea;
	//nilesh-LP
	private PageElement onGrossProfitsTextField;
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement whetherVoluntaryExcessOptedDropDown;
	private PageElement clausesOptedUnderBIPolicyDropDown;
	//lp digvijay
	private PageElement voluntaryDeductibleschosenForBIDropDown;

	private PageElement applicableVoluntaryDiscountTextField;

	public PolicyInsuredIntrestNetProfitFire(WebDriver driver, String pageName) {
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
		/////Title
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
		netProfitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Net Profit')]/following::input"), "Net Profit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standingChargesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Standing charges')]/following::input"), "Standing charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossrofitToBeInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Gross Profit to be insured')]/following::input"), "Gross Profit to be insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOtherItemInsuredSeparatelyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Any other item insured separately')]/following::input"), "Any other item insured separately TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredBITextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured(BI)')]/following::input"), "Total Sum Insured(BI) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Excess opted by the insured for Business Interruption section of IAR policy')]/following::select"), "Excess opted by the insured for Business Interruption section of IAR policy DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		voluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductibles chosen for Business Interruption section of IAR policy')]/following::select"), "Voluntary deductibles chosen for Business Interruption section of IAR policy DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		applicableVoluntaryDeductibleDiscountForBusinessInterruptionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Applicable Voluntary Deductible Discount for Business Interruption')]/following::input"), "Applicable Voluntary Deductible Discount for Business Interruption TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product name=DF
		riskCodeFireTextField= new PageElement(By.xpath("//td//div[contains(text(),'Risk Code (Fire)')]/following::input"), "Risk Code (Fire) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateCodeFireTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate Code (Fire)')]/following::input"), "Rate Code (Fire) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		probableMaximumLossPMLTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Probable Maximum Loss (PML)", "input")), "Probable Maximum Loss (PML) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumPerLocationLimitSITextField= new PageElement(By.xpath("//td//div[contains(text(),'Maximum Per Location Limit SI')]/following::input[1]"), "Probable Maximum Loss (PML) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_Product name=FD
		sumInsuredOfStocksTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Stocks')]/following::input"), "Sum Insured of Stocks TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOfStocksHeldInTrustTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured of Stocks held in Trust')]/following::input"), "Sum Insured of Stocks held in Trust TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredAtTheLocationTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured at the location')]/following::input"), "Total Sum Insured at the location TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherSTFIPerilDeletedAtInceptionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether STFI peril deleted at inception')]/following::select"), "Whether STFI peril deleted at inception DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherRSMDPerilDeletedAtInceptionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether RSMD Peril deleted at inception')]/following::select"), "Whether RSMD peril deleted at inception DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sTFIRevRateTextField= new PageElement(By.xpath("//td//div[contains(text(),'STFI(Rev rate)')]/following::input"), "STFI(Rev rate) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PE-Yogesh
		totalSumInsuredOfTheComplexExceedsRs50CroresDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Total Sum insured of the complex exceeds Rs 50 Crores')]/following::select"), "Total Sum insured of the complex exceeds Rs 50 Crores DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplexDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Sum insured of the petrochemical blocks exceed 35% of the total sum insured of the complex')]/following::select"), "Sum insured of the petrochemical blocks exceed 35% of the total sum insured of the complex DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		voluntaryDeductibleForRefineryAssetsRequiredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductible for refinery assets required')]/following::select"), "Voluntary deductible for refinery assets required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		refineryAssetsDeductibleLimitForEachAndEveryLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Refinery assets Deductible limit for each and every loss')]/following::input"), "Refinery assets Deductible limit for each and every lossTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryDeductibleForOtherThenRefineryAssetsRequiredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductible for other then refinery assets required')]/following::select"), "Voluntary deductible for other then refinery assets requiredDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherThenRefineryAssetsDeductibleLimitForEachAndEveryLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other then refinery assets Deductible limit for each and every loss')]/following::input"), "Other then refinery assets Deductible limit for each and every loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryDeductibleForAddOnCoversRequiredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductible for add-on covers required')]/following::select"), "Voluntary deductible for add-on covers required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addOnCoversDeductibleLimitForEachAndEveryLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Add-on covers Deductible limit for each and every loss')]/following::input"), "Add-on covers Deductible limit for each and every loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryDeductibleForFidelityGuaranteeRequiredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductible for fidelity guarantee required')]/following::select"), "Voluntary deductible for fidelity guarantee required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fidelityGuaranteeDeductibleLimitForEachAndEveryLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Fidelity guarantee Deductible limit for each and every loss')]/following::input"), "Fidelity guarantee Deductible limit for each and every loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryDeductibleForCashRequiredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductible for cash required')]/following::select"), "Voluntary deductible for cash required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cashDeductibleLimitForEachAndEveryLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cash Deductible limit for each and every loss')]/following::input"), "Cash Deductible limit for each and every loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured including Building plinth and foundations')]/following::input"), "Total Sum Insured including Building plinth and foundations TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredExcludingBuildingPlinthAndFoundationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured excluding Building Plinth and Foundation')]/following::input"), "Total Sum Insured excluding Building Plinth and Foundation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*whetherSTFIPerilDeletedAtInceptionDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Whether STFI peril deleted at inception')]/following::select"), "Whether STFI peril deleted at inception DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherRSMDPerilDeletedAtInceptionDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Whether RSMD Peril deleted at inception')]/following::select"), "Whether RSMD Peril deleted at inception DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sTFIRevRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'STFI(Rev rate)')]/following::input"), "STFI(Rev rate) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);*/
		//SF-Yogesh

		yearOfConstructionDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Year Of Construction')]/following::select"), "Year Of Construction DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfOccupationDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Year of occupation')]/following::select"), "Year of occupation DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfConstructionFireDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Type of Construction (Fire)')]/following::select"), "Type of Construction (Fire) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sideWallsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Side walls')]/following::select"), "Side walls DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfFloorsInTheOccupancyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of floors in the occupancy')]/following::input"), "Number of floors in the occupancy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredOccupancySituatedAtWhichFloorTextField=new PageElement(By.xpath("//td//div[contains(text(),'Insured Occupancy situated at which floor')]/following::input"), "Insured Occupancy situated at which floor TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheRiskLocatedInTheBasementDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Is the risk located in the basement')]/following::select"), "Is the risk located in the basement DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfFireFightingArrangementsInTheBuildingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Details of Fire fighting arrangements in the building')]/following::input"), "Details of Fire fighting arrangements in the building TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceFromTheNearestPublicFireBrigadeInKmsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Distance from the nearest public Fire Brigade (in Kms)')]/following::input"), "Distance from the nearest public Fire Brigade (in Kms) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		approximateResponseTimeForArrivalOfPublicFireBrigadeInMinutesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approximate response time for arrival of public fire brigade (in minutes)')]/following::input"), "Approximate response time for arrival of public fire brigade (in minutes) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownedByTextField=new PageElement(By.xpath("//td//div[contains(text(),'Owned By')]/following::input"), "Owned By TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupiedAsDropDown = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Occupied  As')]/following::select"), "Occupied As DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		willThePremisesRemainUnoccupiedForMoreThan30DaysDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Will the premises remain unoccupied for more than 30 days?')]/following::select"), "Will the premises remain unoccupied for more than 30 days? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isTheBuildingCentrallyAirConditionedDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Is the Building centrally Air-conditioned')]/following::select"), "Is the Building centrally Air-conditioned DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		areTheDuctsCarryingCommonServicesMadeOfHazardousMaterialsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Are the ducts carrying common services made of hazardous materials')]/following::select"), "Are the ducts carrying common services made of hazardous materials DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doesTheBuildingHasLiftElevatorDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Does the building has lift/elevator')]/following::select"), "Does the building has lift/elevator DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundationsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured including Compound Wall and including Building plinth and foundations')]/following::input"), "Total Sum Insured including Compound Wall and including Building plinth and foundations TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundationsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured including Compound Wall but excluding Building plinth and foundations')]/following::input"), "Total Sum Insured including Compound Wall but excluding Building plinth and foundations TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherContractPriceInsuranceClauseIsOptedDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Whether Contract Price Insurance Clause is opted')]/following::select"), "Whether Contract Price Insurance Clause is opted DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfInteriorDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Type of Interior')]/following::select"), "Type of Interior DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		falseCeilingMadeOfHazardousMaterialsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'False ceiling made of hazardous materials')]/following::select"), "False ceiling made of hazardous materials DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partitionDecorationMadeOfHazardousMaterialDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Partition/decoration made of hazardous material')]/following::select"), "Partition/decoration made of hazardous material DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		falseCeilingMadeOfNonHazardousMaterialsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'False ceiling made of non hazardous materials')]/following::select"), "False ceiling made of non hazardous materials DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partitionDecorationMadeOfNonHazardousMaterialDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Partition/decoration made of non hazardous material')]/following::select"), "Partition/decoration made of non hazardous material DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		electricalWiringsInConduitsCasingsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Electrical wirings in conduits / casings')]/following::select"), "Electrical wirings in conduits / casings DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		concealedWiringDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Concealed wiring')]/following::select"), "Concealed wiring DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		looseWiringDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Loose wiring')]/following::select"), "Loose wiring DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOtherPleaseGiveDetailsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Any other (Please give details)')]/following::select"), "Any other (Please give details) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfInteriorDetailsTextarea=new PageElement(By.xpath("//td//div[contains(text(),'Type of Interior details')]/following::textarea"), "Type of Interior details Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//nilesh-LP
		onGrossProfitsTextField=new PageElement(By.xpath("//td//div[contains(text(),'On Gross Profits')]/following::input"), "On Gross Profits", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period in months')]/following::input"), "Indemnity Period in months", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherVoluntaryExcessOptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Voluntary Excess opted')]/following::select"), "Whether Voluntary Excess opted Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		clausesOptedUnderBIPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Clauses opted under BI (Fire) policy')]/following::select"), "Clauses opted under BI (Fire) policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//lp digvijay
		voluntaryDeductibleschosenForBIDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductibles chosen for Business Interruption (LOP)')]/following::select"),"Voluntary deductibles chosen for Business Interruption", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		applicableVoluntaryDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable voluntary discount')]/following::input"),"Applicable voluntary discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void fillPolicyInsuredIntrestNetProfitFire(PolInsInttNetProFireEntity polInsInttNetProFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(polInsInttNetProFireEntity.getAction().equalsIgnoreCase("add") || polInsInttNetProFireEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=AR
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigNetProfit")) {
				clearAndSendKeys(netProfitTextField, polInsInttNetProFireEntity.getStringValueForField("NetProfit"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigStandingCharges")) {
				clearAndSendKeys(standingChargesTextField, polInsInttNetProFireEntity.getStringValueForField("StandingCharges"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigGrossrofitToBeInsured")) {
				clearAndSendKeys(grossrofitToBeInsuredTextField, polInsInttNetProFireEntity.getStringValueForField("GrossrofitToBeInsured"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAnyOtherItemInsuredSeparately")) {
				clearAndSendKeys(anyOtherItemInsuredSeparatelyTextField, polInsInttNetProFireEntity.getStringValueForField("AnyOtherItemInsuredSeparately"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredBI")) {
				clearAndSendKeys(totalSumInsuredBITextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredBI"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicy")) {
				selectValueFromList(excessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicyDropDown, polInsInttNetProFireEntity.getStringValueForField("ExcessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicy"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicy")) {
				selectValueFromList(voluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicyDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicy"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscountForBusinessInterruption")) {
				clearAndSendKeys(applicableVoluntaryDeductibleDiscountForBusinessInterruptionTextField, polInsInttNetProFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscountForBusinessInterruption"));
			}
			//Mayur_Product name=DF
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRiskCodeFire")) {
				clearAndSendKeys(riskCodeFireTextField, polInsInttNetProFireEntity.getStringValueForField("RiskCodeFire"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRateCodeFire")) {
				clearAndSendKeys(rateCodeFireTextField, polInsInttNetProFireEntity.getStringValueForField("RateCodeFire"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				clearAndSendKeys(probableMaximumLossPMLTextField, polInsInttNetProFireEntity.getStringValueForField("ProbableMaximumLossPML"));
			}
			//Mayur_Product name=FD
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfStocks")) {
				clearAndSendKeys(sumInsuredOfStocksTextField, polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfStocks"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfStocksHeldInTrus")) {
				clearAndSendKeys(sumInsuredOfStocksHeldInTrustTextField, polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfStocksHeldInTrust"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredAtTheLocation")) {
				clearAndSendKeys(totalSumInsuredAtTheLocationTextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredAtTheLocation"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherSTFIPerilDeletedAtInception")) {
				selectValueFromList(whetherSTFIPerilDeletedAtInceptionDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherSTFIPerilDeletedAtInception"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherRSMDPerilDeletedAtInception")) {
				selectValueFromList(whetherRSMDPerilDeletedAtInceptionDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherRSMDPerilDeletedAtInception"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSTFIRevRate")) {
				clearAndSendKeys(sTFIRevRateTextField, polInsInttNetProFireEntity.getStringValueForField("STFIRevRate"));
			}
			//PE-Yogesh
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredOfTheComplexExceedsRs50Crores")) {
				selectValueFromList(totalSumInsuredOfTheComplexExceedsRs50CroresDropDown, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredOfTheComplexExceedsRs50Crores"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplex")) {
				selectValueFromList(sumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplexDropDown, polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplex"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForRefineryAssetsRequired")) {
				selectValueFromList(voluntaryDeductibleForRefineryAssetsRequiredDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForRefineryAssetsRequired"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRefineryAssetsDeductibleLimitForEachAndEveryLoss")) {
				clearAndSendKeys(refineryAssetsDeductibleLimitForEachAndEveryLossTextField, polInsInttNetProFireEntity.getStringValueForField("RefineryAssetsDeductibleLimitForEachAndEveryLoss"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForOtherThenRefineryAssetsRequired")) {
				selectValueFromList(voluntaryDeductibleForOtherThenRefineryAssetsRequiredDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForOtherThenRefineryAssetsRequired"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOtherThenRefineryAssetsDeductibleLimitForEachAndEveryLoss")) {
				clearAndSendKeys(otherThenRefineryAssetsDeductibleLimitForEachAndEveryLossTextField, polInsInttNetProFireEntity.getStringValueForField("OtherThenRefineryAssetsDeductibleLimitForEachAndEveryLoss"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForAddOnCoversRequired")) {
				selectValueFromList(voluntaryDeductibleForAddOnCoversRequiredDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForAddOnCoversRequired"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAddOnCoversDeductibleLimitForEachAndEveryLoss")) {
				clearAndSendKeys(addOnCoversDeductibleLimitForEachAndEveryLossTextField, polInsInttNetProFireEntity.getStringValueForField("AddOnCoversDeductibleLimitForEachAndEveryLoss"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForFidelityGuaranteeRequired")) {
				selectValueFromList(voluntaryDeductibleForFidelityGuaranteeRequiredDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForFidelityGuaranteeRequired"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFidelityGuaranteeDeductibleLimitForEachAndEveryLoss")) {
				clearAndSendKeys(fidelityGuaranteeDeductibleLimitForEachAndEveryLossTextField, polInsInttNetProFireEntity.getStringValueForField("FidelityGuaranteeDeductibleLimitForEachAndEveryLoss"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForCashRequired")) {
				selectValueFromList(voluntaryDeductibleForCashRequiredDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForCashRequired"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigCashDeductibleLimitForEachAndEveryLoss")) {
				clearAndSendKeys(cashDeductibleLimitForEachAndEveryLossTextField, polInsInttNetProFireEntity.getStringValueForField("CashDeductibleLimitForEachAndEveryLoss"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingBuildingPlinthAndFoundations")) {
				clearAndSendKeys(totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingBuildingPlinthAndFoundations"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredExcludingBuildingPlinthAndFoundation")) {
				clearAndSendKeys(totalSumInsuredExcludingBuildingPlinthAndFoundationTextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredExcludingBuildingPlinthAndFoundation"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherSTFIPerilDeletedAtInception")) {
				selectValueFromList(whetherSTFIPerilDeletedAtInceptionDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherSTFIPerilDeletedAtInception"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherRSMDPerilDeletedAtInception")) {
				selectValueFromList(whetherRSMDPerilDeletedAtInceptionDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherRSMDPerilDeletedAtInception"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSTFIRevRate")) {
				clearAndSendKeys(sTFIRevRateTextField, polInsInttNetProFireEntity.getStringValueForField("STFIRevRate"));
			}
			//SF-Yogesh

			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigYearOfOccupation")) {
				selectValueFromList(yearOfOccupationDropDown, polInsInttNetProFireEntity.getStringValueForField("YearOfOccupation"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigYearOfConstruction")) {
				selectValueFromList(yearOfConstructionDropDown, polInsInttNetProFireEntity.getStringValueForField("YearOfConstruction"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfConstructionFire")) {
				selectValueFromList(typeOfConstructionFireDropDown, polInsInttNetProFireEntity.getStringValueForField("TypeOfConstructionFire"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSideWalls")) {
				selectValueFromList(sideWallsDropDown, polInsInttNetProFireEntity.getStringValueForField("SideWalls"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigNumberOfFloorsInTheOccupancy")) {
				clearAndSendKeys(numberOfFloorsInTheOccupancyTextField, polInsInttNetProFireEntity.getStringValueForField("NumberOfFloorsInTheOccupancy"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigInsuredOccupancySituatedAtWhichFloor")) {
				clearAndSendKeys(insuredOccupancySituatedAtWhichFloorTextField, polInsInttNetProFireEntity.getStringValueForField("InsuredOccupancySituatedAtWhichFloor"));
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIsTheRiskLocatedInTheBasement")) {
				selectValueFromList(isTheRiskLocatedInTheBasementDropDown, polInsInttNetProFireEntity.getStringValueForField("IsTheRiskLocatedInTheBasement"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDetailsOfFireFightingArrangementsInTheBuilding")) {
				clearAndSendKeys(detailsOfFireFightingArrangementsInTheBuildingTextField, polInsInttNetProFireEntity.getStringValueForField("DetailsOfFireFightingArrangementsInTheBuilding"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDistanceFromTheNearestPublicFireBrigadeInKms")) {
				clearAndSendKeys(distanceFromTheNearestPublicFireBrigadeInKmsTextField, polInsInttNetProFireEntity.getStringValueForField("DistanceFromTheNearestPublicFireBrigadeInKms"));
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApproximateResponseTimeForArrivalOfPublicFireBrigadeInMinutes")) {
				clearAndSendKeys(approximateResponseTimeForArrivalOfPublicFireBrigadeInMinutesTextField, polInsInttNetProFireEntity.getStringValueForField("ApproximateResponseTimeForArrivalOfPublicFireBrigadeInMinutes"));
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOwnedBy")) {
				clearAndSendKeys(ownedByTextField, polInsInttNetProFireEntity.getStringValueForField("OwnedBy"));
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOccupiedAs")) {
				selectValueFromList(occupiedAsDropDown, polInsInttNetProFireEntity.getStringValueForField("OccupiedAs"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWillThePremisesRemainUnoccupiedForMoreThan30Days")) {
				selectValueFromList(willThePremisesRemainUnoccupiedForMoreThan30DaysDropDown, polInsInttNetProFireEntity.getStringValueForField("WillThePremisesRemainUnoccupiedForMoreThan30Days"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIsTheBuildingCentrallyAirConditioned")) {
				selectValueFromList(isTheBuildingCentrallyAirConditionedDropDown, polInsInttNetProFireEntity.getStringValueForField("IsTheBuildingCentrallyAirConditioned"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAreTheDuctsCarryingCommonServicesMadeOfHazardousMaterials")) {
				selectValueFromList(areTheDuctsCarryingCommonServicesMadeOfHazardousMaterialsDropDown, polInsInttNetProFireEntity.getStringValueForField("AreTheDuctsCarryingCommonServicesMadeOfHazardousMaterials"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDoesTheBuildingHasLiftElevator")) {
				selectValueFromList(doesTheBuildingHasLiftElevatorDropDown, polInsInttNetProFireEntity.getStringValueForField("DoesTheBuildingHasLiftElevator"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundations")) {
				clearAndSendKeys(totalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundationsTextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundations"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundations")) {
				clearAndSendKeys(totalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundationsTextField, polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundations"));
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherContractPriceInsuranceClauseIsOpted")) {
				selectValueFromList(whetherContractPriceInsuranceClauseIsOptedDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherContractPriceInsuranceClauseIsOpted"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfInterior")) {
				selectValueFromList(typeOfInteriorDropDown, polInsInttNetProFireEntity.getStringValueForField("TypeOfInterior"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFalseCeilingMadeOfHazardousMaterials")) {
				selectValueFromList(falseCeilingMadeOfHazardousMaterialsDropDown, polInsInttNetProFireEntity.getStringValueForField("FalseCeilingMadeOfHazardousMaterials"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPartitionDecorationMadeOfHazardousMaterial")) {
				selectValueFromList(partitionDecorationMadeOfHazardousMaterialDropDown, polInsInttNetProFireEntity.getStringValueForField("PartitionDecorationMadeOfHazardousMaterial"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFalseCeilingMadeOfNonHazardousMaterials")) {
				selectValueFromList(falseCeilingMadeOfNonHazardousMaterialsDropDown, polInsInttNetProFireEntity.getStringValueForField("FalseCeilingMadeOfNonHazardousMaterials"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPartitionDecorationMadeOfNonHazardousMaterial")) {
				selectValueFromList(partitionDecorationMadeOfNonHazardousMaterialDropDown, polInsInttNetProFireEntity.getStringValueForField("PartitionDecorationMadeOfNonHazardousMaterial"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigElectricalWiringsInConduitsCasings")) {
				selectValueFromList(electricalWiringsInConduitsCasingsDropDown, polInsInttNetProFireEntity.getStringValueForField("ElectricalWiringsInConduitsCasings"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigConcealedWiring")) {
				selectValueFromList(concealedWiringDropDown, polInsInttNetProFireEntity.getStringValueForField("ConcealedWiring"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigLooseWiring")) {
				selectValueFromList(looseWiringDropDown, polInsInttNetProFireEntity.getStringValueForField("LooseWiring"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAnyOtherPleaseGiveDetails")) {
				selectValueFromList(anyOtherPleaseGiveDetailsDropDown, polInsInttNetProFireEntity.getStringValueForField("AnyOtherPleaseGiveDetails"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfInteriorDetails")) {
				clearAndSendKeys(typeOfInteriorDetailsTextarea, polInsInttNetProFireEntity.getStringValueForField("TypeOfInteriorDetails"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOnGrossProfits")) {
				clearAndSendKeys(onGrossProfitsTextField, polInsInttNetProFireEntity.getStringValueForField("OnGrossProfits"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, polInsInttNetProFireEntity.getStringValueForField("IndemnityPeriodInMonths"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherVoluntaryExcessOpted")) {
				selectValueFromList(whetherVoluntaryExcessOptedDropDown, polInsInttNetProFireEntity.getStringValueForField("WhetherVoluntaryExcessOpted"));
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigClausesOptUnderBIPolicy")) {
				selectValueFromList(clausesOptedUnderBIPolicyDropDown, polInsInttNetProFireEntity.getStringValueForField("ClausesOptUnderBIPolicy"));
			}
			//LP DIGVIJAY

			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleschosenForBI")) {
				selectValueFromList(voluntaryDeductibleschosenForBIDropDown, polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleschosenForBI"));
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
				Thread.sleep(2000);
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDiscount")) {
				clearAndSendKeys(applicableVoluntaryDiscountTextField, polInsInttNetProFireEntity.getStringValueForField("ApplicableVoluntaryDiscount"));
			}

			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMaximumPerLocationLimitSIText")) {
				clearAndSendKeys(maximumPerLocationLimitSITextField, polInsInttNetProFireEntity.getStringValueForField("MaximumPerLocationLimitSIText"));

			}

		}
		else if(polInsInttNetProFireEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsInttNetProFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Mayur_Product name=AR
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigNetProfit")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("NetProfit"), fetchValueFromTextFields(netProfitTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigStandingCharges")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("StandingCharges"), fetchValueFromTextFields(standingChargesTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigGrossrofitToBeInsured")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("GrossrofitToBeInsured"), fetchValueFromTextFields(grossrofitToBeInsuredTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAnyOtherItemInsuredSeparately")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("AnyOtherItemInsuredSeparately"), fetchValueFromTextFields(anyOtherItemInsuredSeparatelyTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredBI")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredBI"), fetchValueFromTextFields(totalSumInsuredBITextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigExcessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicy")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ExcessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicy"), fetchValueFromList(excessOptedByTheInsuredForBusinessInterruptionSectionOfIARPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicy")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicy"), fetchValueFromList(voluntaryDeductiblesChosenForBusinessInterruptionSectionOfIARPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDeductibleDiscountForBusinessInterruption")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ApplicableVoluntaryDeductibleDiscountForBusinessInterruption"), fetchValueFromTextFields(applicableVoluntaryDeductibleDiscountForBusinessInterruptionTextField), AssertionType.WARNING);
			}
			//Mayur_Product name=DF
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRiskCodeFire")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("RiskCodeFire"), fetchValueFromTextFields(riskCodeFireTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRateCodeFire")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("RateCodeFire"), fetchValueFromTextFields(rateCodeFireTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigProbableMaximumLossPML")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ProbableMaximumLossPML"), fetchValueFromTextFields(probableMaximumLossPMLTextField), AssertionType.WARNING);
				if(polInsInttNetProFireEntity.getStringValueForField("Product").equalsIgnoreCase("DF")){
					click(saveButton);
				}
		} 
			//Mayur_Product name=FD
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfStocks")) {
				String sumInsuredOfStocks = fetchValueFromTextFields(sumInsuredOfStocksTextField);
				String sumInsuredOfStock[] = sumInsuredOfStocks.split("\\.");
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfStocks"), sumInsuredOfStock[0], AssertionType.WARNING);
			}
			
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfStocksHeldInTrust")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfStocksHeldInTrust"), fetchValueFromTextFields(sumInsuredOfStocksHeldInTrustTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredAtTheLocation")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredAtTheLocation"), fetchValueFromTextFields(totalSumInsuredAtTheLocationTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherSTFIPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherSTFIPerilDeletedAtInception"), fetchValueFromList(whetherSTFIPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherRSMDPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherRSMDPerilDeletedAtInception"), fetchValueFromList(whetherRSMDPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSTFIRevRate")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("STFIRevRate"), fetchValueFromTextFields(sTFIRevRateTextField), AssertionType.WARNING);
			}
			//PE-Yogesh
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredOfTheComplexExceedsRs50Crores")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredOfTheComplexExceedsRs50Crores"),fetchValueFromList(totalSumInsuredOfTheComplexExceedsRs50CroresDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplex")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("SumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplex"),fetchValueFromList(sumInsuredOfThePetrochemicalBlocksExceed35OfTheTotalSumInsuredOfTheComplexDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForRefineryAssetsRequired")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForRefineryAssetsRequired"),fetchValueFromList(voluntaryDeductibleForRefineryAssetsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRefineryAssetsDeductibleLimitForEachAndEveryLoss")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("RefineryAssetsDeductibleLimitForEachAndEveryLoss"),fetchValueFromTextFields(refineryAssetsDeductibleLimitForEachAndEveryLossTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForOtherThenRefineryAssetsRequired")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForOtherThenRefineryAssetsRequired"),fetchValueFromList(voluntaryDeductibleForOtherThenRefineryAssetsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOtherThenRefineryAssetsDeductibleLimitForEachAndEveryLoss")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("OtherThenRefineryAssetsDeductibleLimitForEachAndEveryLossTextfield"),fetchValueFromTextFields(otherThenRefineryAssetsDeductibleLimitForEachAndEveryLossTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForAddOnCoversRequired")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForAddOnCoversRequired"),fetchValueFromList(voluntaryDeductibleForAddOnCoversRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAddOnCoversDeductibleLimitForEachAndEveryLoss ")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("AddOnCoversDeductibleLimitForEachAndEveryLoss"),fetchValueFromTextFields(addOnCoversDeductibleLimitForEachAndEveryLossTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForFidelityGuaranteeRequired")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForFidelityGuaranteeRequired"),fetchValueFromList(voluntaryDeductibleForFidelityGuaranteeRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFidelityGuaranteeDeductibleLimitForEachAndEveryLoss")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("FidelityGuaranteeDeductibleLimitForEachAndEveryLoss"),fetchValueFromTextFields(fidelityGuaranteeDeductibleLimitForEachAndEveryLossTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleForCashRequired")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleForCashRequired"),fetchValueFromList(voluntaryDeductibleForCashRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigCashDeductibleLimitForEachAndEveryLoss")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("CashDeductibleLimitForEachAndEveryLoss"),fetchValueFromTextFields(cashDeductibleLimitForEachAndEveryLossTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingBuildingPlinthAndFoundations")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingBuildingPlinthAndFoundations"),fetchValueFromTextFields(totalSumInsuredIncludingBuildingPlinthAndFoundationsTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredExcludingBuildingPlinthAndFoundation")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredExcludingBuildingPlinthAndFoundation"),fetchValueFromTextFields(totalSumInsuredExcludingBuildingPlinthAndFoundationTextField), AssertionType.WARNING);
			}
			/*	if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherSTFIPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherSTFIPerilDeletedAtInception"),fetchValueFromList(whetherSTFIPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherRSMDPerilDeletedAtInception")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherRSMDPerilDeletedAtInception"),fetchValueFromList(whetherRSMDPerilDeletedAtInceptionDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSTFIRevRateTextfield")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("STFIRevRateTextfield"),fetchValueFromTextFields(sTFIRevRateTextField), AssertionType.WARNING);
			}*/
			//SF-Yogesh
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigYearOfOccupation")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("YearOfOccupation"),fetchValueFromList(yearOfOccupationDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigYearOfConstruction")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("YearOfConstruction"),fetchValueFromList(yearOfConstructionDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfConstructionFire")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TypeOfConstructionFire"),fetchValueFromList(typeOfConstructionFireDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSideWalls")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("SideWalls"),fetchValueFromList(sideWallsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigNumberOfFloorsInTheOccupancy")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("NumberOfFloorsInTheOccupancy"),fetchValueFromTextFields(numberOfFloorsInTheOccupancyTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigInsuredOccupancySituatedAtWhichFloor")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("InsuredOccupancySituatedAtWhichFloor"),fetchValueFromTextFields(insuredOccupancySituatedAtWhichFloorTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIsTheRiskLocatedInTheBasement")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("IsTheRiskLocatedInTheBasement"),fetchValueFromList(isTheRiskLocatedInTheBasementDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDetailsOfFireFightingArrangementsInTheBuilding")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("DetailsOfFireFightingArrangementsInTheBuilding"),fetchValueFromTextFields(detailsOfFireFightingArrangementsInTheBuildingTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDistanceFromTheNearestPublicFireBrigadeInKms")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("DistanceFromTheNearestPublicFireBrigadeInKms"),fetchValueFromTextFields(distanceFromTheNearestPublicFireBrigadeInKmsTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApproximateResponseTimeForArrivalOfPublicFireBrigadeInMinutes")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ApproximateResponseTimeForArrivalOfPublicFireBrigadeInMinutesTextfield"),fetchValueFromTextFields(approximateResponseTimeForArrivalOfPublicFireBrigadeInMinutesTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOwnedBy")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("OwnedBy"),fetchValueFromTextFields(ownedByTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOccupiedAs")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("OccupiedAs"),fetchValueFromList(occupiedAsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWillThePremisesRemainUnoccupiedForMoreThan30Days")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WillThePremisesRemainUnoccupiedForMoreThan30Days"),fetchValueFromList(willThePremisesRemainUnoccupiedForMoreThan30DaysDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIsTheBuildingCentrallyAirConditioned")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("IsTheBuildingCentrallyAirConditioned"),fetchValueFromList(isTheBuildingCentrallyAirConditionedDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAreTheDuctsCarryingCommonServicesMadeOfHazardousMaterials")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("AreTheDuctsCarryingCommonServicesMadeOfHazardousMaterials"),fetchValueFromList(areTheDuctsCarryingCommonServicesMadeOfHazardousMaterialsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDoesTheBuildingHasLiftElevator")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("DoesTheBuildingHasLiftElevator"),fetchValueFromList(doesTheBuildingHasLiftElevatorDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundations")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundations"),fetchValueFromTextFields(totalSumInsuredIncludingCompoundWallAndIncludingBuildingPlinthAndFoundationsTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTotalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundations")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TotalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundations"),fetchValueFromTextFields(totalSumInsuredIncludingCompoundWallButExcludingBuildingPlinthAndFoundationsTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherContractPriceInsuranceClauseIsOpted")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherContractPriceInsuranceClauseIsOpted"),fetchValueFromList(whetherContractPriceInsuranceClauseIsOptedDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfInterior")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TypeOfInterior"),fetchValueFromList(typeOfInteriorDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFalseCeilingMadeOfHazardousMaterials")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("FalseCeilingMadeOfHazardousMaterials"),fetchValueFromList(falseCeilingMadeOfHazardousMaterialsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPartitionDecorationMadeOfHazardousMaterial")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("PartitionDecorationMadeOfHazardousMaterial"),fetchValueFromList(partitionDecorationMadeOfHazardousMaterialDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFalseCeilingMadeOfNonHazardousMaterials")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("FalseCeilingMadeOfNonHazardousMaterials"),fetchValueFromList(falseCeilingMadeOfNonHazardousMaterialsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPartitionDecorationMadeOfNonHazardousMaterial")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("PartitionDecorationMadeOfNonHazardousMaterial"),fetchValueFromList(partitionDecorationMadeOfNonHazardousMaterialDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigElectricalWiringsInConduitsCasings")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ElectricalWiringsInConduitsCasings"),fetchValueFromList(electricalWiringsInConduitsCasingsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigConcealedWiring")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ConcealedWiring"),fetchValueFromList(concealedWiringDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigLooseWiring")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("LooseWiring"),fetchValueFromList(looseWiringDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAnyOtherPleaseGiveDetails")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("AnyOtherPleaseGiveDetails"),fetchValueFromList(anyOtherPleaseGiveDetailsDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigTypeOfInteriorDetails")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("TypeOfInteriorDetails"),fetchValueFromTextFields(typeOfInteriorDetailsTextarea), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigOnGrossProfits")) {
				String onGrossProfits[] = fetchValueFromTextFields(onGrossProfitsTextField).toString().split("\\.");
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("OnGrossProfits"),onGrossProfits[0], AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("IndemnityPeriodInMonths"),fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigWhetherVoluntaryExcessOpted")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("WhetherVoluntaryExcessOpted"),fetchValueFromList(whetherVoluntaryExcessOptedDropDown), AssertionType.WARNING);
			}
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigClausesOptUnderBIPolicy")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ClausesOptUnderBIPolicy"),fetchValueFromList(clausesOptedUnderBIPolicyDropDown), AssertionType.WARNING);
			}
			//LP DIGVIJAY

			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigVoluntaryDeductibleschosenForBI")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("VoluntaryDeductibleschosenForBI"), fetchValueFromList(voluntaryDeductibleschosenForBIDropDown), AssertionType.WARNING);
			}	
			if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigApplicableVoluntaryDiscount")) {
				assertReference.assertEquals(polInsInttNetProFireEntity.getStringValueForField("ApplicableVoluntaryDiscount"), fetchValueFromTextFields(applicableVoluntaryDiscountTextField), AssertionType.WARNING);
			}



		}
	}

	public void navigateToPolicy(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigForwordButton")){
			click(forwardButton);
			try{
				if(!(polInsInttNetProFireEntity.getStringValueForField("Product").equalsIgnoreCase("FD"))) {
					acceptAlertAndReturnConfirmationMessage();
				}
				/*switchToWindow();
				driver.close();
				switchToWindow();*/
			}catch(Exception e){}
			switchToFrame("display");
			PageElement polInsInttNetProFireTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polInsInttNetProFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Insured Intrest Net Profit Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(polInsInttNetProFireTitle);
		}
	}
	public void clickOnBackButton(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnSaveButton(PolInsInttNetProFireEntity polInsInttNetProFireEntity){
		if (polInsInttNetProFireEntity.getBooleanValueForField("ConfigSaveButton")){
			if(polInsInttNetProFireEntity.getStringValueForField("Product").equalsIgnoreCase("FD")||polInsInttNetProFireEntity.getStringValueForField("Product").equalsIgnoreCase("SA")){
				clearAndSendKeys(probableMaximumLossPMLTextField, polInsInttNetProFireEntity.getStringValueForField("ProbableMaximumLossPML"));
				click(forwardButton);
			}
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyInsuredIntrestNetProfitFire(PolInsInttNetProFireEntity polInsInttNetProFireEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsInttNetProFireEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestNetProfitFire(polInsInttNetProFireEntity ,assertReference);	
			clickOnForwardButton(polInsInttNetProFireEntity );
			if(polInsInttNetProFireEntity.getStringValueForField("Product").equalsIgnoreCase("LP")){
				click(forwardButton);
			}
			clickOnSaveButton(polInsInttNetProFireEntity);
			navigateToPolicy(polInsInttNetProFireEntity );
			navigateToAttribute(polInsInttNetProFireEntity );
			navigateToInsuredInterest(polInsInttNetProFireEntity );
			navigateToCoverage(polInsInttNetProFireEntity );
			navigateToLoan(polInsInttNetProFireEntity );
			navigateToClientDetails(polInsInttNetProFireEntity );
			navigateToRelation(polInsInttNetProFireEntity );
			navigateToPayment(polInsInttNetProFireEntity );
			navigateToFollowup(polInsInttNetProFireEntity );
			navigateToDocument(polInsInttNetProFireEntity );
			navigateToInsuredInterestDetails(polInsInttNetProFireEntity );
			navigateToInsuredInterestAttributes(polInsInttNetProFireEntity );
			navigateToInsuredInterestAttachCoverages(polInsInttNetProFireEntity );
			navigateToInsuredInterestRelations(polInsInttNetProFireEntity );
			navigateToInsuredInterestPayments(polInsInttNetProFireEntity );
		}
	}

}
