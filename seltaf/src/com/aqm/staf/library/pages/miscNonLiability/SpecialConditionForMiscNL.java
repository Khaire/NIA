package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.SpeCondForMiscNLEntity;

public class SpecialConditionForMiscNL extends BasePage{

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

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement specialConditiontTitle;
	private PageElement isThisIndianInterestAbroadPolicyDropDown;
	private PageElement saveButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement forwardButton;

	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement basisOfDeclarationTitle;
	private PageElement specialConditionPageTitle;
	//Shruti DF
	private PageElement basisOfMonthlyDeclarationDropDown;
	public SpecialConditionForMiscNL(WebDriver driver, String pageName) {
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

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditiontTitle= new PageElement(By.xpath("//div//b[contains(text(),'Special Condition')]"),"Special Conditiont Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThisIndianInterestAbroadPolicyDropDown= new PageElement(By.name("propValues1")," Is this Indian Interest Abroad policy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DF -Shruti
		basisOfMonthlyDeclarationDropDown=new PageElement(By.xpath("//div[contains(text(),'Basis of Monthly declaration')]/following::select"),"Basis of Monthly declaration",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}

	public void fillSpecialConditionForMiscNLDetails(SpeCondForMiscNLEntity speCondForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(speCondForMiscNLEntity.getAction().equalsIgnoreCase("add") || speCondForMiscNLEntity.getAction().equalsIgnoreCase("edit")){

			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				selectValueFromList(isThisIndianInterestAbroadPolicyDropDown, speCondForMiscNLEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"));
				//doubleClick(quoteNoLabel);
			}
		}

		else if(speCondForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"), fetchValueFromList(isThisIndianInterestAbroadPolicyDropDown), AssertionType.WARNING);
			}
		}
	}
	public void clickSaveButtonSpecialConditionForMiscNL(SpeCondForMiscNLEntity speCondForMiscNLEntity) throws InterruptedException{
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigSave")){	
			click(saveButton);
			switchToFrame("display");
			switchToFrame("display");
			specialConditionPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+speCondForMiscNLEntity.getStringValueForField("SpecialConditionPageTitle")+"')]"), "Special Condition Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(specialConditionPageTitle);
		}
	}
	public void clickOnforwardButton(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigForwardButton")){	
			specialConditionPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+speCondForMiscNLEntity.getStringValueForField("SpecialConditionPageTitle")+"')]"), "Special Condition Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(specialConditionPageTitle);
			click(forwardButton);
			/*if (speCondForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("PE")){
				click(backwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				//click(forwardButton);
			}*/
		}
	}
	public void navigateTobackward(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigBackwardButton")){			
			click(backwardButton);
			switchToFrame("display");
		}
	}
	public void navigateToback(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
		}
	}
	public void navigateToPolicy(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigMemberTab")){			
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(SpeCondForMiscNLEntity speCondForMiscNLEntity){
		if (speCondForMiscNLEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}

	public void fillBasisOfDeclaration(SpeCondForMiscNLEntity speCondForMiscNLEntity,CustomAssert assertReference) {
		if(speCondForMiscNLEntity.getAction().equalsIgnoreCase("add") || speCondForMiscNLEntity.getAction().equalsIgnoreCase("edit")){
			//DF-shruti
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigBasisOfMonthlyDeclaration")) {
				selectValueFromList(basisOfMonthlyDeclarationDropDown, speCondForMiscNLEntity.getStringValueForField("BasisOfMonthlyDeclaration"));
			}
			click(forwardButton);
			switchToFrame("display");
			basisOfDeclarationTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+speCondForMiscNLEntity.getStringValueForField("BasisOfDeclarationTitle")+"')]"), "Basis Of Declaration Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(basisOfDeclarationTitle);
		}
		else if(speCondForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
			if (speCondForMiscNLEntity.getBooleanValueForField("ConfigBasisOfMonthlyDeclaration")) {
				assertReference.assertEquals(speCondForMiscNLEntity.getStringValueForField("BasisOfMonthlyDeclaration"), fetchValueFromList(basisOfMonthlyDeclarationDropDown), AssertionType.WARNING);
			}
			click(forwardButton);
			switchToFrame("display");
			basisOfDeclarationTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+speCondForMiscNLEntity.getStringValueForField("BasisOfDeclarationTitle")+"')]"), "Basis Of Declaration Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(basisOfDeclarationTitle);
		}
	}

	public void fillandSubmitSpecialConditionForMiscNL(SpeCondForMiscNLEntity speCondForMiscNLEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(speCondForMiscNLEntity.getConfigExecute())){
			switchToFrame("display");
			if(speCondForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("DF")){	
				fillBasisOfDeclaration(speCondForMiscNLEntity, assertReference);
			}
			fillSpecialConditionForMiscNLDetails(speCondForMiscNLEntity, assertReference);
			navigateToAttribute(speCondForMiscNLEntity);
			clickOnforwardButton(speCondForMiscNLEntity);
			clickSaveButtonSpecialConditionForMiscNL(speCondForMiscNLEntity);
			navigateToPolicy(speCondForMiscNLEntity);
			navigateToMember(speCondForMiscNLEntity);
			navigateToCoverage(speCondForMiscNLEntity);
			navigateToLoan(speCondForMiscNLEntity);
			navigateToClientDetails(speCondForMiscNLEntity);
			navigateToRelation(speCondForMiscNLEntity);
			navigateToPayment(speCondForMiscNLEntity);
			navigateToFollowup(speCondForMiscNLEntity);
			navigateToDocument(speCondForMiscNLEntity);

		}
	}
}
