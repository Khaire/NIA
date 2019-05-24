package com.aqm.staf.library.pages.marineHull;

import com.aqm.staf.framework.core.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntVessInformPLREntity;
import com.gargoylesoftware.htmlunit.Page;

public class PolicyInsuredIntrestVesselInformationPLR extends BasePage{
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

	private PageElement nextAttributePageTitle2;
	private PageElement nextAttributePageTitle3;

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

	private PageElement saveButton;
	//CL-Harshit
	//1st and 2nd Page
	private PageElement natureofCharterPartyDropDown;
	private PageElement agreementPeriodFromTextField;
	private PageElement agreementPeriodToTextField;
	//3rd Page
	private PageElement vesselDetailsButton;
	private PageElement typeofVesselsDropDown;
	private PageElement vesselNameTextArea;
	private PageElement yearofBuiltDropDown;
	private PageElement grossRegisteredTonnageGRTTextField;
	private PageElement deadWeightTonnageDWTTextField;
	private PageElement breakHorsePowerBHP;
	private PageElement addButton;
	private PageElement deleteButton;
	private PageElement saveButtonAdd;
	private PageElement closeButton;
	//4th Page
	private PageElement totalGRTTextField;
	private PageElement ownersNameTextArea;
	private PageElement ownerAddressTextArea;
	private PageElement siforChartersLiabilityInsuranceTextField;
	private PageElement valueperGrossRegisteredTonnageGRTTextField;
	private PageElement isChartersBunkerinsurancerequiredDropDown;
	private PageElement rateforFreightTextField;
	private PageElement limitofLiabilityforSeepageandPollutionRiskTextField;
	private PageElement exclusionforContractualLiabilitytoThirdPartiesrequiredDropDown;
	private PageElement discountforExclusionofContractualLiabilitytoThirdPartiesTextField;
	private PageElement specialDiscountTextFieldCL;
	private PageElement claimRatioTextField;
	//5th Page
	private PageElement whetherHandMCoveredDropDown;
	private PageElement chartersLiabilitydeductibleTextField;
	private PageElement protectionandIndemnityInsurancerequiredDropDown;

	//HM
	//PAGE1
	private PageElement typeOfVesselsDropDropdown;
	private PageElement subTypeOfDredgerDropdown;
	private PageElement vesselSubTypeDescriptionTextarea;
	private PageElement iMONoTextarea;
	private PageElement categoryofVesselDropDropdown;
	//page2
	private PageElement nameOfTheInsuredTextarea;
	private PageElement detailsOfInterestButton;
	private PageElement yearOfMakeDropdown;
	private PageElement whetherIsVesselRebuiltDropdown;
	private PageElement nameOfTheVesselTextfield;
	private PageElement assigneemortgageeTextarea;
	private PageElement portOfRegistrationAndAuthorityTextfield;
	private PageElement lightDisplacementTonnageofVesselTextfield;
	private PageElement dateofBeachingofVesselTextField;
	private PageElement placeTextarea;
	private PageElement dateofCommencementofBreakingTextField;
	private PageElement dateofCustomsClearanceTextField;
	private PageElement dateofCompletionExpectedTextField;
	private PageElement purchasePriceRsTextField;
	private PageElement customDutyRsTextField;
	private PageElement portChargeRsTextField;
	private PageElement anyGovernmentLevyRsTextField;
	private PageElement totalRsTextField;
	private PageElement valueRateinpercentTextField;
	private PageElement periodinMonthTextField;
	private PageElement rateperMonthsinpercentTextField;
	private PageElement specialDiscountTextField;

	//page3
	private PageElement gRTTextField;
	private PageElement makeTypeOfVesselDropDown;
	private PageElement engineTypeOfInlandDredgerOceanGoingDredgerDropDown;
	private PageElement tradingLimitsForInlandDredgeOceanGoingDredgerDropDown;
	private PageElement finalRateinpercentTextField;
	//p4
	private PageElement qualificationOfMasterTextField;
	private PageElement numberOfCrewTextField;
	private PageElement sumInsuredTextField;
	private PageElement conditionsForInlandDredgersOceanGoingDredgersDropDown;
	private PageElement warrantyForInlandDredgersOceanGoingDredgersDropDown;
	private PageElement widerWarrantiesTradingLimitsDropDown;
	private PageElement iRSDiscountDropDown;
	private PageElement isAdditinalPerilCoverRequiredDropDown;
	private PageElement  AdditionalPerilsdeductibleAmount;
	private PageElement  AdditionalPerilRate;
	//p5
	private PageElement specialConditionsTextarea;
	private PageElement specialWarrantiesTextarea;
	private PageElement specialWarranties2Textarea;
	private PageElement specialWarranties3Textarea;
	private PageElement specialWarranties4Textarea;
	private PageElement anyClaimExperienceForLast5YearsButton;
	private PageElement presentInsurerIfanyTextarea;
	private PageElement claimDetailButton;
	private PageElement hMDeductibleTextField;
	private PageElement isHOApprovalIsObtainedDropDown;
	private PageElement noClaimsDiscountTextField;
	private PageElement ownersDiscountTextField;
	private PageElement deTariffDiscountTextField;
	//P6
	private PageElement noOfShipsUnderFleetCategoryDropDown;
	private PageElement countryOfRegistrationTextField;
	private PageElement classClassificationCodeDropDown;
	private PageElement classAwarded1Textarea;
	private PageElement classAwarded2Textarea;
	private PageElement detailsOfEngineMachineryTextarea;
	private PageElement aggregateClaimRatioTextField;
	//anzaf for marine hull memeber attribute first page
	private PageElement HullandMachineryPolicy;
	private PageElement HullandMachineryPolicyNumber;
	private PageElement TypeofVesselforWarRisk;
	//anzaf for marine hull memeber attribute SECOND  page
	private PageElement SubTypeofOceanGoingVessel;
	private PageElement NameofInsuredInterest;
	private PageElement NameoftheVessel;
	private PageElement YearofBuilt;
	private PageElement YearofRebuilt;
	private PageElement AssigneeMortgagee;
	private PageElement PortofRegistrationAndAuthority;


	//anzaf for marine hull memeber attribute Third  page


	private PageElement GRTWR;
	private PageElement ClassforOceangoingVessel;
	private PageElement FlagforOceanGoingvessel;
	private PageElement Valuationofvessel;
	private PageElement SumInsured;
	private PageElement NameoftheCurrency;
	private PageElement Exchangerate;
	private PageElement SumInsuredinINR;
	//anzaf for marine hull memeber attribute fourth  page

	private PageElement NumberofCrewWr;
	private PageElement wrdeductible;
	private PageElement TradingRegions;
	//mohammad first page
	private PageElement AssistingVesselsinDistress;
	//second page 
	private PageElement	VoyageDurationforAssistingInlandDredger;
	//third page
	private PageElement VoyageDeductible;

	private PageElement SpecialConditions;
	private PageElement  SpecialWarranties;
	private PageElement  SpecialWarranties2;
	private PageElement  SpecialWarranties3; 
	private PageElement   SpecialWarranties4;
	private PageElement   CoverPlaceDropdown;
	private PageElement   PlaceofAwaitingBreakupTextField;
	private PageElement  LDTTextField;
	private PageElement  BHPTextField;
	private PageElement  SpecialDiscountRateTextField;
	private PageElement DeductibleTextField;
	private PageElement TotalActualPurchasePriceTextField;
	private PageElement TotalDutyPayableTextField;
	private PageElement RODiscountTextField;
	private PageElement VoyageDeductibleTextField;
	private PageElement VoyageFromTextField;
	private PageElement VoyageToTextField;
	private PageElement IntermediatePortTextField;
	private PageElement gRTVITextField;
	private PageElement BHPVITextField;
	private PageElement gRTTextField1;
	private PageElement BollardHorsePowerBHPTextField;

	public PolicyInsuredIntrestVesselInformationPLR(WebDriver driver, String pageName) {
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
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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

		//CL-Harshit
		//1st and 2nd Page
		natureofCharterPartyDropDown= new PageElement(By.name("propValues1"), "Nature Of Charter Party", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		agreementPeriodFromTextField= new PageElement(By.name("propValues2"), "Agreement Period From", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreementPeriodToTextField= new PageElement(By.name("propValues3"), "Agreement Period To", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//3rd Page
		vesselDetailsButton=new PageElement(By.name("propValues1"), "Vessel Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeofVesselsDropDown=new PageElement(By.name("Data_250229602112010_0"), "Type Of Vessels DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselNameTextArea=new PageElement(By.name("Data_213905105022010_0"), "Vessel Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearofBuiltDropDown=new PageElement(By.name("Data_52367619072005_0"), "Year Of Built DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		grossRegisteredTonnageGRTTextField=new PageElement(By.name("Data_232179827082010_0"), "Gross Registered Tonnage GRT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deadWeightTonnageDWTTextField=new PageElement(By.name("Data_876206022004_0"), "Dead Weight Tonnage DWT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakHorsePowerBHP=new PageElement(By.name("Data_250104202112010_0"), "Break HorsePower BHP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonAdd=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//4th Page
		totalGRTTextField=new PageElement(By.name("propValues1"), "Total GRT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersNameTextArea=new PageElement(By.name("propValues2"), "Owners Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerAddressTextArea=new PageElement(By.name("propValues3"), "Owner Address TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		siforChartersLiabilityInsuranceTextField=new PageElement(By.name("propValues4"), "SI for Charters Liability Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueperGrossRegisteredTonnageGRTTextField=new PageElement(By.name("propValues8"), "Value per Gross Registered Tonnage GRT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isChartersBunkerinsurancerequiredDropDown=new PageElement(By.name("propValues9"), "Is Charters Bunker insurance required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateforFreightTextField=new PageElement(By.name("propValues15"), "Rate for Freight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitofLiabilityforSeepageandPollutionRiskTextField=new PageElement(By.name("propValues18"), "Limit of Liability for Seepage and Pollution Risk TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exclusionforContractualLiabilitytoThirdPartiesrequiredDropDown=new PageElement(By.name("propValues20"), "Exclusion for Contractual Liability to ThirdParties required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		discountforExclusionofContractualLiabilitytoThirdPartiesTextField=new PageElement(By.name("propValues21"), "Discount for Exclusion of Contractual Liability to ThirdParties TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountTextFieldCL=new PageElement(By.name("propValues22"), "Special Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioTextField=new PageElement(By.name("propValues23"), "Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//5th Page
		whetherHandMCoveredDropDown=new PageElement(By.name("propValues1"), "Whether H and M Covered DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		chartersLiabilitydeductibleTextField=new PageElement(By.name("propValues3"), "Charters Liability deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		protectionandIndemnityInsurancerequiredDropDown=new PageElement(By.name("propValues4"), "Protection and Indemnity Insurance required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
		//HM//WR
		typeOfVesselsDropDropdown=new PageElement(By.xpath("//td//div[@id='Type of Vessels']/following::select[1]"), "Type of Vessels", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subTypeOfDredgerDropdown=new PageElement(By.xpath("//td//div[@id='Sub Type of Dredger']/following::select[1]"), "Sub Type of Dredger", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselSubTypeDescriptionTextarea=new PageElement(By.xpath("//td//div[@id='Vessel Sub Type description']/following::textarea[1]"), "Vessel Sub Type description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iMONoTextarea=new PageElement(By.xpath("//td//div[@id='IMO No.']/following::textarea"), "IMO No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		HullandMachineryPolicy=new PageElement(By.xpath("//td//div[starts-with(text(),'Hull and Machinery Policy Number')]/preceding::select[1]"), "Hull and Machinery Policy Number", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		HullandMachineryPolicyNumber=new PageElement(By.xpath("//td//div[starts-with(text(),'Hull and Machinery Policy Number')]/following::input[1]"), "Hull and Machinery Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TypeofVesselforWarRisk=new PageElement(By.xpath("//td//div[starts-with(text(),'Type of Vessel for War Risk')]/following::select[1]"), "Hull and Machinery Policy Number", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//wRsCOND PAGE eLEMENT WRITTEN BY ANZAF 
		SubTypeofOceanGoingVessel=new PageElement(By.xpath("//td//div[@id='Sub Type of Ocean Going Vessel']/following::select[1]"), "Sub Type of Ocean Going Vesse", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NameofInsuredInterest=new PageElement(By.xpath("//td//div[@id='Name of Insured Interest']/following::select[1]"), "Name of Insured Interest", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NameoftheVessel=new PageElement(By.xpath("//td//div[@id='Name of the Vessel']/following::input[1]"), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		YearofBuilt=new PageElement(By.xpath("//td//div[@id='Year of Built']/following::select[1]"), "Year of Buil", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		YearofRebuilt=new PageElement(By.xpath("//td//div[@id='Year of Rebuilt']/following::select[1]"), "Year of Rebuil", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		AssigneeMortgagee=new PageElement(By.xpath("//td//div[@id='Assignee/Mortgagee']/following::textarea[1]"), "Assignee/Mor", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PortofRegistrationAndAuthority=new PageElement(By.xpath("//td//div[@id='Port of Registration and Authority']/following::input[1]"), "Port of Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SB
		categoryofVesselDropDropdown =new PageElement(By.xpath("//td//div//select[@name='propValues2']"), "Category Of Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lightDisplacementTonnageofVesselTextfield =new PageElement(By.xpath("//td//div[@id='Light Displacement Tonnage (LDT) of Vessel']/following::input[1]"), "Light Displacement Tonnage (LDT) of Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofBeachingofVesselTextField =new PageElement(By.name("propValues3"), "Date Of Beaching Of Vessel TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeTextarea =new PageElement(By.name("propValues4"), "Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofCommencementofBreakingTextField=new PageElement(By.name("propValues5"), "Date Of Commencement Of Breaking TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofCustomsClearanceTextField=new PageElement(By.name("propValues6"), "Date Of Customs Clearance TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofCompletionExpectedTextField=new PageElement(By.name("propValues7"), "Date Of Completion Expected TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		purchasePriceRsTextField=new PageElement(By.name("propValues8"), "Purchase Price (Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		customDutyRsTextField=new PageElement(By.name("propValues9"), "Custom Duty (Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portChargeRsTextField=new PageElement(By.name("propValues10"), "Port Charge(Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyGovernmentLevyRsTextField=new PageElement(By.name("propValues11"), "Any Government Levy(Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalRsTextField=new PageElement(By.name("propValues12"), "Total (Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueRateinpercentTextField=new PageElement(By.name("propValues15"), "Value Rate(in percent)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodinMonthTextField=new PageElement(By.name("propValues16"), "Period (in Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateperMonthsinpercentTextField=new PageElement(By.name("propValues17"), "Rate per Months(in percent)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountTextField=new PageElement(By.name("propValues18"), "Special Discount(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//page2
		nameOfTheInsuredTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the insured", "textarea")), "Name of the insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfInterestButton=new PageElement(By.name("propValues2"),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearOfMakeDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Make", "select")), "Year of Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		whetherIsVesselRebuiltDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether is Vessel Rebuilt?", "select")), "Whether is Vessel Rebuilt", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheVesselTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Vessel", "input")), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assigneemortgageeTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assignee/Mortgagee", "textarea")), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfRegistrationAndAuthorityTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Port of Registration and Authority", "input")), "Port of Registration and Authority", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MOHD WRITTEN THIS CODE FOR THIRD PAGE OF MARINE HULL WR PRODUCT

		GRTWR=new PageElement(By.xpath(locatorforQuestionAnswerPanel("GRT", "input")), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClassforOceangoingVessel=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class for Ocean going Vessel", "select")), "Class for Ocean going Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		FlagforOceanGoingvessel=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flag for Ocean Going Vessel", "select")), "Flag for Ocean Going Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Valuationofvessel=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Valuation of vessel", "select")), "Valuation of vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NameoftheCurrency=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Currency", "select")), "Name of the Currency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Exchangerate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Exchange rate", "input")), "Exchange rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SumInsuredinINR=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in INR", "input")), "Sum Insured in INR", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//CoverPlaceDropdown=new PageElement(By.xpath(locatorforPanel("Cover Place", "select")), "Year of Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//page3
		gRTTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Gross Registered Tonnage (GRT)", "input")), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		gRTTextField1=new PageElement(By.xpath(locatorforQuestionAnswerPanel("GRT", "input")), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makeTypeOfVesselDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Make Type of Vessel", "select")), "Make Type of Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineTypeOfInlandDredgerOceanGoingDredgerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Engine Type of Inland Dredger/Ocean Going Dredger", "select")), "Engine Type of Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tradingLimitsForInlandDredgeOceanGoingDredgerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Trading Limits for Inland Dredger/Ocean going Dredger", "select")), "", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		finalRateinpercentTextField =new PageElement(By.name("propValues2"), "Final Rate inpercent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//asss

		NumberofCrewWr=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Crew", "input")), "Number of Crew", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		wrdeductible=new PageElement(By.xpath(locatorforQuestionAnswerPanel("deductible", "input")), "deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TradingRegions=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Trading Regions", "textarea")), "Trading Regions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		CoverPlaceDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Cover Place')]/following::select[1]"), "Cover Place", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);





		//p4
		qualificationOfMasterTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Qualification of Master", "input")), "Qualification of Master", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfCrewTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Crew", "input")), "Number of Crew", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		conditionsForInlandDredgersOceanGoingDredgersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Conditions for Inland Dredgers(or)Ocean Going Dredgers", "select")), "Conditions for Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		warrantyForInlandDredgersOceanGoingDredgersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Warranty for Inland Dredgers(or)Ocean Going Dredgers", "select")), "Warranty for Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		widerWarrantiesTradingLimitsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Wider Warranties/Trading Limits", "select")), "Wider Warranties", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iRSDiscountDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IRS Discount", "select")), "IRS", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAdditinalPerilCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Additinal Peril cover required", "select")), "Is Additinal Peril", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//	Anzaf Added new element of marine hull hm product 3rd pade 
		AdditionalPerilRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Perils Rate (%)", "input")), "Additional perl rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		AdditionalPerilsdeductibleAmount=new PageElement(By.xpath("//td//div[@id='Additional Perils deductible Amount']/following::input[1]"), "perl deductable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//p5
		specialConditionsTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions", "textarea")), "Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarrantiesTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties", "textarea")), "Warranties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties2Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 2", "textarea")), "Warranties 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties3Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 3", "textarea")), "Warranties 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties4Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 4", "textarea")), "Warranties 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyClaimExperienceForLast5YearsButton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		presentInsurerIfanyTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Present Insurer(If any)", "textarea")), "Present Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDetailButton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		hMDeductibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HM Deductible", "input")), "HM Deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isHOApprovalIsObtainedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is HO Approval is Obtained", "select")), "Is HO Approval", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noClaimsDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No Claims Discount", "input")), "No Claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Owners Discount", "input")), "Owners Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deTariffDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("De Tariff Discount", "input")), "De Tariff Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//P6
		noOfShipsUnderFleetCategoryDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. of Ships under Fleet Category", "select")), "No. of Ships under Fleet", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		countryOfRegistrationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Country of Registration", "input")), "Country of Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classClassificationCodeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Classification Code", "select")), "Class Classification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		classAwarded1Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Awarded 1", "textarea")), "Class Awarded 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classAwarded2Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Awarded 2", "textarea")), "Class Awarded 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfEngineMachineryTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Engine Machinery", "textarea")), "Details of Engine Machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aggregateClaimRatioTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Aggregate Claim Ratio", "input")), "Aggregate Claim Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		AssistingVesselsinDistress=new PageElement(By.xpath("//td//div[contains(text(),'Assisting Vessels in Distress')]/following::select[1]"), "Vessels in Distress", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//forward
		VoyageDurationforAssistingInlandDredger=new PageElement(By.xpath("//td//div[contains(text(),'Voyage Duration for Assisting Inland Dredger')]/following::select[1]"), "Voyage Duration for Assisting Inland ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//forward
		VoyageDeductible=new PageElement(By.xpath("//td//div[contains(text(),'Voyage Deductible')]/following::input[1]"),"Voyage Deductible ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialConditions=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea[1]"),"Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialWarranties=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 2')]/preceding::textarea[1]"), "Special Warranties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialWarranties2=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 2')]/following::textarea[1]"), "Special Warranties 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialWarranties3=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 3')]/following::textarea[1]"), "Special Warranties 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialWarranties4=new PageElement(By.xpath("//td//div[contains(text(),'Special Warranties 4')]/following::textarea[1]"), "Special Warranties 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PlaceofAwaitingBreakupTextField=new PageElement(By.xpath("//td//div[@id='Place of Awaiting Breakup']/following::textarea[1]"), "Place of Awaiting Breakup", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LDTTextField=new PageElement(By.xpath("//td//div[@id='Light Displacement Tonnage (LDT)']/following::input[1]"), "LDT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BHPTextField=new PageElement(By.xpath("//td//div[@id='Bollard Horse Power (BHP)']/following::input[1]"), "BHP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DeductibleTextField=new PageElement(By.xpath("//td//div[@id='deductible']/following::input[1]"), "deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialDiscountRateTextField=new PageElement(By.xpath("//td//div[@id='Special Discount Rate(%)']/following::input[1]"), "Special Discount Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalActualPurchasePriceTextField=new PageElement(By.xpath("//td//div[@id='Total Actual Purchase Price']/following::input[1]"), "Total Actual Purchase Price", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalDutyPayableTextField=new PageElement(By.xpath("//td//div[@id='Total Duty Payable']/following::input[1]"), "Total Duty Payable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RODiscountTextField=new PageElement(By.xpath("//td//div[@id='RO Discount(%)']/following::input[1]"), "RO Discount(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		VoyageDeductibleTextField=new PageElement(By.xpath("//td//div[@id='Voyage Deductible']/following::input[1]"), "Voyage Deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		VoyageFromTextField=new PageElement(By.xpath("//td//div[@id='Voyage From']/following::input[1]"), "Voyage From", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		VoyageToTextField=new PageElement(By.xpath("//td//div[@id='Voyage To']/following::input[1]"), "Voyage To", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IntermediatePortTextField=new PageElement(By.xpath("//td//div[@id='Intermediate Port']/following::input[1]"), "Intermediate Port", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		gRTVITextField=new PageElement(By.xpath("//td//div[@id='GRT']/following::input[1]"), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BHPVITextField=new PageElement(By.xpath("//td//div[@id='BHP']/following::input[1]"), "BHP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BollardHorsePowerBHPTextField=new PageElement(By.xpath("//td//div[@id='Bollard Horse Power (BHP)']/following::input[1]"), "Bollard Horse Power (BHP)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP0(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				selectValueFromList(typeOfVesselsDropDropdown, polInsIntVessInformPLREntity.getStringValueForField("TypeOfVessels"));
			}
			if (polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("SB")) {
				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCategoryofVessel")) {
					click(forwardButton);
					switchToFrame("display");
					selectValueFromList(categoryofVesselDropDropdown, polInsIntVessInformPLREntity.getStringValueForField("CategoryofVessel"));
				}
			}

			//this code is written by Anzaf for only marinehull member attribute frist page product 

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHullandMachineryPolecy")) {
				selectValueFromList(HullandMachineryPolicy, polInsIntVessInformPLREntity.getStringValueForField("HullandMachineryPolecy"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHullandMachineryPolicyNumber")) {
				clearAndSendKeys(HullandMachineryPolicyNumber, polInsIntVessInformPLREntity.getStringValueForField("HullandMachineryPolecyNumber"));


			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeofVesselforWarRisk")) {
				selectValueFromList(TypeofVesselforWarRisk, polInsIntVessInformPLREntity.getStringValueForField("TypeofVesselforWarR"));
			}

			//mohammad ADD OR EDIT for first page of insured interest marine hull PRODUCT (VI)

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssistingVesselsinDistress")) {
				selectValueFromList(AssistingVesselsinDistress, polInsIntVessInformPLREntity.getStringValueForField("AssistingVesselsinDistres"));
			}

			//CL-Harshit
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNatureofCharterParty")) {
				selectValueFromList(natureofCharterPartyDropDown, polInsIntVessInformPLREntity.getStringValueForField("NatureofCharterParty"));
				click(forwardButton);
				selectValueFromList(natureofCharterPartyDropDown, polInsIntVessInformPLREntity.getStringValueForField("NatureofCharterParty"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAgreementPeriodFrom")) {
				clearAndSendKeys(agreementPeriodFromTextField, polInsIntVessInformPLREntity.getStringValueForField("AgreementPeriodFrom"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAgreementPeriodTo")) {
				clearAndSendKeys(agreementPeriodToTextField, polInsIntVessInformPLREntity.getStringValueForField("AgreementPeriodTo"));
			}




			else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){



				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHullandMachineryPolecy")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("HullandMachineryPolecy"), fetchValueFromList(HullandMachineryPolicy), AssertionType.WARNING);
				}	

				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHullandMachineryPolicyNumber")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("HullandMachineryPolecyNumber"), fetchValueFromTextFields(HullandMachineryPolicyNumber), AssertionType.WARNING);
				}


				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeofVesselforWarRisk")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("HullandMachineryPolecy"), fetchValueFromList(TypeofVesselforWarRisk), AssertionType.WARNING);
				}	
				//mohammad verify for first page of insured interest marine hull PRODUCT (VI)

				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssistingVesselsinDistress")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AssistingVesselsinDistres"), fetchValueFromList(AssistingVesselsinDistress), AssertionType.WARNING);
				}
				if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNatureofCharterParty")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NatureofCharterParty"), fetchValueFromList(natureofCharterPartyDropDown), AssertionType.WARNING);

				}
				if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAgreementPeriodFrom")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AgreementPeriodFrom"), fetchValueFromList(agreementPeriodFromTextField), AssertionType.WARNING);
				}
				if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAgreementPeriodTo")) {
					assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AgreementPeriodTo"), fetchValueFromList(agreementPeriodToTextField), AssertionType.WARNING);
				}





			}



		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP1(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//PAGE1/

			/*if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				selectValueFromList(subTypeOfDredgerDropdown, polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"));
			}	*/
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				clearAndSendKeys(vesselSubTypeDescriptionTextarea, polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				clearAndSendKeys(iMONoTextarea, polInsIntVessInformPLREntity.getStringValueForField("IMONo"));
			}

			//mohammad


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeofOceanGoingVessel")) {
				selectValueFromList(SubTypeofOceanGoingVessel, polInsIntVessInformPLREntity.getStringValueForField("SubTypeofOceanGoingVesse"));
			}



			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameofInsuredInterest")) {
				selectValueFromList(NameofInsuredInterest, polInsIntVessInformPLREntity.getStringValueForField("NameofInsuredInteres"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofBuilt")) {
				selectValueFromList(YearofBuilt, polInsIntVessInformPLREntity.getStringValueForField("YearofBuil"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofRebuilt")) {
				selectValueFromList(YearofRebuilt, polInsIntVessInformPLREntity.getStringValueForField("YearofRebuil"));
			}



			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVesselwr")) {
				clearAndSendKeys(NameoftheVessel, polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"));
			}
			//SB
			
			
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDTofVessel")) {
				clearAndSendKeys(lightDisplacementTonnageofVesselTextfield, polInsIntVessInformPLREntity.getStringValueForField("LightDisplacementTonnageLDTofVessel"));
			}
			
			
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateofBeachingofVessel")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateofBeachingofVessel"));
				clearAndEnterDate(dateofBeachingofVesselTextField, dateOfApplication);
			}
			
			
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlace")) {
				clearAndSendKeys(placeTextarea, polInsIntVessInformPLREntity.getStringValueForField("Place"));
			}
			
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCommencementofBreaking")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCommencementofBreaking"));
				clearAndEnterDate(dateofCommencementofBreakingTextField, dateOfApplication);
			}
			
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCustomsClearance")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCustomsClearance"));
				clearAndEnterDate(dateofCustomsClearanceTextField, dateOfApplication);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCompletionExpected")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCompletionExpected"));
				clearAndEnterDate(dateofCompletionExpectedTextField, dateOfApplication);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				clearAndSendKeys(purchasePriceRsTextField, polInsIntVessInformPLREntity.getStringValueForField("PurchasePriceRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				clearAndSendKeys(customDutyRsTextField, polInsIntVessInformPLREntity.getStringValueForField("CustomDutyRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortChargeRs")) {
				clearAndSendKeys(portChargeRsTextField, polInsIntVessInformPLREntity.getStringValueForField("PortChargeRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				clearAndSendKeys(anyGovernmentLevyRsTextField, polInsIntVessInformPLREntity.getStringValueForField("AnyGovernmentLevyRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueRateinpercent")) {
				clearAndSendKeys(valueRateinpercentTextField, polInsIntVessInformPLREntity.getStringValueForField("ValueRateinpercent"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				clearAndSendKeys(specialDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscount"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneeMortgageewr")) {
				clearAndSendKeys(AssigneeMortgagee, polInsIntVessInformPLREntity.getStringValueForField("AssigneeMortgage"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortofRegistrationAndAuthority")) {
				clearAndSendKeys(PortofRegistrationAndAuthority, polInsIntVessInformPLREntity.getStringValueForField("PortofRegistrationAndAuthorit"));


			}
			// SEcond page of marine hull vi produt Anzaf
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDurationforAssistingInlandDredger")) {
				selectValueFromList(VoyageDurationforAssistingInlandDredger, polInsIntVessInformPLREntity.getStringValueForField("VoyageDurationforAssistingInlandDredg"));


			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigmakeTypeOfVesselviDropDown")) {
				selectValueFromList(makeTypeOfVesselDropDown, polInsIntVessInformPLREntity.getStringValueForField("makeTypeOfVesselviDrop"));

			}
			if(!(polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("VI"))) {
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigsumInsuredviTextField")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntVessInformPLREntity.getStringValueForField("sumInsuredviText"));
			}
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselDetailsButton")) {
				click(vesselDetailsButton);
				switchToWindow("Vessel Details");
				Thread.sleep(5000);
				click(addButton);
				switchToWindow("Vessel Details");
				Thread.sleep(5000);
				selectValueFromList(typeofVesselsDropDown, polInsIntVessInformPLREntity.getStringValueForField("TypeofVesselsCL"));
				clearAndSendKeys(vesselNameTextArea, polInsIntVessInformPLREntity.getStringValueForField("VesselName"));
				selectValueFromList(yearofBuiltDropDown, polInsIntVessInformPLREntity.getStringValueForField("YearofBuilt"));
				clearAndSendKeys(grossRegisteredTonnageGRTTextField, polInsIntVessInformPLREntity.getStringValueForField("GrossRegisteredTonnageGRT"));
				clearAndSendKeys(deadWeightTonnageDWTTextField, polInsIntVessInformPLREntity.getStringValueForField("DeadWeightTonnageDWT"));
				clearAndSendKeys(breakHorsePowerBHP, polInsIntVessInformPLREntity.getStringValueForField("BreakHorsePowerBHP"));
				click(saveButtonAdd);
				click(closeButton);
				Thread.sleep(5000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake") && (!(polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("HM")))) {
				selectValueFromList(yearOfMakeDropdown, polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"));
			}
			
			//sample anmol
			if(polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
			{
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlaceofAwaitingBreakup")) {
				clearAndSendKeys(PlaceofAwaitingBreakupTextField, polInsIntVessInformPLREntity.getStringValueForField("PlaceofAwaitingBreakup"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLDT")) {
				clearAndSendKeys(LDTTextField, polInsIntVessInformPLREntity.getStringValueForField("LDT"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscountRate")) {
				clearAndSendKeys(SpecialDiscountRateTextField, polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscountRate"));
			}

if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntVessInformPLREntity.getStringValueForField("SumInsured"));
			}

if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigBollardHorsePowerBHP")) {
	clearAndSendKeys(BollardHorsePowerBHPTextField, polInsIntVessInformPLREntity.getStringValueForField("BollardHorsePowerBHP"));
}
			}
			
			
			
			

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//PAGE1
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TypeOfVessels"), fetchValueFromList(typeOfVesselsDropDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"), fetchValueFromList(subTypeOfDredgerDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"), fetchValueFromTextFields(vesselSubTypeDescriptionTextarea), AssertionType.WARNING);
				click(forwardButton);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IMONo"), fetchValueFromTextFields(iMONoTextarea), AssertionType.WARNING);
			}


			//mohammad
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeofOceanGoingVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SubTypeofOceanGoingVesse"), fetchValueFromList(SubTypeofOceanGoingVessel), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameofInsuredInterest")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameofInsuredInteres"), fetchValueFromList(NameofInsuredInterest), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofBuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearofBuil"), fetchValueFromList(YearofBuilt), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofRebuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearofRebuil"), fetchValueFromList(yearOfMakeDropdown), AssertionType.WARNING);
			}




			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"), fetchValueFromTextFields(NameoftheVessel), AssertionType.WARNING);
			}	



			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AssigneeMortgage"), fetchValueFromTextFields(AssigneeMortgagee), AssertionType.WARNING);
			}



			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortofRegistrationAndAuthoritywr")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortofRegistrationAndAuthorit"), fetchValueFromTextFields(PortofRegistrationAndAuthority), AssertionType.WARNING);
			}
			//SB
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVesselwr")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"), fetchValueFromTextFields(NameoftheVessel), AssertionType.WARNING);
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLightDisplacementTonnage(LDT)ofVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("LightDisplacementTonnage(LDT)ofVessel"), fetchValueFromTextFields(lightDisplacementTonnageofVesselTextfield), AssertionType.WARNING);
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlace")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Place"), fetchValueFromTextFields(placeTextarea), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PurchasePriceRs"), fetchValueFromTextFields(purchasePriceRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("CustomDutyRs"), fetchValueFromTextFields(customDutyRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortChargeRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortChargeRs"), fetchValueFromTextFields(portChargeRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AnyGovernmentLevyRs"), fetchValueFromTextFields(anyGovernmentLevyRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueRateinpercent")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ValueRateinpercent"), fetchValueFromTextFields(valueRateinpercentTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
			}

			//anzafSecond page of marine hull vi verify

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDurationforAssistingInlandDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VoyageDurationforAssistingInlandDredg"), fetchValueFromList(VoyageDurationforAssistingInlandDredger), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigmakeTypeOfVesselviDropDown")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("makeTypeOfVesselviDrop"), fetchValueFromList(makeTypeOfVesselDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigsumInsuredviTextField")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("sumInsuredviText"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}

		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//page2

			//This is third page also of marine hull (WR) product Code written by anzaf

			//Mohd

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassforOceangoingVessel")) {
				selectValueFromList(ClassforOceangoingVessel, polInsIntVessInformPLREntity.getStringValueForField("ClassforOceangoingVesse"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFlagforOceanGoingvessel")) {
				selectValueFromList(FlagforOceanGoingvessel, polInsIntVessInformPLREntity.getStringValueForField("FlagforOceanGoingvesse"));
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValuationofvessel")) {
				selectValueFromList(Valuationofvessel, polInsIntVessInformPLREntity.getStringValueForField("Valuationofvesse"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheCurrency")) {
				selectValueFromList(NameoftheCurrency, polInsIntVessInformPLREntity.getStringValueForField("NameoftheCurrenc"));
			}

			//Mohd
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRTWR")) {
				clearAndSendKeys(GRTWR, polInsIntVessInformPLREntity.getStringValueForField("GRTW"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigExchangerate")) {
				clearAndSendKeys(Exchangerate, polInsIntVessInformPLREntity.getStringValueForField("Exchangerate"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsuredwr")) {
				clearAndSendKeys(SumInsured, polInsIntVessInformPLREntity.getStringValueForField("SumInsure"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsuredinINR")) {
				clearAndSendKeys(SumInsuredinINR, polInsIntVessInformPLREntity.getStringValueForField("SumInsuredinINR"));
			}

			//end

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheInsured")) {
				clearAndSendKeys(nameOfTheInsuredTextarea, polInsIntVessInformPLREntity.getStringValueForField("NameOfTheInsured"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake")) {
				selectValueFromList(yearOfMakeDropdown, polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherIsVesselRebuilt")) {
				selectValueFromList(whetherIsVesselRebuiltDropdown, polInsIntVessInformPLREntity.getStringValueForField("WhetherIsVesselRebuilt"));
			}

			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
			{
				if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				clearAndSendKeys(nameOfTheVesselTextfield, polInsIntVessInformPLREntity.getStringValueForField("NameOfTheVessel"));
			}
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneemortgagee")) {
				clearAndSendKeys(assigneemortgageeTextarea, polInsIntVessInformPLREntity.getStringValueForField("Assigneemortgagee"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				clearAndSendKeys(portOfRegistrationAndAuthorityTextfield, polInsIntVessInformPLREntity.getStringValueForField("PortOfRegistrationAndAuthority"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFinalRateinpercent")) {
				clearAndSendKeys(finalRateinpercentTextField, polInsIntVessInformPLREntity.getStringValueForField("FinalRateinpercent"));
			}


			//third page of marine hull cp product


			/*if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDeductible")) {
				clearAndSendKeys(VoyageDeductible, polInsIntVessInformPLREntity.getStringValueForField("VoyageDeductibl"));
			}*/

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialCondition")) {
				clearAndSendKeys(SpecialConditions, polInsIntVessInformPLREntity.getStringValueForField("SpecialCondition"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarrantie")) {
				clearAndSendKeys(SpecialWarranties, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarrantie"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarrantie2")) {
				clearAndSendKeys(SpecialWarranties2, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarrantie2"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarrantie3")) {
				clearAndSendKeys(SpecialWarranties3, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranti3"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarrantie4")) {
				clearAndSendKeys(SpecialWarranties4, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarrantie4"));
			}

			//end
			//CL-Harshit

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersName")) {
				clearAndSendKeys(ownersNameTextArea, polInsIntVessInformPLREntity.getStringValueForField("OwnersName"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnerAddress")) {
				clearAndSendKeys(ownerAddressTextArea, polInsIntVessInformPLREntity.getStringValueForField("OwnerAddress"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSIforChartersLiabilityInsuranceTextField")) {
				clearAndSendKeys(siforChartersLiabilityInsuranceTextField, polInsIntVessInformPLREntity.getStringValueForField("SIforChartersLiabilityInsuranceTextField"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueperGrossRegisteredTonnageGRT")) {
				clearAndSendKeys(valueperGrossRegisteredTonnageGRTTextField, polInsIntVessInformPLREntity.getStringValueForField("ValueperGrossRegisteredTonnageGRT"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigISChartersBunkerinsurancerequired")) {
				selectValueFromList(isChartersBunkerinsurancerequiredDropDown, polInsIntVessInformPLREntity.getStringValueForField("ISChartersBunkerinsurancerequired"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigRateforFreight")) {
				clearAndSendKeys(rateforFreightTextField, polInsIntVessInformPLREntity.getStringValueForField("RateforFreight"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLimitofLiabilityforSeepageandPollutionRisk")) {
				clearAndSendKeys(limitofLiabilityforSeepageandPollutionRiskTextField, polInsIntVessInformPLREntity.getStringValueForField("LimitofLiabilityforSeepageandPollutionRisk"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigExclusionforContractualLiabilitytoThirdPartiesrequired")) {
				selectValueFromList(exclusionforContractualLiabilitytoThirdPartiesrequiredDropDown, polInsIntVessInformPLREntity.getStringValueForField("ExclusionforContractualLiabilitytoThirdPartiesrequired"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDiscountforExclusionofContractualLiabilitytoThirdParties")) {
				clearAndSendKeys(discountforExclusionofContractualLiabilitytoThirdPartiesTextField, polInsIntVessInformPLREntity.getStringValueForField("DiscountforExclusionofContractualLiabilitytoThirdParties"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscountCL")) {
				clearAndSendKeys(specialDiscountTextFieldCL, polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscountCL"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClaimRatio")) {
				clearAndSendKeys(claimRatioTextField, polInsIntVessInformPLREntity.getStringValueForField("ClaimRatio"));
			}
			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
			{
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCoverPlace")) {
				selectValueFromList(CoverPlaceDropdown, polInsIntVessInformPLREntity.getStringValueForField("CoverPlace"));
			}
		}
		
		}
		
		
		
		
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){

			//page2

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheInsured")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameOfTheInsured"), fetchValueFromTextFields(nameOfTheInsuredTextarea), AssertionType.WARNING);
			}

			//detailsOfInterestButton;

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"), fetchValueFromList(yearOfMakeDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherIsVesselRebuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WhetherIsVesselRebuilt"), fetchValueFromList(whetherIsVesselRebuiltDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameOfTheVessel"), fetchValueFromTextFields(nameOfTheVesselTextfield), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneemortgagee")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Assigneemortgagee"), fetchValueFromTextFields(assigneemortgageeTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortOfRegistrationAndAuthority"), fetchValueFromTextFields(portOfRegistrationAndAuthorityTextfield), AssertionType.WARNING);
			}

			//mohd
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassforOceangoingVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassforOceangoingVesse"), fetchValueFromList(ClassforOceangoingVessel), AssertionType.WARNING);
			}		


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFlagforOceanGoingvessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("FlagforOceanGoingvesse"), fetchValueFromList(FlagforOceanGoingvessel), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValuationofvessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Valuationofvesse"), fetchValueFromList(Valuationofvessel), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheCurrency")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameoftheCurrenc"), fetchValueFromList(NameoftheCurrency), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRTWR")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("GRTW"), fetchValueFromTextFields(GRTWR), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigExchangerate")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Exchangerate"), fetchValueFromTextFields(Exchangerate), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SumInsure"), fetchValueFromTextFields(SumInsured), AssertionType.WARNING);
			}



			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsuredinINR")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SumInsuredinINR"), fetchValueFromTextFields(SumInsuredinINR), AssertionType.WARNING);
			}



			//			      marine hull third page

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDeductible")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VoyageDeductibl"), fetchValueFromTextFields(VoyageDeductible), AssertionType.WARNING);
			}
			//CL-Harshit
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("OwnersName"), fetchValueFromTextFields(ownersNameTextArea), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnerAddress")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("OwnerAddress"), fetchValueFromTextFields(ownerAddressTextArea), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSIforChartersLiabilityInsuranceTextField")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SIforChartersLiabilityInsuranceTextField"), fetchValueFromTextFields(siforChartersLiabilityInsuranceTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueperGrossRegisteredTonnageGRT")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ValueperGrossRegisteredTonnageGRT"), fetchValueFromTextFields(valueperGrossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigISChartersBunkerinsurancerequired")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ISChartersBunkerinsurancerequired"), fetchValueFromTextFields(isChartersBunkerinsurancerequiredDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigRateforFreight")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("RateforFreight"), fetchValueFromTextFields(rateforFreightTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLimitofLiabilityforSeepageandPollutionRisk")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("LimitofLiabilityforSeepageandPollutionRisk"), fetchValueFromTextFields(limitofLiabilityforSeepageandPollutionRiskTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigExclusionforContractualLiabilitytoThirdPartiesrequired")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ExclusionforContractualLiabilitytoThirdPartiesrequired"), fetchValueFromTextFields(exclusionforContractualLiabilitytoThirdPartiesrequiredDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDiscountforExclusionofContractualLiabilitytoThirdParties")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("DiscountforExclusionofContractualLiabilitytoThirdParties"), fetchValueFromTextFields(discountforExclusionofContractualLiabilitytoThirdPartiesTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscountCL")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscountCL"), fetchValueFromTextFields(specialDiscountTextFieldCL), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClaimRatio")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClaimRatio"), fetchValueFromTextFields(claimRatioTextField), AssertionType.WARNING);
			}




		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP3(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//page3

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRT")) {
			
				//changes for AB
				if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("HM") && !polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB")) {
				clearAndSendKeys(gRTTextField, polInsIntVessInformPLREntity.getStringValueForField("GRT"));
				}
				else if (!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB")) {
			
					clearAndSendKeys(gRTTextField1, polInsIntVessInformPLREntity.getStringValueForField("GRT"));
					}
				
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRTVI")) {
				clearAndSendKeys(gRTVITextField, polInsIntVessInformPLREntity.getStringValueForField("GRT"));
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMakeTypeOfVessel")) {
				selectValueFromList(makeTypeOfVesselDropDown, polInsIntVessInformPLREntity.getStringValueForField("MakeTypeOfVessel"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigEngineTypeOfInlandDredgerOceanGoingDredger")) {
				selectValueFromList(engineTypeOfInlandDredgerOceanGoingDredgerDropDown, polInsIntVessInformPLREntity.getStringValueForField("EngineTypeOfInlandDredgerOceanGoingDredger"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingLimitsForInlandDredgeOceanGoingDredger")) {
				selectValueFromList(tradingLimitsForInlandDredgeOceanGoingDredgerDropDown, polInsIntVessInformPLREntity.getStringValueForField("TradingLimitsForInlandDredgeOceanGoingDredger"));
			}

			//abdul

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberofCrewWr")) {
				clearAndSendKeys(NumberofCrewWr, polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrewer"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("Configwrdeductible")) {
				clearAndSendKeys(wrdeductible, polInsIntVessInformPLREntity.getStringValueForField("wrDeductible"));
			}	


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingRegions")) {
				clearAndSendKeys(TradingRegions, polInsIntVessInformPLREntity.getStringValueForField("TradingRegionswr"));
			}

			//CL-Harshit
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherHandMCovered")) {
				selectValueFromList(whetherHandMCoveredDropDown, polInsIntVessInformPLREntity.getStringValueForField("WhetherHandMCovered"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigChartersLiabilitydeductible")) {
				clearAndSendKeys(chartersLiabilitydeductibleTextField, polInsIntVessInformPLREntity.getStringValueForField("ChartersLiabilitydeductible"));
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigProtectionandIndemnityInsurancerequired")) {
				selectValueFromList(protectionandIndemnityInsurancerequiredDropDown, polInsIntVessInformPLREntity.getStringValueForField("ProtectionandIndemnityInsurancerequired"));
			}


		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//page3

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberofCrewWr")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrewer"), fetchValueFromTextFields(NumberofCrewWr), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("Configwrdeductible")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("wrDeductible"), fetchValueFromTextFields(wrdeductible), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingRegions")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TradingRegionswr"), fetchValueFromTextFields(TradingRegions), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRT")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("GRT"), fetchValueFromTextFields(gRTTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMakeTypeOfVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("MakeTypeOfVessel"), fetchValueFromList(makeTypeOfVesselDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigEngineTypeOfInlandDredgerOceanGoingDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("EngineTypeOfInlandDredgerOceanGoingDredger"), fetchValueFromList(engineTypeOfInlandDredgerOceanGoingDredgerDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingLimitsForInlandDredgeOceanGoingDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TradingLimitsForInlandDredgeOceanGoingDredger"), fetchValueFromList(tradingLimitsForInlandDredgeOceanGoingDredgerDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFinalRateinpercent")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("FinalRateinpercent"), fetchValueFromList(finalRateinpercentTextField), AssertionType.WARNING);
			}
			//CL-Harshit
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherHandMCovered")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WhetherHandMCovered"), fetchValueFromList(whetherHandMCoveredDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigChartersLiabilitydeductible")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ChartersLiabilitydeductible"), fetchValueFromList(chartersLiabilitydeductibleTextField), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigProtectionandIndemnityInsurancerequired")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ProtectionandIndemnityInsurancerequired"), fetchValueFromList(protectionandIndemnityInsurancerequiredDropDown), AssertionType.WARNING);
			}

		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//p4

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				clearAndSendKeys(qualificationOfMasterTextField, polInsIntVessInformPLREntity.getStringValueForField("QualificationOfMaster"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				clearAndSendKeys(numberOfCrewTextField, polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrew"));
			}
			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
			{
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntVessInformPLREntity.getStringValueForField("SumInsured"));
			}
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigConditionsForInlandDredgersOceanGoingDredgers")) {
				selectValueFromList(conditionsForInlandDredgersOceanGoingDredgersDropDown, polInsIntVessInformPLREntity.getStringValueForField("ConditionsForInlandDredgersOceanGoingDredgers"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWarrantyForInlandDredgersOceanGoingDredgers")) {
				selectValueFromList(warrantyForInlandDredgersOceanGoingDredgersDropDown, polInsIntVessInformPLREntity.getStringValueForField("WarrantyForInlandDredgersOceanGoingDredgers"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWiderWarrantiesTradingLimits")) {
				selectValueFromList(widerWarrantiesTradingLimitsDropDown, polInsIntVessInformPLREntity.getStringValueForField("WiderWarrantiesTradingLimits"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIRSDiscount")) {
				selectValueFromList(iRSDiscountDropDown, polInsIntVessInformPLREntity.getStringValueForField("IRSDiscount"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsAdditinalPerilCoverRequired")) {
				selectValueFromList(isAdditinalPerilCoverRequiredDropDown, polInsIntVessInformPLREntity.getStringValueForField("IsAdditinalPerilCoverRequired"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigBHP")) {
				clearAndSendKeys(BHPVITextField, polInsIntVessInformPLREntity.getStringValueForField("BHP"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTotalActualPurchasePrice")) {
				clearAndSendKeys(TotalActualPurchasePriceTextField, polInsIntVessInformPLREntity.getStringValueForField("TotalActualPurchasePrice"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTotalDutyPayable")) {
				clearAndSendKeys(TotalDutyPayableTextField, polInsIntVessInformPLREntity.getStringValueForField("TotalDutyPayable"));
			}
			
			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
			{		
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigBollardHorsePowerBHP")) {
				clearAndSendKeys(BollardHorsePowerBHPTextField, polInsIntVessInformPLREntity.getStringValueForField("BollardHorsePowerBHP"));
			}}
			//aaaa





		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//p4

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("QualificationOfMaster"), fetchValueFromTextFields(qualificationOfMasterTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrew"), fetchValueFromTextFields(numberOfCrewTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigConditionsForInlandDredgersOceanGoingDredgers")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ConditionsForInlandDredgersOceanGoingDredgers"), fetchValueFromList(conditionsForInlandDredgersOceanGoingDredgersDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWarrantyForInlandDredgersOceanGoingDredgers")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WarrantyForInlandDredgersOceanGoingDredgers"), fetchValueFromList(warrantyForInlandDredgersOceanGoingDredgersDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWiderWarrantiesTradingLimits")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WiderWarrantiesTradingLimits"), fetchValueFromList(widerWarrantiesTradingLimitsDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIRSDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IRSDiscount"), fetchValueFromList(iRSDiscountDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsAdditinalPerilCoverRequired")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IsAdditinalPerilCoverRequired"), fetchValueFromList(isAdditinalPerilCoverRequiredDropDown), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAdditionalPeril")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AdditionalPeril"), fetchValueFromTextFields(AdditionalPerilRate), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPerilsdeductibleAmount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PerilsdeductibleAmo"), fetchValueFromTextFields(AdditionalPerilsdeductibleAmount), AssertionType.WARNING);
			}





		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP5(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//p5

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialConditions"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				clearAndSendKeys(specialWarrantiesTextarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				clearAndSendKeys(specialWarranties2Textarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties2"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				clearAndSendKeys(specialWarranties3Textarea, polInsIntVessInformPLREntity.getStringValueForField("Proj"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				clearAndSendKeys(specialWarranties4Textarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties4"));
			}
			//	anyClaimExperienceForLast5YearsButton;
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPresentInsurerIfany")) {
				clearAndSendKeys(presentInsurerIfanyTextarea, polInsIntVessInformPLREntity.getStringValueForField("PresentInsurerIfany"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDeductible")) {
				clearAndSendKeys(VoyageDeductibleTextField, polInsIntVessInformPLREntity.getStringValueForField("VoyageDeductible"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageFrom")) {
				clearAndSendKeys(VoyageFromTextField, polInsIntVessInformPLREntity.getStringValueForField("VoyageFrom"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageTo")) {
				clearAndSendKeys(VoyageToTextField, polInsIntVessInformPLREntity.getStringValueForField("VoyageTo"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIntermediatePort")) {
				clearAndSendKeys(IntermediatePortTextField, polInsIntVessInformPLREntity.getStringValueForField("IntermediatePort"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				selectValueFromList(isHOApprovalIsObtainedDropDown, polInsIntVessInformPLREntity.getStringValueForField("IsHOApprovalIsObtained"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoClaimsDiscount")) {
				clearAndSendKeys(noClaimsDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("NoClaimsDiscount"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				clearAndSendKeys(ownersDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("OwnersDiscount"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				clearAndSendKeys(deTariffDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("DeTariffDiscount"));
			}
			
			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
					{
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlaceofAwaitingBreakup")) {
				clearAndSendKeys(PlaceofAwaitingBreakupTextField, polInsIntVessInformPLREntity.getStringValueForField("PlaceofAwaitingBreakup"));
			}
			
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLDT")) {
				clearAndSendKeys(LDTTextField, polInsIntVessInformPLREntity.getStringValueForField("LDT"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscountRate")) {
				clearAndSendKeys(SpecialDiscountRateTextField, polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscountRate"));
			}

		}}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//p5

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties"), fetchValueFromTextFields(specialWarrantiesTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties2"), fetchValueFromTextFields(specialWarranties2Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties3"), fetchValueFromTextFields(specialWarranties3Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties4"), fetchValueFromTextFields(specialWarranties4Textarea), AssertionType.WARNING);
			}
			//anyClaimExperienceForLast5YearsButton;


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPresentInsurerIfany")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PresentInsurerIfany"), fetchValueFromTextFields(presentInsurerIfanyTextarea), AssertionType.WARNING);
			}
			//claimDetailButton;




			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IsHOApprovalIsObtained"), fetchValueFromList(isHOApprovalIsObtainedDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoClaimsDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NoClaimsDiscount"), fetchValueFromTextFields(noClaimsDiscountTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("OwnersDiscount"), fetchValueFromTextFields(ownersDiscountTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("DeTariffDiscount"), fetchValueFromTextFields(deTariffDiscountTextField), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP6(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//P6

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoOfShipsUnderFleetCategory")) {
				selectValueFromList(noOfShipsUnderFleetCategoryDropDown, polInsIntVessInformPLREntity.getStringValueForField("NoOfShipsUnderFleetCategory"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCountryOfRegistration")) {
				clearAndSendKeys(countryOfRegistrationTextField, polInsIntVessInformPLREntity.getStringValueForField("CountryOfRegistration"));
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassClassificationCode")) {
				selectValueFromList(classClassificationCodeDropDown, polInsIntVessInformPLREntity.getStringValueForField("ClassClassificationCode"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded1")) {
				clearAndSendKeys(classAwarded1Textarea, polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded1"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded2")) {
				clearAndSendKeys(classAwarded2Textarea, polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded2"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDetailsOfEngineMachinery")) {
				clearAndSendKeys(detailsOfEngineMachineryTextarea, polInsIntVessInformPLREntity.getStringValueForField("DetailsOfEngineMachinery"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAggregateClaimRatio")) {
				clearAndSendKeys(aggregateClaimRatioTextField, polInsIntVessInformPLREntity.getStringValueForField("AggregateClaimRatio"));
			}
			
			if(!polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
					{
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(DeductibleTextField, polInsIntVessInformPLREntity.getStringValueForField("Deductible"));
			}
					}
		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//P6

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoOfShipsUnderFleetCategory")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NoOfShipsUnderFleetCategory"), fetchValueFromList(noOfShipsUnderFleetCategoryDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCountryOfRegistration")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("CountryOfRegistration"), fetchValueFromTextFields(countryOfRegistrationTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassClassificationCode")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassClassificationCode"), fetchValueFromList(classClassificationCodeDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded1")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded1"), fetchValueFromTextFields(classAwarded1Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded2")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded2"), fetchValueFromTextFields(classAwarded2Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDetailsOfEngineMachinery")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("DetailsOfEngineMachinery"), fetchValueFromTextFields(detailsOfEngineMachineryTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAggregateClaimRatio")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AggregateClaimRatio"), fetchValueFromTextFields(aggregateClaimRatioTextField), AssertionType.WARNING);
			}
		}
	}


	public void fillPolicyInsuredIntrestVesselInformationPLRVI4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAdditionalPeril")) {

				clearAndSendKeys(AdditionalPerilRate, polInsIntVessInformPLREntity.getStringValueForField("AdditionalPeril"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPerilsdeductibleAmount")) {
				clearAndSendKeys(AdditionalPerilsdeductibleAmount, polInsIntVessInformPLREntity.getStringValueForField("PerilsdeductibleAmo"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigRODiscount")) {
				clearAndSendKeys(RODiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("RODiscount"));

			}


		}

		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHMDeductible")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("HMDeductible"), fetchValueFromTextFields(hMDeductibleTextField), AssertionType.WARNING);
			}



		}
	}

	public void clickNextButtonPolicyAttributeHMPolicyDetailsP1(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP1")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
		else if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonAB")) {
			click(forwardButton);
			switchToFrame("display");
		}
	}

	public void clickNextButtonPolicyAttributeHMPolicyDetailsP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP2")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
		
		
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP3(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP3")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP4")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP5(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP5")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP6(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP6")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickOnSaveButton(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetailsP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonWRP2")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle2);
		}
	}

	public void navigateToPolicy(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsVIP4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMPVI4")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}


	public void fillFVOYAGE(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			/*if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				selectValueFromList(subTypeOfDredgerDropdown, polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"));
			}	*/
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				clearAndSendKeys(vesselSubTypeDescriptionTextarea, polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				clearAndSendKeys(iMONoTextarea, polInsIntVessInformPLREntity.getStringValueForField("IMONo"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeofOceanGoingVessel")) {
				selectValueFromList(SubTypeofOceanGoingVessel, polInsIntVessInformPLREntity.getStringValueForField("SubTypeofOceanGoingVesse"));
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameofInsuredInterest")) {
				selectValueFromList(NameofInsuredInterest, polInsIntVessInformPLREntity.getStringValueForField("NameofInsuredInteres"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofBuilt")) {
				selectValueFromList(YearofBuilt, polInsIntVessInformPLREntity.getStringValueForField("YearofBuil"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofRebuilt")) {
				selectValueFromList(YearofRebuilt, polInsIntVessInformPLREntity.getStringValueForField("YearofRebuil"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVesselwr")) {
				clearAndSendKeys(NameoftheVessel, polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"));
			}
			//SB
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDTofVessel")) {
				clearAndSendKeys(lightDisplacementTonnageofVesselTextfield, polInsIntVessInformPLREntity.getStringValueForField("LightDisplacementTonnageLDTofVessel"));
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateofBeachingofVessel")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateofBeachingofVessel"));
				clearAndEnterDate(dateofBeachingofVesselTextField, dateOfApplication);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlace")) {
				clearAndSendKeys(placeTextarea, polInsIntVessInformPLREntity.getStringValueForField("Place"));
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCommencementofBreaking")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCommencementofBreaking"));
				clearAndEnterDate(dateofCommencementofBreakingTextField, dateOfApplication);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCustomsClearance")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCustomsClearance"));
				clearAndEnterDate(dateofCustomsClearanceTextField, dateOfApplication);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDateOfCompletionExpected")) {
				String dateOfApplication = RandomCodeGenerator.dateGenerator(polInsIntVessInformPLREntity.getStringValueForField("DateOfCompletionExpected"));
				clearAndEnterDate(dateofCompletionExpectedTextField, dateOfApplication);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				clearAndSendKeys(purchasePriceRsTextField, polInsIntVessInformPLREntity.getStringValueForField("PurchasePriceRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				clearAndSendKeys(customDutyRsTextField, polInsIntVessInformPLREntity.getStringValueForField("CustomDutyRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortChargeRs")) {
				clearAndSendKeys(portChargeRsTextField, polInsIntVessInformPLREntity.getStringValueForField("PortChargeRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				clearAndSendKeys(anyGovernmentLevyRsTextField, polInsIntVessInformPLREntity.getStringValueForField("AnyGovernmentLevyRs"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueRateinpercent")) {
				clearAndSendKeys(valueRateinpercentTextField, polInsIntVessInformPLREntity.getStringValueForField("ValueRateinpercent"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				clearAndSendKeys(specialDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscount"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneeMortgageewr")) {
				clearAndSendKeys(AssigneeMortgagee, polInsIntVessInformPLREntity.getStringValueForField("AssigneeMortgage"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortofRegistrationAndAuthority")) {
				clearAndSendKeys(PortofRegistrationAndAuthority, polInsIntVessInformPLREntity.getStringValueForField("PortofRegistrationAndAuthorit"));
			}
			// SEcond page of marine hull vi produt Anzaf
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDurationforAssistingInlandDredger")) {
				selectValueFromList(VoyageDurationforAssistingInlandDredger, polInsIntVessInformPLREntity.getStringValueForField("VoyageDurationforAssistingInlandDredg"));

			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigmakeTypeOfVesselviDropDown")) {
				selectValueFromList(makeTypeOfVesselDropDown, polInsIntVessInformPLREntity.getStringValueForField("makeTypeOfVesselviDrop"));

			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigsumInsuredviTextField")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntVessInformPLREntity.getStringValueForField("sumInsuredviText"));
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselDetailsButton")) {
				click(vesselDetailsButton);
				switchToWindow("Vessel Details");
				Thread.sleep(5000);
				if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add")){
				click(addButton);
				}
				switchToWindow("Vessel Details");
				Thread.sleep(5000);
				selectValueFromList(typeofVesselsDropDown, polInsIntVessInformPLREntity.getStringValueForField("TypeofVesselsCL"));
				clearAndSendKeys(vesselNameTextArea, polInsIntVessInformPLREntity.getStringValueForField("VesselName"));
				selectValueFromList(yearofBuiltDropDown, polInsIntVessInformPLREntity.getStringValueForField("YearofBuilt"));
				clearAndSendKeys(grossRegisteredTonnageGRTTextField, polInsIntVessInformPLREntity.getStringValueForField("GrossRegisteredTonnageGRT"));
				clearAndSendKeys(deadWeightTonnageDWTTextField, polInsIntVessInformPLREntity.getStringValueForField("DeadWeightTonnageDWT"));
				clearAndSendKeys(breakHorsePowerBHP, polInsIntVessInformPLREntity.getStringValueForField("BreakHorsePowerBHP"));
				click(saveButtonAdd);
				click(closeButton);
				Thread.sleep(5000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake")) {
				selectValueFromList(yearOfMakeDropdown, polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//PAGE1
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TypeOfVessels"), fetchValueFromList(typeOfVesselsDropDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"), fetchValueFromList(subTypeOfDredgerDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"), fetchValueFromTextFields(vesselSubTypeDescriptionTextarea), AssertionType.WARNING);
				click(forwardButton);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IMONo"), fetchValueFromTextFields(iMONoTextarea), AssertionType.WARNING);
			}


			//mohammad
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeofOceanGoingVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SubTypeofOceanGoingVesse"), fetchValueFromList(SubTypeofOceanGoingVessel), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameofInsuredInterest")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameofInsuredInteres"), fetchValueFromList(NameofInsuredInterest), AssertionType.WARNING);
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofBuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearofBuil"), fetchValueFromList(YearofBuilt), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearofRebuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearofRebuil"), fetchValueFromList(yearOfMakeDropdown), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"), fetchValueFromTextFields(NameoftheVessel), AssertionType.WARNING);
			}	
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AssigneeMortgage"), fetchValueFromTextFields(AssigneeMortgagee), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortofRegistrationAndAuthoritywr")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortofRegistrationAndAuthorit"), fetchValueFromTextFields(PortofRegistrationAndAuthority), AssertionType.WARNING);
			}
			//SB
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameoftheVesselwr")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameoftheVesse"), fetchValueFromTextFields(NameoftheVessel), AssertionType.WARNING);
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLightDisplacementTonnage(LDT)ofVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("LightDisplacementTonnage(LDT)ofVessel"), fetchValueFromTextFields(lightDisplacementTonnageofVesselTextfield), AssertionType.WARNING);
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPlace")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Place"), fetchValueFromTextFields(placeTextarea), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PurchasePriceRs"), fetchValueFromTextFields(purchasePriceRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("CustomDutyRs"), fetchValueFromTextFields(customDutyRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortChargeRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortChargeRs"), fetchValueFromTextFields(portChargeRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AnyGovernmentLevyRs"), fetchValueFromTextFields(anyGovernmentLevyRsTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigValueRateinpercent")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ValueRateinpercent"), fetchValueFromTextFields(valueRateinpercentTextField), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialDiscount"), fetchValueFromTextFields(specialDiscountTextField), AssertionType.WARNING);
			}

			//anzafSecond page of marine hull vi verify

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVoyageDurationforAssistingInlandDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VoyageDurationforAssistingInlandDredg"), fetchValueFromList(VoyageDurationforAssistingInlandDredger), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigmakeTypeOfVesselviDropDown")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("makeTypeOfVesselviDrop"), fetchValueFromList(makeTypeOfVesselDropDown), AssertionType.WARNING);
			}
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigsumInsuredviTextField")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("sumInsuredviText"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}

		}

	}
	public void clickNextButtonFVOYAGE(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMPVI1")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	
    public void clickNextButton(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP1")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
		
	}
	public void fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntVessInformPLREntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestVesselInformationPLRP0(polInsIntVessInformPLREntity, assertReference);
			clickNextButton(polInsIntVessInformPLREntity);

			//anmol
			if(polInsIntVessInformPLREntity.getStringValueForField("Product").equalsIgnoreCase("VI")) {
				fillFVOYAGE(polInsIntVessInformPLREntity, assertReference);
				clickNextButtonFVOYAGE(polInsIntVessInformPLREntity);
			}
			fillPolicyInsuredIntrestVesselInformationPLRP1(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP1(polInsIntVessInformPLREntity);

			fillPolicyInsuredIntrestVesselInformationPLRP2(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP2(polInsIntVessInformPLREntity);

			fillPolicyInsuredIntrestVesselInformationPLRP3(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP3(polInsIntVessInformPLREntity);

			fillPolicyInsuredIntrestVesselInformationPLRP4(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP4(polInsIntVessInformPLREntity);

			
				fillPolicyInsuredIntrestVesselInformationPLRVI4(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsVIP4(polInsIntVessInformPLREntity);
			
			fillPolicyInsuredIntrestVesselInformationPLRP5(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP5(polInsIntVessInformPLREntity);
			
			fillPolicyInsuredIntrestVesselInformationPLRP6(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP6(polInsIntVessInformPLREntity);
			
			clickOnSaveButton(polInsIntVessInformPLREntity);
			navigateTobackAttributePage(polInsIntVessInformPLREntity);
			navigateToPolicy(polInsIntVessInformPLREntity);
			navigateToAttribute(polInsIntVessInformPLREntity);
			navigateToInsuredInterest(polInsIntVessInformPLREntity);
			navigateToCoverage(polInsIntVessInformPLREntity);
			navigateToLoan(polInsIntVessInformPLREntity);
			navigateToClientDetails(polInsIntVessInformPLREntity);
			navigateToRelation(polInsIntVessInformPLREntity);
			navigateToPayment(polInsIntVessInformPLREntity);
			navigateToFollowup(polInsIntVessInformPLREntity);
			navigateToDocument(polInsIntVessInformPLREntity);
			navigateTobackAttributePage(polInsIntVessInformPLREntity);
			navigateToInsuredInterestAttributes(polInsIntVessInformPLREntity);
			navigateToInsuredInterestAttachCoverages(polInsIntVessInformPLREntity);
			navigateToInsuredInterestRelations(polInsIntVessInformPLREntity);
			navigateToInsuredInterestPayments(polInsIntVessInformPLREntity);
		}
	}

}
