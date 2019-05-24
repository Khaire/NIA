package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimMNT1CLRMNLEntity;
import com.aqm.staf.library.databin.ClaimRiskProT1CLRAviEntity;

import com.aqm.staf.library.databin.PolAttrFireEntity;

public class ClaimRiskPropertyT1CLRAviation extends BasePage {
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
	private PageElement saveButton;
	private PageElement forwardButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement nextPageTitle;
	//digvijay AW,AA,AD,AE,AG,AH,AI,AS,AL,AU,PA,PN,SR
	private PageElement insuredNameTextField;
	private PageElement causeOfLossDamageTextArea;
	private PageElement onConditionsItemsTextField;
	private PageElement bettermentItemsTextField;
	private PageElement overHaulItemTextField;
	private PageElement claimAssessedAmountTextField;
	private PageElement salvageAmountTextField;
	private PageElement whetherTheCertificateOfAirWorthinessWasInForceDropDown;
	private PageElement wasItAScheduledFlightDropDown;
	private PageElement calculatedExcessTextField;
	private PageElement typeOfSettlementDropDown;
	private PageElement specialFeaturesOfClaimTextArea;
	private PageElement isItAInterimSettlementDropDown;
	//private PageElement
	public ClaimRiskPropertyT1CLRAviation(WebDriver driver, String pageName){
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
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//digvijay AW,AA,AD,AE,AG,AH,AI,AS,AL,AU,PA,PN,SR
		insuredNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Insured Name')]/following::input"), "Insured Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossDamageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss/Damage')]/following::textarea"), "Cause of Loss/Damage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		onConditionsItemsTextField=new PageElement(By.xpath("//td//div[contains(text(),'On conditions items')]/following::input"), "On conditions items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bettermentItemsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Betterment items')]/following::input"), "Betterment items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		overHaulItemTextField=new PageElement(By.xpath("//td//div[contains(text(),'Overhaul item')]/following::input"), "Overhaul item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssessedAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim assessed Amount')]/following::input"), "Claim assessed Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		salvageAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Salvage Amount')]/following::input"), "Salvage Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheCertificateOfAirWorthinessWasInForceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the certificate of air worthiness was in force')]/following::select"), "Whether the certificate of air worthiness was in force", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wasItAScheduledFlightDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Was it a scheduled flight')]/following::select"), "Was it a scheduled flight", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		calculatedExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess')]/following::input"), "Calculated Excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfSettlementDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Settlement')]/following::select"), "Type of Settlement", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialFeaturesOfClaimTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special features of Claim')]/following::textarea"), "Special features of Claim", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isItAInterimSettlementDropDown=new PageElement(By.xpath("//td//div[@id='Is it a interim settlement?']/following::select"), "Is it a interim settlement?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillClaimRiskPropertyT1CLRAviation(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskProT1CLRAviEntity.getAction().equalsIgnoreCase("add") || claimRiskProT1CLRAviEntity.getAction().equalsIgnoreCase("edit")){
			//digvijay AW,AA,AD,AE,AG,AH,AI,AS,AL,AU,PA,PN,SR
				
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigCauseOfLossDamage")) {
				clearAndSendKeys(causeOfLossDamageTextArea, claimRiskProT1CLRAviEntity.getStringValueForField("CauseOfLossDamage"));
			}
			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigOnConditionsItems")) {
				clearAndSendKeys(onConditionsItemsTextField, claimRiskProT1CLRAviEntity.getStringValueForField("OnConditionsItems"));
			}		
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigBettermentItems")) {
				clearAndSendKeys(bettermentItemsTextField, claimRiskProT1CLRAviEntity.getStringValueForField("BettermentItems"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigOverHaulItem")) {
				clearAndSendKeys(overHaulItemTextField, claimRiskProT1CLRAviEntity.getStringValueForField("OverHaulItem"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				clearAndSendKeys(claimAssessedAmountTextField, claimRiskProT1CLRAviEntity.getStringValueForField("ClaimAssessedAmount"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				clearAndSendKeys(salvageAmountTextField, claimRiskProT1CLRAviEntity.getStringValueForField("SalvageAmount"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigWhetherTheCertificateOfAirWorthinessWasInForce")) {
				selectValueFromList(whetherTheCertificateOfAirWorthinessWasInForceDropDown, claimRiskProT1CLRAviEntity.getStringValueForField("WhetherTheCertificateOfAirWorthinessWasInForce"));
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigWasItAScheduledFlight")) {
				selectValueFromList(wasItAScheduledFlightDropDown, claimRiskProT1CLRAviEntity.getStringValueForField("WasItAScheduledFlight"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				clearAndSendKeys(calculatedExcessTextField, claimRiskProT1CLRAviEntity.getStringValueForField("CalculatedExcess"));
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigTypeOfSettlement")) {
				selectValueFromList(typeOfSettlementDropDown, claimRiskProT1CLRAviEntity.getStringValueForField("TypeOfSettlement"));
			}		
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaim")) {
				clearAndSendKeys(specialFeaturesOfClaimTextArea, claimRiskProT1CLRAviEntity.getStringValueForField("SpecialFeaturesOfClaim"));
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigIsItAInterimSettlement")) {
				selectValueFromList(isItAInterimSettlementDropDown, claimRiskProT1CLRAviEntity.getStringValueForField("IsItAInterimSettlement"));
			}

		}
		else if(claimRiskProT1CLRAviEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//digvijay AW,AA,AD,AE,AG,AH,AI,AS,AL,AU,PA,PN,SR
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigCauseOfLossDamage")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("CauseOfLossDamage"), fetchValueFromTextFields(causeOfLossDamageTextArea), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigOnConditionsItems")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("OnConditionsItems"), fetchValueFromTextFields(onConditionsItemsTextField), AssertionType.WARNING);
			}		
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigBettermentItems")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("BettermentItems"), fetchValueFromTextFields(bettermentItemsTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigOverHaulItem")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("OverHaulItem"), fetchValueFromTextFields(overHaulItemTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("ClaimAssessedAmount"), fetchValueFromTextFields(claimAssessedAmountTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("SalvageAmount"), fetchValueFromTextFields(salvageAmountTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigWhetherTheCertificateOfAirWorthinessWasInForce")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("WhetherTheCertificateOfAirWorthinessWasInForce"), fetchValueFromList(whetherTheCertificateOfAirWorthinessWasInForceDropDown), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigWasItAScheduledFlight")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("WasItAScheduledFlight"), fetchValueFromList(wasItAScheduledFlightDropDown), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("CalculatedExcess"), fetchValueFromTextFields(calculatedExcessTextField), AssertionType.WARNING);
			}			
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigTypeOfSettlement")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("TypeOfSettlement"), fetchValueFromList(typeOfSettlementDropDown), AssertionType.WARNING);
			}		
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaim")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("SpecialFeaturesOfClaim"), fetchValueFromTextFields(specialFeaturesOfClaimTextArea), AssertionType.WARNING);
			}
			if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigIsItAInterimSettlement")) {
				assertReference.assertEquals(claimRiskProT1CLRAviEntity.getStringValueForField("IsItAInterimSettlement"), fetchValueFromList(isItAInterimSettlementDropDown), AssertionType.WARNING);
			}
		}
	}
	public void proceedToT2CLRForAviationProducts(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}	
	
	public void navigateToMainAttributePage(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	

	public void navigateToclaimHomePage(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity){
		if (claimRiskProT1CLRAviEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimRiskPropertyT1CLRAviation(ClaimRiskProT1CLRAviEntity claimRiskProT1CLRAviEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProT1CLRAviEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskPropertyT1CLRAviation(claimRiskProT1CLRAviEntity, assertReference);
			proceedToT2CLRForAviationProducts(claimRiskProT1CLRAviEntity);
			navigateToMainAttributePage(claimRiskProT1CLRAviEntity);
			navigateToclaimHomePage(claimRiskProT1CLRAviEntity);
			navigateToInsuredItem(claimRiskProT1CLRAviEntity);
			navigateToDocument(claimRiskProT1CLRAviEntity);
			navigateToParties(claimRiskProT1CLRAviEntity);
			navigateToReserve(claimRiskProT1CLRAviEntity);
			navigateToPayment(claimRiskProT1CLRAviEntity);
			navigateToAttribute(claimRiskProT1CLRAviEntity);
			navigateToInsuredItemDetails(claimRiskProT1CLRAviEntity);
			navigateTInsuredItemAttribute(claimRiskProT1CLRAviEntity);
		}
		
	}
}
