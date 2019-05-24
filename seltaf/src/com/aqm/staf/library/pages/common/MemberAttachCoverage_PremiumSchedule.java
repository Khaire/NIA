package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PolicyMember_InsuredEntity;

public class MemberAttachCoverage_PremiumSchedule extends BasePage {
	private PageElement premiumScheduleTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement	fundTitle;
	private PageElement details2Title;
	private PageElement attributes2Title;
	private PageElement premiumTitle;
	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memeberCodeLabel;
	private PageElement serialNoLabel;
	private PageElement limitsOfLiabilityLabel;
	private PageElement discretionaryDiscountLabel;
	private PageElement discretionaryLoadingLabel;
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
	private PageElement descriptionLabel;
	private PageElement basicPremiumTextField;
	private PageElement staffDiscountForMemberTextField ;
	private PageElement claimLoadingTextField;
	private PageElement claimLoading1TextField;
	private PageElement manualLoadingTextField;
	private PageElement calculatedPremiumTextField;
	private PageElement manualDiscountTextField;
	private PageElement premiumTextField5;
	private PageElement saveButton;
	private PageElement calculatePremiumButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement memberRelationTitle;
	private PageElement memberPaymentListTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement memberAttributes2Title;
	private PageElement premiumSchedule2Title;
	private PageElement premiumForFMTextField;
	private PageElement loadingForHypertensionTextField;
	private PageElement loadingForDiabetesTextField;
	//UK
	private PageElement premiumforOptionalCoverITextField;
	private PageElement premiumforOptionalCoverIIITextField;
	
	//ES
	private PageElement basicPremiumRateInUSDTextField;
	private PageElement usdCurrencyValueTextField;
	private PageElement basicPremiumRateTextField;
	private PageElement premiumDiscountforCorporatePortalTextField;

	private PageElement insuredInterestTab;

	//CD CE
	private PageElement premiumCDCETextField;
	//PU
	private PageElement premiumforTableATextField;
	private PageElement premiumforTableBTextField;
	private PageElement premiumforTableCTextField;
	private PageElement premiumforTableDTextField;
	private PageElement totalAddonPremiumTextField;
	private PageElement groupDiscountTextField;
	private PageElement medicalExtensionPremiumLoadingTextField;

	//GH
	private PageElement premiumSTDRSKTextField;	
	private PageElement pABasicPremiumTextField;
	private PageElement mCBasicPremiumTextField;

	//BH
	private PageElement totalPremiumIncludingExtensionPremiumBHTextField;
	private PageElement extensionPremiumBHTextfield;
	private PageElement premiumBHTextField;
	//GT
	private PageElement premiumGTextField;
	private PageElement claimDiscountGTTextField;
	private PageElement highClaimLoadingPercentGTTextField;
	private PageElement claimloadingGTTextField; 
	private PageElement lowClaimDiscountPercentGTTextField;
	private PageElement groupDiscountPercentGTTextField;
	private PageElement groupDiscountForSgmcGTTextField;
	private PageElement refundPremiumForOMPGTPolicyTextfield;
	//sc
	private PageElement familyDiscountForTheMemberTextfield;
	//EP
	private PageElement annualSDCPremiumRateEPTextField; 
	private PageElement sDCPremiumRateEP;
	private PageElement premiumEP;
	//fc
	private PageElement sDCPremiumRateTextField;
	private PageElement annualSDCPremiumRateTextfield;
	private PageElement sDCPremiumRateTextfield;
	private PageElement specialdiscountinlieuofAgencyCommissionTextfield;

	//MISC_LOB
	//CO
	private PageElement shortPeriodFactorTextField;
	private PageElement adverseLoadingTextField;
	private PageElement refrigeratedPremiumTextField;
	private PageElement lolLoadingRateTextField;
	private PageElement loadingForHiredVehicleCoverTextField;
	private PageElement loadingForRSMDTextField;
	private PageElement loadingForShortageDueToTheftOrPilferageOfCargoTextField; 
	private PageElement loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField;
	private PageElement loadingForBreakageTextField;
	private PageElement premiumOnTurnoverTextField;
	private PageElement voluntaryExcessDiscountTextField;
	private PageElement premiumForMiscTextField;
	//DO
	private PageElement loadingForOutsideDirectorshipTextField;
	private PageElement loadingForSpousalExtensionTextField;
	private PageElement loadingForLegalHeirsAndRepresentativesTextField;
	private PageElement LoadingForEntityCoverageForSecuritiesTextField;
	private PageElement loadingForInitialPublicOfferingTextField;
	private PageElement loadingForOtherAdditionalExtensionsTextField;
	private PageElement loadingForAcquisitionorMergerTextField;
	private PageElement loadingForCrisisCommunicationCoverTextField;
	private PageElement loadingForCourtAttendanceCostTextField;
	private PageElement loadingForRiskManagementTextField;
	private PageElement loadingForPollutionDefenseCostTextField;
	private PageElement loadingForEmploymentPracticeLiabilityTextField;
	private PageElement loadingForDirectorVersusDirectorTextField;
	private PageElement loadingForShadowDirectorshipTextField;
	private PageElement loadingForAutoAcquisitionOfSubsidiariesTextField;
	private PageElement loadingForComputerCrimeInsuranceTextField;
	private PageElement loadingForDiscoveryPeriodTextField;
	private PageElement loadingForEntityCoverageForEPLITextField;

	//Rural HD
	private PageElement annualSDCPremiumRateTextField;
	//private PageElement basicPremiumTextField;
	private PageElement discountcalculatedTextField;
	private PageElement loadingcalculatedTextField;
	private PageElement specialDiscountTextField;
	private PageElement longtermdiscountTextField;
	private PageElement longTermDiscountTextField;
	private PageElement premiumHDTextField; 
	/*private PageElement groupDiscountTextField;
	private PageElement groupDiscountTextField;
	private PageElement calculatedPremiumTextField;
	 */

	private PageElement malusTextfield;
	private PageElement adverseClaimLoadingTextfield;
	private PageElement basicPremiumForCITextfield;
	private PageElement groupDiscountForCATextField;
	private PageElement discountTextField;
	private PageElement loadingTextField;
	private PageElement premiumForDCTextField;
	private PageElement basicPremiumForGGTextField;

	//DC
	private PageElement sDCPremiumRateTextFieldDC;

	//CX
	private PageElement cxPremiumTextField;
	//ES
	private PageElement basicPremiumRateESTextField;

	//WC
	private PageElement discountForVoluntaryExcessTextField;
	private PageElement premiumWCTextField;

	//LN
	private PageElement loadingForTurnoverTextField;
	private PageElement totalPremiumTextField;
	private PageElement premiumLNTextField;

	//ZP
	private PageElement premiumTextFieldZP;
	private PageElement basicPremiumTextFieldZP;
	//YH
	private PageElement basicPremiumRateTextFieldYH;
	private PageElement basicPremiumTextFieldYH;

	// YI
	private PageElement addOnAnnualPremiumRateTextField;
	private PageElement addOnPremiumRateTextField;
	private PageElement addOnPremiumTextField;

	//Chintan
	private PageElement rateTextField;
	private PageElement sTFIDeletionRateTextField;
	private PageElement basicRateTextField;
	private PageElement earthquakeRateTextField;
	private PageElement policyRateFireTextField; 
	private PageElement netBasicRateTextField;	
	private PageElement netPolicyRateTextField; 
	private PageElement maximumNetPolicyRateTextField; 	
	private PageElement premiumUnderBasicPolicyTextField; 	
	private PageElement premiumForSTFIReverseTextField; 
	private PageElement totalPremiumExcludingTerrorismCoverTextField;	
	private PageElement totalPremiumIncludingVoluntaryDeductiblesTextField;
	private PageElement totalPremiumIncludingDirectBusinessDiscountTextField;
	private PageElement totalPremiumIncludingTerrorismCoverTextField; 
	private PageElement totalPremiumTextField1;
	private PageElement premiumTextFireField; 
	private PageElement premiumTextField1;
	private PageElement premiumTextField;
	private PageElement premiumTextFieldCR;
	//DC
	private PageElement basicPremiumTextFieldDC;   
	//YK
	private PageElement annualPTDPremiumRateTextfield;
	private PageElement premiumforNonPetrochemicalBlockTextField;


	private PageElement premiumAddOn1002CoverTextField; 
	private PageElement premiumAddOn1005CoverTextField; 
	private PageElement premiumAddOn1006CoverTextField; 
	private PageElement premiumAddOn1007CoverTextField;
	private PageElement premiumAddOn1011CoverTextField;
	private PageElement premiumAddOn1012CoverTextField; 
	private PageElement premiumAddOn1111CoverTextField; 
	private PageElement premiumAddOn1112CoverTextField;

	private PageElement premiumAddOn1017CoverTextField;
	//DK
	private PageElement extraPremiumTextField;
	//AR
	private PageElement weightedAverageRateMDFireTextField;
	private PageElement weightedAverageRateMDMBTextField;
	private PageElement totalPremiumMDFireTextField;
	private PageElement totalPremiumMDMBTextField;
	private PageElement totalPremiumMDSectionTextField;
	private PageElement premiumMDIncludingVoluntaryDeductiblesTextField;
	private PageElement bASISRateBIFireTextField;
	private PageElement iARApplicableProfitsRateTextField;
	private PageElement totalPremiumBIFireTextField;
	private PageElement premiumBIIncludingVoluntaryDeductiblesTextField; 
	private PageElement premiumIARPolicyTextField;
	private PageElement premiumIARPolicyIncludingIARDiscountTextField; 
	private PageElement premiumIARPolicyIncludingDirectDiscountTextField; 
	//DF
	private PageElement floaterPolicyRateTextField; 
	private PageElement rSMDDeletionRateTextField; 
	private PageElement spontaneousCombustionRateTextField;
	private PageElement terrorismRateTextField; 
	private PageElement forestFireRateTextField; 
	private PageElement impactDamageRateTextField; 
	private PageElement totalPremiumForAllAddOnCoverExceptTerrorismTextField;
	private PageElement totalPremiumFireTextfield;
	//LP
	private PageElement premiumDualBasisTextField;
	private PageElement premiumProrataTextField;
	private PageElement premiumLayOffTextField;
	private PageElement premiumAuditorsTextField;
	private PageElement premiumExtCustPremisesTextField;;
	private PageElement premiumExtCustProprtyOtherSitTextField;
	private PageElement premiumExtCoverSupplierPremisesTextField;
	private PageElement premiumExtelectGasWaterTextField;
	private PageElement premiumExtSpoilageConseqLossTextField;
	private PageElement oldPumpsetLoadingPercentTextField;
	private PageElement oldPumpsetLoadingTextField;
	private PageElement premiumForAddOn1018CoverTextField;

	private PageElement totalPremiumFDTextField;
	private PageElement totalPremiumTextFieldFD;
	private PageElement totalPremiumSATextField;
	//SF
	private PageElement totalPremiumSFTextField;
	private PageElement premiumAddOn1003CoverTextField; 
	private PageElement premiumAddOn1004CoverTextField; 
	private PageElement premiumAddOn1009CoverTextField; 
	private PageElement premiumAddOn1010CoverTextField; 
	private PageElement premiumAddOn1013CoverTextField; 
	private PageElement premiumAddOn1014CoverTextField; 
	private PageElement premiumAddOn1015CoverTextField; 
	private PageElement premiumAddOn1016CoverTextField; 
	private PageElement premiumAddOn1018CoverTextField; 
	private PageElement premiumAddOn1110CoverTextField;
	//LP-SHRUTI
	private PageElement premiumForLPTextField;
	private PageElement grossPremiumTextField;
	//DG
	private PageElement insuredInterestSumLabel;
	private PageElement addOnSectionPremiumTextField;
	//MB
	private PageElement basicRateforMachineryBreakdownPercentTextField;
	private PageElement higherExcessDiscountMBTextField;
	private PageElement rateAfterHigherExcessMBTextField;
	private PageElement techDiscountMachineTextField;
	private PageElement rateAfterTechDiscountMBTextField;
	private PageElement rateAfterTechDiscrDiscountTextField;
	private PageElement policyRateMBTextField;
	//HB
	private PageElement theftCoverPremiumRateTextField;
	private PageElement TFTPremiumRateTextField;
	private PageElement theftCoverPremiumTextField;
	private PageElement floodCoverPremiumRateTextField;
	private PageElement floodCoverPremiumTextField;

	//EI
	private PageElement totalPremiumScheduleTextField;
	private PageElement deletionOfFireAndAlliedPerilsDiscountRateTextField ; 		
	private PageElement netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField ;	
	private PageElement netRateAfterHigherExcessDiscountTextField; 	
	private PageElement technicalDiscountRateTextField;	
	private PageElement netRateAfterTechnicalDiscountTextField; 	
	private PageElement discretionaryAndAdditonalDiscretionaryDiscountRateTextField; 	
	private PageElement netRateAfterAllDiscountsTextField; 	
	private PageElement earthquakeExtraTextField ;		
	private PageElement basicPremiumOfSTFICoverTextField; 	
	private PageElement ratepercentForSTFICoverTextField ;	
	private PageElement earthQuakePremiumTextField ;	
	private PageElement discountInLieuOfAgentCommissionTextField;
	private PageElement totalSumInsuredTextField;

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
	private PageElement eQpremiumTextField;
	private PageElement totalPolicyRateTextField;	
	private PageElement totalPolicyRateOldTextField;
	private PageElement basicPremiumNewTextField ;
	private PageElement basicPremiumOldTextField 	;
	private PageElement basicCoveragePremiumNewTextField;	
	private PageElement basicCoveragePremiumOldTextField;
	private PageElement totalPremiumOldNewTextField;
	private PageElement totalDiscountTechcommercialTextField;	
	private PageElement premiumAfterAllDiscountsTextField ;	


	private PageElement policyEscalationPremiumTextField;
	private PageElement premForDismantlingRiskTextField;
	private PageElement premForMaintenanceCoverTextField;
	private PageElement premForEscalationCostTextField;
	//EF
	private PageElement escalationRateTextField;
	private PageElement escalationPremiumEFTextField;
	//EC
	private PageElement deletionOfFireAndLighteningDiscountRateTextField;
	private PageElement netRateAfterDeletionOfFireAndLighteningDiscountTextField;
	private PageElement claimExperienceDiscountOrLoadingTextField;
	private PageElement escalationOfSiTextField;
	private PageElement debrisRemovalRateTextField;
	private PageElement debrisRemovalPremiumTextField;
	private PageElement expressFreightRateTextField;
	private PageElement expressFreightPremiumTextField;
	private PageElement airFreightRateTextField;
	private PageElement airFreightPremiumTextField;
	private PageElement surroundingPropertyRateTextField;
	private PageElement surroundingPropertyPremiumTextField;
	private PageElement thirdPartyLiabilityRateTextField;
	private PageElement thirdPartyLiabilityPremiumTextField;
	private PageElement additionalCustomDutyRateTextField;
	private PageElement additionalCustomDutyPremiumTextField;
	private PageElement totalAddOnPremiumTextField;
	private PageElement teRateUpto500crTextField;
	private PageElement sumInsuredForTerrorismTextField;
	private PageElement terrorismExtensionPremiumTextField;
	private PageElement PremiumEngineering;

	// CF

	private PageElement basicRateForCPMTextField;
	private PageElement basicRateUndergroundAndRailwayTrackLoadingCFTextField;
	private PageElement netRateAfterHigherExcessDiscountCFTextField;
	private PageElement higherExcessDiscountCFTextField;
	private PageElement earthQuakePremiumCFTextField;
	private PageElement basicPremiumOfSTFICoverCFTextField;
	private PageElement netBasicAndEarthquakePremiumCFTextField;

	private PageElement netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField;
	private PageElement netBasicPremiumTextField;



	// CM

	private PageElement earthquakeExtraCFTextField;

	private PageElement basicPremiumforLiabilityTextFeild;
	private PageElement basicPremiumforHullTextFeild;
	private PageElement calculatePremiumforHullTextFeild;
	//AA
	private PageElement basicPremiumforSparesWarTextFeild;
	private PageElement basicPremiumforAlliedPerilsTextFeild;
	private PageElement basicPremiumforExcessLiabilityTextFeild;
	//HH
	private PageElement basicPremiumforSectionsTextFeild;
	private PageElement basicPremiumHHTextFeild;
	private PageElement premiumforAdditionalDiscountHHTextFeild;

	private PageElement premiumDGMRMDiscretionaryDiscountTextFeild;
	private PageElement adverseClaimExperiencePremiumLoadingTextFeild;
	private PageElement discountAmountforDirectBusinessTextFeild;
	private PageElement otherPremiumLoadingTextFeild;
	//AH
	private PageElement hullCoverPremiumAHTextField;
	private PageElement extensionOfGeographicalAreaPremiumTextField;
	//DS
	private PageElement discountBasedOnClaimRatioTextField;
	private PageElement loadingBasedOnClaimRatioTextField;
	private PageElement excessBasedOnClaimRatioTextField; 
	private PageElement basicRateForDSTextField; 
	private PageElement premiumBasedOnDesignedStorageCapacityTextField; 
	private PageElement miniumPremiumForDSTextField; 
	private PageElement premiumBasedOnDSSiTextField; 
	private PageElement actualPremiumForDSTextField; 
	private PageElement dSPremiumAfterDiscretionaryAdditionalDiscretionaryDiscTextField; 
	private PageElement premiumForDSAfterDiscountInLieuOfAgentCommissionTextField; 
	//ALOP
	private PageElement fIFForALOPTextField;
	private PageElement factorOfImpactFimTextField;
	private PageElement premiumForWPTextField;
	//WP
	private PageElement premiumAfterDiscountInLieuOfAgentCommissionTextfield;
	private PageElement premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextfield;
	private PageElement stipulatedAgeForBasicRateTextField;


	//HH
	private PageElement	basicPremiumSection1BTextField;
	private PageElement	basicPremiumSection3TextField;


	private PageElement premiumRateforCPM1TextField;
	private PageElement premiumRateforCPM2TextField;
	private PageElement premiumRateforCPM3TextField;
	private PageElement premiumRateforCPM4TextField;
	private PageElement premiumRateforCPM5TextField;
	private PageElement basicPremiumRateforCPM1TextField;
	private PageElement basicPremiumRateforCPM2TextField;
	private PageElement basicPremiumRateforCPM3TextField;
	private PageElement basicPremiumRateforCPM4TextField;
	private PageElement basicPremiumRateforCPM5TextField;
	private PageElement premiumAfterAllDiscountsTextFieldForCR;

	private PageElement basicPremiumRateYRTextField;
	private PageElement sDCPremiumRateYRTextField;
	private PageElement loadingcalculatedYRTextField;	
	private PageElement lossesUnseasonalRainsandFrostPremiumRateTextField;	
	private PageElement discountcalculatedYRTextField ;	
	private PageElement lossesUnseasonalRainsandFrostPremiumTextField; 	
	private PageElement calculatedPremiumYRTextField;

	private PageElement basicPremiumForMPTextField;
	//BB	
	private PageElement premiumforMoneyinPremisesTextField;
	private PageElement premiumforMoneyinTransitTextField; 
	private PageElement staffLoadingAmountTextField;
	//BA
	private PageElement floaterExtraPremiumTextField;

	//BD

	private PageElement premiumforStockinTradeTextField;
	private PageElement premiumforGoodsheldinTrustorCommissionTextField; 
	private PageElement basicPremiumTheftTextField;
	private PageElement basicPremiumOtherTextField;
	private PageElement basicPremiumTotalTextField; 
	private PageElement basicPremiumBDTextField;  	 

	//deep
	private PageElement	firePerilPremiumRateTextField;
	private PageElement	totalDiscountonUsedwithinownPremisesTextField;
	private PageElement	burglaryPerilPremiumRateTextField;
	private PageElement	totalNCBDiscountTextField;
	private PageElement	riotStrikePerilPremiumRateTextField;
	private PageElement	totalODPremiumTextField;
	private PageElement	earthquakePerilPremiumRateTextField; 		
	private PageElement	totalTPPremiumTextField; 		
	private PageElement	floodStormPerilPremiumRateTextField; 		
	private PageElement	premiumMotorTextField; 		
	private PageElement	accidentalPerilPremiumRateTextField; 		
	private PageElement	maliciousPerilPremiumRateTextField; 		
	private PageElement	terroristPerilPremiumRateTextField; 		
	private PageElement	transitPerilPremiumRateTextField; 		
	private PageElement	landslidePerilPremiumRateTextField; 		
	private PageElement	oDPremiumPercentageTextField; 	
	private PageElement	additionalODPremiumAmountTextField; 		
	private PageElement	basicODPremiumTextField; 		
	private PageElement	iMTRateODPremiumpercentageTextField; 		
	private PageElement	iMTRateBasicODPremiumTextField;	 		
	private PageElement	additionalpremiumforGVWabove12000KGTextField; 		
	private PageElement	iMTRateAdditionalpremiumforGVWabove12000kgTextField; 		
	private PageElement	loadingforRoadworthyConditionTextField; 		
	private PageElement	calculatedNCBDiscountTextField; 		
	private PageElement	iMTRateCalculatedNCBDiscountTextField; 		
	private PageElement	calculatedODPremiumTextField; 		
	private PageElement	basicTPPremiumTextField; 		
	private PageElement	addLLunderWCAforcarriageofmorethansixemployeesTextField; 		
	private PageElement	calculatedTPPremiumMotorTextField; 		
	private PageElement	calculatedPremiumMotorTextField;
	private PageElement   basicTPPremiumCVETextField;
	private PageElement firePerilPremiumRateCVETextField;
	private PageElement burglaryPerilPremiumRateCVETextField;
	private PageElement landslidePerilPremiumRateCVETextField;
	private PageElement calculatedTPPremiumCVEMotorTextField;
	private PageElement calculatedPremiumCVEMotorTextField;
	//CV-G
	private PageElement odDiscountForPrmisesCVGMotorTextField;
	private PageElement calculatedODPremiumCVGMotorTextField;
	private PageElement basicTPPremiumCVGMotorTextField;
	private PageElement tpDiscountForPrmisesCVGMotorTextField;
	private PageElement tpLoadingForWorkingAwayCVGMotorTextField;
	private PageElement calculatedTPPremiumCVGMotorTextField;
	private PageElement calculatedPremiumCVGMotorTextField;
	private PageElement totalOdPremiumCVGMotorTextField;
	private PageElement totalTPPremiumCVGMotorTextField;
	private PageElement premiumCVGMotorTextField;


	private PageElement calculatedPremiumCVbMotorTextField;

	//PC
	private PageElement oDPremiumPercentagePCTextField;
	private PageElement imtRateODPremiumpercentagePCTextField;
	private PageElement	basicODPremiumPCTextField;
	private PageElement imtRateBasicODPremiumPCTextField;
	private PageElement additionalPremiumforNonElectricalfittingPCTextField;
	private PageElement totalODPremiumwithoutDDPCTextField;
	private PageElement calculatedODPremiumPCTextField;
	private PageElement basicTPPremiumPCTextField;
	private PageElement calculatedTPPremiumPCTextField;
	private PageElement calculatedPremiumPCTextField;
	private PageElement basicODPremiumodPCTextField;
	private PageElement additionalPremiumforNonElectricalfittinggPCTextField;
	private PageElement	premiumodPCTextField;



	// hmm code commited by anzaf for marine hull primium page 
	private PageElement TotalPremiumforSection;
	private PageElement CalculatedPremium;
	private PageElement ManualLoading;
	private PageElement ManualDiscount;
	private PageElement Premiumcp;
	private PageElement saveCpButton;

	private PageElement BasicTLRateinpercent;
	private PageElement TLRateinpercentbasedonMakeType;
	private PageElement TLRate;
	private PageElement BasicOTLRateinpercent;
	private PageElement OTLRateinpercentbasedonMakeType;
	private PageElement OTLRate;
	private PageElement BasicHMRateinpercent;
	private PageElement HMRateinpercentbasedonIRSDiscount;
	private PageElement HMRateinpercentbasedonOwnersDiscount;
	private PageElement HMRateinpercentbasedonDeTariffDiscount;
	private PageElement HMRateinpercentbasedonNoClaimsDiscount;
	private PageElement HMRate;
	private PageElement BasicPremium;
	private PageElement WARCoverPremium;
	private PageElement CalculatedPremiumwr;
	private PageElement Premiumhm;
	//RK
	private PageElement premiumForRoadAccidentTextField;
	private PageElement premiumCalculatedRKTextField;

	//code commited by md anzaf
	private PageElement PremiumAL;
	private PageElement PremiumVI;
	private PageElement PremiumVILOADING;
	private PageElement VoyageRate;
	private PageElement BasicPremiumVI;

	//code for UC
	private PageElement discountUCTextField;
	private PageElement loadingUCTextField;
	private PageElement premiumForUCTextField;
	//TW(Motor)
	private PageElement oDPremiumPercentageTWTextField;
	private PageElement imtRateODPremiumpercentageTWTextField;
	private PageElement basicODPremiumTWTextField;
	private PageElement imtRateBasicODPremiumTWTextField;
	private PageElement insuredDeclaredValueCoverTWTextField;
	private PageElement additionalPremiumForFiberGlassTWTextField;
	private PageElement totalOdPremiumWithoutDDTWTextField;
	private PageElement calculatedOdPremiumTWTextField;
	private PageElement basicTPPremiumTWTextField;
	private PageElement calculatedTPPremiumTWTextField;
	private PageElement calculatedPremiumTWTextField;
	private PageElement totalODPremiumTWTextField;
	private PageElement totalTpPremiumTWTextField;
	private PageElement premiumTWTextField;
	private PageElement insuredInterestCodeLabel;


	public MemberAttachCoverage_PremiumSchedule(WebDriver driver,String pageName) {
		super(driver, pageName);
		
		PremiumVI=new PageElement(By.xpath("//*[@name='pParameter33']"),"Premium For vi", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		PremiumVILOADING=new PageElement(By.xpath("//*[@name='pParameter15']"),"Premium For Road Accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		VoyageRate=new PageElement(By.xpath("//*[@name='pParameter13']"),"VOYAGE RATE", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		BasicPremiumVI=new PageElement(By.xpath("//*[@name='pParameter14']"),"BESIC PREMIUM", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
		premiumForRoadAccidentTextField=new PageElement(By.name("pParameter13"),"Premium For Road Accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumCalculatedRKTextField=new PageElement(By.name("pParameter110")," Premium Calculated", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Attribute"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		//relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relationsTitle=new PageElement(By.xpath("/html/body/form[1]/table[1]/tbody/tr[2]/td[2]/a/div/b"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		fundTitle=new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		details2Title=new PageElement(By.linkText("Details"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes2Title=new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		premiumTitle=new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Quote No")),"Quote No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Policy No")),"Policy NoLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Status")),"Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Policyholder")),"Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Product")),"Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memeberCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Member Code")),"Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Serial No.")),"Serial No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		limitsOfLiabilityLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Limits of Liability")),"Limits Of Liability Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Discretionary Discount")),"Discretionary Discount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryLoadingLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Discretionary Loading")), "Discretionary Loading Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Coverage Code")),"Coverage Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Coverage Name")),"Coverage Name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Description")),"Description Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::td/input"),"BasicPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		staffDiscountForMemberTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Staff Discount for Member')]/following::td/input"),"StaffDiscountForMember",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Claim Loading(%)')]/following::td/input"),"Claim Loading Percentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimLoading1TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Claim Loading')]/following::td/input"),"Claim Loading ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Calculated Premium')]/following::td/input"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		manualLoadingTextField=new PageElement(By.xpath("//font//b[contains(text(),'Manual Loading')]/following::input[1]"),"ManualLoading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		manualDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Manual Discount')]/following::td/input"),"ManualDiscount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumTextField5=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium')]/following::td[3]/input"), "Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		calculatePremiumButton=new PageElement(By.name("Calculate Premium"), "calculatePremiumButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
        calculatePremiumButton=new PageElement(By.xpath("//input[@name='Calculate Premium']"), "calculatePremiumButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//UK
        premiumforOptionalCoverITextField= new PageElement(By.xpath("//input[@name='pParameter14']"),"Premium for Optional Cover I",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforOptionalCoverIIITextField= new PageElement(By.xpath("//input[@name='pParameter16']"),"Premium for Optional Cover III",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
        
        /////ZP---Mangesh
		premiumTextFieldZP=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Premium')]/following::td[11]/input"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		backButton=new PageElement(By.name("Back"), "BackButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyMemberDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle=new PageElement(By.xpath("//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationTitle=new PageElement(By.xpath("//b[contains(text(),'Member Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributes2Title=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumSchedule2Title=new PageElement(By.xpath("//b[contains(text(),'Premium Schedule')]"), "Premium Schedule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		premiumForFMTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium For FM')]/following::td/input"),"Premium For FM TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForHypertensionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading For Hypertension')]/following::td/input"),"Loading For Hypertension TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDiabetesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading For Diabetes')]/following::td/input"),"Loading For Diabetes TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//ES

		basicPremiumRateInUSDTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Rate In USD')]/following::td/input"),"Basic Premium Rate In USD TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		usdCurrencyValueTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'USD Currency Value')]/following::td/input"),"USD Currency Value TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Manual Discount')]/following::td[3]/input"),"Basic Premium Rate TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumDiscountforCorporatePortalTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium Discount for Corporate Portal')]/following::td/input"),"Premium Discount for Corporate Portal TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		insuredInterestTab=new PageElement(By.linkText("Insured Interest"),"Insured Interest Tab",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//CD CE
		premiumCDCETextField = new PageElement(By.xpath("//form[@name='S0050']//tr//td//font[contains(text(),'Premium')]/following::td[6]//following::input"),"Premium TextField for CE CD",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//PU 
		premiumforTableATextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Table A')]/following::td/input"),"Premium for Table A TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforTableBTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Table B')]/following::td/input"),"Premium for Table B TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforTableCTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Table C')]/following::td/input"),"Premium for Table C TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforTableDTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Table D')]/following::td/input"),"Premium for Table D TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalAddonPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Add-on Premium')]/following::td/input"),"Total Add-on Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Group Discount (%)')]/following::td/input"),"Group Discount (%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountForCATextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Group Discount')]/following::td[3]/input"),"Group Discount (%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		medicalExtensionPremiumLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Medical Extension Premium Loading')]/following::td/input"),"Medical Extension Premium Loading TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Calculated Premium')]/following::td/input"),"Calculated Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//GH
		premiumSTDRSKTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::td[3]/input"),"premium STDRSK TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		pABasicPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//font//b[contains(text(),'Premium')]/following::td//following::input"),"PA BasicPremiumTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		mCBasicPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//font//b[contains(text(),'Premium')]/following::td[4]//following::input"),"MC Basic PremiumTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalPremiumIncludingExtensionPremiumBHTextField=new PageElement(By.xpath("//form[@name='S0050']//td//font//b[contains(text(),'Premium')]/following::td[4]//following::input"),"Total Premium including Extension Premium BH Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		extensionPremiumBHTextfield=new PageElement(By.xpath("//tr//td//font//b[contains(text(),'Extension')]/following::tr/td/input"),"Extension Premium BH Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumBHTextField=new PageElement(By.xpath("//tr//td//font//b[contains(text(),'Premium')]//following::tr[2]/td[4]/input"),"Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//GT
		premiumGTextField=new PageElement(By.xpath("//tr//td//font//b[contains(text(),'Premium')]//following::tr[3]/td[4]/input"),"Premium GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDiscountGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Claim')]/following::td/input"),"Claim Discount GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		highClaimLoadingPercentGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'High Claim Loading')]/following::td/input"),"High Claim Loading Percent GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimloadingGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Claim Loading')]/following::tr/td/input"),"Claim Loading GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lowClaimDiscountPercentGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Low Claim Discount(%)')]/following::td/input"),"Low Claim Discount GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountPercentGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Group Discount (%)')]/following::td/input"),"Group Discount (%) GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		groupDiscountForSgmcGTTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Group Discount for SGMC')]/following::td/input"),"Group Discount for SGMC GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refundPremiumForOMPGTPolicyTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Refund Premium for OMP Policy')]/following::td/input"),"Refund Premium for OMP Policy  GT Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//sc
		familyDiscountForTheMemberTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Family Discount For the Member')]/following::td/input"),"Family Discount For the Member Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//EP
		annualSDCPremiumRateEPTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Annual SDC Premium Rate')]/following::td/input"),"Annual SDC Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//FC

		//BW
		annualSDCPremiumRateTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Annual SDC Premium Rate')]/following::td/input"),"Annual SDC Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		sDCPremiumRateTextfield=new PageElement(By.xpath("//form[@name='S0050']//font//b[contains(text(),'Rate')]/following::td[5]/input"),"SDC Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		specialdiscountinlieuofAgencyCommissionTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Agency Commission')]/following::td/input"),"Special discountin lieu of Agency Commission Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		malusTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Malus(%)')]/following::td/input"),"Malus Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adverseClaimLoadingTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Adverse claim Loading')]/following::td/input"),"Adverse claim Loading Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumForCITextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::td/input"),"Basic Premium CI Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//CO-MISC
		shortPeriodFactorTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Short Period Factor')]/following::td/input"),"Short Period Factor Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adverseLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Adverse Loading')]/following::td/input"),"Adverse Loading Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refrigeratedPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Refrigerated Premium')]/following::td/input"),"Refrigerated Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lolLoadingRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'LOL Loading Rate')]/following::td/input"),"LOL Loading Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForHiredVehicleCoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Hired Vehicle Cover')]/following::td/input"),"Loading for Hired Vehicle Cover Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForRSMDTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for RSMD')]/following::td/input"),"Loading for RSMD Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForShortageDueToTheftOrPilferageOfCargoTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Shortage due to theft or pilferage of cargo')]/following::td/input"),"Loading for Shortage due to theft or pilferage of cargo Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Flood or Water damage or damage by any other cargo')]/following::td/input"),"Loading for Flood or Water damage or damage by any other cargo Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForBreakageTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for breakage')]/following::td/input"),"Loading for breakage Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumOnTurnoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium on turnover')]/following::td/input"),"Premium on turnover Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		voluntaryExcessDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Voluntary Excess Discount')]/following::td/input"),"Voluntary Excess Discount Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForMiscTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium')]/following::td[7]/input"),"Premium For Misc Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DO
		loadingForOutsideDirectorshipTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Outside directorship')]/following::td/input"),"Loading for Outside directorship Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForSpousalExtensionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Spousal extension')]/following::td/input"),"Loading for Spousal extension Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForLegalHeirsAndRepresentativesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Legal heirs and representatives')]/following::td/input"),"Loading for Legal heirs and representatives Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		LoadingForEntityCoverageForSecuritiesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Entity coverage for securities')]/following::td/input"),"Loading for Entity coverage for securities Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForInitialPublicOfferingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Initial public offering')]/following::td/input"),"Loading for Initial public offering Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForOtherAdditionalExtensionsTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Other additional extensions')]/following::td/input"),"Loading for Other additional extensions Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAcquisitionorMergerTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Acquisition or Merger')]/following::td/input"),"Loading for Acquisition or Merger Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForCrisisCommunicationCoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Crisis Communication cover')]/following::td/input"),"Loading for Crisis Communication cover Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForCourtAttendanceCostTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Court Attendance Cost')]/following::td/input"),"Loading for Court Attendance Cost Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForRiskManagementTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Risk Management')]/following::td/input"),"Loading for Risk Management Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForPollutionDefenseCostTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Pollution defense Cost')]/following::td/input"),"Loading for Pollution defense Cost Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForEmploymentPracticeLiabilityTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Employment Practice Liability')]/following::td/input"),"Loading for Employment Practice Liability Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDirectorVersusDirectorTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Director versus Director')]/following::td/input"),"Loading for Director versus Director Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForShadowDirectorshipTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Shadow Directorship')]/following::td/input"),"Loading for Shadow Directorship Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForAutoAcquisitionOfSubsidiariesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Auto acquisition of subsidiaries')]/following::td/input"),"Loading for Auto-acquisition of subsidiaries Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForComputerCrimeInsuranceTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Computer Crime Insurance')]/following::td/input"),"Loading for Computer Crime Insurance Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForDiscoveryPeriodTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Discovery Period')]/following::td/input"),"Loading for Discovery Period Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingForEntityCoverageForEPLITextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Entity coverage for EPLI')]/following::td/input"),"Loading for Entity coverage for EPLI Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Rural HD
		annualSDCPremiumRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Annual SDC Premium Rate')]/following::td/input"),"Annual SDC Premium Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//sDCPremiumRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::td/input"),"BasicPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountcalculatedTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount calculated')]/following::td/input"),"Discount calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingcalculatedTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading calculated')]/following::td/input"),"Loading calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Special Discount')]/following::td/input"),"Special Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		longtermdiscountTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Long term discount (%)')]/following::td/input"),"Long term discount (%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		longTermDiscountTextField	= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Long Term Discount')]/following::td/input"),"Long Term Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumHDTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic')]/following::td[3]/input"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DC
		discountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Discount')]/following::td[1]/input"),"Discount for DC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading')]/following::td[1]/input"),"Loading for DC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForDCTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium')]/following::td[11]/input"),"Premium Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sDCPremiumRateTextFieldDC=new PageElement(By.xpath("//form[@name='S0050']//font//b[contains(text(),'Rate')]/following::td[5]/input"),"SDC Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//GG
		basicPremiumForGGTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::td[9]/input"),"Basic Premium for GG",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//CX
		cxPremiumTextField=new PageElement(By.xpath("//font//b[contains(text(),'Manual Discount')]//following::tr//td[4]/input"),"CX Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//ES
		basicPremiumRateESTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium Rate')]/following::td/input"),"basic Premium Rate TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//WC
		discountForVoluntaryExcessTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount For Voluntary Excess')]/following::td/input"),"Voluntary Excess Discount Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumWCTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic')]/following::td[3]/input"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//LN
		loadingForTurnoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading for Turnover')]/following::td/input"),"Loading for Turnover Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium')]/following::td/input"),"Total Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumLNTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Voluntary Excess Discount')]/following::td[3]/input"),"LN Premium Text field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//ZP
		basicPremiumTextFieldZP=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium')]/following::td[1]/input"),"basic Premium TextField ZP",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateTextFieldYH=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium')]/following::td[1]/input"),"basic Premium Rate TextField YH",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTextFieldYH=new PageElement(By.xpath("//font//b[contains(text(),'Discount')]/following::td[3]/input"),"basic Premium TextField YH",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//YI
		addOnAnnualPremiumRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'AddOn Annual Premium Rate')]/following::td/input"),"AddOn Annual Premium Rate TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addOnPremiumRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'AddOn Premium Rate')]/following::td/input"),"AddOn Premium Rate TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addOnPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'AddOn Premium')]/following::td[5]/input"),"AddOn Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Chintan
		rateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate')]/following::td/input"),"Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sTFIDeletionRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'STFI Deletion Rate')]/following::td/input"),"STFI Deletion Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Rate')]/following::td/input"),"Basic Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		earthquakeRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Earthquake Rate')]/following::td/input"),"Earthquake Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		policyRateFireTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Policy Rate (Fire)')]/following::td/input"),"Policy Rate (Fire)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netBasicRateTextField	=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Basic Rate')]/following::td/input"),"Net Basic Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPolicyRateTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Policy Rate')]/following::td/input"),"Net Policy Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		maximumNetPolicyRateTextField 	=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Maximum Net Policy Rate')]/following::td/input"),"Maximum Net Policy Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumUnderBasicPolicyTextField 	=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium Under Basic Policy')]/following::td/input"),"Premium Under Basic Policy",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForSTFIReverseTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for STFI Reverse')]/following::td/input"),"Premium for STFI Reverse",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		totalPremiumExcludingTerrorismCoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium ( Excluding Terrorism Cover )')]/following::td/input"),"Total Premium ( Excluding Terrorism Cover ) " ,false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumIncludingVoluntaryDeductiblesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium ( Including Voluntary Deductibles )')]/following::td/input"),"Total Premium ( Including Voluntary Deductibles )",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumIncludingDirectBusinessDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium ( Including Direct Business Discount )')]/following::td/input"),"Total Premium ( Including Direct Business Discount ) ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalPremiumIncludingTerrorismCoverTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium ( Including Terrorism Cover )')]/following::td/input"),"Total Premium ( Including Terrorism Cover )",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumTextFieldFD=new PageElement(By.xpath("//form[@name='S0050']//tr[21]//td//b[contains(text(),'Premium')]/following::td/input"),"Total Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumTextFireField =new PageElement(By.xpath("//form[@name='S0050']//tr[3]//td//b[contains(text(),'Premium')]/following::td/input"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DC
		basicPremiumTextFieldDC=new PageElement(By.xpath("//td//b[contains(text(),'Basic')]/following::td/input"),"basic Premium TextField DC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		annualPTDPremiumRateTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Annual PTD Premium Rate')]/following::td/input"),"Annual PTD Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforNonPetrochemicalBlockTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Non Petrochemical Block')]/following::td/input"),"Annual PTD Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumAddOn1002CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1002 Cover')]/following::td/input"),"Premium for Add On-1002 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1005CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1005 Cover')]/following::td/input"),"Premium for Add On-1005 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumAddOn1006CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1006 Cover')]/following::td/input"),"Premium for Add On-1006 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumAddOn1007CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1007 Cover')]/following::td/input"),"Premium for Add On-1007 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1011CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1011 Cover')]/following::td/input"),"Premium for Add On-1011 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1012CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1012 Cover')]/following::td/input"),"Premium for Add On-1012 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumAddOn1111CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1111 Cover')]/following::td/input"),"Premium for Add On-1111 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumAddOn1112CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1112 cover')]/following::td/input"),"Premium for Add On-1112 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DK
		extraPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Extra Premium')]/following::td/input"),"extra Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//AR
		weightedAverageRateMDFireTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Weighted Average Rate MD(Fire)')]/following::td/input"),"Weighted Average Rate MD(Fire) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		weightedAverageRateMDMBTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Weighted Average Rate MD(MB)')]/following::td/input"),"Weighted Average Rate MD(MB) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalPremiumMDFireTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium MD(Fire)')]/following::td/input"),"Total Premium MD(Fire)Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalPremiumMDMBTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium MD(Fire)')]/following::td[5]/input"),"Total Premium MD(MB)Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumMDSectionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium MD Section')]/following::td/input"),"Total Premium MD Section Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumMDIncludingVoluntaryDeductiblesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium MD (Including Voluntary Deductibles)')]/following::td/input"),"Premium MD (Including Voluntary Deductibles) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		bASISRateBIFireTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'BASIS Rate BI(Fire)')]/following::td/input"),"BASIS Rate BI(Fire) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iARApplicableProfitsRateTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'IAR Applicable Profits Rate')]/following::td/input"),"IAR Applicable Profits Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumBIFireTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium BI(Fire)')]/following::td/input"),"Total Premium BI(Fire) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumBIIncludingVoluntaryDeductiblesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium BI (Including Voluntary Deductibles)')]/following::td/input"),"Premium BI (Including Voluntary Deductibles) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumIARPolicyTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium IAR Policy')]/following::td/input"),"Premium IAR Policy Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumIARPolicyIncludingIARDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium IAR Policy (Including IAR Discount)')]/following::td/input"),"Premium IAR Policy (Including IAR Discount) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumIARPolicyIncludingDirectDiscountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium IAR Policy (Including Direct Discount)')]/following::td/input"),"Premium IAR Policy (Including Direct Discount) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		//DF
		floaterPolicyRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Floater Policy Rate')]/following::td/input"),"Floater Policy Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		rSMDDeletionRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'RSMD Deletion Rate')]/following::td/input"),"RSMD Deletion Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		spontaneousCombustionRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Spontaneous combustion Rate')]/following::td/input"),"Spontaneous combustion Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		terrorismRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Terrorism Rate')]/following::td/input"),"Terrorism Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		forestFireRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Forest Fire Rate')]/following::td/input"),"Forest Fire Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		impactDamageRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Impact Damage Rate')]/following::td/input"),"Impact Damage Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalPremiumForAllAddOnCoverExceptTerrorismTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium for All Add On Cover (Except Terrorism)')]/following::td/input"),"Total Premium for All Add On Cover (Except Terrorism) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalPremiumFireTextfield=new PageElement(By.xpath("//form[@name='S0050']//tr[16]//td//b[contains(text(),'Premium')]/following::td/input"),"Total Premium Fire Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumTextField =new PageElement(By.xpath("//td//font//b[contains(text(),'Premium')]//following::b[4]//following::input[1]"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		PremiumEngineering=new PageElement(By.xpath("//input[@name='pParameter33']"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumTextFieldCR =new PageElement(By.xpath("//td//font//b[contains(text(),'Premium')]//following::input[1]"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//LP
		premiumDualBasisTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Wages - Dual Basis')]/following::input"), "Premium for Wages - Dual Basis",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumProrataTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Wages - Pro rata Basis')]/following::input"), "Premium for Wages - Pro rata Basis",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumLayOffTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Lay off and/or Retrenchment Compensation')]/following::input"), "Premium for Lay off and/or Retrenchment Compensation",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		premiumAuditorsTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Auditors Fee')]/following::input"), "Premium for Auditors Fee",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumExtCustPremisesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Extension to Cover Customers Premises')]/following::input"), "Premium for Extension to Cover Customers Premises",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumExtCustProprtyOtherSitTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Extension to cover Insured Property stored at other situations')]/following::input"), "Premium for Extension to cover Insured Property stored at other situations",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumExtCoverSupplierPremisesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Extension to Cover Suppliers Premises')]/following::input"), "Premium for Extension to Cover Suppliers Premises",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumExtelectGasWaterTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Extension to cover electricity Stations, Gas Works and water works')]/following::input"), "Premium for Extension to cover electricity Stations, Gas Works and water works",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumExtSpoilageConseqLossTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Extension to cover Spoilage Consequential Loss')]/following::input"), "Premium for Extension to cover Spoilage Consequential Loss",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//PS
		oldPumpsetLoadingPercentTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Old Pumpset Loading(%)')]/following::input"), "Old Pumpset Loading(%)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		oldPumpsetLoadingTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Old Pumpset Loading(%)')]/following::td[3]/input"), "Premium for Auditors Fee",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumForAddOn1018CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1018 Cover')]/following::td/input"),"Premium for Add On-1018 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumFDTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[22]//td//b[contains(text(),'Premium')]/following::td/input"),"Total Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalPremiumSATextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium')]/following::td/input"),"Total Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumAddOn1017CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1017 Cover')]/following::td/input"),"Premium for Add On-1017 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//SF

		totalPremiumSFTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Premium')]/following::td[11]/input"),"Total Premium SF TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1003CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1003 Cover')]/following::td/input"),"Premium for Add On-1003 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1004CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1004 Cover')]/following::td/input"),"Premium for Add On-1004 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1009CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1009 Cover')]/following::td/input"),"Premium for Add On-1009 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1010CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1010 Cover')]/following::td/input"),"Premium for Add On-1010 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1013CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1013 Cover')]/following::td/input"),"Premium for Add On-1013 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1014CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1014 cover')]/following::td/input"),"Premium for Add On-1014 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1015CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1015 cover')]/following::td/input"),"Premium for Add On-1015 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1016CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1016 Cover')]/following::td/input"),"Premium for Add On-1016 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1018CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1018 Cover')]/following::td/input"),"Premium for Add On-1018 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAddOn1110CoverTextField=new PageElement(By.xpath("//td//b[contains(text(),'Premium for Add On-1110 Cover')]/following::td/input"),"Premium for Add On-1110 Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//LP Shruti
		premiumForLPTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[3]//td[3]//b[contains(text(),'Premium')]/following::td/input"),"Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		grossPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[3]//td[3]//b[contains(text(),'Premium')]/following::td/input"),"Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DG
		insuredInterestSumLabel=new PageElement(By.xpath("//td//font//b[contains(text(),'Sum Insured/Assured')]/following::td"),"Insured Interest Sum Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addOnSectionPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Loading')]/following::td[3]/input"),"Add On Section Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//MB
		basicRateforMachineryBreakdownPercentTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Rate for Machinery Breakdown(%)')]/following::td/input"),"Basic Rate for Machinery Breakdown(%) ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		higherExcessDiscountMBTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Higher Excess Discount MB')]/following::td/input"),"Higher Excess Discount MB ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateAfterHigherExcessMBTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate After Higher Excess')]/following::td/input"),"Rate After Higher Excess (MB) ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		techDiscountMachineTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Tech Discount')]/following::td/input"),"Tech Discount(Machine)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateAfterTechDiscountMBTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate After Tech Discount')]/following::td/input"),"Rate After Tech Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		rateAfterTechDiscrDiscountTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate After Tech Discr Discount')]/following::td/input"),"Rate After Tech Discr Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRateMBTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Policy Rate')]/following::td/input"),"Policy Rate(MB)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//HB
		theftCoverPremiumRateTextField=new PageElement(By.xpath("//form[@name='S0050']//font//b[contains(text(),'Theft Cover Premium Rate')]/following::td[1]/input"),"Theft Cover Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		TFTPremiumRateTextField=new PageElement(By.xpath("//form[@name='S0050']//font//b[contains(text(),'TFT Premium Rate')]/following::td[1]/input"),"TFT Premium Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		theftCoverPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//font//b[contains(text(),'Theft Cover Premium')]/following::td[9]/input"),"Theft Cover Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//EI
		totalPremiumScheduleTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Sum Insured.')]/following::input"),"Total Sum Insured.",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		deletionOfFireAndAlliedPerilsDiscountRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Deletion of Fire and Allied Perils Discount Rate')]/following::input"),"Deletion of Fire and Allied Perils Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 		
		netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Deletion of Fire and Allied Perils Discount')]/following::input"),"Net Rate after Deletion of Fire and Allied Perils Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		netRateAfterHigherExcessDiscountTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Higher Excess Discount.')]/following::input"),"Net Rate after Higher Excess Discount.",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		technicalDiscountRateTextField =new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Technical Discount Rate')]/following::input"),"Technical Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		netRateAfterTechnicalDiscountTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Technical Discount')]/following::input"),"Net Rate after Technical Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discretionaryAndAdditonalDiscretionaryDiscountRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discretionary and Additonal Discretionary Discount Rate')]/following::input"),"Discretionary and Additonal Discretionary Discount Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);  	
		netRateAfterAllDiscountsTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after all Discounts')]/following::input"),"Net Rate after all Discounts",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		earthquakeExtraTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Earthquake Extra')]/following::input"),"Earthquake Extra",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	 	
		basicPremiumOfSTFICoverTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium of STFI Cover')]/following::input"),"Basic Premium of STFI Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		ratepercentForSTFICoverTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Rate (%) for STFI Cover')]/following::input"),"Rate (%) for STFI Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		earthQuakePremiumTextField = new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Earth Quake premium')]/following::input"),"Earth Quake premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discountInLieuOfAgentCommissionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount in Lieu of Agent Commission.')]/following::input"),"Discount in Lieu of Agent Commission.",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalSumInsuredTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Sum Insured.')]/following::input"),"Total sum insured",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//ER

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


		policyEscalationPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//tr[3]//td//b[contains(text(),'Premium')]/following::td/input"),"Premium For Esclation",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premForDismantlingRiskTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium For Dismantling Risk')]/following::input"),"Premium For Dismantling Risk",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premForMaintenanceCoverTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium For Maintenance Cover')]/following::input"),"Premium For Maintenance Cover",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premForEscalationCostTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium For Escalation Cost')]/following::input"),"Premium For Escalation Cost",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//EF
		escalationRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Escalation Rate')]/following::td/input"),"Escalation Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		escalationPremiumEFTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Escalation Premium')]/following::td/input"),"Escalation Premium ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//EC

		deletionOfFireAndLighteningDiscountRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Deletion of Fire and Lightening Discount Rate')]/following::td/input"),"Deletion of Fire and Lightening Discount Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netRateAfterDeletionOfFireAndLighteningDiscountTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Net Rate after Deletion of Fire and Lightening Discount')]/following::td/input"),"Net Rate after Deletion of Fire and Lightening Discount  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimExperienceDiscountOrLoadingTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Claim Experience Discount or Loading')]/following::td/input"),"Claim Experience Discount or Loading ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		escalationOfSiTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Escalation Of SI')]/following::td/input"),"Escalation Of SI  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debrisRemovalRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Debris Removal Rate')]/following::td/input"),"Debris Removal Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		debrisRemovalPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Debris Removal Premium')]/following::td/input"),"Debris Removal Premium ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expressFreightRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Express Freight Rate.')]/following::td/input"),"Express Freight Rate. ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expressFreightPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Express Freight Premium')]/following::td/input"),"Express Freight Premium  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		airFreightRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Air Freight Rate')]/following::td/input"),"Air Freight Rate  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		airFreightPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Air Freight Premium')]/following::td/input"),"Air Freight Premium  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surroundingPropertyRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Surrounding Property Rate.')]/following::td/input"),"Surrounding Property Rate. ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surroundingPropertyPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Surrounding Property Premium')]/following::td/input"),"Surrounding Property Premium ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		thirdPartyLiabilityRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Third Party Liability Rate')]/following::td/input"),"Third Party Liability Rate  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		thirdPartyLiabilityPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Third Party Liability Premium.')]/following::td/input"),"Third Party Liability Premium.  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalCustomDutyRateTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Additional Custom Duty Rate')]/following::td/input"),"Additional Custom Duty Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalCustomDutyPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Additional Custom Duty Premium')]/following::td/input"),"Additional Custom Duty Premium  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalAddOnPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Total Add-on Premium')]/following::td/input"),"Total Add-on Premium ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		teRateUpto500crTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'TE Rate Upto 500Cr')]/following::td/input"),"TE Rate Upto 500Cr  ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForTerrorismTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Sum Insured for Terrorism')]/following::td/input"),"Sum Insured for Terrorism ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		terrorismExtensionPremiumTextField= new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Terrorism Extension Premium')]/following::td/input"),"Terrorism Extension Premium ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//ps
		floodCoverPremiumRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Flood Cover Premium Rate')]/following::td/input"),"Flood Cover Premium Rate TextField ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		floodCoverPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Flood Cover Premium')]/following::tr[1]/td[2]/input"),"Theft Cover Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		// CF

		basicRateForCPMTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Rate for CPM')]/following::input"),"Basic Rate for CPM TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateUndergroundAndRailwayTrackLoadingCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic rate underground and railway track loading')]/following::input"),"Basic rate underground and railway track loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netRateAfterHigherExcessDiscountCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Rate after Higher Excess Discount')]/following::input"),"Net Rate after Higher Excess Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		higherExcessDiscountCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Higher excess discount(%)')]/following::input"),"Higher excess discount(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		earthQuakePremiumCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Earth Quake premium')]/following::input"),"Earth Quake premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumOfSTFICoverCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium of STFI Cover')]/following::input"),"Basic Premium of STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netBasicAndEarthquakePremiumCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Basic and Earthquake Premium')]/following::input"),"Net Basic and Earthquake Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Rate after Tech, Discetionary and Add Discetionary Disc')]/following::input"),"Net Rate after Tech, Discetionary and Add Discetionary Disc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netBasicPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Net Basic Premium')]/following::input"),"Net Basic Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		// CM

		earthquakeExtraCFTextField=new PageElement(By.xpath("//td//b[contains(text(),'Earthquake Extra')]/following::input"),"Earthquake Extra TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		basicPremiumforLiabilityTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Basic Premium for Liability')]/following::td/input"),"Basic Premium for Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumforHullTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Basic Premium for Hull')]/following::td/input"),"Basic Premium for Hull TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatePremiumforHullTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr[4]//td//b[contains(text(),'Premium')]/following::td/input"),"Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//AA
		basicPremiumforSparesWarTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Basic Premium for Spares War')]/following::td/input"),"Basic Premium for Spares War TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumforAlliedPerilsTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Basic Premium for Allied Perils')]/following::td/input"),"Basic Premium for Allied Parils TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumforExcessLiabilityTextFeild=new PageElement(By.xpath("//form[@name='S0050']//tr//td//b[contains(text(),'Basic Premium for Excess Liability')]/following::td/input"),"Basic Premium for Excess Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//HH
		basicPremiumforSectionsTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium for Sections')]/following::td/input"),"Basic Premium for Sections TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumHHTextFeild=new PageElement(By.xpath("//tr[4]//td[1]//font//b[contains(text(),'Basic Premium')]/following::td/input"),"Basic Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforAdditionalDiscountHHTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Additional Discount')]/following::td/input"),"Premium for Additional Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumDGMRMDiscretionaryDiscountTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium DGM / RM Discretionary Discount')]/following::td/input"),"Premium DGM / RM Discretionary Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discountAmountforDirectBusinessTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount Amount for Direct Business')]/following::td/input"),"Discount Amount for Direct Business TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		adverseClaimExperiencePremiumLoadingTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Adverse Claim Experience Premium Loading')]/following::td/input"),"Adverse Claim Experience Premium Loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherPremiumLoadingTextFeild=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Other Premium Loading')]/following::td/input"),"Other Premium Loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hullCoverPremiumAHTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Hull Cover Premium')]/following::td/input"),"Hull Cover Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		extensionOfGeographicalAreaPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Extension of Geographical Area Premium')]/following::td/input"),"Extension of Geographical Area Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//DS
		discountBasedOnClaimRatioTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Discount based on Claim Ratio')]/following::td/input"),"Discount based on Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingBasedOnClaimRatioTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Loading based on Claim Ratio')]/following::td/input"),"Loading based on Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		excessBasedOnClaimRatioTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Excess based on Claim Ratio')]/following::td/input"),"Excess based on Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicRateForDSTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Rate for DS')]/following::td/input"),"Basic Rate for DS TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumBasedOnDesignedStorageCapacityTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium based on Designed Storage Capacity')]/following::td/input"),"Premium based on Designed Storage Capacity TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		miniumPremiumForDSTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Minium Premium for DS')]/following::td/input"),"Minium Premium for DS TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		premiumBasedOnDSSiTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium Based on DS SI')]/following::td/input"),"Premium Based on DS SI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		actualPremiumForDSTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Actual Premium for DS')]/following::td/input"),"Actual Premium for DS TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dSPremiumAfterDiscretionaryAdditionalDiscretionaryDiscTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'DS Premium After Discretionary & Additional Discretionary Disc')]/following::td/input"),"DS Premium After Discretionary & Additional Discretionary Disc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForDSAfterDiscountInLieuOfAgentCommissionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for DS After Discount in Lieu of Agent Commission')]/following::td/input"),"Premium for DS After Discount in Lieu of Agent Commission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		//ALOP
		fIFForALOPTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'FIF for ALOP')]/following::td/input"),"FIF for ALOP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		factorOfImpactFimTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Factor of Impact (Fim)')]/following::td/input"),"Factor of Impact (Fim)  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForWPTextField =new PageElement(By.xpath("//form[@name='S0050']//tr[3]//td[3]//b[contains(text(),'Premium')]/following::td/input"),"Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//WP
		premiumAfterDiscountInLieuOfAgentCommissionTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium after Discount in lieu of Agent Commission')]/following::td/input"),"Premium after Discount in lieu of Agent Commission Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextfield=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium after Discretionary and Additional Discretionary Discount')]/following::td/input"),"Premium after Discretionary and Additional Discretionary Discount Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stipulatedAgeForBasicRateTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Stipulated age for Basic Rate')]/following::td/input"),"Stipulated age for Basic Rate Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//HH
		basicPremiumSection1BTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium Section 1B')]/following::input"),"Basic	Premium Section 1B",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumSection3TextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Section 3A')]/following::td/input"),"Basic Premium Section 3A Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		premiumRateforCPM1TextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium Rate for CPM1')]/following::input"),"CPM Premium1 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateforCPM2TextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium Rate for CPM2')]/following::input"),"CPM Premium2  Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateforCPM3TextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium Rate for CPM3')]/following::input"),"CPM Premium3  Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateforCPM4TextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium Rate for CPM4')]/following::input"),"CPM Premium4  Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateforCPM5TextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium Rate for CPM5')]/following::input"),"CPM Premium5  Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateforCPM1TextField =new PageElement(By.xpath("//font//b[contains(text(),'Basic Premium Rate for CPM1')]/following::input"),"Basic CPM Premium1  Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateforCPM2TextField =new PageElement(By.xpath("//font//b[contains(text(),'Basic Premium Rate for CPM2')]/following::input"),"Basic CPM Premium2 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateforCPM3TextField =new PageElement(By.xpath("//font//b[contains(text(),'Basic Premium Rate for CPM3')]/following::input"),"Basic CPM Premium3 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateforCPM4TextField =new PageElement(By.xpath("//font//b[contains(text(),'Basic Premium Rate for CPM4')]/following::input"),"Basic CPM Premium4 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumRateforCPM5TextField =new PageElement(By.xpath("//font//b[contains(text(),'Basic Premium Rate for CPM5')]/following::input"),"Basic CPM Premium5 Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumAfterAllDiscountsTextField =new PageElement(By.xpath("//font//b[contains(text(),'Premium After All Discounts')]/following::input"),"Premium Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//YR
		basicPremiumRateYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Basic Premium Rate')]/following::input"),"Basic Premium Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sDCPremiumRateYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'SDC Premium Rate')]/following::input"),"SDC Premium Rate ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingcalculatedYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Loading calculated')]/following::input"),"Loading calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lossesUnseasonalRainsandFrostPremiumRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Losses Unseasonal Rains and Frost Premium Rate')]/following::input"),"Losses Unseasonal Rains and Frost Premium Rate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		discountcalculatedYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Discount calculated')]/following::input"),"Discount calculated",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lossesUnseasonalRainsandFrostPremiumTextField=new PageElement(By.xpath("//td//b[contains(text(),'Losses Unseasonal Rains and Frost Premium')]/following::input"),"Losses Unseasonal Rains and Frost Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 	
		calculatedPremiumYRTextField=new PageElement(By.xpath("//td//b[contains(text(),'Calculated Premium')]/following::input"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		basicPremiumForMPTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium')]/following::input"),"Basic Premium for MP",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BB
		premiumforMoneyinPremisesTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Money in Premises')]/following::input"),"premiumforMoneyinPremisesTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforMoneyinTransitTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Money in Transit')]/following::input"),"premiumforMoneyinTransitTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		staffLoadingAmountTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Staff Loading Amount')]/following::input"),"staffLoadingAmountTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BA
		floaterExtraPremiumTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Floater Extra Premium')]/following::input"),"floaterExtraPremiumTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BD
		premiumforStockinTradeTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Stock in Trade')]/following::input"),"premiumforStockinTradeTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumforGoodsheldinTrustorCommissionTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Premium for Goods held in Trust or Commission')]/following::input"),"premiumforGoodsheldinTrustorCommissionTextField ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTheftTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Theft')]/following::input"),"basicPremiumTheftTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumOtherTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Other')]/following::input"),"basicPremiumOtherTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumTotalTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Total')]/following::input"),"basicPremiumTotalTextField ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicPremiumBDTextField=new PageElement(By.xpath("//form[@name='S0050']//td//b[contains(text(),'Basic Premium Total')]/following::td[3]/input"),"basicPremiumBDTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//deep
		firePerilPremiumRateTextField = new PageElement(By.xpath("//input[@name=('pParameter13')]"),"firePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		firePerilPremiumRateCVETextField = new PageElement(By.xpath("//input[@name=('pParameter15')]"),"firePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		totalDiscountonUsedwithinownPremisesTextField= new PageElement(By.xpath("//input[@name=('pParameter31')]"),"totalDiscountonUsedwithinownPremises",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		burglaryPerilPremiumRateCVETextField= new PageElement(By.xpath("//input[@name=('pParameter16')]"),"burglaryPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		burglaryPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter14')]"),"burglaryPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalNCBDiscountTextField= new PageElement(By.xpath("//input[@name=('pParameter32')]"),"totalNCBDiscount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		riotStrikePerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter15')]"),"riotStrikePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalODPremiumTextField= new PageElement(By.xpath("//input[@name=('pParameter33')]"),"totalODPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		earthquakePerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter16')]"),"earthquakePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalTPPremiumTextField= new PageElement(By.xpath("//input[@name=('pParameter34')]"),"totalTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		floodStormPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter17')]"),"floodStormPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter35')]"),"premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		accidentalPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter18')]"),"accidentalPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		maliciousPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter19')]"),"maliciousPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		terroristPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter110')]"),"terroristPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		transitPerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter111')]"),"transitPerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		landslidePerilPremiumRateTextField= new PageElement(By.xpath("//input[@name=('pParameter112')]"),"LandSlidePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		landslidePerilPremiumRateCVETextField= new PageElement(By.xpath("//input[@name=('pParameter114')]"),"LandSlidePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		oDPremiumPercentageTextField= new PageElement(By.xpath("//input[@name=('pParameter113')]"),"oDPremiumPercentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalODPremiumAmountTextField= new PageElement(By.xpath("//input[@name=('pParameter114')]"),"additionalODPremiumAmount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicODPremiumTextField = new PageElement(By.xpath("//input[@name=('pParameter115')]"),"firePerilPremiumRate",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iMTRateODPremiumpercentageTextField= new PageElement(By.xpath("//input[@name=('pParameter117')]"),"iMTRateODPremiumpercentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iMTRateBasicODPremiumTextField= new PageElement(By.xpath("//input[@name=('pParameter118')]"),"iMTRateBasicODPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalpremiumforGVWabove12000KGTextField= new PageElement(By.xpath("//input[@name=('pParameter123')]"),"additionalpremiumforGVWabove12000KG",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iMTRateAdditionalpremiumforGVWabove12000kgTextField= new PageElement(By.xpath("//input[@name=('pParameter127')]"),"iMTRateAdditionalpremiumforGVWabove12000kg",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingforRoadworthyConditionTextField= new PageElement(By.xpath("//input[@name=('pParameter132')]"),"loadingforRoadworthyCondition",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedNCBDiscountTextField= new PageElement(By.xpath("//input[@name=('pParameter143')]"),"calculatedNCBDiscount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		iMTRateCalculatedNCBDiscountTextField= new PageElement(By.xpath("//input[@name=('pParameter144')]"),"iMTRateCalculatedNCBDiscount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedODPremiumTextField= new PageElement(By.xpath("//input[@name=('pParameter146')]"),"calculatedODPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicTPPremiumTextField=new PageElement(By.xpath("//input[@name=('pParameter148')]"),"basicTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicTPPremiumCVETextField=new PageElement(By.xpath("//input[@name=('pParameter138')]"),"basicTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		calculatedTPPremiumMotorTextField=new PageElement(By.xpath("//input[@name=('pParameter165')]"),"calculatedTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedTPPremiumCVEMotorTextField=new PageElement(By.xpath("//input[@name=('pParameter145')]"),"calculatedTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		calculatedPremiumMotorTextField=new PageElement(By.xpath("//input[@name=('pParameter166')]"),"calculatedPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumCVEMotorTextField=new PageElement(By.xpath("//input[@name=('pParameter35')]"),"calculatedPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		addLLunderWCAforcarriageofmorethansixemployeesTextField = new PageElement(By.xpath("//input[@name=('pParameter160')]"),"addLLunderWCAforcarriageofmorethansixemployees",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumCVbMotorTextField=new PageElement(By.xpath("//input[@name=('pParameter161')]"),"calculatedPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//PC
		oDPremiumPercentagePCTextField=new PageElement(By.xpath("//input[@name=('pParameter13')]"),"OD Premium Percentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		imtRateODPremiumpercentagePCTextField=new PageElement(By.xpath("//input[@name=('pParameter15')]"),"IMT Rate OD Premium percentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicODPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter16')]"),"Basic OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		imtRateBasicODPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter17')]"),"IMT Rate Basic OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalPremiumforNonElectricalfittingPCTextField=new PageElement(By.xpath("//input[@name=('pParameter17')]"),"Additional Premium for Non-Electricalfitting",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalODPremiumwithoutDDPCTextField=new PageElement(By.xpath("//input[@name=('pParameter132')]"),"Total OD Premium without DD",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedODPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter133')]"),"Calculated OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicTPPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter135')]"),"Basic TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedTPPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter151')]"),"Calculated TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumPCTextField=new PageElement(By.xpath("//input[@name=('pParameter152')]"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicODPremiumodPCTextField=new PageElement(By.xpath("//input[@name=('pParameter32')]"),"Basic OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalPremiumforNonElectricalfittinggPCTextField=new PageElement(By.xpath("//input[@name=('pParameter33')]"),"Additional Premium for Non-Electrical fitting",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumodPCTextField=new PageElement(By.xpath("//input[@name=('pParameter311')]"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//TW 
		oDPremiumPercentageTWTextField=new PageElement(By.xpath("//input[@name=('pParameter13')]"),"OD Premium Percentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		imtRateODPremiumpercentageTWTextField=new PageElement(By.xpath("//input[@name=('pParameter15')]"),"IMT Rate OD Premium percentage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicODPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter16')]"),"Basic OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		imtRateBasicODPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter17')]"),"IMT Rate Basic OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredDeclaredValueCoverTWTextField=new PageElement(By.xpath("//input[@name=('pParameter119')]"),"IDV",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		additionalPremiumForFiberGlassTWTextField=new PageElement(By.xpath("//input[@name=('pParameter122')]"),"Additional Premium For Fiber Glass",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalOdPremiumWithoutDDTWTextField=new PageElement(By.xpath("//input[@name=('pParameter133')]"),"Total Od Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedOdPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter134')]"),"Calculated OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicTPPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter136')]"),"Basic TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedTPPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter150')]"),"Calculated TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter151')]"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalODPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter36')]"),"Total Od Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalTpPremiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter37')]"),"Total Tp Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumTWTextField=new PageElement(By.xpath("//input[@name=('pParameter38')]"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//CV-G
		odDiscountForPrmisesCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter118')]"),"Od DiscountFor Prmises",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedODPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter121')]"),"Calculated OD Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		basicTPPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter122')]"),"Basic TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tpDiscountForPrmisesCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter125')]"),"TP Discount For Prmises",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tpLoadingForWorkingAwayCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter126')]"),"Tp Loading ForWorking Away",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedTPPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter128')]"),"Calculated TP Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		calculatedPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter129')]"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalOdPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter31')]"),"total Od Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalTPPremiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter32')]"),"TotalTPPremium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumCVGMotorTextField = new PageElement(By.xpath("//input[@name=('pParameter33')]"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		// 	For  CP PRODUCT 
		//NAZAF
		TotalPremiumforSection = new PageElement(By.xpath("//input[@name='pParameter13']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		CalculatedPremium = new PageElement(By.xpath("//input[@name='pParameter14']"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ManualLoading = new PageElement(By.xpath("//input[@name='pParameter21']"),"Manual Loading",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ManualDiscount = new PageElement(By.xpath("//input[@name='pParameter22']"),"Manual  Discount",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		Premiumcp = new PageElement(By.xpath("//input[@name='pParameter33']"),"Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveCpButton=new PageElement(By.xpath("//input[@name='Save']"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);


		//Code written by Anzaf for hm product only in marine hulll

		BasicTLRateinpercent = new PageElement(By.xpath("//input[@name='pParameter13']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		TLRateinpercentbasedonMakeType = new PageElement(By.xpath("//input[@name='pParameter14']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		TLRate = new PageElement(By.xpath("//input[@name='pParameter15']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		BasicOTLRateinpercent = new PageElement(By.xpath("//input[@name='pParameter16']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		OTLRateinpercentbasedonMakeType = new PageElement(By.xpath("//input[@name='pParameter17']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		OTLRate = new PageElement(By.xpath("//input[@name='pParameter18']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		BasicHMRateinpercent = new PageElement(By.xpath("//input[@name='pParameter19']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		HMRateinpercentbasedonIRSDiscount = new PageElement(By.xpath("//input[@name='pParameter110']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		HMRateinpercentbasedonOwnersDiscount = new PageElement(By.xpath("//input[@name='pParameter111']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		HMRateinpercentbasedonDeTariffDiscount = new PageElement(By.xpath("//input[@name='pParameter112']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		HMRateinpercentbasedonNoClaimsDiscount = new PageElement(By.xpath("//input[@name='pParameter113']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		HMRate = new PageElement(By.xpath("//input[@name='pParameter114']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		BasicPremium = new PageElement(By.xpath("//input[@name='pParameter115']"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		WARCoverPremium = new PageElement(By.xpath("//td//b[starts-with(text(),'WAR Cover Premium')]//following::input[1]"),"WAR Cover Pre",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		CalculatedPremiumwr = new PageElement(By.xpath("//td//b[starts-with(text(),'Calculated Premium')]//following::input[1]"),"Calculated Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		Premiumhm = new PageElement(By.xpath("//td//font//b[starts-with(text(),'Premium')]//following::input[1]"),"Total Premiumfor Section",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		PremiumAL= new PageElement(By.xpath("//td//font//b[starts-with(text(),'Premium')]//following::input[1]")," Premium",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//UC
		discountUCTextField=new PageElement(By.name("pParameter22"),"Discount for UC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loadingUCTextField=new PageElement(By.name("pParameter21"),"Loading for UC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumForUCTextField=new PageElement(By.name("pParameter33'"),"Premium Field For UC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Insured Interest Code")),"Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}

	////Services

	public void navigateToPolicyTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
		else if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetail1Tab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(detail1Title);
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void navigateToAttributes1Tab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberAttributesTab")){
			click(attributes1Title);
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(attachCoverageTitle);
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelationTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(relations1Title);
			isElementDisplayed(memberRelationTitle);
		}
	}
	public void navigateToPaymentTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(payments1Title);
			isElementDisplayed(memberPaymentListTitle);
		}
	}
	public void navigateToDetails2Tab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(details2Title);
			isElementDisplayed(policyMemberCoverageTitle);
		}
	}
	public void navigateToAttributes2Tab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributes2Title);
			isElementDisplayed(memberAttributes2Title);
		}
	}
	public void navigateToPremiumTab(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity){
		if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumTab")){
			click(premiumTitle);
			isElementDisplayed(premiumSchedule2Title);
		}

	}
	public void fillPolicyMemberPremiumDetails(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntity, CustomAssert assertReference){
		if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(membAtachCovrgPremSchdEntity.getAction().equalsIgnoreCase("add") || membAtachCovrgPremSchdEntity.getAction().equalsIgnoreCase("edit")){

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremium")) {
					clearAndSendKeys(basicPremiumTextField, membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremium"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigStaffDiscountForMember"))
					clearAndSendKeys(staffDiscountForMemberTextField, membAtachCovrgPremSchdEntity.getStringValueForField("StaffDiscountForMember"));

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimLoadingPercentage")) {
					clearAndSendKeys(claimLoadingTextField, membAtachCovrgPremSchdEntity.getStringValueForField("ClaimLoadingPercentage"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimLoading")) {
					clearAndSendKeys(claimLoading1TextField, membAtachCovrgPremSchdEntity.getStringValueForField("ClaimLoading"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremium")) {
					clearAndSendKeys(calculatedPremiumTextField, membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremium"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualLoading")) {
					if(!(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("OS")||membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("ME"))) {
						clearAndSendKeys(manualLoadingTextField, membAtachCovrgPremSchdEntity.getStringValueForField("ManualLoading"));
					}
					else {
						clearAndSendKeys(ManualLoading, membAtachCovrgPremSchdEntity.getStringValueForField("ManualLoading"));
					}
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualDiscount")) {
					clearAndSendKeys(manualDiscountTextField, membAtachCovrgPremSchdEntity.getStringValueForField("ManualDiscount"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscount")) {
					clearAndSendKeys(discountTextField, membAtachCovrgPremSchdEntity.getStringValueForField("Discount"));
				}if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoading")) {
					clearAndSendKeys(loadingTextField, membAtachCovrgPremSchdEntity.getStringValueForField("Loading"));
				}//updatedbyShiva
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremium")) {
					clearAndSendKeys(premiumTextField, membAtachCovrgPremSchdEntity.getStringValueForField("Premium"));
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDC")) {
					if(!(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC"))) {
						clearAndSendKeys(loadingTextField, membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"));
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforOptionalCoverI")) {
						clearAndSendKeys(premiumforOptionalCoverITextField, membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforOptionalCoverI"));
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforOptionalCoverIII")) {
						clearAndSendKeys(premiumforOptionalCoverIIITextField, membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforOptionalCoverIII"));
					}

				}


				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")|| membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							clearAndSendKeys(discountUCTextField, membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForDC"));
						}
						else { 
							clearAndSendKeys(discountTextField, membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForDC"));
						}
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							clearAndSendKeys(loadingUCTextField, membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"));
						}
						else { 
							clearAndSendKeys(loadingTextField, membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"));
						}

					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							clearAndSendKeys(premiumForUCTextField, membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"));
						}
						else { 
							clearAndSendKeys(premiumForDCTextField, membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"));
						}

					}
				} 

			}
			else if(membAtachCovrgPremSchdEntity.getAction().equalsIgnoreCase("verify")){



				//RK
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForRoadAccident")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForRoadAccident"),fetchValueFromTextFields(premiumForRoadAccidentTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumCalculatedRK")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumCalculatedRK"),fetchValueFromTextFields(premiumCalculatedRKTextField), AssertionType.WARNING);
				}
				// COMMITED ANZAF BY MARINE HULL CP PRODUCT PREMIUM

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiuMforSection")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiuMforSection"), fetchValueFromTextFields(TotalPremiumforSection), AssertionType.WARNING);
				}	


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumCP")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiuMCP"), fetchValueFromTextFields(CalculatedPremium), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualLoadingCP")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ManualLoadingCP"), fetchValueFromTextFields(ManualLoading), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualDiscounTCP")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ManualDiscounTCP"), fetchValueFromTextFields(ManualDiscount), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumcP")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumcP"), fetchValueFromTextFields(Premiumcp), AssertionType.WARNING);
				}

				//for hmm product calculate premium code by wrriten by Anzaf 

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTLRateinpercent")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTLRateinpercent1"), fetchValueFromTextFields(BasicTLRateinpercent), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTLRateinpercentbasedonMakeType")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TLRateinpercentbasedonMakeTypehm"), fetchValueFromTextFields(TLRateinpercentbasedonMakeType), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTLRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TLRatehm"), fetchValueFromTextFields(TLRate), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicOTLRateinpercent")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicOTLRateinpercenthm"), fetchValueFromTextFields(BasicOTLRateinpercent), AssertionType.WARNING);
				}

                if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforOptionalCoverI")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforOptionalCoverI"), fetchValueFromTextFields(premiumforOptionalCoverITextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforOptionalCoverIII")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforOptionalCoverIII"), fetchValueFromTextFields(premiumforOptionalCoverIIITextField), AssertionType.WARNING);
				}
				
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOTLRateinpercentbasedonMakeType")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OTLRateinpercentbasedonMakeTypehm"), fetchValueFromTextFields(OTLRateinpercentbasedonMakeType), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOTLRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OTLRatehm"), fetchValueFromTextFields(OTLRate), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicHMRateinpercent")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicHMRateinpercenthm"), fetchValueFromTextFields(BasicHMRateinpercent), AssertionType.WARNING);
				}



				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHMRateinpercentbasedonIRSDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HMRateinpercentbasedonIRSDiscounthm"), fetchValueFromTextFields(HMRateinpercentbasedonIRSDiscount), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHMRateinpercentbasedonOwnersDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HMRateinpercentbasedonOwnersDiscounthm"), fetchValueFromTextFields(HMRateinpercentbasedonOwnersDiscount), AssertionType.WARNING);
				}



				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHMRateinpercentbasedonDeTariffDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HMRateinpercentbasedonDeTariffDiscounthm"), fetchValueFromTextFields(HMRateinpercentbasedonDeTariffDiscount), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHMRateinpercentbasedonNoClaimsDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HMRateinpercentbasedonNoClaimsDiscounthm"), fetchValueFromTextFields(HMRateinpercentbasedonNoClaimsDiscount), AssertionType.WARNING);
				}


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHMRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HMRatehm"), fetchValueFromTextFields(HMRate), AssertionType.WARNING);
				}



				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumhm")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumhm"), fetchValueFromTextFields(BasicPremium), AssertionType.WARNING);
				}




				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumhm")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premiumhmm"), fetchValueFromTextFields(Premiumhm), AssertionType.WARNING);
				}	



				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigWARCoverPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("WARCoverPrem"), fetchValueFromTextFields(WARCoverPremium), AssertionType.WARNING);
				}	

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumwr")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiumwr"), fetchValueFromTextFields(CalculatedPremiumwr), AssertionType.WARNING);
				}	
				
				//NAZAF
				
				
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigVIPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumVI"), fetchValueFromTextFields(PremiumVI), AssertionType.WARNING);
				}
				
				
				
				
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigVILOADPREMIUM")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumLoadingVI"), fetchValueFromTextFields(PremiumVILOADING), AssertionType.WARNING);
				}	
				
				

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigVoyageRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Voyogarate"), fetchValueFromTextFields(VoyageRate), AssertionType.WARNING);
				}	
				

				

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumVI")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("basicpremiumvi"), fetchValueFromTextFields(BasicPremiumVI), AssertionType.WARNING);
				}	

				//End 

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMemberCoode")) {
					if(!(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability"))){
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MemberCoode"), fetchValueFromFields(memeberCodeLabel),AssertionType.WARNING);
					}
					else {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MemberCoode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
						}
					}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSerialNo")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SerialNo"), fetchValueFromFields(serialNoLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLimitsOfLiability")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LimitsOfLiability"), fetchValueFromFields(limitsOfLiabilityLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscretionaryDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscretionaryDiscount"), fetchValueFromFields(discretionaryDiscountLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscretionaryLoading")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscretionaryLoading"), fetchValueFromFields(discretionaryLoadingLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCoverageCode")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CoverageCode"), fetchValueFromFields(coverageCodeLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCoverageName")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CoverageName"), fetchValueFromFields(coverageNameLabel),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDescription")) {
					//assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Description"), fetchValueFromFields(descriptionLabel),AssertionType.WARNING);
					assertReference.assertEquals(true,fetchValueFromFields(descriptionLabel).contains(membAtachCovrgPremSchdEntity.getStringValueForField("Description")),AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremium"), fetchValueFromTextFields(basicPremiumTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigStaffDiscountForMember")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("StaffDiscountForMember"), fetchValueFromTextFields(staffDiscountForMemberTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimLoadingPercentage")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ClaimLoadingPercentage"), fetchValueFromTextFields(claimLoadingTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimLoading")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ClaimLoading"), fetchValueFromTextFields(claimLoading1TextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremium"), fetchValueFromTextFields(calculatedPremiumTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualLoading")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ManualLoading"), fetchValueFromTextFields(manualLoadingTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigManualDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ManualDiscount"), fetchValueFromTextFields(manualDiscountTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremium")) {
					
					if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(PremiumEngineering), AssertionType.WARNING);
					}
					else if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("ZP"))
						{
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextFieldZP), AssertionType.WARNING);
						}
					else if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("CR") || membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("PP"))
						{
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextFieldCR), AssertionType.WARNING);
						}
						//Anjaf for aviation
					else if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("AL")||(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("PA"))||(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("PN")))
						{
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(PremiumAL), AssertionType.WARNING);
						}
					else if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("KY"))
					{
						premiumTextField=new PageElement(By.name("pParameter33"),"Premium KY Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
					}
					else 
					{
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
					}
					}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForFM")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForFM"), fetchValueFromTextFields(premiumForFMTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForHypertension")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForHypertension"), fetchValueFromTextFields(loadingForHypertensionTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDiabetes")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDiabetes"), fetchValueFromTextFields(loadingForDiabetesTextField), AssertionType.WARNING);
				}
				//ES
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateInUSD")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateInUSD"), fetchValueFromTextFields(basicPremiumRateInUSDTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigUSDCurrencyValue")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("USDCurrencyValue"), fetchValueFromTextFields(usdCurrencyValueTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRate"), fetchValueFromTextFields(basicPremiumRateTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumDiscountforCPortal")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumDiscountforCPortal"), fetchValueFromTextFields(premiumDiscountforCorporatePortalTextField), AssertionType.WARNING);
				}
				//CD CE
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumCDCE")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumCDCE"), fetchValueFromTextFields(premiumCDCETextField), AssertionType.WARNING);
				}
				//PU

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforTableA")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforTableA"), fetchValueFromTextFields(premiumforTableATextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforTableB")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforTableB"), fetchValueFromTextFields(premiumforTableBTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforTableC")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforTableC"), fetchValueFromTextFields(premiumforTableCTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforTableD")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforTableD"), fetchValueFromTextFields(premiumforTableDTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMedicalExtensionPremiumLoading")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MedicalExtensionPremiumLoadingTextField"), fetchValueFromTextFields(medicalExtensionPremiumLoadingTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremium"), fetchValueFromTextFields(calculatedPremiumTextField), AssertionType.WARNING);
				} 
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforLiability")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforLiability"), fetchValueFromTextFields(basicPremiumforLiabilityTextFeild), AssertionType.WARNING);
				} 
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforHull")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforHull"), fetchValueFromTextFields(basicPremiumforHullTextFeild), AssertionType.WARNING);
				} 
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatePremiumforHull")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatePremiumforHull"), fetchValueFromTextFields(calculatePremiumforHullTextFeild), AssertionType.WARNING);
				} 


				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGroupDiscount")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GroupDiscount"), fetchValueFromTextFields(groupDiscountTextField), AssertionType.WARNING);
				}
				//GH
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumSTDRSKGH")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumSTDRSKGH"), fetchValueFromTextFields(premiumSTDRSKTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPABasicPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PABasicPremium"), fetchValueFromTextFields(pABasicPremiumTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMCBasicPremium")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MCBasicPremium"), fetchValueFromTextFields(mCBasicPremiumTextField), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumIncludingExtensionPremiumBH")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumIncludingExtensionPremiumBH"), fetchValueFromTextFields(totalPremiumIncludingExtensionPremiumBHTextField), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExtensionPremiumBH")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExtensionPremiumBH"), fetchValueFromTextFields(extensionPremiumBHTextfield), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumBH")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumBH"), fetchValueFromTextFields(premiumBHTextField), AssertionType.WARNING);
				}

				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimDiscountGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ClaimDiscountGT"), fetchValueFromTextFields(claimDiscountGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHighClaimLodingPercentGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HighClaimLodingPercentGT"), fetchValueFromTextFields(highClaimLoadingPercentGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimLodingGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ClaimLodingGT"), fetchValueFromTextFields(claimloadingGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLowClaimDiscountGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LowClaimDiscountGT"), fetchValueFromTextFields(lowClaimDiscountPercentGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGroupDiscountPercentGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GroupDiscountPercentGT"), fetchValueFromTextFields(groupDiscountPercentGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGroupDiscountForSgmcGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GroupDiscountForSgmcGT"), fetchValueFromTextFields(groupDiscountForSgmcGTTextField), AssertionType.WARNING);
				}
				if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRefundPremiumOMPGT")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RefundPremiumOMPGT"), fetchValueFromTextFields(refundPremiumForOMPGTPolicyTextfield), AssertionType.WARNING);
				}
				//sc

				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFamilyDiscountForTheMember")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FamilyDiscountForTheMember"), fetchValueFromTextFields(familyDiscountForTheMemberTextfield), AssertionType.WARNING);
					}
					//CX
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumCX")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumCX"), fetchValueFromTextFields(cxPremiumTextField), AssertionType.WARNING);
					}
					//ES
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremRateES")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremRateES"), fetchValueFromTextFields(basicPremiumRateESTextField), AssertionType.WARNING);
					}

				}

				//fc  
				/*if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigsDCPremiumRate")) {
					assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRate"), fetchValueFromTextFields(sDCPremiumRateTextfield), AssertionType.WARNING);
				}*/
				//	if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRate")) {
				//	assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRate"), fetchValueFromTextFields(annualSDCPremiumRateTextfield), AssertionType.WARNING);
				//}
				//if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigsDCPremiumRate")) {
				//	assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRate"), fetchValueFromTextFields(sDCPremiumRateTextfield), AssertionType.WARNING);
				//}
				//if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialdiscountinlieuofAgencyCommission")) {
				//	assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialdiscountinlieuofAgencyCommission"), fetchValueFromTextFields(specialdiscountinlieuofAgencyCommissionTextfield), AssertionType.WARNING);
				//}
				//Misc
				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigShortPeriodFactor")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ShortPeriodFactor"),fetchValueFromTextFields(shortPeriodFactorTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdverseLoading")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdverseLoading"),fetchValueFromTextFields(adverseLoadingTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRefrigeratedPremium")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RefrigeratedPremium"),fetchValueFromTextFields(refrigeratedPremiumTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLolLoadingRate")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LolLoadingRate"),fetchValueFromTextFields(lolLoadingRateTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForHiredVehicleCover")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForHiredVehicleCover"),fetchValueFromTextFields(loadingForHiredVehicleCoverTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForRSMD")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForRSMD"),fetchValueFromTextFields(loadingForRSMDTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForShortageDueToTheftOrPilferageOfCargo")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForShortageDueToTheftOrPilferageOfCargo"),fetchValueFromTextFields(loadingForShortageDueToTheftOrPilferageOfCargoTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForFloodOrWaterDamageOrDamageByAnyOtherCargo")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForFloodOrWaterDamageOrDamageByAnyOtherCargo"),fetchValueFromTextFields(loadingForFloodOrWaterDamageOrDamageByAnyOtherCargoTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForBreakage")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForBreakage"),fetchValueFromTextFields(loadingForBreakageTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumOnTurnover")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumOnTurnover"),fetchValueFromTextFields(premiumOnTurnoverTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigVoluntaryExcessDiscount")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("VoluntaryExcessDiscount"),fetchValueFromTextFields(voluntaryExcessDiscountTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForMisc")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForMisc"),fetchValueFromTextFields(premiumForMiscTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForOutsideDirectorship")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForOutsideDirectorship"),fetchValueFromTextFields(loadingForOutsideDirectorshipTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForSpousalExtension")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForSpousalExtension"),fetchValueFromTextFields(loadingForSpousalExtensionTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForLegalHeirsAndRepresentatives")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForLegalHeirsAndRepresentatives"),fetchValueFromTextFields(loadingForLegalHeirsAndRepresentativesTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForEntityCoverageForSecurities")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForEntityCoverageForSecurities"),fetchValueFromTextFields(LoadingForEntityCoverageForSecuritiesTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForInitialPublicOffering")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForInitialPublicOffering"),fetchValueFromTextFields(loadingForInitialPublicOfferingTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForOtherAdditionalExtensions")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForOtherAdditionalExtensions"),fetchValueFromTextFields(loadingForOtherAdditionalExtensionsTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForAcquisitionorMerger")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForAcquisitionorMerger"),fetchValueFromTextFields(loadingForAcquisitionorMergerTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForCrisisCommunicationCover")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForCrisisCommunicationCover"),fetchValueFromTextFields(loadingForCrisisCommunicationCoverTextField), AssertionType.WARNING);
					}			
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForCourtAttendanceCost")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForCourtAttendanceCost"),fetchValueFromTextFields(loadingForCourtAttendanceCostTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForRiskManagement")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForRiskManagement"),fetchValueFromTextFields(loadingForRiskManagementTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForPollutionDefenseCost")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForPollutionDefenseCost"),fetchValueFromTextFields(loadingForPollutionDefenseCostTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForEmploymentPracticeLiability")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForEmploymentPracticeLiability"),fetchValueFromTextFields(loadingForEmploymentPracticeLiabilityTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDirectorVersusDirector")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDirectorVersusDirector"),fetchValueFromTextFields(loadingForDirectorVersusDirectorTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForShadowDirectorship")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForShadowDirectorship"),fetchValueFromTextFields(loadingForShadowDirectorshipTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForAutoAcquisitionOfSubsidiaries")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForAutoAcquisitionOfSubsidiaries"),fetchValueFromTextFields(loadingForAutoAcquisitionOfSubsidiariesTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForComputerCrimeInsurance")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForComputerCrimeInsurance"),fetchValueFromTextFields(loadingForComputerCrimeInsuranceTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDiscoveryPeriod")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDiscoveryPeriod"),fetchValueFromTextFields(loadingForDiscoveryPeriodTextField), AssertionType.WARNING);
					}
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForEntityCoverageForEPLI")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForEntityCoverageForEPLI"),fetchValueFromTextFields(loadingForEntityCoverageForEPLITextField), AssertionType.WARNING);
					}

					//WC
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountForVoluntaryExcess")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForVoluntaryExcess"),fetchValueFromTextFields(discountForVoluntaryExcessTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumWC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumWC"), fetchValueFromTextFields(premiumWCTextField), AssertionType.WARNING);
					}
					// LN
					if(membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForTurnover")){
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForTurnover"),fetchValueFromTextFields(loadingForTurnoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumLN")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumLN"), fetchValueFromTextFields(premiumLNTextField), AssertionType.WARNING);
					}
				}
				//Rural HD	
				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){


					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountcalculated")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Discountcalculated"), fetchValueFromTextFields(discountcalculatedTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingcalculated")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Loadingcalculated"), fetchValueFromTextFields(loadingcalculatedTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLongtermdiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Longtermdiscount"), fetchValueFromTextFields(longtermdiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumHD")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumHD"), fetchValueFromTextFields(premiumHDTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGroupDiscountForCA")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GroupDiscountForCA"), fetchValueFromTextFields(groupDiscountForCATextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLongtermdiscountAmount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LongtermdiscountAmount"), fetchValueFromTextFields(longTermDiscountTextField), AssertionType.WARNING);
					}
					//EP
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRateEP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRateEP"), fetchValueFromTextFields(annualSDCPremiumRateEPTextField), AssertionType.WARNING);
					}
					//EP
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRateEP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRateEP"), fetchValueFromTextFields(annualSDCPremiumRateEPTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRate"), fetchValueFromTextFields(annualSDCPremiumRateTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSDCPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRate"), fetchValueFromTextFields(sDCPremiumRateTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialdiscountinlieuofAgencyCommission")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialdiscountinlieuofAgencyCommission"), fetchValueFromTextFields(specialdiscountinlieuofAgencyCommissionTextfield), AssertionType.WARNING);
					}
					//DC
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForDC"), fetchValueFromTextFields(discountUCTextField), AssertionType.WARNING);
						}
						else { 
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForDC"), fetchValueFromTextFields(discountTextField), AssertionType.WARNING);
						}

					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"), fetchValueFromTextFields(loadingUCTextField), AssertionType.WARNING);
						}
						else { 
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"), fetchValueFromTextFields(loadingTextField), AssertionType.WARNING);
						}

					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForDC")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("UC")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"), fetchValueFromTextFields(premiumForUCTextField), AssertionType.WARNING);
						}
						else { 
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"), fetchValueFromTextFields(premiumForDCTextField), AssertionType.WARNING);
						}

					}
					//GG
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumForGG")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumForGG"), fetchValueFromTextFields(basicPremiumForGGTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumForMP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumForMP"), fetchValueFromTextFields(basicPremiumForMPTextField), AssertionType.WARNING);
					}
					//DC
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSDCPremiumRateDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRateDC"), fetchValueFromTextFields(sDCPremiumRateTextFieldDC), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumDC"), fetchValueFromTextFields(basicPremiumTextFieldDC), AssertionType.WARNING);
					}
					//DK
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExtraPremiumDK")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExtraPremiumDK"), fetchValueFromTextFields(extraPremiumTextField), AssertionType.WARNING);
					}
					//FW
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremRateFW")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremRateFW"), fetchValueFromTextFields(basicPremiumRateESTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialdiscountinlieuofAgencyCommission")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialdiscountinlieuofAgencyCommission"), fetchValueFromTextFields(specialdiscountinlieuofAgencyCommissionTextfield), AssertionType.WARNING);
					}
					//PS
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOldPumpsetLoadingPercent")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OldPumpsetLoadingPercent"), fetchValueFromTextFields(oldPumpsetLoadingPercentTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOldPumpsetLoading")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OldPumpsetLoading"), fetchValueFromTextFields(oldPumpsetLoadingTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMalus")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Malus"), fetchValueFromTextFields(malusTextfield), AssertionType.WARNING);
					}
					//DG
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigInsuredInterestSum")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("InsuredInterestSum"), fetchValueFromFields(insuredInterestSumLabel), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddOnSectionPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddOnSectionPremium"), fetchValueFromTextFields(addOnSectionPremiumTextField), AssertionType.WARNING);
					}
					//HB
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTheftCoverPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TheftCoverPremiumRate"), fetchValueFromTextFields(theftCoverPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTFTPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TFTPremiumRate"), fetchValueFromTextFields(TFTPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTheftCoverPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TheftCoverPremium"), fetchValueFromTextFields(theftCoverPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFloodCoverPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FloodCoverPremiumRate"), fetchValueFromTextFields(floodCoverPremiumRateTextField), AssertionType.WARNING);
					}	
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFloodCoverPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FloodCoverPremium"), fetchValueFromTextFields(floodCoverPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddOnPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddOnPremiumRate"), fetchValueFromTextFields(addOnPremiumRateTextField), AssertionType.WARNING);
					}
				}

				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountcalculated")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Discountcalculated"), fetchValueFromTextFields(discountcalculatedTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingcalculated")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Loadingcalculated"), fetchValueFromTextFields(loadingcalculatedTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLongtermdiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Longtermdiscount"), fetchValueFromTextFields(longtermdiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumHD")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumHD"), fetchValueFromTextFields(premiumHDTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGroupDiscountForCA")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GroupDiscountForCA"), fetchValueFromTextFields(groupDiscountForCATextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLongtermdiscountAmount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LongtermdiscountAmount"), fetchValueFromTextFields(longTermDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRateEP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRateEP"), fetchValueFromTextFields(annualSDCPremiumRateEPTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualSDCPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualSDCPremiumRate"), fetchValueFromTextFields(annualSDCPremiumRateTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMalus")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Malus"), fetchValueFromTextFields(malusTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdverseClaimLoading")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdverseClaimLoading"), fetchValueFromTextFields(adverseClaimLoadingTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpecialdiscountinlieuofAgencyCommission")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpecialdiscountinlieuofAgencyCommission"), fetchValueFromTextFields(specialdiscountinlieuofAgencyCommissionTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"), fetchValueFromTextFields(premiumForDCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumZP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumZP"), fetchValueFromTextFields(basicPremiumTextFieldZP), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSDCPremiumRateDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRateDC"), fetchValueFromTextFields(sDCPremiumRateTextFieldDC), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateYH")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateYH"), fetchValueFromTextFields(basicPremiumRateTextFieldYH), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumYH")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumYH"), fetchValueFromTextFields(basicPremiumTextFieldYH), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountForDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountForDC"), fetchValueFromTextFields(discountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingForDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingForDC"), fetchValueFromTextFields(loadingTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigsDCPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRate"), fetchValueFromTextFields(sDCPremiumRateTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddOnAnnualPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddOnAnnualPremiumRate"), fetchValueFromTextFields(addOnAnnualPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddOnPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddOnPremiumRate"), fetchValueFromTextFields(addOnPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddOnPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddOnPremium"), fetchValueFromTextFields(addOnPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAnnualPTDPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AnnualPTDPremiumRate"), fetchValueFromTextFields(annualPTDPremiumRateTextfield), AssertionType.WARNING);
					}
					//YR

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateYR")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateYR"),fetchValueFromTextFields(basicPremiumRateYRTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSDCPremiumRateYR")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SDCPremiumRateYR"),fetchValueFromTextFields(sDCPremiumRateYRTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingcalculatedYR")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingcalculatedYR"),fetchValueFromTextFields(loadingcalculatedYRTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLossesUnseasonalRainsandFrostPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LossesUnseasonalRainsandFrostPremiumRate"),fetchValueFromTextFields(lossesUnseasonalRainsandFrostPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountcalculatedYR")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountcalculatedYR"),fetchValueFromTextFields(discountcalculatedYRTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLossesUnseasonalRainsandFrostPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LossesUnseasonalRainsandFrostPremium"),fetchValueFromTextFields(lossesUnseasonalRainsandFrostPremiumTextField), AssertionType.WARNING);
					}
				}
				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("FIRE")){

					//Chintan
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Rate"), fetchValueFromTextFields(rateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSTFIDeletionRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("STFIDeletionRate"), fetchValueFromTextFields(sTFIDeletionRateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRate"), fetchValueFromTextFields(basicRateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthquakeRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthquakeRate"), fetchValueFromTextFields(earthquakeRateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyRateFire")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PolicyRateFire"), fetchValueFromTextFields(policyRateFireTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetBasicRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetBasicRate"), fetchValueFromTextFields(netBasicRateTextField),AssertionType.WARNING);
					}
					/*if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetPolicyRate")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetPolicyRate"), fetchValueFromTextFields(netPolicyRateTextField),AssertionType.WARNING);
						}*/

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMaximumNetPolicyRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MaximumNetPolicyRate"), fetchValueFromTextFields(maximumNetPolicyRateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumUnderBasicPolicy")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumUnderBasicPolicy"), fetchValueFromTextFields(premiumUnderBasicPolicyTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForSTFIReverse")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForSTFIReverse"), fetchValueFromTextFields(premiumForSTFIReverseTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumExcludingTerrorismCover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumExcludingTerrorismCover"), fetchValueFromTextFields(totalPremiumExcludingTerrorismCoverTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumIncludingVoluntaryDeductibles")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumIncludingVoluntaryDeductibles"), fetchValueFromTextFields(totalPremiumIncludingVoluntaryDeductiblesTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumIncludingDirectBusinessDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumIncludingDirectBusinessDiscount"), fetchValueFromTextFields(totalPremiumIncludingDirectBusinessDiscountTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumIncludingTerrorismCover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumIncludingTerrorismCover"), fetchValueFromTextFields(totalPremiumIncludingTerrorismCoverTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumForFd")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumForFd"), fetchValueFromTextFields(totalPremiumTextFieldFD),AssertionType.WARNING);
					} 

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumForFd11")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumForFd11"), fetchValueFromTextFields(totalPremiumFDTextField),AssertionType.WARNING);
					} 


					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForFD")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForFD"), fetchValueFromTextFields(premiumTextField5),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforNonPetrochemicalBlock")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforNonPetrochemicalBlock"), fetchValueFromTextFields(premiumforNonPetrochemicalBlockTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1002Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1002Cover"), fetchValueFromTextFields(premiumAddOn1002CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1005Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1005Cover"), fetchValueFromTextFields(premiumAddOn1005CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1006Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1006Cover"), fetchValueFromTextFields(premiumAddOn1006CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1007Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1007Cover"), fetchValueFromTextFields(premiumAddOn1007CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1011Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1011Cover"), fetchValueFromTextFields(premiumAddOn1011CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1012Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1012Cover"), fetchValueFromTextFields(premiumAddOn1012CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1111Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1111Cover"), fetchValueFromTextFields(premiumAddOn1111CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1112Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1112Cover"), fetchValueFromTextFields(premiumAddOn1112CoverTextField), AssertionType.WARNING);
					}
					//AR
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigWeightedAverageRateMDFire")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("WeightedAverageRateMDFire"), fetchValueFromTextFields(weightedAverageRateMDFireTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigWeightedAverageRateMDMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("WeightedAverageRateMDMB"), fetchValueFromTextFields(weightedAverageRateMDMBTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumMD")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumMD"), fetchValueFromTextFields(totalPremiumMDFireTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumMDMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumMDMB"), fetchValueFromTextFields(totalPremiumMDMBTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumMDSection")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumMDSection"), fetchValueFromTextFields(totalPremiumMDSectionTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumMDIncludingVoluntaryDeductibles")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumMDIncludingVoluntaryDeductibles"), fetchValueFromTextFields(premiumMDIncludingVoluntaryDeductiblesTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBASISRateBI")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BASISRateBI"), fetchValueFromTextFields(bASISRateBIFireTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIARApplicableProfitsRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IARApplicableProfitsRate"), fetchValueFromTextFields(iARApplicableProfitsRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumBIFire")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumBIFire"), fetchValueFromTextFields(totalPremiumBIFireTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumBIIncludingVoluntaryDeductibles")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumBIIncludingVoluntaryDeductibles"), fetchValueFromTextFields(premiumBIIncludingVoluntaryDeductiblesTextField ), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumIARPolicy")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumIARPolicy"), fetchValueFromTextFields(premiumIARPolicyTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumIARPolicyIncludingIARDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumIARPolicyIncludingIARDiscount"), fetchValueFromTextFields(premiumIARPolicyIncludingIARDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumIARPolicyIncludingDirectDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumIARPolicyIncludingDirectDiscount"), fetchValueFromTextFields(premiumIARPolicyIncludingDirectDiscountTextField ), AssertionType.WARNING);
					}
					//DF
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFloaterPolicyRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FloaterPolicyRate"), fetchValueFromTextFields(floaterPolicyRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRSMDDeletionRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RSMDDeletionRate"), fetchValueFromTextFields(rSMDDeletionRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSpontaneousCombustionRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SpontaneousCombustionRate"), fetchValueFromTextFields(spontaneousCombustionRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTerrorismRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TerrorismRate"), fetchValueFromTextFields(terrorismRateTextField ), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigForestFireRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ForestFireRate"), fetchValueFromTextFields(forestFireRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigImpactDamageRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ImpactDamageRate"), fetchValueFromTextFields(impactDamageRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumForAllAddOnCoverExceptTerrorism")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumForAllAddOnCoverExceptTerrorism"), fetchValueFromTextFields(totalPremiumForAllAddOnCoverExceptTerrorismTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumFire")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumFire"), fetchValueFromTextFields(totalPremiumFireTextfield), AssertionType.WARNING);
					}
					//LP
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumDualBasis")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumDual"), fetchValueFromTextFields(premiumDualBasisTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumProrata")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumProrata"), fetchValueFromTextFields(premiumProrataTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumLayOff")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumLayOff"), fetchValueFromTextFields(premiumLayOffTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumAuditors")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumAuditors"), fetchValueFromTextFields(premiumAuditorsTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigremiumExtCustPremises")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("remiumExtCustPremises"), fetchValueFromTextFields(premiumExtCustPremisesTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumExtCustProprtyOtherSit")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumExtCustProprtyOtherSit"), fetchValueFromTextFields(premiumExtCustProprtyOtherSitTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumExtCoverSupplierPremises")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumExtCoverSupplierPremises"), fetchValueFromTextFields(premiumExtCoverSupplierPremisesTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumExtelectGasWater")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumExtelectGasWater"), fetchValueFromTextFields(premiumExtelectGasWaterTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigpremiumExtSpoilageConseqLoss")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("premiumExtSpoilageConseqLoss"), fetchValueFromTextFields(premiumExtSpoilageConseqLossTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1018Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1018Cover"), fetchValueFromTextFields(premiumForAddOn1018CoverTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumSA")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumSA"), fetchValueFromTextFields(totalPremiumSATextField),AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1017Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1017Cover"), fetchValueFromTextFields(premiumAddOn1017CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumSF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumSF"), fetchValueFromTextFields(totalPremiumSFTextField), AssertionType.WARNING);
					}
					//SF

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1003Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1003Cover"), fetchValueFromTextFields(premiumAddOn1003CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1004Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1004Cover"), fetchValueFromTextFields(premiumAddOn1004CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1009Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1009Cover"), fetchValueFromTextFields(premiumAddOn1009CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1010Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1010Cover"), fetchValueFromTextFields(premiumAddOn1010CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1013Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1013Cover"), fetchValueFromTextFields(premiumAddOn1013CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1014Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1014Cover"), fetchValueFromTextFields(premiumAddOn1014CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1015Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1015Cover"), fetchValueFromTextFields(premiumAddOn1015CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1016Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1016Cover"), fetchValueFromTextFields(premiumAddOn1016CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1018Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1018Cover"), fetchValueFromTextFields(premiumAddOn1018CoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAddOn1110Cover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAddOn1110Cover"), fetchValueFromTextFields(premiumAddOn1110CoverTextField), AssertionType.WARNING);
					}
					//LP-SHRUTI
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForLP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForLP"),fetchValueFromTextFields(premiumForLPTextField), AssertionType.WARNING);
					}
				}
				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumIncludingExtensionPremiumBH")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumIncludingExtensionPremiumBH"), fetchValueFromTextFields(totalPremiumIncludingExtensionPremiumBHTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigGrossPremiumForET")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("GrossPremiumForET"),fetchValueFromTextFields(grossPremiumTextField), AssertionType.WARNING);
					}
					//MB
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateforMachineryBreakdownPercent")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateforMachineryBreakdownPercent"), fetchValueFromTextFields(basicRateforMachineryBreakdownPercentTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHigherExcessDiscountMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HigherExcessDiscountMB"),fetchValueFromTextFields(higherExcessDiscountMBTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateAfterHigherExcessMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateAfterHigherExcessMB"),fetchValueFromTextFields(rateAfterHigherExcessMBTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTechDiscountMachine")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TechDiscountMachine"), fetchValueFromTextFields(techDiscountMachineTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateAfterTechDiscountMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateAfterTechDiscountMB"),fetchValueFromTextFields(rateAfterTechDiscountMBTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateAfterTechDiscrDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateAfterTechDiscrDiscount"), fetchValueFromTextFields(rateAfterTechDiscrDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyRateMB")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PolicyRateMB"),fetchValueFromTextFields(policyRateMBTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPolicyEscalationPremium")) {
						if(membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("EF")||membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("EI")||membAtachCovrgPremSchdEntity.getStringValueForField("Product").equalsIgnoreCase("MB")){
							doubleClick(calculatePremiumButton);
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EscalationPremium"),fetchValueFromTextFields(policyEscalationPremiumTextField), AssertionType.WARNING);
						}
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEscalationRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EscalationRate"),fetchValueFromTextFields(escalationRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEscalationPremiumEF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EscalationPremiumEF"),fetchValueFromTextFields(escalationPremiumEFTextField), AssertionType.WARNING);
					}
					//EI
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumSchedule")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumSchedule"),fetchValueFromTextFields(totalPremiumScheduleTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDeletionOfFireAndAlliedPerilsDiscountRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DeletionOfFireAndAlliedPerilsDiscountRate"),fetchValueFromTextFields(deletionOfFireAndAlliedPerilsDiscountRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterDeletionOfFireAndAlliedPerilsDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterDeletionOfFireAndAlliedPerilsDiscount"),fetchValueFromTextFields(netRateAfterDeletionOfFireAndAlliedPerilsDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterHigherExcessDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterHigherExcessDiscount"),fetchValueFromTextFields(netRateAfterHigherExcessDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTechnicalDiscountRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TechnicalDiscountRate"),fetchValueFromTextFields(technicalDiscountRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterTechnicalDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterTechnicalDiscount"),fetchValueFromTextFields(netRateAfterTechnicalDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscretionaryAndAdditonalDiscretionaryDiscountRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscretionaryAndAdditonalDiscretionaryDiscountRate"),fetchValueFromTextFields(discretionaryAndAdditonalDiscretionaryDiscountRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterAllDiscounts")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterAllDiscounts"),fetchValueFromTextFields(netRateAfterAllDiscountsTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthquakeExtra")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthquakeExtra"),fetchValueFromTextFields(earthquakeExtraTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumOfSTFICover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumOfSTFICover"),fetchValueFromTextFields(basicPremiumOfSTFICoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRatepercentForSTFICover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RatepercentForSTFICover"),fetchValueFromTextFields(ratepercentForSTFICoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthQuakePremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthQuakePremium"),fetchValueFromTextFields(earthQuakePremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommission")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountInLieuOfAgentCommission"),fetchValueFromTextFields(discountInLieuOfAgentCommissionTextField), AssertionType.WARNING);
					}
					//ER

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRate2months")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Rate2months"),fetchValueFromTextFields(rate2monthsTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRate10SubsequentMonths")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("Rate10SubsequentMonths"),fetchValueFromTextFields(rate10SubsequentMonthsTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateExceeding12Months")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateExceeding12Months"),fetchValueFromTextFields(rateExceeding12MonthsTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateTestingPeriodExtension")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateTestingPeriodExtension"),fetchValueFromTextFields(rateTestingPeriodExtensionTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExcessPerClaimNormal")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExcessPerClaimNormal"),fetchValueFromTextFields(excessPerClaimNormalTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExcessPerClaimTestingPeriod")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExcessPerClaimTestingPeriod"),fetchValueFromTextFields(excessPerClaimTestingPeriodTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountInEarthquakePremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountInEarthquakePremium"),fetchValueFromTextFields(discountInEarthquakePremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNewExcessPerClaimNormal")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NewExcessPerClaimNormal"),fetchValueFromTextFields(newExcessPerClaimNormalTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNewExcessPerClaimTestingPeriod")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NewExcessPerClaimTestingPeriod"),fetchValueFromTextFields(newExcessPerClaimTestingPeriodTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountInPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountInPremium"),fetchValueFromTextFields(discountInPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateNewMachine")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateNewMachine"),fetchValueFromTextFields(basicRateNewMachineTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateOldMachine")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateOldMachine"),fetchValueFromTextFields(basicRateOldMachineTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateAfterPolicyHigherExcessNew")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateAfterPolicyHigherExcessNew"),fetchValueFromTextFields(rateAfterPolicyHigherExcessNewTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRateAfterPolicyHigherExcessOld")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RateAfterPolicyHigherExcessOld"),fetchValueFromTextFields(rateAfterPolicyHigherExcessOldTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthquakeEffectiveRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthquakeEffectiveRate"),fetchValueFromTextFields(earthquakeEffectiveRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigApplicableEquakeRateAfterEquakeHigherExcessDis")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ApplicableEquakeRateAfterEquakeHigherExcessDis"),fetchValueFromTextFields(applicableEquakeRateAfterEquakeHigherExcessDisTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEQpremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EQpremium"),fetchValueFromTextFields(eQpremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPolicyRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPolicyRate"),fetchValueFromTextFields(totalPolicyRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPolicyRateOld")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPolicyRateOld"),fetchValueFromTextFields(totalPolicyRateOldTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumNew")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumNew"),fetchValueFromTextFields(basicPremiumNewTextField), AssertionType.WARNING);
					}


					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumOld")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumOld"),fetchValueFromTextFields(basicPremiumOldTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicCoveragePremiumNew")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicCoveragePremiumNew"),fetchValueFromTextFields(basicCoveragePremiumNewTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicCoveragePremiumOld")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicCoveragePremiumOld"),fetchValueFromTextFields(basicCoveragePremiumOldTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalPremiumOldNew")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalPremiumOldNew"),fetchValueFromTextFields(totalPremiumOldNewTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalDiscountTechcommercial")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalDiscountTechcommercial"),fetchValueFromTextFields(totalDiscountTechcommercialTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAfterAllDiscounts")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAfterAllDiscounts"),fetchValueFromTextFields(premiumAfterAllDiscountsTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterDeletionOfFireAndLighteningDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterDeletionOfFireAndLighteningDiscount"),fetchValueFromTextFields(netRateAfterDeletionOfFireAndLighteningDiscountTextField), AssertionType.WARNING);
					}	
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremForDismantlingRisk")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremForDismantlingRisk"),fetchValueFromTextFields(premForDismantlingRiskTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremForMaintenanceCover")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremForMaintenanceCover"),fetchValueFromTextFields(premForMaintenanceCoverTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremForEscalationCost")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremForEscalationCost"),fetchValueFromTextFields(premForEscalationCostTextField), AssertionType.WARNING);
					}

					//EC
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDeletionOfFireAndLighteningDiscountRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DeletionOfFireAndLighteningDiscountRate"),fetchValueFromTextFields(deletionOfFireAndLighteningDiscountRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigClaimExperienceDiscountOrLoading")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ClaimExperienceDiscountOrLoading"),fetchValueFromTextFields(claimExperienceDiscountOrLoadingTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEscalationOfSi")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EscalationOfSi"),fetchValueFromTextFields(escalationOfSiTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDebrisRemovalRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DebrisRemovalRate"),fetchValueFromTextFields(debrisRemovalRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDebrisRemovalPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DebrisRemovalPremium"),fetchValueFromTextFields(debrisRemovalPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExpressFreightRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExpressFreightRate"),fetchValueFromTextFields(expressFreightRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExpressFreightPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExpressFreightPremium"),fetchValueFromTextFields(expressFreightPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAirFreightRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AirFreightRate"),fetchValueFromTextFields(airFreightRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAirFreightPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AirFreightPremium"),fetchValueFromTextFields(airFreightPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSurroundingPropertyRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SurroundingPropertyRate"),fetchValueFromTextFields(surroundingPropertyRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSurroundingPropertyPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SurroundingPropertyPremium"),fetchValueFromTextFields(surroundingPropertyPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigThirdPartyLiabilityRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ThirdPartyLiabilityRate"),fetchValueFromTextFields(thirdPartyLiabilityRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigThirdPartyLiabilityPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ThirdPartyLiabilityPremium"),fetchValueFromTextFields(thirdPartyLiabilityPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalCustomDutyRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalCustomDutyRate"),fetchValueFromTextFields(additionalCustomDutyRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalCustomDutyPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalCustomDutyPremium"),fetchValueFromTextFields(additionalCustomDutyPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalAddOnPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalAddOnPremium"),fetchValueFromTextFields(totalAddOnPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTeRateUpto500cr")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TeRateUpto500cr"),fetchValueFromTextFields(teRateUpto500crTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("SumInsuredForTerrorism"),fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTerrorismExtensionPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TerrorismExtensionPremium"),fetchValueFromTextFields(terrorismExtensionPremiumTextField), AssertionType.WARNING);
					}

					// CF

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateForCPM")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateForCPM"),fetchValueFromTextFields(basicRateForCPMTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateUndergroundAndRailwayRrackLoadingCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateUndergroundAndRailwayRrackLoadingCF"),fetchValueFromTextFields(basicRateUndergroundAndRailwayTrackLoadingCFTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterHigherExcessDiscountCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterHigherExcessDiscountCF"),fetchValueFromTextFields(netRateAfterHigherExcessDiscountCFTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHigherExcessDiscountCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HigherExcessDiscountCF"),fetchValueFromTextFields(higherExcessDiscountCFTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthQuakePremiumCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthQuakePremiumCF"),fetchValueFromTextFields(earthQuakePremiumCFTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumOfSTFICoverCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumOfSTFICoverCF"),fetchValueFromTextFields(basicPremiumOfSTFICoverCFTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetBasicAndEarthquakePremiumCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetBasicAndEarthquakePremiumCF"),fetchValueFromTextFields(netBasicAndEarthquakePremiumCFTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetRateAfterTechDiscetionaryCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetRateAfterTechDiscetionaryCF"),fetchValueFromTextFields(netRateAfterTechDiscetionaryAddDiscetionaryDiscTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigNetBasicPremiumCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("NetBasicPremiumCF"),fetchValueFromTextFields(netBasicPremiumTextField), AssertionType.WARNING);
					}

					// CM

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthquakeExtraCF")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthquakeExtraCF"),fetchValueFromTextFields(earthquakeExtraCFTextField), AssertionType.WARNING);
					}
					//AA-Priyanka 
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforSparesWar")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforSparesWar"), fetchValueFromTextFields(basicPremiumforSparesWarTextFeild), AssertionType.WARNING);
					} 
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforAlliedPerils")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforAlliedPerils"), fetchValueFromTextFields(basicPremiumforAlliedPerilsTextFeild), AssertionType.WARNING);
					} 
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforExcessLiability")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforExcessLiability"), fetchValueFromTextFields(basicPremiumforExcessLiabilityTextFeild), AssertionType.WARNING);
					} 

					//AH-Priyanka
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigHullCoverPremiumAH")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("HullCoverPremiumAH"),fetchValueFromTextFields(hullCoverPremiumAHTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExtensionOfGeographicalAreaPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExtensionOfGeographicalAreaPremium"),fetchValueFromTextFields(extensionOfGeographicalAreaPremiumTextField), AssertionType.WARNING);
					}
					//DS
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountBasedOnClaimRatio")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountBasedOnClaimRatio"),fetchValueFromTextFields(discountBasedOnClaimRatioTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingBasedOnClaimRatio")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingBasedOnClaimRatio"),fetchValueFromTextFields(loadingBasedOnClaimRatioTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigExcessBasedOnClaimRatio")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ExcessBasedOnClaimRatio"),fetchValueFromTextFields(excessBasedOnClaimRatioTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRateForDS")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRateForDS"),fetchValueFromTextFields(basicRateForDSTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumBasedOnDesignStorCapacity")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumBasedOnDesignStorCapacity"),fetchValueFromTextFields(premiumBasedOnDesignedStorageCapacityTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMiniumPremiumForDS")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MiniumPremiumForDS"),fetchValueFromTextFields(miniumPremiumForDSTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumBasedOnDSSi")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumBasedOnDSSi"),fetchValueFromTextFields(premiumBasedOnDSSiTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigActualPremiumForDS")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ActualPremiumForDS"),fetchValueFromTextFields(actualPremiumForDSTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDSPremAfterDiscrAddDiscrDisc")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DSPremAfterDiscrAddDiscrDisc"),fetchValueFromTextFields(dSPremiumAfterDiscretionaryAdditionalDiscretionaryDiscTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremDSAfterDisInLieuOfAgentCommission")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremDSAfterDisInLieuOfAgentCommission"),fetchValueFromTextFields(premiumForDSAfterDiscountInLieuOfAgentCommissionTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFIFForALOP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FIFForALOP"),fetchValueFromTextFields(fIFForALOPTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFactorOfImpactFim")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FactorOfImpactFim"),fetchValueFromTextFields(factorOfImpactFimTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForWP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForWP"),fetchValueFromTextFields(premiumForWPTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumRateforCPM1")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumRateforCPM1"),fetchValueFromTextFields(premiumRateforCPM1TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumRateforCPM2")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumRateforCPM2"),fetchValueFromTextFields(premiumRateforCPM2TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumRateforCPM3")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumRateforCPM3"),fetchValueFromTextFields(premiumRateforCPM3TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumRateforCPM4")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumRateforCPM4"),fetchValueFromTextFields(premiumRateforCPM4TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumRateforCPM5")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumRateforCPM5"),fetchValueFromTextFields(premiumRateforCPM5TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateforCPM1")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateforCPM1"),fetchValueFromTextFields(basicPremiumRateforCPM1TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateforCPM2")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateforCPM2"),fetchValueFromTextFields(basicPremiumRateforCPM2TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateforCPM3")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateforCPM3"),fetchValueFromTextFields(basicPremiumRateforCPM3TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateforCPM4")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateforCPM4"),fetchValueFromTextFields(basicPremiumRateforCPM4TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumRateforCPM5")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumRateforCPM5"),fetchValueFromTextFields(basicPremiumRateforCPM5TextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAfterAllDiscountsForCR")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAfterAllDiscountsForCR"),fetchValueFromTextFields(premiumAfterAllDiscountsTextFieldForCR), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAfterDiscInLieuOfAgentCommiWP")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAfterDiscInLieuOfAgentCommiWP"),fetchValueFromTextFields(premiumAfterDiscountInLieuOfAgentCommissionTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumAfterDiscAndAddDiscretionaryDis")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumAfterDiscAndAddDiscretionaryDis"),fetchValueFromTextFields(premiumAfterDiscretionaryAndAdditionalDiscretionaryDiscountTextfield), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicRate"), fetchValueFromTextFields(basicRateTextField),AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigStipulatedAgeForBasicRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("StipulatedAgeForBasicRate"), fetchValueFromTextFields(stipulatedAgeForBasicRateTextField),AssertionType.WARNING);
					}
				}
				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					//HH
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumforSections")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumforSections"),fetchValueFromTextFields(basicPremiumforSectionsTextFeild), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumHH")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumHH"),fetchValueFromTextFields(basicPremiumHHTextFeild), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforAdditionalDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforAdditionalDiscount"),fetchValueFromTextFields(premiumforAdditionalDiscountHHTextFeild), AssertionType.WARNING);
					}

					//RM
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumDGMRMDiscretionaryDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumDGMRMDiscretionaryDiscount"),fetchValueFromTextFields(premiumDGMRMDiscretionaryDiscountTextFeild), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigDiscountAmountforDirectBusiness")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("DiscountAmountforDirectBusiness"),fetchValueFromTextFields(discountAmountforDirectBusinessTextFeild), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdverseClaimExperiencePremiumLoading")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdverseClaimExperiencePremiumLoading"),fetchValueFromTextFields(adverseClaimExperiencePremiumLoadingTextFeild), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOtherPremiumLoading")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OtherPremiumLoading"),fetchValueFromTextFields(otherPremiumLoadingTextFeild), AssertionType.WARNING);
					}
					//HH
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumSection1B")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumSection1B"),fetchValueFromTextFields(basicPremiumSection1BTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicpremiumSec3")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicpremiumSec3"),fetchValueFromTextFields(basicPremiumSection3TextField), AssertionType.WARNING);
					}
					//BB
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforMoneyinPremises")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforMoneyinPremises"),fetchValueFromTextFields(premiumforMoneyinPremisesTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforMoneyinTransit")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforMoneyinTransit"),fetchValueFromTextFields(premiumforMoneyinTransitTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigStaffLoadingAmount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("StaffLoadingAmount"),fetchValueFromTextFields(staffLoadingAmountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumForDC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumForDC"), fetchValueFromTextFields(premiumForDCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFloaterExtraPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FloaterExtraPremium"), fetchValueFromTextFields(floaterExtraPremiumTextField), AssertionType.WARNING);
					}
					//BD

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforStockinTrade")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforStockinTrade"), fetchValueFromTextFields(premiumforStockinTradeTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumforGoodsheldinTrustorComm")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumforGoodsheldinTrustorComm"), fetchValueFromTextFields(premiumforGoodsheldinTrustorCommissionTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumTheft")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumTheft"), fetchValueFromTextFields(basicPremiumTheftTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumOther")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumOther"), fetchValueFromTextFields(basicPremiumOtherTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumTotal")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumTotal"), fetchValueFromTextFields(basicPremiumTotalTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicPremiumBD")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicPremiumBD"), fetchValueFromTextFields(basicPremiumBDTextField), AssertionType.WARNING);
					}
				}	
				//deep--------------------------------

				if(membAtachCovrgPremSchdEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigfirePerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("firePerilPremiumRate"), fetchValueFromTextFields(firePerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFirePerilCVEPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FirePerilCVEPremiumRate"), fetchValueFromTextFields(firePerilPremiumRateCVETextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalDiscountonUsedwithinownPremises")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalDiscountonUsedwithinownPremises"), fetchValueFromTextFields(totalDiscountonUsedwithinownPremisesTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBurglaryPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BurglaryPerilPremiumRate"), fetchValueFromTextFields(burglaryPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBurglaryPerilCVEPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BurglaryPerilCVEPremiumRate"), fetchValueFromTextFields(burglaryPerilPremiumRateCVETextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalNCBDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalNCBDiscount"), fetchValueFromTextFields(totalNCBDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigRiotStrikePerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("RiotStrikePerilPremiumRate"), fetchValueFromTextFields(riotStrikePerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalODPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalODPremium"), fetchValueFromTextFields(totalODPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigEarthquakePerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("EarthquakePerilPremiumRate"), fetchValueFromTextFields(earthquakePerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalTPPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalTPPremium"), fetchValueFromTextFields(totalTPPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigFloodStormPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("FloodStormPerilPremiumRate"), fetchValueFromTextFields(floodStormPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumMotor"), fetchValueFromTextFields(premiumMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAccidentalPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AccidentalPerilPremiumRate"), fetchValueFromTextFields(accidentalPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigMaliciousPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("MaliciousPerilPremiumRate"), fetchValueFromTextFields(maliciousPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTerroristPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TerroristPerilPremiumRate"), fetchValueFromTextFields(terroristPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTransitPerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TransitPerilPremiumRate"), fetchValueFromTextFields(transitPerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLandslidePerilPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LandslidePerilPremiumRate"), fetchValueFromTextFields(landslidePerilPremiumRateTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLandslidePerilCVEPremiumRate")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LandslidePerilCVEPremiumRate"), fetchValueFromTextFields(landslidePerilPremiumRateCVETextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigODPremiumPercentage")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ODPremiumPercentage"), fetchValueFromTextFields(oDPremiumPercentageTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalODPremiumAmount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalODPremiumAmount"), fetchValueFromTextFields(additionalODPremiumAmountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicODPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicODPremium"), fetchValueFromTextFields(basicODPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateODPremiumpercentage")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateODPremiumpercentage"), fetchValueFromTextFields(iMTRateODPremiumpercentageTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateBasicODPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateBasicODPremium"), fetchValueFromTextFields(iMTRateBasicODPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalpremiumforGVWabove12000KG")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalpremiumforGVWabove12000KG"), fetchValueFromTextFields(additionalpremiumforGVWabove12000KGTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateAdditionalpremiumforGVWabove12000kg")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateAdditionalpremiumforGVWabove12000kg"), fetchValueFromTextFields(iMTRateAdditionalpremiumforGVWabove12000kgTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigLoadingforRoadworthyCondition")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("LoadingforRoadworthyCondition"), fetchValueFromTextFields(loadingforRoadworthyConditionTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedNCBDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedNCBDiscount"), fetchValueFromTextFields(calculatedNCBDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateCalculatedNCBDiscount")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateCalculatedNCBDiscount"), fetchValueFromTextFields(iMTRateCalculatedNCBDiscountTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedODPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedODPremium"), fetchValueFromTextFields(calculatedODPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTPPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTPPremium"), fetchValueFromTextFields(basicTPPremiumTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTPCVEPremium")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTPCVEPremium"), fetchValueFromTextFields(basicTPPremiumCVETextField), AssertionType.WARNING);
					}


					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAddLLunderWCAforcarriageofmorethansixemployees")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AddLLunderWCAforcarriageofmorethansixemployees"), fetchValueFromTextFields(addLLunderWCAforcarriageofmorethansixemployeesTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedTPPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedTPPremiumMotor"), fetchValueFromTextFields(calculatedTPPremiumMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedCVETPPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedCVETPPremiumMotor"), fetchValueFromTextFields(calculatedTPPremiumCVEMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiumMotor"), fetchValueFromTextFields(calculatedPremiumMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedCVEPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedCVEPremiumMotor"), fetchValueFromTextFields(calculatedPremiumCVEMotorTextField), AssertionType.WARNING);
					}
					//PC


					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigODPremiumPercentagePC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ODPremiumPercentagepc"), fetchValueFromTextFields(oDPremiumPercentagePCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigimtRateODPremiumpercentagePC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateODPremiumpercentagePC"), fetchValueFromTextFields(imtRateODPremiumpercentagePCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicODPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicODPremiumPC"), fetchValueFromTextFields(basicODPremiumPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateBasicODPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateBasicODPremiumPC"), fetchValueFromTextFields(imtRateBasicODPremiumPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalPremiumforNonElectricalfittingPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalPremiumforNonElectricalfittingPC"), fetchValueFromTextFields(additionalPremiumforNonElectricalfittingPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalODPremiumwithoutDDPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalODPremiumwithoutDDPC"), fetchValueFromTextFields(totalODPremiumwithoutDDPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedODPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedODPremiumPC"), fetchValueFromTextFields(calculatedODPremiumPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTPPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTPPremiumPC"), fetchValueFromTextFields(basicTPPremiumPCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigcalculatedTPPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedTPPremiumPC"), fetchValueFromTextFields(calculatedTPPremiumPCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiumPC"), fetchValueFromTextFields(calculatedPremiumPCTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicODPremiumodPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicODPremiumodPC"), fetchValueFromTextFields(basicODPremiumodPCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalPremiumforNonElectricalfittinggPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalPremiumforNonElectricalfittinggPC"), fetchValueFromTextFields(additionalPremiumforNonElectricalfittinggPCTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumodPC")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumodPC"), fetchValueFromTextFields(premiumodPCTextField), AssertionType.WARNING);
					}

					//CV-G
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigOdDiscountForPrmisesCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("OdDiscountForPrmisesCVGMotor"), fetchValueFromTextFields(odDiscountForPrmisesCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedODPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedODPremiumCVGMotor"), fetchValueFromTextFields(calculatedODPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTPPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTPPremiumCVGMotor"), fetchValueFromTextFields(basicTPPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTpDiscountForPrmisesCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TpDiscountForPrmisesCVGMotor"), fetchValueFromTextFields(tpDiscountForPrmisesCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTpLoadingForWorkingAwayCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TpLoadingForWorkingAwayCVGMotor"), fetchValueFromTextFields(tpLoadingForWorkingAwayCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedTPPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedTPPremiumCVGMotor"), fetchValueFromTextFields(calculatedTPPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiumCVGMotor"), fetchValueFromTextFields(calculatedPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalOdPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalOdPremiumCVGMotor"), fetchValueFromTextFields(totalOdPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalTPPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalTPPremiumCVGMotor"), fetchValueFromTextFields(totalTPPremiumCVGMotorTextField), AssertionType.WARNING);
					}
					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumCVGMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumCVGMotor"), fetchValueFromTextFields(premiumCVGMotorTextField), AssertionType.WARNING);
					}

					if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedCVbTPPremiumMotor")) {
						assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremium12Motor"), fetchValueFromTextFields(calculatedPremiumCVbMotorTextField), AssertionType.WARNING);



						//TW
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigODPremiumPercentageTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ODPremiumPercentageTW"), fetchValueFromTextFields(oDPremiumPercentageTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigImtRateODPremiumpercentageTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("ImtRateODPremiumpercentageTW"), fetchValueFromTextFields(imtRateODPremiumpercentageTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicODPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicODPremiumTW"), fetchValueFromTextFields(basicODPremiumTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigIMTRateBasicODPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("IMTRateBasicODPremiumTW"), fetchValueFromTextFields(imtRateBasicODPremiumTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigInsuredDeclaredValueForCoverTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("InsuredDeclaredValueForCoverTW"), fetchValueFromTextFields(insuredDeclaredValueCoverTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigAdditionalPremiumForFiberGlassTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("AdditionalPremiumForFiberGlassTW"), fetchValueFromTextFields(additionalPremiumForFiberGlassTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalODPremiumWithoutDDTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalODPremiumWithoutDDTW"), fetchValueFromTextFields(totalOdPremiumWithoutDDTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedODPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedODPremiumTW"), fetchValueFromTextFields(calculatedOdPremiumTWTextField), AssertionType.WARNING);
						}

						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBasicTPPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("BasicTPPremiumTW"), fetchValueFromTextFields(basicTPPremiumTWTextField), AssertionType.WARNING);
						}
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedTPPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedTPPremiumTW"), fetchValueFromTextFields(calculatedTPPremiumTWTextField), AssertionType.WARNING);
						}
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatedPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("CalculatedPremiumTW"), fetchValueFromTextFields(calculatedPremiumTWTextField), AssertionType.WARNING);
						}
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalOdPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalOdPremiumTW"), fetchValueFromTextFields(totalODPremiumTWTextField), AssertionType.WARNING);
						}
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigTotalTPPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("TotalTPPremiumTW"), fetchValueFromTextFields(totalTpPremiumTWTextField), AssertionType.WARNING);
						}
						if (membAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigPremiumTW")) {
							assertReference.assertEquals(membAtachCovrgPremSchdEntity.getStringValueForField("PremiumTW"), fetchValueFromTextFields(premiumTWTextField), AssertionType.WARNING);
						}

					}
					}
				}
			}
		}





	public void submitPolicyPremiumDetail(MembAtachCovrgPremSchdEntity MembAtachCovrgPremSchdEntity) {
		if (MembAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");


		}}


	//Abdul

	public void submitPolicyPremCP(MembAtachCovrgPremSchdEntity MembAtachCovrgPremSchdEntity) {
		if (MembAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigSavecpButton")) {
			click(saveCpButton);
			switchToFrame("display");


		}}


	public void calculatePremiumPolicyButton(MembAtachCovrgPremSchdEntity MembAtachCovrgPremSchdEntity) {
		if (MembAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigCalculatePremiumButton")) {
			click(calculatePremiumButton);
			switchToFrame("display");
		}
	}
	public void backPolicyListDetails1(MembAtachCovrgPremSchdEntity MembAtachCovrgPremSchdEntity) {
		if (MembAtachCovrgPremSchdEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");

		}
	}

	public void fillandSubmitPolicyPremiumDetails(MembAtachCovrgPremSchdEntity 	membAtachCovrgPremSchdEntity, CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(membAtachCovrgPremSchdEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemberPremiumDetails(membAtachCovrgPremSchdEntity, assertReference);
			calculatePremiumPolicyButton(membAtachCovrgPremSchdEntity);
			submitPolicyPremiumDetail(membAtachCovrgPremSchdEntity);
			submitPolicyPremCP(membAtachCovrgPremSchdEntity);
			navigateToPolicyTab(membAtachCovrgPremSchdEntity);
			navigateToAttributeTab(membAtachCovrgPremSchdEntity);
			navigateToInsuredInterestTab(membAtachCovrgPremSchdEntity);
			navigateToCoverageTab(membAtachCovrgPremSchdEntity);
			navigateToClientDetailsTab(membAtachCovrgPremSchdEntity);
			navigateToRelationsTab(membAtachCovrgPremSchdEntity);
			navigateToPaymentsTab(membAtachCovrgPremSchdEntity);
			navigateToFollowupTab(membAtachCovrgPremSchdEntity);
			navigateToDocumentTab(membAtachCovrgPremSchdEntity);
			navigateToDetail1Tab(membAtachCovrgPremSchdEntity);
			navigateToAttributes1Tab(membAtachCovrgPremSchdEntity);
			navigateToAttachCoverageTab(membAtachCovrgPremSchdEntity);
			navigateToRelationTab(membAtachCovrgPremSchdEntity);
			navigateToPaymentTab(membAtachCovrgPremSchdEntity);
			navigateToPremiumTab(membAtachCovrgPremSchdEntity);
		}
	}
}























