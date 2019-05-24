package com.aqm.staf.library.pages.reinsurance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntityReinsurance;
import com.aqm.staf.library.databin.ProgramCreateEntity;

public class ProgramDetailsCreatePageReinsureance extends BasePage
{
	private PageElement poportional;
	private PageElement nonproportionalRISK;
	private PageElement nonProportionalCAT;
	private PageElement majorClass;
	private PageElement minorClass;
	private PageElement nameofSubsidiary;
	private PageElement domestic;
	private PageElement foreign;
	private PageElement programCode;
	private PageElement programName;
	private PageElement effectiveDate;
	private PageElement endDate;
	private PageElement majorClassList;
	private PageElement listofMinorClass;
	private PageElement partyList;
	private PageElement saveButton;
	
	public ProgramDetailsCreatePageReinsureance(WebDriver driver, String pageName)
	{
		super(driver,pageName);
		poportional = new PageElement(By.xpath("//input[@id='rndProp']\""),"Poportional",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		majorClass = new PageElement(By.xpath("//input[@id='submit23'])"),"MajorClass",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minorClass = new PageElement(By.xpath("//input[@id='submit12'])"),"MinorClass",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofSubsidiary = new PageElement(By.xpath("//input[@id='submit1'])"),"NameofSubsidiary",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		domestic = new PageElement(By.xpath("//label[contains(text(),'Domestic')]//preceding::input[1])"),"Poportional",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		foreign = new PageElement(By.xpath("//label[contains(text(),'Foreign')]//preceding::input[1])"),"Poportional",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		programCode = new PageElement(By.xpath("//input[@name='txtProgramCode']"),"ProgramCode",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		programName = new PageElement(By.xpath("//input[@name='txtProgramName']"),"ProgramName",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		effectiveDate = new PageElement(By.xpath("//img[@src=\"calendar.gif\"][0]"),"EffectiveDate",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endDate = new PageElement(By.xpath("//img[@src=\"calendar.gif\"][1]"),"EndDate",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.xpath("//input[@id='submit1'])"),"SaveButton",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	


	public void fillProgramPageRecordsForScenario(ProgramCreateEntity ProgramCreateEntity, CustomAssert assertReference) throws InterruptedException{
		//WebDriverWait wait	=new WebDriverWait(driver,30);;
		if(ProgramCreateEntity.getAction().equalsIgnoreCase("add") || ProgramCreateEntity.getAction().equalsIgnoreCase("edit")){

			if (ProgramCreateEntity.getBooleanValueForField("ConfigMajorClass")) {
				switchToFrame("display");
				click(majorClass);
				switchToWindow("Generic Search");
				majorClassList =new PageElement (By.xpath("//a[contains(text(),'"+ProgramCreateEntity.getStringValueForField("FIRE")+"')]"), "Major Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(majorClassList);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			
			if (ProgramCreateEntity.getBooleanValueForField("ConfigMinorClass")) {
				switchToFrame("display");
				click(minorClass);
				switchToWindow("Generic Search");
				listofMinorClass =new PageElement (By.xpath("//a[contains(text(),'"+ProgramCreateEntity.getStringValueForField("11")+"')]"), "Minor Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click( listofMinorClass);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			
			if (ProgramCreateEntity.getBooleanValueForField("ConfigNameofSubsidiary")) {
				switchToFrame("display");
				click(nameofSubsidiary);
				switchToWindow("Generic Search");
				partyList =new PageElement (By.xpath("//a[contains(text(),'"+ProgramCreateEntity.getStringValueForField("1D10557046")+"')]"), "nameofSubsidiary", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(partyList);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			
			if (ProgramCreateEntity.getBooleanValueForField("ConfigProgramCode")) {
				clearAndSendKeys(programCode, ProgramCreateEntity.getStringValueForField("ProgramCode"));
			}

			if (ProgramCreateEntity.getBooleanValueForField("ConfigProgramName")) {
				clearAndSendKeys(programName, ProgramCreateEntity.getStringValueForField("programName"));
			}
			
		
			if (ProgramCreateEntity.getBooleanValueForField("ConfigEffectiveDate")) {
				String EffectiveDate=RandomCodeGenerator.dateGenerator( ProgramCreateEntity.getStringValueForField("EffectiveDate"));
				clearAndSendKeys(effectiveDate,EffectiveDate );
				
			}
			
			if (ProgramCreateEntity.getBooleanValueForField("ConfigEndDate")) {
				String EndDate=RandomCodeGenerator.dateGenerator( ProgramCreateEntity.getStringValueForField("EndDate"));
				clearAndSendKeys(endDate,EndDate );
			}
			
		}
		else if(ProgramCreateEntity.getAction().equalsIgnoreCase("verify")){
			
			if (ProgramCreateEntity.getBooleanValueForField("ConfigMajorClass")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("majorClass"), fetchValueFromTextFields(majorClass), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigMinorClass")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("minorClass"), fetchValueFromTextFields(minorClass), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigNameofSubsidiary")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("nameofSubsidiary"), fetchValueFromTextFields(nameofSubsidiary), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigProgramCode")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("programCode"), fetchValueFromTextFields(programCode), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigProgramName")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("programName"), fetchValueFromTextFields(programName), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigEffectiveDate")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("effectiveDate"), fetchValueFromTextFields(effectiveDate), AssertionType.WARNING);
			}
			if (ProgramCreateEntity.getBooleanValueForField("ConfigEndDate")) {
				assertReference.assertEquals(ProgramCreateEntity.getStringValueForField("endDate"), fetchValueFromTextFields(endDate), AssertionType.WARNING);
			}
		}
	}
			public void saveProgramsDetails(ProgramCreateEntity ProgramCreateEntity) throws InterruptedException {
				if (ProgramCreateEntity.getBooleanValueForField("ConfigSaveBtn")) {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					click(saveButton);
					if(isAlertPresent()) {
						acceptAlertAndReturnConfirmationMessage();
					}
				
					switchToFrame("display");
				}
			}
			
			public void fillandSubmitPartyDetails(ProgramCreateEntity ProgramCreateEntity, CustomAssert assertReference) throws InterruptedException {
				if (isConfigTrue(ProgramCreateEntity.getConfigExecute())){
					switchToFrame("display");
					fillProgramPageRecordsForScenario(ProgramCreateEntity, assertReference);
					saveProgramsDetails(ProgramCreateEntity);
					
				}
       
	
	}
}
			
		
			
			
			
			
			
			
			
			
			
