package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyDetPNT2POLAviationEntity;

public class PolicyAttributePolicyDetailsPNT2POLAviation  extends BasePage {
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement quoteNoLabel;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList;
	private PageElement hasAnyInsuranceCompanySpecialConditionsDropDownList;
	private PageElement hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList;
	private PageElement doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList;
	private PageElement hasAnyAircraftOwnEdoroperatedbymembersDropDownList;
	private PageElement tableofbenefitsDropDownList;
	private PageElement coInsuranceApplicableDropDownList;
	private PageElement isServiceTaxExemptedDropDownList;
	private PageElement subjecttoclauseSpecialConditionTextarea;
	private PageElement typeofPAclausesDropDownList;
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	public PolicyAttributePolicyDetailsPNT2POLAviation(WebDriver driver,String pageName) {
		super(driver, pageName);

		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Attribute"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	    quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Quote No")),"Quote No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Policy No")),"Policy NoLabel",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Status")),"Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time declined our proposal')]/following::select"),"Has any insurance company at any time declined our proposal",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hasAnyInsuranceCompanySpecialConditionsDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time Required an increased premium or imposed special conditions')]/following::select"), "Has any insurance company at any time Required an increased premium or imposed special conditions",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurance company at any time cancelled or refused to renew the policy')]/following::select"),"Has any insurance company at any time cancelled or refused to renew the policy",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);				
		doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Do you have any other current policy covering this or similar risk')]/following::select"), "Do you have any other current policy covering this or similar risk", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);					

		hasAnyAircraftOwnEdoroperatedbymembersDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members')]/following::select"),"Has any aircraft owned or operated by you ever met with an accident involving injuries to passengers and or crew members",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		tableofbenefitsDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Table of benefits')]/following::select"), "Table of benefits",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		coInsuranceApplicableDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"),"Co-Insurance Applicable",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);				
		isServiceTaxExemptedDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Co-Insurance Applicable Title", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);					
		subjecttoclauseSpecialConditionTextarea=new PageElement(By.xpath("//td//div[contains(text(),'Subject to clause/Special Condition')]/following::textarea"),"Subject to clause/Special Condition",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);				
		typeofPAclausesDropDownList=new PageElement(By.xpath("//td//div[contains(text(),'Type of PA clauses')]/following::select"), "Type of PA clauses Title", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);					

		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Policyholder")),"Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Product")),"Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}


	public void fillPolicyAttributePolicyDetailsPNT2POLAviation(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity, CustomAssert assertReference){
		if(policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(policyDetPNT2POLAviationEntity.getAction().equalsIgnoreCase("add") || policyDetPNT2POLAviationEntity.getAction().equalsIgnoreCase("edit")){

				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsTimeDeclinedourProposal")) {
					clearAndSendKeys(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsTimeDeclinedourProposal"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsurSpecialConditions")) {
					clearAndSendKeys(hasAnyInsuranceCompanySpecialConditionsDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsurSpecialConditions"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsuraCancelledOrRefusedPolicy")) {
					clearAndSendKeys(hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsuraCancelledOrRefusedPolicy"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigDoYouHaveanyOtherCurrentCoveringRisk")) {
					clearAndSendKeys(doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("DoYouHaveanyOtherCurrentCoveringRisk"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyAircraftOwnEdoroperatedMembers")) {
					clearAndSendKeys(hasAnyAircraftOwnEdoroperatedbymembersDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyAircraftOwnEdoroperatedMembers"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigTableofbenefits")) {
					clearAndSendKeys(tableofbenefitsDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("Tableofbenefits"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
					clearAndSendKeys(coInsuranceApplicableDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("CoInsuranceApplicable"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
					clearAndSendKeys(isServiceTaxExemptedDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("IsServiceTaxExempted"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigSubjecttoclauseSpecialCondition")) {
					clearAndSendKeys(subjecttoclauseSpecialConditionTextarea, policyDetPNT2POLAviationEntity.getStringValueForField("SubjecttoclauseSpecialCondition"));
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigTypeofPAclauses")) {
					clearAndSendKeys(typeofPAclausesDropDownList, policyDetPNT2POLAviationEntity.getStringValueForField("TypeofPAclauses"));
				}
			}

			else if(policyDetPNT2POLAviationEntity.getAction().equalsIgnoreCase("verify")){
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel),AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}				
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsTimeDeclinedourProposal")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsTimeDeclinedourProposal"),fetchValueFromList(hasAnyInsuranceCompanyatAnyTimeDeclinedourProposalDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsurSpecialConditions")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsurSpecialConditions"),fetchValueFromList(hasAnyInsuranceCompanySpecialConditionsDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyInsuraCancelledOrRefusedPolicy")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyInsuraCancelledOrRefusedPolicy"),fetchValueFromList(hasAnyInsuranceCompanyCancelledOrRefusedPolicyDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigDoYouHaveanyOtherCurrentCoveringRisk")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("DoYouHaveanyOtherCurrentCoveringRisk"),fetchValueFromList(doYouHaveanyOtherCurrentCoveringThisSimilarRiskDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigHasAnyAircraftOwnEdoroperatedMembers")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("HasAnyAircraftOwnEdoroperatedMembers"),fetchValueFromList(hasAnyAircraftOwnEdoroperatedbymembersDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigTableofbenefits")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("Tableofbenefits"),fetchValueFromList(tableofbenefitsDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("CoInsuranceApplicable"),fetchValueFromList(coInsuranceApplicableDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("IsServiceTaxExempted"),fetchValueFromList(isServiceTaxExemptedDropDownList), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigSubjecttoclauseSpecialCondition")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("SubjecttoclauseSpecialCondition"),fetchValueFromTextFields(subjecttoclauseSpecialConditionTextarea), AssertionType.WARNING);
				}
				if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigTypeofPAclauses")) {
					assertReference.assertEquals(policyDetPNT2POLAviationEntity.getStringValueForField("TypeofPAclauses"),fetchValueFromList(typeofPAclausesDropDownList), AssertionType.WARNING);
				}
			}
		}
	}

	public void navigateToPolicyTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity){
		if (policyDetPNT2POLAviationEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void fillandSubmitfillPolicyAttributePolicyDetailsPNT2POLAviation(PolicyDetPNT2POLAviationEntity policyDetPNT2POLAviationEntity, CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(policyDetPNT2POLAviationEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePolicyDetailsPNT2POLAviation(policyDetPNT2POLAviationEntity, assertReference);
			navigateToPolicyTab(policyDetPNT2POLAviationEntity);
			navigateToAttributeTab(policyDetPNT2POLAviationEntity);
			navigateToInsuredInterestTab(policyDetPNT2POLAviationEntity);
			navigateToCoverageTab(policyDetPNT2POLAviationEntity);
			navigateToClientDetailsTab(policyDetPNT2POLAviationEntity);
			navigateToRelationsTab(policyDetPNT2POLAviationEntity);
			navigateToPaymentsTab(policyDetPNT2POLAviationEntity);
			navigateToFollowupTab(policyDetPNT2POLAviationEntity);
			navigateToDocumentTab(policyDetPNT2POLAviationEntity);
		}
	}
}
