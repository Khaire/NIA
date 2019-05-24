package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttrSIDEngEntity;
import com.aqm.staf.library.databin.PolInsIntAttrSTFIEngEntity;

public class PolicyInsuredIntrestAttributeSTFICoverEngineering extends BasePage{
	//EF,EI,CF
	private PageElement isSTFICoverRequiredDropDown;
	private PageElement rateForSTFICoverTextField;

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
	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	
	//ER-Shruti
	private PageElement saveButton;
	private PageElement proceedButton;
	
	//BPPI
	private PageElement insuredsCommunicationReferenceNumberTextField;
	private PageElement periodOfBreakdownMonthsTextField;
	private PageElement specialConditionsWarrantiesTextArea;
	private PageElement standStillPeriodTitle;
	private PageElement insuredsCommunicationReferenceNumberMBTextField;

	public PolicyInsuredIntrestAttributeSTFICoverEngineering(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);
		//EF,EI,CF
		isSTFICoverRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is STFI Cover required?')]/following::select"),"Is STFI Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateForSTFICoverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate (%) for STFI Cover')]/following::input"),"Rate (%) for STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		//ER-Shruti
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		//BPPI
		insuredsCommunicationReferenceNumberTextField= new PageElement(By.xpath("//td/div[contains(text(),'Insureds Communication Reference Number')]/following::input"),"Insureds Communication Reference Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodOfBreakdownMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period of Breakdown(Months)')]/following::input"),"Period of Breakdown(Months) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsWarrantiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special conditions/warranties')]/following::textarea"),"Special conditions/warranties TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		insuredsCommunicationReferenceNumberMBTextField= new PageElement(By.xpath("//td//div[contains(text(),'Insureds Communication Reference  Number')]/following::input"),"Insureds Communication Reference Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	
	}
	
	public void fillPolicyInsuredIntrestAttributeSTFICoverEngineering(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("add") || polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("edit")){
			//EF,EI,CF
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
				selectValueFromList(isSTFICoverRequiredDropDown,polInsIntAttrSTFIEngEntityinsured.getStringValueForField("IsSTFICoverRequired"));
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigRateForSTFICover")) {
				clearAndSendKeys(rateForSTFICoverTextField, polInsIntAttrSTFIEngEntityinsured.getStringValueForField("RateForSTFICover"));
			}
		}
		else if(polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			//EF,EI,CF
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("IsSTFICoverRequired"), fetchValueFromList(isSTFICoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigRateForSTFICover")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("RateForSTFICover"), fetchValueFromTextFields(rateForSTFICoverTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			//For ER Product Workaround
			if(polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigBackER")){
				click(backButton);
				switchToFrame("display");
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
			}
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void clickOnBackButton(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			
		}
	}
	public void clickOnSaveButton(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured){
		if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	//Page while doing endorsement -Stand-Still Period BP
	public void fillPolicyInsuredIntrestEndorsementEngineeringPage(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("add") || polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredsCommunicationReferenceNumber")) {
				clearAndSendKeys(insuredsCommunicationReferenceNumberTextField, polInsIntAttrSTFIEngEntityinsured.getStringValueForField("InsuredsCommunicationReferenceNumber"));
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredsCommunicationReferenceNumberMB")) {
				clearAndSendKeys(insuredsCommunicationReferenceNumberMBTextField, polInsIntAttrSTFIEngEntityinsured.getStringValueForField("InsuredsCommunicationReferenceNumberMB"));
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigPeriodOfBreakdownMonths")) {
				clearAndSendKeys(periodOfBreakdownMonthsTextField, polInsIntAttrSTFIEngEntityinsured.getStringValueForField("PeriodOfBreakdownMonths"));
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				clearAndSendKeys(specialConditionsWarrantiesTextArea, polInsIntAttrSTFIEngEntityinsured.getStringValueForField("SpecialConditionsWarranties"));
			}
			click(forwardButton);
			switchToFrame("display");
			standStillPeriodTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+polInsIntAttrSTFIEngEntityinsured.getStringValueForField("StandStillPeriodTitle")+"')]"), "Stand-Still Period BP Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(standStillPeriodTitle);
		}
		else if(polInsIntAttrSTFIEngEntityinsured.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigInsuredsCommunicationReferenceNumber")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("InsuredsCommunicationReferenceNumber"), fetchValueFromTextFields(insuredsCommunicationReferenceNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigPeriodOfBreakdownMonths")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("PeriodOfBreakdownMonths"), fetchValueFromTextFields(periodOfBreakdownMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				assertReference.assertEquals(polInsIntAttrSTFIEngEntityinsured.getStringValueForField("SpecialConditionsWarranties"), fetchValueFromTextFields(specialConditionsWarrantiesTextArea), AssertionType.WARNING);
			}
		}
	}
	
	public void fillandSubmitPolicyInsuredIntrestAttributeSTFICoverEngineering(PolInsIntAttrSTFIEngEntity polInsIntAttrSTFIEngEntityinsured , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttrSTFIEngEntityinsured.getConfigExecute())){
			switchToFrame("display");
			 if(polInsIntAttrSTFIEngEntityinsured.getBooleanValueForField("ConfigEndorsement")){
				fillPolicyInsuredIntrestEndorsementEngineeringPage(polInsIntAttrSTFIEngEntityinsured, assertReference);
			}
			if(!polInsIntAttrSTFIEngEntityinsured.getStringValueForField("Product").equalsIgnoreCase("BPPI")){
				fillPolicyInsuredIntrestAttributeSTFICoverEngineering(polInsIntAttrSTFIEngEntityinsured ,assertReference);	
				clickOnForwardButton(polInsIntAttrSTFIEngEntityinsured );
			}
			
			clickOnSaveButton(polInsIntAttrSTFIEngEntityinsured);
			navigateToPolicy(polInsIntAttrSTFIEngEntityinsured );
			navigateToAttribute(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterest(polInsIntAttrSTFIEngEntityinsured );
			navigateToCoverage(polInsIntAttrSTFIEngEntityinsured );
			navigateToLoan(polInsIntAttrSTFIEngEntityinsured );
			navigateToClientDetails(polInsIntAttrSTFIEngEntityinsured );
			navigateToRelation(polInsIntAttrSTFIEngEntityinsured );
			navigateToPayment(polInsIntAttrSTFIEngEntityinsured );
			navigateToFollowup(polInsIntAttrSTFIEngEntityinsured );
			navigateToDocument(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterestDetails(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterestAttributes(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterestAttachCoverages(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterestRelations(polInsIntAttrSTFIEngEntityinsured );
			navigateToInsuredInterestPayments(polInsIntAttrSTFIEngEntityinsured );
		}
	}

}
