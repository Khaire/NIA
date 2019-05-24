package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProp2Entity;
import com.aqm.staf.library.databin.PolInsVesselRiskDEntity;

public class PolicyInsuredIntrestVesselRiskDetailsMarineHull extends BasePage {
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

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement backwardButton;
	private PageElement saveButton;
	//**************AB************
	private PageElement nameOfTheVesselTextField;
	private PageElement coverPlaceDropDown;
	private PageElement	placeofAwaitingBreakupTextArea;
	private PageElement	placeOfBeachingTextArea;
	private PageElement	grossRegisteredTonnageGRTTextField;
	private PageElement	lightDisplacementTonnageLDTTextField;
	private PageElement	deadWeightTonnageDWTTextField;
	private PageElement	bollardHorsePowerBHPTextField;
	private PageElement	safeAnchorageRequiredDropDown;
	private PageElement specialDiscountRatePercentageTextField;
	private PageElement	sumInsuredTextField;

	//*********BR(CHINTAN)************
	private PageElement	deliveryDistanceNMTextField;
	private PageElement	basicHullRatePercentageTextField;
	private PageElement	basicMachineryRatePercentageTextField;
	private PageElement	monthlyHullRatePercentageTextField;
	private PageElement	monthlyMachineryRatePercentageTextField;
	private PageElement	ownersDiscountTextField;
	private PageElement	deTariffDiscountTextField;
	private PageElement	specialConditionsTextArea;	
	private PageElement	specialWarrantiesTextArea;
	private PageElement	specialWarranties2TextArea;
	private PageElement	specialWarranties3TextArea;
	private PageElement	specialWarranties4TextArea;

	//Mayur_product name= SB
	private PageElement deductibleTextField;
	private PageElement finalRateInPercentTextField;
	//Raj_product name= VI
	private PageElement makeTypeOfInlandVesselDropDown;
	private PageElement engineTypeOfInlandVesselDropDown;
	private PageElement bottomTypeDropDown;
	private PageElement collisionBulkHeadDropDown;
	private PageElement tradingLimitsForInlandVesselDropDown;
	private PageElement portNameTextArea;

	//CL-Yogesh
	private PageElement  totalGRTTextField;	 
	private PageElement  ownersNameTextArea;	 
	private PageElement  ownerAddressTextArea;	 
	private PageElement  sIForChartersLiabilityInsuranceTextField;	 
	private PageElement  basicRateForChartersLiabilityTextField;	 
	private PageElement  valuePerGrossRegisteredTonnageGRTTextField;
	private PageElement  isChartersBunkerInsuranceRequiredDropDown;	
	private PageElement  chartersBunkerInsuranceLiabilityTextField;	 
	private PageElement  rateForBunkerTextField;	 
	private PageElement  chartersBunkerDeductibleTextField;	
	private PageElement  isChartersFreightInsuranceRequiredDropDown;	
	private PageElement  chartersFreightInsuranceLiabilityTextField;	 
	private PageElement  rateForFreightTextField; 
	private PageElement  chartersFreightDeductibleTextField;
	private PageElement  seepageAndPollutionRiskCoverRequiredDropDown;	
	private PageElement  limitOfLiabilityForSeepageAndPollutionRiskTextField;	 
	private PageElement  rateInForSeepageAndPollutionRiskTextField;	 
	private PageElement  exclusionForContractualLiabilityToThirdPartiesRequiredDropDown;	
	private PageElement  discountForExclusionOfContractualLiabilityToThirdPartiesTextField;	 
	private PageElement  specialDiscountTextField;	 
	private PageElement  claimRatioTextField;	
	//CP-Repeated

	//WR --Rajkumar3rd Page
	private PageElement grtTextField;
	private PageElement classForOceanGoingVesselDropDown;
	private PageElement flagForOceanGoingVesselDropDown;
	private PageElement detailOfFlagTextArea;
	private PageElement valuationOfVesselDropDown;
	private PageElement nameOfTheCurrencyDropDown;
	private PageElement exchangeRateTextField;
	private PageElement sumInsuredInInrTextField;


	public PolicyInsuredIntrestVesselRiskDetailsMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
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
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("name=btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		//
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
		//**************AB************
		nameOfTheVesselTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Vessel')]/following::input"),"Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverPlaceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Cover Place')]/following::select"),"Cover Place", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		placeofAwaitingBreakupTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Place of Awaiting Breakup')]/following::TextArea"),"Place of Awaiting Breakup", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfBeachingTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Place of Beaching')]/following::TextArea"),"Place of Beaching", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossRegisteredTonnageGRTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Gross Registered Tonnage (GRT)')]/following::input"),"Gross Registered Tonnage (GRT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lightDisplacementTonnageLDTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Light Displacement Tonnage (LDT)')]/following::input"),"Light Displacement Tonnage (LDT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deadWeightTonnageDWTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Dead Weight Tonnage (DWT)')]/following::input"),"Dead Weight Tonnage (DWT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bollardHorsePowerBHPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bollard Horse Power (BHP)')]/following::input"),"Bollard Horse Power (BHP)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		safeAnchorageRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Safe Anchorage required')]/following::select"),"Safe Anchorage required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialDiscountRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Special Discount Rate(%)')]/following::input"),"Special Discount Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//*********BR(CHINTAN)************
		deductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible')]/following::input"),"Deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deliveryDistanceNMTextField=new PageElement(By.xpath("//td//div[contains(text(),'Delivery Distance(NM)')]/following::input"),"Delivery Distance(NM)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicHullRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Basic Hull Rate (in %)')]/following::input"),"Basic Hull Rate (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicMachineryRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Basic Machinery Rate (in %)')]/following::input"),"Basic Machinery Rate (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		monthlyHullRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Monthly Hull Rate (in %)')]/following::input"),"Monthly Hull Rate (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		monthlyMachineryRatePercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Monthly Machinery Rate (in %)')]/following::input"),"Monthly Machinery Rate (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Owners Discount')]/following::input"),"Owners Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deTariffDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'De Tariff Discount')]/following::input"),"De Tariff Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::TextArea"),"Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarrantiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties')]/following::TextArea"),"Special Warranties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties2TextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 2')]/following::TextArea"),"Special Warranties 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties3TextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 3')]/following::TextArea"),"Special Warranties 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		specialWarranties4TextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 4')]/following::TextArea"),"Special Warranties 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_product name= SB
		deductibleTextField= new PageElement(By.xpath("//td//div[contains(text(),'')]/following::input"), " TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		finalRateInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'')]/following::input"), " TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Raj_product name= VI
		makeTypeOfInlandVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Make Type of Inland Vessel')]/following::select"), "Make Type of Inland Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineTypeOfInlandVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Engine Type of Inland Vessel')]/following::select"), "Engine Type of Inland Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		bottomTypeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Bottom Type')]/following::select"), "Bottom Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		collisionBulkHeadDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Collision BulkHead')]/following::select"), "Collision BulkHead DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tradingLimitsForInlandVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Trading Limits for Inland Vessel')]/following::select"), "Trading Limits for Inland Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		portNameTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Port Name')]/following::TextArea"), "Port Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//CL-Yogesh
		totalGRTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total GRT')]/following::input"), "Total GRT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Owners Name')]/following::TextArea"), "Owners Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerAddressTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Owner Address')]/following::TextArea"), "Owner Address TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sIForChartersLiabilityInsuranceTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Charters Liability Insurance')]/following::input"), "SI for Charters Liability Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicRateForChartersLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Basic Rate for Charters Liability')]/following::input"), "Basic Rate for Charters Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valuePerGrossRegisteredTonnageGRTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value per Gross Registered Tonnage (GRT)')]/following::input"), "Value per Gross Registered Tonnage (GRT) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isChartersBunkerInsuranceRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Charters Bunker insurance required')]/following::select"), "Is Charters Bunker insurance required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		chartersBunkerInsuranceLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Bunker insurance Liability')]/following::input"), "Charters Bunker insurance Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForBunkerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate for Bunker')]/following::input"), "Rate for Bunker TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersBunkerDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Bunker deductible')]/following::input"), "Charters Bunker deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isChartersFreightInsuranceRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Charters Freight insurance required')]/following::select"), "Is Charters Freight insurance required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		chartersFreightInsuranceLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Freight insurance Liability')]/following::input"), "Charters Freight insurance Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForFreightTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate for Freight')]/following::input"), "Rate for Freight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersFreightDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Freight deductible')]/following::input"), "Charters Freight deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seepageAndPollutionRiskCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Seepage and Pollution Risk Cover required')]/following::select"), "Seepage and Pollution Risk Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		limitOfLiabilityForSeepageAndPollutionRiskTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit of Liability for Seepage and Pollution Risk')]/following::input"), "Limit of Liability for Seepage and Pollution Risk TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateInForSeepageAndPollutionRiskTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate (in %) for Seepage and Pollution Risk')]/following::input"), "Rate (in %) for Seepage and Pollution Risk TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exclusionForContractualLiabilityToThirdPartiesRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Exclusion for Contractual Liability to Third Parties required?')]/following::select"), "Exclusion for Contractual Liability to Third Parties required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		discountForExclusionOfContractualLiabilityToThirdPartiesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount for Exclusion of Contractual Liability to Third Parties')]/following::input"), "Discount for Exclusion of Contractual Liability to Third Parties TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Special Discount')]/following::input"), "Special Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Ratio')]/following::input"), "Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		grtTextField=new PageElement(By.xpath("//td//div[contains(text(),'GRT')]/following::input"), "GRT Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classForOceanGoingVesselDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Class for Ocean going Vessel')]/following::select"), "Class for Ocean going Vessel List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		flagForOceanGoingVesselDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Flag for Ocean Going Vessel')]/following::select"), "Flag for Ocean Going Vessel List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailOfFlagTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Detail of flag')]/following::TextArea"), "Detail of flag TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valuationOfVesselDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Valuation of vessel')]/following::select"), "Valuation of vessel List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheCurrencyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Currency')]/following::select"), "Name of the Currency List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		exchangeRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Exchange rate')]/following::input"), "Exchange rate Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredInInrTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured in INR')]/following::input"), "Sum Insured in INR TLabel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


	}

	public void fillPolicyInsuredIntrestVesselRiskDetailsMarineHull(PolInsVesselRiskDEntity polInsVesselRiskDEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsVesselRiskDEntity.getAction().equalsIgnoreCase("add") || polInsVesselRiskDEntity.getAction().equalsIgnoreCase("edit")){
			//**************AB************
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				clearAndSendKeys(nameOfTheVesselTextField, polInsVesselRiskDEntity.getStringValueForField("NameOfTheVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigCoverPlace")) {
				selectValueFromList(coverPlaceDropDown, polInsVesselRiskDEntity.getStringValueForField("CoverPlace"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPlaceofAwaitingBreakup")) {
				clearAndSendKeys(placeofAwaitingBreakupTextArea, polInsVesselRiskDEntity.getStringValueForField("PlaceofAwaitingBreakup"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPlaceOfBeaching")) {
				clearAndSendKeys(placeOfBeachingTextArea, polInsVesselRiskDEntity.getStringValueForField("PlaceOfBeaching"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
				clearAndSendKeys(grossRegisteredTonnageGRTTextField, polInsVesselRiskDEntity.getStringValueForField("GrossRegisteredTonnageGRT"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDT")) {
				clearAndSendKeys(lightDisplacementTonnageLDTTextField, polInsVesselRiskDEntity.getStringValueForField("LightDisplacementTonnageLDT"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
				clearAndSendKeys(deadWeightTonnageDWTTextField, polInsVesselRiskDEntity.getStringValueForField("DeadWeightTonnageDWT"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBollardHorsePowerBHP")) {
				clearAndSendKeys(bollardHorsePowerBHPTextField, polInsVesselRiskDEntity.getStringValueForField("BollardHorsePowerBHP"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSafeAnchorageRequired")) {
				selectValueFromList(safeAnchorageRequiredDropDown, polInsVesselRiskDEntity.getStringValueForField("SafeAnchorageRequired"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialDiscountRatePercentage")) {
				clearAndSendKeys(specialDiscountRatePercentageTextField, polInsVesselRiskDEntity.getStringValueForField("SpecialDiscountRatePercentage"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsVesselRiskDEntity.getStringValueForField("SumInsured"));
			}

			//*********BR(CHINTAN)************
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeliveryDistanceNM")) {
				clearAndSendKeys(deliveryDistanceNMTextField, polInsVesselRiskDEntity.getStringValueForField("DeliveryDistanceNM"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicHullRatePercentage")) {
				clearAndSendKeys(basicHullRatePercentageTextField, polInsVesselRiskDEntity.getStringValueForField("BasicHullRatePercentage"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicMachineryRatePercentage")) {
				clearAndSendKeys(basicMachineryRatePercentageTextField, polInsVesselRiskDEntity.getStringValueForField("BasicMachineryRatePercentage"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMonthlyHullRatePercentage")) {
				clearAndSendKeys(monthlyHullRatePercentageTextField, polInsVesselRiskDEntity.getStringValueForField("MonthlyHullRatePercentage"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMonthlyMachineryRatePercentage")) {
				clearAndSendKeys(monthlyMachineryRatePercentageTextField, polInsVesselRiskDEntity.getStringValueForField("MonthlyMachineryRatePercentage"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				clearAndSendKeys(ownersDiscountTextField, polInsVesselRiskDEntity.getStringValueForField("OwnersDiscount"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				clearAndSendKeys(deTariffDiscountTextField, polInsVesselRiskDEntity.getStringValueForField("DeTariffDiscount"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsVesselRiskDEntity.getStringValueForField("SpecialConditions"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				clearAndSendKeys(specialWarrantiesTextArea, polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				clearAndSendKeys(specialWarranties2TextArea, polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties2"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				clearAndSendKeys(specialWarranties3TextArea, polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties3"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				clearAndSendKeys(specialWarranties4TextArea, polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties4"));
			}

			//Mayur_product name= SB
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, polInsVesselRiskDEntity.getStringValueForField("Deductible"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigFinalRateInPercent")) {
				clearAndSendKeys(finalRateInPercentTextField, polInsVesselRiskDEntity.getStringValueForField("FinalRateInPercent"));
			}
			//Raj_product name= VI
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMakeTypeOfInlandVessel")) {
				selectValueFromList(makeTypeOfInlandVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("MakeTypeOfInlandVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigEngineTypeOfInlandVessel")) {
				selectValueFromList(engineTypeOfInlandVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("EngineTypeOfInlandVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBottomType")) {
				selectValueFromList(bottomTypeDropDown, polInsVesselRiskDEntity.getStringValueForField("BottomType"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigCollisionBulkHead")) {
				selectValueFromList(collisionBulkHeadDropDown, polInsVesselRiskDEntity.getStringValueForField("CollisionBulkHead"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigTradingLimitsForInlandVessel")) {
				selectValueFromList(tradingLimitsForInlandVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("TradingLimitsForInlandVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPortName")) {
				clearAndSendKeys(portNameTextArea, polInsVesselRiskDEntity.getStringValueForField("PortName"));
			}
			//CL-Yogesh
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigTotalGRT")) {
				clearAndSendKeys(totalGRTTextField, polInsVesselRiskDEntity.getStringValueForField("TotalGRT"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnersName")) {
				clearAndSendKeys(ownersNameTextArea, polInsVesselRiskDEntity.getStringValueForField("OwnersName"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnerAddress")) {
				clearAndSendKeys(ownerAddressTextArea, polInsVesselRiskDEntity.getStringValueForField("OwnerAddress"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSIForChartersLiabilityInsurance")) {
				clearAndSendKeys(sIForChartersLiabilityInsuranceTextField, polInsVesselRiskDEntity.getStringValueForField("SIForChartersLiabilityInsurance"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicRateForChartersLiability")) {
				clearAndSendKeys(basicRateForChartersLiabilityTextField, polInsVesselRiskDEntity.getStringValueForField("BasicRateForChartersLiability"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigValuePerGrossRegisteredTonnageGRT")) {
				clearAndSendKeys(valuePerGrossRegisteredTonnageGRTTextField, polInsVesselRiskDEntity.getStringValueForField("ValuePerGrossRegisteredTonnageGRT"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigIsChartersBunkerInsuranceRequired")) {
				selectValueFromList(isChartersBunkerInsuranceRequiredDropDown, polInsVesselRiskDEntity.getStringValueForField("IsChartersBunkerInsuranceRequired"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersBunkerInsuranceLiability")) {
				clearAndSendKeys(chartersBunkerInsuranceLiabilityTextField, polInsVesselRiskDEntity.getStringValueForField("ChartersBunkerInsuranceLiability"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateForBunker")) {
				clearAndSendKeys(rateForBunkerTextField, polInsVesselRiskDEntity.getStringValueForField("RateForBunker"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersBunkerDeductible")) {
				clearAndSendKeys(chartersBunkerDeductibleTextField, polInsVesselRiskDEntity.getStringValueForField("ChartersBunkerDeductible"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigIsChartersFreightInsuranceRequired")) {
				selectValueFromList(isChartersFreightInsuranceRequiredDropDown, polInsVesselRiskDEntity.getStringValueForField("IsChartersFreightInsuranceRequired"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersFreightInsuranceLiability")) {
				clearAndSendKeys(chartersFreightInsuranceLiabilityTextField, polInsVesselRiskDEntity.getStringValueForField("ChartersFreightInsuranceLiability"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateForFreight")) {
				clearAndSendKeys(rateForFreightTextField, polInsVesselRiskDEntity.getStringValueForField("RateForFreight"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersFreightDeductible")) {
				clearAndSendKeys(chartersFreightDeductibleTextField, polInsVesselRiskDEntity.getStringValueForField("ChartersFreightDeductible"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSeepageAndPollutionRiskCoverRequired")) {
				selectValueFromList(seepageAndPollutionRiskCoverRequiredDropDown, polInsVesselRiskDEntity.getStringValueForField("SeepageAndPollutionRiskCoverRequired"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigLimitOfLiabilityForSeepageAndPollutionRisk")) {
				clearAndSendKeys(limitOfLiabilityForSeepageAndPollutionRiskTextField, polInsVesselRiskDEntity.getStringValueForField("LimitOfLiabilityForSeepageAndPollutionRisk"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateInForSeepageAndPollutionRisk")) {
				clearAndSendKeys(rateInForSeepageAndPollutionRiskTextField, polInsVesselRiskDEntity.getStringValueForField("RateInForSeepageAndPollutionRisk"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigExclusionForContractualLiabilityToThirdPartiesRequired")) {
				selectValueFromList(exclusionForContractualLiabilityToThirdPartiesRequiredDropDown, polInsVesselRiskDEntity.getStringValueForField("ExclusionForContractualLiabilityToThirdPartiesRequired"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDiscountForExclusionOfContractualLiabilityToThirdParties")) {
				clearAndSendKeys(discountForExclusionOfContractualLiabilityToThirdPartiesTextField, polInsVesselRiskDEntity.getStringValueForField("DiscountForExclusionOfContractualLiabilityToThirdParties"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				clearAndSendKeys(specialDiscountTextField, polInsVesselRiskDEntity.getStringValueForField("SpecialDiscount"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigClaimRatio")) {
				clearAndSendKeys(claimRatioTextField, polInsVesselRiskDEntity.getStringValueForField("ClaimRatio"));
			}
			//WR-Rajkumar--3rd page

			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigGrt")) {
				clearAndSendKeys(grtTextField, polInsVesselRiskDEntity.getStringValueForField("Grt"));
			}	
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigClassForOceanGoingVessel")) {
				selectValueFromList(classForOceanGoingVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("ClassForOceanGoingVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigFlagForOceanGoingVessel")) {
				selectValueFromList(flagForOceanGoingVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("FlagForOceanGoingVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDetailOfFlag")) {
				clearAndSendKeys(detailOfFlagTextArea, polInsVesselRiskDEntity.getStringValueForField("DetailOfFlag"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigValuationOfVessel")) {
				selectValueFromList(valuationOfVesselDropDown, polInsVesselRiskDEntity.getStringValueForField("ValuationOfVessel"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigNameOfTheCurrency")) {
				selectValueFromList(nameOfTheCurrencyDropDown, polInsVesselRiskDEntity.getStringValueForField("NameOfTheCurrency"));
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigExchangeRate")) {
				clearAndSendKeys(exchangeRateTextField, polInsVesselRiskDEntity.getStringValueForField("ExchangeRate"));
			}


		}
		else if(polInsVesselRiskDEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//**************AB************
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("NameOfTheVessel"),fetchValueFromTextFields(nameOfTheVesselTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigCoverPlace")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("CoverPlace"),fetchValueFromList(coverPlaceDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPlaceofAwaitingBreakup")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("PlaceofAwaitingBreakup"),fetchValueFromTextFields(placeofAwaitingBreakupTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPlaceOfBeaching")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("PlaceOfBeaching"),fetchValueFromTextFields(placeOfBeachingTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("GrossRegisteredTonnageGRT"),fetchValueFromTextFields(grossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDT")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("LightDisplacementTonnageLDT"),fetchValueFromTextFields(lightDisplacementTonnageLDTTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("DeadWeightTonnageDWT"),fetchValueFromTextFields(deadWeightTonnageDWTTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBollardHorsePowerBHP")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("BollardHorsePowerBHP"),fetchValueFromTextFields(bollardHorsePowerBHPTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSafeAnchorageRequired")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SafeAnchorageRequired"),fetchValueFromList(safeAnchorageRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialDiscountRatePercentage")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialDiscountRatePercentage"),fetchValueFromTextFields(specialDiscountRatePercentageTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			//*********BR(CHINTAN)************
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeliveryDistanceNM")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("DeliveryDistanceNM"),fetchValueFromTextFields(deliveryDistanceNMTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicHullRatePercentage")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("BasicHullRatePercentage"),fetchValueFromTextFields(basicHullRatePercentageTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicMachineryRatePercentage")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("BasicMachineryRatePercentage"),fetchValueFromTextFields(basicMachineryRatePercentageTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMonthlyHullRatePercentage")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("MonthlyHullRatePercentage"),fetchValueFromTextFields(basicMachineryRatePercentageTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMonthlyMachineryRatePercentage")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("MonthlyMachineryRatePercentage"),fetchValueFromTextFields(monthlyMachineryRatePercentageTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("OwnersDiscount"),fetchValueFromTextFields(ownersDiscountTextField), AssertionType.WARNING);
			}

			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("DeTariffDiscount"),fetchValueFromTextFields(deTariffDiscountTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialConditions"),fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties"),fetchValueFromTextFields(specialWarrantiesTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties2"),fetchValueFromTextFields(specialWarranties2TextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties3"),fetchValueFromTextFields(specialWarranties3TextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialWarranties4"),fetchValueFromTextFields(specialWarranties4TextArea), AssertionType.WARNING);
			}
			//Mayur_product name= SB
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigFinalRateInPercent")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("FinalRateInPercent"), fetchValueFromTextFields(finalRateInPercentTextField), AssertionType.WARNING);
			}
			//Raj_product name= VI
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMakeTypeOfInlandVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("MakeTypeOfInlandVessel"), fetchValueFromList(makeTypeOfInlandVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigEngineTypeOfInlandVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("EngineTypeOfInlandVessel"), fetchValueFromList(engineTypeOfInlandVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBottomType")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("BottomType"), fetchValueFromList(bottomTypeDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigCollisionBulkHead")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("CollisionBulkHead"), fetchValueFromList(collisionBulkHeadDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigTradingLimitsForInlandVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("TradingLimitsForInlandVessel"), fetchValueFromList(tradingLimitsForInlandVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPortName")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("PortName"), fetchValueFromTextFields(portNameTextArea), AssertionType.WARNING);
			}
			//CL-Yogesh
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigTotalGRT")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("TotalGRT"), fetchValueFromTextFields(totalGRTTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnersName")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("OwnersName"), fetchValueFromTextFields(ownersNameTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigOwnerAddress")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("OwnerAddress"), fetchValueFromTextFields(ownerAddressTextArea), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSIForChartersLiabilityInsurance")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SIForChartersLiabilityInsurance"), fetchValueFromTextFields(sIForChartersLiabilityInsuranceTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBasicRateForChartersLiability")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("BasicRateForChartersLiability"), fetchValueFromTextFields(basicRateForChartersLiabilityTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigValuePerGrossRegisteredTonnageGRT")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ValuePerGrossRegisteredTonnageGRT"), fetchValueFromTextFields(valuePerGrossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigIsChartersBunkerInsuranceRequired")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("IsChartersBunkerInsuranceRequired"), fetchValueFromList(isChartersBunkerInsuranceRequiredDropDown), AssertionType.WARNING);
			}			
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersBunkerInsuranceLiability")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ChartersBunkerInsuranceLiability"), fetchValueFromTextFields(chartersBunkerInsuranceLiabilityTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateForBunker")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("RateForBunker"), fetchValueFromTextFields(rateForBunkerTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersBunkerDeductible")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ChartersBunkerDeductible"), fetchValueFromTextFields(chartersBunkerDeductibleTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigIsChartersFreightInsuranceRequired")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("IsChartersFreightInsuranceRequired"), fetchValueFromList(isChartersFreightInsuranceRequiredDropDown), AssertionType.WARNING);
			}			
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersFreightInsuranceLiability")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ChartersFreightInsuranceLiability"), fetchValueFromTextFields(chartersFreightInsuranceLiabilityTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateForFreight")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("RateForFreight"), fetchValueFromTextFields(rateForFreightTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigChartersFreightDeductible")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ChartersFreightDeductible"), fetchValueFromTextFields(chartersFreightDeductibleTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSeepageAndPollutionRiskCoverRequired")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SeepageAndPollutionRiskCoverRequired"), fetchValueFromList(seepageAndPollutionRiskCoverRequiredDropDown), AssertionType.WARNING);
			}			
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigLimitOfLiabilityForSeepageAndPollutionRisk")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("LimitOfLiabilityForSeepageAndPollutionRisk"), fetchValueFromTextFields(limitOfLiabilityForSeepageAndPollutionRiskTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRateInForSeepageAndPollutionRisk")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("RateInForSeepageAndPollutionRisk"), fetchValueFromTextFields(rateInForSeepageAndPollutionRiskTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigExclusionForContractualLiabilityToThirdPartiesRequired")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ExclusionForContractualLiabilityToThirdPartiesRequired"), fetchValueFromList(exclusionForContractualLiabilityToThirdPartiesRequiredDropDown), AssertionType.WARNING);
			}			
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDiscountForExclusionOfContractualLiabilityToThirdParties")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("DiscountForExclusionOfContractualLiabilityToThirdParties"), fetchValueFromTextFields(discountForExclusionOfContractualLiabilityToThirdPartiesTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigVoyageFrom")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigClaimRatio")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ClaimRatio"), fetchValueFromTextFields(claimRatioTextField), AssertionType.WARNING);
			}

			//WR-Rajkumar--3rd page
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigGrt")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("Grt"), fetchValueFromTextFields(grtTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigClassForOceanGoingVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ClassForOceanGoingVessel"), fetchValueFromList(classForOceanGoingVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigFlagForOceanGoingVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("FlagForOceanGoingVessel"), fetchValueFromList(flagForOceanGoingVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDetailOfFlag")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("DetailOfFlag"), fetchValueFromTextFields(detailOfFlagTextArea), AssertionType.WARNING);
			}	
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigValuationOfVessel")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ValuationOfVessel"), fetchValueFromList(valuationOfVesselDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigNameOfTheCurrency")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("NameOfTheCurrency"), fetchValueFromList(nameOfTheCurrencyDropDown), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigExchangeRate")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("ExchangeRate"), fetchValueFromTextFields(exchangeRateTextField), AssertionType.WARNING);
			}
			if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSumInsuredInInr")) {
				assertReference.assertEquals(polInsVesselRiskDEntity.getStringValueForField("SumInsuredInInr"), fetchValueFromFields(sumInsuredInInrTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateTobackAttributePage(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetails(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}
	public void navigateToPolicy(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnSaveButton(PolInsVesselRiskDEntity polInsVesselRiskDEntity){
		if (polInsVesselRiskDEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitPolicyInsuredIntrestVesselRiskDetailsMarineHull(PolInsVesselRiskDEntity polInsVesselRiskDEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsVesselRiskDEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestVesselRiskDetailsMarineHull(polInsVesselRiskDEntity, assertReference);

			navigateTobackAttributePage(polInsVesselRiskDEntity);
			navigateToPolicy(polInsVesselRiskDEntity);
			navigateToAttribute(polInsVesselRiskDEntity);
			navigateToInsuredInterest(polInsVesselRiskDEntity);
			navigateToCoverage(polInsVesselRiskDEntity);
			navigateToLoan(polInsVesselRiskDEntity);
			navigateToClientDetails(polInsVesselRiskDEntity);
			navigateToRelation(polInsVesselRiskDEntity);
			navigateToPayment(polInsVesselRiskDEntity);
			navigateToFollowup(polInsVesselRiskDEntity);
			navigateToDocument(polInsVesselRiskDEntity);
			navigateTobackAttributePage(polInsVesselRiskDEntity);
			clickOnSaveButton(polInsVesselRiskDEntity);
			//
			navigateToInsuredInterestAttributes(polInsVesselRiskDEntity);
			navigateToInsuredInterestAttachCoverages(polInsVesselRiskDEntity);
			navigateToInsuredInterestRelations(polInsVesselRiskDEntity);
			navigateToInsuredInterestPayments(polInsVesselRiskDEntity);
			clickNextButtonPolicyAttributeCSPolicyDetails(polInsVesselRiskDEntity);
		}
	}
}
