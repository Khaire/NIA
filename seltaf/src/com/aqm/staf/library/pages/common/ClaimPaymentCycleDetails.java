package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

import com.aqm.staf.library.databin.ClaimPaymentCycleEntity;


public class ClaimPaymentCycleDetails extends BasePage {
	
	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement claimTabTitle;
	private PageElement memberTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;

	private PageElement claimNoLabel;
	private PageElement policyNoLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;

	private PageElement paymentReferenceNoTextField;
	private PageElement paymentAmountTextField;
	private PageElement actualPaymentDateTextField;
	private PageElement paymentAmountDueTextField;
	private PageElement PaymentDueDateTextField;
	private PageElement statusDropDown;
	private PageElement backButton;


	public ClaimPaymentCycleDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	
		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "MemberDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	
		claimNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Claim"))," Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Number")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Code")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("S0545", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//after Claim Settled following fields add on same Page
		paymentReferenceNoTextField= new PageElement(By.xpath(locatorforPanel("Payment", "input")), "Payment Reference No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentAmountTextField= new PageElement(By.xpath(locatorforPanel("Amount", "input")), "Payment Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		actualPaymentDateTextField= new PageElement(By.xpath(locatorforPanel("Actual", "input")), "Actual Payment Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentAmountDueTextField= new PageElement(By.xpath(locatorforPanel("Due", "input")), "Payment Amount Due", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PaymentDueDateTextField= new PageElement(By.xpath(locatorforPanel("Payment Due Date", "input")), "Payment Due Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusDropDown=new PageElement(By.xpath(locatorforPanel("Status", "select")), "Select status", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		backButton=new PageElement(By.name("Back"), "Go to Attribute Page Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillClaimPaymentCycleDetails(ClaimPaymentCycleEntity claimPaymentcycleEntity, CustomAssert assertReference){
		ClaimPaymentCycleEntity actualclaimPaymentcycleEntity=new ClaimPaymentCycleEntity();
		if(claimPaymentcycleEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigClaimNumber")) {
				actualclaimPaymentcycleEntity.setStringValueForField("ClaimNumber", fetchValueFromTextFields(claimNoLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("ClaimNumber"),actualclaimPaymentcycleEntity.getStringValueForField("ClaimNumber"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PolicyNumber", fetchValueFromTextFields(policyNoLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("PolicyNumber"),actualclaimPaymentcycleEntity.getStringValueForField("PolicyNumber"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigClaimDate")) {
				actualclaimPaymentcycleEntity.setStringValueForField("ClaimDate", fetchValueFromTextFields(claimDateLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("ClaimDate"),actualclaimPaymentcycleEntity.getStringValueForField("ClaimDate"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigClaimStatus")) {
				actualclaimPaymentcycleEntity.setStringValueForField("ClaimStatus", fetchValueFromTextFields(claimStatusLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("ClaimStatus"),actualclaimPaymentcycleEntity.getStringValueForField("ClaimStatus"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigProductCode")) {
				actualclaimPaymentcycleEntity.setStringValueForField("ProductCode", fetchValueFromTextFields(productCodeLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("ProductCode"),actualclaimPaymentcycleEntity.getStringValueForField("ProductCode"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				actualclaimPaymentcycleEntity.setStringValueForField("CauseOfLoss", fetchValueFromTextFields(causeOfLossLabel));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("CauseOfLoss"),actualclaimPaymentcycleEntity.getStringValueForField("CauseOfLoss"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentReferenceNo")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PaymentReferenceNo", fetchValueFromTextFields(paymentReferenceNoTextField));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("PaymentReferenceNo"),actualclaimPaymentcycleEntity.getStringValueForField("PaymentReferenceNo"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentAmount")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PaymentAmount", fetchValueFromTextFields(paymentAmountTextField));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("PaymentAmount"),actualclaimPaymentcycleEntity.getStringValueForField("PaymentAmount"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigActualPaymentDate")) {
				actualclaimPaymentcycleEntity.setStringValueForField("ActualPaymentDate", fetchValueFromTextFields(actualPaymentDateTextField));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("ActualPaymentDate"),actualclaimPaymentcycleEntity.getStringValueForField("ActualPaymentDate"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentAmountDue")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PaymentAmountDue", fetchValueFromTextFields(paymentAmountDueTextField));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("PaymentAmountDue"),actualclaimPaymentcycleEntity.getStringValueForField("PaymentAmountDue"), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentDueDate")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PaymentDueDate", fetchValueFromTextFields(PaymentDueDateTextField));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField(""),actualclaimPaymentcycleEntity.getStringValueForField(""), AssertionType.WARNING);
			}
			if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentCycleStatus")) {
				actualclaimPaymentcycleEntity.setStringValueForField("PaymentCycleStatus", fetchValueFromTextFields(statusDropDown));
				assertReference.assertEquals(claimPaymentcycleEntity.getStringValueForField("PaymentCycleStatus"),actualclaimPaymentcycleEntity.getStringValueForField("PaymentCycleStatus"), AssertionType.WARNING);
			}
				
		}
	}
	public void navigateToBackPage(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigBackButton")){		
		click(backButton);
		switchToFrame("display");
		if(isElementDisplayed(attributesTabTitle));
		return;
		}
	}	
	public void navigateToclaimHomePage(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigClaimTab")){		
		click(claimTab);
		switchToFrame("display");
		if(isElementDisplayed(claimTabTitle));
		return;
		}
	}

	public void navigateToMember(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigMemberTab")){		
		click(memberTab);
		switchToFrame("display");
		if(isElementDisplayed(memberTabTitle));
		return;
		}
	}
	public void navigateToDocument(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigDocumentTab")){		
		click(documentTab);
		switchToFrame("display");
		if(isElementDisplayed(documentTabTitle));
		return;
		}
	}
	public void navigateToParties(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPartiesTab")){		
		click(partiesTab);
		switchToFrame("display");
		if(isElementDisplayed(partiesTabTitle));
		return;
		}
	}
	public void navigateToReserve(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigReserveTab")){		
		click(reserveTab);
		switchToFrame("display");
		if(isElementDisplayed(reserveTabTitle));
		return;
		}
	}

	public void navigateToPayment(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigPaymentTab")){		
		click(paymentTab);
		switchToFrame("display");
		if(isElementDisplayed(paymentTabTitle));
		return;	
		}
	}

	public void navigateToAttribute(ClaimPaymentCycleEntity claimPaymentcycleEntity){
		if (claimPaymentcycleEntity.getBooleanValueForField("ConfigAttributesTab")){		
		click(attributesTab);
		switchToFrame("display");
		if(isElementDisplayed(attributesTabTitle));
		return;	
		}
	}
	public void fillAndSubmitPaymentCycleDetails(ClaimPaymentCycleEntity claimPaymentcycleEntity,CustomAssert assertReference){
		fillClaimPaymentCycleDetails(claimPaymentcycleEntity, assertReference);
		navigateToBackPage(claimPaymentcycleEntity);
		navigateToclaimHomePage(claimPaymentcycleEntity);
		navigateToMember(claimPaymentcycleEntity);
		navigateToDocument(claimPaymentcycleEntity);
		navigateToParties(claimPaymentcycleEntity);
		navigateToReserve(claimPaymentcycleEntity);
		navigateToPayment(claimPaymentcycleEntity);
		navigateToAttribute(claimPaymentcycleEntity);
	}
}
