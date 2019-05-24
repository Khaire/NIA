package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeRuralEntity;
import com.aqm.staf.library.databin.PolicyAttributeRuralEntity;
import com.aqm.staf.library.databin.PolicyBreakInInsuranceEntity;

public class PolicyAttributeRural extends BasePage {

	private PageElement PolicyAttributePolicyDetailsTitle;
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
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;

	private PageElement typeOfDevelopmentOfficerforwardButtonTitle;
	private PageElement policyAttributeBackTitle;

	private PageElement typeOfPolicyRuralDropDown;	
	private PageElement schemeTypeNSDropDown;
	private PageElement schemeTypeSDropDown;
	private PageElement specialConditionTextArea;
	private PageElement specialEconomicZoneDropDown;	
	private PageElement isServiceTaxExemptedDropDown;	
	private PageElement coInsuranceApplicableDropDown;	
	private PageElement claimRatioTextField;	
	private PageElement opportunityIdTextField;	
	//EP 
	private PageElement typeofPolicyEPDropDown;
	//GR
	private PageElement typeofGroupDropDown;
	private PageElement pOSApplicableDropDown;
	//
	private PageElement totalnumberofHutsTextField;

	//FW
	private PageElement clientTypeRuralDropDown;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement saveButton;

	//PG-Shruti
	private PageElement eProductDropDown;	
	private PageElement specialConditionsTextArea;

	private PageElement typeofDevelopmentOfficerDropdown;

	private PageElement schemeTypesDropDown;
	private PageElement IsthisSugarcanePlantationDropdown;

	//FE
	private PageElement centralSpecialLiveStockDevelopmentProjectDropDown;

	private PageElement forwordButton;
	private PageElement typeOfPolicyDropDown;
	public PolicyAttributeRural(WebDriver driver, String pageName) {
		super(driver, pageName);

		PolicyAttributePolicyDetailsTitle= new PageElement(By.xpath("//div/b[contains(text(),'Policy  Details')]"), "Policy Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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

		quoteNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPolicyDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Type Of Policy')]/following::select[1]"), "Type of Policy DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		typeOfPolicyRuralDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[@id='Type of Policy(Rural)']/following::select[1]"), "Type of Policy Rural DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		schemeTypeNSDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Scheme Type(NS)')]/following::select"), "Scheme Type(NS) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		schemeTypeSDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Scheme Type(S)')]/following::select"), "Scheme Type(S) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionTextArea= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Special Condition')]/following::textArea"), " Special Condition TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialEconomicZoneDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Special Economic Zone')]/following::select"), "Special Economic Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Is Service Tax Exempted DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimRatioTextField= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Claim Ratio')]/following::input"), "Claim Ratio TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		opportunityIdTextField= new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Opportunity Id')]/following::input"), "Opportunity Id TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfDevelopmentOfficerforwardButtonTitle= new PageElement(By.xpath("//div//b[contains(text(),'Type Of Development Officer')]")," Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributeBackTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"),"Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EP
		typeofPolicyEPDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Policy(EP)","select")), "Type of Policy EP", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//GR
		typeofGroupDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Group","select")), "Type of Group", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pOSApplicableDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("POS Applicable","select")), "POS Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//HI
		totalnumberofHutsTextField = new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Total number of Huts')]/following::input"), "Total number of Huts TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FW
		clientTypeRuralDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Client type (Rural)')]/following::input"), "Client Type(Rural) DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PG-Shruti
		eProductDropDown=new PageElement(By.xpath("//tr//td//div[contains(text(),'E-Product')]/following::select"),"E-Product DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		specialConditionsTextArea=new PageElement(By.xpath("//tr//td//div[contains(text(),'Special Conditions')]/following::textArea"),"Special Conditions TextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		typeofDevelopmentOfficerDropdown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Type of Development Officer')]/following::select"), "Type of Development Officer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		schemeTypesDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Scheme Type (S)')]/following::select"), "Scheme Type(S) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IsthisSugarcanePlantationDropdown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Is this Sugarcane Plantation Policy under Mill Scheme')]/following::select"), "Is this Sugarcane Plantation Policy under Mill Scheme", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//FE
		centralSpecialLiveStockDevelopmentProjectDropDown=new PageElement(By.xpath("//form[@name='S0042']//tr//td//div[contains(text(),'Central Special Live stock Development Project')]/following::select"), "Central Special Live stock Development Project DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwordButton=new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyAttributeRural(PolicyAttributeRuralEntity policyAttributeRuralEntity, CustomAssert assertReference){
		if(policyAttributeRuralEntity.getAction().equalsIgnoreCase("add") || policyAttributeRuralEntity.getAction().equalsIgnoreCase("edit")){
			
			if(policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("UC")||policyAttributeRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||policyAttributeRuralEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfPolicyFirstPage")) {
					selectValueFromList(typeOfPolicyDropDown, policyAttributeRuralEntity.getStringValueForField("TypeOfPolicyFirstPage"));
					click(forwordButton);
				}
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(typeOfPolicyRuralDropDown, policyAttributeRuralEntity.getStringValueForField("TypeOfPolicy"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeNS")) {
				selectValueFromList(schemeTypeNSDropDown, policyAttributeRuralEntity.getStringValueForField("SchemeTypeNS"));
			}
			if(!policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")){
				if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeS")) {
					selectValueFromList(schemeTypeSDropDown, policyAttributeRuralEntity.getStringValueForField("SchemeTypeS"));
				}
			}
			if(policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")){
				if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeS")) {
					selectValueFromList(schemeTypesDropDown, policyAttributeRuralEntity.getStringValueForField("SchemeTypeS"));
				}
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialCondition")) {
				clearAndSendKeys(specialConditionTextArea, policyAttributeRuralEntity.getStringValueForField("SpecialCondition"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				selectValueFromList(specialEconomicZoneDropDown, policyAttributeRuralEntity.getStringValueForField("SpecialEconomicZone"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, policyAttributeRuralEntity.getStringValueForField("IsServiceTaxExempted"));

			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, policyAttributeRuralEntity.getStringValueForField("CoInsuranceApplicable"));

			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigClaimRatio")) {
				clearAndSendKeys(claimRatioTextField, policyAttributeRuralEntity.getStringValueForField("ClaimRatio"));

			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, policyAttributeRuralEntity.getStringValueForField("OpportunityId"));

			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfPolicyEP")) {
				selectValueFromList(typeofPolicyEPDropDown, policyAttributeRuralEntity.getStringValueForField("TypeOfPolicyEP"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfGroup")) {
				selectValueFromList(typeofGroupDropDown, policyAttributeRuralEntity.getStringValueForField("TypeOfGroup"));
			}
			//FW
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigClientTypeRural")) {
				clearAndSendKeys(clientTypeRuralDropDown, policyAttributeRuralEntity.getStringValueForField("ClientTypeRural"));
			}
			//PG-shruti
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigEProduct")) {
				selectValueFromList(eProductDropDown, policyAttributeRuralEntity.getStringValueForField("EProduct"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, policyAttributeRuralEntity.getStringValueForField("SpecialConditions"));

			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeofDevelopmentOfficer")) {
				selectValueFromList(typeofDevelopmentOfficerDropdown, policyAttributeRuralEntity.getStringValueForField("TypeofDevelopmentOfficer"));
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigIsthisSugarcanePlantation")) {
				selectValueFromList(IsthisSugarcanePlantationDropdown, policyAttributeRuralEntity.getStringValueForField("IsthisSugarcanePlantation"));
			}
			//FE
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigCentralSpecialLiveStockDevelopmentProject")) {
				selectValueFromList(centralSpecialLiveStockDevelopmentProjectDropDown, policyAttributeRuralEntity.getStringValueForField("CentralSpecialLiveStockDevelopmentProject"));
			}

		}

		else if(policyAttributeRuralEntity.getAction().equalsIgnoreCase("verify")){
			click(forwordButton);
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("TypeOfPolicy"), fetchValueFromList(typeOfPolicyRuralDropDown), AssertionType.WARNING);
			}

			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeNS")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SchemeTypeNS"), fetchValueFromList(schemeTypeNSDropDown), AssertionType.WARNING);
			}
			if(!policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")){
				if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeS")) {
					assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SchemeTypeS"), fetchValueFromList(schemeTypeSDropDown), AssertionType.WARNING);
				}
			}
			if(policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("YI")){
				if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSchemeTypeS")) {
					assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SchemeTypeS"), fetchValueFromList(schemeTypesDropDown), AssertionType.WARNING);

				}
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialCondition")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SpecialCondition"), fetchValueFromTextFields(specialConditionTextArea), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialEconomicZone")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromList(specialEconomicZoneDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigClaimRatio")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("ClaimRatio"), fetchValueFromTextFields(claimRatioTextField), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfPolicyEP")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("TypeOfPolicyEP"), fetchValueFromList(typeofPolicyEPDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeOfGroup")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("TypeOfGroup"), fetchValueFromTextFields(typeofGroupDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTotalNumberOfHuts")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("TotalNumberOfHuts"), fetchValueFromTextFields(totalnumberofHutsTextField), AssertionType.WARNING);
			}
			//FW
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigClientTypeRural")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("ClientTypeRural"), fetchValueFromTextFields(clientTypeRuralDropDown), AssertionType.WARNING);
			}
			//PG-shruti
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigEProduct")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("EProduct"), fetchValueFromList(eProductDropDown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigTypeofDevelopmentOfficer")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("TypeofDevelopmentOfficer"),fetchValueFromList(typeofDevelopmentOfficerDropdown), AssertionType.WARNING);
			}
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigIsthisSugarcanePlantation")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("IsthisSugarcanePlantation"), fetchValueFromList(IsthisSugarcanePlantationDropdown), AssertionType.WARNING);
			}
			//FE
			if (policyAttributeRuralEntity.getBooleanValueForField("ConfigCentralSpecialLiveStockDevelopmentProject")) {
				assertReference.assertEquals(policyAttributeRuralEntity.getStringValueForField("CentralSpecialLiveStockDevelopmentProject"), fetchValueFromList(centralSpecialLiveStockDevelopmentProjectDropDown), AssertionType.WARNING);
			}
		}
	}


	public void navigateToPolicy(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void navigateToForwardPolicyAttribute(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			try{
				acceptAlertAndReturnConfirmationMessage();

			}
			catch (Exception e){
			}
			switchToFrame("display");
		}
	}


	public void saveButton(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if (policyAttributeRuralEntity.getBooleanValueForField("ConfigSaveBtn")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	//JN
	/*public void forwardButtonforPOSPage(PolicyAttributeRuralEntity policyAttributeRuralEntity){
		if(policyAttributeRuralEntity.getStringValueForField("Product").equalsIgnoreCase("JN")){
			selectValueFromList(pOSApplicableDropDown,policyAttributeRuralEntity.getStringValueForField("POSApplicable"));
			click(forwardButton);
		}
	}*/


	public void fillandSubmitPolicyAttributeRural(PolicyAttributeRuralEntity policyAttributeRuralEntity, CustomAssert assertReference) {
		if(isConfigTrue(policyAttributeRuralEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeRural(policyAttributeRuralEntity, assertReference);
			navigateToForwardPolicyAttribute(policyAttributeRuralEntity);
			//JN
			//forwardButtonforPOSPage(policyAttributeRuralEntity);
			navigateToAttribute(policyAttributeRuralEntity);
			navigateToPolicy(policyAttributeRuralEntity);
			navigateToInsuredInterest(policyAttributeRuralEntity);
			navigateToCoverage(policyAttributeRuralEntity);
			navigateToLoan(policyAttributeRuralEntity);
			navigateToClientDetails(policyAttributeRuralEntity);
			navigateToRelation(policyAttributeRuralEntity);
			navigateToPayment(policyAttributeRuralEntity);
			navigateToFollowup(policyAttributeRuralEntity);
			navigateToDocument(policyAttributeRuralEntity);
			saveButton(policyAttributeRuralEntity);
		}
	}
}


