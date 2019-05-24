package com.aqm.staf.library.pages.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyEntityReinsurance;

public class PartyDetailsCreateEditPageReinsurance extends BasePage
{

	private PageElement partyDetailsTitle;
	private PageElement patyCodeTextField;
	private PageElement businessNameTextField;
	private PageElement registrationDate;
	private PageElement rating;
	private PageElement liquidationRadioButton;
	private PageElement approvedIndRadioButton;
	private PageElement parentPartyCode;
	private PageElement currency;
	private PageElement irdaRegistrationNo;
	private PageElement panNo;
	private PageElement irdaURNNo;
	private PageElement registrationNo;	;
	private PageElement typeOfOrganizationFindButton;
	private PageElement ratingAgency;
	private PageElement reasonforLiquidation;
	private PageElement vulnerableInd;
	private PageElement geographicalAreaFindButton;
	private PageElement description;
	private PageElement irdaFRN;
	private PageElement tanNo;
	private PageElement expiryDate;
	private PageElement firstNameTextField;
	private PageElement surnameTextField;
	private PageElement saveButton;
	private PageElement cancelButton;
	private PageElement typeOfOrganizationalLink;
	private PageElement geographicalAreaLink;
	

	public PartyDetailsCreateEditPageReinsurance(WebDriver driver, String pageName)
	{
		super(driver,pageName);


		//Common fields

		partyDetailsTitle = new PageElement(By.xpath("//tr//th[contains(text(),'Party Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		patyCodeTextField = new PageElement(By.xpath("//input[contains(@name,'txtPartyCode')]"), "PatyCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalAreaFindButton = new PageElement(By.xpath("//input[contains(@name,'btnGEO')]"), "GeographicalArea", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton = new PageElement(By.id("idbtnSave"), "SaveButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cancelButton = new PageElement(By.id("idbtnCancel1"), "CancelButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//Organization

		businessNameTextField = new PageElement(By.id("idtxtBusinessName_xxx_"), "BusinessName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfOrganizationFindButton = new PageElement(By.id("idbtnFindOrgType_xxx_"), "TypeOfOrganization", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//INDIVIDUAL

		firstNameTextField = new PageElement(By.xpath("//input[contains(@name,'txtFirstName')]"), "FirstName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surnameTextField = new PageElement(By.xpath("//input[contains(@name,'txtSurName')]"), "Surname", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		
	}




	public void fillPartyDetails(PartyEntityReinsurance partyEntityreinsurance, CustomAssert assertReference) throws InterruptedException{
		WebDriverWait wait	=new WebDriverWait(driver, 30);
		if(partyEntityreinsurance.getAction().equalsIgnoreCase("add") || partyEntityreinsurance.getAction().equalsIgnoreCase("edit")){

				if (partyEntityreinsurance.getBooleanValueForField("ConfigPartyCode")) {
					//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					String party=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(patyCodeTextField,party);
					partyEntityreinsurance.setStringValueForField("PartyCode",party );
					
					//clearAndSendKeys(patyCodeTextField,partyEntityreinsurance.getStringValueForField("PartyCode"));
					
				}

				


				if (partyEntityreinsurance.getBooleanValueForField("ConfigFirstName")) {
					//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					clearAndSendKeys(firstNameTextField,partyEntityreinsurance.getStringValueForField("FirstName"));
				}



				if (partyEntityreinsurance.getBooleanValueForField("ConfigSurname")) {
					clearAndSendKeys(surnameTextField, partyEntityreinsurance.getStringValueForField("Surname"));
				}

				if (partyEntityreinsurance.getBooleanValueForField("ConfigBusinessName")) {
					String businessName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(businessNameTextField, businessName);
					partyEntityreinsurance.setStringValueForField("BusinessName",businessName );
				}


				if (partyEntityreinsurance.getBooleanValueForField("ConfigTypeOfOrganization")) {
					switchToFrame("display");
					click(typeOfOrganizationFindButton);
					switchToWindow("Tata Consultancy Services");
					typeOfOrganizationalLink =new PageElement (By.xpath("//a[contains(text(),'"+partyEntityreinsurance.getStringValueForField("TypeOfOrganization")+"')]"), "Type Of Organization", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					click(typeOfOrganizationalLink);
					Thread.sleep(5000);
					switchToWindow("TCS");
					switchToFrame("display");
				}



				if (partyEntityreinsurance.getBooleanValueForField("ConfigGeographicalArea")) {
					switchToFrame("display");
					click(geographicalAreaFindButton);
					switchToWindow("Generic Search");
					geographicalAreaLink=new PageElement (By.xpath("//a[contains(text(),'"+partyEntityreinsurance.getStringValueForField("GeographicalArea")+"')]"), "Geographical Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					click(geographicalAreaLink);
					Thread.sleep(5000);
					switchToWindow("TCS");
					switchToFrame("display");
				}



			
		}
		
		
		
	}
		
		

		public void savePartyDetails(PartyEntityReinsurance partyEntityReinsurance) throws InterruptedException {
			if (partyEntityReinsurance.getBooleanValueForField("ConfigSaveBtn")) {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				click(saveButton);
				if(isAlertPresent()) {
					acceptAlertAndReturnConfirmationMessage();
				}
			
				switchToFrame("display");
			}
		}
	
		
		public void fillandSubmitPartyDetails(PartyEntityReinsurance partyEntityReinsurance, CustomAssert assertReference) throws InterruptedException {
			if (isConfigTrue(partyEntityReinsurance.getConfigExecute())){
				switchToFrame("display");
				fillPartyDetails(partyEntityReinsurance, assertReference);
				savePartyDetails(partyEntityReinsurance);
				
			}
		}	


}


