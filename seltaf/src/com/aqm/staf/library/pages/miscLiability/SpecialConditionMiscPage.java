package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolSpecialConditnMiscEntity;


public class SpecialConditionMiscPage extends BasePage {
	private PageElement specialConditionPageTitle;	
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
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	private PageElement isThisIndianInterestAbroadPolicyDropdown;
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement previousButton;
	private PageElement typeOfDevPageTitle;
	//For WC
	private PageElement proceedButton;
	private PageElement specialConditionTitle;

	public SpecialConditionMiscPage(WebDriver driver, String pageName) {
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
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		isThisIndianInterestAbroadPolicyDropdown=new PageElement(By.name("propValues1"), "Is this Indian Interest Abroad policy Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		forwardButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfDevPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]"), "Type Of Devlopment Title Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button On Attribute Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		specialConditionTitle= new PageElement(By.xpath("//div//b[contains(text(),'Special Condition')]"), "Special Condition  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillSpecialConditionMiscPage(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity, CustomAssert assertReference){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		if(polSpecialConditnMiscEntity.getAction().equalsIgnoreCase("add") || polSpecialConditnMiscEntity.getAction().equalsIgnoreCase("edit")){

			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				wait.until(ExpectedConditions.visibilityOf(getWebElement(isThisIndianInterestAbroadPolicyDropdown)));
				selectValueFromList(isThisIndianInterestAbroadPolicyDropdown, polSpecialConditnMiscEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"));
			}

		}
		else if(polSpecialConditnMiscEntity.getAction().equalsIgnoreCase("verify")){
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				assertReference.assertEquals(polSpecialConditnMiscEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"), fetchValueFromList(isThisIndianInterestAbroadPolicyDropdown), AssertionType.WARNING);
			}

		}
	}
	private void submitSpecialConditnMiscDetails(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity) throws InterruptedException {
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigForwordButton")){	
			click(forwardButton);
			Thread.sleep(3000);
			if(!(polSpecialConditnMiscEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||polSpecialConditnMiscEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))) {
				click(saveButton);
				switchToFrame("display");
				specialConditionPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polSpecialConditnMiscEntity.getStringValueForField("SpecialConditionPageTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(specialConditionPageTitle);
			}

		}


	}
	private void navigateToAttributePage(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity) {
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			//attribute Page
			click(proceedButton);
			switchToFrame("display");
			//Policy Attribute
			click(forwardButton);
			switchToFrame("display");
			//Details of wages and Accidents 
			click(forwardButton);
			switchToFrame("display");
			//Previous Policy History CO 
			click(forwardButton);
			switchToFrame("display");
			//Provisional_Policy_Details_ML 
			click(forwardButton);
			switchToFrame("display");
			//Type Of Development Officer 
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(specialConditionTitle);

		}
	}

	public void navigateToPolicy(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");

		}
	}
	public void navigateToCoverage(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void navigateToPreviousButton(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity){
		if (polSpecialConditnMiscEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(typeOfDevPageTitle);
			click(forwardButton);
			switchToFrame("display");


		}
	}

	public void fillandSubmitSpecialConditionPagePolicyAttibutesMisc(PolSpecialConditnMiscEntity polSpecialConditnMiscEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polSpecialConditnMiscEntity.getConfigExecute())){
			switchToFrame("display");
			//For WC Product
			if(polSpecialConditnMiscEntity.getStringValueForField("Product").equalsIgnoreCase("WC")) {
				navigateToAttributePage(polSpecialConditnMiscEntity);
			}
			fillSpecialConditionMiscPage(polSpecialConditnMiscEntity, assertReference);
			submitSpecialConditnMiscDetails(polSpecialConditnMiscEntity);
			//navigateToAttributePage(polSpecialConditnMiscEntity);
			navigateToPolicy(polSpecialConditnMiscEntity);
			navigateToAttribute(polSpecialConditnMiscEntity);
			navigateToMember(polSpecialConditnMiscEntity);
			navigateToCoverage(polSpecialConditnMiscEntity);
			navigateToLoan(polSpecialConditnMiscEntity);
			navigateToClientDetails(polSpecialConditnMiscEntity);
			navigateToRelation(polSpecialConditnMiscEntity);
			navigateToPayment(polSpecialConditnMiscEntity);
			navigateToFollowup(polSpecialConditnMiscEntity);
			navigateToDocument(polSpecialConditnMiscEntity);
		}

	}




}
