package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DetailWageAcidntsMiscEntity;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.RiskDetailsFirstMiscEntity;

public class DetailsOfWagesAndAccidentsMiscPages extends BasePage{
	
	//private page element Details Of Wages And Accidents
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	

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

	
	private PageElement forwardButton;
	
	//WC
	private PageElement openButton;
	
	private PageElement serialNoTextField;
	private PageElement previousYearTextField;
	private PageElement totalWagesTextField;
	private PageElement noOfFatalAccidentTextField;
	private PageElement compensationAmountForFatalAccidentTextField;
	private PageElement noOfPTDTextField;
	private PageElement compensationAmountForPTDTextField;
	private PageElement noOfTTDTextField;
	private PageElement compensationAmountForTTDTextField;
	private PageElement detailsOfWagesAndAccidentsTitlePage;
	
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;
	private PageElement deleteWindowButton;
	
	public DetailsOfWagesAndAccidentsMiscPages(WebDriver driver, String pageName) {
		super(driver, pageName);
		
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
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
        
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
         
		
		//WC
		openButton=new PageElement(By.name("propValues1"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		serialNoTextField=new PageElement(By.name("slNo0"), "Serial No TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousYearTextField=new PageElement(By.name("Data_253259119012011_0"), "Previous Year TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalWagesTextField=new PageElement(By.name("Data_253259219012011_0"), "Total Wages TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfFatalAccidentTextField=new PageElement(By.name("Data_253259319012011_0"), "No of Fatal Accident TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		compensationAmountForFatalAccidentTextField=new PageElement(By.name("Data_253259419012011_0"), "Compensation Amount for Fatal Accident TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfPTDTextField=new PageElement(By.name("Data_253259519012011_0"), "No of PTD TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		compensationAmountForPTDTextField=new PageElement(By.name("Data_253259619012011_0"), "Compensation Amount for PTD TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfTTDTextField=new PageElement(By.name("Data_253259719012011_0"), "No of TTD TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		compensationAmountForTTDTextField=new PageElement(By.name("Data_253259819012011_0"), "Compensation Amount for TTD TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfWagesAndAccidentsTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Details of wages and Accidents')]"), "Details of wages and Accidents Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		addWindowButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	//Services  
	public void fillDetailsOfWagesAndAccidentsMiscPages(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity, CustomAssert assertReference) throws InterruptedException{
		if(detailWageAcidntsMiscEntity.getAction().equalsIgnoreCase("add") || detailWageAcidntsMiscEntity.getAction().equalsIgnoreCase("edit")){

			if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigDetailsofTotalwagesandAccidentsforInsuredEmployees")) {
				DetailsOfWagesAndAccidentsMiscPages(detailWageAcidntsMiscEntity);
			}
		}

		else if(detailWageAcidntsMiscEntity.getAction().equalsIgnoreCase("verify")){
			if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(detailWageAcidntsMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(detailWageAcidntsMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(detailWageAcidntsMiscEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(detailWageAcidntsMiscEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			//if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigSerialNo")) {
				//assertReference.assertEquals(detailWageAcidntsMiscEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField),AssertionType.WARNING);
			//}
			
		}
	}

	public void clickOnOpenButton(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity) throws InterruptedException{
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Details of Total wages and Accidents for Insured Employees' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Details of Total wages and Accidents for Insured Employees' Details");
			}
			
			
		}
	}

	public void DetailsOfWagesAndAccidentsMiscPages(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity) throws InterruptedException{
		clickOnOpenButton(detailWageAcidntsMiscEntity);
		Thread.sleep(3000);
		//Table - Parameter List for Installment Percentage List
		click(addWindowButton);

		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigPreviousYear")){
			Thread.sleep(3000);
			clearAndSendKeys(previousYearTextField,detailWageAcidntsMiscEntity.getStringValueForField("PreviousYear") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigTotalWages")){
			Thread.sleep(3000);
			clearAndSendKeys(totalWagesTextField,detailWageAcidntsMiscEntity.getStringValueForField("TotalWages") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigNoofFatalAccident")){
			Thread.sleep(3000);
			clearAndSendKeys(noOfFatalAccidentTextField,detailWageAcidntsMiscEntity.getStringValueForField("NoofFatalAccident") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigCompensationAmountforFatalAccident")){
			Thread.sleep(3000);
			clearAndSendKeys(compensationAmountForFatalAccidentTextField,detailWageAcidntsMiscEntity.getStringValueForField("CompensationAmountforFatalAccident") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigNoofPTD")){
			Thread.sleep(3000);
			clearAndSendKeys(noOfPTDTextField,detailWageAcidntsMiscEntity.getStringValueForField("NoofPTD") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigCompensationAmountforPTD")){
			Thread.sleep(3000);
			clearAndSendKeys(compensationAmountForPTDTextField,detailWageAcidntsMiscEntity.getStringValueForField("CompensationAmountforPTD") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigNoofTTD")){
			Thread.sleep(3000);
			clearAndSendKeys(noOfTTDTextField,detailWageAcidntsMiscEntity.getStringValueForField("NoofTTD") );	
		}
		if(detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigCompensationAmountforTTD")){
			Thread.sleep(3000);
			clearAndSendKeys(compensationAmountForTTDTextField,detailWageAcidntsMiscEntity.getStringValueForField("CompensationAmountforTTD") );	
		}
		

		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	private void clickOnSaveButton(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity) {
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveWindowButton);
			switchToFrame("display");
		}
	}
	private void clickOnForwardButton(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity) {
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			detailsOfWagesAndAccidentsTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'"+detailWageAcidntsMiscEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(detailsOfWagesAndAccidentsTitlePage);
		}
	}
	public void navigateToPolicy(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity){
		if (detailWageAcidntsMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	/*private void clickNextButtonInstallmentDetails(InstallementFacilityEntity installementFacilityEntity) {
		if (installementFacilityEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			switchToFrame("display");
			isElementDisplayed(installmentFacilityTitlePage);
		}
	}*/

	public void fillandSubmitDetailsOfWagesAndAccidentsMiscPages(DetailWageAcidntsMiscEntity detailWageAcidntsMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(detailWageAcidntsMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillDetailsOfWagesAndAccidentsMiscPages(detailWageAcidntsMiscEntity, assertReference);
			//clickNextButtonInstallmentDetails(installementFacilityEntity);
			clickOnForwardButton(detailWageAcidntsMiscEntity);
			navigateToPolicy(detailWageAcidntsMiscEntity);
			navigateToAttribute(detailWageAcidntsMiscEntity);
			navigateToMember(detailWageAcidntsMiscEntity);
			navigateToCoverage(detailWageAcidntsMiscEntity);
			navigateToLoan(detailWageAcidntsMiscEntity);
			navigateToClientDetails(detailWageAcidntsMiscEntity);
			navigateToRelation(detailWageAcidntsMiscEntity);
			navigateToPayment(detailWageAcidntsMiscEntity);
			navigateToFollowup(detailWageAcidntsMiscEntity);
			navigateToDocument(detailWageAcidntsMiscEntity);
		}

	}
}

