package com.aqm.staf.framework.core;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.tests.AutomationDriverScript;

public class CustomAssert extends Assert {
	boolean allChecks;
	boolean allStepsSkip;
	boolean warning;
	int counter=0;
	WebDriver driver;
	String errorMessage;
	//public static Map<Integer,String>assertBuilder=null;
	public  HashMap<Integer,String> scenarioAssertpool=new HashMap<Integer,String>();
	public CustomAssert(WebDriver driver) {
		allChecks = true;
		allStepsSkip=true;
		warning = false;
		this.errorMessage = "";
		this.driver=driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public boolean allStepsSkip() {
		return allStepsSkip;
	}

	public void setallStepsSkip(boolean allStepsSkip) {
		this.allStepsSkip = allStepsSkip;
	}

	public boolean isAllChecks() {
		return allChecks;
	}

	public void setAllChecks(boolean allChecks) {
		this.allChecks = allChecks;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void assertEquals (String expected, String actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try { 
			counter++;
			if (actual == null) actual = "DEFAULTED TO NULL OBJECT";
			if (expected == null) expected = "DEFAULTED TO NULL OBJECT";
			assertEquals(actual, expected);
			FrameworkServices.logMessage("<B>"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; PASSED </B>");
			String PassertString="<B>"+counter+"::{ "+actual+" ; "+expected+" }-->> PASSED </B>";
			scenarioAssertpool.put(counter,PassertString);

		}
		catch(AssertionError error) {
			allChecks = allChecks && false;
			setallStepsSkip(allStepsSkip);
			this.errorMessage="Excel value - "+ error.getMessage()+" - "+"at Application";
			switch (assertType) {
			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			case WARNING:
				warning = true;
				// Added by PKP on 13-10-2015 : Yellow indicates Warning
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				String FassertString="<B><Font Color = \"yellow\">"+counter+"::{ "+actual+" ; "+expected+" }-->> FAILED </B>";
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				scenarioAssertpool.put(counter,FassertString);

				break;
			}
		}

	}

	public void assertEquals (Boolean expected, Boolean actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try {
			counter++;
			if (actual == null) actual = false ;
			if (expected == null) expected = false;
			assertEquals(actual,expected);
			FrameworkServices.logMessage("<B>"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; PASSED </B>");
		}
		catch(AssertionError error) {
			allChecks = allChecks && false;
			setallStepsSkip(allStepsSkip);
			errorMessage= error.toString();
			switch (assertType) {
			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference,errorMessage);
				break;
			case WARNING:
				warning = true;
				//FrameworkServices.logMessage("<B>"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </B>");
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference,errorMessage);
				break;
			}
		}
	}
	public void assertEquals (int expected, int actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try {
			counter++;
			assertEquals(actual,expected);
		}
		catch(AssertionError error) {
			errorMessage = error.toString();
			switch (assertType) {
			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			case WARNING:
				warning = true;
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			}
		}
	}
	public void assertEquals (Float expected, Float actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try {
			assertEquals(actual, expected);
		}
		catch(AssertionError error) {
			errorMessage = error.toString();
			switch (assertType) {
			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			case WARNING:
				warning = true;
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			}
		}
	}
	public void assertEquals (Double expected, Double actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try {
			assertEquals(actual,expected);
		}
		catch(AssertionError error) {
			errorMessage= error.toString();
			switch (assertType) {

			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			case WARNING:
				warning = true;
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			}
		}
	}

	public void assertEquals (Long expected, Long actual, AssertionType assertType) {
		allStepsSkip=allStepsSkip && false;
		setallStepsSkip(allStepsSkip);
		try {
			assertEquals(actual,expected);
		}
		catch(AssertionError error) {
			errorMessage= error.toString();
			switch (assertType) {
			case ERROR:
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			case WARNING:
				warning = true;
				FrameworkServices.logMessage("<B><Font Color = \"yellow\">"+counter+".  Actual= "+actual+";  Expected= "+expected+" ; FAILED </Font></B>");
				captureScreenShotOnAssertionException(AutomationDriverScript.scenarioExecutionFolderReference, errorMessage);
				break;
			}
		}
	}

	public void captureScreenShotOnAssertionException(File snapshotFolder, String error){
		WebDriverWrapper webDriverWrapper = new WebDriverWrapper(driver);
		try {
			String fileName = webDriverWrapper.captureAssertionScreenShot(snapshotFolder, error);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
