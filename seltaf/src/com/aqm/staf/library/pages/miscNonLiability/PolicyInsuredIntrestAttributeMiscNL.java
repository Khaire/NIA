package com.aqm.staf.library.pages.miscNonLiability;

import javax.swing.text.DefaultEditorKit.BeepAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.JryDiscMNLEntity;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;
import com.aqm.staf.library.databin.PolInsIntRiskDetMNLEntity;


public class PolicyInsuredIntrestAttributeMiscNL extends BasePage{

	private PageElement riskDetailsT1PLRTitle;
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
	private PageElement insuredInterestDetailTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestrAttachCoveragesTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentsTitle;
	private PageElement insuredInterestScheduleTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;	
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
	private PageElement forwardButton;
	private PageElement backButton;

	//BB PAGEELEMENT
	private PageElement typeofBankforBankersIndemnityDropDown;
	private PageElement numberofBankBranchesDropDown;
	//BD PAGEELEMNT
	private PageElement	addressoflocationTextField;
	private PageElement	pinCodeDropDownBd;
	private PageElement	sumInsuredTextField;
	private PageElement occupancyDetailsDropDown;
	private PageElement basisofDeclarationDropDown;
	//BA - Priyanka
	private PageElement policyTypeForBaggageDropDown;
	private PageElement rateInPercentTextField;
	private PageElement floaterExtraPercentTextField;
	private PageElement perCapitaLoadingAmountTextField;  
	//BS - Priyanka
	private PageElement nameOfTheGirlTextArea;
	private PageElement dateOfBirthOfGirlTextField;
	private PageElement ageOfGirlTextField;
	private PageElement nameOfFatherOfTheGirlTextArea;
	private PageElement dateOfBirthOfFatherTextField;
	private PageElement fathersAgeTextField;
	private PageElement nameOfTheMotherTextArea;
	private PageElement dateOfBirthOfMotherTextField;
	private PageElement ageOfTheMotherTextField;
	//private PageElement sumInsuredTextField;
	// FS - Priyanka 
	private PageElement riskCoveredTextArea;
	private PageElement locationTextArea;
	private PageElement pinCodeTextFieldFS;
	private PageElement specialPerilsTextArea;
	private PageElement specialExclusionTextArea;
	private PageElement subjectToClauseTextArea;
	private PageElement specialExcessTextArea;
	private PageElement specialConditionTextArea;
	private PageElement descriptionTextArea;
	//MI - Priyanka
	private PageElement policyTypeForMoneyDropDown;
	//OS - Priyanka
	private PageElement buildingsIncludingFixtureAndFittingsTextField;
	private PageElement provisionForArchitectsSurveyorsLegalFeeAndDebrisRemovalTextField;
	private PageElement totalSumInsuredForSec1TextField;
	private PageElement ratePercentForSection1TextField;
	private PageElement natureOfBusinessTradeTextField;
	private PageElement sectionOfThePolicyTextField;
	private PageElement officeAddressOSTextField;
	private PageElement pinCodeOSTextField;
	//PB - Priyanka
	private PageElement nameOfTheMemberTextField;
	private PageElement dateOfBirthTextField;
	private PageElement sexDropDown;
	private PageElement passportNumberTextField;
	private PageElement dateOfIssueTextField;
	private PageElement visaTypeTextField;
	private PageElement correspondingAddressIndiaTextArea;
	private PageElement nameOfNextKinTextArea;
	private PageElement relationshipOfNextKinTextField;
	private PageElement addressOfNextKinTextArea;
	private PageElement telephoneNoOfNextKinTextField;
	private PageElement goodHealthDeclarationDropDown;
	//HH - Priyanka
	private PageElement isSection1ARequiredDropDown;
	private PageElement isSection1BRequiredDropDown;
	private PageElement ratePercentItemsForSection1BTextField;
	private PageElement sumInsuredForSection1ATextField;
	private PageElement ratePercentForSection1ATextField;
	private PageElement Sec1RskDtlsPage;
	private PageElement ItemsForsection1ADropDown;
	private PageElement descriptionOfItemsForSection1ATextArea;
	private PageElement itemsForSection1BDropDown; 
	private PageElement descriptionOfItemsForSection1BTextArea;
	private PageElement sumInsuredForSection1BTextField; 
	private PageElement openButton;
	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement staffDiscountHHDropDown;
	private PageElement addressOfBuildingHHTextArea;
	private PageElement pinCodeHHTextField;
	private PageElement itemsForSectionSec5DropDown;
	private PageElement sumInsuredForSection5TextField;
	private PageElement descriptionOfItemsForSection5TextArea;
	private PageElement sumInsuredFSection5TextField;

	//RR - Priyanka
	private PageElement nameOfTheWomanTextArea;
	private PageElement whetherWiderCoverRequiredDropDown;
	//Fl - Mayur
	private PageElement policyTypeForFidelityDropDown;
	//NI - Mayur
	private PageElement isTheBusinessDirectDropDown;
	private PageElement discountForDirectBusinessPercentTextField;
	//JI - Mayur
	private PageElement natureOfBusinessDropDown;
	private PageElement classOfRiskForTheHighestRatingDropDown;
	private PageElement addressOfPremisesWhereRiskIsCoveredTextArea;
	private PageElement pinCodeTextField;
	private PageElement stateDropDown;
	//PQ - Mayur
	private PageElement equipmentTypeDropDown;
	private PageElement descriptionOfTheEquipmentTextArea;
	private PageElement nameOfTheUserTextField;
	private PageElement addressTextArea;
	private PageElement ifMobilePleaseSpecifyMobileNumberTextField;
	private PageElement modeltextField;
	private PageElement yearOfMakedDropDown;
	private PageElement serialNumberOfTheEquipmentTextField;
	private PageElement rateForEquipmentInPercentTextField;
	private PageElement electricalAndMechanicalDamageDropDown;
	//PT - Mayur
	private PageElement policyTypeForPlateGlassDropDown;
	//PY - Mayur
	private PageElement riskDescriptionOfPackagePolicyButton;
	private PageElement addButton;
	private PageElement saveButton;
	private PageElement closeButton;
	private PageElement deleteButton;
	private PageElement descriptionOfPropertyTextArea;
	private PageElement addressOfLocationTextArea;
	//SE - Priyanka 
	private PageElement numberOfStudentsTextField;
	private PageElement compensationLimitPerStudentTextField;
	private PageElement compensationLimitPerAccidentTextField;
	private PageElement medicalExpensesPerStudentTextField;
	private PageElement ratePercentForMedicalExpensesTextField;
	private PageElement totalSumInsuredforMedicalExpensesTextField;
	//SH - Priyanka 
	private PageElement section1ARequiredDropDown;
	private PageElement valueOfTheBuildingClassAConstructionOnlyShopOwnedByInsuredTextField;
	private PageElement ratePercentTextField;
	//SK-Mayur
	private PageElement typeOfExchangeDropDown;
	private PageElement sEBIRegdNoForBSETextField;
	private PageElement bSERegdNoTextfield;
	private PageElement noOfExchangeBranchesDropDown;
	private PageElement exchangeBranchDetailsButton;
	private PageElement basicSumInsuredOfStockBrokersIndemnityDropDown;
	private PageElement basicPremiumForSKTextField;
	private PageElement nameOfTheBranchTextArea;
	private PageElement addressOfTheBranchTextArea;
	private PageElement section1BRequiredDropDown;
	private PageElement rskDtlsSec1Page;
	private PageElement compulsoryExcessForSection1DropDown;
	private PageElement contentsExcludingMoneyAndValuablesArticlesOfConsumableNature1FurnitureAndFixtureFittingTextField; 
	private PageElement descriptionOfFurnitureTextArea;
	private PageElement contentsExcludingMoneyAndValuableArticlesOfConsumableNature2StockAndTradeIncludingGoodsHeldInTheTrustTextField;
	private PageElement descriptionOfStockInTradeTextArea;
	//SY - Priyanka
	private PageElement compensationLimitPerYearTextField;
	private PageElement medicalExpensesPerStudentPerYearTextField;
	//EV PAGEELEMENT (chintan)
	private PageElement fireAndAlliedPerilsDropDown;
	private PageElement earthquakeDropDown;
	private PageElement cancellationOfEventDueToNationalMourningDropDown  ;
	private PageElement accidentalorElectricalGridfailureDropDown ;
	private PageElement telecastRightsForTVcoverageDropdown;
	private PageElement publicLiabilityDropDown;
	private PageElement descriptionofEventTextField;
	private PageElement eventStartDateFindButton;
	private PageElement eventEndDateFindButton;
	private PageElement eventStartDateTextField;
	private PageElement eventEndDateTextField;
	private PageElement excessAsDropDown;
	private PageElement excessAmountTextField;
	private PageElement jurisdictionOfTheEventDropDown;
	private PageElement locationDetailsOfTheEventTextField;
	private PageElement ratePercentageTextField;
	private PageElement typeOfRiskForEventCancellationDropDown;
	private PageElement coverForOtherExtensionDropDown;

	//EX PAGEELEMENT (chintan)
	private PageElement	riskCoveredTextField;
	private PageElement	descriptionOfTheRiskTextField;
	private PageElement	locationDetailsOfTheExhibitionTextField;
	private PageElement specialExclusionTextField;

	//BI-Rajkumar
	private PageElement policyTypeForBurglaryList;

	//akshata FI
	private PageElement guaranteeamountforNamedFloatingTextField;
	private PageElement limitperPersonTextField;
	private PageElement cadreTextArea;
	private PageElement nameOfThePersonTextArea;
	private PageElement sumInsuredTextFieldNewWindow;


	private PageElement isSection3ARequiredDropDown;
	private PageElement descriptionOfItemsForSection3ATextArea;
	private PageElement sumInsuredForSection3ATextField;
	private PageElement open3AButton;
	private PageElement suminsured4ATextField;
	private PageElement suminsured5ATextField;
	private PageElement openNewWindowButtonPY;


	//SH
	private PageElement openButtonSH;
	private PageElement section3AMoneyintransitTextField;
	private PageElement section3BMoneyintillduringbusinesshoursTextField;
	private PageElement moneylockedsafeofficeoutsidebusinesshoursTextField;
	private PageElement openButtonSHH;

	private PageElement makeandNameofManufacturerDetailTextField;
	private PageElement yearofManufacturerTextArea;
	private PageElement valueincludingaccessoriesTextArea;
	private PageElement whethertheSImorethan2croreDropDown;

	private PageElement openButtonHH;
	private PageElement openButtonHHSec5;
	private PageElement openButtonSHF;

	//BD

	private PageElement openButtonDetailsOfStock;
	private PageElement stockDetailsTextArea; 
	private PageElement addressOfLocationBDTextArea;
	private PageElement openButtonGoodsHeldInTrustCommission;
	private PageElement goodsHeldDetailsTextArea;
	private PageElement sumInsuredStockinTradeTextField;
	private PageElement rateforStockTextField;
	private PageElement sumInsuredGoodsHeldinTrustCommissionTextField;
	private PageElement rateforGoodsHeldTextField;
	private PageElement firstLossRequiredDropdown;

	//HH Endorse
	private PageElement	sumInsuredforsection1BTextField;

	//OS
	private PageElement	businessFurnitureFurnishingsSafesOfficeMachineryTextFeild;
	private PageElement	documentsTextFeild;
	private PageElement	telephonGasandElectricMetersTextFeild;
	private PageElement	tenantsImprovementAndDecorationTextFeild;
	private PageElement	pedalCyclesTextFeild;
	private PageElement	electronicEquipmentTextFeild;
	private PageElement	allOtherContentsTextFeild;
	private PageElement	professionalInstrumentsAndEquipmentsTextFeild;
	private PageElement	clothingAndPersonalEffects;
	private PageElement	costofRemovalOfDebrisTextFeild;
	private PageElement limitAnyOneLossTextFeild;
	private PageElement inTransitOverThePolicyPeriodAnnualTurnoverTextFeild;
	private PageElement officeAddressTextFeild;

	private PageElement limitOfIndemnityTextFeild;
	private PageElement indemnityPeriodMonthsForOSTextFeild;
	private PageElement rateForSection10TextFeild;
	private PageElement pinCodeTextFieldOS;
	private PageElement sectionofthepolicyDropDownOS;
	
	//HH For Ganesh
	private PageElement	nameoftheInsuredPersonTextField;
	private PageElement relationshipwiththePolicyholderofPUDropDown;
	private PageElement dateOfBirthOfMemberTextField;
	private PageElement nomineeNameTextField;
	private PageElement relationshipwithNomineeTextField;
	private PageElement serialNoTextField;

	private PageElement perCapitaLoadingTextField;
	//Shruti
	private PageElement openButton6;

	private PageElement itemsForSection6DropDown;
	private PageElement descriptionOfItemsForSection6TextArea;
	private PageElement sumInsuredForSection6TextField;
	private PageElement sumInsuredForSection7TextField;
	private PageElement  sumInsuredBuglaryTextField;
	//pravina
	private PageElement suminsuredforsection2BHHTextField;
	private PageElement ratePercentforsection2BHHTextField;
	private PageElement isSection3AAllriskJewelerRequiredHHDropDown;
	//RK
	private PageElement groupNameTextArea;
	private PageElement noOfPersonPerGroupTextField;
	private PageElement specialConditionRKTextArea;
	private PageElement isvaluationcertificateprovidedHHDropDown;
	private PageElement isSection3BAllriskPortableequipmentRequiredHHDropDown;
	//GS Paresh
	private PageElement addressOfBuildingTextArea;
	private PageElement addressContdTextArea;
	private PageElement pinCodeGSTextField;
	private PageElement ratePercentItemsForSection5TextField;
	private PageElement shopAddressTextField;
	
	private PageElement Rata1forsection4TextFeild;
	private PageElement PercarryinglimitTextFeild;
	private PageElement MoneyinofficeduringbusinesshoursTextFeild;
	private PageElement Rate2forsection4TextFeild;
	private PageElement MoneyinlockedsafeinofficeoutsidebusinesshoursTextFeild;
	private PageElement Rate3forsection4TextFeild;
	
	
	public PolicyInsuredIntrestAttributeMiscNL(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		riskDetailsT1PLRTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Risk details T1-PLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTitle = new PageElement(By.linkText("Schedule"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","No")), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTypeForBaggageDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type for Baggage","select")), "Policy Type for Baggage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateInPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (in percent)", "input")), "Rate (in percent)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		floaterExtraPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Floater Extra (%)", "input")), "Floater Extra (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		perCapitaLoadingAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Per Capita Loading (Amount)", "input")), "Per Capita Loading (Amount)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//BB NEW PAGEELEMENT
		typeofBankforBankersIndemnityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Bank for Bankers Indemnity')]/following::select"), "Type of Bank for Bankers Indemnity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberofBankBranchesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Bank Branches","select")), "Number of Bank Branches Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BD NEW PAGEELENT
		addressoflocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Address of location')]/following::textarea"), "Address of location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeDropDownBd=new PageElement(By.xpath("//td/div[contains(text(),'Pin Code')]/following::select"), "Pin Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[@id='Sum Insured']/following::input[1]"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupancyDetailsDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Occupancy Details')]/following::select"), "Occupancy Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisofDeclarationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Basis of Declaration')]/following::select"), "Basis of Declaration", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//BA - Priyanka
		policyTypeForBaggageDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type for Baggage","select")), "Policy Type for Baggage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateInPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (in percent)", "input")), "Rate (in percent)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		floaterExtraPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Floater Extra (%)", "input")), "Floater Extra (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		perCapitaLoadingAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Per Capita Loading (Amount)", "input")), "Per Capita Loading (Amount)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BS - Priyanka
		nameOfTheGirlTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Girl", "textarea")), "Name of the Girl", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthOfGirlTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth Of Girl", "input")), "Date of Birth Of Girl", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfGirlTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of Girl", "input")), "Age of Girl", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfFatherOfTheGirlTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Father of the Girl", "textarea")), "Name of Father of the Girl", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthOfFatherTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Father", "input")), "Date of Birth of Father", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fathersAgeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Fathers Age", "input")), "Fathers Age", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheMotherTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Mother", "textarea")), "Name of the Mother", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthOfMotherTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Mother", "input")), "Date of Birth of Mother", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfTheMotherTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of the Mother", "input")), "Age of the Mother", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FS - Priyanka
		riskCoveredTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Risk Covered", "textarea")), "Risk Covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location", "textarea")), "Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextFieldFS=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pin Code","input")), "Pin Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialPerilsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Perils", "textarea")), "Special Perils", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExclusionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Exclusion", "textarea")), "Special Exclusion", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subjectToClauseTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject to Clause", "textarea")), "Subject to Clause", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExcessTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Excess", "textarea")), "Special Excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionTextArea=new PageElement(By.xpath("//div[@id='Special Condition']/following::textarea[1]"), "Special Condition", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description", "textarea")), "Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MI - Priyanka
		policyTypeForMoneyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy type for Money","select")), "Policy type for Money", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//OS - Priyanka
		buildingsIncludingFixtureAndFittingsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Buildings including Fixture and Fittings", "input")), "Buildings including Fixture and Fittings", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		provisionForArchitectsSurveyorsLegalFeeAndDebrisRemovalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Provision for architects, Surveyors, Legal fee and debris removal", "input")), "Provision for architects, Surveyors, Legal fee and debris removal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredForSec1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for SEC 1", "input")), "Total Sum Insured for SEC 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentForSection1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for section1", "input")), "Rate (%o) for section1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfBusinessTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for section1", "input")), "Office address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sectionOfThePolicyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for section1", "input")), "Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeAddressOSTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for section1", "input")), " Nature of business trade", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeOSTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pin Code", "input")), "Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//PB - Priyanka
		nameOfTheMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Member", "input")), "Name of the Member", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth", "input")), "Date of Birth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sex","select")), "Sex", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		passportNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Passport Number", "input")), "Passport Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIssueTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Issue", "input")), "Date of Issue", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		visaTypeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Visa Type", "input")), "Visa Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		correspondingAddressIndiaTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Corresponding Address (India)", "textarea")), "Corresponding Address (India)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfNextKinTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Next Kin", "textarea")), "Name of Next Kin", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipOfNextKinTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship of Next Kin", "input")), "Relationship of Next Kin", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfNextKinTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of Next Kin", "textarea")), "Address of Next Kin", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNoOfNextKinTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Telephone No. of Next Kin", "input")), "Telephone No. of Next Kin", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodHealthDeclarationDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Good Health Declaration","select")), "Good Health Declaration", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//HH - Priyanka
		isSection1ARequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section 1A Required","select")), "Is Section 1A Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSection1BRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section 1B Required","select")), "Is Section 1B Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratePercentItemsForSection1BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) Items for section1B", "input")), "Rate (%o) Items for section1B", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSection1ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section1A", "input")), "Sum insured for section1A", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentForSection1ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for section1A", "input")), "Rate (%o) for section1A", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Sec1RskDtlsPage=new PageElement(By.xpath("//div//b//font[contains(text(),'Sec 1 Rsk Dtls')]"), "Sec 1 Rsk Dtls Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ItemsForsection1ADropDown=new PageElement(By.name("Data_258256104032011_0"), "Items for section1A  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfItemsForSection1ATextArea=new PageElement(By.name("Data_258256304032011_0"), "Description of items for section1A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		itemsForSection1BDropDown=new PageElement(By.name("Data_258261604032011_0"), "Items for section1A  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfItemsForSection1BTextArea=new PageElement(By.name("Data_258266204032011_0"), "Description of items for section1A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSection1BTextField=new PageElement(By.name("Data_37050905042005_0"), "Description of items for section1A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButton = new PageElement(By.name("propValues1"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//RR - Priyanka
		nameOfTheWomanTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Woman", "textarea")), "Name of Woman", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherWiderCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Wider Cover required?","select")), "Whether Wider Cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//FL - Mayur
		policyTypeForFidelityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Policy Type for Fidelity')]/following::select"), "Policy Type for Fidelity Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//NI - Mayur
		isTheBusinessDirectDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is the business direct')]/following::select"), "Is the business direct Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		discountForDirectBusinessPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discount for Direct Business(%)')]/following::input"), "Discount for Direct Business(%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//JI - Mayur
		natureOfBusinessDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Business')]/following::select"), "Nature of Business Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		classOfRiskForTheHighestRatingDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Class of Risk for the highest rating')]/following::select"), "Class of Risk for the highest rating Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addressOfPremisesWhereRiskIsCoveredTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Address of premises where risk is covered')]/following::textarea"),"Address of premises where risk is covered Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Pin code')]/following::input"),"Pin Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stateDropDown= new PageElement(By.xpath("//td//div[contains(text(),'State')]/following::select"), "State Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//PQ - Mayur
		equipmentTypeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Equipment type')]/following::select"), "Equipment type Drop Down", false , WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfTheEquipmentTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the equipment')]/following::textarea"), "Description of the equipment Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheUserTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of the User')]/following::input"), "Name of the User Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Address')]/following::textarea"), "Address Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ifMobilePleaseSpecifyMobileNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'If Mobile please specify Mobile Number')]/following::input"), "If Mobile please specify Mobile Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeltextField= new PageElement(By.xpath("//td//div[contains(text(),'Model')]/following::input"), "Model text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfMakedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Year of Make')]/following::select"), "Year of Make Drop down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		serialNumberOfTheEquipmentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Serial number of the Equipment')]/following::input"), "Serial number of the Equipment Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		rateForEquipmentInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for Equipment (in percent)')]/following::input"), "Rate for Equipment (in percent) text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		electricalAndMechanicalDamageDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Electrical and mechanical damage')]/following::select"), "Electrical and mechanical damage Drop down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//PT - Mayur
		policyTypeForPlateGlassDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Policy Type For Plate Glass')]/following::select"), "Policy Type For Plate Glass Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//PY - Mayur
		riskDescriptionOfPackagePolicyButton= new PageElement(By.xpath("//td//div[contains(text(),'Risk Description of Package Policy')]/following::input"), "Risk Description of Package Policy Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addButton= new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton= new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButton= new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//SK - Mayur
		typeOfExchangeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Exchange')]/following::select"), "Type of Exchange Drop down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//SE - Priyanka
		fireAndAlliedPerilsDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Fire and Allied Perils ?')]/following::select"), "Fire and Allied Perils", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake ?')]/following::select"), "Earthquake ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cancellationOfEventDueToNationalMourningDropDown  =new PageElement(By.xpath("//td/div[contains(text(),'Cancellation of event due to National Mourning ?')]/following::select"), "Cancellation of event due to National Mourning", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		accidentalorElectricalGridfailureDropDown =new PageElement(By.xpath("//td/div[contains(text(),'Accidental or Electrical Grid failure ?')]/following::select"), "Accidental or Electrical Grid failure", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		telecastRightsForTVcoverageDropdown=new PageElement(By.xpath("//td/div[contains(text(),'Telecast Rights for TV coverage ?')]/following::select"), "Telecast Rights for TV coverage ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sEBIRegdNoForBSETextField= new PageElement(By.xpath("//td//div[contains(text(),'SEBI Regd. No. for BSE')]/following::input"), "SEBI Regd. No. for BSE text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bSERegdNoTextfield= new PageElement(By.xpath("//td//div[contains(text(),'BSE Regd. No.')]/following::input"), "BSE Regd. No. text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfExchangeBranchesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'No. of Exchange Branches')]/following::select"), "No. of Exchange Branches drop down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		exchangeBranchDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Exchange Branch Details')]/following::input"), "Exchange Branch Details Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicSumInsuredOfStockBrokersIndemnityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Basic Sum Insured of Stock Brokers Indemnity')]/following::select"), "Basic Sum Insured of Stock Brokers Indemnity dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basicPremiumForSKTextField= new PageElement(By.xpath("//td//div[contains(text(),'Basic Premium for SK')]/following::input"), "Basic Premium for SK text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		publicLiabilityDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Public Liability ?')]/following::select"), "Public Liability ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionofEventTextField=new PageElement(By.xpath("//td/div[contains(text(),'Description of Event')]/following::textarea"), "Description of Event", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventStartDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Event Start Date')]/following::input/following::a[@name='firstFocus']"), "Event Start Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		eventEndDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Event End Date')]/following::input/following::a[@name='firstFocus']"), "Event End Date Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		eventStartDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Event Start Date')]/following::input"), "Description of Event", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEndDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Event End Date')]/following::input"), "Description of Event", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessAsDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Excess as')]/following::select"), "Excess as", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessAmountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess (Amount)')]/following::input"), "Excess Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		jurisdictionOfTheEventDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Jurisdiction of the Event')]/following::select"), "Jurisdiction of the Even", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		locationDetailsOfTheEventTextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details of the Event')]/following::textarea"), "Location Details of the Event", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentageTextField =new PageElement(By.xpath("//td/div[contains(text(),'Rate(%)')]/following::input"), "Rate Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfRiskForEventCancellationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Risk for Event Cancellation')]/following::select"), "Type of Risk for Event Cancellation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverForOtherExtensionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover for Other Extension')]/following::select"), "Cover for Other Extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfStudentsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Students", "input")), "Number of Students", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerStudentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per student", "input")), "Compensation Limit per student", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerAccidentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per accident", "input")), "Compensation Limit per accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalExpensesPerStudentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Expenses per Student", "input")), "Medical Expenses per Student", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentForMedicalExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%o) for Medical Expenses", "input")), "Rate (%o) for Medical Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredforMedicalExpensesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured for Medical Expenses", "input")), "Total Sum Insured for Medical Expenses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SH - Priyanka
		section1ARequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 1A Required","select")), "Section 1A Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valueOfTheBuildingClassAConstructionOnlyShopOwnedByInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Value of the Building (Class A construction only shop owned by insured)", "input")), "Value of the Building (Class A construction only shop owned by insured)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePercentTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate(%)')]/following::input"), "Rate(%)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		section1BRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 1B Required","select")), "Section 1B Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rskDtlsSec1Page=new PageElement(By.xpath("//div//b//font[contains(text(),'Rsk Dtls Sec 1')]"), "Rsk Dtls Sec 1 Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compulsoryExcessForSection1DropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compulsory Excess For Section 1","select")), "Compulsory Excess For Section 1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		contentsExcludingMoneyAndValuablesArticlesOfConsumableNature1FurnitureAndFixtureFittingTextField=new PageElement(By.name("Data_998303517102013_0"), "Contents excluding money and valuables articles of consumable nature (1) Furniture and Fixture, Fitting TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfFurnitureTextArea=new PageElement(By.name("Data_258328004032011_0"), "Description of Furniture  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contentsExcludingMoneyAndValuableArticlesOfConsumableNature2StockAndTradeIncludingGoodsHeldInTheTrustTextField=new PageElement(By.name("Data_998306317102013_0"), "Contents excluding money and valuable articles of consumable nature (2) Stock and Trade including goods held in the trust TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfStockInTradeTextArea=new PageElement(By.name("Data_258328604032011_0"), "Description of Stock in Trade TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SY - Priyanka
		compensationLimitPerYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per year", "input")), "Compensation Limit per year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalExpensesPerStudentPerYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Expenses per Student per Year", "input")), "Medical Expenses per Student per Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compensationLimitPerYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per year", "input")), "Compensation Limit per year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalExpensesPerStudentPerYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Expenses per Student per Year", "input")), "Medical Expenses per Student per Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//EX NEW PAGEELEMENT (chintan)
		riskCoveredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Risk Covered')]/following::textarea"), "Risk Covered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfTheRiskTextField=new PageElement(By.xpath("//td/div[contains(text(),'Description of the Risk')]/following::textarea"), "Description of the Risk", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		locationDetailsOfTheExhibitionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details of the Exhibition')]/following::textarea"), "Location Details of the Exhibition", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialExclusionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Exclusion')]/following::textarea"), "Special Exclusion", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//BI-Rajkumar		
		policyTypeForBurglaryList=new PageElement(By.xpath("//td/div[contains(text(),'Policy Type For Burglary')]/following::select"),"Policy Type For Burglary List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//FI
		guaranteeamountforNamedFloatingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Guarantee amount for Named(Floating)')]/following::input"),"Guarantee amount for Named(Floating)",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		limitperPersonTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per Person')]/following::input"),"Limit per Person",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		descriptionOfPropertyTextArea= new PageElement(By.name("Data_258236304032011_"+rowcount+""), "Description of Property text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfLocationTextArea= new PageElement(By.name("Data_258205404032011_"+rowcount+""), "Address of location Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextFieldNewWindow= new PageElement(By.name("Data_37050905042005_"+rowcount+""), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfThePersonTextArea=new PageElement(By.name("Data_188273330092005_0"), "Name of the Person Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreTextArea=new PageElement(By.name("Data_226891502072010_0"), "Cadre Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		

		isSection3ARequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Section 3A (All risk-Jeweler) Required","select")), "Is Section 3A (All risk-Jeweler) Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfItemsForSection3ATextArea=new PageElement(By.name("Data_258348604032011_0"), "Description of items for section3A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSection3ATextField=new PageElement(By.name("Data_37050905042005_0"), "Description of items for section3A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		open3AButton = new PageElement(By.name("propValues2"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		suminsured4ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section4", "input")), "Sum insured for section4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		suminsured5ATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured  for section5", "input")), "Sum insured for section5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openNewWindowButtonPY= new PageElement(By.xpath("//td//div[contains(text(),'Risk Description of Package Policy')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//SH
		openButtonSH= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Fire-Furniture,Fixture and Fittings')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		section3AMoneyintransitTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 3A(Money in transit)", "input")), "Section 3A(Money in transit)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		section3BMoneyintillduringbusinesshoursTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Section 3B(Money in till or counter during business hours)", "input")), "Section 3B(Money in till or counter during business hours)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneylockedsafeofficeoutsidebusinesshoursTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Money in locked safe in office outside business hours", "input")), "Money in locked safe in office outside business hours", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButtonSHH= new PageElement(By.xpath("//td//div[contains(text(),'Make and Name of Manufacturer Details')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		makeandNameofManufacturerDetailTextField=new PageElement(By.name("Data_258329204032011_0"), "Make and Name of Manufacturer Detail TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearofManufacturerTextArea=new PageElement(By.name("Data_258402904032011_0"), "Year of Manufacturer TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueincludingaccessoriesTextArea=new PageElement(By.name("Data_258329504032011_0"), "Value including accessories (sum Insured) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whethertheSImorethan2croreDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the SI is more than 2 crore","select")), "Whether the SI is more than 2 crore", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		openButtonHH= new PageElement(By.xpath("//td//div[contains(text(),'Section Details for 1B')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		openButtonSHF=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Fire-Stock in Trade including Goods Held in Trust')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BD
		openButtonDetailsOfStock=new PageElement(By.xpath("//td//div[contains(text(),'Details of stock (Own)')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stockDetailsTextArea=new PageElement(By.name("Data_258210704032011_"+rowcount+""),"stoc kDetails TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfLocationBDTextArea=new PageElement(By.name("Data_258205404032011_"+rowcount+""),"address Of Location BD TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButtonGoodsHeldInTrustCommission=new PageElement(By.xpath("//td//div[contains(text(),'Goods Held in Trust and/or Commission')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		goodsHeldDetailsTextArea=new PageElement(By.name("Data_258210804032011_"+rowcount+""),"stoc kDetails TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		sumInsuredStockinTradeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Stock in Trade)","input")), "sum Insured Stock in Trade TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforStockTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Stock (%)","input")), "rate for Stock TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredGoodsHeldinTrustCommissionTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Goods Held in Trust and/or Commission)","input")), "Sum Insured (Goods Held in Trust and/or Commission) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforGoodsHeldTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Goods held (%)","input")), "Rate for Goods held (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		firstLossRequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("First Loss Required","select")), "First Loss Required Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH Endorse
		sumInsuredforsection1BTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured for section1B","input")), "Sum insured for section1B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//OS

		businessFurnitureFurnishingsSafesOfficeMachineryTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Business furniture,furnishings,safes,office machinery')]/following::input"), "Business furniture,furnishings,safes,office machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentsTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Documents')]/following::input"), "Documents", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephonGasandElectricMetersTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Telephone,Gas and electric meters')]/following::input"), "Telephone,Gas and electric meters", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tenantsImprovementAndDecorationTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Tenants improvement and decoration')]/following::input"), "Tenants improvement and decoration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pedalCyclesTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Pedal cycles')]/following::input"), "Pedal cycles", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		electronicEquipmentTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Electronic equipment(if not insured under section 6)')]/following::input"), "Electronic equipment(if not insured under section 6)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		allOtherContentsTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'All other contents')]/following::input"), "All other contents", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		professionalInstrumentsAndEquipmentsTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Professional instruments and equipments')]/following::input"), "Professional instruments and equipments", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clothingAndPersonalEffects=new PageElement(By.xpath("//td//div[contains(text(),'Clothing and personal effects')]/following::input"), "Clothing and personal effects", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costofRemovalOfDebrisTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Cost of removal of debris')]/following::input"), "Cost of removal of debris", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inTransitOverThePolicyPeriodAnnualTurnoverTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'In transit Over the policy period (Annual Turnover)')]/following::input"), "In transit Over the policy period (Annual Turnover)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitAnyOneLossTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Limit any one loss')]/following::input"), "Limit any one loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		officeAddressTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Office address')]/following::input"), "Office address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		limitOfIndemnityTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Limit of Indemnity')]/following::input"), "Limit of Indemnity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodMonthsForOSTextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity period(Months) for OS')]/following::input"), "Indemnity period(Months) for OS", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForSection10TextFeild=new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for section10')]/following::input"), "Rate (%o) for section10", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextFieldOS=new PageElement(By.xpath("//div[@id='Pin Code']/following::input[1]"), "Pin Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sectionofthepolicyDropDownOS=new PageElement(By.xpath("//div[@id='Section of the policy']/following::select[1]"), "Section of the policy Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//HH For Ganesh
		nameoftheInsuredPersonTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Insured Person","input")), "Name of the Insured Person TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipwiththePolicyholderofPUDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Relationship with the Policy holder of PU","select")), "Relationship with the Policy holder of PU", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfBirthOfMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of the Member", "input")), "Date of Birth of the Member", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineeNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Nominee Name')]/following::input"),"Nominee Name",false, 	WaitType.WAITFORELEMENTTOBEEENABLED,10);
		relationshipwithNomineeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Relationship with Nominee')]/following::input"),"Relationship with Nominee",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		serialNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Serial No.')]/following::input"),"Serial No.",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		itemsForSection6DropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Items for section6","select")), "Items for section6", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfItemsForSection6TextArea=new PageElement(By.name("Data_258351904032011_0"), "Description of items for section3A  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSection6TextField=new PageElement(By.name("Data_37050905042005_0"), "Sum insured for section 6  TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButton6=new PageElement(By.name("propValues1"),"Propvalues 1 open button 6",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sumInsuredForSection7TextField=new PageElement(By.name("propValues2"), "propValues2  TextBox", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBuglaryTextField=new PageElement(By.name("propValues1"),"Propvalues 1 open button 6",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Pravina HH
		staffDiscountHHDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Staff Discount')]//following::select[1]"), "Staff Discount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addressOfBuildingHHTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Address of Building')]//following::textarea[1]"), "Address of Building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeHHTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pin Code')]//following::input[1]"),"Pin Code",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		suminsuredforsection2BHHTextField=new PageElement(By.xpath("//div[@id='Sum insured for section2B']/following::input[1]"),"Sum insured for section2B",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//RK
		groupNameTextArea=new PageElement(By.name("propValues1"), "Group Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfPersonPerGroupTextField=new PageElement(By.name("propValues2"),"No Of Person Per Group",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		specialConditionRKTextArea=new PageElement(By.name("propValues3"),"Special Condition",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		ratePercentforsection2BHHTextField=new PageElement(By.xpath("//div[@id='Rate (%o) for section2B']/following::input[1]"),"Rate (%o) for section2B",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isSection3AAllriskJewelerRequiredHHDropDown=new PageElement(By.xpath("//select[@name='propValues1']"), "Is Section 3A (All risk-Jeweler) Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isvaluationcertificateprovidedHHDropDown=new PageElement(By.xpath("//select[@name='propValues5']"), "Is valuation certificate provided", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSection3BAllriskPortableequipmentRequiredHHDropDown=new PageElement(By.xpath("//select[@name='propValues6']"), "Is Section 3B (All risk- Portable equipment) Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//GS
		addressOfBuildingTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 1 Of the building", "textarea")), "Address 1 Of the building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressContdTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address 2 of the building", "textarea")), "Address 2 Of the building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeGSTextField=new PageElement(By.name("propValues3"),"Pin Code",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		ratePercentItemsForSection5TextField=new PageElement(By.xpath("//div[@id='Rate (%o) for section5']/following::input[1]"),"Rate (%o) for section5",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		openButtonHHSec5= new PageElement(By.xpath("//td//div[contains(text(),'Section Details for 5')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		itemsForSectionSec5DropDown=new PageElement(By.xpath("//select[@name='Data_258349204032011_0']"), "Items for section5", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfItemsForSection5TextArea=new PageElement(By.xpath("//input[@name='Data_258351504032011_0']"), "Description of items for section5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		sumInsuredFSection5TextField=new PageElement(By.xpath("//input[@name='Data_37050905042005_0']"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		shopAddressTextField=new PageElement(By.name("propValues1"), "shop Address Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		Rata1forsection4TextFeild=new PageElement(By.name("propValues2"), "Rate1 (%o) for section4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PercarryinglimitTextFeild=new PageElement(By.name("propValues3"), "IPer carrying limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MoneyinofficeduringbusinesshoursTextFeild=new PageElement(By.name("propValues4"), "Money in office during business hours", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Rate2forsection4TextFeild=new PageElement(By.name("propValues5"), "Rate2 (%o) for section4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MoneyinlockedsafeinofficeoutsidebusinesshoursTextFeild=new PageElement(By.name("propValues6"), "Money in locked safe in office outside business hours", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
        Rate3forsection4TextFeild=new PageElement(By.name("propValues7"), "Rate3 (%o) for section4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	
	
	
	}
	public void fillRiskDetailsOfT1PLRForMiscNL(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("add") || policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("edit")){
			//GS
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfBuilding")) {
				clearAndSendKeys(addressOfBuildingTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfBuilding"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressContd")) {
				clearAndSendKeys(addressContdTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressContd"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeGS")) {
				clearAndSendKeys(pinCodeGSTextField, policyInsIntAttrMNLEntity.getStringValueForField("PinCodeGS"));
			}
			
			//RK
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGroupName")) {
				clearAndSendKeys(groupNameTextArea, policyInsIntAttrMNLEntity.getStringValueForField("GroupName"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNoOfPersonPerGroup")) {
				clearAndSendKeys(noOfPersonPerGroupTextField, policyInsIntAttrMNLEntity.getStringValueForField("NoOfPersonPerGroup"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialConditionRK")) {
				clearAndSendKeys(specialConditionRKTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SpecialConditionRK"));
			}
			//
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBaggage")) {
				selectValueFromList(policyTypeForBaggageDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBaggage"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				clearAndSendKeys(rateInPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("RateInPercent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFloaterExtraPercent")) {
				clearAndSendKeys(floaterExtraPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("FloaterExtraPercent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPerCapitaLoadingAmount")) {
				clearAndSendKeys(perCapitaLoadingAmountTextField, policyInsIntAttrMNLEntity.getStringValueForField("PerCapitaLoadingAmount"));
			}

			//BB
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfBankForBankersIndemnity")) {
				selectValueFromList(typeofBankforBankersIndemnityDropDown, policyInsIntAttrMNLEntity.getStringValueForField("TypeOfBankForBankersIndemnity"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNumberOfBankBranches")) {
				selectValueFromList(numberofBankBranchesDropDown, policyInsIntAttrMNLEntity.getStringValueForField("NumberOfBankBranches"));
			}

			//BD
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressoflocation")) {
				clearAndSendKeys(addressoflocationTextField, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfLocation"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeBd")) {
				selectValueFromList(pinCodeDropDownBd, policyInsIntAttrMNLEntity.getStringValueForField("PinCode"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredBd")) {
				clearAndSendKeys(pinCodeDropDownBd, policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOccupancyDetails")) {
				selectValueFromList(occupancyDetailsDropDown, policyInsIntAttrMNLEntity.getStringValueForField("OccupancyDetails"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasisOfDeclaration")) {
				selectValueFromList(basisofDeclarationDropDown, policyInsIntAttrMNLEntity.getStringValueForField("BasisOfDeclaration"));
			}
			//BA - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBaggage")) {
				selectValueFromList(policyTypeForBaggageDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBaggage"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				clearAndSendKeys(rateInPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("RateInPercent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFloaterExtraPercent")) {
				clearAndSendKeys(floaterExtraPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("FloaterExtraPercent"));
			}
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPerCapitaLoadingAmount")) {
				clearAndSendKeys(perCapitaLoadingAmountTextField, policyInsIntAttrMNLEntity.getStringValueForField("PerCapitaLoadingAmount"));
			}*/
			//BS - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheGirl")) {
				clearAndSendKeys(nameOfTheGirlTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheGirl"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfGirl")) {
				String dateOfBirthOfGirl=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfGirl"));
				clearAndEnterDate(dateOfBirthOfGirlTextField, dateOfBirthOfGirl);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAgeOfGirl")) {
				clearAndSendKeys(ageOfGirlTextField, policyInsIntAttrMNLEntity.getStringValueForField("AgeOfGirl"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfFatherOfTheGirl")) {
				clearAndSendKeys(nameOfFatherOfTheGirlTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfFatherOfTheGirl"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfFather")) {
				String dateOfBirthOfFather=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfFather"));
				clearAndEnterDate(dateOfBirthOfFatherTextField, dateOfBirthOfFather);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFathersAge")) {
				clearAndSendKeys(fathersAgeTextField, policyInsIntAttrMNLEntity.getStringValueForField("FathersAge"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheMother")) {
				clearAndSendKeys(nameOfTheMotherTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheMother"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfMother")) {
				String dateOfBirthOfMother=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfMother"));
				clearAndEnterDate(dateOfBirthOfMotherTextField, dateOfBirthOfMother);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAgeOfTheMother")) {
				clearAndSendKeys(ageOfTheMotherTextField, policyInsIntAttrMNLEntity.getStringValueForField("AgeOfTheMother"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKey(sumInsuredTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"));
			}
			//FS - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRiskCovered")) {
				clearAndSendKey(riskCoveredTextArea, policyInsIntAttrMNLEntity.getStringValueForField("RiskCovered"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocation")) {
				clearAndSendKeys(locationTextArea, policyInsIntAttrMNLEntity.getStringValueForField("Location"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCode")) {
				clearAndSendKeys(pinCodeTextFieldFS, policyInsIntAttrMNLEntity.getStringValueForField("PinCode"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				clearAndSendKeys(specialPerilsTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SpecialPerils"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialExclusion")) {
				clearAndSendKey(specialExclusionTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SpecialExclusion"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				clearAndSendKeys(subjectToClauseTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SubjectToClause"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialExcess")) {
				clearAndSendKeys(specialExcessTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SpecialExcess"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialCondition")) {
				clearAndSendKeys(specialConditionTextArea, policyInsIntAttrMNLEntity.getStringValueForField("SpecialCondition"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, policyInsIntAttrMNLEntity.getStringValueForField("Description"));
			}
			//MI - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForMoney")) {
				selectValueFromList(policyTypeForMoneyDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForMoney"));
			}
			//OS - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBuildingsIncludingFixtureAndFittings")) {
				clearAndSendKeys(buildingsIncludingFixtureAndFittingsTextField, policyInsIntAttrMNLEntity.getStringValueForField("BuildingsIncludingFixtureAndFittings"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigProvisionForArchitectsSurveyorsLegalFeeAndDebrisRemoval")) {
				clearAndSendKeys(provisionForArchitectsSurveyorsLegalFeeAndDebrisRemovalTextField, policyInsIntAttrMNLEntity.getStringValueForField("ProvisionForArchitectsSurveyorsLegalFeeAndDebrisRemoval"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSec1")) {
				clearAndSendKeys(totalSumInsuredForSec1TextField, policyInsIntAttrMNLEntity.getStringValueForField("TotalSumInsuredForSec1"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForSection1")) {
				clearAndSendKeys(ratePercentForSection1TextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForSection1"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNatureOfBusinessTrade")) {
				clearAndSendKeys(natureOfBusinessTradeTextField, policyInsIntAttrMNLEntity.getStringValueForField("NatureOfBusinessTrade"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionOfThePolicy")) {
				clearAndSendKeys(sectionOfThePolicyTextField, policyInsIntAttrMNLEntity.getStringValueForField("SectionOfThePolicy"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOfficeAddressOS")) {
				clearAndSendKeys(officeAddressOSTextField, policyInsIntAttrMNLEntity.getStringValueForField("OfficeAddressOS"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeOS")) {
				clearAndSendKeys(pinCodeOSTextField, policyInsIntAttrMNLEntity.getStringValueForField("PinCodeOS"));
			}
			// PB - Priyanka 
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheMember")) {
				clearAndSendKeys(nameOfTheMemberTextField, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheMember"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				String dateOfBirth=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirth"));
				clearAndEnterDate(dateOfBirthTextField, dateOfBirth);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, policyInsIntAttrMNLEntity.getStringValueForField("Sex"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPassportNumber")) {
				clearAndSendKeys(passportNumberTextField, policyInsIntAttrMNLEntity.getStringValueForField("PassportNumber"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfIssue")) {
				String dateOfIssue=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfIssue"));
				clearAndEnterDate(dateOfIssueTextField, dateOfIssue);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigVisaType")) {
				clearAndSendKeys(visaTypeTextField, policyInsIntAttrMNLEntity.getStringValueForField("VisaType"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCorrespondingAddressIndia")) {
				clearAndSendKeys(correspondingAddressIndiaTextArea, policyInsIntAttrMNLEntity.getStringValueForField("CorrespondingAddressIndia"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfNextKin")) {
				clearAndSendKeys(nameOfNextKinTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfNextKin"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRelationshipOfNextKin")) {
				clearAndSendKeys(relationshipOfNextKinTextField, policyInsIntAttrMNLEntity.getStringValueForField("RelationshipOfNextKin"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfNextKin")) {
				clearAndSendKeys(addressOfNextKinTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfNextKin"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelephoneNoOfNextKin")) {
				clearAndSendKeys(telephoneNoOfNextKinTextField, policyInsIntAttrMNLEntity.getStringValueForField("TelephoneNoOfNextKin"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				selectValueFromList(goodHealthDeclarationDropDown, policyInsIntAttrMNLEntity.getStringValueForField("GoodHealthDeclaration"));
			}
			// HH - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection1ARequired")) {
				selectValueFromList(isSection1ARequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("IsSection1ARequired"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionDetailsFor1A")) {
				fillSectionDetailsFor1A(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection1BRequired")) {
				selectValueFromList(isSection1BRequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("IsSection1BRequired"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionDetailsFor1B")) {
				fillSectionDetailsFor1B(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentItemsForSection1B")) {
				clearAndSendKeys(ratePercentItemsForSection1BTextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentItemsForSection1B"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1A")) {
				clearAndSendKeys(sumInsuredForSection1ATextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection1A"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForSection1A")) {
				clearAndSendKeys(ratePercentForSection1ATextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForSection1A"));
			}
			
			//HH Pravina
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionDetailsFor5")) {
				fillSectionDetailsFor5(policyInsIntAttrMNLEntity);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection5")) {
				clearAndSendKeys(sumInsuredForSection5TextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection5"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentItemsForSection5")) {
				clearAndSendKeys(ratePercentItemsForSection5TextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentItemsForSection5"));
			}
			
			
			//RR - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheWoman")) {
				clearAndSendKeys(nameOfTheWomanTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheWoman"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigWhetherWiderCoverRequired")) {
				selectValueFromList(whetherWiderCoverRequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("WhetherWiderCoverRequired"));
			}
			//FL - Mayur
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForFidelity")) {
				selectValueFromList(policyTypeForFidelityDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForFidelity"));
			}
			//NI- Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsTheBusinessDirect")) {
				selectValueFromList(isTheBusinessDirectDropDown, policyInsIntAttrMNLEntity.getStringValueForField("IsTheBusinessDirect"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDiscountForDirectBusinessPercent")) {
				clearAndSendKeys(discountForDirectBusinessPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("DiscountForDirectBusinessPercent"));
			}
			//JI - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNatureOfBusiness")) {
				selectValueFromList(natureOfBusinessDropDown, policyInsIntAttrMNLEntity.getStringValueForField("NatureOfBusiness"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigClassOfRiskForTheHighestRating")) {
				selectValueFromList(classOfRiskForTheHighestRatingDropDown, policyInsIntAttrMNLEntity.getStringValueForField("ClassOfRiskForTheHighestRating"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfPremisesWhereRiskIsCovered")) {
				clearAndSendKeys(addressOfPremisesWhereRiskIsCoveredTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfPremisesWhereRiskIsCovered"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeJI")) {
				clearAndSendKeys(pinCodeTextField, policyInsIntAttrMNLEntity.getStringValueForField("PinCodeJI"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigState")) {
				selectValueFromList(stateDropDown, policyInsIntAttrMNLEntity.getStringValueForField("State"));
			}
			//PQ - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEquipmentType")) {
				selectValueFromList(equipmentTypeDropDown, policyInsIntAttrMNLEntity.getStringValueForField("EquipmentType"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfTheEquipment")) {
				clearAndSendKeys(descriptionOfTheEquipmentTextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfTheEquipment"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheUser")) {
				clearAndSendKeys(nameOfTheUserTextField, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheUser"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddress")) {
				clearAndSendKeys(addressTextArea, policyInsIntAttrMNLEntity.getStringValueForField("Address"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIfMobilePleaseSpecifyMobileNumber")) {
				clearAndSendKeys(ifMobilePleaseSpecifyMobileNumberTextField, policyInsIntAttrMNLEntity.getStringValueForField("IfMobilePleaseSpecifyMobileNumber"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigModel")) {
				clearAndSendKeys(modeltextField, policyInsIntAttrMNLEntity.getStringValueForField("Model"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigYearOfMaked")) {
				selectValueFromList(yearOfMakedDropDown, policyInsIntAttrMNLEntity.getStringValueForField("YearOfMaked"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSerialNumberOfTheEquipment")) {
				clearAndSendKeys(serialNumberOfTheEquipmentTextField, policyInsIntAttrMNLEntity.getStringValueForField("SerialNumberOfTheEquipment"));
			}
			/*if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"));
			}*/
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateForEquipmentInPercent")) {
				clearAndSendKeys(rateForEquipmentInPercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("RateForEquipmentInPercent"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigElectricalAndMechanicalDamage")) {
				selectValueFromList(electricalAndMechanicalDamageDropDown, policyInsIntAttrMNLEntity.getStringValueForField("ElectricalAndMechanicalDamage"));
			}
			//PT - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForPlateGlass")) {
				selectValueFromList(policyTypeForPlateGlassDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForPlateGlass"));
			}
			//PY - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRiskDescriptionOfPackagePolicy")) {
				fillRiskDescriptionOfPackagePolicy(policyInsIntAttrMNLEntity,assertReference);		
			}
			//EV (chintan)
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFireAndAlliedPerils")) {
				selectValueFromList(fireAndAlliedPerilsDropDown, policyInsIntAttrMNLEntity.getStringValueForField("FireAndAlliedPerils"));
			}
			//SK - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfExchange")) {
				selectValueFromList(typeOfExchangeDropDown, policyInsIntAttrMNLEntity.getStringValueForField("TypeOfExchange"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEarthquake")) {
				selectValueFromList(earthquakeDropDown, policyInsIntAttrMNLEntity.getStringValueForField("Earthquake"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSEBIRegdNoForBSE")) {
				clearAndSendKeys(sEBIRegdNoForBSETextField, policyInsIntAttrMNLEntity.getStringValueForField("SEBIRegdNoForBSE"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCancellationOfEventDueToNationalMourning")) {
				selectValueFromList(cancellationOfEventDueToNationalMourningDropDown, policyInsIntAttrMNLEntity.getStringValueForField("CancellationOfEventDueToNationalMourning"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBSERegdNo")) {
				clearAndSendKeys(bSERegdNoTextfield, policyInsIntAttrMNLEntity.getStringValueForField("BSERegdNo"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAccidentalorElectricalGridfailure")) {
				selectValueFromList(accidentalorElectricalGridfailureDropDown, policyInsIntAttrMNLEntity.getStringValueForField("AccidentalorElectricalGridfailure"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNoOfExchangeBranches")) {
				selectValueFromList(noOfExchangeBranchesDropDown, policyInsIntAttrMNLEntity.getStringValueForField("NoOfExchangeBranches"));
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelecastRightsForTVcoverage")) {
				selectValueFromList(telecastRightsForTVcoverageDropdown, policyInsIntAttrMNLEntity.getStringValueForField("TelecastRightsForTVcoverage"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPublicLiability")) {
				selectValueFromList(publicLiabilityDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PublicLiability"));
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionofEvent")) {
				clearAndSendKey(descriptionofEventTextField, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfEvent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEventStartDate")) {
				//click(eventStartDateFindButton);
				//Thread.sleep(1000);
				String startDate=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("EventStartDate"));
				clearAndEnterDate(eventStartDateTextField, startDate);
				/*selectDateFromCalender(eventStartDateFindButton, policyInsIntAttrMNLEntity.getStringValueForField("EventStartDate"));
				switchToFrame("display");*/
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEventEndDate")) {
				//click(eventEndDateFindButton);
				Thread.sleep(1000);
				String startDate=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("EventEndDate"));
				clearAndEnterDate(eventEndDateTextField, startDate);
				/*selectDateFromCalender(eventEndDateFindButton, policyInsIntAttrMNLEntity.getStringValueForField("EventEndDate"));
				switchToFrame("display");*/
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExcessAs")) {
				selectValueFromList(excessAsDropDown, policyInsIntAttrMNLEntity.getStringValueForField("ExcessAs"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExcessAmount")) {
				clearAndSendKey(excessAmountTextField, policyInsIntAttrMNLEntity.getStringValueForField("ExcessAmount"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigJurisdictionOfTheEvent")) {
				selectValueFromList(jurisdictionOfTheEventDropDown, policyInsIntAttrMNLEntity.getStringValueForField("JurisdictionOfTheEvent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocationDetailsOfTheEvent")) {
				clearAndSendKey(locationDetailsOfTheEventTextField, policyInsIntAttrMNLEntity.getStringValueForField("LocationDetailsOfTheEvent"));
			}
			//SE - Priyanka
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNumberOfStudents")) {
				clearAndSendKeys(numberOfStudentsTextField, policyInsIntAttrMNLEntity.getStringValueForField("NumberOfStudents"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerStudent")) {
				clearAndSendKeys(compensationLimitPerStudentTextField, policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerStudent"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")) {
				clearAndSendKeys(compensationLimitPerAccidentTextField, policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerAccident"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMedicalExpensesPerStudent")) {
				clearAndSendKeys(medicalExpensesPerStudentTextField, policyInsIntAttrMNLEntity.getStringValueForField("MedicalExpensesPerStudent"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForMedicalExpenses")) {
				clearAndSendKeys(ratePercentForMedicalExpensesTextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForMedicalExpenses"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTotalSumInsuredforMedicalExpenses")) {
				clearAndSendKeys(totalSumInsuredforMedicalExpensesTextField, policyInsIntAttrMNLEntity.getStringValueForField("TotalSumInsuredforMedicalExpenses"));
			}
			//SH - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFireAndAlliedPerils")) {
				selectValueFromList(fireAndAlliedPerilsDropDown, policyInsIntAttrMNLEntity.getStringValueForField("FireAndAlliedPerils"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEarthquake")) {
				selectValueFromList(earthquakeDropDown, policyInsIntAttrMNLEntity.getStringValueForField("Earthquake"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCancellationOfEventDueToNationalMourning")) {
				selectValueFromList(cancellationOfEventDueToNationalMourningDropDown, policyInsIntAttrMNLEntity.getStringValueForField("CancellationOfEventDueToNationalMourning"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAccidentalorElectricalGridfailure")) {
				selectValueFromList(accidentalorElectricalGridfailureDropDown, policyInsIntAttrMNLEntity.getStringValueForField("AccidentalorElectricalGridfailure"));
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelecastRightsForTVcoverage")) {
				selectValueFromList(telecastRightsForTVcoverageDropdown, policyInsIntAttrMNLEntity.getStringValueForField("TelecastRightsForTVcoverage"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPublicLiability")) {
				selectValueFromList(publicLiabilityDropDown, policyInsIntAttrMNLEntity.getStringValueForField("PublicLiability"));
			}

			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfEvent")) {
				clearAndSendKeys(descriptionofEventTextField, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfEvent"));
			}*/
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEventStartDate")) {
				String eventStartDate=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("EventStartDate"));
				clearAndEnterDate(eventStartDateTextField, eventStartDate);
			}*/
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfRiskForEventCancellation")) {
				selectValueFromList(typeOfRiskForEventCancellationDropDown, policyInsIntAttrMNLEntity.getStringValueForField("TypeOfRiskForEventCancellation"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCoverForOtherExtension")) {
				selectValueFromList(coverForOtherExtensionDropDown, policyInsIntAttrMNLEntity.getStringValueForField("CoverForOtherExtension"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection1ARequired")) {
				selectValueFromList(section1ARequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("Section1ARequired"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigValueOfTheBuildingClassAConstructionOnlyShopOwnedByInsured")) {
				clearAndSendKeys(valueOfTheBuildingClassAConstructionOnlyShopOwnedByInsuredTextField, policyInsIntAttrMNLEntity.getStringValueForField("ValueOfTheBuildingClassAConstructionOnlyShopOwnedByInsured"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercent")) {
				clearAndSendKeys(ratePercentTextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercent"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection1BRequired")) {
				selectValueFromList(section1BRequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("Section1BRequired"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForFireFurnitureFixtureAndFittings")) {
				fillSumInsuredForFireFurnitureFixtureAndFittings(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForFireStockInTradeIncludingGoodsHeldInTrust")) {
				fillSumInsuredForFireStockInTradeIncludingGoodsHeldInTrust(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompulsoryExcessForSection1")) {
				selectValueFromList(compulsoryExcessForSection1DropDown, policyInsIntAttrMNLEntity.getStringValueForField("CompulsoryExcessForSection1"));
			}
			//SY - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerYear")) {
				clearAndSendKeys(compensationLimitPerYearTextField, policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerYear"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMedicalExpensesPerStudentPerYear")) {
				clearAndSendKeys(medicalExpensesPerStudentPerYearTextField, policyInsIntAttrMNLEntity.getStringValueForField("MedicalExpensesPerStudentPerYear"));		
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfRiskForEventCancellation")) {
				selectValueFromList(typeOfRiskForEventCancellationDropDown, policyInsIntAttrMNLEntity.getStringValueForField("TypeOfRiskForEventCancellation"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCoverForOtherExtension")) {
				selectValueFromList(coverForOtherExtensionDropDown, policyInsIntAttrMNLEntity.getStringValueForField("CoverForOtherExtension"));
			}

			//EX (chintan)
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRiskCovered")) {
				selectValueFromList(riskCoveredTextField, policyInsIntAttrMNLEntity.getStringValueForField("RiskCovered"));
			}*/
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				clearAndSendKey(descriptionOfTheRiskTextField, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfTheRisk"));
			}
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocationDetailsOfTheExhibition")) {
				selectValueFromList(locationDetailsOfTheExhibitionTextField, policyInsIntAttrMNLEntity.getStringValueForField("LocationDetailsOfTheExhibition"));
			}*/
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("")) {
				selectValueFromList(specialExclusionTextField, policyInsIntAttrMNLEntity.getStringValueForField("SpecialExclusion"));
			}*/	
			//BI-Rajkumar
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBurglary")) {
				selectValueFromList(policyTypeForBurglaryList, policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBurglary"));
			}	
			//SK
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasicSumInsuredOfStockBrokersIndemnity")) {
				selectValueFromList(basicSumInsuredOfStockBrokersIndemnityDropDown, policyInsIntAttrMNLEntity.getStringValueForField("BasicSumInsuredOfStockBrokersIndemnity"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasicPremiumForSK")) {
				clearAndSendKeys(basicPremiumForSKTextField, policyInsIntAttrMNLEntity.getStringValueForField("BasicPremiumForSK"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExchangeBranchDetailsSK")) {
				fillExchangeBranchDetails(policyInsIntAttrMNLEntity);
			}

			//GANESH
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection3ARequired")) {
				selectValueFromList(isSection3ARequiredDropDown, policyInsIntAttrMNLEntity.getStringValueForField("IsSection3ARequired"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionDetailsFor3A")) {
				fillSectionDetailsFor3A(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSuminsuredforsection4")) {
				clearAndSendKeys(suminsured4ATextField, policyInsIntAttrMNLEntity.getStringValueForField("Suminsuredforsection4"));
			}

			//Shruti


			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSuminsuredforsection5")) {
				clearAndSendKeys(suminsured5ATextField, policyInsIntAttrMNLEntity.getStringValueForField("Suminsuredforsection5"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection3AMoney")) {
				clearAndSendKeys(section3AMoneyintransitTextField, policyInsIntAttrMNLEntity.getStringValueForField("Section3AMoney"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection3BMoneyInsideBusiness")) {
				clearAndSendKeys(section3BMoneyintillduringbusinesshoursTextField, policyInsIntAttrMNLEntity.getStringValueForField("Section3BMoneyInsideBusiness"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMoneylockedOutside")) {
				clearAndSendKeys(moneylockedsafeofficeoutsidebusinesshoursTextField, policyInsIntAttrMNLEntity.getStringValueForField("MoneylockedOutside"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMakeNameofManufacturerDetails")) {
				fillMakeNameofManufacturerDetails(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigWhethertheSImorethan2crore")) {
				selectValueFromList(whethertheSImorethan2croreDropDown, policyInsIntAttrMNLEntity.getStringValueForField("WhethertheSImorethan2crore"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocationDetailsOfTheExhibition")) {
				clearAndSendKey(locationDetailsOfTheExhibitionTextField, policyInsIntAttrMNLEntity.getStringValueForField("LocationDetailsOfTheExhibition"));
			}



			//BD
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDetailsOfStockOwn")) {
				fillDetailsOfStockOwn(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredStockinTrade")) {
				clearAndSendKeys(sumInsuredStockinTradeTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredStockinTrade"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateforStock")) {
				clearAndSendKeys(rateforStockTextField, policyInsIntAttrMNLEntity.getStringValueForField("RateforStock"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGoodsHeldInTrustCommission")) {
				fillGoodsHeldInTrustCommission(policyInsIntAttrMNLEntity);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredGoodsHeldCommission")) {
				clearAndSendKeys(sumInsuredGoodsHeldinTrustCommissionTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredGoodsHeldCommission"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateforGoodsHeld")) {
				clearAndSendKeys(rateforGoodsHeldTextField, policyInsIntAttrMNLEntity.getStringValueForField("RateforGoodsHeld"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFirstLossRequired")) {
				selectValueFromList(firstLossRequiredDropdown, policyInsIntAttrMNLEntity.getStringValueForField("FirstLossRequired"));
			}

			// OS
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBusinessFurnitureFurnishingsSafesOfficeMachinery")) {
				clearAndSendKeys(businessFurnitureFurnishingsSafesOfficeMachineryTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachinery"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDocuments")) {
				clearAndSendKeys(documentsTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("Documents"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelephonGasandElectricMeters")) {
				clearAndSendKeys(telephonGasandElectricMetersTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("TelephonGasandElectricMeters"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTenantsImprovementAndDecoration")) {
				clearAndSendKeys(tenantsImprovementAndDecorationTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("TenantsImprovementAndDecoration"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPedalCycles")) {
				clearAndSendKeys(pedalCyclesTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("PedalCycles"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigElectronicEquipment")) {
				clearAndSendKeys(electronicEquipmentTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("ElectronicEquipment"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAllOtherContents")) {
				clearAndSendKeys(allOtherContentsTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("AllOtherContents"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigProfessionalInstrumentsAndEquipments")) {
				clearAndSendKeys(professionalInstrumentsAndEquipmentsTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("ProfessionalInstrumentsAndEquipments"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigClothingAndPersonalEffects")) {
				clearAndSendKeys(clothingAndPersonalEffects, policyInsIntAttrMNLEntity.getStringValueForField("ClothingAndPersonalEffects"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCostofRemovalOfDebris")) {
				clearAndSendKeys(costofRemovalOfDebrisTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("CostofRemovalOfDebris"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLimitAnyOneLoss")) {
				clearAndSendKeys(limitAnyOneLossTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("LimitAnyOneLoss"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigInTransitOverThePolicyPeriodAnnualTurnover")) {
				clearAndSendKeys(inTransitOverThePolicyPeriodAnnualTurnoverTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("InTransitOverThePolicyPeriodAnnualTurnover"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOfficeAddress")) {
				clearAndSendKeys(officeAddressTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("OfficeAddress"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLimitOfIndemnity")) {
				clearAndSendKeys(limitOfIndemnityTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("LimitOfIndemnity"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIndemnityPeriodMonthsForOS")) {
				clearAndSendKeys(indemnityPeriodMonthsForOSTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("IndemnityPeriodMonthsForOS"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateForSection10")) {
				clearAndSendKeys(rateForSection10TextFeild, policyInsIntAttrMNLEntity.getStringValueForField("RateForSection10"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionDetailsFor6")) {
				fillSectionDetailsFor6(policyInsIntAttrMNLEntity,assertReference);	
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection7")) {
				clearAndSendKeys(sumInsuredForSection7TextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection7"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredBuglary")) {
				clearAndSendKeys(sumInsuredBuglaryTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredBuglary"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPincodeOS")) {
				clearAndSendKeys(pinCodeTextFieldOS, policyInsIntAttrMNLEntity.getStringValueForField("PinCodeOS"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionofthepolicyOS")) {
				selectValueFromList(sectionofthepolicyDropDownOS, policyInsIntAttrMNLEntity.getStringValueForField("SectionofthepolicyOS"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigShopAddress")) {
				clearAndSendKeys(shopAddressTextField, policyInsIntAttrMNLEntity.getStringValueForField("ShopAddress"));
			}
			
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRataOneforsectionFour")) {
				clearAndSendKeys(Rata1forsection4TextFeild, policyInsIntAttrMNLEntity.getStringValueForField("RataOneforsectionFour"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPercarryinglimit")) {
				clearAndSendKeys(PercarryinglimitTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("Percarryinglimit"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMoneyinofficeduringbusinesshours")) {
				clearAndSendKeys(MoneyinofficeduringbusinesshoursTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("Moneyinofficeduringbusinesshours"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRataTwoforsectionFour")) {
				clearAndSendKeys(Rate2forsection4TextFeild, policyInsIntAttrMNLEntity.getStringValueForField("RataTwoforsectionFour"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMoneyinlockedsafeinofficeoutsidebusinesshours")) {
				clearAndSendKeys(MoneyinlockedsafeinofficeoutsidebusinesshoursTextFeild, policyInsIntAttrMNLEntity.getStringValueForField("Moneyinlockedsafeinofficeoutsidebusinesshours"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatathreeforsectionFour")) {
				clearAndSendKeys(Rate3forsection4TextFeild, policyInsIntAttrMNLEntity.getStringValueForField("RatathreeforsectionFour"));
			}
			
			
			

		}
		else if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBaggage")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBaggage"), fetchValueFromList(policyTypeForBaggageDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RateInPercent"), fetchValueFromTextFields(rateInPercentTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFloaterExtraPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("FloaterExtraPercent"), fetchValueFromTextFields(floaterExtraPercentTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPerCapitaLoadingAmount")) {
			assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PerCapitaLoadingAmount"), fetchValueFromTextFields(perCapitaLoadingAmountTextField), AssertionType.WARNING);
			}
			//GS
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfBuilding")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AddressOfBuilding"), fetchValueFromList(addressOfBuildingTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressContd")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AddressContd"), fetchValueFromList(addressContdTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeGS")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PinCodeGS"), fetchValueFromList(pinCodeGSTextField), AssertionType.WARNING);
			}
			
			//RK
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGroupName")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("GroupName"), fetchValueFromList(groupNameTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNoOfPersonPerGroup")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NoOfPersonPerGroup"), fetchValueFromList(noOfPersonPerGroupTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialConditionRK")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialConditionRK"), fetchValueFromList(specialConditionRKTextArea), AssertionType.WARNING);
			}
			
			//BB VERIFY
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfBankForBankersIndemnity")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TypeOfBankForBankersIndemnity"), fetchValueFromList(typeofBankforBankersIndemnityDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNumberOfBankBranches")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NumberOfBankBranches"), fetchValueFromList(numberofBankBranchesDropDown), AssertionType.WARNING);
			}

			//BD VERIFY
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressoflocation")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Addressoflocation"), fetchValueFromTextFields(addressoflocationTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeBd")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PinCode"), fetchValueFromList(pinCodeDropDownBd), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOccupancyDetails")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("OccupancyDetails"), fetchValueFromList(occupancyDetailsDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasisOfDeclaration")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("BasisOfDeclaration"), fetchValueFromList(basisofDeclarationDropDown), AssertionType.WARNING);
			}

			//BA - Priyanka
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBaggage")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBaggage"), fetchValueFromList(policyTypeForBaggageDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateInPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RateInPercent"), fetchValueFromTextFields(rateInPercentTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFloaterExtraPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("FloaterExtraPercent"), fetchValueFromTextFields(floaterExtraPercentTextField), AssertionType.WARNING);
			}
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPerCapitaLoadingAmount")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PerCapitaLoadingAmount"), fetchValueFromTextFields(perCapitaLoadingAmountTextField), AssertionType.WARNING);
			}*/
			//BS - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheGirl")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheGirl"), fetchValueFromTextFields(nameOfTheGirlTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfGirl")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfGirl")) ,fetchValueFromTextFields(dateOfBirthOfGirlTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAgeOfGirl")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AgeOfGirl"), fetchValueFromTextFields(ageOfGirlTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfFatherOfTheGirl")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfFatherOfTheGirl"), fetchValueFromTextFields(nameOfFatherOfTheGirlTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfFather")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfFather")) ,fetchValueFromTextFields(dateOfBirthOfFatherTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFathersAge")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("FathersAge"), fetchValueFromTextFields(fathersAgeTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheMother")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheMother"), fetchValueFromTextFields(nameOfTheMotherTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirthOfMother")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirthOfMother")) ,fetchValueFromTextFields(dateOfBirthOfMotherTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAgeOfTheMother")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AgeOfTheMother"), fetchValueFromTextFields(ageOfTheMotherTextField), AssertionType.WARNING);
			}
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}*/
			//fs - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocation")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Location"), fetchValueFromTextFields(locationTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PinCode"), fetchValueFromList(pinCodeTextFieldFS), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialExclusion")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialExclusion"), fetchValueFromTextFields(specialExclusionTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SubjectToClause"), fetchValueFromTextFields(subjectToClauseTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialExcess")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialExcess"), fetchValueFromTextFields(specialExcessTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialCondition")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialCondition"), fetchValueFromTextFields(specialConditionTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Description"), fetchValueFromTextFields(descriptionTextArea), AssertionType.WARNING);
			}
			//MI - Priyanka
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForMoney")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForMoney"), fetchValueFromList(policyTypeForMoneyDropDown), AssertionType.WARNING);
			}
			//OS - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBuildingsIncludingFixtureAndFittings")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("BuildingsIncludingFixtureAndFittings"), fetchValueFromTextFields(buildingsIncludingFixtureAndFittingsTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigProvisionForArchitectsSurveyorsLegalFeeAndDebrisRemoval")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ProvisionForArchitectsSurveyorsLegalFeeAndDebrisRemoval"), fetchValueFromTextFields(provisionForArchitectsSurveyorsLegalFeeAndDebrisRemovalTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTotalSumInsuredForSec1")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TotalSumInsuredForSec1"), fetchValueFromTextFields(totalSumInsuredForSec1TextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForSection1")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForSection1"), fetchValueFromTextFields(ratePercentForSection1TextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNatureOfBusinessTrade")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NatureOfBusinessTrade"), fetchValueFromTextFields(natureOfBusinessTradeTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSectionOfThePolicy")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SectionOfThePolicy"), fetchValueFromTextFields(sectionOfThePolicyTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOfficeAddressOS")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("OfficeAddressOS"), fetchValueFromTextFields(officeAddressOSTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeOS")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PinCodeOS"), fetchValueFromTextFields(pinCodeOSTextField), AssertionType.WARNING);
			}
			//PB - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheMember")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheMember").toLowerCase(), fetchValueFromTextFields(nameOfTheMemberTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				String dateOfBirth=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfBirth"));
				assertReference.assertEquals(dateOfBirth, fetchValueFromTextFields(dateOfBirthTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPassportNumber")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PassportNumber"), fetchValueFromTextFields(passportNumberTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateOfIssue")) {
				String dateOfIssue=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateOfIssue"));
				assertReference.assertEquals(dateOfIssue, fetchValueFromTextFields(dateOfIssueTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigVisaType")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("VisaType").toLowerCase(), fetchValueFromTextFields(visaTypeTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCorrespondingAddressIndia")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CorrespondingAddressIndia"), fetchValueFromTextFields(correspondingAddressIndiaTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfNextKin")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfNextKin"), fetchValueFromTextFields(nameOfNextKinTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRelationshipOfNextKin")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RelationshipOfNextKin").toLowerCase(), fetchValueFromTextFields(relationshipOfNextKinTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfNextKin")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AddressOfNextKin"), fetchValueFromTextFields(addressOfNextKinTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelephoneNoOfNextKin")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TelephoneNoOfNextKin"), fetchValueFromTextFields(telephoneNoOfNextKinTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("GoodHealthDeclaration"), fetchValueFromList(goodHealthDeclarationDropDown), AssertionType.WARNING);
			}
			//HH - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection1ARequired")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("IsSection1ARequired"), fetchValueFromList(isSection1ARequiredDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection1BRequired")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("IsSection1BRequired"), fetchValueFromList(isSection1BRequiredDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentItemsForSection1B")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RatePercentItemsForSection1B"), fetchValueFromTextFields(ratePercentItemsForSection1BTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1A")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection1A"), fetchValueFromTextFields(sumInsuredForSection1ATextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForSection1A")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForSection1A"), fetchValueFromTextFields(ratePercentForSection1ATextField), AssertionType.WARNING);
			}
			//RR - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheWoman")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheWoman"), fetchValueFromTextFields(nameOfTheWomanTextArea), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigWhetherWiderCoverRequired")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("WhetherWiderCoverRequired"), fetchValueFromList(whetherWiderCoverRequiredDropDown), AssertionType.WARNING);
			}
			//FL - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForFidelity")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForFidelity"), fetchValueFromList(policyTypeForFidelityDropDown), AssertionType.WARNING);
			}
			//NI- Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsTheBusinessDirect")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("IsTheBusinessDirect"), fetchValueFromList(isTheBusinessDirectDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDiscountForDirectBusinessPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("DiscountForDirectBusinessPercent"), fetchValueFromTextFields(discountForDirectBusinessPercentTextField), AssertionType.WARNING);			
			}
			//JI - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNatureOfBusiness")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NatureOfBusiness"), fetchValueFromList(natureOfBusinessDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigClassOfRiskForTheHighestRating")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ClassOfRiskForTheHighestRating"), fetchValueFromList(classOfRiskForTheHighestRatingDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfPremisesWhereRiskIsCovered")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AddressOfPremisesWhereRiskIsCovered"), fetchValueFromTextFields(addressOfPremisesWhereRiskIsCoveredTextArea), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPinCodeJI")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PinCodeJI"), fetchValueFromTextFields(pinCodeTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigState")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("State"), fetchValueFromList(stateDropDown), AssertionType.WARNING);
			}
			//PQ - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEquipmentType")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("EquipmentType"), fetchValueFromList(equipmentTypeDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfTheEquipment")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfTheEquipment"), fetchValueFromTextFields(descriptionOfTheEquipmentTextArea), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheUser")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheUser"), fetchValueFromTextFields(nameOfTheUserTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddress")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Address"), fetchValueFromTextFields(addressTextArea), AssertionType.WARNING );
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIfMobilePleaseSpecifyMobileNumber")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("IfMobilePleaseSpecifyMobileNumber"), fetchValueFromTextFields(ifMobilePleaseSpecifyMobileNumberTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigModel")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Model"), fetchValueFromTextFields(modeltextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigYearOfMaked")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("YearOfMaked"), fetchValueFromList(yearOfMakedDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSerialNumberOfTheEquipment")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SerialNumberOfTheEquipment"), fetchValueFromTextFields(serialNumberOfTheEquipmentTextField), AssertionType.WARNING);
			}
			/*if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}*/
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRateForEquipmentInPercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RateForEquipmentInPercent"), fetchValueFromTextFields(rateForEquipmentInPercentTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigElectricalAndMechanicalDamage")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ElectricalAndMechanicalDamage"), fetchValueFromList(electricalAndMechanicalDamageDropDown), AssertionType.WARNING);
			}
			//PT - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForPlateGlass")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForPlateGlass"), fetchValueFromList(policyTypeForPlateGlassDropDown), AssertionType.WARNING);
			}
			//SE - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNumberOfStudents")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NumberOfStudents"), fetchValueFromTextFields(numberOfStudentsTextField), AssertionType.WARNING);
			}
			//SK - Mayur
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTypeOfExchange")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TypeOfExchange"), fetchValueFromList(typeOfExchangeDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerStudent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerStudent"), fetchValueFromTextFields(compensationLimitPerStudentTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSEBIRegdNoForBSE")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SEBIRegdNoForBSE"), fetchValueFromTextFields(sEBIRegdNoForBSETextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")){
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerAcci	dent"), fetchValueFromTextFields(compensationLimitPerAccidentTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBSERegdNo")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("BSERegdNo"), fetchValueFromTextFields(bSERegdNoTextfield), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMedicalExpensesPerStudent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("MedicalExpensesPerStudent"), fetchValueFromTextFields(medicalExpensesPerStudentTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNoOfExchangeBranches")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NoOfExchangeBranches"), fetchValueFromList(noOfExchangeBranchesDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercentForMedicalExpenses")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RatePercentForMedicalExpenses"), fetchValueFromTextFields(ratePercentForMedicalExpensesTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasicSumInsuredOfStockBrokersIndemnity")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("BasicSumInsuredOfStockBrokersIndemnity"), fetchValueFromList(basicSumInsuredOfStockBrokersIndemnityDropDown), AssertionType.WARNING);
			}
			//SH - Priyanka
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection1ARequired")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Section1ARequired"), fetchValueFromList(section1ARequiredDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBasicPremiumForSK")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("BasicPremiumForSK"), fetchValueFromTextFields(basicPremiumForSKTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigValueOfTheBuildingClassAConstructionOnlyShopOwnedByInsured")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ValueOfTheBuildingClassAConstructionOnlyShopOwnedByInsured"), fetchValueFromTextFields(valueOfTheBuildingClassAConstructionOnlyShopOwnedByInsuredTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRatePercent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("RatePercent"), fetchValueFromTextFields(ratePercentTextField), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSection1BRequired")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Section1BRequired"), fetchValueFromList(section1BRequiredDropDown), AssertionType.WARNING);
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompulsoryExcessForSection1")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CompulsoryExcessForSection1"), fetchValueFromList(compulsoryExcessForSection1DropDown), AssertionType.WARNING);
			}
			//SY - Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerYear")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CompensationLimitPerYear"), fetchValueFromTextFields(compensationLimitPerYearTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMedicalExpensesPerStudentPerYear")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("MedicalExpensesPerStudentPerYear"), fetchValueFromTextFields(medicalExpensesPerStudentPerYearTextField), AssertionType.WARNING);
			}
			//EV VERIFY(chintan)
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFireAndAlliedPerils")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("FireAndAlliedPerils"), fetchValueFromList(fireAndAlliedPerilsDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEarthquake")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Earthquake"), fetchValueFromList(earthquakeDropDown), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCancellationOfEventDueToNationalMourning")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("CancellationOfEventDueToNationalMourning"), fetchValueFromList(cancellationOfEventDueToNationalMourningDropDown), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAccidentalorElectricalGridfailure")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AccidentalorElectricalGridfailure"), fetchValueFromList(accidentalorElectricalGridfailureDropDown), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTelecastRightsForTVcoverage")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TelecastRightsForTVcoverage"), fetchValueFromList(telecastRightsForTVcoverageDropdown), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPublicLiability")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PublicLiability"), fetchValueFromList(publicLiabilityDropDown), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionofEvent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("DescriptionofEvent"), fetchValueFromTextFields(descriptionofEventTextField), AssertionType.WARNING);
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEventStartDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("EventStartDate")) ,fetchValueFromTextFields(eventStartDateTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTypeForBurglary")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("PolicyTypeForBurglary"), fetchValueFromTextFields(policyTypeForBurglaryList), AssertionType.WARNING);
			}
			//Priyanka
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEventEndDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("EventEndDate")) ,fetchValueFromTextFields(eventEndDateTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExcessAs")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ExcessAs"), fetchValueFromList(excessAsDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExcessAmount")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ExcessAmount"), fetchValueFromTextFields(excessAmountTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigJurisdictionOfTheEvent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("JurisdictionOfTheEvent"), fetchValueFromList(jurisdictionOfTheEventDropDown), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocationDetailsOfTheEvent")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("LocationDetailsOfTheEvent"), fetchValueFromTextFields(locationDetailsOfTheEventTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfTheRisk")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfTheRisk"), fetchValueFromTextFields(descriptionOfTheRiskTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLocationDetailsOfTheExhibition")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("LocationDetailsOfTheExhibition"), fetchValueFromTextFields(locationDetailsOfTheExhibitionTextField), AssertionType.WARNING);
			}
			/*if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSpecialExclusion")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("SpecialExclusion"), fetchValueFromTextFields(specialExclusionTextField), AssertionType.WARNING);
			}*/
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigExchangeBranchDetailsSK")) {
				verfiyExchangeBranchDetails(policyInsIntAttrMNLEntity, assertReference);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigWhethertheSImorethan2crore")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("WhethertheSImorethan2crore"), fetchValueFromList(whethertheSImorethan2croreDropDown), AssertionType.WARNING);
			}

			//HH Endorse
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSuminsuredforsection1BEndorse")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Suminsuredforsection1BEndorse"), fetchValueFromTextFields(sumInsuredforsection1BTextField), AssertionType.WARNING);
			}
			//SE 
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigTotalSumInsuredforMedicalExpenses")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("TotalSumInsuredforMedicalExpenses"), fetchValueFromTextFields(totalSumInsuredforMedicalExpensesTextField ), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigShopAddress")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("ShopAddress"), fetchValueFromTextFields(shopAddressTextField ), AssertionType.WARNING);
			}

		}
	}
	public void fillRiskDetailsForFI(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("add") || policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("edit")){
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNamedFloatingDetailsForFidelity")) {
				fillRiskDescriptionOfPackagePolicy(policyInsIntAttrMNLEntity,assertReference);	
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGuaranteeamountforNamedFloating")) {
				clearAndSendKeys(guaranteeamountforNamedFloatingTextField, policyInsIntAttrMNLEntity.getStringValueForField("GuaranteeamountforNamedFloating"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLimitperPerson")) {
				clearAndSendKeys(limitperPersonTextField, policyInsIntAttrMNLEntity.getStringValueForField("LimitperPerson"));
			}
			//Ganesh for HH
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameoftheInsuredPerson")) {
				clearAndSendKeys(nameoftheInsuredPersonTextField,policyInsIntAttrMNLEntity.getStringValueForField("NameoftheInsuredPerson"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRelationshipwiththePolicyholderofPU")) {
				selectValueFromList(relationshipwiththePolicyholderofPUDropDown,policyInsIntAttrMNLEntity.getStringValueForField("RelationshipwiththePolicyholderofPU"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDateofBirthoftheMember")) {
				String dateOfBirthOfMember=RandomCodeGenerator.dateGenerator(policyInsIntAttrMNLEntity.getStringValueForField("DateofBirthoftheMember"));
				clearAndEnterDate(dateOfBirthOfMemberTextField, dateOfBirthOfMember);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNomineeName")) {
				clearAndSendKey(nomineeNameTextField,policyInsIntAttrMNLEntity.getStringValueForField("NomineeName"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRelationshipwithNominee")) {
				clearAndSendKey(relationshipwithNomineeTextField,policyInsIntAttrMNLEntity.getStringValueForField("RelationshipwithNominee"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSerialNo")) {
				clearAndSendKey(serialNoTextField,policyInsIntAttrMNLEntity.getStringValueForField("SerialNo"));
			}


			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigStaffDiscountHH")) {
				selectValueFromList(staffDiscountHHDropDown,policyInsIntAttrMNLEntity.getStringValueForField("StaffDiscountHH"));
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigaddressOfBuildingHH")) {
				clearAndSendKeys(addressOfBuildingHHTextArea, policyInsIntAttrMNLEntity.getStringValueForField("addressOfBuildingHH"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigpinCodeHH")) {
				clearAndSendKeys(pinCodeHHTextField, policyInsIntAttrMNLEntity.getStringValueForField("pinCodeHH"));
			}
			
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("Configsuminsuredforsection2BHH")) {
				clearAndSendKeys(suminsuredforsection2BHHTextField, policyInsIntAttrMNLEntity.getStringValueForField("Suminsuredforsection2BHH"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigratePercentforsection2BHH")) {
				clearAndSendKeys(ratePercentforsection2BHHTextField, policyInsIntAttrMNLEntity.getStringValueForField("RatePercentforsection2BHH"));
			}
			
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection3AAllriskJewelerRequiredHH")) {
				selectValueFromList(isSection3AAllriskJewelerRequiredHHDropDown,policyInsIntAttrMNLEntity.getStringValueForField("IsSection3AAllriskJewelerRequired"));
			}
			
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsvaluationcertificateprovidedHH")) {
				selectValueFromList(isvaluationcertificateprovidedHHDropDown,policyInsIntAttrMNLEntity.getStringValueForField("Isvaluationcertificateprovided"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigIsSection3BAllriskPortableequipmentRequiredHH")) {
				selectValueFromList(isSection3BAllriskPortableequipmentRequiredHHDropDown,policyInsIntAttrMNLEntity.getStringValueForField("IsSection3BAllriskPortableequipmentRequired"));
			}
			
			if(!policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEndorse")){
				click(forwardButton);
			}
			

			try{
				acceptAlertAndReturnConfirmationMessage();
			}catch(Exception e){}			
		}
		else if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("verify")){

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGuaranteeamountforNamedFloating")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("GuaranteeamountforNamedFloating"), fetchValueFromTextFields(guaranteeamountforNamedFloatingTextField), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLimitperPerson")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("LimitperPerson"), fetchValueFromTextFields(limitperPersonTextField), AssertionType.WARNING);
			}
			if(!policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEndorse")){
				click(forwardButton);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigStaffDiscountHH")) {
				selectValueFromList(staffDiscountHHDropDown,policyInsIntAttrMNLEntity.getStringValueForField("StaffDiscountHH"));
			}

			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigaddressOfBuildingHH")) {
				clearAndSendKeys(addressOfBuildingHHTextArea, policyInsIntAttrMNLEntity.getStringValueForField("addressOfBuildingHH"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigpinCodeHH")) {
				clearAndSendKeys(pinCodeHHTextField, policyInsIntAttrMNLEntity.getStringValueForField("pinCodeHH"));
			}
		}
	}


	public void clickOnOpenButton1(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(open3AButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Sec 3 Rsk Dtls");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Sec 3 Rsk Dtls");
			}
		}
	}
	public void clickOnOpenButton6(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton6);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Section Details for 6' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Section Details for 6' Details");
			}
		}
	}

	public void fillSectionDetailsFor1B(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonHH(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigItemsForSection1B")) {
			selectValueFromList(itemsForSection1BDropDown, policyInsIntAttrMNLEntity.getStringValueForField("ItemsForSection1B"));
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfItemsForSection1B")) {
			clearAndSendKeys(descriptionOfItemsForSection1BTextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfItemsForSection1B"));
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1B")) {
			clearAndSendKeys(sumInsuredForSection1BTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection1B"));
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}

	}
	
	public void fillSectionDetailsFor5(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonHHSec5(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigItemsForSection5")) {
			selectValueFromList(itemsForSectionSec5DropDown, policyInsIntAttrMNLEntity.getStringValueForField("ItemsForSection5"));
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfItemsForSection5")) {
			clearAndSendKeys(descriptionOfItemsForSection5TextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfItemsForSection5"));
		}
		
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredSection5")) {
			clearAndSendKeys(sumInsuredFSection5TextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredSection5"));
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}

	}



	public void navigateToPolicy(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void navigateToClientDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToforwardRiskDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		//product condition for HH
		if(!(policyInsIntAttrMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH"))) {
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigForwardButton")){		
				click(forwardButton);
				switchToFrame("display");
			}
			else if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDoubleForwordButton")){			
				click(forwardButton);
				click(forwardButton);
				switchToFrame("display");
			}
		}
	}

	public void navigateToforwardHHRiskDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigHHForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}


	public void navigateBackFromRiskDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity){
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnOpenButton(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openNewWindowButtonPY);
			Thread.sleep(5000);
			switchToWindow("Risk Description of Package Policy' Details");
		}
	}
	public void clickOnOpenButtonFI(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButtonFI")){
			click(openButton);
			Thread.sleep(5000);
			switchToWindow("Risk Description of Package Policy' Details");
		}
	}

	public void fillRiskDescriptionOfPackagePolicy(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButtonFI(policyInsIntAttrMNLEntity);
		clickOnOpenButton(policyInsIntAttrMNLEntity);
		if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("add")||policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("edit")){
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigRiskDescriptionOfPackagePolicy")) {
				clearAndSendKeys(descriptionOfPropertyTextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfProperty"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredNewWindow")) {
				clearAndSendKeys(sumInsuredTextFieldNewWindow, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredNewWindow"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfLocationPY")) {
				clearAndSendKeys(addressOfLocationTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfLocation"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfThePerson")) {
				clearAndSendKeys(nameOfThePersonTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfThePerson"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCadre")) {
				clearAndSendKeys(cadreTextArea, policyInsIntAttrMNLEntity.getStringValueForField("Cadre"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
		else if(policyInsIntAttrMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfLocation")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfThePerson"), fetchValueFromTextFields(nameOfThePersonTextArea), AssertionType.WARNING);
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCadre")) {
				assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("Cadre"), fetchValueFromTextFields(cadreTextArea), AssertionType.WARNING);
			}
		}


		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
	}
	public void clickOnOpenButton2(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Rsk Dtls Sec 1");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Rsk Dtls Sec 1");
			}
		}
	}
	public void clickOnOpenButtonSK(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(exchangeBranchDetailsButton);
			try{
				switchToWindow("'Exchange Branch Details' Details");
			}  
			catch (Exception e){
			}
		}
	}

	public void fillSumInsuredForFireFurnitureFixtureAndFittings(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonSH(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigContExcludMoneyAndValuArtsOfConseNat1FurAndFixtFit")) {
				clearAndSendKeys(contentsExcludingMoneyAndValuablesArticlesOfConsumableNature1FurnitureAndFixtureFittingTextField, policyInsIntAttrMNLEntity.getStringValueForField("ContExcludMoneyAndValuArtsOfConseNat1FurAndFixtFit"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfFurniture")) {
				clearAndSendKeys(descriptionOfFurnitureTextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfFurniture"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				//rskDtlsSec1Page= new PageElement(By.xpath("//div//b[contains(text(),'"+policyInsIntAttrMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				//isElementDisplayed(rskDtlsSec1Page);
			}
		}
	}
	public void fillExchangeBranchDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonSK(policyInsIntAttrMNLEntity);
		Thread.sleep(2000);
		int rowcount= 0;
		nameOfTheBranchTextArea= new PageElement(By.name("Data_252891719012011_"+rowcount), "Description of Property text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheBranchTextArea= new PageElement(By.name("Data_252891819012011_"+rowcount), "Address of location Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheBranch")) {
			clearAndSendKeys(nameOfTheBranchTextArea, policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheBranch"));
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfTheBranch")) {
			clearAndSendKeys(addressOfTheBranchTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfTheBranch"));
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	public void fillSumInsuredForFireStockInTradeIncludingGoodsHeldInTrust(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonSHF(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigContentsExcludingMoneyGoodsHeldInTheTrust")) {
				clearAndSendKeys(contentsExcludingMoneyAndValuableArticlesOfConsumableNature2StockAndTradeIncludingGoodsHeldInTheTrustTextField, policyInsIntAttrMNLEntity.getStringValueForField("ContentsExcludingMoneyGoodsHeldInTheTrust"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfStockInTrade")) {
				clearAndSendKeys(descriptionOfStockInTradeTextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfStockInTrade"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				//	rskDtlsSec1Page= new PageElement(By.xpath("//div//b[contains(text(),'"+policyInsIntAttrMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				//	isElementDisplayed(rskDtlsSec1Page);
			}
		}
	}
	public void verfiyExchangeBranchDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(policyInsIntAttrMNLEntity);
		int rowcount= 0;
		nameOfTheBranchTextArea= new PageElement(By.name("Data_252891719012011_"+rowcount), "Description of Property text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheBranchTextArea= new PageElement(By.name("Data_252891819012011_"+rowcount), "Address of location Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigNameOfTheBranch")) {
			assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("NameOfTheBranch"), fetchValueFromTextFields(nameOfTheBranchTextArea), AssertionType.WARNING);
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfTheBranch")) {
			assertReference.assertEquals(policyInsIntAttrMNLEntity.getStringValueForField("AddressOfTheBranch"), fetchValueFromTextFields(addressOfTheBranchTextArea), AssertionType.WARNING);			
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void fillSectionDetailsFor1A(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButton1(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigItemsForsection1A")) {
				selectValueFromList(ItemsForsection1ADropDown, policyInsIntAttrMNLEntity.getStringValueForField("ItemsForsection1A"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfItemsForSection1A")) {
				clearAndSendKeys(descriptionOfItemsForSection1ATextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfItemsForSection1A"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection1B")) {
				clearAndSendKeys(sumInsuredForSection1BTextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection1B"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				//Sec1RskDtlsPage= new PageElement(By.xpath("//div//b[contains(text(),'"+policyInsIntAttrMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);			
				//isElementDisplayed(Sec1RskDtlsPage);
			}
		}
	}

	public void fillSectionDetailsFor3A(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButton1(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);


		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigItemsForSection3A")) {
				selectValueFromList(itemsForSection1BDropDown, policyInsIntAttrMNLEntity.getStringValueForField("ItemsForSection1B"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfItemsForSection3A")) {
				clearAndSendKeys(descriptionOfItemsForSection3ATextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfItemsForSection3A"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection3A")) {
				clearAndSendKeys(sumInsuredForSection3ATextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection3A"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}
	//Shruti
	public void fillSectionDetailsFor6(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton6(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);


		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigItemsForSection6")) {
				selectValueFromList(itemsForSection6DropDown, policyInsIntAttrMNLEntity.getStringValueForField("ItemsForSection6"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDescriptionOfItemsForSection6")) {
				clearAndSendKeys(descriptionOfItemsForSection6TextArea, policyInsIntAttrMNLEntity.getStringValueForField("DescriptionOfItemsForSection6"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSumInsuredForSection6")) {
				clearAndSendKeys(sumInsuredForSection6TextField, policyInsIntAttrMNLEntity.getStringValueForField("SumInsuredForSection6"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}

	public void clickOnOpenButtonSH(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonSH);
			try{
				//Thread.sleep(3000);
				switchToWindow("Rsk Dtls Sec 1");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Rsk Dtls Sec 1");
			}
		}
	}

	public void fillMakeNameofManufacturerDetails(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		clickOnOpenButtonSHH(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigMakeandNameofManufacturerDetail")) {
				clearAndSendKeys(makeandNameofManufacturerDetailTextField, policyInsIntAttrMNLEntity.getStringValueForField("MakeandNameofManufacturerDetail"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigYearManufacturer")) {
				clearAndSendKeys(yearofManufacturerTextArea, policyInsIntAttrMNLEntity.getStringValueForField("YearManufacturer"));
			}
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigValueincludingaccessories")) {
				clearAndSendKeys(valueincludingaccessoriesTextArea, policyInsIntAttrMNLEntity.getStringValueForField("Valueincludingaccessories"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				//rskDtlsSec1Page= new PageElement(By.xpath("//div//b[contains(text(),'"+policyInsIntAttrMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				//isElementDisplayed(rskDtlsSec1Page);
			}
		}
		if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigEndorseSH")){
			if(policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigValueincludingaccessories")) {
				clearAndSendKeys(valueincludingaccessoriesTextArea,  policyInsIntAttrMNLEntity.getStringValueForField("Valueincludingaccessories"));
			}
			if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveWindowButton")){
				Thread.sleep(3000);
				click(saveWindowButton);
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
				//rskDtlsSec1Page= new PageElement(By.xpath("//div//b[contains(text(),'"+policyInsIntAttrMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				//isElementDisplayed(rskDtlsSec1Page);
			}
		}
	}
	public void clickOnOpenButtonSHH(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonSHH);
			try{
				//Thread.sleep(3000);
				switchToWindow("Rsk Dtls Sec 1");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Rsk Dtls Sec 1");
			}
		}
	}
	public void clickOnOpenButtonHH(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonHH);
			try{
				//Thread.sleep(3000);
				switchToWindow("Rsk Dtls Sec 1");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Rsk Dtls Sec 1");
			}
		}
	}
	public void clickOnOpenButtonHHSec5(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButtonHHSEC5")){
			click(openButtonHHSec5);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Section Details for 5' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Section Details for 5' Details");
			}
		}
	}
	public void clickOnOpenButtonSHF(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonSHF);
			try{
				//Thread.sleep(3000);
				switchToWindow("Rsk Dtls Sec 1");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Rsk Dtls Sec 1");
			}
		}
	}


	//BD
	private void fillDetailsOfStockOwn(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException {
		clickOnOpenButtonBD(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigStockDetails")) {
			clearAndSendKeys(stockDetailsTextArea, policyInsIntAttrMNLEntity.getStringValueForField("StockDetails"));
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddressOfLocationBD")) {
			clearAndSendKeys(addressOfLocationBDTextArea, policyInsIntAttrMNLEntity.getStringValueForField("AddressOfLocationBD"));
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);

		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);

		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}


	public void clickOnOpenButtonBD(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonDetailsOfStock);
			try{
				Thread.sleep(3000);
				switchToWindow("'Details of stock (Own)' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Details of stock (Own)' Details");
			}
		}
	}


	private void fillGoodsHeldInTrustCommission(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException {
		clickOnOpenButtonGoodsHeldInTrustCommission(policyInsIntAttrMNLEntity);
		Thread.sleep(3000);
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigGoodsHeldDetails")) {
			clearAndSendKeys(goodsHeldDetailsTextArea, policyInsIntAttrMNLEntity.getStringValueForField("GoodsHeldDetails"));
		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);

		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);

		}
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	private void clickOnOSSaveButton(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException {
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOSSaveButton")) {
			click(saveButton);
		}
	}

	public void clickOnOpenButtonGoodsHeldInTrustCommission(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity) throws InterruptedException{
		if (policyInsIntAttrMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButtonGoodsHeldInTrustCommission);
			try{
				Thread.sleep(3000);
				switchToWindow("'Goods Held in Trust and/or Commission' Details");
			}  
			catch (Exception e){
				switchToWindow("'Goods Held in Trust and/or Commission' Details");
			}
		}
	}


	public void fillandsubmitRiskDetailsOfT1PLRForMiscNL(PolInsIntAttrMNLEntity policyInsIntAttrMNLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyInsIntAttrMNLEntity.getConfigExecute())){
			switchToFrame("display");
			try{
				acceptAlertAndReturnConfirmationMessage();
			}catch(Exception e){}
			Thread.sleep(2000);	
			fillRiskDetailsOfT1PLRForMiscNL(policyInsIntAttrMNLEntity, assertReference);
			navigateToforwardRiskDetails(policyInsIntAttrMNLEntity);
			if(policyInsIntAttrMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FI")||policyInsIntAttrMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH")){
				fillRiskDetailsForFI(policyInsIntAttrMNLEntity,assertReference);
			}
			navigateToPolicy(policyInsIntAttrMNLEntity);
			navigateToAttribute(policyInsIntAttrMNLEntity);
			navigateToInsuredInterest(policyInsIntAttrMNLEntity);
			navigateToCoverage(policyInsIntAttrMNLEntity);
			navigateToLoan(policyInsIntAttrMNLEntity);
			navigateToClientDetails(policyInsIntAttrMNLEntity);
			navigateToRelation(policyInsIntAttrMNLEntity);
			navigateToPayment(policyInsIntAttrMNLEntity);
			navigateToFollowup(policyInsIntAttrMNLEntity);
			navigateToDocument(policyInsIntAttrMNLEntity);
			clickOnOSSaveButton(policyInsIntAttrMNLEntity);
			

		}
	}
}




