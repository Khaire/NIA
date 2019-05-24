package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttLPSFPolDetEntity;




public class PolicyAttributeLPSFPolicyDetailFire extends BasePage{
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

	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement forwordButton;
	private PageElement backButton;
	private PageElement previousButton;
	//digvijay LP
	private PageElement standardFirePolicyNumberTextField;
	private PageElement standardFirePolicyInceptionDateTextField;
	private PageElement standardFirePolicyExpiryDateTextField;
	private PageElement issuingCompanyDropDown;
	private PageElement toConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicyTextField;
	private PageElement whetherSTFIInCorrMDPolicyIsExcludedTextField;
	private PageElement whetherRSMDInCorrMDPolicyIsExcludedTextField;
	private PageElement endorsementReasonTitle;
	//LP
	private PageElement standardFirePolicyInceptionDateFindButton;
	private PageElement standardFirePolicyExpiryDateFindButton;
	private PageElement typeOfTerrorismCoverRequiredDropDown;
	private PageElement typeofTerrorismrequired;

	public PolicyAttributeLPSFPolicyDetailFire(WebDriver driver,String pageName) {
		super(driver, pageName);
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

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//digvijay LP
		standardFirePolicyNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Standard Fire policy number')]/following::input"), "Standard Fire policy number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standardFirePolicyInceptionDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Standard Fire policy inception date')]/following::input"), "Standard Fire policy inception date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standardFirePolicyExpiryDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Standard Fire policy expiry date')]/following::input"), "Standard Fire policy expiry date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		issuingCompanyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Issuing Company')]/following::select"), "Issuing Company", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		toConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'To Confirm that coverage under BI Policy is not extensive than')]/following::input"), "To Confirm that coverage under BI Policy is not extensive than", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherSTFIInCorrMDPolicyIsExcludedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Whether STFI in corresponding MD Policy')]/following::input"), "Whether STFI in corresponding MD Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherRSMDInCorrMDPolicyIsExcludedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Whether RSMD in corresponding MD Policy')]/following::input"), "//td//div[contains(text(),'Whether RSMD in corresponding MD Pol", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LP nilesh
		standardFirePolicyInceptionDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Standard Fire policy inception date')]/following::img"), "Standard Fire policy inception date'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		standardFirePolicyExpiryDateFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Standard Fire policy expiry date')]/following::img"), "Standard Fire policy expiry date'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DHK
		typeOfTerrorismCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Terrorism cover required')]/following::select"), "Type of Terrorism cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
	}
	public void fillPolicyAttributeLPSFPolicyDetailFire(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttLPSFPolDetEntity.getAction().equalsIgnoreCase("add") || polAttLPSFPolDetEntity.getAction().equalsIgnoreCase("edit")){
			//digvijay LP
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyNumber")) {
				clearAndSendKeys(standardFirePolicyNumberTextField, polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyNumber"));
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyInceptionDate")) {
				String dateOfStandardFirePolicyInception=RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyInceptionDate"));
				clearAndEnterDate(standardFirePolicyInceptionDateTextField, dateOfStandardFirePolicyInception);
			} 
			/*if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyInceptionDate")) {
				click(standardFirePolicyInceptionDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(standardFirePolicyInceptionDateTextField, polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyInceptionDate"));
				switchToFrame("display");
			}*/
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyExpiryDate")) {
				String dateOfStandardFirePolicyExpiry=RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyExpiryDate"));
				clearAndEnterDate(standardFirePolicyExpiryDateTextField,dateOfStandardFirePolicyExpiry);
			}
			/*if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyExpiryDate")) {
				click(standardFirePolicyExpiryDateFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(standardFirePolicyExpiryDateTextField, polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyExpiryDate"));
				switchToFrame("display");
			}*/
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigIssuingCompany")) {
				selectValueFromList(issuingCompanyDropDown, polAttLPSFPolDetEntity.getStringValueForField("IssuingCompany"));
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigToConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicy")) {
				clearAndSendKeys(toConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicyTextField, polAttLPSFPolDetEntity.getStringValueForField("ToConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicy"));
			}

			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigWhetherSTFIInCorrMDPolicyIsExcluded")) {
				clearAndSendKeys(whetherSTFIInCorrMDPolicyIsExcludedTextField, polAttLPSFPolDetEntity.getStringValueForField("WhetherSTFIInCorrMDPolicyIsExcluded"));
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigWhetherRSMDInCorrMDPolicyIsExcluded")) {
				clearAndSendKeys(whetherRSMDInCorrMDPolicyIsExcludedTextField, polAttLPSFPolDetEntity.getStringValueForField("WhetherRSMDInCorrMDPolicyIsExcluded"));
			}
			//DHK
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigTypeOfTerrorismCoverRequired")) {
				selectValueFromList(typeOfTerrorismCoverRequiredDropDown, polAttLPSFPolDetEntity.getStringValueForField("TypeOfTerrorismCoverRequired"));
			}
			/*if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigTypeOfTerrorismCoverRequired")) {
				selectValueFromList(typeOfTerrorismCoverRequiredDropDown, polAttLPSFPolDetEntity.getStringValueForField("TypeOfTerrorismCoverRequired"));
			}
			if((polAttLPSFPolDetEntity.getStringValueForField("Product")).equalsIgnoreCase("LP")){

				if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigTypeOfTerrorismCoverRequired")) {
					selectValueFromList(typeofTerrorismrequired, polAttLPSFPolDetEntity.getStringValueForField("TypeOfTerrorismCoverRequired"));
				}
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigTypeOfTerrorismCoverRequired")) {
				selectValueFromList(typeofTerrorismrequired, polAttLPSFPolDetEntity.getStringValueForField("TypeOfTerrorismCoverRequired"));
			}*/
		}

		else if(polAttLPSFPolDetEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//digvijay LP
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyNumber")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyNumber"), fetchValueFromTextFields(standardFirePolicyNumberTextField), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyInceptionDate")) {
				String dateOfStandardFirePolicyInception=RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyInceptionDate"));
				clearAndEnterDate(standardFirePolicyInceptionDateTextField, dateOfStandardFirePolicyInception);
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyInceptionDate")) ,fetchValueFromTextFields(standardFirePolicyInceptionDateTextField),AssertionType.WARNING);
			} 
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigStandardFirePolicyExpiryDate")) {
				String dateOfStandardFirePolicyExpiry=RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyExpiryDate"));
				clearAndEnterDate(standardFirePolicyExpiryDateTextField,dateOfStandardFirePolicyExpiry);
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttLPSFPolDetEntity.getStringValueForField("StandardFirePolicyExpiryDate")) ,fetchValueFromTextFields(standardFirePolicyExpiryDateTextField),AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigIssuingCompany")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("IssuingCompany"), fetchValueFromList(issuingCompanyDropDown), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigToConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicy")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("ToConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicy"), fetchValueFromTextFields(toConfirmThatCovUnderBIPolIsNotExtThanTheCorrMDPolicyTextField), AssertionType.WARNING);
			}

			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigWhetherSTFIInCorrMDPolicyIsExcluded")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("WhetherSTFIInCorrMDPolicyIsExcluded"), fetchValueFromTextFields(whetherSTFIInCorrMDPolicyIsExcludedTextField), AssertionType.WARNING);
			}
			if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigWhetherRSMDInCorrMDPolicyIsExcluded")) {
				assertReference.assertEquals(polAttLPSFPolDetEntity.getStringValueForField("WhetherRSMDInCorrMDPolicyIsExcludede"), fetchValueFromTextFields(whetherRSMDInCorrMDPolicyIsExcludedTextField), AssertionType.WARNING);
			}
		}
	}

	private void clickOnForwardButton(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity) {
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch(Exception e){
			}
			switchToFrame("display");
			endorsementReasonTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttLPSFPolDetEntity.getStringValueForField("EndorsementReason")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(endorsementReasonTitle);
		}
	}
	private void navigateToPreviousAttributePage(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity) {
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void navigateToPolicy(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigAttributeTab")){	
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);

		}
	}
	public void navigateToMember(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}	
	}

	public void navigateToLoan(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigLoanTab")){
			click(loanTab);
			//		switchToFrame("display");

		}
	}
	public void navigateToClientDetails(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);

		}
	}
	public void navigateToRelation(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);


		}
	}
	public void navigateToPayment(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);

		}
	}
	public void navigateToFollowup(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity){
		if (polAttLPSFPolDetEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitPolicyAttributeLPSFPolicyDetailFire(PolAttLPSFPolDetEntity polAttLPSFPolDetEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttLPSFPolDetEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeLPSFPolicyDetailFire(polAttLPSFPolDetEntity, assertReference);
			clickOnForwardButton(polAttLPSFPolDetEntity);
			navigateToPreviousAttributePage(polAttLPSFPolDetEntity);
			navigateTobackAttributePage(polAttLPSFPolDetEntity);
			navigateToPolicy(polAttLPSFPolDetEntity);
			navigateToAttribute(polAttLPSFPolDetEntity);
			navigateToMember(polAttLPSFPolDetEntity);
			navigateToCoverage(polAttLPSFPolDetEntity);
			navigateToLoan(polAttLPSFPolDetEntity);
			navigateToClientDetails(polAttLPSFPolDetEntity);
			navigateToRelation(polAttLPSFPolDetEntity);
			navigateToPayment(polAttLPSFPolDetEntity);
			navigateToFollowup(polAttLPSFPolDetEntity);
			navigateToDocument(polAttLPSFPolDetEntity);
		}
	}

}
