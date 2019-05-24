package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttRiskDet1Entity;
import com.aqm.staf.library.databin.PolicyAttributeRuralEntity;
import com.aqm.staf.library.databin.RiskDetails2RuralEntity;

public class RiskDetail2Rural extends BasePage {
	//
	private PageElement	riskDetails2Title;

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
	private PageElement insuredInterestDetailTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestrAttachCoveragesTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentsTitle;
	private PageElement insuredInterestScheduleTitle;

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;	
	//
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
	private PageElement sumInsuredTextField;

	private PageElement areaUnderFloricultureHectareTextField;
	private PageElement areaCoveredForInsuranceHectareTextField;
	private PageElement noOfFlowerPlantsPerHectareTextField;
	private PageElement polyhouseDetailsDropDown;
	private PageElement polyhouseDescriptionTextArea;
	private PageElement detailsOfTheIrrigationSystemTextArea;
	private PageElement sumInsuredRsTextField;
	private PageElement isHOApprovalIsObtainedDropDown;
	private PageElement excessInPercentDropDown;
	private PageElement forwardButton;
	private PageElement saveButton;
	
	private PageElement premiumRatePercentTextField;
	private PageElement controlNumberTextField;

	public RiskDetail2Rural(WebDriver driver, String pageName) {
		super(driver, pageName);
		riskDetails2Title= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Attribute Four Claim Free Years Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areaUnderFloricultureHectareTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Area under floriculture(Hectare)", "input")), "Area under floriculture Hectare", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areaCoveredForInsuranceHectareTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Area Covered for Insurance(Hectare)", "input")), "Area Covered for Insurance Hectare", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfFlowerPlantsPerHectareTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. Of flower plants Per Hectare", "input")), "No. Of flower plants Per Hectare", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		polyhouseDetailsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Polyhouse details","select")), "Polyhouse details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		polyhouseDescriptionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Polyhouse description", "textarea")), "Polyhouse description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfTheIrrigationSystemTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of the irrigation system", "textarea")), "Details of the irrigation system", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured(Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isHOApprovalIsObtainedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is HO Approval is Obtained","select")), "Is HO Approval is Obtained", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessInPercentDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess in (%)","select")), "Excess in (%)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

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
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTitle = new PageElement(By.linkText("Schedule"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured(Rs)", "input")), "Sum Insured Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumRatePercentTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate (%)", "input")), "Premium Rate (%) Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		controlNumberTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Control Number", "input")), "Control Number Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}
	
	
	public void fillRiskDetailsRural(RiskDetails2RuralEntity riskDetails2RuralEntity, CustomAssert assertReference){
		if(riskDetails2RuralEntity.getAction().equalsIgnoreCase("add") || riskDetails2RuralEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigAreaUnderFloricultureHectare")) {
				clearAndSendKeys(areaUnderFloricultureHectareTextField, riskDetails2RuralEntity.getStringValueForField("AreaUnderFloricultureHectare"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigAreaCoveredForInsuranceHectare")) {
				clearAndSendKeys(areaCoveredForInsuranceHectareTextField, riskDetails2RuralEntity.getStringValueForField("AreaCoveredForInsuranceHectare"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigNoOfFlowerPlantsPerHectare")) {
				clearAndSendKeys(noOfFlowerPlantsPerHectareTextField, riskDetails2RuralEntity.getStringValueForField("NoOfFlowerPlantsPerHectare"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPolyhouseDetails")) {
				selectValueFromList(polyhouseDetailsDropDown, riskDetails2RuralEntity.getStringValueForField("PolyhouseDetails"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPolyhouseDescription")) {
				clearAndSendKeys(polyhouseDescriptionTextArea, riskDetails2RuralEntity.getStringValueForField("PolyhouseDescription"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigDetailsOfTheIrrigationSystem")) {
				clearAndSendKeys(detailsOfTheIrrigationSystemTextArea, riskDetails2RuralEntity.getStringValueForField("DetailsOfTheIrrigationSystem"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				clearAndSendKeys(sumInsuredRsTextField, riskDetails2RuralEntity.getStringValueForField("SumInsuredRs"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				selectValueFromList(isHOApprovalIsObtainedDropDown, riskDetails2RuralEntity.getStringValueForField("IsHOApprovalIsObtained"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigControlNumber")) {
				clearAndSendKeys(controlNumberTextField, riskDetails2RuralEntity.getStringValueForField("ControlNumber"));
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigExcessInPercent")) {
				selectValueFromList(excessInPercentDropDown, riskDetails2RuralEntity.getStringValueForField("ExcessInPercent"));
			}
		}

		else if(riskDetails2RuralEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigAreaUnderFloricultureHectare")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("AreaUnderFloricultureHectare"), fetchValueFromTextFields(areaUnderFloricultureHectareTextField), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigAreaCoveredForInsuranceHectare")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("AreaCoveredForInsuranceHectare"), fetchValueFromTextFields(areaCoveredForInsuranceHectareTextField), AssertionType.WARNING);
			}
			if(riskDetails2RuralEntity.getBooleanValueForField("ConfigNoOfFlowerPlantsPerHectare")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("NoOfFlowerPlantsPerHectare"), fetchValueFromTextFields(noOfFlowerPlantsPerHectareTextField), AssertionType.WARNING);
			}
			if(riskDetails2RuralEntity.getBooleanValueForField("ConfigPolyhouseDetails")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("PolyhouseDetails"), fetchValueFromList(polyhouseDetailsDropDown), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPolyhouseDescription")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("PolyhouseDescription"), fetchValueFromTextFields(polyhouseDescriptionTextArea), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigDetailsOfTheIrrigationSystem")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("DetailsOfTheIrrigationSystem"), fetchValueFromTextFields(detailsOfTheIrrigationSystemTextArea), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("IsHOApprovalIsObtained"), fetchValueFromList(isHOApprovalIsObtainedDropDown), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPremiumRatePercent")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("PremiumRatePercent"), fetchValueFromTextFields(premiumRatePercentTextField), AssertionType.WARNING);
			}
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigControlNumber")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("ControlNumber"), fetchValueFromTextFields(controlNumberTextField), AssertionType.WARNING);
			}			
			if (riskDetails2RuralEntity.getBooleanValueForField("ConfigExcessInPercent")) {
				assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("ExcessInPercent"), fetchValueFromTextFields(excessInPercentDropDown), AssertionType.WARNING);
			}
		}
	}





	public void navigateToPolicy(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void navigateToClientDetails(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToforwardRiskDetails(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void navigateTosaveRiskDetails(RiskDetails2RuralEntity riskDetails2RuralEntity){
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	private void fillSIforCalf(RiskDetails2RuralEntity riskDetails2RuralEntity,CustomAssert assertReference) {
		if (riskDetails2RuralEntity.getBooleanValueForField("ConfigForCalf")){	
			if(riskDetails2RuralEntity.getAction().equalsIgnoreCase("add") || riskDetails2RuralEntity.getAction().equalsIgnoreCase("edit")){
				click(forwardButton);
				click(saveButton);
			}
			else if(riskDetails2RuralEntity.getAction().equalsIgnoreCase("verify")){
				if (riskDetails2RuralEntity.getBooleanValueForField("ConfigSumInsuredForCalf")) {
					assertReference.assertEquals(riskDetails2RuralEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
				}
			}
		}
	}
	public void fillandsubmitRiskDetailsRural(RiskDetails2RuralEntity riskDetails2RuralEntity, CustomAssert assertReference) {
		if(isConfigTrue(riskDetails2RuralEntity.getConfigExecute())){
			switchToFrame("display");
			fillRiskDetailsRural(riskDetails2RuralEntity, assertReference);
			fillSIforCalf(riskDetails2RuralEntity, assertReference);
			navigateToforwardRiskDetails(riskDetails2RuralEntity);
			navigateTosaveRiskDetails(riskDetails2RuralEntity);
			navigateToPolicy(riskDetails2RuralEntity);
			navigateToAttribute(riskDetails2RuralEntity);
			navigateToInsuredInterest(riskDetails2RuralEntity);
			navigateToCoverage(riskDetails2RuralEntity);
			navigateToLoan(riskDetails2RuralEntity);
			navigateToClientDetails(riskDetails2RuralEntity);
			navigateToRelation(riskDetails2RuralEntity);
			navigateToPayment(riskDetails2RuralEntity);
			navigateToFollowup(riskDetails2RuralEntity);
			navigateToDocument(riskDetails2RuralEntity);
		}
	}
}

