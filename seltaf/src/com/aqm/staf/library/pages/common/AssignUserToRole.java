package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.SecurityPartyEntity;

public class AssignUserToRole extends BasePage{
	private PageElement userSearchTitle;
	private PageElement maintainRoleLink;
	private PageElement maintainUserLink;
	private PageElement auditTrailLink;
	private PageElement maintainDataLink;
	private PageElement newOfficeCreationLink;
	private PageElement assignUserToRoleTitle;
	private PageElement helpLink;
	private PageElement userCodeTextField;
	private PageElement roleCodeTextField;
	private PageElement roleNameTextField;
	private PageElement roleCodeFindButton;
	private PageElement StartDateFindButton;
	private PageElement startDateTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement newButton;
	public AssignUserToRole(WebDriver driver, String pageName) {
		super(driver, pageName);
		userSearchTitle = new PageElement(By.xpath("//div//b[contains(text(),'User Search')]"), "User Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assignUserToRoleTitle = new PageElement(By.xpath("//div//b[contains(text(),'Assign User To Role')]"), "Assign User To Role Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainRoleLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Role')]"), "Maintain Role Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainUserLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain User')]"), "Maintain User Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		auditTrailLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Audit Trail')]"), "Audit Trail Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainDataLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Data')]"), "Maintain Data Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newOfficeCreationLink = new PageElement(By.xpath("//td//a//b[contains(text(),'New Office Creation')]"), "New Office Creation Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		helpLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Help')]"), "Help Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//userCodeTextField=new PageElement(By.name("pUserCode"), "User Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		userCodeTextField = new PageElement(By.xpath("//tr//td//b[contains(text(),'User Code')]/following::input[1]"), "User Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Role Code')]/following::input/following::a/img[@src='../images/find_over.gif']"), "Role code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		StartDateFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Role Window code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		roleCodeTextField = new PageElement(By.name("pRoleCode"), "Role Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleNameTextField = new PageElement(By.name("pRoleName"), "Role Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		startDateTextField = new PageElement(By.name("pEffectiveStartDate"), "Start Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("Save"), " Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}

	public void fillAssignUserToRoleDetails(SecurityPartyEntity securityPartyEntity, CustomAssert assertReference) throws InterruptedException{
		if(securityPartyEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(securityPartyEntity.getAction().equalsIgnoreCase("add") || securityPartyEntity.getAction().equalsIgnoreCase("edit")){
				if (securityPartyEntity.getBooleanValueForField("ConfigUserCode")) {
					clearAndSendKeys(userCodeTextField, securityPartyEntity.getStringValueForField("UserCode"));
				}
				if (securityPartyEntity.getBooleanValueForField("ConfigRoleCode")) {
					fillRoleCode(securityPartyEntity);
				}
				if (securityPartyEntity.getBooleanValueForField("ConfigStartDate")) {
					String startDate=RandomCodeGenerator.dateGenerator(securityPartyEntity.getStringValueForField("StartDate"));
					clearAndEnterDate(startDateTextField, startDate);
				}

			}
			else if(securityPartyEntity.getAction().equalsIgnoreCase("verify")){
				SecurityPartyEntity actualSecurityPartyEntity=new SecurityPartyEntity();
				if (securityPartyEntity.getBooleanValueForField("ConfigUserCode")) {
					actualSecurityPartyEntity.setStringValueForField("UserCode", fetchValueFromList(userCodeTextField));
					assertReference.assertEquals(securityPartyEntity.getStringValueForField("UserCode"), actualSecurityPartyEntity.getStringValueForField("UserCode"), AssertionType.WARNING);
				}
				if (securityPartyEntity.getBooleanValueForField("ConfigRoleCode")) {
					actualSecurityPartyEntity.setStringValueForField("RoleCode", fetchValueFromList(roleCodeTextField));
					assertReference.assertEquals(securityPartyEntity.getStringValueForField("RoleCode"), actualSecurityPartyEntity.getStringValueForField("RoleCode"), AssertionType.WARNING);
				}
				if (securityPartyEntity.getBooleanValueForField("ConfigStartDate")) {
					actualSecurityPartyEntity.setStringValueForField("StartDate", fetchValueFromTextFields(startDateTextField));
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(securityPartyEntity.getStringValueForField("StartDate")), actualSecurityPartyEntity.getStringValueForField("StartDate"), AssertionType.WARNING);
				}
			}
		}
	}
	public void submitRoleDetails(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backRoleDetails(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigbackButton")) {
			click(backButton);
		}
	}

	private void fillRoleCode(SecurityPartyEntity securityPartyEntity) throws InterruptedException {
		clickOnRoleCodeFindButton(securityPartyEntity);

		if(securityPartyEntity.getBooleanValueForField("ConfigRoleCode")){
			clearAndSendKeys(roleCodeTextField,securityPartyEntity.getStringValueForField("RoleCode") );	
		}
		if(securityPartyEntity.getBooleanValueForField("ConfigRoleName")){
			clearAndSendKeys(roleNameTextField, "RoleName");
		}
		/*click(StartDateFindButton);
		selectRoleCode(securityPartyEntity);*/
	}

	private void selectRoleCode(SecurityPartyEntity securityPartyEntity) throws InterruptedException {
		PageElement rolecodeToBeSelectedLink = new PageElement(By.xpath("//a[contains(text(),'"+securityPartyEntity.getStringValueForField("RoleCode")+"')]"),"Role Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(rolecodeToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}

	private void clickOnRoleCodeFindButton(SecurityPartyEntity securityPartyEntity) throws InterruptedException {
		if (securityPartyEntity.getBooleanValueForField("ConfigRoleCodeFindButton")){
			click(roleCodeFindButton);
			switchToWindow("Role List");
			return;
		}
	}
	public void navigateToUserSearchPage(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfignavigateToSecurityPage"))
		{
		navigateToSecurityPage();
		switchToFrame("display");
		if(isElementDisplayed(userSearchTitle));
		return;
	}
	}

	
	
	
	public void navigateToMaintainRoleLink(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigMaintainRoleLink")){
			click(maintainRoleLink);
			switchToFrame("display");
			
			if(isElementDisplayed(assignUserToRoleTitle));
			return;
		}
	}
	public void navigateToMaintainUserLink(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigMaintainUserLink")){
			switchToFrame("Control");
			click(maintainUserLink);
			switchToFrame("display");
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(assignUserToRoleTitle));
			return;
		}
	}
	public void navigateMaintainDataLink(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigMaintainDataLink")){
			click(maintainDataLink);
			switchToFrame("display");
			//if(isElementDisplayed(auditTrailTitle));
			return;
		}
	}
	public void navigateNewOfficeCreationLink(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigNewOfficeCreationLink")){

			click(newOfficeCreationLink);
			switchToFrame("display");
			//if(isElementDisplayed(auditTrailTitle));
			return;
		}
	}
	public void navigateHelpLink(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigHelpLink")){

			click(helpLink);
			switchToFrame("display");
			//if(isElementDisplayed(auditTrailTitle));
			return;
		}
	}
	public void fillandSubmitAssignUserToRoleDetails(SecurityPartyEntity securityPartyEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillAssignUserToRoleDetails(securityPartyEntity, assertReference);
		submitRoleDetails(securityPartyEntity);
		backRoleDetails(securityPartyEntity);
		navigateToUserSearchPage(securityPartyEntity);
		navigateToMaintainRoleLink(securityPartyEntity);
		navigateToMaintainUserLink(securityPartyEntity);
		navigateMaintainDataLink(securityPartyEntity);
		navigateNewOfficeCreationLink(securityPartyEntity);
		navigateHelpLink(securityPartyEntity);
	}
}
