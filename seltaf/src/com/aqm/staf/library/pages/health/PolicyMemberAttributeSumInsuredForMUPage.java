package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolMemAttrSumInsuredEntity;

public class PolicyMemberAttributeSumInsuredForMUPage extends BasePage{

	private PageElement sumInsuredForMUTitle;
	private PageElement riskDetailsMUT1PLRTitle;
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement pA_SumInsuredTextField;
	private PageElement mC_SumInsuredTextField;
	private PageElement cumulativeBonusTextField;
	private PageElement nextButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement basicPremPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;


	public PolicyMemberAttributeSumInsuredForMUPage (WebDriver driver, String pageName) {
		super(driver, pageName);

		sumInsuredForMUTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Sum Insured')]"), "Sum Insured for MU Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskDetailsMUT1PLRTitle=new PageElement(By.xpath("//div/b/font[contains(text(),'Risk Details')]"), "Risk Details MU T1-PLR Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextButton=new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pA_SumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA_Sum Insured", "input")), "PA_Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mC_SumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_Sum Insured", "input")), "MC_Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cumulativeBonusTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus", "input")), "Cumulative Bonus Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillPolicyMemAttrSumInsuredDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity, CustomAssert assertReference)throws InterruptedException{
		if(polMemAttrSumInsuredEntity.getAction().equalsIgnoreCase("add") || polMemAttrSumInsuredEntity.getAction().equalsIgnoreCase("edit")){

			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
				clearAndSendKeys(pA_SumInsuredTextField, polMemAttrSumInsuredEntity.getStringValueForField("PA_SumInsured"));
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMC_SumInsured")) {
				clearAndSendKeys(mC_SumInsuredTextField, polMemAttrSumInsuredEntity.getStringValueForField("MC_SumInsured"));
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				clearAndSendKeys(cumulativeBonusTextField, polMemAttrSumInsuredEntity.getStringValueForField("CumulativeBonus"));
			}
		}
		else if(polMemAttrSumInsuredEntity.getAction().equalsIgnoreCase("verify")){

			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			// new
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("PA_SumInsured"), fetchValueFromTextFields(pA_SumInsuredTextField), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMC_SumInsured")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("MC_SumInsured"), fetchValueFromTextFields(mC_SumInsuredTextField), AssertionType.WARNING);
			}
			if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
				assertReference.assertEquals(polMemAttrSumInsuredEntity.getStringValueForField("CumulativeBonus"), fetchValueFromTextFields(cumulativeBonusTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttribute(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMember(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverage(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}

	public void navigateToLoan(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}

	}
	public void navigateToRelation(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}


	}
	public void navigateToPayment(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowup(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocument(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}

	private void clickNextButtonSumInsuredDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity) {
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(nextButton);
			switchToFrame("display");
			sumInsuredForMUTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polMemAttrSumInsuredEntity.getStringValueForField("sumInsuredForMUTitle")+"')]"), "Sum Insured for MU Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(sumInsuredForMUTitle);
		}
	}

	private void navigateToPreviousSumInsuredPage(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity) {
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(riskDetailsMUT1PLRTitle);
		}
	}

	private void backToMainAttributePage(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity) {
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	private void saveSumInsuredDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity) {
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");

		}
	}
	public void navigateToPolicyMemberDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity){
		if (polMemAttrSumInsuredEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}

	public void fillandSubmitPolicyMemberAttributeSumInsuredDetails(PolMemAttrSumInsuredEntity polMemAttrSumInsuredEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polMemAttrSumInsuredEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemAttrSumInsuredDetails(polMemAttrSumInsuredEntity, assertReference);
			clickNextButtonSumInsuredDetails(polMemAttrSumInsuredEntity);
			backToMainAttributePage(polMemAttrSumInsuredEntity);
			saveSumInsuredDetails(polMemAttrSumInsuredEntity);
			navigateToPreviousSumInsuredPage(polMemAttrSumInsuredEntity);
			navigateToPolicy(polMemAttrSumInsuredEntity);
			navigateToAttribute(polMemAttrSumInsuredEntity);
			navigateToMember(polMemAttrSumInsuredEntity);
			navigateToCoverage(polMemAttrSumInsuredEntity);
			navigateToLoan(polMemAttrSumInsuredEntity);
			navigateToClientDetails(polMemAttrSumInsuredEntity);
			navigateToRelation(polMemAttrSumInsuredEntity);
			navigateToPayment(polMemAttrSumInsuredEntity);
			navigateToFollowup(polMemAttrSumInsuredEntity);
			navigateToDocument(polMemAttrSumInsuredEntity);
			navigateToPolicyMemberDetails(polMemAttrSumInsuredEntity);
			navigateToPolicyMemberAttributes(polMemAttrSumInsuredEntity);
			navigateToPolicyMemberAttachCoverages(polMemAttrSumInsuredEntity);
			navigateToPolicyMemberRelations(polMemAttrSumInsuredEntity);
			navigateToPolicyMemberPayments(polMemAttrSumInsuredEntity);
		}
	}
}
