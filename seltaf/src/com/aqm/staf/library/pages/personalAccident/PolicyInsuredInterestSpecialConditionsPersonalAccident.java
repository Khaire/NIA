package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsureAttBuyrDetailEntity;
import com.aqm.staf.library.databin.PolInsureSpeclCondtnPAEntity;

public class PolicyInsuredInterestSpecialConditionsPersonalAccident extends BasePage {
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
	private PageElement breakInInsuranceTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement policyTypeForPersonalAccidentInsuranceFlightCouponLabel;
	private PageElement groupNamedDetailsLabel;
	private PageElement excessTextField;
	private PageElement discountForGoodFeatureInPercentageTextField;
	private PageElement discountForGoodClaimExperienceInPercentageTextField;
	private PageElement dGMRMDiscretionaryDiscountInPercentageTextField;
	private PageElement otherDiscountsInPercentageTextField;
	private PageElement giveReasonForOtherDiscountTextField;
	private PageElement adverseClaimExperienceLoadingInPercentageTextField;
	private PageElement otherLoadingInPercentageTextField;
	private PageElement giveReasonForOtherLoadingTextField;
	private PageElement specialConditionsTextField;
	private PageElement totalSumInsuredforPersonalAccidentLabel;

	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;

	public PolicyInsuredInterestSpecialConditionsPersonalAccident(WebDriver driver, String pageName) {
		super (driver, pageName);
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
		breakInInsuranceTitle = new PageElement(By.xpath("//div/b//font[contains(text(),'Break-in-Insurance')]"), "Policy Insured Interest Schedule Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel			= new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel				= new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel		= new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"), "Policy holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel			= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Name Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//td//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Quote Number Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTypeForPersonalAccidentInsuranceFlightCouponLabel= new PageElement(By.xpath("//td[contains(text(),'Policy Type for Personal Accident Insurance (Flight Coupon)')]/following::td"), "Policy Type For Personal Accident Insurance Flight Coupon Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupNamedDetailsLabel 	= new PageElement(By.xpath("//tr//td[contains(text(),'Group Named Details')]/following::td"), "Group Named Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessTextField		 = new PageElement(By.xpath("//td//div[contains(text(),'Excess')]/following::input"), "Group Named Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountForGoodFeatureInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'Discount for Good Feature (in %)')]/following::input"), "Discount for Good Feature (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountForGoodClaimExperienceInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'Discount for Good Claim Experience (in %)')]/following::input"), "Discount for Good Claim Experience (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dGMRMDiscretionaryDiscountInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"), "Group Named Details Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDiscountsInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'Other Discounts (in %)')]/following::input"), "Other Discounts (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonForOtherDiscountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Give Reason for Other Discount')]/following::input"), "Give Reason for Other Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"), "Adverse Claim Experience Loading (in %)Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingInPercentageTextField = new PageElement(By.xpath("//td//div[contains(text(),'Other Loading (in %)')]/following::input"), "Other Loading (in %) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonForOtherLoadingTextField = new PageElement(By.xpath("//td//div[contains(text(),'Give Reason for Other Loading')]/following::input"), "Give Reason for Other Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredforPersonalAccidentLabel = new PageElement(By.xpath("//td//div[contains(text(),'Total sum insured for personal accident')]/following::input"), "Total sum insured for personal accident Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextButton		=new PageElement(By.name("Next"), " Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton	=new PageElement(By.name("btnPrevious"), " previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton		=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton      =new PageElement(By.name("btnSave"), " Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillPolicyInsuredSpecialConditionsPA(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity, CustomAssert assertReference){
		if(polInsureSpeclCondtnPAEntity.getAction().equalsIgnoreCase("add") || polInsureSpeclCondtnPAEntity.getAction().equalsIgnoreCase("edit")){

			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("Excess"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigDiscountForGoodFeatureInPercentage")) {
				clearAndSendKeys(discountForGoodFeatureInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("DiscountForGoodFeatureInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigDiscountForGoodClaimExperienceInPercentage")) {
				clearAndSendKeys(discountForGoodClaimExperienceInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("DiscountForGoodClaimExperienceInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigDGMRMDiscretionaryDiscountInPercentage")) {
				clearAndSendKeys(dGMRMDiscretionaryDiscountInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("DGMRMDiscretionaryDiscountInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigOtherDiscountsInPercentage")) {
				clearAndSendKeys(otherDiscountsInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("OtherDiscountsInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigGiveReasonForOtherDiscount")) {
				clearAndSendKeys(giveReasonForOtherDiscountTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("GiveReasonForOtherDiscount"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingInPercentage")) {
				clearAndSendKeys(adverseClaimExperienceLoadingInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("AdverseClaimExperienceLoadingInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigOtherLoadingInPercentage")) {
				clearAndSendKeys(otherLoadingInPercentageTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("OtherLoadingInPercentage"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonForOtherLoadingTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, polInsureSpeclCondtnPAEntity.getStringValueForField("SpecialConditions"));
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigTotalSumInsuredforPersonalAccident")) {
				clearAndSendKeys(totalSumInsuredforPersonalAccidentLabel, polInsureSpeclCondtnPAEntity.getStringValueForField("TotalSumInsuredforPersonalAccident"));
			}
		}
		else if(polInsureSpeclCondtnPAEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigTotalSumInsuredforPersonalAccident")) {
				assertReference.assertEquals(polInsureSpeclCondtnPAEntity.getStringValueForField("TotalSumInsuredforPersonalAccident"), fetchValueFromTextFields(totalSumInsuredforPersonalAccidentLabel), AssertionType.WARNING);
			}
		}

	}

	public void nextToBreakInInsurance(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity) {					
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigNextButton")) {			
			click(nextButton);		
			switchToFrame("display");		
			//breakInInsuranceTitle = new PageElement(By.xpath("//div/b//font[contains(text(),'"+polInsureSpeclCondtnPAEntity.getStringValueForField("PolInsureSpeclCondtnPATitle")+"')]"), "Policy Insured Interest Specl Condtn PA Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//if(isElementDisplayed(breakInInsuranceTitle));		
			return;		
		}			
	}	
	public void previousToGroupNameDetails(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity) {				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigPreviousButton")) {			
			click(previousButton);		
			switchToFrame("display");		
			return;		
		}			
	}
	public void saveToGroupNameDetails(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity) {				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigSaveButton")) {			
			click(saveButton);		
			switchToFrame("display");		
			return;		
		}			
	}
	public void backToInsuredInterestAttributes(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity) {					
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigBackButton")) {			
			click(backButton);		
			switchToFrame("display");		
			if(isElementDisplayed(insuredInterestAttributesTitle));		
			return;		
		}			
	}		

	public void navigateToPolicy(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);		
			switchToFrame("display");		
			isElementDisplayed(policyTabTitle);		
		}			
	}				
	public void navigateToAttribute(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);		
			switchToFrame("display");		
			isElementDisplayed(attributeTabTitle);		
		}			
	}				
	public void navigateToInsuredInterest(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestTabTitle);		
		}			
	}				
	public void navigateToCoverage(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);		
			switchToFrame("display");		
			isElementDisplayed(coverageTabTitle);		
		}			
	}				

	public void navigateToLoan(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);		
			//		switchToFrame("display");
		}			
	}				

	public void navigateToClientDetails(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(clientDetailsTabTitle);		
		}			

	}				
	public void navigateToRelation(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);		
			switchToFrame("display");		
			isElementDisplayed(relationsTabTitle);		
		}			


	}				
	public void navigateToPayment(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(paymentsTabTitle);		
		}			
	}				
	public void navigateToFollowup(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);		
			switchToFrame("display");		
			isElementDisplayed(followupTabTitle);		
		}			
	}				
	public void navigateToDocument(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);		
			switchToFrame("display");		
			isElementDisplayed(documentTabTitle);		
		}			
	}				
	public void navigateToInsuredInterestDetails(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailsTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestDetailsTitle);		
		}			
	}				
	public void navigateToInsuredInterestAttributes(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestAttributesTitle);		
		}			
	}				
	public void navigateToInsuredInterestAttachCoverages(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestAttachCoveragesTab")){			
			click(insuredInterestAttachCoveragesTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestCoverageTitle);		
		}			
	}				
	public void navigateToInsuredInterestRelations(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestRelationsTitle);		
		}			
	}				
	public void navigateToInsuredInterestPayments(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);		
			switchToFrame("display");		
			isElementDisplayed(insuredInterestPaymentListTitle);		
		}			
	}				
	public void navigateToInsuredInterestScheduleTab(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity){				
		if (polInsureSpeclCondtnPAEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);		
			switchToFrame("display");		
			isElementDisplayed(policyInsuredInterestScheduleDetailsTitle);		
		}			
	}				


	public void fillandSubmitPolicyInsuredSpecialConditionsPA(PolInsureSpeclCondtnPAEntity polInsureSpeclCondtnPAEntity, CustomAssert assertReference) {				
		if(isConfigTrue(polInsureSpeclCondtnPAEntity.getConfigExecute())){			
			switchToFrame("display");		
			fillPolicyInsuredSpecialConditionsPA(polInsureSpeclCondtnPAEntity,assertReference);		
			nextToBreakInInsurance(polInsureSpeclCondtnPAEntity);
			saveToGroupNameDetails(polInsureSpeclCondtnPAEntity);
			previousToGroupNameDetails(polInsureSpeclCondtnPAEntity);
			backToInsuredInterestAttributes(polInsureSpeclCondtnPAEntity);				
			navigateToPolicy(polInsureSpeclCondtnPAEntity);		
			navigateToAttribute(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterest(polInsureSpeclCondtnPAEntity);		
			navigateToCoverage(polInsureSpeclCondtnPAEntity);		
			navigateToLoan(polInsureSpeclCondtnPAEntity);		
			navigateToClientDetails(polInsureSpeclCondtnPAEntity);		
			navigateToRelation(polInsureSpeclCondtnPAEntity);		
			navigateToPayment(polInsureSpeclCondtnPAEntity);		
			navigateToFollowup(polInsureSpeclCondtnPAEntity);		
			navigateToDocument(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestDetails(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestAttributes(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestAttachCoverages(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestRelations(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestPayments(polInsureSpeclCondtnPAEntity);		
			navigateToInsuredInterestScheduleTab(polInsureSpeclCondtnPAEntity);		
		}
	}
}

