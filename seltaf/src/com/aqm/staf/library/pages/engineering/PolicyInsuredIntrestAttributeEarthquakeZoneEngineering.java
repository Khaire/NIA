package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttEQEngEntity;

public class PolicyInsuredIntrestAttributeEarthquakeZoneEngineering extends BasePage {
	//EI,EF
	private PageElement whetherTheEarthquakeCoverIsRequiredDropDown;
	private PageElement earthquakeZoneDropDown;

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
	private PageElement saveButton;
	private PageElement proceedButton;

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

	public PolicyInsuredIntrestAttributeEarthquakeZoneEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
		whetherTheEarthquakeCoverIsRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether the earthquake cover is required')]/following::select"),"Whether the earthquake cover is required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeZoneDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake Zone')]/following::select"),"Earthquake Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

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
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	public void fillPolicyInsuredIntrestAttributeEarthquakeZoneEngineering(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttEQEngEntity.getAction().equalsIgnoreCase("add") || polInsIntAttEQEngEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigWhetherTheEarthquakeCoverIsRequired")) {
				selectValueFromList(whetherTheEarthquakeCoverIsRequiredDropDown,polInsIntAttEQEngEntity.getStringValueForField("WhetherTheEarthquakeCoverIsRequired"));
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				selectValueFromList(earthquakeZoneDropDown,polInsIntAttEQEngEntity.getStringValueForField("EarthquakeZone"));
			}
		}
		else if(polInsIntAttEQEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntAttEQEngEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigWhetherTheEarthquakeCoverIsRequired")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("WhetherTheEarthquakeCoverIsRequired"), fetchValueFromList(whetherTheEarthquakeCoverIsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigEarthquakeZone")) {
				assertReference.assertEquals(polInsIntAttEQEngEntity.getStringValueForField("EarthquakeZone"), fetchValueFromList(earthquakeZoneDropDown), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			if(polInsIntAttEQEngEntity.getBooleanValueForField("ConfigBackER")){
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
				
			}
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void clickOnBackButton(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnSaveButton(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity){
		if (polInsIntAttEQEngEntity.getBooleanValueForField("ConfigSaveButton")){
			if(polInsIntAttEQEngEntity.getStringValueForField("Product").equalsIgnoreCase("EI")) {
				click(backwardButton);
				click(forwardButton);
				click(forwardButton);
				
			}
			click(saveButton);
		}
	}
	public void fillandSubmitPolicyInsuredIntrestAttributeEarthquakeZoneEngineering(PolInsIntAttEQEngEntity polInsIntAttEQEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttEQEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestAttributeEarthquakeZoneEngineering(polInsIntAttEQEngEntity,assertReference);	
			clickOnForwardButton(polInsIntAttEQEngEntity);
			clickOnSaveButton(polInsIntAttEQEngEntity);
			navigateToPolicy(polInsIntAttEQEngEntity);
			navigateToAttribute(polInsIntAttEQEngEntity);
			navigateToInsuredInterest(polInsIntAttEQEngEntity);
			navigateToCoverage(polInsIntAttEQEngEntity);
			navigateToLoan(polInsIntAttEQEngEntity);
			navigateToClientDetails(polInsIntAttEQEngEntity);
			navigateToRelation(polInsIntAttEQEngEntity);
			navigateToPayment(polInsIntAttEQEngEntity);
			navigateToFollowup(polInsIntAttEQEngEntity);
			navigateToDocument(polInsIntAttEQEngEntity);
			navigateToInsuredInterestDetails(polInsIntAttEQEngEntity);
			navigateToInsuredInterestAttributes(polInsIntAttEQEngEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttEQEngEntity);
			navigateToInsuredInterestRelations(polInsIntAttEQEngEntity);
			navigateToInsuredInterestPayments(polInsIntAttEQEngEntity);
		}
	}
}
