package com.aqm.staf.library.pages.aviation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AviStdCovAHT1PRCEntity;

public class AviationStandardCoverAHT1PRC extends BasePage {
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
	
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;
	private PageElement memberDetailPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	private PageElement memberFundPageTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;


	private PageElement previousPolicyHistoryT3POLTitle;	
	private PageElement schemeNoLable;
	private PageElement nextAttributePageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;

	private PageElement insuredInterestTab;
	private PageElement policyDataPZT1POLTitle ;
	private PageElement insuredInterestTabTitle;

	private PageElement forwordButton;
	private PageElement backButton;
	private PageElement saveButton;

	private PageElement basisOfPremiumComputationDropDown;
	private PageElement hullPremiumTextField;
	private PageElement attachCoveragesPremiumForAH;
	private PageElement limitValuePerPassengerTextField;
	private PageElement premiumforPLLField;
	public AviationStandardCoverAHT1PRC(WebDriver driver, String pageName) {
		super(driver,pageName);

		previousPolicyHistoryT3POLTitle =new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy History T3-POL')]"), "Previous Policy History T3-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		
		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumForAH=new PageElement(By.xpath("//a//b//div[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Policy Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		basisOfPremiumComputationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation')]/following::select"), "Basis of Premium Computation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hullPremiumTextField=new PageElement(By.xpath("//td//div[@id='Hull Premium']/following::input"), "Hull Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Break')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		schemeNoLable= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme No.")),"Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),"Insured Interest Tab",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwordButton=new PageElement(By.name("Next"),"Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitValuePerPassengerTextField=new PageElement(By.xpath("//td/div[@id='Limit value per passenger']/following::input[1]"),"Limit value per passenger",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		premiumforPLLField=new PageElement(By.xpath("//td/div[@id='Premium for PLL']/following::input[1]"),"Premium for PLL",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillAviationStandardCoverAHT1PRCDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity, CustomAssert assertReference) {
		if(aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPrimaryInformation")) {
			if(aviStdCovAHT1PRCEntity.getAction().equalsIgnoreCase("add") || aviStdCovAHT1PRCEntity.getAction().equalsIgnoreCase("edit")){

				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					selectValueFromList(basisOfPremiumComputationDropDown, aviStdCovAHT1PRCEntity.getStringValueForField("BasisOfPremiumComputation"));
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigHullPremium")) {
					clearAndSendKeys(hullPremiumTextField, aviStdCovAHT1PRCEntity.getStringValueForField("HullPremium"));
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigLimitValuePerPassenger")) {
					clearAndSendKeys(limitValuePerPassengerTextField, aviStdCovAHT1PRCEntity.getStringValueForField("LimitValuePerPassenger"));
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPremiumforPLL")) {
					clearAndSendKeys(premiumforPLLField, aviStdCovAHT1PRCEntity.getStringValueForField("PremiumforPLL"));
				}
			}
			else if(aviStdCovAHT1PRCEntity.getAction().equalsIgnoreCase("verify")){
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigProduct")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputation")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("BasisOfPremiumComputation"), fetchValueFromList(basisOfPremiumComputationDropDown), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigHullPremium")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("HullPremium"), fetchValueFromTextFields(hullPremiumTextField), AssertionType.WARNING);
				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigLimitValuePerPassenger")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("LimitValuePerPassenger"), fetchValueFromTextFields(limitValuePerPassengerTextField), AssertionType.WARNING);

				}
				if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPremiumforPLL")) {
					assertReference.assertEquals(aviStdCovAHT1PRCEntity.getStringValueForField("PremiumforPLL"), fetchValueFromTextFields(premiumforPLLField), AssertionType.WARNING);

				}
			}
		}	
	}
	public void navigateTobackAttributePage(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickNextButtonPolicyAttributeCDPolicyDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
		}
	}

	public void navigateToPolicy(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickSubmitButtonPolicyAttributeCDPolicyDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void navigateToPolicyMemberDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigMemberDetailTab")) {
		click(memberDetailTitle);
		switchToFrame("display");
		isElementDisplayed(memberDetailPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigMemberAttributesTab")) {
		click(memberAttributesTitle);
		switchToFrame("display");
		isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
		click(memberAttachCoveragesTitle);
		switchToFrame("display");
		isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
		click(memberRelationsTitle);
		switchToFrame("display");
		isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
		click(memberPaymentsTitle);
		switchToFrame("display");
		isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigDetailsTab")) {
		click(attachCoveragesDetailTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
		click(attachCoveragesAttributesTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity){
		if (aviStdCovAHT1PRCEntity.getBooleanValueForField("ConfigPremiumTab")) {
		click(attachCoveragesPremiumTitle);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}

	
	public void fillAndSubmitAviationStandardCoverAHT1PRCDetails(AviStdCovAHT1PRCEntity aviStdCovAHT1PRCEntity, CustomAssert assertReference){
		if(isConfigTrue(aviStdCovAHT1PRCEntity.getConfigExecute())){
			switchToFrame("display");
			fillAviationStandardCoverAHT1PRCDetails(aviStdCovAHT1PRCEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(aviStdCovAHT1PRCEntity);
			clickSubmitButtonPolicyAttributeCDPolicyDetails(aviStdCovAHT1PRCEntity);
			navigateTobackAttributePage(aviStdCovAHT1PRCEntity);
			navigateToPolicy(aviStdCovAHT1PRCEntity);
			navigateToAttribute(aviStdCovAHT1PRCEntity);
			navigateToCoverage(aviStdCovAHT1PRCEntity);
			navigateToClientDetails(aviStdCovAHT1PRCEntity);
			navigateToRelation(aviStdCovAHT1PRCEntity);
			navigateToPayment(aviStdCovAHT1PRCEntity);
			navigateToFollowup(aviStdCovAHT1PRCEntity);
			navigateToDocument(aviStdCovAHT1PRCEntity);
			navigateToPolicyMemberDetails(aviStdCovAHT1PRCEntity);
			navigateToPolicyMemberAttributes(aviStdCovAHT1PRCEntity);
			navigateToPolicyMemberAttachCoverages(aviStdCovAHT1PRCEntity);
			navigateToPolicyMemberRelations(aviStdCovAHT1PRCEntity);
			navigateToPolicyMemberPayments(aviStdCovAHT1PRCEntity);
			navigateToPolicyAttachCoveragesDetails(aviStdCovAHT1PRCEntity);
			navigateToPolicyAttachCoveragesAttributes(aviStdCovAHT1PRCEntity);
			navigateToPolicyAttachCoveragesPremium(aviStdCovAHT1PRCEntity);

		}
	}
}
