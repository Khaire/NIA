package com.aqm.staf.library.pages.reinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.CessionDetailsEntity;
import com.aqm.staf.library.databin.ProgramCreateEntity;
import com.aqm.staf.library.databin.UnderSearchEntity;

public class CessionDetailsCreatePageReinsurence extends WebPage{
	private PageElement lineofBusiness;
	private PageElement policyType;
	private PageElement si;
	private PageElement niaPercentSI;
	private PageElement cessionNo;
	private PageElement referenceType;
	private PageElement pmlOne;
	private PageElement pmlTwo;
	private PageElement riskCategory;
	private PageElement referenceNo;
	private PageElement itemNo;
	private PageElement accruedPremiumOne;
	private PageElement accruedPremiumTwo;
	//Labels
	private PageElement enProjOblShareLabel;
	private PageElement enProjNetShareLabel;
	private PageElement enProjNICShareLabel;
	private PageElement enProjOicShareLabel;
	private PageElement enProjUICShareLabel;
	private PageElement enProjFSTShareLabel;
	private PageElement enProjSSTShareLabel;
	private PageElement enProj2NetShareLabel;
	private PageElement enProjFACShareLabel;
	private PageElement enProjUNAPShareLabel;

	private PageElement enProjOblSIPMLLabel;
	private PageElement enProjNetSIPMLLabel;
	private PageElement enProjNICSIPMLLabel;
	private PageElement enProjOicSIPMLLabel;
	private PageElement enProjUICSIPMLLabel;
	private PageElement enProjFSTSIPMLLabel;
	private PageElement enProjSSTSIPMLLabel;
	private PageElement enProj2NetSIPMLLabel;
	private PageElement enProjFACSIPMLLabel;
	private PageElement enProjUNASIPMLLabel;
	
	private PageElement totalSiPmlLabel;
	private PageElement totalPremiumLabel;
	
	


	public CessionDetailsCreatePageReinsurence(WebDriver driver, String pageName) {
		super(driver, pageName);
		lineofBusiness = new PageElement(By.xpath("//label[contains(text(),'Line of Business')]//following::input[1]"),"Line of Business",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyType = new PageElement(By.xpath("//input[@name=('PolicyType')]"),"policy Type",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		si = new PageElement(By.xpath("//input[@name=('txtTotalItemSI')]"),"SI",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		niaPercentSI = new PageElement(By.xpath("//input[@name=('txtTotalSI')]"),"NIAPercentSI",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cessionNo = new PageElement(By.xpath("//input[@name=('txtCessionCode')]"),"Cession No",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		referenceType = new PageElement(By.xpath("//label[contains(text(),'Reference Type')]/following::input[1]"),"Reference Type",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pmlOne= new PageElement(By.xpath("//input[@name=('txtTotalItemPML')]"),"PML One",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pmlTwo= new PageElement(By.xpath("//input[@name=('txtTotalPML')]"),"PML Two",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCategory = new PageElement(By.xpath("//label[contains(text(),'Risk Category')]/following::input[1]"),"RiskCategory",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		referenceNo = new PageElement(By.xpath("//label[contains(text(),'Reference No.   ')]/following::input[1]"),"Reference No",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		itemNo = new PageElement(By.xpath("//label[contains(text(),'Item No.')]/following::input[3]"),"ItemNo",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accruedPremiumOne = new PageElement(By.xpath("//input[@name=('txtTotalAccPremium')]"),"AccruedPremium One",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accruedPremiumTwo = new PageElement(By.xpath("//input[@name=('txtOwnerTotalPremium')]"),"accruedPremium Two",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		enProjOblShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::input[4]"),"OBL share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjNetShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::input[23]"),"Net Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjNICShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::input[42]"),"NIC Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjOicShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[50]"),"OIC share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjUICShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::input[80]"),"UIC Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjFSTShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[82]"),"FST Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjSSTShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[98]"),"SST share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProj2NetShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[114]"),"Net Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjFACShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::input[118]"),"FAC Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjUNAPShareLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[146]"),"UNA Share",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		enProjOblSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[3]"),"OBL SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjNetSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[19]"),"Net SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjNICSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[36]"),"NIC SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjOicSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[51]"),"OIC SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjUICSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[67]"),"UIC SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjFSTSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[83]"),"FST SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjSSTSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[99]"),"SST SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProj2NetSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[115]"),"NET SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjFACSIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[131]"),"FAC SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enProjUNASIPMLLabel = new PageElement(By.xpath("//td[contains(text(),'Breakup Premium')]/following::td[147]"),"UNA SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSiPmlLabel= new PageElement(By.xpath("//td[contains(text(),'SI / PML')]/following::input[167]"),"Total SI/PML",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumLabel= new PageElement(By.xpath("//td[contains(text(),'SI / PML')]/following::input[168]"),"Total Premium",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillCessionDetails(CessionDetailsEntity cessionDetailsEntity,CustomAssert assertReference) throws InterruptedException{
		//WebDriverWait wait	=new WebDriverWait(driver,30);
		if(cessionDetailsEntity.getAction().equalsIgnoreCase("add") || cessionDetailsEntity.getAction().equalsIgnoreCase("edit")){
			if (cessionDetailsEntity.getBooleanValueForField("ConfigLineofBusiness")) {
				clearAndSendKeys(lineofBusiness, cessionDetailsEntity.getStringValueForField("LineofBusiness"));
			}	

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPolicyType")) {
				clearAndSendKeys(policyType, cessionDetailsEntity.getStringValueForField("policyType"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigSI")) {
				clearAndSendKeys(si, cessionDetailsEntity.getStringValueForField("si"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigNIAPercentSI")) {
				clearAndSendKeys(niaPercentSI, cessionDetailsEntity.getStringValueForField("niaPercentSI"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigCessionNo")) {
				clearAndSendKeys(cessionNo, cessionDetailsEntity.getStringValueForField("cessionNo"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigReferenceType")) {
				clearAndSendKeys(referenceType, cessionDetailsEntity.getStringValueForField("referenceType"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPMLOne")) {
				clearAndSendKeys(pmlOne, cessionDetailsEntity.getStringValueForField("pmlOne"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPMLTwo")) {
				clearAndSendKeys(pmlTwo, cessionDetailsEntity.getStringValueForField("pmlTwo"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigRiskCategory")) {
				clearAndSendKeys(riskCategory, cessionDetailsEntity.getStringValueForField("riskCategory"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigReferenceNo")) {
				clearAndSendKeys(referenceNo, cessionDetailsEntity.getStringValueForField("referenceNo"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigItemNo")) {
				clearAndSendKeys(itemNo, cessionDetailsEntity.getStringValueForField("itemNo"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigAccruedPremiumOne")) {
				clearAndSendKeys(accruedPremiumOne, cessionDetailsEntity.getStringValueForField("accruedPremiumOne"));
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigAccruedPremiumTwo")) {
				clearAndSendKeys(accruedPremiumTwo, cessionDetailsEntity.getStringValueForField("accruedPremiumTwo"));
			}
		}

		else if(cessionDetailsEntity.getAction().equalsIgnoreCase("verify")){
			if (cessionDetailsEntity.getBooleanValueForField("ConfigLineofBusiness")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("LineofBusiness"),fetchValueFromTextFields(lineofBusiness), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPolicyType")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("policyType"),fetchValueFromTextFields(policyType), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigSI")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("si"),fetchValueFromTextFields(si), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigNIAPercentSI")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("cessionNo"),fetchValueFromTextFields(cessionNo), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigReferenceType")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("referenceType"),fetchValueFromTextFields(referenceType), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPMLOne")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("pmlOne"),fetchValueFromTextFields(pmlOne), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigPMLTwo")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("pmlTwo"),fetchValueFromTextFields(pmlTwo), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigRiskCategory")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("riskCategory"),fetchValueFromTextFields(riskCategory), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigItemNo")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("itemNo"),fetchValueFromTextFields(itemNo), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigAccruedPremiumOne")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("accruedPremiumOne"),fetchValueFromTextFields(accruedPremiumOne), AssertionType.WARNING);
			}

			if (cessionDetailsEntity.getBooleanValueForField("ConfigAccruedPremiumTwo")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("accruedPremiumTwo"),fetchValueFromTextFields(accruedPremiumTwo), AssertionType.WARNING);
			}
			//Labels
			/*if (CessionDetailsEntity.getBooleanValueForField("ConfigEnProjOblShare")) {
				assertReference.assertEquals(CessionDetailsEntity.getStringValueForField("EnProjOblShare"),fetchValueFromFields(enProjOblShareLabel), AssertionType.WARNING);
			}*/
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjOblShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjOblShare"),fetchValueFromTextFields(enProjOblShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjNetShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjNetShare"),fetchValueFromTextFields(enProjNetShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjNICShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjNICShare"),fetchValueFromTextFields(enProjNICShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjOicShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjOicShare"),fetchValueFromTextFields(enProjOicShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjUICShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjUICShare"),fetchValueFromTextFields(enProjUICShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjFSTShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjFSTShare"),fetchValueFromTextFields(enProjFSTShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjSSTShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjSSTShare"),fetchValueFromTextFields(enProjSSTShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProj2NetShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProj2NetShare"),fetchValueFromTextFields(enProj2NetShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjFACShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjFACShare"),fetchValueFromTextFields(enProjFACShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjUNAPShare")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjUNAPShare"),fetchValueFromTextFields(enProjUNAPShareLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjOblSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjOblSIPML"),fetchValueFromTextFields(enProjOblSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjNetSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjNetSIPML"),fetchValueFromTextFields(enProjNetSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjNICSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjNICSIPML"),fetchValueFromTextFields(enProjNICSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjOicSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjOicSIPML"),fetchValueFromTextFields(enProjOicSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjUICSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjUICSIPML"),fetchValueFromTextFields(enProjUICSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjFSTSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjFSTSIPMLLabel"),fetchValueFromTextFields(enProjFSTSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjSSTSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjSSTSIPML"),fetchValueFromTextFields(enProjSSTSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProj2NetSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProj2NetSIPML"),fetchValueFromTextFields(enProj2NetSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjFACSIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjFACSIPML"),fetchValueFromTextFields(enProjFACSIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigEnProjUNASIPML")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("EnProjUNASIPML"),fetchValueFromTextFields(enProjUNASIPMLLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigSiPml")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("SiPml"),fetchValueFromTextFields(totalSiPmlLabel), AssertionType.WARNING);
			}
			if (cessionDetailsEntity.getBooleanValueForField("ConfigTotalPremium")) {
				assertReference.assertEquals(cessionDetailsEntity.getStringValueForField("TotalPremium"),fetchValueFromTextFields(totalPremiumLabel), AssertionType.WARNING);
			}

		}
	}
	public void fillandSubmitCessionDetails(CessionDetailsEntity cessionDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(cessionDetailsEntity.getConfigExecute())){	
			fillCessionDetails(cessionDetailsEntity, assertReference);

		}
	}
}













