package com.aqm.staf.library.pages.fire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.FirePEAddOnCovEnity;
import com.aqm.staf.library.databin.FirePERateEntity;

public class PolAttrAddOnCovers extends BasePage{
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
	private PageElement inadvertomsnDropdown;
	private PageElement siforinadvertomsnTextField;
	private PageElement premForInadverOmsnTextField; 

	private PageElement archAndConsEngFeesDropdown;
	private PageElement sIForArchAndConsultantEngFeesTextField;
	private PageElement premForArchAndConsEngFeesTextField;
	private PageElement remOfDebPetrochemDropdown;
	private PageElement sIForRemOfDebPetrochemTextField;
	private PageElement premForRemOfDebPetrochemTextField;
	
	public PolAttrAddOnCovers(WebDriver driver, String pageName){
		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		inadvertomsnDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Inadvertent Omission", "select")), "Inadvertent Omission", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		siforinadvertomsnTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Inadvertent Omission", "input")), "SI for Inadvertent Omission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premForInadverOmsnTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Inadvertent Omission", "input")), "Premium for Inadvertent Omission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		archAndConsEngFeesDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Architects and consultant engineering fees", "select")), "Architects and consultant engineering fees", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForArchAndConsultantEngFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Architects and consultant engineering fees", "input")), "SI for Architects and consultant engineering fees", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premForArchAndConsEngFeesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Architects and consultant engineering fees", "input")), "Premium for Architects and consultant engineering fees", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remOfDebPetrochemDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Removal of Debris (Petrochemical)", "select")), "Removal of Debris (Petrochemical)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sIForRemOfDebPetrochemTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SI for Removal of Debris (Petrochemical)", "input")), "SI for Removal of Debris (Petrochemical)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premForRemOfDebPetrochemTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium for Removal of Debris (Petrochemical)", "input")), "Premium for Removal of Debris (Petrochemical)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillPolAttrAddOnCovers(FirePEAddOnCovEnity firePEAddOnCovEnity, CustomAssert assertReference) throws InterruptedException{
		if(firePEAddOnCovEnity.getAction().equalsIgnoreCase("add") || firePEAddOnCovEnity.getAction().equalsIgnoreCase("edit")){
			//PE digvijay
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigInadvertomsnDropdown")) {
				selectValueFromList(inadvertomsnDropdown, firePEAddOnCovEnity.getStringValueForField("InadvertomsnDropdown"));
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSiforInadTextField")) {
				clearAndSendKeys(siforinadvertomsnTextField, firePEAddOnCovEnity.getStringValueForField("SiforInadTextField"));
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForInadrOmsnTextField")) {
				clearAndSendKeys(premForInadverOmsnTextField, firePEAddOnCovEnity.getStringValueForField("PremForInadrOmsnTextField"));
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigArchAndConsEngFeesDropdown")) {
				selectValueFromList(archAndConsEngFeesDropdown, firePEAddOnCovEnity.getStringValueForField("ArchAndConsEngFeesDropdown"));
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSIForArchAndConsultantEngFeesTextField")) {
				clearAndSendKeys(sIForArchAndConsultantEngFeesTextField, firePEAddOnCovEnity.getStringValueForField("SIForArchAndConsultantEngFeesTextField"));
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForArchAndConsEngFeesTextField")) {
				clearAndSendKeys(premForArchAndConsEngFeesTextField, firePEAddOnCovEnity.getStringValueForField("PremForArchAndConsEngFeesTextField"));
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigRemOfDebPetchemDropdown")) {
				selectValueFromList(remOfDebPetrochemDropdown, firePEAddOnCovEnity.getStringValueForField("RemOfDebPetchemDropdown"));
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSIForRemOfDebPetchemTextField")) {
				clearAndSendKeys(sIForRemOfDebPetrochemTextField, firePEAddOnCovEnity.getStringValueForField("SIForRemOfDebPetchemTextField"));
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForRemOfDebPetchemTextField")) {
				clearAndSendKeys(premForRemOfDebPetrochemTextField, firePEAddOnCovEnity.getStringValueForField("PremForRemOfDebPetchemTextField"));
			}
		}
		else if(firePEAddOnCovEnity.getAction().equalsIgnoreCase("verify")){
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			//PE digvijay
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigInadvertomsnDropdown")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("InadvertomsnDropdown"), fetchValueFromList(inadvertomsnDropdown), AssertionType.WARNING);
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSiforInadTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("SiforInadTextField"), fetchValueFromTextFields(siforinadvertomsnTextField), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForInadrOmsnTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("PremForInadrOmsnTextField"), fetchValueFromTextFields(premForInadverOmsnTextField), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigArchAndConsEngFeesDropdown")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("ArchAndConsEngFeesDropdown"), fetchValueFromList(archAndConsEngFeesDropdown), AssertionType.WARNING);
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSIForArchAndConsultantEngFeesTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("SIForArchAndConsultantEngFeesTextField"), fetchValueFromTextFields(sIForArchAndConsultantEngFeesTextField), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForArchAndConsEngFeesTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("PremForArchAndConsEngFeesTextField"), fetchValueFromTextFields(premForArchAndConsEngFeesTextField), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigRemOfDebPetchemDropdown")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("RemOfDebPetchemDropdown"), fetchValueFromList(remOfDebPetrochemDropdown), AssertionType.WARNING);
			}

			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigSIForRemOfDebPetchemTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("SIForRemOfDebPetchemTextField"), fetchValueFromTextFields(sIForRemOfDebPetrochemTextField), AssertionType.WARNING);
			}
			if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPremForRemOfDebPetchemTextField")) {
				assertReference.assertEquals(firePEAddOnCovEnity.getStringValueForField("PremForRemOfDebPetchemTextField"), fetchValueFromTextFields(premForRemOfDebPetrochemTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateTobackAttributePage(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			PageElement policyAttributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+firePEAddOnCovEnity.getStringValueForField("NextPageTitle")+"')]"), "Policy Attributes Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttributeTitle);
		}
	}
	public void navigateToPolicy(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(FirePEAddOnCovEnity firePEAddOnCovEnity){
		if (firePEAddOnCovEnity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void fillandSubmitPolicyAttributeFire(FirePEAddOnCovEnity firePEAddOnCovEnity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(firePEAddOnCovEnity.getConfigExecute())){
			switchToFrame("display");
			fillPolAttrAddOnCovers(firePEAddOnCovEnity, assertReference);
			clickNextButtonPolicyAttribute(firePEAddOnCovEnity);
			navigateTobackAttributePage(firePEAddOnCovEnity);
			navigateToPolicy(firePEAddOnCovEnity);
			navigateToAttribute(firePEAddOnCovEnity);
			navigateToInsuredInterest(firePEAddOnCovEnity);
			navigateToCoverage(firePEAddOnCovEnity);
			navigateToLoan(firePEAddOnCovEnity);
			navigateToClientDetails(firePEAddOnCovEnity);
			navigateToRelation(firePEAddOnCovEnity);
			navigateToPayment(firePEAddOnCovEnity);
			navigateToFollowup(firePEAddOnCovEnity);
			navigateToDocument(firePEAddOnCovEnity);
		}
	}
}
