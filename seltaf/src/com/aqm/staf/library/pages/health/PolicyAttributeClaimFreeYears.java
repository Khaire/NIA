package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PolicyClaimFreeYearsEntity;
import com.aqm.staf.library.pages.common.PolicySearchPage;


public class PolicyAttributeClaimFreeYears extends BasePage {

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
	private PageElement nextAttributePageTitle;

	private PageElement policyAttributeClaimFreeYearsTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement claimFreeYearsDropdown;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement proceedButton;

	public PolicyAttributeClaimFreeYears(WebDriver driver,String pageName){

		super(driver, pageName);
		policyAttributeClaimFreeYearsTitle = new PageElement(By.xpath("//div//b[contains(text(),' Four Claim Free Year SC')]"), "Policy Attribute Four Claim Free Years Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Development Officer')]"), "Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		claimFreeYearsDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether there is 4 Claim free years", "select")), "Select Whether there is 4 Claim free years Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillPolicyAttributeClaimFreeYears(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity, CustomAssert assertReference){
		if(policyClaimFreeYearsEntity.getAction().equalsIgnoreCase("add") || policyClaimFreeYearsEntity.getAction().equalsIgnoreCase("edit")){

			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigClaimFreeYears")) {
				selectValueFromList(claimFreeYearsDropdown, policyClaimFreeYearsEntity.getStringValueForField("ClaimFreeYears"));
			}
		}
		else if(policyClaimFreeYearsEntity.getAction().equalsIgnoreCase("verify")){

			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigClaimFreeYears")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("ClaimFreeYears"), fetchValueFromList(claimFreeYearsDropdown), AssertionType.WARNING);
			}
			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("SchemeNo"), fetchValueFromTextFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(policyClaimFreeYearsEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
		}
	}



	private void backToMainAttributePage(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity) {
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	private void navigateToPreviousAttributePage(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity) {
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	//sc @ akshata
	private void clickNextButtonFourClaimFreeYears(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity) throws InterruptedException {
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigForwordButton")){		
			click(forwordButton);

			if (policyClaimFreeYearsEntity.getStringValueForField("Product").equalsIgnoreCase("SC")){
				if(!policyClaimFreeYearsEntity.getAction().equalsIgnoreCase("verify")){
					try{
						acceptAlertAndReturnConfirmationMessage();
					}catch(Exception e){}
					if(!policyClaimFreeYearsEntity.getBooleanValueForField("ConfigEndorse")&& policyClaimFreeYearsEntity.getStringValueForField("Product").equalsIgnoreCase("SC")){
					workAround(policyClaimFreeYearsEntity);
				}
				}
				/*else if(policyClaimFreeYearsEntity.getBooleanValueForField("ConfigEndorse")){
				if(!policyClaimFreeYearsEntity.getAction().equalsIgnoreCase("verify")){
					acceptAlertAndReturnConfirmationMessage();
				}
			}*/
			/*try{
				acceptAlertAndReturnConfirmationMessage();
				}
			catch(Exception e){
				}*/

			
			}
			else {
				switchToFrame("display");
				
				//TODO WorkAround
				//click(forwordButton);
			}
		}
	}

	public void workAround(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity) throws InterruptedException{
		workAroundForPolicySearch(policyClaimFreeYearsEntity);
		click(proceedButton);
		switchToFrame("display");
		click(forwordButton);
		switchToFrame("display");
		click(forwordButton);
		/*try{
			acceptAlertAndReturnConfirmationMessage();
			}
		catch(Exception e){
			}*/
		
		/*switchToFrame("display");*/

	}
	public void workAroundForPolicySearch(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity) throws InterruptedException{
		PolicySearchPage policySearchPage=new PolicySearchPage(driver, "Policy Search Page");
		policySearchPage.navigateToPolicySearchPage();
		PageElement quoteNumberTextFeild = new PageElement(By.xpath("//td//b[contains(text(),'Quote')]//following::input"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		clearAndSendKeys(quoteNumberTextFeild,policyClaimFreeYearsEntity.getStringValueForField("QuoteNo") );
		PageElement searchButton= new PageElement(By.name("Search5465"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		click(searchButton);

		String quoteNo=policyClaimFreeYearsEntity.getStringValueForField("QuoteNo").trim();
		//PageElement	policyQuoteLink=new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PageElement	policyQuoteLink=new PageElement(By.partialLinkText(quoteNo), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Thread.sleep(3000);
		click(policyQuoteLink);
		switchToFrame("display");
		click(attributeTab);
		switchToFrame("display");
		isElementDisplayed(attributeTabTitle);
	}

	public void navigateToPolicy(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity){
		if (policyClaimFreeYearsEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void fillandSubmitPolicyAttibutesPolicyFourClaimFreeYears(PolicyClaimFreeYearsEntity policyClaimFreeYearsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyClaimFreeYearsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeClaimFreeYears(policyClaimFreeYearsEntity, assertReference);
			clickNextButtonFourClaimFreeYears(policyClaimFreeYearsEntity);
			backToMainAttributePage(policyClaimFreeYearsEntity);
			navigateToPreviousAttributePage(policyClaimFreeYearsEntity);
			navigateToPolicy(policyClaimFreeYearsEntity);
			navigateToAttribute(policyClaimFreeYearsEntity);
			navigateToMember(policyClaimFreeYearsEntity);
			navigateToCoverage(policyClaimFreeYearsEntity);
			navigateToLoan(policyClaimFreeYearsEntity);
			navigateToClientDetails(policyClaimFreeYearsEntity);
			navigateToRelation(policyClaimFreeYearsEntity);
			navigateToPayment(policyClaimFreeYearsEntity);
			navigateToFollowup(policyClaimFreeYearsEntity);
			navigateToDocument(policyClaimFreeYearsEntity);
		}
	}


}
