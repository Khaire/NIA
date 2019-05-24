package com.aqm.staf.library.pages.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountDistributionEntity;
import com.aqm.staf.library.databin.AccountingDistributionTable;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.PolicyFollowupEntity;

public class PolicyFollowupPage extends BasePage{

	private PageElement quoteOrPolicyTitle;
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
	private PageElement followupDetailsTitle;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement newButton;
	private PageElement backButton;

	private PageElement srNumber;
	private PageElement eventDate;
	private PageElement eventCode;
	private PageElement eventRemarks;

	// This page consists a table too.
	
	private PageElement policyFollowupTableCancellationBasisRemaksText;

	public PolicyFollowupPage(WebDriver driver, String pageName) {
		super(driver, pageName);

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
		followupDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup Details')]"), "Followup Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupList", "No.")), "Policy No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupList", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupList", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyFollowupList", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton=new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}

	public void navigateToPolicy(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigPolicy")) {
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;
		}
	}

	public void navigateToAttribute(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigAttribute")) {
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}

	public void navigateToMember(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigMember")) {
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverage(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigCoverage")) {
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}

	public void navigateToClientDetails(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigClientDetails")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelations(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigRelations")) {
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPayments(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigPayments")) {
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowup(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigFollowup")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;
		}
	}
	public void navigateToDocument(PolicyFollowupEntity policyFollowupEntity){
		if (policyFollowupEntity.getBooleanValueForField("ConfigDocument")) {
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}
	public void fillPolicyFollowupDetails(PolicyFollowupEntity policyFollowupEntity, CustomAssert assertReference){
		if(policyFollowupEntity.getAction().equalsIgnoreCase("verify")){
			PolicyFollowupEntity actualPolicyFollowupEntity=new PolicyFollowupEntity();
			if (policyFollowupEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyFollowupEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigProduct")) {
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}			
		}



	}
	public void navigateToPolicyFollowupCreatePage(){
		click(newButton);
		switchToFrame("display");
		if(isElementDisplayed(followupDetailsTitle));
		return;
	}
	public void backFromPolicyFollowup(PolicyFollowupEntity policyFollowupEntity) {
		if (policyFollowupEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;

		}

	}

	
	//Abhijit

	private void fillPolicyFollowupTable(PolicyFollowupEntity policyFollowupEntity, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		if(policyFollowupEntity.getBooleanValueForField("ConfigFollowUpEventTable")){
			int tableDataRowNumber = policyFollowupEntity.getIntegerValueForField("TableRowNumber");
			int serialNumber =policyFollowupEntity.getIntegerValueForField("SlNo");
			if (policyFollowupEntity.getBooleanValueForField("ConfigSerialNo")) {
				srNumber = new PageElement(By.xpath("//div/a[contains(text(),'"+serialNumber+"')]"), "Serial No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("SerialNo"),fetchValueFromFields(srNumber),AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigEventDate")) {
				eventDate = new PageElement(By.xpath("//div/a[contains(text(),'"+serialNumber+"')]/following::td["+tableDataRowNumber+"]/div"), "Event Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyFollowupEntity.getStringValueForField("EventDate")) ,fetchValueFromFields(eventDate), AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigEventCode")) {
				eventCode = new PageElement(By.xpath("//div/a[contains(text(),'"+serialNumber+"')]/following::td["+tableDataRowNumber+"]/div"), "Event Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(policyFollowupEntity.getStringValueForField("EventCode"),fetchValueFromFields(eventCode),AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigEventRemarks")) {
				String eventToCheck=policyFollowupEntity.getStringValueForField("EventRemarks");
				eventRemarks = new PageElement(By.xpath("//div/a[contains(text(),'"+serialNumber+"')]/following::td["+tableDataRowNumber+"]/div"), eventToCheck, false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(true,fetchValueFromFields(eventRemarks).contains(policyFollowupEntity.getStringValueForField("EventRemarks")),AssertionType.WARNING);
			}
			if (policyFollowupEntity.getBooleanValueForField("ConfigEventPolicyNumber")) {
				String eventToCheck=policyFollowupEntity.getStringValueForField("EventPolicyNumber");
				eventRemarks = new PageElement(By.xpath("//div/a[contains(text(),'"+serialNumber+"')]/following::td["+tableDataRowNumber+"]/div"), eventToCheck, false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(true,fetchValueFromFields(eventRemarks).contains(policyFollowupEntity.getStringValueForField("EventPolicyNumber")),AssertionType.WARNING);
			}
		}
	}

	public void fillAndSubmitPolicyFollowupDetails(PolicyFollowupEntity policyFollowupEntity, CustomAssert assertReference,ScenarioTestData testData) throws InterruptedException {
		switchToFrame("display");
		fillPolicyFollowupDetails(policyFollowupEntity, assertReference);
		fillPolicyFollowupTable(policyFollowupEntity, assertReference,testData);
		navigateToPolicy(policyFollowupEntity);
		navigateToAttribute(policyFollowupEntity);
		navigateToMember(policyFollowupEntity);
		navigateToCoverage(policyFollowupEntity);
		navigateToClientDetails(policyFollowupEntity);
		navigateToRelations(policyFollowupEntity);
		navigateToPayments(policyFollowupEntity);
		navigateToFollowup(policyFollowupEntity);
		navigateToDocument(policyFollowupEntity);
	}





}
