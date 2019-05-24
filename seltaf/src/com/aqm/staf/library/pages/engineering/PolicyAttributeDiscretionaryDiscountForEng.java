package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrDiscretDisEngEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;

public class PolicyAttributeDiscretionaryDiscountForEng extends BasePage{

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
	//Mayur_Product Name= WP 
	private PageElement discretionaryDiscountPercentTextField;
	private PageElement discretionaryDiscountControlNumberTextField;
	private PageElement discountInLieuOfAgentCommissionPercentTextField;
	private PageElement additionalDiscretionaryDiscountPercentTextField;
	private PageElement additionalDiscretionaryDiscountControlNumberTextField;
	//FD-Yogesh
	private PageElement basisOfMonthlyDeclarationDropdown;	
	private PageElement productClassificationDropdown;	
	private PageElement excessOptedByTheInsuredDropdown;
	private PageElement applicableVoluntaryDiscountTextfield;
	
	private PageElement voluntaryDeductiblesChosenDropdown;
	private PageElement addOnCoversPageTitle;

	public PolicyAttributeDiscretionaryDiscountForEng(WebDriver driver, String pageName) {
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
		discretionaryDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount (%)')]/following::input"), "Discretionary Discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discretionaryDiscountControlNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discretionary Discount Control Number')]/following::input"), "Discretionary Discount Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountInLieuOfAgentCommissionPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Discount in lieu of Agent Commission(%)')]/following::input"), "Discount in lieu of Agent Commission(%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional discretionary Discount (%)')]/following::input"), "Additional discretionary Discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDiscretionaryDiscountControlNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional discretionary Discount Control Number')]/following::input"), "Additional discretionary Discount Control Number Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FD-Yogesh
		basisOfMonthlyDeclarationDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Basis of Monthly declaration')]/following::select"), "Basis of Monthly declaration Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		productClassificationDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Product Classification')]/following::select"), "Product Classification Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessOptedByTheInsuredDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Excess opted by the insured')]/following::select"), "Excess opted by the insured Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		applicableVoluntaryDiscountTextfield= new PageElement(By.xpath("//td//div[contains(text(),'Applicable voluntary discount (%)')]/following::input"), "Applicable voluntary discount (%) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		voluntaryDeductiblesChosenDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Voluntary deductibles chosen')]/following::select"), "Excess opted by the insured Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
	}

	public void fillPolicyAttributeDiscretionaryDiscountForEng(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity, CustomAssert assertReference){
		if(polAttrDiscretDisEngEntity.getAction().equalsIgnoreCase("add") || polAttrDiscretDisEngEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscretionaryDiscountControlNumber")) {
				clearAndSendKeys(discretionaryDiscountControlNumberTextField, polAttrDiscretDisEngEntity.getStringValueForField("DiscretionaryDiscountControlNumber"));
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercent")) {
				clearAndSendKeys(discretionaryDiscountPercentTextField, polAttrDiscretDisEngEntity.getStringValueForField("DiscretionaryDiscountPercent"));
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountControlNumber")) {
				clearAndSendKeys(additionalDiscretionaryDiscountControlNumberTextField, polAttrDiscretDisEngEntity.getStringValueForField("AdditionalDiscretionaryDiscountControlNumber"));
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercent")) {
				clearAndSendKeys(discountInLieuOfAgentCommissionPercentTextField, polAttrDiscretDisEngEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercent"));
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercent")) {
				clearAndSendKeys(additionalDiscretionaryDiscountPercentTextField, polAttrDiscretDisEngEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercent"));
			}
			//FD-Yogesh
			if(polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigBasisOfMonthlyDeclaration")){
				selectValueFromList(basisOfMonthlyDeclarationDropdown,polAttrDiscretDisEngEntity.getStringValueForField("BasisOfMonthlyDeclaration"));
			}
			if(polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigProductClassification")){
				selectValueFromList(productClassificationDropdown,polAttrDiscretDisEngEntity.getStringValueForField("ProductClassification"));
			}
			if(polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigExcessOptedByTheInsured")){
				selectValueFromList(excessOptedByTheInsuredDropdown,polAttrDiscretDisEngEntity.getStringValueForField("ExcessOptedByTheInsured"));
			}
			if(polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosen")){
				selectValueFromList(voluntaryDeductiblesChosenDropdown,polAttrDiscretDisEngEntity.getStringValueForField("VoluntaryDeductiblesChosen"));
			}
			
			
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigApplicableVoluntaryDiscount")) {
				clearAndSendKeys(applicableVoluntaryDiscountTextfield, polAttrDiscretDisEngEntity.getStringValueForField("ApplicableVoluntaryDiscount"));
			}
		}
		else if(polAttrDiscretDisEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscretionaryDiscountPercent")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("DiscretionaryDiscountPercent"), fetchValueFromTextFields(discretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscretionaryDiscountControlNumber")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("DiscretionaryDiscountControlNumber"), fetchValueFromTextFields(discretionaryDiscountControlNumberTextField), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDiscountInLieuOfAgentCommissionPercent")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("DiscountInLieuOfAgentCommissionPercent"), fetchValueFromTextFields(discountInLieuOfAgentCommissionPercentTextField), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountPercent")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("AdditionalDiscretionaryDiscountPercent"), fetchValueFromTextFields(additionalDiscretionaryDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigAdditionalDiscretionaryDiscountControlNumber")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("AdditionalDiscretionaryDiscountControlNumber"), fetchValueFromTextFields(additionalDiscretionaryDiscountControlNumberTextField), AssertionType.WARNING);
			}
			//FD-Yogesh
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigBasisOfMonthlyDeclaration")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("BasisOfMonthlyDeclaration"), fetchValueFromList(basisOfMonthlyDeclarationDropdown), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigProductClassification")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("ProductClassification"), fetchValueFromList(productClassificationDropdown), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigExcessOptedByTheInsured")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("ExcessOptedByTheInsured"), fetchValueFromList(excessOptedByTheInsuredDropdown), AssertionType.WARNING);
			}
			if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigApplicableVoluntaryDiscount")) {
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("ApplicableVoluntaryDiscount"), fetchValueFromTextFields(applicableVoluntaryDiscountTextfield), AssertionType.WARNING);
			}
			if(polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigVoluntaryDeductiblesChosen")){
				assertReference.assertEquals(polAttrDiscretDisEngEntity.getStringValueForField("VoluntaryDeductiblesChosen"), fetchValueFromList(voluntaryDeductiblesChosenDropdown), AssertionType.WARNING);
				
			}
			
			
		}
	}

	public void navigateToPolicy(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			/*addOnCoversPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrDiscretDisEngEntity.getStringValueForField("NextPageTitle")+"')]"), "Add On Covers Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(addOnCoversPageTitle);*/
		}
	}
	public void clickOnBackButton(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity){
		if (polAttrDiscretDisEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitPolicyAttributeDiscretionaryDiscountForEng(PolAttrDiscretDisEngEntity polAttrDiscretDisEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrDiscretDisEngEntity.getConfigExecute())){
			fillPolicyAttributeDiscretionaryDiscountForEng(polAttrDiscretDisEngEntity, assertReference);
			clickOnForwardButton(polAttrDiscretDisEngEntity);
			navigateToPolicy(polAttrDiscretDisEngEntity);
			navigateToAttribute(polAttrDiscretDisEngEntity);
			navigateToInsuredInterest(polAttrDiscretDisEngEntity);
			navigateToCoverage(polAttrDiscretDisEngEntity);
			navigateToLoan(polAttrDiscretDisEngEntity);
			navigateToClientDetails(polAttrDiscretDisEngEntity);
			navigateToRelation(polAttrDiscretDisEngEntity);
			navigateToPayment(polAttrDiscretDisEngEntity);
			navigateToFollowup(polAttrDiscretDisEngEntity);
			navigateToDocument(polAttrDiscretDisEngEntity);
		}
	}	
}
