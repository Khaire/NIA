package com.aqm.staf.framework.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
// @PSY added for master data upload through config file.
public class MasterFileUploadFilter {
	
	public ArrayList<String> listOfRefIDForUpload;
	private Properties prop;
	private InputStream input;

	public MasterFileUploadFilter() {
		this.listOfRefIDForUpload = listOfScenario(scenarioStringSplitToArray(fetchingScenarioNameFromProperties()));
	}

	private String fetchingScenarioNameFromProperties() {
		String toReturn = "";
		try {
			loadProperties();
			toReturn = prop.getProperty("MasterTestDataUpload");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toReturn;
	}

	private String[] scenarioStringSplitToArray(String strToSplit) {
		return strToSplit.split(",");
	}

	private ArrayList<String> listOfScenario(String[] arrayOfString) {
		ArrayList<String> toReturn = new ArrayList<String>();
		for (String s : arrayOfString) {
			toReturn.add(s);
		}
		return toReturn;
	}

	private void loadProperties() throws IOException {
		prop = new Properties();
		input = new FileInputStream("config.properties");
		prop.load(input);
	}


}
