package com.aqm.staf.library.pages.reinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MaintainPolicyRiskEntity;
import com.aqm.staf.library.databin.MaintainPolicyRiskReinsuranceEntity;
import com.aqm.staf.library.databin.RiContractEntityReinsurance;
import com.aqm.staf.library.databin.UnderSearchEntity;

public class MaintainPolicyRiskReinsurancePage extends BasePage{
	private PageElement maintainPolicyRiskTitle;
	private PageElement policyNumberTextField;
	private PageElement policyItemNumberTextField;
	private PageElement riskTypeTextField;
	private PageElement riskCategoryeTextField;
	private PageElement totalSIValueTextField;
	private PageElement totalPremiumTextField;
	private PageElement premiumPctTextField;
	private PageElement totalInstallmentPremiumTextField;
	private PageElement DiscountPctTextField;
	private PageElement TerrorismCommissionTextField;
	private PageElement TerrorismBrokerageTextField;
	private PageElement viewPolicyCessionButton;


	public MaintainPolicyRiskReinsurancePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		maintainPolicyRiskTitle = new PageElement(By.xpath("//tr//th[contains(text(),'Maintain Policy Risk')]"), "RI Contract Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberTextField = new PageElement(By.xpath("//input[@name='txtPolNo']"), "policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyItemNumberTextField = new PageElement(By.xpath("//input[@name='txtPolItemNo']"), "policy Item Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskTypeTextField = new PageElement(By.xpath("//input[@name='txtRiskTypeCode']"), "risk Type Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCategoryeTextField = new PageElement(By.xpath("//input[@name='txtRiskCategory']"), "risk Categorye", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSIValueTextField= new PageElement(By.xpath("//input[@name='txtSI']"), "total SI Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumTextField= new PageElement(By.xpath("//input[@name='txtTotalPremium']"), "total Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPctTextField= new PageElement(By.xpath("//input[@name='txtPremiumPct']"), "premium Pct", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalInstallmentPremiumTextField= new PageElement(By.xpath("//input[@name='txtAccPremium']"), "total Installment Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		DiscountPctTextField= new PageElement(By.xpath("//input[@name='txtPremiumDisPct']"), "Discount Pct", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TerrorismCommissionTextField = new PageElement(By.xpath("//input[@name='txtTerrComs']"), "Terrorism Commission", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TerrorismBrokerageTextField = new PageElement(By.xpath("//input[@name='txtTerrBrokg']"), "Terrorism Brokerage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		viewPolicyCessionButton= new PageElement(By.xpath("//input[@value=('View Policy Cession')]"), "View Policy cession", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}

	public void fillMaintainPolicyRiskDetails(MaintainPolicyRiskEntity maintainPolicyRiskReinsuranceEntity, CustomAssert assertReference) throws InterruptedException{
	//	WebDriverWait wait	=new WebDriverWait(driver, 30);;
		if(maintainPolicyRiskReinsuranceEntity.getAction().equalsIgnoreCase("add") || maintainPolicyRiskReinsuranceEntity.getAction().equalsIgnoreCase("edit")){

			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTotalSIValue")) {
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				clearAndSendKeys(totalSIValueTextField,maintainPolicyRiskReinsuranceEntity.getStringValueForField("TotalSIValue"));
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTotalPremium")) {
				clearAndSendKeys(totalPremiumTextField, maintainPolicyRiskReinsuranceEntity.getStringValueForField("TotalPremium"));
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigPremiumPct")) {
				clearAndSendKeys(premiumPctTextField, maintainPolicyRiskReinsuranceEntity.getStringValueForField("PremiumPct"));
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigDiscountPct")) {
				clearAndSendKeys(DiscountPctTextField, maintainPolicyRiskReinsuranceEntity.getStringValueForField("DiscountPct"));
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTerrorismCommission")) {
				clearAndSendKeys(TerrorismCommissionTextField, maintainPolicyRiskReinsuranceEntity.getStringValueForField("TerrorismCommission"));
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTerrorismBrokerage")) {
				clearAndSendKeys(TerrorismBrokerageTextField, maintainPolicyRiskReinsuranceEntity.getStringValueForField("TerrorismBrokerage"));
			}
		}
		else if(maintainPolicyRiskReinsuranceEntity.getAction().equalsIgnoreCase("verify")){

			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("policyNumber"), fetchValueFromTextFields(policyNumberTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigPolicyItemNumber")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("PolicyItemNumber"), fetchValueFromTextFields(policyItemNumberTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigRiskType")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("RiskType"), fetchValueFromTextFields(riskTypeTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigRiskCategorye")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("RiskCategorye"), fetchValueFromTextFields(riskCategoryeTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTotalSIValue")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("TotalSIValue"), fetchValueFromTextFields(totalSIValueTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("TotalPremium"), fetchValueFromTextFields(totalPremiumTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigPremiumPct")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("PremiumPct"), fetchValueFromTextFields(premiumPctTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigDiscountPct")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("DiscountPct"), fetchValueFromTextFields(DiscountPctTextField), AssertionType.WARNING);
			}

			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTerrorismCommission")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("TerrorismCommission"), fetchValueFromTextFields(TerrorismCommissionTextField), AssertionType.WARNING);
			}
			if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigTerrorismBrokerage")) {
				assertReference.assertEquals(maintainPolicyRiskReinsuranceEntity.getStringValueForField("TerrorismBrokerage"), fetchValueFromTextFields(TerrorismBrokerageTextField), AssertionType.WARNING);
			}
		}
	}
	public void clickOnViewPolicyCession(MaintainPolicyRiskEntity maintainPolicyRiskReinsuranceEntity) throws InterruptedException  {
		if (maintainPolicyRiskReinsuranceEntity.getBooleanValueForField("ConfigPolicyCession")){			
			click(viewPolicyCessionButton);
			switchToWindow("Tata Consultancy Services");
		}
	}
	public void fillandSubmitMaintainPolicyRiskDetails(MaintainPolicyRiskEntity maintainPolicyRiskReinsuranceEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(maintainPolicyRiskReinsuranceEntity.getConfigExecute())){
			switchToFrame("display");
			fillMaintainPolicyRiskDetails(maintainPolicyRiskReinsuranceEntity, assertReference);
			clickOnViewPolicyCession(maintainPolicyRiskReinsuranceEntity);
		}
	}	

}
