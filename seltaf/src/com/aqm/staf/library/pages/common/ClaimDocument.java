package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;
import com.aqm.staf.library.databin.PolicyDocumentEntity;

public class ClaimDocument extends BasePage {
	private PageElement claimDocumentsTitle;
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
	private PageElement claimCauseCodeLabel;
	private PageElement searchResultPageLabel;
	private PageElement newButton;
	private PageElement createDocumentTitle;
	private PageElement documentNameTextField;
	private PageElement templateRequiredDropdown;
	private PageElement documentTypeDropdown;
	private PageElement referenceCategoryDropdown;
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

	//navigate tab pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	//private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;



	public ClaimDocument(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		insuredItemTitle = new PageElement(By.xpath("//b[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath("//div//b[contains(text(),'number')] /following::td"), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//div//b[contains(text(),'Number')] /following::td"), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath("//div//b[contains(text(),'Date')] /following::td"), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath("//div//b[contains(text(),'Status')] /following::td"), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath("//div//b[contains(text(),'Code')] /following::td"), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimCauseCodeLabel = new PageElement(By.xpath("//div//b[contains(text(),'Cause Code')] /following::td"), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchResultPageLabel = new PageElement(By.xpath("//div//b[contains(text(),'Search Result Page:')] /following::td"), "Search Result Page Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton = new PageElement(By.name("New"),"New Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		createDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Create Document')]"), "Create Document Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentNameTextField = new PageElement(By.name("txtDocName"), "Document Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		templateRequiredDropdown = new PageElement(By.name("cboTmpltReqd"),"Template Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		documentTypeDropdown = new PageElement(By.name("cboDocType"),"Document Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		referenceCategoryDropdown = new PageElement(By.name("cboRefCat2"), "Reference Category Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("txtDescription"), "Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		KeywordTextField = new PageElement(By.name("txtKeyword"), "Keyword Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentCodeTextField = new PageElement(By.name("txtDocumentCode"), "Document Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		uploadTitle = new PageElement(By.xpath("//div//b[contains(text(),'Upload')]"), "Upload Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		browseButton = new PageElement(By.name("txtUpload"),"Browse Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		selectTemplateTitle = new PageElement(By.xpath("//div//b[contains(text(),'Select Template')]"), "Select Template Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectTemplateTextField = new PageElement(By.name("txtTemplate"), "Template Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		MergeButton = new PageElement(By.name("Merge"),"Merge Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeButton = new PageElement(By.name("Close"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'//div//b[contains(text(),'Reserve')]')]"), "Claim Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim  Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillDocumentDetail(ClaimDocumentEntity claimDocumentEntity, CustomAssert assertReference){
		if(claimDocumentEntity.getAction().equalsIgnoreCase("add") || claimDocumentEntity.getAction().equalsIgnoreCase("edit")){

			if (claimDocumentEntity.getBooleanValueForField("ConfigDocName")) {
				clearAndSendKeys(documentNameTextField, claimDocumentEntity.getStringValueForField("DocName"));
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigTemplateRequired")) {
				selectValueFromList(templateRequiredDropdown, claimDocumentEntity.getStringValueForField("TemplateRequired"));
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigDocType")) {
				selectValueFromList(documentTypeDropdown, claimDocumentEntity.getStringValueForField("DocType"));
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, claimDocumentEntity.getStringValueForField("Description"));
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigKeyword")) {
				clearAndSendKeys(KeywordTextField, claimDocumentEntity.getStringValueForField("Keyword"));
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigFind")) {
				clearAndSendKeys(selectTemplateTextField, claimDocumentEntity.getStringValueForField("Find"));
			}
		}

		else if(claimDocumentEntity.getAction().equalsIgnoreCase("verify")){
			ClaimDocumentEntity actualClaimDocumentEntity = new ClaimDocumentEntity();

			if (claimDocumentEntity.getBooleanValueForField("ConfigClaimNo")) {
				actualClaimDocumentEntity.setStringValueForField("ClaimNo", fetchValueFromFields(claimNumberLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("ClaimNo"), actualClaimDocumentEntity.getStringValueForField("ClaimNo"), AssertionType.WARNING);
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualClaimDocumentEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNumberLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("PolicyNo"), actualClaimDocumentEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigClaimDate")) {
				actualClaimDocumentEntity.setStringValueForField("ClaimDate", fetchValueFromFields(claimDateLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("ClaimDate"), actualClaimDocumentEntity.getStringValueForField("ClaimDate"), AssertionType.WARNING);
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigClaimStatus")) {
				actualClaimDocumentEntity.setStringValueForField("ClaimStatus", fetchValueFromFields(claimStatusLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("ClaimStatus"), actualClaimDocumentEntity.getStringValueForField("ClaimStatus"), AssertionType.WARNING);
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigProductCode")) {
				actualClaimDocumentEntity.setStringValueForField("ProductCode", fetchValueFromFields(productCodeLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("ProductCode"), actualClaimDocumentEntity.getStringValueForField("ProductCode"), AssertionType.WARNING);
			}

			if (claimDocumentEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				actualClaimDocumentEntity.setStringValueForField("CauseOfLoss", fetchValueFromFields(claimCauseCodeLabel));
				assertReference.assertEquals(claimDocumentEntity.getStringValueForField("CauseOfLoss"), actualClaimDocumentEntity.getStringValueForField("CauseOfLoss"), AssertionType.WARNING);
			}
		} 
	}

	public void createNewDoc(ClaimDocumentEntity claimdDocumentEntity){
		if (claimdDocumentEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(claimDocumentsTitle));
			return;
		}
	}
	public void uploadFile(ClaimDocumentEntity claimDocumentEntity) {
		if (claimDocumentEntity.getBooleanValueForField("ConfigBrowseButton")) {
			click(browseButton);
		}
	}

	public void submitDocumentDetails(ClaimDocumentEntity claimDocumentEntity) {
		if (claimDocumentEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}

	public void closeWindow(ClaimDocumentEntity claimDocumentEntity) {
		if (claimDocumentEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
		}
	}

	public void clickMerge(ClaimDocumentEntity claimDocumentEntity) {
		if (claimDocumentEntity.getBooleanValueForField("ConfigMergeButton")) {
			click(MergeButton);
		}
	}

	public void navigateToClaimTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDetailsTitle));
			return;
		}
	}
	public void navigateToMemberTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimMemberDamageTitle));
			return;
		}
	}
	public void navigateToDocumentTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimDocumentsTitle));
			return;
		}
	}
	public void navigateToPartiesTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimAssociatedPartiesTitle));
			return;
		}
	}
	public void navigateToReserveTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimReserveTitle));
			return;
		}
	}
	public void navigateToPaymentTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPaymentsTitle));
			return;
		}
	}
	public void navigateToAttributeTab(ClaimDocumentEntity claimDocumentEntity){
		if (claimDocumentEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(claimPropertyTitle));
			return;
		}
	}
	public void fillandSubmitDocumentDetails(ClaimDocumentEntity claimDocumentEntity, CustomAssert assertReference) {
		switchToFrame("display");
		navigateToClaimTab(claimDocumentEntity);
		navigateToMemberTab(claimDocumentEntity);
		navigateToDocumentTab(claimDocumentEntity);
		navigateToPartiesTab(claimDocumentEntity);
		navigateToReserveTab(claimDocumentEntity);
		navigateToPaymentTab(claimDocumentEntity);
		navigateToAttributeTab(claimDocumentEntity);
		fillDocumentDetail(claimDocumentEntity,assertReference);

		uploadFile(claimDocumentEntity);


		closeWindow(claimDocumentEntity);
	}
}
