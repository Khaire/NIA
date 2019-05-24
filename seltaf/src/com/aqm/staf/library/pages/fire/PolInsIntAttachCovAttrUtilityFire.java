package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AttCovAttrChkPltSIbrkEntity;
import com.aqm.staf.library.databin.AttachCovAttrUtilityEntity;
import com.aqm.staf.library.databin.PolInsIntSpeFieldsFireEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovAtrEntity;
import com.aqm.staf.library.databin.PolicyPremiumScheduleEntity;
import com.aqm.staf.library.databin.RiskDetIARPolFireEntity;

public class PolInsIntAttachCovAttrUtilityFire extends BasePage {

	private PageElement isCoverrequiredForUtilityWaterDropDown;

	private PageElement sIForUtilityWaterTextField;

	private PageElement netPremiumforUtilityWaterTextField;

	private PageElement isCoverrequiredForUtilityAirDropDown;

	private PageElement sIForUtilityAirTextField;

	private PageElement netPremiumForUtilityAirTextField;

	private PageElement iSCoverrequiredForUtilitySuppliersExtensionDropDown;

	private PageElement sIForUtilitySuppliersExtensionTextField;

	private PageElement	netPremiumForUtilitySuppliersExtensionTextField;

	private PageElement	iSCoverrequiredForUtilitySteamDropDown;

	private PageElement sIUtilitySteamTextField;

	private PageElement netPremiumForUtilitySteamTextField;

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
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
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
	private PageElement attachCoveragesDetailTab;
	private PageElement attachCoveragesAttributesTab; 
	private PageElement attachCoveragesPremiumTab;
	private PageElement attachCoveragesDetailsTitle;
	private PageElement attachCoveragesAttributesTitle;
	private PageElement attachCoveragesPremiumTitle;

	private PageElement saveButton;
	private PageElement forwardButton;

	public PolInsIntAttachCovAttrUtilityFire(WebDriver driver, String pageName) {
		super(driver, pageName);

		isCoverrequiredForUtilityWaterDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Utility Water?')]/following::select"),"Is cover required for Utility Water?", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sIForUtilityWaterTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Utility Water')]/following::input"),"SI for Utility Water", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumforUtilityWaterTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Premium for Utility Water')]/following::input"),"Net Premium for Utility Water", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		isCoverrequiredForUtilityAirDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Utility Air?')]/following::select"),"Is cover required for Utility Air?", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sIForUtilityAirTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Utility Air')]/following::input"),"SI for Utility Air", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumForUtilityAirTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Premium for Utility Air')]/following::input"),"Net Premium for Utility Air", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		iSCoverrequiredForUtilitySuppliersExtensionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Utility suppliers extension?')]/following::select"),"Is cover required for Utility suppliers extension?", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sIForUtilitySuppliersExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Utility suppliers extension')]/following::input"),"SI for Utility suppliers extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumForUtilitySuppliersExtensionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Premium for Utility suppliers extension')]/following::input"),"Net Premium for Utility suppliers extension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		iSCoverrequiredForUtilitySteamDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Utility Steam?')]/following::select"),"Is cover required for Utility Steam?", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sIUtilitySteamTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI Utility Steam')]/following::input"),"SI Utility Steam'", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumForUtilitySteamTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Premium for Utility Steam')]/following::input"),"Net Premium for Utility Steam", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
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
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailTab = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTab = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTab= new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), " Attched Coverage Premium Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}
	public void fillPolInsIntAttachCovAttrUtilityFire(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity, CustomAssert assertReference)throws InterruptedException{
		if(attachCovAttrUtilityEntity.getAction().equalsIgnoreCase("add") || attachCovAttrUtilityEntity.getAction().equalsIgnoreCase("edit")){

			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigIsCoverrequiredForUtilityWater")) {
				selectValueFromList(isCoverrequiredForUtilityWaterDropDown, attachCovAttrUtilityEntity.getStringValueForField("IsCoverrequiredForUtilityWater"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilityWater")) {
				clearAndSendKeys(sIForUtilityWaterTextField, attachCovAttrUtilityEntity.getStringValueForField("SIForUtilityWater"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumforUtilityWater")) {
				clearAndSendKeys(netPremiumforUtilityWaterTextField, attachCovAttrUtilityEntity.getStringValueForField("NetPremiumforUtilityWater"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigIsCoverrequiredForUtilityAir")) {
				selectValueFromList(isCoverrequiredForUtilityAirDropDown, attachCovAttrUtilityEntity.getStringValueForField("IsCoverrequiredForUtilityAir"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilityAir")) {
				clearAndSendKeys(sIForUtilityAirTextField, attachCovAttrUtilityEntity.getStringValueForField("SIForUtilityAir"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilityAir")) {
				clearAndSendKeys(netPremiumForUtilityAirTextField, attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilityAir"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigISCoverrequiredForUtilitySuppliersExtension")) {
				selectValueFromList(iSCoverrequiredForUtilitySuppliersExtensionDropDown, attachCovAttrUtilityEntity.getStringValueForField("ISCoverrequiredForUtilitySuppliersExtension"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilitySuppliersExtension")) {
				clearAndSendKeys(sIForUtilitySuppliersExtensionTextField, attachCovAttrUtilityEntity.getStringValueForField("SIForUtilitySuppliersExtension"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilitySuppliersExtension")) {
				clearAndSendKeys(netPremiumForUtilitySuppliersExtensionTextField, attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilitySuppliersExtension"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigISCoverrequiredForUtilitySteam")) {
				selectValueFromList(iSCoverrequiredForUtilitySteamDropDown, attachCovAttrUtilityEntity.getStringValueForField("ISCoverrequiredForUtilitySteam"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIUtilitySteam")) {
				clearAndSendKeys(sIUtilitySteamTextField, attachCovAttrUtilityEntity.getStringValueForField("SIUtilitySteam"));
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilitySteam")) {
				clearAndSendKeys(netPremiumForUtilitySteamTextField, attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilitySteam"));
			}
		}
		else if(attachCovAttrUtilityEntity.getAction().equalsIgnoreCase("verify")){
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(attachCovAttrUtilityEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigIsCoverrequiredForUtilityWater")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("IsCoverrequiredForUtilityWater"), fetchValueFromList(isCoverrequiredForUtilityWaterDropDown), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilityWater")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("SIForUtilityWater"), fetchValueFromTextFields(sIForUtilityWaterTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumforUtilityWater")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("NetPremiumforUtilityWater"), fetchValueFromTextFields(netPremiumforUtilityWaterTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigIsCoverrequiredForUtilityAir")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("IsCoverrequiredForUtilityAir"), fetchValueFromList(isCoverrequiredForUtilityAirDropDown), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilityAir")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("SIForUtilityAir"), fetchValueFromTextFields(sIForUtilityAirTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilityAir")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilityAir"), fetchValueFromTextFields(netPremiumForUtilityAirTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigISCoverrequiredForUtilitySuppliersExtension")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("ISCoverrequiredForUtilitySuppliersExtension"), fetchValueFromList(iSCoverrequiredForUtilitySuppliersExtensionDropDown), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIForUtilitySuppliersExtension")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("SIForUtilitySuppliersExtension"), fetchValueFromTextFields(sIForUtilitySuppliersExtensionTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilitySuppliersExtension")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilitySuppliersExtension"), fetchValueFromTextFields(netPremiumForUtilitySuppliersExtensionTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigISCoverrequiredForUtilitySteam")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("ISCoverrequiredForUtilitySteam"), fetchValueFromList(iSCoverrequiredForUtilitySteamDropDown), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSIUtilitySteam")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("SIUtilitySteam"), fetchValueFromTextFields(sIUtilitySteamTextField), AssertionType.WARNING);
			}
			if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigNetPremiumForUtilitySteam")) {
				assertReference.assertEquals(attachCovAttrUtilityEntity.getStringValueForField("NetPremiumForUtilitySteam"), fetchValueFromTextFields(netPremiumForUtilitySteamTextField), AssertionType.WARNING);
			}

		}
	}
	public void navigateToPolicy(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigDetailsTab")) {
		click(attachCoveragesDetailTab);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesDetailsTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
		click(attachCoveragesAttributesTab);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesAttributesTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigPremiumTab")) {
		click(attachCoveragesPremiumTab);
		switchToFrame("display");
		isElementDisplayed(attachCoveragesPremiumTitle);
		}
	}
	public void clickOnSaveButton(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			PageElement attachCovAttrUtilityFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attachCovAttrUtilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Attach Coverage Attribute Utility Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attachCovAttrUtilityFireTitle);
		}
	}
	public void clickOnForwardButton(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){
		if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			PageElement attachCovAttrUtilityFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attachCovAttrUtilityEntity.getStringValueForField("NextPageTitle")+"')]"), "Attach Coverage Attribute Utility Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attachCovAttrUtilityFireTitle);
		}
	}
	
	//Attach Coverage sub Tab
			public void navigateToAttachCoverageDetailsTab(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){				
				if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigAttachCoverageDetailsTab")){			
					click(attachCoveragesDetailTab);		
					switchToFrame("display");		
					isElementDisplayed(attachCoveragesDetailsTitle);		
				}			
			}

			public void navigateToAttachCoverageAttributesTab(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){				
				if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigAttachCoverageAttributesTab")){			
					click(attachCoveragesAttributesTab);		
					switchToFrame("display");

				}			
			}

			public void navigateToAttachCoveragePremiumTab(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity){				
				if (attachCovAttrUtilityEntity.getBooleanValueForField("ConfigAttachCoveragePremiumTab")){			
					click(attachCoveragesPremiumTab);		
					switchToFrame("display");		
					//isElementDisplayed(attachCoveragesPremiumTitle);		
				}			
			}	
			
	public void fillandSubmitfillPolInsIntAttachCovAttrUtilityFire(AttachCovAttrUtilityEntity attachCovAttrUtilityEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(attachCovAttrUtilityEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolInsIntAttachCovAttrUtilityFire(attachCovAttrUtilityEntity ,assertReference);	
			clickOnForwardButton(attachCovAttrUtilityEntity );
			clickOnSaveButton(attachCovAttrUtilityEntity);
			navigateToPolicy(attachCovAttrUtilityEntity );
			navigateToAttribute(attachCovAttrUtilityEntity );
			navigateToInsuredInterest(attachCovAttrUtilityEntity );
			navigateToCoverage(attachCovAttrUtilityEntity );
			navigateToLoan(attachCovAttrUtilityEntity );
			navigateToClientDetails(attachCovAttrUtilityEntity );
			navigateToRelation(attachCovAttrUtilityEntity );
			navigateToPayment(attachCovAttrUtilityEntity );
			navigateToFollowup(attachCovAttrUtilityEntity );
			navigateToDocument(attachCovAttrUtilityEntity );
			navigateToInsuredInterestDetails(attachCovAttrUtilityEntity );
			navigateToInsuredInterestAttributes(attachCovAttrUtilityEntity );
			navigateToInsuredInterestAttachCoverages(attachCovAttrUtilityEntity );
			navigateToInsuredInterestRelations(attachCovAttrUtilityEntity );
			navigateToInsuredInterestPayments(attachCovAttrUtilityEntity );
			navigateToAttachCoverageDetailsTab(attachCovAttrUtilityEntity);
			navigateToAttachCoverageAttributesTab(attachCovAttrUtilityEntity);
			navigateToAttachCoveragePremiumTab(attachCovAttrUtilityEntity);
		}
	}
}