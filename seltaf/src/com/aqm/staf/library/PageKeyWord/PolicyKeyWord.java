package com.aqm.staf.library.PageKeyWord;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.framework.core.hibernate.CustomizableEntity;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.*;
import com.aqm.staf.library.pages.aviation.AviationRiskDetailIIT2PLR;
import com.aqm.staf.library.pages.aviation.AviationRiskDetailT3PLR;
import com.aqm.staf.library.pages.aviation.AviationStandardCoverAHT1PRC;
import com.aqm.staf.library.pages.aviation.PolicyAttributeAviation;
import com.aqm.staf.library.pages.aviation.PolicyAttributeInsuranceHistoryT5POLAviation;
import com.aqm.staf.library.pages.aviation.PolicyInsuredIntrestAviation;
import com.aqm.staf.library.pages.common.AccountingCollectionSearchCollection;
import com.aqm.staf.library.pages.common.ClientDetailsPage;
import com.aqm.staf.library.pages.common.ClonePolicyScheme;
import com.aqm.staf.library.pages.common.MemberAttachCoverage_PremiumSchedule;
import com.aqm.staf.library.pages.common.PolicyAttribute;
import com.aqm.staf.library.pages.common.PolicyAttributeCoPaymentAndClaimRatio;
import com.aqm.staf.library.pages.common.PolicyAttributeDetailsT1POL;
import com.aqm.staf.library.pages.common.PolicyCoInsuranceDetailsPage;
import com.aqm.staf.library.pages.common.PolicyCoverageCoverageList;
import com.aqm.staf.library.pages.common.PolicyCoverageDetailsPage;
import com.aqm.staf.library.pages.common.PolicyDetailsCreateEditPage;
import com.aqm.staf.library.pages.common.PolicyFollowupPage;
import com.aqm.staf.library.pages.common.PolicyInsuredInterestAtrributeBalancePremium;
import com.aqm.staf.library.pages.common.PolicyInsuredInterestAttrIMJourneyDetailsPZ;
import com.aqm.staf.library.pages.common.PolicyMemberAttachCoverages;
import com.aqm.staf.library.pages.common.PolicyMemberAttachCoveragseAttributes;
import com.aqm.staf.library.pages.common.PolicyMemberAttributeNextGroupPage;
import com.aqm.staf.library.pages.common.PolicyMemberDetails;
import com.aqm.staf.library.pages.common.PolicyMemberInsuredMemberDetailBH;
import com.aqm.staf.library.pages.common.PolicyPaymentDetailsCycle;
import com.aqm.staf.library.pages.common.PolicyPolicyMemberAttachCoverageDeatils;
import com.aqm.staf.library.pages.common.PolicyPremiumCollectionPage;
import com.aqm.staf.library.pages.common.PolicyRelationsSearchPage;
import com.aqm.staf.library.pages.common.PolicySearchPage;
import com.aqm.staf.library.pages.common.Policy_MemberSearchPage;
import com.aqm.staf.library.pages.common.PreviousPolicyHistoryPage;
import com.aqm.staf.library.pages.creditShield.ClaimTransferToAPPage;
import com.aqm.staf.library.pages.creditShield.PolicyAttributeCDPolicyDetailsCreaditShield;
import com.aqm.staf.library.pages.creditShield.PolicyAttributePolicyDetailsCreaditShield;
import com.aqm.staf.library.pages.creditShield.PolicyAttributePreviousPolicyDetailCreaditShield;
import com.aqm.staf.library.pages.creditShield.PolicyAttributeQuotationDetailsCreditShield;
import com.aqm.staf.library.pages.creditShield.PolicyAttributeReinsuranceTypeRuleCreaditShield;
import com.aqm.staf.library.pages.creditShield.PolicyInsuredInterestAttributeBuyerDetailsCreditShield;
import com.aqm.staf.library.pages.engineering.PolSectionDetailsEngineer;
import com.aqm.staf.library.pages.engineering.PolicyAttributeAddOnCoversDetailsEngineering;
import com.aqm.staf.library.pages.engineering.PolicyAttributeDiscretionaryDiscountForEng;
import com.aqm.staf.library.pages.engineering.PolicyAttributeEngineering;
import com.aqm.staf.library.pages.engineering.PolicyAttributeEquipmentsEngineering;
import com.aqm.staf.library.pages.engineering.PolicyAttributeOtherDMSumInsured;
import com.aqm.staf.library.pages.engineering.PolicyAttributeProjectDetailEngineering;
import com.aqm.staf.library.pages.engineering.PolicyAttributePropertyDamageAddOnEngineering;
import com.aqm.staf.library.pages.engineering.PolicyInsuredInrestAttributeSumInsuredDetailsEngineering;
import com.aqm.staf.library.pages.engineering.PolicyInsuredInterestAttributeTransportCommodityDetails;
import com.aqm.staf.library.pages.engineering.PolicyInsuredIntrestAttachDetailsofTerrorismCover;
import com.aqm.staf.library.pages.engineering.PolicyInsuredIntrestAttributeEarthquakeZoneEngineering;
import com.aqm.staf.library.pages.engineering.PolicyInsuredIntrestAttributeEngineering;
import com.aqm.staf.library.pages.engineering.PolicyInsuredIntrestAttributeMeritRatingDetail;
import com.aqm.staf.library.pages.engineering.PolicyInsuredIntrestAttributeSTFICoverEngineering;
import com.aqm.staf.library.pages.fire.CapitalAdditionDetails;
import com.aqm.staf.library.pages.fire.LRPRCADD;
import com.aqm.staf.library.pages.fire.PmlDetails;
import com.aqm.staf.library.pages.fire.PolAttrAddOnCovers;
import com.aqm.staf.library.pages.fire.PolAttrPERate;
import com.aqm.staf.library.pages.fire.PolInsIntAttachCovAttrCheckPlantSIbreakFire;
import com.aqm.staf.library.pages.fire.PolInsIntAttachCovAttrRiskCoverPropertyFire;
import com.aqm.staf.library.pages.fire.PolInsIntAttachCovAttrUtilityFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeLPSFPolicyDetailFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeRiskFinanceDetailsFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeSFStatusOfIntermediariesFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeSecurityAndOthrInfoFire;
import com.aqm.staf.library.pages.fire.PolicyAttributeSpecialConditionFire;
import com.aqm.staf.library.pages.fire.PolicyInsuredIntrestAttributeFire;
import com.aqm.staf.library.pages.fire.PolicyInsuredIntrestNetProfitFire;
import com.aqm.staf.library.pages.fire.PolicyInsuredIntrestRiskDetailsIARPolicyFire;
import com.aqm.staf.library.pages.fire.PolicyInsuredIntrestSpecialFieldsFire;
import com.aqm.staf.library.pages.health.BrokerAgentTPAChangeDet;
import com.aqm.staf.library.pages.health.MedicalCheckUpDetails;
import com.aqm.staf.library.pages.health.OptionalTPARule;
import com.aqm.staf.library.pages.health.PolGHT1PLRMemberPage;
import com.aqm.staf.library.pages.health.PolGHT2PLRMemberPage;
import com.aqm.staf.library.pages.health.PolIsMemberPortedFromNonNiaPolicyPage;
import com.aqm.staf.library.pages.health.PolicyAccountingCollectionSearch;
import com.aqm.staf.library.pages.health.PolicyAttributeBreakInInsuranceHealth;
import com.aqm.staf.library.pages.health.PolicyAttributeClaimFreeYears;
import com.aqm.staf.library.pages.health.PolicyAttributeHealth;
import com.aqm.staf.library.pages.health.PolicyAttributeInstallementFacility;
import com.aqm.staf.library.pages.health.PolicyAttributeProvisionalPolicyDetailsPage;
import com.aqm.staf.library.pages.health.PolicyAttributeTypeOfDevelopmentOfficerPage;
import com.aqm.staf.library.pages.health.PolicyClaimSynopsisPage;
import com.aqm.staf.library.pages.health.PolicyInsuredAttrLoadingAmbulance;
import com.aqm.staf.library.pages.health.PolicyInsuredAttributesBasicPrem1;
import com.aqm.staf.library.pages.health.PolicyInsuredAttributesBasicPrem2;
import com.aqm.staf.library.pages.health.PolicyInsuredAttributesBasicPrem3;
import com.aqm.staf.library.pages.health.PolicyInsuredIntrestTailorPremiumDetailsTF;
import com.aqm.staf.library.pages.health.PolicyInsuredLoadingDiscountOptionPage;
import com.aqm.staf.library.pages.health.PolicyMemAttrRiskDetailsForSTDRiskPage;
import com.aqm.staf.library.pages.health.PolicyMemPreExistingDiseaseatRenew;
import com.aqm.staf.library.pages.health.PolicyMemSpecialConditionsTGTF;
import com.aqm.staf.library.pages.health.PolicyMemStartDateForMember;
import com.aqm.staf.library.pages.health.PolicyMemberAttributeHealth;
import com.aqm.staf.library.pages.health.PolicyMemberAttributeSumInsuredForMUPage;
import com.aqm.staf.library.pages.health.PolicyMemberAttributes;
import com.aqm.staf.library.pages.health.PolicyMemberAttributesGroupNumberPage;
import com.aqm.staf.library.pages.health.PolicyMemberAttributesMemberNumberPage;
import com.aqm.staf.library.pages.health.PolicyMemberAttributesNextGroupPage;
import com.aqm.staf.library.pages.health.PolicyMemberCoPaymentSC;
import com.aqm.staf.library.pages.health.PolicyMemberPreviousPolicyDataBH;
import com.aqm.staf.library.pages.health.PolicyPremiumSchedulePage;
import com.aqm.staf.library.pages.health.PolicyRelationDetail;
import com.aqm.staf.library.pages.health.Policy_MemberAttributeCoPaymentCommulativeBonus;
import com.aqm.staf.library.pages.health.Portability;
import com.aqm.staf.library.pages.marineCargo.AttachCovAttributesMarineCargo;
import com.aqm.staf.library.pages.marineCargo.PolicyAttributeMarineCargo;
import com.aqm.staf.library.pages.marineCargo.PolicyInsuredInrestAttributeCargoDetailsMarineCargo;
import com.aqm.staf.library.pages.marineCargo.PolicyInsuredInrestAttributeForMArineCargo;
import com.aqm.staf.library.pages.marineHull.PolicyAttributePolicyDeatilsMarineHull;
import com.aqm.staf.library.pages.marineHull.PolicyInsuredIntrestAttrPolicyDetailMarineHull;
import com.aqm.staf.library.pages.marineHull.PolicyAttributeMarineHull;
import com.aqm.staf.library.pages.marineHull.PolicyInsIntAttachCoverageCoverRuleMarineHull;
import com.aqm.staf.library.pages.marineHull.PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn;
import com.aqm.staf.library.pages.marineHull.PolicyInsuredIntrestFleetDetailsMarineHull;
import com.aqm.staf.library.pages.marineHull.PolicyInsuredIntrestVesselInformationPLR;
import com.aqm.staf.library.pages.miscLiability.AttachCoverageAttributesCoverageDetailsPage;
import com.aqm.staf.library.pages.miscLiability.DetailsOfWagesAndAccidentsMiscPages;
import com.aqm.staf.library.pages.miscLiability.Exten1DetailsMiscInsurePage;
import com.aqm.staf.library.pages.miscLiability.Exten2DetailsMiscInsurePage;
import com.aqm.staf.library.pages.miscLiability.Exten3DetailsMiscInsurePage;
import com.aqm.staf.library.pages.miscLiability.PDRiskDetailSecondPageML;
import com.aqm.staf.library.pages.miscLiability.PolicyInsuredIntrestAttributePremiumRateForPFMisc;
import com.aqm.staf.library.pages.miscLiability.RiskDetailsFirstPageMiscInsured;
import com.aqm.staf.library.pages.miscLiability.RiskDetailsFourthPageMiscInsured;
import com.aqm.staf.library.pages.miscLiability.RiskDetailsSecondPageMiscInsured;
import com.aqm.staf.library.pages.miscLiability.RiskDetailsThirdPageMiscInsured;
import com.aqm.staf.library.pages.miscLiability.SpecialConditionMiscPage;
import com.aqm.staf.library.pages.miscLiability.VoluntaryExcessDetailsPage;
import com.aqm.staf.library.pages.miscNonLiability.PolicyAttributeMiscNonLiability;
import com.aqm.staf.library.pages.miscNonLiability.PolicyHistoryForMiscNL;
import com.aqm.staf.library.pages.miscNonLiability.PolicyInsuredIntrestAttributeMiscNL;
import com.aqm.staf.library.pages.miscNonLiability.PolicyInsuredIntrestOtherRiskDetailsMiscNL;
import com.aqm.staf.library.pages.miscNonLiability.PolicyInsuredIntrestRiskDetailsMiscNL;
import com.aqm.staf.library.pages.miscNonLiability.SpecialConditionForMiscNL;
import com.aqm.staf.library.pages.miscNonLiability.StandardCoverDetailsForMiscNL;
import com.aqm.staf.library.pages.motor.PolicyAttributeMotor;
import com.aqm.staf.library.pages.motor.PolicyAttributeMotorPOS;
import com.aqm.staf.library.pages.motor.PolicyAttrributeGstUpadateParam;
import com.aqm.staf.library.pages.motor.PolicyInsIntrstCovrageAttrSumInsuredOne;
import com.aqm.staf.library.pages.motor.PolicyInsIntrstCovrageAttrSumInsuredTwo;
import com.aqm.staf.library.pages.motor.PolicyInsuredIntrestBasicCommVehicleDetailsMotor;
import com.aqm.staf.library.pages.motor.PolicyInsuredIntrestDriverDetailsCVT4PLRMotor;
import com.aqm.staf.library.pages.motor.PolicyInsuredIntrestMoreCommercialVehicleDetailMotor;
import com.aqm.staf.library.pages.motor.PolicyInsuredIntrestPreviousHistoryOfMotor;
import com.aqm.staf.library.pages.motor.PolicyInsuredIntrestVehicleValueDetailsMotor;
//import com.aqm.staf.library.pages.health.PreviousPolicyHistoryForRenew;
import com.aqm.staf.library.pages.personalAccident.PolicyAttributePUAddoncoveragePersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyAttributePersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyAttributePolicyDetails2PUPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyAttributePolicyHistoryforPUPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredAttrGroupNamedDetailsPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredInterestSpecialConditionsPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredIntrestCoverDetailsPUPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyInsuredIntrestRiskDetailsT1PLRPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.PolicyShowVersionPage;
import com.aqm.staf.library.pages.rural.PolicyAttachCoverageLoadingAndDiscountDetailRural;
import com.aqm.staf.library.pages.rural.PolicyAttributeRural;
import com.aqm.staf.library.pages.rural.PolicyInsuredInterestAttributeRiskDetail1Rural;
import com.aqm.staf.library.pages.rural.PolicyTransferToAP;
import com.aqm.staf.library.pages.rural.RiskDetail2Rural;

public class PolicyKeyWord extends FunctionalKeywords {
	public void createPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, ParseException{
		List<PolicyEntity> policyEntitiesList=testData.getPolicyRecords();
		for(PolicyEntity policyEntity:policyEntitiesList)
		{
			if(policyEntity.getAction().equalsIgnoreCase("add")&& policyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
				policySearchPage.navigateToPolicySearchPage();
				policySearchPage.navigateToPolicyCreatePage();
				PolicyDetailsCreateEditPage policyDetailsCreatePage=new PolicyDetailsCreateEditPage(driver, "Policy/Quote Details ");
				policyDetailsCreatePage.fillandSubmitPolicyDetails(policyEntity, assertReference);
				policyDetailsCreatePage.fetchQuoteNumber(policyEntity);
				testData.updateRecordsForCriteria(policyEntity);
				setEditPolicyDependancy(policyEntity,testData);
			}
		}
	}
	

	public void editPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		List<PolicyEntity> policyEntitiesList=testData.getPolicyRecords();
		for(PolicyEntity policyEntity:policyEntitiesList){

			if(policyEntity.getAction().equalsIgnoreCase("edit") && policyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
				policySearchPage.navigateToPolicySearchPage();
				policySearchPage.fillAndSearchPolicyDetails(policyEntity);
				policySearchPage.selectSearchQuote(policyEntity);
				policySearchPage.selectSearchPolicy(policyEntity);
				PolicyDetailsCreateEditPage policyDetailsCreatePage = new PolicyDetailsCreateEditPage(driver, "Policy Home Page");
				policyDetailsCreatePage.fillandSubmitPolicyDetails(policyEntity, assertReference);
				/*************** Policy Attribute*******************/
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					// *********** Addition of Member in Policy Member*****************// 
					else if(policyEntity.getBooleanValueForField("ConfigMemberTab")){
						policyMemberEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************* Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")|| policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}

				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeCreditShieldEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestCreditShieldEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")|| policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}

				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributePersonalAccidentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestPersonalAccidentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeRuralEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestRuralEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMiscLiabilityEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMiscLiabilityEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMiscNonLiabilityEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMiscNonLiabilityEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//*********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeAviationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestAviationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//************************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton") || policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMicroInsuranceEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestMicroInsuranceEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeEngineeringEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestEngineeringEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else	if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}


					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else	if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMarineCargoEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMarineCargoEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyCoverageHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClonePolicy")){
						setDependencyForClonePolicy(policyEntity, testData);
						createCloneHelper(testData, executionTestStep, assertReference, driver,stepGroup);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")||policyEntity.getBooleanValueForField("ConfigGenerateDuplicatePolicyButton")||policyEntity.getBooleanValueForField("ConfigTagNoChangeButton")){
						policyCollectionHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigTransferToAPButton")){
						policyTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigBrokerAgentTPAChangeDetLink")){
						policyBrokerAgentTPAChangeDetEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}


					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
			}
		}
	}
	//TODO	
	/*****************Verify
	 * @throws Exception ***************/
	public void verifyPolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		int rowcount=0;
		List<PolicyEntity> policyEntitiesList=testData.getPolicyRecords();
		for(PolicyEntity policyEntity:policyEntitiesList){
			if(policyEntity.getAction().equalsIgnoreCase("verify")&& policyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
				policySearchPage.navigateToPolicySearchPage();
				policySearchPage.fillAndSearchPolicyDetails(policyEntity);
				policySearchPage.selectSearchQuote(policyEntity);
				policySearchPage.selectSearchPolicy(policyEntity);
				PolicyDetailsCreateEditPage policyDetailsCreatePage=new PolicyDetailsCreateEditPage(driver, "Policy Home Page");
				policyDetailsCreatePage.fillandSubmitPolicyDetails(policyEntity, assertReference);


				//setDependencyForMemberCode(policyEntity,testData);
				/************** Policy Attribute**********************/
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					// ***************************** Addition of Member in Policy Member*********************// 
					else if(policyEntity.getBooleanValueForField("ConfigMemberTab")){
						policyMemberVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyPremiumScheduleDetails")||policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeCreditShieldVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestCreditShieldVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyPremiumScheduleDetails")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributePersonalAccidentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestPersonalAccidentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeRuralVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestRuralVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
				}

				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMiscLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMiscLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyPremiumScheduleDetails")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMiscNonLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMiscNonLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					/*else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}*/
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeAviationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}

					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestAviationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInteresFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					//********************** Policy Relations Link******************************//
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyPremiumScheduleDetails")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMicroInsuranceVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestMicroInsuranceVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMarineHullVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestMarineHullVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}

				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){

					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredIntrestEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMotorVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMotorVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
				else if(policyEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){
					if(policyEntity.getBooleanValueForField("ConfigAttributeTab")){
						policyAttributeMarineCargoVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					if(policyEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
						policyInsuredInterestMarineCargoVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigRelationTab")){
						policyRelationsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPaymentsTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoverageTab")){
						policyPaymentHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigAccountingCollectionDetailsButton")){
						policyAccountingCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetails")){
						policyCollectionVerifyHelperForPH(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPremiumScheduleButton")){
						policyPremiumScheduleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigShowVersionButton")){
						policyShowVersionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCollectionButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigPolicyCollectionDetailsButton")){
						policyCollectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClaimSynopsisButton")){
						policyClaimSynopsisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigCoInsuranceButton")){
						policyCoInsuranceDetailverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigFollowupTab")){
						policyFolloupverifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					else if(policyEntity.getBooleanValueForField("ConfigClientDetails")){
						policyClientDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
					}
					setDependencyForPolicy(policyEntity, testData);
					setDependencyForRenewedPolicy(policyEntity, testData);
					testData.updateRecordsForCriteria(policyEntity);
				}
			}
		}
	}



	private void setEditPolicyDependancy(PolicyEntity policyEntity,ScenarioTestData testData){
		if(policyEntity.getStringValueForField("DependencyForPolicyQuote")!=null){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), policyEntity.getStringValueForField("DependencyForPolicyQuote"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("QuoteNo", policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}


		if(policyEntity.getStringValueForField("DependencyForPolicyActivePolicyNumber")!=null){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), policyEntity.getStringValueForField("DependencyForPolicyActivePolicyNumber"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("OpenCoverAgreementNumber", policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}



		if(policyEntity.getStringValueForField("DependencyForPolicyAttribute")!=null){
			ArrayList<PolicyAttributeHealthEntity>policyAttributeHealthEntityList=testData.getObjectByReference(testData.getPolicyAttributeHealthRecord(), policyEntity.getStringValueForField("DependencyForPolicyAttribute"));
			for(PolicyAttributeHealthEntity policyAttributeHealthEntityData:policyAttributeHealthEntityList){
				policyAttributeHealthEntityData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(policyAttributeHealthEntityData);
			}
		}

		if(policyEntity.getStringValueForField("DependencyForPolicyAttributeForPH")!=null){
			ArrayList<PolAtrPersnalAcidentEntity>polAtrPersnalAcidentEntityList=testData.getObjectByReference(testData.getPolAtrPersnalAcidentEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyAttributeForPH"));
			for(PolAtrPersnalAcidentEntity polAtrPersnalAcidentEntityData:polAtrPersnalAcidentEntityList){
				polAtrPersnalAcidentEntityData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(polAtrPersnalAcidentEntityData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForClonePolicy")!=null){
			ArrayList<ClonePolicySchemeEntity>clonePolicySchemeEntityList=testData.getObjectByReference(testData.getClonePolicySchemeEntityRecords(), policyEntity.getStringValueForField("DependencyForClonePolicy"));
			for(ClonePolicySchemeEntity clonePolicySchemeEntityData:clonePolicySchemeEntityList){
				clonePolicySchemeEntityData.setStringValueForField("ReferenceQuoteno",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(clonePolicySchemeEntityData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForCollection")!=null){
			ArrayList<PolicyPremCollectionEntity>policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), policyEntity.getStringValueForField("DependencyForCollection"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
				policyPremCollectionEntityData.setStringValueForField("PolicyNoQuotationNo",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}

		if(policyEntity.getStringValueForField("DependencyForPolicyAttributeCreditShield")!=null){
			ArrayList<PolicyAttrCDPolDetailsEntity>policyAttrCDPolDetailsEntityList=testData.getObjectByReference(testData.getPolicyAttributeCDPolicyDetailsEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyAttributeCreditShield"));
			for(PolicyAttrCDPolDetailsEntity policyAttrCDPolDetailsEntityListData:policyAttrCDPolDetailsEntityList){
				policyAttrCDPolDetailsEntityListData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo") );
				policyAttrCDPolDetailsEntityListData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(policyAttrCDPolDetailsEntityListData);
			}
		}

		if(policyEntity.getStringValueForField("DependencyForPolicyClaimFreeYears")!=null){
			ArrayList<PolicyClaimFreeYearsEntity>policyClaimFreeYearsEntityList=testData.getObjectByReference(testData.getPolicyClaimFreeYearsEntity(), policyEntity.getStringValueForField("DependencyForPolicyClaimFreeYears"));
			for(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntityData:policyClaimFreeYearsEntityList){
				policyClaimFreeYearsEntityData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(policyClaimFreeYearsEntityData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForAccountingDistributionTable")!=null){
			ArrayList<AccountingDistributionTable>accountingDistributionTableList=testData.getObjectByReference(testData.getAccountingDistributionTablesRecords(), policyEntity.getStringValueForField("DependencyForAccountingDistributionTable"));
			for(AccountingDistributionTable accountingDistributionTableData:accountingDistributionTableList){
				accountingDistributionTableData.setStringValueForField("GLDescription",policyEntity.getStringValueForField("QuoteNo") );
				testData.updateRecordsForCriteria(accountingDistributionTableData);
			}
		}

		////Abhijit
		if(policyEntity.getStringValueForField("DependencyForPolicyRelation")!=null){
			ArrayList<PolicyRelationDetailEntity> policyRelationDetailEntityList =testData.getObjectByReference(testData.getPolicyRelationDetailEntity(), policyEntity.getStringValueForField("DependencyForPolicyRelation"));
			for (PolicyRelationDetailEntity policyRelationDetailEntityListData : policyRelationDetailEntityList) {
				policyRelationDetailEntityListData.setStringValueForField("QuoteNo", policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(policyRelationDetailEntityListData);
			}
		}

		//Mangesh
		if(policyEntity.getStringValueForField("DependencyForPolicyPremium")!=null){
			ArrayList<MembAtachCovrgPremSchdEntity>membAtachCovrgPremSchdEntityList=testData.getObjectByReference(testData.getmembAtachCovrgPremSchdEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyPremium"));
			for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntityData:membAtachCovrgPremSchdEntityList){
				membAtachCovrgPremSchdEntityData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(membAtachCovrgPremSchdEntityData);
			} 
		}

		//Abhijit

		if(policyEntity.getStringValueForField("DependencyForPolicyAttributeRural")!=null){
			ArrayList<PolicyAttributeRuralEntity>policyAttributeRuralEntityList=testData.getObjectByReference(testData.getPolicyAttributeRuralEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyAttributeRural"));
			for(PolicyAttributeRuralEntity policyAttributeRuralEntityListData:policyAttributeRuralEntityList){
				policyAttributeRuralEntityListData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(policyAttributeRuralEntityListData);
			}
		}
		//KRC
		if(policyEntity.getStringValueForField("DependencyForPolInsIntAttRiskDet1Entity")!=null){
			ArrayList<PolInsIntAttRiskDet1Entity>polInsIntAttRiskDet1EntityList=testData.getObjectByReference(testData.getPolInsIntAttRiskDet1RRLEntityRecords(), policyEntity.getStringValueForField("DependencyForPolInsIntAttRiskDet1Entity"));
			for(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1EntityListData:polInsIntAttRiskDet1EntityList){
				polInsIntAttRiskDet1EntityListData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(polInsIntAttRiskDet1EntityListData);
			}
		}
	}
	public void policyAttributeEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						//-----JA------//
						if(policyAttributeEntityListData.getBooleanValueForField("ConfigPolicyDetailsT1POL")){
							policyDetailsT1POLEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
						}
						//-----------JA------//
						List<PolicyAttributeHealthEntity> policyAttributeHealthEntityList=testData.getPolicyAttributeHealthRecord();
						for(PolicyAttributeHealthEntity policyAttributeHealthEntityListData:policyAttributeHealthEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeHealthEntityListData.getChildKey())){
								if((policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("add")|| policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeHealthEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeHealth policyAttributeHealth=new PolicyAttributeHealth(driver, "Policy Attribute Health Page");
									policyAttributeHealth.fillandSubmitPolicyAttibutesHealth(policyAttributeHealthEntityListData, assertReference);

									if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigEndorse")){
											if(!policyAttributeHealthEntityListData.getStringValueForField("Product").equalsIgnoreCase("BH")){
												policyEndorsementEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);

											}
										}
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigForwordButton") && policyAttributeHealthEntityListData.getStringValueForField("Product").equalsIgnoreCase("UK")){
											List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
											for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
													if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
														policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
													}
												}
											}
										}
										
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigRenew")){
											policyRenewEditHelper(testData, executionTestStep, assertReference, driver);
										}
										//----------------JM-----------//
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigClaimYears")){
											policyAttributeFreeClaimYearsEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
										}
										///------FM-------------//
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigCoPaymentClaimRatio")){
											policyAttributeCoPaymentAndClaimRatioHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
										}
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigEndorseForIC")){
											policyEndorsementEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
										}
										//----------------GT/UH--TI---------//
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigOptionalTPARulePage")){
											policyAttributeOptionalTPARuleEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
										}
										
										//*********Fill and Submit Break In Insurance *****************************//
										List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
										for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
												if((policyBreakInInsuranceData.getAction().equalsIgnoreCase("add")|| policyBreakInInsuranceData.getAction().equalsIgnoreCase("edit")) && policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
													policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
													if(policyBreakInInsuranceData.getBooleanValueForField("ConfigForwordButton")|| policyBreakInInsuranceData.getBooleanValueForField("ConfigVerifyForwordButtonForIC")){
														if(policyBreakInInsuranceData.getBooleanValueForField("ConfigProvisionalPolicyDetails")){
															policyAttributeProvisionalPolicyDetails(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
														}
														if(policyBreakInInsuranceData.getStringValueForField("Product").equalsIgnoreCase("GH")){
															policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
														}
														
														
														/*//For GH
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityListfor=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityListfor){
															if(policyTypeOfDevOfficerEntityData.getStringValueForField("Product").equalsIgnoreCase("GH")){
																policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
															}
														}*/

														//	******************Policy Previous Details Page after Break in insurance***************//
														if(policyBreakInInsuranceData.getBooleanValueForField("ConfigEndorse")|| policyBreakInInsuranceData.getBooleanValueForField("ConfigEndorseForTU")){
															policyEndorsementEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
														}
														if(policyBreakInInsuranceData.getStringValueForField("Product").equalsIgnoreCase("IC")){
															RKGstPageEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
														}
													}
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigInstallmentFacilityPage")){
																		if(policyTypeOfDevOfficerEntityData.getStringValueForField("Product").equalsIgnoreCase("PZ")) {
																			policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																	}
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForCS")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}

																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigPortability")){
																		policyAttributePortabilityHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																	}
																	// ----------------GH--MU-------//
																	if(!(policyTypeOfDevOfficerEntityData.getStringValueForField("Product").equalsIgnoreCase("PZ")||policyTypeOfDevOfficerEntityData.getStringValueForField("Product").equalsIgnoreCase("SP"))){
																		if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigInstallmentFacilityPage")){
																			policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																	}
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS") || policyBreakInInsuranceData.getBooleanValueForField("ConfigForwordButton") || policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigSaveButton")|| policyBreakInInsuranceData.getBooleanValueForField("ConfigVerifyForwordButtonForIC")) {

																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParamPage=new PolicyAttrributeGstUpadateParam(driver, "Type of Development Officer");
																					policyAttrributeGstUpadateParamPage.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);

																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}

						}
					}
				}
			}
		}
	
	public void policyAttributeCreditShieldEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolicyAttrCDPolDetailsEntity>  policyAttrCDPolDetailsEntityList=testData.getPolicyAttributeCDPolicyDetailsEntityRecords();
						for(PolicyAttrCDPolDetailsEntity policyAttrCDPolDetailsEntityListData :policyAttrCDPolDetailsEntityList ){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrCDPolDetailsEntityListData.getChildKey())){
								if((policyAttrCDPolDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyAttrCDPolDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrCDPolDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeCDPolicyDetailsCreaditShield policyAttributeCDPolicyDetailsCreaditShield=new PolicyAttributeCDPolicyDetailsCreaditShield(driver,"CD Policy Details", 0);
									policyAttributeCDPolicyDetailsCreaditShield.fillandSubmitPolicyAttibutesHealth(policyAttrCDPolDetailsEntityListData, assertReference,testData);

									if(	policyAttrCDPolDetailsEntityListData.getBooleanValueForField("ConfigForwordButton")){
										List<PolicyAttrQuotDetailEntity>  policyAttrQuotDetailEntityList=testData.getPolicyAttrQuotDetailEntityRecords();
										for(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntityListData :policyAttrQuotDetailEntityList ){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrQuotDetailEntityListData.getChildKey())){
												if((policyAttrQuotDetailEntityListData.getAction().equalsIgnoreCase("add")||policyAttrQuotDetailEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrQuotDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeQuotationDetailsCreditShield policyAttributeQuotationDetailsCreditShield=new PolicyAttributeQuotationDetailsCreditShield(driver, "Quotation Details");
													policyAttributeQuotationDetailsCreditShield.fillandSubmitPolicyAttrQuotDetail(policyAttrQuotDetailEntityListData, assertReference);
													if(policyAttrQuotDetailEntityListData.getBooleanValueForField("ConfigNextButton")){
														List<PolicyAttPolDetailsCSEntity>  policyAttPolDetailsCSEntityList=testData.getPolicyAttPolDetailsCSEntityRecords();
														for(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntityListData :policyAttPolDetailsCSEntityList ){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyAttPolDetailsCSEntityListData.getChildKey())){
																if((policyAttPolDetailsCSEntityListData.getAction().equalsIgnoreCase("add")||policyAttPolDetailsCSEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttPolDetailsCSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributePolicyDetailsCreaditShield policyAttributePolicyDetailsCreaditShield=new PolicyAttributePolicyDetailsCreaditShield(driver, "Policy Details");	
																	policyAttributePolicyDetailsCreaditShield.fillandSubmitPolicyAttPolicyDetailsCD(policyAttPolDetailsCSEntityListData, assertReference);
																	if(policyAttPolDetailsCSEntityListData.getBooleanValueForField("ConfigNextButton")){
																		List<PrePolDetailCreditShldEntity>  prePolDetailCreditShldEntityList=testData.getPrePolDetailCreditShldEntityRecords();
																		for(PrePolDetailCreditShldEntity prePolDetailCreditShldEntityListData :prePolDetailCreditShldEntityList ){
																			if(policyEntity.getParentKey().equalsIgnoreCase(prePolDetailCreditShldEntityListData.getChildKey())){
																				if((prePolDetailCreditShldEntityListData.getAction().equalsIgnoreCase("add")||prePolDetailCreditShldEntityListData.getAction().equalsIgnoreCase("edit")) && prePolDetailCreditShldEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributePreviousPolicyDetailCreaditShield policyAttributePreviousPolicyDetailCreaditShield =new PolicyAttributePreviousPolicyDetailCreaditShield(driver, " ");
																					policyAttributePreviousPolicyDetailCreaditShield.fillandSubmitPolicyAttributePreviousPolicyDetailCreaditShield(prePolDetailCreditShldEntityListData, assertReference);
																					if(prePolDetailCreditShldEntityListData.getBooleanValueForField("ConfigForwordButton")){
																						List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																						for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																								if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																									policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																									if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																										List<PolAttrReinTypeRuleCSEntity> polAttrReinTypeRuleCSEntityList=testData.getPolAttrReinTypeRuleCSEntityRecords();
																										for(PolAttrReinTypeRuleCSEntity polAttrReinTypeRuleCSEntityListData: polAttrReinTypeRuleCSEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(polAttrReinTypeRuleCSEntityListData.getChildKey())){
																												if((polAttrReinTypeRuleCSEntityListData.getAction().equalsIgnoreCase("add")|| polAttrReinTypeRuleCSEntityListData.getAction().equalsIgnoreCase("edit")) && polAttrReinTypeRuleCSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													PolicyAttributeReinsuranceTypeRuleCreaditShield policyAttributeReinsuranceTypeRuleCreaditShield=new PolicyAttributeReinsuranceTypeRuleCreaditShield(driver, "Reinsurance Type Rule");
																													policyAttributeReinsuranceTypeRuleCreaditShield.fillandSubmitPolicyAttributeReinsuranceTypeRuleCreaditShield(polAttrReinTypeRuleCSEntityListData, assertReference);
																													if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																														List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																														for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																															if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																																if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																	PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																																	policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																																}		
																															}
																														}
																													}	
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyMemberEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//********* Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										//********************************BH**********************************************//
										if(memberAttributesEntityData.getBooleanValueForField("ConfigPreviousPolicyDataPage")){
											policyMemberAttributePreviousPolicyDataBHEditHelper(testData, executionTestStep, assertReference, driver);
										}
										if(memberAttributesEntityData.getBooleanValueForField("ConfigPHT1PLRMember")){
											pHT1PLRMemberEditHelper(testData, executionTestStep, assertReference, driver);
										}

										//------------------------TG--------------------------//
										/*****attribute in Member Details  attribute Page after Click on proceed**********/
										int rowcount=0;
										List<PolicyMemberAttributeEntity> policyMemberAttributeEntityList=testData.getPolMemberAttributeRecords();
										for(PolicyMemberAttributeEntity policyMemberAttributeEntityData:policyMemberAttributeEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberAttributeEntityData.getChildKey())){
												if((policyMemberAttributeEntityData.getAction().equalsIgnoreCase("add")|| policyMemberAttributeEntityData.getAction().equalsIgnoreCase("edit")) && policyMemberAttributeEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyMemberAttributeHealth policyMemberAttributeHealth= new PolicyMemberAttributeHealth(driver, "Policy Member Atrribute health ",rowcount);
													policyMemberAttributeHealth.fillandSubmitPolicyMemberAttribute(policyMemberAttributeEntityData, assertReference);
													rowcount++;

													//********************************BH*******************************//
													/*if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigInsuredMemberDetailBHPage")){
													policyMemberAttributeInsuredMemberDetailBHEditHelper(testData, executionTestStep, assertReference, driver, rowcount);
												}*/
													//---------------sc------------//
													if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigMedicalCheckUpDetailsPage")){
														policyMemberAttributeMedicalCheckUpDetailsEditHelper(testData, executionTestStep, assertReference, driver, rowcount,stepGroup,policyEntity);
													}
													//-------------TI---JM----------------//
													if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigCoPaymentDetailsPage")){
														policyMemberAttributeCoPaymentDetailsEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
													}
													if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigPreExistingDiseaseAtRenewPage")){
														policyMemberAttributePreExistingDiseaseAtRenewEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
													}
													//*****************************FM***JM*****************************//
													if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigPolicyStartDateForMemberPage")){
														policyMemberStartDateForMemberHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
													}
													//-------------JA-------------------//
													if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigGroupDetails")){
														policyMemberAttributeGroupDetailsEditHelper(testData, executionTestStep, assertReference, driver);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}
	public void policyInsuredIntrestCreditShieldEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Credit Shield Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);
					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}
					//TODO Done
					///*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										List<PolInsureAttBuyrDetailEntity> polInsureAttBuyrDetailEntityList=testData.getPolInsureAttBuyrDetailEntityRecords();
										for(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntityListData: polInsureAttBuyrDetailEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsureAttBuyrDetailEntityListData.getChildKey())){
												if((polInsureAttBuyrDetailEntityListData.getAction().equalsIgnoreCase("add")|| polInsureAttBuyrDetailEntityListData.getAction().equalsIgnoreCase("edit")) && polInsureAttBuyrDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInterestAttributeBuyerDetailsCreditShield policyInsuredInterestAttributeBuyerDetailsCreditShield=new PolicyInsuredInterestAttributeBuyerDetailsCreditShield(driver, "Buyer Details");
													policyInsuredInterestAttributeBuyerDetailsCreditShield.fillandSubmitPolicyAttrQuotDetail(polInsureAttBuyrDetailEntityListData, assertReference);

												}
											}
										}
									}
								}
							}
						}
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Insured Interest Coverage");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Insured interset coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy Insured Interest Coverage");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Insured interset coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver," ");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Insured Interset premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Premium Schedule");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
												}

											}	
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyMemberVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);
					///*************Policy Member Details  Verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);


						///*********** Attribute in member Details ******************** 

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
							List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
							for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
									if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify")){
										PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
										policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
										if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
											/*****attribute in Member Details  attribute Page after Click on proceed**********/
											
											//********************************BH**********************************************//
											if(memberAttributesEntityData.getBooleanValueForField("ConfigPreviousPolicyDataPage")){
												policyMemberAttributePreviousPolicyDataBHVerifyHelper(testData, executionTestStep, assertReference, driver);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigPHT1PLRMember")){
												pHT1PLRMemberVerifyHelper(testData, executionTestStep, assertReference, driver);
											}
											
											//---------------TG--------------------//
											if(memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsForSTDRiskPage")){
												policyInsAtttrRiskDetailsForSTDRiskVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingDiscountOptionPage")){
												policyInsAtttrLodingDiscountOptionVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingAmbulancePage")){
												policyInsAtttrLoadingAmbulanceVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigTailorPremiumDetailsPage")){
												policyInsAtttrTailorPremiumDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);

											}

											int rowcount=0;
											List<PolicyMemberAttributeEntity> policyMemberAttributeEntityList=testData.getPolMemberAttributeRecords();
											for(PolicyMemberAttributeEntity policyMemberAttributeEntityData:policyMemberAttributeEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberAttributeEntityData.getChildKey())){
													if(policyMemberAttributeEntityData.getAction().equalsIgnoreCase("verify")&& policyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyMemberAttributeHealth policyMemberAttributeHealth= new PolicyMemberAttributeHealth(driver, "Policy Member Atrribute health ",rowcount);
														policyMemberAttributeHealth.fillandSubmitPolicyMemberAttribute(policyMemberAttributeEntityData, assertReference);
														rowcount++;

														//****************************BH*******************************//
														/*if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigInsuredMemberDetailBHPage")){
													policyMemberAttributeInsuredMemberDetailBHVerifyHelper(testData, executionTestStep, assertReference, driver, rowcount);
												}*/
														//*****************************PZ********************************//
														if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigIMJourneyDetailsPZPage")){
															policyMemberAttributeIMJourneyDetailsPZVerifyHelper(testData, executionTestStep, assertReference, driver);
														}
														//--------------------------JA---------------------------//
														if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigGroupDetails")){
															policyMemberAttributeGroupDetailsVerifyHelper(testData, executionTestStep, assertReference, driver);
														}

														if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigCoPaymentDetailsPage")){
															policyMemberAttributeCoPaymentDetailsVerifyHelper(testData, executionTestStep, assertReference, driver);
														}
														//--------------------------TI---------------------------//
														if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigPreExistingDiseaseAtRenewPage")){
															policyMemberAttributePreExistingDiseaseAtRenewVerifyHelper(testData, executionTestStep, assertReference, driver);
														}
														//****************************FM*******************************//
														if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigPolicyStartDateForMemberPage")){
															policyMemberStartDateForMemberVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity);
														}

													}
												}
											}
										}
									}
								}
							}
						}

						/************************AttributeEnd**********/
						//********************************* Member Attach Coverage Page  ************************//

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
							List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
							for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")){
										PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
										policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
										/********************Insured interset coverage  page End***********/ 
										/********************Policy Memeber coverage Details Page starts****************/
										if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")){
											List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
											for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
													if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")){
														PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
														policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
														/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
														/****************attach Coverage Attribute Start***********/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
															List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
															for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																	if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify")){
																		PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																		policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	}
																}
															}
														}
														/****************attach Coverage Attribute End***********/
														/************************Policy Member premium page start***********************/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
														/**********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//***************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	/************************Policy Coverage Helper*********************/
	public void policyCoverageHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Coverage Helper </i></B>");
		List<PolicyCoverageListEntity>policyCoverageListEntityList=testData.getPolicyCoverageListEntities();
		for(PolicyCoverageListEntity policyCoverageListEntityData:policyCoverageListEntityList){
			if((policyCoverageListEntityData.getAction().equalsIgnoreCase("add") || policyCoverageListEntityData.getAction().equalsIgnoreCase("edit")) && policyCoverageListEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyCoverageCoverageList policyCoverageCoverageListPage=new PolicyCoverageCoverageList(driver, "Policy Coverage List Page");
				policyCoverageCoverageListPage.	selectCoverageCode(policyCoverageListEntityData);
				//policyCoverageCoverageListPage.fillAndSubmitPolicyCoverageListDetails(policyCoverageListEntityData, assertReference);
				List<PolicyCoverageDetailsEntity> policyCoverageDetailsEntityList=testData.getPolicyCoverageDetailsEntity();
				for(PolicyCoverageDetailsEntity policyCoverageDetailsEntityData:policyCoverageDetailsEntityList){
					PolicyCoverageDetailsPage poliCoverageDetailsPage=new PolicyCoverageDetailsPage(driver, "Policy Coverage Details Page");
					poliCoverageDetailsPage.fillAndSubmitPolicyCoverageDetails(policyCoverageDetailsEntityData, assertReference);

				}
			}
		}

	}
	/*************************Policy Relation Helper*************************/
	public void policyRelationsEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Relation Helper </i></B>");
		List<PolicyRelationDetailEntity>policyRelationDetailEntityList=testData.getPolicyRelationDetailEntity();
		for(PolicyRelationDetailEntity policyRelationDetailEntityListData:policyRelationDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyRelationDetailEntityListData.getChildKey())){
				if((policyRelationDetailEntityListData.getAction().equalsIgnoreCase("add")|| policyRelationDetailEntityListData.getAction().equalsIgnoreCase("edit"))&& policyRelationDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyRelationsSearchPage policyRelationsSearchPage=new PolicyRelationsSearchPage(driver, "Policy Relations Search page");
					policyRelationsSearchPage.fillAndSubmitPartyRelationsSearchDetails(policyRelationDetailEntityListData);
					PolicyRelationDetail policyRelationDetail= new PolicyRelationDetail(driver, "Policy Relations");
					policyRelationDetail.fillAndSubmitPartyRelationsDetails(policyRelationDetailEntityListData, assertReference);
				}
			}
		}

		if(policyEntity.getStringValueForField("Product").equalsIgnoreCase("TF")||policyEntity.getStringValueForField("Product").equalsIgnoreCase("TG")){
			policyClientDetailsHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
		}}
	public void policyAttributeVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Verify Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						if(policyAttributeEntityListData.getBooleanValueForField("ConfigPolicyDetailsT1POL")){
							policyDetailsT1POLVerifyHelper(testData, executionTestStep, assertReference, driver);
						}
						List<PolicyAttributeHealthEntity> policyAttributeHealthEntityList=testData.getPolicyAttributeHealthRecord();
						for(PolicyAttributeHealthEntity policyAttributeHealthEntityListData:policyAttributeHealthEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeHealthEntityListData.getChildKey())){
								if(policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeHealthEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeHealth policyAttributeHealth=new PolicyAttributeHealth(driver, "Policy Attribute Health Page");
									policyAttributeHealth.fillandSubmitPolicyAttibutesHealth(policyAttributeHealthEntityListData, assertReference);
									if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigEndorse")){
											if(!policyAttributeHealthEntityListData.getStringValueForField("Product").equalsIgnoreCase("BH"))
												policyEndorsementVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup);
										}

										else if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigRenew")){
											policyRenewVerifyHelper(testData, executionTestStep, assertReference, driver);
										}
										/*if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigClaimYears")){
											policyAttributeFreeClaimYearsEditHelper(testData, executionTestStep, assertReference, driver);
										}*/
										//----------------GT-----------//
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigOptionalTPARulePage")){
											policyAttributeOptionalTPARuleVerifyHelper(testData, executionTestStep, assertReference, driver);
										}
										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigClaimYears")){
											policyAttributeFreeClaimYearsVerifyHelper(testData, executionTestStep, assertReference, driver);
										}

										if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigCoPaymentClaimRatio")){
											policyAttributeCoPaymentAndClaimRatioVerifyHelper(testData, executionTestStep, assertReference, driver);
										}

										//----------------JM----------//
										//*********Fill and Submit Break In Insurance *****************************//
										List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
										for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
												if(policyBreakInInsuranceData.getAction().equalsIgnoreCase("verify")&& policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
													policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
													if(policyBreakInInsuranceData.getBooleanValueForField("ConfigForwordButton")){
														if(policyBreakInInsuranceData.getBooleanValueForField("ConfigProvisionalPolicyDetails")){
															policyAttributeProvisionalVerifyPolicyDetails(testData, executionTestStep, assertReference, driver, stepGroup);
														}

														if(policyBreakInInsuranceData.getBooleanValueForField("ConfigEndorse")){
															policyEndorsementVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
														}

														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if(policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")&& policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigPortability")){
																		policyAttributePortabilityVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																	}
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")|| policyBreakInInsuranceData.getBooleanValueForField("ConfigForwordButton")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}																						
																}
															}
														}

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	public void policyAttributeCreditShieldVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Verify Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
				policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
				/************Click on proceed when add************/
				//*************Policy Attribute After Proceed*************************//
				if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
					List<PolicyAttrCDPolDetailsEntity>  policyAttrCDPolDetailsEntityList=testData.getPolicyAttributeCDPolicyDetailsEntityRecords();
					for(PolicyAttrCDPolDetailsEntity policyAttrCDPolDetailsEntityListData :policyAttrCDPolDetailsEntityList ){
						if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrCDPolDetailsEntityListData.getChildKey())){
							if((policyAttrCDPolDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrCDPolDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyAttributeCDPolicyDetailsCreaditShield policyAttributeCDPolicyDetailsCreaditShield=new PolicyAttributeCDPolicyDetailsCreaditShield(driver,"CD Policy Details", 0);
								policyAttributeCDPolicyDetailsCreaditShield.fillandSubmitPolicyAttibutesHealth(policyAttrCDPolDetailsEntityListData, assertReference,testData);
								if(	policyAttrCDPolDetailsEntityListData.getBooleanValueForField("ConfigForwordButton")){
									List<PolicyAttrQuotDetailEntity>  policyAttrQuotDetailEntityList=testData.getPolicyAttrQuotDetailEntityRecords();
									for(PolicyAttrQuotDetailEntity policyAttrQuotDetailEntityListData :policyAttrQuotDetailEntityList ){
										if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrQuotDetailEntityListData.getChildKey())){
											if((policyAttrQuotDetailEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrQuotDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												PolicyAttributeQuotationDetailsCreditShield policyAttributeQuotationDetailsCreditShield=new PolicyAttributeQuotationDetailsCreditShield(driver, "Quotation Details");
												policyAttributeQuotationDetailsCreditShield.fillandSubmitPolicyAttrQuotDetail(policyAttrQuotDetailEntityListData, assertReference);
												if(policyAttrQuotDetailEntityListData.getBooleanValueForField("ConfigNextButton")){
													List<PolicyAttPolDetailsCSEntity>  policyAttPolDetailsCSEntityList=testData.getPolicyAttPolDetailsCSEntityRecords();
													for(PolicyAttPolDetailsCSEntity policyAttPolDetailsCSEntityListData :policyAttPolDetailsCSEntityList ){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyAttPolDetailsCSEntityListData.getChildKey())){
															if((policyAttPolDetailsCSEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttPolDetailsCSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyAttributePolicyDetailsCreaditShield policyAttributePolicyDetailsCreaditShield=new PolicyAttributePolicyDetailsCreaditShield(driver, "Policy Details");	
																policyAttributePolicyDetailsCreaditShield.fillandSubmitPolicyAttPolicyDetailsCD(policyAttPolDetailsCSEntityListData, assertReference);
																if(policyAttrQuotDetailEntityListData.getBooleanValueForField("ConfigNextButton")){
																	List<PrePolDetailCreditShldEntity>  prePolDetailCreditShldEntityList=testData.getPrePolDetailCreditShldEntityRecords();
																	for(PrePolDetailCreditShldEntity prePolDetailCreditShldEntityListData :prePolDetailCreditShldEntityList ){
																		if(policyEntity.getParentKey().equalsIgnoreCase(prePolDetailCreditShldEntityListData.getChildKey())){
																			if((prePolDetailCreditShldEntityListData.getAction().equalsIgnoreCase("verify")) && prePolDetailCreditShldEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolicyAttributePreviousPolicyDetailCreaditShield policyAttributePreviousPolicyDetailCreaditShield =new PolicyAttributePreviousPolicyDetailCreaditShield(driver, " ");
																				policyAttributePreviousPolicyDetailCreaditShield.fillandSubmitPolicyAttributePreviousPolicyDetailCreaditShield(prePolDetailCreditShldEntityListData, assertReference);
																				if(prePolDetailCreditShldEntityListData.getBooleanValueForField("ConfigForwordButton")){
																					List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																					for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																						if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																							if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																								policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																								if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																									List<PolAttrReinTypeRuleCSEntity> polAttrReinTypeRuleCSEntityList=testData.getPolAttrReinTypeRuleCSEntityRecords();
																									for(PolAttrReinTypeRuleCSEntity polAttrReinTypeRuleCSEntityListData: polAttrReinTypeRuleCSEntityList){
																										if(policyEntity.getParentKey().equalsIgnoreCase(polAttrReinTypeRuleCSEntityListData.getChildKey())){
																											if((polAttrReinTypeRuleCSEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrReinTypeRuleCSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												PolicyAttributeReinsuranceTypeRuleCreaditShield policyAttributeReinsuranceTypeRuleCreaditShield=new PolicyAttributeReinsuranceTypeRuleCreaditShield(driver, "Reinsurance Type Rule");
																												policyAttributeReinsuranceTypeRuleCreaditShield.fillandSubmitPolicyAttributeReinsuranceTypeRuleCreaditShield(polAttrReinTypeRuleCSEntityListData, assertReference);
																												if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																													List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																													for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																														if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																															if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																																policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredIntrestCreditShieldVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Credit Shield Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}
					//TODO Done
					///*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										List<PolInsureAttBuyrDetailEntity> polInsureAttBuyrDetailEntityList=testData.getPolInsureAttBuyrDetailEntityRecords();
										for(PolInsureAttBuyrDetailEntity polInsureAttBuyrDetailEntityListData: polInsureAttBuyrDetailEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsureAttBuyrDetailEntityListData.getChildKey())){
												if((polInsureAttBuyrDetailEntityListData.getAction().equalsIgnoreCase("verify")) && polInsureAttBuyrDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInterestAttributeBuyerDetailsCreditShield policyInsuredInterestAttributeBuyerDetailsCreditShield=new PolicyInsuredInterestAttributeBuyerDetailsCreditShield(driver, "Buyer Details");
													policyInsuredInterestAttributeBuyerDetailsCreditShield.fillandSubmitPolicyAttrQuotDetail(polInsureAttBuyrDetailEntityListData, assertReference);

												}
												//---------------TG--------------------//
												if(memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsForSTDRiskPage")){
													policyInsAtttrRiskDetailsForSTDRiskVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
												}
												if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingDiscountOptionPage")){
													policyInsAtttrLodingDiscountOptionVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
												}
												if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingAmbulancePage")){
													policyInsAtttrLoadingAmbulanceVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
												}
												if(memberAttributesEntityData.getBooleanValueForField("ConfigTailorPremiumDetailsPage")){
													policyInsAtttrTailorPremiumDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
												}
											}


										}
									}
								}
							}
						}
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Insured Interest Coverage");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Insured interset coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")&& policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy Insured Interest Coverage");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Insured interset coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver," ");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Insured Interset premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Premium Schedule");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}
												}
											}	
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyRelationsVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Relation Verify Helper </i></B>");
		List<PolicyRelationDetailEntity>policyRelationDetailEntityList=testData.getPolicyRelationDetailEntity();
		for(PolicyRelationDetailEntity policyRelationDetailEntityListData:policyRelationDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyRelationDetailEntityListData.getChildKey())){
				if(policyRelationDetailEntityListData.getAction().equalsIgnoreCase("verify") && policyRelationDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyRelationsSearchPage policyRelationsSearchPage=new PolicyRelationsSearchPage(driver, "Policy Relations Search page");
					policyRelationsSearchPage.fillAndSubmitPartyRelationsSearchDetails(policyRelationDetailEntityListData);
					PolicyRelationDetail policyRelationDetail= new PolicyRelationDetail(driver, "Policy Relations");
					policyRelationDetail.fillAndSubmitPartyRelationsDetails(policyRelationDetailEntityListData, assertReference);
				}
			}
		}
	}
	public void createCloneHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		FrameworkServices.logMessage("<B><i> Executing:: Clone of Policy </i></B>");
		List<ClonePolicySchemeEntity>clonePolicySchemeEntityList=testData.getClonePolicySchemeEntityRecords();
		for(ClonePolicySchemeEntity clonePolicySchemeEntityData:clonePolicySchemeEntityList){
			if((clonePolicySchemeEntityData.getAction().equalsIgnoreCase("add")|| clonePolicySchemeEntityData.getAction().equalsIgnoreCase("edit")) && clonePolicySchemeEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search page");
				policySearchPage.navigateToPolicySearchPage();
				ClonePolicyScheme clonePolicySchemePage=new ClonePolicyScheme(driver, "Clone Policy Scheme");	
				clonePolicySchemePage.navigateToClonePolicyPage();
				clonePolicySchemePage.fillandSearchClonePolicySchemeDetails(clonePolicySchemeEntityData);
				testData.updateRecordsForCriteria(clonePolicySchemeEntityData);
				setDependencyForClonnedPolicy(clonePolicySchemeEntityData, testData);
			}
		}
	}
	public void policyCollectionHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Collection  of Policy </i></B>");
		int rowcount=0;
		List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
		for(PolicyPremCollectionEntity policyPremCollectionEntitydata:policyPremCollectionEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyPremCollectionEntitydata.getChildKey())){

				if((policyPremCollectionEntitydata.getAction().equalsIgnoreCase("add") || policyPremCollectionEntitydata.getAction().equalsIgnoreCase("edit"))&& policyPremCollectionEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
					policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntitydata, assertReference,rowcount);
					testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
					rowcount=++rowcount;
				}	
				testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
				setDependencyCollectionNumber(policyPremCollectionEntitydata, testData);

			}
		}
	}

	public void policyAccountingCollectionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Collection  of Policy </i></B>");
		int rowcount=0;
		List<PolicyAccoColleSearchEntity> policyAccoColleSearchEntityList=testData.getPolicyAccoColleSearchEntity();
		for(PolicyAccoColleSearchEntity policyAccoColleSearchEntityData:policyAccoColleSearchEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAccoColleSearchEntityData.getChildKey())){
				if((policyAccoColleSearchEntityData.getAction().equalsIgnoreCase("verify") && policyAccoColleSearchEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyAccountingCollectionSearch policyAccountingCollectionSearchPage=new PolicyAccountingCollectionSearch(driver, "Policy Premium Collection page" );
					policyAccountingCollectionSearchPage.navigateTonAccountingTab(policyAccoColleSearchEntityData);
					policyAccountingCollectionSearchPage.navigateTonCollectionTab(policyAccoColleSearchEntityData);
					policyAccountingCollectionSearchPage.fillAndSearchePolicyAccountingCollectionSearch(policyAccoColleSearchEntityData, assertReference);
					testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
					List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
					for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
						if(policyAccoColleSearchEntityData.getParentKey().equalsIgnoreCase(policyPremCollectionEntityData.getChildKey())){
							if(policyPremCollectionEntityData.getAction().equalsIgnoreCase("verify") && policyPremCollectionEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
								policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntityData, assertReference,rowcount);
								testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
								rowcount=++rowcount;
							}
						}
					}
				}
			}
		}
	}

	public void policyEndorsementEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Endorsement of Policy </i></B>");
		List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
		for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(previousPolicyHistoryEntitydata.getChildKey())){
				if((previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("edit")||previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("add"))&& previousPolicyHistoryEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PreviousPolicyHistoryPage previousPolicyHistoryPage=new PreviousPolicyHistoryPage(driver, "Policy Previous History page");
					previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
					testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);
				}
			}
		}
	}

	//---------------JA-----------------//
	public void policyDetailsT1POLEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Details T1-POL Page </i></B>");
		List<PolicyAttrDetailsT1POLEntity> policyAttrDetailsT1POLEntityList=testData.getPolicyAttrDetailsT1POLEntity();
		for(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntitydata:policyAttrDetailsT1POLEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrDetailsT1POLEntitydata.getChildKey())){		
				if((policyAttrDetailsT1POLEntitydata.getAction().equalsIgnoreCase("add")||policyAttrDetailsT1POLEntitydata.getAction().equalsIgnoreCase("edit")) && policyAttrDetailsT1POLEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeDetailsT1POL policyAttributeDetailsT1POLPage=new PolicyAttributeDetailsT1POL(driver, "Policy Details T1-POL Page");
					policyAttributeDetailsT1POLPage.fillandSubmitPolicyAttributeDetailsT1POLPage(policyAttrDetailsT1POLEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyAttrDetailsT1POLEntitydata);
				}
			}
		}
	}
	//---------------RK-----------------//
	public void RKGstPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	//RK
	public void RKGstPageEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	//GS
	public void GSGstPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	//---------------GS------------------//
	public void GSGstPageEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	//---------------SY------------------//
	public void SYGstPageEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	//SY
	public void SYGstPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
	public void SEGstPageEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
		for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
				if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("add")|| speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("edit")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
					specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
					if(speCondForMiscNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
						List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
						for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
								if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
									policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
								}
							}
						}

					}
				}
			}
		}
	}
	//SE
	public void SEGstPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: GST UPDATE PARAM Page </i></B>");
		List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
		for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
				if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("add")|| speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("edit")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
					specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
					if(speCondForMiscNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
						List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
						for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
								if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
									policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
								}
							}
						}

					}
				}
			}
		}
	}


	//---------------JA-----------------//
	public void policyRenewEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Renewal of Policy </i></B>");
		List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
		for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
			if(previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("edit")||previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("add")){
				/*PreviousPolicyHistoryForRenew previousPolicyHistoryPage=new PreviousPolicyHistoryForRenew(driver, "Policy Previous History page");
				previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
				testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);*/

			}
		}
	}
	//---------------JM----------------//
	public void policyAttributeFreeClaimYearsEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity, String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Free Claim Years </i></B>");
		List<PolicyClaimFreeYearsEntity> policyFourClaimFreeYearsEntityList=testData.getPolicyClaimFreeYearsEntity();
		for(PolicyClaimFreeYearsEntity policyFourClaimFreeYearsEntitydata:policyFourClaimFreeYearsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyFourClaimFreeYearsEntitydata.getChildKey())){

				if((policyFourClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("edit")||policyFourClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("add"))&& policyFourClaimFreeYearsEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeClaimFreeYears policyAttributeClaimFreeYearspage=new PolicyAttributeClaimFreeYears(driver, "Policy Attribute Claim Free Years page");
					policyAttributeClaimFreeYearspage.fillandSubmitPolicyAttibutesPolicyFourClaimFreeYears(policyFourClaimFreeYearsEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyFourClaimFreeYearsEntitydata);
					if(policyFourClaimFreeYearsEntitydata.getBooleanValueForField("ConfigEndorse")){
						policyEndorsementEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, policyEntity);
					}
				}
			}
		}
	}
	public void policyAttributeFreeClaimYearsVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Free Claim Years </i></B>");
		List<PolicyClaimFreeYearsEntity> policyFourClaimFreeYearsEntityList=testData.getPolicyClaimFreeYearsEntity();
		for(PolicyClaimFreeYearsEntity policyFourClaimFreeYearsEntitydata:policyFourClaimFreeYearsEntityList){
			if(policyFourClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyAttributeClaimFreeYears policyAttributeClaimFreeYearspage=new PolicyAttributeClaimFreeYears(driver, "Policy Attribute Claim Free Years page");
				policyAttributeClaimFreeYearspage.fillandSubmitPolicyAttibutesPolicyFourClaimFreeYears(policyFourClaimFreeYearsEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyFourClaimFreeYearsEntitydata);
			}
		}
	}
	//---------------JA----------------//
	public void policyDetailsT1POLVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Details T1-POL Page </i></B>");
		List<PolicyAttrDetailsT1POLEntity> policyAttrDetailsT1POLEntityList=testData.getPolicyAttrDetailsT1POLEntity();
		for(PolicyAttrDetailsT1POLEntity policyAttrDetailsT1POLEntitydata:policyAttrDetailsT1POLEntityList){
			if(policyAttrDetailsT1POLEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyAttributeDetailsT1POL policyAttributeDetailsT1POLPage=new PolicyAttributeDetailsT1POL(driver, "Policy Details T1-POL Page");
				policyAttributeDetailsT1POLPage.fillandSubmitPolicyAttributeDetailsT1POLPage(policyAttrDetailsT1POLEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyAttrDetailsT1POLEntitydata);
			}
		}
	}
	public void policyPaymentHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Payment of Policy </i></B>");
		int rowcount=1;
		List<PolicyPaymDetailsCycleEntity> policyPaymDetailsCycleEntityList=testData.getPolicyPaymDetailsCycleEntities();
		for(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntityData:policyPaymDetailsCycleEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyPaymDetailsCycleEntityData.getChildKey())){
				if(policyPaymDetailsCycleEntityData.getAction().equalsIgnoreCase("verify") && policyPaymDetailsCycleEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){{
					rowcount++;
					PolicyPaymentDetailsCycle policyPaymentDetailsCyclePage=new PolicyPaymentDetailsCycle(driver, "Policy Payment Details Page",rowcount);
					policyPaymentDetailsCyclePage.fillAndSubmitPolicyPaymentDetails(policyPaymDetailsCycleEntityData, assertReference);
					testData.updateRecordsForCriteria(policyPaymDetailsCycleEntityData);
				}
				}
			}
		}
	}
	//---------------GT/UH-----------------//
	public void policyAttributeOptionalTPARuleEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Optional TPA Rule </i></B>");
		List<OptionalTPARuleEntity> optionalTPARuleEntityList=testData.getOptionalTPARuleEntity();
		for(OptionalTPARuleEntity optionalTPARuleEntitydata:optionalTPARuleEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(optionalTPARuleEntitydata.getChildKey())){
				if((optionalTPARuleEntitydata.getAction().equalsIgnoreCase("edit")||optionalTPARuleEntitydata.getAction().equalsIgnoreCase("add"))&& optionalTPARuleEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					OptionalTPARule optionalTPARulepage=new OptionalTPARule(driver, "Optional TPA Rule page");
					optionalTPARulepage.fillAndSubmitOptionalTPAAttribute(optionalTPARuleEntitydata, assertReference);
					testData.updateRecordsForCriteria(optionalTPARuleEntitydata);
				}
			}
		}
	}
	//----------------SC-----------------------------//
	/*	public void policyAttributeClaimFreeYearsEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Free Years </i></B>");
		List<PolicyClaimFreeYearsEntity> policyClaimFreeYearsEntityList=testData.getClaimFreeYearsEntities();
		for(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntitydata:policyClaimFreeYearsEntityList){
			if(policyClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("edit")||policyClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("add")){
				PolicyAttributeClaimFreeYears PolicyAttributeClaimFreeYears=new PolicyAttributeClaimFreeYears(driver, "Optional TPA Rule page");
				PolicyAttributeClaimFreeYears.fillandSubmitPolicyAttibutesPolicyFourClaimFreeYears(policyClaimFreeYearsEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyClaimFreeYearsEntitydata);
			}
		}
	}*/

	public void setDependencyForClonnedPolicy(ClonePolicySchemeEntity clonePolicySchemeEntity,ScenarioTestData testData){
		if(clonePolicySchemeEntity.getStringValueForField("DependencyForPolicy")!=null){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), clonePolicySchemeEntity.getStringValueForField("DependencyForPolicy"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("QuoteNo", clonePolicySchemeEntity.getStringValueForField("ClonedQuoteNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}
		if(clonePolicySchemeEntity.getStringValueForField("DependencyForPolicyAttributeClone")!=null){
			ArrayList<PolicyAttributeHealthEntity>policyAttributeHealthEntityList=testData.getObjectByReference(testData.getPolicyAttributeHealthRecord(), clonePolicySchemeEntity.getStringValueForField("DependencyForPolicyAttributeClone"));
			for(PolicyAttributeHealthEntity policyAttributeHealthEntityData:policyAttributeHealthEntityList){
				policyAttributeHealthEntityData.setStringValueForField("QuoteNo",clonePolicySchemeEntity.getStringValueForField("ClonedQuoteNo"));
				testData.updateRecordsForCriteria(policyAttributeHealthEntityData);
			}
		}
	}
	public void setDependencyCollectionNumber(PolicyPremCollectionEntity policyPremCollectionEntity,ScenarioTestData testData){
		if(policyPremCollectionEntity.getStringValueForField("DependencyForCollectionNumber")!=null){
			ArrayList<PolicyAccoColleSearchEntity> policyAccoColleSearchEntityList=testData.getObjectByReference(testData.getPolicyAccoColleSearchEntity(),policyPremCollectionEntity.getStringValueForField("DependencyForCollectionNumber"));
			for(PolicyAccoColleSearchEntity policyAccoColleSearchEntityData:policyAccoColleSearchEntityList){
				policyAccoColleSearchEntityData.setStringValueForField("CollectionNo", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
			}
		}

		if(policyPremCollectionEntity.getStringValueForField("DependencyForAccountingMaintainTransaction")!=null){
			ArrayList<AccMaintainTransactionEntity> accMaintainTransactionEntityList=testData.getObjectByReference(testData.getAccountingMaintainTransactionDetailsRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForAccountingMaintainTransaction"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("VoucherNumber", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}
		//@Priyanka
		if(policyPremCollectionEntity.getStringValueForField("DependencyForAccountingChkDishonour")!=null){
			ArrayList<AccChequeDishonourEntity> accChequeDishonourEntityList=testData.getObjectByReference(testData.getaccChequeDishonourEntityRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForAccountingChkDishonour"));
			for(AccChequeDishonourEntity accChequeDishonourEntityData:accChequeDishonourEntityList){
				accChequeDishonourEntityData.setStringValueForField("CollectionNo", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accChequeDishonourEntityData);
			}
		}
		//@Priyanka
		if(policyPremCollectionEntity.getStringValueForField("DependencyForAccountingDistribution")!=null){
			ArrayList<AccountDistributionEntity> accountDistributionEntityList=testData.getObjectByReference(testData.getAccountDistributionEntityRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForAccountingDistribution"));
			for(AccountDistributionEntity accountDistributionEntityData:accountDistributionEntityList){
				accountDistributionEntityData.setStringValueForField("VoucherNumber", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accountDistributionEntityData);
			}
		}
		//Abhijit
		if(policyPremCollectionEntity.getStringValueForField("DependencyForPolicyPremCollectionNo")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForPolicyPremCollectionNo"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
				policyPremCollectionEntityData.setStringValueForField("CollectionNumber", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}
		//@PKP
		if(policyPremCollectionEntity.getStringValueForField("DependencyForAccountingCollectionSearch")!=null){
			ArrayList<AccountngCollectnSearcEntity> accountingCollectionSearchCollectionList=testData.getObjectByReference(testData.getAccountngCollectnSearcEntity(),policyPremCollectionEntity.getStringValueForField("DependencyForAccountingCollectionSearch"));
			for(AccountngCollectnSearcEntity accountngCollectnSearcEntityData:accountingCollectionSearchCollectionList){
				accountngCollectnSearcEntityData.setStringValueForField("CollectionNo", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accountngCollectnSearcEntityData);
			}
		}
		if(policyPremCollectionEntity.getStringValueForField("DependencyForNarrationDescriptionCollectionNo")!=null){
			ArrayList<AccMaintainTransactionEntity> accMaintainTransactionEntityList=testData.getObjectByReference(testData.getAccountingMaintainTransactionDetailsRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForNarrationDescriptionCollectionNo"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("NarrationDescription", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}

	}


	public void setDependencyForRenewedPolicy(PolicyEntity policyEntity,ScenarioTestData testData){
		if(policyEntity.getBooleanValueForField("ConfigRenewButton") && (policyEntity.getStringValueForField("DependencyForRenewedPolicy")!=null)){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), policyEntity.getStringValueForField("DependencyForRenewedPolicy"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("QuoteNo", policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}	
		}
	}
	public void setDependencyForPolicy(PolicyEntity policyEntity,ScenarioTestData testData){
		if(policyEntity.getStringValueForField("DependencyForPolicyQuote")!=null){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), policyEntity.getStringValueForField("DependencyForPolicyQuote"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("QuoteNo", policyEntity.getStringValueForField("QuoteNo"));
				policyEntityData.setStringValueForField("PolicyNo", policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}

		if(policyEntity.getStringValueForField("DependencyForClaim")!=null){
			ArrayList<ClaimEntity>claimEntityList=testData.getObjectByReference(testData.getclaimSearchCreateEntityRecords(), policyEntity.getStringValueForField("DependencyForClaim"));
			for(ClaimEntity claimEntityData:claimEntityList){
				claimEntityData.setStringValueForField("PolicyNumber",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(claimEntityData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForAccMaintainTransaction")!=null){
			ArrayList<AccMaintainTransactionEntity>accMaintainTransactionEntityList=testData.getObjectByReference(testData.getAccountingMaintainTransactionDetailsRecords(), policyEntity.getStringValueForField("DependencyForAccMaintainTransaction"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("ReferenceNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}

		// 
		if(policyEntity.getStringValueForField("DependencyForPolicyPremium")!=null){
			ArrayList<MembAtachCovrgPremSchdEntity>membAtachCovrgPremSchdEntityList=testData.getObjectByReference(testData.getmembAtachCovrgPremSchdEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyPremium"));
			for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntityData:membAtachCovrgPremSchdEntityList){
				membAtachCovrgPremSchdEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo"));
				membAtachCovrgPremSchdEntityData.setStringValueForField("QuoteNo",policyEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(membAtachCovrgPremSchdEntityData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForPolicyPayments")!=null){
			ArrayList<PolicyPaymDetailsCycleEntity>policyPaymDetailsCycleEntityList=testData.getObjectByReference(testData.getPolicyPaymDetailsCycleEntities(), policyEntity.getStringValueForField("DependencyForPolicyPayments"));
			for(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntityData:policyPaymDetailsCycleEntityList){
				policyPaymDetailsCycleEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyPaymDetailsCycleEntityData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForPolicyRelation")!=null){
			ArrayList<PolicyRelationDetailEntity> policyRelationDetailEntityList =testData.getObjectByReference(testData.getPolicyRelationDetailEntity(), policyEntity.getStringValueForField("DependencyForPolicyRelation"));
			for (PolicyRelationDetailEntity policyRelationDetailEntityListData : policyRelationDetailEntityList) {
				policyRelationDetailEntityListData.setStringValueForField("PolicyNo", policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(policyRelationDetailEntityListData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForAccountingPolicyNo")!=null){
			ArrayList<PolicyAccoColleSearchEntity>policyAccoColleSearchEntityList=testData.getObjectByReference(testData.getPolicyAccoColleSearchEntity(), policyEntity.getStringValueForField("DependencyForAccountingPolicyNo"));
			for(PolicyAccoColleSearchEntity policyAccoColleSearchEntityData:policyAccoColleSearchEntityList){
				policyAccoColleSearchEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
			}
		}
		//Abhijit
		if(policyEntity.getStringValueForField("DependencyPolicyPremiumSchedule")!=null){
			ArrayList<PolicyPremiumScheduleEntity>policyPremiumScheduleEntityList=testData.getObjectByReference(testData.getPolicyPremiumScheduleEntity(), policyEntity.getStringValueForField("DependencyPolicyPremiumSchedule"));
			for(PolicyPremiumScheduleEntity policyPremiumScheduleEntityData:policyPremiumScheduleEntityList){
				policyPremiumScheduleEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyPremiumScheduleEntityData);
			}
		}

		if(policyEntity.getStringValueForField("DependencyForClaimSynopsis")!=null){
			ArrayList<ClaimSynopsisEntity>claimSynopsisEntityList=testData.getObjectByReference(testData.getClaimSynopsisEntity(), policyEntity.getStringValueForField("DependencyForClaimSynopsis"));
			for(ClaimSynopsisEntity claimSynopsisEntityListData:claimSynopsisEntityList){
				claimSynopsisEntityListData.setStringValueForField("PolicyNumber",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(claimSynopsisEntityListData);
			}
		}

		//Priyanka
		if(policyEntity.getStringValueForField("DependencyForDebitCreditNotes")!=null){
			ArrayList<DebitCreditNoteEntity> debitCreditNoteEntityList= testData.getObjectByReference(testData.getDebitCreditNoteEntityRecords(), policyEntity.getStringValueForField("DependencyForDebitCreditNotes"));
			for(DebitCreditNoteEntity debitCreditNoteEntityData:debitCreditNoteEntityList){
				debitCreditNoteEntityData.setStringValueForField("PolicyNumber",policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(debitCreditNoteEntityData);
			}
		}
		//Mangesh
		if(policyEntity.getStringValueForField("DependencyForShowVersion")!=null){
			ArrayList<PolicyShowVersionPageEntity>policyShowVersionPageEntityList=testData.getObjectByReference(testData.getPolicyShowVersionPageEntity(), policyEntity.getStringValueForField("DependencyForShowVersion"));
			for(PolicyShowVersionPageEntity policyShowVersionPageEntityData:policyShowVersionPageEntityList){
				policyShowVersionPageEntityData.setStringValueForField("PolicyNumber",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyShowVersionPageEntityData);
			}
		}


		if(policyEntity.getStringValueForField("DependencyPolicyFollowup")!=null){			
			ArrayList<PolicyFollowupEntity> policyFollowupEntityList=testData.getObjectByReference(testData.getPolicyFollowupEntity(), policyEntity.getStringValueForField("DependencyPolicyFollowup"));	
			for(PolicyFollowupEntity policyFollowupEntityData:policyFollowupEntityList){	
				policyFollowupEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				policyFollowupEntityData.setStringValueForField("EventPolicyNumber",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyFollowupEntityData);
			}	
		}		



		//Sachin
		if(policyEntity.getStringValueForField("DependencyForCollectionPolicyNo")!=null){
			ArrayList<PolicyPremCollectionEntity>policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), policyEntity.getStringValueForField("DependencyForCollectionPolicyNo"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
				policyPremCollectionEntityData.setStringValueForField("PolicyNoQuotationNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}

		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForClaimPartiesFinanSumay")!=null){
			ArrayList<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getObjectByReference(testData.getclaimPartiesFinanSumayEntityRecordsForScenario(), policyEntity.getStringValueForField("DependencyForClaimPartiesFinanSumay"));
			for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData:claimPartiesFinanSumayEntityList){
				claimPartiesFinanSumayEntityListData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(claimPartiesFinanSumayEntityListData);
			}
		}

		//Abhijit
		if(policyEntity.getStringValueForField("DependencyForClaimPayment")!=null){
			ArrayList<ClaimPaymentEntity>claimPaymentEntityList=testData.getObjectByReference(testData.getClaimPaymentDetailsRecords(), policyEntity.getStringValueForField("DependencyForClaimPayment"));
			for(ClaimPaymentEntity claimPaymentEntityListData:claimPaymentEntityList){
				claimPaymentEntityListData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(claimPaymentEntityListData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForPolicyEngineering")!=null){
			ArrayList<ProjectDetailEngEntity>projectDetailEngEntityList=testData.getObjectByReference(testData.getProjectDetailEngEntityRecord(), policyEntity.getStringValueForField("DependencyForPolicyEngineering"));
			for(ProjectDetailEngEntity projectDetailEngEntityListData:projectDetailEngEntityList){
				projectDetailEngEntityListData.setStringValueForField("PolicyNumber", policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(projectDetailEngEntityListData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForPolicyALOPProduct")!=null){
			ArrayList<PolInsIntEngEntity>polInsIntEngEntityList=testData.getObjectByReference(testData.getPolInsIntEngEntityRecords(), policyEntity.getStringValueForField("DependencyForPolicyALOPProduct"));
			for(PolInsIntEngEntity polInsIntEngEntityListData:polInsIntEngEntityList){
				polInsIntEngEntityListData.setStringValueForField("PolicyNumberOfTheERCRME", policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(polInsIntEngEntityListData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForBrokerAgentTPA")!=null){
			ArrayList<PolBrokerAgentTPADetEntity> polBrokerAgentTPADetEntityList=testData.getObjectByReference(testData.getPolBrokerAgentTPADetEntityRecord(), policyEntity.getStringValueForField("DependencyForBrokerAgentTPA"));
			for(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntityListData:polBrokerAgentTPADetEntityList){
				polBrokerAgentTPADetEntityListData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo"));
				testData.updateRecordsForCriteria(polBrokerAgentTPADetEntityListData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForAccountingCollectionPolicyNo")!=null){
			ArrayList<AccountngCollectnSearcEntity>accountngCollectnSearcEntityList=testData.getObjectByReference(testData.getAccountngCollectnSearcEntity(), policyEntity.getStringValueForField("DependencyForAccountingCollectionPolicyNo"));
			for(AccountngCollectnSearcEntity accountngCollectnSearcEntityData:accountngCollectnSearcEntityList){
				accountngCollectnSearcEntityData.setStringValueForField("ProposalOrPolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(accountngCollectnSearcEntityData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForAccountingNarrationPolicyNo")!=null){
			ArrayList<AccMaintainTransactionEntity>accMaintainTransactionEntityList=testData.getObjectByReference(testData.getAccountingMaintainTransactionDetailsRecords(), policyEntity.getStringValueForField("DependencyForAccountingNarrationPolicyNo"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("NarrationDescription",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}

	}

	public void setDependencyForClonePolicy(PolicyEntity policyEntity,ScenarioTestData testData){
		if(policyEntity.getStringValueForField("DependencyForClonePolicy")!=null){
			ArrayList<ClonePolicySchemeEntity>clonePolicySchemeEntityList=testData.getObjectByReference(testData.getClonePolicySchemeEntityRecords(), policyEntity.getStringValueForField("DependencyForClonePolicy"));
			for(ClonePolicySchemeEntity clonePolicySchemeEntityData:clonePolicySchemeEntityList){
				clonePolicySchemeEntityData.setStringValueForField("ReferencePolicySchemeNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(clonePolicySchemeEntityData);
			}
		}
		if(policyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule")!=null){
			ArrayList<PolicyPremiumScheduleEntity>policyPremiumScheduleEntityList=testData.getObjectByReference(testData.getPolicyPremiumScheduleEntity(), policyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule"));
			for(PolicyPremiumScheduleEntity policyPremiumScheduleEntityData:policyPremiumScheduleEntityList){
				policyPremiumScheduleEntityData.setStringValueForField("PolicyNo",policyEntity.getStringValueForField("PolicyNo") );
				testData.updateRecordsForCriteria(policyPremiumScheduleEntityData);
			}
		}

	}

	///////
	/*public void setDependencyForCollectionNumber(PolicyEntity policyEntity,ScenarioTestData testData){
		if(policyEntity.getStringValueForField("DependencyForCollectionNumber")!=null){
			ArrayList<PolicyEntity> policyEntityList =testData.getObjectByReference(testData.getPolicyRecords(), policyEntity.getStringValueForField("DependencyForCollectionNumber"));
			for (PolicyEntity policyEntityData : policyEntityList) {
				policyEntityData.setStringValueForField("CollectionNo", policyEntity.getStringValueForField("CollectionNo"));
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}
	}*/
	public void setDependencyForClaimInsuredCode(PolicyMemberDetailsEntity policyMemberDetailsEntityListData,ScenarioTestData testData){
		if(policyMemberDetailsEntityListData.getStringValueForField("DependencyForClaimInsuredCode")!=null){
			ArrayList<ClaimEntity>claimEntityList=testData.getObjectByReference(testData.getclaimSearchCreateEntityRecords(), policyMemberDetailsEntityListData.getStringValueForField("DependencyForClaimInsuredCode"));
			for(ClaimEntity claimEntityData:claimEntityList){
				claimEntityData.setStringValueForField("SeqNo",policyMemberDetailsEntityListData.getStringValueForField("MemberSerialNo") );
				testData.updateRecordsForCriteria(claimEntityData);
			}
		}
	}
	public void policyEndorsementVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Endorsement of Policy </i></B>");
		List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
		for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
			if(previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("verify") && previousPolicyHistoryEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PreviousPolicyHistoryPage previousPolicyHistoryPage=new PreviousPolicyHistoryPage(driver, "Policy Previous History page");
				previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
				testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);

			}
		}
	}
	public void setDependencyForScrollBusinessSourceCode(PolicyRelationDetailEntity policyRelationDetailEntityListData,ScenarioTestData testData){
		if(policyRelationDetailEntityListData.getStringValueForField("DependencyForScrollBusinessSourceCode")!=null){
			ArrayList<PartyEntity>partyEntityList=testData.getObjectByReference(testData.getPartyEntities(), policyRelationDetailEntityListData.getStringValueForField("DependencyForScrollBusinessSourceCode"));
			for(PartyEntity partyEntityData:partyEntityList){
				partyEntityData.setStringValueForField("SearchStakeholderFunctionCode",policyRelationDetailEntityListData.getStringValueForField("StakeCode") );
				partyEntityData.setStringValueForField("PartyCode",policyRelationDetailEntityListData.getStringValueForField("PartyCode") );
				testData.updateRecordsForCriteria(partyEntityData);
			}
		}
	}


	public void policyRenewVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Renewal of Policy </i></B>");
		List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
		for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
			if(previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("verify")){
				/*PreviousPolicyHistoryForRenew previousPolicyHistoryPage=new PreviousPolicyHistoryForRenew(driver, "Policy Previous History page");
				previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
				testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);*/

			}
		}
	}

	//---------------GT-----------------//
	public void policyAttributeOptionalTPARuleVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Optional TPA Rule </i></B>");
		List<OptionalTPARuleEntity> optionalTPARuleEntityList=testData.getOptionalTPARuleEntity();
		for(OptionalTPARuleEntity optionalTPARuleEntitydata:optionalTPARuleEntityList){
			if(optionalTPARuleEntitydata.getAction().equalsIgnoreCase("verify")){
				OptionalTPARule optionalTPARulepage=new OptionalTPARule(driver, "Optional TPA Rule page");
				optionalTPARulepage.fillAndSubmitOptionalTPAAttribute(optionalTPARuleEntitydata, assertReference);
				testData.updateRecordsForCriteria(optionalTPARuleEntitydata);
			}
		}

	}

	//---------------FM-----------------//
	public void policyAttributeCoPaymentAndClaimRatioHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Co Payment And Claim Ratio </i></B>");
		List<PolicyCoPayClaimRatioEntity> policyCoPayClaimRatioEntityList=testData.getPolicyCoPayClaimRatioEntity();
		for(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntitydata:policyCoPayClaimRatioEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyCoPayClaimRatioEntitydata.getChildKey())){
			if((policyCoPayClaimRatioEntitydata.getAction().equalsIgnoreCase("edit")||policyCoPayClaimRatioEntitydata.getAction().equalsIgnoreCase("add"))&& policyCoPayClaimRatioEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttributeCoPaymentAndClaimRatio policyAttributeCoPaymentAndClaimRatioPage=new PolicyAttributeCoPaymentAndClaimRatio(driver, "Policy Attribute Co Paymet Claim Ratio");
				policyAttributeCoPaymentAndClaimRatioPage.fillandSubmitPolicyAttributeCoPaymentAndClaimRatio(policyCoPayClaimRatioEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyCoPayClaimRatioEntitydata);

			}
		}
	}
}
	//---------------FM-----------------//
	public void policyAttributePortabilityHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Portablity </i></B>");
		List<PortabilityEntity> portabilityEntityList=testData.getPortabilityEntityRecords();
		for(PortabilityEntity portabilityEntityData:portabilityEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(portabilityEntityData.getChildKey())){

				if((portabilityEntityData.getAction().equalsIgnoreCase("edit")||portabilityEntityData.getAction().equalsIgnoreCase("add"))&& portabilityEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
					Portability portabilityPage=new Portability(driver, "Portability");
					portabilityPage.fillPortabilityAttributeDetails(portabilityEntityData, assertReference);
					testData.updateRecordsForCriteria(portabilityEntityData);
				}
			}
		}
	}
	public void policyAttributeProvisionalPolicyDetails (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details </i></B>");
		List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
		for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
				if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("edit")||provisionalPolDetailEntityData.getAction().equalsIgnoreCase("add"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
					policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
					testData.updateRecordsForCriteria(provisionalPolDetailEntityData);
				}
			}
		}
	}

	public void policyAttributeInstallmentFacility (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver, PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Installment Facility  </i></B>");
		int rowcount=0;
		List<InstallementFacilityEntity> installementFacilityEntityList=testData.getInstallementFacilityEntity();
		for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(installementFacilityEntityData.getChildKey())){
				if((installementFacilityEntityData.getAction().equalsIgnoreCase("edit")||installementFacilityEntityData.getAction().equalsIgnoreCase("add"))&& installementFacilityEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeInstallementFacility policyAttributeInstallementFacility=new PolicyAttributeInstallementFacility(driver, "Policy Attribute Installement Facility Page", rowcount);
					policyAttributeInstallementFacility.fillandSubmitPolicyAttributeInstallementFacility(installementFacilityEntityData, assertReference);
					testData.updateRecordsForCriteria(installementFacilityEntityData);
					rowcount++;
				}
			}
		}
	}
	//-------------------------BH---------------------//
	public void policyMemberAttributePreviousPolicyDataBHEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Previous Policy Data BH </i></B>");
		List<PreviousPolicyDataEntity> previousPolicyDataEntityList=testData.getPreviousPolicyDataEntity();
		for(PreviousPolicyDataEntity previousPolicyDataEntitydata:previousPolicyDataEntityList){
			if(previousPolicyDataEntitydata.getAction().equalsIgnoreCase("edit")||previousPolicyDataEntitydata.getAction().equalsIgnoreCase("add")){
				PolicyMemberPreviousPolicyDataBH policyMemberPreviousPolicyDataBHpage=new PolicyMemberPreviousPolicyDataBH(driver, "Previous Policy Data");
				policyMemberPreviousPolicyDataBHpage.fillandSubmitPolicyMemberPreviousPolicyData(previousPolicyDataEntitydata, assertReference);
				testData.updateRecordsForCriteria(previousPolicyDataEntitydata);
			}
		}
	}


	//---------------BH-----------------//
	public void policyMemberAttributePreviousPolicyDataBHVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Previous Policy Data BH </i></B>");
		List<PreviousPolicyDataEntity> previousPolicyDataEntityList=testData.getPreviousPolicyDataEntity();
		for(PreviousPolicyDataEntity previousPolicyDataEntitydata:previousPolicyDataEntityList){
			if(previousPolicyDataEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyMemberPreviousPolicyDataBH policyMemberPreviousPolicyDataBHpage=new PolicyMemberPreviousPolicyDataBH(driver, "Optional TPA Rule Page");
				policyMemberPreviousPolicyDataBHpage.fillandSubmitPolicyMemberPreviousPolicyData(previousPolicyDataEntitydata, assertReference);
				testData.updateRecordsForCriteria(previousPolicyDataEntitydata);
			}
		}
	}

	//---------------BH-----------------//
	public void policyMemberAttributeInsuredMemberDetailBHEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,int rowcount) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Insured Member Detail BH </i></B>");
		List<InsuredMemberDetailEntity> insuredMemberDetailEntityList=testData.getInsuredMemberDetailEntity();
		for(InsuredMemberDetailEntity insuredMemberDetailEntitydata:insuredMemberDetailEntityList){
			if(insuredMemberDetailEntitydata.getAction().equalsIgnoreCase("edit")||insuredMemberDetailEntitydata.getAction().equalsIgnoreCase("add")){
				PolicyMemberInsuredMemberDetailBH policyMemberInsuredMemberDetailBHBHpage=new PolicyMemberInsuredMemberDetailBH(driver, "Insured Member Detail BH Page", rowcount);
				policyMemberInsuredMemberDetailBHBHpage.fillandSubmitPolicyMemberInsuredMemberDetailBH(insuredMemberDetailEntitydata, assertReference);
				testData.updateRecordsForCriteria(insuredMemberDetailEntitydata);
			}
		}
	}
	//SC

	public void policyMemberAttributeMedicalCheckUpDetailsEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,int rowcount,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Medical Check Up Details</i></B>");
		List<MedicalCheckUpDetailsEntity> medicalCheckUpDetailsEntityList=testData.getMedicalCheckUpDetailsEntity();
		for(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntitydata:medicalCheckUpDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(medicalCheckUpDetailsEntitydata.getChildKey())){
				if(medicalCheckUpDetailsEntitydata.getAction().equalsIgnoreCase("edit")||medicalCheckUpDetailsEntitydata.getAction().equalsIgnoreCase("add") && medicalCheckUpDetailsEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					MedicalCheckUpDetails medicalCheckUpDetails=new MedicalCheckUpDetails(driver, "Medical Check Up Details");
					medicalCheckUpDetails.fillMedicalCheckUpDetails(medicalCheckUpDetailsEntitydata, assertReference);
					testData.updateRecordsForCriteria(medicalCheckUpDetailsEntitydata);
				}
			}
		}
	}


	//---------------BH-----------------//
	public void policyMemberAttributeInsuredMemberDetailBHVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,int rowcount) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Insured Member Detail BH </i></B>");
		List<InsuredMemberDetailEntity> insuredMemberDetailEntityList=testData.getInsuredMemberDetailEntity();
		for(InsuredMemberDetailEntity insuredMemberDetailEntitydata:insuredMemberDetailEntityList){
			if(insuredMemberDetailEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyMemberInsuredMemberDetailBH policyMemberInsuredMemberDetailBHBHpage=new PolicyMemberInsuredMemberDetailBH(driver, "Insured Member Detail BH Page", rowcount);
				policyMemberInsuredMemberDetailBHBHpage.fillandSubmitPolicyMemberInsuredMemberDetailBH(insuredMemberDetailEntitydata, assertReference);
				testData.updateRecordsForCriteria(insuredMemberDetailEntitydata);
			}
		}
	}

	//---------------PZ-----------------//
	public void policyMemberAttributeIMJourneyDetailsPZEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: IM Journey Details PZ </i></B>");
		List<IMJourneyDetailsPZEntity> iMJourneyDetailsPZEntityList=testData.getIMJourneyDetailsPZEntity();
		for(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntitydata:iMJourneyDetailsPZEntityList){
			if(iMJourneyDetailsPZEntitydata.getAction().equalsIgnoreCase("edit")||iMJourneyDetailsPZEntitydata.getAction().equalsIgnoreCase("add")){
				PolicyInsuredInterestAttrIMJourneyDetailsPZ policyInsuredInterestAttrIMJourneyDetailsPZpage=new PolicyInsuredInterestAttrIMJourneyDetailsPZ(driver, "IM Journey Details PZ");
				policyInsuredInterestAttrIMJourneyDetailsPZpage.fillandSubmitPolicyInsuredInterestAttrIMJourneyDetails(iMJourneyDetailsPZEntitydata, assertReference);
				testData.updateRecordsForCriteria(iMJourneyDetailsPZEntitydata);
			}
		}
	}

	//---------------PZ-----------------//
	public void policyMemberAttributeIMJourneyDetailsPZVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: IM Journey Details PZ </i></B>");
		List<IMJourneyDetailsPZEntity> iMJourneyDetailsPZEntityList=testData.getIMJourneyDetailsPZEntity();
		for(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntitydata:iMJourneyDetailsPZEntityList){
			if(iMJourneyDetailsPZEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyInsuredInterestAttrIMJourneyDetailsPZ policyInsuredInterestAttrIMJourneyDetailsPZpage=new PolicyInsuredInterestAttrIMJourneyDetailsPZ(driver, "IM Journey Details PZ");
				policyInsuredInterestAttrIMJourneyDetailsPZpage.fillandSubmitPolicyInsuredInterestAttrIMJourneyDetails(iMJourneyDetailsPZEntitydata, assertReference);
				testData.updateRecordsForCriteria(iMJourneyDetailsPZEntitydata);
			}
		}
	}
	//------------------------JA----------------------//
	public void policyMemberAttributeGroupDetailsVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Start date for member </i></B>");
		List<PolicyMemberAttrGroupEntity> policyMemberAttrGroupEntityList=testData.getPolicyMemberAttributesGroupNumberEntity();
		for(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntityData:policyMemberAttrGroupEntityList){
			if(policyMemberAttrGroupEntityData.getAction().equalsIgnoreCase("verify")){
				PolicyMemberAttributesNextGroupPage policyMemberAttributeNextGroupPage=new PolicyMemberAttributesNextGroupPage(driver, "Policy Member Attribute Next Group Page");
				policyMemberAttributeNextGroupPage.fillAndProceedPolicyMemberAttributesNextGroupPage(policyMemberAttrGroupEntityData, assertReference);
				testData.updateRecordsForCriteria(policyMemberAttrGroupEntityData);
			}
		}
	}
	//------------------------JA----------------------//
	public void policyMemberAttributeCoPaymentDetailsVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Attribute CoPayment Details </i></B>");
		List<PolicyMemCoPaymentSCEntity> policyMemCoPaymentSCEntityList=testData.getPolicyMemCoPaymentSCEntity();
		for(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntityData:policyMemCoPaymentSCEntityList){
			if(policyMemCoPaymentSCEntityData.getAction().equalsIgnoreCase("verify")){
				PolicyMemberCoPaymentSC policyMemberCoPaymentSCPage=new PolicyMemberCoPaymentSC(driver, "Policy Member Attribute CoPayment Details");
				policyMemberCoPaymentSCPage.fillandsubmitMemberCoPaymentSC(policyMemCoPaymentSCEntityData, assertReference);
				testData.updateRecordsForCriteria(policyMemCoPaymentSCEntityData);
			}
		}
	}
	//---------------PZ-----------------//
	public void policyMemberAttributeBalancePremiumForPZEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Balance Premium for PZ </i></B>");
		List<BalancePremiumEntity> balancePremiumEntityList=testData.getBalancePremiumEntity();
		for(BalancePremiumEntity balancePremiumEntitydata:balancePremiumEntityList){
			if(balancePremiumEntitydata.getAction().equalsIgnoreCase("edit")||balancePremiumEntitydata.getAction().equalsIgnoreCase("add")){
				PolicyInsuredInterestAtrributeBalancePremium policyInsuredInterestAtrributeBalancePremiumpage=new PolicyInsuredInterestAtrributeBalancePremium(driver, "Balance Premium for PZ");
				policyInsuredInterestAtrributeBalancePremiumpage.fillandSubmitPolicyAtrributeBalancePremiumDetails(balancePremiumEntitydata, assertReference);
				testData.updateRecordsForCriteria(balancePremiumEntitydata);
			}
		}
	}
	//---------------TG--------------//
	public void policyInsAtttrRiskDetailsForSTDRiskEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Details for STD Risk Page </i></B>");
		List<PolicyMemAttrSTDRiskEntity> policyMemAttrSTDRiskEntityList=testData.getPolicyMemAttrSTDRiskEntity();
		for(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntitydata:policyMemAttrSTDRiskEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttrSTDRiskEntitydata.getChildKey())){
				if(policyMemAttrSTDRiskEntitydata.getAction().equalsIgnoreCase("edit")||policyMemAttrSTDRiskEntitydata.getAction().equalsIgnoreCase("add") && policyMemAttrSTDRiskEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemAttrRiskDetailsForSTDRiskPage policyMemAttrRiskDetailsForSTDRiskPage=new PolicyMemAttrRiskDetailsForSTDRiskPage(driver, "Risk Details for STD Risk Page");
					policyMemAttrRiskDetailsForSTDRiskPage.fillAndSubmitPolicyMemberAttributesGroupNumber(policyMemAttrSTDRiskEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyMemAttrSTDRiskEntitydata);
				}
			}
		}	
	}
	public void policyInsAtttrRiskDetailsForSTDRiskVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Details for STD Risk Page </i></B>");
		List<PolicyMemAttrSTDRiskEntity> policyMemAttrSTDRiskEntityList=testData.getPolicyMemAttrSTDRiskEntity();
		for(PolicyMemAttrSTDRiskEntity policyMemAttrSTDRiskEntitydata:policyMemAttrSTDRiskEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttrSTDRiskEntitydata.getChildKey())){
				if(policyMemAttrSTDRiskEntitydata.getAction().equalsIgnoreCase("verify") && policyMemAttrSTDRiskEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemAttrRiskDetailsForSTDRiskPage policyMemAttrRiskDetailsForSTDRiskPage=new PolicyMemAttrRiskDetailsForSTDRiskPage(driver, "Risk Details for STD Risk Page");
					policyMemAttrRiskDetailsForSTDRiskPage.fillAndSubmitPolicyMemberAttributesGroupNumber(policyMemAttrSTDRiskEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyMemAttrSTDRiskEntitydata);
				}
			}
		}
	}

	//TG Sachin

	public void policyInsAtttrBasicPrem123EditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Basic Prem Page </i></B>");
		List<PolicyInsrAttrBasPrem1Entity> policyInsrAttrBasPrem1EntityList=testData.getpolicyInsrAttrBasPrem1EntityRecords();
		for(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entitydata:policyInsrAttrBasPrem1EntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem1Entitydata.getChildKey())){
				if(policyInsrAttrBasPrem1Entitydata.getAction().equalsIgnoreCase("edit")||policyInsrAttrBasPrem1Entitydata.getAction().equalsIgnoreCase("add") && policyInsrAttrBasPrem1Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredAttributesBasicPrem1 policyInsrAttrBasPrem1Page = new PolicyInsuredAttributesBasicPrem1(driver, "Basic Prem Page");
					policyInsrAttrBasPrem1Page.fillAndSubmitPolicyInsuredAttributesBasicPrem1Page(policyInsrAttrBasPrem1Entitydata, assertReference);
				}

				if (policyInsrAttrBasPrem1Entitydata.getBooleanValueForField("ConfigProceedButton")){
					List<PolicyInsrAttrBasPrem2Entity> policyInsrAttrBasPrem2EntityList=testData.getpolicyInsrAttrBasPrem2EntityRecords();
					for(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entitydata:policyInsrAttrBasPrem2EntityList){
						if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem2Entitydata.getChildKey())){
							if(policyInsrAttrBasPrem2Entitydata.getAction().equalsIgnoreCase("edit")||policyInsrAttrBasPrem2Entitydata.getAction().equalsIgnoreCase("add") && policyInsrAttrBasPrem2Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyInsuredAttributesBasicPrem2 policyInsrAttrBasPrem2Page=new PolicyInsuredAttributesBasicPrem2(driver, "Basic Prem Page");
								policyInsrAttrBasPrem2Page.fillAndSubmitPolicyInsuredAttributesBasicPrem2Page(policyInsrAttrBasPrem2Entitydata, assertReference);
							}

							if (policyInsrAttrBasPrem2Entitydata.getBooleanValueForField("ConfigProceedButton")){
								List<PolicyInsrAttrBasPrem3Entity> policyInsrAttrBasPrem3EntityList=testData.getpolicyInsrAttrBasPrem3EntityRecords();
								for(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem3Entitydata:policyInsrAttrBasPrem3EntityList){
									if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem3Entitydata.getChildKey())){
										if(policyInsrAttrBasPrem3Entitydata.getAction().equalsIgnoreCase("edit")||policyInsrAttrBasPrem3Entitydata.getAction().equalsIgnoreCase("add") && policyInsrAttrBasPrem3Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
											PolicyInsuredAttributesBasicPrem3 policyInsrAttrBasPrem3Page=new PolicyInsuredAttributesBasicPrem3(driver, "Basic Prem Page");
											policyInsrAttrBasPrem3Page.fillAndSubmitPolicyInsuredAttributesBasicPrem3Page(policyInsrAttrBasPrem3Entitydata, assertReference);

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}







	public void policyInsAtttrBasicPrem123VerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Basic Prem Page </i></B>");
		List<PolicyInsrAttrBasPrem1Entity> policyInsrAttrBasPrem1EntityList=testData.getpolicyInsrAttrBasPrem1EntityRecords();
		for(PolicyInsrAttrBasPrem1Entity policyInsrAttrBasPrem1Entitydata:policyInsrAttrBasPrem1EntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem1Entitydata.getChildKey())){
				if(policyInsrAttrBasPrem1Entitydata.getAction().equalsIgnoreCase("verify") && policyInsrAttrBasPrem1Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredAttributesBasicPrem1 policyInsrAttrBasPrem1Page=new PolicyInsuredAttributesBasicPrem1(driver, "Basic Prem Page");
					policyInsrAttrBasPrem1Page.fillAndSubmitPolicyInsuredAttributesBasicPrem1Page(policyInsrAttrBasPrem1Entitydata, assertReference);
				}
				if (policyInsrAttrBasPrem1Entitydata.getBooleanValueForField("ConfigProceedButton")){
					List<PolicyInsrAttrBasPrem2Entity> policyInsrAttrBasPrem2EntityList=testData.getpolicyInsrAttrBasPrem2EntityRecords();
					for(PolicyInsrAttrBasPrem2Entity policyInsrAttrBasPrem2Entitydata:policyInsrAttrBasPrem2EntityList){
						if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem2Entitydata.getChildKey())){
							if(policyInsrAttrBasPrem2Entitydata.getAction().equalsIgnoreCase("verify") && policyInsrAttrBasPrem2Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyInsuredAttributesBasicPrem2 policyInsrAttrBasPrem2Page=new PolicyInsuredAttributesBasicPrem2(driver, "Basic Prem Page");
								policyInsrAttrBasPrem2Page.fillAndSubmitPolicyInsuredAttributesBasicPrem2Page(policyInsrAttrBasPrem2Entitydata, assertReference);
							}
							if (policyInsrAttrBasPrem2Entitydata.getBooleanValueForField("ConfigProceedButton")){
								List<PolicyInsrAttrBasPrem3Entity> policyInsrAttrBasPrem3EntityList=testData.getpolicyInsrAttrBasPrem3EntityRecords();
								for(PolicyInsrAttrBasPrem3Entity policyInsrAttrBasPrem3Entitydata:policyInsrAttrBasPrem3EntityList){
									if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrAttrBasPrem3Entitydata.getChildKey())){
										if(policyInsrAttrBasPrem3Entitydata.getAction().equalsIgnoreCase("verify") && policyInsrAttrBasPrem3Entitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
											PolicyInsuredAttributesBasicPrem3 policyInsrAttrBasPrem3Page=new PolicyInsuredAttributesBasicPrem3(driver, "Basic Prem Page");
											policyInsrAttrBasPrem3Page.fillAndSubmitPolicyInsuredAttributesBasicPrem3Page(policyInsrAttrBasPrem3Entitydata, assertReference);

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	//--------------------------- MU -----------------------------//

	//--------------------------- TG -----------------------------//


	public void policyInsAtttrLoadingAmbulanceEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Loading Ambulance Page </i></B>");
		List<PolInsLoadAmbulanceEntity> polInsLoadAmbulanceEntityList=testData.getAttrLoadAmbulanceEntities();
		for(PolInsLoadAmbulanceEntity polInsLoadAmbulanceEntitydata:polInsLoadAmbulanceEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsLoadAmbulanceEntitydata.getChildKey())){
				if(polInsLoadAmbulanceEntitydata.getAction().equalsIgnoreCase("edit")||polInsLoadAmbulanceEntitydata.getAction().equalsIgnoreCase("add") && polInsLoadAmbulanceEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredAttrLoadingAmbulance policyInsuredAttrLoadingAmbulancepage=new PolicyInsuredAttrLoadingAmbulance(driver, "Policy Insured Atttributes Loading Ambulance Page");
					policyInsuredAttrLoadingAmbulancepage.fillAndSubmitPolicyInsuredAttrLoadingAmbulance(polInsLoadAmbulanceEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsLoadAmbulanceEntitydata);
				}
			}
		}
	}
	public void policyInsAtttrLoadingAmbulanceVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Loading Ambulance Page </i></B>");
		List<PolInsLoadAmbulanceEntity> polInsLoadAmbulanceEntityList=testData.getAttrLoadAmbulanceEntities();
		for(PolInsLoadAmbulanceEntity polInsLoadAmbulanceEntitydata:polInsLoadAmbulanceEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsLoadAmbulanceEntitydata.getChildKey())){
				if(polInsLoadAmbulanceEntitydata.getAction().equalsIgnoreCase("verify") && polInsLoadAmbulanceEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredAttrLoadingAmbulance policyInsuredAttrLoadingAmbulancepage=new PolicyInsuredAttrLoadingAmbulance(driver, "Policy Insured Atttributes Loading Ambulance Page");
					policyInsuredAttrLoadingAmbulancepage.fillAndSubmitPolicyInsuredAttrLoadingAmbulance(polInsLoadAmbulanceEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsLoadAmbulanceEntitydata);
				}
			}
		}
	}


	public void policyInsAtttrLodingDiscountOptionEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Loding Discount Option  Page </i></B>");
		List<PolInsuredLodngDisOptEntity> polInsuredLodngDisOptEntityList=testData.getPolInsuredLodngDisOptEntity();
		for(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntitydata:polInsuredLodngDisOptEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsuredLodngDisOptEntitydata.getChildKey())){
				if(polInsuredLodngDisOptEntitydata.getAction().equalsIgnoreCase("edit")||polInsuredLodngDisOptEntitydata.getAction().equalsIgnoreCase("add") && polInsuredLodngDisOptEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredLoadingDiscountOptionPage policyInsuredLoadingDiscountOptionPage=new PolicyInsuredLoadingDiscountOptionPage(driver, "Policy Insured Atttributes Loding Discount Option Page");
					policyInsuredLoadingDiscountOptionPage.fillandsubmitPolicyLoadingDiscountOption(polInsuredLodngDisOptEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsuredLodngDisOptEntitydata);
				}
			}
		}
	}
	public void policyInsAtttrLodingDiscountOptionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Loding Discount Option  Page </i></B>");
		List<PolInsuredLodngDisOptEntity> polInsuredLodngDisOptEntityList=testData.getPolInsuredLodngDisOptEntity();
		for(PolInsuredLodngDisOptEntity polInsuredLodngDisOptEntitydata:polInsuredLodngDisOptEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsuredLodngDisOptEntitydata.getChildKey())){
				if(polInsuredLodngDisOptEntitydata.getAction().equalsIgnoreCase("verify") && polInsuredLodngDisOptEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredLoadingDiscountOptionPage policyInsuredLoadingDiscountOptionPage=new PolicyInsuredLoadingDiscountOptionPage(driver, "Policy Insured Atttributes Loding Discount Option Page");
					policyInsuredLoadingDiscountOptionPage.fillandsubmitPolicyLoadingDiscountOption(polInsuredLodngDisOptEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsuredLodngDisOptEntitydata);
				}
			}
		}
	}

	// TG Sachin
	public void policyInsAtttrTailorPremiumDetailsEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Tailor Premium Details Page </i></B>");
		List<PolicyInsrdTailorPremEntity> policyInsrdTailorPremEntityList=testData.getPolicyInsrdTailorPremEntity();
		for(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntitydata:policyInsrdTailorPremEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrdTailorPremEntitydata.getChildKey())){
				if(policyInsrdTailorPremEntitydata.getAction().equalsIgnoreCase("edit")||policyInsrdTailorPremEntitydata.getAction().equalsIgnoreCase("add") && policyInsrdTailorPremEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestTailorPremiumDetailsTF policyInsuredIntrestTailorPremiumDetailsTFPage=new PolicyInsuredIntrestTailorPremiumDetailsTF(driver, "Policy Insured Atttributes Tailor Premium Details Page", 0);
					policyInsuredIntrestTailorPremiumDetailsTFPage.fillandsubmitPolicyInsuredIntrestTailorPremiumDetailsTF(policyInsrdTailorPremEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyInsrdTailorPremEntitydata);
				}
			}
		}
	}
	public void policyInsAtttrTailorPremiumDetailsVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Tailor Premium Details Page </i></B>");
		List<PolicyInsrdTailorPremEntity> policyInsrdTailorPremEntityList=testData.getPolicyInsrdTailorPremEntity();
		for(PolicyInsrdTailorPremEntity policyInsrdTailorPremEntitydata:policyInsrdTailorPremEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyInsrdTailorPremEntitydata.getChildKey())){
				if(policyInsrdTailorPremEntitydata.getAction().equalsIgnoreCase("verify") && policyInsrdTailorPremEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestTailorPremiumDetailsTF policyInsuredIntrestTailorPremiumDetailsTFPage=new PolicyInsuredIntrestTailorPremiumDetailsTF(driver, "Policy Insured Atttributes Tailor Premium Details Page", 0);
					policyInsuredIntrestTailorPremiumDetailsTFPage.fillandsubmitPolicyInsuredIntrestTailorPremiumDetailsTF(policyInsrdTailorPremEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyInsrdTailorPremEntitydata);
				}
			}
		}
	}

	// TG Sachin
	public void policyInsAtttrSpecialConditionsTGTFEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Special Conditions TG TF Page </i></B>");
		List<PolInsurSplConditnTFTGEntity> polInsurSplConditnTFTGEntityList=testData.getPolInsurSplConditnTFTGEntityRecords();
		for(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntitydata:polInsurSplConditnTFTGEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsurSplConditnTFTGEntitydata.getChildKey())){
				if(polInsurSplConditnTFTGEntitydata.getAction().equalsIgnoreCase("edit")||polInsurSplConditnTFTGEntitydata.getAction().equalsIgnoreCase("add") && polInsurSplConditnTFTGEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemSpecialConditionsTGTF policyMemSpecialConditionsTGTFPage=new PolicyMemSpecialConditionsTGTF(driver, "Special Conditions TG TF Page", 0);
					policyMemSpecialConditionsTGTFPage.fillandsubmitPolicyMemSpecialConditionsTGTF(polInsurSplConditnTFTGEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsurSplConditnTFTGEntitydata);
				}
			}
		}
	}
	public void policyInsAtttrSpecialConditionsTGTFVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Special Conditions TG TF Page </i></B>");
		List<PolInsurSplConditnTFTGEntity> polInsurSplConditnTFTGEntityList=testData.getPolInsurSplConditnTFTGEntityRecords();
		for(PolInsurSplConditnTFTGEntity polInsurSplConditnTFTGEntitydata:polInsurSplConditnTFTGEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsurSplConditnTFTGEntitydata.getChildKey())){
				if(polInsurSplConditnTFTGEntitydata.getAction().equalsIgnoreCase("verify") && polInsurSplConditnTFTGEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemSpecialConditionsTGTF policyMemSpecialConditionsTGTFPage=new PolicyMemSpecialConditionsTGTF(driver, "Special Conditions TG TF Page", 0);
					policyMemSpecialConditionsTGTFPage.fillPolicyMemSpecialConditionsTGTF(polInsurSplConditnTFTGEntitydata, assertReference);
					testData.updateRecordsForCriteria(polInsurSplConditnTFTGEntitydata);
				}
			}
		}
	}
	//--------------TG------------------------//

	//---------------PZ-----------------//
	public void policyMemberAttributeBalancePremiumForPZVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Balance Premium for PZ </i></B>");
		List<BalancePremiumEntity> balancePremiumEntityList=testData.getBalancePremiumEntity();
		for(BalancePremiumEntity balancePremiumEntitydata:balancePremiumEntityList){
			if(balancePremiumEntitydata.getAction().equalsIgnoreCase("verify") && balancePremiumEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyInsuredInterestAtrributeBalancePremium policyInsuredInterestAtrributeBalancePremiumpage=new PolicyInsuredInterestAtrributeBalancePremium(driver, "Balance Premium for PZ");
				policyInsuredInterestAtrributeBalancePremiumpage.fillandSubmitPolicyAtrributeBalancePremiumDetails(balancePremiumEntitydata, assertReference);
				testData.updateRecordsForCriteria(balancePremiumEntitydata);
			}
		}
	}


	//---------------FM StartDateForMemberHelper -----------------//
	public void policyMemberStartDateForMemberHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Start date for member </i></B>");
		List<PolMemStrtDateForMemEntity> polMemStrtDateForMemEntityList=testData.getPolMemStrtDateForMemEntity();
		for(PolMemStrtDateForMemEntity polMemStrtDateForMemEntityData:polMemStrtDateForMemEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polMemStrtDateForMemEntityData.getChildKey())){
				if((polMemStrtDateForMemEntityData.getAction().equalsIgnoreCase("edit")||polMemStrtDateForMemEntityData.getAction().equalsIgnoreCase("add"))&& polMemStrtDateForMemEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemStartDateForMember policyMemStartDateForMemberpage=new PolicyMemStartDateForMember(driver, "Policy Mem Start Date For Member");
					policyMemStartDateForMemberpage.fillandsubmitPolicyMemStartDateForMember(polMemStrtDateForMemEntityData, assertReference);
					testData.updateRecordsForCriteria(polMemStrtDateForMemEntityData);
				}
			}
		}
	}
	//--------------------------SC------------------//
	public void policyAttributeClaimFreeYearsVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Free Years </i></B>");
		List<PolicyClaimFreeYearsEntity> policyClaimFreeYearsEntityList=testData.getPolicyClaimFreeYearsEntity();
		for(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntitydata:policyClaimFreeYearsEntityList){
			if(policyClaimFreeYearsEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyAttributeClaimFreeYears PolicyAttributeClaimFreeYears=new PolicyAttributeClaimFreeYears(driver, "Optional TPA Rule page");
				PolicyAttributeClaimFreeYears.fillandSubmitPolicyAttibutesPolicyFourClaimFreeYears(policyClaimFreeYearsEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyClaimFreeYearsEntitydata);
			}
		}
	}
	//-----------------------JA-----------------------//
	public void policyMemberAttributeGroupDetailsEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Attribute Next Group Page </i></B>");
		List<PolicyMemberAttrGroupEntity> policyMemberAttrGroupEntityList=testData.getPolicyMemberAttributesGroupNumberEntity();
		for(PolicyMemberAttrGroupEntity policyMemberAttrGroupEntityData:policyMemberAttrGroupEntityList){

			if(policyMemberAttrGroupEntityData.getAction().equalsIgnoreCase("edit")||policyMemberAttrGroupEntityData.getAction().equalsIgnoreCase("add")){
				PolicyMemberAttributesNextGroupPage policyMemberAttributeNextGroupPage=new PolicyMemberAttributesNextGroupPage(driver, "Policy Member Attribute Next Group Page");
				policyMemberAttributeNextGroupPage.fillAndProceedPolicyMemberAttributesNextGroupPage(policyMemberAttrGroupEntityData, assertReference);
				testData.updateRecordsForCriteria(policyMemberAttrGroupEntityData);
			}
		}
	}
	//--------------------------TI--JM---------------------//
	public void policyMemberAttributeCoPaymentDetailsEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity ) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Attribute CoPayment Details </i></B>");
		List<PolicyMemCoPaymentSCEntity> policyMemCoPaymentSCEntityList=testData.getPolicyMemCoPaymentSCEntity();
		for(PolicyMemCoPaymentSCEntity policyMemCoPaymentSCEntityData:policyMemCoPaymentSCEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemCoPaymentSCEntityData.getChildKey())){
				if((policyMemCoPaymentSCEntityData.getAction().equalsIgnoreCase("edit")||policyMemCoPaymentSCEntityData.getAction().equalsIgnoreCase("add"))&& policyMemCoPaymentSCEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemberCoPaymentSC policyMemberCoPaymentSCPage=new PolicyMemberCoPaymentSC(driver, "Policy Member Attribute CoPayment Details");
					policyMemberCoPaymentSCPage.fillandsubmitMemberCoPaymentSC(policyMemCoPaymentSCEntityData, assertReference);
					testData.updateRecordsForCriteria(policyMemCoPaymentSCEntityData);
				}
			}
		}
	}

	public void policyMemberAttributePreExistingDiseaseAtRenewEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity ) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Attribute PreExisting Disease At Renew Details </i></B>");
		List<PolMemPreExstngDisesEntity> polMemPreExstngDisesEntityList=testData.getPolMemPreExstngDisesEntity();
		for(PolMemPreExstngDisesEntity polMemPreExstngDisesEntityData:polMemPreExstngDisesEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polMemPreExstngDisesEntityData.getChildKey())){
				if((polMemPreExstngDisesEntityData.getAction().equalsIgnoreCase("edit")||polMemPreExstngDisesEntityData.getAction().equalsIgnoreCase("add"))&& polMemPreExstngDisesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyMemPreExistingDiseaseatRenew policyMemPreExistingDiseaseatRenewPage=new PolicyMemPreExistingDiseaseatRenew(driver, "Policy Member Attribute PreExisting Disease At Renew Details");
					policyMemPreExistingDiseaseatRenewPage.fillandsubmitMedicalCheckUpDetails(polMemPreExstngDisesEntityData, assertReference);
					testData.updateRecordsForCriteria(polMemPreExstngDisesEntityData);
				}
			}
		}
	}

	public void policyMemberAttributePreExistingDiseaseAtRenewVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Attribute PreExisting Disease At Renew Details </i></B>");
		List<PolMemPreExstngDisesEntity> polMemPreExstngDisesEntityList=testData.getPolMemPreExstngDisesEntity();
		for(PolMemPreExstngDisesEntity polMemPreExstngDisesEntityData:polMemPreExstngDisesEntityList){
			if(polMemPreExstngDisesEntityData.getAction().equalsIgnoreCase("verify")){
				PolicyMemPreExistingDiseaseatRenew policyMemPreExistingDiseaseatRenewPage=new PolicyMemPreExistingDiseaseatRenew(driver, "Policy Member Attribute PreExisting Disease At Renew Details");
				policyMemPreExistingDiseaseatRenewPage.fillandsubmitMedicalCheckUpDetails(polMemPreExstngDisesEntityData, assertReference);
				testData.updateRecordsForCriteria(polMemPreExstngDisesEntityData);
			}
		}
	}

	public void policyInsuredInterestEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);


					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);

					}
					//TODO Done
					///*********** Attribute in member Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										if(policyMemberDetailsEntityListData.getStringValueForField("MemberCode").equalsIgnoreCase("STDRSK")|| policyMemberDetailsEntityListData.getStringValueForField("InsuredInterestType").equalsIgnoreCase("STDRSK")){

											if(memberAttributesEntityData.getBooleanValueForField("ConfigBalancePremiumForPZPage")){
												policyMemberAttributeBalancePremiumForPZEditHelper(testData, executionTestStep, assertReference, driver);
											}
											//-------------------------TG--------------------------//
											if(memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsForSTDRiskPage")){
												policyInsAtttrRiskDetailsForSTDRiskEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											// TG Sachin
											if(memberAttributesEntityData.getBooleanValueForField("ConfigBasicPrem123Page")){
												policyInsAtttrBasicPrem123EditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingDiscountOptionPage")){
												policyInsAtttrLodingDiscountOptionEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingAmbulancePage")){
												policyInsAtttrLoadingAmbulanceEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigTailorPremiumDetailsPage")){
												policyInsAtttrTailorPremiumDetailsEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigSpecialConditionsTGTFPage")){
												policyInsAtttrSpecialConditionsTGTFEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
											//-------------------------TG--------------------------//
										}

										/*****Attribute in Member Details  attribute Page after Click on proceed**********/
										if (!policyMemberDetailsEntityListData.getStringValueForField("MemberCode").equalsIgnoreCase("STDRSK")) {
											if(!(policyMemberDetailsEntityListData.getStringValueForField("Product").equalsIgnoreCase("GH")||policyMemberDetailsEntityListData.getStringValueForField("Product").equalsIgnoreCase("MU"))){
												int rowcount=0;
												List<PolicyMemberAttributeEntity> policyMemberAttributeEntityList=testData.getPolMemberAttributeRecords();
												for(PolicyMemberAttributeEntity policyMemberAttributeEntityData:policyMemberAttributeEntityList){
													if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberAttributeEntityData.getChildKey())){
														if((policyMemberAttributeEntityData.getAction().equalsIgnoreCase("add")|| policyMemberAttributeEntityData.getAction().equalsIgnoreCase("edit")) && policyMemberAttributeEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
															PolicyMemberAttributeHealth policyMemberAttributeHealth= new PolicyMemberAttributeHealth(driver, "Policy Member Atrribute health ",rowcount);
															policyMemberAttributeHealth.fillandSubmitPolicyMemberAttribute(policyMemberAttributeEntityData, assertReference);
															testData.updateRecordsForCriteria(policyMemberAttributeEntityData);
															rowcount++;
															if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigIMJourneyDetailsPZPage")){
																//policyMemberAttributeIMJourneyDetailsPZEditHelper(testData, executionTestStep, assertReference, driver);
															}
														}
													}
												}
											}
											else if (memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsMUT1PLRPage")){
												policyGHT1PLRMemberPageHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);

											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//************************* Member Attach Coverage Page  *********************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	testData.updateRecordsForCriteria(policyMemberCoverageDEntityyData);

																}
															}
														}
														/**********************************Policy Memeber premium page End**************************/
													}

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	public void policyInsuredInterestVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);
					///*************Policy Member Details  Verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);


						///*********** Attribute in member Details ******************** 

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
							List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
							for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
									if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify") && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
										policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
										if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
											/*****Attribute in Member Details  attribute Page after Click on proceed**********/
											//*********************************PZ*********************************************//
											if(policyMemberDetailsEntityListData.getStringValueForField("MemberCode").equalsIgnoreCase("STDRSK")){
												if(memberAttributesEntityData.getBooleanValueForField("ConfigBalancePremiumForPZPage")){
													policyMemberAttributeBalancePremiumForPZVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
												}
											}
											//---------------------------------TG--------------------------//
											if(memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsForSTDRiskPage")){
												policyInsAtttrRiskDetailsForSTDRiskVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											//TF TG Sonali
											if(memberAttributesEntityData.getBooleanValueForField("ConfigBasicPrem123Page")){
												policyInsAtttrBasicPrem123VerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingDiscountOptionPage")){
												policyInsAtttrLodingDiscountOptionVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigLoadingAmbulancePage")){
												policyInsAtttrLoadingAmbulanceVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigTailorPremiumDetailsPage")){
												policyInsAtttrTailorPremiumDetailsVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											if(memberAttributesEntityData.getBooleanValueForField("ConfigSpecialConditionsTGTFPage")){
												policyInsAtttrSpecialConditionsTGTFVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity, stepGroup);
											}
											//-------------------------TG--------------------------//

											if (!policyMemberDetailsEntityListData.getStringValueForField("MemberCode").equalsIgnoreCase("STDRSK")) {
												if(!(policyMemberDetailsEntityListData.getStringValueForField("Product").equalsIgnoreCase("GH")||policyMemberDetailsEntityListData.getStringValueForField("Product").equalsIgnoreCase("MU"))){
													List<PolicyMemberAttributeEntity> policyMemberAttributeEntityList=testData.getPolMemberAttributeRecords();
													int rowcount=0;
													for(PolicyMemberAttributeEntity policyMemberAttributeEntityData:policyMemberAttributeEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberAttributeEntityData.getChildKey())){
															if(policyMemberAttributeEntityData.getAction().equalsIgnoreCase("verify")&& policyMemberAttributeEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyMemberAttributeHealth policyMemberAttributeHealth= new PolicyMemberAttributeHealth(driver, "Policy Member Atrribute health ",rowcount);
																policyMemberAttributeHealth.fillandSubmitPolicyMemberAttribute(policyMemberAttributeEntityData, assertReference);
																rowcount++;
																if(policyMemberAttributeEntityData.getBooleanValueForField("ConfigIMJourneyDetailsPZPage")){
																	policyMemberAttributeIMJourneyDetailsPZVerifyHelper(testData, executionTestStep, assertReference, driver);
																}
															}
														}
													}
												}
												else if (memberAttributesEntityData.getBooleanValueForField("ConfigRiskDetailsMUT1PLRPage")){
													policyGHT1PLRMemberPageVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);

												}

											}
										}
									}
								}
							}
						}

						/************************AttributeEnd**********/
						//********************************* Member Attach Coverage Page  ************************//

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
							List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
							for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && (policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
										PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
										policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
										/********************Insured interset coverage  page End***********/ 
										/********************Policy Memeber coverage Details Page starts****************/
										if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")){
											List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
											for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
													if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
														policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
														/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
														/****************attach Coverage Attribute Start***********/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
															List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
															for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																	if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify")){
																		PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																		policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	}
																}
															}
														}
														/****************attach Coverage Attribute End***********/
														/************************Policy Member premium page start***********************/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);

																	}
																}
															}
														}

														/**********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//***************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//---------------FM StartDateForMemberVerifyHelper -----------------//
	public void policyMemberStartDateForMemberVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Start date for member </i></B>");
		List<PolMemStrtDateForMemEntity> polMemStrtDateForMemEntityList=testData.getPolMemStrtDateForMemEntity();
		for(PolMemStrtDateForMemEntity polMemStrtDateForMemEntityData:polMemStrtDateForMemEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polMemStrtDateForMemEntityData.getChildKey())){
				if(polMemStrtDateForMemEntityData.getAction().equalsIgnoreCase("verify")){
					PolicyMemStartDateForMember policyMemStartDateForMemberpage=new PolicyMemStartDateForMember(driver, "Policy Mem Start Date For Member");
					policyMemStartDateForMemberpage.fillandsubmitPolicyMemStartDateForMember(polMemStrtDateForMemEntityData, assertReference);
					testData.updateRecordsForCriteria(polMemStrtDateForMemEntityData);
				}
			}
		}
	}
	//---------------GH Policy GH T1 PLR Member Page Helper-----------------//
	public void policyGHT1PLRMemberPageHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy GHT1PLR Member Page Helper</i></B>");
		List<PolGHT1PLRMemberEntity> polGHT1PLRMemberEntityList=testData.getPolGHT1PLRMemberEntities();
		for(PolGHT1PLRMemberEntity polGHT1PLRMemberEntityData:polGHT1PLRMemberEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polGHT1PLRMemberEntityData.getChildKey())){
				if((polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("edit")||polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("add"))&& polGHT1PLRMemberEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){	
					PolGHT1PLRMemberPage polGHT1PLRMemberPage=new PolGHT1PLRMemberPage(driver, "Policy GH T1 PLR Member Page");
					polGHT1PLRMemberPage.fillandSubmitPolGHT1PLRMember(polGHT1PLRMemberEntityData, assertReference);
					testData.updateRecordsForCriteria(polGHT1PLRMemberEntityData);
					FrameworkServices.logMessage("<B><i> Executing:: Policy GH T2 PLR Member Page Helper</i></B>");
					List<PolGHT2PLRMemberEntity> polGHT2PLRMemberEntityList=testData.getPolGHT2PLRMemberEntities();
					for(PolGHT2PLRMemberEntity polGHT2PLRMemberEntityData:polGHT2PLRMemberEntityList){
						if(policyEntity.getParentKey().equalsIgnoreCase(polGHT2PLRMemberEntityData.getChildKey())){
							if((polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("edit")||polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("add"))&& polGHT2PLRMemberEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolGHT2PLRMemberPage polGHT2PLRMemberPage=new PolGHT2PLRMemberPage(driver, "Policy GH T2 PLR Member Page");
								polGHT2PLRMemberPage.fillandSubmitPolGHT2PLRMember(polGHT2PLRMemberEntityData, assertReference);
								testData.updateRecordsForCriteria(polGHT2PLRMemberEntityData);
							}
						}
					}
				}
			}
		}
	}



	public void policyAttributeProvisionalVerifyPolicyDetails (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details </i></B>");
		List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
		for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
			if(provisionalPolDetailEntityData.getAction().equalsIgnoreCase("verify")&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
				policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
				testData.updateRecordsForCriteria(provisionalPolDetailEntityData);
			}
		}
	}

	public void policyAttributePersonalAccidentEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAtrPersnalAcidentEntity>  policyAttributePersonalAccidentList=testData.getPolAtrPersnalAcidentEntityRecords();
						for(PolAtrPersnalAcidentEntity policyAttributePersonalAccidentListData :policyAttributePersonalAccidentList ){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributePersonalAccidentListData.getChildKey())){
								if((policyAttributePersonalAccidentListData.getAction().equalsIgnoreCase("add")||policyAttributePersonalAccidentListData.getAction().equalsIgnoreCase("edit")) && policyAttributePersonalAccidentListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributePersonalAccident policyAttributePersonalAccident=new PolicyAttributePersonalAccident(driver, "Policy Details");
									policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
									if(policyAttributeEntityListData.getBooleanValueForField("ConfigInstallmentFacilityPage")){
										policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
									}
									policyAttributePersonalAccident.fillandSubmitPolicyAttributePersonalAccident(policyAttributePersonalAccidentListData, assertReference);
									if(	policyAttributePersonalAccidentListData.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeEntityListData.getBooleanValueForField("ConfigPolicyDetailsTwoPU")){
											policyDetails2PUEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
										}

										List<PolAttPolHistoryforPUEntity>  polAttPolHistoryforPUEntityList=testData.getPolAttPolHistoryforPUEntityRecords();
										for(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntityListData :polAttPolHistoryforPUEntityList ){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributePersonalAccidentListData.getChildKey())){
												if((polAttPolHistoryforPUEntityListData.getAction().equalsIgnoreCase("add")||polAttPolHistoryforPUEntityListData.getAction().equalsIgnoreCase("edit")) && polAttPolHistoryforPUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributePolicyHistoryforPUPersonalAccident policyAttributePolicyHistoryforPUPersonalAccident =new PolicyAttributePolicyHistoryforPUPersonalAccident(driver, "Policy History for PU");
													policyAttributePolicyHistoryforPUPersonalAccident.fillandSubmitPolicyHistoryForPU(polAttPolHistoryforPUEntityListData, assertReference);
													if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigNextButton")){
														if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigBreakInInsuranceForPU")){
															breakInInsuranceForPUEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
														}
														/*	List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
														for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
																if((policyBreakInInsuranceData.getAction().equalsIgnoreCase("add")|| policyBreakInInsuranceData.getAction().equalsIgnoreCase("edit")) && policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
																	policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
																	if(policyBreakInInsuranceData.getBooleanValueForField("ConfigForwordButton")){*/
														if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigProvisionalPolDetailForPU")){
															provisionalPolDetailForPUEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
														}

														List<ProvisionalPolDetailEntity>  provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
														for(ProvisionalPolDetailEntity provisionalPolDetailEntityListData: provisionalPolDetailEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityListData.getChildKey())){
																if((provisionalPolDetailEntityListData.getAction().equalsIgnoreCase("add")|| provisionalPolDetailEntityListData.getAction().equalsIgnoreCase("edit")) && provisionalPolDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage =new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Provisional Policy Details");
																	policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityListData, assertReference);
																	if(provisionalPolDetailEntityListData.getBooleanValueForField("ConfigForwordButton")){

																		List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																		for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																				if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																					policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																					if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																						List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																						for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																								if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																									policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																								}		
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void  policyInsuredIntrestPersonalAccidentEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}
					//TODO Done
					///*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										//-----------------------------------------------PH-----------------------------------------------------------------//
										if(memberAttributesEntityData.getBooleanValueForField("ConfigPHT1PLRMember")){
											pHT1PLRMemberEditHelper(testData, executionTestStep, assertReference, driver);
										}
										//-----------------------------------------------PX-----------------------------------------------------------------//
										if(memberAttributesEntityData.getBooleanValueForField("ConfigInsureAttrForPX")){
											polInsIntAttributeForPXEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
											//-----------------------------------------------PU-------------------------------------------------------------------//
										}
										if(memberAttributesEntityData.getBooleanValueForField("ConfigInsureAttrForPU")){
											polInsIntAttributeForPUEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
										}
										List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
										for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
												if((policyBreakInInsuranceData.getAction().equalsIgnoreCase("add")|| policyBreakInInsuranceData.getAction().equalsIgnoreCase("edit")) && policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
													policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}



					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getBooleanValueForField("ConfigSearchCoverageCode")){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<PolInsrIntCovrDetlPUPAEntity> polInsrIntCovrDetlPUPAEntityList=testData.getpolInsrIntCovrDetlPUPAEntityRecords();
																		for(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntityListData: polInsrIntCovrDetlPUPAEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsrIntCovrDetlPUPAEntityListData.getChildKey())){
																				if(polInsrIntCovrDetlPUPAEntityListData.getAction().equalsIgnoreCase("add")|| polInsrIntCovrDetlPUPAEntityListData.getAction().equalsIgnoreCase("edit") && polInsrIntCovrDetlPUPAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestCoverDetailsPUPersonalAccident policyInsuredIntrestCoverDetailsPUPersonalAccident=new PolicyInsuredIntrestCoverDetailsPUPersonalAccident(driver,"Policy Member AttachCoverages Attribute");
																					policyInsuredIntrestCoverDetailsPUPersonalAccident.fillandSubmitInsuredIntClaimRiskDetails1(polInsrIntCovrDetlPUPAEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);

																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}	
		}
	}


	public void  policyAttributePersonalAccidentVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Verify Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
				policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
				/************Click on proceed when add************/
				//*************Policy Attribute After Proceed*************************//
				if(policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
					List<PolAtrPersnalAcidentEntity>  policyAttributePersonalAccidentList=testData.getPolAtrPersnalAcidentEntityRecords();
					for(PolAtrPersnalAcidentEntity policyAttributePersonalAccidentListData :policyAttributePersonalAccidentList ){
						if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributePersonalAccidentListData.getChildKey())){
							if((policyAttributePersonalAccidentListData.getAction().equalsIgnoreCase("verify")) && policyAttributePersonalAccidentListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyAttributePersonalAccident policyAttributePersonalAccident=new PolicyAttributePersonalAccident(driver, "Policy Details");
								policyAttributePersonalAccident.fillandSubmitPolicyAttributePersonalAccident(policyAttributePersonalAccidentListData, assertReference);
								if(	policyAttributePersonalAccidentListData.getBooleanValueForField("ConfigForwordButton")){
									if(policyAttributeEntityListData.getBooleanValueForField("ConfigPolicyDetailsTwoPU")){
										policyDetails2PUVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
									}
									List<PolAttPolHistoryforPUEntity>  polAttPolHistoryforPUEntityList=testData.getPolAttPolHistoryforPUEntityRecords();
									for(PolAttPolHistoryforPUEntity polAttPolHistoryforPUEntityListData :polAttPolHistoryforPUEntityList ){
										if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributePersonalAccidentListData.getChildKey())){
											if((polAttPolHistoryforPUEntityListData.getAction().equalsIgnoreCase("verify")) && polAttPolHistoryforPUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												PolicyAttributePolicyHistoryforPUPersonalAccident policyAttributePolicyHistoryforPUPersonalAccident =new PolicyAttributePolicyHistoryforPUPersonalAccident(driver, "Policy History for PU");
												policyAttributePolicyHistoryforPUPersonalAccident.fillandSubmitPolicyHistoryForPU(polAttPolHistoryforPUEntityListData, assertReference);
												if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigNextButton")){

													if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigBreakInInsuranceForPU")){
														breakInInsuranceForPUVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
													}
													if(polAttPolHistoryforPUEntityListData.getBooleanValueForField("ConfigProvisionalPolDetailForPU")){
														provisionalPolDetailForPUVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
													}

													List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
													for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
															if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
																	List<PolAttrPUAddOnCoverageEntity>  polAttrPUAddOnCoverageEntityList=testData.getPolAttrPUAddOnCoverageEntityRecords();
																	for(PolAttrPUAddOnCoverageEntity polAttrPUAddOnCoverageEntityListData: polAttrPUAddOnCoverageEntityList){
																		if(policyEntity.getParentKey().equalsIgnoreCase(polAttrPUAddOnCoverageEntityListData.getChildKey())){
																			if((polAttrPUAddOnCoverageEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrPUAddOnCoverageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolicyAttributePUAddoncoveragePersonalAccident policyAttributePUAddoncoveragePersonalAccident =new PolicyAttributePUAddoncoveragePersonalAccident(driver, "PU Add on coverage");
																				policyAttributePUAddoncoveragePersonalAccident.fillandSubmitPolAttrPUAddOnCoverage(polAttrPUAddOnCoverageEntityListData, assertReference);
																				if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
																					List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																					for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																						if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																							if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																								policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																							}
																						}
																					}
																				}	
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}








	public void  policyInsuredIntrestPersonalAccidentVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									/*List<PolInsIntINDRiskDetPUEntity> polInsIntINDRiskDetPUEntityList=testData.getPolInsIntINDRiskDetPUEntityRecords();
										for(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntityListData: polInsIntINDRiskDetPUEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntINDRiskDetPUEntityListData.getChildKey())){
												if((polInsIntINDRiskDetPUEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntINDRiskDetPUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident=new PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(driver, "INDIVIDUAL Risk Details", 0);
													policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident.fillandSubmitPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(polInsIntINDRiskDetPUEntityListData, assertReference);
													if(polInsIntINDRiskDetPUEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<PolInsrXssDscPUPerAcdtEntity> polInsrXssDscPUPerAcdtEntityList=testData.getPolInsrXssDscPUPerAcdtEntityRecords();
														for(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntityListData: polInsrXssDscPUPerAcdtEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsrXssDscPUPerAcdtEntityListData.getChildKey())){
																if((polInsrXssDscPUPerAcdtEntityListData.getAction().equalsIgnoreCase("verify")) && polInsrXssDscPUPerAcdtEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident=new PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(driver, "Xcess, Loading & Disc Details");
																	policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident.fillandSubmitPolicyAttributePersonalAccident(polInsrXssDscPUPerAcdtEntityListData, assertReference);
																	if(polInsrXssDscPUPerAcdtEntityListData.getBooleanValueForField("ConfigForwardButton")){
									 */
									if(memberAttributesEntityData.getBooleanValueForField("ConfigPHT1PLRMember")){
										pHT1PLRMemberVerifyHelper(testData, executionTestStep, assertReference, driver);
									}
									if(memberAttributesEntityData.getBooleanValueForField("ConfigInsureAttrForPX")){
										polInsIntAttributeForPXVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
										//-----------------------------------------------PU-------------------------------------------------------------------//
									}
									if(memberAttributesEntityData.getBooleanValueForField("ConfigInsureAttrForPU")){
										polInsIntAttributeForPUVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
									}


									List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
									for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
										if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
											if((policyBreakInInsuranceData.getAction().equalsIgnoreCase("verify")) && policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
												PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
												policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
											}
										}
									}
								}
							}
						}
					}



					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getBooleanValueForField("ConfigSearchCoverageCode")){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<PolInsrIntCovrDetlPUPAEntity> polInsrIntCovrDetlPUPAEntityList=testData.getpolInsrIntCovrDetlPUPAEntityRecords();
																		for(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntityListData: polInsrIntCovrDetlPUPAEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsrIntCovrDetlPUPAEntityListData.getChildKey())){
																				if(polInsrIntCovrDetlPUPAEntityListData.getAction().equalsIgnoreCase("verify") && polInsrIntCovrDetlPUPAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestCoverDetailsPUPersonalAccident policyInsuredIntrestCoverDetailsPUPersonalAccident=new PolicyInsuredIntrestCoverDetailsPUPersonalAccident(driver,"Policy Member AttachCoverages Attribute");
																					policyInsuredIntrestCoverDetailsPUPersonalAccident.fillandSubmitInsuredIntClaimRiskDetails1(polInsrIntCovrDetlPUPAEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);

																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

			}
		}
	}

	/*------------------------------------------------PU------------------------------------------------------------*/
	public void policyDetails2PUEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Details 2 for PU</i></B>");
		List<PolAttrPolDetails2PUEntity> polAttrPolDetails2PUEntityList=testData.getPolAttrPolDetails2PUEntityRecords();
		for(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntitydata:polAttrPolDetails2PUEntityList){
			if((polAttrPolDetails2PUEntitydata.getAction().equalsIgnoreCase("edit")||polAttrPolDetails2PUEntitydata.getAction().equalsIgnoreCase("add")) && polAttrPolDetails2PUEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttributePolicyDetails2PUPersonalAccident policyAttributePolicyDetails2PUPersonalAccident=new PolicyAttributePolicyDetails2PUPersonalAccident(driver, "Policy Attribute Policy Details 2 ");
				policyAttributePolicyDetails2PUPersonalAccident.fillandSubmitPolicyAttrQuotDetail(polAttrPolDetails2PUEntitydata, assertReference);
				testData.updateRecordsForCriteria(polAttrPolDetails2PUEntitydata);
			}
		}
	}

	public void breakInInsuranceForPUEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Break In Insurance for PU</i></B>");
		List<PolicyBreakInInsuranceEntity> policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
		for(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntitydata:policyBreakInInsuranceEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceEntitydata.getChildKey())){
				if(policyBreakInInsuranceEntitydata.getAction().equalsIgnoreCase("edit")||policyBreakInInsuranceEntitydata.getAction().equalsIgnoreCase("add") && policyBreakInInsuranceEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Attribute Break In Insurance");
					policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceEntitydata, assertReference);
					testData.updateRecordsForCriteria(policyBreakInInsuranceEntitydata);
				}
			}
		}
	}

	public void provisionalPolDetailForPUEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
		for(ProvisionalPolDetailEntity provisionalPolDetailEntitydata:provisionalPolDetailEntityList){
			if((provisionalPolDetailEntitydata.getAction().equalsIgnoreCase("edit")||provisionalPolDetailEntitydata.getAction().equalsIgnoreCase("add")) && provisionalPolDetailEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Provisional Policy Details for PU");
				policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntitydata, assertReference);
				testData.updateRecordsForCriteria(provisionalPolDetailEntitydata);
			}
		}
	}

	public void polInsIntAttributeForPXEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		int rowcount= 0;
		//-------------------------------------------Risk details T1-PLR------------------------------------------------------------------------------//
		List<PolInsureAttRiskDetailEntity> polInsureAttRiskDetailEntityList=testData.getPolInsureAttRiskDetailEntityRecords();
		for(PolInsureAttRiskDetailEntity polInsureAttRiskDetailEntitydata:polInsureAttRiskDetailEntityList){
			if(polInsureAttRiskDetailEntitydata.getAction().equalsIgnoreCase("edit")||polInsureAttRiskDetailEntitydata.getAction().equalsIgnoreCase("add") && polInsureAttRiskDetailEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyInsuredIntrestRiskDetailsT1PLRPersonalAccident policyInsuredIntrestRiskDetailsT1PLRPersonalAccident=new PolicyInsuredIntrestRiskDetailsT1PLRPersonalAccident(driver, "Risk details T1-PLR");
				policyInsuredIntrestRiskDetailsT1PLRPersonalAccident.fillandSubmitRiskDetailsT1PLR(polInsureAttRiskDetailEntitydata, assertReference);
				testData.updateRecordsForCriteria(polInsureAttRiskDetailEntitydata);

				//-------------------------------------------Group Name for PU---------------------------------------------------------------------------------//
				List<PolInsureAttrGrpNamePAEntity> polInsureAttrGrpNamePAEntityList=testData.getPolInsureAttrGrpNamePAEntityRecords();
				for(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntitydata:polInsureAttrGrpNamePAEntityList){
					if(polInsureAttrGrpNamePAEntitydata.getAction().equalsIgnoreCase("edit")||polInsureAttrGrpNamePAEntitydata.getAction().equalsIgnoreCase("add") && polInsureAttrGrpNamePAEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyInsuredAttrGroupNamedDetailsPersonalAccident policyInsuredAttrGroupNamedDetailsPersonalAccident=new PolicyInsuredAttrGroupNamedDetailsPersonalAccident(driver, "Group Name for PU", rowcount);
						policyInsuredAttrGroupNamedDetailsPersonalAccident.fillandSubmitGroupNamedDetails(polInsureAttrGrpNamePAEntitydata, assertReference);
						testData.updateRecordsForCriteria(polInsureAttrGrpNamePAEntitydata);
						rowcount++;
						//---------------------------------------------Special Condition-------------------------------------------------------------------------------------------//
						List<PolInsureSpeclCondtnPAEntity> polInsureSpeclCondtnPAEntityList=testData.getPolInsureSpeclCondtnPAEntityRecords();
						for(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntitydata:polInsureSpeclCondtnPAEntityList){
							if(polInsureSpeclCondtnPAEntitydata.getAction().equalsIgnoreCase("edit")||polInsureSpeclCondtnPAEntitydata.getAction().equalsIgnoreCase("add") && polInsureSpeclCondtnPAEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyInsuredInterestSpecialConditionsPersonalAccident policyInsuredInterestSpecialConditionsPersonalAccident=new PolicyInsuredInterestSpecialConditionsPersonalAccident(driver, "Special comdition for PX");
								policyInsuredInterestSpecialConditionsPersonalAccident.fillandSubmitPolicyInsuredSpecialConditionsPA(polInsureSpeclCondtnPAEntitydata, assertReference);
								testData.updateRecordsForCriteria(polInsureSpeclCondtnPAEntitydata);

							}
						}
					}
				}
			}
		}
	}
	public void polInsIntAttributeForPUEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		int rowcount= 0;
		List<PolInsIntINDRiskDetPUEntity> polInsIntINDRiskDetPUEntityList=testData.getPolInsIntINDRiskDetPUEntityRecords();
		for(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntityListData: polInsIntINDRiskDetPUEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntINDRiskDetPUEntityListData.getChildKey())){
				if((polInsIntINDRiskDetPUEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntINDRiskDetPUEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntINDRiskDetPUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident=new PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(driver, "INDIVIDUAL Risk Details", 0);
					policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident.fillandSubmitPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(polInsIntINDRiskDetPUEntityListData, assertReference);
					testData.updateRecordsForCriteria(polInsIntINDRiskDetPUEntityListData);
					if(polInsIntINDRiskDetPUEntityListData.getBooleanValueForField("ConfigForwordButton")){
						List<PolInsrXssDscPUPerAcdtEntity> polInsrXssDscPUPerAcdtEntityList=testData.getPolInsrXssDscPUPerAcdtEntityRecords();
						for(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntityListData: polInsrXssDscPUPerAcdtEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polInsrXssDscPUPerAcdtEntityListData.getChildKey())){
								if((polInsrXssDscPUPerAcdtEntityListData.getAction().equalsIgnoreCase("add")|| polInsrXssDscPUPerAcdtEntityListData.getAction().equalsIgnoreCase("edit")) && polInsrXssDscPUPerAcdtEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident=new PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(driver, "Xcess, Loading & Disc Details");
									policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident.fillandSubmitPolicyAttributePersonalAccident(polInsrXssDscPUPerAcdtEntityListData, assertReference);
									testData.updateRecordsForCriteria(polInsrXssDscPUPerAcdtEntityListData);


								}
							}
						}
					}
				}
			}
		}
	}


	public void policyCollectionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Collection  of Policy </i></B>");
		int rowcount=0;
		List<PolicyAccoColleSearchEntity> policyAccoColleSearchEntityList=testData.getPolicyAccoColleSearchEntity();
		for(PolicyAccoColleSearchEntity policyAccoColleSearchEntityData:policyAccoColleSearchEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAccoColleSearchEntityData.getChildKey())){
				if((policyAccoColleSearchEntityData.getAction().equalsIgnoreCase("verify") && policyAccoColleSearchEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyAccountingCollectionSearch policyAccountingCollectionSearchPage=new PolicyAccountingCollectionSearch(driver, "Policy Premium Collection page" );
					policyAccountingCollectionSearchPage.searchButtonPolicyAccountingCollectionSearch(policyAccoColleSearchEntityData);
					policyAccountingCollectionSearchPage.selectSearchCollectionCode(policyAccoColleSearchEntityData);
					testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
					List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
					for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
						if(policyAccoColleSearchEntityData.getParentKey().equalsIgnoreCase(policyPremCollectionEntityData.getChildKey())){
							if(policyPremCollectionEntityData.getAction().equalsIgnoreCase("verify") && policyPremCollectionEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
								policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntityData, assertReference,rowcount);
								testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
								rowcount=++rowcount;
							}
						}
					}
				}
			}
		}
	}
	public void policyDetails2PUVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		List<PolAttrPolDetails2PUEntity>  polAttrPolDetails2PUEntityList=testData.getPolAttrPolDetails2PUEntityRecords();
		for(PolAttrPolDetails2PUEntity polAttrPolDetails2PUEntityListData :polAttrPolDetails2PUEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrPolDetails2PUEntityListData.getChildKey())){
				if((polAttrPolDetails2PUEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrPolDetails2PUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributePolicyDetails2PUPersonalAccident policyAttributePolicyDetails2PUPersonalAccident =new PolicyAttributePolicyDetails2PUPersonalAccident(driver, "Policy Details 2");
					policyAttributePolicyDetails2PUPersonalAccident.fillandSubmitPolicyAttrQuotDetail(polAttrPolDetails2PUEntityListData, assertReference);

				}
			}
		}
	}

	public void breakInInsuranceForPUVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity){
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		List<PolicyBreakInInsuranceEntity>  policyBreakInInsuranceEntityList=testData.getPolicyBreakInInsuranceEntity();
		for(PolicyBreakInInsuranceEntity policyBreakInInsuranceData: policyBreakInInsuranceEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyBreakInInsuranceData.getChildKey())){
				if((policyBreakInInsuranceData.getAction().equalsIgnoreCase("verify")) && policyBreakInInsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeBreakInInsuranceHealth policyAttributeBreakInInsuranceHealthCreatePage=new PolicyAttributeBreakInInsuranceHealth(driver, "Policy Break-in-Insurance");
					policyAttributeBreakInInsuranceHealthCreatePage.fillandSubmitPolicyAttibutesBreakInInsuranceHealth(policyBreakInInsuranceData, assertReference);
				}
			}
		}
	}
	public void provisionalPolDetailForPUVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity){
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");



		List<ProvisionalPolDetailEntity>  provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
		for(ProvisionalPolDetailEntity provisionalPolDetailEntityListData: provisionalPolDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityListData.getChildKey())){
				if((provisionalPolDetailEntityListData.getAction().equalsIgnoreCase("verify")) && provisionalPolDetailEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage =new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Provisional Policy Details");
					policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityListData, assertReference);

				}
			}
		}
	}
	public void polInsIntAttributeForPXVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		int rowcount= 0;
		//----------------------------------------Risk details T1-PLR------------------------------------------------------------------------------//
		List<PolInsureAttRiskDetailEntity> polInsureAttRiskDetailEntityList=testData.getPolInsureAttRiskDetailEntityRecords();
		for(PolInsureAttRiskDetailEntity polInsureAttRiskDetailEntitydata:polInsureAttRiskDetailEntityList){
			if(polInsureAttRiskDetailEntitydata.getAction().equalsIgnoreCase("verify") && polInsureAttRiskDetailEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PolicyInsuredIntrestRiskDetailsT1PLRPersonalAccident policyInsuredIntrestRiskDetailsT1PLRPersonalAccident=new PolicyInsuredIntrestRiskDetailsT1PLRPersonalAccident(driver, "Risk details T1-PLR");
				policyInsuredIntrestRiskDetailsT1PLRPersonalAccident.fillandSubmitRiskDetailsT1PLR(polInsureAttRiskDetailEntitydata, assertReference);
				testData.updateRecordsForCriteria(polInsureAttRiskDetailEntitydata);

				//-------------------------------------------Group Name for PU---------------------------------------------------------------------------------//
				List<PolInsureAttrGrpNamePAEntity> polInsureAttrGrpNamePAEntityList=testData.getPolInsureAttrGrpNamePAEntityRecords();
				for(PolInsureAttrGrpNamePAEntity polInsureAttrGrpNamePAEntitydata:polInsureAttrGrpNamePAEntityList){
					if(polInsureAttrGrpNamePAEntitydata.getAction().equalsIgnoreCase("verify") && polInsureAttrGrpNamePAEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyInsuredAttrGroupNamedDetailsPersonalAccident policyInsuredAttrGroupNamedDetailsPersonalAccident=new PolicyInsuredAttrGroupNamedDetailsPersonalAccident(driver, "Group Name for PU", rowcount);
						policyInsuredAttrGroupNamedDetailsPersonalAccident.fillandSubmitGroupNamedDetails(polInsureAttrGrpNamePAEntitydata, assertReference);
						testData.updateRecordsForCriteria(polInsureAttrGrpNamePAEntitydata);
						rowcount++;
						//---------------------------------------------Special Condition-------------------------------------------------------------------------------------------//
						List<PolInsureSpeclCondtnPAEntity> polInsureSpeclCondtnPAEntityList=testData.getPolInsureSpeclCondtnPAEntityRecords();
						for(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntitydata:polInsureSpeclCondtnPAEntityList){
							if(polInsureSpeclCondtnPAEntitydata.getAction().equalsIgnoreCase("verify") && polInsureSpeclCondtnPAEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyInsuredInterestSpecialConditionsPersonalAccident policyInsuredInterestSpecialConditionsPersonalAccident=new PolicyInsuredInterestSpecialConditionsPersonalAccident(driver, "Special comdition for PX");
								policyInsuredInterestSpecialConditionsPersonalAccident.fillandSubmitPolicyInsuredSpecialConditionsPA(polInsureSpeclCondtnPAEntitydata, assertReference);
								testData.updateRecordsForCriteria(polInsureSpeclCondtnPAEntitydata);

							}
						}
					}
				}
			}
		}
	}
	public void polInsIntAttributeForPUVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details for PU</i></B>");
		int rowcount= 0;
		List<PolInsIntINDRiskDetPUEntity> polInsIntINDRiskDetPUEntityList=testData.getPolInsIntINDRiskDetPUEntityRecords();
		for(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntityListData: polInsIntINDRiskDetPUEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntINDRiskDetPUEntityListData.getChildKey())){
				if((polInsIntINDRiskDetPUEntityListData.getAction().equalsIgnoreCase("verify") && polInsIntINDRiskDetPUEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident=new PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(driver, "INDIVIDUAL Risk Details", 0);
					policyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident.fillandSubmitPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(polInsIntINDRiskDetPUEntityListData, assertReference);
					testData.updateRecordsForCriteria(polInsIntINDRiskDetPUEntityListData);
					if(polInsIntINDRiskDetPUEntityListData.getBooleanValueForField("ConfigForwordButton")){
						List<PolInsrXssDscPUPerAcdtEntity> polInsrXssDscPUPerAcdtEntityList=testData.getPolInsrXssDscPUPerAcdtEntityRecords();
						for(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntityListData: polInsrXssDscPUPerAcdtEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polInsrXssDscPUPerAcdtEntityListData.getChildKey())){
								if((polInsrXssDscPUPerAcdtEntityListData.getAction().equalsIgnoreCase("verify") && polInsrXssDscPUPerAcdtEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
									PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident=new PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(driver, "Xcess, Loading & Disc Details");
									policyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident.fillandSubmitPolicyAttributePersonalAccident(polInsrXssDscPUPerAcdtEntityListData, assertReference);
									testData.updateRecordsForCriteria(polInsrXssDscPUPerAcdtEntityListData);


								}
							}
						}
					}
				}
			}
		}
	}

	////Abhijit
	public void policyPremiumScheduleVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Premium Schedule </i></B>");
		List<PolicyPremiumScheduleEntity> policyPremiumScheduleEntityList=testData.getPolicyPremiumScheduleEntity();
		for(PolicyPremiumScheduleEntity policyPremiumScheduleEntityData:policyPremiumScheduleEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyPremiumScheduleEntityData.getChildKey())){
				if((policyPremiumScheduleEntityData.getAction().equalsIgnoreCase("verify") && policyPremiumScheduleEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyPremiumSchedulePage policyPremiumSchedulePage=new PolicyPremiumSchedulePage(driver, "Policy Premium Schedule Page" );
					policyPremiumSchedulePage.fillAndSubmitPolicyPremiumScheduleDetails(policyPremiumScheduleEntityData, assertReference);
					testData.updateRecordsForCriteria(policyPremiumScheduleEntityData);
				}
			}
		}
	}
	public void policyShowVersionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Show Version Verify </i></B>");
		List<PolicyShowVersionPageEntity> policyShowVersionPageEntityList=testData.getPolicyShowVersionPageEntity();
		for(PolicyShowVersionPageEntity policyShowVersionPageEntityData:policyShowVersionPageEntityList){
			if(policyEntity.getAction().equalsIgnoreCase("verify")&&policyEntity.getStepGroup().equalsIgnoreCase(stepGroup)&&policyEntity.getParentKey().equals(policyShowVersionPageEntityData.getChildKey())){
				PolicyShowVersionPage policyShowVersionPage=new PolicyShowVersionPage(driver, "Policy Show Version Page" );
				PolicyDetailsCreateEditPage policyDetailsCreatePage=new PolicyDetailsCreateEditPage(driver, "Policy Home Page");
				try{
					switchToFrame("display");
				}catch(Exception ex){}					
				policyDetailsCreatePage.clickShowVersion(policyEntity);
				policyShowVersionPage.fillPolicyShowVersionPage(policyShowVersionPageEntityData,assertReference);
				policyDetailsCreatePage.fillPolicyDetails(policyEntity, assertReference);	
				policyDetailsCreatePage.backFromPolicyShowVersion(policyEntity);
				testData.updateRecordsForCriteria(policyShowVersionPageEntityData);



			}
		}
	}

	public void pHT1PLRMemberEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: PH T1-PLR  Member Page Helper</i></B>");
		List<PolGHT1PLRMemberEntity> polGHT1PLRMemberEntityList=testData.getPolGHT1PLRMemberEntities();
		for(PolGHT1PLRMemberEntity polGHT1PLRMemberEntityData:polGHT1PLRMemberEntityList){
			if(polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("edit")||polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("add")){
				PolGHT1PLRMemberPage polGHT1PLRMemberPage=new PolGHT1PLRMemberPage(driver, "Policy GH T1 PLR Member Page");
				polGHT1PLRMemberPage.fillandSubmitPolGHT1PLRMember(polGHT1PLRMemberEntityData, assertReference);
				testData.updateRecordsForCriteria(polGHT1PLRMemberEntityData);
				FrameworkServices.logMessage("<B><i> Executing:: PH T2-PLR  Member Page Helper</i></B>");
				List<PolGHT2PLRMemberEntity> polGHT2PLRMemberEntityList=testData.getPolGHT2PLRMemberEntities();
				for(PolGHT2PLRMemberEntity polGHT2PLRMemberEntityData:polGHT2PLRMemberEntityList){
					if(polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("edit")||polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("add")){
						PolGHT2PLRMemberPage polGHT2PLRMemberPage=new PolGHT2PLRMemberPage(driver, "Policy GH T2 PLR Member Page");
						polGHT2PLRMemberPage.fillandSubmitPolGHT2PLRMember(polGHT2PLRMemberEntityData, assertReference);
						testData.updateRecordsForCriteria(polGHT2PLRMemberEntityData);
					}
				}
			}
		}
	}
	public void pHT1PLRMemberVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: PH T1-PLR  Member Page Helper</i></B>");
		List<PolGHT1PLRMemberEntity> polGHT1PLRMemberEntityList=testData.getPolGHT1PLRMemberEntities();
		for(PolGHT1PLRMemberEntity polGHT1PLRMemberEntityData:polGHT1PLRMemberEntityList){
			if(polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("verify")){
				PolGHT1PLRMemberPage polGHT1PLRMemberPage=new PolGHT1PLRMemberPage(driver, "Policy GH T1 PLR Member Page");
				polGHT1PLRMemberPage.fillandSubmitPolGHT1PLRMember(polGHT1PLRMemberEntityData, assertReference);
				testData.updateRecordsForCriteria(polGHT1PLRMemberEntityData);
				FrameworkServices.logMessage("<B><i> Executing:: PH T2-PLR  Member Page Helper</i></B>");
				List<PolGHT2PLRMemberEntity> polGHT2PLRMemberEntityList=testData.getPolGHT2PLRMemberEntities();
				for(PolGHT2PLRMemberEntity polGHT2PLRMemberEntityData:polGHT2PLRMemberEntityList){
					if(polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("verify")){
						PolGHT2PLRMemberPage polGHT2PLRMemberPage=new PolGHT2PLRMemberPage(driver, "Policy GH T2 PLR Member Page");
						polGHT2PLRMemberPage.fillandSubmitPolGHT2PLRMember(polGHT2PLRMemberEntityData, assertReference);
						testData.updateRecordsForCriteria(polGHT2PLRMemberEntityData);
					}
				}
			}
		}
	}
	public void policyCollectionVerifyHelperForPH(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Collection  of Policy </i></B>");
		int rowcount=0;
		List<PolicyAccoColleSearchEntity> policyAccoColleSearchEntityList=testData.getPolicyAccoColleSearchEntity();
		for(PolicyAccoColleSearchEntity policyAccoColleSearchEntityData:policyAccoColleSearchEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAccoColleSearchEntityData.getChildKey())){
				if((policyAccoColleSearchEntityData.getAction().equalsIgnoreCase("verify") && policyAccoColleSearchEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyAccountingCollectionSearch policyAccountingCollectionSearchPage=new PolicyAccountingCollectionSearch(driver, "Policy Premium Collection page" );
					policyAccountingCollectionSearchPage.searchButtonPolicyAccountingCollectionSearch(policyAccoColleSearchEntityData);
					policyAccountingCollectionSearchPage.selectSearchCollectionCode(policyAccoColleSearchEntityData);
					testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
					List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
					for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
						if(policyAccoColleSearchEntityData.getParentKey().equalsIgnoreCase(policyPremCollectionEntityData.getChildKey())){
							if(policyPremCollectionEntityData.getAction().equalsIgnoreCase("verify") && policyPremCollectionEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
								policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntityData, assertReference,rowcount);
								testData.updateRecordsForCriteria(policyAccoColleSearchEntityData);
								rowcount=++rowcount;
							}
						}
					}
				}
			}
		}
	}

	public void policyCoInsuranceDetailHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Co insurance Details of Policy </i></B>");
		int rowcount=0;
		List<PolicyCoInsurancDetailEntity> policyCoInsurancDetailEntityList=testData.getPolicyCoInsurancDetailEntityRecords();
		for(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntitydata:policyCoInsurancDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyCoInsurancDetailEntitydata.getChildKey())){

				if((policyCoInsurancDetailEntitydata.getAction().equalsIgnoreCase("add") || policyCoInsurancDetailEntitydata.getAction().equalsIgnoreCase("edit") )&& policyCoInsurancDetailEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyCoInsuranceDetailsPage policyCoInsuranceDetailsPage=new PolicyCoInsuranceDetailsPage(driver, "Policy co insurance details page",rowcount);
					policyCoInsuranceDetailsPage.fillandSubmitPolicyCoinsuranceDetails(policyCoInsurancDetailEntitydata, assertReference,testData, rowcount);
					testData.updateRecordsForCriteria(policyCoInsurancDetailEntitydata);
					rowcount=++rowcount;
				}
				testData.updateRecordsForCriteria(policyCoInsurancDetailEntitydata);
				//setDependencyCollectionNumber(policyCoInsurancDetailEntitydata, testData);

			}
		}
	}

	public void policyCoInsuranceDetailverifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Co insurance Details of Policy </i></B>");
		int rowcount=0;
		List<PolicyCoInsurancDetailEntity> policyCoInsurancDetailEntityList=testData.getPolicyCoInsurancDetailEntityRecords();
		for(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntitydata:policyCoInsurancDetailEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyCoInsurancDetailEntitydata.getChildKey())){
				if(policyCoInsurancDetailEntitydata.getAction().equalsIgnoreCase("verify") && policyCoInsurancDetailEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){{
					//rowcount++;
					PolicyCoInsuranceDetailsPage policyCoInsuranceDetailsPage=new PolicyCoInsuranceDetailsPage(driver, "Policy co insurance details page",rowcount);
					policyCoInsuranceDetailsPage.fillandSubmitPolicyCoinsuranceDetails(policyCoInsurancDetailEntitydata, assertReference,testData,rowcount);
					testData.updateRecordsForCriteria(policyCoInsurancDetailEntitydata);
					//rowcount=++rowcount;
					rowcount++;
				}
				}
			}
		}
	}

	//Abhijit
	public void policyGHT1PLRMemberPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy GHT1PLR Member Page Helper</i></B>");
		List<PolGHT1PLRMemberEntity> polGHT1PLRMemberEntityList=testData.getPolGHT1PLRMemberEntities();
		for(PolGHT1PLRMemberEntity polGHT1PLRMemberEntityData:polGHT1PLRMemberEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polGHT1PLRMemberEntityData.getChildKey())){
				if(polGHT1PLRMemberEntityData.getAction().equalsIgnoreCase("verify")&& polGHT1PLRMemberEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){	
					PolGHT1PLRMemberPage polGHT1PLRMemberPage=new PolGHT1PLRMemberPage(driver, "Policy GH T1 PLR Member Page");
					polGHT1PLRMemberPage.fillandSubmitPolGHT1PLRMember(polGHT1PLRMemberEntityData, assertReference);
					testData.updateRecordsForCriteria(polGHT1PLRMemberEntityData);
					FrameworkServices.logMessage("<B><i> Executing:: Policy GH T2 PLR Member Page Helper</i></B>");
					List<PolGHT2PLRMemberEntity> polGHT2PLRMemberEntityList=testData.getPolGHT2PLRMemberEntities();
					for(PolGHT2PLRMemberEntity polGHT2PLRMemberEntityData:polGHT2PLRMemberEntityList){
						if(policyEntity.getParentKey().equalsIgnoreCase(polGHT2PLRMemberEntityData.getChildKey())){
							if(polGHT2PLRMemberEntityData.getAction().equalsIgnoreCase("verify")&& polGHT2PLRMemberEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								PolGHT2PLRMemberPage polGHT2PLRMemberPage=new PolGHT2PLRMemberPage(driver, "Policy GH T2 PLR Member Page");
								polGHT2PLRMemberPage.fillandSubmitPolGHT2PLRMember(polGHT2PLRMemberEntityData, assertReference);
								testData.updateRecordsForCriteria(polGHT2PLRMemberEntityData);
							}
						}
					}
				}
			}
		}
	}

	//Rasika - Claim Synopsis
	public void policyClaimSynopsisVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Synopsis Page </i></B>");
		List<ClaimSynopsisEntity> claimSynopsisEntityList=testData.getClaimSynopsisEntity();
		for(ClaimSynopsisEntity claimSynopsisEntityListData:claimSynopsisEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(claimSynopsisEntityListData.getChildKey())){
				if((claimSynopsisEntityListData.getAction().equalsIgnoreCase("verify") && claimSynopsisEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyClaimSynopsisPage policyClaimSynopsisPage=new PolicyClaimSynopsisPage(driver, "Claim Synopsis Page" );
					policyClaimSynopsisPage.fillAndVerifyClaimSynopsisDetails(claimSynopsisEntityListData, assertReference, testData);
					testData.updateRecordsForCriteria(claimSynopsisEntityListData);
				}
			}
		}
	}

	//Rasika - Voluntary Excess Details
	public void voluntaryExcessDetailsPageEditelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Voluntary Excess Details Page Misc Edit Helper </i></B>");
		List<VoluntaryExcessDetailsEntity> voluntaryExcessDetailsEntityList=testData.getVoluntaryExcessDetailsPageEntity();
		for(VoluntaryExcessDetailsEntity voluntaryExcessDetailsEntityListData:voluntaryExcessDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(voluntaryExcessDetailsEntityListData.getChildKey())){
				if((voluntaryExcessDetailsEntityListData.getAction().equalsIgnoreCase("edit")||voluntaryExcessDetailsEntityListData.getAction().equalsIgnoreCase("add")) && policyEntity.getStepGroup().equalsIgnoreCase(voluntaryExcessDetailsEntityListData.getStepGroup())){
					VoluntaryExcessDetailsPage voluntaryExcessDetailsPage=new VoluntaryExcessDetailsPage(driver, "Voluntary Excess Details Page" );
					voluntaryExcessDetailsPage.fillandSubmitVoluntaryExcessDetailsPage(voluntaryExcessDetailsEntityListData, assertReference);
					testData.updateRecordsForCriteria(voluntaryExcessDetailsEntityListData);
				}
			}
		}
	}

	//Rasika - Voluntary Excess Details
	public void voluntaryExcessDetailsPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Voluntary Excess Details Page Misc Verify Helper </i></B>");
		List<VoluntaryExcessDetailsEntity> voluntaryExcessDetailsEntityList=testData.getVoluntaryExcessDetailsPageEntity();
		for(VoluntaryExcessDetailsEntity voluntaryExcessDetailsEntityListData:voluntaryExcessDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(voluntaryExcessDetailsEntityListData.getChildKey())){
				if((voluntaryExcessDetailsEntityListData.getAction().equalsIgnoreCase("verify") && voluntaryExcessDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					VoluntaryExcessDetailsPage voluntaryExcessDetailsPage=new VoluntaryExcessDetailsPage(driver, "Voluntary Excess Details Page" );
					voluntaryExcessDetailsPage.fillandSubmitVoluntaryExcessDetailsPage(voluntaryExcessDetailsEntityListData, assertReference);
					testData.updateRecordsForCriteria(voluntaryExcessDetailsEntityListData);
				}
			}
		}
	}

	//Sonali -PD
	public void pDRiskDetailPageEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<PDRskDetailSecndPageMLEntity> pDRskDetailSecndPageMLEntityList=testData.getPDRskDetailSecndPageMLEntity();
		for(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntityListData:pDRskDetailSecndPageMLEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(pDRskDetailSecndPageMLEntityListData.getChildKey())){
				if((pDRskDetailSecndPageMLEntityListData.getAction().equalsIgnoreCase("edit")|| pDRskDetailSecndPageMLEntityListData.getAction().equalsIgnoreCase("add")) && policyEntity.getStepGroup().equalsIgnoreCase(pDRskDetailSecndPageMLEntityListData.getStepGroup())){
					PDRiskDetailSecondPageML pDRiskDetailSecondPageML=new PDRiskDetailSecondPageML(driver, "Risk Detail Seccond Page for PD" );
					pDRiskDetailSecondPageML.fillandSubmitPDRiskDetailSecondPageML(pDRskDetailSecndPageMLEntityListData, assertReference);
					testData.updateRecordsForCriteria(pDRskDetailSecndPageMLEntityListData);
				}
			}
		}
	}

	public void pDRiskDetailPageVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<PDRskDetailSecndPageMLEntity> pDRskDetailSecndPageMLEntityList=testData.getPDRskDetailSecndPageMLEntity();
		for(PDRskDetailSecndPageMLEntity pDRskDetailSecndPageMLEntityListData:pDRskDetailSecndPageMLEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(pDRskDetailSecndPageMLEntityListData.getChildKey())){
				if(pDRskDetailSecndPageMLEntityListData.getAction().equalsIgnoreCase("Verify")&& pDRskDetailSecndPageMLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PDRiskDetailSecondPageML pDRiskDetailSecondPageML=new PDRiskDetailSecondPageML(driver, "Risk Detail Seccond Page for PD" );
					pDRiskDetailSecondPageML.fillandSubmitPDRiskDetailSecondPageML(pDRskDetailSecndPageMLEntityListData, assertReference);
					testData.updateRecordsForCriteria(pDRskDetailSecndPageMLEntityListData);
				}
			}
		}
	}
	//Abhijit 
	public void policyAttributeRuralEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Rural Edit Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttributeRuralEntity> policyAttributeRuralEntityList=testData.getPolicyAttributeRuralEntityRecords();
						for(PolicyAttributeRuralEntity policyAttributeRuralEntityListData:policyAttributeRuralEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeRuralEntityListData.getChildKey())){
								if((policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("add")|| policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeRural policyAttributeRural=new PolicyAttributeRural(driver, "Policy Attribute Rural Page");
									policyAttributeRural.fillandSubmitPolicyAttributeRural(policyAttributeRuralEntityListData, assertReference);

									if(policyAttributeRuralEntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
										for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
												if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
													policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);

													if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
														List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
														for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																	policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//Abhijit

	public void policyAttributeRuralVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{

		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Rural Verify Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed**********************//
					if(policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttributeRuralEntity> policyAttributeRuralEntityList=testData.getPolicyAttributeRuralEntityRecords();
						for(PolicyAttributeRuralEntity policyAttributeRuralEntityListData:policyAttributeRuralEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeRuralEntityListData.getChildKey())){
								if(policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeRural policyAttributeRural=new PolicyAttributeRural(driver, "Policy Attribute Rural Page");
									policyAttributeRural.fillandSubmitPolicyAttributeRural(policyAttributeRuralEntityListData, assertReference);
									if(policyAttributeRuralEntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
										for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
												if(policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify") && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
													policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeMiscLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData:policyAttributeEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolicyAttributeHealthEntity> policyAttributeHealthEntityList=testData.getPolicyAttributeHealthRecord();
						for(PolicyAttributeHealthEntity policyAttributeHealthEntityListData:policyAttributeHealthEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeHealthEntityListData.getChildKey())){
								if((policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("add")|| policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeHealthEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeHealth policyAttributeHealth=new PolicyAttributeHealth(driver, "Policy Attribute Health Page");
									policyAttributeHealth.fillandSubmitPolicyAttibutesHealth(policyAttributeHealthEntityListData, assertReference);


									if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeHealthEntityListData.getStringValueForField("Product").equalsIgnoreCase("WC")){
											policyAttributeDetailsOfWagesAndAccidentsMisc(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
										}	

										List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
										for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(previousPolicyHistoryEntitydata.getChildKey())){
												if((previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("edit")||previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("add"))&& previousPolicyHistoryEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
													PreviousPolicyHistoryPage previousPolicyHistoryPage=new PreviousPolicyHistoryPage(driver, "Policy Previous History page");
													previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
													testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);
													if(previousPolicyHistoryEntitydata.getBooleanValueForField("ConfigForwordButton")){
														policyAttributeProvisionalPolicyDetails(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
													}											


													List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
													for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
															if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
																	policyAttributeSpecialConditionHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																}
																// ----------------GH--MU-------//
																/*if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigInstallmentFacilityPage")){
																		policyAttributeInstallmentFacility(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																	}*/

															}
														}
													}
													List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
													for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
															if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParamPage=new PolicyAttrributeGstUpadateParam(driver, "Type of Development Officer");
																policyAttrributeGstUpadateParamPage.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);

															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	public void policyInsuredIntrestRuralEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Rural Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					/////*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//********* Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Intrest Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										List<PolInsIntAttRiskDet1Entity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntAttRiskDet1RRLEntityRecords();
										for(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
												if((polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInterestAttributeRiskDetail1Rural policyInsuredInterestAttributeRiskDetail1Rural= new PolicyInsuredInterestAttributeRiskDetail1Rural(driver, "Policy Member Atrribute health");
													policyInsuredInterestAttributeRiskDetail1Rural.fillandSubmitPolicyInsuredInterestAttributeRiskDetail1Rural(polInsIntAttRiskDet1RRLEntityListData, assertReference);

												}

											}
										}
										List<RiskDetails2RuralEntity> riskDetails2RuralEntityList=testData.getRiskDetails2RuralEntityRecords();
										for(RiskDetails2RuralEntity riskDetails2RuralEntityListData:riskDetails2RuralEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetails2RuralEntityListData.getChildKey())){
												if((riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("add")|| riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("edit")) && riskDetails2RuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													RiskDetail2Rural riskDetails2Rural= new RiskDetail2Rural(driver, "RiskDetail2Rural");
													riskDetails2Rural.fillandsubmitRiskDetailsRural(riskDetails2RuralEntityListData, assertReference);

												}
											}
										}
									}
								}
							}
						}

					}
					/******************************AttributeEnd**********/
					//************************************* Member Attach Coverage Page  ******************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/*****************Policy Memeber coverage Details Page starts****************/
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit") ) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/********************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<LoadDiscntDetRuralEntity> loadDiscntDetRuralEntityList=testData.getLoadDiscntDetRuralEntityRecords();
																		for(LoadDiscntDetRuralEntity loadDiscntDetRuralEntityListData: loadDiscntDetRuralEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(loadDiscntDetRuralEntityListData.getChildKey())){
																				if((loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("add")|| loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("edit")) && loadDiscntDetRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttachCoverageLoadingAndDiscountDetailRural policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyAttachCoverageLoadingAndDiscountDetailRural(driver,"Loading and Discount Details");
																					policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitLoadDiscntDetRuralEntity(loadDiscntDetRuralEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	
													////// Config is added to traverse  premium tab after traversing attributes in Attach Coverages. 
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkTab")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}

													}
												}
											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//Rasika
	/*******************Policy Insured Interest Misc Liability Edit Helper**********************************/
	public void policyInsuredInterestMiscLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Misc Liability Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);


					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);

					}

					//TODO Done
					///*********** Attribute in insured interest Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										/*****Attribute in Insured Interest attribute Page after Click on proceed**********/

										List<RiskDetailsFirstMiscEntity> riskDetailsFirstMiscEntityList=testData.getRiskDetailsFirstPageEntity();
										for(RiskDetailsFirstMiscEntity riskDetailsFirstMiscEntityData:riskDetailsFirstMiscEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFirstMiscEntityData.getChildKey())){
												if((riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("add")|| riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("edit")) && riskDetailsFirstMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													RiskDetailsFirstPageMiscInsured riskDetailsFirstPageMiscInsured= new RiskDetailsFirstPageMiscInsured(driver, "Policy Insured Risk Details First Page", 0);
													riskDetailsFirstPageMiscInsured.fillandSubmitRiskDetailsFirstPage(riskDetailsFirstMiscEntityData, assertReference);
													//sonali
													if(riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PD") || riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PK")){
														pDRiskDetailPageEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
													}
													//PF{Null page-->premiumRatePFMiscEntity,Voluntry excess-->VoluntaryExcessDetailsEntity}
													if(riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PF")){														
														List<PremiumRatePFMiscEntity> premiumRatePFMiscEntityList=testData.getPremiumRatePFMiscEntityRecords();
														for(PremiumRatePFMiscEntity premiumRatePFMiscEntityData:premiumRatePFMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(premiumRatePFMiscEntityData.getChildKey())){
																if((premiumRatePFMiscEntityData.getAction().equalsIgnoreCase("add")||premiumRatePFMiscEntityData.getAction().equalsIgnoreCase("edit")) && premiumRatePFMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestAttributePremiumRateForPFMisc policyInsuredIntrestAttributePremiumRateForPFMisc=  new PolicyInsuredIntrestAttributePremiumRateForPFMisc(driver, "Policy Insured Interest  Attributes second page");
																	policyInsuredIntrestAttributePremiumRateForPFMisc.fillAndSubmitPolInsIntrAttrPremiumRateDetailsForPF(premiumRatePFMiscEntityData,assertReference);

																	if(premiumRatePFMiscEntityData.getBooleanValueForField("ConfigForwardButton")){
																		voluntaryExcessDetailsPageEditelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);																		
																	}
																}
															}
														}
													}


													/********Risk Details Next Pages*****/

													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigRiskDetailsSecondPage")){

														List<RiskDetailsSecndMiscEntity> riskDetailsSecndMiscEntityList=testData.getRiskDetailsSecndMiscEntity();
														for(RiskDetailsSecndMiscEntity riskDetailsSecndMiscEntityData:riskDetailsSecndMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsSecndMiscEntityData.getChildKey())){
																if((riskDetailsSecndMiscEntityData.getAction().equalsIgnoreCase("add")|| riskDetailsSecndMiscEntityData.getAction().equalsIgnoreCase("edit")) && riskDetailsSecndMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	RiskDetailsSecondPageMiscInsured riskDetailsSecondPageMiscInsured= new RiskDetailsSecondPageMiscInsured(driver, "Policy Insured Risk Details Second Page");
																	riskDetailsSecondPageMiscInsured.fillandSubmitRiskDetailsSecondPage(riskDetailsSecndMiscEntityData, assertReference);

																	if(riskDetailsSecndMiscEntityData.getBooleanValueForField("ConfigRiskDetailsThirdPage")){
																		List<RiskDetailsThirdMiscEntity> riskDetailsThirdMiscEntityList=testData.getRiskDetailsThirdMiscEntity();
																		for(RiskDetailsThirdMiscEntity riskDetailsThirdMiscEntityData:riskDetailsThirdMiscEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsThirdMiscEntityData.getChildKey())){
																				if((riskDetailsThirdMiscEntityData.getAction().equalsIgnoreCase("add")|| riskDetailsThirdMiscEntityData.getAction().equalsIgnoreCase("edit")) && riskDetailsThirdMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					RiskDetailsThirdPageMiscInsured riskDetailsThirdPageMiscInsured= new RiskDetailsThirdPageMiscInsured(driver, "Policy Insured Risk Details Third Page");
																					riskDetailsThirdPageMiscInsured.fillandSubmitRiskDetailsThirdPage(riskDetailsThirdMiscEntityData, assertReference);

																					if(riskDetailsThirdMiscEntityData.getBooleanValueForField("ConfigRiskDetailsFourthPage")){
																						List<RiskDetailsFourthMiscEntity> riskDetailsFourthMiscEntityList=testData.getRiskDetailsFourthMiscEntity();
																						for(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntityData:riskDetailsFourthMiscEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFourthMiscEntityData.getChildKey())){
																								if((riskDetailsFourthMiscEntityData.getAction().equalsIgnoreCase("add")|| riskDetailsFourthMiscEntityData.getAction().equalsIgnoreCase("edit")) && riskDetailsFourthMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									RiskDetailsFourthPageMiscInsured riskDetailsFourthPageMiscInsured= new RiskDetailsFourthPageMiscInsured(driver, "Policy Insured Risk Details Fourth Page");
																									riskDetailsFourthPageMiscInsured.fillandSubmitRiskDetailsFourthPage(riskDetailsFourthMiscEntityData, assertReference);

																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

													/************************************Extension Pages*************************************************/
													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigExtensionFirstPage")){
														List<Exten1DetailsMiscEntity> exten1DetailsMiscEntityList=testData.getExten1DetailsMiscEntity();
														for(Exten1DetailsMiscEntity exten1DetailsMiscEntityData:exten1DetailsMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(exten1DetailsMiscEntityData.getChildKey())){
																if((exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten1DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	Exten1DetailsMiscInsurePage exten1DetailsMiscInsurePage= new Exten1DetailsMiscInsurePage(driver, "Policy Insured Extension First Page");
																	exten1DetailsMiscInsurePage.fillandSubmitExten1DetailsMiscInsurePage(exten1DetailsMiscEntityData, assertReference);

																	if(exten1DetailsMiscEntityData.getBooleanValueForField("ConfigExtensionSecondPage")){
																		List<Exten2DetailsMiscEntity> exten2DetailsMiscEntityList=testData.getExten2DetailsMiscEntity();
																		for(Exten2DetailsMiscEntity exten2DetailsMiscEntityData:exten2DetailsMiscEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(exten2DetailsMiscEntityData.getChildKey())){
																				if((exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten2DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					Exten2DetailsMiscInsurePage exten2DetailsMiscInsurePage= new Exten2DetailsMiscInsurePage(driver, "Policy Insured Extension Second Page");
																					exten2DetailsMiscInsurePage.fillandSubmitExten2DetailsMiscInsurePage(exten2DetailsMiscEntityData, assertReference);

																					if(exten2DetailsMiscEntityData.getBooleanValueForField("ConfigExtensionThirdPage")){
																						List<Exten3DetailsMiscEntity> exten3DetailsMiscEntityList=testData.getExten3DetailsMiscEntity();
																						for(Exten3DetailsMiscEntity exten3DetailsMiscEntityData:exten3DetailsMiscEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(exten3DetailsMiscEntityData.getChildKey())){
																								if((exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten3DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									Exten3DetailsMiscInsurePage exten3DetailsMiscInsurePage= new Exten3DetailsMiscInsurePage(driver, "Policy Insured Extension Third Page");
																									exten3DetailsMiscInsurePage.fillandSubmitExten3DetailsMiscInsurePage(exten3DetailsMiscEntityData, assertReference);

																									/**********************************Voluntary Excess Details Page*****************************************/
																									if(exten3DetailsMiscEntityData.getBooleanValueForField("ConfigVoluntaryExcessDetailsPage")){	
																										voluntaryExcessDetailsPageEditelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																									}

																								}

																							}

																						}
																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

					/***************************AttributeEnd************************************/
					//************************* Insured interset Attach Coverage Page  *********************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Insured interset coverage Details Page starts****************/
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit"))  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Insured interset coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	//sonali
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton") && policyMemAttachCovAtrEntityData.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
																		List<AttachCovAttribtCovDetEntity> attachCovAttribtCovDetEntityList=testData.getattachCovAttribtCovDetEntity();
																		for(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntityListData:attachCovAttribtCovDetEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(attachCovAttribtCovDetEntityListData.getChildKey())){
																				if((attachCovAttribtCovDetEntityListData.getAction().equalsIgnoreCase("edit")||attachCovAttribtCovDetEntityListData.getAction().equalsIgnoreCase("add")) && policyEntity.getStepGroup().equalsIgnoreCase(attachCovAttribtCovDetEntityListData.getStepGroup())){
																					AttachCoverageAttributesCoverageDetailsPage attachCovAttribtCovDetEntity=new AttachCoverageAttributesCoverageDetailsPage(driver, "Attach Cov Attributes Coverage Detail Page" );
																					attachCovAttribtCovDetEntity.fillandSubmitAttachCovAttributesCoverageDetailsPage(attachCovAttribtCovDetEntityListData, assertReference);
																					testData.updateRecordsForCriteria(attachCovAttribtCovDetEntityListData);



																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionOnePage")){
																						ExtensionFirstPageMiscLiabilityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}

																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionTwoPage")){
																						ExtensionSecondPageMiscLiabilityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}

																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionThreePage")){
																						ExtensionThirdPageMiscLiabilityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}
																				}
																			}
																		}
																	}

																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Insured interset premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink") || policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	testData.updateRecordsForCriteria(policyMemberCoverageDEntityyData);
																}
															}
														}
														/*************************************Policy Insured interset premium page End**************************/
													}if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
													/*	if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
													List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
													for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
															if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);

															}
														}
													}
												}*/

												}
											}
										}
									}
								}
							}
						}
					}		
				}
			}
		}
	}
	//Sonali
	public void ExtensionFirstPageMiscLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten1DetailsMiscEntity> exten1DetailsMiscEntityList=testData.getExten1DetailsMiscEntity();
		for(Exten1DetailsMiscEntity exten1DetailsMiscEntityData:exten1DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten1DetailsMiscEntityData.getChildKey())){
				if((exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten1DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Exten1DetailsMiscInsurePage exten1DetailsMiscInsurePage= new Exten1DetailsMiscInsurePage(driver, "Policy Insured Extension First Page");
					exten1DetailsMiscInsurePage.fillandSubmitExten1DetailsMiscInsurePage(exten1DetailsMiscEntityData, assertReference);
				}
			}
		}
	}

	public void ExtensionSecondPageMiscLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten2DetailsMiscEntity> exten2DetailsMiscEntityList=testData.getExten2DetailsMiscEntity();
		for(Exten2DetailsMiscEntity exten2DetailsMiscEntityData:exten2DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten2DetailsMiscEntityData.getChildKey())){
				if((exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten2DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Exten2DetailsMiscInsurePage exten2DetailsMiscInsurePage= new Exten2DetailsMiscInsurePage(driver, "Policy Insured Extension Second Page");
					exten2DetailsMiscInsurePage.fillandSubmitExten2DetailsMiscInsurePage(exten2DetailsMiscEntityData, assertReference);
				}
			}
		}
	}

	public void ExtensionThirdPageMiscLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten3DetailsMiscEntity> exten3DetailsMiscEntityList=testData.getExten3DetailsMiscEntity();
		for(Exten3DetailsMiscEntity exten3DetailsMiscEntityData:exten3DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten3DetailsMiscEntityData.getChildKey())){
				if((exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("add")|| exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("edit")) && exten3DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Exten3DetailsMiscInsurePage exten3DetailsMiscInsurePage= new Exten3DetailsMiscInsurePage(driver, "Policy Insured Extension Third Page");
					exten3DetailsMiscInsurePage.fillandSubmitExten3DetailsMiscInsurePage(exten3DetailsMiscEntityData, assertReference);
				}
			}
		}
	}
	//Verify Extension
	public void ExtensionFirstPageMiscLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten1DetailsMiscEntity> exten1DetailsMiscEntityList=testData.getExten1DetailsMiscEntity();
		for(Exten1DetailsMiscEntity exten1DetailsMiscEntityData:exten1DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten1DetailsMiscEntityData.getChildKey())){
				if((exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("Verify") && exten1DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					Exten1DetailsMiscInsurePage exten1DetailsMiscInsurePage= new Exten1DetailsMiscInsurePage(driver, "Policy Insured Extension First Page");
					exten1DetailsMiscInsurePage.fillandSubmitExten1DetailsMiscInsurePage(exten1DetailsMiscEntityData, assertReference);
				}
			}
		}
	}

	public void ExtensionSecondPageMiscLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten2DetailsMiscEntity> exten2DetailsMiscEntityList=testData.getExten2DetailsMiscEntity();
		for(Exten2DetailsMiscEntity exten2DetailsMiscEntityData:exten2DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten2DetailsMiscEntityData.getChildKey())){
				if((exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("Verify") && exten2DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					Exten2DetailsMiscInsurePage exten2DetailsMiscInsurePage= new Exten2DetailsMiscInsurePage(driver, "Policy Insured Extension Second Page");
					exten2DetailsMiscInsurePage.fillandSubmitExten2DetailsMiscInsurePage(exten2DetailsMiscEntityData, assertReference);
				}
			}
		}
	}

	public void ExtensionThirdPageMiscLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<Exten3DetailsMiscEntity> exten3DetailsMiscEntityList=testData.getExten3DetailsMiscEntity();
		for(Exten3DetailsMiscEntity exten3DetailsMiscEntityData:exten3DetailsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(exten3DetailsMiscEntityData.getChildKey())){
				if((exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("Verify") && exten3DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					Exten3DetailsMiscInsurePage exten3DetailsMiscInsurePage= new Exten3DetailsMiscInsurePage(driver, "Policy Insured Extension Third Page");
					exten3DetailsMiscInsurePage.fillandSubmitExten3DetailsMiscInsurePage(exten3DetailsMiscEntityData, assertReference);
				}
			}
		}
	}


	//Rasika
	/*******************Policy Insured Interest Misc Liability Verify Helper**********************************/
	public void policyInsuredInterestMiscLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Misc Liability Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);


					///*************Policy Insured Interest Code  verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){{
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);

					}


					///*********** Attribute in insured interest Details ******************** 


					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify") && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										/*****Attribute in Insured Interest attribute Page after Click on proceed**********/

										List<RiskDetailsFirstMiscEntity> riskDetailsFirstMiscEntityList=testData.getRiskDetailsFirstPageEntity();
										for(RiskDetailsFirstMiscEntity riskDetailsFirstMiscEntityData:riskDetailsFirstMiscEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFirstMiscEntityData.getChildKey())){
												if(riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("verify") && riskDetailsFirstMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													RiskDetailsFirstPageMiscInsured riskDetailsFirstPageMiscInsured= new RiskDetailsFirstPageMiscInsured(driver, "Policy Insured Risk Details First Page", 0);
													riskDetailsFirstPageMiscInsured.fillandSubmitRiskDetailsFirstPage(riskDetailsFirstMiscEntityData, assertReference);

													//sonali
													if(riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PD")||riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PK")){
														pDRiskDetailPageVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
													}

													//PF{Null page-->premiumRatePFMiscEntity,Voluntry excess-->VoluntaryExcessDetailsEntity}
													if(riskDetailsFirstMiscEntityData.getStringValueForField("Product").equalsIgnoreCase("PF")){														
														List<PremiumRatePFMiscEntity> premiumRatePFMiscEntityList=testData.getPremiumRatePFMiscEntityRecords();
														for(PremiumRatePFMiscEntity premiumRatePFMiscEntityData:premiumRatePFMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(premiumRatePFMiscEntityData.getChildKey())){
																if(premiumRatePFMiscEntityData.getAction().equalsIgnoreCase("Verify") && premiumRatePFMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestAttributePremiumRateForPFMisc policyInsuredIntrestAttributePremiumRateForPFMisc=  new PolicyInsuredIntrestAttributePremiumRateForPFMisc(driver, "Policy Insured Interest  Attributes second page");
																	policyInsuredIntrestAttributePremiumRateForPFMisc.fillAndSubmitPolInsIntrAttrPremiumRateDetailsForPF(premiumRatePFMiscEntityData,assertReference);

																	if(premiumRatePFMiscEntityData.getBooleanValueForField("ConfigForwardButton")){
																		voluntaryExcessDetailsPageVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);																		
																	}
																}
															}
														}
													}
													/****************************Risk Details Next Pages**************************/

													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigRiskDetailsSecondPage")){

														List<RiskDetailsSecndMiscEntity> riskDetailsSecndMiscEntityList=testData.getRiskDetailsSecndMiscEntity();
														for(RiskDetailsSecndMiscEntity riskDetailsSecndMiscEntityData:riskDetailsSecndMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsSecndMiscEntityData.getChildKey())){
																if(riskDetailsSecndMiscEntityData.getAction().equalsIgnoreCase("verify") && riskDetailsSecndMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	RiskDetailsSecondPageMiscInsured riskDetailsSecondPageMiscInsured= new RiskDetailsSecondPageMiscInsured(driver, "Policy Insured Risk Details Second Page");
																	riskDetailsSecondPageMiscInsured.fillandSubmitRiskDetailsSecondPage(riskDetailsSecndMiscEntityData, assertReference);

																	if(riskDetailsSecndMiscEntityData.getBooleanValueForField("ConfigRiskDetailsThirdPage")){
																		List<RiskDetailsThirdMiscEntity> riskDetailsThirdMiscEntityList=testData.getRiskDetailsThirdMiscEntity();
																		for(RiskDetailsThirdMiscEntity riskDetailsThirdMiscEntityData:riskDetailsThirdMiscEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsThirdMiscEntityData.getChildKey())){
																				if(riskDetailsThirdMiscEntityData.getAction().equalsIgnoreCase("verify") && riskDetailsThirdMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					RiskDetailsThirdPageMiscInsured riskDetailsThirdPageMiscInsured= new RiskDetailsThirdPageMiscInsured(driver, "Policy Insured Risk Details Third Page");
																					riskDetailsThirdPageMiscInsured.fillandSubmitRiskDetailsThirdPage(riskDetailsThirdMiscEntityData, assertReference);

																					if(riskDetailsThirdMiscEntityData.getBooleanValueForField("ConfigRiskDetailsFourthPage")){
																						List<RiskDetailsFourthMiscEntity> riskDetailsFourthMiscEntityList=testData.getRiskDetailsFourthMiscEntity();
																						for(RiskDetailsFourthMiscEntity riskDetailsFourthMiscEntityData:riskDetailsFourthMiscEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFourthMiscEntityData.getChildKey())){
																								if(riskDetailsFourthMiscEntityData.getAction().equalsIgnoreCase("verify") && riskDetailsFourthMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									RiskDetailsFourthPageMiscInsured riskDetailsFourthPageMiscInsured= new RiskDetailsFourthPageMiscInsured(driver, "Policy Insured Risk Details Fourth Page");
																									riskDetailsFourthPageMiscInsured.fillandSubmitRiskDetailsFourthPage(riskDetailsFourthMiscEntityData, assertReference);

																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

													/***************************************Extension Pages*************************************************/
													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigExtensionFirstPage")){
														List<Exten1DetailsMiscEntity> exten1DetailsMiscEntityList=testData.getExten1DetailsMiscEntity();
														for(Exten1DetailsMiscEntity exten1DetailsMiscEntityData:exten1DetailsMiscEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(exten1DetailsMiscEntityData.getChildKey())){
																if(exten1DetailsMiscEntityData.getAction().equalsIgnoreCase("verify") && exten1DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	Exten1DetailsMiscInsurePage exten1DetailsMiscInsurePage= new Exten1DetailsMiscInsurePage(driver, "Policy Insured Extension First Page");
																	exten1DetailsMiscInsurePage.fillandSubmitExten1DetailsMiscInsurePage(exten1DetailsMiscEntityData, assertReference);

																	if(exten1DetailsMiscEntityData.getBooleanValueForField("ConfigExtensionSecondPage")){
																		List<Exten2DetailsMiscEntity> exten2DetailsMiscEntityList=testData.getExten2DetailsMiscEntity();
																		for(Exten2DetailsMiscEntity exten2DetailsMiscEntityData:exten2DetailsMiscEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(exten2DetailsMiscEntityData.getChildKey())){
																				if(exten2DetailsMiscEntityData.getAction().equalsIgnoreCase("verify") && exten2DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					Exten2DetailsMiscInsurePage exten2DetailsMiscInsurePage= new Exten2DetailsMiscInsurePage(driver, "Policy Insured Extension Second Page");
																					exten2DetailsMiscInsurePage.fillandSubmitExten2DetailsMiscInsurePage(exten2DetailsMiscEntityData, assertReference);

																					if(exten2DetailsMiscEntityData.getBooleanValueForField("ConfigExtensionThirdPage")){
																						List<Exten3DetailsMiscEntity> exten3DetailsMiscEntityList=testData.getExten3DetailsMiscEntity();
																						for(Exten3DetailsMiscEntity exten3DetailsMiscEntityData:exten3DetailsMiscEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(exten3DetailsMiscEntityData.getChildKey())){
																								if(exten3DetailsMiscEntityData.getAction().equalsIgnoreCase("verify") && exten3DetailsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									Exten3DetailsMiscInsurePage exten3DetailsMiscInsurePage= new Exten3DetailsMiscInsurePage(driver, "Policy Insured Extension Third Page");
																									exten3DetailsMiscInsurePage.fillandSubmitExten3DetailsMiscInsurePage(exten3DetailsMiscEntityData, assertReference);

																									/**********************************Voluntary Excess Details Page*****************************************/
																									if(exten3DetailsMiscEntityData.getBooleanValueForField("ConfigVoluntaryExcessDetailsPage")){	
																										voluntaryExcessDetailsPageVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																									}

																								}

																							}

																						}
																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}


					/************************AttributeEnd**********/
					//************************* Member Attach Coverage Page  *********************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Insured interset coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")&&policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")&&policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Insured interset coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);

																	//sonali
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton") && policyMemAttachCovAtrEntityData.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
																		List<AttachCovAttribtCovDetEntity> attachCovAttribtCovDetEntityList=testData.getattachCovAttribtCovDetEntity();
																		for(AttachCovAttribtCovDetEntity attachCovAttribtCovDetEntityListData:attachCovAttribtCovDetEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(attachCovAttribtCovDetEntityListData.getChildKey())){
																				if(attachCovAttribtCovDetEntityListData.getAction().equalsIgnoreCase("verify") && attachCovAttribtCovDetEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					AttachCoverageAttributesCoverageDetailsPage attachCovAttribtCovDetEntity=new AttachCoverageAttributesCoverageDetailsPage(driver, "Attach Cov Attributes Coverage Detail Page" );
																					attachCovAttribtCovDetEntity.fillandSubmitAttachCovAttributesCoverageDetailsPage(attachCovAttribtCovDetEntityListData, assertReference);
																					testData.updateRecordsForCriteria(attachCovAttribtCovDetEntityListData);


																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionOnePage")){
																						ExtensionFirstPageMiscLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}

																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionTwoPage")){
																						ExtensionSecondPageMiscLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}

																					if(attachCovAttribtCovDetEntityListData.getBooleanValueForField("ConfigExtensionThreePage")){
																						ExtensionThirdPageMiscLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Insured interset premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink") || policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	testData.updateRecordsForCriteria(policyMemberCoverageDEntityyData);

																}
															}
														}
														/**********************************Policy Insured interset premium page End**************************/
													}
												}
											}
										}
									}
								}
							}
						}
					}		
					}
				}
			}
		}
	}

	public void policyAttributeSpecialConditionHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details </i></B>");
		List<PolSpecialConditnMiscEntity> polSpecialConditnMiscEntityList=testData.getPolSpecialConditnMiscEntity();
		for(PolSpecialConditnMiscEntity polSpecialConditnMiscEntityData:polSpecialConditnMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polSpecialConditnMiscEntityData.getChildKey())){
				if((polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("edit")||polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("add"))&& polSpecialConditnMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					SpecialConditionMiscPage specialConditionMiscPage=new SpecialConditionMiscPage(driver, "Policy Attribute Provisional Policy Details Page");
					specialConditionMiscPage.fillandSubmitSpecialConditionPagePolicyAttibutesMisc(polSpecialConditnMiscEntityData, assertReference);
					testData.updateRecordsForCriteria(polSpecialConditnMiscEntityData);
				}
			}
		}
	}     
	//   DetailWageAcidntsMiscEntity
	public void policyAttributeDetailsOfWagesAndAccidentsMisc (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing::  Details of wages and Accidents </i></B>");
		List<DetailWageAcidntsMiscEntity> detailWageAcidntsMiscEntityList=testData.getDetailWageAcidntsMiscEntityRecords();
		for(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntityData:detailWageAcidntsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(detailWageAcidntsMiscEntityData.getChildKey())){
				if((detailWageAcidntsMiscEntityData.getAction().equalsIgnoreCase("edit")||detailWageAcidntsMiscEntityData.getAction().equalsIgnoreCase("add"))&& detailWageAcidntsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					DetailsOfWagesAndAccidentsMiscPages detailsOfWagesAndAccidentsMiscPages=new DetailsOfWagesAndAccidentsMiscPages(driver, "Policy Attribute Provisional Policy Details Page");
					detailsOfWagesAndAccidentsMiscPages.fillandSubmitDetailsOfWagesAndAccidentsMiscPages(detailWageAcidntsMiscEntityData, assertReference);
					testData.updateRecordsForCriteria(detailWageAcidntsMiscEntityData);
				}
			}
		}
	}
	// Verify Helper
	public void policyAttributeDetailsOfWagesAndAccidentsMiscVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing::  Details of wages and Accidents </i></B>");
		List<DetailWageAcidntsMiscEntity> detailWageAcidntsMiscEntityList=testData.getDetailWageAcidntsMiscEntityRecords();
		for(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntityData:detailWageAcidntsMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(detailWageAcidntsMiscEntityData.getChildKey())){
				if(detailWageAcidntsMiscEntityData.getAction().equalsIgnoreCase("verify")&& detailWageAcidntsMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					DetailsOfWagesAndAccidentsMiscPages detailsOfWagesAndAccidentsMiscPages=new DetailsOfWagesAndAccidentsMiscPages(driver, "Policy Attribute Provisional Policy Details Page");
					detailsOfWagesAndAccidentsMiscPages.fillandSubmitDetailsOfWagesAndAccidentsMiscPages(detailWageAcidntsMiscEntityData, assertReference);
					testData.updateRecordsForCriteria(detailWageAcidntsMiscEntityData);
				}
			}
		}
	}

	public void policyAttributeSpecialConditionVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Provisional Policy Details </i></B>");
		List<PolSpecialConditnMiscEntity> polSpecialConditnMiscEntityList=testData.getPolSpecialConditnMiscEntity();
		for(PolSpecialConditnMiscEntity polSpecialConditnMiscEntityData:polSpecialConditnMiscEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polSpecialConditnMiscEntityData.getChildKey())){
				if(polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("verify")&& polSpecialConditnMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					SpecialConditionMiscPage specialConditionMiscPage=new SpecialConditionMiscPage(driver, "Policy Attribute Provisional Policy Details Page");
					specialConditionMiscPage.fillandSubmitSpecialConditionPagePolicyAttibutesMisc(polSpecialConditnMiscEntityData, assertReference);
					testData.updateRecordsForCriteria(polSpecialConditnMiscEntityData);
				}
			}
		}
	}

	public void policyAttributeMiscLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")&& policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolicyAttributeHealthEntity> policyAttributeHealthEntityList=testData.getPolicyAttributeHealthRecord();
						for(PolicyAttributeHealthEntity policyAttributeHealthEntityListData:policyAttributeHealthEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeHealthEntityListData.getChildKey())){
								if(policyAttributeHealthEntityListData.getAction().equalsIgnoreCase("verify")&& policyAttributeHealthEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeHealth policyAttributeHealth=new PolicyAttributeHealth(driver, "Policy Attribute Health Page");
									policyAttributeHealth.fillandSubmitPolicyAttibutesHealth(policyAttributeHealthEntityListData, assertReference);



									if(policyAttributeHealthEntityListData.getBooleanValueForField("ConfigForwordButton")){

										if(policyAttributeHealthEntityListData.getStringValueForField("Product").equalsIgnoreCase("WC")){
											policyAttributeDetailsOfWagesAndAccidentsMiscVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
										}

										List<PreviousPolicyHistoryEntity> previousPolicyHistoryEntityList=testData.getPreviousPolicyHistoryEntityRecords();
										for(PreviousPolicyHistoryEntity previousPolicyHistoryEntitydata:previousPolicyHistoryEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(previousPolicyHistoryEntitydata.getChildKey())){
												if(previousPolicyHistoryEntitydata.getAction().equalsIgnoreCase("verify")&& previousPolicyHistoryEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
													PreviousPolicyHistoryPage previousPolicyHistoryPage=new PreviousPolicyHistoryPage(driver, "Policy Previous History page");
													previousPolicyHistoryPage.fillandSubmitPreviousPolicyHistoryDetails(previousPolicyHistoryEntitydata, assertReference);
													testData.updateRecordsForCriteria(previousPolicyHistoryEntitydata);
													if(previousPolicyHistoryEntitydata.getBooleanValueForField("ConfigForwordButton")){
														policyAttributeProvisionalPolicyDetails(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
													}											
													List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
													for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
															if(policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")&& policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
																	policyAttributeSpecialConditionVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																}
																if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
																	List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																	for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																		if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																			if(policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")&& policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																				policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																			}
																		}
																	}
																}

															}

														}

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	public void policyInsuredIntrestRuralVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);
					///**********Policy Insured Intrest Details  Verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Intrest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
							List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
							for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
									if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify") && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest Attributes"); 
										policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
										if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
											List<PolInsIntAttRiskDet1Entity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntAttRiskDet1RRLEntityRecords();
											for(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
													if(polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("verify")&& polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyInsuredInterestAttributeRiskDetail1Rural policyInsuredInterestAttributeRiskDetail1Rural= new PolicyInsuredInterestAttributeRiskDetail1Rural(driver, "Policy Member Atrribute health ");
														policyInsuredInterestAttributeRiskDetail1Rural.fillandSubmitPolicyInsuredInterestAttributeRiskDetail1Rural(polInsIntAttRiskDet1RRLEntityListData, assertReference);
													}
												}
											}

											List<RiskDetails2RuralEntity> riskDetails2RuralEntityList=testData.getRiskDetails2RuralEntityRecords();
											for(RiskDetails2RuralEntity riskDetails2RuralEntityListData:riskDetails2RuralEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(riskDetails2RuralEntityListData.getChildKey())){
													if((riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("verify") && riskDetails2RuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
														RiskDetail2Rural riskDetails2Rural= new RiskDetail2Rural(driver, "RiskDetail2Rural");
														riskDetails2Rural.fillandsubmitRiskDetailsRural(riskDetails2RuralEntityListData, assertReference);

													}
												}
											}
										}
									}
								}
							}
						}
						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
							List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
							for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Insured Interest AttachCoverages");
										policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
										/********************Insured Interest coverage  page End***********/ 
										/********************Policy Insured Interest coverage Details Page starts****************/
										if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
											List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
											for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
													if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy Insured Interest AttachCoverage Deatils ");
														policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
														/**************** Policy Insured Interest coverage Details Page End And After click on Premium******************/
														/****************attach Coverage Attribute Start***********/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
															List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
															for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																	if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																		PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Insured Interest AttachCoverages Attribute");
																		policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																		if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																			List<LoadDiscntDetRuralEntity> loadDiscntDetRuralEntityList=testData.getLoadDiscntDetRuralEntityRecords();
																			for(LoadDiscntDetRuralEntity loadDiscntDetRuralEntityListData: loadDiscntDetRuralEntityList){
																				if(policyEntity.getParentKey().equalsIgnoreCase(loadDiscntDetRuralEntityListData.getChildKey())){
																					if(loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("verify") && loadDiscntDetRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																						PolicyAttachCoverageLoadingAndDiscountDetailRural policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyAttachCoverageLoadingAndDiscountDetailRural(driver,"Loading and Discount Details");
																						policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitLoadDiscntDetRuralEntity(loadDiscntDetRuralEntityListData, assertReference);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}															/****************attach Coverage Attribute End***********/
														/****************************Policy Member premium page start***********************/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkTab")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup) ){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	public void policyAttributeMiscNonLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttributeMNLEntity> policyAttributeEntityListMNL=testData.getPolAttributeMNLEntityRecords();
						for(PolAttributeMNLEntity policyAttributeEntityListDataMNL:policyAttributeEntityListMNL){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListDataMNL.getChildKey())){
								if((policyAttributeEntityListDataMNL.getAction().equalsIgnoreCase("add")|| policyAttributeEntityListDataMNL.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMiscNonLiability policyAttributeHealth=new PolicyAttributeMiscNonLiability(driver, "Policy Attribute Page",0);
									policyAttributeHealth.fillandSubmitPolicyAttributeMNLDetails(policyAttributeEntityListDataMNL, assertReference);
									if(policyAttributeEntityListDataMNL.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeEntityListDataMNL.getBooleanValueForField("ConfigGSGstPage")){
											GSGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
										}
										List<PolHistoryForMiscNLEntity> polHistoryForMiscNLEntityList=testData.getPolHistoryForMiscNLEntityRecord();
										for(PolHistoryForMiscNLEntity polHistoryForMiscNLEntityListDataMNL:polHistoryForMiscNLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polHistoryForMiscNLEntityListDataMNL.getChildKey())){
												if((polHistoryForMiscNLEntityListDataMNL.getAction().equalsIgnoreCase("add")|| polHistoryForMiscNLEntityListDataMNL.getAction().equalsIgnoreCase("edit")) && polHistoryForMiscNLEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyHistoryForMiscNL policyHistoryForMiscNL=new PolicyHistoryForMiscNL(driver, "Policy Attribute Page");
													policyHistoryForMiscNL.fillAndSubmitPolHistoryDetail(polHistoryForMiscNLEntityListDataMNL, assertReference);
													if(polHistoryForMiscNLEntityListDataMNL.getBooleanValueForField("ConfigForwardButton")){
														//RK
														if(polHistoryForMiscNLEntityListDataMNL.getBooleanValueForField("ConfigRKGstPage")){
															RKGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
														}
														List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
														for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
																if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("edit")||provisionalPolDetailEntityData.getAction().equalsIgnoreCase("add"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																	policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																	if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){
																		//SE
																		if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigSEGstPage")){
																			SEGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
																		}
																		List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																		for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																				if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																					policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																					if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForCS")){
																						//SY
																						if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigSYGstPage")){
																							SYGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
																						}
																						List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
																						for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
																								if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("add")|| speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("edit")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
																									specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
																									if(speCondForMiscNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																										List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																										for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																												if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																													policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																												}
																											}
																										}
																									}


																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredInterestMiscNonLiabilityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws Exception {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Misc Liability Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);
					}

					///********* Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										/****Attribute in Insured Interest attribute Page after Click on proceed**********/
										List<PolInsIntAttrMNLEntity> riskDetailsFirstMiscEntityList=testData.getPolicyInsIntAttrMNLEntityRecords();
										for(PolInsIntAttrMNLEntity riskDetailsFirstMiscEntityData:riskDetailsFirstMiscEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFirstMiscEntityData.getChildKey())){
												if((riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("add")|| riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("edit")) && riskDetailsFirstMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeMiscNL policyInsuredIntrestAttributeMiscNL= new PolicyInsuredIntrestAttributeMiscNL(driver, "Risk Details", 0);
													policyInsuredIntrestAttributeMiscNL.fillandsubmitRiskDetailsOfT1PLRForMiscNL(riskDetailsFirstMiscEntityData, assertReference);
													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigForwardButton")||riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigDoubleForwordButton")){
														List<PolInsIntRiskDetMNLEntity> polInsIntRiskDetMNLEntityList=testData.getPolInsIntRiskDetMNLEntityRecords();
														for(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntityListData:polInsIntRiskDetMNLEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntRiskDetMNLEntityListData.getChildKey())){
																if((polInsIntRiskDetMNLEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntRiskDetMNLEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntRiskDetMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestRiskDetailsMiscNL policyInsuredIntrestRiskDetailsMiscNL= new PolicyInsuredIntrestRiskDetailsMiscNL(driver, "Risk Details", 0);
																	policyInsuredIntrestRiskDetailsMiscNL.fillandSubmitSpecialConditionForMiscNL(polInsIntRiskDetMNLEntityListData, assertReference);
																	if(polInsIntRiskDetMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||polInsIntRiskDetMNLEntityListData.getBooleanValueForField("ConfigForOthRskDetls")){
																		List<PolInsIntOthrRiskDMNLEntity> polInsIntOthrRiskDMNLEntityList=testData.getPolInsIntOthrRiskDMNLEntityRecords();
																		for(PolInsIntOthrRiskDMNLEntity polInsIntOthrRiskDMNLEntityListData:polInsIntOthrRiskDMNLEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntOthrRiskDMNLEntityListData.getChildKey())){
																				if((polInsIntOthrRiskDMNLEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntOthrRiskDMNLEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntOthrRiskDMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestOtherRiskDetailsMiscNL policyInsuredIntrestRiskDetailsMNL= new PolicyInsuredIntrestOtherRiskDetailsMiscNL(driver, "Risk Details");
																					policyInsuredIntrestRiskDetailsMNL.fillandSubmitPolicyInsuredIntrestOtherRiskDetailsMiscNLDetails(polInsIntOthrRiskDMNLEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member Attach Coverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
														List<StandCovDetForMiscNLEntity> standCovDetForMiscNLEntityList=testData.getstandCovDetForMiscNLEntityRecord();
														for(StandCovDetForMiscNLEntity standCovDetForMiscNLEntityListData:standCovDetForMiscNLEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(standCovDetForMiscNLEntityListData.getChildKey())){
																if((standCovDetForMiscNLEntityListData.getAction().equalsIgnoreCase("add")|| standCovDetForMiscNLEntityListData.getAction().equalsIgnoreCase("edit")) && standCovDetForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	StandardCoverDetailsForMiscNL standardCoverDetailsForMiscNL= new StandardCoverDetailsForMiscNL(driver, "StandardCoverDetailsForMiscNL");
																	standardCoverDetailsForMiscNL.fillandSubmitStandardCoverDetailsForMiscNL(standCovDetForMiscNLEntityListData, assertReference);

																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")||policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverPremiumlinkForAttchAttr")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeMiscNonLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")&& policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//

					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttributeMNLEntity> policyAttributeEntityListMNL=testData.getPolAttributeMNLEntityRecords();
						for(PolAttributeMNLEntity policyAttributeEntityListDataMNL:policyAttributeEntityListMNL){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListDataMNL.getChildKey())){
								if(policyAttributeEntityListDataMNL.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMiscNonLiability policyAttributeHealth=new PolicyAttributeMiscNonLiability(driver, "Policy Attribute Page",0);
									policyAttributeHealth.fillandSubmitPolicyAttributeMNLDetails(policyAttributeEntityListDataMNL, assertReference);
									if(policyAttributeEntityListDataMNL.getBooleanValueForField("ConfigForwordButton")){
										if(policyAttributeEntityListDataMNL.getBooleanValueForField("ConfigGSGstPage")){
											GSGstPageVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
										}
										List<PolHistoryForMiscNLEntity> polHistoryForMiscNLEntityList=testData.getPolHistoryForMiscNLEntityRecord();
										for(PolHistoryForMiscNLEntity polHistoryForMiscNLEntityListDataMNL:polHistoryForMiscNLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polHistoryForMiscNLEntityListDataMNL.getChildKey())){
												if((polHistoryForMiscNLEntityListDataMNL.getAction().equalsIgnoreCase("verify")) && polHistoryForMiscNLEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyHistoryForMiscNL policyHistoryForMiscNL=new PolicyHistoryForMiscNL(driver, "Policy Attribute Page");
													policyHistoryForMiscNL.fillAndSubmitPolHistoryDetail(polHistoryForMiscNLEntityListDataMNL, assertReference);
													if(polHistoryForMiscNLEntityListDataMNL.getBooleanValueForField("ConfigForwardButton")){
														//RK
														if(polHistoryForMiscNLEntityListDataMNL.getBooleanValueForField("ConfigRKGstPage")){
															RKGstPageVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
														}
														List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
														for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
																if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("verify"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																	policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																	if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){
																		//SE
																		if(polHistoryForMiscNLEntityListDataMNL.getBooleanValueForField("ConfigSEGstPage")){
																			SEGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
																		}
																		List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																		for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																				if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																					policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																					if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForCS")){
																						if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigSYGstPage")){
																							SYGstPageVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
																						}
																						List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
																						for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
																								if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("verify")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
																									specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
																									if(speCondForMiscNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																										List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																										for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																												if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																													policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																												}
																											}
																										}
																									}

																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredInterestMiscNonLiabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws Exception {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Misc Non Liability Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);


					///*************Policy Insured Interest Code  verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){{
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);

					}

					///*********** Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										/*****Attribute in Insured Interest attribute Page after Click on proceed**********/
										List<PolInsIntAttrMNLEntity> riskDetailsFirstMiscEntityList=testData.getPolicyInsIntAttrMNLEntityRecords();
										for(PolInsIntAttrMNLEntity riskDetailsFirstMiscEntityData:riskDetailsFirstMiscEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetailsFirstMiscEntityData.getChildKey())){
												if((riskDetailsFirstMiscEntityData.getAction().equalsIgnoreCase("verify")) && riskDetailsFirstMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeMiscNL policyInsuredIntrestAttributeMiscNL= new PolicyInsuredIntrestAttributeMiscNL(driver, "Risk Details", 0);
													policyInsuredIntrestAttributeMiscNL.fillandsubmitRiskDetailsOfT1PLRForMiscNL(riskDetailsFirstMiscEntityData, assertReference);
													if(riskDetailsFirstMiscEntityData.getBooleanValueForField("ConfigForwardButton")){
														List<PolInsIntRiskDetMNLEntity> polInsIntRiskDetMNLEntityList=testData.getPolInsIntRiskDetMNLEntityRecords();
														for(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntityListData:polInsIntRiskDetMNLEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntRiskDetMNLEntityListData.getChildKey())){
																if((polInsIntRiskDetMNLEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntRiskDetMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestRiskDetailsMiscNL policyInsuredIntrestRiskDetailsMiscNL= new PolicyInsuredIntrestRiskDetailsMiscNL(driver, "Risk Details", 0);
																	policyInsuredIntrestRiskDetailsMiscNL.fillandSubmitSpecialConditionForMiscNL(polInsIntRiskDetMNLEntityListData, assertReference);
																	if(polInsIntRiskDetMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||polInsIntRiskDetMNLEntityListData.getBooleanValueForField("ConfigForOthRskDetls")){
																		List<PolInsIntOthrRiskDMNLEntity> polInsIntOthrRiskDMNLEntityList=testData.getPolInsIntOthrRiskDMNLEntityRecords();
																		for(PolInsIntOthrRiskDMNLEntity polInsIntOthrRiskDMNLEntityListData:polInsIntOthrRiskDMNLEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntOthrRiskDMNLEntityListData.getChildKey())){
																				if((polInsIntOthrRiskDMNLEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntOthrRiskDMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestOtherRiskDetailsMiscNL policyInsuredIntrestRiskDetailsMNL= new PolicyInsuredIntrestOtherRiskDetailsMiscNL(driver, "Risk Details");
																					policyInsuredIntrestRiskDetailsMNL.fillandSubmitPolicyInsuredIntrestOtherRiskDetailsMiscNLDetails(polInsIntOthrRiskDMNLEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																}
															}
														}
														List<StandCovDetForMiscNLEntity> standCovDetForMiscNLEntityList=testData.getstandCovDetForMiscNLEntityRecord();
														for(StandCovDetForMiscNLEntity standCovDetForMiscNLEntityListData:standCovDetForMiscNLEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(standCovDetForMiscNLEntityListData.getChildKey())){
																if(standCovDetForMiscNLEntityListData.getAction().equalsIgnoreCase("verify") && standCovDetForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	StandardCoverDetailsForMiscNL standardCoverDetailsForMiscNL= new StandardCoverDetailsForMiscNL(driver, "StandardCoverDetailsForMiscNL");
																	standardCoverDetailsForMiscNL.fillandSubmitStandardCoverDetailsForMiscNL(standCovDetForMiscNLEntityListData, assertReference);

																}
															}
														}
													}

													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")||policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverPremiumlinkForAttchAttr")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
					}
				}
			}
		}
	}

	public void policyAttributeAviationEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttrAviationEntity> policyAttrAviationEntityList=testData.getPolicyAttrAviationEntityRecords();
						for(PolicyAttrAviationEntity policyAttrAviationEntityListData:policyAttrAviationEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrAviationEntityListData.getChildKey())){
								if((policyAttrAviationEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrAviationEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrAviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeAviation policyAttributeHealth=new PolicyAttributeAviation(driver, "Policy Attribute Page");
									policyAttributeHealth.fillandSubmitPolicyAttributeAviation(policyAttrAviationEntityListData, assertReference);
									if(policyAttrAviationEntityListData.getBooleanValueForField("ConfigForwordButton")){
										List<PolAttrInsHisT5POLEntity> polAttrInsHisT5POLEntityList=testData.getPolAttrInsHisT5POLEntityRecord();
										for(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntityListData:polAttrInsHisT5POLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polAttrInsHisT5POLEntityListData.getChildKey())){
												if((polAttrInsHisT5POLEntityListData.getAction().equalsIgnoreCase("add")|| polAttrInsHisT5POLEntityListData.getAction().equalsIgnoreCase("edit")) && polAttrInsHisT5POLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeInsuranceHistoryT5POLAviation policyAttributeInsuranceHistoryT5POLAviation=new PolicyAttributeInsuranceHistoryT5POLAviation(driver, "Policy Attribute Page");
													policyAttributeInsuranceHistoryT5POLAviation.fillAndSubmitPolicyAttributeInsuranceHistoryT5POLAviation(polAttrInsHisT5POLEntityListData,assertReference);
													if(polAttrInsHisT5POLEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeAviationVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttrAviationEntity> policyAttrAviationEntityList=testData.getPolicyAttrAviationEntityRecords();
						for(PolicyAttrAviationEntity policyAttrAviationEntityListData:policyAttrAviationEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrAviationEntityListData.getChildKey())){
								if((policyAttrAviationEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrAviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeAviation policyAttributeHealth=new PolicyAttributeAviation(driver, "Policy Attribute Page");
									policyAttributeHealth.fillandSubmitPolicyAttributeAviation(policyAttrAviationEntityListData, assertReference);
									if(policyAttrAviationEntityListData.getBooleanValueForField("ConfigForwordButton")){
										List<PolAttrInsHisT5POLEntity> polAttrInsHisT5POLEntityList=testData.getPolAttrInsHisT5POLEntityRecord();
										for(PolAttrInsHisT5POLEntity polAttrInsHisT5POLEntityListData:polAttrInsHisT5POLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polAttrInsHisT5POLEntityListData.getChildKey())){
												if((polAttrInsHisT5POLEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrInsHisT5POLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeInsuranceHistoryT5POLAviation policyAttributeInsuranceHistoryT5POLAviation=new PolicyAttributeInsuranceHistoryT5POLAviation(driver, "Policy Attribute Page");
													policyAttributeInsuranceHistoryT5POLAviation.fillAndSubmitPolicyAttributeInsuranceHistoryT5POLAviation(polAttrInsHisT5POLEntityListData,assertReference);
													if(polAttrInsHisT5POLEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigPremiumCalculat")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyInsuredInterestAviationEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| (memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButtonForAviation")){
										List<PolInsIntAvtEntity> polInsIntAvtEntityList=testData.getPolInsIntAvtEntityRecords();
										for(PolInsIntAvtEntity polInsIntAvtEntityListData:polInsIntAvtEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAvtEntityListData.getChildKey())){
												if((polInsIntAvtEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAvtEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAvtEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAviation policyInsuredIntrestAviation= new PolicyInsuredIntrestAviation(driver, "Policy Member Atrribute health ");
													policyInsuredIntrestAviation.fillandSubmitPolicyInsIntAviation(polInsIntAvtEntityListData, assertReference);
													if(polInsIntAvtEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<AviationRiskDT2Entity> aviationRiskDT2EntityList=testData.getAviationRiskDT2EntityRecords();
														for(AviationRiskDT2Entity aviationRiskDT2EntityListData:aviationRiskDT2EntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(aviationRiskDT2EntityListData.getChildKey())){
																if((aviationRiskDT2EntityListData.getAction().equalsIgnoreCase("add")|| aviationRiskDT2EntityListData.getAction().equalsIgnoreCase("edit")) && aviationRiskDT2EntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	AviationRiskDetailIIT2PLR aviationRiskDetailIIT2PLR= new AviationRiskDetailIIT2PLR(driver, "Policy Member Atrribute health ");
																	aviationRiskDetailIIT2PLR.fillandSubmitAviationRiskDetailIIT2(aviationRiskDT2EntityListData, assertReference);
																	if(aviationRiskDT2EntityListData.getBooleanValueForField("ConfigForwardButton")){
																		List<AviationRiskDT3Entity> aviationRiskDetailT3PLRList=testData.getAviationRiskDT3EntityRecords();
																		for(AviationRiskDT3Entity aviationRiskDetailT3PLRListData:aviationRiskDetailT3PLRList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(aviationRiskDetailT3PLRListData.getChildKey())){
																				if((aviationRiskDetailT3PLRListData.getAction().equalsIgnoreCase("add")|| aviationRiskDetailT3PLRListData.getAction().equalsIgnoreCase("edit")) && aviationRiskDetailT3PLRListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					AviationRiskDetailT3PLR aviationRiskDetailT3PLR= new AviationRiskDetailT3PLR(driver, "Policy Member Atrribute health ");
																					aviationRiskDetailT3PLR.fillandSubmitAviationRiskDetailT3(aviationRiskDetailT3PLRListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<AviStdCovAHT1PRCEntity> aviStdCovAHT1PRCEntityList=testData.getaviStdCovAHT1PRCEntityRecord();
																		for(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntityListData:aviStdCovAHT1PRCEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(aviStdCovAHT1PRCEntityListData.getChildKey())){
																				if((aviStdCovAHT1PRCEntityListData.getAction().equalsIgnoreCase("add")|| aviStdCovAHT1PRCEntityListData.getAction().equalsIgnoreCase("edit")) && aviStdCovAHT1PRCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					AviationStandardCoverAHT1PRC aviationStandardCoverAHT1PRC= new AviationStandardCoverAHT1PRC(driver, "Policy Member Atrribute health ");
																					aviationStandardCoverAHT1PRC.fillAndSubmitAviationStandardCoverAHT1PRCDetails(aviStdCovAHT1PRCEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForAHVerify")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
												//****************** Member Attach Coverage Attribute ********************//
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredInterestAviationVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButtonForAviation")){
										List<PolInsIntAvtEntity> polInsIntAvtEntityList=testData.getPolInsIntAvtEntityRecords();
										for(PolInsIntAvtEntity polInsIntAvtEntityListData:polInsIntAvtEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAvtEntityListData.getChildKey())){
												if((polInsIntAvtEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntAvtEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAviation policyInsuredIntrestAviation= new PolicyInsuredIntrestAviation(driver, "Policy Member Atrribute health ");
													policyInsuredIntrestAviation.fillandSubmitPolicyInsIntAviation(polInsIntAvtEntityListData, assertReference);
													if(polInsIntAvtEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<AviationRiskDT2Entity> aviationRiskDT2EntityList=testData.getAviationRiskDT2EntityRecords();
														for(AviationRiskDT2Entity aviationRiskDT2EntityListData:aviationRiskDT2EntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(aviationRiskDT2EntityListData.getChildKey())){
																if((aviationRiskDT2EntityListData.getAction().equalsIgnoreCase("verify")) && aviationRiskDT2EntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	AviationRiskDetailIIT2PLR aviationRiskDetailIIT2PLR= new AviationRiskDetailIIT2PLR(driver, "Policy Member Atrribute health ");
																	aviationRiskDetailIIT2PLR.fillandSubmitAviationRiskDetailIIT2(aviationRiskDT2EntityListData, assertReference);
																	if(aviationRiskDT2EntityListData.getBooleanValueForField("ConfigForwardButton")){
																		List<AviationRiskDT3Entity> aviationRiskDetailT3PLRList=testData.getAviationRiskDT3EntityRecords();
																		for(AviationRiskDT3Entity aviationRiskDetailT3PLRListData:aviationRiskDetailT3PLRList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(aviationRiskDetailT3PLRListData.getChildKey())){
																				if((aviationRiskDetailT3PLRListData.getAction().equalsIgnoreCase("verify")) && aviationRiskDetailT3PLRListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					AviationRiskDetailT3PLR aviationRiskDetailT3PLR= new AviationRiskDetailT3PLR(driver, "Policy Member Atrribute health ");
																					aviationRiskDetailT3PLR.fillandSubmitAviationRiskDetailT3(aviationRiskDetailT3PLRListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<AviStdCovAHT1PRCEntity> aviStdCovAHT1PRCEntityList=testData.getaviStdCovAHT1PRCEntityRecord();
																		for(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntityListData:aviStdCovAHT1PRCEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(aviStdCovAHT1PRCEntityListData.getChildKey())){
																				if((aviStdCovAHT1PRCEntityListData.getAction().equalsIgnoreCase("verify") && aviStdCovAHT1PRCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																					AviationStandardCoverAHT1PRC aviationStandardCoverAHT1PRC= new AviationStandardCoverAHT1PRC(driver, "Policy Member Atrribute health ");
																					aviationStandardCoverAHT1PRC.fillAndSubmitAviationStandardCoverAHT1PRCDetails(aviStdCovAHT1PRCEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}


													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")||policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForAHVerify")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigPremiumTabForAH")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}
												}
												//****************** Member Attach Coverage Attribute ********************//
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeFireEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttrFireEntity> policyAttributeFireList=testData.getPolicyAttributeFireRecord();
						for(PolAttrFireEntity policyAttributeFireListData:policyAttributeFireList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeFireListData.getChildKey())){
								if((policyAttributeFireListData.getAction().equalsIgnoreCase("add")|| policyAttributeFireListData.getAction().equalsIgnoreCase("edit")) && policyAttributeFireListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeFire policyAttributeHealth=new PolicyAttributeFire(driver, "Policy Attribute Page");
									policyAttributeHealth.fillandSubmitPolicyAttributeFire(policyAttributeFireListData, assertReference);
									if(policyAttributeFireListData.getBooleanValueForField("ConfigForwordButton")){
										List<SFStatIntermedFireEntity> sFStatIntermedFireEntityList=testData.getsFStatIntermedFireEntityRecord();
										for(SFStatIntermedFireEntity sFStatIntermedFireEntityListData: sFStatIntermedFireEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(sFStatIntermedFireEntityListData.getChildKey())){
												if((sFStatIntermedFireEntityListData.getAction().equalsIgnoreCase("add")|| sFStatIntermedFireEntityListData.getAction().equalsIgnoreCase("edit")) && sFStatIntermedFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeSFStatusOfIntermediariesFire policyAttributeSFStatusOfIntermediariesFire=new PolicyAttributeSFStatusOfIntermediariesFire(driver, "Type of Development Officer");
													policyAttributeSFStatusOfIntermediariesFire.fillandSubmitPolicyAttributeSFStatusOfIntermediariesFire(sFStatIntermedFireEntityListData, assertReference);
													if(sFStatIntermedFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<RiskFinanceDFireEntity> riskFinanceDFireEntityList=testData.getRiskFinanceDFireEntityRecord();
														for(RiskFinanceDFireEntity riskFinanceDFireEntityListData: riskFinanceDFireEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(riskFinanceDFireEntityListData.getChildKey())){
																if((riskFinanceDFireEntityListData.getAction().equalsIgnoreCase("add")|| riskFinanceDFireEntityListData.getAction().equalsIgnoreCase("edit")) && riskFinanceDFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeRiskFinanceDetailsFire policyAttributeRiskFinanceDetailsFire=new PolicyAttributeRiskFinanceDetailsFire(driver, "Risk Finance Details");
																	policyAttributeRiskFinanceDetailsFire.fillandSubmitPolicyAttributeRiskFinanceDetailsFire(riskFinanceDFireEntityListData, assertReference);
																	if(riskFinanceDFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("FD")){
																			policyAttributeDiscretionaryDiscountForFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeAddOnCoversDetailsFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LP")){
																			policyAttributeSpecialConditionFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeLPSFPolicyDetailFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LR")){
																			policyAttributeCapitalAdditionDetailsFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}

																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("SA")){
																			policyAttributeSecurityAndOtherInfoFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributePMLDetailFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}

																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("PE")){
																			policyAttributePERateFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeFirePEAddOnCovEnityEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("SF")){
																			policyAttributeSpecialConditionFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeAddOnCoversDetailsFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}

																		List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
																		for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
																				if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("add")|| provisionalPolDetailEntityData.getAction().equalsIgnoreCase("edit")) && provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																					policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																					if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){
																						List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																						for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																								if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																									policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																									if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForCS")){
																										List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
																										for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
																												if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("add")|| speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("edit")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
																													specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
																										if(speCondForMiscNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																											List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																											for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																												if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																													if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																														PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																														policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeFireVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttrFireEntity> policyAttributeFireList=testData.getPolicyAttributeFireRecord();
						for(PolAttrFireEntity policyAttributeFireListData:policyAttributeFireList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeFireListData.getChildKey())){
								if((policyAttributeFireListData.getAction().equalsIgnoreCase("verify")) && policyAttributeFireListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeFire policyAttributeHealth=new PolicyAttributeFire(driver, "Policy Attribute Page");
									policyAttributeHealth.fillandSubmitPolicyAttributeFire(policyAttributeFireListData, assertReference);
									if(policyAttributeFireListData.getBooleanValueForField("ConfigForwordButton")){
										List<SFStatIntermedFireEntity> sFStatIntermedFireEntityList=testData.getsFStatIntermedFireEntityRecord();
										for(SFStatIntermedFireEntity sFStatIntermedFireEntityListData: sFStatIntermedFireEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(sFStatIntermedFireEntityListData.getChildKey())){
												if((sFStatIntermedFireEntityListData.getAction().equalsIgnoreCase("verify")) && sFStatIntermedFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeSFStatusOfIntermediariesFire policyAttributeSFStatusOfIntermediariesFire=new PolicyAttributeSFStatusOfIntermediariesFire(driver, "Type of Development Officer");
													policyAttributeSFStatusOfIntermediariesFire.fillandSubmitPolicyAttributeSFStatusOfIntermediariesFire(sFStatIntermedFireEntityListData, assertReference);
													if(sFStatIntermedFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<RiskFinanceDFireEntity> riskFinanceDFireEntityList=testData.getRiskFinanceDFireEntityRecord();
														for(RiskFinanceDFireEntity riskFinanceDFireEntityListData: riskFinanceDFireEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(riskFinanceDFireEntityListData.getChildKey())){
																if((riskFinanceDFireEntityListData.getAction().equalsIgnoreCase("verify")) && riskFinanceDFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeRiskFinanceDetailsFire policyAttributeRiskFinanceDetailsFire=new PolicyAttributeRiskFinanceDetailsFire(driver, "Risk Finance Details");
																	policyAttributeRiskFinanceDetailsFire.fillandSubmitPolicyAttributeRiskFinanceDetailsFire(riskFinanceDFireEntityListData, assertReference);
																	if(riskFinanceDFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("FD")){
																			policyAttributeDiscretionaryDiscountForFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeAddOnCoversDetailsFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LP")){
																			policyAttributeSpecialConditionFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeLPSFPolicyDetailFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LR")){
																			policyAttributeCapitalAdditionDetailsFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("SA")){
																			policyAttributeSecurityAndOtherInfoFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributePMLDetailFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}

																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("PE")){
																			policyAttributePERateFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeFirePEAddOnCovEnityVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		if(riskFinanceDFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("SF")){
																			policyAttributeSpecialConditionFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																			policyAttributeAddOnCoversDetailsFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																		}
																		List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
																		for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
																			if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("verify")) && provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																				policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																				if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){
																					List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																					for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																						if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																							if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																								policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																								if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForCS")){
																									List<SpeCondForMiscNLEntity> speCondForMiscNLEntityList=testData.getSpeCondForMiscNLEntityRecord();
																									for(SpeCondForMiscNLEntity speCondForMiscNLEntityListData: speCondForMiscNLEntityList){
																										if(policyEntity.getParentKey().equalsIgnoreCase(speCondForMiscNLEntityListData.getChildKey())){
																											if((speCondForMiscNLEntityListData.getAction().equalsIgnoreCase("verify")) && speCondForMiscNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												SpecialConditionForMiscNL specialConditionForMiscNL=new SpecialConditionForMiscNL(driver, "Special Condition");
																												specialConditionForMiscNL.fillandSubmitSpecialConditionForMiscNL(speCondForMiscNLEntityListData, assertReference);
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredInterestFireEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										//
										List<PolInsIntAttrFireEntity> polInsIntAttrFireEntityList=testData.getPolInsIntAttrFireEntityRecord();
										for(PolInsIntAttrFireEntity polInsIntAttrFireEntityListData:polInsIntAttrFireEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrFireEntityListData.getChildKey())){
												if((polInsIntAttrFireEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttrFireEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttrFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeFire policyMemberAttributeHealth= new PolicyInsuredIntrestAttributeFire(driver, "Policy Member Atrribute health ");
													policyMemberAttributeHealth.fillandSubmitPolicyAttributeRiskFinanceDetailsFire(polInsIntAttrFireEntityListData, assertReference);
													if(polInsIntAttrFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<PolInsInttNetProFireEntity> polInsInttNetProFireEntityList=testData.getPolInsInttNetProFireEntityRecord();
														for(PolInsInttNetProFireEntity polInsInttNetProFireEntityListData:polInsInttNetProFireEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsInttNetProFireEntityListData.getChildKey())){
																if((polInsInttNetProFireEntityListData.getAction().equalsIgnoreCase("add")|| polInsInttNetProFireEntityListData.getAction().equalsIgnoreCase("edit")) && polInsInttNetProFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestNetProfitFire policyInsuredIntrestNetProfitFire= new PolicyInsuredIntrestNetProfitFire(driver, "Policy Member Atrribute health ");
																	policyInsuredIntrestNetProfitFire.fillandSubmitPolicyInsuredIntrestNetProfitFire(polInsInttNetProFireEntityListData, assertReference);
																	if(polInsInttNetProFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																		List<RiskDetIARPolFireEntity> riskDetIARPolFireEntityList=testData.getRiskDetIARPolFireEntityRecord();
																		for(RiskDetIARPolFireEntity riskDetIARPolFireEntityListData:riskDetIARPolFireEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(riskDetIARPolFireEntityListData.getChildKey())){
																				if((riskDetIARPolFireEntityListData.getAction().equalsIgnoreCase("add")|| riskDetIARPolFireEntityListData.getAction().equalsIgnoreCase("edit")) && riskDetIARPolFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestRiskDetailsIARPolicyFire policyInsuredIntrestRiskDetailsIARPolicyFire= new PolicyInsuredIntrestRiskDetailsIARPolicyFire(driver, "Policy Member Atrribute health ");
																					policyInsuredIntrestRiskDetailsIARPolicyFire.fillandSubmitPolicyInsuredIntrestRiskDetailsIARPolicyFire(riskDetIARPolFireEntityListData, assertReference);
																					if(polInsInttNetProFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																						List<PolInsIntSpeFieldsFireEntity> polInsIntSpeFieldsFireEntityList=testData.getPolInsIntSpeFieldsFireEntityRecord();
																						for(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntityListData:polInsIntSpeFieldsFireEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntSpeFieldsFireEntityListData.getChildKey())){
																								if((polInsIntSpeFieldsFireEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntSpeFieldsFireEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntSpeFieldsFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsuredIntrestSpecialFieldsFire policyInsuredIntrestSpecialFieldsFire= new PolicyInsuredIntrestSpecialFieldsFire(driver, "Policy Member Atrribute health ");
																									policyInsuredIntrestSpecialFieldsFire.fillandSubmitPolicyInsuredIntrestSpecialFieldsFire(polInsIntSpeFieldsFireEntityListData, assertReference);
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	//Risk  Cover Prop Page
																	List<RiskCoverPropertyFireEntity> riskCoverPropertyFireEntityList=testData.getRiskCoverPropertyFireEntityRecord();
																	for(RiskCoverPropertyFireEntity riskCoverPropertyFireEntityListData: riskCoverPropertyFireEntityList){
																		if(policyEntity.getParentKey().equalsIgnoreCase(riskCoverPropertyFireEntityListData.getChildKey())){
																			if((riskCoverPropertyFireEntityListData.getAction().equalsIgnoreCase("add")|| riskCoverPropertyFireEntityListData.getAction().equalsIgnoreCase("edit")) && riskCoverPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolInsIntAttachCovAttrRiskCoverPropertyFire polInsIntAttachCovAttrRiskCoverPropertyFire=new PolInsIntAttachCovAttrRiskCoverPropertyFire(driver,"Policy Member AttachCoverages Attribute");
																				polInsIntAttachCovAttrRiskCoverPropertyFire.fillandSubmitPolicyInsuredIntrestRiskCoverPropertyFire(riskCoverPropertyFireEntityListData, assertReference);
																				//LR Nilesh
																				if(riskCoverPropertyFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LR")){
																					lRPRCADDEnityEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
																				}

																				//checkPlantSIbreak 
																				if(riskCoverPropertyFireEntityListData.getBooleanValueForField("ConfigCheckPlantSIbreak")){
																					List<AttCovAttrChkPltSIbrkEntity> attCovAttrChkPltSIbrkEntityList=testData.getAttCovAttrChkPltSIbrkEntityRecord();
																					for(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntityListData: attCovAttrChkPltSIbrkEntityList ){
																						if(policyEntity.getParentKey().equalsIgnoreCase(attCovAttrChkPltSIbrkEntityListData.getChildKey())){
																							if((attCovAttrChkPltSIbrkEntityListData.getAction().equalsIgnoreCase("add")|| attCovAttrChkPltSIbrkEntityListData.getAction().equalsIgnoreCase("edit")) && attCovAttrChkPltSIbrkEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolInsIntAttachCovAttrCheckPlantSIbreakFire polInsIntAttachCovAttrCheckPlantSIbreakFire= new PolInsIntAttachCovAttrCheckPlantSIbreakFire(driver, "Policy Member Atrribute Check Plant SI break  ");
																								polInsIntAttachCovAttrCheckPlantSIbreakFire.fillandSubmitfillPolInsIntAttachCovAttrCheckPlantSIbreakFire(attCovAttrChkPltSIbrkEntityListData, assertReference);
																							}
																						}
																					}
																				}
																				//Utility Page
																				if(riskCoverPropertyFireEntityListData.getBooleanValueForField("ConfigUtility")){
																					List<AttachCovAttrUtilityEntity> attachCovAttrUtilityEntityList=testData.getAttachCovAttrUtilityEntityRecord();
																					for(AttachCovAttrUtilityEntity attachCovAttrUtilityEntityyListData: attachCovAttrUtilityEntityList ){
																						if(policyEntity.getParentKey().equalsIgnoreCase(attachCovAttrUtilityEntityyListData.getChildKey())){
																							if((attachCovAttrUtilityEntityyListData.getAction().equalsIgnoreCase("add")|| attachCovAttrUtilityEntityyListData.getAction().equalsIgnoreCase("edit")) && attachCovAttrUtilityEntityyListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolInsIntAttachCovAttrUtilityFire polInsIntAttachCovAttrUtilityFire= new PolInsIntAttachCovAttrUtilityFire(driver, "Policy Member Atrribute Utility Fire Page ");
																								polInsIntAttachCovAttrUtilityFire.fillandSubmitfillPolInsIntAttachCovAttrUtilityFire(attachCovAttrUtilityEntityyListData, assertReference);

																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}

															}
														}
													}

													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForFire")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}


													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}
												}
												//	***************** Member Attach Coverage Attribute ******************** 
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}




	public void policyInsuredInteresFireVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify") && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										//
										List<PolInsIntAttrFireEntity> polInsIntAttrFireEntityList=testData.getPolInsIntAttrFireEntityRecord();
										for(PolInsIntAttrFireEntity polInsIntAttrFireEntityListData:polInsIntAttrFireEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrFireEntityListData.getChildKey())){
												if(polInsIntAttrFireEntityListData.getAction().equalsIgnoreCase("verify") && polInsIntAttrFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeFire policyMemberAttributeHealth= new PolicyInsuredIntrestAttributeFire(driver, "Policy Member Atrribute health ");
													policyMemberAttributeHealth.fillandSubmitPolicyAttributeRiskFinanceDetailsFire(polInsIntAttrFireEntityListData, assertReference);
													if(polInsIntAttrFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
														List<PolInsInttNetProFireEntity> polInsInttNetProFireEntityList=testData.getPolInsInttNetProFireEntityRecord();
														for(PolInsInttNetProFireEntity polInsInttNetProFireEntityListData:polInsInttNetProFireEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsInttNetProFireEntityListData.getChildKey())){
																if(polInsInttNetProFireEntityListData.getAction().equalsIgnoreCase("verify") && polInsInttNetProFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestNetProfitFire policyInsuredIntrestNetProfitFire= new PolicyInsuredIntrestNetProfitFire(driver, "Policy Member Atrribute health ");
																	policyInsuredIntrestNetProfitFire.fillandSubmitPolicyInsuredIntrestNetProfitFire(polInsInttNetProFireEntityListData, assertReference);
																	if(polInsInttNetProFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																		List<RiskDetIARPolFireEntity> riskDetIARPolFireEntityList=testData.getRiskDetIARPolFireEntityRecord();
																		for(RiskDetIARPolFireEntity riskDetIARPolFireEntityListData:riskDetIARPolFireEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(riskDetIARPolFireEntityListData.getChildKey())){
																				if(riskDetIARPolFireEntityListData.getAction().equalsIgnoreCase("verify") && riskDetIARPolFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestRiskDetailsIARPolicyFire policyInsuredIntrestRiskDetailsIARPolicyFire= new PolicyInsuredIntrestRiskDetailsIARPolicyFire(driver, "Policy Member Atrribute health ");
																					policyInsuredIntrestRiskDetailsIARPolicyFire.fillandSubmitPolicyInsuredIntrestRiskDetailsIARPolicyFire(riskDetIARPolFireEntityListData, assertReference);
																					if(polInsInttNetProFireEntityListData.getBooleanValueForField("ConfigForwordButton")){
																						List<PolInsIntSpeFieldsFireEntity> polInsIntSpeFieldsFireEntityList=testData.getPolInsIntSpeFieldsFireEntityRecord();
																						for(PolInsIntSpeFieldsFireEntity polInsIntSpeFieldsFireEntityListData:polInsIntSpeFieldsFireEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntSpeFieldsFireEntityListData.getChildKey())){
																								if(polInsIntSpeFieldsFireEntityListData.getAction().equalsIgnoreCase("verify") && polInsIntSpeFieldsFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsuredIntrestSpecialFieldsFire policyInsuredIntrestSpecialFieldsFire= new PolicyInsuredIntrestSpecialFieldsFire(driver, "Policy Member Atrribute health ");
																									policyInsuredIntrestSpecialFieldsFire.fillandSubmitPolicyInsuredIntrestSpecialFieldsFire(polInsIntSpeFieldsFireEntityListData, assertReference);
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					/************************AttributeEnd**********/
					//******************************* Member Attach Coverage Page  ************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	//Risk  Cover Prop Page
																	List<RiskCoverPropertyFireEntity> riskCoverPropertyFireEntityList=testData.getRiskCoverPropertyFireEntityRecord();
																	for(RiskCoverPropertyFireEntity riskCoverPropertyFireEntityListData: riskCoverPropertyFireEntityList){
																		if(policyEntity.getParentKey().equalsIgnoreCase(riskCoverPropertyFireEntityListData.getChildKey())){
																			if(riskCoverPropertyFireEntityListData.getAction().equalsIgnoreCase("verify")&& riskCoverPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolInsIntAttachCovAttrRiskCoverPropertyFire polInsIntAttachCovAttrRiskCoverPropertyFire=new PolInsIntAttachCovAttrRiskCoverPropertyFire(driver,"Policy Member AttachCoverages Attribute");
																				polInsIntAttachCovAttrRiskCoverPropertyFire.fillandSubmitPolicyInsuredIntrestRiskCoverPropertyFire(riskCoverPropertyFireEntityListData, assertReference);
																				//LR Nilesh
																				if(riskCoverPropertyFireEntityListData.getStringValueForField("Product").equalsIgnoreCase("LR")){
																					lRPRCADDEnityVerifyHelper(testData, executionTestStep, assertReference, driver, policyEntity, stepGroup);	
																				}

																				//checkPlantSIbreak 
																				if(riskCoverPropertyFireEntityListData.getBooleanValueForField("ConfigCheckPlantSIbreak")){
																					List<AttCovAttrChkPltSIbrkEntity> attCovAttrChkPltSIbrkEntityList=testData.getAttCovAttrChkPltSIbrkEntityRecord();
																					for(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntityListData: attCovAttrChkPltSIbrkEntityList ){
																						if(policyEntity.getParentKey().equalsIgnoreCase(attCovAttrChkPltSIbrkEntityListData.getChildKey())){
																							if(attCovAttrChkPltSIbrkEntityListData.getAction().equalsIgnoreCase("verify") && attCovAttrChkPltSIbrkEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolInsIntAttachCovAttrCheckPlantSIbreakFire polInsIntAttachCovAttrCheckPlantSIbreakFire= new PolInsIntAttachCovAttrCheckPlantSIbreakFire(driver, "Policy Member Atrribute Check Plant SI break  ");
																								polInsIntAttachCovAttrCheckPlantSIbreakFire.fillandSubmitfillPolInsIntAttachCovAttrCheckPlantSIbreakFire(attCovAttrChkPltSIbrkEntityListData, assertReference);
																							}
																						}
																					}
																				}
																				//Utility Page
																				if(riskCoverPropertyFireEntityListData.getBooleanValueForField("ConfigUtility")){
																					List<AttachCovAttrUtilityEntity> attachCovAttrUtilityEntityList=testData.getAttachCovAttrUtilityEntityRecord();
																					for(AttachCovAttrUtilityEntity attachCovAttrUtilityEntityyListData: attachCovAttrUtilityEntityList ){
																						if(policyEntity.getParentKey().equalsIgnoreCase(attachCovAttrUtilityEntityyListData.getChildKey())){
																							if(attachCovAttrUtilityEntityyListData.getAction().equalsIgnoreCase("verify")&& attachCovAttrUtilityEntityyListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								PolInsIntAttachCovAttrUtilityFire polInsIntAttachCovAttrUtilityFire= new PolInsIntAttachCovAttrUtilityFire(driver, "Policy Member Atrribute Utility Fire Page ");
																								polInsIntAttachCovAttrUtilityFire.fillandSubmitfillPolInsIntAttachCovAttrUtilityFire(attachCovAttrUtilityEntityyListData, assertReference);

																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}

															}
														}
													}

													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForFire")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify") && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
												//	***************** Member Attach Coverage Attribute ******************** 
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}




	public void policyAttributeDiscretionaryDiscountForFireEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Discretionary Discount Page </i></B>");
		List<PolAttrDiscretDisEngEntity> polAttrDiscretDisEngEntityList=testData.getPolAttrDiscretDisEngEntityRecord();
		for(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntityListdata:polAttrDiscretDisEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrDiscretDisEngEntityListdata.getChildKey())){
				if((polAttrDiscretDisEngEntityListdata.getAction().equalsIgnoreCase("add")||polAttrDiscretDisEngEntityListdata.getAction().equalsIgnoreCase("edit")) && polAttrDiscretDisEngEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeDiscretionaryDiscountForEng policyAttributeDiscretionaryDiscountForEng=new PolicyAttributeDiscretionaryDiscountForEng(driver, "Policy Insured Atttributes Discretionary Discount Page");
					policyAttributeDiscretionaryDiscountForEng.fillandSubmitPolicyAttributeDiscretionaryDiscountForEng(polAttrDiscretDisEngEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttrDiscretDisEngEntityListdata);
				}
			}
		}
	}
	public void policyAttributeAddOnCoversDetailsFireEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttrAOCDetEngEntity> polAttrAOCDetEngEntityList=testData.getPolAttrAOCDetEngEntityRecord();
		for(PolAttrAOCDetEngEntity polAttrAOCDetEngEntityListdata:polAttrAOCDetEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrAOCDetEngEntityListdata.getChildKey())){
				if((polAttrAOCDetEngEntityListdata.getAction().equalsIgnoreCase("add")||polAttrAOCDetEngEntityListdata.getAction().equalsIgnoreCase("edit")) && polAttrAOCDetEngEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeAddOnCoversDetailsEngineering policyAttributeAddOnCoversDetailsEngineering=new PolicyAttributeAddOnCoversDetailsEngineering(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeAddOnCoversDetailsEngineering.fillandSubmitPolicyAttributeAddOnCoversDetailsEngineering(polAttrAOCDetEngEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttrAOCDetEngEntityListdata);
				}
			}
		}
	}
	public void policyAttributeDiscretionaryDiscountForFireVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Discretionary Discount Page </i></B>");
		List<PolAttrDiscretDisEngEntity> polAttrDiscretDisEngEntityList=testData.getPolAttrDiscretDisEngEntityRecord();
		for(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntityListdata:polAttrDiscretDisEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrDiscretDisEngEntityListdata.getChildKey())){
				if(polAttrDiscretDisEngEntityListdata.getAction().equalsIgnoreCase("verify") && polAttrDiscretDisEngEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeDiscretionaryDiscountForEng policyAttributeDiscretionaryDiscountForEng=new PolicyAttributeDiscretionaryDiscountForEng(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeDiscretionaryDiscountForEng.fillandSubmitPolicyAttributeDiscretionaryDiscountForEng(polAttrDiscretDisEngEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttrDiscretDisEngEntityListdata);
				}
			}
		}
	}
	public void policyAttributeAddOnCoversDetailsFireVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttrAOCDetEngEntity> polAttrAOCDetEngEntityList=testData.getPolAttrAOCDetEngEntityRecord();
		for(PolAttrAOCDetEngEntity polAttrAOCDetEngEntityListdata:polAttrAOCDetEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrAOCDetEngEntityListdata.getChildKey())){
				if(polAttrAOCDetEngEntityListdata.getAction().equalsIgnoreCase("verify") && polAttrAOCDetEngEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeAddOnCoversDetailsEngineering policyAttributeAddOnCoversDetailsEngineering=new PolicyAttributeAddOnCoversDetailsEngineering(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeAddOnCoversDetailsEngineering.fillandSubmitPolicyAttributeAddOnCoversDetailsEngineering(polAttrAOCDetEngEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttrAOCDetEngEntityListdata);
				}
			}
		}
	}
	public void policyAttributeLPSFPolicyDetailFireEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttLPSFPolDetEntity> polAttLPSFPolDetEntityList=testData.getPolAttLPSFPolDetEntityRecord();
		for(PolAttLPSFPolDetEntity polAttLPSFPolDetEntityListdata:polAttLPSFPolDetEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttLPSFPolDetEntityListdata.getChildKey())){
				if((polAttLPSFPolDetEntityListdata.getAction().equalsIgnoreCase("add")||polAttLPSFPolDetEntityListdata.getAction().equalsIgnoreCase("edit")) && policyEntity.getStepGroup().equalsIgnoreCase(polAttLPSFPolDetEntityListdata.getStepGroup())){
					PolicyAttributeLPSFPolicyDetailFire policyAttributeLPSFPolicyDetailFire=new PolicyAttributeLPSFPolicyDetailFire(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeLPSFPolicyDetailFire.fillandSubmitPolicyAttributeLPSFPolicyDetailFire(polAttLPSFPolDetEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttLPSFPolDetEntityListdata);
				}
			}
		}
	}
	public void policyAttributeSpecialConditionFireEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttSpeCondFireEntity> polAttSpeCondFireEntityList=testData.getPolAttSpeCondFireEntityRecord();
		for(PolAttSpeCondFireEntity polAttSpeCondFireEntityListdata:polAttSpeCondFireEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttSpeCondFireEntityListdata.getChildKey())){
				if(polAttSpeCondFireEntityListdata.getAction().equalsIgnoreCase("add")||polAttSpeCondFireEntityListdata.getAction().equalsIgnoreCase("edit") && polAttSpeCondFireEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeSpecialConditionFire policyAttributeSpecialConditionFire=new PolicyAttributeSpecialConditionFire(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeSpecialConditionFire.fillandSubmitPolicyAttributeSpecialConditionFire(polAttSpeCondFireEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttSpeCondFireEntityListdata);
				}
			}
		}
	}
	public void policyAttributeLPSFPolicyDetailFireVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttLPSFPolDetEntity> polAttLPSFPolDetEntityList=testData.getPolAttLPSFPolDetEntityRecord();
		for(PolAttLPSFPolDetEntity polAttLPSFPolDetEntityListdata:polAttLPSFPolDetEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttLPSFPolDetEntityListdata.getChildKey())){
				if(polAttLPSFPolDetEntityListdata.getAction().equalsIgnoreCase("verify")&& polAttLPSFPolDetEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeLPSFPolicyDetailFire policyAttributeLPSFPolicyDetailFire=new PolicyAttributeLPSFPolicyDetailFire(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeLPSFPolicyDetailFire.fillandSubmitPolicyAttributeLPSFPolicyDetailFire(polAttLPSFPolDetEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttLPSFPolDetEntityListdata);
				}
			}
		}
	}
	public void policyAttributeSpecialConditionFireVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<PolAttSpeCondFireEntity> polAttSpeCondFireEntityList=testData.getPolAttSpeCondFireEntityRecord();
		for(PolAttSpeCondFireEntity polAttSpeCondFireEntityListdata:polAttSpeCondFireEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttSpeCondFireEntityListdata.getChildKey())){
				if(polAttSpeCondFireEntityListdata.getAction().equalsIgnoreCase("verify") && polAttSpeCondFireEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeSpecialConditionFire policyAttributeSpecialConditionFire=new PolicyAttributeSpecialConditionFire(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					policyAttributeSpecialConditionFire.fillandSubmitPolicyAttributeSpecialConditionFire(polAttSpeCondFireEntityListdata, assertReference);
					testData.updateRecordsForCriteria(polAttSpeCondFireEntityListdata);
				}
			}
		}
	}
	public void policyAttributeCapitalAdditionDetailsFireEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<CapitalAdditionDetailsEntity> capitalAdditionDetailsEntityList=testData.getCapitalAdditionDetailsEntityRecord();
		for(CapitalAdditionDetailsEntity capitalAdditionDetailsEntityListdata:capitalAdditionDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(capitalAdditionDetailsEntityListdata.getChildKey())){
				if(capitalAdditionDetailsEntityListdata.getAction().equalsIgnoreCase("add")||capitalAdditionDetailsEntityListdata.getAction().equalsIgnoreCase("edit") && capitalAdditionDetailsEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					CapitalAdditionDetails capitalAdditionDetails=new CapitalAdditionDetails(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					capitalAdditionDetails.fillandSubmitfillPolicyAttributeCapitalAdditionDetails(capitalAdditionDetailsEntityListdata, assertReference);
					testData.updateRecordsForCriteria(capitalAdditionDetailsEntityListdata);
				}
			}
		}
	}
	public void policyAttributeCapitalAdditionDetailsFireVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Add On Covers Details Page </i></B>");
		List<CapitalAdditionDetailsEntity> capitalAdditionDetailsEntityList=testData.getCapitalAdditionDetailsEntityRecord();
		for(CapitalAdditionDetailsEntity capitalAdditionDetailsEntityListdata:capitalAdditionDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(capitalAdditionDetailsEntityListdata.getChildKey())){
				if(capitalAdditionDetailsEntityListdata.getAction().equalsIgnoreCase("verify") && capitalAdditionDetailsEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
					CapitalAdditionDetails capitalAdditionDetails=new CapitalAdditionDetails(driver, "Policy Insured Atttributes Tailor Premium Details Page");
					capitalAdditionDetails.fillandSubmitfillPolicyAttributeCapitalAdditionDetails(capitalAdditionDetailsEntityListdata, assertReference);
					testData.updateRecordsForCriteria(capitalAdditionDetailsEntityListdata);
				}
			}
		}
	}
	//Fire-sonali Edit Helper
	public void policyAttributeSecurityAndOtherInfoFireEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Discretionary Discount Page </i></B>");
		List<SecurityAndOthrInfoEntity> securityAndOthrInfoEntity=testData.getSecurityAndOthrInfoEntityRecords();
		for(SecurityAndOthrInfoEntity securityAndOthrInfoEntitydata:securityAndOthrInfoEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(securityAndOthrInfoEntitydata.getChildKey())){
				if(securityAndOthrInfoEntitydata.getAction().equalsIgnoreCase("add")||securityAndOthrInfoEntitydata.getAction().equalsIgnoreCase("edit") && securityAndOthrInfoEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeSecurityAndOthrInfoFire policyAttributeSecurityAndOthrInfoFire=new PolicyAttributeSecurityAndOthrInfoFire(driver, "Policy Atttribute Security and other Information Details Page");
					policyAttributeSecurityAndOthrInfoFire.fillAndSubmitPolicyAttributeSecurityAndOthrInfoFire(securityAndOthrInfoEntitydata, assertReference);
					testData.updateRecordsForCriteria(securityAndOthrInfoEntitydata);
				}
			}
		}
	}

	public void policyAttributePMLDetailFireEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Atttributes PML Details Fire Page </i></B>");
		List<PmlDetailsEntity> pmlDetailsEntity=testData.getPmlDetailsEntityRecords();
		for(PmlDetailsEntity pmlDetailsEntitydata:pmlDetailsEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(pmlDetailsEntitydata.getChildKey())){
				if(pmlDetailsEntitydata.getAction().equalsIgnoreCase("add")||pmlDetailsEntitydata.getAction().equalsIgnoreCase("edit") && pmlDetailsEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PmlDetails pmlDetails=new PmlDetails(driver, "Policy Atttribute Security and other Information Details Page");
					pmlDetails.fillandSubmitPolicyAttributePmlDetails(pmlDetailsEntitydata, assertReference);
					testData.updateRecordsForCriteria(pmlDetailsEntitydata);
				}
			}
		}
	}

	public void policyAttributePERateFireEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Atttributes PE Rate Fire Page </i></B>");
		List<FirePERateEntity> firePERateEntity=testData.getFirePERateEntityRecords();
		for(FirePERateEntity firePERateEntitydata:firePERateEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(firePERateEntitydata.getChildKey())){
				if((firePERateEntitydata.getAction().equalsIgnoreCase("add")||firePERateEntitydata.getAction().equalsIgnoreCase("edit")) && firePERateEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolAttrPERate polAttrPERate=new PolAttrPERate(driver, "Policy Atttribute Security and other Information Details Page");
					polAttrPERate.fillandSubmitPolicyAttributeFire(firePERateEntitydata, assertReference);
					testData.updateRecordsForCriteria(firePERateEntitydata);
				}
			}
		}
	}

	public void policyAttributeFirePEAddOnCovEnityEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Atttributes Fire PE Add On Cov Enity Page </i></B>");
		List<FirePEAddOnCovEnity> firePEAddOnCovEnity=testData.getFirePEAddOnCovEnityRecords();
		for(FirePEAddOnCovEnity firePEAddOnCovEnitydata:firePEAddOnCovEnity){
			if(policyEntity.getParentKey().equalsIgnoreCase(firePEAddOnCovEnitydata.getChildKey())){
				if(firePEAddOnCovEnitydata.getAction().equalsIgnoreCase("add")||firePEAddOnCovEnitydata.getAction().equalsIgnoreCase("edit") && firePEAddOnCovEnitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolAttrAddOnCovers polAttrAddOnCovers=new PolAttrAddOnCovers(driver, "Policy Atttribute Security and other Information Details Page");
					polAttrAddOnCovers.fillandSubmitPolicyAttributeFire(firePEAddOnCovEnitydata, assertReference);
					testData.updateRecordsForCriteria(firePEAddOnCovEnitydata);
				}
			}
		}
	}
	//LR nilesh
	public void lRPRCADDEnityEditHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		List<LRPRCADDFireEntity> lRPRCADDFireEntityList=testData.getLRPRCADDFireEntityRecord();
		for(LRPRCADDFireEntity lRPRCADDFireEntityListData: lRPRCADDFireEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(lRPRCADDFireEntityListData.getChildKey())){
				if((lRPRCADDFireEntityListData.getAction().equalsIgnoreCase("add")|| lRPRCADDFireEntityListData.getAction().equalsIgnoreCase("edit")) && lRPRCADDFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					LRPRCADD lrPRCADD= new LRPRCADD(driver, "Policy Member Atrribute LRPRCADDFire  ");
					lrPRCADD.fillandSubmitLRPRCADDFire(lRPRCADDFireEntityListData, assertReference);
				}
			}
		}
	}
	//LR nilesh
	public void lRPRCADDEnityVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		List<LRPRCADDFireEntity> lRPRCADDFireEntityList=testData.getLRPRCADDFireEntityRecord();
		for(LRPRCADDFireEntity lRPRCADDFireEntityListData: lRPRCADDFireEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(lRPRCADDFireEntityListData.getChildKey())){
				if(lRPRCADDFireEntityListData.getAction().equalsIgnoreCase("verify") && lRPRCADDFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					LRPRCADD lrPRCADD= new LRPRCADD(driver, "Policy Member Atrribute LRPRCADD Verify Fire");
					lrPRCADD.fillandSubmitLRPRCADDFire(lRPRCADDFireEntityListData, assertReference);
				}
			}
		}
	}

	//Verify Helper
	public void policyAttributeSecurityAndOtherInfoFireVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Discretionary Discount Page </i></B>");
		List<SecurityAndOthrInfoEntity> securityAndOthrInfoEntity=testData.getSecurityAndOthrInfoEntityRecords();
		for(SecurityAndOthrInfoEntity securityAndOthrInfoEntitydata:securityAndOthrInfoEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(securityAndOthrInfoEntitydata.getChildKey())){
				if(securityAndOthrInfoEntitydata.getAction().equalsIgnoreCase("Verify")&& securityAndOthrInfoEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeSecurityAndOthrInfoFire policyAttributeSecurityAndOthrInfoFire=new PolicyAttributeSecurityAndOthrInfoFire(driver, "Policy Atttribute Security and other Information Details Page");
					policyAttributeSecurityAndOthrInfoFire.fillAndSubmitPolicyAttributeSecurityAndOthrInfoFire(securityAndOthrInfoEntitydata, assertReference);
					testData.updateRecordsForCriteria(securityAndOthrInfoEntitydata);
				}
			}
		}
	}

	public void policyAttributePMLDetailFireVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Atttributes Discretionary Discount Page </i></B>");
		List<PmlDetailsEntity> pmlDetailsEntity=testData.getPmlDetailsEntityRecords();
		for(PmlDetailsEntity pmlDetailsEntitydata:pmlDetailsEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(pmlDetailsEntitydata.getChildKey())){
				if(pmlDetailsEntitydata.getAction().equalsIgnoreCase("Verify") && pmlDetailsEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PmlDetails pmlDetails=new PmlDetails(driver, "Policy Atttribute Security and other Information Details Page");
					pmlDetails.fillandSubmitPolicyAttributePmlDetails(pmlDetailsEntitydata, assertReference);
					testData.updateRecordsForCriteria(pmlDetailsEntitydata);
				}
			}
		}
	}

	public void policyAttributePERateFireVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Atttributes PE Rate Fire Page </i></B>");
		List<FirePERateEntity> firePERateEntity=testData.getFirePERateEntityRecords();
		for(FirePERateEntity firePERateEntitydata:firePERateEntity){
			if(policyEntity.getParentKey().equalsIgnoreCase(firePERateEntitydata.getChildKey())){
				if(firePERateEntitydata.getAction().equalsIgnoreCase("Verify") && firePERateEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolAttrPERate polAttrPERate=new PolAttrPERate(driver, "Policy Atttribute Security and other Information Details Page");
					polAttrPERate.fillandSubmitPolicyAttributeFire(firePERateEntitydata, assertReference);
					testData.updateRecordsForCriteria(firePERateEntitydata);
				}
			}
		}
	}

	public void policyAttributeFirePEAddOnCovEnityVerifyHelper (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Atttributes Fire PE Add On Cov Enity Page </i></B>");
		List<FirePEAddOnCovEnity> firePEAddOnCovEnity=testData.getFirePEAddOnCovEnityRecords();
		for(FirePEAddOnCovEnity firePEAddOnCovEnitydata:firePEAddOnCovEnity){
			if(policyEntity.getParentKey().equalsIgnoreCase(firePEAddOnCovEnitydata.getChildKey())){
				if(firePEAddOnCovEnitydata.getAction().equalsIgnoreCase("Verify") && firePEAddOnCovEnitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolAttrAddOnCovers polAttrAddOnCovers=new PolAttrAddOnCovers(driver, "Policy Atttribute Security and other Information Details Page");
					polAttrAddOnCovers.fillandSubmitPolicyAttributeFire(firePEAddOnCovEnitydata, assertReference);
					testData.updateRecordsForCriteria(firePEAddOnCovEnitydata);
				}
			}
		}
	}
	//Abhijit 
	public void policyAttributeMicroInsuranceEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Micro Insurance Edit Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttributeRuralEntity> policyAttributeRuralEntityList=testData.getPolicyAttributeRuralEntityRecords();
						for(PolicyAttributeRuralEntity policyAttributeRuralEntityListData:policyAttributeRuralEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeRuralEntityListData.getChildKey())){
								if((policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("add")|| policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeRural policyAttributeRural=new PolicyAttributeRural(driver, "Policy Attribute Rural Page");
									policyAttributeRural.fillandSubmitPolicyAttributeRural(policyAttributeRuralEntityListData, assertReference);
									if(policyAttributeRuralEntityListData.getBooleanValueForField("ConfigRKGstPage")){
										RKGstPageEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,policyEntity);
									}

									if(policyAttributeRuralEntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
										for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
												if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
													policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
													if(policyAttributeRuralEntityListData.getStringValueForField("Product").equalsIgnoreCase("YM")){
														policyAttributeGSTParamEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
													}
													if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
														List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
														for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParamPage=new PolicyAttrributeGstUpadateParam(driver, "Type of Development Officer");
																	policyAttrributeGstUpadateParamPage.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}	


	//Abhijit

	public void policyInsuredIntrestMicroInsuranceEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Micro Insurance Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					/////*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Intrest Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										List<PolInsIntAttRiskDet1Entity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntAttRiskDet1RRLEntityRecords();
										for(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
												if((polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInterestAttributeRiskDetail1Rural policyInsuredInterestAttributeRiskDetail1Rural= new PolicyInsuredInterestAttributeRiskDetail1Rural(driver, "Policy Member Atrribute health");
													policyInsuredInterestAttributeRiskDetail1Rural.fillandSubmitPolicyInsuredInterestAttributeRiskDetail1Rural(polInsIntAttRiskDet1RRLEntityListData, assertReference);

												}

											}
										}
										List<RiskDetails2RuralEntity> riskDetails2RuralEntityList=testData.getRiskDetails2RuralEntityRecords();
										for(RiskDetails2RuralEntity riskDetails2RuralEntityListData:riskDetails2RuralEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(riskDetails2RuralEntityListData.getChildKey())){
												if((riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("add")|| riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("edit")) && riskDetails2RuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													RiskDetail2Rural riskDetails2Rural= new RiskDetail2Rural(driver, "RiskDetail2Rural");
													riskDetails2Rural.fillandsubmitRiskDetailsRural(riskDetails2RuralEntityListData, assertReference);

												}
											}
										}
									}
								}
							}
						}

					}
					/******************************AttributeEnd**********/
					//************************************* Member Attach Coverage Page  ******************************//

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/***********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit") ) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/*******************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<LoadDiscntDetRuralEntity> loadDiscntDetRuralEntityList=testData.getLoadDiscntDetRuralEntityRecords();
																		for(LoadDiscntDetRuralEntity loadDiscntDetRuralEntityListData: loadDiscntDetRuralEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(loadDiscntDetRuralEntityListData.getChildKey())){
																				if((loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("add")|| loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("edit")) && loadDiscntDetRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttachCoverageLoadingAndDiscountDetailRural policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyAttachCoverageLoadingAndDiscountDetailRural(driver,"Loading and Discount Details");
																					policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitLoadDiscntDetRuralEntity(loadDiscntDetRuralEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													
													/************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	
													////// Config is added to traverse  premium tab after traversing attributes in Attach Coverages. 
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkTab")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}

												}
											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	////Abhijit

	public void policyAttributeMicroInsuranceVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Attribute Micro Insurance Verify Helper </i></B>");
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//*************Policy Attribute After Proceed*************************//
					if(policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolicyAttributeRuralEntity> policyAttributeRuralEntityList=testData.getPolicyAttributeRuralEntityRecords();
						for(PolicyAttributeRuralEntity policyAttributeRuralEntityListData:policyAttributeRuralEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeRuralEntityListData.getChildKey())){
								if(policyAttributeRuralEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeRural policyAttributeRural=new PolicyAttributeRural(driver, "Policy Attribute Rural Page");
									policyAttributeRural.fillandSubmitPolicyAttributeRural(policyAttributeRuralEntityListData, assertReference);
									if(policyAttributeRuralEntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
										for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
												if(policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify") && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
													policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
													if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){
														List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
														for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																	policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//Abhijit

	public void policyInsuredIntrestMicroInsuranceVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Micro Insurance Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);
					///**************Policy Insured Intrest Details  Verify***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")&& policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Intrest Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);

						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
							List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
							for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
									if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify")&& memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest Attributes"); 
										policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
										if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

											List<PolInsIntAttRiskDet1Entity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntAttRiskDet1RRLEntityRecords();
											for(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
													if(polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("verify")&& polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyInsuredInterestAttributeRiskDetail1Rural policyInsuredInterestAttributeRiskDetail1Rural= new PolicyInsuredInterestAttributeRiskDetail1Rural(driver, "Policy Member Atrribute health ");
														policyInsuredInterestAttributeRiskDetail1Rural.fillandSubmitPolicyInsuredInterestAttributeRiskDetail1Rural(polInsIntAttRiskDet1RRLEntityListData, assertReference);
													}
												}
											}
											//Risk 2nd page 				
											List<RiskDetails2RuralEntity> riskDetails2RuralEntityList=testData.getRiskDetails2RuralEntityRecords();
											for(RiskDetails2RuralEntity riskDetails2RuralEntityListData:riskDetails2RuralEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(riskDetails2RuralEntityListData.getChildKey())){
													if(riskDetails2RuralEntityListData.getAction().equalsIgnoreCase("verify")&& riskDetails2RuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														RiskDetail2Rural riskDetails2Rural= new RiskDetail2Rural(driver, "RiskDetail2Rural");
														riskDetails2Rural.fillandsubmitRiskDetailsRural(riskDetails2RuralEntityListData, assertReference);

													}
												}
											}

										}
									}
								}
							}
						}
						if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
							List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
							for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
								if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")&& policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Insured Interest AttachCoverages");
										policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
										/********************Insured Interest coverage  page End***********/ 
										/********************Policy Insured Interest coverage Details Page starts****************/
										if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")&& policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
											List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
											for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
													if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")&& policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy Insured Interest AttachCoverage Deatils ");
														policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
														/**************** Policy Insured Interest coverage Details Page End And After click on Premium******************/
														/****************attach Coverage Attribute Start***********/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){

															List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
															for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																	if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify")&& policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																		PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Insured Interest AttachCoverages Attribute");
																		policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																		if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){

																			List<LoadDiscntDetRuralEntity> loadDiscntDetRuralEntityList=testData.getLoadDiscntDetRuralEntityRecords();
																			for(LoadDiscntDetRuralEntity loadDiscntDetRuralEntityListData: loadDiscntDetRuralEntityList){
																				if(policyEntity.getParentKey().equalsIgnoreCase(loadDiscntDetRuralEntityListData.getChildKey())){
																					if(loadDiscntDetRuralEntityListData.getAction().equalsIgnoreCase("verify")&& loadDiscntDetRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																						PolicyAttachCoverageLoadingAndDiscountDetailRural policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyAttachCoverageLoadingAndDiscountDetailRural(driver,"Loading and Discount Details");
																						policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitLoadDiscntDetRuralEntity(loadDiscntDetRuralEntityListData, assertReference);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}															/****************attach Coverage Attribute End***********/
														/************************Policy Member premium page start***********************/
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
														if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkTab")){
															List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
															for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																	if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																		MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																		memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	//Mangesh
	public void policyFolloupverifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{

		FrameworkServices.logMessage("<B><i> Executing:: Followup Details of Policy </i></B>");
		int rowcount=0;
		List<PolicyFollowupEntity> policyFollowupTableList = testData.getPolicyFollowupEntity();
		for(PolicyFollowupEntity policyFollowupTabledata:policyFollowupTableList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyFollowupTabledata.getChildKey()) && policyFollowupTabledata.getAction().equalsIgnoreCase("verify") && policyFollowupTabledata.getStepGroup().equalsIgnoreCase(stepGroup)){

				PolicyFollowupPage policyFollowupPage=new PolicyFollowupPage(driver, "Policy Followup Page");
				policyFollowupPage.fillAndSubmitPolicyFollowupDetails(policyFollowupTabledata, assertReference,testData);
				testData.updateRecordsForCriteria(policyFollowupTabledata);

			}
		}
	}

	//Abhijit
	public void policyTransferToAPEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Policy Transfer To AP </i></B>");
		List<PolTransferToAPEntity> polTransferToAPEntityList=testData.getPolTransferToAPEntityRecords();
		for(PolTransferToAPEntity polTransferToAPEntityListdata:polTransferToAPEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polTransferToAPEntityListdata.getChildKey())){
				if(polTransferToAPEntityListdata.getAction().equalsIgnoreCase("edit")||polTransferToAPEntityListdata.getAction().equalsIgnoreCase("add")){
					PolicyTransferToAP policyTransferToAP = new PolicyTransferToAP(driver, "Policy Transfer To AP page");
					policyTransferToAP.fillAndSubmitClaimTransferToAP(polTransferToAPEntityListdata,assertReference);
				}
				testData.updateRecordsForCriteria(polTransferToAPEntityListdata);
				setDependencyPolicyRefundVoucherNumber(polTransferToAPEntityListdata, testData);
			}
		}
	}

	//Abhijit
	public void setDependencyPolicyRefundVoucherNumber(PolTransferToAPEntity polTransferToAPEntityListdata,ScenarioTestData testData){
		if(polTransferToAPEntityListdata.getStringValueForField("DependencyForVoucherNumber")!=null){
			ArrayList<AccMaintainTransactionEntity>accMaintainTransactionEntityList=testData.getObjectByReference(testData.getAccountingMaintainTransactionDetailsRecords(), polTransferToAPEntityListdata.getStringValueForField("DependencyForVoucherNumber"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("VoucherNumber",polTransferToAPEntityListdata.getStringValueForField("VoucherNo"));
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}

		if(polTransferToAPEntityListdata.getStringValueForField("DependencyForPolCollectionVoucherNumber")!=null){
			ArrayList<PolicyPremCollectionEntity>policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), polTransferToAPEntityListdata.getStringValueForField("DependencyForPolCollectionVoucherNumber"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityListData:policyPremCollectionEntityList){
				policyPremCollectionEntityListData.setStringValueForField("VoucherNumber",polTransferToAPEntityListdata.getStringValueForField("VoucherNo"));
				policyPremCollectionEntityListData.setStringValueForField("ReferenceNo",polTransferToAPEntityListdata.getStringValueForField("VoucherNo"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityListData);
			}
		}
	}

	public void policyAttributeMarineHullEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttrMarineHullEntity> polAttrMarineHullEntityList=testData.getPolAttrMarineHullEntityRecords();
						for(PolAttrMarineHullEntity polAttrMarineHullEntityListData:polAttrMarineHullEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttrMarineHullEntityListData.getChildKey())){
								if((polAttrMarineHullEntityListData.getAction().equalsIgnoreCase("add")|| polAttrMarineHullEntityListData.getAction().equalsIgnoreCase("edit")) && polAttrMarineHullEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMarineHull policyAttributeMarineHull=new PolicyAttributeMarineHull(driver, "Policy Attribute Page");
									policyAttributeMarineHull.fillandSubmitPolicyAttributeMarineHullDetail(polAttrMarineHullEntityListData, assertReference);
									if(polAttrMarineHullEntityListData.getBooleanValueForField("ConfigForwardButton")){
										if((polAttrMarineHullEntityListData.getStringValueForField("Product").equalsIgnoreCase("CP"))||(polAttrMarineHullEntityListData.getStringValueForField("Product").equalsIgnoreCase("CS"))){
											policyAttributePolDeatilsMarineHullEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
										for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
												if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("edit")||provisionalPolDetailEntityData.getAction().equalsIgnoreCase("add"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
													policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
													if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwardButton")){
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForGst")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeMarineHullVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttrMarineHullEntity> polAttrMarineHullEntityList=testData.getPolAttrMarineHullEntityRecords();
						for(PolAttrMarineHullEntity polAttrMarineHullEntityListData:polAttrMarineHullEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttrMarineHullEntityListData.getChildKey())){
								if((polAttrMarineHullEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrMarineHullEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMarineHull policyAttributeMarineHull=new PolicyAttributeMarineHull(driver, "Policy Attribute Page");
									policyAttributeMarineHull.fillandSubmitPolicyAttributeMarineHullDetail(polAttrMarineHullEntityListData, assertReference);
									if(polAttrMarineHullEntityListData.getBooleanValueForField("ConfigForwardButton")){
										if((polAttrMarineHullEntityListData.getStringValueForField("Product").equalsIgnoreCase("CP"))||(polAttrMarineHullEntityListData.getStringValueForField("Product").equalsIgnoreCase("CS"))){
											policyAttributePolDeatilsMarineHullVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
										for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
												if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("verify"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
													policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
													if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwardButton")){
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);

																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForGst")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}				
						}
					}     
				}}
		}			
	}


	public void policyInsuredIntrestMarineHullEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Micro Insurance Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					/////*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Intrest Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if((memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")) || memberAttributesEntityData.getBooleanValueForField("ConfigProceedButtonForAviation")){

										if((memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("HM"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("CL"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("WR"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("MM"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("AB"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("VI"))||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("SB"))){
											List<PolInsIntVessInformPLREntity> polInsIntVessInformPLREntityList=testData.getPolInsIntVessInformPLREntityRecord();
											for(PolInsIntVessInformPLREntity polInsIntVessInformPLREntityListData:polInsIntVessInformPLREntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntVessInformPLREntityListData.getChildKey())){
													if((polInsIntVessInformPLREntityListData.getAction().equalsIgnoreCase("add")|| polInsIntVessInformPLREntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntVessInformPLREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyInsuredIntrestVesselInformationPLR policyInsuredIntrestVesselInformationPLR= new PolicyInsuredIntrestVesselInformationPLR(driver, "Policy Member Atrribute Marine Hull Vessel Information");
														policyInsuredIntrestVesselInformationPLR.fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(polInsIntVessInformPLREntityListData, assertReference);

													}
												}
											}
										}
										//first page of policy attribute of insured interest for CP product
										List<PolInsIntFleetDMHEntity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntFleetDMHEntityRecords();
										for(PolInsIntFleetDMHEntity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
												if((polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestFleetDetailsMarineHull policyInsuredIntrestFleetDetailsMarineHull= new PolicyInsuredIntrestFleetDetailsMarineHull(driver, "Policy Member Atrribute health");
													policyInsuredIntrestFleetDetailsMarineHull.fillandSubmitPolicyInsuredIntrestFleetDetailsMarineHull(polInsIntAttRiskDet1RRLEntityListData, assertReference);
													if(polInsIntAttRiskDet1RRLEntityListData.getStringValueForField("Product").equalsIgnoreCase("HM")){	
														policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmneDITEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

													}												
												}
											}
										}
									}
								}
							}
						}
					}

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/***********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
									for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
										if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
											if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
												PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
												policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
												/*******************attach Coverage Attribute Start***********/
												if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLinkForCP")){
													List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
													for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
															if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																	List<PolAttCoverRuleMHEntity> polAttCoverRuleMHEntityList=testData.getPolAttCoverRuleMHEntityRecords();
																	for(PolAttCoverRuleMHEntity polAttCoverRuleMHEntityListData: polAttCoverRuleMHEntityList){
																		if(policyEntity.getParentKey().equalsIgnoreCase(polAttCoverRuleMHEntityListData.getChildKey())){
																			if((polAttCoverRuleMHEntityListData.getAction().equalsIgnoreCase("add")|| polAttCoverRuleMHEntityListData.getAction().equalsIgnoreCase("edit")) && polAttCoverRuleMHEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				PolicyInsIntAttachCoverageCoverRuleMarineHull policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyInsIntAttachCoverageCoverRuleMarineHull(driver,"Loading and Discount Details");
																				policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitPolicyInsIntAttachCoverageCoverRule(polAttCoverRuleMHEntityListData, assertReference);
																			}
																		}
																	}
																}
															}
														}
													}
												}
												/************attach Coverage Attribute End***********/
												/************************Policy Memeber premium page start***********************/
												if((policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU") || policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
													for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
														if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
															if(((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add"))|| (membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup))){
																MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
															}
														}
													}
												}	
											}
										}
									}
								}	
							}
						}
					}
				}	

			}
		}
	}


	public void policyInsuredIntrestMarineHullVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Intrest Micro Insurance Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Intrest Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					/////*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Intrest Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										if(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("HM")||(memberAttributesEntityData.getStringValueForField("Product").equalsIgnoreCase("WR"))){
											List<PolInsIntVessInformPLREntity> polInsIntVessInformPLREntityList=testData.getPolInsIntVessInformPLREntityRecord();
											for(PolInsIntVessInformPLREntity polInsIntVessInformPLREntityListData:polInsIntVessInformPLREntityList){
												if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntVessInformPLREntityListData.getChildKey())){
													if((polInsIntVessInformPLREntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntVessInformPLREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														PolicyInsuredIntrestVesselInformationPLR policyInsuredIntrestVesselInformationPLR= new PolicyInsuredIntrestVesselInformationPLR(driver, "Policy Member Atrribute Marine Hull Vessel Information");
														policyInsuredIntrestVesselInformationPLR.fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(polInsIntVessInformPLREntityListData, assertReference);

													}
												}
											}
										}
										List<PolInsIntFleetDMHEntity> polInsIntAttRiskDet1RRLEntityList=testData.getPolInsIntFleetDMHEntityRecords();
										for(PolInsIntFleetDMHEntity polInsIntAttRiskDet1RRLEntityListData:polInsIntAttRiskDet1RRLEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttRiskDet1RRLEntityListData.getChildKey())){
												if((polInsIntAttRiskDet1RRLEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntAttRiskDet1RRLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestFleetDetailsMarineHull policyInsuredIntrestFleetDetailsMarineHull= new PolicyInsuredIntrestFleetDetailsMarineHull(driver, "Policy Member Atrribute health");
													policyInsuredIntrestFleetDetailsMarineHull.fillandSubmitPolicyInsuredIntrestFleetDetailsMarineHull(polInsIntAttRiskDet1RRLEntityListData, assertReference);
													if(polInsIntAttRiskDet1RRLEntityListData.getStringValueForField("Product").equalsIgnoreCase("WR")){	
														policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmneDITVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

													}
												}
											}
										}
									}
								}
							}
						}
					}

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/***********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/*******************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLinkForCP")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<PolAttCoverRuleMHEntity> polAttCoverRuleMHEntityList=testData.getPolAttCoverRuleMHEntityRecords();
																		for(PolAttCoverRuleMHEntity polAttCoverRuleMHEntityListData: polAttCoverRuleMHEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polAttCoverRuleMHEntityListData.getChildKey())){
																				if((polAttCoverRuleMHEntityListData.getAction().equalsIgnoreCase("verify")) && polAttCoverRuleMHEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsIntAttachCoverageCoverRuleMarineHull policyAttachCoverageLoadingAndDiscountDetailRural=new PolicyInsIntAttachCoverageCoverRuleMarineHull(driver,"Loading and Discount Details");
																					policyAttachCoverageLoadingAndDiscountDetailRural.fillandSubmitPolicyInsIntAttachCoverageCoverRule(polAttCoverRuleMHEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													/************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlinkForPU")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	
												}
											}
										}
									}	
								}
							}
						}
					}	

				}
			}
		}
	}

	public void policyAttributeEngineeringEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					if(policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolAttributeEngEntity> policyAttributeEngineeringList=testData.getPolicyAttributeEngineeringRecords();
						for(PolAttributeEngEntity policyAttributeEngineeringListData:policyAttributeEngineeringList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEngineeringListData.getChildKey())){
								if((policyAttributeEngineeringListData.getAction().equalsIgnoreCase("add")|| policyAttributeEngineeringListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEngineeringListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeEngineering policyAttributeEngineering=new PolicyAttributeEngineering(driver, "Policy Attribute Page",0);
									policyAttributeEngineering.fillandSubmitAttributeEngineering(policyAttributeEngineeringListData,assertReference);
									if(policyAttributeEngineeringListData.getBooleanValueForField("ConfigProceedButton")){

										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("ET")){
											policyAttributePropertyDamageAddOnEngEntityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LE")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LW")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LM")){
											policyAttributeProjectDetailEngEntityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
											policyAttributeEquipmentsEngineeringEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("EI")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("EF")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("BPPI")|| policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("CF") || policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("CM")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("MB")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LW")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("WP")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LM")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("DS")){
											//Discretionary Discount Page
											policyAttributeDiscretionaryDiscountForFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											//Add On Covers Details Page
											if(!policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("DS"))
											{
												policyAttributeAddOnCoversDetailsFireEditHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											}
										}

										List<PolAttrOtherDMSIEngEntity> polAttrOtherDMSIEngEntityList=testData.getPolAttrOtherDMSIEngEntityRecords();
										for(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntityListData:polAttrOtherDMSIEngEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polAttrOtherDMSIEngEntityListData.getChildKey())){
												if((polAttrOtherDMSIEngEntityListData.getAction().equalsIgnoreCase("add")|| polAttrOtherDMSIEngEntityListData.getAction().equalsIgnoreCase("edit")) && polAttrOtherDMSIEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeOtherDMSumInsured policyAttributeOtherDMSumInsured=new PolicyAttributeOtherDMSumInsured(driver, "Policy Attribute Page");
													policyAttributeOtherDMSumInsured.fillandSubmitPolicyAttributeOtherDMSumInsured(polAttrOtherDMSIEngEntityListData, assertReference);
													if(polAttrOtherDMSIEngEntityListData.getBooleanValueForField("ConfigForwardButton")){

														List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
														for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
																if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("edit")||provisionalPolDetailEntityData.getAction().equalsIgnoreCase("add"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																	policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																	if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){

																		List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																		for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																				if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																					policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																					if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")){

																						List<InstallementFacilityEntity> installementFacilityEntityList=testData.getInstallementFacilityEntity();
																						for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(installementFacilityEntityData.getChildKey())){
																								if((installementFacilityEntityData.getAction().equalsIgnoreCase("edit")||installementFacilityEntityData.getAction().equalsIgnoreCase("add"))&& installementFacilityEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyAttributeInstallementFacility policyAttributeInstallementFacility=new PolicyAttributeInstallementFacility(driver, "Policy Attribute Installement Facility Page", 0);
																									policyAttributeInstallementFacility.fillandSubmitPolicyAttributeInstallementFacility(installementFacilityEntityData, assertReference);

																									List<PolSpecialConditnMiscEntity> polSpecialConditnMiscEntityList=testData.getPolSpecialConditnMiscEntity();
																									for(PolSpecialConditnMiscEntity polSpecialConditnMiscEntityData:polSpecialConditnMiscEntityList){
																										if(policyEntity.getParentKey().equalsIgnoreCase(polSpecialConditnMiscEntityData.getChildKey())){
																											if((polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("edit")||polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("add"))&& polSpecialConditnMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												SpecialConditionMiscPage specialConditionMiscPage=new SpecialConditionMiscPage(driver, "Policy Attribute Provisional Policy Details Page");
																												specialConditionMiscPage.fillandSubmitSpecialConditionPagePolicyAttibutesMisc(polSpecialConditnMiscEntityData, assertReference);
																												//Rajesh Added GST
																												if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButton")) {
																													List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																													for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																														if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																															if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParamPage=new PolicyAttrributeGstUpadateParam(driver, "Type of Development Officer");
																																policyAttrributeGstUpadateParamPage.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);

																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributeEngineeringVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					if(policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttributeEngEntity> policyAttributeEngineeringList=testData.getPolicyAttributeEngineeringRecords();
						for(PolAttributeEngEntity policyAttributeEngineeringListData:policyAttributeEngineeringList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEngineeringListData.getChildKey())){
								if((policyAttributeEngineeringListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEngineeringListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeEngineering policyAttributeEngineering=new PolicyAttributeEngineering(driver, "Policy Attribute Page",0);
									policyAttributeEngineering.fillandSubmitAttributeEngineering(policyAttributeEngineeringListData,assertReference);
									if(policyAttributeEngineeringListData.getBooleanValueForField("ConfigProceedButton")){

										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("ET")){
											policyAttributePropertyDamageAddOnEngEntityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LE")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LW")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LM")){
											policyAttributeProjectDetailEngEntityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
											policyAttributeEquipmentsEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
										}
										if(policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("EI")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("EF")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("BPPI") || policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("CF") || policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("CM")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("MB")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LW")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("WP")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("LM")||policyAttributeEngineeringListData.getStringValueForField("Product").equalsIgnoreCase("DS")){
											//Discretionary Discount Page
											policyAttributeDiscretionaryDiscountForFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
											//Add On Covers Details Page
											policyAttributeAddOnCoversDetailsFireVerifyHelper(testData, executionTestStep, assertReference, driver,policyEntity,stepGroup);
										}
										List<PolAttrOtherDMSIEngEntity> polAttrOtherDMSIEngEntityList=testData.getPolAttrOtherDMSIEngEntityRecords();
										for(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntityListData:polAttrOtherDMSIEngEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polAttrOtherDMSIEngEntityListData.getChildKey())){
												if((polAttrOtherDMSIEngEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrOtherDMSIEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeOtherDMSumInsured policyAttributeOtherDMSumInsured=new PolicyAttributeOtherDMSumInsured(driver, "Policy Attribute Page");
													policyAttributeOtherDMSumInsured.fillandSubmitPolicyAttributeOtherDMSumInsured(polAttrOtherDMSIEngEntityListData, assertReference);
													if(polAttrOtherDMSIEngEntityListData.getBooleanValueForField("ConfigForwardButton")){

														List<ProvisionalPolDetailEntity> provisionalPolDetailEntityList=testData.getProvisionalPolDetailEntity();
														for(ProvisionalPolDetailEntity provisionalPolDetailEntityData:provisionalPolDetailEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(provisionalPolDetailEntityData.getChildKey())){
																if((provisionalPolDetailEntityData.getAction().equalsIgnoreCase("verify"))&& provisionalPolDetailEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeProvisionalPolicyDetailsPage policyAttributeProvisionalPolicyDetailsPage=new PolicyAttributeProvisionalPolicyDetailsPage(driver, "Policy Attribute Provisional Policy Details Page");
																	policyAttributeProvisionalPolicyDetailsPage.fillandSubmitPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntityData, assertReference);
																	if(provisionalPolDetailEntityData.getBooleanValueForField("ConfigForwordButton")){

																		List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
																		for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																				if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																					policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);
																					if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigForwordButtonForRS")){

																						List<InstallementFacilityEntity> installementFacilityEntityList=testData.getInstallementFacilityEntity();
																						for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(installementFacilityEntityData.getChildKey())){
																								if((installementFacilityEntityData.getAction().equalsIgnoreCase("verify"))&& installementFacilityEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyAttributeInstallementFacility policyAttributeInstallementFacility=new PolicyAttributeInstallementFacility(driver, "Policy Attribute Installement Facility Page", 0);
																									policyAttributeInstallementFacility.fillandSubmitPolicyAttributeInstallementFacility(installementFacilityEntityData, assertReference);

																									List<PolSpecialConditnMiscEntity> polSpecialConditnMiscEntityList=testData.getPolSpecialConditnMiscEntity();
																									for(PolSpecialConditnMiscEntity polSpecialConditnMiscEntityData:polSpecialConditnMiscEntityList){
																										if(policyEntity.getParentKey().equalsIgnoreCase(polSpecialConditnMiscEntityData.getChildKey())){
																											if((polSpecialConditnMiscEntityData.getAction().equalsIgnoreCase("verify"))&& polSpecialConditnMiscEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												SpecialConditionMiscPage specialConditionMiscPage=new SpecialConditionMiscPage(driver, "Policy Attribute Provisional Policy Details Page");
																												specialConditionMiscPage.fillandSubmitSpecialConditionPagePolicyAttibutesMisc(polSpecialConditnMiscEntityData, assertReference);

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredIntrestEngineeringEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("edit")||memberAttributesEntityData.getAction().equalsIgnoreCase("add"))&& memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										//
										List<PolInsIntEngEntity> polInsIntAttrEngEntityList=testData.getPolInsIntEngEntityRecords();
										for(PolInsIntEngEntity polInsIntAttrEngEntityListData:polInsIntAttrEngEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrEngEntityListData.getChildKey())){
												if((polInsIntAttrEngEntityListData.getAction().equalsIgnoreCase("add")||polInsIntAttrEngEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttrEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeEngineering policyInsuredIntrestAttributeEngineering= new PolicyInsuredIntrestAttributeEngineering(driver, "Policy Member Atrribute health ");
													policyInsuredIntrestAttributeEngineering.fillandSubmitPolicyInsuredIntrestEngineering(polInsIntAttrEngEntityListData, assertReference);

													if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigForwardButton")){
														//ER, EC, CF,MB,BPPI,CM
														if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigPolInsIntAttrSIDEngEntity")){
															polInsIntAttrSIDEngineeringEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

														}
														if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("ME")){

															polInsIntAttrTransportCommdityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
														}
														List<PolInsIntAttMeritRatDEntity> polInsIntAttMeritRatingDEntityList=testData.getPolInsIntAttMeritRatingDEntityRecord();
														for(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntityListData:polInsIntAttMeritRatingDEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttMeritRatingDEntityListData.getChildKey())){
																if((polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("edit"))&& polInsIntAttMeritRatingDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestAttributeMeritRatingDetail policyInsuredIntrestAttributeMeritRatingDetail= new PolicyInsuredIntrestAttributeMeritRatingDetail(driver, "Policy Member Atrribute health");
																	policyInsuredIntrestAttributeMeritRatingDetail.fillAndSubmitPolicyInsuredIntrestAttributeMeritRatingDetail(polInsIntAttMeritRatingDEntityListData, assertReference);

																	if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("ET")){
																		polInsIntAttrSIDEngineeringEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																	}
																}
															}
														}

														if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigSTFIPage")){
															List<PolInsIntAttrSTFIEngEntity> polInsIntAttrSTFIEngEntityList=testData.getPolInsIntAttrSTFIEngEntityRecord();
															for(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityListData:polInsIntAttrSTFIEngEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrSTFIEngEntityListData.getChildKey())){
																	if((polInsIntAttrSTFIEngEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttrSTFIEngEntityListData.getAction().equalsIgnoreCase("edit"))&& polInsIntAttrSTFIEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																		PolicyInsuredIntrestAttributeSTFICoverEngineering policyInsuredIntrestAttributeSTFICoverEngineering= new PolicyInsuredIntrestAttributeSTFICoverEngineering(driver, "Policy Member Atrribute health", 0);
																		policyInsuredIntrestAttributeSTFICoverEngineering.fillandSubmitPolicyInsuredIntrestAttributeSTFICoverEngineering(polInsIntAttrSTFIEngEntityListData, assertReference);					

																		if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("EF")||polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("EI")){
																			polInsIntAttEQEngineeringEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add") ||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add") ||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add") ||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if((policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add") || policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit"))&& policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){

																		List<AttachCoverTerrorismCEntity> attachCoverTerrorismCEntityList=testData.getAttachCoverTerrorismCEntityRecord();
																		for(AttachCoverTerrorismCEntity attachCoverTerrorismCEntityListData: attachCoverTerrorismCEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(attachCoverTerrorismCEntityListData.getChildKey())){
																				if((attachCoverTerrorismCEntityListData.getAction().equalsIgnoreCase("add") ||attachCoverTerrorismCEntityListData.getAction().equalsIgnoreCase("edit")) && attachCoverTerrorismCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestAttachDetailsofTerrorismCover policyInsuredIntrestAttachDetailsofTerrorismCover= new PolicyInsuredIntrestAttachDetailsofTerrorismCover(driver, "Policy MemberAttachCoverage Deatils ");
																					policyInsuredIntrestAttachDetailsofTerrorismCover.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(attachCoverTerrorismCEntityListData, assertReference);

																					if(attachCoverTerrorismCEntityListData.getBooleanValueForField("ConfigSectionDetailsPage")){
																						polSectionDetailsEngineerEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}
																				}			
																			}
																		}

																	}

																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add") || membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit"))&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumEngineering")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add") || membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit"))&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	
													//Rajesh Client Details added
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigClientDetailTab")){
														policyPolicyMemberAttachCoverageDeatils.clickToClientDeatilTab(policyMemberCoverageDEntityyData);
														List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
														for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
																if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
																	clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
																}
															}
														}
													}

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyInsuredIntrestEngineeringVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Member Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Member Search Page");
					policyMemberSearchPage.navigateToMemberSearch(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Member Details  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Member Details");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						setDependencyForClaimInsuredCode(policyMemberDetailsEntityListData, testData);

					}

					//TODO Done
					//*********** Attribute in member Details ******************** 

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify")&& memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Member Attributes"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){
										//
										List<PolInsIntEngEntity> polInsIntAttrEngEntityList=testData.getPolInsIntEngEntityRecords();
										for(PolInsIntEngEntity polInsIntAttrEngEntityListData:polInsIntAttrEngEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrEngEntityListData.getChildKey())){
												if(polInsIntAttrEngEntityListData.getAction().equalsIgnoreCase("verify") && polInsIntAttrEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestAttributeEngineering policyInsuredIntrestAttributeEngineering= new PolicyInsuredIntrestAttributeEngineering(driver, "Policy Member Atrribute health ");
													policyInsuredIntrestAttributeEngineering.fillandSubmitPolicyInsuredIntrestEngineering(polInsIntAttrEngEntityListData, assertReference);
													if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigForwardButton")){

														//ER, EC, CF,MB,BPPI
														if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigPolInsIntAttrSIDEngEntity")){
															polInsIntAttrSIDEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

														}
														if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("ME")){

															polInsIntAttrTransportCommdityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
														}

														List<PolInsIntAttMeritRatDEntity> polInsIntAttMeritRatingDEntityList=testData.getPolInsIntAttMeritRatingDEntityRecord();
														for(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntityListData:polInsIntAttMeritRatingDEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttMeritRatingDEntityListData.getChildKey())){
																if(polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("verify") && polInsIntAttMeritRatingDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestAttributeMeritRatingDetail policyInsuredIntrestAttributeMeritRatingDetail= new PolicyInsuredIntrestAttributeMeritRatingDetail(driver, "Policy Member Atrribute health");
																	policyInsuredIntrestAttributeMeritRatingDetail.fillAndSubmitPolicyInsuredIntrestAttributeMeritRatingDetail(polInsIntAttMeritRatingDEntityListData, assertReference);

																	if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("ET")){
																		polInsIntAttrSIDEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																	}
																}
															}
														}
														if(polInsIntAttrEngEntityListData.getBooleanValueForField("ConfigSTFIPage")){

															List<PolInsIntAttrSTFIEngEntity> polInsIntAttrSTFIEngEntityList=testData.getPolInsIntAttrSTFIEngEntityRecord();
															for(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityListData:polInsIntAttrSTFIEngEntityList){
																if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrSTFIEngEntityListData.getChildKey())){
																	if(polInsIntAttrSTFIEngEntityListData.getAction().equalsIgnoreCase("verify")&& polInsIntAttrSTFIEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																		PolicyInsuredIntrestAttributeSTFICoverEngineering policyInsuredIntrestAttributeSTFICoverEngineering= new PolicyInsuredIntrestAttributeSTFICoverEngineering(driver, "Policy Member Atrribute health", 0);
																		policyInsuredIntrestAttributeSTFICoverEngineering.fillandSubmitPolicyInsuredIntrestAttributeSTFICoverEngineering(polInsIntAttrSTFIEngEntityListData, assertReference);					

																		if(polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("EF")||polInsIntAttrEngEntityListData.getStringValueForField("Product").equalsIgnoreCase("EI")){
																			polInsIntAttEQEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);

																		}
																	}
																}
															}
														}

													}
												}

											}

										}
									}
								}
							}
						}
					}

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if(policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify") && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){
																		List<AttachCoverTerrorismCEntity> attachCoverTerrorismCEntityList=testData.getAttachCoverTerrorismCEntityRecord();
																		for(AttachCoverTerrorismCEntity attachCoverTerrorismCEntityListData: attachCoverTerrorismCEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(attachCoverTerrorismCEntityListData.getChildKey())){
																				if((attachCoverTerrorismCEntityListData.getAction().equalsIgnoreCase("verify")) && attachCoverTerrorismCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestAttachDetailsofTerrorismCover policyInsuredIntrestAttachDetailsofTerrorismCover= new PolicyInsuredIntrestAttachDetailsofTerrorismCover(driver, "Policy MemberAttachCoverage Deatils ");
																					policyInsuredIntrestAttachDetailsofTerrorismCover.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(attachCoverTerrorismCEntityListData, assertReference);

																					if(attachCoverTerrorismCEntityListData.getBooleanValueForField("ConfigSectionDetailsPage")){
																						polSectionDetailsEngineerVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, policyEntity);
																					}
																				}			
																			}
																		}
																	}
																}			
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if(membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}

													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumEngineering")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify"))&& membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
													}	
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyAttributePropertyDamageAddOnEngEntityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<PolAttPropDmAddOnEngEntity> polAttPropDmAddOnEngEntityList=testData.getPolAttPropDmAddOnEngEntityRecord();
		for(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("add")|| polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("edit")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributePropertyDamageAddOnEngineering policyAttributePropertyDamageAddOnEngineering=new PolicyAttributePropertyDamageAddOnEngineering(driver, "Policy Attribute Page");
					policyAttributePropertyDamageAddOnEngineering.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polAttPropDmAddOnEngEntityListData, assertReference);
				}
			}
		}
	}

	public void policyAttributeProjectDetailEngEntityEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<ProjectDetailEngEntity> polAttPropDmAddOnEngEntityList=testData.getProjectDetailEngEntityRecord();
		for(ProjectDetailEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("add")|| polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("edit")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeProjectDetailEngineering policyAttributeProjectDetailEngineering=new PolicyAttributeProjectDetailEngineering(driver, "Policy Attribute Page");
					policyAttributeProjectDetailEngineering.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polAttPropDmAddOnEngEntityListData, assertReference);

				}
			}
		}
	}

	private void policyAttributeEquipmentsEngineeringEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper : </i></B>");
		List<PolAttrEquipmentsEngEntity> polAttPropDmAddOnEngEntityList=testData.getPolAttrEquipmentsEngEntityRecord();
		for(PolAttrEquipmentsEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("add")|| polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("edit")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeEquipmentsEngineering policyAttributeEquipmentsEngineering=new PolicyAttributeEquipmentsEngineering(driver, "Policy Attribute Page");
					policyAttributeEquipmentsEngineering.fillandSubmitPolicyAttributeEquipmentsEngineering(polAttPropDmAddOnEngEntityListData, assertReference);


				}
			}
		}
	}

	void policyAttributePropertyDamageAddOnEngEntityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper :</i></B>");
		List<PolAttPropDmAddOnEngEntity> polAttPropDmAddOnEngEntityList=testData.getPolAttPropDmAddOnEngEntityRecord();
		for(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("verify")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributePropertyDamageAddOnEngineering policyAttributePropertyDamageAddOnEngineering=new PolicyAttributePropertyDamageAddOnEngineering(driver, "Policy Attribute Page");
					policyAttributePropertyDamageAddOnEngineering.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polAttPropDmAddOnEngEntityListData, assertReference);
				}
			}
		}
	}

	public void policyAttributeProjectDetailEngEntityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<ProjectDetailEngEntity> polAttPropDmAddOnEngEntityList=testData.getProjectDetailEngEntityRecord();
		for(ProjectDetailEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("verify")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeProjectDetailEngineering policyAttributeProjectDetailEngineering=new PolicyAttributeProjectDetailEngineering(driver, "Policy Attribute Page");
					policyAttributeProjectDetailEngineering.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polAttPropDmAddOnEngEntityListData, assertReference);

				}
			}
		}
	}

	private void policyAttributeEquipmentsEngineeringVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Risk Detail First Page for PD Edit Helper </i></B>");
		List<PolAttrEquipmentsEngEntity> polAttPropDmAddOnEngEntityList=testData.getPolAttrEquipmentsEngEntityRecord();
		for(PolAttrEquipmentsEngEntity polAttPropDmAddOnEngEntityListData:polAttPropDmAddOnEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttPropDmAddOnEngEntityListData.getChildKey())){
				if((polAttPropDmAddOnEngEntityListData.getAction().equalsIgnoreCase("verify")) && polAttPropDmAddOnEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributeEquipmentsEngineering policyAttributeEquipmentsEngineering=new PolicyAttributeEquipmentsEngineering(driver, "Policy Attribute Page");
					policyAttributeEquipmentsEngineering.fillandSubmitPolicyAttributeEquipmentsEngineering(polAttPropDmAddOnEngEntityListData, assertReference);
				}
			}
		}
	}

	private void polInsIntAttMeritRatingDetailEngineeringEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttMeritRatDEntity> polInsIntAttMeritRatingDEntityList=testData.getPolInsIntAttMeritRatingDEntityRecord();
		for(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntityListData:polInsIntAttMeritRatingDEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttMeritRatingDEntityListData.getChildKey())){
				if((polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("add")|| polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("edit"))&& polInsIntAttMeritRatingDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestAttributeMeritRatingDetail policyInsuredIntrestAttributeMeritRatingDetail= new PolicyInsuredIntrestAttributeMeritRatingDetail(driver, "Policy Member Atrribute health");
					policyInsuredIntrestAttributeMeritRatingDetail.fillAndSubmitPolicyInsuredIntrestAttributeMeritRatingDetail(polInsIntAttMeritRatingDEntityListData, assertReference);
				}
			}
		}
	}

	private void polInsIntAttMeritRatingDetailEngineeringVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttMeritRatDEntity> polInsIntAttMeritRatingDEntityList=testData.getPolInsIntAttMeritRatingDEntityRecord();
		for(PolInsIntAttMeritRatDEntity polInsIntAttMeritRatingDEntityListData:polInsIntAttMeritRatingDEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttMeritRatingDEntityListData.getChildKey())){
				if(polInsIntAttMeritRatingDEntityListData.getAction().equalsIgnoreCase("verify")&& polInsIntAttMeritRatingDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestAttributeMeritRatingDetail policyInsuredIntrestAttributeMeritRatingDetail= new PolicyInsuredIntrestAttributeMeritRatingDetail(driver, "Policy Member Atrribute health");
					policyInsuredIntrestAttributeMeritRatingDetail.fillAndSubmitPolicyInsuredIntrestAttributeMeritRatingDetail(polInsIntAttMeritRatingDEntityListData, assertReference);
				}
			}
		}
	}
	private void polInsIntAttrSIDEngineeringEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttrSIDEngEntity> polInsIntAttrSIDEngEntityList=testData.getPolInsIntAttrSIDEngEntityRecord();
		for(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntityListData:polInsIntAttrSIDEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrSIDEngEntityListData.getChildKey())){
				if((polInsIntAttrSIDEngEntityListData.getAction().equalsIgnoreCase("add")||polInsIntAttrSIDEngEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttrSIDEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredInrestAttributeSumInsuredDetailsEngineering policyInsuredInrestAttributeSumInsuredDetailsEngineering= new PolicyInsuredInrestAttributeSumInsuredDetailsEngineering(driver, "Policy Member Atrribute health");
					policyInsuredInrestAttributeSumInsuredDetailsEngineering.fillandSubmitPolicyInsuredInrestAttributeSumInsuredDetailsEngineering(polInsIntAttrSIDEngEntityListData, assertReference);
				}
			}
		}
	}

	private void polInsIntAttrSIDEngineeringVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttrSIDEngEntity> polInsIntAttrSIDEngEntityList=testData.getPolInsIntAttrSIDEngEntityRecord();
		for(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntityListData:polInsIntAttrSIDEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrSIDEngEntityListData.getChildKey())){
				if((polInsIntAttrSIDEngEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntAttrSIDEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredInrestAttributeSumInsuredDetailsEngineering policyInsuredInrestAttributeSumInsuredDetailsEngineering= new PolicyInsuredInrestAttributeSumInsuredDetailsEngineering(driver, "Policy Member Atrribute health");
					policyInsuredInrestAttributeSumInsuredDetailsEngineering.fillandSubmitPolicyInsuredInrestAttributeSumInsuredDetailsEngineering(polInsIntAttrSIDEngEntityListData, assertReference);
				}
			}
		}
	}


	//EF-Yogesh

	private void polInsIntAttEQEngineeringEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttEQEngEntity> polInsIntAttEQEngEntityList=testData.getPolInsIntAttEQEngEntityRecord();
		for(PolInsIntAttEQEngEntity polInsIntAttEQEngEntityListData:polInsIntAttEQEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttEQEngEntityListData.getChildKey())){
				if((polInsIntAttEQEngEntityListData.getAction().equalsIgnoreCase("add")||polInsIntAttEQEngEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttEQEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestAttributeEarthquakeZoneEngineering policyInsuredIntrestAttributeEarthquakeZoneEngineering= new PolicyInsuredIntrestAttributeEarthquakeZoneEngineering(driver, "Policy Member Atrribute health");
					policyInsuredIntrestAttributeEarthquakeZoneEngineering.fillandSubmitPolicyInsuredIntrestAttributeEarthquakeZoneEngineering(polInsIntAttEQEngEntityListData, assertReference);
				}
			}
		}
	}

	private void polInsIntAttEQEngineeringVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttEQEngEntity> polInsIntAttEQEngEntityList=testData.getPolInsIntAttEQEngEntityRecord();
		for(PolInsIntAttEQEngEntity polInsIntAttEQEngEntityListData:polInsIntAttEQEngEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttEQEngEntityListData.getChildKey())){
				if((polInsIntAttEQEngEntityListData.getAction().equalsIgnoreCase("verify")) && polInsIntAttEQEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestAttributeEarthquakeZoneEngineering policyInsuredIntrestAttributeEarthquakeZoneEngineering= new PolicyInsuredIntrestAttributeEarthquakeZoneEngineering(driver, "Policy Member Atrribute health");
					policyInsuredIntrestAttributeEarthquakeZoneEngineering.fillandSubmitPolicyInsuredIntrestAttributeEarthquakeZoneEngineering(polInsIntAttEQEngEntityListData, assertReference);
				}
			}
		}
	}

	//Section Details Page Helper
	private void polSectionDetailsEngineerEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Edit Helper:</i></B>");
		List<PolCovSectionDetailsEntity> polCovSectionDetailsEntityList=testData.getPolCovSectionDetailsEntityRecord();
		for(PolCovSectionDetailsEntity polCovSectionDetailsEntityListData:polCovSectionDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polCovSectionDetailsEntityListData.getChildKey())){
				if(polCovSectionDetailsEntityListData.getAction().equalsIgnoreCase("add")||polCovSectionDetailsEntityListData.getAction().equalsIgnoreCase("edit") && polCovSectionDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolSectionDetailsEngineer polSectionDetailsEngineer= new PolSectionDetailsEngineer(driver, "Policy Section Details Engineering");
					polSectionDetailsEngineer.fillAndSubmitPolCovSectionDetails(polCovSectionDetailsEntityListData, assertReference);				
				}
			}
		}
	}
	private void polSectionDetailsEngineerVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Verify Helper:</i></B>");
		List<PolCovSectionDetailsEntity> polCovSectionDetailsEntityList=testData.getPolCovSectionDetailsEntityRecord();
		for(PolCovSectionDetailsEntity polCovSectionDetailsEntityListData:polCovSectionDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polCovSectionDetailsEntityListData.getChildKey())){
				if((polCovSectionDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && polCovSectionDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolSectionDetailsEngineer polSectionDetailsEngineer= new PolSectionDetailsEngineer(driver, "Policy Section Details Engineering");
					polSectionDetailsEngineer.fillAndSubmitPolCovSectionDetails(polCovSectionDetailsEntityListData, assertReference);				
				}
			}
		}
	}


	private void policyAttributePolDeatilsMarineHullEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Verify Helper:</i></B>");
		List<PolAttrPolDeatilsMHEntity> polAttrPolDeatilsMHEntityList=testData.getPolAttrPolDeatilsMHEntityRecords();
		for(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntityListData:polAttrPolDeatilsMHEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrPolDeatilsMHEntityListData.getChildKey())){
				if((polAttrPolDeatilsMHEntityListData.getAction().equalsIgnoreCase("add")|| (polAttrPolDeatilsMHEntityListData.getAction().equalsIgnoreCase("edit")) && polAttrPolDeatilsMHEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyAttributePolicyDeatilsMarineHull policyAttrPolicyDetailMarineHull=new PolicyAttributePolicyDeatilsMarineHull(driver, "Policy Attribute Page");
					policyAttrPolicyDetailMarineHull.fillandSubmitPolicyAttributeEngineeringDetails(polAttrPolDeatilsMHEntityListData, assertReference);
				}
			}
		}
	}

	private void policyAttributePolDeatilsMarineHullVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Verify Helper:</i></B>");
		List<PolAttrPolDeatilsMHEntity> polAttrPolDeatilsMHEntityList=testData.getPolAttrPolDeatilsMHEntityRecords();
		for(PolAttrPolDeatilsMHEntity polAttrPolDeatilsMHEntityListData:polAttrPolDeatilsMHEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polAttrPolDeatilsMHEntityListData.getChildKey())){
				if((polAttrPolDeatilsMHEntityListData.getAction().equalsIgnoreCase("verify")) && polAttrPolDeatilsMHEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttributePolicyDeatilsMarineHull policyAttrPolicyDetailMarineHull=new PolicyAttributePolicyDeatilsMarineHull(driver, "Policy Attribute Page");
					policyAttrPolicyDetailMarineHull.fillandSubmitPolicyAttributeEngineeringDetails(polAttrPolDeatilsMHEntityListData, assertReference);
				}
			}
		}
	}

	private void policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmneDITVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Verify Helper:</i></B>");
		List<PolVessTypeMHPolInfmnEntity> polVessTypeMHPolInfmnEntityList=testData.getPolVessTypeMHPolInfmnEntityRecord();
		for(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntityListData:polVessTypeMHPolInfmnEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polVessTypeMHPolInfmnEntityListData.getChildKey())){
				if((polVessTypeMHPolInfmnEntityListData.getAction().equalsIgnoreCase("verify")) && polVessTypeMHPolInfmnEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn=new PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(driver, "Policy Attribute Page");
					policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn.fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(polVessTypeMHPolInfmnEntityListData, assertReference);

				}
			}
		}
	}
	private void policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmneDITEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity)throws  InterruptedException{
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Section Details Engineering Verify Helper:</i></B>");
		List<PolVessTypeMHPolInfmnEntity> polVessTypeMHPolInfmnEntityList=testData.getPolVessTypeMHPolInfmnEntityRecord();
		for(PolVessTypeMHPolInfmnEntity polVessTypeMHPolInfmnEntityListData:polVessTypeMHPolInfmnEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polVessTypeMHPolInfmnEntityListData.getChildKey())){
				if((polVessTypeMHPolInfmnEntityListData.getAction().equalsIgnoreCase("add") ||(polVessTypeMHPolInfmnEntityListData.getAction().equalsIgnoreCase("edit")) && polVessTypeMHPolInfmnEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn=new PolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(driver, "Policy Attribute Page");
					policyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn.fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(polVessTypeMHPolInfmnEntityListData, assertReference);

				}
			}
		}
	}
	private void polInsIntAttrTransportCommdityEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttTransCommEntity> polInsIntAttTransCommEntityList=testData.getPolInsIntAttTransCommEntityRecord();
		int rowcount=0;
		for(PolInsIntAttTransCommEntity polInsIntAttTransCommEntityListData:polInsIntAttTransCommEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttTransCommEntityListData.getChildKey())){
				if((polInsIntAttTransCommEntityListData.getAction().equalsIgnoreCase("add")||polInsIntAttTransCommEntityListData.getAction().equalsIgnoreCase("edit")) && polInsIntAttTransCommEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyInsuredInterestAttributeTransportCommodityDetails policyInsuredInterestAttributeTransportCommodityDetails= new PolicyInsuredInterestAttributeTransportCommodityDetails(driver, "Policy Member Atrribute health", rowcount);
					policyInsuredInterestAttributeTransportCommodityDetails.fillandSubmitPolicyInsuredIntrestAttributeTransportCommodityDetails(polInsIntAttTransCommEntityListData, assertReference);
				}
			}
			rowcount=++rowcount;
		}
	}
	private void polInsIntAttrTransportCommdityVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Excecuting :Policy Insured Interest Att Merit Rating Detail Engineering Edit Helper:</i></B>");
		List<PolInsIntAttTransCommEntity> polInsIntAttTransCommEntityList=testData.getPolInsIntAttTransCommEntityRecord();
		int rowcount=0;
		rowcount=rowcount;
		for(PolInsIntAttTransCommEntity polInsIntAttTransCommEntityListData:polInsIntAttTransCommEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttTransCommEntityListData.getChildKey())){
				if((polInsIntAttTransCommEntityListData.getAction().equalsIgnoreCase("verify")&& polInsIntAttTransCommEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					PolicyInsuredInterestAttributeTransportCommodityDetails policyInsuredInterestAttributeTransportCommodityDetails= new PolicyInsuredInterestAttributeTransportCommodityDetails(driver, "Policy Member Atrribute health",rowcount);
					policyInsuredInterestAttributeTransportCommodityDetails.fillandSubmitPolicyInsuredIntrestAttributeTransportCommodityDetails(polInsIntAttTransCommEntityListData, assertReference);
					rowcount=++rowcount;
				}
			}
		}
	}


	//---------------FM-----------------//
	public void policyAttributeCoPaymentAndClaimRatioVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Co Payment And Claim Ratio Verify  Helper </i></B>");
		List<PolicyCoPayClaimRatioEntity> policyCoPayClaimRatioEntityList=testData.getPolicyCoPayClaimRatioEntity();
		for(PolicyCoPayClaimRatioEntity policyCoPayClaimRatioEntitydata:policyCoPayClaimRatioEntityList){
			if(policyCoPayClaimRatioEntitydata.getAction().equalsIgnoreCase("verify")){
				PolicyAttributeCoPaymentAndClaimRatio policyAttributeCoPaymentAndClaimRatioPage=new PolicyAttributeCoPaymentAndClaimRatio(driver, "Policy Attribute Co Paymet Claim Ratio");
				policyAttributeCoPaymentAndClaimRatioPage.fillandSubmitPolicyAttributeCoPaymentAndClaimRatio(policyCoPayClaimRatioEntitydata, assertReference);
				testData.updateRecordsForCriteria(policyCoPayClaimRatioEntitydata);

			}
		}
	}

	//---------------FM-----------------//
	public void policyAttributePortabilityVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,PolicyEntity policyEntity,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Portablity </i></B>");
		List<PortabilityEntity> portabilityEntityList=testData.getPortabilityEntityRecords();
		for(PortabilityEntity portabilityEntityData:portabilityEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(portabilityEntityData.getChildKey())){
				if(portabilityEntityData.getAction().equalsIgnoreCase("verify")&& portabilityEntityData.getStepGroup().equalsIgnoreCase(stepGroup)) {
					Portability portabilityPage=new Portability(driver, "Portability");
					portabilityPage.fillPortabilityAttributeDetails(portabilityEntityData, assertReference);
					testData.updateRecordsForCriteria(portabilityEntityData);
				}
			}
		}
	}
	public void policyBrokerAgentTPAChangeDetEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Broker Agent TPA Change Detail</i></B>");
		List<PolBrokerAgentTPADetEntity> polBrokerAgentTPADetList=testData.getPolBrokerAgentTPADetEntityRecord();
		for(PolBrokerAgentTPADetEntity polBrokerAgentTPADetListdata:polBrokerAgentTPADetList){
			if(policyEntity.getParentKey().equalsIgnoreCase(polBrokerAgentTPADetListdata.getChildKey())){
				if((polBrokerAgentTPADetListdata.getAction().equalsIgnoreCase("edit")||polBrokerAgentTPADetListdata.getAction().equalsIgnoreCase("add")) && (polBrokerAgentTPADetListdata.getStepGroup().equalsIgnoreCase(stepGroup))){
					BrokerAgentTPAChangeDet brokerAgentTPAChangeDet = new BrokerAgentTPAChangeDet(driver, "Policy Transfer To AP page");
					brokerAgentTPAChangeDet.fillAndSubmitBrokerAgentTPAChangeDet(polBrokerAgentTPADetListdata, assertReference);
					testData.updateRecordsForCriteria(polBrokerAgentTPADetListdata);
				}

			}
		}
	}

	public void policyAttributeMotorEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttributeMotorEntity> polAttributeMotorEntityListMNL=testData.getPolAttributeMotorEntity();
						for(PolAttributeMotorEntity polAttributeMotorEntityListDataMNL:polAttributeMotorEntityListMNL){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttributeMotorEntityListDataMNL.getChildKey())){
								if((polAttributeMotorEntityListDataMNL.getAction().equalsIgnoreCase("add")|| polAttributeMotorEntityListDataMNL.getAction().equalsIgnoreCase("edit")) && polAttributeMotorEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMotor policyAttributeMotor=new PolicyAttributeMotor(driver, "Policy Property Details Page");
									policyAttributeMotor.fillandSubmitfillPolicyAttributeMotorDetails(polAttributeMotorEntityListDataMNL, assertReference);									
									if(polAttributeMotorEntityListDataMNL.getBooleanValueForField("ConfigForwordButton")){
										List<PolicyAttrPOSMotorEntity> policyAttrPOSMotorEntityList=testData.getPolicyAttributeMotorPOSEntityRecord();
										for(PolicyAttrPOSMotorEntity policyAttrPOSMotorEntityListData:policyAttrPOSMotorEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrPOSMotorEntityListData.getChildKey())){
												if((policyAttrPOSMotorEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrPOSMotorEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrPOSMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeMotorPOS policyAttributeMotorPOS=new PolicyAttributeMotorPOS(driver, "Tie_Up_Details Page");
													policyAttributeMotorPOS.fillandSubmitPolicyAttributeMotorPOS(policyAttrPOSMotorEntityListData, assertReference);
													if(policyAttrPOSMotorEntityListData.getBooleanValueForField("ConfigForwardButton")) {
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("add")|| policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("edit")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);

																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigPremiumCalculationBasisFwd")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyAttributeMotorVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<PolAttributeMotorEntity> polAttributeMotorEntityListMNL=testData.getPolAttributeMotorEntity();
						for(PolAttributeMotorEntity polAttributeMotorEntityListDataMNL:polAttributeMotorEntityListMNL){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttributeMotorEntityListDataMNL.getChildKey())){
								if((polAttributeMotorEntityListDataMNL.getAction().equalsIgnoreCase("verify")) && polAttributeMotorEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMotor policyAttributeMotor=new PolicyAttributeMotor(driver, "Policy Property Details Page");
									policyAttributeMotor.fillandSubmitfillPolicyAttributeMotorDetails(polAttributeMotorEntityListDataMNL, assertReference);									
									if(polAttributeMotorEntityListDataMNL.getBooleanValueForField("ConfigForwordButton")){
										List<PolicyAttrPOSMotorEntity> sumInsforLibMotorEntityList=testData.getPolicyAttributeMotorPOSEntityRecord();
										for(PolicyAttrPOSMotorEntity sumInsforLibMotorEntityListDataMNL:sumInsforLibMotorEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(sumInsforLibMotorEntityListDataMNL.getChildKey())){
												if((sumInsforLibMotorEntityListDataMNL.getAction().equalsIgnoreCase("verify")) && sumInsforLibMotorEntityListDataMNL.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyAttributeMotorPOS policyAttributeMotorPOS=new PolicyAttributeMotorPOS(driver, "Tie_Up_Details Page");
													policyAttributeMotorPOS.fillandSubmitPolicyAttributeMotorPOS(sumInsforLibMotorEntityListDataMNL, assertReference);
													if(sumInsforLibMotorEntityListDataMNL.getBooleanValueForField("ConfigForwardButton")) {
														List<PolicyTypeOfDevOfficerEntity> policyTypeOfDevOfficerEntityList=testData.getPolicyTypeOfDevOfficerEntity();
														for(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntityData: policyTypeOfDevOfficerEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyTypeOfDevOfficerEntityData.getChildKey())){
																if((policyTypeOfDevOfficerEntityData.getAction().equalsIgnoreCase("verify")) && policyTypeOfDevOfficerEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyAttributeTypeOfDevelopmentOfficerPage policyAttributeTypeOfDevelopmentOfficerCreatePage=new PolicyAttributeTypeOfDevelopmentOfficerPage(driver, "Type of Development Officer");
																	policyAttributeTypeOfDevelopmentOfficerCreatePage.fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(policyTypeOfDevOfficerEntityData, assertReference);

																	if(policyTypeOfDevOfficerEntityData.getBooleanValueForField("ConfigPremiumCalculationBasisFwd")){
																		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
																		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
																				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("verify")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParam=new PolicyAttrributeGstUpadateParam(driver, "GST UPDATE Page");
																					policyAttrributeGstUpadateParam.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void policyInsuredInterestMotorEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		//tr
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Motor Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details Page");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);
					}

					///********* Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes Page"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										List<PolInsIntPreHistMotorEntity> polInsIntPreHistMotorEntityList=testData.getPolInsIntPreHistMotorEntityRecord();
										for(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntityData:polInsIntPreHistMotorEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntPreHistMotorEntityData.getChildKey())){
												if((polInsIntPreHistMotorEntityData.getAction().equalsIgnoreCase("add")|| polInsIntPreHistMotorEntityData.getAction().equalsIgnoreCase("edit")) && polInsIntPreHistMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestPreviousHistoryOfMotor policyInsuredIntrestPreviousHistoryOfMotor= new PolicyInsuredIntrestPreviousHistoryOfMotor(driver, "Previous History of Vehicle Page");
													policyInsuredIntrestPreviousHistoryOfMotor.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polInsIntPreHistMotorEntityData, assertReference);
													if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){
														//trailer detail page
														List<MoreCommeVehiDMotorEntity> moreCommeVehiDMotorEntityList=testData.getMoreCommeVehiDMotorEntityRecords();
														for(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntityData:moreCommeVehiDMotorEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(moreCommeVehiDMotorEntityData.getChildKey())){
																if((moreCommeVehiDMotorEntityData.getAction().equalsIgnoreCase("add")|| moreCommeVehiDMotorEntityData.getAction().equalsIgnoreCase("edit")) && moreCommeVehiDMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestMoreCommercialVehicleDetailMotor PolicyInsuredIntrestMoreCommercialVehicleDetailMotor= new PolicyInsuredIntrestMoreCommercialVehicleDetailMotor(driver, "More Commericial Vehicle Details Page");
																	PolicyInsuredIntrestMoreCommercialVehicleDetailMotor.fillandSubmitPolicyInsuredIntrestMoreCommercialVehicleDetailMotor(moreCommeVehiDMotorEntityData, assertReference);
																	if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																		List<PolInsIntVehVaDetMotorEntity> polInsIntVehVaDetMotorEntityList=testData.getPolInsIntVehVaDetMotorEntityRecords();
																		for(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntityData:polInsIntVehVaDetMotorEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntVehVaDetMotorEntityData.getChildKey())){
																				if((polInsIntVehVaDetMotorEntityData.getAction().equalsIgnoreCase("add")|| polInsIntVehVaDetMotorEntityData.getAction().equalsIgnoreCase("edit")) && polInsIntVehVaDetMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestVehicleValueDetailsMotor policyInsuredIntrestVehicleValueDetailsMotor= new PolicyInsuredIntrestVehicleValueDetailsMotor(driver, "Vehicle Value Details Page");
																					policyInsuredIntrestVehicleValueDetailsMotor.fillandSubmitPolicyInsuredIntrestVehicleValueDetailsMotor(polInsIntVehVaDetMotorEntityData, assertReference);
																					if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																						List<DriverDetCVT4PLRMotorEntity> driverDetCVT4PLRMotorEntityList=testData.getDriverDetCVT4PLRMotorEntityRecords();
																						for(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntityData:driverDetCVT4PLRMotorEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(driverDetCVT4PLRMotorEntityData.getChildKey())){
																								if((driverDetCVT4PLRMotorEntityData.getAction().equalsIgnoreCase("add")|| driverDetCVT4PLRMotorEntityData.getAction().equalsIgnoreCase("edit")) && driverDetCVT4PLRMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsuredIntrestDriverDetailsCVT4PLRMotor policyInsuredIntrestDriverDetailsCVT4PLRMotor= new PolicyInsuredIntrestDriverDetailsCVT4PLRMotor(driver, "Driver Details CV T4-PLR Page");
																									policyInsuredIntrestDriverDetailsCVT4PLRMotor.fillandSubmitPolicyInsuredIntrestDriverDetailsCVT4PLRMotor(driverDetCVT4PLRMotorEntityData, assertReference);
																									if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																										List<BasicCommVehDetMotorEntity> BasicCommVehDetMotorEntityList=testData. getBasicCommVehDetMotorEntityRecords();
																										for(BasicCommVehDetMotorEntity basicCommVehDetMotorEntityData:BasicCommVehDetMotorEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(basicCommVehDetMotorEntityData.getChildKey())){
																												if((basicCommVehDetMotorEntityData.getAction().equalsIgnoreCase("add")|| basicCommVehDetMotorEntityData.getAction().equalsIgnoreCase("edit")) && basicCommVehDetMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													PolicyInsuredIntrestBasicCommVehicleDetailsMotor policyInsuredIntrestBasicCommVehicleDetailsMotor= new PolicyInsuredIntrestBasicCommVehicleDetailsMotor(driver, "Basic Comm Vehicle Details Page");
																													policyInsuredIntrestBasicCommVehicleDetailsMotor.fillandSubmitPolicyInsuredIntrestBasicCommVehicleDetailsMotor(basicCommVehDetMotorEntityData, assertReference);
																													/*if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){
																																}*/
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

										}
									}

								}
							}
						}
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages Page");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils Page ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute Page");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigForwardButton")){

																		List<SumInsforLibMotorEntity> SumInsforLibMotorEntityList=testData.getSumInsforLibMotorEntity();
																		for(SumInsforLibMotorEntity sumInsforLibMotorEntityData: SumInsforLibMotorEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(sumInsforLibMotorEntityData.getChildKey())){
																				if(sumInsforLibMotorEntityData.getAction().equalsIgnoreCase("add")|| sumInsforLibMotorEntityData.getAction().equalsIgnoreCase("edit") && sumInsforLibMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsIntrstCovrageAttrSumInsuredOne policyInsIntrstCovrageAttrSumInsuredOne=new PolicyInsIntrstCovrageAttrSumInsuredOne(driver,"Motor Trade Road Risk-Package Page");
																					policyInsIntrstCovrageAttrSumInsuredOne.fillandSubmitSumInsuredforLibMotorEntity(sumInsforLibMotorEntityData, assertReference);
																					if(sumInsforLibMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																						List<SumInsuredAndLossEntity> SumInsuredAndLossEntityList=testData. getSumInsuredAndLossEntityRecord();
																						for(SumInsuredAndLossEntity sumInsuredAndLossEntityData: SumInsuredAndLossEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(sumInsuredAndLossEntityData.getChildKey())){
																								if(sumInsuredAndLossEntityData.getAction().equalsIgnoreCase("add")|| sumInsuredAndLossEntityData.getAction().equalsIgnoreCase("edit") && sumInsuredAndLossEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsIntrstCovrageAttrSumInsuredTwo policyInsIntrstCovrageAttrSumInsuredTwo=new PolicyInsIntrstCovrageAttrSumInsuredTwo(driver,"CV Cover Property Page");
																									policyInsIntrstCovrageAttrSumInsuredTwo.fillandSubmitfillPolicyInsIntrstCoverageAttrSumInsuredTwo(sumInsuredAndLossEntityData, assertReference);
																								}

																							}
																						}
																					}

																				}
																			}
																		}
																	}
																}
															}
														}
													}	


													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}



												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}








	public void policyInsuredInterestMotorVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {

		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Motor Verify Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details Page");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);
					}

					///********* Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("verify")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes Page"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										List<PolInsIntPreHistMotorEntity> polInsIntPreHistMotorEntityList=testData.getPolInsIntPreHistMotorEntityRecord();
										for(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntityData:polInsIntPreHistMotorEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntPreHistMotorEntityData.getChildKey())){
												if((polInsIntPreHistMotorEntityData.getAction().equalsIgnoreCase("verify")) && polInsIntPreHistMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredIntrestPreviousHistoryOfMotor policyInsuredIntrestPreviousHistoryOfMotor= new PolicyInsuredIntrestPreviousHistoryOfMotor(driver, "Previous History of Vehicle Page");
													policyInsuredIntrestPreviousHistoryOfMotor.fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(polInsIntPreHistMotorEntityData, assertReference);
													if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

														List<MoreCommeVehiDMotorEntity> moreCommeVehiDMotorEntityList=testData.getMoreCommeVehiDMotorEntityRecords();
														for(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntityData:moreCommeVehiDMotorEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(moreCommeVehiDMotorEntityData.getChildKey())){
																if((moreCommeVehiDMotorEntityData.getAction().equalsIgnoreCase("verify")) && moreCommeVehiDMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredIntrestMoreCommercialVehicleDetailMotor PolicyInsuredIntrestMoreCommercialVehicleDetailMotor= new PolicyInsuredIntrestMoreCommercialVehicleDetailMotor(driver, "More Commericial Vehicle Details Page");
																	PolicyInsuredIntrestMoreCommercialVehicleDetailMotor.fillandSubmitPolicyInsuredIntrestMoreCommercialVehicleDetailMotor(moreCommeVehiDMotorEntityData, assertReference);
																	if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																		List<PolInsIntVehVaDetMotorEntity> polInsIntVehVaDetMotorEntityList=testData.getPolInsIntVehVaDetMotorEntityRecords();
																		for(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntityData:polInsIntVehVaDetMotorEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntVehVaDetMotorEntityData.getChildKey())){
																				if((polInsIntVehVaDetMotorEntityData.getAction().equalsIgnoreCase("verify")) && polInsIntVehVaDetMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsuredIntrestVehicleValueDetailsMotor policyInsuredIntrestVehicleValueDetailsMotor= new PolicyInsuredIntrestVehicleValueDetailsMotor(driver, "Vehicle Value Details Page");
																					policyInsuredIntrestVehicleValueDetailsMotor.fillandSubmitPolicyInsuredIntrestVehicleValueDetailsMotor(polInsIntVehVaDetMotorEntityData, assertReference);
																					if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																						List<DriverDetCVT4PLRMotorEntity> driverDetCVT4PLRMotorEntityList=testData.getDriverDetCVT4PLRMotorEntityRecords();
																						for(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntityData:driverDetCVT4PLRMotorEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(driverDetCVT4PLRMotorEntityData.getChildKey())){
																								if((driverDetCVT4PLRMotorEntityData.getAction().equalsIgnoreCase("verify")) && driverDetCVT4PLRMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsuredIntrestDriverDetailsCVT4PLRMotor policyInsuredIntrestDriverDetailsCVT4PLRMotor= new PolicyInsuredIntrestDriverDetailsCVT4PLRMotor(driver, "Driver Details CV T4-PLR Page");
																									policyInsuredIntrestDriverDetailsCVT4PLRMotor.fillandSubmitPolicyInsuredIntrestDriverDetailsCVT4PLRMotor(driverDetCVT4PLRMotorEntityData, assertReference);
																									if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																										List<BasicCommVehDetMotorEntity> BasicCommVehDetMotorEntityList=testData. getBasicCommVehDetMotorEntityRecords();
																										for(BasicCommVehDetMotorEntity basicCommVehDetMotorEntityData:BasicCommVehDetMotorEntityList){
																											if(policyEntity.getParentKey().equalsIgnoreCase(basicCommVehDetMotorEntityData.getChildKey())){
																												if((basicCommVehDetMotorEntityData.getAction().equalsIgnoreCase("verify")) && basicCommVehDetMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																													PolicyInsuredIntrestBasicCommVehicleDetailsMotor policyInsuredIntrestBasicCommVehicleDetailsMotor= new PolicyInsuredIntrestBasicCommVehicleDetailsMotor(driver, "Basic Comm Vehicle Details Page");
																													policyInsuredIntrestBasicCommVehicleDetailsMotor.fillandSubmitPolicyInsuredIntrestBasicCommVehicleDetailsMotor(basicCommVehDetMotorEntityData, assertReference);
																													if(polInsIntPreHistMotorEntityData.getBooleanValueForField("ConfigForwardButton")){
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

										}
									}

								}
							}
						}
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages Page");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils Page ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute Page");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigForwardButton")){

																		List<SumInsforLibMotorEntity> SumInsforLibMotorEntityList=testData.getSumInsforLibMotorEntity();
																		for(SumInsforLibMotorEntity sumInsforLibMotorEntityData: SumInsforLibMotorEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(sumInsforLibMotorEntityData.getChildKey())){
																				if(sumInsforLibMotorEntityData.getAction().equalsIgnoreCase("verify") && sumInsforLibMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsIntrstCovrageAttrSumInsuredOne policyInsIntrstCovrageAttrSumInsuredOne=new PolicyInsIntrstCovrageAttrSumInsuredOne(driver,"Motor Trade Road Risk-Package Page");
																					policyInsIntrstCovrageAttrSumInsuredOne.fillandSubmitSumInsuredforLibMotorEntity(sumInsforLibMotorEntityData, assertReference);
																					if(sumInsforLibMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																						List<SumInsuredAndLossEntity> SumInsuredAndLossEntityList=testData. getSumInsuredAndLossEntityRecord();
																						for(SumInsuredAndLossEntity sumInsuredAndLossEntityData: SumInsuredAndLossEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(sumInsuredAndLossEntityData.getChildKey())){
																								if(sumInsuredAndLossEntityData.getAction().equalsIgnoreCase("verify")&& sumInsuredAndLossEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsIntrstCovrageAttrSumInsuredTwo policyInsIntrstCovrageAttrSumInsuredTwo=new PolicyInsIntrstCovrageAttrSumInsuredTwo(driver,"CV Cover Property Page");
																									policyInsIntrstCovrageAttrSumInsuredTwo.fillandSubmitfillPolicyInsIntrstCoverageAttrSumInsuredTwo(sumInsuredAndLossEntityData, assertReference);
																								}

																							}
																						}
																					}
																				}	
																			}
																		}
																	}
																}
															}
														}
													}







													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	//}
	//	}
	//	}
	//	}
	//}
	//	}

	//	}
	//}
	//*******************************************************Marine Cargo***********************************************//
	public void policyAttributeMarineCargoEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if((policyAttributeEntityListData.getAction().equalsIgnoreCase("add")||policyAttributeEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolAttrMarinCargoEntity> polAttributeMarineCargoEntityList=testData.getPolAttrMarinCargoEntityRecords();
						for(PolAttrMarinCargoEntity polAttributeMarinCargoEntityList:polAttributeMarineCargoEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttributeMarinCargoEntityList.getChildKey())){
								if((polAttributeMarinCargoEntityList.getAction().equalsIgnoreCase("add")|| polAttributeMarinCargoEntityList.getAction().equalsIgnoreCase("edit")) && polAttributeMarinCargoEntityList.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMarineCargo policyAttributeMarineCargo=new PolicyAttributeMarineCargo(driver, "Policy Attributes Details Page");
									policyAttributeMarineCargo.fillandSubmitPolicyInsIntMarineCargo(polAttributeMarinCargoEntityList, assertReference);									
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyAttributeMarineCargoVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException{
		List<PolicyAttributeEntity>  policyAttributeEntityList=testData.getPolicyAttributeRecord();
		for(PolicyAttributeEntity policyAttributeEntityListData :policyAttributeEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttributeEntityListData.getChildKey())){
				if(policyAttributeEntityListData.getAction().equalsIgnoreCase("verify") && policyAttributeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttribute policyAttribute=new PolicyAttribute(driver, "Policy Attribute Page");
					policyAttribute.fillandSubmitPolicyAttributeProccedDetails(policyAttributeEntityListData, assertReference);
					/************Click on proceed when add************/
					//****************Policy Attribute After Proceed*************************//
					if(	policyAttributeEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<PolAttrMarinCargoEntity> polAttributeMarineCargoEntityList=testData.getPolAttrMarinCargoEntityRecords();
						for(PolAttrMarinCargoEntity polAttributeMarinCargoEntityList:polAttributeMarineCargoEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(polAttributeMarinCargoEntityList.getChildKey())){
								if(polAttributeMarinCargoEntityList.getAction().equalsIgnoreCase("verify") && polAttributeMarinCargoEntityList.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyAttributeMarineCargo policyAttributeMarineCargo=new PolicyAttributeMarineCargo(driver, "Policy Attributes Details Page");
									policyAttributeMarineCargo.fillandSubmitPolicyInsIntMarineCargo(polAttributeMarinCargoEntityList, assertReference);									
								}
							}
						}
					}
				}
			}
		}
	}
	public void policyInsuredInterestMarineCargoEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Marine Cargo Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if((policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")||policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("add")|| policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("edit") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details Page");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);
					}

					///********* Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if((memberAttributesEntityData.getAction().equalsIgnoreCase("add")|| memberAttributesEntityData.getAction().equalsIgnoreCase("edit")) && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes Page"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										List<PolInsIntAttrMCargoEntity> polInsIntAttrMCargoEntityList=testData.getPolInsIntAttrMCargoEntityRecords();
										for(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntityData:polInsIntAttrMCargoEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrMCargoEntityData.getChildKey())){
												if((polInsIntAttrMCargoEntityData.getAction().equalsIgnoreCase("add")|| polInsIntAttrMCargoEntityData.getAction().equalsIgnoreCase("edit")) && polInsIntAttrMCargoEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInrestAttributeForMArineCargo policyInsuredInrestAttributeForMArineCargo= new PolicyInsuredInrestAttributeForMArineCargo(driver, "Policy Insured Interest Details");
													policyInsuredInrestAttributeForMArineCargo.fillandSubmitPolicyInsuredInrestAttributeForMArineCargo(polInsIntAttrMCargoEntityData, assertReference);
													if(polInsIntAttrMCargoEntityData.getBooleanValueForField("ConfigForwordButton")){

														List<PolInsIntAttCarDetMCEntity> polInsIntAttCarDetMCEntityList=testData.getPolInsIntAttrAttCarDetMCEntityRecords();
														for(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntityData:polInsIntAttCarDetMCEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttCarDetMCEntityData.getChildKey())){
																if((polInsIntAttCarDetMCEntityData.getAction().equalsIgnoreCase("add")|| polInsIntAttCarDetMCEntityData.getAction().equalsIgnoreCase("edit")) && polInsIntAttCarDetMCEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyInsuredInrestAttributeCargoDetailsMarineCargo policyInsuredInrestAttributeCargoDetailsMarineCargo= new PolicyInsuredInrestAttributeCargoDetailsMarineCargo(driver, "Policy Cargo Insured Interest Details");
																	policyInsuredInrestAttributeCargoDetailsMarineCargo.fillandSubmitPolicyInsuredInrestAttributeForMarineCargo(polInsIntAttCarDetMCEntityData, assertReference);



																}
															}
														}

													}
												}
											}
										}
									}
								}
							}
						}
					}

					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages Page");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntityData.getAction().equalsIgnoreCase("edit")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("add")||policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("edit")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils Page ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("add")|| policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("edit") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute Page");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigProceedButton")){

																		List<AttchCovAttMarineCargoEntity> attchCovAttMarineCargoEntityList=testData.getAttachCovAttributesMarineCargoEntityRecords();
																		for(AttchCovAttMarineCargoEntity attachCovAttMarineCargoEntityData: attchCovAttMarineCargoEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(attachCovAttMarineCargoEntityData.getChildKey())){
																				if(attachCovAttMarineCargoEntityData.getAction().equalsIgnoreCase("add")|| attachCovAttMarineCargoEntityData.getAction().equalsIgnoreCase("edit") && attachCovAttMarineCargoEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					AttachCovAttributesMarineCargo attachCovAttributesMarineCargo=new AttachCovAttributesMarineCargo(driver,"Policy Member AttachCoverages Attribute Page");
																					attachCovAttributesMarineCargo.fillandSubmitAttachCoverageAttrMarineCargo(attachCovAttMarineCargoEntityData, assertReference);
																				}
																			}
																		}
																	}
																}
															}
														}
													}	


													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoveragePremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("add")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}



												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	public void policyInsuredInterestMarineCargoVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Policy Insured Interest Marine Cargo Edit Helper </i></B>");
		List<PolicyMemberDetailsEntity>policyMemberDetailsEntityList=testData.getPolicyMemberDetailsEntity();
		for(PolicyMemberDetailsEntity policyMemberDetailsEntityListData:policyMemberDetailsEntityList ){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberDetailsEntityListData.getChildKey())){
				if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					Policy_MemberSearchPage policyMemberSearchPage=new Policy_MemberSearchPage(driver, "Policy Insured Interest Page");
					policyMemberSearchPage.navigateToNewButton(policyMemberDetailsEntityListData);
					policyMemberSearchPage.fillandSearchPolicyMemberDetails(policyMemberDetailsEntityListData,assertReference);

					///*************Policy Insured Interest Code  create or edit***********
					if(policyMemberDetailsEntityListData.getAction().equalsIgnoreCase("verify") && policyMemberDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PolicyMemberDetails policyMemberDetails =new PolicyMemberDetails(driver, "Policy Insured Interest Details Page");
						policyMemberDetails.fillAndSaveMemberDetails(policyMemberDetailsEntityListData, assertReference);
						testData.updateRecordsForCriteria(policyMemberDetailsEntityListData);
					}

					///********* Attribute in insured interest Details ******************** 
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						List<MemberAttributesEntity> memberAttributesEntityList=testData.getMemberAttributesEntityRecords();
						for(MemberAttributesEntity memberAttributesEntityData: memberAttributesEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(memberAttributesEntityData.getChildKey())){
								if(memberAttributesEntityData.getAction().equalsIgnoreCase("verify") && memberAttributesEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttributes policyMemberAttributesPage= new PolicyMemberAttributes(driver, "Policy Insured Interest  Attributes Page"); 
									policyMemberAttributesPage.fillAndProceedPolicyMemberAttributes(memberAttributesEntityData, assertReference);
									if(memberAttributesEntityData.getBooleanValueForField("ConfigProceedButton")){

										List<PolInsIntAttrMCargoEntity> polInsIntAttrMCargoEntityList=testData.getPolInsIntAttrMCargoEntityRecords();
										for(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntityData:polInsIntAttrMCargoEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(polInsIntAttrMCargoEntityData.getChildKey())){
												if(polInsIntAttrMCargoEntityData.getAction().equalsIgnoreCase("verify") && polInsIntAttrMCargoEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyInsuredInrestAttributeForMArineCargo policyInsuredInrestAttributeForMArineCargo= new PolicyInsuredInrestAttributeForMArineCargo(driver, "Policy Insured Interest Details");
													policyInsuredInrestAttributeForMArineCargo.fillandSubmitPolicyInsuredInrestAttributeForMArineCargo(polInsIntAttrMCargoEntityData, assertReference);

												}
											}
										}
									}
								}
							}
						}
					}
					if(policyMemberDetailsEntityListData.getBooleanValueForField("ConfigAttachCoveragesTab")){
						List<PolicyMemAttachCovEntity> policyMemAttachCovEntityList=testData.getPolicyMemAttachCovEntity();
						for(PolicyMemAttachCovEntity policyMemAttachCovEntityData: policyMemAttachCovEntityList){
							if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovEntityData.getChildKey())){
								if((policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")) && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyMemberAttachCoverages policyMemberAttachCoverages= new PolicyMemberAttachCoverages(driver, "Policy Member AttachCoverages Page");
									policyMemberAttachCoverages.fillAndSubmitAttachCoverageDetails(policyMemAttachCovEntityData, assertReference);
									/********************Insured interset coverage  page End***********/ 
									/********************Policy Memeber coverage Details Page starts****************/
									if(policyMemAttachCovEntityData.getAction().equalsIgnoreCase("verify")  && policyMemAttachCovEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										List<PolicyMemberCoverageDEntity> policyMemberCoverageDEntityList=testData.getPolicyMemberCoverageDRecord();
										for(PolicyMemberCoverageDEntity policyMemberCoverageDEntityyData: policyMemberCoverageDEntityList){
											if(policyEntity.getParentKey().equalsIgnoreCase(policyMemberCoverageDEntityyData.getChildKey())){
												if((policyMemberCoverageDEntityyData.getAction().equalsIgnoreCase("verify")) && policyMemberCoverageDEntityyData.getStepGroup().equalsIgnoreCase(stepGroup)){
													PolicyPolicyMemberAttachCoverageDeatils policyPolicyMemberAttachCoverageDeatils= new PolicyPolicyMemberAttachCoverageDeatils(driver, "Policy MemberAttachCoverage Deatils Page ");
													policyPolicyMemberAttachCoverageDeatils.fillandSubmitPolicyMemberAttachCovDetails(policyMemberCoverageDEntityyData, assertReference);
													/**************** Policy Memeber coverage Details Page End And After click on Premium******************/
													/****************attach Coverage Attribute Start***********/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageAttributeLink")){
														List<PolicyMemAttachCovAtrEntity> policyMemAttachCovAtrEntityList=testData.getPolicyMemAttachCovAtrEntities();
														for(PolicyMemAttachCovAtrEntity policyMemAttachCovAtrEntityData: policyMemAttachCovAtrEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(policyMemAttachCovAtrEntityData.getChildKey())){
																if(policyMemAttachCovAtrEntityData.getAction().equalsIgnoreCase("verify") && policyMemAttachCovAtrEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																	PolicyMemberAttachCoveragseAttributes policyMemberAttachCoveragseAttributes=new PolicyMemberAttachCoveragseAttributes(driver,"Policy Member AttachCoverages Attribute Page");
																	policyMemberAttachCoveragseAttributes.fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(policyMemAttachCovAtrEntityData, assertReference);
																	if(policyMemAttachCovAtrEntityData.getBooleanValueForField("ConfigForwardButton")){

																		List<SumInsforLibMotorEntity> SumInsforLibMotorEntityList=testData.getSumInsforLibMotorEntity();
																		for(SumInsforLibMotorEntity sumInsforLibMotorEntityData: SumInsforLibMotorEntityList){
																			if(policyEntity.getParentKey().equalsIgnoreCase(sumInsforLibMotorEntityData.getChildKey())){
																				if(sumInsforLibMotorEntityData.getAction().equalsIgnoreCase("verify") && sumInsforLibMotorEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																					PolicyInsIntrstCovrageAttrSumInsuredOne policyInsIntrstCovrageAttrSumInsuredOne=new PolicyInsIntrstCovrageAttrSumInsuredOne(driver,"Motor Trade Road Risk-Package Page");
																					policyInsIntrstCovrageAttrSumInsuredOne.fillandSubmitSumInsuredforLibMotorEntity(sumInsforLibMotorEntityData, assertReference);
																					if(sumInsforLibMotorEntityData.getBooleanValueForField("ConfigForwardButton")){

																						List<SumInsuredAndLossEntity> SumInsuredAndLossEntityList=testData. getSumInsuredAndLossEntityRecord();
																						for(SumInsuredAndLossEntity sumInsuredAndLossEntityData: SumInsuredAndLossEntityList){
																							if(policyEntity.getParentKey().equalsIgnoreCase(sumInsuredAndLossEntityData.getChildKey())){
																								if(sumInsuredAndLossEntityData.getAction().equalsIgnoreCase("verify")&& sumInsuredAndLossEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																									PolicyInsIntrstCovrageAttrSumInsuredTwo policyInsIntrstCovrageAttrSumInsuredTwo=new PolicyInsIntrstCovrageAttrSumInsuredTwo(driver,"CV Cover Property Page");
																									policyInsIntrstCovrageAttrSumInsuredTwo.fillandSubmitfillPolicyInsIntrstCoverageAttrSumInsuredTwo(sumInsuredAndLossEntityData, assertReference);
																								}

																							}
																						}
																					}
																				}	
																			}
																		}
																	}
																}
															}
														}
													}

													/****************attach Coverage Attribute End***********/
													/************************Policy Memeber premium page start***********************/
													if(policyMemberCoverageDEntityyData.getBooleanValueForField("ConfigAttchCoverageMotorPremiumlink")){
														List<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getmembAtachCovrgPremSchdEntityRecords();
														for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntitydata:membAtachCovrgPremSchdEntityList){
															if(policyEntity.getParentKey().equalsIgnoreCase(membAtachCovrgPremSchdEntitydata.getChildKey())){
																if((membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("verify")|| membAtachCovrgPremSchdEntitydata.getAction().equalsIgnoreCase("edit")) && membAtachCovrgPremSchdEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
																	MemberAttachCoverage_PremiumSchedule memberAttachCoverage_PremiumSchedule = new MemberAttachCoverage_PremiumSchedule(driver,"Policy Member AttachCoverage PremiumSchedule Page");
																	memberAttachCoverage_PremiumSchedule.fillandSubmitPolicyPremiumDetails(membAtachCovrgPremSchdEntitydata, assertReference);
																}
															}
														}
														/********************************Policy Memeber premium page End**************************/
													}
												}
											}
											//****************** Member Attach Coverage Attribute ********************//
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	//*************************************************************************Marine Cargo******************************************************//

	public void policyClientDetailsHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
		for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
				if((clientDetailsEntityData.getAction().equalsIgnoreCase("add") || clientDetailsEntityData.getAction().equalsIgnoreCase("edit")) && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
					clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
				}
			}
		}
	}
	public void policyClientDetailsVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		List<ClientDetailsEntity> clientDetailsEntityList=testData.getClientDetailsEntityRecords();
		for(ClientDetailsEntity clientDetailsEntityData:clientDetailsEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(clientDetailsEntityData.getChildKey())){
				if(clientDetailsEntityData.getAction().equalsIgnoreCase("verify") && clientDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClientDetailsPage clientDetailsPage= new ClientDetailsPage(driver, "Client Details Page");
					clientDetailsPage.fillandSubmitClientDetails(clientDetailsEntityData, assertReference);
				}
			}
		}
	}
	private void policyAttributeGSTParamEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,PolicyEntity policyEntity) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: GST Param Update Edit Helper : </i></B>");
		List<PolicyAttrGstUpdateEntity> policyAttrGstUpdateEntityList=testData.getPolicyAttrGstUpdateEntityRecord();
		for(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntityListData: policyAttrGstUpdateEntityList){
			if(policyEntity.getParentKey().equalsIgnoreCase(policyAttrGstUpdateEntityListData.getChildKey())){
				if((policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("add")|| policyAttrGstUpdateEntityListData.getAction().equalsIgnoreCase("edit")) && policyAttrGstUpdateEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					PolicyAttrributeGstUpadateParam policyAttrributeGstUpadateParamPage=new PolicyAttrributeGstUpadateParam(driver, "");
					policyAttrributeGstUpadateParamPage.fillandSubmitPolicyAttributrGstUpdate(policyAttrGstUpdateEntityListData, assertReference);
				}
			}
		}
	}
}