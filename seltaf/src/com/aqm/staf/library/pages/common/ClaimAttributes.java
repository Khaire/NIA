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
import com.aqm.staf.library.databin.PolicyDocumentSearchEntity;

public class ClaimAttributes extends BasePage {
	private PageElement claimPropertyTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement claimTitle;
	private PageElement claimDetailsTitlePage;
	//private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement claimMemberDamageTitlePage;
	private PageElement documentTitle;
	private PageElement claimDocumentsTitlePage;
	private PageElement partiesTitle;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement reserveTitle;
	private PageElement claimReserveTitlePage;
	private PageElement paymentTitle;
	private PageElement claimPaymentsTitlePage;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement applicableEventCodeDropdown;
	private PageElement proceedButton;
	private PageElement courtMasterForAllProductTitlePage;
	private PageElement viewButton;
	private PageElement backButton;

	public ClaimAttributes(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//insuredItemTitle = new PageElement(By.xpath("//b//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.xpath("//b//div[contains(text(),'Member')]"),"Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimMemberDamageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTitle = new PageElement(By.xpath("//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Policy")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Product")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0203", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeDropdown = new PageElement(By.name("pEventCode"),"Applicable Event Code Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		proceedButton = new PageElement(By.name("Proceed"),"Proceed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		courtMasterForAllProductTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Court Master For All Product')]"), " Court Master For All Product Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		viewButton = new PageElement(By.name("View"),"View Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	//SERVICES//
	public void fillClaimAttributesDetails(ClaimAttributesEntity claimAttributesEntity, CustomAssert assertReference){
		if(claimAttributesEntity.getAction().equalsIgnoreCase("add") || claimAttributesEntity.getAction().equalsIgnoreCase("edit")){
			if (claimAttributesEntity.getBooleanValueForField("ConfigApplicableEventCodeDropdown")) {
				selectValueFromList(applicableEventCodeDropdown, claimAttributesEntity.getStringValueForField("ApplicableEventCodeDropdown"));
			}
		}
		else if(claimAttributesEntity.getAction().equalsIgnoreCase("verify")){
			ClaimAttributesEntity actualClaimAttributesEntity=new ClaimAttributesEntity();
			if (claimAttributesEntity.getBooleanValueForField("ConfigClaimNumber")) {
				actualClaimAttributesEntity.setStringValueForField("ClaimNumber", fetchValueFromFields(claimNumberLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("ClaimNumber"), actualClaimAttributesEntity.getStringValueForField("ClaimNumber"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				actualClaimAttributesEntity.setStringValueForField("PolicyNumber", fetchValueFromFields(policyNumberLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("PolicyNumber"), actualClaimAttributesEntity.getStringValueForField("PolicyNumber"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigClaimDate")) {
				actualClaimAttributesEntity.setStringValueForField("ClaimDate", fetchValueFromFields(claimDateLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("ClaimDate"), actualClaimAttributesEntity.getStringValueForField("ClaimDate"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigClaimStatus")) {
				actualClaimAttributesEntity.setStringValueForField("ClaimStatus", fetchValueFromFields(claimStatusLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("ClaimStatus"), actualClaimAttributesEntity.getStringValueForField("ClaimStatus"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigProductCode")) {
				actualClaimAttributesEntity.setStringValueForField("ProductCode", fetchValueFromFields(productCodeLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("ProductCode"), actualClaimAttributesEntity.getStringValueForField("ProductCode"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				actualClaimAttributesEntity.setStringValueForField("CauseOfLoss", fetchValueFromFields(causeOfLossLabel));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("CauseOfLoss"), actualClaimAttributesEntity.getStringValueForField("CauseOfLoss"), AssertionType.WARNING);
			}
			if (claimAttributesEntity.getBooleanValueForField("ConfigApplicableEventCodeDropdown")) {
				actualClaimAttributesEntity.setStringValueForField("ApplicableEventCodeDropdown", fetchValueFromFields(applicableEventCodeDropdown));
				assertReference.assertEquals(claimAttributesEntity.getStringValueForField("ApplicableEventCodeDropdown"), actualClaimAttributesEntity.getStringValueForField("ApplicableEventCodeDropdown"), AssertionType.WARNING);
			}						
		}
	}	
	public void navigateToClaim(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDetailsTitlePage));
			return;
		}
	}
	public void navigateToMember(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimMemberDamageTitlePage));
			return;
		}
	}
	public void navigateToDocument(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDocumentsTitlePage));
			return;
		}
	}
	public void navigateToParties(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimAssociatedPartiesTitlePage));
			return;
		}
	}
	public void navigateToReserve(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimReserveTitlePage));
			return;
		}
	}
	public void navigateToPayment(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPaymentsTitlePage));
			return;
		}
	}
	public void navigateToAttributes(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPropertyTitlePage));
			return;
		}
	}
	public void proceedFromClaimAttributesDetails(ClaimAttributesEntity claimAttributesEntity){
		if (claimAttributesEntity.getBooleanValueForField("ConfigProceedButton")){
			if(!(claimAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))) {
				click(proceedButton);
			}
			switchToFrame("display");
		}
	}
	public void viewClaimAttributesDetails(ClaimAttributesEntity claimAttributesEntity) {
		if (claimAttributesEntity.getBooleanValueForField("ConfigViewButton")) {
			click(viewButton);
			switchToFrame("display");
			//if(isElementDisplayed(policyAttributesTitlePage));
			//return;
		}
	}
	public void backFromClaimAttributesDetails(ClaimAttributesEntity claimAttributesEntity) {
		if (claimAttributesEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitClaimAttributesDetails(ClaimAttributesEntity claimAttributesEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimAttributesDetails(claimAttributesEntity, assertReference);
		navigateToClaim(claimAttributesEntity);
		navigateToMember(claimAttributesEntity);
		navigateToDocument(claimAttributesEntity);
		navigateToParties(claimAttributesEntity);
		navigateToReserve(claimAttributesEntity);
		navigateToPayment(claimAttributesEntity);
		navigateToAttributes(claimAttributesEntity);
		proceedFromClaimAttributesDetails(claimAttributesEntity);
		viewClaimAttributesDetails(claimAttributesEntity);
		//backFromClaimAttributesDetails(claimAttributesEntity);
	}
}	

























