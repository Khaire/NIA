package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ChildRecordEntity;

public class ApplicationHomePage extends BasePage {
	private PageElement homePageTitle;
	public ApplicationHomePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		homePageTitle=new PageElement(By.xpath("//td//b[contains(text(),'CWISS - CORE INSURANCE')]"), "Home Page Title", true, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void verifyHomePage() {
		switchToFrame("head");
		if(isElementDisplayed(homePageTitle));
		return;
	}

	public void verifyHomePage(ChildRecordEntity childRecord, CustomAssert assertReference) {
		
	}

	public void fillHomePage(ChildRecordEntity childRecord, CustomAssert assertReference) {
		
	}
}
