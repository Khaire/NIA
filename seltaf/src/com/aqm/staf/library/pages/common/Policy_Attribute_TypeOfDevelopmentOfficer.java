package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;

public class Policy_Attribute_TypeOfDevelopmentOfficer extends WebPage {

	private PageElement policyAttributesPageTypeOfDevelopmentOfficerTitle;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement typeOfDevelopmentOfficerDropdown;
	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;


	public Policy_Attribute_TypeOfDevelopmentOfficer(WebDriver driver,
			String pageName) {
		super(driver, pageName);

		policyAttributesPageTypeOfDevelopmentOfficerTitle=new PageElement(By.xpath("//div/b[contains(text(),'Type Of Development Officer')]"), "Policy Attributes Page Type Of Development Officer Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Question Answer
		typeOfDevelopmentOfficerDropdown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Development Officer", "select")), "Select Type of Development Officer Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//Buttons
		forwordButton=new PageElement(By.name("Next"), "Forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

}
