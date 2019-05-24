package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyDocumentEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;

public class PolicyDocument extends BasePage {

	private PageElement policyDocumentsTitle;
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement quoteNumberLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement searchResultPageLabel;
	private PageElement newButton;
	private PageElement createDocumentTitle;
	private PageElement documentNameTextField;
	private PageElement templateRequiredDropdown;
	private PageElement documentTypeDropdown;
	private PageElement referenceCategoryTextField;
	private PageElement descriptionTextArea;
	private PageElement KeywordTextField;
	private PageElement documentCodeTextField;
	private PageElement uploadTitle;
	private PageElement browseButton;
	private PageElement selectTemplateTitle;
	private PageElement selectTemplateTextField;
	private PageElement MergeButton;
	private PageElement closeButton;
	private PageElement saveButton;

	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;

	public PolicyDocument(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNumberLabel = new PageElement(By.xpath("//td//b[contains(text(),'No')] /following::td"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath("//td//b[contains(text(),'Status')] /following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath("//b[contains(text(),'Policyholder')] /following::td"), "Policyholder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath("//td[@title='Product']/following::td"), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchResultPageLabel = new PageElement(By.xpath("//div//b[contains(text(),'Search Result Page:')] /following::td"), "Search Result Page Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton = new PageElement(By.name("New"),"New Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		createDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Create Document')]"), "Create Document Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentNameTextField = new PageElement(By.name("txtDocName"), "Document Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		templateRequiredDropdown = new PageElement(By.name("cboTmpltReqd"),"Template Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		documentTypeDropdown = new PageElement(By.name("cboDocType"),"Document Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		referenceCategoryTextField = new PageElement(By.name("cboRefCat2"), "Reference Category Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("txtDescription"), "Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		KeywordTextField = new PageElement(By.name("txtKeyword"), "Keyword Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentCodeTextField = new PageElement(By.name("txtDocumentCode"), "Document Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		uploadTitle = new PageElement(By.xpath("//div//b[contains(text(),'Upload')]"), "Upload Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		browseButton = new PageElement(By.name("txtUpload"),"Browse Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		selectTemplateTitle = new PageElement(By.xpath("//div//b[contains(text(),'Select Template')]"), "Select Template Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectTemplateTextField = new PageElement(By.name("txtTemplate"), "Template Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		MergeButton = new PageElement(By.name("Merge"),"Merge Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeButton = new PageElement(By.name("Close"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyDocDetails(PolicyDocumentEntity policyDocumentEntity, CustomAssert assertReference){
		if(policyDocumentEntity.getAction().equalsIgnoreCase("add") || policyDocumentEntity.getAction().equalsIgnoreCase("edit")){

			if (policyDocumentEntity.getBooleanValueForField("ConfigDocName")) {
				clearAndSendKeys(documentNameTextField, policyDocumentEntity.getStringValueForField("DocName"));
			}

			if (policyDocumentEntity.getBooleanValueForField("ConfigTemplateRequired")) {
				selectValueFromList(templateRequiredDropdown, policyDocumentEntity.getStringValueForField("TemplateRequired"));
			}

			if (policyDocumentEntity.getBooleanValueForField("ConfigDocType")) {
				selectValueFromList(documentTypeDropdown, policyDocumentEntity.getStringValueForField("DocType"));
			}

			if (policyDocumentEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, policyDocumentEntity.getStringValueForField("Description"));
			}

			if (policyDocumentEntity.getBooleanValueForField("ConfigKeyword")) {
				clearAndSendKeys(KeywordTextField, policyDocumentEntity.getStringValueForField("Keyword"));
			}

			if (policyDocumentEntity.getBooleanValueForField("ConfigFind")) {
				clearAndSendKeys(selectTemplateTextField, policyDocumentEntity.getStringValueForField("Find"));
			}
		}

		else if(policyDocumentEntity.getAction().equalsIgnoreCase("verify")){
			PolicyDocumentEntity actualPolicyDocumentEntity = new PolicyDocumentEntity();

			if (policyDocumentEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyDocumentEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNumberLabel));
				assertReference.assertEquals(policyDocumentEntity.getStringValueForField("QuoteNo"), actualPolicyDocumentEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}

			if (policyDocumentEntity.getBooleanValueForField("configStatus")) {
				actualPolicyDocumentEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyDocumentEntity.getStringValueForField("Status"), actualPolicyDocumentEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}

			if (policyDocumentEntity.getBooleanValueForField("configPolicyholder")) {
				actualPolicyDocumentEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyDocumentEntity.getStringValueForField("Policyholder"), actualPolicyDocumentEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}

			if (policyDocumentEntity.getBooleanValueForField("configProduct")) {
				actualPolicyDocumentEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyDocumentEntity.getStringValueForField("Product"), actualPolicyDocumentEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
		}
	}


	public void createNewDoc(PolicyDocumentEntity policyDocumentEntity){
		if (policyDocumentEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(createDocumentTitle));
			return;
		}
	}

	public void uploadFile(PolicyDocumentEntity policyDocumentEntity) {
		if (policyDocumentEntity.getBooleanValueForField("ConfigBrowseButton")) {
			click(browseButton);
		}
	}

	public void submitDocumentDetails(PolicyDocumentEntity policyDocumentEntity) {
		if (policyDocumentEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentsTitle));
			return;
		}
	}

	public void closeWindow(PolicyDocumentEntity policyDocumentEntity) {
		if (policyDocumentEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
		}
	}

	public void clickMerge(PolicyDocumentEntity policyDocumentEntity) {
		if (policyDocumentEntity.getBooleanValueForField("ConfigMergeButton")) {
			click(MergeButton);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentsTitle));
			return;
		}
	}

	public void navigateToPolicyTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigPolicyTab"))
			click(policyTitle);
		switchToFrame("display");
		if(isElementDisplayed(policyQuoteDetailsTitlePage));
		return;
	}


	public void navigateToAttributeTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitlePage));
			return;
		}
	}

	public void navigateToMemberTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitlePage));
			return;
		}
	}
	public void navigateToCoverageTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitlePage));
			return;
		}
	}
	public void navigateToClientDetailTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelationsTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPaymentsTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowupTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quotePolicyTitle));
			return;
		}
	}

	public void navigateToDocumentTab(PolicyDocumentEntity policyDocumentEntity){
		if(policyDocumentEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}
	public void fillandSubmitDocumentDetails(PolicyDocumentEntity policyDocumentEntity, CustomAssert assertReference) {
		switchToFrame("display");
		navigateToPolicyTab(policyDocumentEntity);
		navigateToAttributeTab(policyDocumentEntity);
		navigateToMemberTab(policyDocumentEntity);
		navigateToCoverageTab(policyDocumentEntity);
		navigateToClientDetailTab(policyDocumentEntity);
		navigateToRelationsTab(policyDocumentEntity);
		navigateToPaymentsTab(policyDocumentEntity);
		navigateToFollowupTab(policyDocumentEntity);
		navigateToDocumentTab(policyDocumentEntity);
		fillPolicyDocDetails(policyDocumentEntity, assertReference);
		createNewDoc(policyDocumentEntity);
		uploadFile(policyDocumentEntity);
		clickMerge(policyDocumentEntity);
		submitDocumentDetails(policyDocumentEntity);
		closeWindow(policyDocumentEntity);

	}

}
