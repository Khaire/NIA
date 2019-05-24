package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDetMISEntity;
import com.aqm.staf.library.databin.ClaimRiskPropMISEntity;
import com.aqm.staf.library.databin.T5ClaimPropLiab1MISEntity;

public class ClaimRiskPropertiesMIS extends BasePage {
	//*******************2ND PAGE Claim Risk Properties (CHINTAN)********************
	private PageElement retroactiveDateTextBox;	
	private PageElement	geographicalJurisdictionTextBox;			
	private PageElement	anyOneAccidentTextBox;		
	private PageElement	anyOneYearAndInTheAggregateTextBox;
	private PageElement	deductibleForIndiaTextBox;		
	private PageElement	deductibleForWorldwideExcludingUSAAndCanadaTextBox;			
	private PageElement	deductibleForWorldwideIncludingUSAAndCanadaTextBox;			
	private PageElement	voluntaryExcessTextBox;

	//old
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
	private PageElement claimNumberLabel;		
	private PageElement policyNumberLabel;	
	private PageElement claimDateLabel;	
	private PageElement claimStatusLabel;	
	private PageElement productCodeLabel;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement nextPageTitle;
	private PageElement  memberSerialNoLabel;
	private PageElement  memberCodeLabel;
	private PageElement  applicableEventCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;

	//***************NEW POLICY NUMBER*******************
	private PageElement nameOftheInjuredWorkmenTextBox;
	private PageElement ageOrDateOfBirthTextBox;	
	private PageElement natureOfjobOrDutiesTextBox;	
	private PageElement descriptionOfLossOrInjuryTextBox;
	
	
	
	

	public ClaimRiskPropertiesMIS(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		//*******************2ND PAGE Claim Risk Properties (CHINTAN)********************
		retroactiveDateTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Retroactive Date')]/following::input"), "Retroactive Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalJurisdictionTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Geographical   Jurisdiction')]/following::textarea"), "Geographical Jurisdiction", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOneAccidentTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Any One Accident (AOA)')]/following::input"), "Any One Accident (AOA)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOneYearAndInTheAggregateTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Any One Year and in the Aggregate (AOY)')]/following::input"), "Any One Year and in the Aggregate (AOY)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForIndiaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for India')]/following::input"), "Deductible for India", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForWorldwideExcludingUSAAndCanadaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Worldwide (Excluding USA and Canada)')]/following::input"), "Deductible for Worldwide (Excluding USA and Canada)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForWorldwideIncludingUSAAndCanadaTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Worldwide (Including USA and Canada)')]/following::input"), "Deductible for Worldwide (Including USA and Canada)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voluntaryExcessTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Voluntary Excess')]/following::input"), "Voluntary Excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//old
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

		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel =new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 




		//***************NEW POLICY NUMBER*******************

		nameOftheInjuredWorkmenTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Name of the Injured Workmen')]/following::textarea"), "Name of the Injured Workmen",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageOrDateOfBirthTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Age / Date of Birth ')]/following::input"), "Age / Date of Birth ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfjobOrDutiesTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Nature of job/Duties ')]/following::textarea"), "Nature of job/Duties ",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionOfLossOrInjuryTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Description of Loss / Injury')]/following::textarea"), "Description of Loss / Injury",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
     
			}

	public void fillClaimRiskPropertiesMISDetails(ClaimRiskPropMISEntity claimRiskPropMISEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskPropMISEntity.getAction().equalsIgnoreCase("add") || claimRiskPropMISEntity.getAction().equalsIgnoreCase("edit")){

			//*******************2ND PAGE Claim Risk Properties (CHINTAN)********************
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
				clearAndSendKeys(geographicalJurisdictionTextBox, claimRiskPropMISEntity.getStringValueForField("GeographicalJurisdiction"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAnyOneAccident")) {
				clearAndSendKeys(anyOneAccidentTextBox, claimRiskPropMISEntity.getStringValueForField("AnyOneAccident"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregate")) {
				clearAndSendKeys(anyOneYearAndInTheAggregateTextBox, claimRiskPropMISEntity.getStringValueForField("AnyOneYearAndInTheAggregate"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForIndia")) {
				clearAndSendKeys(deductibleForIndiaTextBox, claimRiskPropMISEntity.getStringValueForField("DeductibleForIndia"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanada")) {
				clearAndSendKeys(deductibleForWorldwideExcludingUSAAndCanadaTextBox, claimRiskPropMISEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanada"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanada")) {
				clearAndSendKeys(deductibleForWorldwideIncludingUSAAndCanadaTextBox, claimRiskPropMISEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanada"));
			}
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextBox, claimRiskPropMISEntity.getStringValueForField("VoluntaryExcess"));
			}	
			//***************NEW POLICY NUMBER*******************
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigNameOftheInjuredWorkmen")) {
				clearAndSendKeys(nameOftheInjuredWorkmenTextBox, claimRiskPropMISEntity.getStringValueForField("NameOftheInjuredWorkmen"));
			}	
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAgeOrDateOfBirth")) {
				clearAndSendKeys(ageOrDateOfBirthTextBox, claimRiskPropMISEntity.getStringValueForField("AgeOrDateOfBirth"));
			}	
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigNatureOfjobOrDuties")) {
				clearAndSendKeys(natureOfjobOrDutiesTextBox, claimRiskPropMISEntity.getStringValueForField("NatureOfjobOrDuties"));
			}	
			if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDescriptionOfLossOrInjury")) {
				clearAndSendKeys(descriptionOfLossOrInjuryTextBox, claimRiskPropMISEntity.getStringValueForField("DescriptionOfLossOrInjury"));
			}
			
			
			else if(claimRiskPropMISEntity.getAction().equalsIgnoreCase("verify")){
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigGeographicalJurisdiction")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("GeographicalJurisdiction"), fetchValueFromTextFields(geographicalJurisdictionTextBox), AssertionType.WARNING);
				}

				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAnyOneAccident")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("AnyOneAccident"), fetchValueFromTextFields(anyOneAccidentTextBox), AssertionType.WARNING);
				}

				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAnyOneYearAndInTheAggregate")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("AnyOneYearAndInTheAggregate"), fetchValueFromTextFields(anyOneYearAndInTheAggregateTextBox), AssertionType.WARNING);
				}

				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForIndia")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("DeductibleForIndia"), fetchValueFromTextFields(deductibleForIndiaTextBox), AssertionType.WARNING);
				}

				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideExcludingUSAAndCanada")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("DeductibleForWorldwideExcludingUSAAndCanada"), fetchValueFromTextFields(deductibleForWorldwideExcludingUSAAndCanadaTextBox), AssertionType.WARNING);
				}

				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDeductibleForWorldwideIncludingUSAAndCanada")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("DeductibleForWorldwideIncludingUSAAndCanada"), fetchValueFromTextFields(deductibleForWorldwideIncludingUSAAndCanadaTextBox), AssertionType.WARNING);
				}
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextBox), AssertionType.WARNING);
				}
				//***************NEW POLICY NUMBER*******************
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigNameOftheInjuredWorkmen")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("NameOftheInjuredWorkmen"), fetchValueFromTextFields(nameOftheInjuredWorkmenTextBox), AssertionType.WARNING);
				}
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAgeOrDateOfBirth")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("AgeOrDateOfBirth"), fetchValueFromTextFields(ageOrDateOfBirthTextBox), AssertionType.WARNING);
				}
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigNatureOfjobOrDuties")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("NatureOfjobOrDuties"), fetchValueFromTextFields(natureOfjobOrDutiesTextBox), AssertionType.WARNING);
				}
				if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDescriptionOfLossOrInjury")) {
					assertReference.assertEquals(claimRiskPropMISEntity.getStringValueForField("DescriptionOfLossOrInjury"), fetchValueFromTextFields(descriptionOfLossOrInjuryTextBox), AssertionType.WARNING);
				}
				
				

			}
		}

	}

	public void proceedToT2CLRForHealthProducts(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskPropMISEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigInsuredItem")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttribute(ClaimRiskPropMISEntity claimRiskPropMISEntity){
		if (claimRiskPropMISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitfillClaimRiskPropertiesMISDetails(ClaimRiskPropMISEntity claimRiskPropMISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskPropMISEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskPropertiesMISDetails(claimRiskPropMISEntity, assertReference);
			proceedToT2CLRForHealthProducts(claimRiskPropMISEntity);
			navigateToMainAttributePage(claimRiskPropMISEntity);
			navigateToclaimHomePage(claimRiskPropMISEntity);
			navigateToInsuredItem(claimRiskPropMISEntity);  // insureditem
			navigateToDocument(claimRiskPropMISEntity);
			navigateToParties(claimRiskPropMISEntity);
			navigateToReserve(claimRiskPropMISEntity);
			navigateToPayment(claimRiskPropMISEntity);
			navigateToAttribute(claimRiskPropMISEntity);
			navigateToInsuredItemDetails(claimRiskPropMISEntity); // insureditem
			navigateToInsuredItemAttribute(claimRiskPropMISEntity);
		}
	}

}




