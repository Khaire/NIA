package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProp2MNLEntity;
import com.aqm.staf.library.databin.ComClRiskProp2MNLEntity;

public class ClaimRiskProperty2ForMiscNonLiability extends BasePage{


	private PageElement claimRiskProperty2Title;
	private PageElement miscNonT1CLRTitle;
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
	//FS
	private PageElement isSectionICoverRequiredDropDown;
	private PageElement sumInsuredForSectionITextField;
	private PageElement assessedLossAmountOfSECICoverTextField;
	private PageElement claimAmountOfSECICoverTextField;
	private PageElement isSectionIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionIITextField;
	private PageElement assessedLossAmountOfSECIICoverTextField;
	private PageElement claimAmountOfSECIICoverTextField;
	private PageElement isSectionIIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionIIITextField;
	private PageElement assessedLossAmountOfSECIIICoverTextField;
	private PageElement claimAmountOfSECIIICoverTextField;
	private PageElement isSectionIVCoverRequiredDropDown;
	private PageElement sumInsuredForSectionIVTextField;
	private PageElement assessedLossAmountOfSECIVCoverTextField;
	private PageElement claimAmountOfSECIVCoverTextField;
	private PageElement isSectionVCoverRequiredDropDown;
	private PageElement sumInsuredForSectionVTextField;
	private PageElement assessedLossAmountOfSECVCoverTextField;
	private PageElement claimAmountOfSECVCoverTextField;
	private PageElement isSectionVICoverRequiredDropDown;
	private PageElement sumInsuredForSectionVITextField;
	private PageElement assessedLossAmountOfSECVICoverTextField;
	private PageElement claimAmountOfSECVICoverTextField;
	private PageElement isSectionVIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionVIITextField;
	private PageElement assessedLossAmountOfSECVIICoverTextField;
	private PageElement claimAmountOfSECVIICoverTextField;
	private PageElement isSectionVIIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionVIIITextField;
	private PageElement assessedLossAmountOfSECVIIICoverTextField;
	private PageElement claimAmountOfSECVIIICoverTextField;
	private PageElement isSectionIXCoverRequiredDropDown;
	private PageElement sumInsuredForSectionIXTextField;
	private PageElement assessedLossAmountOfSECIXCoverTextField;
	private PageElement claimAmountOfSECIXCoverTextField;
	private PageElement isSectionXCoverRequiredDropDown;
	private PageElement sumInsuredForSectionXTextField;
	private PageElement assessedLossAmountOfSECXCoverTextField;
	private PageElement claimAmountOfSECXCoverTextField;
	private PageElement isSectionXICoverRequiredDropDown;
	private PageElement sumInsuredForSectionXITextField;
	private PageElement assessedLossAmountOfSECXICoverTextField;
	private PageElement claimAmountOfSECXICoverTextField;
	private PageElement isSectionXIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionXIITextField;
	private PageElement assessedLossAmountOfSECXIICoverTextField;
	private PageElement claimAmountOfSECXIICoverTextField;
	private PageElement isSectionXIIICoverRequiredDropDown;
	private PageElement sumInsuredForSectionXIIITextField;
	private PageElement assessedLossAmountOfSECXIIICoverTextField;
	private PageElement claimAmountOfSECXIIICoverTextField;
	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement previousButton;
	private PageElement backButton;
	//MI
	private PageElement isMoneyInTransitRequiredDropDown;
	private PageElement estimatedAnnualTurnoverTextField;
	private PageElement assessedLossAmountOfMoneyInTransitTextField;
	private PageElement claimAmountOfMoneyInTransitTextField;
	private PageElement isMoneyInTillRequiredDropDown;
	private PageElement totalSumInsuredForSECIITextField;
	private PageElement assessedLossAmountOfMoneyInTillTextField;
	private PageElement claimAmountOfMoneyInTillTextField;
	private PageElement isSRCCCoverRequiredDropDown;
	private PageElement sRCCCoverSumInsuredTextField;
	private PageElement assessedLossAmountOfSRCCCoverTextField;
	private PageElement claimAmountOfSRCCCoverTextField;
	//OS
	private PageElement isSection1FireBuildingRequiredDropDown;
	private PageElement totalSumInsuredForSEC1TextField;
	private PageElement assessedLossAmountOfSection1TextField;
	private PageElement claimAmountOfSection1TextField;
	private PageElement isSection2AFireContentsRequiredDropDown;
	private PageElement totalSumInsuredForSEC2ATextField;
	private PageElement assessedLossAmountOfSection2ATextField;
	private PageElement claimAmountOfSection2ATextField;
	private PageElement isSection2BBurglaryContentsRequiredDropDown;
	private PageElement sumInsuredForSection2BTextField;
	private PageElement assessedLossAmountOfSection2BTextField;
	private PageElement claimAmountOfSection2BTextField;
	private PageElement isSection3TenantsLiabilityRequiredDropDown;
	private PageElement sumInsuredForSection3TextField;
	private PageElement assessedLossAmountOfSection3TextField;
	private PageElement claimAmountOfSection3TextField;
	private PageElement isSection4MoneyInsuranceRequiredDropDown;
	private PageElement sumInsuredForSection4TextField;
	private PageElement assessedLossAmountOfSection4TextField;
	private PageElement claimAmountOfSection4TextField;
	private PageElement isSection5FixedGlassAndSanitaryFittingsRequiredDropDown;
	private PageElement totalSumInsuredForSEC5TextField;
	private PageElement assessedLossAmountOfSection5TextField;
	private PageElement claimAmountOfSection5TextField;
	private PageElement isSection6FidelityGuaranteeRequiredDropDown;
	private PageElement totalGuaranteedAmountTextField;
	private PageElement assessedLossAmountOfSection6TextField;
	private PageElement claimAmountOfSection6TextField;
	private PageElement isSection7DamageToElectronicEquipmentRequiredDropDown;
	private PageElement totalSumInsuredTextField;
	private PageElement assessedLossAmountOfSection7TextField;
	private PageElement claimAmountOfSection7TextField;
	private PageElement isSection8ACostOfReinstatementOfDataRequiredDropDown;
	private PageElement sumInsuredForSection8ATextField;
	private PageElement assessedLossAmountOfSection8ATextField;
	private PageElement claimAmountOfSection8ATextField;
	//PB
	private PageElement detailsOfTravelDropDown;
	private PageElement flightNumberTextField;
	private PageElement ticketNumberTextField;
	private PageElement placeOfTravelFromTextField;
	private PageElement placeOfTravelToTextField;
	private PageElement dateOfJourneyTextField;
	private PageElement passportNumberTextField;
	private PageElement visaNumberTextField;
	private PageElement section1RequiredDropDown;
	private PageElement sumInsuredForSection1TextField;
	private PageElement excessForSEC1TextField;
	private PageElement section2RequiredDropDown;
	private PageElement assessedLossAmountOfSection2TextField;
	private PageElement excessForSEC2TextField;
	private PageElement claimAmountOfSection2TextField;
	private PageElement section3RequiredDropDown;
	private PageElement sumInsuredForsection3TextField;
	private PageElement excessForSEC3TextField;	
	private PageElement section4RequiredDropDown;		
	private PageElement excessForSEC4TextField;		
	private PageElement sumInsuredForSection5TextField;		
	private PageElement excessForSEC5TextField;		
	private PageElement section6RequiredDropDown;		
	private PageElement sumInsuredForSection6TextField;		
	private PageElement excessForSEC6TextField;		
	private PageElement section7RequiredDropDown;		
	private PageElement sumInsuredForSection7TextField;		
	private PageElement excessForSEC7TextField;		
	private PageElement dateOfDateOfJourneyButton;
	//FI
	private PageElement dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudTextField;
	private PageElement dateOfLossDiscoveredTextField;
	//NI
	private PageElement isPhysicalLossOrDamageToNeonSignRequiredDropDown;
	private PageElement sumInsuredForPhysicalLossOrDamageTextField;
	private PageElement assessedLossAmountOfPhysicalLossOrDamageTextField;
	private PageElement claimAmountOfPhysicalLossOrDamageTextField;
	private PageElement isThirdPartyLegalLiabilityRequiredDropDown;
	private PageElement sumInsuredForThirdPartyLegalLiabilityTextField;
	private PageElement assessedLossAmountOfThirdPartyLegalLiabilityTextField;
	private PageElement claimAmountOfThirdPartyLegalLiabilityTextField;
	//BA

	private PageElement totalAssessedLossAmountTextField;
	private PageElement isUnderlnsuranceApplicableDropDown;

	private PageElement netClaimAmountTextField;

	private PageElement underInsuranceTypeDropDown;
	private PageElement underInsuranceAmountTextField;
	private PageElement claimLossAfterUnderInsuranceTextField;
	//HH
	private PageElement previousPolicyNumberTextField;
	private PageElement natureOfTreatmentDropDown;
	private PageElement dateOfAdmissionInHospitalTextField;
	private PageElement dateOfDischargeFromTheHospitalTextField;
	private PageElement nameAndPlaceOfTheHospitalTextField;
	private PageElement dateOfCompletionOfTreatmentHospitalizationTextField;
	private PageElement totalMedicalExpensesHospitalizationTextField;
	private PageElement periodOfLeaveAsPerLeaveCertificateFromTheEmployerFromTextField;
	private PageElement periodOfLeaveAsPerLeaveCertificateFromTheEmployerToTextField;
	private PageElement fitnessCertificateFromDoctorFromDateTextField;
	private PageElement fitnessCertificateFromDoctorToDateTextField;
	private PageElement medicalExtensionRequiredTextField;
	private PageElement isCompensationForEducationFundRequiredDropDown;
	private PageElement isWeeklyCompensationRequiredDropDown;
	private PageElement dateOfDeathTextField;
	private PageElement expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField;
	private PageElement dateOfCommencementOfTreatmentTextField;
	private PageElement dateOfCompletionOfTreatmentOPDTextField;
	private PageElement totalMedicalExpensesOPDTextField;

	private PageElement areStudentsDeadDropDown;
	private PageElement numberOfStudentsDeadTextField;
	private PageElement compensationLimitPerDeadStudentTextField;
	private PageElement totalCompensationForStudentsDeadTextField;
	private PageElement assessedLossAmountForStudentsDeadTextField;	
	private PageElement areStudentsInjuredDropDown;
	private PageElement numberOfStudentsInjuredTextField;
	private PageElement compensationLimitPerInjuredStudentTextField;
	private PageElement totalCompensationForStudentsInjuredTextField;
	private PageElement assessedLossAmountForStudentsInjuredTextField;	
	private PageElement areStudentsHospitalisedDropDown;	
	private PageElement numberOfStudentsHospitalisedTextField;
	private PageElement compensationLimitPerHospitalisedStudentTextField;
	private PageElement totalCompensationForStudentsHospitalisedTextField;
	private PageElement assessedLossAmountForStudentsHospitalisedTextField;	
	private PageElement areParentsDeadDropDown;	
	private PageElement numberOfParentsDeadTextField;
	private PageElement compensationLimitPerDeadParentTextField;
	private PageElement totalCompensationForParentsDeadTextField;
	private PageElement assessedLossAmountForParentsDeadTextField;	
	private PageElement lossOfSchoolBagContainingBooksCoverDropDown;
	private PageElement noOfSchoolBagsLostTextField;	
	private PageElement reimbursementLimitPerStudentForTheLostBagTextField;
	private PageElement totalReimbursementForTheLostSchoolBagsTextField;
	private PageElement assessedLossAmountForLostSchoolBagsTextField;	
	private PageElement paymentOfTuitionAndHostelFeesDropDown;	
	private PageElement totalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFeesTextField;
	private PageElement assessedLossAmountForPaymentOfTuitionAndHostelFeesTextField;


	/*SH-Rajkumar--2nd Page*/
	private PageElement assessedLossAmountOfSectiononeTextField;
	private PageElement claimAmountOfSectiononeTextField;
	private PageElement assessedLossAmountOfSectiontwoTextField;
	private PageElement claimAmountOfSectiontwoTextField;
	private PageElement assessedLossAmountOfSectionthreeTextField;
	private PageElement claimAmountOfSectionthreeTextField;
	private PageElement assessedLossAmountOfSectionfourTextField;
	private PageElement claimAmountOfSectionfourTextField;
	private PageElement assessedLossAmountOfSectionfiveTextField;
	private PageElement claimAmountOfSectionfiveTextField;
	private PageElement assessedLossAmountOfSectionsixTextField;
	private PageElement claimAmountOfSectionsixTextField;
	private PageElement sectionOneRequiredDropDown;
	private PageElement sectionTwoRequiredDropDown;
	private PageElement sectionThreeRequiredDropDown;
	private PageElement sectionFourRequiredDropDown;
	private PageElement sectionFiveRequiredDropDown;
	private PageElement sectionSixRequiredDropDown;
	private PageElement totalSumInsuredForFireContentTextField;	
	private PageElement totalSumInsuredBurglaryAndHouseBreakingTextField;
	private PageElement sumInsuredForSectionthreeTextField;
	private PageElement sumInsuredPedalCyclesTextField;
	private PageElement totalSumInsuredForPlateGlassTextField;
	private PageElement sumInsuredForSectionsixTextField;


	//SY-Rajkumar-2nd Page	
	private PageElement nameOfTheStudentTextField;
	private PageElement ageYrTextField;
	private PageElement classOfTheStudentTextField;
	private PageElement divisionTextField;
	private PageElement rollNumberTextField;


	//BB - Rajkumar-2nd Page	
	private PageElement claimOnMoneyInPremisesDropDown;
	private PageElement claimOnMoneyInTransitDropDown;
	private PageElement claimOnRegisteredPostalSendingDropDown;	
	private PageElement additionalSumInsuredForMoneyInPremisesTextField;
	private PageElement additionalSumInsuredForMoneyInTransitTextField;
	private PageElement assessedLossAmountOfMoneyInPremisesTextField;	
	private PageElement claimAmountOfMoneyInPremisesTextField;		
	private PageElement assessedLossAmountOfRegisteredPostalSendingTextField;	
	private PageElement claimAmountOfRegisteredPostalSendingTextField;
	private PageElement limitsOfLiabilityForRegisteredPostalSendingTextField;

	//BD-Rajkumar--2ND Page	
	private PageElement claimOnStockInTradeDropDown;
	private PageElement sumInsuredStockInTradeTextField;

	private PageElement claimOnGoodsHeldInTrustOrCommissionDropDown;
	private PageElement sumInsuredGoodsHeldInTrustAndOrCommission;
	private PageElement assessedLossAmountOfGoodsHeldInTrustOrCommission;
	private PageElement claimAmountOfGoodsHeldInTrustOrCommission;
	//BN-Rajkumar--2ND Page
	private PageElement claimOnAppraisersDropDown;
	private PageElement limitsOfLiabilityForAppraisersTextField;
	private PageElement assessedLossAmountOfAppraisersTextField;
	private PageElement claimAmountOfAppraisersTextField;
	private PageElement claimOnCollectionAgentJantaChotiBachatYojanaPigmieCollectorsDropDown;
	private PageElement limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField;
	private PageElement assessedLossAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField;
	private PageElement claimAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField;
	//JI   === Dharmendra
	private PageElement claimOnStockInPremisesDropDown;
	private PageElement stockInPremisesTextField;
	private PageElement assessedLossAmountOfStockInPremisesTextField;
	private PageElement claimAmountOfStockInPremisesTextField;
	private PageElement claimOnStockAtDisplayWindowInThePremisesDropDown;
	private PageElement stockAtDisplayWindowInThePremisesTextField;
	private PageElement assessedLossAmountOfStockAtDisplayWindowInThePremisesTextField;
	private PageElement claimAmountOfStockAtDisplayWindowInThePremisesTextField;
	private PageElement claimOnStockInLockedSafeInThePremisesDropDown;
	private PageElement stockInLockedSafeInThePremisesTextField;
	private PageElement assessedLossAmountOfStockInLockedSafeInThePremisesTextField;
	private PageElement claimAmountOfStockInLockedSafeInThePremisesTextField;
	private PageElement claimOnElseWhereWithinThePremisesDropDown;
	private PageElement elseWhereWithinThePremisesTextField;
	private PageElement assessedLossAmountOfElseWhereWithinThePremisesTextField;
	private PageElement claimAmountOfElseWhereWithinThePremisesTextField;
	private PageElement claimOnCashAndCurrencyNotesDropDown;
	private PageElement cashAndCurrencyNotesTextField;
	private PageElement assessedLossAmountOfCashAndCurrencyNotesTextField;
	private PageElement claimAmountOfCashAndCurrencyNotesTextField;
	private PageElement claimOnPropertyInBankLockersDropDown;
	private PageElement propertyInBankLockersTextField;
	private PageElement assessedLossAmountOfPropertyInBankLockersTextField;
	private PageElement claimAmountOfPropertyInBankLockersTextField;
	private PageElement claimOnPrivateLockersDropDown;
	private PageElement privateLockersTextField;
	private PageElement assessedLossAmountOfPrivateLockersTextField;
	private PageElement claimAmountOfPrivateLockersTextField;
	//PQ and PY    === Dharmendra
	private PageElement isTerrorismCoverRequiredDropDown;
	private PageElement sumInsuredForTerrorismTextField;	
	private PageElement assessedLossAmountOfTerrorismCoverTextField;	
	private PageElement claimAmountOfTerrorismCoverTextField;
	//SK   === Dharmendra
	private PageElement claimDropDown;
	private PageElement reasonForReopenDropDown;	
	private PageElement districtStateNationalDropDown;	
	private PageElement districtCourtSupremeCourtHighCourtSLPDropDown;	
	private PageElement excessTextField;	
	private PageElement claimAmountTextField;	
	private PageElement surveyFeesTextField;	
	private PageElement translatorFeesTextField;	
	private PageElement legalOpinionFeesTextField;	
	private PageElement other1FeesTextField;	
	private PageElement other2FeesTextField;	
	private PageElement totalClaimAmountTextField;	
	private PageElement totalSurveyorFeesTextField;
	//BI   === Dharmendra
	private PageElement claimOnStockInTradeDroDown;
	private PageElement stockInTradeTextField;
	private PageElement assessedLossAmountOfStockInTradeTextField;
	private PageElement claimAmountOfStockInTradeTextField;
	private PageElement claimOnGoodsHeldInTrustOrCommissionDroDown;
	private PageElement goodsHeldInTrustCommissionTextField;
	private PageElement assessedLossAmountOfGoodsHeldInTrustOrCommissionTextField;
	private PageElement claimAmountOfGoodsHeldInTrustOrCommissionTextField;
	private PageElement claimOnFurnitureOrFixtureOrFittingsDroDown;
	private PageElement furnitureFixtureFittingsTextField;
	private PageElement assessedLossAmountOfFurnitureOrFixtureOrFittingsTextField;
	private PageElement claimAmountOfFurnitureOrFixtureOrFittingsTextField;
	private PageElement claimOnOfficeEquipmentDroDown;
	private PageElement officeEquipmentTextField;
	private PageElement assessedLossAmountOfOfficeEquipmentTextField;
	private PageElement claimAmountOfOfficeEquipmentTextField;
	private PageElement claimOnCoinsOrCurrencyOrCuriosEtcDroDown;
	private PageElement coinsCurrencyCuriosEtcTextField;
	private PageElement assessedLossAmountOfCoinsOrCurrencyOrCuriosEtcTextField;
	private PageElement claimAmountOfCoinsOrCurrencyOrCuriosEtcTextField;
	private PageElement claimOnOthersSumInsuredDroDown;
	private PageElement othersSumInsuredTextField;
	private PageElement assessedLossAmountOfOthersSumInsuredTextField;
	private PageElement claimAmountOfOthersSumInsuredTextField;
	private PageElement dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudButton;
	private PageElement dateOfLossDiscoveredButton;
	
	//Bikas
	private PageElement dateofdeathFindButton;
	private PageElement  estimatedAmountofLossTextField;
	private PageElement ClaimassessedAmountTextField;
	private PageElement SueandLabourChargesTextField;
	private PageElement SalvageChargesTextField;
	private PageElement CollisionLiabilityTextField;
	private PageElement DeductibleAmountTextField;
	private PageElement SalvageAmountTextField;
	private PageElement UnderinsurancepercentTextField;
	private PageElement OtherRecoveredAmountTextField;
	
	//Anmol
	private PageElement SueandLabourCharges;
	private PageElement  CollisionLiability;
	private PageElement Underinsurancepercent;
	private PageElement OtherRecoveredAmount;
	private PageElement saveButton;
	private PageElement NameoftheInsuredTextField;
	private PageElement AgeyrForRKTextField;
	private PageElement EmployeeNumberoftheInsuredpersonTextField;
	private PageElement GroupNameTextField;
	private PageElement IsclaimrequiredforroadaccidentDroDown;
	private PageElement IsclaimrequiredforhospexpensesdueforoadaccidentDroDown;
	private PageElement IsclaimrequiredforhospexpensesduetoaccdntincourseofempextnDroDown;
	private PageElement IsclaimrequiredforhospexpensesforanyotheraccidentwidercoverDroDown;
	private PageElement ClaimAmountforHospExpensesDuetoRoadAccidentteTextField;
	
	public ClaimRiskProperty2ForMiscNonLiability(WebDriver driver, String pageName) {
		super(driver, pageName);

		saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimRiskProperty2Title = new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Property')]"), " Claim Risk Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		miscNonT1CLRTitle = new PageElement(By.xpath("//div//b[contains(text(),'T1-CLR')]"), "Misc Non T1-CLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		isSectionICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section I cover required?", "select")), "Is Section I cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section I", "input")), "Sum Insured for Section I TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECI Cover", "input")), "Assessed Loss Amount of SECI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECI Cover", "input")), "Claim Amount of SECI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section II cover required?", "select")), "Is Section II cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section II", "input")), "Sum Insured for Section II TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECII Cover", "input")), "Assessed Loss Amount of SECII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECII Cover", "input")), "Claim Amount of SECII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionIIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section III cover required?", "select")), "Is Section III cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section III", "input")), "Sum Insured for Section III TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECIII Cover", "input")), "Assessed Loss Amount of SECIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECIII Cover", "input")), "Claim Amount of SECIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionIVCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section IV cover required?", "select")), "Is Section IV cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIVTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section IV", "input")), "Sum Insured for Section IV TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIVCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECIV Cover", "input")), "Assessed Loss Amount of SECIV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIVCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECIV Cover", "input")), "Claim Amount of SECIV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionVCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section V cover required?", "select")), "Is Section V cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionVTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section V", "input")), "Sum Insured for Section V TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECVCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECV Cover", "input")), "Assessed Loss Amount of SECV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECVCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECV Cover", "input")), "Claim Amount of SECV Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionVICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section VI cover required?", "select")), "Is Section VI cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionVITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section VI", "input")), "Sum Insured for Section VI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECVICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECVI Cover", "input")), "Assessed Loss Amount of SECVI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECVICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECVI Cover", "input")), "Claim Amount of SECVI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionVIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section VII cover required?", "select")), "Is Section VII cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionVIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section VII", "input")), "Sum Insured for Section VII TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECVIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECVII Cover", "input")), "Assessed Loss Amount of SECVII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECVIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECVII Cover", "input")), "Claim Amount of SECVII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionVIIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section VIII cover required?", "select")), "Is Section VIII cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionVIIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section VIII", "input")), "Sum Insured for Section VIII TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECVIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECVIII Cover", "input")), "Assessed Loss Amount of SECVIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECVIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECVIII Cover", "input")), "Claim Amount of SECVIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionIXCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section IX cover required?", "select")), "Is Section IX cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionIXTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section IX", "input")), "Sum Insured for Section IX TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECIXCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECIX Cover", "input")), "Assessed Loss Amount of SECIX Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECIXCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECIX Cover", "input")), "Claim Amount of SECIX Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionXCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section X cover required?", "select")), "Is Section X cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionXTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section X", "input")), "Sum Insured for Section X TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECXCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECX Cover", "input")), "Assessed Loss Amount of SECX Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECXCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECX Cover", "input")), "Claim Amount of SECX Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionXICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section XI cover required?", "select")), "Is Section XI cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionXITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section XI", "input")), "Sum Insured for Section XI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECXICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECXI Cover", "input")), "Assessed Loss Amount of SECXI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECXICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECXI Cover", "input")), "Claim Amount of SECXI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionXIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section XII cover required?", "select")), "Is Section XII cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionXIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section XII", "input")), "Sum Insured for Section XII TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECXIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECXII Cover", "input")), "Assessed Loss Amount of SECXII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECXIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECXII Cover", "input")), "Claim Amount of SECXII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionXIIICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section XIII cover required?", "select")), "Is Section XIII cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionXIIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Section XIII", "input")), "Sum Insured for Section XIII TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSECXIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SECXIII Cover", "input")), "Assessed Loss Amount of SECXIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSECXIIICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SECXIII Cover", "input")), "Claim Amount of SECXIII Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MI
		isMoneyInTransitRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Money in Transit Required", "select")), "Is Money in Transit Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedAnnualTurnoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Annual Turnover", "input")), "Estimated Annual Turnover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfMoneyInTransitTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Money in Transit", "input")), "Assessed Loss Amount of Money in Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfMoneyInTransitTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Money in Transit", "input")), "Claim Amount of Money in Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isMoneyInTillRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Money In Till Required", "select")), "Is Money In Till Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForSECIITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for SEC II", "input")), "Total Sum Insured for SEC II TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfMoneyInTillTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Money In Till", "input")), "Assessed Loss Amount of Money In Till TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfMoneyInTillTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Money In Till", "input")), "Claim Amount of Money In Till TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSRCCCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is SRCC Cover Required", "select")), "Is SRCC Cover Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sRCCCoverSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC Cover Sum Insured", "input")), "SRCC Cover Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSRCCCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of SRCC Cover", "input")), "Assessed Loss Amount of SRCC Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSRCCCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of SRCC Cover", "input")), "Claim Amount of SRCC Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("Previous"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//OS
		isSection1FireBuildingRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 1(Fire - Building) required", "select")), "Is section 1(Fire - Building) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForSEC1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for SEC 1", "input")), "Total Sum Insured for SEC 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section1", "input")), "Assessed Loss Amount of Section1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section1", "input")), "Claim Amount of Section1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection2AFireContentsRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 2A(Fire - Contents) required", "select")), "Is section 2A(Fire - Contents) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForSEC2ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for SEC 2A", "input")), "Total Sum Insured for SEC 2A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection2ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section2A", "input")), "Assessed Loss Amount of Section2A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection2ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section2A", "input")), "Claim Amount of Section2A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection2BBurglaryContentsRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 2B(Burglary Contents) required", "select")), "Is section 2B(Burglary Contents) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection2BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section2B", "input")), "Sum insured for section2B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection2BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section2B", "input")), "Assessed Loss Amount of Section2B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection2BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section2B", "input")), "Claim Amount of Section2B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection3TenantsLiabilityRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 3(Tenants Liability) required", "select")), "Is section 3(Tenants Liability) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section3", "input")), "Sum insured for section3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section3", "input")), "Assessed Loss Amount of Section3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section3", "input")), "Claim Amount of Section3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection4MoneyInsuranceRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 4(Money Insurance) required", "select")), "Is section 4(Money Insurance) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section4", "input")), "Sum insured for section4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section4", "input")), "Assessed Loss Amount of Section4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section4", "input")), "Claim Amount of Section4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection5FixedGlassAndSanitaryFittingsRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 5(Fixed glass and Sanitary Fittings) required", "select")), "Is section 5(Fixed glass and Sanitary Fittings) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForSEC5TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for SEC 5", "input")), "Total Sum Insured for SEC 5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection5TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section5", "input")), "Assessed Loss Amount of Section5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection5TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section5", "input")), "Claim Amount of Section5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection6FidelityGuaranteeRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 6(Fidelity Guarantee) required", "select")), "Is section 6(Fidelity Guarantee) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalGuaranteedAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Guaranteed Amount", "input")), "Total Guaranteed Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection6TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section6", "input")), "Assessed Loss Amount of Section6 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection6TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section6", "input")), "Claim Amount of Section6 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection7DamageToElectronicEquipmentRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 7(Damage to electronic equipment) required", "select")), "Is section 7(Damage to electronic equipment) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total sum insured", "input")), "Total sum insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection7TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section7", "input")), "Assessed Loss Amount of Section7 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection7TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section7", "input")), "Claim Amount of Section7 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSection8ACostOfReinstatementOfDataRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is section 8A(Cost of Reinstatement of data) required", "select")), "Is section 8A(Cost of Reinstatement of data) required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection8ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section8A", "input")), "Sum insured for section8A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSection8ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section8A", "input")), "Assessed Loss Amount of Section8A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection8ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section8A", "input")), "Claim Amount of Section8A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PB
		detailsOfTravelDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Travel", "select")), "Details of Travel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		flightNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flight Number", "input")), "Flight Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ticketNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Ticket Number", "input")), "Ticket Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfTravelFromTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of travel (From)", "input")), "Place of travel (From) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfTravelToTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of travel (To)", "input")), "Place of travel (To) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfJourneyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Journey", "input")), "Date of Journey TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passportNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Passport Number", "input")), "Passport Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//passportNumberTextField=new PageElement(By.xpath("//td//div[@id='Passport Number']/following::input[1]"), "Passport Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		visaNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Visa Number", "input")), "Visa Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH
		section1RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 1 Required", "select")), "Section 1 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSection1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section1", "input")), "Sum insured for section1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-1", "input")), "Excess for SEC-1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section2RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 2 Required", "select")), "Section 2 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		assessedLossAmountOfSection2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Section2", "input")), "Assessed Loss Amount of Section2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-2", "input")), "Excess for SEC-2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSection2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Section2", "input")), "Claim Amount of Section2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section3RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 3 Required", "select")), "Section 3 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForsection3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section3", "input")), "Sum insured for section3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-3", "input")), "Excess for SEC-3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section4RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 4 Required", "select")), "Section 4 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		excessForSEC4TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-4", "input")), "Excess for SEC-4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		sumInsuredForSection5TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section5", "input")), "Sum insured for section5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC5TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-5", "input")), "Excess for SEC-5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section6RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 6 Required", "select")), "Section 6 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		sumInsuredForSection6TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section6", "input")), "Sum insured for section6 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		excessForSEC6TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-6", "input")), "Excess for SEC-6 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section7RequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 7 Required", "select")), "Section 7 Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		sumInsuredForSection7TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section7", "input")), "Sum insured for section7TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC7TextField	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for SEC-7", "input")), "Excess for SEC-7 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDateOfJourneyButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of Journey')]/following::input/following::a[@name='firstFocus']"), "Date of Journey Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
		
		//EV
		isTerrorismCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTerrorismTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Terrorism", "input")), "Sum Insured for Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Terrorism Cover", "input")), "Assessed Loss Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Terrorism Cover", "input")), "Claim Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FI
		dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Death/Dismissal /Retirement of employee committing the fraud", "input")), "Date of Death/Dismissal /Retirement of employee committing the fraud TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLossDiscoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Loss discovered", "input")), "Date of Loss discovered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//NI
		isPhysicalLossOrDamageToNeonSignRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Physical loss or damage to neon sign Required", "select")), "Is Physical loss or damage to neon sign Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForPhysicalLossOrDamageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Physical loss or damage", "input")), "Sum Insured for Physical loss or damage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfPhysicalLossOrDamageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Physical loss or damage", "input")), "Assessed Loss Amount of Physical loss or damage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfPhysicalLossOrDamageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Physical loss or damage", "input")), "Claim Amount of Physical loss or damage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThirdPartyLegalLiabilityRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Third party legal liability Required", "select")), "Is Third party legal liability Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForThirdPartyLegalLiabilityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Third party legal liability", "input")), "Sum Insured for Third party legal liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfThirdPartyLegalLiabilityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Third party legal liability", "input")), "Assessed Loss Amount of Third party legal liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfThirdPartyLegalLiabilityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Third party legal liability", "input")), "Claim Amount of Third party legal liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BA
		claimDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonForReopenDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason For Reopen", "select")), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalAssessedLossAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Assessed Loss Amount", "input")), "Total Assessed Loss Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isUnderlnsuranceApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ls Under lnsurance Applicable", "select")), "ls Under lnsurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Net Claim Amount", "input")), "Net Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		districtStateNationalDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National", "select")), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtCourtSupremeCourtHighCourtSLPDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP", "select")), "District Court/Supreme Court/High Court/SLP DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Insurance Type", "select")), "Under Insurance Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance amount", "input")), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimLossAfterUnderInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Loss After Under Insurance", "input")), "Claim Loss After Under Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH
		previousPolicyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Number", "input")), "Previous Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfTreatmentDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nature of Treatment", "select")), "Nature of Treatment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfAdmissionInHospitalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Admission in hospital", "input")), "Date of Admission in hospital TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDischargeFromTheHospitalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Discharge from the Hospital", "input")), "Date of Discharge from the Hospital TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameAndPlaceOfTheHospitalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name and Place of the Hospital", "input")), "Name and Place of the Hospital TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfCompletionOfTreatmentHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of completion of treatment (Hospitalization)", "input")), "Date of completion of treatment (Hospitalization) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalMedicalExpensesHospitalizationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Medical expenses (Hospitalization)", "input")), "Total Medical expenses (Hospitalization)t TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodOfLeaveAsPerLeaveCertificateFromTheEmployerFromTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Period of leave as per leave certificate from the employer (From)", "input")), "Period of leave as per leave certificate from the employer (From) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodOfLeaveAsPerLeaveCertificateFromTheEmployerToTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Period of leave as per leave certificate from the employer (To)", "input")), "Period of leave as per leave certificate from the employer (To) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fitnessCertificateFromDoctorFromDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Fitness certificate from Doctor (from Date)", "input")), "Fitness certificate from Doctor (from Date) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fitnessCertificateFromDoctorToDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Fitness certificate from Doctor (To Date)", "input")), "Fitness certificate from Doctor (To Date) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalExtensionRequiredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Extension Required", "input")), "Medical Extension Required TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCompensationForEducationFundRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is compensation for education fund required?", "select")), "Is compensation for education fund required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isWeeklyCompensationRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Weekly Compensation Required", "select")), "Is Weekly Compensation Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfDeathTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of death", "input")), "Date of death TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expenses incurred for carriage of dead body to the place of residence", "input")), "Expenses incurred for carriage of dead body to the place of residence TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalMedicalExpensesOPDTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Medical expenses (OPD)", "select")), "Total Medical expenses (OPD) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfCommencementOfTreatmentTextField=new PageElement(By.xpath("//td//div[@id='Date of commencement of treatment']/following::input"),"Date of commencement of treatment",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfCompletionOfTreatmentOPDTextField=new PageElement(By.xpath("//td//div[@id='Date of completion of treatment (OPD)']/following::input"),"Date of completion of treatment (OPD)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//PT-Rajkumar--2ND Page
		isTerrorismCoverRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Terrorism Cover Required?')]/following::select"), "Is Terrorism Cover Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTerrorismTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Terrorism')]/following::input"), "Sum Insured For Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTerrorismCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Terrorism Cover')]/following::input"), "Assessed Loss Amount Of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTerrorismCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Terrorism Cover')]/following::input"), "Claim Amount Of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BN-Rajkumar--2ND Page
		claimOnAppraisersDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Appraisers?')]/following::select"), "Claim On Appraisers DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitsOfLiabilityForAppraisersTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limits of Liability for Appraisers')]/following::input"), "limits Of Liability For Appraisers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfAppraisersTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Appraisers')]/following::input"), "Assessed Loss Amount Of Appraisers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfAppraisersTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Appraisers')]/following::input"), "Claim Amount Of Appraisers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnCollectionAgentJantaChotiBachatYojanaPigmieCollectorsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Collection Agent (Janta, Choti bachat yojana, pigmie collectors)?')]/following::select"), "Claim On Collection Agent Janta Choti Bachat Yojana Pigmie Collectors DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limits of Liability for Collection Agent (Janta, Choti bachat yojana, pigmie collectors)')]/following::input"), "Limits Of Liability For Collection Agent Janta, Choti Bachat Yojana, Pigmie Collectors TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Collection Agent (Janta,Choti bachat yojana,pigmie collectors)')]/following::input"), "Assessed Loss Amount Of Collection Agent Janta,Choti Bachat Yojana,Pigmie Collectors TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Collection Agent (Janta, Choti bachat yojana, pigmie collectors)')]/following::input"), "Claim Amount Of Collection Agent Janta, Choti Bachat Yojana, Pigmie Collectors TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//BD-Rajkumar--2ND Page		
		claimOnStockInTradeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Stock in Trade?')]/following::select"), "Claim On Money In Premises DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredStockInTradeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured (Stock in Trade)')]/following::input"), "Sum Insured Stock In Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfStockInTradeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Stock in Trade')]/following::input"), "Assessed Loss Amount Of Stock In Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfStockInTradeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Stock in Trade')]/following::input"), "Claim Amount Of Stock In Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnGoodsHeldInTrustOrCommissionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Goods held in Trust or Commission?')]/following::select"), "Claim On Goods Held In Trust Or Commission DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredGoodsHeldInTrustAndOrCommission= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured (Goods Held in Trust and/or Commission)')]/following::input"), "Sum Insured Goods Held In Trust And Or Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfGoodsHeldInTrustOrCommission= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Goods held in Trust or Commission')]/following::input"), "Assessed Loss Amount O fGoods Held In Trust Or Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfGoodsHeldInTrustOrCommission= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Goods held in Trust or Commission')]/following::input"), "Claim Amount Of Goods Held In Trust Or Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BB - Rajkumar-2nd Page
		claimOnMoneyInPremisesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Money in Premises?')]/following::select"), "Claim On Money In Premises DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimOnMoneyInTransitDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Money in Transit?')]/following::select"), "Claim On Money In Transit DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimOnRegisteredPostalSendingDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Claim on Registered Postal Sending?')]/following::select"), "Claim On Registered Postal Sending DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalSumInsuredForMoneyInPremisesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional sum insured for Money in Premises')]/following::input"), "Additional Sum Insured For Money In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalSumInsuredForMoneyInTransitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional sum insured for Money in Transit')]/following::input"), "Additional Sum Insured For Money In Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfMoneyInPremisesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Money in Premises')]/following::input"), "Assessed Loss Amount Of Money In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfMoneyInPremisesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Money in Premises')]/following::input"), "Claim Amount Of Money In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfMoneyInTransitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Money in Transit')]/following::input"), "Assessed Loss Amount Of Money In Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfMoneyInTransitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Money in Transit')]/following::input"), "Claim Amount Of Money In Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfRegisteredPostalSendingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Registered Postal Sending')]/following::input"), "Assessed Loss Amount Of Registered Postal Sending TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfRegisteredPostalSendingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Registered Postal Sending')]/following::input"), "Assessed Loss Amount Of Registered Postal Sending TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitsOfLiabilityForRegisteredPostalSendingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limits of Liability for Registered Postal Sending')]/following::input"), "Limits Of Liability For Registered Postal Sending TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SY-Rajkumar-2nd Page		
		nameOfTheStudentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of the Student')]/following::input"), "Name Of The Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageYrTextField= new PageElement(By.xpath("//td//div[contains(text(),'Age (yr)')]/following::input"), "Age Yr TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classOfTheStudentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Class of the Student')]/following::input"), "Class Of The Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		divisionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Division')]/following::input"), "Division TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rollNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Roll Number')]/following::input"), "Roll Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*SH-Rajkumar--2nd Page*/
		sectionOneRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 1 Required')]/following::select"), "Section One Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredForFireContentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured for Fire Content')]/following::input"), "Total Sum Insured for FireContent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sectionTwoRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 2 Required')]/following::select"), "Section Two Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredBurglaryAndHouseBreakingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total sum insured Burglary and House Breaking')]/following::input"), "Total Sum Insured Burglary And House Breaking TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectiononeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section1')]/following::input"), "Assessed Loss Amount Of Section One TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectiononeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section1')]/following::input"), "Claim Amount Of Section One TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectiontwoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section2')]/following::input"), "Assessed Loss Amount Of Section Two TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectiontwoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section2')]/following::input"), "Claim Amount Of Section Two TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectionthreeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section3')]/following::input"), "Assessed Loss Amount Of Section Three TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectionthreeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section3')]/following::input"), "Claim Amount Of Section Three TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectionfourTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section4')]/following::input"), "Assessed Loss Amount Of Section Four TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectionfourTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section4')]/following::input"), "Claim Amount Of Section Four TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectionfiveTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section5')]/following::input"), "Assessed Loss Amount Of Section Five TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectionfiveTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section5')]/following::input"), "Claim Amount Of Section Five TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSectionsixTextField= new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount of Section6')]/following::input"), "Assessed Loss Amount Of Section Six TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSectionsixTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount of Section6')]/following::input"), "Claim Amount Of Section Six TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sectionThreeRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 3 Required')]/following::select"), "Section Three Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionFourRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 4 Required')]/following::select"), "Section Four Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionFiveRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 5 Required')]/following::select"), "Section Five Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionSixRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Section 6 Required')]/following::select"), "Section Six Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionthreeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for section3')]/following::input"), "Sum Insured For Section Three TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPedalCyclesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured (Pedal Cycles)')]/following::input"), "Sum Insured Pedal Cycles TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredForPlateGlassTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum insured for Plate Glass')]/following::input"), "Total Sum Insured For Plate Glass TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSectionsixTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for section6')]/following::input"), "Sum Insured For Section six TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SE-Rajkumar--2nd Page
		areStudentsDeadDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Are Students Dead?')]/following::select"), "Are Students Dead DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfStudentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Number of Students dead')]/following::input"), "Number Of Students Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerDeadStudentTextField = new PageElement(By.xpath("//td//div[contains(text(),'Compensation Limit per dead student')]/following::input"), "Compensation Limit Per Dead Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCompensationForStudentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Compensation for Students dead')]/following::input"), "Total Compensation For Students Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForStudentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for Students dead')]/following::input"), "Assessed Loss Amount For Students Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areStudentsInjuredDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Are Students Injured?')]/following::select"), "Are Students Injured DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfStudentsInjuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Number of Students injured')]/following::input"), "Number Of Students Injured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerInjuredStudentTextField = new PageElement(By.xpath("//td//div[contains(text(),'Compensation Limit per injured student')]/following::input"), "Compensation Limit Per Injured Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCompensationForStudentsInjuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Compensation for Students injured')]/following::input"), "Total Compensation For Students Injured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForStudentsInjuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for Students injured')]/following::input"), "Assessed Loss Amount For Students Injured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areStudentsHospitalisedDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Are Students Hospitalised?')]/following::select"), "Are Students Hospitalised DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfStudentsHospitalisedTextField = new PageElement(By.xpath("//td//div[contains(text(),'Number of Students injured')]/following::input"), "Number Of Students Hospitalised TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerHospitalisedStudentTextField = new PageElement(By.xpath("//td//div[contains(text(),'Compensation Limit per injured student')]/following::input"), "Compensation Limit Per Hospitalised Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCompensationForStudentsHospitalisedTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Compensation for Students hospitalised')]/following::input"), "Total Compensation For Students Hospitalised TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForStudentsHospitalisedTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for Students hospitalised')]/following::input"), "Assessed Loss Amount For Students Hospitalised TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areParentsDeadDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Are Parents Dead?')]/following::select"), "Are Parents Dead DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfParentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Number of Parents dead')]/following::input"), "Number Of Parents Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerDeadParentTextField = new PageElement(By.xpath("//td//div[contains(text(),'Compensation Limit per dead Parent')]/following::input"), "CompensationL imit Per Dead Parent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCompensationForParentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Compensation for Parents dead')]/following::input"), "Total Compensation For Parents Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForParentsDeadTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for Parents dead')]/following::input"), "Assessed Loss Amount For Parents Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossOfSchoolBagContainingBooksCoverDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Loss of School bag containing books Cover')]/following::select"), "Loss Of School Bag Containing Books Cover DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfSchoolBagsLostTextField = new PageElement(By.xpath("//td//div[contains(text(),'No of School bags Lost')]/following::input"), "No Of School Bags Lost TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reimbursementLimitPerStudentForTheLostBagTextField = new PageElement(By.xpath("//td//div[contains(text(),'Reimbursement Limit per student for the lost bag')]/following::input"), "Reimbursement Limit Per Student For The Lost Bag TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalReimbursementForTheLostSchoolBagsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Reimbursement for the lost school bags')]/following::input"), "Total Reimbursement For The Lost School Bags TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForLostSchoolBagsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for lost school bags')]/following::input"), "Assessed Loss Amount For Lost School Bags TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentOfTuitionAndHostelFeesDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Payment of tuition and hostel fees')]/following::select"), "Payment Of Tuition And Hostel Fees DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFeesTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total SI of Parents or Guardian for payment of Tuition and Hostel fees')]/following::input"), "Total SI Of Parents Or Guardian For Payment Of Tuition And Hostel Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountForPaymentOfTuitionAndHostelFeesTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Loss Amount for payment of Tuition and Hostel fees')]/following::input"), "Assessed Loss Amount For Payment Of Tuition And Hostel Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//JI   === Dharmendra
		
		//claimOnStockInPremisesDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Stock In Premises?", "select")), "Claim On Stock In Premises? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stockInPremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock In Premises", "input")), "Stock In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfStockInPremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Stock In Premises", "input")), "Assessed Loss Amount Of Stock In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfStockInPremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Stock In Premises", "input")), "Claim Amount Of Stock In Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnStockAtDisplayWindowInThePremisesDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Stock At Display Window In The Premises?", "select")), "Claim On Stock At Display Window In The Premises? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stockAtDisplayWindowInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock At Display Window In The Premises", "input")), "Stock At Display Window In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfStockAtDisplayWindowInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Stock At Display Window In The Premises", "input")), "Assessed Loss Amount Of Stock At Display Window In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfStockAtDisplayWindowInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Stock At Display Window In The Premises", "input")), "Claim Amount Of Stock At Display Window In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnStockInLockedSafeInThePremisesDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Stock In Locked Safe In The Premises?", "select")), "Claim On Stock In Locked Safe In The Premises? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stockInLockedSafeInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock In Locked Safe In The Premises", "input")), "Stock In Locked Safe In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfStockInLockedSafeInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Stock In Locked Safe In The Premises", "input")), "Assessed Loss Amount Of Stock In Locked Safe In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfStockInLockedSafeInThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Stock In Locked Safe In The Premises", "input")), "Claim Amount Of Stock In Locked Safe In The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnElseWhereWithinThePremisesDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Else Where Within The Premises?", "select")), "Claim On Else Where Within The Premises? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		elseWhereWithinThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Else Where Within The Premises", "input")), "Else Where Within The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfElseWhereWithinThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Else Where Within The Premises", "input")), "Assessed Loss Amount Of Else Where Within The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfElseWhereWithinThePremisesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Else Where Within The Premises", "input")), "Claim Amount Of Else Where Within The Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnCashAndCurrencyNotesDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Cash And Currency Notes?", "select")), "Claim On Cash And Currency Notes? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cashAndCurrencyNotesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cash And Currency Notes", "input")), "Cash And Currency Notes TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfCashAndCurrencyNotesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Cash And Currency Notes", "input")), "Assessed Loss Amount Of Cash And Currency Notes TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfCashAndCurrencyNotesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Cash And Currency Notes", "input")), "Claim Amount Of Cash And Currency Notes TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnPropertyInBankLockersDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Property In Bank Lockers?", "select")), "Claim On Property In Bank Lockers? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		propertyInBankLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Property In Bank Lockers", "input")), "Property In Bank Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfPropertyInBankLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Property In Bank Lockers", "input")), "Assessed Loss Amount Of Property In Bank Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfPropertyInBankLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Property In Bank Lockers", "input")), "Claim Amount Of Property In Bank Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimOnPrivateLockersDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim On Private Lockers?", "select")), "Claim On Private Lockers? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		privateLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Private Lockers", "input")), "Private Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfPrivateLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount Of Private Lockers", "input")), "Assessed Loss Amount Of Private Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfPrivateLockersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount Of Private Lockers", "input")), "Claim Amount Of Private Lockers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//PQ and PY   === Dharmendra
		isTerrorismCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTerrorismTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Terrorism", "input")), "Sum Insured for TerrorismTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Terrorism Cover", "input")), "Assessed Loss Amount of Terrorism CoverTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Terrorism Cover", "input")), "Claim Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//SK   === Dharmendra
		claimDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonForReopenDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason For Reopen", "select")), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtStateNationalDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National", "select")), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtCourtSupremeCourtHighCourtSLPDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP", "select")), "District Court/Supreme Court/High Court/SLP DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount", "input")), "Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Fees", "input")), "Survey Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalOpinionFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Legal Opinion Fees", "input")), "Legal Opinion Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other1FeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other1 Fees", "input")), "Other1 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		other2FeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other2 Fees", "input")), "Other2 Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Claim Amount", "input")), "Total Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSurveyorFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Surveyor Fees", "input")), "Total Surveyor Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		translatorFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Translator Fees", "input")), "Translator Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BI   === Dharmendra
		claimOnStockInTradeDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Stock in Trade?", "select")), "Claim on Stock in Trade? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stockInTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock in Trade", "input")), "Stock in Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfStockInTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Stock in Trade", "input")), "Assessed Loss Amount of Stock in Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfStockInTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Stock in Trade", "input")), "Claim Amount of Stock in Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimOnGoodsHeldInTrustOrCommissionDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Goods held in Trust or Commission?", "select")), "Claim on Goods held in Trust or Commission? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		goodsHeldInTrustCommissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Goods held in Trust/Commission", "input")), "Goods held in Trust/Commission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfGoodsHeldInTrustOrCommissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Goods held in Trust or Commission", "input")), "Assessed Loss Amount of Goods held in Trust or Commission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfGoodsHeldInTrustOrCommissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Goods held in Trust or Commission", "input")), "Claim Amount of Goods held in Trust or Commission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimOnFurnitureOrFixtureOrFittingsDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Furniture or Fixture or Fittings?", "select")), "Claim on Furniture or Fixture or Fittings? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		furnitureFixtureFittingsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Furniture/Fixture/Fittings", "input")), "Furniture/Fixture/Fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfFurnitureOrFixtureOrFittingsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Furniture or Fixture or Fittings", "input")), "Assessed Loss Amount of Furniture or Fixture or Fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfFurnitureOrFixtureOrFittingsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Furniture or Fixture or Fittings", "input")), "Claim Amount of Furniture or Fixture or Fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimOnOfficeEquipmentDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Office equipment?", "select")), "Claim on Office equipment? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		officeEquipmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Office equipment", "input")), "Office equipment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfOfficeEquipmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Office equipment", "input")), "Assessed Loss Amount of Office equipment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfOfficeEquipmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Office equipment", "input")), "Claim Amount of Office equipment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimOnCoinsOrCurrencyOrCuriosEtcDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Coins or Currency or Curios etc?", "select")), "Claim on Coins or Currency or Curios etc? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coinsCurrencyCuriosEtcTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Coins/Currency/Curios etc", "input")), "Coins/Currency/Curios etc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfCoinsOrCurrencyOrCuriosEtcTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Coins or Currency or Curios etc", "input")), "Assessed Loss Amount of Coins or Currency or Curios etc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfCoinsOrCurrencyOrCuriosEtcTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Coins or Currency or Curios etc", "input")), "Claim Amount of Coins or Currency or Curios etc TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimOnOthersSumInsuredDroDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim on Others sum insured?", "select")), "Claim on Others sum insured? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		othersSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Others sum insured", "input")), "Others sum insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		assessedLossAmountOfOthersSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Others sum insured", "input")), "Assessed Loss Amount of Others sum insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimAmountOfOthersSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Others sum insured", "input")), "Claim Amount of Others sum insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of Death/Dismissal /Retirement of employee committing the fraud')]/following::input/following::a[@name='firstFocus']"), "Date of Death/Dismissal /Retirement of employee committing the fraud", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateOfLossDiscoveredButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss discovered')]/following::input/following::a[@name='firstFocus']"), "Date of Loss discovered", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	
	
	    //JI
		
		claimOnStockInPremisesDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Stock in premises?']/following::select[1]"), "Claim On Stock In Premises? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnStockAtDisplayWindowInThePremisesDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Stock at display window in the premises?']/following::select[1]"), "Claim on Stock at display window in the premises? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnStockInLockedSafeInThePremisesDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Stock in locked safe in the premises?']/following::select[1]"), "Claim on Stock in locked safe in the premises? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnElseWhereWithinThePremisesDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Else where within the premises?']/following::select[1]"), "Claim on Else where within the premises? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnCashAndCurrencyNotesDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Cash and Currency notes?']/following::select[1]"), "Claim on Cash and Currency notes? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnPropertyInBankLockersDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Property in Bank lockers?']/following::select[1]"), "Claim on Property in Bank lockers? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimOnPrivateLockersDropDown = new PageElement(By.xpath("//td//div[@id='Claim on Private lockers?']/following::select[1]"), "Claim on Private lockers? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		//Vikas 
		dateofdeathFindButton=new PageElement(By.xpath("//td//div[@id='Date of death']/following::div/a/img"), "Date of death'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedAmountofLossTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Amount of Loss", "input")), "Estimated Amount of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClaimassessedAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim assessed Amount", "input")), "Claim assessed Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SueandLabourChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sue and Labour Charges", "input")), "Sue and Labour Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SalvageChargesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Salvage Charges", "input")), "Salvage Charges TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		CollisionLiabilityTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Collision Liability", "input")), "Collision Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DeductibleAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deductible Amount", "input")), "Deductible Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SalvageAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Salvage Amount", "input")), "Salvage Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		UnderinsurancepercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "Under insurance percent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		OtherRecoveredAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Recovered Amount", "input")), "Other Recovered Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	    NameoftheInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Insured", "input")), "Name of the Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AgeyrForRKTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (yr)", "input")), "Age (yr) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EmployeeNumberoftheInsuredpersonTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Employee Number of the Insured person", "input")), "Employee Number of the Insured person TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		GroupNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Group Name", "input")), "Group Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsclaimrequiredforroadaccidentDroDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is claim required for road accident?", "select")), "Is claim required for road accident? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsclaimrequiredforhospexpensesdueforoadaccidentDroDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is claim required for hosp expenses due to road accident?", "select")), "Is claim required for hosp expenses due to road accident? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsclaimrequiredforhospexpensesduetoaccdntincourseofempextnDroDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is claim required for hosp expenses due to accdnt in course of emp extn?", "select")), "Is claim required for hosp expenses due to accdnt in course of emp extn? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsclaimrequiredforhospexpensesforanyotheraccidentwidercoverDroDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is claim required for hosp expenses for any other accident(wider cover)?", "select")), "Is claim required for hosp expenses for any other accident(wider cover)? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClaimAmountforHospExpensesDuetoRoadAccidentteTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim amount for hosp expenses due to road accident", "input")), "Claim amount for hosp expenses due to road accident TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	
	}

	public void fillClaimRiskProperty2ForMiscNonLiabilityDetails(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(claimRiskProp2MNLEntity.getAction().equalsIgnoreCase("add") || claimRiskProp2MNLEntity.getAction().equalsIgnoreCase("edit")){
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionICoverRequired")) {
					selectValueFromList(isSectionICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionIcoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionI")) {
					clearAndSendKeys(sumInsuredForSectionITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionI"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECICover")) {
					clearAndSendKeys(assessedLossAmountOfSECICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECICover")) {
					clearAndSendKeys(claimAmountOfSECICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIICoverRequired")) {
					selectValueFromList(isSectionIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionIIcoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionII")) {
					clearAndSendKeys(sumInsuredForSectionIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIICover")) {
					clearAndSendKeys(claimAmountOfSECIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIIICoverRequired")) {
					selectValueFromList(isSectionIIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionIIIcoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIII")) {
					clearAndSendKeys(sumInsuredForSectionIIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECIIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIIICover")) {
					clearAndSendKeys(claimAmountOfSECIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIVCoverRequired")) {
					selectValueFromList(isSectionIVCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionIVCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIV")) {
					clearAndSendKeys(sumInsuredForSectionIVTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIV"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIVCover")) {
					clearAndSendKeys(assessedLossAmountOfSECIVCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECIVCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIVCover")) {
					clearAndSendKeys(claimAmountOfSECIVCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIVCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVCoverRequired")) {
					selectValueFromList(isSectionVCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionVCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionV")) {
					clearAndSendKeys(sumInsuredForSectionVTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionV"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVCover")) {
					clearAndSendKeys(assessedLossAmountOfSECVCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVCover")) {
					clearAndSendKeys(claimAmountOfSECVCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVICoverRequired")) {
					selectValueFromList(isSectionVICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionVICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVI")) {
					clearAndSendKeys(sumInsuredForSectionVITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVI"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVICover")) {
					clearAndSendKeys(assessedLossAmountOfSECVICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVICover")) {
					clearAndSendKeys(claimAmountOfSECVICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVIICoverRequired")) {
					selectValueFromList(isSectionVIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionVIICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVII")) {
					clearAndSendKeys(sumInsuredForSectionVIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECVIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVIICover")) {
					clearAndSendKeys(claimAmountOfSECVIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVIIICoverRequired")) {
					selectValueFromList(isSectionVIIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionVIIICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVIII")) {
					clearAndSendKeys(sumInsuredForSectionVIIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVIII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVIIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECVIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVIIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVIIICover")) {
					clearAndSendKeys(claimAmountOfSECVIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVIIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIXCoverRequired")) {
					selectValueFromList(isSectionIXCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionIXCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIX")) {
					clearAndSendKeys(sumInsuredForSectionIXTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIX"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIXCover")) {
					clearAndSendKeys(assessedLossAmountOfSECIXCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECIXCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIXCover")) {
					clearAndSendKeys(claimAmountOfSECIXCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIXCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXCoverRequired")) {
					selectValueFromList(isSectionXCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionXCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionX")) {
					clearAndSendKeys(sumInsuredForSectionXTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionX"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXCover")) {
					clearAndSendKeys(assessedLossAmountOfSECXCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXCover")) {
					clearAndSendKeys(claimAmountOfSECXCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXICoverRequired")) {
					selectValueFromList(isSectionXICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionXICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXI")) {
					clearAndSendKeys(sumInsuredForSectionXITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXI"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXICover")) {
					clearAndSendKeys(assessedLossAmountOfSECXICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXICover")) {
					clearAndSendKeys(claimAmountOfSECXICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXIICoverRequired")) {
					selectValueFromList(isSectionXIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionXIICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXII")) {
					clearAndSendKeys(sumInsuredForSectionXIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECXIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXIICover")) {
					clearAndSendKeys(claimAmountOfSECXIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXIIICoverRequired")) {
					selectValueFromList(isSectionXIIICoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSectionXIIICoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXIII")) {
					clearAndSendKeys(sumInsuredForSectionXIIITextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXIII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXIIICover")) {
					clearAndSendKeys(assessedLossAmountOfSECXIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXIIICover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXIIICover")) {
					clearAndSendKeys(claimAmountOfSECXIIICoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXIIICover"));
				}
				//MI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsMoneyInTransitRequired")) {
					selectValueFromList(isMoneyInTransitRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsMoneyInTransitRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
					clearAndSendKeys(estimatedAnnualTurnoverTextField, claimRiskProp2MNLEntity.getStringValueForField("EstimatedAnnualTurnover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTransit")) {
					clearAndSendKeys(assessedLossAmountOfMoneyInTransitTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTransit")) {
					clearAndSendKeys(claimAmountOfMoneyInTransitTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsMoneyInTillRequired")) {
					selectValueFromList(isMoneyInTillRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsMoneyInTillRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSECII")) {
					clearAndSendKeys(totalSumInsuredForSECIITextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSECII"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTill")) {
					clearAndSendKeys(assessedLossAmountOfMoneyInTillTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTill"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTill")) {
					clearAndSendKeys(claimAmountOfMoneyInTillTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInTill"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSRCCCoverRequired")) {
					selectValueFromList(isSRCCCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSRCCCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSRCCCoverSumInsured")) {
					clearAndSendKeys(sRCCCoverSumInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("SRCCCoverSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSRCCCover")) {
					clearAndSendKeys(assessedLossAmountOfSRCCCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSRCCCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSRCCCover")) {
					clearAndSendKeys(claimAmountOfSRCCCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSRCCCover"));
				}
				//OS
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection1FireBuildingRequired")) {
					selectValueFromList(isSection1FireBuildingRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection1FireBuildingRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC1")) {
					clearAndSendKeys(totalSumInsuredForSEC1TextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC1"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection1")) {
					clearAndSendKeys(assessedLossAmountOfSection1TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection1"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection1")) {
					clearAndSendKeys(claimAmountOfSection1TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection1"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection2AFireContentsRequired")) {
					selectValueFromList(isSection2AFireContentsRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection2AFireContentsRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC2A")) {
					clearAndSendKeys(totalSumInsuredForSEC2ATextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC2A"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2A")) {
					clearAndSendKeys(assessedLossAmountOfSection2ATextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2A"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2A")) {
					clearAndSendKeys(claimAmountOfSection2ATextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2A"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection2BBurglaryContentsRequired")) {
					selectValueFromList(isSection2BBurglaryContentsRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection2BBurglaryContentsRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection2B")) {
					clearAndSendKeys(sumInsuredForSection2BTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection2B"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2B")) {
					clearAndSendKeys(assessedLossAmountOfSection2BTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2B"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2B")) {
					clearAndSendKeys(claimAmountOfSection2BTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2B"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection3TenantsLiabilityRequired")) {
					selectValueFromList(isSection3TenantsLiabilityRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection3TenantsLiabilityRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection3")) {
					clearAndSendKeys(sumInsuredForSection3TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection3"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection3")) {
					clearAndSendKeys(assessedLossAmountOfSection3TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection3"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection3")) {
					clearAndSendKeys(claimAmountOfSection3TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection3"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection4MoneyInsuranceRequired")) {
					selectValueFromList(isSection4MoneyInsuranceRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection4MoneyInsuranceRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection4")) {
					clearAndSendKeys(sumInsuredForSection4TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection4"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection4")) {
					clearAndSendKeys(assessedLossAmountOfSection4TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection4"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection4")) {
					clearAndSendKeys(claimAmountOfSection4TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection4"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection5FixedGlassAndSanitaryFittingsRequired")) {
					selectValueFromList(isSection5FixedGlassAndSanitaryFittingsRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection5FixedGlassAndSanitaryFittingsRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC5")) {
					clearAndSendKeys(totalSumInsuredForSEC5TextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC5"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection5")) {
					clearAndSendKeys(assessedLossAmountOfSection5TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection5"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection5")) {
					clearAndSendKeys(claimAmountOfSection5TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection5"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection6FidelityGuaranteeRequired")) {
					selectValueFromList(isSection6FidelityGuaranteeRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection6FidelityGuaranteeRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalGuaranteedAmount")) {
					clearAndSendKeys(totalGuaranteedAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalGuaranteedAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection6")) {
					clearAndSendKeys(assessedLossAmountOfSection6TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection6"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection6")) {
					clearAndSendKeys(claimAmountOfSection6TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection6"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection7DamageToElectronicEquipmentRequired")) {
					selectValueFromList(isSection7DamageToElectronicEquipmentRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection7DamageToElectronicEquipmentRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					clearAndSendKeys(totalSumInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection7")) {
					clearAndSendKeys(assessedLossAmountOfSection7TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection7"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection7")) {
					clearAndSendKeys(claimAmountOfSection7TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection7"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection8ACostOfReinstatementOfDataRequired")) {
					selectValueFromList(isSection8ACostOfReinstatementOfDataRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsSection8ACostOfReinstatementOfDataRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection8A")) {
					clearAndSendKeys(sumInsuredForSection8ATextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection8A"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8A")) {
					clearAndSendKeys(assessedLossAmountOfSection8ATextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection8A"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8A")) {
					clearAndSendKeys(claimAmountOfSection8ATextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection8A"));
				}
				//PB
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDetailsOfTravel")) {
					selectValueFromList(detailsOfTravelDropDown, claimRiskProp2MNLEntity.getStringValueForField("DetailsOfTravel"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFlightNumber")) {
					clearAndSendKeys(flightNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("FlightNumber"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTicketNumber")) {
					clearAndSendKeys(ticketNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("TicketNumber"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPlaceOfTravelFrom")) {
					clearAndSendKeys(placeOfTravelFromTextField, claimRiskProp2MNLEntity.getStringValueForField("PlaceOfTravelFrom"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPlaceOfTravelTo")) {
					clearAndSendKeys(placeOfTravelToTextField, claimRiskProp2MNLEntity.getStringValueForField("PlaceOfTravelTo"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfJourney")) {
					click(dateOfDateOfJourneyButton);
					selectDateFromCalender(dateOfJourneyTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfJourney"));
					switchToFrame("display");
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPassportNumber")) {
					
					clearAndSendKeys(passportNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("PassportNumber"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigVisaNumber")) {
					clearAndSendKeys(visaNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("VisaNumber"));
				}
				//HH
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection1Required")) {
					selectValueFromList(section1RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section1Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1")) {
					clearAndSendKeys(sumInsuredForSection1TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection1"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC1")) {
					clearAndSendKeys(excessForSEC1TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC1"));
				}	
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection2Required")) {
					selectValueFromList(section2RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section2Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2")) {
					clearAndSendKeys(assessedLossAmountOfSection2TextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC2")) {
					clearAndSendKeys(excessForSEC2TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC2"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2")) {
					clearAndSendKeys(claimAmountOfSection2TextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection3Required")) {
					selectValueFromList(section3RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section3Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForsection3")) {
					clearAndSendKeys(sumInsuredForsection3TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForsection3"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC3")) {
					clearAndSendKeys(excessForSEC3TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC3"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection4Required")) {
					selectValueFromList(section4RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section4Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC4")) {
					clearAndSendKeys(excessForSEC4TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC4"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection5")) {
					clearAndSendKeys(sumInsuredForSection5TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection5"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC5")) {
					clearAndSendKeys(excessForSEC5TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC5"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection6Required")) {
					selectValueFromList(section6RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section6Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection6")) {
					clearAndSendKeys(sumInsuredForSection6TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection6"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC6")) {
					clearAndSendKeys(excessForSEC6TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC6"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection7Required")) {
					selectValueFromList(section7RequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("Section7Required"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection7")) {
					clearAndSendKeys(sumInsuredForSection7TextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection7"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC7")) {
					clearAndSendKeys(excessForSEC7TextField, claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC7"));
				}
				//EV
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					clearAndSendKeys(sumInsuredForTerrorismTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					clearAndSendKeys(claimAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"));
				}
				//FI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfDeathDismissalRetirementOfEmployeeCommittingTheFraud")) {
					click(dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudButton);
					selectDateFromCalender(dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfDeathDismissalRetirementOfEmployeeCommittingTheFraud"));
					switchToFrame("display");		
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfLossDiscovered")) {
					click(dateOfLossDiscoveredButton);
					selectDateFromCalender(dateOfLossDiscoveredTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfLossDiscovered"));
					switchToFrame("display");
				}
				//NI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsPhysicalLossOrDamageToNeonSignRequired")) {
					selectValueFromList(isPhysicalLossOrDamageToNeonSignRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsPhysicalLossOrDamageToNeonSignRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForPhysicalLossOrDamage")) {
					clearAndSendKeys(sumInsuredForPhysicalLossOrDamageTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForPhysicalLossOrDamage"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPhysicalLossOrDamage")) {
					clearAndSendKeys(assessedLossAmountOfPhysicalLossOrDamageTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPhysicalLossOrDamage"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPhysicalLossOrDamage")) {
					clearAndSendKeys(claimAmountOfPhysicalLossOrDamageTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPhysicalLossOrDamage"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsThirdPartyLegalLiabilityRequired")) {
					selectValueFromList(isThirdPartyLegalLiabilityRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsThirdPartyLegalLiabilityRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLegalLiability")) {
					clearAndSendKeys(sumInsuredForThirdPartyLegalLiabilityTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForThirdPartyLegalLiability"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfThirdPartyLegalLiability")) {
					clearAndSendKeys(assessedLossAmountOfThirdPartyLegalLiabilityTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfThirdPartyLegalLiability"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfThirdPartyLegalLiability")) {
					clearAndSendKeys(claimAmountOfThirdPartyLegalLiabilityTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfThirdPartyLegalLiability"));
				}
				//BA
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropDown, claimRiskProp2MNLEntity.getStringValueForField("Claim"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropDown, claimRiskProp2MNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					clearAndSendKeys(totalAssessedLossAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalAssessedLossAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					selectValueFromList(isUnderlnsuranceApplicableDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcess")) {
					clearAndSendKeys(excessTextField, claimRiskProp2MNLEntity.getStringValueForField("Excess"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					clearAndSendKeys(netClaimAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("NetClaimAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					selectValueFromList(districtStateNationalDropDown, claimRiskProp2MNLEntity.getStringValueForField("DistrictStateNational"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					selectValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown, claimRiskProp2MNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					selectValueFromList(underInsuranceTypeDropDown, claimRiskProp2MNLEntity.getStringValueForField("UnderInsuranceType"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					clearAndSendKeys(underInsuranceAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("UnderInsuranceAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					clearAndSendKeys(claimLossAfterUnderInsuranceTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"));
				}
				//HH
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
					clearAndSendKeys(previousPolicyNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("PreviousPolicyNumber"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
					selectValueFromList(natureOfTreatmentDropDown, claimRiskProp2MNLEntity.getStringValueForField("NatureOfTreatment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfAdmissionInHospital")) {
					clearAndSendKeys(dateOfAdmissionInHospitalTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfAdmissionInHospital"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfDischargeFromTheHospital")) {
					clearAndSendKeys(dateOfDischargeFromTheHospitalTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfDischargeFromTheHospital"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameAndPlaceOfTheHospital")) {
					clearAndSendKeys(nameAndPlaceOfTheHospitalTextField, claimRiskProp2MNLEntity.getStringValueForField("NameAndPlaceOfTheHospital"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentHospitalization")) {
					clearAndSendKeys(dateOfCompletionOfTreatmentHospitalizationTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentHospitalization"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesHospitalization")) {
					clearAndSendKeys(totalMedicalExpensesHospitalizationTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalMedicalExpensesHospitalization"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerLeaveCertificateFromTheEmployerFrom")) {
					clearAndSendKeys(periodOfLeaveAsPerLeaveCertificateFromTheEmployerFromTextField, claimRiskProp2MNLEntity.getStringValueForField("PeriodOfLeaveAsPerLeaveCertificateFromTheEmployerFrom"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerLeaveCertificateFromTheEmployerTo")) {
					clearAndSendKeys(periodOfLeaveAsPerLeaveCertificateFromTheEmployerToTextField, claimRiskProp2MNLEntity.getStringValueForField("PeriodOfLeaveAsPerLeaveCertificateFromTheEmployerTo"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFitnessCertificateFromDoctorFromDate")) {
					clearAndSendKeys(fitnessCertificateFromDoctorFromDateTextField, claimRiskProp2MNLEntity.getStringValueForField("FitnessCertificateFromDoctorFromDate"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFitnessCertificateFromDoctorToDate")) {
					clearAndSendKeys(fitnessCertificateFromDoctorToDateTextField, claimRiskProp2MNLEntity.getStringValueForField("FitnessCertificateFromDoctorToDate"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
					clearAndSendKeys(medicalExtensionRequiredTextField, claimRiskProp2MNLEntity.getStringValueForField("MedicalExtensionRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsCompensationForEducationFundRequired")) {
					selectValueFromList(isCompensationForEducationFundRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsCompensationForEducationFundRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsWeeklyCompensationRequired")) {
					selectValueFromList(isWeeklyCompensationRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsWeeklyCompensationRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfDeath")) {
				//	clearAndSendKeys(dateOfDeathTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfDeath"));
			        // String  policyStartDate=RandomCodeGenerator.dateGenerator(claimRiskProp2MNLEntity.getStringValueForField("DateOfDeath"));
			         //   clearAndEnterDate(dateOfDeathTextField, policyStartDate);
					click(dateofdeathFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(dateOfDeathTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfDeath"));
					switchToFrame("display");
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence")) {
					clearAndSendKeys(expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField, claimRiskProp2MNLEntity.getStringValueForField("ExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCommencementOfTreatment")) {
					clearAndSendKeys(dateOfCommencementOfTreatmentTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfCommencementOfTreatment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentOPD")) {
					clearAndSendKeys(dateOfCompletionOfTreatmentOPDTextField, claimRiskProp2MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentOPD"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesOPD")) {
					clearAndSendKeys(totalMedicalExpensesOPDTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalMedicalExpensesOPD"));
				}

				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					clearAndSendKeys(sumInsuredForTerrorismTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					clearAndSendKeys(claimAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"));
				}
				//BN-Rajkumar--2ND Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnAppraisers")) {
					selectValueFromList(claimOnAppraisersDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnAppraisers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForAppraisers")) {
					clearAndSendKeys(limitsOfLiabilityForAppraisersTextField, claimRiskProp2MNLEntity.getStringValueForField("LimitsOfLiabilityForAppraisers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAppraisers")) {
					clearAndSendKeys(assessedLossAmountOfAppraisersTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfAppraisers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAppraisers")) {
					clearAndSendKeys(claimAmountOfAppraisersTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfAppraisers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCollionAgetJataChotBacatYojnPigieColtors")) {
					selectValueFromList(claimOnCollectionAgentJantaChotiBachatYojanaPigmieCollectorsDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCollionAgetJataChotBacatYojnPigieColtors"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimiOfLiabyForCollionAgentJanaChtiBachtYojnaPigmeColctrs")) {
					clearAndSendKeys(limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField, claimRiskProp2MNLEntity.getStringValueForField("LimitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectors"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAsedLosAmotOfColleionAgntJataChtiBchatYoanaPigieColors")) {
					clearAndSendKeys(assessedLossAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField, claimRiskProp2MNLEntity.getStringValueForField("AsedLosAmotOfColleionAgntJataChtiBchatYoanaPigieColors"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmoutOfColeionAgntJanaChoiBachtYojaaPigieColors")) {
					clearAndSendKeys(claimAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmoutOfColeionAgntJanaChoiBachtYojaaPigieColors"));
				}
				//BD-Rajkumar--2ND Pages

				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInTrade")) {
					selectValueFromList(claimOnStockInTradeDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredStockInTrade")) {
					clearAndSendKeys(sumInsuredStockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInTrade")) {
					clearAndSendKeys(assessedLossAmountOfStockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInTrade")) {
					clearAndSendKeys(claimAmountOfStockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnGoodsHeldInTrustOrCommission")) {
					selectValueFromList(claimOnGoodsHeldInTrustOrCommissionDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnGoodsHeldInTrustOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredGoodsHeldInTrustAndOrCommission")) {
					clearAndSendKeys(sumInsuredGoodsHeldInTrustAndOrCommission, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredGoodsHeldInTrustAndOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfGoodsHeldInTrustOrCommission")) {
					clearAndSendKeys(assessedLossAmountOfGoodsHeldInTrustOrCommission, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfGoodsHeldInTrustOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfGoodsHeldInTrustOrCommission")) {
					clearAndSendKeys(claimAmountOfGoodsHeldInTrustOrCommission, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfGoodsHeldInTrustOrCommission"));
				}
				//BB - Rajkumar-2nd Page

				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnMoneyInPremises")) {
					selectValueFromList(claimOnMoneyInPremisesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnMoneyInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInPremises")) {
					clearAndSendKeys(additionalSumInsuredForMoneyInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInPremises")) {
					clearAndSendKeys(assessedLossAmountOfMoneyInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInPremises")) {
					clearAndSendKeys(claimAmountOfMoneyInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnMoneyInTransit")) {
					selectValueFromList(claimOnMoneyInTransitDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInTransit")) {
					clearAndSendKeys(additionalSumInsuredForMoneyInTransitTextField, claimRiskProp2MNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTransit")) {
					clearAndSendKeys(assessedLossAmountOfMoneyInTransitTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTransit")) {
					clearAndSendKeys(claimAmountOfMoneyInTransitTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInTransit"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnRegisteredPostalSending")) {
					selectValueFromList (claimOnRegisteredPostalSendingDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnRegisteredPostalSending"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForRegisteredPostalSending")) {
					clearAndSendKeys(limitsOfLiabilityForRegisteredPostalSendingTextField, claimRiskProp2MNLEntity.getStringValueForField("LimitsOfLiabilityForRegisteredPostalSending"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfRegisteredPostalSending")) {
					clearAndSendKeys(assessedLossAmountOfRegisteredPostalSendingTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfRegisteredPostalSending"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfRegisteredPostalSending")) {
					clearAndSendKeys(claimAmountOfRegisteredPostalSendingTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfRegisteredPostalSending"));
				}
				//SY-Rajkumar-2nd Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameOfTheStudent")) {
					clearAndSendKeys(nameOfTheStudentTextField, claimRiskProp2MNLEntity.getStringValueForField("NameOfTheStudent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAgeYr")) {
					clearAndSendKeys(ageYrTextField, claimRiskProp2MNLEntity.getStringValueForField("AgeYr"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClassOfTheStudent")) {
					clearAndSendKeys(classOfTheStudentTextField, claimRiskProp2MNLEntity.getStringValueForField("ClassOfTheStudent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDivision")) {
					clearAndSendKeys(divisionTextField, claimRiskProp2MNLEntity.getStringValueForField("Division"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigRollNumber")) {
					clearAndSendKeys(rollNumberTextField, claimRiskProp2MNLEntity.getStringValueForField("RollNumber"));
				}
				/*SH-Rajkumar--2nd Page*/
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionone")) {
					clearAndSendKeys(assessedLossAmountOfSectiononeTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionone"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionone")) {
					clearAndSendKeys(claimAmountOfSectiononeTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionone"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectiontwo")) {
					clearAndSendKeys(assessedLossAmountOfSectiontwoTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectiontwo"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectiontwo")) {
					clearAndSendKeys(claimAmountOfSectiontwoTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectiontwo"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionthree")) {
					clearAndSendKeys(assessedLossAmountOfSectionthreeTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionthree"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionthree")) {
					clearAndSendKeys(claimAmountOfSectionthreeTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionthree"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionfour")) {
					clearAndSendKeys(assessedLossAmountOfSectionfourTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionfour"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionfour")) {
					clearAndSendKeys(claimAmountOfSectionfourTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionfour"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionfive")) {
					clearAndSendKeys(assessedLossAmountOfSectionfiveTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionfive"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionfive")) {
					clearAndSendKeys(claimAmountOfSectionfiveTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionfive"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionsix")) {
					clearAndSendKeys(assessedLossAmountOfSectionsixTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionsix"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionsix")) {
					clearAndSendKeys(claimAmountOfSectionsixTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionsix"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionOneRequired")) {
					selectValueFromList(sectionOneRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionOneRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionTwoRequired")) {
					selectValueFromList(sectionTwoRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionTwoRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionThreeRequired")) {
					selectValueFromList(sectionThreeRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionThreeRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionFourRequired")) {
					selectValueFromList(sectionFourRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionFourRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionFiveRequired")) {
					selectValueFromList(sectionFiveRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionFiveRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionSixRequired")) {
					selectValueFromList(sectionSixRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("SectionSixRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForFireContent")) {
					clearAndSendKeys(totalSumInsuredForFireContentTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForFireContent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredBurglaryAndHouseBreaking")) {
					clearAndSendKeys(totalSumInsuredBurglaryAndHouseBreakingTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredBurglaryAndHouseBreaking"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionthree")) {
					clearAndSendKeys(sumInsuredForSectionthreeTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionthree"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredPedalCycles")) {
					clearAndSendKeys(sumInsuredPedalCyclesTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredPedalCycles"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForPlateGlass")) {
					clearAndSendKeys(totalSumInsuredForPlateGlassTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForPlateGlass"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionsix")) {
					clearAndSendKeys(sumInsuredForSectionsixTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionsix"));
				}//SE-Rajkumar--2nd Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsDead")) {
					selectValueFromList(areStudentsDeadDropDown, claimRiskProp2MNLEntity.getStringValueForField("AreStudentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsDead")) {
					clearAndSendKeys(numberOfStudentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerDeadStudent")) {
					clearAndSendKeys(compensationLimitPerDeadStudentTextField, claimRiskProp2MNLEntity.getStringValueForField("compensationLimitPerDeadStudent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsDead")) {
					clearAndSendKeys(totalCompensationForStudentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsDead")) {
					clearAndSendKeys(assessedLossAmountForStudentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsInjured")) {
					selectValueFromList(areStudentsInjuredDropDown, claimRiskProp2MNLEntity.getStringValueForField("AreStudentsInjured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsInjured")) {
					clearAndSendKeys(numberOfStudentsInjuredTextField, claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsInjured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerInjuredStudent")) {
					clearAndSendKeys(compensationLimitPerInjuredStudentTextField, claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerInjuredStudent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsInjured")) {
					clearAndSendKeys(totalCompensationForStudentsInjuredTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsInjured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsInjured")) {
					clearAndSendKeys(assessedLossAmountForStudentsInjuredTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsInjured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsHospitalised")) {
					selectValueFromList(areStudentsHospitalisedDropDown, claimRiskProp2MNLEntity.getStringValueForField("AreStudentsHospitalised"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsHospitalised")) {
					clearAndSendKeys(numberOfStudentsHospitalisedTextField, claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsHospitalised"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerHospitalisedStudent")) {
					clearAndSendKeys(compensationLimitPerHospitalisedStudentTextField, claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerHospitalisedStudent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsHospitalised")) {
					clearAndSendKeys(totalCompensationForStudentsHospitalisedTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsHospitalised"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsHospitalised")) {
					clearAndSendKeys(assessedLossAmountForStudentsHospitalisedTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsHospitalised"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreParentsDead")) {
					selectValueFromList(areParentsDeadDropDown, claimRiskProp2MNLEntity.getStringValueForField("AreParentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfParentsDead")) {
					clearAndSendKeys(numberOfParentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("NumberOfParentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerDeadParent")) {
					clearAndSendKeys(compensationLimitPerDeadParentTextField, claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerDeadParent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForParentsDead")) {
					clearAndSendKeys(totalCompensationForParentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForParentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForParentsDead")) {
					clearAndSendKeys(assessedLossAmountForParentsDeadTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForParentsDead"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLossOfSchoolBagContainingBooksCover")) {
					selectValueFromList(lossOfSchoolBagContainingBooksCoverDropDown, claimRiskProp2MNLEntity.getStringValueForField("LossOfSchoolBagContainingBooksCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNoOfSchoolBagsLost")) {
					clearAndSendKeys(noOfSchoolBagsLostTextField, claimRiskProp2MNLEntity.getStringValueForField("NoOfSchoolBagsLost"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReimbursementLimitPerStudentForTheLostBag")) {
					clearAndSendKeys(reimbursementLimitPerStudentForTheLostBagTextField, claimRiskProp2MNLEntity.getStringValueForField("ReimbursementLimitPerStudentForTheLostBag"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalReimbursementForTheLostSchoolBags")) {
					clearAndSendKeys(totalReimbursementForTheLostSchoolBagsTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalReimbursementForTheLostSchoolBags"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForLostSchoolBags")) {
					clearAndSendKeys(assessedLossAmountForLostSchoolBagsTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForLostSchoolBags"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPaymentOfTuitionAndHostelFees")) {
					selectValueFromList(paymentOfTuitionAndHostelFeesDropDown, claimRiskProp2MNLEntity.getStringValueForField("PaymentOfTuitionAndHostelFees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFees")) {
					clearAndSendKeys(totalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForPaymentOfTuitionAndHostelFees")) {
					clearAndSendKeys(assessedLossAmountForPaymentOfTuitionAndHostelFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForPaymentOfTuitionAndHostelFees"));
				}

				//JI   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInPremises")) {
					selectValueFromList(claimOnStockInPremisesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInPremises")) {
					clearAndSendKeys(stockInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("StockInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInPremises")) {
					clearAndSendKeys(assessedLossAmountOfStockInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInPremises")) {
					clearAndSendKeys(claimAmountOfStockInPremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInPremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockAtDisplayWindowInThePremises")) {
					selectValueFromList(claimOnStockAtDisplayWindowInThePremisesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockAtDisplayWindowInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockAtDisplayWindowInThePremises")) {
					clearAndSendKeys(stockAtDisplayWindowInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("StockAtDisplayWindowInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockAtDisplayWindowInThePremises")) {
					clearAndSendKeys(assessedLossAmountOfStockAtDisplayWindowInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockAtDisplayWindowInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockAtDisplayWindowInThePremises")) {
					clearAndSendKeys(claimAmountOfStockAtDisplayWindowInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockAtDisplayWindowInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsClaimOnStockInLockedSafeInThePremises")) {
					selectValueFromList(claimOnStockInLockedSafeInThePremisesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInLockedSafeInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInLockedSafeInThePremises")) {
					clearAndSendKeys(stockInLockedSafeInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("StockInLockedSafeInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInLockedSafeInThePremises")) {
					clearAndSendKeys(claimAmountOfStockInLockedSafeInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInLockedSafeInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInLockedSafeInThePremises")) {
					clearAndSendKeys(assessedLossAmountOfStockInLockedSafeInThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInLockedSafeInThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnElseWhereWithinThePremises")) {
					selectValueFromList(claimOnElseWhereWithinThePremisesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnElseWhereWithinThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigElseWhereWithinThePremises")) {
					clearAndSendKeys(elseWhereWithinThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ElseWhereWithinThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfElseWhereWithinThePremises")) {
					clearAndSendKeys(assessedLossAmountOfElseWhereWithinThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfElseWhereWithinThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfElseWhereWithinThePremises")) {
					clearAndSendKeys(claimAmountOfElseWhereWithinThePremisesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfElseWhereWithinThePremises"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCashAndCurrencyNotes")) {
					selectValueFromList(claimOnCashAndCurrencyNotesDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCashAndCurrencyNotes"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCashAndCurrencyNotes")) {
					clearAndSendKeys(cashAndCurrencyNotesTextField, claimRiskProp2MNLEntity.getStringValueForField("CashAndCurrencyNotes"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfCashAndCurrencyNotes")) {
					clearAndSendKeys(assessedLossAmountOfCashAndCurrencyNotesTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfCashAndCurrencyNotes"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfCashAndCurrencyNotes")) {
					clearAndSendKeys(claimAmountOfCashAndCurrencyNotesTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfCashAndCurrencyNotes"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnPropertyInBankLockers")) {
					selectValueFromList(claimOnPropertyInBankLockersDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnPropertyInBankLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPropertyInBankLockers")) {
					clearAndSendKeys(assessedLossAmountOfPropertyInBankLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPropertyInBankLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPropertyInBankLockers")) {
					clearAndSendKeys(propertyInBankLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("PropertyInBankLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPropertyInBankLockers")) {
					clearAndSendKeys(claimAmountOfPropertyInBankLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPropertyInBankLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnPrivateLockers")) {
					selectValueFromList(claimOnPrivateLockersDropDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnPrivateLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPrivateLockers")) {
					clearAndSendKeys(privateLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("PrivateLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPrivateLockers")) {
					clearAndSendKeys(assessedLossAmountOfPrivateLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPrivateLockers"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPrivateLockers")) {
					clearAndSendKeys(claimAmountOfPrivateLockersTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPrivateLockers"));
				}
				//PQ and PY    === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					clearAndSendKeys(sumInsuredForTerrorismTextField, claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					clearAndSendKeys(claimAmountOfTerrorismCoverTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"));
				}
				//SK   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropDown, claimRiskProp2MNLEntity.getStringValueForField("Claim"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropDown, claimRiskProp2MNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					selectValueFromList(districtStateNationalDropDown, claimRiskProp2MNLEntity.getStringValueForField("DistrictStateNational"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					selectValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown, claimRiskProp2MNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcess")) {
					clearAndSendKeys(excessTextField, claimRiskProp2MNLEntity.getStringValueForField("Excess"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmount")) {
					clearAndSendKeys(claimAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSurveyFees")) {
					clearAndSendKeys(surveyFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("SurveyFees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					clearAndSendKeys(legalOpinionFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("LegalOpinionFees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOther1Fees")) {
					clearAndSendKeys(other1FeesTextField, claimRiskProp2MNLEntity.getStringValueForField("Other1Fees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOther2Fees")) {
					clearAndSendKeys(other2FeesTextField, claimRiskProp2MNLEntity.getStringValueForField("Other2Fees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalClaimAmount")) {
					clearAndSendKeys(totalClaimAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalClaimAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSurveyorFees")) {
					clearAndSendKeys(totalSurveyorFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("TotalSurveyorFees"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					clearAndSendKeys(translatorFeesTextField, claimRiskProp2MNLEntity.getStringValueForField("TranslatorFees"));
				}
				//BI   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInTrade")) {
					selectValueFromList(claimOnStockInTradeDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInTrade")) {
					clearAndSendKeys(stockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("StockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInTrade")) {
					clearAndSendKeys(assessedLossAmountOfStockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInTrade")) {
					clearAndSendKeys(claimAmountOfStockInTradeTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInTrade"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnGoodsHeldInTrustOrCommission")) {
					selectValueFromList(claimOnGoodsHeldInTrustOrCommissionDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnGoodsHeldInTrustOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustCommission")) {
					clearAndSendKeys(goodsHeldInTrustCommissionTextField, claimRiskProp2MNLEntity.getStringValueForField("GoodsHeldInTrustCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfGoodsHeldInTrustOrCommission")) {
					clearAndSendKeys(assessedLossAmountOfGoodsHeldInTrustOrCommissionTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfGoodsHeldInTrustOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfGoodsHeldInTrustOrCommission")) {
					clearAndSendKeys(claimAmountOfGoodsHeldInTrustOrCommissionTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfGoodsHeldInTrustOrCommission"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnFurnitureOrFixtureOrFittings")) {
					selectValueFromList(claimOnFurnitureOrFixtureOrFittingsDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnFurnitureOrFixtureOrFittings"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFurnitureFixtureFittings")) {
					clearAndSendKeys(furnitureFixtureFittingsTextField, claimRiskProp2MNLEntity.getStringValueForField("FurnitureFixtureFittings"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfFurnitureOrFixtureOrFittings")) {
					clearAndSendKeys(assessedLossAmountOfFurnitureOrFixtureOrFittingsTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfFurnitureOrFixtureOrFittings"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfFurnitureOrFixtureOrFittings")) {
					clearAndSendKeys(claimAmountOfFurnitureOrFixtureOrFittingsTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfFurnitureOrFixtureOrFittings"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnOfficeEquipment")) {
					selectValueFromList(claimOnOfficeEquipmentDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnOfficeEquipment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOfficeEquipment")) {
					clearAndSendKeys(officeEquipmentTextField, claimRiskProp2MNLEntity.getStringValueForField("OfficeEquipment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOfficeEquipment")) {
					clearAndSendKeys(assessedLossAmountOfOfficeEquipmentTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfOfficeEquipment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOfficeEquipment")) {
					clearAndSendKeys(claimAmountOfOfficeEquipmentTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfOfficeEquipment"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCoinsOrCurrencyOrCuriosEtc")) {
					selectValueFromList(claimOnCoinsOrCurrencyOrCuriosEtcDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCoinsOrCurrencyOrCuriosEtc"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCoinsCurrencyCuriosEtc")) {
					clearAndSendKeys(coinsCurrencyCuriosEtcTextField, claimRiskProp2MNLEntity.getStringValueForField("CoinsCurrencyCuriosEtc"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfCoinsOrCurrencyOrCuriosEtc")) {
					clearAndSendKeys(assessedLossAmountOfCoinsOrCurrencyOrCuriosEtcTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfCoinsOrCurrencyOrCuriosEtc"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfCoinsOrCurrencyOrCuriosEtc")) {
					clearAndSendKeys(claimAmountOfCoinsOrCurrencyOrCuriosEtcTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfCoinsOrCurrencyOrCuriosEtc"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnOthersSumInsured")) {
					selectValueFromList(claimOnOthersSumInsuredDroDown, claimRiskProp2MNLEntity.getStringValueForField("ClaimOnOthersSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOthersSumInsured")) {
					clearAndSendKeys(othersSumInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("OthersSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOthersSumInsured")) {
					clearAndSendKeys(assessedLossAmountOfOthersSumInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfOthersSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOthersSumInsured")) {
					clearAndSendKeys(claimAmountOfOthersSumInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfOthersSumInsured"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigEstimatedAmountofLoss")) {
					clearAndSendKeys(estimatedAmountofLossTextField, claimRiskProp2MNLEntity.getStringValueForField("EstimatedAmountofLoss"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimassessedAmount")) {
					clearAndSendKeys(ClaimassessedAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimassessedAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSueandLabourCharges")) {
					clearAndSendKeys(SueandLabourChargesTextField, claimRiskProp2MNLEntity.getStringValueForField("SueandLabourCharges"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSalvageCharges")) {
					clearAndSendKeys(SalvageChargesTextField, claimRiskProp2MNLEntity.getStringValueForField("SalvageCharges"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCollisionLiability")) {
					clearAndSendKeys(CollisionLiabilityTextField, claimRiskProp2MNLEntity.getStringValueForField("CollisionLiability"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
					clearAndSendKeys(DeductibleAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("DeductibleAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSalvageAmount")) {
					clearAndSendKeys(SalvageAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("SalvageAmount"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderinsurancepercent")) {
					clearAndSendKeys(UnderinsurancepercentTextField, claimRiskProp2MNLEntity.getStringValueForField("Underinsurancepercent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
					clearAndSendKeys(OtherRecoveredAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("OtherRecoveredAmount"));
				}
				if(claimRiskProp2MNLEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameoftheInsured")) {
						clearAndSendKeys(NameoftheInsuredTextField, claimRiskProp2MNLEntity.getStringValueForField("NameoftheInsured"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAgeyrForRK")) {
						clearAndSendKeys(AgeyrForRKTextField, claimRiskProp2MNLEntity.getStringValueForField("AgeyrForRK"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforroadaccident")) {
						selectValueFromList(IsclaimrequiredforroadaccidentDroDown, claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforroadaccident"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesdueforoadaccident")) {
						selectValueFromList(IsclaimrequiredforhospexpensesdueforoadaccidentDroDown, claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesdueforoadaccident"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountforHospExpensesDuetoRoadAccidentte")) {
						clearAndSendKeys(ClaimAmountforHospExpensesDuetoRoadAccidentteTextField, claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountforHospExpensesDuetoRoadAccidentte"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesduetoaccdntincourseofempext")) {
						selectValueFromList(IsclaimrequiredforhospexpensesduetoaccdntincourseofempextnDroDown, claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesduetoaccdntincourseofempext"));
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesforanyotheraccidentwidercover")) {
						selectValueFromList(IsclaimrequiredforhospexpensesforanyotheraccidentwidercoverDroDown, claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesforanyotheraccidentwidercover"));
					}		
				}
				
				/*
				//CS
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSueandLabourCharges")) {
					clearAndSendKeys(OtherRecoveredAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("SueandLabourCharges"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCollisionLiability")) {
					clearAndSendKeys(OtherRecoveredAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("CollisionLiability"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderinsurancepercent")) {
					clearAndSendKeys(OtherRecoveredAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("Underinsurancepercent"));
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
					clearAndSendKeys(OtherRecoveredAmountTextField, claimRiskProp2MNLEntity.getStringValueForField("OtherRecoveredAmount"));
				}		
				*/
				
			}
			else if(claimRiskProp2MNLEntity.getAction().equalsIgnoreCase("verify")){

				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionICoverRequired"),fetchValueFromList(isSectionICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionI")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionI"),fetchValueFromTextFields(sumInsuredForSectionITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECICover"),fetchValueFromTextFields(assessedLossAmountOfSECICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECICover"),fetchValueFromTextFields(claimAmountOfSECICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionIICoverRequired"),fetchValueFromList(isSectionIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionII"),fetchValueFromTextFields(sumInsuredForSectionIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmtOfSECIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmtOfSECIICover"),fetchValueFromTextFields(assessedLossAmountOfSECIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIICover"),fetchValueFromTextFields(claimAmountOfSECIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionIIICoverRequired"),fetchValueFromList(isSectionIIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIII"),fetchValueFromTextFields(sumInsuredForSectionIIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmtOfSECIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmtOfSECIIICover"),fetchValueFromTextFields(assessedLossAmountOfSECIIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIIICover"),fetchValueFromTextFields(claimAmountOfSECIIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIVCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionIVCoverRequired"),fetchValueFromList(isSectionIVCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIV")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIV"),fetchValueFromTextFields(sumInsuredForSectionIVTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmtOfSECIVCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmtOfSECIVCover"),fetchValueFromTextFields(assessedLossAmountOfSECIVCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIVCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIVCover"),fetchValueFromTextFields(claimAmountOfSECIVCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionVCoverRequired"),fetchValueFromList(isSectionVCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionV")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionV"),fetchValueFromTextFields(sumInsuredForSectionVTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVCover"),fetchValueFromTextFields(assessedLossAmountOfSECVCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVCover"),fetchValueFromTextFields(claimAmountOfSECVCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionVICoverRequired"),fetchValueFromList(isSectionVICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVI")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVI"),fetchValueFromTextFields(sumInsuredForSectionVITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVICover"),fetchValueFromTextFields(assessedLossAmountOfSECVICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVICover"),fetchValueFromTextFields(claimAmountOfSECVICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionVIICoverRequired"),fetchValueFromList(isSectionVIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVII"),fetchValueFromTextFields(sumInsuredForSectionVIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVIICover"),fetchValueFromTextFields(assessedLossAmountOfSECVIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVIICover"),fetchValueFromTextFields(claimAmountOfSECVIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionVIIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionVIIICoverRequired"),fetchValueFromList(isSectionVIIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionVIII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionVIII"),fetchValueFromTextFields(sumInsuredForSectionVIIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECVIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECVIIICover"),fetchValueFromTextFields(assessedLossAmountOfSECVIIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECVIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECVIIICover"),fetchValueFromTextFields(claimAmountOfSECVIIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionIXCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionIXCoverRequired"),fetchValueFromList(isSectionIXCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionIX")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionIX"),fetchValueFromTextFields(sumInsuredForSectionIXTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECIXCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECIXCover"),fetchValueFromTextFields(assessedLossAmountOfSECIXCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECIXCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECIXCover"),fetchValueFromTextFields(claimAmountOfSECIXCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionXCoverRequired"),fetchValueFromList(isSectionXCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionX")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionX"),fetchValueFromTextFields(sumInsuredForSectionXTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXCover"),fetchValueFromTextFields(assessedLossAmountOfSECXCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXCover"),fetchValueFromTextFields(claimAmountOfSECXCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionXICoverRequired"),fetchValueFromList(isSectionXICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXI")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXI"),fetchValueFromTextFields(sumInsuredForSectionXITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXICover"),fetchValueFromTextFields(assessedLossAmountOfSECXICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXICover"),fetchValueFromTextFields(claimAmountOfSECXICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionXIICoverRequired"),fetchValueFromList(isSectionXIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXII"),fetchValueFromTextFields(sumInsuredForSectionXIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXIICover"),fetchValueFromTextFields(assessedLossAmountOfSECXIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXIICover"),fetchValueFromTextFields(claimAmountOfSECXIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSectionXIIICoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSectionICoverRequired"),fetchValueFromList(isSectionXIIICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionXIII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionXIII"),fetchValueFromTextFields(sumInsuredForSectionXIIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSECXIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSECXIIICover"),fetchValueFromTextFields(assessedLossAmountOfSECXIIICoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSECXIIICover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSECXIIICover"),fetchValueFromTextFields(claimAmountOfSECXIIICoverTextField), AssertionType.WARNING);
				}
				//MI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsMoneyInTransitRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsMoneyInTransitRequired"),fetchValueFromList(isMoneyInTransitRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("EstimatedAnnualTurnover"),fetchValueFromTextFields(estimatedAnnualTurnoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTransit"),fetchValueFromTextFields(assessedLossAmountOfMoneyInTransitTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInTransit"),fetchValueFromTextFields(claimAmountOfMoneyInTransitTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsMoneyInTillRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsMoneyInTillRequired"),fetchValueFromList(isMoneyInTillRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSECII")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSECII"),fetchValueFromTextFields(totalSumInsuredForSECIITextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTill")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTill"),fetchValueFromTextFields(assessedLossAmountOfMoneyInTillTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTill")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInTill"),fetchValueFromTextFields(claimAmountOfMoneyInTillTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSRCCCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSRCCCoverRequired"),fetchValueFromList(isSRCCCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSRCCCoverSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SRCCCoverSumInsured"),fetchValueFromTextFields(sRCCCoverSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSRCCCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSRCCCover"),fetchValueFromTextFields(assessedLossAmountOfSRCCCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSRCCCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSRCCCover"),fetchValueFromTextFields(claimAmountOfSRCCCoverTextField), AssertionType.WARNING);
				}
				//OS
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection1FireBuildingRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection1FireBuildingRequired"),fetchValueFromList(isSection1FireBuildingRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC1")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC1"),fetchValueFromTextFields(totalSumInsuredForSEC1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection1")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection1"),fetchValueFromTextFields(assessedLossAmountOfSection1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection1")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection1"),fetchValueFromTextFields(claimAmountOfSection1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection2AFireContentsRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection2AFireContentsRequired"),fetchValueFromList(isSection2AFireContentsRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC2A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC2A"),fetchValueFromTextFields(totalSumInsuredForSEC2ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2A"),fetchValueFromTextFields(assessedLossAmountOfSection2ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2A"),fetchValueFromTextFields(claimAmountOfSection2ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection2BBurglaryContentsRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection2BBurglaryContentsRequired"),fetchValueFromList(isSection2BBurglaryContentsRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection2B")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection2B"),fetchValueFromTextFields(sumInsuredForSection2BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2B")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2B"),fetchValueFromTextFields(assessedLossAmountOfSection2BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2B")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2B"),fetchValueFromTextFields(claimAmountOfSection2BTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection3TenantsLiabilityRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection3TenantsLiabilityRequired"),fetchValueFromList(isSection3TenantsLiabilityRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection3")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection3"),fetchValueFromTextFields(sumInsuredForSection3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection3")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection3"),fetchValueFromTextFields(assessedLossAmountOfSection3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection3")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection3"),fetchValueFromTextFields(claimAmountOfSection3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection4MoneyInsuranceRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection4MoneyInsuranceRequired"),fetchValueFromList(isSection4MoneyInsuranceRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection4")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection4"),fetchValueFromTextFields(sumInsuredForSection4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection4")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection4"),fetchValueFromTextFields(assessedLossAmountOfSection4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection4")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection4"),fetchValueFromTextFields(claimAmountOfSection4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection5FixedGlassAndSanitaryFittingsRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection5FixedGlassAndSanitaryFittingsRequired"),fetchValueFromList(isSection5FixedGlassAndSanitaryFittingsRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSEC5")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForSEC5"),fetchValueFromTextFields(totalSumInsuredForSEC5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection5")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection5"),fetchValueFromTextFields(assessedLossAmountOfSection5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection5")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection5"),fetchValueFromTextFields(claimAmountOfSection5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection6FidelityGuaranteeRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection6FidelityGuaranteeRequired"),fetchValueFromList(isSection6FidelityGuaranteeRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalGuaranteedAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalGuaranteedAmount"),fetchValueFromTextFields(totalGuaranteedAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection6")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection6"),fetchValueFromTextFields(assessedLossAmountOfSection6TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection6")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection6"),fetchValueFromTextFields(claimAmountOfSection6TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection7DamageToElectronicEquipmentRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection7DamageToElectronicEquipmentRequired"),fetchValueFromList(isSection7DamageToElectronicEquipmentRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection7")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection7"),fetchValueFromTextFields(assessedLossAmountOfSection7TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection7")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection7"),fetchValueFromTextFields(claimAmountOfSection7TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsSection8ACostOfReinstatementOfDataRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsSection8ACostOfReinstatementOfDataRequired"),fetchValueFromList(isSection8ACostOfReinstatementOfDataRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection8A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection8A"),fetchValueFromTextFields(sumInsuredForSection8ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection8A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection8A"),fetchValueFromTextFields(assessedLossAmountOfSection8ATextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection8A")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection8A"),fetchValueFromTextFields(claimAmountOfSection8ATextField), AssertionType.WARNING);
				}
				//PB
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDetailsOfTravel")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DetailsOfTravel"),fetchValueFromList(detailsOfTravelDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFlightNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("FlightNumber"),fetchValueFromTextFields(flightNumberTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTicketNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TicketNumber"),fetchValueFromTextFields(ticketNumberTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPlaceOfTravelFrom")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PlaceOfTravelFrom"),fetchValueFromTextFields(placeOfTravelFromTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPlaceOfTravelTo")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PlaceOfTravelTo"),fetchValueFromTextFields(placeOfTravelToTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfJourney")) {

					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskProp2MNLEntity.getStringValueForField("DateOfJourney")),fetchValueFromTextFields(dateOfJourneyTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPassportNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PassportNumber"),fetchValueFromTextFields(passportNumberTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigVisaNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("VisaNumber"),fetchValueFromTextFields(visaNumberTextField), AssertionType.WARNING);
				}
				//HH
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection1Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section1Required"),fetchValueFromList(section1RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection1"),fetchValueFromTextFields(sumInsuredForSection1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC1")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC1"),fetchValueFromTextFields(excessForSEC1TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection2Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section2Required"),fetchValueFromList(section2RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSection2")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSection2"),fetchValueFromTextFields(assessedLossAmountOfSection2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC2")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC2"),fetchValueFromTextFields(excessForSEC2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSection2")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSection2"),fetchValueFromTextFields(claimAmountOfSection2TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection3Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section3Required"),fetchValueFromList(section3RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForsection3")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForsection3"),fetchValueFromTextFields(sumInsuredForsection3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC3")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC3"),fetchValueFromTextFields(excessForSEC3TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection4Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section4Required"),fetchValueFromList(section4RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC4")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC4"),fetchValueFromTextFields(excessForSEC4TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection5")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection5"),fetchValueFromTextFields(sumInsuredForSection5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC5")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC5"),fetchValueFromTextFields(excessForSEC5TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection6Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section6Required"),fetchValueFromList(section6RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection6")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection6"),fetchValueFromTextFields(sumInsuredForSection6TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC6")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC6"),fetchValueFromTextFields(excessForSEC6TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSection7Required")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Section7Required"),fetchValueFromList(section7RequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSection7")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSection7"),fetchValueFromTextFields(sumInsuredForSection7TextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcessForSEC7")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExcessForSEC7"),fetchValueFromTextFields(excessForSEC7TextField), AssertionType.WARNING);
				}
				//EV
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"),fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"),fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"),fetchValueFromTextFields(assessedLossAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"),fetchValueFromTextFields(claimAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				//FI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDatOfDetDismialRetintOfEmpleComitingTheFraud")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DatOfDetDismialRetintOfEmpleComitingTheFraud"),fetchValueFromTextFields(dateOfDeathDismissalRetirementOfEmployeeCommittingTheFraudTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfLossDiscovered")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfLossDiscovered"),fetchValueFromTextFields(dateOfLossDiscoveredTextField), AssertionType.WARNING);
				}
				//NI
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsPhysicalLossOrDamageToNeonSignRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsPhysicalLossOrDamageToNeonSignRequired"),fetchValueFromList(isPhysicalLossOrDamageToNeonSignRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForPhysicalLossOrDamage")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForPhysicalLossOrDamage"),fetchValueFromTextFields(sumInsuredForPhysicalLossOrDamageTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPhysicalLossOrDamage")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPhysicalLossOrDamage"),fetchValueFromTextFields(assessedLossAmountOfPhysicalLossOrDamageTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPhysicalLossOrDamage")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPhysicalLossOrDamage"),fetchValueFromTextFields(claimAmountOfPhysicalLossOrDamageTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsThirdPartyLegalLiabilityRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsThirdPartyLegalLiabilityRequired"),fetchValueFromList(isThirdPartyLegalLiabilityRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLegalLiability")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForThirdPartyLegalLiability"),fetchValueFromTextFields(sumInsuredForThirdPartyLegalLiabilityTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfThirdPartyLegalLiability")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfThirdPartyLegalLiability"),fetchValueFromTextFields(assessedLossAmountOfThirdPartyLegalLiabilityTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfThirdPartyLegalLiability")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfThirdPartyLegalLiability"),fetchValueFromTextFields(claimAmountOfThirdPartyLegalLiabilityTextField), AssertionType.WARNING);
				}
				//BA
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ReasonForReopen"),fetchValueFromList(reasonForReopenDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalAssessedLossAmount"),fetchValueFromTextFields(totalAssessedLossAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"),fetchValueFromList(isUnderlnsuranceApplicableDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NetClaimAmount"),fetchValueFromTextFields(netClaimAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DistrictStateNational"),fetchValueFromList(districtStateNationalDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"),fetchValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("UnderInsuranceType"),fetchValueFromList(underInsuranceTypeDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("UnderInsuranceAmount"),fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"),fetchValueFromTextFields(claimLossAfterUnderInsuranceTextField), AssertionType.WARNING);
				}
				//HH
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PreviousPolicyNumber"),fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNatureOfTreatment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NatureOfTreatment"),fetchValueFromList(natureOfTreatmentDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfAdmissionInHospital")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfAdmissionInHospital"),fetchValueFromTextFields(dateOfAdmissionInHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfDischargeFromTheHospital")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfDischargeFromTheHospital"),fetchValueFromTextFields(dateOfDischargeFromTheHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameAndPlaceOfTheHospital")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NameAndPlaceOfTheHospital"),fetchValueFromTextFields(nameAndPlaceOfTheHospitalTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentHospitalization")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentHospitalization"),fetchValueFromTextFields(dateOfCompletionOfTreatmentHospitalizationTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesHospitalization")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalMedicalExpensesHospitalization"),fetchValueFromTextFields(totalMedicalExpensesHospitalizationTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerLeaveCertificateFromTheEmployerFrom")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PeriodOfLeaveAsPerLeaveCertificateFromTheEmployerFrom"),fetchValueFromTextFields(periodOfLeaveAsPerLeaveCertificateFromTheEmployerFromTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPeriodOfLeaveAsPerLeaveCertificateFromTheEmployerTo")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PeriodOfLeaveAsPerLeaveCertificateFromTheEmployerTo"),fetchValueFromTextFields(periodOfLeaveAsPerLeaveCertificateFromTheEmployerToTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFitnessCertificateFromDoctorFromDate")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("FitnessCertificateFromDoctorFromDate"),fetchValueFromTextFields(fitnessCertificateFromDoctorFromDateTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFitnessCertificateFromDoctorToDate")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("FitnessCertificateFromDoctorToDate"),fetchValueFromTextFields(fitnessCertificateFromDoctorToDateTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("MedicalExtensionRequired"),fetchValueFromTextFields(medicalExtensionRequiredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsCompensationForEducationFundRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsCompensationForEducationFundRequired"),fetchValueFromList(isCompensationForEducationFundRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsWeeklyCompensationRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsWeeklyCompensationRequired"),fetchValueFromList(isWeeklyCompensationRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfDeath")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfDeath"),fetchValueFromTextFields(dateOfDeathTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ExpensesIncurredForCarriageOfDeadBodyToThePlaceOfResidence"),fetchValueFromTextFields(expensesIncurredForCarriageOfDeadBodyToThePlaceOfResidenceTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCommencementOfTreatment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfCommencementOfTreatment"),fetchValueFromTextFields(dateOfCommencementOfTreatmentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDateOfCompletionOfTreatmentOPD")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DateOfCompletionOfTreatmentOPD"),fetchValueFromTextFields(dateOfCompletionOfTreatmentOPDTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalMedicalExpensesOPD")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalMedicalExpensesOPD"),fetchValueFromTextFields(totalMedicalExpensesOPDTextField), AssertionType.WARNING);
				}
				//PT-Rajkumar--2ND Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"), fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"), fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"), fetchValueFromTextFields(assessedLossAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"), fetchValueFromTextFields(claimAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				//BN-Rajkumar--2ND Page 
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnAppraisers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnAppraisers"), fetchValueFromList(claimOnAppraisersDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForAppraisers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("LimitsOfLiabilityForAppraisers"), fetchValueFromTextFields(limitsOfLiabilityForAppraisersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfAppraisers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfAppraisers"), fetchValueFromTextFields(assessedLossAmountOfAppraisersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfAppraisers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfAppraisers"), fetchValueFromTextFields(claimAmountOfAppraisersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCollionAgetJataChotBacatYojnPigieColtors")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCollionAgetJataChotBacatYojnPigieColtors"), fetchValueFromList(claimOnCollectionAgentJantaChotiBachatYojanaPigmieCollectorsDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimiOfLiabyForCollionAgentJanaChtiBachtYojnaPigmeColctrs")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("LimiOfLiabyForCollionAgentJanaChtiBachtYojnaPigmeColctrs"), fetchValueFromTextFields(limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAsedLosAmotOfColleionAgntJataChtiBchatYoanaPigieColors")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AsedLosAmotOfColleionAgntJataChtiBchatYoanaPigieColors"), fetchValueFromTextFields(assessedLossAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmoutOfColeionAgntJanaChoiBachtYojaaPigieColors")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmoutOfColeionAgntJanaChoiBachtYojaaPigieColors"), fetchValueFromTextFields(claimAmountOfCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField), AssertionType.WARNING);
				}
				//BD-Rajkumar--2ND Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInTrade"), fetchValueFromList(claimOnStockInTradeDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredStockInTrade"), fetchValueFromTextFields(sumInsuredStockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInTrade"), fetchValueFromTextFields(assessedLossAmountOfStockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInTrade"), fetchValueFromTextFields(claimAmountOfStockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnGoodsHeldInTrustOrCommission"), fetchValueFromList(claimOnGoodsHeldInTrustOrCommissionDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredGoodsHeldInTrustAndOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredGoodsHeldInTrustAndOrCommission"), fetchValueFromTextFields(sumInsuredGoodsHeldInTrustAndOrCommission), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfGoodsHeldInTrustOrCommission"), fetchValueFromTextFields(assessedLossAmountOfGoodsHeldInTrustOrCommission), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfGoodsHeldInTrustOrCommission"), fetchValueFromTextFields(claimAmountOfGoodsHeldInTrustOrCommission), AssertionType.WARNING);
				}			
				//BB - Rajkumar-2nd Page			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnMoneyInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnMoneyInPremises"), fetchValueFromList(claimOnMoneyInPremisesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInPremises"), fetchValueFromTextFields(additionalSumInsuredForMoneyInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInPremises"), fetchValueFromTextFields(assessedLossAmountOfMoneyInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfMoneyInPremises"), fetchValueFromTextFields(claimAmountOfMoneyInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnMoneyInTransit"), fetchValueFromList(claimOnMoneyInTransitDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInTransit"), fetchValueFromTextFields(additionalSumInsuredForMoneyInTransitTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInTransit"), fetchValueFromTextFields(assessedLossAmountOfMoneyInTransitTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInTransit")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnRegisteredPostalSending"), fetchValueFromList(claimOnRegisteredPostalSendingDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForRegisteredPostalSending")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("LimitsOfLiabilityForRegisteredPostalSending"), fetchValueFromTextFields(limitsOfLiabilityForRegisteredPostalSendingTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfRegisteredPostalSending")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfRegisteredPostalSending"), fetchValueFromTextFields(assessedLossAmountOfRegisteredPostalSendingTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfRegisteredPostalSending	")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfRegisteredPostalSending"), fetchValueFromTextFields(claimAmountOfRegisteredPostalSendingTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NameOfTheStudent"), fetchValueFromTextFields(nameOfTheStudentTextField), AssertionType.WARNING);
				}			
				//SY-Rajkumar-2nd Page			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NameOfTheStudent"), fetchValueFromTextFields(nameOfTheStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAgeYr")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AgeYr"), fetchValueFromTextFields(ageYrTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClassOfTheStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClassOfTheStudent"), fetchValueFromTextFields(classOfTheStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDivision")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Division"), fetchValueFromTextFields(divisionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigRollNumber")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("RollNumber"), fetchValueFromTextFields(rollNumberTextField), AssertionType.WARNING);
				}/*SH-Rajkumar--2nd Page*/

				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionone")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionone"), fetchValueFromTextFields(assessedLossAmountOfSectiononeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionone")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionone"), fetchValueFromTextFields(claimAmountOfSectiononeTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectiontwo")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectiontwo"), fetchValueFromTextFields(assessedLossAmountOfSectiontwoTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectiontwo")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectiontwo"), fetchValueFromTextFields(claimAmountOfSectiontwoTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionthree")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionthree"), fetchValueFromTextFields(assessedLossAmountOfSectionthreeTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionthree")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionthree"), fetchValueFromTextFields(claimAmountOfSectionthreeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionfour")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionfour"), fetchValueFromTextFields(assessedLossAmountOfSectionfourTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionfour")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionfour"), fetchValueFromTextFields(claimAmountOfSectionfourTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionfive")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionfive"), fetchValueFromTextFields(assessedLossAmountOfSectionfiveTextField), AssertionType.WARNING);
				}			
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionfive")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionfive"), fetchValueFromTextFields(claimAmountOfSectionfiveTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSectionsix")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfSectionsix"), fetchValueFromTextFields(assessedLossAmountOfSectionsixTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfSectionsix")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfSectionsix"), fetchValueFromTextFields(claimAmountOfSectionsixTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionOneRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionOneRequired"), fetchValueFromList(sectionOneRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionTwoRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionTwoRequired"), fetchValueFromList(sectionTwoRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionThreeRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionThreeRequired"), fetchValueFromList(sectionThreeRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionFourRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionFourRequired"), fetchValueFromList(sectionFourRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionFiveRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionFiveRequired"), fetchValueFromList(sectionFiveRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSectionSixRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SectionSixRequired"), fetchValueFromList(sectionSixRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForFireContent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForFireContent"), fetchValueFromTextFields(totalSumInsuredForFireContentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredBurglaryAndHouseBreaking")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredBurglaryAndHouseBreaking"), fetchValueFromTextFields(totalSumInsuredBurglaryAndHouseBreakingTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionthree")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionthree"), fetchValueFromTextFields(sumInsuredForSectionthreeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredPedalCycles")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredPedalCycles"), fetchValueFromTextFields(sumInsuredPedalCyclesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForPlateGlass")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSumInsuredForPlateGlass"), fetchValueFromTextFields(totalSumInsuredForPlateGlassTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForSectionsix")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForSectionsix"), fetchValueFromTextFields(sumInsuredForSectionsixTextField), AssertionType.WARNING);
				}//SE-Rajkumar--2nd Page
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AreStudentsDead"), fetchValueFromList(areStudentsDeadDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsDead"), fetchValueFromTextFields(numberOfStudentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerDeadStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerDeadStudent"), fetchValueFromTextFields(compensationLimitPerDeadStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsDead"), fetchValueFromTextFields(totalCompensationForStudentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsDead"), fetchValueFromTextFields(assessedLossAmountForStudentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsInjured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AreStudentsInjured"), fetchValueFromTextFields(areStudentsInjuredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsInjured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsInjured"), fetchValueFromTextFields(numberOfStudentsInjuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerInjuredStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerInjuredStudent"), fetchValueFromTextFields(compensationLimitPerInjuredStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsInjured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsInjured"), fetchValueFromTextFields(totalCompensationForStudentsInjuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsInjured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsInjured"), fetchValueFromTextFields(assessedLossAmountForStudentsInjuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreStudentsHospitalised")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AreStudentsHospitalised"), fetchValueFromList(areStudentsHospitalisedDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfStudentsHospitalised")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AreStudentsHospitalised"), fetchValueFromList(areStudentsHospitalisedDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerHospitalisedStudent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NumberOfStudentsHospitalised"), fetchValueFromTextFields(numberOfStudentsHospitalisedTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsHospitalised")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerHospitalisedStudent"), fetchValueFromTextFields(compensationLimitPerHospitalisedStudentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForStudentsHospitalised")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForStudentsHospitalised"), fetchValueFromTextFields(totalCompensationForStudentsHospitalisedTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForStudentsHospitalised")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForStudentsHospitalised"), fetchValueFromTextFields(assessedLossAmountForStudentsHospitalisedTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAreParentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AreParentsDead"), fetchValueFromList(areParentsDeadDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNumberOfParentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NumberOfParentsDead"), fetchValueFromTextFields(numberOfParentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCompensationLimitPerDeadParent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CompensationLimitPerDeadParent"), fetchValueFromTextFields(compensationLimitPerDeadParentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalCompensationForParentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalCompensationForParentsDead"), fetchValueFromTextFields(totalCompensationForParentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForParentsDead")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForParentsDead"), fetchValueFromTextFields(assessedLossAmountForParentsDeadTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLossOfSchoolBagContainingBooksCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("LossOfSchoolBagContainingBooksCover"), fetchValueFromList(lossOfSchoolBagContainingBooksCoverDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNoOfSchoolBagsLost")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NoOfSchoolBagsLost"), fetchValueFromTextFields(noOfSchoolBagsLostTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReimbursementLimitPerStudentForTheLostBag")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ReimbursementLimitPerStudentForTheLostBag"), fetchValueFromTextFields(reimbursementLimitPerStudentForTheLostBagTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalReimbursementForTheLostSchoolBags")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalReimbursementForTheLostSchoolBags"), fetchValueFromTextFields(totalReimbursementForTheLostSchoolBagsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForLostSchoolBags")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForLostSchoolBags"), fetchValueFromTextFields(assessedLossAmountForLostSchoolBagsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPaymentOfTuitionAndHostelFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PaymentOfTuitionAndHostelFees"), fetchValueFromList(paymentOfTuitionAndHostelFeesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotaOfParenrGuardnFoaymtOfTuiondHtelFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotaOfParenrGuardnFoaymtOfTuiondHtelFees"), fetchValueFromTextFields(totalSIOfParentsOrGuardianForPaymentOfTuitionAndHostelFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountForPaymentOfTuitionAndHostelFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountForPaymentOfTuitionAndHostelFees"), fetchValueFromTextFields(assessedLossAmountForPaymentOfTuitionAndHostelFeesTextField), AssertionType.WARNING);
				}
				//JI   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInPremises"),fetchValueFromList(claimOnStockInPremisesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("StockInPremises"),fetchValueFromTextFields(stockInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInPremises"),fetchValueFromTextFields(assessedLossAmountOfStockInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInPremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInPremises"),fetchValueFromTextFields(claimAmountOfStockInPremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockAtDisplayWindowInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockAtDisplayWindowInThePremises"),fetchValueFromList(claimOnStockAtDisplayWindowInThePremisesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockAtDisplayWindowInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("StockAtDisplayWindowInThePremises"),fetchValueFromTextFields(stockAtDisplayWindowInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAsssLossAuntStockAisplayWinnThreses")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AsssLossAuntStockAisplayWinnThreses"),fetchValueFromTextFields(assessedLossAmountOfStockAtDisplayWindowInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockAtDisplayWindowInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockAtDisplayWindowInThePremises"),fetchValueFromTextFields(claimAmountOfStockAtDisplayWindowInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInLockedSafeInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInLockedSafeInThePremises"),fetchValueFromList(claimOnStockInLockedSafeInThePremisesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInLockedSafeInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("StockInLockedSafeInThePremises"),fetchValueFromTextFields(stockInLockedSafeInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInLockedSafeInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInLockedSafeInThePremises"),fetchValueFromTextFields(claimAmountOfStockInLockedSafeInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInLockedSafeInThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInLockedSafeInThePremises"),fetchValueFromTextFields(assessedLossAmountOfStockInLockedSafeInThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnElseWhereWithinThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnElseWhereWithinThePremises"),fetchValueFromList(claimOnElseWhereWithinThePremisesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigElseWhereWithinThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ElseWhereWithinThePremises"),fetchValueFromTextFields(elseWhereWithinThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfElseWhereWithinThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfElseWhereWithinThePremises"),fetchValueFromTextFields(assessedLossAmountOfElseWhereWithinThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfElseWhereWithinThePremises")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfElseWhereWithinThePremises"),fetchValueFromTextFields(claimAmountOfElseWhereWithinThePremisesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCashAndCurrencyNotes")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCashAndCurrencyNotes"),fetchValueFromList(claimOnCashAndCurrencyNotesDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCashAndCurrencyNotes")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CashAndCurrencyNotes"),fetchValueFromTextFields(cashAndCurrencyNotesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfCashAndCurrencyNotes")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfCashAndCurrencyNotes"),fetchValueFromTextFields(assessedLossAmountOfCashAndCurrencyNotesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfCashAndCurrencyNotes")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfCashAndCurrencyNotes"),fetchValueFromTextFields(claimAmountOfCashAndCurrencyNotesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnPropertyInBankLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnPropertyInBankLockers"),fetchValueFromList(claimOnPropertyInBankLockersDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPropertyInBankLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPropertyInBankLockers"),fetchValueFromTextFields(assessedLossAmountOfPropertyInBankLockersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPropertyInBankLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PropertyInBankLockers"),fetchValueFromTextFields(propertyInBankLockersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPropertyInBankLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPropertyInBankLockers"),fetchValueFromTextFields(claimAmountOfPropertyInBankLockersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnPrivateLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnPrivateLockers"),fetchValueFromList(claimOnPrivateLockersDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPrivateLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("PrivateLockers"),fetchValueFromTextFields(privateLockersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfPrivateLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfPrivateLockers"),fetchValueFromTextFields(assessedLossAmountOfPrivateLockersTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfPrivateLockers")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfPrivateLockers"),fetchValueFromTextFields(claimAmountOfPrivateLockersTextField), AssertionType.WARNING);
				}
				//PQ and PY   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("IsTerrorismCoverRequired"),fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SumInsuredForTerrorism"),fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"),fetchValueFromTextFields(assessedLossAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"),fetchValueFromTextFields(claimAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				//SK   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ReasonForReopen"),fetchValueFromList(reasonForReopenDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DistrictStateNational"),fetchValueFromList(districtStateNationalDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP ")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"),fetchValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSurveyFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SurveyFees"),fetchValueFromTextFields(surveyFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigLegalOpinionFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("LegalOpinionFees"),fetchValueFromTextFields(legalOpinionFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOther1Fees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Other1Fees"),fetchValueFromTextFields(other1FeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOther2Fees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Other2Fees"),fetchValueFromTextFields(other2FeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalClaimAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalClaimAmount"),fetchValueFromTextFields(totalClaimAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTotalSurveyorFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TotalSurveyorFees"),fetchValueFromTextFields(totalSurveyorFeesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigTranslatorFees")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("TranslatorFees"),fetchValueFromTextFields(translatorFeesTextField), AssertionType.WARNING);
				}
				//BI   === Dharmendra
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnStockInTrade"),fetchValueFromList(claimOnStockInTradeDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("StockInTrade"),fetchValueFromTextFields(stockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfStockInTrade"),fetchValueFromTextFields(claimAmountOfStockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfStockInTrade")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfStockInTrade"),fetchValueFromTextFields(assessedLossAmountOfStockInTradeTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnGoodsHeldInTrustOrCommission"),fetchValueFromList(claimOnGoodsHeldInTrustOrCommissionDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("GoodsHeldInTrustCommission"),fetchValueFromTextFields(goodsHeldInTrustCommissionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfGoodsHeldInTrustOrCommission"),fetchValueFromTextFields(assessedLossAmountOfGoodsHeldInTrustOrCommissionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfGoodsHeldInTrustOrCommission")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfGoodsHeldInTrustOrCommission"),fetchValueFromTextFields(claimAmountOfGoodsHeldInTrustOrCommissionTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnFurnitureOrFixtureOrFittings")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnFurnitureOrFixtureOrFittings"),fetchValueFromList(claimOnFurnitureOrFixtureOrFittingsDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigFurnitureFixtureFittings")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("FurnitureFixtureFittings"),fetchValueFromTextFields(furnitureFixtureFittingsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfFurnitureOrFixtureOrFittings")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfFurnitureOrFixtureOrFittings"),fetchValueFromTextFields(assessedLossAmountOfFurnitureOrFixtureOrFittingsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfFurnitureOrFixtureOrFittings")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfFurnitureOrFixtureOrFittings"),fetchValueFromTextFields(claimAmountOfFurnitureOrFixtureOrFittingsTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnOfficeEquipment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnOfficeEquipment"),fetchValueFromList(claimOnOfficeEquipmentDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOfficeEquipment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("OfficeEquipment"),fetchValueFromTextFields(officeEquipmentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOfficeEquipment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfOfficeEquipment"),fetchValueFromTextFields(assessedLossAmountOfOfficeEquipmentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOfficeEquipment")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfOfficeEquipment"),fetchValueFromTextFields(claimAmountOfOfficeEquipmentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnCoinsOrCurrencyOrCuriosEtc")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnCoinsOrCurrencyOrCuriosEtc"),fetchValueFromList(claimOnCoinsOrCurrencyOrCuriosEtcDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCoinsCurrencyCuriosEtc")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CoinsCurrencyCuriosEtc"),fetchValueFromTextFields(coinsCurrencyCuriosEtcTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfCoinsOrCurrencyOrCuriosEtc")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfCoinsOrCurrencyOrCuriosEtc"),fetchValueFromTextFields(assessedLossAmountOfCoinsOrCurrencyOrCuriosEtcTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfCoinsOrCurrencyOrCuriosEtc")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfCoinsOrCurrencyOrCuriosEtc"),fetchValueFromTextFields(claimAmountOfCoinsOrCurrencyOrCuriosEtcTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimOnOthersSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimOnOthersSumInsured"),fetchValueFromList(claimOnOthersSumInsuredDroDown), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOthersSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("OthersSumInsured"),fetchValueFromTextFields(othersSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfOthersSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AssessedLossAmountOfOthersSumInsured"),fetchValueFromTextFields(assessedLossAmountOfOthersSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimAmountOfOthersSumInsured")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimAmountOfOthersSumInsured"),fetchValueFromTextFields(claimAmountOfOthersSumInsuredTextField), AssertionType.WARNING);
				}
				
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigEstimatedAmountofLoss")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("EstimatedAmountofLoss"),fetchValueFromTextFields(estimatedAmountofLossTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimassessedAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("ClaimassessedAmount"),fetchValueFromTextFields(ClaimassessedAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSueandLabourCharges")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SueandLabourCharges"),fetchValueFromTextFields(SueandLabourChargesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSalvageCharges")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SalvageCharges"),fetchValueFromTextFields(SalvageChargesTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCollisionLiability")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CollisionLiability"),fetchValueFromTextFields(CollisionLiabilityTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("DeductibleAmount"),fetchValueFromTextFields(DeductibleAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSalvageAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SalvageAmount"),fetchValueFromTextFields(SalvageAmountTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderinsurancepercent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Underinsurancepercent"),fetchValueFromTextFields(UnderinsurancepercentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("OtherRecoveredAmount"),fetchValueFromTextFields(OtherRecoveredAmountTextField), AssertionType.WARNING);
				}
				if(claimRiskProp2MNLEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigNameoftheInsured")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("NameoftheInsured"),fetchValueFromTextFields(NameoftheInsuredTextField), AssertionType.WARNING);
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAgeyrForRK")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("AgeyrForRK"),fetchValueFromTextFields(AgeyrForRKTextField), AssertionType.WARNING);
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforroadaccident")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforroadaccident"),fetchValueFromList(IsclaimrequiredforroadaccidentDroDown), AssertionType.WARNING);
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesdueforoadaccident")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesdueforoadaccident"),fetchValueFromList(IsclaimrequiredforhospexpensesdueforoadaccidentDroDown), AssertionType.WARNING);
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesduetoaccdntincourseofempext")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesduetoaccdntincourseofempext"),fetchValueFromList(IsclaimrequiredforhospexpensesduetoaccdntincourseofempextnDroDown), AssertionType.WARNING);
					}
					if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigIsclaimrequiredforhospexpensesforanyotheraccidentwidercover")) {
						assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Isclaimrequiredforhospexpensesforanyotheraccidentwidercover"),fetchValueFromList(IsclaimrequiredforhospexpensesforanyotheraccidentwidercoverDroDown), AssertionType.WARNING);
					}		
				}
				
				//CS 
				/*if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigSueandLabourCharges")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("SueandLabourCharges"),fetchValueFromTextFields(SueandLabourChargesTextField), AssertionType.WARNING);
				}
				
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigCollisionLiability")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("CollisionLiability"),fetchValueFromTextFields(CollisionLiabilityTextField), AssertionType.WARNING);
				}
				
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigUnderinsurancepercent")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("Underinsurancepercent"),fetchValueFromTextFields(UnderinsurancepercentTextField), AssertionType.WARNING);
				}
				if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
					assertReference.assertEquals(claimRiskProp2MNLEntity.getStringValueForField("OtherRecoveredAmount"),fetchValueFromTextFields(OtherRecoveredAmountTextField), AssertionType.WARNING);
				}*/
				
			
			}
		}
	}
	public void navigateNextToClaimRiskProperty(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
				acceptAlertAndReturnConfirmationMessage();			
			}catch(Exception e){}			
			switchToFrame("display");
			/*nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskProp2MNLEntity.getStringValueForField("ClaimRiskProperty3Title").trim()+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);*/
		
		}
	}	
	public void navigatePreviousToClaimRiskProperty(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(miscNonT1CLRTitle);			
		}
	}	
	public void navigateToMainAttributePage(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity){
		if (claimRiskProp2MNLEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	
	public void SubmitCommonClaimRiskProperty2ForMiscNLDetails(ClaimRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProp2MNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskProperty2ForMiscNonLiabilityDetails(claimRiskProp2MNLEntity, assertReference);
			navigateNextToClaimRiskProperty(claimRiskProp2MNLEntity);
			SubmitCommonClaimRiskProperty2ForMiscNLDetails(claimRiskProp2MNLEntity);
			navigateToMainAttributePage(claimRiskProp2MNLEntity);
			navigateToclaimHomePage(claimRiskProp2MNLEntity);
			navigateToInsuredItem(claimRiskProp2MNLEntity);
			navigateToDocument(claimRiskProp2MNLEntity);
			navigateToParties(claimRiskProp2MNLEntity);
			navigateToReserve(claimRiskProp2MNLEntity);
			navigateToPayment(claimRiskProp2MNLEntity);
			navigateToAttribute(claimRiskProp2MNLEntity);
			navigateToInsuredItemDetails(claimRiskProp2MNLEntity);
			navigateTInsuredItemAttribute(claimRiskProp2MNLEntity);
		}
	}
}





