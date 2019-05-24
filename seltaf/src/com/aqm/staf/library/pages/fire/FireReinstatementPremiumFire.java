package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.FireReinstatmntPremiumEntity;

public class FireReinstatementPremiumFire extends BasePage {
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
	//Fire Reinstatement Premium Page
	private PageElement isReinstatementRequiredDropdown;
	private PageElement reinstatementPremiumTextField;
	private PageElement outstandingClaimReasonDropdown;
	//Basis of policy Page
	private PageElement basisOfPolicyDropdown;
	private PageElement proceedButton;
	private PageElement courtMasterForAllProductTitlePage;
	private PageElement viewButton;
	private PageElement backButton;
	private PageElement basisOfPolicyTitle;
	private PageElement fireReinstatementPremiumTitle;
	
	private PageElement nextArrowButton;
	private PageElement saveButton;

	public FireReinstatementPremiumFire(WebDriver driver, String pageName) {
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
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Fire Reinstatement Premium Page
		isReinstatementRequiredDropdown =new PageElement(By.xpath("//td//div[contains(text(),'Is Reinstatement Required')]/following::select"), "Is Reinstatement Required Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		reinstatementPremiumTextField = new PageElement(By.xpath("//td//div[contains(text(),'Reinstatement Premium')]/following::input"), "Reinstatement Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		outstandingClaimReasonDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Outstanding Claim Reason')]/following::select"), "Outstanding Claim Reason Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		//Basis of policy Page
		basisOfPolicyDropdown = new PageElement(By.xpath("//td//div[contains(text(),'Basis of policy')]/following::select"), "Basis of policy Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

		proceedButton = new PageElement(By.name("Next1"),"Proceed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		courtMasterForAllProductTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Court Master For All Product')]"), " Court Master For All Product Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		viewButton = new PageElement(By.name("View"),"View Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

        nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
        saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	//Fire Reinstatement Premium Page

	public void fillFireReinstatementPremiumFireDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity, CustomAssert assertReference){
		if(fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("add") || fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("edit")){

			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
				selectValueFromList(isReinstatementRequiredDropdown, fireReinstatmntPremiumEntity.getStringValueForField("IsReinstatementRequired"));
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
				clearAndSendKeys(reinstatementPremiumTextField, fireReinstatmntPremiumEntity.getStringValueForField("ReinstatementPremium"));
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigOutstandingClaimReason")) {
				selectValueFromList(outstandingClaimReasonDropdown, fireReinstatmntPremiumEntity.getStringValueForField("OutstandingClaimReason"));
			}

		}

		else if(fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("verify")){

			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimDate"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("IsReinstatementRequired"), fetchValueFromList(isReinstatementRequiredDropdown), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ReinstatementPremium"), fetchValueFromTextFields(reinstatementPremiumTextField), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigOutstandingClaimReason")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("OutstandingClaimReason"), fetchValueFromList(outstandingClaimReasonDropdown), AssertionType.WARNING);
			}

		}
	}	

	//Basis of policy Page
	public void fillBasisOfPolicyDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity, CustomAssert assertReference){
		if(fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("add") || fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("edit")){
			if(!(fireReinstatmntPremiumEntity.getStringValueForField("Product").equalsIgnoreCase("PE")))
			{
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigBasisOfPolicy")) {
				selectValueFromList(basisOfPolicyDropdown, fireReinstatmntPremiumEntity.getStringValueForField("BasisOfPolicy"));
			}
		click(proceedButton); 
			switchToFrame("display");
			basisOfPolicyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+fireReinstatmntPremiumEntity.getStringValueForField("BasisOfPolicyTitle")+"')]"), "Basis Of Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(basisOfPolicyTitle);
		}
		}
		else if(fireReinstatmntPremiumEntity.getAction().equalsIgnoreCase("verify")){
			if(!(fireReinstatmntPremiumEntity.getStringValueForField("Product").equalsIgnoreCase("PE")))
			{

			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimDate"), fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigBasisOfPolicy")) {
				assertReference.assertEquals(fireReinstatmntPremiumEntity.getStringValueForField("BasisOfPolicy"), fetchValueFromList(basisOfPolicyDropdown), AssertionType.WARNING);
			}
			
	         click(proceedButton);
			switchToFrame("display");
			basisOfPolicyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+fireReinstatmntPremiumEntity.getStringValueForField("BasisOfPolicyTitle")+"')]"), "Basis Of Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(basisOfPolicyTitle);
		}
		}
		}
		
	


	public void navigateToClaim(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}	
	}
	public void proceedToNextPage(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity){
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigProceedButton")){
			click(proceedButton);
			switchToFrame("display");
			fireReinstatementPremiumTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+fireReinstatmntPremiumEntity.getStringValueForField("FireReinstatementPremiumTitle")+"')]"), "Fire Reinstatement Premium Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(fireReinstatementPremiumTitle);
		}
	}
	public void proceedCourtMasterForAllProductDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity) {
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigNextArrowButton")){
			click(nextArrowButton);
		}
	}
	public void saveCourtMasterForAllProductDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity) {
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		} 
	}
	public void backFromClaimAttributesDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity) {
		if (fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitClaimPropertyDetails(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillFireReinstatementPremiumFireDetails(fireReinstatmntPremiumEntity, assertReference);
		proceedToNextPage(fireReinstatmntPremiumEntity);
		proceedCourtMasterForAllProductDetails(fireReinstatmntPremiumEntity);
		saveCourtMasterForAllProductDetails(fireReinstatmntPremiumEntity);
	    // For Basis Of Policy Page
		
		
		if(fireReinstatmntPremiumEntity.getBooleanValueForField("ConfigBasisOfPolicyPage")){
			fillBasisOfPolicyDetails(fireReinstatmntPremiumEntity, assertReference);
		}
		
		navigateToClaim(fireReinstatmntPremiumEntity);
		navigateToMember(fireReinstatmntPremiumEntity);
		navigateToDocument(fireReinstatmntPremiumEntity);
		navigateToParties(fireReinstatmntPremiumEntity);
		navigateToReserve(fireReinstatmntPremiumEntity);
		navigateToPayment(fireReinstatmntPremiumEntity);
		navigateToAttributes(fireReinstatmntPremiumEntity);
	}
}	

