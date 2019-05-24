package com.aqm.staf.library.pages.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyShowVersionListEntity;

public class PartySearchPage extends BasePage {
	private PageElement partySearchPageTitle;
	private PageElement individualRadioButton;
	private PageElement organizationRadioButton;
	private PageElement partyCodetextField;
	private PageElement firstNameTextField;
	private PageElement lastNameTextField;
	private PageElement partyLinksdropDown;
	private PageElement searchCriteriaTextField;
	private PageElement departmentDropdown;
	private PageElement stakeHolderFunctioncodeTextField;
	private PageElement parameterDropdown;
	private PageElement parameterValueTextField;
	private PageElement businessNameTextField;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement partyDetailsTitle;
	private PageElement partyCodeLinkTextField;
	/*private PageElement individualRadioButton;
	private PageElement individualRadioButton;
	private PageElement individualRadioButton;*/
	private String partyCode;

	public PartySearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		partyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "PartyDetailsTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partySearchPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Search')]"), "Party Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		individualRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//preceding::input[@type='radio']"), "Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);;
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organizational Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyCodetextField = new PageElement(By.name("pPartyCode"), "Party Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		firstNameTextField = new PageElement(By.name("pFirstName"), "FirstName TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lastNameTextField = new PageElement(By.name("pSurName"), "Last NAme Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyLinksdropDown=new PageElement(By.name("pPartyLinks"), "Party link DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		searchCriteriaTextField=new PageElement(By.name("pSearchCriteria"), "Search Criteria TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeHolderFunctioncodeTextField=new PageElement(By.name("pFunctionCode"), "Function Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		parameterDropdown=new PageElement(By.name("pParameter"), "Parameter DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		parameterValueTextField=new PageElement(By.name("pParameterValue"), "Parameter Value TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessNameTextField=new PageElement(By.name("pBusinessName"), "Business Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton=new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clearButton=new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		departmentDropdown=new PageElement(By.name("pDepartment"), "Department DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void navigateToPartySearchPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navigateToPartyPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToFrame("display");
		isElementDisplayed(partySearchPageTitle);
	}

	public void navigateToPartyCreatePage() {
		switchToFrame("display");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(newButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToFrame("display");
		isElementDisplayed(partyDetailsTitle);
	}

	public void fetchPartyCode(PartyEntity partyEntity) throws InterruptedException {
		Thread.sleep(1000);
		String partycode=new String();
		partycode=fetchValueFromTextFields(partyCodetextField);
		partyEntity.setStringValueForField("PartyCode", partycode);
	}
	public void LoginEditParty(PartyEntity partyEntity, CustomAssert assertReference) throws InterruptedException{
		if (partyEntity.getBooleanValueForField("Configlogin")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			navigateToPartyPage();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			switchToFrame("display");
		}
	}
		
	
	public void fillPartySearchDeatail(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigSearchIndividual")) {
			check(individualRadioButton);
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchOrganization")) {
			check(organizationRadioButton);
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchPartyCode")) {
			clearAndSendKeys(partyCodetextField, partyEntity.getStringValueForField("PartyCode"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchFirstName")) {
			clearAndSendKeys(firstNameTextField,partyEntity.getStringValueForField("FirstName"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchLastName")) {
			clearAndSendKeys(lastNameTextField,partyEntity.getStringValueForField("LastName"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchPartyLinksDropDownList")) {
			selectValueFromList(partyLinksdropDown, partyEntity.getStringValueForField("SearchPartyLinksDropDown"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchStakeholderFunctionCode")) {
			clearAndSendKeys(stakeHolderFunctioncodeTextField, partyEntity.getStringValueForField("SearchStakeholderFunctionCode"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchParameterDropDownList")) {
			selectValueFromList(parameterDropdown, partyEntity.getStringValueForField("SearchParameterdropDown"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchParameterTextFeild")) {
			clearAndSendKeys(parameterValueTextField, partyEntity.getStringValueForField("SearchParameterTextField"));
		}
		if (partyEntity.getBooleanValueForField("ConfigSearchBusinessName")) {
			clearAndSendKeys(businessNameTextField, partyEntity.getStringValueForField("SearchBusinessName"));
		}
	}

	public void clearFromPartySearch(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
		}
	}
	
	public void backFromPartySearch(PartyEntity partyEntity) {
		if (partyEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	
	public void selectSearchPartyCode(PartyEntity partyEntity){
		if (partyEntity.getBooleanValueForField("ConfigSearchPartyCode")){
			partyCode=partyEntity.getStringValueForField("PartyCode");
			partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			for (int i=1;i<=3;i++){
				try{
					click(partyCodeLinkTextField);
					if (isElementDisplayed(partyDetailsTitle)){
						break;
					}
				}catch(Exception e){
					e.printStackTrace();
					FrameworkServices.logMessage("Party Code Link Not clicked on "+i+ " attempt");
				}
			}
			switchToFrame("display");
		}
	}
	
	public void clickSearch() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(searchButton);
	}

	public void fillAndSearchPartyDetails(PartyEntity partyEntity)  {
		fillPartySearchDeatail(partyEntity);
		clickSearch();
	}
	
	public void navigateToPartyDetailsPage(){
		switchToFrame("display");
		isElementDisplayed(partyDetailsTitle);
	}
}
