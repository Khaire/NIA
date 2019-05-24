package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimSpeFeildFireEntity;
import com.aqm.staf.library.databin.ComClaimRiskPropMNLEntity;
import com.aqm.staf.library.databin.PolInsIntVehVaDetMotorEntity;

public class ClaimSpecialFeildsFire extends BasePage {

	//**********3rd PAGE AR(CHINTAN)********** 
	private PageElement	lossPaidForOthersTextField;
	private PageElement	amountOfUnderInsuranceTextField;
	private PageElement	claimHeadDropDown;
	private PageElement	claimSettlmentAmountDueToReductionInTurnOverTextField;
	private PageElement	claimSettlementAmountDueToIncreasedCostOfWorkingTextField;
	private PageElement	claimSettlementAmountDueToAuditorsfeeTextField;
	private PageElement	claimSettlementAmountDueSolicitorsAndProfessionalMensFeeTextField;
	private PageElement	contributionFromOtherPolicyTextField;

	//old
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
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement miscNonT1CLRTitle;
	private PageElement nextPageTitle;
	private PageElement commonClaimRiskPropertyTitle;
	private PageElement claimExcessTextField;
	public ClaimSpecialFeildsFire(WebDriver driver, String pageName){
		super(driver, pageName);
		//**********3rd PAGE AR(CHINTAN)********** 
		lossPaidForOthersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Paid for others')]/following::input"), "Loss Paid for others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfUnderInsuranceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount of Under Insurance')]/following::input"), "Amount of Under Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimHeadDropDown=new PageElement(By.xpath("//td//div[contains(text(),'claim Head')]/following::select"), "claim Head", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimSettlmentAmountDueToReductionInTurnOverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlment amount due to reduction in turn over')]/following::input"), "Claim settlment amount due to reduction in turn over", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmountDueToIncreasedCostOfWorkingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlement amount due to increased cost of working')]/following::input"), "Claim settlement amount due to increased cost of working", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		claimSettlementAmountDueToAuditorsfeeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlement amount due to Auditors fee')]/following::input"), "Claim settlement amount due to Auditors fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmountDueSolicitorsAndProfessionalMensFeeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlement amount  due solicitors and professional mens fee')]/following::input"), "Claim settlement amount due solicitors and professional mens fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contributionFromOtherPolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Contribution from Other Policy')]/following::input"), "Contribution from Other Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//old
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
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		commonClaimRiskPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), " Common Claim Risk Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next1"), "forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Excess')]/following::input"), "Claim Excess Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
	
	public void fillCliamSpecialFeildsFireDetails(ClaimSpeFeildFireEntity  claimSpeFeildFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimSpeFeildFireEntity.getAction().equalsIgnoreCase("add") || claimSpeFeildFireEntity.getAction().equalsIgnoreCase("edit")){
			//**********3rd PAGE AR(CHINTAN)********** 
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigLossPaidForOthers")) {
				clearAndSendKeys(lossPaidForOthersTextField, claimSpeFeildFireEntity.getStringValueForField("LossPaidForOthers"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigAmountOfUnderInsurance")) {
				clearAndSendKeys(amountOfUnderInsuranceTextField, claimSpeFeildFireEntity.getStringValueForField("AmountOfUnderInsurance"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimHead")) {
				selectValueFromList(claimHeadDropDown, claimSpeFeildFireEntity.getStringValueForField("ClaimHead"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlmentAmountDueToReductionInTurnOver")) {
				clearAndSendKeys(claimSettlmentAmountDueToReductionInTurnOverTextField, claimSpeFeildFireEntity.getStringValueForField("ClaimSettlmentAmountDueToReductionInTurnOver"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueToIncreasedCostOfWorking")) {
				clearAndSendKeys(claimSettlementAmountDueToIncreasedCostOfWorkingTextField, claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueToIncreasedCostOfWorking"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueToAuditorsfee")) {
				clearAndSendKeys(claimSettlementAmountDueToAuditorsfeeTextField, claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueToAuditorsfee"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueSolicitorsAndProfessionalMensFee")) {
				clearAndSendKeys(claimSettlementAmountDueSolicitorsAndProfessionalMensFeeTextField, claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueSolicitorsAndProfessionalMensFee"));
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigContributionFromOtherPolicy")) {
				clearAndSendKeys(contributionFromOtherPolicyTextField, claimSpeFeildFireEntity.getStringValueForField("ContributionFromOtherPolicy"));
			}
		}
		else if(claimSpeFeildFireEntity.getAction().equalsIgnoreCase("verify")){
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			
			//**********3rd PAGE AR(CHINTAN)********** 
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigLossPaidForOthers")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("LossPaidForOthers"),fetchValueFromTextFields(lossPaidForOthersTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigAmountOfUnderInsurance")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("AmountOfUnderInsurance"),fetchValueFromTextFields(amountOfUnderInsuranceTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimHead")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimHead"),fetchValueFromList(claimHeadDropDown), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlmentAmountDueToReductionInTurnOver")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimSettlmentAmountDueToReductionInTurnOver"),fetchValueFromTextFields(claimSettlmentAmountDueToReductionInTurnOverTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueToIncreasedCostOfWorking")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueToIncreasedCostOfWorking"),fetchValueFromTextFields(claimSettlementAmountDueToIncreasedCostOfWorkingTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueToAuditorsfee")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueToAuditorsfee"),fetchValueFromTextFields(claimSettlementAmountDueToAuditorsfeeTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimSettlementAmountDueSolicitorsAndProfessionalMensFee")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimSettlementAmountDueSolicitorsAndProfessionalMensFee"),fetchValueFromTextFields(claimSettlementAmountDueSolicitorsAndProfessionalMensFeeTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigContributionFromOtherPolicy")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ContributionFromOtherPolicy"),fetchValueFromTextFields(contributionFromOtherPolicyTextField), AssertionType.WARNING);
			}
			if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimExcess")) {
				assertReference.assertEquals(claimSpeFeildFireEntity.getStringValueForField("ClaimExcess"),fetchValueFromTextFields(claimExcessTextField), AssertionType.WARNING);
			}
		}
	}

	//old
	public void navigateNextToCommonClaimRiskProperty(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimSpeFeildFireEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigatePreviousToCommonClaimRiskProperty(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(miscNonT1CLRTitle);			}
	}	
	public void navigateToMainAttributePage(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimSpeFeildFireEntity claimSpeFeildFireEntity){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimSpeFeildFireEntity claimSpeFeildFireEntity ){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void SubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ClaimSpeFeildFireEntity claimSpeFeildFireEntity ){
		if (claimSpeFeildFireEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimSpeFeildFireEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(nextPageTitle);
		}
	}
	public void fillandSubmitCliamSpecialFeildsFireDetails(ClaimSpeFeildFireEntity claimSpeFeildFireEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimSpeFeildFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillCliamSpecialFeildsFireDetails(claimSpeFeildFireEntity, assertReference);
			navigateNextToCommonClaimRiskProperty(claimSpeFeildFireEntity);
			SubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimSpeFeildFireEntity);
			navigateToMainAttributePage(claimSpeFeildFireEntity);
			navigateToclaimHomePage(claimSpeFeildFireEntity);
			navigateToInsuredItem(claimSpeFeildFireEntity);
			navigateToDocument(claimSpeFeildFireEntity);
			navigateToParties(claimSpeFeildFireEntity);
			navigateToReserve(claimSpeFeildFireEntity);
			navigateToPayment(claimSpeFeildFireEntity);
			navigateToAttribute(claimSpeFeildFireEntity);
			navigateToInsuredItemDetails(claimSpeFeildFireEntity);
			navigateTInsuredItemAttribute(claimSpeFeildFireEntity);


		}
	}
}
