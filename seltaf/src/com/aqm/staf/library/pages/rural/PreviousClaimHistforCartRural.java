package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.library.databin.PreClaimHistCartRuralEntity;
import com.aqm.staf.library.databin.T4ClaimPropLNMISEntity;

public class PreviousClaimHistforCartRural extends BasePage {
	private PageElement claimTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemTab;
	private PageElement insuredAttributeTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;

	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement nextPageTitle;

	private PageElement  claimNumberLabel;
	private PageElement  policyNumberLabel;
	private PageElement  claimDateLabel;
	private PageElement  claimStatusLabel;
	private PageElement  productCodeLabel;
	private PageElement  causeOfLossLabel;
	private PageElement  memberSerialNoLabel;
	private PageElement  memberCodeLabel;
	private PageElement  applicableEventCodeLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
	//DIGVIJAY Prod-DC
	private PageElement identificationLicenseNumberTextField;
	private PageElement typeOfTheCartTextField;
	private PageElement dateOfPurchaseTextField;
	private PageElement yearOfTheMakeTextField;
	private PageElement typeOfTheTyreTextField;
	private PageElement isTheAnimalsCoveredWithCartTextField;
	private PageElement tagNumberOfAnimal1TextField;
	private PageElement tagNumberOfAnimal2TextField;
	private PageElement originOfRiskTextField;
	private PageElement breedColorOtherMarksTextArea;
	private PageElement totalMarketValueRsTextField;
	private PageElement totalSumInsuredRsTextField;
	private PageElement lossTypeDropDown;
	private PageElement estimatedClaimAmountTextField;
	private PageElement excessInDropDown;
	private PageElement claimPayableAmountTextField;
	private PageElement nameOfWitnessTextField;
	private PageElement addressOfWitnessTextField;
	private PageElement whetherThePolicyIs64VBCompliantDropDown;

	//akshata
	//EP
	private PageElement typeofBirdTextField;
	private PageElement batchNumberTextField;
	private PageElement numberofBatchTextField;
	private PageElement numberofBirdsPerBatchTextField;
	private PageElement noofBirdsLostTextField;
	private PageElement sumInsuredPerBirdTextField;
	private PageElement otherDetailsifanyTypeofLossTextArea;
	private PageElement otherDetailsifanyNatureofLossTextArea;
	private PageElement previousClaimHistoryforPOTitle; 
	//fa
	private PageElement riskCoveredTextArea;
	private PageElement optedCoverDetailsTextArea;
	private PageElement specialPerilsTextArea;
	private PageElement	sumInsuredRsTextField;
	private PageElement previousClaimHistoryTitle; 

	//fc
	private PageElement surveyNumberTextField;
	private PageElement gATNoTextField;
	private PageElement harvestDateTextField;
	private PageElement hissaTextField;
	private PageElement saveButton;
	private PageElement previousclaimHistoTitle; 

	//DG + HD
	private PageElement tagNumberTexField;
	private PageElement nameTextArea;
	private PageElement identificationTypeTexField;
	private PageElement ageYearTexField;
	private PageElement ageMonthTexField;
	private PageElement marketValueTexField;
	private PageElement sumInsuredTexField;
	private PageElement sectionsForDogInsuranceDropdown;
	
	private PageElement typeofRiskHD;
	private PageElement originofRisk;

	//DK
	private PageElement flockIdentificationNoTextField;
	private PageElement typeofDuckYDTextField;
	private PageElement numberofDucksPerBatchTextField;
	private PageElement marketValuePerBirdTextField;
	private PageElement excessInForYDTextField;

	//FW
	private PageElement hissaNumberFWTextArea;
	private PageElement locationWellTextArea;
	private PageElement descriptionWellTextArea;
	//zp
	private PageElement SelectionCoverageforClaimDropDown;
	//YI
	private PageElement pondNumberTextField;
	private PageElement isFloodProneAreaTextField;
	private PageElement totalWaterAreaHectareTextField;
	private PageElement typeofFishDropdown;
	private PageElement totalEstimatedWeightofFishKgTextField;
	private PageElement sumInsuredRsYITextField;
	//YK
	private PageElement excessInForSCTextField;

	//YT
	private PageElement	 identificationNumberTextField;
	private PageElement	 ownerofTheHutTextArea;
	private PageElement	 detailsOfOwnerTextArea;
	private PageElement	 locationOfHutTextArea;
	private PageElement	 sunInsuredOnHutTextField;
	private PageElement  excessInForPTDTextField;

	private PageElement  totalSumInsuredDCTextField;
	//RI
	private PageElement  totalSumInsuredRITextField;
	private PageElement  identificationMarkRITextField;
	private PageElement  numberOfRabbitsPerBatchRITextField;
	private PageElement  marketValuePerAnimalRITextField;
	private PageElement  sumInsuredPerAnimalRITextField;
	private PageElement  excessInRIDropdown;

	//GR
	private PageElement  numberOfInsuredPersonsGRTextField;
	private PageElement  sumInsuredRupeesGRTextField;
	// GR Gramin
	private PageElement  nameOfTheInsuredGRTextField;
	private PageElement  statusOfInsuredGRTextField;
	private PageElement  occupationGraminGRTextField;
	private PageElement  nomineesNameGRTextField;
	private PageElement  nomineesAddressGRTextArea;
	private PageElement  dateOfBirthOfNomineeGRTextField;
	private PageElement  sumInsuredGRTextField;
	private PageElement  ageYearGRTextField;
	private PageElement  dateOfBirthOfNomineeButton;

	//GP
	private PageElement  pumpSerialNoGPTextField;
	private PageElement  pumpsetTypeGPTextField;
	private PageElement  typeOfMotorPumpsetGPTextField;
	private PageElement  ageOfPumpYearsGPTextField;
	private PageElement  horsePowerGPTextField;
	private PageElement  sumInsuredCentrifugalGPTextField;

	//GG
	private PageElement  marketValuePlantRsTextField;
	private PageElement  sumInsuredPlantRsTextField;
	private PageElement  beneficiaryDetailsTextArea;
	private PageElement  beneficiaryNameTextArea;
	private PageElement  locationGobarGasPlantTextArea;
	//HB
	private PageElement  identificationNumberOfBeeHiveOrBeeColonyHBTextField;
	private PageElement  typeOfBeeHiveHBTextField;
	private PageElement  costPerBeeHiveHBTextField;
	private PageElement  numberOfBeeHivesHBTextField;
	private PageElement  typeOfBeeColonyHBTextField;

	private PageElement  costPerBeeColonyHBTextField;
	private PageElement  numberOfBeeColoniesHBTextField;
	private PageElement  sumInsuredTotalHBTextField;
	
	//PI
	private PageElement	 detailsOfAnimalTextArea;
	private PageElement	 sumInsuredRupeesJPTextField;
	
	//PG
	private PageElement statusOfInsuredPGDropdown;
	private PageElement occupationGraminPGDropdown;
	
	
	private PageElement excessInForPTDDropDown;
	
	//SG
	private PageElement typeofRiskForSheepandGoatDropdown;
	private PageElement breedspecificationTextArea;
	private PageElement originOfRiskDropdown;
	private PageElement	sumInsuredRsLITextField;
	
	//SW
	private PageElement lotNumberTextField;
	private PageElement surveyRevenueNumberTextField;
	private PageElement speciesOfTheSilkWormTextField;
	private PageElement raceOfSilkWormTextField;
	
	//MP
	
	private PageElement typeOfRiskForCattleDropDown;
	private PageElement claimRatioTextField;
    //YR
	private PageElement typeOfCropDropdown;
	private PageElement nameOfTheCropTextField;
	private PageElement lossesDueToUnseasonalRainsFrost;
	private PageElement totalSumInsuredYR;

	public PreviousClaimHistforCartRural(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured InterestDamage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		insuredSerialNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Serial No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Item Code')]/following::td"), "Insured Item Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY Prod-DC
		identificationLicenseNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Identification/License number')]/following::input"), "Identification License number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfTheCartTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of the Cart')]/following::input"), "Type of the Cart", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfPurchaseTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Purchase')]/following::input"), "Date of Purchase", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfTheMakeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Year of the Make')]/following::input"), "Year of the Make", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfTheTyreTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of the Tyre')]/following::input"), "Type of the Tyre", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheAnimalsCoveredWithCartTextField=new PageElement(By.xpath("//td//div[contains(text(),'Is the Animals covered with cart')]/following::input"), "Is the Animals covered with cart", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNumberOfAnimal1TextField=new PageElement(By.xpath("//td//div[contains(text(),'Tag Number of animal 1')]/following::input"), "Tag Number of animal 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNumberOfAnimal2TextField=new PageElement(By.xpath("//td//div[contains(text(),'Tag Number of animal 2')]/following::input"), "Tag Number of animal 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originOfRiskTextField=new PageElement(By.xpath("//td//div[contains(text(),'Origin of Risk')]/following::input"), "Origin of Risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breedColorOtherMarksTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Breed/Color/Other Marks')]/following::textarea"), "Breed Color Other Marks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalMarketValueRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Market Value (Rs)", "input")), "Total Market Value Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured (Rs)", "input")), "Total Sum Insured Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Loss Type')]/following::select"), "Loss Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Claim Amount", "input")), "Estimated Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessInDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)", "select")), "Excess in (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		claimPayableAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Payable Amount", "input")), "Claim Payable Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfWitnessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of witness')]/following::input"), "Name of witness", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfWitnessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Address of witness')]/following::input"), "Address of witness", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherThePolicyIs64VBCompliantDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the policy is 64 VB compliant", "select")), "Whether the policy is 64 VB compliant", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EP
		typeofBirdTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type ofBird", "input")), "Type of Bird", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		batchNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Batch Number", "input")), "Batch Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Batch", "input")), "Number of Batch", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofBirdsPerBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of birds per batch", "input")), "Number of birds per batch", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noofBirdsLostTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. of Birds Lost", "input")), "No of Birds Lost", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured per bird", "input")), "Sum insured per bird", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsifanyTypeofLossTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Details(if any)-Type of Loss", "textarea")), "Other Details if any Type of Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsifanyNatureofLossTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Details(if any)-Nature of Loss", "textarea")), "Other Details if any Nature of Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FA
		riskCoveredTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Risk Covered", "textarea")), "Risk Covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optedCoverDetailsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Opted Cover details", "textarea")), "Opted Cover details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialPerilsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Perils", "textarea")), "Special Perils", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FC
		surveyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Number", "input")), "Survey Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		gATNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("GAT No", "input")), "GAT No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		harvestDateTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Harvest Date", "input")), "Harvest Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hissaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hissa", "input")), "Hissa", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousClaimHistoryforPOTitle=new PageElement(By.xpath("//div//b[contains(text(),'Previous Claim History for PO')]"), "Previous Claim History for PO Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		previousClaimHistoryTitle=new PageElement(By.xpath("//div//b[contains(text(),'Previous Claim History')]"), "Previous Claim History Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		previousclaimHistoTitle=new PageElement(By.xpath("//div//b[contains(text(),'Previous claim Histo')]"), "Previous claim Histo Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//DG + HD		
		nameTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name", "textarea")), "Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		identificationTypeTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Type(Dog)", "input")), "Identification Type(Dog) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageYearTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year )", "input")), "Age (Year ) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageMonthTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Months)", "input")), "Age (Months) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sectionsForDogInsuranceDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sections for Dog Insurance", "select")), "sections For Dog Insurance Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		tagNumberTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Tag Number", "input")), "Tag Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofRiskHD=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Risk (HD)", "input")), "Type of Risk (HD)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originofRisk=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Origin of Risk", "input")), "Origin of Risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValueTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value(Rs)", "input")), "Market Value(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTexField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		
		//DK

		flockIdentificationNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flock Identification no", "input")), "flock Identification No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofDuckYDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Duck YD", "input")), "Type of Duck YD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofDucksPerBatchTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of ducks per batch", "input")), "Number of ducks per batch TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValuePerBirdTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value per Bird", "input")), "Market value per Bird TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessInForYDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess In (%) For YD", "input")), "Excess In (%) For YD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//FW
		hissaNumberFWTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hissa Number", "textarea")), "Hissa Number FW", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationWellTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of the well", "textarea")), "Location of the well", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionWellTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Description of well", "textarea")), "Description of well", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// ZP
		SelectionCoverageforClaimDropDown =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Selection coverage for claim", "select")), "Selection coverage for claim Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//YI
		pondNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pond Number", "input")), "Pond Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isFloodProneAreaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Flood ProneArea", "input")), "Is Flood ProneArea TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalWaterAreaHectareTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Water Area (Hectare)", "input")), "Total Water Area (Hectare) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofFishDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Fish", "select")), "Type of Fish TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalEstimatedWeightofFishKgTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Estimated Weight of Fish(Kg)", "input")), "Total Estimated Weight of Fish(Kg) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsYITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured(Rs) YI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//YK
		excessInForSCTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%) for SC", "input")), "Excess In (%) For SC TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//YT

		identificationNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Number", "input")), "Identification Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerofTheHutTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Owner of the Hut", "textarea")), "owner of The Hut TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfOwnerTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of the owner", "textarea")), "Details of the owner TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationOfHutTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of the Hut", "textarea")), "Location of the Hut TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sunInsuredOnHutTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured on the hut (Rs)", "input")), "Sum Insured on the hut (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//CA
		excessInForPTDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%) for PTD", "input")), "Excess In (%) For PTD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		totalSumInsuredDCTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total sum insured (Rs)", "input")), "Total Sum Insured Rs TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//RI
		totalSumInsuredRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Sum Insured(Rs)", "input")), "Total Sum Insured Rs TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		identificationMarkRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IdentificationMark", "input")), "Identification Mark TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfRabbitsPerBatchRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of rabbits per batch", "input")), "numbeR Of Rabbits Per Batch RI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValuePerAnimalRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market value per animal", "input")), "market Value Per Animal RI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerAnimalRITextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured per animal", "input")), "sum Insured Per Animal RI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessInRIDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)", "select")), "excess In RI Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//GR Group
		numberOfInsuredPersonsGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of insured persons", "input")), "Number of insured persons GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRupeesGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured(Rupees)", "input")), "Sum Insured(Rupees) GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//GR Gramin
		nameOfTheInsuredGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Insured", "input")), "Name of the Insured GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		statusOfInsuredGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Status of Insured", "input")), "Status of Insured GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationGraminGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation (Gramin)", "input")), "Occupation (Gramin) GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesNameGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Name", "input")), "Nominees Name GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineesAddressGRTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Nominees Address", "textarea")), "Nominees Address GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthOfNomineeGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth of Nominee", "input")), "Date of Birth of Nominee GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageYearGRTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age (Year)", "input")), "Age (Year) GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//GP
		pumpSerialNoGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pump Serial No.", "input")), "Pump Serial No. GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		pumpsetTypeGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pumpset Type", "input")), "Pumpset Type GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfMotorPumpsetGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of MotorPumpset", "input")), "Type of MotorPumpset GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfPumpYearsGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Age of pump(years)", "input")), "Age of pump(years) GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		horsePowerGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Horse Power", "input")), "Horse Power GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredCentrifugalGPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Centrifugal)", "input")), "Sum Insured (Centrifugal) GP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthOfNomineeButton=new PageElement(By.xpath("//input[@name='propValues7']/following::a[@name='firstFocus']"), "Date of birth Nominee Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//GG
		marketValuePlantRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Market Value of the plant(Rs)", "input")), "Market Value of the plant in Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPlantRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured of the plant(Rs)", "input")), "Sum Insured of the plant in Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationGobarGasPlantTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location of Gobar gas plant", "textarea")), "Location of Gobar gas plant", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		beneficiaryNameTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Beneficiary Name", "textarea")), "Beneficiary Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		beneficiaryDetailsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Beneficiary Details", "textarea")), "Beneficiary Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//HB
		identificationNumberOfBeeHiveOrBeeColonyHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Identification Number of Bee Hive / Bee Colony", "input")), "Identification Number of Bee Hive / Bee Colony HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		typeOfBeeHiveHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type Of BeeHive", "input")), "Type Of BeeHive HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costPerBeeHiveHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost per Bee Hive", "input")), "Cost per Bee Hive HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfBeeHivesHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Bee Hives", "input")), "Number of Bee Hives HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfBeeColonyHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of BeeColony", "input")), "Type of BeeColony HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costPerBeeColonyHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cost per Bee Colony", "input")), "Cost per Bee Colony HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		
		numberOfBeeColoniesHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Bee Colonies", "input")), "Number of Bee Colonies HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTotalHBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Total)", "input")), "Sum Insured (Total) HB TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//PI
		detailsOfAnimalTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of the animal", "textarea")), "Details of the animal TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRupeesJPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum insured (Rupees)", "input")), "Sum Insured(Rupees) GR TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		//PG
		statusOfInsuredPGDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Status of the Insured", "select")), "Status of the Insured SelectField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationGraminPGDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation(Gramin)", "select")), "Occupation(Gramin) SelectField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//HD,HI,IF
		excessInForPTDDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%) for PTD", "select")), "Excess in (%) for PTD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SG
		typeofRiskForSheepandGoatDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Risk For Sheep and Goat", "select")), "Type of Risk For Sheep and Goat SelectField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breedspecificationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breed specification", "textarea")), "Breed specification TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		originOfRiskDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Origin of risk", "select")), "Origin of risk", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsLITextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured(Rs) of lift irrigation system')]/following::input"), "Sum Insured(Rs) of lift irrigation system", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SW
		lotNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Lot Number", "input")), "Lot Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyRevenueNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Survey Revenue Number", "input")), "Survey Revenue Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		speciesOfTheSilkWormTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Species of the Silk worm", "input")), "Species of the Silk worm TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		raceOfSilkWormTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Race of silk worm", "input")), "Race of silk worm TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	   // MP
		
		typeOfRiskForCattleDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Risk For Cattle", "select")), "Type of Risk For Cattle SelectField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatioTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Ratio", "input")), "Claim Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	// YR
		typeOfCropDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of the Crop", "input")), "Type of the Crop", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheCropTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name Of the Crop (HC)')]/following::input"), "Name Of the Crop", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossesDueToUnseasonalRainsFrost=new PageElement(By.xpath("//td//div[contains(text(),'Losses dueto Unseasonal Rains and Frost')]/following::input"), "Losses dueto Unseasonal Rains and Frost", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredYR=new PageElement(By.xpath("//td//div[contains(text(),'Total sum insured (Rs)')]/following::input"), "Total sum insured (Rs)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	
	public void fillPreviousClaimHistforCartRural(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity, CustomAssert assertReference) throws InterruptedException{

		if(preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("add") || preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY Prod-DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLossType")) {
				selectValueFromList(lossTypeDropDown, preClaimHistCartRuralEntity.getStringValueForField("LossType"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				clearAndSendKeys(estimatedClaimAmountTextField, preClaimHistCartRuralEntity.getStringValueForField("EstimatedClaimAmount"));
			}
			//zp
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSelectionCoverageforClaim")) {
				selectValueFromList(SelectionCoverageforClaimDropDown, preClaimHistCartRuralEntity.getStringValueForField("SelectionCoverageforClaim"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessIn")) {
				selectValueFromList(excessInDropDown, preClaimHistCartRuralEntity.getStringValueForField("ExcessIn"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				clearAndSendKeys(nameOfWitnessTextField, preClaimHistCartRuralEntity.getStringValueForField("NameOfWitness"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				clearAndSendKeys(addressOfWitnessTextField, preClaimHistCartRuralEntity.getStringValueForField("AddressOfWitness"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				selectValueFromList(whetherThePolicyIs64VBCompliantDropDown, preClaimHistCartRuralEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"));
			}
			//ep
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfBird")) {
				clearAndSendKeys(typeofBirdTextField, preClaimHistCartRuralEntity.getStringValueForField("TypeOfBird"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNoOfBirdsLost")) {
				clearAndSendKeys(noofBirdsLostTextField, preClaimHistCartRuralEntity.getStringValueForField("NoOfBirdsLost"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyTypeofLoss")) {
				clearAndSendKeys(otherDetailsifanyTypeofLossTextArea, preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyTypeofLoss"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyNatureofLoss")) {
				clearAndSendKeys(otherDetailsifanyNatureofLossTextArea, preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyNatureofLoss"));
			}
			//DG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumber")) {
				clearAndSendKeys(tagNumberTexField, preClaimHistCartRuralEntity.getStringValueForField("TagNumber"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigName")) {
				clearAndSendKeys(nameTextArea, preClaimHistCartRuralEntity.getStringValueForField("Name"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationType")) {
				clearAndSendKeys(identificationTypeTexField, preClaimHistCartRuralEntity.getStringValueForField("IdentificationType"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeYear")) {
				clearAndSendKeys(ageYearTexField, preClaimHistCartRuralEntity.getStringValueForField("AgeYear"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeMonths")) {
				clearAndSendKeys(ageMonthTexField, preClaimHistCartRuralEntity.getStringValueForField("AgeMonths"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValue")) {
				clearAndSendKeys(marketValueTexField, preClaimHistCartRuralEntity.getStringValueForField("MarketValue"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTexField, preClaimHistCartRuralEntity.getStringValueForField("SumInsured"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSectionsforDogInsurance")) {
				selectValueFromList(sectionsForDogInsuranceDropdown, preClaimHistCartRuralEntity.getStringValueForField("SectionsforDogInsurance"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofRiskHD")) {
				clearAndSendKeys(typeofRiskHD, preClaimHistCartRuralEntity.getStringValueForField("TypeofRiskHD"));
			}			
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOriginOfRisk")) {
				clearAndSendKeys(originofRisk, preClaimHistCartRuralEntity.getStringValueForField("OriginOfRisk"));
			}		
			
			//DK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				clearAndSendKeys(flockIdentificationNoTextField, preClaimHistCartRuralEntity.getStringValueForField("FlockIdentificationNo"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				clearAndSendKeys(typeofDuckYDTextField, preClaimHistCartRuralEntity.getStringValueForField("TypeofDuck"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfDucksPerBatch")) {
				clearAndSendKeys(numberofDucksPerBatchTextField, preClaimHistCartRuralEntity.getStringValueForField("NumberOfDucksPerBatch"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValuePerBird")) {
				clearAndSendKeys(marketValuePerBirdTextField, preClaimHistCartRuralEntity.getStringValueForField("MarketValuePerBird"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForYD")) {
				clearAndSendKeys(excessInForYDTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForYD"));
			}
			//YI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofFish")) {
				clearAndSendKeys(typeofFishDropdown, preClaimHistCartRuralEntity.getStringValueForField("TypeofFish"));
			}
			//YK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForSC")) {
				clearAndSendKeys(excessInForSCTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForSC"));
			}
			//CA
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForPTD")) {
				clearAndSendKeys(excessInForPTDTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForPTD"));
			}
			
			//SG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofRiskForSheepandGoat")) {
				clearAndSendKeys(typeofRiskForSheepandGoatDropdown, preClaimHistCartRuralEntity.getStringValueForField("TypeofRiskForSheepandGoat"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBreedSpecification")) {
				clearAndSendKeys(breedspecificationTextArea, preClaimHistCartRuralEntity.getStringValueForField("BreedSpecification"));
			}
			
			// MP
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfRiskForCattle")) {
				clearAndSendKeys(typeOfRiskForCattleDropDown, preClaimHistCartRuralEntity.getStringValueForField("TypeOfRiskForCattle"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimRatio")) {
				clearAndSendKeys(claimRatioTextField, preClaimHistCartRuralEntity.getStringValueForField("ClaimRatio"));
			}
			
			
			
			
		}
		else if(preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("verify")){
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(preClaimHistCartRuralEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}

			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfTheCart")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfTheCart"), fetchValueFromTextFields(typeOfTheCartTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDateOfPurchase")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(preClaimHistCartRuralEntity.getStringValueForField("DateOfPurchase")), fetchValueFromTextFields(dateOfPurchaseTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigYearOfTheMake")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("YearOfTheMake"), fetchValueFromTextFields(yearOfTheMakeTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfTheTyre")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfTheTyre"), fetchValueFromTextFields(typeOfTheTyreTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIsTheAnimalsCoveredWithCart")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IsTheAnimalsCoveredWithCart"), fetchValueFromTextFields(isTheAnimalsCoveredWithCartTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumberOfAnimal1")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumberOfAnimal1"), fetchValueFromTextFields(tagNumberOfAnimal1TextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumberOfAnimal2")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumberOfAnimal2"), fetchValueFromTextFields(tagNumberOfAnimal2TextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOriginOfRisk")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OriginOfRisk"), fetchValueFromTextFields(originOfRiskTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBreedColorOtherMarks")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BreedColorOtherMarks"), fetchValueFromTextFields(breedColorOtherMarksTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalMarketValueRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalMarketValueRs"), fetchValueFromTextFields(totalMarketValueRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalSumInsuredRs"), fetchValueFromTextFields(totalSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLossType")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LossType"), fetchValueFromList(lossTypeDropDown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("EstimatedClaimAmount"), fetchValueFromTextFields(estimatedClaimAmountTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessIn")) {
				if(preClaimHistCartRuralEntity.getStringValueForField("Product").equalsIgnoreCase("HD")){
					assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessIn"), fetchValueFromList(excessInForPTDDropDown), AssertionType.WARNING);
				}else
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessIn"), fetchValueFromList(excessInDropDown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimPayableAmount")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimPayableAmount"), fetchValueFromTextFields(claimPayableAmountTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NameOfWitness"), fetchValueFromTextFields(nameOfWitnessTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AddressOfWitness"), fetchValueFromTextFields(addressOfWitnessTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"), fetchValueFromList(whetherThePolicyIs64VBCompliantDropDown), AssertionType.WARNING);
			}
			//ep
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBatchNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BatchNumber"), fetchValueFromTextFields(batchNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberofBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberofBatch"), fetchValueFromTextFields(numberofBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberofBirdsPerBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberofBirdsPerBatch"), fetchValueFromTextFields(numberofBirdsPerBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofBird")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofBird"), fetchValueFromTextFields(typeofBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredPerBird")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredPerBird"), fetchValueFromTextFields(sumInsuredPerBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyTypeofLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyTypeofLoss"), fetchValueFromTextFields(otherDetailsifanyTypeofLossTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyNatureofLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyNatureofLoss"), fetchValueFromTextFields(otherDetailsifanyNatureofLossTextArea), AssertionType.WARNING);
			}
			//FA
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOptedCoverDetails")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OptedCoverDetails"), fetchValueFromTextFields(optedCoverDetailsTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			//fc
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSurveyNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SurveyNumber"), fetchValueFromTextFields(surveyNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigGATNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("GATNo"), fetchValueFromTextFields(gATNoTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHarvestDate")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("HarvestDate"), fetchValueFromTextFields(harvestDateTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHissa")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("Hissa"), fetchValueFromTextFields(hissaTextField), AssertionType.WARNING);
			}
			//FW
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHissaNumberFW")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("HissaNumberFW"), fetchValueFromList(hissaNumberFWTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLocationWell")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LocationWell"), fetchValueFromList(locationWellTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDescriptionWell")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DescriptionWell"), fetchValueFromList(descriptionWellTextArea), AssertionType.WARNING);
			}
			//DG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumber"), fetchValueFromTextFields(tagNumberTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigName")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("Name"), fetchValueFromTextFields(nameTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationType")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationType"), fetchValueFromTextFields(identificationTypeTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeYear")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeYear"), fetchValueFromTextFields(ageYearTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeMonths")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeMonths"), fetchValueFromTextFields(ageMonthTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValue")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValue"), fetchValueFromTextFields(marketValueTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSectionsforDogInsurance")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SectionsforDogInsurance"), fetchValueFromList(sectionsForDogInsuranceDropdown), AssertionType.WARNING);
			}
			//DK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("FlockIdentificationNo"), fetchValueFromTextFields(flockIdentificationNoTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofDuck"), fetchValueFromTextFields(typeofDuckYDTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfDucksPerBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberOfDucksPerBatch"), fetchValueFromTextFields(numberofDucksPerBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValuePerBirdDK")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValuePerBirdDK"), fetchValueFromTextFields(marketValuePerBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForYD")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInForYD"), fetchValueFromTextFields(excessInForYDTextField), AssertionType.WARNING);
			}
			//YI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPondNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PondNumber"), fetchValueFromTextFields(pondNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIsFloodProneArea")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IsFloodProneArea"), fetchValueFromTextFields(isFloodProneAreaTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalWaterAreaHectare")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalWaterAreaHectare"), fetchValueFromTextFields(totalWaterAreaHectareTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofFish")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofFish"), fetchValueFromList(typeofFishDropdown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalEstimatedWeightofFishKg")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalEstimatedWeightofFishKg"), fetchValueFromTextFields(totalEstimatedWeightofFishKgTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRsYI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRsYI"), fetchValueFromTextFields(sumInsuredRsYITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForSC")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInForSC"), fetchValueFromTextFields(excessInForSCTextField), AssertionType.WARNING);
			}
			//YT
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationNumber"), fetchValueFromTextFields(identificationNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOwnerOfHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OwnerOfHut"), fetchValueFromTextFields(ownerofTheHutTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDetailsOfOwner")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DetailsOfOwner"), fetchValueFromTextFields(detailsOfOwnerTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLocationOfHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LocationOfHut"), fetchValueFromTextFields(locationOfHutTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredOnHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredOnHut"), fetchValueFromTextFields(sunInsuredOnHutTextField), AssertionType.WARNING);
			}
			//DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationLicenseNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationLicenseNo"), fetchValueFromTextFields(identificationLicenseNumberTextField), AssertionType.WARNING);
			}
			//CA
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForPTD")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInForPTD"), fetchValueFromTextFields(excessInForPTDTextField), AssertionType.WARNING);
			}
			//DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRsDC")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalSumInsuredRsDC"), fetchValueFromTextFields(totalSumInsuredDCTextField), AssertionType.WARNING);
			}
			//RI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRsRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalSumInsuredRsRI"), fetchValueFromTextFields(totalSumInsuredRITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationMarkRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationMarkRI"), fetchValueFromTextFields(identificationMarkRITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberofRabbitsperBatchRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberofRabbitsperBatchRI"), fetchValueFromTextFields(numberOfRabbitsPerBatchRITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValueperAnimalRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValueperAnimalRI"), fetchValueFromTextFields(marketValuePerAnimalRITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredperAnimalRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredperAnimalRI"), fetchValueFromTextFields(sumInsuredPerAnimalRITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInRI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInRI"), fetchValueFromList(excessInRIDropdown), AssertionType.WARNING);
			}
			// GR Group
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfInsuredPersonsGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberOfInsuredPersonsGR"), fetchValueFromTextFields(numberOfInsuredPersonsGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRupeesGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRupeesGR"), fetchValueFromTextFields(sumInsuredRupeesGRTextField), AssertionType.WARNING);
			}
			// GR Gramin
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfTheInsuredGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NameOfTheInsuredGR"), fetchValueFromTextFields(nameOfTheInsuredGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigStatusOfInsuredGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("StatusOfInsuredGR"), fetchValueFromTextFields(statusOfInsuredGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOccupationGraminGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OccupationGraminGR"), fetchValueFromTextFields(occupationGraminGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNomineesNameGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NomineesNameGR"), fetchValueFromTextFields(nomineesNameGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNomineesAddressGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NomineesAddressGR"), fetchValueFromTextFields(nomineesAddressGRTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDateOfBirthOfNomineeGR")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(preClaimHistCartRuralEntity.getStringValueForField("DateOfBirthOfNomineeGR")), fetchValueFromTextFields(dateOfBirthOfNomineeGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredGR"), fetchValueFromTextFields(sumInsuredGRTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeYearGR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeYearGR"), fetchValueFromTextFields(ageYearGRTextField), AssertionType.WARNING);				
			}
			//GP
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPumpSerialNoGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PumpSerialNoGP"), fetchValueFromTextFields(pumpSerialNoGPTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPumpsetTypeGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PumpsetTypeGP"), fetchValueFromTextFields(pumpsetTypeGPTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfMotorPumpsetGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfMotorPumpsetGP"), fetchValueFromTextFields(typeOfMotorPumpsetGPTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeOfPumpYearsGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeOfPumpYearsGP"), fetchValueFromTextFields(ageOfPumpYearsGPTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHorsePowerGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("HorsePowerGP"), fetchValueFromTextFields(horsePowerGPTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredCentrifugalGP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredCentrifugalGP"), fetchValueFromTextFields(sumInsuredCentrifugalGPTextField), AssertionType.WARNING);
			}			
			//GG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValuePlantRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValuePlantRs"), fetchValueFromTextFields(marketValuePlantRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredPlantRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredPlantRs"), fetchValueFromTextFields(sumInsuredPlantRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLocationGobarGasPlant")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LocationGobarGasPlant"), fetchValueFromTextFields(locationGobarGasPlantTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBeneficiaryName")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BeneficiaryName"), fetchValueFromTextFields(beneficiaryNameTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBeneficiaryDetails")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BeneficiaryDetails"), fetchValueFromTextFields(beneficiaryDetailsTextArea), AssertionType.WARNING);
			}
			//HB
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationNoOfBeeHiveOrBeeColonyHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationNoOfBeeHiveOrBeeColonyHB"), fetchValueFromTextFields(identificationNumberOfBeeHiveOrBeeColonyHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfBeeHiveHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfBeeHiveHB"), fetchValueFromTextFields(typeOfBeeHiveHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigCostPerBeeHiveHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("CostPerBeeHiveHB"), fetchValueFromTextFields(costPerBeeHiveHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfBeeHivesHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberOfBeeHivesHB"), fetchValueFromTextFields(numberOfBeeHivesHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfBeeColonyHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfBeeColonyHB"), fetchValueFromTextFields(typeOfBeeColonyHBTextField), AssertionType.WARNING);
			}

			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigCostPerBeeColonyHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("CostPerBeeColonyHB"), fetchValueFromTextFields(costPerBeeColonyHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfBeeColoniesHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberOfBeeColoniesHB"), fetchValueFromTextFields(numberOfBeeColoniesHBTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredTotalHB")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredTotalHB"), fetchValueFromTextFields(sumInsuredTotalHBTextField), AssertionType.WARNING);
			}
			
			//PI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDetailsOfAnimal")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DetailsOfAnimal"), fetchValueFromTextFields(detailsOfAnimalTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRupeesJP")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRupeesJP"), fetchValueFromTextFields(sumInsuredRupeesJPTextField), AssertionType.WARNING);
			}
			
			//PG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigStatusOfInsuredPG")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("StatusOfInsuredPG"), fetchValueFromList(statusOfInsuredPGDropdown), AssertionType.WARNING);
			}
			
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOccupationGraminPG")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OccupationGraminPG"), fetchValueFromList(occupationGraminPGDropdown), AssertionType.WARNING);
			}
			//SG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofRiskForSheepandGoat")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofRiskForSheepandGoat"), fetchValueFromList(typeofRiskForSheepandGoatDropdown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBreedspecification")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("Breedspecification"), fetchValueFromList(breedspecificationTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOriginofriskSG")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OriginofriskSG"), fetchValueFromList(originOfRiskDropdown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRsLI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRsLI"), fetchValueFromTextFields(sumInsuredRsLITextField), AssertionType.WARNING);
				}
			//SW	
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLotNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LotNumber"), fetchValueFromTextFields(lotNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSurveyRevenueNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SurveyRevenueNumber"), fetchValueFromTextFields(surveyRevenueNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSpeciesOfTheSilkWorm")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SpeciesOfTheSilkWorm"), fetchValueFromTextFields(speciesOfTheSilkWormTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigRaceOfSilkWorm")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("RaceOfSilkWorm"), fetchValueFromTextFields(raceOfSilkWormTextField), AssertionType.WARNING);
			}
			
			// MP
			
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfRiskForCattle")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfRiskForCattle"), fetchValueFromList(typeOfRiskForCattleDropDown), AssertionType.WARNING);
				
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimRatio")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimRatio"), fetchValueFromTextFields(claimRatioTextField), AssertionType.WARNING);
				
			}
		}
	}


	public void fillPreviousClaimHistforCartMicroInsurance(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity, CustomAssert assertReference) throws InterruptedException{

		if(preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("add") || preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY Prod-DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLossType")) {
				selectValueFromList(lossTypeDropDown, preClaimHistCartRuralEntity.getStringValueForField("LossType"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				clearAndSendKeys(estimatedClaimAmountTextField, preClaimHistCartRuralEntity.getStringValueForField("EstimatedClaimAmount"));
			}
			//zp
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSelectionCoverageforClaim")) {
				selectValueFromList(SelectionCoverageforClaimDropDown, preClaimHistCartRuralEntity.getStringValueForField("SelectionCoverageforClaim"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessIn")) {
				selectValueFromList(excessInDropDown, preClaimHistCartRuralEntity.getStringValueForField("ExcessIn"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				clearAndSendKeys(nameOfWitnessTextField, preClaimHistCartRuralEntity.getStringValueForField("NameOfWitness"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				clearAndSendKeys(addressOfWitnessTextField, preClaimHistCartRuralEntity.getStringValueForField("AddressOfWitness"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				selectValueFromList(whetherThePolicyIs64VBCompliantDropDown, preClaimHistCartRuralEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"));
			}
			//ep
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfBird")) {
				clearAndSendKeys(typeofBirdTextField, preClaimHistCartRuralEntity.getStringValueForField("TypeOfBird"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNoOfBirdsLost")) {
				clearAndSendKeys(noofBirdsLostTextField, preClaimHistCartRuralEntity.getStringValueForField("NoOfBirdsLost"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyTypeofLoss")) {
				clearAndSendKeys(otherDetailsifanyTypeofLossTextArea, preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyTypeofLoss"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyNatureofLoss")) {
				clearAndSendKeys(otherDetailsifanyNatureofLossTextArea, preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyNatureofLoss"));
			}
			//DG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumber")) {
				clearAndSendKeys(tagNumberTexField, preClaimHistCartRuralEntity.getStringValueForField("TagNumber"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigName")) {
				clearAndSendKeys(nameTextArea, preClaimHistCartRuralEntity.getStringValueForField("Name"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationType")) {
				clearAndSendKeys(identificationTypeTexField, preClaimHistCartRuralEntity.getStringValueForField("IdentificationType"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeYear")) {
				clearAndSendKeys(ageYearTexField, preClaimHistCartRuralEntity.getStringValueForField("AgeYear"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeMonths")) {
				clearAndSendKeys(ageMonthTexField, preClaimHistCartRuralEntity.getStringValueForField("AgeMonths"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValue")) {
				clearAndSendKeys(marketValueTexField, preClaimHistCartRuralEntity.getStringValueForField("MarketValue"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTexField, preClaimHistCartRuralEntity.getStringValueForField("SumInsured"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSectionsforDogInsurance")) {
				selectValueFromList(sectionsForDogInsuranceDropdown, preClaimHistCartRuralEntity.getStringValueForField("SectionsforDogInsurance"));
			}
			//DK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				clearAndSendKeys(flockIdentificationNoTextField, preClaimHistCartRuralEntity.getStringValueForField("FlockIdentificationNo"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				clearAndSendKeys(typeofDuckYDTextField, preClaimHistCartRuralEntity.getStringValueForField("TypeofDuck"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfDucksPerBatch")) {
				clearAndSendKeys(numberofDucksPerBatchTextField, preClaimHistCartRuralEntity.getStringValueForField("NumberOfDucksPerBatch"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValuePerBird")) {
				clearAndSendKeys(marketValuePerBirdTextField, preClaimHistCartRuralEntity.getStringValueForField("MarketValuePerBird"));
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForYD")) {
				clearAndSendKeys(excessInForYDTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForYD"));
			}
			//YI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofFish")) {
				clearAndSendKeys(typeofFishDropdown, preClaimHistCartRuralEntity.getStringValueForField("TypeofFish"));
			}
			//YK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForSC")) {
				clearAndSendKeys(excessInForSCTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForSC"));
			}
			//CA
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForPTD")) {
				clearAndSendKeys(excessInForPTDTextField, preClaimHistCartRuralEntity.getStringValueForField("ExcessInForPTD"));
			}	
		}
		else if(preClaimHistCartRuralEntity.getAction().equalsIgnoreCase("verify")){
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(preClaimHistCartRuralEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}

			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-DC
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfTheCart")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfTheCart"), fetchValueFromTextFields(typeOfTheCartTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDateOfPurchase")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DateOfPurchase"), fetchValueFromTextFields(dateOfPurchaseTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigYearOfTheMake")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("YearOfTheMake"), fetchValueFromTextFields(yearOfTheMakeTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfTheTyre")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfTheTyre"), fetchValueFromTextFields(typeOfTheTyreTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIsTheAnimalsCoveredWithCart")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IsTheAnimalsCoveredWithCart"), fetchValueFromTextFields(isTheAnimalsCoveredWithCartTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumberOfAnimal1")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumberOfAnimal1"), fetchValueFromTextFields(tagNumberOfAnimal1TextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumberOfAnimal2")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumberOfAnimal2"), fetchValueFromTextFields(tagNumberOfAnimal2TextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOriginOfRisk")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OriginOfRisk"), fetchValueFromTextFields(originOfRiskTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBreedColorOtherMarks")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BreedColorOtherMarks"), fetchValueFromTextFields(breedColorOtherMarksTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalMarketValueRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalMarketValueRs"), fetchValueFromTextFields(totalMarketValueRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalSumInsuredRs"), fetchValueFromTextFields(totalSumInsuredRsTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLossType")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LossType"), fetchValueFromList(lossTypeDropDown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("EstimatedClaimAmount"), fetchValueFromTextFields(estimatedClaimAmountTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessIn")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessIn"), fetchValueFromList(excessInDropDown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimPayableAmount")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ClaimPayableAmount"), fetchValueFromTextFields(claimPayableAmountTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NameOfWitness"), fetchValueFromTextFields(nameOfWitnessTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AddressOfWitness"), fetchValueFromTextFields(addressOfWitnessTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"), fetchValueFromList(whetherThePolicyIs64VBCompliantDropDown), AssertionType.WARNING);
			}
			//ep
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigBatchNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("BatchNumber"), fetchValueFromTextFields(batchNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberofBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberofBatch"), fetchValueFromTextFields(numberofBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberofBirdsPerBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberofBirdsPerBatch"), fetchValueFromTextFields(numberofBirdsPerBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofBird")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofBird"), fetchValueFromTextFields(typeofBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredPerBird")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredPerBird"), fetchValueFromTextFields(sumInsuredPerBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyTypeofLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyTypeofLoss"), fetchValueFromTextFields(otherDetailsifanyTypeofLossTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOtherDetailsifanyNatureofLoss")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OtherDetailsifanyNatureofLoss"), fetchValueFromTextFields(otherDetailsifanyNatureofLossTextArea), AssertionType.WARNING);
			}
			//FA
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOptedCoverDetails")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OptedCoverDetails"), fetchValueFromTextFields(optedCoverDetailsTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			//fc
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSurveyNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SurveyNumber"), fetchValueFromTextFields(surveyNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigGATNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("GATNo"), fetchValueFromTextFields(gATNoTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHarvestDate")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("HarvestDate"), fetchValueFromTextFields(harvestDateTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHissa")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("Hissa"), fetchValueFromTextFields(hissaTextField), AssertionType.WARNING);
			}
			//FW
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigHissaNumberFW")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("HissaNumberFW"), fetchValueFromTextFields(hissaNumberFWTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLocationWell")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LocationWell"), fetchValueFromTextFields(locationWellTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDescriptionWell")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DescriptionWell"), fetchValueFromTextFields(descriptionWellTextArea), AssertionType.WARNING);
			}
			//DG
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTagNumber")) {

				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TagNumber"), fetchValueFromTextFields(tagNumberTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigName")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("Name"), fetchValueFromTextFields(nameTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationType")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationType"), fetchValueFromTextFields(identificationTypeTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeYear")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeYear"), fetchValueFromTextFields(ageYearTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAgeMonths")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("AgeMonths"), fetchValueFromTextFields(ageMonthTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValue")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValue"), fetchValueFromTextFields(marketValueTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTexField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSectionsforDogInsurance")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SectionsforDogInsurance"), fetchValueFromList(sectionsForDogInsuranceDropdown), AssertionType.WARNING);
			}
			//DK
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigFlockIdentificationNo")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("FlockIdentificationNo"), fetchValueFromTextFields(flockIdentificationNoTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofDuck")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofDuck"), fetchValueFromTextFields(typeofDuckYDTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNumberOfDucksPerBatch")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NumberOfDucksPerBatch"), fetchValueFromTextFields(numberofDucksPerBatchTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigMarketValuePerBird")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("MarketValuePerBird"), fetchValueFromTextFields(marketValuePerBirdTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForYD")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInForYD"), fetchValueFromTextFields(excessInForYDTextField), AssertionType.WARNING);
			}
			//YI
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPondNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("PondNumber"), fetchValueFromTextFields(pondNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIsFloodProneArea")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IsFloodProneArea"), fetchValueFromTextFields(isFloodProneAreaTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalWaterAreaHectare")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalWaterAreaHectare"), fetchValueFromTextFields(totalWaterAreaHectareTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeofFish")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeofFish"), fetchValueFromList(typeofFishDropdown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalEstimatedWeightofFishKg")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalEstimatedWeightofFishKg"), fetchValueFromTextFields(totalEstimatedWeightofFishKgTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredRsYI")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredRsYI"), fetchValueFromTextFields(sumInsuredRsYITextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigExcessInForSC")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("ExcessInForSC"), fetchValueFromTextFields(excessInForSCTextField), AssertionType.WARNING);
			}
			//YT
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigIdentificationNumber")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("IdentificationNumber"), fetchValueFromTextFields(identificationNumberTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigOwnerOfHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("OwnerOfHut"), fetchValueFromTextFields(ownerofTheHutTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDetailsOfOwner")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("DetailsOfOwner"), fetchValueFromTextFields(detailsOfOwnerTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLocationOfHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LocationOfHut"), fetchValueFromTextFields(locationOfHutTextArea), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSumInsuredOnHut")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("SumInsuredOnHut"), fetchValueFromTextFields(sunInsuredOnHutTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTypeOfCrop")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TypeOfCrop"), fetchValueFromTextFields(typeOfCropDropdown), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigNameOfTheCrop")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("NameOfTheCrop"), fetchValueFromTextFields(nameOfTheCropTextField), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigLossesDueToUnseasonalRains")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("LossesDueToUnseasonalRains"), fetchValueFromTextFields(lossesDueToUnseasonalRainsFrost), AssertionType.WARNING);
			}
			if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigTotalSumInsuredRsYR")) {
				assertReference.assertEquals(preClaimHistCartRuralEntity.getStringValueForField("TotalSumInsuredRsYR"), fetchValueFromTextFields(totalSumInsuredYR), AssertionType.WARNING);
			}
		}
	}

	//*******
	public void proceedToT2CLRForHealthProducts(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity) throws InterruptedException{
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			if(preClaimHistCartRuralEntity.getStringValueForField("Product").equalsIgnoreCase("GR")){
				if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDateOfBirthOfNomineeGR")) {
					selectDateFromCalender(dateOfBirthOfNomineeButton, preClaimHistCartRuralEntity.getStringValueForField("DateOfBirthOfNomineeGR"));
				}
			}
			switchToFrame("display");
			if(!preClaimHistCartRuralEntity.getStringValueForField("Product").equalsIgnoreCase("JP")){
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+preClaimHistCartRuralEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		}
	}	
	public void navigateToMainAttributePage(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("Config BackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void saveto2CLRForHealthProducts(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}	
	public void navigateToclaimHomePage(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredItem")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttribute(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity){
		if (preClaimHistCartRuralEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}

	public void fillandSubmitPreviousClaimHistoryRural(PreClaimHistCartRuralEntity preClaimHistCartRuralEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(preClaimHistCartRuralEntity.getConfigExecute())){
			switchToFrame("display");
			if(preClaimHistCartRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				fillPreviousClaimHistforCartRural(preClaimHistCartRuralEntity, assertReference);
			}
			if(preClaimHistCartRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				fillPreviousClaimHistforCartMicroInsurance(preClaimHistCartRuralEntity, assertReference);
			}
			proceedToT2CLRForHealthProducts(preClaimHistCartRuralEntity);
			saveto2CLRForHealthProducts(preClaimHistCartRuralEntity);
			navigateToMainAttributePage(preClaimHistCartRuralEntity);
			navigateToclaimHomePage(preClaimHistCartRuralEntity);
			navigateToInsuredItem(preClaimHistCartRuralEntity); 
			navigateToDocument(preClaimHistCartRuralEntity);
			navigateToParties(preClaimHistCartRuralEntity);
			navigateToReserve(preClaimHistCartRuralEntity);
			navigateToPayment(preClaimHistCartRuralEntity);
			navigateToAttribute(preClaimHistCartRuralEntity);
			navigateToInsuredItemDetails(preClaimHistCartRuralEntity);
			navigateToInsuredItemAttribute(preClaimHistCartRuralEntity);
		}
	}
}
