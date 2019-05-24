package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
import com.aqm.staf.library.databin.LoginEntityReinsurance;

public class LoginPageReinsurance extends BasePage 
{
	private PageElement userIDTextField;
	private PageElement passwordTextField;
	private PageElement roleTextField;
	private PageElement loginButton;
	private PageElement reinsuranceTitle;
	private PageElement loginPageTitle;
	private PageElement afterLoginPageTitle;
	private PageElement invalidateExistingSession;
	private PageElement logoutButton;
	private PageElement partyTab;
	WebDriverWrapper webDriverWrapper;
	WebDriverWrapper wdw = new WebDriverWrapper(driver);
	String configUsers;
	String currentTestscenario;


	public LoginPageReinsurance(WebDriver driver,String pageName)
	{ 
		super(driver, pageName);


		userIDTextField = new PageElement(By.name("form_login_userid"), "User Id  TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passwordTextField = new PageElement(By.name("form_login_password"), "Password TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleTextField = new PageElement(By.name("txtRoleCode"), "User Role TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loginButton = new PageElement(By.id("submit1"), "Submit Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loginPageTitle=new PageElement(By.xpath(""), "Login Page title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		afterLoginPageTitle=new PageElement(By.xpath(""), "After Login Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		logoutButton=new PageElement(By.xpath(""), "Logout Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reinsuranceTitle= new PageElement(By.xpath("//td//font/b[contains(text(),'Reinsurance Accounting And Management System')]"), "User Id  TextFieldField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invalidateExistingSession=new PageElement(By.name("Invalidate"),"invalidate Existing Session", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyTab=new PageElement(By.xpath("//tr/td[@id='pParty']/a[1]"),"Party Tab",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		

	}




	public synchronized void fillLoginReinsuranceDetails(LoginEntityReinsurance login, CustomAssert assertReference,TestScenario testScenario) throws InterruptedException {


		if (login.getAction().equalsIgnoreCase("add") || login.getAction().equalsIgnoreCase("edit")) {

			if (login.getBooleanValueForField("ConfigUsername")) {
				clearAndSendKeys(userIDTextField,login.getStringValueForField("Username"));

				/*else{
					String user=LoginUserFromSyncMap.userIDForLogin(MapOfUserIDAssignedToAllocation.listOfUserIDForExecution,testScenario.getTestScenarioReference());
					System.out.println("");
					System.out.println("Below details are from login Page::");
					System.out.println(user+" USER ID sent for login.");
					System.out.println("At the time of login using USER ID: "+user+" Updated MAP shows as below:");
					System.out.println("Status wise MAP::"+MapOfUserIDAssignedToAllocation.listOfUserIDForExecution.toString());
					//if (!user.isEmpty()){

					clearAndSendKeys(userIDTextField,user);

					currentTestscenario=testScenario.getTestScenarioReference();

				}*/
			}

			if (login.getBooleanValueForField("ConfigPassword")) {
				clearAndSendKeys(passwordTextField, login.getStringValueForField("Password"));
			}

			if (login.getBooleanValueForField("ConfigUserRole")) {
				String userRole = login.getStringValueForField("UserRole").toUpperCase();
				clearAndSendKeys(roleTextField,userRole );
			}



			else if (login.getAction().equalsIgnoreCase("verify")){
				if (login.getBooleanValueForField("ConfigUsername")) {
					assertReference.assertEquals(getText(userIDTextField), login.getStringValueForField("Username"), AssertionType.WARNING);
				}

				if (login.getBooleanValueForField("ConfigPassword")) {
					assertReference.assertEquals(getText(passwordTextField), login.getStringValueForField("Password"), AssertionType.WARNING);
				}
				if (login.getBooleanValueForField("ConfigUserRole")) {
					assertReference.assertEquals(getText(roleTextField), login.getStringValueForField("UserRole"), AssertionType.WARNING);
				}
			}


		}
	}

	@SuppressWarnings("static-access")
	public void submitLoginDetails(LoginEntityReinsurance login) throws InterruptedException {
		if (login.getBooleanValueForField("ConfigloginButton")){
			click(loginButton);
			if(wdw.isAlertPresent()){
				wdw.acceptAlert(2);
				for(int i=0;i<=10;i++){
					configUsers=LoginUserFromSyncMap.userIDForLogin(MapOfUserIDAssignedToAllocation.listOfUserIDForExecution,currentTestscenario);
					if(!configUsers.isEmpty()){
						clearAndSendKeys(userIDTextField,configUsers);
						click(loginButton);
						break;
					}
					//	wdw.explicitWait(3);
				}

			}
			webDriverWrapper.explicitWait(5);
			//switchToFrame("display");
			if(isWebElementDisplayed(invalidateExistingSession))
			{
				click(invalidateExistingSession);
			}
			else
			{
				//isElementDisplayed(afterLoginPageTitle);
			}


		}

	}
	
	public void navigateToParty(LoginEntityReinsurance loginEntityReinsurance ) {
		switchToFrame("mainFrame");
		click(partyTab);
	}
	public void fillandSubmitLoginDetails(LoginEntityReinsurance login,
			CustomAssert assertReference, TestScenario testScenario)throws Exception {
		if(isConfigTrue(login.getConfigExecute())){
			//switchToFrame("display");
			fillLoginReinsuranceDetails(login, assertReference,testScenario);
			submitLoginDetails(login);
			navigateToParty(login);
		}
	}



}
