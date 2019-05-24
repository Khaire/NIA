package com.aqm.staf.framework.core.scenarioResult;

import java.util.ArrayList;

public class ScenarioResultStringGen {

	public static ArrayList<ArrayList<String>> ResultSetInStringList(ArrayList<ScenarioResultObject> resCollection){
		ArrayList<ArrayList<String>> allResultLinesData = new ArrayList<ArrayList<String>>(); 
		
		for(ScenarioResultObject sceneResult:resCollection){
			ArrayList<String> listOfLineData = new ArrayList<String>();
			listOfLineData.add(sceneResult.getSerialNumber());
			listOfLineData.add(sceneResult.getPlatformName());
			listOfLineData.add(sceneResult.getBrowserNameVersion());
			listOfLineData.add(sceneResult.getLobName());
			listOfLineData.add(sceneResult.getProductName());
			listOfLineData.add(sceneResult.getScenarioID());
			listOfLineData.add(sceneResult.getDateTimeOfExecution());
			listOfLineData.add(sceneResult.getDurationOfExecution());
			listOfLineData.add(sceneResult.getScenarioStatus());
			listOfLineData.add(sceneResult.getReasonIfFailed());
			listOfLineData.add(sceneResult.getTypeOfFailure());
			listOfLineData.add(sceneResult.getScripterName());
			allResultLinesData.add(listOfLineData);
		}
		
		return allResultLinesData;
	}
	
	public static ArrayList<ArrayList<String>> ResultListInStringList(ArrayList<ScenarioExecutionList> resCollection){
		ArrayList<ArrayList<String>> allResultLinesData = new ArrayList<ArrayList<String>>(); 
		
		for(ScenarioExecutionList sceneResult:resCollection){
			ArrayList<String> listOfLineData = new ArrayList<String>();
			listOfLineData.add(sceneResult.getSerialNumber());
			listOfLineData.add(sceneResult.getPlatformName());
			listOfLineData.add(sceneResult.getBrowserNameVersion());
			listOfLineData.add(sceneResult.getLobName());
			listOfLineData.add(sceneResult.getProductName());
			listOfLineData.add(sceneResult.getScenarioID());
			listOfLineData.add(sceneResult.getDateTimeOfExecution());
			listOfLineData.add(sceneResult.getDurationOfExecution());
			listOfLineData.add(sceneResult.getScenarioStatus());
			listOfLineData.add(sceneResult.getReasonIfFailed());
			listOfLineData.add(sceneResult.getTypeOfFailure());
			listOfLineData.add(sceneResult.getScripterName());
			allResultLinesData.add(listOfLineData);
		}
		
		return allResultLinesData;
	}
	
	public static StringBuilder[][] ResultSetInStringBuilder(ArrayList<ScenarioResultObject> resCollection){
		
		int sizeOfSROList=resCollection.size();
		int innerLoopCounter=0;
		StringBuilder[][] allResultLinesData = new StringBuilder[sizeOfSROList][12];
		
		for(ScenarioResultObject sceneResult:resCollection){
				if(sceneResult.getReasonIfFailed()== null){
			
					sceneResult.setReasonIfFailed(sceneResult.getLobName());
				}
			
				allResultLinesData[innerLoopCounter][0]=	new StringBuilder(sceneResult.getSerialNumber());
				allResultLinesData[innerLoopCounter][1]=	new StringBuilder(sceneResult.getPlatformName());
				allResultLinesData[innerLoopCounter][2]=	new StringBuilder(sceneResult.getBrowserNameVersion());
				allResultLinesData[innerLoopCounter][3]=	new StringBuilder(sceneResult.getLobName());
				allResultLinesData[innerLoopCounter][4]=	new StringBuilder(sceneResult.getProductName());
				allResultLinesData[innerLoopCounter][5]=	new StringBuilder(sceneResult.getScenarioID());
				allResultLinesData[innerLoopCounter][6]=	new StringBuilder(sceneResult.getDateTimeOfExecution());
				allResultLinesData[innerLoopCounter][7]=	new StringBuilder(sceneResult.getDurationOfExecution());
				allResultLinesData[innerLoopCounter][8]=	new StringBuilder(sceneResult.getScenarioStatus());
				allResultLinesData[innerLoopCounter][9]=	new StringBuilder(sceneResult.getReasonIfFailed());
				allResultLinesData[innerLoopCounter][10]=	new StringBuilder(sceneResult.getTypeOfFailure());
				allResultLinesData[innerLoopCounter][11]=	new StringBuilder(sceneResult.getScripterName());
			
	
			innerLoopCounter++;
		}
		
		return allResultLinesData;
	}
	
	
}
