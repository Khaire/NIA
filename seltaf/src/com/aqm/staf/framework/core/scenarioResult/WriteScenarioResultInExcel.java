package com.aqm.staf.framework.core.scenarioResult;

public class WriteScenarioResultInExcel {
	
	public WriteScenarioResultInExcel(String workbookName,String filepath,StringBuilder[][] table){
		String headerLine[]={"Serial Number","Platform Name","Browser Name-Version","Lob","Product","Scenario ID","Date Time Of Execution","Duration Of Execution","Scenario Status","Reason If Failed","Type Of Failure","Scripter Name"};
		WorkbookBuilder GenerateExcelResult = new WorkbookBuilder();
		GenerateExcelResult.mkXlsx(workbookName, filepath, headerLine, table);
	}


	

	
}
