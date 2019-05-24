package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountngCollectnSearcEntity;
import com.aqm.staf.library.databin.ClaimAttributesEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctionsEntity;
import com.aqm.staf.library.databin.PolicyMemberAttribViewEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class AccountingCollectionSearchCollection extends BasePage {
	private PageElement searchCollectionPageTitlePage;
	private PageElement CollectionCumAdjustmentScreenTitlePage; 
	private PageElement collectionNoTextField;
	private PageElement collectionFromDateTextField;
	private PageElement collectionToDateTextField;
	private PageElement proposalPolicyNoTextField;
	private PageElement proposalPolicyNoFindButton;
	private PageElement proposalPolicyNoToBeSelectedLink;
	private PageElement collectionNumberLinkField;
	private PageElement newButton;
	private PageElement searchButton;
	private PageElement clearButton;
	private PageElement backButton;

	public AccountingCollectionSearchCollection(WebDriver driver, String pageName) {
		super(driver, pageName);
		searchCollectionPageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Search')]"),"Search Collection Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		CollectionCumAdjustmentScreenTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Collection/Collection Cum Adjustment/Adjustment Screen')]"),"Collection/Collection Cum Adjustment/Adjustment Screen Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		collectionNoTextField = new PageElement(By.name("pCollectNo"),"Collection No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		collectionFromDateTextField = new PageElement(By.name("pFromDate"),"Collection From Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		collectionToDateTextField = new PageElement(By.name("pToDate"),"Collection To Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		proposalPolicyNoTextField = new PageElement(By.name("pPolPropNo"),"Proposal/Policy No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		proposalPolicyNoFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Policy No')]/following::input/following::a[@name='firstFocus']"), "Proposal/Policy No Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		newButton = new PageElement(By.name("New"),"New Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		searchButton = new PageElement(By.name("Search"),"Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		clearButton = new PageElement(By.name("Clear"),"Clear Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
	//SERVICES//
	public void fillAccountingCollectionSearchDetails(AccountngCollectnSearcEntity accountngCollectnSearcEntity, CustomAssert assertReference) throws InterruptedException{
		//if(accountngCollectnSearcEntity.getAction().equalsIgnoreCase("add")){
			if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigCollectionNo")) {
				clearAndSendKeys(collectionNoTextField, accountngCollectnSearcEntity.getStringValueForField("CollectionNo"));
			}
			if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigCollectionFromDate")) {
				String collectionFromDate=RandomCodeGenerator.dateGenerator(accountngCollectnSearcEntity.getStringValueForField("CollectionFromDate"));
				clearAndEnterDate(collectionFromDateTextField, collectionFromDate);
			}
			if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigCollectionToDate")) {
				String collectionToDate=RandomCodeGenerator.dateGenerator(accountngCollectnSearcEntity.getStringValueForField("CollectionToDate"));
				clearAndEnterDate(collectionToDateTextField, collectionToDate);
			}
			if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigProposalOrPolicyNo")) {
				fillProposalPolicyNoSearch(accountngCollectnSearcEntity);
			}
		//}
	}
	public void fillProposalPolicyNoSearch(AccountngCollectnSearcEntity accountngCollectnSearcEntity) throws InterruptedException{
		clickOnproposalPolicyNoFindButton(accountngCollectnSearcEntity);

		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigProposalOrPolicyNo")) {
			clearAndSendKeys(proposalPolicyNoTextField, accountngCollectnSearcEntity.getStringValueForField("ProposalOrPolicyNo"));
		}
		click(proposalPolicyNoFindButton);
		selectproposalPolicyNo(accountngCollectnSearcEntity);
	}

	public void clickOnproposalPolicyNoFindButton(AccountngCollectnSearcEntity accountngCollectnSearcEntity) throws InterruptedException{
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigProposalPolicyNoFindButton")){
			click(proposalPolicyNoFindButton);
			switchToWindow("Quote/Policy Search");

			return;
		}
	}
	
	public void selectproposalPolicyNo(AccountngCollectnSearcEntity accountngCollectnSearcEntity) throws InterruptedException{
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigProposalOrPolicyNo")){
			proposalPolicyNoToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+accountngCollectnSearcEntity.getStringValueForField("proposalPolicyNo")+"')]"),"Proposal/PolicyNo To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(proposalPolicyNoToBeSelectedLink);
			switchToWindow();
			switchToFrame("display");
		}
	}

	public void selectCollectionNumber(AccountngCollectnSearcEntity accountngCollectnSearcEntity) throws InterruptedException{
		if(accountngCollectnSearcEntity.getBooleanValueForField("ConfigCollectionNo")){
			collectionNumberLinkField=new PageElement(By.xpath("//a[contains(text(),'"+accountngCollectnSearcEntity.getStringValueForField("CollectionNo")+"')]"),"Proposal/PolicyNo To Be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(collectionNumberLinkField);
			switchToFrame("display");
		}
	}

	
	public void navigateToCollectionCumAdjustmentPage(AccountngCollectnSearcEntity accountngCollectnSearcEntity){
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigNewButton")){
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(CollectionCumAdjustmentScreenTitlePage));
			return;
		}
	}
	public void searchFromAccountingCollectionSearchPage(AccountngCollectnSearcEntity accountngCollectnSearcEntity) {
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigSearchButton")) {
			click(searchButton);
		}
	}
	public void clearFromAccountingCollectionSearchPage(AccountngCollectnSearcEntity accountngCollectnSearcEntity) {
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigClearButton")) {
			click(clearButton);
			switchToFrame("display");
			if(isElementDisplayed(CollectionCumAdjustmentScreenTitlePage));
			return;
		}
	}
	public void backFromAccountingCollectionSearchPage(AccountngCollectnSearcEntity accountngCollectnSearcEntity) {
		if (accountngCollectnSearcEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			if(isElementDisplayed(CollectionCumAdjustmentScreenTitlePage));
			return;
		}
	}
	public void fillAndSearchFromAccountingCollectionSearchDetails(AccountngCollectnSearcEntity accountngCollectnSearcEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillAccountingCollectionSearchDetails(accountngCollectnSearcEntity, assertReference);
		navigateToCollectionCumAdjustmentPage(accountngCollectnSearcEntity);
		searchFromAccountingCollectionSearchPage(accountngCollectnSearcEntity);
		clearFromAccountingCollectionSearchPage(accountngCollectnSearcEntity);
		//backFromAccountingCollectionSearchPage(accountngCollectnSearcEntity);
	}
}














