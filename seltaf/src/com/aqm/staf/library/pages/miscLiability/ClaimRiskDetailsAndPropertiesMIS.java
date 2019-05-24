package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDetMISEntity;
import com.aqm.staf.library.databin.PolInsIntRiskDetMNLEntity;

public class ClaimRiskDetailsAndPropertiesMIS extends BasePage {


	//*************1ST PAGE LABEL(CHINTAN)***********
	private PageElement claimNumberLabel;		
	private PageElement policyNumberLabel;	
	private PageElement claimDateLabel;	
	private PageElement claimStatusLabel;	
	private PageElement productCodeLabel;	
	private PageElement causeOfLossLabel;	
	private PageElement insuredSerialNoLabel;	
	private PageElement insuredItemCodeLabel;
	private PageElement dateOfLossTextFeild;

	//Label
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
	private PageElement memberSerialNoLabel;
	private PageElement memberCodeLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;

	//Claim Risk Properties
	private PageElement retroactiveDateTextBox;	
	private PageElement	geographicalJurisdictionTextBox;			
	private PageElement	anyOneAccidentTextBox;		
	private PageElement	anyOneYearAndInTheAggregateTextBox;
	private PageElement	deductibleForIndiaTextBox;		
	private PageElement	deductibleForWorldwideExcludingUSAAndCanadaTextBox;			
	private PageElement	deductibleForWorldwideIncludingUSAAndCanadaTextBox;			
	private PageElement	voluntaryExcessTextBox;
	private PageElement nameOftheInjuredWorkmenTextBox;
	//private PageElement ageOrDateOfBirthTextBox;	
	private PageElement natureOfjobOrDutiesTextBox;	
	private PageElement descriptionOfLossOrInjuryTextBox;

	////WC
	private PageElement noofDaysofDisablementTextBox;
	private PageElement percentofDisablementTextBox;
	private PageElement ageDateofBirthFindButton;
	private PageElement ageDateofBirthTextField;
	private PageElement dateOfLossFindButton;



	public ClaimRiskDetailsAndPropertiesMIS(WebDriver driver, String pageName) {
		super(driver, pageName);

		//*************1ST PAGE LABEL(CHINTAN)***********
		claimNumberLabel=new PageElement(By.xpath("//div//b[contains(text(),'number')]/following::td"), "Claim Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		policyNumberLabel=new PageElement(By.xpath("//div//b[contains(text(),'Number')]/following::td"), "Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel=new PageElement(By.xpath("//div//b[contains(text(),' Date')]/following::td"), "Claim Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel=new PageElement(By.xpath("//div//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel=new PageElement(By.xpath("//div//b[contains(text(),'Product Code')]/following::td"), "Product Code'", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel=new PageElement(By.xpath("//div//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel=new PageElement(By.xpath("//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Serial No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel=new PageElement(By.xpath("//div//b[contains(text(),'Insured Item Code')]/following::td"), "Insured Item Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLossTextFeild=new PageElement(By.xpath("//td/div[contains(text(),'Date of loss')]/following::input"), "Date Of Loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//Label
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
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		retroactiveDateTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Retroactive Date')]/following::input"), "Retroactive Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalJurisdictionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Geographical   Jurisdiction')]/following::textarea"), "Geographical Jurisdiction", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOneAccidentTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Any One Accident (AOA)')]/following::input"), "Any One Accident (AOA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOneYearAndInTheAggregateTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Any One Year and in the Aggregate (AOY)')]/following::input"), "Any One Year and in the Aggregate (AOY)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForIndiaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for India')]/following::input"), "Deductible for India", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForWorldwideExcludingUSAAndCanadaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Worldwide (Excluding USA and Canada)')]/following::input"), "Deductible for Worldwide (Excluding USA and Canada)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForWorldwideIncludingUSAAndCanadaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Worldwide (Including USA and Canada)')]/following::input"), "Deductible for Worldwide (Including USA and Canada)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryExcessTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Voluntary Excess')]/following::input"), "Voluntary Excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOftheInjuredWorkmenTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Name of the Injured Workmen')]/following::textarea"), "Name of the Injured Workmen",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//ageOrDateOfBirthTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Age / Date of Birth ')]/following::input"), "Age / Date of Birth ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfjobOrDutiesTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Nature of job/Duties ')]/following::textarea"), "Nature of job/Duties ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionOfLossOrInjuryTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description of Loss / Injury')]/following::textarea"), "Description of Loss / Injury",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//WC
		percentofDisablementTextBox=new PageElement(By.xpath("//td/div[contains(text(),'% of disablement')]/following::textarea"), "% of disablement",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noofDaysofDisablementTextBox=new PageElement(By.xpath("//td/div[contains(text(),'No: of days of disablement')]/following::input"), "No: of days of disablement ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageDateofBirthFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Age / Date of Birth')]/following::img"), "Age / Date of Birth'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageDateofBirthTextField=  new PageElement(By.xpath("//td//div[contains(text(),'Age / Date of Birth')]/following::input"), "Age / Date of Birth", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//ST
		dateOfLossFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Date of loss')]/following::img"), "Date of loss'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	public void fillClaimRiskDetailsMISLDetails(ClaimRiskDetMISEntity claimRiskDetMISEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskDetMISEntity.getAction().equalsIgnoreCase("add") || claimRiskDetMISEntity.getAction().equalsIgnoreCase("edit")){

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDateOfLoss")) {
				click(dateOfLossFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateOfLossTextFeild, claimRiskDetMISEntity.getStringValueForField("DateOfLoss"));
				switchToFrame("display");
			}
		}
		else if(claimRiskDetMISEntity.getAction().equalsIgnoreCase("verify")){

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDateOfLoss")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskDetMISEntity.getStringValueForField("DateOfLoss")), fetchValueFromTextFields(dateOfLossTextFeild), AssertionType.WARNING);
			}
		}

	}

	public void fillClaimRiskDetailsMISL2Details(ClaimRiskDetMISEntity claimRiskDetMISEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskDetMISEntity.getAction().equalsIgnoreCase("add") || claimRiskDetMISEntity.getAction().equalsIgnoreCase("edit")){

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigRetroactiveDate")) {
				String retroactiveDate=RandomCodeGenerator.dateGenerator(claimRiskDetMISEntity.getStringValueForField("RetroactiveDate"));
				clearAndEnterDate(retroactiveDateTextBox, retroactiveDate);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
				clearAndSendKeys(geographicalJurisdictionTextBox, claimRiskDetMISEntity.getStringValueForField("GeographicalJurisdiction"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAnyOneAccident")) {
				clearAndSendKeys(anyOneAccidentTextBox, claimRiskDetMISEntity.getStringValueForField("AnyOneAccident"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregate")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateTextBox, claimRiskDetMISEntity.getStringValueForField("AnyOneYearAndInTheAggregate"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForIndia")) {
				clearAndSendKeys(deductibleForIndiaTextBox, claimRiskDetMISEntity.getStringValueForField("DeductibleForIndia"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanada")) {
				clearAndSendKeys(deductibleForWorldwideExcludingUSAAndCanadaTextBox, claimRiskDetMISEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanada"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanada")) {
				clearAndSendKeys(deductibleForWorldwideIncludingUSAAndCanadaTextBox, claimRiskDetMISEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanada"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextBox, claimRiskDetMISEntity.getStringValueForField("VoluntaryExcess"));
			}	
			//***************NEW POLICY NUMBER*******************
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNameOftheInjuredWorkmen")) {
				clearAndSendKeys(nameOftheInjuredWorkmenTextBox, claimRiskDetMISEntity.getStringValueForField("NameOftheInjuredWorkmen"));
			}	
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAgeOrDateOfBirth")) {
				Thread.sleep(1000);
				click(ageDateofBirthFindButton);
				selectDateFromCalender(ageDateofBirthFindButton, claimRiskDetMISEntity.getStringValueForField("AgeOrDateOfBirth"));
				switchToFrame("display");

			}	
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNatureOfjobOrDuties")) {
				clearAndSendKeys(natureOfjobOrDutiesTextBox, claimRiskDetMISEntity.getStringValueForField("NatureOfjobOrDuties"));
			}	
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDescriptionOfLossOrInjury")) {
				clearAndSendKeys(descriptionOfLossOrInjuryTextBox, claimRiskDetMISEntity.getStringValueForField("DescriptionOfLossOrInjury"));
			}	
			//WC
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNoofdaysofdisablement")) {
				clearAndSendKeys(noofDaysofDisablementTextBox, claimRiskDetMISEntity.getStringValueForField("Noofdaysofdisablement"));
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigPercentofdisablement")) {
				clearAndSendKeys(percentofDisablementTextBox, claimRiskDetMISEntity.getStringValueForField("Percentofdisablement"));
			}
		}
		else if(claimRiskDetMISEntity.getAction().equalsIgnoreCase("verify")){

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigpolicyNumber")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigclaimDate")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("ClaimDate"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("InsuredSerialNo"), fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("InsuredItemCode"), fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("GeographicalJurisdiction"), fetchValueFromTextFields(geographicalJurisdictionTextBox), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAnyOneAccident")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("AnyOneAccident"), fetchValueFromTextFields(anyOneAccidentTextBox), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregate")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("AnyOneYearAndInTheAggregate"), fetchValueFromTextFields(anyOneYearAndInTheAggregateTextBox), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForIndia")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("DeductibleForIndia"), fetchValueFromTextFields(deductibleForIndiaTextBox), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanada")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanada"), fetchValueFromTextFields(deductibleForWorldwideExcludingUSAAndCanadaTextBox), AssertionType.WARNING);
			}

			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanada")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanada"), fetchValueFromTextFields(deductibleForWorldwideIncludingUSAAndCanadaTextBox), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextBox), AssertionType.WARNING);
			}
			//***************NEW POLICY NUMBER*******************
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNameOftheInjuredWorkmen")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("NameOftheInjuredWorkmen"), fetchValueFromTextFields(nameOftheInjuredWorkmenTextBox), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAgeOrDateOfBirth")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskDetMISEntity.getStringValueForField("AgeOrDateOfBirth")), fetchValueFromTextFields(ageDateofBirthTextField), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNatureOfjobOrDuties")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("NatureOfjobOrDuties"), fetchValueFromTextFields(natureOfjobOrDutiesTextBox), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDescriptionOfLossOrInjury")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("DescriptionOfLossOrInjury"), fetchValueFromTextFields(descriptionOfLossOrInjuryTextBox), AssertionType.WARNING);
			}
			//WC
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNoofdaysofdisablement")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("Noofdaysofdisablement"), fetchValueFromTextFields(noofDaysofDisablementTextBox), AssertionType.WARNING);
			}
			if (claimRiskDetMISEntity.getBooleanValueForField("ConfigPercentofdisablement")) {
				assertReference.assertEquals(claimRiskDetMISEntity.getStringValueForField("Percentofdisablement"), fetchValueFromTextFields(percentofDisablementTextBox), AssertionType.WARNING);
			}
		}
	}
	public void proceedToT2CLRForHealthProducts(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskDetMISEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void proceedToT2CLRForHealthProducts2(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskDetMISEntity.getStringValueForField("ClaimT3PropertyForST")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigateToMainAttributePage(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigInsuredItem")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttribute(ClaimRiskDetMISEntity claimRiskDetMISEntity){
		if (claimRiskDetMISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimRiskDetailsMISLDetails(ClaimRiskDetMISEntity claimRiskDetMISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskDetMISEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskDetailsMISLDetails(claimRiskDetMISEntity, assertReference);
			if(claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PD")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("ST")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PK")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PL")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("IT")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("IN")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PP")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PR")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("CO")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("CT")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("DO")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("PF")||claimRiskDetMISEntity.getStringValueForField("Product").equalsIgnoreCase("LN")){
				proceedToT2CLRForHealthProducts(claimRiskDetMISEntity);
			}
			fillClaimRiskDetailsMISL2Details(claimRiskDetMISEntity, assertReference);
			proceedToT2CLRForHealthProducts2(claimRiskDetMISEntity);
			navigateToMainAttributePage(claimRiskDetMISEntity);
			navigateToclaimHomePage(claimRiskDetMISEntity);
			navigateToInsuredItem(claimRiskDetMISEntity);  // insureditem
			navigateToDocument(claimRiskDetMISEntity);
			navigateToParties(claimRiskDetMISEntity);
			navigateToReserve(claimRiskDetMISEntity);
			navigateToPayment(claimRiskDetMISEntity);
			navigateToAttribute(claimRiskDetMISEntity);
			navigateToInsuredItemDetails(claimRiskDetMISEntity); // insureditem
			navigateToInsuredItemAttribute(claimRiskDetMISEntity);
		}
	}
}
















