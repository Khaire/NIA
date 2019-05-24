package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyTypeOfDevOfficerEntity;


public class PolicyAttributeTypeOfDevelopmentOfficerPage extends BasePage {

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

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement policyAttributesPageTypeOfDevelopmentOfficerTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement typeOfDevelopmentOfficerDropdown;
	private PageElement forwordButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement uniqueIdentificationCodeForPolicyTextField;
	private PageElement uniqueIdentificationCodeForEndtTextField;

	//WC FOR ENDORSEMENT
	private PageElement endorsementPremiumCalculationBasisWCDropdown;
	private PageElement endorsementRuleforWCTitle;

	private PageElement proceedButton;


	private PageElement policytypeOfDevOfficerTabTitle;
	private PageElement policytypeOfDevOfficerTitle;
	private PageElement	premiumCalculationBasisforShortPeriodPolicyDropdown;
	private PageElement preMedicalCheckUpDetailsTextBox;

	public PolicyAttributeTypeOfDevelopmentOfficerPage(WebDriver driver,String pageName) {
		super(driver, pageName);

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

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyAttributesPageTypeOfDevelopmentOfficerTitle=new PageElement(By.xpath("//div/b[contains(text(),'Type Of Development Officer')]"), "Policy Attributes Page Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		typeOfDevelopmentOfficerDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Development Officer", "select")), "Select Type of Development Officer Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		uniqueIdentificationCodeForPolicyTextField =new PageElement(By.xpath("//tr//td//div[contains(text(),'Unique Identification code for policy')]/following::input[1]"), "Unique Identification code for policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueIdentificationCodeForEndtTextField =new PageElement(By.xpath("//tr//td//div[contains(text(),'Unique Identification code for endt')]/following::td"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policytypeOfDevOfficerTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]"), "Policy Type Of Dev Officer TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//WC
		endorsementPremiumCalculationBasisWCDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Endorsement Premium Calculation Basis(WC)')]/following::select"), "Endorsement Premium Calculation Basis(WC) Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		endorsementRuleforWCTitle=new PageElement(By.xpath("//div/b[contains(text(),'Special Condition')]"), "Special Condition Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumCalculationBasisforShortPeriodPolicyDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Premium Calculation Basis for Short Period Policy')]/following::select"), "Premium Calculation Basis for Short Period Policy Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		preMedicalCheckUpDetailsTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Pre Medical Check Up Details')]/following::textarea"), "Pre Medical Check Up Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillTypeOfDevelopmentOfficerAttribute(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("add") || policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("edit")){

			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigTypeOfDevelopmentOfficer")) {
				selectValueFromList(typeOfDevelopmentOfficerDropdown, policyTypeOfDevOfficerEntity.getStringValueForField("TypeOfDevelopmentOfficer"));
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicy")) {
				clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField, policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForPolicy"));
			}

			//For Misc-CO product
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("CO")){
					if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyCO")) {
						String code=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForCompany");
						String uniqueIdProductCode=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueProductCodeForPolicy");
						String UniqueIdentificationCodeForPolicy=RandomCodeGenerator.uniqueIdentificationCodeForPolicyNoGenerator(code,uniqueIdProductCode);
						clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField, UniqueIdentificationCodeForPolicy);
						policyTypeOfDevOfficerEntity.setStringValueForField("UniqueIdentificationCodeForPolicyCO", UniqueIdentificationCodeForPolicy);
					}
				}
			}

			//for Micro
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyMicro")) {
					String code=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForCompany");
					String uniqueIdProductCode=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueProductCodeForPolicy");
					String UniqueIdentificationCodeForPolicy=RandomCodeGenerator.uniqueIdentificationCodeForPolicyNoGenerator(code,uniqueIdProductCode);
					clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField, UniqueIdentificationCodeForPolicy);
					policyTypeOfDevOfficerEntity.setStringValueForField("UniqueIdentificationCodeForPolicyMicro", UniqueIdentificationCodeForPolicy);
				}
			}

			//for Rural
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyRural")) {
					String code=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForCompany");
					String uniqueIdProductCode=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueProductCodeForPolicy");
					String UniqueIdentificationCodeForPolicy=RandomCodeGenerator.uniqueIdentificationCodeForPolicyNoGenerator(code,uniqueIdProductCode);
					clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField, UniqueIdentificationCodeForPolicy);
					policyTypeOfDevOfficerEntity.setStringValueForField("UniqueIdentificationCodeForPolicyRural", UniqueIdentificationCodeForPolicy);
				}
			}
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
				if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyEngg")) {
					String code=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForCompany");
					String uniqueIdProductCode=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueProductCodeForPolicy");
					String UniqueIdentificationCodeForPolicy=RandomCodeGenerator.uniqueIdentificationCodeForPolicyNoGenerator(code,uniqueIdProductCode);
					clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField, UniqueIdentificationCodeForPolicy);
					policyTypeOfDevOfficerEntity.setStringValueForField("UniqueIdentificationCodeForPolicyEngg", UniqueIdentificationCodeForPolicy);
				}

			}

			//for fire
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
				if(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("AR")){
					if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyCO")) {
						String code=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForCompany");
						String uniqueIdProductCode=policyTypeOfDevOfficerEntity.getStringValueForField("UniqueProductCodeForPolicy");
						String UniqueIdentificationCodeForPolicy=RandomCodeGenerator.uniqueIdentificationCodeForPolicyNoGenerator(code,uniqueIdProductCode);
						clearAndSendKeys(uniqueIdentificationCodeForPolicyTextField,UniqueIdentificationCodeForPolicy);
						policyTypeOfDevOfficerEntity.setStringValueForField("UniqueIdentificationCodeForPolicyCO", UniqueIdentificationCodeForPolicy);
					}
				}
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPreMedicalCheckUpDetails")) {
				clearAndSendKeys(preMedicalCheckUpDetailsTextBox, policyTypeOfDevOfficerEntity.getStringValueForField("PreMedicalCheckUpDetails"));
				//click(forwordButton);
			}



		}
		else if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("verify")){
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigTypeOfDevelopmentOfficer")) {
				if(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("PZ")){
					click(forwordButton);
					Thread.sleep(2000);
					
				}
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("TypeOfDevelopmentOfficer"), fetchValueFromList(typeOfDevelopmentOfficerDropdown), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForEndt")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForEndt"), fetchValueFromList(uniqueIdentificationCodeForEndtTextField), AssertionType.WARNING);
			}
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicy")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForPolicy"), fetchValueFromTextFields(uniqueIdentificationCodeForPolicyTextField), AssertionType.WARNING);
			}
			// for misc-co
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("CO")){
					if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyCO")) {
						assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForPolicyCO"), fetchValueFromList(uniqueIdentificationCodeForPolicyTextField), AssertionType.WARNING);
					}
				}
			}

			//for fire
			if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
				if(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("AR")){
					if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigUniqueIdentificationCodeForPolicyCO")) {
						assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("UniqueIdentificationCodeForPolicyCO"), fetchValueFromTextFields(uniqueIdentificationCodeForPolicyTextField), AssertionType.WARNING);
					}
				}
			}

		}
	}

	private void submitTypeOfDevelopmentOfficerDetails(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) throws InterruptedException {

		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigForwordButtonForCS")){		
			//click(forwordButton);	
			//policytypeOfDevOfficerTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+policyTypeOfDevOfficerEntity.getStringValueForField("PolicyTypeOfDevOfficerTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(policytypeOfDevOfficerTitle);
			click(forwordButton);
		}
		
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigForwordButtonForRS")){		
			//policytypeOfDevOfficerTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+policyTypeOfDevOfficerEntity.getStringValueForField("PolicyTypeOfDevOfficerTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(policytypeOfDevOfficerTitle);
			click(forwordButton);
		}

		else if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			//click(forwordButton);
			Thread.sleep(3000);
			//workAround(policyTypeOfDevOfficerEntity);
			if(!(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("TG"))){
			//click(saveButton);
			}
			switchToFrame("display");
			//policytypeOfDevOfficerTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyTypeOfDevOfficerEntity.getStringValueForField("PolicyTypeOfDevOfficerTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(policytypeOfDevOfficerTabTitle);
		}
		
		else if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			policytypeOfDevOfficerTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyTypeOfDevOfficerEntity.getStringValueForField("PolicyTypeOfDevOfficerTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policytypeOfDevOfficerTabTitle);

		}

		else if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigForwordButtonForRS")){	
			if((policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("HN") || (policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("SU"))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("TU")) ||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("UK"))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("IC"))) &&(!(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("verify")))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("NB"))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("ES"))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("CD")) || (policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("SP")) || (policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("CE"))|| (policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("PZ")||policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("TF")||policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("CX"))){
				click(forwordButton);
			}
		}
		
		else if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
			workAroundforMotor(policyTypeOfDevOfficerEntity);
			if(policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigForwordButtonForMotor")){		
				click(forwordButton);
				policytypeOfDevOfficerTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyTypeOfDevOfficerEntity.getStringValueForField("PolicyTypeOfDevOfficerTitle")+"')]"), "Policy Type Of Devlopment Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(policytypeOfDevOfficerTabTitle);
			}
		}
	}


	public void workAround(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) throws InterruptedException{
		if((policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("HM") && (policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")))||(policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("PE"))){
			click(policyTab);
			Thread.sleep(3000);
			click(attributeTab);
			click(proceedButton);
			switchToFrame("display");
			click(forwordButton);
			Thread.sleep(3000);
			click(forwordButton);
		}
	}
	public void workAroundPE(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) throws InterruptedException{
		if((policyTypeOfDevOfficerEntity.getStringValueForField("Product").equalsIgnoreCase("PE"))){
			click(policyTab);
			Thread.sleep(3000);
			click(attributeTab);
			click(proceedButton);
			switchToFrame("display");
			click(forwordButton);
			Thread.sleep(3000);
			click(forwordButton);
			click(forwordButton);
			click(forwordButton);
			click(forwordButton);
			click(forwordButton);
			Thread.sleep(3000);
		}
	}
	public void workAroundforMotor(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) throws InterruptedException{
		if((policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))){
			click(policyTab);
		//	Thread.sleep(3000);
			click(attributeTab);
			click(proceedButton);
			switchToFrame("display");
			click(forwordButton);
		//	Thread.sleep(3000);
			click(forwordButton);
			selectValueFromList(typeOfDevelopmentOfficerDropdown, policyTypeOfDevOfficerEntity.getStringValueForField("TypeOfDevelopmentOfficer"));
		}
	}
	private void navigateToAttributePage(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) {
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void navigateToPreviousAttributePage(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity) {
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToPolicy(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillEndorsmentRuleForWC(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity, CustomAssert assertReference){
		if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
			if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("add") || policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("edit")){
				//WC
				if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigEndorsementPremiumCalculationBasisWC")) {
					selectValueFromList(endorsementPremiumCalculationBasisWCDropdown, policyTypeOfDevOfficerEntity.getStringValueForField("EndorsementPremiumCalculationBasisWC"));
				}

			}
			else if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("verify")){
				//WC
				if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigEndorsementPremiumCalculationBasisWC")) {
					assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("EndorsementPremiumCalculationBasisWC"), fetchValueFromList(endorsementPremiumCalculationBasisWCDropdown), AssertionType.WARNING);
				}
			}
		}
	}


	public void navigateToSpecialCondition(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){
		if(policyTypeOfDevOfficerEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigSpecialConditionPage")){		
				click(forwordButton);
				switchToFrame("display");
				isElementDisplayed(endorsementRuleforWCTitle);
			}
		}
	}

	public void fillPremiumCalculationBasis(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity, CustomAssert assertReference){
		if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("add") || policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("edit")){
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPremiumCalculationBasisforShortPeriodPolicy")) {
				selectValueFromList(premiumCalculationBasisforShortPeriodPolicyDropdown, policyTypeOfDevOfficerEntity.getStringValueForField("PremiumCalculationBasisforShortPeriodPolicy"));
			}
		}
		else if(policyTypeOfDevOfficerEntity.getAction().equalsIgnoreCase("verify")){
			if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPremiumCalculationBasisforShortPeriodPolicy")) {
				assertReference.assertEquals(policyTypeOfDevOfficerEntity.getStringValueForField("PremiumCalculationBasisforShortPeriodPolicy"), fetchValueFromList(premiumCalculationBasisforShortPeriodPolicyDropdown), AssertionType.WARNING);
			}
		}
	}


	public void forwardbutton(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity){

		if (policyTypeOfDevOfficerEntity.getBooleanValueForField("ConfigPremiumCalculationBasisFwd")){		
			click(forwordButton);
			switchToFrame("display");	
		}
	}


	public void fillandSubmitTypeOfDevelopmentOfficerPolicyAttibutesHealth(PolicyTypeOfDevOfficerEntity policyTypeOfDevOfficerEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyTypeOfDevOfficerEntity.getConfigExecute())){
			switchToFrame("display");
			fillTypeOfDevelopmentOfficerAttribute(policyTypeOfDevOfficerEntity, assertReference);
			submitTypeOfDevelopmentOfficerDetails(policyTypeOfDevOfficerEntity);
			fillPremiumCalculationBasis(policyTypeOfDevOfficerEntity, assertReference);
			fillEndorsmentRuleForWC(policyTypeOfDevOfficerEntity, assertReference);
			forwardbutton(policyTypeOfDevOfficerEntity);
			navigateToSpecialCondition(policyTypeOfDevOfficerEntity);
			navigateToAttributePage(policyTypeOfDevOfficerEntity);
			navigateToPreviousAttributePage(policyTypeOfDevOfficerEntity);
			navigateToPolicy(policyTypeOfDevOfficerEntity);
			navigateToAttribute(policyTypeOfDevOfficerEntity);
			navigateToMember(policyTypeOfDevOfficerEntity);
			navigateToCoverage(policyTypeOfDevOfficerEntity);
			navigateToLoan(policyTypeOfDevOfficerEntity);
			navigateToClientDetails(policyTypeOfDevOfficerEntity);
			navigateToRelation(policyTypeOfDevOfficerEntity);
			navigateToPayment(policyTypeOfDevOfficerEntity);
			navigateToFollowup(policyTypeOfDevOfficerEntity);
			navigateToDocument(policyTypeOfDevOfficerEntity);
		}

	}



}
