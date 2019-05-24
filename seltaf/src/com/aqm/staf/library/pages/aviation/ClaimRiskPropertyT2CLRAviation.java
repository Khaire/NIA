package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProT2CLRAviEntity;

public class ClaimRiskPropertyT2CLRAviation extends BasePage{
	//Tabs
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
	private PageElement insuredItemTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	//Lable
	private PageElement claimNumberLable;
	private PageElement policyNumberLable;
	private PageElement claimDateLable;
	private PageElement claimStatusLable;
	private PageElement productCodeLable;
	private PageElement causeOfLossLable;
	private PageElement insuredSerialNoLable;
	private PageElement insuredItemCodeLable;
	private PageElement applicableEventCodeLable;
	//Buttons
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement backArrowButton;
	private PageElement nextPageTitle;
	private PageElement backPageTitle;
	//AA
	private PageElement totalRecoveredAmountTextField;
	private PageElement whetherDeferredPremiumclausIsapplicableDropDown;
	private PageElement whetherThePolicyIs64VBcompliantDropDown;

	public ClaimRiskPropertyT2CLRAviation(WebDriver driver, String pageName) {
		super(driver,pageName);
		//Tabs
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured Item Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Lable
		claimNumberLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim")),"Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy "))," Policy  Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Code ")),"Product Code  Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Serial No")),"Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Insured Item Code")),"Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeLable= new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable "))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backArrowButton = new PageElement(By.name("Previous"), "Back Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//AA
		totalRecoveredAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Recovered Amount')]/following::input"), "Total Recovered Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherDeferredPremiumclausIsapplicableDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether deferred premium clause is applicable?')]/following::select"), "Whether deferred premium clause is applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherThePolicyIs64VBcompliantDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant')]/following::select"), "Whether the policy is 64 VB compliant", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


	}
	public void fillClaimRiskPropertyT2CLRAviation(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity, CustomAssert assertReference) {

		if(claimRiskProT2CLRAviEntity.getAction().equalsIgnoreCase("add") || claimRiskProT2CLRAviEntity.getAction().equalsIgnoreCase("edit")){
			//AA
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigWhetherDeferredPremiumclausIsapplicable")) {
				selectValueFromList(whetherDeferredPremiumclausIsapplicableDropDown, claimRiskProT2CLRAviEntity.getStringValueForField("WhetherDeferredPremiumclausIsapplicable"));
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBcompliant")) {
				selectValueFromList(whetherThePolicyIs64VBcompliantDropDown, claimRiskProT2CLRAviEntity.getStringValueForField("WhetherThePolicyIs64VBcompliant"));
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				clearAndSendKeys(totalRecoveredAmountTextField, claimRiskProT2CLRAviEntity.getStringValueForField("TotalRecoveredAmount"));
			}
		}
		else if(claimRiskProT2CLRAviEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("ClaimDate"), fetchValueFromFields(claimDateLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("InsuredSerialNo"), fetchValueFromFields(insuredSerialNoLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("InsuredItemCode"), fetchValueFromFields(insuredItemCodeLable), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("ApplicableEventCode"), fetchValueFromFields(applicableEventCodeLable), AssertionType.WARNING);
			}
			//AA
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigWhetherDeferredPremiumclausIsapplicable")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("WhetherDeferredPremiumclausIsapplicable"), fetchValueFromList(whetherDeferredPremiumclausIsapplicableDropDown), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBcompliant")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("WhetherThePolicyIs64VBcompliant"), fetchValueFromList(whetherThePolicyIs64VBcompliantDropDown), AssertionType.WARNING);
			}
			if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				assertReference.assertEquals(claimRiskProT2CLRAviEntity.getStringValueForField("TotalRecoveredAmount"), fetchValueFromTextFields(totalRecoveredAmountTextField), AssertionType.WARNING);
			}


		}
	}//edit
	public void nextButtonClaimRiskPropertyT2CLRAviation(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigNextArrowButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			
		}
	}
	public void backArrowButtonClaimRiskPropertyT2CLRAviation(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigBackArrowButton")){		
			click(backArrowButton);
			switchToFrame("display");
			backPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskProT2CLRAviEntity.getStringValueForField("Claim Risk Property T1-CLR ")+"')]"), "Back Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(backPageTitle);
		}
	}

	public void navigateToMainAttributePage(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}

	public void navigateToInsuredItemDetail(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}

	public void navigateToInsuredItemAttribute(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity){
		if (claimRiskProT2CLRAviEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimRiskPropertyT2CLRAviation(ClaimRiskProT2CLRAviEntity claimRiskProT2CLRAviEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProT2CLRAviEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskPropertyT2CLRAviation(claimRiskProT2CLRAviEntity, assertReference);
			nextButtonClaimRiskPropertyT2CLRAviation(claimRiskProT2CLRAviEntity);
			backArrowButtonClaimRiskPropertyT2CLRAviation(claimRiskProT2CLRAviEntity);
			navigateToMainAttributePage(claimRiskProT2CLRAviEntity);
			navigateToclaimHomePage(claimRiskProT2CLRAviEntity);
			navigateToInsuredItem(claimRiskProT2CLRAviEntity);
			navigateToDocument(claimRiskProT2CLRAviEntity);
			navigateToParties(claimRiskProT2CLRAviEntity);
			navigateToReserve(claimRiskProT2CLRAviEntity);
			navigateToPayment(claimRiskProT2CLRAviEntity);
			navigateToAttribute(claimRiskProT2CLRAviEntity);
			navigateToInsuredItemDetail(claimRiskProT2CLRAviEntity);
			navigateToInsuredItemAttribute(claimRiskProT2CLRAviEntity);
		}
		
	}

}
