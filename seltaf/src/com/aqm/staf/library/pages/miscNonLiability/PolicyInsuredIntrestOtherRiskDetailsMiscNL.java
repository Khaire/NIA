package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AviationRiskDT3Entity;
import com.aqm.staf.library.databin.PolInsIntOthrRiskDMNLEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;

public class PolicyInsuredIntrestOtherRiskDetailsMiscNL extends BasePage{

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement previousPolicyHistoryT3POLTitle;	
	private PageElement schemeNoLable;
	private PageElement nextAttributePageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;

	private PageElement insuredInterestTab;
	private PageElement policyDataPZT1POLTitle ;
	private PageElement insuredInterestTabTitle;

	private PageElement forwordButton;
	private PageElement backButton;
	//********************************************************************************************************************************************************************************************
	//Mayur-MI
	private PageElement sumInsuredTextField;
	private PageElement maximumDistanceOverWhichMoneyWillBeConveyedTextField;
	private PageElement detailsOfEmployeesHandlingMoneyTextArea;
	private PageElement howIsMoneyCarriedTextField;
	private PageElement modeOfTransportForMoneyTextField;
	private PageElement detailsOfArmedGuardsOrAnyOtherProtectionTextArea;
	private PageElement detailsOfMoneyKeptOutsideBusinessHoursTextArea;
	private PageElement isTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloorDropDown;
	private PageElement byWhomAreTheKeysHeldTextField;
	private PageElement areAllTheKeysRemovedOutsideBusinessHoursDropDown;
	private PageElement excessTextField;
	private PageElement dGMorRMDiscretionaryDiscountPercentTextField;
	private PageElement adverseClaimExperienceLoadingInPercentTextField;
	private PageElement otherLoadingInPercentTextField;
	private PageElement giveReasonForOtherLoadingTextArea;
	private PageElement specialConditionsTextArea;
	//Mayur-PB
	private PageElement physicianNameTextField;
	private PageElement physicianAddressTextArea;
	private PageElement physicianRegistrationNoTextField;
	private PageElement physicianTelephoneNoTextField;
	private PageElement otherInformationIfAnyTextArea;
	private PageElement medicalReportAttachedTextArea;
	private PageElement briefDetailsOfTheReportTextArea;
	private PageElement heightTextField;
	private PageElement weightTextField;
	private PageElement doYouSmokeCigarettesCigarORPipeDropDown;
	private PageElement doYouChewTobaccoDropDown;
	private PageElement doYouDrinkAlcoholDropDown;
	private PageElement detailsOfPreExistingDiseasesRequiredDropDown;
	private PageElement diseaseDetailsButton;
	private PageElement diseaseSufferedSufferingTextArea;
	private PageElement medicalReportTextArea;
	private PageElement addButton;
	private PageElement saveButton;
	private PageElement closeButton;
	private PageElement deleteButton;
	//Mayur-FI
	private PageElement dGmRmDiscretionaryDiscountTextField;
	private PageElement adverseClaimExperienceLoadingInTextField;
	private PageElement otherLoadingInTextField;
	//Mayur-PY
	private PageElement whichJurisdictionDropDown;
	private PageElement ratePercentForJurisdictionTextField;
	//Mayur-BI
	private PageElement detailsOfStockOwnButton;
	private PageElement rateForStockPercentTextField;
	private PageElement goodsHeldInTrustANDORCommissionButton;
	private PageElement rateForGoodsHeldPercentTextField;
	private PageElement firstLossRequiredDropDown;
	private PageElement firstLossPercentDropDown;
	private PageElement detailsOfFurnitureFixtureFittingsButton;
	private PageElement rateForFurnitureFixtureFittingsTextField;
	private PageElement detailsOfOfficeEquipmentButton;
	private PageElement rateForOfficeEquipmentTextField;
	private PageElement detailsOfCoinsCurrencyCuriosEtcButton;
	private PageElement rateForCoinsTextField;
	private PageElement descriptionOfOtherItemsButton;
	private PageElement rateForOthersTextField;
	private PageElement stockDetailsTextArea;
	private PageElement gOODSHELDDETAILSTextArea;
	private PageElement furnitureFixtureFittingsDetailsTextArea;
	private PageElement officeEquipmentDetailsTextArea;
	private PageElement coinsCurrencyCuriosDetailsTextArea;
	private PageElement otherItemdetailsTextArea;
	//Mayur-BI
	private PageElement rateInPercentTextField;
	private PageElement numberOfEmployeesTextField;
	private PageElement perCapitaEmployeeLoadingTextField;
	private PageElement totalStaffLoadingTextField;
	private PageElement additionalSumInsuredForMoneyInPremisesTextField;
	private PageElement ratePercentForMoneyInPremisesTextField;
	private PageElement additionalSumInsuredForMoneyInTransitTextField;
	private PageElement ratePercentForMoneyInTransitTextField;
	private PageElement limitsOfLiabilityForRegisteredPostalSendingTextField;
	//Mayur-BN
	private PageElement limitsOfLiabilityForAppraisersTextField;
	private PageElement limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField;
	//akshataSE
	private PageElement hoRoDoApprovalNumberTextField;
	//BN
	private PageElement excessBNTextField;
	private PageElement DGMorRMDiscretionaryDiscountPercentageBNTextField;
	private PageElement adverseClaimExperienceLoadingInPercentageBNTextField;
	private PageElement otherLoadingINPercentageBNTextField;
	private PageElement giveReasonforOtherLoadingBNTextArea;
	private PageElement specialConditionsOneBNTextArea;
	private PageElement specialConditionsTwoBNTextArea;
	//JI
	private PageElement imposedExcessDeductibleTextField;

	private PageElement memberDetailTitle;
	private PageElement backToRiskListButton;

	//BD
	private PageElement specialConditions1TextArea;
	private PageElement specialConditions2TextArea;
	//BI
	private PageElement sumInsuredBITextField;
	private PageElement stockinTradeTextField;
	private PageElement goodsHeldInTrustCommissionTextField;
	private PageElement furnitureFixtureFittingsTextField;
	private PageElement officeEquipmentTextField;
	private PageElement coinsCurrencyCuriosEtcTextField;
	private PageElement othersSumInsuredTextField;
	private PageElement totalSumInsuredTextField;
	
	private PageElement horodoAprovalNoTextField;
	//SE
	private PageElement compensationLimitPerAccidentTextField;

	public PolicyInsuredIntrestOtherRiskDetailsMiscNL(WebDriver driver, String pageName) {
		super(driver,pageName);
		previousPolicyHistoryT3POLTitle =new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy History T3-POL')]"), "Previous Policy History T3-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Break')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		schemeNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme No.")),"Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),"Insured Interest Tab",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next"),"Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//********************************************************************************************************************************************************************************************
		//Mayur-MI
		sumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumDistanceOverWhichMoneyWillBeConveyedTextField= new PageElement(By.xpath("//td//div[contains(text(),'Maximum distance over which money will be conveyed')]/following::input"), "Maximum distance over which money will be conveyed TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfEmployeesHandlingMoneyTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of employees handling Money')]/following::TextArea"), "Details of employees handling Money TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		howIsMoneyCarriedTextField= new PageElement(By.xpath("//td//div[contains(text(),'How is money carried')]/following::input"), "How is money carried TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		detailsOfArmedGuardsOrAnyOtherProtectionTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of armed guards or any other protection')]/following::TextArea"), "Details of armed guards or any other protection TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfMoneyKeptOutsideBusinessHoursTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of money kept outside business hours')]/following::TextArea"), "Details of money kept outside business hours TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloorDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is the safe where money is kept, fixed to the walls or floor')]/following::select"), "Is the safe where money is kept, fixed to the walls or floor Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		byWhomAreTheKeysHeldTextField= new PageElement(By.xpath("//td//div[contains(text(),'By whom are the keys held')]/following::input"), "By whom are the keys held TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areAllTheKeysRemovedOutsideBusinessHoursDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Are all the keys removed outside business hours')]/following::select"), "Are all the keys removed outside business hours Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess')]/following::input"), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		dGMorRMDiscretionaryDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"), "DGM / RM Discretionary discount(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"), "Adverse Claim Experience Loading (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Other Loading (in %)')]/following::input"), "Other Loading (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonForOtherLoadingTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Give Reason for Other Loading')]/following::TextArea"), "Give Reason for Other Loading Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::TextArea"), "Special Conditions Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransportForMoneyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Mode of transport for money')]/following::input"), "Mode of transport for money TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-PB
		physicianNameTextField= new PageElement(By.xpath("//td//div[contains(text(),'Physician Name')]/following::input"), "Physician Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianAddressTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Physician Address')]/following::TextArea"), "Physician Address Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianRegistrationNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Physician Registration No')]/following::input"), "Physician Registration No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		physicianTelephoneNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Physician Telephone No')]/following::input"), "Physician Telephone No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherInformationIfAnyTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Other information (if any)')]/following::TextArea"), "Other information (if any) Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalReportAttachedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Medical Report attached?')]/following::TextArea"), "Medical Report attached? Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		briefDetailsOfTheReportTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Brief Details of the report')]/following::TextArea"), "Brief Details of the report Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		heightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Height')]/following::input"), "Height text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		weightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Weight')]/following::input"), "Weight text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouSmokeCigarettesCigarORPipeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you smoke cigarettes, cigar or pipe?')]/following::select"), "Do you smoke cigarettes, cigar or pipe? Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doYouChewTobaccoDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you chew tobacco?')]/following::select"), "Do you chew tobacco? Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doYouDrinkAlcoholDropDown=  new PageElement(By.xpath("//td//div[contains(text(),'Do you Drink Alcohol?')]/following::select"), "Do you Drink Alcohol? Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPreExistingDiseasesRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Details of Pre Existing Diseases Required')]/following::select"), "Details of Pre Existing Diseases Required Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		diseaseDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Disease Details')]/following::input"), "Disease Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		addButton= new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton= new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton= new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Mayur-FI
		excessTextField= new PageElement(By.xpath("//td/div[contains(text(),'Excess')]/following::input"),"Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dGmRmDiscretionaryDiscountTextField= new PageElement(By.xpath("//td/div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"),"DGM RM Discretionary Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingInTextField= new PageElement(By.xpath("//td/div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"),"Adverse Claim Experience Loading In TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingInTextField= new PageElement(By.xpath("//td/div[contains(text(),'Journey Description')]/following::input"),"Other Loading In TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonForOtherLoadingTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Give Reason for Other Loading')]/following::TextArea"),"Give Reason For Other Loading TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea= new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions')]/following::TextArea"),"Special Conditions TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-PY
		whichJurisdictionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Which Jurisdiction')]/following::select"), "Which Jurisdiction Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratePercentForJurisdictionTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate (%) for Jurisdiction')]/following::input"),"Rate (%) for Jurisdiction TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-BI
		detailsOfStockOwnButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of stock (Own)')]/following::input"), "Details of stock (Own) Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		rateForStockPercentTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate for Stock (%)')]/following::input"),"Rate for Stock (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodsHeldInTrustANDORCommissionButton= new PageElement(By.xpath("//td//div[contains(text(),'Goods Held in Trust and/or Commission')]/following::input"), "Goods Held in Trust and/or Commission Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateForGoodsHeldPercentTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate for Goods held (%)')]/following::input"),"Rate for Goods held (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		firstLossRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'First Loss Required')]/following::select"), "First Loss Required Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		firstLossPercentDropDown= new PageElement(By.xpath("//td//div[contains(text(),'First Loss (%)')]/following::select"), "First Loss (%) Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfFurnitureFixtureFittingsButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Furniture/Fixture/Fittings')]/following::input"), "Details of Furniture/Fixture/Fittings Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateForFurnitureFixtureFittingsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate for Furniture/Fixture/Fittings')]/following::input"),"Rate for Furniture/Fixture/Fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfOfficeEquipmentButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Office equipment')]/following::input"), "Details of Office equipment Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateForOfficeEquipmentTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate for Office equipment')]/following::input"),"Rate for Office equipment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfCoinsCurrencyCuriosEtcButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Coins/Currency/Curios etc')]/following::input"), "Details of Coins/Currency/Curios etc Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateForCoinsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate for Coins')]/following::input"),"Rate for Coins TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfOtherItemsButton= new PageElement(By.xpath("//td//div[contains(text(),'Description of Other items')]/following::input"), "Description of Other items Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateForOthersTextField=  new PageElement(By.xpath("//td/div[contains(text(),'Rate for others')]/following::input"),"Rate for others TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-BB
		rateInPercentTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate (in percent)')]/following::input"),"Rate (in percent) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfEmployeesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Number of Employees')]/following::input")," Number of Employees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		perCapitaEmployeeLoadingTextField= new PageElement(By.xpath("//td/div[contains(text(),'Per capita Employee loading')]/following::input"),"Per capita Employee loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalStaffLoadingTextField= new PageElement(By.xpath("//td/div[contains(text(),'Total Staff Loading')]/following::input"),"Total Staff Loading TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalSumInsuredForMoneyInPremisesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Additional sum insured for Money in Premises')]/following::input"),"Additional sum insured for Money in Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentForMoneyInPremisesTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate (%) for Money in Premises')]/following::input"),"Rate (%) for Money in Premises TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalSumInsuredForMoneyInTransitTextField= new PageElement(By.xpath("//td/div[contains(text(),'Additional sum insured for Money in Transit')]/following::input"),"Additional sum insured for Money in Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentForMoneyInTransitTextField= new PageElement(By.xpath("//td/div[contains(text(),'Rate (%) for Money in Transit')]/following::input"),"Rate (%) for Money in Transit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitsOfLiabilityForRegisteredPostalSendingTextField= new PageElement(By.xpath("//td/div[contains(text(),'Limits of Liability for Registered Postal Sending')]/following::input"),"Limits of Liability for Registered Postal Sending TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-BN
		limitsOfLiabilityForAppraisersTextField= new PageElement(By.xpath("//td/div[contains(text(),'Limits of Liability for Appraisers')]/following::input"),"Limits of Liability for Appraisers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Limits of Liability for Collection Agent (Janta, Choti bachat yojana, pigmie collectors)')]/following::input"),"Limits of Liability for Collection Agent (Janta, Choti bachat yojana, pigmie collectors) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SE
		hoRoDoApprovalNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'HO(or)RO(or)DO Approval No')]/following::input"),"HO(or)RO(or)DO Approval No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BN
		excessBNTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DGMorRMDiscretionaryDiscountPercentageBNTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("DGM / RM Discretionary discount(%)", "input")), "DGM / RM Discretionary discount(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingInPercentageBNTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Adverse Claim Experience Loading (in %)", "input")), "Adverse Claim Experience Loading (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingINPercentageBNTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Loading (in %)", "input")), "Other Loading (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonforOtherLoadingBNTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Give Reason for Other Loading", "textarea")), "Give Reason for Other Loading Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsOneBNTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1", "textarea")), "Special Conditions1 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTwoBNTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2", "textarea")), "Special Conditions2 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//JI
		imposedExcessDeductibleTextField= new PageElement(By.xpath("//td/div[contains(text(),'Imposed Excess (Deductible)')]/following::input"),"Imposed Excess Deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backToRiskListButton = new PageElement(By.xpath("//td//input[@name='Back to Risk List']"),  "Back To Risk List Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//BD
		specialConditions1TextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1", "textarea")), "Special Conditions1 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions2TextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2", "textarea")), "Special Conditions1 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BI
		stockinTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Stock in Trade", "input")), "Stock in Trade Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodsHeldInTrustCommissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Goods held in Trust/Commission", "input")), "Goods held in Trust/Commission Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		furnitureFixtureFittingsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Furniture/Fixture/Fittings", "input")), "Furniture/Fixture/Fittings Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeEquipmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Office equipment", "input")), "Office equipment Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coinsCurrencyCuriosEtcTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Coins/Currency/Curios etc", "input")), "Coins/Currency/Curios etc Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		othersSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Others sum insured", "input")), "Others sum insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total sum insured", "input")), "Total sum insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		horodoAprovalNoTextField=new PageElement(By.xpath("//td//div[@id='HO(or)RO(or)DO Approval No']/following::input[1]"), "horodoAprovalNoTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	//SE
		compensationLimitPerAccidentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per accident", "input")), "Compensation Limit per accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}


	public void fillPolicyInsuredIntrestOtherRiskDetailsMiscNLDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("add") || polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur-MI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigMaximumDistanceOverWhichMoneyWillBeConveyed")) {
				clearAndSendKeys(maximumDistanceOverWhichMoneyWillBeConveyedTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("MaximumDistanceOverWhichMoneyWillBeConveyed"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfEmployeesHandlingMoney")) {
				clearAndSendKeys(detailsOfEmployeesHandlingMoneyTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfEmployeesHandlingMoney"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHowIsMoneyCarried")) {
				clearAndSendKeys(howIsMoneyCarriedTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("HowIsMoneyCarried"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigModeOfTransportForMoney")) {
				clearAndSendKeys(modeOfTransportForMoneyTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("ModeOfTransportForMoney"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfArmedGuardsOrAnyOtherProtection")) {
				clearAndSendKeys(detailsOfArmedGuardsOrAnyOtherProtectionTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfArmedGuardsOrAnyOtherProtection"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfMoneyKeptOutsideBusinessHours")) {
				clearAndSendKeys(detailsOfMoneyKeptOutsideBusinessHoursTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfMoneyKeptOutsideBusinessHours"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigIsTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloor")) {
				selectValueFromList(isTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloorDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("IsTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloor"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigByWhomAreTheKeysHeld")) {
				clearAndSendKeys(byWhomAreTheKeysHeldTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("ByWhomAreTheKeysHeld"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAreAllTheKeysRemovedOutsideBusinessHours")) {
				selectValueFromList(areAllTheKeysRemovedOutsideBusinessHoursDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AreAllTheKeysRemovedOutsideBusinessHours"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("Excess"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGMorRMDiscretionaryDiscountPercent")) {
				clearAndSendKeys(dGMorRMDiscretionaryDiscountPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGMorRMDiscretionaryDiscountPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingInPercent")) {
				clearAndSendKeys(adverseClaimExperienceLoadingInPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingInPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingInPercent")) {
				clearAndSendKeys(otherLoadingInPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingInPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonForOtherLoadingTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions"));
			}
			//Mayur-PB
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianName")) {
				clearAndSendKeys(physicianNameTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianName"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianAddress")) {
				clearAndSendKeys(physicianAddressTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianAddress"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianRegistrationNo")) {
				clearAndSendKeys(physicianRegistrationNoTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianRegistrationNo"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianTelephoneNo")) {
				clearAndSendKeys(physicianTelephoneNoTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianTelephoneNo"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherInformationIfAny")) {
				clearAndSendKeys(otherInformationIfAnyTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherInformationIfAny"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigMedicalReportAttached")) {
				clearAndSendKeys(medicalReportAttachedTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("MedicalReportAttached"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigBriefDetailsOfTheReport")) {
				clearAndSendKeys(briefDetailsOfTheReportTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("BriefDetailsOfTheReport"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHeight")) {
				clearAndSendKeys(heightTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("Height"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigWeight")) {
				clearAndSendKeys(weightTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("Weight"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarORPipe")) {
				selectValueFromList(doYouSmokeCigarettesCigarORPipeDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DoYouSmokeCigarettesCigarORPipe"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoYouChewTobacco")) {
				selectValueFromList(doYouChewTobaccoDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DoYouChewTobacco"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoYouDrinkAlcohol")) {
				selectValueFromList(doYouDrinkAlcoholDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("doYouDrinkAlcohol"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseasesRequired")) {
				selectValueFromList(detailsOfPreExistingDiseasesRequiredDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfPreExistingDiseasesRequired"));
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRiskDescriptionOfPackagePolicy")) {
				fillParameterListForDiseaseDetails(polInsIntRiskOtherDetMNLEntity,assertReference);		
			}			
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsured"));
			}
			//FI-Mayur
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("Excess"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGmRmDiscretionaryDiscount")) {
				clearAndSendKeys(dGmRmDiscretionaryDiscountTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGmRmDiscretionaryDiscount"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingIn")) {
				clearAndSendKeys(adverseClaimExperienceLoadingInTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingIn"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingIn")) {
				clearAndSendKeys(otherLoadingInTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingIn"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonForOtherLoadingTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions"));
			}
			//Mayur-PY
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigWhichJurisdiction")) {
				selectValueFromList(whichJurisdictionDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("WhichJurisdiction"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForJurisdiction")) {
				clearAndSendKeys(ratePercentForJurisdictionTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForJurisdiction"));
			}
			//Mayur-BI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForStockPercent")) {
				clearAndSendKeys(rateForStockPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForStockPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForGoodsHeldPercent")) {
				clearAndSendKeys(rateForGoodsHeldPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForGoodsHeldPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForFurnitureFixtureFittings")) {
				clearAndSendKeys(rateForFurnitureFixtureFittingsTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForFurnitureFixtureFittings"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForOfficeEquipment")) {
				clearAndSendKeys(rateForOfficeEquipmentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForOfficeEquipment"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForCoins")) {
				clearAndSendKeys(rateForCoinsTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForCoins"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForOthers")) {
				clearAndSendKeys(rateForOthersTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForOthers"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFirstLossRequired")) {
				selectValueFromList(firstLossRequiredDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("FirstLossRequired"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFirstLossPercent")) {
				selectValueFromList(firstLossPercentDropDown, polInsIntRiskOtherDetMNLEntity.getStringValueForField("FirstLossPercent"));
			}

			//Mayur-BB
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				clearAndSendKeys(rateInPercentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateInPercent"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigNumberOfEmployees")) {
				clearAndSendKeys(numberOfEmployeesTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("NumberOfEmployees"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPerCapitaEmployeeLoading")) {
				clearAndSendKeys(perCapitaEmployeeLoadingTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("PerCapitaEmployeeLoading"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInPremises")) {
				clearAndSendKeys(additionalSumInsuredForMoneyInPremisesTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInPremises"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForMoneyInPremises")) {
				clearAndSendKeys(ratePercentForMoneyInPremisesTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForMoneyInPremises"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInTransit")) {
				clearAndSendKeys(additionalSumInsuredForMoneyInTransitTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInTransit"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForMoneyInTransit")) {
				clearAndSendKeys(ratePercentForMoneyInTransitTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForMoneyInTransit"));
			}
			//se
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHoRoDoApprovalNumber")) {
				clearAndSendKeys(hoRoDoApprovalNumberTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("HoRoDoApprovalNumber"));
				click(forwordButton);
			}
			//JI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigImposedExcessDeductible")) {
				clearAndSendKeys(imposedExcessDeductibleTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("ImposedExcessDeductible"));
			}
			//BD
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				clearAndSendKeys(specialConditions1TextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions1"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				clearAndSendKeys(specialConditions2TextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions2"));
			}
			//BI
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfStockOwn")) {
				fillDetailsOfStockOwnDetails(polInsIntRiskOtherDetMNLEntity);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustAndOrCommission")) {
				fillGoodsHeldInTrustAndOrCommissionDetails(polInsIntRiskOtherDetMNLEntity);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfFurnitureFixtureFittings")) {
				fillDetailsOfFurnitureFixtureFittingsDetails(polInsIntRiskOtherDetMNLEntity);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfOfficeEquipment")) {
				fillDetailsOfOfficeEquipmentDetails(polInsIntRiskOtherDetMNLEntity);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfCoinsCurrencyCuriosEtc")) {
				fillDetailsOfCoinsCurrencyCuriosEtcDetails(polInsIntRiskOtherDetMNLEntity);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDescriptionOfOtherItems")) {
				fillDescriptionOfOtherItemsDetails(polInsIntRiskOtherDetMNLEntity);
			}
			//SE
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")) {
				clearAndSendKeys(compensationLimitPerAccidentTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("CompensationLimitPerAccident"));
				click(forwordButton);
			}
		}
		else if(polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			//Mayur-MI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigMaximumDistanceOverWhichMoneyWillBeConveyed")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("MaximumDistanceOverWhichMoneyWillBeConveyed"), fetchValueFromTextFields(maximumDistanceOverWhichMoneyWillBeConveyedTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfEmployeesHandlingMoney")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfEmployeesHandlingMoney"), fetchValueFromTextFields(detailsOfEmployeesHandlingMoneyTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHowIsMoneyCarried")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("HowIsMoneyCarried"), fetchValueFromTextFields(howIsMoneyCarriedTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigModeOfTransportForMoney")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("ModeOfTransportForMoney"), fetchValueFromTextFields(modeOfTransportForMoneyTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfArmedGuardsOrAnyOtherProtection")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfArmedGuardsOrAnyOtherProtection"), fetchValueFromTextFields(detailsOfArmedGuardsOrAnyOtherProtectionTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigIsTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloor")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("IsTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloor"), fetchValueFromList(isTheSafeWwhereMoneyIsKeptFixedToTheWallsOrFloorDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigbyWhomAreTheKeysHeld")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("ByWhomAreTheKeysHeld"), fetchValueFromTextFields(byWhomAreTheKeysHeldTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAreAllTheKeysRemovedOutsideBusinessHours")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AreAllTheKeysRemovedOutsideBusinessHours"), fetchValueFromList(areAllTheKeysRemovedOutsideBusinessHoursDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGMorRMDiscretionaryDiscountPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGMorRMDiscretionaryDiscountPercent"), fetchValueFromTextFields(adverseClaimExperienceLoadingInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingInPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingInPercent"), fetchValueFromTextFields(dGMorRMDiscretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingInPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingInPercent"), fetchValueFromTextFields(otherLoadingInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"), fetchValueFromTextFields(giveReasonForOtherLoadingTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfMoneyKeptOutsideBusinessHours")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfMoneyKeptOutsideBusinessHours"), fetchValueFromTextFields(detailsOfMoneyKeptOutsideBusinessHoursTextArea), AssertionType.WARNING);
			}
			//Mayur-PB
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianName")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianName").toLowerCase(), fetchValueFromTextFields(physicianNameTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianAddress")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianAddress"), fetchValueFromTextFields(physicianAddressTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianRegistrationNo")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianRegistrationNo"), fetchValueFromTextFields(physicianRegistrationNoTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPhysicianTelephoneNo")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("PhysicianTelephoneNo"), fetchValueFromTextFields(physicianTelephoneNoTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherInformationIfAny")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherInformationIfAny"), fetchValueFromTextFields(otherInformationIfAnyTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigMedicalReportAttached")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("MedicalReportAttached"), fetchValueFromTextFields(medicalReportAttachedTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigBriefDetailsOfTheReport")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("BriefDetailsOfTheReport"), fetchValueFromTextFields(briefDetailsOfTheReportTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHeight")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("Height"), fetchValueFromTextFields(heightTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigWeight")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("Weight"), fetchValueFromTextFields(weightTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarORPipe")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DoYouSmokeCigarettesCigarORPipe"), fetchValueFromList(doYouSmokeCigarettesCigarORPipeDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoYouChewTobacco")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DoYouChewTobacco"), fetchValueFromList(doYouChewTobaccoDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseasesRequired")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DetailsOfPreExistingDiseasesRequired"), fetchValueFromList(detailsOfPreExistingDiseasesRequiredDropDown), AssertionType.WARNING);
			}
			//FI-Mayur
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGmRmDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGmRmDiscretionaryDiscount"), fetchValueFromTextFields(dGmRmDiscretionaryDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingIn")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingIn"), fetchValueFromTextFields(adverseClaimExperienceLoadingInTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingIn")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingIn"), fetchValueFromTextFields(otherLoadingInTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"), fetchValueFromTextFields(giveReasonForOtherLoadingTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			//Mayur-PY
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigWhichJurisdiction")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("WhichJurisdiction"), fetchValueFromList(whichJurisdictionDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForJurisdiction")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForJurisdiction"), fetchValueFromTextFields(ratePercentForJurisdictionTextField), AssertionType.WARNING);
			}
			//Mayur-BI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForStockPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForStockPercent"), fetchValueFromTextFields(rateForStockPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForGoodsHeldPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForGoodsHeldPercent"), fetchValueFromTextFields(rateForGoodsHeldPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForFurnitureFixtureFittings")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForFurnitureFixtureFittings"), fetchValueFromTextFields(rateForFurnitureFixtureFittingsTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForCoins")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForCoins"), fetchValueFromTextFields(rateForCoinsTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateForOthers")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateForOthers"), fetchValueFromTextFields(rateForOthersTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFirstLossPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("FirstLossPercent"), fetchValueFromList(firstLossPercentDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFirstLossRequired")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("FirstLossRequired"), fetchValueFromList(firstLossRequiredDropDown), AssertionType.WARNING);
			}
			//Mayur-BB
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RateInPercent"), fetchValueFromTextFields(rateInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigNumberOfEmployees")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("NumberOfEmployees"), fetchValueFromTextFields(numberOfEmployeesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPerCapitaEmployeeLoading")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("PerCapitaEmployeeLoading"), fetchValueFromTextFields(perCapitaEmployeeLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigTotalStaffLoading")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("TotalStaffLoading"), fetchValueFromTextFields(totalStaffLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInPremises")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInPremises"), fetchValueFromTextFields(additionalSumInsuredForMoneyInPremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForMoneyInPremises")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForMoneyInPremises"), fetchValueFromTextFields(ratePercentForMoneyInPremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdditionalSumInsuredForMoneyInTransit")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdditionalSumInsuredForMoneyInTransit"), fetchValueFromTextFields(additionalSumInsuredForMoneyInTransitTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRatePercentForMoneyInTransit")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("RatePercentForMoneyInTransit"), fetchValueFromTextFields(ratePercentForMoneyInTransitTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForRegisteredPostalSending")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("LimitsOfLiabilityForRegisteredPostalSending"), fetchValueFromTextFields(limitsOfLiabilityForRegisteredPostalSendingTextField), AssertionType.WARNING);
			}
			//Mayur-BN
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForAppraisers")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("LimitsOfLiabilityForAppraisers"), fetchValueFromTextFields(limitsOfLiabilityForAppraisersTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigLimitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectors")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("LimitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectors"), fetchValueFromTextFields(limitsOfLiabilityForCollectionAgentJantaChotiBachatYojanaPigmieCollectorsTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHoRoDoApprovalNumber")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("HoRoDoApprovalNumber"), fetchValueFromTextFields(hoRoDoApprovalNumberTextField), AssertionType.WARNING);
				click(forwordButton);		
			}
			//JI
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigImposedExcessDeductible")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("ImposedExcessDeductible"), fetchValueFromTextFields(imposedExcessDeductibleTextField), AssertionType.WARNING);
			}
			//SE
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")){
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("CompensationLimitPerAccident"), fetchValueFromTextFields(compensationLimitPerAccidentTextField), AssertionType.WARNING);
			}
			//BI
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfStockOwn")) {
				verifyDetailsOfStockOwnDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustAndOrCommission")) {
				verifyGoodsHeldInTrustAndOrCommissionDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfFurnitureFixtureFittings")) {
				verifyDetailsOfFurnitureFixtureFittingsDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfOfficeEquipment")) {
				verifyDetailsOfOfficeEquipmentDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfCoinsCurrencyCuriosEtc")) {
				verifyDetailsOfCoinsCurrencyCuriosEtcDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDescriptionOfOtherItems")) {
				verifyDescriptionOfOtherItemsDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
			}
		}
	}

	public void clickOnOpenButton(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDiseaseDetailsButton")) {
			click(diseaseDetailsButton);
			Thread.sleep(5000);
			switchToWindow("'Disease Details' Details");
		}
	}
	public void clickOnOpenButtonDetailsOfStockOwn(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfStockOwnButton")) {
			click(detailsOfStockOwnButton);
			Thread.sleep(3000);
			switchToWindow("'Details of stock (Own)' Details");
		}
	}

	public void clickOnOpenButtonGoodsHeldInTrust(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustANDORCommissionButton")) {
			click(goodsHeldInTrustANDORCommissionButton);
			Thread.sleep(3000);
			switchToWindow("'Goods Held in Trust and/or Commission' Details");
		}
	}
	public void clickOnOpenButtonDetailsOfFurniture(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{	
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfFurnitureFixtureFittingsButton")) {
			click(detailsOfFurnitureFixtureFittingsButton);
			Thread.sleep(3000);
			switchToWindow("'Details of Furniture/Fixture/Fittings' Details");
		}
	}
	public void clickOnOpenButtonDetailsOfOfficeEquipment(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfOfficeEquipmentButton")) {
			click(detailsOfOfficeEquipmentButton);
			Thread.sleep(3000);
			switchToWindow("'Details of Office equipment' Details");
		}
	}
	public void clickOnOpenButtonDetailsOfCoinsCurrency(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{	
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDetailsOfCoinsCurrencyCuriosEtcButton")) {
			click(detailsOfCoinsCurrencyCuriosEtcButton);
			Thread.sleep(3000);
			switchToWindow("'Details of Coins/Currency/Curios etc' Details");
		}
	}
	public void clickOnOpenButtonDescriptionOfOtherItems(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDescriptionOfOtherItemsButton")) {
			click(descriptionOfOtherItemsButton);
			Thread.sleep(3000);
			switchToWindow("'Description of Other items' Details");
		}
	}

	public void fillParameterListForDiseaseDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(polInsIntRiskOtherDetMNLEntity);

		int rowcount= 0;

		diseaseSufferedSufferingTextArea= new PageElement(By.name("Data_232566427082010_"+rowcount+""), "Description of Property text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalReportTextArea= new PageElement(By.name("Data_232566527082010_"+rowcount+""), "Address of location Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDiseaseSufferedSuffering")) {
				clearAndSendKeys(diseaseSufferedSufferingTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DiseaseSufferedSuffering"));
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigMedicalReport")) {
				clearAndSendKeys(medicalReportTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("MedicalReport"));
			}
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
	}	

	public void navigateTobackAttributePage(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
		}
		else if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDoubleForwordButton")){			
			click(forwordButton);
			click(forwordButton);
			switchToFrame("display");
		}
		else if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigHORODOApprovalNo")){		
			//click(forwordButton);
			clearAndSendKeys(horodoAprovalNoTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("HORODOApprovalNo"));
			click(forwordButton);
		}
	}


	public void navigateToPolicy(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRedirectToInsuredInterestTab")){
				click(memberDetailTitle);
				click(backToRiskListButton);
				switchToFrame("display");
			}
			insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polInsIntRiskOtherDetMNLEntity.getStringValueForField("InsuredInterestAttributesTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			if (!polInsIntRiskOtherDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("PB")){			
				isElementDisplayed(insuredInterestTabTitle);
			}
		}
	}


	public void navigateToCoverage(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void clickSaveButton(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity){
		if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigPageSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillExcessLoadingAndDiscDetailsForBN(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("add") || polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("edit")){
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcessBN")) {
				clearAndSendKeys(excessBNTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("ExcessBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGMorRMDiscretionaryDiscountPercentageBN")) {
				clearAndSendKeys(DGMorRMDiscretionaryDiscountPercentageBNTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGMorRMDiscretionaryDiscountPercentageBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingInPercentageBN")) {
				clearAndSendKeys(adverseClaimExperienceLoadingInPercentageBNTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingInPercentageBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingINPercentageBN")) {
				clearAndSendKeys(otherLoadingINPercentageBNTextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingINPercentageBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonforOtherLoadingBN")) {
				clearAndSendKeys(giveReasonforOtherLoadingBNTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonforOtherLoadingBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsOneBN")) {
				clearAndSendKeys(specialConditionsOneBNTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsOneBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsTwoBN")) {
				clearAndSendKeys(specialConditionsTwoBNTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsTwoBN"));
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsBB")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsBB"));
			}
			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigEndorse"))
			{
				click(forwordButton);
			}
			else
			{
				click(forwordButton);
				click(forwordButton);
			}
		}
		else if(polInsIntRiskOtherDetMNLEntity.getAction().equalsIgnoreCase("verify")){

			if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigExcessBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("ExcessBN"), fetchValueFromTextFields(excessBNTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDGMorRMDiscretionaryDiscountPercentageBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("DGMorRMDiscretionaryDiscountPercentageBN"), fetchValueFromTextFields(DGMorRMDiscretionaryDiscountPercentageBNTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingInPercentageBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingInPercentageBN"), fetchValueFromTextFields(adverseClaimExperienceLoadingInPercentageBNTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingINPercentageBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherLoadingINPercentageBN"), fetchValueFromTextFields(otherLoadingINPercentageBNTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGiveReasonforOtherLoadingBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("GiveReasonforOtherLoadingBN"), fetchValueFromTextFields(giveReasonforOtherLoadingBNTextArea), AssertionType.WARNING);	
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsOneBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsOneBN"), fetchValueFromTextFields(specialConditionsOneBNTextArea), AssertionType.WARNING);	
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsTwoBN")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsTwoBN"), fetchValueFromTextFields(specialConditionsTwoBNTextArea), AssertionType.WARNING);	
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSpecialConditionsBB")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SpecialConditionsBB"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			// BI Other Risk Details Page
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigStockInTrade")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("StockInTrade"), fetchValueFromTextFields(stockinTradeTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustCommission")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("GoodsHeldInTrustCommission"), fetchValueFromTextFields(goodsHeldInTrustCommissionTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFurnitureFixtureFittings")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("FurnitureFixtureFittings"), fetchValueFromTextFields(furnitureFixtureFittingsTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOfficeEquipment")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OfficeEquipment"), fetchValueFromTextFields(officeEquipmentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCoinsCurrencyCuriosEtc")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("CoinsCurrencyCuriosEtc"), fetchValueFromTextFields(coinsCurrencyCuriosEtcTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOthersSumInsured")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OthersSumInsured"), fetchValueFromTextFields(othersSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
		}
	}
	public void fillDetailsOfStockOwnDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		clickOnOpenButtonDetailsOfStockOwn(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;
		stockDetailsTextArea = new PageElement(By.name("Data_258210704032011_"+rowcount+""), " STOCK DETAILS Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSTOCKDETAILS")) {
			clearAndSendKeys(stockDetailsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("STOCKDETAILS"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForStock")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredForStock"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	public void verifyDetailsOfStockOwnDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButtonDetailsOfStockOwn(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;
		stockDetailsTextArea = new PageElement(By.name("Data_258210704032011_"+rowcount+""), " STOCK DETAILS Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSTOCKDETAILS")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("STOCKDETAILS"), fetchValueFromTextFields(stockDetailsTextArea), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForStock")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredForStock"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);	
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	public void fillGoodsHeldInTrustAndOrCommissionDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException{
		clickOnOpenButtonGoodsHeldInTrust(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		gOODSHELDDETAILSTextArea= new PageElement(By.name("Data_258210804032011_"+rowcount+""), "  GOODS HELD DETAILS Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGOODSHELDDETAILS")) {
			clearAndSendKeys(gOODSHELDDETAILSTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("GOODSHELDDETAILS"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredGoodHeld")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredGoodHeld"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	public void verifyGoodsHeldInTrustAndOrCommissionDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButtonGoodsHeldInTrust(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		gOODSHELDDETAILSTextArea= new PageElement(By.name("Data_258210804032011_"+rowcount+""), "  GOODS HELD DETAILS Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigGOODSHELDDETAILS")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("GOODSHELDDETAILS"), fetchValueFromTextFields(gOODSHELDDETAILSTextArea), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredGoodHeld")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredGoodHeld"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	private void fillDetailsOfFurnitureFixtureFittingsDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException {
		clickOnOpenButtonDetailsOfFurniture(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		furnitureFixtureFittingsDetailsTextArea= new PageElement(By.name("Data_258215604032011_"+rowcount+""), " Furniture/Fixture/Fittings Details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFurnitureFixtureFittingsDetails")) {
			clearAndSendKeys(furnitureFixtureFittingsDetailsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("FurnitureFixtureFittingsDetails"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredFurnitureFixture")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredFurnitureFixture"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	public void verifyDetailsOfFurnitureFixtureFittingsDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButtonDetailsOfFurniture(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;
		furnitureFixtureFittingsDetailsTextArea= new PageElement(By.name("Data_258215604032011_"+rowcount+""), " Furniture/Fixture/Fittings Details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigFurnitureFixtureFittingsDetails")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("FurnitureFixtureFittingsDetails"), fetchValueFromTextFields(furnitureFixtureFittingsDetailsTextArea), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredFurnitureFixture")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredFurnitureFixture"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	private void fillDetailsOfOfficeEquipmentDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException {
		clickOnOpenButtonDetailsOfOfficeEquipment(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		officeEquipmentDetailsTextArea= new PageElement(By.name("Data_258215704032011_"+rowcount+""), "Office equipment details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOfficeEquipmentDetails")) {
			clearAndSendKeys(officeEquipmentDetailsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OfficeEquipmentDetails"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredOfficeEquipment")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredOfficeEquipment"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	private void verifyDetailsOfOfficeEquipmentDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException {
		clickOnOpenButtonDetailsOfOfficeEquipment(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		officeEquipmentDetailsTextArea= new PageElement(By.name("Data_258215704032011_"+rowcount+""), "Office equipment details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOfficeEquipmentDetails")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OfficeEquipmentDetails"), fetchValueFromTextFields(officeEquipmentDetailsTextArea), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredOfficeEquipment")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredOfficeEquipment"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	private void fillDetailsOfCoinsCurrencyCuriosEtcDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException {

		clickOnOpenButtonDetailsOfCoinsCurrency(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		coinsCurrencyCuriosDetailsTextArea= new PageElement(By.name("Data_258215804032011_"+rowcount+""), " Coins/Currency/Curios details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCoinsCurrencyCuriosDetails")) {
			clearAndSendKeys(coinsCurrencyCuriosDetailsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("CoinsCurrencyCuriosDetails"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredCoinsCurrencyCurios")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredCoinsCurrencyCurios"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	private void verifyDetailsOfCoinsCurrencyCuriosEtcDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException {
		clickOnOpenButtonDetailsOfCoinsCurrency(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		coinsCurrencyCuriosDetailsTextArea= new PageElement(By.name("Data_258215804032011_"+rowcount+""), "Coins Currency Curios Details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCoinsCurrencyCuriosDetails")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("CoinsCurrencyCuriosDetails"), fetchValueFromTextFields(coinsCurrencyCuriosDetailsTextArea), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredCoinsCurrencyCurios")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredCoinsCurrencyCurios"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	private void fillDescriptionOfOtherItemsDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity) throws InterruptedException {
		clickOnOpenButtonDescriptionOfOtherItems(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		otherItemdetailsTextArea= new PageElement(By.name("Data_258215904032011_"+rowcount+""), " Coins/Currency/Curios details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherItemdetails")) {
			clearAndSendKeys(otherItemdetailsTextArea, polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherItemdetails"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredOtherItem")) {
			clearAndSendKeys(sumInsuredBITextField, polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredOtherItem"));
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	private void verifyDescriptionOfOtherItemsDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity,CustomAssert assertReference) throws InterruptedException {

		clickOnOpenButtonDescriptionOfOtherItems(polInsIntRiskOtherDetMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;

		otherItemdetailsTextArea= new PageElement(By.name("Data_258215904032011_"+rowcount+""), " Coins/Currency/Curios details Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBITextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), " Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigOtherItemdetails")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("OtherItemdetails"), fetchValueFromTextFields(otherItemdetailsTextArea), AssertionType.WARNING);			
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSumInsuredOtherItem")) {
			assertReference.assertEquals(polInsIntRiskOtherDetMNLEntity.getStringValueForField("SumInsuredOtherItem"), fetchValueFromTextFields(sumInsuredBITextField), AssertionType.WARNING);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polInsIntRiskOtherDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	public void fillandSubmitPolicyInsuredIntrestOtherRiskDetailsMiscNLDetails(PolInsIntOthrRiskDMNLEntity polInsIntRiskOtherDetMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(polInsIntRiskOtherDetMNLEntity.getConfigExecute())){
			switchToFrame("display");
			//clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntRiskOtherDetMNLEntity);
			
			fillPolicyInsuredIntrestOtherRiskDetailsMiscNLDetails(polInsIntRiskOtherDetMNLEntity, assertReference);
		   clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntRiskOtherDetMNLEntity);
			if(polInsIntRiskOtherDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BN") || polInsIntRiskOtherDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BB")|| polInsIntRiskOtherDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BI")){
				fillExcessLoadingAndDiscDetailsForBN(polInsIntRiskOtherDetMNLEntity,assertReference);
			}
			clickSaveButton(polInsIntRiskOtherDetMNLEntity);
			navigateTobackAttributePage(polInsIntRiskOtherDetMNLEntity);
			navigateToPolicy(polInsIntRiskOtherDetMNLEntity);
			navigateToAttribute(polInsIntRiskOtherDetMNLEntity);
			navigateToInsuredInterest(polInsIntRiskOtherDetMNLEntity);
			navigateToCoverage(polInsIntRiskOtherDetMNLEntity);
			navigateToClientDetails(polInsIntRiskOtherDetMNLEntity);
			navigateToRelation(polInsIntRiskOtherDetMNLEntity);
			navigateToPayment(polInsIntRiskOtherDetMNLEntity);
			navigateToFollowup(polInsIntRiskOtherDetMNLEntity);
			navigateToDocument(polInsIntRiskOtherDetMNLEntity);
		}
	}
}
