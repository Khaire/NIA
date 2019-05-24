package com.aqm.staf.framework.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//Added by Jitendra on 9th March 2017
public class LoadPropertyUtil {
	private static Properties prop;
	private static InputStream input;
	
	public static void loadConfProperties() throws IOException {
		prop = new Properties();
		input = new FileInputStream("config.properties");
		prop.load(input);
	}
	
	public static String fetchingScripterNameFromProperties() {
		String toReturn = "";
		 
		try {
			loadConfProperties();
			toReturn = prop.getProperty("scripterName");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	public static String fetchingScenarioIDFromProperties() {
		String toReturn = "";
		try {
			loadConfProperties();
			toReturn = prop.getProperty("ScenarioID");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	public static String fetchingProductCodeFromProperties() {
		String toReturn = "";
		try {
			loadConfProperties();
			toReturn = prop.getProperty("ProductCode");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	public static String fetchingLOBsFromProperties() {
		String toReturn = "";
		try {
			loadConfProperties();
			toReturn = prop.getProperty("lob");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	public static void loadTableConfProperties() throws IOException {
		prop = new Properties();
		input = new FileInputStream("tableconfig.properties");
		prop.load(input);
	}

	public static String fetchingMasterTestDataUploadFromProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String fetchingDataSheetToBeUploadedFromProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	

		

}
