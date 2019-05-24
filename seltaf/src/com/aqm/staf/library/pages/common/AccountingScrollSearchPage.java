package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccScrollSearchEntity;
import com.aqm.staf.library.databin.AccoScrollEntryEntity;


public class AccountingScrollSearchPage extends BasePage {

	private PageElement scrollSearchPageTitle;
	private PageElement selectScrollEventDropdown;
	private PageElement proceedButton;
	private PageElement backButton;
	private PageElement scrollEntryScreenPageTitle;
	
    public AccountingScrollSearchPage(WebDriver driver, String pageName){
		super(driver, pageName);
        scrollSearchPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Search')]"), "Scroll Search Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectScrollEventDropdown=new PageElement(By.name("selectScrollEvent"), "Select Scroll Event Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Next"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		scrollEntryScreenPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Entry Screen')]"), "Scroll Entry Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	
	public void fillAccountingScrollSearchPage(AccScrollSearchEntity accScrollSearchEntity, CustomAssert assertReference)throws InterruptedException{
		if(accScrollSearchEntity.getAction().equalsIgnoreCase("add") || accScrollSearchEntity.getAction().equalsIgnoreCase("edit")){
			if (accScrollSearchEntity.getBooleanValueForField("ConfigSelectScrollEvent")) {
				selectValueFromList(selectScrollEventDropdown, accScrollSearchEntity.getStringValueForField("SelectScrollEvent"));
			}
			else if(accScrollSearchEntity.getAction().equalsIgnoreCase("verify")){
				AccScrollSearchEntity actualAccScrollSearchEntity=new AccScrollSearchEntity();
				if (accScrollSearchEntity.getBooleanValueForField("ConfigSelectScrollEvent")) {
					actualAccScrollSearchEntity.setStringValueForField("SelectScrollEvent", fetchValueFromTextFields(selectScrollEventDropdown));
					assertReference.assertEquals(accScrollSearchEntity.getStringValueForField("SelectScrollEvent"), actualAccScrollSearchEntity.getStringValueForField("SelectScrollEvent"), AssertionType.WARNING);
				}
			}
		}
	}
	
	public void proceedButtonAccountingScrollSearchPage(AccScrollSearchEntity accScrollSearchEntity){
		if (accScrollSearchEntity.getBooleanValueForField("ConfigNextButton")) {
			click(proceedButton);
			switchToFrame("display");
			if(accScrollSearchEntity.getStringValueForField("SelectScrollEvent").equalsIgnoreCase("Scroll Creation"))
			{
				if(isElementDisplayed(scrollEntryScreenPageTitle));
				
			}
			else
			{
				if(isElementDisplayed(scrollSearchPageTitle));
			
	        }
		}
	}
	public void backButtonAccountingScrollSearchPage(AccScrollSearchEntity accScrollSearchEntity){
		if (accScrollSearchEntity.getBooleanValueForField("ConfigBackButton")) {
		click(backButton);
		switchToFrame("display");
		if(isElementDisplayed(scrollSearchPageTitle));
		return;
		}
	}
	public void fillAndSubmitAccountingScrollSearchDetails(AccScrollSearchEntity accScrollSearchEntity, CustomAssert assertReference)throws InterruptedException{
		fillAccountingScrollSearchPage(accScrollSearchEntity, assertReference);
	    proceedButtonAccountingScrollSearchPage(accScrollSearchEntity);
	}
	
	
	

	
}
