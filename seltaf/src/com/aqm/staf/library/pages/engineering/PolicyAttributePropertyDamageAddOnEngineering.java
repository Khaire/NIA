package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttPropDmAddOnEngEntity;

public class PolicyAttributePropertyDamageAddOnEngineering extends BasePage {

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

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

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

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement backwardButton;
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Mayur_Product name=ET
	private PageElement isThereAnyAddOnCoverExtensionApplicableForPropertyDamageDropDown;
	
	//Chintan
	private PageElement	BusinessInterruptionALOPDropDown;
	
	public PolicyAttributePropertyDamageAddOnEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
		//Mayur_Product name=ET
		isThereAnyAddOnCoverExtensionApplicableForPropertyDamageDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover / Extension applicable for Property Damage')]/following::select"), "Is there any Add on Cover / Extension applicable for Property Damage Textfield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		BusinessInterruptionALOPDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover / Extension applicable for Business Interruption(ALOP)')]/following::select"), "Is there any Add on Cover / Extension applicable for Business Interruption(ALOP)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
	}
	
	public void fillPolicyAttributePropertyDamageAddOnEngineering(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity, CustomAssert assertReference){
		if(polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("add") || polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name=ET
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionApplicable")) {
				selectValueFromList(isThereAnyAddOnCoverExtensionApplicableForPropertyDamageDropDown, polAttPropDmAddOnEngEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionApplicable"));
			}
			
		
		}
				
		else if(polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			//Mayur_Product name=ET
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtensionApplicable")) {
				assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("IsThereAnyAddOnCoverExtensionApplicable"), fetchValueFromList(isThereAnyAddOnCoverExtensionApplicableForPropertyDamageDropDown), AssertionType.WARNING);
			}
			
		}
	}
		
	public void fillBusinessInterruptionAddon(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity, CustomAssert assertReference){
		if(polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("add") || polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("edit")){
			
			if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigBusinessInterruptionALOP")) {
				selectValueFromList(BusinessInterruptionALOPDropDown, polAttPropDmAddOnEngEntity.getStringValueForField("BusinessInterruptionALOP"));
			}
		}
		
		else if(polAttPropDmAddOnEngEntity.getAction().equalsIgnoreCase("verify")){
		//Chintan
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigBusinessInterruptionALOP")) {
			assertReference.assertEquals(polAttPropDmAddOnEngEntity.getStringValueForField("BusinessInterruptionALOP"), fetchValueFromList(BusinessInterruptionALOPDropDown), AssertionType.WARNING);
		}
	}
	}
	public void navigateToPolicy(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void clickOnBackButton(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}
	
	public void clickOnPropertyDamageAddons2ForwardButton(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigPropertyDamageAddons2ForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	
	public void clickOnBusinessInterruptionAddonForwardButton(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity){
		if (polAttPropDmAddOnEngEntity.getBooleanValueForField("ConfigBusinessInterruptionAddonForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	
	public void fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(PolAttPropDmAddOnEngEntity polAttPropDmAddOnEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttPropDmAddOnEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributePropertyDamageAddOnEngineering(polAttPropDmAddOnEngEntity, assertReference);
			clickOnForwardButton(polAttPropDmAddOnEngEntity);
			clickOnPropertyDamageAddons2ForwardButton(polAttPropDmAddOnEngEntity);
			fillBusinessInterruptionAddon(polAttPropDmAddOnEngEntity, assertReference);
			clickOnBusinessInterruptionAddonForwardButton(polAttPropDmAddOnEngEntity);
			navigateToPolicy(polAttPropDmAddOnEngEntity);
			navigateToAttribute(polAttPropDmAddOnEngEntity);
			navigateToInsuredInterest(polAttPropDmAddOnEngEntity);
			navigateToCoverage(polAttPropDmAddOnEngEntity);
			navigateToLoan(polAttPropDmAddOnEngEntity);
			navigateToClientDetails(polAttPropDmAddOnEngEntity);
			navigateToRelation(polAttPropDmAddOnEngEntity);
			navigateToPayment(polAttPropDmAddOnEngEntity);
			navigateToFollowup(polAttPropDmAddOnEngEntity);
			navigateToDocument(polAttPropDmAddOnEngEntity);
		}
	}	

}
