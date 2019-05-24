package com.aqm.staf.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.openqa.grid.internal.SessionTerminationReason;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.EnvironmentParameter;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.TestManagerDBInterface;
import com.aqm.staf.framework.core.Uploader;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.ExecutionTestScenarios;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.framework.core.entity.ExecutionTestSuites;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.framework.core.entity.TestSuite;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.framework.core.exceptions.UndefinedKeywordException;
import com.aqm.staf.framework.core.hibernate.TestDataHibernateUtil;
import com.aqm.staf.framework.core.hibernate.TestManagerHibernateUtil;
import com.aqm.staf.library.PageKeyWord.AccountingKeyword;
import com.aqm.staf.library.PageKeyWord.ClaimKeyWord;
import com.aqm.staf.library.PageKeyWord.LocationKeyWord;
import com.aqm.staf.library.PageKeyWord.PartyKeyWord;
import com.aqm.staf.library.PageKeyWord.PolicyKeyWord;
import com.aqm.staf.library.PageKeyWord.SecurityKeyword;
import com.aqm.staf.library.databin.ChildRecordEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.LoginEntityReinsurance;
import com.aqm.staf.library.databin.LoginMasterEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctionsEntity;
import com.aqm.staf.library.pages.common.ApplicationHomePage;
import com.aqm.staf.library.pages.common.LogOut;
import com.aqm.staf.library.pages.common.LoginPage;
import com.aqm.staf.library.pages.common.LoginPageReinsurance;
import com.aqm.staf.library.pages.common.PartyDetailsCreateEditPage;
import com.aqm.staf.library.pages.common.PartyKeyWordReinsurance;
import com.aqm.staf.library.pages.common.PartySearchPage;
import com.aqm.staf.library.pages.common.Party_PartyRolesPartyFunctions;
import com.aqm.staf.library.pages.common.PolicyKeywordReinsurance;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class FunctionalKeywords extends BasePage {
	ATUTestRecorder recorder;	
	public static Properties prop;
	private InputStream input;
	private  String stepGroup;
	protected void executeStep(
			TestPlan testPlan, ExecutionMasterTestSuites executionMasterTestSuite, MasterTestSuite masterTestSuite, ExecutionTestSuites executionTestSuite, TestSuite testSuite,
			ExecutionTestScenarios executionTestScenario, TestScenario testScenario, ExecutionTestSteps executionTestStep, ScenarioTestData testData, 
			WebDriver driver, File scenarioExecutionFolderReference, CustomAssert assertReference, boolean allStepExecutionMode) throws Exception {
		String keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		String configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		int stepNumber= executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		FrameworkServices.logMessage("<B><u>StepNumber-</u>"+stepNumber+"<i><Font Color = /'#00008B/'> Executing :"+keyword+" </Font></i></B>");
		Properties configProperties = FrameworkServices.getConfigProperties();
		int skipStepsInExecution= Integer.parseInt(configProperties.getProperty("skipSteps"));
		if (stepNumber>=skipStepsInExecution || keyword.equalsIgnoreCase("LoginUser") ){
			//if(executionTestStep.getExecutionTestStepMasterAutomationScriptStepSkipStep().equalsIgnoreCase("no") || allStepExecutionMode){
			if (keyword.equalsIgnoreCase("LoginUser")) {

				List<LoginEntity> loginEntities = testData.getLoginEntity();
				LoginEntity login=loginEntities.get(0);
				LoginPage loginPage = new LoginPage(driver, "Login Page");
				loginPage.fillandSubmitLoginDetails(login, assertReference,testScenario);
				ApplicationHomePage homePage = new ApplicationHomePage(driver, "Application Home Page");
				homePage.verifyHomePage();

			}
			else if (keyword.equalsIgnoreCase("LoginReinsuranceUser") ) {

				List<LoginEntityReinsurance> ReinsuranceloginEntities = testData.getLoginReinsuranceRecordsEntity();
				LoginEntityReinsurance login=ReinsuranceloginEntities.get(0);
				LoginPageReinsurance loginPage = new LoginPageReinsurance(driver, "Login Page");
				loginPage.fillandSubmitLoginDetails(login, assertReference, testScenario);
				
			}
			
			
			else if(keyword.equalsIgnoreCase("CreatePartyReinsurance"))
			{
				PartyKeyWordReinsurance partyKeyWord=new PartyKeyWordReinsurance();
				partyKeyWord.createParty(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			else if(keyword.equalsIgnoreCase("createReinsurancePolicy"))
			{
				PolicyKeywordReinsurance policyKeywordReinsurance=new PolicyKeywordReinsurance();
				policyKeywordReinsurance.createReinsurancePolicy(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			else if(keyword.equalsIgnoreCase("VerifyReinsurancePolicy"))
			{
				PolicyKeywordReinsurance policyKeywordReinsurance=new PolicyKeywordReinsurance();
				policyKeywordReinsurance.VerifyReinsurancePolicy(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			/*else if (keyword.equalsIgnoreCase("Script1_Step1")) {
				System.out.println("Step001");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step2")) {
				System.out.println("Step002");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step3")) {
				System.out.println("Step003");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step4")) {
				System.out.println("Step004");
			}*/
			else if (keyword.equalsIgnoreCase("CreateParty")){
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.createParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyParty")){
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.verifyParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}		
			else if (keyword.equalsIgnoreCase("EditParty")){
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.editParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}
	
			// Policy Keyword
			else if (keyword.equalsIgnoreCase("CreatePolicy")) {
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.createPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			
			else if (keyword.equalsIgnoreCase("EditPolicy")){
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.editPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyPolicy")) {
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.verifyPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			
			else if (keyword.equalsIgnoreCase("CreateLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.createLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.editPartyLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.verifyPartyLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			//Claim Keyword
			else if (keyword.equalsIgnoreCase("CreateClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.createClaim(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.editClaim(testData, executionTestStep, assertReference, driver,stepGroup);
			
			}
			else if (keyword.equalsIgnoreCase("VerifyClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.verifyClaim(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			//@ akshata
			else if (keyword.equalsIgnoreCase("CreateAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.createAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.editAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.verifyAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			// Create RI Contract
			else if (keyword.equalsIgnoreCase("CreateRIContract")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.verifyAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("LogOutUser")) {
				LogOut logOut= new  LogOut(driver, pageName);
				logOut.navigateToLoginPage();
			}
			else if (keyword.equalsIgnoreCase("LoginUser2")) {
				List<LoginEntity> loginEntities = testData.getLoginEntity();
				LoginPage loginPage = new LoginPage(driver, "Login Page");
				LoginEntity login=loginEntities.get(1);
				driver.navigate().refresh();
				loginPage.fillandSubmitLoginDetails(login, assertReference,testScenario);
				ApplicationHomePage homePage = new ApplicationHomePage(driver, "Application Home Page");
				homePage.verifyHomePage();
			}
			else if (keyword.equalsIgnoreCase("SecurityPage")) {
				SecurityKeyword securityKeyword= new  SecurityKeyword();
				securityKeyword.createSuperuser(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else {
				throw new UndefinedKeywordException("Keyword : " + keyword + " undefined.");
			}	
		}
	}

	@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference", 
		"executionTestSuite_Reference",  "executionTestSuite_TestSuiteReference"})
	@BeforeSuite (groups = { "functional" })
	public void beforeTestSuiteExecutioner(String platform, String browserName, String browserVersion, String testPlan_Reference, String executionMasterTestSuite_Reference, 
			String executionMasterTestSuite_MasterTestSuiteReference, String executionTestSuite_Reference, String executionTestSuite_TestSuiteReference) throws Exception {
		exeRecordingStart();
		FrameworkServices frameworkService = new FrameworkServices();

		Date executionTestSuite_StartTime = frameworkService.getCurrentSystemTime();

		Session sessionTestManagerData = TestManagerHibernateUtil.getInstance().getNewSession();
		TestManagerDBInterface testManagerDBInterface = new TestManagerDBInterface(sessionTestManagerData);
		TestPlan testPlan = null;
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		MasterTestSuite masterTestSuite = null;
		ExecutionTestSuites executionTestSuite = null;
		TestSuite testSuite = null;

		try {
			testPlan = testManagerDBInterface.getTestPlanByReference(testPlan_Reference);

			executionMasterTestSuite = testManagerDBInterface.getExecutionMasterTestSuiteByReference(executionMasterTestSuite_Reference);
			masterTestSuite = testManagerDBInterface.getMasterTestSuiteByReference(executionMasterTestSuite_MasterTestSuiteReference);

			executionTestSuite = testManagerDBInterface.getExecutionTestSuiteByReference(executionTestSuite_Reference);
			testSuite = testManagerDBInterface.getTestSuiteByReference(executionTestSuite_TestSuiteReference);

			FrameworkServices.logMessage("<B><Font Color = 'White'><u>Test Suite Reference </u> :"+ testSuite.getTestSuiteReference() +" </Font></B>");

			executionTestSuite.setExecutionTestSuiteStartTime(executionTestSuite_StartTime);
			testManagerDBInterface.addUpdateExecutionTestSuite(executionTestSuite);
		} 
		catch (ScriptExecutionException exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		catch (Exception exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		finally {

		}
		TestManagerHibernateUtil.getInstance().closeSession(sessionTestManagerData);
	}

	@SuppressWarnings("null")
	@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference", 
		"executionTestSuite_Reference",  "executionTestSuite_TestSuiteReference"})
	@AfterSuite (groups = { "functional" })
	public void afterTestSuiteExecutioner(String platform, String browserName, String browserVersion, String testPlan_Reference, String executionMasterTestSuite_Reference, 
			String executionMasterTestSuite_MasterTestSuiteReference, String executionTestSuite_Reference, String executionTestSuite_TestSuiteReference) throws Exception {
		exeRecordingStop();
		FrameworkServices frameworkService = new FrameworkServices();
		Date executionTestSuite_EndTime = frameworkService.getCurrentSystemTime();
		int executionTestSuite_ExecutionStatus = 0;

		Session sessionTestManagerData = TestManagerHibernateUtil.getInstance().getNewSession();
		TestManagerDBInterface testManagerDBInterface = new TestManagerDBInterface(sessionTestManagerData);

		TestPlan testPlan = null;
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		MasterTestSuite masterTestSuite = null;
		ExecutionTestSuites executionTestSuite = null;
		TestSuite testSuite = null;

		try {
			testPlan = testManagerDBInterface.getTestPlanByReference(testPlan_Reference);

			executionMasterTestSuite = testManagerDBInterface.getExecutionMasterTestSuiteByReference(executionMasterTestSuite_Reference);
			masterTestSuite = testManagerDBInterface.getMasterTestSuiteByReference(executionMasterTestSuite_MasterTestSuiteReference);

			executionTestSuite = testManagerDBInterface.getExecutionTestSuiteByReference(executionTestSuite_Reference);
			testSuite = testManagerDBInterface.getTestSuiteByReference(executionTestSuite_TestSuiteReference);

			FrameworkServices.logMessage("<B><Font Color = 'White'><u>Ending Test Suite Reference </u> :"+ testSuite.getTestSuiteReference() +" </Font></B>");

			List<ExecutionTestScenarios> executionTestScenarios = testManagerDBInterface.getAllExecutionTestScenariosByExecutionTestSuiteReference(executionTestSuite.getExecutionTestSuiteReference());

			for (ExecutionTestScenarios executionTestScenario : executionTestScenarios) {
				int executionTestScenario_ExecutionStatus = executionTestScenario.getExecutionTestScenarioExecutionStatus();

				// 0 - Not Executed
				// 1 - Passed
				// 2 - Passed With Warnings
				// 3 - Failed with Errors

				if (executionTestScenario_ExecutionStatus == 1) {
					if (executionTestSuite_ExecutionStatus == 1 || executionTestSuite_ExecutionStatus == 0) {
						executionTestSuite_ExecutionStatus = 1; 
					}
					else if (executionTestSuite_ExecutionStatus == 2) {
						executionTestSuite_ExecutionStatus = 2; 
					}
				}
				else if (executionTestScenario_ExecutionStatus == 2) {
					if (executionTestSuite_ExecutionStatus == 1 || executionTestSuite_ExecutionStatus == 0) {
						executionTestSuite_ExecutionStatus = 2; 
					}
					else if (executionTestSuite_ExecutionStatus == 2) {
						executionTestSuite_ExecutionStatus = 2; 
					}
				}
				else if (executionTestScenario_ExecutionStatus == 4) {
					executionTestSuite_ExecutionStatus = 4;

				}	else if (executionTestScenario_ExecutionStatus == 3) {
					executionTestSuite_ExecutionStatus = 3;
					break;
				}
			}

			executionTestSuite.setExecutionTestSuiteEndTime(executionTestSuite_EndTime);
			executionTestSuite.setExecutionTestSuiteExecutionStatus(executionTestSuite_ExecutionStatus);

			testManagerDBInterface.addUpdateExecutionTestSuite(executionTestSuite);
		}catch (ScriptExecutionException exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		catch (Exception exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		finally {
		}

		TestManagerHibernateUtil.getInstance().closeSession(sessionTestManagerData);
	}

	/*@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference"})
	@BeforeGroups (groups = { "functional" })
	public void beforeMasterTestSuiteExecutioner(String platform, String browserName, String browserVersion, String testPlan_Reference, 
			String executionMasterTestSuite_Reference, String executionMasterTestSuite_MasterTestSuiteReference) throws Exception {

		FrameworkServices frameworkService = new FrameworkServices();

		Date executionMasterTestSuite_StartTime = frameworkService.getCurrentSystemTime();

		Session sessionTestManagerData = TestManagerHibernateUtil.getInstance().getNewSession();
		TestManagerDBInterface testManagerDBInterface = new TestManagerDBInterface(sessionTestManagerData);

		TestPlan testPlan = null;
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		MasterTestSuite masterTestSuite = null;

		try {
			testPlan = testManagerDBInterface.getTestPlanByReference(testPlan_Reference);

			executionMasterTestSuite = testManagerDBInterface.getExecutionMasterTestSuiteByReference(executionMasterTestSuite_Reference);
			masterTestSuite = testManagerDBInterface.getMasterTestSuiteByReference(executionMasterTestSuite_MasterTestSuiteReference);

			FrameworkServices.logMessage("<B><Font Color = 'White'><u>Master Test Suite Reference </u> :"+ masterTestSuite.getMasterTestSuiteReference() +" </Font></B>");

			executionMasterTestSuite.setExecutionMasterTestSuiteStartTime(executionMasterTestSuite_StartTime);
			testManagerDBInterface.addUpdateExecutionMasterTestSuite(executionMasterTestSuite); ;
		} 
		catch (ScriptExecutionException exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		catch (Exception exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		finally {

		}
		TestManagerHibernateUtil.getInstance().closeSession(sessionTestManagerData);
	}

	@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference"})
	@AfterGroups (groups = { "functional" })
	public void afterMasterTestSuiteExecutioner(String platform, String browserName, String browserVersion, String testPlan_Reference, 
			String executionMasterTestSuite_Reference, String executionMasterTestSuite_MasterTestSuiteReference) throws Exception {
		FrameworkServices frameworkService = new FrameworkServices();

		Date executionMasterTestSuite_EndTime = frameworkService.getCurrentSystemTime();
		int executionMasterTestSuite_ExecutionStatus = 0;

		Session sessionTestManagerData = TestManagerHibernateUtil.getInstance().getNewSession();
		TestManagerDBInterface testManagerDBInterface = new TestManagerDBInterface(sessionTestManagerData);

		TestPlan testPlan = null;
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		MasterTestSuite masterTestSuite = null;

		try {
			testPlan = testManagerDBInterface.getTestPlanByReference(testPlan_Reference);

			executionMasterTestSuite = testManagerDBInterface.getExecutionMasterTestSuiteByReference(executionMasterTestSuite_Reference);
			masterTestSuite = testManagerDBInterface.getMasterTestSuiteByReference(executionMasterTestSuite_MasterTestSuiteReference);

			FrameworkServices.logMessage("<B><Font Color = 'White'><u>Ending Master Test Suite Reference </u> :"+ masterTestSuite.getMasterTestSuiteReference() +" </Font></B>");

			List<ExecutionTestSuites> executionTestSuites = testManagerDBInterface.getAllExecutionTestSuiteByExecutionMasterTestSuiteReference(executionMasterTestSuite.getExecutionMasterTestSuiteReference());

			for (ExecutionTestSuites executionTestSuite : executionTestSuites) {
				int executionTestSuite_ExecutionStatus = executionTestSuite.getExecutionTestSuiteExecutionStatus();

				// 0 - Not Executed
				// 1 - Passed
				// 2 - Passed With Warnings
				// 3 - Failed with Errors

				if (executionTestSuite_ExecutionStatus == 1) {
					if (executionMasterTestSuite_ExecutionStatus == 1 || executionMasterTestSuite_ExecutionStatus == 0) {
						executionMasterTestSuite_ExecutionStatus = 1; 
					}
					else if (executionMasterTestSuite_ExecutionStatus == 2) {
						executionMasterTestSuite_ExecutionStatus = 2; 
					}
				}
				else if (executionTestSuite_ExecutionStatus == 2) {
					if (executionMasterTestSuite_ExecutionStatus == 1 || executionMasterTestSuite_ExecutionStatus == 0) {
						executionMasterTestSuite_ExecutionStatus = 2; 
					}
					else if (executionMasterTestSuite_ExecutionStatus == 2) {
						executionMasterTestSuite_ExecutionStatus = 2; 
					}
				}
				else if (executionTestSuite_ExecutionStatus == 3) {
					executionMasterTestSuite_ExecutionStatus = 3;
					break;
				}
			}

			executionMasterTestSuite.setExecutionMasterTestSuiteEndTime(executionMasterTestSuite_EndTime);
			executionMasterTestSuite.setExecutionMasterTestSuiteExecutionStatus(executionMasterTestSuite_ExecutionStatus);

			testManagerDBInterface.addUpdateExecutionMasterTestSuite(executionMasterTestSuite);
		} 
		catch (ScriptExecutionException exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		catch (Exception exception) {
			//frameworkService.handleException(driver, exception, logger);
			throw exception;
		} 
		finally {
		}

		TestManagerHibernateUtil.getInstance().closeSession(sessionTestManagerData);
	}*/
	@SuppressWarnings("unused")
	private void loadProperties() throws IOException {
		prop = new Properties();
		input = new FileInputStream("config.properties");
		prop.load(input);
	}


	public void exeRecordingStart() throws ATUTestRecorderException, IOException{
		String path= Uploader.currentExecutionRecordingReference.toString();
		loadProperties();
		if(prop.getProperty("recordExecutionVideo").equalsIgnoreCase("Yes")){
			DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
			Date date = new Date();
			recorder = new ATUTestRecorder(path,"ExecutionRecording_"+dateFormat.format(date),false);
			recorder.start();  
			System.out.println("Scenario Execution Recording Started");
		}

	}

	public void exeRecordingStop() throws ATUTestRecorderException{
		if(prop.getProperty("recordExecutionVideo").equalsIgnoreCase("Yes")){
			recorder.stop();
			System.out.println("Scenario Execution Recording Completed");
		}

	}

}
