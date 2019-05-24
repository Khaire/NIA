package com.aqm.staf.library.pages.creditShield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimInsrRiskDetils2CSEntity;

public class ClaimInsuredItemClaimRiskDetails2CreditShield extends BasePage {

	private PageElement cdClaimRiskDetails2Title;

	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributesTab;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel; 
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement applicableEventCodeLabel;

	private PageElement maximumTermsOfPaymentTextField;
	private PageElement agreedPaymentTermsTextField;
	private PageElement securityHeldTextArea;
	private PageElement securityAmountTextField;
	private PageElement creditLimitApprovedTextField;
	private PageElement validityLimitFromDateTextField;
	private PageElement validityLimitToDateTextField;
	private PageElement conditionsForPermanentLimitTextArea;
	private PageElement discretionaryCreditLimitTextField;
	private PageElement discretionaryCreditLimitDCLForTheSpecifiedBuyerTextField;
	private PageElement temporaryLimitApprovedTextField;
	private PageElement temporaryValidityLimitFromDateTextField;
	private PageElement temporaryValidityLimitToDateTextField;
	private PageElement conditionsForTemporaryLimitTextArea;
	private PageElement insuredForDclBuyerTextField;
	private PageElement insuredForCLBuyerTextField;
	private PageElement typeOfDeductibleTextField;
	private PageElement deductibleAmountTextField;
	private PageElement annualAggregateDeductibleTextField;
	private PageElement optionForMaximumLiabilityTextField;
	private PageElement maximumLiabilityTextField;
	private PageElement recoveryMadeTextField;
	private PageElement salvageMadeTextField;
	private PageElement costToBeDeductedTextField;
	private PageElement grossClaimAmountTextField;
	private PageElement recoveriesMadeDuringWaitingPeriodTextField;

	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributesTabTitle;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement saveButton;
	
	private PageElement claimRiskDetails1Title;
	private PageElement claimInsuredPropertyTitle;
	
	// Product for CE Claim Risk Details 1
	private PageElement ceClaimRiskDetails1Title;
	
	
	public ClaimInsuredItemClaimRiskDetails2CreditShield(WebDriver driver, String pageName) 
	{
		super(driver, pageName);

		cdClaimRiskDetails2Title = new PageElement(By.xpath("//div//b[contains(text(),'CD Claim Risk Details 2')]"), "CD Claim Risk Details 2 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTab = new PageElement(By.xpath("//a[@title='Claim']"),"Claim Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTab = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a[@title='Document']"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.linkText("Parties"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.linkText("Reserve"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.linkText("Payment"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.linkText("Attributes"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.linkText("Details"), "Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredItemAttributesTab = new PageElement(By.xpath("//a[@title='Insured Properties']"), "Attributes Tab", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'number')]/following::td"), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Policy')]/following::td"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Date')]/following::td"), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Status')]/following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Product Code')]/following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Cause Of Loss')]/following::td"), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Serial No')]/following::td"), "Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel = new PageElement(By.xpath("//form[@name='S0201']//td//div//b[contains(text(),'Insured Item Code')]/following::td"), "Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTabTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Claim Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"),"Claim Insured Item Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"),"Claim Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"),"Claim Parties Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"),"Claim Reserve Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		paymentTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"),"Claim Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		attributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured InterestDamage Detail')]"),"Claim Insured Item Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemAttributesTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"),"Claim Insured Item Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		applicableEventCodeLabel=new PageElement(By.xpath("//form[@name='S0201']//tr//td//b[contains(text(),'Applicable Event Code')]/following::td"),"Applicable Event Code Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		maximumTermsOfPaymentTextField =new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Maximum Terms of payment (Days)')]/following::input"),"Maximum Terms of payment (Days) Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		agreedPaymentTermsTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Agreed Payment Terms (days)')]/following::input"),"Agreed Payment Terms (days) Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		securityHeldTextArea=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Security Held')]/following::textArea"),"Security Held Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		securityAmountTextField= new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Security Amount')]/following::input"),"Maximum Terms of payment (Days) Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		creditLimitApprovedTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Credit limit Approved')]/following::input"),"Credit limit Approved Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		validityLimitFromDateTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Validity limit FROM date')]/following::input"),"Validity limit FROM date Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		validityLimitToDateTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Validity limit TO date')]/following::input"),"Validity limit TO date Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		conditionsForPermanentLimitTextArea=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Conditions for Permanent Limit')]/following::textArea"),"Conditions for Permanent Limit Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		discretionaryCreditLimitTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Discretionary Credit Limit (DCL)')]/following::input"),"Discretionary Credit Limit (DCL)  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		discretionaryCreditLimitDCLForTheSpecifiedBuyerTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Discretionary Credit Limit (DCL) for the specified Buyer')]/following::input"),"Discretionary Credit Limit (DCL) for the specified Buyer  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		temporaryLimitApprovedTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Temporary limit approved')]/following::input"),"Temporary limit approved Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		temporaryValidityLimitFromDateTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Temporary validity limit FROM date')]/following::input"),"Temporary validity limit FROM date Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		temporaryValidityLimitToDateTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Temporary validity limit TO date')]/following::input"),"Temporary validity limit TO date Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		conditionsForTemporaryLimitTextArea=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Conditions for Temporary Limit')]/following::textArea"),"Conditions for Temporary Limit Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredForDclBuyerTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Insured (%) for DCL Buyer')]/following::input"),"Insured (%) for DCL Buyer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredForCLBuyerTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Insured (%) for CL Buyer')]/following::input"),"Insured (%) for CL Buyer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		typeOfDeductibleTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Type of Deductible')]/following::input"),"Type of Deductible Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		deductibleAmountTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Deductible Amount')]/following::input"),"Deductible Amount Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		annualAggregateDeductibleTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Annual Aggregate Deductible')]/following::input"),"Annual Aggregate Deductible Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		optionForMaximumLiabilityTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Option for Maximum liability')]/following::input"),"Option for Maximum liability Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		maximumLiabilityTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Maximum Liability')]/following::input"),"Maximum Liability Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		recoveryMadeTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Recovery Made')]/following::input"),"Recovery Made  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		salvageMadeTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Salvage Made')]/following::input"),"Salvage Made  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		costToBeDeductedTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Cost to be Deducted')]/following::input"),"Cost to be Deducted Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		grossClaimAmountTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Gross Claim Amount')]/following::input"),"Gross Claim Amount Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		recoveriesMadeDuringWaitingPeriodTextField=new PageElement(By.xpath("//form[@name='S0201']//tr//td//div[contains(text(),'Recoveries made during waiting period')]/following::input"),"Recoveries made during waiting period  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton=new PageElement(By.name("Previous"), "Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'Claim Risk Details 1')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		// Product for CE Claim Risk Details 1
		ceClaimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'CE Claim Risk Details 1')]"), "CE Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	}

	public void fillClaimInsuredItemClaimRiskDetails2CreditShield(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity, CustomAssert assertReference)throws InterruptedException{
		if(claimInsrRiskDetils2CSEntity.getAction().equalsIgnoreCase("add") || claimInsrRiskDetils2CSEntity.getAction().equalsIgnoreCase("edit")){
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigMaximumTermsOfPayment")) {
				clearAndSendKeys(maximumTermsOfPaymentTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("MaximumTermsOfPayment"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigAgreedPaymentTerms")) {
				clearAndSendKeys(agreedPaymentTermsTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("AgreedPaymentTerms"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSecurityHeld")) {
				clearAndSendKeys(securityHeldTextArea, claimInsrRiskDetils2CSEntity.getStringValueForField("SecurityHeld"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSecurityAmount")) {
				clearAndSendKeys(securityAmountTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("SecurityAmount"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigCreditLimitApproved")) {
				clearAndSendKeys(creditLimitApprovedTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("CreditLimitApproved"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigValidityLimitFromDate")) {
				clearAndSendKeys(validityLimitFromDateTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("ValidityLimitFromDate"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigValidityLimitToDate")) {
				clearAndSendKeys(validityLimitToDateTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("ValidityLimitToDate"));
			}
			/*if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigConditionsForPermanentLimit")) {
				clearAndSendKeys(conditionsForPermanentLimitTextArea, claimInsrRiskDetils2CSEntity.getStringValueForField("ConditionsForPermanentLimit"));
			}*/
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				clearAndSendKeys(discretionaryCreditLimitTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("DiscretionaryCreditLimit"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimitDCLForTheSpecifiedBuyer")) {
				clearAndSendKeys(discretionaryCreditLimitDCLForTheSpecifiedBuyerTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("DiscretionaryCreditLimitDCLForTheSpecifiedBuyer"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryLimitApproved")) {
				clearAndSendKeys(temporaryLimitApprovedTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryLimitApproved"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDate")) {
				clearAndSendKeys(temporaryValidityLimitFromDateTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryValidityLimitFromDate"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDate")) {
				clearAndSendKeys(temporaryValidityLimitToDateTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryValidityLimitToDate"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigConditionsForTemporaryLimit")) {
				clearAndSendKeys(conditionsForTemporaryLimitTextArea, claimInsrRiskDetils2CSEntity.getStringValueForField("ConditionsForTemporaryLimit"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredForDclBuyer")) {
				clearAndSendKeys(insuredForDclBuyerTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredForDclBuyer"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredForCLBuyer")) {
				clearAndSendKeys(insuredForCLBuyerTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredForCLBuyer"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTypeOfDeductible")) {
				clearAndSendKeys(typeOfDeductibleTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("TypeOfDeductible"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				clearAndSendKeys(deductibleAmountTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("DeductibleAmount"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				clearAndSendKeys(annualAggregateDeductibleTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("AnnualAggregateDeductible"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigOptionForMaximumLiability")) {
				clearAndSendKeys(optionForMaximumLiabilityTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("OptionForMaximumLiability"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				clearAndSendKeys(maximumLiabilityTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("MaximumLiability"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigRecoveryMade")) {
				clearAndSendKeys(recoveryMadeTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("RecoveryMade"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSalvageMade")) {
				clearAndSendKeys(salvageMadeTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("SalvageMade"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigCostToBeDeducted")) {
				clearAndSendKeys(costToBeDeductedTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("CostToBeDeducted"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigGrossClaimAmount")) {
				clearAndSendKeys(grossClaimAmountTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("GrossClaimAmount"));
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigRecoveriesMadeDuringWaitingPeriod")) {
				clearAndSendKeys(recoveriesMadeDuringWaitingPeriodTextField, claimInsrRiskDetils2CSEntity.getStringValueForField("RecoveriesMadeDuringWaitingPeriod"));
			}

		}
		else if(claimInsrRiskDetils2CSEntity.getAction().equalsIgnoreCase("verify")){

			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("Status"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//

			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigMaximumTermsOfPayment")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("MaximumTermsOfPayment"),fetchValueFromTextFields(maximumTermsOfPaymentTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigAgreedPaymentTerms")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("AgreedPaymentTerms"),fetchValueFromTextFields(agreedPaymentTermsTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSecurityHeld")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("SecurityHeld"),fetchValueFromTextFields(securityHeldTextArea), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSecurityAmount")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("SecurityAmount"),fetchValueFromTextFields(securityAmountTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigCreditLimitApproved")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("CreditLimitApproved"),fetchValueFromTextFields(creditLimitApprovedTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigValidityLimitFromDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimInsrRiskDetils2CSEntity.getStringValueForField("ValidityLimitFromDate")) ,fetchValueFromTextFields(validityLimitFromDateTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigValidityLimitToDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimInsrRiskDetils2CSEntity.getStringValueForField("ValidityLimitToDate")) ,fetchValueFromTextFields(validityLimitToDateTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigConditionsForPermanentLimit")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ConditionsForPermanentLimit"),fetchValueFromTextFields(conditionsForPermanentLimitTextArea), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimit")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("DiscretionaryCreditLimit"),fetchValueFromTextFields(discretionaryCreditLimitTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDiscretionaryCreditLimitDCLForTheSpecifiedBuyer")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("DiscretionaryCreditLimitDCLForTheSpecifiedBuyer"),fetchValueFromTextFields(discretionaryCreditLimitDCLForTheSpecifiedBuyerTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryLimitApproved")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryLimitApproved"),fetchValueFromTextFields(temporaryLimitApprovedTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryValidityLimitFromDate")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryValidityLimitFromDate"),fetchValueFromTextFields(temporaryValidityLimitFromDateTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTemporaryValidityLimitToDate")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("TemporaryValidityLimitToDate"),fetchValueFromTextFields(temporaryValidityLimitToDateTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigConditionsForTemporaryLimit")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("ConditionsForTemporaryLimit"),fetchValueFromTextFields(conditionsForTemporaryLimitTextArea), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredForDclBuyer")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredForDclBuyer"),fetchValueFromTextFields(insuredForDclBuyerTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredForCLBuyer")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredForCLBuyer"),fetchValueFromTextFields(insuredForCLBuyerTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigTypeOfDeductible")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("TypeOfDeductible"),fetchValueFromTextFields(typeOfDeductibleTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDeductibleAmount")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("DeductibleAmount"),fetchValueFromTextFields(deductibleAmountTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigAnnualAggregateDeductible")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("AnnualAggregateDeductible"),fetchValueFromTextFields(annualAggregateDeductibleTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigOptionForMaximumLiability")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("OptionForMaximumLiability"),fetchValueFromTextFields(optionForMaximumLiabilityTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigMaximumLiability")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("MaximumLiability"),fetchValueFromTextFields(maximumLiabilityTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigRecoveryMade")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("RecoveryMade"),fetchValueFromTextFields(recoveryMadeTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSalvageMade")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("SalvageMade"),fetchValueFromTextFields(salvageMadeTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigCostToBeDeducted")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("CostToBeDeducted"),fetchValueFromTextFields(costToBeDeductedTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigGrossClaimAmount")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("GrossClaimAmount"),fetchValueFromTextFields(grossClaimAmountTextField), AssertionType.WARNING);
			}
			if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigRecoveriesMadeDuringWaitingPeriod")) {
				assertReference.assertEquals(claimInsrRiskDetils2CSEntity.getStringValueForField("RecoveriesMadeDuringWaitingPeriod"),fetchValueFromTextFields(recoveriesMadeDuringWaitingPeriodTextField), AssertionType.WARNING);
			}

		}
	}

			public void navigateToClaimHomePage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigClaimTab")) {
					click(claimTab);
					switchToFrame("display");
					isElementDisplayed(claimTabTitle);

				}
			}
			public void navigateToInsuredItemPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredItemTab")) {
					click(insuredItemTab);
					switchToFrame("display");
					isElementDisplayed(insuredItemTabTitle);

				}
			}
			public void navigateToDocumentPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigDocumentTab")) {
					click(documentTab);
					switchToFrame("display");
					isElementDisplayed(documentTabTitle);

				}
			}
			public void navigateToPartiesPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigPartiesTab")) {
					click(partiesTab);
					switchToFrame("display");
					isElementDisplayed(partiesTabTitle);
				}
			}
			public void navigateToReservePage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigReserveTab")) {
					click(reserveTab);
					switchToFrame("display");
					isElementDisplayed(reserveTabTitle);
				}
			}
			public void navigateToPaymentPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigPaymentTab")) {
					click(paymentTab);
					switchToFrame("display");
					isElementDisplayed(paymentTabTitle);
				}
			}
			public void navigateToAttributesPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigAttributesTab")) {
					click(attributesTab);
					switchToFrame("display");
					isElementDisplayed(attributesTabTitle);
				}
			}
			public void navigateToInsuredItemDetailsPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")) {
					click(insuredItemDetailsTab);
					switchToFrame("display");
					isElementDisplayed(insuredItemDetailsTabTitle);
				}
			}
			public void navigateToInsuredItemAttributesPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigInsuredItemAttributesTab")) {
					click(insuredItemAttributesTab);
					switchToFrame("display");
					isElementDisplayed(insuredItemAttributesTabTitle);
				}
			}
			public void navigateToForwardClaimInsuredItemPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigForwardButton")) {
					click(forwardButton);
				}
			}
			public void navigateToSaveClaimInsuredItemPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigSaveButton")) {
					click(saveButton);
					switchToFrame("display");
				}
			}
			public void navigateToBackwardClaimInsuredItemPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigBackwardButton")) {
					click(backwardButton);
					claimRiskDetails1Title= new PageElement(By.xpath("//div//b[contains(text(),'"+claimInsrRiskDetils2CSEntity.getStringValueForField("InsuredItemAttributesPageTitle")+"')]"), "Claim Risk Details 1 Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					switchToFrame("display");
					isElementDisplayed(claimRiskDetails1Title);
					
					}
				}
			public void navigateToBackClaimInsuredItemPage(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity){
				if (claimInsrRiskDetils2CSEntity.getBooleanValueForField("ConfigBackButton")) {
					click(backButton);
					switchToFrame("display");
					isElementDisplayed(claimInsuredPropertyTitle);
				}
			}

			public void fillAndSubmitClaimInsuredItemClaimRiskDetails2CreditShield(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntity, CustomAssert assertReference)throws InterruptedException{
				if (isConfigTrue(claimInsrRiskDetils2CSEntity.getConfigExecute())){
					switchToFrame("display");
					fillClaimInsuredItemClaimRiskDetails2CreditShield(claimInsrRiskDetils2CSEntity, assertReference);
					navigateToForwardClaimInsuredItemPage(claimInsrRiskDetils2CSEntity);
					navigateToSaveClaimInsuredItemPage(claimInsrRiskDetils2CSEntity);
					navigateToBackwardClaimInsuredItemPage(claimInsrRiskDetils2CSEntity);
					navigateToBackClaimInsuredItemPage(claimInsrRiskDetils2CSEntity);
					navigateToClaimHomePage(claimInsrRiskDetils2CSEntity);
					navigateToInsuredItemPage(claimInsrRiskDetils2CSEntity);
					navigateToDocumentPage(claimInsrRiskDetils2CSEntity);
					navigateToPartiesPage(claimInsrRiskDetils2CSEntity);
					navigateToReservePage(claimInsrRiskDetils2CSEntity);
					navigateToPaymentPage(claimInsrRiskDetils2CSEntity);
					navigateToAttributesPage(claimInsrRiskDetils2CSEntity);
					navigateToInsuredItemDetailsPage(claimInsrRiskDetils2CSEntity);
					navigateToInsuredItemAttributesPage(claimInsrRiskDetils2CSEntity);
									
				}
			}
		}
