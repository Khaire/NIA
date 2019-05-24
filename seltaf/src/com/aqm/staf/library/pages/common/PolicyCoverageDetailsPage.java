package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyCoverageDetailsEntity;
import com.aqm.staf.library.databin.PolicyCoverageListEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;
import com.aqm.staf.library.databin.PolicyMemberPaymentsEntity;

public class PolicyCoverageDetailsPage extends BasePage
{
	private PageElement policyCoverageDetailsTitle;
	private PageElement coverageDetailsTitle;
	private PageElement coveragePropertyTitle;
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
	private PageElement	policyNoLabel;
	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement codeTextField;
	private PageElement nameTextField;
	private PageElement inceptionDateTextField;
	private PageElement terminationDateTextField;
	private PageElement descriptionTextArea;
	private PageElement backButton;
	private PageElement backPropertyButton;

	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyCoverAttributesTitle;
	private PageElement policyEventCodeDropDown;
	private PageElement policyCoverageListPageTitle;

	public PolicyCoverageDetailsPage(WebDriver driver, String pageName)
	{		
		super(driver, pageName);
		policyCoverageDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Policy Coverage Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageDetailsTitle = new PageElement(By.linkText("Details"), "Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePropertyTitle = new PageElement(By.linkText("Property"), "Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "No.")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverDetail", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverDetail","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverDetail","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyCoverDetail", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		codeTextField = new PageElement(By.name("pCoverCode"), "Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameTextField = new PageElement(By.name("pCoverName"), "Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		inceptionDateTextField = new PageElement(By.name("pCoverInceptionDate"), "Inception Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		terminationDateTextField = new PageElement(By.name("pCoverInceptionDate"), "Termination Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("pDescription"), "Description Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backPropertyButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),' Policy Cover Attributes')]"), "Policy Cover Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyEventCodeDropDown=new PageElement(By.name("pEventCode"), "Select Application Event Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyCoverageListPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillCoverageDetails(PolicyCoverageDetailsEntity policyCoverageDetails, CustomAssert assertReference){
		if(policyCoverageDetails.getBooleanValueForField("ConfigDetailsTab")){
			if(policyCoverageDetails.getAction().equalsIgnoreCase("verify")){

				if (policyCoverageDetails.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("CofigStatus")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("CofigPolicyholder")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigProduct")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigCode")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Code"), fetchValueFromFields(codeTextField), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigName")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Name"), fetchValueFromFields(nameTextField), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigInceptionDate")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("InceptionDate"), fetchValueFromFields(inceptionDateTextField), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigTerminationDate")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("TerminationDate"), fetchValueFromFields(terminationDateTextField), AssertionType.WARNING);
				}

				if (policyCoverageDetails.getBooleanValueForField("ConfigDescription")) {
					assertReference.assertEquals(policyCoverageDetails.getStringValueForField("Description"), fetchValueFromFields(descriptionTextArea), AssertionType.WARNING);
				}


			}
		}
	}
	public void fillPropertyDetails(PolicyCoverageDetailsEntity policyCoverageDetails, CustomAssert assertReference){
		if(policyCoverageDetails.getBooleanValueForField("ConfigPropertyTab")){
			if(policyCoverageDetails.getAction().equalsIgnoreCase("verify")){
				navigateToPropertyTab(policyCoverageDetails);

				if (policyCoverageDetails.getBooleanValueForField("ConfigPolicyEventCode")) {
					selectValueFromList(policyEventCodeDropDown, policyCoverageDetails.getStringValueForField("PolicyEventCode"));
				}
			}
		}
	}
	public void backFromPage(PolicyCoverageDetailsEntity policyCoverageDetails) {
		if (policyCoverageDetails.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListPageTitle);
		}
	}

	public void backFromPropertyPage(PolicyCoverageDetailsEntity policyCoverageDetails) {
		if (policyCoverageDetails.getBooleanValueForField("ConfigBackPropertyButton")) {
			click(backPropertyButton);
			switchToFrame("display");
			isElementDisplayed(policyCoverageDetailsTitle);
		}
	}

	public void navigateToPolicyTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttributeTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToMemberTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitlePage);
		}
	}
	public void navigateToCoverageTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}
	public void navigateToClientDetailTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if(policyCoverageDetails.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailsTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigDetailsTab")){
			click(coverageDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageDetailsTitle);
		}
	}
	public void navigateToPropertyTab(PolicyCoverageDetailsEntity policyCoverageDetails){
		if (policyCoverageDetails.getBooleanValueForField("ConfigProperty")){
			click(coveragePropertyTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverAttributesTitle);
		}
	}
	public void fillAndSubmitPolicyCoverageDetails(PolicyCoverageDetailsEntity policyCoverageDetails, CustomAssert assertReference) {
		if(isConfigTrue(policyCoverageDetails.getConfigExecute())){
			fillCoverageDetails(policyCoverageDetails, assertReference);
			fillPropertyDetails(policyCoverageDetails, assertReference);
			navigateToPolicyTab(policyCoverageDetails);
			navigateToAttributeTab(policyCoverageDetails);
			navigateToMemberTab(policyCoverageDetails);
			navigateToCoverageTab(policyCoverageDetails);
			navigateToClientDetailTab(policyCoverageDetails);
			navigateToRelationsTab(policyCoverageDetails);
			navigateToPaymentsTab(policyCoverageDetails);
			navigateToFollowupTab(policyCoverageDetails);
			navigateToDocumentTab(policyCoverageDetails);
			navigateToDetailsTab(policyCoverageDetails);
			//backFromPage(policyCoverageDetails);
		}
	}
}
