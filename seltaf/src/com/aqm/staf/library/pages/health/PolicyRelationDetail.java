
package com.aqm.staf.library.pages.health;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEditReasonEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctionsEntity;
import com.aqm.staf.library.databin.PolicyCoverageDetailsEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyRelationDetail extends BasePage {
	private PageElement policyRelationDetailTitle;
	private PageElement policyTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement attributeTitle;
	private PageElement policyAttributesTitlePage;
	//private PageElement insuredInterestTitle;
	private PageElement memberTitle;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement coverageTitle;
	private PageElement policyCoverageListTitlePage; 
	private PageElement loanTitle;
	//private PageElement 
	private PageElement clientDetailsTitle;
	private PageElement schemeDetailTitlePage;
	private PageElement relationsTitle;
	private PageElement policyRelationsTitlePage;
	private PageElement paymentsTitle;
	private PageElement policyPaymentListTitlePage;
	private PageElement followupTitle;
	private PageElement quotePolicyTitlePage;
	private PageElement documentTitle;
	private PageElement policyDocumentTitlePage;
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel; 
	private PageElement detailsTab;
	private PageElement attributesTab;
	private PageElement schemePartyAttributesTitlePage;
	private PageElement stakeCodeTextField;
	private PageElement stakeCodeSearchTextField;
	private PageElement partyCodeTextField;
	private PageElement partyCodeSearchTextField;
	private PageElement billingPartyCheckBox;
	// Policy relation Attribute
	private PageElement houseNumberLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement policyPartyAttributesTitle;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement stakeCodeLabel;
	private PageElement stakeNameLabel;
	private PageElement roadNumberAndNameLabel;
	private PageElement blockAndAreaNameLabel;
	private PageElement phoneWorkNumberLabel;
	private PageElement isAgentRequiredDropdown;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement stakeCodeFindButton;
	private PageElement partyCodeFindButton;
	private PageElement stakeListTitlePage;
	private PageElement stakecodeToBeSelectedLink;
	private PageElement partySearchPageTitle;
	private PageElement partySearchButton;
	private PageElement organizationRadioButton;
	private PageElement individualRadioButton;
	private PageElement parameterValueTextField;
	private PageElement commissionRateTextField;
	private PageElement commissionRateBrokerTextField;
	private PageElement commissionRateAgentTextField;
	private PageElement relationsAttributesTitle;
	private PageElement brokerCommissionRateTextField;
	private PageElement terrorismpoolcommissionRateTextField;
	private PageElement terrorismStandalonecommissionrateTextField;

	private PageElement terrorismpoolcommissionrateTextField;
	private PageElement terrorismstandalonecommissionrateTextField;
	private PageElement isthebrokerreinsurancebrokerDropDown;
	private PageElement productLabelFire;
	private PageElement corporateAgentCommissionRateTextField;
	private PageElement clearButton;
	private PageElement commissionRateIMFTextField;
	private PageElement codeFindButton;
	//Broker
	private PageElement brokerCommissionTPTextField;
	private PageElement brokerCommissionODTextField;
	private PageElement remunerationAndRewardTextField;
	//Corporate
	private PageElement corporateBrokerCommissionTPTextField;
	private PageElement corporateBrokerCommissionODTextField;
	private PageElement corporateRemunerationAndRewardTextField;
	
	
	public PolicyRelationDetail(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyRelationDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relation Detail')]"), "Policy Relation Detail Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//insuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		schemeDetailTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyPaymentListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		quotePolicyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title PAge", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyDocumentTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRelationDetails","No")),"Policy No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRelationDetails","Quote")),"Quote No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRelationDetails","Status")),"Status Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRelationDetails","Policyholder")),"Policy Holder Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRelationDetails","Product")),"Product Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsTab = new PageElement(By.linkText("Details"),"Details Title",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"),"Attributes Title",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		schemePartyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Party Attributes')]"), "Scheme Party Attributes Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeCodeTextField = new PageElement(By.name("pStakeCode"),"Stake Code Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stakeCodeSearchTextField = new PageElement(By.name("pStakeName"),"Stake Code Search Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"),"Party Code Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyCodeSearchTextField = new PageElement(By.name("pPartyName"),"Party Code Search Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		billingPartyCheckBox = new PageElement(By.name("pCheckbox"),"Party Check Box",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		commissionRateTextField = new PageElement(By.name("pParametervalue1"),"Party Code Search Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		commissionRateBrokerTextField= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Broker Commission Rate (%)')]/following::input"),"Broker Commission Rate (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commissionRateAgentTextField= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Agent Commission Rate (%)')]/following::input[1]"),"Agent Commission Rate (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commissionRateIMFTextField=new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Commission Rate for IMF')]/following::input"),"Commission Rate for IMF", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		//commissionRateAgentTextField= new PageElement(By.xpath("//td/b[contains(text(),'Terrorism Standalone commission rate(%)')]/following::input[1]"),"Terrorism Standalone commission rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Policy relations Attribute
		policyPartyAttributesTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Attributes')]"), "Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeLabel= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Party Code')]/following::font")," Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Party name')]/following::font")," Party name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//partyNameLabel= new PageElement(By.name("pPartyName")," Party name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeCodeLabel= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Stake Code')]/following::font")," Stake Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stakeNameLabel= new PageElement(By.xpath("//form[@name='S0230']//td//b[contains(text(),'Stake name')]/following::font")," Party name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//stakeNameLabel= new PageElement(By.name("pStakeName")," Stake name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		houseNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", " House Number :")), " House Number : Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		roadNumberAndNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Road (Number & Name)")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		blockAndAreaNameLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Block & Area Name")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		phoneWorkNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Phone (Work)")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Applicable Event Code")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isAgentRequiredDropdown=new PageElement(By.xpath("//td//b[contains(text(),'Is Agent Required')]/following::select"), "Is Agent Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stakeCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Stake')]/following::input/following::a[@name='firstFocus']"), "Stake code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Party')]/following::input/following::a[@name='firstFocus']"), "Party code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stakeListTitlePage= new PageElement(By.xpath("//div//b[contains(text(),'Stake')]"), "Stake List Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partySearchPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Party Search')]"), "Party Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partySearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organizational Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		individualRadioButton= new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//preceding::input[@type='radio']"),"Individual Radio Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		parameterValueTextField=new PageElement(By.name("pParameterValue"), "Parameter Value TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Relation Attribute
		relationsAttributesTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		brokerCommissionRateTextField= new PageElement(By.xpath("//b[contains(text(),'Broker Commission Rate (%)')]//following::input"), "Broker Commission Rate (%)",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		terrorismpoolcommissionRateTextField= new PageElement(By.xpath("//b[contains(text(),'Terrorism pool commission rate(%)')]//following::input"), "Terrorism pool commission rate(%)",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		terrorismStandalonecommissionrateTextField= new PageElement(By.xpath("//b[contains(text(),'Terrorism Standalone commission rate(%)')]//following::input"), "Terrorism Standalone commission rate(%)",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isthebrokerreinsurancebrokerDropDown= new PageElement(By.xpath("//td//b[contains(text(),'Is the broker the reinsurance broker')]//following::select"), "Is the broker reinsurance",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		productLabelFire = new PageElement(By.xpath(genericLocatorforLabel("S0230", "Product ")), " Product Name Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		corporateAgentCommissionRateTextField=new PageElement(By.xpath("//td//b[contains(text(),'Corporate Agent Commission Rate (%)')]/following::input"),"Corporate Agent Commission Rate TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clearButton=new PageElement(By.name("Clear"),"Clear Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		codeFindButton= new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"),"Code find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		//Broker
		brokerCommissionTPTextField=new PageElement(By.name("pParametervalue1"), "Broker Commission TP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		brokerCommissionODTextField=new PageElement(By.name("pParametervalue3"), "Broker Commission OD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remunerationAndRewardTextField=new PageElement(By.name("pParametervalue2"), "Remuneration And Reward", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Corporate
		corporateBrokerCommissionTPTextField=new PageElement(By.name("pParametervalue1"), "Broker Commission TP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		corporateBrokerCommissionODTextField=new PageElement(By.name("pParametervalue3"), "Broker Commission OD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		corporateRemunerationAndRewardTextField=new PageElement(By.name("pParametervalue2"), "Remuneration And Reward", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillPolicyRelationDetail(PolicyRelationDetailEntity policyRelationDetailEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigDetailsTab")){

			if(policyRelationDetailEntity.getAction().equalsIgnoreCase("add") || policyRelationDetailEntity.getAction().equalsIgnoreCase("edit")){

				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCode")) {
					fillStakeSearch(policyRelationDetailEntity);
				}

				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCode")) {
					
					fillPartyCodeSearch(policyRelationDetailEntity);

				}

				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBillingPartyCheckBox")) {
					check(billingPartyCheckBox);
				}
			}
			else if(policyRelationDetailEntity.getAction().equalsIgnoreCase("verify")){
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPolicyHolder")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCode")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("StakeCode"), fetchValueFromTextFields(stakeCodeTextField), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCodeSearch")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("StakeCodeSearch"), fetchValueFromTextFields(stakeCodeSearchTextField), AssertionType.WARNING);
				}	
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PartyCode").trim(), fetchValueFromTextFields(partyCodeTextField).trim(), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCodeSearch")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PartyCodeSearch"), fetchValueFromTextFields(partyCodeSearchTextField), AssertionType.WARNING);
				}
				
			}
		}
	}

	/**
	 * @param policyRelationDetailEntity
	 * @param assertReference
	 */
	public void fillAttributeDetails(PolicyRelationDetailEntity policyRelationDetailEntity, CustomAssert assertReference){
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigAttributesTab")){
			if(policyRelationDetailEntity.getAction().equalsIgnoreCase("add") || policyRelationDetailEntity.getAction().equalsIgnoreCase("edit")){
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigIsAgentRequiredDropdown")) {
					selectValueFromList(isAgentRequiredDropdown, policyRelationDetailEntity.getStringValueForField("IsAgentRequiredDropdown"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCommissionRate")) {
					clearAndSendKeys(commissionRateTextField, policyRelationDetailEntity.getStringValueForField("CommissionRate"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionRate")) {
					clearAndSendKeys(brokerCommissionRateTextField, policyRelationDetailEntity.getStringValueForField("BrokerCommissionRate"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigTerrorismPoolCommissionRate")) {
					clearAndSendKeys(terrorismpoolcommissionRateTextField, policyRelationDetailEntity.getStringValueForField("TerrorismPoolCommissionRate"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigTerrorismStandaloneCommissionRate")) {
					clearAndSendKeys(terrorismStandalonecommissionrateTextField, policyRelationDetailEntity.getStringValueForField("TerrorismStandaloneCommissionRate"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigIsThebrokerreinsurance")) {
					selectValueFromList(isthebrokerreinsurancebrokerDropDown, policyRelationDetailEntity.getStringValueForField("IsThebrokerreinsurance"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateAgentCommissionRate")) {
					clearAndSendKeys(corporateAgentCommissionRateTextField, policyRelationDetailEntity.getStringValueForField("CorporateAgentCommissionRate"));
				}
				//Broker
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionTP")) {
					clearAndSendKeys(brokerCommissionTPTextField, policyRelationDetailEntity.getStringValueForField("BrokerCommissionTP"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionOD")) {
					clearAndSendKeys(brokerCommissionODTextField, policyRelationDetailEntity.getStringValueForField("BrokerCommissionOD"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigRemunerationAndReward")) {
					clearAndSendKeys(remunerationAndRewardTextField, policyRelationDetailEntity.getStringValueForField("RemunerationAndReward"));
				}
				//Cor-Agent
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateBrokerCommissionTP")) {
					clearAndSendKeys(corporateBrokerCommissionTPTextField, policyRelationDetailEntity.getStringValueForField("CorporateBrokerCommissionTP"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateBrokerCommissionOD")) {
					clearAndSendKeys(corporateBrokerCommissionODTextField, policyRelationDetailEntity.getStringValueForField("CorporateBrokerCommissionOD"));
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateRemunerationAndReward")) {
					clearAndSendKeys(corporateRemunerationAndRewardTextField, policyRelationDetailEntity.getStringValueForField("CorporateRemunerationAndReward"));
				}
			}

			if(policyRelationDetailEntity.getAction().equalsIgnoreCase("verify")){
				navigateToAttributeTab(policyRelationDetailEntity);

				if (policyRelationDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPolicyHolder")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigProductLabel")) {
					if(policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("SA")){
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabelFire), AssertionType.WARNING);
					}
					else{
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
					}
				}
				/*if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCode")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PartyCode"), fetchValueFromFields(partyCodeLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyName")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PartyName"), fetchValueFromFields(partyNameLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCode")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("StakeCode"), fetchValueFromFields(stakeCodeLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeName")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("StakeName"), fetchValueFromFields(stakeNameLabel), AssertionType.WARNING);
				}*/
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigHouseNumber")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("HouseNumber"), fetchValueFromFields(houseNumberLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigRoadNumberAndName")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("RoadNumberAndName"), fetchValueFromFields(roadNumberAndNameLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBlockAndAreaName")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("BlockAndAreaName"), fetchValueFromFields(blockAndAreaNameLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigPhoneNumber")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("PhoneNumber"), fetchValueFromFields(phoneWorkNumberLabel), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigIsThebrokerreinsurance")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("IsThebrokerreinsurance"), fetchValueFromFields(isthebrokerreinsurancebrokerDropDown), AssertionType.WARNING);
				}
				//Broker
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionTP")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("BrokerCommissionTP"), fetchValueFromTextFields(brokerCommissionTPTextField), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionOD")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("BrokerCommissionOD"), fetchValueFromTextFields(brokerCommissionODTextField), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigRemunerationAndReward")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("RemunerationAndReward"), fetchValueFromTextFields(remunerationAndRewardTextField), AssertionType.WARNING);
				}
				//Corporate
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateBrokerCommissionTP")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CorporateBrokerCommissionTP"), fetchValueFromTextFields(corporateBrokerCommissionTPTextField), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateBrokerCommissionOD")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CorporateBrokerCommissionOD"), fetchValueFromTextFields(corporateBrokerCommissionODTextField), AssertionType.WARNING);
				}
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateRemunerationAndReward")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CorporateRemunerationAndReward"), fetchValueFromTextFields(corporateRemunerationAndRewardTextField), AssertionType.WARNING);
				}
				
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigCommissionRate")) {

					if(policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("BROKER")){
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CommissionRate"), fetchValueFromTextFields(commissionRateBrokerTextField), AssertionType.WARNING);	
					}
					if(policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("BROKER")){
						String path="//b[contains(text(),'Terrorism pool commission rate(%)')]//following::input";
						boolean flag=isPageElementExists(path);
						if(!flag){
							assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("TerrorismPoolCommissionRate"), fetchValueFromTextFields(terrorismpoolcommissionRateTextField), AssertionType.WARNING);
						}
					}		
					if((policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("AGENT"))||(policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("Agent"))||(policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("COR-AGENT"))){
						if(!(policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("SA"))){
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CommissionRate"), fetchValueFromTextFields(commissionRateAgentTextField), AssertionType.WARNING);	
						}
						else {
							assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CommissionRate"), fetchValueFromTextFields(commissionRateAgentTextField), AssertionType.WARNING);	

						}
					}

				}
				if(policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if (policyRelationDetailEntity.getBooleanValueForField("ConfigTerrorismPoolCommissionRate")) {
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("TerrorismPoolCommissionRate"), fetchValueFromTextFields(terrorismpoolcommissionRateTextField), AssertionType.WARNING);
					}

					if (policyRelationDetailEntity.getBooleanValueForField("ConfigTerrorismStandaloneCommissionRate")) {
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("TerrorismStandaloneCommissionRate"), fetchValueFromTextFields(terrorismStandalonecommissionrateTextField), AssertionType.WARNING);
					}
					if (policyRelationDetailEntity.getBooleanValueForField("ConfigBrokerCommissionRate")) {
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("BrokerCommissionRate"), fetchValueFromTextFields(brokerCommissionRateTextField), AssertionType.WARNING);
					}
					if (policyRelationDetailEntity.getBooleanValueForField("ConfigCorporateAgentCommissionRate")) {
						assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CorporateAgentCommissionRate"), fetchValueFromTextFields(corporateAgentCommissionRateTextField), AssertionType.WARNING);
					}

				}
				/*if (policyRelationDetailEntity.getBooleanValueForField("ConfigApplicationEventCodeLabel")) {
				assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("applicableEventCodeLabel"), fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}*/
				if (policyRelationDetailEntity.getBooleanValueForField("ConfigIsAgentRequiredDropdown")) {
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("IsAgentRequiredDropdown"), fetchValueFromList(isAgentRequiredDropdown), AssertionType.WARNING);
				}
			}
		}
	}

	public void clickOnStakeCodeFindButton(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCodeFindButton")){
			Thread.sleep(3000);
			click(stakeCodeFindButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Stake Search");
			}catch(Exception e){
				switchToWindow("Stake Search");
			}
		}
	}

	public void fillStakeSearch(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		clickOnStakeCodeFindButton(policyRelationDetailEntity);

		if(policyRelationDetailEntity.getBooleanValueForField("ConfigStakeCode")){
			Thread.sleep(5000);
			clearAndSendKeys(stakeCodeTextField,policyRelationDetailEntity.getStringValueForField("StakeCode") );	
		}
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigStakeName")){
			Thread.sleep(5000);
			clearAndSendKeys(stakeCodeSearchTextField, "StakeName");
		}
		click(codeFindButton);
		Thread.sleep(5000);
		selectstakeCode(policyRelationDetailEntity);
	}

	public void selectstakeCode(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		stakecodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+policyRelationDetailEntity.getStringValueForField("StakeCode")+"')]"),"Stake Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		doubleClick(stakecodeToBeSelectedLink);
		//click(stakecodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	//TODO Party Search for Relation
	public void clickOnPartyCodeFindButton(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		Thread.sleep(3000);
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCodeFindButton")){
			click(partyCodeFindButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Stake Search");
			}catch(Exception e){
				switchToWindow("Stake Search");
			}

		}
	}
	public void fillPartyCodeSearch(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		clickOnPartyCodeFindButton(policyRelationDetailEntity);
		if(!(policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("KY"))){
			if((policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("TPA")||policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("IMF"))){
				check(organizationRadioButton);	
			}
		}
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigClearButton")){
			check(individualRadioButton);	
			Thread.sleep(3000);
			click(clearButton);
		}
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigOrganizationButton")){
			check(organizationRadioButton);	
			Thread.sleep(3000);
			click(clearButton);
		}

		if(policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCode")){
			Thread.sleep(7000);
			clearAndSendKeys(partyCodeTextField, policyRelationDetailEntity.getStringValueForField("PartyCode"));
		}
		if((policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("COR-AGENT"))){
			Thread.sleep(3000);
			clearTextField(parameterValueTextField);	
		}

		click(partySearchButton);
		Thread.sleep(3000);
		selectSearchPartyCode(policyRelationDetailEntity);
	}
	public void selectSearchPartyCode(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		String	partyCode=policyRelationDetailEntity.getStringValueForField("PartyCode");
		partyCode = partyCode.trim();		
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	public void fillPartySearch(PolicyRelationDetailEntity policyRelationDetailEntity) throws InterruptedException{
		clickOnPartyCodeFindButton(policyRelationDetailEntity);
		switchToWindow();
		if(policyRelationDetailEntity.getBooleanValueForField("ConfigPartyCode")){


		}
	}

	public void navigateToPolicy(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttribute(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToMember(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitlePage);
		}
	}
	public void navigateToCoverage(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}

	/*public void navigateToLoan(){
			click(LoanTitle);
			switchToFrame("display");
			isElementDisplayed());
			return;
		}*/

	public void navigateToClientDetails(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			//isElementDisplayed(schemeDetailTitlePage);
		}
	}
	public void navigateToRelations(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitlePage);
		}
	}
	
	public void navigateToPayments(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitlePage);
		}
	}
	public void navigateToFollowup(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitlePage);
		}
	}
	public void navigateToDocument(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitlePage);
		}
	}
	public void submitPolicyRelationsDetails(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromPartyRelationsDetails(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void navigateToAttributeTab(PolicyRelationDetailEntity policyRelationDetailEntity){
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigProperty")){
			click(policyPartyAttributesTitle);
			switchToFrame("display");
		}
	}
	// to verify Agent/Broker Commission. 
	public void navigateToPolicyRelationsAttributes(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if(policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural") || policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")|| policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")|| policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")|| policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")||policyRelationDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){
			      if (policyRelationDetailEntity.getBooleanValueForField("ConfigRelationAttributesTab")) {
			     click(relationsAttributesTitle);
				if(policyRelationDetailEntity.getAction().equalsIgnoreCase("verify")&&!(policyRelationDetailEntity.getStringValueForField("Product").equalsIgnoreCase("PP"))){
					click(saveButton);
				}

			}
		}
	}


	public void submitPolicyAttributesDetails(PolicyRelationDetailEntity policyRelationDetailEntity) {
		if (policyRelationDetailEntity.getBooleanValueForField("ConfigAttributeSaveButton")) {
			click(saveButton);
		}
	}
	public void fillAttributeDetailsforSG(PolicyRelationDetailEntity policyRelationDetailEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyRelationDetailEntity.getAction().equalsIgnoreCase("verify")){
			if (policyRelationDetailEntity.getBooleanValueForField("ConfigCommissionRate")) {

				if(policyRelationDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("IMF")){
					assertReference.assertEquals(policyRelationDetailEntity.getStringValueForField("CommissionRate"), fetchValueFromTextFields(commissionRateIMFTextField), AssertionType.WARNING);	
				}
			}
		}
	}
	public void fillAndSubmitPartyRelationsDetails(PolicyRelationDetailEntity policyRelationDetailEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyRelationDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyRelationDetail(policyRelationDetailEntity, assertReference);
			submitPolicyRelationsDetails(policyRelationDetailEntity);
			navigateToPolicyRelationsAttributes(policyRelationDetailEntity);
			fillAttributeDetailsforSG(policyRelationDetailEntity,assertReference);
			fillAttributeDetails(policyRelationDetailEntity, assertReference);
			submitPolicyAttributesDetails(policyRelationDetailEntity);
			navigateToPolicy(policyRelationDetailEntity);
			navigateToAttribute(policyRelationDetailEntity);
			navigateToMember(policyRelationDetailEntity);
			navigateToCoverage(policyRelationDetailEntity);
			navigateToClientDetails(policyRelationDetailEntity);
			navigateToRelations(policyRelationDetailEntity);
			navigateToPayments(policyRelationDetailEntity);
			navigateToFollowup(policyRelationDetailEntity);
			navigateToDocument(policyRelationDetailEntity);
			backFromPartyRelationsDetails(policyRelationDetailEntity);
			
		}
	}
}



