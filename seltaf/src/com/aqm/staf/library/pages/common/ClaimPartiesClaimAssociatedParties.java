package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimAssociatedPartiesEntity;
import com.aqm.staf.library.databin.ClaimDamageDetailsEntity;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;

public class ClaimPartiesClaimAssociatedParties extends BasePage {
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement newButton;
	private PageElement deleteButton;
	private PageElement backButton;

	//Navigate to tabs pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentsTitle;
	//private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;

	//navgaite to new  button page
	private PageElement claimPartyDetailsTitle ;
	private String partyCode;
	private PageElement partyCodeLinkTextField;
	private PageElement closeButton;



	public ClaimPartiesClaimAssociatedParties(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Party Financial Summary Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0520","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//tabel

		newButton = new PageElement(By.name("New"),"New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("Delete"),"Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'//div//b[contains(text(),'Reserve')]')]"), "Claim Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim  Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimPartyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'PartyDetails')]"), "Claim Party Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		closeButton = new PageElement(By.name("CloseWin"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillAssociatedPartiesDetail(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity, CustomAssert assertReference){
		if(claimAssociatedPartiesEntity.getAction().equalsIgnoreCase("verify")){
			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}

			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimAssociatedPartiesEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
		}
	}

	public void createNewParty(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			isElementDisplayed(claimPartyDetailsTitle);
		}
	}


	public void backFromClaimAssociatedParties(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity) {
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void deleteMember(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity) {
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}
	}

	public void navigateToClaimTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToMemberTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitle);
		}
	}
	public void navigateToAttributeTab(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity){
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}

	public void navigatePartiesTitle(){
		switchToFrame("display");
		isElementDisplayed(claimAssociatedPartiesTitle);
	}
	public void selectSearchPartyCode(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity) throws InterruptedException{
		if(claimAssociatedPartiesEntity.getAction().equalsIgnoreCase("verify")){
			if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigSearchPartyCode")){
				partyCode=claimAssociatedPartiesEntity.getStringValueForField("PartyCode");
				partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(partyCodeLinkTextField);
				if (claimAssociatedPartiesEntity.getStringValueForField("Product").equalsIgnoreCase("IC")) {
					switchToWindow("Error Window");
				}
				try{
					Thread.sleep(3000);
					//switchToWindow("Error Window");	//Error Window
					driver.switchTo().alert().accept();
					driver.switchTo().alert().accept();
				}  
				catch (Exception e){
					//switchToWindow("Error Window");
				}
				 
			}
		}
	}

	public void afterClickOnSelectButtonHandlePopup(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity) throws InterruptedException {
		switchToWindow("Error Window");
		if (claimAssociatedPartiesEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);	
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			isElementDisplayed(claimPartyDetailsTitle);
			
		}
	}

	public void fillandSubmitAssociatedPartiesDetails(ClaimAssociatedPartiesEntity claimAssociatedPartiesEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimAssociatedPartiesEntity.getConfigExecute())){
			switchToFrame("display");
			fillAssociatedPartiesDetail(claimAssociatedPartiesEntity, assertReference);
			navigateToClaimTab(claimAssociatedPartiesEntity);
			navigateToMemberTab(claimAssociatedPartiesEntity);
			navigateToDocumentTab(claimAssociatedPartiesEntity);
			navigateToPartiesTab(claimAssociatedPartiesEntity);
			navigateToReserveTab(claimAssociatedPartiesEntity);
			navigateToPaymentTab(claimAssociatedPartiesEntity);
			navigateToAttributeTab(claimAssociatedPartiesEntity);
			//createNewParty(claimAssociatedPartiesEntity);	
			//backFromClaimAssociatedParties(claimAssociatedPartiesEntity);
			deleteMember(claimAssociatedPartiesEntity);
		}
	}
}
