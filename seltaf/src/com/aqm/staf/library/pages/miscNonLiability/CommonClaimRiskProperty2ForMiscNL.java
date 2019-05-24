package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ComClRiskProp2MNLEntity;

public class CommonClaimRiskProperty2ForMiscNL extends BasePage{

	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement claimDropDown;
	private PageElement totalAssessedLossAmountTextField;
	private PageElement isUnderlnsuranceApplicableDropDown;
	private PageElement excessTextField;
	private PageElement netClaimAmountTextField;
	private PageElement reasonForReopenDropDown;
	private PageElement districtStateNationalDropDown;
	private PageElement districtCourtSupremeCourtHighCourtSLPDropDown;
	private PageElement underInsuranceTypeDropDown;
	private PageElement underInsuranceAmountTextField;
	private PageElement claimLossAfterUnderInsuranceTextField;
	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement deductibleTextField;
	private PageElement imposedExcessDeductibleTextField;

	public CommonClaimRiskProperty2ForMiscNL(WebDriver driver, String pageName) {
		super(driver, pageName);

		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Serial No")), "Insured  Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Item Code")), "Insured Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalAssessedLossAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Assessed Loss Amount", "input")), "Total Assessed Loss Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isUnderlnsuranceApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ls Under lnsurance Applicable", "select")), "ls Under lnsurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Net Claim Amount", "input")), "Net Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForReopenDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason For Reopen", "select")), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtStateNationalDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National", "select")), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtCourtSupremeCourtHighCourtSLPDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP", "select")), "District Court/Supreme Court/High Court/SLP DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Insurance Type", "select")), "Under Insurance Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance amount", "input")), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimLossAfterUnderInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Loss After Under Insurance", "input")), "Claim Loss After Under Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deductibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("deductible", "input")), "deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		imposedExcessDeductibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Imposed Excess (Deductible)", "input")), "Imposed Excess (Deductible) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillCommonClaimRiskProperty2ForMiscNLDetails(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity, CustomAssert assertReference) throws InterruptedException{

		if(comClRisk2PropMNLEntity.getBooleanValueForField("ConfigPrimaryInformation")){

			if(comClRisk2PropMNLEntity.getAction().equalsIgnoreCase("add") || comClRisk2PropMNLEntity.getAction().equalsIgnoreCase("edit")){

				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropDown, comClRisk2PropMNLEntity.getStringValueForField("Claim"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					clearAndSendKeys(totalAssessedLossAmountTextField, comClRisk2PropMNLEntity.getStringValueForField("TotalAssessedLossAmount"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					selectValueFromList(isUnderlnsuranceApplicableDropDown, comClRisk2PropMNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigExcess")) {
					clearAndSendKeys(excessTextField, comClRisk2PropMNLEntity.getStringValueForField("Excess"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					clearAndSendKeys(netClaimAmountTextField, comClRisk2PropMNLEntity.getStringValueForField("NetClaimAmount"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropDown, comClRisk2PropMNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					selectValueFromList(districtStateNationalDropDown, comClRisk2PropMNLEntity.getStringValueForField("DistrictStateNational"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					selectValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown, comClRisk2PropMNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					selectValueFromList(underInsuranceTypeDropDown, comClRisk2PropMNLEntity.getStringValueForField("UnderInsuranceType"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					clearAndSendKeys(underInsuranceAmountTextField, comClRisk2PropMNLEntity.getStringValueForField("UnderInsuranceAmount"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					clearAndSendKeys(claimLossAfterUnderInsuranceTextField, comClRisk2PropMNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDeductible")) {
					clearAndSendKeys(deductibleTextField, comClRisk2PropMNLEntity.getStringValueForField("Deductible"));
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigImposedExcessDeductible")) {
					clearAndSendKeys(imposedExcessDeductibleTextField, comClRisk2PropMNLEntity.getStringValueForField("ImposedExcessDeductible"));
				}
			}
			else if(comClRisk2PropMNLEntity.getAction().equalsIgnoreCase("verify")){

				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(comClRisk2PropMNLEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("TotalAssessedLossAmount"),fetchValueFromTextFields(totalAssessedLossAmountTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"),fetchValueFromList(isUnderlnsuranceApplicableDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("NetClaimAmount"),fetchValueFromTextFields(netClaimAmountTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ReasonForReopen"),fetchValueFromList(reasonForReopenDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("DistrictStateNational"),fetchValueFromList(districtStateNationalDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"),fetchValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("UnderInsuranceType"),fetchValueFromList(underInsuranceTypeDropDown), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("UnderInsuranceAmount"),fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"),fetchValueFromTextFields(claimLossAfterUnderInsuranceTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDeductible")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("Deductible"),fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
				}
				if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigImposedExcessDeductible")) {
					assertReference.assertEquals(comClRisk2PropMNLEntity.getStringValueForField("ImposedExcessDeductible"),fetchValueFromTextFields(imposedExcessDeductibleTextField), AssertionType.WARNING);
				}
			}
		}
	}
	public void navigateNextToCommonClaimRiskProperty(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+comClRisk2PropMNLEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigatePreviousToCommonClaimRiskProperty(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}	
	}
	public void navigateToMainAttributePage(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void SubmitCommonClaimRiskProperty2ForMiscNLDetails(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity){
		if (comClRisk2PropMNLEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(ComClRiskProp2MNLEntity comClRisk2PropMNLEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(comClRisk2PropMNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillCommonClaimRiskProperty2ForMiscNLDetails(comClRisk2PropMNLEntity, assertReference);
			navigateNextToCommonClaimRiskProperty(comClRisk2PropMNLEntity);
			SubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRisk2PropMNLEntity);
			navigateToMainAttributePage(comClRisk2PropMNLEntity);
			navigateToclaimHomePage(comClRisk2PropMNLEntity);
			navigateToInsuredItem(comClRisk2PropMNLEntity);
			navigateToDocument(comClRisk2PropMNLEntity);
			navigateToParties(comClRisk2PropMNLEntity);
			navigateToReserve(comClRisk2PropMNLEntity);
			navigateToPayment(comClRisk2PropMNLEntity);
			navigateToAttribute(comClRisk2PropMNLEntity);
			navigateToInsuredItemDetails(comClRisk2PropMNLEntity);
			navigateTInsuredItemAttribute(comClRisk2PropMNLEntity);
		}
	}
}

