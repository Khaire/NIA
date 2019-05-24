package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrFireEntity;
import com.aqm.staf.library.databin.SFStatIntermedFireEntity;

public class PolicyAttributeSFStatusOfIntermediariesFire extends BasePage{
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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement forwardButton;
	private PageElement backButton;
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
	private PageElement previousButton;
	//LR Dharmendra
	private PageElement nameofBankerFinancialInstitutionTextField;
	private PageElement propertyatStakeTextField;
	private PageElement valueofPropertyTextField;	
	private PageElement locationAddressTextField;
	//FF Dharmendra
	private PageElement isthebusinessdirectDropDown;
	private PageElement discountforDirectBusinessTextField;
	private PageElement installmentPercentageListOpenButton;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	private PageElement serialNoTextField;	
	private PageElement installmentPercentageTextField;

	/* SA- Rajkumar*/
	private PageElement isThisAFloaterTypePolicyDropDown;	
	private PageElement nCBDiscountTextField;
	private PageElement lCBDiscountTextField;
	private PageElement subjectivitiesTextArea;
	private PageElement exclusionsTextArea;
	private PageElement deductibleTextArea;
	private PageElement typeOfCoverageForSADropDown;
	private PageElement insuredInterestWordingForPropertyDamageTextArea;
	private PageElement insuredInterestWordingForBusinessInterruptionTextArea;
	private PageElement isThereAnyAddOnCoverExtensionPropertyDamageDropDown;
	private PageElement isThereAnyAddOnCoverExtensionBusinessInterruptionDropDown;

	public PolicyAttributeSFStatusOfIntermediariesFire(WebDriver driver, String pageName){
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
		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//LR Dharmendra
		nameofBankerFinancialInstitutionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of Banker / Financial Institution')]/following::input"), "Name of Banker / Financial Institution", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		propertyatStakeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Property at Stake')]/following::input"), "Property at Stake", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueofPropertyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value of Property')]/following::input"), "Value of Property", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationAddressTextField=new PageElement(By.xpath("//td//div[contains(text(),'Location Address')]/following::input"), "Location Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FF Dharmendra
		installmentPercentageListOpenButton= new PageElement(By.name("propValues3"), "Installment Percentage List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextField= new PageElement(By.name("slNo0"), "Serial No. ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageTextField= new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountforDirectBusinessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount for Direct Business(%)')]/following::input"), "Discount for Direct Business(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isthebusinessdirectDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the business direct')]/following::select"), "Is the business direct", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isThisAFloaterTypePolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is this a floater type policy')]/following::select"), "Is This A Floater Type Policy List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nCBDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'NCB Discount (%)')]/following::input"), "NCB Discount Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lCBDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'LCB Discount (%)')]/following::input"), "LCB Discount Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subjectivitiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Subjectivities')]/following::textarea"), "Subjectivities Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		exclusionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Exclusions')]/following::textarea"), "Exclusions Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Deductible(In words)')]/following::textarea"), "Deductible Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfCoverageForSADropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Coverage for SA')]/following::select"), "Type Of Coverage For SA List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		insuredInterestWordingForPropertyDamageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Property Damage')]/following::textarea"), "Insured Interest Wording For Property Damage Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		insuredInterestWordingForBusinessInterruptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Business Interruption')]/following::textarea"), "Insured Interest Wording For Business Interruption Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isThereAnyAddOnCoverExtensionPropertyDamageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover / Extension applicable for Property Damage')]/following::select"), "Is There Any Add On Cover Extension Property Damage List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isThereAnyAddOnCoverExtensionBusinessInterruptionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover / Extension applicable for Business Interruption')]/following::select"), "Is There Any Add On Cover Extension Business Interruption List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	public void fillPolicyAttributeSFStatusOfIntermediariesFire(SFStatIntermedFireEntity sFStatIntermedFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(sFStatIntermedFireEntity.getAction().equalsIgnoreCase("add") || sFStatIntermedFireEntity.getAction().equalsIgnoreCase("edit")){
			//LR Dharmendra
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigNameofBankerFinancialInstitution")) {
				clearAndSendKeys(nameofBankerFinancialInstitutionTextField, sFStatIntermedFireEntity.getStringValueForField("NameofBankerFinancialInstitution"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPropertyatStake")) {
				clearAndSendKeys(propertyatStakeTextField, sFStatIntermedFireEntity.getStringValueForField("PropertyatStake"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigValueofProperty")) {
				clearAndSendKeys(valueofPropertyTextField, sFStatIntermedFireEntity.getStringValueForField("ValueofProperty"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigLocationAddress")) {
				clearAndSendKeys(locationAddressTextField, sFStatIntermedFireEntity.getStringValueForField("LocationAddress"));
			}
			//FF Dharmendra
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				fillInstallmentPercentageListOpenButton(sFStatIntermedFireEntity);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigDiscountforDirectBusiness")) {
				clearAndSendKeys(discountforDirectBusinessTextField, sFStatIntermedFireEntity.getStringValueForField("DiscountforDirectBusiness"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsthebusinessdirect")) {
				selectValueFromList(isthebusinessdirectDropDown, sFStatIntermedFireEntity.getStringValueForField("Isthebusinessdirect"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThisAFloaterTypePolicy")) {
				selectValueFromList(isThisAFloaterTypePolicyDropDown, sFStatIntermedFireEntity.getStringValueForField("IsThisAFloaterTypePolicy"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigNCBDiscount")) {
				clearAndSendKeys(nCBDiscountTextField, sFStatIntermedFireEntity.getStringValueForField("NCBDiscount"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigLCBDiscount")) {
				clearAndSendKeys(lCBDiscountTextField, sFStatIntermedFireEntity.getStringValueForField("LCBDiscount"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigSubjectivities")) {
				clearAndSendKeys(subjectivitiesTextArea, sFStatIntermedFireEntity.getStringValueForField("Subjectivities"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigExclusions")) {
				clearAndSendKeys(exclusionsTextArea, sFStatIntermedFireEntity.getStringValueForField("Exclusions"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextArea, sFStatIntermedFireEntity.getStringValueForField("Deductible"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigTypeOfCoverageForSA")) {
				selectValueFromList(typeOfCoverageForSADropDown, sFStatIntermedFireEntity.getStringValueForField("TypeOfCoverageForSA"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				clearAndSendKeys(insuredInterestWordingForPropertyDamageTextArea, sFStatIntermedFireEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				clearAndSendKeys(insuredInterestWordingForBusinessInterruptionTextArea, sFStatIntermedFireEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionPropertyDamage")) {
				selectValueFromList(isThereAnyAddOnCoverExtensionPropertyDamageDropDown, sFStatIntermedFireEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionPropertyDamage"));
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionBusinessInterruption")) {
				selectValueFromList(isThereAnyAddOnCoverExtensionBusinessInterruptionDropDown, sFStatIntermedFireEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionBusinessInterruption"));
			}

		}
		else if(sFStatIntermedFireEntity.getAction().equalsIgnoreCase("verify")){
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			//LR Dharmendra
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigNameofBankerFinancialInstitution")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("NameofBankerFinancialInstitution"), fetchValueFromTextFields(nameofBankerFinancialInstitutionTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPropertyatStake")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("PropertyatStake"), fetchValueFromTextFields(propertyatStakeTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigValueofProperty")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("ValueofProperty"), fetchValueFromTextFields(valueofPropertyTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigLocationAddress")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("LocationAddress"), fetchValueFromTextFields(locationAddressTextField), AssertionType.WARNING);
			}
			//FF Dharmendra
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				verifyInstallmentPercentageListOpenButton(sFStatIntermedFireEntity, assertReference);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsthebusinessdirect")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("Isthebusinessdirect"), fetchValueFromList(isthebusinessdirectDropDown), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigDiscountforDirectBusiness")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("DiscountforDirectBusiness"), fetchValueFromTextFields(discountforDirectBusinessTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThisAFloaterTypePolicy")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("IsThisAFloaterTypePolicy"), fetchValueFromList(isThisAFloaterTypePolicyDropDown), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsTheRiskNew")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("NCBDiscount"), fetchValueFromList(nCBDiscountTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigLCBDiscount")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("LCBDiscount"), fetchValueFromTextFields(lCBDiscountTextField), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigSubjectivities")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("Subjectivities"), fetchValueFromTextFields(subjectivitiesTextArea), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigExclusions")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("Exclusions"), fetchValueFromTextFields(exclusionsTextArea), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextArea), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigTypeOfCoverageForSA")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("TypeOfCoverageForSA"), fetchValueFromList(typeOfCoverageForSADropDown), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"), fetchValueFromTextFields(insuredInterestWordingForPropertyDamageTextArea), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"), fetchValueFromTextFields(insuredInterestWordingForBusinessInterruptionTextArea), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionPropertyDamage")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionPropertyDamage"), fetchValueFromList(isThereAnyAddOnCoverExtensionPropertyDamageDropDown), AssertionType.WARNING);
			}
			if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionBusinessInterruption")) {
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionBusinessInterruption"), fetchValueFromList(isThereAnyAddOnCoverExtensionBusinessInterruptionDropDown), AssertionType.WARNING);
			}

		}
	}
	private void navigateToPreviousAttributePage(SFStatIntermedFireEntity sFStatIntermedFireEntity) {
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			PageElement policyAttributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+sFStatIntermedFireEntity.getStringValueForField("NextPageTitle")+"')]"), "SF Status of intermediaries Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttributeTitle);
		}
	}
	public void navigateToPolicy(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(SFStatIntermedFireEntity sFStatIntermedFireEntity){
		if (sFStatIntermedFireEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void clickToOpenButton(SFStatIntermedFireEntity sFStatIntermedFireEntity) throws InterruptedException{
		if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")){
			click(installmentPercentageListOpenButton);
			try{
				switchToWindow("Installment Percentage List");
			}
			catch(Exception e){
				switchToWindow("Installment Percentage List");

			}
		}
	}
	public void fillInstallmentPercentageListOpenButton(SFStatIntermedFireEntity sFStatIntermedFireEntity) throws InterruptedException{
		clickToOpenButton(sFStatIntermedFireEntity);
		Thread.sleep(3000);
		if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,sFStatIntermedFireEntity.getStringValueForField("SerialNo"));
		}
		if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
			clearAndSendKeys(installmentPercentageTextField,sFStatIntermedFireEntity.getStringValueForField("InstallmentPercentage"));
		}

		if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyInstallmentPercentageListOpenButton(SFStatIntermedFireEntity sFStatIntermedFireEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(sFStatIntermedFireEntity);

		if(sFStatIntermedFireEntity.getAction().equalsIgnoreCase("verify")){

			if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigSerialNo")){
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
				assertReference.assertEquals(sFStatIntermedFireEntity.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageTextField), AssertionType.WARNING);
			}

			if(sFStatIntermedFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}
	public void fillandSubmitPolicyAttributeSFStatusOfIntermediariesFire(SFStatIntermedFireEntity sFStatIntermedFireEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(sFStatIntermedFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeSFStatusOfIntermediariesFire(sFStatIntermedFireEntity, assertReference);
			clickNextButtonPolicyAttribute(sFStatIntermedFireEntity);
			navigateTobackAttributePage(sFStatIntermedFireEntity);
			navigateToPolicy(sFStatIntermedFireEntity);
			navigateToAttribute(sFStatIntermedFireEntity);
			navigateToInsuredInterest(sFStatIntermedFireEntity);
			navigateToCoverage(sFStatIntermedFireEntity);
			navigateToLoan(sFStatIntermedFireEntity);
			navigateToClientDetails(sFStatIntermedFireEntity);
			navigateToRelation(sFStatIntermedFireEntity);
			navigateToPayment(sFStatIntermedFireEntity);
			navigateToFollowup(sFStatIntermedFireEntity);
			navigateToDocument(sFStatIntermedFireEntity);
			navigateToPreviousAttributePage(sFStatIntermedFireEntity);


		}
	}


}

