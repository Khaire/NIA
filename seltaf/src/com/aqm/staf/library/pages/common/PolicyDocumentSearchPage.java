package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyConditionsCreateEntity;
import com.aqm.staf.library.databin.PolicyDocumentSearchEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyDocumentSearchPage extends BasePage {
	private PageElement createDocumentTitlePage;
	private PageElement policyTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement attributeTitle;
	private PageElement policyAttributesTitlePage;
	private PageElement memberTitle;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement coverageTitle;
	private PageElement policyCoverageListTitlePage; 
	private PageElement loanTitle;
	//private PageElement
	private PageElement clientDetailsTitle;
	private PageElement schemeDetailTitlePage;
	private PageElement relationsTitle;
	private PageElement policyRelationsTitlePage;
	private PageElement paymentsTitle;
	private PageElement policyPaymentListTitlePage;
	private PageElement followupTitle;
	private PageElement quotePolicyTitlePage;
	private PageElement documentTitle;
	private PageElement policyDocumentTitlePage;
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	//private PageElement searchResultPageLabel; TABLE
	private PageElement renameButton;
	private PageElement changeDescriptionButton;
	private PageElement viewVersionButton;
	private PageElement checkInOutButton;
	private PageElement deleteButton;
	private PageElement lockButton;
	private PageElement convertToHindiButton;
	private PageElement newButton;	

	public PolicyDocumentSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		createDocumentTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Create Document')]"),"Create Document Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributeTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		schemeDetailTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPaymentListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title PAge", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyDocumentTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyNoLabel = new PageElement(By.xpath("//td//b[contains(text(),'No.')]/following::td"), "Policy No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//	quoteNoLabel = new PageElement(By.xpath("//td//b[contains(text(),'No.')]/following::td"), "Quote No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"),"Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath("//td//b[contains(text(),'Policyholder')]/following::td"),"Policy Holder Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath("//td[@title='Product']/following::td"),"Product Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//searchResultPageLabel = new PageElement(By.xpath(genericLocatorforLabel("frmListDcmnt", "Search Result Page: ")),"Search Result Page Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//List of Documents - Table
		renameButton = new PageElement(By.name("Rename"),"Rename Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		changeDescriptionButton = new PageElement(By.name("Change Description"),"Change Description Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		viewVersionButton = new PageElement(By.name("View Version"),"View Version Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		checkInOutButton = new PageElement(By.name("Check"),"Check In/Out Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("Delete"),"Delete Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		lockButton = new PageElement(By.name("Lock"),"Lock Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		convertToHindiButton = new PageElement(By.name("ConvertHind"),"Convert To Hindi Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		newButton = new PageElement(By.name("New"),"New Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}


	//SERVICES//
	public void fillPolicyDocumentSearchDetails(PolicyDocumentSearchEntity policyDocumentSearchEntity, CustomAssert assertReference){
		if(policyDocumentSearchEntity.getAction().equalsIgnoreCase("verify")){
			PolicyDocumentSearchEntity actualPolicyDocumentSearchEntity=new PolicyDocumentSearchEntity();
			if (policyDocumentSearchEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyDocumentSearchEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyDocumentSearchEntity.getStringValueForField("PolicyNo"), actualPolicyDocumentSearchEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}
			if (policyDocumentSearchEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyDocumentSearchEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyDocumentSearchEntity.getStringValueForField("QuoteNo"), actualPolicyDocumentSearchEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			if (policyDocumentSearchEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyDocumentSearchEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyDocumentSearchEntity.getStringValueForField("Status"), actualPolicyDocumentSearchEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (policyDocumentSearchEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyDocumentSearchEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyDocumentSearchEntity.getStringValueForField("Policyholder"), actualPolicyDocumentSearchEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (policyDocumentSearchEntity.getBooleanValueForField("ConfigProduct ")) {
				actualPolicyDocumentSearchEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyDocumentSearchEntity.getStringValueForField("Product"), actualPolicyDocumentSearchEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicy(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void navigateToAttribute(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitlePage));
			return;
		}
	}
	public void navigateToMember(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitlePage ));
			return;
		}
	}
	public void navigateToCoverage(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitlePage));
			return;
		}
	}
	/*public void navigateToLoan(){
		click(loanTitle);
		switchToFrame("display");
		if(isElementDisplayed());
		return;
	}*/
	public void navigateToClientDetails(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitlePage));
			return;
		}
	}
	public void navigateToRelations(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitlePage));
			return;
		}
	}
	public void navigateToPayments(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitlePage));
			return;
		}
	}
	public void navigateToFollowup(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quotePolicyTitlePage));
			return;
		}
	}
	public void navigateToDocument(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitlePage));
			return;
		}
	}
	public void clickRename(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigRenameButton")) {
			click(renameButton);
			enterMessageInAlert(policyDocumentSearchEntity.getStringValueForField("RenamePopUpMessage"));
		}
	}
	public void clickChangeDescrioprion(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigChangeDescriptionButton")) {
			click(changeDescriptionButton);
			enterMessageInAlert(policyDocumentSearchEntity.getStringValueForField("ChangeDescriptionPopUpMessage"));
		}
	}
	public void clickViewVersion(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigViewVersionButton")) {
			click(viewVersionButton);
		}
	}
	//CheckInOutButton is not working//
	public void clickCheckInOut(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigCheckInOutButton")) {
			click(checkInOutButton);
		}
	}
	public void deleteFromPolicyDocumentSearchDetails(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	public void clickLock(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigLockButton")) {
			click(lockButton);
		}
	}
	//convertToHindiButton is not working//
	public void clickConvertToHindi(PolicyDocumentSearchEntity policyDocumentSearchEntity) {
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigConvertToHindi")) {
			click(convertToHindiButton);
		}
	}
	public void navigateToPolicyCreateDocumentPage(PolicyDocumentSearchEntity policyDocumentSearchEntity){
		if (policyDocumentSearchEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(createDocumentTitlePage));
			return;
		}
	}
	public void fillAndSearchPolicyDocumentSearchDetails(PolicyDocumentSearchEntity policyDocumentSearchEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyDocumentSearchDetails(policyDocumentSearchEntity, assertReference);
		navigateToPolicy(policyDocumentSearchEntity);
		navigateToAttribute(policyDocumentSearchEntity);
		navigateToMember(policyDocumentSearchEntity);
		navigateToCoverage(policyDocumentSearchEntity);
		navigateToClientDetails(policyDocumentSearchEntity);
		navigateToRelations(policyDocumentSearchEntity);
		navigateToPayments(policyDocumentSearchEntity);
		navigateToFollowup(policyDocumentSearchEntity);
		navigateToDocument(policyDocumentSearchEntity);
		navigateToPolicyCreateDocumentPage(policyDocumentSearchEntity);
		clickRename(policyDocumentSearchEntity);
		clickChangeDescrioprion(policyDocumentSearchEntity);
		clickViewVersion(policyDocumentSearchEntity);
		clickCheckInOut(policyDocumentSearchEntity);
		deleteFromPolicyDocumentSearchDetails(policyDocumentSearchEntity);
		clickLock(policyDocumentSearchEntity);
	}
}
