package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ProvisionalPolDetailEntity;

public class PolicyAttributeProvisionalPolicyDetailsPage extends BasePage{

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement provisionalPolicyDetailsPageTitle;;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	private PageElement detailUnderwritingRequiredDropdown;
	private PageElement forwardButton;
	private PageElement typeOfDevlopmentOfficerPageTitle;


	//CG-@Rasika
	private PageElement detailUnderwritingRequiredDropDown;
	private PageElement policySumInsuredTextField;
	private PageElement totalPremiumExcludingTerrorismTextField;
	private PageElement terrorismPremiumIfApplicableTextField;
	private PageElement otherPolicyDetailsTextArea;
	private PageElement anyPolicyNumberReferenceTextField;
	private PageElement locationDetails1TextArea;
	private PageElement locationDetails2TextArea;
	private PageElement locationDetails3TextArea;
	private PageElement locationDetails4TextArea;
	private PageElement addOnCoverDetails1TextArea;
	private PageElement addOnCoverDetails2TextArea;
	private PageElement addOnCoverDetails3TextArea;
	private PageElement addOnCoverDetails4TextArea;
	private PageElement excessForProvisionalPolicyTextArea;
	private PageElement specialConditions1TextArea;
	private PageElement specialConditions2TextArea;
	private PageElement specialConditions3TextArea;
	private PageElement specialConditions4TextArea;
	private PageElement endorsementReasonFireDropDown;
	private PageElement policyExtensionApplicableDropDown;
	private PageElement previousButton;


	public PolicyAttributeProvisionalPolicyDetailsPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		provisionalPolicyDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Provisional Policy Details')]"), "Provisional Policy Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		detailUnderwritingRequiredDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Detail Underwriting Required", "select")), "Detail Underwriting Required Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);



		//CG-@Rasika
		detailUnderwritingRequiredDropDown =  new PageElement(By.xpath(locatorforQuestionAnswerPanel("Detail Underwriting Required", "select")), "Select Detail Underwriting Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policySumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Sum Insured", "input"))," Policy Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumExcludingTerrorismTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Premium(excluding Terrorism)", "input"))," Total Premium Excluding Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		terrorismPremiumIfApplicableTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Terrorism Premium(if applicable)", "input"))," Terrorism Premium If Applicable TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherPolicyDetailsTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Policy Details", "textarea"))," Other Policy Details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyPolicyNumberReferenceTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Any Policy Number Reference", "input")),"Any Policy Number Reference TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails1TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location Details1", "textarea"))," Location Details1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location Details2", "textarea"))," Location Details2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location Details3", "textarea"))," Location Details3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails4TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location Details4", "textarea"))," Location Details4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addOnCoverDetails1TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Add on Cover Details1", "textarea"))," Add On Cover Details1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addOnCoverDetails2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Add on Cover Details2", "textarea"))," Add On Cover Details2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addOnCoverDetails3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Add on Cover Details3", "textarea"))," Add On Cover Details3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addOnCoverDetails4TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Add on Cover Details4", "textarea"))," Add On Cover Details4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForProvisionalPolicyTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for Provisional Policy", "textarea"))," Excess For Provisional Policy TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions1TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1", "textarea"))," Special Conditions1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions2TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2", "textarea"))," Special Conditions2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions3TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions3", "textarea"))," Special Conditions3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions4TextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions4", "textarea"))," Special Conditions4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		endorsementReasonFireDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Endorsement Reason (Fire)", "select")), "Select Endorsement Reason (Fire) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyExtensionApplicableDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy extension applicable", "select")), "Select Policy extension applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);



	}

	public void fillPolicyAttributeProvisionalPolicyDetails(ProvisionalPolDetailEntity provisionalPolDetailEntity, CustomAssert assertReference){
		if(provisionalPolDetailEntity.getAction().equalsIgnoreCase("add") || provisionalPolDetailEntity.getAction().equalsIgnoreCase("edit")){

			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigDetailUnderwritingRequired")) {
				selectValueFromList(detailUnderwritingRequiredDropdown, provisionalPolDetailEntity.getStringValueForField("DetailUnderwritingRequired"));
				switchToFrame("display");
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPolicySumInsured")) {
				clearAndSendKeys(policySumInsuredTextField, provisionalPolDetailEntity.getStringValueForField("PolicySumInsured"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigTotalPremium")) {
				clearAndSendKeys(totalPremiumExcludingTerrorismTextField, provisionalPolDetailEntity.getStringValueForField("TotalPremium"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigTerrorismPremium")) {
				clearAndSendKeys(terrorismPremiumIfApplicableTextField, provisionalPolDetailEntity.getStringValueForField("TerrorismPremium"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigOtherPolicyDetails")) {
				clearAndSendKeys(otherPolicyDetailsTextArea, provisionalPolDetailEntity.getStringValueForField("OtherPolicyDetails"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAnyPolicyNumberReference")) {
				clearAndSendKeys(anyPolicyNumberReferenceTextField, provisionalPolDetailEntity.getStringValueForField("AnyPolicyNumberReference"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails1")) {
				clearAndSendKeys(locationDetails1TextArea, provisionalPolDetailEntity.getStringValueForField("LocationDetails1"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails2")) {
				clearAndSendKeys(locationDetails2TextArea, provisionalPolDetailEntity.getStringValueForField("LocationDetails2"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails3")) {
				clearAndSendKeys(locationDetails3TextArea, provisionalPolDetailEntity.getStringValueForField("LocationDetails3"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails4")) {
				clearAndSendKeys(locationDetails4TextArea, provisionalPolDetailEntity.getStringValueForField("LocationDetails4"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails1")) {
				clearAndSendKeys(addOnCoverDetails1TextArea, provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails1"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails2")) {
				clearAndSendKeys(addOnCoverDetails2TextArea, provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails2"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails3")) {
				clearAndSendKeys(addOnCoverDetails3TextArea, provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails3"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails4")) {
				clearAndSendKeys(addOnCoverDetails4TextArea, provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails4"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigExcessForProvisionalPolicy")) {
				clearAndSendKeys(excessForProvisionalPolicyTextArea, provisionalPolDetailEntity.getStringValueForField("ExcessForProvisionalPolicy"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				clearAndSendKeys(specialConditions1TextArea, provisionalPolDetailEntity.getStringValueForField("SpecialConditions1"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				clearAndSendKeys(specialConditions2TextArea, provisionalPolDetailEntity.getStringValueForField("SpecialConditions2"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions3")) {
				clearAndSendKeys(specialConditions3TextArea, provisionalPolDetailEntity.getStringValueForField("SpecialConditions3"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions4")) {
				clearAndSendKeys(specialConditions4TextArea, provisionalPolDetailEntity.getStringValueForField("SpecialConditions4"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("configEndorsementReasonFire")) {
				selectValueFromList(endorsementReasonFireDropDown, provisionalPolDetailEntity.getStringValueForField("EndorsementReasonFire"));
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPolicyExtensionApplicable")) {
				selectValueFromList(policyExtensionApplicableDropDown, provisionalPolDetailEntity.getStringValueForField("PolicyExtensionApplicable"));
			}
		}

		else if(provisionalPolDetailEntity.getAction().equalsIgnoreCase("verify")){
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("SchemeNo"), fetchValueFromFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigDetailsUnderwritingRequiredDropdown")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("DetailsUnderwritingRequiredDropdown"), fetchValueFromList(detailUnderwritingRequiredDropdown), AssertionType.WARNING);
			}

			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigDetailUnderwritingRequired")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("DetailUnderwritingRequired"), fetchValueFromList(detailUnderwritingRequiredDropDown), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPolicySumInsured")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("PolicySumInsured"), fetchValueFromTextFields(policySumInsuredTextField), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumExcludingTerrorismTextField), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigTerrorismPremium")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("TerrorismPremium"), fetchValueFromTextFields(terrorismPremiumIfApplicableTextField), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigOtherPolicyDetails")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("OtherPolicyDetails"), fetchValueFromTextFields(otherPolicyDetailsTextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAnyPolicyNumberReference")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("AnyPolicyNumberReference"), fetchValueFromTextFields(anyPolicyNumberReferenceTextField), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails1")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("LocationDetails1"), fetchValueFromTextFields(locationDetails1TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails2")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("LocationDetails2"), fetchValueFromTextFields(locationDetails2TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails3")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("LocationDetails3"), fetchValueFromTextFields(locationDetails3TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLocationDetails4")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("LocationDetails4"), fetchValueFromTextFields(locationDetails4TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails1")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails1"), fetchValueFromTextFields(addOnCoverDetails1TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails2")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails2"), fetchValueFromTextFields(addOnCoverDetails2TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails3")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails3"), fetchValueFromTextFields(addOnCoverDetails3TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAddOnCoverDetails4")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("AddOnCoverDetails4"), fetchValueFromTextFields(addOnCoverDetails4TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigExcessForProvisionalPolicy")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("ExcessForProvisionalPolicy"), fetchValueFromTextFields(excessForProvisionalPolicyTextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("SpecialConditions1"), fetchValueFromTextFields(specialConditions1TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("SpecialConditions2"), fetchValueFromTextFields(specialConditions2TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions3")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("SpecialConditions3"), fetchValueFromTextFields(specialConditions3TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("ConfigSpecialConditions4")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("SpecialConditions4"), fetchValueFromTextFields(specialConditions4TextArea), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("configendorsementReasonFire")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("endorsementReasonFire"), fetchValueFromTextFields(endorsementReasonFireDropDown), AssertionType.WARNING);
			}
			if (provisionalPolDetailEntity.getBooleanValueForField("configpolicyExtensionApplicable")) {
				assertReference.assertEquals(provisionalPolDetailEntity.getStringValueForField("policyExtensionApplicable"), fetchValueFromTextFields(policyExtensionApplicableDropDown), AssertionType.WARNING);
			}
		}
	}

	private void clickOnForwardButton(ProvisionalPolDetailEntity provisionalPolDetailEntity) {
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigForwordButton")){
			if(!((provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PE"))||(provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PX")))){
				click(forwardButton);
				try{
					if(!(provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("CG")))
					{
						acceptAlertAndReturnConfirmationMessage();
					}
					//acceptAlertAndReturnConfirmationMessage();
				}
				catch(Exception e){
				}
				switchToFrame("display");
				/*typeOfDevlopmentOfficerPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+provisionalPolDetailEntity.getStringValueForField("PolicyNextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(typeOfDevlopmentOfficerPageTitle);*/
			}
			if ((provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PE") && provisionalPolDetailEntity.getBooleanValueForField("ConfigEndorse"))||((provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PU"))&&provisionalPolDetailEntity.getBooleanValueForField("ConfigEndorse"))){	
				click(forwardButton);
			}
		}
	}

	public void navigateToPolicy(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);

		}
	}
	public void navigateToFollowup(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(ProvisionalPolDetailEntity provisionalPolDetailEntity){
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	private void workAroundForPE(ProvisionalPolDetailEntity provisionalPolDetailEntity) {
		if (provisionalPolDetailEntity.getBooleanValueForField("ConfigEndorse")){		
			click(previousButton);
			switchToFrame("display");
		}	
	}
	public void fillandSubmitPolicyAttributeProvisionalPolicyDetails(ProvisionalPolDetailEntity provisionalPolDetailEntity, CustomAssert assertReference) {
		if(isConfigTrue(provisionalPolDetailEntity.getConfigExecute())){
			switchToFrame("display");
			if(provisionalPolDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PE")){
				workAroundForPE(provisionalPolDetailEntity);
			}		
			fillPolicyAttributeProvisionalPolicyDetails(provisionalPolDetailEntity, assertReference);
			clickOnForwardButton(provisionalPolDetailEntity);
			navigateToPolicy(provisionalPolDetailEntity);
			navigateToAttribute(provisionalPolDetailEntity);
			navigateToMember(provisionalPolDetailEntity);
			navigateToCoverage(provisionalPolDetailEntity);
			navigateToLoan(provisionalPolDetailEntity);
			navigateToClientDetails(provisionalPolDetailEntity);
			navigateToRelation(provisionalPolDetailEntity);
			navigateToPayment(provisionalPolDetailEntity);
			navigateToFollowup(provisionalPolDetailEntity);
			navigateToDocument(provisionalPolDetailEntity);
		}
	}
}

