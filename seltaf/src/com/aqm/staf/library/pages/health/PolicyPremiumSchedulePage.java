package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyConditionsCreateEntity;
import com.aqm.staf.library.databin.PolicyPremiumScheduleEntity;

public class PolicyPremiumSchedulePage extends BasePage {
	private PageElement policyPremiumSchedulePageTitle;
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement grossPremium1Label; 
	private PageElement adjustmentsLabel;
	private PageElement serviceTaxLabel; 
	private PageElement netPremium1Label;
	private PageElement memberCodeLabel;  
	private PageElement memberSerialNoLabel; 
	private PageElement grossPremium2Label;  
	private PageElement discretionaryDiscountLabel;  
	private PageElement discretionaryLoadingLabel;  
	private PageElement netPremium2Label;  
	private PageElement limitsOfLiabilityLabel;  
	private PageElement descriptionTextArea; 
	private PageElement coverageCodeLabel;  
	private PageElement coverageLabel;  
	private PageElement basicPremiumTextField;
	private PageElement pABasicPremiumTextField;
	private PageElement mCBasicPremiumTextField;
	private PageElement manualLoadingTextField;
	private PageElement staffDiscountForMemberTextField;
	private PageElement manualDiscountTextField;  
	private PageElement calculatedPremiumTextField; 
	private PageElement premiumTextField;  
	private PageElement backButton;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement insuredInterestCode2Label;
	private PageElement insuredInterestSerialNo2Label;
	private PageElement grossPremium3Label;  
	private PageElement discretionaryDiscount1Label;  
	private PageElement discretionaryLoading1Label;  
	private PageElement netPremium3Label;  
	private PageElement limitsOfLiability1Label;  
	private PageElement description1TextArea; 
	private PageElement coverageCode1Label;  
	private PageElement coverage1Label; 
	private PageElement usdCurrencyValueTextField; 
	private PageElement basicPremiumRateTextField; 
	private PageElement premiumDiscountforCorporatePortalTextField; 

	//For Credit Shield
	private PageElement premiumRateTextField;
	private PageElement amountOfPremiumForPreCreditTextField;
	private PageElement loadingManualTextField;
	private PageElement discountManualTextField;

	private PageElement premiumForPHTextField;

	private PageElement premium1TextField;
	private PageElement calculatedPremium1TextField;

	//FP
	private PageElement annualSDCPremiumRateTextField;
	private PageElement sDCPremiumRateTextField;
	private PageElement loadingTextField;
	private PageElement discountTextField;

	//DC
	private PageElement discountCalculatedTextField;
	private PageElement loadingCalculatedTextField; 
	private PageElement specialDiscountTextField;
	private PageElement longtermDiscountpercentageTextField;
	private PageElement longtermDiscountTextField;
	private PageElement groupDiscountpercentageTextField;
	private PageElement groupDiscountTextField;

	//DK
	private PageElement extraPremiumTextField;

	//GP
	private PageElement specialDiscountinlieuOfAgencyCommissionTextField;
	private PageElement oldPumpsetLoadingPercentageTextField;;
	private PageElement oldPumpsetLoadingTextField;
	private PageElement noClaimDiscountPSTextField;

	//GR
	private PageElement shortPeriodRateApplicableTextField;

	//FOR JM PRODUCT EXTRA FIELDS START HERE//
	/* private PageElement loadingForHypertensionTextField;  
	private PageElement loadingForDiabetesTextField;  
	private PageElement healthClubDiscountTextField;  
	private PageElement loyaltyDiscountForMemberTextField;  
	private PageElement claimLoadingPercentageTextField;  
	private PageElement claimLoadingTextField;   	 	
	private PageElement refundPremiumForOMPPolicyTextField;*/  
	//For JM Product
	//Misc_Liability LOB
	//CO
	private PageElement shortPeriodFactorTextfield;
	private PageElement premiumForCOTextField;
	private PageElement adverseLoadingTextField;
	private PageElement refrigeratedPremiumTextField;
	private PageElement lolPremiumRateTextField;
	private PageElement loadingForHiredVehicleCoverTextField;
	private PageElement loadingForRSMDTextField;
	private PageElement loadingForShortageDueToTheftOrPilferageOfCargoTextField;
	private PageElement loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField;
	private PageElement loadingForBreakageTextField;
	private PageElement premiumOnTurnoverTextField;
	private PageElement voluntaryExcessDiscountTextField;
	//CT
	private PageElement addlPremiumTextField;
	//DO
	private PageElement loadingForoutsideboardpositionTextFieldTextField;
	private PageElement loadingForOutsidedirectorshipTextField;
	private PageElement loadingForSpousalextensionTextField;
	private PageElement loadingForLegalheirsandrepresentativesTextField;
	private PageElement loadingForEntitycoverageForsecuritiesTextField;
	private PageElement loadingForInitialpublicofferingTextField;
	private PageElement loadingForOtheradditionalextensionsTextField;
	private PageElement loadingForAcquisitionorMergerTextField;
	private PageElement loadingForCrisisCommunicationcoverTextField;
	private PageElement loadingForCourtAttendanceCostTextField;
	private PageElement loadingForRiskManagementTextField;
	private PageElement loadingForPollutiondefenseCostTextField;
	private PageElement loadingForEmploymentPracticeLiabilityTextField;
	private PageElement loadingForDirectorversusDirectorTextField;
	private PageElement loadingForShadowDirectorshipTextField;
	private PageElement loadingForAutoAcquisitionEmploymentpracticeLiabilityTextField;
	private PageElement loadingForAutoAcquisitionComputerCrimeInsuranceTextField;
	private PageElement loadingForDiscoveryPeriodTextField;
	private PageElement loadingForEntitycoverageForEPLITextField;
	//Chintan
	//Fire FD Yogesh
	private PageElement rateTextField;		
	private PageElement sTFIDeletionRateTextField;	
	private PageElement rSMDDeletionRateTextField; 		
	private PageElement basicRateTextField;	
	private PageElement earthquakeRateTextField;	
	private PageElement spontaneousCombustionRateTextField; 	
	private PageElement forestFireRateTextField; 	
	private PageElement terrorismRateTextField;
	private PageElement impactDamageRateTextField; 	
	private PageElement policyRateFireTextField;	
	private PageElement netBasicRateTextField; 	
	private PageElement netPolicyRateTextField;
	private PageElement maximumNetPolicyRateTextField;	
	private PageElement premiumUnderBasicPolicyTextField; 	
	private PageElement premiumForAddOn1002CoverTextField; 	
	private PageElement premiumForAddOn1017CoverTextField; 	
	private PageElement premiumForSTFIReverseTextField;	
	private PageElement totalPremiumForAllAddOnCoverExceptTerrorismTextField; 	
	private PageElement totalPremiumExcludingTerrorismCoverTextField; 	
	private PageElement totalPremiumIncludingVoluntaryDeductiblesTextField;	
	private PageElement totalPremiumIncludingDirectBusinessDiscountTextField; 	
	private PageElement totalPremiumIncludingTerrorismCoverTextField; 	
	private PageElement totalPremiumTextField;
	//Chintan
	private PageElement weightedAverageRateMDFireTextField;
	private PageElement weightedAverageRateMDMBTextField;
	private PageElement totalPremiumMDFireTextField;
	private PageElement totalPremiumMDMBTextField;
	private PageElement	totalPremiumMDSectionTextField;
	private PageElement	premiumMDIncludingVoluntaryDeductiblesTextField;
	private PageElement	bASISRateBIFireTextField;
	private PageElement	iARApplicableProfitsRateTextField;
	private PageElement	totalPremiumBIFireTextField;
	private PageElement	premiumBIIncludingVoluntaryDeductiblesTextField;
	private PageElement	premiumIARPolicyTextField;
	private PageElement	premiumIARPolicyIncludingIARDiscountTextField;
	private PageElement	premiumIARPolicyIncludingDirectDiscountTextField;
	private PageElement	totalPremiumIncludingTerrorismCoverTextFieldForFD;
	private PageElement	premiumforSTFIReverseTextField;
	//private PageElement	totalPremiumTextField;

	//LN
	private PageElement loadingForTurnoverTextField; 	


	//PI
	private PageElement sDCPremiumRatePITextField;
	private PageElement groupDiscountPITextField;
	private PageElement totalPremiumFireTextField;

	//Yogesh
	private PageElement totalPremiumSFFireTextField;
	private PageElement totalPremiumLPFireTextField;
	private PageElement profitRateLPFireTextField;
	private PageElement premiumUnderBasicBIFirePolicyTextField;
	private PageElement totalPremiumUnderBIFireExceptTerrorismCoverTextField;

	private PageElement premiumForNonPetrochemicalBlockTextField;
	private PageElement premiumForAddOn1019CoverTextField;
	private PageElement premiumForAddOn1020CoverTextField;
	private PageElement premiumForAddOn1021CoverTextField;
	private PageElement premiumForAddOn1022CoverTextField;
	private PageElement premiumForAddOn1023CoverTextField;
	private PageElement premiumForAddOn1024CoverTextField;
	private PageElement netLoadingTextField;
	private PageElement netDiscountTextField;
	private PageElement otherDiscountTextField;
	private PageElement floaterPolicyRateTextField;
	//BPPI
	private PageElement basicRateForBoilerPercentTextField;
	private PageElement stipulatedAgeForBasicRateTextField;
	private PageElement loadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField;
	private PageElement effectiveLoadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField;
	private PageElement loadingForBoilerInspectorCertificateIsNotRequiredTextField; 
	private PageElement basicRateWithTheInspAndAgeLoadingTextField;
	private PageElement netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField;
	private PageElement netBasicPremiumTextField;
	private PageElement calculatedPremiumBPPITextField;
	//WP
	private PageElement premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextField;
	private PageElement premiumAfterDiscountInLieuOfAgentCommissionTextField;

	//MB
	private PageElement basicRateforMachineryBreakdownPercentTextField;
	private PageElement higherExcessDiscountMBTextField;
	private PageElement rateAfterHigherExcessMBTextField;
	private PageElement techDiscountMachineTextField;
	private PageElement rateAfterTechDiscountMBTextField;
	private PageElement rateAfterTechDiscrDiscountTextField;
	private PageElement policyRateMBTextField;

	// CF

	private PageElement basicRateForCPMTextField;
	private PageElement basicRateUndergroundAndRailwayTrackLoadingCFTextField;
	private PageElement netRateAfterHigherExcessDiscountCFTextField;
	private PageElement higherExcessDiscountCFTextField;
	private PageElement earthQuakePremiumCFTextField;
	private PageElement basicPremiumOfSTFICoverCFTextField;
	private PageElement netBasicAndEarthquakePremiumCFTextField;

	// CM

	private PageElement earthquakeExtraTextField;


	//EF
	private PageElement deletionOfFireAndAlliedPerilsDiscountRateTextField ; 		
	private PageElement netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField ;	
	private PageElement netRateAfterHigherExcessDiscountTextField; 	
	private PageElement technicalDiscountRateTextField;	
	private PageElement netRateAfterTechnicalDiscountTextField; 	
	private PageElement discretionaryAndAdditonalDiscretionaryDiscountRateTextField; 	
	private PageElement netRateAfterAllDiscountsTextField; 	
	private PageElement basicPremiumOfSTFICoverTextField; 	
	private PageElement ratepercentForSTFICoverTextField ;	
	private PageElement earthQuakePremiumTextField ;	
	private PageElement discountInLieuOfAgentCommissionTextField;
	private PageElement totalSumInsuredTextField;

	//wr
	private PageElement warCoverPremiumTextField;

	//ER
	private PageElement	rate2monthsTextField;		
	private PageElement	rate10SubsequentMonthsTextField	;		
	private PageElement	rateExceeding12MonthsTextField 	;	
	private PageElement	rateTestingPeriodExtensionTextField;	
	private PageElement	excessPerClaimNormalTextField;	
	private PageElement	excessPerClaimTestingPeriodTextField ;	
	private PageElement	discountInEarthquakePremiumTextField ;	
	private PageElement	newExcessPerClaimNormalTextField;	
	private PageElement	newExcessPerClaimTestingPeriodTextField	;
	private PageElement	discountInPremiumTextField 	;
	private PageElement	basicRateNewMachineTextField 	;
	private PageElement	basicRateOldMachineTextField;	
	private PageElement	rateAfterPolicyHigherExcessNewTextField ;	
	private PageElement rateAfterPolicyHigherExcessOldTextField ;	
	private PageElement earthquakeEffectiveRateTextField ;
	private PageElement applicableEquakeRateAfterEquakeHigherExcessDisTextField ;	
	private PageElement eQpremiumTextField	;
	private PageElement totalPolicyRateTextField ;	
	private PageElement totalPolicyRateOldTextField	;
	private PageElement basicPremiumNewTextField 	;
	private PageElement basicPremiumOldTextField 	;
	private PageElement basicCoveragePremiumNewTextField;	
	private PageElement basicCoveragePremiumOldTextField	;
	private PageElement totalPremiumOldNewTextField	;
	private PageElement totalDiscountTechcommercialTextField;	
	private PageElement premiumAfterAllDiscountsTextField ;
	//FI FS SE akshata
	private PageElement discountAmountforDirectBusinessTextField;
	private PageElement premiumforSecICoverTextField;
	private PageElement premiumforMedicalExpensesTextField; 
	private PageElement premiumforPACoverfortheParentGuardianTextField;

	//HH GANESH
	private PageElement	basicPremiumSection1BTextField;
	private PageElement insuredInterestCodeSec2Label;
	private PageElement insuredInterestSerialNoSec2Label;
	private PageElement	grosspremiumSec2TextField;
	private PageElement	discretionaryDiscountSec2TextField;
	private PageElement	discretionaryloadingSec2TextField;
	private PageElement	limitsOfLiabilitySec2TextField;
	private PageElement coverageCodeSec2Label;  
	private PageElement coverageSec2Label; 
	private PageElement	basicPremiumSection2TextField;
	private PageElement	calculatedpremiumSection2TextField;
	private PageElement insuredInterestCodeSec3Label;
	private PageElement insuredInterestSerialNoSec3Label;
	private PageElement	grosspremiumSec3TextField;
	private PageElement	discretionaryDiscountSec3TextField;
	private PageElement	discretionaryloadingSec3TextField;
	private PageElement	limitsOfLiabilitySec3TextField;
	private PageElement coverageCodeSec3Label;  
	private PageElement coverageSec3Label; 
	private PageElement	basicPremiumSection3TextField;
	private PageElement	calculatedpremiumSection3TextField;
	private PageElement insuredInterestCodeSTDLabel;
	private PageElement insuredInterestSerialNoSTDLabel;
	private PageElement	grosspremiumSTDTextField;
	private PageElement	discretionaryDiscountSTDTextField;
	private PageElement	discretionaryloadingSTDTextField;
	private PageElement	limitsOfLiabilitySTDTextField;
	private PageElement coverageCodeSTDLabel;  
	private PageElement coverageSTDLabel; 
	private PageElement basicPremiumforSectionsTextFeild;
	private PageElement basicPremiumHHTextFeild;
	private PageElement calculatedpremiumHHTextFeild;

	//SH
	private PageElement	basicPremiumSection3SHTextField;
	private PageElement	calculatedpremiumSection3SHTextField;
	private PageElement	basicPremiumSection4TextField;
	private PageElement	calculatedpremiumSection4TextField;
	private PageElement insuredInterestCode5Label;
	private PageElement insuredInterestSerialNo5Label;
	private PageElement	grosspremium5TextField;
	private PageElement	discretionaryDiscount5TextField;
	private PageElement	discretionaryloading5TextField;
	private PageElement	limitsOfLiability5TextField;
	private PageElement coverageCode5Label;  
	private PageElement coverage5Label; 
	private PageElement basicPremiumforSectionsSHTextFeild;
	private PageElement basicPremiumSHTextFeild;
	private PageElement calculatedpremiumSHTextFeild;

	//JI
	private PageElement	premiumDGMRMDiscretionaryDiscountTextField;
	private PageElement	discountForGoodFeatureTextField;
	private PageElement	adverseClaimExperiencePremiumLoadingTextField;
	private PageElement	otherPremiumLoadingTextField;

	//YR
	private PageElement basicPremiumRateYRTextField;
	private PageElement sDCPremiumRateYRTextField;
	private PageElement loadingcalculatedYRTextField;	
	private PageElement lossesUnseasonalRainsandFrostPremiumRateTextField;	
	private PageElement discountcalculatedYRTextField ;	
	private PageElement lossesUnseasonalRainsandFrostPremiumTextField; 	
	private PageElement calculatedPremiumYRTextField;


	//BA

	private PageElement floaterExtraPremiumTextField;

	//BD

	private PageElement premiumforStockTradeTextField;
	private PageElement premiumGoodsTrustCommissionTextField;
	private PageElement basicPremiumTheftTextField;
	private PageElement basicPremiumOtherTextField;
	private PageElement basicPremiumTotalTextField;

	//BB
	private PageElement premiumforMoneyinPremisesTextField;
	private PageElement premiumforMoneyinTransitTextField; 
	private PageElement PremiumforAddOnCover1TextField; 
	private PageElement premiumforAddOnCover2TextField;
	private PageElement premiumforAddOnCover3TextField; 
	private PageElement premiumforAddOnCover4TextField;
	private PageElement premiumforAddOnCover5TextField;
	private PageElement staffLoadingAmountTextField;

	//Motor(ST)
	private PageElement firePerilPremiumRateLabel;
	private PageElement burglaryPerilPremiumRateLabel;
	private PageElement riotStrikePerilPremiumRateLabel;
	private PageElement earthquakePerilPremiumRateLabel;
	private PageElement floodStormPerilPremiumRateLabel;
	private PageElement accidentalPerilPremiumRateLabel;
	private PageElement maliciousPerilPremiumRateLabel;
	private PageElement terroristPerilPremiumRateLabel;
	private PageElement transitPerilPremiumRateLabel;
	private PageElement landslidePerilPremiumRateLabel;
	private PageElement odPremiumPercentageLabel;
	private PageElement additionalOdPremiumAmountLabel;
	private PageElement discountedAdditionalOdPremiumAmountLabel;
	private PageElement basicOdPremiumLabel;
	private PageElement imtRateOdPremiumPercentageLabel;
	private PageElement imtRateBasicOdPremiumLabel;
	private PageElement additionalPremiumForElectricalFittingLabel;
	private PageElement additionalPremiumForNonElectricalFittingLabel;
	private PageElement additionalPremiumForCngLpgLabel;
	private PageElement additionalPremiumForGvwAbove12000Label;
	private PageElement imtRateAdditionalPremiumForElectricalFittingLabel;
	private PageElement imtRateAdditionalPremiumForNonElectricalFittingLabel;
	private PageElement imtRateAdditionalPremiumForCngLpgLabel;
	private PageElement imtRateAdditionalPremiumForGvwAbove12000Label;
	private PageElement additionalPremiumForFibreGlassLabel;
	private PageElement odLoadingForGivingTuitionLabel;
	private PageElement loadingForExtensionOfGeographicalAreaLabel;
	private PageElement loadingForAdditionalTowingCoverageLabel;
	private PageElement loadingForInclusionOfOverturn;
	private PageElement loadingForRoadworthyConditionLabel;
	private PageElement loadingForIndemnityToHirersLabel;
	private PageElement additionalLoadingForCngLpgKitLabel;
	private PageElement additionalLoadingOnODPremiumLabel;
	private PageElement loadingForforeignEmbassyVehicleLabel;
	private PageElement loadingForInclusionOfImt23Label;
	private PageElement premiumDiscountForCorporatePortalLabel;
	private PageElement loadingForIMT34Label;
	private PageElement imtRateLoadingForForeignEmbassyLabel;
	private PageElement odPremiumForTrailerAttachedLabel;
	private PageElement imtRateOdPremiumForTrailerAttachedLabel;
	private PageElement calculatedDiscountOnUsedWithinOwnPremisesLabel;
	private PageElement calculatedNcbDiscountLabel;
	private PageElement imtRateCalculatedNcbDiscountLabel;
	private PageElement loadingForLaidUpCoverLabel;
	private PageElement calculatedOdPremiumLabel;
	private PageElement additionalLoadingForCvLabel;
	private PageElement basicTpPremiumLabel;
	private PageElement tpPremiumForTrailerAttachedLabel;
	private PageElement additionalLoadingOnTpPremiumLabel;
	private PageElement additionalPremiumForLlToPaidDriverLabel;
	private PageElement loadingForImt34Label;
	private PageElement compulsoryPaPremiumForOwnerDriverLabel;
	private PageElement paPremiumForPaidDriversCleanersConductorsLabels;
	private PageElement paPremiumForUnamedPersonsForCvLabel;
	private PageElement addLegalLiabilityToPaidDriverCleanerOrEmployeeLabel;
	private PageElement additionalTpPremiumForCngLpgLabel;
	private PageElement extensionOfGeographicalAreaPremiumLabel;
	private PageElement addLegalLiabilityToNonFarePayingPassengersLabel;
	private PageElement addLlUnderWcaForCarriageOfMoreThanSixEmployeesLabel;
	private PageElement addLlToPersonsEmployedForOpnLabel;
	private PageElement addLlToEmployesNonFarePayingPassengersLabel;
	private PageElement addLlToPaidDriverConductorCleanerEmployedForOprnLabel;
	private PageElement addLlToNonEmployesNonFarePayingPassengersLabel;
	private PageElement additionalPremiumForAmbulancesHearsesLabel;
	private PageElement calculatedTpPremiumLabel;
	private PageElement calculatedPremiumLabel;
	private PageElement totalDiscountOnUsedWithinOwnPremisesLabel;
	private PageElement totalNcbDiscountLabel;
	private PageElement totalOdPremiumLabel;
	private PageElement totalTpPremiumLabel;
	private PageElement premiumLabel;
	
	private PageElement CalculatedPremiumTW;
	private PageElement TotalODPremiumwithoutDDTW;
	private PageElement InsuredsdeclaredValueIDVforCover;
	
	private PageElement CommodityPremiumTextField; 
	private PageElement DutyValuePremiumTextField;
	private PageElement WARampSRCCPremiumforCommodityTextField;
	private PageElement WARampSRCCPremiumforDutyTextField;
	
	
	
	

	public PolicyPremiumSchedulePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		policyPremiumSchedulePageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Policy Premium Schedule')]"),"Policy Premium Schedule Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Policy')]/following::font"),"Policy No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Quote No")),"Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Status")),"Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Policyholder")),"Policyholder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Product")),"Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossPremium1Label = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Gross Premium")),"Gross Premium1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adjustmentsLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Adjustments")),"Adjustments Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serviceTaxLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Service Tax")),"Service Tax Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremium1Label = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Net Premium")),"Net Premium1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath("//td//em[contains(text(),'Member Code')]/following::td"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath("//td//em[contains(text(),'Member Serial No')]/following::td"),"Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossPremium2Label = new PageElement(By.xpath("//tr[2]//td//b[contains(text(),'Gross Premium')] /following::td"),"Gross Premium2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Discretionary Discount")),"Discretionary Discount Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryLoadingLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Discretionary Loading")),"Discretionary Loading Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremium2Label = new PageElement(By.xpath("//tr[3]//td//b[contains(text(),'Net Premium')] /following::td"),"Net Premium2 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiabilityLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Limits Of Liability")),"Limits Of Liability Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("pDescription"),"Desrciption Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050", "Coverage Code")),"Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageLabel = new PageElement(By.xpath("//td[4]//font//b[contains(text(),'Coverage')]/following::td"),"Coverag Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTextField = new PageElement(By.xpath(locatorforPanel("Basic Premium", "input")),"Basic Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pABasicPremiumTextField = new PageElement(By.xpath(locatorforPanel("PA Basic Premium ", "input")),"Basic Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		mCBasicPremiumTextField = new PageElement(By.xpath(locatorforPanel("MC Basic Premium", "input")),"Basic Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		manualLoadingTextField= new PageElement(By.xpath(locatorforPanel("Manual Loading", "input")),"Manual Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		staffDiscountForMemberTextField = new PageElement(By.xpath(locatorforPanel("Staff Discount for Member", "input")),"Staff Discount For Member Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		manualDiscountTextField = new PageElement(By.xpath(locatorforPanel("Manual Discount", "input")),"Manual Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumTextField = new PageElement(By.xpath(locatorforPanel("Calculated Premium", "input")),"Calculated Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumTextField = new PageElement(By.xpath("//td[4]//b[contains(text(),'Premium')] /following::input"),"Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForPHTextField = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr[15]/td/table/tbody/tr[4]/td[5]/font/input"),"Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"),"Back  Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredInterestCodeLabel = new PageElement(By.xpath("//b//em[contains(text(),'Insured Interest Code')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath("//b//em[contains(text(),'Insured Interest Serial No.')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCode2Label = new PageElement(By.xpath("//tr[9]//td//font//i//b//em[contains(text(),'Insured Interest Code')]/following::font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNo2Label = new PageElement(By.xpath("//tr[9]//td//font//i//b//em[contains(text(),'Insured Interest Serial No.')]/following::font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossPremium3Label = new PageElement(By.xpath("//tr[10]//td//b[contains(text(),'Gross Premium')] /following::font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscount1Label = new PageElement(By.xpath("//tr[10]//td[3]//b[contains(text(),'Discretionary Discount')] /following::td"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryLoading1Label = new PageElement(By.xpath("//tr[11]//td[1]//b[contains(text(),'Discretionary Loading')] /following::td"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremium3Label = new PageElement(By.xpath("//tr[11]//td[3]//b[contains(text(),'Net Premium')] /following::td"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiability1Label = new PageElement(By.xpath("//tr[12]//td[1]//b[contains(text(),'Limits Of Liability')] /following::font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		usdCurrencyValueTextField=new PageElement(By.xpath(locatorforPanel("USD Currency Value", "input")),"USD Currency Value TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Manual Discount')]/following::td[4]//font//input"),"Basic Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumDiscountforCorporatePortalTextField=new PageElement(By.xpath(locatorforPanel("Premium Discount for Corporate Portal", "input")),"Premium Discount for Corporate Portal TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//For Credit Shield
		premiumRateTextField =new PageElement(By.xpath("//table/tbody/tr[2]/td[3]/font/input"),"Premium rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountOfPremiumForPreCreditTextField =new PageElement(By.xpath("//table/tbody/tr[4]/td[3]/font/input"),"Amount of premium for Pre Credit Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingManualTextField =new PageElement(By.xpath("//table/tbody/tr[6]/td[3]/font/input"),"Loading manual Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountManualTextField =new PageElement(By.xpath("//table/tbody/tr[7]/td[3]/font/input"),"Discount manual Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//GH
		premium1TextField=new PageElement(By.xpath("//tr[15]//td[4]//b[contains(text(),'Premium')]/following::td/font/input"),"Premium 1 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremium1TextField=new PageElement(By.xpath("//tr[15]//td[2]//b[contains(text(),'Calculated Premium')]/following::td/font/input"),"calculated Premium 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCode1Label=new PageElement(By.xpath("//tr[15]//td[2]//b[contains(text(),'Coverage')] /following::td/font"),"coverage Code 1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverage1Label=new PageElement(By.xpath("//tr[15]//td[4]//b[contains(text(),'Coverage')] /following::td/font"),"coverage 1 Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//FP
		annualSDCPremiumRateTextField = new PageElement(By.xpath(locatorforPanel("Annual SDC Premium Rate", "input")),"Annual SDC Premium Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sDCPremiumRateTextField = new PageElement(By.xpath(locatorforPanel("SDC Premium Rate", "input")),"SDC Premium Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingTextField = new PageElement(By.xpath("//td[4]//b[contains(text(),'Loading')] /following::input"),"Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountTextField = new PageElement(By.xpath("//td[4]//b[contains(text(),'Discount')] /following::input"),"Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//DC

		discountCalculatedTextField=new PageElement(By.xpath(locatorforPanel("Discount calculated", "input")),"discount Calculated TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingCalculatedTextField=new PageElement(By.xpath(locatorforPanel("Loading calculated", "input")),"Loading calculated TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountTextField=new PageElement(By.xpath(locatorforPanel("Special Discount", "input")),"Special Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		longtermDiscountpercentageTextField=new PageElement(By.xpath(locatorforPanel("Long term discount (%)", "input")),"Long term discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		longtermDiscountTextField=new PageElement(By.xpath(locatorforPanel("Long Term Discount", "input")),"Long Term Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountpercentageTextField=new PageElement(By.xpath(locatorforPanel("Group Discount (%)", "input")),"Group Discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountTextField=new PageElement(By.xpath(locatorforPanel("Group Discount", "input")),"Group Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//DK
		extraPremiumTextField=new PageElement(By.xpath(locatorforPanel("Extra Premium", "input")),"Extra Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//GP
		specialDiscountinlieuOfAgencyCommissionTextField=new PageElement(By.xpath(locatorforPanel("Special discount in lieu of  Agency Commission", "input")),"Extra Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		oldPumpsetLoadingPercentageTextField=new PageElement(By.xpath(locatorforPanel("Old Pumpset Loading(%)", "input")),"Old Pumpset Loading(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		oldPumpsetLoadingTextField=new PageElement(By.xpath(locatorforPanel("Old Pumpset Loading", "input")),"Old Pumpset Loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noClaimDiscountPSTextField=new PageElement(By.xpath(locatorforPanel("No Claim Discount(PS)", "input")),"No Claim Discount(PS) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//GR
		shortPeriodRateApplicableTextField=new PageElement(By.xpath(locatorforPanel("Short Period Rate Applicable", "input")),"Short Period Rate Applicable TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//FOR JM PRODUCT EXTRA FIELDS START HERE//
		/*loadingForHypertensionTextField = new PageElement(By.xpath(locatorforPanel("Loading For Hypertension", "input")),"Loading For Hypertension Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDiabetesTextField = new PageElement(By.xpath(locatorforPanel("Loading For Diabetes", "input")),"Loading For Diabetes Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		healthClubDiscountTextField = new PageElement(By.xpath(locatorforPanel("Health Club Discount", "input")),"Health Club Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loyaltyDiscountForMemberTextField = new PageElement(By.xpath(locatorforPanel("Loyalty Discount for Member", "input")),"Loyalty Discount For MemberTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimLoadingPercentageTextField = new PageElement(By.xpath(locatorforPanel("Claim Loading(%)", "input")),"Claim Loading Percentage Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimLoadingTextField = new PageElement(By.xpath(locatorforPanel("Claim Loading", "input")),"Claim Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refundPremiumForOMPPolicyTextField = new PageElement(By.xpath(locatorforPanel("Refund Premium for OMP Policy", "input")),"Refund Premium For OMP Policy Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);*/

		//Misc_Liability
		//CO
		shortPeriodFactorTextfield= new PageElement(By.xpath(locatorforPanel("Short Period Factor", "input")),"Short Period Factor Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForCOTextField=new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr[7]/td/table/tbody/tr[4]/td[5]/font/input"),"Premium For CO Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adverseLoadingTextField= new PageElement(By.xpath(locatorforPanel("Adverse Loading", "input")),"Adverse Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refrigeratedPremiumTextField= new PageElement(By.xpath(locatorforPanel("Refrigerated Premium", "input")),"Refrigerated Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lolPremiumRateTextField= new PageElement(By.xpath(locatorforPanel("LOL Loading Rate", "input")),"Lol Premium Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForHiredVehicleCoverTextField= new PageElement(By.xpath(locatorforPanel("Loading for Hired Vehicle Cover", "input")),"Loading for Hired Vehicle Cover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForRSMDTextField= new PageElement(By.xpath(locatorforPanel("Loading for RSMD", "input")),"Loading for RSMD Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForShortageDueToTheftOrPilferageOfCargoTextField= new PageElement(By.xpath(locatorforPanel("Loading for Shortage due to theft or pilferage of cargo", "input")),"Loading for Shortage due to theft or pilferage of cargo  Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField= new PageElement(By.xpath(locatorforPanel("Loading for Flood or Water damage or damage by any other cargo", "input")),"Loading for Flood or Water damage or damage by any other cargo   Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForBreakageTextField= new PageElement(By.xpath(locatorforPanel("Loading for breakage", "input")),"Loading for breakage Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumOnTurnoverTextField= new PageElement(By.xpath(locatorforPanel("Premium on turnover", "input")),"Premium on turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voluntaryExcessDiscountTextField= new PageElement(By.xpath(locatorforPanel("Voluntary Excess Discount", "input")),"Voluntary Excess Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//CT
		addlPremiumTextField= new PageElement(By.xpath(locatorforPanel("Addl. Premium", "input")),"Addl. Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DO
		loadingForoutsideboardpositionTextFieldTextField= new PageElement(By.xpath(locatorforPanel("Loading for outside board position", "input")),"Loading for outside board position Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForOutsidedirectorshipTextField= new PageElement(By.xpath(locatorforPanel("Loading for Outside directorship", "input")),"Loading for Outside directorship Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForSpousalextensionTextField= new PageElement(By.xpath(locatorforPanel("Loading for Spousal extension", "input")),"Loading for Spousal extension Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForLegalheirsandrepresentativesTextField= new PageElement(By.xpath(locatorforPanel("Loading for Legal heirs and representatives", "input")),"Loading for Legal heirs and representatives Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForEntitycoverageForsecuritiesTextField= new PageElement(By.xpath(locatorforPanel("Loading for Entity coverage for securities", "input")),"Loading for Entity coverage for securities Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForInitialpublicofferingTextField= new PageElement(By.xpath(locatorforPanel("Loading for Initial public offering", "input")),"Loading for Initial public offering Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForOtheradditionalextensionsTextField= new PageElement(By.xpath(locatorforPanel("Loading for Other additional extensions", "input")),"Loading for Other additional extensions Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAcquisitionorMergerTextField= new PageElement(By.xpath(locatorforPanel("Loading for Acquisition or Merger", "input")),"Loading for Acquisition or Merger Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForCrisisCommunicationcoverTextField= new PageElement(By.xpath(locatorforPanel("Loading for Crisis Communication cover", "input")),"Loading for Crisis Communication cover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForCourtAttendanceCostTextField= new PageElement(By.xpath(locatorforPanel("Loading for Court Attendance Cost", "input")),"Loading for Court Attendance Cost Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForRiskManagementTextField= new PageElement(By.xpath(locatorforPanel("Loading for Risk Management", "input")),"Loading for Risk Management Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForPollutiondefenseCostTextField= new PageElement(By.xpath(locatorforPanel("Loading for Pollution defense Cost", "input")),"Loading for Pollution defense Cost Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForEmploymentPracticeLiabilityTextField= new PageElement(By.xpath(locatorforPanel("Loading for Employment Practice Liability", "input")),"Loading for Employment Practice Liability Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDirectorversusDirectorTextField= new PageElement(By.xpath(locatorforPanel("Loading for Director versus Director", "input")),"Loading for Director versus Director Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForShadowDirectorshipTextField= new PageElement(By.xpath(locatorforPanel("Loading for Shadow Directorship", "input")),"Loading for Shadow Directorship Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAutoAcquisitionEmploymentpracticeLiabilityTextField= new PageElement(By.xpath(locatorforPanel("Loading for Auto-acquisition Employment practice Liability", "input")),"Loading for Auto-acquisition Employment practice Liability Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAutoAcquisitionComputerCrimeInsuranceTextField= new PageElement(By.xpath(locatorforPanel("Loading for Auto-acquisition Computer Crime Insurance", "input")),"Loading for Auto-acquisition Computer Crime Insurance Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDiscoveryPeriodTextField= new PageElement(By.xpath(locatorforPanel("Loading for Discovery Period", "input")),"Loading for Discovery Period Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForEntitycoverageForEPLITextField= new PageElement(By.xpath(locatorforPanel("Loading for Entity coverage for EPLI", "input")),"Loading for Entity coverage for EPLI Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//FD -Fire
		rateTextField = new PageElement(By.xpath(locatorforPanel("Rate", "input")),"Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		sTFIDeletionRateTextField = new PageElement(By.xpath(locatorforPanel("STFI Deletion Rate", "input")),"STFI Deletion Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rSMDDeletionRateTextField = new PageElement(By.xpath(locatorforPanel("RSMD Deletion Rate", "input")),"RSMD Deletion Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 		
		basicRateTextField 	= new PageElement(By.xpath(locatorforPanel("Basic Rate", "input")),"Basic Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		earthquakeRateTextField = new PageElement(By.xpath(locatorforPanel("Earthquake Rate", "input")),"Earthquake Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		spontaneousCombustionRateTextField = new PageElement(By.xpath(locatorforPanel("Spontaneous combustion Rate", "input")),"Spontaneous combustion Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		forestFireRateTextField = new PageElement(By.xpath(locatorforPanel("Forest Fire Rate", "input")),"Forest Fire Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		terrorismRateTextField = new PageElement(By.xpath(locatorforPanel("Terrorism Rate", "input")),"Terrorism Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		impactDamageRateTextField = new PageElement(By.xpath(locatorforPanel("Impact Damage Rate", "input")),"Impact Damage Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		policyRateFireTextField = new PageElement(By.xpath(locatorforPanel("Policy Rate (Fire)", "input")),"Policy Rate (Fire) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		netBasicRateTextField = new PageElement(By.xpath(locatorforPanel("Net Basic Rate", "input")),"Net Basic Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		netPolicyRateTextField = new PageElement(By.xpath(locatorforPanel("Net Policy Rate", "input")),"Net Policy Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		maximumNetPolicyRateTextField = new PageElement(By.xpath(locatorforPanel("Maximum Net Policy Rate", "input")),"Maximum Net Policy Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		premiumUnderBasicPolicyTextField= new PageElement(By.xpath(locatorforPanel("Premium Under Basic Policy", "input")),"Premium Under Basic Policy Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);  	
		premiumForAddOn1002CoverTextField = new PageElement(By.xpath(locatorforPanel("Premium for Add On-1002 Cover", "input")),"Premium for Add On-1002 Cover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		premiumForAddOn1017CoverTextField = new PageElement(By.xpath(locatorforPanel("Premium for Add On-1017 Cover", "input")),"Premium for Add On-1017 Cover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);  	
		premiumForSTFIReverseTextField = new PageElement(By.xpath(locatorforPanel("Premium for STFI Reverse", "input")),"Premium for STFI Reverse Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		totalPremiumForAllAddOnCoverExceptTerrorismTextField= new PageElement(By.xpath(locatorforPanel("Total Premium for All Add On Cover (Except Terrorism)", "input")),"Total Premium for All Add On Cover (Except Terrorism) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		totalPremiumExcludingTerrorismCoverTextField = new PageElement(By.xpath(locatorforPanel("Total Premium ( Excluding Terrorism Cover )", "input")),"Total Premium ( Excluding Terrorism Cover ) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		totalPremiumIncludingVoluntaryDeductiblesTextField = new PageElement(By.xpath(locatorforPanel("Total Premium ( Including Voluntary Deductibles )", "input")),"Total Premium ( Including Voluntary Deductibles ) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		totalPremiumIncludingDirectBusinessDiscountTextField = new PageElement(By.xpath(locatorforPanel("Total Premium ( Including Direct Business Discount )", "input")),"Total Premium ( Including Direct Business Discount ) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		totalPremiumIncludingTerrorismCoverTextFieldForFD  = new PageElement(By.xpath("//td//b[contains(text(),'Total Premium ( Including Direct Business Discount )')] /following::input[2]"),"Total Premium ( Including Terrorism Cover ) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		totalPremiumTextField  = new PageElement(By.xpath(locatorforPanel("Total Premium", "input")),"Total Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Chintan
		weightedAverageRateMDFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Weighted Average Rate MD(Fire)')] /following::input"),"Weighted Average Rate MD(Fire)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		weightedAverageRateMDMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Weighted Average Rate MD(MB)')] /following::input"),"Weighted Average Rate MD(MB) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumMDFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium MD(Fire)')] /following::input"),"Total Premium MD(Fire)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumMDMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium MD(MB)')] /following::input"),"Total Premium MD(MB)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalPremiumMDSectionTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium MD Section')] /following::input"),"Total Premium MD Section", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumMDIncludingVoluntaryDeductiblesTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium MD (Including Voluntary Deductibles)')] /following::input"),"Premium MD (Including Voluntary Deductibles)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bASISRateBIFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'BASIS Rate BI(Fire)')] /following::input"),"BASIS Rate BI(Fire)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iARApplicableProfitsRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'IAR Applicable Profits Rate')] /following::input"),"IAR Applicable Profits Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalPremiumBIFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium BI(Fire)')] /following::input"),"Total Premium BI(Fire)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumBIIncludingVoluntaryDeductiblesTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium BI (Including Voluntary Deductibles)')] /following::input"),"Premium BI (Including Voluntary Deductibles) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumIARPolicyTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium IAR Policy')] /following::input"),"Premium IAR Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumIARPolicyIncludingIARDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium IAR Policy (Including IAR Discount)')] /following::input"),"Premium IAR Policy (Including IAR Discount)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumIARPolicyIncludingDirectDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium IAR Policy (Including Direct Discount)')] /following::input"),"Premium IAR Policy (Including Direct Discount)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumIncludingTerrorismCoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium ( Including Terrorism Cover )')] /following::input"),"Total Premium ( Including Terrorism Cover )", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforSTFIReverseTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for STFI Reverse')] /following::input"),"Premium for STFI Reverse", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumFireTextField=new PageElement(By.xpath("//td//font//b[contains(text(),'Premium for STFI Reverse')]/following::b/following::input"),"Total Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	

		//LN
		loadingForTurnoverTextField= new PageElement(By.xpath(locatorforPanel("Loading for Turnover", "input")),"Loading for Turnover Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//PI
		sDCPremiumRatePITextField = new PageElement(By.xpath("//tr[3]//td[2]//b[contains(text(),'SDC Premium Rate')]/following::input"),"SDC Premium Rate Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountPITextField = new PageElement(By.xpath("//tr[11]//td[2]//b[contains(text(),'Group Discount')]/following::input"),"Group Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalPremiumSFFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium')]/following::input[6]"),"Total Premium For SF Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumLPFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium')]/following::input[5]"),"Total Premium For LP Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		profitRateLPFireTextField=new PageElement(By.xpath("//td//b[contains(text(),'Profit Rate')]/following::input"),"Profit Rate For LP Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumUnderBasicBIFirePolicyTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium Under Basic')]/following::input")," 	Premium Under Basic BI (Fire) Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumUnderBIFireExceptTerrorismCoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Total Premium Under BI (Fire) (Except Terrorism Cover)')]/following::input")," Total Premium Under BI Fire Except Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumForNonPetrochemicalBlockTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Non Petrochemical Block')]/following::input")," Premium for Non Petrochemical Block TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1019CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1019 Cover')]/following::input"),"Premium for Add On-1019 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1020CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1020 Cover')]/following::input"),"Premium for Add On-1020 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1021CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1021 Cover')]/following::input"),"Premium for Add On-1021 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1022CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1022 Cover')]/following::input"),"Premium for Add On-1022 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1023CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1023 Cover')]/following::input"),"Premium for Add On-1023 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForAddOn1024CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1024 Cover')]/following::input"),"Premium for Add On-1024 Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		netLoadingTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Loading')]/following::input"),"Net Loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Discount')]/following::input"),"Net Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Other Discount')]/following::input"),"Other Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		floaterPolicyRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Floater Policy Rate')]/following::input"),"Floater Policy Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BPPI
		basicRateForBoilerPercentTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Rate for Boiler(%)')]/following::input"),"Basic Rate for Boiler(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stipulatedAgeForBasicRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Stipulated age for Basic Rate')]/following::input"),"Stipulated age for Basic Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField=new PageElement(By.xpath("//td//b[contains(text(),'Loading for age of the boiler exceeding the stipulated age')]/following::input"),"Loading for age of the boiler exceeding the stipulated age TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		effectiveLoadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField=new PageElement(By.xpath("//td//b[contains(text(),'Effective Loading for age of the boiler exceeding the stipulated age')]/following::input"),"Effective Loading for age of the boiler exceeding the stipulated age TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForBoilerInspectorCertificateIsNotRequiredTextField=new PageElement(By.xpath("//td//b[contains(text(),'Loading for boiler inspector certificate is not required')]/following::input"),"Loading for boiler inspector certificate is not required TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateWithTheInspAndAgeLoadingTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Rate with the insp and age loading')]/following::input"),"Basic Rate with the insp and age loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Rate after Tech, Discetionary and Add Discetionary Disc')]/following::input"),"Net Rate after Tech, Discetionary and Add Discetionary Disc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netBasicPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Basic Premium')]/following::input"),"Net Basic Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumBPPITextField=new PageElement(By.xpath("//td//b[contains(text(),'Calculated Premium')]/following::input"),"Calculated Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//WP
		premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium after Discretionary and Additional Discretionary Discount')]/following::input"),"Premium after Discretionary and Additional Discretionary Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAfterDiscountInLieuOfAgentCommissionTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium after Discount in lieu of Agent Commission')]/following::input")," 	Premium after Discount in lieu of Agent Commission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//MB
		basicRateforMachineryBreakdownPercentTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Rate for Machinery Breakdown(%)')]/following::input"),"Basic Rate for Machinery Breakdown(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		higherExcessDiscountMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Higher Excess Discount MB')]/following::input"),"Higher Excess Discount MB  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateAfterHigherExcessMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Rate After Higher Excess (MB)')]/following::input"),"Rate After Higher Excess (MB) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		techDiscountMachineTextField=new PageElement(By.xpath("//td//b[contains(text(),'Tech Discount(Machine)')]/following::input"),"Tech Discount(Machine) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		rateAfterTechDiscountMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Rate After Tech Discount(MB)')]/following::input"),"Rate After Tech Discount(MB) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateAfterTechDiscrDiscountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Rate After Tech Discr Discount')]/following::input"),"Rate After Tech Discr Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRateMBTextField=new PageElement(By.xpath("//td//b[contains(text(),'Policy Rate(MB)')]/following::input"),"Policy Rate(MB) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		// CF

		basicRateForCPMTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Rate for CPM')]/following::input"),"Basic Rate for CPM TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateUndergroundAndRailwayTrackLoadingCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic rate underground and railway track loading')]/following::input"),"Basic rate underground and railway track loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netRateAfterHigherExcessDiscountCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Rate after Higher Excess Discount')]/following::input"),"Net Rate after Higher Excess Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		higherExcessDiscountCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Higher excess discount(%)')]/following::input"),"Higher excess discount(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		earthQuakePremiumCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Earth Quake premium')]/following::input"),"Earth Quake premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumOfSTFICoverCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium of STFI Cover')]/following::input"),"Basic Premium of STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netBasicAndEarthquakePremiumCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Basic and Earthquake Premium')]/following::input"),"Net Basic and Earthquake Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		// CM

		earthquakeExtraTextField=new PageElement(By.xpath("//td//b[contains(text(),'Earthquake Extra')]/following::input"),"Earthquake Extra TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//EF
		deletionOfFireAndAlliedPerilsDiscountRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Deletion of Fire and Allied Perils Discount Rate')]/following::input"),"Deletion of Fire and Allied Perils Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 		
		netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Deletion of Fire and Allied Perils Discount')]/following::input"),"Net Rate after Deletion of Fire and Allied Perils Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		netRateAfterHigherExcessDiscountTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Higher Excess Discount.')]/following::input"),"Net Rate after Higher Excess Discount.",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		technicalDiscountRateTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Technical Discount Rate')]/following::input"),"Technical Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		netRateAfterTechnicalDiscountTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Technical Discount')]/following::input"),"Net Rate after Technical Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discretionaryAndAdditonalDiscretionaryDiscountRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discretionary and Additonal Discretionary Discount Rate')]/following::input"),"Discretionary and Additonal Discretionary Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);  	
		netRateAfterAllDiscountsTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after all Discounts')]/following::input"),"Net Rate after all Discounts",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		basicPremiumOfSTFICoverTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium of STFI Cover')]/following::input"),"Basic Premium of STFI Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		ratepercentForSTFICoverTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate (%) for STFI Cover')]/following::input"),"Rate (%) for STFI Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		earthQuakePremiumTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Earth Quake premium')]/following::input"),"Earth Quake premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discountInLieuOfAgentCommissionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount in Lieu of Agent Commission.')]/following::input"),"Discount in Lieu of Agent Commission.",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalSumInsuredTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Sum Insured.')]/following::input"),"Total sum insured",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//wr
		warCoverPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'WAR Cover Premium')] /following::input"), "WAR Cover Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		rate2monthsTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate(2 months)')]/following::input"),"Rate(2 months)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		rate10SubsequentMonthsTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate(10 subsequent months)')]/following::input"),"Rate(10 subsequent months)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		rateExceeding12MonthsTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate(exceeding 12months)')]/following::input"),"Rate(exceeding 12months)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateTestingPeriodExtensionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate(Testing period extension)')]/following::input"),"Rate(Testing period extension)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		excessPerClaimNormalTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Excess Per Claim(Normal)')]/following::input"),"Excess Per Claim(Normal)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		excessPerClaimTestingPeriodTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Excess Per Claim(Testing Period)')]/following::input"),"Excess Per Claim(Testing Period)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountInEarthquakePremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount in Earthquake Premium')]/following::input"),"Discount in Earthquake Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newExcessPerClaimNormalTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'New Excess Per Claim(Normal)')]/following::input"),"New Excess Per Claim(Normal)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newExcessPerClaimTestingPeriodTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'New Excess Per Claim(Testing Period)')]/following::input"),"New Excess Per Claim(Testing Period)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		discountInPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount in Premium')]/following::input"),"Discount in Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		basicRateNewMachineTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Rate(New Machine)')]/following::input"),"Basic Rate(New Machine)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateOldMachineTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Rate(Old Machine)')]/following::input"),"Basic Rate(Old Machine)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		rateAfterPolicyHigherExcessNewTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate After Policy Higher Excess(New)')]/following::input"),"Rate After Policy Higher Excess(New)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		rateAfterPolicyHigherExcessOldTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate After Policy Higher Excess(Old)')]/following::input"),"Rate After Policy Higher Excess(Old)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		earthquakeEffectiveRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Earthquake Effective Rate')]/following::input"),"Earthquake Effective Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEquakeRateAfterEquakeHigherExcessDisTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Applicable Equake Rate After Equake Higher Excess Dis')]/following::input"),"Applicable Equake Rate After Equake Higher Excess Dis",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		eQpremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'EQ premium')]/following::input"),"EQ premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPolicyRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Policy Rate')]/following::input"),"Total Policy Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPolicyRateOldTextField=	new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Policy Rate(Old)')]/following::input"),"Total Policy Rate(Old)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumNewTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium(New)')]/following::input"),"Basic Premium(New)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		basicPremiumOldTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium(Old)')]/following::input"),"Basic Premium(Old)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicCoveragePremiumNewTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Coverage Premium(New)')]/following::input"),"Basic Coverage Premium(New)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicCoveragePremiumOldTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Coverage Premium(Old)')]/following::input"),"Basic Coverage Premium(Old)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumOldNewTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium(Old+New)')]/following::input"),"Total Premium(Old+New)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10)	;
		totalDiscountTechcommercialTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Discount(Tech & commercial)')]/following::input"),"Total Discount(Tech & commercial)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAfterAllDiscountsTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium After All Discounts')]/following::input"),"Premium After All Discounts",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//FI
		discountAmountforDirectBusinessTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount Amount for Direct Business')]/following::input"),"Discount Amount for Direct Business",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumforSecICoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for SecI Cover')]/following::input"),"Premium for SecI Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforMedicalExpensesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Medical Expenses')]/following::input"),"Premium for Medical Expenses",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforPACoverfortheParentGuardianTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for PA Cover for the Parent (or) Guardian')]/following::input"),"Premium for PA Cover for the Parent (or) Guardian",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//HH Ganesh
		basicPremiumSection1BTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium Section 1B')]/following::input"),"Basic Premium Section 1B",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeSec2Label = new PageElement(By.xpath("//tr[9]//td//b//em[contains(text(),'Insured Interest Code')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoSec2Label = new PageElement(By.xpath("//tr[9]//td[3]//b//em[contains(text(),'Insured Interest Serial No.')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grosspremiumSec2TextField=new PageElement(By.xpath("//tr[10]//td//b[contains(text(),'Gross Premium')] /following::td"),"gross premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountSec2TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[10]//td[3]//b[contains(text(),'Discretionary Discount')]/following::td"),"Discretionary Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryloadingSec2TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[11]//b[contains(text(),'Discretionary Loading')]/following::td"),"Discretionary loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiabilitySec2TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[12]//b[contains(text(),'Limits Of Liability')]/following::td"),"Limits Of Liability",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeSec2Label=new PageElement(By.xpath("//form[@name='S0050']//tr[15]//b[contains(text(),'Coverage Code')]/following::td"),"Coverage Code",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageSec2Label=new PageElement(By.xpath("//form[@name='S0050']//tr[15]//td[4]//b[contains(text(),'Coverage')]/following::td"),"Coverage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		basicPremiumSection2TextField=new PageElement(By.xpath("//tr[15]//td//tr[2]//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumSection2TextField=new PageElement(By.xpath("//tr[15]//td//tr[3]//td//b[contains(text(),'Calculated Premium')]/following::input"),"calculated premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeSec3Label = new PageElement(By.xpath("//tr[17]//td//b//em[contains(text(),'Insured Interest Code')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoSec3Label = new PageElement(By.xpath("//tr[17]//td[3]//b//em[contains(text(),'Insured Interest Serial No.')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grosspremiumSec3TextField=new PageElement(By.xpath("//tr[18]//td//b[contains(text(),'Gross Premium')] /following::td"),"gross premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountSec3TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[18]//td[3]//b[contains(text(),'Discretionary Discount')]/following::td"),"Discretionary Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryloadingSec3TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[19]//b[contains(text(),'Discretionary Loading')]/following::td"),"Discretionary loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiabilitySec3TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[20]//b[contains(text(),'Limits Of Liability')]/following::td"),"Limits Of Liability",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeSec3Label=new PageElement(By.xpath("//form[@name='S0050']//tr[23]//b[contains(text(),'Coverage Code')]/following::td"),"Coverage Code",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageSec3Label=new PageElement(By.xpath("//form[@name='S0050']//tr[23]//td[4]//b[contains(text(),'Coverage')]/following::td"),"Coverage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		basicPremiumSection3TextField=new PageElement(By.xpath("//tr[23]//td//tr[2]//b[contains(text(),'Basic Premium Section 3A')]/following::input"),"Basic Premium Section 3A",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumSection3TextField=new PageElement(By.xpath("//tr[23]//td//tr[4]//td//b[contains(text(),'Calculated Premium')]/following::input"),"calculated premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeSTDLabel = new PageElement(By.xpath("//tr[25]//td//b//em[contains(text(),'Insured Interest Code')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoSTDLabel = new PageElement(By.xpath("//tr[25]//td[3]//b//em[contains(text(),'Insured Interest Serial No.')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grosspremiumSTDTextField=new PageElement(By.xpath("//tr[26]//td//b[contains(text(),'Gross Premium')]/following::td"),"gross premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountSTDTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[26]//td[3]//b[contains(text(),'Discretionary Discount')]/following::td"),"Discretionary Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryloadingSTDTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[27]//b[contains(text(),'Discretionary Loading')]/following::td"),"Discretionary loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiabilitySTDTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[28]//b[contains(text(),'Limits Of Liability')]/following::td"),"Limits Of Liability",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeSTDLabel=new PageElement(By.xpath("//form[@name='S0050']//tr[31]//b[contains(text(),'Coverage Code')]/following::td"),"Coverage Code",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageSTDLabel=new PageElement(By.xpath("//form[@name='S0050']//tr[31]//td[4]//b[contains(text(),'Coverage')]/following::td"),"Coverage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		basicPremiumforSectionsTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr[31]//td//tr[4]//b[contains(text(),'Basic Premium for Sections')]/following::input"),"Basic Premium for Sections TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumHHTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr[31]//td//tr[5]//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumHHTextFeild=new PageElement(By.xpath("//tr[31]//td//tr[13]//td//b[contains(text(),'Calculated Premium')]/following::input"),"Calculated Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//SH
		basicPremiumSection3SHTextField=new PageElement(By.xpath("//tr[23]//td//tr[2]//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumSection3SHTextField=new PageElement(By.xpath("//tr[23]//td//tr[3]//td//b[contains(text(),'Calculated Premium')]/following::input"),"calculated premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumSection4TextField=new PageElement(By.xpath("//tr[31]//td//tr[2]//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumSection4TextField=new PageElement(By.xpath("//tr[31]//td//tr[3]//td//b[contains(text(),'Calculated Premium')]/following::input"),"calculated premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCode5Label= new PageElement(By.xpath("//tr[33]//td//b//em[contains(text(),'Insured Interest Code')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNo5Label= new PageElement(By.xpath("//tr[33]//td[3]//b//em[contains(text(),'Insured Interest Serial No.')]/following::td/font"),"Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		grosspremium5TextField=new PageElement(By.xpath("//tr[34]//td//b[contains(text(),'Gross Premium')]/following::td"),"gross premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscount5TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[34]//td[3]//b[contains(text(),'Discretionary Discount')]/following::td"),"Discretionary Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryloading5TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[35]//b[contains(text(),'Discretionary Loading')]/following::td"),"Discretionary loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiability5TextField=new PageElement(By.xpath("//form[@name='S0050']//tr[36]//b[contains(text(),'Limits Of Liability')]/following::td"),"Limits Of Liability",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCode5Label=new PageElement(By.xpath("//form[@name='S0050']//tr[39]//b[contains(text(),'Coverage Code')]/following::td"),"Coverage Code",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverage5Label=new PageElement(By.xpath("//form[@name='S0050']//tr[39]//td[4]//b[contains(text(),'Coverage')]/following::td"),"Coverage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		basicPremiumforSectionsSHTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr[39]//td//tr[4]//b[contains(text(),'Basic Premium for Sections')]/following::input"),"Basic Premium for Sections TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumSHTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr[39]//td//tr[5]//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedpremiumSHTextFeild=new PageElement(By.xpath("//tr[39]//td//tr[12]//td//b[contains(text(),'Calculated Premium')]/following::input"),"Calculated Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//JI
		premiumDGMRMDiscretionaryDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium DGM / RM Discretionary Discount')]/following::input"),"Premium DGM / RM Discretionary Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountForGoodFeatureTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount for Good Feature')]/following::input"),"Discount for Good Feature",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adverseClaimExperiencePremiumLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Adverse Claim Experience Premium Loading')]/following::input"),"Adverse Claim Experience Premium Loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherPremiumLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Other Premium Loading')]/following::input"),"Other Premium Loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//YR
		basicPremiumRateYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium Rate')]/following::input"),"Basic Premium Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sDCPremiumRateYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'SDC Premium Rate')]/following::input"),"SDC Premium Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingcalculatedYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Loading calculated')]/following::input"),"Loading calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lossesUnseasonalRainsandFrostPremiumRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Losses Unseasonal Rains and Frost Premium Rate')]/following::input"),"Losses Unseasonal Rains and Frost Premium Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discountcalculatedYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Discount calculated')]/following::input"),"Discount calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lossesUnseasonalRainsandFrostPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Losses Unseasonal Rains and Frost Premium')]/following::input"),"Losses Unseasonal Rains and Frost Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		calculatedPremiumYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Calculated Premium')]/following::input"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BA
		floaterExtraPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Floater Extra Premium')]/following::input"),"Floater Extra Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BD
		premiumforStockTradeTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Stock in Trade')]/following::input"),"premiumforStockTradeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumGoodsTrustCommissionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Goods held in Trust or Commission')]/following::input"),"premiumGoodsTrustCommissionTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTheftTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Theft')]/following::input"),"basicPremiumTheftTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumOtherTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Other')]/following::input"),"basicPremiumOtherTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTotalTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Total')]/following::input"),"basicPremiumTotalTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//BB

		premiumforMoneyinPremisesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Money in Premises')]/following::input"),"premiumforMoneyinPremisesTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforMoneyinTransitTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Money in Transit')]/following::input"),"premiumforMoneyinTransitTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		PremiumforAddOnCover1TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for AddOn Cover 1')]/following::input"),"PremiumforAddOnCover1TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforAddOnCover2TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for AddOn Cover 2')]/following::input"),"premiumforAddOnCover2TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforAddOnCover3TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for AddOn Cover 3')]/following::input"),"premiumforAddOnCover3TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforAddOnCover4TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for AddOn Cover 4')]/following::input"),"premiumforAddOnCover4TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforAddOnCover5TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for AddOn Cover 5')]/following::input"),"premiumforAddOnCover5TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		staffLoadingAmountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Staff Loading Amount')]/following::input"),"staffLoadingAmountTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Motor(Shwetha)
		firePerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Fire Peril Premium Rate')]//following::input[1]"), "Fire Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		burglaryPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Burglary Peril Premium Rate')]//following::input[1]"), "Burglary Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riotStrikePerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Riot Strike Peril Premium Rate')]//following::input[1]"), "Riot Strike Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakePerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Earthquake Peril Premium Rate')]//following::input[1]"), "Earthquake Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		floodStormPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Flood Storm Peril Premium Rate')]//following::input[1]"), "Flood Storm Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accidentalPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Accidental Peril Premium Rate')]//following::input[1]"), "Accidental Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maliciousPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Malicious Peril Premium Rate')]//following::input[1]"), "Malicious Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		terroristPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Terrorist Peril Premium Rate')]//following::input[1]"), "Terrorist Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitPerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Transit Peril Premium Rate')]//following::input[1]"), "Transit Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		landslidePerilPremiumRateLabel=new PageElement(By.xpath("//b[contains(text(),'Landslide Peril Premium Rate')]//following::input[1]"), "Landslide Peril", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		odPremiumPercentageLabel=new PageElement(By.xpath("//b[contains(text(),'OD Premium Percentage')]//following::input[1]"), "OD Premium Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicOdPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Basic OD Premium')]//following::input[1]"), "Basic OD Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		imtRateOdPremiumPercentageLabel=new PageElement(By.xpath("//b[contains(text(),'IMT Rate OD Premium percentage')]//following::input[1]"), "IMT Rate OD Premium percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		imtRateBasicOdPremiumLabel=new PageElement(By.xpath("//b[contains(text(),'IMT Rate Basic OD Premium')]//following::input[1]"), "IMT Rate Basic OD Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		loadingForRoadworthyConditionLabel=new PageElement(By.xpath("//b[contains(text(),'Loading for Roadworthy Condition')]//following::input[1]"), "Loading for Roadworthy Condition", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedNcbDiscountLabel=new PageElement(By.xpath("//b[starts-with(text(),'Calculated NCB Discount')]//following::input[1]"), "Calculated NCB Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		imtRateCalculatedNcbDiscountLabel=new PageElement(By.xpath("//b[starts-with(text(),'IMT Rate Calculated NCB Discount')]//following::input[1]"), "IMT Rate Calculated NCB Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		calculatedOdPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Calculated OD Premium')]//following::input[1]"), "Calculated OD Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		basicTpPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Basic TP Premium')]//following::input[1]"), "Basic TP Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		addLlUnderWcaForCarriageOfMoreThanSixEmployeesLabel=new PageElement(By.xpath("//b[starts-with(text(),'Add LL under WCA, for carriage of more than six employees (excluding the Driver)')]//following::input[1]"), "Add LL under WCA, for carriage of more than six employees ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		additionalPremiumForAmbulancesHearsesLabel=new PageElement(By.xpath("//b[starts-with(text(),'Additional Premium for Ambulances, Hearses')]//following::input[1]"), "Additional Premium for Ambulances, Hearses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedTpPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Calculated TP Premium')]//following::input[1]"), "Calculated TP Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Calculated Premium')]//following::input[1]"), "Calculated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalNcbDiscountLabel=new PageElement(By.xpath("//b[starts-with(text(),'Total NCB Discount')]//following::input[1]"), "Total NCB Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalOdPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Total OD Premium')]//following::input[1]"), "Total OD Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalTpPremiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Total TP Premium')]//following::input[1]"), "Total TP Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumLabel=new PageElement(By.xpath("//b[starts-with(text(),'Total TP Premium')]//following::input[3]"), "Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		 CalculatedPremiumTW=new PageElement(By.xpath("//font//b[contains(text(),'Calculated Premium')] /following::input[1]"), "Calculated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 TotalODPremiumwithoutDDTW=new PageElement(By.xpath("//font//b[contains(text(),'Total OD Premium without DD')] /following::input[1]"), "Calculated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 InsuredsdeclaredValueIDVforCover=new PageElement(By.xpath("//font//b[contains(text(),'Insureds declared Value (IDV) for Cover')] /following::input[1]"), "Calculated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		 CommodityPremiumTextField = new PageElement(By.xpath("//td//font//b[contains(text(),'Commodity Premium')]//following::td[1]/font/input"),"Commodity Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 DutyValuePremiumTextField = new PageElement(By.xpath("//td//font//b[contains(text(),'Duty Value Premium')]//following::td[1]/font/input"),"Duty Value Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 WARampSRCCPremiumforCommodityTextField = new PageElement(By.xpath("//td//font//b[contains(text(),'WAR&amp;SRCC Premium for Commodity')]//following::td[1]/font/input"),"WAR&amp;SRCC Premium for Commodity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 WARampSRCCPremiumforDutyTextField = new PageElement(By.xpath("//td//font//b[contains(text(),'WAR&amp;SRCC Premium for Duty')]//following::td[1]/font/input"),"WAR&amp;SRCC Premium for Commodity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
	}

	public void fillPolicyPremiumScheduleDetails(PolicyPremiumScheduleEntity policyPremiumScheduleEntity, CustomAssert assertReference){
		if(policyPremiumScheduleEntity.getAction().equalsIgnoreCase("verify")){
			PolicyPremiumScheduleEntity actualPolicyPremiumScheduleEntity=new PolicyPremiumScheduleEntity();
			
			//FOR CX PRODUCT//
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Status"),  fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPolicyholder")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrossPremium1")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GrossPremium1"),fetchValueFromFields(grossPremium1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAdjustments")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("Adjustments", fetchValueFromFields(adjustmentsLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Adjustments"),  fetchValueFromFields(adjustmentsLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigServiceTax")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("ServiceTax", fetchValueFromFields(serviceTaxLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ServiceTax"), fetchValueFromFields(serviceTaxLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetPremium1")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("NetPremium1", fetchValueFromFields(netPremium1Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetPremium1"), fetchValueFromFields(netPremium1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemberCode")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemberCode", fetchValueFromFields(memberCodeLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemberCode"), fetchValueFromFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemberSerialNo", fetchValueFromFields(memberSerialNoLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemberSerialNo"), fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrossPremium2")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("GrossPremium2", fetchValueFromFields(grossPremium2Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GrossPremium2"), fetchValueFromFields(grossPremium2Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryDiscount")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("DiscretionaryDiscount", fetchValueFromFields(discretionaryDiscountLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryDiscount"), fetchValueFromFields(discretionaryDiscountLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryLoading")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("DiscretionaryLoading", fetchValueFromFields(discretionaryLoadingLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryLoading"), fetchValueFromFields(discretionaryLoadingLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetPremium2")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("NetPremium2", fetchValueFromFields(netPremium2Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetPremium2"), fetchValueFromFields(netPremium2Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLimitsOfLiability")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("LimitsOfLiability", fetchValueFromFields(limitsOfLiabilityLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LimitsOfLiability"), fetchValueFromFields(limitsOfLiabilityLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDescription")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("Description", fetchValueFromTextFields(descriptionTextArea));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Description"), fetchValueFromTextFields(descriptionTextArea), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCode")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("CoverageCode", fetchValueFromFields(coverageCodeLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCode"), fetchValueFromFields(coverageCodeLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverage")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("Coverage", fetchValueFromFields(coverageLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Coverage"), fetchValueFromFields(coverageLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("BasicPremium", fetchValueFromTextFields(basicPremiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremium"), fetchValueFromTextFields(basicPremiumTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPABasicPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("PABasicPremium", fetchValueFromFields(pABasicPremiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PABasicPremium"), fetchValueFromFields(pABasicPremiumTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMCBasicPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MCBasicPremium", fetchValueFromTextFields(mCBasicPremiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MCBasicPremium"), fetchValueFromTextFields(mCBasicPremiumTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigManualLoading")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ManualLoading"),fetchValueFromTextFields(manualLoadingTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigStaffDiscountForMember")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("StaffDiscountForMember", fetchValueFromTextFields(staffDiscountForMemberTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("StaffDiscountForMember"), fetchValueFromTextFields(staffDiscountForMemberTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigManualDiscount")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("ManualDiscount", fetchValueFromTextFields(manualDiscountTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ManualDiscount"), fetchValueFromTextFields(manualDiscountTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("CalculatedPremium", fetchValueFromTextFields(calculatedPremiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedPremium"), fetchValueFromTextFields(calculatedPremiumTextField), AssertionType.WARNING);
			}
			//wr
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigWARCoverPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("CalculatedPremium", fetchValueFromTextFields(calculatedPremiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("WARCoverPremium"), fetchValueFromTextFields(warCoverPremiumTextField), AssertionType.WARNING);
			}

			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("Premium", fetchValueFromTextFields(premiumTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestCode", fetchValueFromFields(insuredInterestCodeLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNoLabel));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemInsuredInterestCode")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemInsuredInterestCode", fetchValueFromFields(insuredInterestCode2Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemInsuredInterestCode"), fetchValueFromFields(insuredInterestCode2Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemInsuredInterestSerialNo")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemInsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNo2Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemInsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNo2Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemGrossPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemGrossPremium", fetchValueFromFields(grossPremium3Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemGrossPremium"), fetchValueFromFields(grossPremium3Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemDiscretionaryDiscount")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemDiscretionaryDiscount", fetchValueFromFields(discretionaryDiscount1Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemDiscretionaryDiscount"), fetchValueFromFields(discretionaryDiscount1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemDiscretionaryLoading")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemDiscretionaryLoading", fetchValueFromFields(discretionaryLoading1Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemDiscretionaryLoading"), fetchValueFromFields(discretionaryLoading1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemNetPremium")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemNetPremium", fetchValueFromFields(netPremium3Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemNetPremium"), fetchValueFromFields(netPremium3Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMemLimitsOfLiability")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("MemLimitsOfLiability", fetchValueFromFields(limitsOfLiability1Label));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MemLimitsOfLiability"), fetchValueFromFields(limitsOfLiability1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigUSDCurrencyValue")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("USDCurrencyValue"),fetchValueFromTextFields(usdCurrencyValueTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumRate")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumRate"),fetchValueFromTextFields(basicPremiumRateTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumDiscountforCorporatePortal")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumDiscountforCorporatePortal"),fetchValueFromTextFields(premiumDiscountforCorporatePortalTextField), AssertionType.WARNING);
			}

			//For Credit Shield
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumRate")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("PremiumRate", fetchValueFromTextFields(premiumRateTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumRate"),fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAmountOfPremiumForPreCredit")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("AmountOfPremiumForPreCredit", fetchValueFromTextFields(amountOfPremiumForPreCreditTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AmountOfPremiumForPreCredit"),fetchValueFromTextFields(amountOfPremiumForPreCreditTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingManual")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("LoadingManual", fetchValueFromTextFields(loadingManualTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingManual"),  fetchValueFromTextFields(loadingManualTextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountManual")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("DiscountManual", fetchValueFromTextFields(discountManualTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountManual"),  fetchValueFromTextFields(discountManualTextField), AssertionType.WARNING);
			}

			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForPH")) {
				//actualPolicyPremiumScheduleEntity.setStringValueForField("PremiumForPH", fetchValueFromTextFields(premiumForPHTextField));
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForPH"), fetchValueFromTextFields(premiumForPHTextField), AssertionType.WARNING);
			}
			//GH
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCode1")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCode1"),fetchValueFromFields(coverageCode1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverage1")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Coverage1"),fetchValueFromFields(coverage1Label), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremium1")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Premium1"),fetchValueFromTextFields(premium1TextField), AssertionType.WARNING);
			}
			if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedPremium1")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedPremium1"),fetchValueFromTextFields(calculatedPremium1TextField), AssertionType.WARNING);
			}

			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				//FP
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRate")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("AnnualSDCPremiumRate", fetchValueFromTextFields(annualSDCPremiumRateTextField));
					//assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AnnualSDCPremiumRate"), actualPolicyPremiumScheduleEntity.getStringValueForField("AnnualSDCPremiumRate"), AssertionType.WARNING);
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AnnualSDCPremiumRate"), fetchValueFromTextFields(annualSDCPremiumRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSDCPremiumRate")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("SDCPremiumRate", fetchValueFromTextFields(sDCPremiumRateTextField));
					//assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SDCPremiumRate"), actualPolicyPremiumScheduleEntity.getStringValueForField("SDCPremiumRate"), AssertionType.WARNING);
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SDCPremiumRate"), fetchValueFromTextFields(sDCPremiumRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoading")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("Loading", fetchValueFromTextFields(loadingTextField));
					//assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Loading"), actualPolicyPremiumScheduleEntity.getStringValueForField("Loading"), AssertionType.WARNING);
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Loading"), fetchValueFromTextFields(loadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscount")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("Discount", fetchValueFromTextFields(discountTextField));
					//assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Discount"), actualPolicyPremiumScheduleEntity.getStringValueForField("Discount"), AssertionType.WARNING);
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Discount"), fetchValueFromTextFields(discountTextField), AssertionType.WARNING);
				}
				//DC

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountCalculated")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountCalculated"),fetchValueFromTextFields(discountCalculatedTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingCalculated")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingCalculated"),fetchValueFromTextFields(loadingCalculatedTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SpecialDiscount"),fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLongtermDiscountPercentage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LongtermDiscountPercentage"),fetchValueFromTextFields(longtermDiscountpercentageTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLongtermDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LongtermDiscount"),fetchValueFromTextFields(longtermDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGroupDiscountPercentage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GroupDiscountPercentage"),fetchValueFromTextFields(groupDiscountpercentageTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGroupDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GroupDiscount"),fetchValueFromTextFields(groupDiscountTextField), AssertionType.WARNING);
				}
				//DK
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigExtraPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ExtraPremium"),fetchValueFromTextFields(extraPremiumTextField), AssertionType.WARNING);
				}
				//GP
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSpecialDiscountinLieuOfAgencyCommission")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SpecialDiscountinLieuOfAgencyCommission"),fetchValueFromTextFields(specialDiscountinlieuOfAgencyCommissionTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigOldPumpsetLoadingPercentage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("OldPumpsetLoadingPercentage"),fetchValueFromTextFields(oldPumpsetLoadingPercentageTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigOldPumpsetLoading")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("OldPumpsetLoading"),fetchValueFromTextFields(oldPumpsetLoadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNoClaimDiscountPS")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NoClaimDiscountPS"),fetchValueFromTextFields(noClaimDiscountPSTextField), AssertionType.WARNING);
				}
				//GR
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigShortPeriodRateApplicable")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ShortPeriodRateApplicable"),fetchValueFromTextFields(shortPeriodRateApplicableTextField), AssertionType.WARNING);
				}

				//PI
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSDCPremiumRatePI")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("SDCPremiumRate", fetchValueFromTextFields(sDCPremiumRateTextField));
					//assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SDCPremiumRate"), actualPolicyPremiumScheduleEntity.getStringValueForField("SDCPremiumRate"), AssertionType.WARNING);
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SDCPremiumRatePI"), fetchValueFromTextFields(sDCPremiumRatePITextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGroupDiscountPI")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GroupDiscountPI"),fetchValueFromTextFields(groupDiscountPITextField), AssertionType.WARNING);
				}
			}
			//Misc_Liability
			//CO
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigShortPeriodFactor")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ShortPeriodFactor"),fetchValueFromTextFields(shortPeriodFactorTextfield), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForCO")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForCO"),fetchValueFromTextFields(premiumForCOTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAdverseLoading")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AdverseLoading"),fetchValueFromTextFields(adverseLoadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRefrigeratedPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RefrigeratedPremium"),fetchValueFromTextFields(refrigeratedPremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoLPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoLPremiumRate"),fetchValueFromTextFields(lolPremiumRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForHiredVehicleCover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForHiredVehicleCover"),fetchValueFromTextFields(loadingForHiredVehicleCoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForRSMD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForRSMD"),fetchValueFromTextFields(loadingForRSMDTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForShortageDueToTheftOrPilferageOfCargo")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForShortageDueToTheftOrPilferageOfCargo"),fetchValueFromTextFields(loadingForShortageDueToTheftOrPilferageOfCargoTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForFloodOrWaterDamageOrDamageByAnyOtherCargo")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForFloodOrWaterDamageOrDamageByAnyOtherCargo"),fetchValueFromTextFields(loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForBreakage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForBreakage"),fetchValueFromTextFields(loadingForBreakageTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumOnTurnover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumOnTurnover"),fetchValueFromTextFields(premiumOnTurnoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigVoluntaryExcessDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("VoluntaryExcessDiscount"),fetchValueFromTextFields(voluntaryExcessDiscountTextField), AssertionType.WARNING);
				}
				//CT
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAddlPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AddlPremium"),fetchValueFromTextFields(addlPremiumTextField), AssertionType.WARNING);
				}
				//DO
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForoutsideboardposition")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForoutsideboardposition"),fetchValueFromTextFields(loadingForoutsideboardpositionTextFieldTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForOutsidedirectorship")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForOutsidedirectorship"),fetchValueFromTextFields(loadingForOutsidedirectorshipTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForSpousalextension")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForSpousalextension"),	fetchValueFromTextFields(loadingForSpousalextensionTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForLegalheirsandrepresentatives")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForLegalheirsandrepresentatives"),fetchValueFromTextFields(loadingForLegalheirsandrepresentativesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForEntitycoverageForsecurities")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForEntitycoverageForsecurities"),fetchValueFromTextFields(loadingForEntitycoverageForsecuritiesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForInitialpublicoffering")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForInitialpublicoffering"),	fetchValueFromTextFields(loadingForInitialpublicofferingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForOtheradditionalextensions")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForOtheradditionalextensions"),fetchValueFromTextFields(loadingForOtheradditionalextensionsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForAcquisitionorMerger")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForAcquisitionorMerger"),fetchValueFromTextFields(loadingForAcquisitionorMergerTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForCrisisCommunicationcover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForCrisisCommunicationcover"),fetchValueFromTextFields(loadingForCrisisCommunicationcoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForCourtAttendanceCost")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForCourtAttendanceCost"),fetchValueFromTextFields(loadingForCourtAttendanceCostTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForRiskManagement")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForRiskManagement"),fetchValueFromTextFields(loadingForRiskManagementTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForPollutiondefenseCost")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForPollutiondefenseCost"),	fetchValueFromTextFields(loadingForPollutiondefenseCostTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForEmploymentPracticeLiability")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForEmploymentPracticeLiability"),	fetchValueFromTextFields(loadingForEmploymentPracticeLiabilityTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForDirectorversusDirector")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForDirectorversusDirector"),fetchValueFromTextFields(loadingForDirectorversusDirectorTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForShadowDirectorship")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForShadowDirectorship"),fetchValueFromTextFields(loadingForShadowDirectorshipTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForAuto-acquisitionEmploymentpracticeLiability")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForAuto-acquisitionEmploymentpracticeLiability"),fetchValueFromTextFields(loadingForAutoAcquisitionEmploymentpracticeLiabilityTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForAuto-acquisitionComputerCrimeInsurance")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForAuto-acquisitionComputerCrimeInsurance"),fetchValueFromTextFields(loadingForAutoAcquisitionComputerCrimeInsuranceTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForDiscoveryPeriod")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForDiscoveryPeriod"),fetchValueFromTextFields(loadingForDiscoveryPeriodTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForEntitycoverageForEPLI")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForEntitycoverageForEPLI"),	fetchValueFromTextFields(loadingForEntitycoverageForEPLITextField), AssertionType.WARNING);
				}
				// LN
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForTurnover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForTurnover"),	fetchValueFromTextFields(loadingForTurnoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremium"),fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
				}
			}
			//Chintan -Fire

			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Rate"),fetchValueFromTextFields(rateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigStfiDeletionRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("StfiDeletionRate"),fetchValueFromTextFields(sTFIDeletionRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRsmdDeletionRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RsmdDeletionRate"),fetchValueFromTextFields(rSMDDeletionRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRate"),fetchValueFromTextFields(basicRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthquakeRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthquakeRate"),fetchValueFromTextFields(earthquakeRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSpontaneousCombustionRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SpontaneousCombustionRate"),fetchValueFromTextFields(spontaneousCombustionRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigForestFireRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ForestFireRate"),fetchValueFromTextFields(forestFireRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTerrorismRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TerrorismRate"),fetchValueFromTextFields(terrorismRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigImpactDamageRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ImpactDamageRate"),fetchValueFromTextFields(impactDamageRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPolicyRateFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PolicyRateFire"),fetchValueFromTextFields(policyRateFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetBasicRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetBasicRate"),fetchValueFromTextFields(netBasicRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetPolicyRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetPolicyRate"),fetchValueFromTextFields(netPolicyRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMaximumNetPolicyRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MaximumNetPolicyRate"),fetchValueFromTextFields(maximumNetPolicyRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumUnderBasicPolicy")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumUnderBasicPolicy"),fetchValueFromTextFields(premiumUnderBasicPolicyTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1002Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1002Cover"),fetchValueFromTextFields(premiumForAddOn1002CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1017Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1017Cover"),fetchValueFromTextFields(premiumForAddOn1017CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForSTFIReverse")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForSTFIReverse"),fetchValueFromTextFields(premiumForSTFIReverseTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumForAllAddOnCoverExceptTerrorism")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumForAllAddOnCoverExceptTerrorism"),fetchValueFromTextFields(totalPremiumForAllAddOnCoverExceptTerrorismTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumExcludingTerrorismCover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumExcludingTerrorismCover"),fetchValueFromTextFields(totalPremiumExcludingTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumIncludingVoluntaryDeductibles")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumIncludingVoluntaryDeductibles"),fetchValueFromTextFields(totalPremiumIncludingVoluntaryDeductiblesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumIncludingDirectBusinessDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumIncludingDirectBusinessDiscount"),fetchValueFromTextFields(totalPremiumIncludingDirectBusinessDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumIncludingTerrorismCover")) {
					
						assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumIncludingTerrorismCover"),fetchValueFromTextFields(totalPremiumIncludingTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumIncludingTerrorismCoverForFD")) {
						assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumIncludingTerrorismCoverForFD"),fetchValueFromTextFields(totalPremiumIncludingTerrorismCoverTextFieldForFD), AssertionType.WARNING);	
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigWeightedAverageRateMDFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("WeightedAverageRateMDFire"),fetchValueFromTextFields(weightedAverageRateMDFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigWeightedAverageRateMDMB")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("WeightedAverageRateMDMB"),fetchValueFromTextFields(weightedAverageRateMDMBTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumMDFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumMDFire"),fetchValueFromTextFields(totalPremiumMDFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumMDMB")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumMDMB"),fetchValueFromTextFields(totalPremiumMDMBTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumMDSection")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumMDSection"),fetchValueFromTextFields(totalPremiumMDSectionTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumMDIncludingVoluntaryDeductibles")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumMDIncludingVoluntaryDeductibles"),fetchValueFromTextFields(premiumMDIncludingVoluntaryDeductiblesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBASISRateBIFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BASISRateBIFire"),fetchValueFromTextFields(bASISRateBIFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigIARApplicableProfitsRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("IARApplicableProfitsRate"),fetchValueFromTextFields(iARApplicableProfitsRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumBIFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumBIFire"),fetchValueFromTextFields(totalPremiumBIFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumBIIncludingVoluntaryDeductibles")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumBIIncludingVoluntaryDeductibles"),fetchValueFromTextFields(premiumBIIncludingVoluntaryDeductiblesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumIARPolicy")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumIARPolicy"),fetchValueFromTextFields(premiumIARPolicyTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumIARPolicyIncludingIARDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumIARPolicyIncludingIARDiscount"),fetchValueFromTextFields(premiumIARPolicyIncludingIARDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumIARPolicyIncludingDirectDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumIARPolicyIncludingDirectDiscount"),fetchValueFromTextFields(premiumIARPolicyIncludingDirectDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumIncludingTerrorismCover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumIncludingTerrorismCover"),fetchValueFromTextFields(totalPremiumIncludingTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremium"),fetchValueFromTextFields(totalPremiumFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumSFFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumSFFire"),fetchValueFromTextFields(totalPremiumSFFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumLPFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumLPFire"),fetchValueFromTextFields(totalPremiumLPFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigProfitRateLPFire")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ProfitRateLPFire"),fetchValueFromTextFields(profitRateLPFireTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumUnderBasicBIFirePolicy")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumUnderBasicBIFirePolicy"),fetchValueFromTextFields(premiumUnderBasicBIFirePolicyTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumUnderBIFireExceptTerrorismCover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumUnderBIFireExceptTerrorismCover"),fetchValueFromTextFields(totalPremiumUnderBIFireExceptTerrorismCoverTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForNonPetrochemicalBlock")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForNonPetrochemicalBlock"),fetchValueFromTextFields(premiumForNonPetrochemicalBlockTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1019Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1019Cover"),fetchValueFromTextFields(premiumForAddOn1019CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1020Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1020Cover"),fetchValueFromTextFields(premiumForAddOn1020CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1021Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1021Cover"),fetchValueFromTextFields(premiumForAddOn1021CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1022Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1022Cover"),fetchValueFromTextFields(premiumForAddOn1022CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1023Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1023Cover"),fetchValueFromTextFields(premiumForAddOn1023CoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumForAddOn1024Cover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumForAddOn1024Cover"),fetchValueFromTextFields(premiumForAddOn1024CoverTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetLoading")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetLoading"),fetchValueFromTextFields(netLoadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetDiscount"),fetchValueFromTextFields(netDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigOtherDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("OtherDiscount"),fetchValueFromTextFields(otherDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigFloaterPolicyRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("FloaterPolicyRate"),fetchValueFromTextFields(floaterPolicyRateTextField), AssertionType.WARNING);
				}

			}
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
				//BPPI
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateForBoilerPercent")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateForBoilerPercent"),fetchValueFromTextFields(basicRateForBoilerPercentTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigStipulatedAgeForBasicRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("StipulatedAgeForBasicRate"),fetchValueFromTextFields(stipulatedAgeForBasicRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForAgeOfTheBoilerExceeding")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForAgeOfTheBoilerExceeding"),fetchValueFromTextFields(loadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEffectiveLoadingForAgeOfTheBoiler")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EffectiveLoadingForAgeOfTheBoiler"),fetchValueFromTextFields(effectiveLoadingForAgeOfTheBoilerExceedingTheStipulatedAgeTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForBoilerInspectorCert")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForBoilerInspectorCert"),fetchValueFromTextFields(loadingForBoilerInspectorCertificateIsNotRequiredTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateWithTheInspAndAge")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateWithTheInspAndAge"),fetchValueFromTextFields(basicRateWithTheInspAndAgeLoadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterTechDiscetionary")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterTechDiscetionary"),fetchValueFromTextFields(netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetBasicPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetBasicPremium"),fetchValueFromTextFields(netBasicPremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedPremiumBPPI")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedPremiumBPPI"),fetchValueFromTextFields(calculatedPremiumBPPITextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRate"),fetchValueFromTextFields(basicRateTextField), AssertionType.WARNING);
				}
				//WP
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumAfterDiscrAddDiscrDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumAfterDiscrAddDiscrDiscount"),fetchValueFromTextFields(premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumAfterDisInLieuOfAgentCommisn")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumAfterDisInLieuOfAgentCommisn"),fetchValueFromTextFields(premiumAfterDiscountInLieuOfAgentCommissionTextField), AssertionType.WARNING);
				}
				//MB

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateforMachineryBreakdownPercent")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateforMachineryBreakdownPercent"),fetchValueFromTextFields(basicRateforMachineryBreakdownPercentTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigHigherExcessDiscountMB")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("HigherExcessDiscountMB"),fetchValueFromTextFields(higherExcessDiscountMBTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateAfterHigherExcessMB")) {

					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateAfterHigherExcessMB"),fetchValueFromTextFields(rateAfterHigherExcessMBTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTechDiscountMachine")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TechDiscountMachine"),fetchValueFromTextFields(techDiscountMachineTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateAfterTechDiscountMB")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateAfterTechDiscountMB"),fetchValueFromTextFields(rateAfterTechDiscountMBTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateAfterTechDiscrDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateAfterTechDiscrDiscount"),fetchValueFromTextFields(rateAfterTechDiscrDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPolicyRateMB")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PolicyRateMB"),fetchValueFromTextFields(policyRateMBTextField), AssertionType.WARNING);
				}
				// CF

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateForCPM")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateForCPM"),fetchValueFromTextFields(basicRateForCPMTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateUndergroundAndRailwayRrackLoadingCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateUndergroundAndRailwayRrackLoadingCF"),fetchValueFromTextFields(basicRateUndergroundAndRailwayTrackLoadingCFTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterHigherExcessDiscountCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterHigherExcessDiscountCF"),fetchValueFromTextFields(netRateAfterHigherExcessDiscountCFTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigHigherExcessDiscountCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("HigherExcessDiscountCF"),fetchValueFromTextFields(higherExcessDiscountCFTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthQuakePremiumCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthQuakePremiumCF"),fetchValueFromTextFields(earthQuakePremiumCFTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumOfSTFICoverCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumOfSTFICoverCF"),fetchValueFromTextFields(basicPremiumOfSTFICoverCFTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetBasicAndEarthquakePremiumCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetBasicAndEarthquakePremiumCF"),fetchValueFromTextFields(netBasicAndEarthquakePremiumCFTextField), AssertionType.WARNING);
				}

				// CM

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthquakeExtraCF")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthquakeExtraCF"),fetchValueFromTextFields(earthquakeExtraTextField), AssertionType.WARNING);
				}
				//EF
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDeletionOfFireAndAlliedPerilsDiscountRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DeletionOfFireAndAlliedPerilsDiscountRate"),fetchValueFromTextFields(deletionOfFireAndAlliedPerilsDiscountRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterDeletionOfFireAndAlliedPerilsDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterDeletionOfFireAndAlliedPerilsDiscount"),fetchValueFromTextFields(netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterHigherExcessDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterHigherExcessDiscount"),fetchValueFromTextFields(netRateAfterHigherExcessDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTechnicalDiscountRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TechnicalDiscountRate"),fetchValueFromTextFields(technicalDiscountRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterTechnicalDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterTechnicalDiscount"),fetchValueFromTextFields(netRateAfterTechnicalDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryAndAdditonalDiscretionaryDiscountRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryAndAdditonalDiscretionaryDiscountRate"),fetchValueFromTextFields(discretionaryAndAdditonalDiscretionaryDiscountRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNetRateAfterAllDiscounts")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NetRateAfterAllDiscounts"),fetchValueFromTextFields(netRateAfterAllDiscountsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumOfSTFICover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumOfSTFICover"),fetchValueFromTextFields(basicPremiumOfSTFICoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRatepercentForSTFICover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RatepercentForSTFICover"),fetchValueFromTextFields(ratepercentForSTFICoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthQuakePremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthQuakePremium"),fetchValueFromTextFields(earthQuakePremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommission")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountInLieuOfAgentCommission"),fetchValueFromTextFields(discountInLieuOfAgentCommissionTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRate2months")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Rate2months"),fetchValueFromTextFields(rate2monthsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRate10SubsequentMonths")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Rate10SubsequentMonths"),fetchValueFromTextFields(rate10SubsequentMonthsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateExceeding12Months")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateExceeding12Months"),fetchValueFromTextFields(rateExceeding12MonthsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateTestingPeriodExtension")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateTestingPeriodExtension"),fetchValueFromTextFields(rateTestingPeriodExtensionTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigExcessPerClaimNormal")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ExcessPerClaimNormal"),fetchValueFromTextFields(excessPerClaimNormalTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigExcessPerClaimTestingPeriod")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ExcessPerClaimTestingPeriod"),fetchValueFromTextFields(excessPerClaimTestingPeriodTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountInEarthquakePremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountInEarthquakePremium"),fetchValueFromTextFields(discountInEarthquakePremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNewExcessPerClaimNormal")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NewExcessPerClaimNormal"),fetchValueFromTextFields(newExcessPerClaimNormalTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigNewExcessPerClaimTestingPeriod")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("NewExcessPerClaimTestingPeriod"),fetchValueFromTextFields(newExcessPerClaimTestingPeriodTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountInPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountInPremium"),fetchValueFromTextFields(discountInPremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateNewMachine")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateNewMachine"),fetchValueFromTextFields(basicRateNewMachineTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicRateOldMachine")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicRateOldMachine"),fetchValueFromTextFields(basicRateOldMachineTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateAfterPolicyHigherExcessNew")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateAfterPolicyHigherExcessNew"),fetchValueFromTextFields(rateAfterPolicyHigherExcessNewTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRateAfterPolicyHigherExcessOld")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RateAfterPolicyHigherExcessOld"),fetchValueFromTextFields(rateAfterPolicyHigherExcessOldTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthquakeEffectiveRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthquakeEffectiveRate"),fetchValueFromTextFields(earthquakeEffectiveRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigApplicableEquakeRateAfterEquakeHigherExcessDis")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ApplicableEquakeRateAfterEquakeHigherExcessDis"),fetchValueFromTextFields(applicableEquakeRateAfterEquakeHigherExcessDisTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEQpremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EQpremium"),fetchValueFromTextFields(eQpremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPolicyRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPolicyRate"),fetchValueFromTextFields(totalPolicyRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPolicyRateOld")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPolicyRateOld"),fetchValueFromTextFields(totalPolicyRateOldTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumNew")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumNew"),fetchValueFromTextFields(basicPremiumNewTextField), AssertionType.WARNING);
				}


				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumOld")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumOld"),fetchValueFromTextFields(basicPremiumOldTextField), AssertionType.WARNING);
				}

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicCoveragePremiumNew")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicCoveragePremiumNew"),fetchValueFromTextFields(basicCoveragePremiumNewTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicCoveragePremiumOld")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicCoveragePremiumOld"),fetchValueFromTextFields(basicCoveragePremiumOldTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalPremiumOldNew")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalPremiumOldNew"),fetchValueFromTextFields(totalPremiumOldNewTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalDiscountTechcommercial")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalDiscountTechcommercial"),fetchValueFromTextFields(totalDiscountTechcommercialTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumAfterAllDiscounts")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumAfterAllDiscounts"),fetchValueFromTextFields(premiumAfterAllDiscountsTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
				}
			}
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountAmountforDirectBusiness")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountAmountforDirectBusiness"),fetchValueFromTextFields(discountAmountforDirectBusinessTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforSecICover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforSecICover"),fetchValueFromTextFields(premiumforSecICoverTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforMedicalExpenses")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforMedicalExpenses"),fetchValueFromTextFields(premiumforMedicalExpensesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforPACoverfortheParentGuardian")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforPACoverfortheParentGuardian"),fetchValueFromTextFields(premiumforPACoverfortheParentGuardianTextField), AssertionType.WARNING);
				}

				//HH
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumSection1B")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumSection1B"),fetchValueFromTextFields(basicPremiumSection1BTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestCodeSec2")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestCode", fetchValueFromFields(insuredInterestCodeLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestCodeSec2"), fetchValueFromFields(insuredInterestCodeSec2Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestSerialNoSec2")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNoLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestSerialNoSec2"), fetchValueFromFields(insuredInterestSerialNoSec2Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrosspremiumSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GrosspremiumSec2"),fetchValueFromFields(grosspremiumSec2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryDiscountSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryDiscountSec2"),fetchValueFromFields(discretionaryDiscountSec2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryloadingSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryloadingSec2"),fetchValueFromFields(discretionaryloadingSec2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLimitsOfLiabilitySec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LimitsOfLiabilitySec2"),fetchValueFromFields(limitsOfLiabilitySec2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCodeSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCodeSec2"),fetchValueFromFields(coverageCodeSec2Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageSec2"),fetchValueFromFields(coverageSec2Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicpremiumSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicpremiumSec2"),fetchValueFromTextFields(basicPremiumSection2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumSec2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumSec2"),fetchValueFromTextFields(calculatedpremiumSection2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestCodeSec3")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestCode", fetchValueFromFields(insuredInterestCodeLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestCodeSec3"), fetchValueFromFields(insuredInterestCodeSec3Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestSerialNoSec3")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNoLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestSerialNoSec3"), fetchValueFromFields(insuredInterestSerialNoSec3Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrosspremiumSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GrosspremiumSec3"),fetchValueFromFields(grosspremiumSec3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryDiscountSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryDiscountSec3"),fetchValueFromFields(discretionaryDiscountSec3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryloadingSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryloadingSec3"),fetchValueFromFields(discretionaryloadingSec3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLimitsOfLiabilitySec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LimitsOfLiabilitySec3"),fetchValueFromFields(limitsOfLiabilitySec3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCodeSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCodeSec3"),fetchValueFromFields(coverageCodeSec3Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageSec3"),fetchValueFromFields(coverageSec3Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicpremiumSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicpremiumSec3"),fetchValueFromTextFields(basicPremiumSection3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumSec3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumSec3"),fetchValueFromTextFields(calculatedpremiumSection3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestCodeSTD")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestCode", fetchValueFromFields(insuredInterestCodeLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestCodeSTD"), fetchValueFromFields(insuredInterestCodeSTDLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestSerialNoSTD")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNoLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestSerialNoSTD"), fetchValueFromFields(insuredInterestSerialNoSTDLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrosspremiumSTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("GrosspremiumSTD"),fetchValueFromFields(grosspremiumSTDTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryDiscountSTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryDiscountSTD"),fetchValueFromFields(discretionaryDiscountSTDTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryloadingSTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryloadingSTD"),fetchValueFromFields(discretionaryloadingSTDTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLimitsOfLiabilitySTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LimitsOfLiabilitySTD"),fetchValueFromFields(limitsOfLiabilitySTDTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCodeSTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCodeSTD"),fetchValueFromFields(coverageCodeSTDLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageSTD")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageSTD"),fetchValueFromFields(coverageSTDLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumforSections")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumforSections"),fetchValueFromTextFields(basicPremiumforSectionsTextFeild), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumHH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumHH"),fetchValueFromTextFields(basicPremiumHHTextFeild), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumHH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumHH"),fetchValueFromTextFields(calculatedpremiumHHTextFeild), AssertionType.WARNING);
				}

				//SH
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicpremiumSec3SH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicpremiumSec3SH"),fetchValueFromTextFields(basicPremiumSection3SHTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumSec3SH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumSec3SH"),fetchValueFromTextFields(calculatedpremiumSection3SHTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicpremiumSec4")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicpremiumSec4"),fetchValueFromTextFields(basicPremiumSection4TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumSec4")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumSec4"),fetchValueFromTextFields(calculatedpremiumSection4TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestCode5")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestCode", fetchValueFromFields(insuredInterestCodeLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestCode5"), fetchValueFromFields(insuredInterestCode5Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo5")) {
					//actualPolicyPremiumScheduleEntity.setStringValueForField("InsuredInterestSerialNo", fetchValueFromFields(insuredInterestSerialNoLabel));
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredInterestSerialNo5"), fetchValueFromFields(insuredInterestSerialNo5Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigGrosspremium5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Grosspremium5"),fetchValueFromFields(grosspremium5TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryDiscount5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscretionaryDiscount5"),fetchValueFromFields(discretionaryDiscount5TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscretionaryloading5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Discretionaryloading5"),fetchValueFromFields(discretionaryloading5TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLimitsOfLiability5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LimitsOfLiability5"),fetchValueFromFields(limitsOfLiability5TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverageCode5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CoverageCode5"),fetchValueFromFields(coverageCode5Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCoverage5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("Coverage5"),fetchValueFromFields(coverage5Label), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumforSectionsSH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumforSectionsSH"),fetchValueFromTextFields(basicPremiumforSectionsSHTextFeild), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumSH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumSH"),fetchValueFromTextFields(basicPremiumSHTextFeild), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedpremiumSH")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedpremiumSH"),fetchValueFromTextFields(calculatedpremiumSHTextFeild), AssertionType.WARNING);
				}

				//JI
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumDGMRMDiscretionaryDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumDGMRMDiscretionaryDiscount"),fetchValueFromTextFields(premiumDGMRMDiscretionaryDiscountTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountForGoodFeature")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountForGoodFeature"),fetchValueFromTextFields(discountForGoodFeatureTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAdverseClaimExperiencePremiumLoading")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AdverseClaimExperiencePremiumLoading"),fetchValueFromTextFields(adverseClaimExperiencePremiumLoadingTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigOtherPremiumLoading")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("OtherPremiumLoading"),fetchValueFromTextFields(otherPremiumLoadingTextField), AssertionType.WARNING);
				}
				//BA
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigFloaterExtraPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("FloaterExtraPremium"),fetchValueFromTextFields(floaterExtraPremiumTextField), AssertionType.WARNING);
				}
				//BD
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforStockTrade")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforStockTrade"),fetchValueFromTextFields(premiumforStockTradeTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumGoodsTrustCommission")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumGoodsTrustCommission"),fetchValueFromTextFields(premiumGoodsTrustCommissionTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumTheft")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumTheft"),fetchValueFromTextFields(basicPremiumTheftTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumOther")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumOther"),fetchValueFromTextFields(basicPremiumOtherTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumTotal")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumTotal"),fetchValueFromTextFields(basicPremiumTotalTextField), AssertionType.WARNING);
				}
				//BB
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforMoneyinPremises")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforMoneyinPremises"),fetchValueFromTextFields(premiumforMoneyinPremisesTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforMoneyinTransit")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforMoneyinTransit"),fetchValueFromTextFields(premiumforMoneyinTransitTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforAddOnCover1")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforAddOnCover1"),fetchValueFromTextFields(PremiumforAddOnCover1TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforAddOnCover2")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforAddOnCover2"),fetchValueFromTextFields(premiumforAddOnCover2TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforAddOnCover3")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforAddOnCover3"),fetchValueFromTextFields(premiumforAddOnCover3TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforAddOnCover4")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforAddOnCover4"),fetchValueFromTextFields(premiumforAddOnCover4TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumforAddOnCover5")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumforAddOnCover5"),fetchValueFromTextFields(premiumforAddOnCover5TextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigStaffLoadingAmount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("StaffLoadingAmount"),fetchValueFromTextFields(staffLoadingAmountTextField), AssertionType.WARNING);
				}
			}
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){

				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicPremiumRateYR")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicPremiumRateYR"),fetchValueFromTextFields(basicPremiumRateYRTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigSDCPremiumRateYR")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("SDCPremiumRateYR"),fetchValueFromTextFields(sDCPremiumRateYRTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingcalculatedYR")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingcalculatedYR"),fetchValueFromTextFields(loadingcalculatedYRTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLossesUnseasonalRainsandFrostPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LossesUnseasonalRainsandFrostPremiumRate"),fetchValueFromTextFields(lossesUnseasonalRainsandFrostPremiumRateTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDiscountcalculatedYR")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DiscountcalculatedYR"),fetchValueFromTextFields(discountcalculatedYRTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLossesUnseasonalRainsandFrostPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LossesUnseasonalRainsandFrostPremium"),fetchValueFromTextFields(lossesUnseasonalRainsandFrostPremiumTextField), AssertionType.WARNING);
				}
			}
			//ST
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigFirePerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("FirePerilPremiumRate"),fetchValueFromTextFields(firePerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBurglaryPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BurglaryPerilPremiumRate"),fetchValueFromTextFields(burglaryPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigRiotStrikePerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("RiotStrikePerilPremiumRate"),fetchValueFromTextFields(riotStrikePerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigEarthquakePerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("EarthquakePerilPremiumRate"),fetchValueFromTextFields(earthquakePerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigFloodStormPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("FloodStormPerilPremiumRate"),fetchValueFromTextFields(floodStormPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAccidentalPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AccidentalPerilPremiumRate"),fetchValueFromTextFields(accidentalPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigMaliciousPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("MaliciousPerilPremiumRate"),fetchValueFromTextFields(maliciousPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTerroristPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TerroristPerilPremiumRate"),fetchValueFromTextFields(terroristPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTransitPerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TransitPerilPremiumRate"),fetchValueFromTextFields(transitPerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLandslidePerilPremiumRate")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LandslidePerilPremiumRate"),fetchValueFromTextFields(landslidePerilPremiumRateLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigOdPremiumPercentage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("OdPremiumPercentage"),fetchValueFromTextFields(odPremiumPercentageLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicOdPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicOdPremium"),fetchValueFromTextFields(basicOdPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigImtRateOdPremiumPercentage")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ImtRateOdPremiumPercentage"),fetchValueFromTextFields(imtRateOdPremiumPercentageLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigImtRateBasicOdPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ImtRateBasicOdPremium"),fetchValueFromTextFields(imtRateBasicOdPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForRoadworthyCondition")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForRoadworthyCondition"),fetchValueFromTextFields(loadingForRoadworthyConditionLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigLoadingForIndemnityToHirers")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("LoadingForIndemnityToHirers"),fetchValueFromTextFields(loadingForIndemnityToHirersLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedNcbDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedNcbDiscount"),fetchValueFromTextFields(calculatedNcbDiscountLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigImtRateCalculatedNcbDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("ImtRateCalculatedNcbDiscount"),fetchValueFromTextFields(imtRateCalculatedNcbDiscountLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedOdPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedOdPremium"),fetchValueFromTextFields(calculatedOdPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBasicTpPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("BasicTpPremium"),fetchValueFromTextFields(basicTpPremiumLabel), AssertionType.WARNING);
				}				
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAddLlUnderWcaForCarriageOfMoreThanSixEmployees")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AddLlUnderWcaForCarriageOfMoreThanSixEmployees"),fetchValueFromTextFields(addLlUnderWcaForCarriageOfMoreThanSixEmployeesLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigAdditionalPremiumForAmbulancesHearses")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("AdditionalPremiumForAmbulancesHearses"),fetchValueFromTextFields(additionalPremiumForAmbulancesHearsesLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedTpPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedTpPremium"),fetchValueFromTextFields(calculatedTpPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedPremiumMotor")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedPremiumMotor"),fetchValueFromTextFields(calculatedPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalNcbDiscount")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalNcbDiscount"),fetchValueFromTextFields(totalNcbDiscountLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalOdPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalOdPremium"),fetchValueFromTextFields(totalOdPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalTpPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalTpPremium"),fetchValueFromTextFields(totalTpPremiumLabel), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigPremiumMotor")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("PremiumMotor"),fetchValueFromTextFields(premiumLabel), AssertionType.WARNING);
				}
				
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCalculatedPremiumTW")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CalculatedPremiumT"),fetchValueFromTextFields(CalculatedPremiumTW), AssertionType.WARNING);
				}
				
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigTotalODPremiumwithoutDDTW")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("TotalODPremiumwithoutDDT"),fetchValueFromTextFields(TotalODPremiumwithoutDDTW), AssertionType.WARNING);
				}
				
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigInsuredsdeclaredValueIDVforCover")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("InsuredsdeclaredValueIDVforCov"),fetchValueFromTextFields(InsuredsdeclaredValueIDVforCover), AssertionType.WARNING);
				}
				
				
				
				
				
				
				
				
				
				
			}
			if(policyPremiumScheduleEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigCommodityPremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("CommodityPremium"),fetchValueFromFields(CommodityPremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigDutyValuePremium")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("DutyValuePremium"),fetchValueFromFields(DutyValuePremiumTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigWARampSRCCPremiumforCommodity")) {
					assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("WARampSRCCPremiumforCommodity"),fetchValueFromFields(WARampSRCCPremiumforCommodityTextField), AssertionType.WARNING);
				}
				if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigWARampSRCCPremiumforDuty")) {
				assertReference.assertEquals(policyPremiumScheduleEntity.getStringValueForField("WARampSRCCPremiumforDuty"),fetchValueFromFields(WARampSRCCPremiumforDutyTextField), AssertionType.WARNING);
				}
			}
			
		}
	}


	public void backFromPolicyPremiumScheduleDetails(PolicyPremiumScheduleEntity policyPremiumScheduleEntity) {
		if (policyPremiumScheduleEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitPolicyPremiumScheduleDetails(PolicyPremiumScheduleEntity policyPremiumScheduleEntity, CustomAssert assertReference) {
		fillPolicyPremiumScheduleDetails(policyPremiumScheduleEntity,assertReference);
		//backFromPolicyPremiumScheduleDetails(policyPremiumScheduleEntity);
	}
}
