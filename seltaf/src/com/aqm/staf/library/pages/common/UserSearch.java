package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.SecurityPartyEntity;

public class UserSearch extends BasePage {
	private PageElement userSearchTitle;
	private PageElement auditTrailTitle;
	private PageElement maintainRoleLink;
	private PageElement maintainUserLink;
	private PageElement auditTrailLink;
	private PageElement maintainDataLink;
	private PageElement newOfficeCreationLink;
	private PageElement assignUserToRoleTitle;
	private PageElement helpLink;
	private PageElement userCodeTextField;
	private PageElement userNameTextField;
	private PageElement newButton;
	private PageElement serachButton;
	private PageElement clearButton;
	private PageElement backButton;

	public UserSearch(WebDriver driver, String pageName) {
		super(driver, pageName);
		userSearchTitle = new PageElement(By.xpath("//div//b[contains(text(),'User Search')]"), "User Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		userCodeTextField = new PageElement(By.xpath("//tr//td//b[contains(text(),'Code')]/following::input"), "User Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		userNameTextField = new PageElement(By.xpath("//tr//td//b[contains(text(),'Name')]/following::input"), "User Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assignUserToRoleTitle = new PageElement(By.xpath("//div//b[contains(text(),'Assign User To Role')]"), "Assign User To Role Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		auditTrailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Audit Trail')]"), "Audit Trail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainRoleLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Role')]"), "Maintain Role Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainUserLink = new PageElement(By.xpath("//tr//td//a//b[contains(text(),'User')]"), "Maintain User Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		auditTrailLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Audit Trail')]"), "Audit Trail Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maintainDataLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Maintain Data')]"), "Maintain Data Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newOfficeCreationLink = new PageElement(By.xpath("//td//a//b[contains(text(),'New Office Creation')]"), "New Office Creation Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		helpLink = new PageElement(By.xpath("//td//a//b[contains(text(),'Help')]"), "Help Link", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		serachButton=new PageElement(By.name("Search"), " Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clearButton=new PageElement(By.name("Clear"), " Clear Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), " Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}

	public void fillPartySecurityDeatail(SecurityPartyEntity securityPartyEntity){
		if(securityPartyEntity.getAction().equalsIgnoreCase("verify") || securityPartyEntity.getAction().equalsIgnoreCase("edit")){
			//PartyEntity actualPartyEntity = new PartyEntity();
			if (securityPartyEntity.getBooleanValueForField("ConfigUserCode")) {
				clearAndSendKeys(userCodeTextField, securityPartyEntity.getStringValueForField("UserCode"));
			}
			if (securityPartyEntity.getBooleanValueForField("ConfigUserName")) {
				clearAndSendKeys(userNameTextField, securityPartyEntity.getStringValueForField("UserName"));
			}
		}
	}
	public void fetchUserCode(SecurityPartyEntity securityPartyEntity) {
		String usercode=new String();
		usercode=fetchValueFromTextFields(userCodeTextField);
		securityPartyEntity.setStringValueForField("UserCode", usercode);
	}
	public void navigateToUserSearchPage(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigSecurityPage")) {
			navigateToSecurityPage();
			switchToFrame("display");
			/*if(isElementDisplayed(userSearchTitle));*/
			return;
		}
	}
	public void navigateToAssignUserToRole(SecurityPartyEntity securityPartyEntity) {
		if (securityPartyEntity.getBooleanValueForField("ConfigMaintainUser")) {
			switchToFrame("Control");
			click(maintainUserLink);
			switchToFrame("display");
			click(newButton);
			switchToFrame("display");
			if(isElementDisplayed(assignUserToRoleTitle));
			return;
		}
	}
	public void navigateToMaintainRoleLink() {
		click(maintainRoleLink);
		switchToFrame("display");
		//if(isElementDisplayed(assignUserToRoleTitle));
		return;
	}
	public void navigateToMaintainUserLink() {
		click(maintainUserLink);
		switchToFrame("display");
		if(isElementDisplayed(userSearchTitle));
		return;
	}
	public void navigateToAuditTrailLink() {
		click(auditTrailLink);
		switchToFrame("display");
		if(isElementDisplayed(auditTrailTitle));
		return;
	}
	public void navigateMaintainDataLink() {
		click(maintainDataLink);
		switchToFrame("display");
		//if(isElementDisplayed(auditTrailTitle));
		return;
	}
	public void navigateNewOfficeCreationLink() {
		click(newOfficeCreationLink);
		switchToFrame("display");
		//if(isElementDisplayed(auditTrailTitle));
		return;
	}
	public void navigateHelpLink() {
		click(helpLink);
		switchToFrame("display");
		//if(isElementDisplayed(auditTrailTitle));
		return;
	}
	public void clickSearch() {
		click(serachButton);
	}
	
	public void selectSearchSuperuserPartyCode(SecurityPartyEntity securityPartyEntity){
		if (securityPartyEntity.getBooleanValueForField("ConfigSearchUserCode")){
			String userCode = securityPartyEntity.getStringValueForField("UserCode");
			PageElement userCodeLinkTextField = new PageElement(By.linkText(userCode), "User Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(userCodeLinkTextField);
			switchToFrame("display");
		}
	}
	public void fillAndSearchSecurityDetails(SecurityPartyEntity securityPartyEntity)  {
		fillPartySecurityDeatail(securityPartyEntity);
		clickSearch();
	}
}
