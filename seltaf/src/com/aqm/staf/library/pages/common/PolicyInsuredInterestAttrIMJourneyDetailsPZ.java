package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.IMJourneyDetailsPZEntity;
import com.aqm.staf.library.databin.InsuredMemberDetailEntity;

public class PolicyInsuredInterestAttrIMJourneyDetailsPZ extends BasePage{

	private PageElement policyTitle;
	private PageElement attributesTitle;
	//private PageElement memberTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;

	//Label
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	//private PageElement policyMemberTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;

	private PageElement iMJourneyDetailsPZTitlePage;

	private PageElement placeOfVisitDropDown;
	private PageElement dateOfCommencementOfJourneyTextfield;
	private PageElement expectedDateOfReturnTextField;
	private PageElement actualDateOfReturnTextField;
	private PageElement sumInsuredInUSDTextField;

	private PageElement nextButton;
	private PageElement next2Button;
	private PageElement saveButton;


	public PolicyInsuredInterestAttrIMJourneyDetailsPZ(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " Member Fund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "InterestCode")), "Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")), "Insured Interest Serial Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//PZ
		iMJourneyDetailsPZTitlePage=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "IM Journey Details PZ Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfVisitDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of Visit","select")),"Place of Visit DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		dateOfCommencementOfJourneyTextfield= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of commencement of Journey","input")),"Date of commencement of Journey Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		expectedDateOfReturnTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expected date of return","input")),"Expected date of return Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		actualDateOfReturnTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Actual date of Return","input")),"Actual date of Return Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		sumInsuredInUSDTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD","input")),"Sum Insured in USD Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 

		nextButton=new PageElement(By.name("Next"),"Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		next2Button=new PageElement(By.name("Next"),"Next 2 Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}

	public void fillPolicyInsuredInterestIMJourneyDetailsPZ(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity, CustomAssert assertReference){
		if(iMJourneyDetailsPZEntity.getAction().equalsIgnoreCase("add") || iMJourneyDetailsPZEntity.getAction().equalsIgnoreCase("edit")){
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigPlaceOfVisit")) {
				selectValueFromList(placeOfVisitDropDown, iMJourneyDetailsPZEntity.getStringValueForField("PlaceOfVisit"));
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigDateOfCommencementOfJourney")) {
				String DateOfCommencement=RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("DateOfCommencementOfJourney"));
				clearAndEnterDate(dateOfCommencementOfJourneyTextfield, DateOfCommencement);
			}
			switchToFrame("display");
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigExpectedDateOfReturn")) {
				String ExpectedDate=RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("ExpectedDateOfReturn"));
				clearAndEnterDate(expectedDateOfReturnTextField, ExpectedDate);
			}
			switchToFrame("display");
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigActualDateOfReturn")) {
				String ActualDate=RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("ActualDateOfReturn"));
				clearAndEnterDate(actualDateOfReturnTextField, ActualDate);
			}
			switchToFrame("display");
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigSumInsuredInUSD")) {
				//clearAndSendKeys(sumInsuredInUSDTextField, iMJourneyDetailsPZEntity.getStringValueForField("SumInsuredInUSD"));
			}
		}
		else if(iMJourneyDetailsPZEntity.getAction().equalsIgnoreCase("verify")){
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigPlaceOfVisit")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("PlaceOfVisit"), fetchValueFromList(placeOfVisitDropDown),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigDateOfCommencementOfJourney")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("DateOfCommencementOfJourney")), fetchValueFromTextFields(dateOfCommencementOfJourneyTextfield),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigExpectedDateOfReturn")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("ExpectedDateOfReturn")), fetchValueFromTextFields(expectedDateOfReturnTextField),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigActualDateOfReturn")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(iMJourneyDetailsPZEntity.getStringValueForField("ActualDateOfReturn")), fetchValueFromTextFields(actualDateOfReturnTextField),AssertionType.WARNING);
			}
			if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigSumInsuredInUSD")) {
				assertReference.assertEquals(iMJourneyDetailsPZEntity.getStringValueForField("SumInsuredInUSD"), fetchValueFromTextFields(sumInsuredInUSDTextField),AssertionType.WARNING);
			}
		}
	}


	public void navigateToPolicyTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigFollowupTab")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigDocumentTab")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigDetailTab")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigMemberAttributesTab")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigAttachCoveragesTab")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigMemberRelationTab")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonPolicyMemberAttributehealth(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextButton);
			switchToFrame("display");
			isElementDisplayed(iMJourneyDetailsPZTitlePage);
		}
	}
	public void next2ButtonPolicyMemberAttributehealth(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(next2Button);
			switchToFrame("display");
			isElementDisplayed(iMJourneyDetailsPZTitlePage);
		}
	}
	
	public void clickOnSaveButton(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity){
		if (iMJourneyDetailsPZEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(iMJourneyDetailsPZTitlePage);
		}
	}

	public void fillandSubmitPolicyInsuredInterestAttrIMJourneyDetails(IMJourneyDetailsPZEntity iMJourneyDetailsPZEntity, CustomAssert assertReference) {
		if(isConfigTrue(iMJourneyDetailsPZEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInterestIMJourneyDetailsPZ(iMJourneyDetailsPZEntity, assertReference);
			nextButtonPolicyMemberAttributehealth(iMJourneyDetailsPZEntity);
			next2ButtonPolicyMemberAttributehealth(iMJourneyDetailsPZEntity);
			clickOnSaveButton(iMJourneyDetailsPZEntity);
			navigateToPolicyTab(iMJourneyDetailsPZEntity);
			navigateToAttributeTab(iMJourneyDetailsPZEntity);
			navigateToInsuredInterestTab(iMJourneyDetailsPZEntity);
			navigateToCoverageTab(iMJourneyDetailsPZEntity);
			navigateToLoanTab(iMJourneyDetailsPZEntity);
			navigateToClientDetailsTab(iMJourneyDetailsPZEntity);
			navigateToRelationsTab(iMJourneyDetailsPZEntity);
			navigateToPaymentsTab(iMJourneyDetailsPZEntity);
			navigateToFollowupTab(iMJourneyDetailsPZEntity);
			navigateToDocumentTab(iMJourneyDetailsPZEntity);
			navigateToDetailTab(iMJourneyDetailsPZEntity);
			navigateToMemberAttributesTab(iMJourneyDetailsPZEntity);
			navigateToAttachCoverageTab(iMJourneyDetailsPZEntity);
			navigateToRelations1Tab(iMJourneyDetailsPZEntity);
			navigateToPayments1Tab(iMJourneyDetailsPZEntity);
		}
	}
}