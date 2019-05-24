package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyLocationEntity;
import com.aqm.staf.library.pages.common.PartyLocationDetails;
import com.aqm.staf.library.pages.common.PartyLocationSearch;
import com.aqm.staf.library.pages.common.PartyLocationTree;
import com.aqm.staf.library.pages.common.PartySearchPage;

public class LocationKeyWord extends FunctionalKeywords{
	private static  String keyword;
	private static 	String configData;
	private static String stepGroup;

	public void createLocation(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		List<PartyLocationEntity> partyLocationEntitiesList=testData.getPartyLocationEntityRecords();
		for(PartyLocationEntity partyLocationEntity:partyLocationEntitiesList){
			if(partyLocationEntity.getAction().equalsIgnoreCase("add")&& partyLocationEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				PartyLocationSearch partyLocationSearchPage=new PartyLocationSearch(driver, "Location Search Page");
				partyLocationSearchPage.navigateToLocationSearchPage(partyLocationEntity);
				partyLocationSearchPage.createNewLocationDeatils(partyLocationEntity);
				PartyLocationDetails partyLocationDetails= new PartyLocationDetails(driver, "Location Details Page");
				partyLocationDetails.fillAndSubmitLocationDetails(partyLocationEntity, assertReference);
				//partyLocationSearchPage.fetchPartyLocationCode(partyLocationEntity);
				testData.updateRecordsForCriteria(partyLocationEntity);
				setEditPartyLocationDependency(partyLocationEntity, testData);
			}
		}
		
	}
	private void setEditPartyLocationDependency(PartyLocationEntity partyLocationEntity, ScenarioTestData testData) {
		if(partyLocationEntity.getStringValueForField("DependencyForLocationCode")!=null){
			ArrayList<PartyLocationEntity> partyLocationEntityList = testData.getObjectByReference(testData.getPartyLocationEntityRecords(), partyLocationEntity.getStringValueForField("DependencyForLocationCode"));
			for (PartyLocationEntity partyLocationEntityData : partyLocationEntityList) {
				partyLocationEntityData.setStringValueForField("LocationCode", partyLocationEntity.getStringValueForField("LocationCode"));
				testData.updateRecordsForCriteria(partyLocationEntityData);
				
			}
		}
	}
	public void editPartyLocation(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{

		List<PartyLocationEntity> partyLocationEntitiesList=testData.getPartyLocationEntityRecords();
		for(PartyLocationEntity partyLocationEntity:partyLocationEntitiesList){
			if(partyLocationEntity.getAction().equalsIgnoreCase("edit")&& partyLocationEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				PartyLocationSearch partyLocationSearchPage=new PartyLocationSearch(driver, "Location Search Page");
				partyLocationSearchPage.navigateToLocationSearchPage(partyLocationEntity);
				partyLocationSearchPage.fillAndSearchLocationDetails(partyLocationEntity, assertReference);
				partyLocationSearchPage.selectSearchLocationCode(partyLocationEntity);
				partyLocationSearchPage.navigateToLocationDetailsPage();
				PartyLocationDetails partyLocationDetails= new PartyLocationDetails(driver, "Location Details Page");
				partyLocationDetails.fillAndSubmitLocationDetails(partyLocationEntity, assertReference);
				setEditPartyLocationDependency(partyLocationEntity, testData);
				testData.updateRecordsForCriteria(partyLocationEntity);
			}
		}
	}

	public void verifyPartyLocation(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{

		List<PartyLocationEntity> partyLocationEntitiesList=testData.getPartyLocationEntityRecords();
		for(PartyLocationEntity partyLocationEntity:partyLocationEntitiesList){
			if(partyLocationEntity.getAction().equalsIgnoreCase("verify")&& partyLocationEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				PartyLocationSearch partyLocationSearchPage=new PartyLocationSearch(driver, "Location Search Page");
				partyLocationSearchPage.navigateToLocationSearchPage(partyLocationEntity);
				partyLocationSearchPage.fillAndSearchLocationDetails(partyLocationEntity, assertReference);
				partyLocationSearchPage.selectSearchLocationCode(partyLocationEntity);
				partyLocationSearchPage.navigateToLocationDetailsPage();
				PartyLocationDetails partyLocationDetails= new PartyLocationDetails(driver, "Location Details Page");
				partyLocationDetails.fillAndSubmitLocationDetails(partyLocationEntity, assertReference);
				testData.updateRecordsForCriteria(partyLocationEntity);
			}
		}
	}
}