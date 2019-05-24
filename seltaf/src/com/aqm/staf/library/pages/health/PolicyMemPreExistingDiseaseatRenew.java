package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MedicalCheckUpDetailsEntity;
import com.aqm.staf.library.databin.PolMemPreExstngDisesEntity;

public class PolicyMemPreExistingDiseaseatRenew extends BasePage {

	private PageElement preExistingDiseaseatRenewTitle;
	private PageElement memberAttriubutesTitle;
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
	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement	fundTitle;

	//TABS
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	//LABEL
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement startDateForMemberTitle;
	private PageElement coPaymentSCTitle;
	private PageElement preExistingdiseasesApplicableDropdown;


	public PolicyMemPreExistingDiseaseatRenew(WebDriver driver,String pageName) {
		super(driver, pageName);
		//title
		preExistingDiseaseatRenewTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Pre Existing Disease at Renew')]"), "Pre Existing Disease at Renew Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Attriubutes')]"), "Member Attriubutes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		startDateForMemberTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Start date for member')]"), "Start date for member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coPaymentSCTitle= new PageElement(By.xpath("//div//b[contains(text(),'CoPayment SC')]"), "CoPayment SC Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		fundTitle=new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);


		//label
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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

		preExistingdiseasesApplicableDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-Existing diseases Applicable", "select")), "Pre-Existing diseases Applicable Drop Down ", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//button
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	public void fillPolicyMemPreExistingDiseaseatRenew(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity, CustomAssert assertReference){
		if(polMemPreExstngDisesEntity.getAction().equalsIgnoreCase("add") || polMemPreExstngDisesEntity.getAction().equalsIgnoreCase("edit")){

			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigPreExistingdiseasesApplicable")) {
				selectValueFromList(preExistingdiseasesApplicableDropdown, polMemPreExstngDisesEntity.getStringValueForField("PreExistingdiseasesApplicable"));
			}
		}

		else if(polMemPreExstngDisesEntity.getAction().equalsIgnoreCase("verify")){
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigMemberCoode")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("MemberCoode"), fetchValueFromFields(memberCodeLabel),AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("SerialNo"), fetchValueFromFields(memberSerialNoLabel),AssertionType.WARNING);
			}
			if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigPreExistingdiseasesApplicable")) {
				assertReference.assertEquals(polMemPreExstngDisesEntity.getStringValueForField("PreExistingdiseasesApplicable"),fetchValueFromList(preExistingdiseasesApplicableDropdown), AssertionType.WARNING);
			}


		}
	}
	public void navigateToPolicyTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolMemPreExstngDisesEntity PolMemPreExstngDisesEntity){
		if (PolMemPreExstngDisesEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity){
		if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity){
		if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToforwardMemberPage(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity){
		if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			if(polMemPreExstngDisesEntity.getStringValueForField("Product").equalsIgnoreCase("SC")){
				if(polMemPreExstngDisesEntity.getAction().equalsIgnoreCase("verify")){
				click(forwordButton);
			}
		}
		try{
			acceptAlertAndReturnConfirmationMessage();
			switchToFrame("display");

		}catch(Exception e){

		}
		}
		/*isElementDisplayed(startDateForMemberTitle);*/
	}

	public void navigateToPreviousMemberePage(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity){
		if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigPreviousButton")){			
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(coPaymentSCTitle);
		}
	}
	public void navigateToBackMemberPage(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity){
		if (polMemPreExstngDisesEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttriubutesTitle);
		}
	}

	public void fillandsubmitMedicalCheckUpDetails(PolMemPreExstngDisesEntity polMemPreExstngDisesEntity, CustomAssert assertReference){
		if(isConfigTrue(polMemPreExstngDisesEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemPreExistingDiseaseatRenew(polMemPreExstngDisesEntity,assertReference);
			navigateToforwardMemberPage(polMemPreExstngDisesEntity);
			navigateToPreviousMemberePage(polMemPreExstngDisesEntity);
			navigateToBackMemberPage(polMemPreExstngDisesEntity);
			navigateToPolicyTab(polMemPreExstngDisesEntity);
			navigateToAttributeTab(polMemPreExstngDisesEntity);
			navigateToInsuredInterestTab(polMemPreExstngDisesEntity);
			navigateToCoverageTab(polMemPreExstngDisesEntity);
			navigateToClientDetailsTab(polMemPreExstngDisesEntity);
			navigateToRelationsTab(polMemPreExstngDisesEntity);
			navigateToPaymentsTab(polMemPreExstngDisesEntity);
			navigateToFollowupTab(polMemPreExstngDisesEntity);
			navigateToPaymentsTab(polMemPreExstngDisesEntity);
			navigateToFollowupTab(polMemPreExstngDisesEntity);
			navigateToDocumentTab(polMemPreExstngDisesEntity);

		}
	}
}





