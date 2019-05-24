package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolicyBreakInInsuranceEntity;
import com.aqm.staf.library.databin.PolicyTypeOfDevOfficerEntity;
import com.aqm.staf.library.databin.ProvisionalPolDetailEntity;

public class PolicyAttributeInstallementFacility extends BasePage{

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement typeOfDevelopmentOfficerDropdown;
	private PageElement forwordButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement installementPercentageList;
	private PageElement openButton;
	private PageElement installmentFacilityTitlePage;
	private PageElement serialNoParameterTextField;
	private PageElement installmentPercentageWindowTextField;
	private PageElement installmentPercentageWindowTextField1;
	private PageElement installmentPercentageWindowTextField2;
	private PageElement installmentPercentageWindowTextField3;
	private PageElement openButtonPA;
	
	public PolicyAttributeInstallementFacility(WebDriver driver,String pageName, int rowcount) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		installementPercentageList = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Development Officer", "select")), "Select Installement Percentage List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Buttons
		openButton = new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		installmentFacilityTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Installment Facility')]"), "Installement Facility Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_"+rowcount+""), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwordButton= new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openButtonPA= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Installment Percentage List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	//Services
	public void fillPolicyAttributeInstallementFacility(InstallementFacilityEntity installementFacilityEntity, CustomAssert assertReference) throws InterruptedException{
		if(installementFacilityEntity.getAction().equalsIgnoreCase("add") || installementFacilityEntity.getAction().equalsIgnoreCase("edit")){

			if (installementFacilityEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				fillInstallementPercentageDetails(installementFacilityEntity);
			}
		}

		else if(installementFacilityEntity.getAction().equalsIgnoreCase("verify")){
			if (installementFacilityEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(installementFacilityEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (installementFacilityEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(installementFacilityEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (installementFacilityEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(installementFacilityEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (installementFacilityEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(installementFacilityEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (installementFacilityEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(installementFacilityEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoParameterTextField),AssertionType.WARNING);
			}
			if (installementFacilityEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				clickOnOpenButton(installementFacilityEntity);
				Thread.sleep(3000);
				//Table - Parameter List for Installment Percentage List
				if(installementFacilityEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
					Thread.sleep(3000);
					assertReference.assertEquals(installementFacilityEntity.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageWindowTextField),AssertionType.WARNING);
				}
				click(closeWindowButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");	
			}
			
		}
	}

	public void clickOnOpenButton(InstallementFacilityEntity installementFacilityEntity) throws InterruptedException{
		if (installementFacilityEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			}
			try{
				//Thread.sleep(3000);
				switchToWindow("Installment Percentage List' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Installment Percentage List' Details");
			}
			
		}
	

	public void fillInstallementPercentageDetails(InstallementFacilityEntity installementFacilityEntity) throws InterruptedException{
		clickOnOpenButton(installementFacilityEntity);
		Thread.sleep(3000);
		//Table - Parameter List for Installment Percentage List
		
		
		if(installementFacilityEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
			Thread.sleep(3000);
			clearAndSendKeys(installmentPercentageWindowTextField,installementFacilityEntity.getStringValueForField("InstallmentPercentage") );	
				}
		
		if (installementFacilityEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			Thread.sleep(3000);
			if(installementFacilityEntity.getAction().equalsIgnoreCase("add"))
			{
			 click(saveWindowButton);
			}
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	private void clickOnSaveButton(InstallementFacilityEntity installementFacilityEntity) {
		if (installementFacilityEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			/*installmentFacilityTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'"+installementFacilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(installmentFacilityTitlePage);*/
		}
	}

	public void navigateToPolicy(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(InstallementFacilityEntity installementFacilityEntity){
		if (installementFacilityEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void clickNextButtonInstallmentDetails(InstallementFacilityEntity installementFacilityEntity) {
		if (installementFacilityEntity.getBooleanValueForField("ConfigForwordButton")){		
			/*installmentFacilityTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'"+installementFacilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(installmentFacilityTitlePage);*/
			click(forwordButton);
		}
	}

	public void fillandSubmitPolicyAttributeInstallementFacility(InstallementFacilityEntity installementFacilityEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(installementFacilityEntity.getConfigExecute())){
			if(installementFacilityEntity.getAction().equalsIgnoreCase("add")){
			switchToFrame("display");
			}
			fillPolicyAttributeInstallementFacility(installementFacilityEntity, assertReference);
			clickNextButtonInstallmentDetails(installementFacilityEntity);
			clickOnSaveButton(installementFacilityEntity);
			navigateToPolicy(installementFacilityEntity);
			navigateToAttribute(installementFacilityEntity);
			navigateToMember(installementFacilityEntity);
			navigateToCoverage(installementFacilityEntity);
			navigateToLoan(installementFacilityEntity);
			navigateToClientDetails(installementFacilityEntity);
			navigateToRelation(installementFacilityEntity);
			navigateToPayment(installementFacilityEntity);
			navigateToFollowup(installementFacilityEntity);
			navigateToDocument(installementFacilityEntity);
		}
	}
}

