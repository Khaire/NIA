package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.TestLauncher;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.LoginUserFromSyncMap;
import com.aqm.staf.framework.core.MapOfUserIDAssignedToAllocation;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.Uploader;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebDriverWrapper;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.library.databin.LoginEntity;

public class LoginPage extends BasePage {
	private PageElement newUserIDTextField;
	private PageElement newPasswordTextField;
	private PageElement newLoginButton;
	
	private PageElement userIDTextField;
	private PageElement passwordTextField;
	private PageElement branchTextField;
	private PageElement roleTextField;
	private PageElement submitButton;
	private PageElement clearButton;
	private PageElement loginPageTitle;
	private PageElement afterLoginPageTitle;
	private PageElement logoutButton;
	private PageElement yesButton;
	private PageElement cwissTitle;
	WebDriverWrapper webDriverWrapper;
	WebDriverWrapper wdw = new WebDriverWrapper(driver);
	String configUsers;
	String currentTestscenario;
	public LoginPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		newUserIDTextField = new PageElement(By.name("username"), "User Id  TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newPasswordTextField = new PageElement(By.name("password"), "Password TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newLoginButton = new PageElement(By.name("login_Submit_Button"), "Branch Location TextFieldField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
		userIDTextField = new PageElement(By.name("pUserName"), "User Id  TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passwordTextField = new PageElement(By.name("pPassword"), "Password TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		branchTextField = new PageElement(By.name("pSelectBranch"), "Branch Location TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleTextField = new PageElement(By.name("pRole"), "User Role TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		submitButton = new PageElement(By.name("Submit"), "Submit Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clearButton = new PageElement(By.name("pReset"), "Reset Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loginPageTitle=new PageElement(By.xpath("//td//b[contains(text(),'CWISS - CORE INSURANCE - LOGOUT')]"), "Login Page title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		afterLoginPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Assigned Tasks')]"), "After Login Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		logoutButton=new PageElement(By.xpath("//a//b[contains(text(),'Logout')]"), "Logout Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//

		yesButton = new PageElement(By.name("Yes"), "Yes Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cwissTitle=new PageElement(By.xpath("//td//font/b[contains(text(),'CWISS - CORE INSURANCE')]"), " Cwiss Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public synchronized void fillLoginDetails(LoginEntity login, CustomAssert assertReference,TestScenario testScenario) throws InterruptedException {


		if (login.getAction().equalsIgnoreCase("add") || login.getAction().equalsIgnoreCase("edit")) {
			
			if (login.getBooleanValueForField("ConfigNewUserId")) {
				clearAndSendKeys(newUserIDTextField, login.getStringValueForField("NewUserId"));
			}
			if (login.getBooleanValueForField("ConfigNewPassword")) {
				clearAndSendKeys(newPasswordTextField, login.getStringValueForField("NewPassword"));
			}
			if (login.getBooleanValueForField("ConfigNewLogin")) {
				click(newLoginButton);
			}
			Thread.sleep(5000);
			switchToFrame("display");

			if (login.getBooleanValueForField("ConfigUsername")) {

				if (Uploader.prop.getProperty("LoginUsers").isEmpty()){
					clearAndSendKeys(userIDTextField,login.getStringValueForField("Username"));

				}else{
					String user=LoginUserFromSyncMap.userIDForLogin(MapOfUserIDAssignedToAllocation.listOfUserIDForExecution,testScenario.getTestScenarioReference());
					System.out.println("");
					System.out.println("Below details are from login Page::");
					System.out.println(user+" USER ID sent for login.");
					System.out.println("At the time of login using USER ID: "+user+" Updated MAP shows as below:");
					System.out.println("Status wise MAP::"+MapOfUserIDAssignedToAllocation.listOfUserIDForExecution.toString());
					//if (!user.isEmpty()){

					clearAndSendKeys(userIDTextField,user);

					currentTestscenario=testScenario.getTestScenarioReference();
					//}else{
					//clearAndSendKeys(userIDTextField,login.getStringValueForField("Username"));
					//}

				}
			}

			if (login.getBooleanValueForField("ConfigPassword")) {
				clearAndSendKeys(passwordTextField, login.getStringValueForField("Password"));
			}

			if (login.getBooleanValueForField("ConfigBranch")) {
				clearAndSendKeys(branchTextField, login.getStringValueForField("Branch"));
			}

			if (login.getBooleanValueForField("ConfigUserRole")) {
				String userRole = login.getStringValueForField("UserRole").toUpperCase();
				clearAndSendKeys(roleTextField,userRole );
			}

			//if (popup should be prompted and has not appeared ) {
			//	assertReference.assertEquals(popupIsVisible(), trueORFalse, AssertionType.ERROR);
			//}
		}
		else if (login.getAction().equalsIgnoreCase("verify")){
			if (login.getBooleanValueForField("ConfigUsername")) {
				assertReference.assertEquals(getText(userIDTextField), login.getStringValueForField("Username"), AssertionType.WARNING);
			}

			if (login.getBooleanValueForField("ConfigPassword")) {
				assertReference.assertEquals(getText(passwordTextField), login.getStringValueForField("Password"), AssertionType.WARNING);
			}

			if (login.getBooleanValueForField("ConfigBranch")) {
				assertReference.assertEquals(getText(branchTextField), login.getStringValueForField("Branch"), AssertionType.WARNING);
			}

			if (login.getBooleanValueForField("ConfigUserRole")) {
				assertReference.assertEquals(getText(roleTextField), login.getStringValueForField("UserRole"), AssertionType.WARNING);
			}
		}
	}

	public void submitLoginDetails(LoginEntity login) throws InterruptedException {
		if (login.getBooleanValueForField("ConfigSubmit")){
			click(submitButton);
			if(wdw.isAlertPresent()){
				wdw.acceptAlert(2);
				for(int i=0;i<=10;i++){
					configUsers=LoginUserFromSyncMap.userIDForLogin(MapOfUserIDAssignedToAllocation.listOfUserIDForExecution,currentTestscenario);
					if(!configUsers.isEmpty()){
						clearAndSendKeys(userIDTextField,configUsers);
						click(submitButton);
						break;
					}
					wdw.explicitWait(3);
				}

			}
			webDriverWrapper.explicitWait(5);
			switchToFrame("display");
			if(isWebElementDisplayed(yesButton))
			{
				click(yesButton);
			}
			else
			{
				isElementDisplayed(afterLoginPageTitle);
			}

		}
	}

	public void resetLoginDetails() {
		//click(btnReset);
	}

	public void fillandSubmitLoginDetails(LoginEntity login,
			CustomAssert assertReference, TestScenario testScenario)throws Exception {
		if(isConfigTrue(login.getConfigExecute())){
			//switchToFrame("display");
			fillLoginDetails(login, assertReference,testScenario);
			submitLoginDetails(login);
		}
	}

	/*	public void createEditVerifyLoginUser(LoginEntity login, CustomAssert assertReference){
		fillLoginDetails(login, assertReference);
		submitLoginDetails(login);
	}*/
	/*	public void fillandResetLoginDetails(LoginEntity login,  CustomAssert assertReference) {
		fillLoginDetails(login, assertReference);
		resetLoginDetails();
	}*/

	public void logOut(){
		//TODO Handle multiple windows if open 
		//TODO handle if multiple windows open for logout

		isAlertPresent();
		switchToMainPage();
		switchToFrame("head");
		click(logoutButton);
	}

} 
