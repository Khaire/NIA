package com.aqm.staf.library.pages.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyEntityReinsurance;

public class PartySearchPageReinsurance extends BasePage
{
	private PageElement partyDetailsTitle;
	private PageElement partySearchPageTitle;
	private PageElement individualRadioButton;
	private PageElement organizationRadioButton;
	private PageElement partyCodetextField;
	private PageElement firstNameRadioButton;
	private PageElement lastNameRadioButton;
	private PageElement citizenshipNoRadioButton;
	private PageElement businessNameRadioButton;
	private PageElement registrationRadioButton;
	private PageElement partyFunction;
	private PageElement geographicalareatextfield;
	private String partyCode;
	
	private PageElement searchButton;
	private PageElement createButton;
	private PageElement cancleButton;
	private PageElement resetButton;
	public PartySearchPageReinsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartySearchPageReinsurance(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		partyDetailsTitle = new PageElement(By.xpath("//tr//th[contains(text(),\"Party Details\")]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partySearchPageTitle = new PageElement(By.xpath("//tr//th[contains(text(),\"Party Search\")]"), "Party Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		individualRadioButton = new PageElement(By.xpath("//input[@name='partytype' and @value ='I']"), "Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		organizationRadioButton = new PageElement(By.xpath("//input[@name='partytype' and @value ='O']"), "Organizational Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyCodetextField = new PageElement(By.xpath("//input[@name='txtPartyCode']"), "Party Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyFunction = new PageElement(By.xpath("//input[@name='txtFunctionCode']"), "Party Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		firstNameRadioButton = new PageElement(By.xpath("//input[@name='pPersonalInfo' and @value=\"FN\"]"), "FirstName Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lastNameRadioButton = new PageElement(By.xpath("//input[@name='pPersonalInfo' and @value=\"LN\"]"), "LastName Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		geographicalareatextfield = new PageElement(By.xpath("//input[@name='txtGeographicalAreaCode']"), "geographical area Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("btnSearch"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		createButton=new PageElement(By.name("btnNew"), "Create Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cancleButton=new PageElement(By.name("btnCancel"), "Cancel Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		resetButton=new PageElement(By.name("btnReset"), "Reset Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		businessNameRadioButton = new PageElement(By.xpath("//input[@name='pPersonalInfo' and @value='BN']"), "Businessname Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		registrationRadioButton = new PageElement(By.xpath("//input[@name='pPersonalInfo' and @value='RN']"), "Registration Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
	}
	
	
	
	
	
	public void fillPartySearchDeatail(PartyEntityReinsurance partyEntityReinsurance){
		if (partyEntityReinsurance.getBooleanValueForField("ConfigSearchIndividual")) {
			check(individualRadioButton);
		}
		if (partyEntityReinsurance.getBooleanValueForField("ConfigSearchOrganization")) {
			check(organizationRadioButton);
		}
		if (partyEntityReinsurance.getBooleanValueForField("ConfigSearchPartyCode")) {
			clearAndSendKeys(partyCodetextField, partyEntityReinsurance.getStringValueForField("PartyCode"));
		}

		if (partyEntityReinsurance.getBooleanValueForField("ConfigPartyFunction")) {
			clearAndSendKeys(partyFunction,partyEntityReinsurance.getStringValueForField("PartyFunction"));
		}
		
		if (partyEntityReinsurance.getBooleanValueForField("ConfigSearchFirstName")) {
			check(firstNameRadioButton);
		}
		if (partyEntityReinsurance.getBooleanValueForField("ConfigSearchLastName")) {
			check(lastNameRadioButton);
		}
	
		if (partyEntityReinsurance.getBooleanValueForField("ConfigGeographicalArea")) {
			clearAndSendKeys(geographicalareatextfield,partyEntityReinsurance.getStringValueForField("GeographicalArea"));
		}
		
		if (partyEntityReinsurance.getBooleanValueForField("ConfigBusinessName")) {
			check(businessNameRadioButton);
		}
		if (partyEntityReinsurance.getBooleanValueForField("ConfigRegistration")) {
			check(registrationRadioButton);
		}
		
	}
	
	
	
	
	public void navigateToPartySearchPage(PartyEntityReinsurance partyEntityReinsurance) {
		if(partyEntityReinsurance.getBooleanValueForField("ConfigSearchPage")) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navigateToPartyPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToFrame("display");
		isElementDisplayed(partySearchPageTitle);
		}
	}

	public void navigateToPartyCreatePage(PartyEntityReinsurance partyEntityReinsurance) {
		if(partyEntityReinsurance.getBooleanValueForField("ConfigCreatePage")) {
		switchToFrame("display");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(createButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToFrame("display");
		isElementDisplayed(partyDetailsTitle);
		}
	}
	
	public void fetchPartyCode(PartyEntityReinsurance partyEntityReinsurance) throws InterruptedException {
		Thread.sleep(1000);
		String partycode=new String();
		partycode=fetchValueFromTextFields(partyCodetextField);
		partyEntityReinsurance.setStringValueForField("PartyCode", partycode);
	}
	

		
		public void clickSearch() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click(searchButton);
		}
		
		
		public void clearFromPartySearch(PartyEntityReinsurance partyEntityReinsurance) {
			if (partyEntityReinsurance.getBooleanValueForField("ConfigResetButton")) {
				click(resetButton);
			}
		}
		
		public void cancelFromPartySearch(PartyEntityReinsurance partyEntityReinsurance) {
			if (partyEntityReinsurance.getBooleanValueForField("ConfigBackButton")) {
				click(cancleButton);
			}
		}
		
		
		public void fillAndSearchPartyDetails(PartyEntityReinsurance partyEntityReinsurance)  {
			fillPartySearchDeatail(partyEntityReinsurance);
			clickSearch();
		}
		
		public void navigateToPartyDetailsPage(){
			switchToFrame("display");
			isElementDisplayed(partyDetailsTitle);
		}
	

}
