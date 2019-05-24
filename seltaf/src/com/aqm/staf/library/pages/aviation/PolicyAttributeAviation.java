package com.aqm.staf.library.pages.aviation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolicyAttrAviationEntity;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;

public class PolicyAttributeAviation extends BasePage{

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
	private PageElement nextAttributePageTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	//attribute_AVIATION AW DIGVIJAY
	private PageElement isServiceTaxExemptedDropDown;
	private PageElement coInsuranceApplicableDropDown;
	private PageElement opportunityIdTextField;
	private PageElement forwardButton;
	private PageElement backButton;
	// DIGVIJAY prod PA
	private PageElement strengthOftheGroupTextField;
	private PageElement discountfoRGoodClaimExperienceTextField;
	private PageElement otherDiscountsTextField;
	private PageElement otherLoadingTextField;
	private PageElement typeOfCoverrequiredTextField;
	//DIGVIJAY prod AA
	private PageElement policyDescriptionTextArea;
	//DIGVIJAY prod AG
	private PageElement typeofPolicyTextField;
	//DIGVIJAY prod AI
	private PageElement typeofLiabilityDropDown;
	//
	private PageElement installmentPercentageWindowTextField;
	private PageElement installmentFacilityTitlePage;
	private PageElement serialNoParameterTextField;
	private PageElement openButton;
	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList;
	private PageElement hasAnyInsuranceCompanySpecialConditionsDropDownList;
	private PageElement hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList;
	private PageElement doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList;
	private PageElement hasAnyAircraftOwnEdoroperatedbymembersDropDownList;
	private PageElement tableofbenefitsDropDownList;
	private PageElement coInsuranceApplicableDropDownList;
	private PageElement isServiceTaxExemptedDropDownList;
	private PageElement subjecttoclauseSpecialConditionTextarea;
	private PageElement typeofPAclausesDropDownList;
	//Anzaf aa for aviation
	private PageElement CoInsuranceApplicableAAtext;
	private PageElement PolicyDescriptionAAtext;
	private PageElement TypeofLiabilityDropdown;

	
	private PageElement hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown;
	private PageElement HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions;
	private PageElement Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy;
	private PageElement Doyouhaveanyothercurrentpolicycoveringthisorsimilarrisk;
	private PageElement Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers;
	
	
	
	
	

	public PolicyAttributeAviation(WebDriver driver, String pageName) {
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
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insurance History T5-POL')]"),"Insurance History T5-POL Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","No")), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//digvijay aw
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select[1]"), " Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), " Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField=new PageElement(By.xpath("//td//div[contains(text(),'Opportunity Id')]/following::input"), " Opportunity Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay pa
		strengthOftheGroupTextField=new PageElement(By.xpath("//td//div[contains(text(),'Strength of the Group')]/following::input"), " Strength of the Group", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountfoRGoodClaimExperienceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Discount for Good Claim Experience (%)')]/following::input"), " Discount for Good Claim Experience", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDiscountsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other Discounts (in %)')]/following::input"), " Other Discounts", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other Loading (in %)')]/following::input"), " Other Loading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCoverrequiredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of cover required')]/following::select[1]"), " Type of cover required", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// digvijay aa
		policyDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Policy Description')]/following::textarea[1]"), " Policy Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// digvijay ag
		typeofPolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type Of Policy')]/following::select[1]"), " Type of Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay ai
		typeofLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Liability')]/following::select"), " Type of Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//
		openButton = new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		installmentFacilityTitlePage=new PageElement(By.xpath("//div//b[contains(text(),'Installment Facility')]"), "Installement Facility Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time declined our proposal')]/following::select[1]"),"Has any insurance company at any time declined our proposal",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hasAnyInsuranceCompanySpecialConditionsDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time Required an increased premium or imposed special conditions')]/following::select[1]"), "Has any insurance company at any time Required an increased premium or imposed special conditions",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time cancelled or refused to renew the policy')]/following::select[1]"),"Has any insurance company at any time cancelled or refused to renew the policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);				
		doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Do you have any other current policy covering this or similar risk')]/following::select"), "Do you have any other current policy covering this or similar risk", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);					

		hasAnyAircraftOwnEdoroperatedbymembersDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members')]/following::select[1]"),"Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		tableofbenefitsDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Table of benefits')]/following::select[1]"), "Table of benefits",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		coInsuranceApplicableDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select[1]"),"Co-Insurance Applicable",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);				
		isServiceTaxExemptedDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Co-Insurance Applicable Title", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);					
		subjecttoclauseSpecialConditionTextarea=new PageElement(By.xpath("//td//div[contains(text(),'Subject to clause/Special Condition')]/following::textarea"),"Subject to clause/Special Condition",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);				
		typeofPAclausesDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Type of PA clauses')]/following::select[1]"), "Type of PA clauses Title", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);		
		//Aviation aa
		
		CoInsuranceApplicableAAtext=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"),"Co-Insurance Applicabl",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);				
		PolicyDescriptionAAtext=new PageElement(By.xpath("//textarea[@name='propValues1']"), "	PolicyDescript", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		TypeofLiabilityDropdown=new PageElement(By.xpath("//select[@name='propValues5']"),"Co-Insurance Applicabl",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Aviation Commited by Anzaf for only pa ag product of aviation
		
	 hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time declined our proposal')]/following::select[1]"),"Has any insurance company  any time declined our proposal",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	 HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time Required an increased premium or imposed special conditions')]/following::select[1]"), "Has any insurance company at any time Required an increased premium or imposed special conditions",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	 Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time cancelled or refused to renew the policy')]/following::select[1]"),"Has any insurance company at any time cancelled or refused to renew the policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	 Doyouhaveanyothercurrentpolicycoveringthisorsimilarrisk=new PageElement(By.xpath("//td//div[contains(text(),'Do you have any other current policy covering this or similar risk')]/following::select[1]"), "Do you have any other curre policy covering this or similar risk", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	 Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers=new PageElement(By.xpath("//td//div[contains(text(),'Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members')]/following::select[1]"),"Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		
		
		
		
		
		
		
		
		
	}

	public void fillPolicyAttributeAviation(PolicyAttrAviationEntity policyAttrAviationEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyAttrAviationEntity.getAction().equalsIgnoreCase("add") || policyAttrAviationEntity.getAction().equalsIgnoreCase("edit")){
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofPolicy")) {
				selectValueFromList(typeofPolicyTextField, policyAttrAviationEntity.getStringValueForField("TypeofPolicy"));
				click(forwardButton);
			}
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, policyAttrAviationEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
			
			selectValueFromList(coInsuranceApplicableDropDown, policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				fillInstallementPercentageDetails(policyAttrAviationEntity,assertReference);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, policyAttrAviationEntity.getStringValueForField("OpportunityId"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigStrengthOftheGroup")) {
				clearAndSendKeys(strengthOftheGroupTextField, policyAttrAviationEntity.getStringValueForField("StrengthOftheGroup"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDiscountfoRGoodClaimExperience")) {
				clearAndSendKeys(discountfoRGoodClaimExperienceTextField, policyAttrAviationEntity.getStringValueForField("DiscountfoRGoodClaimExperience"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOtherDiscounts")) {
				clearAndSendKeys(otherDiscountsTextField, policyAttrAviationEntity.getStringValueForField("OtherDiscounts"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOtherLoading")) {
				clearAndSendKeys(otherLoadingTextField, policyAttrAviationEntity.getStringValueForField("OtherLoading"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeOfCoverrequired")) {
				selectValueFromList(typeOfCoverrequiredTextField, policyAttrAviationEntity.getStringValueForField("TypeOfCoverrequired"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyDescription")) {
				clearAndSendKeys(policyDescriptionTextArea, policyAttrAviationEntity.getStringValueForField("PolicyDescription"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofLiability")) {
				selectValueFromList(typeofLiabilityDropDown, policyAttrAviationEntity.getStringValueForField("TypeofLiability"));
			}
		}

		else if(policyAttrAviationEntity.getAction().equalsIgnoreCase("verify")){
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofPolicy")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("TypeofPolicy"), fetchValueFromList(typeofPolicyTextField), AssertionType.WARNING);
				click(forwardButton);
			}		
			
			
			
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			
			
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}	
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				verifyInstallementPercentageDetails(policyAttrAviationEntity,assertReference);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigStrengthOftheGroup")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("StrengthOftheGroup"), fetchValueFromTextFields(strengthOftheGroupTextField), AssertionType.WARNING);
			}	
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDiscountfoRGoodClaimExperience")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("DiscountfoRGoodClaimExperience"), fetchValueFromTextFields(discountfoRGoodClaimExperienceTextField), AssertionType.WARNING);
			}	
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOtherDiscounts")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("OtherDiscounts"), fetchValueFromTextFields(otherDiscountsTextField), AssertionType.WARNING);
			}	
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigOtherLoading")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("OtherLoading"), fetchValueFromTextFields(otherLoadingTextField), AssertionType.WARNING);
			}	
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeOfCoverrequired")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("TypeOfCoverrequired"), fetchValueFromTextFields(typeOfCoverrequiredTextField), AssertionType.WARNING);
			}	

			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyDescription")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("PolicyDescription"), fetchValueFromTextFields(policyDescriptionTextArea), AssertionType.WARNING);
			}	
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofLiability")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("TypeofLiability"), fetchValueFromList(typeofLiabilityDropDown), AssertionType.WARNING);
			}
		}
	}

	public void clickOnOpenButton(PolicyAttrAviationEntity policyAttrAviationEntity) throws InterruptedException{
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			Thread.sleep(5000);
			switchToWindow("Installment Percentage List' Details");
		}
	}

	public void fillInstallementPercentageDetails(PolicyAttrAviationEntity policyAttrAviationEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(policyAttrAviationEntity);

		installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage Text Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


		//Table - Parameter List for Installment Percentage List
		if(policyAttrAviationEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
			Thread.sleep(3000);
			clearAndSendKeys(installmentPercentageWindowTextField,policyAttrAviationEntity.getStringValueForField("InstallmentPercentage") );	
		}
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			click(saveWindowButton);
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyInstallementPercentageDetails(PolicyAttrAviationEntity policyAttrAviationEntity ,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(policyAttrAviationEntity);

		installmentPercentageWindowTextField=new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage Text Field ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoParameterTextField=new PageElement(By.name("slNo0"),"Serial number parameter Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		if(policyAttrAviationEntity.getAction().equalsIgnoreCase("verify")){
			if(policyAttrAviationEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageWindowTextField), AssertionType.WARNING);	
			}
		}
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	} 


	public void fillPolicyAttributePolicyDetailsPNT2POLAviation(PolicyAttrAviationEntity policyAttrAviationEntity, CustomAssert assertReference){
		if(policyAttrAviationEntity.getAction().equalsIgnoreCase("add") || policyAttrAviationEntity.getAction().equalsIgnoreCase("edit")){

			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsTimeDeclinedourProposal")) {
					selectValueFromList(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList, policyAttrAviationEntity.getStringValueForField("HasAnyInsTimeDeclinedourProposal"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsurSpecialConditions")) {
					selectValueFromList(hasAnyInsuranceCompanySpecialConditionsDropDownList, policyAttrAviationEntity.getStringValueForField("HasAnyInsurSpecialConditions"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsuraCancelledOrRefusedPolicy")) {
					selectValueFromList(hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList, policyAttrAviationEntity.getStringValueForField("HasAnyInsuraCancelledOrRefusedPolicy"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDoYouHaveanyOtherCurrentCoveringRisk")) {
					selectValueFromList(doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList, policyAttrAviationEntity.getStringValueForField("DoYouHaveanyOtherCurrentCoveringRisk"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyAircraftOwnEdoroperatedMembers")) {
					selectValueFromList(hasAnyAircraftOwnEdoroperatedbymembersDropDownList, policyAttrAviationEntity.getStringValueForField("HasAnyAircraftOwnEdoroperatedMembers"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTableofbenefits")) {
					selectValueFromList(tableofbenefitsDropDownList, policyAttrAviationEntity.getStringValueForField("Tableofbenefits"));
			}
				if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicablePolicyDetPNT2POL")) {
					selectValueFromList(coInsuranceApplicableDropDownList, policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicablePolicyDetPNT2POL"));
			}
				if (policyAttrAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExemptedPolicyDetPNT2POL")) {
					selectValueFromList(isServiceTaxExemptedDropDownList, policyAttrAviationEntity.getStringValueForField("IsServiceTaxExemptedPolicyDetPNT2POL"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigSubjecttoclauseSpecialCondition")) {
				clearAndSendKeys(subjecttoclauseSpecialConditionTextarea, policyAttrAviationEntity.getStringValueForField("SubjecttoclauseSpecialCondition"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofPAclauses")) {
					selectValueFromList(typeofPAclausesDropDownList, policyAttrAviationEntity.getStringValueForField("TypeofPAclauses"));
			}
		}
		

		else if(policyAttrAviationEntity.getAction().equalsIgnoreCase("verify")){			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsTimeDeclinedourProposal")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("HasAnyInsTimeDeclinedourProposal"),fetchValueFromList(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsurSpecialConditions")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("HasAnyInsurSpecialConditions"),fetchValueFromList(hasAnyInsuranceCompanySpecialConditionsDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyInsuraCancelledOrRefusedPolicy")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("HasAnyInsuraCancelledOrRefusedPolicy"),fetchValueFromList(hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDoYouHaveanyOtherCurrentCoveringRisk")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("DoYouHaveanyOtherCurrentCoveringRisk"),fetchValueFromList(doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyAircraftOwnEdoroperatedMembers")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("HasAnyAircraftOwnEdoroperatedMembers"),fetchValueFromList(hasAnyAircraftOwnEdoroperatedbymembersDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTableofbenefits")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("Tableofbenefits"),fetchValueFromList(tableofbenefitsDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicablePolicyDetPNT2POL")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicablePolicyDetPNT2POL"),fetchValueFromList(coInsuranceApplicableDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExemptedPolicyDetPNT2POL")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("IsServiceTaxExemptedPolicyDetPNT2POL"),fetchValueFromList(isServiceTaxExemptedDropDownList), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigSubjecttoclauseSpecialCondition")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("SubjecttoclauseSpecialCondition"),fetchValueFromTextFields(subjecttoclauseSpecialConditionTextarea), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofPAclauses")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("TypeofPAclauses"),fetchValueFromList(typeofPAclausesDropDownList), AssertionType.WARNING);
			}
		}
	}
	///  Anzaf product for AA Aviation
	public void fillPolicyAttributePolicyDetailsAAAviation(PolicyAttrAviationEntity policyAttrAviationEntity, CustomAssert assertReference){
		if(policyAttrAviationEntity.getAction().equalsIgnoreCase("add") || policyAttrAviationEntity.getAction().equalsIgnoreCase("edit")){
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicableAA")) {
				selectValueFromList(CoInsuranceApplicableAAtext, policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicableAA"));
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyDescriptionAA")) {
				clearAndSendKeys(PolicyDescriptionAAtext, policyAttrAviationEntity.getStringValueForField("PolicyDescriptionAA"));
				
				
			}
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofLiabilityDropdown")) {
				selectValueFromList(TypeofLiabilityDropdown, policyAttrAviationEntity.getStringValueForField("TypeofLiabilityAA"));
			}	
			/*//Nazaf
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfighasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown")) {
				selectValueFromList(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown, policyAttrAviationEntity.getStringValueForField("AnyInsuranceCompanyAnyTimeDeclinedourProposalDropDown"));
			}

			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions")) {
				selectValueFromList(HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions, policyAttrAviationEntity.getStringValueForField("HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialcondition"));
			}
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy")) {
				selectValueFromList(Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy, policyAttrAviationEntity.getStringValueForField("Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthe"));
			}
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDoyouhaveanyothercurrentpolicycoveringthisorsimilarrisk")) {
				selectValueFromList(Doyouhaveanyothercurrentpolicycoveringthisorsimilarrisk, policyAttrAviationEntity.getStringValueForField("Doyouhaveanyothercurrentpolicycoveringthisorsimilarr"));
			}	
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers")) {
				selectValueFromList(Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers, policyAttrAviationEntity.getStringValueForField("Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmember"));
			}	
			*/
			
			
			
			
			
			
			
			
//			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDoYouHaveanyOtherCurrentCoveringRisk")) {
//					selectValueFromList(doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList, policyAttrAviationEntity.getStringValueForField("DoYouHaveanyOtherCurrentCoveringRisk"));
//			}
//			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasAnyAircraftOwnEdoroperatedMembers")) {
//					selectValueFromList(hasAnyAircraftOwnEdoroperatedbymembersDropDownList, policyAttrAviationEntity.getStringValueForField("HasAnyAircraftOwnEdoroperatedMembers"));
//			}
//			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTableofbenefits")) {
//					selectValueFromList(tableofbenefitsDropDownList, policyAttrAviationEntity.getStringValueForField("Tableofbenefits"));
//			}
//				if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicablePolicyDetPNT2POL")) {
//					selectValueFromList(coInsuranceApplicableDropDownList, policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicablePolicyDetPNT2POL"));
//			}
//				if (policyAttrAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExemptedPolicyDetPNT2POL")) {
//					selectValueFromList(isServiceTaxExemptedDropDownList, policyAttrAviationEntity.getStringValueForField("IsServiceTaxExemptedPolicyDetPNT2POL"));
//			}
//			if (policyAttrAviationEntity.getBooleanValueForField("ConfigSubjecttoclauseSpecialCondition")) {
//				clearAndSendKeys(subjecttoclauseSpecialConditionTextarea, policyAttrAviationEntity.getStringValueForField("SubjecttoclauseSpecialCondition"));
//			}
//			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofPAclauses")) {
//					selectValueFromList(typeofPAclausesDropDownList, policyAttrAviationEntity.getStringValueForField("TypeofPAclauses"));
//			}
		}

		else if(policyAttrAviationEntity.getAction().equalsIgnoreCase("verify")){			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicableAA")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("CoInsuranceApplicableAA"),fetchValueFromList(CoInsuranceApplicableAAtext), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyDescriptionAA")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("PolicyDescriptionAA"),fetchValueFromTextFields(PolicyDescriptionAAtext), AssertionType.WARNING);
			}
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigTypeofLiabilityDropdown")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("TypeofLiabilityAA"),fetchValueFromList(TypeofLiabilityDropdown), AssertionType.WARNING);
			}
			
			
			
			//Nazaf
			
			
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfighasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("AnyInsuranceCompanyAnyTimeDeclinedourProposalDropDown"),fetchValueFromList(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDown), AssertionType.WARNING);
			}
		    if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions")) {
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialcondition"),fetchValueFromList(HasanyinsurancecompanyatanytimeRequiredanincreasedpremiumorimposedspecialconditions), AssertionType.WARNING);
			}
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy")) {		
			assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthe"),fetchValueFromList(Hasanyinsurancecompanyatanytimecancelledorrefusedtorenewthepolicy), AssertionType.WARNING);
			}			
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigDoyouhaveanyothercurrentpolicycoveringthisorsimilarrisk")) {		
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("Doyouhaveanyothercurrentpolicycoveringthisorsimilarr"),fetchValueFromList(Doyouhaveanyothercurrentpolicycoveringthisorsimilarrisk), AssertionType.WARNING);
				}		
			
			
			if (policyAttrAviationEntity.getBooleanValueForField("ConfigHasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers")) {		
				assertReference.assertEquals(policyAttrAviationEntity.getStringValueForField("Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmember"),fetchValueFromList(Hasanyaircraftownedoroperatedbyyouevermetwithaccidentinvolvinginjuriestopassengersandorcrewmembers), AssertionType.WARNING);
				}	
			
			
			
			
			
			
		}
	}

	
	
	public void navigateTobackAttributePage(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void navigateToPolicy(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolicyAttrAviationEntity policyAttrAviationEntity){
		if (policyAttrAviationEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void fillandSubmitPolicyAttributeAviation(PolicyAttrAviationEntity policyAttrAviationEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyAttrAviationEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeAviation(policyAttrAviationEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(policyAttrAviationEntity);
			
			if(policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("PN") || (policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("AG")) || policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("PA")|| (policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("AL"))){
				fillPolicyAttributePolicyDetailsPNT2POLAviation(policyAttrAviationEntity,assertReference);
				clickNextButtonPolicyAttributeCDPolicyDetails(policyAttrAviationEntity);	
			}
			if(policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("A1")|| (policyAttrAviationEntity.getStringValueForField("Product").equalsIgnoreCase("AQ"))){
				fillPolicyAttributePolicyDetailsAAAviation(policyAttrAviationEntity,assertReference);
				clickNextButtonPolicyAttributeCDPolicyDetails(policyAttrAviationEntity);	
			}
			
			navigateTobackAttributePage(policyAttrAviationEntity);
			navigateToPolicy(policyAttrAviationEntity);
			navigateToAttribute(policyAttrAviationEntity);
			navigateToInsuredInterest(policyAttrAviationEntity);
			navigateToCoverage(policyAttrAviationEntity);
			navigateToLoan(policyAttrAviationEntity);
			navigateToClientDetails(policyAttrAviationEntity);
			navigateToRelation(policyAttrAviationEntity);
			navigateToPayment(policyAttrAviationEntity);
			navigateToFollowup(policyAttrAviationEntity);
			navigateToDocument(policyAttrAviationEntity);

		}
	}
}
