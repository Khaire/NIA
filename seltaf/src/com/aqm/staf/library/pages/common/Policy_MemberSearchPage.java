package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyPartyRoleClaimantEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;
import com.aqm.staf.library.databin.PolicyMember_InsuredEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;

public class Policy_MemberSearchPage extends BasePage {
	private PageElement policyIsuredInterestTitle;
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
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeTextField;
	private PageElement memberNameTextField;
	private PageElement firstNameTextField;
	private PageElement dateOfBirthTextField;
	private PageElement cardMemberNameTextField;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement backButton;
	private PageElement deleteButton;
	private PageElement rcBuilderButton;
	private PageElement riskUploadButton;
	private PageElement viewErrorLogButton;
	private PageElement insuredIntrestTypeTextField;
	private PageElement tagNumberTextField;
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberCodeLinkTextField;
	private String memberCode;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement insuredInterestCoverageTitle;
	private PageElement memberCodeCheckbox;
	private PageElement prorataDeleteButton;
	private PageElement shortTermDeleteButton;
	private String insuredInterestCode;
	private PageElement insuredInterestCodeLinkTextField;
	//PU
	private PageElement memberCodeTextFieldForPU;
	//PH
	private PageElement memberCodeForPHTextField;
	private PageElement sTDRSKForPHTextField;
	private PageElement prawnForBWLink;
	private PageElement cATLForCILink;
	private PageElement cAMLForCALink;
	private PageElement cAMLForCASecondLink;
	private PageElement cAMLSearchForCALink;
	private PageElement cALFSearchLink;
	private PageElement rabbitSearchLink;
	private PageElement fIELDSearchLink;
	private PageElement animalSearchLink;

	private PageElement memberDetailTab;
	private PageElement backToRiskListButton;

	private PageElement memberDeleteBox;
	private PageElement memberDetailTitle;


	public Policy_MemberSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		//Member Search
		policyIsuredInterestTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"),"Policy Insured Interest",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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
		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskList","Quote")),"QuoteNoLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskList","Status")),"StatusLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskList","Policyholder")),"PolicyholderLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskList","Product")),"ProductLabel",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeTextField= new PageElement(By.name("pRiskCode"),"Member Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberNameTextField=new PageElement(By.name("pRiskName"),"Member Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		memberCodeTextFieldForPU=new PageElement(By.name("InsIntrstTyp"),"Member Name TextField For PU",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		firstNameTextField=new PageElement(By.name("firstName"),"First Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfBirthTextField=new PageElement(By.name("dateofBirth"),"Date Of Birth TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cardMemberNameTextField=new PageElement(By.name("lastName"),"Card Member Name TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchButton=new PageElement(By.name("Search"),"Search Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		newButton=new PageElement(By.name("New"),"New Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton=new PageElement(By.name("Delete"),"Delete Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		rcBuilderButton=new PageElement(By.name("RCBuilder"),"RCBuilderButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		riskUploadButton=new PageElement(By.name("RiskUpload"),"Risk Upload Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		viewErrorLogButton=new PageElement(By.name("ViewErrorLog"),"View Error Log Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//Insured Interest Search 	
		insuredIntrestTypeTextField=new PageElement(By.xpath("//b[contains(text(),'Insured Interest Type')]/following::input[1]"),"Insured Intrest Type TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tagNumberTextField=new PageElement(By.name("TagNo"),"Tag Number TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		// tabs search
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		prorataDeleteButton=new PageElement(By.xpath("//input[@name='Pro-RataDelete']"), "prorataDeleteButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		shortTermDeleteButton=new PageElement(By.xpath("//input[@name='ShortTermDelete']"), "shortTermDeleteButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		memberCodeForPHTextField=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'MEMBER')]/preceding::input[1]/following::a"), "Member Code For PH Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sTDRSKForPHTextField=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'STDRSK')]/preceding::input[1]/following::a"), "STDRisk Code For PH Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		prawnForBWLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'PRAWN')]/preceding::input[1]/following::a"), "PRAWN Code For BW Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cATLForCILink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'CATL')]/preceding::input[1]/following::a"), "PRAWN Code For BW Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cAMLForCALink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'CAML')]/preceding::input[1]/following::a"), "Camel Code For CA Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cAMLForCASecondLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//tr[3]//td[3]//a[contains(text(),'CAML')]/preceding::input[1]/following::a"), "Camel Code For CA Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cAMLSearchForCALink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//tr[6]//td[3]//a[contains(text(),'CAML')]/preceding::input[1]/following::a"), "Camel Code For CA Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		cALFSearchLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'CALF')]/preceding::input[1]/following::a"), "Camel Code For CA Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		rabbitSearchLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'RABBIT')]/preceding::input[1]/following::a"), "Camel Code For CA Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		fIELDSearchLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'FIELD')]/preceding::input[1]/following::a"), "FIELD Code For LI Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		animalSearchLink=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'ANIMAL')]/preceding::input[1]/following::a"), "Animal Code For ZI Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		memberDetailTab=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backToRiskListButton=new PageElement(By.xpath("//input[@name='Back to Risk List']"), "backToRiskListButton",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberDetailTitle=new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	

	// Services
	public void navigateToPolicyTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestTab"))		{
			click(insuredInterestTitle);
			switchToFrame("display");
		}
	}
	public void navigateToCoverageTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			//isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToNewButton(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("add")){
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigNewButton")){
				click(newButton);
				switchToFrame("display");
			}
		}
	}
	public void navigateToMemberDetailTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDetailTab")){
			click(memberDetailTitle);
			switchToFrame("display");
			//isElementDisplayed(policyMemberDetailsTitle);
		}
	}

	public void navigateToMemberAttributesTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttributesTab")){
			if (!(policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberAttributesTab"))){
				click(memberAttributesTitle);
				switchToFrame("display");
			}
		}
	}
	public void fillSearchPolicyMemberDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity){

		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberCode")) {
			clearAndSendKeys(memberCodeTextField, policyMemberDetailsEntity.getStringValueForField("MemberCode"));
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberForPH")) {
			click(memberCodeForPHTextField);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchSTDRiskForPH")) {
			click(sTDRSKForPHTextField);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchPrawnForBW")) {
			click(prawnForBWLink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchCATLForCI")) {
			click(cATLForCILink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchCAMLForCA")) {
			click(cAMLForCALink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchCAMLSecondForCA")) {
			click(cAMLForCASecondLink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchCAMLSeachForCA")) {
			click(cAMLSearchForCALink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchCALF")) {
			click(cALFSearchLink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchFIELD")) {
			click(fIELDSearchLink);
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchRabbit")) {
			click(rabbitSearchLink);
		}	
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchAnimal")) {
			click(animalSearchLink);
		}	

		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberCodeForPU")) {
			clearAndSendKeys(memberCodeTextFieldForPU, policyMemberDetailsEntity.getStringValueForField("MemberCode"));
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberName")) {
			clearAndSendKeys(memberNameTextField, policyMemberDetailsEntity.getStringValueForField("MemberName"));
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchFirstName")) {
			clearAndSendKeys(firstNameTextField, policyMemberDetailsEntity.getStringValueForField("FirstName"));
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchDateOfBirth")) {
			clearAndSendKeys(dateOfBirthTextField, policyMemberDetailsEntity.getStringValueForField("DateOfBirth"));
		}
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestType")) {
			clearAndSendKeys(insuredIntrestTypeTextField, policyMemberDetailsEntity.getStringValueForField("InsuredInterestType"));
		}
		if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeMisc")) {
				clearAndSendKeys(memberCodeTextField, policyMemberDetailsEntity.getStringValueForField("MemberCode"));
			}
		}

		/*	if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCardMemberName")) {
			clearAndSendKeys(cardMemberNameTextField, policyMemberDetailsEntity.getStringValueForField("CardMemberName"));
		     }
		    if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestType")) {
			clearAndSendKeys(insuredIntrestTypeTextField, policyMemberDetailsEntity.getStringValueForField("CardMemberName"));
		     }
		     if (policyMemberDetailsEntity.getBooleanValueForField("ConfigTagNumber")) {
			     clearAndSendKeys(tagNumberTextField, policyMemberDetailsEntity.getStringValueForField("TagNumber"));
		     }*/

	}

	public void clickSearchButton(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearch")) {
			click(searchButton);
			switchToFrame("display");
		}
	}

	public void backPolicyListPartyDetails1(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigBack")) {
			click(backButton);
			switchToFrame("display");
			if(policyMemberDetailsEntity.getStringValueForField("Product").equalsIgnoreCase("MI")){ 
				click(backButton);
				switchToFrame("display");
			}
		}
	}

	public void selectSearchMemberCode(PolicyMemberDetailsEntity policyMemberDetailsEntity) throws InterruptedException{
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCheckboxForMemberCode")){
			memberCode=policyMemberDetailsEntity.getStringValueForField("MemberCode");
			memberCodeCheckbox=new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'"+memberCode+"')]/preceding::input[1]"), "Member Code checkbox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			check(memberCodeCheckbox);
			switchToFrame("display");
		}
		else if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberCode")){
			memberCode=policyMemberDetailsEntity.getStringValueForField("MemberCode");
			memberCodeLinkTextField=new PageElement(By.linkText(memberCode), "Member Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			Thread.sleep(1000);
			click(memberCodeLinkTextField);
			switchToFrame("display");
		}
		else if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberCodeForPU")){
			memberCode=policyMemberDetailsEntity.getStringValueForField("MemberCode");
			memberCodeTextFieldForPU=new PageElement(By.linkText(memberCode), "Member Code For PU in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(memberCodeTextFieldForPU);
			switchToFrame("display");
		}
		else if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestType")){
			memberCode=policyMemberDetailsEntity.getStringValueForField("InsuredInterestType");
			insuredIntrestTypeTextField=new PageElement(By.linkText(memberCode), "Insured Interest Type in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(insuredIntrestTypeTextField);
			switchToFrame("display");
		}
		else if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchBuyerCode")){
			String buyerCode = policyMemberDetailsEntity.getStringValueForField("BuyerCode");
			PageElement byuerCodeLinkTextField = new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'"+buyerCode+"')]/preceding::input[1]/following::a"), "Buyer Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(byuerCodeLinkTextField);
			switchToFrame("display");
		}

		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability") && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeMisc")){
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberCode");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'"+insuredInterestCode+"')]/preceding::input[1]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural") && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeRural")){
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberCode");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'"+insuredInterestCode+"')]/preceding::input[1]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance") && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeMicro")){
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//tr//td[contains(text(),'"+insuredInterestCode+"')]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire") && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeFire")){
			String InsuredMemberCode = policyMemberDetailsEntity.getStringValueForField("MemberCode");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//tr//td//a[contains(text(),'"+InsuredMemberCode+"')]"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		//////For Multiple Risk Scenario
		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")&& policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeRuralSW")){
			int tableDataRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//tr["+tableDataRowNumber+"]//td[contains(text(),'"+insuredInterestCode+"')]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		//////For Multiple Risk Check Box
		else if((policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")||policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")) && policyMemberDetailsEntity.getBooleanValueForField("ConfigMultipleCheckbox")){
			int tableDataRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			PageElement insuredInterestCodeCheckbox = new PageElement(By.xpath("//tr["+tableDataRowNumber+"]//td[contains(text(),'"+insuredInterestCode+"')]/preceding::input[1]"), "Insured Interest Code Check Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			check(insuredInterestCodeCheckbox);
			switchToFrame("display");
		}		
		else if((policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")||policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")) && policyMemberDetailsEntity.getBooleanValueForField("ConfigSelectMultipleRisk")){
			int tableRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberCode");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//td//a[contains(text(),'"+insuredInterestCode+"')]/preceding::input[1]/following::a["+tableRowNumber+"]"), "Select Insured Interest Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		//for multiple
		else if((policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability") || policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")) && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeRuralSW")){
			/*int tableDataRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//tr["+tableDataRowNumber+"]//td[contains(text(),'"+insuredInterestCode+"')]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");*/
		
			// For Multiple
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberCode") ;
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//a[contains(text(),'"+insuredInterestCode+"')]"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		
		else if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance") && policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchInsuredCodeMicroins")){
			int tableDataRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//tr["+tableDataRowNumber+"]//td[contains(text(),'"+insuredInterestCode+"')]/following::a"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}

	}


	public void deletePolicyListPartyDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
			switchToFrame("display");
		}

	}
	public void riskUploadPolicyListPartyDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRcBuilderButton")) {
			click(riskUploadButton);
			switchToFrame("display");

		}

	}		
	public void rcBuilderPolicyListPartyDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRiskUploadButton")) {
			click(rcBuilderButton);
			switchToFrame("display");

		}

	}		
	public void viewErrorLogPolicyListPartyDetails(PolicyMember_InsuredEntity PolicyMember_InsuredEntity) {
		if (PolicyMember_InsuredEntity.getBooleanValueForField("ConfigViewErrorLogButton")) {
			click(viewErrorLogButton);
			switchToFrame("display");

		}
	}

	public void clickProrataDeleteButton(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigProrataDeleteButton")) {
			click(prorataDeleteButton);
			switchToFrame("display");
		}
	}

	public void clickShortTermDeleteButton(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigShortTermDeleteButton")) {
			click(shortTermDeleteButton);
			switchToFrame("display");
		}
	}



	public void verifyRiskDelete(PolicyMemberDetailsEntity policyMemberDetailsEntity,CustomAssert assertReference){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigVerifyMemberDelete")) {
			String memberDeleteCode=policyMemberDetailsEntity.getStringValueForField("MemberDeleteCode");
			int tableDataRowNumber = policyMemberDetailsEntity.getIntegerValueForField("TableRowNumber");
			String insuredInterestCode = policyMemberDetailsEntity.getStringValueForField("MemberSerialNo");
			memberDeleteBox = new PageElement(By.xpath("//tr["+tableDataRowNumber+"]//td[contains(text(),'"+insuredInterestCode+"')]/preceding::td[1]"), "Insured Interest Risk with Insured Interest Code "+  insuredInterestCode +" Deleted From Table ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(true,fetchValueFromFields(memberDeleteBox).contains(memberDeleteCode),AssertionType.WARNING);
		}
	}
	////workaround to add two risks in YT product
	public void navigateToMemberSearch(PolicyMemberDetailsEntity policyMemberDetailsEntity) throws InterruptedException {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRedirectMemberSearch")) {
			click(memberDetailTab);
			Thread.sleep(3000);
			click(backToRiskListButton);
			switchToFrame("display");
		}

	}

	public void fillandSearchPolicyMemberDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity,CustomAssert assertReference)throws InterruptedException {
		if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("edit")||policyMemberDetailsEntity.getAction().equalsIgnoreCase("verify")){
			switchToFrame("display");
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberSearch")){ 
				fillSearchPolicyMemberDetails(policyMemberDetailsEntity);
				clickSearchButton(policyMemberDetailsEntity);
			}
			if(!(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")||policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance"))){
				navigateToMemberSearch(policyMemberDetailsEntity);
			}
			//navigateToMemberDetailTab(policyMemberDetailsEntity);
			selectSearchMemberCode(policyMemberDetailsEntity);
			clickProrataDeleteButton(policyMemberDetailsEntity);
			clickShortTermDeleteButton(policyMemberDetailsEntity);
			deletePolicyListPartyDetails(policyMemberDetailsEntity);
			navigateToPolicyTab(policyMemberDetailsEntity);
			navigateToAttributeTab(policyMemberDetailsEntity);
			navigateToInsuredInterestTab(policyMemberDetailsEntity);
			navigateToCoverageTab(policyMemberDetailsEntity);
			navigateToClientDetailsTab(policyMemberDetailsEntity);
			navigateToRelationsTab(policyMemberDetailsEntity);
			navigateToPaymentsTab(policyMemberDetailsEntity);
			navigateToFollowupTab(policyMemberDetailsEntity);
			navigateToDocumentTab(policyMemberDetailsEntity);
			navigateToMemberDetailTab(policyMemberDetailsEntity);
			navigateToMemberAttributesTab(policyMemberDetailsEntity);
			verifyRiskDelete(policyMemberDetailsEntity, assertReference);
			backPolicyListPartyDetails1(policyMemberDetailsEntity);
			
		}
	}
}