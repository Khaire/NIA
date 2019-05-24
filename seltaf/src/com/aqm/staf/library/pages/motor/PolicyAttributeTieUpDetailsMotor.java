package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrTieUpDetMotorEntity;
import com.aqm.staf.library.databin.PolAttributeMotorEntity;

public class PolicyAttributeTieUpDetailsMotor extends BasePage{

	private PageElement	isBusinessSourcedFromTieUpDropDown;

	private PageElement	autoTieUpTypeDropDown;
	//old
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

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;


	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestDocumentsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestDocumentsTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement insuredInterestScheduleTitle;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	
	public PolicyAttributeTieUpDetailsMotor (WebDriver driver, String pageName){
		super(driver,pageName);

		isBusinessSourcedFromTieUpDropDown	=new PageElement(By.xpath("//td//div[contains(text(),'Is Business Sourced from Tie Up')]/following::select"), "Is Business Sourced from Tie Up", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		autoTieUpTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Auto Tie Up Type')]/following::select"), "Auto Tie Up Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/font/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDocumentsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyAttributeTieUpDetailsMotorrDetails(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity , CustomAssert assertReference) throws InterruptedException{

		if(polAttrTieUpDetMotorEntity.getAction().equalsIgnoreCase("add") || polAttrTieUpDetMotorEntity.getAction().equalsIgnoreCase("edit")){

			if(polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigIsBusinessSourcedFromTieUp")){
				selectValueFromList(isBusinessSourcedFromTieUpDropDown,polAttrTieUpDetMotorEntity.getStringValueForField("IsBusinessSourcedFromTieUp"));
			}
			if(polAttrTieUpDetMotorEntity.getBooleanValueForField("CofigAutoTieUpType")){
				selectValueFromList(autoTieUpTypeDropDown,polAttrTieUpDetMotorEntity.getStringValueForField("AutoTieUpType"));
			}

		}
		else if(polAttrTieUpDetMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigIsBusinessSourcedFromTieUp")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("IsBusinessSourcedFromTieUp"), fetchValueFromList(isBusinessSourcedFromTieUpDropDown), AssertionType.WARNING);
			}
			if (polAttrTieUpDetMotorEntity.getBooleanValueForField("CofigAutoTieUpType")) {
				assertReference.assertEquals(polAttrTieUpDetMotorEntity.getStringValueForField("AutoTieUpType"), fetchValueFromList(autoTieUpTypeDropDown), AssertionType.WARNING);
			}
		}

	}
	public void navigateToPolicy(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestDocuments")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnBackButton(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity){
		if (polAttrTieUpDetMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void fillandSubmitPolicyAttributeTieUpDetailsMotorrDetailss(PolAttrTieUpDetMotorEntity  polAttrTieUpDetMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrTieUpDetMotorEntity.getConfigExecute())){
			fillPolicyAttributeTieUpDetailsMotorrDetails(polAttrTieUpDetMotorEntity, assertReference);
			clickOnForwardButton(polAttrTieUpDetMotorEntity );
			navigateToPolicy(polAttrTieUpDetMotorEntity );
			navigateToAttribute(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterest(polAttrTieUpDetMotorEntity );
			navigateToCoverage(polAttrTieUpDetMotorEntity );
			navigateToLoan(polAttrTieUpDetMotorEntity );
			navigateToClientDetails(polAttrTieUpDetMotorEntity );
			navigateToRelation(polAttrTieUpDetMotorEntity );
			navigateToPayment(polAttrTieUpDetMotorEntity );
			navigateToFollowup(polAttrTieUpDetMotorEntity );
			navigateToDocument(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestDetails(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestAttributes(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestAttachCoverages(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestRelations(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestDocuments(polAttrTieUpDetMotorEntity);
			navigateToInsuredInterestPayments(polAttrTieUpDetMotorEntity );
			navigateToInsuredInterestSchedule(polAttrTieUpDetMotorEntity);

		}
	}
}

