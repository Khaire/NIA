package com.aqm.tests;

import java.util.Date;

import org.hibernate.Session;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.TestManagerDBInterface;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.framework.core.hibernate.TestManagerHibernateUtil;

public class MasterTestSuiteBeforeSuite {
	@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference"})
	@BeforeSuite (groups = { "functional" })
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
}
