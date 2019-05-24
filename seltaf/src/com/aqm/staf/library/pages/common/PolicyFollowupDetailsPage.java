package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyFollowupCreateEntity;

public class PolicyFollowupDetailsPage extends BasePage{

	private PageElement followupDetailsTitle;
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
	private PageElement policyOrQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quoteOrpolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement eventCodeLabel;
	private PageElement followupDateTextField;
	private PageElement referenceNoLabel;
	private PageElement followupTimeTextField;
	private PageElement eventEffectiveDateLabel;
	private PageElement jobStatusLabel;
	private PageElement assignedToTextField;
	private PageElement assignedByLabel;
	private PageElement keywordTextField;
	private PageElement priorityDropDown;
	private PageElement remarksTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public PolicyFollowupDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		followupDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup Details')]"), "Followup Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTitle = new PageElement(By.xpath("//div/b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyOrQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		policyInsuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle = new PageElement(By.xpath("//div//b[contains(text(),'')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteOrpolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Policy No.")), "Policy No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		eventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Event Code")), "Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupDateTextField = new PageElement(By.name("pFollowupDate"), "Followup Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		referenceNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Reference No")), "Reference No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		followupTimeTextField = new PageElement(By.name("pFollowupTime"), "Followup Time TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		eventEffectiveDateLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Event Effective Date")), "Event Effective Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		jobStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Job Status")), "Job Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		assignedToTextField = new PageElement(By.name("pAssignedPersonal"), "Assigned To  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assignedByLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupDetails", "Assigned By")), "Assigned By Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		keywordTextField = new PageElement(By.name("pKeyword"), "Keyword TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		priorityDropDown = new PageElement(By.name("pPriority"), "Priority DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		remarksTextArea = new PageElement(By.name("pDescriptionRemarks"), "Remarks TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 


	}

	public void navigateToPolicy(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPolicy")) {
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;
		}
	}

	public void navigateToAttribute(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigAttribute")) {
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}

	public void navigateToMember(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigMember")) {
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverage(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigCoverage")) {
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}

	public void navigateToClientDetails(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigClientDetails")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelations(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigRelations")) {
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPayments(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPayments")) {
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowup(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigFollowup")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;
		}
	}
	public void navigateToDocument(PolicyFollowupCreateEntity policyFollowupCreateEntity){
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigDocument")) {
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}


	public void fillPolicyFollowupCreateDetails(PolicyFollowupCreateEntity policyFollowupCreateEntity, CustomAssert assertReference){
		if(policyFollowupCreateEntity.getAction().equalsIgnoreCase("add") || policyFollowupCreateEntity.getAction().equalsIgnoreCase("edit")){
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigFollowupDate")) {
				String FollowupDate=RandomCodeGenerator.dateGenerator(policyFollowupCreateEntity.getStringValueForField("FollowupDate"));
				clearAndEnterDate(followupDateTextField, FollowupDate);
			}
		}


		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigAssignedTo")) {
			String AssignedTo=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(assignedToTextField,AssignedTo);
		}

		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigKeyword")) {
			String Keyword=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(keywordTextField,Keyword);
		}
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPriority")) {
			selectValueFromList(priorityDropDown, policyFollowupCreateEntity.getStringValueForField("Priority"));
		}
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigRemarks")) {
			String Remarks=RandomCodeGenerator.autoNameGenerator();
			clearAndSendKeys(remarksTextArea,Remarks);
		}

		else if(policyFollowupCreateEntity.getAction().equalsIgnoreCase("verify")){
			PolicyFollowupCreateEntity actualPolicyFollowupCreateEntity=new PolicyFollowupCreateEntity();
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("policyNo"), actualPolicyFollowupCreateEntity.getStringValueForField("policyNo"), AssertionType.WARNING);
			}


			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Status"), actualPolicyFollowupCreateEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}


			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Policyholder"), actualPolicyFollowupCreateEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}


			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigProduct")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Product"), actualPolicyFollowupCreateEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigEventCode")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("EventCode", fetchValueFromFields(eventCodeLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("EventCode"), actualPolicyFollowupCreateEntity.getStringValueForField("EventCode"), AssertionType.WARNING);
			}

			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigFollowupDate")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("FollowupDate", fetchValueFromTextFields(followupDateTextField));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("FollowupDate"), actualPolicyFollowupCreateEntity.getStringValueForField("FollowupDate"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigReferenceNo")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("ReferenceNo", fetchValueFromFields(referenceNoLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("ReferenceNo"), actualPolicyFollowupCreateEntity.getStringValueForField("ReferenceNo"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigFollowupTime")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("FollowupTime", fetchValueFromTextFields(followupTimeTextField));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("FollowupTime"), actualPolicyFollowupCreateEntity.getStringValueForField("FollowupTime"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("EventEffectiveDate", fetchValueFromFields(eventEffectiveDateLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("EventEffectiveDate"), actualPolicyFollowupCreateEntity.getStringValueForField("EventEffectiveDate"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigJobStatus")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("JobStatus", fetchValueFromFields(jobStatusLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("JobStatus"), actualPolicyFollowupCreateEntity.getStringValueForField("JobStatus"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigAssignedTo")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("AssignedTo", fetchValueFromTextFields(assignedToTextField));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("AssignedTo"), actualPolicyFollowupCreateEntity.getStringValueForField("AssignedTo"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigAssignedBy")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("AssignedBy", fetchValueFromFields(assignedByLabel));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("AssignedBy"), actualPolicyFollowupCreateEntity.getStringValueForField("AssignedBy"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigKeyword")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Keyword", fetchValueFromTextFields(keywordTextField));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Keyword"), actualPolicyFollowupCreateEntity.getStringValueForField("Keyword"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigPriority")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Priority", fetchValueFromTextFields(priorityDropDown));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Priority"), actualPolicyFollowupCreateEntity.getStringValueForField("Priority"), AssertionType.WARNING);
			}
			if (policyFollowupCreateEntity.getBooleanValueForField("ConfigRemarks")) {
				actualPolicyFollowupCreateEntity.setStringValueForField("Remarks", fetchValueFromTextFields(remarksTextArea));
				assertReference.assertEquals(policyFollowupCreateEntity.getStringValueForField("Remarks"), actualPolicyFollowupCreateEntity.getStringValueForField("Remarks"), AssertionType.WARNING);
			}
		}
	}
	public void submitPolicyFollowupCreateDetails(PolicyFollowupCreateEntity policyFollowupCreateEntity) {
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void backFromPolicyFollowupCreateDetails(PolicyFollowupCreateEntity policyFollowupCreateEntity) {
		if (policyFollowupCreateEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;

		}

	}

	public void fillAndSubmitPolicyFollowupCreateDetails(PolicyFollowupCreateEntity policyFollowupCreateEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyFollowupCreateDetails(policyFollowupCreateEntity, assertReference);
		submitPolicyFollowupCreateDetails(policyFollowupCreateEntity);
		navigateToPolicy(policyFollowupCreateEntity);
		navigateToAttribute(policyFollowupCreateEntity);
		navigateToMember(policyFollowupCreateEntity);
		navigateToCoverage(policyFollowupCreateEntity);
		navigateToClientDetails(policyFollowupCreateEntity);
		navigateToRelations(policyFollowupCreateEntity);
		navigateToPayments(policyFollowupCreateEntity);
		navigateToFollowup(policyFollowupCreateEntity);
		navigateToDocument(policyFollowupCreateEntity);
	}

}








