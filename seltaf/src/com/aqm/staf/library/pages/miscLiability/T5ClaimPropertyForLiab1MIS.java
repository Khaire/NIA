package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.T4ClaimPropLiab1MISEntity;
import com.aqm.staf.library.databin.T5ClaimPropLiab1MISEntity;

public class T5ClaimPropertyForLiab1MIS extends BasePage {


	private PageElement assessedAmountOfLossTextBox;
	private PageElement calculatedExcesTextBoxs;
	private PageElement claimSettlementAmountTextBox;
	private PageElement typeOfSettlementDropDown;
	private PageElement percentageOfClaimSettlementAmountTextBox;
	private PageElement finalClaimSettledAmountTextBox;
	private PageElement eventCodeTextBox ;

	//old
	private PageElement claimTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemTab;
	private PageElement insuredAttributeTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement claimNumberLabel;		
	private PageElement policyNumberLabel;	
	private PageElement claimDateLabel;	
	private PageElement claimStatusLabel;	
	private PageElement productCodeLabel;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement nextPageTitle;
	private PageElement  insuredSerialNoLabel;
	private PageElement  insuredCodeLabel;
	private PageElement  applicableEventCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement causeOfLossLabel;


	//************NEW POLICY***************

	private PageElement nIAIsLeaderInCoInsuranceSoDropDown;	

	//WC
	private PageElement saveButton;
	//PK
	private PageElement estimatedAmountofLossTextBox;

	public T5ClaimPropertyForLiab1MIS(WebDriver driver, String pageName) {
		super(driver, pageName);

		assessedAmountOfLossTextBox=new PageElement(By.xpath("//td/div[contains(text(),' Assessed Amount of Loss')]/following::input"), " Assessed Amount of Loss", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedExcesTextBoxs=new PageElement(By.xpath("//td/div[contains(text(),'Calculated Excess')]/following::input"), "Calculated Excess'", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmountTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Claim Settlement Amount')]/following::input"), "Claim Settlement Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfSettlementDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Settlement')]/following::select"), "Type of Settlement", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		percentageOfClaimSettlementAmountTextBox=new PageElement(By.xpath("//td/div[contains(text(),'(%) of Claim Settlement Amount')]/following::input"), "(%) of Claim Settlement Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		finalClaimSettledAmountTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Final Claim Settled Amount')]/following::input"), "Final Claim Settled Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventCodeTextBox =new PageElement(By.xpath("//td/div[contains(text(),'Event Code ')]/following::input"), "Event Code ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//old
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured InterestDamage",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Serial No")), "Insured Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")), "Insured Item Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//*****************NEW POLICY**************
		nIAIsLeaderInCoInsuranceSoDropDown=new PageElement(By.xpath("//td/div[contains(text(),'NIA is Leader in Co Insurance. So..')]/following::select"), "NIA is Leader in Co Insurance. So..", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//WC
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//PK
		estimatedAmountofLossTextBox=new PageElement(By.xpath("//td/div[contains(text(),'Estimated Amount of Loss')]/following::input"), "Estimated Amount of Loss TextBox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillT5ClaimPropertyForLiab1MISDetails(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity, CustomAssert assertReference) throws InterruptedException{

		if(t5ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("add") || t5ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("edit")){

			//slot1
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				clearAndSendKeys(calculatedExcesTextBoxs, t5ClaimPropLiab1MISEntity.getStringValueForField("CalculatedExcess"));
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigAssessedAmountOfLoss")) {
				clearAndSendKeys(assessedAmountOfLossTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("AssessedAmountOfLoss"));
			}

			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimSettlementAmount")) {
				clearAndSendKeys(claimSettlementAmountTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimSettlementAmount"));
			}

			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigTypeOfSettlement")) {
				selectValueFromList(typeOfSettlementDropDown, t5ClaimPropLiab1MISEntity.getStringValueForField("TypeOfSettlement"));
			}

			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigFinalClaimSettledAmount")) {
				clearAndSendKeys(finalClaimSettledAmountTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("FinalClaimSettledAmount"));
			}

			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderpercentageOfClaimSettlementAmount")) {
				clearAndSendKeys(percentageOfClaimSettlementAmountTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("UnderpercentageOfClaimSettlementAmount"));
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigEventCode")) {
				clearAndSendKeys(eventCodeTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("EventCode"));
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigNIAIsLeaderInCoInsuranceSo")) {
				clearAndSendKeys(nIAIsLeaderInCoInsuranceSoDropDown, t5ClaimPropLiab1MISEntity.getStringValueForField("NIAIsLeaderInCoInsuranceSo"));
			}
			//PK
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigEstimatedAmountofLoss")) {
				clearAndSendKeys(estimatedAmountofLossTextBox, t5ClaimPropLiab1MISEntity.getStringValueForField("EstimatedAmountofLoss"));
			}
		}
		else if(t5ClaimPropLiab1MISEntity.getAction().equalsIgnoreCase("verify")){
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigAssessedAmountOfLoss")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("AssessedAmountOfLoss"), fetchValueFromTextFields(assessedAmountOfLossTextBox), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("CalculatedExcess"), fetchValueFromTextFields(calculatedExcesTextBoxs), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimSettlementAmount")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimSettlementAmount"), fetchValueFromTextFields(claimSettlementAmountTextBox), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfiTypeOfSettlement")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("TypeOfSettlement"), fetchValueFromList(typeOfSettlementDropDown), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigFinalClaimSettledAmount")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("FinalClaimSettledAmount"), fetchValueFromTextFields(finalClaimSettledAmountTextBox), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigUnderpercentageOfClaimSettlementAmount")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("UnderpercentageOfClaimSettlementAmount"), fetchValueFromTextFields(percentageOfClaimSettlementAmountTextBox), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigEventCode")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("EventCode"), fetchValueFromTextFields(eventCodeTextBox), AssertionType.WARNING);
			}
			//************NEW POLICY**********
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigNIAIsLeaderInCoInsuranceSo")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("NIAIsLeaderInCoInsuranceSo"),fetchValueFromList(nIAIsLeaderInCoInsuranceSoDropDown), AssertionType.WARNING);
			}
			//PK
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigEstimatedAmountofLoss")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("EstimatedAmountofLoss"), fetchValueFromTextFields(estimatedAmountofLossTextBox), AssertionType.WARNING);
			}
			
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(t5ClaimPropLiab1MISEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredCodeLabel), AssertionType.WARNING);
			}
		}
	}
	public void proceedToT2CLRForHealthProducts(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+t5ClaimPropLiab1MISEntity.getStringValueForField("ClaimMemberT1T2CLRAttTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItem")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}
	public void navigateToInsuredItemAttribute(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}

	public void saveto2CLRForHealthProducts(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity){
		if (t5ClaimPropLiab1MISEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitT5ClaimPropertyForLiabyForLiabMISLDetails(T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(t5ClaimPropLiab1MISEntity.getConfigExecute())){
			switchToFrame("display");
			fillT5ClaimPropertyForLiab1MISDetails(t5ClaimPropLiab1MISEntity, assertReference);
			proceedToT2CLRForHealthProducts(t5ClaimPropLiab1MISEntity);
			saveto2CLRForHealthProducts(t5ClaimPropLiab1MISEntity);
			navigateToMainAttributePage(t5ClaimPropLiab1MISEntity);
			navigateToclaimHomePage(t5ClaimPropLiab1MISEntity);
			navigateToInsuredItem(t5ClaimPropLiab1MISEntity);  // insureditem
			navigateToDocument(t5ClaimPropLiab1MISEntity);
			navigateToParties(t5ClaimPropLiab1MISEntity);
			navigateToReserve(t5ClaimPropLiab1MISEntity);
			navigateToPayment(t5ClaimPropLiab1MISEntity);
			navigateToAttribute(t5ClaimPropLiab1MISEntity);
			navigateToInsuredItemDetails(t5ClaimPropLiab1MISEntity); // insureditem
			navigateToInsuredItemAttribute(t5ClaimPropLiab1MISEntity);
		}
	}
}




