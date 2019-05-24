package com.aqm.staf.library.pages.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyMember_InsuredEntity;

public class ClaimSearchPage extends BasePage {
	private PageElement claimSearchPageTitle;
	private PageElement claimDetailsPageTitle;
	private PageElement productTextField;
	private PageElement productSearchTextField;
	private PageElement claimNumberTextField;
	private PageElement policyNumberTextField;
	private PageElement fromDateTextField;
	private PageElement toDateTextField;
	private PageElement eventCodeTextField;
	private PageElement claimStatusDropdown;
	private PageElement partyCodeTextField;
	private PageElement partyStakeCodeTextField;
	private PageElement parameterDropdown;
	private PageElement branchCodeDropdown;
	private PageElement searchButton;
	private PageElement newButton;
	private PageElement orphanButton;
	private PageElement hitOrRunButton;
	private PageElement clearButton;
	private PageElement backButton;
	private PageElement claimDetailsTitle;
	private PageElement claimNumberLinkTextField;

	private String claimNumber;
	private String clonedClaimNo;
	public ClaimSearchPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimSearchPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Search')]"), "Claim Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productTextField = new PageElement(By.name("pProductCode"), "Product TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productSearchTextField =new PageElement(By.name("pProductName"), "Product Search Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberTextField = new PageElement(By.name("pClaimNumber"), "Claim Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberTextField = new PageElement(By.name("pPolicyNo"), "Policy Number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		fromDateTextField = new PageElement(By.name("pSearchFromDate"), "From Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		toDateTextField = new PageElement(By.name("pSearchToDate"), "To Search Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		eventCodeTextField = new PageElement(By.name("pClaimEventCode"), "Event Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusDropdown = new PageElement(By.name("pClaimStatus"), "Claim Status Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partyStakeCodeTextField = new PageElement(By.name("pStakeCode"), "Party Stake Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		parameterDropdown = new PageElement(By.name("pParameterName"), "Parameter Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		branchCodeDropdown = new PageElement(By.name("pBranchCode"), "Branched Code Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		searchButton = new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		orphanButton = new PageElement(By.name("Orphan"), "Orphan Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		hitOrRunButton = new PageElement(By.name("Hit/Run"), "Hit Or Run Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		clearButton = new PageElement(By.name("Clear"), "Clear Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//Table - Search Result Page
		//title
		claimDetailsTitle= new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Claim Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	//Services

	public void navigateToNewButton(){
		click(newButton);
		switchToFrame("display");
		isElementDisplayed(claimDetailsTitle);
	}
	public void fillClaimSearchDetail(ClaimEntity claimEntityListData) {
		if(claimEntityListData.getAction().equalsIgnoreCase("verify") || claimEntityListData.getAction().equalsIgnoreCase("edit")){
			switchToFrame("display");
			if (claimEntityListData.getBooleanValueForField("ConfigSearchProductCode")) {
				clearAndSendKeys(productTextField, claimEntityListData.getStringValueForField("ProductCode"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchProductName")) {
				clearAndSendKeys(productSearchTextField, claimEntityListData.getStringValueForField("ProductName"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchClaimNumber")) {
				clearAndSendKeys(claimNumberTextField, claimEntityListData.getStringValueForField("ClaimNumber"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchPolicyNumber")) {
				clearAndSendKeys(policyNumberTextField, claimEntityListData.getStringValueForField("PolicyNumber"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchFromDate")) {
				clearAndSendKeys(fromDateTextField, claimEntityListData.getStringValueForField("FromDate"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchToDate")) {
				clearAndSendKeys(toDateTextField, claimEntityListData.getStringValueForField("ToDate"));
			}	
			if (claimEntityListData.getBooleanValueForField("ConfigSearchEventCode")) {
				clearAndSendKeys(eventCodeTextField, claimEntityListData.getStringValueForField("EventCode"));
			}	
			if (claimEntityListData.getBooleanValueForField("ConfigSearchClaimStaus")) {
				selectValueFromList(claimStatusDropdown, claimEntityListData.getStringValueForField("ClaimStaus"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchPartyCode")) {
				clearAndSendKeys(partyCodeTextField, claimEntityListData.getStringValueForField("PartyCode"));
			}	
			if (claimEntityListData.getBooleanValueForField("ConfigSearchPartyStakeCode")) {
				clearAndSendKeys(partyStakeCodeTextField, claimEntityListData.getStringValueForField("PartyStakeCode"));
			}	
			if (claimEntityListData.getBooleanValueForField("ConfigSearchParameter")) {
				selectValueFromList(parameterDropdown, claimEntityListData.getStringValueForField("Parameter"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSearchBranchCode")) {
				selectValueFromList(branchCodeDropdown, claimEntityListData.getStringValueForField("BranchCode"));
			}
		}
	}

	public void searchClaimDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
			switchToFrame("display");
		}
	}

	public void orphanClaimDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigOrphanButton")) {
			click(orphanButton);
			switchToFrame("display");

		}
	}
	public void hitrunClaimDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigHitRunButton")) {
			click(hitOrRunButton);
			switchToFrame("display");
       }
	}
	public void clearClaimDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			switchToFrame("display");
         }
	}
	public void backClaimDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void selectSearchClaimNumber(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigSearchClaimNumber")){
			claimNumber=claimEntityListData.getStringValueForField("ClaimNumber");
			claimNumberLinkTextField=new PageElement(By.linkText(claimNumber), "Claim Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(claimNumberLinkTextField);
			switchToFrame("display");
		}
	}

	public void clickSearch() {
		click(searchButton);
	}

	public void fillandSearchClaimDetails(ClaimEntity claimEntityListData){
		fillClaimSearchDetail(claimEntityListData);
		clickSearch();
	}
	public void navigateToClaimCreatePage(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigNewButton")){
			switchToFrame("display");
			click(newButton);
			try {
				switchToWindow("Message Window");
				PageElement okButton;
				okButton = new PageElement(By.name("OK"), "Ok Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(okButton);
				switchToWindow("Integrated Insurance Management System");
				
				}catch (Exception e) {
					// TODO: handle exception
				}
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
			}
		}
	

	public void navigateToClaimSearchPage(){
		navigateToClaimPage();
		switchToFrame("display");
		isElementDisplayed(claimSearchPageTitle);
	}
	
	public void fetchClonedClaimNo(ClaimEntity claimEntityListData){
		clonedClaimNo=fetchValueFromTextFields(claimNumberTextField);
		claimEntityListData.setStringValueForField("ClaimNumber", clonedClaimNo);
		clickSearch();
		claimNumberLinkTextField=new PageElement(By.linkText(clonedClaimNo), "Claim Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(claimNumberLinkTextField);
		switchToFrame("display");
		
	}
}


