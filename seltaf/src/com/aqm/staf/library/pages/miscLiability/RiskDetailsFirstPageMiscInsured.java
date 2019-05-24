package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;
import com.aqm.staf.library.databin.RiskDetailsFirstMiscEntity;
import com.aqm.staf.library.databin.VoluntaryExcessDetailsEntity;

public class RiskDetailsFirstPageMiscInsured extends BasePage{

	//private PageElement voluntaryExcessDetailsPageTitle;	
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

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement detailsOfCompanyOwnershipDropDown;	
	private PageElement anyOneAccidentAOATextField;
	private PageElement aOAAOYDropDown;
	private PageElement anyOneYearAndInTheAggregateAOYTextField;
	private PageElement retroactiveDate1TextField;
	private PageElement deductibleType1DropDown;
	private PageElement geographicalJurisdiction1DropDown;
	private PageElement companyReimbursementDeductibleForIndia1TextField;
	private PageElement retroactiveDate2TextField;
	private PageElement retroactiveDate3TextField;
	private PageElement retroactiveDate4TextField;
	private PageElement retroactiveDate5TextField;
	private PageElement forwardButton;
	private PageElement	deductibleForIndiaOneTextField;
	private PageElement retroactiveDateOneFindButton;
	private PageElement retroactiveDateOneFindButtonPF;
	private PageElement retroactiveDateSecondFindButton;
	private PageElement retroactiveDateThirdFindButton;
	private PageElement retroactiveDateFourFindButton;
	private PageElement retroactiveDateFiveFindButton;
	//CO
	private PageElement openButton;

	private PageElement serialNoTextField;
	private PageElement ageOfTheVehicleTextField;
	private PageElement areaOfOperationTextArea;
	private PageElement registrationNumberOfVehicleTextField;
	private PageElement registrationDateTextField;
	private PageElement carryingCapacityTonsTextField;
	private PageElement bodyTypeDropDown;
	private PageElement numberOfTrailersTextField;
	private PageElement whetherRefrigeratedDropDown;
	private PageElement refrigeratedPremiumTextField;
	private PageElement loLLimitOfLiabilityLoadingRateTextField;
	private PageElement natureOfGoodsCODropDown;
	private PageElement skillOfTheDriverTextArea;
	private PageElement logBookMaintenanceDropDown;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;
	private PageElement deleteWindowButton;
	private PageElement isItBlanketCoverForAllVehiclesDropDown;
	private PageElement numberOfVehiclesWiderCoverTextField;

	//CT
	private PageElement typeOfPolicyCTDropDown;
	private PageElement perAccidentLimitTextField;
	private PageElement isPerpersonLimitRequiredDropDown;
	private PageElement optionsOfAggregateLimitDropDown;
	private PageElement aggregateLimitTextField;
	//ST
	private PageElement estimatedAnnualTurnoverTextField;
	private PageElement premiumratePercentTextField; 
	private PageElement riskDetailsOneDetailsPageTitle;
	//PL
	private PageElement paidUpCapitalTextField;
	private PageElement noOfLocationsInvolved;
	private PageElement optionsForLocationCoveredDropDown;
	private PageElement annualTurnoverPreviousYear;
	private PageElement annualTurnoverProposedYear; 
	private PageElement noOfWorkmen;
	private PageElement noOfOtherEmployee;
	private PageElement premiumRatePerMili;
	private PageElement loadingOnTurnoverProposedYear;




	// IN
	private PageElement numberOfUnitsTextField;
	private PageElement manufacturingUnitBelongsToWhichRiskGroupDropDown;
	private PageElement loadingForAdverseFeatureTextField;

	private PageElement compulsoryExcessTextField;
	private PageElement multiplierForAOATextField;
	private PageElement multiplierForUnitsTextField;
	private PageElement multiplierForAOANextTextField;
	private PageElement anyOneAccidentAOANextTextField;
	private PageElement dODeductibleForIndiaOneTextField;
	private PageElement companyReimbursemntDeductibleForIndiaOneTextField;

	private PageElement manufacturingUnitDetailsGroup1Button;

	// IT

	private PageElement totalNumberOfPartnersDirectorsPrincipalTextField;
	private PageElement totalNumberOfStaffsTextField;
	private PageElement annualTotalGrossIncomeTextField;
	private PageElement detailsOfProductsServicesTextArea;
	//IT



	private PageElement serialNoLabel;
	private PageElement typeOfManufacturingUnitDropDown;
	private PageElement annualTurnoverPreviousYear1TextField;
	private PageElement annualTurnoverProposedYear1TextField;
	private PageElement deleteButton;
	private PageElement addButton;
	private PageElement saveManufacturingUnitDetailsButton;
	private PageElement closeButton;

	//PD
	private PageElement doesthepolicycoversexportsonlyDropDown;
	private PageElement vendorsLiabilityDropDown;
	private PageElement typeofVendorDropDown;
	private PageElement loadingPerctofVendorTextField;
	private PageElement nameofVendorsTextField;
	private PageElement addressofVendorsTextField;
	private PageElement productDetailsButton;

	private PageElement productDescriptionTextField;
	private PageElement domesticTurnoverforpreviousYearTextField;
	private PageElement domesticTurnoverforCurrentYearTextField;
	private PageElement uSACanadaTurnoverforpreviousYearTextField;
	private PageElement uSACanadaTurnoverforCurrentYearTextField;
	private PageElement nonOECDTurnoverforpreviousyearTextField;
	private PageElement nonOECDTurnoverforCurrentYearTextField;
	private PageElement oECDTurnoverforpreviousYearTextField;
	private PageElement oECDTurnoverforCurrentYearTextField;
	private PageElement premiumRatePerMilliTextField;


	private PageElement anyOneAccidentAOA5TextField;
	private PageElement aOAAOY5DropDown;
	private PageElement anyOneYearandInTheAggregateAOY5Label;
	private PageElement deductibleType5DropDown;
	private PageElement geographicalJurisdiction5DropDown;
	private PageElement deductibleForIndia5TextField;

	private PageElement anyOneAccidentAOA2TextField;
	private PageElement aOAAOY2DropDown;
	private PageElement anyOneYearAndInTheAggregateAOY2Label;
	private PageElement deductibleType2DropDown;
	private PageElement geographicalJurisdiction2DropDown;
	private PageElement deductibleForIndia2TextField;

	private PageElement anyOneAccidentAOA3TextField;
	private PageElement aOAAOY3DropDown;
	private PageElement anyOneYearAndInTheAggregateAOY3Label;
	private PageElement deductibleType3DropDown;
	private PageElement geographicalJurisdiction3DropDown;
	private PageElement deductibleForIndia3TextField;

	private PageElement anyOneAccidentAOA4TextField;
	private PageElement aOAAOY4DropDown;
	private PageElement anyOneYearAndInTheAggregateAOY4Label;
	private PageElement deductibleType4DropDown;
	private PageElement geographicalJurisdiction4DropDown;
	private PageElement deductibleForIndia4TextField;

	//WC
	private PageElement tradeDescriptionTextField;
	private PageElement particularOfWorksTextField;
	private PageElement locationDetailsTextField;

	private PageElement noofEmployeeTextField;
	private PageElement categorieDropDown;
	private PageElement subCategorieFindButton;
	private PageElement subCategorieLinkTextField;
	private PageElement cashTotalWagesTextField;
	private PageElement tableOptedDropDown;
	private PageElement hasThePolicybeenspeciallyratedDropDown;
	private PageElement thecompetentauthoritywhohassanctionedthespecialratingDropDown;
	private PageElement premiumRatepermiliTextField;
	private PageElement openUptoButton;
	private PageElement openAboveButton;
	private PageElement rateBasisForWagesAbove8000DropDown;
	private PageElement includeAllSubContractorDropDown;
	private PageElement openSubContractorDetailsButton;
	private PageElement nameofcontractorTextField;
	private PageElement descriptionTextField;
	private PageElement subCategorieTextField;
	private PageElement noofWorkersSkilledTextField;
	private PageElement noofWorkersUnSkilledTextField;
	private PageElement noofWorkersOthersTextField;
	private PageElement amountWagesTextField;
	private PageElement milliRateTextField;
	private PageElement allPersonsinServiceDropDown;
	private PageElement EstimatedAnnualFeesTextField;

	// LN
	private PageElement typeOfConstructionLNDropDown;
	private PageElement deductibleTypeLNDropDown;
	//PF
	private PageElement detailsOPfBusinessTextArea;
	private PageElement addressOfBusinessPremisesTextArea;
	private PageElement typeOfProfessionDropDown;

	private PageElement perPersonLimitTextField;
	private PageElement numberOfPersonsTextField;
	private PageElement deductiblePerPersonTextField;

	// IN

	private PageElement deductibleForWorldwideExcludingUSAAndCanadaOneTextField;
	private PageElement deductibleForWorldwideIncludingUSAAndCanadaOneTextField;
	private PageElement messageWindowClose;



	public RiskDetailsFirstPageMiscInsured(WebDriver driver, String pageName,int rowcount) {
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

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		detailsOfCompanyOwnershipDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of company ownership","select")), "Details of company ownership DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneAccidentAOATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any One Accident (AOA)","input")), "Any One Accident (AOA) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aOAAOYDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("AOA : AOY","select")), "AOA : AOY DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		anyOneYearAndInTheAggregateAOYTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any One Year and in the Aggregate (AOY)","input")), "Any One Year and in the Aggregate (AOY) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDate1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date1","input")), "Retroactive Date 1 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleType1DropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type1","select")), "Type1 DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		geographicalJurisdiction1DropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Geographical Jurisdiction1","select")), "Geographical Jurisdiction1 DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		companyReimbursementDeductibleForIndia1TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company Reimbursement Deductible for India1","input")), "Company Reimbursement Deductible for India1 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDate2TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 2","input")), "Retroactive Date 2 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDate3TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 3","input")), "Retroactive Date 3 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDate4TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 4","input")), "Retroactive Date 4 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		retroactiveDate5TextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Retroactive Date 5","input")), "Retroactive Date 5 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		retroactiveDateOneFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 1')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date One Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateOneFindButtonPF= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date1')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date One Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateSecondFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 2')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date second Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateThirdFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 3')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date third Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateFourFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 4')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date fourth Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		retroactiveDateFiveFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 5')]/following::input/following::a[@name='firstFocus']"), "Retroactive Date fifth Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//CO
		openButton=new PageElement(By.name("propValues68"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextField=new PageElement(By.name("slNo0"), "Serial No TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageOfTheVehicleTextField=new PageElement(By.name("Data_252886019012011_0"), "Age Of The Vehicle TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		areaOfOperationTextArea=new PageElement(By.name("Data_252886119012011_0"), "Area Of Operation TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		registrationNumberOfVehicleTextField=new PageElement(By.name("Data_252886219012011_0"), "Registration Number Of Vehicle TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		registrationDateTextField=new PageElement(By.name("Data_195861302012008_0"), "Registration Date TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		carryingCapacityTonsTextField=new PageElement(By.name("Data_252886319012011_0"), "Carrying Capacity Tons TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		bodyTypeDropDown=new PageElement(By.name("Data_252886419012011_0"), "Body Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfTrailersTextField=new PageElement(By.name("Data_195615531122007_0"), "Number Of Trailers TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherRefrigeratedDropDown=new PageElement(By.name("Data_252886819012011_0"), "whether Refrigerated DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		refrigeratedPremiumTextField=new PageElement(By.name("Data_252887119012011_0"), "Refrigerated Premium TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loLLimitOfLiabilityLoadingRateTextField=new PageElement(By.name("Data_252887219012011_0"), "loL Limit Of Liability Loading Rate TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfGoodsCODropDown=new PageElement(By.name("Data_252887319012011_0"), "Nature Of Goods CO DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		skillOfTheDriverTextArea=new PageElement(By.name("Data_252887619012011_0"), "Skill Of The Driver TextArea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		logBookMaintenanceDropDown=new PageElement(By.name("Data_252887719012011_0"), "Log Book Maintenance DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addWindowButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isItBlanketCoverForAllVehiclesDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is it Blanket cover for all vehicles?","select")), "Is it Blanket cover for all vehicles DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberOfVehiclesWiderCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of vehicles (Wider Cover)","input")), "Number of vehicles (Wider Cover) TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		//CT
		typeOfPolicyCTDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Policy (CT)","select")), "Type of Policy (CT) DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		perAccidentLimitTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Per Accident Limit","input")), "Per Accident Limit TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		isPerpersonLimitRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is per person limit required","select")), "Is per person limit required DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsOfAggregateLimitDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Options of Aggregate Limit","select")), "Options of Aggregate Limit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aggregateLimitTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Aggregate Limit","input")), "Aggregate Limit TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleForIndiaOneTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deductible for India1","input")), "Deductible for India1 TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//ST
		estimatedAnnualTurnoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Annual Turnover","input")), "Estimated Annual Turnover TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumratePercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate (%)","input")), "PremiumRate Percent TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberOfUnitsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Units')]/following::input"), "Number of Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		manufacturingUnitBelongsToWhichRiskGroupDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Manufacturing unit belongs')]/following::select"), "Manufacturing unit belongs to which risk Group", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingForAdverseFeatureTextField= new PageElement(By.xpath("//td//div[contains(text(),'Adverse feature')]/following::input"), "Loading (%) for Adverse feature", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		compulsoryExcessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess')]/following::input"), "Compulsory Excess", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		multiplierForAOATextField= new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for AOA')]/following::input"), "Multiplier for AOA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		multiplierForUnitsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for Units')]/following::input"), "Multiplier for Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		multiplierForAOANextTextField= new PageElement(By.xpath("//td//div[contains(text(),'Multiplier for AOA Next')]/following::input"), "Multiplier for AOA Next", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentAOANextTextField= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA) Next')]/following::input"), "Any One Accident (AOA) Next", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//PL
		paidUpCapitalTextField=new PageElement(By.xpath("//td//div[contains(text(),'Paid up Capital')]/following::input"), "paid Up Capital Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		noOfLocationsInvolved=new PageElement(By.xpath("//td//div[contains(text(),'No Of Locations Involved')]/following::input"), "paid Up Capital Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForLocationCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Location covered')]/following::select"), "Options for Location coveredText Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		annualTurnoverPreviousYear=new PageElement(By.xpath("//td//div[contains(text(),'Annual Turnover - Previous Year')]/following::input"), "Annual Turnover - Previous Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		annualTurnoverProposedYear=new PageElement(By.xpath("//td//div[contains(text(),'Annual Turnover - Proposed Year')]/following::input"), "paid Up Capital Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfWorkmen=new PageElement(By.xpath("//td//div[contains(text(),'No of workmen')]/following::input"), "No of workmen Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfOtherEmployee=new PageElement(By.xpath("//td//div[contains(text(),'No of Other Employee')]/following::input"), "No of Other Employee Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumRatePerMili=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate (per mili)')]/following::input"), "Premium Rate (per mili) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnTurnoverProposedYear=new PageElement(By.xpath("//td//div[contains(text(),'Loading on Turnover - Proposed Year')]/following::input"), "Loading on Turnover - Proposed Year Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//pp
		dODeductibleForIndiaOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'D&O Deductible for India1')]/following::input"), "D&O Deductible for India1 Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		manufacturingUnitDetailsGroup1Button = new PageElement(By.xpath("//td//div[contains(text(),'Manufacturing Unit Details - Group1')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		companyReimbursemntDeductibleForIndiaOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Company Reimbursement Deductible for India1')]/following::input"), "Company Reimbursement Deductible for India1 Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		serialNoLabel= new PageElement(By.name("slNo0"), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfManufacturingUnitDropDown= new PageElement(By.xpath("//td//b[contains(text(),'Type of Manufacturing unit')]/following::select"), "Type of Manufacturing unit DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		annualTurnoverPreviousYear1TextField= new PageElement(By.name("Data_253138919012011_0"), "annualTurnoverPreviousYear1 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		annualTurnoverProposedYear1TextField= new PageElement(By.name("Data_253139019012011_0"), "annualTurnoverProposedYear1 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//PD
		doesthepolicycoversexportsonlyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Does the policy covers exports only')]/following::select"), "Number of Units", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vendorsLiabilityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Vendors Liability')]/following::select"), "Vendors Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofVendorDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Vendor')]/following::select"), "Type of Vendor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingPerctofVendorTextField= new PageElement(By.xpath("//td//div[contains(text(),'Loading(%) of Vendor')]/following::input"), "Loading(%) of Vendor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameofVendorsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of Vendors')]/following::input"), "Name of Vendors", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addressofVendorsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Address of Vendors')]/following::input"), "Address of Vendors", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		productDetailsButton= new PageElement(By.name("propValues7"), "Product Details Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		productDescriptionTextField			= new PageElement(By.name("Data_253106819012011_0"), "product Description", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		domesticTurnoverforpreviousYearTextField	= new PageElement(By.name("Data_253194719012011_0"), "domestic Turnover for previous Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		domesticTurnoverforCurrentYearTextField		= new PageElement(By.name("Data_253194819012011_0"), "domestic Turnover for Current Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		uSACanadaTurnoverforpreviousYearTextField	= new PageElement(By.name("Data_253194919012011_0"), "uSA Canada Turnover for previous Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		uSACanadaTurnoverforCurrentYearTextField	= new PageElement(By.name("Data_253195019012011_0"), "uSA Canada Turnover for Current Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nonOECDTurnoverforpreviousyearTextField		= new PageElement(By.name("Data_253195119012011_0"), "non OECD Turnover for previous year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nonOECDTurnoverforCurrentYearTextField		= new PageElement(By.name("Data_253195219012011_0"), "non OECD Turnover for Current Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		oECDTurnoverforpreviousYearTextField		= new PageElement(By.name("Data_253195319012011_0"), "oECD Turnover for previous Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		oECDTurnoverforCurrentYearTextField		= new PageElement(By.name("Data_253195419012011_0"), "oECD Turnover for Current Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumRatePerMilliTextField			= new PageElement(By.name("Data_253195519012011_0"), "premium Rate Per Milli", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		//WC
		tradeDescriptionTextField=new PageElement(By.name("propValues1"), "Trade Description TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		particularOfWorksTextField=new PageElement(By.name("propValues2"), "Particular of Works TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		locationDetailsTextField=new PageElement(By.name("propValues3"), "Location details TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButton=new PageElement(By.name("btnDel"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButton=new PageElement(By.name("btnAdd"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveManufacturingUnitDetailsButton=new PageElement(By.name("btnSave"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton=new PageElement(By.name("btnClose"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noofEmployeeTextField=new PageElement(By.name("Data_253202219012011_"+rowcount+""), "No of Employee TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		categorieDropDown=new PageElement(By.name("Data_253219919012011_"+rowcount+""), "Categorie  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subCategorieFindButton= new PageElement(By.xpath("//td//b[contains(text(),'Sub Categorie')]/following::input/following::a[@name='firstFocus']"), "Policy Start Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		subCategorieLinkTextField= new PageElement(By.xpath("//td/a[contains(text(),'Advertisement Contractors Bill Posters and Distributors')]"), "subCategorieLinkTextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cashTotalWagesTextField=new PageElement(By.name("Data_253255819012011_"+rowcount+""), "Cash Total Wages TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tableOptedDropDown=new PageElement(By.name("Data_253255919012011_"+rowcount+""), "Table Opted  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hasThePolicybeenspeciallyratedDropDown=new PageElement(By.name("Data_253256219012011_"+rowcount+""), "Has the Policy been specially rated? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		thecompetentauthoritywhohassanctionedthespecialratingDropDown=new PageElement(By.name("Data_253256519012011_"+rowcount+""), "The competent authority who has sanctioned the special rating DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumRatepermiliTextField=new PageElement(By.name("Data_253140319012011_"+rowcount+""), "Premium Rate (per mili) TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		openUptoButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'Employees with monthly wages upto Rs 8000')]/following::input"), "Employees with monthly wages upto Rs 8000", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openAboveButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'Employees with monthly wages above Rs 8000')]/following::input"), "Employees with monthly wages above Rs 8000", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//rateBasisForWagesAbove8000DropDown=new PageElement(By.name("propValues6"), "Rate Basis for Wages Above 8000  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//includeAllSubContractorDropDown=new PageElement(By.name("propValues7"), "Include All Sub-Contractor DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		openSubContractorDetailsButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'Sub Contractor Details')]/following::input"), "Sub Contractor Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameofcontractorTextField=new PageElement(By.name("Data_3415109072001_"+rowcount+""), "Name of contractor TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionTextField=new PageElement(By.name("Data_886610042001_"+rowcount+""), "Description TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subCategorieTextField=new PageElement(By.name("Data_253255719012011_"+rowcount+""), "Sub Categorie TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noofWorkersSkilledTextField=new PageElement(By.name("Data_253259919012011_"+rowcount+""), "No. of Workers - Skilled TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noofWorkersUnSkilledTextField=new PageElement(By.name("Data_253260019012011_"+rowcount+""), "No. of Workers - UnSkilled TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noofWorkersOthersTextField=new PageElement(By.name("Data_253260119012011_"+rowcount+""), "No. of Workers - Others TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		amountWagesTextField=new PageElement(By.name("Data_253260219012011_"+rowcount+""), "Amount Wages TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		milliRateTextField=new PageElement(By.name("Data_253260319012011_"+rowcount+""), "Milli Rate TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//allPersonsinServiceDropDown=new PageElement(By.name("propValues9"), "All Persons in Service DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		anyOneAccidentAOA2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)2')]/following::input"), "Any One Accident (AOA)2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentAOA3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)3')]/following::input"), "Any One Accident (AOA)3", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentAOA4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)4')]/following::input"), "Any One Accident (AOA)4", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneAccidentAOA5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Any One Accident (AOA)5')]/following::input"), "Any One Accident (AOA)5", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		aOAAOY2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY2')]/following::select"), "AOA : AOY2 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aOAAOY3DropDown=new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY3')]/following::select"), "AOA : AOY3 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aOAAOY4DropDown=new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY4')]/following::select"), "AOA : AOY4 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		aOAAOY5DropDown=new PageElement(By.xpath("//td//div[contains(text(),'AOA : AOY5')]/following::select"), "AOA : AOY5 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		anyOneYearAndInTheAggregateAOY2Label= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)2')]/following::input"), "Any One Year and in the Aggregate (AOY)2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneYearAndInTheAggregateAOY3Label= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)3')]/following::input"), "Any One Year and in the Aggregate (AOY)3", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneYearAndInTheAggregateAOY4Label= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)4')]/following::input"), "Any One Year and in the Aggregate (AOY)4", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		anyOneYearandInTheAggregateAOY5Label= new PageElement(By.xpath("//td//div[contains(text(),'Any One Year and in the Aggregate (AOY)5')]/following::input"), "Any One Year and in the Aggregate (AOY)5", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		deductibleType2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type2')]/following::select"), "Type2 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleType3DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type3')]/following::select"), "Type3 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleType4DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type4')]/following::select"), "Type4 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleType5DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type5')]/following::select"), "Type5 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		geographicalJurisdiction2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical Jurisdiction2')]/following::select"), "Geographical Jurisdiction2 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		geographicalJurisdiction2DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical Jurisdiction3')]/following::select"), "Geographical Jurisdiction3 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		geographicalJurisdiction4DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical Jurisdiction4')]/following::select"), "Geographical Jurisdiction4 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		geographicalJurisdiction5DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical Jurisdiction5')]/following::select"), "Geographical Jurisdiction5 DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		deductibleForIndia2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India2')]/following::input"), "Deductible for India2 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForIndia3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India3')]/following::input"), "Deductible for India3 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForIndia4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India4')]/following::input"), "Deductible for India4 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForIndia5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India5')]/following::input"), "Deductible for India5 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		EstimatedAnnualFeesTextField= new PageElement(By.xpath("//td//div[@id='Estimated Annual Fees']/following::input"), "Estimated Annual Fees Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// IT

		totalNumberOfPartnersDirectorsPrincipalTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total number of Partners/Directors/ Principal')]/following::input"), "Total number of Partners/Directors/ Principal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalNumberOfStaffsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total number of staffs')]/following::input"), "Total number of staffs", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		annualTotalGrossIncomeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Annual Total Gross Income')]/following::input"), "Annual Total Gross Income", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfProductsServicesTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of Products/Services')]/following::TextArea"), "Details of Products/Services", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//WCF
		rateBasisForWagesAbove8000DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Rate Basis for Wages Above 8000')]/following::select"), "Rate Basis for Wages Above 8000 Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		includeAllSubContractorDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Include All Sub-Contractor')]/following::select"), "Include All Sub-Contractor Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		allPersonsinServiceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'All Persons in Service')]/following::select"), "All Persons in Service Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);


		//LN
		typeOfConstructionLNDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Construction - LN')]/following::select"), "Type of Construction - LN DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleTypeLNDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deductible   Type1","select")), "Deductible Type1 DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//PF
		detailsOPfBusinessTextArea		=new PageElement(By.xpath("//td//div[contains(text(),'Details of Business')]/following::textarea"), "Details of Business", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		addressOfBusinessPremisesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Address of Business Premises')]/following::textarea"), "Address of Business Premises TextArea", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfProfessionDropDown		=new PageElement(By.xpath("//td//div[contains(text(),'Type of Profession')]/following::select"), "Type of Profession DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		perPersonLimitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Per Person Limit')]/following::input"), "Per Person Limit TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfPersonsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Persons')]/following::input"), "Number of Persons TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductiblePerPersonTextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible per person')]/following::input"), "Deductible Per Person TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		// IN
		deductibleForWorldwideExcludingUSAAndCanadaOneTextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for Worldwide (Excluding USA and Canada)1')]/following::input"), "Deductible for India2 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForWorldwideIncludingUSAAndCanadaOneTextField= new PageElement(By.xpath("//td//div[contains(text(),'Deductible for Worldwide (Including USA and Canada)1')]/following::input"), "Deductible for India2 TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		messageWindowClose=new PageElement(By.name("CloseWin"), "Message Window Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	//Services
	public void fillRiskDetailsFirstPage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOfCompanyOwnership")) {
				selectValueFromList(detailsOfCompanyOwnershipDropDown, riskDetailsFirstPageEntity.getStringValueForField("DetailsOfCompanyOwnership"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				clearAndSendKeys(anyOneAccidentAOATextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY")) {
				selectValueFromList(aOAAOYDropDown, riskDetailsFirstPageEntity.getStringValueForField("AOAAOY"));
			}
			//Non-Editable Field
			/*if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateAOYTextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY"));
			}*/
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateOne")) {
				if(riskDetailsFirstPageEntity.getStringValueForField("Product").equalsIgnoreCase("PF")){
					click(retroactiveDateOneFindButtonPF);
					Thread.sleep(1000);
					selectDateFromCalender(retroactiveDateOneFindButtonPF, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateOne"));
				}else{
					click(retroactiveDateOneFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(retroactiveDateOneFindButton, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateOne"));
				}
				switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType")) {
				selectValueFromList(deductibleType1DropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleType"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
				selectValueFromList(geographicalJurisdiction1DropDown, riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaOne")) {
				clearAndSendKeys(deductibleForIndiaOneTextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaOne"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCompanyReimbursementDeductibleForIndia")) {
				clearAndSendKeys(companyReimbursementDeductibleForIndia1TextField, riskDetailsFirstPageEntity.getStringValueForField("CompanyReimbursementDeductibleForIndia"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateSecond")) {
				click(retroactiveDateSecondFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDate2TextField, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateSecond"));
				switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateThird")) {
				click(retroactiveDateThirdFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDate3TextField, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateThird"));
				switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				click(retroactiveDateFourFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDate4TextField, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateFour"));
				switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				click(retroactiveDateFiveFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(retroactiveDate5TextField, riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateFive"));
				switchToFrame("display");
			}
			//CO
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIsItBlanketCoverForAllVehicles")) {
				selectValueFromList(isItBlanketCoverForAllVehiclesDropDown, riskDetailsFirstPageEntity.getStringValueForField("IsItBlanketCoverForAllVehicles"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfVehiclesWiderCover")) {
				clearAndSendKeys(numberOfVehiclesWiderCoverTextField, riskDetailsFirstPageEntity.getStringValueForField("NumberOfVehiclesWiderCover"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigVehicleDetails")) {
				fillVehicleDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}

			//CT
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfPolicyCT")) {
				selectValueFromList(typeOfPolicyCTDropDown, riskDetailsFirstPageEntity.getStringValueForField("TypeOfPolicyCT"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPerAccidentLimit")) {
				clearAndSendKeys(perAccidentLimitTextField, riskDetailsFirstPageEntity.getStringValueForField("PerAccidentLimit"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIsPerpersonLimitRequired")) {
				selectValueFromList(isPerpersonLimitRequiredDropDown, riskDetailsFirstPageEntity.getStringValueForField("IsPerpersonLimitRequired"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOptionsOfAggregateLimit")) {
				selectValueFromList(optionsOfAggregateLimitDropDown, riskDetailsFirstPageEntity.getStringValueForField("OptionsOfAggregateLimit"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAggregateLimit")) {
				clearAndSendKeys(aggregateLimitTextField, riskDetailsFirstPageEntity.getStringValueForField("AggregateLimit"));
			}
			//ST
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
				clearAndSendKeys(estimatedAnnualTurnoverTextField, riskDetailsFirstPageEntity.getStringValueForField("EstimatedAnnualTurnover"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumratePercent")) {
				clearAndSendKeys(premiumratePercentTextField, riskDetailsFirstPageEntity.getStringValueForField("PremiumratePercent"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPaidUpCapital")) {
				clearAndSendKeys(paidUpCapitalTextField, riskDetailsFirstPageEntity.getStringValueForField("PaidUpCapital"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfLocationsInvolved")) {
				clearAndSendKeys(noOfLocationsInvolved, riskDetailsFirstPageEntity.getStringValueForField("NoOfLocationsInvolved"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOptionsForLocationCovered")) {
				selectValueFromList(optionsForLocationCoveredDropDown, riskDetailsFirstPageEntity.getStringValueForField("OptionsForLocationCovered"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTurnoverPreviousYear")) {
				clearAndSendKeys(annualTurnoverPreviousYear, riskDetailsFirstPageEntity.getStringValueForField("AnnualTurnoverPreviousYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTurnoverProposedYear")) {
				clearAndSendKeys(annualTurnoverProposedYear, riskDetailsFirstPageEntity.getStringValueForField("AnnualTurnoverProposedYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfWorkmen")) {
				clearAndSendKeys(noOfWorkmen, riskDetailsFirstPageEntity.getStringValueForField("NoOfWorkmen"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfOtherEmployee")) {
				clearAndSendKeys(noOfOtherEmployee, riskDetailsFirstPageEntity.getStringValueForField("NoOfOtherEmployee"));
			}
			//WC
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTradeDescription")) {
				clearAndSendKeys(tradeDescriptionTextField, riskDetailsFirstPageEntity.getStringValueForField("TradeDescription"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigParticularOfWorks")) {
				clearAndSendKeys(particularOfWorksTextField, riskDetailsFirstPageEntity.getStringValueForField("ParticularOfWorks"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLocationdetails")) {
				clearAndSendKeys(locationDetailsTextField, riskDetailsFirstPageEntity.getStringValueForField("Locationdetails"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEmployeeswithMonthlyWagesUptoEightK")) {
				fillEmployeeswithMonthlyWagesUptoRs8000Page(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEmployeeswithMonthlyWagesAboveEightK")) {
				fillEmployeeswithMonthlyWagesAboveRs8000Page(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRateBasisforWagesAboveEightK")) {
				selectValueFromList(rateBasisForWagesAbove8000DropDown, riskDetailsFirstPageEntity.getStringValueForField("RateBasisforWagesAboveEightK"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIncludeAllSubContractor")) {
				selectValueFromList(includeAllSubContractorDropDown, riskDetailsFirstPageEntity.getStringValueForField("IncludeAllSubContractor"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubContractorDetails")) {
				fillSubContractorDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				clearAndSendKeys(premiumRatePerMili, riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMili"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingOnTurnoverProposedYear")) {
				clearAndSendKeys(loadingOnTurnoverProposedYear, riskDetailsFirstPageEntity.getStringValueForField("LoadingOnTurnoverProposedYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAllPersonsinService")) {
				selectValueFromList(allPersonsinServiceDropDown, riskDetailsFirstPageEntity.getStringValueForField("AllPersonsinService"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDODeductibleForIndiaOne")) {
				clearAndSendKeys(dODeductibleForIndiaOneTextField, riskDetailsFirstPageEntity.getStringValueForField("DODeductibleForIndiaOne"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCompanyReimbursemntDeductibleForIndiaOne")) {
				clearAndSendKeys(companyReimbursemntDeductibleForIndiaOneTextField, riskDetailsFirstPageEntity.getStringValueForField("CompanyReimbursemntDeductibleForIndiaOne"));
			}

			//IN

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfUnits")) {
				clearAndSendKeys(numberOfUnitsTextField, riskDetailsFirstPageEntity.getStringValueForField("NumberOfUnits"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufacturingUnitBelongsToWhichRiskGroup")) {
				selectValueFromList(manufacturingUnitBelongsToWhichRiskGroupDropDown, riskDetailsFirstPageEntity.getStringValueForField("ManufacturingUnitBelongsToWhichRiskGroup"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingForAdverseFeature")) {
				clearAndSendKeys(loadingForAdverseFeatureTextField, riskDetailsFirstPageEntity.getStringValueForField("LoadingForAdverseFeature"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				clearAndSendKeys(compulsoryExcessTextField, riskDetailsFirstPageEntity.getStringValueForField("CompulsoryExcess"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForAOA")) {
				clearAndSendKeys(multiplierForAOATextField, riskDetailsFirstPageEntity.getStringValueForField("MultiplierForAOA"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForUnits")) {
				clearAndSendKeys(multiplierForUnitsTextField, riskDetailsFirstPageEntity.getStringValueForField("MultiplierForUnits"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForAOANext")) {
				clearAndSendKeys(multiplierForAOANextTextField, riskDetailsFirstPageEntity.getStringValueForField("MultiplierForAOANext"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOANext")) {
				clearAndSendKeys(anyOneAccidentAOANextTextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOANext"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufacturingUnitDetailsGroup1")) {
				fillManufacturingUnitDetails(riskDetailsFirstPageEntity);								
			}
			// IN
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA2")) {

				clearAndSendKeys(anyOneAccidentAOA2TextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA2"));
				Thread.sleep(500);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY2")) {
				selectValueFromList(aOAAOY2DropDown, riskDetailsFirstPageEntity.getStringValueForField("AOAAOY2"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY2")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateAOY2Label, riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY2"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType2")) {
				selectValueFromList(deductibleType2DropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleType2"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction2")) {
				selectValueFromList(geographicalJurisdiction2DropDown, riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction2"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaTwo")) {
				clearAndSendKeys(deductibleForIndia2TextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaTwo"));
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanadaOne")) {
				clearAndSendKeys(deductibleForWorldwideExcludingUSAAndCanadaOneTextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanadaOne"));
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanadaOne")) {
				clearAndSendKeys(deductibleForWorldwideIncludingUSAAndCanadaOneTextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanadaOne"));
			}




			//PD
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDoesthepolicycoversexportsonly")) {
				selectValueFromList(doesthepolicycoversexportsonlyDropDown, riskDetailsFirstPageEntity.getStringValueForField("Doesthepolicycoversexportsonly"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA3")) {
				clearAndSendKeys(anyOneAccidentAOA3TextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA3"));
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY3")) {
				selectValueFromList(aOAAOY3DropDown, riskDetailsFirstPageEntity.getStringValueForField("AOAAOY3"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY3")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateAOY3Label, riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY3"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType3")) {
				selectValueFromList(deductibleType3DropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleType3"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction3")) {
				selectValueFromList(geographicalJurisdiction3DropDown, riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction3"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigVendorsLiability")) {
				selectValueFromList(vendorsLiabilityDropDown, riskDetailsFirstPageEntity.getStringValueForField("VendorsLiability"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeofVendor")) {
				selectValueFromList(typeofVendorDropDown, riskDetailsFirstPageEntity.getStringValueForField("TypeofVendor"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingPerctofVendor")) {
				clearAndSendKeys(loadingPerctofVendorTextField, riskDetailsFirstPageEntity.getStringValueForField("LoadingPerctofVendor"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNameofVendors")) {
				clearAndSendKeys(nameofVendorsTextField, riskDetailsFirstPageEntity.getStringValueForField("NameofVendors"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddressofVendors")) {
				clearAndSendKeys(addressofVendorsTextField, riskDetailsFirstPageEntity.getStringValueForField("AddressofVendors"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigProductDetailsButton")) {
				//Click On Open Button//
				clickOnOpenButtonProductDetails(riskDetailsFirstPageEntity);
				Thread.sleep(3000);
				fillProductDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaThree")) {
				clearAndSendKeys(deductibleForIndia3TextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaThree"));
			}


			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA4")) {

				clearAndSendKeys(anyOneAccidentAOA4TextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA4"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY4")) {
				selectValueFromList(aOAAOY4DropDown, riskDetailsFirstPageEntity.getStringValueForField("AOAAOY4"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY4")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateAOY4Label, riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY4"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType4")) {
				selectValueFromList(deductibleType4DropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleType4"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction4")) {
				selectValueFromList(geographicalJurisdiction4DropDown, riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction4"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaFour")) {
				clearAndSendKeys(deductibleForIndia4TextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaFour"));
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA5")) {
				clearAndSendKeys(anyOneAccidentAOA5TextField, riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA5"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY5")) {
				selectValueFromList(aOAAOY5DropDown, riskDetailsFirstPageEntity.getStringValueForField("AOAAOY5"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY5")) {
				clearAndSendKeys(anyOneYearandInTheAggregateAOY5Label, riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY5"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType5")) {
				selectValueFromList(deductibleType5DropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleType5"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction5")) {
				selectValueFromList(geographicalJurisdiction5DropDown, riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction5"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaFive")) {
				clearAndSendKeys(deductibleForIndia5TextField, riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaFive"));
			}

			// IT
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTotalNumberOfPartnersDirectorsPrincipal")) {
				clearAndSendKeys(totalNumberOfPartnersDirectorsPrincipalTextField, riskDetailsFirstPageEntity.getStringValueForField("TotalNumberOfPartnersDirectorsPrincipal"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTotalNumberOfStaffs")) {
				clearAndSendKeys(totalNumberOfStaffsTextField, riskDetailsFirstPageEntity.getStringValueForField("TotalNumberOfStaffs"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTotalGrossIncome")) {
				clearAndSendKeys(annualTotalGrossIncomeTextField, riskDetailsFirstPageEntity.getStringValueForField("AnnualTotalGrossIncome"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOfProductsServices")) {
				clearAndSendKeys(detailsOfProductsServicesTextArea, riskDetailsFirstPageEntity.getStringValueForField("DetailsOfProductsServices"));
			}
			// LN
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfConstructionLN")) {
				selectValueFromList(typeOfConstructionLNDropDown, riskDetailsFirstPageEntity.getStringValueForField("TypeOfConstructionLN"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleTypeLN")) {
				selectValueFromList(deductibleTypeLNDropDown, riskDetailsFirstPageEntity.getStringValueForField("DeductibleTypeLN"));
			}
			//PF
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOPfBusiness")) {
				clearAndSendKeys(detailsOPfBusinessTextArea, riskDetailsFirstPageEntity.getStringValueForField("DetailsOPfBusiness"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddressOfBusinessPremises")) {
				clearAndSendKeys(addressOfBusinessPremisesTextArea, riskDetailsFirstPageEntity.getStringValueForField("AddressOfBusinessPremises"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfProfession")) {
				clearAndSendKeys(typeOfProfessionDropDown, riskDetailsFirstPageEntity.getStringValueForField("TypeOfProfession"));
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPerPersonLimit")) {
				clearAndSendKeys(perPersonLimitTextField, riskDetailsFirstPageEntity.getStringValueForField("PerPersonLimit"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfPersons")) {
				clearAndSendKeys(numberOfPersonsTextField, riskDetailsFirstPageEntity.getStringValueForField("NumberOfPersons"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductiblePerPerson")) {
				clearAndSendKeys(deductiblePerPersonTextField, riskDetailsFirstPageEntity.getStringValueForField("DeductiblePerPerson"));
			}
		
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEstimatedAnnualFees")) {
				SelectValueAndTypeForTextField(EstimatedAnnualFeesTextField, riskDetailsFirstPageEntity.getStringValueForField("EstimatedAnnualFees"));
			}

		}
		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){
			switchToFrame("display");
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOfCompanyOwnership")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DetailsOfCompanyOwnership"), fetchValueFromTextFields(detailsOfCompanyOwnershipDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA"), fetchValueFromTextFields(anyOneAccidentAOATextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AOAAOY"), fetchValueFromTextFields(aOAAOYDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY"), fetchValueFromTextFields(anyOneYearAndInTheAggregateAOYTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateOne")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateOne")), fetchValueFromTextFields(retroactiveDate1TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleType"), fetchValueFromList(deductibleType1DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction"), fetchValueFromList(geographicalJurisdiction1DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaOne")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaOne"), fetchValueFromTextFields(deductibleForIndiaOneTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCompanyReimbursementDeductibleForIndia")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("CompanyReimbursementDeductibleForIndia"), fetchValueFromTextFields(companyReimbursementDeductibleForIndia1TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateSecond")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateSecond")), fetchValueFromTextFields(retroactiveDate2TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateThird")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateThird")), fetchValueFromTextFields(retroactiveDate3TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateFour")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateFour")), fetchValueFromTextFields(retroactiveDate4TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRetroactiveDateFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RetroactiveDateFive")), fetchValueFromTextFields(retroactiveDate5TextField),AssertionType.WARNING);
			}
			//CO
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIsItBlanketCoverForAllVehicles")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("IsItBlanketCoverForAllVehicles"), fetchValueFromTextFields(isItBlanketCoverForAllVehiclesDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfVehiclesWiderCover")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NumberOfVehiclesWiderCover"), fetchValueFromTextFields(numberOfVehiclesWiderCoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigVehicleDetails")) {
				fillVehicleDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}

			//CT
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfPolicyCT")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TypeOfPolicyCT"), fetchValueFromTextFields(typeOfPolicyCTDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPerAccidentLimit")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PerAccidentLimit"), fetchValueFromTextFields(perAccidentLimitTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIsPerpersonLimitRequired")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("IsPerpersonLimitRequired"), fetchValueFromTextFields(isPerpersonLimitRequiredDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOptionsOfAggregateLimit")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("OptionsOfAggregateLimit"), fetchValueFromTextFields(optionsOfAggregateLimitDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAggregateLimit")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AggregateLimit"), fetchValueFromTextFields(aggregateLimitTextField),AssertionType.WARNING);
			}
			//ST
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEstimatedAnnualTurnover")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("EstimatedAnnualTurnover"), fetchValueFromTextFields(estimatedAnnualTurnoverTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumratePercent")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PremiumratePercent"), fetchValueFromTextFields(premiumratePercentTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPaidUpCapital")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PaidUpCapital"), fetchValueFromTextFields(paidUpCapitalTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfLocationsInvolved")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoOfLocationsInvolved"), fetchValueFromTextFields(noOfLocationsInvolved),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOptionsForLocationCovered")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("OptionsForLocationCovered"), fetchValueFromTextFields(optionsForLocationCoveredDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTurnoverPreviousYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnnualTurnoverPreviousYear"), fetchValueFromTextFields(annualTurnoverPreviousYear),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTurnoverProposedYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnnualTurnoverProposedYear"), fetchValueFromTextFields(annualTurnoverProposedYear ),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfWorkmen")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoOfWorkmen"), fetchValueFromTextFields(noOfWorkmen),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoOfOtherEmployee")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoOfOtherEmployee"), fetchValueFromTextFields(noOfOtherEmployee),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMili"), fetchValueFromTextFields(premiumRatePerMili),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingOnTurnoverProposedYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("LoadingOnTurnoverProposedYear"), fetchValueFromTextFields(loadingOnTurnoverProposedYear),AssertionType.WARNING);
			}
			//WC
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTradeDescription")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TradeDescription"), fetchValueFromTextFields(tradeDescriptionTextField),AssertionType.WARNING);	
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigParticularOfWorks")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("ParticularOfWorks"), fetchValueFromTextFields(particularOfWorksTextField),AssertionType.WARNING);	
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLocationdetails")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Locationdetails"), fetchValueFromTextFields(locationDetailsTextField),AssertionType.WARNING);	
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEmployeeswithMonthlyWagesUptoEightK")) {
				fillEmployeeswithMonthlyWagesUptoRs8000Page(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigEmployeeswithMonthlyWagesAboveEightK")) {
				fillEmployeeswithMonthlyWagesAboveRs8000Page(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRateBasisforWagesAboveEightK")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("RateBasisforWagesAboveEightK"), fetchValueFromList(rateBasisForWagesAbove8000DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigIncludeAllSubContractor")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("IncludeAllSubContractor"), fetchValueFromList(includeAllSubContractorDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubContractorDetails")) {
				fillSubContractorDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAllPersonsinService")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AllPersonsinService"), fetchValueFromList(allPersonsinServiceDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDODeductibleForIndiaOne")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DODeductibleForIndiaOne"), fetchValueFromTextFields(dODeductibleForIndiaOneTextField),AssertionType.WARNING);
			}

			//PD
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDoesthepolicycoversexportsonly")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Doesthepolicycoversexportsonly"), fetchValueFromList(doesthepolicycoversexportsonlyDropDown), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigVendorsLiability")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("VendorsLiability"), fetchValueFromList(vendorsLiabilityDropDown), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeofVendor")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TypeofVendor"), fetchValueFromList(typeofVendorDropDown), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingPerctofVendor")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("LoadingPerctofVendor"), fetchValueFromFields(loadingPerctofVendorTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNameofVendors")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NameofVendors"), fetchValueFromTextFields(nameofVendorsTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddressofVendors")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AddressofVendors"), fetchValueFromTextFields(addressofVendorsTextField), AssertionType.WARNING);
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigProductDetailsButton")) {
				//Click On Open Button//
				clickOnOpenButtonProductDetails(riskDetailsFirstPageEntity);
				Thread.sleep(3000);
				fillProductDetailsPage(riskDetailsFirstPageEntity, assertReference);
			}
			//IN
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfUnits")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NumberOfUnits"), fetchValueFromTextFields(numberOfUnitsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufacturingUnitBelongsToWhichRiskGroup")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("ManufacturingUnitBelongsToWhichRiskGroup"), fetchValueFromTextFields(manufacturingUnitBelongsToWhichRiskGroupDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoadingForAdverseFeature")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("LoadingForAdverseFeature"), fetchValueFromTextFields(loadingForAdverseFeatureTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("CompulsoryExcess"), fetchValueFromTextFields(compulsoryExcessTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForAOA")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("MultiplierForAOA"), fetchValueFromTextFields(multiplierForAOATextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForUnits")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("MultiplierForUnits"), fetchValueFromTextFields(multiplierForUnitsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMultiplierForAOANext")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("MultiplierForAOANext"), fetchValueFromTextFields(multiplierForAOANextTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOANext")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOANext"), fetchValueFromTextFields(anyOneAccidentAOANextTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA2")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA2"), fetchValueFromTextFields(anyOneAccidentAOA2TextField),AssertionType.WARNING);

			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanadaOne")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanadaOne"), fetchValueFromTextFields(deductibleForWorldwideExcludingUSAAndCanadaOneTextField),AssertionType.WARNING);

			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanadaOne")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanadaOne"), fetchValueFromTextFields(deductibleForWorldwideIncludingUSAAndCanadaOneTextField),AssertionType.WARNING);

			}



			// IN
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY2")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AOAAOY2"), fetchValueFromTextFields(aOAAOY2DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY2")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY2"), fetchValueFromTextFields(anyOneYearAndInTheAggregateAOY2Label),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType2")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleType2"), fetchValueFromTextFields(deductibleType2DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction2")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction2"), fetchValueFromTextFields(geographicalJurisdiction2DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaTwo")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaTwo"), fetchValueFromTextFields(deductibleForIndia2TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA3")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA3"), fetchValueFromTextFields(anyOneAccidentAOA3TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY3")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AOAAOY3"), fetchValueFromTextFields(aOAAOY3DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY3")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY3"), fetchValueFromTextFields(anyOneYearAndInTheAggregateAOY3Label),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType3")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleType3"), fetchValueFromTextFields(deductibleType3DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction3")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction3"), fetchValueFromTextFields(geographicalJurisdiction3DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaThree")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaThree"), fetchValueFromTextFields(deductibleForIndia3TextField),AssertionType.WARNING);
			}

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA4")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA4"), fetchValueFromTextFields(anyOneAccidentAOA4TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY4")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AOAAOY4"), fetchValueFromTextFields(aOAAOY4DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY4")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY4"), fetchValueFromTextFields(anyOneYearAndInTheAggregateAOY4Label),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType4")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleType4"), fetchValueFromTextFields(deductibleType4DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction4")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction4"), fetchValueFromTextFields(geographicalJurisdiction4DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaFour")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaFour"), fetchValueFromTextFields(deductibleForIndia4TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneAccidentAOA5")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneAccidentAOA5"), fetchValueFromTextFields(anyOneAccidentAOA5TextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAOAAOY5")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AOAAOY5"), fetchValueFromTextFields(aOAAOY5DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregateAOY5")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnyOneYearAndInTheAggregateAOY5"), fetchValueFromTextFields(anyOneYearandInTheAggregateAOY5Label),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleType5")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleType5"), fetchValueFromTextFields(deductibleType5DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigGeographicalJurisdiction5")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("GeographicalJurisdiction5"), fetchValueFromTextFields(geographicalJurisdiction5DropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleForIndiaFive")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleForIndiaFive"), fetchValueFromTextFields(deductibleForIndia4TextField),AssertionType.WARNING);
			}
			// IT
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTotalNumberOfPartnersDirectorsPrincipal")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TotalNumberOfPartnersDirectorsPrincipal"), fetchValueFromTextFields(totalNumberOfPartnersDirectorsPrincipalTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTotalNumberOfStaffs")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TotalNumberOfStaffs"), fetchValueFromTextFields(totalNumberOfStaffsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAnnualTotalGrossIncome")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AnnualTotalGrossIncome"), fetchValueFromTextFields(annualTotalGrossIncomeTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOfProductsServices")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DetailsOfProductsServices"), fetchValueFromTextFields(detailsOfProductsServicesTextArea),AssertionType.WARNING);
			}

			// LN
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfConstructionLN")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TypeOfConstructionLN"), fetchValueFromTextFields(typeOfConstructionLNDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductibleTypeLN")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductibleTypeLN"), fetchValueFromList(deductibleTypeLNDropDown),AssertionType.WARNING);
			}
			//PF

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDetailsOPfBusiness")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DetailsOPfBusiness"), fetchValueFromTextFields(detailsOPfBusinessTextArea),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddressOfBusinessPremises")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AddressOfBusinessPremises"), fetchValueFromTextFields(addressOfBusinessPremisesTextArea),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfProfession")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TypeOfProfession"), fetchValueFromList(typeOfProfessionDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPerPersonLimit")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PerPersonLimit"), fetchValueFromTextFields(perPersonLimitTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfPersons")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NumberOfPersons"), fetchValueFromTextFields(numberOfPersonsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeductiblePerPerson")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DeductiblePerPerson"), fetchValueFromTextFields(deductiblePerPersonTextField),AssertionType.WARNING);
			}

		}
	}


	public void clickOnOpenButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			try{
				Thread.sleep(3000);
				switchToWindow("'Vehicle Details' Details");	
			}  
			catch (Exception e){
				switchToWindow("'Vehicle Details' Details");
			}
		}
	}

	private void clickOnAddWindowButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddButton")){	
			Thread.sleep(3000);
			click(addWindowButton);
			try{
				Thread.sleep(3000);
				switchToFrame("display");
			}catch (Exception e){}
		}
	}

	public void fillVehicleDetailsPage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){
			//Click On Open Button//
			clickOnOpenButton(riskDetailsFirstPageEntity);
			Thread.sleep(3000);
			clickOnAddWindowButton(riskDetailsFirstPageEntity);
			Thread.sleep(3000);

			/*if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSerialNo")) {
				clearAndSendKeys(serialNoTextField, riskDetailsFirstPageEntity.getStringValueForField("SerialNo"));
			}*/
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAgeOfTheVehicle")) {
				clearAndSendKeys(ageOfTheVehicleTextField, riskDetailsFirstPageEntity.getStringValueForField("AgeOfTheVehicle"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAreaOfOperation")) {
				clearAndSendKeys(areaOfOperationTextArea, riskDetailsFirstPageEntity.getStringValueForField("AreaOfOperation"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRegistrationNumberOfVehicle")) {
				clearAndSendKeys(registrationNumberOfVehicleTextField, riskDetailsFirstPageEntity.getStringValueForField("RegistrationNumberOfVehicle"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRegistrationDate")) {
				String dateOfApplication=RandomCodeGenerator.dateGenerator(riskDetailsFirstPageEntity.getStringValueForField("RegistrationDate"));
				clearAndEnterDate(registrationDateTextField, dateOfApplication);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCarryingCapacityTons")) {
				clearAndSendKeys(carryingCapacityTonsTextField, riskDetailsFirstPageEntity.getStringValueForField("CarryingCapacityTons"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigBodyType")) {
				selectValueFromList(bodyTypeDropDown, riskDetailsFirstPageEntity.getStringValueForField("BodyType"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfTrailers")) {
				clearAndSendKeys(numberOfTrailersTextField, riskDetailsFirstPageEntity.getStringValueForField("NumberOfTrailers"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigWhetherRefrigerated")) {
				selectValueFromList(whetherRefrigeratedDropDown, riskDetailsFirstPageEntity.getStringValueForField("WhetherRefrigerated"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRefrigeratedPremium")) {
				clearAndSendKeys(refrigeratedPremiumTextField, riskDetailsFirstPageEntity.getStringValueForField("RefrigeratedPremium"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoLLimitOfLiabilityLoadingRate")) {
				clearAndSendKeys(loLLimitOfLiabilityLoadingRateTextField, riskDetailsFirstPageEntity.getStringValueForField("LoLLimitOfLiabilityLoadingRate"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNatureOfGoodsCO")) {
				selectValueFromList(natureOfGoodsCODropDown, riskDetailsFirstPageEntity.getStringValueForField("NatureOfGoodsCO"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSkillOfTheDriver")) {
				clearAndSendKeys(skillOfTheDriverTextArea, riskDetailsFirstPageEntity.getStringValueForField("SkillOfTheDriver"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLogBookMaintenance")) {
				selectValueFromList(logBookMaintenanceDropDown, riskDetailsFirstPageEntity.getStringValueForField("LogBookMaintenance"));
			}
		}	

		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAgeOfTheVehicle")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AgeOfTheVehicle"), fetchValueFromTextFields(ageOfTheVehicleTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAreaOfOperation")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AreaOfOperation"), fetchValueFromTextFields(areaOfOperationTextArea),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRegistrationNumberOfVehicle")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("RegistrationNumberOfVehicle"), fetchValueFromTextFields(registrationNumberOfVehicleTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRegistrationDate")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("RegistrationDate"), fetchValueFromTextFields(registrationDateTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCarryingCapacityTons")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("CarryingCapacityTons"), fetchValueFromTextFields(carryingCapacityTonsTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigBodyType")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("BodyType"), fetchValueFromTextFields(bodyTypeDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNumberOfTrailers")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NumberOfTrailers"), fetchValueFromTextFields(numberOfTrailersTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigWhetherRefrigerated")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("WhetherRefrigerated"), fetchValueFromTextFields(whetherRefrigeratedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRefrigeratedPremium")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("RefrigeratedPremium"), fetchValueFromTextFields(refrigeratedPremiumTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoLLimitOfLiabilityLoadingRate")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("LoLLimitOfLiabilityLoadingRate"), fetchValueFromTextFields(loLLimitOfLiabilityLoadingRateTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNatureOfGoodsCO")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NatureOfGoodsCO"), fetchValueFromTextFields(natureOfGoodsCODropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSkillOfTheDriver")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SkillOfTheDriver"), fetchValueFromTextFields(skillOfTheDriverTextArea),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLogBookMaintenance")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("LogBookMaintenance"), fetchValueFromTextFields(logBookMaintenanceDropDown),AssertionType.WARNING);
			}

		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			clickOnSaveWindowButton(riskDetailsFirstPageEntity);

		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){	
			clickOnCloseWindowButton(riskDetailsFirstPageEntity);
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){	
			clickOnDeleteWindowButton(riskDetailsFirstPageEntity);
			switchToFrame("display");
		}
	}

	public void fillProductDetailsPage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){

			clickOnAddWindowButton(riskDetailsFirstPageEntity);
			Thread.sleep(3000);
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigProductDescription")) {
				selectValueFromList(productDescriptionTextField, riskDetailsFirstPageEntity.getStringValueForField("ProductDescription"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDomesticTurnoverforpreviousYear")) {
				clearAndSendKeys(domesticTurnoverforpreviousYearTextField, riskDetailsFirstPageEntity.getStringValueForField("DomesticTurnoverforpreviousYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDomesticTurnoverforCurrentYear")) {
				clearAndSendKeys(domesticTurnoverforCurrentYearTextField, riskDetailsFirstPageEntity.getStringValueForField("DomesticTurnoverforCurrentYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigUSACanadaTurnoverforpreviousYear")) {
				clearAndSendKeys(uSACanadaTurnoverforpreviousYearTextField, riskDetailsFirstPageEntity.getStringValueForField("USACanadaTurnoverforpreviousYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigUSACanadaTurnoverforCurrentYear")) {
				clearAndSendKeys(uSACanadaTurnoverforCurrentYearTextField, riskDetailsFirstPageEntity.getStringValueForField("USACanadaTurnoverforCurrentYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNonOECDTurnoverforpreviousyear")) {
				clearAndSendKeys(nonOECDTurnoverforpreviousyearTextField, riskDetailsFirstPageEntity.getStringValueForField("NonOECDTurnoverforpreviousyear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNonOECDTurnoverforCurrentYear")) {
				clearAndSendKeys(nonOECDTurnoverforCurrentYearTextField, riskDetailsFirstPageEntity.getStringValueForField("NonOECDTurnoverforCurrentYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOECDTurnoverforpreviousYear")) {
				clearAndSendKeys(oECDTurnoverforpreviousYearTextField, riskDetailsFirstPageEntity.getStringValueForField("OECDTurnoverforpreviousYear"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOECDTurnoverforCurrentYear")) {
				clearAndSendKeys(oECDTurnoverforCurrentYearTextField, riskDetailsFirstPageEntity.getStringValueForField("OECDTurnoverforCurrentYear"));
			}
			//if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMilli")) {
			//    clearAndSendKeys(premiumRatePerMilliTextField, riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMilli"));
			//}
		}
		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigProductDescription")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("ProductDescription"), fetchValueFromList(productDescriptionTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDomesticTurnoverforpreviousYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DomesticTurnoverforpreviousYear"), fetchValueFromTextFields(domesticTurnoverforpreviousYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDomesticTurnoverforCurrentYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("DomesticTurnoverforCurrentYear"), fetchValueFromTextFields(domesticTurnoverforCurrentYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigUSACanadaTurnoverforpreviousYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("USACanadaTurnoverforpreviousYear"), fetchValueFromTextFields(uSACanadaTurnoverforpreviousYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigUSACanadaTurnoverforCurrentYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("USACanadaTurnoverforCurrentYear"), fetchValueFromTextFields(uSACanadaTurnoverforCurrentYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNonOECDTurnoverforpreviousyear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NonOECDTurnoverforpreviousyear"), fetchValueFromTextFields(nonOECDTurnoverforpreviousyearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNonOECDTurnoverforCurrentYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NonOECDTurnoverforCurrentYear"), fetchValueFromTextFields(nonOECDTurnoverforCurrentYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOECDTurnoverforpreviousYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("OECDTurnoverforpreviousYear"), fetchValueFromTextFields(oECDTurnoverforpreviousYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOECDTurnoverforCurrentYear")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("OECDTurnoverforCurrentYear"), fetchValueFromTextFields(oECDTurnoverforCurrentYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMilli")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMilli"), fetchValueFromTextFields(premiumRatePerMilliTextField), AssertionType.WARNING);
			}
		}

		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			clickOnSaveWindowButton(riskDetailsFirstPageEntity);
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){	
			clickOnCloseWindowButton(riskDetailsFirstPageEntity);
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){	
			clickOnDeleteWindowButton(riskDetailsFirstPageEntity);
			switchToFrame("display");
		}

	}

	public void clickOnOpenButtonProductDetails(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOpenButton")){
			Thread.sleep(3000);
			click(productDetailsButton);
			try{
				Thread.sleep(3000);
				switchToWindow("'Product Details' Details");	
			}  
			catch (Exception e){
				switchToWindow("'Product Details' Details");
			}
		}
	}

	private void clickOnSaveWindowButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){		
			click(saveWindowButton);
			try{
				switchToFrame("display");
			}catch (Exception e){}
		}
	}

	private void clickOnCloseWindowButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){		
			click(closeWindowButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Policy Property Details");
			}catch(Exception e){
				switchToWindow("Policy Property Details");
			}
			try{
				switchToFrame("display");
			}catch (Exception e){}

		}	
	}

	private void clickOnDeleteWindowButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){		
			click(deleteWindowButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}

	public void navigateToInsuredInterest(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void clickOnNextButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwardButton);

			if(riskDetailsFirstPageEntity.getStringValueForField("Product").equalsIgnoreCase("IN")){
				try{
					
					switchToWindow("Message Window");
					//switchToFrame("display");
					click(messageWindowClose);	
					switchToWindow("Integrated Insurance Management System");
					switchToFrame("display");
				}
				catch(Exception e){
				}
			}
			switchToFrame("display");
			riskDetailsOneDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+riskDetailsFirstPageEntity.getStringValueForField("RiskDetailsFirstPageTitle")+"')]"), "Next Page Title After Risk Details One Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskDetailsOneDetailsPageTitle);
		}
	}

	public void clickOnManufacturingOpenButton(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufacturingOpenButton")){
			click(manufacturingUnitDetailsGroup1Button);
			switchToWindow("Manufacturing Unit Details - Group1' Details");
		}
	}

	public void fillManufacturingUnitDetails(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{

		clickOnManufacturingOpenButton(riskDetailsFirstPageEntity);
		Thread.sleep(1000);
		//Table - Parameter List for Installment Percentage List
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufacturingWindowAddButton")){
			click(addButton);
		}		
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTypeOfManufacturingUnit")){
			selectValueFromList(typeOfManufacturingUnitDropDown,riskDetailsFirstPageEntity.getStringValueForField("TypeOfManufacturingUnit") );
		}
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufactAnnualTurnoverPreviousYear")){
			clearAndSendKeys(annualTurnoverPreviousYear1TextField,riskDetailsFirstPageEntity.getStringValueForField("ManufactAnnualTurnoverPreviousYear") );
		}
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigManufactAnnualTurnoverProposedYear")){
			clearAndSendKeys(annualTurnoverProposedYear1TextField, riskDetailsFirstPageEntity.getStringValueForField("ManufactAnnualTurnoverProposedYear"));
		}

		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDelete")){
			click(deleteButton);
		}
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAdd")){
			click(addButton);
		}
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSave")){
			click(saveManufacturingUnitDetailsButton);
		}
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigClose")){
			click(closeButton);
		}
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");


		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveManufacturingUnitDetailsButton")){	
			click(saveManufacturingUnitDetailsButton);
			click(closeButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			//isElementDisplayed(cEPolicyDetailsTitle);
		}
	}



	public void fillEmployeeswithMonthlyWagesUptoRs8000Page(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){


			//Click On Open Button//
			clickOnOpenButtonWCUp(riskDetailsFirstPageEntity);
			clickOnAddWindowButton(riskDetailsFirstPageEntity);
			//clickOnAddWindowButtonWC(riskDetailsFirstPageEntity);
			//Thread.sleep(3000);

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofEmployee")) {
				clearAndSendKeys(noofEmployeeTextField, riskDetailsFirstPageEntity.getStringValueForField("NoofEmployee"));
			} 
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				selectValueFromList(categorieDropDown, riskDetailsFirstPageEntity.getStringValueForField("Categorie"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorie")) {
				int TableRowNumber = riskDetailsFirstPageEntity.getIntegerValueForField("TableRowNumber");
				int datarow = TableRowNumber + 2;
				subCategorieFindButton= new PageElement(By.xpath("//tr["+datarow+"]//a/img"), "Policy Start Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(subCategorieFindButton);

				Thread.sleep(1000);

				switchToWindow("Property Search List");
				subCategorieLinkTextField=new PageElement(By.xpath("//td/a[contains(text(),'"+riskDetailsFirstPageEntity.getStringValueForField("SubCategorie")+"')]"), "sub Categorie Link TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(subCategorieLinkTextField);

				switchToWindow("'Employees with monthly wages upto Rs 8000' Details");
				//switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCashTotalWages")) {
				clearAndSendKeys(cashTotalWagesTextField, riskDetailsFirstPageEntity.getStringValueForField("CashTotalWages"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTableOpted")) {
				selectValueFromList(tableOptedDropDown, riskDetailsFirstPageEntity.getStringValueForField("TableOpted"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigHasthePolicybeenspeciallyrated")) {
				selectValueFromList(hasThePolicybeenspeciallyratedDropDown, riskDetailsFirstPageEntity.getStringValueForField("HasthePolicybeenspeciallyrated"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTheCompetentAuthority")) {
				selectValueFromList(thecompetentauthoritywhohassanctionedthespecialratingDropDown, riskDetailsFirstPageEntity.getStringValueForField("TheCompetentAuthority"));
			}
			/*if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRate(permili)")) {
				clearAndSendKeys(premiumRatepermiliTextField, riskDetailsFirstPageEntity.getStringValueForField("PremiumRate(permili)"));
			}*/
		}		
		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofEmployee")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoofEmployee"), fetchValueFromTextFields(noofEmployeeTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Categorie"), fetchValueFromTextFields(categorieDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SubCategorie"), fetchValueFromTextFields(subCategorieFindButton),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCashTotalWages")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("CashTotalWages"), fetchValueFromTextFields(cashTotalWagesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTableOpted")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TableOpted"), fetchValueFromTextFields(tableOptedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigHasthePolicybeenspeciallyrated")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("HasthePolicybeenspeciallyrated"), fetchValueFromTextFields(hasThePolicybeenspeciallyratedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTheCompetentAuthority")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TheCompetentAuthority"), fetchValueFromTextFields(thecompetentauthoritywhohassanctionedthespecialratingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMili"), fetchValueFromTextFields(premiumRatepermiliTextField),AssertionType.WARNING);
			}
		}

		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){	
			clickOnDeleteWindowButton(riskDetailsFirstPageEntity);
			switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			clickOnSaveWindowButton(riskDetailsFirstPageEntity);
			//	switchToWindow();
			//	switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){	
			clickOnCloseWindowButtonWC(riskDetailsFirstPageEntity);
		}


	}        



	public void clickOnOpenButtonWCUp(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openUptoButton);
			try{
				Thread.sleep(3000);
				switchToWindow("'Employees with monthly wages upto Rs 8000' Details");	
			}  
			catch (Exception e){
				switchToWindow("'Employees with monthly wages upto Rs 8000' Details");
			}
		}
	}

	/*private void clickOnAddWindowButtonWC(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity){
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAddButtonWC")){	
			click(addWindowButton);
		}
	}*/

	private void clickOnCloseWindowButtonWC(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException {
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){		
			click(closeWindowButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Underwriting Menu");
			}catch(Exception e){
				switchToWindow("Underwriting Menu");
			}
			try{
				switchToFrame("display");
			}catch (Exception e){}

		}	
	}

	public void fillEmployeeswithMonthlyWagesAboveRs8000Page(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){


			//Click On Open Button//
			clickOnOpenButtonWCAb(riskDetailsFirstPageEntity);
			clickOnAddWindowButton(riskDetailsFirstPageEntity);
			//clickOnAddWindowButtonWC(riskDetailsFirstPageEntity);
			//Thread.sleep(3000);

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofEmployee")) {
				clearAndSendKeys(noofEmployeeTextField, riskDetailsFirstPageEntity.getStringValueForField("NoofEmployee"));
			} 
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				selectValueFromList(categorieDropDown, riskDetailsFirstPageEntity.getStringValueForField("Categorie"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorie")) {
				int TableRowNumber = riskDetailsFirstPageEntity.getIntegerValueForField("TableRowNumber");
				int datarow = TableRowNumber + 2;
				subCategorieFindButton= new PageElement(By.xpath("//tr["+datarow+"]//a/img"), "Sub Categorie Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(subCategorieFindButton);

				Thread.sleep(1000);

				switchToWindow("Property Search List");
				subCategorieLinkTextField=new PageElement(By.xpath("//td/a[contains(text(),'"+riskDetailsFirstPageEntity.getStringValueForField("SubCategorie")+"')]"), "sub Categorie Link TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(subCategorieLinkTextField);

				switchToWindow("'Employees with monthly wages above Rs 8000' Details");
				//switchToFrame("display");
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCashTotalWagesAbove")) {
				clearAndSendKeys(cashTotalWagesTextField, riskDetailsFirstPageEntity.getStringValueForField("CashTotalWagesAbove"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTableOpted")) {
				selectValueFromList(tableOptedDropDown, riskDetailsFirstPageEntity.getStringValueForField("TableOpted"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigHasthePolicybeenspeciallyrated")) {
				selectValueFromList(hasThePolicybeenspeciallyratedDropDown, riskDetailsFirstPageEntity.getStringValueForField("HasthePolicybeenspeciallyrated"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTheCompetentAuthority")) {
				selectValueFromList(thecompetentauthoritywhohassanctionedthespecialratingDropDown, riskDetailsFirstPageEntity.getStringValueForField("TheCompetentAuthority"));
			}
			/*if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRate(permili)")) {
				clearAndSendKeys(premiumRatepermiliTextField, riskDetailsFirstPageEntity.getStringValueForField("PremiumRate(permili)"));
			}*/
		}		
		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofEmployee")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoofEmployee"), fetchValueFromTextFields(noofEmployeeTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Categorie"), fetchValueFromTextFields(categorieDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SubCategorie"), fetchValueFromTextFields(subCategorieFindButton),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCashTotalWages")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("CashTotalWages"), fetchValueFromTextFields(cashTotalWagesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTableOpted")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TableOpted"), fetchValueFromTextFields(tableOptedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigHasthePolicybeenspeciallyrated")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("HasthePolicybeenspeciallyrated"), fetchValueFromTextFields(hasThePolicybeenspeciallyratedDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigTheCompetentAuthority")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("TheCompetentAuthority"), fetchValueFromTextFields(thecompetentauthoritywhohassanctionedthespecialratingDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigPremiumRatePerMili")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("PremiumRatePerMili"), fetchValueFromTextFields(premiumRatepermiliTextField),AssertionType.WARNING);
			}
		}

		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){	
			clickOnDeleteWindowButton(riskDetailsFirstPageEntity);
			switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			clickOnSaveWindowButton(riskDetailsFirstPageEntity);
			//	switchToWindow();
			//	switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){	
			clickOnCloseWindowButtonWC(riskDetailsFirstPageEntity);
		}

	}        

	public void clickOnOpenButtonWCAb(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openAboveButton);
			try{
				Thread.sleep(3000);
				switchToWindow("'Employees with monthly wages above Rs 8000' Details");	
			}  
			catch (Exception e){
				switchToWindow("'Employees with monthly wages above Rs 8000' Details");
			}
		}
	}

	public void fillSubContractorDetailsPage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("add") || riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("edit")){


			//Click On Open Button//
			clickOnOpenButtonWCContract(riskDetailsFirstPageEntity);
			clickOnAddWindowButton(riskDetailsFirstPageEntity);
			//clickOnAddWindowButtonWC(riskDetailsFirstPageEntity);
			//Thread.sleep(3000);

			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNameofcontractor")) {
				clearAndSendKeys(nameofcontractorTextField, riskDetailsFirstPageEntity.getStringValueForField("Nameofcontractor"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextField, riskDetailsFirstPageEntity.getStringValueForField("Description"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				selectValueFromList(categorieDropDown, riskDetailsFirstPageEntity.getStringValueForField("Categorie"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorieContract")) {
				clearAndSendKeys(subCategorieTextField, riskDetailsFirstPageEntity.getStringValueForField("SubCategorieContract"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersSkilled")) {
				clearAndSendKeys(noofWorkersSkilledTextField, riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersSkilled"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersUnSkilled")) {
				clearAndSendKeys(noofWorkersUnSkilledTextField, riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersUnSkilled"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersOthersSkilled")) {
				clearAndSendKeys(noofWorkersOthersTextField, riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersOthersSkilled"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAmountWages")) {
				clearAndSendKeys(amountWagesTextField, riskDetailsFirstPageEntity.getStringValueForField("AmountWages"));
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMilliRate")) {
				clearAndSendKeys(milliRateTextField, riskDetailsFirstPageEntity.getStringValueForField("MilliRate"));
			}

		}		
		else if(riskDetailsFirstPageEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNameofcontractor")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Nameofcontractor"), fetchValueFromTextFields(nameofcontractorTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Description"), fetchValueFromTextFields(descriptionTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("Categorie"), fetchValueFromTextFields(categorieDropDown),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSubCategorie")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("SubCategorie"), fetchValueFromTextFields(subCategorieTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersSkilled")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersSkilled"), fetchValueFromTextFields(noofWorkersSkilledTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersUnSkilled")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersUnSkilled"), fetchValueFromTextFields(noofWorkersUnSkilledTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigNoofWorkersOthersSkilled")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("NoofWorkersOthersSkilled"), fetchValueFromTextFields(noofWorkersOthersTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigAmountWages")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("AmountWages"), fetchValueFromTextFields(amountWagesTextField),AssertionType.WARNING);
			}
			if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigMilliRate")) {
				assertReference.assertEquals(riskDetailsFirstPageEntity.getStringValueForField("MilliRate"), fetchValueFromTextFields(milliRateTextField),AssertionType.WARNING);
			}
		}

		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigDeleteButton")){	
			clickOnDeleteWindowButton(riskDetailsFirstPageEntity);
			switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			clickOnSaveWindowButton(riskDetailsFirstPageEntity);
			//	switchToWindow();
			//	switchToFrame("display");
		}
		if (riskDetailsFirstPageEntity.getBooleanValueForField("ConfigCloseButton")){	
			clickOnCloseWindowButtonWC(riskDetailsFirstPageEntity);
		}


	}        

	public void clickOnOpenButtonWCContract(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity) throws InterruptedException{
		if(riskDetailsFirstPageEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openSubContractorDetailsButton);
			try{
				Thread.sleep(3000);
				switchToWindow("'Sub Contractor Details' Details");	
			}  
			catch (Exception e){
				switchToWindow("'Sub Contractor Details' Details");
			}
		}
	}



	public void fillandSubmitRiskDetailsFirstPage(RiskDetailsFirstMiscEntity riskDetailsFirstPageEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskDetailsFirstPageEntity.getConfigExecute())){
			switchToFrame("display");
			fillRiskDetailsFirstPage(riskDetailsFirstPageEntity, assertReference);
			clickOnNextButton(riskDetailsFirstPageEntity);
			navigateToPolicy(riskDetailsFirstPageEntity);
			navigateToAttribute(riskDetailsFirstPageEntity);
			navigateToInsuredInterest(riskDetailsFirstPageEntity);
			navigateToCoverage(riskDetailsFirstPageEntity);
			navigateToLoan(riskDetailsFirstPageEntity);
			navigateToClientDetails(riskDetailsFirstPageEntity);
			navigateToRelation(riskDetailsFirstPageEntity);
			navigateToPayment(riskDetailsFirstPageEntity);
			navigateToFollowup(riskDetailsFirstPageEntity);
			navigateToDocument(riskDetailsFirstPageEntity);

		}
	}
}




