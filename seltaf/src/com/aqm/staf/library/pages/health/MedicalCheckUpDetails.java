package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MedicalCheckUpDetailsEntity;
import com.aqm.staf.library.databin.OptionalTPARuleEntity;
import com.aqm.staf.library.databin.PolMemStrtDateForMemEntity;
import com.aqm.staf.library.databin.PortabilityEntity;

public class MedicalCheckUpDetails extends BasePage {

	private PageElement medicalCheckUpDetailsTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement quoteNoLabel;
	// tabs
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;

	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;


	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement isFamilyDiscountApplicableDropdown;
	private PageElement	whetherPreMedicalCheckUpHasBeenDoneDropdown;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement coPaymentSCTitle;
	private PageElement MemberDetailsSCT1PLRTitle;
	private PageElement memberAttriubutesTitle;

	private PageElement policyMemberDetailsTitle;
	private PageElement memberRelationTitle;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;

	public MedicalCheckUpDetails(WebDriver driver,String pageName) {
		super(driver, pageName);
		//TITLE
		medicalCheckUpDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Medical Check Up Detail')]"), "Medical Check Up Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberAttriubutesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Attriubutes')]"), "Member AttriubutesTitle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coPaymentSCTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Co Payment SC')]"), "Co Payment SC Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//TABS
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isFamilyDiscountApplicableDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Family Discount Applicable", "select")), "Is Family Discount Applicable Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherPreMedicalCheckUpHasBeenDoneDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Pre Medical Check Up Has Been Done?", "select")), "Whether Pre Medical Check Up Has Been Done? Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		policyMemberDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle=new PageElement(By.xpath("//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationTitle=new PageElement(By.xpath("//b[contains(text(),'Member Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);



		//BUTTON
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "PreviousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}

	public void fillMedicalCheckUpDetailsAttribute(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity, CustomAssert assertReference){
		if(medicalCheckUpDetailsEntity.getAction().equalsIgnoreCase("add") || medicalCheckUpDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigIsFamilyDiscountApplicable")) {
				selectValueFromList(isFamilyDiscountApplicableDropdown, medicalCheckUpDetailsEntity.getStringValueForField("IsFamilyDiscountApplicable"));
				click(forwordButton);
				switchToFrame("display");
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigWhetherPreMedicalCheckUpHasBeenDone")) {
				selectValueFromList(whetherPreMedicalCheckUpHasBeenDoneDropdown, medicalCheckUpDetailsEntity.getStringValueForField("WhetherPreMedicalCheckUpHasBeenDone"));
			}
		}
		else if(medicalCheckUpDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberCoode")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("MemberCoode"), fetchValueFromFields(memberCodeLabel),AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("SerialNo"), fetchValueFromFields(memberSerialNoLabel),AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigIsFamilyDiscountApplicable")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("IsFamilyDiscountApplicable"),fetchValueFromList(isFamilyDiscountApplicableDropdown), AssertionType.WARNING);
			}
			if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigWhetherPreMedicalCheckUpHasBeenDone")) {
				assertReference.assertEquals(medicalCheckUpDetailsEntity.getStringValueForField("WhetherPreMedicalCheckUpHasBeenDone"),fetchValueFromList(whetherPreMedicalCheckUpHasBeenDoneDropdown), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicyTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetail1Tab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(detail1Title);
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void navigateToAttributes1Tab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberAttributesTab")){
			click(attributes1Title);
			isElementDisplayed(memberAttriubutesTitle);
		}
	}
	public void navigateToAttachCoverageTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(attachCoverageTitle);
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelationTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(relations1Title);
			isElementDisplayed(memberRelationTitle);
		}
	}
	public void navigateToPaymentTab(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(payments1Title);
			isElementDisplayed(memberPaymentListTitle);
		}
	}

	public void navigateToforwardMemberPage(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
			/*isElementDisplayed(coPaymentSCTitle);*/
		}
	}
	public void navigateToPreviousMemberePage(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigPreviousButton")){			
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(MemberDetailsSCT1PLRTitle);
		}
	}
	public void navigateToBackMemberPage(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity){
		if (medicalCheckUpDetailsEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttriubutesTitle);
		}
	}
	public void fillMedicalCheckUpDetails(MedicalCheckUpDetailsEntity medicalCheckUpDetailsEntity, CustomAssert assertReference){
		if(isConfigTrue(medicalCheckUpDetailsEntity.getConfigExecute())){
			switchToFrame("display");

			fillMedicalCheckUpDetailsAttribute(medicalCheckUpDetailsEntity,assertReference);
			navigateToforwardMemberPage(medicalCheckUpDetailsEntity);
			navigateToPreviousMemberePage(medicalCheckUpDetailsEntity);
			navigateToBackMemberPage(medicalCheckUpDetailsEntity);
			navigateToPolicyTab(medicalCheckUpDetailsEntity);
			navigateToAttributeTab(medicalCheckUpDetailsEntity);
			navigateToInsuredInterestTab(medicalCheckUpDetailsEntity);
			navigateToCoverageTab(medicalCheckUpDetailsEntity);
			navigateToClientDetailsTab(medicalCheckUpDetailsEntity);
			navigateToRelationsTab(medicalCheckUpDetailsEntity);
			navigateToPaymentsTab(medicalCheckUpDetailsEntity);
			navigateToFollowupTab(medicalCheckUpDetailsEntity);
			navigateToPaymentsTab(medicalCheckUpDetailsEntity);
			navigateToFollowupTab(medicalCheckUpDetailsEntity);
			navigateToDocumentTab(medicalCheckUpDetailsEntity);
			navigateToDetail1Tab(medicalCheckUpDetailsEntity);
			navigateToAttributes1Tab(medicalCheckUpDetailsEntity);
			navigateToAttachCoverageTab(medicalCheckUpDetailsEntity);
			navigateToRelationTab(medicalCheckUpDetailsEntity);
			navigateToPaymentTab(medicalCheckUpDetailsEntity);
		}
	}

}
















