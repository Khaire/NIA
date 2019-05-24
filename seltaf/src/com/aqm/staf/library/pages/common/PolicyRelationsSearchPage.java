package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyCoverageDetailsEntity;
import com.aqm.staf.library.databin.PolicyCoverageListEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyRelationsSearchPage extends BasePage {

	private PageElement policyRelationsTitle;
	private PageElement policyRelationDetailTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberCodeLinkTextField;

	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	private PageElement detailsTab;
	private PageElement propertyTab;
	private PageElement newButton;
	private PageElement deleteButton;
	private PageElement backButton;
	private PageElement partyCodeLink;
	private PageElement partyCodeCheckBox;
	private String partyCode;

	private PageElement partyCheckbox;
	private PageElement tpCheckbox;
	private PageElement delButton;


	public PolicyRelationsSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"),"Policy Relations Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relation Detail')]"), "Policy Relation Detail Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		insuredInterestTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		loanTitle= new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		clientDetailsTitle=new PageElement(By.linkText("Client Details"),"Client Details Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailsTab = new PageElement(By.linkText("Details"), "Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		propertyTab = new PageElement(By.linkText("Property"), "Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Member Details')]"), "Policy Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRelations","Quote")),"QuoteNoLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRelations", "No.")), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRelations","Status")),"StatusLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRelations","Policyholder")),"PolicyholderLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRelations","Product")),"ProductLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton=new PageElement(By.name("BiLingual_New"),"New Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton=new PageElement(By.name("BiLingual_Delete"),"Delete Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partyCodeCheckBox = new PageElement(By.name("pCheckbox"),"Party Check Box",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		tpCheckbox=new PageElement(By.xpath("/html/body/form[1]/font/b/table/tbody/tr/td/table/tbody/tr[2]/td[1]/input"),"Party Check Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
        delButton=new PageElement(By.xpath("/html/body/form[1]/table[3]/tbody/tr/td[2]/div/input"),"Del Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	
	public void fillPolicyRelationSearchDetail(PolicyRelationDetailEntity policyRelationDetailEntity){
		if(policyRelationDetailEntity.getAction().equalsIgnoreCase("verify") || policyRelationDetailEntity.getAction().equalsIgnoreCase("edit")){
			//selectSearchRelationsPartyCode(policyRelationDetailEntity);
			if(policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
				checkPartyCodeCheckBox(policyRelationDetailEntity);
			}
		}
	}

	public void navigateToPolicyTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigInsuredInterestTab"))		{
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToDetailsTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigDetailsTab")){
			click(detailsTab);
			switchToFrame("display");
			isElementDisplayed(policyRelationDetailTitle);
		}
	}
	public void navigateToNewButton(PolicyRelationDetailEntity policyRelationDetailEntity){
		if(policyRelationDetailEntity.getAction().equalsIgnoreCase("add")){
			if (policyRelationDetailEntity.getBooleanValueForField("ConfigNewButton")){
				click(newButton);
				switchToFrame("display");
				isElementDisplayed(policyRelationDetailTitle);
			}
		}
	}
	public void deletePolicyRelationButton(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}
	public void backFromPolicyRelationsPage(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void selectSearchRelationsPartyCode(PolicyRelationDetailEntity policyRelationDetailEntity){
		String relationText = null;
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigSearchrPartyCode")){
			switchToFrame("display");
			partyCode=policyRelationDetailEntity.getStringValueForField("PartyCode");
			if(policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")) 
			{
				if((policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("TF")) || (policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("TG")))
				{
					relationText=" (Billing Party)";
					partyCode = partyCode.trim().concat(relationText);
				}
			}
			partyCodeLink=new PageElement(By.linkText(partyCode), "Policy Relations Page", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(partyCodeLink);
			switchToFrame("display");
		
	}
}

	public void checkPartyCodeCheckBox(PolicyRelationDetailEntity policyRelationDetailEntity){
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigCheckCheckbox")){
			partyCheckbox=new PageElement(By.xpath("//a/font[contains(text(),'"+policyRelationDetailEntity.getStringValueForField("PartyCode")+"')]/preceding::*[1]"), "Party Code Checkbox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			check(partyCheckbox);
			switchToFrame("display");
		}
	}

	public void fillAndSubmitPartyRelationsSearchDetails(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		if(isConfigTrue(policyRelationDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyRelationSearchDetail(policyRelationDetailEntity );
			if(policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("FM")||policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("UH")) {
			    	check(tpCheckbox);
			    	click(delButton);
					Thread.sleep(3000);
				}
			navigateToNewButton(policyRelationDetailEntity);
			selectSearchRelationsPartyCode(policyRelationDetailEntity);
			deletePolicyRelationButton(policyRelationDetailEntity);
		}
	}
}
