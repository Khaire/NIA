package com.aqm.staf.framework.core.scenarioResult;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aqm.staf.framework.core.Uploader;

public class DBResultUpdater {
	
	public static DBResultUpdater instance=null;
	
	
	
	public static DBResultUpdater getInstance() throws IOException{
		if(instance==null){
			instance=new DBResultUpdater();
			return instance;
		}
		else{
			return instance;
		}
	}
	
	public static void addIntoResultCollection(ScenarioResultObject obj) throws IOException{
			ArrayList<ScenarioResultObject>Result= new ArrayList<ScenarioResultObject>();
			Result.clear();
			Result.add(obj);
			String TableName="ScenarioResultObject"; 
			//Uploader upLoader = new Uploader();
			ScenarioResultStringGen scenarioRSGen= new ScenarioResultStringGen();
			//ScenarioResultCollection scenarioResCollection= new ScenarioResultCollection();
			if(obj instanceof ScenarioResultObject ){
			@SuppressWarnings("static-access")
			ArrayList<ArrayList<String>> table=scenarioRSGen.ResultSetInStringList(Result);
			
			try {
				
				Uploader.updateResultInDB(table,TableName);
				table.clear();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		}
		
	public static void addIntoResultList(ScenarioExecutionList obj) throws IOException{
		ArrayList<ScenarioExecutionList>Result= new ArrayList<ScenarioExecutionList>();
		Result.clear();
		Result.add(obj);
		String TableName="ScenarioExecutionList";
		//Uploader upLoader = new Uploader();
		ScenarioResultStringGen scenarioRSGen= new ScenarioResultStringGen();
		//ScenarioResultCollection scenarioResCollection= new ScenarioResultCollection();
		if(obj instanceof ScenarioExecutionList ){
		@SuppressWarnings("static-access")
		ArrayList<ArrayList<String>> table=scenarioRSGen.ResultListInStringList(Result);
		
		try {
			
			Uploader.updateResultInDB(table,TableName);
			table.clear();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	}



