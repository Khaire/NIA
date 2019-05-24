package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PolicyBreakInInsuranceEntity;

public class PolicyAttributeBreakInInsuranceHealth extends BasePage {
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
	private PageElement insureAttachCoverageTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement nextAttributePageTitle;


	private PageElement policyAttributesPageBreakInInsuranceTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement breakInInsuranceDropdown;
	private PageElement breakInInsuranceStatusDropdown;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;
	private PageElement policyBreakInsuranceTabTitle;


	private PageElement breakinInsurancemorethandaysDropdown;
	private PageElement IsTPARequiredDropdown;

	public PolicyAttributeBreakInInsuranceHealth(WebDriver driver,String pageName) {
		super(driver, pageName);

		policyAttributesPageBreakInInsuranceTitle = new PageElement(By.xpath("//div/b[contains(text(),'Break-in-Insurance')]"), "Policy Attributes Page Break In Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		insureAttachCoverageTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Attach Coverages')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Development Officer')]"), "Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		breakInInsuranceDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Break-in-Insurance", "select")), "Select Break-in-Insurance Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		breakInInsuranceStatusDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Break-in-Insurance Status", "select")), "Select Break-in-Insurance Status Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		breakinInsurancemorethandaysDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Break-in Insurance more than 30 days", "select")), "Select Break-in Insurance more than 30 days Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IsTPARequiredDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is TPA Required", "select")), "Select Is TPA Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillBreakInInsuranceAttribute(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity, CustomAssert assertReference){
		if(policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("add") || policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("edit")){
			if(!(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("SP")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))){
				if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakInInsurance")) {


					try {
						selectValueFromList(breakInInsuranceDropdown, policyBreakInInsuranceEntity.getStringValueForField("BreakInInsurance"));
						if(!(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TG")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("FM")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("GT")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("UH")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("RS")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("GJ")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("PZ"))) {
							click(forwordButton);
						}
					}
					catch(Exception e)
					{
						System.out.println("No Forward button present");
					}
					//click(forwordButton);
				}
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakInInsuranceStatus")) {
				selectValueFromList(breakInInsuranceStatusDropdown, policyBreakInInsuranceEntity.getStringValueForField("BreakInInsuranceStatus"));
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakInInsuranceTF")) {
				selectValueFromList(breakInInsuranceDropdown, policyBreakInInsuranceEntity.getStringValueForField("BreakInInsuranceTF"));
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakinInsurancemorethandays")) {
				selectValueFromList(breakinInsurancemorethandaysDropdown, policyBreakInInsuranceEntity.getStringValueForField("BreakinInsurancemorethandays"));
			}
		}

		else if(policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("verify")){

			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("SchemeNo"), fetchValueFromTextFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakInInsurance")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("BreakInInsurance"), fetchValueFromList(breakInInsuranceDropdown), AssertionType.WARNING);
				//if(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("RS")){
				//click(forwordButton);
				//}

				//assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("BreakInInsurance"), fetchValueFromList(breakInInsuranceDropdown), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakInInsuranceStatus")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("BreakInInsuranceStatus"), fetchValueFromList(breakInInsuranceStatusDropdown), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBreakinInsurancemorethandays")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("BreakinInsurancemorethandays"), fetchValueFromList(breakinInsurancemorethandaysDropdown), AssertionType.WARNING);
			}
			if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigIsTPARequired")) {
				assertReference.assertEquals(policyBreakInInsuranceEntity.getStringValueForField("IsTPARequired"), fetchValueFromList(IsTPARequiredDropdown), AssertionType.WARNING);
			}
		}
	}

	private void backToMainAttributePage(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity) {
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void navigateToPreviousAttributePage(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity) {
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void clickNextButtonBreakInInsuranceDetails(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity) {
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigForwordButton")){	
			if(((policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("HN")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("FM")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("RS")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("UH")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TF")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("IC")||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("PZ"))&&(!(policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("verify"))))&&(!(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("UK")))||(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("GJ"))|| (policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("GT"))|| (policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("SP"))|| (policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TF"))||policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TG")){
				//if(!(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("UK"))){
				click(forwordButton);
			}
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch (Exception e){

			}
		}
		if((policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("TU")||(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("RS")) && (policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("verify")))) {
			click(forwordButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch (Exception e){

			}
		}
		if((policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("MU")) && (policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("verify"))) {
			click(forwordButton);
		}
		switchToFrame("display");

		//}
		//*******************************Break-in-Insurance-new******************************//


		if( !policyBreakInInsuranceEntity.getAction().equalsIgnoreCase("verify")){
			if(!(policyBreakInInsuranceEntity.getStringValueForField("Product").equalsIgnoreCase("BH"))&&policyBreakInInsuranceEntity.getBooleanValueForField("ConfigEndorse")){
				click(forwordButton);
				click(saveButton);
				switchToFrame("display");
			}
		}
	}
	private void saveBreakInInsurance(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity) {
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");

		}
	}
	public void navigateToPolicy(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToInsureAttachCoverageTab(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity){
		if (policyBreakInInsuranceEntity.getBooleanValueForField("ConfigAttachCoverageTab")){		
			click(insureAttachCoverageTab);
			switchToFrame("display");

		}
	}
	public void fillandSubmitPolicyAttibutesBreakInInsuranceHealth(PolicyBreakInInsuranceEntity policyBreakInInsuranceEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyBreakInInsuranceEntity.getConfigExecute())){
			switchToFrame("display");
			fillBreakInInsuranceAttribute(policyBreakInInsuranceEntity, assertReference);
			clickNextButtonBreakInInsuranceDetails(policyBreakInInsuranceEntity);
			backToMainAttributePage(policyBreakInInsuranceEntity);
			saveBreakInInsurance(policyBreakInInsuranceEntity);
			navigateToPreviousAttributePage(policyBreakInInsuranceEntity);
			navigateToPolicy(policyBreakInInsuranceEntity);
			navigateToAttribute(policyBreakInInsuranceEntity);
			navigateToMember(policyBreakInInsuranceEntity);
			navigateToCoverage(policyBreakInInsuranceEntity);
			navigateToLoan(policyBreakInInsuranceEntity);
			navigateToRelation(policyBreakInInsuranceEntity);
			navigateToPayment(policyBreakInInsuranceEntity);
			navigateToFollowup(policyBreakInInsuranceEntity);
			navigateToDocument(policyBreakInInsuranceEntity);
			navigateToInsureAttachCoverageTab(policyBreakInInsuranceEntity);
		}
		navigateToClientDetails(policyBreakInInsuranceEntity);
	}


}
