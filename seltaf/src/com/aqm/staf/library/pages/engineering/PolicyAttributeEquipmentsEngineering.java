package com.aqm.staf.library.pages.engineering;

import com.aqm.staf.framework.core.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrEquipmentsEngEntity;
import com.aqm.staf.library.databin.PolAttrOtherDMSIEngEntity;


public class PolicyAttributeEquipmentsEngineering extends BasePage {
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

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

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

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement backwardButton;
	//------------------------------------------------------------------------
	//---
	private PageElement exactDescriptionOfThePropertyTobeErectedTextArea;
	private PageElement forMachManunameTypeSizeCapWeightPressrevolOfMainMachEquipTextArea;
	private PageElement havePlansDesignAndMatofThekindUsedinTheProjectTextArea;
	private PageElement confirmThatNoEquipmentsInTheProjectisPrototypicalTextArea;
	private PageElement nameOfProcessLicensorsAndthePlantUnitsIncludedTextArea;
	private PageElement isThereAnyAggravatedRiskOfFireExplosionDropDown;
	private PageElement detailsOfRiskFireExplosionTextArea;
	private PageElement totalPMLTextFeild;
	
	
	public PolicyAttributeEquipmentsEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
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

		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backwardButton=new PageElement(By.name("btnPrevious"), "Backward Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//--
		exactDescriptionOfThePropertyTobeErectedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Exact description of the property to be erected')]/following::textarea"), "Exact description of the property", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forMachManunameTypeSizeCapWeightPressrevolOfMainMachEquipTextArea= new PageElement(By.xpath("//td//div[contains(text(),'For Machines, Manufactures name, type, size, capacity')]/following::textarea"), "For Machines, Manufactures name, type, size, capacity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		havePlansDesignAndMatofThekindUsedinTheProjectTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Have plans, design and materials of the kind used in the project')]/following::textarea"), "Have plans, design and materials", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		confirmThatNoEquipmentsInTheProjectisPrototypicalTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Confirmation that no Equipments in the project is prototypical')]/following::textarea"), "Have plans, design and materials", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfProcessLicensorsAndthePlantUnitsIncludedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Name of Process licensors and the plant units included')]/following::textarea"), "Name of Process licensors", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThereAnyAggravatedRiskOfFireExplosionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is there any aggravated risk of Fire  Explosion')]/following::select"), "Is there any aggravated risk", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfRiskFireExplosionTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Details of risk(Fire,Explosion)')]/following::textarea"), "Details of risk(Fire,Explosion)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	//===
		totalPMLTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Total PML')]/following::input"), "Total PML", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	}
	public void fillPolicyAttributeEquipmentsEngineering(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("add") || polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=LE
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigExactDescriptionOfThePropertyTobeErected")) {
				clearAndSendKeys(exactDescriptionOfThePropertyTobeErectedTextArea, polAttrEquipmentsEngEntity.getStringValueForField("ExactDescriptionOfThePropertyTobeErected"));
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigForMachManunameTypeSizeCapWeightPressrevolOfMainMachEquip")) {
				clearAndSendKeys(forMachManunameTypeSizeCapWeightPressrevolOfMainMachEquipTextArea, polAttrEquipmentsEngEntity.getStringValueForField("ForMachManunameTypeSizeCapWeightPressrevolOfMainMachEquip"));
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigHavePlansDesignAndMatofThekindUsedinTheProject")) {
				clearAndSendKeys(havePlansDesignAndMatofThekindUsedinTheProjectTextArea, polAttrEquipmentsEngEntity.getStringValueForField("HavePlansDesignAndMatofThekindUsedinTheProject"));
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigConfirmThatNoEquipmentsInTheProjectisPrototypical")) {
				clearAndSendKeys(confirmThatNoEquipmentsInTheProjectisPrototypicalTextArea, polAttrEquipmentsEngEntity.getStringValueForField("ConfirmThatNoEquipmentsInTheProjectisPrototypical"));
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigNameOfProcessLicensorsAndthePlantUnitsIncluded")) {
				clearAndSendKeys(nameOfProcessLicensorsAndthePlantUnitsIncludedTextArea, polAttrEquipmentsEngEntity.getStringValueForField("NameOfProcessLicensorsAndthePlantUnitsIncluded"));
			}

			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigIsThereAnyAggravatedRiskOfFireExplosion")) {
				selectValueFromList(isThereAnyAggravatedRiskOfFireExplosionDropDown, polAttrEquipmentsEngEntity.getStringValueForField("IsThereAnyAggravatedRiskOfFireExplosion"));
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigDetailsOfRiskFireExplosion")) {
				clearAndSendKeys(detailsOfRiskFireExplosionTextArea, polAttrEquipmentsEngEntity.getStringValueForField("DetailsOfRiskFireExplosion"));
			}
		}
		else if(polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//==
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigExactDescriptionOfThePropertyTobeErected")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("ExactDescriptionOfThePropertyTobeErected"), fetchValueFromTextFields(exactDescriptionOfThePropertyTobeErectedTextArea), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigForMachManunameTypeSizeCapWeightPressrevolOfMainMachEquip")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("ForMachManunameTypeSizeCapWeightPressrevolOfMainMachEquip"), fetchValueFromTextFields(forMachManunameTypeSizeCapWeightPressrevolOfMainMachEquipTextArea), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigHavePlansDesignAndMatofThekindUsedinTheProject")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("HavePlansDesignAndMatofThekindUsedinTheProject"), fetchValueFromTextFields(havePlansDesignAndMatofThekindUsedinTheProjectTextArea), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigConfirmThatNoEquipmentsInTheProjectisPrototypical")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("ConfirmThatNoEquipmentsInTheProjectisPrototypical"), fetchValueFromTextFields(confirmThatNoEquipmentsInTheProjectisPrototypicalTextArea), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigNameOfProcessLicensorsAndthePlantUnitsIncluded")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("NameOfProcessLicensorsAndthePlantUnitsIncluded"), fetchValueFromTextFields(nameOfProcessLicensorsAndthePlantUnitsIncludedTextArea), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigIsThereAnyAggravatedRiskOfFireExplosion")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("IsThereAnyAggravatedRiskOfFireExplosion"), fetchValueFromList(isThereAnyAggravatedRiskOfFireExplosionDropDown), AssertionType.WARNING);
			}
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigDetailsOfRiskFireExplosion")) {
				assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("DetailsOfRiskFireExplosion"), fetchValueFromTextFields(detailsOfRiskFireExplosionTextArea), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToPolicy(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void clickOnBackButton(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity){
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}
	
	private void clickOnNextButton(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity) {
		if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	private void fillPolicyAttributePMLDetailsNewEngineering(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity,CustomAssert assertReference) {
		if(polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("add") || polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=LE
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigTotalPML")) {
				clearAndSendKeys(totalPMLTextFeild, polAttrEquipmentsEngEntity.getStringValueForField("TotalPML"));
			}
		}
		if(polAttrEquipmentsEngEntity.getAction().equalsIgnoreCase("verify")){		
			if (polAttrEquipmentsEngEntity.getBooleanValueForField("ConfigTotalPML")) {	
			assertReference.assertEquals(polAttrEquipmentsEngEntity.getStringValueForField("TotalPML"), fetchValueFromTextFields(totalPMLTextFeild), AssertionType.WARNING);
		}
	}	
}
	public void fillandSubmitPolicyAttributeEquipmentsEngineering(PolAttrEquipmentsEngEntity polAttrEquipmentsEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrEquipmentsEngEntity.getConfigExecute())){
			fillPolicyAttributeEquipmentsEngineering(polAttrEquipmentsEngEntity, assertReference);
			clickOnForwardButton(polAttrEquipmentsEngEntity);
			fillPolicyAttributePMLDetailsNewEngineering(polAttrEquipmentsEngEntity, assertReference);
			clickOnNextButton(polAttrEquipmentsEngEntity);
			navigateToPolicy(polAttrEquipmentsEngEntity);
			navigateToAttribute(polAttrEquipmentsEngEntity);
			navigateToInsuredInterest(polAttrEquipmentsEngEntity);
			navigateToCoverage(polAttrEquipmentsEngEntity);
			navigateToLoan(polAttrEquipmentsEngEntity);
			navigateToClientDetails(polAttrEquipmentsEngEntity);
			navigateToRelation(polAttrEquipmentsEngEntity);
			navigateToPayment(polAttrEquipmentsEngEntity);
			navigateToFollowup(polAttrEquipmentsEngEntity);
			navigateToDocument(polAttrEquipmentsEngEntity);
		}
	}
}
