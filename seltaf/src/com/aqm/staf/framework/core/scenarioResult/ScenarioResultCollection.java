package com.aqm.staf.framework.core.scenarioResult;

import java.util.ArrayList;
import java.util.Date;

public class ScenarioResultCollection {

	public static ScenarioResultCollection instance=null;
	public static ArrayList<ScenarioResultObject> listOfAllScenarioResult;


	public static ArrayList<ScenarioResultObject> getListOfAllScenarioResult() {
		return listOfAllScenarioResult;
	}

	public ScenarioResultCollection(){
		if(listOfAllScenarioResult==null){
			listOfAllScenarioResult= new ArrayList<ScenarioResultObject>();
		}}

	public static ScenarioResultCollection getInstance(){
		if(instance==null){
			instance=new ScenarioResultCollection();
			return instance;
		}
		else{
			return instance;
		}
	}

	
	public synchronized Boolean addIntoResultCollection(ScenarioResultObject obj,Long ExeTime){
		
		if(obj instanceof ScenarioResultObject){
			int j=listOfAllScenarioResult.size();
			for (int i=0;i<=j;i++){
				if(listOfAllScenarioResult.get(i).getScenarioID().equals(obj.getScenarioID())){
					listOfAllScenarioResult.get(i).setTypeOfFailure(obj.getTypeOfFailure());
					listOfAllScenarioResult.get(i).setScenarioStatus(obj.getScenarioStatus());
					listOfAllScenarioResult.get(i).setReasonIfFailed(obj.getReasonIfFailed());
					listOfAllScenarioResult.get(i).setDurationOfExecution(ExeTime);
					break;
				}
				System.out.println(obj.getScenarioID().toString()+" scenario not available in the executionlist");
			}

		}
		return false;
	}
	public Boolean addListResultCollection(ScenarioResultObject obj){
		if(obj instanceof ScenarioResultObject){
			return listOfAllScenarioResult.add(obj);
		}

		return false;
	}

}
