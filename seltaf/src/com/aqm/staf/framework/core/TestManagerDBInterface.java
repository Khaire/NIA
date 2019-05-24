package com.aqm.staf.framework.core;

import java.util.Date;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.aqm.staf.framework.core.entity.Application;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.ExecutionTestScenarios;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.framework.core.entity.ExecutionTestSuites;
import com.aqm.staf.framework.core.entity.MasterAutomationScript;
import com.aqm.staf.framework.core.entity.MasterAutomationScriptStep;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.Module;
import com.aqm.staf.framework.core.entity.Project;
import com.aqm.staf.framework.core.entity.RuntimeConfigParameter;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.framework.core.entity.TestSuite;
import com.aqm.staf.framework.core.hibernate.TestManagerHibernateUtil;

public class TestManagerDBInterface {
	private Session sessionTestManager;

	public TestManagerDBInterface (Session sessionTestManager) {
		this.sessionTestManager = sessionTestManager;
	}

	public void addUpdateProject (Project p) {
		Transaction t = sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Project.class);
			criteria.add(Restrictions.eq("prj_Reference", p.getProjectReference()));
			criteria.add(Restrictions.eq("prj_Deleted", false));

			Date projectDateCreated = new Date (System.currentTimeMillis());
			Date projectDateUpdated = (Date) projectDateCreated.clone();
			
			Project recordExist = (Project) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getProjectReference().equalsIgnoreCase(p.getProjectReference())) {
				recordExist.setProjectDescription(p.getProjectDescription());
				recordExist.setProjectSerialNumber(p.getProjectSerialNumber());
				//recordExist.setProjectDateCreated(p.getProjectDateCreated());
				recordExist.setProjectDateUpdated(projectDateUpdated);
				recordExist.setProjectDeleted(p.isProjectDeleted());
				sessionTestManager.update(recordExist);
			}
			else {
				p.setProjectDateCreated(projectDateCreated);
				p.setProjectDateUpdated(projectDateUpdated);
				sessionTestManager.persist(p);
			}
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public Project getProjectByReference (String projectReferenceFilter) {
		Project project = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Project.class);
			criteria.add(Restrictions.eq("prj_Reference", projectReferenceFilter));
			criteria.add(Restrictions.eq("prj_Deleted", false));

			project = (Project) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return project;
	}

	public void addUpdateApplication (Application app) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Application.class);
			criteria.add(Restrictions.eq("app_Reference", app.getApplicationReference()));
			criteria.add(Restrictions.eq("app_Deleted", false));

			Date applicationDateCreated = new Date (System.currentTimeMillis());
			Date applicationDateUpdated = (Date) applicationDateCreated.clone();
			
			Application recordExist = (Application) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getApplicationReference().equalsIgnoreCase(app.getApplicationReference())) {
				recordExist.setApplicationDescription(app.getApplicationDescription());
				recordExist.setApplicationProjectID(app.getApplicationProjectID());
				recordExist.setApplicationProjectReference(app.getApplicationProjectReference());
				recordExist.setApplicationSerialNumber(app.getApplicationSerialNumber());
				//recordExist.setApplicationDateCreated(app.getApplicationDateCreated());
				recordExist.setApplicationDateUpdated(applicationDateUpdated);
				recordExist.setApplicationDeleted(app.isApplicationDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				app.setApplicationDateCreated(applicationDateCreated);
				app.setApplicationDateUpdated(applicationDateUpdated);
				sessionTestManager.persist(app);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public Application getApplicationByReference (String applicationReferenceFilter) {
		Application application = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Application.class);
			criteria.add(Restrictions.eq("app_Reference", applicationReferenceFilter));
			criteria.add(Restrictions.eq("app_Deleted", false));

			application = (Application) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return application;
	}

	public void addUpdateModule (Module mod) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Module.class);
			criteria.add(Restrictions.eq("mod_Reference", mod.getModuleReference()));
			criteria.add(Restrictions.eq("mod_Deleted", false));

			Date moduleDateCreated = new Date (System.currentTimeMillis());
			Date moduleDateUpdated = (Date) moduleDateCreated.clone();
			
			Module recordExist = (Module) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getModuleReference().equalsIgnoreCase(mod.getModuleReference())) {
				recordExist.setModuleDescription(mod.getModuleDescription());
				recordExist.setModuleSerialNumber(mod.getModuleSerialNumber());
				recordExist.setModuleProjectID(mod.getModuleProjectID());
				recordExist.setModuleProjectReference(mod.getModuleProjectReference());
				recordExist.setModuleApplicationID(mod.getModuleApplicationID());
				recordExist.setModuleApplicationReference(mod.getModuleApplicationReference());
				//recordExist.setModuleDateCreated(mod.getModuleDateCreated());
				recordExist.setModuleDateUpdated(moduleDateUpdated);
				recordExist.setModuleDeleted(mod.isModuleDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				mod.setModuleDateCreated(moduleDateCreated);
				mod.setModuleDateUpdated(moduleDateUpdated);
				sessionTestManager.persist(mod);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public Module getModuleByReference (String moduleReferenceFilter) {
		Module module = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Module.class);
			criteria.add(Restrictions.eq("mod_Reference", moduleReferenceFilter));
			criteria.add(Restrictions.eq("mod_Deleted", false));

			module = (Module) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return module;
	}

	public void addUpdateMasterAutomationScript (MasterAutomationScript mas) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterAutomationScript.class);
			criteria.add(Restrictions.eq("masterAutomationScript_Reference", mas.getMasterAutomationScriptReference()));
			criteria.add(Restrictions.eq("masterAutomationScript_Deleted", false));

			Date masterAutomationScriptDateCreated = new Date (System.currentTimeMillis());
			Date masterAutomationScriptDateUpdated = (Date) masterAutomationScriptDateCreated.clone();
			
			MasterAutomationScript recordExist = (MasterAutomationScript) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getMasterAutomationScriptReference().equalsIgnoreCase(mas.getMasterAutomationScriptReference())) {
				recordExist.setMasterAutomationScriptDescription(mas.getMasterAutomationScriptDescription());
				recordExist.setMasterAutomationScriptSerialNumber(mas.getMasterAutomationScriptSerialNumber());
				//recordExist.setMasterAutomationScriptDateCreated(mas.getMasterAutomationScriptDateCreated());
				recordExist.setMasterAutomationScriptDateUpdated(masterAutomationScriptDateUpdated);
				recordExist.setMasterAutomationScriptDeleted(mas.isMasterAutomationScriptDeleted());
				sessionTestManager.update(recordExist);
			}
			else {
				mas.setMasterAutomationScriptDateCreated(masterAutomationScriptDateCreated);
				mas.setMasterAutomationScriptDateUpdated(masterAutomationScriptDateUpdated);
				sessionTestManager.persist(mas);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public MasterAutomationScript getMasterAutomationScriptByReference (String MasterAutomationScriptReferenceFilter) {
		MasterAutomationScript masterAutomationScript = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterAutomationScript.class);
			criteria.add(Restrictions.eq("masterAutomationScript_Reference", MasterAutomationScriptReferenceFilter));
			criteria.add(Restrictions.eq("masterAutomationScript_Deleted", false));

			masterAutomationScript = (MasterAutomationScript) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return masterAutomationScript;
	}

	public void addUpdateMasterAutomationScriptStep (MasterAutomationScriptStep mass) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterAutomationScriptStep.class);
			criteria.add(Restrictions.eq("masterAutomationScriptStep_Reference", mass.getMasterAutomationScriptStepReference()));
			criteria.add(Restrictions.eq("masterAutomationScriptStep_Deleted", false));

			Date masterAutomationScriptStepDateCreated = new Date (System.currentTimeMillis());
			Date masterAutomationScriptStepDateUpdated = (Date) masterAutomationScriptStepDateCreated.clone();
			
			MasterAutomationScriptStep recordExist = (MasterAutomationScriptStep) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getMasterAutomationScriptStepReference().equalsIgnoreCase(mass.getMasterAutomationScriptStepReference())) {
				recordExist.setMasterAutomationScriptStepReference(mass.getMasterAutomationScriptStepReference());
				recordExist.setMasterAutomationScriptStepAutomationScriptID(mass.getMasterAutomationScriptStepAutomationScriptID());
				recordExist.setMasterAutomationScriptStepAutomationScriptReference(mass.getMasterAutomationScriptStepAutomationScriptReference());
				recordExist.setMasterAutomationScriptStepStepKeyword(mass.getMasterAutomationScriptStepStepKeyword());
				recordExist.setMasterAutomationScriptStepConfigData(mass.getMasterAutomationScriptStepConfigData());
				recordExist.setMasterAutomationScriptStepSerialNumber(mass.getMasterAutomationScriptStepSerialNumber());
				recordExist.setMasterAutomationScriptStepExecutionSequence(mass.getMasterAutomationScriptStepExecutionSequence());
				recordExist.setMasterAutomationScriptStepSkipStep(mass.getMasterAutomationScriptStepSkipStep());
				recordExist.setMasterAutomationScriptStepToBeExecutedByMachine(mass.getMasterAutomationScriptStepToBeExecutedByMachine());
				recordExist.setMasterAutomationScriptStepSerialNumber(mass.getMasterAutomationScriptStepSerialNumber());
				//recordExist.setMasterAutomationScriptStepDateCreated(mass.getMasterAutomationScriptStepDateCreated());
				recordExist.setMasterAutomationScriptStepDateUpdated(masterAutomationScriptStepDateUpdated);
				recordExist.setMasterAutomationScriptStepDeleted(mass.isMasterAutomationScriptStepDeleted());
				sessionTestManager.update(recordExist);
			}
			else {
				mass.setMasterAutomationScriptStepDateCreated(masterAutomationScriptStepDateCreated);
				mass.setMasterAutomationScriptStepDateUpdated(masterAutomationScriptStepDateUpdated);
				sessionTestManager.persist(mass);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public MasterAutomationScriptStep getMasterAutomationScriptStepByReference (String MasterAutomationScriptStepReferenceFilter) {
		MasterAutomationScriptStep masterAutomationScriptStep = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterAutomationScriptStep.class);
			criteria.add(Restrictions.eq("masterAutomationScriptStep_Reference", MasterAutomationScriptStepReferenceFilter));
			criteria.add(Restrictions.eq("masterAutomationScriptStep_Deleted", false));

			masterAutomationScriptStep = (MasterAutomationScriptStep) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return masterAutomationScriptStep;
	}
	
	public List<MasterAutomationScriptStep> getMasterAutomationScriptStepsByMasterAutomationScriptReference(String masterAutomationScriptReference) {
		List<MasterAutomationScriptStep> masterAutomationScriptSteps = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterAutomationScriptStep.class);
			criteria.add(Restrictions.eq("masterAutomationScriptStep_AutomationScriptReference", masterAutomationScriptReference));
			criteria.add(Restrictions.eq("masterAutomationScriptStep_Deleted", false));
			criteria.addOrder(Order.asc("masterAutomationScriptStep_ExecutionSequence"));
			masterAutomationScriptSteps = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return masterAutomationScriptSteps;
	}

	public void addUpdateMasterTestSuite (MasterTestSuite mts) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterTestSuite.class);
			criteria.add(Restrictions.eq("masterTestSuite_Reference", mts.getMasterTestSuiteReference()));
			criteria.add(Restrictions.eq("masterTestSuite_Deleted", false));

			Date masterTestSuiteDateCreated = new Date (System.currentTimeMillis());
			Date masterTestSuiteDateUpdated = (Date) masterTestSuiteDateCreated.clone();

			MasterTestSuite recordExist = (MasterTestSuite) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getMasterTestSuiteReference().equalsIgnoreCase(mts.getMasterTestSuiteReference())) {
				recordExist.setMasterTestSuiteProjectID(mts.getMasterTestSuiteProjectID());
				recordExist.setMasterTestSuiteProjectReference(mts.getMasterTestSuiteProjectReference());
				recordExist.setMasterTestSuiteApplicationID(mts.getMasterTestSuiteApplicationID());
				recordExist.setMasterTestSuiteApplicationReference(mts.getMasterTestSuiteApplicationReference());
				recordExist.setMasterTestSuiteDescription(mts.getMasterTestSuiteDescription());
				recordExist.setMasterTestSuiteSerialNumber(mts.getMasterTestSuiteSerialNumber());
				recordExist.setMasterTestSuiteRepositoryFilePath(mts.getMasterTestSuiteRepositoryFilePath());
				recordExist.setMasterTestSuiteRepositoryAbsoluteFolderPath(mts.getMasterTestSuiteRepositoryAbsoluteFolderPath());
				//recordExist.setMasterTestSuiteDateCreated(mts.getMasterTestSuiteDateCreated());
				recordExist.setMasterTestSuiteDateUpdated(masterTestSuiteDateUpdated);
				recordExist.setMasterTestSuiteDeleted(mts.isMasterTestSuiteDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				mts.setMasterTestSuiteDateCreated(masterTestSuiteDateCreated);
				mts.setMasterTestSuiteDateUpdated(masterTestSuiteDateUpdated);
				sessionTestManager.persist(mts);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public MasterTestSuite getMasterTestSuiteByReference (String masterTestSuiteReferenceFilter) {
		MasterTestSuite mts = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(MasterTestSuite.class);
			criteria.add(Restrictions.eq("masterTestSuite_Reference", masterTestSuiteReferenceFilter));
			criteria.add(Restrictions.eq("masterTestSuite_Deleted", false));

			mts = (MasterTestSuite) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return mts;
	}

	public void addUpdateTestSuite (TestSuite ts) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestSuite.class);
			criteria.add(Restrictions.eq("testSuite_Reference", ts.getTestSuiteReference()));
			criteria.add(Restrictions.eq("testSuite_Deleted", false));

			Date testSuiteDateCreated = new Date (System.currentTimeMillis());
			Date testSuiteDateUpdated = (Date) testSuiteDateCreated.clone();
			
			TestSuite recordExist = (TestSuite) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getTestSuiteReference().equalsIgnoreCase(ts.getTestSuiteReference())) {

				recordExist.setTestSuiteProjectID(ts.getTestSuiteProjectID());
				recordExist.setTestSuiteProjectReference(ts.getTestSuiteProjectReference());
				recordExist.setTestSuiteApplicationID(ts.getTestSuiteApplicationID());
				recordExist.setTestSuiteApplicationReference(ts.getTestSuiteApplicationReference());
				recordExist.setTestSuiteModuleID(ts.getTestSuiteModuleID());
				recordExist.setTestSuiteModuleReference(ts.getTestSuiteModuleReference());
				recordExist.setTestSuiteMasterTestSuiteID(ts.getTestSuiteMasterTestSuiteID());
				recordExist.setTestSuiteMasterTestSuiteReference(ts.getTestSuiteMasterTestSuiteReference());
				recordExist.setTestSuiteDescription(ts.getTestSuiteDescription());
				recordExist.setTestSuiteRepositoryFile(ts.getTestSuiteRepositoryFile());
				recordExist.setTestSuiteRepositoryAbsoluteFolderPath(ts.getTestSuiteRepositoryAbsoluteFolderPath());
				recordExist.setTestSuiteExecutionPriority(ts.getTestSuiteExecutionPriority());
				//PENDING
				//recordExist.setTestSuiteConfigurationID(ts.setTestSuiteConfigurationID());
				//recordExist.setTestSuiteConfigurationReference(ts.setTestSuiteConfigurationReference());
				recordExist.setTestSuiteExecutionMode(ts.getTestSuiteExecutionMode());
				recordExist.setTestSuiteSerialNumber(ts.getTestSuiteSerialNumber());
				//recordExist.setTestSuiteDateCreated(ts.getTestSuiteDateCreated());
				recordExist.setTestSuiteDateUpdated(testSuiteDateUpdated);
				recordExist.setTestSuiteDeleted(ts.isTestSuiteDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				ts.setTestSuiteDateCreated(testSuiteDateCreated);
				ts.setTestSuiteDateUpdated(testSuiteDateUpdated);
				sessionTestManager.persist(ts);
			}

			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public TestSuite getTestSuiteByReference (String testSuiteReferenceFilter) {
		TestSuite ts = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestSuite.class);
			criteria.add(Restrictions.eq("testSuite_Reference", testSuiteReferenceFilter));
			criteria.add(Restrictions.eq("testSuite_Deleted", false));

			ts = (TestSuite) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return ts;
	}

	public void addUpdateTestScenario (TestScenario tsc) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestScenario.class);
			criteria.add(Restrictions.eq("testScenario_Reference", tsc.getTestScenarioReference()));
			criteria.add(Restrictions.eq("testScenario_Deleted", false));

			Date testScenarioDateCreated = new Date (System.currentTimeMillis());
			Date testScenarioDateUpdated = (Date) testScenarioDateCreated.clone();
			
			TestScenario recordExist = (TestScenario) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getTestScenarioReference().equalsIgnoreCase(tsc.getTestScenarioReference())) {
				recordExist.setTestScenarioReference(tsc.getTestScenarioReference());
				recordExist.setTestScenarioProjectID(tsc.getTestScenarioProjectID());
				recordExist.setTestScenarioProjectReference(tsc.getTestScenarioProjectReference());
				recordExist.setTestScenarioApplicationID(tsc.getTestScenarioApplicationID());
				recordExist.setTestScenarioApplicationReference(tsc.getTestScenarioApplicationReference());
				recordExist.setTestScenarioMasterTestSuiteID(tsc.getTestScenarioMasterTestSuiteID());
				recordExist.setTestScenarioMasterTestSuiteReference(tsc.getTestScenarioMasterTestSuiteReference());
				recordExist.setTestScenarioTestSuiteID(tsc.getTestScenarioTestSuiteID());
				recordExist.setTestScenarioTestSuiteReference(tsc.getTestScenarioTestSuiteReference());
				recordExist.setTestScenarioPrerequisiteTestSuiteID(tsc.getTestScenarioPrerequisiteTestSuiteID());
				recordExist.setTestScenarioPrerequisiteTestSuiteReference(tsc.getTestScenarioPrerequisiteTestSuiteReference());
				recordExist.setTestScenarioPrerequisiteTestScenarioID(tsc.getTestScenarioPrerequisiteTestScenarioID());
				recordExist.setTestScenarioPrerequisiteTestScenarioReference(tsc.getTestScenarioPrerequisiteTestScenarioReference());
				recordExist.setTestScenarioDescription(tsc.getTestScenarioDescription());
				recordExist.setTestScenarioMasterAutomationScriptID(tsc.getTestScenarioMasterAutomationScriptID());
				recordExist.setTestScenarioMasterAutomationScriptReference(tsc.getTestScenarioMasterAutomationScriptReference());
				recordExist.setTestScenarioSerialNumber(tsc.getTestScenarioSerialNumber());
				//recordExist.setTestScenarioDateCreated(tsc.getTestScenarioDateCreated());
				recordExist.setTestScenarioDateUpdated(testScenarioDateUpdated);
				recordExist.setTestScenarioDeleted(tsc.isTestScenarioDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				tsc.setTestScenarioDateCreated(testScenarioDateCreated);
				tsc.setTestScenarioDateUpdated(testScenarioDateUpdated);
				sessionTestManager.persist(tsc);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public TestScenario getTestScenarioByReference (String testScenarioReferenceFilter) {
		TestScenario tsc = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestScenario.class);
			criteria.add(Restrictions.eq("testScenario_Reference", testScenarioReferenceFilter));
			criteria.add(Restrictions.eq("testScenario_Deleted", false));

			tsc = (TestScenario) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return tsc;
	}

	public RuntimeConfigParameter getRuntimeConfigParameterByReference(String runtimeConfigParametersFilter) {
		RuntimeConfigParameter runtimeConfigParameter = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(RuntimeConfigParameter.class);
			criteria.add(Restrictions.eq("runtimeConfigParameters_Reference", runtimeConfigParametersFilter));
			//criteria.add(Restrictions.eq("runtimeConfigParameters_Deleted", false));

			runtimeConfigParameter = (RuntimeConfigParameter) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return runtimeConfigParameter;
	}

	public void addUpdateRuntimeConfigParameter (RuntimeConfigParameter runtimeConfigParameter) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(RuntimeConfigParameter.class);
			criteria.add(Restrictions.eq("runtimeConfigParameters_Reference", runtimeConfigParameter.getRuntimeConfigParametersReference()));
			criteria.add(Restrictions.eq("runtimeConfigParameters_Deleted", false));

			RuntimeConfigParameter recordExist = (RuntimeConfigParameter) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getRuntimeConfigParametersReference().equalsIgnoreCase(runtimeConfigParameter.getRuntimeConfigParametersReference())) {
				recordExist.setRuntimeConfigParametersKeyData(runtimeConfigParameter.getRuntimeConfigParametersKeyData());
				sessionTestManager.update(recordExist);
			}
			else
				sessionTestManager.persist(runtimeConfigParameter);

			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public void addUpdateTestPlan (TestPlan testPlan) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestPlan.class);
			criteria.add(Restrictions.eq("testPlan_Reference", testPlan.getTestPlanReference()));
			criteria.add(Restrictions.eq("testPlan_Deleted", false));

			Date testPlanDateCreated = new Date (System.currentTimeMillis());
			Date testPlanDateUpdated = (Date) testPlanDateCreated.clone();
			
			TestPlan recordExist = (TestPlan) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getTestPlanReference().equalsIgnoreCase(testPlan.getTestPlanReference())) {
				recordExist.setTestPlanDescription(testPlan.getTestPlanDescription());
				//recordExist.setTestPlanDateCreated(testPlan.getTestPlanDateCreated());
				recordExist.setTestPlanDateUpdated(testPlanDateUpdated);
				recordExist.setTestPlanDeleted(testPlan.isTestPlanDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				testPlan.setTestPlanDateCreated(testPlanDateCreated);
				testPlan.setTestPlanDateUpdated(testPlanDateUpdated);
				sessionTestManager.persist(testPlan);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public TestPlan getTestPlanByReference(String testPlanFilter) {
		TestPlan testPlan = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(TestPlan.class);
			criteria.add(Restrictions.eq("testPlan_Reference", testPlanFilter));
			criteria.add(Restrictions.eq("testPlan_Deleted", false));

			testPlan = (TestPlan) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return testPlan;
	}

	public void addUpdateExecutionMasterTestSuite(ExecutionMasterTestSuites executionMasterTestSuite) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionMasterTestSuites.class);
			criteria.add(Restrictions.eq("executionMasterTestSuite_Reference", executionMasterTestSuite.getExecutionMasterTestSuiteReference()));
			criteria.add(Restrictions.eq("executionMasterTestSuite_Deleted", false));

			Date executionMasterTestSuiteDateCreated = new Date (System.currentTimeMillis());
			Date executionMasterTestSuiteDateUpdated = (Date) executionMasterTestSuiteDateCreated.clone();
			
			ExecutionMasterTestSuites recordExist = (ExecutionMasterTestSuites) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getExecutionMasterTestSuiteReference().equalsIgnoreCase(executionMasterTestSuite.getExecutionMasterTestSuiteReference())) {
				recordExist.setExecutionMasterTestSuiteDescription(executionMasterTestSuite.getExecutionMasterTestSuiteDescription());
				recordExist.setExecutionMasterTestSuiteTestPlanID(executionMasterTestSuite.getExecutionMasterTestSuiteTestPlanID());
				recordExist.setExecutionMasterTestSuiteTestPlanReference(executionMasterTestSuite.getExecutionMasterTestSuiteTestPlanReference());
				recordExist.setExecutionMasterTestSuiteMasterTestSuiteID(executionMasterTestSuite.getExecutionMasterTestSuiteMasterTestSuiteID());
				recordExist.setExecutionMasterTestSuiteMasterTestSuiteReference(executionMasterTestSuite.getExecutionMasterTestSuiteMasterTestSuiteReference());
				recordExist.setExecutionMasterTestSuiteSerialNumber(executionMasterTestSuite.getExecutionMasterTestSuiteSerialNumber());
				recordExist.setExecutionMasterTestSuiteExecutionStatus(executionMasterTestSuite.getExecutionMasterTestSuiteExecutionStatus());
				//recordExist.setExecutionMasterTestSuiteDateCreated(executionMasterTestSuite.getExecutionMasterTestSuiteDateCreated());
				recordExist.setExecutionMasterTestSuiteDateUpdated(executionMasterTestSuiteDateUpdated);
				recordExist.setExecutionMasterTestSuiteDeleted(executionMasterTestSuite.isExecutionMasterTestSuiteDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				executionMasterTestSuite.setExecutionMasterTestSuiteDateCreated(executionMasterTestSuiteDateCreated);
				executionMasterTestSuite.setExecutionMasterTestSuiteDateUpdated(executionMasterTestSuiteDateUpdated);
				sessionTestManager.persist(executionMasterTestSuite);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public ExecutionMasterTestSuites getExecutionMasterTestSuiteByReference(String executionMasterTestSuiteFilter) {
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionMasterTestSuites.class);
			criteria.add(Restrictions.eq("executionMasterTestSuite_Reference", executionMasterTestSuiteFilter));
			criteria.add(Restrictions.eq("executionMasterTestSuite_Deleted", false));

			executionMasterTestSuite = (ExecutionMasterTestSuites) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionMasterTestSuite;
	}

	public ExecutionMasterTestSuites getExecutionMasterTestSuiteByCriteria (Properties executionMasterTestSuiteFilterProperties) {
		ExecutionMasterTestSuites executionMasterTestSuite = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionMasterTestSuites.class);
			Enumeration<Object> filterColumns = executionMasterTestSuiteFilterProperties.keys();
			while(filterColumns.hasMoreElements()) {
				String columnName = (String) filterColumns.nextElement();
				String columnValue = executionMasterTestSuiteFilterProperties.getProperty(columnName);
				criteria.add(Restrictions.eq(columnName, columnValue));
			}

			executionMasterTestSuite = (ExecutionMasterTestSuites) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionMasterTestSuite;
	}

	public List<ExecutionMasterTestSuites> getAllExecutionMasterTestSuiteByTestPlanReference(String executionTestPlanReferenceFilter) {
		List<ExecutionMasterTestSuites> allExecutionMasterTestSuite = null;
		Session sessionTestManager1 = TestManagerHibernateUtil.getInstance().getNewSession();
		Transaction t=sessionTestManager1.beginTransaction();
		try {
			Criteria criteria = sessionTestManager1.createCriteria(ExecutionMasterTestSuites.class);
			criteria.add(Restrictions.eq("executionMasterTestSuite_TestPlanReference", executionTestPlanReferenceFilter));
			allExecutionMasterTestSuite = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return allExecutionMasterTestSuite;
	}

	public void addUpdateExecutionTestSuite(ExecutionTestSuites executionTestSuite) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSuites.class);
			criteria.add(Restrictions.eq("executionTestSuite_Reference", executionTestSuite.getExecutionTestSuiteReference()));
			criteria.add(Restrictions.eq("executionTestSuite_Deleted", false));

			Date executionTestSuiteDateCreated = new Date (System.currentTimeMillis());
			Date executionTestSuiteDateUpdated = (Date) executionTestSuiteDateCreated.clone();
			
			ExecutionTestSuites recordExist = (ExecutionTestSuites) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getExecutionTestSuiteReference().equalsIgnoreCase(executionTestSuite.getExecutionTestSuiteReference())) {
				recordExist.setExecutionTestSuiteDescription(executionTestSuite.getExecutionTestSuiteDescription());
				recordExist.setExecutionTestSuiteExecutionMasterTestSuiteID(executionTestSuite.getExecutionTestSuiteExecutionMasterTestSuiteID());
				recordExist.setExecutionTestSuiteExecutionMasterTestSuiteReference(executionTestSuite.getExecutionTestSuiteExecutionMasterTestSuiteReference());
				recordExist.setExecutionTestSuiteTestPlanID(executionTestSuite.getExecutionTestSuiteTestPlanID());
				recordExist.setExecutionTestSuiteTestPlanReference(executionTestSuite.getExecutionTestSuiteTestPlanReference());
				recordExist.setExecutionTestSuiteMasterTestSuiteID(executionTestSuite.getExecutionTestSuiteMasterTestSuiteID());
				recordExist.setExecutionTestSuiteMasterTestSuiteReference(executionTestSuite.getExecutionTestSuiteMasterTestSuiteReference());
				recordExist.setExecutionTestSuiteTestSuiteID(executionTestSuite.getExecutionTestSuiteTestSuiteID());
				recordExist.setExecutionTestSuiteTestSuiteReference(executionTestSuite.getExecutionTestSuiteTestSuiteReference());
				recordExist.setExecutionTestSuiteTestSuiteRepositoryFile(executionTestSuite.getExecutionTestSuiteTestSuiteRepositoryFile());
				recordExist.setExecutionTestSuiteTestSuiteExecutionPriority(executionTestSuite.getExecutionTestSuiteTestSuiteExecutionPriority());
				recordExist.setExecutionTestSuiteTestSuiteExecutionMode(executionTestSuite.getExecutionTestSuiteTestSuiteExecutionMode());
				recordExist.setExecutionTestSuiteTestSuiteSerialNumber(executionTestSuite.getExecutionTestSuiteTestSuiteSerialNumber());
				recordExist.setExecutionTestSuiteExecutionStatus(executionTestSuite.getExecutionTestSuiteExecutionStatus());
				//recordExist.setExecutionTestSuiteDateCreated(executionTestSuite.getExecutionTestSuiteDateCreated());
				recordExist.setExecutionTestSuiteDateUpdated(executionTestSuiteDateUpdated);
				recordExist.setExecutionTestSuiteDeleted(recordExist.isExecutionTestSuiteDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				executionTestSuite.setExecutionTestSuiteDateCreated(executionTestSuiteDateCreated);
				executionTestSuite.setExecutionTestSuiteDateUpdated(executionTestSuiteDateUpdated);
				sessionTestManager.persist(executionTestSuite);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public ExecutionTestSuites getExecutionTestSuiteByReference(String executionTestSuiteFilter) {
		ExecutionTestSuites executionTestSuite = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSuites.class);
			criteria.add(Restrictions.eq("executionTestSuite_Reference", executionTestSuiteFilter));
			criteria.add(Restrictions.eq("executionTestSuite_Deleted", false));

			executionTestSuite = (ExecutionTestSuites) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionTestSuite;
	}	

	public List<ExecutionTestSuites> getAllExecutionTestSuiteByExecutionMasterTestSuiteReference(String executionMasterTestSuiteReferenceFilter) {
		List<ExecutionTestSuites> allExecutionTestSuite = null;
		Session sessionTestManager1 = TestManagerHibernateUtil.getInstance().getNewSession();
		Transaction t=sessionTestManager1.beginTransaction();
		try {
			Criteria criteria = sessionTestManager1.createCriteria(ExecutionTestSuites.class);
			criteria.add(Restrictions.eq("executionTestSuite_ExecutionMasterTestSuiteReference", executionMasterTestSuiteReferenceFilter));
			allExecutionTestSuite = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return allExecutionTestSuite;
	}
	
	public ExecutionTestSuites getExecutionTestSuiteByCriteria (Properties executionTestSuiteFilterProperties) {
		ExecutionTestSuites executionTestSuite = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSuites.class);
			Enumeration<Object> filterColumns = executionTestSuiteFilterProperties.keys();
			while(filterColumns.hasMoreElements()) {
				String columnName = (String) filterColumns.nextElement();
				String columnValue = executionTestSuiteFilterProperties.getProperty(columnName);
				criteria.add(Restrictions.eq(columnName, columnValue));
			}

			executionTestSuite = (ExecutionTestSuites) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionTestSuite;
	}
	
	public void addUpdateExecutionTestScenario (ExecutionTestScenarios executionTestScenario) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestScenarios.class);
			criteria.add(Restrictions.eq("executionTestScenario_Reference", executionTestScenario.getExecutionTestScenarioReference()));
			criteria.add(Restrictions.eq("executionTestScenario_Deleted", false));

			Date executionTestScenarioDateCreated = new Date (System.currentTimeMillis());
			Date executionTestScenarioDateUpdated = (Date) executionTestScenarioDateCreated.clone();
			
			ExecutionTestScenarios recordExist = (ExecutionTestScenarios) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getExecutionTestScenarioReference().equalsIgnoreCase(executionTestScenario.getExecutionTestScenarioReference())) {
				recordExist.setExecutionTestScenarioDescription(executionTestScenario.getExecutionTestScenarioDescription());
				recordExist.setExecutionTestScenarioExecutionTestSuiteID(executionTestScenario.getExecutionTestScenarioExecutionTestSuiteID());
				recordExist.setExecutionTestScenarioExecutionTestSuiteReference(executionTestScenario.getExecutionTestScenarioExecutionTestSuiteReference());
				recordExist.setExecutionTestScenarioTestPlanID(executionTestScenario.getExecutionTestScenarioTestPlanID());
				recordExist.setExecutionTestScenarioTestPlanReference(executionTestScenario.getExecutionTestScenarioTestPlanReference());
				recordExist.setExecutionTestScenarioMasterTestSuiteID(executionTestScenario.getExecutionTestScenarioMasterTestSuiteID());
				recordExist.setExecutionTestScenarioMasterTestSuiteReference(executionTestScenario.getExecutionTestScenarioMasterTestSuiteReference());
				recordExist.setExecutionTestScenarioTestSuiteID(executionTestScenario.getExecutionTestScenarioTestSuiteID());
				recordExist.setExecutionTestScenarioTestSuiteReference(executionTestScenario.getExecutionTestScenarioTestSuiteReference());
				recordExist.setExecutionTestScenarioTestScenarioID(executionTestScenario.getExecutionTestScenarioTestScenarioID());
				recordExist.setExecutionTestScenarioTestScenarioReference(executionTestScenario.getExecutionTestScenarioTestScenarioReference());
				recordExist.setExecutionTestScenarioSerialNumber(executionTestScenario.getExecutionTestScenarioSerialNumber());
				recordExist.setExecutionTestScenarioExecutionStatus(executionTestScenario.getExecutionTestScenarioExecutionStatus());
				recordExist.setExecutionTestScenarioLogFile(executionTestScenario.getExecutionTestScenarioLogFile());
				recordExist.setExecutionTestScenarioSnapShotFolder(executionTestScenario.getExecutionTestScenarioSnapShotFolder());
				recordExist.setExecutionTestScenarioNextSnapShotNumber(executionTestScenario.getExecutionTestScenarioNextSnapShotNumber());
				recordExist.setExecutionTestScenarioErrorMessage(executionTestScenario.getExecutionTestScenarioErrorMessage());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptStepToBeExecutedByMachine(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptStepToBeExecutedByMachine());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptID(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptID());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptReference(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptReference());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptStepID(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptStepID());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptStepReference(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptStepReference());
				recordExist.setExecutionTestScenarioNextExecutionAutomationScriptStepExecutionSequence(executionTestScenario.getExecutionTestScenarioNextExecutionAutomationScriptStepExecutionSequence());
				recordExist.setExecutionTestScenarioNextExecutionBusinessDate(executionTestScenario.getExecutionTestScenarioNextExecutionBusinessDate());
				recordExist.setExecutionTestScenarioStartTime(executionTestScenario.getExecutionTestScenarioStartTime());
				recordExist.setExecutionTestScenarioEndTime(executionTestScenario.getExecutionTestScenarioEndTime());
				//recordExist.setExecutionTestScenarioDateCreated(executionTestScenario.getExecutionTestScenarioDateCreated());
				recordExist.setExecutionTestScenarioDateUpdated(executionTestScenarioDateUpdated);
				recordExist.setExecutionTestScenarioDeleted(executionTestScenario.isExecutionTestScenarioDeleted());

				sessionTestManager.update(recordExist);
			}
			else {
				executionTestScenario.setExecutionTestScenarioDateCreated(executionTestScenarioDateCreated);
				executionTestScenario.setExecutionTestScenarioDateUpdated(executionTestScenarioDateUpdated);
				sessionTestManager.persist(executionTestScenario);
			}
			
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public ExecutionTestScenarios getExecutionTestScenarioByReference(String executionTestScenarioFilter) {
		ExecutionTestScenarios executionTestScenario = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestScenarios.class);
			criteria.add(Restrictions.eq("executionTestScenario_Reference", executionTestScenarioFilter));
			criteria.add(Restrictions.eq("executionTestScenario_Deleted", false));

			executionTestScenario = (ExecutionTestScenarios) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionTestScenario;
	}
	
	public List<ExecutionTestScenarios> getAllExecutionTestScenariosByExecutionTestSuiteReference(String executionTestSuiteReferenceFilter) {
		List<ExecutionTestScenarios> allExecutionTestScenarios = null;
		Session sessionTestManager1 = TestManagerHibernateUtil.getInstance().getNewSession();
		Transaction t=sessionTestManager1.beginTransaction();
		try {
			Criteria criteria = sessionTestManager1.createCriteria(ExecutionTestScenarios.class);
			criteria.add(Restrictions.eq("executionTestScenario_ExecutionTestSuiteReference", executionTestSuiteReferenceFilter));
			allExecutionTestScenarios = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return allExecutionTestScenarios;
	}
	
	public ExecutionTestScenarios getExecutionTestScenarioByCriteria (Properties executionTestScenarioFilterProperties) {
		ExecutionTestScenarios executionTestScenario = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestScenarios.class);
			Enumeration<Object> filterColumns = executionTestScenarioFilterProperties.keys();
			while(filterColumns.hasMoreElements()) {
				String columnName = (String) filterColumns.nextElement();
				String columnValue = executionTestScenarioFilterProperties.getProperty(columnName);
				criteria.add(Restrictions.eq(columnName, columnValue));
			}

			executionTestScenario = (ExecutionTestScenarios) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionTestScenario;
	}

	public void addUpdateExecutionTestStep (ExecutionTestSteps executionTestStep) {
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSteps.class);
			criteria.add(Restrictions.eq("executionTestStep_Reference", executionTestStep.getExecutionTestStepReference()));
			criteria.add(Restrictions.eq("executionTestStep_Deleted", false));

			Date executionTestStepsCreated = new Date (System.currentTimeMillis());
			Date executionTestStepsDateUpdated = (Date) executionTestStepsCreated.clone();
			
			ExecutionTestSteps recordExist = (ExecutionTestSteps) criteria.uniqueResult();
			if (recordExist!=null && recordExist.getExecutionTestStepReference().equalsIgnoreCase(executionTestStep.getExecutionTestStepReference())) {
				recordExist.setExecutionTestStepDescription(executionTestStep.getExecutionTestStepDescription());
				recordExist.setExecutionTestStepExecutionTestScenarioID(executionTestStep.getExecutionTestStepExecutionTestScenarioID());
				recordExist.setExecutionTestStepExecutionTestScenarioReference(executionTestStep.getExecutionTestStepExecutionTestScenarioReference());
				recordExist.setExecutionTestStepTestPlanID(executionTestStep.getExecutionTestStepTestPlanID());
				recordExist.setExecutionTestStepTestPlanReference(executionTestStep.getExecutionTestStepTestPlanReference());
				recordExist.setExecutionTestStepMasterTestSuiteID(executionTestStep.getExecutionTestStepMasterTestSuiteID());
				recordExist.setExecutionTestStepMasterTestSuiteReference(executionTestStep.getExecutionTestStepMasterTestSuiteReference());
				recordExist.setExecutionTestStepTestSuiteID(executionTestStep.getExecutionTestStepTestSuiteID());
				recordExist.setExecutionTestStepTestSuiteReference(executionTestStep.getExecutionTestStepTestSuiteReference());
				recordExist.setExecutionTestStepTestScenarioID(executionTestStep.getExecutionTestStepTestScenarioID());
				recordExist.setExecutionTestStepTestScenarioReference(executionTestStep.getExecutionTestStepTestScenarioReference());
				recordExist.setExecutionTestStepMasterAutomationScriptID(executionTestStep.getExecutionTestStepMasterAutomationScriptID());
				recordExist.setExecutionTestStepMasterAutomationScriptReference(executionTestStep.getExecutionTestStepMasterAutomationScriptReference());
				recordExist.setExecutionTestStepMasterAutomationScriptStepID(executionTestStep.getExecutionTestStepMasterAutomationScriptStepID());
				recordExist.setExecutionTestStepMasterAutomationScriptStepReference(executionTestStep.getExecutionTestStepMasterAutomationScriptStepReference());
				recordExist.setExecutionTestStepMasterAutomationScriptStepKeyword(executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword());
				recordExist.setExecutionTestStepMasterAutomationScriptStepConfigData(executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData());
				recordExist.setExecutionTestStepMasterAutomationScriptStepExecutionSequence(executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence());
				recordExist.setExecutionTestStepMasterAutomationScriptStepToBeExecutedOnMachine(executionTestStep.getExecutionTestStepMasterAutomationScriptStepToBeExecutedOnMachine());
				recordExist.setExecutionTestStepExecutionStatus(executionTestStep.getExecutionTestStepExecutionStatus());
				//recordExist.setExecutionTestStepDateCreated (executionTestStep.getExecutionTestStepDateCreated());
				recordExist.setExecutionTestStepDateUpdated (executionTestStepsDateUpdated);
				recordExist.setExecutionTestStepDeleted(executionTestStep.isExecutionTestStepDeleted());
				sessionTestManager.update(executionTestStep);
			}
			else {
				executionTestStep.setExecutionTestStepDateCreated (executionTestStepsCreated);
				executionTestStep.setExecutionTestStepDateUpdated (executionTestStepsDateUpdated);
				sessionTestManager.persist(executionTestStep);
			}
		
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
	}

	public ExecutionTestSteps getExecutionTestStepByReference(String executionTestStepFilter) {
		ExecutionTestSteps executionTestStep = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSteps.class);
			criteria.add(Restrictions.eq("executionTestStep_Reference", executionTestStepFilter));
			criteria.add(Restrictions.eq("executionTestStep_Deleted", false));

			executionTestStep = (ExecutionTestSteps) criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return executionTestStep;
	}
	
	public List<ExecutionTestSteps> getAllExecutionTestStepsByExecutionTestScenarioReference(String executionTestScenarioReferenceFilter) {
		List<ExecutionTestSteps> allTestSteps = null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(ExecutionTestSteps.class);
			criteria.add(Restrictions.eq("executionTestStep_ExecutionTestScenarioReference", executionTestScenarioReferenceFilter));
			criteria.addOrder(Order.asc("executionTestStep_MasterAutomationScriptStepExecutionSequence"));
			allTestSteps = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return allTestSteps;
	}
}
