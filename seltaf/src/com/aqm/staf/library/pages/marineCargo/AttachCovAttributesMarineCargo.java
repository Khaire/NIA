package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AttchCovAttMarineCargoEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMCargoEntity;

public class AttachCovAttributesMarineCargo extends BasePage{
	private PageElement itcAClauseApplicableDropdown;
	private PageElement saveButton;
	private PageElement forwardButton;
	private PageElement ratePercentageTextFeild;

	public AttachCovAttributesMarineCargo(WebDriver driver, String pageName) {
		super(driver, pageName);

		itcAClauseApplicableDropdown= new PageElement(By.xpath("//div[contains(text(),'ITC (A) clause applicable')]//following::select[1]"), "ITC (A) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton= new PageElement(By.xpath("//input[@name=('btnSave')]"), "Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ratePercentageTextFeild=new PageElement(By.xpath("//input[@name='propValues1']"), "Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}



	public void fillPolicyInsuredInrestAttributeTransistDetails(AttchCovAttMarineCargoEntity attachCovAttributesMarineCargoEntity, CustomAssert assertReference) throws InterruptedException{
		if((attachCovAttributesMarineCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (attachCovAttributesMarineCargoEntity.getStringValueForField("Product").equalsIgnoreCase("AN"))) {		

			if(attachCovAttributesMarineCargoEntity.getAction().equalsIgnoreCase("add") || attachCovAttributesMarineCargoEntity.getAction().equalsIgnoreCase("edit")){
				if (attachCovAttributesMarineCargoEntity.getBooleanValueForField("ConfigITCAClauseApplicable")) {
					selectValueFromList(itcAClauseApplicableDropdown, attachCovAttributesMarineCargoEntity.getStringValueForField("ITCAClauseApplicable"));
				}
				if (attachCovAttributesMarineCargoEntity.getBooleanValueForField("ConfigRatePercentage")) {
					clearAndSendKeys(ratePercentageTextFeild,attachCovAttributesMarineCargoEntity.getStringValueForField("RatePercentage"));
				}
			}
		}
	}

	public void clickOnSaveButton(AttchCovAttMarineCargoEntity attachCovAttributesMarineCargoEntity){
		if (attachCovAttributesMarineCargoEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
		}
	}
	public void clickForwardButton(AttchCovAttMarineCargoEntity attachCovAttributesMarineCargoEntity){
		if (attachCovAttributesMarineCargoEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitAttachCoverageAttrMarineCargo(AttchCovAttMarineCargoEntity attachCovAttributesMarineCargoEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(attachCovAttributesMarineCargoEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInrestAttributeTransistDetails(attachCovAttributesMarineCargoEntity, assertReference);
			clickForwardButton(attachCovAttributesMarineCargoEntity);
			clickOnSaveButton(attachCovAttributesMarineCargoEntity);
		}
	}
}