package com.aqm.staf.library.pages.fire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.FirePERateEntity;



public class PolAttrPERate extends BasePage {
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
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	//PE digvijay
	private PageElement whetherEscalationClauseoptedDropdown;
	private PageElement escalationpercentTextField;
	private PageElement earthquakeStateDropdown;
	private PageElement earthquakeDistrictZoneTextField;
	private PageElement probableMaximumLossPMLTextField;
	public PolAttrPERate(WebDriver driver, String pageName){
		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PE digvijay
		whetherEscalationClauseoptedDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Escalation Clause opted", "select")), "Whether Escalation Clause opted DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		escalationpercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Escalation(%)", "input")), "Escalation percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earthquakeStateDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Earthquake State", "select")), "Earthquake State", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeDistrictZoneTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Earthquake District (Zone)", "input")), "Earthquake District", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		probableMaximumLossPMLTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Probable Maximum Loss (PML)", "input")), "Probable Maximum Loss (PML)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	
	public void fillPolAttrPERate(FirePERateEntity firePERateEntity, CustomAssert assertReference) throws InterruptedException{
		if(firePERateEntity.getAction().equalsIgnoreCase("add") || firePERateEntity.getAction().equalsIgnoreCase("edit")){
			//PE digvijay
			if (firePERateEntity.getBooleanValueForField("ConfigWhtrEsClauseOptDropdown")) {
				selectValueFromList(whetherEscalationClauseoptedDropdown, firePERateEntity.getStringValueForField("WhtrEsClauseOptDropdown"));
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEscalPercentTextField")) {
				clearAndSendKeys(escalationpercentTextField, firePERateEntity.getStringValueForField("EscalPercentTextField"));
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEarthQStateDropdown")) {
				selectValueFromList(earthquakeStateDropdown, firePERateEntity.getStringValueForField("EarthQStateDropdown"));
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEarthQDistZoneTextField")) {
				clearAndSendKeys(earthquakeDistrictZoneTextField, firePERateEntity.getStringValueForField("EarthQDistZoneTextField"));
			}
			if (firePERateEntity.getBooleanValueForField("ConfigProbMaxLossPMLTextField")) {
				clearAndSendKeys(probableMaximumLossPMLTextField, firePERateEntity.getStringValueForField("ProbMaxLossPMLTextField"));
			}
		}
		else if(firePERateEntity.getAction().equalsIgnoreCase("verify")){
			if (firePERateEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			//PE digvijay
			if (firePERateEntity.getBooleanValueForField("ConfigWhtrEsClauseOptDropdown")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("WhtrEsClauseOptDropdown"), fetchValueFromList(whetherEscalationClauseoptedDropdown), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEscalPercentTextField")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("EscalPercentTextField"), fetchValueFromTextFields(escalationpercentTextField), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEarthQStateDropdown")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("EarthQStateDropdown"), fetchValueFromList(earthquakeStateDropdown), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigEarthQDistZoneTextField")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("EarthQDistZoneTextField"), fetchValueFromTextFields(earthquakeDistrictZoneTextField), AssertionType.WARNING);
			}
			if (firePERateEntity.getBooleanValueForField("ConfigProbMaxLossPMLTextField")) {
				assertReference.assertEquals(firePERateEntity.getStringValueForField("ProbMaxLossPMLTextField"), fetchValueFromTextFields(probableMaximumLossPMLTextField), AssertionType.WARNING);
			}
		}
		
	}
	
	public void navigateTobackAttributePage(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			PageElement policyAttributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+firePERateEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Attributes Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttributeTitle);
		}
	}
	public void navigateToPolicy(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(FirePERateEntity firePERateEntity){
		if (firePERateEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	
	public void fillandSubmitPolicyAttributeFire(FirePERateEntity firePERateEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(firePERateEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolAttrPERate(firePERateEntity, assertReference);
			clickNextButtonPolicyAttribute(firePERateEntity);
			navigateTobackAttributePage(firePERateEntity);
			navigateToPolicy(firePERateEntity);
			navigateToAttribute(firePERateEntity);
			navigateToInsuredInterest(firePERateEntity);
			navigateToCoverage(firePERateEntity);
			navigateToLoan(firePERateEntity);
			navigateToClientDetails(firePERateEntity);
			navigateToRelation(firePERateEntity);
			navigateToPayment(firePERateEntity);
			navigateToFollowup(firePERateEntity);
			navigateToDocument(firePERateEntity);
		}
	}
}

