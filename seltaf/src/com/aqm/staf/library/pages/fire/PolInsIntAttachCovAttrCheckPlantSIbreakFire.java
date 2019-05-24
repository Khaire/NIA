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
import com.aqm.staf.library.databin.LoadDiscntDetRuralEntity;
import com.aqm.staf.library.databin.RiskDetIARPolFireEntity;

public class PolInsIntAttachCovAttrCheckPlantSIbreakFire extends BasePage{

	private PageElement	whetherBIMachineryBreakdownCoveroptedDropDown;
	private PageElement	sumInsuredForMLOPTextField;
	private PageElement	indemnityPeriodForMLOPInMonthsTextField;
	private PageElement profitRateForMLOPTextField;
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
	
	private PageElement capitalAdditionWithinLimitTextField;
	private PageElement apitalAdditionAboveLimitTextField;
	private PageElement ManualGrossPremiumTextField;
	
	private PageElement housebreakingClauseAddOn1019Dropdown;
	private PageElement ElectricalApparatusClauseAddOn1020Dropdown;
	private PageElement SpontaneousCombustionExtensionClauseAddOn1021Dropdown;
	private PageElement InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022Dropdown;
	private PageElement BoilerexplosionDamageClauseAddOn1023Dropdown;
	private PageElement ShutdownorStartupExpensesClauseAddOn1024Dropdown;
	

	public PolInsIntAttachCovAttrCheckPlantSIbreakFire(WebDriver driver, String pageName) {
		super(driver, pageName);

		whetherBIMachineryBreakdownCoveroptedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether BI (Machinery Breakdown) cover opted')]/following::select"),"Whether BI (Machinery Breakdown) cover opted", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredForMLOPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for MLOP')]/following::input"),"Sum Insured for MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		indemnityPeriodForMLOPInMonthsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period for MLOP in months')]/following::input"),"Indemnity Period for MLOP in months", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		profitRateForMLOPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Profit Rate for MLOP')]/following::input"),"Profit Rate for MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

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
		attachCoveragesPremiumTab= new PageElement(By.xpath("//b//div[contains(text(),'Premium')]"), " Attched Coverage Premium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		capitalAdditionWithinLimitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Capital Addition within Limit')]/following::input"), "Capital Addition within Limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		apitalAdditionAboveLimitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Capital Addition above Limit')]/following::input"), "Capital Addition above Limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ManualGrossPremiumTextField= new PageElement(By.xpath("//td//div[contains(text(),'Manual Gross Premium')]/following::input"), "Manual Gross Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		housebreakingClauseAddOn1019Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Housebreaking Clause(Add On 1019)')]/following::select"),"Housebreaking Clause(Add On 1019)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ElectricalApparatusClauseAddOn1020Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Electrical Apparatus Clause(Add On 1020)')]/following::select"),"Electrical Apparatus Clause(Add On 1020)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SpontaneousCombustionExtensionClauseAddOn1021Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Spontaneous Combustion Extension Clause(Add On 1021)')]/following::select"),"Spontaneous Combustion Extension Clause(Add On 1021)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022)')]/following::select"),"Insurance of specified property(ies) against loss or damage due to impact by water borne vessels or bodies or objects(Add On 1022)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		BoilerexplosionDamageClauseAddOn1023Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Boiler explosion Damage Clause(Add On 1023)')]/following::select"),"Boiler explosion Damage Clause(Add On 1023)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ShutdownorStartupExpensesClauseAddOn1024Dropdown= new PageElement(By.xpath("//td//div[contains(text(),'Shutdown or Start up Expenses Clause(Add On 1024)')]/following::select"),"Shutdown or Start up Expenses Clause(Add On 1024)", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
	}
	public void fillPolInsIntAttachCovAttrCheckPlantSIbreakFire(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity, CustomAssert assertReference)throws InterruptedException{
		if(attCovAttrChkPltSIbrkEntity.getAction().equalsIgnoreCase("add") || attCovAttrChkPltSIbrkEntity.getAction().equalsIgnoreCase("edit")){

			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigWhetherBIMachineryBreakdownCoveropted")) {
				selectValueFromList(whetherBIMachineryBreakdownCoveroptedDropDown, attCovAttrChkPltSIbrkEntity.getStringValueForField("WhetherBIMachineryBreakdownCoveropted"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigSumInsuredForMLOP")) {
				clearAndSendKeys(sumInsuredForMLOPTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("SumInsuredForMLOP"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigIndemnityPeriodForMLOPInMonths")) {
				clearAndSendKeys(indemnityPeriodForMLOPInMonthsTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("IndemnityPeriodForMLOPInMonths"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigProfitRateForMLOP")) {
				clearAndSendKeys(profitRateForMLOPTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("ProfitRateForMLOP"));
				
			}
			//SA
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigCapitalAdditionWithinLimit")) {
				clearAndSendKeys(capitalAdditionWithinLimitTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("CapitalAdditionWithinLimit"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigCapitalAdditionAboveLimit")) {
				clearAndSendKeys(apitalAdditionAboveLimitTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("CapitalAdditionAboveLimit"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigManualGrossPremium")) {
				clearAndSendKeys(ManualGrossPremiumTextField, attCovAttrChkPltSIbrkEntity.getStringValueForField("ManualGrossPremium"));
			}
			//PE
			
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigHousebreakingClauseAddOn1019")) {
				clearAndSendKeys(housebreakingClauseAddOn1019Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("HousebreakingClauseAddOn1019"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigElectricalApparatusClauseAddOn1020")) {
				clearAndSendKeys(ElectricalApparatusClauseAddOn1020Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("ElectricalApparatusClauseAddOn1020"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigSpontaneousCombustionExtensionClauseAddOn1021")) {
				clearAndSendKeys(SpontaneousCombustionExtensionClauseAddOn1021Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("SpontaneousCombustionExtensionClauseAddOn1021"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022")) {
				clearAndSendKeys(InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigBoilerexplosionDamageClauseAddOn1023")) {
				clearAndSendKeys(BoilerexplosionDamageClauseAddOn1023Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("BoilerexplosionDamageClauseAddOn1023"));
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigShutdownorStartupExpensesClauseAddOn1024")) {
				clearAndSendKeys(ShutdownorStartupExpensesClauseAddOn1024Dropdown, attCovAttrChkPltSIbrkEntity.getStringValueForField("ShutdownorStartupExpensesClauseAddOn1024"));
			}
		}

		else if(attCovAttrChkPltSIbrkEntity.getAction().equalsIgnoreCase("verify")){
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigWhetherBIMachineryBreakdownCoveropted")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("WhetherBIMachineryBreakdownCoveropted"), fetchValueFromList(whetherBIMachineryBreakdownCoveroptedDropDown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigSumInsuredForMLOP")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("SumInsuredForMLOP"), fetchValueFromFields(sumInsuredForMLOPTextField), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigIndemnityPeriodForMLOPInMonths")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("IndemnityPeriodForMLOPInMonths"), fetchValueFromFields(indemnityPeriodForMLOPInMonthsTextField), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigProfitRateForMLOP")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("ProfitRateForMLOP"), fetchValueFromFields(profitRateForMLOPTextField), AssertionType.WARNING);
			}
			
			//SA-Sonali
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigCapitalAdditionWithinLimit")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("CapitalAdditionWithinLimit"), fetchValueFromFields(capitalAdditionWithinLimitTextField), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigCapitalAdditionAboveLimit")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("CapitalAdditionAboveLimit"), fetchValueFromFields(apitalAdditionAboveLimitTextField), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigManualGrossPremium")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("ManualGrossPremium"), fetchValueFromFields(ManualGrossPremiumTextField), AssertionType.WARNING);
			}
			
			//PE sonali
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigHousebreakingClauseAddOn1019")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("HousebreakingClauseAddOn1019"), fetchValueFromFields(housebreakingClauseAddOn1019Dropdown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigElectricalApparatusClauseAddOn1020")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("ElectricalApparatusClauseAddOn1020"), fetchValueFromFields(ElectricalApparatusClauseAddOn1020Dropdown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigSpontaneousCombustionExtensionClauseAddOn1021")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("SpontaneousCombustionExtensionClauseAddOn1021"), fetchValueFromFields(SpontaneousCombustionExtensionClauseAddOn1021Dropdown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigInsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022"), fetchValueFromFields(InsuranceOfSpecifiedpropertyAgainstLossOrDamageDueToAddOn1022Dropdown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigBoilerexplosionDamageClauseAddOn1023")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("BoilerexplosionDamageClauseAddOn1023"), fetchValueFromFields(BoilerexplosionDamageClauseAddOn1023Dropdown), AssertionType.WARNING);
			}
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigShutdownorStartupExpensesClauseAddOn1024")) {
				assertReference.assertEquals(attCovAttrChkPltSIbrkEntity.getStringValueForField("ShutdownorStartupExpensesClauseAddOn1024"), fetchValueFromFields(ShutdownorStartupExpensesClauseAddOn1024Dropdown), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicy(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	
	public void clickOnSaveButton(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			PageElement attCovAttrChkPltSIbreakFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attCovAttrChkPltSIbrkEntity.getStringValueForField("NextPageTitle")+"')]"), "Check Plant SI break Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attCovAttrChkPltSIbreakFireTitle);
		}
	}
	public void clickOnForwardButton(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){
		if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			PageElement attCovAttrChkPltSIbreakFireTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attCovAttrChkPltSIbrkEntity.getStringValueForField("NextPageTitle")+"')]"), "Check Plant SI break Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attCovAttrChkPltSIbreakFireTitle);
		}
	}
	
	//Attach Coverage sub Tab
		public void navigateToAttachCoverageDetailsTab(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){				
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigAttachCoverageDetailsTab")){			
				click(attachCoveragesDetailTab);		
				switchToFrame("display");		
				isElementDisplayed(attachCoveragesDetailsTitle);		
			}			
		}

		public void navigateToAttachCoverageAttributesTab(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){				
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigAttachCoverageAttributesTab")){			
				click(attachCoveragesAttributesTab);		
				switchToFrame("display");

			}			
		}

		public void navigateToAttachCoveragePremiumTab(AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity){				
			if (attCovAttrChkPltSIbrkEntity.getBooleanValueForField("ConfigAttachCoveragePremiumTab")){			
				click(attachCoveragesPremiumTab);		
				switchToFrame("display");		
				//isElementDisplayed(attachCoveragesPremiumTitle);		
			}			
		}	



	public void fillandSubmitfillPolInsIntAttachCovAttrCheckPlantSIbreakFire( AttCovAttrChkPltSIbrkEntity attCovAttrChkPltSIbrkEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(attCovAttrChkPltSIbrkEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolInsIntAttachCovAttrCheckPlantSIbreakFire(attCovAttrChkPltSIbrkEntity ,assertReference);	
			clickOnForwardButton(attCovAttrChkPltSIbrkEntity );
			clickOnSaveButton(attCovAttrChkPltSIbrkEntity);
			navigateToPolicy(attCovAttrChkPltSIbrkEntity );
			navigateToAttribute(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterest(attCovAttrChkPltSIbrkEntity );
			navigateToCoverage(attCovAttrChkPltSIbrkEntity );
			navigateToLoan(attCovAttrChkPltSIbrkEntity );
			navigateToClientDetails(attCovAttrChkPltSIbrkEntity );
			navigateToRelation(attCovAttrChkPltSIbrkEntity );
			navigateToPayment(attCovAttrChkPltSIbrkEntity );
			navigateToFollowup(attCovAttrChkPltSIbrkEntity );
			navigateToDocument(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterestDetails(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterestAttributes(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterestAttachCoverages(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterestRelations(attCovAttrChkPltSIbrkEntity );
			navigateToInsuredInterestPayments(attCovAttrChkPltSIbrkEntity );
			navigateToAttachCoverageDetailsTab(attCovAttrChkPltSIbrkEntity);
			navigateToAttachCoverageAttributesTab(attCovAttrChkPltSIbrkEntity);
			navigateToAttachCoveragePremiumTab(attCovAttrChkPltSIbrkEntity);

		}
	}
}

