package com.aqm.staf.framework.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class DataFileUploadFilter {
	public ArrayList<String> listOfSheetNameForUpload;
	private Properties prop;
	private InputStream input;

	public DataFileUploadFilter() {
		this.listOfSheetNameForUpload = listOfScenario(scenarioStringSplitToArray(fetchingScenarioNameFromProperties()));
	}

	private String fetchingScenarioNameFromProperties() {
		String toReturn = "";
		try {
			loadProperties();
			toReturn = prop.getProperty("DataSheetToBeUploaded");
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
