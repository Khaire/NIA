package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimAttributesEntity;
import com.aqm.staf.library.databin.ClaimMemberDamageEntity;
import com.aqm.staf.library.databin.PolicyDocumentSearchEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClaimInsuredItem_MemberDamagePage extends BasePage {
	private PageElement claimMemberDamagePageTitle;
	private PageElement claimTitle;
	private PageElement claimDetailsTitlePage;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement claimDocumentsTitlePage;
	private PageElement partiesTitle;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement reserveTitle;
	private PageElement claimReserveTitlePage;
	private PageElement paymentTitle;
	private PageElement claimPaymentsTitlePage;
	private PageElement attributesTitle;
	private PageElement claimPropertyTitlePage;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement newButton;
	private PageElement deleteButton;
	private PageElement backButton;
	//Member
	private PageElement memberLink;

	public ClaimInsuredItem_MemberDamagePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimMemberDamagePageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Policy")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Product Code")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0500", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//*****************************************TABLE***********************************************//
		newButton = new PageElement(By.name("New"),"New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("Delete"),"Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	//SERVICES//

	public void fillClaimMemberDamageDetails(ClaimMemberDamageEntity claimMemberDamageEntity, CustomAssert assertReference){
		if(claimMemberDamageEntity.getAction().equalsIgnoreCase("verify")){
			ClaimMemberDamageEntity actualClaimMemberDamageEntity=new ClaimMemberDamageEntity();
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimNumber")) {
				actualClaimMemberDamageEntity.setStringValueForField("ClaimNumber", fetchValueFromFields(claimNumberLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimNumber"), actualClaimMemberDamageEntity.getStringValueForField("ClaimNumber"), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				actualClaimMemberDamageEntity.setStringValueForField("PolicyNumber", fetchValueFromFields(policyNumberLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("PolicyNumber"), actualClaimMemberDamageEntity.getStringValueForField("PolicyNumber"), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimDate")) {
				actualClaimMemberDamageEntity.setStringValueForField("ClaimDate", fetchValueFromFields(claimDateLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimDate"), actualClaimMemberDamageEntity.getStringValueForField("ClaimDate"), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimStatus")) {
				actualClaimMemberDamageEntity.setStringValueForField("ClaimStatus", fetchValueFromFields(claimStatusLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimStatus"), actualClaimMemberDamageEntity.getStringValueForField("ClaimStatus"), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigProductCode")) {
				actualClaimMemberDamageEntity.setStringValueForField("ProductCode", fetchValueFromFields(productCodeLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ProductCode"), actualClaimMemberDamageEntity.getStringValueForField("ProductCode"), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				actualClaimMemberDamageEntity.setStringValueForField("CauseOfLoss", fetchValueFromFields(causeOfLossLabel));
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("CauseOfLoss"), actualClaimMemberDamageEntity.getStringValueForField("CauseOfLoss"), AssertionType.WARNING);
			}
		}
	}

	public void navigateToClaim(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDetailsTitlePage));
			return;
		}
	}
	public void navigateToMember(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimMemberDamagePageTitle));
			return;
		}
	}
	public void navigateToDocument(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDocumentsTitlePage));
			return;
		}
	}
	public void navigateToParties(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimAssociatedPartiesTitlePage));
			return;
		}
	}
	public void navigateToReserve(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimReserveTitlePage));
			return;
		}
	}
	public void navigateToPayment(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPaymentsTitlePage));
			return;
		}
	}
	public void navigateToAttributes(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPropertyTitlePage));
		}
	}
	//New Button is not working //
	public void createClaimMemberDamageDetails(ClaimMemberDamageEntity claimMemberDamageEntity) {
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
		}
	}   
	//Delete Button is not working //
	public void deleteFromClaimMemberDamageDetails(ClaimMemberDamageEntity claimMemberDamageEntity) {
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}  
	public void backFromClaimMemberDamageDetails(ClaimMemberDamageEntity claimMemberDamageEntity) {
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(backButton);
		}
	}

	public void selectClaimMemberCode(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigPolicySearch")){
			memberLink=new PageElement(By.xpath("//a/font[contains(text(),'MEMBER')]"), "Claim Member Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(memberLink);
		}
	}

	public void navigateToClaimMemberDamagePageTitle() {
		switchToFrame("display");
		if(isElementDisplayed(claimMemberDamagePageTitle));
		return;
	}
	public void fillAndSubmitClaimMemberDetails(ClaimMemberDamageEntity claimMemberDamageEntity, CustomAssert assertReference) {
		fillClaimMemberDamageDetails(claimMemberDamageEntity, assertReference);
		navigateToClaim(claimMemberDamageEntity);
		navigateToMember(claimMemberDamageEntity);
		navigateToDocument(claimMemberDamageEntity);
		navigateToParties(claimMemberDamageEntity);
		navigateToReserve(claimMemberDamageEntity);
		navigateToPayment(claimMemberDamageEntity);
		navigateToAttributes(claimMemberDamageEntity);
		//createClaimMemberDamageDetails(claimMemberDamageEntity); //New Button is not working
		deleteFromClaimMemberDamageDetails(claimMemberDamageEntity); //Delete Button is not working 
		//backFromClaimMemberDamageDetails(claimMemberDamageEntity);
	}
}
























