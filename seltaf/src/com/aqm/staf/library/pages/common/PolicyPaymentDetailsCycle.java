package com.aqm.staf.library.pages.common;

import org.apache.poi.ss.formula.functions.Index;
import org.hibernate.mapping.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovAtrEntity;
import com.aqm.staf.library.databin.PolicyPaymDetailsCycleEntity;

import java.awt.Point;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
//import antlr.collections.List;


public class PolicyPaymentDetailsCycle extends BasePage{

	private PageElement policyPaymentDetailsTitle;
	private PageElement policyPaymentCyclePageTitle;
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
	private PageElement paymentDetailTitle;
	private PageElement paymentCycleTitle;
	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement partyCodeLabel;
	private PageElement partyFunctionLabel;
	private PageElement paymentAmountLabel;
	private PageElement purposeLabel;
	private PageElement unpaidAmountLabel;
	private PageElement paymentTypeLabel;
	private PageElement paymentModeLabel;
	private PageElement paymentUnpaidNoLabel;
	private PageElement backPolicyDetailsButton;
	private PageElement backPolicyCyclePageButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement paymentCyclePageTitle;
	//Payment Cycle Page
	private PageElement policyNoPolicyCycleLabel;
	private PageElement quoteNoPolicyCycleLabel;
	private PageElement statusPolicyCycleLabel;
	private PageElement policyHolderPolicyCycleLabel;
	private PageElement productPolicyCycleLabel;
	private PageElement partyCodePolicyCycleLabel;
	private PageElement functionCodePolicyCycleLabel;
	private PageElement paymentTypePolicyCycleLabel;
	private PageElement purposePolicyCycleLabel;
	private PageElement paymentTypeLink;
	private PageElement referenceNoOnPolicyCycle;

	private PageElement paymentsTabTitle;

	public PolicyPaymentDetailsCycle(WebDriver driver, String pageName,int rowCount) {
		super(driver, pageName);

		policyPaymentDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Payment Details')]"), "Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPaymentCyclePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment Cycle')]"), "Policy Payment Cycle Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PolicyDetailsPage
		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentDetailTitle = new PageElement(By.linkText("Payment Detail"), "Payment Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentCycleTitle = new PageElement(By.linkText("Payment Cycle"), "Payment Cycle Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "Quote No.")), "Quote No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "No")), "Policy No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentList", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Party Code")), "Party Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyFunctionLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Party Function")), "Party Function Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	
		paymentAmountLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Payment Amount")), " Payment Amount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		purposeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Purpose")), "Purpose Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		unpaidAmountLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Unpaid Amount")), "Unpaid Amount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTypeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Payment Type")), "Payment Type Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentModeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Payment Mode")), "Payment Mode Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentUnpaidNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyPaymentDetail", "Payment Unpaid No")), "Payment Unpaid No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backPolicyDetailsButton = new PageElement(By.name("Back"), "Back Policy Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//PolicyCyclePage
		policyNoPolicyCycleLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "No.")), "Policy No Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoPolicyCycleLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Quote")), "Quote No Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusPolicyCycleLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Status")), "Status Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderPolicyCycleLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Policyholder")), "Policy Holder Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productPolicyCycleLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodePolicyCycleLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Party Code")), "Party Code Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		functionCodePolicyCycleLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Function Code")), "Function Code Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTypePolicyCycleLabel =new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Payment Type")), "Payment Type Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purposePolicyCycleLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPaymentCycleList", "Purpose")), "Purpose Policy Cycle Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backPolicyCyclePageButton=new PageElement(By.name("Back"), "Back Policy Cycle Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//navigations
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentCyclePageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment Cycle')]"), "Payment Cycle Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//paymentTypeLink=new PageElement(By.xpath("//table[3]//tr/td//tr["+rowCount+"]//a"), "Payment type Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		referenceNoOnPolicyCycle=new PageElement(By.xpath("//table[5]/tbody/tr/td/table/tbody/tr[2]/td[7]"),"Reference No On Policy Payment Cycle" , false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyPaymentDetails(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("add") || policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("edit")){

		}
		else if(policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("verify")){
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPartyCode")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPartyFunction")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PartyFunction"), fetchValueFromFields(partyFunctionLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentAmount")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PaymentAmount"), fetchValueFromFields(paymentAmountLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPurpose")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("Purpose"), fetchValueFromFields(purposeLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigUnpaidAmount")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("UnpaidAmount"), fetchValueFromFields(unpaidAmountLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentType")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PaymentType"), fetchValueFromFields(paymentTypeLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentMode")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PaymentMode"), fetchValueFromFields(paymentModeLabel), AssertionType.WARNING);
			}
			if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentUnpaidNo")) {
				assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PaymentUnpaidNo"), fetchValueFromFields(paymentUnpaidNoLabel), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyPaymentCycle(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentCycleCheck")){

			if(policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("add") || policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("edit")){

			}
			else if(policyPaymDetailsCycleEntity.getAction().equalsIgnoreCase("verify")){
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoPolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoPolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("Status"), fetchValueFromFields(statusPolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPolicyHolder")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderPolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productPolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodePolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigFunctionCode")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("FunctionCode"), fetchValueFromFields(functionCodePolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentType")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("PaymentType"), fetchValueFromFields(paymentTypePolicyCycleLabel), AssertionType.WARNING);
				}
				if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPurpose")) {
					assertReference.assertEquals(policyPaymDetailsCycleEntity.getStringValueForField("Purpose"), fetchValueFromFields(purposePolicyCycleLabel), AssertionType.WARNING);
				}
				if(policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigReferenceNo")){
					policyPaymDetailsCycleEntity.setStringValueForField("ReferenceNo",fetchValueFromFields(referenceNoOnPolicyCycle));
				}
			}
		}
	}
	public void navigateToPolicy(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToPolicyAttribute(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToPolicyMember(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToPolicyCoverage(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToPolicyClientDetils(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToPolicyRelations(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPolicyPayments(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToPolicyFollowup(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToPolicyDocuments(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void navigateToPolicyPaymentDetails(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentDetail")) {
			click(paymentDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentDetailsTitle);
		}
	}
	public void navigateToPolicyPaymentCycle(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentCycle")) {
			click(paymentCycleTitle);
			switchToFrame("display");
			isElementDisplayed(paymentCyclePageTitle);
		}
	}
	public void backButtonPolicyPaymentDetails(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backPolicyDetailsButton);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void backButtonPolicyPaymentCycle(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if (policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backPolicyCyclePageButton);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void selectTypeOfPayment(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity){
		if(policyPaymDetailsCycleEntity.getBooleanValueForField("ConfigPaymentType")){
			String paymentPurpose=policyPaymDetailsCycleEntity.getStringValueForField("Purpose");
			/*String functionCode=policyPaymDetailsCycleEntity.getStringValueForField("PartyFunctionForXpath");
			String paymentType=policyPaymDetailsCycleEntity.getStringValueForField("PaymentType");
			paymentTypeLink=new PageElement(By.xpath("//div/font[contains(text(),'"+paymentPurpose+"')]//preceding::*[contains(text(),'"+functionCode+"')]//preceding::*[contains(text(),'"+paymentType+"')][1]"), "Payment type Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(paymentTypeLink); */
			//Rajesh 19/06/2018 Payment:IN/OUT
			clickOnTypeOnTheBasisOfPurpose(paymentPurpose);
			switchToFrame("display");
			//isElementDisplayed(policyPaymentDetailsTitle);
		}
	}
	public void fillAndSubmitPolicyPaymentDetails(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyPaymDetailsCycleEntity.getConfigExecute())){
			selectTypeOfPayment(policyPaymDetailsCycleEntity);
			fillPolicyPaymentDetails(policyPaymDetailsCycleEntity, assertReference);
			navigateToPolicyPaymentCycle(policyPaymDetailsCycleEntity);
			fillPolicyPaymentCycle(policyPaymDetailsCycleEntity, assertReference);
			backButtonPolicyPaymentCycle(policyPaymDetailsCycleEntity);
			navigateToPolicyPayments(policyPaymDetailsCycleEntity);
			navigateToPolicyPaymentDetails(policyPaymDetailsCycleEntity);
			navigateToPolicy(policyPaymDetailsCycleEntity);
			navigateToPolicyAttribute(policyPaymDetailsCycleEntity);
			navigateToPolicyMember(policyPaymDetailsCycleEntity);
			navigateToPolicyCoverage(policyPaymDetailsCycleEntity);
			navigateToPolicyClientDetils(policyPaymDetailsCycleEntity);
			navigateToPolicyRelations(policyPaymDetailsCycleEntity);
			navigateToPolicyFollowup(policyPaymDetailsCycleEntity);
			navigateToPolicyDocuments(policyPaymDetailsCycleEntity);
			//navigateToPolicyPaymentDetails(policyPaymDetailsCycleEntity);
			//navigateToPolicyPaymentCycle(policyPaymDetailsCycleEntity);
			//backButtonPolicyPaymentCycle(policyPaymDetailsCycleEntity);
			//backButtonPolicyPaymentDetails(policyPaymDetailsEntity);

		}
	}
	public void clickOnTypeOnTheBasisOfPurpose(String purpose) {
		List<WebElement> purposeList=driver.findElements(By.xpath("//table/tbody//tr/td[5]/div/font"));
		int i=0;
		for(WebElement purposeElement:purposeList) {
			i++;
			if(purposeElement.getText().equalsIgnoreCase(purpose)) {
				WebElement element=driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td[2]/div/a"));
				element.click();
				break;
			}
		}
	}


}




