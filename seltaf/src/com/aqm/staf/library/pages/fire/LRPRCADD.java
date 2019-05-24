package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LRPRCADDFireEntity;
import com.aqm.staf.library.databin.RiskCoverPropertyFireEntity;

public class LRPRCADD extends BasePage {
	
	private PageElement isThereAnyAddOnCoverApplicableForPropertyDamageDropDown;
	private PageElement isThereAnyAddOnCoverApplicableForBusinessInterruptionDropDown;
	private PageElement isThereAnyAddOnCoverApplicableForMachineryBreakdownDropDown;
	private PageElement forwardButton;
	private PageElement	saveButtonOfNextWindow;
	private PageElement	closeButtonOfNextWindow;
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
	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement insuredInterestSerialNoLabel;
	
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement insuredInterestDocumentsTab;
	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;
	
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	
	private PageElement coverageCodeLabel;
	private PageElement coverageNameLabel;
	
	public LRPRCADD(WebDriver driver, String pageName) {
		super(driver,pageName);


		isThereAnyAddOnCoverApplicableForPropertyDamageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover applicable for Property Damage')]/following::select"), "Is there any Add on Cover applicable for Property Damage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isThereAnyAddOnCoverApplicableForBusinessInterruptionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover applicable for Business Interruption')]/following::select"), "Is there any Add on Cover applicable for Business Interruption", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isThereAnyAddOnCoverApplicableForMachineryBreakdownDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover applicable for Machinery Breakdown')]/following::select"), "Is there any Add on Cover applicable for Machinery Breakdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Documents Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Code")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Code")), "Coverage Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageNameLabel= new PageElement(By.xpath(genericLocatorforLabel("S0040","Coverage Name")), "Coverage Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
	}

	public void fillLRPRCADDFire(LRPRCADDFireEntity lRPRCADDFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("add") || lRPRCADDFireEntity.getAction().equalsIgnoreCase("edit")){
			if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForPropertyDamage")) {
				selectValueFromList(isThereAnyAddOnCoverApplicableForPropertyDamageDropDown, lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForPropertyDamage"));
			}
			else if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("verify")){
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if(lRPRCADDFireEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
				}
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
				}
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForPropertyDamage")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForPropertyDamage"), fetchValueFromFields(isThereAnyAddOnCoverApplicableForPropertyDamageDropDown), AssertionType.WARNING);
				}
			}
			
		}
	}
	public void fillLRT3PRCDONFORADBI(LRPRCADDFireEntity lRPRCADDFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("add") || lRPRCADDFireEntity.getAction().equalsIgnoreCase("edit")){
			if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForBusinessInterruption")) {
				selectValueFromList(isThereAnyAddOnCoverApplicableForBusinessInterruptionDropDown, lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForBusinessInterruption"));
			}
			else if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("verify")){
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForBusinessInterruption")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForBusinessInterruption"), fetchValueFromFields(isThereAnyAddOnCoverApplicableForBusinessInterruptionDropDown), AssertionType.WARNING);
				}
			}
		}
	}

	public void fillLRT4PRCADDONFORMB(LRPRCADDFireEntity lRPRCADDFireEntity, CustomAssert assertReference)throws InterruptedException{
		if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("add") || lRPRCADDFireEntity.getAction().equalsIgnoreCase("edit")){
			if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForMachineryBreakdown")) {
				selectValueFromList(isThereAnyAddOnCoverApplicableForMachineryBreakdownDropDown, lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForMachineryBreakdown"));
			}
			else if(lRPRCADDFireEntity.getAction().equalsIgnoreCase("verify")){
				if (lRPRCADDFireEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverApplicableForMachineryBreakdown")) {
					assertReference.assertEquals(lRPRCADDFireEntity.getStringValueForField("IsThereAnyAddOnCoverApplicableForMachineryBreakdown"), fetchValueFromFields(isThereAnyAddOnCoverApplicableForMachineryBreakdownDropDown), AssertionType.WARNING);
				}
			}
		}
	}
	public void clickOnSaveButton(LRPRCADDFireEntity lRPRCADDFireEntity) throws InterruptedException{
		if(lRPRCADDFireEntity.getBooleanValueForField("ConfigSaveButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			//click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}

	}
	public void clickOnForwardButtonForLRPRCADDFire(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);                       
			switchToFrame("display");
			PageElement lRPRCADDFireTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+lRPRCADDFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Risk Cover Property Fire Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(lRPRCADDFireTitle);
		}
	}
	public void clickOnForwardButtonForLRT3PRCDONFORADBI(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigNextButton")){
			click(forwardButton);
			switchToFrame("display");
			PageElement lRPRCADDFireTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+lRPRCADDFireEntity.getStringValueForField("NextPageTitleForLRT3PRCDONFORADBI")+"')]"), "Risk Cover Property Fire Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(lRPRCADDFireTitle);
		}
	}

	public void clickOnForwardButtonForLRT4PRCADDONFORMB(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigNextPage")){
			click(forwardButton);
			switchToFrame("display");
			PageElement lRPRCADDFireTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+lRPRCADDFireEntity.getStringValueForField("NextPageTitleForLRT4PRCADDONFORMB")+"')]"), "Risk Cover Property Fire Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(lRPRCADDFireTitle);
		}
	}
	public void navigateToPolicy(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			//isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigDetailsTab")) {
			click(attachCoveragesDetailTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
			click(attachCoveragesAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(LRPRCADDFireEntity lRPRCADDFireEntity){
		if (lRPRCADDFireEntity.getBooleanValueForField("ConfigPremiumTab")) {
			click(attachCoveragesPremiumTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}
	
	public void fillandSubmitLRPRCADDFire(LRPRCADDFireEntity lRPRCADDFireEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(lRPRCADDFireEntity .getConfigExecute())){
			switchToFrame("display");
			fillLRPRCADDFire(lRPRCADDFireEntity ,assertReference);	
			clickOnForwardButtonForLRPRCADDFire(lRPRCADDFireEntity );
			fillLRT3PRCDONFORADBI(lRPRCADDFireEntity ,assertReference);	
			clickOnForwardButtonForLRT3PRCDONFORADBI(lRPRCADDFireEntity );
			fillLRT4PRCADDONFORMB(lRPRCADDFireEntity ,assertReference);	
			clickOnForwardButtonForLRT4PRCADDONFORMB(lRPRCADDFireEntity );
			clickOnSaveButton(lRPRCADDFireEntity);
			navigateToPolicy(lRPRCADDFireEntity );
			navigateToAttribute(lRPRCADDFireEntity );
			navigateToInsuredInterest(lRPRCADDFireEntity );
			navigateToCoverage(lRPRCADDFireEntity );
			navigateToLoan(lRPRCADDFireEntity );
			navigateToClientDetails(lRPRCADDFireEntity );
			navigateToRelation(lRPRCADDFireEntity );
			navigateToPayment(lRPRCADDFireEntity );
			navigateToFollowup(lRPRCADDFireEntity );
			navigateToDocument(lRPRCADDFireEntity );
			navigateToInsuredInterestDetails(lRPRCADDFireEntity );
			navigateToInsuredInterestAttributes(lRPRCADDFireEntity );
			navigateToInsuredInterestAttachCoverages(lRPRCADDFireEntity );
			navigateToInsuredInterestRelations(lRPRCADDFireEntity );
			navigateToInsuredInterestPayments(lRPRCADDFireEntity );
			navigateToPolicyAttachCoveragesDetails(lRPRCADDFireEntity);
			navigateToPolicyAttachCoveragesAttributes(lRPRCADDFireEntity);
			navigateToPolicyAttachCoveragesPremium(lRPRCADDFireEntity);
		}
	}	

}

