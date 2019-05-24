package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class RejectCancellation extends WebPage  {
	private PageElement policyQuoteDetailsTitle;
	//private PageElement rejectCancelletionButton;
	private PageElement reasonForInitiatingThisActionTextArea; 
	private PageElement saveButton;
	private PageElement backButton;

	public RejectCancellation(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyQuoteDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'PolicyQuoteDetails')]"),"PolicyQuoteDetailsTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//rejectCancelletionButton=new PageElement(By.name("RejectCancelletion"), "RejectCancelletionButton",false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		reasonForInitiatingThisActionTextArea=new PageElement(By.name("pNewRemark"),"ReasonForInitiatingThisActionTextAreas",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}

}
