package com.aqm.tests;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.TestManagerDBInterface;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.ExecutionTestSuites;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.framework.core.hibernate.TestManagerHibernateUtil;

public class MasterTestSuiteAfterSuite {
	@Parameters({ 
		"platform", "browsername", "browserversion", 
		"testPlan_Reference", 
		"executionMasterTestSuite_Reference", "executionMasterTestSuite_MasterTestSuiteReference"})
	@AfterSuite (groups = { "functional" })
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
	}
}
