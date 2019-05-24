package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimReservePageEntity;
import com.aqm.staf.library.databin.PartyEntity;


public class Claim_ReservePage extends BasePage {
	private PageElement claimTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributeTitle;
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	private PageElement claimPaymentTitle;
	private PageElement claimPropertyTitle;

	private PageElement claimReserveDetailsTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement reserveTypeFunctionDropDownList;
	private PageElement reserveAmountTextFeild;
	private PageElement reasonTextFeild;
	private PageElement saveButton;
	private PageElement backButton;


	public Claim_ReservePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		//Tab
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"), "Claim Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberTitle = new PageElement(By.xpath("//b//div[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partiesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reserveTitle = new PageElement(By.xpath("//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTitle = new PageElement(By.xpath("//b//div[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimDetailsTitle = new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Claim Deatils Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//b[contains(text(),'MemberDamage')]"), "Claim MemberDamage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimDocumentTitle = new PageElement(By.xpath("//b[contains(text(),'Documents')]"), "Claim Documents Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimReserveTitle = new PageElement(By.xpath("//b[contains(text(),'Reserve')]"), "Claim Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimPaymentTitle = new PageElement(By.xpath("//b[contains(text(),'Payments')]"), "Claim Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimPropertyTitle = new PageElement(By.xpath("//b[contains(text(),'Property')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Label
		claimReserveDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim')]"), "Claim Reserve", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Claim number"))," Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Policy Number"))," Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Claim Date"))," Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Claim Status"))," Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Product Code"))," Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Cause Of Loss"))," Cause Of Loss Lable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Feilds
		reserveTypeFunctionDropDownList= new PageElement(By.name("pPartyFunction"), "Reserve Type Function Drop Down List",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		reserveAmountTextFeild= new PageElement(By.name("pClaimReserveAmount"), "Reserve Amount TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonTextFeild= new PageElement(By.name("pClaimReserveReason"), "Reason TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton= new PageElement(By.name("Save"), "Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton= new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void navigateToclaimDetailsTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigClaim")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToMemberDamageTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigMember")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigDocument")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentTitle);
		}
	}
	public void navigateToAssociatedPartiesTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigParties")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigReserve")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigPayment")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentTitle);
		}
	}
	public void navigateToAttributeTab(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigAttribute")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}
	//Services
	public void fillClaimReserveDetails(ClaimReservePageEntity claimReservePageEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimReservePageEntity.getAction().equalsIgnoreCase("add") || claimReservePageEntity.getAction().equalsIgnoreCase("edit")){
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveTypeFunction")) {
				selectValueFromList(reserveTypeFunctionDropDownList, claimReservePageEntity.getStringValueForField("ReserveTypeFunction"));
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveAmount")) {
				clearAndSendKeys(reserveAmountTextFeild, claimReservePageEntity.getStringValueForField("ReserveAmount"));
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReason")) {
				clearAndSendKeys(reasonTextFeild, claimReservePageEntity.getStringValueForField("Reason"));
			}
		}
		else if(claimReservePageEntity.getAction().equalsIgnoreCase("verify")){
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveTypeFunction")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveTypeFunction"), fetchValueFromTextFields(reserveTypeFunctionDropDownList), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveAmount")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveAmount"), fetchValueFromFields(reserveAmountTextFeild),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReason")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("Reason"),fetchValueFromFields(reasonTextFeild),AssertionType.WARNING);
			}
		}
	}

	public void submitClaimReserveDetails(ClaimReservePageEntity claimReservePageEntity) {
		if (claimReservePageEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void backButton(ClaimReservePageEntity claimReservePageEntity, CustomAssert assertReference) {
		if (claimReservePageEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}	

	public void fillandSubmitClaimReserveDetails(ClaimReservePageEntity claimReservePageEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimReservePageEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimReserveDetails(claimReservePageEntity, assertReference);
			submitClaimReserveDetails(claimReservePageEntity);
			navigateToclaimDetailsTab(claimReservePageEntity);
			navigateToMemberDamageTab(claimReservePageEntity);
			navigateToDocumentTab(claimReservePageEntity);
			navigateToAssociatedPartiesTab(claimReservePageEntity);
			navigateToReserveTab(claimReservePageEntity);
			navigateToPaymentTab(claimReservePageEntity);
			navigateToAttributeTab(claimReservePageEntity);
		}
	}


}













