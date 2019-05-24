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

public class ClaimInsuredItemMemberDamagePage extends BasePage {
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
	private PageElement nextPageTitle;

	private PageElement insuredItemLink;

	public ClaimInsuredItemMemberDamagePage(WebDriver driver, String pageName) {
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
		nextPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Detail')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}

	//SERVICES//

	public void fillClaimMemberDamageDetails(ClaimMemberDamageEntity claimMemberDamageEntity, CustomAssert assertReference){

		if(claimMemberDamageEntity.getAction().equalsIgnoreCase("verify")){
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberDamageEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimMemberDamageEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
		}
	}


	public void navigateToClaim(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigClaimTab"))
			click(claimTitle);
		switchToFrame("display");
		isElementDisplayed(claimDetailsTitlePage);

	}
	public void navigateToMember(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigMemberTab"))
			click(memberTitle);
		switchToFrame("display");
		isElementDisplayed(claimMemberDamagePageTitle);

	}
	public void navigateToDocument(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigDocumentTab"))
			click(documentTitle);
		switchToFrame("display");
		isElementDisplayed(claimDocumentsTitlePage);

	}
	public void navigateToParties(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigPartiesTab"))
			click(partiesTitle);
		switchToFrame("display");
		isElementDisplayed(claimAssociatedPartiesTitlePage);

	}
	public void navigateToReserve(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigReserveTab"))
			click(reserveTitle);
		switchToFrame("display");
		isElementDisplayed(claimReserveTitlePage);

	}
	public void navigateToPayment(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigPaymentTab"))
			click(paymentTitle);
		switchToFrame("display");
		isElementDisplayed(claimPaymentsTitlePage);

	}
	public void navigateToAttributes(ClaimMemberDamageEntity claimMemberDamageEntity){
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigAttributesTab"))
			click(attributesTitle);
		switchToFrame("display");
		isElementDisplayed(claimPropertyTitlePage);

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
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigMemberCode")){
			memberLink=new PageElement(By.xpath("//a/font[contains(text(),'MEMBER')]"), "Claim MEMBER Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(memberLink);
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigBuyerCode")){
			PageElement buyerLink = new PageElement(By.xpath("//a/font[contains(text(),'BUYER')]"), "Claim Buyer Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(buyerLink);
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredIntCode")){
			PageElement InsuredIntLink = new PageElement(By.xpath("//a/font[contains(text(),'STDRISK')]"), "Claim insured interest Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(InsuredIntLink);
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigGroupCode")){
			PageElement groupLink = new PageElement(By.xpath("//a/font[contains(text(),'INDIVIDUAL')]"), "Claim Group Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(groupLink);
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}
		if (claimMemberDamageEntity.getBooleanValueForField("ConfigMemberMotorCode")){
			memberLink=new PageElement(By.xpath("//a/font[contains(text(),'VEHICLE')]"), "Claim MEMBER Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(memberLink);
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);
			}
		}
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				
			}
		}
		
		if(claimMemberDamageEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo"))
		{

			if (claimMemberDamageEntity.getBooleanValueForField("ConfigInsuredItemCode")){
				insuredItemLink=new PageElement(By.xpath("//a/font[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("InsuredItemCode")+"')]"), "Claim Insured Item Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(insuredItemLink);
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				//isElementDisplayed(nextPageTitle);
			}
		}
		
	}

	public void navigateToClaimMemberDamagePageTitle(ClaimMemberDamageEntity claimMemberDamageEntity) {
		switchToFrame("display");
		nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberDamageEntity.getStringValueForField("ClaimMemberDamageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//isElementDisplayed(nextPageTitle);
	}

	public void fillAndSubmitClaimMemberDetails(ClaimMemberDamageEntity claimMemberDamageEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimMemberDamageEntity.getConfigExecute())){
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
}
























