package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntRiskDet2Entity;
import com.aqm.staf.library.databin.PolInsIntVesselDetEntity;
import com.aqm.staf.library.databin.PolInsVesselRiskDEntity;


public class PolicyInsuredIntrestRiskDetails2MarineHull extends BasePage{
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

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement backwardButton;
	private PageElement deductibleTextField;
	private PageElement specialConditions1TextArea;
	private PageElement specialConditions2TextArea;

	//CL-Yogesh
	private PageElement whetherHAndMCoveredDropDown;	
	private PageElement hMSumInsuredTextField;	 
	private PageElement chartersLiabilityDeductibleTextField;	 
	private PageElement protectionAndIndemnityInsuranceRequiredDropDown;	
	private PageElement protectionAndIndemnityDeductibleTextField;
	//CP-Repeated

	//WR-Rajkumar 4TH page
	private PageElement qualificationOfMasterTextField;
	private PageElement numberOfCrewTextField;
	private PageElement presentInsurerIfAnyTextArea;
	private PageElement tradingRegionsTextArea;
	private PageElement openButton;
	//Open Button
	private PageElement serialNoTextField;
	private PageElement dateOfLossDateTextField;
	private PageElement underwritingYearDropDown;
	private PageElement detailsOfClaimTextArea;
	private PageElement amountPaidTextField;
	private PageElement amountOutstandingTextField;
	private PageElement deleteButton;
	private PageElement addButton;
	private PageElement saveButton;
	private PageElement closeButton;


	public PolicyInsuredIntrestRiskDetails2MarineHull(WebDriver driver, String pageName) {
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
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
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
		deductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'deductible')]/following::input"),"deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions1TextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions1')]/following::textarea"),"Special Conditions1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions2TextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions2')]/following::textarea"),"Special Conditions2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CL-Yogesh
		whetherHAndMCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether H and M Covered?')]/following::select"), "Whether H and M Covered? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		hMSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'HM Sum Insured')]/following::input"), "HM Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersLiabilityDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Liability deductible')]/following::input"), "Charters Liability deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		protectionAndIndemnityInsuranceRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Protection and Indemnity Insurance required')]/following::select"), "Protection and Indemnity Insurance required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		protectionAndIndemnityDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Protection and Indemnity Deductible')]/following::input"), "Protection and Indemnity Deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		qualificationOfMasterTextField=new PageElement(By.xpath("//td//div[contains(text(),'Qualification of Master')]/following::input"), "Qualification of Master Text", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		numberOfCrewTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Crew')]/following::input"), "Number of Crew Text", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		presentInsurerIfAnyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Present Insurer(If any)')]/following::textarea"), "Present Insurer If any Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tradingRegionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Trading Regions')]/following::textarea"), "Trading Regions Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openButton=new PageElement(By.xpath("//td//div[contains(text(),'Claim Detail')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Open Button
		//verify--/serialNoLabel=new PageElement(By.name("slNo0"), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLossDateTextField=new PageElement(By.name("Data_1297524052001_0"), "Date Of Loss Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underwritingYearDropDown=new PageElement(By.name("Data_51352425062005_0"), "Underwriting Year 	List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfClaimTextArea=new PageElement(By.name("Data_250168002112010_0"), "Details Of Claim Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountPaidTextField=new PageElement(By.name("Data_766405042001_0"), "Amount Paid Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOutstandingTextField=new PageElement(By.name("Data_250168102112010_0"), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteButton=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "SaveButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton=new PageElement(By.name("btnClose"), "CloseButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyInsuredIntrestRiskDetails2MarineHull(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntRiskDet2Entity.getAction().equalsIgnoreCase("add") || polInsIntRiskDet2Entity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, polInsIntRiskDet2Entity.getStringValueForField("Deductible"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSpecialConditions1")) {
				clearAndSendKeys(specialConditions1TextArea, polInsIntRiskDet2Entity.getStringValueForField("SpecialConditions1"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSpecialConditions2")) {
				clearAndSendKeys(specialConditions2TextArea, polInsIntRiskDet2Entity.getStringValueForField("SpecialConditions2"));
			}
			//CL-Yogesh
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigWhetherHAndMCovered")) {
				selectValueFromList(whetherHAndMCoveredDropDown, polInsIntRiskDet2Entity.getStringValueForField("WhetherHAndMCovered"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigHMSumInsured")) {
				clearAndSendKeys(hMSumInsuredTextField, polInsIntRiskDet2Entity.getStringValueForField("HMSumInsured"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigChartersLiabilityDeductible")) {
				clearAndSendKeys(chartersLiabilityDeductibleTextField, polInsIntRiskDet2Entity.getStringValueForField("ChartersLiabilityDeductible"));
			}	
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityInsuranceRequired")) {
				selectValueFromList(protectionAndIndemnityInsuranceRequiredDropDown, polInsIntRiskDet2Entity.getStringValueForField("ProtectionAndIndemnityInsuranceRequired"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityDeductible")) {
				clearAndSendKeys(protectionAndIndemnityDeductibleTextField, polInsIntRiskDet2Entity.getStringValueForField("ProtectionAndIndemnityDeductible"));
			}

			//WR-Rajkumar--4th page

			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				clearAndSendKeys(qualificationOfMasterTextField, polInsIntRiskDet2Entity.getStringValueForField("QualificationOfMaster"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigNumberOfCrew")) {
				clearAndSendKeys(numberOfCrewTextField, polInsIntRiskDet2Entity.getStringValueForField("NumberOfCrew"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPresentInsurerIfAny")) {
				clearAndSendKeys(presentInsurerIfAnyTextArea, polInsIntRiskDet2Entity.getStringValueForField("PresentInsurerIfAny"));
			}		
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigTradingRegions")) {
				clearAndSendKeys(tradingRegionsTextArea, polInsIntRiskDet2Entity.getStringValueForField("TradingRegions"));
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigClaimDetail")) {
				fillClaimDetail(polInsIntRiskDet2Entity);
			}

		}
		else if(polInsIntRiskDet2Entity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("Deductible"),fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSpecialConditions1")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("SpecialConditions1"),fetchValueFromTextFields(specialConditions1TextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSpecialConditions2")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("SpecialConditions2"),fetchValueFromTextFields(specialConditions2TextArea), AssertionType.WARNING);
			}
			//CL-Yogesh
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigWhetherHAndMCovered")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("WhetherHAndMCovered"), fetchValueFromList(whetherHAndMCoveredDropDown), AssertionType.WARNING);
			}			
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigHMSumInsured")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("HMSumInsured"), fetchValueFromTextFields(hMSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigChartersLiabilityDeductible")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("ChartersLiabilityDeductible"), fetchValueFromTextFields(chartersLiabilityDeductibleTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityInsuranceRequired")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("ProtectionAndIndemnityInsuranceRequired"), fetchValueFromList(protectionAndIndemnityInsuranceRequiredDropDown), AssertionType.WARNING);
			}			
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityDeductible")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("ProtectionAndIndemnityDeductible"), fetchValueFromTextFields(protectionAndIndemnityDeductibleTextField), AssertionType.WARNING);
			}
			//WR-Rajkumar--4th page
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("QualificationOfMaster"), fetchValueFromTextFields(qualificationOfMasterTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigNumberOfCrew")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("NumberOfCrew"), fetchValueFromTextFields(numberOfCrewTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPresentInsurerIfAny")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("PresentInsurerIfAny"), fetchValueFromTextFields(presentInsurerIfAnyTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAmountPaid")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("AmountPaid"), fetchValueFromTextFields(amountPaidTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigTradingRegions")) {
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("TradingRegions"), fetchValueFromTextFields(tradingRegionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigClaimDetail")) {
				verifyClaimDetail(polInsIntRiskDet2Entity,assertReference);
			}
		}
	}
	public void navigateTobackAttributePage(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetails(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}
	public void navigateToPolicy(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnSaveButton(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity){
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void clickOpenButton(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity) throws InterruptedException{
		if (polInsIntRiskDet2Entity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Parameter List for Claim Detail");
			}catch(Exception e){
				switchToWindow("Parameter List for Claim Detail");
			}
		}
	}
	public void fillClaimDetail(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity) throws InterruptedException{
		clickOpenButton(polInsIntRiskDet2Entity);

		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDateOfLossDate")){
			String dateOfLossDate=RandomCodeGenerator.dateGenerator(polInsIntRiskDet2Entity.getStringValueForField("DateOfLossDate"));
			clearAndEnterDate(dateOfLossDateTextField, dateOfLossDate);
		}
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigUnderwritingYear")){	 
			selectValueFromList(underwritingYearDropDown, polInsIntRiskDet2Entity.getStringValueForField("UnderwritingYear"));
		}
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDetailsOfClaim")){		 
			clearAndSendKeys(detailsOfClaimTextArea, polInsIntRiskDet2Entity.getStringValueForField("DetailsOfClaim"));
		}
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAmountPaid")){ 
			clearAndSendKeys(amountPaidTextField, polInsIntRiskDet2Entity.getStringValueForField("AmountPaid"));
		}
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAmountOutstanding")){ 
			clearAndSendKeys(amountOutstandingTextField, polInsIntRiskDet2Entity.getStringValueForField("AmountOutstanding"));
		}	
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDeleteButton")){
			click(deleteButton);
			switchToFrame("display");
		}	
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAddButton")){
			click(addButton);
			switchToFrame("display");
		}	
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
		}	
		if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigCloseButton")){
			click(closeButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}	


	}
	
	public void verifyClaimDetail(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity ,CustomAssert assertReference) throws InterruptedException{
		clickOpenButton(polInsIntRiskDet2Entity);

		if(polInsIntRiskDet2Entity.getAction().equalsIgnoreCase("verify")){

			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigSerialNo")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDateOfLossDate")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("DateOfLossDate"), fetchValueFromTextFields(dateOfLossDateTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigUnderwritingYear")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("UnderwritingYear"), fetchValueFromList(underwritingYearDropDown), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigDetailsOfClaim")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("DetailsOfClaim"), fetchValueFromTextFields(detailsOfClaimTextArea), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAmountPaid")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("AmountPaid"), fetchValueFromTextFields(amountPaidTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigAmountOutstanding")){
				assertReference.assertEquals(polInsIntRiskDet2Entity.getStringValueForField("AmountOutstanding"), fetchValueFromTextFields(amountOutstandingTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDet2Entity.getBooleanValueForField("ConfigCloseButton")){
				click(closeButton);
				switchToFrame("display");
				switchToWindow("Integrated Insurance Management System");
			}
		}
	}
	public void fillandSubmitPolicyInsuredIntrestRiskDetails2MarineHull(PolInsIntRiskDet2Entity polInsIntRiskDet2Entity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntRiskDet2Entity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestRiskDetails2MarineHull(polInsIntRiskDet2Entity, assertReference);
			navigateTobackAttributePage(polInsIntRiskDet2Entity);
			navigateToPolicy(polInsIntRiskDet2Entity);
			navigateToAttribute(polInsIntRiskDet2Entity);
			navigateToInsuredInterest(polInsIntRiskDet2Entity);
			navigateToCoverage(polInsIntRiskDet2Entity);
			navigateToLoan(polInsIntRiskDet2Entity);
			navigateToClientDetails(polInsIntRiskDet2Entity);
			navigateToRelation(polInsIntRiskDet2Entity);
			navigateToPayment(polInsIntRiskDet2Entity);
			navigateToFollowup(polInsIntRiskDet2Entity);
			navigateToDocument(polInsIntRiskDet2Entity);
			navigateTobackAttributePage(polInsIntRiskDet2Entity);
			clickOnSaveButton(polInsIntRiskDet2Entity);
			navigateToInsuredInterestAttributes(polInsIntRiskDet2Entity);
			navigateToInsuredInterestAttachCoverages(polInsIntRiskDet2Entity);
			navigateToInsuredInterestRelations(polInsIntRiskDet2Entity);
			navigateToInsuredInterestPayments(polInsIntRiskDet2Entity);
			clickNextButtonPolicyAttributeCSPolicyDetails(polInsIntRiskDet2Entity);
		}
	}

}
