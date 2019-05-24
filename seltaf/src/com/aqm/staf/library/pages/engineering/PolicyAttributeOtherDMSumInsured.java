package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrDiscretDisEngEntity;
import com.aqm.staf.library.databin.PolAttrOtherDMSIEngEntity;

public class PolicyAttributeOtherDMSumInsured extends BasePage{
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

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

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

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement backwardButton;
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Mayur_Product name=EC
	private PageElement otherSIForDMTextArea;

	//BP/EI_Product
	private PageElement incurredClaimRatioTextField;
	private PageElement maintenanceForBoilerClassRatedDropdown;
	private PageElement calculatedTechnicalDiscountPercentTextField;
	private PageElement technicalDiscountAdjustmentFactorTextField;
	private PageElement technicalDiscountTextField;
	private PageElement otherDMSumInsuredPageTitle;
	private PageElement provisionalPolicyDetailsPageTitle;

	//EF/EI
	private PageElement maintenanceOfTheEquipmentDropDown;

	private PageElement maintenanceForCPMClassRatedDropDown;

	public PolicyAttributeOtherDMSumInsured(WebDriver driver, String pageName) {
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
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backwardButton=new PageElement(By.name("btnPrevious"), "Backward Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Mayur_Product name=EC
		otherSIForDMTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Other SI for DM')]/following::TextArea"), "Other SI for DM Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BP/EI_Product
		incurredClaimRatioTextField = new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim ratio')]/following::input"), "Incurred Claim ratio Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintenanceForBoilerClassRatedDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Maintenance for Boiler(Class rated)')]/following::select"), "Maintenance for Boiler(Class rated) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedTechnicalDiscountPercentTextField = new PageElement(By.xpath("//td//div[contains(text(),'Calculated Technical Discount (%)')]/following::input"), "Calculated Technical Discount (%) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalDiscountAdjustmentFactorTextField = new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount Adjustment Factor')]/following::input"), "Technical Discount Adjustment Factor Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		technicalDiscountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount')]/following::td[4]/following::input"), "Technical Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EF/EI
		maintenanceOfTheEquipmentDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Maintenance of  the Equipment')]/following::select"), "Maintenance of the Equipment", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maintenanceForCPMClassRatedDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Maintenance for CPM (Class rated)')]/following::select"), "Maintenance for CPM (Class rated) Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


	}
	public void fillPolicyAttributeOtherDMSumInsured(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity, CustomAssert assertReference){
		if(polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("add") || polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=EC
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigOtherSIForDM")) {
				clearAndSendKeys(otherSIForDMTextArea, polAttrOtherDMSIEngEntity.getStringValueForField("OtherSIForDM"));
			}
		}
		else if(polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//Mayur_Product name=EC	
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigOtherSIForDM")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("OtherSIForDM"), fetchValueFromTextFields(otherSIForDMTextArea), AssertionType.WARNING);
			}
		}
	}
	//Merit Rating Details BP  Page/EI 
	public void fillPolicyAttributeMeritRatingDetailsBP(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity, CustomAssert assertReference){
		if(polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("add") || polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceForBoilerClassRated")) {
				selectValueFromList(maintenanceForBoilerClassRatedDropdown, polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceForBoilerClassRated"));
			}

			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceForCPMClassRated")) {
				selectValueFromList(maintenanceForCPMClassRatedDropDown, polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceForCPMClassRated"));
			}

			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				clearAndSendKeys(technicalDiscountAdjustmentFactorTextField, polAttrOtherDMSIEngEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"));
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceOfTheEquipment")) {
				selectValueFromList(maintenanceOfTheEquipmentDropDown, polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceOfTheEquipment"));
			}
			click(forwardButton);
			if(polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
			}
			switchToFrame("display");
			otherDMSumInsuredPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrOtherDMSIEngEntity.getStringValueForField("OtherDMSumInsuredPageTitle")+"')]"), "Other DM Sum Insured Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(otherDMSumInsuredPageTitle);
		}
		else if(polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioTextField), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceForBoilerClassRated")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceForBoilerClassRated"), fetchValueFromList(maintenanceForBoilerClassRatedDropdown), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceForCPMClassRated")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceForCPMClassRated"), fetchValueFromList(maintenanceForCPMClassRatedDropDown), AssertionType.WARNING);
			}

			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigCalculatedTechnicalDiscountPercent")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("CalculatedTechnicalDiscountPercent"), fetchValueFromTextFields(calculatedTechnicalDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"), fetchValueFromTextFields(technicalDiscountAdjustmentFactorTextField), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("TechnicalDiscount"), fetchValueFromTextFields(technicalDiscountTextField), AssertionType.WARNING);
			}
			if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigMaintenanceOfTheEquipment")) {
				assertReference.assertEquals(polAttrOtherDMSIEngEntity.getStringValueForField("MaintenanceOfTheEquipment"), fetchValueFromList(maintenanceOfTheEquipmentDropDown), AssertionType.WARNING);
			}
			click(forwardButton);
			if(polAttrOtherDMSIEngEntity.getAction().equalsIgnoreCase("verify") && polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e){

				}
			}
			switchToFrame("display");
			otherDMSumInsuredPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrOtherDMSIEngEntity.getStringValueForField("OtherDMSumInsuredPageTitle")+"')]"), "Other DM Sum Insured Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(otherDMSumInsuredPageTitle);
		}
	}

	public void navigateToPolicy(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			provisionalPolicyDetailsPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrOtherDMSIEngEntity.getStringValueForField("ProvisionalPolicyDetailsPageTitle")+"')]"), "Provisional Policy Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(provisionalPolicyDetailsPageTitle);
		}
	}
	public void clickOnBackButton(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity){
		if (polAttrOtherDMSIEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitPolicyAttributeOtherDMSumInsured(PolAttrOtherDMSIEngEntity polAttrOtherDMSIEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrOtherDMSIEngEntity.getConfigExecute())){
			//Merit Rating Details Page
			if(polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")||polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("EI")||polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("EF") || polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("CF") || polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("CM")||polAttrOtherDMSIEngEntity.getStringValueForField("Product").equalsIgnoreCase("DSMB")){
				fillPolicyAttributeMeritRatingDetailsBP(polAttrOtherDMSIEngEntity, assertReference);
			}
			fillPolicyAttributeOtherDMSumInsured(polAttrOtherDMSIEngEntity, assertReference);
			clickOnForwardButton(polAttrOtherDMSIEngEntity);
			navigateToPolicy(polAttrOtherDMSIEngEntity);
			navigateToAttribute(polAttrOtherDMSIEngEntity);
			navigateToInsuredInterest(polAttrOtherDMSIEngEntity);
			navigateToCoverage(polAttrOtherDMSIEngEntity);
			navigateToLoan(polAttrOtherDMSIEngEntity);
			navigateToClientDetails(polAttrOtherDMSIEngEntity);
			navigateToRelation(polAttrOtherDMSIEngEntity);
			navigateToPayment(polAttrOtherDMSIEngEntity);
			navigateToFollowup(polAttrOtherDMSIEngEntity);
			navigateToDocument(polAttrOtherDMSIEngEntity);
		}
	}	

}
