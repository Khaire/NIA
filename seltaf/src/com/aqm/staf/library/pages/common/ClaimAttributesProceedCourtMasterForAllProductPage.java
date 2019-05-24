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
import com.aqm.staf.library.databin.ClaimAttriCourtMasterEntity;
import com.aqm.staf.library.databin.ClaimAttributesEntity;
import com.aqm.staf.library.databin.FireReinstatmntPremiumEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClaimAttributesProceedCourtMasterForAllProductPage extends BasePage{

	private PageElement courtMasterForAllProductTitle;
	private PageElement claimTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimDetailsTitlePage;
	private PageElement claimMemberDamageTitlePage;
	private PageElement claimDocumentsTitlePage;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement claimReserveTitlePage;
	private PageElement claimPaymentsTitlePage;
	private PageElement claimPropertyTitlePage;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement courtCodeTextField;
	private PageElement caseNumberTextField;
	private PageElement claimSubStatusTextArea;
	private PageElement uniqueCoinsuranceDocumentsCode;
	private PageElement nextArrowButton;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement claimNumberLabelForIC;
	private PageElement policyNumberLabelForIC;
	private PageElement claimDateLabelForIC;
	private PageElement claimStatusLabelForIC;
	private PageElement productCodeLabelForIC;
	private PageElement causeOfLossLabelForIC;

	public ClaimAttributesProceedCourtMasterForAllProductPage(WebDriver driver,String pageName) {
		super(driver, pageName);
		courtMasterForAllProductTitle = new PageElement(By.xpath("//div//b[contains(text(),'Court Master For All Product')]"), "Court Master For All Product Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		//insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimMemberDamageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "number")), "Claim number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "Product Code")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190", " Applicable Event Code")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		courtCodeTextField = new PageElement(By.xpath("//td//div[contains(text(),'Court Code')]/following::input[1]"), "Court Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		caseNumberTextField = new PageElement(By.xpath("//td//div[contains(text(),'Case Number')]/following::input[1]"), "Case Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		claimSubStatusTextArea = new PageElement(By.xpath("//td//div[contains(text(),'Claim Sub Status')]/following::textarea[1]"), "Claim Sub Status TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uniqueCoinsuranceDocumentsCode= new PageElement(By.xpath("//td//div[contains(text(),'Unique Co-insurance Documents code')]/following::input"), "unique Coinsurance Documents CodeTextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		saveButton = new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("btnBack"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		claimNumberLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "number")), "Claim number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product Code")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabelForIC = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}
	//SERVICES//
	
	public void fillCourtMasterForAllProductDetails(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity, CustomAssert assertReference){
		if(claimAttriCourtMasterEntity.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntity.getAction().equalsIgnoreCase("edit")){
			
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCourtCode")) {
				clearAndSendKeys(courtCodeTextField,claimAttriCourtMasterEntity.getStringValueForField("CourtCode"));
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCaseNo")) {
				clearAndSendKeys(caseNumberTextField,claimAttriCourtMasterEntity.getStringValueForField("CaseNo"));
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentsCode")) {
				clearAndSendKeys(uniqueCoinsuranceDocumentsCode, claimAttriCourtMasterEntity.getStringValueForField("UniqueCoinsuranceDocumentsCode"));
			}

		}
		 
		else if(claimAttriCourtMasterEntity.getAction().equalsIgnoreCase("verify")){
			if(!claimAttriCourtMasterEntity.getStringValueForField("Product").equalsIgnoreCase("IC")) {
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimAttriCourtMasterEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigProductCode")) {
	 			assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCourtCode")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("CourtCode"),fetchValueFromTextFields(courtCodeTextField), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCaseNo")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("CaseNo"),fetchValueFromTextFields(caseNumberTextField), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimSubStatus")) {
				assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ClaimSubStatus"),fetchValueFromFields(claimSubStatusTextArea), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimSubStatusClaimNoCheck")) {
				assertReference.assertEquals(true, fetchValueFromTextFields(claimSubStatusTextArea).contains(claimAttriCourtMasterEntity.getStringValueForField("ClaimSubStatus")), AssertionType.WARNING);
			}
			if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentsCode")) {
				assertReference.assertEquals(true, fetchValueFromTextFields(claimSubStatusTextArea)!=null, AssertionType.WARNING);
			}
			}
			else {
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimNo")) {
					assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabelForIC), AssertionType.WARNING);
				}
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabelForIC), AssertionType.WARNING);
				}
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimAttriCourtMasterEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabelForIC), AssertionType.WARNING);
				}
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabelForIC), AssertionType.WARNING);
				}
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigProductCode")) {
		 			assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabelForIC), AssertionType.WARNING);
				}
				if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimAttriCourtMasterEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabelForIC), AssertionType.WARNING);
				}
			}
			
		}
	}
	public void navigateToClaim(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity){
		if(claimAttriCourtMasterEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}
	}
	public void proceedCourtMasterForAllProductDetails(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity) {
		if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigNextArrowButton")) {
			if(claimAttriCourtMasterEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")) {
				nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
			}
			click(nextArrowButton);
		}
	}
	public void saveCourtMasterForAllProductDetails(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity) {
		if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromCourtMasterForAllProductDetails(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity) {
		if (claimAttriCourtMasterEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitCourtMasterForAllProductDetails(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimAttriCourtMasterEntity.getConfigExecute())){
			fillCourtMasterForAllProductDetails(claimAttriCourtMasterEntity, assertReference);
			proceedCourtMasterForAllProductDetails(claimAttriCourtMasterEntity);
			saveCourtMasterForAllProductDetails(claimAttriCourtMasterEntity);
			//backCourtMasterForAllProductDetails(claimAttriCourtMasterEntity);
			navigateToClaim(claimAttriCourtMasterEntity);
			navigateToMember(claimAttriCourtMasterEntity);
			navigateToDocument(claimAttriCourtMasterEntity);
			navigateToParties(claimAttriCourtMasterEntity);
			navigateToReserve(claimAttriCourtMasterEntity);
			navigateToPayment(claimAttriCourtMasterEntity);
			navigateToAttributes(claimAttriCourtMasterEntity);
			
		}
	}
}



















