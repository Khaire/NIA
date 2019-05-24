package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrMarineHullEntity;
import com.aqm.staf.library.databin.PolAttrPolDetMHEntity;

public class PolicyInsuredIntrestAttrPolicyDetailMarineHull extends BasePage{
	private PageElement	projectDetailsTextArea;
	private PageElement locationTextArea;
	private PageElement additionalInformationTextArea;
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement insuredInterestTab;	
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement insuredInterestTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestTabTitle;	
	
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement forwardButton;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;		
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement policyNoLabel;
	private PageElement saveButton;
	public PolicyInsuredIntrestAttrPolicyDetailMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);

		projectDetailsTextArea=new PageElement(By.xpath("//td/div[contains(text(),'PROJECT DETAILS')]/following::textarea"), "PROJECT DETAILS", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		locationTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Location')]/following::textarea"), "Location", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalInformationTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Additional Information(if any)')]/following::textarea"), "Additional Information(if any)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTitle = new PageElement(By.linkText("Detail"), " InsuredInterestTitle ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),' List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("btnNext"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyAttrPolicyDetailMarineHullDetails(PolAttrPolDetMHEntity polAttrPolDetMHEntity, CustomAssert assertReference) throws InterruptedException{


		if(polAttrPolDetMHEntity.getAction().equalsIgnoreCase("add") || polAttrPolDetMHEntity.getAction().equalsIgnoreCase("edit")){


			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigProjectDetails")) {
				clearAndSendKeys(projectDetailsTextArea, polAttrPolDetMHEntity.getStringValueForField("ProjectDetails"));
			}
			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigLocation")) {
				clearAndSendKeys(locationTextArea, polAttrPolDetMHEntity.getStringValueForField("Location"));
			}
			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigAdditionalInformation")) {
				clearAndSendKeys(additionalInformationTextArea, polAttrPolDetMHEntity.getStringValueForField("AdditionalInformation"));
			}
		}
		else if(polAttrPolDetMHEntity.getAction().equalsIgnoreCase("verify")){

			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigProjectDetails")) {
				assertReference.assertEquals(polAttrPolDetMHEntity.getStringValueForField("ProjectDetails"), fetchValueFromTextFields(projectDetailsTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigLocation")) {
				assertReference.assertEquals(polAttrPolDetMHEntity.getStringValueForField("Location"), fetchValueFromTextFields(locationTextArea), AssertionType.WARNING);
			}
			if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigAdditionalInformation")) {
				assertReference.assertEquals(polAttrPolDetMHEntity.getStringValueForField("AdditionalInformation"), fetchValueFromTextFields(additionalInformationTextArea), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToPolicy(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	
	public void clickNextButtonPolicyDetailAttribute(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}

	public void clickSaveButtonPolicyDetailAttribute(PolAttrPolDetMHEntity polAttrPolDetMHEntity){
		if (polAttrPolDetMHEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyAttributeMarineHullDetail(PolAttrPolDetMHEntity polAttrPolDetMHEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrPolDetMHEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttrPolicyDetailMarineHullDetails(polAttrPolDetMHEntity,assertReference);
			clickNextButtonPolicyDetailAttribute(polAttrPolDetMHEntity);
			clickSaveButtonPolicyDetailAttribute(polAttrPolDetMHEntity);
			navigateToPolicy(polAttrPolDetMHEntity);
			navigateToAttribute(polAttrPolDetMHEntity);
			navigateToInsuredInterest(polAttrPolDetMHEntity);
			navigateToCoverage(polAttrPolDetMHEntity);
			navigateToLoan(polAttrPolDetMHEntity);
			navigateToClientDetails(polAttrPolDetMHEntity);
			navigateToRelation(polAttrPolDetMHEntity);
			navigateToPayment(polAttrPolDetMHEntity);
			navigateToFollowup(polAttrPolDetMHEntity);
			navigateToDocument(polAttrPolDetMHEntity);

		}
	}
}