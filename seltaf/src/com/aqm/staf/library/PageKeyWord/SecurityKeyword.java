package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.SecurityPartyEntity;
import com.aqm.staf.library.pages.common.AssignUserToRole;
import com.aqm.staf.library.pages.common.UserSearch;


public class SecurityKeyword extends FunctionalKeywords {
	private static  String keyword;
	private static 	String configData;
	private static String stepGroup;

	public void createSuperuser(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		List<SecurityPartyEntity> securityPartyEntityList=testData.getSecurityPartyEntityRecords();
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("add")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
				userSearch.fetchUserCode(securityPartyEntity);
				testData.updateRecordsForCriteria(securityPartyEntity);
				setEditUserCodeDependency(securityPartyEntity, testData);
			}
		}
	}
	private void setEditUserCodeDependency(SecurityPartyEntity securityPartyEntity, ScenarioTestData testData) {
		if(securityPartyEntity.getStringValueForField("DependencyForSuperUserUserCode")!=null){
			ArrayList<SecurityPartyEntity> securityPartyEntityList = testData.getObjectByReference(testData.getSecurityPartyEntityRecords(), securityPartyEntity.getStringValueForField("DependencyForSuperUserUserCode"));
			for (SecurityPartyEntity securityPartyEntityData : securityPartyEntityList) {
				securityPartyEntityData.setStringValueForField("UserCode", securityPartyEntity.getStringValueForField("UserCode"));
			}
		}
	}
	public void  editSuperuser(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<SecurityPartyEntity> securityPartyEntityList=testData.getSecurityPartyEntityRecords();
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("edit")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.fillAndSearchSecurityDetails(securityPartyEntity);
				userSearch.selectSearchSuperuserPartyCode(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
			}
		}
	}

	public void  verifySuperuser(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<SecurityPartyEntity> securityPartyEntityList=testData.getSecurityPartyEntityRecords();
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("verify")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.fillAndSearchSecurityDetails(securityPartyEntity);
				userSearch.selectSearchSuperuserPartyCode(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
			}
		}
	}
}


