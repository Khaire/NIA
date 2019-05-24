package com.aqm;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.MapOfUserIDAssignedToAllocation;
import com.aqm.staf.framework.core.Uploader;
import com.aqm.staf.framework.core.scenarioResult.ScenarioResultCollection;
import com.aqm.staf.framework.core.scenarioResult.ScenarioResultStringGen;
import com.aqm.staf.framework.core.scenarioResult.WriteScenarioResultInExcel;

public class TestLauncher {
	public static Process process = null;
	@SuppressWarnings("static-access")
	public static void main (String[] args) throws Exception {
		Uploader uploader= null;
		try {
			FrameworkServices frameworkServices = new FrameworkServices();
			Runtime.getRuntime().exec("cmd /c Kill_PID.bat", null, new File("D:\\NIATestAutomation\\Grid"));
			Thread.sleep(1000);
			process = Runtime.getRuntime().exec("cmd /c Grid.bat", null, new File("D:\\NIATestAutomation\\Grid"));
			if(process.isAlive()) {
				//Runtime.getRuntime().exec("cmd /c kill_PID_Browser.bat", null, new File(""));
				System.out.println(process.isAlive());
				Thread.sleep(1000);
			}
			else {
				System.out.println("Batch is already Open");
			}
			MapOfUserIDAssignedToAllocation.getInstance();
			uploader = new Uploader();
			uploader.uploadByVBSOrAPOI();
			uploader.createExecutionRecords();
			uploader.launchExecution();
			uploader.updateExecutionLog();
			uploader.closeDBSessions();
			System.out.println("Execution Completed.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally{
			Date ExecutionWatch= new Date();
			System.out.println( " Execution Endeded at time  :-"+ ExecutionWatch);
			if(ScenarioResultCollection.getListOfAllScenarioResult()!=null)
				new WriteScenarioResultInExcel("ResultSummary",uploader.getCurrentExecutionResultsFolder(),ScenarioResultStringGen.ResultSetInStringBuilder(ScenarioResultCollection.getListOfAllScenarioResult()));
			System.out.println("ExecutionResultSummary Report generated at path " + uploader.getCurrentExecutionResultsFolder().toString());
			Runtime rt = Runtime.getRuntime();
			rt.exec("taskkill /IM cmd.exe");
			System.exit(0);
		}
	}
}

