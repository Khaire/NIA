package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberCoverageDEntity;
import com.aqm.staf.library.databin.SumInsuredAndLossEntity;

public class PolicyInsIntrstCovrageAttrSumInsuredTwo extends BasePage {

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

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;


	private PageElement saveButton;
	private PageElement backwardButton;
	private PageElement backButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestDocumentsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement attachCoveragesDetailTab;
	private PageElement attachCoveragesAttributeTab;
	private PageElement attachCoveragesPremiumTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestDocumentsTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement insuredInterestScheduleTitle;

	private PageElement attachCoverageDetailsPageTitle;
	private PageElement attachCoverageAttributesPageTitle;
	private PageElement attachCoveragePremiumPageTitle;

	private PageElement capitalSIforNamedPersonsTextField;
	private PageElement SumInsuredforTPPDTextField;

	private PageElement capitalSIforDriversTextField;
	private PageElement nextButton;

	// PC
	private PageElement loanOrHireOfVehiclesDropdown;
	private PageElement nilDepreciationDropdown;
	private PageElement inclusionOfRoadTaxCoverDropDown;
	private PageElement additionalTowingChargesDropdown;
	private PageElement returnToInvoiceCoverDropdown;
	private PageElement lossOfContentCoverDropdown;
	private PageElement ncbProtectionCoverDropdown;
	private PageElement engineProtectCoverDropDown;

	public PolicyInsIntrstCovrageAttrSumInsuredTwo (WebDriver driver, String pageName){
		super(driver,pageName);

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
		//Buttons
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/font/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDocumentsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButton= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailTab=new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attribute", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributeTab=new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), "Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTab=new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), "Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "InsuredInterestCode"))," Insured Interest Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "SerialNo"))," Serial No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "CoverageCode")),"Coverage Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "CoverageName"))," Coverage Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		capitalSIforNamedPersonsTextField=new PageElement(By.xpath("//input[@name='propValues1']"), "capital SI for Named Persons", false, WaitType.WAITFORELEMENTTOBEDISPLAYED ,10);
		SumInsuredforTPPDTextField=new PageElement(By.xpath("//input[@name='propValues2']"), "Sum Insured for TPPD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		capitalSIforDriversTextField=new PageElement(By.xpath("//input[@name='propValues1']"), "Capital SI for Drivers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PC (Shwetha 18/06/2018)
		loanOrHireOfVehiclesDropdown = new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[1]"), "Loan Or Hire Of Vehicles", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nilDepreciationDropdown = new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[2]"), "Nil Depriciated", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inclusionOfRoadTaxCoverDropDown = new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[3]"), "Inclusion Of Road Tax", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalTowingChargesDropdown= new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[4]"), "Additional Towing Charges", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		returnToInvoiceCoverDropdown= new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[5]"), "Return to Invoice Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lossOfContentCoverDropdown= new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[6]"), "Loss of Content Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ncbProtectionCoverDropdown= new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[7]"), "NCB Protection Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineProtectCoverDropDown= new PageElement(By.xpath("//div[contains(text(),'Sum Insured for TPPD')]//following::select[8]"), "Engine Protection Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


	}

	public void fillPolicyInsIntrstCoverageAttrSumInsuredTwoDetails(SumInsuredAndLossEntity  sumInsuredAndLossEntity , CustomAssert assertReference) throws InterruptedException{
		if(sumInsuredAndLossEntity.getAction().equalsIgnoreCase("add") || sumInsuredAndLossEntity.getAction().equalsIgnoreCase("edit")){
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCapitalSIforNamedPersons")) {
				clearAndSendKeys(capitalSIforNamedPersonsTextField, sumInsuredAndLossEntity.getStringValueForField("CapitalSIforNamedPersons"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigSumInsuredforTPPD")) {
				clearAndSendKeys(SumInsuredforTPPDTextField, sumInsuredAndLossEntity.getStringValueForField("SumInsuredforTPPD"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCapitalSIforDrivers")) {
				clearAndSendKeys(capitalSIforDriversTextField, sumInsuredAndLossEntity.getStringValueForField("CapitalSIforDrivers"));
			}
			//(Shwetha 18/06/2018)
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigLoanOrHireOfVehicles")) {
				selectValueFromList(loanOrHireOfVehiclesDropdown, sumInsuredAndLossEntity.getStringValueForField("LoanOrHireOfVehicles"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigNilDepreciation")) {
				selectValueFromList(nilDepreciationDropdown, sumInsuredAndLossEntity.getStringValueForField("NilDepreciation"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInclusionOfRoadTaxCover")) {
				selectValueFromList(inclusionOfRoadTaxCoverDropDown, sumInsuredAndLossEntity.getStringValueForField("InclusionOfRoadTaxCover"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigAdditionalTowingCharges")) {
				selectValueFromList(additionalTowingChargesDropdown, sumInsuredAndLossEntity.getStringValueForField("AdditionalTowingCharges"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigReturnToInvoiceCover")) {
				selectValueFromList(returnToInvoiceCoverDropdown, sumInsuredAndLossEntity.getStringValueForField("ReturnToInvoiceCover"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigLossOfContentCover")) {
				selectValueFromList(lossOfContentCoverDropdown, sumInsuredAndLossEntity.getStringValueForField("LossOfContentCover"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigNcbProtectionCover")) {
				selectValueFromList(ncbProtectionCoverDropdown, sumInsuredAndLossEntity.getStringValueForField("NcbProtectionCover"));
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigEngineProtectCover")) {
				selectValueFromList(engineProtectCoverDropDown, sumInsuredAndLossEntity.getStringValueForField("EngineProtectCover"));
			}

		}
		else if(sumInsuredAndLossEntity.getAction().equalsIgnoreCase("verify")){
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(sumInsuredAndLossEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if(sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCoverageCode")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("CoverageCode"), fetchValueFromFields(coverageCodeLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCoverageName")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("CoverageName"), fetchValueFromFields(coverageNameLabel), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCapitalSIforNamedPersons")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("CapitalSIforNamedPersons"), fetchValueFromFields(capitalSIforNamedPersonsTextField), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigSumInsuredforTPPD")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("SumInsuredforTPPD"), fetchValueFromTextFields(SumInsuredforTPPDTextField), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCapitalSIforDrivers")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("CapitalSIforDrivers"), fetchValueFromTextFields(capitalSIforDriversTextField), AssertionType.WARNING);
			}
			//(Shwetha 18/06/2018)
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigLoanOrHireOfVehicles")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("LoanOrHireOfVehicles"), fetchValueFromList(loanOrHireOfVehiclesDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigNilDepreciation")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("NilDepreciation"), fetchValueFromList(nilDepreciationDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInclusionOfRoadTaxCover")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("InclusionOfRoadTaxCover"), fetchValueFromList(inclusionOfRoadTaxCoverDropDown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigAdditionalTowingCharges")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("AdditionalTowingCharges"), fetchValueFromList(additionalTowingChargesDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigReturnToInvoiceCover")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("ReturnToInvoiceCover"), fetchValueFromList(returnToInvoiceCoverDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigLossOfContentCover")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("LossOfContentCover"), fetchValueFromList(lossOfContentCoverDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigNcbProtectionCover")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("NcbProtectionCover"), fetchValueFromList(ncbProtectionCoverDropdown), AssertionType.WARNING);
			}
			if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigEngineProtectCover")) {
				assertReference.assertEquals(sumInsuredAndLossEntity.getStringValueForField("EngineProtectCover"), fetchValueFromList(engineProtectCoverDropDown), AssertionType.WARNING);
			}

		}
	}
	public void navigateToPolicy(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestDocuments")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigInsuredInterestSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnSaveButton(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigForwardButton")){
			click(saveButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickNextButton(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfignextButton")){
			click(nextButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnBackButton(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}

	public void clickTwNextButton(SumInsuredAndLossEntity  sumInsuredAndLossEntity){
		if (sumInsuredAndLossEntity.getBooleanValueForField("ConfigTWnextButton")){
			click(nextButton);
			click(nextButton);
			click(backwardButton);
			click(nextButton);
			switchToFrame("display");
			return;
		}
	}

	public void fillandSubmitfillPolicyInsIntrstCoverageAttrSumInsuredTwo(SumInsuredAndLossEntity sumInsuredAndLossEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(sumInsuredAndLossEntity.getConfigExecute())){
			fillPolicyInsIntrstCoverageAttrSumInsuredTwoDetails(sumInsuredAndLossEntity, assertReference);
			clickNextButton(sumInsuredAndLossEntity);
			navigateToPolicy(sumInsuredAndLossEntity);
			navigateToAttribute(sumInsuredAndLossEntity);
			navigateToInsuredInterest(sumInsuredAndLossEntity);
			navigateToCoverage(sumInsuredAndLossEntity);
			navigateToLoan(sumInsuredAndLossEntity);

			navigateToClientDetails(sumInsuredAndLossEntity);
			navigateToRelation(sumInsuredAndLossEntity);
			navigateToPayment(sumInsuredAndLossEntity);
			navigateToFollowup(sumInsuredAndLossEntity);
			navigateToDocument(sumInsuredAndLossEntity);
			navigateToInsuredInterestDetails(sumInsuredAndLossEntity);
			navigateToInsuredInterestAttributes(sumInsuredAndLossEntity);
			navigateToInsuredInterestAttachCoverages(sumInsuredAndLossEntity);
			navigateToInsuredInterestRelations(sumInsuredAndLossEntity);

			navigateToInsuredInterestPayments(sumInsuredAndLossEntity);
			navigateToInsuredInterestDocuments(sumInsuredAndLossEntity);

			navigateToInsuredInterestSchedule(sumInsuredAndLossEntity);
			clickTwNextButton(sumInsuredAndLossEntity);
			clickOnSaveButton(sumInsuredAndLossEntity);
			clickOnBackButton(sumInsuredAndLossEntity);
			clickOnBackwardButton(sumInsuredAndLossEntity);







		}
	}
}
