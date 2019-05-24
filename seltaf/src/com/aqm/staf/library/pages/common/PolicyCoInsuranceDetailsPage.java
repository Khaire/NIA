package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.PolicyCoInsurancDetailEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyCoInsuranceDetailsPage extends WebPage {

	private PageElement coInsuranceDetailsPageTitle;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement coInsuranceTypeDropdown;
	private PageElement coInsuranceCommissionDropdown;
	private PageElement saveButton;
	private PageElement addButton;
	private PageElement deleteButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;


	// Table Content
	private PageElement rowSelectionCheckBox;
	private PageElement companyTextField;
	private PageElement siteTextField;
	private PageElement leaderDropDown;
	private PageElement sharePercentageTextField;

	private PageElement partyCodeTextField;
	private PageElement partyCodeSearchTextField;
	private PageElement partyCodeFindButton;
	private PageElement partySearchButton;
	private PageElement partySearchPageTitle;
	private PageElement companyFindButton;
	private PageElement siteFindButton;	
	private PageElement organizationRadioButton;



	public PolicyCoInsuranceDetailsPage(WebDriver driver, String pageName, int rowcount) {
		super(driver, pageName);
		coInsuranceDetailsPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Co-Insurance Details')]"), "Policy Co-insurance Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("FormCoInsurance","Claim")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("FormCoInsurance","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("FormCoInsurance","Policyholder")), "Policy Holder ladel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("FormCoInsurance","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		coInsuranceTypeDropdown= new PageElement(By.name("pType"), "Co-Insurance Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		coInsuranceCommissionDropdown= new PageElement(By.name("pCommission"), "Co-Insurance Commission Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organizational Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// Co-insurance Table 
		// Find Button code for attaching Company

		rowSelectionCheckBox= new PageElement(By.name("pCheckBox"), "Row Selection CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//CompanyTextField= new PageElement(By.xpath("//tr//td//input[@id='pCheckBox"+rowcount+"']//following::td//input"), "company TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		siteTextField= new PageElement(By.name("pSite"+rowcount+""), "Site TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		leaderDropDown= new PageElement(By.name("pLeader"+rowcount+""), "Leader DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		sharePercentageTextField= new PageElement(By.name("pShare"+rowcount+""), "Share Percentage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyFindButton= new PageElement(By.xpath("//tr//td//input[@name='pCompany"+rowcount+"']/following::input"), "company Find Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//companyFindButton= new PageElement(By.name("pCompany"+rowcount+""), "company Find button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"),"Party Code Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partySearchButton = new PageElement(By.name("Search"),"Party Code Search ",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//partyCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Party')]/following::input/following::a[@name='firstFocus']"), "Party code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		siteFindButton = new PageElement(By.xpath("//tr//td//input[@name='pSite"+rowcount+"']/following::input"), "site Find Button ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		saveButton= new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		addButton= new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		deleteButton= new PageElement(By.name("btnDelete"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton= new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyCoinsuranceDetails(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity, CustomAssert assertReference,ScenarioTestData testData) throws InterruptedException{
		if(policyCoInsurancDetailEntity.getAction().equalsIgnoreCase("add")|| policyCoInsurancDetailEntity.getAction().equalsIgnoreCase("edit")){

			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceType")) {
				selectValueFromList(coInsuranceTypeDropdown, policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceType"));
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceCommission")) {
				selectValueFromList(coInsuranceCommissionDropdown, policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceCommission"));
			}
			/*if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureSharePercentage")) {
				switchToWindow("CoInsurance Details");
				//clearAndSendKeys(sharePercentageTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureSharePercentage"));
				SelectValueAndTypeForTextField(sharePercentageTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureSharePercentage"));
			}*/
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceDetailTable")) {
				editCoInsuranceDetailTable(policyCoInsurancDetailEntity,assertReference, testData);

			}

		}

		else if(policyCoInsurancDetailEntity.getAction().equalsIgnoreCase("verify")){
			PolicyCoInsurancDetailEntity actualPolicyCoInsurancDetailEntity=new PolicyCoInsurancDetailEntity();

			/*if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("QuoteNo", fetchValueFromTextFields(quoteNoLabel));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("QuoteNo"),actualPolicyCoInsurancDetailEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("Status", fetchValueFromTextFields(statusLabel));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("Status"),actualPolicyCoInsurancDetailEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("Policyholder", fetchValueFromTextFields(policyholderLabel));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("Policyholder"),actualPolicyCoInsurancDetailEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigProduct")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("Product", fetchValueFromTextFields(productLabel));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("Product"),actualPolicyCoInsurancDetailEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceType")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("CoInsuranceType", fetchValueFromTextFields(coInsuranceTypeDropdown));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceType"),actualPolicyCoInsurancDetailEntity.getStringValueForField("CoInsuranceType"), AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceCommission")) {
				actualPolicyCoInsurancDetailEntity.setStringValueForField("CoInsuranceCommission", fetchValueFromTextFields(coInsuranceCommissionDropdown));
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceCommission"),actualPolicyCoInsurancDetailEntity.getStringValueForField("CoInsuranceCommission"), AssertionType.WARNING);
			}*/

			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceDetailTable")) {
				verifyCoInsuranceDetailTable(policyCoInsurancDetailEntity,assertReference, testData);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceType")) {
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceType"),fetchValueFromTextFields(coInsuranceTypeDropdown),AssertionType.WARNING);
			}
			if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsuranceCommission")) {
				assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsuranceCommission"),fetchValueFromTextFields(coInsuranceCommissionDropdown),AssertionType.WARNING);
			}
		}
	}
	public void addNewRowButton(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) {
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigAddNewRowButton")) {
			click(addButton);
			//switchToFrame("display");
			return;
		}
	}
	public void submitPolicyCoinsuranceDetails(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) {
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigSave")) {
			click(saveButton);
			//switchToFrame("display");
			//if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}

	public void backFromPolicyCoinsuranceDetails(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException {
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigBack")) {
			click(backButton);
			switchToWindow();
			switchToFrame("display");
			Thread.sleep(3000);
			if(isElementDisplayed(policyQuoteDetailsPageTitle));
			return;
		}
	}
	public void addPreviousRowCheckButton(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) {
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigAddPreviousRowCheckButton")) {
			click(rowSelectionCheckBox);
			switchToFrame("display");

		}
	}
	public void deleteRowButton(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) {
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigDeleteRowButton")) {
			click(deleteButton);
			switchToFrame("display");

		}
	}
	private void editCoInsuranceDetailTable(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity, CustomAssert assertReference,ScenarioTestData testData) throws InterruptedException{
		int TableRowNumber = policyCoInsurancDetailEntity.getIntegerValueForField("TableRowNumber");
		int datarow =TableRowNumber+1; 

		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureCompany")) {
			//clearAndSendKeys(CompanyTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureCompany"));
			fillCompanySearch(policyCoInsurancDetailEntity);
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureSite")) {
			//clearAndSendKeys(siteTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureSite"));
			fillSiteSearch(policyCoInsurancDetailEntity);
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureLeader")) {
			switchToWindow("CoInsurance Details");
			selectValueFromList(leaderDropDown, policyCoInsurancDetailEntity.getStringValueForField("CoInsureLeader"));
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureSharePercentage")) {
			switchToWindow("CoInsurance Details");
		//	clearAndSendKeys(sharePercentageTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureSharePercentage"));
			SelectValueAndTypeForTextField(sharePercentageTextField, policyCoInsurancDetailEntity.getStringValueForField("CoInsureSharePercentage"));
		}
	}
	private void verifyCoInsuranceDetailTable(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity, CustomAssert assertReference,ScenarioTestData testData) throws InterruptedException{
		int TableRowNumber = policyCoInsurancDetailEntity.getIntegerValueForField("TableRowNumber");
		int datarow =TableRowNumber+1;
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureCompany")) {
			companyTextField= new PageElement(By.xpath("//table//tbody//tr["+datarow+"]//td[2]//input"), "Company TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsureCompany"),fetchValueFromTextFields(companyTextField),AssertionType.WARNING);
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureSite")) {
			assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsureSite"),fetchValueFromTextFields(siteTextField),AssertionType.WARNING);
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureLeader")) {
			assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsureLeader"),fetchValueFromFields(leaderDropDown),AssertionType.WARNING);
		}
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCoInsureSharePercentage")) {
			assertReference.assertEquals(policyCoInsurancDetailEntity.getStringValueForField("CoInsureSharePercentage"),fetchValueFromTextFields(sharePercentageTextField),AssertionType.WARNING);
		}
	
	}
	
	public void fillCompanySearch(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		clickOnCompanyFindButton(policyCoInsurancDetailEntity);

		/*if((policyCoInsurancDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("TPA"))){
			check(organizationRadioButton);	
		}*/
		if(policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCompanyPartyCode")){
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, policyCoInsurancDetailEntity.getStringValueForField("CompanyPartyCode"));
		}


		click(partySearchButton);
		Thread.sleep(3000);
		selectCompanyPartyCode(policyCoInsurancDetailEntity);
	}

	public void selectCompanyPartyCode(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		String	partyCode=policyCoInsurancDetailEntity.getStringValueForField("CompanyPartyCode");
		partyCode = partyCode.trim();		
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		Thread.sleep(3000);
		//switchToWindow();
		//switchToFrame("display");
	}
	public void clickOnCompanyFindButton(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigCompanyFindButton")){
			click(companyFindButton);

			try{
				Thread.sleep(3000);
				switchToWindow("Party Maintenance");
			}catch(Exception e){
				switchToWindow("Party Maintenance");
			}

		}
	}
	public void fillSiteSearch(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		clickOnSiteFindButton(policyCoInsurancDetailEntity);

		//if((PolicyCoInsurancDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("TPA"))){
		//	check(organizationRadioButton);	
		//}
		if(policyCoInsurancDetailEntity.getBooleanValueForField("ConfigSitePartyCode")){
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, policyCoInsurancDetailEntity.getStringValueForField("SitePartyCode"));
		}
		/*if((PolicyCoInsurancDetailEntity.getStringValueForField("StakeCode").equalsIgnoreCase("COR-AGENT"))){
			Thread.sleep(3000);
			clearTextField(parameterValueTextField);	
		}*/
		switchToWindow("Party Maintenance");
		click(partySearchButton);
		Thread.sleep(3000);
		selectSitePartyCode(policyCoInsurancDetailEntity);
	}
	public void clickOnSiteFindButton(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		if (policyCoInsurancDetailEntity.getBooleanValueForField("ConfigSiteFindButton")){
			switchToWindow("CoInsurance Details");
			click(siteFindButton);

			try{
				Thread.sleep(3000);
				switchToWindow("Party Maintenance");
			}catch(Exception e){
				switchToWindow("Party Maintenance");
			}
		}
	}
	public void selectSitePartyCode(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity) throws InterruptedException{
		String	partyCode=policyCoInsurancDetailEntity.getStringValueForField("SitePartyCode");
		partyCode = partyCode.trim();		
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		Thread.sleep(3000);
		//switchToWindow();
		//switchToFrame("display");
	}



	// pending for add button. its adds new row in the Table 
	// pending for Delete button. its Delete rows from the Table

	public void fillandSubmitPolicyCoinsuranceDetails(PolicyCoInsurancDetailEntity policyCoInsurancDetailEntity, CustomAssert assertReference, ScenarioTestData testData, int rowcount) throws InterruptedException {
		//switchToFrame("display");
		if(isConfigTrue(policyCoInsurancDetailEntity.getConfigExecute())){
		fillPolicyCoinsuranceDetails(policyCoInsurancDetailEntity, assertReference, testData);
		submitPolicyCoinsuranceDetails(policyCoInsurancDetailEntity);
		backFromPolicyCoinsuranceDetails(policyCoInsurancDetailEntity);
		addNewRowButton(policyCoInsurancDetailEntity);
		addPreviousRowCheckButton(policyCoInsurancDetailEntity);
		deleteRowButton(policyCoInsurancDetailEntity);
	}

	}
}
