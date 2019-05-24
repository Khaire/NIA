package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyMemberRelationsEntity;

public class PolicyMemberRelationsDetailPage extends BasePage{

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
	private PageElement detailTitle;
	private PageElement attributesTitle;
	private PageElement attachCoveragesTitle;
	private PageElement memRelationsTitle;
	private PageElement memPaymentsTitle;
	private PageElement fundTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentListTitle;
	private PageElement memberRelationsDetailTitle;
	private PageElement propertyTitle;
	private PageElement schemeInsuredInterestRelationsTitle;
	private PageElement schemePartyTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement schemeholderLabel;
	private PageElement	statusLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement stakeCodeTextField;
	private PageElement stakeNameTextField;
	private PageElement partyCodeTextField;
	private PageElement partyNameTextField;
	private PageElement saveButton;
	private PageElement backButton;


	public PolicyMemberRelationsDetailPage(WebDriver driver,String pageName) {
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
		detailTitle = new PageElement(By.xpath("//div/b[contains(text(),'Detail')]"), "Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div/b[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesTitle = new PageElement(By.xpath("//div/b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memRelationsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memPaymentsTitle = new PageElement(By.xpath("//div/b[contains(text(),'Payments')]"), "Paymements Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fundTitle = new PageElement(By.xpath("//div/b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Policy Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsDetailTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Detail')]"), "Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		propertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		schemeInsuredInterestRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Insured Interest Relations')]"), "Scheme Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemePartyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Party')]"), "Scheme Party Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Quote No.")), "Quote No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Schemeholder")), "Schemeholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskRelationDetails", "Member Serial No.")), "Member Serial No. Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stakeCodeTextField = new PageElement(By.name("pStakeCode"), "Stake Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeNameTextField = new PageElement(By.name("pStakeName"), "Stake Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameTextField = new PageElement(By.name("pPartyName"), "Party Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void navigateToPolicy(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyOrQuoteDetailsTitle));
			return;
		}
	}

	public void navigateToAttribute(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyAttributesTitle));
			return;
		}
	}

	public void navigateToMember(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyInsuredInterestTitle));
			return;
		}
	}
	public void navigateToCoverage(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyCoverageListTitle));
			return;
		}
	}

	public void navigateToClientDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeDetailTitle));
			return;
		}
	}
	public void navigateToRelations(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyRelationsTitle));
			return;
		}
	}
	public void navigateToPayments(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyPaymentListTitle));
			return;
		}
	}
	public void navigateToFollowup(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			if(isElementDisplayed(quoteOrpolicyTitle));
			return;
		}
	}
	public void navigateToDocument(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyDocumentTitle));
			return;
		}
	}
	public void navigateToDetail(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigDetailTab")) {
			click(detailTitle);
			switchToFrame("display");
			if(isElementDisplayed(policyMemberDetailsTitle));
			return;
		}
	}
	public void navigateToAttributes(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberAttributesTitle));
			return;
		}
	}
	public void navigateToAttachCoverages(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
			click(attachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemberRelations(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
			click(memRelationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitle));
			return;
		}
	}
	public void navigateToMemberPayments(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
			click(memPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	public void navigateToMemberRelationsDetail(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberRelationsDetailTab")) {
			click(memberRelationsDetailTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemeInsuredInterestRelationsTitle));
			return;
		}
	}

	public void navigateToMemberRelationsProperty(PolicyMemberRelationsEntity policyMemberRelationsEntity){
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPropertyTab")) {
			click(propertyTitle);
			switchToFrame("display");
			if(isElementDisplayed(schemePartyTitle));
			return;
		}
	}

	public void fillPolicyMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberRelationsEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(policyMemberRelationsEntity.getAction().equalsIgnoreCase("add") || policyMemberRelationsEntity.getAction().equalsIgnoreCase("edit")){
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStakeCode")) {
					String stakeCode=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(stakeCodeTextField,stakeCode);
					policyMemberRelationsEntity.setStringValueForField("StakeCode",stakeCode );
				}


				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStakeName")) {
					String stakeName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(stakeNameTextField,stakeName);
					policyMemberRelationsEntity.setStringValueForField("StakeName",stakeName );
				}


				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPartyCode")) {
					String partyCode=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(partyCodeTextField,partyCode);
					policyMemberRelationsEntity.setStringValueForField("PartyCode",partyCode );
				}


				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPartyName")) {
					String partyName=RandomCodeGenerator.autoNameGenerator();
					clearAndSendKeys(partyNameTextField,partyName);
					policyMemberRelationsEntity.setStringValueForField("PartyName",partyName );
				}
			}
			else if(policyMemberRelationsEntity.getAction().equalsIgnoreCase("verify")){
				PolicyMemberRelationsEntity actualPolicyMemberRelationsEntity=new PolicyMemberRelationsEntity();
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigQuoteNo")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("QuoteNo"), actualPolicyMemberRelationsEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigProductName")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("ProductName", fetchValueFromFields(productLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("ProductName"), actualPolicyMemberRelationsEntity.getStringValueForField("ProductName"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPolicyholder")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("Policyholder", fetchValueFromFields(schemeholderLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("Policyholder"), actualPolicyMemberRelationsEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStatus")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("Status"), actualPolicyMemberRelationsEntity.getStringValueForField("Status"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberCode")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("MemberCode", fetchValueFromFields(memberCodeLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("MemberCode"), actualPolicyMemberRelationsEntity.getStringValueForField("MemberCode"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("MemberSerialNo", fetchValueFromFields(memberSerialNoLabel));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("MemberSerialNo"), actualPolicyMemberRelationsEntity.getStringValueForField("MemberSerialNo"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStakeCode")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("StakeCode", fetchValueFromTextFields(stakeCodeTextField));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("StakeCode"), actualPolicyMemberRelationsEntity.getStringValueForField("StakeCode"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigStakeName")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("StakeName", fetchValueFromTextFields(stakeNameTextField));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("StakeName"), actualPolicyMemberRelationsEntity.getStringValueForField("StakeName"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPartyCode")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("PartyCode", fetchValueFromTextFields(partyCodeTextField));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("PartyCode"), actualPolicyMemberRelationsEntity.getStringValueForField("PartyCode"), AssertionType.WARNING);
				}
				if (policyMemberRelationsEntity.getBooleanValueForField("ConfigPartyName")) {
					actualPolicyMemberRelationsEntity.setStringValueForField("PartyName", fetchValueFromTextFields(partyNameTextField));
					assertReference.assertEquals(policyMemberRelationsEntity.getStringValueForField("PartyName"), actualPolicyMemberRelationsEntity.getStringValueForField("PartyName"), AssertionType.WARNING);
				}			
			}
		}
	}

	public void submitPolicyMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity) {
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void backFromPolicyMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity) {
		if (policyMemberRelationsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}


	public void fillAndSubmitPolicyMemberRelationsDetails(PolicyMemberRelationsEntity policyMemberRelationsEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillPolicyMemberRelationsDetails(policyMemberRelationsEntity, assertReference);
		submitPolicyMemberRelationsDetails(policyMemberRelationsEntity);
		navigateToPolicy(policyMemberRelationsEntity);
		navigateToAttribute(policyMemberRelationsEntity);
		navigateToMember(policyMemberRelationsEntity);
		navigateToCoverage(policyMemberRelationsEntity);
		navigateToClientDetails(policyMemberRelationsEntity);
		navigateToRelations(policyMemberRelationsEntity);
		navigateToPayments(policyMemberRelationsEntity);
		navigateToFollowup(policyMemberRelationsEntity);
		navigateToDocument(policyMemberRelationsEntity);
		navigateToDetail(policyMemberRelationsEntity);
		navigateToAttributes(policyMemberRelationsEntity);
		navigateToAttachCoverages(policyMemberRelationsEntity);
		navigateToMemberRelations(policyMemberRelationsEntity);
		navigateToMemberPayments(policyMemberRelationsEntity);
		navigateToMemberRelationsDetail(policyMemberRelationsEntity);
		navigateToMemberRelationsProperty(policyMemberRelationsEntity);
	}
}







