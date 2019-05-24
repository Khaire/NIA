package com.aqm.staf.library.pages.creditShield;

import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;


public class PolicyAttributeCDPolicyDetailsCreaditShield extends BasePage {
	private PageElement cDPolicyDetailsTitle;
	private PageElement cEPolicyDetailsTitle;
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
	private PageElement nextAttributePageTitle;
	private PageElement quotationDetailsTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;

	private PageElement countryDetailsListOpenButton;
	private PageElement isServiceTaxExemptedDropDown;
	private PageElement coInsuranceApplicableDropDown;
	private PageElement nameofInsurerDropDown;

	private PageElement installmentPercentageListOpenButton;	
	private PageElement opportunityIdTextField;
	private PageElement forwordButton;
	private PageElement backButton;
	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement installementPercentageList;
	private PageElement openButton;
	private PageElement installmentFacilityTitlePage;
	private PageElement serialNoParameterTextField;
	private PageElement installmentPercentageWindowTextField;

	private PageElement countryWindowAddButton;
	private PageElement countryWinCountryCodeTextField;
	private PageElement countryWinCountryNameTextField;
	private PageElement countryWindowSaveButton;			
	private PageElement countryWindowCloseButton;		
	private PageElement countryWindowDeleteButton;
	private PageElement countryWinCountryGroupDropDown;
	private PageElement countryWinWaitingperiodTextField;
	private PageElement countryWinDCLAvailabilityDropDown;
	private PageElement countryWinPoliticalRiskDropDown;
	private PageElement countryWinSpecialTermsTextField;
	private PageElement TypeOfPolicyDropDown;
	
	public PolicyAttributeCDPolicyDetailsCreaditShield(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		quoteNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Quote No.')]/following::td"), "Quote Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "Quote Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//div//b[contains(text(),'Product')]/following::td"), "Product Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//div//b[contains(text(),'Status')]/following::td"), "Product Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.name("pPolicyHolderName"), "Policy Holder Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cDPolicyDetailsTitle =new PageElement(By.xpath("//div/b[contains(text(),'CD Policy Details')]"), "CD Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		cEPolicyDetailsTitle =new PageElement(By.xpath("//div/b[contains(text(),'CE Policy Details')]"), "CE Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		countryDetailsListOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Country Details')]/following::input"), "Country Details List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//td//div[@id='Is Service Tax Exempted']/following::select[1]"), "Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[@id='Co-Insurance Applicable']/following::select[1]"), "Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameofInsurerDropDown=new PageElement(By.xpath("//td//div[@id='Name of Insurer']/following::select[1]"), "Name of Insurer", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		installmentPercentageListOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Installment Percentage List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		opportunityIdTextField=new PageElement(By.xpath("//td//div[contains(text(),'Opportunity Id')]/following::input"), "Opportunity Id Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		countryWindowAddButton 				= new PageElement(By.name("btnAdd"), "Country Details Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryWindowSaveButton				= new PageElement(By.name("btnSave"), "Country Details Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		countryWindowCloseButton			= new PageElement(By.name("btnClose"), "Country Details Close Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		countryWindowDeleteButton 			= new PageElement(By.name("btnDel"), "Country Details Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryWinCountryCodeTextField		=new PageElement(By.name("Data_198004421022008_"+rowcount+""), "Country Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		countryWinCountryNameTextField		=new PageElement(By.name("Data_51688204072005_"+rowcount+""), "Country Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryWinCountryGroupDropDown		=  new PageElement(By.name("Data_210719227092009_"+rowcount+""), "Country Group Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryWinWaitingperiodTextField	= new PageElement(By.name("Data_210712927092009_"+rowcount+""), "Waiting period Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryWinDCLAvailabilityDropDown	=  new PageElement(By.name("Data_210719927092009_"+rowcount+""), "DCL Availability Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryWinPoliticalRiskDropDown		=  new PageElement(By.name("Data_210720227092009_"+rowcount+""), "Political Risk Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryWinSpecialTermsTextField		= new PageElement(By.name("Data_210720627092009_"+rowcount+""), "Special Terms Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 


		forwordButton=new PageElement(By.name("Next"),"Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		openButton = new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		installmentFacilityTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Installment Facility')]"), "Installement Facility Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		TypeOfPolicyDropDown=new PageElement(By.name("propValues2"),"Type Of Policy Drop Down",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}	
	public void fillPolicyAttributeCDPolicyDetails(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity, CustomAssert assertReference,ScenarioTestData testdata) throws InterruptedException{
		if(policyAttributeCDPolicyDetailsEntity.getAction().equalsIgnoreCase("add") || policyAttributeCDPolicyDetailsEntity.getAction().equalsIgnoreCase("edit")){
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(TypeOfPolicyDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("TypeOfPolicy"));	
				click(forwordButton);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryDetailsListOpenButton")) {
				fillCountryDetails(policyAttributeCDPolicyDetailsEntity);								
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigNameofInsurer")) {
				selectValueFromList(nameofInsurerDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("NameofInsurer"));
			}	
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				fillInstallementPercentageDetails(testdata,policyAttributeCDPolicyDetailsEntity,assertReference);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, policyAttributeCDPolicyDetailsEntity.getStringValueForField("OpportunityId"));
			}			
		}
		else if(policyAttributeCDPolicyDetailsEntity.getAction().equalsIgnoreCase("verify")){
			click(forwordButton);
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigNameofInsurer")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("NameofInsurer"), fetchValueFromList(nameofInsurerDropDown), AssertionType.WARNING);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				verifyInstallementPercentageDetails(testdata,policyAttributeCDPolicyDetailsEntity,assertReference);
			}
			if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttributeCDPolicyDetailsEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}				
		}
	}
	public void clickOnOpenButton(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity) throws InterruptedException{
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			Thread.sleep(5000);
			switchToWindow("Installment Percentage List' Details");
		}
	}

	
	public void fillInstallementPercentageDetails(ScenarioTestData testdata,PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(policyAttributeCDPolicyDetailsEntity);
		List<InstallementFacilityEntity> installementFacilityEntityList=testdata.getInstallementFacilityEntity();
		int rowcount=0;
		for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
		
			installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_"+rowcount+""), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			serialNoParameterTextField=new PageElement(By.name("slNo0"+rowcount+""),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

			if(installementFacilityEntityData.getAction().equalsIgnoreCase("add") || installementFacilityEntityData.getAction().equalsIgnoreCase("edit")){

				//Table - Parameter List for Installment Percentage List
				if(installementFacilityEntityData.getBooleanValueForField("ConfigInstallmentPercentage")){
					Thread.sleep(3000);
					clearAndSendKeys(installmentPercentageWindowTextField,installementFacilityEntityData.getStringValueForField("InstallmentPercentage") );	
				}
				rowcount++;
				
				}
			if (installementFacilityEntityData.getBooleanValueForField("ConfigSaveWindowButton")){	
				click(saveWindowButton);
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e ){}
			}		
		}
		click(closeWindowButton);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}
			
	/*public void verifyInstallementPercentageDetails(ScenarioTestData testdata,PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity ,CustomAssert assertReference) throws InterruptedException{
 		clickOnOpenButton(policyAttributeCDPolicyDetailsEntity);
 		List<InstallementFacilityEntity> installementFacilityEntityList=testdata.getInstallementFacilityEntity();
 		//Table - Parameter List for Installment Percentage List
		int rowcount=1;
		for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
			installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			serialNoParameterTextField=new PageElement(By.name("slNo0"+rowcount+""),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
 		if(installementFacilityEntityData.getBooleanValueForField("ConfigInstallmentPercentage")){
 			assertReference.assertEquals(installementFacilityEntityData.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageWindowTextField), AssertionType.WARNING);	
 		}
		rowcount++;
 		
	}
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
 		}
	}*/

  	/*public void fillInstallementPercentageDetails(ScenarioTestData testdata,PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(policyAttributeCDPolicyDetailsEntity);
		List<InstallementFacilityEntity> installementFacilityEntityList=testdata.getInstallementFacilityEntity();
		int rowcount=0;
		for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
			//while(rowcount<=installementFacilityEntityList.size()){
			installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_"+rowcount+""), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			serialNoParameterTextField=new PageElement(By.name("slNo0"+rowcount+""),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

			if(policyAttributeCDPolicyDetailsEntity.getParentKey().equalsIgnoreCase(installementFacilityEntityData.getChildKey()) && (installementFacilityEntityData.getAction().equalsIgnoreCase("add") || installementFacilityEntityData.getAction().equalsIgnoreCase("edit"))){

				//Table - Parameter List for Installment Percentage List
				if(installementFacilityEntityData.getBooleanValueForField("ConfigInstallmentPercentage")){
					clearAndSendKeys(installmentPercentageWindowTextField,installementFacilityEntityData.getStringValueForField("InstallmentPercentage") );	
			}		
			
			if (installementFacilityEntityData.getBooleanValueForField("ConfigSaveWindowButton")){	
				click(saveWindowButton);
			}		
		}
		click(closeWindowButton);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	} */

	public void verifyInstallementPercentageDetails(ScenarioTestData testdata,PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity ,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(policyAttributeCDPolicyDetailsEntity);
		List<InstallementFacilityEntity> installementFacilityEntityList=testdata.getInstallementFacilityEntity();
		//Table - Parameter List for Installment Percentage List
		int rowcount=0;
		for(InstallementFacilityEntity installementFacilityEntityData:installementFacilityEntityList){
			installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_"+rowcount), "Installment Percentage Text Field "+rowcount , false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			serialNoParameterTextField=new PageElement(By.name("slNo0"+rowcount),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

			if(installementFacilityEntityData.getAction().equalsIgnoreCase("verify")){
				if(installementFacilityEntityData.getBooleanValueForField("ConfigInstallmentPercentage")){
					assertReference.assertEquals(installementFacilityEntityData.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageWindowTextField), AssertionType.WARNING);	
				}
				rowcount++;
			}

		}
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	} 

	
	
	
	public void clickOnCountryOpenButton(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity) throws InterruptedException {
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryOpenButton")){
			click(countryDetailsListOpenButton);
			switchToWindow("'Country Details' Details");
		}
	}

	public void fillCountryDetails(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity) throws InterruptedException{
		clickOnCountryOpenButton(policyAttributeCDPolicyDetailsEntity);

		//Table - Parameter List for Installment Percentage List
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryWindowAddButton")){
			click(countryWindowAddButton);
		}		
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryCode")){
			clearAndSendKeys(countryWinCountryCodeTextField,policyAttributeCDPolicyDetailsEntity.getStringValueForField("CountryCode") );
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryName")){
			clearAndSendKeys(countryWinCountryNameTextField,policyAttributeCDPolicyDetailsEntity.getStringValueForField("CountryName") );
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryGroup")){
			selectValueFromList(countryWinCountryGroupDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("CountryGroup"));
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigWaitingperiod")){
			clearAndSendKeys(countryWinWaitingperiodTextField,policyAttributeCDPolicyDetailsEntity.getStringValueForField("Waitingperiod") );
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigDCLAvailability")){
			selectValueFromList(countryWinDCLAvailabilityDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("DCLAvailability"));
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigPoliticalRisk")){
			selectValueFromList(countryWinPoliticalRiskDropDown, policyAttributeCDPolicyDetailsEntity.getStringValueForField("PoliticalRisk"));
		}
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigSpecialTerms")){
			clearAndSendKeys(countryWinSpecialTermsTextField,policyAttributeCDPolicyDetailsEntity.getStringValueForField("SpecialTerms") );
		}	
		if(policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigDelete")){
			click(countryWindowDeleteButton);
		}		
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCountryWindowSaveButton")){	
			click(countryWindowSaveButton);
			click(countryWindowCloseButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			isElementDisplayed(cEPolicyDetailsTitle);
		}
	}



	public void navigateTobackAttributePage(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}

	public void navigateToPolicy(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity){
		if (policyAttributeCDPolicyDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPolicyAttibutesHealth(PolicyAttrCDPolDetailsEntity policyAttributeCDPolicyDetailsEntity, CustomAssert assertReference,ScenarioTestData testdata) throws InterruptedException {
		if(isConfigTrue(policyAttributeCDPolicyDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeCDPolicyDetails(policyAttributeCDPolicyDetailsEntity, assertReference,testdata);
			clickNextButtonPolicyAttributeCDPolicyDetails(policyAttributeCDPolicyDetailsEntity);
			navigateTobackAttributePage(policyAttributeCDPolicyDetailsEntity);
			navigateToPolicy(policyAttributeCDPolicyDetailsEntity);
			navigateToAttribute(policyAttributeCDPolicyDetailsEntity);
			navigateToInsuredInterest(policyAttributeCDPolicyDetailsEntity);
			navigateToCoverage(policyAttributeCDPolicyDetailsEntity);
			navigateToClientDetails(policyAttributeCDPolicyDetailsEntity);
			navigateToRelation(policyAttributeCDPolicyDetailsEntity);
			navigateToPayment(policyAttributeCDPolicyDetailsEntity);
			navigateToFollowup(policyAttributeCDPolicyDetailsEntity);
			navigateToDocument(policyAttributeCDPolicyDetailsEntity);
		}
	}
}
