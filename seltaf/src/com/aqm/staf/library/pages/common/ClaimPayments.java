package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimAssociatedPartiesEntity;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;

public class ClaimPayments extends BasePage {
	private PageElement claimPaymentsTitle ;
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
	private PageElement backButton;

	//navigate tab pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	//	private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;

	//navigate to new button page
	private PageElement claimPaymentDetails;

	private String partyCode;
	private PageElement partyCodeLinkTextField;

	public ClaimPayments(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0530","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Table

		newButton = new PageElement(By.name("New"),"New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'//div//b[contains(text(),'Reserve')]')]"), "Claim Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim  Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimPaymentDetails = new PageElement(By.xpath("//div//b[contains(text(),'Payment Details')]"), "Claim Payment Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPaymentDetails(ClaimPaymentEntity claimPaymentEntity, CustomAssert assertReference){
		if(claimPaymentEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}

			if (claimPaymentEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPaymentEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
		}
	}


	public void createNewPayment(ClaimPaymentEntity claimPaymentEntity) throws InterruptedException{
		if (claimPaymentEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			Thread.sleep(3000);
			switchToFrame("display");
			isElementDisplayed(claimPaymentDetails);
		}
	}
	public void backFromClaimPayment(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			switchToFrame("display");
		}
	}
	public void navigateToClaimTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToMemberTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitle);
		}
	}
	public void navigateToAttributesTab(ClaimPaymentEntity claimPaymentEntity){
		if (claimPaymentEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}
	//**********************Search Party Code******************************************//
	public void selectSearchPartyCode(ClaimPaymentEntity claimPaymentEntity){
		if(claimPaymentEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPaymentEntity.getBooleanValueForField("ConfigSearchPartyCode")){
				partyCode=claimPaymentEntity.getStringValueForField("PartyCode");
				partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(partyCodeLinkTextField);
				isElementDisplayed(claimPaymentDetails);
			}
		}
	}
	public void selectSearchPartyCodeHealth(ClaimPaymentEntity claimPaymentEntity){
		if(claimPaymentEntity.getAction().equalsIgnoreCase("edit")){
			if (claimPaymentEntity.getBooleanValueForField("ConfigSearchPartyCode")){
				partyCode=claimPaymentEntity.getStringValueForField("PartyCode");
				partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(partyCodeLinkTextField);
				isElementDisplayed(claimPaymentDetails);
			}
		}
	}

	public void fillAndSubmitPaymentDetails(ClaimPaymentEntity claimPaymentEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimPaymentEntity.getConfigExecute())){
			fillPaymentDetails(claimPaymentEntity, assertReference);
			if(claimPaymentEntity.getAction().equalsIgnoreCase("edit")&& claimPaymentEntity.getBooleanValueForField("ConfigSearchPartyCode")){
				selectSearchPartyCodeHealth(claimPaymentEntity);
			}
			createNewPayment(claimPaymentEntity);
			navigateToClaimTab(claimPaymentEntity);
			navigateToMemberTab(claimPaymentEntity);
			navigateToDocumentTab(claimPaymentEntity);
			navigateToPartiesTab(claimPaymentEntity);
			navigateToReserveTab(claimPaymentEntity);
			navigateToPaymentTab(claimPaymentEntity);
			navigateToAttributesTab(claimPaymentEntity);
			//backFromClaimPayment(claimPaymentEntity);
		}
	}
}
