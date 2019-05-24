package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_EndorseAlter extends WebPage {
	private PageElement policyQuoteDetailsTitle;
	//EndorseAlter Button
	private PageElement effectiveDateTextField;
	private PageElement reasonForInitiatingThisactionTextArea; 
	private PageElement saveButton;
	private PageElement backButton;


	public Policy_EndorseAlter(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		policyQuoteDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"),"PolicyQuoteDetailsTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		effectiveDateTextField=new PageElement(By.name("pEventEffectiveDate"),"pEventEffectiveDateTextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonForInitiatingThisactionTextArea=new PageElement(By.name("pNewRemark"),"ReasonForInitiatingThisactionTextArea",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("Save"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}

}
