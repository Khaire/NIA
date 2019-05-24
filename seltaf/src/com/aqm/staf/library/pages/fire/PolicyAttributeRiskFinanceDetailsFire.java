package com.aqm.staf.library.pages.fire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrFireEntity;
import com.aqm.staf.library.databin.RiskFinanceDFireEntity;
public class PolicyAttributeRiskFinanceDetailsFire extends BasePage{
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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement forwardButton;
	private PageElement backButton;
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
	private PageElement previousButton;
	//digvijay -fd
	private PageElement isThePropertyMortgagedDropDown;
	//digvijay -AR
	private PageElement basisOfPolicyDropDown;
	//private PageElement isThePropertyMortgagedList;	
	private PageElement nameOfTheMortgageeTextArea;
	//LR Dharmendra
	private PageElement totalPMLTextField;
	private PageElement limitofLiabilitypereventTextArea;	
	private PageElement limitofLiabilityAggregateTextArea;
	//FF Dharmendra
	private PageElement areThestocksMortgagedDropDown;
	private PageElement nameOftheMortgageeTextArea;
	private PageElement nameofBankerFinancialInstitutionTextField;
	private PageElement propertyAtStakeTextField;
	private PageElement valueOfPropertyTextField;
	private PageElement locationAddressTextField;
	private PageElement riskFinanceDetailsTitle;

	
	
	public PolicyAttributeRiskFinanceDetailsFire(WebDriver driver, String pageName){
		super(driver,pageName);
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
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//digvijay -fd
		isThePropertyMortgagedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the property Mortgaged')]/following::select"), "Is the property Mortgaged", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//digvijay -AR
		basisOfPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of policy')]/following::select"), "Basis of policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	//	isThePropertyMortgagedList=new PageElement(By.xpath("//td//div[contains(text(),'Is the property Mortgaged')]/following::select"), "Is The Property Mortgaged List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheMortgageeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name of the mortgagee')]/following::textarea"), "Name Of The Mortgagee Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LR Dharmendra
		totalPMLTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total PML')]/following::input"), "Total PML", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitofLiabilitypereventTextArea=new PageElement(By.xpath("//td//div[contains(text(),'per event')]/following::TextArea"), "Limit of Liability (per event)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitofLiabilityAggregateTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Aggregate')]/following::TextArea"), "Limit of Liability (Aggregate)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FF Dharmendra
		areThestocksMortgagedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Are the stocks Mortgaged')]/following::select"), "Are the stocks Mortgaged", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOftheMortgageeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name of the mortgagee')]/following::TextArea"), "Name of the mortgagee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//SA
		nameofBankerFinancialInstitutionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of Banker / Financial Institution')]/following::input"), "Name of Banker / Financial Institution", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		propertyAtStakeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Property at Stake')]/following::input"), "Property at Stake", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfPropertyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value of Property')]/following::input"), "Value of Property", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationAddressTextField=new PageElement(By.xpath("//td//div[contains(text(),'Location Address')]/following::input"), "Location Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyAttributeRiskFinanceDetailsFire(RiskFinanceDFireEntity riskFinanceDFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskFinanceDFireEntity.getAction().equalsIgnoreCase("add") || riskFinanceDFireEntity.getAction().equalsIgnoreCase("edit")){
			//digvijay -fd
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigIsThePropertyMortgaged")) {
				selectValueFromList(isThePropertyMortgagedDropDown, riskFinanceDFireEntity.getStringValueForField("IsThePropertyMortgaged"));
			}
			//digvijay -AR
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigBasisOfPolicy")) {
				selectValueFromList(basisOfPolicyDropDown, riskFinanceDFireEntity.getStringValueForField("BasisOfPolicy"));
			}
			/*if (riskFinanceDFireEntity.getBooleanValueForField("ConfigIsThePropertyMortgagedList")) {
				selectValueFromList(isThePropertyMortgagedList, riskFinanceDFireEntity.getStringValueForField("IsThePropertyMortgagedList"));
			}*/
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigNameOfTheMortgagee")) {
				clearAndSendKeys(nameOfTheMortgageeTextArea, riskFinanceDFireEntity.getStringValueForField("NameOfTheMortgagee"));
			}
			//LR Dharmendra
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigTotalPML")) {
				clearAndSendKeys(totalPMLTextField, riskFinanceDFireEntity.getStringValueForField("TotalPML"));
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLimitofLiabilityperevent")) {
				clearAndSendKeys(limitofLiabilitypereventTextArea, riskFinanceDFireEntity.getStringValueForField("LimitofLiabilityperevent"));
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLimitofLiabilityAggregate")) {
				clearAndSendKeys(limitofLiabilityAggregateTextArea, riskFinanceDFireEntity.getStringValueForField("LimitofLiabilityAggregate"));
			}
			//FF Dharmendra
		
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigAreThestocksMortgaged")) {
				selectValueFromList(areThestocksMortgagedDropDown, riskFinanceDFireEntity.getStringValueForField("AreThestocksMortgaged"));
			}
			
			//SA Sonali
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigNameofBankerFinancialInstitution")) {
				clearAndSendKeys(nameofBankerFinancialInstitutionTextField, riskFinanceDFireEntity.getStringValueForField("NameofBankerFinancialInstitution"));
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPropertyAtStake")) {
				clearAndSendKeys(propertyAtStakeTextField, riskFinanceDFireEntity.getStringValueForField("PropertyAtStake"));
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigValueOfProperty")) {
				clearAndSendKeys(valueOfPropertyTextField, riskFinanceDFireEntity.getStringValueForField("ValueOfProperty"));
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLocationAddress")) {
				clearAndSendKeys(locationAddressTextField, riskFinanceDFireEntity.getStringValueForField("LocationAddress"));
			}
		}
		else if(riskFinanceDFireEntity.getAction().equalsIgnoreCase("verify")){
			//labels
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//digvijay -fd
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigIsThePropertyMortgaged")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("IsThePropertyMortgaged"), fetchValueFromList(isThePropertyMortgagedDropDown), AssertionType.WARNING);
			}
			//digvijay -AR
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigBasisOfPolicy")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("BasisOfPolicy"), fetchValueFromList(basisOfPolicyDropDown), AssertionType.WARNING);
			}
			/*if (riskFinanceDFireEntity.getBooleanValueForField("ConfigIsThePropertyMortgagedList")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("IsThePropertyMortgagedList"), fetchValueFromList(isThePropertyMortgagedList), AssertionType.WARNING);
			}*/
			
			//LR Dharmendra
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigTotalPML")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("TotalPML"), fetchValueFromTextFields(totalPMLTextField), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLimitofLiabilityperevent")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("LimitofLiabilityperevent"), fetchValueFromTextFields(limitofLiabilitypereventTextArea), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLimitofLiabilityAggregate")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("LimitofLiabilityAggregate"), fetchValueFromTextFields(limitofLiabilityAggregateTextArea), AssertionType.WARNING);
			}
			//FF Dharmendra
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigAreThestocksMortgaged")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("AreThestocksMortgaged"), fetchValueFromList(areThestocksMortgagedDropDown), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigNameOftheMortgagee")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("NameOftheMortgagee"), fetchValueFromTextFields(nameOftheMortgageeTextArea), AssertionType.WARNING);
			}

			//SA sonali
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigNameofBankerFinancialInstitution")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("NameofBankerFinancialInstitution"), fetchValueFromTextFields(nameofBankerFinancialInstitutionTextField), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPropertyAtStake")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("PropertyAtStake"), fetchValueFromTextFields(propertyAtStakeTextField), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigValueOfProperty")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("ValueOfProperty"), fetchValueFromTextFields(valueOfPropertyTextField), AssertionType.WARNING);
			}
			if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLocationAddress")) {
				assertReference.assertEquals(riskFinanceDFireEntity.getStringValueForField("LocationAddress"), fetchValueFromTextFields(locationAddressTextField), AssertionType.WARNING);
			}
		}

	}
	private void navigateToPreviousAttributePage(RiskFinanceDFireEntity riskFinanceDFireEntity) {
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			riskFinanceDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+riskFinanceDFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Risk Finance Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(riskFinanceDetailsTitle);
		}
	}
	public void navigateToPolicy(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(RiskFinanceDFireEntity riskFinanceDFireEntity){
		if (riskFinanceDFireEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void fillandSubmitPolicyAttributeRiskFinanceDetailsFire(RiskFinanceDFireEntity riskFinanceDFireEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(riskFinanceDFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeRiskFinanceDetailsFire(riskFinanceDFireEntity, assertReference);
			clickNextButtonPolicyAttribute(riskFinanceDFireEntity);
			navigateTobackAttributePage(riskFinanceDFireEntity);
			navigateToPolicy(riskFinanceDFireEntity);
			navigateToAttribute(riskFinanceDFireEntity);
			navigateToInsuredInterest(riskFinanceDFireEntity);
			navigateToCoverage(riskFinanceDFireEntity);
			navigateToLoan(riskFinanceDFireEntity);
			navigateToClientDetails(riskFinanceDFireEntity);
			navigateToRelation(riskFinanceDFireEntity);
			navigateToPayment(riskFinanceDFireEntity);
			navigateToFollowup(riskFinanceDFireEntity);
			navigateToDocument(riskFinanceDFireEntity);
			navigateToPreviousAttributePage(riskFinanceDFireEntity);


		}
	}
}