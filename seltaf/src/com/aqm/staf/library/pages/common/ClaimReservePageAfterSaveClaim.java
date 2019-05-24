package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimEntity;

public class ClaimReservePageAfterSaveClaim extends WebPage {

	private PageElement pageTitleAfterCreateReserve;
	private PageElement indemnityReserveTypeFunctionDropDown;
	private PageElement indemnityReserveAmountTextField;
	private PageElement expenseReserveTypeFunctionDropDown;
	private PageElement expenseReserveAmountTextField;
	private PageElement insuredInterestCodeTextField;
	private PageElement reasonForInitiatingIhisactionTextField;
	private PageElement saveButton;
	private PageElement backButton;

	private PageElement policyMemberListTitle; 
	private PageElement memberCodeTextField;
	private PageElement memberNameTextField;
	private PageElement firstNameTextField;
	private PageElement LastNameTextField;
	private PageElement dateOfBirthTextField;
	private PageElement memberCodeSearchButton;

	private PageElement insuredInmtrestFindButton;

	public ClaimReservePageAfterSaveClaim(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		pageTitleAfterCreateReserve= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		indemnityReserveTypeFunctionDropDown=new PageElement(By.name("pPartyFunction"), "claim party Function DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		indemnityReserveAmountTextField= new PageElement(By.name("pClaimReserveAmount"), "Claim Reserve Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expenseReserveTypeFunctionDropDown=new PageElement(By.name("pPartyFunction1"), "claim party Function 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		expenseReserveAmountTextField= new PageElement(By.name("pClaimReserveAmount1"), "Claim Reserve 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeTextField= new PageElement(By.name("pPolicyRiskCode"), "Policy Risk Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForInitiatingIhisactionTextField= new PageElement(By.name("pNewRemark"), "New Remark Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("Save"), "Save Claim Reserve Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// page Elements after Insured InterestCode "Find" Button
		policyMemberListTitle= new PageElement(By.xpath("//font//b[contains(text(),'Member List')]"), "Policy Member List Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeTextField = new PageElement(By.name("pRiskCode"), "Member Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberNameTextField= new PageElement(By.name("pRiskName"), "Member Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		firstNameTextField= new PageElement(By.name("pFirstName"), "First Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LastNameTextField = new PageElement(By.name("pLastName"), "Last Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField = new PageElement(By.name("pDateOfBirth"), "Date Of Birth TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeSearchButton=new PageElement(By.name("Search"), "Save Claim Reserve Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInmtrestFindButton=new PageElement(By.xpath("//input[@name='pPolicyRiskCode']/following::a[@name='firstFocus']"), "Insured Intrest Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillClaimReserveBeforeIntimationDetails(ClaimEntity claimSearchCreateEntity, CustomAssert assertReference){
		if(claimSearchCreateEntity.getAction().equalsIgnoreCase("add")){

			if (claimSearchCreateEntity.getBooleanValueForField("ConfigIndemnityReserveTypeFunction")) {
				selectValueFromList(indemnityReserveTypeFunctionDropDown, claimSearchCreateEntity.getStringValueForField("IndemnityReserveTypeFunction"));
			}
			if (claimSearchCreateEntity.getBooleanValueForField("ConfigIndemnityReserveAmount")) {
				clearAndSendKeys(indemnityReserveAmountTextField, claimSearchCreateEntity.getStringValueForField("IndemnityReserveAmount"));
			}
			if (claimSearchCreateEntity.getBooleanValueForField("ConfigExpenseReserveTypeFunction")) {
				selectValueFromList(expenseReserveTypeFunctionDropDown, claimSearchCreateEntity.getStringValueForField("ExpenseReserveTypeFunction"));
			}
			if (claimSearchCreateEntity.getBooleanValueForField("ConfigExpenseReserveAmount")) {
				clearAndSendKeys(expenseReserveAmountTextField, claimSearchCreateEntity.getStringValueForField("ExpenseReserveAmount"));
			}
			if (claimSearchCreateEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				clearAndSendKeys(insuredInterestCodeTextField, claimSearchCreateEntity.getStringValueForField("InsuredInterestCode"));
			}
			if (claimSearchCreateEntity.getBooleanValueForField("ConfigReasonForInitiatingIhisaction")) {
				clearAndSendKeys(reasonForInitiatingIhisactionTextField, claimSearchCreateEntity.getStringValueForField("ReasonForInitiatingIhisaction"));
			}

			//pending to add Find button Code 

		}

	}


	public void submitReserveDetails(ClaimEntity claimSearchCreateEntity){
		if (claimSearchCreateEntity.getBooleanValueForField("ConfigSaveReserveButton")){		
			click(saveButton);
			switchToFrame("display");
			isElementDisplayed(pageTitleAfterCreateReserve);
		}

	}

	public void navigateToBackPage(ClaimEntity claimSearchCreateEntity){
		//change the config back to ConfigBackReservePage
		if (claimSearchCreateEntity.getBooleanValueForField("ConfigBackReservePage")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(pageTitleAfterCreateReserve);
		}

	}
	public void fillSubmitClaimReserveDetailsBeforeIntimate(ClaimEntity claimSearchCreateEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimSearchCreateEntity.getConfigExecute())){
			fillClaimReserveBeforeIntimationDetails(claimSearchCreateEntity, assertReference);
			submitReserveDetails(claimSearchCreateEntity);
			navigateToBackPage(claimSearchCreateEntity);

		}
	}
}
