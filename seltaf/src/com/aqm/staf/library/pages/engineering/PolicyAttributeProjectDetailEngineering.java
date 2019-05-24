package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.ProjectDetailEngEntity;

public class PolicyAttributeProjectDetailEngineering extends BasePage{

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

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

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
	private PageElement backwardButton;
	//------------------------------------------------------------------------
	//Mayur_Product name=LE
	private PageElement descriptionOfProjectDescription1TextArea;
	private PageElement descriptionOfProjectDescription2TextArea;
	private PageElement descriptionOfProjectDescription3TextArea;
	private PageElement locationDetails1OfProjectTextArea;
	private PageElement locationDetails2OfProjectTextArea;
	private PageElement projectScheduleTextArea;
	private PageElement recentEarthquakeHistoryTextArea;
	private PageElement climaticDataIncludingRainFallNormalRainySeasonWindSpeedAndSnowfallIfApplicableTextArea;
	private PageElement distanceToNearestRiverLakeOrCostAsWellAsTheElevationOfLowestSiteLevelComparedToNormalHighWatermarkTextArea;
	private PageElement policyToBeInsuredInFavorOfDropDown;
	private PageElement coInsuranceApplicableDropDown;
	private PageElement whetherTheLargeRiskProjectIsSituatedInSEZDropDown;
	//Mayur_Product name=LW
	private PageElement sumInsuredTextField;
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement timeExcessInDaysTextField;
	private PageElement indemnityBasisDropDown;
	private PageElement quantityAdjustmentFactorToBeInterpolatedFromTheGraphTextField;
	private PageElement qualityOfPlantDropDown;
	private PageElement lossMinimizationMethodsDropDown;
	private PageElement higherTimeExcessInDaysTextField;
	private PageElement windmillInsurancePolicyDetailsButton;
	private PageElement locationDetailsButton;
	private PageElement fireRateApplicableincludingAddOnCoverTextField;
	private PageElement fLOPRateTextField;
	private PageElement windMillMLOPRateTextField;
	private PageElement windmillPackageLOPRateTextField;

	private PageElement locationNameTextField;
	private PageElement policyNumberTextField;
	private PageElement policyPeriodFromTextField;
	private PageElement policyPeriodToTextField;
	private PageElement sumInsuredWindowTextField;
	private PageElement nameOfTheInsurerTextField;
	private PageElement riskLocationNameTextField;
	private PageElement workAddress1TextArea; 
	private PageElement workAddress2TextArea; 
	private PageElement locationPinCodeTextField;
	private PageElement locationStateTextField;
	private PageElement locationDistrictTextField;
	private PageElement deleteWindowButton;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;
	//LM
	private PageElement machineryInsPolDetButton;
	public PolicyAttributeProjectDetailEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
		//Mayur_Product name=LE
		descriptionOfProjectDescription1TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description1')]/following::textarea"), "Description of Project - Description1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description2')]/following::textarea"), "Description of Project - Description3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription3TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description3')]/following::textarea"), "Description of Project - Description3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails1OfProjectTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Location details 1 of Project')]/following::textarea"), "Location details 1 of Project TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails2OfProjectTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Location details 2 of Project')]/following::textarea"), "Location details 2 of Project TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		projectScheduleTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Project Schedule')]/following::textarea"), "Project Schedule TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		recentEarthquakeHistoryTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Recent Earthquake History')]/following::textarea"), "Recent Earthquake History TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		climaticDataIncludingRainFallNormalRainySeasonWindSpeedAndSnowfallIfApplicableTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Climatic data Including rain fall, normal rainy season, wind speed and snowfall if applicable')]/following::textarea"), "Climatic data Including rain fall, normal rainy season, wind speed and snowfall if applicable TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceToNearestRiverLakeOrCostAsWellAsTheElevationOfLowestSiteLevelComparedToNormalHighWatermarkTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Distance to nearest river, lake or cost as well as the elevation of lowest site level compared to normal high watermark')]/following::textarea"), "Distance to nearest river, lake or cost as well as the elevation of lowest site level compared to normal high watermark TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyToBeInsuredInFavorOfDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Policy To Be Insured In Favor Of')]/following::select"), "Policy To Be Insured In Favor Of DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheLargeRiskProjectIsSituatedInSEZDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the Large Risk Project is situated in SEZ')]/following::textarea"), "Whether the Large Risk Project is situated in SEZ DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product name=LW
		sumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodInMonthsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period (in Months)')]/following::input"), "Indemnity Period (in Months) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeExcessInDaysTextField= new PageElement(By.xpath("//td//div[contains(text(),'Time Excess (in Days)')]/following::input"), "Time Excess (in Days) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityBasisDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Basis')]/following::select"), "Indemnity Basis DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		quantityAdjustmentFactorToBeInterpolatedFromTheGraphTextField= new PageElement(By.xpath("//td//div[contains(text(),'Quantity Adjustment Factor')]/following::input"), "Quantity Adjustment Factor (To be interpolated from the Graph) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		qualityOfPlantDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Quality of Plant')]/following::select"), "Quality of Plant DropDown ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lossMinimizationMethodsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Loss Minimization Methods')]/following::select"), "Loss Minimization Methods DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		higherTimeExcessInDaysTextField= new PageElement(By.xpath("//td//div[contains(text(),'Higher Time Excess (in Days)')]/following::input"), "Higher Time Excess (in Days) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		windmillInsurancePolicyDetailsButton=new PageElement(By.xpath("//td//div[contains(text(),'Windmill Insurance Policy Details')]/following::input"), "Windmill Insurance Policy Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Location Details')]/following::input"), "Location Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fireRateApplicableincludingAddOnCoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Fire Rate Applicable including Add on Cover')]/following::input"), "Fire Rate Applicable including Add on Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fLOPRateTextField= new PageElement(By.xpath("//td//div[contains(text(),'FLOP Rate')]/following::input"), "FLOP Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		windMillMLOPRateTextField= new PageElement(By.xpath("//td//div[contains(text(),'WindMill MLOP Rate')]/following::input"), "WindMill MLOP Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		windmillPackageLOPRateTextField= new PageElement(By.xpath("//td//div[contains(text(),'Windmill Package LOP Rate')]/following::input"), "Windmill Package LOP Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		deleteWindowButton= new PageElement(By.name("btnDel"), "Delete button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addWindowButton= new PageElement(By.name("btnAdd"), "Add button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton= new PageElement(By.name("btnSave"), "Save button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton= new PageElement(By.name("btnClose"), "Close button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationNameTextField= new PageElement(By.name("Data_13867814092004_0"), "Location Name TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberTextField= new PageElement(By.name("Data_19567605122002_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodFromTextField= new PageElement(By.name("Data_213843405022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodToTextField= new PageElement(By.name("Data_213843505022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredWindowTextField= new PageElement(By.name("Data_37050905042005_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheInsurerTextField= new PageElement(By.name("Data_51623230062005_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskLocationNameTextField= new PageElement(By.name("Data_213836705022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		workAddress1TextArea= new PageElement(By.name("Data_213843605022010_0"), " Policy Number TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		workAddress2TextArea= new PageElement(By.name("Data_213843705022010_0"), " Policy Number TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationPinCodeTextField= new PageElement(By.name("Data_213843805022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationStateTextField= new PageElement(By.name("Data_213843905022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDistrictTextField= new PageElement(By.name("Data_213844005022010_0"), " Policy Number TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	forwardButton=new PageElement(By.name("Next"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		forwardButton = new PageElement(By.xpath("//input[@name='Next']"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//LM
		machineryInsPolDetButton= new PageElement(By.xpath("//td//div[contains(text(),'Machinery Insurance Policy Details')]/following::input"), "Machinery Insurance Policy Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillProjectDetailEngineering(ProjectDetailEngEntity projectDetailEngEntity, CustomAssert assertReference) throws InterruptedException{
		if(projectDetailEngEntity.getAction().equalsIgnoreCase("add") || projectDetailEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=LE
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				clearAndSendKeys(descriptionOfProjectDescription1TextArea, projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription1"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				clearAndSendKeys(descriptionOfProjectDescription2TextArea, projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription2"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				clearAndSendKeys(descriptionOfProjectDescription3TextArea, projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription3"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetails1OfProject")) {
				clearAndSendKeys(locationDetails1OfProjectTextArea, projectDetailEngEntity.getStringValueForField("LocationDetails1OfProject"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetails2OfProject")) {
				clearAndSendKeys(locationDetails2OfProjectTextArea, projectDetailEngEntity.getStringValueForField("LocationDetails2OfProject"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigProjectSchedule")) {
				clearAndSendKeys(projectScheduleTextArea, projectDetailEngEntity.getStringValueForField("ProjectSchedule"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigRecentEarthquakeHistory")) {
				clearAndSendKeys(recentEarthquakeHistoryTextArea, projectDetailEngEntity.getStringValueForField("RecentEarthquakeHistory"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigClimaticDataIncludingRainFall")) {
				clearAndSendKeys(climaticDataIncludingRainFallNormalRainySeasonWindSpeedAndSnowfallIfApplicableTextArea, projectDetailEngEntity.getStringValueForField("ClimaticDataIncludingRainFall"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDistanceToNearestRiverLake")) {
				clearAndSendKeys(distanceToNearestRiverLakeOrCostAsWellAsTheElevationOfLowestSiteLevelComparedToNormalHighWatermarkTextArea, projectDetailEngEntity.getStringValueForField("DistanceToNearestRiverLake"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyToBeInsuredInFavorOf")) {
				selectValueFromList(policyToBeInsuredInFavorOfDropDown, projectDetailEngEntity.getStringValueForField("PolicyToBeInsuredInFavorOf"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, projectDetailEngEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWhetherTheLargeRiskProjectIsSituatedInSEZ")) {
				selectValueFromList(whetherTheLargeRiskProjectIsSituatedInSEZDropDown, projectDetailEngEntity.getStringValueForField("WhetherTheLargeRiskProjectIsSituatedInSEZ"));
			}
			//Mayur_Product name=LW
			if (projectDetailEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, projectDetailEngEntity.getStringValueForField("SumInsured"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, projectDetailEngEntity.getStringValueForField("IndemnityPeriodInMonths"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigTimeExcessInDays")) {
				clearAndSendKeys(timeExcessInDaysTextField, projectDetailEngEntity.getStringValueForField("TimeExcessInDays"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigIndemnityBasis")) {
				selectValueFromList(indemnityBasisDropDown, projectDetailEngEntity.getStringValueForField("IndemnityBasis"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigQuantityAdjustmentFactor")) {
				clearAndSendKeys(quantityAdjustmentFactorToBeInterpolatedFromTheGraphTextField, projectDetailEngEntity.getStringValueForField("QuantityAdjustmentFactor"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigQualityOfPlant")) {
				selectValueFromList(qualityOfPlantDropDown, projectDetailEngEntity.getStringValueForField("QualityOfPlant"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLossMinimizationMethods")) {
				selectValueFromList(lossMinimizationMethodsDropDown, projectDetailEngEntity.getStringValueForField("LossMinimizationMethods"));
			}

			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindmillInsurancePolicyDetails")) {
				fillWindmillInsurancePolicyDetails(projectDetailEngEntity);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigFLOPRate")) {
				clearAndSendKeys(fLOPRateTextField, projectDetailEngEntity.getStringValueForField("FLOPRate"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindMillMLOPRate")) {
				clearAndSendKeys(windMillMLOPRateTextField, projectDetailEngEntity.getStringValueForField("WindMillMLOPRate"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindmillPackageLOPRate")) {
				clearAndSendKeys(windmillPackageLOPRateTextField, projectDetailEngEntity.getStringValueForField("WindmillPackageLOPRate"));
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetailsButton")) {
				fillParameterListForLocationDetails(projectDetailEngEntity);
			}

		}
		else if(projectDetailEngEntity.getAction().equalsIgnoreCase("verify")){
			if (projectDetailEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription1"), fetchValueFromTextFields(descriptionOfProjectDescription1TextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription2"), fetchValueFromTextFields(descriptionOfProjectDescription2TextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("DescriptionOfProjectDescription3"), fetchValueFromTextFields(descriptionOfProjectDescription3TextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetails1OfProject")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationDetails1OfProject"), fetchValueFromTextFields(locationDetails1OfProjectTextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetails2OfProject")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationDetails2OfProject"), fetchValueFromTextFields(locationDetails2OfProjectTextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigProjectSchedule")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("ProjectSchedule"), fetchValueFromTextFields(projectScheduleTextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigRecentEarthquakeHistory")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("RecentEarthquakeHistory"), fetchValueFromTextFields(recentEarthquakeHistoryTextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigClimaticDataIncludingRainFall")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("ClimaticDataIncludingRainFall"), fetchValueFromTextFields(climaticDataIncludingRainFallNormalRainySeasonWindSpeedAndSnowfallIfApplicableTextArea), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigDistanceToNearestRiverLake")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("DistanceToNearestRiverLake"), fetchValueFromTextFields(distanceToNearestRiverLakeOrCostAsWellAsTheElevationOfLowestSiteLevelComparedToNormalHighWatermarkTextArea), AssertionType.WARNING);	
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyToBeInsuredInFavorOf")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("PolicyToBeInsuredInFavorOf"), fetchValueFromList(policyToBeInsuredInFavorOfDropDown), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWhetherTheLargeRiskProjectIsSituatedInSEZ")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WhetherTheLargeRiskProjectIsSituatedInSEZ"), fetchValueFromList(whetherTheLargeRiskProjectIsSituatedInSEZDropDown), AssertionType.WARNING);
			}
			//Mayur_Product name=LW
			if (projectDetailEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigTimeExcessInDays")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("TimeExcessInDays"), fetchValueFromTextFields(timeExcessInDaysTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigIndemnityBasis")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("IndemnityBasis"), fetchValueFromList(indemnityBasisDropDown), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigQuantityAdjustmentFactor")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("QuantityAdjustmentFactor"), fetchValueFromTextFields(quantityAdjustmentFactorToBeInterpolatedFromTheGraphTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigQualityOfPlant")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("QualityOfPlant"), fetchValueFromList(qualityOfPlantDropDown), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLossMinimizationMethods")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LossMinimizationMethods"), fetchValueFromList(lossMinimizationMethodsDropDown), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigHigherTimeExcessInDays")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("HigherTimeExcessInDays"), fetchValueFromTextFields(higherTimeExcessInDaysTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigFireRateApplicableincludingAddOnCover")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("FireRateApplicableincludingAddOnCover"), fetchValueFromTextFields(fireRateApplicableincludingAddOnCoverTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigFLOPRate")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("FLOPRate"), fetchValueFromTextFields(fLOPRateTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindMillMLOPRate")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WindMillMLOPRate"), fetchValueFromTextFields(windMillMLOPRateTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindmillPackageLOPRate")) {
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WindmillPackageLOPRate"), fetchValueFromTextFields(windmillPackageLOPRateTextField), AssertionType.WARNING);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigWindmillInsurancePolicyDetails")) {
				verifyWindmillInsurancePolicyDetails(projectDetailEngEntity, assertReference);
			}
			if (projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetailsButton")) {
				verifyParameterListForLocationDetails(projectDetailEngEntity,assertReference);
				 			}
		}
	}

	public void clickToOpenButton(ProjectDetailEngEntity projectDetailEngEntity) throws InterruptedException{
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLindmillInsurancePolicyDetailsButton")){
			click(windmillInsurancePolicyDetailsButton);
			switchToWindow("'Windmill Insurance Policy Details' Details");
		}
		
		
		if(projectDetailEngEntity.getBooleanValueForField("ConfigMachineryInsPolDetButton")){
			click(machineryInsPolDetButton);
			switchToWindow("'Machinery Insurance Policy Details' Details");
			}
	}

	public void clickToOpenLocationDetailsButton(ProjectDetailEngEntity projectDetailEngEntity) throws InterruptedException{
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationDetailsButton")){
			click(locationDetailsButton);
			switchToWindow("Parameter List for Installment Percentage List");
		}
	}
	public void fillWindmillInsurancePolicyDetails(ProjectDetailEngEntity projectDetailEngEntity) throws InterruptedException{
		clickToOpenButton(projectDetailEngEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if(projectDetailEngEntity.getBooleanValueForField("ConfigPolicyNumber")){
			clearAndSendKeys(policyNumberTextField,projectDetailEngEntity.getStringValueForField("PolicyNumber"));
		}
		if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyPeriodFrom")) {
			String dateofIntimation=RandomCodeGenerator.dateGenerator(projectDetailEngEntity.getStringValueForField("PolicyPeriodFrom"));
			clearAndEnterDate(policyPeriodFromTextField, dateofIntimation);
		}
		if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyPeriodTo")) {
			String dateofIntimation=RandomCodeGenerator.dateGenerator(projectDetailEngEntity.getStringValueForField("PolicyPeriodTo"));
			clearAndEnterDate(policyPeriodToTextField, dateofIntimation);
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigSumInsuredWindow")){
			clearAndSendKeys(sumInsuredWindowTextField,projectDetailEngEntity.getStringValueForField("SumInsuredWindow"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigNameOfTheInsurer")){
			clearAndSendKeys(nameOfTheInsurerTextField,projectDetailEngEntity.getStringValueForField("NameOfTheInsurer"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigRiskLocationName")){
			clearAndSendKeys(riskLocationNameTextField,projectDetailEngEntity.getStringValueForField("RiskLocationName"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress1")){
			clearAndSendKeys(workAddress1TextArea,projectDetailEngEntity.getStringValueForField("WorkAddress1"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress2")){
			clearAndSendKeys(workAddress2TextArea,projectDetailEngEntity.getStringValueForField("WorkAddress2"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationPinCode")){
			clearAndSendKeys(locationPinCodeTextField,projectDetailEngEntity.getStringValueForField("LocationPinCode"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationState")){
			clearAndSendKeys(locationStateTextField,projectDetailEngEntity.getStringValueForField("LocationState"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationDistrict")){
			clearAndSendKeys(locationDistrictTextField,projectDetailEngEntity.getStringValueForField("LocationDistrict"));
		}

		if(projectDetailEngEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);

		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyWindmillInsurancePolicyDetails(ProjectDetailEngEntity projectDetailEngEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(projectDetailEngEntity);

		if(projectDetailEngEntity.getAction().equalsIgnoreCase("verify")){
			if(projectDetailEngEntity.getBooleanValueForField("ConfigPolicyNumber")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigPolicyPeriodFrom")){
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(projectDetailEngEntity.getStringValueForField("PolicyPeriodFrom")) ,fetchValueFromTextFields(policyPeriodFromTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigPolicyPeriodTo")){
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(projectDetailEngEntity.getStringValueForField("PolicyPeriodTo")) ,fetchValueFromTextFields(policyPeriodToTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigSumInsuredWindow")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("SumInsuredWindow"), fetchValueFromTextFields(sumInsuredWindowTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigRiskLocationName")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("RiskLocationName"), fetchValueFromTextFields(riskLocationNameTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigNameOfTheInsurer")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("NameOfTheInsurer"), fetchValueFromTextFields(nameOfTheInsurerTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigRiskLocationName")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("RiskLocationName"), fetchValueFromTextFields(riskLocationNameTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress1")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WorkAddress1"), fetchValueFromTextFields(workAddress1TextArea), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress2")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WorkAddress2"), fetchValueFromTextFields(workAddress2TextArea), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationPinCode")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationPinCode"), fetchValueFromTextFields(locationPinCodeTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationState")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationState"), fetchValueFromTextFields(locationStateTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationDistrict")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationDistrict"), fetchValueFromTextFields(locationDistrictTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigCloseWindowButton")){
				click(closeWindowButton);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	} 


	
	public void fillParameterListForLocationDetails(ProjectDetailEngEntity projectDetailEngEntity) throws InterruptedException{
		clickToOpenLocationDetailsButton(projectDetailEngEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationName")){
			clearAndSendKeys(locationNameTextField,projectDetailEngEntity.getStringValueForField("LocationName"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress1")){
			clearAndSendKeys(workAddress1TextArea,projectDetailEngEntity.getStringValueForField("WorkAddress1"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress2")){
			clearAndSendKeys(workAddress2TextArea,projectDetailEngEntity.getStringValueForField("WorkAddress2"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationPinCode")){
			clearAndSendKeys(locationPinCodeTextField,projectDetailEngEntity.getStringValueForField("LocationPinCode"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationState")){
			clearAndSendKeys(locationStateTextField,projectDetailEngEntity.getStringValueForField("LocationState"));
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationDistrict")){
			clearAndSendKeys(locationDistrictTextField,projectDetailEngEntity.getStringValueForField("LocationDistrict"));
		}

		if(projectDetailEngEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
		}
		if(projectDetailEngEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyParameterListForLocationDetails(ProjectDetailEngEntity projectDetailEngEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenLocationDetailsButton(projectDetailEngEntity);

		if(projectDetailEngEntity.getAction().equalsIgnoreCase("verify")){
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationName")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationName"), fetchValueFromTextFields(locationNameTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress1")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WorkAddress1"), fetchValueFromTextFields(workAddress1TextArea), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigWorkAddress2")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("WorkAddress2"), fetchValueFromTextFields(workAddress2TextArea), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationPinCode")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationPinCode"), fetchValueFromTextFields(locationPinCodeTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationState")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationState"), fetchValueFromTextFields(locationStateTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigLocationDistrict")){
				assertReference.assertEquals(projectDetailEngEntity.getStringValueForField("LocationDistrict"), fetchValueFromTextFields(locationDistrictTextField), AssertionType.WARNING);
			}
			if(projectDetailEngEntity.getBooleanValueForField("ConfigCloseWindowButton")){
				click(closeWindowButton);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	} 


	public void navigateToPolicy(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void clickOnBackButton(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(ProjectDetailEngEntity projectDetailEngEntity){
		if (projectDetailEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(ProjectDetailEngEntity projectDetailEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(projectDetailEngEntity.getConfigExecute())){
			fillProjectDetailEngineering(projectDetailEngEntity, assertReference);
			clickOnForwardButton(projectDetailEngEntity);
			navigateToPolicy(projectDetailEngEntity);
			navigateToAttribute(projectDetailEngEntity);
			navigateToInsuredInterest(projectDetailEngEntity);
			navigateToCoverage(projectDetailEngEntity);
			navigateToLoan(projectDetailEngEntity);
			navigateToClientDetails(projectDetailEngEntity);
			navigateToRelation(projectDetailEngEntity);
			navigateToPayment(projectDetailEngEntity);
			navigateToFollowup(projectDetailEngEntity);
			navigateToDocument(projectDetailEngEntity);
		}
	}	
}
