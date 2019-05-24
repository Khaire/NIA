package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimMemberT1T2CLRAttEntity;
import com.aqm.staf.library.databin.ClaimReservePageEntity;

public class ClaimReserveSummaryPage extends BasePage {
	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;

	private PageElement claimReseveDeatailTitle;
	private PageElement claimTabTitle;
	private PageElement memberTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement claimNumberLabel;	
	private PageElement policyNumberLabel;	
	private PageElement claimDateLabel;	
	private PageElement claimStatusLabel;	
	private PageElement productCodeLabel;	
	private PageElement causeOfLossLabel;
	private PageElement newButton;
	private PageElement backButton;
	private PageElement reserveTypeTextField;
	private PageElement reserveAmountTextField;
	private PageElement reserveTypeForSecondRowTextFeild;
	private PageElement reserveAmountForSecondRowTextFeild;
	private PageElement reserveTypeForThirdRowTextFeild;
	private PageElement reserveAmountForThirdRowTextFeild;
	
	private PageElement paidAmountTextField;
	private PageElement pendingAmountTextField;

	public ClaimReserveSummaryPage(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimReseveDeatailTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "MemberDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Claim")), "Claim Number Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Policy")), "Policy Number Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Date")), "Claim Date Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Status")), "Claim Status Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Product Code")), "Product Code Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel= new PageElement(By.xpath(genericLocatorforLabel("S0530", "Cause Of Loss")), "Cause Of Loss Label ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		newButton=new PageElement(By.name("New"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		reserveTypeForSecondRowTextFeild = new PageElement(By.xpath("//form[@name='S0530']//div//table//tbody//tr//td[contains(text(),'2')] /following::td/following::td/following::td[2]"), "Reserve Type For EXP TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveAmountForSecondRowTextFeild = new PageElement(By.xpath("//form[@name='S0530']//div//table//tbody//tr//td[contains(text(),'2')] /following::td/following::td/following::td[2]/following::td"), "Reserve Type For Exp TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTypeForThirdRowTextFeild = new PageElement(By.xpath("//form[@name='S0530']//div//table//tbody//tr//td[contains(text(),'2')] /following::td/following::td/following::td[2]"), "Reserve Type For EXP TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveAmountForThirdRowTextFeild = new PageElement(By.xpath("//form[@name='S0530']//div//table//tbody//tr//td[contains(text(),'2')] /following::td/following::td/following::td[2]/following::td"), "Reserve Type For Exp TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//2 table present

	}
	public void fillAndVerifyClaimReserveDetails(ClaimReservePageEntity claimReservePageEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimReservePageEntity.getAction().equalsIgnoreCase("verify")){
			if (claimReservePageEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ClaimNumber"),fetchValueFromFields(claimNumberLabel) , AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("Status"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveTypeFunction")) {
				int tableRowNumber=claimReservePageEntity.getIntegerValueForField("TableRowNumber");
				reserveTypeTextField=new PageElement(By.xpath("//td//b[contains(text(),'Reserve Type')]/following::tr["+tableRowNumber+"]/td[2]"), "Reserve Type Function", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveTypeFunction"), fetchValueFromFields(reserveTypeTextField),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveAmount")) {
				int tableRowNumber=claimReservePageEntity.getIntegerValueForField("TableRowNumber");
				reserveAmountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Reserve Type')]/following::tr["+tableRowNumber+"]/td[3]"), "Reserve Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveAmount"),fetchValueFromFields(reserveAmountTextField),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigPaidAmount")) {

				int tableRowNumber=claimReservePageEntity.getIntegerValueForField("TableRowNumber");
				paidAmountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Reserve Type')]/following::tr["+tableRowNumber+"]/td[4]"), "Paid Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("PaidAmount"),fetchValueFromFields(paidAmountTextField),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigPendingAmount")) {
				int tableRowNumber=claimReservePageEntity.getIntegerValueForField("TableRowNumber");
				paidAmountTextField=new PageElement(By.xpath("//td//b[contains(text(),'Reserve Type')]/following::tr["+tableRowNumber+"]/td[5]"), "Pending Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("PendingAmount"),fetchValueFromFields(paidAmountTextField),AssertionType.WARNING);
			}
			/*	if (claimReservePageEntity.getBooleanValueForField("ConfigReserveTypeFunctionForSecondRow")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveTypeFunctionForSecondRow"),fetchValueFromFields(reserveTypeForSecondRowTextFeild),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveAmountForSecondRow")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveAmountForSecondRow"),fetchValueFromFields(reserveAmountForSecondRowTextFeild),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveTypeFunctionThirdRow")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveTypeFunctionThirdRow"), fetchValueFromFields(reserveTypeForThirdRowTextFeild),AssertionType.WARNING);
			}
			if (claimReservePageEntity.getBooleanValueForField("ConfigReserveAmountThirdRow")) {
				assertReference.assertEquals(claimReservePageEntity.getStringValueForField("ReserveAmountThirdRow"),fetchValueFromFields(reserveAmountForThirdRowTextFeild) ,AssertionType.WARNING);
			}*/
		}

	}

	public void createNewReservePage(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigNewButton")){		
			click(newButton);
			switchToFrame("display");
			isElementDisplayed(claimReseveDeatailTitle);
		}
	}

	public void navigateToclaimHomePage(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigClaim")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigMember")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToDocument(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigDocument")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigParties")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigReserve")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigPayment")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimReservePageEntity claimReservePageEntity){
		if (claimReservePageEntity.getBooleanValueForField("ConfigAttribute")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}

	public void fillAndSubmitClaimReserveSummaryDetails(ClaimReservePageEntity claimReservePageEntity, CustomAssert assertReference) throws InterruptedException{
		if (isConfigTrue(claimReservePageEntity.getConfigExecute())){
			fillAndVerifyClaimReserveDetails(claimReservePageEntity, assertReference);
			createNewReservePage(claimReservePageEntity);
			navigateToclaimHomePage(claimReservePageEntity);
			navigateToMember(claimReservePageEntity);
			navigateToDocument(claimReservePageEntity);
			navigateToParties(claimReservePageEntity);
			navigateToReserve(claimReservePageEntity);
			navigateToPayment(claimReservePageEntity);
			navigateToAttribute(claimReservePageEntity);
		}
	}
}