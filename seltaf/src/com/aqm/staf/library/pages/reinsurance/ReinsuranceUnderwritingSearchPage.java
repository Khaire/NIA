package com.aqm.staf.library.pages.reinsurance;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDocumentMotorEntity;
import com.aqm.staf.library.databin.UnderSearchEntity;
import com.aqm.staf.library.databin.UnderSearchEntity;

public class ReinsuranceUnderwritingSearchPage extends WebPage{
	private PageElement contractReferenceNumberTextfield;
	private PageElement contractNameTextfield;
	private PageElement reinsurerTextfield;
	private PageElement treatyTypeTextfield;
	private PageElement treatyTypeFindButton;
	private PageElement treatyTypeLink;
	private PageElement reinsuranceTypeOutwardRadioButton;
	private PageElement reinsuranceTypeInwardRadioButton;
	private PageElement reinsuranceTypeReciprocalRadioButton;
	private PageElement startDateTextfield;
	private PageElement endDateTextfield;
	private PageElement restrictedSearchRadioButton;
	private PageElement unrestrictedSearchRadioButton;
	private PageElement viewModeUpdateRadioButton;
	private PageElement viewModeUpdateWithVersionRadioButton;
	private PageElement createButton;
	private PageElement searchButton;
	private PageElement resetButton;
	//Treaty
	private PageElement treatyCodeTextfield;
	private PageElement treatyNameTextfield;
	private PageElement domesticRadioButton;
	private PageElement foreignRadioButton;
	private PageElement reinsurerNameTextfield;
	private PageElement effectiveDateTextfield;
	//Progarm
	private PageElement majorClassCodeTextfield;
	private PageElement majorClassCodeFindButton;
	private PageElement minorClassNameTextfield;
	private PageElement minorClassNameFindButton;
	private PageElement minorClassCodeTextfield;
	private PageElement subsidiaryCodeTextfield;
	private PageElement subsidiaryNameTextfield;
	private PageElement subsidiaryNameFindButton;
	private PageElement businessTypeProportionalRadioButton;
	private PageElement businessTypeNonProportionalRiskRadioButton;
	private PageElement businessTypeNonProportionalCatRadioButton;
	private PageElement majorClassCodeLink;
	private PageElement minorClassNameLink;
	private PageElement subsidiaryNameLink;
	//Policy
	private PageElement policyNumberTextfield;
	private PageElement activePolStatusRadioButton;
	private PageElement allStatusRadioButton;
	//Cession
	private PageElement faculativeAttachedYesRadioButton;
	private PageElement faculativeAttachedNoRadioButton;
	private PageElement faculativeAttachedShouldBeRadioButton;
	private PageElement referenceTypeCessionRadioButton;
	private PageElement referenceTypePolicyRadioButton;
	private PageElement referenceTypeAccumulationRadioButton;
	private PageElement policyNumberLink;
	//Paresh

	public ReinsuranceUnderwritingSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		// RIContract
		
		contractNameTextfield=new PageElement(By.name("//input[@name='pField'])[1]"), "Contract Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contractReferenceNumberTextfield=new PageElement(By.xpath("//input[@name='pField'])[0]"), "Contract Reference Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinsurerTextfield=new PageElement(By.xpath("//input[@name='pField'])[2]"), " Reinsurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		treatyTypeTextfield=new PageElement(By.xpath("//input[@name='pDomainText']"), " Treaty Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		treatyTypeFindButton=new PageElement(By.xpath("//input[@name='LOV']"), " Treaty Type Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		treatyTypeLink=new PageElement(By.xpath("//a[text()='Aggregate XL']"), " Treaty TypeLink", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reinsuranceTypeOutwardRadioButton=new PageElement(By.xpath("//label[contains(text(),'Reinsurance Type')]/following::input[1]"), " Reinsurance Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reinsuranceTypeInwardRadioButton=new PageElement(By.xpath("//label[contains(text(),'Reinsurance Type')]/following::input[2]"), "Reinsurance TypeInward", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reinsuranceTypeReciprocalRadioButton=new PageElement(By.xpath("//label[contains(text(),'Reinsurance Type')]/following::input[3]"), "  Reinsurance TypeReciprocal", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		startDateTextfield=new PageElement(By.xpath("//input[@name='pField'])[5]"), "Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endDateTextfield=new PageElement(By.xpath("//input[@name='pField'])[6]"), " EndDate Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		restrictedSearchRadioButton=new PageElement(By.xpath("//input[@name='pRestrictSearch' and @value='Y']"), " Restricted Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		unrestrictedSearchRadioButton=new PageElement(By.xpath("//input[@name='pRestrictSearch' and @value='N']"), " UnRestricted Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		viewModeUpdateRadioButton=new PageElement(By.xpath("//input[@name='pViewMode' and @value='Y']"), " ViewMode Update", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		viewModeUpdateWithVersionRadioButton=new PageElement(By.xpath("//input[@name='pViewMode' and @value='N']"), " ViewMode Update With Version", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		createButton=new PageElement(By.xpath("//input[@name='pCreateBtn' and @value='Create']"), " Create Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton=new PageElement(By.xpath("//input[@name='pSubmitBtn' and @value='Search']"), " Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		resetButton=new PageElement(By.xpath("//input[@name='pReset' and @value='Reset']"), " Reset Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//trety
		treatyCodeTextfield=new PageElement(By.xpath("//label[contains(text(),'Treaty Code')]/following::input[1]"), "treatyCode Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		treatyNameTextfield=new PageElement(By.xpath("//label[contains(text(),'Treaty Name')]/following::input[1]"), "treatyName Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		domesticRadioButton=new PageElement(By.xpath("//input[@value='D']"), "domestic RadioButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		foreignRadioButton=new PageElement(By.xpath("//input[@value='F']"), "foreign RadioButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reinsurerNameTextfield=new PageElement(By.xpath("//label[contains(text(),'Reinsurer Name')]/following::input[1]"), " reinsurerName Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		effectiveDateTextfield=new PageElement(By.xpath("//label[contains(text(),'Effective Date')]/following::input[1]"), " effectiveDate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Progarm
		majorClassCodeTextfield=new PageElement(By.xpath("//label[contains(text(),'Major Class Code')]/following::input[1]"), "majorClassCode Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		majorClassCodeFindButton=new PageElement(By.xpath("//label[contains(text(),'Major Class Code')]/following::input[2]"), " majorClassCode FindButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		minorClassNameTextfield=new PageElement(By.xpath("//label[contains(text(),'Minor Class Name')]/following::input[3]"), "minorClassName Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minorClassNameFindButton=new PageElement(By.xpath("//label[contains(text(),'Minor Class Name')]/following::input[4]"), "minorClassName FindButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		subsidiaryCodeTextfield=new PageElement(By.xpath("//label[contains(text(),'Subsidiary Code')]/following::input[1]"), "subsidiaryCode Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subsidiaryNameTextfield=new PageElement(By.xpath("//label[contains(text(),'Subsidiary Name')]/following::input[1]"), "subsidiaryName Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subsidiaryNameFindButton=new PageElement(By.xpath("//label[contains(text(),'Subsidiary Name')]/following::input[2]"), " subsidiaryName FindButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessTypeProportionalRadioButton=new PageElement(By.xpath("//input[@value='P']"), " businessTypeProportional RadioButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessTypeNonProportionalRiskRadioButton=new PageElement(By.xpath("//input[@value='R']"), " businessTypeNonProportionalRisk RadioButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessTypeNonProportionalCatRadioButton=new PageElement(By.xpath("//input[@value='C']"), " businessTypeNonProportionalCat RadioButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		majorClassCodeLink=new PageElement(By.xpath("//a[contains(text(),'9999')]"), " majorClass CodeLink", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		minorClassNameLink=new PageElement(By.xpath("//a[contains(text(),'11')]"), " minorClass NameLink", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		subsidiaryNameLink=new PageElement(By.xpath("//a[contains(text(),'1791001')]"), " subsidiary NameLink", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Policy
		policyNumberTextfield=new PageElement(By.xpath("//label[contains(text(),'Policy No')]/following::input[1]"), "policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		activePolStatusRadioButton=new PageElement(By.xpath("//input[@name='pProxyFieldRadio16' and @value='A']"), "Status Active", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		allStatusRadioButton=new PageElement(By.xpath("//input[@name='pProxyFieldRadio16' and @value='%']"), " Status All", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Cession
		faculativeAttachedYesRadioButton=new PageElement(By.xpath("//input[@name='pFacultativeAttached' and @value='F']"), "faculativeAttached Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		faculativeAttachedNoRadioButton=new PageElement(By.xpath("//input[@name='pFacultativeAttached' and @value='N']')]"), "faculativeAttached No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		faculativeAttachedShouldBeRadioButton=new PageElement(By.xpath("//input[@name='pFacultativeAttached' and @value='S']"), "faculativeAttached ShouldBe", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		referenceTypeCessionRadioButton=new PageElement(By.xpath("//input[@name='pReferenceType' and @value='C']"), "referenceType Cession", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		referenceTypePolicyRadioButton=new PageElement(By.xpath("//input[@name='pReferenceType' and @value='P']"), " referenceType Policy", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		referenceTypeAccumulationRadioButton=new PageElement(By.xpath("//input[@name='pReferenceType' and @value='A']"), "referenceType Accumulation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}



	public void fillUnderwritingSearchDetails(UnderSearchEntity underSearchEntity, CustomAssert assertReference) throws InterruptedException{
		if(underSearchEntity.getAction().equalsIgnoreCase("add") || underSearchEntity.getAction().equalsIgnoreCase("edit")){
			if (underSearchEntity.getBooleanValueForField("ConfigContractRefreneceNumber")) {
				clearAndSendKeys(contractReferenceNumberTextfield, underSearchEntity.getStringValueForField("ContractRefreneceNumber"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigContractName")) {
				clearAndSendKeys(contractNameTextfield, underSearchEntity.getStringValueForField("ContractName"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigReinsurer")) {
				clearAndSendKeys(reinsurerTextfield, underSearchEntity.getStringValueForField("Reinsurer"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigTreatyType")) {
				switchToFrame("display");
				click(treatyTypeFindButton);
				switchToWindow("Tata Consultancy Services");
				treatyTypeLink =new PageElement (By.xpath("//a[contains(text(),'"+underSearchEntity.getStringValueForField("TreatyType")+"')]"), "TreatyType", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(treatyTypeLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			if (underSearchEntity.getBooleanValueForField("ConfigStartDate")) {
				String StartDate = RandomCodeGenerator.dateGenerator(underSearchEntity.getStringValueForField("StartDate"));
				clearAndEnterDate(startDateTextfield, StartDate);
			}
			if (underSearchEntity.getBooleanValueForField("ConfigEndDate")) {
				String EndDate = RandomCodeGenerator.dateGenerator(underSearchEntity.getStringValueForField("EndDate"));
				clearAndEnterDate(endDateTextfield, EndDate);
			}
			if (underSearchEntity.getBooleanValueForField("ConfigTreatCode")) {
				clearAndSendKeys(treatyCodeTextfield, underSearchEntity.getStringValueForField("TreatCode"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigTreatyName")) {
				clearAndSendKeys(treatyNameTextfield, underSearchEntity.getStringValueForField("TreatyName"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigReinsurerName")) {
				clearAndSendKeys(reinsurerNameTextfield, underSearchEntity.getStringValueForField("ReinsurerName"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigEffectiveDate")) {
				String Date = RandomCodeGenerator.dateGenerator(underSearchEntity.getStringValueForField("EffectiveDate"));
				clearAndEnterDate(effectiveDateTextfield, Date);
			}
			if (underSearchEntity.getBooleanValueForField("ConfigMajorClassCode")) {
				switchToFrame("display");
				click(majorClassCodeFindButton);
				switchToWindow("Tata Consultancy Services");
				majorClassCodeLink =new PageElement (By.xpath("//a[contains(text(),'"+underSearchEntity.getStringValueForField("MajorClassCode")+"')]"), "Major Class Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(majorClassCodeLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			if (underSearchEntity.getBooleanValueForField("ConfigMinorClassName")) {
				switchToFrame("display");
				click(minorClassNameFindButton);
				switchToWindow("Tata Consultancy Services");
				minorClassNameLink =new PageElement (By.xpath("//a[contains(text(),'"+underSearchEntity.getStringValueForField("MinorClassName")+"')]"), "Minor Class Name", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(minorClassNameLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			if (underSearchEntity.getBooleanValueForField("ConfigMinorClassCode")) {
				clearAndSendKeys(minorClassCodeTextfield, underSearchEntity.getStringValueForField("MinorClassCode"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigSubsidiaryCode")) {
				clearAndSendKeys(subsidiaryCodeTextfield, underSearchEntity.getStringValueForField("SubsidiaryCode"));
			}
			if (underSearchEntity.getBooleanValueForField("ConfigSubsidiaryName")) {
				switchToFrame("display");
				click(subsidiaryNameFindButton);
				switchToWindow("Tata Consultancy Services");
				subsidiaryNameLink =new PageElement (By.xpath("//a[contains(text(),'"+underSearchEntity.getStringValueForField("SubsidiaryName")+"')]"), "Subsidiary Name", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(subsidiaryNameLink);
				Thread.sleep(5000);
				switchToWindow("TCS");
				switchToFrame("display");
			}
			if (underSearchEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNumberTextfield, underSearchEntity.getStringValueForField("PolicyNumber"));
			}
		}
	}

	public void clickOnOutwardButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigReinsuranceTypeOutward")){			
			click(reinsuranceTypeOutwardRadioButton);
		}
	}
	public void clickOnInwardButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigReinsuranceTypeInward")){			
			click(reinsuranceTypeInwardRadioButton);
		}
	}
	public void clickOnReciprocalButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigReinsuranceTypeReciprocal")){			
			click(reinsuranceTypeReciprocalRadioButton);
		}
	}
	public void clickOnRestrictedSearchRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigRestrictedSearch")){			
			click(restrictedSearchRadioButton);
		}
	}
	public void clickOnUnRestrictedSearchRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigUnRestrictedSearch")){			
			click(unrestrictedSearchRadioButton);
		}
	}
	public void clickOnViewModeRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigViewMode")){			
			click(viewModeUpdateRadioButton);
		}
	}
	public void clickOnViewModeWithVersionRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigViewModeWithVersion")){			
			click(viewModeUpdateWithVersionRadioButton);
		}
	}
	public void clickOnDomesticRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigDomestic")){			
			click(domesticRadioButton);
		}
	}
	public void clickOnForeignRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigForeign")){			
			click(foreignRadioButton);
		}
	}
	public void clickOnProportionalRiskButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigProportionalRisk")){			
			click(businessTypeNonProportionalRiskRadioButton);
		}
	}
	public void clickOnProportionalCatButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigProportionalCat")){			
			click(businessTypeNonProportionalCatRadioButton);
		}
	}
	public void clickOnProportionalButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigProportional")){			
			click(businessTypeProportionalRadioButton);
		}
	}
	public void clickOnActiveStatusRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigActive")){			
			click(activePolStatusRadioButton);
		}
	}
	public void clickOnAllStatusRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigAll")){			
			click(allStatusRadioButton);
		}
	}
	public void clickOnFaculYesRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigFaculYes")){			
			click(faculativeAttachedYesRadioButton);
		}
	}
	public void clickOnFaculNoRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigFaculNo")){			
			click(faculativeAttachedNoRadioButton);
		}
	}
	public void clickOnFaculShouldBeRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigFaculShouldBe")){			
			click(faculativeAttachedShouldBeRadioButton);
		}
	}
	public void clickOnReferenceTypeCessionRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigCession")){			
			click(referenceTypeCessionRadioButton);
		}
	}
	public void clickOnReferenceTypePolicyRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigPolicy")){			
			click(referenceTypePolicyRadioButton);
		}
	}
	public void clickOnReferenceTypeAccumulationRadioButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigAccumulation")){			
			click(referenceTypeAccumulationRadioButton);
		}
	}
	public void clickOnCreateButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigCreate")){			
			click(createButton);
		}
	}
	public void clickOnResetButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigReset")){			
			click(resetButton);
		}
	}
	public void clickOnSearchButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigSearch")){			
			click(searchButton);
		}
	}
	public void clickOnPolicySearchButton(UnderSearchEntity underSearchEntity)  {
		if (underSearchEntity.getBooleanValueForField("ConfigPolicyNoSearch")){			
			click(searchButton);
			policyNumberLink =new PageElement (By.xpath("//a[contains(text(),'"+underSearchEntity.getStringValueForField("PolicyNo")+"')]"), "Policy Number Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyNumberLink);	
		}
	}
	
	
	public void fillandSubmitUnderwritingSearchDetails(UnderSearchEntity underSearchEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(underSearchEntity.getConfigExecute())){	
			fillUnderwritingSearchDetails(underSearchEntity, assertReference);
			clickOnOutwardButton(underSearchEntity);
			clickOnInwardButton(underSearchEntity);
			clickOnReciprocalButton(underSearchEntity);
			clickOnRestrictedSearchRadioButton(underSearchEntity);
			clickOnUnRestrictedSearchRadioButton(underSearchEntity);
			clickOnViewModeRadioButton(underSearchEntity);
			clickOnViewModeWithVersionRadioButton(underSearchEntity);
			clickOnDomesticRadioButton(underSearchEntity);
			clickOnForeignRadioButton(underSearchEntity);
			clickOnProportionalRiskButton(underSearchEntity);
			clickOnProportionalCatButton(underSearchEntity);
			clickOnProportionalButton(underSearchEntity);
			clickOnActiveStatusRadioButton(underSearchEntity);
			clickOnAllStatusRadioButton(underSearchEntity);
			clickOnFaculYesRadioButton(underSearchEntity);
			clickOnFaculNoRadioButton(underSearchEntity);
			clickOnFaculShouldBeRadioButton(underSearchEntity);
			clickOnReferenceTypeCessionRadioButton(underSearchEntity);
			clickOnReferenceTypePolicyRadioButton(underSearchEntity);
			clickOnReferenceTypeAccumulationRadioButton(underSearchEntity);
			clickOnCreateButton(underSearchEntity);
			clickOnResetButton(underSearchEntity);
			clickOnSearchButton(underSearchEntity);	
			clickOnPolicySearchButton(underSearchEntity);
		}
	}

}