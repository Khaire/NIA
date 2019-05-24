package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClientDetailsEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolAttrFireEntity;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClientDetailsPage extends WebPage{
	private PageElement quoteNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyHolderLabel;
	private PageElement productNameLabel;
	private PageElement houseNumberLabel;
	private PageElement roadNumberAndNameLabel;
	private PageElement policyHolderStateNameTextField;
	private PageElement policyHolderCityNameTextField;
	private PageElement policyHolderPinCodeTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement contactDetailsButton;
	private PageElement contactDetailsStateNameTextField;
	private PageElement stateCodeFindButton;
	private PageElement contactDetailsPincodeNameTextField;
	private PageElement stateCodeLink;
	private PageElement pinCodeFindButton;
	private PageElement pinCodeLink;
	private PageElement proceedButton;

	public ClientDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		quoteNumberLabel= new PageElement(By.xpath("//b[contains(text(),'Quote Number')]//following::font[1]"), "Quote Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStatusLabel = new PageElement(By.xpath("//b[contains(text(),'Policy Status')]//following::font[1]"), "Policy Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel =  new PageElement(By.xpath("//b[contains(text(),'Policyholder')]//following::font[1]"), "Policy Holder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameLabel = new PageElement(By.xpath("//b[contains(text(),'Product name')]//following::font[1]"), "Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		houseNumberLabel =new PageElement(By.xpath("//b[contains(text(),'House Number')]//following::font[1]"), "House Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roadNumberAndNameLabel =new PageElement(By.xpath("//b[contains(text(),'Road (Number & Name)')]//following::font[1]"), "Road Number And Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderStateNameTextField = new PageElement(By.xpath("//input[@name=('pParametervalue1')]"), "Policy Holder State Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderCityNameTextField = new PageElement(By.xpath("//input[@name=('pParametervalue2')]"), "Policy Holder City Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderPinCodeTextField = new PageElement(By.xpath("//input[@name=('pParametervalue3')]"), "Policy Holder Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.xpath("//input[@name=('Save')]"), "Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.xpath("//input[@name=('Back')]"), "Back", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		contactDetailsStateNameTextField = new PageElement(By.xpath("//input[@name=('pStateName')]"), "Policy Holder State Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//contactDetailsCityNameTextField = new PageElement(By.xpath("//input[@name=('pParametervalue1')]"), "Policy Holder State Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactDetailsPincodeNameTextField = new PageElement(By.xpath("//input[@name=('pPostalCode')]"), "Policy Holder State Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contactDetailsButton = new PageElement(By.xpath("//input[@name=('ContactDetails')]"), "Contact Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stateCodeFindButton=new PageElement(By.id("stateFind"),"State Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pinCodeFindButton=new PageElement(By.id("pinFind"),"PIN Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton = new PageElement(By.xpath("//input[@name=('Proceed')]"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillClientDetails(ClientDetailsEntity clientDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(clientDetailsEntity.getAction().equalsIgnoreCase("add") || clientDetailsEntity.getAction().equalsIgnoreCase("edit")){
			WebDriverWait wait	=new WebDriverWait(driver, 30);
			if(clientDetailsEntity.getBooleanValueForField("ConfigContactDetails")) {
				if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderStateName")) {
					clearAndSendKeys(contactDetailsStateNameTextField, clientDetailsEntity.getStringValueForField("PolicyHolderStateName"));
					click(stateCodeFindButton);
					switchToWindow("State Details");
					Thread.sleep(1000);
					stateCodeLink=new PageElement (By.xpath("//td[contains(text(),'"+clientDetailsEntity.getStringValueForField("PolicyHolderStateName")+"')]/preceding-sibling::td[3]/div/a"), " State Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					wait.until(ExpectedConditions.elementToBeClickable(getWebElement(stateCodeLink)));
					click(stateCodeLink, driver);
					Thread.sleep(1000);
				}
				if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderPinCode")) {
					switchToWindow("PinCode Details");
					clearAndSendKeys(contactDetailsPincodeNameTextField, clientDetailsEntity.getStringValueForField("PolicyHolderPinCode"));
					click(pinCodeFindButton);
					switchToWindow("PinCode Details");
					Thread.sleep(1000);
					pinCodeLink=new PageElement (By.xpath("//a[contains(text(),'"+clientDetailsEntity.getStringValueForField("PolicyHolderPinCode")+"')]"), " Pin Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					wait.until(ExpectedConditions.elementToBeClickable(getWebElement(pinCodeLink)));
					click(pinCodeLink, driver);
					Thread.sleep(1000);
					switchToWindow("PinCode Details");
				}
				
			}
			else {
				if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderStateName")) {
					clearAndSendKeys(policyHolderStateNameTextField, clientDetailsEntity.getStringValueForField("PolicyHolderStateName"));
				}
				if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderCityName")) {
					clearAndSendKeys(policyHolderCityNameTextField, clientDetailsEntity.getStringValueForField("PolicyHolderCityName"));
				}
				if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderPinCode")) {
					clearAndSendKeys(policyHolderPinCodeTextField, clientDetailsEntity.getStringValueForField("PolicyHolderPinCode"));
				}

			}
		}
		else if(clientDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (clientDetailsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyStatus")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyStatus"), fetchValueFromFields(policyStatusLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("ProductName"), fetchValueFromFields(productNameLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigHouseNumber")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("HouseNumber"), fetchValueFromFields(houseNumberLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigRoadNumberAndName")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("RoadNumberAndName"), fetchValueFromFields(roadNumberAndNameLabel), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderStateName")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyHolderStateName"), fetchValueFromTextFields(policyHolderStateNameTextField), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderCityName")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyHolderCityName"), fetchValueFromTextFields(policyHolderCityNameTextField), AssertionType.WARNING);
			}
			if (clientDetailsEntity.getBooleanValueForField("ConfigPolicyHolderPinCode")) {
				assertReference.assertEquals(clientDetailsEntity.getStringValueForField("PolicyHolderPinCode"), fetchValueFromTextFields(policyHolderPinCodeTextField), AssertionType.WARNING);
			}
		}
	}

	public void clickOnSaveButton(ClientDetailsEntity clientDetailsEntity)  {
		if (clientDetailsEntity.getBooleanValueForField("ConfigSave")){			
			click(saveButton);
		}
	}

	public void clickOnBackButton(ClientDetailsEntity clientDetailsEntity)  {
		if (clientDetailsEntity.getBooleanValueForField("ConfigBack")){			
			click(backButton);
		}
	}
	public void clickOnContactDetailsButton(ClientDetailsEntity clientDetailsEntity) throws InterruptedException {
		if (clientDetailsEntity.getBooleanValueForField("ConfigContactDetails")){
			switchToFrame("display");
			click(contactDetailsButton);
			switchToWindow("Contact Details");
			//switchToFrame("display");
		}
	}
	public void clickOnProceedButton(ClientDetailsEntity clientDetailsEntity) throws InterruptedException  {
		if (clientDetailsEntity.getBooleanValueForField("ConfigProceed")){			
			click(proceedButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	
	public void fillandSubmitClientDetails(ClientDetailsEntity clientDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(clientDetailsEntity.getConfigExecute())){
			clickOnContactDetailsButton(clientDetailsEntity);
			fillClientDetails(clientDetailsEntity, assertReference);
			clickOnProceedButton(clientDetailsEntity);
			clickOnSaveButton(clientDetailsEntity);
			clickOnBackButton(clientDetailsEntity);
		}
	}
}
