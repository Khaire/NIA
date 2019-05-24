package com.aqm.staf.library.pages.health;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimSynopsisEntity;


public class PolicyClaimSynopsisPage extends BasePage{

	private PageElement claimSynopsisDetailsPageTitle;
	private PageElement policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement claimNumber;
	private PageElement status;
	private PageElement typeOfClaim;
	private PageElement claimEstimatedAmount;
	private PageElement claimSettledAmount;
	private PageElement recoveryAmount;
	private PageElement backButton;
	private PageElement sLNo;
	
	private PageElement totalClaimEstimatedAmount;
	private PageElement totalClaimSettledAmount;
	private PageElement totalRecoveryAmount;
	
	private PageElement grandTotalClaimEstimatedAmount;
	private PageElement grandTotalClaimSettledAmount;
	private PageElement grandTotalRecoveryAmount;

	public PolicyClaimSynopsisPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		claimSynopsisDetailsPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Synopsis')]"), "Claim Synopsis Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//form[@name='lpoDetails']//td//b[contains(text(),'Policy')]/following::font"), "Policy No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='lpoDetails']//td//b[contains(text(),'Status')]/following::font"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='lpoDetails']//td//b[contains(text(),'Policyholder')]/following::font"), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='lpoDetails']//td//b[contains(text(),'Product')]/following::font"), "Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		backButton=new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPolicyClaimSynopsisDetails(ClaimSynopsisEntity claimSynopsisEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		if(claimSynopsisEntityListData.getAction().equalsIgnoreCase("verify")){

			if (claimSynopsisEntityListData.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimSynopsisEntityListData.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNoLabel),AssertionType.WARNING);
			}
			if (claimSynopsisEntityListData.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(claimSynopsisEntityListData.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (claimSynopsisEntityListData.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(claimSynopsisEntityListData.getStringValueForField("ProductName"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (claimSynopsisEntityListData.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(claimSynopsisEntityListData.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}

			if (claimSynopsisEntityListData.getBooleanValueForField("ConfigClaimSynopsisTable")) {
				verifyClaimSynopsisTable(claimSynopsisEntityListData,assertReference, testData);
			}
			
			
		}		
	}		

	private void verifyClaimSynopsisTable(ClaimSynopsisEntity claimSynopsisEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		List<ClaimSynopsisEntity> claimSynopsisEntityList = testData.getClaimSynopsisEntity();
		if(claimSynopsisEntityListData.getParentKey().equalsIgnoreCase((claimSynopsisEntityListData).getParentKey())){
			for(ClaimSynopsisEntity claimSynopsisListData : claimSynopsisEntityList){
				if(claimSynopsisListData.getAction().equalsIgnoreCase("verify")){
					int TableRowNumber = claimSynopsisListData.getIntegerValueForField("TableRowNumber");
					int datarow =TableRowNumber+2; 

					if (claimSynopsisListData.getBooleanValueForField("ConfigSlNo")) {
						sLNo = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[1]"), "SL No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("SlNo"),fetchValueFromFields(sLNo),AssertionType.WARNING);
					}
					
					if (claimSynopsisListData.getBooleanValueForField("ConfigClaimNo")) {
						claimNumber = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[2]"), "Claim No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumber),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigStatusTable")) {
						status = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[4]"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("StatusTable"),fetchValueFromFields(status),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigTypeOfClaim")) {
						typeOfClaim = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[7]"), "TypeOfClaim", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("TypeOfClaim"),fetchValueFromFields(typeOfClaim),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigClaimEstimatedAmount")) {
						claimEstimatedAmount = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[9]"), "ClaimEstimatedAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("ClaimEstimatedAmount"),fetchValueFromFields(claimEstimatedAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigClaimSettledAmount")) {
						claimSettledAmount = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[10]"), "ClaimSettledAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("ClaimSettledAmount"),fetchValueFromFields(claimSettledAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigRecoveryAmount")) {
						recoveryAmount = new PageElement(By.xpath("//form[1]/table[2]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[11]"), "RecoveryAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("RecoveryAmount"),fetchValueFromFields(recoveryAmount),AssertionType.WARNING);
					}
					
					if (claimSynopsisEntityListData.getBooleanValueForField("ConfigTotal")) {
						verifyTotalFieldVerify(claimSynopsisEntityListData,assertReference, testData);
					}
					
					if (claimSynopsisEntityListData.getBooleanValueForField("ConfigGrandTotal")) {
						verifyGrandTotalFieldVerfiy(claimSynopsisEntityListData,assertReference, testData);
					}

				}
			}
		}
	}
	
	
	// Rasika - To verify Total Row 
	private void verifyTotalFieldVerify(ClaimSynopsisEntity claimSynopsisEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		List<ClaimSynopsisEntity> claimSynopsisEntityList = testData.getClaimSynopsisEntity();
		if(claimSynopsisEntityListData.getParentKey().equalsIgnoreCase((claimSynopsisEntityListData).getParentKey())){
			for(ClaimSynopsisEntity claimSynopsisListData : claimSynopsisEntityList){
				if(claimSynopsisListData.getAction().equalsIgnoreCase("verify")){
					//int TableRowNumber = claimSynopsisListData.getIntegerValueForField("TableRowNumber");
					//int datarow =TableRowNumber+2; 

					if (claimSynopsisListData.getBooleanValueForField("ConfigTotalClaimEstimatedAmount")) {
						totalClaimEstimatedAmount = new PageElement(By.xpath("//td/b[contains(text(),'Total')]/following::td[1]"), "TotalClaimEstimatedAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("TotalClaimEstimatedAmount"),fetchValueFromFields(totalClaimEstimatedAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigTotalClaimSettledAmount")) {
						totalClaimSettledAmount = new PageElement(By.xpath("//td/b[contains(text(),'Total')]/following::td[2]"), "TotalClaimSettledAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("TotalClaimSettledAmount"),fetchValueFromFields(totalClaimSettledAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigTotalRecoveryAmount")) {
						totalRecoveryAmount = new PageElement(By.xpath("//td/b[contains(text(),'Total')]/following::td[3]"), "TotalRecoveryAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("TotalRecoveryAmount"),fetchValueFromFields(totalRecoveryAmount),AssertionType.WARNING);
					}
				}
			}
		}
	}
	
	// ///To verify Grand Total Row 
	private void verifyGrandTotalFieldVerfiy(ClaimSynopsisEntity claimSynopsisEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		List<ClaimSynopsisEntity> claimSynopsisEntityList = testData.getClaimSynopsisEntity();
		if(claimSynopsisEntityListData.getParentKey().equalsIgnoreCase((claimSynopsisEntityListData).getParentKey())){
			for(ClaimSynopsisEntity claimSynopsisListData : claimSynopsisEntityList){
				if(claimSynopsisListData.getAction().equalsIgnoreCase("verify")){
					//int TableRowNumber = claimSynopsisListData.getIntegerValueForField("TableRowNumber");
					//int datarow =TableRowNumber+2; 

					if (claimSynopsisListData.getBooleanValueForField("ConfigGrandTotalClaimEstimatedAmount")) {
						grandTotalClaimEstimatedAmount = new PageElement(By.xpath("//td/b[contains(text(),'Grand Total')]/following::td[1]"), "GrandTotalClaimEstimatedAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("GrandTotalClaimEstimatedAmount"),fetchValueFromFields(grandTotalClaimEstimatedAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigGrandTotalClaimSettledAmount")) {
						grandTotalClaimSettledAmount = new PageElement(By.xpath("//td/b[contains(text(),'Grand Total')]/following::td[2]"), "GrandTotalClaimSettledAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("GrandTotalClaimSettledAmount"),fetchValueFromFields(grandTotalClaimSettledAmount),AssertionType.WARNING);
					}
					if (claimSynopsisListData.getBooleanValueForField("ConfigGrandTotalRecoveryAmount")) {
						grandTotalRecoveryAmount = new PageElement(By.xpath("//td/b[contains(text(),'Grand Total')]/following::td[3]"), "GrandTotalRecoveryAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
						assertReference.assertEquals(claimSynopsisListData.getStringValueForField("GrandTotalRecoveryAmount"),fetchValueFromFields(grandTotalRecoveryAmount),AssertionType.WARNING);
					}
				}
			}
		}
	}
	
	public void clickBackButton(ClaimSynopsisEntity claimSynopsisEntityListData) throws InterruptedException {
		if (claimSynopsisEntityListData.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToWindow("Integrated Insurance Management System");
		}
	}
	


	public void fillAndVerifyClaimSynopsisDetails(ClaimSynopsisEntity claimSynopsisEntityListData,CustomAssert assertReference ,ScenarioTestData testData) throws InterruptedException {
		fillPolicyClaimSynopsisDetails(claimSynopsisEntityListData, assertReference,testData);
		clickBackButton(claimSynopsisEntityListData);
	}
}
