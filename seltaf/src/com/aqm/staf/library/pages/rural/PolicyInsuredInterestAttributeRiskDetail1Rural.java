package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LoadDiscntDetRuralEntity;
import com.aqm.staf.library.databin.PolInsIntAttRiskDet1Entity;
import com.aqm.staf.library.databin.PolInsIntAttRiskDet1Entity;
import com.aqm.staf.library.databin.PreviousPolicyHistoryEntity;

public class PolicyInsuredInterestAttributeRiskDetail1Rural extends BasePage{
	private PageElement riskDetailsForDogTitle;

	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement insuredInterestDetailTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestrAttachCoveragesTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentsTitle;
	private PageElement insuredInterestScheduleTitle;
	private PageElement typeOfRiskForCattleTextFieldForRural;


	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;	
	private PageElement currentPageLabel;
	private PageElement tagNumberTextField;
	private PageElement nameTextArea;
	private PageElement identificationTypeDropdown;
	private PageElement originOfRiskDropdown;
	private PageElement detailsOftheAnimalTextField;
	private PageElement breedColorOtherMarksTextArea;
	private PageElement sexDropdown;
	private PageElement otherMarksTextArea;
	private PageElement ageYearTextField;
	private PageElement ageINYearTextField;
	private PageElement ageMonthTextField;
	private PageElement purposeOfUseNewTextArea;
	private PageElement locationTextArea;
	private PageElement marketValueTextField;
	private PageElement sumInsuredTextField;
	private PageElement nameOfOwnerBeneficiaryTextArea;
	private PageElement addressOfOwnerBeneficiaryTextArea;
	private PageElement locationOfStableTextArea;
	private PageElement exceesInDropdown;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement forwordButton;

	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;

	private PageElement pondNumberTextField;
	private PageElement pondSpecificationTextArea;
	private PageElement isFloodProneAreaDropdownDropdown;
	private PageElement numberOfPrawnPerHectareTextField;
	private PageElement totalWaterAreaHectareTextArea;
	private PageElement typeofPrawnTextArea;
	private PageElement survivalRateTextField;
	private PageElement dateOfPurchaseFindButton;
	private PageElement dateOfPurchaseTextField;
	private PageElement stockingDateFindButton;
	private PageElement stockingDateTextField;
	private PageElement sourceOfPurchaseTextArea;
	private PageElement priceOfPrawnPerKgTextField;
	private PageElement cropPeriodMonthsTextField;
	private PageElement estimatedWeightOfPrawnKgperHectareTextField;
	private PageElement totalEstimatedWeightofPrawnKgTextField;
	private PageElement sumInsuredRsTextField;
	private PageElement ageDayTextField;
	private PageElement typeOfCalfDropDownList;
	private PageElement typeOfRiskForCattleTextField;


	//DC

	private PageElement identificationLicenseNumberTextField ; 
	private PageElement marketValueofCartRsTextField ; 
	private PageElement sumInsuredofCartRSTextField ; 
	private PageElement tagNumberofAnimal1TextField ; 
	private PageElement tagNumberofAnimal2TextField ; 
	private PageElement marketValueoftheAnimalRsTextField ; 
	private PageElement sumInsuredoftheAnimalRsTextField ; 
	private PageElement marketValueoftheAnimal2RsTextField ; 
	private PageElement sumInsuredofAnimal2RsTextField ; 
	private PageElement totalMarketValueRsTextField ; 
	private PageElement totalsuminsuredRsTextField ;
	private PageElement typeofCartDropdown ; 
	private PageElement yearofMakeDropdown ; 
	private PageElement typeofTyreDropdown ; 
	private PageElement originofriskofAnimal2Dropdown ; 
	private PageElement sexofAnimal2Dropdown ;
	private PageElement breedColorOtherMarksofanimal2TextArea;
	private PageElement isAnimalsCoveredwithCartDropdown;

	//DK
	private PageElement flockIdentificationNoTextField;
	private PageElement typeofDuckDropdown;
	private PageElement breedSpecificationTextArea;
	private PageElement ageweeksTextField;
	private PageElement locationBirdTextArea;
	private PageElement numberofBatchTextField;
	private PageElement numberofDucksperBatchTextField;
	private PageElement marketValueperBirdTextField;
	private PageElement sumInsuredperBirdTextField;

	//FC AKSHATA
	private PageElement surveyNumberTextField;
	private PageElement gATNoTextField;
	private PageElement nameOfTheFlowerTextField;
	private PageElement varietyTextArea;
	private PageElement flowerDescriptionTextArea;
	private PageElement ageOfTheFlowerYearsTextField;
	private PageElement ageOfTheFlowerMonthsTextField;
	private PageElement harvestDateFindButton;
	private PageElement locationDetailsTextArea;
	private PageElement hissaTextField;
	private PageElement harvestDateTextField;

	//EP
	private PageElement batchNumberTextField;
	private PageElement typeofPoultryDropdown;
	private PageElement typeOfBirdDropdown;
	private PageElement ageBroilersDropdown;
	private PageElement locationWhereTheBirdsAreHousedTextArea;
	private PageElement numberOfBatchTextField;
	private PageElement numberOfBirdsPerBatchTextField;
	private PageElement hatchingDateTextField;
	private PageElement hatchingDateFindButton;
	private PageElement expectedDateOfDisposalTextField;
	private PageElement expectedDateOfDisposalFindButton;
	private PageElement marketValuePerBirdTextField;
	private PageElement sumInsuredPerBirdTextField;
	private PageElement totalSumInsuredRsTextField;
	private PageElement excessInPercentDropdown;
	private PageElement riskDetailsForPoultryTitle;
	private PageElement premiumRateInPercentTextField1;

	private PageElement ageofBirdInWeeksTextField;
	//FA
	private PageElement riskCoveredTextArea;
	private PageElement optedCoverdetailsTextArea;
	private PageElement specialPerilsTextArea;
	private PageElement premiumRateTextField;
	private PageElement premiumTextField;
	private PageElement purposeofUsecattleTextarea;


	//GR Group Risk Details
	private PageElement numberofInsuredPersonsTextField;
	private PageElement geographicalAreaTextField;
	private PageElement descriptionofPersonsCoveredTextField;
	private PageElement ageGroupTextField;
	private PageElement sumInsuredPerPersonTextField;
	private PageElement assignmentDetailsTextField;
	private PageElement specialConditionsTextField;
	//GR Gramin Risk Details
	private PageElement nameOfTheinsuredTextField;
	private PageElement addressOfTheInsuredTextField;
	private PageElement statusoftheInsuredDropdown;
	private PageElement occupationGraminDropdown;
	private PageElement dateOfBirthTextField;
	private PageElement detailsOfExistingPhysicalDisabilitiesTextField;
	private PageElement grossAnnualIncomeTextField;
	private PageElement nomineesNameTextField;
	private PageElement nomineesAddressTextField;
	private PageElement relationshipofthenomineewiththeinsuredDropdown;
	private PageElement dateofBirthofNomineeTextField;
	private PageElement sexoftheInsuredDropdown;
	private PageElement excessInDropdown;
	// GP Risk details
	private PageElement pumpSerialNoTextField;
	private PageElement locationofPumpsetTextField;
	private PageElement manufacturerDetailsTextField;
	private PageElement yearOfManufacturePumpsetTextField;
	private PageElement ageofPumpYearsTextField;
	private PageElement manufacturerofSolarPartsTextField;
	private PageElement eCNoTextField;
	private PageElement panelNosTextField;
	private PageElement sumInsuredCentrifugalTextField;
	private PageElement sumInsuredSubmersibleTextField;
	private PageElement pumpsetTypeDropdown;
	private PageElement typeofMotorPumpsetDropdown;
	private PageElement yearofManufacturePumpsetTextField;
	private PageElement horsePowerCDropdown;
	private PageElement horsePowerDDropdown;
	private PageElement horsePowerSDropdown;
	private PageElement floodCoverIsRequiredDropdown;
	private PageElement gPsaveButton;
	//HB Risk Details
	private PageElement identificationNumberofBeeHiveBeeColonyTextField;
	private PageElement costPerBeeHiveTextField;
	private PageElement numberOfBeeHivesTextField;
	private PageElement costPerBeeColonyTextField;
	private PageElement numberOfBeeColoniesTextField;
	private PageElement purposeOfUseHoneyBeeTextField;
	private PageElement sumInsuredHivesTextField;
	private PageElement sumInsuredColoniesTextField;
	private PageElement sumInsuredTotalTextField;
	private PageElement typeOfBeeHiveDropdown;
	private PageElement typeofBeeColonyDropdown;


	private PageElement riskDetailsTitle;
	private PageElement nextPageTitle;

	//HD
	private PageElement tagNumber;
	private PageElement typeofRiskHDDropdown;
	private PageElement originofrisk;
	private PageElement purposeOfUseHDTextArea;

	//HI
	private PageElement identificationNumberTextField;
	private PageElement identificationLandmarkdetailsTextArea;
	private PageElement OwneroftheHutTextArea;
	private PageElement detailsoftheownerTextArea;
	private PageElement locationoftheHutTextArea;
	private PageElement suminsuredonStructuresRsTextField;
	private PageElement suminsuredonContentsRsTextField;
	private PageElement sumInsuredonthehutRsTextField;
	private PageElement typeofConstructionRuralTextArea;
	private PageElement constructionYearTextField;
	private PageElement constructionYearFindButton;
	//IF
	private PageElement typeofWaterAreaDropdown;
	private PageElement typeofFishDropdown;
	private PageElement numberOfFishPerHectareTextField;
	private PageElement estimatedWeightOfFishKgperHectareTextField;
	private PageElement totalEstimatedWeightofFishKgTextField;
	private PageElement priceOfFishPerKgTextField;
	private PageElement sIofPondTankTextField;

	//GG
	private PageElement locationOfGobarGasPlantTextArea;
	private PageElement beneficiaryNameTextArea;
	private PageElement beneficiaryDetailsTextArea;
	private PageElement marketValueOfTheDigesterinRsTextField;
	private PageElement marketValueOfTheGasHolderinRsTextField;
	private PageElement costOfConstructioninRsTextField;
	private PageElement marketValueOfTheplantinRsTextField;
	private PageElement sumInsuredOfThePlantinRsTextField;

	//FW
	private PageElement hissaNumberTextArea;
	private PageElement locationOfTheWellTextArea;
	private PageElement descriptionOfWellTextArea;

	//FP
	private PageElement descriptionOfTheRiskTextArea;
	private PageElement specialExclusionsTextArea;
	private PageElement subjectToClauseTextArea;
	private PageElement otherDetailsTariffedPolicyTextArea;
	private PageElement specialDiscountAmountTextField;
	private PageElement premiumRateInPercentTextField;

	//
	private PageElement	ageDayForCALFTextField;
	//PG-Shruti
	private PageElement detailsOfRelationshipTextArea;
	//PS-Shruti
	private PageElement manufacturerofSolarPartsTextArea;
	private PageElement eCNoTextArea;
	private PageElement panelNosTextArea;
	//SW
	private PageElement locationOfProjectTextArea;
	private PageElement totalAreaOfTheProjectAcresTextField;
	private PageElement speciesOfSilkWormDropdown;
	private PageElement raceOfTheSilkWormDropdown;
	private PageElement cocoonDisposalDateTextField;

	private PageElement sumInsuredPerLayingTextField;
	private PageElement numberOfLayingsTextField;
	//zi
	private PageElement	typeOfAnimalDropdown;
	private PageElement locationWhereTheAnimalsAreHousedTextArea;

	//Mayur-RI

	private PageElement	numberOfRabbitsPerBatchTextField;
	private PageElement	marketValuePerAnimalTextField;
	private PageElement	sumInsuredPerAnimalTextField;
	//Mayur- SG
	private PageElement	typeOfRiskForSheepAndGoatDropDown;
	private PageElement	purposeOfUseSheepAndGoatTextArea;
	private PageElement	registrationNoTextField;

	//CHINTAN
	private PageElement locationDetailsForLITextArea;
	private PageElement	descriptionOfLiftIrrigationTextArea;
	private PageElement descriptionOfDeliverychamberTextArea;
	private PageElement	detailsOfjackwellTextArea;
	private PageElement detailsOfPumpTextArea;
	private PageElement detailsOfPumpHouseTextArea;
	private PageElement detailsOfWaterStorageTankTextArea;
	private PageElement detailsOfPipelinesTextArea;
	private PageElement	detailsOfCablesTextAreaTextArea;
	private PageElement	detailsOfSwitchesTextArea;
	private PageElement detailsOfGearsTextArea;
	private PageElement	detailsOfStartersTextArea;
	private PageElement detailsOfElectricMotorsTextArea;
	private PageElement detailsOfElectricValvesTextArea;
	private PageElement sumInsuredOfLiftIrrigationSystemTextField;
	private PageElement	excessinPercentageDropDown;
	//YJ
	private PageElement sumInsuredDropDown;
	//Zp
	private PageElement locationOfStableTextField;

	private PageElement nameOfTheinsuredTextArea;
	private PageElement addressOfTheInsuredTextArea;
	private PageElement detailsOfExistingPhysicalDisabilitiesTextArea;
	private PageElement nomineesAddressTextArea;

	//YI
	private PageElement exceesInDropdownYI;

	//YB
	private PageElement ageHatcheryDropDown;
	private PageElement ageLayersDropDown;

	//RI
	private PageElement identificationMarkDropdown;
	private PageElement purposeofUseRITextArea;
	private PageElement ageInYearsRITextField;

	//SW
	private PageElement lotNumberTextField;
	private PageElement surveyRevenueNumberTextField;
	private PageElement purchaseDateTextField;
	private PageElement purchaseDateFindButton;
	private PageElement cocoonDisposalDateFindButton;

	//YR
	private PageElement typeOfCropDropDown;
	private PageElement	nameOfCropHCDropDown;
	private PageElement	lossesDueToUnseasonalRainsAndFrostDropDown;
	private PageElement	cropDescriptionTextArea;
	private PageElement	ageOfTheCropYearsTextField;
	private PageElement	ageOfTheCropMonthsTextField;
	private PageElement	locationYRTextArea;
	private PageElement	areaUnderCropHectareTextField;
	private PageElement	areaCoveredForInsuranceHectareTextField;
	private PageElement	noOfPlantsHectareTextField;
	private PageElement	sIPerPlantRsTextField;
	private PageElement	isHOApprovalIsObtainedDropDown;
	private PageElement nameofownerTextArea;
	private PageElement addressoftheownerTextArea;

	private PageElement horsePowerHDropdown;

	//FE
	private PageElement sumInsuredDwellingUnitRsTextField;
	private PageElement isSpecialDiscountApplicableDropdown;
	private PageElement sumInsuredContentsRsTextField;
	private PageElement specialDiscountInPercentTextField;

	//JN
	private PageElement sumInsuredJNDropDown;
	private PageElement surveyNoTextField;
	//uc
	private PageElement tagNumOfRecipientCowTextField;
	private PageElement descriptionTextArea;
	private PageElement TypeofriskforfoetusDropDown;
	private PageElement TechnologyusedTextField;

	//KY	
	private PageElement noOfcardholderTextField;
	private PageElement definitionofGroupITextArea;
	private PageElement definitionofGroupIITextArea;
	private PageElement sumInsuredperCardholderDropdown;
	private PageElement bankersBranchTextArea;
	private PageElement excessTextArea;
	private PageElement termsAndConditionsITextArea;
	private PageElement termsAndConditionsIITextArea;
	private PageElement totalPremiumTextField;
	private PageElement nameoftheCardHolderTextField;
	private PageElement addressoftheCardHolderTextArea;
	private PageElement statusoftheCardHolderDropdown;
	private PageElement occupationKisanDropdown;
	private PageElement dateofBirthTextField;

	private PageElement relationshipofthenomineewiththeinsuredKisanDropdown;
	private PageElement creditCardNumberTextField;
	private PageElement sumInsuredKisanDropdown;
	
	
	//YP
	private PageElement horsePowerHSDropdown;
	private PageElement horsePowerHCDropdown;
	//JP
	private PageElement sumInsuredJPDropDown;

	public PolicyInsuredInterestAttributeRiskDetail1Rural(WebDriver driver, String pageName){

		super(driver, pageName);
		riskDetailsForDogTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details For Dog')]"), "Risk Details For Dog Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.linkText("Insured Interest"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTitle = new PageElement(By.linkText("Schedule"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number", "input")), "Tag NumberText Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name", "input")), "Name Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		identificationTypeDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Type", "select")), "Identification Type Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		originOfRiskDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Origin of risk", "select")), "Origin Of Risk Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		detailsOftheAnimalTextField = new PageElement(By.xpath("//td//div[@id='Details of the animal']/following::textarea"), "Details of the animal", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		breedColorOtherMarksTextArea = new PageElement(By.xpath("//td//div[@id='Breed/Color/Other Marks']/following::textarea"), "Breed/Color/Other Marks", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sexDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex", "select")), "Sex Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		otherMarksTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breed/Color/Other Marks", "textarea")), "Other Marks Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED ,10);
		ageYearTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year )", "input")), "Age Year Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageMonthTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Months)", "input")), "Age Month Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageINYearTextField = new PageElement(By.xpath("//td//div[@id='Age In Year']/following::input"), "Age Year Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		purposeOfUseNewTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Purpose of Use(New)", "textarea")), "Purpose Of Use New Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location where the animals are housed", "textarea")), "Location Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value(Rs)", "input")), "Market Value Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		exceesInDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)", "select")), "Excees In Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameOfOwnerBeneficiaryTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Owner/Beneficiary", "textarea")), "Name of Owner/Beneficiary Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressOfOwnerBeneficiaryTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of Owner/Beneficiary", "textarea")), "Address of Owner/Beneficiary Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationOfStableTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of Stable", "textarea")), "Location of Stable Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton = new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purposeofUsecattleTextarea=new PageElement(By.xpath("//td//div[@id='Purpose of Use(cattle)']/following::textarea"),"Purpose of Use(cattle)",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		/////BW product
		pondNumberTextField = new PageElement(By.xpath("//td//div[@id='Pond Number']/following::input"), "Pond Number", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pondSpecificationTextArea = new PageElement(By.xpath("//td//div[@id='Pond Specification']/following::textarea"), "Pond Specification", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isFloodProneAreaDropdownDropdown = new PageElement(By.xpath("//td//div[@id='Is Flood Prone Area']/following::select"), "Is Flood Prone Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalWaterAreaHectareTextArea = new PageElement(By.xpath("//td//div[@id='Total Water Area (Hectare)']/following::input"), "Total Water Area (Hectare)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofPrawnTextArea = new PageElement(By.xpath("//td//div[@id='Type of Prawn']/following::textarea"), "Type of Prawn", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberOfPrawnPerHectareTextField = new PageElement(By.xpath("//td//div[@id='Number of Prawn per Hectare']/following::input"), "Number of Prawn per Hectare", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		survivalRateTextField = new PageElement(By.xpath("//td//div[@id='Survival Rate']/following::input"), "Survival Rate", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfPurchaseTextField = new PageElement(By.xpath("//td//div[@id='Date of Purchase']/following::input"), "Date of Purchase", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfPurchaseFindButton = new PageElement(By.xpath("//td//div[contains(text(),'Date of Purchase')]/following::input/following::a[@name='firstFocus']"), "Date of Purchase Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		stockingDateTextField = new PageElement(By.xpath("//td//div[@id='Stocking Date']/following::input"), "Date of Purchase", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stockingDateFindButton = new PageElement(By.xpath("//td//div[contains(text(),'Stocking Date')]/following::input/following::a[@name='firstFocus']"), "Date of Purchase Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sourceOfPurchaseTextArea = new PageElement(By.xpath("//td//div[@id='Source of Purchase']/following::textarea"), "Source Of Purchase TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		priceOfPrawnPerKgTextField = new PageElement(By.xpath("//td//div[@id='Price of Prawn per Kg']/following::input"), "Price of Prawn per Kg", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cropPeriodMonthsTextField = new PageElement(By.xpath("//td//div[@id='Crop Period (Months)']/following::input"), "Crop Period (Months)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		estimatedWeightOfPrawnKgperHectareTextField = new PageElement(By.xpath("//td//div[@id='Estimated Weight of Prawn(Kg) per Hectare']/following::input"), "Estimated Weight of Prawn(Kg) per Hectare", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalEstimatedWeightofPrawnKgTextField = new PageElement(By.xpath("//td//div[@id='Total Estimated Weight of Prawn(Kg)']/following::input"), "Crop Period (Months)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredRsTextField = new PageElement(By.xpath("//td//div[@id='Sum Insured(Rs)']/following::input"), "Sum Insured(Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageDayTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age(Days)", "input")), "Age Day Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfCalfDropDownList = new PageElement(By.xpath("//td//div[@id='Type of Calf']/following::select"), "Type of Calf", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfRiskForCattleTextField = new PageElement(By.xpath("//td//div[@id='Type of Risk for cattle for UC']/following::input[1]"), "Type of Risk For Cattle", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfRiskForCattleTextFieldForRural = new PageElement(By.xpath("//td/div[@id='Type of Risk For Cattle']/following::select[1]"), "Type of Risk For Cattle", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ageDayForCALFTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Days)", "input")), "Age Day Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//DC

		identificationLicenseNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification/License number", "input")), "Identification/License number Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueofCartRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value of cart(Rs)", "input")), "Market Value of cart(Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredofCartRSTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured of cart(RS)", "input")), "Sum Insured of cart(RS) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tagNumberofAnimal1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number of animal 1", "input")), "Tag Number of animal 1 Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tagNumberofAnimal2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number of animal 2", "input")), "Tag Number of animal 2 Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueoftheAnimalRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value of the animal(Rs)", "input")), "Market Value of the animal(Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredoftheAnimalRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured of the animal(Rs)", "input")), "Sum Insured of the animal(Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		marketValueoftheAnimal2RsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value of the Animal 2 (Rs)", "input")), "Market Value of the Animal 2 (Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredofAnimal2RsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured of Animal 2 (Rs)", "input")), "Sum Insured of Animal 2 (Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalMarketValueRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Market Value (Rs)", "input")), "Total Market Value (Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		totalsuminsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total sum insured (Rs)", "input")), "Total sum insured (Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofCartDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Cart", "select")), "type of Cart Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		yearofMakeDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Make", "select")), "year of Make Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		typeofTyreDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Tyre", "select")), "type of Tyre Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		originofriskofAnimal2Dropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Origin of risk of animal 2", "select")), "Origin of risk of animal 2 Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		sexofAnimal2Dropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex of animal 2", "select")), "Sex of animal 2 Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isAnimalsCoveredwithCartDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Animals covered with cart", "select")), "Is Animals covered with cart Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		breedColorOtherMarksofanimal2TextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breed/Color/Other Marks of animal 2", "textarea")), "Breed/Color/Other Marks of animal 2 textarea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//DK

		flockIdentificationNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flock Identification no", "input")), "flock Identification No TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofDuckDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Duck", "select")), "type of Duck Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		breedSpecificationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breed specification", "textarea")), "breed Specification TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageweeksTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (weeks)", "input")), "Age (weeks) TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationBirdTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location where the birds are housed", "textarea")), "Location where the birds are housed TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberofBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Batch", "input")), "Number of Batch TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberofDucksperBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of ducks per batch", "input")), "Number of ducks per batch TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueperBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value per Bird", "input")), "Market value per Bird TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredperBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured per bird", "input")), "Sum insured per bird TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//FC
		surveyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Number","input")), "Survey Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		gATNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("GAT No","input")), "GAT No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameOfTheFlowerTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the flower","input")), "Name of the flower TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		varietyTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Variety","textarea")), "Variety TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		flowerDescriptionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flower Description","textarea")), "Flower Description TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageOfTheFlowerYearsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of the flower(Years)","input")), "Age of the flower(Years) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageOfTheFlowerMonthsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of the flower(Months)","input")), "Age of the flower(Months) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		harvestDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Harvest Date')]/following::input/following::a[@name='firstFocus']"), "Harvest Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		locationDetailsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location details","textarea")), "Location details TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hissaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hissa","input")), "Hissa TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		harvestDateTextField=new PageElement(By.xpath("//td//div[@id='Harvest Date']/following::input"), "Harvest Date", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		riskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Risk Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EP
		riskDetailsForPoultryTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details For Poultry')]"), "Risk Details For Poultry", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		batchNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Batch Number","input")), "Batch Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofPoultryDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Poultry","select")), "Type of Poultry Dropdown",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfBirdDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Bird","select")), "Type of Bird Dropdown",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageBroilersDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Broilers)","select")), "Age Broilers Dropdown",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationWhereTheBirdsAreHousedTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location where the birds are housed","textarea")), "Location where the birds are housed TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberOfBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Batch","input")), "Number of Batch TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberOfBirdsPerBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of birds per batch","input")), "Number of birds per batch TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hatchingDateTextField=new PageElement(By.xpath("//td//div[@id='Hatching Date']/following::input"), "Hatching Date", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hatchingDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Hatching Date')]/following::input/following::a[@name='firstFocus']"), "Hatching Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		expectedDateOfDisposalTextField=new PageElement(By.xpath("//td//div[@id='Expected date of Disposal']/following::input"), "Expected date of Disposal", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		expectedDateOfDisposalFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Expected date of Disposal')]/following::input/following::a[@name='firstFocus']"), "Expected date of Disposal Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		marketValuePerBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value per Bird","input")), "Market value per Bird TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredPerBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured per bird","input")), "Sum insured per bird TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalMarketValueRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Market Value (Rs)","input")), "Total Market Value (Rs) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalSumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured(Rs)","input")), "Total Sum Insured(Rs) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		excessInPercentDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)","select")), "Excess in (%) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ageofBirdInWeeksTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of Bird(In Weeks)","input")), "Age of Bird(In Weeks) TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateInPercentTextField1=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate(In %)", "input")), "Premium Rate(In %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//FA
		riskCoveredTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Risk Covered","textarea")), "Risk Covered TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		optedCoverdetailsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Opted Cover details","TextArea")), "Opted Cover details TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialPerilsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Perils","TextArea")), "Special Perils TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate","input")), "Premium Rate TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumTextField=new PageElement(By.xpath("//td//div[@id='Premium']/following::input[1]"), "Premium", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//GR group
		numberofInsuredPersonsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of insured persons", "input")), "Number of insured persons Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalAreaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Geographical area", "textarea")), "Geographical area Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionofPersonsCoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of persons covered", "textarea")), "Description of persons covered Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageGroupTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age Group", "input")), "Age Group Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerPersonTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured per person", "input")), "Sum insured per person Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assignmentDetailsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assignment details", "textarea")), "Assignment details Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions", "textarea")), "Special Conditions Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//GR Gramin
		nameOfTheinsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the insured", "textarea")), "Name of the insuredText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		addressOfTheInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of the insured", "textarea")), "Address of the insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusoftheInsuredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Status of the Insured","select")), "Status of the Insured Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationGraminDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation(Gramin)","select")), "Occupation(Gramin) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateOfBirthTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth", "input")), "Date of Birth Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfExistingPhysicalDisabilitiesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of existing Physical Disabilities","textarea")), "Details of existing Physical Disabilities Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossAnnualIncomeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Gross Annual income(Rs)", "input")), "Gross Annual income(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Name", "input")), "Nominees Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesAddressTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Address", "textarea")), "Nominees Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipofthenomineewiththeinsuredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of the nominee with the insured","select")), "Relationship of the nominee with the insured Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateofBirthofNomineeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Nominee", "input")), "Date of Birth of Nominee Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexoftheInsuredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex of the Insured","select")), "Sex of the Insured Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		excessInDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)","select")), "Excess in (%) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//GP

		pumpSerialNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pump Serial No.", "input")), "Pump Serial No. Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationofPumpsetTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of Pump set", "input")), "Location of Pump set Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manufacturerDetailsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Manufacturer details", "input")), "Manufacturer details Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfManufacturePumpsetTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of manufacture Pumpset", "input")), "Year of manufacture Pumpset Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		ageofPumpYearsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of pump(years)", "input")), "Age of pump(years) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		manufacturerofSolarPartsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Manufacturer of solar parts", "input")), "Manufacturer of solar parts Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eCNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("EC No.", "input")), "EC No. Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		panelNosTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Panel Nos", "input")), "Panel Nos Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredCentrifugalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Centrifugal)", "input")), "Sum Insured (Centrifugal) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredSubmersibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Submersible)", "input")), "Sum Insured (Submersible) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pumpsetTypeDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pump set Type","select")), "Pump set Type Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeofMotorPumpsetDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Motor Pumpset","select")), "Type of Motor Pumpset Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		horsePowerSDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (S)","select")), "Horse Power (S) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		horsePowerCDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (C)","select")), "Horse Power (C) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		horsePowerDDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (D)","select")), "Horse Power (D) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		horsePowerHDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (HD)","select")), "Horse Power (D) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		floodCoverIsRequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flood cover is required","select")), "Flood cover is required Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		gPsaveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// HB 
		identificationNumberofBeeHiveBeeColonyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Number of Bee Hive / Bee Colony", "input")), "Identification Number of Bee Hive / Bee Colony Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costPerBeeHiveTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost per Bee Hive", "input")), "Cost per Bee Hive Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfBeeHivesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Bee Hives", "input")), "Number of Bee Hives Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costPerBeeColonyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost per Bee Colony", "input")), "Cost per Bee Colony Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfBeeColoniesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Bee Colonies", "input")), "Number of Bee Colonies Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		purposeOfUseHoneyBeeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Purpose of Use(Honey Bee)", "textarea")), "Purpose of Use(Honey Bee) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredHivesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Hives)", "input")), "Sum Insured (Hives) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredColoniesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Colonies)", "input")), "Sum Insured (Colonies) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTotalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Total)", "input")), "Sum Insured (Total) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		typeOfBeeHiveDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type Of Bee Hive","select")), "Type Of Bee Hive Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeofBeeColonyDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Bee Colony","select")), "Type of Bee Colony Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//HD

		typeofRiskHDDropdown = new PageElement(By.xpath("//td//div[@id='Type of Risk(HD)']/following::select"), "Type of Risk(HD)", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		originofrisk = new PageElement(By.xpath("//td//div[@id='Origin of risk']/following::select"), "Origin of risk", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		purposeOfUseHDTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Purpose of Use(HD)", "textarea")), "Purpose Of Use HD Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//HI
		identificationNumberTextField = new PageElement(By.xpath("//td//div[@id='Identification Number']/following::input"), "Identification Number", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		identificationLandmarkdetailsTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification/Landmark details", "textarea")), "Identification/Landmark details Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		OwneroftheHutTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Owner of the Hut", "textarea")), "Owner of the Hut", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsoftheownerTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of the owner", "textarea")), "Details of the owner", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationoftheHutTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of the Hut", "textarea")), "Location of the Hut", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		suminsuredonStructuresRsTextField = new PageElement(By.xpath("//td//div[@id='Sum insured on Structures(Rs)']/following::input"), "Sum insured on Structures(Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		suminsuredonContentsRsTextField = new PageElement(By.xpath("//td//div[@id='Sum insured on Contents(Rs)']/following::input"), "Sum insured on Contents(Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredonthehutRsTextField = new PageElement(By.xpath("//td//div[@id='Sum Insured on the hut (Rs)']/following::input"), "Sum Insured on the hut (Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofConstructionRuralTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Construction (Rural)", "textarea")), "Type of Construction (Rural)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		constructionYearTextField = new PageElement(By.xpath("//td//div[@id='Construction Year']/following::input"), "Construction Year", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		constructionYearFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Construction Year')]/following::input/following::a[@name='firstFocus']"), "Hatching Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//IF
		typeofWaterAreaDropdown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Water Area", "select")), "Type of Water Area Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeofFishDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Fish", "select")), "Type of Fish Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberOfFishPerHectareTextField= new PageElement(By.xpath("//td//div[@id='Number of Fish per Hectare']/following::input"), "Number of Fish per Hectare Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		estimatedWeightOfFishKgperHectareTextField= new PageElement(By.xpath("//td//div[@id='Estimated Weight of Fish(Kg) per Hectare']/following::input"), "Estimated Weight of Fish(Kg) per Hectare Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalEstimatedWeightofFishKgTextField = new PageElement(By.xpath("//td//div[@id='Total Estimated Weight of Fish(Kg)']/following::input"), "Total Estimated Weight of Fish(Kg) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		priceOfFishPerKgTextField = new PageElement(By.xpath("//td//div[@id='Price of Fish per Kg']/following::input"), "Price of Fish per Kg Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sIofPondTankTextField = new PageElement(By.xpath("//td//div[@id='SI of Pond/Tank']/following::input"), "SI of Pond/Tank Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);;

		//GG
		locationOfGobarGasPlantTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of Gobar gas plant", "textarea")), "Location of Gobar gas plant Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		beneficiaryNameTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Beneficiary Name", "textarea")), "Beneficiary Name Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		beneficiaryDetailsTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Beneficiary Details", "textarea")), "Beneficiary Details Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueOfTheDigesterinRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value of the Digester(Rs)", "input")), "Market value of the Digester(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValueOfTheGasHolderinRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value of the Gas Holder(Rs)", "input")), "Market value of the Gas Holder(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costOfConstructioninRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost of construction(Rs)", "input")), "Cost of construction(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValueOfTheplantinRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value of the plant(Rs)", "input")), "Market Value of the plant(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredOfThePlantinRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured of the plant(Rs)", "input")), "Sum Insured of the plant(Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//FW
		hissaNumberTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hissa Number", "textarea")), "Hissa Number Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationOfTheWellTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of the well", "textarea")), "Location of the well Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionOfWellTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of well", "textarea")), "Description of well Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//FP
		descriptionOfTheRiskTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of the Risk", "textarea")), "Description of the Risk Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialExclusionsTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Exclusions", "textarea")), "Special Exclusions Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		subjectToClauseTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject to Clause", "textarea")), "Subject to Clause Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		otherDetailsTariffedPolicyTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Details-Tariffed Policy", "textarea")), "Other Details-Tariffed Policy Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountAmountTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Discount Amount", "input")), "Special Discount Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRateInPercentTextField =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate (%)", "input")), "Premium Rate (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//zi
		typeOfAnimalDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Animal')]/following::select"), "Type of Animal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		locationWhereTheAnimalsAreHousedTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Location where the animals are housed')]/following::textarea"), "Location where the animals are housed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SW
		locationOfProjectTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Location of Project')]/following::textarea"), "Location of Project", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAreaOfTheProjectAcresTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Area of the project')]/following::input"), "Total Area of the project", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		speciesOfSilkWormDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Species of silk worm')]/following::select"), "Species of silk worm", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		raceOfTheSilkWormDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Race of the silk worm')]/following::select"), "Race of the silk worm", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cocoonDisposalDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cocoon Disposal Date')]/following::input"), "Cocoon Disposal Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cocoonDisposalDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Cocoon Disposal Date')]/following::input/following::a[@name='firstFocus']"), "Cocoon Disposal Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sumInsuredPerLayingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured per laying')]/following::input"), "Sum Insured per laying", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfLayingsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Layings')]/following::input"), "Number of Layings", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PG-shruti
		detailsOfRelationshipTextArea=new PageElement(By.xpath("//tr//td//div[contains(text(),'Details of Relationship')]/following::textArea"),"Details of Relationship text area",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PS-Shruti
		manufacturerofSolarPartsTextArea=new PageElement(By.xpath("//td//div[@id='Manufacturer of solar parts']/following::textarea"),"Manufacturer of solar parts text area",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		eCNoTextArea=new PageElement(By.xpath("//td//div[@id='EC No.']/following::textarea"),"EC No. text area",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		panelNosTextArea=new PageElement(By.xpath("//td//div[@id='Panel Nos']/following::textarea"),"Panel Nos text area",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//Mayur- RI
		locationWhereTheAnimalsAreHousedTextArea= new PageElement(By.xpath("//td//div[@id='Location where the animals are housed']/following::textarea"), "Location where the animals are housed", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		numberOfRabbitsPerBatchTextField= new PageElement(By.xpath("//td//div[@id='Number of rabbits per batch']/following::input"), "Number of rabbits per batch", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValuePerAnimalTextField= new PageElement(By.xpath("//td//div[@id='Market value per animal']/following::input"), "Market value per animal", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredPerAnimalTextField= new PageElement(By.xpath("//td//div[@id='Sum insured per animal']/following::input"), "Sum insured per animal", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Mayur- SG
		typeOfRiskForSheepAndGoatDropDown= new PageElement(By.xpath("//td//div[@id='Type of Risk For Sheep and Goat']/following::select"), "Number of rabbits per batch", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		purposeOfUseSheepAndGoatTextArea= new PageElement(By.xpath("//td//div[@id='Purpose of Use(Sheep and Goat)']/following::textarea"), "Purpose of Use(Sheep and Goat)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		registrationNoTextField= new PageElement(By.xpath("//td//div[@id='Registration No']/following::input"), "Registration No", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfWaterStorageTankTextArea= new PageElement(By.xpath("//td//div[@id='Details of water storage tank']/following::textarea"), "Details of water storage tank", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfPipelinesTextArea= new PageElement(By.xpath("//td//div[@id='Details of pipelines']/following::textarea"), "Details of pipelines", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfCablesTextAreaTextArea= new PageElement(By.xpath("//td//div[@id='Details of cables']/following::textarea"), "Details of cables", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfSwitchesTextArea= new PageElement(By.xpath("//td//div[@id='Details of switches']/following::textarea"), "Details of switches", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfGearsTextArea= new PageElement(By.xpath("//td//div[@id='Details of gears']/following::textarea"), "Details of gears", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfStartersTextArea= new PageElement(By.xpath("//td//div[@id='Details of starters']/following::textarea"), "Details of starters", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfElectricMotorsTextArea= new PageElement(By.xpath("//td//div[@id='Details of electric motors']/following::textarea"), "Details of electric motors", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfElectricValvesTextArea= new PageElement(By.xpath("//td//div[@id='Details of electric valves']/following::textarea"), "Details of electric valves", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredOfLiftIrrigationSystemTextField= new PageElement(By.xpath("//td//div[@id='Sum Insured(Rs) of lift irrigation system']/following::input"), "Sum Insured(Rs) of lift irrigation system", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		excessinPercentageDropDown= new PageElement(By.xpath("//td//div[@id='Excess in (%)']/following::select"), "Excess in (%)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//CHINTAN
		locationDetailsForLITextArea= new PageElement(By.xpath("//td//div[@id='Location Details For LI']/following::textarea"), "Location Details For LI", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionOfLiftIrrigationTextArea= new PageElement(By.xpath("//td//div[@id='Description of lift irrigation']/following::textarea"), "Description of lift irrigation", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionOfDeliverychamberTextArea= new PageElement(By.xpath("//td//div[@id='Description of Delivery chamber']/following::textarea"), "Description of Delivery chamber", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfjackwellTextArea= new PageElement(By.xpath("//td//div[@id='Details of jack well']/following::textarea"), "Details of jack well", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfPumpTextArea= new PageElement(By.xpath("//td//div[@id='Details of pump']/following::textarea"), "Details of pump", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsOfPumpHouseTextArea= new PageElement(By.xpath("//td//div[@id='Details of pump House']/following::textarea"), "Details of pump House", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//YJ
		sumInsuredDropDown=new PageElement(By.xpath("//td//div[@id='Sum Insured (rupees)']/following::select"),"Sum Insured (rupees)", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//Zp
		locationOfStableTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of Stable", "input")), "Location of Stable Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//YG-Amit
		nameOfTheinsuredTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the insured", "textarea")), "Name of the insuredText Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		addressOfTheInsuredTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of the insured", "textarea")), "Address of the insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfExistingPhysicalDisabilitiesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of existing Physical Disabilities","textarea")), "Details of existing Physical Disabilities Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nomineesAddressTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Address", "textarea")), "Nominees Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//
		exceesInDropdownYI=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)","select")), "Excess in (%) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//YB
		ageHatcheryDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Hatchery)", "select")), "Age (Hatchery) Dropdown", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageLayersDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Layers)", "select")), "Age(Layers) Dropdown", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//RI
		identificationMarkDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification mark", "select")), "identification Mark Dropdown", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purposeofUseRITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Purpose of use(RI)", "textarea")), "Purpose of Use RI TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageInYearsRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age in Years", "input")), "age In Years RI TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//SW-Amit
		lotNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Lot Number", "input")), "LotNumberTextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		surveyRevenueNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Revenue Number", "input")), "SurveyRevenueNumberTextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purchaseDateTextField=new PageElement(By.xpath("//td//div[@id='Purchase Date']/following::input"), "Purchase Date", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purchaseDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Purchase Date')]/following::input/following::a[@name='firstFocus']"), "Purchase Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//FE
		sumInsuredDwellingUnitRsTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured on the dwelling unit (Rs)","input")), "Sum insured on the dwelling unit (Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isSpecialDiscountApplicableDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is special discount applicable","select")), "Is special discount applicable Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredContentsRsTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured on the contents (Rs)","input")), "Sum insured on the contents (Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialDiscountInPercentTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Discount (%)","input")), "Special Discount (%)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//YR
		typeOfCropDropDown=new PageElement(By.xpath("//td//div[@id='Type of Crop']/following::select"), "Type of Crop", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameOfCropHCDropDown=new PageElement(By.xpath("//td//div[@id='Name Of Crop (HC)']/following::select"), "Name Of Crop (HC)", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		lossesDueToUnseasonalRainsAndFrostDropDown=new PageElement(By.xpath("//td//div[@id='Losses due to Unseasonal Rains and Frost']/following::select"), "Losses due to Unseasonal Rains and Frost", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		cropDescriptionTextArea=new PageElement(By.xpath("//td//div[@id='Crop Description']/following::textarea"), "Crop Description", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageOfTheCropYearsTextField= new PageElement(By.xpath("//td//div[@id='Age of the crop (Years)']/following::input"), "Age of the crop (Years)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageOfTheCropMonthsTextField= new PageElement(By.xpath("//td//div[@id='Age of the crop (Months)']/following::input"), "Age of the crop (Months)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		locationYRTextArea=new PageElement(By.xpath("//td//div[@id='Location']/following::textarea"), "Location", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		areaUnderCropHectareTextField= new PageElement(By.xpath("//td//div[@id='Area under Crop(Hectare)']/following::input"), "Area under Crop(Hectare)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		areaCoveredForInsuranceHectareTextField= new PageElement(By.xpath("//td//div[@id='Area Covered for Insurance(Hectare)']/following::input"), "Area Covered for Insurance(Hectare)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfPlantsHectareTextField= new PageElement(By.xpath("//td//div[@id='No Of Plants/Hectare']/following::input"), "No Of Plants/Hectare", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sIPerPlantRsTextField= new PageElement(By.xpath("//td//div[@id='SI Per Plant(Rs)']/following::input"), "SI Per Plant(Rs)", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isHOApprovalIsObtainedDropDown=new PageElement(By.xpath("//td//div[@id='Is HO Approval is Obtained']/following::select"), "Is HO Approval is Obtained", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameofownerTextArea=new PageElement(By.xpath("//td//div[@id='Name of owner']/following::textarea"), "Name of owner", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressoftheownerTextArea=new PageElement(By.xpath("//td//div[@id='Address of the owner']/following::textarea"), "Address of the owner", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredJNDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Rupees)", "select")), "Sum Insured (Rupees) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//UC
		tagNumOfRecipientCowTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number of Recipient Cow", "input")), "Tag NumberText Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionTextArea= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number of Recipient Cow", "textarea")), "description", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		surveyNoTextField=new PageElement(By.xpath("//td//div[@id='Survey No']/following::input"),"Survey No",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		TypeofriskforfoetusDropDown =new PageElement(By.xpath("//td//div[@id='Type of risk for foetus']/following::select[1]"),"Type of Risk for foetus",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		TechnologyusedTextField = new PageElement(By.xpath("//td//div[@id='Technology used']/following::input[1]"),"Technology used",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//ky
		noOfcardholderTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. Of card holder", "input")), "No. Of card holder Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		definitionofGroupITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Definition of GroupI", "textarea")), "Definition of GroupI", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		definitionofGroupIITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Definition of GroupII", "textarea")), "Definition of GroupII", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredperCardholderDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured per Card holder", "select")), "Sum Insured per Card holder Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		bankersBranchTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Bankers Branch", "textarea")), "Bankers Branch", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		excessTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess.", "textarea")), "Excess.", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		termsAndConditionsITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Terms & Conditions I", "textarea")), "Terms & Conditions I", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		termsAndConditionsIITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Terms & Conditions II", "textarea")), "Terms & Conditions II", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalPremiumTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Premium", "input")), "Total Premium Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		totalSumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured(Rs)", "input")), "Total Sum Insured(Rs) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameoftheCardHolderTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Card Holder", "input")), "Name of the Card Holder Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		addressoftheCardHolderTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of the Card Holder", "textarea")), "Address of the Card Holder", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		statusoftheCardHolderDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Status of the Card Holder", "select")), "Status of the Card Holder", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		occupationKisanDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation (Kisan)", "select")), "Occupation (Kisan) dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		dateofBirthTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth", "input")), "Date of Birth Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationshipofthenomineewiththeinsuredKisanDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of the nominee with the insured (Kisan)", "select")), "Relationship of the nominee with the insured (Kisan) dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		creditCardNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Credit Card Number", "input")), "Credit Card Number Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredKisanDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Kisan)", "select")), "Sum Insured (Kisan) Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	
	//YP
		horsePowerHSDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (HS)","select")), "Horse Power (HS) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		horsePowerHCDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power (HC)","select")), "Horse Power (HC) Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	
	//JP
		sumInsuredJPDropDown=new PageElement(By.xpath("//td//div[@id='Sum Insured (Rupees)']/following::select"),"Sum Insured (rupees)", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}

	public void fillPolicyInsuredInterestAttributeRiskDetail1Rural(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntity ,CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("add") || polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumber")) {
				clearAndSendKeys(tagNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOriginOfRiskDropdown")) {
				selectValueFromList(originOfRiskDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OriginOfRiskDropdown"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOftheAnimal")) {
				clearAndSendKey(detailsOftheAnimalTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOftheAnimal"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexDropDownList")) {
				selectValueFromList(sexDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexDropDownList"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedColorOtherMarks")) {
				clearAndSendKeys(breedColorOtherMarksTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedColorOtherMarks"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeYear")) {
				clearAndSendKeys(ageYearTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeYear"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeINYear")) {
				clearAndSendKeys(ageINYearTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeINYear"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeMonth")) {
				clearAndSendKey(ageMonthTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeMonth"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseNewTextArea")) {
				clearAndSendKey(purposeOfUseNewTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseNewTextArea"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseCattleTextArea")) {
				clearAndSendKeys(purposeofUsecattleTextarea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseCattle"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValue")) {
				clearAndSendKeys(marketValueTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValue"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKey(sumInsuredTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExceesInDropdown")) {
				selectValueFromList(exceesInDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExceesInDropdown"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfOwnerBeneficiary")) {
				clearAndSendKeys(nameOfOwnerBeneficiaryTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfOwnerBeneficiary"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfOwnerBeneficiary")) {
				clearAndSendKeys(addressOfOwnerBeneficiaryTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfOwnerBeneficiary"));
			}
			

			//BW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPondNumber")) {
				clearAndSendKeys(pondNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PondNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPondSpecification")) {
				clearAndSendKeys(pondSpecificationTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PondSpecification"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsFloodProneAreaDropdown")) {
				selectValueFromList(isFloodProneAreaDropdownDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsFloodProneAreaDropdown"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalWaterAreaHectare")) {
				clearAndSendKeys(totalWaterAreaHectareTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalWaterAreaHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofPrawn")) {
				clearAndSendKeys(typeofPrawnTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofPrawn"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfPrawnPerHectare")) {
				clearAndSendKeys(numberOfPrawnPerHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfPrawnPerHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurvivalRate")) {
				clearAndSendKeys(survivalRateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurvivalRate"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDateOfPurchase")) {
				click(dateOfPurchaseFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfPurchaseTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateOfPurchase"));
				switchToFrame("display");
				/*String dateOfPurchase=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateOfPurchase"));
				clearAndEnterDate(dateOfPurchaseTextField, dateOfPurchase);*/
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStockingDate")) {
				click(stockingDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(stockingDateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("StockingDate"));
				switchToFrame("display");
				/*String stockingDate=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("StockingDate"));
				clearAndEnterDate(stockingDateFindButton, stockingDate);*/
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeDay")) {
				clearAndSendKeys(ageDayTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeDay"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSourceOfPurchase")) {
				clearAndSendKeys(sourceOfPurchaseTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SourceOfPurchase"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEstimatedWeightOfPrawnKgperHectare")) {
				clearAndSendKeys(estimatedWeightOfPrawnKgperHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("EstimatedWeightOfPrawnKgperHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPriceOfPrawnPerKg")) {
				clearAndSendKeys(priceOfPrawnPerKgTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PriceOfPrawnPerKg"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCropPeriodMonths")) {
				clearAndSendKeys(cropPeriodMonthsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CropPeriodMonths"));
			}
			//CI
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfCalf")) {
				selectValueFromList(typeOfCalfDropDownList, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfCalf"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfRiskForCattle")) {
				if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")) {
					selectValueFromList(typeOfRiskForCattleTextFieldForRural, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForCattle"));

				}
				else {
				clearAndSendKeys(typeOfRiskForCattleTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForCattle"));
			}
			}


			// DC
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationLicenseNumber")) {
				clearAndSendKeys(identificationLicenseNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationLicenseNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueofCartRs")) {
				clearAndSendKeys(marketValueofCartRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueofCartRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredofCartRS")) {
				clearAndSendKeys(sumInsuredofCartRSTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredofCartRS"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumberofAnimal1")) {
				clearAndSendKeys(tagNumberofAnimal1TextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumberofAnimal1"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumberofAnimal2")) {
				clearAndSendKeys(tagNumberofAnimal2TextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumberofAnimal2"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueoftheAnimalRs")) {
				clearAndSendKeys(marketValueoftheAnimalRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueoftheAnimalRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredoftheAnimalRs")) {
				clearAndSendKeys(sumInsuredoftheAnimalRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredoftheAnimalRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueoftheAnimal2Rs")) {
				clearAndSendKeys(marketValueoftheAnimal2RsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueoftheAnimal2Rs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredofAnimal2Rs")) {
				clearAndSendKeys(sumInsuredofAnimal2RsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredofAnimal2Rs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofCart")) {
				selectValueFromList(typeofCartDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofCart"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigYearofMake")) {
				selectValueFromList(yearofMakeDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("YearofMake"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofTyre")) {
				selectValueFromList(typeofTyreDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofTyre"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsAnimalsCoveredwithCart")) {
				selectValueFromList(isAnimalsCoveredwithCartDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsAnimalsCoveredwithCart"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOriginofriskofAnimal2")) {
				selectValueFromList(originofriskofAnimal2Dropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OriginofriskofAnimal2"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexofAnimal2")) {
				selectValueFromList(sexofAnimal2Dropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexofAnimal2"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedColorOtherMarksofAnimal2")) {
				clearAndSendKeys(breedColorOtherMarksofanimal2TextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedColorOtherMarksofAnimal2"));
			}
			//DG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigName")) {
				clearAndSendKeys(nameTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Name"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationType")) {
				selectValueFromList(identificationTypeDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationType"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocation")) {
				clearAndSendKeys(locationTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Location"));
			}

			//FC
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyNumber")) {
				clearAndSendKeys(surveyNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGATNo")) {
				clearAndSendKeys(gATNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("GATNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheFlower")) {
				clearAndSendKeys(nameOfTheFlowerTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheFlower"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigVariety")) {
				clearAndSendKeys(varietyTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Variety"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFlowerDescription")) {
				clearAndSendKeys(flowerDescriptionTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("FlowerDescription"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheFlowerYears")) {
				clearAndSendKeys(ageOfTheFlowerYearsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheFlowerYears"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheFlowerMonths")) {
				clearAndSendKeys(ageOfTheFlowerMonthsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheFlowerMonths"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationDetails")) {
				clearAndSendKeys(locationDetailsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationDetails"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHarvestDate")) {
				click(harvestDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(harvestDateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HarvestDate"));
				switchToFrame("display");
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHissa")) {
				clearAndSendKeys(hissaTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Hissa"));
			}
			//EP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBatchNumber")) {
				clearAndSendKeys(batchNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BatchNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofPoultry")) {
				selectValueFromList(typeofPoultryDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofPoultry"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfBird")) {
				selectValueFromList(typeOfBirdDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfBird"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeBroilers")) {
				selectValueFromList(ageBroilersDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeBroilers"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationWhereTheBirdsAreHoused")) {
				clearAndSendKeys(locationWhereTheBirdsAreHousedTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationWhereTheBirdsAreHoused"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBatch")) {
				clearAndSendKeys(numberOfBatchTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBatch"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBirdsPerBatch")) {
				clearAndSendKeys(numberOfBirdsPerBatchTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBirdsPerBatch"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHatchingDate")) {
				click(hatchingDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(hatchingDateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HatchingDate"));
				switchToFrame("display");
				/*String hatchingDate=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HatchingDate"));
				clearAndEnterDate(hatchingDateTextField, hatchingDate);*/
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExpectedDateOfDisposal")) {
				click(expectedDateOfDisposalFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(expectedDateOfDisposalTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExpectedDateOfDisposal"));
				switchToFrame("display");
				/*String expectedDateOfDisposal=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExpectedDateOfDisposal"));
				clearAndEnterDate(expectedDateOfDisposalTextField, expectedDateOfDisposal);*/
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeofBirdInWeeks")) {
				clearAndSendKeys(ageofBirdInWeeksTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeofBirdInWeeks"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPremiumRateInPercentOne")) {
				clearAndSendKeys(premiumRateInPercentTextField1, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PremiumRateInPercentOne"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValuePerBird")) {
				clearAndSendKeys(marketValuePerBirdTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValuePerBird"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerBird")) {
				clearAndSendKeys(sumInsuredPerBirdTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerBird"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInPercent")) {
				selectValueFromList(excessInPercentDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInPercent"));
			}


			//FA
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRiskCovered")) {
				clearAndSendKeys(riskCoveredTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("RiskCovered"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOptedCoverdetails")) {
				clearAndSendKeys(optedCoverdetailsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OptedCoverdetails"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				clearAndSendKeys(specialPerilsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialPerils"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PremiumRate"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				clearAndSendKeys(sumInsuredRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRs"));		}
			//DK
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				clearAndSendKeys(flockIdentificationNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("FlockIdentificationNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				selectValueFromList(typeofDuckDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofDuck"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedSpecification")) {
				clearAndSendKeys(breedSpecificationTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedSpecification"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationBird")) {
				clearAndSendKeys(locationBirdTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationBird"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofBatchofDuck")) {
				clearAndSendKeys(numberofBatchTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofBatchofDuck"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofDucksperBatch")) {
				clearAndSendKeys(numberofDucksperBatchTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofDucksperBatch"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueperDuckBird")) {
				clearAndSendKeys(marketValueperBirdTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueperDuckBird"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredperDuckBird")) {
				clearAndSendKeys(sumInsuredperBirdTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredperDuckBird"));
				if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("DK")||polInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("YD")){
					clickTabButton(sumInsuredperBirdTextField);
					try{
						acceptAlertAndReturnConfirmationMessage();
					}
					catch (Exception e){

					}
					switchToFrame("display");
					clearAndSendKeys(sumInsuredperBirdTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredperDuckBird"));
				}
			}
			//GR group
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofInsuredPersons")) {
				clearAndSendKeys(numberofInsuredPersonsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofInsuredPersons"));
				Thread.sleep(1000);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGeographicalArea")) {
				clearAndSendKeys(geographicalAreaTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("GeographicalArea"));
				Thread.sleep(1000);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionofPersonsCovered")) {
				clearAndSendKeys(descriptionofPersonsCoveredTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionofPersonsCovered"));
				Thread.sleep(1000);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeGroup")) {
				clearAndSendKeys(ageGroupTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeGroup"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAssignmentDetails")) {
				clearAndSendKeys(assignmentDetailsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AssignmentDetails"));
				Thread.sleep(1000);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialConditions"));
				Thread.sleep(1000);
			}
			// GR Gramin
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheinsured")) {
				clearAndSendKeys(nameOfTheinsuredTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheinsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfTheInsured")) {
				clearAndSendKeys(addressOfTheInsuredTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfTheInsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStatusoftheInsured")) {
				selectValueFromList(statusoftheInsuredDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("StatusoftheInsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOccupationGramin")) {
				selectValueFromList(occupationGraminDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OccupationGramin"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofMember")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofMember"));
				clearAndEnterDate(dateOfBirthTextField, DOBofMember);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilities")) {
				clearAndSendKeys(detailsOfExistingPhysicalDisabilitiesTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilities"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGrossAnnualIncome")) {
				clearAndSendKeys(grossAnnualIncomeTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("GrossAnnualIncome"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesName")) {
				clearAndSendKeys(nomineesNameTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesName"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesAddress")) {
				clearAndSendKeys(nomineesAddressTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesAddress"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationshipofthenomineewiththeinsured")) {
				selectValueFromList(relationshipofthenomineewiththeinsuredDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Relationshipofthenomineewiththeinsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofNominee")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofNominee"));
				clearAndEnterDate(dateOfBirthTextField, DOBofMember);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexoftheInsured")) {
				selectValueFromList(sexoftheInsuredDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexoftheInsured"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessIn")) {
				selectValueFromList(excessInDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessIn"));
			}

			//GP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPumpSerialNo")) {
				clearAndSendKeys(pumpSerialNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PumpSerialNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationofPumpset")) {
				clearAndSendKeys(locationofPumpsetTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationofPumpset"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerDetails")) {
				clearAndSendKeys(manufacturerDetailsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerDetails"));
			}
		/*	if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerofSolarParts")) {
				clearAndSendKeys(manufacturerofSolarPartsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerofSolarParts"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigECNo")) {
				clearAndSendKeys(eCNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ECNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPanelNos")) {
				clearAndSendKeys(panelNosTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PanelNos"));
			} */

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPumpsetType")) {
				selectValueFromList(pumpsetTypeDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PumpsetType"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofMotorPumpset")) {
				selectValueFromList(typeofMotorPumpsetDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofMotorPumpset"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigYearofManufacturePumpset")) {
				clearAndSendKeys(yearOfManufacturePumpsetTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("YearofManufacturePumpset"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerC")) {
				selectValueFromList(horsePowerCDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerC"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerD")) {
				selectValueFromList(horsePowerDDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerD"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerS")) {
				selectValueFromList(horsePowerSDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerS"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHD")) {
				selectValueFromList(horsePowerHDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHD"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFloodCoverIsRequired")) {
				selectValueFromList(floodCoverIsRequiredDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("FloodCoverIsRequired"));
			}
			
			
			
			
			
			
			// HB
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationNumberofBeeHiveBeeColony")) {
				clearAndSendKeys(identificationNumberofBeeHiveBeeColonyTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationNumberofBeeHiveBeeColony"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfBeeHive")) {
				selectValueFromList(typeOfBeeHiveDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfBeeHive"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostPerBeeHive")) {
				clearAndSendKeys(costPerBeeHiveTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostPerBeeHive"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBeeHives")) {
				clearAndSendKeys(numberOfBeeHivesTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBeeHives"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofBeeColony")) {
				selectValueFromList(typeofBeeColonyDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofBeeColony"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostPerBeeColony")) {
				clearAndSendKeys(costPerBeeColonyTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostPerBeeColony"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBeeColonies")) {
				clearAndSendKeys(numberOfBeeColoniesTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBeeColonies"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseHoneyBee")) {
				clearAndSendKeys(purposeOfUseHoneyBeeTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseHoneyBee"));
			}

			//HD
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofRiskHD")) {
				selectValueFromList(typeofRiskHDDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofRiskHD"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseHD")) {
				clearAndSendKeys(purposeOfUseHDTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseHD"));
			}
			//HI

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationNumber")) {
				clearAndSendKeys(identificationNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationNumber"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationLandmarkDetails")) {
				clearAndSendKeys(identificationLandmarkdetailsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationLandmarkDetails"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOwneroftheHut")) {
				clearAndSendKeys(OwneroftheHutTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OwneroftheHut"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsoftheOwner")) {
				clearAndSendKeys(detailsoftheownerTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsoftheOwner"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationoftheHut")) {
				clearAndSendKeys(locationoftheHutTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationoftheHut"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOnStructuresRs")) {
				clearAndSendKeys(suminsuredonStructuresRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOnStructuresRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSuminsuredonContentsRs")) {
				clearAndSendKeys(suminsuredonContentsRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SuminsuredonContentsRs"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredonthehutRs")) {
				clearAndSendKeys(sumInsuredonthehutRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredonthehutRs"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofConstructionRural")) {
				clearAndSendKeys(typeofConstructionRuralTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofConstructionRural"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigConstructionYear")) {
				click(constructionYearFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(constructionYearTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ConstructionYear"));
				switchToFrame("display");
			}

			// IF
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofWaterArea")) {
				selectValueFromList(typeofWaterAreaDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofWaterArea"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofFish")) {
				selectValueFromList(typeofFishDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofFish"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfFishPerHectare")) {
				clearAndSendKeys(numberOfFishPerHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("numberOfFishPerHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEstimatedWeightOfFishKgperHectare")) {
				clearAndSendKeys(estimatedWeightOfFishKgperHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("EstimatedWeightOfFishKgperHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalEstimatedWeightofFishKg")) {
				clearAndSendKeys(totalEstimatedWeightofFishKgTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalEstimatedWeightofFishKg"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPriceOfFishPerKg")) {
				clearAndSendKeys(priceOfFishPerKgTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PriceOfFishPerKg"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSIofPondTank")) {
				clearAndSendKeys(sIofPondTankTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SIofPondTank"));
			}

			//GG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfGobarGasPlant")) {
				clearAndSendKeys(locationOfGobarGasPlantTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfGobarGasPlant"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBeneficiaryName")) {
				clearAndSendKeys(beneficiaryNameTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BeneficiaryName"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBeneficiaryDetails")) {
				clearAndSendKeys(beneficiaryDetailsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BeneficiaryDetails"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheDigesterinRs")) {
				clearAndSendKeys(marketValueOfTheDigesterinRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheDigesterinRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheGasHolderinRs")) {
				clearAndSendKeys(marketValueOfTheGasHolderinRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheGasHolderinRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostOfConstructioninRs")) {
				clearAndSendKeys(costOfConstructioninRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostOfConstructioninRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheplantinRs")) {
				clearAndSendKeys(marketValueOfTheplantinRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheplantinRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOfThePlantinRs")) {
				clearAndSendKeys(sumInsuredOfThePlantinRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOfThePlantinRs"));
			}

			//FW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHissaNumber")) {
				clearAndSendKeys(hissaNumberTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("HissaNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfTheWell")) {
				clearAndSendKeys(locationOfTheWellTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfTheWell"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfWell")) {
				clearAndSendKeys(descriptionOfWellTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfWell"));
			}

			//FP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				clearAndSendKeys(descriptionOfTheRiskTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfTheRisk"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				clearAndSendKeys(specialExclusionsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialExclusions"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				clearAndSendKeys(subjectToClauseTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SubjectToClause"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOtherDetailsTariffedPolicy")) {
				clearAndSendKeys(otherDetailsTariffedPolicyTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OtherDetailsTariffedPolicy"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialDiscountAmount")) {
				clearAndSendKeys(specialDiscountAmountTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialDiscountAmount"));
			}

			//zi
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfAnimal")) {
				selectValueFromList(typeOfAnimalDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfAnimal"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationWhereTheAnimalsAreHoused")) {
				clearAndSendKeys(locationWhereTheAnimalsAreHousedTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationWhereTheAnimalsAreHoused"));
			}
			//sw

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfProject")) {
				clearAndSendKeys(locationOfProjectTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfProject"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalAreaOfTheProjectAcres")) {
				clearAndSendKeys(totalAreaOfTheProjectAcresTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalAreaOfTheProjectAcres"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpeciesOfSilkWorm")) {
				selectValueFromList(speciesOfSilkWormDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpeciesOfSilkWorm"));
			}
			//Mayur-RI

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfRabbitsPerBatch")) {
				clearAndSendKeys(numberOfRabbitsPerBatchTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfRabbitsPerBatch"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValuePerAnimal")) {
				clearAndSendKeys(marketValuePerAnimalTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValuePerAnimal"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerAnimal")) {
				clearAndSendKeys(sumInsuredPerAnimalTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerAnimal"));
			}
			//Mayur-SG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfRiskForSheepAndGoat")) {
				selectValueFromList(typeOfRiskForSheepAndGoatDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForSheepAndGoat"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseSheepAndGoat")) {
				clearAndSendKeys(purposeOfUseSheepAndGoatTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseSheepAndGoat"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRegistrationNo")) {
				clearAndSendKeys(registrationNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("RegistrationNo"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRaceOfTheSilkWorm")) {
				selectValueFromList(raceOfTheSilkWormDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("RaceOfTheSilkWorm"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPipelines")) {
				clearAndSendKeys(detailsOfPipelinesTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPipelines"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCocoonDisposalDate")) {
				String dateOfCocoonDisposal=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CocoonDisposalDate"));
				clearAndEnterDate(cocoonDisposalDateTextField, dateOfCocoonDisposal);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfLayings")) {
				clearAndSendKeys(numberOfLayingsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfLayings"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerLaying")) {
				clearAndSendKeys(sumInsuredPerLayingTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerLaying"));
			}
			//PG-Shruti

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfRelationship")) {
				clearAndSendKeys(detailsOfRelationshipTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfRelationship"));
			}
			//PS-Shruti

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerofSolarParts")) {
				clearAndSendKeys(manufacturerofSolarPartsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerofSolarParts"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigECNo")) {
				clearAndSendKeys(eCNoTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ECNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPanelNos")) {
				clearAndSendKeys(panelNosTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PanelNos"));
			}
			//CHINTAN
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationDetailsForLI")) {
				clearAndSendKeys(locationDetailsForLITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationDetailsForLI"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfLiftIrrigation")) {
				clearAndSendKeys(descriptionOfLiftIrrigationTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfLiftIrrigation"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfDeliverychamber")) {
				clearAndSendKeys(descriptionOfDeliverychamberTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfDeliverychamber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfjackwell")) {
				clearAndSendKeys(detailsOfjackwellTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfjackwell"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPump")) {
				clearAndSendKeys(detailsOfPumpTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPump"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPumpHouse")) {
				clearAndSendKeys(detailsOfPumpHouseTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPumpHouse"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfWaterStorageTank")) {
				clearAndSendKeys(detailsOfWaterStorageTankTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfWaterStorageTank"));
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfCables")) {
				clearAndSendKeys(detailsOfCablesTextAreaTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfCables"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfSwitches")) {
				clearAndSendKeys(detailsOfSwitchesTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfSwitches"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfGears")) {
				clearAndSendKeys(detailsOfGearsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfGears"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfStarters")) {
				clearAndSendKeys(detailsOfStartersTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfStarters"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfElectricMotors")) {
				clearAndSendKeys(detailsOfElectricMotorsTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfElectricMotors"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfElectricValves")) {
				clearAndSendKeys(detailsOfElectricValvesTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfElectricValves"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOfLiftIrrigationSystem")) {
				clearAndSendKeys(sumInsuredOfLiftIrrigationSystemTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOfLiftIrrigationSystem"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessinPercentage")) {
				selectValueFromList(excessinPercentageDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessinPercentage"));
			}

			//YJ
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupees")) {
				selectValueFromList(sumInsuredDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupees"));
			}

			//Zp
			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfStable")) {
					clearAndSendKeys(locationOfStableTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfStable"));
				}
				//YB
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeHatchery")) {
					selectValueFromList(ageHatcheryDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeHatchery"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeLayers")) {
					selectValueFromList(ageLayersDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeLayers"));
				}
			}

			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfStable")) {
					clearAndSendKeys(locationOfStableTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfStable"));
				}
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheinsuredYG")) {
				clearAndSendKeys(nameOfTheinsuredTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheinsuredYG"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfTheInsuredYG")) {
				clearAndSendKeys(addressOfTheInsuredTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfTheInsuredYG"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilitiesYG")) {
				clearAndSendKeys(detailsOfExistingPhysicalDisabilitiesTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilitiesYG"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesAddressYG")) {
				clearAndSendKeys(nomineesAddressTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesAddressYG"));
			}
			//YI
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExceesInDropdownYI")) {
				selectValueFromList(exceesInDropdownYI, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExceesInDropdownYI"));
			}

			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationMark")) {
					selectValueFromList(identificationMarkDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationMark"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeofUseRI")) {
					clearAndSendKeys(purposeofUseRITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeofUseRI"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeInYearsRI")) {
					clearAndSendKeys(ageInYearsRITextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeInYearsRI"));
				}
				//FE
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredDwellingUnitRs")) {
					clearAndSendKeys(sumInsuredDwellingUnitRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredDwellingUnitRs"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsSpecialDiscountApplicable")) {
					selectValueFromList(isSpecialDiscountApplicableDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsSpecialDiscountApplicable"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredContentsRsFE")) {
					clearAndSendKeys(sumInsuredContentsRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredContentsRsFE"));
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofNomineeFE")) {
					String DOBofMemberFE=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofNomineeFE"));
					clearAndEnterDate(dateofBirthofNomineeTextField, DOBofMemberFE);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialDiscountInPercentFE")) {
					clearAndSendKeys(specialDiscountInPercentTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialDiscountInPercentFE"));
				}
			}

			//SW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLotNumber")) {
				clearAndSendKeys(lotNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LotNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyRevenueNumber")) {
				clearAndSendKeys(surveyRevenueNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyRevenueNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurchaseDate")) {
				click(purchaseDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(purchaseDateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurchaseDate"));
				switchToFrame("display");
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCocoonDisposalDate")) {
				click(cocoonDisposalDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(cocoonDisposalDateTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CocoonDisposalDate"));
				switchToFrame("display");
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeDayForCALF")) {
				clearAndSendKeys(ageDayForCALFTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeDayForCALF"));
			}

			//YR

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfCrop")) {
				selectValueFromList(typeOfCropDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfCrop"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfCropHC")) {
				selectValueFromList(nameOfCropHCDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfCropHC"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLossesDueToUnseasonalRainsandFrost")) {
				selectValueFromList(lossesDueToUnseasonalRainsAndFrostDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LossesDueToUnseasonalRainsandFrost"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheCropYears")) {
				clearAndSendKeys(ageOfTheCropYearsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheCropYears"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheCropMonths")) {
				clearAndSendKeys(ageOfTheCropMonthsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheCropMonths"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationYR")) {
				clearAndSendKeys(locationYRTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationYR"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAreaUnderCropHectare")) {
				clearAndSendKeys(areaUnderCropHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AreaUnderCropHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAreaCoveredForInsuranceHectare")) {
				clearAndSendKeys(areaCoveredForInsuranceHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AreaCoveredForInsuranceHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNoOfPlantsHectare")) {
				clearAndSendKeys(noOfPlantsHectareTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NoOfPlantsHectare"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSIPerPlantRs")) {
				clearAndSendKeys(sIPerPlantRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SIPerPlantRs"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				selectValueFromList(isHOApprovalIsObtainedDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsHOApprovalIsObtained"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameofowner")) {
				clearAndSendKeys(nameofownerTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Nameofowner"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressoftheowner")) {
				clearAndSendKeys(addressoftheownerTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Addressoftheowner"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupeesJN")) {
				selectValueFromList(sumInsuredJNDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupeesJN"));
			}
			//UC
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumOfRecipientCow")) {
				clearAndSendKeys(tagNumOfRecipientCowTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumOfRecipientCow"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofriskforfoetus")) {
				selectValueFromList(TypeofriskforfoetusDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Typeofriskforfoetus"));
			}
			
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTechnologyused")) {
				clearAndSendKeys(TechnologyusedTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Technologyused"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Description"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyNo")) {
				clearAndSendKeys(surveyNoTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyNo"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCropDescription")) {
				clearAndSendKeys(cropDescriptionTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CropDescription"));
			}
			//KY
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNoOfcardholder")) {
				clearAndSendKeys(noOfcardholderTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NoOfcardholder"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDefinitionofGroupI")) {
				clearAndSendKeys(definitionofGroupITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DefinitionofGroupI"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDefinitionofGroupII")) {
				clearAndSendKeys(definitionofGroupIITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DefinitionofGroupII"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredperCardholder")) {
				selectValueFromList(sumInsuredperCardholderDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredperCardholder"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBankersBranch")) {
				clearAndSendKeys(bankersBranchTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("BankersBranch"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("Excess"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTermsAndConditionsI")) {
				clearAndSendKeys(termsAndConditionsITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TermsAndConditionsI"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTermsAndConditionsII")) {
				clearAndSendKeys(termsAndConditionsIITextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TermsAndConditionsII"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalPremium")) {
				clearAndSendKeys(totalPremiumTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalPremium"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalSumInsuredRsMP")) {
				clearAndSendKeys(totalSumInsuredRsTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalSumInsuredRsMP"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameoftheCardHolder")) {
				clearAndSendKeys(nameoftheCardHolderTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameoftheCardHolder"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressoftheCardHolder")) {
				clearAndSendKeys(addressoftheCardHolderTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressoftheCardHolder"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStatusoftheCardHolder")) {
				selectValueFromList(statusoftheCardHolderDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("StatusoftheCardHolder"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOccupationKisan")) {
				selectValueFromList(occupationKisanDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("OccupationKisan"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDateofBirth")) {
				String DateofBirthKY=RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateofBirth"));
				clearAndEnterDate(dateofBirthTextField, DateofBirthKY);
				//clearAndSendKeys(dateofBirthTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateofBirth"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationshipofnomineewithinsuredKisan")) {
				selectValueFromList(relationshipofthenomineewiththeinsuredKisanDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("RelationshipofnomineewithinsuredKisan"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCreditCardNumber")) {
				clearAndSendKeys(creditCardNumberTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("CreditCardNumber"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredKisan")) {
				selectValueFromList(sumInsuredKisanDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredKisan"));
			}
			
			//YP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHS")) {
				selectValueFromList(horsePowerHSDropdown,polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHS"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHC")) {
				selectValueFromList(horsePowerHCDropdown,polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHC"));
			}
			
			//JP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupeesJP")) {
				selectValueFromList(sumInsuredJPDropDown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupeesJP"));
			}
		}

		else if(polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumber"),fetchValueFromTextFields(tagNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOriginOfRiskDropdown")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OriginOfRiskDropdown"),fetchValueFromList(originOfRiskDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOftheAnimal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOftheAnimal"),fetchValueFromTextFields(detailsOftheAnimalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexDropDownList")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexDropDownList"),fetchValueFromList(sexDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeYear")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeYear"),fetchValueFromTextFields(ageYearTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeINYear")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeINYear"),fetchValueFromTextFields(ageINYearTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeMonth")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeMonth"),fetchValueFromTextFields(ageMonthTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseNewTextArea")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseNewTextArea"),fetchValueFromTextFields(purposeOfUseNewTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseCattleTextArea")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseCattle"),fetchValueFromTextFields(purposeofUsecattleTextarea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValue")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValue"),fetchValueFromTextFields(marketValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExceesInDropdown")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExceesInDropdown"),fetchValueFromList(exceesInDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfOwnerBeneficiary")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfOwnerBeneficiary"),fetchValueFromTextFields(nameOfOwnerBeneficiaryTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfOwnerBeneficiary")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfOwnerBeneficiary"),fetchValueFromTextFields(addressOfOwnerBeneficiaryTextArea), AssertionType.WARNING);
			}

			//BW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPondNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PondNumber"),fetchValueFromTextFields(pondNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPondSpecification")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PondSpecification"),fetchValueFromTextFields(pondSpecificationTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsFloodProneAreaDropdown")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsFloodProneAreaDropdown"),fetchValueFromList(isFloodProneAreaDropdownDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalWaterAreaHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalWaterAreaHectare"),fetchValueFromTextFields(totalWaterAreaHectareTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofPrawn")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofPrawn"),fetchValueFromTextFields(typeofPrawnTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfPrawnPerHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfPrawnPerHectare"),fetchValueFromTextFields(numberOfPrawnPerHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurvivalRate")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurvivalRate"),fetchValueFromTextFields(survivalRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDateOfPurchase")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateOfPurchase")) ,fetchValueFromTextFields(dateOfPurchaseTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStockingDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("StockingDate")) ,fetchValueFromTextFields(stockingDateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeDay")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeDay"),fetchValueFromTextFields(ageDayTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeDayForCALF")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeDayForCALF"),fetchValueFromTextFields(ageDayForCALFTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSourceOfPurchase")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SourceOfPurchase"),fetchValueFromTextFields(sourceOfPurchaseTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEstimatedWeightOfPrawnKgperHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("EstimatedWeightOfPrawnKgperHectare"),fetchValueFromTextFields(estimatedWeightOfPrawnKgperHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalEstimatedWeightOfPrawn")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalEstimatedWeightOfPrawn"),fetchValueFromTextFields(totalEstimatedWeightofPrawnKgTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPriceOfPrawnPerKg")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PriceOfPrawnPerKg"),fetchValueFromTextFields(priceOfPrawnPerKgTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRs"),fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCropPeriodMonths")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CropPeriodMonths"),fetchValueFromTextFields(cropPeriodMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfCalf")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfCalf"),fetchValueFromList(typeOfCalfDropDownList), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfRiskForCattle")) {
				if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForCattle"),fetchValueFromList(typeOfRiskForCattleTextFieldForRural), AssertionType.WARNING);

				}
				else {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForCattle"),fetchValueFromList(typeOfRiskForCattleTextField), AssertionType.WARNING);
				}
			}	
			//FC
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyNumber"),fetchValueFromTextFields(surveyNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGATNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("GATNo"),fetchValueFromTextFields(gATNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheFlower")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheFlower"),fetchValueFromTextFields(nameOfTheFlowerTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigVariety")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Variety"),fetchValueFromTextFields(varietyTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFlowerDescription")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("FlowerDescription"),fetchValueFromTextFields(flowerDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheFlowerYears")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheFlowerYears"),fetchValueFromTextFields(ageOfTheFlowerYearsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheFlowerMonths")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheFlowerMonths"),fetchValueFromTextFields(ageOfTheFlowerMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationDetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationDetails"),fetchValueFromTextFields(locationDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHarvestDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HarvestDate")) ,fetchValueFromTextFields(harvestDateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHissa")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Hissa"),fetchValueFromTextFields(hissaTextField), AssertionType.WARNING);
			}
			//EP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBatchNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BatchNumber"),fetchValueFromTextFields(batchNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofPoultry")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofPoultry"),fetchValueFromTextFields(typeofPoultryDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfBird"),fetchValueFromTextFields(typeOfBirdDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeBroilers")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeBroilers"),fetchValueFromTextFields(ageBroilersDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationWhereTheBirdsAreHoused")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationWhereTheBirdsAreHoused"),fetchValueFromTextFields(locationWhereTheBirdsAreHousedTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBatch")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBatch"),fetchValueFromTextFields(numberOfBatchTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBirdsPerBatch")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBirdsPerBatch"),fetchValueFromTextFields(numberOfBirdsPerBatchTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHatchingDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HatchingDate")) ,fetchValueFromTextFields(hatchingDateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExpectedDateOfDisposal")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExpectedDateOfDisposal")) ,fetchValueFromTextFields(expectedDateOfDisposalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValuePerBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValuePerBird"),fetchValueFromTextFields(marketValuePerBirdTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerBird"),fetchValueFromTextFields(sumInsuredPerBirdTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalMarketValueRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalMarketValueRs"),fetchValueFromTextFields(totalMarketValueRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalSumInsuredRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalSumInsuredRs"),fetchValueFromTextFields(totalSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInPercent")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInPercent"),fetchValueFromTextFields(excessInPercentDropdown), AssertionType.WARNING);
			}

			//FA
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("RiskCovered"),fetchValueFromTextFields(riskCoveredTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOptedCoverdetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OptedCoverdetails"),fetchValueFromTextFields(optedCoverdetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialPerils"),fetchValueFromTextFields(specialPerilsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PremiumRate"),fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPremium")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Premium"),fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
			}
			// DC

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationLicenseNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationLicenseNumber"), fetchValueFromTextFields(identificationLicenseNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueofCartRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueofCartRs"), fetchValueFromTextFields(marketValueofCartRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredofCartRS")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredofCartRS"), fetchValueFromTextFields(sumInsuredofCartRSTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumberofAnimal1")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumberofAnimal1"), fetchValueFromTextFields(tagNumberofAnimal1TextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumberofAnimal2")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumberofAnimal2"), fetchValueFromTextFields(tagNumberofAnimal2TextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueoftheAnimalRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueoftheAnimalRs"), fetchValueFromTextFields(marketValueoftheAnimalRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredoftheAnimalRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredoftheAnimalRs"), fetchValueFromTextFields(sumInsuredoftheAnimalRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueoftheAnimal2Rs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueoftheAnimal2Rs"), fetchValueFromTextFields(marketValueoftheAnimal2RsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredofAnimal2Rs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredofAnimal2Rs"), fetchValueFromTextFields(sumInsuredofAnimal2RsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofCart")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofCart"), fetchValueFromList(typeofCartDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigYearofMake")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("YearofMake"), fetchValueFromList(yearofMakeDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofTyre")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofTyre"), fetchValueFromList(typeofTyreDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsAnimalsCoveredwithCart")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsAnimalsCoveredwithCart"), fetchValueFromList(isAnimalsCoveredwithCartDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOriginofriskofAnimal2")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OriginofriskofAnimal2"), fetchValueFromList(originofriskofAnimal2Dropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexofAnimal2")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexofAnimal2"), fetchValueFromList(sexofAnimal2Dropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedColorOtherMarksofAnimal2")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedColorOtherMarksofAnimal2"), fetchValueFromTextFields(breedColorOtherMarksofanimal2TextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalMarketValueRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalMarketValueRs"), fetchValueFromTextFields(totalMarketValueRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalSumInsuredRsForSW")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalSumInsuredRsForSW"), fetchValueFromTextFields(totalsuminsuredRsTextField), AssertionType.WARNING);
			}

			//DG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigName")) {	
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Name"), fetchValueFromTextFields(nameTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationType")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationType"), fetchValueFromList(identificationTypeDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedColorOtherMarks")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedColorOtherMarks"), fetchValueFromTextFields(breedColorOtherMarksTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocation")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Location"), fetchValueFromTextFields(locationTextArea), AssertionType.WARNING);
			}

			//DK
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("FlockIdentificationNo"), fetchValueFromTextFields(flockIdentificationNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofDuck"), fetchValueFromList(typeofDuckDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBreedSpecification")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BreedSpecification"), fetchValueFromTextFields(breedSpecificationTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationBird"), fetchValueFromTextFields(locationBirdTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofBatchofDuck")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofBatchofDuck"), fetchValueFromTextFields(numberofBatchTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofDucksperBatch")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofDucksperBatch"), fetchValueFromTextFields(numberofDucksperBatchTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueperDuckBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueperDuckBird"), fetchValueFromTextFields(marketValueperBirdTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredperDuckBird")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredperDuckBird"), fetchValueFromTextFields(sumInsuredperBirdTextField), AssertionType.WARNING);
			}
			// GR Group
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberofInsuredPersons")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberofInsuredPersons"), fetchValueFromTextFields(numberofInsuredPersonsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGeographicalArea")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("GeographicalArea"), fetchValueFromTextFields(geographicalAreaTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionofPersonsCovered")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionofPersonsCovered"), fetchValueFromTextFields(descriptionofPersonsCoveredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeGroup")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeGroup"), fetchValueFromTextFields(ageGroupTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerPerson")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerPerson"), fetchValueFromTextFields(sumInsuredPerPersonTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAssignmentDetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AssignmentDetails"), fetchValueFromTextFields(assignmentDetailsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			//GR Gramin
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheinsured")) {

				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheinsured"), fetchValueFromTextFields(nameOfTheinsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfTheInsured")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfTheInsured"), fetchValueFromTextFields(addressOfTheInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStatusoftheInsured")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("StatusoftheInsured"), fetchValueFromList(statusoftheInsuredDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOccupationGramin")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OccupationGramin"), fetchValueFromList(occupationGraminDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofMember")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofMember")) ,fetchValueFromTextFields(dateOfBirthTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilities")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilities"), fetchValueFromTextFields(detailsOfExistingPhysicalDisabilitiesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigGrossAnnualIncome")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("GrossAnnualIncome"), fetchValueFromTextFields(grossAnnualIncomeTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesName")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesName"), fetchValueFromTextFields(nomineesNameTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesAddress")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesAddress"), fetchValueFromTextFields(nomineesAddressTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationshipofthenomineewiththeinsured")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Relationshipofthenomineewiththeinsured"), fetchValueFromList(relationshipofthenomineewiththeinsuredDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofNominee")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofNominee")) ,fetchValueFromTextFields(dateofBirthofNomineeTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSexoftheInsured")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SexoftheInsured"), fetchValueFromList(sexoftheInsuredDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHD")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHD"), fetchValueFromList(horsePowerHDropdown), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessIn")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessIn"), fetchValueFromList(excessInDropdown), AssertionType.WARNING);
			}
			//GP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPumpSerialNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PumpSerialNo"), fetchValueFromTextFields(pumpSerialNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationofPumpset")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationofPumpset"), fetchValueFromTextFields(locationofPumpsetTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerDetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerDetails"), fetchValueFromTextFields(manufacturerDetailsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeofPumpYears")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeofPumpYears"), fetchValueFromTextFields(ageofPumpYearsTextField), AssertionType.WARNING);
			}
		/*	if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerofSolarParts")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerofSolarParts"), fetchValueFromTextFields(manufacturerofSolarPartsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigECNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ECNo"), fetchValueFromTextFields(eCNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPanelNos")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PanelNos"), fetchValueFromTextFields(panelNosTextField), AssertionType.WARNING);
			} */
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPumpsetType")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PumpsetType"), fetchValueFromList(pumpsetTypeDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofMotorPumpset")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofMotorPumpset"), fetchValueFromList(typeofMotorPumpsetDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigYearofManufacturePumpset")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("YearofManufacturePumpset"), fetchValueFromTextFields(yearOfManufacturePumpsetTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerC")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerC"), fetchValueFromList(horsePowerCDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerD")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerD"), fetchValueFromList(horsePowerDDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerS")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerS"), fetchValueFromList(horsePowerSDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFloodCoverIsRequired")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("FloodCoverIsRequired"), fetchValueFromList(floodCoverIsRequiredDropdown), AssertionType.WARNING);
			}
			// HB
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationNumberofBeeHiveBeeColony")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationNumberofBeeHiveBeeColony"), fetchValueFromTextFields(identificationNumberofBeeHiveBeeColonyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfBeeHive")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfBeeHive"), fetchValueFromList(typeOfBeeHiveDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostPerBeeHive")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostPerBeeHive"), fetchValueFromTextFields(costPerBeeHiveTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBeeHives")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBeeHives"), fetchValueFromTextFields(numberOfBeeHivesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofBeeColony")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofBeeColony"), fetchValueFromList(typeofBeeColonyDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostPerBeeColony")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostPerBeeColony"), fetchValueFromTextFields(costPerBeeColonyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfBeeColonies")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfBeeColonies"), fetchValueFromTextFields(numberOfBeeColoniesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseHoneyBee")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseHoneyBee"), fetchValueFromTextFields(purposeOfUseHoneyBeeTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredHives")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredHives"), fetchValueFromTextFields(sumInsuredHivesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredColonies")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredColonies"), fetchValueFromTextFields(sumInsuredColoniesTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredTotal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredTotal"), fetchValueFromTextFields(sumInsuredTotalTextField), AssertionType.WARNING);
			}
			//HD
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofRiskHD")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofRiskHD"),fetchValueFromList(typeofRiskHDDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseHD")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseHD"),fetchValueFromTextFields(purposeOfUseHDTextArea), AssertionType.WARNING);
			}
			//HI
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationNumber"),fetchValueFromTextFields(identificationNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationLandmarkDetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationLandmarkDetails"),fetchValueFromTextFields(identificationLandmarkdetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOwneroftheHut")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OwneroftheHut"),fetchValueFromTextFields(OwneroftheHutTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsoftheOwner")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsoftheOwner"),fetchValueFromTextFields(detailsoftheownerTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationoftheHut")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationoftheHut"),fetchValueFromTextFields(locationoftheHutTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOnStructuresRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOnStructuresRs"),fetchValueFromTextFields(suminsuredonStructuresRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSuminsuredonContentsRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SuminsuredonContentsRs"),fetchValueFromTextFields(suminsuredonContentsRsTextField), AssertionType.WARNING);
			}			
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredonthehutRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredonthehutRs"),fetchValueFromTextFields(sumInsuredonthehutRsTextField), AssertionType.WARNING);
			}	        
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofConstructionRural")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofConstructionRural"),fetchValueFromTextFields(typeofConstructionRuralTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigConstructionYear")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ConstructionYear")),fetchValueFromTextFields(constructionYearTextField), AssertionType.WARNING);
			}
			//IF
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofWaterArea")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofWaterArea"),fetchValueFromList(typeofWaterAreaDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofFish")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeofFish"),fetchValueFromList(typeofFishDropdown), AssertionType.WARNING);
			}	        
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfFishPerHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("numberOfFishPerHectare"),fetchValueFromTextFields(numberOfFishPerHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEstimatedWeightOfFishKgperHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("EstimatedWeightOfFishKgperHectare"),fetchValueFromTextFields(estimatedWeightOfFishKgperHectareTextField), AssertionType.WARNING);
			}	        
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalEstimatedWeightofFishKg")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalEstimatedWeightofFishKg"),fetchValueFromTextFields(totalEstimatedWeightofFishKgTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPriceOfFishPerKg")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PriceOfFishPerKg"),fetchValueFromTextFields(priceOfFishPerKgTextField), AssertionType.WARNING);
			}	    	
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSIofPondTank")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SIofPondTank"),fetchValueFromTextFields(sIofPondTankTextField), AssertionType.WARNING);
			}

			//GG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfGobarGasPlant")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfGobarGasPlant"),fetchValueFromTextFields(locationOfGobarGasPlantTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBeneficiaryName")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BeneficiaryName"),fetchValueFromTextFields(beneficiaryNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBeneficiaryDetails")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BeneficiaryDetails"),fetchValueFromTextFields(beneficiaryDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheDigesterinRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheDigesterinRs"),fetchValueFromTextFields(marketValueOfTheDigesterinRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheGasHolderinRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheGasHolderinRs"),fetchValueFromTextFields(marketValueOfTheGasHolderinRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCostOfConstructioninRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CostOfConstructioninRs"),fetchValueFromTextFields(costOfConstructioninRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueOfTheplantinRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueOfTheplantinRs"),fetchValueFromTextFields(marketValueOfTheplantinRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOfThePlantinRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOfThePlantinRs"),fetchValueFromTextFields(sumInsuredOfThePlantinRsTextField), AssertionType.WARNING);
			}

			//FW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHissaNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HissaNumber"),fetchValueFromTextFields(hissaNumberTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfTheWell")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfTheWell"),fetchValueFromTextFields(locationOfTheWellTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfWell")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfWell"),fetchValueFromTextFields(descriptionOfWellTextArea), AssertionType.WARNING);
			}

			//FP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfTheRisk"),fetchValueFromTextFields(descriptionOfTheRiskTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialExclusions"),fetchValueFromTextFields(specialExclusionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SubjectToClause"),fetchValueFromTextFields(subjectToClauseTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOtherDetailsTariffedPolicy")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OtherDetailsTariffedPolicy"),fetchValueFromTextFields(otherDetailsTariffedPolicyTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialDiscountAmount")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialDiscountAmount"),fetchValueFromTextFields(specialDiscountAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPremiumRateInPercent")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PremiumRateInPercent"),fetchValueFromTextFields(premiumRateInPercentTextField), AssertionType.WARNING);
			}
			//Mayur_RI
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationWhereTheAnimalsAreHoused")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationWhereTheAnimalsAreHoused"),fetchValueFromTextFields(locationWhereTheAnimalsAreHousedTextArea), AssertionType.WARNING);
			}
			//zi
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfAnimal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfAnimal"), fetchValueFromList(typeOfAnimalDropdown), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfRabbitsPerBatch")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfRabbitsPerBatch"),fetchValueFromTextFields(numberOfRabbitsPerBatchTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValuePerAnimal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValuePerAnimal"),fetchValueFromTextFields(marketValuePerAnimalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerAnimal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerAnimal"),fetchValueFromTextFields(sumInsuredPerAnimalTextField), AssertionType.WARNING);
			}
			//Mayur_SG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfRiskForSheepAndGoat")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfRiskForSheepAndGoat"),fetchValueFromList(typeOfRiskForSheepAndGoatDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeOfUseSheepAndGoat")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeOfUseSheepAndGoat"),fetchValueFromTextFields(purposeOfUseSheepAndGoatTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRegistrationNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("RegistrationNo"),fetchValueFromTextFields(registrationNoTextField), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPipelines")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPipelines"),fetchValueFromTextFields(detailsOfPipelinesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfCables")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfCables"),fetchValueFromTextFields(detailsOfCablesTextAreaTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfSwitches")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfSwitches"),fetchValueFromTextFields(detailsOfSwitchesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfGears")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfGears"),fetchValueFromTextFields(detailsOfGearsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfStarters")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfStarters"),fetchValueFromTextFields(detailsOfStartersTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfElectricMotors")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfElectricMotors"),fetchValueFromTextFields(detailsOfElectricMotorsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfElectricValves")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfElectricValves"),fetchValueFromTextFields(detailsOfElectricValvesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredOfLiftIrrigationSystem")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredOfLiftIrrigationSystem"),fetchValueFromTextFields(sumInsuredOfLiftIrrigationSystemTextField), AssertionType.WARNING);
			}


			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNumberOfLayings")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NumberOfLayings"), fetchValueFromTextFields(numberOfLayingsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredPerLaying")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredPerLaying"), fetchValueFromTextFields(sumInsuredPerLayingTextField), AssertionType.WARNING);
			}
			//PG-shruti
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfRelationship")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfRelationship"),fetchValueFromTextFields(detailsOfRelationshipTextArea), AssertionType.WARNING);
			}
			//PS-Shruti
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigManufacturerofSolarParts")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ManufacturerofSolarParts"),fetchValueFromTextFields(manufacturerofSolarPartsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigECNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ECNo"),fetchValueFromTextFields(eCNoTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPanelNos")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PanelNos"),fetchValueFromTextFields(panelNosTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfjackwell")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfjackwell"),fetchValueFromTextFields(detailsOfjackwellTextArea), AssertionType.WARNING);
			}

			//CHINTAN

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationDetailsForLI")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationDetailsForLI"),fetchValueFromTextFields(locationDetailsForLITextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfLiftIrrigation")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfLiftIrrigation"),fetchValueFromTextFields(descriptionOfLiftIrrigationTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescriptionOfDeliverychamber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DescriptionOfDeliverychamber"),fetchValueFromTextFields(descriptionOfDeliverychamberTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfjackwell")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfjackwell"),fetchValueFromTextFields(detailsOfjackwellTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPump")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPump"),fetchValueFromTextFields(detailsOfPumpTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfPumpHouse")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfPumpHouse"),fetchValueFromTextFields(detailsOfPumpHouseTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfWaterStorageTank")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfWaterStorageTank"),fetchValueFromTextFields(detailsOfWaterStorageTankTextArea), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfCables")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfCables"),fetchValueFromTextFields(detailsOfCablesTextAreaTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfSwitches")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfSwitches"),fetchValueFromTextFields(detailsOfSwitchesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfGears")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfGears"),fetchValueFromTextFields(detailsOfGearsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfStarters")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfStarters"),fetchValueFromTextFields(detailsOfStartersTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfElectricValves")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfElectricValves"),fetchValueFromTextFields(detailsOfElectricValvesTextArea), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessinPercentage")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessinPercentage"),fetchValueFromList(excessinPercentageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfProject")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfProject"), fetchValueFromTextFields(locationOfProjectTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalAreaOfTheProjectAcres")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalAreaOfTheProjectAcres"), fetchValueFromTextFields(totalAreaOfTheProjectAcresTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpeciesOfSilkWorm")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpeciesOfSilkWorm"), fetchValueFromList(speciesOfSilkWormDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRaceOfTheSilkWorm")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("RaceOfTheSilkWorm"), fetchValueFromList(raceOfTheSilkWormDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCocoonDisposalDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CocoonDisposalDate")) ,fetchValueFromTextFields(cocoonDisposalDateTextField),AssertionType.WARNING);
			}
			//YG
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfTheinsuredYG")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfTheinsuredYG"),fetchValueFromTextFields(nameOfTheinsuredTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfTheInsuredYG")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfTheInsuredYG"),fetchValueFromTextFields(addressOfTheInsuredTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilitiesYG")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilitiesYG"),fetchValueFromTextFields(detailsOfExistingPhysicalDisabilitiesTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNomineesAddressYG")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NomineesAddressYG"),fetchValueFromTextFields(nomineesAddressTextArea), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupees")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupees"),fetchValueFromTextFields(sumInsuredDropDown), AssertionType.WARNING);
			}

			//Zp
			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfStable")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfStable"),fetchValueFromTextFields(locationOfStableTextField), AssertionType.WARNING);
				}
				//YB
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeHatchery")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeHatchery"),fetchValueFromTextFields(ageHatcheryDropDown), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeLayers")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeLayers"),fetchValueFromTextFields(ageLayersDropDown), AssertionType.WARNING);
				}
			}

			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationOfStable")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationOfStable"),fetchValueFromTextFields(locationOfStableTextArea), AssertionType.WARNING);
				}
			}
			//YI
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExceesInDropdownYI")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExceesInDropdownYI"),fetchValueFromList(exceesInDropdownYI), AssertionType.WARNING);
			}
			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){

				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIdentificationMark")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IdentificationMark"),fetchValueFromList(identificationMarkDropdown), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurposeofUseRI")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurposeofUseRI"),fetchValueFromTextFields(purposeofUseRITextArea), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeInYearsRI")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeInYearsRI"),fetchValueFromTextFields(ageInYearsRITextField), AssertionType.WARNING);
				}
				//FE
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredDwellingUnitRs")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredDwellingUnitRs"),fetchValueFromTextFields(sumInsuredDwellingUnitRsTextField), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsSpecialDiscountApplicable")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsSpecialDiscountApplicable"),fetchValueFromList(isSpecialDiscountApplicableDropdown), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredContentsRsFE")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredContentsRsFE"),fetchValueFromTextFields(sumInsuredContentsRsTextField), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDOBofNomineeFE")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DOBofNomineeFE")) ,fetchValueFromTextFields(dateofBirthofNomineeTextField), AssertionType.WARNING);
				}
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSpecialDiscountInPercentFE")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SpecialDiscountInPercentFE"),fetchValueFromTextFields(specialDiscountInPercentTextField), AssertionType.WARNING);
				}
			}
			//SW
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLotNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LotNumber"),fetchValueFromTextFields(lotNumberTextField), AssertionType.WARNING);
			}

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyRevenueNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyRevenueNumber"),fetchValueFromTextFields(surveyRevenueNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPurchaseDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("PurchaseDate")) ,fetchValueFromTextFields(purchaseDateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCocoonDisposalDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CocoonDisposalDate")) ,fetchValueFromTextFields(cocoonDisposalDateTextField), AssertionType.WARNING);
			}
			//DK
			if(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeInWeeks")) {
					assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeInWeeks"),fetchValueFromTextFields(ageweeksTextField), AssertionType.WARNING);
				}
			}

			//YR
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeOfCrop")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TypeOfCrop"),fetchValueFromList(typeOfCropDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfCropHC")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfCropHC"),fetchValueFromList(nameOfCropHCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfiglossesDueToUnseasonalRainsAndFrost")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LossesDueToUnseasonalRainsAndFrost"),fetchValueFromList(lossesDueToUnseasonalRainsAndFrostDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCropDescription")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CropDescription"),fetchValueFromTextFields(cropDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheCropYears")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheCropYears"),fetchValueFromTextFields(ageOfTheCropYearsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAgeOfTheCropMonths")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AgeOfTheCropMonths"),fetchValueFromTextFields(ageOfTheCropMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLocationYR")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("LocationYR"),fetchValueFromTextFields(locationYRTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAreaUnderCropHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AreaUnderCropHectare"),fetchValueFromTextFields(areaUnderCropHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNoOfPlantsHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NoOfPlantsHectare"),fetchValueFromTextFields(noOfPlantsHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAreaCoveredForInsuranceHectare")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AreaCoveredForInsuranceHectare"),fetchValueFromTextFields(areaCoveredForInsuranceHectareTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSIPerPlantRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SIPerPlantRs"),fetchValueFromTextFields(sIPerPlantRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("IsHOApprovalIsObtained"),fetchValueFromList(isHOApprovalIsObtainedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameofowner")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Nameofowner"),fetchValueFromTextFields(nameofownerTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressoftheowner")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Addressoftheowner"),fetchValueFromTextFields(addressoftheownerTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupeesJN")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupeesJN"),fetchValueFromTextFields(sumInsuredJNDropDown), AssertionType.WARNING);
			}
			//UC
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTagNumOfRecipientCow")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TagNumOfRecipientCow"),fetchValueFromTextFields(tagNumOfRecipientCowTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTypeofriskforfoetus")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Typeofriskforfoetus"),fetchValueFromTextFields(TypeofriskforfoetusDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTechnologyused")) {
			assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Technologyused"),fetchValueFromTextFields(TechnologyusedTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Description"),fetchValueFromTextFields(descriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSurveyNo")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SurveyNo"),fetchValueFromTextFields(surveyNoTextField), AssertionType.WARNING);
			}
			//KY
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNoOfcardholder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NoOfcardholder"),fetchValueFromTextFields(noOfcardholderTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDefinitionofGroupI")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DefinitionofGroupI"),fetchValueFromTextFields(definitionofGroupITextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDefinitionofGroupII")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DefinitionofGroupII"),fetchValueFromTextFields(definitionofGroupIITextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredperCardholder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredperCardholder"),fetchValueFromTextFields(sumInsuredperCardholderDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigBankersBranch")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("BankersBranch"),fetchValueFromTextFields(bankersBranchTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTermsAndConditionsI")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TermsAndConditionsI"),fetchValueFromTextFields(termsAndConditionsITextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTermsAndConditionsII")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TermsAndConditionsII"),fetchValueFromTextFields(termsAndConditionsIITextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalPremium"),fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigTotalSumInsuredRs")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("TotalSumInsuredRs"),fetchValueFromTextFields(totalSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameoftheCardHolder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameoftheCardHolder"),fetchValueFromTextFields(nameoftheCardHolderTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressoftheCardHolder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressoftheCardHolder"),fetchValueFromTextFields(addressoftheCardHolderTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigStatusoftheCardHolder")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("StatusoftheCardHolder"),fetchValueFromTextFields(statusoftheCardHolderDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigOccupationKisan")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("OccupationKisan"),fetchValueFromTextFields(occupationKisanDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDateofBirth")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("DateofBirth"),fetchValueFromTextFields(dateofBirthTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationshipofnomineewithinsuredKisan")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("RelationshipofnomineewithinsuredKisan"),fetchValueFromTextFields(relationshipofthenomineewiththeinsuredKisanDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCreditCardNumber")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("CreditCardNumber"),fetchValueFromTextFields(creditCardNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredKisan")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredKisan"),fetchValueFromTextFields(sumInsuredKisanDropdown), AssertionType.WARNING);
			}
			
			//YP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHS")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHS"), fetchValueFromList(horsePowerHSDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigHorsePowerHC")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("HorsePowerHC"), fetchValueFromList(horsePowerHCDropdown), AssertionType.WARNING);
			}
			//JP
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredRupeesJP")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredRupeesJP"),fetchValueFromTextFields(sumInsuredJPDropDown), AssertionType.WARNING);
			}
			
		}
		}
	


	public void navigateToPolicyTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredIntersetTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTitle);
			switchToFrame("display");
		}
	}
	public void navigateToCoverageTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigFollowupTab")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDocumentTab")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(detailTitle);
			switchToFrame("display");
		}
	}
	public void navigateToMemberAttributesTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigRelationsButton")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity){
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}
	private void clickNextButtonInsuredInterestAttributeRiskDetail1(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity) {
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			switchToFrame("display");
			if(PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigForwardForKY")){
				click(forwordButton);
				switchToFrame("display");

			}
		}
	}
	private void fillSumInsuredDetailsForPS(PolInsIntAttRiskDet1Entity polInsIntAttRiskDet1RRLEntity,CustomAssert assertReference) {
		if(polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("add") || polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueGP")) {
				

				clearAndSendKeys(marketValueTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueGP"));
				if(polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEndorseYP")) {
				try{
					clickTabButton(sumInsuredCentrifugalTextField);
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e){

				}
				}
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValuePS")) {
				clearAndSendKeys(marketValueTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValuePS"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredCentrifugal")) {
				clearAndSendKeys(sumInsuredCentrifugalTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredCentrifugal"));
				
				if(polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigEndorseYP")) {
				try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e){

				}
				}
				switchToFrame("display");
				
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredSubmersible")) {
				clearAndSendKeys(sumInsuredSubmersibleTextField, polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredSubmersible"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInGP")) {
				selectValueFromList(excessInDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInGP"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfOwnerBeneficiaryGP")) {
				clearAndSendKeys(nameOfOwnerBeneficiaryTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfOwnerBeneficiaryGP"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfOwnerBeneficiaryGP")) {
				clearAndSendKeys(addressOfOwnerBeneficiaryTextArea, polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfOwnerBeneficiaryGP"));
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInPercentPS")) {
				selectValueFromList(excessInPercentDropdown, polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInPercentPS"));
			}
			String currentStatus=fetchValueFromFields(statusLabel);
	
			if(!((polInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("GP")||polInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("YP") )&& currentStatus.equalsIgnoreCase("ENDORSEMENT/ALTERATION STARTED"))){
			click(forwordButton);
			}
		}
		else if(polInsIntAttRiskDet1RRLEntity.getAction().equalsIgnoreCase("verify")){
			//click(gPsaveButton);
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValueGP")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValueGP"),fetchValueFromTextFields(marketValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredCentrifugal")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredCentrifugal"), fetchValueFromTextFields(sumInsuredCentrifugalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSumInsuredSubmersible")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("SumInsuredSubmersible"), fetchValueFromTextFields(sumInsuredSubmersibleTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInGP")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInGP"),fetchValueFromList(exceesInDropdown), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigNameOfOwnerBeneficiaryGP")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("NameOfOwnerBeneficiaryGP"),fetchValueFromTextFields(nameOfOwnerBeneficiaryTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigAddressOfOwnerBeneficiaryGP")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("AddressOfOwnerBeneficiaryGP"),fetchValueFromTextFields(addressOfOwnerBeneficiaryTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigMarketValue")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("MarketValue"),fetchValueFromTextFields(marketValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigExcessInPercent")) {
				assertReference.assertEquals(polInsIntAttRiskDet1RRLEntity.getStringValueForField("ExcessInPercent"),fetchValueFromTextFields(excessInPercentDropdown), AssertionType.WARNING);
			}


		}
		//click(gPsaveButton);

	}	


	private void submitButtonInsuredInterestAttributeRiskDetail1(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity) throws InterruptedException {
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSaveButton")){		
			Thread.sleep(2000);
			click(saveButton);
			click(saveButton);
			switchToFrame("display");

			if(PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("BW")){
				Thread.sleep(1000);
				click(saveButton);
				switchToFrame("display");
			}
		}
	}


	private void submitButtonInsuredInterestAttributeRiskDetailYB(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity) throws InterruptedException {
		if (PolInsIntAttRiskDet1RRLEntity.getBooleanValueForField("ConfigSaveButtonYB")){		
			doubleClick(saveButton);
			switchToFrame("display");
		}
	}


	public void fillandSubmitPolicyInsuredInterestAttributeRiskDetail1Rural(PolInsIntAttRiskDet1Entity PolInsIntAttRiskDet1RRLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(PolInsIntAttRiskDet1RRLEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInterestAttributeRiskDetail1Rural(PolInsIntAttRiskDet1RRLEntity, assertReference);
			clickNextButtonInsuredInterestAttributeRiskDetail1(PolInsIntAttRiskDet1RRLEntity);
			if(PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("GP")||PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("PS") || PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("YP")) 
			{
				fillSumInsuredDetailsForPS(PolInsIntAttRiskDet1RRLEntity, assertReference);
			}
			if(!(PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("FC")))
			{	
				submitButtonInsuredInterestAttributeRiskDetail1(PolInsIntAttRiskDet1RRLEntity);
			}
			if((PolInsIntAttRiskDet1RRLEntity.getStringValueForField("Product").equalsIgnoreCase("YB")))
			{	
				submitButtonInsuredInterestAttributeRiskDetailYB(PolInsIntAttRiskDet1RRLEntity);
			}
			navigateToPolicyTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToAttributeTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToInsuredIntersetTab(PolInsIntAttRiskDet1RRLEntity); 
			navigateToCoverageTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToLoanTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToClientDetailsTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToRelationsTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToPaymentsTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToFollowupTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToDocumentTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToDetailTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToMemberAttributesTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToAttachCoverageTab(PolInsIntAttRiskDet1RRLEntity);
			navigateToRelations1Tab(PolInsIntAttRiskDet1RRLEntity);
			navigateToPayments1Tab(PolInsIntAttRiskDet1RRLEntity);
		}
	}
}

