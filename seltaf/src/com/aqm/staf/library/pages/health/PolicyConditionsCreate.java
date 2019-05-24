package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyConditionsCreateEntity;
import com.aqm.staf.library.databin.PolicyRejectAlterationEntity;

public class PolicyConditionsCreate extends BasePage {
	private PageElement additionOfConditionsWarrantiesExclusionsTradesInPolicyTitlePage;
	private PageElement conditionsWarrantiesExclusionsTradesInPolicyTitlePage;
	private PageElement policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement typeDropdown;
	private PageElement codeTextField;
	private PageElement codeSearchTextField;
	private PageElement fromDateTextField;
	private PageElement toDateTextField;
	private PageElement newButton;
	private PageElement saveButton;
	private PageElement backButton;

	public PolicyConditionsCreate(WebDriver driver, String pageName) {
		super(driver, pageName);
		additionOfConditionsWarrantiesExclusionsTradesInPolicyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Addition of Conditions/Warranties/Exclusions/Trades in Policy')]"),"Addition of Conditions/Warranties/Exclusions/Trades in Policy Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		conditionsWarrantiesExclusionsTradesInPolicyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Conditions/Warranties/Exclusions/Trades in Policy')]"),"Conditions/Warranties/Exclusions/Trades in Policy Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNoLabel = new PageElement(By.xpath(genericLocatorforLabel("formPolicyAddExcln","Policy")),"Policy No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("formPolicyAddExcln","Quote")),"Quote No. Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("formPolicyAddExcln","Status")),"Status Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("formPolicyAddExcln","Policyholder")),"Policyholder Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("formPolicyAddExcln","Product")),"Product Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeDropdown = new PageElement(By.name("pExclusion"),"Type Dropdown",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		codeTextField = new PageElement(By.name("pPerilCode"),"Code Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		codeSearchTextField = new PageElement(By.name("pPerilName"),"Code Search Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		fromDateTextField = new PageElement(By.name("pFromDate"),"From Date Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		toDateTextField = new PageElement(By.name("pToDate"),"To Date Text Field",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		newButton = new PageElement(By.name("New"),"New Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPolicyConditionsCreateDetails(PolicyConditionsCreateEntity policyConditionsCreateEntity, CustomAssert assertReference){
		if(policyConditionsCreateEntity.getAction().equalsIgnoreCase("add") || policyConditionsCreateEntity.getAction().equalsIgnoreCase("edit")){
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigType")) {
				selectValueFromList(typeDropdown, policyConditionsCreateEntity.getStringValueForField("Type"));
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigCode")) {
				clearAndSendKeys(codeTextField, policyConditionsCreateEntity.getStringValueForField("Code"));
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigCodeSearch")) {
				clearAndSendKeys(codeSearchTextField, policyConditionsCreateEntity.getStringValueForField("CodeSearch"));
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigFromDate")) {
				String fromDate=RandomCodeGenerator.dateGenerator(policyConditionsCreateEntity.getStringValueForField("FromDate"));
				clearAndEnterDate(fromDateTextField, fromDate);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigToDate")) {
				String toDate=RandomCodeGenerator.dateGenerator(policyConditionsCreateEntity.getStringValueForField("ToDate"));
				clearAndEnterDate(toDateTextField, toDate);
			}
		}

		else if(policyConditionsCreateEntity.getAction().equalsIgnoreCase("verify")){
			PolicyConditionsCreateEntity actualPolicyConditionsCreateEntity=new PolicyConditionsCreateEntity();
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigPolicyNo")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("PolicyNo"), actualPolicyConditionsCreateEntity.getStringValueForField("PolicyNo"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigQuoteNo")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("QuoteNo"), actualPolicyConditionsCreateEntity.getStringValueForField("QuoteNo"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigStatus")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("Status", fetchValueFromFields(statusLabel));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("Status"), actualPolicyConditionsCreateEntity.getStringValueForField("Status"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigPolicyholder")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("Policyholder", fetchValueFromFields(policyholderLabel));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("Policyholder"), actualPolicyConditionsCreateEntity.getStringValueForField("Policyholder"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigProduct ")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("Product", fetchValueFromFields(productLabel));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("Product"), actualPolicyConditionsCreateEntity.getStringValueForField("Product"), AssertionType.WARNING);
			}
			/*if (policyConditionsCreateEntity.getBooleanValueForField("ConfigType")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("Type", fetchValueFromTextFields(typeDropdown));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("Type"), actualPolicyConditionsCreateEntity.getStringValueForField("Type"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigCode")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("Code", fetchValueFromTextFields(codeTextField));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("Code"), actualPolicyConditionsCreateEntity.getStringValueForField("Code"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigCodeSearch")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("CodeSearch", fetchValueFromTextFields(codeSearchTextField));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("CodeSearch"), actualPolicyConditionsCreateEntity.getStringValueForField("CodeSearch"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigFromDate")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("FromDate", fetchValueFromTextFields(fromDateTextField));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("FromDate"), actualPolicyConditionsCreateEntity.getStringValueForField("FromDate"), AssertionType.WARNING);
			}
			if (policyConditionsCreateEntity.getBooleanValueForField("ConfigToDate")) {
				actualPolicyConditionsCreateEntity.setStringValueForField("ToDate", fetchValueFromTextFields(toDateTextField));
				assertReference.assertEquals(policyConditionsCreateEntity.getStringValueForField("ToDate"), actualPolicyConditionsCreateEntity.getStringValueForField("ToDate"), AssertionType.WARNING);
			}*/
		}
	}
	/*public void navigateToNew(){
				click(newButton);
				if(isElementDisplayed());
				return;
			}*/
	public void submitPolicyConditionsCreateDetails(PolicyConditionsCreateEntity policyConditionsCreateEntity) {
		if (policyConditionsCreateEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("Display");
			if(isElementDisplayed(additionOfConditionsWarrantiesExclusionsTradesInPolicyTitlePage));
			return;
		}
	}
	public void backFromPolicyConditionsCreateDetails(PolicyConditionsCreateEntity policyConditionsCreateEntity) {
		if (policyConditionsCreateEntity.getBooleanValueForField("conditionsWarrantiesExclusionsTradesInPolicyTitlePage")) {
			click(backButton);
		}
	}
	public void fillAndSubmitPolicyConditionsCreateDetails(PolicyConditionsCreateEntity policyConditionsCreateEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillPolicyConditionsCreateDetails(policyConditionsCreateEntity, assertReference);
		submitPolicyConditionsCreateDetails(policyConditionsCreateEntity);
		//backFromPolicyConditionsCreateDetails(policyConditionsCreateEntity);
	}					
}
