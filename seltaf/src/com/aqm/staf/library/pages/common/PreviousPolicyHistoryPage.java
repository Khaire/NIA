package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PreviousPolicyHistoryEntity;

public class PreviousPolicyHistoryPage extends BasePage{
	private PageElement previousPolicyHistoryT3POLTitle;	
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memberTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memberTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement nextAttributePageTitle;
	private PageElement breakInInsuranceTitle;

	private PageElement schemeNoLabel;	
	private PageElement statusLabel;	
	private PageElement policyholderLabel;	
	private PageElement productLabel;
	private PageElement duplicatePolicyDocumentGenerartionfeeRequiredDropDown;
	private PageElement endorsementTypeListDropDown;
	private PageElement whetherDepartureDateIsPostponedDropDown;
	private PageElement endorsementPremiumCalculationBasisDropDown;

	private PageElement previousPolicyNumberTextBox;
	private PageElement previousPolicyPeriodTextBox;
	private PageElement preMedicalCheckUpDetailsTextBox;
	
	private PageElement nameofInsurerDropDown;
	private PageElement detailsOfOthersTextField;
	private PageElement previousPolicyNumberTextField;
	private PageElement expiryDateFindButton;
	private PageElement fromDateFindButton;
	private PageElement toDateFindButton;
	private PageElement premiumPaidTextField;
	private PageElement totalNumberOfClaimsRegisteredTextField;
	private PageElement claimsPaidTextField;
	private PageElement claimsIncurredTextField;
	private PageElement incurredClaimRatioTextField;
	private PageElement detailsOfPastandOrUninsuredlossesTextArea;
	
	private PageElement expiryDateTextField;
	private PageElement fromDateTextField;
	private PageElement toDateTextField;


	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;

	public PreviousPolicyHistoryPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		previousPolicyHistoryT3POLTitle =new PageElement(By.xpath("//div/b[contains(text(),'Previous Policy History T3-POL')]"), "Previous Policy History T3-POL Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Development Officer')]"), "Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakInInsuranceTitle=new PageElement(By.xpath("//div//b[contains(text(),'Break-in-Insurance')]"), "Break In Insurance Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		duplicatePolicyDocumentGenerartionfeeRequiredDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duplicate Policy Document Generartion fee required","select")), "Duplicate Policy Document Generartion fee required DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		endorsementTypeListDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Endorsement Type List","select")), "Endorsement Type List DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherDepartureDateIsPostponedDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Departure Date is postponed","select")), "Whether Departure Date is postponed DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		endorsementPremiumCalculationBasisDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Endorsement Premium Calculation Basis","select")), "Endorsement Premium Calculation Basis DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		previousPolicyNumberTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Previous Policy Number')]/following::input"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Previous Policy Period')]/following::td"), "Previous Policy Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preMedicalCheckUpDetailsTextBox =new PageElement(By.xpath("//tr//td//div[contains(text(),'Pre Medical Check Up Details')]/following::textarea"), "Pre Medical Check Up Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nameofInsurerDropDown=new PageElement(By.xpath("//tr//td//div[contains(text(),'Name of Insurer')]/following::select"), "Name of Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfOthersTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Details of Others')]/following::textarea"), "Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expiryDateFindButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'Expiry Date')]/following::input/following::a[@name='firstFocus']"), "Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromDateFindButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'From date')]/following::input/following::a[@name='firstFocus']"), "From date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toDateFindButton=new PageElement(By.xpath("//tr//td//div[contains(text(),'To date')]/following::input/following::a[@name='firstFocus']"), "To date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPaidTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Premium Paid')]/following::input"), "Premium Paid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberOfClaimsRegisteredTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Total Number of Claims Registered')]/following::input"), "Total Number of Claims Registered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Claims Paid')]/following::input"), "Claims Paid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Claims Incurred')]/following::input"), "Claims Incurred", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Incurred Claim Ratio (%)')]/following::input"), "Incurred Claim Ratio (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfPastandOrUninsuredlossesTextArea=new PageElement(By.xpath("//tr//td//div[contains(text(),'Details of Past and/or uninsured losses')]/following::textarea"), "Details of Past and/or uninsured losses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		expiryDateTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'Expiry Date')]/following::input"), "Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromDateTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'From date')]/following::input"), "From date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toDateTextField=new PageElement(By.xpath("//tr//td//div[contains(text(),'To date')]/following::input"), "To date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillPreviousPolicyHistoryDetails(PreviousPolicyHistoryEntity previousPolicyHistoryEntity, CustomAssert assertReference)throws InterruptedException{
		if(previousPolicyHistoryEntity.getAction().equalsIgnoreCase("add") || previousPolicyHistoryEntity.getAction().equalsIgnoreCase("edit")){

			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDuplicatePolicyDocumentGenerartionFeeRequired")) {
				selectValueFromList(duplicatePolicyDocumentGenerartionfeeRequiredDropDown, previousPolicyHistoryEntity.getStringValueForField("DuplicatePolicyDocumentGenerartionFeeRequired"));
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigEndorsementTypeList")) {
				selectValueFromList(endorsementTypeListDropDown, previousPolicyHistoryEntity.getStringValueForField("EndorsementTypeList"));
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigWhetherDepartureDateIsPostponed")) {
				selectValueFromList(whetherDepartureDateIsPostponedDropDown, previousPolicyHistoryEntity.getStringValueForField("WhetherDepartureDateIsPostponed"));
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextBox, previousPolicyHistoryEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPreviousPolicyPeriod")) {
				clearAndSendKeys(previousPolicyPeriodTextBox, previousPolicyHistoryEntity.getStringValueForField("PreviousPolicyPeriod"));
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPreMedicalCheckUpDetails")) {
				clearAndSendKeys(preMedicalCheckUpDetailsTextBox, previousPolicyHistoryEntity.getStringValueForField("PreMedicalCheckUpDetails"));
			}
			if(previousPolicyHistoryEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigNameofInsurer")) {
					selectValueFromList(nameofInsurerDropDown, previousPolicyHistoryEntity.getStringValueForField("NameofInsurer"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDetailsOfOthers")) {
					
					clearAndSendKeys(detailsOfOthersTextField, previousPolicyHistoryEntity.getStringValueForField("DetailsOfOthers"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigExpiryDate")) {
					//clearAndSendKeys(expiryDateTextField, previousPolicyHistoryEntity.getStringValueForField("ExpiryDate"));
					click(expiryDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(expiryDateTextField, previousPolicyHistoryEntity.getStringValueForField("ExpiryDate"));
					switchToFrame("display");
					
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigFromDate")) {
					//clearAndSendKeys(fromDateFindButton, previousPolicyHistoryEntity.getStringValueForField("FromDate"));
					click(fromDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(fromDateTextField, previousPolicyHistoryEntity.getStringValueForField("FromDate"));
					switchToFrame("display");
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigToDate")) {
					//clearAndSendKeys(toDateTextField, previousPolicyHistoryEntity.getStringValueForField("ToDate"));
					click(toDateFindButton);
					Thread.sleep(1000);
					selectDateFromCalender(toDateTextField, previousPolicyHistoryEntity.getStringValueForField("ToDate"));
					switchToFrame("display");
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPremiumPaid")) {
					clearAndSendKeys(premiumPaidTextField, previousPolicyHistoryEntity.getStringValueForField("PremiumPaid"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigTotalNumberOfClaimsRegistered")) {
					clearAndSendKeys(totalNumberOfClaimsRegisteredTextField, previousPolicyHistoryEntity.getStringValueForField("TotalNumberOfClaimsRegistered"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigClaimsPaid")) {
					clearAndSendKeys(claimsPaidTextField, previousPolicyHistoryEntity.getStringValueForField("ClaimsPaid"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
					clearAndSendKeys(claimsIncurredTextField, previousPolicyHistoryEntity.getStringValueForField("ClaimsIncurred"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
					clearAndSendKeys(incurredClaimRatioTextField, previousPolicyHistoryEntity.getStringValueForField("IncurredClaimRatio"));
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDetailsOfPastandOrUninsuredlosses")) {
					clearAndSendKeys(detailsOfPastandOrUninsuredlossesTextArea, previousPolicyHistoryEntity.getStringValueForField("DetailsOfPastandOrUninsuredlosses"));
				}
			}
			
		}
		else if(previousPolicyHistoryEntity.getAction().equalsIgnoreCase("verify")){

			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("SchemeNo"), fetchValueFromTextFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if(previousPolicyHistoryEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigNameofInsurer")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("NameofInsurer"), fetchValueFromList(nameofInsurerDropDown), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDetailsOfOthers")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("DetailsOfOthers"), fetchValueFromTextFields(detailsOfOthersTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigExpiryDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(previousPolicyHistoryEntity.getStringValueForField("ExpiryDate")) ,fetchValueFromTextFields(expiryDateTextField), AssertionType.WARNING);
					
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigFromDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(previousPolicyHistoryEntity.getStringValueForField("FromDate")) ,fetchValueFromTextFields(fromDateTextField), AssertionType.WARNING);
					
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigToDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(previousPolicyHistoryEntity.getStringValueForField("ToDate")) ,fetchValueFromTextFields(toDateTextField), AssertionType.WARNING);
					
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPremiumPaid")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("PremiumPaid"), fetchValueFromTextFields(premiumPaidTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigTotalNumberOfClaimsRegistered")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("TotalNumberOfClaimsRegistered"), fetchValueFromTextFields(totalNumberOfClaimsRegisteredTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigClaimsPaid")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimsPaidTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioTextField), AssertionType.WARNING);
				}
				if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDetailsOfPastandOrUninsuredlosses")) {
					assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("DetailsOfPastandOrUninsuredlosses"), fetchValueFromTextFields(detailsOfPastandOrUninsuredlossesTextArea), AssertionType.WARNING);
				}
				
				
				
				
				
				
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigEndorsementTypeList")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("EndorsementTypeList"), fetchValueFromList(endorsementTypeListDropDown), AssertionType.WARNING);
			}
		}
	}

	public void fillPreviousPolicyHistoryDetailsNextPage(PreviousPolicyHistoryEntity previousPolicyHistoryEntity, CustomAssert assertReference){
		if(previousPolicyHistoryEntity.getAction().equalsIgnoreCase("add") || previousPolicyHistoryEntity.getAction().equalsIgnoreCase("edit")){
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigEndorsementPremiumCalculationBasis")) {
				selectValueFromList(endorsementPremiumCalculationBasisDropDown, previousPolicyHistoryEntity.getStringValueForField("EndorsementPremiumCalculationBasis"));
			}	
		}
		else if(previousPolicyHistoryEntity.getAction().equalsIgnoreCase("verify")){
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDuplicatePolicyDocumentGenerartionFeeRequired")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("DuplicatePolicyDocumentGenerartionFeeRequired"), fetchValueFromTextFields(duplicatePolicyDocumentGenerartionfeeRequiredDropDown), AssertionType.WARNING);
			}
			
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigWhetherDepartureDateIsPostponed")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("WhetherDepartureDateIsPostponed"), fetchValueFromTextFields(whetherDepartureDateIsPostponedDropDown), AssertionType.WARNING);
			}
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigEndorsementPremiumCalculationBasis")) {
				assertReference.assertEquals(previousPolicyHistoryEntity.getStringValueForField("EndorsementPremiumCalculationBasis"), fetchValueFromTextFields(endorsementPremiumCalculationBasisDropDown), AssertionType.WARNING);
			}
		}	
	}



	private void backToMainAttributePage(PreviousPolicyHistoryEntity previousPolicyHistoryEntity) {
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void navigateToPreviousAttributePage(PreviousPolicyHistoryEntity previousPolicyHistoryEntity) {
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void clickNextButtonPreviousPolicyHistoryDetails(PreviousPolicyHistoryEntity previousPolicyHistoryEntity) {
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			switchToFrame("display");
			if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigForwordButtonENDORSE")){	
				click(forwordButton);
			if(previousPolicyHistoryEntity.getStringValueForField("Product").equalsIgnoreCase("BH")){
				if(!previousPolicyHistoryEntity.getAction().equalsIgnoreCase("verify")){
				click(forwordButton);
				click(saveButton);
				switchToFrame("display");
			}
		}
	}
}
	}
	private void clickNextButtonNextPolicyHistoryDetails(PreviousPolicyHistoryEntity previousPolicyHistoryEntity) {
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigNextButton")){		
			if(!previousPolicyHistoryEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
			click(forwordButton);
			switchToFrame("display");
		}
	}
	}
	public void navigateToPolicy(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToCoverage(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PreviousPolicyHistoryEntity previousPolicyHistoryEntity){
		if (previousPolicyHistoryEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillandSubmitPreviousPolicyHistoryDetails(PreviousPolicyHistoryEntity previousPolicyHistoryEntity, CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(previousPolicyHistoryEntity.getConfigExecute())){
			if(previousPolicyHistoryEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))
			{
				
					acceptAlertAndReturnConfirmationMessage();
					acceptAlertAndReturnConfirmationMessage();
				
				
			}
			if(!previousPolicyHistoryEntity.getStringValueForField("Product").equalsIgnoreCase("JA"))
			{
			switchToFrame("display");
			}
			fillPreviousPolicyHistoryDetails(previousPolicyHistoryEntity, assertReference);
			clickNextButtonPreviousPolicyHistoryDetails(previousPolicyHistoryEntity);
			fillPreviousPolicyHistoryDetailsNextPage(previousPolicyHistoryEntity, assertReference);
			clickNextButtonNextPolicyHistoryDetails(previousPolicyHistoryEntity);
			//backToMainAttributePage(previousPolicyHistoryEntity);
			navigateToPreviousAttributePage(previousPolicyHistoryEntity);
			navigateToPolicy(previousPolicyHistoryEntity);
			navigateToAttribute(previousPolicyHistoryEntity);
			navigateToMember(previousPolicyHistoryEntity);
			navigateToCoverage(previousPolicyHistoryEntity);
			navigateToLoan(previousPolicyHistoryEntity);
			navigateToClientDetails(previousPolicyHistoryEntity);
			navigateToRelation(previousPolicyHistoryEntity);
			navigateToPayment(previousPolicyHistoryEntity);
			navigateToFollowup(previousPolicyHistoryEntity);
			navigateToDocument(previousPolicyHistoryEntity);

		}
	}
}


















