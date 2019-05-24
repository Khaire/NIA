package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDtls4EngEntity;

public class ClaimRiskDtls4Engineering extends BasePage{
	
	private PageElement claimRiskDtls4Title;
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
	private PageElement backButton;
	
	private PageElement claimAmountTextField;
	private PageElement salvageTextField;
	private PageElement underInsuranceAmountTextField;
	private PageElement netPayableAmountTextField;
	private PageElement lossLocationAtDropDown;
	
	public ClaimRiskDtls4Engineering(WebDriver driver, String pageName,int rowCounts) {
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

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		claimAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount')]/following::input"), "Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		salvageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Salvage')]/following::input"), "Salvage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		underInsuranceAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Under insurance amount')]/following::input"), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		netPayableAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Net payable Amount')]/following::input"), "Net payable Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		lossLocationAtDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Loss Location at ')]/following::select"), "Loss Location at Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);
	}
	
	public void fillClaimRiskDetailsEngineering(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskDtls4EngEntity.getAction().equalsIgnoreCase("add") || claimRiskDtls4EngEntity.getAction().equalsIgnoreCase("edit")){
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimRiskDtls4EngEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigSalvage")) {
				clearAndSendKeys(salvageTextField, claimRiskDtls4EngEntity.getStringValueForField("Salvage"));
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				clearAndSendKeys(underInsuranceAmountTextField, claimRiskDtls4EngEntity.getStringValueForField("UnderInsuranceAmount"));
			}
			if(claimRiskDtls4EngEntity.getBooleanValueForField("ConfigLossLocationAt")){
				selectValueFromList(lossLocationAtDropDown,claimRiskDtls4EngEntity.getStringValueForField("LossLocationAt"));
			}
		}
		else if(claimRiskDtls4EngEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimAmount")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigSalvage")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("Salvage"),fetchValueFromTextFields(salvageTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("UnderInsuranceAmount"),fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigNetPayableAmount")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("NetPayableAmount"),fetchValueFromTextFields(netPayableAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigLossLocationAt")) {
				assertReference.assertEquals(claimRiskDtls4EngEntity.getStringValueForField("LossLocationAt"), fetchValueFromList(lossLocationAtDropDown), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToMainAttributePage(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity){
		if (claimRiskDtls4EngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			claimRiskDtls4Title= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskDtls4EngEntity.getStringValueForField("ClaimRiskDtls4Title")+"')]"), "  claim Risk dtls 4 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskDtls4Title);
		}
	}
	public void fillandSubmitClaimRiskDetailsEngineering(ClaimRiskDtls4EngEntity claimRiskDtls4EngEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskDtls4EngEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskDetailsEngineering(claimRiskDtls4EngEntity, assertReference);
			navigateToMainAttributePage(claimRiskDtls4EngEntity);
			navigateToclaimHomePage(claimRiskDtls4EngEntity);
			navigateToInsuredItem(claimRiskDtls4EngEntity);
			navigateToDocument(claimRiskDtls4EngEntity);
			navigateToParties(claimRiskDtls4EngEntity);
			navigateToReserve(claimRiskDtls4EngEntity);
			navigateToPayment(claimRiskDtls4EngEntity);
			navigateToAttribute(claimRiskDtls4EngEntity);
			navigateToInsuredItemDetails(claimRiskDtls4EngEntity);
			navigateTInsuredItemAttribute(claimRiskDtls4EngEntity);
			clickOnForwardButton(claimRiskDtls4EngEntity);
		}
	}
}		
