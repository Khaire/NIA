package com.aqm.staf.library.pages.common;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyEntityReinsurance;

public class PartyKeyWordReinsurance extends FunctionalKeywords
{
	public void createParty(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		/*keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();*/
		List<PartyEntityReinsurance> partyEntitiesReinsuranceList=testData.getPartyReinsuranceRecords();
		for(PartyEntityReinsurance partyEntityreinsurance:partyEntitiesReinsuranceList){
			if(partyEntityreinsurance.getAction().equalsIgnoreCase("add") && partyEntityreinsurance.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPageReinsurance partySearchPagereinsurance=new PartySearchPageReinsurance(driver, "Party Search Page");
				partySearchPagereinsurance.navigateToPartySearchPage(partyEntityreinsurance);
				partySearchPagereinsurance.navigateToPartyCreatePage(partyEntityreinsurance);
				PartyDetailsCreateEditPageReinsurance partyDetailsCreatePagereinsurance = new PartyDetailsCreateEditPageReinsurance(driver, "Party Details Create Page");
				partyDetailsCreatePagereinsurance.fillandSubmitPartyDetails(partyEntityreinsurance, assertReference);
			//	partySearchPage.fetchPartyCode(partyEntity);
				testData.updateRecordsForCriteria(partyEntityreinsurance);
			//	setEditPartyDependency(partyEntity, testData);
				
			}
		}
	}
	
}
