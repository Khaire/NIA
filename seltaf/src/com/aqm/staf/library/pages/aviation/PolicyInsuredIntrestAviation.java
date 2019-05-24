package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AviationRiskDT2Entity;
import com.aqm.staf.library.databin.PolInsIntAvtEntity;
import com.aqm.staf.library.databin.PolicyAttrAviationEntity;

public class PolicyInsuredIntrestAviation extends BasePage{
	//Digvijay Prod-PN
	private PageElement nameOftheMemberTextField;
	private PageElement relationshipWithThePolicyholderDropDown;
	private PageElement dateOfBirthOfTheMemberTextField;
	private PageElement ageTextField;
	private PageElement occupationOfMemberDropDown;
	private PageElement licenseNumberTextArea;
	private PageElement licenseTypeTextField;
	private PageElement dateOfLicenseTextField;
	private PageElement byWhomTheLicenseisGrantedTextField;
	private PageElement dateOfExpiryOfTheLicenseTextField;
	private PageElement typeOfAircraftinRespectofWhichTheLicenseisGrantedTextField;
	private PageElement whatAretheTypesOfAircraftYouContemplateFlyingTextField;
	private PageElement hasAnyClaimMadebyPilotinLast5yearsUnderTheAviationPersonalAccidentPolicyDropDown;
	private PageElement monthlyIncomeOftheMemberTextField;
	private PageElement nomineeNameTextField;
	private PageElement relationshipWithNomineeTextField;
	private PageElement sumInsuredTextField;
	private PageElement geographicalLimitstoWhichFlyingWillbeConfinedDropDown;
	private PageElement haveAnyOfthePersonstoBeInsuredtoYourKnowledgeAanyPhysicalDefectorInfirmityOfAnyKindDropDown;
	private PageElement tableOfBenefitsDropDown;
	//Digvijay  prod-AA 
	private PageElement basisOfPremiumComputationDropDown;
	private PageElement hullSumInsuredTextField;
	private PageElement hullPremiumTextField;
	private PageElement hullRateTextField;
	private PageElement sparesWarSumInsuredTextField;
	private PageElement sparesWarPremiumTextField;
	private PageElement sparesWarRateTextField;
	private PageElement alliedPerilsSumInsuredTextField;
	private PageElement alliedPerilsPremiumTextField;
	private PageElement alliedPerilsRateTextField;
	//Digvijay  prod- AD
	private PageElement harPolicyNumberForTheInsuredTextField;
	//Digvijay  prod -AE
	private PageElement excessLiabilitySumInsuredTextField;
	private PageElement excessLiabilityPremiumTextField;

	//Digvijay  prod AG
	private PageElement isThereAnyMedicalHistoryForTheMemberWhatsoeverDropDown;
	private PageElement provideTheDetailsOfTheMedicalIllnessTextField;
	private PageElement periodForWhichTheLicenseIsInvalidatedInDaysTextField;
	private PageElement dateOfLastRenewalOfTheLicenseTextField;
	//Digvijay  prod AH
	private PageElement typeOfAircraftDropDown;
	private PageElement nameOfTheManufacturerTextField;
	private PageElement aircraftModelNameTextField;
	private PageElement yearOfMakeDropDown;
	private PageElement manufacturersSerialNumberTextField;
	private PageElement registrationMarkTextField;
	private PageElement quantityTextField;  					//DISABLED
	private PageElement passengerCapacityTextField;
	private PageElement valueOfAircraftWithStandardInsAndEquipTextField;
	private PageElement valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField;
	private PageElement totalAgreedValueTextField;					//DISABLED
	private PageElement whetherClauseAVN52EIsRequiredDropDown;
	private PageElement loadingFor52ETextField;
	//Digvijay  Prod AI
	private PageElement premiumTextField;
	private PageElement basicRateForPremiumCalculationTextField;
	//
	private PageElement saveButton;
	private PageElement forwardButton;
	private PageElement backButton;
	//Digvijay prod= AS
	private PageElement sparesAllRiskSumInsuredTextField;
	private PageElement sparesAllRiskPremiumTextField;
	private PageElement liabilitySumInsuredTextField;
	private PageElement liabilityPremiumTextField;

	//// prod PA
	private PageElement strengthOftheGroupTextField;
	private PageElement discountfoRGoodClaimExperienceTextField;
	private PageElement otherDiscountsTextField;
	private PageElement otherLoadingTextField;
	private PageElement typeOfCoverrequiredTextField;

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
	private PageElement nextAttributePageTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	//*************AW(CHINTAN)********************
	private PageElement typeofAircraftDropDown;

	private PageElement yearofMakeDropDown;
	private PageElement tRegistrationMarkTextField;
	private PageElement	passengercapacityTextField;
	private PageElement valueOfAircraftWithStandardInstrumentsAndEquipmentsTextField;
	private PageElement geographicalAreaLimitTextField;
	private PageElement	aHPolicyNoTextField;

	//*************PA(CHINTAN)********************
	private PageElement	designationOfMembersDropDown;
	private PageElement noOfPersonPerDesignationTextField;
	private PageElement sumInsuredPerPersonTextField;
	private PageElement totalSumInsuredTextField;

	//*************PN(CHINTAN)********************
	//**********SAME HAS(// Digvijay prod-PN)*****


	//*************SR(CHINTAN)********************
	//private PageElement Basis of Premium Computation;
	private PageElement geographicalLimitsForThePolicyTextField;
	private PageElement deductibleForThePolicyTextField;
	private PageElement maximumSparesValueTextField;
	private PageElement premiumRateApplicablOonDropDown;

	public PolicyInsuredIntrestAviation(WebDriver driver, String pageName) {
		super(driver, pageName);
		// Digvijay prod-PN
		nameOftheMemberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Member')]/following::input"), "Name of the Member", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithThePolicyholderDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Relationship with the Policy holder')]/following::select"), "Relationship with the Policy holder", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfBirthOfTheMemberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Birth of the Member')]/following::input"), "Date of Birth of the Member", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Age')]/following::input"), "Age", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationOfMemberDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Occupation of Member')]/following::select"), "Occupation of Member", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'License Number')]/following::textarea"), "License Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseTypeTextField=new PageElement(By.xpath("//td//div[contains(text(),'License Type')]/following::input"), "License Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLicenseTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of license')]/following::input"), "Date of license", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		byWhomTheLicenseisGrantedTextField=new PageElement(By.xpath("//td//div[contains(text(),'By whom the license is granted')]/following::input"), "By whom the license is granted", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfExpiryOfTheLicenseTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of expiry of the license')]/following::input"), "Date of expiry of the license", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfAircraftinRespectofWhichTheLicenseisGrantedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of aircraft in respect of which the license is granted')]/following::input"), "Type of aircraft in respect of which the license is granted", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whatAretheTypesOfAircraftYouContemplateFlyingTextField=new PageElement(By.xpath("//td//div[contains(text(),'What are the types of aircraft you contemplate flying?')]/following::input"), "What are the types of aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasAnyClaimMadebyPilotinLast5yearsUnderTheAviationPersonalAccidentPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has any Claim Made by Pilot in last 5 years')]/following::select"), "Has any Claim Made by Pilot in last 5 years", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		monthlyIncomeOftheMemberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Monthly Income of the member')]/following::input"), "Monthly Income of the member", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineeNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Nominee Name')]/following::input"), "Nominee Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithNomineeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Relationship with Nominee')]/following::input"), "Relationship with Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalLimitstoWhichFlyingWillbeConfinedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical limits to which flying will be confined')]/following::select"), "Geographical limits to which flying will be confined", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		haveAnyOfthePersonstoBeInsuredtoYourKnowledgeAanyPhysicalDefectorInfirmityOfAnyKindDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Have any of the persons to be insured, to your knowledge, any physical defect or infirmity of any kind?')]/following::select"), "Have any of the persons to be insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tableOfBenefitsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Table of benefits')]/following::select"), "Table of benefits", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Digvijay  AA
		basisOfPremiumComputationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation')]/following::select"), "Basis of Premium Computation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hullSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Hull Sum Insured')]/following::input"), "Hull Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hullPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Hull Premium')]/following::input"), "Hull Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hullRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Hull Rate(%)')]/following::input"), "Hull Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesWarSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Spares War Sum Insured')]/following::input"), "Spares War Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesWarPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Spares War Premium')]/following::input"), "pares War Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesWarRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Spares War Rate(%)')]/following::input"), "Spares War Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		alliedPerilsSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Allied Perils Sum Insured')]/following::input"), "Allied Perils Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		alliedPerilsPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Allied Perils Premium')]/following::input"), "Allied Perils Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		alliedPerilsRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Allied Perils Rate(%)')]/following::input"), "Allied Perils Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Digvijay  AD
		harPolicyNumberForTheInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'HAR policy number for the insured')]/following::input"), "HAR policy number for the insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Digvijay AE
		excessLiabilitySumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess Liability Sum Insured')]/following::input"), "Excess Liability Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessLiabilityPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess Liability Premium')]/following::input"), "Excess Liability Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Digvijay  Prod -AG
		isThereAnyMedicalHistoryForTheMemberWhatsoeverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any medical history for the member whatsoever')]/following::select"), "Is there any medical history", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		provideTheDetailsOfTheMedicalIllnessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Provide the details of the medical illness')]/following::input"), "Provide the details of the medical illness", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodForWhichTheLicenseIsInvalidatedInDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period for which the license is invalidated in days')]/following::input"), "Period for which the license is invalidated", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLastRenewalOfTheLicenseTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Last Renewal of the license')]/following::input"), "Date of Last Renewal of the license", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Digvijay  Prod AH
		typeOfAircraftDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Aircraft')]/following::select"), "Type of Aircraft", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheManufacturerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the manufacturer')]/following::input"), "Name of the manufacturer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfMakeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Year of Make')]/following::select"), "Year of Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		manufacturersSerialNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Manufacturers Serial Number (MSN)')]/following::input"), "Manufacturers Serial Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationMarkTextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration Mark')]/following::input"), "Registration Mark", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quantityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Quantity')]/following::input"), "Quantity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passengerCapacityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Passenger capacity')]/following::input"), "Passenger capacity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfAircraftWithStandardInsAndEquipTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value of Aircraft with standard instruments and equipments')]/following::input"), "Value of Aircraft with standard instruments", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value of extra equipment and accessories fitted')]/following::input"), "Value of extra equipment and accessories", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAgreedValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total agreed value')]/following::input"), "Total agreed value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherClauseAVN52EIsRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether clause AVN 52E (extended coverage) is required?')]/following::select"), "Whether clause AVN 52E (extended coverage)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingFor52ETextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for 52E')]/following::input"), "Loading (%) for 52E", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Digvijay  Prod AI
		premiumTextField=new PageElement(By.xpath("//tr[4]//td[1]//div[contains(text(),'Premium')]/following::input"), "Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicRateForPremiumCalculationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Basic rate for premium calculation (%)')]/following::input"), "Basic rate for premium calculation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//prod AS
		sparesAllRiskSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Spares All Risk Sum Insured')]/following::input"), "Spares All Risk Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sparesAllRiskPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Spares All Risk Premium')]/following::input"), "Spares All Risk Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		liabilitySumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Liability Sum Insured')]/following::input"), "Liability Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		liabilityPremiumTextField=new PageElement(By.xpath("//td//div[contains(text(),'Liability Premium')]/following::input"), "Liability Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
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
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//*************AW(CHINTAN)********************
		typeofAircraftDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Aircraft')]/following::select"), "Type of Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aircraftModelNameTextField=new PageElement(By.xpath("//td/div[contains(text(),'Aircraft Model Name')]/following::input"), "Aircraft Model Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearofMakeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Year of Make')]/following::select"), "Year of Make", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tRegistrationMarkTextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration Mark')]/following::input"), "Registration Mark", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passengercapacityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Passenger capacity')]/following::input"), "Passenger capacity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfAircraftWithStandardInstrumentsAndEquipmentsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of Aircraft with standard instruments and equipments')]/following::input"), "Value of Aircraft with standard instruments and equipments", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of extra equipment and accessories fitted to or carried in the aircraft')]/following::input"), "Value of extra equipment and accessories fitted to or carried in the aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalAreaLimitTextField=new PageElement(By.xpath("//td/div[contains(text(),'Geographical Area Limit')]/following::textarea"), "Geographical Area Limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aHPolicyNoTextField=new PageElement(By.xpath("//td/div[contains(text(),'AH Policy no.')]/following::input"), "AH Policy no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//*************PA(CHINTAN)********************
		designationOfMembersDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Designation of Members')]/following::select"), "Designation of Members", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfPersonPerDesignationTextField=new PageElement(By.xpath("//td/div[contains(text(),'No of person per Designation')]/following::input"), "No of person per Designation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerPersonTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum insured per person')]/following::input"), "Sum insured per person", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total sum insured')]/following::input"), "Total sum insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//*************PN(CHINTAN)********************
		//****SAME AS( Digvijay prod-PN)*************	


		//************SR(CHINTAN)***************
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		geographicalLimitsForThePolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Geographical limits for the policy')]/following::input"), "Geographical limits for the policy", false, WaitType.WAITFORELEMENTTOBEEENABLED , 10);
		deductibleForThePolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible for the policy')]/following::input"), "Deductible for the policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumSparesValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Maximum Spares Value')]/following::input"), "Maximum Spares Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRateApplicablOonDropDown=new PageElement(By.xpath("//td//div[@id='Premium Rate Applicable on']/following::select"), "Premium Rate Applicable on", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
	}
	public void fillPolicyInsIntAviation(PolInsIntAvtEntity polInsIntAvtEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAvtEntity.getAction().equalsIgnoreCase("add") || polInsIntAvtEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNameOftheMember")) {
				clearAndSendKeys(nameOftheMemberTextField, polInsIntAvtEntity.getStringValueForField("NameOftheMember"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRelationshipWithThePolicyholder")) {
				selectValueFromList(relationshipWithThePolicyholderDropDown, polInsIntAvtEntity.getStringValueForField("RelationshipWithThePolicyholder"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfBirthOfTheMember")) {
				String dateOfBirthOfTheMember=RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfBirthOfTheMember"));
				clearAndEnterDate(dateOfBirthOfTheMemberTextField, dateOfBirthOfTheMember);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAge")) {
				clearAndSendKeys(ageTextField, polInsIntAvtEntity.getStringValueForField("Age"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigOccupationOfMember")) {
				selectValueFromList(occupationOfMemberDropDown, polInsIntAvtEntity.getStringValueForField("OccupationOfMember"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLicenseNumber")) {
				clearAndSendKeys(licenseNumberTextArea, polInsIntAvtEntity.getStringValueForField("LicenseNumber"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLicenseType")) {
				clearAndSendKeys(licenseTypeTextField, polInsIntAvtEntity.getStringValueForField("LicenseType"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfLicense")) {
				String dateOfLicense=RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfLicense"));
				clearAndEnterDate(dateOfLicenseTextField, dateOfLicense);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigByWhomTheLicenseisGranted")) {
				clearAndSendKeys(byWhomTheLicenseisGrantedTextField, polInsIntAvtEntity.getStringValueForField("ByWhomTheLicenseisGranted"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfExpiryOfTheLicense")) {
				String dateOfExpiryOfTheLicense=RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfExpiryOfTheLicense"));
				clearAndEnterDate(dateOfExpiryOfTheLicenseTextField, dateOfExpiryOfTheLicense);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTypeOfAircraftinRespectofWhich")) {
				clearAndSendKeys(typeOfAircraftinRespectofWhichTheLicenseisGrantedTextField, polInsIntAvtEntity.getStringValueForField("TypeOfAircraftinRespectofWhich"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigWhatAretheTypesOfAircraftYouContemplate")) {
				clearAndSendKeys(whatAretheTypesOfAircraftYouContemplateFlyingTextField, polInsIntAvtEntity.getStringValueForField("WhatAretheTypesOfAircraftYouContemplate"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHasAnyClaimMadebyPilotinLast5years")) {
				selectValueFromList(hasAnyClaimMadebyPilotinLast5yearsUnderTheAviationPersonalAccidentPolicyDropDown, polInsIntAvtEntity.getStringValueForField("HasAnyClaimMadebyPilotinLast5years"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigMonthlyIncomeOftheMember")) {
				clearAndSendKeys(monthlyIncomeOftheMemberTextField, polInsIntAvtEntity.getStringValueForField("MonthlyIncomeOftheMember"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNomineeName")) {
				clearAndSendKeys(nomineeNameTextField, polInsIntAvtEntity.getStringValueForField("NomineeName"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
				clearAndSendKeys(relationshipWithNomineeTextField, polInsIntAvtEntity.getStringValueForField("RelationshipWithNominee"));
			}	
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntAvtEntity.getStringValueForField("SumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalLimitstoWhichFlying")) {
				selectValueFromList(geographicalLimitstoWhichFlyingWillbeConfinedDropDown, polInsIntAvtEntity.getStringValueForField("GeographicalLimitstoWhichFlying"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHaveAnyOfthePerstoBeInsToYourKnowledge")) {
				selectValueFromList(haveAnyOfthePersonstoBeInsuredtoYourKnowledgeAanyPhysicalDefectorInfirmityOfAnyKindDropDown, polInsIntAvtEntity.getStringValueForField("HaveAnyOfthePerstoBeInsToYourKnowledge"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTableOfBenefits")) {
				selectValueFromList(tableOfBenefitsDropDown, polInsIntAvtEntity.getStringValueForField("TableOfBenefits"));
			}
			//Prod= AA
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
				selectValueFromList(basisOfPremiumComputationDropDown, polInsIntAvtEntity.getStringValueForField("BasisOfPremiumComputation"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullSumInsured")) {
				clearAndSendKeys(hullSumInsuredTextField, polInsIntAvtEntity.getStringValueForField("HullSumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullPremium")) {
				clearAndSendKeys(hullPremiumTextField, polInsIntAvtEntity.getStringValueForField("HullPremium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullRate")) {
				clearAndSendKeys(hullRateTextField, polInsIntAvtEntity.getStringValueForField("HullRate"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarSumInsured")) {
				clearAndSendKeys(sparesWarSumInsuredTextField, polInsIntAvtEntity.getStringValueForField("SparesWarSumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarPremium")) {
				clearAndSendKeys(sparesWarPremiumTextField, polInsIntAvtEntity.getStringValueForField("SparesWarPremium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarRate")) {
				clearAndSendKeys(sparesWarRateTextField, polInsIntAvtEntity.getStringValueForField("SparesWarRate"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsSumInsured")) {
				clearAndSendKeys(alliedPerilsSumInsuredTextField, polInsIntAvtEntity.getStringValueForField("AlliedPerilsSumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsPremium")) {
				clearAndSendKeys(alliedPerilsPremiumTextField, polInsIntAvtEntity.getStringValueForField("AlliedPerilsPremium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsRate")) {
				clearAndSendKeys(alliedPerilsRateTextField, polInsIntAvtEntity.getStringValueForField("AlliedPerilsRate"));
			}
			//*************AW(CHINTAN)********************

			//PROD- AD
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHarPolicyNumberForTheInsured")) {
				clearAndSendKeys(harPolicyNumberForTheInsuredTextField, polInsIntAvtEntity.getStringValueForField("HarPolicyNumberForTheInsured"));
			}
			//PROD-AE
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigExcessLiabilitySumInsured")) {
				clearAndSendKeys(excessLiabilitySumInsuredTextField, polInsIntAvtEntity.getStringValueForField("ExcessLiabilitySumInsured"));
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigQuantity")) {
				clearAndSendKeys(quantityTextField, polInsIntAvtEntity.getStringValueForField("Quantity"));
			}
			//Prod -AG

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigIsThereAnyMedicalHistoryForTheMember")) {
				selectValueFromList(isThereAnyMedicalHistoryForTheMemberWhatsoeverDropDown, polInsIntAvtEntity.getStringValueForField("IsThereAnyMedicalHistoryForTheMember"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigProvideTheDetailsOfTheMedicalIllness")) {
				clearAndSendKeys(provideTheDetailsOfTheMedicalIllnessTextField, polInsIntAvtEntity.getStringValueForField("ProvideTheDetailsOfTheMedicalIllness"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPeriodForWhichTheLicenseIsInvalidated")) {
				clearAndSendKeys(periodForWhichTheLicenseIsInvalidatedInDaysTextField, polInsIntAvtEntity.getStringValueForField("PeriodForWhichTheLicenseIsInvalidated"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfLastRenewalOfTheLicense")) {
				String dateOfLastRenewalOfTheLicense=RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfLastRenewalOfTheLicense"));
				clearAndEnterDate(dateOfLastRenewalOfTheLicenseTextField, dateOfLastRenewalOfTheLicense);
			}


			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTotalAgreedValue")) {
				clearAndSendKeys(totalAgreedValueTextField, polInsIntAvtEntity.getStringValueForField("TotalAgreedvalue"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalAreaLimit")) {
				clearAndSendKeys(geographicalAreaLimitTextField, polInsIntAvtEntity.getStringValueForField("GeographicalAreaLimit"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAHPolicyNo")) {
				clearAndSendKeys(aHPolicyNoTextField, polInsIntAvtEntity.getStringValueForField("AHPolicyNo"));
			}	

			//*************PA(CHINTAN)********************
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDesignationOfMembers")) {
				selectValueFromList(designationOfMembersDropDown, polInsIntAvtEntity.getStringValueForField("DesignationOfMembers"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNoOfPersonPerDesignation")) {
				clearAndSendKeys(noOfPersonPerDesignationTextField, polInsIntAvtEntity.getStringValueForField("NoOfPersonPerDesignation"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSumInsuredPerPerson")) {
				clearAndSendKeys(sumInsuredPerPersonTextField, polInsIntAvtEntity.getStringValueForField("SumInsuredPerPerson"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				clearAndSendKeys(totalSumInsuredTextField, polInsIntAvtEntity.getStringValueForField("TotalSumInsured"));
			}	

			//Prod=AH
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTypeOfAircraft")) {
				selectValueFromList(typeOfAircraftDropDown, polInsIntAvtEntity.getStringValueForField("TypeOfAircraft"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNameOfTheManufacturer")) {
				clearAndSendKeys(nameOfTheManufacturerTextField, polInsIntAvtEntity.getStringValueForField("NameOfTheManufacturer"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAircraftModelName")) {
				clearAndSendKeys(aircraftModelNameTextField, polInsIntAvtEntity.getStringValueForField("AircraftModelName"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigYearOfMake")) {
				selectValueFromList(yearOfMakeDropDown, polInsIntAvtEntity.getStringValueForField("YearOfMake"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigManufacturersSerialNumber")) {
				clearAndSendKeys(manufacturersSerialNumberTextField, polInsIntAvtEntity.getStringValueForField("ManufacturersSerialNumber"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRegistrationMark")) {
				clearAndSendKeys(registrationMarkTextField, polInsIntAvtEntity.getStringValueForField("RegistrationMark"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPassengerCapacity")) {
				clearAndSendKeys(passengerCapacityTextField, polInsIntAvtEntity.getStringValueForField("PassengerCapacity"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueOfAircraftWithStandardInsAndEquip")) {
				clearAndSendKeys(valueOfAircraftWithStandardInsAndEquipTextField, polInsIntAvtEntity.getStringValueForField("ValueOfAircraftWithStandardInsAndEquip"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueOfExtraEquipAndAccFittedInTheAircraft")) {
				clearAndSendKeys(valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField, polInsIntAvtEntity.getStringValueForField("ValueOfExtraEquipAndAccFittedInTheAircraft"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigWhetherClauseAVN52EIsRequired")) {
				selectValueFromList(whetherClauseAVN52EIsRequiredDropDown, polInsIntAvtEntity.getStringValueForField("WhetherClauseAVN52EIsRequired"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLoadingFor52E")) {
				clearAndSendKeys(loadingFor52ETextField, polInsIntAvtEntity.getStringValueForField("LoadingFor52E"));
			}

			//prod= AI
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPremium")) {
				clearAndSendKeys(premiumTextField, polInsIntAvtEntity.getStringValueForField("Premium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigBasicRateForPremiumCalculation")) {
				clearAndSendKeys(basicRateForPremiumCalculationTextField, polInsIntAvtEntity.getStringValueForField("BasicRateForPremiumCalculation"));
			}
			//PROD AS
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesAllRiskSumInsured")) {
				clearAndSendKeys(sparesAllRiskSumInsuredTextField, polInsIntAvtEntity.getStringValueForField("SparesAllRiskSumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesAllRiskPremium")) {
				clearAndSendKeys(sparesAllRiskPremiumTextField, polInsIntAvtEntity.getStringValueForField("SparesAllRiskPremium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLiabilitySumInsured")) {
				clearAndSendKeys(liabilitySumInsuredTextField, polInsIntAvtEntity.getStringValueForField("LiabilitySumInsured"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLiabilityPremium")) {
				clearAndSendKeys(liabilityPremiumTextField, polInsIntAvtEntity.getStringValueForField("LiabilityPremium"));
				Thread.sleep(3000);
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalLimitsForThePolicy")) {
				clearAndSendKeys(geographicalLimitsForThePolicyTextField, polInsIntAvtEntity.getStringValueForField("GeographicalLimitsForThePolicy"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDeductibleForThePolicy")) {
				clearAndSendKeys(deductibleForThePolicyTextField, polInsIntAvtEntity.getStringValueForField("DeductibleForThePolicy"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigMaximumSparesValue")) {
				clearAndSendKeys(maximumSparesValueTextField, polInsIntAvtEntity.getStringValueForField("MaximumSparesValue"));
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPremiumRateApplicableOn")) {
				clearAndSendKeys(premiumRateApplicablOonDropDown, polInsIntAvtEntity.getStringValueForField("PremiumRateApplicableOn"));
			}	
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigExcessLiabilityPremium")) {
				clearAndSendKeys(excessLiabilityPremiumTextField, polInsIntAvtEntity.getStringValueForField("ExcessLiabilityPremium"));
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueOfExtraEquipAccessFitToOrCarInTheAircraft")) {
				clearAndSendKeys(valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField, polInsIntAvtEntity.getStringValueForField("ValueOfExtraEquipAccessFitToOrCarInTheAircraft"));
			}
		}
		else if(polInsIntAvtEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNameOftheMember")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("NameOftheMember"), fetchValueFromTextFields(nameOftheMemberTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRelationshipWithThePolicyholder")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("RelationshipWithThePolicyholder"), fetchValueFromList(relationshipWithThePolicyholderDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfBirthOfTheMember")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfBirthOfTheMember")) ,fetchValueFromTextFields(dateOfBirthOfTheMemberTextField),AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAge")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Age"), fetchValueFromTextFields(ageTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigOccupationOfMember")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("OccupationOfMember"), fetchValueFromList(occupationOfMemberDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLicenseNumber")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("LicenseNumber"), fetchValueFromTextFields(licenseNumberTextArea), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLicenseType")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("LicenseType"), fetchValueFromTextFields(licenseTypeTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfLicense")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfLicense")) ,fetchValueFromTextFields(dateOfLicenseTextField),AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigByWhomTheLicenseisGranted")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ByWhomTheLicenseisGranted"), fetchValueFromTextFields(byWhomTheLicenseisGrantedTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfExpiryOfTheLicense")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfExpiryOfTheLicense")) ,fetchValueFromTextFields(dateOfExpiryOfTheLicenseTextField),AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTypeOfAircraftinRespectofWhich")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TypeOfAircraftinRespectofWhich"), fetchValueFromTextFields(typeOfAircraftinRespectofWhichTheLicenseisGrantedTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigWhatAretheTypesOfAircraftYouContemplate")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("WhatAretheTypesOfAircraftYouContemplate"), fetchValueFromTextFields(whatAretheTypesOfAircraftYouContemplateFlyingTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHasAnyClaimMadebyPilotinLast5years")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HasAnyClaimMadebyPilotinLast5years"), fetchValueFromList(hasAnyClaimMadebyPilotinLast5yearsUnderTheAviationPersonalAccidentPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigMonthlyIncomeOftheMember")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("MonthlyIncomeOftheMember"), fetchValueFromTextFields(monthlyIncomeOftheMemberTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNomineeName")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("NomineeName"), fetchValueFromTextFields(nomineeNameTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("RelationshipWithNominee"), fetchValueFromTextFields(relationshipWithNomineeTextField), AssertionType.WARNING);
			}		
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalLimitstoWhichFlying")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("GeographicalLimitstoWhichFlying"), fetchValueFromList(geographicalLimitstoWhichFlyingWillbeConfinedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHaveAnyOfthePerstoBeInsToYourKnowledge")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HaveAnyOfthePerstoBeInsToYourKnowledge"), fetchValueFromList(haveAnyOfthePersonstoBeInsuredtoYourKnowledgeAanyPhysicalDefectorInfirmityOfAnyKindDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTableOfBenefits")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TableOfBenefits"), fetchValueFromList(tableOfBenefitsDropDown), AssertionType.WARNING);
			}
			//Prod= AA
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("BasisOfPremiumComputation"), fetchValueFromList(basisOfPremiumComputationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HullSumInsured"), fetchValueFromTextFields(hullSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HullPremium"), fetchValueFromTextFields(hullPremiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHullRate")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HullRate"), fetchValueFromTextFields(hullRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SparesWarSumInsured"), fetchValueFromTextFields(sparesWarSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SparesWarPremium"), fetchValueFromTextFields(sparesWarPremiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesWarRate")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SparesWarRate"), fetchValueFromTextFields(sparesWarRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("AlliedPerilsSumInsured"), fetchValueFromTextFields(alliedPerilsSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("AlliedPerilsPremium"), fetchValueFromTextFields(alliedPerilsPremiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAlliedPerilsRate")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("AlliedPerilsRate"), fetchValueFromTextFields(alliedPerilsRateTextField), AssertionType.WARNING);
			}
			//****************AW(CHINTAN)*****************

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTypeOfAircraft")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TypeOfAircraft"), fetchValueFromList(typeofAircraftDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNameOfTheManufacturer")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("NameOfTheManufacturer"), fetchValueFromTextFields(nameOfTheManufacturerTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAircraftModelName")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("AircraftModelName"), fetchValueFromTextFields(aircraftModelNameTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigYearOfMake")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("YearOfMake"), fetchValueFromList(yearofMakeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigManufacturersSerialNumber")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ManufacturersSerialNumber"), fetchValueFromTextFields(manufacturersSerialNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRegistrationMark")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("RegistrationMark"), fetchValueFromTextFields(tRegistrationMarkTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigQuantity")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Quantity"), fetchValueFromTextFields(quantityTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueofAircraftWithStandardInstrumentsAndeEuipments")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ValueofAircraftWithStandardInstrumentsAndeEuipments"), fetchValueFromList(valueOfAircraftWithStandardInstrumentsAndEquipmentsTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTotalAgreedValue")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TotalAgreedValue"), fetchValueFromTextFields(totalAgreedValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalAreaLimit")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("GeographicalAreaLimit"), fetchValueFromTextFields(geographicalAreaLimitTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigAHPolicyNo")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("AHPolicyNo"), fetchValueFromTextFields(aHPolicyNoTextField), AssertionType.WARNING);
			}
			//****************PA(CHINTAN)*******************
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDesignationOfMembers")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("DesignationOfMembers"), fetchValueFromList(designationOfMembersDropDown), AssertionType.WARNING);
			}
			//Prod= AD
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigHarPolicyNumberForTheInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("HarPolicyNumberForTheInsured"), fetchValueFromTextFields(harPolicyNumberForTheInsuredTextField), AssertionType.WARNING);
			}
			//Prod= AE
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigExcessLiabilitySumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ExcessLiabilitySumInsured"), fetchValueFromTextFields(excessLiabilitySumInsuredTextField), AssertionType.WARNING);
			}
			//Prod= AG
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigIsThereAnyMedicalHistoryForTheMember")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("IsThereAnyMedicalHistoryForTheMember"), fetchValueFromList(isThereAnyMedicalHistoryForTheMemberWhatsoeverDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigProvideTheDetailsOfTheMedicalIllness")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ProvideTheDetailsOfTheMedicalIllness"), fetchValueFromTextFields(provideTheDetailsOfTheMedicalIllnessTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPeriodForWhichTheLicenseIsInvalidated")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("PeriodForWhichTheLicenseIsInvalidated"), fetchValueFromTextFields(periodForWhichTheLicenseIsInvalidatedInDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDateOfLastRenewalOfTheLicense")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAvtEntity.getStringValueForField("DateOfLastRenewalOfTheLicense")) ,fetchValueFromTextFields(dateOfLastRenewalOfTheLicenseTextField),AssertionType.WARNING);
			}
			//Prod= AH
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTypeOfAircraft")){
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TypeOfAircraft"), fetchValueFromList(typeOfAircraftDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNameOfTheManufacturer")){
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("NameOfTheManufacturer"), fetchValueFromTextFields(nameOfTheManufacturerTextField), AssertionType.WARNING);
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigYearOfMake")){
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("YearOfMake"), fetchValueFromList(yearOfMakeDropDown), AssertionType.WARNING);
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigRegistrationMark")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("RegistrationMark"), fetchValueFromTextFields(registrationMarkTextField), AssertionType.WARNING);
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPassengerCapacity")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("PassengerCapacity"), fetchValueFromTextFields(passengerCapacityTextField), AssertionType.WARNING);
			}

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueOfAircraftWithStandardInsAndEquip")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ValueOfAircraftWithStandardInsAndEquip"), fetchValueFromTextFields(valueOfAircraftWithStandardInsAndEquipTextField), AssertionType.WARNING);
			}


			if (polInsIntAvtEntity.getBooleanValueForField("ConfigWhetherClauseAVN52EIsRequired")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("WhetherClauseAVN52EIsRequired"), fetchValueFromList(whetherClauseAVN52EIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLoadingFor52E")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("LoadingFor52E"), fetchValueFromTextFields(loadingFor52ETextField), AssertionType.WARNING);
			}
			//PROD - AI
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigBasicRateForPremiumCalculation")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("BasicRateForPremiumCalculation"), fetchValueFromTextFields(basicRateForPremiumCalculationTextField), AssertionType.WARNING);
			}
			//prod AS
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesAllRiskSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SparesAllRiskSumInsured"), fetchValueFromTextFields(sparesAllRiskSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSparesAllRiskPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SparesAllRiskPremium"), fetchValueFromTextFields(sparesAllRiskPremiumTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLiabilitySumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("LiabilitySumInsured"), fetchValueFromTextFields(liabilitySumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigLiabilityPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("LiabilityPremium"), fetchValueFromTextFields(liabilityPremiumTextField), AssertionType.WARNING);
			}
			// for labels
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigNoOfPersonPerDesignation")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("NoOfPersonPerDesignation"), fetchValueFromTextFields(noOfPersonPerDesignationTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigSumInsuredPerPerson")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("SumInsuredPerPerson"), fetchValueFromTextFields(sumInsuredPerPersonTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}	
			//*******************SR(CHINTAN)******************

			if (polInsIntAvtEntity.getBooleanValueForField("ConfigGeographicalLimitsForThePolicy")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("GeographicalLimitsForThePolicy"), fetchValueFromTextFields(geographicalLimitsForThePolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigDeductibleForThePolicy")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("DeductibleForThePolicy"), fetchValueFromTextFields(deductibleForThePolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigMaximumSparesValue")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("MaximumSparesValue"), fetchValueFromTextFields(maximumSparesValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigPremiumRateApplicableOn")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("PremiumRateApplicableOn"), fetchValueFromTextFields(premiumRateApplicablOonDropDown), AssertionType.WARNING);
			}
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigExcessLiabilityPremium")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ExcessLiabilityPremium"), fetchValueFromTextFields(excessLiabilityPremiumTextField), AssertionType.WARNING);
			}
			
			if (polInsIntAvtEntity.getBooleanValueForField("ConfigValueOfExtraEquipAndAccFittedInTheAircraft")) {
				assertReference.assertEquals(polInsIntAvtEntity.getStringValueForField("ValueOfExtraEquipAndAccFittedInTheAircraft"), fetchValueFromTextFields(valueOfExtraEquipmentAndAccessoriesFittedToOrCarriedInTheAircraftTextField), AssertionType.WARNING);
			}

		}
	}
	public void navigateTobackAttributePage(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntAvtEntity polInsIntAvtEntity) throws InterruptedException{
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigForwordButton")){		
			Thread.sleep(3000);
			//click(forwardButton);
			click(forwardButton);
			
		}
	}
	public void navigateToPolicy(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void navigateSaveButton(PolInsIntAvtEntity polInsIntAvtEntity){
		if (polInsIntAvtEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
		}
	}


	public void fillandSubmitPolicyInsIntAviation(PolInsIntAvtEntity polInsIntAvtEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAvtEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsIntAviation(polInsIntAvtEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntAvtEntity);
			navigateSaveButton(polInsIntAvtEntity);
			navigateTobackAttributePage(polInsIntAvtEntity);
			navigateToPolicy(polInsIntAvtEntity);
			navigateToAttribute(polInsIntAvtEntity);
			navigateToInsuredInterest(polInsIntAvtEntity);
			navigateToCoverage(polInsIntAvtEntity);
			navigateToLoan(polInsIntAvtEntity);
			navigateToClientDetails(polInsIntAvtEntity);
			navigateToRelation(polInsIntAvtEntity);
			navigateToPayment(polInsIntAvtEntity);
			navigateToFollowup(polInsIntAvtEntity);
			navigateToDocument(polInsIntAvtEntity);


		}
	}
}