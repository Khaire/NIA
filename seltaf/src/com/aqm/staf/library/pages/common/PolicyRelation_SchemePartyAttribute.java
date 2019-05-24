package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.SchemePartyAttributesEntity;

public class PolicyRelation_SchemePartyAttribute extends BasePage{

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

	private PageElement detailsTitle;
	private PageElement attributesTitle;
	private PageElement policyRelationDetailTitle;
	private PageElement schemePartyAttributesTitle;
	private PageElement schemeNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyholderLabel;
	private PageElement productNameLabel;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement stakeCodeLabel;
	private PageElement stakeNameLabel;
	private PageElement houseNumberLabel;
	private PageElement blockAndAreaNameLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement saveButton;
	private PageElement backButton;






	public PolicyRelation_SchemePartyAttribute(WebDriver driver, String pageName) {
		super(driver, pageName);
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

		policyOrQuoteDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		policyInsuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle = new PageElement(By.xpath("//div//b[contains(text(),'')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteOrpolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		detailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyRelationDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relation Detail')]"), "Policy Relation Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemePartyAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Party Attributes')]"), "Scheme Party Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Scheme Number")), "Scheme Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Policy Status")), "Policy Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Product name")), "Product name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Party Code")), "Party Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Party name")), " Party name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stakeCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Stake Code")), "Stake Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stakeNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Stake name")), " Stake name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		houseNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "House Number :")), "House Number : Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		blockAndAreaNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Block & Area Name")), "Block & Area Name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Applicable Event Code")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}



	public void navigateToPolicy(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPolicy")) {
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;
		}
	}

	public void navigateToAttribute(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigAttribute")) {
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}

	public void navigateToMember(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigMember")) {
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverage(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigCoverage")) {
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}

	public void navigateToClientDetails(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigClientDetails")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelations(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigRelations")) {
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPayments(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPayments")) {
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowup(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigFollowup")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;
		}
	}
	public void navigateToDocument(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigDocument")) {
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}

	public void navigateToDetails(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigDetails")) {
			click(detailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationDetailTitle));
			return;
		}
	}

	public void navigateToAttributes(SchemePartyAttributesEntity schemePartyAttributesEntity){
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigAttributes")) {
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemePartyAttributesTitle));
			return;
		}
	}

	public void fillPolicyRelationsSchemePartyAttributesDetails(SchemePartyAttributesEntity schemePartyAttributesEntity, CustomAssert assertReference){
		if(schemePartyAttributesEntity.getAction().equalsIgnoreCase("verify")){
			SchemePartyAttributesEntity actualSchemePartyAttributesEntity=new SchemePartyAttributesEntity();
			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigSchemeNumber")) {
				actualSchemePartyAttributesEntity.setStringValueForField("SchemeNumber", fetchValueFromFields(schemeNumberLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("SchemeNumber"), actualSchemePartyAttributesEntity.getStringValueForField("SchemeNumber"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPolicyStatus")) {
				actualSchemePartyAttributesEntity.setStringValueForField("PolicyStatus", fetchValueFromFields(policyStatusLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("PolicyStatus"), actualSchemePartyAttributesEntity.getStringValueForField("PolicyStatus"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualSchemePartyAttributesEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("Policyholder"), actualSchemePartyAttributesEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigProductName")) {
				actualSchemePartyAttributesEntity.setStringValueForField("ProductName", fetchValueFromFields(productNameLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("ProductName"), actualSchemePartyAttributesEntity.getStringValueForField("ProductName"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPartyCode")) {
				actualSchemePartyAttributesEntity.setStringValueForField("PartyCode", fetchValueFromFields(partyCodeLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("PartyCode"), actualSchemePartyAttributesEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigPartyName")) {
				actualSchemePartyAttributesEntity.setStringValueForField("PartyName", fetchValueFromFields(partyNameLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("PartyName"), actualSchemePartyAttributesEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigStakeCode")) {
				actualSchemePartyAttributesEntity.setStringValueForField("StakeCode", fetchValueFromFields(stakeCodeLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("StakeCode"), actualSchemePartyAttributesEntity.getStringValueForField("StakeCode"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigStakeName")) {
				actualSchemePartyAttributesEntity.setStringValueForField("StakeName", fetchValueFromFields(stakeNameLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("StakeName"), actualSchemePartyAttributesEntity.getStringValueForField("StakeName"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigHouseNumber")) {
				actualSchemePartyAttributesEntity.setStringValueForField("HouseNumber", fetchValueFromFields(houseNumberLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("HouseNumber"), actualSchemePartyAttributesEntity.getStringValueForField("HouseNumber"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigBlockAndAreaName")) {
				actualSchemePartyAttributesEntity.setStringValueForField("BlockAndAreaName", fetchValueFromFields(blockAndAreaNameLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("BlockAndAreaName"), actualSchemePartyAttributesEntity.getStringValueForField("BlockAndAreaName"), AssertionType.WARNING);
			}

			if (schemePartyAttributesEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				actualSchemePartyAttributesEntity.setStringValueForField("ApplicableEventCode", fetchValueFromFields(applicableEventCodeLabel));
				assertReference.assertEquals(schemePartyAttributesEntity.getStringValueForField("ApplicableEventCode"), actualSchemePartyAttributesEntity.getStringValueForField("ApplicableEventCode"), AssertionType.WARNING);
			}
		}
	}


	public void backFromPolicyRelationsSchemePartyAttributesDetails(SchemePartyAttributesEntity schemePartyAttributesEntity) {
		if (schemePartyAttributesEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationDetailTitle));
			return;
		}
	}

	public void fillAndSubmitPolicyRelationsSchemePartyAttributesDetails(SchemePartyAttributesEntity schemePartyAttributesEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyRelationsSchemePartyAttributesDetails(schemePartyAttributesEntity,  assertReference);
		navigateToPolicy(schemePartyAttributesEntity);
		navigateToAttribute(schemePartyAttributesEntity);
		navigateToMember(schemePartyAttributesEntity);
		navigateToCoverage(schemePartyAttributesEntity);
		navigateToClientDetails(schemePartyAttributesEntity);
		navigateToRelations(schemePartyAttributesEntity);
		navigateToPayments(schemePartyAttributesEntity);
		navigateToFollowup(schemePartyAttributesEntity);
		navigateToDocument(schemePartyAttributesEntity);
		navigateToDetails(schemePartyAttributesEntity);
		navigateToAttributes(schemePartyAttributesEntity);


	}
}































