package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CLInsItClaimRiskDet1CSEntity;
import com.aqm.staf.library.databin.ClaimInsItAttRiskDetPAEntity;
import com.aqm.staf.library.databin.PolInsrIntCovrDetlPUPAEntity;
import com.aqm.staf.library.databin.PolInsureSpeclCondtnPAEntity;

public class PolicyInsuredIntrestCoverDetailsPUPersonalAccident extends BasePage {
	private PageElement PolicyCoverDetailsINDPUTitle ;
	
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

	private PageElement insuredInterestDetailsTab;	
	private PageElement insuredInterestAttributesTab;	
	private PageElement insuredInterestAttachCoveragesTab;	
	private PageElement insuredInterestRelationsTab;	
	private PageElement insuredInterestPaymentsTab;	
	private PageElement insuredInterestScheduleTab;	

	private PageElement policyInsuredInterestDetailsTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentListTitle;
	private PageElement policyInsuredInterestScheduleDetailsTitle;
	
	private PageElement attachCoveragesDetailTab;
	private PageElement attachCoveragesAttributesTab;
	private PageElement attachCoveragesPremiumTab;
	
	private PageElement attachCoveragesDetailTabTitle;
	//private PageElement attachCoveragesAttributesTabTitle;
	private PageElement attachCoveragesPremiumTabTitle;
	
	private PageElement quoteNoLable;
	private PageElement policyholderLable;
	private PageElement insuredInterestCodeLable;
	private PageElement coverageCodeLable;
	private PageElement statusLable;
	private PageElement productLable;
	private PageElement serialNoLable;
	private PageElement coverageNameLable;

	private PageElement isTableACoverrequiredDropDown;
	private PageElement sumInsuredforTableATextField;
	private PageElement rateforTableATextField;
	private PageElement isTableBCoverrequiredDropDown;
	private PageElement sumInsuredforTableBTextField;
	private PageElement rateforTableBTextField;
	private PageElement isTableCCoverrequiredDropDown;
	private PageElement sumInsuredforTableCTextField;
	private PageElement rateforTableCTextField;
	private PageElement isTableDCoverrequiredDropDown;
	private PageElement sumInsuredforTableDTextField;
	private PageElement rateforTableDTextField;
	private PageElement capitalSumInsuredTextField;
	private PageElement isWarAndAlliedRiskCoverageToIndiansWorkingDropDown;
	private PageElement countryofOperationTextField;
	private PageElement typeofPeriodDropDown;
	private PageElement sumInsuredforWarandAlliedRiskCoverageTextField;
	private PageElement rateforAbnormalOrApprehensiveOrWarPeriodTextField;
	
	private PageElement saveButton;
	private PageElement NextButton;
	private PageElement backButton;

	public PolicyInsuredIntrestCoverDetailsPUPersonalAccident (WebDriver driver, String pageName) {
		super(driver, pageName);
		
		PolicyCoverDetailsINDPUTitle = new PageElement(By.xpath("//div/b[contains(text(),'Cover Details IND PU')]"), "Claim Risk details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					
		policyTab             =new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab          =new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab    =new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab           =new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab               =new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab	  =new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab		  =new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab			  =new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle			= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle	= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle	 	= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle 	= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "Client Details Tab Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle 		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Relations Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle 		= new PageElement(By.xpath("//div//b//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		followupTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestDetailsTab			=new PageElement(By.xpath("//table[2]//tbody//td//div//b[contains(text(),'Detail')]"), "Insured Interest Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab		=new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab	=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab			=new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab			=new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab			=new PageElement(By.xpath("//div[@title='Schedule']"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyInsuredInterestDetailsTitle	= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Details')]"), "Policy Insured Interest Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle		= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTitle		= new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentListTitle		= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Payment List')]"), "Insured Interest Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestScheduleDetailsTitle= new PageElement(By.xpath("//form //div//b//b[contains(text(),'Schedule Details')]"), "Policy Insured Interest Schedule Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		attachCoveragesDetailTab		= new PageElement(By.xpath("//b//div[contains(text(),'Details')]"), "Attach Coverage Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTab	= new PageElement(By.xpath("//table[3]//tbody//td//div//b[contains(text(),'Attributes')]"), "Attach Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTab		= new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), "Attach Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		attachCoveragesDetailTabTitle	  = new PageElement(By.xpath("//div//b//b[contains(text(),'Policy Insured Interest Coverage')]"), "Attach Coverages Detail Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//attachCoveragesAttributesTabTitle = new PageElement(By.xpath("//div//b//b[contains(text(),'Insured Interest Details')]"), "Policy Insured Interest Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumTabTitle	  = new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
 	 	quoteNoLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	policyholderLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	insuredInterestCodeLable = new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest Code')]/following::td"), "Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	coverageCodeLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage Code')]/following::td"), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	statusLable			= new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	productLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::input"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	serialNoLable		= new PageElement(By.xpath("//td//div//b[contains(text(),'Serial No.')]/following::td"), "Serial Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	coverageNameLable	= new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage Name')]/following::td"), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	
 	 	isTableACoverrequiredDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Is Table A Cover required?')]/following::select"), "Is Table A Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
 	 	sumInsuredforTableATextField		= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table A')]/following::input"), "Sum Insured for Table A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	rateforTableATextField				= new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for Table A')]/following::input"), "Rate (%o) for Table A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	isTableBCoverrequiredDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Is Table B Cover required?')]/following::select"), "Is Table B Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
 	 	sumInsuredforTableBTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table B')]/following::input"), "Sum Insured for Table B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	rateforTableBTextField				= new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for Table B')]/following::input"), "Rate (%o) for Table B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	isTableCCoverrequiredDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Is Table C Cover required?')]/following::select"), "Is Table C Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
 	 	sumInsuredforTableCTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table C')]/following::input"), "Sum Insured for Table C TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	rateforTableCTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for Table C')]/following::input"), "Rate (%o) for Table C TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	isTableDCoverrequiredDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Is Table D Cover required?')]/following::select"), "Is Table D Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	sumInsuredforTableDTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Table D')]/following::input"), "Sum Insured for Table D TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	rateforTableDTextField			= new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for Table D')]/following::input"), "Rate (%o) for Table D TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	capitalSumInsuredTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Capital Sum Insured')]/following::input"), "Capital Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	isWarAndAlliedRiskCoverageToIndiansWorkingDropDown	= new PageElement(By.xpath("//td//div[contains(text(),'Is War and allied Risk coverage to Indians working in foreign countries required')]/following::select"), "Is War and allied Risk coverage to Indians working in foreign countries required", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	countryofOperationTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Country of Operation')]/following::input"), "Country of Operation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	typeofPeriodDropDown			= new PageElement(By.xpath("//td//div[contains(text(),'Type of Period')]/following::select"), "Type of Period DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
 	 	sumInsuredforWarandAlliedRiskCoverageTextField		= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for War and Allied Risk Coverage')]/following::input"), "Sum Insured for War and Allied Risk Coverage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	rateforAbnormalOrApprehensiveOrWarPeriodTextField	= new PageElement(By.xpath("//td//div[contains(text(),'Rate(%o) for Abnormal (or) Apprehensive (or) War Period')]/following::input"), "Rate(%o) for Abnormal (or) Apprehensive (or) War Period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	 	 	
		saveButton		= new PageElement(By.name("btnSave"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		NextButton		= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		= new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
	}
	
	public void fillPolicyCoverDetailsINDPU(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity, CustomAssert assertReference){
		if(polInsrIntCovrDetlPUPAEntity.getAction().equalsIgnoreCase("add") || polInsrIntCovrDetlPUPAEntity.getAction().equalsIgnoreCase("edit")){
			
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableACoverrequired")) {
			    selectValueFromList(isTableACoverrequiredDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableACoverrequired"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableA")) {
			    clearAndSendKeys(sumInsuredforTableATextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableA"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableA")) {
			    clearAndSendKeys(rateforTableATextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableA"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableBCoverrequired")) {
				selectValueFromList(isTableBCoverrequiredDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableBCoverrequired"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableB")) {
			    clearAndSendKeys(sumInsuredforTableBTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableB"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableB")) {
			    clearAndSendKeys(rateforTableBTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableB"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableCCoverrequired")) {
				selectValueFromList(isTableCCoverrequiredDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableCCoverrequired"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableC")) {
			    clearAndSendKeys(sumInsuredforTableCTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableC"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableC")) {
			    clearAndSendKeys(rateforTableCTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableC"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableDCoverrequired")) {
				selectValueFromList(isTableDCoverrequiredDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableDCoverrequired"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableD")) {
			    clearAndSendKeys(sumInsuredforTableDTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableD"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableD")) {
			    clearAndSendKeys(rateforTableDTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableD"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
			    clearAndSendKeys(capitalSumInsuredTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("CapitalSumInsured"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsWarAndAlliedRiskCoverageToIndiansWorking")) {
				selectValueFromList(isWarAndAlliedRiskCoverageToIndiansWorkingDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsWarAndAlliedRiskCoverageToIndiansWorking"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCountryofOperation")) {
			    clearAndSendKeys(countryofOperationTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("CountryofOperation"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigTypeofPeriod")) {
				selectValueFromList(typeofPeriodDropDown, polInsrIntCovrDetlPUPAEntity.getStringValueForField("TypeofPeriod"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforWarandAlliedRiskCoverage")) {
			    clearAndSendKeys(sumInsuredforWarandAlliedRiskCoverageTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforWarandAlliedRiskCoverage"));
			}
			if(polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforAbnormalOrApprehensiveOrWarPeriod")) {
			    clearAndSendKeys(rateforAbnormalOrApprehensiveOrWarPeriodTextField, polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforAbnormalOrApprehensiveOrWarPeriod"));
			}
		}
		else if(polInsrIntCovrDetlPUPAEntity.getAction().equalsIgnoreCase("verify")){
			//Lables
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigQuoteNo")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigPolicyholder")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCoverageCode")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("CoverageCode"), fetchValueFromTextFields(coverageCodeLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigStatus")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigProductName")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLable), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSerialNo")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoLable), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCoverageName")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("CoverageName"), fetchValueFromTextFields(coverageNameLable), AssertionType.WARNING);
			}
			//Fields
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableACoverrequired")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableACoverrequired"), fetchValueFromList(isTableACoverrequiredDropDown), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableA")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableA"), fetchValueFromTextFields(sumInsuredforTableATextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableA")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableA"), fetchValueFromTextFields(rateforTableATextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableBCoverrequired")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableBCoverrequired"), fetchValueFromList(isTableBCoverrequiredDropDown), AssertionType.WARNING);
		    }
		 	if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableB")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableB"), fetchValueFromTextFields(sumInsuredforTableBTextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableB")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableB"), fetchValueFromTextFields(rateforTableBTextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableCCoverrequired")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableCCoverrequired"), fetchValueFromList(isTableCCoverrequiredDropDown), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableC")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableC"), fetchValueFromTextFields(sumInsuredforTableCTextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableC")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableC"), fetchValueFromTextFields(rateforTableCTextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsTableDCoverrequired")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsTableDCoverrequired"), fetchValueFromList(isTableDCoverrequiredDropDown), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforTableD")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforTableD"), fetchValueFromTextFields(sumInsuredforTableDTextField), AssertionType.WARNING);
		    }
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforTableD")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforTableD"), fetchValueFromTextFields(rateforTableDTextField), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("CapitalSumInsured"), fetchValueFromTextFields(capitalSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigIsWarAndAlliedRiskCoverageToIndiansWorking")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("IsWarAndAlliedRiskCoverageToIndiansWorking"), fetchValueFromList(isWarAndAlliedRiskCoverageToIndiansWorkingDropDown), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCountryofOperation")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("CountryofOperation"), fetchValueFromTextFields(countryofOperationTextField), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigTypeofPeriod")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("TypeofPeriod"), fetchValueFromList(typeofPeriodDropDown), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSumInsuredforWarandAlliedRiskCoverage")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("SumInsuredforWarandAlliedRiskCoverage"), fetchValueFromTextFields(sumInsuredforWarandAlliedRiskCoverageTextField), AssertionType.WARNING);
			}
			if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRateforAbnormalOrApprehensiveOrWarPeriod")) {
			    assertReference.assertEquals(polInsrIntCovrDetlPUPAEntity.getStringValueForField("RateforAbnormalOrApprehensiveOrWarPeriod"), fetchValueFromTextFields(rateforAbnormalOrApprehensiveOrWarPeriodTextField), AssertionType.WARNING);
			}
	
		}	
	
	}
	
	public void clickSaveButton(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity) {
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void clickBackButton(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity) {
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	
	public void clickNextButton(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity) {
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigNextButton")) {
			click(NextButton);
			switchToFrame("display");
		}
	}

	
	public void navigateToPolicy(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);		
			switchToFrame("display");		
			isElementDisplayed(policyTabTitle);		
		}			
	}				
	public void navigateToAttribute(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}				
	public void navigateToInsuredInterest(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestTabTitle);		
		}			
	}				
	public void navigateToCoverage(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);		
			switchToFrame("display");		
			isElementDisplayed(coverageTabTitle);		
		}			
	}				

	public void navigateToLoan(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);		
			//		switchToFrame("display");
		}			
	}				

	public void navigateToClientDetails(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(clientDetailsTabTitle);		
		}			
	}	
	
	public void navigateToRelation(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);		
			switchToFrame("display");		
			isElementDisplayed(relationsTabTitle);		
		}			
	}
	
	public void navigateToPayment(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(paymentsTabTitle);		
		}			
	}
	
	public void navigateToFollowup(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);		
			switchToFrame("display");		
			isElementDisplayed(followupTabTitle);		
		}			
	}				
	public void navigateToDocument(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);		
			switchToFrame("display");		
			isElementDisplayed(documentTabTitle);		
		}			
	}
	//Insured Interest SubTab
	public void navigateToInsuredInterestDetailsTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestDetailsTitle);		
		}			
	}	
	
	public void navigateToInsuredInterestAttributesTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestAttributesTitle);		
		}			
	}
	
	public void navigateToInsuredInterestAttachCoveragesTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestCoverageTitle);		
		}			
	}
	
	public void navigateToInsuredInterestRelationsTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestRelationsTitle);		
		}			
	}
	
	public void navigateToInsuredInterestPaymentsTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestPaymentListTitle);		
		}			
	}
	
	public void navigateToInsuredInterestScheduleTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestScheduleDetailsTitle);		
		}			
	}
	//Attach Coverage sub Tab
	public void navigateToAttachCoverageDetailsTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigAttachCoverageDetailsTab")){			
			click(attachCoveragesDetailTab);		
			switchToFrame("display");		
			isElementDisplayed(attachCoveragesDetailTabTitle);		
		}			
	}
	
	public void navigateToAttachCoverageAttributesTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigAttachCoverageAttributesTab")){			
			click(attachCoveragesAttributesTab);		
			switchToFrame("display");
			isElementDisplayed(PolicyCoverDetailsINDPUTitle);	
	
		}			
	}
	
	public void navigateToAttachCoveragePremiumTab(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity){				
		if (polInsrIntCovrDetlPUPAEntity.getBooleanValueForField("ConfigAttachCoveragePremiumTab")){			
			click(attachCoveragesPremiumTab);		
			switchToFrame("display");		
			isElementDisplayed(attachCoveragesPremiumTabTitle);		
		}			
	}	
	
	public void fillandSubmitInsuredIntClaimRiskDetails1(PolInsrIntCovrDetlPUPAEntity polInsrIntCovrDetlPUPAEntity, CustomAssert assertReference) {
		if (isConfigTrue(polInsrIntCovrDetlPUPAEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyCoverDetailsINDPU(polInsrIntCovrDetlPUPAEntity,assertReference);
			clickNextButton(polInsrIntCovrDetlPUPAEntity);
			clickSaveButton(polInsrIntCovrDetlPUPAEntity);
			clickBackButton(polInsrIntCovrDetlPUPAEntity);
			navigateToPolicy(polInsrIntCovrDetlPUPAEntity);
			navigateToAttribute(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterest(polInsrIntCovrDetlPUPAEntity);
			navigateToCoverage(polInsrIntCovrDetlPUPAEntity);
			navigateToLoan(polInsrIntCovrDetlPUPAEntity);
			navigateToClientDetails(polInsrIntCovrDetlPUPAEntity);
			navigateToRelation(polInsrIntCovrDetlPUPAEntity);
			navigateToPayment(polInsrIntCovrDetlPUPAEntity);
			navigateToFollowup(polInsrIntCovrDetlPUPAEntity);
			navigateToDocument(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestDetailsTab(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestAttributesTab(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestAttachCoveragesTab(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestRelationsTab(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestPaymentsTab(polInsrIntCovrDetlPUPAEntity);
			navigateToInsuredInterestScheduleTab(polInsrIntCovrDetlPUPAEntity);
			navigateToAttachCoverageDetailsTab(polInsrIntCovrDetlPUPAEntity);
			navigateToAttachCoverageAttributesTab(polInsrIntCovrDetlPUPAEntity);
			navigateToAttachCoveragePremiumTab(polInsrIntCovrDetlPUPAEntity);

		}
	}	
	
	
	
}
