package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyAttrGstUpdateEntity;
import com.aqm.staf.library.databin.PolicyAttrPOSMotorEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.pages.common.PolicySearchPage;

public class PolicyAttrributeGstUpadateParam extends BasePage{

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
	private PageElement currentStatusTextField;
	//title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement IsthePaymentreceivedfromGovtEntity;
	private PageElement isGstExemptedDropDown;
	private PageElement resonForGstExemptionDropDown;
	private PageElement exportOfServiceDropDown;
	private PageElement isIsdGstinApplicableExemptedDropDown;
	private PageElement gStinTextField;
	private PageElement saveButton;
	private PageElement proceedButton;
	private PageElement closeButton;

	public PolicyAttrributeGstUpadateParam(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		currentStatusTextField = new PageElement(By.xpath("//b[contains(text(),'Status')]//following::td[1]"), "Policy Current Status TextField",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("btnPrevious"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isGstExemptedDropDown=new PageElement(By.xpath("//div[contains(text(),'Is GST Exempted')]//following::select"),"Is GST Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		resonForGstExemptionDropDown=new PageElement(By.name("propValues2"),"Reason for GST exemption", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		exportOfServiceDropDown=new PageElement(By.name("propValues3"),"Export of services", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isIsdGstinApplicableExemptedDropDown=new PageElement(By.name("propValues8"),"Is ISD GSTIN applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		gStinTextField=new PageElement(By.name("propValues9"),"GSTIN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		IsthePaymentreceivedfromGovtEntity=new PageElement(By.xpath("//td//div[contains(text(),'Is the Payment received from Govt Entity?')]/following::select[1]"),"Is the Payment received from Govt Entity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		closeButton=new PageElement(By.xpath("//td//input[(@name='CloseWin')]"), "Close", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillPolicyAttributrGstUpdate(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyAttrGstUpdateEntity.getAction().equalsIgnoreCase("add") || policyAttrGstUpdateEntity.getAction().equalsIgnoreCase("edit")){
			
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsGstExempted")) {
				Thread.sleep(500);
				selectValueFromList(isGstExemptedDropDown, policyAttrGstUpdateEntity.getStringValueForField("IsGstExempted"));
			}
			
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsthePaymentreceivedfromGovtEntity")) {
			selectValueFromList(IsthePaymentreceivedfromGovtEntity, policyAttrGstUpdateEntity.getStringValueForField("IsthePaymentreceivedfromGovtEntity"));
			}
							
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigResonForGstExemption")) {
				selectValueFromList(resonForGstExemptionDropDown, policyAttrGstUpdateEntity.getStringValueForField("ResonForGstExemption"));
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigExportOfService")) {
				selectValueFromList(exportOfServiceDropDown, policyAttrGstUpdateEntity.getStringValueForField("ExportOfService"));
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsdGstinApplicableExempted")) {
				selectValueFromList(isIsdGstinApplicableExemptedDropDown, policyAttrGstUpdateEntity.getStringValueForField("IsdGstinApplicableExempted"));
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigGstin")) {
				clearAndSendKeys(gStinTextField, policyAttrGstUpdateEntity.getStringValueForField("Gstin"));
			}
			if(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("UK")) {
				clickOnForwardButton(policyAttrGstUpdateEntity);	
			}
		}
		else if(policyAttrGstUpdateEntity.getAction().equalsIgnoreCase("verify")){
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsGstExempted")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("IsGstExempted"), fetchValueFromList(isGstExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigResonForGstExemption")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("ResonForGstExemption"), fetchValueFromList(resonForGstExemptionDropDown), AssertionType.WARNING);
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigExportOfService")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("ExportOfService"), fetchValueFromList(exportOfServiceDropDown), AssertionType.WARNING);
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsdGstinApplicableExempted")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("IsdGstinApplicableExempted"), fetchValueFromList(isIsdGstinApplicableExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigGstin")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("Gstin"), fetchValueFromList(gStinTextField), AssertionType.WARNING);
			}
			if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigIsthePaymentreceivedfromGovtEntity")) {
				assertReference.assertEquals(policyAttrGstUpdateEntity.getStringValueForField("IsthePaymentreceivedfromGovtEntity"), fetchValueFromList(IsthePaymentreceivedfromGovtEntity), AssertionType.WARNING);

			}
		}
	}
	public void navigateToPolicy(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity ){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
		}
	}
	public void navigateToInsuredInterest(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);	
			Thread.sleep(3000);
			click(backButton);
			Thread.sleep(4000);
			switchToFrame("display");
			click(forwardButton);
			if(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("UK") && policyAttrGstUpdateEntity.getBooleanValueForField("ConfigCloseButton")) 
			{
			switchToWindow("Reason");
		    click(closeButton);
			switchToWindow();
			switchToFrame("display");
			}
		}
	}
	public void clickOnForwardButtonRural(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigForwardButtonRural")){
			click(forwardButton);
		}
	}
	public void clickOnBackButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnVerifyBASaveButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigVerifyBASave")){
			click(saveButton);
		}
	}
	public void clickOnSaveButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigSaveButton")){
			String currentStatus = fetchValueFromFields(currentStatusTextField);
 			if (!(currentStatus.equalsIgnoreCase("ENDORSEMENT/ALTERATION STARTED"))){
				if(!((policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("YA"))||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("PI")))){
						//||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("RS"))
						//||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("PI")))){
				click(forwardButton);
				Thread.sleep(2000);
			}
				}
			click(saveButton);
		}
	}
	
	public void clickOnSaveRenewButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigSaveRenewButton")){
			String currentStatus = fetchValueFromFields(currentStatusTextField);
 			if (currentStatus.equalsIgnoreCase("RENEWAL IN PROGRESS")) {
				
				click(saveButton);
				
				}
			
		}
	}
	public void clickOnSaveFinalButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigFinalSaveButton")){
			click(forwardButton);
			Thread.sleep(2000);
			if(!policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("RS")){
			sendKeys(isGstExemptedDropDown, policyAttrGstUpdateEntity.getStringValueForField("IsGstExempted"));
			}
			Thread.sleep(2000);
			click(backwardButton);
			Thread.sleep(2000);
			click(forwardButton);
			Thread.sleep(2000);
			//GJ product added by saarim on 18-06-18
			if(!(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("GT")||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("ES")||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("BH")||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("JP"))))))){
				click(forwardButton);
				click(saveButton);
			}
			Thread.sleep(2000);
			if(!policyAttrGstUpdateEntity.getAction().equalsIgnoreCase("verify")){
				if(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("SP")){
					workAround(policyAttrGstUpdateEntity);
				}
			}
			if(!(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("TF")||(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("GH")))){
				click(saveButton);
			}
		}
	}

	public void workAround(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		//if(!isElementDisplayed(nextAttributePageTitle)){
		workAroundForPolicySearch(policyAttrGstUpdateEntity);
		Thread.sleep(2000);
		click(proceedButton);
		switchToFrame("display");
		Thread.sleep(2000);
		click(forwardButton);
		switchToFrame("display");
		Thread.sleep(2000);
		click(forwardButton);
		switchToFrame("display");
		Thread.sleep(2000);
		click(forwardButton);
		switchToFrame("display");
		Thread.sleep(2000);
		click(forwardButton);
		switchToFrame("display");
		Thread.sleep(2000);
		click(forwardButton);
		Thread.sleep(4000);
		click(saveButton);
	}
	public void workAroundForPolicySearch(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity){
		if(!(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("RS"))){
			PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
			policySearchPage.navigateToPolicySearchPage();
			PageElement quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
			clearAndSendKeys(quoteNumberTextFeild,policyAttrGstUpdateEntity.getStringValueForField("QuoteNo") );
			PageElement searchButton= new PageElement(By.name("Search5465"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			click(searchButton);
			String quoteNo=policyAttrGstUpdateEntity.getStringValueForField("QuoteNo").trim();
			PageElement	policyQuoteLink=new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyQuoteLink);
			switchToFrame("display");
			navigateToAttribute(policyAttrGstUpdateEntity);


		}
	}
	public void clickOnSaveFinalMotorButton(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigFinalSaveMotorButton")){
			click(forwardButton);
			Thread.sleep(3000);
			click(backwardButton);
			Thread.sleep(4000);
			click(forwardButton);
			Thread.sleep(3000);
			click(saveButton);
		}
	}
	
	public void clickOnForwardButtonPI(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity) throws InterruptedException{
		if (policyAttrGstUpdateEntity.getBooleanValueForField("ConfigForwardPIButton")){
			String currentStatus = fetchValueFromFields(currentStatusTextField);
 			if ((currentStatus.equalsIgnoreCase("DRAFT APPLICATION"))) {
				if(((policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("PI")))){
				click(forwardButton);
				Thread.sleep(2000);
			}
				}
			click(saveButton);
		}
	}
	public void fillandSubmitPolicyAttributrGstUpdate(PolicyAttrGstUpdateEntity policyAttrGstUpdateEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyAttrGstUpdateEntity.getConfigExecute())){
			fillPolicyAttributrGstUpdate(policyAttrGstUpdateEntity, assertReference);
			navigateToPolicy(policyAttrGstUpdateEntity);
			if(!(policyAttrGstUpdateEntity.getStringValueForField("Product").equalsIgnoreCase("SP"))){
				navigateToAttribute(policyAttrGstUpdateEntity);
			}
			clickOnVerifyBASaveButton(policyAttrGstUpdateEntity);
			navigateToInsuredInterest(policyAttrGstUpdateEntity);
			navigateToCoverage(policyAttrGstUpdateEntity);
			navigateToLoan(policyAttrGstUpdateEntity);
			navigateToClientDetails(policyAttrGstUpdateEntity);
			navigateToRelation(policyAttrGstUpdateEntity);
			navigateToPayment(policyAttrGstUpdateEntity);
			navigateToFollowup(policyAttrGstUpdateEntity);
			navigateToDocument(policyAttrGstUpdateEntity);
			//clickOnForwardButton(policyAttrGstUpdateEntity);
			//clickOnForwardButtonRural(policyAttrGstUpdateEntity);
			clickOnForwardButtonPI(policyAttrGstUpdateEntity);
			clickOnSaveButton(policyAttrGstUpdateEntity);
			clickOnSaveRenewButton(policyAttrGstUpdateEntity);
			clickOnBackButton(policyAttrGstUpdateEntity);
			clickOnBackwardButton(policyAttrGstUpdateEntity);
			clickOnSaveFinalButton(policyAttrGstUpdateEntity);
			clickOnSaveFinalMotorButton(policyAttrGstUpdateEntity);
			


		}
	}
}
