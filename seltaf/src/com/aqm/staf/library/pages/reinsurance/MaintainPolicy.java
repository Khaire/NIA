package com.aqm.staf.library.pages.reinsurance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MaintainCreateEntity;
import com.aqm.staf.library.databin.TreatyCreateEntity;


public class MaintainPolicy extends BasePage {

			 private PageElement OfficeCodeFieldOne;	
			 private PageElement OfficeCodeFieldTwo;
			 private PageElement MinorClassFieldOne;
			 private PageElement MinorClassFieldTwo;
			 private PageElement PolicyNumber;
			 private PageElement Product;
			 private PageElement PolicyInceptionDate;
			 private PageElement PolicyEffectiveDate;
			 private PageElement PolicyExpiryDate;
			 private PageElement InsuredName;
			 private PageElement PolicyEffectiveDateLink;
			 private PageElement saveButton;
			 private PageElement policyItemNumberLabel;
 
			 public MaintainPolicy (WebDriver driver, String pageName) {
				 super(driver,pageName);
				 
				 OfficeCodeFieldOne =  new PageElement(By.xpath("//input[@name='txtOfficeCode']"), "OfficeCode FieldOne", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 OfficeCodeFieldTwo =  new PageElement(By.xpath("//input[@name='txtOfficeName']"), "OfficeCodeFieldTwo", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 MinorClassFieldOne =  new PageElement(By.xpath("//input[@name='txtLobCode']"), "MinorClass FieldOne", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 MinorClassFieldTwo =  new PageElement(By.xpath("//input[@name='txtLobName']"), "MinorClass FieldTwo", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 PolicyNumber =  new PageElement(By.xpath("//input[@name='txtPolNo']"), "Policy Number", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 Product =  new PageElement(By.xpath("//input[@name='txtPolicyType']"), "Product", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 PolicyInceptionDate =  new PageElement(By.xpath("//input[@name='pInceptionDate']"), "PolicyInception Date", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 PolicyEffectiveDate =  new PageElement(By.xpath("//label[contains(text(),'Policy Effective Date')]/following::img[1]"), "Policy EffectiveDate", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
				 PolicyExpiryDate =  new PageElement(By.xpath("//label[contains(text(),'Policy Effective Date')]/following::img[2]"), "Policy ExpiryDate", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
				 InsuredName =  new PageElement(By.xpath("//input[@name='txtInsuredName']"), "Insured Name", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
				 saveButton = new PageElement(By.xpath("//input[@value='Save']"), "Save Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
				 policyItemNumberLabel = new PageElement(By.xpath("//label[contains(text(),'Policy Item Number')]//following::a[1]"),"Policy Item", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			 }


public void fillmaintainpolicy(MaintainCreateEntity maintainCreateEntity, CustomAssert assertReference) throws InterruptedException{
	//WebDriverWait wait=new WebDriverWait(driver, 30);

//add - edit
	if(maintainCreateEntity.getAction().equalsIgnoreCase("add") || maintainCreateEntity.getAction().equalsIgnoreCase("edit")){


		if (maintainCreateEntity.getBooleanValueForField("ConfigOfficeCodeFieldOne")) {
			clearAndSendKeys(OfficeCodeFieldOne,maintainCreateEntity.getStringValueForField("OfficeCodeFieldOne"));
		}

		if (maintainCreateEntity.getBooleanValueForField("ConfigOfficeCodeFieldTwo")) {

			clearAndSendKeys(OfficeCodeFieldTwo,maintainCreateEntity.getStringValueForField("OfficeCodeFieldTwo"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigMinorClassFieldOne")) {

			clearAndSendKeys(MinorClassFieldOne,maintainCreateEntity.getStringValueForField("MinorClassFieldOne"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigMinorClassFieldTwo")) {

			clearAndSendKeys(MinorClassFieldTwo,maintainCreateEntity.getStringValueForField("MinorClassFieldTwo"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyNumber")) {

			clearAndSendKeys(PolicyNumber,maintainCreateEntity.getStringValueForField("PolicyNumber"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigProduct")) {

			clearAndSendKeys(Product,maintainCreateEntity.getStringValueForField("ProductCode"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyInceptionDate")) {

			clearAndSendKeys(PolicyInceptionDate,maintainCreateEntity.getStringValueForField("PolicyInceptionDate"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigInsuredName")) {

			clearAndSendKeys(InsuredName,maintainCreateEntity.getStringValueForField("InsuredName"));
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyEffectiveDate")) {
			String policyEffectiveDate=RandomCodeGenerator.dateGenerator(maintainCreateEntity.getStringValueForField("PolicyEffectiveDate"));
			clearAndSendKeys(PolicyEffectiveDate,policyEffectiveDate );
		}
		if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyExpiryDate")) {
			String policyExpireDate=RandomCodeGenerator.dateGenerator(maintainCreateEntity.getStringValueForField("PolicyExpiryDate"));
			clearAndSendKeys(PolicyExpiryDate,policyExpireDate );
		}
		
		
		else if(maintainCreateEntity.getAction().equalsIgnoreCase("verify")){
			if (maintainCreateEntity.getBooleanValueForField("ConfigOfficeCodeFieldOne")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("OfficeCodeFieldOne"), fetchValueFromTextFields(OfficeCodeFieldOne), AssertionType.WARNING);
			}

			if (maintainCreateEntity.getBooleanValueForField("ConfigOfficeCodeFieldTwo")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("OfficeCodeFieldTwo"), fetchValueFromTextFields(OfficeCodeFieldTwo), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigMinorClassFieldOne")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("MinorClassFieldOne"), fetchValueFromTextFields(MinorClassFieldOne), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigMinorClassFieldTwo")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("MinorClassFieldTwo"), fetchValueFromTextFields(MinorClassFieldTwo), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(PolicyNumber), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("Product"), fetchValueFromTextFields(Product), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigPolicyInceptionDate")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("PolicyInceptionDate"), fetchValueFromTextFields(PolicyInceptionDate), AssertionType.WARNING);

			}
			if (maintainCreateEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(maintainCreateEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(InsuredName), AssertionType.WARNING);
			}
		
	}
		}
	}
		public void saveMaintainPolicyDetails(MaintainCreateEntity maintainPolicyCreateEntity) throws InterruptedException {
			if (maintainPolicyCreateEntity.getBooleanValueForField("ConfigSaveBtn"))
			{
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				click(saveButton);
				if(isAlertPresent())
				{
					acceptAlertAndReturnConfirmationMessage();
				}

				switchToFrame("display");
			}
		}
		public void clickOnPolicyItemNumber(MaintainCreateEntity maintainPolicyCreateEntity) throws InterruptedException {
			if (maintainPolicyCreateEntity.getBooleanValueForField("ConfigPolicyItemNumber")){
				click(policyItemNumberLabel);
				}
			}
		public void fillandSubmitMaintainPolicyDetails(MaintainCreateEntity maintainPolicyCreateEntity, CustomAssert assertReference) throws InterruptedException {
			if (isConfigTrue(maintainPolicyCreateEntity.getConfigExecute())){
				switchToFrame("display");
				fillmaintainpolicy(maintainPolicyCreateEntity, assertReference);
				saveMaintainPolicyDetails(maintainPolicyCreateEntity);
				clickOnPolicyItemNumber(maintainPolicyCreateEntity);

			}
		

	
}}
