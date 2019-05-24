package com.aqm.staf.library.pages.fire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttSpeCondFireEntity;
import com.aqm.staf.library.databin.SpeCondForMiscNLEntity;




public class PolicyAttributeSpecialConditionFire extends BasePage {
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
	private PageElement specialConditionsTextArea;
	private PageElement lPSFPolicydetailsTitle;
	
	//SF
	private PageElement doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsuranceDropDown;
	private PageElement whetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremisesDropDown;

	public PolicyAttributeSpecialConditionFire(WebDriver driver,String pageName) {
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
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    //SF
		doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsuranceDropDown=new PageElement(By.xpath("//div[contains(text(),'Do you have any other concurrent insurance in respect of the same property proposed for the insurance')]/following::select"),"Do you have any other concurrent insurance in respect of the same property proposed for the insurance",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		whetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremisesDropDown=new PageElement(By.xpath("//div[contains(text(),'Whether the insured suffered loss/losses due to fire and/or any other allied peril at the risk premises')]/following::select"),"Whether the insured suffered loss/losses due to fire and/or any other allied peril at the risk premises",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}
	public void fillPolicyAttributeSpecialConditionFire(PolAttSpeCondFireEntity polAttSpeCondFireEntity, CustomAssert assertReference){
		if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("add") || polAttSpeCondFireEntity.getAction().equalsIgnoreCase("edit")){
			//digvijay LP
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polAttSpeCondFireEntity.getStringValueForField("SpecialConditions"));
			}
			
		}
		else if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//digvijay LP
			if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}	
		}
	}
	private void navigateToPreviousAttributePage(PolAttSpeCondFireEntity polAttSpeCondFireEntity) {
		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void clickOnForwardButton(PolAttSpeCondFireEntity polAttSpeCondFireEntity) {
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigForwordButton")){		
		click(forwordButton);
		try{
			acceptAlertAndReturnConfirmationMessage();
			}
		catch(Exception e){
			}
		switchToFrame("display");
		lPSFPolicydetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttSpeCondFireEntity.getStringValueForField("LPSFPolicydetailsTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isElementDisplayed(lPSFPolicydetailsTitle);
	}
	}

public void navigateToPolicy(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigPolicyTab")){		
		click(policyTab);
		switchToFrame("display");
		isElementDisplayed(policyTabTitle);
	}
}
public void navigateToAttribute(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigAttributeTab")){	
		click(attributeTab);
		switchToFrame("display");
		isElementDisplayed(attributeTabTitle);

	}
}
public void navigateToMember(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigMemberTab")){		
		click(memebrTab);
		switchToFrame("display");
		isElementDisplayed(memebrTabTitle);
	}
}
public void navigateToCoverage(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigCoverageTab")){		
		click(coverageTab);
		switchToFrame("display");
		isElementDisplayed(coverageTabTitle);
	}	
}

public void navigateToLoan(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigLoanTab")){
		click(loanTab);
		//		switchToFrame("display");

	}
}
public void navigateToClientDetails(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
		click(clientDetailsTab);
		switchToFrame("display");
		isElementDisplayed(clientDetailsTabTitle);

	}
}
public void navigateToRelation(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigRelationTab")){		
		click(relationsTab);
		switchToFrame("display");
		isElementDisplayed(relationsTabTitle);


	}
}
public void navigateToPayment(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigPaymentsTab")){		
		click(paymentsTab);
		switchToFrame("display");
		isElementDisplayed(paymentsTabTitle);
	
	}
}
public void navigateToFollowup(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigFollowupTab")){		
		click(followupTab);
		switchToFrame("display");
		isElementDisplayed(followupTabTitle);
	}
}
public void navigateToDocument(PolAttSpeCondFireEntity polAttSpeCondFireEntity){
	if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigDocumentTab")){		
		click(documentTab);
		switchToFrame("display");
		isElementDisplayed(documentTabTitle);
	}
}

public void fillSFT5POL(PolAttSpeCondFireEntity polAttSpeCondFireEntity,CustomAssert assertReference) {
	if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("add") || polAttSpeCondFireEntity.getAction().equalsIgnoreCase("edit")){

		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigDoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsurance")) {
			selectValueFromList(doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsuranceDropDown, polAttSpeCondFireEntity.getStringValueForField("DoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsurance"));
		}
		click(forwordButton);
	}
	else if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("verify")){
		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigDoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsurance")) {
			assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("DoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsurance"), fetchValueFromList(doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSamePropertyProposedForTheInsuranceDropDown), AssertionType.WARNING);
		}
		click(forwordButton);
	}
}
public void fillSFT6POL(PolAttSpeCondFireEntity polAttSpeCondFireEntity,CustomAssert assertReference) {
	if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("add") || polAttSpeCondFireEntity.getAction().equalsIgnoreCase("edit")){
	
		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigWhetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremises")) {
			selectValueFromList(whetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremisesDropDown, polAttSpeCondFireEntity.getStringValueForField("WhetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremises"));
		}
		click(forwordButton);
	}
	else if(polAttSpeCondFireEntity.getAction().equalsIgnoreCase("verify")){
		if (polAttSpeCondFireEntity.getBooleanValueForField("ConfigWhetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremises")) {
			assertReference.assertEquals(polAttSpeCondFireEntity.getStringValueForField("WhetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremises"), fetchValueFromList(whetherTheInsuredSufferedLossLossesDueToFireAndOrAnyOtherAlliedPerilAtTheRiskPremisesDropDown), AssertionType.WARNING);
		}
		click(forwordButton);
	}
}

public void fillandSubmitPolicyAttributeSpecialConditionFire(PolAttSpeCondFireEntity polAttSpeCondFireEntity, CustomAssert assertReference) {
	if(isConfigTrue(polAttSpeCondFireEntity.getConfigExecute())){
		switchToFrame("display");
		fillPolicyAttributeSpecialConditionFire(polAttSpeCondFireEntity, assertReference);
		clickOnForwardButton(polAttSpeCondFireEntity);
		if(polAttSpeCondFireEntity.getStringValueForField("Product").equalsIgnoreCase("SF")){	
			fillSFT5POL(polAttSpeCondFireEntity, assertReference);
			fillSFT6POL(polAttSpeCondFireEntity, assertReference);
		}
		navigateToPreviousAttributePage(polAttSpeCondFireEntity);
		navigateTobackAttributePage(polAttSpeCondFireEntity);
		navigateToPolicy(polAttSpeCondFireEntity);
		navigateToAttribute(polAttSpeCondFireEntity);
		navigateToMember(polAttSpeCondFireEntity);
		navigateToCoverage(polAttSpeCondFireEntity);
		navigateToLoan(polAttSpeCondFireEntity);
		navigateToClientDetails(polAttSpeCondFireEntity);
		navigateToRelation(polAttSpeCondFireEntity);
		navigateToPayment(polAttSpeCondFireEntity);
		navigateToFollowup(polAttSpeCondFireEntity);
		navigateToDocument(polAttSpeCondFireEntity);
	}
}
}
