package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsrXssDscPUPerAcdtEntity;
import com.aqm.staf.library.databin.PolInsrXssDscPUPerAcdtEntity;

public class PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident extends BasePage {

	private PageElement insuredInterestAttributesTitle;
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

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement quoteNoLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement excessTextField;
	private PageElement opportunityIdTextField;
	private PageElement discountforGoodFeatureTextField;
	private PageElement discountforGoodClaimExperienceTextField;
	private PageElement dgmRMDiscretionarydiscountTextField;
	private PageElement commercialDiscountTextField;
	private PageElement otherDiscountsTextField;
	private PageElement giveReasonforOtherDiscountTextArea;
	private PageElement adverseClaimExperienceLoadingTextField;
	private PageElement otherLoadingTextField;
	private PageElement giveReasonforOtherLoadingTextArea;
	private PageElement specialConditionsTextArea;
	
	private PageElement insuredInterestDetailTabTitle;
	private PageElement insuredInterestAttributesTabTitle;
	private PageElement insuredInterestAttachCoveragesTabTitle;
	private PageElement insuredInterestRelationsTabTitle;		
	private PageElement insuredInterestPaymentsTabTitle;
	private PageElement insuredInterestScheduleTabTitle;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;
	
	private PageElement breakInInsuranceTitle;
	private PageElement mEMBERRiskDetailsTitle;
	private PageElement XcessLoadingDiscDetails;

	public PolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(WebDriver driver, String pageName ){
		super(driver,pageName);

		insuredInterestAttributesTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Xcess, Loading & Disc Details')]"), "Xcess, Loading & Disc Details Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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

		quoteNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Policyholder')]/following::td"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Product')]/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest Serial No.')]/following::td"), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Titile", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		breakInInsuranceTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Break-in-Insurance')]"), "Break-in-Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mEMBERRiskDetailsTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'MEMBER Risk Details')]"), "MEMBER Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		XcessLoadingDiscDetails= new PageElement(By.xpath("//div//b//font[contains(text(),'Xcess, Loading & Disc Details')]"), "Xcess, Loading & Disc Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestDetailTab= new PageElement(By.linkText("Detail"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab= new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab= new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab= new PageElement(By.xpath("//div[@title='Relation']"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		insuredInterestPaymentsTab= new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestScheduleTab= new PageElement(By.linkText("Schedule"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTabTitle= new PageElement(By.xpath("//div//b//b[contains(text(),'Details')]"), "Insured Interest Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest AttachCoverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		insuredInterestPaymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestScheduleTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		excessTextField=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Excess')]/following::input"), "Excess Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		discountforGoodFeatureTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Discount for Good Feature (in %)')]/following::input"), "Discount for Good Feature (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		discountforGoodClaimExperienceTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Discount for Good Claim Experience (in %)')]/following::input"), "Discount for Good Claim Experience (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dgmRMDiscretionarydiscountTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"), "DGM / RM Discretionary discount(%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commercialDiscountTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Commercial Discount (%)')]/following::input"), "Commercial Discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDiscountsTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Other Discounts (in %')]/following::input"), "Other Discounts (in % TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonforOtherDiscountTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Give Reason for Other Discount')]/following::textArea"), "Give Reason for Other Discount TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"), "Adverse Claim Experience Loading (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Other Loading (in %)')]/following::input"), "Other Loading (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonforOtherLoadingTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Give Reason for Other Loading')]/following::textArea"), "Give Reason for Other Loading TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Special Conditions')]/following::textArea"), "Special Conditions TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.xpath("//td//div//input[@name='btnSave']"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}




	public void fillPolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity, CustomAssert assertReference){
		if((polInsrXssDscPUPerAcdtEntity.getAction().equalsIgnoreCase("add") || polInsrXssDscPUPerAcdtEntity.getAction().equalsIgnoreCase("edit"))){

			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("Excess"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDiscountforGoodFeature")) {
				clearAndSendKeys(discountforGoodFeatureTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("DiscountforGoodFeature"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDiscountforGoodClaimExperience")) {
				clearAndSendKeys(discountforGoodClaimExperienceTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("DiscountforGoodClaimExperience"));
			} 
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDGMRMDiscretionarydiscount")) {
				clearAndSendKeys(dgmRMDiscretionarydiscountTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("DGMRMDiscretionarydiscount"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigCommercialDiscount")) {
				clearAndSendKeys(commercialDiscountTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("CommercialDiscount"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigOtherDiscounts")) {
				clearAndSendKeys(otherDiscountsTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("OtherDiscounts"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigGiveReasonforOtherDiscount")) {
				clearAndSendKeys(giveReasonforOtherDiscountTextArea, polInsrXssDscPUPerAcdtEntity.getStringValueForField("GiveReasonforOtherDiscount"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoading")) {
				clearAndSendKeys(adverseClaimExperienceLoadingTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("AdverseClaimExperienceLoading"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigOtherLoading")) {
				clearAndSendKeys(otherLoadingTextField, polInsrXssDscPUPerAcdtEntity.getStringValueForField("OtherLoading"));
			} 
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigGiveReasonforOtherLoading")) {
				clearAndSendKeys(giveReasonforOtherLoadingTextArea, polInsrXssDscPUPerAcdtEntity.getStringValueForField("GiveReasonforOtherLoading"));
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsrXssDscPUPerAcdtEntity.getStringValueForField("SpecialConditions"));
			}

		}

		else if(polInsrXssDscPUPerAcdtEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("PolicyHolder"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("ProductLabel"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDiscountforGoodFeature")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("DiscountforGoodFeature"), fetchValueFromTextFields(discountforGoodFeatureTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDiscountforGoodClaimExperience")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("DiscountforGoodClaimExperience"), fetchValueFromTextFields(discountforGoodClaimExperienceTextField), AssertionType.WARNING);
			} 
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDGMRMDiscretionarydiscount")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("DGMRMDiscretionarydiscount"), fetchValueFromTextFields(dgmRMDiscretionarydiscountTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigCommercialDiscount")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("CommercialDiscount"), fetchValueFromTextFields(commercialDiscountTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigOtherDiscounts")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("OtherDiscounts"), fetchValueFromTextFields(otherDiscountsTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigGiveReasonforOtherDiscount")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("GiveReasonforOtherDiscount"), fetchValueFromTextFields(giveReasonforOtherDiscountTextArea), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoading")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("AdverseClaimExperienceLoading"), fetchValueFromTextFields(adverseClaimExperienceLoadingTextField), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigOtherLoading")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("OtherLoading"), fetchValueFromTextFields(otherLoadingTextField), AssertionType.WARNING);
			} 
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigGiveReasonforOtherLoading")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("GiveReasonforOtherLoading"), fetchValueFromTextFields(giveReasonforOtherLoadingTextArea), AssertionType.WARNING);
			}
			if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsrXssDscPUPerAcdtEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			
		}

	}

	public void navigateToPolicy(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}

	public void navigateToAttribute(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}

	public void navigateToClientDetails(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}

	}
	public void navigateToRelation(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	
	public void navigateToInsrIntDetail(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntDetailTab")){		
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailTabTitle);
		}
	}
	
	public void navigateToInsrIntAttributes(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntAttributesTab")){		
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
	
	public void navigateToInsrIntAttachCoverages(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntAttachCoveragesTab")){		
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragesTabTitle);
		}
	}
	
	public void navigateToInsrIntRelations(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntRelationsTab")){		
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTabTitle);
		}
	}
	
	public void navigateToInsrIntPayments(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntPaymentsTab")){		
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentsTabTitle);
		}
	}
	
	public void navigateToInsrIntSchedule(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigInsrIntScheduleTab")){		
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTabTitle);
		}
	}
	public void navigateToForwardPolicyInsuredInterestAttribute(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(XcessLoadingDiscDetails);
		}
	}
	public void navigateToSavePolicyInsuredInterestAttribute(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(XcessLoadingDiscDetails);
		}
	}
	public void navigateToBackwardPolicyInsuredInterestAttribute(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigBackwardButton")){		
			click(backwardButton);
			switchToFrame("display");
			isElementDisplayed(mEMBERRiskDetailsTitle);
		}
	}


	public void navigateToBackPolicyInsuredInterestAttribute(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity){
		if (polInsrXssDscPUPerAcdtEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void fillandSubmitPolicyAttributePersonalAccident(PolInsrXssDscPUPerAcdtEntity polInsrXssDscPUPerAcdtEntity, CustomAssert assertReference) {
		if(isConfigTrue(polInsrXssDscPUPerAcdtEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInterestXcessLoadingDiscDetailsPUPersonalAccident(polInsrXssDscPUPerAcdtEntity, assertReference);
			navigateToForwardPolicyInsuredInterestAttribute(polInsrXssDscPUPerAcdtEntity);
			navigateToSavePolicyInsuredInterestAttribute(polInsrXssDscPUPerAcdtEntity);
			navigateToBackwardPolicyInsuredInterestAttribute(polInsrXssDscPUPerAcdtEntity);
			navigateToBackPolicyInsuredInterestAttribute(polInsrXssDscPUPerAcdtEntity);
			navigateToPolicy(polInsrXssDscPUPerAcdtEntity);
			navigateToAttribute(polInsrXssDscPUPerAcdtEntity);
			navigateToInsuredInterest(polInsrXssDscPUPerAcdtEntity);
			navigateToCoverage(polInsrXssDscPUPerAcdtEntity);
			navigateToLoan(polInsrXssDscPUPerAcdtEntity);
			navigateToClientDetails(polInsrXssDscPUPerAcdtEntity);
			navigateToRelation(polInsrXssDscPUPerAcdtEntity);
			navigateToPayment(polInsrXssDscPUPerAcdtEntity);
			navigateToFollowup(polInsrXssDscPUPerAcdtEntity);
			navigateToDocument(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntDetail(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntAttributes(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntAttachCoverages(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntRelations(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntPayments(polInsrXssDscPUPerAcdtEntity);
			navigateToInsrIntSchedule(polInsrXssDscPUPerAcdtEntity);

		}
	}
}

